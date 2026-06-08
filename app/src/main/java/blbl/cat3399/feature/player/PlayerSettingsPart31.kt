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

internal fun PlayerActivity.showV428ExpandOnDoubleTap428Toggle() {
    val current = BiliClient.prefs.v428expandOnDoubleTap428
    BiliClient.prefs.v428expandOnDoubleTap428 = !current
    AppToast.show(this, "Expand On Double Tap428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428ExportFormatDefault428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v428exportFormatDefault428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v428exportFormatDefault428 = value
        AppToast.show(this, "Export Format Default428: $value")
    }
}

internal fun PlayerActivity.showV428ExtractAudioAuto428Toggle() {
    val current = BiliClient.prefs.v428extractAudioAuto428
    BiliClient.prefs.v428extractAudioAuto428 = !current
    AppToast.show(this, "Extract Audio Auto428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428FadeTransition428Toggle() {
    val current = BiliClient.prefs.v428fadeTransition428
    BiliClient.prefs.v428fadeTransition428 = !current
    AppToast.show(this, "Fade Transition428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428FeedAutoRefresh428Toggle() {
    val current = BiliClient.prefs.v428feedAutoRefresh428
    BiliClient.prefs.v428feedAutoRefresh428 = !current
    AppToast.show(this, "Feed Auto Refresh428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428FeedLayoutStyle428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v428feedLayoutStyle428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v428feedLayoutStyle428 = value
        AppToast.show(this, "Feed Layout Style428: $value")
    }
}

internal fun PlayerActivity.showV428FileAutoOrganize428Toggle() {
    val current = BiliClient.prefs.v428fileAutoOrganize428
    BiliClient.prefs.v428fileAutoOrganize428 = !current
    AppToast.show(this, "File Auto Organize428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428FindInPageHighlight428Toggle() {
    val current = BiliClient.prefs.v428findInPageHighlight428
    BiliClient.prefs.v428findInPageHighlight428 = !current
    AppToast.show(this, "Find In Page Highlight428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428FixCorruptAuto428Toggle() {
    val current = BiliClient.prefs.v428fixCorruptAuto428
    BiliClient.prefs.v428fixCorruptAuto428 = !current
    AppToast.show(this, "Fix Corrupt Auto428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429EnterAnimation429Toggle() {
    val current = BiliClient.prefs.v429enterAnimation429
    BiliClient.prefs.v429enterAnimation429 = !current
    AppToast.show(this, "Enter Animation429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429EnvironmentLightSensor429Toggle() {
    val current = BiliClient.prefs.v429environmentLightSensor429
    BiliClient.prefs.v429environmentLightSensor429 = !current
    AppToast.show(this, "Environment Light Sensor429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429ErrorAutoRetry429Toggle() {
    val current = BiliClient.prefs.v429errorAutoRetry429
    BiliClient.prefs.v429errorAutoRetry429 = !current
    AppToast.show(this, "Error Auto Retry429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429ErrorReportAuto429Toggle() {
    val current = BiliClient.prefs.v429errorReportAuto429
    BiliClient.prefs.v429errorReportAuto429 = !current
    AppToast.show(this, "Error Report Auto429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429EventAutoNotify429Toggle() {
    val current = BiliClient.prefs.v429eventAutoNotify429
    BiliClient.prefs.v429eventAutoNotify429 = !current
    AppToast.show(this, "Event Auto Notify429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429ExitConfirmation429Toggle() {
    val current = BiliClient.prefs.v429exitConfirmation429
    BiliClient.prefs.v429exitConfirmation429 = !current
    AppToast.show(this, "Exit Confirmation429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429ExpandOnDoubleTap429Toggle() {
    val current = BiliClient.prefs.v429expandOnDoubleTap429
    BiliClient.prefs.v429expandOnDoubleTap429 = !current
    AppToast.show(this, "Expand On Double Tap429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429ExportFormatDefault429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v429exportFormatDefault429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v429exportFormatDefault429 = value
        AppToast.show(this, "Export Format Default429: $value")
    }
}

internal fun PlayerActivity.showV429ExtractAudioAuto429Toggle() {
    val current = BiliClient.prefs.v429extractAudioAuto429
    BiliClient.prefs.v429extractAudioAuto429 = !current
    AppToast.show(this, "Extract Audio Auto429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429FadeTransition429Toggle() {
    val current = BiliClient.prefs.v429fadeTransition429
    BiliClient.prefs.v429fadeTransition429 = !current
    AppToast.show(this, "Fade Transition429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429FeedAutoRefresh429Toggle() {
    val current = BiliClient.prefs.v429feedAutoRefresh429
    BiliClient.prefs.v429feedAutoRefresh429 = !current
    AppToast.show(this, "Feed Auto Refresh429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429FeedLayoutStyle429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v429feedLayoutStyle429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v429feedLayoutStyle429 = value
        AppToast.show(this, "Feed Layout Style429: $value")
    }
}

internal fun PlayerActivity.showV429FileAutoOrganize429Toggle() {
    val current = BiliClient.prefs.v429fileAutoOrganize429
    BiliClient.prefs.v429fileAutoOrganize429 = !current
    AppToast.show(this, "File Auto Organize429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429FindInPageHighlight429Toggle() {
    val current = BiliClient.prefs.v429findInPageHighlight429
    BiliClient.prefs.v429findInPageHighlight429 = !current
    AppToast.show(this, "Find In Page Highlight429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV429FixCorruptAuto429Toggle() {
    val current = BiliClient.prefs.v429fixCorruptAuto429
    BiliClient.prefs.v429fixCorruptAuto429 = !current
    AppToast.show(this, "Fix Corrupt Auto429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430EnterAnimation430Toggle() {
    val current = BiliClient.prefs.v430enterAnimation430
    BiliClient.prefs.v430enterAnimation430 = !current
    AppToast.show(this, "Enter Animation430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430EnvironmentLightSensor430Toggle() {
    val current = BiliClient.prefs.v430environmentLightSensor430
    BiliClient.prefs.v430environmentLightSensor430 = !current
    AppToast.show(this, "Environment Light Sensor430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430ErrorAutoRetry430Toggle() {
    val current = BiliClient.prefs.v430errorAutoRetry430
    BiliClient.prefs.v430errorAutoRetry430 = !current
    AppToast.show(this, "Error Auto Retry430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430ErrorReportAuto430Toggle() {
    val current = BiliClient.prefs.v430errorReportAuto430
    BiliClient.prefs.v430errorReportAuto430 = !current
    AppToast.show(this, "Error Report Auto430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430EventAutoNotify430Toggle() {
    val current = BiliClient.prefs.v430eventAutoNotify430
    BiliClient.prefs.v430eventAutoNotify430 = !current
    AppToast.show(this, "Event Auto Notify430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430ExitConfirmation430Toggle() {
    val current = BiliClient.prefs.v430exitConfirmation430
    BiliClient.prefs.v430exitConfirmation430 = !current
    AppToast.show(this, "Exit Confirmation430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430ExpandOnDoubleTap430Toggle() {
    val current = BiliClient.prefs.v430expandOnDoubleTap430
    BiliClient.prefs.v430expandOnDoubleTap430 = !current
    AppToast.show(this, "Expand On Double Tap430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430ExportFormatDefault430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v430exportFormatDefault430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v430exportFormatDefault430 = value
        AppToast.show(this, "Export Format Default430: $value")
    }
}

internal fun PlayerActivity.showV430ExtractAudioAuto430Toggle() {
    val current = BiliClient.prefs.v430extractAudioAuto430
    BiliClient.prefs.v430extractAudioAuto430 = !current
    AppToast.show(this, "Extract Audio Auto430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430FadeTransition430Toggle() {
    val current = BiliClient.prefs.v430fadeTransition430
    BiliClient.prefs.v430fadeTransition430 = !current
    AppToast.show(this, "Fade Transition430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430FeedAutoRefresh430Toggle() {
    val current = BiliClient.prefs.v430feedAutoRefresh430
    BiliClient.prefs.v430feedAutoRefresh430 = !current
    AppToast.show(this, "Feed Auto Refresh430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430FeedLayoutStyle430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v430feedLayoutStyle430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v430feedLayoutStyle430 = value
        AppToast.show(this, "Feed Layout Style430: $value")
    }
}

internal fun PlayerActivity.showV430FileAutoOrganize430Toggle() {
    val current = BiliClient.prefs.v430fileAutoOrganize430
    BiliClient.prefs.v430fileAutoOrganize430 = !current
    AppToast.show(this, "File Auto Organize430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430FindInPageHighlight430Toggle() {
    val current = BiliClient.prefs.v430findInPageHighlight430
    BiliClient.prefs.v430findInPageHighlight430 = !current
    AppToast.show(this, "Find In Page Highlight430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV430FixCorruptAuto430Toggle() {
    val current = BiliClient.prefs.v430fixCorruptAuto430
    BiliClient.prefs.v430fixCorruptAuto430 = !current
    AppToast.show(this, "Fix Corrupt Auto430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FlashScreenOnNotify431Toggle() {
    val current = BiliClient.prefs.v431flashScreenOnNotify431
    BiliClient.prefs.v431flashScreenOnNotify431 = !current
    AppToast.show(this, "Flash Screen On Notify431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FlexLayoutEnabled431Toggle() {
    val current = BiliClient.prefs.v431flexLayoutEnabled431
    BiliClient.prefs.v431flexLayoutEnabled431 = !current
    AppToast.show(this, "Flex Layout Enabled431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FlipGestureEnabled431Toggle() {
    val current = BiliClient.prefs.v431flipGestureEnabled431
    BiliClient.prefs.v431flipGestureEnabled431 = !current
    AppToast.show(this, "Flip Gesture Enabled431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FlowAutoRedirect431Toggle() {
    val current = BiliClient.prefs.v431flowAutoRedirect431
    BiliClient.prefs.v431flowAutoRedirect431 = !current
    AppToast.show(this, "Flow Auto Redirect431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FlyModeSpeed431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v431flyModeSpeed431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v431flyModeSpeed431 = value
        AppToast.show(this, "Fly Mode Speed431: $value")
    }
}

internal fun PlayerActivity.showV431FocusAutoEnhance431Toggle() {
    val current = BiliClient.prefs.v431focusAutoEnhance431
    BiliClient.prefs.v431focusAutoEnhance431 = !current
    AppToast.show(this, "Focus Auto Enhance431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FollowAutoSubscribe431Toggle() {
    val current = BiliClient.prefs.v431followAutoSubscribe431
    BiliClient.prefs.v431followAutoSubscribe431 = !current
    AppToast.show(this, "Follow Auto Subscribe431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431ForceDecodeHw431Toggle() {
    val current = BiliClient.prefs.v431forceDecodeHw431
    BiliClient.prefs.v431forceDecodeHw431 = !current
    AppToast.show(this, "Force Decode HW431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FormatAutoConvert431Toggle() {
    val current = BiliClient.prefs.v431formatAutoConvert431
    BiliClient.prefs.v431formatAutoConvert431 = !current
    AppToast.show(this, "Format Auto Convert431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FrameInterpolation431Toggle() {
    val current = BiliClient.prefs.v431frameInterpolation431
    BiliClient.prefs.v431frameInterpolation431 = !current
    AppToast.show(this, "Frame Interpolation431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FreeMemoryAuto431Toggle() {
    val current = BiliClient.prefs.v431freeMemoryAuto431
    BiliClient.prefs.v431freeMemoryAuto431 = !current
    AppToast.show(this, "Free Memory Auto431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FreezeOnBuffering431Toggle() {
    val current = BiliClient.prefs.v431freezeOnBuffering431
    BiliClient.prefs.v431freezeOnBuffering431 = !current
    AppToast.show(this, "Freeze On Buffering431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431FullscreenAutoRotate431Toggle() {
    val current = BiliClient.prefs.v431fullscreenAutoRotate431
    BiliClient.prefs.v431fullscreenAutoRotate431 = !current
    AppToast.show(this, "Fullscreen Auto Rotate431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431GainAutoBalance431Toggle() {
    val current = BiliClient.prefs.v431gainAutoBalance431
    BiliClient.prefs.v431gainAutoBalance431 = !current
    AppToast.show(this, "Gain Auto Balance431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV431GalleryAutoLayout431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v431galleryAutoLayout431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v431galleryAutoLayout431 = value
        AppToast.show(this, "Gallery Auto Layout431: $value")
    }
}

internal fun PlayerActivity.showV432FlashScreenOnNotify432Toggle() {
    val current = BiliClient.prefs.v432flashScreenOnNotify432
    BiliClient.prefs.v432flashScreenOnNotify432 = !current
    AppToast.show(this, "Flash Screen On Notify432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FlexLayoutEnabled432Toggle() {
    val current = BiliClient.prefs.v432flexLayoutEnabled432
    BiliClient.prefs.v432flexLayoutEnabled432 = !current
    AppToast.show(this, "Flex Layout Enabled432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FlipGestureEnabled432Toggle() {
    val current = BiliClient.prefs.v432flipGestureEnabled432
    BiliClient.prefs.v432flipGestureEnabled432 = !current
    AppToast.show(this, "Flip Gesture Enabled432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FlowAutoRedirect432Toggle() {
    val current = BiliClient.prefs.v432flowAutoRedirect432
    BiliClient.prefs.v432flowAutoRedirect432 = !current
    AppToast.show(this, "Flow Auto Redirect432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FlyModeSpeed432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v432flyModeSpeed432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v432flyModeSpeed432 = value
        AppToast.show(this, "Fly Mode Speed432: $value")
    }
}

internal fun PlayerActivity.showV432FocusAutoEnhance432Toggle() {
    val current = BiliClient.prefs.v432focusAutoEnhance432
    BiliClient.prefs.v432focusAutoEnhance432 = !current
    AppToast.show(this, "Focus Auto Enhance432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FollowAutoSubscribe432Toggle() {
    val current = BiliClient.prefs.v432followAutoSubscribe432
    BiliClient.prefs.v432followAutoSubscribe432 = !current
    AppToast.show(this, "Follow Auto Subscribe432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432ForceDecodeHw432Toggle() {
    val current = BiliClient.prefs.v432forceDecodeHw432
    BiliClient.prefs.v432forceDecodeHw432 = !current
    AppToast.show(this, "Force Decode HW432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FormatAutoConvert432Toggle() {
    val current = BiliClient.prefs.v432formatAutoConvert432
    BiliClient.prefs.v432formatAutoConvert432 = !current
    AppToast.show(this, "Format Auto Convert432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FrameInterpolation432Toggle() {
    val current = BiliClient.prefs.v432frameInterpolation432
    BiliClient.prefs.v432frameInterpolation432 = !current
    AppToast.show(this, "Frame Interpolation432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FreeMemoryAuto432Toggle() {
    val current = BiliClient.prefs.v432freeMemoryAuto432
    BiliClient.prefs.v432freeMemoryAuto432 = !current
    AppToast.show(this, "Free Memory Auto432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FreezeOnBuffering432Toggle() {
    val current = BiliClient.prefs.v432freezeOnBuffering432
    BiliClient.prefs.v432freezeOnBuffering432 = !current
    AppToast.show(this, "Freeze On Buffering432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432FullscreenAutoRotate432Toggle() {
    val current = BiliClient.prefs.v432fullscreenAutoRotate432
    BiliClient.prefs.v432fullscreenAutoRotate432 = !current
    AppToast.show(this, "Fullscreen Auto Rotate432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432GainAutoBalance432Toggle() {
    val current = BiliClient.prefs.v432gainAutoBalance432
    BiliClient.prefs.v432gainAutoBalance432 = !current
    AppToast.show(this, "Gain Auto Balance432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV432GalleryAutoLayout432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v432galleryAutoLayout432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v432galleryAutoLayout432 = value
        AppToast.show(this, "Gallery Auto Layout432: $value")
    }
}

internal fun PlayerActivity.showV433FlashScreenOnNotify433Toggle() {
    val current = BiliClient.prefs.v433flashScreenOnNotify433
    BiliClient.prefs.v433flashScreenOnNotify433 = !current
    AppToast.show(this, "Flash Screen On Notify433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FlexLayoutEnabled433Toggle() {
    val current = BiliClient.prefs.v433flexLayoutEnabled433
    BiliClient.prefs.v433flexLayoutEnabled433 = !current
    AppToast.show(this, "Flex Layout Enabled433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FlipGestureEnabled433Toggle() {
    val current = BiliClient.prefs.v433flipGestureEnabled433
    BiliClient.prefs.v433flipGestureEnabled433 = !current
    AppToast.show(this, "Flip Gesture Enabled433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FlowAutoRedirect433Toggle() {
    val current = BiliClient.prefs.v433flowAutoRedirect433
    BiliClient.prefs.v433flowAutoRedirect433 = !current
    AppToast.show(this, "Flow Auto Redirect433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FlyModeSpeed433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v433flyModeSpeed433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v433flyModeSpeed433 = value
        AppToast.show(this, "Fly Mode Speed433: $value")
    }
}

internal fun PlayerActivity.showV433FocusAutoEnhance433Toggle() {
    val current = BiliClient.prefs.v433focusAutoEnhance433
    BiliClient.prefs.v433focusAutoEnhance433 = !current
    AppToast.show(this, "Focus Auto Enhance433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FollowAutoSubscribe433Toggle() {
    val current = BiliClient.prefs.v433followAutoSubscribe433
    BiliClient.prefs.v433followAutoSubscribe433 = !current
    AppToast.show(this, "Follow Auto Subscribe433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433ForceDecodeHw433Toggle() {
    val current = BiliClient.prefs.v433forceDecodeHw433
    BiliClient.prefs.v433forceDecodeHw433 = !current
    AppToast.show(this, "Force Decode HW433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FormatAutoConvert433Toggle() {
    val current = BiliClient.prefs.v433formatAutoConvert433
    BiliClient.prefs.v433formatAutoConvert433 = !current
    AppToast.show(this, "Format Auto Convert433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FrameInterpolation433Toggle() {
    val current = BiliClient.prefs.v433frameInterpolation433
    BiliClient.prefs.v433frameInterpolation433 = !current
    AppToast.show(this, "Frame Interpolation433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FreeMemoryAuto433Toggle() {
    val current = BiliClient.prefs.v433freeMemoryAuto433
    BiliClient.prefs.v433freeMemoryAuto433 = !current
    AppToast.show(this, "Free Memory Auto433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FreezeOnBuffering433Toggle() {
    val current = BiliClient.prefs.v433freezeOnBuffering433
    BiliClient.prefs.v433freezeOnBuffering433 = !current
    AppToast.show(this, "Freeze On Buffering433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433FullscreenAutoRotate433Toggle() {
    val current = BiliClient.prefs.v433fullscreenAutoRotate433
    BiliClient.prefs.v433fullscreenAutoRotate433 = !current
    AppToast.show(this, "Fullscreen Auto Rotate433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433GainAutoBalance433Toggle() {
    val current = BiliClient.prefs.v433gainAutoBalance433
    BiliClient.prefs.v433gainAutoBalance433 = !current
    AppToast.show(this, "Gain Auto Balance433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV433GalleryAutoLayout433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v433galleryAutoLayout433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v433galleryAutoLayout433 = value
        AppToast.show(this, "Gallery Auto Layout433: $value")
    }
}

internal fun PlayerActivity.showV434FlashScreenOnNotify434Toggle() {
    val current = BiliClient.prefs.v434flashScreenOnNotify434
    BiliClient.prefs.v434flashScreenOnNotify434 = !current
    AppToast.show(this, "Flash Screen On Notify434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FlexLayoutEnabled434Toggle() {
    val current = BiliClient.prefs.v434flexLayoutEnabled434
    BiliClient.prefs.v434flexLayoutEnabled434 = !current
    AppToast.show(this, "Flex Layout Enabled434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FlipGestureEnabled434Toggle() {
    val current = BiliClient.prefs.v434flipGestureEnabled434
    BiliClient.prefs.v434flipGestureEnabled434 = !current
    AppToast.show(this, "Flip Gesture Enabled434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FlowAutoRedirect434Toggle() {
    val current = BiliClient.prefs.v434flowAutoRedirect434
    BiliClient.prefs.v434flowAutoRedirect434 = !current
    AppToast.show(this, "Flow Auto Redirect434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FlyModeSpeed434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v434flyModeSpeed434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v434flyModeSpeed434 = value
        AppToast.show(this, "Fly Mode Speed434: $value")
    }
}

internal fun PlayerActivity.showV434FocusAutoEnhance434Toggle() {
    val current = BiliClient.prefs.v434focusAutoEnhance434
    BiliClient.prefs.v434focusAutoEnhance434 = !current
    AppToast.show(this, "Focus Auto Enhance434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FollowAutoSubscribe434Toggle() {
    val current = BiliClient.prefs.v434followAutoSubscribe434
    BiliClient.prefs.v434followAutoSubscribe434 = !current
    AppToast.show(this, "Follow Auto Subscribe434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434ForceDecodeHw434Toggle() {
    val current = BiliClient.prefs.v434forceDecodeHw434
    BiliClient.prefs.v434forceDecodeHw434 = !current
    AppToast.show(this, "Force Decode HW434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FormatAutoConvert434Toggle() {
    val current = BiliClient.prefs.v434formatAutoConvert434
    BiliClient.prefs.v434formatAutoConvert434 = !current
    AppToast.show(this, "Format Auto Convert434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FrameInterpolation434Toggle() {
    val current = BiliClient.prefs.v434frameInterpolation434
    BiliClient.prefs.v434frameInterpolation434 = !current
    AppToast.show(this, "Frame Interpolation434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FreeMemoryAuto434Toggle() {
    val current = BiliClient.prefs.v434freeMemoryAuto434
    BiliClient.prefs.v434freeMemoryAuto434 = !current
    AppToast.show(this, "Free Memory Auto434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FreezeOnBuffering434Toggle() {
    val current = BiliClient.prefs.v434freezeOnBuffering434
    BiliClient.prefs.v434freezeOnBuffering434 = !current
    AppToast.show(this, "Freeze On Buffering434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434FullscreenAutoRotate434Toggle() {
    val current = BiliClient.prefs.v434fullscreenAutoRotate434
    BiliClient.prefs.v434fullscreenAutoRotate434 = !current
    AppToast.show(this, "Fullscreen Auto Rotate434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434GainAutoBalance434Toggle() {
    val current = BiliClient.prefs.v434gainAutoBalance434
    BiliClient.prefs.v434gainAutoBalance434 = !current
    AppToast.show(this, "Gain Auto Balance434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV434GalleryAutoLayout434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v434galleryAutoLayout434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v434galleryAutoLayout434 = value
        AppToast.show(this, "Gallery Auto Layout434: $value")
    }
}

internal fun PlayerActivity.showV435FlashScreenOnNotify435Toggle() {
    val current = BiliClient.prefs.v435flashScreenOnNotify435
    BiliClient.prefs.v435flashScreenOnNotify435 = !current
    AppToast.show(this, "Flash Screen On Notify435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FlexLayoutEnabled435Toggle() {
    val current = BiliClient.prefs.v435flexLayoutEnabled435
    BiliClient.prefs.v435flexLayoutEnabled435 = !current
    AppToast.show(this, "Flex Layout Enabled435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FlipGestureEnabled435Toggle() {
    val current = BiliClient.prefs.v435flipGestureEnabled435
    BiliClient.prefs.v435flipGestureEnabled435 = !current
    AppToast.show(this, "Flip Gesture Enabled435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FlowAutoRedirect435Toggle() {
    val current = BiliClient.prefs.v435flowAutoRedirect435
    BiliClient.prefs.v435flowAutoRedirect435 = !current
    AppToast.show(this, "Flow Auto Redirect435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FlyModeSpeed435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v435flyModeSpeed435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v435flyModeSpeed435 = value
        AppToast.show(this, "Fly Mode Speed435: $value")
    }
}

internal fun PlayerActivity.showV435FocusAutoEnhance435Toggle() {
    val current = BiliClient.prefs.v435focusAutoEnhance435
    BiliClient.prefs.v435focusAutoEnhance435 = !current
    AppToast.show(this, "Focus Auto Enhance435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FollowAutoSubscribe435Toggle() {
    val current = BiliClient.prefs.v435followAutoSubscribe435
    BiliClient.prefs.v435followAutoSubscribe435 = !current
    AppToast.show(this, "Follow Auto Subscribe435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435ForceDecodeHw435Toggle() {
    val current = BiliClient.prefs.v435forceDecodeHw435
    BiliClient.prefs.v435forceDecodeHw435 = !current
    AppToast.show(this, "Force Decode HW435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FormatAutoConvert435Toggle() {
    val current = BiliClient.prefs.v435formatAutoConvert435
    BiliClient.prefs.v435formatAutoConvert435 = !current
    AppToast.show(this, "Format Auto Convert435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FrameInterpolation435Toggle() {
    val current = BiliClient.prefs.v435frameInterpolation435
    BiliClient.prefs.v435frameInterpolation435 = !current
    AppToast.show(this, "Frame Interpolation435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FreeMemoryAuto435Toggle() {
    val current = BiliClient.prefs.v435freeMemoryAuto435
    BiliClient.prefs.v435freeMemoryAuto435 = !current
    AppToast.show(this, "Free Memory Auto435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FreezeOnBuffering435Toggle() {
    val current = BiliClient.prefs.v435freezeOnBuffering435
    BiliClient.prefs.v435freezeOnBuffering435 = !current
    AppToast.show(this, "Freeze On Buffering435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435FullscreenAutoRotate435Toggle() {
    val current = BiliClient.prefs.v435fullscreenAutoRotate435
    BiliClient.prefs.v435fullscreenAutoRotate435 = !current
    AppToast.show(this, "Fullscreen Auto Rotate435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435GainAutoBalance435Toggle() {
    val current = BiliClient.prefs.v435gainAutoBalance435
    BiliClient.prefs.v435gainAutoBalance435 = !current
    AppToast.show(this, "Gain Auto Balance435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV435GalleryAutoLayout435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v435galleryAutoLayout435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v435galleryAutoLayout435 = value
        AppToast.show(this, "Gallery Auto Layout435: $value")
    }
}

internal fun PlayerActivity.showV436FlashScreenOnNotify436Toggle() {
    val current = BiliClient.prefs.v436flashScreenOnNotify436
    BiliClient.prefs.v436flashScreenOnNotify436 = !current
    AppToast.show(this, "Flash Screen On Notify436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FlexLayoutEnabled436Toggle() {
    val current = BiliClient.prefs.v436flexLayoutEnabled436
    BiliClient.prefs.v436flexLayoutEnabled436 = !current
    AppToast.show(this, "Flex Layout Enabled436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FlipGestureEnabled436Toggle() {
    val current = BiliClient.prefs.v436flipGestureEnabled436
    BiliClient.prefs.v436flipGestureEnabled436 = !current
    AppToast.show(this, "Flip Gesture Enabled436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FlowAutoRedirect436Toggle() {
    val current = BiliClient.prefs.v436flowAutoRedirect436
    BiliClient.prefs.v436flowAutoRedirect436 = !current
    AppToast.show(this, "Flow Auto Redirect436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FlyModeSpeed436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v436flyModeSpeed436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v436flyModeSpeed436 = value
        AppToast.show(this, "Fly Mode Speed436: $value")
    }
}

internal fun PlayerActivity.showV436FocusAutoEnhance436Toggle() {
    val current = BiliClient.prefs.v436focusAutoEnhance436
    BiliClient.prefs.v436focusAutoEnhance436 = !current
    AppToast.show(this, "Focus Auto Enhance436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FollowAutoSubscribe436Toggle() {
    val current = BiliClient.prefs.v436followAutoSubscribe436
    BiliClient.prefs.v436followAutoSubscribe436 = !current
    AppToast.show(this, "Follow Auto Subscribe436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436ForceDecodeHw436Toggle() {
    val current = BiliClient.prefs.v436forceDecodeHw436
    BiliClient.prefs.v436forceDecodeHw436 = !current
    AppToast.show(this, "Force Decode HW436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FormatAutoConvert436Toggle() {
    val current = BiliClient.prefs.v436formatAutoConvert436
    BiliClient.prefs.v436formatAutoConvert436 = !current
    AppToast.show(this, "Format Auto Convert436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FrameInterpolation436Toggle() {
    val current = BiliClient.prefs.v436frameInterpolation436
    BiliClient.prefs.v436frameInterpolation436 = !current
    AppToast.show(this, "Frame Interpolation436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FreeMemoryAuto436Toggle() {
    val current = BiliClient.prefs.v436freeMemoryAuto436
    BiliClient.prefs.v436freeMemoryAuto436 = !current
    AppToast.show(this, "Free Memory Auto436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FreezeOnBuffering436Toggle() {
    val current = BiliClient.prefs.v436freezeOnBuffering436
    BiliClient.prefs.v436freezeOnBuffering436 = !current
    AppToast.show(this, "Freeze On Buffering436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436FullscreenAutoRotate436Toggle() {
    val current = BiliClient.prefs.v436fullscreenAutoRotate436
    BiliClient.prefs.v436fullscreenAutoRotate436 = !current
    AppToast.show(this, "Fullscreen Auto Rotate436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436GainAutoBalance436Toggle() {
    val current = BiliClient.prefs.v436gainAutoBalance436
    BiliClient.prefs.v436gainAutoBalance436 = !current
    AppToast.show(this, "Gain Auto Balance436: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV436GalleryAutoLayout436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v436galleryAutoLayout436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v436galleryAutoLayout436 = value
        AppToast.show(this, "Gallery Auto Layout436: $value")
    }
}

internal fun PlayerActivity.showV437FlashScreenOnNotify437Toggle() {
    val current = BiliClient.prefs.v437flashScreenOnNotify437
    BiliClient.prefs.v437flashScreenOnNotify437 = !current
    AppToast.show(this, "Flash Screen On Notify437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FlexLayoutEnabled437Toggle() {
    val current = BiliClient.prefs.v437flexLayoutEnabled437
    BiliClient.prefs.v437flexLayoutEnabled437 = !current
    AppToast.show(this, "Flex Layout Enabled437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FlipGestureEnabled437Toggle() {
    val current = BiliClient.prefs.v437flipGestureEnabled437
    BiliClient.prefs.v437flipGestureEnabled437 = !current
    AppToast.show(this, "Flip Gesture Enabled437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FlowAutoRedirect437Toggle() {
    val current = BiliClient.prefs.v437flowAutoRedirect437
    BiliClient.prefs.v437flowAutoRedirect437 = !current
    AppToast.show(this, "Flow Auto Redirect437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FlyModeSpeed437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v437flyModeSpeed437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v437flyModeSpeed437 = value
        AppToast.show(this, "Fly Mode Speed437: $value")
    }
}

internal fun PlayerActivity.showV437FocusAutoEnhance437Toggle() {
    val current = BiliClient.prefs.v437focusAutoEnhance437
    BiliClient.prefs.v437focusAutoEnhance437 = !current
    AppToast.show(this, "Focus Auto Enhance437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FollowAutoSubscribe437Toggle() {
    val current = BiliClient.prefs.v437followAutoSubscribe437
    BiliClient.prefs.v437followAutoSubscribe437 = !current
    AppToast.show(this, "Follow Auto Subscribe437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437ForceDecodeHw437Toggle() {
    val current = BiliClient.prefs.v437forceDecodeHw437
    BiliClient.prefs.v437forceDecodeHw437 = !current
    AppToast.show(this, "Force Decode HW437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FormatAutoConvert437Toggle() {
    val current = BiliClient.prefs.v437formatAutoConvert437
    BiliClient.prefs.v437formatAutoConvert437 = !current
    AppToast.show(this, "Format Auto Convert437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FrameInterpolation437Toggle() {
    val current = BiliClient.prefs.v437frameInterpolation437
    BiliClient.prefs.v437frameInterpolation437 = !current
    AppToast.show(this, "Frame Interpolation437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FreeMemoryAuto437Toggle() {
    val current = BiliClient.prefs.v437freeMemoryAuto437
    BiliClient.prefs.v437freeMemoryAuto437 = !current
    AppToast.show(this, "Free Memory Auto437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FreezeOnBuffering437Toggle() {
    val current = BiliClient.prefs.v437freezeOnBuffering437
    BiliClient.prefs.v437freezeOnBuffering437 = !current
    AppToast.show(this, "Freeze On Buffering437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437FullscreenAutoRotate437Toggle() {
    val current = BiliClient.prefs.v437fullscreenAutoRotate437
    BiliClient.prefs.v437fullscreenAutoRotate437 = !current
    AppToast.show(this, "Fullscreen Auto Rotate437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437GainAutoBalance437Toggle() {
    val current = BiliClient.prefs.v437gainAutoBalance437
    BiliClient.prefs.v437gainAutoBalance437 = !current
    AppToast.show(this, "Gain Auto Balance437: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV437GalleryAutoLayout437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v437galleryAutoLayout437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v437galleryAutoLayout437 = value
        AppToast.show(this, "Gallery Auto Layout437: $value")
    }
}

internal fun PlayerActivity.showV438FlashScreenOnNotify438Toggle() {
    val current = BiliClient.prefs.v438flashScreenOnNotify438
    BiliClient.prefs.v438flashScreenOnNotify438 = !current
    AppToast.show(this, "Flash Screen On Notify438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FlexLayoutEnabled438Toggle() {
    val current = BiliClient.prefs.v438flexLayoutEnabled438
    BiliClient.prefs.v438flexLayoutEnabled438 = !current
    AppToast.show(this, "Flex Layout Enabled438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FlipGestureEnabled438Toggle() {
    val current = BiliClient.prefs.v438flipGestureEnabled438
    BiliClient.prefs.v438flipGestureEnabled438 = !current
    AppToast.show(this, "Flip Gesture Enabled438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FlowAutoRedirect438Toggle() {
    val current = BiliClient.prefs.v438flowAutoRedirect438
    BiliClient.prefs.v438flowAutoRedirect438 = !current
    AppToast.show(this, "Flow Auto Redirect438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FlyModeSpeed438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v438flyModeSpeed438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v438flyModeSpeed438 = value
        AppToast.show(this, "Fly Mode Speed438: $value")
    }
}

internal fun PlayerActivity.showV438FocusAutoEnhance438Toggle() {
    val current = BiliClient.prefs.v438focusAutoEnhance438
    BiliClient.prefs.v438focusAutoEnhance438 = !current
    AppToast.show(this, "Focus Auto Enhance438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FollowAutoSubscribe438Toggle() {
    val current = BiliClient.prefs.v438followAutoSubscribe438
    BiliClient.prefs.v438followAutoSubscribe438 = !current
    AppToast.show(this, "Follow Auto Subscribe438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438ForceDecodeHw438Toggle() {
    val current = BiliClient.prefs.v438forceDecodeHw438
    BiliClient.prefs.v438forceDecodeHw438 = !current
    AppToast.show(this, "Force Decode HW438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FormatAutoConvert438Toggle() {
    val current = BiliClient.prefs.v438formatAutoConvert438
    BiliClient.prefs.v438formatAutoConvert438 = !current
    AppToast.show(this, "Format Auto Convert438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FrameInterpolation438Toggle() {
    val current = BiliClient.prefs.v438frameInterpolation438
    BiliClient.prefs.v438frameInterpolation438 = !current
    AppToast.show(this, "Frame Interpolation438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FreeMemoryAuto438Toggle() {
    val current = BiliClient.prefs.v438freeMemoryAuto438
    BiliClient.prefs.v438freeMemoryAuto438 = !current
    AppToast.show(this, "Free Memory Auto438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FreezeOnBuffering438Toggle() {
    val current = BiliClient.prefs.v438freezeOnBuffering438
    BiliClient.prefs.v438freezeOnBuffering438 = !current
    AppToast.show(this, "Freeze On Buffering438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438FullscreenAutoRotate438Toggle() {
    val current = BiliClient.prefs.v438fullscreenAutoRotate438
    BiliClient.prefs.v438fullscreenAutoRotate438 = !current
    AppToast.show(this, "Fullscreen Auto Rotate438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438GainAutoBalance438Toggle() {
    val current = BiliClient.prefs.v438gainAutoBalance438
    BiliClient.prefs.v438gainAutoBalance438 = !current
    AppToast.show(this, "Gain Auto Balance438: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV438GalleryAutoLayout438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v438galleryAutoLayout438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v438galleryAutoLayout438 = value
        AppToast.show(this, "Gallery Auto Layout438: $value")
    }
}

internal fun PlayerActivity.showV439FlashScreenOnNotify439Toggle() {
    val current = BiliClient.prefs.v439flashScreenOnNotify439
    BiliClient.prefs.v439flashScreenOnNotify439 = !current
    AppToast.show(this, "Flash Screen On Notify439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FlexLayoutEnabled439Toggle() {
    val current = BiliClient.prefs.v439flexLayoutEnabled439
    BiliClient.prefs.v439flexLayoutEnabled439 = !current
    AppToast.show(this, "Flex Layout Enabled439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FlipGestureEnabled439Toggle() {
    val current = BiliClient.prefs.v439flipGestureEnabled439
    BiliClient.prefs.v439flipGestureEnabled439 = !current
    AppToast.show(this, "Flip Gesture Enabled439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FlowAutoRedirect439Toggle() {
    val current = BiliClient.prefs.v439flowAutoRedirect439
    BiliClient.prefs.v439flowAutoRedirect439 = !current
    AppToast.show(this, "Flow Auto Redirect439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FlyModeSpeed439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v439flyModeSpeed439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v439flyModeSpeed439 = value
        AppToast.show(this, "Fly Mode Speed439: $value")
    }
}

internal fun PlayerActivity.showV439FocusAutoEnhance439Toggle() {
    val current = BiliClient.prefs.v439focusAutoEnhance439
    BiliClient.prefs.v439focusAutoEnhance439 = !current
    AppToast.show(this, "Focus Auto Enhance439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FollowAutoSubscribe439Toggle() {
    val current = BiliClient.prefs.v439followAutoSubscribe439
    BiliClient.prefs.v439followAutoSubscribe439 = !current
    AppToast.show(this, "Follow Auto Subscribe439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439ForceDecodeHw439Toggle() {
    val current = BiliClient.prefs.v439forceDecodeHw439
    BiliClient.prefs.v439forceDecodeHw439 = !current
    AppToast.show(this, "Force Decode HW439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FormatAutoConvert439Toggle() {
    val current = BiliClient.prefs.v439formatAutoConvert439
    BiliClient.prefs.v439formatAutoConvert439 = !current
    AppToast.show(this, "Format Auto Convert439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FrameInterpolation439Toggle() {
    val current = BiliClient.prefs.v439frameInterpolation439
    BiliClient.prefs.v439frameInterpolation439 = !current
    AppToast.show(this, "Frame Interpolation439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FreeMemoryAuto439Toggle() {
    val current = BiliClient.prefs.v439freeMemoryAuto439
    BiliClient.prefs.v439freeMemoryAuto439 = !current
    AppToast.show(this, "Free Memory Auto439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FreezeOnBuffering439Toggle() {
    val current = BiliClient.prefs.v439freezeOnBuffering439
    BiliClient.prefs.v439freezeOnBuffering439 = !current
    AppToast.show(this, "Freeze On Buffering439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439FullscreenAutoRotate439Toggle() {
    val current = BiliClient.prefs.v439fullscreenAutoRotate439
    BiliClient.prefs.v439fullscreenAutoRotate439 = !current
    AppToast.show(this, "Fullscreen Auto Rotate439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439GainAutoBalance439Toggle() {
    val current = BiliClient.prefs.v439gainAutoBalance439
    BiliClient.prefs.v439gainAutoBalance439 = !current
    AppToast.show(this, "Gain Auto Balance439: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV439GalleryAutoLayout439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v439galleryAutoLayout439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v439galleryAutoLayout439 = value
        AppToast.show(this, "Gallery Auto Layout439: $value")
    }
}

internal fun PlayerActivity.showV440FlashScreenOnNotify440Toggle() {
    val current = BiliClient.prefs.v440flashScreenOnNotify440
    BiliClient.prefs.v440flashScreenOnNotify440 = !current
    AppToast.show(this, "Flash Screen On Notify440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FlexLayoutEnabled440Toggle() {
    val current = BiliClient.prefs.v440flexLayoutEnabled440
    BiliClient.prefs.v440flexLayoutEnabled440 = !current
    AppToast.show(this, "Flex Layout Enabled440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FlipGestureEnabled440Toggle() {
    val current = BiliClient.prefs.v440flipGestureEnabled440
    BiliClient.prefs.v440flipGestureEnabled440 = !current
    AppToast.show(this, "Flip Gesture Enabled440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FlowAutoRedirect440Toggle() {
    val current = BiliClient.prefs.v440flowAutoRedirect440
    BiliClient.prefs.v440flowAutoRedirect440 = !current
    AppToast.show(this, "Flow Auto Redirect440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FlyModeSpeed440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v440flyModeSpeed440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v440flyModeSpeed440 = value
        AppToast.show(this, "Fly Mode Speed440: $value")
    }
}

internal fun PlayerActivity.showV440FocusAutoEnhance440Toggle() {
    val current = BiliClient.prefs.v440focusAutoEnhance440
    BiliClient.prefs.v440focusAutoEnhance440 = !current
    AppToast.show(this, "Focus Auto Enhance440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FollowAutoSubscribe440Toggle() {
    val current = BiliClient.prefs.v440followAutoSubscribe440
    BiliClient.prefs.v440followAutoSubscribe440 = !current
    AppToast.show(this, "Follow Auto Subscribe440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440ForceDecodeHw440Toggle() {
    val current = BiliClient.prefs.v440forceDecodeHw440
    BiliClient.prefs.v440forceDecodeHw440 = !current
    AppToast.show(this, "Force Decode HW440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FormatAutoConvert440Toggle() {
    val current = BiliClient.prefs.v440formatAutoConvert440
    BiliClient.prefs.v440formatAutoConvert440 = !current
    AppToast.show(this, "Format Auto Convert440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FrameInterpolation440Toggle() {
    val current = BiliClient.prefs.v440frameInterpolation440
    BiliClient.prefs.v440frameInterpolation440 = !current
    AppToast.show(this, "Frame Interpolation440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FreeMemoryAuto440Toggle() {
    val current = BiliClient.prefs.v440freeMemoryAuto440
    BiliClient.prefs.v440freeMemoryAuto440 = !current
    AppToast.show(this, "Free Memory Auto440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FreezeOnBuffering440Toggle() {
    val current = BiliClient.prefs.v440freezeOnBuffering440
    BiliClient.prefs.v440freezeOnBuffering440 = !current
    AppToast.show(this, "Freeze On Buffering440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440FullscreenAutoRotate440Toggle() {
    val current = BiliClient.prefs.v440fullscreenAutoRotate440
    BiliClient.prefs.v440fullscreenAutoRotate440 = !current
    AppToast.show(this, "Fullscreen Auto Rotate440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440GainAutoBalance440Toggle() {
    val current = BiliClient.prefs.v440gainAutoBalance440
    BiliClient.prefs.v440gainAutoBalance440 = !current
    AppToast.show(this, "Gain Auto Balance440: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV440GalleryAutoLayout440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v440galleryAutoLayout440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v440galleryAutoLayout440 = value
        AppToast.show(this, "Gallery Auto Layout440: $value")
    }
}

internal fun PlayerActivity.showV441GateAutoAuth441Toggle() {
    val current = BiliClient.prefs.v441gateAutoAuth441
    BiliClient.prefs.v441gateAutoAuth441 = !current
    AppToast.show(this, "Gate Auto Auth441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441GlobalSyncEnabled441Toggle() {
    val current = BiliClient.prefs.v441globalSyncEnabled441
    BiliClient.prefs.v441globalSyncEnabled441 = !current
    AppToast.show(this, "Global Sync Enabled441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441GroupAutoCreate441Toggle() {
    val current = BiliClient.prefs.v441groupAutoCreate441
    BiliClient.prefs.v441groupAutoCreate441 = !current
    AppToast.show(this, "Group Auto Create441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441GrowShrinkEnabled441Toggle() {
    val current = BiliClient.prefs.v441growShrinkEnabled441
    BiliClient.prefs.v441growShrinkEnabled441 = !current
    AppToast.show(this, "Grow Shrink Enabled441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441GuideAutoShow441Toggle() {
    val current = BiliClient.prefs.v441guideAutoShow441
    BiliClient.prefs.v441guideAutoShow441 = !current
    AppToast.show(this, "Guide Auto Show441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HangDetectionMs441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v441hangDetectionMs441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v441hangDetectionMs441 = value
        AppToast.show(this, "Hang Detection Ms441: $value")
    }
}

internal fun PlayerActivity.showV441HashVerifyAuto441Toggle() {
    val current = BiliClient.prefs.v441hashVerifyAuto441
    BiliClient.prefs.v441hashVerifyAuto441 = !current
    AppToast.show(this, "Hash Verify Auto441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HeadPhoneAutoPause441Toggle() {
    val current = BiliClient.prefs.v441headPhoneAutoPause441
    BiliClient.prefs.v441headPhoneAutoPause441 = !current
    AppToast.show(this, "HeadPhone Auto Pause441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HeartBeatInterval441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v441heartBeatInterval441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v441heartBeatInterval441 = value
        AppToast.show(this, "Heart Beat Interval441: $value")
    }
}

internal fun PlayerActivity.showV441HeatMonitorEnabled441Toggle() {
    val current = BiliClient.prefs.v441heatMonitorEnabled441
    BiliClient.prefs.v441heatMonitorEnabled441 = !current
    AppToast.show(this, "Heat Monitor Enabled441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HideOnScroll441Toggle() {
    val current = BiliClient.prefs.v441hideOnScroll441
    BiliClient.prefs.v441hideOnScroll441 = !current
    AppToast.show(this, "Hide On Scroll441: ${if (!current) "ON" else "OFF"}")
}

