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

// v701: Driver Auto Detect701
internal fun PlayerActivity.showV701DriverAutoDetect701Toggle() {
    val current = BiliClient.prefs.v701driverAutoDetect701
    BiliClient.prefs.v701driverAutoDetect701 = !current
    AppToast.show(this, "Driver Auto Detect701: ${if (!current) "ON" else "OFF"}")
}

// v701: Drop Auto Shadow701
internal fun PlayerActivity.showV701DropAutoShadow701Toggle() {
    val current = BiliClient.prefs.v701dropAutoShadow701
    BiliClient.prefs.v701dropAutoShadow701 = !current
    AppToast.show(this, "Drop Auto Shadow701: ${if (!current) "ON" else "OFF"}")
}

// v701: Dry Run Mode701
internal fun PlayerActivity.showV701DryRunMode701Toggle() {
    val current = BiliClient.prefs.v701dryRunMode701
    BiliClient.prefs.v701dryRunMode701 = !current
    AppToast.show(this, "Dry Run Mode701: ${if (!current) "ON" else "OFF"}")
}

// v701: Dump Auto Export701
internal fun PlayerActivity.showV701DumpAutoExport701Toggle() {
    val current = BiliClient.prefs.v701dumpAutoExport701
    BiliClient.prefs.v701dumpAutoExport701 = !current
    AppToast.show(this, "Dump Auto Export701: ${if (!current) "ON" else "OFF"}")
}

// v701: Duplicate Auto Remove701
internal fun PlayerActivity.showV701DuplicateAutoRemove701Toggle() {
    val current = BiliClient.prefs.v701duplicateAutoRemove701
    BiliClient.prefs.v701duplicateAutoRemove701 = !current
    AppToast.show(this, "Duplicate Auto Remove701: ${if (!current) "ON" else "OFF"}")
}

// v701: Duration Auto Limit701
internal fun PlayerActivity.showV701DurationAutoLimit701Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v701durationAutoLimit701).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit701",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v701durationAutoLimit701 = value
        AppToast.show(this, "Duration Auto Limit701: $value")
    }
}

// v701: Dynamic Auto Range701
internal fun PlayerActivity.showV701DynamicAutoRange701Toggle() {
    val current = BiliClient.prefs.v701dynamicAutoRange701
    BiliClient.prefs.v701dynamicAutoRange701 = !current
    AppToast.show(this, "Dynamic Auto Range701: ${if (!current) "ON" else "OFF"}")
}

// v701: Echo Auto Feedback701
internal fun PlayerActivity.showV701EchoAutoFeedback701Toggle() {
    val current = BiliClient.prefs.v701echoAutoFeedback701
    BiliClient.prefs.v701echoAutoFeedback701 = !current
    AppToast.show(this, "Echo Auto Feedback701: ${if (!current) "ON" else "OFF"}")
}

// v701: Edge Auto Detect701
internal fun PlayerActivity.showV701EdgeAutoDetect701Toggle() {
    val current = BiliClient.prefs.v701edgeAutoDetect701
    BiliClient.prefs.v701edgeAutoDetect701 = !current
    AppToast.show(this, "Edge Auto Detect701: ${if (!current) "ON" else "OFF"}")
}

// v701: Edit Auto Save701
internal fun PlayerActivity.showV701EditAutoSave701Toggle() {
    val current = BiliClient.prefs.v701editAutoSave701
    BiliClient.prefs.v701editAutoSave701 = !current
    AppToast.show(this, "Edit Auto Save701: ${if (!current) "ON" else "OFF"}")
}

// v701: Effect Auto Apply701
internal fun PlayerActivity.showV701EffectAutoApply701Toggle() {
    val current = BiliClient.prefs.v701effectAutoApply701
    BiliClient.prefs.v701effectAutoApply701 = !current
    AppToast.show(this, "Effect Auto Apply701: ${if (!current) "ON" else "OFF"}")
}

// v701: Element Auto Focus701
internal fun PlayerActivity.showV701ElementAutoFocus701Toggle() {
    val current = BiliClient.prefs.v701elementAutoFocus701
    BiliClient.prefs.v701elementAutoFocus701 = !current
    AppToast.show(this, "Element Auto Focus701: ${if (!current) "ON" else "OFF"}")
}

// v701: Emit Auto Event701
internal fun PlayerActivity.showV701EmitAutoEvent701Toggle() {
    val current = BiliClient.prefs.v701emitAutoEvent701
    BiliClient.prefs.v701emitAutoEvent701 = !current
    AppToast.show(this, "Emit Auto Event701: ${if (!current) "ON" else "OFF"}")
}

// v701: Empty Auto Placeholder701
internal fun PlayerActivity.showV701EmptyAutoPlaceholder701Toggle() {
    val current = BiliClient.prefs.v701emptyAutoPlaceholder701
    BiliClient.prefs.v701emptyAutoPlaceholder701 = !current
    AppToast.show(this, "Empty Auto Placeholder701: ${if (!current) "ON" else "OFF"}")
}

// v701: Enable Auto Feature701
internal fun PlayerActivity.showV701EnableAutoFeature701Toggle() {
    val current = BiliClient.prefs.v701enableAutoFeature701
    BiliClient.prefs.v701enableAutoFeature701 = !current
    AppToast.show(this, "Enable Auto Feature701: ${if (!current) "ON" else "OFF"}")
}

// v702: Driver Auto Detect702
internal fun PlayerActivity.showV702DriverAutoDetect702Toggle() {
    val current = BiliClient.prefs.v702driverAutoDetect702
    BiliClient.prefs.v702driverAutoDetect702 = !current
    AppToast.show(this, "Driver Auto Detect702: ${if (!current) "ON" else "OFF"}")
}

// v702: Drop Auto Shadow702
internal fun PlayerActivity.showV702DropAutoShadow702Toggle() {
    val current = BiliClient.prefs.v702dropAutoShadow702
    BiliClient.prefs.v702dropAutoShadow702 = !current
    AppToast.show(this, "Drop Auto Shadow702: ${if (!current) "ON" else "OFF"}")
}

// v702: Dry Run Mode702
internal fun PlayerActivity.showV702DryRunMode702Toggle() {
    val current = BiliClient.prefs.v702dryRunMode702
    BiliClient.prefs.v702dryRunMode702 = !current
    AppToast.show(this, "Dry Run Mode702: ${if (!current) "ON" else "OFF"}")
}

// v702: Dump Auto Export702
internal fun PlayerActivity.showV702DumpAutoExport702Toggle() {
    val current = BiliClient.prefs.v702dumpAutoExport702
    BiliClient.prefs.v702dumpAutoExport702 = !current
    AppToast.show(this, "Dump Auto Export702: ${if (!current) "ON" else "OFF"}")
}

