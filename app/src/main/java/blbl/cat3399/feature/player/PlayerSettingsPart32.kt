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

// v436: Format Auto Convert436
internal fun PlayerActivity.showV436FormatAutoConvert436Toggle() {
    val current = BiliClient.prefs.v436formatAutoConvert436
    BiliClient.prefs.v436formatAutoConvert436 = !current
    AppToast.show(this, "Format Auto Convert436: ${if (!current) "ON" else "OFF"}")
}

// v436: Frame Interpolation436
internal fun PlayerActivity.showV436FrameInterpolation436Toggle() {
    val current = BiliClient.prefs.v436frameInterpolation436
    BiliClient.prefs.v436frameInterpolation436 = !current
    AppToast.show(this, "Frame Interpolation436: ${if (!current) "ON" else "OFF"}")
}

// v436: Free Memory Auto436
internal fun PlayerActivity.showV436FreeMemoryAuto436Toggle() {
    val current = BiliClient.prefs.v436freeMemoryAuto436
    BiliClient.prefs.v436freeMemoryAuto436 = !current
    AppToast.show(this, "Free Memory Auto436: ${if (!current) "ON" else "OFF"}")
}

// v436: Freeze On Buffering436
internal fun PlayerActivity.showV436FreezeOnBuffering436Toggle() {
    val current = BiliClient.prefs.v436freezeOnBuffering436
    BiliClient.prefs.v436freezeOnBuffering436 = !current
    AppToast.show(this, "Freeze On Buffering436: ${if (!current) "ON" else "OFF"}")
}

// v436: Fullscreen Auto Rotate436
internal fun PlayerActivity.showV436FullscreenAutoRotate436Toggle() {
    val current = BiliClient.prefs.v436fullscreenAutoRotate436
    BiliClient.prefs.v436fullscreenAutoRotate436 = !current
    AppToast.show(this, "Fullscreen Auto Rotate436: ${if (!current) "ON" else "OFF"}")
}

// v436: Gain Auto Balance436
internal fun PlayerActivity.showV436GainAutoBalance436Toggle() {
    val current = BiliClient.prefs.v436gainAutoBalance436
    BiliClient.prefs.v436gainAutoBalance436 = !current
    AppToast.show(this, "Gain Auto Balance436: ${if (!current) "ON" else "OFF"}")
}

// v436: Gallery Auto Layout436
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

// v437: Flash Screen On Notify437
internal fun PlayerActivity.showV437FlashScreenOnNotify437Toggle() {
    val current = BiliClient.prefs.v437flashScreenOnNotify437
    BiliClient.prefs.v437flashScreenOnNotify437 = !current
    AppToast.show(this, "Flash Screen On Notify437: ${if (!current) "ON" else "OFF"}")
}

// v437: Flex Layout Enabled437
internal fun PlayerActivity.showV437FlexLayoutEnabled437Toggle() {
    val current = BiliClient.prefs.v437flexLayoutEnabled437
    BiliClient.prefs.v437flexLayoutEnabled437 = !current
    AppToast.show(this, "Flex Layout Enabled437: ${if (!current) "ON" else "OFF"}")
}

// v437: Flip Gesture Enabled437
internal fun PlayerActivity.showV437FlipGestureEnabled437Toggle() {
    val current = BiliClient.prefs.v437flipGestureEnabled437
    BiliClient.prefs.v437flipGestureEnabled437 = !current
    AppToast.show(this, "Flip Gesture Enabled437: ${if (!current) "ON" else "OFF"}")
}

// v437: Flow Auto Redirect437
internal fun PlayerActivity.showV437FlowAutoRedirect437Toggle() {
    val current = BiliClient.prefs.v437flowAutoRedirect437
    BiliClient.prefs.v437flowAutoRedirect437 = !current
    AppToast.show(this, "Flow Auto Redirect437: ${if (!current) "ON" else "OFF"}")
}

// v437: Fly Mode Speed437
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

// v437: Focus Auto Enhance437
internal fun PlayerActivity.showV437FocusAutoEnhance437Toggle() {
    val current = BiliClient.prefs.v437focusAutoEnhance437
    BiliClient.prefs.v437focusAutoEnhance437 = !current
    AppToast.show(this, "Focus Auto Enhance437: ${if (!current) "ON" else "OFF"}")
}

// v437: Follow Auto Subscribe437
internal fun PlayerActivity.showV437FollowAutoSubscribe437Toggle() {
    val current = BiliClient.prefs.v437followAutoSubscribe437
    BiliClient.prefs.v437followAutoSubscribe437 = !current
    AppToast.show(this, "Follow Auto Subscribe437: ${if (!current) "ON" else "OFF"}")
}

// v437: Force Decode HW437
internal fun PlayerActivity.showV437ForceDecodeHw437Toggle() {
    val current = BiliClient.prefs.v437forceDecodeHw437
    BiliClient.prefs.v437forceDecodeHw437 = !current
    AppToast.show(this, "Force Decode HW437: ${if (!current) "ON" else "OFF"}")
}

// v437: Format Auto Convert437
internal fun PlayerActivity.showV437FormatAutoConvert437Toggle() {
    val current = BiliClient.prefs.v437formatAutoConvert437
    BiliClient.prefs.v437formatAutoConvert437 = !current
    AppToast.show(this, "Format Auto Convert437: ${if (!current) "ON" else "OFF"}")
}

// v437: Frame Interpolation437
internal fun PlayerActivity.showV437FrameInterpolation437Toggle() {
    val current = BiliClient.prefs.v437frameInterpolation437
    BiliClient.prefs.v437frameInterpolation437 = !current
    AppToast.show(this, "Frame Interpolation437: ${if (!current) "ON" else "OFF"}")
}

// v437: Free Memory Auto437
internal fun PlayerActivity.showV437FreeMemoryAuto437Toggle() {
    val current = BiliClient.prefs.v437freeMemoryAuto437
    BiliClient.prefs.v437freeMemoryAuto437 = !current
    AppToast.show(this, "Free Memory Auto437: ${if (!current) "ON" else "OFF"}")
}

// v437: Freeze On Buffering437
internal fun PlayerActivity.showV437FreezeOnBuffering437Toggle() {
    val current = BiliClient.prefs.v437freezeOnBuffering437
    BiliClient.prefs.v437freezeOnBuffering437 = !current
    AppToast.show(this, "Freeze On Buffering437: ${if (!current) "ON" else "OFF"}")
}

// v437: Fullscreen Auto Rotate437
internal fun PlayerActivity.showV437FullscreenAutoRotate437Toggle() {
    val current = BiliClient.prefs.v437fullscreenAutoRotate437
    BiliClient.prefs.v437fullscreenAutoRotate437 = !current
    AppToast.show(this, "Fullscreen Auto Rotate437: ${if (!current) "ON" else "OFF"}")
}

// v437: Gain Auto Balance437
internal fun PlayerActivity.showV437GainAutoBalance437Toggle() {
    val current = BiliClient.prefs.v437gainAutoBalance437
    BiliClient.prefs.v437gainAutoBalance437 = !current
    AppToast.show(this, "Gain Auto Balance437: ${if (!current) "ON" else "OFF"}")
}

// v437: Gallery Auto Layout437
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

// v438: Flash Screen On Notify438
internal fun PlayerActivity.showV438FlashScreenOnNotify438Toggle() {
    val current = BiliClient.prefs.v438flashScreenOnNotify438
    BiliClient.prefs.v438flashScreenOnNotify438 = !current
    AppToast.show(this, "Flash Screen On Notify438: ${if (!current) "ON" else "OFF"}")
}

// v438: Flex Layout Enabled438
internal fun PlayerActivity.showV438FlexLayoutEnabled438Toggle() {
    val current = BiliClient.prefs.v438flexLayoutEnabled438
    BiliClient.prefs.v438flexLayoutEnabled438 = !current
    AppToast.show(this, "Flex Layout Enabled438: ${if (!current) "ON" else "OFF"}")
}

