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

// v663: Constraint Auto Layout663
internal fun PlayerActivity.showV663ConstraintAutoLayout663Toggle() {
    val current = BiliClient.prefs.v663constraintAutoLayout663
    BiliClient.prefs.v663constraintAutoLayout663 = !current
    AppToast.show(this, "Constraint Auto Layout663: ${if (!current) "ON" else "OFF"}")
}

// v663: Content Auto Cache663
internal fun PlayerActivity.showV663ContentAutoCache663Toggle() {
    val current = BiliClient.prefs.v663contentAutoCache663
    BiliClient.prefs.v663contentAutoCache663 = !current
    AppToast.show(this, "Content Auto Cache663: ${if (!current) "ON" else "OFF"}")
}

// v663: Context Auto Menu663
internal fun PlayerActivity.showV663ContextAutoMenu663Toggle() {
    val current = BiliClient.prefs.v663contextAutoMenu663
    BiliClient.prefs.v663contextAutoMenu663 = !current
    AppToast.show(this, "Context Auto Menu663: ${if (!current) "ON" else "OFF"}")
}

// v663: Control Auto Hide663
internal fun PlayerActivity.showV663ControlAutoHide663Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v663controlAutoHide663).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide663",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v663controlAutoHide663 = value
        AppToast.show(this, "Control Auto Hide663: $value")
    }
}

// v663: Convert Auto Format663
internal fun PlayerActivity.showV663ConvertAutoFormat663Toggle() {
    val current = BiliClient.prefs.v663convertAutoFormat663
    BiliClient.prefs.v663convertAutoFormat663 = !current
    AppToast.show(this, "Convert Auto Format663: ${if (!current) "ON" else "OFF"}")
}

// v663: Copy Auto Clipboard663
internal fun PlayerActivity.showV663CopyAutoClipboard663Toggle() {
    val current = BiliClient.prefs.v663copyAutoClipboard663
    BiliClient.prefs.v663copyAutoClipboard663 = !current
    AppToast.show(this, "Copy Auto Clipboard663: ${if (!current) "ON" else "OFF"}")
}

// v663: Core Auto Affinity663
internal fun PlayerActivity.showV663CoreAutoAffinity663Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v663coreAutoAffinity663).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity663",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v663coreAutoAffinity663 = value
        AppToast.show(this, "Core Auto Affinity663: $value")
    }
}

// v663: Count Auto Increment663
internal fun PlayerActivity.showV663CountAutoIncrement663Toggle() {
    val current = BiliClient.prefs.v663countAutoIncrement663
    BiliClient.prefs.v663countAutoIncrement663 = !current
    AppToast.show(this, "Count Auto Increment663: ${if (!current) "ON" else "OFF"}")
}

// v663: Cover Auto Generate663
internal fun PlayerActivity.showV663CoverAutoGenerate663Toggle() {
    val current = BiliClient.prefs.v663coverAutoGenerate663
    BiliClient.prefs.v663coverAutoGenerate663 = !current
    AppToast.show(this, "Cover Auto Generate663: ${if (!current) "ON" else "OFF"}")
}

// v663: Crash Auto Report663
internal fun PlayerActivity.showV663CrashAutoReport663Toggle() {
    val current = BiliClient.prefs.v663crashAutoReport663
    BiliClient.prefs.v663crashAutoReport663 = !current
    AppToast.show(this, "Crash Auto Report663: ${if (!current) "ON" else "OFF"}")
}

// v663: Create Auto Backup663
internal fun PlayerActivity.showV663CreateAutoBackup663Toggle() {
    val current = BiliClient.prefs.v663createAutoBackup663
    BiliClient.prefs.v663createAutoBackup663 = !current
    AppToast.show(this, "Create Auto Backup663: ${if (!current) "ON" else "OFF"}")
}

// v663: Crop Auto Region663
internal fun PlayerActivity.showV663CropAutoRegion663Toggle() {
    val current = BiliClient.prefs.v663cropAutoRegion663
    BiliClient.prefs.v663cropAutoRegion663 = !current
    AppToast.show(this, "Crop Auto Region663: ${if (!current) "ON" else "OFF"}")
}

// v664: Config Auto Save664
internal fun PlayerActivity.showV664ConfigAutoSave664Toggle() {
    val current = BiliClient.prefs.v664configAutoSave664
    BiliClient.prefs.v664configAutoSave664 = !current
    AppToast.show(this, "Config Auto Save664: ${if (!current) "ON" else "OFF"}")
}

// v664: Confirm Auto Dialog664
internal fun PlayerActivity.showV664ConfirmAutoDialog664Toggle() {
    val current = BiliClient.prefs.v664confirmAutoDialog664
    BiliClient.prefs.v664confirmAutoDialog664 = !current
    AppToast.show(this, "Confirm Auto Dialog664: ${if (!current) "ON" else "OFF"}")
}

// v664: Console Auto Open664
internal fun PlayerActivity.showV664ConsoleAutoOpen664Toggle() {
    val current = BiliClient.prefs.v664consoleAutoOpen664
    BiliClient.prefs.v664consoleAutoOpen664 = !current
    AppToast.show(this, "Console Auto Open664: ${if (!current) "ON" else "OFF"}")
}

// v664: Constraint Auto Layout664
internal fun PlayerActivity.showV664ConstraintAutoLayout664Toggle() {
    val current = BiliClient.prefs.v664constraintAutoLayout664
    BiliClient.prefs.v664constraintAutoLayout664 = !current
    AppToast.show(this, "Constraint Auto Layout664: ${if (!current) "ON" else "OFF"}")
}

// v664: Content Auto Cache664
internal fun PlayerActivity.showV664ContentAutoCache664Toggle() {
    val current = BiliClient.prefs.v664contentAutoCache664
    BiliClient.prefs.v664contentAutoCache664 = !current
    AppToast.show(this, "Content Auto Cache664: ${if (!current) "ON" else "OFF"}")
}

// v664: Context Auto Menu664
internal fun PlayerActivity.showV664ContextAutoMenu664Toggle() {
    val current = BiliClient.prefs.v664contextAutoMenu664
    BiliClient.prefs.v664contextAutoMenu664 = !current
    AppToast.show(this, "Context Auto Menu664: ${if (!current) "ON" else "OFF"}")
}

// v664: Control Auto Hide664
internal fun PlayerActivity.showV664ControlAutoHide664Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v664controlAutoHide664).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide664",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v664controlAutoHide664 = value
        AppToast.show(this, "Control Auto Hide664: $value")
    }
}

// v664: Convert Auto Format664
internal fun PlayerActivity.showV664ConvertAutoFormat664Toggle() {
    val current = BiliClient.prefs.v664convertAutoFormat664
    BiliClient.prefs.v664convertAutoFormat664 = !current
    AppToast.show(this, "Convert Auto Format664: ${if (!current) "ON" else "OFF"}")
}

// v664: Copy Auto Clipboard664
internal fun PlayerActivity.showV664CopyAutoClipboard664Toggle() {
    val current = BiliClient.prefs.v664copyAutoClipboard664
    BiliClient.prefs.v664copyAutoClipboard664 = !current
    AppToast.show(this, "Copy Auto Clipboard664: ${if (!current) "ON" else "OFF"}")
}

// v664: Core Auto Affinity664
internal fun PlayerActivity.showV664CoreAutoAffinity664Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v664coreAutoAffinity664).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity664",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v664coreAutoAffinity664 = value
        AppToast.show(this, "Core Auto Affinity664: $value")
    }
}

// v664: Count Auto Increment664
internal fun PlayerActivity.showV664CountAutoIncrement664Toggle() {
    val current = BiliClient.prefs.v664countAutoIncrement664
    BiliClient.prefs.v664countAutoIncrement664 = !current
    AppToast.show(this, "Count Auto Increment664: ${if (!current) "ON" else "OFF"}")
}

// v664: Cover Auto Generate664
internal fun PlayerActivity.showV664CoverAutoGenerate664Toggle() {
    val current = BiliClient.prefs.v664coverAutoGenerate664
    BiliClient.prefs.v664coverAutoGenerate664 = !current
    AppToast.show(this, "Cover Auto Generate664: ${if (!current) "ON" else "OFF"}")
}

