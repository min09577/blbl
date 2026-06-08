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

// v636: Camera Auto Focus636
internal fun PlayerActivity.showV636CameraAutoFocus636Toggle() {
    val current = BiliClient.prefs.v636cameraAutoFocus636
    BiliClient.prefs.v636cameraAutoFocus636 = !current
    AppToast.show(this, "Camera Auto Focus636: ${if (!current) "ON" else "OFF"}")
}

// v636: Campus Auto Select636
internal fun PlayerActivity.showV636CampusAutoSelect636Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v636campusAutoSelect636).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select636",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v636campusAutoSelect636 = value
        AppToast.show(this, "Campus Auto Select636: $value")
    }
}

// v636: Cancel Auto Undo636
internal fun PlayerActivity.showV636CancelAutoUndo636Toggle() {
    val current = BiliClient.prefs.v636cancelAutoUndo636
    BiliClient.prefs.v636cancelAutoUndo636 = !current
    AppToast.show(this, "Cancel Auto Undo636: ${if (!current) "ON" else "OFF"}")
}

// v636: Capture Auto Mode636
internal fun PlayerActivity.showV636CaptureAutoMode636Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v636captureAutoMode636).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode636",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v636captureAutoMode636 = value
        AppToast.show(this, "Capture Auto Mode636: $value")
    }
}

// v636: Caret Auto Blink636
internal fun PlayerActivity.showV636CaretAutoBlink636Toggle() {
    val current = BiliClient.prefs.v636caretAutoBlink636
    BiliClient.prefs.v636caretAutoBlink636 = !current
    AppToast.show(this, "Caret Auto Blink636: ${if (!current) "ON" else "OFF"}")
}

// v636: Case Auto Convert636
internal fun PlayerActivity.showV636CaseAutoConvert636Toggle() {
    val current = BiliClient.prefs.v636caseAutoConvert636
    BiliClient.prefs.v636caseAutoConvert636 = !current
    AppToast.show(this, "Case Auto Convert636: ${if (!current) "ON" else "OFF"}")
}

// v636: Category Auto Sort636
internal fun PlayerActivity.showV636CategoryAutoSort636Toggle() {
    val current = BiliClient.prefs.v636categoryAutoSort636
    BiliClient.prefs.v636categoryAutoSort636 = !current
    AppToast.show(this, "Category Auto Sort636: ${if (!current) "ON" else "OFF"}")
}

// v637: Browse Auto History637
internal fun PlayerActivity.showV637BrowseAutoHistory637Toggle() {
    val current = BiliClient.prefs.v637browseAutoHistory637
    BiliClient.prefs.v637browseAutoHistory637 = !current
    AppToast.show(this, "Browse Auto History637: ${if (!current) "ON" else "OFF"}")
}

// v637: Bucket Auto Clean637
internal fun PlayerActivity.showV637BucketAutoClean637Toggle() {
    val current = BiliClient.prefs.v637bucketAutoClean637
    BiliClient.prefs.v637bucketAutoClean637 = !current
    AppToast.show(this, "Bucket Auto Clean637: ${if (!current) "ON" else "OFF"}")
}

// v637: Build Auto Version637
internal fun PlayerActivity.showV637BuildAutoVersion637Toggle() {
    val current = BiliClient.prefs.v637buildAutoVersion637
    BiliClient.prefs.v637buildAutoVersion637 = !current
    AppToast.show(this, "Build Auto Version637: ${if (!current) "ON" else "OFF"}")
}

// v637: Bulk Auto Import637
internal fun PlayerActivity.showV637BulkAutoImport637Toggle() {
    val current = BiliClient.prefs.v637bulkAutoImport637
    BiliClient.prefs.v637bulkAutoImport637 = !current
    AppToast.show(this, "Bulk Auto Import637: ${if (!current) "ON" else "OFF"}")
}

// v637: Button Auto Haptic637
internal fun PlayerActivity.showV637ButtonAutoHaptic637Toggle() {
    val current = BiliClient.prefs.v637buttonAutoHaptic637
    BiliClient.prefs.v637buttonAutoHaptic637 = !current
    AppToast.show(this, "Button Auto Haptic637: ${if (!current) "ON" else "OFF"}")
}

// v637: Byte Auto Convert637
internal fun PlayerActivity.showV637ByteAutoConvert637Toggle() {
    val current = BiliClient.prefs.v637byteAutoConvert637
    BiliClient.prefs.v637byteAutoConvert637 = !current
    AppToast.show(this, "Byte Auto Convert637: ${if (!current) "ON" else "OFF"}")
}

// v637: Calibrate Auto Color637
internal fun PlayerActivity.showV637CalibrateAutoColor637Toggle() {
    val current = BiliClient.prefs.v637calibrateAutoColor637
    BiliClient.prefs.v637calibrateAutoColor637 = !current
    AppToast.show(this, "Calibrate Auto Color637: ${if (!current) "ON" else "OFF"}")
}

// v637: Call Auto Log637
internal fun PlayerActivity.showV637CallAutoLog637Toggle() {
    val current = BiliClient.prefs.v637callAutoLog637
    BiliClient.prefs.v637callAutoLog637 = !current
    AppToast.show(this, "Call Auto Log637: ${if (!current) "ON" else "OFF"}")
}

// v637: Camera Auto Focus637
internal fun PlayerActivity.showV637CameraAutoFocus637Toggle() {
    val current = BiliClient.prefs.v637cameraAutoFocus637
    BiliClient.prefs.v637cameraAutoFocus637 = !current
    AppToast.show(this, "Camera Auto Focus637: ${if (!current) "ON" else "OFF"}")
}

// v637: Campus Auto Select637
internal fun PlayerActivity.showV637CampusAutoSelect637Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v637campusAutoSelect637).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select637",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v637campusAutoSelect637 = value
        AppToast.show(this, "Campus Auto Select637: $value")
    }
}

// v637: Cancel Auto Undo637
internal fun PlayerActivity.showV637CancelAutoUndo637Toggle() {
    val current = BiliClient.prefs.v637cancelAutoUndo637
    BiliClient.prefs.v637cancelAutoUndo637 = !current
    AppToast.show(this, "Cancel Auto Undo637: ${if (!current) "ON" else "OFF"}")
}

// v637: Capture Auto Mode637
internal fun PlayerActivity.showV637CaptureAutoMode637Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v637captureAutoMode637).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode637",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v637captureAutoMode637 = value
        AppToast.show(this, "Capture Auto Mode637: $value")
    }
}

// v637: Caret Auto Blink637
internal fun PlayerActivity.showV637CaretAutoBlink637Toggle() {
    val current = BiliClient.prefs.v637caretAutoBlink637
    BiliClient.prefs.v637caretAutoBlink637 = !current
    AppToast.show(this, "Caret Auto Blink637: ${if (!current) "ON" else "OFF"}")
}

// v637: Case Auto Convert637
internal fun PlayerActivity.showV637CaseAutoConvert637Toggle() {
    val current = BiliClient.prefs.v637caseAutoConvert637
    BiliClient.prefs.v637caseAutoConvert637 = !current
    AppToast.show(this, "Case Auto Convert637: ${if (!current) "ON" else "OFF"}")
}

// v637: Category Auto Sort637
internal fun PlayerActivity.showV637CategoryAutoSort637Toggle() {
    val current = BiliClient.prefs.v637categoryAutoSort637
    BiliClient.prefs.v637categoryAutoSort637 = !current
    AppToast.show(this, "Category Auto Sort637: ${if (!current) "ON" else "OFF"}")
}

// v638: Browse Auto History638
internal fun PlayerActivity.showV638BrowseAutoHistory638Toggle() {
    val current = BiliClient.prefs.v638browseAutoHistory638
    BiliClient.prefs.v638browseAutoHistory638 = !current
    AppToast.show(this, "Browse Auto History638: ${if (!current) "ON" else "OFF"}")
}

// v638: Bucket Auto Clean638
internal fun PlayerActivity.showV638BucketAutoClean638Toggle() {
    val current = BiliClient.prefs.v638bucketAutoClean638
    BiliClient.prefs.v638bucketAutoClean638 = !current
    AppToast.show(this, "Bucket Auto Clean638: ${if (!current) "ON" else "OFF"}")
}

// v638: Build Auto Version638
internal fun PlayerActivity.showV638BuildAutoVersion638Toggle() {
    val current = BiliClient.prefs.v638buildAutoVersion638
    BiliClient.prefs.v638buildAutoVersion638 = !current
    AppToast.show(this, "Build Auto Version638: ${if (!current) "ON" else "OFF"}")
}