// v702: Duplicate Auto Remove702
internal fun PlayerActivity.showV702DuplicateAutoRemove702Toggle() {
    val current = BiliClient.prefs.v702duplicateAutoRemove702
    BiliClient.prefs.v702duplicateAutoRemove702 = !current
    AppToast.show(this, "Duplicate Auto Remove702: ${if (!current) "ON" else "OFF"}")
}

// v702: Duration Auto Limit702
internal fun PlayerActivity.showV702DurationAutoLimit702Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v702durationAutoLimit702).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit702",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v702durationAutoLimit702 = value
        AppToast.show(this, "Duration Auto Limit702: $value")
    }
}

// v702: Dynamic Auto Range702
internal fun PlayerActivity.showV702DynamicAutoRange702Toggle() {
    val current = BiliClient.prefs.v702dynamicAutoRange702
    BiliClient.prefs.v702dynamicAutoRange702 = !current
    AppToast.show(this, "Dynamic Auto Range702: ${if (!current) "ON" else "OFF"}")
}

// v702: Echo Auto Feedback702
internal fun PlayerActivity.showV702EchoAutoFeedback702Toggle() {
    val current = BiliClient.prefs.v702echoAutoFeedback702
    BiliClient.prefs.v702echoAutoFeedback702 = !current
    AppToast.show(this, "Echo Auto Feedback702: ${if (!current) "ON" else "OFF"}")
}

// v702: Edge Auto Detect702
internal fun PlayerActivity.showV702EdgeAutoDetect702Toggle() {
    val current = BiliClient.prefs.v702edgeAutoDetect702
    BiliClient.prefs.v702edgeAutoDetect702 = !current
    AppToast.show(this, "Edge Auto Detect702: ${if (!current) "ON" else "OFF"}")
}

// v702: Edit Auto Save702
internal fun PlayerActivity.showV702EditAutoSave702Toggle() {
    val current = BiliClient.prefs.v702editAutoSave702
    BiliClient.prefs.v702editAutoSave702 = !current
    AppToast.show(this, "Edit Auto Save702: ${if (!current) "ON" else "OFF"}")
}

// v702: Effect Auto Apply702
internal fun PlayerActivity.showV702EffectAutoApply702Toggle() {
    val current = BiliClient.prefs.v702effectAutoApply702
    BiliClient.prefs.v702effectAutoApply702 = !current
    AppToast.show(this, "Effect Auto Apply702: ${if (!current) "ON" else "OFF"}")
}

// v702: Element Auto Focus702
internal fun PlayerActivity.showV702ElementAutoFocus702Toggle() {
    val current = BiliClient.prefs.v702elementAutoFocus702
    BiliClient.prefs.v702elementAutoFocus702 = !current
    AppToast.show(this, "Element Auto Focus702: ${if (!current) "ON" else "OFF"}")
}

// v702: Emit Auto Event702
internal fun PlayerActivity.showV702EmitAutoEvent702Toggle() {
    val current = BiliClient.prefs.v702emitAutoEvent702
    BiliClient.prefs.v702emitAutoEvent702 = !current
    AppToast.show(this, "Emit Auto Event702: ${if (!current) "ON" else "OFF"}")
}

// v702: Empty Auto Placeholder702
internal fun PlayerActivity.showV702EmptyAutoPlaceholder702Toggle() {
    val current = BiliClient.prefs.v702emptyAutoPlaceholder702
    BiliClient.prefs.v702emptyAutoPlaceholder702 = !current
    AppToast.show(this, "Empty Auto Placeholder702: ${if (!current) "ON" else "OFF"}")
}

// v702: Enable Auto Feature702
internal fun PlayerActivity.showV702EnableAutoFeature702Toggle() {
    val current = BiliClient.prefs.v702enableAutoFeature702
    BiliClient.prefs.v702enableAutoFeature702 = !current
    AppToast.show(this, "Enable Auto Feature702: ${if (!current) "ON" else "OFF"}")
}

// v703: Driver Auto Detect703
internal fun PlayerActivity.showV703DriverAutoDetect703Toggle() {
    val current = BiliClient.prefs.v703driverAutoDetect703
    BiliClient.prefs.v703driverAutoDetect703 = !current
    AppToast.show(this, "Driver Auto Detect703: ${if (!current) "ON" else "OFF"}")
}

// v703: Drop Auto Shadow703
internal fun PlayerActivity.showV703DropAutoShadow703Toggle() {
    val current = BiliClient.prefs.v703dropAutoShadow703
    BiliClient.prefs.v703dropAutoShadow703 = !current
    AppToast.show(this, "Drop Auto Shadow703: ${if (!current) "ON" else "OFF"}")
}

// v703: Dry Run Mode703
internal fun PlayerActivity.showV703DryRunMode703Toggle() {
    val current = BiliClient.prefs.v703dryRunMode703
    BiliClient.prefs.v703dryRunMode703 = !current
    AppToast.show(this, "Dry Run Mode703: ${if (!current) "ON" else "OFF"}")
}

// v703: Dump Auto Export703
internal fun PlayerActivity.showV703DumpAutoExport703Toggle() {
    val current = BiliClient.prefs.v703dumpAutoExport703
    BiliClient.prefs.v703dumpAutoExport703 = !current
    AppToast.show(this, "Dump Auto Export703: ${if (!current) "ON" else "OFF"}")
}

// v703: Duplicate Auto Remove703
internal fun PlayerActivity.showV703DuplicateAutoRemove703Toggle() {
    val current = BiliClient.prefs.v703duplicateAutoRemove703
    BiliClient.prefs.v703duplicateAutoRemove703 = !current
    AppToast.show(this, "Duplicate Auto Remove703: ${if (!current) "ON" else "OFF"}")
}

// v703: Duration Auto Limit703
internal fun PlayerActivity.showV703DurationAutoLimit703Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v703durationAutoLimit703).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit703",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v703durationAutoLimit703 = value
        AppToast.show(this, "Duration Auto Limit703: $value")
    }
}

// v703: Dynamic Auto Range703
internal fun PlayerActivity.showV703DynamicAutoRange703Toggle() {
    val current = BiliClient.prefs.v703dynamicAutoRange703
    BiliClient.prefs.v703dynamicAutoRange703 = !current
    AppToast.show(this, "Dynamic Auto Range703: ${if (!current) "ON" else "OFF"}")
}

// v703: Echo Auto Feedback703
internal fun PlayerActivity.showV703EchoAutoFeedback703Toggle() {
    val current = BiliClient.prefs.v703echoAutoFeedback703
    BiliClient.prefs.v703echoAutoFeedback703 = !current
    AppToast.show(this, "Echo Auto Feedback703: ${if (!current) "ON" else "OFF"}")
}

