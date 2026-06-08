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

internal fun PlayerActivity.showV668ControlAutoHide668Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v668controlAutoHide668).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide668",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v668controlAutoHide668 = value
        AppToast.show(this, "Control Auto Hide668: $value")
    }
}

internal fun PlayerActivity.showV668ConvertAutoFormat668Toggle() {
    val current = BiliClient.prefs.v668convertAutoFormat668
    BiliClient.prefs.v668convertAutoFormat668 = !current
    AppToast.show(this, "Convert Auto Format668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668CopyAutoClipboard668Toggle() {
    val current = BiliClient.prefs.v668copyAutoClipboard668
    BiliClient.prefs.v668copyAutoClipboard668 = !current
    AppToast.show(this, "Copy Auto Clipboard668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668CoreAutoAffinity668Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v668coreAutoAffinity668).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity668",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v668coreAutoAffinity668 = value
        AppToast.show(this, "Core Auto Affinity668: $value")
    }
}

internal fun PlayerActivity.showV668CountAutoIncrement668Toggle() {
    val current = BiliClient.prefs.v668countAutoIncrement668
    BiliClient.prefs.v668countAutoIncrement668 = !current
    AppToast.show(this, "Count Auto Increment668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668CoverAutoGenerate668Toggle() {
    val current = BiliClient.prefs.v668coverAutoGenerate668
    BiliClient.prefs.v668coverAutoGenerate668 = !current
    AppToast.show(this, "Cover Auto Generate668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668CrashAutoReport668Toggle() {
    val current = BiliClient.prefs.v668crashAutoReport668
    BiliClient.prefs.v668crashAutoReport668 = !current
    AppToast.show(this, "Crash Auto Report668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668CreateAutoBackup668Toggle() {
    val current = BiliClient.prefs.v668createAutoBackup668
    BiliClient.prefs.v668createAutoBackup668 = !current
    AppToast.show(this, "Create Auto Backup668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668CropAutoRegion668Toggle() {
    val current = BiliClient.prefs.v668cropAutoRegion668
    BiliClient.prefs.v668cropAutoRegion668 = !current
    AppToast.show(this, "Crop Auto Region668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ConfigAutoSave669Toggle() {
    val current = BiliClient.prefs.v669configAutoSave669
    BiliClient.prefs.v669configAutoSave669 = !current
    AppToast.show(this, "Config Auto Save669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ConfirmAutoDialog669Toggle() {
    val current = BiliClient.prefs.v669confirmAutoDialog669
    BiliClient.prefs.v669confirmAutoDialog669 = !current
    AppToast.show(this, "Confirm Auto Dialog669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ConsoleAutoOpen669Toggle() {
    val current = BiliClient.prefs.v669consoleAutoOpen669
    BiliClient.prefs.v669consoleAutoOpen669 = !current
    AppToast.show(this, "Console Auto Open669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ConstraintAutoLayout669Toggle() {
    val current = BiliClient.prefs.v669constraintAutoLayout669
    BiliClient.prefs.v669constraintAutoLayout669 = !current
    AppToast.show(this, "Constraint Auto Layout669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ContentAutoCache669Toggle() {
    val current = BiliClient.prefs.v669contentAutoCache669
    BiliClient.prefs.v669contentAutoCache669 = !current
    AppToast.show(this, "Content Auto Cache669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ContextAutoMenu669Toggle() {
    val current = BiliClient.prefs.v669contextAutoMenu669
    BiliClient.prefs.v669contextAutoMenu669 = !current
    AppToast.show(this, "Context Auto Menu669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669ControlAutoHide669Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v669controlAutoHide669).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide669",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v669controlAutoHide669 = value
        AppToast.show(this, "Control Auto Hide669: $value")
    }
}

internal fun PlayerActivity.showV669ConvertAutoFormat669Toggle() {
    val current = BiliClient.prefs.v669convertAutoFormat669
    BiliClient.prefs.v669convertAutoFormat669 = !current
    AppToast.show(this, "Convert Auto Format669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669CopyAutoClipboard669Toggle() {
    val current = BiliClient.prefs.v669copyAutoClipboard669
    BiliClient.prefs.v669copyAutoClipboard669 = !current
    AppToast.show(this, "Copy Auto Clipboard669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669CoreAutoAffinity669Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v669coreAutoAffinity669).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity669",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v669coreAutoAffinity669 = value
        AppToast.show(this, "Core Auto Affinity669: $value")
    }
}

internal fun PlayerActivity.showV669CountAutoIncrement669Toggle() {
    val current = BiliClient.prefs.v669countAutoIncrement669
    BiliClient.prefs.v669countAutoIncrement669 = !current
    AppToast.show(this, "Count Auto Increment669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669CoverAutoGenerate669Toggle() {
    val current = BiliClient.prefs.v669coverAutoGenerate669
    BiliClient.prefs.v669coverAutoGenerate669 = !current
    AppToast.show(this, "Cover Auto Generate669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669CrashAutoReport669Toggle() {
    val current = BiliClient.prefs.v669crashAutoReport669
    BiliClient.prefs.v669crashAutoReport669 = !current
    AppToast.show(this, "Crash Auto Report669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669CreateAutoBackup669Toggle() {
    val current = BiliClient.prefs.v669createAutoBackup669
    BiliClient.prefs.v669createAutoBackup669 = !current
    AppToast.show(this, "Create Auto Backup669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV669CropAutoRegion669Toggle() {
    val current = BiliClient.prefs.v669cropAutoRegion669
    BiliClient.prefs.v669cropAutoRegion669 = !current
    AppToast.show(this, "Crop Auto Region669: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ConfigAutoSave670Toggle() {
    val current = BiliClient.prefs.v670configAutoSave670
    BiliClient.prefs.v670configAutoSave670 = !current
    AppToast.show(this, "Config Auto Save670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ConfirmAutoDialog670Toggle() {
    val current = BiliClient.prefs.v670confirmAutoDialog670
    BiliClient.prefs.v670confirmAutoDialog670 = !current
    AppToast.show(this, "Confirm Auto Dialog670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ConsoleAutoOpen670Toggle() {
    val current = BiliClient.prefs.v670consoleAutoOpen670
    BiliClient.prefs.v670consoleAutoOpen670 = !current
    AppToast.show(this, "Console Auto Open670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ConstraintAutoLayout670Toggle() {
    val current = BiliClient.prefs.v670constraintAutoLayout670
    BiliClient.prefs.v670constraintAutoLayout670 = !current
    AppToast.show(this, "Constraint Auto Layout670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ContentAutoCache670Toggle() {
    val current = BiliClient.prefs.v670contentAutoCache670
    BiliClient.prefs.v670contentAutoCache670 = !current
    AppToast.show(this, "Content Auto Cache670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ContextAutoMenu670Toggle() {
    val current = BiliClient.prefs.v670contextAutoMenu670
    BiliClient.prefs.v670contextAutoMenu670 = !current
    AppToast.show(this, "Context Auto Menu670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670ControlAutoHide670Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v670controlAutoHide670).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide670",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v670controlAutoHide670 = value
        AppToast.show(this, "Control Auto Hide670: $value")
    }
}

internal fun PlayerActivity.showV670ConvertAutoFormat670Toggle() {
    val current = BiliClient.prefs.v670convertAutoFormat670
    BiliClient.prefs.v670convertAutoFormat670 = !current
    AppToast.show(this, "Convert Auto Format670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670CopyAutoClipboard670Toggle() {
    val current = BiliClient.prefs.v670copyAutoClipboard670
    BiliClient.prefs.v670copyAutoClipboard670 = !current
    AppToast.show(this, "Copy Auto Clipboard670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670CoreAutoAffinity670Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v670coreAutoAffinity670).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity670",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v670coreAutoAffinity670 = value
        AppToast.show(this, "Core Auto Affinity670: $value")
    }
}

internal fun PlayerActivity.showV670CountAutoIncrement670Toggle() {
    val current = BiliClient.prefs.v670countAutoIncrement670
    BiliClient.prefs.v670countAutoIncrement670 = !current
    AppToast.show(this, "Count Auto Increment670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670CoverAutoGenerate670Toggle() {
    val current = BiliClient.prefs.v670coverAutoGenerate670
    BiliClient.prefs.v670coverAutoGenerate670 = !current
    AppToast.show(this, "Cover Auto Generate670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670CrashAutoReport670Toggle() {
    val current = BiliClient.prefs.v670crashAutoReport670
    BiliClient.prefs.v670crashAutoReport670 = !current
    AppToast.show(this, "Crash Auto Report670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670CreateAutoBackup670Toggle() {
    val current = BiliClient.prefs.v670createAutoBackup670
    BiliClient.prefs.v670createAutoBackup670 = !current
    AppToast.show(this, "Create Auto Backup670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV670CropAutoRegion670Toggle() {
    val current = BiliClient.prefs.v670cropAutoRegion670
    BiliClient.prefs.v670cropAutoRegion670 = !current
    AppToast.show(this, "Crop Auto Region670: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671CrossAutoFade671Toggle() {
    val current = BiliClient.prefs.v671crossAutoFade671
    BiliClient.prefs.v671crossAutoFade671 = !current
    AppToast.show(this, "Cross Auto Fade671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671CryptoAutoHash671Toggle() {
    val current = BiliClient.prefs.v671cryptoAutoHash671
    BiliClient.prefs.v671cryptoAutoHash671 = !current
    AppToast.show(this, "Crypto Auto Hash671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671CursorAutoHide671Toggle() {
    val current = BiliClient.prefs.v671cursorAutoHide671
    BiliClient.prefs.v671cursorAutoHide671 = !current
    AppToast.show(this, "Cursor Auto Hide671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671CurveAutoSmooth671Toggle() {
    val current = BiliClient.prefs.v671curveAutoSmooth671
    BiliClient.prefs.v671curveAutoSmooth671 = !current
    AppToast.show(this, "Curve Auto Smooth671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671CustomAutoTheme671Toggle() {
    val current = BiliClient.prefs.v671customAutoTheme671
    BiliClient.prefs.v671customAutoTheme671 = !current
    AppToast.show(this, "Custom Auto Theme671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671CycleAutoRepeat671Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v671cycleAutoRepeat671).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat671",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v671cycleAutoRepeat671 = value
        AppToast.show(this, "Cycle Auto Repeat671: $value")
    }
}

internal fun PlayerActivity.showV671DataAutoCompress671Toggle() {
    val current = BiliClient.prefs.v671dataAutoCompress671
    BiliClient.prefs.v671dataAutoCompress671 = !current
    AppToast.show(this, "Data Auto Compress671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DatabaseAutoIndex671Toggle() {
    val current = BiliClient.prefs.v671databaseAutoIndex671
    BiliClient.prefs.v671databaseAutoIndex671 = !current
    AppToast.show(this, "Database Auto Index671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DateAutoFormat671Toggle() {
    val current = BiliClient.prefs.v671dateAutoFormat671
    BiliClient.prefs.v671dateAutoFormat671 = !current
    AppToast.show(this, "Date Auto Format671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DebugAutoVerbose671Toggle() {
    val current = BiliClient.prefs.v671debugAutoVerbose671
    BiliClient.prefs.v671debugAutoVerbose671 = !current
    AppToast.show(this, "Debug Auto Verbose671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DecayAutoFadeout671Toggle() {
    val current = BiliClient.prefs.v671decayAutoFadeout671
    BiliClient.prefs.v671decayAutoFadeout671 = !current
    AppToast.show(this, "Decay Auto Fadeout671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DecimalAutoRound671Toggle() {
    val current = BiliClient.prefs.v671decimalAutoRound671
    BiliClient.prefs.v671decimalAutoRound671 = !current
    AppToast.show(this, "Decimal Auto Round671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DecodeAutoCodec671Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v671decodeAutoCodec671).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec671",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v671decodeAutoCodec671 = value
        AppToast.show(this, "Decode Auto Codec671: $value")
    }
}

internal fun PlayerActivity.showV671DefaultAutoRestore671Toggle() {
    val current = BiliClient.prefs.v671defaultAutoRestore671
    BiliClient.prefs.v671defaultAutoRestore671 = !current
    AppToast.show(this, "Default Auto Restore671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV671DelayAutoBuffer671Toggle() {
    val current = BiliClient.prefs.v671delayAutoBuffer671
    BiliClient.prefs.v671delayAutoBuffer671 = !current
    AppToast.show(this, "Delay Auto Buffer671: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672CrossAutoFade672Toggle() {
    val current = BiliClient.prefs.v672crossAutoFade672
    BiliClient.prefs.v672crossAutoFade672 = !current
    AppToast.show(this, "Cross Auto Fade672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672CryptoAutoHash672Toggle() {
    val current = BiliClient.prefs.v672cryptoAutoHash672
    BiliClient.prefs.v672cryptoAutoHash672 = !current
    AppToast.show(this, "Crypto Auto Hash672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672CursorAutoHide672Toggle() {
    val current = BiliClient.prefs.v672cursorAutoHide672
    BiliClient.prefs.v672cursorAutoHide672 = !current
    AppToast.show(this, "Cursor Auto Hide672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672CurveAutoSmooth672Toggle() {
    val current = BiliClient.prefs.v672curveAutoSmooth672
    BiliClient.prefs.v672curveAutoSmooth672 = !current
    AppToast.show(this, "Curve Auto Smooth672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672CustomAutoTheme672Toggle() {
    val current = BiliClient.prefs.v672customAutoTheme672
    BiliClient.prefs.v672customAutoTheme672 = !current
    AppToast.show(this, "Custom Auto Theme672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672CycleAutoRepeat672Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v672cycleAutoRepeat672).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat672",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v672cycleAutoRepeat672 = value
        AppToast.show(this, "Cycle Auto Repeat672: $value")
    }
}

internal fun PlayerActivity.showV672DataAutoCompress672Toggle() {
    val current = BiliClient.prefs.v672dataAutoCompress672
    BiliClient.prefs.v672dataAutoCompress672 = !current
    AppToast.show(this, "Data Auto Compress672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DatabaseAutoIndex672Toggle() {
    val current = BiliClient.prefs.v672databaseAutoIndex672
    BiliClient.prefs.v672databaseAutoIndex672 = !current
    AppToast.show(this, "Database Auto Index672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DateAutoFormat672Toggle() {
    val current = BiliClient.prefs.v672dateAutoFormat672
    BiliClient.prefs.v672dateAutoFormat672 = !current
    AppToast.show(this, "Date Auto Format672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DebugAutoVerbose672Toggle() {
    val current = BiliClient.prefs.v672debugAutoVerbose672
    BiliClient.prefs.v672debugAutoVerbose672 = !current
    AppToast.show(this, "Debug Auto Verbose672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DecayAutoFadeout672Toggle() {
    val current = BiliClient.prefs.v672decayAutoFadeout672
    BiliClient.prefs.v672decayAutoFadeout672 = !current
    AppToast.show(this, "Decay Auto Fadeout672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DecimalAutoRound672Toggle() {
    val current = BiliClient.prefs.v672decimalAutoRound672
    BiliClient.prefs.v672decimalAutoRound672 = !current
    AppToast.show(this, "Decimal Auto Round672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DecodeAutoCodec672Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v672decodeAutoCodec672).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec672",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v672decodeAutoCodec672 = value
        AppToast.show(this, "Decode Auto Codec672: $value")
    }
}

internal fun PlayerActivity.showV672DefaultAutoRestore672Toggle() {
    val current = BiliClient.prefs.v672defaultAutoRestore672
    BiliClient.prefs.v672defaultAutoRestore672 = !current
    AppToast.show(this, "Default Auto Restore672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV672DelayAutoBuffer672Toggle() {
    val current = BiliClient.prefs.v672delayAutoBuffer672
    BiliClient.prefs.v672delayAutoBuffer672 = !current
    AppToast.show(this, "Delay Auto Buffer672: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673CrossAutoFade673Toggle() {
    val current = BiliClient.prefs.v673crossAutoFade673
    BiliClient.prefs.v673crossAutoFade673 = !current
    AppToast.show(this, "Cross Auto Fade673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673CryptoAutoHash673Toggle() {
    val current = BiliClient.prefs.v673cryptoAutoHash673
    BiliClient.prefs.v673cryptoAutoHash673 = !current
    AppToast.show(this, "Crypto Auto Hash673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673CursorAutoHide673Toggle() {
    val current = BiliClient.prefs.v673cursorAutoHide673
    BiliClient.prefs.v673cursorAutoHide673 = !current
    AppToast.show(this, "Cursor Auto Hide673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673CurveAutoSmooth673Toggle() {
    val current = BiliClient.prefs.v673curveAutoSmooth673
    BiliClient.prefs.v673curveAutoSmooth673 = !current
    AppToast.show(this, "Curve Auto Smooth673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673CustomAutoTheme673Toggle() {
    val current = BiliClient.prefs.v673customAutoTheme673
    BiliClient.prefs.v673customAutoTheme673 = !current
    AppToast.show(this, "Custom Auto Theme673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673CycleAutoRepeat673Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v673cycleAutoRepeat673).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat673",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v673cycleAutoRepeat673 = value
        AppToast.show(this, "Cycle Auto Repeat673: $value")
    }
}

internal fun PlayerActivity.showV673DataAutoCompress673Toggle() {
    val current = BiliClient.prefs.v673dataAutoCompress673
    BiliClient.prefs.v673dataAutoCompress673 = !current
    AppToast.show(this, "Data Auto Compress673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DatabaseAutoIndex673Toggle() {
    val current = BiliClient.prefs.v673databaseAutoIndex673
    BiliClient.prefs.v673databaseAutoIndex673 = !current
    AppToast.show(this, "Database Auto Index673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DateAutoFormat673Toggle() {
    val current = BiliClient.prefs.v673dateAutoFormat673
    BiliClient.prefs.v673dateAutoFormat673 = !current
    AppToast.show(this, "Date Auto Format673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DebugAutoVerbose673Toggle() {
    val current = BiliClient.prefs.v673debugAutoVerbose673
    BiliClient.prefs.v673debugAutoVerbose673 = !current
    AppToast.show(this, "Debug Auto Verbose673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DecayAutoFadeout673Toggle() {
    val current = BiliClient.prefs.v673decayAutoFadeout673
    BiliClient.prefs.v673decayAutoFadeout673 = !current
    AppToast.show(this, "Decay Auto Fadeout673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DecimalAutoRound673Toggle() {
    val current = BiliClient.prefs.v673decimalAutoRound673
    BiliClient.prefs.v673decimalAutoRound673 = !current
    AppToast.show(this, "Decimal Auto Round673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DecodeAutoCodec673Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v673decodeAutoCodec673).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec673",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v673decodeAutoCodec673 = value
        AppToast.show(this, "Decode Auto Codec673: $value")
    }
}

internal fun PlayerActivity.showV673DefaultAutoRestore673Toggle() {
    val current = BiliClient.prefs.v673defaultAutoRestore673
    BiliClient.prefs.v673defaultAutoRestore673 = !current
    AppToast.show(this, "Default Auto Restore673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV673DelayAutoBuffer673Toggle() {
    val current = BiliClient.prefs.v673delayAutoBuffer673
    BiliClient.prefs.v673delayAutoBuffer673 = !current
    AppToast.show(this, "Delay Auto Buffer673: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674CrossAutoFade674Toggle() {
    val current = BiliClient.prefs.v674crossAutoFade674
    BiliClient.prefs.v674crossAutoFade674 = !current
    AppToast.show(this, "Cross Auto Fade674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674CryptoAutoHash674Toggle() {
    val current = BiliClient.prefs.v674cryptoAutoHash674
    BiliClient.prefs.v674cryptoAutoHash674 = !current
    AppToast.show(this, "Crypto Auto Hash674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674CursorAutoHide674Toggle() {
    val current = BiliClient.prefs.v674cursorAutoHide674
    BiliClient.prefs.v674cursorAutoHide674 = !current
    AppToast.show(this, "Cursor Auto Hide674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674CurveAutoSmooth674Toggle() {
    val current = BiliClient.prefs.v674curveAutoSmooth674
    BiliClient.prefs.v674curveAutoSmooth674 = !current
    AppToast.show(this, "Curve Auto Smooth674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674CustomAutoTheme674Toggle() {
    val current = BiliClient.prefs.v674customAutoTheme674
    BiliClient.prefs.v674customAutoTheme674 = !current
    AppToast.show(this, "Custom Auto Theme674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674CycleAutoRepeat674Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v674cycleAutoRepeat674).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat674",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v674cycleAutoRepeat674 = value
        AppToast.show(this, "Cycle Auto Repeat674: $value")
    }
}

internal fun PlayerActivity.showV674DataAutoCompress674Toggle() {
    val current = BiliClient.prefs.v674dataAutoCompress674
    BiliClient.prefs.v674dataAutoCompress674 = !current
    AppToast.show(this, "Data Auto Compress674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DatabaseAutoIndex674Toggle() {
    val current = BiliClient.prefs.v674databaseAutoIndex674
    BiliClient.prefs.v674databaseAutoIndex674 = !current
    AppToast.show(this, "Database Auto Index674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DateAutoFormat674Toggle() {
    val current = BiliClient.prefs.v674dateAutoFormat674
    BiliClient.prefs.v674dateAutoFormat674 = !current
    AppToast.show(this, "Date Auto Format674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DebugAutoVerbose674Toggle() {
    val current = BiliClient.prefs.v674debugAutoVerbose674
    BiliClient.prefs.v674debugAutoVerbose674 = !current
    AppToast.show(this, "Debug Auto Verbose674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DecayAutoFadeout674Toggle() {
    val current = BiliClient.prefs.v674decayAutoFadeout674
    BiliClient.prefs.v674decayAutoFadeout674 = !current
    AppToast.show(this, "Decay Auto Fadeout674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DecimalAutoRound674Toggle() {
    val current = BiliClient.prefs.v674decimalAutoRound674
    BiliClient.prefs.v674decimalAutoRound674 = !current
    AppToast.show(this, "Decimal Auto Round674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DecodeAutoCodec674Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v674decodeAutoCodec674).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec674",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v674decodeAutoCodec674 = value
        AppToast.show(this, "Decode Auto Codec674: $value")
    }
}

internal fun PlayerActivity.showV674DefaultAutoRestore674Toggle() {
    val current = BiliClient.prefs.v674defaultAutoRestore674
    BiliClient.prefs.v674defaultAutoRestore674 = !current
    AppToast.show(this, "Default Auto Restore674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV674DelayAutoBuffer674Toggle() {
    val current = BiliClient.prefs.v674delayAutoBuffer674
    BiliClient.prefs.v674delayAutoBuffer674 = !current
    AppToast.show(this, "Delay Auto Buffer674: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675CrossAutoFade675Toggle() {
    val current = BiliClient.prefs.v675crossAutoFade675
    BiliClient.prefs.v675crossAutoFade675 = !current
    AppToast.show(this, "Cross Auto Fade675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675CryptoAutoHash675Toggle() {
    val current = BiliClient.prefs.v675cryptoAutoHash675
    BiliClient.prefs.v675cryptoAutoHash675 = !current
    AppToast.show(this, "Crypto Auto Hash675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675CursorAutoHide675Toggle() {
    val current = BiliClient.prefs.v675cursorAutoHide675
    BiliClient.prefs.v675cursorAutoHide675 = !current
    AppToast.show(this, "Cursor Auto Hide675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675CurveAutoSmooth675Toggle() {
    val current = BiliClient.prefs.v675curveAutoSmooth675
    BiliClient.prefs.v675curveAutoSmooth675 = !current
    AppToast.show(this, "Curve Auto Smooth675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675CustomAutoTheme675Toggle() {
    val current = BiliClient.prefs.v675customAutoTheme675
    BiliClient.prefs.v675customAutoTheme675 = !current
    AppToast.show(this, "Custom Auto Theme675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675CycleAutoRepeat675Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v675cycleAutoRepeat675).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat675",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v675cycleAutoRepeat675 = value
        AppToast.show(this, "Cycle Auto Repeat675: $value")
    }
}

internal fun PlayerActivity.showV675DataAutoCompress675Toggle() {
    val current = BiliClient.prefs.v675dataAutoCompress675
    BiliClient.prefs.v675dataAutoCompress675 = !current
    AppToast.show(this, "Data Auto Compress675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DatabaseAutoIndex675Toggle() {
    val current = BiliClient.prefs.v675databaseAutoIndex675
    BiliClient.prefs.v675databaseAutoIndex675 = !current
    AppToast.show(this, "Database Auto Index675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DateAutoFormat675Toggle() {
    val current = BiliClient.prefs.v675dateAutoFormat675
    BiliClient.prefs.v675dateAutoFormat675 = !current
    AppToast.show(this, "Date Auto Format675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DebugAutoVerbose675Toggle() {
    val current = BiliClient.prefs.v675debugAutoVerbose675
    BiliClient.prefs.v675debugAutoVerbose675 = !current
    AppToast.show(this, "Debug Auto Verbose675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DecayAutoFadeout675Toggle() {
    val current = BiliClient.prefs.v675decayAutoFadeout675
    BiliClient.prefs.v675decayAutoFadeout675 = !current
    AppToast.show(this, "Decay Auto Fadeout675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DecimalAutoRound675Toggle() {
    val current = BiliClient.prefs.v675decimalAutoRound675
    BiliClient.prefs.v675decimalAutoRound675 = !current
    AppToast.show(this, "Decimal Auto Round675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DecodeAutoCodec675Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v675decodeAutoCodec675).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec675",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v675decodeAutoCodec675 = value
        AppToast.show(this, "Decode Auto Codec675: $value")
    }
}

internal fun PlayerActivity.showV675DefaultAutoRestore675Toggle() {
    val current = BiliClient.prefs.v675defaultAutoRestore675
    BiliClient.prefs.v675defaultAutoRestore675 = !current
    AppToast.show(this, "Default Auto Restore675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV675DelayAutoBuffer675Toggle() {
    val current = BiliClient.prefs.v675delayAutoBuffer675
    BiliClient.prefs.v675delayAutoBuffer675 = !current
    AppToast.show(this, "Delay Auto Buffer675: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676CrossAutoFade676Toggle() {
    val current = BiliClient.prefs.v676crossAutoFade676
    BiliClient.prefs.v676crossAutoFade676 = !current
    AppToast.show(this, "Cross Auto Fade676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676CryptoAutoHash676Toggle() {
    val current = BiliClient.prefs.v676cryptoAutoHash676
    BiliClient.prefs.v676cryptoAutoHash676 = !current
    AppToast.show(this, "Crypto Auto Hash676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676CursorAutoHide676Toggle() {
    val current = BiliClient.prefs.v676cursorAutoHide676
    BiliClient.prefs.v676cursorAutoHide676 = !current
    AppToast.show(this, "Cursor Auto Hide676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676CurveAutoSmooth676Toggle() {
    val current = BiliClient.prefs.v676curveAutoSmooth676
    BiliClient.prefs.v676curveAutoSmooth676 = !current
    AppToast.show(this, "Curve Auto Smooth676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676CustomAutoTheme676Toggle() {
    val current = BiliClient.prefs.v676customAutoTheme676
    BiliClient.prefs.v676customAutoTheme676 = !current
    AppToast.show(this, "Custom Auto Theme676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676CycleAutoRepeat676Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v676cycleAutoRepeat676).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat676",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v676cycleAutoRepeat676 = value
        AppToast.show(this, "Cycle Auto Repeat676: $value")
    }
}

internal fun PlayerActivity.showV676DataAutoCompress676Toggle() {
    val current = BiliClient.prefs.v676dataAutoCompress676
    BiliClient.prefs.v676dataAutoCompress676 = !current
    AppToast.show(this, "Data Auto Compress676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DatabaseAutoIndex676Toggle() {
    val current = BiliClient.prefs.v676databaseAutoIndex676
    BiliClient.prefs.v676databaseAutoIndex676 = !current
    AppToast.show(this, "Database Auto Index676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DateAutoFormat676Toggle() {
    val current = BiliClient.prefs.v676dateAutoFormat676
    BiliClient.prefs.v676dateAutoFormat676 = !current
    AppToast.show(this, "Date Auto Format676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DebugAutoVerbose676Toggle() {
    val current = BiliClient.prefs.v676debugAutoVerbose676
    BiliClient.prefs.v676debugAutoVerbose676 = !current
    AppToast.show(this, "Debug Auto Verbose676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DecayAutoFadeout676Toggle() {
    val current = BiliClient.prefs.v676decayAutoFadeout676
    BiliClient.prefs.v676decayAutoFadeout676 = !current
    AppToast.show(this, "Decay Auto Fadeout676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DecimalAutoRound676Toggle() {
    val current = BiliClient.prefs.v676decimalAutoRound676
    BiliClient.prefs.v676decimalAutoRound676 = !current
    AppToast.show(this, "Decimal Auto Round676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DecodeAutoCodec676Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v676decodeAutoCodec676).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec676",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v676decodeAutoCodec676 = value
        AppToast.show(this, "Decode Auto Codec676: $value")
    }
}

internal fun PlayerActivity.showV676DefaultAutoRestore676Toggle() {
    val current = BiliClient.prefs.v676defaultAutoRestore676
    BiliClient.prefs.v676defaultAutoRestore676 = !current
    AppToast.show(this, "Default Auto Restore676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV676DelayAutoBuffer676Toggle() {
    val current = BiliClient.prefs.v676delayAutoBuffer676
    BiliClient.prefs.v676delayAutoBuffer676 = !current
    AppToast.show(this, "Delay Auto Buffer676: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677CrossAutoFade677Toggle() {
    val current = BiliClient.prefs.v677crossAutoFade677
    BiliClient.prefs.v677crossAutoFade677 = !current
    AppToast.show(this, "Cross Auto Fade677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677CryptoAutoHash677Toggle() {
    val current = BiliClient.prefs.v677cryptoAutoHash677
    BiliClient.prefs.v677cryptoAutoHash677 = !current
    AppToast.show(this, "Crypto Auto Hash677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677CursorAutoHide677Toggle() {
    val current = BiliClient.prefs.v677cursorAutoHide677
    BiliClient.prefs.v677cursorAutoHide677 = !current
    AppToast.show(this, "Cursor Auto Hide677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677CurveAutoSmooth677Toggle() {
    val current = BiliClient.prefs.v677curveAutoSmooth677
    BiliClient.prefs.v677curveAutoSmooth677 = !current
    AppToast.show(this, "Curve Auto Smooth677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677CustomAutoTheme677Toggle() {
    val current = BiliClient.prefs.v677customAutoTheme677
    BiliClient.prefs.v677customAutoTheme677 = !current
    AppToast.show(this, "Custom Auto Theme677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677CycleAutoRepeat677Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v677cycleAutoRepeat677).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat677",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v677cycleAutoRepeat677 = value
        AppToast.show(this, "Cycle Auto Repeat677: $value")
    }
}

internal fun PlayerActivity.showV677DataAutoCompress677Toggle() {
    val current = BiliClient.prefs.v677dataAutoCompress677
    BiliClient.prefs.v677dataAutoCompress677 = !current
    AppToast.show(this, "Data Auto Compress677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DatabaseAutoIndex677Toggle() {
    val current = BiliClient.prefs.v677databaseAutoIndex677
    BiliClient.prefs.v677databaseAutoIndex677 = !current
    AppToast.show(this, "Database Auto Index677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DateAutoFormat677Toggle() {
    val current = BiliClient.prefs.v677dateAutoFormat677
    BiliClient.prefs.v677dateAutoFormat677 = !current
    AppToast.show(this, "Date Auto Format677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DebugAutoVerbose677Toggle() {
    val current = BiliClient.prefs.v677debugAutoVerbose677
    BiliClient.prefs.v677debugAutoVerbose677 = !current
    AppToast.show(this, "Debug Auto Verbose677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DecayAutoFadeout677Toggle() {
    val current = BiliClient.prefs.v677decayAutoFadeout677
    BiliClient.prefs.v677decayAutoFadeout677 = !current
    AppToast.show(this, "Decay Auto Fadeout677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DecimalAutoRound677Toggle() {
    val current = BiliClient.prefs.v677decimalAutoRound677
    BiliClient.prefs.v677decimalAutoRound677 = !current
    AppToast.show(this, "Decimal Auto Round677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DecodeAutoCodec677Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v677decodeAutoCodec677).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec677",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v677decodeAutoCodec677 = value
        AppToast.show(this, "Decode Auto Codec677: $value")
    }
}

internal fun PlayerActivity.showV677DefaultAutoRestore677Toggle() {
    val current = BiliClient.prefs.v677defaultAutoRestore677
    BiliClient.prefs.v677defaultAutoRestore677 = !current
    AppToast.show(this, "Default Auto Restore677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV677DelayAutoBuffer677Toggle() {
    val current = BiliClient.prefs.v677delayAutoBuffer677
    BiliClient.prefs.v677delayAutoBuffer677 = !current
    AppToast.show(this, "Delay Auto Buffer677: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678CrossAutoFade678Toggle() {
    val current = BiliClient.prefs.v678crossAutoFade678
    BiliClient.prefs.v678crossAutoFade678 = !current
    AppToast.show(this, "Cross Auto Fade678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678CryptoAutoHash678Toggle() {
    val current = BiliClient.prefs.v678cryptoAutoHash678
    BiliClient.prefs.v678cryptoAutoHash678 = !current
    AppToast.show(this, "Crypto Auto Hash678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678CursorAutoHide678Toggle() {
    val current = BiliClient.prefs.v678cursorAutoHide678
    BiliClient.prefs.v678cursorAutoHide678 = !current
    AppToast.show(this, "Cursor Auto Hide678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678CurveAutoSmooth678Toggle() {
    val current = BiliClient.prefs.v678curveAutoSmooth678
    BiliClient.prefs.v678curveAutoSmooth678 = !current
    AppToast.show(this, "Curve Auto Smooth678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678CustomAutoTheme678Toggle() {
    val current = BiliClient.prefs.v678customAutoTheme678
    BiliClient.prefs.v678customAutoTheme678 = !current
    AppToast.show(this, "Custom Auto Theme678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678CycleAutoRepeat678Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v678cycleAutoRepeat678).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat678",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v678cycleAutoRepeat678 = value
        AppToast.show(this, "Cycle Auto Repeat678: $value")
    }
}

internal fun PlayerActivity.showV678DataAutoCompress678Toggle() {
    val current = BiliClient.prefs.v678dataAutoCompress678
    BiliClient.prefs.v678dataAutoCompress678 = !current
    AppToast.show(this, "Data Auto Compress678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DatabaseAutoIndex678Toggle() {
    val current = BiliClient.prefs.v678databaseAutoIndex678
    BiliClient.prefs.v678databaseAutoIndex678 = !current
    AppToast.show(this, "Database Auto Index678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DateAutoFormat678Toggle() {
    val current = BiliClient.prefs.v678dateAutoFormat678
    BiliClient.prefs.v678dateAutoFormat678 = !current
    AppToast.show(this, "Date Auto Format678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DebugAutoVerbose678Toggle() {
    val current = BiliClient.prefs.v678debugAutoVerbose678
    BiliClient.prefs.v678debugAutoVerbose678 = !current
    AppToast.show(this, "Debug Auto Verbose678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DecayAutoFadeout678Toggle() {
    val current = BiliClient.prefs.v678decayAutoFadeout678
    BiliClient.prefs.v678decayAutoFadeout678 = !current
    AppToast.show(this, "Decay Auto Fadeout678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DecimalAutoRound678Toggle() {
    val current = BiliClient.prefs.v678decimalAutoRound678
    BiliClient.prefs.v678decimalAutoRound678 = !current
    AppToast.show(this, "Decimal Auto Round678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DecodeAutoCodec678Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v678decodeAutoCodec678).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec678",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v678decodeAutoCodec678 = value
        AppToast.show(this, "Decode Auto Codec678: $value")
    }
}

internal fun PlayerActivity.showV678DefaultAutoRestore678Toggle() {
    val current = BiliClient.prefs.v678defaultAutoRestore678
    BiliClient.prefs.v678defaultAutoRestore678 = !current
    AppToast.show(this, "Default Auto Restore678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV678DelayAutoBuffer678Toggle() {
    val current = BiliClient.prefs.v678delayAutoBuffer678
    BiliClient.prefs.v678delayAutoBuffer678 = !current
    AppToast.show(this, "Delay Auto Buffer678: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679CrossAutoFade679Toggle() {
    val current = BiliClient.prefs.v679crossAutoFade679
    BiliClient.prefs.v679crossAutoFade679 = !current
    AppToast.show(this, "Cross Auto Fade679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679CryptoAutoHash679Toggle() {
    val current = BiliClient.prefs.v679cryptoAutoHash679
    BiliClient.prefs.v679cryptoAutoHash679 = !current
    AppToast.show(this, "Crypto Auto Hash679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679CursorAutoHide679Toggle() {
    val current = BiliClient.prefs.v679cursorAutoHide679
    BiliClient.prefs.v679cursorAutoHide679 = !current
    AppToast.show(this, "Cursor Auto Hide679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679CurveAutoSmooth679Toggle() {
    val current = BiliClient.prefs.v679curveAutoSmooth679
    BiliClient.prefs.v679curveAutoSmooth679 = !current
    AppToast.show(this, "Curve Auto Smooth679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679CustomAutoTheme679Toggle() {
    val current = BiliClient.prefs.v679customAutoTheme679
    BiliClient.prefs.v679customAutoTheme679 = !current
    AppToast.show(this, "Custom Auto Theme679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679CycleAutoRepeat679Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v679cycleAutoRepeat679).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat679",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v679cycleAutoRepeat679 = value
        AppToast.show(this, "Cycle Auto Repeat679: $value")
    }
}

internal fun PlayerActivity.showV679DataAutoCompress679Toggle() {
    val current = BiliClient.prefs.v679dataAutoCompress679
    BiliClient.prefs.v679dataAutoCompress679 = !current
    AppToast.show(this, "Data Auto Compress679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DatabaseAutoIndex679Toggle() {
    val current = BiliClient.prefs.v679databaseAutoIndex679
    BiliClient.prefs.v679databaseAutoIndex679 = !current
    AppToast.show(this, "Database Auto Index679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DateAutoFormat679Toggle() {
    val current = BiliClient.prefs.v679dateAutoFormat679
    BiliClient.prefs.v679dateAutoFormat679 = !current
    AppToast.show(this, "Date Auto Format679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DebugAutoVerbose679Toggle() {
    val current = BiliClient.prefs.v679debugAutoVerbose679
    BiliClient.prefs.v679debugAutoVerbose679 = !current
    AppToast.show(this, "Debug Auto Verbose679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DecayAutoFadeout679Toggle() {
    val current = BiliClient.prefs.v679decayAutoFadeout679
    BiliClient.prefs.v679decayAutoFadeout679 = !current
    AppToast.show(this, "Decay Auto Fadeout679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DecimalAutoRound679Toggle() {
    val current = BiliClient.prefs.v679decimalAutoRound679
    BiliClient.prefs.v679decimalAutoRound679 = !current
    AppToast.show(this, "Decimal Auto Round679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DecodeAutoCodec679Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v679decodeAutoCodec679).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec679",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v679decodeAutoCodec679 = value
        AppToast.show(this, "Decode Auto Codec679: $value")
    }
}

internal fun PlayerActivity.showV679DefaultAutoRestore679Toggle() {
    val current = BiliClient.prefs.v679defaultAutoRestore679
    BiliClient.prefs.v679defaultAutoRestore679 = !current
    AppToast.show(this, "Default Auto Restore679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV679DelayAutoBuffer679Toggle() {
    val current = BiliClient.prefs.v679delayAutoBuffer679
    BiliClient.prefs.v679delayAutoBuffer679 = !current
    AppToast.show(this, "Delay Auto Buffer679: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680CrossAutoFade680Toggle() {
    val current = BiliClient.prefs.v680crossAutoFade680
    BiliClient.prefs.v680crossAutoFade680 = !current
    AppToast.show(this, "Cross Auto Fade680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680CryptoAutoHash680Toggle() {
    val current = BiliClient.prefs.v680cryptoAutoHash680
    BiliClient.prefs.v680cryptoAutoHash680 = !current
    AppToast.show(this, "Crypto Auto Hash680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680CursorAutoHide680Toggle() {
    val current = BiliClient.prefs.v680cursorAutoHide680
    BiliClient.prefs.v680cursorAutoHide680 = !current
    AppToast.show(this, "Cursor Auto Hide680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680CurveAutoSmooth680Toggle() {
    val current = BiliClient.prefs.v680curveAutoSmooth680
    BiliClient.prefs.v680curveAutoSmooth680 = !current
    AppToast.show(this, "Curve Auto Smooth680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680CustomAutoTheme680Toggle() {
    val current = BiliClient.prefs.v680customAutoTheme680
    BiliClient.prefs.v680customAutoTheme680 = !current
    AppToast.show(this, "Custom Auto Theme680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680CycleAutoRepeat680Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v680cycleAutoRepeat680).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat680",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v680cycleAutoRepeat680 = value
        AppToast.show(this, "Cycle Auto Repeat680: $value")
    }
}

internal fun PlayerActivity.showV680DataAutoCompress680Toggle() {
    val current = BiliClient.prefs.v680dataAutoCompress680
    BiliClient.prefs.v680dataAutoCompress680 = !current
    AppToast.show(this, "Data Auto Compress680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DatabaseAutoIndex680Toggle() {
    val current = BiliClient.prefs.v680databaseAutoIndex680
    BiliClient.prefs.v680databaseAutoIndex680 = !current
    AppToast.show(this, "Database Auto Index680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DateAutoFormat680Toggle() {
    val current = BiliClient.prefs.v680dateAutoFormat680
    BiliClient.prefs.v680dateAutoFormat680 = !current
    AppToast.show(this, "Date Auto Format680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DebugAutoVerbose680Toggle() {
    val current = BiliClient.prefs.v680debugAutoVerbose680
    BiliClient.prefs.v680debugAutoVerbose680 = !current
    AppToast.show(this, "Debug Auto Verbose680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DecayAutoFadeout680Toggle() {
    val current = BiliClient.prefs.v680decayAutoFadeout680
    BiliClient.prefs.v680decayAutoFadeout680 = !current
    AppToast.show(this, "Decay Auto Fadeout680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DecimalAutoRound680Toggle() {
    val current = BiliClient.prefs.v680decimalAutoRound680
    BiliClient.prefs.v680decimalAutoRound680 = !current
    AppToast.show(this, "Decimal Auto Round680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DecodeAutoCodec680Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v680decodeAutoCodec680).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec680",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v680decodeAutoCodec680 = value
        AppToast.show(this, "Decode Auto Codec680: $value")
    }
}

internal fun PlayerActivity.showV680DefaultAutoRestore680Toggle() {
    val current = BiliClient.prefs.v680defaultAutoRestore680
    BiliClient.prefs.v680defaultAutoRestore680 = !current
    AppToast.show(this, "Default Auto Restore680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV680DelayAutoBuffer680Toggle() {
    val current = BiliClient.prefs.v680delayAutoBuffer680
    BiliClient.prefs.v680delayAutoBuffer680 = !current
    AppToast.show(this, "Delay Auto Buffer680: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DeleteAutoConfirm681Toggle() {
    val current = BiliClient.prefs.v681deleteAutoConfirm681
    BiliClient.prefs.v681deleteAutoConfirm681 = !current
    AppToast.show(this, "Delete Auto Confirm681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DeltaAutoUpdate681Toggle() {
    val current = BiliClient.prefs.v681deltaAutoUpdate681
    BiliClient.prefs.v681deltaAutoUpdate681 = !current
    AppToast.show(this, "Delta Auto Update681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DemoAutoPlay681Toggle() {
    val current = BiliClient.prefs.v681demoAutoPlay681
    BiliClient.prefs.v681demoAutoPlay681 = !current
    AppToast.show(this, "Demo Auto Play681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DeployAutoPush681Toggle() {
    val current = BiliClient.prefs.v681deployAutoPush681
    BiliClient.prefs.v681deployAutoPush681 = !current
    AppToast.show(this, "Deploy Auto Push681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DepthAutoMap681Toggle() {
    val current = BiliClient.prefs.v681depthAutoMap681
    BiliClient.prefs.v681depthAutoMap681 = !current
    AppToast.show(this, "Depth Auto Map681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DeriveAutoCalc681Toggle() {
    val current = BiliClient.prefs.v681deriveAutoCalc681
    BiliClient.prefs.v681deriveAutoCalc681 = !current
    AppToast.show(this, "Derive Auto Calc681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DesignAutoToken681Toggle() {
    val current = BiliClient.prefs.v681designAutoToken681
    BiliClient.prefs.v681designAutoToken681 = !current
    AppToast.show(this, "Design Auto Token681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DesktopAutoMode681Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v681desktopAutoMode681).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode681",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v681desktopAutoMode681 = value
        AppToast.show(this, "Desktop Auto Mode681: $value")
    }
}

internal fun PlayerActivity.showV681DetectAutoMotion681Toggle() {
    val current = BiliClient.prefs.v681detectAutoMotion681
    BiliClient.prefs.v681detectAutoMotion681 = !current
    AppToast.show(this, "Detect Auto Motion681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DeviceAutoPair681Toggle() {
    val current = BiliClient.prefs.v681deviceAutoPair681
    BiliClient.prefs.v681deviceAutoPair681 = !current
    AppToast.show(this, "Device Auto Pair681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DialogAutoTheme681Toggle() {
    val current = BiliClient.prefs.v681dialogAutoTheme681
    BiliClient.prefs.v681dialogAutoTheme681 = !current
    AppToast.show(this, "Dialog Auto Theme681: ${if (!current) "ON" else "OFF"}")
}