// v438: Flip Gesture Enabled438
internal fun PlayerActivity.showV438FlipGestureEnabled438Toggle() {
    val current = BiliClient.prefs.v438flipGestureEnabled438
    BiliClient.prefs.v438flipGestureEnabled438 = !current
    AppToast.show(this, "Flip Gesture Enabled438: ${if (!current) "ON" else "OFF"}")
}

// v438: Flow Auto Redirect438
internal fun PlayerActivity.showV438FlowAutoRedirect438Toggle() {
    val current = BiliClient.prefs.v438flowAutoRedirect438
    BiliClient.prefs.v438flowAutoRedirect438 = !current
    AppToast.show(this, "Flow Auto Redirect438: ${if (!current) "ON" else "OFF"}")
}

// v438: Fly Mode Speed438
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

// v438: Focus Auto Enhance438
internal fun PlayerActivity.showV438FocusAutoEnhance438Toggle() {
    val current = BiliClient.prefs.v438focusAutoEnhance438
    BiliClient.prefs.v438focusAutoEnhance438 = !current
    AppToast.show(this, "Focus Auto Enhance438: ${if (!current) "ON" else "OFF"}")
}

// v438: Follow Auto Subscribe438
internal fun PlayerActivity.showV438FollowAutoSubscribe438Toggle() {
    val current = BiliClient.prefs.v438followAutoSubscribe438
    BiliClient.prefs.v438followAutoSubscribe438 = !current
    AppToast.show(this, "Follow Auto Subscribe438: ${if (!current) "ON" else "OFF"}")
}

// v438: Force Decode HW438
internal fun PlayerActivity.showV438ForceDecodeHw438Toggle() {
    val current = BiliClient.prefs.v438forceDecodeHw438
    BiliClient.prefs.v438forceDecodeHw438 = !current
    AppToast.show(this, "Force Decode HW438: ${if (!current) "ON" else "OFF"}")
}

// v438: Format Auto Convert438
internal fun PlayerActivity.showV438FormatAutoConvert438Toggle() {
    val current = BiliClient.prefs.v438formatAutoConvert438
    BiliClient.prefs.v438formatAutoConvert438 = !current
    AppToast.show(this, "Format Auto Convert438: ${if (!current) "ON" else "OFF"}")
}

// v438: Frame Interpolation438
internal fun PlayerActivity.showV438FrameInterpolation438Toggle() {
    val current = BiliClient.prefs.v438frameInterpolation438
    BiliClient.prefs.v438frameInterpolation438 = !current
    AppToast.show(this, "Frame Interpolation438: ${if (!current) "ON" else "OFF"}")
}

// v438: Free Memory Auto438
internal fun PlayerActivity.showV438FreeMemoryAuto438Toggle() {
    val current = BiliClient.prefs.v438freeMemoryAuto438
    BiliClient.prefs.v438freeMemoryAuto438 = !current
    AppToast.show(this, "Free Memory Auto438: ${if (!current) "ON" else "OFF"}")
}

// v438: Freeze On Buffering438
internal fun PlayerActivity.showV438FreezeOnBuffering438Toggle() {
    val current = BiliClient.prefs.v438freezeOnBuffering438
    BiliClient.prefs.v438freezeOnBuffering438 = !current
    AppToast.show(this, "Freeze On Buffering438: ${if (!current) "ON" else "OFF"}")
}

// v438: Fullscreen Auto Rotate438
internal fun PlayerActivity.showV438FullscreenAutoRotate438Toggle() {
    val current = BiliClient.prefs.v438fullscreenAutoRotate438
    BiliClient.prefs.v438fullscreenAutoRotate438 = !current
    AppToast.show(this, "Fullscreen Auto Rotate438: ${if (!current) "ON" else "OFF"}")
}

// v438: Gain Auto Balance438
internal fun PlayerActivity.showV438GainAutoBalance438Toggle() {
    val current = BiliClient.prefs.v438gainAutoBalance438
    BiliClient.prefs.v438gainAutoBalance438 = !current
    AppToast.show(this, "Gain Auto Balance438: ${if (!current) "ON" else "OFF"}")
}

// v438: Gallery Auto Layout438
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

// v439: Flash Screen On Notify439
internal fun PlayerActivity.showV439FlashScreenOnNotify439Toggle() {
    val current = BiliClient.prefs.v439flashScreenOnNotify439
    BiliClient.prefs.v439flashScreenOnNotify439 = !current
    AppToast.show(this, "Flash Screen On Notify439: ${if (!current) "ON" else "OFF"}")
}

// v439: Flex Layout Enabled439
internal fun PlayerActivity.showV439FlexLayoutEnabled439Toggle() {
    val current = BiliClient.prefs.v439flexLayoutEnabled439
    BiliClient.prefs.v439flexLayoutEnabled439 = !current
    AppToast.show(this, "Flex Layout Enabled439: ${if (!current) "ON" else "OFF"}")
}

// v439: Flip Gesture Enabled439
internal fun PlayerActivity.showV439FlipGestureEnabled439Toggle() {
    val current = BiliClient.prefs.v439flipGestureEnabled439
    BiliClient.prefs.v439flipGestureEnabled439 = !current
    AppToast.show(this, "Flip Gesture Enabled439: ${if (!current) "ON" else "OFF"}")
}

// v439: Flow Auto Redirect439
internal fun PlayerActivity.showV439FlowAutoRedirect439Toggle() {
    val current = BiliClient.prefs.v439flowAutoRedirect439
    BiliClient.prefs.v439flowAutoRedirect439 = !current
    AppToast.show(this, "Flow Auto Redirect439: ${if (!current) "ON" else "OFF"}")
}

// v439: Fly Mode Speed439
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

// v439: Focus Auto Enhance439
internal fun PlayerActivity.showV439FocusAutoEnhance439Toggle() {
    val current = BiliClient.prefs.v439focusAutoEnhance439
    BiliClient.prefs.v439focusAutoEnhance439 = !current
    AppToast.show(this, "Focus Auto Enhance439: ${if (!current) "ON" else "OFF"}")
}

// v439: Follow Auto Subscribe439
internal fun PlayerActivity.showV439FollowAutoSubscribe439Toggle() {
    val current = BiliClient.prefs.v439followAutoSubscribe439
    BiliClient.prefs.v439followAutoSubscribe439 = !current
    AppToast.show(this, "Follow Auto Subscribe439: ${if (!current) "ON" else "OFF"}")
}

// v439: Force Decode HW439
internal fun PlayerActivity.showV439ForceDecodeHw439Toggle() {
    val current = BiliClient.prefs.v439forceDecodeHw439
    BiliClient.prefs.v439forceDecodeHw439 = !current
    AppToast.show(this, "Force Decode HW439: ${if (!current) "ON" else "OFF"}")
}

// v439: Format Auto Convert439
internal fun PlayerActivity.showV439FormatAutoConvert439Toggle() {
    val current = BiliClient.prefs.v439formatAutoConvert439
    BiliClient.prefs.v439formatAutoConvert439 = !current
    AppToast.show(this, "Format Auto Convert439: ${if (!current) "ON" else "OFF"}")
}

// v439: Frame Interpolation439
internal fun PlayerActivity.showV439FrameInterpolation439Toggle() {
    val current = BiliClient.prefs.v439frameInterpolation439
    BiliClient.prefs.v439frameInterpolation439 = !current
    AppToast.show(this, "Frame Interpolation439: ${if (!current) "ON" else "OFF"}")
}

// v439: Free Memory Auto439
internal fun PlayerActivity.showV439FreeMemoryAuto439Toggle() {
    val current = BiliClient.prefs.v439freeMemoryAuto439
    BiliClient.prefs.v439freeMemoryAuto439 = !current
    AppToast.show(this, "Free Memory Auto439: ${if (!current) "ON" else "OFF"}")
}

