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

// v811: Master Auto Sync811
internal fun PlayerActivity.showV811MasterAutoSync811Toggle() {
    val current = BiliClient.prefs.v811masterAutoSync811
    BiliClient.prefs.v811masterAutoSync811 = !current
    AppToast.show(this, "Master Auto Sync811: ${if (!current) "ON" else "OFF"}")
}

// v811: Match Auto Fuzzy811
internal fun PlayerActivity.showV811MatchAutoFuzzy811Toggle() {
    val current = BiliClient.prefs.v811matchAutoFuzzy811
    BiliClient.prefs.v811matchAutoFuzzy811 = !current
    AppToast.show(this, "Match Auto Fuzzy811: ${if (!current) "ON" else "OFF"}")
}

// v811: Math Auto Round811
internal fun PlayerActivity.showV811MathAutoRound811Toggle() {
    val current = BiliClient.prefs.v811mathAutoRound811
    BiliClient.prefs.v811mathAutoRound811 = !current
    AppToast.show(this, "Math Auto Round811: ${if (!current) "ON" else "OFF"}")
}

// v811: Max Auto Limit811
internal fun PlayerActivity.showV811MaxAutoLimit811Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v811maxAutoLimit811).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit811",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v811maxAutoLimit811 = value
        AppToast.show(this, "Max Auto Limit811: $value")
    }
}

// v811: Measure Auto Unit811
internal fun PlayerActivity.showV811MeasureAutoUnit811Toggle() {
    val current = BiliClient.prefs.v811measureAutoUnit811
    BiliClient.prefs.v811measureAutoUnit811 = !current
    AppToast.show(this, "Measure Auto Unit811: ${if (!current) "ON" else "OFF"}")
}

// v811: Media Auto Codec811
internal fun PlayerActivity.showV811MediaAutoCodec811Toggle() {
    val current = BiliClient.prefs.v811mediaAutoCodec811
    BiliClient.prefs.v811mediaAutoCodec811 = !current
    AppToast.show(this, "Media Auto Codec811: ${if (!current) "ON" else "OFF"}")
}

// v811: Memory Auto Optimize811
internal fun PlayerActivity.showV811MemoryAutoOptimize811Toggle() {
    val current = BiliClient.prefs.v811memoryAutoOptimize811
    BiliClient.prefs.v811memoryAutoOptimize811 = !current
    AppToast.show(this, "Memory Auto Optimize811: ${if (!current) "ON" else "OFF"}")
}

// v811: Menu Auto Context811
internal fun PlayerActivity.showV811MenuAutoContext811Toggle() {
    val current = BiliClient.prefs.v811menuAutoContext811
    BiliClient.prefs.v811menuAutoContext811 = !current
    AppToast.show(this, "Menu Auto Context811: ${if (!current) "ON" else "OFF"}")
}

// v811: Message Auto Queue811
internal fun PlayerActivity.showV811MessageAutoQueue811Toggle() {
    val current = BiliClient.prefs.v811messageAutoQueue811
    BiliClient.prefs.v811messageAutoQueue811 = !current
    AppToast.show(this, "Message Auto Queue811: ${if (!current) "ON" else "OFF"}")
}

// v811: Meta Auto Extract811
internal fun PlayerActivity.showV811MetaAutoExtract811Toggle() {
    val current = BiliClient.prefs.v811metaAutoExtract811
    BiliClient.prefs.v811metaAutoExtract811 = !current
    AppToast.show(this, "Meta Auto Extract811: ${if (!current) "ON" else "OFF"}")
}

// v811: Method Auto Hook811
internal fun PlayerActivity.showV811MethodAutoHook811Toggle() {
    val current = BiliClient.prefs.v811methodAutoHook811
    BiliClient.prefs.v811methodAutoHook811 = !current
    AppToast.show(this, "Method Auto Hook811: ${if (!current) "ON" else "OFF"}")
}

// v811: Middle Auto Center811
internal fun PlayerActivity.showV811MiddleAutoCenter811Toggle() {
    val current = BiliClient.prefs.v811middleAutoCenter811
    BiliClient.prefs.v811middleAutoCenter811 = !current
    AppToast.show(this, "Middle Auto Center811: ${if (!current) "ON" else "OFF"}")
}

// v811: Min Auto Threshold811
internal fun PlayerActivity.showV811MinAutoThreshold811Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v811minAutoThreshold811).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold811",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v811minAutoThreshold811 = value
        AppToast.show(this, "Min Auto Threshold811: $value")
    }
}

// v811: Mode Auto Adaptive811
internal fun PlayerActivity.showV811ModeAutoAdaptive811Toggle() {
    val current = BiliClient.prefs.v811modeAutoAdaptive811
    BiliClient.prefs.v811modeAutoAdaptive811 = !current
    AppToast.show(this, "Mode Auto Adaptive811: ${if (!current) "ON" else "OFF"}")
}

// v811: Model Auto Detect811
internal fun PlayerActivity.showV811ModelAutoDetect811Toggle() {
    val current = BiliClient.prefs.v811modelAutoDetect811
    BiliClient.prefs.v811modelAutoDetect811 = !current
    AppToast.show(this, "Model Auto Detect811: ${if (!current) "ON" else "OFF"}")
}

// v812: Master Auto Sync812
internal fun PlayerActivity.showV812MasterAutoSync812Toggle() {
    val current = BiliClient.prefs.v812masterAutoSync812
    BiliClient.prefs.v812masterAutoSync812 = !current
    AppToast.show(this, "Master Auto Sync812: ${if (!current) "ON" else "OFF"}")
}

// v812: Match Auto Fuzzy812
internal fun PlayerActivity.showV812MatchAutoFuzzy812Toggle() {
    val current = BiliClient.prefs.v812matchAutoFuzzy812
    BiliClient.prefs.v812matchAutoFuzzy812 = !current
    AppToast.show(this, "Match Auto Fuzzy812: ${if (!current) "ON" else "OFF"}")
}

// v812: Math Auto Round812
internal fun PlayerActivity.showV812MathAutoRound812Toggle() {
    val current = BiliClient.prefs.v812mathAutoRound812
    BiliClient.prefs.v812mathAutoRound812 = !current
    AppToast.show(this, "Math Auto Round812: ${if (!current) "ON" else "OFF"}")
}

// v812: Max Auto Limit812
internal fun PlayerActivity.showV812MaxAutoLimit812Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v812maxAutoLimit812).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit812",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v812maxAutoLimit812 = value
        AppToast.show(this, "Max Auto Limit812: $value")
    }
}

