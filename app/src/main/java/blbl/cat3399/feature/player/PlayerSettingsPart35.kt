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

// v476: Merge Auto Resolve476
internal fun PlayerActivity.showV476MergeAutoResolve476Toggle() {
    val current = BiliClient.prefs.v476mergeAutoResolve476
    BiliClient.prefs.v476mergeAutoResolve476 = !current
    AppToast.show(this, "Merge Auto Resolve476: ${if (!current) "ON" else "OFF"}")
}

// v476: Message Auto Reply476
internal fun PlayerActivity.showV476MessageAutoReply476Toggle() {
    val current = BiliClient.prefs.v476messageAutoReply476
    BiliClient.prefs.v476messageAutoReply476 = !current
    AppToast.show(this, "Message Auto Reply476: ${if (!current) "ON" else "OFF"}")
}

// v476: Method Auto Invoke476
internal fun PlayerActivity.showV476MethodAutoInvoke476Toggle() {
    val current = BiliClient.prefs.v476methodAutoInvoke476
    BiliClient.prefs.v476methodAutoInvoke476 = !current
    AppToast.show(this, "Method Auto Invoke476: ${if (!current) "ON" else "OFF"}")
}

// v476: Mic Auto Mute476
internal fun PlayerActivity.showV476MicAutoMute476Toggle() {
    val current = BiliClient.prefs.v476micAutoMute476
    BiliClient.prefs.v476micAutoMute476 = !current
    AppToast.show(this, "Mic Auto Mute476: ${if (!current) "ON" else "OFF"}")
}

// v476: Min Bitrate Auto476
internal fun PlayerActivity.showV476MinBitrateAuto476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476minBitrateAuto476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476minBitrateAuto476 = value
        AppToast.show(this, "Min Bitrate Auto476: $value")
    }
}

// v476: Mode Auto Switch476
internal fun PlayerActivity.showV476ModeAutoSwitch476Toggle() {
    val current = BiliClient.prefs.v476modeAutoSwitch476
    BiliClient.prefs.v476modeAutoSwitch476 = !current
    AppToast.show(this, "Mode Auto Switch476: ${if (!current) "ON" else "OFF"}")
}

// v476: Model Auto Load476
internal fun PlayerActivity.showV476ModelAutoLoad476Toggle() {
    val current = BiliClient.prefs.v476modelAutoLoad476
    BiliClient.prefs.v476modelAutoLoad476 = !current
    AppToast.show(this, "Model Auto Load476: ${if (!current) "ON" else "OFF"}")
}

// v477: Mark Auto Highlight477
internal fun PlayerActivity.showV477MarkAutoHighlight477Toggle() {
    val current = BiliClient.prefs.v477markAutoHighlight477
    BiliClient.prefs.v477markAutoHighlight477 = !current
    AppToast.show(this, "Mark Auto Highlight477: ${if (!current) "ON" else "OFF"}")
}

// v477: Mask Auto Apply477
internal fun PlayerActivity.showV477MaskAutoApply477Toggle() {
    val current = BiliClient.prefs.v477maskAutoApply477
    BiliClient.prefs.v477maskAutoApply477 = !current
    AppToast.show(this, "Mask Auto Apply477: ${if (!current) "ON" else "OFF"}")
}

// v477: Match Auto Start477
internal fun PlayerActivity.showV477MatchAutoStart477Toggle() {
    val current = BiliClient.prefs.v477matchAutoStart477
    BiliClient.prefs.v477matchAutoStart477 = !current
    AppToast.show(this, "Match Auto Start477: ${if (!current) "ON" else "OFF"}")
}

// v477: Matrix Transform477
internal fun PlayerActivity.showV477MatrixTransform477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477matrixTransform477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477matrixTransform477 = value
        AppToast.show(this, "Matrix Transform477: $value")
    }
}

// v477: Max Concurrent Load477
internal fun PlayerActivity.showV477MaxConcurrentLoad477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477maxConcurrentLoad477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477maxConcurrentLoad477 = value
        AppToast.show(this, "Max Concurrent Load477: $value")
    }
}

// v477: Measure Auto Calibrate477
internal fun PlayerActivity.showV477MeasureAutoCalibrate477Toggle() {
    val current = BiliClient.prefs.v477measureAutoCalibrate477
    BiliClient.prefs.v477measureAutoCalibrate477 = !current
    AppToast.show(this, "Measure Auto Calibrate477: ${if (!current) "ON" else "OFF"}")
}

// v477: Media Auto Detect477
internal fun PlayerActivity.showV477MediaAutoDetect477Toggle() {
    val current = BiliClient.prefs.v477mediaAutoDetect477
    BiliClient.prefs.v477mediaAutoDetect477 = !current
    AppToast.show(this, "Media Auto Detect477: ${if (!current) "ON" else "OFF"}")
}

// v477: Memory Optimize Auto477
internal fun PlayerActivity.showV477MemoryOptimizeAuto477Toggle() {
    val current = BiliClient.prefs.v477memoryOptimizeAuto477
    BiliClient.prefs.v477memoryOptimizeAuto477 = !current
    AppToast.show(this, "Memory Optimize Auto477: ${if (!current) "ON" else "OFF"}")
}

// v477: Merge Auto Resolve477
internal fun PlayerActivity.showV477MergeAutoResolve477Toggle() {
    val current = BiliClient.prefs.v477mergeAutoResolve477
    BiliClient.prefs.v477mergeAutoResolve477 = !current
    AppToast.show(this, "Merge Auto Resolve477: ${if (!current) "ON" else "OFF"}")
}

// v477: Message Auto Reply477
internal fun PlayerActivity.showV477MessageAutoReply477Toggle() {
    val current = BiliClient.prefs.v477messageAutoReply477
    BiliClient.prefs.v477messageAutoReply477 = !current
    AppToast.show(this, "Message Auto Reply477: ${if (!current) "ON" else "OFF"}")
}

// v477: Method Auto Invoke477
internal fun PlayerActivity.showV477MethodAutoInvoke477Toggle() {
    val current = BiliClient.prefs.v477methodAutoInvoke477
    BiliClient.prefs.v477methodAutoInvoke477 = !current
    AppToast.show(this, "Method Auto Invoke477: ${if (!current) "ON" else "OFF"}")
}

// v477: Mic Auto Mute477
internal fun PlayerActivity.showV477MicAutoMute477Toggle() {
    val current = BiliClient.prefs.v477micAutoMute477
    BiliClient.prefs.v477micAutoMute477 = !current
    AppToast.show(this, "Mic Auto Mute477: ${if (!current) "ON" else "OFF"}")
}

// v477: Min Bitrate Auto477
internal fun PlayerActivity.showV477MinBitrateAuto477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477minBitrateAuto477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477minBitrateAuto477 = value
        AppToast.show(this, "Min Bitrate Auto477: $value")
    }
}

// v477: Mode Auto Switch477
internal fun PlayerActivity.showV477ModeAutoSwitch477Toggle() {
    val current = BiliClient.prefs.v477modeAutoSwitch477
    BiliClient.prefs.v477modeAutoSwitch477 = !current
    AppToast.show(this, "Mode Auto Switch477: ${if (!current) "ON" else "OFF"}")
}

// v477: Model Auto Load477
internal fun PlayerActivity.showV477ModelAutoLoad477Toggle() {
    val current = BiliClient.prefs.v477modelAutoLoad477
    BiliClient.prefs.v477modelAutoLoad477 = !current
    AppToast.show(this, "Model Auto Load477: ${if (!current) "ON" else "OFF"}")
}

// v478: Mark Auto Highlight478
internal fun PlayerActivity.showV478MarkAutoHighlight478Toggle() {
    val current = BiliClient.prefs.v478markAutoHighlight478
    BiliClient.prefs.v478markAutoHighlight478 = !current
    AppToast.show(this, "Mark Auto Highlight478: ${if (!current) "ON" else "OFF"}")
}

// v478: Mask Auto Apply478
internal fun PlayerActivity.showV478MaskAutoApply478Toggle() {
    val current = BiliClient.prefs.v478maskAutoApply478
    BiliClient.prefs.v478maskAutoApply478 = !current
    AppToast.show(this, "Mask Auto Apply478: ${if (!current) "ON" else "OFF"}")
}

// v478: Match Auto Start478
internal fun PlayerActivity.showV478MatchAutoStart478Toggle() {
    val current = BiliClient.prefs.v478matchAutoStart478
    BiliClient.prefs.v478matchAutoStart478 = !current
    AppToast.show(this, "Match Auto Start478: ${if (!current) "ON" else "OFF"}")
}