// v664: Crash Auto Report664
internal fun PlayerActivity.showV664CrashAutoReport664Toggle() {
    val current = BiliClient.prefs.v664crashAutoReport664
    BiliClient.prefs.v664crashAutoReport664 = !current
    AppToast.show(this, "Crash Auto Report664: ${if (!current) "ON" else "OFF"}")
}

// v664: Create Auto Backup664
internal fun PlayerActivity.showV664CreateAutoBackup664Toggle() {
    val current = BiliClient.prefs.v664createAutoBackup664
    BiliClient.prefs.v664createAutoBackup664 = !current
    AppToast.show(this, "Create Auto Backup664: ${if (!current) "ON" else "OFF"}")
}

// v664: Crop Auto Region664
internal fun PlayerActivity.showV664CropAutoRegion664Toggle() {
    val current = BiliClient.prefs.v664cropAutoRegion664
    BiliClient.prefs.v664cropAutoRegion664 = !current
    AppToast.show(this, "Crop Auto Region664: ${if (!current) "ON" else "OFF"}")
}

// v665: Config Auto Save665
internal fun PlayerActivity.showV665ConfigAutoSave665Toggle() {
    val current = BiliClient.prefs.v665configAutoSave665
    BiliClient.prefs.v665configAutoSave665 = !current
    AppToast.show(this, "Config Auto Save665: ${if (!current) "ON" else "OFF"}")
}

// v665: Confirm Auto Dialog665
internal fun PlayerActivity.showV665ConfirmAutoDialog665Toggle() {
    val current = BiliClient.prefs.v665confirmAutoDialog665
    BiliClient.prefs.v665confirmAutoDialog665 = !current
    AppToast.show(this, "Confirm Auto Dialog665: ${if (!current) "ON" else "OFF"}")
}

// v665: Console Auto Open665
internal fun PlayerActivity.showV665ConsoleAutoOpen665Toggle() {
    val current = BiliClient.prefs.v665consoleAutoOpen665
    BiliClient.prefs.v665consoleAutoOpen665 = !current
    AppToast.show(this, "Console Auto Open665: ${if (!current) "ON" else "OFF"}")
}

// v665: Constraint Auto Layout665
internal fun PlayerActivity.showV665ConstraintAutoLayout665Toggle() {
    val current = BiliClient.prefs.v665constraintAutoLayout665
    BiliClient.prefs.v665constraintAutoLayout665 = !current
    AppToast.show(this, "Constraint Auto Layout665: ${if (!current) "ON" else "OFF"}")
}

// v665: Content Auto Cache665
internal fun PlayerActivity.showV665ContentAutoCache665Toggle() {
    val current = BiliClient.prefs.v665contentAutoCache665
    BiliClient.prefs.v665contentAutoCache665 = !current
    AppToast.show(this, "Content Auto Cache665: ${if (!current) "ON" else "OFF"}")
}

// v665: Context Auto Menu665
internal fun PlayerActivity.showV665ContextAutoMenu665Toggle() {
    val current = BiliClient.prefs.v665contextAutoMenu665
    BiliClient.prefs.v665contextAutoMenu665 = !current
    AppToast.show(this, "Context Auto Menu665: ${if (!current) "ON" else "OFF"}")
}

// v665: Control Auto Hide665
internal fun PlayerActivity.showV665ControlAutoHide665Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v665controlAutoHide665).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide665",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v665controlAutoHide665 = value
        AppToast.show(this, "Control Auto Hide665: $value")
    }
}

// v665: Convert Auto Format665
internal fun PlayerActivity.showV665ConvertAutoFormat665Toggle() {
    val current = BiliClient.prefs.v665convertAutoFormat665
    BiliClient.prefs.v665convertAutoFormat665 = !current
    AppToast.show(this, "Convert Auto Format665: ${if (!current) "ON" else "OFF"}")
}

// v665: Copy Auto Clipboard665
internal fun PlayerActivity.showV665CopyAutoClipboard665Toggle() {
    val current = BiliClient.prefs.v665copyAutoClipboard665
    BiliClient.prefs.v665copyAutoClipboard665 = !current
    AppToast.show(this, "Copy Auto Clipboard665: ${if (!current) "ON" else "OFF"}")
}

// v665: Core Auto Affinity665
internal fun PlayerActivity.showV665CoreAutoAffinity665Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v665coreAutoAffinity665).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity665",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v665coreAutoAffinity665 = value
        AppToast.show(this, "Core Auto Affinity665: $value")
    }
}

// v665: Count Auto Increment665
internal fun PlayerActivity.showV665CountAutoIncrement665Toggle() {
    val current = BiliClient.prefs.v665countAutoIncrement665
    BiliClient.prefs.v665countAutoIncrement665 = !current
    AppToast.show(this, "Count Auto Increment665: ${if (!current) "ON" else "OFF"}")
}

// v665: Cover Auto Generate665
internal fun PlayerActivity.showV665CoverAutoGenerate665Toggle() {
    val current = BiliClient.prefs.v665coverAutoGenerate665
    BiliClient.prefs.v665coverAutoGenerate665 = !current
    AppToast.show(this, "Cover Auto Generate665: ${if (!current) "ON" else "OFF"}")
}

// v665: Crash Auto Report665
internal fun PlayerActivity.showV665CrashAutoReport665Toggle() {
    val current = BiliClient.prefs.v665crashAutoReport665
    BiliClient.prefs.v665crashAutoReport665 = !current
    AppToast.show(this, "Crash Auto Report665: ${if (!current) "ON" else "OFF"}")
}

// v665: Create Auto Backup665
internal fun PlayerActivity.showV665CreateAutoBackup665Toggle() {
    val current = BiliClient.prefs.v665createAutoBackup665
    BiliClient.prefs.v665createAutoBackup665 = !current
    AppToast.show(this, "Create Auto Backup665: ${if (!current) "ON" else "OFF"}")
}

// v665: Crop Auto Region665
internal fun PlayerActivity.showV665CropAutoRegion665Toggle() {
    val current = BiliClient.prefs.v665cropAutoRegion665
    BiliClient.prefs.v665cropAutoRegion665 = !current
    AppToast.show(this, "Crop Auto Region665: ${if (!current) "ON" else "OFF"}")
}

// v666: Config Auto Save666
internal fun PlayerActivity.showV666ConfigAutoSave666Toggle() {
    val current = BiliClient.prefs.v666configAutoSave666
    BiliClient.prefs.v666configAutoSave666 = !current
    AppToast.show(this, "Config Auto Save666: ${if (!current) "ON" else "OFF"}")
}

// v666: Confirm Auto Dialog666
internal fun PlayerActivity.showV666ConfirmAutoDialog666Toggle() {
    val current = BiliClient.prefs.v666confirmAutoDialog666
    BiliClient.prefs.v666confirmAutoDialog666 = !current
    AppToast.show(this, "Confirm Auto Dialog666: ${if (!current) "ON" else "OFF"}")
}

// v666: Console Auto Open666
internal fun PlayerActivity.showV666ConsoleAutoOpen666Toggle() {
    val current = BiliClient.prefs.v666consoleAutoOpen666
    BiliClient.prefs.v666consoleAutoOpen666 = !current
    AppToast.show(this, "Console Auto Open666: ${if (!current) "ON" else "OFF"}")
}

// v666: Constraint Auto Layout666
internal fun PlayerActivity.showV666ConstraintAutoLayout666Toggle() {
    val current = BiliClient.prefs.v666constraintAutoLayout666
    BiliClient.prefs.v666constraintAutoLayout666 = !current
    AppToast.show(this, "Constraint Auto Layout666: ${if (!current) "ON" else "OFF"}")
}

// v666: Content Auto Cache666
internal fun PlayerActivity.showV666ContentAutoCache666Toggle() {
    val current = BiliClient.prefs.v666contentAutoCache666
    BiliClient.prefs.v666contentAutoCache666 = !current
    AppToast.show(this, "Content Auto Cache666: ${if (!current) "ON" else "OFF"}")
}