// v703: Edge Auto Detect703
internal fun PlayerActivity.showV703EdgeAutoDetect703Toggle() {
    val current = BiliClient.prefs.v703edgeAutoDetect703
    BiliClient.prefs.v703edgeAutoDetect703 = !current
    AppToast.show(this, "Edge Auto Detect703: ${if (!current) "ON" else "OFF"}")
}

// v703: Edit Auto Save703
internal fun PlayerActivity.showV703EditAutoSave703Toggle() {
    val current = BiliClient.prefs.v703editAutoSave703
    BiliClient.prefs.v703editAutoSave703 = !current
    AppToast.show(this, "Edit Auto Save703: ${if (!current) "ON" else "OFF"}")
}

// v703: Effect Auto Apply703
internal fun PlayerActivity.showV703EffectAutoApply703Toggle() {
    val current = BiliClient.prefs.v703effectAutoApply703
    BiliClient.prefs.v703effectAutoApply703 = !current
    AppToast.show(this, "Effect Auto Apply703: ${if (!current) "ON" else "OFF"}")
}

// v703: Element Auto Focus703
internal fun PlayerActivity.showV703ElementAutoFocus703Toggle() {
    val current = BiliClient.prefs.v703elementAutoFocus703
    BiliClient.prefs.v703elementAutoFocus703 = !current
    AppToast.show(this, "Element Auto Focus703: ${if (!current) "ON" else "OFF"}")
}

// v703: Emit Auto Event703
internal fun PlayerActivity.showV703EmitAutoEvent703Toggle() {
    val current = BiliClient.prefs.v703emitAutoEvent703
    BiliClient.prefs.v703emitAutoEvent703 = !current
    AppToast.show(this, "Emit Auto Event703: ${if (!current) "ON" else "OFF"}")
}

// v703: Empty Auto Placeholder703
internal fun PlayerActivity.showV703EmptyAutoPlaceholder703Toggle() {
    val current = BiliClient.prefs.v703emptyAutoPlaceholder703
    BiliClient.prefs.v703emptyAutoPlaceholder703 = !current
    AppToast.show(this, "Empty Auto Placeholder703: ${if (!current) "ON" else "OFF"}")
}

// v703: Enable Auto Feature703
internal fun PlayerActivity.showV703EnableAutoFeature703Toggle() {
    val current = BiliClient.prefs.v703enableAutoFeature703
    BiliClient.prefs.v703enableAutoFeature703 = !current
    AppToast.show(this, "Enable Auto Feature703: ${if (!current) "ON" else "OFF"}")
}

// v704: Driver Auto Detect704
internal fun PlayerActivity.showV704DriverAutoDetect704Toggle() {
    val current = BiliClient.prefs.v704driverAutoDetect704
    BiliClient.prefs.v704driverAutoDetect704 = !current
    AppToast.show(this, "Driver Auto Detect704: ${if (!current) "ON" else "OFF"}")
}

// v704: Drop Auto Shadow704
internal fun PlayerActivity.showV704DropAutoShadow704Toggle() {
    val current = BiliClient.prefs.v704dropAutoShadow704
    BiliClient.prefs.v704dropAutoShadow704 = !current
    AppToast.show(this, "Drop Auto Shadow704: ${if (!current) "ON" else "OFF"}")
}

// v704: Dry Run Mode704
internal fun PlayerActivity.showV704DryRunMode704Toggle() {
    val current = BiliClient.prefs.v704dryRunMode704
    BiliClient.prefs.v704dryRunMode704 = !current
    AppToast.show(this, "Dry Run Mode704: ${if (!current) "ON" else "OFF"}")
}

// v704: Dump Auto Export704
internal fun PlayerActivity.showV704DumpAutoExport704Toggle() {
    val current = BiliClient.prefs.v704dumpAutoExport704
    BiliClient.prefs.v704dumpAutoExport704 = !current
    AppToast.show(this, "Dump Auto Export704: ${if (!current) "ON" else "OFF"}")
}

// v704: Duplicate Auto Remove704
internal fun PlayerActivity.showV704DuplicateAutoRemove704Toggle() {
    val current = BiliClient.prefs.v704duplicateAutoRemove704
    BiliClient.prefs.v704duplicateAutoRemove704 = !current
    AppToast.show(this, "Duplicate Auto Remove704: ${if (!current) "ON" else "OFF"}")
}

// v704: Duration Auto Limit704
internal fun PlayerActivity.showV704DurationAutoLimit704Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v704durationAutoLimit704).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit704",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v704durationAutoLimit704 = value
        AppToast.show(this, "Duration Auto Limit704: $value")
    }
}

// v704: Dynamic Auto Range704
internal fun PlayerActivity.showV704DynamicAutoRange704Toggle() {
    val current = BiliClient.prefs.v704dynamicAutoRange704
    BiliClient.prefs.v704dynamicAutoRange704 = !current
    AppToast.show(this, "Dynamic Auto Range704: ${if (!current) "ON" else "OFF"}")
}

// v704: Echo Auto Feedback704
internal fun PlayerActivity.showV704EchoAutoFeedback704Toggle() {
    val current = BiliClient.prefs.v704echoAutoFeedback704
    BiliClient.prefs.v704echoAutoFeedback704 = !current
    AppToast.show(this, "Echo Auto Feedback704: ${if (!current) "ON" else "OFF"}")
}

// v704: Edge Auto Detect704
internal fun PlayerActivity.showV704EdgeAutoDetect704Toggle() {
    val current = BiliClient.prefs.v704edgeAutoDetect704
    BiliClient.prefs.v704edgeAutoDetect704 = !current
    AppToast.show(this, "Edge Auto Detect704: ${if (!current) "ON" else "OFF"}")
}

// v704: Edit Auto Save704
internal fun PlayerActivity.showV704EditAutoSave704Toggle() {
    val current = BiliClient.prefs.v704editAutoSave704
    BiliClient.prefs.v704editAutoSave704 = !current
    AppToast.show(this, "Edit Auto Save704: ${if (!current) "ON" else "OFF"}")
}

// v704: Effect Auto Apply704
internal fun PlayerActivity.showV704EffectAutoApply704Toggle() {
    val current = BiliClient.prefs.v704effectAutoApply704
    BiliClient.prefs.v704effectAutoApply704 = !current
    AppToast.show(this, "Effect Auto Apply704: ${if (!current) "ON" else "OFF"}")
}