// v478: Matrix Transform478
internal fun PlayerActivity.showV478MatrixTransform478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478matrixTransform478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478matrixTransform478 = value
        AppToast.show(this, "Matrix Transform478: $value")
    }
}

// v478: Max Concurrent Load478
internal fun PlayerActivity.showV478MaxConcurrentLoad478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478maxConcurrentLoad478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478maxConcurrentLoad478 = value
        AppToast.show(this, "Max Concurrent Load478: $value")
    }
}

// v478: Measure Auto Calibrate478
internal fun PlayerActivity.showV478MeasureAutoCalibrate478Toggle() {
    val current = BiliClient.prefs.v478measureAutoCalibrate478
    BiliClient.prefs.v478measureAutoCalibrate478 = !current
    AppToast.show(this, "Measure Auto Calibrate478: ${if (!current) "ON" else "OFF"}")
}

// v478: Media Auto Detect478
internal fun PlayerActivity.showV478MediaAutoDetect478Toggle() {
    val current = BiliClient.prefs.v478mediaAutoDetect478
    BiliClient.prefs.v478mediaAutoDetect478 = !current
    AppToast.show(this, "Media Auto Detect478: ${if (!current) "ON" else "OFF"}")
}

// v478: Memory Optimize Auto478
internal fun PlayerActivity.showV478MemoryOptimizeAuto478Toggle() {
    val current = BiliClient.prefs.v478memoryOptimizeAuto478
    BiliClient.prefs.v478memoryOptimizeAuto478 = !current
    AppToast.show(this, "Memory Optimize Auto478: ${if (!current) "ON" else "OFF"}")
}

// v478: Merge Auto Resolve478
internal fun PlayerActivity.showV478MergeAutoResolve478Toggle() {
    val current = BiliClient.prefs.v478mergeAutoResolve478
    BiliClient.prefs.v478mergeAutoResolve478 = !current
    AppToast.show(this, "Merge Auto Resolve478: ${if (!current) "ON" else "OFF"}")
}

// v478: Message Auto Reply478
internal fun PlayerActivity.showV478MessageAutoReply478Toggle() {
    val current = BiliClient.prefs.v478messageAutoReply478
    BiliClient.prefs.v478messageAutoReply478 = !current
    AppToast.show(this, "Message Auto Reply478: ${if (!current) "ON" else "OFF"}")
}

// v478: Method Auto Invoke478
internal fun PlayerActivity.showV478MethodAutoInvoke478Toggle() {
    val current = BiliClient.prefs.v478methodAutoInvoke478
    BiliClient.prefs.v478methodAutoInvoke478 = !current
    AppToast.show(this, "Method Auto Invoke478: ${if (!current) "ON" else "OFF"}")
}

// v478: Mic Auto Mute478
internal fun PlayerActivity.showV478MicAutoMute478Toggle() {
    val current = BiliClient.prefs.v478micAutoMute478
    BiliClient.prefs.v478micAutoMute478 = !current
    AppToast.show(this, "Mic Auto Mute478: ${if (!current) "ON" else "OFF"}")
}

// v478: Min Bitrate Auto478
internal fun PlayerActivity.showV478MinBitrateAuto478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478minBitrateAuto478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478minBitrateAuto478 = value
        AppToast.show(this, "Min Bitrate Auto478: $value")
    }
}

// v478: Mode Auto Switch478
internal fun PlayerActivity.showV478ModeAutoSwitch478Toggle() {
    val current = BiliClient.prefs.v478modeAutoSwitch478
    BiliClient.prefs.v478modeAutoSwitch478 = !current
    AppToast.show(this, "Mode Auto Switch478: ${if (!current) "ON" else "OFF"}")
}

// v478: Model Auto Load478
internal fun PlayerActivity.showV478ModelAutoLoad478Toggle() {
    val current = BiliClient.prefs.v478modelAutoLoad478
    BiliClient.prefs.v478modelAutoLoad478 = !current
    AppToast.show(this, "Model Auto Load478: ${if (!current) "ON" else "OFF"}")
}

// v479: Mark Auto Highlight479
internal fun PlayerActivity.showV479MarkAutoHighlight479Toggle() {
    val current = BiliClient.prefs.v479markAutoHighlight479
    BiliClient.prefs.v479markAutoHighlight479 = !current
    AppToast.show(this, "Mark Auto Highlight479: ${if (!current) "ON" else "OFF"}")
}

// v479: Mask Auto Apply479
internal fun PlayerActivity.showV479MaskAutoApply479Toggle() {
    val current = BiliClient.prefs.v479maskAutoApply479
    BiliClient.prefs.v479maskAutoApply479 = !current
    AppToast.show(this, "Mask Auto Apply479: ${if (!current) "ON" else "OFF"}")
}

// v479: Match Auto Start479
internal fun PlayerActivity.showV479MatchAutoStart479Toggle() {
    val current = BiliClient.prefs.v479matchAutoStart479
    BiliClient.prefs.v479matchAutoStart479 = !current
    AppToast.show(this, "Match Auto Start479: ${if (!current) "ON" else "OFF"}")
}

// v479: Matrix Transform479
internal fun PlayerActivity.showV479MatrixTransform479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479matrixTransform479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479matrixTransform479 = value
        AppToast.show(this, "Matrix Transform479: $value")
    }
}

// v479: Max Concurrent Load479
internal fun PlayerActivity.showV479MaxConcurrentLoad479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479maxConcurrentLoad479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479maxConcurrentLoad479 = value
        AppToast.show(this, "Max Concurrent Load479: $value")
    }
}

// v479: Measure Auto Calibrate479
internal fun PlayerActivity.showV479MeasureAutoCalibrate479Toggle() {
    val current = BiliClient.prefs.v479measureAutoCalibrate479
    BiliClient.prefs.v479measureAutoCalibrate479 = !current
    AppToast.show(this, "Measure Auto Calibrate479: ${if (!current) "ON" else "OFF"}")
}

// v479: Media Auto Detect479
internal fun PlayerActivity.showV479MediaAutoDetect479Toggle() {
    val current = BiliClient.prefs.v479mediaAutoDetect479
    BiliClient.prefs.v479mediaAutoDetect479 = !current
    AppToast.show(this, "Media Auto Detect479: ${if (!current) "ON" else "OFF"}")
}

// v479: Memory Optimize Auto479
internal fun PlayerActivity.showV479MemoryOptimizeAuto479Toggle() {
    val current = BiliClient.prefs.v479memoryOptimizeAuto479
    BiliClient.prefs.v479memoryOptimizeAuto479 = !current
    AppToast.show(this, "Memory Optimize Auto479: ${if (!current) "ON" else "OFF"}")
}

// v479: Merge Auto Resolve479
internal fun PlayerActivity.showV479MergeAutoResolve479Toggle() {
    val current = BiliClient.prefs.v479mergeAutoResolve479
    BiliClient.prefs.v479mergeAutoResolve479 = !current
    AppToast.show(this, "Merge Auto Resolve479: ${if (!current) "ON" else "OFF"}")
}

// v479: Message Auto Reply479
internal fun PlayerActivity.showV479MessageAutoReply479Toggle() {
    val current = BiliClient.prefs.v479messageAutoReply479
    BiliClient.prefs.v479messageAutoReply479 = !current
    AppToast.show(this, "Message Auto Reply479: ${if (!current) "ON" else "OFF"}")
}

// v479: Method Auto Invoke479
internal fun PlayerActivity.showV479MethodAutoInvoke479Toggle() {
    val current = BiliClient.prefs.v479methodAutoInvoke479
    BiliClient.prefs.v479methodAutoInvoke479 = !current
    AppToast.show(this, "Method Auto Invoke479: ${if (!current) "ON" else "OFF"}")
}

// v479: Mic Auto Mute479
internal fun PlayerActivity.showV479MicAutoMute479Toggle() {
    val current = BiliClient.prefs.v479micAutoMute479
    BiliClient.prefs.v479micAutoMute479 = !current
    AppToast.show(this, "Mic Auto Mute479: ${if (!current) "ON" else "OFF"}")
}

// v479: Min Bitrate Auto479
internal fun PlayerActivity.showV479MinBitrateAuto479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479minBitrateAuto479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479minBitrateAuto479 = value
        AppToast.show(this, "Min Bitrate Auto479: $value")
    }
}

// v479: Mode Auto Switch479
internal fun PlayerActivity.showV479ModeAutoSwitch479Toggle() {
    val current = BiliClient.prefs.v479modeAutoSwitch479
    BiliClient.prefs.v479modeAutoSwitch479 = !current
    AppToast.show(this, "Mode Auto Switch479: ${if (!current) "ON" else "OFF"}")
}

