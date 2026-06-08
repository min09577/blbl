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

// v689: Digital Auto Sign689
internal fun PlayerActivity.showV689DigitalAutoSign689Toggle() {
    val current = BiliClient.prefs.v689digitalAutoSign689
    BiliClient.prefs.v689digitalAutoSign689 = !current
    AppToast.show(this, "Digital Auto Sign689: ${if (!current) "ON" else "OFF"}")
}

// v689: Direct Auto Route689
internal fun PlayerActivity.showV689DirectAutoRoute689Toggle() {
    val current = BiliClient.prefs.v689directAutoRoute689
    BiliClient.prefs.v689directAutoRoute689 = !current
    AppToast.show(this, "Direct Auto Route689: ${if (!current) "ON" else "OFF"}")
}

// v690: Delete Auto Confirm690
internal fun PlayerActivity.showV690DeleteAutoConfirm690Toggle() {
    val current = BiliClient.prefs.v690deleteAutoConfirm690
    BiliClient.prefs.v690deleteAutoConfirm690 = !current
    AppToast.show(this, "Delete Auto Confirm690: ${if (!current) "ON" else "OFF"}")
}

// v690: Delta Auto Update690
internal fun PlayerActivity.showV690DeltaAutoUpdate690Toggle() {
    val current = BiliClient.prefs.v690deltaAutoUpdate690
    BiliClient.prefs.v690deltaAutoUpdate690 = !current
    AppToast.show(this, "Delta Auto Update690: ${if (!current) "ON" else "OFF"}")
}

// v690: Demo Auto Play690
internal fun PlayerActivity.showV690DemoAutoPlay690Toggle() {
    val current = BiliClient.prefs.v690demoAutoPlay690
    BiliClient.prefs.v690demoAutoPlay690 = !current
    AppToast.show(this, "Demo Auto Play690: ${if (!current) "ON" else "OFF"}")
}

// v690: Deploy Auto Push690
internal fun PlayerActivity.showV690DeployAutoPush690Toggle() {
    val current = BiliClient.prefs.v690deployAutoPush690
    BiliClient.prefs.v690deployAutoPush690 = !current
    AppToast.show(this, "Deploy Auto Push690: ${if (!current) "ON" else "OFF"}")
}

// v690: Depth Auto Map690
internal fun PlayerActivity.showV690DepthAutoMap690Toggle() {
    val current = BiliClient.prefs.v690depthAutoMap690
    BiliClient.prefs.v690depthAutoMap690 = !current
    AppToast.show(this, "Depth Auto Map690: ${if (!current) "ON" else "OFF"}")
}

// v690: Derive Auto Calc690
internal fun PlayerActivity.showV690DeriveAutoCalc690Toggle() {
    val current = BiliClient.prefs.v690deriveAutoCalc690
    BiliClient.prefs.v690deriveAutoCalc690 = !current
    AppToast.show(this, "Derive Auto Calc690: ${if (!current) "ON" else "OFF"}")
}

// v690: Design Auto Token690
internal fun PlayerActivity.showV690DesignAutoToken690Toggle() {
    val current = BiliClient.prefs.v690designAutoToken690
    BiliClient.prefs.v690designAutoToken690 = !current
    AppToast.show(this, "Design Auto Token690: ${if (!current) "ON" else "OFF"}")
}

// v690: Desktop Auto Mode690
internal fun PlayerActivity.showV690DesktopAutoMode690Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v690desktopAutoMode690).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode690",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v690desktopAutoMode690 = value
        AppToast.show(this, "Desktop Auto Mode690: $value")
    }
}

// v690: Detect Auto Motion690
internal fun PlayerActivity.showV690DetectAutoMotion690Toggle() {
    val current = BiliClient.prefs.v690detectAutoMotion690
    BiliClient.prefs.v690detectAutoMotion690 = !current
    AppToast.show(this, "Detect Auto Motion690: ${if (!current) "ON" else "OFF"}")
}

// v690: Device Auto Pair690
internal fun PlayerActivity.showV690DeviceAutoPair690Toggle() {
    val current = BiliClient.prefs.v690deviceAutoPair690
    BiliClient.prefs.v690deviceAutoPair690 = !current
    AppToast.show(this, "Device Auto Pair690: ${if (!current) "ON" else "OFF"}")
}

// v690: Dialog Auto Theme690
internal fun PlayerActivity.showV690DialogAutoTheme690Toggle() {
    val current = BiliClient.prefs.v690dialogAutoTheme690
    BiliClient.prefs.v690dialogAutoTheme690 = !current
    AppToast.show(this, "Dialog Auto Theme690: ${if (!current) "ON" else "OFF"}")
}

// v690: Diff Auto Highlight690
internal fun PlayerActivity.showV690DiffAutoHighlight690Toggle() {
    val current = BiliClient.prefs.v690diffAutoHighlight690
    BiliClient.prefs.v690diffAutoHighlight690 = !current
    AppToast.show(this, "Diff Auto Highlight690: ${if (!current) "ON" else "OFF"}")
}

// v690: Digest Auto Check690
internal fun PlayerActivity.showV690DigestAutoCheck690Toggle() {
    val current = BiliClient.prefs.v690digestAutoCheck690
    BiliClient.prefs.v690digestAutoCheck690 = !current
    AppToast.show(this, "Digest Auto Check690: ${if (!current) "ON" else "OFF"}")
}

// v690: Digital Auto Sign690
internal fun PlayerActivity.showV690DigitalAutoSign690Toggle() {
    val current = BiliClient.prefs.v690digitalAutoSign690
    BiliClient.prefs.v690digitalAutoSign690 = !current
    AppToast.show(this, "Digital Auto Sign690: ${if (!current) "ON" else "OFF"}")
}

// v690: Direct Auto Route690
internal fun PlayerActivity.showV690DirectAutoRoute690Toggle() {
    val current = BiliClient.prefs.v690directAutoRoute690
    BiliClient.prefs.v690directAutoRoute690 = !current
    AppToast.show(this, "Direct Auto Route690: ${if (!current) "ON" else "OFF"}")
}

// v691: Dirty Auto Flag691
internal fun PlayerActivity.showV691DirtyAutoFlag691Toggle() {
    val current = BiliClient.prefs.v691dirtyAutoFlag691
    BiliClient.prefs.v691dirtyAutoFlag691 = !current
    AppToast.show(this, "Dirty Auto Flag691: ${if (!current) "ON" else "OFF"}")
}

// v691: Disable Auto Toggle691
internal fun PlayerActivity.showV691DisableAutoToggle691Toggle() {
    val current = BiliClient.prefs.v691disableAutoToggle691
    BiliClient.prefs.v691disableAutoToggle691 = !current
    AppToast.show(this, "Disable Auto Toggle691: ${if (!current) "ON" else "OFF"}")
}

// v691: Discard Auto Warn691
internal fun PlayerActivity.showV691DiscardAutoWarn691Toggle() {
    val current = BiliClient.prefs.v691discardAutoWarn691
    BiliClient.prefs.v691discardAutoWarn691 = !current
    AppToast.show(this, "Discard Auto Warn691: ${if (!current) "ON" else "OFF"}")
}