// v812: Measure Auto Unit812
internal fun PlayerActivity.showV812MeasureAutoUnit812Toggle() {
    val current = BiliClient.prefs.v812measureAutoUnit812
    BiliClient.prefs.v812measureAutoUnit812 = !current
    AppToast.show(this, "Measure Auto Unit812: ${if (!current) "ON" else "OFF"}")
}

// v812: Media Auto Codec812
internal fun PlayerActivity.showV812MediaAutoCodec812Toggle() {
    val current = BiliClient.prefs.v812mediaAutoCodec812
    BiliClient.prefs.v812mediaAutoCodec812 = !current
    AppToast.show(this, "Media Auto Codec812: ${if (!current) "ON" else "OFF"}")
}

// v812: Memory Auto Optimize812
internal fun PlayerActivity.showV812MemoryAutoOptimize812Toggle() {
    val current = BiliClient.prefs.v812memoryAutoOptimize812
    BiliClient.prefs.v812memoryAutoOptimize812 = !current
    AppToast.show(this, "Memory Auto Optimize812: ${if (!current) "ON" else "OFF"}")
}

// v812: Menu Auto Context812
internal fun PlayerActivity.showV812MenuAutoContext812Toggle() {
    val current = BiliClient.prefs.v812menuAutoContext812
    BiliClient.prefs.v812menuAutoContext812 = !current
    AppToast.show(this, "Menu Auto Context812: ${if (!current) "ON" else "OFF"}")
}

// v812: Message Auto Queue812
internal fun PlayerActivity.showV812MessageAutoQueue812Toggle() {
    val current = BiliClient.prefs.v812messageAutoQueue812
    BiliClient.prefs.v812messageAutoQueue812 = !current
    AppToast.show(this, "Message Auto Queue812: ${if (!current) "ON" else "OFF"}")
}

// v812: Meta Auto Extract812
internal fun PlayerActivity.showV812MetaAutoExtract812Toggle() {
    val current = BiliClient.prefs.v812metaAutoExtract812
    BiliClient.prefs.v812metaAutoExtract812 = !current
    AppToast.show(this, "Meta Auto Extract812: ${if (!current) "ON" else "OFF"}")
}

// v812: Method Auto Hook812
internal fun PlayerActivity.showV812MethodAutoHook812Toggle() {
    val current = BiliClient.prefs.v812methodAutoHook812
    BiliClient.prefs.v812methodAutoHook812 = !current
    AppToast.show(this, "Method Auto Hook812: ${if (!current) "ON" else "OFF"}")
}

// v812: Middle Auto Center812
internal fun PlayerActivity.showV812MiddleAutoCenter812Toggle() {
    val current = BiliClient.prefs.v812middleAutoCenter812
    BiliClient.prefs.v812middleAutoCenter812 = !current
    AppToast.show(this, "Middle Auto Center812: ${if (!current) "ON" else "OFF"}")
}

// v812: Min Auto Threshold812
internal fun PlayerActivity.showV812MinAutoThreshold812Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v812minAutoThreshold812).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold812",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v812minAutoThreshold812 = value
        AppToast.show(this, "Min Auto Threshold812: $value")
    }
}

// v812: Mode Auto Adaptive812
internal fun PlayerActivity.showV812ModeAutoAdaptive812Toggle() {
    val current = BiliClient.prefs.v812modeAutoAdaptive812
    BiliClient.prefs.v812modeAutoAdaptive812 = !current
    AppToast.show(this, "Mode Auto Adaptive812: ${if (!current) "ON" else "OFF"}")
}

// v812: Model Auto Detect812
internal fun PlayerActivity.showV812ModelAutoDetect812Toggle() {
    val current = BiliClient.prefs.v812modelAutoDetect812
    BiliClient.prefs.v812modelAutoDetect812 = !current
    AppToast.show(this, "Model Auto Detect812: ${if (!current) "ON" else "OFF"}")
}

// v813: Master Auto Sync813
internal fun PlayerActivity.showV813MasterAutoSync813Toggle() {
    val current = BiliClient.prefs.v813masterAutoSync813
    BiliClient.prefs.v813masterAutoSync813 = !current
    AppToast.show(this, "Master Auto Sync813: ${if (!current) "ON" else "OFF"}")
}

// v813: Match Auto Fuzzy813
internal fun PlayerActivity.showV813MatchAutoFuzzy813Toggle() {
    val current = BiliClient.prefs.v813matchAutoFuzzy813
    BiliClient.prefs.v813matchAutoFuzzy813 = !current
    AppToast.show(this, "Match Auto Fuzzy813: ${if (!current) "ON" else "OFF"}")
}

// v813: Math Auto Round813
internal fun PlayerActivity.showV813MathAutoRound813Toggle() {
    val current = BiliClient.prefs.v813mathAutoRound813
    BiliClient.prefs.v813mathAutoRound813 = !current
    AppToast.show(this, "Math Auto Round813: ${if (!current) "ON" else "OFF"}")
}

// v813: Max Auto Limit813
internal fun PlayerActivity.showV813MaxAutoLimit813Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v813maxAutoLimit813).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit813",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v813maxAutoLimit813 = value
        AppToast.show(this, "Max Auto Limit813: $value")
    }
}

// v813: Measure Auto Unit813
internal fun PlayerActivity.showV813MeasureAutoUnit813Toggle() {
    val current = BiliClient.prefs.v813measureAutoUnit813
    BiliClient.prefs.v813measureAutoUnit813 = !current
    AppToast.show(this, "Measure Auto Unit813: ${if (!current) "ON" else "OFF"}")
}

// v813: Media Auto Codec813
internal fun PlayerActivity.showV813MediaAutoCodec813Toggle() {
    val current = BiliClient.prefs.v813mediaAutoCodec813
    BiliClient.prefs.v813mediaAutoCodec813 = !current
    AppToast.show(this, "Media Auto Codec813: ${if (!current) "ON" else "OFF"}")
}

// v813: Memory Auto Optimize813
internal fun PlayerActivity.showV813MemoryAutoOptimize813Toggle() {
    val current = BiliClient.prefs.v813memoryAutoOptimize813
    BiliClient.prefs.v813memoryAutoOptimize813 = !current
    AppToast.show(this, "Memory Auto Optimize813: ${if (!current) "ON" else "OFF"}")
}

