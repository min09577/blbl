package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

// v711: batch mode
internal fun PlayerActivity.showV711BatchToggle() {
    val current = FeaturePrefsStore.batch711.v711batch
    FeaturePrefsStore.batch711.v711batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v711: beacon mode
internal fun PlayerActivity.showV711BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v711beacon
    FeaturePrefsStore.batch711.v711beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v711: beam mode
internal fun PlayerActivity.showV711BeamToggle() {
    val current = FeaturePrefsStore.batch711.v711beam
    FeaturePrefsStore.batch711.v711beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v711: before mode
internal fun PlayerActivity.showV711BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v711before
    FeaturePrefsStore.batch711.v711before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v711: begin mode
internal fun PlayerActivity.showV711BeginToggle() {
    val current = FeaturePrefsStore.batch711.v711begin
    FeaturePrefsStore.batch711.v711begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v711: behavior level
internal fun PlayerActivity.showV711BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v711: benchmark level
internal fun PlayerActivity.showV711BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v711: beta level
internal fun PlayerActivity.showV711BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v711: binary level
internal fun PlayerActivity.showV711BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v711: bind level
internal fun PlayerActivity.showV711BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v711: bitmap setting
internal fun PlayerActivity.showV711BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v711bitmap
    FeaturePrefsStore.batch711.v711bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v711: blank setting
internal fun PlayerActivity.showV711BlankToggle() {
    val current = FeaturePrefsStore.batch711.v711blank
    FeaturePrefsStore.batch711.v711blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v711: blend setting
internal fun PlayerActivity.showV711BlendToggle() {
    val current = FeaturePrefsStore.batch711.v711blend
    FeaturePrefsStore.batch711.v711blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v711: block setting
internal fun PlayerActivity.showV711BlockToggle() {
    val current = FeaturePrefsStore.batch711.v711block
    FeaturePrefsStore.batch711.v711block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v711: boolean setting
internal fun PlayerActivity.showV711BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v711boolean
    FeaturePrefsStore.batch711.v711boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v712: batch mode
internal fun PlayerActivity.showV712BatchToggle() {
    val current = FeaturePrefsStore.batch711.v712batch
    FeaturePrefsStore.batch711.v712batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v712: beacon mode
internal fun PlayerActivity.showV712BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v712beacon
    FeaturePrefsStore.batch711.v712beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v712: beam mode
internal fun PlayerActivity.showV712BeamToggle() {
    val current = FeaturePrefsStore.batch711.v712beam
    FeaturePrefsStore.batch711.v712beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v712: before mode
internal fun PlayerActivity.showV712BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v712before
    FeaturePrefsStore.batch711.v712before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v712: begin mode
internal fun PlayerActivity.showV712BeginToggle() {
    val current = FeaturePrefsStore.batch711.v712begin
    FeaturePrefsStore.batch711.v712begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v712: behavior level
internal fun PlayerActivity.showV712BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v712: benchmark level
internal fun PlayerActivity.showV712BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v712: beta level
internal fun PlayerActivity.showV712BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v712: binary level
internal fun PlayerActivity.showV712BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v712: bind level
internal fun PlayerActivity.showV712BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v712: bitmap setting
internal fun PlayerActivity.showV712BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v712bitmap
    FeaturePrefsStore.batch711.v712bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v712: blank setting
internal fun PlayerActivity.showV712BlankToggle() {
    val current = FeaturePrefsStore.batch711.v712blank
    FeaturePrefsStore.batch711.v712blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v712: blend setting
internal fun PlayerActivity.showV712BlendToggle() {
    val current = FeaturePrefsStore.batch711.v712blend
    FeaturePrefsStore.batch711.v712blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v712: block setting
internal fun PlayerActivity.showV712BlockToggle() {
    val current = FeaturePrefsStore.batch711.v712block
    FeaturePrefsStore.batch711.v712block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v712: boolean setting
internal fun PlayerActivity.showV712BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v712boolean
    FeaturePrefsStore.batch711.v712boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v713: batch mode
internal fun PlayerActivity.showV713BatchToggle() {
    val current = FeaturePrefsStore.batch711.v713batch
    FeaturePrefsStore.batch711.v713batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v713: beacon mode
internal fun PlayerActivity.showV713BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v713beacon
    FeaturePrefsStore.batch711.v713beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v713: beam mode
internal fun PlayerActivity.showV713BeamToggle() {
    val current = FeaturePrefsStore.batch711.v713beam
    FeaturePrefsStore.batch711.v713beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v713: before mode
internal fun PlayerActivity.showV713BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v713before
    FeaturePrefsStore.batch711.v713before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v713: begin mode
internal fun PlayerActivity.showV713BeginToggle() {
    val current = FeaturePrefsStore.batch711.v713begin
    FeaturePrefsStore.batch711.v713begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v713: behavior level
internal fun PlayerActivity.showV713BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v713: benchmark level
internal fun PlayerActivity.showV713BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v713: beta level
internal fun PlayerActivity.showV713BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v713: binary level
internal fun PlayerActivity.showV713BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v713: bind level
internal fun PlayerActivity.showV713BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v713: bitmap setting
internal fun PlayerActivity.showV713BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v713bitmap
    FeaturePrefsStore.batch711.v713bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v713: blank setting
internal fun PlayerActivity.showV713BlankToggle() {
    val current = FeaturePrefsStore.batch711.v713blank
    FeaturePrefsStore.batch711.v713blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v713: blend setting
internal fun PlayerActivity.showV713BlendToggle() {
    val current = FeaturePrefsStore.batch711.v713blend
    FeaturePrefsStore.batch711.v713blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v713: block setting
internal fun PlayerActivity.showV713BlockToggle() {
    val current = FeaturePrefsStore.batch711.v713block
    FeaturePrefsStore.batch711.v713block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v713: boolean setting
internal fun PlayerActivity.showV713BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v713boolean
    FeaturePrefsStore.batch711.v713boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v714: batch mode
internal fun PlayerActivity.showV714BatchToggle() {
    val current = FeaturePrefsStore.batch711.v714batch
    FeaturePrefsStore.batch711.v714batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v714: beacon mode
internal fun PlayerActivity.showV714BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v714beacon
    FeaturePrefsStore.batch711.v714beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v714: beam mode
internal fun PlayerActivity.showV714BeamToggle() {
    val current = FeaturePrefsStore.batch711.v714beam
    FeaturePrefsStore.batch711.v714beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v714: before mode
internal fun PlayerActivity.showV714BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v714before
    FeaturePrefsStore.batch711.v714before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v714: begin mode
internal fun PlayerActivity.showV714BeginToggle() {
    val current = FeaturePrefsStore.batch711.v714begin
    FeaturePrefsStore.batch711.v714begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v714: behavior level
internal fun PlayerActivity.showV714BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v714: benchmark level
internal fun PlayerActivity.showV714BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v714: beta level
internal fun PlayerActivity.showV714BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v714: binary level
internal fun PlayerActivity.showV714BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v714: bind level
internal fun PlayerActivity.showV714BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v714: bitmap setting
internal fun PlayerActivity.showV714BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v714bitmap
    FeaturePrefsStore.batch711.v714bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v714: blank setting
internal fun PlayerActivity.showV714BlankToggle() {
    val current = FeaturePrefsStore.batch711.v714blank
    FeaturePrefsStore.batch711.v714blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v714: blend setting
internal fun PlayerActivity.showV714BlendToggle() {
    val current = FeaturePrefsStore.batch711.v714blend
    FeaturePrefsStore.batch711.v714blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v714: block setting
internal fun PlayerActivity.showV714BlockToggle() {
    val current = FeaturePrefsStore.batch711.v714block
    FeaturePrefsStore.batch711.v714block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v714: boolean setting
internal fun PlayerActivity.showV714BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v714boolean
    FeaturePrefsStore.batch711.v714boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v715: batch mode
internal fun PlayerActivity.showV715BatchToggle() {
    val current = FeaturePrefsStore.batch711.v715batch
    FeaturePrefsStore.batch711.v715batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v715: beacon mode
internal fun PlayerActivity.showV715BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v715beacon
    FeaturePrefsStore.batch711.v715beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v715: beam mode
internal fun PlayerActivity.showV715BeamToggle() {
    val current = FeaturePrefsStore.batch711.v715beam
    FeaturePrefsStore.batch711.v715beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v715: before mode
internal fun PlayerActivity.showV715BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v715before
    FeaturePrefsStore.batch711.v715before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v715: begin mode
internal fun PlayerActivity.showV715BeginToggle() {
    val current = FeaturePrefsStore.batch711.v715begin
    FeaturePrefsStore.batch711.v715begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v715: behavior level
internal fun PlayerActivity.showV715BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v715: benchmark level
internal fun PlayerActivity.showV715BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v715: beta level
internal fun PlayerActivity.showV715BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v715: binary level
internal fun PlayerActivity.showV715BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v715: bind level
internal fun PlayerActivity.showV715BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v715: bitmap setting
internal fun PlayerActivity.showV715BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v715bitmap
    FeaturePrefsStore.batch711.v715bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v715: blank setting
internal fun PlayerActivity.showV715BlankToggle() {
    val current = FeaturePrefsStore.batch711.v715blank
    FeaturePrefsStore.batch711.v715blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v715: blend setting
internal fun PlayerActivity.showV715BlendToggle() {
    val current = FeaturePrefsStore.batch711.v715blend
    FeaturePrefsStore.batch711.v715blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v715: block setting
internal fun PlayerActivity.showV715BlockToggle() {
    val current = FeaturePrefsStore.batch711.v715block
    FeaturePrefsStore.batch711.v715block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v715: boolean setting
internal fun PlayerActivity.showV715BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v715boolean
    FeaturePrefsStore.batch711.v715boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v716: batch mode
internal fun PlayerActivity.showV716BatchToggle() {
    val current = FeaturePrefsStore.batch711.v716batch
    FeaturePrefsStore.batch711.v716batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v716: beacon mode
internal fun PlayerActivity.showV716BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v716beacon
    FeaturePrefsStore.batch711.v716beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v716: beam mode
internal fun PlayerActivity.showV716BeamToggle() {
    val current = FeaturePrefsStore.batch711.v716beam
    FeaturePrefsStore.batch711.v716beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v716: before mode
internal fun PlayerActivity.showV716BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v716before
    FeaturePrefsStore.batch711.v716before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v716: begin mode
internal fun PlayerActivity.showV716BeginToggle() {
    val current = FeaturePrefsStore.batch711.v716begin
    FeaturePrefsStore.batch711.v716begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v716: behavior level
internal fun PlayerActivity.showV716BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v716: benchmark level
internal fun PlayerActivity.showV716BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v716: beta level
internal fun PlayerActivity.showV716BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v716: binary level
internal fun PlayerActivity.showV716BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v716: bind level
internal fun PlayerActivity.showV716BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v716: bitmap setting
internal fun PlayerActivity.showV716BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v716bitmap
    FeaturePrefsStore.batch711.v716bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v716: blank setting
internal fun PlayerActivity.showV716BlankToggle() {
    val current = FeaturePrefsStore.batch711.v716blank
    FeaturePrefsStore.batch711.v716blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v716: blend setting
internal fun PlayerActivity.showV716BlendToggle() {
    val current = FeaturePrefsStore.batch711.v716blend
    FeaturePrefsStore.batch711.v716blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v716: block setting
internal fun PlayerActivity.showV716BlockToggle() {
    val current = FeaturePrefsStore.batch711.v716block
    FeaturePrefsStore.batch711.v716block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v716: boolean setting
internal fun PlayerActivity.showV716BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v716boolean
    FeaturePrefsStore.batch711.v716boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v717: batch mode
internal fun PlayerActivity.showV717BatchToggle() {
    val current = FeaturePrefsStore.batch711.v717batch
    FeaturePrefsStore.batch711.v717batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v717: beacon mode
internal fun PlayerActivity.showV717BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v717beacon
    FeaturePrefsStore.batch711.v717beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v717: beam mode
internal fun PlayerActivity.showV717BeamToggle() {
    val current = FeaturePrefsStore.batch711.v717beam
    FeaturePrefsStore.batch711.v717beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v717: before mode
internal fun PlayerActivity.showV717BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v717before
    FeaturePrefsStore.batch711.v717before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v717: begin mode
internal fun PlayerActivity.showV717BeginToggle() {
    val current = FeaturePrefsStore.batch711.v717begin
    FeaturePrefsStore.batch711.v717begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v717: behavior level
internal fun PlayerActivity.showV717BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v717: benchmark level
internal fun PlayerActivity.showV717BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v717: beta level
internal fun PlayerActivity.showV717BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v717: binary level
internal fun PlayerActivity.showV717BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v717: bind level
internal fun PlayerActivity.showV717BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v717: bitmap setting
internal fun PlayerActivity.showV717BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v717bitmap
    FeaturePrefsStore.batch711.v717bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v717: blank setting
internal fun PlayerActivity.showV717BlankToggle() {
    val current = FeaturePrefsStore.batch711.v717blank
    FeaturePrefsStore.batch711.v717blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v717: blend setting
internal fun PlayerActivity.showV717BlendToggle() {
    val current = FeaturePrefsStore.batch711.v717blend
    FeaturePrefsStore.batch711.v717blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v717: block setting
internal fun PlayerActivity.showV717BlockToggle() {
    val current = FeaturePrefsStore.batch711.v717block
    FeaturePrefsStore.batch711.v717block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v717: boolean setting
internal fun PlayerActivity.showV717BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v717boolean
    FeaturePrefsStore.batch711.v717boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v718: batch mode
internal fun PlayerActivity.showV718BatchToggle() {
    val current = FeaturePrefsStore.batch711.v718batch
    FeaturePrefsStore.batch711.v718batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v718: beacon mode
internal fun PlayerActivity.showV718BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v718beacon
    FeaturePrefsStore.batch711.v718beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v718: beam mode
internal fun PlayerActivity.showV718BeamToggle() {
    val current = FeaturePrefsStore.batch711.v718beam
    FeaturePrefsStore.batch711.v718beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v718: before mode
internal fun PlayerActivity.showV718BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v718before
    FeaturePrefsStore.batch711.v718before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v718: begin mode
internal fun PlayerActivity.showV718BeginToggle() {
    val current = FeaturePrefsStore.batch711.v718begin
    FeaturePrefsStore.batch711.v718begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v718: behavior level
internal fun PlayerActivity.showV718BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v718: benchmark level
internal fun PlayerActivity.showV718BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v718: beta level
internal fun PlayerActivity.showV718BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v718: binary level
internal fun PlayerActivity.showV718BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v718: bind level
internal fun PlayerActivity.showV718BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v718: bitmap setting
internal fun PlayerActivity.showV718BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v718bitmap
    FeaturePrefsStore.batch711.v718bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v718: blank setting
internal fun PlayerActivity.showV718BlankToggle() {
    val current = FeaturePrefsStore.batch711.v718blank
    FeaturePrefsStore.batch711.v718blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v718: blend setting
internal fun PlayerActivity.showV718BlendToggle() {
    val current = FeaturePrefsStore.batch711.v718blend
    FeaturePrefsStore.batch711.v718blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v718: block setting
internal fun PlayerActivity.showV718BlockToggle() {
    val current = FeaturePrefsStore.batch711.v718block
    FeaturePrefsStore.batch711.v718block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v718: boolean setting
internal fun PlayerActivity.showV718BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v718boolean
    FeaturePrefsStore.batch711.v718boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v719: batch mode
internal fun PlayerActivity.showV719BatchToggle() {
    val current = FeaturePrefsStore.batch711.v719batch
    FeaturePrefsStore.batch711.v719batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v719: beacon mode
internal fun PlayerActivity.showV719BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v719beacon
    FeaturePrefsStore.batch711.v719beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v719: beam mode
internal fun PlayerActivity.showV719BeamToggle() {
    val current = FeaturePrefsStore.batch711.v719beam
    FeaturePrefsStore.batch711.v719beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v719: before mode
internal fun PlayerActivity.showV719BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v719before
    FeaturePrefsStore.batch711.v719before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v719: begin mode
internal fun PlayerActivity.showV719BeginToggle() {
    val current = FeaturePrefsStore.batch711.v719begin
    FeaturePrefsStore.batch711.v719begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v719: behavior level
internal fun PlayerActivity.showV719BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v719: benchmark level
internal fun PlayerActivity.showV719BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v719: beta level
internal fun PlayerActivity.showV719BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v719: binary level
internal fun PlayerActivity.showV719BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v719: bind level
internal fun PlayerActivity.showV719BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v719: bitmap setting
internal fun PlayerActivity.showV719BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v719bitmap
    FeaturePrefsStore.batch711.v719bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v719: blank setting
internal fun PlayerActivity.showV719BlankToggle() {
    val current = FeaturePrefsStore.batch711.v719blank
    FeaturePrefsStore.batch711.v719blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v719: blend setting
internal fun PlayerActivity.showV719BlendToggle() {
    val current = FeaturePrefsStore.batch711.v719blend
    FeaturePrefsStore.batch711.v719blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v719: block setting
internal fun PlayerActivity.showV719BlockToggle() {
    val current = FeaturePrefsStore.batch711.v719block
    FeaturePrefsStore.batch711.v719block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v719: boolean setting
internal fun PlayerActivity.showV719BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v719boolean
    FeaturePrefsStore.batch711.v719boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v720: batch mode
internal fun PlayerActivity.showV720BatchToggle() {
    val current = FeaturePrefsStore.batch711.v720batch
    FeaturePrefsStore.batch711.v720batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v720: beacon mode
internal fun PlayerActivity.showV720BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v720beacon
    FeaturePrefsStore.batch711.v720beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v720: beam mode
internal fun PlayerActivity.showV720BeamToggle() {
    val current = FeaturePrefsStore.batch711.v720beam
    FeaturePrefsStore.batch711.v720beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v720: before mode
internal fun PlayerActivity.showV720BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v720before
    FeaturePrefsStore.batch711.v720before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v720: begin mode
internal fun PlayerActivity.showV720BeginToggle() {
    val current = FeaturePrefsStore.batch711.v720begin
    FeaturePrefsStore.batch711.v720begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v720: behavior level
internal fun PlayerActivity.showV720BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v720: benchmark level
internal fun PlayerActivity.showV720BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v720: beta level
internal fun PlayerActivity.showV720BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v720: binary level
internal fun PlayerActivity.showV720BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v720: bind level
internal fun PlayerActivity.showV720BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v720: bitmap setting
internal fun PlayerActivity.showV720BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v720bitmap
    FeaturePrefsStore.batch711.v720bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v720: blank setting
internal fun PlayerActivity.showV720BlankToggle() {
    val current = FeaturePrefsStore.batch711.v720blank
    FeaturePrefsStore.batch711.v720blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v720: blend setting
internal fun PlayerActivity.showV720BlendToggle() {
    val current = FeaturePrefsStore.batch711.v720blend
    FeaturePrefsStore.batch711.v720blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v720: block setting
internal fun PlayerActivity.showV720BlockToggle() {
    val current = FeaturePrefsStore.batch711.v720block
    FeaturePrefsStore.batch711.v720block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v720: boolean setting
internal fun PlayerActivity.showV720BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v720boolean
    FeaturePrefsStore.batch711.v720boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v721: border mode
internal fun PlayerActivity.showV721BorderToggle() {
    val current = FeaturePrefsStore.batch721.v721border
    FeaturePrefsStore.batch721.v721border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v721: bounce mode
internal fun PlayerActivity.showV721BounceToggle() {
    val current = FeaturePrefsStore.batch721.v721bounce
    FeaturePrefsStore.batch721.v721bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v721: box mode
internal fun PlayerActivity.showV721BoxToggle() {
    val current = FeaturePrefsStore.batch721.v721box
    FeaturePrefsStore.batch721.v721box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v721: branch mode
internal fun PlayerActivity.showV721BranchToggle() {
    val current = FeaturePrefsStore.batch721.v721branch
    FeaturePrefsStore.batch721.v721branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v721: brand mode
internal fun PlayerActivity.showV721BrandToggle() {
    val current = FeaturePrefsStore.batch721.v721brand
    FeaturePrefsStore.batch721.v721brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v721: break level
internal fun PlayerActivity.showV721BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721break = value
        AppToast.show(this, "break: $value")
    }
}

// v721: bridge level
internal fun PlayerActivity.showV721BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v721: browse level
internal fun PlayerActivity.showV721BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v721: buffer level
internal fun PlayerActivity.showV721BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v721: build level
internal fun PlayerActivity.showV721BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721build = value
        AppToast.show(this, "build: $value")
    }
}

// v721: bulk mode
internal fun PlayerActivity.showV721BulkToggle() {
    val current = FeaturePrefsStore.batch721.v721bulk
    FeaturePrefsStore.batch721.v721bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v721: burst mode
internal fun PlayerActivity.showV721BurstToggle() {
    val current = FeaturePrefsStore.batch721.v721burst
    FeaturePrefsStore.batch721.v721burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v721: byte mode
internal fun PlayerActivity.showV721ByteToggle() {
    val current = FeaturePrefsStore.batch721.v721byte
    FeaturePrefsStore.batch721.v721byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v721: cache mode
internal fun PlayerActivity.showV721CacheToggle() {
    val current = FeaturePrefsStore.batch721.v721cache
    FeaturePrefsStore.batch721.v721cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v721: calibrate mode
internal fun PlayerActivity.showV721CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v721calibrate
    FeaturePrefsStore.batch721.v721calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v722: border mode
internal fun PlayerActivity.showV722BorderToggle() {
    val current = FeaturePrefsStore.batch721.v722border
    FeaturePrefsStore.batch721.v722border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v722: bounce mode
internal fun PlayerActivity.showV722BounceToggle() {
    val current = FeaturePrefsStore.batch721.v722bounce
    FeaturePrefsStore.batch721.v722bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v722: box mode
internal fun PlayerActivity.showV722BoxToggle() {
    val current = FeaturePrefsStore.batch721.v722box
    FeaturePrefsStore.batch721.v722box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v722: branch mode
internal fun PlayerActivity.showV722BranchToggle() {
    val current = FeaturePrefsStore.batch721.v722branch
    FeaturePrefsStore.batch721.v722branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v722: brand mode
internal fun PlayerActivity.showV722BrandToggle() {
    val current = FeaturePrefsStore.batch721.v722brand
    FeaturePrefsStore.batch721.v722brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v722: break level
internal fun PlayerActivity.showV722BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722break = value
        AppToast.show(this, "break: $value")
    }
}

// v722: bridge level
internal fun PlayerActivity.showV722BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v722: browse level
internal fun PlayerActivity.showV722BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v722: buffer level
internal fun PlayerActivity.showV722BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v722: build level
internal fun PlayerActivity.showV722BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722build = value
        AppToast.show(this, "build: $value")
    }
}

// v722: bulk mode
internal fun PlayerActivity.showV722BulkToggle() {
    val current = FeaturePrefsStore.batch721.v722bulk
    FeaturePrefsStore.batch721.v722bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v722: burst mode
internal fun PlayerActivity.showV722BurstToggle() {
    val current = FeaturePrefsStore.batch721.v722burst
    FeaturePrefsStore.batch721.v722burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v722: byte mode
internal fun PlayerActivity.showV722ByteToggle() {
    val current = FeaturePrefsStore.batch721.v722byte
    FeaturePrefsStore.batch721.v722byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v722: cache mode
internal fun PlayerActivity.showV722CacheToggle() {
    val current = FeaturePrefsStore.batch721.v722cache
    FeaturePrefsStore.batch721.v722cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v722: calibrate mode
internal fun PlayerActivity.showV722CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v722calibrate
    FeaturePrefsStore.batch721.v722calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v723: border mode
internal fun PlayerActivity.showV723BorderToggle() {
    val current = FeaturePrefsStore.batch721.v723border
    FeaturePrefsStore.batch721.v723border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v723: bounce mode
internal fun PlayerActivity.showV723BounceToggle() {
    val current = FeaturePrefsStore.batch721.v723bounce
    FeaturePrefsStore.batch721.v723bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v723: box mode
internal fun PlayerActivity.showV723BoxToggle() {
    val current = FeaturePrefsStore.batch721.v723box
    FeaturePrefsStore.batch721.v723box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v723: branch mode
internal fun PlayerActivity.showV723BranchToggle() {
    val current = FeaturePrefsStore.batch721.v723branch
    FeaturePrefsStore.batch721.v723branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v723: brand mode
internal fun PlayerActivity.showV723BrandToggle() {
    val current = FeaturePrefsStore.batch721.v723brand
    FeaturePrefsStore.batch721.v723brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v723: break level
internal fun PlayerActivity.showV723BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723break = value
        AppToast.show(this, "break: $value")
    }
}

// v723: bridge level
internal fun PlayerActivity.showV723BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v723: browse level
internal fun PlayerActivity.showV723BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v723: buffer level
internal fun PlayerActivity.showV723BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v723: build level
internal fun PlayerActivity.showV723BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723build = value
        AppToast.show(this, "build: $value")
    }
}

// v723: bulk mode
internal fun PlayerActivity.showV723BulkToggle() {
    val current = FeaturePrefsStore.batch721.v723bulk
    FeaturePrefsStore.batch721.v723bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v723: burst mode
internal fun PlayerActivity.showV723BurstToggle() {
    val current = FeaturePrefsStore.batch721.v723burst
    FeaturePrefsStore.batch721.v723burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v723: byte mode
internal fun PlayerActivity.showV723ByteToggle() {
    val current = FeaturePrefsStore.batch721.v723byte
    FeaturePrefsStore.batch721.v723byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v723: cache mode
internal fun PlayerActivity.showV723CacheToggle() {
    val current = FeaturePrefsStore.batch721.v723cache
    FeaturePrefsStore.batch721.v723cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v723: calibrate mode
internal fun PlayerActivity.showV723CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v723calibrate
    FeaturePrefsStore.batch721.v723calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v724: border mode
internal fun PlayerActivity.showV724BorderToggle() {
    val current = FeaturePrefsStore.batch721.v724border
    FeaturePrefsStore.batch721.v724border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v724: bounce mode
internal fun PlayerActivity.showV724BounceToggle() {
    val current = FeaturePrefsStore.batch721.v724bounce
    FeaturePrefsStore.batch721.v724bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v724: box mode
internal fun PlayerActivity.showV724BoxToggle() {
    val current = FeaturePrefsStore.batch721.v724box
    FeaturePrefsStore.batch721.v724box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v724: branch mode
internal fun PlayerActivity.showV724BranchToggle() {
    val current = FeaturePrefsStore.batch721.v724branch
    FeaturePrefsStore.batch721.v724branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v724: brand mode
internal fun PlayerActivity.showV724BrandToggle() {
    val current = FeaturePrefsStore.batch721.v724brand
    FeaturePrefsStore.batch721.v724brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v724: break level
internal fun PlayerActivity.showV724BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724break = value
        AppToast.show(this, "break: $value")
    }
}

// v724: bridge level
internal fun PlayerActivity.showV724BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v724: browse level
internal fun PlayerActivity.showV724BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v724: buffer level
internal fun PlayerActivity.showV724BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v724: build level
internal fun PlayerActivity.showV724BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724build = value
        AppToast.show(this, "build: $value")
    }
}

// v724: bulk mode
internal fun PlayerActivity.showV724BulkToggle() {
    val current = FeaturePrefsStore.batch721.v724bulk
    FeaturePrefsStore.batch721.v724bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v724: burst mode
internal fun PlayerActivity.showV724BurstToggle() {
    val current = FeaturePrefsStore.batch721.v724burst
    FeaturePrefsStore.batch721.v724burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v724: byte mode
internal fun PlayerActivity.showV724ByteToggle() {
    val current = FeaturePrefsStore.batch721.v724byte
    FeaturePrefsStore.batch721.v724byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v724: cache mode
internal fun PlayerActivity.showV724CacheToggle() {
    val current = FeaturePrefsStore.batch721.v724cache
    FeaturePrefsStore.batch721.v724cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v724: calibrate mode
internal fun PlayerActivity.showV724CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v724calibrate
    FeaturePrefsStore.batch721.v724calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v725: border mode
internal fun PlayerActivity.showV725BorderToggle() {
    val current = FeaturePrefsStore.batch721.v725border
    FeaturePrefsStore.batch721.v725border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v725: bounce mode
internal fun PlayerActivity.showV725BounceToggle() {
    val current = FeaturePrefsStore.batch721.v725bounce
    FeaturePrefsStore.batch721.v725bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v725: box mode
internal fun PlayerActivity.showV725BoxToggle() {
    val current = FeaturePrefsStore.batch721.v725box
    FeaturePrefsStore.batch721.v725box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v725: branch mode
internal fun PlayerActivity.showV725BranchToggle() {
    val current = FeaturePrefsStore.batch721.v725branch
    FeaturePrefsStore.batch721.v725branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v725: brand mode
internal fun PlayerActivity.showV725BrandToggle() {
    val current = FeaturePrefsStore.batch721.v725brand
    FeaturePrefsStore.batch721.v725brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v725: break level
internal fun PlayerActivity.showV725BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725break = value
        AppToast.show(this, "break: $value")
    }
}

// v725: bridge level
internal fun PlayerActivity.showV725BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v725: browse level
internal fun PlayerActivity.showV725BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v725: buffer level
internal fun PlayerActivity.showV725BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v725: build level
internal fun PlayerActivity.showV725BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725build = value
        AppToast.show(this, "build: $value")
    }
}

// v725: bulk mode
internal fun PlayerActivity.showV725BulkToggle() {
    val current = FeaturePrefsStore.batch721.v725bulk
    FeaturePrefsStore.batch721.v725bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v725: burst mode
internal fun PlayerActivity.showV725BurstToggle() {
    val current = FeaturePrefsStore.batch721.v725burst
    FeaturePrefsStore.batch721.v725burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v725: byte mode
internal fun PlayerActivity.showV725ByteToggle() {
    val current = FeaturePrefsStore.batch721.v725byte
    FeaturePrefsStore.batch721.v725byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v725: cache mode
internal fun PlayerActivity.showV725CacheToggle() {
    val current = FeaturePrefsStore.batch721.v725cache
    FeaturePrefsStore.batch721.v725cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v725: calibrate mode
internal fun PlayerActivity.showV725CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v725calibrate
    FeaturePrefsStore.batch721.v725calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v726: border mode
internal fun PlayerActivity.showV726BorderToggle() {
    val current = FeaturePrefsStore.batch721.v726border
    FeaturePrefsStore.batch721.v726border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v726: bounce mode
internal fun PlayerActivity.showV726BounceToggle() {
    val current = FeaturePrefsStore.batch721.v726bounce
    FeaturePrefsStore.batch721.v726bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v726: box mode
internal fun PlayerActivity.showV726BoxToggle() {
    val current = FeaturePrefsStore.batch721.v726box
    FeaturePrefsStore.batch721.v726box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v726: branch mode
internal fun PlayerActivity.showV726BranchToggle() {
    val current = FeaturePrefsStore.batch721.v726branch
    FeaturePrefsStore.batch721.v726branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v726: brand mode
internal fun PlayerActivity.showV726BrandToggle() {
    val current = FeaturePrefsStore.batch721.v726brand
    FeaturePrefsStore.batch721.v726brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v726: break level
internal fun PlayerActivity.showV726BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726break = value
        AppToast.show(this, "break: $value")
    }
}

// v726: bridge level
internal fun PlayerActivity.showV726BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v726: browse level
internal fun PlayerActivity.showV726BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v726: buffer level
internal fun PlayerActivity.showV726BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v726: build level
internal fun PlayerActivity.showV726BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726build = value
        AppToast.show(this, "build: $value")
    }
}

// v726: bulk mode
internal fun PlayerActivity.showV726BulkToggle() {
    val current = FeaturePrefsStore.batch721.v726bulk
    FeaturePrefsStore.batch721.v726bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v726: burst mode
internal fun PlayerActivity.showV726BurstToggle() {
    val current = FeaturePrefsStore.batch721.v726burst
    FeaturePrefsStore.batch721.v726burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v726: byte mode
internal fun PlayerActivity.showV726ByteToggle() {
    val current = FeaturePrefsStore.batch721.v726byte
    FeaturePrefsStore.batch721.v726byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v726: cache mode
internal fun PlayerActivity.showV726CacheToggle() {
    val current = FeaturePrefsStore.batch721.v726cache
    FeaturePrefsStore.batch721.v726cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v726: calibrate mode
internal fun PlayerActivity.showV726CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v726calibrate
    FeaturePrefsStore.batch721.v726calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v727: border mode
internal fun PlayerActivity.showV727BorderToggle() {
    val current = FeaturePrefsStore.batch721.v727border
    FeaturePrefsStore.batch721.v727border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v727: bounce mode
internal fun PlayerActivity.showV727BounceToggle() {
    val current = FeaturePrefsStore.batch721.v727bounce
    FeaturePrefsStore.batch721.v727bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v727: box mode
internal fun PlayerActivity.showV727BoxToggle() {
    val current = FeaturePrefsStore.batch721.v727box
    FeaturePrefsStore.batch721.v727box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v727: branch mode
internal fun PlayerActivity.showV727BranchToggle() {
    val current = FeaturePrefsStore.batch721.v727branch
    FeaturePrefsStore.batch721.v727branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v727: brand mode
internal fun PlayerActivity.showV727BrandToggle() {
    val current = FeaturePrefsStore.batch721.v727brand
    FeaturePrefsStore.batch721.v727brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v727: break level
internal fun PlayerActivity.showV727BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727break = value
        AppToast.show(this, "break: $value")
    }
}

// v727: bridge level
internal fun PlayerActivity.showV727BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v727: browse level
internal fun PlayerActivity.showV727BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v727: buffer level
internal fun PlayerActivity.showV727BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v727: build level
internal fun PlayerActivity.showV727BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727build = value
        AppToast.show(this, "build: $value")
    }
}

// v727: bulk mode
internal fun PlayerActivity.showV727BulkToggle() {
    val current = FeaturePrefsStore.batch721.v727bulk
    FeaturePrefsStore.batch721.v727bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v727: burst mode
internal fun PlayerActivity.showV727BurstToggle() {
    val current = FeaturePrefsStore.batch721.v727burst
    FeaturePrefsStore.batch721.v727burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v727: byte mode
internal fun PlayerActivity.showV727ByteToggle() {
    val current = FeaturePrefsStore.batch721.v727byte
    FeaturePrefsStore.batch721.v727byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v727: cache mode
internal fun PlayerActivity.showV727CacheToggle() {
    val current = FeaturePrefsStore.batch721.v727cache
    FeaturePrefsStore.batch721.v727cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v727: calibrate mode
internal fun PlayerActivity.showV727CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v727calibrate
    FeaturePrefsStore.batch721.v727calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v728: border mode
internal fun PlayerActivity.showV728BorderToggle() {
    val current = FeaturePrefsStore.batch721.v728border
    FeaturePrefsStore.batch721.v728border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v728: bounce mode
internal fun PlayerActivity.showV728BounceToggle() {
    val current = FeaturePrefsStore.batch721.v728bounce
    FeaturePrefsStore.batch721.v728bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v728: box mode
internal fun PlayerActivity.showV728BoxToggle() {
    val current = FeaturePrefsStore.batch721.v728box
    FeaturePrefsStore.batch721.v728box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v728: branch mode
internal fun PlayerActivity.showV728BranchToggle() {
    val current = FeaturePrefsStore.batch721.v728branch
    FeaturePrefsStore.batch721.v728branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v728: brand mode
internal fun PlayerActivity.showV728BrandToggle() {
    val current = FeaturePrefsStore.batch721.v728brand
    FeaturePrefsStore.batch721.v728brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v728: break level
internal fun PlayerActivity.showV728BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728break = value
        AppToast.show(this, "break: $value")
    }
}

// v728: bridge level
internal fun PlayerActivity.showV728BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v728: browse level
internal fun PlayerActivity.showV728BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v728: buffer level
internal fun PlayerActivity.showV728BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v728: build level
internal fun PlayerActivity.showV728BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728build = value
        AppToast.show(this, "build: $value")
    }
}

// v728: bulk mode
internal fun PlayerActivity.showV728BulkToggle() {
    val current = FeaturePrefsStore.batch721.v728bulk
    FeaturePrefsStore.batch721.v728bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v728: burst mode
internal fun PlayerActivity.showV728BurstToggle() {
    val current = FeaturePrefsStore.batch721.v728burst
    FeaturePrefsStore.batch721.v728burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v728: byte mode
internal fun PlayerActivity.showV728ByteToggle() {
    val current = FeaturePrefsStore.batch721.v728byte
    FeaturePrefsStore.batch721.v728byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v728: cache mode
internal fun PlayerActivity.showV728CacheToggle() {
    val current = FeaturePrefsStore.batch721.v728cache
    FeaturePrefsStore.batch721.v728cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v728: calibrate mode
internal fun PlayerActivity.showV728CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v728calibrate
    FeaturePrefsStore.batch721.v728calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v729: border mode
internal fun PlayerActivity.showV729BorderToggle() {
    val current = FeaturePrefsStore.batch721.v729border
    FeaturePrefsStore.batch721.v729border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v729: bounce mode
internal fun PlayerActivity.showV729BounceToggle() {
    val current = FeaturePrefsStore.batch721.v729bounce
    FeaturePrefsStore.batch721.v729bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v729: box mode
internal fun PlayerActivity.showV729BoxToggle() {
    val current = FeaturePrefsStore.batch721.v729box
    FeaturePrefsStore.batch721.v729box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v729: branch mode
internal fun PlayerActivity.showV729BranchToggle() {
    val current = FeaturePrefsStore.batch721.v729branch
    FeaturePrefsStore.batch721.v729branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v729: brand mode
internal fun PlayerActivity.showV729BrandToggle() {
    val current = FeaturePrefsStore.batch721.v729brand
    FeaturePrefsStore.batch721.v729brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v729: break level
internal fun PlayerActivity.showV729BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729break = value
        AppToast.show(this, "break: $value")
    }
}

// v729: bridge level
internal fun PlayerActivity.showV729BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v729: browse level
internal fun PlayerActivity.showV729BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v729: buffer level
internal fun PlayerActivity.showV729BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v729: build level
internal fun PlayerActivity.showV729BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729build = value
        AppToast.show(this, "build: $value")
    }
}

// v729: bulk mode
internal fun PlayerActivity.showV729BulkToggle() {
    val current = FeaturePrefsStore.batch721.v729bulk
    FeaturePrefsStore.batch721.v729bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v729: burst mode
internal fun PlayerActivity.showV729BurstToggle() {
    val current = FeaturePrefsStore.batch721.v729burst
    FeaturePrefsStore.batch721.v729burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v729: byte mode
internal fun PlayerActivity.showV729ByteToggle() {
    val current = FeaturePrefsStore.batch721.v729byte
    FeaturePrefsStore.batch721.v729byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v729: cache mode
internal fun PlayerActivity.showV729CacheToggle() {
    val current = FeaturePrefsStore.batch721.v729cache
    FeaturePrefsStore.batch721.v729cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v729: calibrate mode
internal fun PlayerActivity.showV729CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v729calibrate
    FeaturePrefsStore.batch721.v729calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v730: border mode
internal fun PlayerActivity.showV730BorderToggle() {
    val current = FeaturePrefsStore.batch721.v730border
    FeaturePrefsStore.batch721.v730border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v730: bounce mode
internal fun PlayerActivity.showV730BounceToggle() {
    val current = FeaturePrefsStore.batch721.v730bounce
    FeaturePrefsStore.batch721.v730bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v730: box mode
internal fun PlayerActivity.showV730BoxToggle() {
    val current = FeaturePrefsStore.batch721.v730box
    FeaturePrefsStore.batch721.v730box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v730: branch mode
internal fun PlayerActivity.showV730BranchToggle() {
    val current = FeaturePrefsStore.batch721.v730branch
    FeaturePrefsStore.batch721.v730branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v730: brand mode
internal fun PlayerActivity.showV730BrandToggle() {
    val current = FeaturePrefsStore.batch721.v730brand
    FeaturePrefsStore.batch721.v730brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v730: break level
internal fun PlayerActivity.showV730BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730break = value
        AppToast.show(this, "break: $value")
    }
}

// v730: bridge level
internal fun PlayerActivity.showV730BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v730: browse level
internal fun PlayerActivity.showV730BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v730: buffer level
internal fun PlayerActivity.showV730BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v730: build level
internal fun PlayerActivity.showV730BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730build = value
        AppToast.show(this, "build: $value")
    }
}

// v730: bulk mode
internal fun PlayerActivity.showV730BulkToggle() {
    val current = FeaturePrefsStore.batch721.v730bulk
    FeaturePrefsStore.batch721.v730bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v730: burst mode
internal fun PlayerActivity.showV730BurstToggle() {
    val current = FeaturePrefsStore.batch721.v730burst
    FeaturePrefsStore.batch721.v730burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v730: byte mode
internal fun PlayerActivity.showV730ByteToggle() {
    val current = FeaturePrefsStore.batch721.v730byte
    FeaturePrefsStore.batch721.v730byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v730: cache mode
internal fun PlayerActivity.showV730CacheToggle() {
    val current = FeaturePrefsStore.batch721.v730cache
    FeaturePrefsStore.batch721.v730cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v730: calibrate mode
internal fun PlayerActivity.showV730CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v730calibrate
    FeaturePrefsStore.batch721.v730calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v731: cancel mode
internal fun PlayerActivity.showV731CancelToggle() {
    val current = FeaturePrefsStore.batch731.v731cancel
    FeaturePrefsStore.batch731.v731cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v731: capture mode
internal fun PlayerActivity.showV731CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v731capture
    FeaturePrefsStore.batch731.v731capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v731: cascade mode
internal fun PlayerActivity.showV731CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v731cascade
    FeaturePrefsStore.batch731.v731cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v731: category mode
internal fun PlayerActivity.showV731CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v731category
    FeaturePrefsStore.batch731.v731category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v731: chain mode
internal fun PlayerActivity.showV731ChainToggle() {
    val current = FeaturePrefsStore.batch731.v731chain
    FeaturePrefsStore.batch731.v731chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v731: challenge level
internal fun PlayerActivity.showV731ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v731: channel level
internal fun PlayerActivity.showV731ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v731: chart level
internal fun PlayerActivity.showV731ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v731: checkpoint level
internal fun PlayerActivity.showV731CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v731: chunk level
internal fun PlayerActivity.showV731ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v731: cipher mode
internal fun PlayerActivity.showV731CipherToggle() {
    val current = FeaturePrefsStore.batch731.v731cipher
    FeaturePrefsStore.batch731.v731cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v731: clamp mode
internal fun PlayerActivity.showV731ClampToggle() {
    val current = FeaturePrefsStore.batch731.v731clamp
    FeaturePrefsStore.batch731.v731clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v731: classify mode
internal fun PlayerActivity.showV731ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v731classify
    FeaturePrefsStore.batch731.v731classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v731: clean mode
internal fun PlayerActivity.showV731CleanToggle() {
    val current = FeaturePrefsStore.batch731.v731clean
    FeaturePrefsStore.batch731.v731clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v731: clear mode
internal fun PlayerActivity.showV731ClearToggle() {
    val current = FeaturePrefsStore.batch731.v731clear
    FeaturePrefsStore.batch731.v731clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v732: cancel mode
internal fun PlayerActivity.showV732CancelToggle() {
    val current = FeaturePrefsStore.batch731.v732cancel
    FeaturePrefsStore.batch731.v732cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v732: capture mode
internal fun PlayerActivity.showV732CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v732capture
    FeaturePrefsStore.batch731.v732capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v732: cascade mode
internal fun PlayerActivity.showV732CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v732cascade
    FeaturePrefsStore.batch731.v732cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v732: category mode
internal fun PlayerActivity.showV732CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v732category
    FeaturePrefsStore.batch731.v732category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v732: chain mode
internal fun PlayerActivity.showV732ChainToggle() {
    val current = FeaturePrefsStore.batch731.v732chain
    FeaturePrefsStore.batch731.v732chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v732: challenge level
internal fun PlayerActivity.showV732ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v732: channel level
internal fun PlayerActivity.showV732ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v732: chart level
internal fun PlayerActivity.showV732ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v732: checkpoint level
internal fun PlayerActivity.showV732CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v732: chunk level
internal fun PlayerActivity.showV732ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v732: cipher mode
internal fun PlayerActivity.showV732CipherToggle() {
    val current = FeaturePrefsStore.batch731.v732cipher
    FeaturePrefsStore.batch731.v732cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v732: clamp mode
internal fun PlayerActivity.showV732ClampToggle() {
    val current = FeaturePrefsStore.batch731.v732clamp
    FeaturePrefsStore.batch731.v732clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v732: classify mode
internal fun PlayerActivity.showV732ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v732classify
    FeaturePrefsStore.batch731.v732classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v732: clean mode
internal fun PlayerActivity.showV732CleanToggle() {
    val current = FeaturePrefsStore.batch731.v732clean
    FeaturePrefsStore.batch731.v732clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v732: clear mode
internal fun PlayerActivity.showV732ClearToggle() {
    val current = FeaturePrefsStore.batch731.v732clear
    FeaturePrefsStore.batch731.v732clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v733: cancel mode
internal fun PlayerActivity.showV733CancelToggle() {
    val current = FeaturePrefsStore.batch731.v733cancel
    FeaturePrefsStore.batch731.v733cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v733: capture mode
internal fun PlayerActivity.showV733CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v733capture
    FeaturePrefsStore.batch731.v733capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v733: cascade mode
internal fun PlayerActivity.showV733CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v733cascade
    FeaturePrefsStore.batch731.v733cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v733: category mode
internal fun PlayerActivity.showV733CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v733category
    FeaturePrefsStore.batch731.v733category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v733: chain mode
internal fun PlayerActivity.showV733ChainToggle() {
    val current = FeaturePrefsStore.batch731.v733chain
    FeaturePrefsStore.batch731.v733chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v733: challenge level
internal fun PlayerActivity.showV733ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v733: channel level
internal fun PlayerActivity.showV733ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v733: chart level
internal fun PlayerActivity.showV733ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v733: checkpoint level
internal fun PlayerActivity.showV733CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v733: chunk level
internal fun PlayerActivity.showV733ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v733: cipher mode
internal fun PlayerActivity.showV733CipherToggle() {
    val current = FeaturePrefsStore.batch731.v733cipher
    FeaturePrefsStore.batch731.v733cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v733: clamp mode
internal fun PlayerActivity.showV733ClampToggle() {
    val current = FeaturePrefsStore.batch731.v733clamp
    FeaturePrefsStore.batch731.v733clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v733: classify mode
internal fun PlayerActivity.showV733ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v733classify
    FeaturePrefsStore.batch731.v733classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v733: clean mode
internal fun PlayerActivity.showV733CleanToggle() {
    val current = FeaturePrefsStore.batch731.v733clean
    FeaturePrefsStore.batch731.v733clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v733: clear mode
internal fun PlayerActivity.showV733ClearToggle() {
    val current = FeaturePrefsStore.batch731.v733clear
    FeaturePrefsStore.batch731.v733clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v734: cancel mode
internal fun PlayerActivity.showV734CancelToggle() {
    val current = FeaturePrefsStore.batch731.v734cancel
    FeaturePrefsStore.batch731.v734cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v734: capture mode
internal fun PlayerActivity.showV734CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v734capture
    FeaturePrefsStore.batch731.v734capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v734: cascade mode
internal fun PlayerActivity.showV734CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v734cascade
    FeaturePrefsStore.batch731.v734cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v734: category mode
internal fun PlayerActivity.showV734CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v734category
    FeaturePrefsStore.batch731.v734category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v734: chain mode
internal fun PlayerActivity.showV734ChainToggle() {
    val current = FeaturePrefsStore.batch731.v734chain
    FeaturePrefsStore.batch731.v734chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v734: challenge level
internal fun PlayerActivity.showV734ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v734: channel level
internal fun PlayerActivity.showV734ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v734: chart level
internal fun PlayerActivity.showV734ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v734: checkpoint level
internal fun PlayerActivity.showV734CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v734: chunk level
internal fun PlayerActivity.showV734ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v734: cipher mode
internal fun PlayerActivity.showV734CipherToggle() {
    val current = FeaturePrefsStore.batch731.v734cipher
    FeaturePrefsStore.batch731.v734cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v734: clamp mode
internal fun PlayerActivity.showV734ClampToggle() {
    val current = FeaturePrefsStore.batch731.v734clamp
    FeaturePrefsStore.batch731.v734clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v734: classify mode
internal fun PlayerActivity.showV734ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v734classify
    FeaturePrefsStore.batch731.v734classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v734: clean mode
internal fun PlayerActivity.showV734CleanToggle() {
    val current = FeaturePrefsStore.batch731.v734clean
    FeaturePrefsStore.batch731.v734clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v734: clear mode
internal fun PlayerActivity.showV734ClearToggle() {
    val current = FeaturePrefsStore.batch731.v734clear
    FeaturePrefsStore.batch731.v734clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v735: cancel mode
internal fun PlayerActivity.showV735CancelToggle() {
    val current = FeaturePrefsStore.batch731.v735cancel
    FeaturePrefsStore.batch731.v735cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v735: capture mode
internal fun PlayerActivity.showV735CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v735capture
    FeaturePrefsStore.batch731.v735capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v735: cascade mode
internal fun PlayerActivity.showV735CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v735cascade
    FeaturePrefsStore.batch731.v735cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v735: category mode
internal fun PlayerActivity.showV735CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v735category
    FeaturePrefsStore.batch731.v735category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v735: chain mode
internal fun PlayerActivity.showV735ChainToggle() {
    val current = FeaturePrefsStore.batch731.v735chain
    FeaturePrefsStore.batch731.v735chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v735: challenge level
internal fun PlayerActivity.showV735ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v735: channel level
internal fun PlayerActivity.showV735ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v735: chart level
internal fun PlayerActivity.showV735ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v735: checkpoint level
internal fun PlayerActivity.showV735CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v735: chunk level
internal fun PlayerActivity.showV735ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v735: cipher mode
internal fun PlayerActivity.showV735CipherToggle() {
    val current = FeaturePrefsStore.batch731.v735cipher
    FeaturePrefsStore.batch731.v735cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v735: clamp mode
internal fun PlayerActivity.showV735ClampToggle() {
    val current = FeaturePrefsStore.batch731.v735clamp
    FeaturePrefsStore.batch731.v735clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v735: classify mode
internal fun PlayerActivity.showV735ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v735classify
    FeaturePrefsStore.batch731.v735classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v735: clean mode
internal fun PlayerActivity.showV735CleanToggle() {
    val current = FeaturePrefsStore.batch731.v735clean
    FeaturePrefsStore.batch731.v735clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v735: clear mode
internal fun PlayerActivity.showV735ClearToggle() {
    val current = FeaturePrefsStore.batch731.v735clear
    FeaturePrefsStore.batch731.v735clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v736: cancel mode
internal fun PlayerActivity.showV736CancelToggle() {
    val current = FeaturePrefsStore.batch731.v736cancel
    FeaturePrefsStore.batch731.v736cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v736: capture mode
internal fun PlayerActivity.showV736CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v736capture
    FeaturePrefsStore.batch731.v736capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v736: cascade mode
internal fun PlayerActivity.showV736CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v736cascade
    FeaturePrefsStore.batch731.v736cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v736: category mode
internal fun PlayerActivity.showV736CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v736category
    FeaturePrefsStore.batch731.v736category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v736: chain mode
internal fun PlayerActivity.showV736ChainToggle() {
    val current = FeaturePrefsStore.batch731.v736chain
    FeaturePrefsStore.batch731.v736chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v736: challenge level
internal fun PlayerActivity.showV736ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v736: channel level
internal fun PlayerActivity.showV736ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v736: chart level
internal fun PlayerActivity.showV736ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v736: checkpoint level
internal fun PlayerActivity.showV736CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v736: chunk level
internal fun PlayerActivity.showV736ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v736: cipher mode
internal fun PlayerActivity.showV736CipherToggle() {
    val current = FeaturePrefsStore.batch731.v736cipher
    FeaturePrefsStore.batch731.v736cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v736: clamp mode
internal fun PlayerActivity.showV736ClampToggle() {
    val current = FeaturePrefsStore.batch731.v736clamp
    FeaturePrefsStore.batch731.v736clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v736: classify mode
internal fun PlayerActivity.showV736ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v736classify
    FeaturePrefsStore.batch731.v736classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v736: clean mode
internal fun PlayerActivity.showV736CleanToggle() {
    val current = FeaturePrefsStore.batch731.v736clean
    FeaturePrefsStore.batch731.v736clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v736: clear mode
internal fun PlayerActivity.showV736ClearToggle() {
    val current = FeaturePrefsStore.batch731.v736clear
    FeaturePrefsStore.batch731.v736clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v737: cancel mode
internal fun PlayerActivity.showV737CancelToggle() {
    val current = FeaturePrefsStore.batch731.v737cancel
    FeaturePrefsStore.batch731.v737cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v737: capture mode
internal fun PlayerActivity.showV737CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v737capture
    FeaturePrefsStore.batch731.v737capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v737: cascade mode
internal fun PlayerActivity.showV737CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v737cascade
    FeaturePrefsStore.batch731.v737cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v737: category mode
internal fun PlayerActivity.showV737CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v737category
    FeaturePrefsStore.batch731.v737category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v737: chain mode
internal fun PlayerActivity.showV737ChainToggle() {
    val current = FeaturePrefsStore.batch731.v737chain
    FeaturePrefsStore.batch731.v737chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v737: challenge level
internal fun PlayerActivity.showV737ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v737: channel level
internal fun PlayerActivity.showV737ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v737: chart level
internal fun PlayerActivity.showV737ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v737: checkpoint level
internal fun PlayerActivity.showV737CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v737: chunk level
internal fun PlayerActivity.showV737ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v737: cipher mode
internal fun PlayerActivity.showV737CipherToggle() {
    val current = FeaturePrefsStore.batch731.v737cipher
    FeaturePrefsStore.batch731.v737cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v737: clamp mode
internal fun PlayerActivity.showV737ClampToggle() {
    val current = FeaturePrefsStore.batch731.v737clamp
    FeaturePrefsStore.batch731.v737clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v737: classify mode
internal fun PlayerActivity.showV737ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v737classify
    FeaturePrefsStore.batch731.v737classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v737: clean mode
internal fun PlayerActivity.showV737CleanToggle() {
    val current = FeaturePrefsStore.batch731.v737clean
    FeaturePrefsStore.batch731.v737clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v737: clear mode
internal fun PlayerActivity.showV737ClearToggle() {
    val current = FeaturePrefsStore.batch731.v737clear
    FeaturePrefsStore.batch731.v737clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v738: cancel mode
internal fun PlayerActivity.showV738CancelToggle() {
    val current = FeaturePrefsStore.batch731.v738cancel
    FeaturePrefsStore.batch731.v738cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v738: capture mode
internal fun PlayerActivity.showV738CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v738capture
    FeaturePrefsStore.batch731.v738capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v738: cascade mode
internal fun PlayerActivity.showV738CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v738cascade
    FeaturePrefsStore.batch731.v738cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v738: category mode
internal fun PlayerActivity.showV738CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v738category
    FeaturePrefsStore.batch731.v738category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v738: chain mode
internal fun PlayerActivity.showV738ChainToggle() {
    val current = FeaturePrefsStore.batch731.v738chain
    FeaturePrefsStore.batch731.v738chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v738: challenge level
internal fun PlayerActivity.showV738ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v738: channel level
internal fun PlayerActivity.showV738ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v738: chart level
internal fun PlayerActivity.showV738ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v738: checkpoint level
internal fun PlayerActivity.showV738CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v738: chunk level
internal fun PlayerActivity.showV738ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v738: cipher mode
internal fun PlayerActivity.showV738CipherToggle() {
    val current = FeaturePrefsStore.batch731.v738cipher
    FeaturePrefsStore.batch731.v738cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v738: clamp mode
internal fun PlayerActivity.showV738ClampToggle() {
    val current = FeaturePrefsStore.batch731.v738clamp
    FeaturePrefsStore.batch731.v738clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v738: classify mode
internal fun PlayerActivity.showV738ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v738classify
    FeaturePrefsStore.batch731.v738classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v738: clean mode
internal fun PlayerActivity.showV738CleanToggle() {
    val current = FeaturePrefsStore.batch731.v738clean
    FeaturePrefsStore.batch731.v738clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v738: clear mode
internal fun PlayerActivity.showV738ClearToggle() {
    val current = FeaturePrefsStore.batch731.v738clear
    FeaturePrefsStore.batch731.v738clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v739: cancel mode
internal fun PlayerActivity.showV739CancelToggle() {
    val current = FeaturePrefsStore.batch731.v739cancel
    FeaturePrefsStore.batch731.v739cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v739: capture mode
internal fun PlayerActivity.showV739CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v739capture
    FeaturePrefsStore.batch731.v739capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v739: cascade mode
internal fun PlayerActivity.showV739CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v739cascade
    FeaturePrefsStore.batch731.v739cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v739: category mode
internal fun PlayerActivity.showV739CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v739category
    FeaturePrefsStore.batch731.v739category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v739: chain mode
internal fun PlayerActivity.showV739ChainToggle() {
    val current = FeaturePrefsStore.batch731.v739chain
    FeaturePrefsStore.batch731.v739chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v739: challenge level
internal fun PlayerActivity.showV739ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v739: channel level
internal fun PlayerActivity.showV739ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v739: chart level
internal fun PlayerActivity.showV739ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v739: checkpoint level
internal fun PlayerActivity.showV739CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v739: chunk level
internal fun PlayerActivity.showV739ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v739: cipher mode
internal fun PlayerActivity.showV739CipherToggle() {
    val current = FeaturePrefsStore.batch731.v739cipher
    FeaturePrefsStore.batch731.v739cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v739: clamp mode
internal fun PlayerActivity.showV739ClampToggle() {
    val current = FeaturePrefsStore.batch731.v739clamp
    FeaturePrefsStore.batch731.v739clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v739: classify mode
internal fun PlayerActivity.showV739ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v739classify
    FeaturePrefsStore.batch731.v739classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v739: clean mode
internal fun PlayerActivity.showV739CleanToggle() {
    val current = FeaturePrefsStore.batch731.v739clean
    FeaturePrefsStore.batch731.v739clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v739: clear mode
internal fun PlayerActivity.showV739ClearToggle() {
    val current = FeaturePrefsStore.batch731.v739clear
    FeaturePrefsStore.batch731.v739clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v740: cancel mode
internal fun PlayerActivity.showV740CancelToggle() {
    val current = FeaturePrefsStore.batch731.v740cancel
    FeaturePrefsStore.batch731.v740cancel = !current
    AppToast.show(this, "cancel: ${if (!current) "ON" else "OFF"}")
}

// v740: capture mode
internal fun PlayerActivity.showV740CaptureToggle() {
    val current = FeaturePrefsStore.batch731.v740capture
    FeaturePrefsStore.batch731.v740capture = !current
    AppToast.show(this, "capture: ${if (!current) "ON" else "OFF"}")
}

// v740: cascade mode
internal fun PlayerActivity.showV740CascadeToggle() {
    val current = FeaturePrefsStore.batch731.v740cascade
    FeaturePrefsStore.batch731.v740cascade = !current
    AppToast.show(this, "cascade: ${if (!current) "ON" else "OFF"}")
}

// v740: category mode
internal fun PlayerActivity.showV740CategoryToggle() {
    val current = FeaturePrefsStore.batch731.v740category
    FeaturePrefsStore.batch731.v740category = !current
    AppToast.show(this, "category: ${if (!current) "ON" else "OFF"}")
}

// v740: chain mode
internal fun PlayerActivity.showV740ChainToggle() {
    val current = FeaturePrefsStore.batch731.v740chain
    FeaturePrefsStore.batch731.v740chain = !current
    AppToast.show(this, "chain: ${if (!current) "ON" else "OFF"}")
}

// v740: challenge level
internal fun PlayerActivity.showV740ChallengeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740challenge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "challenge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740challenge = value
        AppToast.show(this, "challenge: $value")
    }
}

// v740: channel level
internal fun PlayerActivity.showV740ChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740channel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "channel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740channel = value
        AppToast.show(this, "channel: $value")
    }
}

// v740: chart level
internal fun PlayerActivity.showV740ChartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740chart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740chart = value
        AppToast.show(this, "chart: $value")
    }
}

// v740: checkpoint level
internal fun PlayerActivity.showV740CheckpointDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740checkpoint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "checkpoint level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740checkpoint = value
        AppToast.show(this, "checkpoint: $value")
    }
}

// v740: chunk level
internal fun PlayerActivity.showV740ChunkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740chunk).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "chunk level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740chunk = value
        AppToast.show(this, "chunk: $value")
    }
}

// v740: cipher mode
internal fun PlayerActivity.showV740CipherToggle() {
    val current = FeaturePrefsStore.batch731.v740cipher
    FeaturePrefsStore.batch731.v740cipher = !current
    AppToast.show(this, "cipher: ${if (!current) "ON" else "OFF"}")
}

// v740: clamp mode
internal fun PlayerActivity.showV740ClampToggle() {
    val current = FeaturePrefsStore.batch731.v740clamp
    FeaturePrefsStore.batch731.v740clamp = !current
    AppToast.show(this, "clamp: ${if (!current) "ON" else "OFF"}")
}

// v740: classify mode
internal fun PlayerActivity.showV740ClassifyToggle() {
    val current = FeaturePrefsStore.batch731.v740classify
    FeaturePrefsStore.batch731.v740classify = !current
    AppToast.show(this, "classify: ${if (!current) "ON" else "OFF"}")
}

// v740: clean mode
internal fun PlayerActivity.showV740CleanToggle() {
    val current = FeaturePrefsStore.batch731.v740clean
    FeaturePrefsStore.batch731.v740clean = !current
    AppToast.show(this, "clean: ${if (!current) "ON" else "OFF"}")
}

// v740: clear mode
internal fun PlayerActivity.showV740ClearToggle() {
    val current = FeaturePrefsStore.batch731.v740clear
    FeaturePrefsStore.batch731.v740clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}