// v691: Discover Auto Scan691
internal fun PlayerActivity.showV691DiscoverAutoScan691Toggle() {
    val current = BiliClient.prefs.v691discoverAutoScan691
    BiliClient.prefs.v691discoverAutoScan691 = !current
    AppToast.show(this, "Discover Auto Scan691: ${if (!current) "ON" else "OFF"}")
}

// v691: Dispatch Auto Event691
internal fun PlayerActivity.showV691DispatchAutoEvent691Toggle() {
    val current = BiliClient.prefs.v691dispatchAutoEvent691
    BiliClient.prefs.v691dispatchAutoEvent691 = !current
    AppToast.show(this, "Dispatch Auto Event691: ${if (!current) "ON" else "OFF"}")
}

// v691: Display Auto Rotate691
internal fun PlayerActivity.showV691DisplayAutoRotate691Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v691displayAutoRotate691).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate691",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v691displayAutoRotate691 = value
        AppToast.show(this, "Display Auto Rotate691: $value")
    }
}

// v691: Dispose Auto Cleanup691
internal fun PlayerActivity.showV691DisposeAutoCleanup691Toggle() {
    val current = BiliClient.prefs.v691disposeAutoCleanup691
    BiliClient.prefs.v691disposeAutoCleanup691 = !current
    AppToast.show(this, "Dispose Auto Cleanup691: ${if (!current) "ON" else "OFF"}")
}

// v691: Dist Auto Calc691
internal fun PlayerActivity.showV691DistAutoCalc691Toggle() {
    val current = BiliClient.prefs.v691distAutoCalc691
    BiliClient.prefs.v691distAutoCalc691 = !current
    AppToast.show(this, "Dist Auto Calc691: ${if (!current) "ON" else "OFF"}")
}

// v691: Divide Auto Split691
internal fun PlayerActivity.showV691DivideAutoSplit691Toggle() {
    val current = BiliClient.prefs.v691divideAutoSplit691
    BiliClient.prefs.v691divideAutoSplit691 = !current
    AppToast.show(this, "Divide Auto Split691: ${if (!current) "ON" else "OFF"}")
}

// v691: Document Auto Save691
internal fun PlayerActivity.showV691DocumentAutoSave691Toggle() {
    val current = BiliClient.prefs.v691documentAutoSave691
    BiliClient.prefs.v691documentAutoSave691 = !current
    AppToast.show(this, "Document Auto Save691: ${if (!current) "ON" else "OFF"}")
}

// v691: Domain Auto Resolve691
internal fun PlayerActivity.showV691DomainAutoResolve691Toggle() {
    val current = BiliClient.prefs.v691domainAutoResolve691
    BiliClient.prefs.v691domainAutoResolve691 = !current
    AppToast.show(this, "Domain Auto Resolve691: ${if (!current) "ON" else "OFF"}")
}

// v691: Download Auto Queue691
internal fun PlayerActivity.showV691DownloadAutoQueue691Toggle() {
    val current = BiliClient.prefs.v691downloadAutoQueue691
    BiliClient.prefs.v691downloadAutoQueue691 = !current
    AppToast.show(this, "Download Auto Queue691: ${if (!current) "ON" else "OFF"}")
}

// v691: Draft Auto Save691
internal fun PlayerActivity.showV691DraftAutoSave691Toggle() {
    val current = BiliClient.prefs.v691draftAutoSave691
    BiliClient.prefs.v691draftAutoSave691 = !current
    AppToast.show(this, "Draft Auto Save691: ${if (!current) "ON" else "OFF"}")
}

// v691: Drag Auto Scroll691
internal fun PlayerActivity.showV691DragAutoScroll691Toggle() {
    val current = BiliClient.prefs.v691dragAutoScroll691
    BiliClient.prefs.v691dragAutoScroll691 = !current
    AppToast.show(this, "Drag Auto Scroll691: ${if (!current) "ON" else "OFF"}")
}

// v691: Draw Auto Antialias691
internal fun PlayerActivity.showV691DrawAutoAntialias691Toggle() {
    val current = BiliClient.prefs.v691drawAutoAntialias691
    BiliClient.prefs.v691drawAutoAntialias691 = !current
    AppToast.show(this, "Draw Auto Antialias691: ${if (!current) "ON" else "OFF"}")
}

// v692: Dirty Auto Flag692
internal fun PlayerActivity.showV692DirtyAutoFlag692Toggle() {
    val current = BiliClient.prefs.v692dirtyAutoFlag692
    BiliClient.prefs.v692dirtyAutoFlag692 = !current
    AppToast.show(this, "Dirty Auto Flag692: ${if (!current) "ON" else "OFF"}")
}

// v692: Disable Auto Toggle692
internal fun PlayerActivity.showV692DisableAutoToggle692Toggle() {
    val current = BiliClient.prefs.v692disableAutoToggle692
    BiliClient.prefs.v692disableAutoToggle692 = !current
    AppToast.show(this, "Disable Auto Toggle692: ${if (!current) "ON" else "OFF"}")
}

// v692: Discard Auto Warn692
internal fun PlayerActivity.showV692DiscardAutoWarn692Toggle() {
    val current = BiliClient.prefs.v692discardAutoWarn692
    BiliClient.prefs.v692discardAutoWarn692 = !current
    AppToast.show(this, "Discard Auto Warn692: ${if (!current) "ON" else "OFF"}")
}

// v692: Discover Auto Scan692
internal fun PlayerActivity.showV692DiscoverAutoScan692Toggle() {
    val current = BiliClient.prefs.v692discoverAutoScan692
    BiliClient.prefs.v692discoverAutoScan692 = !current
    AppToast.show(this, "Discover Auto Scan692: ${if (!current) "ON" else "OFF"}")
}

// v692: Dispatch Auto Event692
internal fun PlayerActivity.showV692DispatchAutoEvent692Toggle() {
    val current = BiliClient.prefs.v692dispatchAutoEvent692
    BiliClient.prefs.v692dispatchAutoEvent692 = !current
    AppToast.show(this, "Dispatch Auto Event692: ${if (!current) "ON" else "OFF"}")
}

// v692: Display Auto Rotate692
internal fun PlayerActivity.showV692DisplayAutoRotate692Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v692displayAutoRotate692).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate692",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v692displayAutoRotate692 = value
        AppToast.show(this, "Display Auto Rotate692: $value")
    }
}

// v692: Dispose Auto Cleanup692
internal fun PlayerActivity.showV692DisposeAutoCleanup692Toggle() {
    val current = BiliClient.prefs.v692disposeAutoCleanup692
    BiliClient.prefs.v692disposeAutoCleanup692 = !current
    AppToast.show(this, "Dispose Auto Cleanup692: ${if (!current) "ON" else "OFF"}")
}

// v692: Dist Auto Calc692
internal fun PlayerActivity.showV692DistAutoCalc692Toggle() {
    val current = BiliClient.prefs.v692distAutoCalc692
    BiliClient.prefs.v692distAutoCalc692 = !current
    AppToast.show(this, "Dist Auto Calc692: ${if (!current) "ON" else "OFF"}")
}

// v692: Divide Auto Split692
internal fun PlayerActivity.showV692DivideAutoSplit692Toggle() {
    val current = BiliClient.prefs.v692divideAutoSplit692
    BiliClient.prefs.v692divideAutoSplit692 = !current
    AppToast.show(this, "Divide Auto Split692: ${if (!current) "ON" else "OFF"}")
}