// v704: Element Auto Focus704
internal fun PlayerActivity.showV704ElementAutoFocus704Toggle() {
    val current = BiliClient.prefs.v704elementAutoFocus704
    BiliClient.prefs.v704elementAutoFocus704 = !current
    AppToast.show(this, "Element Auto Focus704: ${if (!current) "ON" else "OFF"}")
}

// v704: Emit Auto Event704
internal fun PlayerActivity.showV704EmitAutoEvent704Toggle() {
    val current = BiliClient.prefs.v704emitAutoEvent704
    BiliClient.prefs.v704emitAutoEvent704 = !current
    AppToast.show(this, "Emit Auto Event704: ${if (!current) "ON" else "OFF"}")
}

// v704: Empty Auto Placeholder704
internal fun PlayerActivity.showV704EmptyAutoPlaceholder704Toggle() {
    val current = BiliClient.prefs.v704emptyAutoPlaceholder704
    BiliClient.prefs.v704emptyAutoPlaceholder704 = !current
    AppToast.show(this, "Empty Auto Placeholder704: ${if (!current) "ON" else "OFF"}")
}

// v704: Enable Auto Feature704
internal fun PlayerActivity.showV704EnableAutoFeature704Toggle() {
    val current = BiliClient.prefs.v704enableAutoFeature704
    BiliClient.prefs.v704enableAutoFeature704 = !current
    AppToast.show(this, "Enable Auto Feature704: ${if (!current) "ON" else "OFF"}")
}

// v705: Driver Auto Detect705
internal fun PlayerActivity.showV705DriverAutoDetect705Toggle() {
    val current = BiliClient.prefs.v705driverAutoDetect705
    BiliClient.prefs.v705driverAutoDetect705 = !current
    AppToast.show(this, "Driver Auto Detect705: ${if (!current) "ON" else "OFF"}")
}

// v705: Drop Auto Shadow705
internal fun PlayerActivity.showV705DropAutoShadow705Toggle() {
    val current = BiliClient.prefs.v705dropAutoShadow705
    BiliClient.prefs.v705dropAutoShadow705 = !current
    AppToast.show(this, "Drop Auto Shadow705: ${if (!current) "ON" else "OFF"}")
}

// v705: Dry Run Mode705
internal fun PlayerActivity.showV705DryRunMode705Toggle() {
    val current = BiliClient.prefs.v705dryRunMode705
    BiliClient.prefs.v705dryRunMode705 = !current
    AppToast.show(this, "Dry Run Mode705: ${if (!current) "ON" else "OFF"}")
}

// v705: Dump Auto Export705
internal fun PlayerActivity.showV705DumpAutoExport705Toggle() {
    val current = BiliClient.prefs.v705dumpAutoExport705
    BiliClient.prefs.v705dumpAutoExport705 = !current
    AppToast.show(this, "Dump Auto Export705: ${if (!current) "ON" else "OFF"}")
}

// v705: Duplicate Auto Remove705
internal fun PlayerActivity.showV705DuplicateAutoRemove705Toggle() {
    val current = BiliClient.prefs.v705duplicateAutoRemove705
    BiliClient.prefs.v705duplicateAutoRemove705 = !current
    AppToast.show(this, "Duplicate Auto Remove705: ${if (!current) "ON" else "OFF"}")
}

// v705: Duration Auto Limit705
internal fun PlayerActivity.showV705DurationAutoLimit705Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v705durationAutoLimit705).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit705",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v705durationAutoLimit705 = value
        AppToast.show(this, "Duration Auto Limit705: $value")
    }
}

// v705: Dynamic Auto Range705
internal fun PlayerActivity.showV705DynamicAutoRange705Toggle() {
    val current = BiliClient.prefs.v705dynamicAutoRange705
    BiliClient.prefs.v705dynamicAutoRange705 = !current
    AppToast.show(this, "Dynamic Auto Range705: ${if (!current) "ON" else "OFF"}")
}

// v705: Echo Auto Feedback705
internal fun PlayerActivity.showV705EchoAutoFeedback705Toggle() {
    val current = BiliClient.prefs.v705echoAutoFeedback705
    BiliClient.prefs.v705echoAutoFeedback705 = !current
    AppToast.show(this, "Echo Auto Feedback705: ${if (!current) "ON" else "OFF"}")
}

// v705: Edge Auto Detect705
internal fun PlayerActivity.showV705EdgeAutoDetect705Toggle() {
    val current = BiliClient.prefs.v705edgeAutoDetect705
    BiliClient.prefs.v705edgeAutoDetect705 = !current
    AppToast.show(this, "Edge Auto Detect705: ${if (!current) "ON" else "OFF"}")
}

// v705: Edit Auto Save705
internal fun PlayerActivity.showV705EditAutoSave705Toggle() {
    val current = BiliClient.prefs.v705editAutoSave705
    BiliClient.prefs.v705editAutoSave705 = !current
    AppToast.show(this, "Edit Auto Save705: ${if (!current) "ON" else "OFF"}")
}

// v705: Effect Auto Apply705
internal fun PlayerActivity.showV705EffectAutoApply705Toggle() {
    val current = BiliClient.prefs.v705effectAutoApply705
    BiliClient.prefs.v705effectAutoApply705 = !current
    AppToast.show(this, "Effect Auto Apply705: ${if (!current) "ON" else "OFF"}")
}

// v705: Element Auto Focus705
internal fun PlayerActivity.showV705ElementAutoFocus705Toggle() {
    val current = BiliClient.prefs.v705elementAutoFocus705
    BiliClient.prefs.v705elementAutoFocus705 = !current
    AppToast.show(this, "Element Auto Focus705: ${if (!current) "ON" else "OFF"}")
}

// v705: Emit Auto Event705
internal fun PlayerActivity.showV705EmitAutoEvent705Toggle() {
    val current = BiliClient.prefs.v705emitAutoEvent705
    BiliClient.prefs.v705emitAutoEvent705 = !current
    AppToast.show(this, "Emit Auto Event705: ${if (!current) "ON" else "OFF"}")
}

// v705: Empty Auto Placeholder705
internal fun PlayerActivity.showV705EmptyAutoPlaceholder705Toggle() {
    val current = BiliClient.prefs.v705emptyAutoPlaceholder705
    BiliClient.prefs.v705emptyAutoPlaceholder705 = !current
    AppToast.show(this, "Empty Auto Placeholder705: ${if (!current) "ON" else "OFF"}")
}

// v705: Enable Auto Feature705
internal fun PlayerActivity.showV705EnableAutoFeature705Toggle() {
    val current = BiliClient.prefs.v705enableAutoFeature705
    BiliClient.prefs.v705enableAutoFeature705 = !current
    AppToast.show(this, "Enable Auto Feature705: ${if (!current) "ON" else "OFF"}")
}

