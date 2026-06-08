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

// v623: Blank Auto Fill623
internal fun PlayerActivity.showV623BlankAutoFill623Toggle() {
    val current = BiliClient.prefs.v623blankAutoFill623
    BiliClient.prefs.v623blankAutoFill623 = !current
    AppToast.show(this, "Blank Auto Fill623: ${if (!current) "ON" else "OFF"}")
}

// v623: Body Auto Parse623
internal fun PlayerActivity.showV623BodyAutoParse623Toggle() {
    val current = BiliClient.prefs.v623bodyAutoParse623
    BiliClient.prefs.v623bodyAutoParse623 = !current
    AppToast.show(this, "Body Auto Parse623: ${if (!current) "ON" else "OFF"}")
}

// v623: Bold Auto Detect623
internal fun PlayerActivity.showV623BoldAutoDetect623Toggle() {
    val current = BiliClient.prefs.v623boldAutoDetect623
    BiliClient.prefs.v623boldAutoDetect623 = !current
    AppToast.show(this, "Bold Auto Detect623: ${if (!current) "ON" else "OFF"}")
}

// v623: Boot Auto Start623
internal fun PlayerActivity.showV623BootAutoStart623Toggle() {
    val current = BiliClient.prefs.v623bootAutoStart623
    BiliClient.prefs.v623bootAutoStart623 = !current
    AppToast.show(this, "Boot Auto Start623: ${if (!current) "ON" else "OFF"}")
}

// v623: Border Auto Draw623
internal fun PlayerActivity.showV623BorderAutoDraw623Toggle() {
    val current = BiliClient.prefs.v623borderAutoDraw623
    BiliClient.prefs.v623borderAutoDraw623 = !current
    AppToast.show(this, "Border Auto Draw623: ${if (!current) "ON" else "OFF"}")
}

// v623: Bottom Auto Nav623
internal fun PlayerActivity.showV623BottomAutoNav623Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v623bottomAutoNav623).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav623",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v623bottomAutoNav623 = value
        AppToast.show(this, "Bottom Auto Nav623: $value")
    }
}

// v623: Bounce Auto Effect623
internal fun PlayerActivity.showV623BounceAutoEffect623Toggle() {
    val current = BiliClient.prefs.v623bounceAutoEffect623
    BiliClient.prefs.v623bounceAutoEffect623 = !current
    AppToast.show(this, "Bounce Auto Effect623: ${if (!current) "ON" else "OFF"}")
}

// v623: Box Auto Shadow623
internal fun PlayerActivity.showV623BoxAutoShadow623Toggle() {
    val current = BiliClient.prefs.v623boxAutoShadow623
    BiliClient.prefs.v623boxAutoShadow623 = !current
    AppToast.show(this, "Box Auto Shadow623: ${if (!current) "ON" else "OFF"}")
}

// v623: Branch Auto Merge623
internal fun PlayerActivity.showV623BranchAutoMerge623Toggle() {
    val current = BiliClient.prefs.v623branchAutoMerge623
    BiliClient.prefs.v623branchAutoMerge623 = !current
    AppToast.show(this, "Branch Auto Merge623: ${if (!current) "ON" else "OFF"}")
}

// v623: Brand Auto Logo623
internal fun PlayerActivity.showV623BrandAutoLogo623Toggle() {
    val current = BiliClient.prefs.v623brandAutoLogo623
    BiliClient.prefs.v623brandAutoLogo623 = !current
    AppToast.show(this, "Brand Auto Logo623: ${if (!current) "ON" else "OFF"}")
}

// v623: Break Auto Resume623
internal fun PlayerActivity.showV623BreakAutoResume623Toggle() {
    val current = BiliClient.prefs.v623breakAutoResume623
    BiliClient.prefs.v623breakAutoResume623 = !current
    AppToast.show(this, "Break Auto Resume623: ${if (!current) "ON" else "OFF"}")
}

// v623: Bridge Auto Connect623
internal fun PlayerActivity.showV623BridgeAutoConnect623Toggle() {
    val current = BiliClient.prefs.v623bridgeAutoConnect623
    BiliClient.prefs.v623bridgeAutoConnect623 = !current
    AppToast.show(this, "Bridge Auto Connect623: ${if (!current) "ON" else "OFF"}")
}

// v624: Benchmark Auto Run624
internal fun PlayerActivity.showV624BenchmarkAutoRun624Toggle() {
    val current = BiliClient.prefs.v624benchmarkAutoRun624
    BiliClient.prefs.v624benchmarkAutoRun624 = !current
    AppToast.show(this, "Benchmark Auto Run624: ${if (!current) "ON" else "OFF"}")
}

// v624: Beta Auto Update624
internal fun PlayerActivity.showV624BetaAutoUpdate624Toggle() {
    val current = BiliClient.prefs.v624betaAutoUpdate624
    BiliClient.prefs.v624betaAutoUpdate624 = !current
    AppToast.show(this, "Beta Auto Update624: ${if (!current) "ON" else "OFF"}")
}

// v624: Binary Auto Decode624
internal fun PlayerActivity.showV624BinaryAutoDecode624Toggle() {
    val current = BiliClient.prefs.v624binaryAutoDecode624
    BiliClient.prefs.v624binaryAutoDecode624 = !current
    AppToast.show(this, "Binary Auto Decode624: ${if (!current) "ON" else "OFF"}")
}

// v624: Blank Auto Fill624
internal fun PlayerActivity.showV624BlankAutoFill624Toggle() {
    val current = BiliClient.prefs.v624blankAutoFill624
    BiliClient.prefs.v624blankAutoFill624 = !current
    AppToast.show(this, "Blank Auto Fill624: ${if (!current) "ON" else "OFF"}")
}

// v624: Body Auto Parse624
internal fun PlayerActivity.showV624BodyAutoParse624Toggle() {
    val current = BiliClient.prefs.v624bodyAutoParse624
    BiliClient.prefs.v624bodyAutoParse624 = !current
    AppToast.show(this, "Body Auto Parse624: ${if (!current) "ON" else "OFF"}")
}

// v624: Bold Auto Detect624
internal fun PlayerActivity.showV624BoldAutoDetect624Toggle() {
    val current = BiliClient.prefs.v624boldAutoDetect624
    BiliClient.prefs.v624boldAutoDetect624 = !current
    AppToast.show(this, "Bold Auto Detect624: ${if (!current) "ON" else "OFF"}")
}

// v624: Boot Auto Start624
internal fun PlayerActivity.showV624BootAutoStart624Toggle() {
    val current = BiliClient.prefs.v624bootAutoStart624
    BiliClient.prefs.v624bootAutoStart624 = !current
    AppToast.show(this, "Boot Auto Start624: ${if (!current) "ON" else "OFF"}")
}

// v624: Border Auto Draw624
internal fun PlayerActivity.showV624BorderAutoDraw624Toggle() {
    val current = BiliClient.prefs.v624borderAutoDraw624
    BiliClient.prefs.v624borderAutoDraw624 = !current
    AppToast.show(this, "Border Auto Draw624: ${if (!current) "ON" else "OFF"}")
}

// v624: Bottom Auto Nav624
internal fun PlayerActivity.showV624BottomAutoNav624Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v624bottomAutoNav624).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav624",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v624bottomAutoNav624 = value
        AppToast.show(this, "Bottom Auto Nav624: $value")
    }
}

// v624: Bounce Auto Effect624
internal fun PlayerActivity.showV624BounceAutoEffect624Toggle() {
    val current = BiliClient.prefs.v624bounceAutoEffect624
    BiliClient.prefs.v624bounceAutoEffect624 = !current
    AppToast.show(this, "Bounce Auto Effect624: ${if (!current) "ON" else "OFF"}")
}

// v624: Box Auto Shadow624
internal fun PlayerActivity.showV624BoxAutoShadow624Toggle() {
    val current = BiliClient.prefs.v624boxAutoShadow624
    BiliClient.prefs.v624boxAutoShadow624 = !current
    AppToast.show(this, "Box Auto Shadow624: ${if (!current) "ON" else "OFF"}")
}

// v624: Branch Auto Merge624
internal fun PlayerActivity.showV624BranchAutoMerge624Toggle() {
    val current = BiliClient.prefs.v624branchAutoMerge624
    BiliClient.prefs.v624branchAutoMerge624 = !current
    AppToast.show(this, "Branch Auto Merge624: ${if (!current) "ON" else "OFF"}")
}

