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

internal fun PlayerActivity.showV495ParentControlPin495Toggle() {
    val current = BiliClient.prefs.v495parentControlPin495
    BiliClient.prefs.v495parentControlPin495 = !current
    AppToast.show(this, "Parent Control Pin495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PassThroughAudio495Toggle() {
    val current = BiliClient.prefs.v495passThroughAudio495
    BiliClient.prefs.v495passThroughAudio495 = !current
    AppToast.show(this, "Pass Through Audio495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PathAutoResolve495Toggle() {
    val current = BiliClient.prefs.v495pathAutoResolve495
    BiliClient.prefs.v495pathAutoResolve495 = !current
    AppToast.show(this, "Path Auto Resolve495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PatternAutoMatch495Toggle() {
    val current = BiliClient.prefs.v495patternAutoMatch495
    BiliClient.prefs.v495patternAutoMatch495 = !current
    AppToast.show(this, "Pattern Auto Match495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PauseOnHeadset495Toggle() {
    val current = BiliClient.prefs.v495pauseOnHeadset495
    BiliClient.prefs.v495pauseOnHeadset495 = !current
    AppToast.show(this, "Pause On Headset495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PeakAutoDetect495Toggle() {
    val current = BiliClient.prefs.v495peakAutoDetect495
    BiliClient.prefs.v495peakAutoDetect495 = !current
    AppToast.show(this, "Peak Auto Detect495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PeriodAutoExtend495Toggle() {
    val current = BiliClient.prefs.v495periodAutoExtend495
    BiliClient.prefs.v495periodAutoExtend495 = !current
    AppToast.show(this, "Period Auto Extend495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PermissionAutoGrant495Toggle() {
    val current = BiliClient.prefs.v495permissionAutoGrant495
    BiliClient.prefs.v495permissionAutoGrant495 = !current
    AppToast.show(this, "Permission Auto Grant495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PhaseAutoAlign495Toggle() {
    val current = BiliClient.prefs.v495phaseAutoAlign495
    BiliClient.prefs.v495phaseAutoAlign495 = !current
    AppToast.show(this, "Phase Auto Align495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PhoneAutoAnswer495Toggle() {
    val current = BiliClient.prefs.v495phoneAutoAnswer495
    BiliClient.prefs.v495phoneAutoAnswer495 = !current
    AppToast.show(this, "Phone Auto Answer495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PickAutoConfirm495Toggle() {
    val current = BiliClient.prefs.v495pickAutoConfirm495
    BiliClient.prefs.v495pickAutoConfirm495 = !current
    AppToast.show(this, "Pick Auto Confirm495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PinToTop495Toggle() {
    val current = BiliClient.prefs.v495pinToTop495
    BiliClient.prefs.v495pinToTop495 = !current
    AppToast.show(this, "Pin To Top495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PipeAutoRoute495Toggle() {
    val current = BiliClient.prefs.v495pipeAutoRoute495
    BiliClient.prefs.v495pipeAutoRoute495 = !current
    AppToast.show(this, "Pipe Auto Route495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PixelAutoCorrect495Toggle() {
    val current = BiliClient.prefs.v495pixelAutoCorrect495
    BiliClient.prefs.v495pixelAutoCorrect495 = !current
    AppToast.show(this, "Pixel Auto Correct495: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PadAutoDetect496Toggle() {
    val current = BiliClient.prefs.v496padAutoDetect496
    BiliClient.prefs.v496padAutoDetect496 = !current
    AppToast.show(this, "Pad Auto Detect496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496ParentControlPin496Toggle() {
    val current = BiliClient.prefs.v496parentControlPin496
    BiliClient.prefs.v496parentControlPin496 = !current
    AppToast.show(this, "Parent Control Pin496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PassThroughAudio496Toggle() {
    val current = BiliClient.prefs.v496passThroughAudio496
    BiliClient.prefs.v496passThroughAudio496 = !current
    AppToast.show(this, "Pass Through Audio496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PathAutoResolve496Toggle() {
    val current = BiliClient.prefs.v496pathAutoResolve496
    BiliClient.prefs.v496pathAutoResolve496 = !current
    AppToast.show(this, "Path Auto Resolve496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PatternAutoMatch496Toggle() {
    val current = BiliClient.prefs.v496patternAutoMatch496
    BiliClient.prefs.v496patternAutoMatch496 = !current
    AppToast.show(this, "Pattern Auto Match496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PauseOnHeadset496Toggle() {
    val current = BiliClient.prefs.v496pauseOnHeadset496
    BiliClient.prefs.v496pauseOnHeadset496 = !current
    AppToast.show(this, "Pause On Headset496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PeakAutoDetect496Toggle() {
    val current = BiliClient.prefs.v496peakAutoDetect496
    BiliClient.prefs.v496peakAutoDetect496 = !current
    AppToast.show(this, "Peak Auto Detect496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PeriodAutoExtend496Toggle() {
    val current = BiliClient.prefs.v496periodAutoExtend496
    BiliClient.prefs.v496periodAutoExtend496 = !current
    AppToast.show(this, "Period Auto Extend496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PermissionAutoGrant496Toggle() {
    val current = BiliClient.prefs.v496permissionAutoGrant496
    BiliClient.prefs.v496permissionAutoGrant496 = !current
    AppToast.show(this, "Permission Auto Grant496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PhaseAutoAlign496Toggle() {
    val current = BiliClient.prefs.v496phaseAutoAlign496
    BiliClient.prefs.v496phaseAutoAlign496 = !current
    AppToast.show(this, "Phase Auto Align496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PhoneAutoAnswer496Toggle() {
    val current = BiliClient.prefs.v496phoneAutoAnswer496
    BiliClient.prefs.v496phoneAutoAnswer496 = !current
    AppToast.show(this, "Phone Auto Answer496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PickAutoConfirm496Toggle() {
    val current = BiliClient.prefs.v496pickAutoConfirm496
    BiliClient.prefs.v496pickAutoConfirm496 = !current
    AppToast.show(this, "Pick Auto Confirm496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PinToTop496Toggle() {
    val current = BiliClient.prefs.v496pinToTop496
    BiliClient.prefs.v496pinToTop496 = !current
    AppToast.show(this, "Pin To Top496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PipeAutoRoute496Toggle() {
    val current = BiliClient.prefs.v496pipeAutoRoute496
    BiliClient.prefs.v496pipeAutoRoute496 = !current
    AppToast.show(this, "Pipe Auto Route496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV496PixelAutoCorrect496Toggle() {
    val current = BiliClient.prefs.v496pixelAutoCorrect496
    BiliClient.prefs.v496pixelAutoCorrect496 = !current
    AppToast.show(this, "Pixel Auto Correct496: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PadAutoDetect497Toggle() {
    val current = BiliClient.prefs.v497padAutoDetect497
    BiliClient.prefs.v497padAutoDetect497 = !current
    AppToast.show(this, "Pad Auto Detect497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497ParentControlPin497Toggle() {
    val current = BiliClient.prefs.v497parentControlPin497
    BiliClient.prefs.v497parentControlPin497 = !current
    AppToast.show(this, "Parent Control Pin497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PassThroughAudio497Toggle() {
    val current = BiliClient.prefs.v497passThroughAudio497
    BiliClient.prefs.v497passThroughAudio497 = !current
    AppToast.show(this, "Pass Through Audio497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PathAutoResolve497Toggle() {
    val current = BiliClient.prefs.v497pathAutoResolve497
    BiliClient.prefs.v497pathAutoResolve497 = !current
    AppToast.show(this, "Path Auto Resolve497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PatternAutoMatch497Toggle() {
    val current = BiliClient.prefs.v497patternAutoMatch497
    BiliClient.prefs.v497patternAutoMatch497 = !current
    AppToast.show(this, "Pattern Auto Match497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PauseOnHeadset497Toggle() {
    val current = BiliClient.prefs.v497pauseOnHeadset497
    BiliClient.prefs.v497pauseOnHeadset497 = !current
    AppToast.show(this, "Pause On Headset497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PeakAutoDetect497Toggle() {
    val current = BiliClient.prefs.v497peakAutoDetect497
    BiliClient.prefs.v497peakAutoDetect497 = !current
    AppToast.show(this, "Peak Auto Detect497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PeriodAutoExtend497Toggle() {
    val current = BiliClient.prefs.v497periodAutoExtend497
    BiliClient.prefs.v497periodAutoExtend497 = !current
    AppToast.show(this, "Period Auto Extend497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PermissionAutoGrant497Toggle() {
    val current = BiliClient.prefs.v497permissionAutoGrant497
    BiliClient.prefs.v497permissionAutoGrant497 = !current
    AppToast.show(this, "Permission Auto Grant497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PhaseAutoAlign497Toggle() {
    val current = BiliClient.prefs.v497phaseAutoAlign497
    BiliClient.prefs.v497phaseAutoAlign497 = !current
    AppToast.show(this, "Phase Auto Align497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PhoneAutoAnswer497Toggle() {
    val current = BiliClient.prefs.v497phoneAutoAnswer497
    BiliClient.prefs.v497phoneAutoAnswer497 = !current
    AppToast.show(this, "Phone Auto Answer497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PickAutoConfirm497Toggle() {
    val current = BiliClient.prefs.v497pickAutoConfirm497
    BiliClient.prefs.v497pickAutoConfirm497 = !current
    AppToast.show(this, "Pick Auto Confirm497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PinToTop497Toggle() {
    val current = BiliClient.prefs.v497pinToTop497
    BiliClient.prefs.v497pinToTop497 = !current
    AppToast.show(this, "Pin To Top497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PipeAutoRoute497Toggle() {
    val current = BiliClient.prefs.v497pipeAutoRoute497
    BiliClient.prefs.v497pipeAutoRoute497 = !current
    AppToast.show(this, "Pipe Auto Route497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV497PixelAutoCorrect497Toggle() {
    val current = BiliClient.prefs.v497pixelAutoCorrect497
    BiliClient.prefs.v497pixelAutoCorrect497 = !current
    AppToast.show(this, "Pixel Auto Correct497: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PadAutoDetect498Toggle() {
    val current = BiliClient.prefs.v498padAutoDetect498
    BiliClient.prefs.v498padAutoDetect498 = !current
    AppToast.show(this, "Pad Auto Detect498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498ParentControlPin498Toggle() {
    val current = BiliClient.prefs.v498parentControlPin498
    BiliClient.prefs.v498parentControlPin498 = !current
    AppToast.show(this, "Parent Control Pin498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PassThroughAudio498Toggle() {
    val current = BiliClient.prefs.v498passThroughAudio498
    BiliClient.prefs.v498passThroughAudio498 = !current
    AppToast.show(this, "Pass Through Audio498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PathAutoResolve498Toggle() {
    val current = BiliClient.prefs.v498pathAutoResolve498
    BiliClient.prefs.v498pathAutoResolve498 = !current
    AppToast.show(this, "Path Auto Resolve498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PatternAutoMatch498Toggle() {
    val current = BiliClient.prefs.v498patternAutoMatch498
    BiliClient.prefs.v498patternAutoMatch498 = !current
    AppToast.show(this, "Pattern Auto Match498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PauseOnHeadset498Toggle() {
    val current = BiliClient.prefs.v498pauseOnHeadset498
    BiliClient.prefs.v498pauseOnHeadset498 = !current
    AppToast.show(this, "Pause On Headset498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PeakAutoDetect498Toggle() {
    val current = BiliClient.prefs.v498peakAutoDetect498
    BiliClient.prefs.v498peakAutoDetect498 = !current
    AppToast.show(this, "Peak Auto Detect498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PeriodAutoExtend498Toggle() {
    val current = BiliClient.prefs.v498periodAutoExtend498
    BiliClient.prefs.v498periodAutoExtend498 = !current
    AppToast.show(this, "Period Auto Extend498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PermissionAutoGrant498Toggle() {
    val current = BiliClient.prefs.v498permissionAutoGrant498
    BiliClient.prefs.v498permissionAutoGrant498 = !current
    AppToast.show(this, "Permission Auto Grant498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PhaseAutoAlign498Toggle() {
    val current = BiliClient.prefs.v498phaseAutoAlign498
    BiliClient.prefs.v498phaseAutoAlign498 = !current
    AppToast.show(this, "Phase Auto Align498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PhoneAutoAnswer498Toggle() {
    val current = BiliClient.prefs.v498phoneAutoAnswer498
    BiliClient.prefs.v498phoneAutoAnswer498 = !current
    AppToast.show(this, "Phone Auto Answer498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PickAutoConfirm498Toggle() {
    val current = BiliClient.prefs.v498pickAutoConfirm498
    BiliClient.prefs.v498pickAutoConfirm498 = !current
    AppToast.show(this, "Pick Auto Confirm498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PinToTop498Toggle() {
    val current = BiliClient.prefs.v498pinToTop498
    BiliClient.prefs.v498pinToTop498 = !current
    AppToast.show(this, "Pin To Top498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PipeAutoRoute498Toggle() {
    val current = BiliClient.prefs.v498pipeAutoRoute498
    BiliClient.prefs.v498pipeAutoRoute498 = !current
    AppToast.show(this, "Pipe Auto Route498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV498PixelAutoCorrect498Toggle() {
    val current = BiliClient.prefs.v498pixelAutoCorrect498
    BiliClient.prefs.v498pixelAutoCorrect498 = !current
    AppToast.show(this, "Pixel Auto Correct498: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PadAutoDetect499Toggle() {
    val current = BiliClient.prefs.v499padAutoDetect499
    BiliClient.prefs.v499padAutoDetect499 = !current
    AppToast.show(this, "Pad Auto Detect499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499ParentControlPin499Toggle() {
    val current = BiliClient.prefs.v499parentControlPin499
    BiliClient.prefs.v499parentControlPin499 = !current
    AppToast.show(this, "Parent Control Pin499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PassThroughAudio499Toggle() {
    val current = BiliClient.prefs.v499passThroughAudio499
    BiliClient.prefs.v499passThroughAudio499 = !current
    AppToast.show(this, "Pass Through Audio499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PathAutoResolve499Toggle() {
    val current = BiliClient.prefs.v499pathAutoResolve499
    BiliClient.prefs.v499pathAutoResolve499 = !current
    AppToast.show(this, "Path Auto Resolve499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PatternAutoMatch499Toggle() {
    val current = BiliClient.prefs.v499patternAutoMatch499
    BiliClient.prefs.v499patternAutoMatch499 = !current
    AppToast.show(this, "Pattern Auto Match499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PauseOnHeadset499Toggle() {
    val current = BiliClient.prefs.v499pauseOnHeadset499
    BiliClient.prefs.v499pauseOnHeadset499 = !current
    AppToast.show(this, "Pause On Headset499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PeakAutoDetect499Toggle() {
    val current = BiliClient.prefs.v499peakAutoDetect499
    BiliClient.prefs.v499peakAutoDetect499 = !current
    AppToast.show(this, "Peak Auto Detect499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PeriodAutoExtend499Toggle() {
    val current = BiliClient.prefs.v499periodAutoExtend499
    BiliClient.prefs.v499periodAutoExtend499 = !current
    AppToast.show(this, "Period Auto Extend499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PermissionAutoGrant499Toggle() {
    val current = BiliClient.prefs.v499permissionAutoGrant499
    BiliClient.prefs.v499permissionAutoGrant499 = !current
    AppToast.show(this, "Permission Auto Grant499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PhaseAutoAlign499Toggle() {
    val current = BiliClient.prefs.v499phaseAutoAlign499
    BiliClient.prefs.v499phaseAutoAlign499 = !current
    AppToast.show(this, "Phase Auto Align499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PhoneAutoAnswer499Toggle() {
    val current = BiliClient.prefs.v499phoneAutoAnswer499
    BiliClient.prefs.v499phoneAutoAnswer499 = !current
    AppToast.show(this, "Phone Auto Answer499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PickAutoConfirm499Toggle() {
    val current = BiliClient.prefs.v499pickAutoConfirm499
    BiliClient.prefs.v499pickAutoConfirm499 = !current
    AppToast.show(this, "Pick Auto Confirm499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PinToTop499Toggle() {
    val current = BiliClient.prefs.v499pinToTop499
    BiliClient.prefs.v499pinToTop499 = !current
    AppToast.show(this, "Pin To Top499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PipeAutoRoute499Toggle() {
    val current = BiliClient.prefs.v499pipeAutoRoute499
    BiliClient.prefs.v499pipeAutoRoute499 = !current
    AppToast.show(this, "Pipe Auto Route499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV499PixelAutoCorrect499Toggle() {
    val current = BiliClient.prefs.v499pixelAutoCorrect499
    BiliClient.prefs.v499pixelAutoCorrect499 = !current
    AppToast.show(this, "Pixel Auto Correct499: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PadAutoDetect500Toggle() {
    val current = BiliClient.prefs.v500padAutoDetect500
    BiliClient.prefs.v500padAutoDetect500 = !current
    AppToast.show(this, "Pad Auto Detect500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500ParentControlPin500Toggle() {
    val current = BiliClient.prefs.v500parentControlPin500
    BiliClient.prefs.v500parentControlPin500 = !current
    AppToast.show(this, "Parent Control Pin500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PassThroughAudio500Toggle() {
    val current = BiliClient.prefs.v500passThroughAudio500
    BiliClient.prefs.v500passThroughAudio500 = !current
    AppToast.show(this, "Pass Through Audio500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PathAutoResolve500Toggle() {
    val current = BiliClient.prefs.v500pathAutoResolve500
    BiliClient.prefs.v500pathAutoResolve500 = !current
    AppToast.show(this, "Path Auto Resolve500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PatternAutoMatch500Toggle() {
    val current = BiliClient.prefs.v500patternAutoMatch500
    BiliClient.prefs.v500patternAutoMatch500 = !current
    AppToast.show(this, "Pattern Auto Match500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PauseOnHeadset500Toggle() {
    val current = BiliClient.prefs.v500pauseOnHeadset500
    BiliClient.prefs.v500pauseOnHeadset500 = !current
    AppToast.show(this, "Pause On Headset500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PeakAutoDetect500Toggle() {
    val current = BiliClient.prefs.v500peakAutoDetect500
    BiliClient.prefs.v500peakAutoDetect500 = !current
    AppToast.show(this, "Peak Auto Detect500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PeriodAutoExtend500Toggle() {
    val current = BiliClient.prefs.v500periodAutoExtend500
    BiliClient.prefs.v500periodAutoExtend500 = !current
    AppToast.show(this, "Period Auto Extend500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PermissionAutoGrant500Toggle() {
    val current = BiliClient.prefs.v500permissionAutoGrant500
    BiliClient.prefs.v500permissionAutoGrant500 = !current
    AppToast.show(this, "Permission Auto Grant500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PhaseAutoAlign500Toggle() {
    val current = BiliClient.prefs.v500phaseAutoAlign500
    BiliClient.prefs.v500phaseAutoAlign500 = !current
    AppToast.show(this, "Phase Auto Align500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PhoneAutoAnswer500Toggle() {
    val current = BiliClient.prefs.v500phoneAutoAnswer500
    BiliClient.prefs.v500phoneAutoAnswer500 = !current
    AppToast.show(this, "Phone Auto Answer500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PickAutoConfirm500Toggle() {
    val current = BiliClient.prefs.v500pickAutoConfirm500
    BiliClient.prefs.v500pickAutoConfirm500 = !current
    AppToast.show(this, "Pick Auto Confirm500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PinToTop500Toggle() {
    val current = BiliClient.prefs.v500pinToTop500
    BiliClient.prefs.v500pinToTop500 = !current
    AppToast.show(this, "Pin To Top500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PipeAutoRoute500Toggle() {
    val current = BiliClient.prefs.v500pipeAutoRoute500
    BiliClient.prefs.v500pipeAutoRoute500 = !current
    AppToast.show(this, "Pipe Auto Route500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV500PixelAutoCorrect500Toggle() {
    val current = BiliClient.prefs.v500pixelAutoCorrect500
    BiliClient.prefs.v500pixelAutoCorrect500 = !current
    AppToast.show(this, "Pixel Auto Correct500: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PlaceAutoDetect501Toggle() {
    val current = BiliClient.prefs.v501placeAutoDetect501
    BiliClient.prefs.v501placeAutoDetect501 = !current
    AppToast.show(this, "Place Auto Detect501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PlatformAutoAdapt501Toggle() {
    val current = BiliClient.prefs.v501platformAutoAdapt501
    BiliClient.prefs.v501platformAutoAdapt501 = !current
    AppToast.show(this, "Platform Auto Adapt501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PlayAutoResume501Toggle() {
    val current = BiliClient.prefs.v501playAutoResume501
    BiliClient.prefs.v501playAutoResume501 = !current
    AppToast.show(this, "Play Auto Resume501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PluginAutoUpdate501Toggle() {
    val current = BiliClient.prefs.v501pluginAutoUpdate501
    BiliClient.prefs.v501pluginAutoUpdate501 = !current
    AppToast.show(this, "Plugin Auto Update501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PopUpAutoDismiss501Toggle() {
    val current = BiliClient.prefs.v501popUpAutoDismiss501
    BiliClient.prefs.v501popUpAutoDismiss501 = !current
    AppToast.show(this, "Pop Up Auto Dismiss501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PortAutoScan501Toggle() {
    val current = BiliClient.prefs.v501portAutoScan501
    BiliClient.prefs.v501portAutoScan501 = !current
    AppToast.show(this, "Port Auto Scan501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PostAutoShare501Toggle() {
    val current = BiliClient.prefs.v501postAutoShare501
    BiliClient.prefs.v501postAutoShare501 = !current
    AppToast.show(this, "Post Auto Share501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PowerSaveMode501Toggle() {
    val current = BiliClient.prefs.v501powerSaveMode501
    BiliClient.prefs.v501powerSaveMode501 = !current
    AppToast.show(this, "Power Save Mode501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PreBufferEnabled501Toggle() {
    val current = BiliClient.prefs.v501preBufferEnabled501
    BiliClient.prefs.v501preBufferEnabled501 = !current
    AppToast.show(this, "Pre Buffer Enabled501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PrefixAutoTrim501Toggle() {
    val current = BiliClient.prefs.v501prefixAutoTrim501
    BiliClient.prefs.v501prefixAutoTrim501 = !current
    AppToast.show(this, "Prefix Auto Trim501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PressAndHoldAction501Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v501pressAndHoldAction501).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action501",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v501pressAndHoldAction501 = value
        AppToast.show(this, "Press And Hold Action501: $value")
    }
}

internal fun PlayerActivity.showV501PrimaryAudioTrack501Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v501primaryAudioTrack501).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track501",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v501primaryAudioTrack501 = value
        AppToast.show(this, "Primary Audio Track501: $value")
    }
}

internal fun PlayerActivity.showV501PrintAutoFormat501Toggle() {
    val current = BiliClient.prefs.v501printAutoFormat501
    BiliClient.prefs.v501printAutoFormat501 = !current
    AppToast.show(this, "Print Auto Format501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PriorityQueueEnabled501Toggle() {
    val current = BiliClient.prefs.v501priorityQueueEnabled501
    BiliClient.prefs.v501priorityQueueEnabled501 = !current
    AppToast.show(this, "Priority Queue Enabled501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV501PrivateModeAuto501Toggle() {
    val current = BiliClient.prefs.v501privateModeAuto501
    BiliClient.prefs.v501privateModeAuto501 = !current
    AppToast.show(this, "Private Mode Auto501: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PlaceAutoDetect502Toggle() {
    val current = BiliClient.prefs.v502placeAutoDetect502
    BiliClient.prefs.v502placeAutoDetect502 = !current
    AppToast.show(this, "Place Auto Detect502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PlatformAutoAdapt502Toggle() {
    val current = BiliClient.prefs.v502platformAutoAdapt502
    BiliClient.prefs.v502platformAutoAdapt502 = !current
    AppToast.show(this, "Platform Auto Adapt502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PlayAutoResume502Toggle() {
    val current = BiliClient.prefs.v502playAutoResume502
    BiliClient.prefs.v502playAutoResume502 = !current
    AppToast.show(this, "Play Auto Resume502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PluginAutoUpdate502Toggle() {
    val current = BiliClient.prefs.v502pluginAutoUpdate502
    BiliClient.prefs.v502pluginAutoUpdate502 = !current
    AppToast.show(this, "Plugin Auto Update502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PopUpAutoDismiss502Toggle() {
    val current = BiliClient.prefs.v502popUpAutoDismiss502
    BiliClient.prefs.v502popUpAutoDismiss502 = !current
    AppToast.show(this, "Pop Up Auto Dismiss502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PortAutoScan502Toggle() {
    val current = BiliClient.prefs.v502portAutoScan502
    BiliClient.prefs.v502portAutoScan502 = !current
    AppToast.show(this, "Port Auto Scan502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PostAutoShare502Toggle() {
    val current = BiliClient.prefs.v502postAutoShare502
    BiliClient.prefs.v502postAutoShare502 = !current
    AppToast.show(this, "Post Auto Share502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PowerSaveMode502Toggle() {
    val current = BiliClient.prefs.v502powerSaveMode502
    BiliClient.prefs.v502powerSaveMode502 = !current
    AppToast.show(this, "Power Save Mode502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PreBufferEnabled502Toggle() {
    val current = BiliClient.prefs.v502preBufferEnabled502
    BiliClient.prefs.v502preBufferEnabled502 = !current
    AppToast.show(this, "Pre Buffer Enabled502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PrefixAutoTrim502Toggle() {
    val current = BiliClient.prefs.v502prefixAutoTrim502
    BiliClient.prefs.v502prefixAutoTrim502 = !current
    AppToast.show(this, "Prefix Auto Trim502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PressAndHoldAction502Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v502pressAndHoldAction502).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action502",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v502pressAndHoldAction502 = value
        AppToast.show(this, "Press And Hold Action502: $value")
    }
}

internal fun PlayerActivity.showV502PrimaryAudioTrack502Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v502primaryAudioTrack502).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track502",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v502primaryAudioTrack502 = value
        AppToast.show(this, "Primary Audio Track502: $value")
    }
}

internal fun PlayerActivity.showV502PrintAutoFormat502Toggle() {
    val current = BiliClient.prefs.v502printAutoFormat502
    BiliClient.prefs.v502printAutoFormat502 = !current
    AppToast.show(this, "Print Auto Format502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PriorityQueueEnabled502Toggle() {
    val current = BiliClient.prefs.v502priorityQueueEnabled502
    BiliClient.prefs.v502priorityQueueEnabled502 = !current
    AppToast.show(this, "Priority Queue Enabled502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV502PrivateModeAuto502Toggle() {
    val current = BiliClient.prefs.v502privateModeAuto502
    BiliClient.prefs.v502privateModeAuto502 = !current
    AppToast.show(this, "Private Mode Auto502: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PlaceAutoDetect503Toggle() {
    val current = BiliClient.prefs.v503placeAutoDetect503
    BiliClient.prefs.v503placeAutoDetect503 = !current
    AppToast.show(this, "Place Auto Detect503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PlatformAutoAdapt503Toggle() {
    val current = BiliClient.prefs.v503platformAutoAdapt503
    BiliClient.prefs.v503platformAutoAdapt503 = !current
    AppToast.show(this, "Platform Auto Adapt503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PlayAutoResume503Toggle() {
    val current = BiliClient.prefs.v503playAutoResume503
    BiliClient.prefs.v503playAutoResume503 = !current
    AppToast.show(this, "Play Auto Resume503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PluginAutoUpdate503Toggle() {
    val current = BiliClient.prefs.v503pluginAutoUpdate503
    BiliClient.prefs.v503pluginAutoUpdate503 = !current
    AppToast.show(this, "Plugin Auto Update503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PopUpAutoDismiss503Toggle() {
    val current = BiliClient.prefs.v503popUpAutoDismiss503
    BiliClient.prefs.v503popUpAutoDismiss503 = !current
    AppToast.show(this, "Pop Up Auto Dismiss503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PortAutoScan503Toggle() {
    val current = BiliClient.prefs.v503portAutoScan503
    BiliClient.prefs.v503portAutoScan503 = !current
    AppToast.show(this, "Port Auto Scan503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PostAutoShare503Toggle() {
    val current = BiliClient.prefs.v503postAutoShare503
    BiliClient.prefs.v503postAutoShare503 = !current
    AppToast.show(this, "Post Auto Share503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PowerSaveMode503Toggle() {
    val current = BiliClient.prefs.v503powerSaveMode503
    BiliClient.prefs.v503powerSaveMode503 = !current
    AppToast.show(this, "Power Save Mode503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PreBufferEnabled503Toggle() {
    val current = BiliClient.prefs.v503preBufferEnabled503
    BiliClient.prefs.v503preBufferEnabled503 = !current
    AppToast.show(this, "Pre Buffer Enabled503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PrefixAutoTrim503Toggle() {
    val current = BiliClient.prefs.v503prefixAutoTrim503
    BiliClient.prefs.v503prefixAutoTrim503 = !current
    AppToast.show(this, "Prefix Auto Trim503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PressAndHoldAction503Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v503pressAndHoldAction503).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action503",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v503pressAndHoldAction503 = value
        AppToast.show(this, "Press And Hold Action503: $value")
    }
}

internal fun PlayerActivity.showV503PrimaryAudioTrack503Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v503primaryAudioTrack503).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track503",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v503primaryAudioTrack503 = value
        AppToast.show(this, "Primary Audio Track503: $value")
    }
}

internal fun PlayerActivity.showV503PrintAutoFormat503Toggle() {
    val current = BiliClient.prefs.v503printAutoFormat503
    BiliClient.prefs.v503printAutoFormat503 = !current
    AppToast.show(this, "Print Auto Format503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PriorityQueueEnabled503Toggle() {
    val current = BiliClient.prefs.v503priorityQueueEnabled503
    BiliClient.prefs.v503priorityQueueEnabled503 = !current
    AppToast.show(this, "Priority Queue Enabled503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV503PrivateModeAuto503Toggle() {
    val current = BiliClient.prefs.v503privateModeAuto503
    BiliClient.prefs.v503privateModeAuto503 = !current
    AppToast.show(this, "Private Mode Auto503: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PlaceAutoDetect504Toggle() {
    val current = BiliClient.prefs.v504placeAutoDetect504
    BiliClient.prefs.v504placeAutoDetect504 = !current
    AppToast.show(this, "Place Auto Detect504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PlatformAutoAdapt504Toggle() {
    val current = BiliClient.prefs.v504platformAutoAdapt504
    BiliClient.prefs.v504platformAutoAdapt504 = !current
    AppToast.show(this, "Platform Auto Adapt504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PlayAutoResume504Toggle() {
    val current = BiliClient.prefs.v504playAutoResume504
    BiliClient.prefs.v504playAutoResume504 = !current
    AppToast.show(this, "Play Auto Resume504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PluginAutoUpdate504Toggle() {
    val current = BiliClient.prefs.v504pluginAutoUpdate504
    BiliClient.prefs.v504pluginAutoUpdate504 = !current
    AppToast.show(this, "Plugin Auto Update504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PopUpAutoDismiss504Toggle() {
    val current = BiliClient.prefs.v504popUpAutoDismiss504
    BiliClient.prefs.v504popUpAutoDismiss504 = !current
    AppToast.show(this, "Pop Up Auto Dismiss504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PortAutoScan504Toggle() {
    val current = BiliClient.prefs.v504portAutoScan504
    BiliClient.prefs.v504portAutoScan504 = !current
    AppToast.show(this, "Port Auto Scan504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PostAutoShare504Toggle() {
    val current = BiliClient.prefs.v504postAutoShare504
    BiliClient.prefs.v504postAutoShare504 = !current
    AppToast.show(this, "Post Auto Share504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PowerSaveMode504Toggle() {
    val current = BiliClient.prefs.v504powerSaveMode504
    BiliClient.prefs.v504powerSaveMode504 = !current
    AppToast.show(this, "Power Save Mode504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PreBufferEnabled504Toggle() {
    val current = BiliClient.prefs.v504preBufferEnabled504
    BiliClient.prefs.v504preBufferEnabled504 = !current
    AppToast.show(this, "Pre Buffer Enabled504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PrefixAutoTrim504Toggle() {
    val current = BiliClient.prefs.v504prefixAutoTrim504
    BiliClient.prefs.v504prefixAutoTrim504 = !current
    AppToast.show(this, "Prefix Auto Trim504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PressAndHoldAction504Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v504pressAndHoldAction504).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action504",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v504pressAndHoldAction504 = value
        AppToast.show(this, "Press And Hold Action504: $value")
    }
}

internal fun PlayerActivity.showV504PrimaryAudioTrack504Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v504primaryAudioTrack504).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track504",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v504primaryAudioTrack504 = value
        AppToast.show(this, "Primary Audio Track504: $value")
    }
}

internal fun PlayerActivity.showV504PrintAutoFormat504Toggle() {
    val current = BiliClient.prefs.v504printAutoFormat504
    BiliClient.prefs.v504printAutoFormat504 = !current
    AppToast.show(this, "Print Auto Format504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PriorityQueueEnabled504Toggle() {
    val current = BiliClient.prefs.v504priorityQueueEnabled504
    BiliClient.prefs.v504priorityQueueEnabled504 = !current
    AppToast.show(this, "Priority Queue Enabled504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV504PrivateModeAuto504Toggle() {
    val current = BiliClient.prefs.v504privateModeAuto504
    BiliClient.prefs.v504privateModeAuto504 = !current
    AppToast.show(this, "Private Mode Auto504: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PlaceAutoDetect505Toggle() {
    val current = BiliClient.prefs.v505placeAutoDetect505
    BiliClient.prefs.v505placeAutoDetect505 = !current
    AppToast.show(this, "Place Auto Detect505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PlatformAutoAdapt505Toggle() {
    val current = BiliClient.prefs.v505platformAutoAdapt505
    BiliClient.prefs.v505platformAutoAdapt505 = !current
    AppToast.show(this, "Platform Auto Adapt505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PlayAutoResume505Toggle() {
    val current = BiliClient.prefs.v505playAutoResume505
    BiliClient.prefs.v505playAutoResume505 = !current
    AppToast.show(this, "Play Auto Resume505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PluginAutoUpdate505Toggle() {
    val current = BiliClient.prefs.v505pluginAutoUpdate505
    BiliClient.prefs.v505pluginAutoUpdate505 = !current
    AppToast.show(this, "Plugin Auto Update505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PopUpAutoDismiss505Toggle() {
    val current = BiliClient.prefs.v505popUpAutoDismiss505
    BiliClient.prefs.v505popUpAutoDismiss505 = !current
    AppToast.show(this, "Pop Up Auto Dismiss505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PortAutoScan505Toggle() {
    val current = BiliClient.prefs.v505portAutoScan505
    BiliClient.prefs.v505portAutoScan505 = !current
    AppToast.show(this, "Port Auto Scan505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PostAutoShare505Toggle() {
    val current = BiliClient.prefs.v505postAutoShare505
    BiliClient.prefs.v505postAutoShare505 = !current
    AppToast.show(this, "Post Auto Share505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PowerSaveMode505Toggle() {
    val current = BiliClient.prefs.v505powerSaveMode505
    BiliClient.prefs.v505powerSaveMode505 = !current
    AppToast.show(this, "Power Save Mode505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PreBufferEnabled505Toggle() {
    val current = BiliClient.prefs.v505preBufferEnabled505
    BiliClient.prefs.v505preBufferEnabled505 = !current
    AppToast.show(this, "Pre Buffer Enabled505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PrefixAutoTrim505Toggle() {
    val current = BiliClient.prefs.v505prefixAutoTrim505
    BiliClient.prefs.v505prefixAutoTrim505 = !current
    AppToast.show(this, "Prefix Auto Trim505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PressAndHoldAction505Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v505pressAndHoldAction505).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action505",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v505pressAndHoldAction505 = value
        AppToast.show(this, "Press And Hold Action505: $value")
    }
}

internal fun PlayerActivity.showV505PrimaryAudioTrack505Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v505primaryAudioTrack505).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track505",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v505primaryAudioTrack505 = value
        AppToast.show(this, "Primary Audio Track505: $value")
    }
}

internal fun PlayerActivity.showV505PrintAutoFormat505Toggle() {
    val current = BiliClient.prefs.v505printAutoFormat505
    BiliClient.prefs.v505printAutoFormat505 = !current
    AppToast.show(this, "Print Auto Format505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PriorityQueueEnabled505Toggle() {
    val current = BiliClient.prefs.v505priorityQueueEnabled505
    BiliClient.prefs.v505priorityQueueEnabled505 = !current
    AppToast.show(this, "Priority Queue Enabled505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV505PrivateModeAuto505Toggle() {
    val current = BiliClient.prefs.v505privateModeAuto505
    BiliClient.prefs.v505privateModeAuto505 = !current
    AppToast.show(this, "Private Mode Auto505: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PlaceAutoDetect506Toggle() {
    val current = BiliClient.prefs.v506placeAutoDetect506
    BiliClient.prefs.v506placeAutoDetect506 = !current
    AppToast.show(this, "Place Auto Detect506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PlatformAutoAdapt506Toggle() {
    val current = BiliClient.prefs.v506platformAutoAdapt506
    BiliClient.prefs.v506platformAutoAdapt506 = !current
    AppToast.show(this, "Platform Auto Adapt506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PlayAutoResume506Toggle() {
    val current = BiliClient.prefs.v506playAutoResume506
    BiliClient.prefs.v506playAutoResume506 = !current
    AppToast.show(this, "Play Auto Resume506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PluginAutoUpdate506Toggle() {
    val current = BiliClient.prefs.v506pluginAutoUpdate506
    BiliClient.prefs.v506pluginAutoUpdate506 = !current
    AppToast.show(this, "Plugin Auto Update506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PopUpAutoDismiss506Toggle() {
    val current = BiliClient.prefs.v506popUpAutoDismiss506
    BiliClient.prefs.v506popUpAutoDismiss506 = !current
    AppToast.show(this, "Pop Up Auto Dismiss506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PortAutoScan506Toggle() {
    val current = BiliClient.prefs.v506portAutoScan506
    BiliClient.prefs.v506portAutoScan506 = !current
    AppToast.show(this, "Port Auto Scan506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PostAutoShare506Toggle() {
    val current = BiliClient.prefs.v506postAutoShare506
    BiliClient.prefs.v506postAutoShare506 = !current
    AppToast.show(this, "Post Auto Share506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PowerSaveMode506Toggle() {
    val current = BiliClient.prefs.v506powerSaveMode506
    BiliClient.prefs.v506powerSaveMode506 = !current
    AppToast.show(this, "Power Save Mode506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PreBufferEnabled506Toggle() {
    val current = BiliClient.prefs.v506preBufferEnabled506
    BiliClient.prefs.v506preBufferEnabled506 = !current
    AppToast.show(this, "Pre Buffer Enabled506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PrefixAutoTrim506Toggle() {
    val current = BiliClient.prefs.v506prefixAutoTrim506
    BiliClient.prefs.v506prefixAutoTrim506 = !current
    AppToast.show(this, "Prefix Auto Trim506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PressAndHoldAction506Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v506pressAndHoldAction506).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action506",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v506pressAndHoldAction506 = value
        AppToast.show(this, "Press And Hold Action506: $value")
    }
}

internal fun PlayerActivity.showV506PrimaryAudioTrack506Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v506primaryAudioTrack506).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track506",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v506primaryAudioTrack506 = value
        AppToast.show(this, "Primary Audio Track506: $value")
    }
}

internal fun PlayerActivity.showV506PrintAutoFormat506Toggle() {
    val current = BiliClient.prefs.v506printAutoFormat506
    BiliClient.prefs.v506printAutoFormat506 = !current
    AppToast.show(this, "Print Auto Format506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PriorityQueueEnabled506Toggle() {
    val current = BiliClient.prefs.v506priorityQueueEnabled506
    BiliClient.prefs.v506priorityQueueEnabled506 = !current
    AppToast.show(this, "Priority Queue Enabled506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV506PrivateModeAuto506Toggle() {
    val current = BiliClient.prefs.v506privateModeAuto506
    BiliClient.prefs.v506privateModeAuto506 = !current
    AppToast.show(this, "Private Mode Auto506: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PlaceAutoDetect507Toggle() {
    val current = BiliClient.prefs.v507placeAutoDetect507
    BiliClient.prefs.v507placeAutoDetect507 = !current
    AppToast.show(this, "Place Auto Detect507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PlatformAutoAdapt507Toggle() {
    val current = BiliClient.prefs.v507platformAutoAdapt507
    BiliClient.prefs.v507platformAutoAdapt507 = !current
    AppToast.show(this, "Platform Auto Adapt507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PlayAutoResume507Toggle() {
    val current = BiliClient.prefs.v507playAutoResume507
    BiliClient.prefs.v507playAutoResume507 = !current
    AppToast.show(this, "Play Auto Resume507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PluginAutoUpdate507Toggle() {
    val current = BiliClient.prefs.v507pluginAutoUpdate507
    BiliClient.prefs.v507pluginAutoUpdate507 = !current
    AppToast.show(this, "Plugin Auto Update507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PopUpAutoDismiss507Toggle() {
    val current = BiliClient.prefs.v507popUpAutoDismiss507
    BiliClient.prefs.v507popUpAutoDismiss507 = !current
    AppToast.show(this, "Pop Up Auto Dismiss507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PortAutoScan507Toggle() {
    val current = BiliClient.prefs.v507portAutoScan507
    BiliClient.prefs.v507portAutoScan507 = !current
    AppToast.show(this, "Port Auto Scan507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PostAutoShare507Toggle() {
    val current = BiliClient.prefs.v507postAutoShare507
    BiliClient.prefs.v507postAutoShare507 = !current
    AppToast.show(this, "Post Auto Share507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PowerSaveMode507Toggle() {
    val current = BiliClient.prefs.v507powerSaveMode507
    BiliClient.prefs.v507powerSaveMode507 = !current
    AppToast.show(this, "Power Save Mode507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PreBufferEnabled507Toggle() {
    val current = BiliClient.prefs.v507preBufferEnabled507
    BiliClient.prefs.v507preBufferEnabled507 = !current
    AppToast.show(this, "Pre Buffer Enabled507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PrefixAutoTrim507Toggle() {
    val current = BiliClient.prefs.v507prefixAutoTrim507
    BiliClient.prefs.v507prefixAutoTrim507 = !current
    AppToast.show(this, "Prefix Auto Trim507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PressAndHoldAction507Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v507pressAndHoldAction507).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action507",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v507pressAndHoldAction507 = value
        AppToast.show(this, "Press And Hold Action507: $value")
    }
}

internal fun PlayerActivity.showV507PrimaryAudioTrack507Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v507primaryAudioTrack507).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track507",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v507primaryAudioTrack507 = value
        AppToast.show(this, "Primary Audio Track507: $value")
    }
}

internal fun PlayerActivity.showV507PrintAutoFormat507Toggle() {
    val current = BiliClient.prefs.v507printAutoFormat507
    BiliClient.prefs.v507printAutoFormat507 = !current
    AppToast.show(this, "Print Auto Format507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PriorityQueueEnabled507Toggle() {
    val current = BiliClient.prefs.v507priorityQueueEnabled507
    BiliClient.prefs.v507priorityQueueEnabled507 = !current
    AppToast.show(this, "Priority Queue Enabled507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV507PrivateModeAuto507Toggle() {
    val current = BiliClient.prefs.v507privateModeAuto507
    BiliClient.prefs.v507privateModeAuto507 = !current
    AppToast.show(this, "Private Mode Auto507: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PlaceAutoDetect508Toggle() {
    val current = BiliClient.prefs.v508placeAutoDetect508
    BiliClient.prefs.v508placeAutoDetect508 = !current
    AppToast.show(this, "Place Auto Detect508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PlatformAutoAdapt508Toggle() {
    val current = BiliClient.prefs.v508platformAutoAdapt508
    BiliClient.prefs.v508platformAutoAdapt508 = !current
    AppToast.show(this, "Platform Auto Adapt508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PlayAutoResume508Toggle() {
    val current = BiliClient.prefs.v508playAutoResume508
    BiliClient.prefs.v508playAutoResume508 = !current
    AppToast.show(this, "Play Auto Resume508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PluginAutoUpdate508Toggle() {
    val current = BiliClient.prefs.v508pluginAutoUpdate508
    BiliClient.prefs.v508pluginAutoUpdate508 = !current
    AppToast.show(this, "Plugin Auto Update508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PopUpAutoDismiss508Toggle() {
    val current = BiliClient.prefs.v508popUpAutoDismiss508
    BiliClient.prefs.v508popUpAutoDismiss508 = !current
    AppToast.show(this, "Pop Up Auto Dismiss508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PortAutoScan508Toggle() {
    val current = BiliClient.prefs.v508portAutoScan508
    BiliClient.prefs.v508portAutoScan508 = !current
    AppToast.show(this, "Port Auto Scan508: ${if (!current) "ON" else "OFF"}")
}