// v706: Driver Auto Detect706
internal fun PlayerActivity.showV706DriverAutoDetect706Toggle() {
    val current = BiliClient.prefs.v706driverAutoDetect706
    BiliClient.prefs.v706driverAutoDetect706 = !current
    AppToast.show(this, "Driver Auto Detect706: ${if (!current) "ON" else "OFF"}")
}

// v706: Drop Auto Shadow706
internal fun PlayerActivity.showV706DropAutoShadow706Toggle() {
    val current = BiliClient.prefs.v706dropAutoShadow706
    BiliClient.prefs.v706dropAutoShadow706 = !current
    AppToast.show(this, "Drop Auto Shadow706: ${if (!current) "ON" else "OFF"}")
}

// v706: Dry Run Mode706
internal fun PlayerActivity.showV706DryRunMode706Toggle() {
    val current = BiliClient.prefs.v706dryRunMode706
    BiliClient.prefs.v706dryRunMode706 = !current
    AppToast.show(this, "Dry Run Mode706: ${if (!current) "ON" else "OFF"}")
}

// v706: Dump Auto Export706
internal fun PlayerActivity.showV706DumpAutoExport706Toggle() {
    val current = BiliClient.prefs.v706dumpAutoExport706
    BiliClient.prefs.v706dumpAutoExport706 = !current
    AppToast.show(this, "Dump Auto Export706: ${if (!current) "ON" else "OFF"}")
}

// v706: Duplicate Auto Remove706
internal fun PlayerActivity.showV706DuplicateAutoRemove706Toggle() {
    val current = BiliClient.prefs.v706duplicateAutoRemove706
    BiliClient.prefs.v706duplicateAutoRemove706 = !current
    AppToast.show(this, "Duplicate Auto Remove706: ${if (!current) "ON" else "OFF"}")
}

// v706: Duration Auto Limit706
internal fun PlayerActivity.showV706DurationAutoLimit706Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v706durationAutoLimit706).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit706",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v706durationAutoLimit706 = value
        AppToast.show(this, "Duration Auto Limit706: $value")
    }
}

// v706: Dynamic Auto Range706
internal fun PlayerActivity.showV706DynamicAutoRange706Toggle() {
    val current = BiliClient.prefs.v706dynamicAutoRange706
    BiliClient.prefs.v706dynamicAutoRange706 = !current
    AppToast.show(this, "Dynamic Auto Range706: ${if (!current) "ON" else "OFF"}")
}

// v706: Echo Auto Feedback706
internal fun PlayerActivity.showV706EchoAutoFeedback706Toggle() {
    val current = BiliClient.prefs.v706echoAutoFeedback706
    BiliClient.prefs.v706echoAutoFeedback706 = !current
    AppToast.show(this, "Echo Auto Feedback706: ${if (!current) "ON" else "OFF"}")
}

// v706: Edge Auto Detect706
internal fun PlayerActivity.showV706EdgeAutoDetect706Toggle() {
    val current = BiliClient.prefs.v706edgeAutoDetect706
    BiliClient.prefs.v706edgeAutoDetect706 = !current
    AppToast.show(this, "Edge Auto Detect706: ${if (!current) "ON" else "OFF"}")
}

// v706: Edit Auto Save706
internal fun PlayerActivity.showV706EditAutoSave706Toggle() {
    val current = BiliClient.prefs.v706editAutoSave706
    BiliClient.prefs.v706editAutoSave706 = !current
    AppToast.show(this, "Edit Auto Save706: ${if (!current) "ON" else "OFF"}")
}

// v706: Effect Auto Apply706
internal fun PlayerActivity.showV706EffectAutoApply706Toggle() {
    val current = BiliClient.prefs.v706effectAutoApply706
    BiliClient.prefs.v706effectAutoApply706 = !current
    AppToast.show(this, "Effect Auto Apply706: ${if (!current) "ON" else "OFF"}")
}

// v706: Element Auto Focus706
internal fun PlayerActivity.showV706ElementAutoFocus706Toggle() {
    val current = BiliClient.prefs.v706elementAutoFocus706
    BiliClient.prefs.v706elementAutoFocus706 = !current
    AppToast.show(this, "Element Auto Focus706: ${if (!current) "ON" else "OFF"}")
}

// v706: Emit Auto Event706
internal fun PlayerActivity.showV706EmitAutoEvent706Toggle() {
    val current = BiliClient.prefs.v706emitAutoEvent706
    BiliClient.prefs.v706emitAutoEvent706 = !current
    AppToast.show(this, "Emit Auto Event706: ${if (!current) "ON" else "OFF"}")
}

// v706: Empty Auto Placeholder706
internal fun PlayerActivity.showV706EmptyAutoPlaceholder706Toggle() {
    val current = BiliClient.prefs.v706emptyAutoPlaceholder706
    BiliClient.prefs.v706emptyAutoPlaceholder706 = !current
    AppToast.show(this, "Empty Auto Placeholder706: ${if (!current) "ON" else "OFF"}")
}

// v706: Enable Auto Feature706
internal fun PlayerActivity.showV706EnableAutoFeature706Toggle() {
    val current = BiliClient.prefs.v706enableAutoFeature706
    BiliClient.prefs.v706enableAutoFeature706 = !current
    AppToast.show(this, "Enable Auto Feature706: ${if (!current) "ON" else "OFF"}")
}

// v707: Driver Auto Detect707
internal fun PlayerActivity.showV707DriverAutoDetect707Toggle() {
    val current = BiliClient.prefs.v707driverAutoDetect707
    BiliClient.prefs.v707driverAutoDetect707 = !current
    AppToast.show(this, "Driver Auto Detect707: ${if (!current) "ON" else "OFF"}")
}

// v707: Drop Auto Shadow707
internal fun PlayerActivity.showV707DropAutoShadow707Toggle() {
    val current = BiliClient.prefs.v707dropAutoShadow707
    BiliClient.prefs.v707dropAutoShadow707 = !current
    AppToast.show(this, "Drop Auto Shadow707: ${if (!current) "ON" else "OFF"}")
}

// v707: Dry Run Mode707
internal fun PlayerActivity.showV707DryRunMode707Toggle() {
    val current = BiliClient.prefs.v707dryRunMode707
    BiliClient.prefs.v707dryRunMode707 = !current
    AppToast.show(this, "Dry Run Mode707: ${if (!current) "ON" else "OFF"}")
}

// v707: Dump Auto Export707
internal fun PlayerActivity.showV707DumpAutoExport707Toggle() {
    val current = BiliClient.prefs.v707dumpAutoExport707
    BiliClient.prefs.v707dumpAutoExport707 = !current
    AppToast.show(this, "Dump Auto Export707: ${if (!current) "ON" else "OFF"}")
}