// v479: Model Auto Load479
internal fun PlayerActivity.showV479ModelAutoLoad479Toggle() {
    val current = BiliClient.prefs.v479modelAutoLoad479
    BiliClient.prefs.v479modelAutoLoad479 = !current
    AppToast.show(this, "Model Auto Load479: ${if (!current) "ON" else "OFF"}")
}

// v480: Mark Auto Highlight480
internal fun PlayerActivity.showV480MarkAutoHighlight480Toggle() {
    val current = BiliClient.prefs.v480markAutoHighlight480
    BiliClient.prefs.v480markAutoHighlight480 = !current
    AppToast.show(this, "Mark Auto Highlight480: ${if (!current) "ON" else "OFF"}")
}

// v480: Mask Auto Apply480
internal fun PlayerActivity.showV480MaskAutoApply480Toggle() {
    val current = BiliClient.prefs.v480maskAutoApply480
    BiliClient.prefs.v480maskAutoApply480 = !current
    AppToast.show(this, "Mask Auto Apply480: ${if (!current) "ON" else "OFF"}")
}

// v480: Match Auto Start480
internal fun PlayerActivity.showV480MatchAutoStart480Toggle() {
    val current = BiliClient.prefs.v480matchAutoStart480
    BiliClient.prefs.v480matchAutoStart480 = !current
    AppToast.show(this, "Match Auto Start480: ${if (!current) "ON" else "OFF"}")
}

// v480: Matrix Transform480
internal fun PlayerActivity.showV480MatrixTransform480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480matrixTransform480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480matrixTransform480 = value
        AppToast.show(this, "Matrix Transform480: $value")
    }
}

// v480: Max Concurrent Load480
internal fun PlayerActivity.showV480MaxConcurrentLoad480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480maxConcurrentLoad480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480maxConcurrentLoad480 = value
        AppToast.show(this, "Max Concurrent Load480: $value")
    }
}

// v480: Measure Auto Calibrate480
internal fun PlayerActivity.showV480MeasureAutoCalibrate480Toggle() {
    val current = BiliClient.prefs.v480measureAutoCalibrate480
    BiliClient.prefs.v480measureAutoCalibrate480 = !current
    AppToast.show(this, "Measure Auto Calibrate480: ${if (!current) "ON" else "OFF"}")
}

// v480: Media Auto Detect480
internal fun PlayerActivity.showV480MediaAutoDetect480Toggle() {
    val current = BiliClient.prefs.v480mediaAutoDetect480
    BiliClient.prefs.v480mediaAutoDetect480 = !current
    AppToast.show(this, "Media Auto Detect480: ${if (!current) "ON" else "OFF"}")
}

// v480: Memory Optimize Auto480
internal fun PlayerActivity.showV480MemoryOptimizeAuto480Toggle() {
    val current = BiliClient.prefs.v480memoryOptimizeAuto480
    BiliClient.prefs.v480memoryOptimizeAuto480 = !current
    AppToast.show(this, "Memory Optimize Auto480: ${if (!current) "ON" else "OFF"}")
}

// v480: Merge Auto Resolve480
internal fun PlayerActivity.showV480MergeAutoResolve480Toggle() {
    val current = BiliClient.prefs.v480mergeAutoResolve480
    BiliClient.prefs.v480mergeAutoResolve480 = !current
    AppToast.show(this, "Merge Auto Resolve480: ${if (!current) "ON" else "OFF"}")
}

// v480: Message Auto Reply480
internal fun PlayerActivity.showV480MessageAutoReply480Toggle() {
    val current = BiliClient.prefs.v480messageAutoReply480
    BiliClient.prefs.v480messageAutoReply480 = !current
    AppToast.show(this, "Message Auto Reply480: ${if (!current) "ON" else "OFF"}")
}

// v480: Method Auto Invoke480
internal fun PlayerActivity.showV480MethodAutoInvoke480Toggle() {
    val current = BiliClient.prefs.v480methodAutoInvoke480
    BiliClient.prefs.v480methodAutoInvoke480 = !current
    AppToast.show(this, "Method Auto Invoke480: ${if (!current) "ON" else "OFF"}")
}

// v480: Mic Auto Mute480
internal fun PlayerActivity.showV480MicAutoMute480Toggle() {
    val current = BiliClient.prefs.v480micAutoMute480
    BiliClient.prefs.v480micAutoMute480 = !current
    AppToast.show(this, "Mic Auto Mute480: ${if (!current) "ON" else "OFF"}")
}

// v480: Min Bitrate Auto480
internal fun PlayerActivity.showV480MinBitrateAuto480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480minBitrateAuto480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480minBitrateAuto480 = value
        AppToast.show(this, "Min Bitrate Auto480: $value")
    }
}

// v480: Mode Auto Switch480
internal fun PlayerActivity.showV480ModeAutoSwitch480Toggle() {
    val current = BiliClient.prefs.v480modeAutoSwitch480
    BiliClient.prefs.v480modeAutoSwitch480 = !current
    AppToast.show(this, "Mode Auto Switch480: ${if (!current) "ON" else "OFF"}")
}

// v480: Model Auto Load480
internal fun PlayerActivity.showV480ModelAutoLoad480Toggle() {
    val current = BiliClient.prefs.v480modelAutoLoad480
    BiliClient.prefs.v480modelAutoLoad480 = !current
    AppToast.show(this, "Model Auto Load480: ${if (!current) "ON" else "OFF"}")
}

// v481: Module Auto Load481
internal fun PlayerActivity.showV481ModuleAutoLoad481Toggle() {
    val current = BiliClient.prefs.v481moduleAutoLoad481
    BiliClient.prefs.v481moduleAutoLoad481 = !current
    AppToast.show(this, "Module Auto Load481: ${if (!current) "ON" else "OFF"}")
}

// v481: Monitor CPU Usage481
internal fun PlayerActivity.showV481MonitorCpuUsage481Toggle() {
    val current = BiliClient.prefs.v481monitorCpuUsage481
    BiliClient.prefs.v481monitorCpuUsage481 = !current
    AppToast.show(this, "Monitor CPU Usage481: ${if (!current) "ON" else "OFF"}")
}

// v481: Mount Auto Detect481
internal fun PlayerActivity.showV481MountAutoDetect481Toggle() {
    val current = BiliClient.prefs.v481mountAutoDetect481
    BiliClient.prefs.v481mountAutoDetect481 = !current
    AppToast.show(this, "Mount Auto Detect481: ${if (!current) "ON" else "OFF"}")
}

// v481: Mouse Hover Preview481
internal fun PlayerActivity.showV481MouseHoverPreview481Toggle() {
    val current = BiliClient.prefs.v481mouseHoverPreview481
    BiliClient.prefs.v481mouseHoverPreview481 = !current
    AppToast.show(this, "Mouse Hover Preview481: ${if (!current) "ON" else "OFF"}")
}

// v481: Move Transition481
internal fun PlayerActivity.showV481MoveTransition481Toggle() {
    val current = BiliClient.prefs.v481moveTransition481
    BiliClient.prefs.v481moveTransition481 = !current
    AppToast.show(this, "Move Transition481: ${if (!current) "ON" else "OFF"}")
}

// v481: Multi Thread Decode481
internal fun PlayerActivity.showV481MultiThreadDecode481Toggle() {
    val current = BiliClient.prefs.v481multiThreadDecode481
    BiliClient.prefs.v481multiThreadDecode481 = !current
    AppToast.show(this, "Multi Thread Decode481: ${if (!current) "ON" else "OFF"}")
}

// v481: Nav Auto Collapse481
internal fun PlayerActivity.showV481NavAutoCollapse481Toggle() {
    val current = BiliClient.prefs.v481navAutoCollapse481
    BiliClient.prefs.v481navAutoCollapse481 = !current
    AppToast.show(this, "Nav Auto Collapse481: ${if (!current) "ON" else "OFF"}")
}

// v481: Node Auto Connect481
internal fun PlayerActivity.showV481NodeAutoConnect481Toggle() {
    val current = BiliClient.prefs.v481nodeAutoConnect481
    BiliClient.prefs.v481nodeAutoConnect481 = !current
    AppToast.show(this, "Node Auto Connect481: ${if (!current) "ON" else "OFF"}")
}

// v481: Offset Auto Calibrate481
internal fun PlayerActivity.showV481OffsetAutoCalibrate481Toggle() {
    val current = BiliClient.prefs.v481offsetAutoCalibrate481
    BiliClient.prefs.v481offsetAutoCalibrate481 = !current
    AppToast.show(this, "Offset Auto Calibrate481: ${if (!current) "ON" else "OFF"}")
}