// v439: Freeze On Buffering439
internal fun PlayerActivity.showV439FreezeOnBuffering439Toggle() {
    val current = BiliClient.prefs.v439freezeOnBuffering439
    BiliClient.prefs.v439freezeOnBuffering439 = !current
    AppToast.show(this, "Freeze On Buffering439: ${if (!current) "ON" else "OFF"}")
}

// v439: Fullscreen Auto Rotate439
internal fun PlayerActivity.showV439FullscreenAutoRotate439Toggle() {
    val current = BiliClient.prefs.v439fullscreenAutoRotate439
    BiliClient.prefs.v439fullscreenAutoRotate439 = !current
    AppToast.show(this, "Fullscreen Auto Rotate439: ${if (!current) "ON" else "OFF"}")
}

// v439: Gain Auto Balance439
internal fun PlayerActivity.showV439GainAutoBalance439Toggle() {
    val current = BiliClient.prefs.v439gainAutoBalance439
    BiliClient.prefs.v439gainAutoBalance439 = !current
    AppToast.show(this, "Gain Auto Balance439: ${if (!current) "ON" else "OFF"}")
}

// v439: Gallery Auto Layout439
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

// v440: Flash Screen On Notify440
internal fun PlayerActivity.showV440FlashScreenOnNotify440Toggle() {
    val current = BiliClient.prefs.v440flashScreenOnNotify440
    BiliClient.prefs.v440flashScreenOnNotify440 = !current
    AppToast.show(this, "Flash Screen On Notify440: ${if (!current) "ON" else "OFF"}")
}

// v440: Flex Layout Enabled440
internal fun PlayerActivity.showV440FlexLayoutEnabled440Toggle() {
    val current = BiliClient.prefs.v440flexLayoutEnabled440
    BiliClient.prefs.v440flexLayoutEnabled440 = !current
    AppToast.show(this, "Flex Layout Enabled440: ${if (!current) "ON" else "OFF"}")
}

// v440: Flip Gesture Enabled440
internal fun PlayerActivity.showV440FlipGestureEnabled440Toggle() {
    val current = BiliClient.prefs.v440flipGestureEnabled440
    BiliClient.prefs.v440flipGestureEnabled440 = !current
    AppToast.show(this, "Flip Gesture Enabled440: ${if (!current) "ON" else "OFF"}")
}

// v440: Flow Auto Redirect440
internal fun PlayerActivity.showV440FlowAutoRedirect440Toggle() {
    val current = BiliClient.prefs.v440flowAutoRedirect440
    BiliClient.prefs.v440flowAutoRedirect440 = !current
    AppToast.show(this, "Flow Auto Redirect440: ${if (!current) "ON" else "OFF"}")
}

// v440: Fly Mode Speed440
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

// v440: Focus Auto Enhance440
internal fun PlayerActivity.showV440FocusAutoEnhance440Toggle() {
    val current = BiliClient.prefs.v440focusAutoEnhance440
    BiliClient.prefs.v440focusAutoEnhance440 = !current
    AppToast.show(this, "Focus Auto Enhance440: ${if (!current) "ON" else "OFF"}")
}

// v440: Follow Auto Subscribe440
internal fun PlayerActivity.showV440FollowAutoSubscribe440Toggle() {
    val current = BiliClient.prefs.v440followAutoSubscribe440
    BiliClient.prefs.v440followAutoSubscribe440 = !current
    AppToast.show(this, "Follow Auto Subscribe440: ${if (!current) "ON" else "OFF"}")
}

// v440: Force Decode HW440
internal fun PlayerActivity.showV440ForceDecodeHw440Toggle() {
    val current = BiliClient.prefs.v440forceDecodeHw440
    BiliClient.prefs.v440forceDecodeHw440 = !current
    AppToast.show(this, "Force Decode HW440: ${if (!current) "ON" else "OFF"}")
}

// v440: Format Auto Convert440
internal fun PlayerActivity.showV440FormatAutoConvert440Toggle() {
    val current = BiliClient.prefs.v440formatAutoConvert440
    BiliClient.prefs.v440formatAutoConvert440 = !current
    AppToast.show(this, "Format Auto Convert440: ${if (!current) "ON" else "OFF"}")
}

// v440: Frame Interpolation440
internal fun PlayerActivity.showV440FrameInterpolation440Toggle() {
    val current = BiliClient.prefs.v440frameInterpolation440
    BiliClient.prefs.v440frameInterpolation440 = !current
    AppToast.show(this, "Frame Interpolation440: ${if (!current) "ON" else "OFF"}")
}

// v440: Free Memory Auto440
internal fun PlayerActivity.showV440FreeMemoryAuto440Toggle() {
    val current = BiliClient.prefs.v440freeMemoryAuto440
    BiliClient.prefs.v440freeMemoryAuto440 = !current
    AppToast.show(this, "Free Memory Auto440: ${if (!current) "ON" else "OFF"}")
}

// v440: Freeze On Buffering440
internal fun PlayerActivity.showV440FreezeOnBuffering440Toggle() {
    val current = BiliClient.prefs.v440freezeOnBuffering440
    BiliClient.prefs.v440freezeOnBuffering440 = !current
    AppToast.show(this, "Freeze On Buffering440: ${if (!current) "ON" else "OFF"}")
}

// v440: Fullscreen Auto Rotate440
internal fun PlayerActivity.showV440FullscreenAutoRotate440Toggle() {
    val current = BiliClient.prefs.v440fullscreenAutoRotate440
    BiliClient.prefs.v440fullscreenAutoRotate440 = !current
    AppToast.show(this, "Fullscreen Auto Rotate440: ${if (!current) "ON" else "OFF"}")
}

// v440: Gain Auto Balance440
internal fun PlayerActivity.showV440GainAutoBalance440Toggle() {
    val current = BiliClient.prefs.v440gainAutoBalance440
    BiliClient.prefs.v440gainAutoBalance440 = !current
    AppToast.show(this, "Gain Auto Balance440: ${if (!current) "ON" else "OFF"}")
}

// v440: Gallery Auto Layout440
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

// v441: Gate Auto Auth441
internal fun PlayerActivity.showV441GateAutoAuth441Toggle() {
    val current = BiliClient.prefs.v441gateAutoAuth441
    BiliClient.prefs.v441gateAutoAuth441 = !current
    AppToast.show(this, "Gate Auto Auth441: ${if (!current) "ON" else "OFF"}")
}