// v707: Duplicate Auto Remove707
internal fun PlayerActivity.showV707DuplicateAutoRemove707Toggle() {
    val current = BiliClient.prefs.v707duplicateAutoRemove707
    BiliClient.prefs.v707duplicateAutoRemove707 = !current
    AppToast.show(this, "Duplicate Auto Remove707: ${if (!current) "ON" else "OFF"}")
}

// v707: Duration Auto Limit707
internal fun PlayerActivity.showV707DurationAutoLimit707Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v707durationAutoLimit707).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit707",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v707durationAutoLimit707 = value
        AppToast.show(this, "Duration Auto Limit707: $value")
    }
}

// v707: Dynamic Auto Range707
internal fun PlayerActivity.showV707DynamicAutoRange707Toggle() {
    val current = BiliClient.prefs.v707dynamicAutoRange707
    BiliClient.prefs.v707dynamicAutoRange707 = !current
    AppToast.show(this, "Dynamic Auto Range707: ${if (!current) "ON" else "OFF"}")
}

// v707: Echo Auto Feedback707
internal fun PlayerActivity.showV707EchoAutoFeedback707Toggle() {
    val current = BiliClient.prefs.v707echoAutoFeedback707
    BiliClient.prefs.v707echoAutoFeedback707 = !current
    AppToast.show(this, "Echo Auto Feedback707: ${if (!current) "ON" else "OFF"}")
}

// v707: Edge Auto Detect707
internal fun PlayerActivity.showV707EdgeAutoDetect707Toggle() {
    val current = BiliClient.prefs.v707edgeAutoDetect707
    BiliClient.prefs.v707edgeAutoDetect707 = !current
    AppToast.show(this, "Edge Auto Detect707: ${if (!current) "ON" else "OFF"}")
}

// v707: Edit Auto Save707
internal fun PlayerActivity.showV707EditAutoSave707Toggle() {
    val current = BiliClient.prefs.v707editAutoSave707
    BiliClient.prefs.v707editAutoSave707 = !current
    AppToast.show(this, "Edit Auto Save707: ${if (!current) "ON" else "OFF"}")
}

// v707: Effect Auto Apply707
internal fun PlayerActivity.showV707EffectAutoApply707Toggle() {
    val current = BiliClient.prefs.v707effectAutoApply707
    BiliClient.prefs.v707effectAutoApply707 = !current
    AppToast.show(this, "Effect Auto Apply707: ${if (!current) "ON" else "OFF"}")
}

// v707: Element Auto Focus707
internal fun PlayerActivity.showV707ElementAutoFocus707Toggle() {
    val current = BiliClient.prefs.v707elementAutoFocus707
    BiliClient.prefs.v707elementAutoFocus707 = !current
    AppToast.show(this, "Element Auto Focus707: ${if (!current) "ON" else "OFF"}")
}

// v707: Emit Auto Event707
internal fun PlayerActivity.showV707EmitAutoEvent707Toggle() {
    val current = BiliClient.prefs.v707emitAutoEvent707
    BiliClient.prefs.v707emitAutoEvent707 = !current
    AppToast.show(this, "Emit Auto Event707: ${if (!current) "ON" else "OFF"}")
}

// v707: Empty Auto Placeholder707
internal fun PlayerActivity.showV707EmptyAutoPlaceholder707Toggle() {
    val current = BiliClient.prefs.v707emptyAutoPlaceholder707
    BiliClient.prefs.v707emptyAutoPlaceholder707 = !current
    AppToast.show(this, "Empty Auto Placeholder707: ${if (!current) "ON" else "OFF"}")
}

// v707: Enable Auto Feature707
internal fun PlayerActivity.showV707EnableAutoFeature707Toggle() {
    val current = BiliClient.prefs.v707enableAutoFeature707
    BiliClient.prefs.v707enableAutoFeature707 = !current
    AppToast.show(this, "Enable Auto Feature707: ${if (!current) "ON" else "OFF"}")
}

// v708: Driver Auto Detect708
internal fun PlayerActivity.showV708DriverAutoDetect708Toggle() {
    val current = BiliClient.prefs.v708driverAutoDetect708
    BiliClient.prefs.v708driverAutoDetect708 = !current
    AppToast.show(this, "Driver Auto Detect708: ${if (!current) "ON" else "OFF"}")
}

// v708: Drop Auto Shadow708
internal fun PlayerActivity.showV708DropAutoShadow708Toggle() {
    val current = BiliClient.prefs.v708dropAutoShadow708
    BiliClient.prefs.v708dropAutoShadow708 = !current
    AppToast.show(this, "Drop Auto Shadow708: ${if (!current) "ON" else "OFF"}")
}

// v708: Dry Run Mode708
internal fun PlayerActivity.showV708DryRunMode708Toggle() {
    val current = BiliClient.prefs.v708dryRunMode708
    BiliClient.prefs.v708dryRunMode708 = !current
    AppToast.show(this, "Dry Run Mode708: ${if (!current) "ON" else "OFF"}")
}

// v708: Dump Auto Export708
internal fun PlayerActivity.showV708DumpAutoExport708Toggle() {
    val current = BiliClient.prefs.v708dumpAutoExport708
    BiliClient.prefs.v708dumpAutoExport708 = !current
    AppToast.show(this, "Dump Auto Export708: ${if (!current) "ON" else "OFF"}")
}

// v708: Duplicate Auto Remove708
internal fun PlayerActivity.showV708DuplicateAutoRemove708Toggle() {
    val current = BiliClient.prefs.v708duplicateAutoRemove708
    BiliClient.prefs.v708duplicateAutoRemove708 = !current
    AppToast.show(this, "Duplicate Auto Remove708: ${if (!current) "ON" else "OFF"}")
}

// v708: Duration Auto Limit708
internal fun PlayerActivity.showV708DurationAutoLimit708Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v708durationAutoLimit708).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit708",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v708durationAutoLimit708 = value
        AppToast.show(this, "Duration Auto Limit708: $value")
    }
}

// v708: Dynamic Auto Range708
internal fun PlayerActivity.showV708DynamicAutoRange708Toggle() {
    val current = BiliClient.prefs.v708dynamicAutoRange708
    BiliClient.prefs.v708dynamicAutoRange708 = !current
    AppToast.show(this, "Dynamic Auto Range708: ${if (!current) "ON" else "OFF"}")
}

// v708: Echo Auto Feedback708
internal fun PlayerActivity.showV708EchoAutoFeedback708Toggle() {
    val current = BiliClient.prefs.v708echoAutoFeedback708
    BiliClient.prefs.v708echoAutoFeedback708 = !current
    AppToast.show(this, "Echo Auto Feedback708: ${if (!current) "ON" else "OFF"}")
}