// v481: Open With External481
internal fun PlayerActivity.showV481OpenWithExternal481Toggle() {
    val current = BiliClient.prefs.v481openWithExternal481
    BiliClient.prefs.v481openWithExternal481 = !current
    AppToast.show(this, "Open With External481: ${if (!current) "ON" else "OFF"}")
}

// v481: Order Auto Sort481
internal fun PlayerActivity.showV481OrderAutoSort481Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v481orderAutoSort481).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort481",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v481orderAutoSort481 = value
        AppToast.show(this, "Order Auto Sort481: $value")
    }
}

// v481: Output Auto Select481
internal fun PlayerActivity.showV481OutputAutoSelect481Toggle() {
    val current = BiliClient.prefs.v481outputAutoSelect481
    BiliClient.prefs.v481outputAutoSelect481 = !current
    AppToast.show(this, "Output Auto Select481: ${if (!current) "ON" else "OFF"}")
}

// v481: Overlay Auto Show481
internal fun PlayerActivity.showV481OverlayAutoShow481Toggle() {
    val current = BiliClient.prefs.v481overlayAutoShow481
    BiliClient.prefs.v481overlayAutoShow481 = !current
    AppToast.show(this, "Overlay Auto Show481: ${if (!current) "ON" else "OFF"}")
}

// v481: Override Global481
internal fun PlayerActivity.showV481OverrideGlobal481Toggle() {
    val current = BiliClient.prefs.v481overrideGlobal481
    BiliClient.prefs.v481overrideGlobal481 = !current
    AppToast.show(this, "Override Global481: ${if (!current) "ON" else "OFF"}")
}

// v481: Pack Auto Compress481
internal fun PlayerActivity.showV481PackAutoCompress481Toggle() {
    val current = BiliClient.prefs.v481packAutoCompress481
    BiliClient.prefs.v481packAutoCompress481 = !current
    AppToast.show(this, "Pack Auto Compress481: ${if (!current) "ON" else "OFF"}")
}

// v482: Module Auto Load482
internal fun PlayerActivity.showV482ModuleAutoLoad482Toggle() {
    val current = BiliClient.prefs.v482moduleAutoLoad482
    BiliClient.prefs.v482moduleAutoLoad482 = !current
    AppToast.show(this, "Module Auto Load482: ${if (!current) "ON" else "OFF"}")
}

// v482: Monitor CPU Usage482
internal fun PlayerActivity.showV482MonitorCpuUsage482Toggle() {
    val current = BiliClient.prefs.v482monitorCpuUsage482
    BiliClient.prefs.v482monitorCpuUsage482 = !current
    AppToast.show(this, "Monitor CPU Usage482: ${if (!current) "ON" else "OFF"}")
}

// v482: Mount Auto Detect482
internal fun PlayerActivity.showV482MountAutoDetect482Toggle() {
    val current = BiliClient.prefs.v482mountAutoDetect482
    BiliClient.prefs.v482mountAutoDetect482 = !current
    AppToast.show(this, "Mount Auto Detect482: ${if (!current) "ON" else "OFF"}")
}

// v482: Mouse Hover Preview482
internal fun PlayerActivity.showV482MouseHoverPreview482Toggle() {
    val current = BiliClient.prefs.v482mouseHoverPreview482
    BiliClient.prefs.v482mouseHoverPreview482 = !current
    AppToast.show(this, "Mouse Hover Preview482: ${if (!current) "ON" else "OFF"}")
}

// v482: Move Transition482
internal fun PlayerActivity.showV482MoveTransition482Toggle() {
    val current = BiliClient.prefs.v482moveTransition482
    BiliClient.prefs.v482moveTransition482 = !current
    AppToast.show(this, "Move Transition482: ${if (!current) "ON" else "OFF"}")
}

// v482: Multi Thread Decode482
internal fun PlayerActivity.showV482MultiThreadDecode482Toggle() {
    val current = BiliClient.prefs.v482multiThreadDecode482
    BiliClient.prefs.v482multiThreadDecode482 = !current
    AppToast.show(this, "Multi Thread Decode482: ${if (!current) "ON" else "OFF"}")
}

// v482: Nav Auto Collapse482
internal fun PlayerActivity.showV482NavAutoCollapse482Toggle() {
    val current = BiliClient.prefs.v482navAutoCollapse482
    BiliClient.prefs.v482navAutoCollapse482 = !current
    AppToast.show(this, "Nav Auto Collapse482: ${if (!current) "ON" else "OFF"}")
}

// v482: Node Auto Connect482
internal fun PlayerActivity.showV482NodeAutoConnect482Toggle() {
    val current = BiliClient.prefs.v482nodeAutoConnect482
    BiliClient.prefs.v482nodeAutoConnect482 = !current
    AppToast.show(this, "Node Auto Connect482: ${if (!current) "ON" else "OFF"}")
}

// v482: Offset Auto Calibrate482
internal fun PlayerActivity.showV482OffsetAutoCalibrate482Toggle() {
    val current = BiliClient.prefs.v482offsetAutoCalibrate482
    BiliClient.prefs.v482offsetAutoCalibrate482 = !current
    AppToast.show(this, "Offset Auto Calibrate482: ${if (!current) "ON" else "OFF"}")
}

// v482: Open With External482
internal fun PlayerActivity.showV482OpenWithExternal482Toggle() {
    val current = BiliClient.prefs.v482openWithExternal482
    BiliClient.prefs.v482openWithExternal482 = !current
    AppToast.show(this, "Open With External482: ${if (!current) "ON" else "OFF"}")
}

// v482: Order Auto Sort482
internal fun PlayerActivity.showV482OrderAutoSort482Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v482orderAutoSort482).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort482",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v482orderAutoSort482 = value
        AppToast.show(this, "Order Auto Sort482: $value")
    }
}

// v482: Output Auto Select482
internal fun PlayerActivity.showV482OutputAutoSelect482Toggle() {
    val current = BiliClient.prefs.v482outputAutoSelect482
    BiliClient.prefs.v482outputAutoSelect482 = !current
    AppToast.show(this, "Output Auto Select482: ${if (!current) "ON" else "OFF"}")
}

// v482: Overlay Auto Show482
internal fun PlayerActivity.showV482OverlayAutoShow482Toggle() {
    val current = BiliClient.prefs.v482overlayAutoShow482
    BiliClient.prefs.v482overlayAutoShow482 = !current
    AppToast.show(this, "Overlay Auto Show482: ${if (!current) "ON" else "OFF"}")
}

// v482: Override Global482
internal fun PlayerActivity.showV482OverrideGlobal482Toggle() {
    val current = BiliClient.prefs.v482overrideGlobal482
    BiliClient.prefs.v482overrideGlobal482 = !current
    AppToast.show(this, "Override Global482: ${if (!current) "ON" else "OFF"}")
}

// v482: Pack Auto Compress482
internal fun PlayerActivity.showV482PackAutoCompress482Toggle() {
    val current = BiliClient.prefs.v482packAutoCompress482
    BiliClient.prefs.v482packAutoCompress482 = !current
    AppToast.show(this, "Pack Auto Compress482: ${if (!current) "ON" else "OFF"}")
}

// v483: Module Auto Load483
internal fun PlayerActivity.showV483ModuleAutoLoad483Toggle() {
    val current = BiliClient.prefs.v483moduleAutoLoad483
    BiliClient.prefs.v483moduleAutoLoad483 = !current
    AppToast.show(this, "Module Auto Load483: ${if (!current) "ON" else "OFF"}")
}

// v483: Monitor CPU Usage483
internal fun PlayerActivity.showV483MonitorCpuUsage483Toggle() {
    val current = BiliClient.prefs.v483monitorCpuUsage483
    BiliClient.prefs.v483monitorCpuUsage483 = !current
    AppToast.show(this, "Monitor CPU Usage483: ${if (!current) "ON" else "OFF"}")
}

// v483: Mount Auto Detect483
internal fun PlayerActivity.showV483MountAutoDetect483Toggle() {
    val current = BiliClient.prefs.v483mountAutoDetect483
    BiliClient.prefs.v483mountAutoDetect483 = !current
    AppToast.show(this, "Mount Auto Detect483: ${if (!current) "ON" else "OFF"}")
}

// v483: Mouse Hover Preview483
internal fun PlayerActivity.showV483MouseHoverPreview483Toggle() {
    val current = BiliClient.prefs.v483mouseHoverPreview483
    BiliClient.prefs.v483mouseHoverPreview483 = !current
    AppToast.show(this, "Mouse Hover Preview483: ${if (!current) "ON" else "OFF"}")
}