// v638: Bulk Auto Import638
internal fun PlayerActivity.showV638BulkAutoImport638Toggle() {
    val current = BiliClient.prefs.v638bulkAutoImport638
    BiliClient.prefs.v638bulkAutoImport638 = !current
    AppToast.show(this, "Bulk Auto Import638: ${if (!current) "ON" else "OFF"}")
}

// v638: Button Auto Haptic638
internal fun PlayerActivity.showV638ButtonAutoHaptic638Toggle() {
    val current = BiliClient.prefs.v638buttonAutoHaptic638
    BiliClient.prefs.v638buttonAutoHaptic638 = !current
    AppToast.show(this, "Button Auto Haptic638: ${if (!current) "ON" else "OFF"}")
}

// v638: Byte Auto Convert638
internal fun PlayerActivity.showV638ByteAutoConvert638Toggle() {
    val current = BiliClient.prefs.v638byteAutoConvert638
    BiliClient.prefs.v638byteAutoConvert638 = !current
    AppToast.show(this, "Byte Auto Convert638: ${if (!current) "ON" else "OFF"}")
}

// v638: Calibrate Auto Color638
internal fun PlayerActivity.showV638CalibrateAutoColor638Toggle() {
    val current = BiliClient.prefs.v638calibrateAutoColor638
    BiliClient.prefs.v638calibrateAutoColor638 = !current
    AppToast.show(this, "Calibrate Auto Color638: ${if (!current) "ON" else "OFF"}")
}

// v638: Call Auto Log638
internal fun PlayerActivity.showV638CallAutoLog638Toggle() {
    val current = BiliClient.prefs.v638callAutoLog638
    BiliClient.prefs.v638callAutoLog638 = !current
    AppToast.show(this, "Call Auto Log638: ${if (!current) "ON" else "OFF"}")
}

// v638: Camera Auto Focus638
internal fun PlayerActivity.showV638CameraAutoFocus638Toggle() {
    val current = BiliClient.prefs.v638cameraAutoFocus638
    BiliClient.prefs.v638cameraAutoFocus638 = !current
    AppToast.show(this, "Camera Auto Focus638: ${if (!current) "ON" else "OFF"}")
}

// v638: Campus Auto Select638
internal fun PlayerActivity.showV638CampusAutoSelect638Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v638campusAutoSelect638).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select638",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v638campusAutoSelect638 = value
        AppToast.show(this, "Campus Auto Select638: $value")
    }
}

// v638: Cancel Auto Undo638
internal fun PlayerActivity.showV638CancelAutoUndo638Toggle() {
    val current = BiliClient.prefs.v638cancelAutoUndo638
    BiliClient.prefs.v638cancelAutoUndo638 = !current
    AppToast.show(this, "Cancel Auto Undo638: ${if (!current) "ON" else "OFF"}")
}

// v638: Capture Auto Mode638
internal fun PlayerActivity.showV638CaptureAutoMode638Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v638captureAutoMode638).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode638",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v638captureAutoMode638 = value
        AppToast.show(this, "Capture Auto Mode638: $value")
    }
}

// v638: Caret Auto Blink638
internal fun PlayerActivity.showV638CaretAutoBlink638Toggle() {
    val current = BiliClient.prefs.v638caretAutoBlink638
    BiliClient.prefs.v638caretAutoBlink638 = !current
    AppToast.show(this, "Caret Auto Blink638: ${if (!current) "ON" else "OFF"}")
}

// v638: Case Auto Convert638
internal fun PlayerActivity.showV638CaseAutoConvert638Toggle() {
    val current = BiliClient.prefs.v638caseAutoConvert638
    BiliClient.prefs.v638caseAutoConvert638 = !current
    AppToast.show(this, "Case Auto Convert638: ${if (!current) "ON" else "OFF"}")
}

// v638: Category Auto Sort638
internal fun PlayerActivity.showV638CategoryAutoSort638Toggle() {
    val current = BiliClient.prefs.v638categoryAutoSort638
    BiliClient.prefs.v638categoryAutoSort638 = !current
    AppToast.show(this, "Category Auto Sort638: ${if (!current) "ON" else "OFF"}")
}

// v639: Browse Auto History639
internal fun PlayerActivity.showV639BrowseAutoHistory639Toggle() {
    val current = BiliClient.prefs.v639browseAutoHistory639
    BiliClient.prefs.v639browseAutoHistory639 = !current
    AppToast.show(this, "Browse Auto History639: ${if (!current) "ON" else "OFF"}")
}

// v639: Bucket Auto Clean639
internal fun PlayerActivity.showV639BucketAutoClean639Toggle() {
    val current = BiliClient.prefs.v639bucketAutoClean639
    BiliClient.prefs.v639bucketAutoClean639 = !current
    AppToast.show(this, "Bucket Auto Clean639: ${if (!current) "ON" else "OFF"}")
}

// v639: Build Auto Version639
internal fun PlayerActivity.showV639BuildAutoVersion639Toggle() {
    val current = BiliClient.prefs.v639buildAutoVersion639
    BiliClient.prefs.v639buildAutoVersion639 = !current
    AppToast.show(this, "Build Auto Version639: ${if (!current) "ON" else "OFF"}")
}

// v639: Bulk Auto Import639
internal fun PlayerActivity.showV639BulkAutoImport639Toggle() {
    val current = BiliClient.prefs.v639bulkAutoImport639
    BiliClient.prefs.v639bulkAutoImport639 = !current
    AppToast.show(this, "Bulk Auto Import639: ${if (!current) "ON" else "OFF"}")
}

// v639: Button Auto Haptic639
internal fun PlayerActivity.showV639ButtonAutoHaptic639Toggle() {
    val current = BiliClient.prefs.v639buttonAutoHaptic639
    BiliClient.prefs.v639buttonAutoHaptic639 = !current
    AppToast.show(this, "Button Auto Haptic639: ${if (!current) "ON" else "OFF"}")
}

// v639: Byte Auto Convert639
internal fun PlayerActivity.showV639ByteAutoConvert639Toggle() {
    val current = BiliClient.prefs.v639byteAutoConvert639
    BiliClient.prefs.v639byteAutoConvert639 = !current
    AppToast.show(this, "Byte Auto Convert639: ${if (!current) "ON" else "OFF"}")
}

// v639: Calibrate Auto Color639
internal fun PlayerActivity.showV639CalibrateAutoColor639Toggle() {
    val current = BiliClient.prefs.v639calibrateAutoColor639
    BiliClient.prefs.v639calibrateAutoColor639 = !current
    AppToast.show(this, "Calibrate Auto Color639: ${if (!current) "ON" else "OFF"}")
}

// v639: Call Auto Log639
internal fun PlayerActivity.showV639CallAutoLog639Toggle() {
    val current = BiliClient.prefs.v639callAutoLog639
    BiliClient.prefs.v639callAutoLog639 = !current
    AppToast.show(this, "Call Auto Log639: ${if (!current) "ON" else "OFF"}")
}

// v639: Camera Auto Focus639
internal fun PlayerActivity.showV639CameraAutoFocus639Toggle() {
    val current = BiliClient.prefs.v639cameraAutoFocus639
    BiliClient.prefs.v639cameraAutoFocus639 = !current
    AppToast.show(this, "Camera Auto Focus639: ${if (!current) "ON" else "OFF"}")
}

// v639: Campus Auto Select639
internal fun PlayerActivity.showV639CampusAutoSelect639Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v639campusAutoSelect639).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select639",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v639campusAutoSelect639 = value
        AppToast.show(this, "Campus Auto Select639: $value")
    }
}

// v639: Cancel Auto Undo639
internal fun PlayerActivity.showV639CancelAutoUndo639Toggle() {
    val current = BiliClient.prefs.v639cancelAutoUndo639
    BiliClient.prefs.v639cancelAutoUndo639 = !current
    AppToast.show(this, "Cancel Auto Undo639: ${if (!current) "ON" else "OFF"}")
}

// v639: Capture Auto Mode639
internal fun PlayerActivity.showV639CaptureAutoMode639Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v639captureAutoMode639).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode639",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v639captureAutoMode639 = value
        AppToast.show(this, "Capture Auto Mode639: $value")
    }
}