// v624: Brand Auto Logo624
internal fun PlayerActivity.showV624BrandAutoLogo624Toggle() {
    val current = BiliClient.prefs.v624brandAutoLogo624
    BiliClient.prefs.v624brandAutoLogo624 = !current
    AppToast.show(this, "Brand Auto Logo624: ${if (!current) "ON" else "OFF"}")
}

// v624: Break Auto Resume624
internal fun PlayerActivity.showV624BreakAutoResume624Toggle() {
    val current = BiliClient.prefs.v624breakAutoResume624
    BiliClient.prefs.v624breakAutoResume624 = !current
    AppToast.show(this, "Break Auto Resume624: ${if (!current) "ON" else "OFF"}")
}

// v624: Bridge Auto Connect624
internal fun PlayerActivity.showV624BridgeAutoConnect624Toggle() {
    val current = BiliClient.prefs.v624bridgeAutoConnect624
    BiliClient.prefs.v624bridgeAutoConnect624 = !current
    AppToast.show(this, "Bridge Auto Connect624: ${if (!current) "ON" else "OFF"}")
}

// v625: Benchmark Auto Run625
internal fun PlayerActivity.showV625BenchmarkAutoRun625Toggle() {
    val current = BiliClient.prefs.v625benchmarkAutoRun625
    BiliClient.prefs.v625benchmarkAutoRun625 = !current
    AppToast.show(this, "Benchmark Auto Run625: ${if (!current) "ON" else "OFF"}")
}

// v625: Beta Auto Update625
internal fun PlayerActivity.showV625BetaAutoUpdate625Toggle() {
    val current = BiliClient.prefs.v625betaAutoUpdate625
    BiliClient.prefs.v625betaAutoUpdate625 = !current
    AppToast.show(this, "Beta Auto Update625: ${if (!current) "ON" else "OFF"}")
}

// v625: Binary Auto Decode625
internal fun PlayerActivity.showV625BinaryAutoDecode625Toggle() {
    val current = BiliClient.prefs.v625binaryAutoDecode625
    BiliClient.prefs.v625binaryAutoDecode625 = !current
    AppToast.show(this, "Binary Auto Decode625: ${if (!current) "ON" else "OFF"}")
}

// v625: Blank Auto Fill625
internal fun PlayerActivity.showV625BlankAutoFill625Toggle() {
    val current = BiliClient.prefs.v625blankAutoFill625
    BiliClient.prefs.v625blankAutoFill625 = !current
    AppToast.show(this, "Blank Auto Fill625: ${if (!current) "ON" else "OFF"}")
}

// v625: Body Auto Parse625
internal fun PlayerActivity.showV625BodyAutoParse625Toggle() {
    val current = BiliClient.prefs.v625bodyAutoParse625
    BiliClient.prefs.v625bodyAutoParse625 = !current
    AppToast.show(this, "Body Auto Parse625: ${if (!current) "ON" else "OFF"}")
}

// v625: Bold Auto Detect625
internal fun PlayerActivity.showV625BoldAutoDetect625Toggle() {
    val current = BiliClient.prefs.v625boldAutoDetect625
    BiliClient.prefs.v625boldAutoDetect625 = !current
    AppToast.show(this, "Bold Auto Detect625: ${if (!current) "ON" else "OFF"}")
}

// v625: Boot Auto Start625
internal fun PlayerActivity.showV625BootAutoStart625Toggle() {
    val current = BiliClient.prefs.v625bootAutoStart625
    BiliClient.prefs.v625bootAutoStart625 = !current
    AppToast.show(this, "Boot Auto Start625: ${if (!current) "ON" else "OFF"}")
}

// v625: Border Auto Draw625
internal fun PlayerActivity.showV625BorderAutoDraw625Toggle() {
    val current = BiliClient.prefs.v625borderAutoDraw625
    BiliClient.prefs.v625borderAutoDraw625 = !current
    AppToast.show(this, "Border Auto Draw625: ${if (!current) "ON" else "OFF"}")
}

// v625: Bottom Auto Nav625
internal fun PlayerActivity.showV625BottomAutoNav625Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v625bottomAutoNav625).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav625",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v625bottomAutoNav625 = value
        AppToast.show(this, "Bottom Auto Nav625: $value")
    }
}

// v625: Bounce Auto Effect625
internal fun PlayerActivity.showV625BounceAutoEffect625Toggle() {
    val current = BiliClient.prefs.v625bounceAutoEffect625
    BiliClient.prefs.v625bounceAutoEffect625 = !current
    AppToast.show(this, "Bounce Auto Effect625: ${if (!current) "ON" else "OFF"}")
}

// v625: Box Auto Shadow625
internal fun PlayerActivity.showV625BoxAutoShadow625Toggle() {
    val current = BiliClient.prefs.v625boxAutoShadow625
    BiliClient.prefs.v625boxAutoShadow625 = !current
    AppToast.show(this, "Box Auto Shadow625: ${if (!current) "ON" else "OFF"}")
}

// v625: Branch Auto Merge625
internal fun PlayerActivity.showV625BranchAutoMerge625Toggle() {
    val current = BiliClient.prefs.v625branchAutoMerge625
    BiliClient.prefs.v625branchAutoMerge625 = !current
    AppToast.show(this, "Branch Auto Merge625: ${if (!current) "ON" else "OFF"}")
}

// v625: Brand Auto Logo625
internal fun PlayerActivity.showV625BrandAutoLogo625Toggle() {
    val current = BiliClient.prefs.v625brandAutoLogo625
    BiliClient.prefs.v625brandAutoLogo625 = !current
    AppToast.show(this, "Brand Auto Logo625: ${if (!current) "ON" else "OFF"}")
}

// v625: Break Auto Resume625
internal fun PlayerActivity.showV625BreakAutoResume625Toggle() {
    val current = BiliClient.prefs.v625breakAutoResume625
    BiliClient.prefs.v625breakAutoResume625 = !current
    AppToast.show(this, "Break Auto Resume625: ${if (!current) "ON" else "OFF"}")
}

// v625: Bridge Auto Connect625
internal fun PlayerActivity.showV625BridgeAutoConnect625Toggle() {
    val current = BiliClient.prefs.v625bridgeAutoConnect625
    BiliClient.prefs.v625bridgeAutoConnect625 = !current
    AppToast.show(this, "Bridge Auto Connect625: ${if (!current) "ON" else "OFF"}")
}

// v626: Benchmark Auto Run626
internal fun PlayerActivity.showV626BenchmarkAutoRun626Toggle() {
    val current = BiliClient.prefs.v626benchmarkAutoRun626
    BiliClient.prefs.v626benchmarkAutoRun626 = !current
    AppToast.show(this, "Benchmark Auto Run626: ${if (!current) "ON" else "OFF"}")
}

// v626: Beta Auto Update626
internal fun PlayerActivity.showV626BetaAutoUpdate626Toggle() {
    val current = BiliClient.prefs.v626betaAutoUpdate626
    BiliClient.prefs.v626betaAutoUpdate626 = !current
    AppToast.show(this, "Beta Auto Update626: ${if (!current) "ON" else "OFF"}")
}

// v626: Binary Auto Decode626
internal fun PlayerActivity.showV626BinaryAutoDecode626Toggle() {
    val current = BiliClient.prefs.v626binaryAutoDecode626
    BiliClient.prefs.v626binaryAutoDecode626 = !current
    AppToast.show(this, "Binary Auto Decode626: ${if (!current) "ON" else "OFF"}")
}

// v626: Blank Auto Fill626
internal fun PlayerActivity.showV626BlankAutoFill626Toggle() {
    val current = BiliClient.prefs.v626blankAutoFill626
    BiliClient.prefs.v626blankAutoFill626 = !current
    AppToast.show(this, "Blank Auto Fill626: ${if (!current) "ON" else "OFF"}")
}

// v626: Body Auto Parse626
internal fun PlayerActivity.showV626BodyAutoParse626Toggle() {
    val current = BiliClient.prefs.v626bodyAutoParse626
    BiliClient.prefs.v626bodyAutoParse626 = !current
    AppToast.show(this, "Body Auto Parse626: ${if (!current) "ON" else "OFF"}")
}

