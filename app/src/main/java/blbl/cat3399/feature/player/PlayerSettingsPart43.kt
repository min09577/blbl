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

// v583: Use Auto Optimize583
internal fun PlayerActivity.showV583UseAutoOptimize583Toggle() {
    val current = BiliClient.prefs.v583useAutoOptimize583
    BiliClient.prefs.v583useAutoOptimize583 = !current
    AppToast.show(this, "Use Auto Optimize583: ${if (!current) "ON" else "OFF"}")
}

// v583: Value Auto Bind583
internal fun PlayerActivity.showV583ValueAutoBind583Toggle() {
    val current = BiliClient.prefs.v583valueAutoBind583
    BiliClient.prefs.v583valueAutoBind583 = !current
    AppToast.show(this, "Value Auto Bind583: ${if (!current) "ON" else "OFF"}")
}

// v583: Verify Auto Checksum583
internal fun PlayerActivity.showV583VerifyAutoChecksum583Toggle() {
    val current = BiliClient.prefs.v583verifyAutoChecksum583
    BiliClient.prefs.v583verifyAutoChecksum583 = !current
    AppToast.show(this, "Verify Auto Checksum583: ${if (!current) "ON" else "OFF"}")
}

// v583: Version Auto Check583
internal fun PlayerActivity.showV583VersionAutoCheck583Toggle() {
    val current = BiliClient.prefs.v583versionAutoCheck583
    BiliClient.prefs.v583versionAutoCheck583 = !current
    AppToast.show(this, "Version Auto Check583: ${if (!current) "ON" else "OFF"}")
}

// v583: View Auto Switch583
internal fun PlayerActivity.showV583ViewAutoSwitch583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583viewAutoSwitch583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583viewAutoSwitch583 = value
        AppToast.show(this, "View Auto Switch583: $value")
    }
}

// v583: Virtual Display583
internal fun PlayerActivity.showV583VirtualDisplay583Toggle() {
    val current = BiliClient.prefs.v583virtualDisplay583
    BiliClient.prefs.v583virtualDisplay583 = !current
    AppToast.show(this, "Virtual Display583: ${if (!current) "ON" else "OFF"}")
}

// v583: Visible Auto Toggle583
internal fun PlayerActivity.showV583VisibleAutoToggle583Toggle() {
    val current = BiliClient.prefs.v583visibleAutoToggle583
    BiliClient.prefs.v583visibleAutoToggle583 = !current
    AppToast.show(this, "Visible Auto Toggle583: ${if (!current) "ON" else "OFF"}")
}

// v583: Voice Auto Recognize583
internal fun PlayerActivity.showV583VoiceAutoRecognize583Toggle() {
    val current = BiliClient.prefs.v583voiceAutoRecognize583
    BiliClient.prefs.v583voiceAutoRecognize583 = !current
    AppToast.show(this, "Voice Auto Recognize583: ${if (!current) "ON" else "OFF"}")
}

// v583: Wait Auto Timeout583
internal fun PlayerActivity.showV583WaitAutoTimeout583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583waitAutoTimeout583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583waitAutoTimeout583 = value
        AppToast.show(this, "Wait Auto Timeout583: $value")
    }
}

// v583: Warm Auto Start583
internal fun PlayerActivity.showV583WarmAutoStart583Toggle() {
    val current = BiliClient.prefs.v583warmAutoStart583
    BiliClient.prefs.v583warmAutoStart583 = !current
    AppToast.show(this, "Warm Auto Start583: ${if (!current) "ON" else "OFF"}")
}

// v583: Warning Auto Alert583
internal fun PlayerActivity.showV583WarningAutoAlert583Toggle() {
    val current = BiliClient.prefs.v583warningAutoAlert583
    BiliClient.prefs.v583warningAutoAlert583 = !current
    AppToast.show(this, "Warning Auto Alert583: ${if (!current) "ON" else "OFF"}")
}

// v583: Watch Auto Sync583
internal fun PlayerActivity.showV583WatchAutoSync583Toggle() {
    val current = BiliClient.prefs.v583watchAutoSync583
    BiliClient.prefs.v583watchAutoSync583 = !current
    AppToast.show(this, "Watch Auto Sync583: ${if (!current) "ON" else "OFF"}")
}

// v584: Update Auto Download584
internal fun PlayerActivity.showV584UpdateAutoDownload584Toggle() {
    val current = BiliClient.prefs.v584updateAutoDownload584
    BiliClient.prefs.v584updateAutoDownload584 = !current
    AppToast.show(this, "Update Auto Download584: ${if (!current) "ON" else "OFF"}")
}

// v584: Upload Auto Retry584
internal fun PlayerActivity.showV584UploadAutoRetry584Toggle() {
    val current = BiliClient.prefs.v584uploadAutoRetry584
    BiliClient.prefs.v584uploadAutoRetry584 = !current
    AppToast.show(this, "Upload Auto Retry584: ${if (!current) "ON" else "OFF"}")
}

// v584: Upscale Auto Enhance584
internal fun PlayerActivity.showV584UpscaleAutoEnhance584Toggle() {
    val current = BiliClient.prefs.v584upscaleAutoEnhance584
    BiliClient.prefs.v584upscaleAutoEnhance584 = !current
    AppToast.show(this, "Upscale Auto Enhance584: ${if (!current) "ON" else "OFF"}")
}

// v584: Use Auto Optimize584
internal fun PlayerActivity.showV584UseAutoOptimize584Toggle() {
    val current = BiliClient.prefs.v584useAutoOptimize584
    BiliClient.prefs.v584useAutoOptimize584 = !current
    AppToast.show(this, "Use Auto Optimize584: ${if (!current) "ON" else "OFF"}")
}

// v584: Value Auto Bind584
internal fun PlayerActivity.showV584ValueAutoBind584Toggle() {
    val current = BiliClient.prefs.v584valueAutoBind584
    BiliClient.prefs.v584valueAutoBind584 = !current
    AppToast.show(this, "Value Auto Bind584: ${if (!current) "ON" else "OFF"}")
}

// v584: Verify Auto Checksum584
internal fun PlayerActivity.showV584VerifyAutoChecksum584Toggle() {
    val current = BiliClient.prefs.v584verifyAutoChecksum584
    BiliClient.prefs.v584verifyAutoChecksum584 = !current
    AppToast.show(this, "Verify Auto Checksum584: ${if (!current) "ON" else "OFF"}")
}

// v584: Version Auto Check584
internal fun PlayerActivity.showV584VersionAutoCheck584Toggle() {
    val current = BiliClient.prefs.v584versionAutoCheck584
    BiliClient.prefs.v584versionAutoCheck584 = !current
    AppToast.show(this, "Version Auto Check584: ${if (!current) "ON" else "OFF"}")
}

// v584: View Auto Switch584
internal fun PlayerActivity.showV584ViewAutoSwitch584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584viewAutoSwitch584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584viewAutoSwitch584 = value
        AppToast.show(this, "View Auto Switch584: $value")
    }
}

// v584: Virtual Display584
internal fun PlayerActivity.showV584VirtualDisplay584Toggle() {
    val current = BiliClient.prefs.v584virtualDisplay584
    BiliClient.prefs.v584virtualDisplay584 = !current
    AppToast.show(this, "Virtual Display584: ${if (!current) "ON" else "OFF"}")
}

// v584: Visible Auto Toggle584
internal fun PlayerActivity.showV584VisibleAutoToggle584Toggle() {
    val current = BiliClient.prefs.v584visibleAutoToggle584
    BiliClient.prefs.v584visibleAutoToggle584 = !current
    AppToast.show(this, "Visible Auto Toggle584: ${if (!current) "ON" else "OFF"}")
}

// v584: Voice Auto Recognize584
internal fun PlayerActivity.showV584VoiceAutoRecognize584Toggle() {
    val current = BiliClient.prefs.v584voiceAutoRecognize584
    BiliClient.prefs.v584voiceAutoRecognize584 = !current
    AppToast.show(this, "Voice Auto Recognize584: ${if (!current) "ON" else "OFF"}")
}

// v584: Wait Auto Timeout584
internal fun PlayerActivity.showV584WaitAutoTimeout584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584waitAutoTimeout584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584waitAutoTimeout584 = value
        AppToast.show(this, "Wait Auto Timeout584: $value")
    }
}

// v584: Warm Auto Start584
internal fun PlayerActivity.showV584WarmAutoStart584Toggle() {
    val current = BiliClient.prefs.v584warmAutoStart584
    BiliClient.prefs.v584warmAutoStart584 = !current
    AppToast.show(this, "Warm Auto Start584: ${if (!current) "ON" else "OFF"}")
}