// v639: Caret Auto Blink639
internal fun PlayerActivity.showV639CaretAutoBlink639Toggle() {
    val current = BiliClient.prefs.v639caretAutoBlink639
    BiliClient.prefs.v639caretAutoBlink639 = !current
    AppToast.show(this, "Caret Auto Blink639: ${if (!current) "ON" else "OFF"}")
}

// v639: Case Auto Convert639
internal fun PlayerActivity.showV639CaseAutoConvert639Toggle() {
    val current = BiliClient.prefs.v639caseAutoConvert639
    BiliClient.prefs.v639caseAutoConvert639 = !current
    AppToast.show(this, "Case Auto Convert639: ${if (!current) "ON" else "OFF"}")
}

// v639: Category Auto Sort639
internal fun PlayerActivity.showV639CategoryAutoSort639Toggle() {
    val current = BiliClient.prefs.v639categoryAutoSort639
    BiliClient.prefs.v639categoryAutoSort639 = !current
    AppToast.show(this, "Category Auto Sort639: ${if (!current) "ON" else "OFF"}")
}

// v640: Browse Auto History640
internal fun PlayerActivity.showV640BrowseAutoHistory640Toggle() {
    val current = BiliClient.prefs.v640browseAutoHistory640
    BiliClient.prefs.v640browseAutoHistory640 = !current
    AppToast.show(this, "Browse Auto History640: ${if (!current) "ON" else "OFF"}")
}

// v640: Bucket Auto Clean640
internal fun PlayerActivity.showV640BucketAutoClean640Toggle() {
    val current = BiliClient.prefs.v640bucketAutoClean640
    BiliClient.prefs.v640bucketAutoClean640 = !current
    AppToast.show(this, "Bucket Auto Clean640: ${if (!current) "ON" else "OFF"}")
}

// v640: Build Auto Version640
internal fun PlayerActivity.showV640BuildAutoVersion640Toggle() {
    val current = BiliClient.prefs.v640buildAutoVersion640
    BiliClient.prefs.v640buildAutoVersion640 = !current
    AppToast.show(this, "Build Auto Version640: ${if (!current) "ON" else "OFF"}")
}

// v640: Bulk Auto Import640
internal fun PlayerActivity.showV640BulkAutoImport640Toggle() {
    val current = BiliClient.prefs.v640bulkAutoImport640
    BiliClient.prefs.v640bulkAutoImport640 = !current
    AppToast.show(this, "Bulk Auto Import640: ${if (!current) "ON" else "OFF"}")
}

// v640: Button Auto Haptic640
internal fun PlayerActivity.showV640ButtonAutoHaptic640Toggle() {
    val current = BiliClient.prefs.v640buttonAutoHaptic640
    BiliClient.prefs.v640buttonAutoHaptic640 = !current
    AppToast.show(this, "Button Auto Haptic640: ${if (!current) "ON" else "OFF"}")
}

// v640: Byte Auto Convert640
internal fun PlayerActivity.showV640ByteAutoConvert640Toggle() {
    val current = BiliClient.prefs.v640byteAutoConvert640
    BiliClient.prefs.v640byteAutoConvert640 = !current
    AppToast.show(this, "Byte Auto Convert640: ${if (!current) "ON" else "OFF"}")
}

// v640: Calibrate Auto Color640
internal fun PlayerActivity.showV640CalibrateAutoColor640Toggle() {
    val current = BiliClient.prefs.v640calibrateAutoColor640
    BiliClient.prefs.v640calibrateAutoColor640 = !current
    AppToast.show(this, "Calibrate Auto Color640: ${if (!current) "ON" else "OFF"}")
}

// v640: Call Auto Log640
internal fun PlayerActivity.showV640CallAutoLog640Toggle() {
    val current = BiliClient.prefs.v640callAutoLog640
    BiliClient.prefs.v640callAutoLog640 = !current
    AppToast.show(this, "Call Auto Log640: ${if (!current) "ON" else "OFF"}")
}

// v640: Camera Auto Focus640
internal fun PlayerActivity.showV640CameraAutoFocus640Toggle() {
    val current = BiliClient.prefs.v640cameraAutoFocus640
    BiliClient.prefs.v640cameraAutoFocus640 = !current
    AppToast.show(this, "Camera Auto Focus640: ${if (!current) "ON" else "OFF"}")
}

// v640: Campus Auto Select640
internal fun PlayerActivity.showV640CampusAutoSelect640Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v640campusAutoSelect640).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select640",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v640campusAutoSelect640 = value
        AppToast.show(this, "Campus Auto Select640: $value")
    }
}

// v640: Cancel Auto Undo640
internal fun PlayerActivity.showV640CancelAutoUndo640Toggle() {
    val current = BiliClient.prefs.v640cancelAutoUndo640
    BiliClient.prefs.v640cancelAutoUndo640 = !current
    AppToast.show(this, "Cancel Auto Undo640: ${if (!current) "ON" else "OFF"}")
}

// v640: Capture Auto Mode640
internal fun PlayerActivity.showV640CaptureAutoMode640Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v640captureAutoMode640).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode640",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v640captureAutoMode640 = value
        AppToast.show(this, "Capture Auto Mode640: $value")
    }
}

// v640: Caret Auto Blink640
internal fun PlayerActivity.showV640CaretAutoBlink640Toggle() {
    val current = BiliClient.prefs.v640caretAutoBlink640
    BiliClient.prefs.v640caretAutoBlink640 = !current
    AppToast.show(this, "Caret Auto Blink640: ${if (!current) "ON" else "OFF"}")
}

// v640: Case Auto Convert640
internal fun PlayerActivity.showV640CaseAutoConvert640Toggle() {
    val current = BiliClient.prefs.v640caseAutoConvert640
    BiliClient.prefs.v640caseAutoConvert640 = !current
    AppToast.show(this, "Case Auto Convert640: ${if (!current) "ON" else "OFF"}")
}

// v640: Category Auto Sort640
internal fun PlayerActivity.showV640CategoryAutoSort640Toggle() {
    val current = BiliClient.prefs.v640categoryAutoSort640
    BiliClient.prefs.v640categoryAutoSort640 = !current
    AppToast.show(this, "Category Auto Sort640: ${if (!current) "ON" else "OFF"}")
}

// v641: Cell Auto Merge641
internal fun PlayerActivity.showV641CellAutoMerge641Toggle() {
    val current = BiliClient.prefs.v641cellAutoMerge641
    BiliClient.prefs.v641cellAutoMerge641 = !current
    AppToast.show(this, "Cell Auto Merge641: ${if (!current) "ON" else "OFF"}")
}

// v641: Center Auto Gravity641
internal fun PlayerActivity.showV641CenterAutoGravity641Toggle() {
    val current = BiliClient.prefs.v641centerAutoGravity641
    BiliClient.prefs.v641centerAutoGravity641 = !current
    AppToast.show(this, "Center Auto Gravity641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chain Auto Link641
internal fun PlayerActivity.showV641ChainAutoLink641Toggle() {
    val current = BiliClient.prefs.v641chainAutoLink641
    BiliClient.prefs.v641chainAutoLink641 = !current
    AppToast.show(this, "Chain Auto Link641: ${if (!current) "ON" else "OFF"}")
}

// v641: Challenge Auto Join641
internal fun PlayerActivity.showV641ChallengeAutoJoin641Toggle() {
    val current = BiliClient.prefs.v641challengeAutoJoin641
    BiliClient.prefs.v641challengeAutoJoin641 = !current
    AppToast.show(this, "Challenge Auto Join641: ${if (!current) "ON" else "OFF"}")
}

// v641: Change Auto Track641
internal fun PlayerActivity.showV641ChangeAutoTrack641Toggle() {
    val current = BiliClient.prefs.v641changeAutoTrack641
    BiliClient.prefs.v641changeAutoTrack641 = !current
    AppToast.show(this, "Change Auto Track641: ${if (!current) "ON" else "OFF"}")
}

// v641: Channel Auto Switch641
internal fun PlayerActivity.showV641ChannelAutoSwitch641Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v641channelAutoSwitch641).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch641",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v641channelAutoSwitch641 = value
        AppToast.show(this, "Channel Auto Switch641: $value")
    }
}

