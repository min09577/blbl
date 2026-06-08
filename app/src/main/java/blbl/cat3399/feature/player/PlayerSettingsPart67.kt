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

// v851: Parent Auto Scope851
internal fun PlayerActivity.showV851ParentAutoScope851Toggle() {
    val current = BiliClient.prefs.v851parentAutoScope851
    BiliClient.prefs.v851parentAutoScope851 = !current
    AppToast.show(this, "Parent Auto Scope851: ${if (!current) "ON" else "OFF"}")
}

// v851: Parse Auto Json851
internal fun PlayerActivity.showV851ParseAutoJson851Toggle() {
    val current = BiliClient.prefs.v851parseAutoJson851
    BiliClient.prefs.v851parseAutoJson851 = !current
    AppToast.show(this, "Parse Auto Json851: ${if (!current) "ON" else "OFF"}")
}

// v851: Partial Auto Load851
internal fun PlayerActivity.showV851PartialAutoLoad851Toggle() {
    val current = BiliClient.prefs.v851partialAutoLoad851
    BiliClient.prefs.v851partialAutoLoad851 = !current
    AppToast.show(this, "Partial Auto Load851: ${if (!current) "ON" else "OFF"}")
}

// v851: Pass Auto Through851
internal fun PlayerActivity.showV851PassAutoThrough851Toggle() {
    val current = BiliClient.prefs.v851passAutoThrough851
    BiliClient.prefs.v851passAutoThrough851 = !current
    AppToast.show(this, "Pass Auto Through851: ${if (!current) "ON" else "OFF"}")
}

// v851: Password Auto Fill851
internal fun PlayerActivity.showV851PasswordAutoFill851Toggle() {
    val current = BiliClient.prefs.v851passwordAutoFill851
    BiliClient.prefs.v851passwordAutoFill851 = !current
    AppToast.show(this, "Password Auto Fill851: ${if (!current) "ON" else "OFF"}")
}

// v851: Paste Auto Clean851
internal fun PlayerActivity.showV851PasteAutoClean851Toggle() {
    val current = BiliClient.prefs.v851pasteAutoClean851
    BiliClient.prefs.v851pasteAutoClean851 = !current
    AppToast.show(this, "Paste Auto Clean851: ${if (!current) "ON" else "OFF"}")
}

// v851: Patch Auto Apply851
internal fun PlayerActivity.showV851PatchAutoApply851Toggle() {
    val current = BiliClient.prefs.v851patchAutoApply851
    BiliClient.prefs.v851patchAutoApply851 = !current
    AppToast.show(this, "Patch Auto Apply851: ${if (!current) "ON" else "OFF"}")
}

// v851: Path Auto Resolve851
internal fun PlayerActivity.showV851PathAutoResolve851Toggle() {
    val current = BiliClient.prefs.v851pathAutoResolve851
    BiliClient.prefs.v851pathAutoResolve851 = !current
    AppToast.show(this, "Path Auto Resolve851: ${if (!current) "ON" else "OFF"}")
}

// v851: Pattern Auto Match851
internal fun PlayerActivity.showV851PatternAutoMatch851Toggle() {
    val current = BiliClient.prefs.v851patternAutoMatch851
    BiliClient.prefs.v851patternAutoMatch851 = !current
    AppToast.show(this, "Pattern Auto Match851: ${if (!current) "ON" else "OFF"}")
}

// v851: Pause Auto Resume851
internal fun PlayerActivity.showV851PauseAutoResume851Toggle() {
    val current = BiliClient.prefs.v851pauseAutoResume851
    BiliClient.prefs.v851pauseAutoResume851 = !current
    AppToast.show(this, "Pause Auto Resume851: ${if (!current) "ON" else "OFF"}")
}

// v851: Payload Auto Encode851
internal fun PlayerActivity.showV851PayloadAutoEncode851Toggle() {
    val current = BiliClient.prefs.v851payloadAutoEncode851
    BiliClient.prefs.v851payloadAutoEncode851 = !current
    AppToast.show(this, "Payload Auto Encode851: ${if (!current) "ON" else "OFF"}")
}

// v851: Peak Auto Detect851
internal fun PlayerActivity.showV851PeakAutoDetect851Toggle() {
    val current = BiliClient.prefs.v851peakAutoDetect851
    BiliClient.prefs.v851peakAutoDetect851 = !current
    AppToast.show(this, "Peak Auto Detect851: ${if (!current) "ON" else "OFF"}")
}

// v851: Pending Auto Queue851
internal fun PlayerActivity.showV851PendingAutoQueue851Toggle() {
    val current = BiliClient.prefs.v851pendingAutoQueue851
    BiliClient.prefs.v851pendingAutoQueue851 = !current
    AppToast.show(this, "Pending Auto Queue851: ${if (!current) "ON" else "OFF"}")
}

// v851: Percent Auto Calc851
internal fun PlayerActivity.showV851PercentAutoCalc851Toggle() {
    val current = BiliClient.prefs.v851percentAutoCalc851
    BiliClient.prefs.v851percentAutoCalc851 = !current
    AppToast.show(this, "Percent Auto Calc851: ${if (!current) "ON" else "OFF"}")
}

// v851: Perform Auto Benchmark851
internal fun PlayerActivity.showV851PerformAutoBenchmark851Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v851performAutoBenchmark851).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark851",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v851performAutoBenchmark851 = value
        AppToast.show(this, "Perform Auto Benchmark851: $value")
    }
}

// v852: Parent Auto Scope852
internal fun PlayerActivity.showV852ParentAutoScope852Toggle() {
    val current = BiliClient.prefs.v852parentAutoScope852
    BiliClient.prefs.v852parentAutoScope852 = !current
    AppToast.show(this, "Parent Auto Scope852: ${if (!current) "ON" else "OFF"}")
}

// v852: Parse Auto Json852
internal fun PlayerActivity.showV852ParseAutoJson852Toggle() {
    val current = BiliClient.prefs.v852parseAutoJson852
    BiliClient.prefs.v852parseAutoJson852 = !current
    AppToast.show(this, "Parse Auto Json852: ${if (!current) "ON" else "OFF"}")
}

// v852: Partial Auto Load852
internal fun PlayerActivity.showV852PartialAutoLoad852Toggle() {
    val current = BiliClient.prefs.v852partialAutoLoad852
    BiliClient.prefs.v852partialAutoLoad852 = !current
    AppToast.show(this, "Partial Auto Load852: ${if (!current) "ON" else "OFF"}")
}