// v584: Warning Auto Alert584
internal fun PlayerActivity.showV584WarningAutoAlert584Toggle() {
    val current = BiliClient.prefs.v584warningAutoAlert584
    BiliClient.prefs.v584warningAutoAlert584 = !current
    AppToast.show(this, "Warning Auto Alert584: ${if (!current) "ON" else "OFF"}")
}

// v584: Watch Auto Sync584
internal fun PlayerActivity.showV584WatchAutoSync584Toggle() {
    val current = BiliClient.prefs.v584watchAutoSync584
    BiliClient.prefs.v584watchAutoSync584 = !current
    AppToast.show(this, "Watch Auto Sync584: ${if (!current) "ON" else "OFF"}")
}

// v585: Update Auto Download585
internal fun PlayerActivity.showV585UpdateAutoDownload585Toggle() {
    val current = BiliClient.prefs.v585updateAutoDownload585
    BiliClient.prefs.v585updateAutoDownload585 = !current
    AppToast.show(this, "Update Auto Download585: ${if (!current) "ON" else "OFF"}")
}

// v585: Upload Auto Retry585
internal fun PlayerActivity.showV585UploadAutoRetry585Toggle() {
    val current = BiliClient.prefs.v585uploadAutoRetry585
    BiliClient.prefs.v585uploadAutoRetry585 = !current
    AppToast.show(this, "Upload Auto Retry585: ${if (!current) "ON" else "OFF"}")
}

// v585: Upscale Auto Enhance585
internal fun PlayerActivity.showV585UpscaleAutoEnhance585Toggle() {
    val current = BiliClient.prefs.v585upscaleAutoEnhance585
    BiliClient.prefs.v585upscaleAutoEnhance585 = !current
    AppToast.show(this, "Upscale Auto Enhance585: ${if (!current) "ON" else "OFF"}")
}

// v585: Use Auto Optimize585
internal fun PlayerActivity.showV585UseAutoOptimize585Toggle() {
    val current = BiliClient.prefs.v585useAutoOptimize585
    BiliClient.prefs.v585useAutoOptimize585 = !current
    AppToast.show(this, "Use Auto Optimize585: ${if (!current) "ON" else "OFF"}")
}

// v585: Value Auto Bind585
internal fun PlayerActivity.showV585ValueAutoBind585Toggle() {
    val current = BiliClient.prefs.v585valueAutoBind585
    BiliClient.prefs.v585valueAutoBind585 = !current
    AppToast.show(this, "Value Auto Bind585: ${if (!current) "ON" else "OFF"}")
}

// v585: Verify Auto Checksum585
internal fun PlayerActivity.showV585VerifyAutoChecksum585Toggle() {
    val current = BiliClient.prefs.v585verifyAutoChecksum585
    BiliClient.prefs.v585verifyAutoChecksum585 = !current
    AppToast.show(this, "Verify Auto Checksum585: ${if (!current) "ON" else "OFF"}")
}

// v585: Version Auto Check585
internal fun PlayerActivity.showV585VersionAutoCheck585Toggle() {
    val current = BiliClient.prefs.v585versionAutoCheck585
    BiliClient.prefs.v585versionAutoCheck585 = !current
    AppToast.show(this, "Version Auto Check585: ${if (!current) "ON" else "OFF"}")
}

// v585: View Auto Switch585
internal fun PlayerActivity.showV585ViewAutoSwitch585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585viewAutoSwitch585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585viewAutoSwitch585 = value
        AppToast.show(this, "View Auto Switch585: $value")
    }
}

// v585: Virtual Display585
internal fun PlayerActivity.showV585VirtualDisplay585Toggle() {
    val current = BiliClient.prefs.v585virtualDisplay585
    BiliClient.prefs.v585virtualDisplay585 = !current
    AppToast.show(this, "Virtual Display585: ${if (!current) "ON" else "OFF"}")
}

// v585: Visible Auto Toggle585
internal fun PlayerActivity.showV585VisibleAutoToggle585Toggle() {
    val current = BiliClient.prefs.v585visibleAutoToggle585
    BiliClient.prefs.v585visibleAutoToggle585 = !current
    AppToast.show(this, "Visible Auto Toggle585: ${if (!current) "ON" else "OFF"}")
}

// v585: Voice Auto Recognize585
internal fun PlayerActivity.showV585VoiceAutoRecognize585Toggle() {
    val current = BiliClient.prefs.v585voiceAutoRecognize585
    BiliClient.prefs.v585voiceAutoRecognize585 = !current
    AppToast.show(this, "Voice Auto Recognize585: ${if (!current) "ON" else "OFF"}")
}

// v585: Wait Auto Timeout585
internal fun PlayerActivity.showV585WaitAutoTimeout585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585waitAutoTimeout585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585waitAutoTimeout585 = value
        AppToast.show(this, "Wait Auto Timeout585: $value")
    }
}

// v585: Warm Auto Start585
internal fun PlayerActivity.showV585WarmAutoStart585Toggle() {
    val current = BiliClient.prefs.v585warmAutoStart585
    BiliClient.prefs.v585warmAutoStart585 = !current
    AppToast.show(this, "Warm Auto Start585: ${if (!current) "ON" else "OFF"}")
}

// v585: Warning Auto Alert585
internal fun PlayerActivity.showV585WarningAutoAlert585Toggle() {
    val current = BiliClient.prefs.v585warningAutoAlert585
    BiliClient.prefs.v585warningAutoAlert585 = !current
    AppToast.show(this, "Warning Auto Alert585: ${if (!current) "ON" else "OFF"}")
}

// v585: Watch Auto Sync585
internal fun PlayerActivity.showV585WatchAutoSync585Toggle() {
    val current = BiliClient.prefs.v585watchAutoSync585
    BiliClient.prefs.v585watchAutoSync585 = !current
    AppToast.show(this, "Watch Auto Sync585: ${if (!current) "ON" else "OFF"}")
}

// v586: Update Auto Download586
internal fun PlayerActivity.showV586UpdateAutoDownload586Toggle() {
    val current = BiliClient.prefs.v586updateAutoDownload586
    BiliClient.prefs.v586updateAutoDownload586 = !current
    AppToast.show(this, "Update Auto Download586: ${if (!current) "ON" else "OFF"}")
}

// v586: Upload Auto Retry586
internal fun PlayerActivity.showV586UploadAutoRetry586Toggle() {
    val current = BiliClient.prefs.v586uploadAutoRetry586
    BiliClient.prefs.v586uploadAutoRetry586 = !current
    AppToast.show(this, "Upload Auto Retry586: ${if (!current) "ON" else "OFF"}")
}

// v586: Upscale Auto Enhance586
internal fun PlayerActivity.showV586UpscaleAutoEnhance586Toggle() {
    val current = BiliClient.prefs.v586upscaleAutoEnhance586
    BiliClient.prefs.v586upscaleAutoEnhance586 = !current
    AppToast.show(this, "Upscale Auto Enhance586: ${if (!current) "ON" else "OFF"}")
}

// v586: Use Auto Optimize586
internal fun PlayerActivity.showV586UseAutoOptimize586Toggle() {
    val current = BiliClient.prefs.v586useAutoOptimize586
    BiliClient.prefs.v586useAutoOptimize586 = !current
    AppToast.show(this, "Use Auto Optimize586: ${if (!current) "ON" else "OFF"}")
}

// v586: Value Auto Bind586
internal fun PlayerActivity.showV586ValueAutoBind586Toggle() {
    val current = BiliClient.prefs.v586valueAutoBind586
    BiliClient.prefs.v586valueAutoBind586 = !current
    AppToast.show(this, "Value Auto Bind586: ${if (!current) "ON" else "OFF"}")
}

// v586: Verify Auto Checksum586
internal fun PlayerActivity.showV586VerifyAutoChecksum586Toggle() {
    val current = BiliClient.prefs.v586verifyAutoChecksum586
    BiliClient.prefs.v586verifyAutoChecksum586 = !current
    AppToast.show(this, "Verify Auto Checksum586: ${if (!current) "ON" else "OFF"}")
}

// v586: Version Auto Check586
internal fun PlayerActivity.showV586VersionAutoCheck586Toggle() {
    val current = BiliClient.prefs.v586versionAutoCheck586
    BiliClient.prefs.v586versionAutoCheck586 = !current
    AppToast.show(this, "Version Auto Check586: ${if (!current) "ON" else "OFF"}")
}