// v813: Menu Auto Context813
internal fun PlayerActivity.showV813MenuAutoContext813Toggle() {
    val current = BiliClient.prefs.v813menuAutoContext813
    BiliClient.prefs.v813menuAutoContext813 = !current
    AppToast.show(this, "Menu Auto Context813: ${if (!current) "ON" else "OFF"}")
}

// v813: Message Auto Queue813
internal fun PlayerActivity.showV813MessageAutoQueue813Toggle() {
    val current = BiliClient.prefs.v813messageAutoQueue813
    BiliClient.prefs.v813messageAutoQueue813 = !current
    AppToast.show(this, "Message Auto Queue813: ${if (!current) "ON" else "OFF"}")
}

// v813: Meta Auto Extract813
internal fun PlayerActivity.showV813MetaAutoExtract813Toggle() {
    val current = BiliClient.prefs.v813metaAutoExtract813
    BiliClient.prefs.v813metaAutoExtract813 = !current
    AppToast.show(this, "Meta Auto Extract813: ${if (!current) "ON" else "OFF"}")
}

// v813: Method Auto Hook813
internal fun PlayerActivity.showV813MethodAutoHook813Toggle() {
    val current = BiliClient.prefs.v813methodAutoHook813
    BiliClient.prefs.v813methodAutoHook813 = !current
    AppToast.show(this, "Method Auto Hook813: ${if (!current) "ON" else "OFF"}")
}

// v813: Middle Auto Center813
internal fun PlayerActivity.showV813MiddleAutoCenter813Toggle() {
    val current = BiliClient.prefs.v813middleAutoCenter813
    BiliClient.prefs.v813middleAutoCenter813 = !current
    AppToast.show(this, "Middle Auto Center813: ${if (!current) "ON" else "OFF"}")
}

// v813: Min Auto Threshold813
internal fun PlayerActivity.showV813MinAutoThreshold813Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v813minAutoThreshold813).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold813",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v813minAutoThreshold813 = value
        AppToast.show(this, "Min Auto Threshold813: $value")
    }
}

// v813: Mode Auto Adaptive813
internal fun PlayerActivity.showV813ModeAutoAdaptive813Toggle() {
    val current = BiliClient.prefs.v813modeAutoAdaptive813
    BiliClient.prefs.v813modeAutoAdaptive813 = !current
    AppToast.show(this, "Mode Auto Adaptive813: ${if (!current) "ON" else "OFF"}")
}

// v813: Model Auto Detect813
internal fun PlayerActivity.showV813ModelAutoDetect813Toggle() {
    val current = BiliClient.prefs.v813modelAutoDetect813
    BiliClient.prefs.v813modelAutoDetect813 = !current
    AppToast.show(this, "Model Auto Detect813: ${if (!current) "ON" else "OFF"}")
}

// v814: Master Auto Sync814
internal fun PlayerActivity.showV814MasterAutoSync814Toggle() {
    val current = BiliClient.prefs.v814masterAutoSync814
    BiliClient.prefs.v814masterAutoSync814 = !current
    AppToast.show(this, "Master Auto Sync814: ${if (!current) "ON" else "OFF"}")
}

// v814: Match Auto Fuzzy814
internal fun PlayerActivity.showV814MatchAutoFuzzy814Toggle() {
    val current = BiliClient.prefs.v814matchAutoFuzzy814
    BiliClient.prefs.v814matchAutoFuzzy814 = !current
    AppToast.show(this, "Match Auto Fuzzy814: ${if (!current) "ON" else "OFF"}")
}

// v814: Math Auto Round814
internal fun PlayerActivity.showV814MathAutoRound814Toggle() {
    val current = BiliClient.prefs.v814mathAutoRound814
    BiliClient.prefs.v814mathAutoRound814 = !current
    AppToast.show(this, "Math Auto Round814: ${if (!current) "ON" else "OFF"}")
}

// v814: Max Auto Limit814
internal fun PlayerActivity.showV814MaxAutoLimit814Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v814maxAutoLimit814).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit814",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v814maxAutoLimit814 = value
        AppToast.show(this, "Max Auto Limit814: $value")
    }
}

// v814: Measure Auto Unit814
internal fun PlayerActivity.showV814MeasureAutoUnit814Toggle() {
    val current = BiliClient.prefs.v814measureAutoUnit814
    BiliClient.prefs.v814measureAutoUnit814 = !current
    AppToast.show(this, "Measure Auto Unit814: ${if (!current) "ON" else "OFF"}")
}

// v814: Media Auto Codec814
internal fun PlayerActivity.showV814MediaAutoCodec814Toggle() {
    val current = BiliClient.prefs.v814mediaAutoCodec814
    BiliClient.prefs.v814mediaAutoCodec814 = !current
    AppToast.show(this, "Media Auto Codec814: ${if (!current) "ON" else "OFF"}")
}

// v814: Memory Auto Optimize814
internal fun PlayerActivity.showV814MemoryAutoOptimize814Toggle() {
    val current = BiliClient.prefs.v814memoryAutoOptimize814
    BiliClient.prefs.v814memoryAutoOptimize814 = !current
    AppToast.show(this, "Memory Auto Optimize814: ${if (!current) "ON" else "OFF"}")
}

// v814: Menu Auto Context814
internal fun PlayerActivity.showV814MenuAutoContext814Toggle() {
    val current = BiliClient.prefs.v814menuAutoContext814
    BiliClient.prefs.v814menuAutoContext814 = !current
    AppToast.show(this, "Menu Auto Context814: ${if (!current) "ON" else "OFF"}")
}

// v814: Message Auto Queue814
internal fun PlayerActivity.showV814MessageAutoQueue814Toggle() {
    val current = BiliClient.prefs.v814messageAutoQueue814
    BiliClient.prefs.v814messageAutoQueue814 = !current
    AppToast.show(this, "Message Auto Queue814: ${if (!current) "ON" else "OFF"}")
}

// v814: Meta Auto Extract814
internal fun PlayerActivity.showV814MetaAutoExtract814Toggle() {
    val current = BiliClient.prefs.v814metaAutoExtract814
    BiliClient.prefs.v814metaAutoExtract814 = !current
    AppToast.show(this, "Meta Auto Extract814: ${if (!current) "ON" else "OFF"}")
}

// v814: Method Auto Hook814
internal fun PlayerActivity.showV814MethodAutoHook814Toggle() {
    val current = BiliClient.prefs.v814methodAutoHook814
    BiliClient.prefs.v814methodAutoHook814 = !current
    AppToast.show(this, "Method Auto Hook814: ${if (!current) "ON" else "OFF"}")
}