// v626: Bold Auto Detect626
internal fun PlayerActivity.showV626BoldAutoDetect626Toggle() {
    val current = BiliClient.prefs.v626boldAutoDetect626
    BiliClient.prefs.v626boldAutoDetect626 = !current
    AppToast.show(this, "Bold Auto Detect626: ${if (!current) "ON" else "OFF"}")
}

// v626: Boot Auto Start626
internal fun PlayerActivity.showV626BootAutoStart626Toggle() {
    val current = BiliClient.prefs.v626bootAutoStart626
    BiliClient.prefs.v626bootAutoStart626 = !current
    AppToast.show(this, "Boot Auto Start626: ${if (!current) "ON" else "OFF"}")
}

// v626: Border Auto Draw626
internal fun PlayerActivity.showV626BorderAutoDraw626Toggle() {
    val current = BiliClient.prefs.v626borderAutoDraw626
    BiliClient.prefs.v626borderAutoDraw626 = !current
    AppToast.show(this, "Border Auto Draw626: ${if (!current) "ON" else "OFF"}")
}

// v626: Bottom Auto Nav626
internal fun PlayerActivity.showV626BottomAutoNav626Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v626bottomAutoNav626).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav626",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v626bottomAutoNav626 = value
        AppToast.show(this, "Bottom Auto Nav626: $value")
    }
}

// v626: Bounce Auto Effect626
internal fun PlayerActivity.showV626BounceAutoEffect626Toggle() {
    val current = BiliClient.prefs.v626bounceAutoEffect626
    BiliClient.prefs.v626bounceAutoEffect626 = !current
    AppToast.show(this, "Bounce Auto Effect626: ${if (!current) "ON" else "OFF"}")
}

// v626: Box Auto Shadow626
internal fun PlayerActivity.showV626BoxAutoShadow626Toggle() {
    val current = BiliClient.prefs.v626boxAutoShadow626
    BiliClient.prefs.v626boxAutoShadow626 = !current
    AppToast.show(this, "Box Auto Shadow626: ${if (!current) "ON" else "OFF"}")
}

// v626: Branch Auto Merge626
internal fun PlayerActivity.showV626BranchAutoMerge626Toggle() {
    val current = BiliClient.prefs.v626branchAutoMerge626
    BiliClient.prefs.v626branchAutoMerge626 = !current
    AppToast.show(this, "Branch Auto Merge626: ${if (!current) "ON" else "OFF"}")
}

// v626: Brand Auto Logo626
internal fun PlayerActivity.showV626BrandAutoLogo626Toggle() {
    val current = BiliClient.prefs.v626brandAutoLogo626
    BiliClient.prefs.v626brandAutoLogo626 = !current
    AppToast.show(this, "Brand Auto Logo626: ${if (!current) "ON" else "OFF"}")
}

// v626: Break Auto Resume626
internal fun PlayerActivity.showV626BreakAutoResume626Toggle() {
    val current = BiliClient.prefs.v626breakAutoResume626
    BiliClient.prefs.v626breakAutoResume626 = !current
    AppToast.show(this, "Break Auto Resume626: ${if (!current) "ON" else "OFF"}")
}

// v626: Bridge Auto Connect626
internal fun PlayerActivity.showV626BridgeAutoConnect626Toggle() {
    val current = BiliClient.prefs.v626bridgeAutoConnect626
    BiliClient.prefs.v626bridgeAutoConnect626 = !current
    AppToast.show(this, "Bridge Auto Connect626: ${if (!current) "ON" else "OFF"}")
}

// v627: Benchmark Auto Run627
internal fun PlayerActivity.showV627BenchmarkAutoRun627Toggle() {
    val current = BiliClient.prefs.v627benchmarkAutoRun627
    BiliClient.prefs.v627benchmarkAutoRun627 = !current
    AppToast.show(this, "Benchmark Auto Run627: ${if (!current) "ON" else "OFF"}")
}

// v627: Beta Auto Update627
internal fun PlayerActivity.showV627BetaAutoUpdate627Toggle() {
    val current = BiliClient.prefs.v627betaAutoUpdate627
    BiliClient.prefs.v627betaAutoUpdate627 = !current
    AppToast.show(this, "Beta Auto Update627: ${if (!current) "ON" else "OFF"}")
}

// v627: Binary Auto Decode627
internal fun PlayerActivity.showV627BinaryAutoDecode627Toggle() {
    val current = BiliClient.prefs.v627binaryAutoDecode627
    BiliClient.prefs.v627binaryAutoDecode627 = !current
    AppToast.show(this, "Binary Auto Decode627: ${if (!current) "ON" else "OFF"}")
}

// v627: Blank Auto Fill627
internal fun PlayerActivity.showV627BlankAutoFill627Toggle() {
    val current = BiliClient.prefs.v627blankAutoFill627
    BiliClient.prefs.v627blankAutoFill627 = !current
    AppToast.show(this, "Blank Auto Fill627: ${if (!current) "ON" else "OFF"}")
}

// v627: Body Auto Parse627
internal fun PlayerActivity.showV627BodyAutoParse627Toggle() {
    val current = BiliClient.prefs.v627bodyAutoParse627
    BiliClient.prefs.v627bodyAutoParse627 = !current
    AppToast.show(this, "Body Auto Parse627: ${if (!current) "ON" else "OFF"}")
}

// v627: Bold Auto Detect627
internal fun PlayerActivity.showV627BoldAutoDetect627Toggle() {
    val current = BiliClient.prefs.v627boldAutoDetect627
    BiliClient.prefs.v627boldAutoDetect627 = !current
    AppToast.show(this, "Bold Auto Detect627: ${if (!current) "ON" else "OFF"}")
}

// v627: Boot Auto Start627
internal fun PlayerActivity.showV627BootAutoStart627Toggle() {
    val current = BiliClient.prefs.v627bootAutoStart627
    BiliClient.prefs.v627bootAutoStart627 = !current
    AppToast.show(this, "Boot Auto Start627: ${if (!current) "ON" else "OFF"}")
}

// v627: Border Auto Draw627
internal fun PlayerActivity.showV627BorderAutoDraw627Toggle() {
    val current = BiliClient.prefs.v627borderAutoDraw627
    BiliClient.prefs.v627borderAutoDraw627 = !current
    AppToast.show(this, "Border Auto Draw627: ${if (!current) "ON" else "OFF"}")
}

// v627: Bottom Auto Nav627
internal fun PlayerActivity.showV627BottomAutoNav627Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v627bottomAutoNav627).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav627",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v627bottomAutoNav627 = value
        AppToast.show(this, "Bottom Auto Nav627: $value")
    }
}

// v627: Bounce Auto Effect627
internal fun PlayerActivity.showV627BounceAutoEffect627Toggle() {
    val current = BiliClient.prefs.v627bounceAutoEffect627
    BiliClient.prefs.v627bounceAutoEffect627 = !current
    AppToast.show(this, "Bounce Auto Effect627: ${if (!current) "ON" else "OFF"}")
}

// v627: Box Auto Shadow627
internal fun PlayerActivity.showV627BoxAutoShadow627Toggle() {
    val current = BiliClient.prefs.v627boxAutoShadow627
    BiliClient.prefs.v627boxAutoShadow627 = !current
    AppToast.show(this, "Box Auto Shadow627: ${if (!current) "ON" else "OFF"}")
}

// v627: Branch Auto Merge627
internal fun PlayerActivity.showV627BranchAutoMerge627Toggle() {
    val current = BiliClient.prefs.v627branchAutoMerge627
    BiliClient.prefs.v627branchAutoMerge627 = !current
    AppToast.show(this, "Branch Auto Merge627: ${if (!current) "ON" else "OFF"}")
}

// v627: Brand Auto Logo627
internal fun PlayerActivity.showV627BrandAutoLogo627Toggle() {
    val current = BiliClient.prefs.v627brandAutoLogo627
    BiliClient.prefs.v627brandAutoLogo627 = !current
    AppToast.show(this, "Brand Auto Logo627: ${if (!current) "ON" else "OFF"}")
}

// v627: Break Auto Resume627
internal fun PlayerActivity.showV627BreakAutoResume627Toggle() {
    val current = BiliClient.prefs.v627breakAutoResume627
    BiliClient.prefs.v627breakAutoResume627 = !current
    AppToast.show(this, "Break Auto Resume627: ${if (!current) "ON" else "OFF"}")
}