// v666: Context Auto Menu666
internal fun PlayerActivity.showV666ContextAutoMenu666Toggle() {
    val current = BiliClient.prefs.v666contextAutoMenu666
    BiliClient.prefs.v666contextAutoMenu666 = !current
    AppToast.show(this, "Context Auto Menu666: ${if (!current) "ON" else "OFF"}")
}

// v666: Control Auto Hide666
internal fun PlayerActivity.showV666ControlAutoHide666Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v666controlAutoHide666).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide666",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v666controlAutoHide666 = value
        AppToast.show(this, "Control Auto Hide666: $value")
    }
}

// v666: Convert Auto Format666
internal fun PlayerActivity.showV666ConvertAutoFormat666Toggle() {
    val current = BiliClient.prefs.v666convertAutoFormat666
    BiliClient.prefs.v666convertAutoFormat666 = !current
    AppToast.show(this, "Convert Auto Format666: ${if (!current) "ON" else "OFF"}")
}

// v666: Copy Auto Clipboard666
internal fun PlayerActivity.showV666CopyAutoClipboard666Toggle() {
    val current = BiliClient.prefs.v666copyAutoClipboard666
    BiliClient.prefs.v666copyAutoClipboard666 = !current
    AppToast.show(this, "Copy Auto Clipboard666: ${if (!current) "ON" else "OFF"}")
}

// v666: Core Auto Affinity666
internal fun PlayerActivity.showV666CoreAutoAffinity666Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v666coreAutoAffinity666).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity666",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v666coreAutoAffinity666 = value
        AppToast.show(this, "Core Auto Affinity666: $value")
    }
}

// v666: Count Auto Increment666
internal fun PlayerActivity.showV666CountAutoIncrement666Toggle() {
    val current = BiliClient.prefs.v666countAutoIncrement666
    BiliClient.prefs.v666countAutoIncrement666 = !current
    AppToast.show(this, "Count Auto Increment666: ${if (!current) "ON" else "OFF"}")
}

// v666: Cover Auto Generate666
internal fun PlayerActivity.showV666CoverAutoGenerate666Toggle() {
    val current = BiliClient.prefs.v666coverAutoGenerate666
    BiliClient.prefs.v666coverAutoGenerate666 = !current
    AppToast.show(this, "Cover Auto Generate666: ${if (!current) "ON" else "OFF"}")
}

// v666: Crash Auto Report666
internal fun PlayerActivity.showV666CrashAutoReport666Toggle() {
    val current = BiliClient.prefs.v666crashAutoReport666
    BiliClient.prefs.v666crashAutoReport666 = !current
    AppToast.show(this, "Crash Auto Report666: ${if (!current) "ON" else "OFF"}")
}

// v666: Create Auto Backup666
internal fun PlayerActivity.showV666CreateAutoBackup666Toggle() {
    val current = BiliClient.prefs.v666createAutoBackup666
    BiliClient.prefs.v666createAutoBackup666 = !current
    AppToast.show(this, "Create Auto Backup666: ${if (!current) "ON" else "OFF"}")
}

// v666: Crop Auto Region666
internal fun PlayerActivity.showV666CropAutoRegion666Toggle() {
    val current = BiliClient.prefs.v666cropAutoRegion666
    BiliClient.prefs.v666cropAutoRegion666 = !current
    AppToast.show(this, "Crop Auto Region666: ${if (!current) "ON" else "OFF"}")
}

// v667: Config Auto Save667
internal fun PlayerActivity.showV667ConfigAutoSave667Toggle() {
    val current = BiliClient.prefs.v667configAutoSave667
    BiliClient.prefs.v667configAutoSave667 = !current
    AppToast.show(this, "Config Auto Save667: ${if (!current) "ON" else "OFF"}")
}

// v667: Confirm Auto Dialog667
internal fun PlayerActivity.showV667ConfirmAutoDialog667Toggle() {
    val current = BiliClient.prefs.v667confirmAutoDialog667
    BiliClient.prefs.v667confirmAutoDialog667 = !current
    AppToast.show(this, "Confirm Auto Dialog667: ${if (!current) "ON" else "OFF"}")
}

// v667: Console Auto Open667
internal fun PlayerActivity.showV667ConsoleAutoOpen667Toggle() {
    val current = BiliClient.prefs.v667consoleAutoOpen667
    BiliClient.prefs.v667consoleAutoOpen667 = !current
    AppToast.show(this, "Console Auto Open667: ${if (!current) "ON" else "OFF"}")
}

// v667: Constraint Auto Layout667
internal fun PlayerActivity.showV667ConstraintAutoLayout667Toggle() {
    val current = BiliClient.prefs.v667constraintAutoLayout667
    BiliClient.prefs.v667constraintAutoLayout667 = !current
    AppToast.show(this, "Constraint Auto Layout667: ${if (!current) "ON" else "OFF"}")
}

// v667: Content Auto Cache667
internal fun PlayerActivity.showV667ContentAutoCache667Toggle() {
    val current = BiliClient.prefs.v667contentAutoCache667
    BiliClient.prefs.v667contentAutoCache667 = !current
    AppToast.show(this, "Content Auto Cache667: ${if (!current) "ON" else "OFF"}")
}

// v667: Context Auto Menu667
internal fun PlayerActivity.showV667ContextAutoMenu667Toggle() {
    val current = BiliClient.prefs.v667contextAutoMenu667
    BiliClient.prefs.v667contextAutoMenu667 = !current
    AppToast.show(this, "Context Auto Menu667: ${if (!current) "ON" else "OFF"}")
}

// v667: Control Auto Hide667
internal fun PlayerActivity.showV667ControlAutoHide667Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v667controlAutoHide667).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide667",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v667controlAutoHide667 = value
        AppToast.show(this, "Control Auto Hide667: $value")
    }
}

// v667: Convert Auto Format667
internal fun PlayerActivity.showV667ConvertAutoFormat667Toggle() {
    val current = BiliClient.prefs.v667convertAutoFormat667
    BiliClient.prefs.v667convertAutoFormat667 = !current
    AppToast.show(this, "Convert Auto Format667: ${if (!current) "ON" else "OFF"}")
}

// v667: Copy Auto Clipboard667
internal fun PlayerActivity.showV667CopyAutoClipboard667Toggle() {
    val current = BiliClient.prefs.v667copyAutoClipboard667
    BiliClient.prefs.v667copyAutoClipboard667 = !current
    AppToast.show(this, "Copy Auto Clipboard667: ${if (!current) "ON" else "OFF"}")
}

// v667: Core Auto Affinity667
internal fun PlayerActivity.showV667CoreAutoAffinity667Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v667coreAutoAffinity667).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity667",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v667coreAutoAffinity667 = value
        AppToast.show(this, "Core Auto Affinity667: $value")
    }
}

// v667: Count Auto Increment667
internal fun PlayerActivity.showV667CountAutoIncrement667Toggle() {
    val current = BiliClient.prefs.v667countAutoIncrement667
    BiliClient.prefs.v667countAutoIncrement667 = !current
    AppToast.show(this, "Count Auto Increment667: ${if (!current) "ON" else "OFF"}")
}

// v667: Cover Auto Generate667
internal fun PlayerActivity.showV667CoverAutoGenerate667Toggle() {
    val current = BiliClient.prefs.v667coverAutoGenerate667
    BiliClient.prefs.v667coverAutoGenerate667 = !current
    AppToast.show(this, "Cover Auto Generate667: ${if (!current) "ON" else "OFF"}")
}

// v667: Crash Auto Report667
internal fun PlayerActivity.showV667CrashAutoReport667Toggle() {
    val current = BiliClient.prefs.v667crashAutoReport667
    BiliClient.prefs.v667crashAutoReport667 = !current
    AppToast.show(this, "Crash Auto Report667: ${if (!current) "ON" else "OFF"}")
}

// v667: Create Auto Backup667
internal fun PlayerActivity.showV667CreateAutoBackup667Toggle() {
    val current = BiliClient.prefs.v667createAutoBackup667
    BiliClient.prefs.v667createAutoBackup667 = !current
    AppToast.show(this, "Create Auto Backup667: ${if (!current) "ON" else "OFF"}")
}