// v814: Middle Auto Center814
internal fun PlayerActivity.showV814MiddleAutoCenter814Toggle() {
    val current = BiliClient.prefs.v814middleAutoCenter814
    BiliClient.prefs.v814middleAutoCenter814 = !current
    AppToast.show(this, "Middle Auto Center814: ${if (!current) "ON" else "OFF"}")
}

// v814: Min Auto Threshold814
internal fun PlayerActivity.showV814MinAutoThreshold814Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v814minAutoThreshold814).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold814",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v814minAutoThreshold814 = value
        AppToast.show(this, "Min Auto Threshold814: $value")
    }
}

// v814: Mode Auto Adaptive814
internal fun PlayerActivity.showV814ModeAutoAdaptive814Toggle() {
    val current = BiliClient.prefs.v814modeAutoAdaptive814
    BiliClient.prefs.v814modeAutoAdaptive814 = !current
    AppToast.show(this, "Mode Auto Adaptive814: ${if (!current) "ON" else "OFF"}")
}

// v814: Model Auto Detect814
internal fun PlayerActivity.showV814ModelAutoDetect814Toggle() {
    val current = BiliClient.prefs.v814modelAutoDetect814
    BiliClient.prefs.v814modelAutoDetect814 = !current
    AppToast.show(this, "Model Auto Detect814: ${if (!current) "ON" else "OFF"}")
}

// v815: Master Auto Sync815
internal fun PlayerActivity.showV815MasterAutoSync815Toggle() {
    val current = BiliClient.prefs.v815masterAutoSync815
    BiliClient.prefs.v815masterAutoSync815 = !current
    AppToast.show(this, "Master Auto Sync815: ${if (!current) "ON" else "OFF"}")
}

// v815: Match Auto Fuzzy815
internal fun PlayerActivity.showV815MatchAutoFuzzy815Toggle() {
    val current = BiliClient.prefs.v815matchAutoFuzzy815
    BiliClient.prefs.v815matchAutoFuzzy815 = !current
    AppToast.show(this, "Match Auto Fuzzy815: ${if (!current) "ON" else "OFF"}")
}

// v815: Math Auto Round815
internal fun PlayerActivity.showV815MathAutoRound815Toggle() {
    val current = BiliClient.prefs.v815mathAutoRound815
    BiliClient.prefs.v815mathAutoRound815 = !current
    AppToast.show(this, "Math Auto Round815: ${if (!current) "ON" else "OFF"}")
}

// v815: Max Auto Limit815
internal fun PlayerActivity.showV815MaxAutoLimit815Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v815maxAutoLimit815).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit815",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v815maxAutoLimit815 = value
        AppToast.show(this, "Max Auto Limit815: $value")
    }
}

// v815: Measure Auto Unit815
internal fun PlayerActivity.showV815MeasureAutoUnit815Toggle() {
    val current = BiliClient.prefs.v815measureAutoUnit815
    BiliClient.prefs.v815measureAutoUnit815 = !current
    AppToast.show(this, "Measure Auto Unit815: ${if (!current) "ON" else "OFF"}")
}

// v815: Media Auto Codec815
internal fun PlayerActivity.showV815MediaAutoCodec815Toggle() {
    val current = BiliClient.prefs.v815mediaAutoCodec815
    BiliClient.prefs.v815mediaAutoCodec815 = !current
    AppToast.show(this, "Media Auto Codec815: ${if (!current) "ON" else "OFF"}")
}

// v815: Memory Auto Optimize815
internal fun PlayerActivity.showV815MemoryAutoOptimize815Toggle() {
    val current = BiliClient.prefs.v815memoryAutoOptimize815
    BiliClient.prefs.v815memoryAutoOptimize815 = !current
    AppToast.show(this, "Memory Auto Optimize815: ${if (!current) "ON" else "OFF"}")
}

// v815: Menu Auto Context815
internal fun PlayerActivity.showV815MenuAutoContext815Toggle() {
    val current = BiliClient.prefs.v815menuAutoContext815
    BiliClient.prefs.v815menuAutoContext815 = !current
    AppToast.show(this, "Menu Auto Context815: ${if (!current) "ON" else "OFF"}")
}

// v815: Message Auto Queue815
internal fun PlayerActivity.showV815MessageAutoQueue815Toggle() {
    val current = BiliClient.prefs.v815messageAutoQueue815
    BiliClient.prefs.v815messageAutoQueue815 = !current
    AppToast.show(this, "Message Auto Queue815: ${if (!current) "ON" else "OFF"}")
}

// v815: Meta Auto Extract815
internal fun PlayerActivity.showV815MetaAutoExtract815Toggle() {
    val current = BiliClient.prefs.v815metaAutoExtract815
    BiliClient.prefs.v815metaAutoExtract815 = !current
    AppToast.show(this, "Meta Auto Extract815: ${if (!current) "ON" else "OFF"}")
}

// v815: Method Auto Hook815
internal fun PlayerActivity.showV815MethodAutoHook815Toggle() {
    val current = BiliClient.prefs.v815methodAutoHook815
    BiliClient.prefs.v815methodAutoHook815 = !current
    AppToast.show(this, "Method Auto Hook815: ${if (!current) "ON" else "OFF"}")
}

// v815: Middle Auto Center815
internal fun PlayerActivity.showV815MiddleAutoCenter815Toggle() {
    val current = BiliClient.prefs.v815middleAutoCenter815
    BiliClient.prefs.v815middleAutoCenter815 = !current
    AppToast.show(this, "Middle Auto Center815: ${if (!current) "ON" else "OFF"}")
}

// v815: Min Auto Threshold815
internal fun PlayerActivity.showV815MinAutoThreshold815Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v815minAutoThreshold815).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold815",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v815minAutoThreshold815 = value
        AppToast.show(this, "Min Auto Threshold815: $value")
    }
}

// v815: Mode Auto Adaptive815
internal fun PlayerActivity.showV815ModeAutoAdaptive815Toggle() {
    val current = BiliClient.prefs.v815modeAutoAdaptive815
    BiliClient.prefs.v815modeAutoAdaptive815 = !current
    AppToast.show(this, "Mode Auto Adaptive815: ${if (!current) "ON" else "OFF"}")
}

// v815: Model Auto Detect815
internal fun PlayerActivity.showV815ModelAutoDetect815Toggle() {
    val current = BiliClient.prefs.v815modelAutoDetect815
    BiliClient.prefs.v815modelAutoDetect815 = !current
    AppToast.show(this, "Model Auto Detect815: ${if (!current) "ON" else "OFF"}")
}