// v627: Bridge Auto Connect627
internal fun PlayerActivity.showV627BridgeAutoConnect627Toggle() {
    val current = BiliClient.prefs.v627bridgeAutoConnect627
    BiliClient.prefs.v627bridgeAutoConnect627 = !current
    AppToast.show(this, "Bridge Auto Connect627: ${if (!current) "ON" else "OFF"}")
}

// v628: Benchmark Auto Run628
internal fun PlayerActivity.showV628BenchmarkAutoRun628Toggle() {
    val current = BiliClient.prefs.v628benchmarkAutoRun628
    BiliClient.prefs.v628benchmarkAutoRun628 = !current
    AppToast.show(this, "Benchmark Auto Run628: ${if (!current) "ON" else "OFF"}")
}

// v628: Beta Auto Update628
internal fun PlayerActivity.showV628BetaAutoUpdate628Toggle() {
    val current = BiliClient.prefs.v628betaAutoUpdate628
    BiliClient.prefs.v628betaAutoUpdate628 = !current
    AppToast.show(this, "Beta Auto Update628: ${if (!current) "ON" else "OFF"}")
}

// v628: Binary Auto Decode628
internal fun PlayerActivity.showV628BinaryAutoDecode628Toggle() {
    val current = BiliClient.prefs.v628binaryAutoDecode628
    BiliClient.prefs.v628binaryAutoDecode628 = !current
    AppToast.show(this, "Binary Auto Decode628: ${if (!current) "ON" else "OFF"}")
}

// v628: Blank Auto Fill628
internal fun PlayerActivity.showV628BlankAutoFill628Toggle() {
    val current = BiliClient.prefs.v628blankAutoFill628
    BiliClient.prefs.v628blankAutoFill628 = !current
    AppToast.show(this, "Blank Auto Fill628: ${if (!current) "ON" else "OFF"}")
}

// v628: Body Auto Parse628
internal fun PlayerActivity.showV628BodyAutoParse628Toggle() {
    val current = BiliClient.prefs.v628bodyAutoParse628
    BiliClient.prefs.v628bodyAutoParse628 = !current
    AppToast.show(this, "Body Auto Parse628: ${if (!current) "ON" else "OFF"}")
}

// v628: Bold Auto Detect628
internal fun PlayerActivity.showV628BoldAutoDetect628Toggle() {
    val current = BiliClient.prefs.v628boldAutoDetect628
    BiliClient.prefs.v628boldAutoDetect628 = !current
    AppToast.show(this, "Bold Auto Detect628: ${if (!current) "ON" else "OFF"}")
}

// v628: Boot Auto Start628
internal fun PlayerActivity.showV628BootAutoStart628Toggle() {
    val current = BiliClient.prefs.v628bootAutoStart628
    BiliClient.prefs.v628bootAutoStart628 = !current
    AppToast.show(this, "Boot Auto Start628: ${if (!current) "ON" else "OFF"}")
}

// v628: Border Auto Draw628
internal fun PlayerActivity.showV628BorderAutoDraw628Toggle() {
    val current = BiliClient.prefs.v628borderAutoDraw628
    BiliClient.prefs.v628borderAutoDraw628 = !current
    AppToast.show(this, "Border Auto Draw628: ${if (!current) "ON" else "OFF"}")
}

// v628: Bottom Auto Nav628
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

// v628: Bounce Auto Effect628
internal fun PlayerActivity.showV628BounceAutoEffect628Toggle() {
    val current = BiliClient.prefs.v628bounceAutoEffect628
    BiliClient.prefs.v628bounceAutoEffect628 = !current
    AppToast.show(this, "Bounce Auto Effect628: ${if (!current) "ON" else "OFF"}")
}

// v628: Box Auto Shadow628
internal fun PlayerActivity.showV628BoxAutoShadow628Toggle() {
    val current = BiliClient.prefs.v628boxAutoShadow628
    BiliClient.prefs.v628boxAutoShadow628 = !current
    AppToast.show(this, "Box Auto Shadow628: ${if (!current) "ON" else "OFF"}")
}

// v628: Branch Auto Merge628
internal fun PlayerActivity.showV628BranchAutoMerge628Toggle() {
    val current = BiliClient.prefs.v628branchAutoMerge628
    BiliClient.prefs.v628branchAutoMerge628 = !current
    AppToast.show(this, "Branch Auto Merge628: ${if (!current) "ON" else "OFF"}")
}

// v628: Brand Auto Logo628
internal fun PlayerActivity.showV628BrandAutoLogo628Toggle() {
    val current = BiliClient.prefs.v628brandAutoLogo628
    BiliClient.prefs.v628brandAutoLogo628 = !current
    AppToast.show(this, "Brand Auto Logo628: ${if (!current) "ON" else "OFF"}")
}

// v628: Break Auto Resume628
internal fun PlayerActivity.showV628BreakAutoResume628Toggle() {
    val current = BiliClient.prefs.v628breakAutoResume628
    BiliClient.prefs.v628breakAutoResume628 = !current
    AppToast.show(this, "Break Auto Resume628: ${if (!current) "ON" else "OFF"}")
}

// v628: Bridge Auto Connect628
internal fun PlayerActivity.showV628BridgeAutoConnect628Toggle() {
    val current = BiliClient.prefs.v628bridgeAutoConnect628
    BiliClient.prefs.v628bridgeAutoConnect628 = !current
    AppToast.show(this, "Bridge Auto Connect628: ${if (!current) "ON" else "OFF"}")
}

// v629: Benchmark Auto Run629
internal fun PlayerActivity.showV629BenchmarkAutoRun629Toggle() {
    val current = BiliClient.prefs.v629benchmarkAutoRun629
    BiliClient.prefs.v629benchmarkAutoRun629 = !current
    AppToast.show(this, "Benchmark Auto Run629: ${if (!current) "ON" else "OFF"}")
}

// v629: Beta Auto Update629
internal fun PlayerActivity.showV629BetaAutoUpdate629Toggle() {
    val current = BiliClient.prefs.v629betaAutoUpdate629
    BiliClient.prefs.v629betaAutoUpdate629 = !current
    AppToast.show(this, "Beta Auto Update629: ${if (!current) "ON" else "OFF"}")
}

// v629: Binary Auto Decode629
internal fun PlayerActivity.showV629BinaryAutoDecode629Toggle() {
    val current = BiliClient.prefs.v629binaryAutoDecode629
    BiliClient.prefs.v629binaryAutoDecode629 = !current
    AppToast.show(this, "Binary Auto Decode629: ${if (!current) "ON" else "OFF"}")
}

// v629: Blank Auto Fill629
internal fun PlayerActivity.showV629BlankAutoFill629Toggle() {
    val current = BiliClient.prefs.v629blankAutoFill629
    BiliClient.prefs.v629blankAutoFill629 = !current
    AppToast.show(this, "Blank Auto Fill629: ${if (!current) "ON" else "OFF"}")
}

// v629: Body Auto Parse629
internal fun PlayerActivity.showV629BodyAutoParse629Toggle() {
    val current = BiliClient.prefs.v629bodyAutoParse629
    BiliClient.prefs.v629bodyAutoParse629 = !current
    AppToast.show(this, "Body Auto Parse629: ${if (!current) "ON" else "OFF"}")
}

// v629: Bold Auto Detect629
internal fun PlayerActivity.showV629BoldAutoDetect629Toggle() {
    val current = BiliClient.prefs.v629boldAutoDetect629
    BiliClient.prefs.v629boldAutoDetect629 = !current
    AppToast.show(this, "Bold Auto Detect629: ${if (!current) "ON" else "OFF"}")
}

// v629: Boot Auto Start629
internal fun PlayerActivity.showV629BootAutoStart629Toggle() {
    val current = BiliClient.prefs.v629bootAutoStart629
    BiliClient.prefs.v629bootAutoStart629 = !current
    AppToast.show(this, "Boot Auto Start629: ${if (!current) "ON" else "OFF"}")
}

// v629: Border Auto Draw629
internal fun PlayerActivity.showV629BorderAutoDraw629Toggle() {
    val current = BiliClient.prefs.v629borderAutoDraw629
    BiliClient.prefs.v629borderAutoDraw629 = !current
    AppToast.show(this, "Border Auto Draw629: ${if (!current) "ON" else "OFF"}")
}

// v629: Bottom Auto Nav629
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

// v629: Bounce Auto Effect629
internal fun PlayerActivity.showV629BounceAutoEffect629Toggle() {
    val current = BiliClient.prefs.v629bounceAutoEffect629
    BiliClient.prefs.v629bounceAutoEffect629 = !current
    AppToast.show(this, "Bounce Auto Effect629: ${if (!current) "ON" else "OFF"}")
}