// v692: Document Auto Save692
internal fun PlayerActivity.showV692DocumentAutoSave692Toggle() {
    val current = BiliClient.prefs.v692documentAutoSave692
    BiliClient.prefs.v692documentAutoSave692 = !current
    AppToast.show(this, "Document Auto Save692: ${if (!current) "ON" else "OFF"}")
}

// v692: Domain Auto Resolve692
internal fun PlayerActivity.showV692DomainAutoResolve692Toggle() {
    val current = BiliClient.prefs.v692domainAutoResolve692
    BiliClient.prefs.v692domainAutoResolve692 = !current
    AppToast.show(this, "Domain Auto Resolve692: ${if (!current) "ON" else "OFF"}")
}

// v692: Download Auto Queue692
internal fun PlayerActivity.showV692DownloadAutoQueue692Toggle() {
    val current = BiliClient.prefs.v692downloadAutoQueue692
    BiliClient.prefs.v692downloadAutoQueue692 = !current
    AppToast.show(this, "Download Auto Queue692: ${if (!current) "ON" else "OFF"}")
}

// v692: Draft Auto Save692
internal fun PlayerActivity.showV692DraftAutoSave692Toggle() {
    val current = BiliClient.prefs.v692draftAutoSave692
    BiliClient.prefs.v692draftAutoSave692 = !current
    AppToast.show(this, "Draft Auto Save692: ${if (!current) "ON" else "OFF"}")
}

// v692: Drag Auto Scroll692
internal fun PlayerActivity.showV692DragAutoScroll692Toggle() {
    val current = BiliClient.prefs.v692dragAutoScroll692
    BiliClient.prefs.v692dragAutoScroll692 = !current
    AppToast.show(this, "Drag Auto Scroll692: ${if (!current) "ON" else "OFF"}")
}

// v692: Draw Auto Antialias692
internal fun PlayerActivity.showV692DrawAutoAntialias692Toggle() {
    val current = BiliClient.prefs.v692drawAutoAntialias692
    BiliClient.prefs.v692drawAutoAntialias692 = !current
    AppToast.show(this, "Draw Auto Antialias692: ${if (!current) "ON" else "OFF"}")
}

// v693: Dirty Auto Flag693
internal fun PlayerActivity.showV693DirtyAutoFlag693Toggle() {
    val current = BiliClient.prefs.v693dirtyAutoFlag693
    BiliClient.prefs.v693dirtyAutoFlag693 = !current
    AppToast.show(this, "Dirty Auto Flag693: ${if (!current) "ON" else "OFF"}")
}

// v693: Disable Auto Toggle693
internal fun PlayerActivity.showV693DisableAutoToggle693Toggle() {
    val current = BiliClient.prefs.v693disableAutoToggle693
    BiliClient.prefs.v693disableAutoToggle693 = !current
    AppToast.show(this, "Disable Auto Toggle693: ${if (!current) "ON" else "OFF"}")
}

// v693: Discard Auto Warn693
internal fun PlayerActivity.showV693DiscardAutoWarn693Toggle() {
    val current = BiliClient.prefs.v693discardAutoWarn693
    BiliClient.prefs.v693discardAutoWarn693 = !current
    AppToast.show(this, "Discard Auto Warn693: ${if (!current) "ON" else "OFF"}")
}

// v693: Discover Auto Scan693
internal fun PlayerActivity.showV693DiscoverAutoScan693Toggle() {
    val current = BiliClient.prefs.v693discoverAutoScan693
    BiliClient.prefs.v693discoverAutoScan693 = !current
    AppToast.show(this, "Discover Auto Scan693: ${if (!current) "ON" else "OFF"}")
}

// v693: Dispatch Auto Event693
internal fun PlayerActivity.showV693DispatchAutoEvent693Toggle() {
    val current = BiliClient.prefs.v693dispatchAutoEvent693
    BiliClient.prefs.v693dispatchAutoEvent693 = !current
    AppToast.show(this, "Dispatch Auto Event693: ${if (!current) "ON" else "OFF"}")
}

// v693: Display Auto Rotate693
internal fun PlayerActivity.showV693DisplayAutoRotate693Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v693displayAutoRotate693).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate693",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v693displayAutoRotate693 = value
        AppToast.show(this, "Display Auto Rotate693: $value")
    }
}

// v693: Dispose Auto Cleanup693
internal fun PlayerActivity.showV693DisposeAutoCleanup693Toggle() {
    val current = BiliClient.prefs.v693disposeAutoCleanup693
    BiliClient.prefs.v693disposeAutoCleanup693 = !current
    AppToast.show(this, "Dispose Auto Cleanup693: ${if (!current) "ON" else "OFF"}")
}

// v693: Dist Auto Calc693
internal fun PlayerActivity.showV693DistAutoCalc693Toggle() {
    val current = BiliClient.prefs.v693distAutoCalc693
    BiliClient.prefs.v693distAutoCalc693 = !current
    AppToast.show(this, "Dist Auto Calc693: ${if (!current) "ON" else "OFF"}")
}

// v693: Divide Auto Split693
internal fun PlayerActivity.showV693DivideAutoSplit693Toggle() {
    val current = BiliClient.prefs.v693divideAutoSplit693
    BiliClient.prefs.v693divideAutoSplit693 = !current
    AppToast.show(this, "Divide Auto Split693: ${if (!current) "ON" else "OFF"}")
}

// v693: Document Auto Save693
internal fun PlayerActivity.showV693DocumentAutoSave693Toggle() {
    val current = BiliClient.prefs.v693documentAutoSave693
    BiliClient.prefs.v693documentAutoSave693 = !current
    AppToast.show(this, "Document Auto Save693: ${if (!current) "ON" else "OFF"}")
}

// v693: Domain Auto Resolve693
internal fun PlayerActivity.showV693DomainAutoResolve693Toggle() {
    val current = BiliClient.prefs.v693domainAutoResolve693
    BiliClient.prefs.v693domainAutoResolve693 = !current
    AppToast.show(this, "Domain Auto Resolve693: ${if (!current) "ON" else "OFF"}")
}

// v693: Download Auto Queue693
internal fun PlayerActivity.showV693DownloadAutoQueue693Toggle() {
    val current = BiliClient.prefs.v693downloadAutoQueue693
    BiliClient.prefs.v693downloadAutoQueue693 = !current
    AppToast.show(this, "Download Auto Queue693: ${if (!current) "ON" else "OFF"}")
}

// v693: Draft Auto Save693
internal fun PlayerActivity.showV693DraftAutoSave693Toggle() {
    val current = BiliClient.prefs.v693draftAutoSave693
    BiliClient.prefs.v693draftAutoSave693 = !current
    AppToast.show(this, "Draft Auto Save693: ${if (!current) "ON" else "OFF"}")
}

// v693: Drag Auto Scroll693
internal fun PlayerActivity.showV693DragAutoScroll693Toggle() {
    val current = BiliClient.prefs.v693dragAutoScroll693
    BiliClient.prefs.v693dragAutoScroll693 = !current
    AppToast.show(this, "Drag Auto Scroll693: ${if (!current) "ON" else "OFF"}")
}