// v852: Pass Auto Through852
internal fun PlayerActivity.showV852PassAutoThrough852Toggle() {
    val current = BiliClient.prefs.v852passAutoThrough852
    BiliClient.prefs.v852passAutoThrough852 = !current
    AppToast.show(this, "Pass Auto Through852: ${if (!current) "ON" else "OFF"}")
}

// v852: Password Auto Fill852
internal fun PlayerActivity.showV852PasswordAutoFill852Toggle() {
    val current = BiliClient.prefs.v852passwordAutoFill852
    BiliClient.prefs.v852passwordAutoFill852 = !current
    AppToast.show(this, "Password Auto Fill852: ${if (!current) "ON" else "OFF"}")
}

// v852: Paste Auto Clean852
internal fun PlayerActivity.showV852PasteAutoClean852Toggle() {
    val current = BiliClient.prefs.v852pasteAutoClean852
    BiliClient.prefs.v852pasteAutoClean852 = !current
    AppToast.show(this, "Paste Auto Clean852: ${if (!current) "ON" else "OFF"}")
}

// v852: Patch Auto Apply852
internal fun PlayerActivity.showV852PatchAutoApply852Toggle() {
    val current = BiliClient.prefs.v852patchAutoApply852
    BiliClient.prefs.v852patchAutoApply852 = !current
    AppToast.show(this, "Patch Auto Apply852: ${if (!current) "ON" else "OFF"}")
}

// v852: Path Auto Resolve852
internal fun PlayerActivity.showV852PathAutoResolve852Toggle() {
    val current = BiliClient.prefs.v852pathAutoResolve852
    BiliClient.prefs.v852pathAutoResolve852 = !current
    AppToast.show(this, "Path Auto Resolve852: ${if (!current) "ON" else "OFF"}")
}

// v852: Pattern Auto Match852
internal fun PlayerActivity.showV852PatternAutoMatch852Toggle() {
    val current = BiliClient.prefs.v852patternAutoMatch852
    BiliClient.prefs.v852patternAutoMatch852 = !current
    AppToast.show(this, "Pattern Auto Match852: ${if (!current) "ON" else "OFF"}")
}

// v852: Pause Auto Resume852
internal fun PlayerActivity.showV852PauseAutoResume852Toggle() {
    val current = BiliClient.prefs.v852pauseAutoResume852
    BiliClient.prefs.v852pauseAutoResume852 = !current
    AppToast.show(this, "Pause Auto Resume852: ${if (!current) "ON" else "OFF"}")
}

// v852: Payload Auto Encode852
internal fun PlayerActivity.showV852PayloadAutoEncode852Toggle() {
    val current = BiliClient.prefs.v852payloadAutoEncode852
    BiliClient.prefs.v852payloadAutoEncode852 = !current
    AppToast.show(this, "Payload Auto Encode852: ${if (!current) "ON" else "OFF"}")
}

// v852: Peak Auto Detect852
internal fun PlayerActivity.showV852PeakAutoDetect852Toggle() {
    val current = BiliClient.prefs.v852peakAutoDetect852
    BiliClient.prefs.v852peakAutoDetect852 = !current
    AppToast.show(this, "Peak Auto Detect852: ${if (!current) "ON" else "OFF"}")
}

// v852: Pending Auto Queue852
internal fun PlayerActivity.showV852PendingAutoQueue852Toggle() {
    val current = BiliClient.prefs.v852pendingAutoQueue852
    BiliClient.prefs.v852pendingAutoQueue852 = !current
    AppToast.show(this, "Pending Auto Queue852: ${if (!current) "ON" else "OFF"}")
}

// v852: Percent Auto Calc852
internal fun PlayerActivity.showV852PercentAutoCalc852Toggle() {
    val current = BiliClient.prefs.v852percentAutoCalc852
    BiliClient.prefs.v852percentAutoCalc852 = !current
    AppToast.show(this, "Percent Auto Calc852: ${if (!current) "ON" else "OFF"}")
}

// v852: Perform Auto Benchmark852
internal fun PlayerActivity.showV852PerformAutoBenchmark852Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v852performAutoBenchmark852).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark852",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v852performAutoBenchmark852 = value
        AppToast.show(this, "Perform Auto Benchmark852: $value")
    }
}

// v853: Parent Auto Scope853
internal fun PlayerActivity.showV853ParentAutoScope853Toggle() {
    val current = BiliClient.prefs.v853parentAutoScope853
    BiliClient.prefs.v853parentAutoScope853 = !current
    AppToast.show(this, "Parent Auto Scope853: ${if (!current) "ON" else "OFF"}")
}

// v853: Parse Auto Json853
internal fun PlayerActivity.showV853ParseAutoJson853Toggle() {
    val current = BiliClient.prefs.v853parseAutoJson853
    BiliClient.prefs.v853parseAutoJson853 = !current
    AppToast.show(this, "Parse Auto Json853: ${if (!current) "ON" else "OFF"}")
}

// v853: Partial Auto Load853
internal fun PlayerActivity.showV853PartialAutoLoad853Toggle() {
    val current = BiliClient.prefs.v853partialAutoLoad853
    BiliClient.prefs.v853partialAutoLoad853 = !current
    AppToast.show(this, "Partial Auto Load853: ${if (!current) "ON" else "OFF"}")
}

// v853: Pass Auto Through853
internal fun PlayerActivity.showV853PassAutoThrough853Toggle() {
    val current = BiliClient.prefs.v853passAutoThrough853
    BiliClient.prefs.v853passAutoThrough853 = !current
    AppToast.show(this, "Pass Auto Through853: ${if (!current) "ON" else "OFF"}")
}

// v853: Password Auto Fill853
internal fun PlayerActivity.showV853PasswordAutoFill853Toggle() {
    val current = BiliClient.prefs.v853passwordAutoFill853
    BiliClient.prefs.v853passwordAutoFill853 = !current
    AppToast.show(this, "Password Auto Fill853: ${if (!current) "ON" else "OFF"}")
}

// v853: Paste Auto Clean853
internal fun PlayerActivity.showV853PasteAutoClean853Toggle() {
    val current = BiliClient.prefs.v853pasteAutoClean853
    BiliClient.prefs.v853pasteAutoClean853 = !current
    AppToast.show(this, "Paste Auto Clean853: ${if (!current) "ON" else "OFF"}")
}

// v853: Patch Auto Apply853
internal fun PlayerActivity.showV853PatchAutoApply853Toggle() {
    val current = BiliClient.prefs.v853patchAutoApply853
    BiliClient.prefs.v853patchAutoApply853 = !current
    AppToast.show(this, "Patch Auto Apply853: ${if (!current) "ON" else "OFF"}")
}