// v667: Crop Auto Region667
internal fun PlayerActivity.showV667CropAutoRegion667Toggle() {
    val current = BiliClient.prefs.v667cropAutoRegion667
    BiliClient.prefs.v667cropAutoRegion667 = !current
    AppToast.show(this, "Crop Auto Region667: ${if (!current) "ON" else "OFF"}")
}

// v668: Config Auto Save668
internal fun PlayerActivity.showV668ConfigAutoSave668Toggle() {
    val current = BiliClient.prefs.v668configAutoSave668
    BiliClient.prefs.v668configAutoSave668 = !current
    AppToast.show(this, "Config Auto Save668: ${if (!current) "ON" else "OFF"}")
}

// v668: Confirm Auto Dialog668
internal fun PlayerActivity.showV668ConfirmAutoDialog668Toggle() {
    val current = BiliClient.prefs.v668confirmAutoDialog668
    BiliClient.prefs.v668confirmAutoDialog668 = !current
    AppToast.show(this, "Confirm Auto Dialog668: ${if (!current) "ON" else "OFF"}")
}

// v668: Console Auto Open668
internal fun PlayerActivity.showV668ConsoleAutoOpen668Toggle() {
    val current = BiliClient.prefs.v668consoleAutoOpen668
    BiliClient.prefs.v668consoleAutoOpen668 = !current
    AppToast.show(this, "Console Auto Open668: ${if (!current) "ON" else "OFF"}")
}

// v668: Constraint Auto Layout668
internal fun PlayerActivity.showV668ConstraintAutoLayout668Toggle() {
    val current = BiliClient.prefs.v668constraintAutoLayout668
    BiliClient.prefs.v668constraintAutoLayout668 = !current
    AppToast.show(this, "Constraint Auto Layout668: ${if (!current) "ON" else "OFF"}")
}

// v668: Content Auto Cache668
internal fun PlayerActivity.showV668ContentAutoCache668Toggle() {
    val current = BiliClient.prefs.v668contentAutoCache668
    BiliClient.prefs.v668contentAutoCache668 = !current
    AppToast.show(this, "Content Auto Cache668: ${if (!current) "ON" else "OFF"}")
}

// v668: Context Auto Menu668
internal fun PlayerActivity.showV668ContextAutoMenu668Toggle() {
    val current = BiliClient.prefs.v668contextAutoMenu668
    BiliClient.prefs.v668contextAutoMenu668 = !current
    AppToast.show(this, "Context Auto Menu668: ${if (!current) "ON" else "OFF"}")
}

// v668: Control Auto Hide668
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

// v668: Convert Auto Format668
internal fun PlayerActivity.showV668ConvertAutoFormat668Toggle() {
    val current = BiliClient.prefs.v668convertAutoFormat668
    BiliClient.prefs.v668convertAutoFormat668 = !current
    AppToast.show(this, "Convert Auto Format668: ${if (!current) "ON" else "OFF"}")
}

// v668: Copy Auto Clipboard668
internal fun PlayerActivity.showV668CopyAutoClipboard668Toggle() {
    val current = BiliClient.prefs.v668copyAutoClipboard668
    BiliClient.prefs.v668copyAutoClipboard668 = !current
    AppToast.show(this, "Copy Auto Clipboard668: ${if (!current) "ON" else "OFF"}")
}

// v668: Core Auto Affinity668
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

// v668: Count Auto Increment668
internal fun PlayerActivity.showV668CountAutoIncrement668Toggle() {
    val current = BiliClient.prefs.v668countAutoIncrement668
    BiliClient.prefs.v668countAutoIncrement668 = !current
    AppToast.show(this, "Count Auto Increment668: ${if (!current) "ON" else "OFF"}")
}

// v668: Cover Auto Generate668
internal fun PlayerActivity.showV668CoverAutoGenerate668Toggle() {
    val current = BiliClient.prefs.v668coverAutoGenerate668
    BiliClient.prefs.v668coverAutoGenerate668 = !current
    AppToast.show(this, "Cover Auto Generate668: ${if (!current) "ON" else "OFF"}")
}

// v668: Crash Auto Report668
internal fun PlayerActivity.showV668CrashAutoReport668Toggle() {
    val current = BiliClient.prefs.v668crashAutoReport668
    BiliClient.prefs.v668crashAutoReport668 = !current
    AppToast.show(this, "Crash Auto Report668: ${if (!current) "ON" else "OFF"}")
}

// v668: Create Auto Backup668
internal fun PlayerActivity.showV668CreateAutoBackup668Toggle() {
    val current = BiliClient.prefs.v668createAutoBackup668
    BiliClient.prefs.v668createAutoBackup668 = !current
    AppToast.show(this, "Create Auto Backup668: ${if (!current) "ON" else "OFF"}")
}

// v668: Crop Auto Region668
internal fun PlayerActivity.showV668CropAutoRegion668Toggle() {
    val current = BiliClient.prefs.v668cropAutoRegion668
    BiliClient.prefs.v668cropAutoRegion668 = !current
    AppToast.show(this, "Crop Auto Region668: ${if (!current) "ON" else "OFF"}")
}

// v669: Config Auto Save669
internal fun PlayerActivity.showV669ConfigAutoSave669Toggle() {
    val current = BiliClient.prefs.v669configAutoSave669
    BiliClient.prefs.v669configAutoSave669 = !current
    AppToast.show(this, "Config Auto Save669: ${if (!current) "ON" else "OFF"}")
}

// v669: Confirm Auto Dialog669
internal fun PlayerActivity.showV669ConfirmAutoDialog669Toggle() {
    val current = BiliClient.prefs.v669confirmAutoDialog669
    BiliClient.prefs.v669confirmAutoDialog669 = !current
    AppToast.show(this, "Confirm Auto Dialog669: ${if (!current) "ON" else "OFF"}")
}

// v669: Console Auto Open669
internal fun PlayerActivity.showV669ConsoleAutoOpen669Toggle() {
    val current = BiliClient.prefs.v669consoleAutoOpen669
    BiliClient.prefs.v669consoleAutoOpen669 = !current
    AppToast.show(this, "Console Auto Open669: ${if (!current) "ON" else "OFF"}")
}

// v669: Constraint Auto Layout669
internal fun PlayerActivity.showV669ConstraintAutoLayout669Toggle() {
    val current = BiliClient.prefs.v669constraintAutoLayout669
    BiliClient.prefs.v669constraintAutoLayout669 = !current
    AppToast.show(this, "Constraint Auto Layout669: ${if (!current) "ON" else "OFF"}")
}

// v669: Content Auto Cache669
internal fun PlayerActivity.showV669ContentAutoCache669Toggle() {
    val current = BiliClient.prefs.v669contentAutoCache669
    BiliClient.prefs.v669contentAutoCache669 = !current
    AppToast.show(this, "Content Auto Cache669: ${if (!current) "ON" else "OFF"}")
}

// v669: Context Auto Menu669
internal fun PlayerActivity.showV669ContextAutoMenu669Toggle() {
    val current = BiliClient.prefs.v669contextAutoMenu669
    BiliClient.prefs.v669contextAutoMenu669 = !current
    AppToast.show(this, "Context Auto Menu669: ${if (!current) "ON" else "OFF"}")
}

// v669: Control Auto Hide669
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

// v669: Convert Auto Format669
internal fun PlayerActivity.showV669ConvertAutoFormat669Toggle() {
    val current = BiliClient.prefs.v669convertAutoFormat669
    BiliClient.prefs.v669convertAutoFormat669 = !current
    AppToast.show(this, "Convert Auto Format669: ${if (!current) "ON" else "OFF"}")
}

// v669: Copy Auto Clipboard669
internal fun PlayerActivity.showV669CopyAutoClipboard669Toggle() {
    val current = BiliClient.prefs.v669copyAutoClipboard669
    BiliClient.prefs.v669copyAutoClipboard669 = !current
    AppToast.show(this, "Copy Auto Clipboard669: ${if (!current) "ON" else "OFF"}")
}

// v669: Core Auto Affinity669
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

// v669: Count Auto Increment669
internal fun PlayerActivity.showV669CountAutoIncrement669Toggle() {
    val current = BiliClient.prefs.v669countAutoIncrement669
    BiliClient.prefs.v669countAutoIncrement669 = !current
    AppToast.show(this, "Count Auto Increment669: ${if (!current) "ON" else "OFF"}")
}