// v816: Master Auto Sync816
internal fun PlayerActivity.showV816MasterAutoSync816Toggle() {
    val current = BiliClient.prefs.v816masterAutoSync816
    BiliClient.prefs.v816masterAutoSync816 = !current
    AppToast.show(this, "Master Auto Sync816: ${if (!current) "ON" else "OFF"}")
}

// v816: Match Auto Fuzzy816
internal fun PlayerActivity.showV816MatchAutoFuzzy816Toggle() {
    val current = BiliClient.prefs.v816matchAutoFuzzy816
    BiliClient.prefs.v816matchAutoFuzzy816 = !current
    AppToast.show(this, "Match Auto Fuzzy816: ${if (!current) "ON" else "OFF"}")
}

// v816: Math Auto Round816
internal fun PlayerActivity.showV816MathAutoRound816Toggle() {
    val current = BiliClient.prefs.v816mathAutoRound816
    BiliClient.prefs.v816mathAutoRound816 = !current
    AppToast.show(this, "Math Auto Round816: ${if (!current) "ON" else "OFF"}")
}

// v816: Max Auto Limit816
internal fun PlayerActivity.showV816MaxAutoLimit816Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v816maxAutoLimit816).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit816",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v816maxAutoLimit816 = value
        AppToast.show(this, "Max Auto Limit816: $value")
    }
}

// v816: Measure Auto Unit816
internal fun PlayerActivity.showV816MeasureAutoUnit816Toggle() {
    val current = BiliClient.prefs.v816measureAutoUnit816
    BiliClient.prefs.v816measureAutoUnit816 = !current
    AppToast.show(this, "Measure Auto Unit816: ${if (!current) "ON" else "OFF"}")
}

// v816: Media Auto Codec816
internal fun PlayerActivity.showV816MediaAutoCodec816Toggle() {
    val current = BiliClient.prefs.v816mediaAutoCodec816
    BiliClient.prefs.v816mediaAutoCodec816 = !current
    AppToast.show(this, "Media Auto Codec816: ${if (!current) "ON" else "OFF"}")
}

// v816: Memory Auto Optimize816
internal fun PlayerActivity.showV816MemoryAutoOptimize816Toggle() {
    val current = BiliClient.prefs.v816memoryAutoOptimize816
    BiliClient.prefs.v816memoryAutoOptimize816 = !current
    AppToast.show(this, "Memory Auto Optimize816: ${if (!current) "ON" else "OFF"}")
}

// v816: Menu Auto Context816
internal fun PlayerActivity.showV816MenuAutoContext816Toggle() {
    val current = BiliClient.prefs.v816menuAutoContext816
    BiliClient.prefs.v816menuAutoContext816 = !current
    AppToast.show(this, "Menu Auto Context816: ${if (!current) "ON" else "OFF"}")
}

// v816: Message Auto Queue816
internal fun PlayerActivity.showV816MessageAutoQueue816Toggle() {
    val current = BiliClient.prefs.v816messageAutoQueue816
    BiliClient.prefs.v816messageAutoQueue816 = !current
    AppToast.show(this, "Message Auto Queue816: ${if (!current) "ON" else "OFF"}")
}

// v816: Meta Auto Extract816
internal fun PlayerActivity.showV816MetaAutoExtract816Toggle() {
    val current = BiliClient.prefs.v816metaAutoExtract816
    BiliClient.prefs.v816metaAutoExtract816 = !current
    AppToast.show(this, "Meta Auto Extract816: ${if (!current) "ON" else "OFF"}")
}

// v816: Method Auto Hook816
internal fun PlayerActivity.showV816MethodAutoHook816Toggle() {
    val current = BiliClient.prefs.v816methodAutoHook816
    BiliClient.prefs.v816methodAutoHook816 = !current
    AppToast.show(this, "Method Auto Hook816: ${if (!current) "ON" else "OFF"}")
}

// v816: Middle Auto Center816
internal fun PlayerActivity.showV816MiddleAutoCenter816Toggle() {
    val current = BiliClient.prefs.v816middleAutoCenter816
    BiliClient.prefs.v816middleAutoCenter816 = !current
    AppToast.show(this, "Middle Auto Center816: ${if (!current) "ON" else "OFF"}")
}

// v816: Min Auto Threshold816
internal fun PlayerActivity.showV816MinAutoThreshold816Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v816minAutoThreshold816).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold816",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v816minAutoThreshold816 = value
        AppToast.show(this, "Min Auto Threshold816: $value")
    }
}

// v816: Mode Auto Adaptive816
internal fun PlayerActivity.showV816ModeAutoAdaptive816Toggle() {
    val current = BiliClient.prefs.v816modeAutoAdaptive816
    BiliClient.prefs.v816modeAutoAdaptive816 = !current
    AppToast.show(this, "Mode Auto Adaptive816: ${if (!current) "ON" else "OFF"}")
}

// v816: Model Auto Detect816
internal fun PlayerActivity.showV816ModelAutoDetect816Toggle() {
    val current = BiliClient.prefs.v816modelAutoDetect816
    BiliClient.prefs.v816modelAutoDetect816 = !current
    AppToast.show(this, "Model Auto Detect816: ${if (!current) "ON" else "OFF"}")
}

// v817: Master Auto Sync817
internal fun PlayerActivity.showV817MasterAutoSync817Toggle() {
    val current = BiliClient.prefs.v817masterAutoSync817
    BiliClient.prefs.v817masterAutoSync817 = !current
    AppToast.show(this, "Master Auto Sync817: ${if (!current) "ON" else "OFF"}")
}

// v817: Match Auto Fuzzy817
internal fun PlayerActivity.showV817MatchAutoFuzzy817Toggle() {
    val current = BiliClient.prefs.v817matchAutoFuzzy817
    BiliClient.prefs.v817matchAutoFuzzy817 = !current
    AppToast.show(this, "Match Auto Fuzzy817: ${if (!current) "ON" else "OFF"}")
}

// v817: Math Auto Round817
internal fun PlayerActivity.showV817MathAutoRound817Toggle() {
    val current = BiliClient.prefs.v817mathAutoRound817
    BiliClient.prefs.v817mathAutoRound817 = !current
    AppToast.show(this, "Math Auto Round817: ${if (!current) "ON" else "OFF"}")
}

// v817: Max Auto Limit817
internal fun PlayerActivity.showV817MaxAutoLimit817Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v817maxAutoLimit817).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit817",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v817maxAutoLimit817 = value
        AppToast.show(this, "Max Auto Limit817: $value")
    }
}