// v853: Path Auto Resolve853
internal fun PlayerActivity.showV853PathAutoResolve853Toggle() {
    val current = BiliClient.prefs.v853pathAutoResolve853
    BiliClient.prefs.v853pathAutoResolve853 = !current
    AppToast.show(this, "Path Auto Resolve853: ${if (!current) "ON" else "OFF"}")
}

// v853: Pattern Auto Match853
internal fun PlayerActivity.showV853PatternAutoMatch853Toggle() {
    val current = BiliClient.prefs.v853patternAutoMatch853
    BiliClient.prefs.v853patternAutoMatch853 = !current
    AppToast.show(this, "Pattern Auto Match853: ${if (!current) "ON" else "OFF"}")
}

// v853: Pause Auto Resume853
internal fun PlayerActivity.showV853PauseAutoResume853Toggle() {
    val current = BiliClient.prefs.v853pauseAutoResume853
    BiliClient.prefs.v853pauseAutoResume853 = !current
    AppToast.show(this, "Pause Auto Resume853: ${if (!current) "ON" else "OFF"}")
}

// v853: Payload Auto Encode853
internal fun PlayerActivity.showV853PayloadAutoEncode853Toggle() {
    val current = BiliClient.prefs.v853payloadAutoEncode853
    BiliClient.prefs.v853payloadAutoEncode853 = !current
    AppToast.show(this, "Payload Auto Encode853: ${if (!current) "ON" else "OFF"}")
}

// v853: Peak Auto Detect853
internal fun PlayerActivity.showV853PeakAutoDetect853Toggle() {
    val current = BiliClient.prefs.v853peakAutoDetect853
    BiliClient.prefs.v853peakAutoDetect853 = !current
    AppToast.show(this, "Peak Auto Detect853: ${if (!current) "ON" else "OFF"}")
}

// v853: Pending Auto Queue853
internal fun PlayerActivity.showV853PendingAutoQueue853Toggle() {
    val current = BiliClient.prefs.v853pendingAutoQueue853
    BiliClient.prefs.v853pendingAutoQueue853 = !current
    AppToast.show(this, "Pending Auto Queue853: ${if (!current) "ON" else "OFF"}")
}

// v853: Percent Auto Calc853
internal fun PlayerActivity.showV853PercentAutoCalc853Toggle() {
    val current = BiliClient.prefs.v853percentAutoCalc853
    BiliClient.prefs.v853percentAutoCalc853 = !current
    AppToast.show(this, "Percent Auto Calc853: ${if (!current) "ON" else "OFF"}")
}

// v853: Perform Auto Benchmark853
internal fun PlayerActivity.showV853PerformAutoBenchmark853Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v853performAutoBenchmark853).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark853",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v853performAutoBenchmark853 = value
        AppToast.show(this, "Perform Auto Benchmark853: $value")
    }
}

// v854: Parent Auto Scope854
internal fun PlayerActivity.showV854ParentAutoScope854Toggle() {
    val current = BiliClient.prefs.v854parentAutoScope854
    BiliClient.prefs.v854parentAutoScope854 = !current
    AppToast.show(this, "Parent Auto Scope854: ${if (!current) "ON" else "OFF"}")
}

// v854: Parse Auto Json854
internal fun PlayerActivity.showV854ParseAutoJson854Toggle() {
    val current = BiliClient.prefs.v854parseAutoJson854
    BiliClient.prefs.v854parseAutoJson854 = !current
    AppToast.show(this, "Parse Auto Json854: ${if (!current) "ON" else "OFF"}")
}

// v854: Partial Auto Load854
internal fun PlayerActivity.showV854PartialAutoLoad854Toggle() {
    val current = BiliClient.prefs.v854partialAutoLoad854
    BiliClient.prefs.v854partialAutoLoad854 = !current
    AppToast.show(this, "Partial Auto Load854: ${if (!current) "ON" else "OFF"}")
}

// v854: Pass Auto Through854
internal fun PlayerActivity.showV854PassAutoThrough854Toggle() {
    val current = BiliClient.prefs.v854passAutoThrough854
    BiliClient.prefs.v854passAutoThrough854 = !current
    AppToast.show(this, "Pass Auto Through854: ${if (!current) "ON" else "OFF"}")
}

// v854: Password Auto Fill854
internal fun PlayerActivity.showV854PasswordAutoFill854Toggle() {
    val current = BiliClient.prefs.v854passwordAutoFill854
    BiliClient.prefs.v854passwordAutoFill854 = !current
    AppToast.show(this, "Password Auto Fill854: ${if (!current) "ON" else "OFF"}")
}

// v854: Paste Auto Clean854
internal fun PlayerActivity.showV854PasteAutoClean854Toggle() {
    val current = BiliClient.prefs.v854pasteAutoClean854
    BiliClient.prefs.v854pasteAutoClean854 = !current
    AppToast.show(this, "Paste Auto Clean854: ${if (!current) "ON" else "OFF"}")
}

// v854: Patch Auto Apply854
internal fun PlayerActivity.showV854PatchAutoApply854Toggle() {
    val current = BiliClient.prefs.v854patchAutoApply854
    BiliClient.prefs.v854patchAutoApply854 = !current
    AppToast.show(this, "Patch Auto Apply854: ${if (!current) "ON" else "OFF"}")
}

// v854: Path Auto Resolve854
internal fun PlayerActivity.showV854PathAutoResolve854Toggle() {
    val current = BiliClient.prefs.v854pathAutoResolve854
    BiliClient.prefs.v854pathAutoResolve854 = !current
    AppToast.show(this, "Path Auto Resolve854: ${if (!current) "ON" else "OFF"}")
}

// v854: Pattern Auto Match854
internal fun PlayerActivity.showV854PatternAutoMatch854Toggle() {
    val current = BiliClient.prefs.v854patternAutoMatch854
    BiliClient.prefs.v854patternAutoMatch854 = !current
    AppToast.show(this, "Pattern Auto Match854: ${if (!current) "ON" else "OFF"}")
}

// v854: Pause Auto Resume854
internal fun PlayerActivity.showV854PauseAutoResume854Toggle() {
    val current = BiliClient.prefs.v854pauseAutoResume854
    BiliClient.prefs.v854pauseAutoResume854 = !current
    AppToast.show(this, "Pause Auto Resume854: ${if (!current) "ON" else "OFF"}")
}

// v854: Payload Auto Encode854
internal fun PlayerActivity.showV854PayloadAutoEncode854Toggle() {
    val current = BiliClient.prefs.v854payloadAutoEncode854
    BiliClient.prefs.v854payloadAutoEncode854 = !current
    AppToast.show(this, "Payload Auto Encode854: ${if (!current) "ON" else "OFF"}")
}