// v629: Box Auto Shadow629
internal fun PlayerActivity.showV629BoxAutoShadow629Toggle() {
    val current = BiliClient.prefs.v629boxAutoShadow629
    BiliClient.prefs.v629boxAutoShadow629 = !current
    AppToast.show(this, "Box Auto Shadow629: ${if (!current) "ON" else "OFF"}")
}

// v629: Branch Auto Merge629
internal fun PlayerActivity.showV629BranchAutoMerge629Toggle() {
    val current = BiliClient.prefs.v629branchAutoMerge629
    BiliClient.prefs.v629branchAutoMerge629 = !current
    AppToast.show(this, "Branch Auto Merge629: ${if (!current) "ON" else "OFF"}")
}

// v629: Brand Auto Logo629
internal fun PlayerActivity.showV629BrandAutoLogo629Toggle() {
    val current = BiliClient.prefs.v629brandAutoLogo629
    BiliClient.prefs.v629brandAutoLogo629 = !current
    AppToast.show(this, "Brand Auto Logo629: ${if (!current) "ON" else "OFF"}")
}

// v629: Break Auto Resume629
internal fun PlayerActivity.showV629BreakAutoResume629Toggle() {
    val current = BiliClient.prefs.v629breakAutoResume629
    BiliClient.prefs.v629breakAutoResume629 = !current
    AppToast.show(this, "Break Auto Resume629: ${if (!current) "ON" else "OFF"}")
}

// v629: Bridge Auto Connect629
internal fun PlayerActivity.showV629BridgeAutoConnect629Toggle() {
    val current = BiliClient.prefs.v629bridgeAutoConnect629
    BiliClient.prefs.v629bridgeAutoConnect629 = !current
    AppToast.show(this, "Bridge Auto Connect629: ${if (!current) "ON" else "OFF"}")
}

// v630: Benchmark Auto Run630
internal fun PlayerActivity.showV630BenchmarkAutoRun630Toggle() {
    val current = BiliClient.prefs.v630benchmarkAutoRun630
    BiliClient.prefs.v630benchmarkAutoRun630 = !current
    AppToast.show(this, "Benchmark Auto Run630: ${if (!current) "ON" else "OFF"}")
}

// v630: Beta Auto Update630
internal fun PlayerActivity.showV630BetaAutoUpdate630Toggle() {
    val current = BiliClient.prefs.v630betaAutoUpdate630
    BiliClient.prefs.v630betaAutoUpdate630 = !current
    AppToast.show(this, "Beta Auto Update630: ${if (!current) "ON" else "OFF"}")
}

// v630: Binary Auto Decode630
internal fun PlayerActivity.showV630BinaryAutoDecode630Toggle() {
    val current = BiliClient.prefs.v630binaryAutoDecode630
    BiliClient.prefs.v630binaryAutoDecode630 = !current
    AppToast.show(this, "Binary Auto Decode630: ${if (!current) "ON" else "OFF"}")
}

// v630: Blank Auto Fill630
internal fun PlayerActivity.showV630BlankAutoFill630Toggle() {
    val current = BiliClient.prefs.v630blankAutoFill630
    BiliClient.prefs.v630blankAutoFill630 = !current
    AppToast.show(this, "Blank Auto Fill630: ${if (!current) "ON" else "OFF"}")
}

// v630: Body Auto Parse630
internal fun PlayerActivity.showV630BodyAutoParse630Toggle() {
    val current = BiliClient.prefs.v630bodyAutoParse630
    BiliClient.prefs.v630bodyAutoParse630 = !current
    AppToast.show(this, "Body Auto Parse630: ${if (!current) "ON" else "OFF"}")
}

// v630: Bold Auto Detect630
internal fun PlayerActivity.showV630BoldAutoDetect630Toggle() {
    val current = BiliClient.prefs.v630boldAutoDetect630
    BiliClient.prefs.v630boldAutoDetect630 = !current
    AppToast.show(this, "Bold Auto Detect630: ${if (!current) "ON" else "OFF"}")
}

// v630: Boot Auto Start630
internal fun PlayerActivity.showV630BootAutoStart630Toggle() {
    val current = BiliClient.prefs.v630bootAutoStart630
    BiliClient.prefs.v630bootAutoStart630 = !current
    AppToast.show(this, "Boot Auto Start630: ${if (!current) "ON" else "OFF"}")
}

// v630: Border Auto Draw630
internal fun PlayerActivity.showV630BorderAutoDraw630Toggle() {
    val current = BiliClient.prefs.v630borderAutoDraw630
    BiliClient.prefs.v630borderAutoDraw630 = !current
    AppToast.show(this, "Border Auto Draw630: ${if (!current) "ON" else "OFF"}")
}

// v630: Bottom Auto Nav630
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

// v630: Bounce Auto Effect630
internal fun PlayerActivity.showV630BounceAutoEffect630Toggle() {
    val current = BiliClient.prefs.v630bounceAutoEffect630
    BiliClient.prefs.v630bounceAutoEffect630 = !current
    AppToast.show(this, "Bounce Auto Effect630: ${if (!current) "ON" else "OFF"}")
}

// v630: Box Auto Shadow630
internal fun PlayerActivity.showV630BoxAutoShadow630Toggle() {
    val current = BiliClient.prefs.v630boxAutoShadow630
    BiliClient.prefs.v630boxAutoShadow630 = !current
    AppToast.show(this, "Box Auto Shadow630: ${if (!current) "ON" else "OFF"}")
}

// v630: Branch Auto Merge630
internal fun PlayerActivity.showV630BranchAutoMerge630Toggle() {
    val current = BiliClient.prefs.v630branchAutoMerge630
    BiliClient.prefs.v630branchAutoMerge630 = !current
    AppToast.show(this, "Branch Auto Merge630: ${if (!current) "ON" else "OFF"}")
}

// v630: Brand Auto Logo630
internal fun PlayerActivity.showV630BrandAutoLogo630Toggle() {
    val current = BiliClient.prefs.v630brandAutoLogo630
    BiliClient.prefs.v630brandAutoLogo630 = !current
    AppToast.show(this, "Brand Auto Logo630: ${if (!current) "ON" else "OFF"}")
}

// v630: Break Auto Resume630
internal fun PlayerActivity.showV630BreakAutoResume630Toggle() {
    val current = BiliClient.prefs.v630breakAutoResume630
    BiliClient.prefs.v630breakAutoResume630 = !current
    AppToast.show(this, "Break Auto Resume630: ${if (!current) "ON" else "OFF"}")
}

// v630: Bridge Auto Connect630
internal fun PlayerActivity.showV630BridgeAutoConnect630Toggle() {
    val current = BiliClient.prefs.v630bridgeAutoConnect630
    BiliClient.prefs.v630bridgeAutoConnect630 = !current
    AppToast.show(this, "Bridge Auto Connect630: ${if (!current) "ON" else "OFF"}")
}

// v631: Browse Auto History631
internal fun PlayerActivity.showV631BrowseAutoHistory631Toggle() {
    val current = BiliClient.prefs.v631browseAutoHistory631
    BiliClient.prefs.v631browseAutoHistory631 = !current
    AppToast.show(this, "Browse Auto History631: ${if (!current) "ON" else "OFF"}")
}

// v631: Bucket Auto Clean631
internal fun PlayerActivity.showV631BucketAutoClean631Toggle() {
    val current = BiliClient.prefs.v631bucketAutoClean631
    BiliClient.prefs.v631bucketAutoClean631 = !current
    AppToast.show(this, "Bucket Auto Clean631: ${if (!current) "ON" else "OFF"}")
}

// v631: Build Auto Version631
internal fun PlayerActivity.showV631BuildAutoVersion631Toggle() {
    val current = BiliClient.prefs.v631buildAutoVersion631
    BiliClient.prefs.v631buildAutoVersion631 = !current
    AppToast.show(this, "Build Auto Version631: ${if (!current) "ON" else "OFF"}")
}

// v631: Bulk Auto Import631
internal fun PlayerActivity.showV631BulkAutoImport631Toggle() {
    val current = BiliClient.prefs.v631bulkAutoImport631
    BiliClient.prefs.v631bulkAutoImport631 = !current
    AppToast.show(this, "Bulk Auto Import631: ${if (!current) "ON" else "OFF"}")
}