// v669: Cover Auto Generate669
internal fun PlayerActivity.showV669CoverAutoGenerate669Toggle() {
    val current = BiliClient.prefs.v669coverAutoGenerate669
    BiliClient.prefs.v669coverAutoGenerate669 = !current
    AppToast.show(this, "Cover Auto Generate669: ${if (!current) "ON" else "OFF"}")
}

// v669: Crash Auto Report669
internal fun PlayerActivity.showV669CrashAutoReport669Toggle() {
    val current = BiliClient.prefs.v669crashAutoReport669
    BiliClient.prefs.v669crashAutoReport669 = !current
    AppToast.show(this, "Crash Auto Report669: ${if (!current) "ON" else "OFF"}")
}

// v669: Create Auto Backup669
internal fun PlayerActivity.showV669CreateAutoBackup669Toggle() {
    val current = BiliClient.prefs.v669createAutoBackup669
    BiliClient.prefs.v669createAutoBackup669 = !current
    AppToast.show(this, "Create Auto Backup669: ${if (!current) "ON" else "OFF"}")
}

// v669: Crop Auto Region669
internal fun PlayerActivity.showV669CropAutoRegion669Toggle() {
    val current = BiliClient.prefs.v669cropAutoRegion669
    BiliClient.prefs.v669cropAutoRegion669 = !current
    AppToast.show(this, "Crop Auto Region669: ${if (!current) "ON" else "OFF"}")
}

// v670: Config Auto Save670
internal fun PlayerActivity.showV670ConfigAutoSave670Toggle() {
    val current = BiliClient.prefs.v670configAutoSave670
    BiliClient.prefs.v670configAutoSave670 = !current
    AppToast.show(this, "Config Auto Save670: ${if (!current) "ON" else "OFF"}")
}

// v670: Confirm Auto Dialog670
internal fun PlayerActivity.showV670ConfirmAutoDialog670Toggle() {
    val current = BiliClient.prefs.v670confirmAutoDialog670
    BiliClient.prefs.v670confirmAutoDialog670 = !current
    AppToast.show(this, "Confirm Auto Dialog670: ${if (!current) "ON" else "OFF"}")
}

// v670: Console Auto Open670
internal fun PlayerActivity.showV670ConsoleAutoOpen670Toggle() {
    val current = BiliClient.prefs.v670consoleAutoOpen670
    BiliClient.prefs.v670consoleAutoOpen670 = !current
    AppToast.show(this, "Console Auto Open670: ${if (!current) "ON" else "OFF"}")
}

// v670: Constraint Auto Layout670
internal fun PlayerActivity.showV670ConstraintAutoLayout670Toggle() {
    val current = BiliClient.prefs.v670constraintAutoLayout670
    BiliClient.prefs.v670constraintAutoLayout670 = !current
    AppToast.show(this, "Constraint Auto Layout670: ${if (!current) "ON" else "OFF"}")
}

// v670: Content Auto Cache670
internal fun PlayerActivity.showV670ContentAutoCache670Toggle() {
    val current = BiliClient.prefs.v670contentAutoCache670
    BiliClient.prefs.v670contentAutoCache670 = !current
    AppToast.show(this, "Content Auto Cache670: ${if (!current) "ON" else "OFF"}")
}

// v670: Context Auto Menu670
internal fun PlayerActivity.showV670ContextAutoMenu670Toggle() {
    val current = BiliClient.prefs.v670contextAutoMenu670
    BiliClient.prefs.v670contextAutoMenu670 = !current
    AppToast.show(this, "Context Auto Menu670: ${if (!current) "ON" else "OFF"}")
}

// v670: Control Auto Hide670
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

// v670: Convert Auto Format670
internal fun PlayerActivity.showV670ConvertAutoFormat670Toggle() {
    val current = BiliClient.prefs.v670convertAutoFormat670
    BiliClient.prefs.v670convertAutoFormat670 = !current
    AppToast.show(this, "Convert Auto Format670: ${if (!current) "ON" else "OFF"}")
}

// v670: Copy Auto Clipboard670
internal fun PlayerActivity.showV670CopyAutoClipboard670Toggle() {
    val current = BiliClient.prefs.v670copyAutoClipboard670
    BiliClient.prefs.v670copyAutoClipboard670 = !current
    AppToast.show(this, "Copy Auto Clipboard670: ${if (!current) "ON" else "OFF"}")
}

// v670: Core Auto Affinity670
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

// v670: Count Auto Increment670
internal fun PlayerActivity.showV670CountAutoIncrement670Toggle() {
    val current = BiliClient.prefs.v670countAutoIncrement670
    BiliClient.prefs.v670countAutoIncrement670 = !current
    AppToast.show(this, "Count Auto Increment670: ${if (!current) "ON" else "OFF"}")
}

// v670: Cover Auto Generate670
internal fun PlayerActivity.showV670CoverAutoGenerate670Toggle() {
    val current = BiliClient.prefs.v670coverAutoGenerate670
    BiliClient.prefs.v670coverAutoGenerate670 = !current
    AppToast.show(this, "Cover Auto Generate670: ${if (!current) "ON" else "OFF"}")
}

// v670: Crash Auto Report670
internal fun PlayerActivity.showV670CrashAutoReport670Toggle() {
    val current = BiliClient.prefs.v670crashAutoReport670
    BiliClient.prefs.v670crashAutoReport670 = !current
    AppToast.show(this, "Crash Auto Report670: ${if (!current) "ON" else "OFF"}")
}

// v670: Create Auto Backup670
internal fun PlayerActivity.showV670CreateAutoBackup670Toggle() {
    val current = BiliClient.prefs.v670createAutoBackup670
    BiliClient.prefs.v670createAutoBackup670 = !current
    AppToast.show(this, "Create Auto Backup670: ${if (!current) "ON" else "OFF"}")
}

// v670: Crop Auto Region670
internal fun PlayerActivity.showV670CropAutoRegion670Toggle() {
    val current = BiliClient.prefs.v670cropAutoRegion670
    BiliClient.prefs.v670cropAutoRegion670 = !current
    AppToast.show(this, "Crop Auto Region670: ${if (!current) "ON" else "OFF"}")
}

// v671: Cross Auto Fade671
internal fun PlayerActivity.showV671CrossAutoFade671Toggle() {
    val current = BiliClient.prefs.v671crossAutoFade671
    BiliClient.prefs.v671crossAutoFade671 = !current
    AppToast.show(this, "Cross Auto Fade671: ${if (!current) "ON" else "OFF"}")
}

// v671: Crypto Auto Hash671
internal fun PlayerActivity.showV671CryptoAutoHash671Toggle() {
    val current = BiliClient.prefs.v671cryptoAutoHash671
    BiliClient.prefs.v671cryptoAutoHash671 = !current
    AppToast.show(this, "Crypto Auto Hash671: ${if (!current) "ON" else "OFF"}")
}

// v671: Cursor Auto Hide671
internal fun PlayerActivity.showV671CursorAutoHide671Toggle() {
    val current = BiliClient.prefs.v671cursorAutoHide671
    BiliClient.prefs.v671cursorAutoHide671 = !current
    AppToast.show(this, "Cursor Auto Hide671: ${if (!current) "ON" else "OFF"}")
}

// v671: Curve Auto Smooth671
internal fun PlayerActivity.showV671CurveAutoSmooth671Toggle() {
    val current = BiliClient.prefs.v671curveAutoSmooth671
    BiliClient.prefs.v671curveAutoSmooth671 = !current
    AppToast.show(this, "Curve Auto Smooth671: ${if (!current) "ON" else "OFF"}")
}

// v671: Custom Auto Theme671
internal fun PlayerActivity.showV671CustomAutoTheme671Toggle() {
    val current = BiliClient.prefs.v671customAutoTheme671
    BiliClient.prefs.v671customAutoTheme671 = !current
    AppToast.show(this, "Custom Auto Theme671: ${if (!current) "ON" else "OFF"}")
}

// v671: Cycle Auto Repeat671
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