// v854: Peak Auto Detect854
internal fun PlayerActivity.showV854PeakAutoDetect854Toggle() {
    val current = BiliClient.prefs.v854peakAutoDetect854
    BiliClient.prefs.v854peakAutoDetect854 = !current
    AppToast.show(this, "Peak Auto Detect854: ${if (!current) "ON" else "OFF"}")
}

// v854: Pending Auto Queue854
internal fun PlayerActivity.showV854PendingAutoQueue854Toggle() {
    val current = BiliClient.prefs.v854pendingAutoQueue854
    BiliClient.prefs.v854pendingAutoQueue854 = !current
    AppToast.show(this, "Pending Auto Queue854: ${if (!current) "ON" else "OFF"}")
}

// v854: Percent Auto Calc854
internal fun PlayerActivity.showV854PercentAutoCalc854Toggle() {
    val current = BiliClient.prefs.v854percentAutoCalc854
    BiliClient.prefs.v854percentAutoCalc854 = !current
    AppToast.show(this, "Percent Auto Calc854: ${if (!current) "ON" else "OFF"}")
}

// v854: Perform Auto Benchmark854
internal fun PlayerActivity.showV854PerformAutoBenchmark854Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v854performAutoBenchmark854).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark854",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v854performAutoBenchmark854 = value
        AppToast.show(this, "Perform Auto Benchmark854: $value")
    }
}

// v855: Parent Auto Scope855
internal fun PlayerActivity.showV855ParentAutoScope855Toggle() {
    val current = BiliClient.prefs.v855parentAutoScope855
    BiliClient.prefs.v855parentAutoScope855 = !current
    AppToast.show(this, "Parent Auto Scope855: ${if (!current) "ON" else "OFF"}")
}

// v855: Parse Auto Json855
internal fun PlayerActivity.showV855ParseAutoJson855Toggle() {
    val current = BiliClient.prefs.v855parseAutoJson855
    BiliClient.prefs.v855parseAutoJson855 = !current
    AppToast.show(this, "Parse Auto Json855: ${if (!current) "ON" else "OFF"}")
}

// v855: Partial Auto Load855
internal fun PlayerActivity.showV855PartialAutoLoad855Toggle() {
    val current = BiliClient.prefs.v855partialAutoLoad855
    BiliClient.prefs.v855partialAutoLoad855 = !current
    AppToast.show(this, "Partial Auto Load855: ${if (!current) "ON" else "OFF"}")
}

// v855: Pass Auto Through855
internal fun PlayerActivity.showV855PassAutoThrough855Toggle() {
    val current = BiliClient.prefs.v855passAutoThrough855
    BiliClient.prefs.v855passAutoThrough855 = !current
    AppToast.show(this, "Pass Auto Through855: ${if (!current) "ON" else "OFF"}")
}

// v855: Password Auto Fill855
internal fun PlayerActivity.showV855PasswordAutoFill855Toggle() {
    val current = BiliClient.prefs.v855passwordAutoFill855
    BiliClient.prefs.v855passwordAutoFill855 = !current
    AppToast.show(this, "Password Auto Fill855: ${if (!current) "ON" else "OFF"}")
}

// v855: Paste Auto Clean855
internal fun PlayerActivity.showV855PasteAutoClean855Toggle() {
    val current = BiliClient.prefs.v855pasteAutoClean855
    BiliClient.prefs.v855pasteAutoClean855 = !current
    AppToast.show(this, "Paste Auto Clean855: ${if (!current) "ON" else "OFF"}")
}

// v855: Patch Auto Apply855
internal fun PlayerActivity.showV855PatchAutoApply855Toggle() {
    val current = BiliClient.prefs.v855patchAutoApply855
    BiliClient.prefs.v855patchAutoApply855 = !current
    AppToast.show(this, "Patch Auto Apply855: ${if (!current) "ON" else "OFF"}")
}

// v855: Path Auto Resolve855
internal fun PlayerActivity.showV855PathAutoResolve855Toggle() {
    val current = BiliClient.prefs.v855pathAutoResolve855
    BiliClient.prefs.v855pathAutoResolve855 = !current
    AppToast.show(this, "Path Auto Resolve855: ${if (!current) "ON" else "OFF"}")
}

// v855: Pattern Auto Match855
internal fun PlayerActivity.showV855PatternAutoMatch855Toggle() {
    val current = BiliClient.prefs.v855patternAutoMatch855
    BiliClient.prefs.v855patternAutoMatch855 = !current
    AppToast.show(this, "Pattern Auto Match855: ${if (!current) "ON" else "OFF"}")
}

// v855: Pause Auto Resume855
internal fun PlayerActivity.showV855PauseAutoResume855Toggle() {
    val current = BiliClient.prefs.v855pauseAutoResume855
    BiliClient.prefs.v855pauseAutoResume855 = !current
    AppToast.show(this, "Pause Auto Resume855: ${if (!current) "ON" else "OFF"}")
}

// v855: Payload Auto Encode855
internal fun PlayerActivity.showV855PayloadAutoEncode855Toggle() {
    val current = BiliClient.prefs.v855payloadAutoEncode855
    BiliClient.prefs.v855payloadAutoEncode855 = !current
    AppToast.show(this, "Payload Auto Encode855: ${if (!current) "ON" else "OFF"}")
}

// v855: Peak Auto Detect855
internal fun PlayerActivity.showV855PeakAutoDetect855Toggle() {
    val current = BiliClient.prefs.v855peakAutoDetect855
    BiliClient.prefs.v855peakAutoDetect855 = !current
    AppToast.show(this, "Peak Auto Detect855: ${if (!current) "ON" else "OFF"}")
}

// v855: Pending Auto Queue855
internal fun PlayerActivity.showV855PendingAutoQueue855Toggle() {
    val current = BiliClient.prefs.v855pendingAutoQueue855
    BiliClient.prefs.v855pendingAutoQueue855 = !current
    AppToast.show(this, "Pending Auto Queue855: ${if (!current) "ON" else "OFF"}")
}

// v855: Percent Auto Calc855
internal fun PlayerActivity.showV855PercentAutoCalc855Toggle() {
    val current = BiliClient.prefs.v855percentAutoCalc855
    BiliClient.prefs.v855percentAutoCalc855 = !current
    AppToast.show(this, "Percent Auto Calc855: ${if (!current) "ON" else "OFF"}")
}

// v855: Perform Auto Benchmark855
internal fun PlayerActivity.showV855PerformAutoBenchmark855Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v855performAutoBenchmark855).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark855",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v855performAutoBenchmark855 = value
        AppToast.show(this, "Perform Auto Benchmark855: $value")
    }
}