// v631: Button Auto Haptic631
internal fun PlayerActivity.showV631ButtonAutoHaptic631Toggle() {
    val current = BiliClient.prefs.v631buttonAutoHaptic631
    BiliClient.prefs.v631buttonAutoHaptic631 = !current
    AppToast.show(this, "Button Auto Haptic631: ${if (!current) "ON" else "OFF"}")
}

// v631: Byte Auto Convert631
internal fun PlayerActivity.showV631ByteAutoConvert631Toggle() {
    val current = BiliClient.prefs.v631byteAutoConvert631
    BiliClient.prefs.v631byteAutoConvert631 = !current
    AppToast.show(this, "Byte Auto Convert631: ${if (!current) "ON" else "OFF"}")
}

// v631: Calibrate Auto Color631
internal fun PlayerActivity.showV631CalibrateAutoColor631Toggle() {
    val current = BiliClient.prefs.v631calibrateAutoColor631
    BiliClient.prefs.v631calibrateAutoColor631 = !current
    AppToast.show(this, "Calibrate Auto Color631: ${if (!current) "ON" else "OFF"}")
}

// v631: Call Auto Log631
internal fun PlayerActivity.showV631CallAutoLog631Toggle() {
    val current = BiliClient.prefs.v631callAutoLog631
    BiliClient.prefs.v631callAutoLog631 = !current
    AppToast.show(this, "Call Auto Log631: ${if (!current) "ON" else "OFF"}")
}

// v631: Camera Auto Focus631
internal fun PlayerActivity.showV631CameraAutoFocus631Toggle() {
    val current = BiliClient.prefs.v631cameraAutoFocus631
    BiliClient.prefs.v631cameraAutoFocus631 = !current
    AppToast.show(this, "Camera Auto Focus631: ${if (!current) "ON" else "OFF"}")
}

// v631: Campus Auto Select631
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

// v631: Cancel Auto Undo631
internal fun PlayerActivity.showV631CancelAutoUndo631Toggle() {
    val current = BiliClient.prefs.v631cancelAutoUndo631
    BiliClient.prefs.v631cancelAutoUndo631 = !current
    AppToast.show(this, "Cancel Auto Undo631: ${if (!current) "ON" else "OFF"}")
}

// v631: Capture Auto Mode631
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

// v631: Caret Auto Blink631
internal fun PlayerActivity.showV631CaretAutoBlink631Toggle() {
    val current = BiliClient.prefs.v631caretAutoBlink631
    BiliClient.prefs.v631caretAutoBlink631 = !current
    AppToast.show(this, "Caret Auto Blink631: ${if (!current) "ON" else "OFF"}")
}

// v631: Case Auto Convert631
internal fun PlayerActivity.showV631CaseAutoConvert631Toggle() {
    val current = BiliClient.prefs.v631caseAutoConvert631
    BiliClient.prefs.v631caseAutoConvert631 = !current
    AppToast.show(this, "Case Auto Convert631: ${if (!current) "ON" else "OFF"}")
}

// v631: Category Auto Sort631
internal fun PlayerActivity.showV631CategoryAutoSort631Toggle() {
    val current = BiliClient.prefs.v631categoryAutoSort631
    BiliClient.prefs.v631categoryAutoSort631 = !current
    AppToast.show(this, "Category Auto Sort631: ${if (!current) "ON" else "OFF"}")
}

// v632: Browse Auto History632
internal fun PlayerActivity.showV632BrowseAutoHistory632Toggle() {
    val current = BiliClient.prefs.v632browseAutoHistory632
    BiliClient.prefs.v632browseAutoHistory632 = !current
    AppToast.show(this, "Browse Auto History632: ${if (!current) "ON" else "OFF"}")
}

// v632: Bucket Auto Clean632
internal fun PlayerActivity.showV632BucketAutoClean632Toggle() {
    val current = BiliClient.prefs.v632bucketAutoClean632
    BiliClient.prefs.v632bucketAutoClean632 = !current
    AppToast.show(this, "Bucket Auto Clean632: ${if (!current) "ON" else "OFF"}")
}

// v632: Build Auto Version632
internal fun PlayerActivity.showV632BuildAutoVersion632Toggle() {
    val current = BiliClient.prefs.v632buildAutoVersion632
    BiliClient.prefs.v632buildAutoVersion632 = !current
    AppToast.show(this, "Build Auto Version632: ${if (!current) "ON" else "OFF"}")
}

// v632: Bulk Auto Import632
internal fun PlayerActivity.showV632BulkAutoImport632Toggle() {
    val current = BiliClient.prefs.v632bulkAutoImport632
    BiliClient.prefs.v632bulkAutoImport632 = !current
    AppToast.show(this, "Bulk Auto Import632: ${if (!current) "ON" else "OFF"}")
}

// v632: Button Auto Haptic632
internal fun PlayerActivity.showV632ButtonAutoHaptic632Toggle() {
    val current = BiliClient.prefs.v632buttonAutoHaptic632
    BiliClient.prefs.v632buttonAutoHaptic632 = !current
    AppToast.show(this, "Button Auto Haptic632: ${if (!current) "ON" else "OFF"}")
}

// v632: Byte Auto Convert632
internal fun PlayerActivity.showV632ByteAutoConvert632Toggle() {
    val current = BiliClient.prefs.v632byteAutoConvert632
    BiliClient.prefs.v632byteAutoConvert632 = !current
    AppToast.show(this, "Byte Auto Convert632: ${if (!current) "ON" else "OFF"}")
}

// v632: Calibrate Auto Color632
internal fun PlayerActivity.showV632CalibrateAutoColor632Toggle() {
    val current = BiliClient.prefs.v632calibrateAutoColor632
    BiliClient.prefs.v632calibrateAutoColor632 = !current
    AppToast.show(this, "Calibrate Auto Color632: ${if (!current) "ON" else "OFF"}")
}

// v632: Call Auto Log632
internal fun PlayerActivity.showV632CallAutoLog632Toggle() {
    val current = BiliClient.prefs.v632callAutoLog632
    BiliClient.prefs.v632callAutoLog632 = !current
    AppToast.show(this, "Call Auto Log632: ${if (!current) "ON" else "OFF"}")
}

// v632: Camera Auto Focus632
internal fun PlayerActivity.showV632CameraAutoFocus632Toggle() {
    val current = BiliClient.prefs.v632cameraAutoFocus632
    BiliClient.prefs.v632cameraAutoFocus632 = !current
    AppToast.show(this, "Camera Auto Focus632: ${if (!current) "ON" else "OFF"}")
}

// v632: Campus Auto Select632
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

// v632: Cancel Auto Undo632
internal fun PlayerActivity.showV632CancelAutoUndo632Toggle() {
    val current = BiliClient.prefs.v632cancelAutoUndo632
    BiliClient.prefs.v632cancelAutoUndo632 = !current
    AppToast.show(this, "Cancel Auto Undo632: ${if (!current) "ON" else "OFF"}")
}

// v632: Capture Auto Mode632
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

// v632: Caret Auto Blink632
internal fun PlayerActivity.showV632CaretAutoBlink632Toggle() {
    val current = BiliClient.prefs.v632caretAutoBlink632
    BiliClient.prefs.v632caretAutoBlink632 = !current
    AppToast.show(this, "Caret Auto Blink632: ${if (!current) "ON" else "OFF"}")
}

// v632: Case Auto Convert632
internal fun PlayerActivity.showV632CaseAutoConvert632Toggle() {
    val current = BiliClient.prefs.v632caseAutoConvert632
    BiliClient.prefs.v632caseAutoConvert632 = !current
    AppToast.show(this, "Case Auto Convert632: ${if (!current) "ON" else "OFF"}")
}

// v632: Category Auto Sort632
internal fun PlayerActivity.showV632CategoryAutoSort632Toggle() {
    val current = BiliClient.prefs.v632categoryAutoSort632
    BiliClient.prefs.v632categoryAutoSort632 = !current
    AppToast.show(this, "Category Auto Sort632: ${if (!current) "ON" else "OFF"}")
}

// v633: Browse Auto History633
internal fun PlayerActivity.showV633BrowseAutoHistory633Toggle() {
    val current = BiliClient.prefs.v633browseAutoHistory633
    BiliClient.prefs.v633browseAutoHistory633 = !current
    AppToast.show(this, "Browse Auto History633: ${if (!current) "ON" else "OFF"}")
}

