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

internal fun PlayerActivity.showV695DisableAutoToggle695Toggle() {
    val current = BiliClient.prefs.v695disableAutoToggle695
    BiliClient.prefs.v695disableAutoToggle695 = !current
    AppToast.show(this, "Disable Auto Toggle695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DiscardAutoWarn695Toggle() {
    val current = BiliClient.prefs.v695discardAutoWarn695
    BiliClient.prefs.v695discardAutoWarn695 = !current
    AppToast.show(this, "Discard Auto Warn695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DiscoverAutoScan695Toggle() {
    val current = BiliClient.prefs.v695discoverAutoScan695
    BiliClient.prefs.v695discoverAutoScan695 = !current
    AppToast.show(this, "Discover Auto Scan695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DispatchAutoEvent695Toggle() {
    val current = BiliClient.prefs.v695dispatchAutoEvent695
    BiliClient.prefs.v695dispatchAutoEvent695 = !current
    AppToast.show(this, "Dispatch Auto Event695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DisplayAutoRotate695Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v695displayAutoRotate695).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate695",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v695displayAutoRotate695 = value
        AppToast.show(this, "Display Auto Rotate695: $value")
    }
}

internal fun PlayerActivity.showV695DisposeAutoCleanup695Toggle() {
    val current = BiliClient.prefs.v695disposeAutoCleanup695
    BiliClient.prefs.v695disposeAutoCleanup695 = !current
    AppToast.show(this, "Dispose Auto Cleanup695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DistAutoCalc695Toggle() {
    val current = BiliClient.prefs.v695distAutoCalc695
    BiliClient.prefs.v695distAutoCalc695 = !current
    AppToast.show(this, "Dist Auto Calc695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DivideAutoSplit695Toggle() {
    val current = BiliClient.prefs.v695divideAutoSplit695
    BiliClient.prefs.v695divideAutoSplit695 = !current
    AppToast.show(this, "Divide Auto Split695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DocumentAutoSave695Toggle() {
    val current = BiliClient.prefs.v695documentAutoSave695
    BiliClient.prefs.v695documentAutoSave695 = !current
    AppToast.show(this, "Document Auto Save695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DomainAutoResolve695Toggle() {
    val current = BiliClient.prefs.v695domainAutoResolve695
    BiliClient.prefs.v695domainAutoResolve695 = !current
    AppToast.show(this, "Domain Auto Resolve695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DownloadAutoQueue695Toggle() {
    val current = BiliClient.prefs.v695downloadAutoQueue695
    BiliClient.prefs.v695downloadAutoQueue695 = !current
    AppToast.show(this, "Download Auto Queue695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DraftAutoSave695Toggle() {
    val current = BiliClient.prefs.v695draftAutoSave695
    BiliClient.prefs.v695draftAutoSave695 = !current
    AppToast.show(this, "Draft Auto Save695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DragAutoScroll695Toggle() {
    val current = BiliClient.prefs.v695dragAutoScroll695
    BiliClient.prefs.v695dragAutoScroll695 = !current
    AppToast.show(this, "Drag Auto Scroll695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DrawAutoAntialias695Toggle() {
    val current = BiliClient.prefs.v695drawAutoAntialias695
    BiliClient.prefs.v695drawAutoAntialias695 = !current
    AppToast.show(this, "Draw Auto Antialias695: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DirtyAutoFlag696Toggle() {
    val current = BiliClient.prefs.v696dirtyAutoFlag696
    BiliClient.prefs.v696dirtyAutoFlag696 = !current
    AppToast.show(this, "Dirty Auto Flag696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DisableAutoToggle696Toggle() {
    val current = BiliClient.prefs.v696disableAutoToggle696
    BiliClient.prefs.v696disableAutoToggle696 = !current
    AppToast.show(this, "Disable Auto Toggle696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DiscardAutoWarn696Toggle() {
    val current = BiliClient.prefs.v696discardAutoWarn696
    BiliClient.prefs.v696discardAutoWarn696 = !current
    AppToast.show(this, "Discard Auto Warn696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DiscoverAutoScan696Toggle() {
    val current = BiliClient.prefs.v696discoverAutoScan696
    BiliClient.prefs.v696discoverAutoScan696 = !current
    AppToast.show(this, "Discover Auto Scan696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DispatchAutoEvent696Toggle() {
    val current = BiliClient.prefs.v696dispatchAutoEvent696
    BiliClient.prefs.v696dispatchAutoEvent696 = !current
    AppToast.show(this, "Dispatch Auto Event696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DisplayAutoRotate696Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v696displayAutoRotate696).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate696",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v696displayAutoRotate696 = value
        AppToast.show(this, "Display Auto Rotate696: $value")
    }
}

internal fun PlayerActivity.showV696DisposeAutoCleanup696Toggle() {
    val current = BiliClient.prefs.v696disposeAutoCleanup696
    BiliClient.prefs.v696disposeAutoCleanup696 = !current
    AppToast.show(this, "Dispose Auto Cleanup696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DistAutoCalc696Toggle() {
    val current = BiliClient.prefs.v696distAutoCalc696
    BiliClient.prefs.v696distAutoCalc696 = !current
    AppToast.show(this, "Dist Auto Calc696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DivideAutoSplit696Toggle() {
    val current = BiliClient.prefs.v696divideAutoSplit696
    BiliClient.prefs.v696divideAutoSplit696 = !current
    AppToast.show(this, "Divide Auto Split696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DocumentAutoSave696Toggle() {
    val current = BiliClient.prefs.v696documentAutoSave696
    BiliClient.prefs.v696documentAutoSave696 = !current
    AppToast.show(this, "Document Auto Save696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DomainAutoResolve696Toggle() {
    val current = BiliClient.prefs.v696domainAutoResolve696
    BiliClient.prefs.v696domainAutoResolve696 = !current
    AppToast.show(this, "Domain Auto Resolve696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DownloadAutoQueue696Toggle() {
    val current = BiliClient.prefs.v696downloadAutoQueue696
    BiliClient.prefs.v696downloadAutoQueue696 = !current
    AppToast.show(this, "Download Auto Queue696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DraftAutoSave696Toggle() {
    val current = BiliClient.prefs.v696draftAutoSave696
    BiliClient.prefs.v696draftAutoSave696 = !current
    AppToast.show(this, "Draft Auto Save696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DragAutoScroll696Toggle() {
    val current = BiliClient.prefs.v696dragAutoScroll696
    BiliClient.prefs.v696dragAutoScroll696 = !current
    AppToast.show(this, "Drag Auto Scroll696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV696DrawAutoAntialias696Toggle() {
    val current = BiliClient.prefs.v696drawAutoAntialias696
    BiliClient.prefs.v696drawAutoAntialias696 = !current
    AppToast.show(this, "Draw Auto Antialias696: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DirtyAutoFlag697Toggle() {
    val current = BiliClient.prefs.v697dirtyAutoFlag697
    BiliClient.prefs.v697dirtyAutoFlag697 = !current
    AppToast.show(this, "Dirty Auto Flag697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DisableAutoToggle697Toggle() {
    val current = BiliClient.prefs.v697disableAutoToggle697
    BiliClient.prefs.v697disableAutoToggle697 = !current
    AppToast.show(this, "Disable Auto Toggle697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DiscardAutoWarn697Toggle() {
    val current = BiliClient.prefs.v697discardAutoWarn697
    BiliClient.prefs.v697discardAutoWarn697 = !current
    AppToast.show(this, "Discard Auto Warn697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DiscoverAutoScan697Toggle() {
    val current = BiliClient.prefs.v697discoverAutoScan697
    BiliClient.prefs.v697discoverAutoScan697 = !current
    AppToast.show(this, "Discover Auto Scan697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DispatchAutoEvent697Toggle() {
    val current = BiliClient.prefs.v697dispatchAutoEvent697
    BiliClient.prefs.v697dispatchAutoEvent697 = !current
    AppToast.show(this, "Dispatch Auto Event697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DisplayAutoRotate697Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v697displayAutoRotate697).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate697",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v697displayAutoRotate697 = value
        AppToast.show(this, "Display Auto Rotate697: $value")
    }
}

internal fun PlayerActivity.showV697DisposeAutoCleanup697Toggle() {
    val current = BiliClient.prefs.v697disposeAutoCleanup697
    BiliClient.prefs.v697disposeAutoCleanup697 = !current
    AppToast.show(this, "Dispose Auto Cleanup697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DistAutoCalc697Toggle() {
    val current = BiliClient.prefs.v697distAutoCalc697
    BiliClient.prefs.v697distAutoCalc697 = !current
    AppToast.show(this, "Dist Auto Calc697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DivideAutoSplit697Toggle() {
    val current = BiliClient.prefs.v697divideAutoSplit697
    BiliClient.prefs.v697divideAutoSplit697 = !current
    AppToast.show(this, "Divide Auto Split697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DocumentAutoSave697Toggle() {
    val current = BiliClient.prefs.v697documentAutoSave697
    BiliClient.prefs.v697documentAutoSave697 = !current
    AppToast.show(this, "Document Auto Save697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DomainAutoResolve697Toggle() {
    val current = BiliClient.prefs.v697domainAutoResolve697
    BiliClient.prefs.v697domainAutoResolve697 = !current
    AppToast.show(this, "Domain Auto Resolve697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DownloadAutoQueue697Toggle() {
    val current = BiliClient.prefs.v697downloadAutoQueue697
    BiliClient.prefs.v697downloadAutoQueue697 = !current
    AppToast.show(this, "Download Auto Queue697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DraftAutoSave697Toggle() {
    val current = BiliClient.prefs.v697draftAutoSave697
    BiliClient.prefs.v697draftAutoSave697 = !current
    AppToast.show(this, "Draft Auto Save697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DragAutoScroll697Toggle() {
    val current = BiliClient.prefs.v697dragAutoScroll697
    BiliClient.prefs.v697dragAutoScroll697 = !current
    AppToast.show(this, "Drag Auto Scroll697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV697DrawAutoAntialias697Toggle() {
    val current = BiliClient.prefs.v697drawAutoAntialias697
    BiliClient.prefs.v697drawAutoAntialias697 = !current
    AppToast.show(this, "Draw Auto Antialias697: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DirtyAutoFlag698Toggle() {
    val current = BiliClient.prefs.v698dirtyAutoFlag698
    BiliClient.prefs.v698dirtyAutoFlag698 = !current
    AppToast.show(this, "Dirty Auto Flag698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DisableAutoToggle698Toggle() {
    val current = BiliClient.prefs.v698disableAutoToggle698
    BiliClient.prefs.v698disableAutoToggle698 = !current
    AppToast.show(this, "Disable Auto Toggle698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DiscardAutoWarn698Toggle() {
    val current = BiliClient.prefs.v698discardAutoWarn698
    BiliClient.prefs.v698discardAutoWarn698 = !current
    AppToast.show(this, "Discard Auto Warn698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DiscoverAutoScan698Toggle() {
    val current = BiliClient.prefs.v698discoverAutoScan698
    BiliClient.prefs.v698discoverAutoScan698 = !current
    AppToast.show(this, "Discover Auto Scan698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DispatchAutoEvent698Toggle() {
    val current = BiliClient.prefs.v698dispatchAutoEvent698
    BiliClient.prefs.v698dispatchAutoEvent698 = !current
    AppToast.show(this, "Dispatch Auto Event698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DisplayAutoRotate698Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v698displayAutoRotate698).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate698",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v698displayAutoRotate698 = value
        AppToast.show(this, "Display Auto Rotate698: $value")
    }
}

internal fun PlayerActivity.showV698DisposeAutoCleanup698Toggle() {
    val current = BiliClient.prefs.v698disposeAutoCleanup698
    BiliClient.prefs.v698disposeAutoCleanup698 = !current
    AppToast.show(this, "Dispose Auto Cleanup698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DistAutoCalc698Toggle() {
    val current = BiliClient.prefs.v698distAutoCalc698
    BiliClient.prefs.v698distAutoCalc698 = !current
    AppToast.show(this, "Dist Auto Calc698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DivideAutoSplit698Toggle() {
    val current = BiliClient.prefs.v698divideAutoSplit698
    BiliClient.prefs.v698divideAutoSplit698 = !current
    AppToast.show(this, "Divide Auto Split698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DocumentAutoSave698Toggle() {
    val current = BiliClient.prefs.v698documentAutoSave698
    BiliClient.prefs.v698documentAutoSave698 = !current
    AppToast.show(this, "Document Auto Save698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DomainAutoResolve698Toggle() {
    val current = BiliClient.prefs.v698domainAutoResolve698
    BiliClient.prefs.v698domainAutoResolve698 = !current
    AppToast.show(this, "Domain Auto Resolve698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DownloadAutoQueue698Toggle() {
    val current = BiliClient.prefs.v698downloadAutoQueue698
    BiliClient.prefs.v698downloadAutoQueue698 = !current
    AppToast.show(this, "Download Auto Queue698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DraftAutoSave698Toggle() {
    val current = BiliClient.prefs.v698draftAutoSave698
    BiliClient.prefs.v698draftAutoSave698 = !current
    AppToast.show(this, "Draft Auto Save698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DragAutoScroll698Toggle() {
    val current = BiliClient.prefs.v698dragAutoScroll698
    BiliClient.prefs.v698dragAutoScroll698 = !current
    AppToast.show(this, "Drag Auto Scroll698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV698DrawAutoAntialias698Toggle() {
    val current = BiliClient.prefs.v698drawAutoAntialias698
    BiliClient.prefs.v698drawAutoAntialias698 = !current
    AppToast.show(this, "Draw Auto Antialias698: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DirtyAutoFlag699Toggle() {
    val current = BiliClient.prefs.v699dirtyAutoFlag699
    BiliClient.prefs.v699dirtyAutoFlag699 = !current
    AppToast.show(this, "Dirty Auto Flag699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DisableAutoToggle699Toggle() {
    val current = BiliClient.prefs.v699disableAutoToggle699
    BiliClient.prefs.v699disableAutoToggle699 = !current
    AppToast.show(this, "Disable Auto Toggle699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DiscardAutoWarn699Toggle() {
    val current = BiliClient.prefs.v699discardAutoWarn699
    BiliClient.prefs.v699discardAutoWarn699 = !current
    AppToast.show(this, "Discard Auto Warn699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DiscoverAutoScan699Toggle() {
    val current = BiliClient.prefs.v699discoverAutoScan699
    BiliClient.prefs.v699discoverAutoScan699 = !current
    AppToast.show(this, "Discover Auto Scan699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DispatchAutoEvent699Toggle() {
    val current = BiliClient.prefs.v699dispatchAutoEvent699
    BiliClient.prefs.v699dispatchAutoEvent699 = !current
    AppToast.show(this, "Dispatch Auto Event699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DisplayAutoRotate699Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v699displayAutoRotate699).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate699",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v699displayAutoRotate699 = value
        AppToast.show(this, "Display Auto Rotate699: $value")
    }
}

internal fun PlayerActivity.showV699DisposeAutoCleanup699Toggle() {
    val current = BiliClient.prefs.v699disposeAutoCleanup699
    BiliClient.prefs.v699disposeAutoCleanup699 = !current
    AppToast.show(this, "Dispose Auto Cleanup699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DistAutoCalc699Toggle() {
    val current = BiliClient.prefs.v699distAutoCalc699
    BiliClient.prefs.v699distAutoCalc699 = !current
    AppToast.show(this, "Dist Auto Calc699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DivideAutoSplit699Toggle() {
    val current = BiliClient.prefs.v699divideAutoSplit699
    BiliClient.prefs.v699divideAutoSplit699 = !current
    AppToast.show(this, "Divide Auto Split699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DocumentAutoSave699Toggle() {
    val current = BiliClient.prefs.v699documentAutoSave699
    BiliClient.prefs.v699documentAutoSave699 = !current
    AppToast.show(this, "Document Auto Save699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DomainAutoResolve699Toggle() {
    val current = BiliClient.prefs.v699domainAutoResolve699
    BiliClient.prefs.v699domainAutoResolve699 = !current
    AppToast.show(this, "Domain Auto Resolve699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DownloadAutoQueue699Toggle() {
    val current = BiliClient.prefs.v699downloadAutoQueue699
    BiliClient.prefs.v699downloadAutoQueue699 = !current
    AppToast.show(this, "Download Auto Queue699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DraftAutoSave699Toggle() {
    val current = BiliClient.prefs.v699draftAutoSave699
    BiliClient.prefs.v699draftAutoSave699 = !current
    AppToast.show(this, "Draft Auto Save699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DragAutoScroll699Toggle() {
    val current = BiliClient.prefs.v699dragAutoScroll699
    BiliClient.prefs.v699dragAutoScroll699 = !current
    AppToast.show(this, "Drag Auto Scroll699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV699DrawAutoAntialias699Toggle() {
    val current = BiliClient.prefs.v699drawAutoAntialias699
    BiliClient.prefs.v699drawAutoAntialias699 = !current
    AppToast.show(this, "Draw Auto Antialias699: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DirtyAutoFlag700Toggle() {
    val current = BiliClient.prefs.v700dirtyAutoFlag700
    BiliClient.prefs.v700dirtyAutoFlag700 = !current
    AppToast.show(this, "Dirty Auto Flag700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DisableAutoToggle700Toggle() {
    val current = BiliClient.prefs.v700disableAutoToggle700
    BiliClient.prefs.v700disableAutoToggle700 = !current
    AppToast.show(this, "Disable Auto Toggle700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DiscardAutoWarn700Toggle() {
    val current = BiliClient.prefs.v700discardAutoWarn700
    BiliClient.prefs.v700discardAutoWarn700 = !current
    AppToast.show(this, "Discard Auto Warn700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DiscoverAutoScan700Toggle() {
    val current = BiliClient.prefs.v700discoverAutoScan700
    BiliClient.prefs.v700discoverAutoScan700 = !current
    AppToast.show(this, "Discover Auto Scan700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DispatchAutoEvent700Toggle() {
    val current = BiliClient.prefs.v700dispatchAutoEvent700
    BiliClient.prefs.v700dispatchAutoEvent700 = !current
    AppToast.show(this, "Dispatch Auto Event700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DisplayAutoRotate700Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v700displayAutoRotate700).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate700",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v700displayAutoRotate700 = value
        AppToast.show(this, "Display Auto Rotate700: $value")
    }
}

internal fun PlayerActivity.showV700DisposeAutoCleanup700Toggle() {
    val current = BiliClient.prefs.v700disposeAutoCleanup700
    BiliClient.prefs.v700disposeAutoCleanup700 = !current
    AppToast.show(this, "Dispose Auto Cleanup700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DistAutoCalc700Toggle() {
    val current = BiliClient.prefs.v700distAutoCalc700
    BiliClient.prefs.v700distAutoCalc700 = !current
    AppToast.show(this, "Dist Auto Calc700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DivideAutoSplit700Toggle() {
    val current = BiliClient.prefs.v700divideAutoSplit700
    BiliClient.prefs.v700divideAutoSplit700 = !current
    AppToast.show(this, "Divide Auto Split700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DocumentAutoSave700Toggle() {
    val current = BiliClient.prefs.v700documentAutoSave700
    BiliClient.prefs.v700documentAutoSave700 = !current
    AppToast.show(this, "Document Auto Save700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DomainAutoResolve700Toggle() {
    val current = BiliClient.prefs.v700domainAutoResolve700
    BiliClient.prefs.v700domainAutoResolve700 = !current
    AppToast.show(this, "Domain Auto Resolve700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DownloadAutoQueue700Toggle() {
    val current = BiliClient.prefs.v700downloadAutoQueue700
    BiliClient.prefs.v700downloadAutoQueue700 = !current
    AppToast.show(this, "Download Auto Queue700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DraftAutoSave700Toggle() {
    val current = BiliClient.prefs.v700draftAutoSave700
    BiliClient.prefs.v700draftAutoSave700 = !current
    AppToast.show(this, "Draft Auto Save700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DragAutoScroll700Toggle() {
    val current = BiliClient.prefs.v700dragAutoScroll700
    BiliClient.prefs.v700dragAutoScroll700 = !current
    AppToast.show(this, "Drag Auto Scroll700: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV700DrawAutoAntialias700Toggle() {
    val current = BiliClient.prefs.v700drawAutoAntialias700
    BiliClient.prefs.v700drawAutoAntialias700 = !current
    AppToast.show(this, "Draw Auto Antialias700: ${if (!current) "ON" else "OFF"}")
}