// v671: Data Auto Compress671
internal fun PlayerActivity.showV671DataAutoCompress671Toggle() {
    val current = BiliClient.prefs.v671dataAutoCompress671
    BiliClient.prefs.v671dataAutoCompress671 = !current
    AppToast.show(this, "Data Auto Compress671: ${if (!current) "ON" else "OFF"}")
}

// v671: Database Auto Index671
internal fun PlayerActivity.showV671DatabaseAutoIndex671Toggle() {
    val current = BiliClient.prefs.v671databaseAutoIndex671
    BiliClient.prefs.v671databaseAutoIndex671 = !current
    AppToast.show(this, "Database Auto Index671: ${if (!current) "ON" else "OFF"}")
}

// v671: Date Auto Format671
internal fun PlayerActivity.showV671DateAutoFormat671Toggle() {
    val current = BiliClient.prefs.v671dateAutoFormat671
    BiliClient.prefs.v671dateAutoFormat671 = !current
    AppToast.show(this, "Date Auto Format671: ${if (!current) "ON" else "OFF"}")
}

// v671: Debug Auto Verbose671
internal fun PlayerActivity.showV671DebugAutoVerbose671Toggle() {
    val current = BiliClient.prefs.v671debugAutoVerbose671
    BiliClient.prefs.v671debugAutoVerbose671 = !current
    AppToast.show(this, "Debug Auto Verbose671: ${if (!current) "ON" else "OFF"}")
}

// v671: Decay Auto Fadeout671
internal fun PlayerActivity.showV671DecayAutoFadeout671Toggle() {
    val current = BiliClient.prefs.v671decayAutoFadeout671
    BiliClient.prefs.v671decayAutoFadeout671 = !current
    AppToast.show(this, "Decay Auto Fadeout671: ${if (!current) "ON" else "OFF"}")
}

// v671: Decimal Auto Round671
internal fun PlayerActivity.showV671DecimalAutoRound671Toggle() {
    val current = BiliClient.prefs.v671decimalAutoRound671
    BiliClient.prefs.v671decimalAutoRound671 = !current
    AppToast.show(this, "Decimal Auto Round671: ${if (!current) "ON" else "OFF"}")
}

// v671: Decode Auto Codec671
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

// v671: Default Auto Restore671
internal fun PlayerActivity.showV671DefaultAutoRestore671Toggle() {
    val current = BiliClient.prefs.v671defaultAutoRestore671
    BiliClient.prefs.v671defaultAutoRestore671 = !current
    AppToast.show(this, "Default Auto Restore671: ${if (!current) "ON" else "OFF"}")
}

// v671: Delay Auto Buffer671
internal fun PlayerActivity.showV671DelayAutoBuffer671Toggle() {
    val current = BiliClient.prefs.v671delayAutoBuffer671
    BiliClient.prefs.v671delayAutoBuffer671 = !current
    AppToast.show(this, "Delay Auto Buffer671: ${if (!current) "ON" else "OFF"}")
}

// v672: Cross Auto Fade672
internal fun PlayerActivity.showV672CrossAutoFade672Toggle() {
    val current = BiliClient.prefs.v672crossAutoFade672
    BiliClient.prefs.v672crossAutoFade672 = !current
    AppToast.show(this, "Cross Auto Fade672: ${if (!current) "ON" else "OFF"}")
}

// v672: Crypto Auto Hash672
internal fun PlayerActivity.showV672CryptoAutoHash672Toggle() {
    val current = BiliClient.prefs.v672cryptoAutoHash672
    BiliClient.prefs.v672cryptoAutoHash672 = !current
    AppToast.show(this, "Crypto Auto Hash672: ${if (!current) "ON" else "OFF"}")
}

// v672: Cursor Auto Hide672
internal fun PlayerActivity.showV672CursorAutoHide672Toggle() {
    val current = BiliClient.prefs.v672cursorAutoHide672
    BiliClient.prefs.v672cursorAutoHide672 = !current
    AppToast.show(this, "Cursor Auto Hide672: ${if (!current) "ON" else "OFF"}")
}

// v672: Curve Auto Smooth672
internal fun PlayerActivity.showV672CurveAutoSmooth672Toggle() {
    val current = BiliClient.prefs.v672curveAutoSmooth672
    BiliClient.prefs.v672curveAutoSmooth672 = !current
    AppToast.show(this, "Curve Auto Smooth672: ${if (!current) "ON" else "OFF"}")
}

// v672: Custom Auto Theme672
internal fun PlayerActivity.showV672CustomAutoTheme672Toggle() {
    val current = BiliClient.prefs.v672customAutoTheme672
    BiliClient.prefs.v672customAutoTheme672 = !current
    AppToast.show(this, "Custom Auto Theme672: ${if (!current) "ON" else "OFF"}")
}

// v672: Cycle Auto Repeat672
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

// v672: Data Auto Compress672
internal fun PlayerActivity.showV672DataAutoCompress672Toggle() {
    val current = BiliClient.prefs.v672dataAutoCompress672
    BiliClient.prefs.v672dataAutoCompress672 = !current
    AppToast.show(this, "Data Auto Compress672: ${if (!current) "ON" else "OFF"}")
}

// v672: Database Auto Index672
internal fun PlayerActivity.showV672DatabaseAutoIndex672Toggle() {
    val current = BiliClient.prefs.v672databaseAutoIndex672
    BiliClient.prefs.v672databaseAutoIndex672 = !current
    AppToast.show(this, "Database Auto Index672: ${if (!current) "ON" else "OFF"}")
}

// v672: Date Auto Format672
internal fun PlayerActivity.showV672DateAutoFormat672Toggle() {
    val current = BiliClient.prefs.v672dateAutoFormat672
    BiliClient.prefs.v672dateAutoFormat672 = !current
    AppToast.show(this, "Date Auto Format672: ${if (!current) "ON" else "OFF"}")
}

// v672: Debug Auto Verbose672
internal fun PlayerActivity.showV672DebugAutoVerbose672Toggle() {
    val current = BiliClient.prefs.v672debugAutoVerbose672
    BiliClient.prefs.v672debugAutoVerbose672 = !current
    AppToast.show(this, "Debug Auto Verbose672: ${if (!current) "ON" else "OFF"}")
}

// v672: Decay Auto Fadeout672
internal fun PlayerActivity.showV672DecayAutoFadeout672Toggle() {
    val current = BiliClient.prefs.v672decayAutoFadeout672
    BiliClient.prefs.v672decayAutoFadeout672 = !current
    AppToast.show(this, "Decay Auto Fadeout672: ${if (!current) "ON" else "OFF"}")
}

// v672: Decimal Auto Round672
internal fun PlayerActivity.showV672DecimalAutoRound672Toggle() {
    val current = BiliClient.prefs.v672decimalAutoRound672
    BiliClient.prefs.v672decimalAutoRound672 = !current
    AppToast.show(this, "Decimal Auto Round672: ${if (!current) "ON" else "OFF"}")
}

// v672: Decode Auto Codec672
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

// v672: Default Auto Restore672
internal fun PlayerActivity.showV672DefaultAutoRestore672Toggle() {
    val current = BiliClient.prefs.v672defaultAutoRestore672
    BiliClient.prefs.v672defaultAutoRestore672 = !current
    AppToast.show(this, "Default Auto Restore672: ${if (!current) "ON" else "OFF"}")
}

// v672: Delay Auto Buffer672
internal fun PlayerActivity.showV672DelayAutoBuffer672Toggle() {
    val current = BiliClient.prefs.v672delayAutoBuffer672
    BiliClient.prefs.v672delayAutoBuffer672 = !current
    AppToast.show(this, "Delay Auto Buffer672: ${if (!current) "ON" else "OFF"}")
}

// v673: Cross Auto Fade673
internal fun PlayerActivity.showV673CrossAutoFade673Toggle() {
    val current = BiliClient.prefs.v673crossAutoFade673
    BiliClient.prefs.v673crossAutoFade673 = !current
    AppToast.show(this, "Cross Auto Fade673: ${if (!current) "ON" else "OFF"}")
}

// v673: Crypto Auto Hash673
internal fun PlayerActivity.showV673CryptoAutoHash673Toggle() {
    val current = BiliClient.prefs.v673cryptoAutoHash673
    BiliClient.prefs.v673cryptoAutoHash673 = !current
    AppToast.show(this, "Crypto Auto Hash673: ${if (!current) "ON" else "OFF"}")
}