// v693: Draw Auto Antialias693
internal fun PlayerActivity.showV693DrawAutoAntialias693Toggle() {
    val current = BiliClient.prefs.v693drawAutoAntialias693
    BiliClient.prefs.v693drawAutoAntialias693 = !current
    AppToast.show(this, "Draw Auto Antialias693: ${if (!current) "ON" else "OFF"}")
}

// v694: Dirty Auto Flag694
internal fun PlayerActivity.showV694DirtyAutoFlag694Toggle() {
    val current = BiliClient.prefs.v694dirtyAutoFlag694
    BiliClient.prefs.v694dirtyAutoFlag694 = !current
    AppToast.show(this, "Dirty Auto Flag694: ${if (!current) "ON" else "OFF"}")
}

// v694: Disable Auto Toggle694
internal fun PlayerActivity.showV694DisableAutoToggle694Toggle() {
    val current = BiliClient.prefs.v694disableAutoToggle694
    BiliClient.prefs.v694disableAutoToggle694 = !current
    AppToast.show(this, "Disable Auto Toggle694: ${if (!current) "ON" else "OFF"}")
}

// v694: Discard Auto Warn694
internal fun PlayerActivity.showV694DiscardAutoWarn694Toggle() {
    val current = BiliClient.prefs.v694discardAutoWarn694
    BiliClient.prefs.v694discardAutoWarn694 = !current
    AppToast.show(this, "Discard Auto Warn694: ${if (!current) "ON" else "OFF"}")
}

// v694: Discover Auto Scan694
internal fun PlayerActivity.showV694DiscoverAutoScan694Toggle() {
    val current = BiliClient.prefs.v694discoverAutoScan694
    BiliClient.prefs.v694discoverAutoScan694 = !current
    AppToast.show(this, "Discover Auto Scan694: ${if (!current) "ON" else "OFF"}")
}

// v694: Dispatch Auto Event694
internal fun PlayerActivity.showV694DispatchAutoEvent694Toggle() {
    val current = BiliClient.prefs.v694dispatchAutoEvent694
    BiliClient.prefs.v694dispatchAutoEvent694 = !current
    AppToast.show(this, "Dispatch Auto Event694: ${if (!current) "ON" else "OFF"}")
}

// v694: Display Auto Rotate694
internal fun PlayerActivity.showV694DisplayAutoRotate694Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v694displayAutoRotate694).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate694",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v694displayAutoRotate694 = value
        AppToast.show(this, "Display Auto Rotate694: $value")
    }
}

// v694: Dispose Auto Cleanup694
internal fun PlayerActivity.showV694DisposeAutoCleanup694Toggle() {
    val current = BiliClient.prefs.v694disposeAutoCleanup694
    BiliClient.prefs.v694disposeAutoCleanup694 = !current
    AppToast.show(this, "Dispose Auto Cleanup694: ${if (!current) "ON" else "OFF"}")
}

// v694: Dist Auto Calc694
internal fun PlayerActivity.showV694DistAutoCalc694Toggle() {
    val current = BiliClient.prefs.v694distAutoCalc694
    BiliClient.prefs.v694distAutoCalc694 = !current
    AppToast.show(this, "Dist Auto Calc694: ${if (!current) "ON" else "OFF"}")
}

// v694: Divide Auto Split694
internal fun PlayerActivity.showV694DivideAutoSplit694Toggle() {
    val current = BiliClient.prefs.v694divideAutoSplit694
    BiliClient.prefs.v694divideAutoSplit694 = !current
    AppToast.show(this, "Divide Auto Split694: ${if (!current) "ON" else "OFF"}")
}

// v694: Document Auto Save694
internal fun PlayerActivity.showV694DocumentAutoSave694Toggle() {
    val current = BiliClient.prefs.v694documentAutoSave694
    BiliClient.prefs.v694documentAutoSave694 = !current
    AppToast.show(this, "Document Auto Save694: ${if (!current) "ON" else "OFF"}")
}

// v694: Domain Auto Resolve694
internal fun PlayerActivity.showV694DomainAutoResolve694Toggle() {
    val current = BiliClient.prefs.v694domainAutoResolve694
    BiliClient.prefs.v694domainAutoResolve694 = !current
    AppToast.show(this, "Domain Auto Resolve694: ${if (!current) "ON" else "OFF"}")
}

// v694: Download Auto Queue694
internal fun PlayerActivity.showV694DownloadAutoQueue694Toggle() {
    val current = BiliClient.prefs.v694downloadAutoQueue694
    BiliClient.prefs.v694downloadAutoQueue694 = !current
    AppToast.show(this, "Download Auto Queue694: ${if (!current) "ON" else "OFF"}")
}

// v694: Draft Auto Save694
internal fun PlayerActivity.showV694DraftAutoSave694Toggle() {
    val current = BiliClient.prefs.v694draftAutoSave694
    BiliClient.prefs.v694draftAutoSave694 = !current
    AppToast.show(this, "Draft Auto Save694: ${if (!current) "ON" else "OFF"}")
}

// v694: Drag Auto Scroll694
internal fun PlayerActivity.showV694DragAutoScroll694Toggle() {
    val current = BiliClient.prefs.v694dragAutoScroll694
    BiliClient.prefs.v694dragAutoScroll694 = !current
    AppToast.show(this, "Drag Auto Scroll694: ${if (!current) "ON" else "OFF"}")
}

// v694: Draw Auto Antialias694
internal fun PlayerActivity.showV694DrawAutoAntialias694Toggle() {
    val current = BiliClient.prefs.v694drawAutoAntialias694
    BiliClient.prefs.v694drawAutoAntialias694 = !current
    AppToast.show(this, "Draw Auto Antialias694: ${if (!current) "ON" else "OFF"}")
}

// v695: Dirty Auto Flag695
internal fun PlayerActivity.showV695DirtyAutoFlag695Toggle() {
    val current = BiliClient.prefs.v695dirtyAutoFlag695
    BiliClient.prefs.v695dirtyAutoFlag695 = !current
    AppToast.show(this, "Dirty Auto Flag695: ${if (!current) "ON" else "OFF"}")
}

// v695: Disable Auto Toggle695
internal fun PlayerActivity.showV695DisableAutoToggle695Toggle() {
    val current = BiliClient.prefs.v695disableAutoToggle695
    BiliClient.prefs.v695disableAutoToggle695 = !current
    AppToast.show(this, "Disable Auto Toggle695: ${if (!current) "ON" else "OFF"}")
}

// v695: Discard Auto Warn695
internal fun PlayerActivity.showV695DiscardAutoWarn695Toggle() {
    val current = BiliClient.prefs.v695discardAutoWarn695
    BiliClient.prefs.v695discardAutoWarn695 = !current
    AppToast.show(this, "Discard Auto Warn695: ${if (!current) "ON" else "OFF"}")
}

// v695: Discover Auto Scan695
internal fun PlayerActivity.showV695DiscoverAutoScan695Toggle() {
    val current = BiliClient.prefs.v695discoverAutoScan695
    BiliClient.prefs.v695discoverAutoScan695 = !current
    AppToast.show(this, "Discover Auto Scan695: ${if (!current) "ON" else "OFF"}")
}

// v695: Dispatch Auto Event695
internal fun PlayerActivity.showV695DispatchAutoEvent695Toggle() {
    val current = BiliClient.prefs.v695dispatchAutoEvent695
    BiliClient.prefs.v695dispatchAutoEvent695 = !current
    AppToast.show(this, "Dispatch Auto Event695: ${if (!current) "ON" else "OFF"}")
}