// v856: Parent Auto Scope856
internal fun PlayerActivity.showV856ParentAutoScope856Toggle() {
    val current = BiliClient.prefs.v856parentAutoScope856
    BiliClient.prefs.v856parentAutoScope856 = !current
    AppToast.show(this, "Parent Auto Scope856: ${if (!current) "ON" else "OFF"}")
}

// v856: Parse Auto Json856
internal fun PlayerActivity.showV856ParseAutoJson856Toggle() {
    val current = BiliClient.prefs.v856parseAutoJson856
    BiliClient.prefs.v856parseAutoJson856 = !current
    AppToast.show(this, "Parse Auto Json856: ${if (!current) "ON" else "OFF"}")
}

// v856: Partial Auto Load856
internal fun PlayerActivity.showV856PartialAutoLoad856Toggle() {
    val current = BiliClient.prefs.v856partialAutoLoad856
    BiliClient.prefs.v856partialAutoLoad856 = !current
    AppToast.show(this, "Partial Auto Load856: ${if (!current) "ON" else "OFF"}")
}

// v856: Pass Auto Through856
internal fun PlayerActivity.showV856PassAutoThrough856Toggle() {
    val current = BiliClient.prefs.v856passAutoThrough856
    BiliClient.prefs.v856passAutoThrough856 = !current
    AppToast.show(this, "Pass Auto Through856: ${if (!current) "ON" else "OFF"}")
}

// v856: Password Auto Fill856
internal fun PlayerActivity.showV856PasswordAutoFill856Toggle() {
    val current = BiliClient.prefs.v856passwordAutoFill856
    BiliClient.prefs.v856passwordAutoFill856 = !current
    AppToast.show(this, "Password Auto Fill856: ${if (!current) "ON" else "OFF"}")
}

// v856: Paste Auto Clean856
internal fun PlayerActivity.showV856PasteAutoClean856Toggle() {
    val current = BiliClient.prefs.v856pasteAutoClean856
    BiliClient.prefs.v856pasteAutoClean856 = !current
    AppToast.show(this, "Paste Auto Clean856: ${if (!current) "ON" else "OFF"}")
}

// v856: Patch Auto Apply856
internal fun PlayerActivity.showV856PatchAutoApply856Toggle() {
    val current = BiliClient.prefs.v856patchAutoApply856
    BiliClient.prefs.v856patchAutoApply856 = !current
    AppToast.show(this, "Patch Auto Apply856: ${if (!current) "ON" else "OFF"}")
}

// v856: Path Auto Resolve856
internal fun PlayerActivity.showV856PathAutoResolve856Toggle() {
    val current = BiliClient.prefs.v856pathAutoResolve856
    BiliClient.prefs.v856pathAutoResolve856 = !current
    AppToast.show(this, "Path Auto Resolve856: ${if (!current) "ON" else "OFF"}")
}

// v856: Pattern Auto Match856
internal fun PlayerActivity.showV856PatternAutoMatch856Toggle() {
    val current = BiliClient.prefs.v856patternAutoMatch856
    BiliClient.prefs.v856patternAutoMatch856 = !current
    AppToast.show(this, "Pattern Auto Match856: ${if (!current) "ON" else "OFF"}")
}

// v856: Pause Auto Resume856
internal fun PlayerActivity.showV856PauseAutoResume856Toggle() {
    val current = BiliClient.prefs.v856pauseAutoResume856
    BiliClient.prefs.v856pauseAutoResume856 = !current
    AppToast.show(this, "Pause Auto Resume856: ${if (!current) "ON" else "OFF"}")
}

// v856: Payload Auto Encode856
internal fun PlayerActivity.showV856PayloadAutoEncode856Toggle() {
    val current = BiliClient.prefs.v856payloadAutoEncode856
    BiliClient.prefs.v856payloadAutoEncode856 = !current
    AppToast.show(this, "Payload Auto Encode856: ${if (!current) "ON" else "OFF"}")
}

// v856: Peak Auto Detect856
internal fun PlayerActivity.showV856PeakAutoDetect856Toggle() {
    val current = BiliClient.prefs.v856peakAutoDetect856
    BiliClient.prefs.v856peakAutoDetect856 = !current
    AppToast.show(this, "Peak Auto Detect856: ${if (!current) "ON" else "OFF"}")
}

// v856: Pending Auto Queue856
internal fun PlayerActivity.showV856PendingAutoQueue856Toggle() {
    val current = BiliClient.prefs.v856pendingAutoQueue856
    BiliClient.prefs.v856pendingAutoQueue856 = !current
    AppToast.show(this, "Pending Auto Queue856: ${if (!current) "ON" else "OFF"}")
}

// v856: Percent Auto Calc856
internal fun PlayerActivity.showV856PercentAutoCalc856Toggle() {
    val current = BiliClient.prefs.v856percentAutoCalc856
    BiliClient.prefs.v856percentAutoCalc856 = !current
    AppToast.show(this, "Percent Auto Calc856: ${if (!current) "ON" else "OFF"}")
}

// v856: Perform Auto Benchmark856
internal fun PlayerActivity.showV856PerformAutoBenchmark856Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v856performAutoBenchmark856).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark856",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v856performAutoBenchmark856 = value
        AppToast.show(this, "Perform Auto Benchmark856: $value")
    }
}

// v857: Parent Auto Scope857
internal fun PlayerActivity.showV857ParentAutoScope857Toggle() {
    val current = BiliClient.prefs.v857parentAutoScope857
    BiliClient.prefs.v857parentAutoScope857 = !current
    AppToast.show(this, "Parent Auto Scope857: ${if (!current) "ON" else "OFF"}")
}

// v857: Parse Auto Json857
internal fun PlayerActivity.showV857ParseAutoJson857Toggle() {
    val current = BiliClient.prefs.v857parseAutoJson857
    BiliClient.prefs.v857parseAutoJson857 = !current
    AppToast.show(this, "Parse Auto Json857: ${if (!current) "ON" else "OFF"}")
}

// v857: Partial Auto Load857
internal fun PlayerActivity.showV857PartialAutoLoad857Toggle() {
    val current = BiliClient.prefs.v857partialAutoLoad857
    BiliClient.prefs.v857partialAutoLoad857 = !current
    AppToast.show(this, "Partial Auto Load857: ${if (!current) "ON" else "OFF"}")
}

// v857: Pass Auto Through857
internal fun PlayerActivity.showV857PassAutoThrough857Toggle() {
    val current = BiliClient.prefs.v857passAutoThrough857
    BiliClient.prefs.v857passAutoThrough857 = !current
    AppToast.show(this, "Pass Auto Through857: ${if (!current) "ON" else "OFF"}")
}

