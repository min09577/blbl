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

internal fun PlayerActivity.showV468LevelAutoAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468levelAutoAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468levelAutoAdjust468 = value
        AppToast.show(this, "Level Auto Adjust468: $value")
    }
}

internal fun PlayerActivity.showV468LightAdaptive468Toggle() {
    val current = BiliClient.prefs.v468lightAdaptive468
    BiliClient.prefs.v468lightAdaptive468 = !current
    AppToast.show(this, "Light Adaptive468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LimitBandwidthAuto468Toggle() {
    val current = BiliClient.prefs.v468limitBandwidthAuto468
    BiliClient.prefs.v468limitBandwidthAuto468 = !current
    AppToast.show(this, "Limit Bandwidth Auto468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LineSpacingAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468lineSpacingAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468lineSpacingAdjust468 = value
        AppToast.show(this, "Line Spacing Adjust468: $value")
    }
}

internal fun PlayerActivity.showV468LinkPreviewAuto468Toggle() {
    val current = BiliClient.prefs.v468linkPreviewAuto468
    BiliClient.prefs.v468linkPreviewAuto468 = !current
    AppToast.show(this, "Link Preview Auto468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468ListAnimation468Toggle() {
    val current = BiliClient.prefs.v468listAnimation468
    BiliClient.prefs.v468listAnimation468 = !current
    AppToast.show(this, "List Animation468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LoadPriorityHigh468Toggle() {
    val current = BiliClient.prefs.v468loadPriorityHigh468
    BiliClient.prefs.v468loadPriorityHigh468 = !current
    AppToast.show(this, "Load Priority High468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LocalCacheEnabled468Toggle() {
    val current = BiliClient.prefs.v468localCacheEnabled468
    BiliClient.prefs.v468localCacheEnabled468 = !current
    AppToast.show(this, "Local Cache Enabled468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LocationBasedRec468Toggle() {
    val current = BiliClient.prefs.v468locationBasedRec468
    BiliClient.prefs.v468locationBasedRec468 = !current
    AppToast.show(this, "Location Based Rec468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469KeyMappingCustom469Toggle() {
    val current = BiliClient.prefs.v469keyMappingCustom469
    BiliClient.prefs.v469keyMappingCustom469 = !current
    AppToast.show(this, "Key Mapping Custom469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LabelAutoGenerate469Toggle() {
    val current = BiliClient.prefs.v469labelAutoGenerate469
    BiliClient.prefs.v469labelAutoGenerate469 = !current
    AppToast.show(this, "Label Auto Generate469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LayerAutoComposite469Toggle() {
    val current = BiliClient.prefs.v469layerAutoComposite469
    BiliClient.prefs.v469layerAutoComposite469 = !current
    AppToast.show(this, "Layer Auto Composite469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LazyLoadEnabled469Toggle() {
    val current = BiliClient.prefs.v469lazyLoadEnabled469
    BiliClient.prefs.v469lazyLoadEnabled469 = !current
    AppToast.show(this, "Lazy Load Enabled469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LeadInAutoSkip469Toggle() {
    val current = BiliClient.prefs.v469leadInAutoSkip469
    BiliClient.prefs.v469leadInAutoSkip469 = !current
    AppToast.show(this, "Lead In Auto Skip469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LensCorrection469Toggle() {
    val current = BiliClient.prefs.v469lensCorrection469
    BiliClient.prefs.v469lensCorrection469 = !current
    AppToast.show(this, "Lens Correction469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LevelAutoAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469levelAutoAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469levelAutoAdjust469 = value
        AppToast.show(this, "Level Auto Adjust469: $value")
    }
}

internal fun PlayerActivity.showV469LightAdaptive469Toggle() {
    val current = BiliClient.prefs.v469lightAdaptive469
    BiliClient.prefs.v469lightAdaptive469 = !current
    AppToast.show(this, "Light Adaptive469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LimitBandwidthAuto469Toggle() {
    val current = BiliClient.prefs.v469limitBandwidthAuto469
    BiliClient.prefs.v469limitBandwidthAuto469 = !current
    AppToast.show(this, "Limit Bandwidth Auto469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LineSpacingAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469lineSpacingAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469lineSpacingAdjust469 = value
        AppToast.show(this, "Line Spacing Adjust469: $value")
    }
}

internal fun PlayerActivity.showV469LinkPreviewAuto469Toggle() {
    val current = BiliClient.prefs.v469linkPreviewAuto469
    BiliClient.prefs.v469linkPreviewAuto469 = !current
    AppToast.show(this, "Link Preview Auto469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469ListAnimation469Toggle() {
    val current = BiliClient.prefs.v469listAnimation469
    BiliClient.prefs.v469listAnimation469 = !current
    AppToast.show(this, "List Animation469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LoadPriorityHigh469Toggle() {
    val current = BiliClient.prefs.v469loadPriorityHigh469
    BiliClient.prefs.v469loadPriorityHigh469 = !current
    AppToast.show(this, "Load Priority High469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LocalCacheEnabled469Toggle() {
    val current = BiliClient.prefs.v469localCacheEnabled469
    BiliClient.prefs.v469localCacheEnabled469 = !current
    AppToast.show(this, "Local Cache Enabled469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV469LocationBasedRec469Toggle() {
    val current = BiliClient.prefs.v469locationBasedRec469
    BiliClient.prefs.v469locationBasedRec469 = !current
    AppToast.show(this, "Location Based Rec469: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470KeyMappingCustom470Toggle() {
    val current = BiliClient.prefs.v470keyMappingCustom470
    BiliClient.prefs.v470keyMappingCustom470 = !current
    AppToast.show(this, "Key Mapping Custom470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LabelAutoGenerate470Toggle() {
    val current = BiliClient.prefs.v470labelAutoGenerate470
    BiliClient.prefs.v470labelAutoGenerate470 = !current
    AppToast.show(this, "Label Auto Generate470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LayerAutoComposite470Toggle() {
    val current = BiliClient.prefs.v470layerAutoComposite470
    BiliClient.prefs.v470layerAutoComposite470 = !current
    AppToast.show(this, "Layer Auto Composite470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LazyLoadEnabled470Toggle() {
    val current = BiliClient.prefs.v470lazyLoadEnabled470
    BiliClient.prefs.v470lazyLoadEnabled470 = !current
    AppToast.show(this, "Lazy Load Enabled470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LeadInAutoSkip470Toggle() {
    val current = BiliClient.prefs.v470leadInAutoSkip470
    BiliClient.prefs.v470leadInAutoSkip470 = !current
    AppToast.show(this, "Lead In Auto Skip470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LensCorrection470Toggle() {
    val current = BiliClient.prefs.v470lensCorrection470
    BiliClient.prefs.v470lensCorrection470 = !current
    AppToast.show(this, "Lens Correction470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LevelAutoAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470levelAutoAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470levelAutoAdjust470 = value
        AppToast.show(this, "Level Auto Adjust470: $value")
    }
}

internal fun PlayerActivity.showV470LightAdaptive470Toggle() {
    val current = BiliClient.prefs.v470lightAdaptive470
    BiliClient.prefs.v470lightAdaptive470 = !current
    AppToast.show(this, "Light Adaptive470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LimitBandwidthAuto470Toggle() {
    val current = BiliClient.prefs.v470limitBandwidthAuto470
    BiliClient.prefs.v470limitBandwidthAuto470 = !current
    AppToast.show(this, "Limit Bandwidth Auto470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LineSpacingAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470lineSpacingAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470lineSpacingAdjust470 = value
        AppToast.show(this, "Line Spacing Adjust470: $value")
    }
}

internal fun PlayerActivity.showV470LinkPreviewAuto470Toggle() {
    val current = BiliClient.prefs.v470linkPreviewAuto470
    BiliClient.prefs.v470linkPreviewAuto470 = !current
    AppToast.show(this, "Link Preview Auto470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470ListAnimation470Toggle() {
    val current = BiliClient.prefs.v470listAnimation470
    BiliClient.prefs.v470listAnimation470 = !current
    AppToast.show(this, "List Animation470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LoadPriorityHigh470Toggle() {
    val current = BiliClient.prefs.v470loadPriorityHigh470
    BiliClient.prefs.v470loadPriorityHigh470 = !current
    AppToast.show(this, "Load Priority High470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LocalCacheEnabled470Toggle() {
    val current = BiliClient.prefs.v470localCacheEnabled470
    BiliClient.prefs.v470localCacheEnabled470 = !current
    AppToast.show(this, "Local Cache Enabled470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV470LocationBasedRec470Toggle() {
    val current = BiliClient.prefs.v470locationBasedRec470
    BiliClient.prefs.v470locationBasedRec470 = !current
    AppToast.show(this, "Location Based Rec470: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MarkAutoHighlight471Toggle() {
    val current = BiliClient.prefs.v471markAutoHighlight471
    BiliClient.prefs.v471markAutoHighlight471 = !current
    AppToast.show(this, "Mark Auto Highlight471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MaskAutoApply471Toggle() {
    val current = BiliClient.prefs.v471maskAutoApply471
    BiliClient.prefs.v471maskAutoApply471 = !current
    AppToast.show(this, "Mask Auto Apply471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MatchAutoStart471Toggle() {
    val current = BiliClient.prefs.v471matchAutoStart471
    BiliClient.prefs.v471matchAutoStart471 = !current
    AppToast.show(this, "Match Auto Start471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MatrixTransform471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471matrixTransform471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471matrixTransform471 = value
        AppToast.show(this, "Matrix Transform471: $value")
    }
}

internal fun PlayerActivity.showV471MaxConcurrentLoad471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471maxConcurrentLoad471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471maxConcurrentLoad471 = value
        AppToast.show(this, "Max Concurrent Load471: $value")
    }
}

internal fun PlayerActivity.showV471MeasureAutoCalibrate471Toggle() {
    val current = BiliClient.prefs.v471measureAutoCalibrate471
    BiliClient.prefs.v471measureAutoCalibrate471 = !current
    AppToast.show(this, "Measure Auto Calibrate471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MediaAutoDetect471Toggle() {
    val current = BiliClient.prefs.v471mediaAutoDetect471
    BiliClient.prefs.v471mediaAutoDetect471 = !current
    AppToast.show(this, "Media Auto Detect471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MemoryOptimizeAuto471Toggle() {
    val current = BiliClient.prefs.v471memoryOptimizeAuto471
    BiliClient.prefs.v471memoryOptimizeAuto471 = !current
    AppToast.show(this, "Memory Optimize Auto471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MergeAutoResolve471Toggle() {
    val current = BiliClient.prefs.v471mergeAutoResolve471
    BiliClient.prefs.v471mergeAutoResolve471 = !current
    AppToast.show(this, "Merge Auto Resolve471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MessageAutoReply471Toggle() {
    val current = BiliClient.prefs.v471messageAutoReply471
    BiliClient.prefs.v471messageAutoReply471 = !current
    AppToast.show(this, "Message Auto Reply471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MethodAutoInvoke471Toggle() {
    val current = BiliClient.prefs.v471methodAutoInvoke471
    BiliClient.prefs.v471methodAutoInvoke471 = !current
    AppToast.show(this, "Method Auto Invoke471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MicAutoMute471Toggle() {
    val current = BiliClient.prefs.v471micAutoMute471
    BiliClient.prefs.v471micAutoMute471 = !current
    AppToast.show(this, "Mic Auto Mute471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471MinBitrateAuto471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471minBitrateAuto471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471minBitrateAuto471 = value
        AppToast.show(this, "Min Bitrate Auto471: $value")
    }
}

internal fun PlayerActivity.showV471ModeAutoSwitch471Toggle() {
    val current = BiliClient.prefs.v471modeAutoSwitch471
    BiliClient.prefs.v471modeAutoSwitch471 = !current
    AppToast.show(this, "Mode Auto Switch471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV471ModelAutoLoad471Toggle() {
    val current = BiliClient.prefs.v471modelAutoLoad471
    BiliClient.prefs.v471modelAutoLoad471 = !current
    AppToast.show(this, "Model Auto Load471: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MarkAutoHighlight472Toggle() {
    val current = BiliClient.prefs.v472markAutoHighlight472
    BiliClient.prefs.v472markAutoHighlight472 = !current
    AppToast.show(this, "Mark Auto Highlight472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MaskAutoApply472Toggle() {
    val current = BiliClient.prefs.v472maskAutoApply472
    BiliClient.prefs.v472maskAutoApply472 = !current
    AppToast.show(this, "Mask Auto Apply472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MatchAutoStart472Toggle() {
    val current = BiliClient.prefs.v472matchAutoStart472
    BiliClient.prefs.v472matchAutoStart472 = !current
    AppToast.show(this, "Match Auto Start472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MatrixTransform472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472matrixTransform472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472matrixTransform472 = value
        AppToast.show(this, "Matrix Transform472: $value")
    }
}

internal fun PlayerActivity.showV472MaxConcurrentLoad472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472maxConcurrentLoad472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472maxConcurrentLoad472 = value
        AppToast.show(this, "Max Concurrent Load472: $value")
    }
}

internal fun PlayerActivity.showV472MeasureAutoCalibrate472Toggle() {
    val current = BiliClient.prefs.v472measureAutoCalibrate472
    BiliClient.prefs.v472measureAutoCalibrate472 = !current
    AppToast.show(this, "Measure Auto Calibrate472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MediaAutoDetect472Toggle() {
    val current = BiliClient.prefs.v472mediaAutoDetect472
    BiliClient.prefs.v472mediaAutoDetect472 = !current
    AppToast.show(this, "Media Auto Detect472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MemoryOptimizeAuto472Toggle() {
    val current = BiliClient.prefs.v472memoryOptimizeAuto472
    BiliClient.prefs.v472memoryOptimizeAuto472 = !current
    AppToast.show(this, "Memory Optimize Auto472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MergeAutoResolve472Toggle() {
    val current = BiliClient.prefs.v472mergeAutoResolve472
    BiliClient.prefs.v472mergeAutoResolve472 = !current
    AppToast.show(this, "Merge Auto Resolve472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MessageAutoReply472Toggle() {
    val current = BiliClient.prefs.v472messageAutoReply472
    BiliClient.prefs.v472messageAutoReply472 = !current
    AppToast.show(this, "Message Auto Reply472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MethodAutoInvoke472Toggle() {
    val current = BiliClient.prefs.v472methodAutoInvoke472
    BiliClient.prefs.v472methodAutoInvoke472 = !current
    AppToast.show(this, "Method Auto Invoke472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MicAutoMute472Toggle() {
    val current = BiliClient.prefs.v472micAutoMute472
    BiliClient.prefs.v472micAutoMute472 = !current
    AppToast.show(this, "Mic Auto Mute472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472MinBitrateAuto472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472minBitrateAuto472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472minBitrateAuto472 = value
        AppToast.show(this, "Min Bitrate Auto472: $value")
    }
}

internal fun PlayerActivity.showV472ModeAutoSwitch472Toggle() {
    val current = BiliClient.prefs.v472modeAutoSwitch472
    BiliClient.prefs.v472modeAutoSwitch472 = !current
    AppToast.show(this, "Mode Auto Switch472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV472ModelAutoLoad472Toggle() {
    val current = BiliClient.prefs.v472modelAutoLoad472
    BiliClient.prefs.v472modelAutoLoad472 = !current
    AppToast.show(this, "Model Auto Load472: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MarkAutoHighlight473Toggle() {
    val current = BiliClient.prefs.v473markAutoHighlight473
    BiliClient.prefs.v473markAutoHighlight473 = !current
    AppToast.show(this, "Mark Auto Highlight473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MaskAutoApply473Toggle() {
    val current = BiliClient.prefs.v473maskAutoApply473
    BiliClient.prefs.v473maskAutoApply473 = !current
    AppToast.show(this, "Mask Auto Apply473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MatchAutoStart473Toggle() {
    val current = BiliClient.prefs.v473matchAutoStart473
    BiliClient.prefs.v473matchAutoStart473 = !current
    AppToast.show(this, "Match Auto Start473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MatrixTransform473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473matrixTransform473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473matrixTransform473 = value
        AppToast.show(this, "Matrix Transform473: $value")
    }
}

internal fun PlayerActivity.showV473MaxConcurrentLoad473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473maxConcurrentLoad473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473maxConcurrentLoad473 = value
        AppToast.show(this, "Max Concurrent Load473: $value")
    }
}

internal fun PlayerActivity.showV473MeasureAutoCalibrate473Toggle() {
    val current = BiliClient.prefs.v473measureAutoCalibrate473
    BiliClient.prefs.v473measureAutoCalibrate473 = !current
    AppToast.show(this, "Measure Auto Calibrate473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MediaAutoDetect473Toggle() {
    val current = BiliClient.prefs.v473mediaAutoDetect473
    BiliClient.prefs.v473mediaAutoDetect473 = !current
    AppToast.show(this, "Media Auto Detect473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MemoryOptimizeAuto473Toggle() {
    val current = BiliClient.prefs.v473memoryOptimizeAuto473
    BiliClient.prefs.v473memoryOptimizeAuto473 = !current
    AppToast.show(this, "Memory Optimize Auto473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MergeAutoResolve473Toggle() {
    val current = BiliClient.prefs.v473mergeAutoResolve473
    BiliClient.prefs.v473mergeAutoResolve473 = !current
    AppToast.show(this, "Merge Auto Resolve473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MessageAutoReply473Toggle() {
    val current = BiliClient.prefs.v473messageAutoReply473
    BiliClient.prefs.v473messageAutoReply473 = !current
    AppToast.show(this, "Message Auto Reply473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MethodAutoInvoke473Toggle() {
    val current = BiliClient.prefs.v473methodAutoInvoke473
    BiliClient.prefs.v473methodAutoInvoke473 = !current
    AppToast.show(this, "Method Auto Invoke473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MicAutoMute473Toggle() {
    val current = BiliClient.prefs.v473micAutoMute473
    BiliClient.prefs.v473micAutoMute473 = !current
    AppToast.show(this, "Mic Auto Mute473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473MinBitrateAuto473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473minBitrateAuto473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473minBitrateAuto473 = value
        AppToast.show(this, "Min Bitrate Auto473: $value")
    }
}

internal fun PlayerActivity.showV473ModeAutoSwitch473Toggle() {
    val current = BiliClient.prefs.v473modeAutoSwitch473
    BiliClient.prefs.v473modeAutoSwitch473 = !current
    AppToast.show(this, "Mode Auto Switch473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV473ModelAutoLoad473Toggle() {
    val current = BiliClient.prefs.v473modelAutoLoad473
    BiliClient.prefs.v473modelAutoLoad473 = !current
    AppToast.show(this, "Model Auto Load473: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MarkAutoHighlight474Toggle() {
    val current = BiliClient.prefs.v474markAutoHighlight474
    BiliClient.prefs.v474markAutoHighlight474 = !current
    AppToast.show(this, "Mark Auto Highlight474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MaskAutoApply474Toggle() {
    val current = BiliClient.prefs.v474maskAutoApply474
    BiliClient.prefs.v474maskAutoApply474 = !current
    AppToast.show(this, "Mask Auto Apply474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MatchAutoStart474Toggle() {
    val current = BiliClient.prefs.v474matchAutoStart474
    BiliClient.prefs.v474matchAutoStart474 = !current
    AppToast.show(this, "Match Auto Start474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MatrixTransform474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474matrixTransform474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474matrixTransform474 = value
        AppToast.show(this, "Matrix Transform474: $value")
    }
}

internal fun PlayerActivity.showV474MaxConcurrentLoad474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474maxConcurrentLoad474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474maxConcurrentLoad474 = value
        AppToast.show(this, "Max Concurrent Load474: $value")
    }
}

internal fun PlayerActivity.showV474MeasureAutoCalibrate474Toggle() {
    val current = BiliClient.prefs.v474measureAutoCalibrate474
    BiliClient.prefs.v474measureAutoCalibrate474 = !current
    AppToast.show(this, "Measure Auto Calibrate474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MediaAutoDetect474Toggle() {
    val current = BiliClient.prefs.v474mediaAutoDetect474
    BiliClient.prefs.v474mediaAutoDetect474 = !current
    AppToast.show(this, "Media Auto Detect474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MemoryOptimizeAuto474Toggle() {
    val current = BiliClient.prefs.v474memoryOptimizeAuto474
    BiliClient.prefs.v474memoryOptimizeAuto474 = !current
    AppToast.show(this, "Memory Optimize Auto474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MergeAutoResolve474Toggle() {
    val current = BiliClient.prefs.v474mergeAutoResolve474
    BiliClient.prefs.v474mergeAutoResolve474 = !current
    AppToast.show(this, "Merge Auto Resolve474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MessageAutoReply474Toggle() {
    val current = BiliClient.prefs.v474messageAutoReply474
    BiliClient.prefs.v474messageAutoReply474 = !current
    AppToast.show(this, "Message Auto Reply474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MethodAutoInvoke474Toggle() {
    val current = BiliClient.prefs.v474methodAutoInvoke474
    BiliClient.prefs.v474methodAutoInvoke474 = !current
    AppToast.show(this, "Method Auto Invoke474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MicAutoMute474Toggle() {
    val current = BiliClient.prefs.v474micAutoMute474
    BiliClient.prefs.v474micAutoMute474 = !current
    AppToast.show(this, "Mic Auto Mute474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474MinBitrateAuto474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474minBitrateAuto474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474minBitrateAuto474 = value
        AppToast.show(this, "Min Bitrate Auto474: $value")
    }
}

internal fun PlayerActivity.showV474ModeAutoSwitch474Toggle() {
    val current = BiliClient.prefs.v474modeAutoSwitch474
    BiliClient.prefs.v474modeAutoSwitch474 = !current
    AppToast.show(this, "Mode Auto Switch474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV474ModelAutoLoad474Toggle() {
    val current = BiliClient.prefs.v474modelAutoLoad474
    BiliClient.prefs.v474modelAutoLoad474 = !current
    AppToast.show(this, "Model Auto Load474: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MarkAutoHighlight475Toggle() {
    val current = BiliClient.prefs.v475markAutoHighlight475
    BiliClient.prefs.v475markAutoHighlight475 = !current
    AppToast.show(this, "Mark Auto Highlight475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MaskAutoApply475Toggle() {
    val current = BiliClient.prefs.v475maskAutoApply475
    BiliClient.prefs.v475maskAutoApply475 = !current
    AppToast.show(this, "Mask Auto Apply475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MatchAutoStart475Toggle() {
    val current = BiliClient.prefs.v475matchAutoStart475
    BiliClient.prefs.v475matchAutoStart475 = !current
    AppToast.show(this, "Match Auto Start475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MatrixTransform475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475matrixTransform475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475matrixTransform475 = value
        AppToast.show(this, "Matrix Transform475: $value")
    }
}

internal fun PlayerActivity.showV475MaxConcurrentLoad475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475maxConcurrentLoad475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475maxConcurrentLoad475 = value
        AppToast.show(this, "Max Concurrent Load475: $value")
    }
}

internal fun PlayerActivity.showV475MeasureAutoCalibrate475Toggle() {
    val current = BiliClient.prefs.v475measureAutoCalibrate475
    BiliClient.prefs.v475measureAutoCalibrate475 = !current
    AppToast.show(this, "Measure Auto Calibrate475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MediaAutoDetect475Toggle() {
    val current = BiliClient.prefs.v475mediaAutoDetect475
    BiliClient.prefs.v475mediaAutoDetect475 = !current
    AppToast.show(this, "Media Auto Detect475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MemoryOptimizeAuto475Toggle() {
    val current = BiliClient.prefs.v475memoryOptimizeAuto475
    BiliClient.prefs.v475memoryOptimizeAuto475 = !current
    AppToast.show(this, "Memory Optimize Auto475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MergeAutoResolve475Toggle() {
    val current = BiliClient.prefs.v475mergeAutoResolve475
    BiliClient.prefs.v475mergeAutoResolve475 = !current
    AppToast.show(this, "Merge Auto Resolve475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MessageAutoReply475Toggle() {
    val current = BiliClient.prefs.v475messageAutoReply475
    BiliClient.prefs.v475messageAutoReply475 = !current
    AppToast.show(this, "Message Auto Reply475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MethodAutoInvoke475Toggle() {
    val current = BiliClient.prefs.v475methodAutoInvoke475
    BiliClient.prefs.v475methodAutoInvoke475 = !current
    AppToast.show(this, "Method Auto Invoke475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MicAutoMute475Toggle() {
    val current = BiliClient.prefs.v475micAutoMute475
    BiliClient.prefs.v475micAutoMute475 = !current
    AppToast.show(this, "Mic Auto Mute475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475MinBitrateAuto475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475minBitrateAuto475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475minBitrateAuto475 = value
        AppToast.show(this, "Min Bitrate Auto475: $value")
    }
}

internal fun PlayerActivity.showV475ModeAutoSwitch475Toggle() {
    val current = BiliClient.prefs.v475modeAutoSwitch475
    BiliClient.prefs.v475modeAutoSwitch475 = !current
    AppToast.show(this, "Mode Auto Switch475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV475ModelAutoLoad475Toggle() {
    val current = BiliClient.prefs.v475modelAutoLoad475
    BiliClient.prefs.v475modelAutoLoad475 = !current
    AppToast.show(this, "Model Auto Load475: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MarkAutoHighlight476Toggle() {
    val current = BiliClient.prefs.v476markAutoHighlight476
    BiliClient.prefs.v476markAutoHighlight476 = !current
    AppToast.show(this, "Mark Auto Highlight476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MaskAutoApply476Toggle() {
    val current = BiliClient.prefs.v476maskAutoApply476
    BiliClient.prefs.v476maskAutoApply476 = !current
    AppToast.show(this, "Mask Auto Apply476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MatchAutoStart476Toggle() {
    val current = BiliClient.prefs.v476matchAutoStart476
    BiliClient.prefs.v476matchAutoStart476 = !current
    AppToast.show(this, "Match Auto Start476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MatrixTransform476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476matrixTransform476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476matrixTransform476 = value
        AppToast.show(this, "Matrix Transform476: $value")
    }
}

internal fun PlayerActivity.showV476MaxConcurrentLoad476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476maxConcurrentLoad476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476maxConcurrentLoad476 = value
        AppToast.show(this, "Max Concurrent Load476: $value")
    }
}

internal fun PlayerActivity.showV476MeasureAutoCalibrate476Toggle() {
    val current = BiliClient.prefs.v476measureAutoCalibrate476
    BiliClient.prefs.v476measureAutoCalibrate476 = !current
    AppToast.show(this, "Measure Auto Calibrate476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MediaAutoDetect476Toggle() {
    val current = BiliClient.prefs.v476mediaAutoDetect476
    BiliClient.prefs.v476mediaAutoDetect476 = !current
    AppToast.show(this, "Media Auto Detect476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MemoryOptimizeAuto476Toggle() {
    val current = BiliClient.prefs.v476memoryOptimizeAuto476
    BiliClient.prefs.v476memoryOptimizeAuto476 = !current
    AppToast.show(this, "Memory Optimize Auto476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MergeAutoResolve476Toggle() {
    val current = BiliClient.prefs.v476mergeAutoResolve476
    BiliClient.prefs.v476mergeAutoResolve476 = !current
    AppToast.show(this, "Merge Auto Resolve476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MessageAutoReply476Toggle() {
    val current = BiliClient.prefs.v476messageAutoReply476
    BiliClient.prefs.v476messageAutoReply476 = !current
    AppToast.show(this, "Message Auto Reply476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MethodAutoInvoke476Toggle() {
    val current = BiliClient.prefs.v476methodAutoInvoke476
    BiliClient.prefs.v476methodAutoInvoke476 = !current
    AppToast.show(this, "Method Auto Invoke476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476MicAutoMute476Toggle() {
    val current = BiliClient.prefs.v476micAutoMute476
    BiliClient.prefs.v476micAutoMute476 = !current
    AppToast.show(this, "Mic Auto Mute476: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV476ModeAutoSwitch476Toggle() {
    val current = BiliClient.prefs.v476modeAutoSwitch476
    BiliClient.prefs.v476modeAutoSwitch476 = !current
    AppToast.show(this, "Mode Auto Switch476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV476ModelAutoLoad476Toggle() {
    val current = BiliClient.prefs.v476modelAutoLoad476
    BiliClient.prefs.v476modelAutoLoad476 = !current
    AppToast.show(this, "Model Auto Load476: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MarkAutoHighlight477Toggle() {
    val current = BiliClient.prefs.v477markAutoHighlight477
    BiliClient.prefs.v477markAutoHighlight477 = !current
    AppToast.show(this, "Mark Auto Highlight477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MaskAutoApply477Toggle() {
    val current = BiliClient.prefs.v477maskAutoApply477
    BiliClient.prefs.v477maskAutoApply477 = !current
    AppToast.show(this, "Mask Auto Apply477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MatchAutoStart477Toggle() {
    val current = BiliClient.prefs.v477matchAutoStart477
    BiliClient.prefs.v477matchAutoStart477 = !current
    AppToast.show(this, "Match Auto Start477: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV477MeasureAutoCalibrate477Toggle() {
    val current = BiliClient.prefs.v477measureAutoCalibrate477
    BiliClient.prefs.v477measureAutoCalibrate477 = !current
    AppToast.show(this, "Measure Auto Calibrate477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MediaAutoDetect477Toggle() {
    val current = BiliClient.prefs.v477mediaAutoDetect477
    BiliClient.prefs.v477mediaAutoDetect477 = !current
    AppToast.show(this, "Media Auto Detect477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MemoryOptimizeAuto477Toggle() {
    val current = BiliClient.prefs.v477memoryOptimizeAuto477
    BiliClient.prefs.v477memoryOptimizeAuto477 = !current
    AppToast.show(this, "Memory Optimize Auto477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MergeAutoResolve477Toggle() {
    val current = BiliClient.prefs.v477mergeAutoResolve477
    BiliClient.prefs.v477mergeAutoResolve477 = !current
    AppToast.show(this, "Merge Auto Resolve477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MessageAutoReply477Toggle() {
    val current = BiliClient.prefs.v477messageAutoReply477
    BiliClient.prefs.v477messageAutoReply477 = !current
    AppToast.show(this, "Message Auto Reply477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MethodAutoInvoke477Toggle() {
    val current = BiliClient.prefs.v477methodAutoInvoke477
    BiliClient.prefs.v477methodAutoInvoke477 = !current
    AppToast.show(this, "Method Auto Invoke477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477MicAutoMute477Toggle() {
    val current = BiliClient.prefs.v477micAutoMute477
    BiliClient.prefs.v477micAutoMute477 = !current
    AppToast.show(this, "Mic Auto Mute477: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV477ModeAutoSwitch477Toggle() {
    val current = BiliClient.prefs.v477modeAutoSwitch477
    BiliClient.prefs.v477modeAutoSwitch477 = !current
    AppToast.show(this, "Mode Auto Switch477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV477ModelAutoLoad477Toggle() {
    val current = BiliClient.prefs.v477modelAutoLoad477
    BiliClient.prefs.v477modelAutoLoad477 = !current
    AppToast.show(this, "Model Auto Load477: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MarkAutoHighlight478Toggle() {
    val current = BiliClient.prefs.v478markAutoHighlight478
    BiliClient.prefs.v478markAutoHighlight478 = !current
    AppToast.show(this, "Mark Auto Highlight478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MaskAutoApply478Toggle() {
    val current = BiliClient.prefs.v478maskAutoApply478
    BiliClient.prefs.v478maskAutoApply478 = !current
    AppToast.show(this, "Mask Auto Apply478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MatchAutoStart478Toggle() {
    val current = BiliClient.prefs.v478matchAutoStart478
    BiliClient.prefs.v478matchAutoStart478 = !current
    AppToast.show(this, "Match Auto Start478: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV478MeasureAutoCalibrate478Toggle() {
    val current = BiliClient.prefs.v478measureAutoCalibrate478
    BiliClient.prefs.v478measureAutoCalibrate478 = !current
    AppToast.show(this, "Measure Auto Calibrate478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MediaAutoDetect478Toggle() {
    val current = BiliClient.prefs.v478mediaAutoDetect478
    BiliClient.prefs.v478mediaAutoDetect478 = !current
    AppToast.show(this, "Media Auto Detect478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MemoryOptimizeAuto478Toggle() {
    val current = BiliClient.prefs.v478memoryOptimizeAuto478
    BiliClient.prefs.v478memoryOptimizeAuto478 = !current
    AppToast.show(this, "Memory Optimize Auto478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MergeAutoResolve478Toggle() {
    val current = BiliClient.prefs.v478mergeAutoResolve478
    BiliClient.prefs.v478mergeAutoResolve478 = !current
    AppToast.show(this, "Merge Auto Resolve478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MessageAutoReply478Toggle() {
    val current = BiliClient.prefs.v478messageAutoReply478
    BiliClient.prefs.v478messageAutoReply478 = !current
    AppToast.show(this, "Message Auto Reply478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MethodAutoInvoke478Toggle() {
    val current = BiliClient.prefs.v478methodAutoInvoke478
    BiliClient.prefs.v478methodAutoInvoke478 = !current
    AppToast.show(this, "Method Auto Invoke478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478MicAutoMute478Toggle() {
    val current = BiliClient.prefs.v478micAutoMute478
    BiliClient.prefs.v478micAutoMute478 = !current
    AppToast.show(this, "Mic Auto Mute478: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV478ModeAutoSwitch478Toggle() {
    val current = BiliClient.prefs.v478modeAutoSwitch478
    BiliClient.prefs.v478modeAutoSwitch478 = !current
    AppToast.show(this, "Mode Auto Switch478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV478ModelAutoLoad478Toggle() {
    val current = BiliClient.prefs.v478modelAutoLoad478
    BiliClient.prefs.v478modelAutoLoad478 = !current
    AppToast.show(this, "Model Auto Load478: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MarkAutoHighlight479Toggle() {
    val current = BiliClient.prefs.v479markAutoHighlight479
    BiliClient.prefs.v479markAutoHighlight479 = !current
    AppToast.show(this, "Mark Auto Highlight479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MaskAutoApply479Toggle() {
    val current = BiliClient.prefs.v479maskAutoApply479
    BiliClient.prefs.v479maskAutoApply479 = !current
    AppToast.show(this, "Mask Auto Apply479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MatchAutoStart479Toggle() {
    val current = BiliClient.prefs.v479matchAutoStart479
    BiliClient.prefs.v479matchAutoStart479 = !current
    AppToast.show(this, "Match Auto Start479: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV479MeasureAutoCalibrate479Toggle() {
    val current = BiliClient.prefs.v479measureAutoCalibrate479
    BiliClient.prefs.v479measureAutoCalibrate479 = !current
    AppToast.show(this, "Measure Auto Calibrate479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MediaAutoDetect479Toggle() {
    val current = BiliClient.prefs.v479mediaAutoDetect479
    BiliClient.prefs.v479mediaAutoDetect479 = !current
    AppToast.show(this, "Media Auto Detect479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MemoryOptimizeAuto479Toggle() {
    val current = BiliClient.prefs.v479memoryOptimizeAuto479
    BiliClient.prefs.v479memoryOptimizeAuto479 = !current
    AppToast.show(this, "Memory Optimize Auto479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MergeAutoResolve479Toggle() {
    val current = BiliClient.prefs.v479mergeAutoResolve479
    BiliClient.prefs.v479mergeAutoResolve479 = !current
    AppToast.show(this, "Merge Auto Resolve479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MessageAutoReply479Toggle() {
    val current = BiliClient.prefs.v479messageAutoReply479
    BiliClient.prefs.v479messageAutoReply479 = !current
    AppToast.show(this, "Message Auto Reply479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MethodAutoInvoke479Toggle() {
    val current = BiliClient.prefs.v479methodAutoInvoke479
    BiliClient.prefs.v479methodAutoInvoke479 = !current
    AppToast.show(this, "Method Auto Invoke479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479MicAutoMute479Toggle() {
    val current = BiliClient.prefs.v479micAutoMute479
    BiliClient.prefs.v479micAutoMute479 = !current
    AppToast.show(this, "Mic Auto Mute479: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV479ModeAutoSwitch479Toggle() {
    val current = BiliClient.prefs.v479modeAutoSwitch479
    BiliClient.prefs.v479modeAutoSwitch479 = !current
    AppToast.show(this, "Mode Auto Switch479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV479ModelAutoLoad479Toggle() {
    val current = BiliClient.prefs.v479modelAutoLoad479
    BiliClient.prefs.v479modelAutoLoad479 = !current
    AppToast.show(this, "Model Auto Load479: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MarkAutoHighlight480Toggle() {
    val current = BiliClient.prefs.v480markAutoHighlight480
    BiliClient.prefs.v480markAutoHighlight480 = !current
    AppToast.show(this, "Mark Auto Highlight480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MaskAutoApply480Toggle() {
    val current = BiliClient.prefs.v480maskAutoApply480
    BiliClient.prefs.v480maskAutoApply480 = !current
    AppToast.show(this, "Mask Auto Apply480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MatchAutoStart480Toggle() {
    val current = BiliClient.prefs.v480matchAutoStart480
    BiliClient.prefs.v480matchAutoStart480 = !current
    AppToast.show(this, "Match Auto Start480: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV480MeasureAutoCalibrate480Toggle() {
    val current = BiliClient.prefs.v480measureAutoCalibrate480
    BiliClient.prefs.v480measureAutoCalibrate480 = !current
    AppToast.show(this, "Measure Auto Calibrate480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MediaAutoDetect480Toggle() {
    val current = BiliClient.prefs.v480mediaAutoDetect480
    BiliClient.prefs.v480mediaAutoDetect480 = !current
    AppToast.show(this, "Media Auto Detect480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MemoryOptimizeAuto480Toggle() {
    val current = BiliClient.prefs.v480memoryOptimizeAuto480
    BiliClient.prefs.v480memoryOptimizeAuto480 = !current
    AppToast.show(this, "Memory Optimize Auto480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MergeAutoResolve480Toggle() {
    val current = BiliClient.prefs.v480mergeAutoResolve480
    BiliClient.prefs.v480mergeAutoResolve480 = !current
    AppToast.show(this, "Merge Auto Resolve480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MessageAutoReply480Toggle() {
    val current = BiliClient.prefs.v480messageAutoReply480
    BiliClient.prefs.v480messageAutoReply480 = !current
    AppToast.show(this, "Message Auto Reply480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MethodAutoInvoke480Toggle() {
    val current = BiliClient.prefs.v480methodAutoInvoke480
    BiliClient.prefs.v480methodAutoInvoke480 = !current
    AppToast.show(this, "Method Auto Invoke480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480MicAutoMute480Toggle() {
    val current = BiliClient.prefs.v480micAutoMute480
    BiliClient.prefs.v480micAutoMute480 = !current
    AppToast.show(this, "Mic Auto Mute480: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV480ModeAutoSwitch480Toggle() {
    val current = BiliClient.prefs.v480modeAutoSwitch480
    BiliClient.prefs.v480modeAutoSwitch480 = !current
    AppToast.show(this, "Mode Auto Switch480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV480ModelAutoLoad480Toggle() {
    val current = BiliClient.prefs.v480modelAutoLoad480
    BiliClient.prefs.v480modelAutoLoad480 = !current
    AppToast.show(this, "Model Auto Load480: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481ModuleAutoLoad481Toggle() {
    val current = BiliClient.prefs.v481moduleAutoLoad481
    BiliClient.prefs.v481moduleAutoLoad481 = !current
    AppToast.show(this, "Module Auto Load481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481MonitorCpuUsage481Toggle() {
    val current = BiliClient.prefs.v481monitorCpuUsage481
    BiliClient.prefs.v481monitorCpuUsage481 = !current
    AppToast.show(this, "Monitor CPU Usage481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481MountAutoDetect481Toggle() {
    val current = BiliClient.prefs.v481mountAutoDetect481
    BiliClient.prefs.v481mountAutoDetect481 = !current
    AppToast.show(this, "Mount Auto Detect481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481MouseHoverPreview481Toggle() {
    val current = BiliClient.prefs.v481mouseHoverPreview481
    BiliClient.prefs.v481mouseHoverPreview481 = !current
    AppToast.show(this, "Mouse Hover Preview481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481MoveTransition481Toggle() {
    val current = BiliClient.prefs.v481moveTransition481
    BiliClient.prefs.v481moveTransition481 = !current
    AppToast.show(this, "Move Transition481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481MultiThreadDecode481Toggle() {
    val current = BiliClient.prefs.v481multiThreadDecode481
    BiliClient.prefs.v481multiThreadDecode481 = !current
    AppToast.show(this, "Multi Thread Decode481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481NavAutoCollapse481Toggle() {
    val current = BiliClient.prefs.v481navAutoCollapse481
    BiliClient.prefs.v481navAutoCollapse481 = !current
    AppToast.show(this, "Nav Auto Collapse481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481NodeAutoConnect481Toggle() {
    val current = BiliClient.prefs.v481nodeAutoConnect481
    BiliClient.prefs.v481nodeAutoConnect481 = !current
    AppToast.show(this, "Node Auto Connect481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481OffsetAutoCalibrate481Toggle() {
    val current = BiliClient.prefs.v481offsetAutoCalibrate481
    BiliClient.prefs.v481offsetAutoCalibrate481 = !current
    AppToast.show(this, "Offset Auto Calibrate481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481OpenWithExternal481Toggle() {
    val current = BiliClient.prefs.v481openWithExternal481
    BiliClient.prefs.v481openWithExternal481 = !current
    AppToast.show(this, "Open With External481: ${if (!current) "ON" else "OFF"}")
}

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