// v695: Display Auto Rotate695
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

// v695: Dispose Auto Cleanup695
internal fun PlayerActivity.showV695DisposeAutoCleanup695Toggle() {
    val current = BiliClient.prefs.v695disposeAutoCleanup695
    BiliClient.prefs.v695disposeAutoCleanup695 = !current
    AppToast.show(this, "Dispose Auto Cleanup695: ${if (!current) "ON" else "OFF"}")
}

// v695: Dist Auto Calc695
internal fun PlayerActivity.showV695DistAutoCalc695Toggle() {
    val current = BiliClient.prefs.v695distAutoCalc695
    BiliClient.prefs.v695distAutoCalc695 = !current
    AppToast.show(this, "Dist Auto Calc695: ${if (!current) "ON" else "OFF"}")
}

// v695: Divide Auto Split695
internal fun PlayerActivity.showV695DivideAutoSplit695Toggle() {
    val current = BiliClient.prefs.v695divideAutoSplit695
    BiliClient.prefs.v695divideAutoSplit695 = !current
    AppToast.show(this, "Divide Auto Split695: ${if (!current) "ON" else "OFF"}")
}

// v695: Document Auto Save695
internal fun PlayerActivity.showV695DocumentAutoSave695Toggle() {
    val current = BiliClient.prefs.v695documentAutoSave695
    BiliClient.prefs.v695documentAutoSave695 = !current
    AppToast.show(this, "Document Auto Save695: ${if (!current) "ON" else "OFF"}")
}

// v695: Domain Auto Resolve695
internal fun PlayerActivity.showV695DomainAutoResolve695Toggle() {
    val current = BiliClient.prefs.v695domainAutoResolve695
    BiliClient.prefs.v695domainAutoResolve695 = !current
    AppToast.show(this, "Domain Auto Resolve695: ${if (!current) "ON" else "OFF"}")
}

// v695: Download Auto Queue695
internal fun PlayerActivity.showV695DownloadAutoQueue695Toggle() {
    val current = BiliClient.prefs.v695downloadAutoQueue695
    BiliClient.prefs.v695downloadAutoQueue695 = !current
    AppToast.show(this, "Download Auto Queue695: ${if (!current) "ON" else "OFF"}")
}

// v695: Draft Auto Save695
internal fun PlayerActivity.showV695DraftAutoSave695Toggle() {
    val current = BiliClient.prefs.v695draftAutoSave695
    BiliClient.prefs.v695draftAutoSave695 = !current
    AppToast.show(this, "Draft Auto Save695: ${if (!current) "ON" else "OFF"}")
}

// v695: Drag Auto Scroll695
internal fun PlayerActivity.showV695DragAutoScroll695Toggle() {
    val current = BiliClient.prefs.v695dragAutoScroll695
    BiliClient.prefs.v695dragAutoScroll695 = !current
    AppToast.show(this, "Drag Auto Scroll695: ${if (!current) "ON" else "OFF"}")
}

// v695: Draw Auto Antialias695
internal fun PlayerActivity.showV695DrawAutoAntialias695Toggle() {
    val current = BiliClient.prefs.v695drawAutoAntialias695
    BiliClient.prefs.v695drawAutoAntialias695 = !current
    AppToast.show(this, "Draw Auto Antialias695: ${if (!current) "ON" else "OFF"}")
}

// v696: Dirty Auto Flag696
internal fun PlayerActivity.showV696DirtyAutoFlag696Toggle() {
    val current = BiliClient.prefs.v696dirtyAutoFlag696
    BiliClient.prefs.v696dirtyAutoFlag696 = !current
    AppToast.show(this, "Dirty Auto Flag696: ${if (!current) "ON" else "OFF"}")
}

// v696: Disable Auto Toggle696
internal fun PlayerActivity.showV696DisableAutoToggle696Toggle() {
    val current = BiliClient.prefs.v696disableAutoToggle696
    BiliClient.prefs.v696disableAutoToggle696 = !current
    AppToast.show(this, "Disable Auto Toggle696: ${if (!current) "ON" else "OFF"}")
}

// v696: Discard Auto Warn696
internal fun PlayerActivity.showV696DiscardAutoWarn696Toggle() {
    val current = BiliClient.prefs.v696discardAutoWarn696
    BiliClient.prefs.v696discardAutoWarn696 = !current
    AppToast.show(this, "Discard Auto Warn696: ${if (!current) "ON" else "OFF"}")
}

// v696: Discover Auto Scan696
internal fun PlayerActivity.showV696DiscoverAutoScan696Toggle() {
    val current = BiliClient.prefs.v696discoverAutoScan696
    BiliClient.prefs.v696discoverAutoScan696 = !current
    AppToast.show(this, "Discover Auto Scan696: ${if (!current) "ON" else "OFF"}")
}

// v696: Dispatch Auto Event696
internal fun PlayerActivity.showV696DispatchAutoEvent696Toggle() {
    val current = BiliClient.prefs.v696dispatchAutoEvent696
    BiliClient.prefs.v696dispatchAutoEvent696 = !current
    AppToast.show(this, "Dispatch Auto Event696: ${if (!current) "ON" else "OFF"}")
}

// v696: Display Auto Rotate696
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

// v696: Dispose Auto Cleanup696
internal fun PlayerActivity.showV696DisposeAutoCleanup696Toggle() {
    val current = BiliClient.prefs.v696disposeAutoCleanup696
    BiliClient.prefs.v696disposeAutoCleanup696 = !current
    AppToast.show(this, "Dispose Auto Cleanup696: ${if (!current) "ON" else "OFF"}")
}

// v696: Dist Auto Calc696
internal fun PlayerActivity.showV696DistAutoCalc696Toggle() {
    val current = BiliClient.prefs.v696distAutoCalc696
    BiliClient.prefs.v696distAutoCalc696 = !current
    AppToast.show(this, "Dist Auto Calc696: ${if (!current) "ON" else "OFF"}")
}

// v696: Divide Auto Split696
internal fun PlayerActivity.showV696DivideAutoSplit696Toggle() {
    val current = BiliClient.prefs.v696divideAutoSplit696
    BiliClient.prefs.v696divideAutoSplit696 = !current
    AppToast.show(this, "Divide Auto Split696: ${if (!current) "ON" else "OFF"}")
}

// v696: Document Auto Save696
internal fun PlayerActivity.showV696DocumentAutoSave696Toggle() {
    val current = BiliClient.prefs.v696documentAutoSave696
    BiliClient.prefs.v696documentAutoSave696 = !current
    AppToast.show(this, "Document Auto Save696: ${if (!current) "ON" else "OFF"}")
}

// v696: Domain Auto Resolve696
internal fun PlayerActivity.showV696DomainAutoResolve696Toggle() {
    val current = BiliClient.prefs.v696domainAutoResolve696
    BiliClient.prefs.v696domainAutoResolve696 = !current
    AppToast.show(this, "Domain Auto Resolve696: ${if (!current) "ON" else "OFF"}")
}