// v857: Password Auto Fill857
internal fun PlayerActivity.showV857PasswordAutoFill857Toggle() {
    val current = BiliClient.prefs.v857passwordAutoFill857
    BiliClient.prefs.v857passwordAutoFill857 = !current
    AppToast.show(this, "Password Auto Fill857: ${if (!current) "ON" else "OFF"}")
}

// v857: Paste Auto Clean857
internal fun PlayerActivity.showV857PasteAutoClean857Toggle() {
    val current = BiliClient.prefs.v857pasteAutoClean857
    BiliClient.prefs.v857pasteAutoClean857 = !current
    AppToast.show(this, "Paste Auto Clean857: ${if (!current) "ON" else "OFF"}")
}

// v857: Patch Auto Apply857
internal fun PlayerActivity.showV857PatchAutoApply857Toggle() {
    val current = BiliClient.prefs.v857patchAutoApply857
    BiliClient.prefs.v857patchAutoApply857 = !current
    AppToast.show(this, "Patch Auto Apply857: ${if (!current) "ON" else "OFF"}")
}

// v857: Path Auto Resolve857
internal fun PlayerActivity.showV857PathAutoResolve857Toggle() {
    val current = BiliClient.prefs.v857pathAutoResolve857
    BiliClient.prefs.v857pathAutoResolve857 = !current
    AppToast.show(this, "Path Auto Resolve857: ${if (!current) "ON" else "OFF"}")
}

// v857: Pattern Auto Match857
internal fun PlayerActivity.showV857PatternAutoMatch857Toggle() {
    val current = BiliClient.prefs.v857patternAutoMatch857
    BiliClient.prefs.v857patternAutoMatch857 = !current
    AppToast.show(this, "Pattern Auto Match857: ${if (!current) "ON" else "OFF"}")
}

// v857: Pause Auto Resume857
internal fun PlayerActivity.showV857PauseAutoResume857Toggle() {
    val current = BiliClient.prefs.v857pauseAutoResume857
    BiliClient.prefs.v857pauseAutoResume857 = !current
    AppToast.show(this, "Pause Auto Resume857: ${if (!current) "ON" else "OFF"}")
}

// v857: Payload Auto Encode857
internal fun PlayerActivity.showV857PayloadAutoEncode857Toggle() {
    val current = BiliClient.prefs.v857payloadAutoEncode857
    BiliClient.prefs.v857payloadAutoEncode857 = !current
    AppToast.show(this, "Payload Auto Encode857: ${if (!current) "ON" else "OFF"}")
}

// v857: Peak Auto Detect857
internal fun PlayerActivity.showV857PeakAutoDetect857Toggle() {
    val current = BiliClient.prefs.v857peakAutoDetect857
    BiliClient.prefs.v857peakAutoDetect857 = !current
    AppToast.show(this, "Peak Auto Detect857: ${if (!current) "ON" else "OFF"}")
}

// v857: Pending Auto Queue857
internal fun PlayerActivity.showV857PendingAutoQueue857Toggle() {
    val current = BiliClient.prefs.v857pendingAutoQueue857
    BiliClient.prefs.v857pendingAutoQueue857 = !current
    AppToast.show(this, "Pending Auto Queue857: ${if (!current) "ON" else "OFF"}")
}

// v857: Percent Auto Calc857
internal fun PlayerActivity.showV857PercentAutoCalc857Toggle() {
    val current = BiliClient.prefs.v857percentAutoCalc857
    BiliClient.prefs.v857percentAutoCalc857 = !current
    AppToast.show(this, "Percent Auto Calc857: ${if (!current) "ON" else "OFF"}")
}

// v857: Perform Auto Benchmark857
internal fun PlayerActivity.showV857PerformAutoBenchmark857Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v857performAutoBenchmark857).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark857",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v857performAutoBenchmark857 = value
        AppToast.show(this, "Perform Auto Benchmark857: $value")
    }
}

// v858: Parent Auto Scope858
internal fun PlayerActivity.showV858ParentAutoScope858Toggle() {
    val current = BiliClient.prefs.v858parentAutoScope858
    BiliClient.prefs.v858parentAutoScope858 = !current
    AppToast.show(this, "Parent Auto Scope858: ${if (!current) "ON" else "OFF"}")
}

// v858: Parse Auto Json858
internal fun PlayerActivity.showV858ParseAutoJson858Toggle() {
    val current = BiliClient.prefs.v858parseAutoJson858
    BiliClient.prefs.v858parseAutoJson858 = !current
    AppToast.show(this, "Parse Auto Json858: ${if (!current) "ON" else "OFF"}")
}

// v858: Partial Auto Load858
internal fun PlayerActivity.showV858PartialAutoLoad858Toggle() {
    val current = BiliClient.prefs.v858partialAutoLoad858
    BiliClient.prefs.v858partialAutoLoad858 = !current
    AppToast.show(this, "Partial Auto Load858: ${if (!current) "ON" else "OFF"}")
}

// v858: Pass Auto Through858
internal fun PlayerActivity.showV858PassAutoThrough858Toggle() {
    val current = BiliClient.prefs.v858passAutoThrough858
    BiliClient.prefs.v858passAutoThrough858 = !current
    AppToast.show(this, "Pass Auto Through858: ${if (!current) "ON" else "OFF"}")
}

// v858: Password Auto Fill858
internal fun PlayerActivity.showV858PasswordAutoFill858Toggle() {
    val current = BiliClient.prefs.v858passwordAutoFill858
    BiliClient.prefs.v858passwordAutoFill858 = !current
    AppToast.show(this, "Password Auto Fill858: ${if (!current) "ON" else "OFF"}")
}

// v858: Paste Auto Clean858
internal fun PlayerActivity.showV858PasteAutoClean858Toggle() {
    val current = BiliClient.prefs.v858pasteAutoClean858
    BiliClient.prefs.v858pasteAutoClean858 = !current
    AppToast.show(this, "Paste Auto Clean858: ${if (!current) "ON" else "OFF"}")
}

// v858: Patch Auto Apply858
internal fun PlayerActivity.showV858PatchAutoApply858Toggle() {
    val current = BiliClient.prefs.v858patchAutoApply858
    BiliClient.prefs.v858patchAutoApply858 = !current
    AppToast.show(this, "Patch Auto Apply858: ${if (!current) "ON" else "OFF"}")
}