// v641: Chapter Auto Mark641
internal fun PlayerActivity.showV641ChapterAutoMark641Toggle() {
    val current = BiliClient.prefs.v641chapterAutoMark641
    BiliClient.prefs.v641chapterAutoMark641 = !current
    AppToast.show(this, "Chapter Auto Mark641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chart Auto Render641
internal fun PlayerActivity.showV641ChartAutoRender641Toggle() {
    val current = BiliClient.prefs.v641chartAutoRender641
    BiliClient.prefs.v641chartAutoRender641 = !current
    AppToast.show(this, "Chart Auto Render641: ${if (!current) "ON" else "OFF"}")
}

// v641: Check Auto Verify641
internal fun PlayerActivity.showV641CheckAutoVerify641Toggle() {
    val current = BiliClient.prefs.v641checkAutoVerify641
    BiliClient.prefs.v641checkAutoVerify641 = !current
    AppToast.show(this, "Check Auto Verify641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chip Auto Tag641
internal fun PlayerActivity.showV641ChipAutoTag641Toggle() {
    val current = BiliClient.prefs.v641chipAutoTag641
    BiliClient.prefs.v641chipAutoTag641 = !current
    AppToast.show(this, "Chip Auto Tag641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chunk Auto Split641
internal fun PlayerActivity.showV641ChunkAutoSplit641Toggle() {
    val current = BiliClient.prefs.v641chunkAutoSplit641
    BiliClient.prefs.v641chunkAutoSplit641 = !current
    AppToast.show(this, "Chunk Auto Split641: ${if (!current) "ON" else "OFF"}")
}

// v641: Cipher Auto Encrypt641
internal fun PlayerActivity.showV641CipherAutoEncrypt641Toggle() {
    val current = BiliClient.prefs.v641cipherAutoEncrypt641
    BiliClient.prefs.v641cipherAutoEncrypt641 = !current
    AppToast.show(this, "Cipher Auto Encrypt641: ${if (!current) "ON" else "OFF"}")
}

// v641: Circle Auto Clip641
internal fun PlayerActivity.showV641CircleAutoClip641Toggle() {
    val current = BiliClient.prefs.v641circleAutoClip641
    BiliClient.prefs.v641circleAutoClip641 = !current
    AppToast.show(this, "Circle Auto Clip641: ${if (!current) "ON" else "OFF"}")
}

// v641: Clamp Auto Value641
internal fun PlayerActivity.showV641ClampAutoValue641Toggle() {
    val current = BiliClient.prefs.v641clampAutoValue641
    BiliClient.prefs.v641clampAutoValue641 = !current
    AppToast.show(this, "Clamp Auto Value641: ${if (!current) "ON" else "OFF"}")
}

// v641: Class Auto Load641
internal fun PlayerActivity.showV641ClassAutoLoad641Toggle() {
    val current = BiliClient.prefs.v641classAutoLoad641
    BiliClient.prefs.v641classAutoLoad641 = !current
    AppToast.show(this, "Class Auto Load641: ${if (!current) "ON" else "OFF"}")
}

// v642: Cell Auto Merge642
internal fun PlayerActivity.showV642CellAutoMerge642Toggle() {
    val current = BiliClient.prefs.v642cellAutoMerge642
    BiliClient.prefs.v642cellAutoMerge642 = !current
    AppToast.show(this, "Cell Auto Merge642: ${if (!current) "ON" else "OFF"}")
}

// v642: Center Auto Gravity642
internal fun PlayerActivity.showV642CenterAutoGravity642Toggle() {
    val current = BiliClient.prefs.v642centerAutoGravity642
    BiliClient.prefs.v642centerAutoGravity642 = !current
    AppToast.show(this, "Center Auto Gravity642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chain Auto Link642
internal fun PlayerActivity.showV642ChainAutoLink642Toggle() {
    val current = BiliClient.prefs.v642chainAutoLink642
    BiliClient.prefs.v642chainAutoLink642 = !current
    AppToast.show(this, "Chain Auto Link642: ${if (!current) "ON" else "OFF"}")
}

// v642: Challenge Auto Join642
internal fun PlayerActivity.showV642ChallengeAutoJoin642Toggle() {
    val current = BiliClient.prefs.v642challengeAutoJoin642
    BiliClient.prefs.v642challengeAutoJoin642 = !current
    AppToast.show(this, "Challenge Auto Join642: ${if (!current) "ON" else "OFF"}")
}

// v642: Change Auto Track642
internal fun PlayerActivity.showV642ChangeAutoTrack642Toggle() {
    val current = BiliClient.prefs.v642changeAutoTrack642
    BiliClient.prefs.v642changeAutoTrack642 = !current
    AppToast.show(this, "Change Auto Track642: ${if (!current) "ON" else "OFF"}")
}

// v642: Channel Auto Switch642
internal fun PlayerActivity.showV642ChannelAutoSwitch642Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v642channelAutoSwitch642).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch642",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v642channelAutoSwitch642 = value
        AppToast.show(this, "Channel Auto Switch642: $value")
    }
}

// v642: Chapter Auto Mark642
internal fun PlayerActivity.showV642ChapterAutoMark642Toggle() {
    val current = BiliClient.prefs.v642chapterAutoMark642
    BiliClient.prefs.v642chapterAutoMark642 = !current
    AppToast.show(this, "Chapter Auto Mark642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chart Auto Render642
internal fun PlayerActivity.showV642ChartAutoRender642Toggle() {
    val current = BiliClient.prefs.v642chartAutoRender642
    BiliClient.prefs.v642chartAutoRender642 = !current
    AppToast.show(this, "Chart Auto Render642: ${if (!current) "ON" else "OFF"}")
}

// v642: Check Auto Verify642
internal fun PlayerActivity.showV642CheckAutoVerify642Toggle() {
    val current = BiliClient.prefs.v642checkAutoVerify642
    BiliClient.prefs.v642checkAutoVerify642 = !current
    AppToast.show(this, "Check Auto Verify642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chip Auto Tag642
internal fun PlayerActivity.showV642ChipAutoTag642Toggle() {
    val current = BiliClient.prefs.v642chipAutoTag642
    BiliClient.prefs.v642chipAutoTag642 = !current
    AppToast.show(this, "Chip Auto Tag642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chunk Auto Split642
internal fun PlayerActivity.showV642ChunkAutoSplit642Toggle() {
    val current = BiliClient.prefs.v642chunkAutoSplit642
    BiliClient.prefs.v642chunkAutoSplit642 = !current
    AppToast.show(this, "Chunk Auto Split642: ${if (!current) "ON" else "OFF"}")
}

// v642: Cipher Auto Encrypt642
internal fun PlayerActivity.showV642CipherAutoEncrypt642Toggle() {
    val current = BiliClient.prefs.v642cipherAutoEncrypt642
    BiliClient.prefs.v642cipherAutoEncrypt642 = !current
    AppToast.show(this, "Cipher Auto Encrypt642: ${if (!current) "ON" else "OFF"}")
}

// v642: Circle Auto Clip642
internal fun PlayerActivity.showV642CircleAutoClip642Toggle() {
    val current = BiliClient.prefs.v642circleAutoClip642
    BiliClient.prefs.v642circleAutoClip642 = !current
    AppToast.show(this, "Circle Auto Clip642: ${if (!current) "ON" else "OFF"}")
}

// v642: Clamp Auto Value642
internal fun PlayerActivity.showV642ClampAutoValue642Toggle() {
    val current = BiliClient.prefs.v642clampAutoValue642
    BiliClient.prefs.v642clampAutoValue642 = !current
    AppToast.show(this, "Clamp Auto Value642: ${if (!current) "ON" else "OFF"}")
}

// v642: Class Auto Load642
internal fun PlayerActivity.showV642ClassAutoLoad642Toggle() {
    val current = BiliClient.prefs.v642classAutoLoad642
    BiliClient.prefs.v642classAutoLoad642 = !current
    AppToast.show(this, "Class Auto Load642: ${if (!current) "ON" else "OFF"}")
}

// v643: Cell Auto Merge643
internal fun PlayerActivity.showV643CellAutoMerge643Toggle() {
    val current = BiliClient.prefs.v643cellAutoMerge643
    BiliClient.prefs.v643cellAutoMerge643 = !current
    AppToast.show(this, "Cell Auto Merge643: ${if (!current) "ON" else "OFF"}")
}

// v643: Center Auto Gravity643
internal fun PlayerActivity.showV643CenterAutoGravity643Toggle() {
    val current = BiliClient.prefs.v643centerAutoGravity643
    BiliClient.prefs.v643centerAutoGravity643 = !current
    AppToast.show(this, "Center Auto Gravity643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chain Auto Link643
internal fun PlayerActivity.showV643ChainAutoLink643Toggle() {
    val current = BiliClient.prefs.v643chainAutoLink643
    BiliClient.prefs.v643chainAutoLink643 = !current
    AppToast.show(this, "Chain Auto Link643: ${if (!current) "ON" else "OFF"}")
}

// v643: Challenge Auto Join643
internal fun PlayerActivity.showV643ChallengeAutoJoin643Toggle() {
    val current = BiliClient.prefs.v643challengeAutoJoin643
    BiliClient.prefs.v643challengeAutoJoin643 = !current
    AppToast.show(this, "Challenge Auto Join643: ${if (!current) "ON" else "OFF"}")
}

// v643: Change Auto Track643
internal fun PlayerActivity.showV643ChangeAutoTrack643Toggle() {
    val current = BiliClient.prefs.v643changeAutoTrack643
    BiliClient.prefs.v643changeAutoTrack643 = !current
    AppToast.show(this, "Change Auto Track643: ${if (!current) "ON" else "OFF"}")
}

// v643: Channel Auto Switch643
internal fun PlayerActivity.showV643ChannelAutoSwitch643Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v643channelAutoSwitch643).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch643",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v643channelAutoSwitch643 = value
        AppToast.show(this, "Channel Auto Switch643: $value")
    }
}

// v643: Chapter Auto Mark643
internal fun PlayerActivity.showV643ChapterAutoMark643Toggle() {
    val current = BiliClient.prefs.v643chapterAutoMark643
    BiliClient.prefs.v643chapterAutoMark643 = !current
    AppToast.show(this, "Chapter Auto Mark643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chart Auto Render643
internal fun PlayerActivity.showV643ChartAutoRender643Toggle() {
    val current = BiliClient.prefs.v643chartAutoRender643
    BiliClient.prefs.v643chartAutoRender643 = !current
    AppToast.show(this, "Chart Auto Render643: ${if (!current) "ON" else "OFF"}")
}

// v643: Check Auto Verify643
internal fun PlayerActivity.showV643CheckAutoVerify643Toggle() {
    val current = BiliClient.prefs.v643checkAutoVerify643
    BiliClient.prefs.v643checkAutoVerify643 = !current
    AppToast.show(this, "Check Auto Verify643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chip Auto Tag643
internal fun PlayerActivity.showV643ChipAutoTag643Toggle() {
    val current = BiliClient.prefs.v643chipAutoTag643
    BiliClient.prefs.v643chipAutoTag643 = !current
    AppToast.show(this, "Chip Auto Tag643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chunk Auto Split643
internal fun PlayerActivity.showV643ChunkAutoSplit643Toggle() {
    val current = BiliClient.prefs.v643chunkAutoSplit643
    BiliClient.prefs.v643chunkAutoSplit643 = !current
    AppToast.show(this, "Chunk Auto Split643: ${if (!current) "ON" else "OFF"}")
}

// v643: Cipher Auto Encrypt643
internal fun PlayerActivity.showV643CipherAutoEncrypt643Toggle() {
    val current = BiliClient.prefs.v643cipherAutoEncrypt643
    BiliClient.prefs.v643cipherAutoEncrypt643 = !current
    AppToast.show(this, "Cipher Auto Encrypt643: ${if (!current) "ON" else "OFF"}")
}

// v643: Circle Auto Clip643
internal fun PlayerActivity.showV643CircleAutoClip643Toggle() {
    val current = BiliClient.prefs.v643circleAutoClip643
    BiliClient.prefs.v643circleAutoClip643 = !current
    AppToast.show(this, "Circle Auto Clip643: ${if (!current) "ON" else "OFF"}")
}

// v643: Clamp Auto Value643
internal fun PlayerActivity.showV643ClampAutoValue643Toggle() {
    val current = BiliClient.prefs.v643clampAutoValue643
    BiliClient.prefs.v643clampAutoValue643 = !current
    AppToast.show(this, "Clamp Auto Value643: ${if (!current) "ON" else "OFF"}")
}

// v643: Class Auto Load643
internal fun PlayerActivity.showV643ClassAutoLoad643Toggle() {
    val current = BiliClient.prefs.v643classAutoLoad643
    BiliClient.prefs.v643classAutoLoad643 = !current
    AppToast.show(this, "Class Auto Load643: ${if (!current) "ON" else "OFF"}")
}

// v644: Cell Auto Merge644
internal fun PlayerActivity.showV644CellAutoMerge644Toggle() {
    val current = BiliClient.prefs.v644cellAutoMerge644
    BiliClient.prefs.v644cellAutoMerge644 = !current
    AppToast.show(this, "Cell Auto Merge644: ${if (!current) "ON" else "OFF"}")
}

// v644: Center Auto Gravity644
internal fun PlayerActivity.showV644CenterAutoGravity644Toggle() {
    val current = BiliClient.prefs.v644centerAutoGravity644
    BiliClient.prefs.v644centerAutoGravity644 = !current
    AppToast.show(this, "Center Auto Gravity644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chain Auto Link644
internal fun PlayerActivity.showV644ChainAutoLink644Toggle() {
    val current = BiliClient.prefs.v644chainAutoLink644
    BiliClient.prefs.v644chainAutoLink644 = !current
    AppToast.show(this, "Chain Auto Link644: ${if (!current) "ON" else "OFF"}")
}

// v644: Challenge Auto Join644
internal fun PlayerActivity.showV644ChallengeAutoJoin644Toggle() {
    val current = BiliClient.prefs.v644challengeAutoJoin644
    BiliClient.prefs.v644challengeAutoJoin644 = !current
    AppToast.show(this, "Challenge Auto Join644: ${if (!current) "ON" else "OFF"}")
}

// v644: Change Auto Track644
internal fun PlayerActivity.showV644ChangeAutoTrack644Toggle() {
    val current = BiliClient.prefs.v644changeAutoTrack644
    BiliClient.prefs.v644changeAutoTrack644 = !current
    AppToast.show(this, "Change Auto Track644: ${if (!current) "ON" else "OFF"}")
}

// v644: Channel Auto Switch644
internal fun PlayerActivity.showV644ChannelAutoSwitch644Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v644channelAutoSwitch644).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch644",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v644channelAutoSwitch644 = value
        AppToast.show(this, "Channel Auto Switch644: $value")
    }
}

// v644: Chapter Auto Mark644
internal fun PlayerActivity.showV644ChapterAutoMark644Toggle() {
    val current = BiliClient.prefs.v644chapterAutoMark644
    BiliClient.prefs.v644chapterAutoMark644 = !current
    AppToast.show(this, "Chapter Auto Mark644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chart Auto Render644
internal fun PlayerActivity.showV644ChartAutoRender644Toggle() {
    val current = BiliClient.prefs.v644chartAutoRender644
    BiliClient.prefs.v644chartAutoRender644 = !current
    AppToast.show(this, "Chart Auto Render644: ${if (!current) "ON" else "OFF"}")
}

// v644: Check Auto Verify644
internal fun PlayerActivity.showV644CheckAutoVerify644Toggle() {
    val current = BiliClient.prefs.v644checkAutoVerify644
    BiliClient.prefs.v644checkAutoVerify644 = !current
    AppToast.show(this, "Check Auto Verify644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chip Auto Tag644
internal fun PlayerActivity.showV644ChipAutoTag644Toggle() {
    val current = BiliClient.prefs.v644chipAutoTag644
    BiliClient.prefs.v644chipAutoTag644 = !current
    AppToast.show(this, "Chip Auto Tag644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chunk Auto Split644
internal fun PlayerActivity.showV644ChunkAutoSplit644Toggle() {
    val current = BiliClient.prefs.v644chunkAutoSplit644
    BiliClient.prefs.v644chunkAutoSplit644 = !current
    AppToast.show(this, "Chunk Auto Split644: ${if (!current) "ON" else "OFF"}")
}

// v644: Cipher Auto Encrypt644
internal fun PlayerActivity.showV644CipherAutoEncrypt644Toggle() {
    val current = BiliClient.prefs.v644cipherAutoEncrypt644
    BiliClient.prefs.v644cipherAutoEncrypt644 = !current
    AppToast.show(this, "Cipher Auto Encrypt644: ${if (!current) "ON" else "OFF"}")
}

// v644: Circle Auto Clip644
internal fun PlayerActivity.showV644CircleAutoClip644Toggle() {
    val current = BiliClient.prefs.v644circleAutoClip644
    BiliClient.prefs.v644circleAutoClip644 = !current
    AppToast.show(this, "Circle Auto Clip644: ${if (!current) "ON" else "OFF"}")
}

// v644: Clamp Auto Value644
internal fun PlayerActivity.showV644ClampAutoValue644Toggle() {
    val current = BiliClient.prefs.v644clampAutoValue644
    BiliClient.prefs.v644clampAutoValue644 = !current
    AppToast.show(this, "Clamp Auto Value644: ${if (!current) "ON" else "OFF"}")
}

// v644: Class Auto Load644
internal fun PlayerActivity.showV644ClassAutoLoad644Toggle() {
    val current = BiliClient.prefs.v644classAutoLoad644
    BiliClient.prefs.v644classAutoLoad644 = !current
    AppToast.show(this, "Class Auto Load644: ${if (!current) "ON" else "OFF"}")
}

// v645: Cell Auto Merge645
internal fun PlayerActivity.showV645CellAutoMerge645Toggle() {
    val current = BiliClient.prefs.v645cellAutoMerge645
    BiliClient.prefs.v645cellAutoMerge645 = !current
    AppToast.show(this, "Cell Auto Merge645: ${if (!current) "ON" else "OFF"}")
}

// v645: Center Auto Gravity645
internal fun PlayerActivity.showV645CenterAutoGravity645Toggle() {
    val current = BiliClient.prefs.v645centerAutoGravity645
    BiliClient.prefs.v645centerAutoGravity645 = !current
    AppToast.show(this, "Center Auto Gravity645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chain Auto Link645
internal fun PlayerActivity.showV645ChainAutoLink645Toggle() {
    val current = BiliClient.prefs.v645chainAutoLink645
    BiliClient.prefs.v645chainAutoLink645 = !current
    AppToast.show(this, "Chain Auto Link645: ${if (!current) "ON" else "OFF"}")
}

// v645: Challenge Auto Join645
internal fun PlayerActivity.showV645ChallengeAutoJoin645Toggle() {
    val current = BiliClient.prefs.v645challengeAutoJoin645
    BiliClient.prefs.v645challengeAutoJoin645 = !current
    AppToast.show(this, "Challenge Auto Join645: ${if (!current) "ON" else "OFF"}")
}

// v645: Change Auto Track645
internal fun PlayerActivity.showV645ChangeAutoTrack645Toggle() {
    val current = BiliClient.prefs.v645changeAutoTrack645
    BiliClient.prefs.v645changeAutoTrack645 = !current
    AppToast.show(this, "Change Auto Track645: ${if (!current) "ON" else "OFF"}")
}

// v645: Channel Auto Switch645
internal fun PlayerActivity.showV645ChannelAutoSwitch645Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v645channelAutoSwitch645).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch645",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v645channelAutoSwitch645 = value
        AppToast.show(this, "Channel Auto Switch645: $value")
    }
}

// v645: Chapter Auto Mark645
internal fun PlayerActivity.showV645ChapterAutoMark645Toggle() {
    val current = BiliClient.prefs.v645chapterAutoMark645
    BiliClient.prefs.v645chapterAutoMark645 = !current
    AppToast.show(this, "Chapter Auto Mark645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chart Auto Render645
internal fun PlayerActivity.showV645ChartAutoRender645Toggle() {
    val current = BiliClient.prefs.v645chartAutoRender645
    BiliClient.prefs.v645chartAutoRender645 = !current
    AppToast.show(this, "Chart Auto Render645: ${if (!current) "ON" else "OFF"}")
}

// v645: Check Auto Verify645
internal fun PlayerActivity.showV645CheckAutoVerify645Toggle() {
    val current = BiliClient.prefs.v645checkAutoVerify645
    BiliClient.prefs.v645checkAutoVerify645 = !current
    AppToast.show(this, "Check Auto Verify645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chip Auto Tag645
internal fun PlayerActivity.showV645ChipAutoTag645Toggle() {
    val current = BiliClient.prefs.v645chipAutoTag645
    BiliClient.prefs.v645chipAutoTag645 = !current
    AppToast.show(this, "Chip Auto Tag645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chunk Auto Split645
internal fun PlayerActivity.showV645ChunkAutoSplit645Toggle() {
    val current = BiliClient.prefs.v645chunkAutoSplit645
    BiliClient.prefs.v645chunkAutoSplit645 = !current
    AppToast.show(this, "Chunk Auto Split645: ${if (!current) "ON" else "OFF"}")
}

// v645: Cipher Auto Encrypt645
internal fun PlayerActivity.showV645CipherAutoEncrypt645Toggle() {
    val current = BiliClient.prefs.v645cipherAutoEncrypt645
    BiliClient.prefs.v645cipherAutoEncrypt645 = !current
    AppToast.show(this, "Cipher Auto Encrypt645: ${if (!current) "ON" else "OFF"}")
}

// v645: Circle Auto Clip645
internal fun PlayerActivity.showV645CircleAutoClip645Toggle() {
    val current = BiliClient.prefs.v645circleAutoClip645
    BiliClient.prefs.v645circleAutoClip645 = !current
    AppToast.show(this, "Circle Auto Clip645: ${if (!current) "ON" else "OFF"}")
}

// v645: Clamp Auto Value645
internal fun PlayerActivity.showV645ClampAutoValue645Toggle() {
    val current = BiliClient.prefs.v645clampAutoValue645
    BiliClient.prefs.v645clampAutoValue645 = !current
    AppToast.show(this, "Clamp Auto Value645: ${if (!current) "ON" else "OFF"}")
}

// v645: Class Auto Load645
internal fun PlayerActivity.showV645ClassAutoLoad645Toggle() {
    val current = BiliClient.prefs.v645classAutoLoad645
    BiliClient.prefs.v645classAutoLoad645 = !current
    AppToast.show(this, "Class Auto Load645: ${if (!current) "ON" else "OFF"}")
}

// v646: Cell Auto Merge646
internal fun PlayerActivity.showV646CellAutoMerge646Toggle() {
    val current = BiliClient.prefs.v646cellAutoMerge646
    BiliClient.prefs.v646cellAutoMerge646 = !current
    AppToast.show(this, "Cell Auto Merge646: ${if (!current) "ON" else "OFF"}")
}

// v646: Center Auto Gravity646
internal fun PlayerActivity.showV646CenterAutoGravity646Toggle() {
    val current = BiliClient.prefs.v646centerAutoGravity646
    BiliClient.prefs.v646centerAutoGravity646 = !current
    AppToast.show(this, "Center Auto Gravity646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chain Auto Link646
internal fun PlayerActivity.showV646ChainAutoLink646Toggle() {
    val current = BiliClient.prefs.v646chainAutoLink646
    BiliClient.prefs.v646chainAutoLink646 = !current
    AppToast.show(this, "Chain Auto Link646: ${if (!current) "ON" else "OFF"}")
}

// v646: Challenge Auto Join646
internal fun PlayerActivity.showV646ChallengeAutoJoin646Toggle() {
    val current = BiliClient.prefs.v646challengeAutoJoin646
    BiliClient.prefs.v646challengeAutoJoin646 = !current
    AppToast.show(this, "Challenge Auto Join646: ${if (!current) "ON" else "OFF"}")
}

// v646: Change Auto Track646
internal fun PlayerActivity.showV646ChangeAutoTrack646Toggle() {
    val current = BiliClient.prefs.v646changeAutoTrack646
    BiliClient.prefs.v646changeAutoTrack646 = !current
    AppToast.show(this, "Change Auto Track646: ${if (!current) "ON" else "OFF"}")
}

// v646: Channel Auto Switch646
internal fun PlayerActivity.showV646ChannelAutoSwitch646Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v646channelAutoSwitch646).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch646",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v646channelAutoSwitch646 = value
        AppToast.show(this, "Channel Auto Switch646: $value")
    }
}

// v646: Chapter Auto Mark646
internal fun PlayerActivity.showV646ChapterAutoMark646Toggle() {
    val current = BiliClient.prefs.v646chapterAutoMark646
    BiliClient.prefs.v646chapterAutoMark646 = !current
    AppToast.show(this, "Chapter Auto Mark646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chart Auto Render646
internal fun PlayerActivity.showV646ChartAutoRender646Toggle() {
    val current = BiliClient.prefs.v646chartAutoRender646
    BiliClient.prefs.v646chartAutoRender646 = !current
    AppToast.show(this, "Chart Auto Render646: ${if (!current) "ON" else "OFF"}")
}

// v646: Check Auto Verify646
internal fun PlayerActivity.showV646CheckAutoVerify646Toggle() {
    val current = BiliClient.prefs.v646checkAutoVerify646
    BiliClient.prefs.v646checkAutoVerify646 = !current
    AppToast.show(this, "Check Auto Verify646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chip Auto Tag646
internal fun PlayerActivity.showV646ChipAutoTag646Toggle() {
    val current = BiliClient.prefs.v646chipAutoTag646
    BiliClient.prefs.v646chipAutoTag646 = !current
    AppToast.show(this, "Chip Auto Tag646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chunk Auto Split646
internal fun PlayerActivity.showV646ChunkAutoSplit646Toggle() {
    val current = BiliClient.prefs.v646chunkAutoSplit646
    BiliClient.prefs.v646chunkAutoSplit646 = !current
    AppToast.show(this, "Chunk Auto Split646: ${if (!current) "ON" else "OFF"}")
}

// v646: Cipher Auto Encrypt646
internal fun PlayerActivity.showV646CipherAutoEncrypt646Toggle() {
    val current = BiliClient.prefs.v646cipherAutoEncrypt646
    BiliClient.prefs.v646cipherAutoEncrypt646 = !current
    AppToast.show(this, "Cipher Auto Encrypt646: ${if (!current) "ON" else "OFF"}")
}

// v646: Circle Auto Clip646
internal fun PlayerActivity.showV646CircleAutoClip646Toggle() {
    val current = BiliClient.prefs.v646circleAutoClip646
    BiliClient.prefs.v646circleAutoClip646 = !current
    AppToast.show(this, "Circle Auto Clip646: ${if (!current) "ON" else "OFF"}")
}

// v646: Clamp Auto Value646
internal fun PlayerActivity.showV646ClampAutoValue646Toggle() {
    val current = BiliClient.prefs.v646clampAutoValue646
    BiliClient.prefs.v646clampAutoValue646 = !current
    AppToast.show(this, "Clamp Auto Value646: ${if (!current) "ON" else "OFF"}")
}

// v646: Class Auto Load646
internal fun PlayerActivity.showV646ClassAutoLoad646Toggle() {
    val current = BiliClient.prefs.v646classAutoLoad646
    BiliClient.prefs.v646classAutoLoad646 = !current
    AppToast.show(this, "Class Auto Load646: ${if (!current) "ON" else "OFF"}")
}

// v647: Cell Auto Merge647
internal fun PlayerActivity.showV647CellAutoMerge647Toggle() {
    val current = BiliClient.prefs.v647cellAutoMerge647
    BiliClient.prefs.v647cellAutoMerge647 = !current
    AppToast.show(this, "Cell Auto Merge647: ${if (!current) "ON" else "OFF"}")
}

// v647: Center Auto Gravity647
internal fun PlayerActivity.showV647CenterAutoGravity647Toggle() {
    val current = BiliClient.prefs.v647centerAutoGravity647
    BiliClient.prefs.v647centerAutoGravity647 = !current
    AppToast.show(this, "Center Auto Gravity647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chain Auto Link647
internal fun PlayerActivity.showV647ChainAutoLink647Toggle() {
    val current = BiliClient.prefs.v647chainAutoLink647
    BiliClient.prefs.v647chainAutoLink647 = !current
    AppToast.show(this, "Chain Auto Link647: ${if (!current) "ON" else "OFF"}")
}

// v647: Challenge Auto Join647
internal fun PlayerActivity.showV647ChallengeAutoJoin647Toggle() {
    val current = BiliClient.prefs.v647challengeAutoJoin647
    BiliClient.prefs.v647challengeAutoJoin647 = !current
    AppToast.show(this, "Challenge Auto Join647: ${if (!current) "ON" else "OFF"}")
}

// v647: Change Auto Track647
internal fun PlayerActivity.showV647ChangeAutoTrack647Toggle() {
    val current = BiliClient.prefs.v647changeAutoTrack647
    BiliClient.prefs.v647changeAutoTrack647 = !current
    AppToast.show(this, "Change Auto Track647: ${if (!current) "ON" else "OFF"}")
}

// v647: Channel Auto Switch647
internal fun PlayerActivity.showV647ChannelAutoSwitch647Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v647channelAutoSwitch647).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch647",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v647channelAutoSwitch647 = value
        AppToast.show(this, "Channel Auto Switch647: $value")
    }
}

// v647: Chapter Auto Mark647
internal fun PlayerActivity.showV647ChapterAutoMark647Toggle() {
    val current = BiliClient.prefs.v647chapterAutoMark647
    BiliClient.prefs.v647chapterAutoMark647 = !current
    AppToast.show(this, "Chapter Auto Mark647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chart Auto Render647
internal fun PlayerActivity.showV647ChartAutoRender647Toggle() {
    val current = BiliClient.prefs.v647chartAutoRender647
    BiliClient.prefs.v647chartAutoRender647 = !current
    AppToast.show(this, "Chart Auto Render647: ${if (!current) "ON" else "OFF"}")
}

// v647: Check Auto Verify647
internal fun PlayerActivity.showV647CheckAutoVerify647Toggle() {
    val current = BiliClient.prefs.v647checkAutoVerify647
    BiliClient.prefs.v647checkAutoVerify647 = !current
    AppToast.show(this, "Check Auto Verify647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chip Auto Tag647
internal fun PlayerActivity.showV647ChipAutoTag647Toggle() {
    val current = BiliClient.prefs.v647chipAutoTag647
    BiliClient.prefs.v647chipAutoTag647 = !current
    AppToast.show(this, "Chip Auto Tag647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chunk Auto Split647
internal fun PlayerActivity.showV647ChunkAutoSplit647Toggle() {
    val current = BiliClient.prefs.v647chunkAutoSplit647
    BiliClient.prefs.v647chunkAutoSplit647 = !current
    AppToast.show(this, "Chunk Auto Split647: ${if (!current) "ON" else "OFF"}")
}

// v647: Cipher Auto Encrypt647
internal fun PlayerActivity.showV647CipherAutoEncrypt647Toggle() {
    val current = BiliClient.prefs.v647cipherAutoEncrypt647
    BiliClient.prefs.v647cipherAutoEncrypt647 = !current
    AppToast.show(this, "Cipher Auto Encrypt647: ${if (!current) "ON" else "OFF"}")
}

// v647: Circle Auto Clip647
internal fun PlayerActivity.showV647CircleAutoClip647Toggle() {
    val current = BiliClient.prefs.v647circleAutoClip647
    BiliClient.prefs.v647circleAutoClip647 = !current
    AppToast.show(this, "Circle Auto Clip647: ${if (!current) "ON" else "OFF"}")
}

// v647: Clamp Auto Value647
internal fun PlayerActivity.showV647ClampAutoValue647Toggle() {
    val current = BiliClient.prefs.v647clampAutoValue647
    BiliClient.prefs.v647clampAutoValue647 = !current
    AppToast.show(this, "Clamp Auto Value647: ${if (!current) "ON" else "OFF"}")
}

// v647: Class Auto Load647
internal fun PlayerActivity.showV647ClassAutoLoad647Toggle() {
    val current = BiliClient.prefs.v647classAutoLoad647
    BiliClient.prefs.v647classAutoLoad647 = !current
    AppToast.show(this, "Class Auto Load647: ${if (!current) "ON" else "OFF"}")
}

// v648: Cell Auto Merge648
internal fun PlayerActivity.showV648CellAutoMerge648Toggle() {
    val current = BiliClient.prefs.v648cellAutoMerge648
    BiliClient.prefs.v648cellAutoMerge648 = !current
    AppToast.show(this, "Cell Auto Merge648: ${if (!current) "ON" else "OFF"}")
}

// v648: Center Auto Gravity648
internal fun PlayerActivity.showV648CenterAutoGravity648Toggle() {
    val current = BiliClient.prefs.v648centerAutoGravity648
    BiliClient.prefs.v648centerAutoGravity648 = !current
    AppToast.show(this, "Center Auto Gravity648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chain Auto Link648
internal fun PlayerActivity.showV648ChainAutoLink648Toggle() {
    val current = BiliClient.prefs.v648chainAutoLink648
    BiliClient.prefs.v648chainAutoLink648 = !current
    AppToast.show(this, "Chain Auto Link648: ${if (!current) "ON" else "OFF"}")
}

// v648: Challenge Auto Join648
internal fun PlayerActivity.showV648ChallengeAutoJoin648Toggle() {
    val current = BiliClient.prefs.v648challengeAutoJoin648
    BiliClient.prefs.v648challengeAutoJoin648 = !current
    AppToast.show(this, "Challenge Auto Join648: ${if (!current) "ON" else "OFF"}")
}

// v648: Change Auto Track648
internal fun PlayerActivity.showV648ChangeAutoTrack648Toggle() {
    val current = BiliClient.prefs.v648changeAutoTrack648
    BiliClient.prefs.v648changeAutoTrack648 = !current
    AppToast.show(this, "Change Auto Track648: ${if (!current) "ON" else "OFF"}")
}

// v648: Channel Auto Switch648
internal fun PlayerActivity.showV648ChannelAutoSwitch648Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v648channelAutoSwitch648).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch648",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v648channelAutoSwitch648 = value
        AppToast.show(this, "Channel Auto Switch648: $value")
    }
}

// v648: Chapter Auto Mark648
internal fun PlayerActivity.showV648ChapterAutoMark648Toggle() {
    val current = BiliClient.prefs.v648chapterAutoMark648
    BiliClient.prefs.v648chapterAutoMark648 = !current
    AppToast.show(this, "Chapter Auto Mark648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chart Auto Render648
internal fun PlayerActivity.showV648ChartAutoRender648Toggle() {
    val current = BiliClient.prefs.v648chartAutoRender648
    BiliClient.prefs.v648chartAutoRender648 = !current
    AppToast.show(this, "Chart Auto Render648: ${if (!current) "ON" else "OFF"}")
}

// v648: Check Auto Verify648
internal fun PlayerActivity.showV648CheckAutoVerify648Toggle() {
    val current = BiliClient.prefs.v648checkAutoVerify648
    BiliClient.prefs.v648checkAutoVerify648 = !current
    AppToast.show(this, "Check Auto Verify648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chip Auto Tag648
internal fun PlayerActivity.showV648ChipAutoTag648Toggle() {
    val current = BiliClient.prefs.v648chipAutoTag648
    BiliClient.prefs.v648chipAutoTag648 = !current
    AppToast.show(this, "Chip Auto Tag648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chunk Auto Split648
internal fun PlayerActivity.showV648ChunkAutoSplit648Toggle() {
    val current = BiliClient.prefs.v648chunkAutoSplit648
    BiliClient.prefs.v648chunkAutoSplit648 = !current
    AppToast.show(this, "Chunk Auto Split648: ${if (!current) "ON" else "OFF"}")
}

// v648: Cipher Auto Encrypt648
internal fun PlayerActivity.showV648CipherAutoEncrypt648Toggle() {
    val current = BiliClient.prefs.v648cipherAutoEncrypt648
    BiliClient.prefs.v648cipherAutoEncrypt648 = !current
    AppToast.show(this, "Cipher Auto Encrypt648: ${if (!current) "ON" else "OFF"}")
}

// v648: Circle Auto Clip648
internal fun PlayerActivity.showV648CircleAutoClip648Toggle() {
    val current = BiliClient.prefs.v648circleAutoClip648
    BiliClient.prefs.v648circleAutoClip648 = !current
    AppToast.show(this, "Circle Auto Clip648: ${if (!current) "ON" else "OFF"}")
}

// v648: Clamp Auto Value648
internal fun PlayerActivity.showV648ClampAutoValue648Toggle() {
    val current = BiliClient.prefs.v648clampAutoValue648
    BiliClient.prefs.v648clampAutoValue648 = !current
    AppToast.show(this, "Clamp Auto Value648: ${if (!current) "ON" else "OFF"}")
}

// v648: Class Auto Load648
internal fun PlayerActivity.showV648ClassAutoLoad648Toggle() {
    val current = BiliClient.prefs.v648classAutoLoad648
    BiliClient.prefs.v648classAutoLoad648 = !current
    AppToast.show(this, "Class Auto Load648: ${if (!current) "ON" else "OFF"}")
}

// v649: Cell Auto Merge649
internal fun PlayerActivity.showV649CellAutoMerge649Toggle() {
    val current = BiliClient.prefs.v649cellAutoMerge649
    BiliClient.prefs.v649cellAutoMerge649 = !current
    AppToast.show(this, "Cell Auto Merge649: ${if (!current) "ON" else "OFF"}")
}

// v649: Center Auto Gravity649
internal fun PlayerActivity.showV649CenterAutoGravity649Toggle() {
    val current = BiliClient.prefs.v649centerAutoGravity649
    BiliClient.prefs.v649centerAutoGravity649 = !current
    AppToast.show(this, "Center Auto Gravity649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chain Auto Link649
internal fun PlayerActivity.showV649ChainAutoLink649Toggle() {
    val current = BiliClient.prefs.v649chainAutoLink649
    BiliClient.prefs.v649chainAutoLink649 = !current
    AppToast.show(this, "Chain Auto Link649: ${if (!current) "ON" else "OFF"}")
}

// v649: Challenge Auto Join649
internal fun PlayerActivity.showV649ChallengeAutoJoin649Toggle() {
    val current = BiliClient.prefs.v649challengeAutoJoin649
    BiliClient.prefs.v649challengeAutoJoin649 = !current
    AppToast.show(this, "Challenge Auto Join649: ${if (!current) "ON" else "OFF"}")
}

// v649: Change Auto Track649
internal fun PlayerActivity.showV649ChangeAutoTrack649Toggle() {
    val current = BiliClient.prefs.v649changeAutoTrack649
    BiliClient.prefs.v649changeAutoTrack649 = !current
    AppToast.show(this, "Change Auto Track649: ${if (!current) "ON" else "OFF"}")
}

// v649: Channel Auto Switch649
internal fun PlayerActivity.showV649ChannelAutoSwitch649Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v649channelAutoSwitch649).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch649",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v649channelAutoSwitch649 = value
        AppToast.show(this, "Channel Auto Switch649: $value")
    }
}

// v649: Chapter Auto Mark649
internal fun PlayerActivity.showV649ChapterAutoMark649Toggle() {
    val current = BiliClient.prefs.v649chapterAutoMark649
    BiliClient.prefs.v649chapterAutoMark649 = !current
    AppToast.show(this, "Chapter Auto Mark649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chart Auto Render649
internal fun PlayerActivity.showV649ChartAutoRender649Toggle() {
    val current = BiliClient.prefs.v649chartAutoRender649
    BiliClient.prefs.v649chartAutoRender649 = !current
    AppToast.show(this, "Chart Auto Render649: ${if (!current) "ON" else "OFF"}")
}

// v649: Check Auto Verify649
internal fun PlayerActivity.showV649CheckAutoVerify649Toggle() {
    val current = BiliClient.prefs.v649checkAutoVerify649
    BiliClient.prefs.v649checkAutoVerify649 = !current
    AppToast.show(this, "Check Auto Verify649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chip Auto Tag649
internal fun PlayerActivity.showV649ChipAutoTag649Toggle() {
    val current = BiliClient.prefs.v649chipAutoTag649
    BiliClient.prefs.v649chipAutoTag649 = !current
    AppToast.show(this, "Chip Auto Tag649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chunk Auto Split649
internal fun PlayerActivity.showV649ChunkAutoSplit649Toggle() {
    val current = BiliClient.prefs.v649chunkAutoSplit649
    BiliClient.prefs.v649chunkAutoSplit649 = !current
    AppToast.show(this, "Chunk Auto Split649: ${if (!current) "ON" else "OFF"}")
}

// v649: Cipher Auto Encrypt649
internal fun PlayerActivity.showV649CipherAutoEncrypt649Toggle() {
    val current = BiliClient.prefs.v649cipherAutoEncrypt649
    BiliClient.prefs.v649cipherAutoEncrypt649 = !current
    AppToast.show(this, "Cipher Auto Encrypt649: ${if (!current) "ON" else "OFF"}")
}

// v649: Circle Auto Clip649
internal fun PlayerActivity.showV649CircleAutoClip649Toggle() {
    val current = BiliClient.prefs.v649circleAutoClip649
    BiliClient.prefs.v649circleAutoClip649 = !current
    AppToast.show(this, "Circle Auto Clip649: ${if (!current) "ON" else "OFF"}")
}