// v673: Cursor Auto Hide673
internal fun PlayerActivity.showV673CursorAutoHide673Toggle() {
    val current = BiliClient.prefs.v673cursorAutoHide673
    BiliClient.prefs.v673cursorAutoHide673 = !current
    AppToast.show(this, "Cursor Auto Hide673: ${if (!current) "ON" else "OFF"}")
}

// v673: Curve Auto Smooth673
internal fun PlayerActivity.showV673CurveAutoSmooth673Toggle() {
    val current = BiliClient.prefs.v673curveAutoSmooth673
    BiliClient.prefs.v673curveAutoSmooth673 = !current
    AppToast.show(this, "Curve Auto Smooth673: ${if (!current) "ON" else "OFF"}")
}

// v673: Custom Auto Theme673
internal fun PlayerActivity.showV673CustomAutoTheme673Toggle() {
    val current = BiliClient.prefs.v673customAutoTheme673
    BiliClient.prefs.v673customAutoTheme673 = !current
    AppToast.show(this, "Custom Auto Theme673: ${if (!current) "ON" else "OFF"}")
}

// v673: Cycle Auto Repeat673
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

// v673: Data Auto Compress673
internal fun PlayerActivity.showV673DataAutoCompress673Toggle() {
    val current = BiliClient.prefs.v673dataAutoCompress673
    BiliClient.prefs.v673dataAutoCompress673 = !current
    AppToast.show(this, "Data Auto Compress673: ${if (!current) "ON" else "OFF"}")
}

// v673: Database Auto Index673
internal fun PlayerActivity.showV673DatabaseAutoIndex673Toggle() {
    val current = BiliClient.prefs.v673databaseAutoIndex673
    BiliClient.prefs.v673databaseAutoIndex673 = !current
    AppToast.show(this, "Database Auto Index673: ${if (!current) "ON" else "OFF"}")
}

// v673: Date Auto Format673
internal fun PlayerActivity.showV673DateAutoFormat673Toggle() {
    val current = BiliClient.prefs.v673dateAutoFormat673
    BiliClient.prefs.v673dateAutoFormat673 = !current
    AppToast.show(this, "Date Auto Format673: ${if (!current) "ON" else "OFF"}")
}

// v673: Debug Auto Verbose673
internal fun PlayerActivity.showV673DebugAutoVerbose673Toggle() {
    val current = BiliClient.prefs.v673debugAutoVerbose673
    BiliClient.prefs.v673debugAutoVerbose673 = !current
    AppToast.show(this, "Debug Auto Verbose673: ${if (!current) "ON" else "OFF"}")
}

// v673: Decay Auto Fadeout673
internal fun PlayerActivity.showV673DecayAutoFadeout673Toggle() {
    val current = BiliClient.prefs.v673decayAutoFadeout673
    BiliClient.prefs.v673decayAutoFadeout673 = !current
    AppToast.show(this, "Decay Auto Fadeout673: ${if (!current) "ON" else "OFF"}")
}

// v673: Decimal Auto Round673
internal fun PlayerActivity.showV673DecimalAutoRound673Toggle() {
    val current = BiliClient.prefs.v673decimalAutoRound673
    BiliClient.prefs.v673decimalAutoRound673 = !current
    AppToast.show(this, "Decimal Auto Round673: ${if (!current) "ON" else "OFF"}")
}

// v673: Decode Auto Codec673
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

// v673: Default Auto Restore673
internal fun PlayerActivity.showV673DefaultAutoRestore673Toggle() {
    val current = BiliClient.prefs.v673defaultAutoRestore673
    BiliClient.prefs.v673defaultAutoRestore673 = !current
    AppToast.show(this, "Default Auto Restore673: ${if (!current) "ON" else "OFF"}")
}

// v673: Delay Auto Buffer673
internal fun PlayerActivity.showV673DelayAutoBuffer673Toggle() {
    val current = BiliClient.prefs.v673delayAutoBuffer673
    BiliClient.prefs.v673delayAutoBuffer673 = !current
    AppToast.show(this, "Delay Auto Buffer673: ${if (!current) "ON" else "OFF"}")
}

// v674: Cross Auto Fade674
internal fun PlayerActivity.showV674CrossAutoFade674Toggle() {
    val current = BiliClient.prefs.v674crossAutoFade674
    BiliClient.prefs.v674crossAutoFade674 = !current
    AppToast.show(this, "Cross Auto Fade674: ${if (!current) "ON" else "OFF"}")
}

// v674: Crypto Auto Hash674
internal fun PlayerActivity.showV674CryptoAutoHash674Toggle() {
    val current = BiliClient.prefs.v674cryptoAutoHash674
    BiliClient.prefs.v674cryptoAutoHash674 = !current
    AppToast.show(this, "Crypto Auto Hash674: ${if (!current) "ON" else "OFF"}")
}

// v674: Cursor Auto Hide674
internal fun PlayerActivity.showV674CursorAutoHide674Toggle() {
    val current = BiliClient.prefs.v674cursorAutoHide674
    BiliClient.prefs.v674cursorAutoHide674 = !current
    AppToast.show(this, "Cursor Auto Hide674: ${if (!current) "ON" else "OFF"}")
}

// v674: Curve Auto Smooth674
internal fun PlayerActivity.showV674CurveAutoSmooth674Toggle() {
    val current = BiliClient.prefs.v674curveAutoSmooth674
    BiliClient.prefs.v674curveAutoSmooth674 = !current
    AppToast.show(this, "Curve Auto Smooth674: ${if (!current) "ON" else "OFF"}")
}

// v674: Custom Auto Theme674
internal fun PlayerActivity.showV674CustomAutoTheme674Toggle() {
    val current = BiliClient.prefs.v674customAutoTheme674
    BiliClient.prefs.v674customAutoTheme674 = !current
    AppToast.show(this, "Custom Auto Theme674: ${if (!current) "ON" else "OFF"}")
}

// v674: Cycle Auto Repeat674
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

// v674: Data Auto Compress674
internal fun PlayerActivity.showV674DataAutoCompress674Toggle() {
    val current = BiliClient.prefs.v674dataAutoCompress674
    BiliClient.prefs.v674dataAutoCompress674 = !current
    AppToast.show(this, "Data Auto Compress674: ${if (!current) "ON" else "OFF"}")
}

// v674: Database Auto Index674
internal fun PlayerActivity.showV674DatabaseAutoIndex674Toggle() {
    val current = BiliClient.prefs.v674databaseAutoIndex674
    BiliClient.prefs.v674databaseAutoIndex674 = !current
    AppToast.show(this, "Database Auto Index674: ${if (!current) "ON" else "OFF"}")
}

// v674: Date Auto Format674
internal fun PlayerActivity.showV674DateAutoFormat674Toggle() {
    val current = BiliClient.prefs.v674dateAutoFormat674
    BiliClient.prefs.v674dateAutoFormat674 = !current
    AppToast.show(this, "Date Auto Format674: ${if (!current) "ON" else "OFF"}")
}

// v674: Debug Auto Verbose674
internal fun PlayerActivity.showV674DebugAutoVerbose674Toggle() {
    val current = BiliClient.prefs.v674debugAutoVerbose674
    BiliClient.prefs.v674debugAutoVerbose674 = !current
    AppToast.show(this, "Debug Auto Verbose674: ${if (!current) "ON" else "OFF"}")
}

// v674: Decay Auto Fadeout674
internal fun PlayerActivity.showV674DecayAutoFadeout674Toggle() {
    val current = BiliClient.prefs.v674decayAutoFadeout674
    BiliClient.prefs.v674decayAutoFadeout674 = !current
    AppToast.show(this, "Decay Auto Fadeout674: ${if (!current) "ON" else "OFF"}")
}

// v674: Decimal Auto Round674
internal fun PlayerActivity.showV674DecimalAutoRound674Toggle() {
    val current = BiliClient.prefs.v674decimalAutoRound674
    BiliClient.prefs.v674decimalAutoRound674 = !current
    AppToast.show(this, "Decimal Auto Round674: ${if (!current) "ON" else "OFF"}")
}