// v586: View Auto Switch586
internal fun PlayerActivity.showV586ViewAutoSwitch586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586viewAutoSwitch586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586viewAutoSwitch586 = value
        AppToast.show(this, "View Auto Switch586: $value")
    }
}

// v586: Virtual Display586
internal fun PlayerActivity.showV586VirtualDisplay586Toggle() {
    val current = BiliClient.prefs.v586virtualDisplay586
    BiliClient.prefs.v586virtualDisplay586 = !current
    AppToast.show(this, "Virtual Display586: ${if (!current) "ON" else "OFF"}")
}

// v586: Visible Auto Toggle586
internal fun PlayerActivity.showV586VisibleAutoToggle586Toggle() {
    val current = BiliClient.prefs.v586visibleAutoToggle586
    BiliClient.prefs.v586visibleAutoToggle586 = !current
    AppToast.show(this, "Visible Auto Toggle586: ${if (!current) "ON" else "OFF"}")
}

// v586: Voice Auto Recognize586
internal fun PlayerActivity.showV586VoiceAutoRecognize586Toggle() {
    val current = BiliClient.prefs.v586voiceAutoRecognize586
    BiliClient.prefs.v586voiceAutoRecognize586 = !current
    AppToast.show(this, "Voice Auto Recognize586: ${if (!current) "ON" else "OFF"}")
}

// v586: Wait Auto Timeout586
internal fun PlayerActivity.showV586WaitAutoTimeout586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586waitAutoTimeout586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586waitAutoTimeout586 = value
        AppToast.show(this, "Wait Auto Timeout586: $value")
    }
}

// v586: Warm Auto Start586
internal fun PlayerActivity.showV586WarmAutoStart586Toggle() {
    val current = BiliClient.prefs.v586warmAutoStart586
    BiliClient.prefs.v586warmAutoStart586 = !current
    AppToast.show(this, "Warm Auto Start586: ${if (!current) "ON" else "OFF"}")
}

// v586: Warning Auto Alert586
internal fun PlayerActivity.showV586WarningAutoAlert586Toggle() {
    val current = BiliClient.prefs.v586warningAutoAlert586
    BiliClient.prefs.v586warningAutoAlert586 = !current
    AppToast.show(this, "Warning Auto Alert586: ${if (!current) "ON" else "OFF"}")
}

// v586: Watch Auto Sync586
internal fun PlayerActivity.showV586WatchAutoSync586Toggle() {
    val current = BiliClient.prefs.v586watchAutoSync586
    BiliClient.prefs.v586watchAutoSync586 = !current
    AppToast.show(this, "Watch Auto Sync586: ${if (!current) "ON" else "OFF"}")
}

// v587: Update Auto Download587
internal fun PlayerActivity.showV587UpdateAutoDownload587Toggle() {
    val current = BiliClient.prefs.v587updateAutoDownload587
    BiliClient.prefs.v587updateAutoDownload587 = !current
    AppToast.show(this, "Update Auto Download587: ${if (!current) "ON" else "OFF"}")
}

// v587: Upload Auto Retry587
internal fun PlayerActivity.showV587UploadAutoRetry587Toggle() {
    val current = BiliClient.prefs.v587uploadAutoRetry587
    BiliClient.prefs.v587uploadAutoRetry587 = !current
    AppToast.show(this, "Upload Auto Retry587: ${if (!current) "ON" else "OFF"}")
}

// v587: Upscale Auto Enhance587
internal fun PlayerActivity.showV587UpscaleAutoEnhance587Toggle() {
    val current = BiliClient.prefs.v587upscaleAutoEnhance587
    BiliClient.prefs.v587upscaleAutoEnhance587 = !current
    AppToast.show(this, "Upscale Auto Enhance587: ${if (!current) "ON" else "OFF"}")
}

// v587: Use Auto Optimize587
internal fun PlayerActivity.showV587UseAutoOptimize587Toggle() {
    val current = BiliClient.prefs.v587useAutoOptimize587
    BiliClient.prefs.v587useAutoOptimize587 = !current
    AppToast.show(this, "Use Auto Optimize587: ${if (!current) "ON" else "OFF"}")
}

// v587: Value Auto Bind587
internal fun PlayerActivity.showV587ValueAutoBind587Toggle() {
    val current = BiliClient.prefs.v587valueAutoBind587
    BiliClient.prefs.v587valueAutoBind587 = !current
    AppToast.show(this, "Value Auto Bind587: ${if (!current) "ON" else "OFF"}")
}

// v587: Verify Auto Checksum587
internal fun PlayerActivity.showV587VerifyAutoChecksum587Toggle() {
    val current = BiliClient.prefs.v587verifyAutoChecksum587
    BiliClient.prefs.v587verifyAutoChecksum587 = !current
    AppToast.show(this, "Verify Auto Checksum587: ${if (!current) "ON" else "OFF"}")
}

// v587: Version Auto Check587
internal fun PlayerActivity.showV587VersionAutoCheck587Toggle() {
    val current = BiliClient.prefs.v587versionAutoCheck587
    BiliClient.prefs.v587versionAutoCheck587 = !current
    AppToast.show(this, "Version Auto Check587: ${if (!current) "ON" else "OFF"}")
}

// v587: View Auto Switch587
internal fun PlayerActivity.showV587ViewAutoSwitch587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587viewAutoSwitch587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587viewAutoSwitch587 = value
        AppToast.show(this, "View Auto Switch587: $value")
    }
}

// v587: Virtual Display587
internal fun PlayerActivity.showV587VirtualDisplay587Toggle() {
    val current = BiliClient.prefs.v587virtualDisplay587
    BiliClient.prefs.v587virtualDisplay587 = !current
    AppToast.show(this, "Virtual Display587: ${if (!current) "ON" else "OFF"}")
}

// v587: Visible Auto Toggle587
internal fun PlayerActivity.showV587VisibleAutoToggle587Toggle() {
    val current = BiliClient.prefs.v587visibleAutoToggle587
    BiliClient.prefs.v587visibleAutoToggle587 = !current
    AppToast.show(this, "Visible Auto Toggle587: ${if (!current) "ON" else "OFF"}")
}

// v587: Voice Auto Recognize587
internal fun PlayerActivity.showV587VoiceAutoRecognize587Toggle() {
    val current = BiliClient.prefs.v587voiceAutoRecognize587
    BiliClient.prefs.v587voiceAutoRecognize587 = !current
    AppToast.show(this, "Voice Auto Recognize587: ${if (!current) "ON" else "OFF"}")
}

// v587: Wait Auto Timeout587
internal fun PlayerActivity.showV587WaitAutoTimeout587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587waitAutoTimeout587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587waitAutoTimeout587 = value
        AppToast.show(this, "Wait Auto Timeout587: $value")
    }
}

// v587: Warm Auto Start587
internal fun PlayerActivity.showV587WarmAutoStart587Toggle() {
    val current = BiliClient.prefs.v587warmAutoStart587
    BiliClient.prefs.v587warmAutoStart587 = !current
    AppToast.show(this, "Warm Auto Start587: ${if (!current) "ON" else "OFF"}")
}

// v587: Warning Auto Alert587
internal fun PlayerActivity.showV587WarningAutoAlert587Toggle() {
    val current = BiliClient.prefs.v587warningAutoAlert587
    BiliClient.prefs.v587warningAutoAlert587 = !current
    AppToast.show(this, "Warning Auto Alert587: ${if (!current) "ON" else "OFF"}")
}

// v587: Watch Auto Sync587
internal fun PlayerActivity.showV587WatchAutoSync587Toggle() {
    val current = BiliClient.prefs.v587watchAutoSync587
    BiliClient.prefs.v587watchAutoSync587 = !current
    AppToast.show(this, "Watch Auto Sync587: ${if (!current) "ON" else "OFF"}")
}

// v588: Update Auto Download588
internal fun PlayerActivity.showV588UpdateAutoDownload588Toggle() {
    val current = BiliClient.prefs.v588updateAutoDownload588
    BiliClient.prefs.v588updateAutoDownload588 = !current
    AppToast.show(this, "Update Auto Download588: ${if (!current) "ON" else "OFF"}")
}

// v588: Upload Auto Retry588
internal fun PlayerActivity.showV588UploadAutoRetry588Toggle() {
    val current = BiliClient.prefs.v588uploadAutoRetry588
    BiliClient.prefs.v588uploadAutoRetry588 = !current
    AppToast.show(this, "Upload Auto Retry588: ${if (!current) "ON" else "OFF"}")
}