// v858: Path Auto Resolve858
internal fun PlayerActivity.showV858PathAutoResolve858Toggle() {
    val current = BiliClient.prefs.v858pathAutoResolve858
    BiliClient.prefs.v858pathAutoResolve858 = !current
    AppToast.show(this, "Path Auto Resolve858: ${if (!current) "ON" else "OFF"}")
}

// v858: Pattern Auto Match858
internal fun PlayerActivity.showV858PatternAutoMatch858Toggle() {
    val current = BiliClient.prefs.v858patternAutoMatch858
    BiliClient.prefs.v858patternAutoMatch858 = !current
    AppToast.show(this, "Pattern Auto Match858: ${if (!current) "ON" else "OFF"}")
}

// v858: Pause Auto Resume858
internal fun PlayerActivity.showV858PauseAutoResume858Toggle() {
    val current = BiliClient.prefs.v858pauseAutoResume858
    BiliClient.prefs.v858pauseAutoResume858 = !current
    AppToast.show(this, "Pause Auto Resume858: ${if (!current) "ON" else "OFF"}")
}

// v858: Payload Auto Encode858
internal fun PlayerActivity.showV858PayloadAutoEncode858Toggle() {
    val current = BiliClient.prefs.v858payloadAutoEncode858
    BiliClient.prefs.v858payloadAutoEncode858 = !current
    AppToast.show(this, "Payload Auto Encode858: ${if (!current) "ON" else "OFF"}")
}

// v858: Peak Auto Detect858
internal fun PlayerActivity.showV858PeakAutoDetect858Toggle() {
    val current = BiliClient.prefs.v858peakAutoDetect858
    BiliClient.prefs.v858peakAutoDetect858 = !current
    AppToast.show(this, "Peak Auto Detect858: ${if (!current) "ON" else "OFF"}")
}

// v858: Pending Auto Queue858
internal fun PlayerActivity.showV858PendingAutoQueue858Toggle() {
    val current = BiliClient.prefs.v858pendingAutoQueue858
    BiliClient.prefs.v858pendingAutoQueue858 = !current
    AppToast.show(this, "Pending Auto Queue858: ${if (!current) "ON" else "OFF"}")
}

// v858: Percent Auto Calc858
internal fun PlayerActivity.showV858PercentAutoCalc858Toggle() {
    val current = BiliClient.prefs.v858percentAutoCalc858
    BiliClient.prefs.v858percentAutoCalc858 = !current
    AppToast.show(this, "Percent Auto Calc858: ${if (!current) "ON" else "OFF"}")
}

// v858: Perform Auto Benchmark858
internal fun PlayerActivity.showV858PerformAutoBenchmark858Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v858performAutoBenchmark858).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark858",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v858performAutoBenchmark858 = value
        AppToast.show(this, "Perform Auto Benchmark858: $value")
    }
}

// v859: Parent Auto Scope859
internal fun PlayerActivity.showV859ParentAutoScope859Toggle() {
    val current = BiliClient.prefs.v859parentAutoScope859
    BiliClient.prefs.v859parentAutoScope859 = !current
    AppToast.show(this, "Parent Auto Scope859: ${if (!current) "ON" else "OFF"}")
}

// v859: Parse Auto Json859
internal fun PlayerActivity.showV859ParseAutoJson859Toggle() {
    val current = BiliClient.prefs.v859parseAutoJson859
    BiliClient.prefs.v859parseAutoJson859 = !current
    AppToast.show(this, "Parse Auto Json859: ${if (!current) "ON" else "OFF"}")
}

// v859: Partial Auto Load859
internal fun PlayerActivity.showV859PartialAutoLoad859Toggle() {
    val current = BiliClient.prefs.v859partialAutoLoad859
    BiliClient.prefs.v859partialAutoLoad859 = !current
    AppToast.show(this, "Partial Auto Load859: ${if (!current) "ON" else "OFF"}")
}

// v859: Pass Auto Through859
internal fun PlayerActivity.showV859PassAutoThrough859Toggle() {
    val current = BiliClient.prefs.v859passAutoThrough859
    BiliClient.prefs.v859passAutoThrough859 = !current
    AppToast.show(this, "Pass Auto Through859: ${if (!current) "ON" else "OFF"}")
}

// v859: Password Auto Fill859
internal fun PlayerActivity.showV859PasswordAutoFill859Toggle() {
    val current = BiliClient.prefs.v859passwordAutoFill859
    BiliClient.prefs.v859passwordAutoFill859 = !current
    AppToast.show(this, "Password Auto Fill859: ${if (!current) "ON" else "OFF"}")
}

// v859: Paste Auto Clean859
internal fun PlayerActivity.showV859PasteAutoClean859Toggle() {
    val current = BiliClient.prefs.v859pasteAutoClean859
    BiliClient.prefs.v859pasteAutoClean859 = !current
    AppToast.show(this, "Paste Auto Clean859: ${if (!current) "ON" else "OFF"}")
}

// v859: Patch Auto Apply859
internal fun PlayerActivity.showV859PatchAutoApply859Toggle() {
    val current = BiliClient.prefs.v859patchAutoApply859
    BiliClient.prefs.v859patchAutoApply859 = !current
    AppToast.show(this, "Patch Auto Apply859: ${if (!current) "ON" else "OFF"}")
}

// v859: Path Auto Resolve859
internal fun PlayerActivity.showV859PathAutoResolve859Toggle() {
    val current = BiliClient.prefs.v859pathAutoResolve859
    BiliClient.prefs.v859pathAutoResolve859 = !current
    AppToast.show(this, "Path Auto Resolve859: ${if (!current) "ON" else "OFF"}")
}

// v859: Pattern Auto Match859
internal fun PlayerActivity.showV859PatternAutoMatch859Toggle() {
    val current = BiliClient.prefs.v859patternAutoMatch859
    BiliClient.prefs.v859patternAutoMatch859 = !current
    AppToast.show(this, "Pattern Auto Match859: ${if (!current) "ON" else "OFF"}")
}

// v859: Pause Auto Resume859
internal fun PlayerActivity.showV859PauseAutoResume859Toggle() {
    val current = BiliClient.prefs.v859pauseAutoResume859
    BiliClient.prefs.v859pauseAutoResume859 = !current
    AppToast.show(this, "Pause Auto Resume859: ${if (!current) "ON" else "OFF"}")
}

// v859: Payload Auto Encode859
internal fun PlayerActivity.showV859PayloadAutoEncode859Toggle() {
    val current = BiliClient.prefs.v859payloadAutoEncode859
    BiliClient.prefs.v859payloadAutoEncode859 = !current
    AppToast.show(this, "Payload Auto Encode859: ${if (!current) "ON" else "OFF"}")
}