// v483: Move Transition483
internal fun PlayerActivity.showV483MoveTransition483Toggle() {
    val current = BiliClient.prefs.v483moveTransition483
    BiliClient.prefs.v483moveTransition483 = !current
    AppToast.show(this, "Move Transition483: ${if (!current) "ON" else "OFF"}")
}

// v483: Multi Thread Decode483
internal fun PlayerActivity.showV483MultiThreadDecode483Toggle() {
    val current = BiliClient.prefs.v483multiThreadDecode483
    BiliClient.prefs.v483multiThreadDecode483 = !current
    AppToast.show(this, "Multi Thread Decode483: ${if (!current) "ON" else "OFF"}")
}

// v483: Nav Auto Collapse483
internal fun PlayerActivity.showV483NavAutoCollapse483Toggle() {
    val current = BiliClient.prefs.v483navAutoCollapse483
    BiliClient.prefs.v483navAutoCollapse483 = !current
    AppToast.show(this, "Nav Auto Collapse483: ${if (!current) "ON" else "OFF"}")
}

// v483: Node Auto Connect483
internal fun PlayerActivity.showV483NodeAutoConnect483Toggle() {
    val current = BiliClient.prefs.v483nodeAutoConnect483
    BiliClient.prefs.v483nodeAutoConnect483 = !current
    AppToast.show(this, "Node Auto Connect483: ${if (!current) "ON" else "OFF"}")
}

// v483: Offset Auto Calibrate483
internal fun PlayerActivity.showV483OffsetAutoCalibrate483Toggle() {
    val current = BiliClient.prefs.v483offsetAutoCalibrate483
    BiliClient.prefs.v483offsetAutoCalibrate483 = !current
    AppToast.show(this, "Offset Auto Calibrate483: ${if (!current) "ON" else "OFF"}")
}

// v483: Open With External483
internal fun PlayerActivity.showV483OpenWithExternal483Toggle() {
    val current = BiliClient.prefs.v483openWithExternal483
    BiliClient.prefs.v483openWithExternal483 = !current
    AppToast.show(this, "Open With External483: ${if (!current) "ON" else "OFF"}")
}

// v483: Order Auto Sort483
internal fun PlayerActivity.showV483OrderAutoSort483Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v483orderAutoSort483).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort483",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v483orderAutoSort483 = value
        AppToast.show(this, "Order Auto Sort483: $value")
    }
}

// v483: Output Auto Select483
internal fun PlayerActivity.showV483OutputAutoSelect483Toggle() {
    val current = BiliClient.prefs.v483outputAutoSelect483
    BiliClient.prefs.v483outputAutoSelect483 = !current
    AppToast.show(this, "Output Auto Select483: ${if (!current) "ON" else "OFF"}")
}

// v483: Overlay Auto Show483
internal fun PlayerActivity.showV483OverlayAutoShow483Toggle() {
    val current = BiliClient.prefs.v483overlayAutoShow483
    BiliClient.prefs.v483overlayAutoShow483 = !current
    AppToast.show(this, "Overlay Auto Show483: ${if (!current) "ON" else "OFF"}")
}

// v483: Override Global483
internal fun PlayerActivity.showV483OverrideGlobal483Toggle() {
    val current = BiliClient.prefs.v483overrideGlobal483
    BiliClient.prefs.v483overrideGlobal483 = !current
    AppToast.show(this, "Override Global483: ${if (!current) "ON" else "OFF"}")
}

// v483: Pack Auto Compress483
internal fun PlayerActivity.showV483PackAutoCompress483Toggle() {
    val current = BiliClient.prefs.v483packAutoCompress483
    BiliClient.prefs.v483packAutoCompress483 = !current
    AppToast.show(this, "Pack Auto Compress483: ${if (!current) "ON" else "OFF"}")
}

// v484: Module Auto Load484
internal fun PlayerActivity.showV484ModuleAutoLoad484Toggle() {
    val current = BiliClient.prefs.v484moduleAutoLoad484
    BiliClient.prefs.v484moduleAutoLoad484 = !current
    AppToast.show(this, "Module Auto Load484: ${if (!current) "ON" else "OFF"}")
}

// v484: Monitor CPU Usage484
internal fun PlayerActivity.showV484MonitorCpuUsage484Toggle() {
    val current = BiliClient.prefs.v484monitorCpuUsage484
    BiliClient.prefs.v484monitorCpuUsage484 = !current
    AppToast.show(this, "Monitor CPU Usage484: ${if (!current) "ON" else "OFF"}")
}

// v484: Mount Auto Detect484
internal fun PlayerActivity.showV484MountAutoDetect484Toggle() {
    val current = BiliClient.prefs.v484mountAutoDetect484
    BiliClient.prefs.v484mountAutoDetect484 = !current
    AppToast.show(this, "Mount Auto Detect484: ${if (!current) "ON" else "OFF"}")
}

// v484: Mouse Hover Preview484
internal fun PlayerActivity.showV484MouseHoverPreview484Toggle() {
    val current = BiliClient.prefs.v484mouseHoverPreview484
    BiliClient.prefs.v484mouseHoverPreview484 = !current
    AppToast.show(this, "Mouse Hover Preview484: ${if (!current) "ON" else "OFF"}")
}

// v484: Move Transition484
internal fun PlayerActivity.showV484MoveTransition484Toggle() {
    val current = BiliClient.prefs.v484moveTransition484
    BiliClient.prefs.v484moveTransition484 = !current
    AppToast.show(this, "Move Transition484: ${if (!current) "ON" else "OFF"}")
}

// v484: Multi Thread Decode484
internal fun PlayerActivity.showV484MultiThreadDecode484Toggle() {
    val current = BiliClient.prefs.v484multiThreadDecode484
    BiliClient.prefs.v484multiThreadDecode484 = !current
    AppToast.show(this, "Multi Thread Decode484: ${if (!current) "ON" else "OFF"}")
}

// v484: Nav Auto Collapse484
internal fun PlayerActivity.showV484NavAutoCollapse484Toggle() {
    val current = BiliClient.prefs.v484navAutoCollapse484
    BiliClient.prefs.v484navAutoCollapse484 = !current
    AppToast.show(this, "Nav Auto Collapse484: ${if (!current) "ON" else "OFF"}")
}

// v484: Node Auto Connect484
internal fun PlayerActivity.showV484NodeAutoConnect484Toggle() {
    val current = BiliClient.prefs.v484nodeAutoConnect484
    BiliClient.prefs.v484nodeAutoConnect484 = !current
    AppToast.show(this, "Node Auto Connect484: ${if (!current) "ON" else "OFF"}")
}

// v484: Offset Auto Calibrate484
internal fun PlayerActivity.showV484OffsetAutoCalibrate484Toggle() {
    val current = BiliClient.prefs.v484offsetAutoCalibrate484
    BiliClient.prefs.v484offsetAutoCalibrate484 = !current
    AppToast.show(this, "Offset Auto Calibrate484: ${if (!current) "ON" else "OFF"}")
}

// v484: Open With External484
internal fun PlayerActivity.showV484OpenWithExternal484Toggle() {
    val current = BiliClient.prefs.v484openWithExternal484
    BiliClient.prefs.v484openWithExternal484 = !current
    AppToast.show(this, "Open With External484: ${if (!current) "ON" else "OFF"}")
}

// v484: Order Auto Sort484
internal fun PlayerActivity.showV484OrderAutoSort484Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v484orderAutoSort484).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort484",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v484orderAutoSort484 = value
        AppToast.show(this, "Order Auto Sort484: $value")
    }
}

// v484: Output Auto Select484
internal fun PlayerActivity.showV484OutputAutoSelect484Toggle() {
    val current = BiliClient.prefs.v484outputAutoSelect484
    BiliClient.prefs.v484outputAutoSelect484 = !current
    AppToast.show(this, "Output Auto Select484: ${if (!current) "ON" else "OFF"}")
}

// v484: Overlay Auto Show484
internal fun PlayerActivity.showV484OverlayAutoShow484Toggle() {
    val current = BiliClient.prefs.v484overlayAutoShow484
    BiliClient.prefs.v484overlayAutoShow484 = !current
    AppToast.show(this, "Overlay Auto Show484: ${if (!current) "ON" else "OFF"}")
}

// v484: Override Global484
internal fun PlayerActivity.showV484OverrideGlobal484Toggle() {
    val current = BiliClient.prefs.v484overrideGlobal484
    BiliClient.prefs.v484overrideGlobal484 = !current
    AppToast.show(this, "Override Global484: ${if (!current) "ON" else "OFF"}")
}