// v633: Bucket Auto Clean633
internal fun PlayerActivity.showV633BucketAutoClean633Toggle() {
    val current = BiliClient.prefs.v633bucketAutoClean633
    BiliClient.prefs.v633bucketAutoClean633 = !current
    AppToast.show(this, "Bucket Auto Clean633: ${if (!current) "ON" else "OFF"}")
}

// v633: Build Auto Version633
internal fun PlayerActivity.showV633BuildAutoVersion633Toggle() {
    val current = BiliClient.prefs.v633buildAutoVersion633
    BiliClient.prefs.v633buildAutoVersion633 = !current
    AppToast.show(this, "Build Auto Version633: ${if (!current) "ON" else "OFF"}")
}

// v633: Bulk Auto Import633
internal fun PlayerActivity.showV633BulkAutoImport633Toggle() {
    val current = BiliClient.prefs.v633bulkAutoImport633
    BiliClient.prefs.v633bulkAutoImport633 = !current
    AppToast.show(this, "Bulk Auto Import633: ${if (!current) "ON" else "OFF"}")
}

// v633: Button Auto Haptic633
internal fun PlayerActivity.showV633ButtonAutoHaptic633Toggle() {
    val current = BiliClient.prefs.v633buttonAutoHaptic633
    BiliClient.prefs.v633buttonAutoHaptic633 = !current
    AppToast.show(this, "Button Auto Haptic633: ${if (!current) "ON" else "OFF"}")
}

// v633: Byte Auto Convert633
internal fun PlayerActivity.showV633ByteAutoConvert633Toggle() {
    val current = BiliClient.prefs.v633byteAutoConvert633
    BiliClient.prefs.v633byteAutoConvert633 = !current
    AppToast.show(this, "Byte Auto Convert633: ${if (!current) "ON" else "OFF"}")
}

// v633: Calibrate Auto Color633
internal fun PlayerActivity.showV633CalibrateAutoColor633Toggle() {
    val current = BiliClient.prefs.v633calibrateAutoColor633
    BiliClient.prefs.v633calibrateAutoColor633 = !current
    AppToast.show(this, "Calibrate Auto Color633: ${if (!current) "ON" else "OFF"}")
}

// v633: Call Auto Log633
internal fun PlayerActivity.showV633CallAutoLog633Toggle() {
    val current = BiliClient.prefs.v633callAutoLog633
    BiliClient.prefs.v633callAutoLog633 = !current
    AppToast.show(this, "Call Auto Log633: ${if (!current) "ON" else "OFF"}")
}

// v633: Camera Auto Focus633
internal fun PlayerActivity.showV633CameraAutoFocus633Toggle() {
    val current = BiliClient.prefs.v633cameraAutoFocus633
    BiliClient.prefs.v633cameraAutoFocus633 = !current
    AppToast.show(this, "Camera Auto Focus633: ${if (!current) "ON" else "OFF"}")
}

// v633: Campus Auto Select633
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

// v633: Cancel Auto Undo633
internal fun PlayerActivity.showV633CancelAutoUndo633Toggle() {
    val current = BiliClient.prefs.v633cancelAutoUndo633
    BiliClient.prefs.v633cancelAutoUndo633 = !current
    AppToast.show(this, "Cancel Auto Undo633: ${if (!current) "ON" else "OFF"}")
}

// v633: Capture Auto Mode633
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

// v633: Caret Auto Blink633
internal fun PlayerActivity.showV633CaretAutoBlink633Toggle() {
    val current = BiliClient.prefs.v633caretAutoBlink633
    BiliClient.prefs.v633caretAutoBlink633 = !current
    AppToast.show(this, "Caret Auto Blink633: ${if (!current) "ON" else "OFF"}")
}

// v633: Case Auto Convert633
internal fun PlayerActivity.showV633CaseAutoConvert633Toggle() {
    val current = BiliClient.prefs.v633caseAutoConvert633
    BiliClient.prefs.v633caseAutoConvert633 = !current
    AppToast.show(this, "Case Auto Convert633: ${if (!current) "ON" else "OFF"}")
}

// v633: Category Auto Sort633
internal fun PlayerActivity.showV633CategoryAutoSort633Toggle() {
    val current = BiliClient.prefs.v633categoryAutoSort633
    BiliClient.prefs.v633categoryAutoSort633 = !current
    AppToast.show(this, "Category Auto Sort633: ${if (!current) "ON" else "OFF"}")
}

// v634: Browse Auto History634
internal fun PlayerActivity.showV634BrowseAutoHistory634Toggle() {
    val current = BiliClient.prefs.v634browseAutoHistory634
    BiliClient.prefs.v634browseAutoHistory634 = !current
    AppToast.show(this, "Browse Auto History634: ${if (!current) "ON" else "OFF"}")
}

// v634: Bucket Auto Clean634
internal fun PlayerActivity.showV634BucketAutoClean634Toggle() {
    val current = BiliClient.prefs.v634bucketAutoClean634
    BiliClient.prefs.v634bucketAutoClean634 = !current
    AppToast.show(this, "Bucket Auto Clean634: ${if (!current) "ON" else "OFF"}")
}

// v634: Build Auto Version634
internal fun PlayerActivity.showV634BuildAutoVersion634Toggle() {
    val current = BiliClient.prefs.v634buildAutoVersion634
    BiliClient.prefs.v634buildAutoVersion634 = !current
    AppToast.show(this, "Build Auto Version634: ${if (!current) "ON" else "OFF"}")
}

// v634: Bulk Auto Import634
internal fun PlayerActivity.showV634BulkAutoImport634Toggle() {
    val current = BiliClient.prefs.v634bulkAutoImport634
    BiliClient.prefs.v634bulkAutoImport634 = !current
    AppToast.show(this, "Bulk Auto Import634: ${if (!current) "ON" else "OFF"}")
}

// v634: Button Auto Haptic634
internal fun PlayerActivity.showV634ButtonAutoHaptic634Toggle() {
    val current = BiliClient.prefs.v634buttonAutoHaptic634
    BiliClient.prefs.v634buttonAutoHaptic634 = !current
    AppToast.show(this, "Button Auto Haptic634: ${if (!current) "ON" else "OFF"}")
}

// v634: Byte Auto Convert634
internal fun PlayerActivity.showV634ByteAutoConvert634Toggle() {
    val current = BiliClient.prefs.v634byteAutoConvert634
    BiliClient.prefs.v634byteAutoConvert634 = !current
    AppToast.show(this, "Byte Auto Convert634: ${if (!current) "ON" else "OFF"}")
}

// v634: Calibrate Auto Color634
internal fun PlayerActivity.showV634CalibrateAutoColor634Toggle() {
    val current = BiliClient.prefs.v634calibrateAutoColor634
    BiliClient.prefs.v634calibrateAutoColor634 = !current
    AppToast.show(this, "Calibrate Auto Color634: ${if (!current) "ON" else "OFF"}")
}

// v634: Call Auto Log634
internal fun PlayerActivity.showV634CallAutoLog634Toggle() {
    val current = BiliClient.prefs.v634callAutoLog634
    BiliClient.prefs.v634callAutoLog634 = !current
    AppToast.show(this, "Call Auto Log634: ${if (!current) "ON" else "OFF"}")
}

// v634: Camera Auto Focus634
internal fun PlayerActivity.showV634CameraAutoFocus634Toggle() {
    val current = BiliClient.prefs.v634cameraAutoFocus634
    BiliClient.prefs.v634cameraAutoFocus634 = !current
    AppToast.show(this, "Camera Auto Focus634: ${if (!current) "ON" else "OFF"}")
}

// v634: Campus Auto Select634
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

// v634: Cancel Auto Undo634
internal fun PlayerActivity.showV634CancelAutoUndo634Toggle() {
    val current = BiliClient.prefs.v634cancelAutoUndo634
    BiliClient.prefs.v634cancelAutoUndo634 = !current
    AppToast.show(this, "Cancel Auto Undo634: ${if (!current) "ON" else "OFF"}")
}

// v634: Capture Auto Mode634
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

// v634: Caret Auto Blink634
internal fun PlayerActivity.showV634CaretAutoBlink634Toggle() {
    val current = BiliClient.prefs.v634caretAutoBlink634
    BiliClient.prefs.v634caretAutoBlink634 = !current
    AppToast.show(this, "Caret Auto Blink634: ${if (!current) "ON" else "OFF"}")
}