// v696: Download Auto Queue696
internal fun PlayerActivity.showV696DownloadAutoQueue696Toggle() {
    val current = BiliClient.prefs.v696downloadAutoQueue696
    BiliClient.prefs.v696downloadAutoQueue696 = !current
    AppToast.show(this, "Download Auto Queue696: ${if (!current) "ON" else "OFF"}")
}

// v696: Draft Auto Save696
internal fun PlayerActivity.showV696DraftAutoSave696Toggle() {
    val current = BiliClient.prefs.v696draftAutoSave696
    BiliClient.prefs.v696draftAutoSave696 = !current
    AppToast.show(this, "Draft Auto Save696: ${if (!current) "ON" else "OFF"}")
}

// v696: Drag Auto Scroll696
internal fun PlayerActivity.showV696DragAutoScroll696Toggle() {
    val current = BiliClient.prefs.v696dragAutoScroll696
    BiliClient.prefs.v696dragAutoScroll696 = !current
    AppToast.show(this, "Drag Auto Scroll696: ${if (!current) "ON" else "OFF"}")
}

// v696: Draw Auto Antialias696
internal fun PlayerActivity.showV696DrawAutoAntialias696Toggle() {
    val current = BiliClient.prefs.v696drawAutoAntialias696
    BiliClient.prefs.v696drawAutoAntialias696 = !current
    AppToast.show(this, "Draw Auto Antialias696: ${if (!current) "ON" else "OFF"}")
}

// v697: Dirty Auto Flag697
internal fun PlayerActivity.showV697DirtyAutoFlag697Toggle() {
    val current = BiliClient.prefs.v697dirtyAutoFlag697
    BiliClient.prefs.v697dirtyAutoFlag697 = !current
    AppToast.show(this, "Dirty Auto Flag697: ${if (!current) "ON" else "OFF"}")
}

// v697: Disable Auto Toggle697
internal fun PlayerActivity.showV697DisableAutoToggle697Toggle() {
    val current = BiliClient.prefs.v697disableAutoToggle697
    BiliClient.prefs.v697disableAutoToggle697 = !current
    AppToast.show(this, "Disable Auto Toggle697: ${if (!current) "ON" else "OFF"}")
}

// v697: Discard Auto Warn697
internal fun PlayerActivity.showV697DiscardAutoWarn697Toggle() {
    val current = BiliClient.prefs.v697discardAutoWarn697
    BiliClient.prefs.v697discardAutoWarn697 = !current
    AppToast.show(this, "Discard Auto Warn697: ${if (!current) "ON" else "OFF"}")
}

// v697: Discover Auto Scan697
internal fun PlayerActivity.showV697DiscoverAutoScan697Toggle() {
    val current = BiliClient.prefs.v697discoverAutoScan697
    BiliClient.prefs.v697discoverAutoScan697 = !current
    AppToast.show(this, "Discover Auto Scan697: ${if (!current) "ON" else "OFF"}")
}

// v697: Dispatch Auto Event697
internal fun PlayerActivity.showV697DispatchAutoEvent697Toggle() {
    val current = BiliClient.prefs.v697dispatchAutoEvent697
    BiliClient.prefs.v697dispatchAutoEvent697 = !current
    AppToast.show(this, "Dispatch Auto Event697: ${if (!current) "ON" else "OFF"}")
}

// v697: Display Auto Rotate697
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

// v697: Dispose Auto Cleanup697
internal fun PlayerActivity.showV697DisposeAutoCleanup697Toggle() {
    val current = BiliClient.prefs.v697disposeAutoCleanup697
    BiliClient.prefs.v697disposeAutoCleanup697 = !current
    AppToast.show(this, "Dispose Auto Cleanup697: ${if (!current) "ON" else "OFF"}")
}

// v697: Dist Auto Calc697
internal fun PlayerActivity.showV697DistAutoCalc697Toggle() {
    val current = BiliClient.prefs.v697distAutoCalc697
    BiliClient.prefs.v697distAutoCalc697 = !current
    AppToast.show(this, "Dist Auto Calc697: ${if (!current) "ON" else "OFF"}")
}

// v697: Divide Auto Split697
internal fun PlayerActivity.showV697DivideAutoSplit697Toggle() {
    val current = BiliClient.prefs.v697divideAutoSplit697
    BiliClient.prefs.v697divideAutoSplit697 = !current
    AppToast.show(this, "Divide Auto Split697: ${if (!current) "ON" else "OFF"}")
}

// v697: Document Auto Save697
internal fun PlayerActivity.showV697DocumentAutoSave697Toggle() {
    val current = BiliClient.prefs.v697documentAutoSave697
    BiliClient.prefs.v697documentAutoSave697 = !current
    AppToast.show(this, "Document Auto Save697: ${if (!current) "ON" else "OFF"}")
}

// v697: Domain Auto Resolve697
internal fun PlayerActivity.showV697DomainAutoResolve697Toggle() {
    val current = BiliClient.prefs.v697domainAutoResolve697
    BiliClient.prefs.v697domainAutoResolve697 = !current
    AppToast.show(this, "Domain Auto Resolve697: ${if (!current) "ON" else "OFF"}")
}

// v697: Download Auto Queue697
internal fun PlayerActivity.showV697DownloadAutoQueue697Toggle() {
    val current = BiliClient.prefs.v697downloadAutoQueue697
    BiliClient.prefs.v697downloadAutoQueue697 = !current
    AppToast.show(this, "Download Auto Queue697: ${if (!current) "ON" else "OFF"}")
}

// v697: Draft Auto Save697
internal fun PlayerActivity.showV697DraftAutoSave697Toggle() {
    val current = BiliClient.prefs.v697draftAutoSave697
    BiliClient.prefs.v697draftAutoSave697 = !current
    AppToast.show(this, "Draft Auto Save697: ${if (!current) "ON" else "OFF"}")
}

// v697: Drag Auto Scroll697
internal fun PlayerActivity.showV697DragAutoScroll697Toggle() {
    val current = BiliClient.prefs.v697dragAutoScroll697
    BiliClient.prefs.v697dragAutoScroll697 = !current
    AppToast.show(this, "Drag Auto Scroll697: ${if (!current) "ON" else "OFF"}")
}

// v697: Draw Auto Antialias697
internal fun PlayerActivity.showV697DrawAutoAntialias697Toggle() {
    val current = BiliClient.prefs.v697drawAutoAntialias697
    BiliClient.prefs.v697drawAutoAntialias697 = !current
    AppToast.show(this, "Draw Auto Antialias697: ${if (!current) "ON" else "OFF"}")
}

// v698: Dirty Auto Flag698
internal fun PlayerActivity.showV698DirtyAutoFlag698Toggle() {
    val current = BiliClient.prefs.v698dirtyAutoFlag698
    BiliClient.prefs.v698dirtyAutoFlag698 = !current
    AppToast.show(this, "Dirty Auto Flag698: ${if (!current) "ON" else "OFF"}")
}

// v698: Disable Auto Toggle698
internal fun PlayerActivity.showV698DisableAutoToggle698Toggle() {
    val current = BiliClient.prefs.v698disableAutoToggle698
    BiliClient.prefs.v698disableAutoToggle698 = !current
    AppToast.show(this, "Disable Auto Toggle698: ${if (!current) "ON" else "OFF"}")
}