// v588: Upscale Auto Enhance588
internal fun PlayerActivity.showV588UpscaleAutoEnhance588Toggle() {
    val current = BiliClient.prefs.v588upscaleAutoEnhance588
    BiliClient.prefs.v588upscaleAutoEnhance588 = !current
    AppToast.show(this, "Upscale Auto Enhance588: ${if (!current) "ON" else "OFF"}")
}

// v588: Use Auto Optimize588
internal fun PlayerActivity.showV588UseAutoOptimize588Toggle() {
    val current = BiliClient.prefs.v588useAutoOptimize588
    BiliClient.prefs.v588useAutoOptimize588 = !current
    AppToast.show(this, "Use Auto Optimize588: ${if (!current) "ON" else "OFF"}")
}

// v588: Value Auto Bind588
internal fun PlayerActivity.showV588ValueAutoBind588Toggle() {
    val current = BiliClient.prefs.v588valueAutoBind588
    BiliClient.prefs.v588valueAutoBind588 = !current
    AppToast.show(this, "Value Auto Bind588: ${if (!current) "ON" else "OFF"}")
}

// v588: Verify Auto Checksum588
internal fun PlayerActivity.showV588VerifyAutoChecksum588Toggle() {
    val current = BiliClient.prefs.v588verifyAutoChecksum588
    BiliClient.prefs.v588verifyAutoChecksum588 = !current
    AppToast.show(this, "Verify Auto Checksum588: ${if (!current) "ON" else "OFF"}")
}

// v588: Version Auto Check588
internal fun PlayerActivity.showV588VersionAutoCheck588Toggle() {
    val current = BiliClient.prefs.v588versionAutoCheck588
    BiliClient.prefs.v588versionAutoCheck588 = !current
    AppToast.show(this, "Version Auto Check588: ${if (!current) "ON" else "OFF"}")
}

// v588: View Auto Switch588
internal fun PlayerActivity.showV588ViewAutoSwitch588Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v588viewAutoSwitch588).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch588",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v588viewAutoSwitch588 = value
        AppToast.show(this, "View Auto Switch588: $value")
    }
}

// v588: Virtual Display588
internal fun PlayerActivity.showV588VirtualDisplay588Toggle() {
    val current = BiliClient.prefs.v588virtualDisplay588
    BiliClient.prefs.v588virtualDisplay588 = !current
    AppToast.show(this, "Virtual Display588: ${if (!current) "ON" else "OFF"}")
}

// v588: Visible Auto Toggle588
internal fun PlayerActivity.showV588VisibleAutoToggle588Toggle() {
    val current = BiliClient.prefs.v588visibleAutoToggle588
    BiliClient.prefs.v588visibleAutoToggle588 = !current
    AppToast.show(this, "Visible Auto Toggle588: ${if (!current) "ON" else "OFF"}")
}

// v588: Voice Auto Recognize588
internal fun PlayerActivity.showV588VoiceAutoRecognize588Toggle() {
    val current = BiliClient.prefs.v588voiceAutoRecognize588
    BiliClient.prefs.v588voiceAutoRecognize588 = !current
    AppToast.show(this, "Voice Auto Recognize588: ${if (!current) "ON" else "OFF"}")
}

// v588: Wait Auto Timeout588
internal fun PlayerActivity.showV588WaitAutoTimeout588Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v588waitAutoTimeout588).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout588",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v588waitAutoTimeout588 = value
        AppToast.show(this, "Wait Auto Timeout588: $value")
    }
}

// v588: Warm Auto Start588
internal fun PlayerActivity.showV588WarmAutoStart588Toggle() {
    val current = BiliClient.prefs.v588warmAutoStart588
    BiliClient.prefs.v588warmAutoStart588 = !current
    AppToast.show(this, "Warm Auto Start588: ${if (!current) "ON" else "OFF"}")
}

// v588: Warning Auto Alert588
internal fun PlayerActivity.showV588WarningAutoAlert588Toggle() {
    val current = BiliClient.prefs.v588warningAutoAlert588
    BiliClient.prefs.v588warningAutoAlert588 = !current
    AppToast.show(this, "Warning Auto Alert588: ${if (!current) "ON" else "OFF"}")
}

// v588: Watch Auto Sync588
internal fun PlayerActivity.showV588WatchAutoSync588Toggle() {
    val current = BiliClient.prefs.v588watchAutoSync588
    BiliClient.prefs.v588watchAutoSync588 = !current
    AppToast.show(this, "Watch Auto Sync588: ${if (!current) "ON" else "OFF"}")
}

// v589: Update Auto Download589
internal fun PlayerActivity.showV589UpdateAutoDownload589Toggle() {
    val current = BiliClient.prefs.v589updateAutoDownload589
    BiliClient.prefs.v589updateAutoDownload589 = !current
    AppToast.show(this, "Update Auto Download589: ${if (!current) "ON" else "OFF"}")
}

// v589: Upload Auto Retry589
internal fun PlayerActivity.showV589UploadAutoRetry589Toggle() {
    val current = BiliClient.prefs.v589uploadAutoRetry589
    BiliClient.prefs.v589uploadAutoRetry589 = !current
    AppToast.show(this, "Upload Auto Retry589: ${if (!current) "ON" else "OFF"}")
}

// v589: Upscale Auto Enhance589
internal fun PlayerActivity.showV589UpscaleAutoEnhance589Toggle() {
    val current = BiliClient.prefs.v589upscaleAutoEnhance589
    BiliClient.prefs.v589upscaleAutoEnhance589 = !current
    AppToast.show(this, "Upscale Auto Enhance589: ${if (!current) "ON" else "OFF"}")
}

// v589: Use Auto Optimize589
internal fun PlayerActivity.showV589UseAutoOptimize589Toggle() {
    val current = BiliClient.prefs.v589useAutoOptimize589
    BiliClient.prefs.v589useAutoOptimize589 = !current
    AppToast.show(this, "Use Auto Optimize589: ${if (!current) "ON" else "OFF"}")
}

// v589: Value Auto Bind589
internal fun PlayerActivity.showV589ValueAutoBind589Toggle() {
    val current = BiliClient.prefs.v589valueAutoBind589
    BiliClient.prefs.v589valueAutoBind589 = !current
    AppToast.show(this, "Value Auto Bind589: ${if (!current) "ON" else "OFF"}")
}

// v589: Verify Auto Checksum589
internal fun PlayerActivity.showV589VerifyAutoChecksum589Toggle() {
    val current = BiliClient.prefs.v589verifyAutoChecksum589
    BiliClient.prefs.v589verifyAutoChecksum589 = !current
    AppToast.show(this, "Verify Auto Checksum589: ${if (!current) "ON" else "OFF"}")
}

// v589: Version Auto Check589
internal fun PlayerActivity.showV589VersionAutoCheck589Toggle() {
    val current = BiliClient.prefs.v589versionAutoCheck589
    BiliClient.prefs.v589versionAutoCheck589 = !current
    AppToast.show(this, "Version Auto Check589: ${if (!current) "ON" else "OFF"}")
}

// v589: View Auto Switch589
internal fun PlayerActivity.showV589ViewAutoSwitch589Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v589viewAutoSwitch589).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch589",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v589viewAutoSwitch589 = value
        AppToast.show(this, "View Auto Switch589: $value")
    }
}

// v589: Virtual Display589
internal fun PlayerActivity.showV589VirtualDisplay589Toggle() {
    val current = BiliClient.prefs.v589virtualDisplay589
    BiliClient.prefs.v589virtualDisplay589 = !current
    AppToast.show(this, "Virtual Display589: ${if (!current) "ON" else "OFF"}")
}

// v589: Visible Auto Toggle589
internal fun PlayerActivity.showV589VisibleAutoToggle589Toggle() {
    val current = BiliClient.prefs.v589visibleAutoToggle589
    BiliClient.prefs.v589visibleAutoToggle589 = !current
    AppToast.show(this, "Visible Auto Toggle589: ${if (!current) "ON" else "OFF"}")
}

// v589: Voice Auto Recognize589
internal fun PlayerActivity.showV589VoiceAutoRecognize589Toggle() {
    val current = BiliClient.prefs.v589voiceAutoRecognize589
    BiliClient.prefs.v589voiceAutoRecognize589 = !current
    AppToast.show(this, "Voice Auto Recognize589: ${if (!current) "ON" else "OFF"}")
}

// v589: Wait Auto Timeout589
internal fun PlayerActivity.showV589WaitAutoTimeout589Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v589waitAutoTimeout589).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout589",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v589waitAutoTimeout589 = value
        AppToast.show(this, "Wait Auto Timeout589: $value")
    }
}