// v708: Edge Auto Detect708
internal fun PlayerActivity.showV708EdgeAutoDetect708Toggle() {
    val current = BiliClient.prefs.v708edgeAutoDetect708
    BiliClient.prefs.v708edgeAutoDetect708 = !current
    AppToast.show(this, "Edge Auto Detect708: ${if (!current) "ON" else "OFF"}")
}

// v708: Edit Auto Save708
internal fun PlayerActivity.showV708EditAutoSave708Toggle() {
    val current = BiliClient.prefs.v708editAutoSave708
    BiliClient.prefs.v708editAutoSave708 = !current
    AppToast.show(this, "Edit Auto Save708: ${if (!current) "ON" else "OFF"}")
}

// v708: Effect Auto Apply708
internal fun PlayerActivity.showV708EffectAutoApply708Toggle() {
    val current = BiliClient.prefs.v708effectAutoApply708
    BiliClient.prefs.v708effectAutoApply708 = !current
    AppToast.show(this, "Effect Auto Apply708: ${if (!current) "ON" else "OFF"}")
}

// v708: Element Auto Focus708
internal fun PlayerActivity.showV708ElementAutoFocus708Toggle() {
    val current = BiliClient.prefs.v708elementAutoFocus708
    BiliClient.prefs.v708elementAutoFocus708 = !current
    AppToast.show(this, "Element Auto Focus708: ${if (!current) "ON" else "OFF"}")
}

// v708: Emit Auto Event708
internal fun PlayerActivity.showV708EmitAutoEvent708Toggle() {
    val current = BiliClient.prefs.v708emitAutoEvent708
    BiliClient.prefs.v708emitAutoEvent708 = !current
    AppToast.show(this, "Emit Auto Event708: ${if (!current) "ON" else "OFF"}")
}

// v708: Empty Auto Placeholder708
internal fun PlayerActivity.showV708EmptyAutoPlaceholder708Toggle() {
    val current = BiliClient.prefs.v708emptyAutoPlaceholder708
    BiliClient.prefs.v708emptyAutoPlaceholder708 = !current
    AppToast.show(this, "Empty Auto Placeholder708: ${if (!current) "ON" else "OFF"}")
}

// v708: Enable Auto Feature708
internal fun PlayerActivity.showV708EnableAutoFeature708Toggle() {
    val current = BiliClient.prefs.v708enableAutoFeature708
    BiliClient.prefs.v708enableAutoFeature708 = !current
    AppToast.show(this, "Enable Auto Feature708: ${if (!current) "ON" else "OFF"}")
}

// v709: Driver Auto Detect709
internal fun PlayerActivity.showV709DriverAutoDetect709Toggle() {
    val current = BiliClient.prefs.v709driverAutoDetect709
    BiliClient.prefs.v709driverAutoDetect709 = !current
    AppToast.show(this, "Driver Auto Detect709: ${if (!current) "ON" else "OFF"}")
}

// v709: Drop Auto Shadow709
internal fun PlayerActivity.showV709DropAutoShadow709Toggle() {
    val current = BiliClient.prefs.v709dropAutoShadow709
    BiliClient.prefs.v709dropAutoShadow709 = !current
    AppToast.show(this, "Drop Auto Shadow709: ${if (!current) "ON" else "OFF"}")
}

// v709: Dry Run Mode709
internal fun PlayerActivity.showV709DryRunMode709Toggle() {
    val current = BiliClient.prefs.v709dryRunMode709
    BiliClient.prefs.v709dryRunMode709 = !current
    AppToast.show(this, "Dry Run Mode709: ${if (!current) "ON" else "OFF"}")
}

// v709: Dump Auto Export709
internal fun PlayerActivity.showV709DumpAutoExport709Toggle() {
    val current = BiliClient.prefs.v709dumpAutoExport709
    BiliClient.prefs.v709dumpAutoExport709 = !current
    AppToast.show(this, "Dump Auto Export709: ${if (!current) "ON" else "OFF"}")
}

// v709: Duplicate Auto Remove709
internal fun PlayerActivity.showV709DuplicateAutoRemove709Toggle() {
    val current = BiliClient.prefs.v709duplicateAutoRemove709
    BiliClient.prefs.v709duplicateAutoRemove709 = !current
    AppToast.show(this, "Duplicate Auto Remove709: ${if (!current) "ON" else "OFF"}")
}

// v709: Duration Auto Limit709
internal fun PlayerActivity.showV709DurationAutoLimit709Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v709durationAutoLimit709).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit709",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v709durationAutoLimit709 = value
        AppToast.show(this, "Duration Auto Limit709: $value")
    }
}

// v709: Dynamic Auto Range709
internal fun PlayerActivity.showV709DynamicAutoRange709Toggle() {
    val current = BiliClient.prefs.v709dynamicAutoRange709
    BiliClient.prefs.v709dynamicAutoRange709 = !current
    AppToast.show(this, "Dynamic Auto Range709: ${if (!current) "ON" else "OFF"}")
}

// v709: Echo Auto Feedback709
internal fun PlayerActivity.showV709EchoAutoFeedback709Toggle() {
    val current = BiliClient.prefs.v709echoAutoFeedback709
    BiliClient.prefs.v709echoAutoFeedback709 = !current
    AppToast.show(this, "Echo Auto Feedback709: ${if (!current) "ON" else "OFF"}")
}

// v709: Edge Auto Detect709
internal fun PlayerActivity.showV709EdgeAutoDetect709Toggle() {
    val current = BiliClient.prefs.v709edgeAutoDetect709
    BiliClient.prefs.v709edgeAutoDetect709 = !current
    AppToast.show(this, "Edge Auto Detect709: ${if (!current) "ON" else "OFF"}")
}

// v709: Edit Auto Save709
internal fun PlayerActivity.showV709EditAutoSave709Toggle() {
    val current = BiliClient.prefs.v709editAutoSave709
    BiliClient.prefs.v709editAutoSave709 = !current
    AppToast.show(this, "Edit Auto Save709: ${if (!current) "ON" else "OFF"}")
}

// v709: Effect Auto Apply709
internal fun PlayerActivity.showV709EffectAutoApply709Toggle() {
    val current = BiliClient.prefs.v709effectAutoApply709
    BiliClient.prefs.v709effectAutoApply709 = !current
    AppToast.show(this, "Effect Auto Apply709: ${if (!current) "ON" else "OFF"}")
}