// v484: Pack Auto Compress484
internal fun PlayerActivity.showV484PackAutoCompress484Toggle() {
    val current = BiliClient.prefs.v484packAutoCompress484
    BiliClient.prefs.v484packAutoCompress484 = !current
    AppToast.show(this, "Pack Auto Compress484: ${if (!current) "ON" else "OFF"}")
}

// v485: Module Auto Load485
internal fun PlayerActivity.showV485ModuleAutoLoad485Toggle() {
    val current = BiliClient.prefs.v485moduleAutoLoad485
    BiliClient.prefs.v485moduleAutoLoad485 = !current
    AppToast.show(this, "Module Auto Load485: ${if (!current) "ON" else "OFF"}")
}

// v485: Monitor CPU Usage485
internal fun PlayerActivity.showV485MonitorCpuUsage485Toggle() {
    val current = BiliClient.prefs.v485monitorCpuUsage485
    BiliClient.prefs.v485monitorCpuUsage485 = !current
    AppToast.show(this, "Monitor CPU Usage485: ${if (!current) "ON" else "OFF"}")
}

// v485: Mount Auto Detect485
internal fun PlayerActivity.showV485MountAutoDetect485Toggle() {
    val current = BiliClient.prefs.v485mountAutoDetect485
    BiliClient.prefs.v485mountAutoDetect485 = !current
    AppToast.show(this, "Mount Auto Detect485: ${if (!current) "ON" else "OFF"}")
}

// v485: Mouse Hover Preview485
internal fun PlayerActivity.showV485MouseHoverPreview485Toggle() {
    val current = BiliClient.prefs.v485mouseHoverPreview485
    BiliClient.prefs.v485mouseHoverPreview485 = !current
    AppToast.show(this, "Mouse Hover Preview485: ${if (!current) "ON" else "OFF"}")
}

// v485: Move Transition485
internal fun PlayerActivity.showV485MoveTransition485Toggle() {
    val current = BiliClient.prefs.v485moveTransition485
    BiliClient.prefs.v485moveTransition485 = !current
    AppToast.show(this, "Move Transition485: ${if (!current) "ON" else "OFF"}")
}

// v485: Multi Thread Decode485
internal fun PlayerActivity.showV485MultiThreadDecode485Toggle() {
    val current = BiliClient.prefs.v485multiThreadDecode485
    BiliClient.prefs.v485multiThreadDecode485 = !current
    AppToast.show(this, "Multi Thread Decode485: ${if (!current) "ON" else "OFF"}")
}

// v485: Nav Auto Collapse485
internal fun PlayerActivity.showV485NavAutoCollapse485Toggle() {
    val current = BiliClient.prefs.v485navAutoCollapse485
    BiliClient.prefs.v485navAutoCollapse485 = !current
    AppToast.show(this, "Nav Auto Collapse485: ${if (!current) "ON" else "OFF"}")
}

// v485: Node Auto Connect485
internal fun PlayerActivity.showV485NodeAutoConnect485Toggle() {
    val current = BiliClient.prefs.v485nodeAutoConnect485
    BiliClient.prefs.v485nodeAutoConnect485 = !current
    AppToast.show(this, "Node Auto Connect485: ${if (!current) "ON" else "OFF"}")
}

// v485: Offset Auto Calibrate485
internal fun PlayerActivity.showV485OffsetAutoCalibrate485Toggle() {
    val current = BiliClient.prefs.v485offsetAutoCalibrate485
    BiliClient.prefs.v485offsetAutoCalibrate485 = !current
    AppToast.show(this, "Offset Auto Calibrate485: ${if (!current) "ON" else "OFF"}")
}

// v485: Open With External485
internal fun PlayerActivity.showV485OpenWithExternal485Toggle() {
    val current = BiliClient.prefs.v485openWithExternal485
    BiliClient.prefs.v485openWithExternal485 = !current
    AppToast.show(this, "Open With External485: ${if (!current) "ON" else "OFF"}")
}

// v485: Order Auto Sort485
internal fun PlayerActivity.showV485OrderAutoSort485Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v485orderAutoSort485).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort485",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v485orderAutoSort485 = value
        AppToast.show(this, "Order Auto Sort485: $value")
    }
}

// v485: Output Auto Select485
internal fun PlayerActivity.showV485OutputAutoSelect485Toggle() {
    val current = BiliClient.prefs.v485outputAutoSelect485
    BiliClient.prefs.v485outputAutoSelect485 = !current
    AppToast.show(this, "Output Auto Select485: ${if (!current) "ON" else "OFF"}")
}

// v485: Overlay Auto Show485
internal fun PlayerActivity.showV485OverlayAutoShow485Toggle() {
    val current = BiliClient.prefs.v485overlayAutoShow485
    BiliClient.prefs.v485overlayAutoShow485 = !current
    AppToast.show(this, "Overlay Auto Show485: ${if (!current) "ON" else "OFF"}")
}

// v485: Override Global485
internal fun PlayerActivity.showV485OverrideGlobal485Toggle() {
    val current = BiliClient.prefs.v485overrideGlobal485
    BiliClient.prefs.v485overrideGlobal485 = !current
    AppToast.show(this, "Override Global485: ${if (!current) "ON" else "OFF"}")
}

// v485: Pack Auto Compress485
internal fun PlayerActivity.showV485PackAutoCompress485Toggle() {
    val current = BiliClient.prefs.v485packAutoCompress485
    BiliClient.prefs.v485packAutoCompress485 = !current
    AppToast.show(this, "Pack Auto Compress485: ${if (!current) "ON" else "OFF"}")
}

// v486: Module Auto Load486
internal fun PlayerActivity.showV486ModuleAutoLoad486Toggle() {
    val current = BiliClient.prefs.v486moduleAutoLoad486
    BiliClient.prefs.v486moduleAutoLoad486 = !current
    AppToast.show(this, "Module Auto Load486: ${if (!current) "ON" else "OFF"}")
}

// v486: Monitor CPU Usage486
internal fun PlayerActivity.showV486MonitorCpuUsage486Toggle() {
    val current = BiliClient.prefs.v486monitorCpuUsage486
    BiliClient.prefs.v486monitorCpuUsage486 = !current
    AppToast.show(this, "Monitor CPU Usage486: ${if (!current) "ON" else "OFF"}")
}

// v486: Mount Auto Detect486
internal fun PlayerActivity.showV486MountAutoDetect486Toggle() {
    val current = BiliClient.prefs.v486mountAutoDetect486
    BiliClient.prefs.v486mountAutoDetect486 = !current
    AppToast.show(this, "Mount Auto Detect486: ${if (!current) "ON" else "OFF"}")
}

// v486: Mouse Hover Preview486
internal fun PlayerActivity.showV486MouseHoverPreview486Toggle() {
    val current = BiliClient.prefs.v486mouseHoverPreview486
    BiliClient.prefs.v486mouseHoverPreview486 = !current
    AppToast.show(this, "Mouse Hover Preview486: ${if (!current) "ON" else "OFF"}")
}

// v486: Move Transition486
internal fun PlayerActivity.showV486MoveTransition486Toggle() {
    val current = BiliClient.prefs.v486moveTransition486
    BiliClient.prefs.v486moveTransition486 = !current
    AppToast.show(this, "Move Transition486: ${if (!current) "ON" else "OFF"}")
}

// v486: Multi Thread Decode486
internal fun PlayerActivity.showV486MultiThreadDecode486Toggle() {
    val current = BiliClient.prefs.v486multiThreadDecode486
    BiliClient.prefs.v486multiThreadDecode486 = !current
    AppToast.show(this, "Multi Thread Decode486: ${if (!current) "ON" else "OFF"}")
}

// v486: Nav Auto Collapse486
internal fun PlayerActivity.showV486NavAutoCollapse486Toggle() {
    val current = BiliClient.prefs.v486navAutoCollapse486
    BiliClient.prefs.v486navAutoCollapse486 = !current
    AppToast.show(this, "Nav Auto Collapse486: ${if (!current) "ON" else "OFF"}")
}

// v486: Node Auto Connect486
internal fun PlayerActivity.showV486NodeAutoConnect486Toggle() {
    val current = BiliClient.prefs.v486nodeAutoConnect486
    BiliClient.prefs.v486nodeAutoConnect486 = !current
    AppToast.show(this, "Node Auto Connect486: ${if (!current) "ON" else "OFF"}")
}