// v698: Discard Auto Warn698
internal fun PlayerActivity.showV698DiscardAutoWarn698Toggle() {
    val current = BiliClient.prefs.v698discardAutoWarn698
    BiliClient.prefs.v698discardAutoWarn698 = !current
    AppToast.show(this, "Discard Auto Warn698: ${if (!current) "ON" else "OFF"}")
}

// v698: Discover Auto Scan698
internal fun PlayerActivity.showV698DiscoverAutoScan698Toggle() {
    val current = BiliClient.prefs.v698discoverAutoScan698
    BiliClient.prefs.v698discoverAutoScan698 = !current
    AppToast.show(this, "Discover Auto Scan698: ${if (!current) "ON" else "OFF"}")
}

// v698: Dispatch Auto Event698
internal fun PlayerActivity.showV698DispatchAutoEvent698Toggle() {
    val current = BiliClient.prefs.v698dispatchAutoEvent698
    BiliClient.prefs.v698dispatchAutoEvent698 = !current
    AppToast.show(this, "Dispatch Auto Event698: ${if (!current) "ON" else "OFF"}")
}

// v698: Display Auto Rotate698
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

// v698: Dispose Auto Cleanup698
internal fun PlayerActivity.showV698DisposeAutoCleanup698Toggle() {
    val current = BiliClient.prefs.v698disposeAutoCleanup698
    BiliClient.prefs.v698disposeAutoCleanup698 = !current
    AppToast.show(this, "Dispose Auto Cleanup698: ${if (!current) "ON" else "OFF"}")
}

// v698: Dist Auto Calc698
internal fun PlayerActivity.showV698DistAutoCalc698Toggle() {
    val current = BiliClient.prefs.v698distAutoCalc698
    BiliClient.prefs.v698distAutoCalc698 = !current
    AppToast.show(this, "Dist Auto Calc698: ${if (!current) "ON" else "OFF"}")
}

// v698: Divide Auto Split698
internal fun PlayerActivity.showV698DivideAutoSplit698Toggle() {
    val current = BiliClient.prefs.v698divideAutoSplit698
    BiliClient.prefs.v698divideAutoSplit698 = !current
    AppToast.show(this, "Divide Auto Split698: ${if (!current) "ON" else "OFF"}")
}

// v698: Document Auto Save698
internal fun PlayerActivity.showV698DocumentAutoSave698Toggle() {
    val current = BiliClient.prefs.v698documentAutoSave698
    BiliClient.prefs.v698documentAutoSave698 = !current
    AppToast.show(this, "Document Auto Save698: ${if (!current) "ON" else "OFF"}")
}

// v698: Domain Auto Resolve698
internal fun PlayerActivity.showV698DomainAutoResolve698Toggle() {
    val current = BiliClient.prefs.v698domainAutoResolve698
    BiliClient.prefs.v698domainAutoResolve698 = !current
    AppToast.show(this, "Domain Auto Resolve698: ${if (!current) "ON" else "OFF"}")
}

// v698: Download Auto Queue698
internal fun PlayerActivity.showV698DownloadAutoQueue698Toggle() {
    val current = BiliClient.prefs.v698downloadAutoQueue698
    BiliClient.prefs.v698downloadAutoQueue698 = !current
    AppToast.show(this, "Download Auto Queue698: ${if (!current) "ON" else "OFF"}")
}

// v698: Draft Auto Save698
internal fun PlayerActivity.showV698DraftAutoSave698Toggle() {
    val current = BiliClient.prefs.v698draftAutoSave698
    BiliClient.prefs.v698draftAutoSave698 = !current
    AppToast.show(this, "Draft Auto Save698: ${if (!current) "ON" else "OFF"}")
}

// v698: Drag Auto Scroll698
internal fun PlayerActivity.showV698DragAutoScroll698Toggle() {
    val current = BiliClient.prefs.v698dragAutoScroll698
    BiliClient.prefs.v698dragAutoScroll698 = !current
    AppToast.show(this, "Drag Auto Scroll698: ${if (!current) "ON" else "OFF"}")
}

// v698: Draw Auto Antialias698
internal fun PlayerActivity.showV698DrawAutoAntialias698Toggle() {
    val current = BiliClient.prefs.v698drawAutoAntialias698
    BiliClient.prefs.v698drawAutoAntialias698 = !current
    AppToast.show(this, "Draw Auto Antialias698: ${if (!current) "ON" else "OFF"}")
}

// v699: Dirty Auto Flag699
internal fun PlayerActivity.showV699DirtyAutoFlag699Toggle() {
    val current = BiliClient.prefs.v699dirtyAutoFlag699
    BiliClient.prefs.v699dirtyAutoFlag699 = !current
    AppToast.show(this, "Dirty Auto Flag699: ${if (!current) "ON" else "OFF"}")
}

// v699: Disable Auto Toggle699
internal fun PlayerActivity.showV699DisableAutoToggle699Toggle() {
    val current = BiliClient.prefs.v699disableAutoToggle699
    BiliClient.prefs.v699disableAutoToggle699 = !current
    AppToast.show(this, "Disable Auto Toggle699: ${if (!current) "ON" else "OFF"}")
}

// v699: Discard Auto Warn699
internal fun PlayerActivity.showV699DiscardAutoWarn699Toggle() {
    val current = BiliClient.prefs.v699discardAutoWarn699
    BiliClient.prefs.v699discardAutoWarn699 = !current
    AppToast.show(this, "Discard Auto Warn699: ${if (!current) "ON" else "OFF"}")
}

// v699: Discover Auto Scan699
internal fun PlayerActivity.showV699DiscoverAutoScan699Toggle() {
    val current = BiliClient.prefs.v699discoverAutoScan699
    BiliClient.prefs.v699discoverAutoScan699 = !current
    AppToast.show(this, "Discover Auto Scan699: ${if (!current) "ON" else "OFF"}")
}

// v699: Dispatch Auto Event699
internal fun PlayerActivity.showV699DispatchAutoEvent699Toggle() {
    val current = BiliClient.prefs.v699dispatchAutoEvent699
    BiliClient.prefs.v699dispatchAutoEvent699 = !current
    AppToast.show(this, "Dispatch Auto Event699: ${if (!current) "ON" else "OFF"}")
}

// v699: Display Auto Rotate699
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

// v699: Dispose Auto Cleanup699
internal fun PlayerActivity.showV699DisposeAutoCleanup699Toggle() {
    val current = BiliClient.prefs.v699disposeAutoCleanup699
    BiliClient.prefs.v699disposeAutoCleanup699 = !current
    AppToast.show(this, "Dispose Auto Cleanup699: ${if (!current) "ON" else "OFF"}")
}

// v699: Dist Auto Calc699
internal fun PlayerActivity.showV699DistAutoCalc699Toggle() {
    val current = BiliClient.prefs.v699distAutoCalc699
    BiliClient.prefs.v699distAutoCalc699 = !current
    AppToast.show(this, "Dist Auto Calc699: ${if (!current) "ON" else "OFF"}")
}

// v699: Divide Auto Split699
internal fun PlayerActivity.showV699DivideAutoSplit699Toggle() {
    val current = BiliClient.prefs.v699divideAutoSplit699
    BiliClient.prefs.v699divideAutoSplit699 = !current
    AppToast.show(this, "Divide Auto Split699: ${if (!current) "ON" else "OFF"}")
}