// v709: Element Auto Focus709
internal fun PlayerActivity.showV709ElementAutoFocus709Toggle() {
    val current = BiliClient.prefs.v709elementAutoFocus709
    BiliClient.prefs.v709elementAutoFocus709 = !current
    AppToast.show(this, "Element Auto Focus709: ${if (!current) "ON" else "OFF"}")
}

// v709: Emit Auto Event709
internal fun PlayerActivity.showV709EmitAutoEvent709Toggle() {
    val current = BiliClient.prefs.v709emitAutoEvent709
    BiliClient.prefs.v709emitAutoEvent709 = !current
    AppToast.show(this, "Emit Auto Event709: ${if (!current) "ON" else "OFF"}")
}

// v709: Empty Auto Placeholder709
internal fun PlayerActivity.showV709EmptyAutoPlaceholder709Toggle() {
    val current = BiliClient.prefs.v709emptyAutoPlaceholder709
    BiliClient.prefs.v709emptyAutoPlaceholder709 = !current
    AppToast.show(this, "Empty Auto Placeholder709: ${if (!current) "ON" else "OFF"}")
}

// v709: Enable Auto Feature709
internal fun PlayerActivity.showV709EnableAutoFeature709Toggle() {
    val current = BiliClient.prefs.v709enableAutoFeature709
    BiliClient.prefs.v709enableAutoFeature709 = !current
    AppToast.show(this, "Enable Auto Feature709: ${if (!current) "ON" else "OFF"}")
}

// v710: Driver Auto Detect710
internal fun PlayerActivity.showV710DriverAutoDetect710Toggle() {
    val current = BiliClient.prefs.v710driverAutoDetect710
    BiliClient.prefs.v710driverAutoDetect710 = !current
    AppToast.show(this, "Driver Auto Detect710: ${if (!current) "ON" else "OFF"}")
}

// v710: Drop Auto Shadow710
internal fun PlayerActivity.showV710DropAutoShadow710Toggle() {
    val current = BiliClient.prefs.v710dropAutoShadow710
    BiliClient.prefs.v710dropAutoShadow710 = !current
    AppToast.show(this, "Drop Auto Shadow710: ${if (!current) "ON" else "OFF"}")
}

// v710: Dry Run Mode710
internal fun PlayerActivity.showV710DryRunMode710Toggle() {
    val current = BiliClient.prefs.v710dryRunMode710
    BiliClient.prefs.v710dryRunMode710 = !current
    AppToast.show(this, "Dry Run Mode710: ${if (!current) "ON" else "OFF"}")
}

// v710: Dump Auto Export710
internal fun PlayerActivity.showV710DumpAutoExport710Toggle() {
    val current = BiliClient.prefs.v710dumpAutoExport710
    BiliClient.prefs.v710dumpAutoExport710 = !current
    AppToast.show(this, "Dump Auto Export710: ${if (!current) "ON" else "OFF"}")
}

// v710: Duplicate Auto Remove710
internal fun PlayerActivity.showV710DuplicateAutoRemove710Toggle() {
    val current = BiliClient.prefs.v710duplicateAutoRemove710
    BiliClient.prefs.v710duplicateAutoRemove710 = !current
    AppToast.show(this, "Duplicate Auto Remove710: ${if (!current) "ON" else "OFF"}")
}

// v710: Duration Auto Limit710
internal fun PlayerActivity.showV710DurationAutoLimit710Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v710durationAutoLimit710).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Duration Auto Limit710",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v710durationAutoLimit710 = value
        AppToast.show(this, "Duration Auto Limit710: $value")
    }
}

// v710: Dynamic Auto Range710
internal fun PlayerActivity.showV710DynamicAutoRange710Toggle() {
    val current = BiliClient.prefs.v710dynamicAutoRange710
    BiliClient.prefs.v710dynamicAutoRange710 = !current
    AppToast.show(this, "Dynamic Auto Range710: ${if (!current) "ON" else "OFF"}")
}

// v710: Echo Auto Feedback710
internal fun PlayerActivity.showV710EchoAutoFeedback710Toggle() {
    val current = BiliClient.prefs.v710echoAutoFeedback710
    BiliClient.prefs.v710echoAutoFeedback710 = !current
    AppToast.show(this, "Echo Auto Feedback710: ${if (!current) "ON" else "OFF"}")
}

// v710: Edge Auto Detect710
internal fun PlayerActivity.showV710EdgeAutoDetect710Toggle() {
    val current = BiliClient.prefs.v710edgeAutoDetect710
    BiliClient.prefs.v710edgeAutoDetect710 = !current
    AppToast.show(this, "Edge Auto Detect710: ${if (!current) "ON" else "OFF"}")
}

// v710: Edit Auto Save710
internal fun PlayerActivity.showV710EditAutoSave710Toggle() {
    val current = BiliClient.prefs.v710editAutoSave710
    BiliClient.prefs.v710editAutoSave710 = !current
    AppToast.show(this, "Edit Auto Save710: ${if (!current) "ON" else "OFF"}")
}

// v710: Effect Auto Apply710
internal fun PlayerActivity.showV710EffectAutoApply710Toggle() {
    val current = BiliClient.prefs.v710effectAutoApply710
    BiliClient.prefs.v710effectAutoApply710 = !current
    AppToast.show(this, "Effect Auto Apply710: ${if (!current) "ON" else "OFF"}")
}

// v710: Element Auto Focus710
internal fun PlayerActivity.showV710ElementAutoFocus710Toggle() {
    val current = BiliClient.prefs.v710elementAutoFocus710
    BiliClient.prefs.v710elementAutoFocus710 = !current
    AppToast.show(this, "Element Auto Focus710: ${if (!current) "ON" else "OFF"}")
}

// v710: Emit Auto Event710
internal fun PlayerActivity.showV710EmitAutoEvent710Toggle() {
    val current = BiliClient.prefs.v710emitAutoEvent710
    BiliClient.prefs.v710emitAutoEvent710 = !current
    AppToast.show(this, "Emit Auto Event710: ${if (!current) "ON" else "OFF"}")
}

// v710: Empty Auto Placeholder710
internal fun PlayerActivity.showV710EmptyAutoPlaceholder710Toggle() {
    val current = BiliClient.prefs.v710emptyAutoPlaceholder710
    BiliClient.prefs.v710emptyAutoPlaceholder710 = !current
    AppToast.show(this, "Empty Auto Placeholder710: ${if (!current) "ON" else "OFF"}")
}

// v710: Enable Auto Feature710
internal fun PlayerActivity.showV710EnableAutoFeature710Toggle() {
    val current = BiliClient.prefs.v710enableAutoFeature710
    BiliClient.prefs.v710enableAutoFeature710 = !current
    AppToast.show(this, "Enable Auto Feature710: ${if (!current) "ON" else "OFF"}")
}

