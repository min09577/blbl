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

internal fun PlayerActivity.showV628BootAutoStart628Toggle() {
    val current = BiliClient.prefs.v628bootAutoStart628
    BiliClient.prefs.v628bootAutoStart628 = !current
    AppToast.show(this, "Boot Auto Start628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BorderAutoDraw628Toggle() {
    val current = BiliClient.prefs.v628borderAutoDraw628
    BiliClient.prefs.v628borderAutoDraw628 = !current
    AppToast.show(this, "Border Auto Draw628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BottomAutoNav628Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v628bottomAutoNav628).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav628",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v628bottomAutoNav628 = value
        AppToast.show(this, "Bottom Auto Nav628: $value")
    }
}

internal fun PlayerActivity.showV628BounceAutoEffect628Toggle() {
    val current = BiliClient.prefs.v628bounceAutoEffect628
    BiliClient.prefs.v628bounceAutoEffect628 = !current
    AppToast.show(this, "Bounce Auto Effect628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BoxAutoShadow628Toggle() {
    val current = BiliClient.prefs.v628boxAutoShadow628
    BiliClient.prefs.v628boxAutoShadow628 = !current
    AppToast.show(this, "Box Auto Shadow628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BranchAutoMerge628Toggle() {
    val current = BiliClient.prefs.v628branchAutoMerge628
    BiliClient.prefs.v628branchAutoMerge628 = !current
    AppToast.show(this, "Branch Auto Merge628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BrandAutoLogo628Toggle() {
    val current = BiliClient.prefs.v628brandAutoLogo628
    BiliClient.prefs.v628brandAutoLogo628 = !current
    AppToast.show(this, "Brand Auto Logo628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BreakAutoResume628Toggle() {
    val current = BiliClient.prefs.v628breakAutoResume628
    BiliClient.prefs.v628breakAutoResume628 = !current
    AppToast.show(this, "Break Auto Resume628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BridgeAutoConnect628Toggle() {
    val current = BiliClient.prefs.v628bridgeAutoConnect628
    BiliClient.prefs.v628bridgeAutoConnect628 = !current
    AppToast.show(this, "Bridge Auto Connect628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BenchmarkAutoRun629Toggle() {
    val current = BiliClient.prefs.v629benchmarkAutoRun629
    BiliClient.prefs.v629benchmarkAutoRun629 = !current
    AppToast.show(this, "Benchmark Auto Run629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BetaAutoUpdate629Toggle() {
    val current = BiliClient.prefs.v629betaAutoUpdate629
    BiliClient.prefs.v629betaAutoUpdate629 = !current
    AppToast.show(this, "Beta Auto Update629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BinaryAutoDecode629Toggle() {
    val current = BiliClient.prefs.v629binaryAutoDecode629
    BiliClient.prefs.v629binaryAutoDecode629 = !current
    AppToast.show(this, "Binary Auto Decode629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BlankAutoFill629Toggle() {
    val current = BiliClient.prefs.v629blankAutoFill629
    BiliClient.prefs.v629blankAutoFill629 = !current
    AppToast.show(this, "Blank Auto Fill629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BodyAutoParse629Toggle() {
    val current = BiliClient.prefs.v629bodyAutoParse629
    BiliClient.prefs.v629bodyAutoParse629 = !current
    AppToast.show(this, "Body Auto Parse629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BoldAutoDetect629Toggle() {
    val current = BiliClient.prefs.v629boldAutoDetect629
    BiliClient.prefs.v629boldAutoDetect629 = !current
    AppToast.show(this, "Bold Auto Detect629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BootAutoStart629Toggle() {
    val current = BiliClient.prefs.v629bootAutoStart629
    BiliClient.prefs.v629bootAutoStart629 = !current
    AppToast.show(this, "Boot Auto Start629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BorderAutoDraw629Toggle() {
    val current = BiliClient.prefs.v629borderAutoDraw629
    BiliClient.prefs.v629borderAutoDraw629 = !current
    AppToast.show(this, "Border Auto Draw629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BottomAutoNav629Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v629bottomAutoNav629).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav629",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v629bottomAutoNav629 = value
        AppToast.show(this, "Bottom Auto Nav629: $value")
    }
}

internal fun PlayerActivity.showV629BounceAutoEffect629Toggle() {
    val current = BiliClient.prefs.v629bounceAutoEffect629
    BiliClient.prefs.v629bounceAutoEffect629 = !current
    AppToast.show(this, "Bounce Auto Effect629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BoxAutoShadow629Toggle() {
    val current = BiliClient.prefs.v629boxAutoShadow629
    BiliClient.prefs.v629boxAutoShadow629 = !current
    AppToast.show(this, "Box Auto Shadow629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BranchAutoMerge629Toggle() {
    val current = BiliClient.prefs.v629branchAutoMerge629
    BiliClient.prefs.v629branchAutoMerge629 = !current
    AppToast.show(this, "Branch Auto Merge629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BrandAutoLogo629Toggle() {
    val current = BiliClient.prefs.v629brandAutoLogo629
    BiliClient.prefs.v629brandAutoLogo629 = !current
    AppToast.show(this, "Brand Auto Logo629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BreakAutoResume629Toggle() {
    val current = BiliClient.prefs.v629breakAutoResume629
    BiliClient.prefs.v629breakAutoResume629 = !current
    AppToast.show(this, "Break Auto Resume629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV629BridgeAutoConnect629Toggle() {
    val current = BiliClient.prefs.v629bridgeAutoConnect629
    BiliClient.prefs.v629bridgeAutoConnect629 = !current
    AppToast.show(this, "Bridge Auto Connect629: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BenchmarkAutoRun630Toggle() {
    val current = BiliClient.prefs.v630benchmarkAutoRun630
    BiliClient.prefs.v630benchmarkAutoRun630 = !current
    AppToast.show(this, "Benchmark Auto Run630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BetaAutoUpdate630Toggle() {
    val current = BiliClient.prefs.v630betaAutoUpdate630
    BiliClient.prefs.v630betaAutoUpdate630 = !current
    AppToast.show(this, "Beta Auto Update630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BinaryAutoDecode630Toggle() {
    val current = BiliClient.prefs.v630binaryAutoDecode630
    BiliClient.prefs.v630binaryAutoDecode630 = !current
    AppToast.show(this, "Binary Auto Decode630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BlankAutoFill630Toggle() {
    val current = BiliClient.prefs.v630blankAutoFill630
    BiliClient.prefs.v630blankAutoFill630 = !current
    AppToast.show(this, "Blank Auto Fill630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BodyAutoParse630Toggle() {
    val current = BiliClient.prefs.v630bodyAutoParse630
    BiliClient.prefs.v630bodyAutoParse630 = !current
    AppToast.show(this, "Body Auto Parse630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BoldAutoDetect630Toggle() {
    val current = BiliClient.prefs.v630boldAutoDetect630
    BiliClient.prefs.v630boldAutoDetect630 = !current
    AppToast.show(this, "Bold Auto Detect630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BootAutoStart630Toggle() {
    val current = BiliClient.prefs.v630bootAutoStart630
    BiliClient.prefs.v630bootAutoStart630 = !current
    AppToast.show(this, "Boot Auto Start630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BorderAutoDraw630Toggle() {
    val current = BiliClient.prefs.v630borderAutoDraw630
    BiliClient.prefs.v630borderAutoDraw630 = !current
    AppToast.show(this, "Border Auto Draw630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BottomAutoNav630Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v630bottomAutoNav630).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav630",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v630bottomAutoNav630 = value
        AppToast.show(this, "Bottom Auto Nav630: $value")
    }
}

internal fun PlayerActivity.showV630BounceAutoEffect630Toggle() {
    val current = BiliClient.prefs.v630bounceAutoEffect630
    BiliClient.prefs.v630bounceAutoEffect630 = !current
    AppToast.show(this, "Bounce Auto Effect630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BoxAutoShadow630Toggle() {
    val current = BiliClient.prefs.v630boxAutoShadow630
    BiliClient.prefs.v630boxAutoShadow630 = !current
    AppToast.show(this, "Box Auto Shadow630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BranchAutoMerge630Toggle() {
    val current = BiliClient.prefs.v630branchAutoMerge630
    BiliClient.prefs.v630branchAutoMerge630 = !current
    AppToast.show(this, "Branch Auto Merge630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BrandAutoLogo630Toggle() {
    val current = BiliClient.prefs.v630brandAutoLogo630
    BiliClient.prefs.v630brandAutoLogo630 = !current
    AppToast.show(this, "Brand Auto Logo630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BreakAutoResume630Toggle() {
    val current = BiliClient.prefs.v630breakAutoResume630
    BiliClient.prefs.v630breakAutoResume630 = !current
    AppToast.show(this, "Break Auto Resume630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV630BridgeAutoConnect630Toggle() {
    val current = BiliClient.prefs.v630bridgeAutoConnect630
    BiliClient.prefs.v630bridgeAutoConnect630 = !current
    AppToast.show(this, "Bridge Auto Connect630: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631BrowseAutoHistory631Toggle() {
    val current = BiliClient.prefs.v631browseAutoHistory631
    BiliClient.prefs.v631browseAutoHistory631 = !current
    AppToast.show(this, "Browse Auto History631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631BucketAutoClean631Toggle() {
    val current = BiliClient.prefs.v631bucketAutoClean631
    BiliClient.prefs.v631bucketAutoClean631 = !current
    AppToast.show(this, "Bucket Auto Clean631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631BuildAutoVersion631Toggle() {
    val current = BiliClient.prefs.v631buildAutoVersion631
    BiliClient.prefs.v631buildAutoVersion631 = !current
    AppToast.show(this, "Build Auto Version631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631BulkAutoImport631Toggle() {
    val current = BiliClient.prefs.v631bulkAutoImport631
    BiliClient.prefs.v631bulkAutoImport631 = !current
    AppToast.show(this, "Bulk Auto Import631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631ButtonAutoHaptic631Toggle() {
    val current = BiliClient.prefs.v631buttonAutoHaptic631
    BiliClient.prefs.v631buttonAutoHaptic631 = !current
    AppToast.show(this, "Button Auto Haptic631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631ByteAutoConvert631Toggle() {
    val current = BiliClient.prefs.v631byteAutoConvert631
    BiliClient.prefs.v631byteAutoConvert631 = !current
    AppToast.show(this, "Byte Auto Convert631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CalibrateAutoColor631Toggle() {
    val current = BiliClient.prefs.v631calibrateAutoColor631
    BiliClient.prefs.v631calibrateAutoColor631 = !current
    AppToast.show(this, "Calibrate Auto Color631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CallAutoLog631Toggle() {
    val current = BiliClient.prefs.v631callAutoLog631
    BiliClient.prefs.v631callAutoLog631 = !current
    AppToast.show(this, "Call Auto Log631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CameraAutoFocus631Toggle() {
    val current = BiliClient.prefs.v631cameraAutoFocus631
    BiliClient.prefs.v631cameraAutoFocus631 = !current
    AppToast.show(this, "Camera Auto Focus631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CampusAutoSelect631Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v631campusAutoSelect631).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select631",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v631campusAutoSelect631 = value
        AppToast.show(this, "Campus Auto Select631: $value")
    }
}

internal fun PlayerActivity.showV631CancelAutoUndo631Toggle() {
    val current = BiliClient.prefs.v631cancelAutoUndo631
    BiliClient.prefs.v631cancelAutoUndo631 = !current
    AppToast.show(this, "Cancel Auto Undo631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CaptureAutoMode631Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v631captureAutoMode631).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode631",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v631captureAutoMode631 = value
        AppToast.show(this, "Capture Auto Mode631: $value")
    }
}

internal fun PlayerActivity.showV631CaretAutoBlink631Toggle() {
    val current = BiliClient.prefs.v631caretAutoBlink631
    BiliClient.prefs.v631caretAutoBlink631 = !current
    AppToast.show(this, "Caret Auto Blink631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CaseAutoConvert631Toggle() {
    val current = BiliClient.prefs.v631caseAutoConvert631
    BiliClient.prefs.v631caseAutoConvert631 = !current
    AppToast.show(this, "Case Auto Convert631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV631CategoryAutoSort631Toggle() {
    val current = BiliClient.prefs.v631categoryAutoSort631
    BiliClient.prefs.v631categoryAutoSort631 = !current
    AppToast.show(this, "Category Auto Sort631: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632BrowseAutoHistory632Toggle() {
    val current = BiliClient.prefs.v632browseAutoHistory632
    BiliClient.prefs.v632browseAutoHistory632 = !current
    AppToast.show(this, "Browse Auto History632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632BucketAutoClean632Toggle() {
    val current = BiliClient.prefs.v632bucketAutoClean632
    BiliClient.prefs.v632bucketAutoClean632 = !current
    AppToast.show(this, "Bucket Auto Clean632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632BuildAutoVersion632Toggle() {
    val current = BiliClient.prefs.v632buildAutoVersion632
    BiliClient.prefs.v632buildAutoVersion632 = !current
    AppToast.show(this, "Build Auto Version632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632BulkAutoImport632Toggle() {
    val current = BiliClient.prefs.v632bulkAutoImport632
    BiliClient.prefs.v632bulkAutoImport632 = !current
    AppToast.show(this, "Bulk Auto Import632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632ButtonAutoHaptic632Toggle() {
    val current = BiliClient.prefs.v632buttonAutoHaptic632
    BiliClient.prefs.v632buttonAutoHaptic632 = !current
    AppToast.show(this, "Button Auto Haptic632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632ByteAutoConvert632Toggle() {
    val current = BiliClient.prefs.v632byteAutoConvert632
    BiliClient.prefs.v632byteAutoConvert632 = !current
    AppToast.show(this, "Byte Auto Convert632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CalibrateAutoColor632Toggle() {
    val current = BiliClient.prefs.v632calibrateAutoColor632
    BiliClient.prefs.v632calibrateAutoColor632 = !current
    AppToast.show(this, "Calibrate Auto Color632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CallAutoLog632Toggle() {
    val current = BiliClient.prefs.v632callAutoLog632
    BiliClient.prefs.v632callAutoLog632 = !current
    AppToast.show(this, "Call Auto Log632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CameraAutoFocus632Toggle() {
    val current = BiliClient.prefs.v632cameraAutoFocus632
    BiliClient.prefs.v632cameraAutoFocus632 = !current
    AppToast.show(this, "Camera Auto Focus632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CampusAutoSelect632Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v632campusAutoSelect632).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select632",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v632campusAutoSelect632 = value
        AppToast.show(this, "Campus Auto Select632: $value")
    }
}

internal fun PlayerActivity.showV632CancelAutoUndo632Toggle() {
    val current = BiliClient.prefs.v632cancelAutoUndo632
    BiliClient.prefs.v632cancelAutoUndo632 = !current
    AppToast.show(this, "Cancel Auto Undo632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CaptureAutoMode632Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v632captureAutoMode632).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode632",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v632captureAutoMode632 = value
        AppToast.show(this, "Capture Auto Mode632: $value")
    }
}

internal fun PlayerActivity.showV632CaretAutoBlink632Toggle() {
    val current = BiliClient.prefs.v632caretAutoBlink632
    BiliClient.prefs.v632caretAutoBlink632 = !current
    AppToast.show(this, "Caret Auto Blink632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CaseAutoConvert632Toggle() {
    val current = BiliClient.prefs.v632caseAutoConvert632
    BiliClient.prefs.v632caseAutoConvert632 = !current
    AppToast.show(this, "Case Auto Convert632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV632CategoryAutoSort632Toggle() {
    val current = BiliClient.prefs.v632categoryAutoSort632
    BiliClient.prefs.v632categoryAutoSort632 = !current
    AppToast.show(this, "Category Auto Sort632: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633BrowseAutoHistory633Toggle() {
    val current = BiliClient.prefs.v633browseAutoHistory633
    BiliClient.prefs.v633browseAutoHistory633 = !current
    AppToast.show(this, "Browse Auto History633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633BucketAutoClean633Toggle() {
    val current = BiliClient.prefs.v633bucketAutoClean633
    BiliClient.prefs.v633bucketAutoClean633 = !current
    AppToast.show(this, "Bucket Auto Clean633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633BuildAutoVersion633Toggle() {
    val current = BiliClient.prefs.v633buildAutoVersion633
    BiliClient.prefs.v633buildAutoVersion633 = !current
    AppToast.show(this, "Build Auto Version633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633BulkAutoImport633Toggle() {
    val current = BiliClient.prefs.v633bulkAutoImport633
    BiliClient.prefs.v633bulkAutoImport633 = !current
    AppToast.show(this, "Bulk Auto Import633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633ButtonAutoHaptic633Toggle() {
    val current = BiliClient.prefs.v633buttonAutoHaptic633
    BiliClient.prefs.v633buttonAutoHaptic633 = !current
    AppToast.show(this, "Button Auto Haptic633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633ByteAutoConvert633Toggle() {
    val current = BiliClient.prefs.v633byteAutoConvert633
    BiliClient.prefs.v633byteAutoConvert633 = !current
    AppToast.show(this, "Byte Auto Convert633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CalibrateAutoColor633Toggle() {
    val current = BiliClient.prefs.v633calibrateAutoColor633
    BiliClient.prefs.v633calibrateAutoColor633 = !current
    AppToast.show(this, "Calibrate Auto Color633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CallAutoLog633Toggle() {
    val current = BiliClient.prefs.v633callAutoLog633
    BiliClient.prefs.v633callAutoLog633 = !current
    AppToast.show(this, "Call Auto Log633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CameraAutoFocus633Toggle() {
    val current = BiliClient.prefs.v633cameraAutoFocus633
    BiliClient.prefs.v633cameraAutoFocus633 = !current
    AppToast.show(this, "Camera Auto Focus633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CampusAutoSelect633Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v633campusAutoSelect633).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select633",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v633campusAutoSelect633 = value
        AppToast.show(this, "Campus Auto Select633: $value")
    }
}

internal fun PlayerActivity.showV633CancelAutoUndo633Toggle() {
    val current = BiliClient.prefs.v633cancelAutoUndo633
    BiliClient.prefs.v633cancelAutoUndo633 = !current
    AppToast.show(this, "Cancel Auto Undo633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CaptureAutoMode633Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v633captureAutoMode633).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode633",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v633captureAutoMode633 = value
        AppToast.show(this, "Capture Auto Mode633: $value")
    }
}

internal fun PlayerActivity.showV633CaretAutoBlink633Toggle() {
    val current = BiliClient.prefs.v633caretAutoBlink633
    BiliClient.prefs.v633caretAutoBlink633 = !current
    AppToast.show(this, "Caret Auto Blink633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CaseAutoConvert633Toggle() {
    val current = BiliClient.prefs.v633caseAutoConvert633
    BiliClient.prefs.v633caseAutoConvert633 = !current
    AppToast.show(this, "Case Auto Convert633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV633CategoryAutoSort633Toggle() {
    val current = BiliClient.prefs.v633categoryAutoSort633
    BiliClient.prefs.v633categoryAutoSort633 = !current
    AppToast.show(this, "Category Auto Sort633: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634BrowseAutoHistory634Toggle() {
    val current = BiliClient.prefs.v634browseAutoHistory634
    BiliClient.prefs.v634browseAutoHistory634 = !current
    AppToast.show(this, "Browse Auto History634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634BucketAutoClean634Toggle() {
    val current = BiliClient.prefs.v634bucketAutoClean634
    BiliClient.prefs.v634bucketAutoClean634 = !current
    AppToast.show(this, "Bucket Auto Clean634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634BuildAutoVersion634Toggle() {
    val current = BiliClient.prefs.v634buildAutoVersion634
    BiliClient.prefs.v634buildAutoVersion634 = !current
    AppToast.show(this, "Build Auto Version634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634BulkAutoImport634Toggle() {
    val current = BiliClient.prefs.v634bulkAutoImport634
    BiliClient.prefs.v634bulkAutoImport634 = !current
    AppToast.show(this, "Bulk Auto Import634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634ButtonAutoHaptic634Toggle() {
    val current = BiliClient.prefs.v634buttonAutoHaptic634
    BiliClient.prefs.v634buttonAutoHaptic634 = !current
    AppToast.show(this, "Button Auto Haptic634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634ByteAutoConvert634Toggle() {
    val current = BiliClient.prefs.v634byteAutoConvert634
    BiliClient.prefs.v634byteAutoConvert634 = !current
    AppToast.show(this, "Byte Auto Convert634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CalibrateAutoColor634Toggle() {
    val current = BiliClient.prefs.v634calibrateAutoColor634
    BiliClient.prefs.v634calibrateAutoColor634 = !current
    AppToast.show(this, "Calibrate Auto Color634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CallAutoLog634Toggle() {
    val current = BiliClient.prefs.v634callAutoLog634
    BiliClient.prefs.v634callAutoLog634 = !current
    AppToast.show(this, "Call Auto Log634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CameraAutoFocus634Toggle() {
    val current = BiliClient.prefs.v634cameraAutoFocus634
    BiliClient.prefs.v634cameraAutoFocus634 = !current
    AppToast.show(this, "Camera Auto Focus634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CampusAutoSelect634Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v634campusAutoSelect634).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select634",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v634campusAutoSelect634 = value
        AppToast.show(this, "Campus Auto Select634: $value")
    }
}

internal fun PlayerActivity.showV634CancelAutoUndo634Toggle() {
    val current = BiliClient.prefs.v634cancelAutoUndo634
    BiliClient.prefs.v634cancelAutoUndo634 = !current
    AppToast.show(this, "Cancel Auto Undo634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CaptureAutoMode634Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v634captureAutoMode634).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode634",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v634captureAutoMode634 = value
        AppToast.show(this, "Capture Auto Mode634: $value")
    }
}

internal fun PlayerActivity.showV634CaretAutoBlink634Toggle() {
    val current = BiliClient.prefs.v634caretAutoBlink634
    BiliClient.prefs.v634caretAutoBlink634 = !current
    AppToast.show(this, "Caret Auto Blink634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CaseAutoConvert634Toggle() {
    val current = BiliClient.prefs.v634caseAutoConvert634
    BiliClient.prefs.v634caseAutoConvert634 = !current
    AppToast.show(this, "Case Auto Convert634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV634CategoryAutoSort634Toggle() {
    val current = BiliClient.prefs.v634categoryAutoSort634
    BiliClient.prefs.v634categoryAutoSort634 = !current
    AppToast.show(this, "Category Auto Sort634: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635BrowseAutoHistory635Toggle() {
    val current = BiliClient.prefs.v635browseAutoHistory635
    BiliClient.prefs.v635browseAutoHistory635 = !current
    AppToast.show(this, "Browse Auto History635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635BucketAutoClean635Toggle() {
    val current = BiliClient.prefs.v635bucketAutoClean635
    BiliClient.prefs.v635bucketAutoClean635 = !current
    AppToast.show(this, "Bucket Auto Clean635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635BuildAutoVersion635Toggle() {
    val current = BiliClient.prefs.v635buildAutoVersion635
    BiliClient.prefs.v635buildAutoVersion635 = !current
    AppToast.show(this, "Build Auto Version635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635BulkAutoImport635Toggle() {
    val current = BiliClient.prefs.v635bulkAutoImport635
    BiliClient.prefs.v635bulkAutoImport635 = !current
    AppToast.show(this, "Bulk Auto Import635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635ButtonAutoHaptic635Toggle() {
    val current = BiliClient.prefs.v635buttonAutoHaptic635
    BiliClient.prefs.v635buttonAutoHaptic635 = !current
    AppToast.show(this, "Button Auto Haptic635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635ByteAutoConvert635Toggle() {
    val current = BiliClient.prefs.v635byteAutoConvert635
    BiliClient.prefs.v635byteAutoConvert635 = !current
    AppToast.show(this, "Byte Auto Convert635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CalibrateAutoColor635Toggle() {
    val current = BiliClient.prefs.v635calibrateAutoColor635
    BiliClient.prefs.v635calibrateAutoColor635 = !current
    AppToast.show(this, "Calibrate Auto Color635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CallAutoLog635Toggle() {
    val current = BiliClient.prefs.v635callAutoLog635
    BiliClient.prefs.v635callAutoLog635 = !current
    AppToast.show(this, "Call Auto Log635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CameraAutoFocus635Toggle() {
    val current = BiliClient.prefs.v635cameraAutoFocus635
    BiliClient.prefs.v635cameraAutoFocus635 = !current
    AppToast.show(this, "Camera Auto Focus635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CampusAutoSelect635Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v635campusAutoSelect635).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select635",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v635campusAutoSelect635 = value
        AppToast.show(this, "Campus Auto Select635: $value")
    }
}

internal fun PlayerActivity.showV635CancelAutoUndo635Toggle() {
    val current = BiliClient.prefs.v635cancelAutoUndo635
    BiliClient.prefs.v635cancelAutoUndo635 = !current
    AppToast.show(this, "Cancel Auto Undo635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CaptureAutoMode635Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v635captureAutoMode635).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode635",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v635captureAutoMode635 = value
        AppToast.show(this, "Capture Auto Mode635: $value")
    }
}

internal fun PlayerActivity.showV635CaretAutoBlink635Toggle() {
    val current = BiliClient.prefs.v635caretAutoBlink635
    BiliClient.prefs.v635caretAutoBlink635 = !current
    AppToast.show(this, "Caret Auto Blink635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CaseAutoConvert635Toggle() {
    val current = BiliClient.prefs.v635caseAutoConvert635
    BiliClient.prefs.v635caseAutoConvert635 = !current
    AppToast.show(this, "Case Auto Convert635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV635CategoryAutoSort635Toggle() {
    val current = BiliClient.prefs.v635categoryAutoSort635
    BiliClient.prefs.v635categoryAutoSort635 = !current
    AppToast.show(this, "Category Auto Sort635: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636BrowseAutoHistory636Toggle() {
    val current = BiliClient.prefs.v636browseAutoHistory636
    BiliClient.prefs.v636browseAutoHistory636 = !current
    AppToast.show(this, "Browse Auto History636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636BucketAutoClean636Toggle() {
    val current = BiliClient.prefs.v636bucketAutoClean636
    BiliClient.prefs.v636bucketAutoClean636 = !current
    AppToast.show(this, "Bucket Auto Clean636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636BuildAutoVersion636Toggle() {
    val current = BiliClient.prefs.v636buildAutoVersion636
    BiliClient.prefs.v636buildAutoVersion636 = !current
    AppToast.show(this, "Build Auto Version636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636BulkAutoImport636Toggle() {
    val current = BiliClient.prefs.v636bulkAutoImport636
    BiliClient.prefs.v636bulkAutoImport636 = !current
    AppToast.show(this, "Bulk Auto Import636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636ButtonAutoHaptic636Toggle() {
    val current = BiliClient.prefs.v636buttonAutoHaptic636
    BiliClient.prefs.v636buttonAutoHaptic636 = !current
    AppToast.show(this, "Button Auto Haptic636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636ByteAutoConvert636Toggle() {
    val current = BiliClient.prefs.v636byteAutoConvert636
    BiliClient.prefs.v636byteAutoConvert636 = !current
    AppToast.show(this, "Byte Auto Convert636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636CalibrateAutoColor636Toggle() {
    val current = BiliClient.prefs.v636calibrateAutoColor636
    BiliClient.prefs.v636calibrateAutoColor636 = !current
    AppToast.show(this, "Calibrate Auto Color636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636CallAutoLog636Toggle() {
    val current = BiliClient.prefs.v636callAutoLog636
    BiliClient.prefs.v636callAutoLog636 = !current
    AppToast.show(this, "Call Auto Log636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636CameraAutoFocus636Toggle() {
    val current = BiliClient.prefs.v636cameraAutoFocus636
    BiliClient.prefs.v636cameraAutoFocus636 = !current
    AppToast.show(this, "Camera Auto Focus636: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV636CancelAutoUndo636Toggle() {
    val current = BiliClient.prefs.v636cancelAutoUndo636
    BiliClient.prefs.v636cancelAutoUndo636 = !current
    AppToast.show(this, "Cancel Auto Undo636: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV636CaretAutoBlink636Toggle() {
    val current = BiliClient.prefs.v636caretAutoBlink636
    BiliClient.prefs.v636caretAutoBlink636 = !current
    AppToast.show(this, "Caret Auto Blink636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636CaseAutoConvert636Toggle() {
    val current = BiliClient.prefs.v636caseAutoConvert636
    BiliClient.prefs.v636caseAutoConvert636 = !current
    AppToast.show(this, "Case Auto Convert636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV636CategoryAutoSort636Toggle() {
    val current = BiliClient.prefs.v636categoryAutoSort636
    BiliClient.prefs.v636categoryAutoSort636 = !current
    AppToast.show(this, "Category Auto Sort636: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637BrowseAutoHistory637Toggle() {
    val current = BiliClient.prefs.v637browseAutoHistory637
    BiliClient.prefs.v637browseAutoHistory637 = !current
    AppToast.show(this, "Browse Auto History637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637BucketAutoClean637Toggle() {
    val current = BiliClient.prefs.v637bucketAutoClean637
    BiliClient.prefs.v637bucketAutoClean637 = !current
    AppToast.show(this, "Bucket Auto Clean637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637BuildAutoVersion637Toggle() {
    val current = BiliClient.prefs.v637buildAutoVersion637
    BiliClient.prefs.v637buildAutoVersion637 = !current
    AppToast.show(this, "Build Auto Version637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637BulkAutoImport637Toggle() {
    val current = BiliClient.prefs.v637bulkAutoImport637
    BiliClient.prefs.v637bulkAutoImport637 = !current
    AppToast.show(this, "Bulk Auto Import637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637ButtonAutoHaptic637Toggle() {
    val current = BiliClient.prefs.v637buttonAutoHaptic637
    BiliClient.prefs.v637buttonAutoHaptic637 = !current
    AppToast.show(this, "Button Auto Haptic637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637ByteAutoConvert637Toggle() {
    val current = BiliClient.prefs.v637byteAutoConvert637
    BiliClient.prefs.v637byteAutoConvert637 = !current
    AppToast.show(this, "Byte Auto Convert637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637CalibrateAutoColor637Toggle() {
    val current = BiliClient.prefs.v637calibrateAutoColor637
    BiliClient.prefs.v637calibrateAutoColor637 = !current
    AppToast.show(this, "Calibrate Auto Color637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637CallAutoLog637Toggle() {
    val current = BiliClient.prefs.v637callAutoLog637
    BiliClient.prefs.v637callAutoLog637 = !current
    AppToast.show(this, "Call Auto Log637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637CameraAutoFocus637Toggle() {
    val current = BiliClient.prefs.v637cameraAutoFocus637
    BiliClient.prefs.v637cameraAutoFocus637 = !current
    AppToast.show(this, "Camera Auto Focus637: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV637CancelAutoUndo637Toggle() {
    val current = BiliClient.prefs.v637cancelAutoUndo637
    BiliClient.prefs.v637cancelAutoUndo637 = !current
    AppToast.show(this, "Cancel Auto Undo637: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV637CaretAutoBlink637Toggle() {
    val current = BiliClient.prefs.v637caretAutoBlink637
    BiliClient.prefs.v637caretAutoBlink637 = !current
    AppToast.show(this, "Caret Auto Blink637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637CaseAutoConvert637Toggle() {
    val current = BiliClient.prefs.v637caseAutoConvert637
    BiliClient.prefs.v637caseAutoConvert637 = !current
    AppToast.show(this, "Case Auto Convert637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV637CategoryAutoSort637Toggle() {
    val current = BiliClient.prefs.v637categoryAutoSort637
    BiliClient.prefs.v637categoryAutoSort637 = !current
    AppToast.show(this, "Category Auto Sort637: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638BrowseAutoHistory638Toggle() {
    val current = BiliClient.prefs.v638browseAutoHistory638
    BiliClient.prefs.v638browseAutoHistory638 = !current
    AppToast.show(this, "Browse Auto History638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638BucketAutoClean638Toggle() {
    val current = BiliClient.prefs.v638bucketAutoClean638
    BiliClient.prefs.v638bucketAutoClean638 = !current
    AppToast.show(this, "Bucket Auto Clean638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638BuildAutoVersion638Toggle() {
    val current = BiliClient.prefs.v638buildAutoVersion638
    BiliClient.prefs.v638buildAutoVersion638 = !current
    AppToast.show(this, "Build Auto Version638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638BulkAutoImport638Toggle() {
    val current = BiliClient.prefs.v638bulkAutoImport638
    BiliClient.prefs.v638bulkAutoImport638 = !current
    AppToast.show(this, "Bulk Auto Import638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638ButtonAutoHaptic638Toggle() {
    val current = BiliClient.prefs.v638buttonAutoHaptic638
    BiliClient.prefs.v638buttonAutoHaptic638 = !current
    AppToast.show(this, "Button Auto Haptic638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638ByteAutoConvert638Toggle() {
    val current = BiliClient.prefs.v638byteAutoConvert638
    BiliClient.prefs.v638byteAutoConvert638 = !current
    AppToast.show(this, "Byte Auto Convert638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638CalibrateAutoColor638Toggle() {
    val current = BiliClient.prefs.v638calibrateAutoColor638
    BiliClient.prefs.v638calibrateAutoColor638 = !current
    AppToast.show(this, "Calibrate Auto Color638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638CallAutoLog638Toggle() {
    val current = BiliClient.prefs.v638callAutoLog638
    BiliClient.prefs.v638callAutoLog638 = !current
    AppToast.show(this, "Call Auto Log638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638CameraAutoFocus638Toggle() {
    val current = BiliClient.prefs.v638cameraAutoFocus638
    BiliClient.prefs.v638cameraAutoFocus638 = !current
    AppToast.show(this, "Camera Auto Focus638: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV638CancelAutoUndo638Toggle() {
    val current = BiliClient.prefs.v638cancelAutoUndo638
    BiliClient.prefs.v638cancelAutoUndo638 = !current
    AppToast.show(this, "Cancel Auto Undo638: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV638CaretAutoBlink638Toggle() {
    val current = BiliClient.prefs.v638caretAutoBlink638
    BiliClient.prefs.v638caretAutoBlink638 = !current
    AppToast.show(this, "Caret Auto Blink638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638CaseAutoConvert638Toggle() {
    val current = BiliClient.prefs.v638caseAutoConvert638
    BiliClient.prefs.v638caseAutoConvert638 = !current
    AppToast.show(this, "Case Auto Convert638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV638CategoryAutoSort638Toggle() {
    val current = BiliClient.prefs.v638categoryAutoSort638
    BiliClient.prefs.v638categoryAutoSort638 = !current
    AppToast.show(this, "Category Auto Sort638: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639BrowseAutoHistory639Toggle() {
    val current = BiliClient.prefs.v639browseAutoHistory639
    BiliClient.prefs.v639browseAutoHistory639 = !current
    AppToast.show(this, "Browse Auto History639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639BucketAutoClean639Toggle() {
    val current = BiliClient.prefs.v639bucketAutoClean639
    BiliClient.prefs.v639bucketAutoClean639 = !current
    AppToast.show(this, "Bucket Auto Clean639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639BuildAutoVersion639Toggle() {
    val current = BiliClient.prefs.v639buildAutoVersion639
    BiliClient.prefs.v639buildAutoVersion639 = !current
    AppToast.show(this, "Build Auto Version639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639BulkAutoImport639Toggle() {
    val current = BiliClient.prefs.v639bulkAutoImport639
    BiliClient.prefs.v639bulkAutoImport639 = !current
    AppToast.show(this, "Bulk Auto Import639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639ButtonAutoHaptic639Toggle() {
    val current = BiliClient.prefs.v639buttonAutoHaptic639
    BiliClient.prefs.v639buttonAutoHaptic639 = !current
    AppToast.show(this, "Button Auto Haptic639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639ByteAutoConvert639Toggle() {
    val current = BiliClient.prefs.v639byteAutoConvert639
    BiliClient.prefs.v639byteAutoConvert639 = !current
    AppToast.show(this, "Byte Auto Convert639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639CalibrateAutoColor639Toggle() {
    val current = BiliClient.prefs.v639calibrateAutoColor639
    BiliClient.prefs.v639calibrateAutoColor639 = !current
    AppToast.show(this, "Calibrate Auto Color639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639CallAutoLog639Toggle() {
    val current = BiliClient.prefs.v639callAutoLog639
    BiliClient.prefs.v639callAutoLog639 = !current
    AppToast.show(this, "Call Auto Log639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639CameraAutoFocus639Toggle() {
    val current = BiliClient.prefs.v639cameraAutoFocus639
    BiliClient.prefs.v639cameraAutoFocus639 = !current
    AppToast.show(this, "Camera Auto Focus639: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV639CancelAutoUndo639Toggle() {
    val current = BiliClient.prefs.v639cancelAutoUndo639
    BiliClient.prefs.v639cancelAutoUndo639 = !current
    AppToast.show(this, "Cancel Auto Undo639: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV639CaretAutoBlink639Toggle() {
    val current = BiliClient.prefs.v639caretAutoBlink639
    BiliClient.prefs.v639caretAutoBlink639 = !current
    AppToast.show(this, "Caret Auto Blink639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639CaseAutoConvert639Toggle() {
    val current = BiliClient.prefs.v639caseAutoConvert639
    BiliClient.prefs.v639caseAutoConvert639 = !current
    AppToast.show(this, "Case Auto Convert639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV639CategoryAutoSort639Toggle() {
    val current = BiliClient.prefs.v639categoryAutoSort639
    BiliClient.prefs.v639categoryAutoSort639 = !current
    AppToast.show(this, "Category Auto Sort639: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640BrowseAutoHistory640Toggle() {
    val current = BiliClient.prefs.v640browseAutoHistory640
    BiliClient.prefs.v640browseAutoHistory640 = !current
    AppToast.show(this, "Browse Auto History640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640BucketAutoClean640Toggle() {
    val current = BiliClient.prefs.v640bucketAutoClean640
    BiliClient.prefs.v640bucketAutoClean640 = !current
    AppToast.show(this, "Bucket Auto Clean640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640BuildAutoVersion640Toggle() {
    val current = BiliClient.prefs.v640buildAutoVersion640
    BiliClient.prefs.v640buildAutoVersion640 = !current
    AppToast.show(this, "Build Auto Version640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640BulkAutoImport640Toggle() {
    val current = BiliClient.prefs.v640bulkAutoImport640
    BiliClient.prefs.v640bulkAutoImport640 = !current
    AppToast.show(this, "Bulk Auto Import640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640ButtonAutoHaptic640Toggle() {
    val current = BiliClient.prefs.v640buttonAutoHaptic640
    BiliClient.prefs.v640buttonAutoHaptic640 = !current
    AppToast.show(this, "Button Auto Haptic640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640ByteAutoConvert640Toggle() {
    val current = BiliClient.prefs.v640byteAutoConvert640
    BiliClient.prefs.v640byteAutoConvert640 = !current
    AppToast.show(this, "Byte Auto Convert640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640CalibrateAutoColor640Toggle() {
    val current = BiliClient.prefs.v640calibrateAutoColor640
    BiliClient.prefs.v640calibrateAutoColor640 = !current
    AppToast.show(this, "Calibrate Auto Color640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640CallAutoLog640Toggle() {
    val current = BiliClient.prefs.v640callAutoLog640
    BiliClient.prefs.v640callAutoLog640 = !current
    AppToast.show(this, "Call Auto Log640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640CameraAutoFocus640Toggle() {
    val current = BiliClient.prefs.v640cameraAutoFocus640
    BiliClient.prefs.v640cameraAutoFocus640 = !current
    AppToast.show(this, "Camera Auto Focus640: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV640CancelAutoUndo640Toggle() {
    val current = BiliClient.prefs.v640cancelAutoUndo640
    BiliClient.prefs.v640cancelAutoUndo640 = !current
    AppToast.show(this, "Cancel Auto Undo640: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV640CaretAutoBlink640Toggle() {
    val current = BiliClient.prefs.v640caretAutoBlink640
    BiliClient.prefs.v640caretAutoBlink640 = !current
    AppToast.show(this, "Caret Auto Blink640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640CaseAutoConvert640Toggle() {
    val current = BiliClient.prefs.v640caseAutoConvert640
    BiliClient.prefs.v640caseAutoConvert640 = !current
    AppToast.show(this, "Case Auto Convert640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV640CategoryAutoSort640Toggle() {
    val current = BiliClient.prefs.v640categoryAutoSort640
    BiliClient.prefs.v640categoryAutoSort640 = !current
    AppToast.show(this, "Category Auto Sort640: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641CellAutoMerge641Toggle() {
    val current = BiliClient.prefs.v641cellAutoMerge641
    BiliClient.prefs.v641cellAutoMerge641 = !current
    AppToast.show(this, "Cell Auto Merge641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641CenterAutoGravity641Toggle() {
    val current = BiliClient.prefs.v641centerAutoGravity641
    BiliClient.prefs.v641centerAutoGravity641 = !current
    AppToast.show(this, "Center Auto Gravity641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ChainAutoLink641Toggle() {
    val current = BiliClient.prefs.v641chainAutoLink641
    BiliClient.prefs.v641chainAutoLink641 = !current
    AppToast.show(this, "Chain Auto Link641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ChallengeAutoJoin641Toggle() {
    val current = BiliClient.prefs.v641challengeAutoJoin641
    BiliClient.prefs.v641challengeAutoJoin641 = !current
    AppToast.show(this, "Challenge Auto Join641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ChangeAutoTrack641Toggle() {
    val current = BiliClient.prefs.v641changeAutoTrack641
    BiliClient.prefs.v641changeAutoTrack641 = !current
    AppToast.show(this, "Change Auto Track641: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV641ChapterAutoMark641Toggle() {
    val current = BiliClient.prefs.v641chapterAutoMark641
    BiliClient.prefs.v641chapterAutoMark641 = !current
    AppToast.show(this, "Chapter Auto Mark641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ChartAutoRender641Toggle() {
    val current = BiliClient.prefs.v641chartAutoRender641
    BiliClient.prefs.v641chartAutoRender641 = !current
    AppToast.show(this, "Chart Auto Render641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641CheckAutoVerify641Toggle() {
    val current = BiliClient.prefs.v641checkAutoVerify641
    BiliClient.prefs.v641checkAutoVerify641 = !current
    AppToast.show(this, "Check Auto Verify641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ChipAutoTag641Toggle() {
    val current = BiliClient.prefs.v641chipAutoTag641
    BiliClient.prefs.v641chipAutoTag641 = !current
    AppToast.show(this, "Chip Auto Tag641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ChunkAutoSplit641Toggle() {
    val current = BiliClient.prefs.v641chunkAutoSplit641
    BiliClient.prefs.v641chunkAutoSplit641 = !current
    AppToast.show(this, "Chunk Auto Split641: ${if (!current) "ON" else "OFF"}")
}