// v634: Case Auto Convert634
internal fun PlayerActivity.showV634CaseAutoConvert634Toggle() {
    val current = BiliClient.prefs.v634caseAutoConvert634
    BiliClient.prefs.v634caseAutoConvert634 = !current
    AppToast.show(this, "Case Auto Convert634: ${if (!current) "ON" else "OFF"}")
}

// v634: Category Auto Sort634
internal fun PlayerActivity.showV634CategoryAutoSort634Toggle() {
    val current = BiliClient.prefs.v634categoryAutoSort634
    BiliClient.prefs.v634categoryAutoSort634 = !current
    AppToast.show(this, "Category Auto Sort634: ${if (!current) "ON" else "OFF"}")
}

// v635: Browse Auto History635
internal fun PlayerActivity.showV635BrowseAutoHistory635Toggle() {
    val current = BiliClient.prefs.v635browseAutoHistory635
    BiliClient.prefs.v635browseAutoHistory635 = !current
    AppToast.show(this, "Browse Auto History635: ${if (!current) "ON" else "OFF"}")
}

// v635: Bucket Auto Clean635
internal fun PlayerActivity.showV635BucketAutoClean635Toggle() {
    val current = BiliClient.prefs.v635bucketAutoClean635
    BiliClient.prefs.v635bucketAutoClean635 = !current
    AppToast.show(this, "Bucket Auto Clean635: ${if (!current) "ON" else "OFF"}")
}

// v635: Build Auto Version635
internal fun PlayerActivity.showV635BuildAutoVersion635Toggle() {
    val current = BiliClient.prefs.v635buildAutoVersion635
    BiliClient.prefs.v635buildAutoVersion635 = !current
    AppToast.show(this, "Build Auto Version635: ${if (!current) "ON" else "OFF"}")
}

// v635: Bulk Auto Import635
internal fun PlayerActivity.showV635BulkAutoImport635Toggle() {
    val current = BiliClient.prefs.v635bulkAutoImport635
    BiliClient.prefs.v635bulkAutoImport635 = !current
    AppToast.show(this, "Bulk Auto Import635: ${if (!current) "ON" else "OFF"}")
}

// v635: Button Auto Haptic635
internal fun PlayerActivity.showV635ButtonAutoHaptic635Toggle() {
    val current = BiliClient.prefs.v635buttonAutoHaptic635
    BiliClient.prefs.v635buttonAutoHaptic635 = !current
    AppToast.show(this, "Button Auto Haptic635: ${if (!current) "ON" else "OFF"}")
}

// v635: Byte Auto Convert635
internal fun PlayerActivity.showV635ByteAutoConvert635Toggle() {
    val current = BiliClient.prefs.v635byteAutoConvert635
    BiliClient.prefs.v635byteAutoConvert635 = !current
    AppToast.show(this, "Byte Auto Convert635: ${if (!current) "ON" else "OFF"}")
}

// v635: Calibrate Auto Color635
internal fun PlayerActivity.showV635CalibrateAutoColor635Toggle() {
    val current = BiliClient.prefs.v635calibrateAutoColor635
    BiliClient.prefs.v635calibrateAutoColor635 = !current
    AppToast.show(this, "Calibrate Auto Color635: ${if (!current) "ON" else "OFF"}")
}

// v635: Call Auto Log635
internal fun PlayerActivity.showV635CallAutoLog635Toggle() {
    val current = BiliClient.prefs.v635callAutoLog635
    BiliClient.prefs.v635callAutoLog635 = !current
    AppToast.show(this, "Call Auto Log635: ${if (!current) "ON" else "OFF"}")
}

// v635: Camera Auto Focus635
internal fun PlayerActivity.showV635CameraAutoFocus635Toggle() {
    val current = BiliClient.prefs.v635cameraAutoFocus635
    BiliClient.prefs.v635cameraAutoFocus635 = !current
    AppToast.show(this, "Camera Auto Focus635: ${if (!current) "ON" else "OFF"}")
}

// v635: Campus Auto Select635
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

// v635: Cancel Auto Undo635
internal fun PlayerActivity.showV635CancelAutoUndo635Toggle() {
    val current = BiliClient.prefs.v635cancelAutoUndo635
    BiliClient.prefs.v635cancelAutoUndo635 = !current
    AppToast.show(this, "Cancel Auto Undo635: ${if (!current) "ON" else "OFF"}")
}

// v635: Capture Auto Mode635
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

// v635: Caret Auto Blink635
internal fun PlayerActivity.showV635CaretAutoBlink635Toggle() {
    val current = BiliClient.prefs.v635caretAutoBlink635
    BiliClient.prefs.v635caretAutoBlink635 = !current
    AppToast.show(this, "Caret Auto Blink635: ${if (!current) "ON" else "OFF"}")
}

// v635: Case Auto Convert635
internal fun PlayerActivity.showV635CaseAutoConvert635Toggle() {
    val current = BiliClient.prefs.v635caseAutoConvert635
    BiliClient.prefs.v635caseAutoConvert635 = !current
    AppToast.show(this, "Case Auto Convert635: ${if (!current) "ON" else "OFF"}")
}

// v635: Category Auto Sort635
internal fun PlayerActivity.showV635CategoryAutoSort635Toggle() {
    val current = BiliClient.prefs.v635categoryAutoSort635
    BiliClient.prefs.v635categoryAutoSort635 = !current
    AppToast.show(this, "Category Auto Sort635: ${if (!current) "ON" else "OFF"}")
}

// v636: Browse Auto History636
internal fun PlayerActivity.showV636BrowseAutoHistory636Toggle() {
    val current = BiliClient.prefs.v636browseAutoHistory636
    BiliClient.prefs.v636browseAutoHistory636 = !current
    AppToast.show(this, "Browse Auto History636: ${if (!current) "ON" else "OFF"}")
}

// v636: Bucket Auto Clean636
internal fun PlayerActivity.showV636BucketAutoClean636Toggle() {
    val current = BiliClient.prefs.v636bucketAutoClean636
    BiliClient.prefs.v636bucketAutoClean636 = !current
    AppToast.show(this, "Bucket Auto Clean636: ${if (!current) "ON" else "OFF"}")
}

// v636: Build Auto Version636
internal fun PlayerActivity.showV636BuildAutoVersion636Toggle() {
    val current = BiliClient.prefs.v636buildAutoVersion636
    BiliClient.prefs.v636buildAutoVersion636 = !current
    AppToast.show(this, "Build Auto Version636: ${if (!current) "ON" else "OFF"}")
}

// v636: Bulk Auto Import636
internal fun PlayerActivity.showV636BulkAutoImport636Toggle() {
    val current = BiliClient.prefs.v636bulkAutoImport636
    BiliClient.prefs.v636bulkAutoImport636 = !current
    AppToast.show(this, "Bulk Auto Import636: ${if (!current) "ON" else "OFF"}")
}

// v636: Button Auto Haptic636
internal fun PlayerActivity.showV636ButtonAutoHaptic636Toggle() {
    val current = BiliClient.prefs.v636buttonAutoHaptic636
    BiliClient.prefs.v636buttonAutoHaptic636 = !current
    AppToast.show(this, "Button Auto Haptic636: ${if (!current) "ON" else "OFF"}")
}

// v636: Byte Auto Convert636
internal fun PlayerActivity.showV636ByteAutoConvert636Toggle() {
    val current = BiliClient.prefs.v636byteAutoConvert636
    BiliClient.prefs.v636byteAutoConvert636 = !current
    AppToast.show(this, "Byte Auto Convert636: ${if (!current) "ON" else "OFF"}")
}

// v636: Calibrate Auto Color636
internal fun PlayerActivity.showV636CalibrateAutoColor636Toggle() {
    val current = BiliClient.prefs.v636calibrateAutoColor636
    BiliClient.prefs.v636calibrateAutoColor636 = !current
    AppToast.show(this, "Calibrate Auto Color636: ${if (!current) "ON" else "OFF"}")
}

// v636: Call Auto Log636
internal fun PlayerActivity.showV636CallAutoLog636Toggle() {
    val current = BiliClient.prefs.v636callAutoLog636
    BiliClient.prefs.v636callAutoLog636 = !current
    AppToast.show(this, "Call Auto Log636: ${if (!current) "ON" else "OFF"}")
}