// v859: Peak Auto Detect859
internal fun PlayerActivity.showV859PeakAutoDetect859Toggle() {
    val current = BiliClient.prefs.v859peakAutoDetect859
    BiliClient.prefs.v859peakAutoDetect859 = !current
    AppToast.show(this, "Peak Auto Detect859: ${if (!current) "ON" else "OFF"}")
}

// v859: Pending Auto Queue859
internal fun PlayerActivity.showV859PendingAutoQueue859Toggle() {
    val current = BiliClient.prefs.v859pendingAutoQueue859
    BiliClient.prefs.v859pendingAutoQueue859 = !current
    AppToast.show(this, "Pending Auto Queue859: ${if (!current) "ON" else "OFF"}")
}

// v859: Percent Auto Calc859
internal fun PlayerActivity.showV859PercentAutoCalc859Toggle() {
    val current = BiliClient.prefs.v859percentAutoCalc859
    BiliClient.prefs.v859percentAutoCalc859 = !current
    AppToast.show(this, "Percent Auto Calc859: ${if (!current) "ON" else "OFF"}")
}

// v859: Perform Auto Benchmark859
internal fun PlayerActivity.showV859PerformAutoBenchmark859Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v859performAutoBenchmark859).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark859",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v859performAutoBenchmark859 = value
        AppToast.show(this, "Perform Auto Benchmark859: $value")
    }
}

// v860: Parent Auto Scope860
internal fun PlayerActivity.showV860ParentAutoScope860Toggle() {
    val current = BiliClient.prefs.v860parentAutoScope860
    BiliClient.prefs.v860parentAutoScope860 = !current
    AppToast.show(this, "Parent Auto Scope860: ${if (!current) "ON" else "OFF"}")
}

// v860: Parse Auto Json860
internal fun PlayerActivity.showV860ParseAutoJson860Toggle() {
    val current = BiliClient.prefs.v860parseAutoJson860
    BiliClient.prefs.v860parseAutoJson860 = !current
    AppToast.show(this, "Parse Auto Json860: ${if (!current) "ON" else "OFF"}")
}

// v860: Partial Auto Load860
internal fun PlayerActivity.showV860PartialAutoLoad860Toggle() {
    val current = BiliClient.prefs.v860partialAutoLoad860
    BiliClient.prefs.v860partialAutoLoad860 = !current
    AppToast.show(this, "Partial Auto Load860: ${if (!current) "ON" else "OFF"}")
}

// v860: Pass Auto Through860
internal fun PlayerActivity.showV860PassAutoThrough860Toggle() {
    val current = BiliClient.prefs.v860passAutoThrough860
    BiliClient.prefs.v860passAutoThrough860 = !current
    AppToast.show(this, "Pass Auto Through860: ${if (!current) "ON" else "OFF"}")
}

// v860: Password Auto Fill860
internal fun PlayerActivity.showV860PasswordAutoFill860Toggle() {
    val current = BiliClient.prefs.v860passwordAutoFill860
    BiliClient.prefs.v860passwordAutoFill860 = !current
    AppToast.show(this, "Password Auto Fill860: ${if (!current) "ON" else "OFF"}")
}

// v860: Paste Auto Clean860
internal fun PlayerActivity.showV860PasteAutoClean860Toggle() {
    val current = BiliClient.prefs.v860pasteAutoClean860
    BiliClient.prefs.v860pasteAutoClean860 = !current
    AppToast.show(this, "Paste Auto Clean860: ${if (!current) "ON" else "OFF"}")
}

// v860: Patch Auto Apply860
internal fun PlayerActivity.showV860PatchAutoApply860Toggle() {
    val current = BiliClient.prefs.v860patchAutoApply860
    BiliClient.prefs.v860patchAutoApply860 = !current
    AppToast.show(this, "Patch Auto Apply860: ${if (!current) "ON" else "OFF"}")
}

// v860: Path Auto Resolve860
internal fun PlayerActivity.showV860PathAutoResolve860Toggle() {
    val current = BiliClient.prefs.v860pathAutoResolve860
    BiliClient.prefs.v860pathAutoResolve860 = !current
    AppToast.show(this, "Path Auto Resolve860: ${if (!current) "ON" else "OFF"}")
}

// v860: Pattern Auto Match860
internal fun PlayerActivity.showV860PatternAutoMatch860Toggle() {
    val current = BiliClient.prefs.v860patternAutoMatch860
    BiliClient.prefs.v860patternAutoMatch860 = !current
    AppToast.show(this, "Pattern Auto Match860: ${if (!current) "ON" else "OFF"}")
}

// v860: Pause Auto Resume860
internal fun PlayerActivity.showV860PauseAutoResume860Toggle() {
    val current = BiliClient.prefs.v860pauseAutoResume860
    BiliClient.prefs.v860pauseAutoResume860 = !current
    AppToast.show(this, "Pause Auto Resume860: ${if (!current) "ON" else "OFF"}")
}

// v860: Payload Auto Encode860
internal fun PlayerActivity.showV860PayloadAutoEncode860Toggle() {
    val current = BiliClient.prefs.v860payloadAutoEncode860
    BiliClient.prefs.v860payloadAutoEncode860 = !current
    AppToast.show(this, "Payload Auto Encode860: ${if (!current) "ON" else "OFF"}")
}

// v860: Peak Auto Detect860
internal fun PlayerActivity.showV860PeakAutoDetect860Toggle() {
    val current = BiliClient.prefs.v860peakAutoDetect860
    BiliClient.prefs.v860peakAutoDetect860 = !current
    AppToast.show(this, "Peak Auto Detect860: ${if (!current) "ON" else "OFF"}")
}

// v860: Pending Auto Queue860
internal fun PlayerActivity.showV860PendingAutoQueue860Toggle() {
    val current = BiliClient.prefs.v860pendingAutoQueue860
    BiliClient.prefs.v860pendingAutoQueue860 = !current
    AppToast.show(this, "Pending Auto Queue860: ${if (!current) "ON" else "OFF"}")
}

// v860: Percent Auto Calc860
internal fun PlayerActivity.showV860PercentAutoCalc860Toggle() {
    val current = BiliClient.prefs.v860percentAutoCalc860
    BiliClient.prefs.v860percentAutoCalc860 = !current
    AppToast.show(this, "Percent Auto Calc860: ${if (!current) "ON" else "OFF"}")
}

// v860: Perform Auto Benchmark860
internal fun PlayerActivity.showV860PerformAutoBenchmark860Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v860performAutoBenchmark860).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Perform Auto Benchmark860",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v860performAutoBenchmark860 = value
        AppToast.show(this, "Perform Auto Benchmark860: $value")
    }
}