// v486: Offset Auto Calibrate486
internal fun PlayerActivity.showV486OffsetAutoCalibrate486Toggle() {
    val current = BiliClient.prefs.v486offsetAutoCalibrate486
    BiliClient.prefs.v486offsetAutoCalibrate486 = !current
    AppToast.show(this, "Offset Auto Calibrate486: ${if (!current) "ON" else "OFF"}")
}

// v486: Open With External486
internal fun PlayerActivity.showV486OpenWithExternal486Toggle() {
    val current = BiliClient.prefs.v486openWithExternal486
    BiliClient.prefs.v486openWithExternal486 = !current
    AppToast.show(this, "Open With External486: ${if (!current) "ON" else "OFF"}")
}

// v486: Order Auto Sort486
internal fun PlayerActivity.showV486OrderAutoSort486Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v486orderAutoSort486).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort486",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v486orderAutoSort486 = value
        AppToast.show(this, "Order Auto Sort486: $value")
    }
}

// v486: Output Auto Select486
internal fun PlayerActivity.showV486OutputAutoSelect486Toggle() {
    val current = BiliClient.prefs.v486outputAutoSelect486
    BiliClient.prefs.v486outputAutoSelect486 = !current
    AppToast.show(this, "Output Auto Select486: ${if (!current) "ON" else "OFF"}")
}

// v486: Overlay Auto Show486
internal fun PlayerActivity.showV486OverlayAutoShow486Toggle() {
    val current = BiliClient.prefs.v486overlayAutoShow486
    BiliClient.prefs.v486overlayAutoShow486 = !current
    AppToast.show(this, "Overlay Auto Show486: ${if (!current) "ON" else "OFF"}")
}

// v486: Override Global486
internal fun PlayerActivity.showV486OverrideGlobal486Toggle() {
    val current = BiliClient.prefs.v486overrideGlobal486
    BiliClient.prefs.v486overrideGlobal486 = !current
    AppToast.show(this, "Override Global486: ${if (!current) "ON" else "OFF"}")
}

// v486: Pack Auto Compress486
internal fun PlayerActivity.showV486PackAutoCompress486Toggle() {
    val current = BiliClient.prefs.v486packAutoCompress486
    BiliClient.prefs.v486packAutoCompress486 = !current
    AppToast.show(this, "Pack Auto Compress486: ${if (!current) "ON" else "OFF"}")
}

// v487: Module Auto Load487
internal fun PlayerActivity.showV487ModuleAutoLoad487Toggle() {
    val current = BiliClient.prefs.v487moduleAutoLoad487
    BiliClient.prefs.v487moduleAutoLoad487 = !current
    AppToast.show(this, "Module Auto Load487: ${if (!current) "ON" else "OFF"}")
}

// v487: Monitor CPU Usage487
internal fun PlayerActivity.showV487MonitorCpuUsage487Toggle() {
    val current = BiliClient.prefs.v487monitorCpuUsage487
    BiliClient.prefs.v487monitorCpuUsage487 = !current
    AppToast.show(this, "Monitor CPU Usage487: ${if (!current) "ON" else "OFF"}")
}

// v487: Mount Auto Detect487
internal fun PlayerActivity.showV487MountAutoDetect487Toggle() {
    val current = BiliClient.prefs.v487mountAutoDetect487
    BiliClient.prefs.v487mountAutoDetect487 = !current
    AppToast.show(this, "Mount Auto Detect487: ${if (!current) "ON" else "OFF"}")
}

// v487: Mouse Hover Preview487
internal fun PlayerActivity.showV487MouseHoverPreview487Toggle() {
    val current = BiliClient.prefs.v487mouseHoverPreview487
    BiliClient.prefs.v487mouseHoverPreview487 = !current
    AppToast.show(this, "Mouse Hover Preview487: ${if (!current) "ON" else "OFF"}")
}

// v487: Move Transition487
internal fun PlayerActivity.showV487MoveTransition487Toggle() {
    val current = BiliClient.prefs.v487moveTransition487
    BiliClient.prefs.v487moveTransition487 = !current
    AppToast.show(this, "Move Transition487: ${if (!current) "ON" else "OFF"}")
}

// v487: Multi Thread Decode487
internal fun PlayerActivity.showV487MultiThreadDecode487Toggle() {
    val current = BiliClient.prefs.v487multiThreadDecode487
    BiliClient.prefs.v487multiThreadDecode487 = !current
    AppToast.show(this, "Multi Thread Decode487: ${if (!current) "ON" else "OFF"}")
}

// v487: Nav Auto Collapse487
internal fun PlayerActivity.showV487NavAutoCollapse487Toggle() {
    val current = BiliClient.prefs.v487navAutoCollapse487
    BiliClient.prefs.v487navAutoCollapse487 = !current
    AppToast.show(this, "Nav Auto Collapse487: ${if (!current) "ON" else "OFF"}")
}

// v487: Node Auto Connect487
internal fun PlayerActivity.showV487NodeAutoConnect487Toggle() {
    val current = BiliClient.prefs.v487nodeAutoConnect487
    BiliClient.prefs.v487nodeAutoConnect487 = !current
    AppToast.show(this, "Node Auto Connect487: ${if (!current) "ON" else "OFF"}")
}

// v487: Offset Auto Calibrate487
internal fun PlayerActivity.showV487OffsetAutoCalibrate487Toggle() {
    val current = BiliClient.prefs.v487offsetAutoCalibrate487
    BiliClient.prefs.v487offsetAutoCalibrate487 = !current
    AppToast.show(this, "Offset Auto Calibrate487: ${if (!current) "ON" else "OFF"}")
}

// v487: Open With External487
internal fun PlayerActivity.showV487OpenWithExternal487Toggle() {
    val current = BiliClient.prefs.v487openWithExternal487
    BiliClient.prefs.v487openWithExternal487 = !current
    AppToast.show(this, "Open With External487: ${if (!current) "ON" else "OFF"}")
}

// v487: Order Auto Sort487
internal fun PlayerActivity.showV487OrderAutoSort487Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v487orderAutoSort487).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort487",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v487orderAutoSort487 = value
        AppToast.show(this, "Order Auto Sort487: $value")
    }
}

// v487: Output Auto Select487
internal fun PlayerActivity.showV487OutputAutoSelect487Toggle() {
    val current = BiliClient.prefs.v487outputAutoSelect487
    BiliClient.prefs.v487outputAutoSelect487 = !current
    AppToast.show(this, "Output Auto Select487: ${if (!current) "ON" else "OFF"}")
}

// v487: Overlay Auto Show487
internal fun PlayerActivity.showV487OverlayAutoShow487Toggle() {
    val current = BiliClient.prefs.v487overlayAutoShow487
    BiliClient.prefs.v487overlayAutoShow487 = !current
    AppToast.show(this, "Overlay Auto Show487: ${if (!current) "ON" else "OFF"}")
}

// v487: Override Global487
internal fun PlayerActivity.showV487OverrideGlobal487Toggle() {
    val current = BiliClient.prefs.v487overrideGlobal487
    BiliClient.prefs.v487overrideGlobal487 = !current
    AppToast.show(this, "Override Global487: ${if (!current) "ON" else "OFF"}")
}

// v487: Pack Auto Compress487
internal fun PlayerActivity.showV487PackAutoCompress487Toggle() {
    val current = BiliClient.prefs.v487packAutoCompress487
    BiliClient.prefs.v487packAutoCompress487 = !current
    AppToast.show(this, "Pack Auto Compress487: ${if (!current) "ON" else "OFF"}")
}

// v488: Module Auto Load488
internal fun PlayerActivity.showV488ModuleAutoLoad488Toggle() {
    val current = BiliClient.prefs.v488moduleAutoLoad488
    BiliClient.prefs.v488moduleAutoLoad488 = !current
    AppToast.show(this, "Module Auto Load488: ${if (!current) "ON" else "OFF"}")
}

// v488: Monitor CPU Usage488
internal fun PlayerActivity.showV488MonitorCpuUsage488Toggle() {
    val current = BiliClient.prefs.v488monitorCpuUsage488
    BiliClient.prefs.v488monitorCpuUsage488 = !current
    AppToast.show(this, "Monitor CPU Usage488: ${if (!current) "ON" else "OFF"}")
}

// v488: Mount Auto Detect488
internal fun PlayerActivity.showV488MountAutoDetect488Toggle() {
    val current = BiliClient.prefs.v488mountAutoDetect488
    BiliClient.prefs.v488mountAutoDetect488 = !current
    AppToast.show(this, "Mount Auto Detect488: ${if (!current) "ON" else "OFF"}")
}