// v817: Measure Auto Unit817
internal fun PlayerActivity.showV817MeasureAutoUnit817Toggle() {
    val current = BiliClient.prefs.v817measureAutoUnit817
    BiliClient.prefs.v817measureAutoUnit817 = !current
    AppToast.show(this, "Measure Auto Unit817: ${if (!current) "ON" else "OFF"}")
}

// v817: Media Auto Codec817
internal fun PlayerActivity.showV817MediaAutoCodec817Toggle() {
    val current = BiliClient.prefs.v817mediaAutoCodec817
    BiliClient.prefs.v817mediaAutoCodec817 = !current
    AppToast.show(this, "Media Auto Codec817: ${if (!current) "ON" else "OFF"}")
}

// v817: Memory Auto Optimize817
internal fun PlayerActivity.showV817MemoryAutoOptimize817Toggle() {
    val current = BiliClient.prefs.v817memoryAutoOptimize817
    BiliClient.prefs.v817memoryAutoOptimize817 = !current
    AppToast.show(this, "Memory Auto Optimize817: ${if (!current) "ON" else "OFF"}")
}

// v817: Menu Auto Context817
internal fun PlayerActivity.showV817MenuAutoContext817Toggle() {
    val current = BiliClient.prefs.v817menuAutoContext817
    BiliClient.prefs.v817menuAutoContext817 = !current
    AppToast.show(this, "Menu Auto Context817: ${if (!current) "ON" else "OFF"}")
}

// v817: Message Auto Queue817
internal fun PlayerActivity.showV817MessageAutoQueue817Toggle() {
    val current = BiliClient.prefs.v817messageAutoQueue817
    BiliClient.prefs.v817messageAutoQueue817 = !current
    AppToast.show(this, "Message Auto Queue817: ${if (!current) "ON" else "OFF"}")
}

// v817: Meta Auto Extract817
internal fun PlayerActivity.showV817MetaAutoExtract817Toggle() {
    val current = BiliClient.prefs.v817metaAutoExtract817
    BiliClient.prefs.v817metaAutoExtract817 = !current
    AppToast.show(this, "Meta Auto Extract817: ${if (!current) "ON" else "OFF"}")
}

// v817: Method Auto Hook817
internal fun PlayerActivity.showV817MethodAutoHook817Toggle() {
    val current = BiliClient.prefs.v817methodAutoHook817
    BiliClient.prefs.v817methodAutoHook817 = !current
    AppToast.show(this, "Method Auto Hook817: ${if (!current) "ON" else "OFF"}")
}

// v817: Middle Auto Center817
internal fun PlayerActivity.showV817MiddleAutoCenter817Toggle() {
    val current = BiliClient.prefs.v817middleAutoCenter817
    BiliClient.prefs.v817middleAutoCenter817 = !current
    AppToast.show(this, "Middle Auto Center817: ${if (!current) "ON" else "OFF"}")
}

// v817: Min Auto Threshold817
internal fun PlayerActivity.showV817MinAutoThreshold817Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v817minAutoThreshold817).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold817",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v817minAutoThreshold817 = value
        AppToast.show(this, "Min Auto Threshold817: $value")
    }
}

// v817: Mode Auto Adaptive817
internal fun PlayerActivity.showV817ModeAutoAdaptive817Toggle() {
    val current = BiliClient.prefs.v817modeAutoAdaptive817
    BiliClient.prefs.v817modeAutoAdaptive817 = !current
    AppToast.show(this, "Mode Auto Adaptive817: ${if (!current) "ON" else "OFF"}")
}

// v817: Model Auto Detect817
internal fun PlayerActivity.showV817ModelAutoDetect817Toggle() {
    val current = BiliClient.prefs.v817modelAutoDetect817
    BiliClient.prefs.v817modelAutoDetect817 = !current
    AppToast.show(this, "Model Auto Detect817: ${if (!current) "ON" else "OFF"}")
}

// v818: Master Auto Sync818
internal fun PlayerActivity.showV818MasterAutoSync818Toggle() {
    val current = BiliClient.prefs.v818masterAutoSync818
    BiliClient.prefs.v818masterAutoSync818 = !current
    AppToast.show(this, "Master Auto Sync818: ${if (!current) "ON" else "OFF"}")
}

// v818: Match Auto Fuzzy818
internal fun PlayerActivity.showV818MatchAutoFuzzy818Toggle() {
    val current = BiliClient.prefs.v818matchAutoFuzzy818
    BiliClient.prefs.v818matchAutoFuzzy818 = !current
    AppToast.show(this, "Match Auto Fuzzy818: ${if (!current) "ON" else "OFF"}")
}

// v818: Math Auto Round818
internal fun PlayerActivity.showV818MathAutoRound818Toggle() {
    val current = BiliClient.prefs.v818mathAutoRound818
    BiliClient.prefs.v818mathAutoRound818 = !current
    AppToast.show(this, "Math Auto Round818: ${if (!current) "ON" else "OFF"}")
}

// v818: Max Auto Limit818
internal fun PlayerActivity.showV818MaxAutoLimit818Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v818maxAutoLimit818).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit818",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v818maxAutoLimit818 = value
        AppToast.show(this, "Max Auto Limit818: $value")
    }
}

// v818: Measure Auto Unit818
internal fun PlayerActivity.showV818MeasureAutoUnit818Toggle() {
    val current = BiliClient.prefs.v818measureAutoUnit818
    BiliClient.prefs.v818measureAutoUnit818 = !current
    AppToast.show(this, "Measure Auto Unit818: ${if (!current) "ON" else "OFF"}")
}

// v818: Media Auto Codec818
internal fun PlayerActivity.showV818MediaAutoCodec818Toggle() {
    val current = BiliClient.prefs.v818mediaAutoCodec818
    BiliClient.prefs.v818mediaAutoCodec818 = !current
    AppToast.show(this, "Media Auto Codec818: ${if (!current) "ON" else "OFF"}")
}

// v818: Memory Auto Optimize818
internal fun PlayerActivity.showV818MemoryAutoOptimize818Toggle() {
    val current = BiliClient.prefs.v818memoryAutoOptimize818
    BiliClient.prefs.v818memoryAutoOptimize818 = !current
    AppToast.show(this, "Memory Auto Optimize818: ${if (!current) "ON" else "OFF"}")
}

// v818: Menu Auto Context818
internal fun PlayerActivity.showV818MenuAutoContext818Toggle() {
    val current = BiliClient.prefs.v818menuAutoContext818
    BiliClient.prefs.v818menuAutoContext818 = !current
    AppToast.show(this, "Menu Auto Context818: ${if (!current) "ON" else "OFF"}")
}