// v674: Decode Auto Codec674
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

// v674: Default Auto Restore674
internal fun PlayerActivity.showV674DefaultAutoRestore674Toggle() {
    val current = BiliClient.prefs.v674defaultAutoRestore674
    BiliClient.prefs.v674defaultAutoRestore674 = !current
    AppToast.show(this, "Default Auto Restore674: ${if (!current) "ON" else "OFF"}")
}

// v674: Delay Auto Buffer674
internal fun PlayerActivity.showV674DelayAutoBuffer674Toggle() {
    val current = BiliClient.prefs.v674delayAutoBuffer674
    BiliClient.prefs.v674delayAutoBuffer674 = !current
    AppToast.show(this, "Delay Auto Buffer674: ${if (!current) "ON" else "OFF"}")
}

// v675: Cross Auto Fade675
internal fun PlayerActivity.showV675CrossAutoFade675Toggle() {
    val current = BiliClient.prefs.v675crossAutoFade675
    BiliClient.prefs.v675crossAutoFade675 = !current
    AppToast.show(this, "Cross Auto Fade675: ${if (!current) "ON" else "OFF"}")
}

// v675: Crypto Auto Hash675
internal fun PlayerActivity.showV675CryptoAutoHash675Toggle() {
    val current = BiliClient.prefs.v675cryptoAutoHash675
    BiliClient.prefs.v675cryptoAutoHash675 = !current
    AppToast.show(this, "Crypto Auto Hash675: ${if (!current) "ON" else "OFF"}")
}

// v675: Cursor Auto Hide675
internal fun PlayerActivity.showV675CursorAutoHide675Toggle() {
    val current = BiliClient.prefs.v675cursorAutoHide675
    BiliClient.prefs.v675cursorAutoHide675 = !current
    AppToast.show(this, "Cursor Auto Hide675: ${if (!current) "ON" else "OFF"}")
}

// v675: Curve Auto Smooth675
internal fun PlayerActivity.showV675CurveAutoSmooth675Toggle() {
    val current = BiliClient.prefs.v675curveAutoSmooth675
    BiliClient.prefs.v675curveAutoSmooth675 = !current
    AppToast.show(this, "Curve Auto Smooth675: ${if (!current) "ON" else "OFF"}")
}

// v675: Custom Auto Theme675
internal fun PlayerActivity.showV675CustomAutoTheme675Toggle() {
    val current = BiliClient.prefs.v675customAutoTheme675
    BiliClient.prefs.v675customAutoTheme675 = !current
    AppToast.show(this, "Custom Auto Theme675: ${if (!current) "ON" else "OFF"}")
}

// v675: Cycle Auto Repeat675
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

// v675: Data Auto Compress675
internal fun PlayerActivity.showV675DataAutoCompress675Toggle() {
    val current = BiliClient.prefs.v675dataAutoCompress675
    BiliClient.prefs.v675dataAutoCompress675 = !current
    AppToast.show(this, "Data Auto Compress675: ${if (!current) "ON" else "OFF"}")
}

// v675: Database Auto Index675
internal fun PlayerActivity.showV675DatabaseAutoIndex675Toggle() {
    val current = BiliClient.prefs.v675databaseAutoIndex675
    BiliClient.prefs.v675databaseAutoIndex675 = !current
    AppToast.show(this, "Database Auto Index675: ${if (!current) "ON" else "OFF"}")
}

// v675: Date Auto Format675
internal fun PlayerActivity.showV675DateAutoFormat675Toggle() {
    val current = BiliClient.prefs.v675dateAutoFormat675
    BiliClient.prefs.v675dateAutoFormat675 = !current
    AppToast.show(this, "Date Auto Format675: ${if (!current) "ON" else "OFF"}")
}

// v675: Debug Auto Verbose675
internal fun PlayerActivity.showV675DebugAutoVerbose675Toggle() {
    val current = BiliClient.prefs.v675debugAutoVerbose675
    BiliClient.prefs.v675debugAutoVerbose675 = !current
    AppToast.show(this, "Debug Auto Verbose675: ${if (!current) "ON" else "OFF"}")
}

// v675: Decay Auto Fadeout675
internal fun PlayerActivity.showV675DecayAutoFadeout675Toggle() {
    val current = BiliClient.prefs.v675decayAutoFadeout675
    BiliClient.prefs.v675decayAutoFadeout675 = !current
    AppToast.show(this, "Decay Auto Fadeout675: ${if (!current) "ON" else "OFF"}")
}

// v675: Decimal Auto Round675
internal fun PlayerActivity.showV675DecimalAutoRound675Toggle() {
    val current = BiliClient.prefs.v675decimalAutoRound675
    BiliClient.prefs.v675decimalAutoRound675 = !current
    AppToast.show(this, "Decimal Auto Round675: ${if (!current) "ON" else "OFF"}")
}

// v675: Decode Auto Codec675
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

// v675: Default Auto Restore675
internal fun PlayerActivity.showV675DefaultAutoRestore675Toggle() {
    val current = BiliClient.prefs.v675defaultAutoRestore675
    BiliClient.prefs.v675defaultAutoRestore675 = !current
    AppToast.show(this, "Default Auto Restore675: ${if (!current) "ON" else "OFF"}")
}

// v675: Delay Auto Buffer675
internal fun PlayerActivity.showV675DelayAutoBuffer675Toggle() {
    val current = BiliClient.prefs.v675delayAutoBuffer675
    BiliClient.prefs.v675delayAutoBuffer675 = !current
    AppToast.show(this, "Delay Auto Buffer675: ${if (!current) "ON" else "OFF"}")
}

// v676: Cross Auto Fade676
internal fun PlayerActivity.showV676CrossAutoFade676Toggle() {
    val current = BiliClient.prefs.v676crossAutoFade676
    BiliClient.prefs.v676crossAutoFade676 = !current
    AppToast.show(this, "Cross Auto Fade676: ${if (!current) "ON" else "OFF"}")
}

// v676: Crypto Auto Hash676
internal fun PlayerActivity.showV676CryptoAutoHash676Toggle() {
    val current = BiliClient.prefs.v676cryptoAutoHash676
    BiliClient.prefs.v676cryptoAutoHash676 = !current
    AppToast.show(this, "Crypto Auto Hash676: ${if (!current) "ON" else "OFF"}")
}

// v676: Cursor Auto Hide676
internal fun PlayerActivity.showV676CursorAutoHide676Toggle() {
    val current = BiliClient.prefs.v676cursorAutoHide676
    BiliClient.prefs.v676cursorAutoHide676 = !current
    AppToast.show(this, "Cursor Auto Hide676: ${if (!current) "ON" else "OFF"}")
}

// v676: Curve Auto Smooth676
internal fun PlayerActivity.showV676CurveAutoSmooth676Toggle() {
    val current = BiliClient.prefs.v676curveAutoSmooth676
    BiliClient.prefs.v676curveAutoSmooth676 = !current
    AppToast.show(this, "Curve Auto Smooth676: ${if (!current) "ON" else "OFF"}")
}

// v676: Custom Auto Theme676
internal fun PlayerActivity.showV676CustomAutoTheme676Toggle() {
    val current = BiliClient.prefs.v676customAutoTheme676
    BiliClient.prefs.v676customAutoTheme676 = !current
    AppToast.show(this, "Custom Auto Theme676: ${if (!current) "ON" else "OFF"}")
}

// v676: Cycle Auto Repeat676
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

// v676: Data Auto Compress676
internal fun PlayerActivity.showV676DataAutoCompress676Toggle() {
    val current = BiliClient.prefs.v676dataAutoCompress676
    BiliClient.prefs.v676dataAutoCompress676 = !current
    AppToast.show(this, "Data Auto Compress676: ${if (!current) "ON" else "OFF"}")
}

// v676: Database Auto Index676
internal fun PlayerActivity.showV676DatabaseAutoIndex676Toggle() {
    val current = BiliClient.prefs.v676databaseAutoIndex676
    BiliClient.prefs.v676databaseAutoIndex676 = !current
    AppToast.show(this, "Database Auto Index676: ${if (!current) "ON" else "OFF"}")
}