// v488: Mouse Hover Preview488
internal fun PlayerActivity.showV488MouseHoverPreview488Toggle() {
    val current = BiliClient.prefs.v488mouseHoverPreview488
    BiliClient.prefs.v488mouseHoverPreview488 = !current
    AppToast.show(this, "Mouse Hover Preview488: ${if (!current) "ON" else "OFF"}")
}

// v488: Move Transition488
internal fun PlayerActivity.showV488MoveTransition488Toggle() {
    val current = BiliClient.prefs.v488moveTransition488
    BiliClient.prefs.v488moveTransition488 = !current
    AppToast.show(this, "Move Transition488: ${if (!current) "ON" else "OFF"}")
}

// v488: Multi Thread Decode488
internal fun PlayerActivity.showV488MultiThreadDecode488Toggle() {
    val current = BiliClient.prefs.v488multiThreadDecode488
    BiliClient.prefs.v488multiThreadDecode488 = !current
    AppToast.show(this, "Multi Thread Decode488: ${if (!current) "ON" else "OFF"}")
}

// v488: Nav Auto Collapse488
internal fun PlayerActivity.showV488NavAutoCollapse488Toggle() {
    val current = BiliClient.prefs.v488navAutoCollapse488
    BiliClient.prefs.v488navAutoCollapse488 = !current
    AppToast.show(this, "Nav Auto Collapse488: ${if (!current) "ON" else "OFF"}")
}

// v488: Node Auto Connect488
internal fun PlayerActivity.showV488NodeAutoConnect488Toggle() {
    val current = BiliClient.prefs.v488nodeAutoConnect488
    BiliClient.prefs.v488nodeAutoConnect488 = !current
    AppToast.show(this, "Node Auto Connect488: ${if (!current) "ON" else "OFF"}")
}

// v488: Offset Auto Calibrate488
internal fun PlayerActivity.showV488OffsetAutoCalibrate488Toggle() {
    val current = BiliClient.prefs.v488offsetAutoCalibrate488
    BiliClient.prefs.v488offsetAutoCalibrate488 = !current
    AppToast.show(this, "Offset Auto Calibrate488: ${if (!current) "ON" else "OFF"}")
}

// v488: Open With External488
internal fun PlayerActivity.showV488OpenWithExternal488Toggle() {
    val current = BiliClient.prefs.v488openWithExternal488
    BiliClient.prefs.v488openWithExternal488 = !current
    AppToast.show(this, "Open With External488: ${if (!current) "ON" else "OFF"}")
}

// v488: Order Auto Sort488
internal fun PlayerActivity.showV488OrderAutoSort488Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v488orderAutoSort488).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort488",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v488orderAutoSort488 = value
        AppToast.show(this, "Order Auto Sort488: $value")
    }
}

// v488: Output Auto Select488
internal fun PlayerActivity.showV488OutputAutoSelect488Toggle() {
    val current = BiliClient.prefs.v488outputAutoSelect488
    BiliClient.prefs.v488outputAutoSelect488 = !current
    AppToast.show(this, "Output Auto Select488: ${if (!current) "ON" else "OFF"}")
}

// v488: Overlay Auto Show488
internal fun PlayerActivity.showV488OverlayAutoShow488Toggle() {
    val current = BiliClient.prefs.v488overlayAutoShow488
    BiliClient.prefs.v488overlayAutoShow488 = !current
    AppToast.show(this, "Overlay Auto Show488: ${if (!current) "ON" else "OFF"}")
}

// v488: Override Global488
internal fun PlayerActivity.showV488OverrideGlobal488Toggle() {
    val current = BiliClient.prefs.v488overrideGlobal488
    BiliClient.prefs.v488overrideGlobal488 = !current
    AppToast.show(this, "Override Global488: ${if (!current) "ON" else "OFF"}")
}

// v488: Pack Auto Compress488
internal fun PlayerActivity.showV488PackAutoCompress488Toggle() {
    val current = BiliClient.prefs.v488packAutoCompress488
    BiliClient.prefs.v488packAutoCompress488 = !current
    AppToast.show(this, "Pack Auto Compress488: ${if (!current) "ON" else "OFF"}")
}

// v489: Module Auto Load489
internal fun PlayerActivity.showV489ModuleAutoLoad489Toggle() {
    val current = BiliClient.prefs.v489moduleAutoLoad489
    BiliClient.prefs.v489moduleAutoLoad489 = !current
    AppToast.show(this, "Module Auto Load489: ${if (!current) "ON" else "OFF"}")
}

// v489: Monitor CPU Usage489
internal fun PlayerActivity.showV489MonitorCpuUsage489Toggle() {
    val current = BiliClient.prefs.v489monitorCpuUsage489
    BiliClient.prefs.v489monitorCpuUsage489 = !current
    AppToast.show(this, "Monitor CPU Usage489: ${if (!current) "ON" else "OFF"}")
}

// v489: Mount Auto Detect489
internal fun PlayerActivity.showV489MountAutoDetect489Toggle() {
    val current = BiliClient.prefs.v489mountAutoDetect489
    BiliClient.prefs.v489mountAutoDetect489 = !current
    AppToast.show(this, "Mount Auto Detect489: ${if (!current) "ON" else "OFF"}")
}

// v489: Mouse Hover Preview489
internal fun PlayerActivity.showV489MouseHoverPreview489Toggle() {
    val current = BiliClient.prefs.v489mouseHoverPreview489
    BiliClient.prefs.v489mouseHoverPreview489 = !current
    AppToast.show(this, "Mouse Hover Preview489: ${if (!current) "ON" else "OFF"}")
}

// v489: Move Transition489
internal fun PlayerActivity.showV489MoveTransition489Toggle() {
    val current = BiliClient.prefs.v489moveTransition489
    BiliClient.prefs.v489moveTransition489 = !current
    AppToast.show(this, "Move Transition489: ${if (!current) "ON" else "OFF"}")
}

// v489: Multi Thread Decode489
internal fun PlayerActivity.showV489MultiThreadDecode489Toggle() {
    val current = BiliClient.prefs.v489multiThreadDecode489
    BiliClient.prefs.v489multiThreadDecode489 = !current
    AppToast.show(this, "Multi Thread Decode489: ${if (!current) "ON" else "OFF"}")
}

// v489: Nav Auto Collapse489
internal fun PlayerActivity.showV489NavAutoCollapse489Toggle() {
    val current = BiliClient.prefs.v489navAutoCollapse489
    BiliClient.prefs.v489navAutoCollapse489 = !current
    AppToast.show(this, "Nav Auto Collapse489: ${if (!current) "ON" else "OFF"}")
}

// v489: Node Auto Connect489
internal fun PlayerActivity.showV489NodeAutoConnect489Toggle() {
    val current = BiliClient.prefs.v489nodeAutoConnect489
    BiliClient.prefs.v489nodeAutoConnect489 = !current
    AppToast.show(this, "Node Auto Connect489: ${if (!current) "ON" else "OFF"}")
}

// v489: Offset Auto Calibrate489
internal fun PlayerActivity.showV489OffsetAutoCalibrate489Toggle() {
    val current = BiliClient.prefs.v489offsetAutoCalibrate489
    BiliClient.prefs.v489offsetAutoCalibrate489 = !current
    AppToast.show(this, "Offset Auto Calibrate489: ${if (!current) "ON" else "OFF"}")
}

// v489: Open With External489
internal fun PlayerActivity.showV489OpenWithExternal489Toggle() {
    val current = BiliClient.prefs.v489openWithExternal489
    BiliClient.prefs.v489openWithExternal489 = !current
    AppToast.show(this, "Open With External489: ${if (!current) "ON" else "OFF"}")
}

// v489: Order Auto Sort489
internal fun PlayerActivity.showV489OrderAutoSort489Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v489orderAutoSort489).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort489",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v489orderAutoSort489 = value
        AppToast.show(this, "Order Auto Sort489: $value")
    }
}

// v489: Output Auto Select489
internal fun PlayerActivity.showV489OutputAutoSelect489Toggle() {
    val current = BiliClient.prefs.v489outputAutoSelect489
    BiliClient.prefs.v489outputAutoSelect489 = !current
    AppToast.show(this, "Output Auto Select489: ${if (!current) "ON" else "OFF"}")
}

// v489: Overlay Auto Show489
internal fun PlayerActivity.showV489OverlayAutoShow489Toggle() {
    val current = BiliClient.prefs.v489overlayAutoShow489
    BiliClient.prefs.v489overlayAutoShow489 = !current
    AppToast.show(this, "Overlay Auto Show489: ${if (!current) "ON" else "OFF"}")
}