// v818: Message Auto Queue818
internal fun PlayerActivity.showV818MessageAutoQueue818Toggle() {
    val current = BiliClient.prefs.v818messageAutoQueue818
    BiliClient.prefs.v818messageAutoQueue818 = !current
    AppToast.show(this, "Message Auto Queue818: ${if (!current) "ON" else "OFF"}")
}

// v818: Meta Auto Extract818
internal fun PlayerActivity.showV818MetaAutoExtract818Toggle() {
    val current = BiliClient.prefs.v818metaAutoExtract818
    BiliClient.prefs.v818metaAutoExtract818 = !current
    AppToast.show(this, "Meta Auto Extract818: ${if (!current) "ON" else "OFF"}")
}

// v818: Method Auto Hook818
internal fun PlayerActivity.showV818MethodAutoHook818Toggle() {
    val current = BiliClient.prefs.v818methodAutoHook818
    BiliClient.prefs.v818methodAutoHook818 = !current
    AppToast.show(this, "Method Auto Hook818: ${if (!current) "ON" else "OFF"}")
}

// v818: Middle Auto Center818
internal fun PlayerActivity.showV818MiddleAutoCenter818Toggle() {
    val current = BiliClient.prefs.v818middleAutoCenter818
    BiliClient.prefs.v818middleAutoCenter818 = !current
    AppToast.show(this, "Middle Auto Center818: ${if (!current) "ON" else "OFF"}")
}

// v818: Min Auto Threshold818
internal fun PlayerActivity.showV818MinAutoThreshold818Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v818minAutoThreshold818).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold818",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v818minAutoThreshold818 = value
        AppToast.show(this, "Min Auto Threshold818: $value")
    }
}

// v818: Mode Auto Adaptive818
internal fun PlayerActivity.showV818ModeAutoAdaptive818Toggle() {
    val current = BiliClient.prefs.v818modeAutoAdaptive818
    BiliClient.prefs.v818modeAutoAdaptive818 = !current
    AppToast.show(this, "Mode Auto Adaptive818: ${if (!current) "ON" else "OFF"}")
}

// v818: Model Auto Detect818
internal fun PlayerActivity.showV818ModelAutoDetect818Toggle() {
    val current = BiliClient.prefs.v818modelAutoDetect818
    BiliClient.prefs.v818modelAutoDetect818 = !current
    AppToast.show(this, "Model Auto Detect818: ${if (!current) "ON" else "OFF"}")
}

// v819: Master Auto Sync819
internal fun PlayerActivity.showV819MasterAutoSync819Toggle() {
    val current = BiliClient.prefs.v819masterAutoSync819
    BiliClient.prefs.v819masterAutoSync819 = !current
    AppToast.show(this, "Master Auto Sync819: ${if (!current) "ON" else "OFF"}")
}

// v819: Match Auto Fuzzy819
internal fun PlayerActivity.showV819MatchAutoFuzzy819Toggle() {
    val current = BiliClient.prefs.v819matchAutoFuzzy819
    BiliClient.prefs.v819matchAutoFuzzy819 = !current
    AppToast.show(this, "Match Auto Fuzzy819: ${if (!current) "ON" else "OFF"}")
}

// v819: Math Auto Round819
internal fun PlayerActivity.showV819MathAutoRound819Toggle() {
    val current = BiliClient.prefs.v819mathAutoRound819
    BiliClient.prefs.v819mathAutoRound819 = !current
    AppToast.show(this, "Math Auto Round819: ${if (!current) "ON" else "OFF"}")
}

// v819: Max Auto Limit819
internal fun PlayerActivity.showV819MaxAutoLimit819Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v819maxAutoLimit819).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit819",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v819maxAutoLimit819 = value
        AppToast.show(this, "Max Auto Limit819: $value")
    }
}

// v819: Measure Auto Unit819
internal fun PlayerActivity.showV819MeasureAutoUnit819Toggle() {
    val current = BiliClient.prefs.v819measureAutoUnit819
    BiliClient.prefs.v819measureAutoUnit819 = !current
    AppToast.show(this, "Measure Auto Unit819: ${if (!current) "ON" else "OFF"}")
}

// v819: Media Auto Codec819
internal fun PlayerActivity.showV819MediaAutoCodec819Toggle() {
    val current = BiliClient.prefs.v819mediaAutoCodec819
    BiliClient.prefs.v819mediaAutoCodec819 = !current
    AppToast.show(this, "Media Auto Codec819: ${if (!current) "ON" else "OFF"}")
}

// v819: Memory Auto Optimize819
internal fun PlayerActivity.showV819MemoryAutoOptimize819Toggle() {
    val current = BiliClient.prefs.v819memoryAutoOptimize819
    BiliClient.prefs.v819memoryAutoOptimize819 = !current
    AppToast.show(this, "Memory Auto Optimize819: ${if (!current) "ON" else "OFF"}")
}

// v819: Menu Auto Context819
internal fun PlayerActivity.showV819MenuAutoContext819Toggle() {
    val current = BiliClient.prefs.v819menuAutoContext819
    BiliClient.prefs.v819menuAutoContext819 = !current
    AppToast.show(this, "Menu Auto Context819: ${if (!current) "ON" else "OFF"}")
}

// v819: Message Auto Queue819
internal fun PlayerActivity.showV819MessageAutoQueue819Toggle() {
    val current = BiliClient.prefs.v819messageAutoQueue819
    BiliClient.prefs.v819messageAutoQueue819 = !current
    AppToast.show(this, "Message Auto Queue819: ${if (!current) "ON" else "OFF"}")
}

// v819: Meta Auto Extract819
internal fun PlayerActivity.showV819MetaAutoExtract819Toggle() {
    val current = BiliClient.prefs.v819metaAutoExtract819
    BiliClient.prefs.v819metaAutoExtract819 = !current
    AppToast.show(this, "Meta Auto Extract819: ${if (!current) "ON" else "OFF"}")
}

// v819: Method Auto Hook819
internal fun PlayerActivity.showV819MethodAutoHook819Toggle() {
    val current = BiliClient.prefs.v819methodAutoHook819
    BiliClient.prefs.v819methodAutoHook819 = !current
    AppToast.show(this, "Method Auto Hook819: ${if (!current) "ON" else "OFF"}")
}