// v589: Warm Auto Start589
internal fun PlayerActivity.showV589WarmAutoStart589Toggle() {
    val current = BiliClient.prefs.v589warmAutoStart589
    BiliClient.prefs.v589warmAutoStart589 = !current
    AppToast.show(this, "Warm Auto Start589: ${if (!current) "ON" else "OFF"}")
}

// v589: Warning Auto Alert589
internal fun PlayerActivity.showV589WarningAutoAlert589Toggle() {
    val current = BiliClient.prefs.v589warningAutoAlert589
    BiliClient.prefs.v589warningAutoAlert589 = !current
    AppToast.show(this, "Warning Auto Alert589: ${if (!current) "ON" else "OFF"}")
}

// v589: Watch Auto Sync589
internal fun PlayerActivity.showV589WatchAutoSync589Toggle() {
    val current = BiliClient.prefs.v589watchAutoSync589
    BiliClient.prefs.v589watchAutoSync589 = !current
    AppToast.show(this, "Watch Auto Sync589: ${if (!current) "ON" else "OFF"}")
}

// v590: Update Auto Download590
internal fun PlayerActivity.showV590UpdateAutoDownload590Toggle() {
    val current = BiliClient.prefs.v590updateAutoDownload590
    BiliClient.prefs.v590updateAutoDownload590 = !current
    AppToast.show(this, "Update Auto Download590: ${if (!current) "ON" else "OFF"}")
}

// v590: Upload Auto Retry590
internal fun PlayerActivity.showV590UploadAutoRetry590Toggle() {
    val current = BiliClient.prefs.v590uploadAutoRetry590
    BiliClient.prefs.v590uploadAutoRetry590 = !current
    AppToast.show(this, "Upload Auto Retry590: ${if (!current) "ON" else "OFF"}")
}

// v590: Upscale Auto Enhance590
internal fun PlayerActivity.showV590UpscaleAutoEnhance590Toggle() {
    val current = BiliClient.prefs.v590upscaleAutoEnhance590
    BiliClient.prefs.v590upscaleAutoEnhance590 = !current
    AppToast.show(this, "Upscale Auto Enhance590: ${if (!current) "ON" else "OFF"}")
}

// v590: Use Auto Optimize590
internal fun PlayerActivity.showV590UseAutoOptimize590Toggle() {
    val current = BiliClient.prefs.v590useAutoOptimize590
    BiliClient.prefs.v590useAutoOptimize590 = !current
    AppToast.show(this, "Use Auto Optimize590: ${if (!current) "ON" else "OFF"}")
}

// v590: Value Auto Bind590
internal fun PlayerActivity.showV590ValueAutoBind590Toggle() {
    val current = BiliClient.prefs.v590valueAutoBind590
    BiliClient.prefs.v590valueAutoBind590 = !current
    AppToast.show(this, "Value Auto Bind590: ${if (!current) "ON" else "OFF"}")
}

// v590: Verify Auto Checksum590
internal fun PlayerActivity.showV590VerifyAutoChecksum590Toggle() {
    val current = BiliClient.prefs.v590verifyAutoChecksum590
    BiliClient.prefs.v590verifyAutoChecksum590 = !current
    AppToast.show(this, "Verify Auto Checksum590: ${if (!current) "ON" else "OFF"}")
}

// v590: Version Auto Check590
internal fun PlayerActivity.showV590VersionAutoCheck590Toggle() {
    val current = BiliClient.prefs.v590versionAutoCheck590
    BiliClient.prefs.v590versionAutoCheck590 = !current
    AppToast.show(this, "Version Auto Check590: ${if (!current) "ON" else "OFF"}")
}

// v590: View Auto Switch590
internal fun PlayerActivity.showV590ViewAutoSwitch590Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v590viewAutoSwitch590).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch590",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v590viewAutoSwitch590 = value
        AppToast.show(this, "View Auto Switch590: $value")
    }
}

// v590: Virtual Display590
internal fun PlayerActivity.showV590VirtualDisplay590Toggle() {
    val current = BiliClient.prefs.v590virtualDisplay590
    BiliClient.prefs.v590virtualDisplay590 = !current
    AppToast.show(this, "Virtual Display590: ${if (!current) "ON" else "OFF"}")
}

// v590: Visible Auto Toggle590
internal fun PlayerActivity.showV590VisibleAutoToggle590Toggle() {
    val current = BiliClient.prefs.v590visibleAutoToggle590
    BiliClient.prefs.v590visibleAutoToggle590 = !current
    AppToast.show(this, "Visible Auto Toggle590: ${if (!current) "ON" else "OFF"}")
}

// v590: Voice Auto Recognize590
internal fun PlayerActivity.showV590VoiceAutoRecognize590Toggle() {
    val current = BiliClient.prefs.v590voiceAutoRecognize590
    BiliClient.prefs.v590voiceAutoRecognize590 = !current
    AppToast.show(this, "Voice Auto Recognize590: ${if (!current) "ON" else "OFF"}")
}

// v590: Wait Auto Timeout590
internal fun PlayerActivity.showV590WaitAutoTimeout590Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v590waitAutoTimeout590).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout590",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v590waitAutoTimeout590 = value
        AppToast.show(this, "Wait Auto Timeout590: $value")
    }
}

// v590: Warm Auto Start590
internal fun PlayerActivity.showV590WarmAutoStart590Toggle() {
    val current = BiliClient.prefs.v590warmAutoStart590
    BiliClient.prefs.v590warmAutoStart590 = !current
    AppToast.show(this, "Warm Auto Start590: ${if (!current) "ON" else "OFF"}")
}

// v590: Warning Auto Alert590
internal fun PlayerActivity.showV590WarningAutoAlert590Toggle() {
    val current = BiliClient.prefs.v590warningAutoAlert590
    BiliClient.prefs.v590warningAutoAlert590 = !current
    AppToast.show(this, "Warning Auto Alert590: ${if (!current) "ON" else "OFF"}")
}

// v590: Watch Auto Sync590
internal fun PlayerActivity.showV590WatchAutoSync590Toggle() {
    val current = BiliClient.prefs.v590watchAutoSync590
    BiliClient.prefs.v590watchAutoSync590 = !current
    AppToast.show(this, "Watch Auto Sync590: ${if (!current) "ON" else "OFF"}")
}

// v591: Web Auto Redirect591
internal fun PlayerActivity.showV591WebAutoRedirect591Toggle() {
    val current = BiliClient.prefs.v591webAutoRedirect591
    BiliClient.prefs.v591webAutoRedirect591 = !current
    AppToast.show(this, "Web Auto Redirect591: ${if (!current) "ON" else "OFF"}")
}

// v591: Widget Auto Refresh591
internal fun PlayerActivity.showV591WidgetAutoRefresh591Toggle() {
    val current = BiliClient.prefs.v591widgetAutoRefresh591
    BiliClient.prefs.v591widgetAutoRefresh591 = !current
    AppToast.show(this, "Widget Auto Refresh591: ${if (!current) "ON" else "OFF"}")
}

// v591: Window Auto Snap591
internal fun PlayerActivity.showV591WindowAutoSnap591Toggle() {
    val current = BiliClient.prefs.v591windowAutoSnap591
    BiliClient.prefs.v591windowAutoSnap591 = !current
    AppToast.show(this, "Window Auto Snap591: ${if (!current) "ON" else "OFF"}")
}

// v591: Wrap Auto Break591
internal fun PlayerActivity.showV591WrapAutoBreak591Toggle() {
    val current = BiliClient.prefs.v591wrapAutoBreak591
    BiliClient.prefs.v591wrapAutoBreak591 = !current
    AppToast.show(this, "Wrap Auto Break591: ${if (!current) "ON" else "OFF"}")
}

// v591: Zone Auto Detect591
internal fun PlayerActivity.showV591ZoneAutoDetect591Toggle() {
    val current = BiliClient.prefs.v591zoneAutoDetect591
    BiliClient.prefs.v591zoneAutoDetect591 = !current
    AppToast.show(this, "Zone Auto Detect591: ${if (!current) "ON" else "OFF"}")
}

// v591: Anchor Auto Pin591
internal fun PlayerActivity.showV591AnchorAutoPin591Toggle() {
    val current = BiliClient.prefs.v591anchorAutoPin591
    BiliClient.prefs.v591anchorAutoPin591 = !current
    AppToast.show(this, "Anchor Auto Pin591: ${if (!current) "ON" else "OFF"}")
}

// v591: Aspect Auto Ratio591
internal fun PlayerActivity.showV591AspectAutoRatio591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591aspectAutoRatio591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591aspectAutoRatio591 = value
        AppToast.show(this, "Aspect Auto Ratio591: $value")
    }
}