// v441: Global Sync Enabled441
internal fun PlayerActivity.showV441GlobalSyncEnabled441Toggle() {
    val current = BiliClient.prefs.v441globalSyncEnabled441
    BiliClient.prefs.v441globalSyncEnabled441 = !current
    AppToast.show(this, "Global Sync Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Group Auto Create441
internal fun PlayerActivity.showV441GroupAutoCreate441Toggle() {
    val current = BiliClient.prefs.v441groupAutoCreate441
    BiliClient.prefs.v441groupAutoCreate441 = !current
    AppToast.show(this, "Group Auto Create441: ${if (!current) "ON" else "OFF"}")
}

// v441: Grow Shrink Enabled441
internal fun PlayerActivity.showV441GrowShrinkEnabled441Toggle() {
    val current = BiliClient.prefs.v441growShrinkEnabled441
    BiliClient.prefs.v441growShrinkEnabled441 = !current
    AppToast.show(this, "Grow Shrink Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Guide Auto Show441
internal fun PlayerActivity.showV441GuideAutoShow441Toggle() {
    val current = BiliClient.prefs.v441guideAutoShow441
    BiliClient.prefs.v441guideAutoShow441 = !current
    AppToast.show(this, "Guide Auto Show441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hang Detection Ms441
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

// v441: Hash Verify Auto441
internal fun PlayerActivity.showV441HashVerifyAuto441Toggle() {
    val current = BiliClient.prefs.v441hashVerifyAuto441
    BiliClient.prefs.v441hashVerifyAuto441 = !current
    AppToast.show(this, "Hash Verify Auto441: ${if (!current) "ON" else "OFF"}")
}

// v441: HeadPhone Auto Pause441
internal fun PlayerActivity.showV441HeadPhoneAutoPause441Toggle() {
    val current = BiliClient.prefs.v441headPhoneAutoPause441
    BiliClient.prefs.v441headPhoneAutoPause441 = !current
    AppToast.show(this, "HeadPhone Auto Pause441: ${if (!current) "ON" else "OFF"}")
}

// v441: Heart Beat Interval441
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

// v441: Heat Monitor Enabled441
internal fun PlayerActivity.showV441HeatMonitorEnabled441Toggle() {
    val current = BiliClient.prefs.v441heatMonitorEnabled441
    BiliClient.prefs.v441heatMonitorEnabled441 = !current
    AppToast.show(this, "Heat Monitor Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hide On Scroll441
internal fun PlayerActivity.showV441HideOnScroll441Toggle() {
    val current = BiliClient.prefs.v441hideOnScroll441
    BiliClient.prefs.v441hideOnScroll441 = !current
    AppToast.show(this, "Hide On Scroll441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hold To Fast Forward441
internal fun PlayerActivity.showV441HoldToFastForward441Toggle() {
    val current = BiliClient.prefs.v441holdToFastForward441
    BiliClient.prefs.v441holdToFastForward441 = !current
    AppToast.show(this, "Hold To Fast Forward441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hook Auto Register441
internal fun PlayerActivity.showV441HookAutoRegister441Toggle() {
    val current = BiliClient.prefs.v441hookAutoRegister441
    BiliClient.prefs.v441hookAutoRegister441 = !current
    AppToast.show(this, "Hook Auto Register441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hot Reload Enabled441
internal fun PlayerActivity.showV441HotReloadEnabled441Toggle() {
    val current = BiliClient.prefs.v441hotReloadEnabled441
    BiliClient.prefs.v441hotReloadEnabled441 = !current
    AppToast.show(this, "Hot Reload Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hub Auto Discover441
internal fun PlayerActivity.showV441HubAutoDiscover441Toggle() {
    val current = BiliClient.prefs.v441hubAutoDiscover441
    BiliClient.prefs.v441hubAutoDiscover441 = !current
    AppToast.show(this, "Hub Auto Discover441: ${if (!current) "ON" else "OFF"}")
}

// v442: Gate Auto Auth442
internal fun PlayerActivity.showV442GateAutoAuth442Toggle() {
    val current = BiliClient.prefs.v442gateAutoAuth442
    BiliClient.prefs.v442gateAutoAuth442 = !current
    AppToast.show(this, "Gate Auto Auth442: ${if (!current) "ON" else "OFF"}")
}

// v442: Global Sync Enabled442
internal fun PlayerActivity.showV442GlobalSyncEnabled442Toggle() {
    val current = BiliClient.prefs.v442globalSyncEnabled442
    BiliClient.prefs.v442globalSyncEnabled442 = !current
    AppToast.show(this, "Global Sync Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Group Auto Create442
internal fun PlayerActivity.showV442GroupAutoCreate442Toggle() {
    val current = BiliClient.prefs.v442groupAutoCreate442
    BiliClient.prefs.v442groupAutoCreate442 = !current
    AppToast.show(this, "Group Auto Create442: ${if (!current) "ON" else "OFF"}")
}

// v442: Grow Shrink Enabled442
internal fun PlayerActivity.showV442GrowShrinkEnabled442Toggle() {
    val current = BiliClient.prefs.v442growShrinkEnabled442
    BiliClient.prefs.v442growShrinkEnabled442 = !current
    AppToast.show(this, "Grow Shrink Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Guide Auto Show442
internal fun PlayerActivity.showV442GuideAutoShow442Toggle() {
    val current = BiliClient.prefs.v442guideAutoShow442
    BiliClient.prefs.v442guideAutoShow442 = !current
    AppToast.show(this, "Guide Auto Show442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hang Detection Ms442
internal fun PlayerActivity.showV442HangDetectionMs442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v442hangDetectionMs442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v442hangDetectionMs442 = value
        AppToast.show(this, "Hang Detection Ms442: $value")
    }
}

// v442: Hash Verify Auto442
internal fun PlayerActivity.showV442HashVerifyAuto442Toggle() {
    val current = BiliClient.prefs.v442hashVerifyAuto442
    BiliClient.prefs.v442hashVerifyAuto442 = !current
    AppToast.show(this, "Hash Verify Auto442: ${if (!current) "ON" else "OFF"}")
}

// v442: HeadPhone Auto Pause442
internal fun PlayerActivity.showV442HeadPhoneAutoPause442Toggle() {
    val current = BiliClient.prefs.v442headPhoneAutoPause442
    BiliClient.prefs.v442headPhoneAutoPause442 = !current
    AppToast.show(this, "HeadPhone Auto Pause442: ${if (!current) "ON" else "OFF"}")
}

// v442: Heart Beat Interval442
internal fun PlayerActivity.showV442HeartBeatInterval442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v442heartBeatInterval442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v442heartBeatInterval442 = value
        AppToast.show(this, "Heart Beat Interval442: $value")
    }
}

// v442: Heat Monitor Enabled442
internal fun PlayerActivity.showV442HeatMonitorEnabled442Toggle() {
    val current = BiliClient.prefs.v442heatMonitorEnabled442
    BiliClient.prefs.v442heatMonitorEnabled442 = !current
    AppToast.show(this, "Heat Monitor Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hide On Scroll442
internal fun PlayerActivity.showV442HideOnScroll442Toggle() {
    val current = BiliClient.prefs.v442hideOnScroll442
    BiliClient.prefs.v442hideOnScroll442 = !current
    AppToast.show(this, "Hide On Scroll442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hold To Fast Forward442
internal fun PlayerActivity.showV442HoldToFastForward442Toggle() {
    val current = BiliClient.prefs.v442holdToFastForward442
    BiliClient.prefs.v442holdToFastForward442 = !current
    AppToast.show(this, "Hold To Fast Forward442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hook Auto Register442
internal fun PlayerActivity.showV442HookAutoRegister442Toggle() {
    val current = BiliClient.prefs.v442hookAutoRegister442
    BiliClient.prefs.v442hookAutoRegister442 = !current
    AppToast.show(this, "Hook Auto Register442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hot Reload Enabled442
internal fun PlayerActivity.showV442HotReloadEnabled442Toggle() {
    val current = BiliClient.prefs.v442hotReloadEnabled442
    BiliClient.prefs.v442hotReloadEnabled442 = !current
    AppToast.show(this, "Hot Reload Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hub Auto Discover442
internal fun PlayerActivity.showV442HubAutoDiscover442Toggle() {
    val current = BiliClient.prefs.v442hubAutoDiscover442
    BiliClient.prefs.v442hubAutoDiscover442 = !current
    AppToast.show(this, "Hub Auto Discover442: ${if (!current) "ON" else "OFF"}")
}

// v443: Gate Auto Auth443
internal fun PlayerActivity.showV443GateAutoAuth443Toggle() {
    val current = BiliClient.prefs.v443gateAutoAuth443
    BiliClient.prefs.v443gateAutoAuth443 = !current
    AppToast.show(this, "Gate Auto Auth443: ${if (!current) "ON" else "OFF"}")
}

// v443: Global Sync Enabled443
internal fun PlayerActivity.showV443GlobalSyncEnabled443Toggle() {
    val current = BiliClient.prefs.v443globalSyncEnabled443
    BiliClient.prefs.v443globalSyncEnabled443 = !current
    AppToast.show(this, "Global Sync Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Group Auto Create443
internal fun PlayerActivity.showV443GroupAutoCreate443Toggle() {
    val current = BiliClient.prefs.v443groupAutoCreate443
    BiliClient.prefs.v443groupAutoCreate443 = !current
    AppToast.show(this, "Group Auto Create443: ${if (!current) "ON" else "OFF"}")
}

// v443: Grow Shrink Enabled443
internal fun PlayerActivity.showV443GrowShrinkEnabled443Toggle() {
    val current = BiliClient.prefs.v443growShrinkEnabled443
    BiliClient.prefs.v443growShrinkEnabled443 = !current
    AppToast.show(this, "Grow Shrink Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Guide Auto Show443
internal fun PlayerActivity.showV443GuideAutoShow443Toggle() {
    val current = BiliClient.prefs.v443guideAutoShow443
    BiliClient.prefs.v443guideAutoShow443 = !current
    AppToast.show(this, "Guide Auto Show443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hang Detection Ms443
internal fun PlayerActivity.showV443HangDetectionMs443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v443hangDetectionMs443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v443hangDetectionMs443 = value
        AppToast.show(this, "Hang Detection Ms443: $value")
    }
}

// v443: Hash Verify Auto443
internal fun PlayerActivity.showV443HashVerifyAuto443Toggle() {
    val current = BiliClient.prefs.v443hashVerifyAuto443
    BiliClient.prefs.v443hashVerifyAuto443 = !current
    AppToast.show(this, "Hash Verify Auto443: ${if (!current) "ON" else "OFF"}")
}

// v443: HeadPhone Auto Pause443
internal fun PlayerActivity.showV443HeadPhoneAutoPause443Toggle() {
    val current = BiliClient.prefs.v443headPhoneAutoPause443
    BiliClient.prefs.v443headPhoneAutoPause443 = !current
    AppToast.show(this, "HeadPhone Auto Pause443: ${if (!current) "ON" else "OFF"}")
}

// v443: Heart Beat Interval443
internal fun PlayerActivity.showV443HeartBeatInterval443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v443heartBeatInterval443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v443heartBeatInterval443 = value
        AppToast.show(this, "Heart Beat Interval443: $value")
    }
}

// v443: Heat Monitor Enabled443
internal fun PlayerActivity.showV443HeatMonitorEnabled443Toggle() {
    val current = BiliClient.prefs.v443heatMonitorEnabled443
    BiliClient.prefs.v443heatMonitorEnabled443 = !current
    AppToast.show(this, "Heat Monitor Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hide On Scroll443
internal fun PlayerActivity.showV443HideOnScroll443Toggle() {
    val current = BiliClient.prefs.v443hideOnScroll443
    BiliClient.prefs.v443hideOnScroll443 = !current
    AppToast.show(this, "Hide On Scroll443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hold To Fast Forward443
internal fun PlayerActivity.showV443HoldToFastForward443Toggle() {
    val current = BiliClient.prefs.v443holdToFastForward443
    BiliClient.prefs.v443holdToFastForward443 = !current
    AppToast.show(this, "Hold To Fast Forward443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hook Auto Register443
internal fun PlayerActivity.showV443HookAutoRegister443Toggle() {
    val current = BiliClient.prefs.v443hookAutoRegister443
    BiliClient.prefs.v443hookAutoRegister443 = !current
    AppToast.show(this, "Hook Auto Register443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hot Reload Enabled443
internal fun PlayerActivity.showV443HotReloadEnabled443Toggle() {
    val current = BiliClient.prefs.v443hotReloadEnabled443
    BiliClient.prefs.v443hotReloadEnabled443 = !current
    AppToast.show(this, "Hot Reload Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hub Auto Discover443
internal fun PlayerActivity.showV443HubAutoDiscover443Toggle() {
    val current = BiliClient.prefs.v443hubAutoDiscover443
    BiliClient.prefs.v443hubAutoDiscover443 = !current
    AppToast.show(this, "Hub Auto Discover443: ${if (!current) "ON" else "OFF"}")
}

// v444: Gate Auto Auth444
internal fun PlayerActivity.showV444GateAutoAuth444Toggle() {
    val current = BiliClient.prefs.v444gateAutoAuth444
    BiliClient.prefs.v444gateAutoAuth444 = !current
    AppToast.show(this, "Gate Auto Auth444: ${if (!current) "ON" else "OFF"}")
}

// v444: Global Sync Enabled444
internal fun PlayerActivity.showV444GlobalSyncEnabled444Toggle() {
    val current = BiliClient.prefs.v444globalSyncEnabled444
    BiliClient.prefs.v444globalSyncEnabled444 = !current
    AppToast.show(this, "Global Sync Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Group Auto Create444
internal fun PlayerActivity.showV444GroupAutoCreate444Toggle() {
    val current = BiliClient.prefs.v444groupAutoCreate444
    BiliClient.prefs.v444groupAutoCreate444 = !current
    AppToast.show(this, "Group Auto Create444: ${if (!current) "ON" else "OFF"}")
}

// v444: Grow Shrink Enabled444
internal fun PlayerActivity.showV444GrowShrinkEnabled444Toggle() {
    val current = BiliClient.prefs.v444growShrinkEnabled444
    BiliClient.prefs.v444growShrinkEnabled444 = !current
    AppToast.show(this, "Grow Shrink Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Guide Auto Show444
internal fun PlayerActivity.showV444GuideAutoShow444Toggle() {
    val current = BiliClient.prefs.v444guideAutoShow444
    BiliClient.prefs.v444guideAutoShow444 = !current
    AppToast.show(this, "Guide Auto Show444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hang Detection Ms444
internal fun PlayerActivity.showV444HangDetectionMs444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v444hangDetectionMs444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v444hangDetectionMs444 = value
        AppToast.show(this, "Hang Detection Ms444: $value")
    }
}

// v444: Hash Verify Auto444
internal fun PlayerActivity.showV444HashVerifyAuto444Toggle() {
    val current = BiliClient.prefs.v444hashVerifyAuto444
    BiliClient.prefs.v444hashVerifyAuto444 = !current
    AppToast.show(this, "Hash Verify Auto444: ${if (!current) "ON" else "OFF"}")
}

// v444: HeadPhone Auto Pause444
internal fun PlayerActivity.showV444HeadPhoneAutoPause444Toggle() {
    val current = BiliClient.prefs.v444headPhoneAutoPause444
    BiliClient.prefs.v444headPhoneAutoPause444 = !current
    AppToast.show(this, "HeadPhone Auto Pause444: ${if (!current) "ON" else "OFF"}")
}

// v444: Heart Beat Interval444
internal fun PlayerActivity.showV444HeartBeatInterval444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v444heartBeatInterval444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v444heartBeatInterval444 = value
        AppToast.show(this, "Heart Beat Interval444: $value")
    }
}

// v444: Heat Monitor Enabled444
internal fun PlayerActivity.showV444HeatMonitorEnabled444Toggle() {
    val current = BiliClient.prefs.v444heatMonitorEnabled444
    BiliClient.prefs.v444heatMonitorEnabled444 = !current
    AppToast.show(this, "Heat Monitor Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hide On Scroll444
internal fun PlayerActivity.showV444HideOnScroll444Toggle() {
    val current = BiliClient.prefs.v444hideOnScroll444
    BiliClient.prefs.v444hideOnScroll444 = !current
    AppToast.show(this, "Hide On Scroll444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hold To Fast Forward444
internal fun PlayerActivity.showV444HoldToFastForward444Toggle() {
    val current = BiliClient.prefs.v444holdToFastForward444
    BiliClient.prefs.v444holdToFastForward444 = !current
    AppToast.show(this, "Hold To Fast Forward444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hook Auto Register444
internal fun PlayerActivity.showV444HookAutoRegister444Toggle() {
    val current = BiliClient.prefs.v444hookAutoRegister444
    BiliClient.prefs.v444hookAutoRegister444 = !current
    AppToast.show(this, "Hook Auto Register444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hot Reload Enabled444
internal fun PlayerActivity.showV444HotReloadEnabled444Toggle() {
    val current = BiliClient.prefs.v444hotReloadEnabled444
    BiliClient.prefs.v444hotReloadEnabled444 = !current
    AppToast.show(this, "Hot Reload Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hub Auto Discover444
internal fun PlayerActivity.showV444HubAutoDiscover444Toggle() {
    val current = BiliClient.prefs.v444hubAutoDiscover444
    BiliClient.prefs.v444hubAutoDiscover444 = !current
    AppToast.show(this, "Hub Auto Discover444: ${if (!current) "ON" else "OFF"}")
}

// v445: Gate Auto Auth445
internal fun PlayerActivity.showV445GateAutoAuth445Toggle() {
    val current = BiliClient.prefs.v445gateAutoAuth445
    BiliClient.prefs.v445gateAutoAuth445 = !current
    AppToast.show(this, "Gate Auto Auth445: ${if (!current) "ON" else "OFF"}")
}

// v445: Global Sync Enabled445
internal fun PlayerActivity.showV445GlobalSyncEnabled445Toggle() {
    val current = BiliClient.prefs.v445globalSyncEnabled445
    BiliClient.prefs.v445globalSyncEnabled445 = !current
    AppToast.show(this, "Global Sync Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Group Auto Create445
internal fun PlayerActivity.showV445GroupAutoCreate445Toggle() {
    val current = BiliClient.prefs.v445groupAutoCreate445
    BiliClient.prefs.v445groupAutoCreate445 = !current
    AppToast.show(this, "Group Auto Create445: ${if (!current) "ON" else "OFF"}")
}

// v445: Grow Shrink Enabled445
internal fun PlayerActivity.showV445GrowShrinkEnabled445Toggle() {
    val current = BiliClient.prefs.v445growShrinkEnabled445
    BiliClient.prefs.v445growShrinkEnabled445 = !current
    AppToast.show(this, "Grow Shrink Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Guide Auto Show445
internal fun PlayerActivity.showV445GuideAutoShow445Toggle() {
    val current = BiliClient.prefs.v445guideAutoShow445
    BiliClient.prefs.v445guideAutoShow445 = !current
    AppToast.show(this, "Guide Auto Show445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hang Detection Ms445
internal fun PlayerActivity.showV445HangDetectionMs445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v445hangDetectionMs445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v445hangDetectionMs445 = value
        AppToast.show(this, "Hang Detection Ms445: $value")
    }
}

// v445: Hash Verify Auto445
internal fun PlayerActivity.showV445HashVerifyAuto445Toggle() {
    val current = BiliClient.prefs.v445hashVerifyAuto445
    BiliClient.prefs.v445hashVerifyAuto445 = !current
    AppToast.show(this, "Hash Verify Auto445: ${if (!current) "ON" else "OFF"}")
}

// v445: HeadPhone Auto Pause445
internal fun PlayerActivity.showV445HeadPhoneAutoPause445Toggle() {
    val current = BiliClient.prefs.v445headPhoneAutoPause445
    BiliClient.prefs.v445headPhoneAutoPause445 = !current
    AppToast.show(this, "HeadPhone Auto Pause445: ${if (!current) "ON" else "OFF"}")
}

// v445: Heart Beat Interval445
internal fun PlayerActivity.showV445HeartBeatInterval445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v445heartBeatInterval445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v445heartBeatInterval445 = value
        AppToast.show(this, "Heart Beat Interval445: $value")
    }
}

// v445: Heat Monitor Enabled445
internal fun PlayerActivity.showV445HeatMonitorEnabled445Toggle() {
    val current = BiliClient.prefs.v445heatMonitorEnabled445
    BiliClient.prefs.v445heatMonitorEnabled445 = !current
    AppToast.show(this, "Heat Monitor Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hide On Scroll445
internal fun PlayerActivity.showV445HideOnScroll445Toggle() {
    val current = BiliClient.prefs.v445hideOnScroll445
    BiliClient.prefs.v445hideOnScroll445 = !current
    AppToast.show(this, "Hide On Scroll445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hold To Fast Forward445
internal fun PlayerActivity.showV445HoldToFastForward445Toggle() {
    val current = BiliClient.prefs.v445holdToFastForward445
    BiliClient.prefs.v445holdToFastForward445 = !current
    AppToast.show(this, "Hold To Fast Forward445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hook Auto Register445
internal fun PlayerActivity.showV445HookAutoRegister445Toggle() {
    val current = BiliClient.prefs.v445hookAutoRegister445
    BiliClient.prefs.v445hookAutoRegister445 = !current
    AppToast.show(this, "Hook Auto Register445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hot Reload Enabled445
internal fun PlayerActivity.showV445HotReloadEnabled445Toggle() {
    val current = BiliClient.prefs.v445hotReloadEnabled445
    BiliClient.prefs.v445hotReloadEnabled445 = !current
    AppToast.show(this, "Hot Reload Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hub Auto Discover445
internal fun PlayerActivity.showV445HubAutoDiscover445Toggle() {
    val current = BiliClient.prefs.v445hubAutoDiscover445
    BiliClient.prefs.v445hubAutoDiscover445 = !current
    AppToast.show(this, "Hub Auto Discover445: ${if (!current) "ON" else "OFF"}")
}

// v446: Gate Auto Auth446
internal fun PlayerActivity.showV446GateAutoAuth446Toggle() {
    val current = BiliClient.prefs.v446gateAutoAuth446
    BiliClient.prefs.v446gateAutoAuth446 = !current
    AppToast.show(this, "Gate Auto Auth446: ${if (!current) "ON" else "OFF"}")
}

// v446: Global Sync Enabled446
internal fun PlayerActivity.showV446GlobalSyncEnabled446Toggle() {
    val current = BiliClient.prefs.v446globalSyncEnabled446
    BiliClient.prefs.v446globalSyncEnabled446 = !current
    AppToast.show(this, "Global Sync Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Group Auto Create446
internal fun PlayerActivity.showV446GroupAutoCreate446Toggle() {
    val current = BiliClient.prefs.v446groupAutoCreate446
    BiliClient.prefs.v446groupAutoCreate446 = !current
    AppToast.show(this, "Group Auto Create446: ${if (!current) "ON" else "OFF"}")
}

// v446: Grow Shrink Enabled446
internal fun PlayerActivity.showV446GrowShrinkEnabled446Toggle() {
    val current = BiliClient.prefs.v446growShrinkEnabled446
    BiliClient.prefs.v446growShrinkEnabled446 = !current
    AppToast.show(this, "Grow Shrink Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Guide Auto Show446
internal fun PlayerActivity.showV446GuideAutoShow446Toggle() {
    val current = BiliClient.prefs.v446guideAutoShow446
    BiliClient.prefs.v446guideAutoShow446 = !current
    AppToast.show(this, "Guide Auto Show446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hang Detection Ms446
internal fun PlayerActivity.showV446HangDetectionMs446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v446hangDetectionMs446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v446hangDetectionMs446 = value
        AppToast.show(this, "Hang Detection Ms446: $value")
    }
}

// v446: Hash Verify Auto446
internal fun PlayerActivity.showV446HashVerifyAuto446Toggle() {
    val current = BiliClient.prefs.v446hashVerifyAuto446
    BiliClient.prefs.v446hashVerifyAuto446 = !current
    AppToast.show(this, "Hash Verify Auto446: ${if (!current) "ON" else "OFF"}")
}

// v446: HeadPhone Auto Pause446
internal fun PlayerActivity.showV446HeadPhoneAutoPause446Toggle() {
    val current = BiliClient.prefs.v446headPhoneAutoPause446
    BiliClient.prefs.v446headPhoneAutoPause446 = !current
    AppToast.show(this, "HeadPhone Auto Pause446: ${if (!current) "ON" else "OFF"}")
}

// v446: Heart Beat Interval446
internal fun PlayerActivity.showV446HeartBeatInterval446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v446heartBeatInterval446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v446heartBeatInterval446 = value
        AppToast.show(this, "Heart Beat Interval446: $value")
    }
}

// v446: Heat Monitor Enabled446
internal fun PlayerActivity.showV446HeatMonitorEnabled446Toggle() {
    val current = BiliClient.prefs.v446heatMonitorEnabled446
    BiliClient.prefs.v446heatMonitorEnabled446 = !current
    AppToast.show(this, "Heat Monitor Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hide On Scroll446
internal fun PlayerActivity.showV446HideOnScroll446Toggle() {
    val current = BiliClient.prefs.v446hideOnScroll446
    BiliClient.prefs.v446hideOnScroll446 = !current
    AppToast.show(this, "Hide On Scroll446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hold To Fast Forward446
internal fun PlayerActivity.showV446HoldToFastForward446Toggle() {
    val current = BiliClient.prefs.v446holdToFastForward446
    BiliClient.prefs.v446holdToFastForward446 = !current
    AppToast.show(this, "Hold To Fast Forward446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hook Auto Register446
internal fun PlayerActivity.showV446HookAutoRegister446Toggle() {
    val current = BiliClient.prefs.v446hookAutoRegister446
    BiliClient.prefs.v446hookAutoRegister446 = !current
    AppToast.show(this, "Hook Auto Register446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hot Reload Enabled446
internal fun PlayerActivity.showV446HotReloadEnabled446Toggle() {
    val current = BiliClient.prefs.v446hotReloadEnabled446
    BiliClient.prefs.v446hotReloadEnabled446 = !current
    AppToast.show(this, "Hot Reload Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hub Auto Discover446
internal fun PlayerActivity.showV446HubAutoDiscover446Toggle() {
    val current = BiliClient.prefs.v446hubAutoDiscover446
    BiliClient.prefs.v446hubAutoDiscover446 = !current
    AppToast.show(this, "Hub Auto Discover446: ${if (!current) "ON" else "OFF"}")
}

// v447: Gate Auto Auth447
internal fun PlayerActivity.showV447GateAutoAuth447Toggle() {
    val current = BiliClient.prefs.v447gateAutoAuth447
    BiliClient.prefs.v447gateAutoAuth447 = !current
    AppToast.show(this, "Gate Auto Auth447: ${if (!current) "ON" else "OFF"}")
}

// v447: Global Sync Enabled447
internal fun PlayerActivity.showV447GlobalSyncEnabled447Toggle() {
    val current = BiliClient.prefs.v447globalSyncEnabled447
    BiliClient.prefs.v447globalSyncEnabled447 = !current
    AppToast.show(this, "Global Sync Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Group Auto Create447
internal fun PlayerActivity.showV447GroupAutoCreate447Toggle() {
    val current = BiliClient.prefs.v447groupAutoCreate447
    BiliClient.prefs.v447groupAutoCreate447 = !current
    AppToast.show(this, "Group Auto Create447: ${if (!current) "ON" else "OFF"}")
}

// v447: Grow Shrink Enabled447
internal fun PlayerActivity.showV447GrowShrinkEnabled447Toggle() {
    val current = BiliClient.prefs.v447growShrinkEnabled447
    BiliClient.prefs.v447growShrinkEnabled447 = !current
    AppToast.show(this, "Grow Shrink Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Guide Auto Show447
internal fun PlayerActivity.showV447GuideAutoShow447Toggle() {
    val current = BiliClient.prefs.v447guideAutoShow447
    BiliClient.prefs.v447guideAutoShow447 = !current
    AppToast.show(this, "Guide Auto Show447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hang Detection Ms447
internal fun PlayerActivity.showV447HangDetectionMs447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v447hangDetectionMs447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v447hangDetectionMs447 = value
        AppToast.show(this, "Hang Detection Ms447: $value")
    }
}

// v447: Hash Verify Auto447
internal fun PlayerActivity.showV447HashVerifyAuto447Toggle() {
    val current = BiliClient.prefs.v447hashVerifyAuto447
    BiliClient.prefs.v447hashVerifyAuto447 = !current
    AppToast.show(this, "Hash Verify Auto447: ${if (!current) "ON" else "OFF"}")
}

// v447: HeadPhone Auto Pause447
internal fun PlayerActivity.showV447HeadPhoneAutoPause447Toggle() {
    val current = BiliClient.prefs.v447headPhoneAutoPause447
    BiliClient.prefs.v447headPhoneAutoPause447 = !current
    AppToast.show(this, "HeadPhone Auto Pause447: ${if (!current) "ON" else "OFF"}")
}

// v447: Heart Beat Interval447
internal fun PlayerActivity.showV447HeartBeatInterval447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v447heartBeatInterval447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v447heartBeatInterval447 = value
        AppToast.show(this, "Heart Beat Interval447: $value")
    }
}

// v447: Heat Monitor Enabled447
internal fun PlayerActivity.showV447HeatMonitorEnabled447Toggle() {
    val current = BiliClient.prefs.v447heatMonitorEnabled447
    BiliClient.prefs.v447heatMonitorEnabled447 = !current
    AppToast.show(this, "Heat Monitor Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hide On Scroll447
internal fun PlayerActivity.showV447HideOnScroll447Toggle() {
    val current = BiliClient.prefs.v447hideOnScroll447
    BiliClient.prefs.v447hideOnScroll447 = !current
    AppToast.show(this, "Hide On Scroll447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hold To Fast Forward447
internal fun PlayerActivity.showV447HoldToFastForward447Toggle() {
    val current = BiliClient.prefs.v447holdToFastForward447
    BiliClient.prefs.v447holdToFastForward447 = !current
    AppToast.show(this, "Hold To Fast Forward447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hook Auto Register447
internal fun PlayerActivity.showV447HookAutoRegister447Toggle() {
    val current = BiliClient.prefs.v447hookAutoRegister447
    BiliClient.prefs.v447hookAutoRegister447 = !current
    AppToast.show(this, "Hook Auto Register447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hot Reload Enabled447
internal fun PlayerActivity.showV447HotReloadEnabled447Toggle() {
    val current = BiliClient.prefs.v447hotReloadEnabled447
    BiliClient.prefs.v447hotReloadEnabled447 = !current
    AppToast.show(this, "Hot Reload Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hub Auto Discover447
internal fun PlayerActivity.showV447HubAutoDiscover447Toggle() {
    val current = BiliClient.prefs.v447hubAutoDiscover447
    BiliClient.prefs.v447hubAutoDiscover447 = !current
    AppToast.show(this, "Hub Auto Discover447: ${if (!current) "ON" else "OFF"}")
}

// v448: Gate Auto Auth448
internal fun PlayerActivity.showV448GateAutoAuth448Toggle() {
    val current = BiliClient.prefs.v448gateAutoAuth448
    BiliClient.prefs.v448gateAutoAuth448 = !current
    AppToast.show(this, "Gate Auto Auth448: ${if (!current) "ON" else "OFF"}")
}

// v448: Global Sync Enabled448
internal fun PlayerActivity.showV448GlobalSyncEnabled448Toggle() {
    val current = BiliClient.prefs.v448globalSyncEnabled448
    BiliClient.prefs.v448globalSyncEnabled448 = !current
    AppToast.show(this, "Global Sync Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Group Auto Create448
internal fun PlayerActivity.showV448GroupAutoCreate448Toggle() {
    val current = BiliClient.prefs.v448groupAutoCreate448
    BiliClient.prefs.v448groupAutoCreate448 = !current
    AppToast.show(this, "Group Auto Create448: ${if (!current) "ON" else "OFF"}")
}

// v448: Grow Shrink Enabled448
internal fun PlayerActivity.showV448GrowShrinkEnabled448Toggle() {
    val current = BiliClient.prefs.v448growShrinkEnabled448
    BiliClient.prefs.v448growShrinkEnabled448 = !current
    AppToast.show(this, "Grow Shrink Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Guide Auto Show448
internal fun PlayerActivity.showV448GuideAutoShow448Toggle() {
    val current = BiliClient.prefs.v448guideAutoShow448
    BiliClient.prefs.v448guideAutoShow448 = !current
    AppToast.show(this, "Guide Auto Show448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hang Detection Ms448
internal fun PlayerActivity.showV448HangDetectionMs448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v448hangDetectionMs448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v448hangDetectionMs448 = value
        AppToast.show(this, "Hang Detection Ms448: $value")
    }
}

// v448: Hash Verify Auto448
internal fun PlayerActivity.showV448HashVerifyAuto448Toggle() {
    val current = BiliClient.prefs.v448hashVerifyAuto448
    BiliClient.prefs.v448hashVerifyAuto448 = !current
    AppToast.show(this, "Hash Verify Auto448: ${if (!current) "ON" else "OFF"}")
}

// v448: HeadPhone Auto Pause448
internal fun PlayerActivity.showV448HeadPhoneAutoPause448Toggle() {
    val current = BiliClient.prefs.v448headPhoneAutoPause448
    BiliClient.prefs.v448headPhoneAutoPause448 = !current
    AppToast.show(this, "HeadPhone Auto Pause448: ${if (!current) "ON" else "OFF"}")
}

// v448: Heart Beat Interval448
internal fun PlayerActivity.showV448HeartBeatInterval448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v448heartBeatInterval448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v448heartBeatInterval448 = value
        AppToast.show(this, "Heart Beat Interval448: $value")
    }
}

// v448: Heat Monitor Enabled448
internal fun PlayerActivity.showV448HeatMonitorEnabled448Toggle() {
    val current = BiliClient.prefs.v448heatMonitorEnabled448
    BiliClient.prefs.v448heatMonitorEnabled448 = !current
    AppToast.show(this, "Heat Monitor Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hide On Scroll448
internal fun PlayerActivity.showV448HideOnScroll448Toggle() {
    val current = BiliClient.prefs.v448hideOnScroll448
    BiliClient.prefs.v448hideOnScroll448 = !current
    AppToast.show(this, "Hide On Scroll448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hold To Fast Forward448
internal fun PlayerActivity.showV448HoldToFastForward448Toggle() {
    val current = BiliClient.prefs.v448holdToFastForward448
    BiliClient.prefs.v448holdToFastForward448 = !current
    AppToast.show(this, "Hold To Fast Forward448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hook Auto Register448
internal fun PlayerActivity.showV448HookAutoRegister448Toggle() {
    val current = BiliClient.prefs.v448hookAutoRegister448
    BiliClient.prefs.v448hookAutoRegister448 = !current
    AppToast.show(this, "Hook Auto Register448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hot Reload Enabled448
internal fun PlayerActivity.showV448HotReloadEnabled448Toggle() {
    val current = BiliClient.prefs.v448hotReloadEnabled448
    BiliClient.prefs.v448hotReloadEnabled448 = !current
    AppToast.show(this, "Hot Reload Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hub Auto Discover448
internal fun PlayerActivity.showV448HubAutoDiscover448Toggle() {
    val current = BiliClient.prefs.v448hubAutoDiscover448
    BiliClient.prefs.v448hubAutoDiscover448 = !current
    AppToast.show(this, "Hub Auto Discover448: ${if (!current) "ON" else "OFF"}")
}

// v449: Gate Auto Auth449
internal fun PlayerActivity.showV449GateAutoAuth449Toggle() {
    val current = BiliClient.prefs.v449gateAutoAuth449
    BiliClient.prefs.v449gateAutoAuth449 = !current
    AppToast.show(this, "Gate Auto Auth449: ${if (!current) "ON" else "OFF"}")
}

// v449: Global Sync Enabled449
internal fun PlayerActivity.showV449GlobalSyncEnabled449Toggle() {
    val current = BiliClient.prefs.v449globalSyncEnabled449
    BiliClient.prefs.v449globalSyncEnabled449 = !current
    AppToast.show(this, "Global Sync Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Group Auto Create449
internal fun PlayerActivity.showV449GroupAutoCreate449Toggle() {
    val current = BiliClient.prefs.v449groupAutoCreate449
    BiliClient.prefs.v449groupAutoCreate449 = !current
    AppToast.show(this, "Group Auto Create449: ${if (!current) "ON" else "OFF"}")
}

// v449: Grow Shrink Enabled449
internal fun PlayerActivity.showV449GrowShrinkEnabled449Toggle() {
    val current = BiliClient.prefs.v449growShrinkEnabled449
    BiliClient.prefs.v449growShrinkEnabled449 = !current
    AppToast.show(this, "Grow Shrink Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Guide Auto Show449
internal fun PlayerActivity.showV449GuideAutoShow449Toggle() {
    val current = BiliClient.prefs.v449guideAutoShow449
    BiliClient.prefs.v449guideAutoShow449 = !current
    AppToast.show(this, "Guide Auto Show449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hang Detection Ms449
internal fun PlayerActivity.showV449HangDetectionMs449Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v449hangDetectionMs449).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms449",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v449hangDetectionMs449 = value
        AppToast.show(this, "Hang Detection Ms449: $value")
    }
}

// v449: Hash Verify Auto449
internal fun PlayerActivity.showV449HashVerifyAuto449Toggle() {
    val current = BiliClient.prefs.v449hashVerifyAuto449
    BiliClient.prefs.v449hashVerifyAuto449 = !current
    AppToast.show(this, "Hash Verify Auto449: ${if (!current) "ON" else "OFF"}")
}

// v449: HeadPhone Auto Pause449
internal fun PlayerActivity.showV449HeadPhoneAutoPause449Toggle() {
    val current = BiliClient.prefs.v449headPhoneAutoPause449
    BiliClient.prefs.v449headPhoneAutoPause449 = !current
    AppToast.show(this, "HeadPhone Auto Pause449: ${if (!current) "ON" else "OFF"}")
}

// v449: Heart Beat Interval449
internal fun PlayerActivity.showV449HeartBeatInterval449Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v449heartBeatInterval449).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval449",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v449heartBeatInterval449 = value
        AppToast.show(this, "Heart Beat Interval449: $value")
    }
}

// v449: Heat Monitor Enabled449
internal fun PlayerActivity.showV449HeatMonitorEnabled449Toggle() {
    val current = BiliClient.prefs.v449heatMonitorEnabled449
    BiliClient.prefs.v449heatMonitorEnabled449 = !current
    AppToast.show(this, "Heat Monitor Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hide On Scroll449
internal fun PlayerActivity.showV449HideOnScroll449Toggle() {
    val current = BiliClient.prefs.v449hideOnScroll449
    BiliClient.prefs.v449hideOnScroll449 = !current
    AppToast.show(this, "Hide On Scroll449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hold To Fast Forward449
internal fun PlayerActivity.showV449HoldToFastForward449Toggle() {
    val current = BiliClient.prefs.v449holdToFastForward449
    BiliClient.prefs.v449holdToFastForward449 = !current
    AppToast.show(this, "Hold To Fast Forward449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hook Auto Register449
internal fun PlayerActivity.showV449HookAutoRegister449Toggle() {
    val current = BiliClient.prefs.v449hookAutoRegister449
    BiliClient.prefs.v449hookAutoRegister449 = !current
    AppToast.show(this, "Hook Auto Register449: ${if (!current) "ON" else "OFF"}")
}