// v819: Middle Auto Center819
internal fun PlayerActivity.showV819MiddleAutoCenter819Toggle() {
    val current = BiliClient.prefs.v819middleAutoCenter819
    BiliClient.prefs.v819middleAutoCenter819 = !current
    AppToast.show(this, "Middle Auto Center819: ${if (!current) "ON" else "OFF"}")
}

// v819: Min Auto Threshold819
internal fun PlayerActivity.showV819MinAutoThreshold819Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v819minAutoThreshold819).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold819",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v819minAutoThreshold819 = value
        AppToast.show(this, "Min Auto Threshold819: $value")
    }
}

// v819: Mode Auto Adaptive819
internal fun PlayerActivity.showV819ModeAutoAdaptive819Toggle() {
    val current = BiliClient.prefs.v819modeAutoAdaptive819
    BiliClient.prefs.v819modeAutoAdaptive819 = !current
    AppToast.show(this, "Mode Auto Adaptive819: ${if (!current) "ON" else "OFF"}")
}

// v819: Model Auto Detect819
internal fun PlayerActivity.showV819ModelAutoDetect819Toggle() {
    val current = BiliClient.prefs.v819modelAutoDetect819
    BiliClient.prefs.v819modelAutoDetect819 = !current
    AppToast.show(this, "Model Auto Detect819: ${if (!current) "ON" else "OFF"}")
}

// v820: Master Auto Sync820
internal fun PlayerActivity.showV820MasterAutoSync820Toggle() {
    val current = BiliClient.prefs.v820masterAutoSync820
    BiliClient.prefs.v820masterAutoSync820 = !current
    AppToast.show(this, "Master Auto Sync820: ${if (!current) "ON" else "OFF"}")
}

// v820: Match Auto Fuzzy820
internal fun PlayerActivity.showV820MatchAutoFuzzy820Toggle() {
    val current = BiliClient.prefs.v820matchAutoFuzzy820
    BiliClient.prefs.v820matchAutoFuzzy820 = !current
    AppToast.show(this, "Match Auto Fuzzy820: ${if (!current) "ON" else "OFF"}")
}

// v820: Math Auto Round820
internal fun PlayerActivity.showV820MathAutoRound820Toggle() {
    val current = BiliClient.prefs.v820mathAutoRound820
    BiliClient.prefs.v820mathAutoRound820 = !current
    AppToast.show(this, "Math Auto Round820: ${if (!current) "ON" else "OFF"}")
}

// v820: Max Auto Limit820
internal fun PlayerActivity.showV820MaxAutoLimit820Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v820maxAutoLimit820).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Auto Limit820",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v820maxAutoLimit820 = value
        AppToast.show(this, "Max Auto Limit820: $value")
    }
}

// v820: Measure Auto Unit820
internal fun PlayerActivity.showV820MeasureAutoUnit820Toggle() {
    val current = BiliClient.prefs.v820measureAutoUnit820
    BiliClient.prefs.v820measureAutoUnit820 = !current
    AppToast.show(this, "Measure Auto Unit820: ${if (!current) "ON" else "OFF"}")
}

// v820: Media Auto Codec820
internal fun PlayerActivity.showV820MediaAutoCodec820Toggle() {
    val current = BiliClient.prefs.v820mediaAutoCodec820
    BiliClient.prefs.v820mediaAutoCodec820 = !current
    AppToast.show(this, "Media Auto Codec820: ${if (!current) "ON" else "OFF"}")
}

// v820: Memory Auto Optimize820
internal fun PlayerActivity.showV820MemoryAutoOptimize820Toggle() {
    val current = BiliClient.prefs.v820memoryAutoOptimize820
    BiliClient.prefs.v820memoryAutoOptimize820 = !current
    AppToast.show(this, "Memory Auto Optimize820: ${if (!current) "ON" else "OFF"}")
}

// v820: Menu Auto Context820
internal fun PlayerActivity.showV820MenuAutoContext820Toggle() {
    val current = BiliClient.prefs.v820menuAutoContext820
    BiliClient.prefs.v820menuAutoContext820 = !current
    AppToast.show(this, "Menu Auto Context820: ${if (!current) "ON" else "OFF"}")
}

// v820: Message Auto Queue820
internal fun PlayerActivity.showV820MessageAutoQueue820Toggle() {
    val current = BiliClient.prefs.v820messageAutoQueue820
    BiliClient.prefs.v820messageAutoQueue820 = !current
    AppToast.show(this, "Message Auto Queue820: ${if (!current) "ON" else "OFF"}")
}

// v820: Meta Auto Extract820
internal fun PlayerActivity.showV820MetaAutoExtract820Toggle() {
    val current = BiliClient.prefs.v820metaAutoExtract820
    BiliClient.prefs.v820metaAutoExtract820 = !current
    AppToast.show(this, "Meta Auto Extract820: ${if (!current) "ON" else "OFF"}")
}

// v820: Method Auto Hook820
internal fun PlayerActivity.showV820MethodAutoHook820Toggle() {
    val current = BiliClient.prefs.v820methodAutoHook820
    BiliClient.prefs.v820methodAutoHook820 = !current
    AppToast.show(this, "Method Auto Hook820: ${if (!current) "ON" else "OFF"}")
}

// v820: Middle Auto Center820
internal fun PlayerActivity.showV820MiddleAutoCenter820Toggle() {
    val current = BiliClient.prefs.v820middleAutoCenter820
    BiliClient.prefs.v820middleAutoCenter820 = !current
    AppToast.show(this, "Middle Auto Center820: ${if (!current) "ON" else "OFF"}")
}

// v820: Min Auto Threshold820
internal fun PlayerActivity.showV820MinAutoThreshold820Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v820minAutoThreshold820).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Auto Threshold820",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v820minAutoThreshold820 = value
        AppToast.show(this, "Min Auto Threshold820: $value")
    }
}

// v820: Mode Auto Adaptive820
internal fun PlayerActivity.showV820ModeAutoAdaptive820Toggle() {
    val current = BiliClient.prefs.v820modeAutoAdaptive820
    BiliClient.prefs.v820modeAutoAdaptive820 = !current
    AppToast.show(this, "Mode Auto Adaptive820: ${if (!current) "ON" else "OFF"}")
}

// v820: Model Auto Detect820
internal fun PlayerActivity.showV820ModelAutoDetect820Toggle() {
    val current = BiliClient.prefs.v820modelAutoDetect820
    BiliClient.prefs.v820modelAutoDetect820 = !current
    AppToast.show(this, "Model Auto Detect820: ${if (!current) "ON" else "OFF"}")
}