// v591: Attach Auto Embed591
internal fun PlayerActivity.showV591AttachAutoEmbed591Toggle() {
    val current = BiliClient.prefs.v591attachAutoEmbed591
    BiliClient.prefs.v591attachAutoEmbed591 = !current
    AppToast.show(this, "Attach Auto Embed591: ${if (!current) "ON" else "OFF"}")
}

// v591: Audio Auto Normalize591
internal fun PlayerActivity.showV591AudioAutoNormalize591Toggle() {
    val current = BiliClient.prefs.v591audioAutoNormalize591
    BiliClient.prefs.v591audioAutoNormalize591 = !current
    AppToast.show(this, "Audio Auto Normalize591: ${if (!current) "ON" else "OFF"}")
}

// v591: Axis Auto Align591
internal fun PlayerActivity.showV591AxisAutoAlign591Toggle() {
    val current = BiliClient.prefs.v591axisAutoAlign591
    BiliClient.prefs.v591axisAutoAlign591 = !current
    AppToast.show(this, "Axis Auto Align591: ${if (!current) "ON" else "OFF"}")
}

// v591: Badge Auto Count591
internal fun PlayerActivity.showV591BadgeAutoCount591Toggle() {
    val current = BiliClient.prefs.v591badgeAutoCount591
    BiliClient.prefs.v591badgeAutoCount591 = !current
    AppToast.show(this, "Badge Auto Count591: ${if (!current) "ON" else "OFF"}")
}

// v591: Baseline Auto Sync591
internal fun PlayerActivity.showV591BaselineAutoSync591Toggle() {
    val current = BiliClient.prefs.v591baselineAutoSync591
    BiliClient.prefs.v591baselineAutoSync591 = !current
    AppToast.show(this, "Baseline Auto Sync591: ${if (!current) "ON" else "OFF"}")
}

// v591: Bind Auto Link591
internal fun PlayerActivity.showV591BindAutoLink591Toggle() {
    val current = BiliClient.prefs.v591bindAutoLink591
    BiliClient.prefs.v591bindAutoLink591 = !current
    AppToast.show(this, "Bind Auto Link591: ${if (!current) "ON" else "OFF"}")
}

// v591: Bitrate Auto Scale591
internal fun PlayerActivity.showV591BitrateAutoScale591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591bitrateAutoScale591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591bitrateAutoScale591 = value
        AppToast.show(this, "Bitrate Auto Scale591: $value")
    }
}

// v591: Blend Auto Mode591
internal fun PlayerActivity.showV591BlendAutoMode591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591blendAutoMode591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591blendAutoMode591 = value
        AppToast.show(this, "Blend Auto Mode591: $value")
    }
}

// v592: Web Auto Redirect592
internal fun PlayerActivity.showV592WebAutoRedirect592Toggle() {
    val current = BiliClient.prefs.v592webAutoRedirect592
    BiliClient.prefs.v592webAutoRedirect592 = !current
    AppToast.show(this, "Web Auto Redirect592: ${if (!current) "ON" else "OFF"}")
}

// v592: Widget Auto Refresh592
internal fun PlayerActivity.showV592WidgetAutoRefresh592Toggle() {
    val current = BiliClient.prefs.v592widgetAutoRefresh592
    BiliClient.prefs.v592widgetAutoRefresh592 = !current
    AppToast.show(this, "Widget Auto Refresh592: ${if (!current) "ON" else "OFF"}")
}

// v592: Window Auto Snap592
internal fun PlayerActivity.showV592WindowAutoSnap592Toggle() {
    val current = BiliClient.prefs.v592windowAutoSnap592
    BiliClient.prefs.v592windowAutoSnap592 = !current
    AppToast.show(this, "Window Auto Snap592: ${if (!current) "ON" else "OFF"}")
}

// v592: Wrap Auto Break592
internal fun PlayerActivity.showV592WrapAutoBreak592Toggle() {
    val current = BiliClient.prefs.v592wrapAutoBreak592
    BiliClient.prefs.v592wrapAutoBreak592 = !current
    AppToast.show(this, "Wrap Auto Break592: ${if (!current) "ON" else "OFF"}")
}

// v592: Zone Auto Detect592
internal fun PlayerActivity.showV592ZoneAutoDetect592Toggle() {
    val current = BiliClient.prefs.v592zoneAutoDetect592
    BiliClient.prefs.v592zoneAutoDetect592 = !current
    AppToast.show(this, "Zone Auto Detect592: ${if (!current) "ON" else "OFF"}")
}

// v592: Anchor Auto Pin592
internal fun PlayerActivity.showV592AnchorAutoPin592Toggle() {
    val current = BiliClient.prefs.v592anchorAutoPin592
    BiliClient.prefs.v592anchorAutoPin592 = !current
    AppToast.show(this, "Anchor Auto Pin592: ${if (!current) "ON" else "OFF"}")
}

// v592: Aspect Auto Ratio592
internal fun PlayerActivity.showV592AspectAutoRatio592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592aspectAutoRatio592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592aspectAutoRatio592 = value
        AppToast.show(this, "Aspect Auto Ratio592: $value")
    }
}

// v592: Attach Auto Embed592
internal fun PlayerActivity.showV592AttachAutoEmbed592Toggle() {
    val current = BiliClient.prefs.v592attachAutoEmbed592
    BiliClient.prefs.v592attachAutoEmbed592 = !current
    AppToast.show(this, "Attach Auto Embed592: ${if (!current) "ON" else "OFF"}")
}

// v592: Audio Auto Normalize592
internal fun PlayerActivity.showV592AudioAutoNormalize592Toggle() {
    val current = BiliClient.prefs.v592audioAutoNormalize592
    BiliClient.prefs.v592audioAutoNormalize592 = !current
    AppToast.show(this, "Audio Auto Normalize592: ${if (!current) "ON" else "OFF"}")
}

// v592: Axis Auto Align592
internal fun PlayerActivity.showV592AxisAutoAlign592Toggle() {
    val current = BiliClient.prefs.v592axisAutoAlign592
    BiliClient.prefs.v592axisAutoAlign592 = !current
    AppToast.show(this, "Axis Auto Align592: ${if (!current) "ON" else "OFF"}")
}

// v592: Badge Auto Count592
internal fun PlayerActivity.showV592BadgeAutoCount592Toggle() {
    val current = BiliClient.prefs.v592badgeAutoCount592
    BiliClient.prefs.v592badgeAutoCount592 = !current
    AppToast.show(this, "Badge Auto Count592: ${if (!current) "ON" else "OFF"}")
}

// v592: Baseline Auto Sync592
internal fun PlayerActivity.showV592BaselineAutoSync592Toggle() {
    val current = BiliClient.prefs.v592baselineAutoSync592
    BiliClient.prefs.v592baselineAutoSync592 = !current
    AppToast.show(this, "Baseline Auto Sync592: ${if (!current) "ON" else "OFF"}")
}

// v592: Bind Auto Link592
internal fun PlayerActivity.showV592BindAutoLink592Toggle() {
    val current = BiliClient.prefs.v592bindAutoLink592
    BiliClient.prefs.v592bindAutoLink592 = !current
    AppToast.show(this, "Bind Auto Link592: ${if (!current) "ON" else "OFF"}")
}

// v592: Bitrate Auto Scale592
internal fun PlayerActivity.showV592BitrateAutoScale592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592bitrateAutoScale592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592bitrateAutoScale592 = value
        AppToast.show(this, "Bitrate Auto Scale592: $value")
    }
}

// v592: Blend Auto Mode592
internal fun PlayerActivity.showV592BlendAutoMode592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592blendAutoMode592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592blendAutoMode592 = value
        AppToast.show(this, "Blend Auto Mode592: $value")
    }
}

// v593: Web Auto Redirect593
internal fun PlayerActivity.showV593WebAutoRedirect593Toggle() {
    val current = BiliClient.prefs.v593webAutoRedirect593
    BiliClient.prefs.v593webAutoRedirect593 = !current
    AppToast.show(this, "Web Auto Redirect593: ${if (!current) "ON" else "OFF"}")
}

// v593: Widget Auto Refresh593
internal fun PlayerActivity.showV593WidgetAutoRefresh593Toggle() {
    val current = BiliClient.prefs.v593widgetAutoRefresh593
    BiliClient.prefs.v593widgetAutoRefresh593 = !current
    AppToast.show(this, "Widget Auto Refresh593: ${if (!current) "ON" else "OFF"}")
}