// v699: Document Auto Save699
internal fun PlayerActivity.showV699DocumentAutoSave699Toggle() {
    val current = BiliClient.prefs.v699documentAutoSave699
    BiliClient.prefs.v699documentAutoSave699 = !current
    AppToast.show(this, "Document Auto Save699: ${if (!current) "ON" else "OFF"}")
}

// v699: Domain Auto Resolve699
internal fun PlayerActivity.showV699DomainAutoResolve699Toggle() {
    val current = BiliClient.prefs.v699domainAutoResolve699
    BiliClient.prefs.v699domainAutoResolve699 = !current
    AppToast.show(this, "Domain Auto Resolve699: ${if (!current) "ON" else "OFF"}")
}

// v699: Download Auto Queue699
internal fun PlayerActivity.showV699DownloadAutoQueue699Toggle() {
    val current = BiliClient.prefs.v699downloadAutoQueue699
    BiliClient.prefs.v699downloadAutoQueue699 = !current
    AppToast.show(this, "Download Auto Queue699: ${if (!current) "ON" else "OFF"}")
}

// v699: Draft Auto Save699
internal fun PlayerActivity.showV699DraftAutoSave699Toggle() {
    val current = BiliClient.prefs.v699draftAutoSave699
    BiliClient.prefs.v699draftAutoSave699 = !current
    AppToast.show(this, "Draft Auto Save699: ${if (!current) "ON" else "OFF"}")
}

// v699: Drag Auto Scroll699
internal fun PlayerActivity.showV699DragAutoScroll699Toggle() {
    val current = BiliClient.prefs.v699dragAutoScroll699
    BiliClient.prefs.v699dragAutoScroll699 = !current
    AppToast.show(this, "Drag Auto Scroll699: ${if (!current) "ON" else "OFF"}")
}

// v699: Draw Auto Antialias699
internal fun PlayerActivity.showV699DrawAutoAntialias699Toggle() {
    val current = BiliClient.prefs.v699drawAutoAntialias699
    BiliClient.prefs.v699drawAutoAntialias699 = !current
    AppToast.show(this, "Draw Auto Antialias699: ${if (!current) "ON" else "OFF"}")
}

// v700: Dirty Auto Flag700
internal fun PlayerActivity.showV700DirtyAutoFlag700Toggle() {
    val current = BiliClient.prefs.v700dirtyAutoFlag700
    BiliClient.prefs.v700dirtyAutoFlag700 = !current
    AppToast.show(this, "Dirty Auto Flag700: ${if (!current) "ON" else "OFF"}")
}

// v700: Disable Auto Toggle700
internal fun PlayerActivity.showV700DisableAutoToggle700Toggle() {
    val current = BiliClient.prefs.v700disableAutoToggle700
    BiliClient.prefs.v700disableAutoToggle700 = !current
    AppToast.show(this, "Disable Auto Toggle700: ${if (!current) "ON" else "OFF"}")
}

// v700: Discard Auto Warn700
internal fun PlayerActivity.showV700DiscardAutoWarn700Toggle() {
    val current = BiliClient.prefs.v700discardAutoWarn700
    BiliClient.prefs.v700discardAutoWarn700 = !current
    AppToast.show(this, "Discard Auto Warn700: ${if (!current) "ON" else "OFF"}")
}

// v700: Discover Auto Scan700
internal fun PlayerActivity.showV700DiscoverAutoScan700Toggle() {
    val current = BiliClient.prefs.v700discoverAutoScan700
    BiliClient.prefs.v700discoverAutoScan700 = !current
    AppToast.show(this, "Discover Auto Scan700: ${if (!current) "ON" else "OFF"}")
}

// v700: Dispatch Auto Event700
internal fun PlayerActivity.showV700DispatchAutoEvent700Toggle() {
    val current = BiliClient.prefs.v700dispatchAutoEvent700
    BiliClient.prefs.v700dispatchAutoEvent700 = !current
    AppToast.show(this, "Dispatch Auto Event700: ${if (!current) "ON" else "OFF"}")
}

// v700: Display Auto Rotate700
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

// v700: Dispose Auto Cleanup700
internal fun PlayerActivity.showV700DisposeAutoCleanup700Toggle() {
    val current = BiliClient.prefs.v700disposeAutoCleanup700
    BiliClient.prefs.v700disposeAutoCleanup700 = !current
    AppToast.show(this, "Dispose Auto Cleanup700: ${if (!current) "ON" else "OFF"}")
}

// v700: Dist Auto Calc700
internal fun PlayerActivity.showV700DistAutoCalc700Toggle() {
    val current = BiliClient.prefs.v700distAutoCalc700
    BiliClient.prefs.v700distAutoCalc700 = !current
    AppToast.show(this, "Dist Auto Calc700: ${if (!current) "ON" else "OFF"}")
}

// v700: Divide Auto Split700
internal fun PlayerActivity.showV700DivideAutoSplit700Toggle() {
    val current = BiliClient.prefs.v700divideAutoSplit700
    BiliClient.prefs.v700divideAutoSplit700 = !current
    AppToast.show(this, "Divide Auto Split700: ${if (!current) "ON" else "OFF"}")
}

// v700: Document Auto Save700
internal fun PlayerActivity.showV700DocumentAutoSave700Toggle() {
    val current = BiliClient.prefs.v700documentAutoSave700
    BiliClient.prefs.v700documentAutoSave700 = !current
    AppToast.show(this, "Document Auto Save700: ${if (!current) "ON" else "OFF"}")
}

// v700: Domain Auto Resolve700
internal fun PlayerActivity.showV700DomainAutoResolve700Toggle() {
    val current = BiliClient.prefs.v700domainAutoResolve700
    BiliClient.prefs.v700domainAutoResolve700 = !current
    AppToast.show(this, "Domain Auto Resolve700: ${if (!current) "ON" else "OFF"}")
}

// v700: Download Auto Queue700
internal fun PlayerActivity.showV700DownloadAutoQueue700Toggle() {
    val current = BiliClient.prefs.v700downloadAutoQueue700
    BiliClient.prefs.v700downloadAutoQueue700 = !current
    AppToast.show(this, "Download Auto Queue700: ${if (!current) "ON" else "OFF"}")
}

// v700: Draft Auto Save700
internal fun PlayerActivity.showV700DraftAutoSave700Toggle() {
    val current = BiliClient.prefs.v700draftAutoSave700
    BiliClient.prefs.v700draftAutoSave700 = !current
    AppToast.show(this, "Draft Auto Save700: ${if (!current) "ON" else "OFF"}")
}

// v700: Drag Auto Scroll700
internal fun PlayerActivity.showV700DragAutoScroll700Toggle() {
    val current = BiliClient.prefs.v700dragAutoScroll700
    BiliClient.prefs.v700dragAutoScroll700 = !current
    AppToast.show(this, "Drag Auto Scroll700: ${if (!current) "ON" else "OFF"}")
}

// v700: Draw Auto Antialias700
internal fun PlayerActivity.showV700DrawAutoAntialias700Toggle() {
    val current = BiliClient.prefs.v700drawAutoAntialias700
    BiliClient.prefs.v700drawAutoAntialias700 = !current
    AppToast.show(this, "Draw Auto Antialias700: ${if (!current) "ON" else "OFF"}")
}