// v593: Window Auto Snap593
internal fun PlayerActivity.showV593WindowAutoSnap593Toggle() {
    val current = BiliClient.prefs.v593windowAutoSnap593
    BiliClient.prefs.v593windowAutoSnap593 = !current
    AppToast.show(this, "Window Auto Snap593: ${if (!current) "ON" else "OFF"}")
}

// v593: Wrap Auto Break593
internal fun PlayerActivity.showV593WrapAutoBreak593Toggle() {
    val current = BiliClient.prefs.v593wrapAutoBreak593
    BiliClient.prefs.v593wrapAutoBreak593 = !current
    AppToast.show(this, "Wrap Auto Break593: ${if (!current) "ON" else "OFF"}")
}

// v593: Zone Auto Detect593
internal fun PlayerActivity.showV593ZoneAutoDetect593Toggle() {
    val current = BiliClient.prefs.v593zoneAutoDetect593
    BiliClient.prefs.v593zoneAutoDetect593 = !current
    AppToast.show(this, "Zone Auto Detect593: ${if (!current) "ON" else "OFF"}")
}

// v593: Anchor Auto Pin593
internal fun PlayerActivity.showV593AnchorAutoPin593Toggle() {
    val current = BiliClient.prefs.v593anchorAutoPin593
    BiliClient.prefs.v593anchorAutoPin593 = !current
    AppToast.show(this, "Anchor Auto Pin593: ${if (!current) "ON" else "OFF"}")
}

// v593: Aspect Auto Ratio593
internal fun PlayerActivity.showV593AspectAutoRatio593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593aspectAutoRatio593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593aspectAutoRatio593 = value
        AppToast.show(this, "Aspect Auto Ratio593: $value")
    }
}

// v593: Attach Auto Embed593
internal fun PlayerActivity.showV593AttachAutoEmbed593Toggle() {
    val current = BiliClient.prefs.v593attachAutoEmbed593
    BiliClient.prefs.v593attachAutoEmbed593 = !current
    AppToast.show(this, "Attach Auto Embed593: ${if (!current) "ON" else "OFF"}")
}

// v593: Audio Auto Normalize593
internal fun PlayerActivity.showV593AudioAutoNormalize593Toggle() {
    val current = BiliClient.prefs.v593audioAutoNormalize593
    BiliClient.prefs.v593audioAutoNormalize593 = !current
    AppToast.show(this, "Audio Auto Normalize593: ${if (!current) "ON" else "OFF"}")
}

// v593: Axis Auto Align593
internal fun PlayerActivity.showV593AxisAutoAlign593Toggle() {
    val current = BiliClient.prefs.v593axisAutoAlign593
    BiliClient.prefs.v593axisAutoAlign593 = !current
    AppToast.show(this, "Axis Auto Align593: ${if (!current) "ON" else "OFF"}")
}

// v593: Badge Auto Count593
internal fun PlayerActivity.showV593BadgeAutoCount593Toggle() {
    val current = BiliClient.prefs.v593badgeAutoCount593
    BiliClient.prefs.v593badgeAutoCount593 = !current
    AppToast.show(this, "Badge Auto Count593: ${if (!current) "ON" else "OFF"}")
}

// v593: Baseline Auto Sync593
internal fun PlayerActivity.showV593BaselineAutoSync593Toggle() {
    val current = BiliClient.prefs.v593baselineAutoSync593
    BiliClient.prefs.v593baselineAutoSync593 = !current
    AppToast.show(this, "Baseline Auto Sync593: ${if (!current) "ON" else "OFF"}")
}

// v593: Bind Auto Link593
internal fun PlayerActivity.showV593BindAutoLink593Toggle() {
    val current = BiliClient.prefs.v593bindAutoLink593
    BiliClient.prefs.v593bindAutoLink593 = !current
    AppToast.show(this, "Bind Auto Link593: ${if (!current) "ON" else "OFF"}")
}

// v593: Bitrate Auto Scale593
internal fun PlayerActivity.showV593BitrateAutoScale593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593bitrateAutoScale593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593bitrateAutoScale593 = value
        AppToast.show(this, "Bitrate Auto Scale593: $value")
    }
}

// v593: Blend Auto Mode593
internal fun PlayerActivity.showV593BlendAutoMode593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593blendAutoMode593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593blendAutoMode593 = value
        AppToast.show(this, "Blend Auto Mode593: $value")
    }
}

// v594: Web Auto Redirect594
internal fun PlayerActivity.showV594WebAutoRedirect594Toggle() {
    val current = BiliClient.prefs.v594webAutoRedirect594
    BiliClient.prefs.v594webAutoRedirect594 = !current
    AppToast.show(this, "Web Auto Redirect594: ${if (!current) "ON" else "OFF"}")
}

// v594: Widget Auto Refresh594
internal fun PlayerActivity.showV594WidgetAutoRefresh594Toggle() {
    val current = BiliClient.prefs.v594widgetAutoRefresh594
    BiliClient.prefs.v594widgetAutoRefresh594 = !current
    AppToast.show(this, "Widget Auto Refresh594: ${if (!current) "ON" else "OFF"}")
}

// v594: Window Auto Snap594
internal fun PlayerActivity.showV594WindowAutoSnap594Toggle() {
    val current = BiliClient.prefs.v594windowAutoSnap594
    BiliClient.prefs.v594windowAutoSnap594 = !current
    AppToast.show(this, "Window Auto Snap594: ${if (!current) "ON" else "OFF"}")
}

// v594: Wrap Auto Break594
internal fun PlayerActivity.showV594WrapAutoBreak594Toggle() {
    val current = BiliClient.prefs.v594wrapAutoBreak594
    BiliClient.prefs.v594wrapAutoBreak594 = !current
    AppToast.show(this, "Wrap Auto Break594: ${if (!current) "ON" else "OFF"}")
}

// v594: Zone Auto Detect594
internal fun PlayerActivity.showV594ZoneAutoDetect594Toggle() {
    val current = BiliClient.prefs.v594zoneAutoDetect594
    BiliClient.prefs.v594zoneAutoDetect594 = !current
    AppToast.show(this, "Zone Auto Detect594: ${if (!current) "ON" else "OFF"}")
}

// v594: Anchor Auto Pin594
internal fun PlayerActivity.showV594AnchorAutoPin594Toggle() {
    val current = BiliClient.prefs.v594anchorAutoPin594
    BiliClient.prefs.v594anchorAutoPin594 = !current
    AppToast.show(this, "Anchor Auto Pin594: ${if (!current) "ON" else "OFF"}")
}

// v594: Aspect Auto Ratio594
internal fun PlayerActivity.showV594AspectAutoRatio594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594aspectAutoRatio594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594aspectAutoRatio594 = value
        AppToast.show(this, "Aspect Auto Ratio594: $value")
    }
}

// v594: Attach Auto Embed594
internal fun PlayerActivity.showV594AttachAutoEmbed594Toggle() {
    val current = BiliClient.prefs.v594attachAutoEmbed594
    BiliClient.prefs.v594attachAutoEmbed594 = !current
    AppToast.show(this, "Attach Auto Embed594: ${if (!current) "ON" else "OFF"}")
}

// v594: Audio Auto Normalize594
internal fun PlayerActivity.showV594AudioAutoNormalize594Toggle() {
    val current = BiliClient.prefs.v594audioAutoNormalize594
    BiliClient.prefs.v594audioAutoNormalize594 = !current
    AppToast.show(this, "Audio Auto Normalize594: ${if (!current) "ON" else "OFF"}")
}

// v594: Axis Auto Align594
internal fun PlayerActivity.showV594AxisAutoAlign594Toggle() {
    val current = BiliClient.prefs.v594axisAutoAlign594
    BiliClient.prefs.v594axisAutoAlign594 = !current
    AppToast.show(this, "Axis Auto Align594: ${if (!current) "ON" else "OFF"}")
}

// v594: Badge Auto Count594
internal fun PlayerActivity.showV594BadgeAutoCount594Toggle() {
    val current = BiliClient.prefs.v594badgeAutoCount594
    BiliClient.prefs.v594badgeAutoCount594 = !current
    AppToast.show(this, "Badge Auto Count594: ${if (!current) "ON" else "OFF"}")
}

// v594: Baseline Auto Sync594
internal fun PlayerActivity.showV594BaselineAutoSync594Toggle() {
    val current = BiliClient.prefs.v594baselineAutoSync594
    BiliClient.prefs.v594baselineAutoSync594 = !current
    AppToast.show(this, "Baseline Auto Sync594: ${if (!current) "ON" else "OFF"}")
}

// v594: Bind Auto Link594
internal fun PlayerActivity.showV594BindAutoLink594Toggle() {
    val current = BiliClient.prefs.v594bindAutoLink594
    BiliClient.prefs.v594bindAutoLink594 = !current
    AppToast.show(this, "Bind Auto Link594: ${if (!current) "ON" else "OFF"}")
}

// v594: Bitrate Auto Scale594
internal fun PlayerActivity.showV594BitrateAutoScale594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594bitrateAutoScale594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594bitrateAutoScale594 = value
        AppToast.show(this, "Bitrate Auto Scale594: $value")
    }
}

// v594: Blend Auto Mode594
internal fun PlayerActivity.showV594BlendAutoMode594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594blendAutoMode594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594blendAutoMode594 = value
        AppToast.show(this, "Blend Auto Mode594: $value")
    }
}

// v595: Web Auto Redirect595
internal fun PlayerActivity.showV595WebAutoRedirect595Toggle() {
    val current = BiliClient.prefs.v595webAutoRedirect595
    BiliClient.prefs.v595webAutoRedirect595 = !current
    AppToast.show(this, "Web Auto Redirect595: ${if (!current) "ON" else "OFF"}")
}

// v595: Widget Auto Refresh595
internal fun PlayerActivity.showV595WidgetAutoRefresh595Toggle() {
    val current = BiliClient.prefs.v595widgetAutoRefresh595
    BiliClient.prefs.v595widgetAutoRefresh595 = !current
    AppToast.show(this, "Widget Auto Refresh595: ${if (!current) "ON" else "OFF"}")
}

// v595: Window Auto Snap595
internal fun PlayerActivity.showV595WindowAutoSnap595Toggle() {
    val current = BiliClient.prefs.v595windowAutoSnap595
    BiliClient.prefs.v595windowAutoSnap595 = !current
    AppToast.show(this, "Window Auto Snap595: ${if (!current) "ON" else "OFF"}")
}

// v595: Wrap Auto Break595
internal fun PlayerActivity.showV595WrapAutoBreak595Toggle() {
    val current = BiliClient.prefs.v595wrapAutoBreak595
    BiliClient.prefs.v595wrapAutoBreak595 = !current
    AppToast.show(this, "Wrap Auto Break595: ${if (!current) "ON" else "OFF"}")
}

// v595: Zone Auto Detect595
internal fun PlayerActivity.showV595ZoneAutoDetect595Toggle() {
    val current = BiliClient.prefs.v595zoneAutoDetect595
    BiliClient.prefs.v595zoneAutoDetect595 = !current
    AppToast.show(this, "Zone Auto Detect595: ${if (!current) "ON" else "OFF"}")
}

// v595: Anchor Auto Pin595
internal fun PlayerActivity.showV595AnchorAutoPin595Toggle() {
    val current = BiliClient.prefs.v595anchorAutoPin595
    BiliClient.prefs.v595anchorAutoPin595 = !current
    AppToast.show(this, "Anchor Auto Pin595: ${if (!current) "ON" else "OFF"}")
}

// v595: Aspect Auto Ratio595
internal fun PlayerActivity.showV595AspectAutoRatio595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595aspectAutoRatio595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595aspectAutoRatio595 = value
        AppToast.show(this, "Aspect Auto Ratio595: $value")
    }
}

// v595: Attach Auto Embed595
internal fun PlayerActivity.showV595AttachAutoEmbed595Toggle() {
    val current = BiliClient.prefs.v595attachAutoEmbed595
    BiliClient.prefs.v595attachAutoEmbed595 = !current
    AppToast.show(this, "Attach Auto Embed595: ${if (!current) "ON" else "OFF"}")
}

// v595: Audio Auto Normalize595
internal fun PlayerActivity.showV595AudioAutoNormalize595Toggle() {
    val current = BiliClient.prefs.v595audioAutoNormalize595
    BiliClient.prefs.v595audioAutoNormalize595 = !current
    AppToast.show(this, "Audio Auto Normalize595: ${if (!current) "ON" else "OFF"}")
}

// v595: Axis Auto Align595
internal fun PlayerActivity.showV595AxisAutoAlign595Toggle() {
    val current = BiliClient.prefs.v595axisAutoAlign595
    BiliClient.prefs.v595axisAutoAlign595 = !current
    AppToast.show(this, "Axis Auto Align595: ${if (!current) "ON" else "OFF"}")
}

// v595: Badge Auto Count595
internal fun PlayerActivity.showV595BadgeAutoCount595Toggle() {
    val current = BiliClient.prefs.v595badgeAutoCount595
    BiliClient.prefs.v595badgeAutoCount595 = !current
    AppToast.show(this, "Badge Auto Count595: ${if (!current) "ON" else "OFF"}")
}

// v595: Baseline Auto Sync595
internal fun PlayerActivity.showV595BaselineAutoSync595Toggle() {
    val current = BiliClient.prefs.v595baselineAutoSync595
    BiliClient.prefs.v595baselineAutoSync595 = !current
    AppToast.show(this, "Baseline Auto Sync595: ${if (!current) "ON" else "OFF"}")
}

// v595: Bind Auto Link595
internal fun PlayerActivity.showV595BindAutoLink595Toggle() {
    val current = BiliClient.prefs.v595bindAutoLink595
    BiliClient.prefs.v595bindAutoLink595 = !current
    AppToast.show(this, "Bind Auto Link595: ${if (!current) "ON" else "OFF"}")
}

// v595: Bitrate Auto Scale595
internal fun PlayerActivity.showV595BitrateAutoScale595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595bitrateAutoScale595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595bitrateAutoScale595 = value
        AppToast.show(this, "Bitrate Auto Scale595: $value")
    }
}

// v595: Blend Auto Mode595
internal fun PlayerActivity.showV595BlendAutoMode595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595blendAutoMode595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595blendAutoMode595 = value
        AppToast.show(this, "Blend Auto Mode595: $value")
    }
}

// v596: Web Auto Redirect596
internal fun PlayerActivity.showV596WebAutoRedirect596Toggle() {
    val current = BiliClient.prefs.v596webAutoRedirect596
    BiliClient.prefs.v596webAutoRedirect596 = !current
    AppToast.show(this, "Web Auto Redirect596: ${if (!current) "ON" else "OFF"}")
}

// v596: Widget Auto Refresh596
internal fun PlayerActivity.showV596WidgetAutoRefresh596Toggle() {
    val current = BiliClient.prefs.v596widgetAutoRefresh596
    BiliClient.prefs.v596widgetAutoRefresh596 = !current
    AppToast.show(this, "Widget Auto Refresh596: ${if (!current) "ON" else "OFF"}")
}

// v596: Window Auto Snap596
internal fun PlayerActivity.showV596WindowAutoSnap596Toggle() {
    val current = BiliClient.prefs.v596windowAutoSnap596
    BiliClient.prefs.v596windowAutoSnap596 = !current
    AppToast.show(this, "Window Auto Snap596: ${if (!current) "ON" else "OFF"}")
}

// v596: Wrap Auto Break596
internal fun PlayerActivity.showV596WrapAutoBreak596Toggle() {
    val current = BiliClient.prefs.v596wrapAutoBreak596
    BiliClient.prefs.v596wrapAutoBreak596 = !current
    AppToast.show(this, "Wrap Auto Break596: ${if (!current) "ON" else "OFF"}")
}

// v596: Zone Auto Detect596
internal fun PlayerActivity.showV596ZoneAutoDetect596Toggle() {
    val current = BiliClient.prefs.v596zoneAutoDetect596
    BiliClient.prefs.v596zoneAutoDetect596 = !current
    AppToast.show(this, "Zone Auto Detect596: ${if (!current) "ON" else "OFF"}")
}

// v596: Anchor Auto Pin596
internal fun PlayerActivity.showV596AnchorAutoPin596Toggle() {
    val current = BiliClient.prefs.v596anchorAutoPin596
    BiliClient.prefs.v596anchorAutoPin596 = !current
    AppToast.show(this, "Anchor Auto Pin596: ${if (!current) "ON" else "OFF"}")
}

// v596: Aspect Auto Ratio596
internal fun PlayerActivity.showV596AspectAutoRatio596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596aspectAutoRatio596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596aspectAutoRatio596 = value
        AppToast.show(this, "Aspect Auto Ratio596: $value")
    }
}

// v596: Attach Auto Embed596
internal fun PlayerActivity.showV596AttachAutoEmbed596Toggle() {
    val current = BiliClient.prefs.v596attachAutoEmbed596
    BiliClient.prefs.v596attachAutoEmbed596 = !current
    AppToast.show(this, "Attach Auto Embed596: ${if (!current) "ON" else "OFF"}")
}

