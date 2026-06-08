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

// v489: Override Global489
internal fun PlayerActivity.showV489OverrideGlobal489Toggle() {
    val current = BiliClient.prefs.v489overrideGlobal489
    BiliClient.prefs.v489overrideGlobal489 = !current
    AppToast.show(this, "Override Global489: ${if (!current) "ON" else "OFF"}")
}

// v489: Pack Auto Compress489
internal fun PlayerActivity.showV489PackAutoCompress489Toggle() {
    val current = BiliClient.prefs.v489packAutoCompress489
    BiliClient.prefs.v489packAutoCompress489 = !current
    AppToast.show(this, "Pack Auto Compress489: ${if (!current) "ON" else "OFF"}")
}

// v490: Module Auto Load490
internal fun PlayerActivity.showV490ModuleAutoLoad490Toggle() {
    val current = BiliClient.prefs.v490moduleAutoLoad490
    BiliClient.prefs.v490moduleAutoLoad490 = !current
    AppToast.show(this, "Module Auto Load490: ${if (!current) "ON" else "OFF"}")
}

// v490: Monitor CPU Usage490
internal fun PlayerActivity.showV490MonitorCpuUsage490Toggle() {
    val current = BiliClient.prefs.v490monitorCpuUsage490
    BiliClient.prefs.v490monitorCpuUsage490 = !current
    AppToast.show(this, "Monitor CPU Usage490: ${if (!current) "ON" else "OFF"}")
}

// v490: Mount Auto Detect490
internal fun PlayerActivity.showV490MountAutoDetect490Toggle() {
    val current = BiliClient.prefs.v490mountAutoDetect490
    BiliClient.prefs.v490mountAutoDetect490 = !current
    AppToast.show(this, "Mount Auto Detect490: ${if (!current) "ON" else "OFF"}")
}

// v490: Mouse Hover Preview490
internal fun PlayerActivity.showV490MouseHoverPreview490Toggle() {
    val current = BiliClient.prefs.v490mouseHoverPreview490
    BiliClient.prefs.v490mouseHoverPreview490 = !current
    AppToast.show(this, "Mouse Hover Preview490: ${if (!current) "ON" else "OFF"}")
}

// v490: Move Transition490
internal fun PlayerActivity.showV490MoveTransition490Toggle() {
    val current = BiliClient.prefs.v490moveTransition490
    BiliClient.prefs.v490moveTransition490 = !current
    AppToast.show(this, "Move Transition490: ${if (!current) "ON" else "OFF"}")
}

// v490: Multi Thread Decode490
internal fun PlayerActivity.showV490MultiThreadDecode490Toggle() {
    val current = BiliClient.prefs.v490multiThreadDecode490
    BiliClient.prefs.v490multiThreadDecode490 = !current
    AppToast.show(this, "Multi Thread Decode490: ${if (!current) "ON" else "OFF"}")
}

// v490: Nav Auto Collapse490
internal fun PlayerActivity.showV490NavAutoCollapse490Toggle() {
    val current = BiliClient.prefs.v490navAutoCollapse490
    BiliClient.prefs.v490navAutoCollapse490 = !current
    AppToast.show(this, "Nav Auto Collapse490: ${if (!current) "ON" else "OFF"}")
}

// v490: Node Auto Connect490
internal fun PlayerActivity.showV490NodeAutoConnect490Toggle() {
    val current = BiliClient.prefs.v490nodeAutoConnect490
    BiliClient.prefs.v490nodeAutoConnect490 = !current
    AppToast.show(this, "Node Auto Connect490: ${if (!current) "ON" else "OFF"}")
}

// v490: Offset Auto Calibrate490
internal fun PlayerActivity.showV490OffsetAutoCalibrate490Toggle() {
    val current = BiliClient.prefs.v490offsetAutoCalibrate490
    BiliClient.prefs.v490offsetAutoCalibrate490 = !current
    AppToast.show(this, "Offset Auto Calibrate490: ${if (!current) "ON" else "OFF"}")
}

// v490: Open With External490
internal fun PlayerActivity.showV490OpenWithExternal490Toggle() {
    val current = BiliClient.prefs.v490openWithExternal490
    BiliClient.prefs.v490openWithExternal490 = !current
    AppToast.show(this, "Open With External490: ${if (!current) "ON" else "OFF"}")
}

// v490: Order Auto Sort490
internal fun PlayerActivity.showV490OrderAutoSort490Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v490orderAutoSort490).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort490",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v490orderAutoSort490 = value
        AppToast.show(this, "Order Auto Sort490: $value")
    }
}

// v490: Output Auto Select490
internal fun PlayerActivity.showV490OutputAutoSelect490Toggle() {
    val current = BiliClient.prefs.v490outputAutoSelect490
    BiliClient.prefs.v490outputAutoSelect490 = !current
    AppToast.show(this, "Output Auto Select490: ${if (!current) "ON" else "OFF"}")
}

// v490: Overlay Auto Show490
internal fun PlayerActivity.showV490OverlayAutoShow490Toggle() {
    val current = BiliClient.prefs.v490overlayAutoShow490
    BiliClient.prefs.v490overlayAutoShow490 = !current
    AppToast.show(this, "Overlay Auto Show490: ${if (!current) "ON" else "OFF"}")
}

// v490: Override Global490
internal fun PlayerActivity.showV490OverrideGlobal490Toggle() {
    val current = BiliClient.prefs.v490overrideGlobal490
    BiliClient.prefs.v490overrideGlobal490 = !current
    AppToast.show(this, "Override Global490: ${if (!current) "ON" else "OFF"}")
}

// v490: Pack Auto Compress490
internal fun PlayerActivity.showV490PackAutoCompress490Toggle() {
    val current = BiliClient.prefs.v490packAutoCompress490
    BiliClient.prefs.v490packAutoCompress490 = !current
    AppToast.show(this, "Pack Auto Compress490: ${if (!current) "ON" else "OFF"}")
}

// v491: Pad Auto Detect491
internal fun PlayerActivity.showV491PadAutoDetect491Toggle() {
    val current = BiliClient.prefs.v491padAutoDetect491
    BiliClient.prefs.v491padAutoDetect491 = !current
    AppToast.show(this, "Pad Auto Detect491: ${if (!current) "ON" else "OFF"}")
}

// v491: Parent Control Pin491
internal fun PlayerActivity.showV491ParentControlPin491Toggle() {
    val current = BiliClient.prefs.v491parentControlPin491
    BiliClient.prefs.v491parentControlPin491 = !current
    AppToast.show(this, "Parent Control Pin491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pass Through Audio491
internal fun PlayerActivity.showV491PassThroughAudio491Toggle() {
    val current = BiliClient.prefs.v491passThroughAudio491
    BiliClient.prefs.v491passThroughAudio491 = !current
    AppToast.show(this, "Pass Through Audio491: ${if (!current) "ON" else "OFF"}")
}

// v491: Path Auto Resolve491
internal fun PlayerActivity.showV491PathAutoResolve491Toggle() {
    val current = BiliClient.prefs.v491pathAutoResolve491
    BiliClient.prefs.v491pathAutoResolve491 = !current
    AppToast.show(this, "Path Auto Resolve491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pattern Auto Match491
internal fun PlayerActivity.showV491PatternAutoMatch491Toggle() {
    val current = BiliClient.prefs.v491patternAutoMatch491
    BiliClient.prefs.v491patternAutoMatch491 = !current
    AppToast.show(this, "Pattern Auto Match491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pause On Headset491
internal fun PlayerActivity.showV491PauseOnHeadset491Toggle() {
    val current = BiliClient.prefs.v491pauseOnHeadset491
    BiliClient.prefs.v491pauseOnHeadset491 = !current
    AppToast.show(this, "Pause On Headset491: ${if (!current) "ON" else "OFF"}")
}

// v491: Peak Auto Detect491
internal fun PlayerActivity.showV491PeakAutoDetect491Toggle() {
    val current = BiliClient.prefs.v491peakAutoDetect491
    BiliClient.prefs.v491peakAutoDetect491 = !current
    AppToast.show(this, "Peak Auto Detect491: ${if (!current) "ON" else "OFF"}")
}

// v491: Period Auto Extend491
internal fun PlayerActivity.showV491PeriodAutoExtend491Toggle() {
    val current = BiliClient.prefs.v491periodAutoExtend491
    BiliClient.prefs.v491periodAutoExtend491 = !current
    AppToast.show(this, "Period Auto Extend491: ${if (!current) "ON" else "OFF"}")
}

// v491: Permission Auto Grant491
internal fun PlayerActivity.showV491PermissionAutoGrant491Toggle() {
    val current = BiliClient.prefs.v491permissionAutoGrant491
    BiliClient.prefs.v491permissionAutoGrant491 = !current
    AppToast.show(this, "Permission Auto Grant491: ${if (!current) "ON" else "OFF"}")
}

// v491: Phase Auto Align491
internal fun PlayerActivity.showV491PhaseAutoAlign491Toggle() {
    val current = BiliClient.prefs.v491phaseAutoAlign491
    BiliClient.prefs.v491phaseAutoAlign491 = !current
    AppToast.show(this, "Phase Auto Align491: ${if (!current) "ON" else "OFF"}")
}

// v491: Phone Auto Answer491
internal fun PlayerActivity.showV491PhoneAutoAnswer491Toggle() {
    val current = BiliClient.prefs.v491phoneAutoAnswer491
    BiliClient.prefs.v491phoneAutoAnswer491 = !current
    AppToast.show(this, "Phone Auto Answer491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pick Auto Confirm491
internal fun PlayerActivity.showV491PickAutoConfirm491Toggle() {
    val current = BiliClient.prefs.v491pickAutoConfirm491
    BiliClient.prefs.v491pickAutoConfirm491 = !current
    AppToast.show(this, "Pick Auto Confirm491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pin To Top491
internal fun PlayerActivity.showV491PinToTop491Toggle() {
    val current = BiliClient.prefs.v491pinToTop491
    BiliClient.prefs.v491pinToTop491 = !current
    AppToast.show(this, "Pin To Top491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pipe Auto Route491
internal fun PlayerActivity.showV491PipeAutoRoute491Toggle() {
    val current = BiliClient.prefs.v491pipeAutoRoute491
    BiliClient.prefs.v491pipeAutoRoute491 = !current
    AppToast.show(this, "Pipe Auto Route491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pixel Auto Correct491
internal fun PlayerActivity.showV491PixelAutoCorrect491Toggle() {
    val current = BiliClient.prefs.v491pixelAutoCorrect491
    BiliClient.prefs.v491pixelAutoCorrect491 = !current
    AppToast.show(this, "Pixel Auto Correct491: ${if (!current) "ON" else "OFF"}")
}

// v492: Pad Auto Detect492
internal fun PlayerActivity.showV492PadAutoDetect492Toggle() {
    val current = BiliClient.prefs.v492padAutoDetect492
    BiliClient.prefs.v492padAutoDetect492 = !current
    AppToast.show(this, "Pad Auto Detect492: ${if (!current) "ON" else "OFF"}")
}

// v492: Parent Control Pin492
internal fun PlayerActivity.showV492ParentControlPin492Toggle() {
    val current = BiliClient.prefs.v492parentControlPin492
    BiliClient.prefs.v492parentControlPin492 = !current
    AppToast.show(this, "Parent Control Pin492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pass Through Audio492
internal fun PlayerActivity.showV492PassThroughAudio492Toggle() {
    val current = BiliClient.prefs.v492passThroughAudio492
    BiliClient.prefs.v492passThroughAudio492 = !current
    AppToast.show(this, "Pass Through Audio492: ${if (!current) "ON" else "OFF"}")
}

// v492: Path Auto Resolve492
internal fun PlayerActivity.showV492PathAutoResolve492Toggle() {
    val current = BiliClient.prefs.v492pathAutoResolve492
    BiliClient.prefs.v492pathAutoResolve492 = !current
    AppToast.show(this, "Path Auto Resolve492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pattern Auto Match492
internal fun PlayerActivity.showV492PatternAutoMatch492Toggle() {
    val current = BiliClient.prefs.v492patternAutoMatch492
    BiliClient.prefs.v492patternAutoMatch492 = !current
    AppToast.show(this, "Pattern Auto Match492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pause On Headset492
internal fun PlayerActivity.showV492PauseOnHeadset492Toggle() {
    val current = BiliClient.prefs.v492pauseOnHeadset492
    BiliClient.prefs.v492pauseOnHeadset492 = !current
    AppToast.show(this, "Pause On Headset492: ${if (!current) "ON" else "OFF"}")
}

// v492: Peak Auto Detect492
internal fun PlayerActivity.showV492PeakAutoDetect492Toggle() {
    val current = BiliClient.prefs.v492peakAutoDetect492
    BiliClient.prefs.v492peakAutoDetect492 = !current
    AppToast.show(this, "Peak Auto Detect492: ${if (!current) "ON" else "OFF"}")
}

// v492: Period Auto Extend492
internal fun PlayerActivity.showV492PeriodAutoExtend492Toggle() {
    val current = BiliClient.prefs.v492periodAutoExtend492
    BiliClient.prefs.v492periodAutoExtend492 = !current
    AppToast.show(this, "Period Auto Extend492: ${if (!current) "ON" else "OFF"}")
}

// v492: Permission Auto Grant492
internal fun PlayerActivity.showV492PermissionAutoGrant492Toggle() {
    val current = BiliClient.prefs.v492permissionAutoGrant492
    BiliClient.prefs.v492permissionAutoGrant492 = !current
    AppToast.show(this, "Permission Auto Grant492: ${if (!current) "ON" else "OFF"}")
}

// v492: Phase Auto Align492
internal fun PlayerActivity.showV492PhaseAutoAlign492Toggle() {
    val current = BiliClient.prefs.v492phaseAutoAlign492
    BiliClient.prefs.v492phaseAutoAlign492 = !current
    AppToast.show(this, "Phase Auto Align492: ${if (!current) "ON" else "OFF"}")
}

// v492: Phone Auto Answer492
internal fun PlayerActivity.showV492PhoneAutoAnswer492Toggle() {
    val current = BiliClient.prefs.v492phoneAutoAnswer492
    BiliClient.prefs.v492phoneAutoAnswer492 = !current
    AppToast.show(this, "Phone Auto Answer492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pick Auto Confirm492
internal fun PlayerActivity.showV492PickAutoConfirm492Toggle() {
    val current = BiliClient.prefs.v492pickAutoConfirm492
    BiliClient.prefs.v492pickAutoConfirm492 = !current
    AppToast.show(this, "Pick Auto Confirm492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pin To Top492
internal fun PlayerActivity.showV492PinToTop492Toggle() {
    val current = BiliClient.prefs.v492pinToTop492
    BiliClient.prefs.v492pinToTop492 = !current
    AppToast.show(this, "Pin To Top492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pipe Auto Route492
internal fun PlayerActivity.showV492PipeAutoRoute492Toggle() {
    val current = BiliClient.prefs.v492pipeAutoRoute492
    BiliClient.prefs.v492pipeAutoRoute492 = !current
    AppToast.show(this, "Pipe Auto Route492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pixel Auto Correct492
internal fun PlayerActivity.showV492PixelAutoCorrect492Toggle() {
    val current = BiliClient.prefs.v492pixelAutoCorrect492
    BiliClient.prefs.v492pixelAutoCorrect492 = !current
    AppToast.show(this, "Pixel Auto Correct492: ${if (!current) "ON" else "OFF"}")
}

// v493: Pad Auto Detect493
internal fun PlayerActivity.showV493PadAutoDetect493Toggle() {
    val current = BiliClient.prefs.v493padAutoDetect493
    BiliClient.prefs.v493padAutoDetect493 = !current
    AppToast.show(this, "Pad Auto Detect493: ${if (!current) "ON" else "OFF"}")
}

// v493: Parent Control Pin493
internal fun PlayerActivity.showV493ParentControlPin493Toggle() {
    val current = BiliClient.prefs.v493parentControlPin493
    BiliClient.prefs.v493parentControlPin493 = !current
    AppToast.show(this, "Parent Control Pin493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pass Through Audio493
internal fun PlayerActivity.showV493PassThroughAudio493Toggle() {
    val current = BiliClient.prefs.v493passThroughAudio493
    BiliClient.prefs.v493passThroughAudio493 = !current
    AppToast.show(this, "Pass Through Audio493: ${if (!current) "ON" else "OFF"}")
}

// v493: Path Auto Resolve493
internal fun PlayerActivity.showV493PathAutoResolve493Toggle() {
    val current = BiliClient.prefs.v493pathAutoResolve493
    BiliClient.prefs.v493pathAutoResolve493 = !current
    AppToast.show(this, "Path Auto Resolve493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pattern Auto Match493
internal fun PlayerActivity.showV493PatternAutoMatch493Toggle() {
    val current = BiliClient.prefs.v493patternAutoMatch493
    BiliClient.prefs.v493patternAutoMatch493 = !current
    AppToast.show(this, "Pattern Auto Match493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pause On Headset493
internal fun PlayerActivity.showV493PauseOnHeadset493Toggle() {
    val current = BiliClient.prefs.v493pauseOnHeadset493
    BiliClient.prefs.v493pauseOnHeadset493 = !current
    AppToast.show(this, "Pause On Headset493: ${if (!current) "ON" else "OFF"}")
}

// v493: Peak Auto Detect493
internal fun PlayerActivity.showV493PeakAutoDetect493Toggle() {
    val current = BiliClient.prefs.v493peakAutoDetect493
    BiliClient.prefs.v493peakAutoDetect493 = !current
    AppToast.show(this, "Peak Auto Detect493: ${if (!current) "ON" else "OFF"}")
}

// v493: Period Auto Extend493
internal fun PlayerActivity.showV493PeriodAutoExtend493Toggle() {
    val current = BiliClient.prefs.v493periodAutoExtend493
    BiliClient.prefs.v493periodAutoExtend493 = !current
    AppToast.show(this, "Period Auto Extend493: ${if (!current) "ON" else "OFF"}")
}

// v493: Permission Auto Grant493
internal fun PlayerActivity.showV493PermissionAutoGrant493Toggle() {
    val current = BiliClient.prefs.v493permissionAutoGrant493
    BiliClient.prefs.v493permissionAutoGrant493 = !current
    AppToast.show(this, "Permission Auto Grant493: ${if (!current) "ON" else "OFF"}")
}

// v493: Phase Auto Align493
internal fun PlayerActivity.showV493PhaseAutoAlign493Toggle() {
    val current = BiliClient.prefs.v493phaseAutoAlign493
    BiliClient.prefs.v493phaseAutoAlign493 = !current
    AppToast.show(this, "Phase Auto Align493: ${if (!current) "ON" else "OFF"}")
}

// v493: Phone Auto Answer493
internal fun PlayerActivity.showV493PhoneAutoAnswer493Toggle() {
    val current = BiliClient.prefs.v493phoneAutoAnswer493
    BiliClient.prefs.v493phoneAutoAnswer493 = !current
    AppToast.show(this, "Phone Auto Answer493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pick Auto Confirm493
internal fun PlayerActivity.showV493PickAutoConfirm493Toggle() {
    val current = BiliClient.prefs.v493pickAutoConfirm493
    BiliClient.prefs.v493pickAutoConfirm493 = !current
    AppToast.show(this, "Pick Auto Confirm493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pin To Top493
internal fun PlayerActivity.showV493PinToTop493Toggle() {
    val current = BiliClient.prefs.v493pinToTop493
    BiliClient.prefs.v493pinToTop493 = !current
    AppToast.show(this, "Pin To Top493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pipe Auto Route493
internal fun PlayerActivity.showV493PipeAutoRoute493Toggle() {
    val current = BiliClient.prefs.v493pipeAutoRoute493
    BiliClient.prefs.v493pipeAutoRoute493 = !current
    AppToast.show(this, "Pipe Auto Route493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pixel Auto Correct493
internal fun PlayerActivity.showV493PixelAutoCorrect493Toggle() {
    val current = BiliClient.prefs.v493pixelAutoCorrect493
    BiliClient.prefs.v493pixelAutoCorrect493 = !current
    AppToast.show(this, "Pixel Auto Correct493: ${if (!current) "ON" else "OFF"}")
}

// v494: Pad Auto Detect494
internal fun PlayerActivity.showV494PadAutoDetect494Toggle() {
    val current = BiliClient.prefs.v494padAutoDetect494
    BiliClient.prefs.v494padAutoDetect494 = !current
    AppToast.show(this, "Pad Auto Detect494: ${if (!current) "ON" else "OFF"}")
}

// v494: Parent Control Pin494
internal fun PlayerActivity.showV494ParentControlPin494Toggle() {
    val current = BiliClient.prefs.v494parentControlPin494
    BiliClient.prefs.v494parentControlPin494 = !current
    AppToast.show(this, "Parent Control Pin494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pass Through Audio494
internal fun PlayerActivity.showV494PassThroughAudio494Toggle() {
    val current = BiliClient.prefs.v494passThroughAudio494
    BiliClient.prefs.v494passThroughAudio494 = !current
    AppToast.show(this, "Pass Through Audio494: ${if (!current) "ON" else "OFF"}")
}

// v494: Path Auto Resolve494
internal fun PlayerActivity.showV494PathAutoResolve494Toggle() {
    val current = BiliClient.prefs.v494pathAutoResolve494
    BiliClient.prefs.v494pathAutoResolve494 = !current
    AppToast.show(this, "Path Auto Resolve494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pattern Auto Match494
internal fun PlayerActivity.showV494PatternAutoMatch494Toggle() {
    val current = BiliClient.prefs.v494patternAutoMatch494
    BiliClient.prefs.v494patternAutoMatch494 = !current
    AppToast.show(this, "Pattern Auto Match494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pause On Headset494
internal fun PlayerActivity.showV494PauseOnHeadset494Toggle() {
    val current = BiliClient.prefs.v494pauseOnHeadset494
    BiliClient.prefs.v494pauseOnHeadset494 = !current
    AppToast.show(this, "Pause On Headset494: ${if (!current) "ON" else "OFF"}")
}

// v494: Peak Auto Detect494
internal fun PlayerActivity.showV494PeakAutoDetect494Toggle() {
    val current = BiliClient.prefs.v494peakAutoDetect494
    BiliClient.prefs.v494peakAutoDetect494 = !current
    AppToast.show(this, "Peak Auto Detect494: ${if (!current) "ON" else "OFF"}")
}

// v494: Period Auto Extend494
internal fun PlayerActivity.showV494PeriodAutoExtend494Toggle() {
    val current = BiliClient.prefs.v494periodAutoExtend494
    BiliClient.prefs.v494periodAutoExtend494 = !current
    AppToast.show(this, "Period Auto Extend494: ${if (!current) "ON" else "OFF"}")
}

// v494: Permission Auto Grant494
internal fun PlayerActivity.showV494PermissionAutoGrant494Toggle() {
    val current = BiliClient.prefs.v494permissionAutoGrant494
    BiliClient.prefs.v494permissionAutoGrant494 = !current
    AppToast.show(this, "Permission Auto Grant494: ${if (!current) "ON" else "OFF"}")
}

// v494: Phase Auto Align494
internal fun PlayerActivity.showV494PhaseAutoAlign494Toggle() {
    val current = BiliClient.prefs.v494phaseAutoAlign494
    BiliClient.prefs.v494phaseAutoAlign494 = !current
    AppToast.show(this, "Phase Auto Align494: ${if (!current) "ON" else "OFF"}")
}

// v494: Phone Auto Answer494
internal fun PlayerActivity.showV494PhoneAutoAnswer494Toggle() {
    val current = BiliClient.prefs.v494phoneAutoAnswer494
    BiliClient.prefs.v494phoneAutoAnswer494 = !current
    AppToast.show(this, "Phone Auto Answer494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pick Auto Confirm494
internal fun PlayerActivity.showV494PickAutoConfirm494Toggle() {
    val current = BiliClient.prefs.v494pickAutoConfirm494
    BiliClient.prefs.v494pickAutoConfirm494 = !current
    AppToast.show(this, "Pick Auto Confirm494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pin To Top494
internal fun PlayerActivity.showV494PinToTop494Toggle() {
    val current = BiliClient.prefs.v494pinToTop494
    BiliClient.prefs.v494pinToTop494 = !current
    AppToast.show(this, "Pin To Top494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pipe Auto Route494
internal fun PlayerActivity.showV494PipeAutoRoute494Toggle() {
    val current = BiliClient.prefs.v494pipeAutoRoute494
    BiliClient.prefs.v494pipeAutoRoute494 = !current
    AppToast.show(this, "Pipe Auto Route494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pixel Auto Correct494
internal fun PlayerActivity.showV494PixelAutoCorrect494Toggle() {
    val current = BiliClient.prefs.v494pixelAutoCorrect494
    BiliClient.prefs.v494pixelAutoCorrect494 = !current
    AppToast.show(this, "Pixel Auto Correct494: ${if (!current) "ON" else "OFF"}")
}

// v495: Pad Auto Detect495
internal fun PlayerActivity.showV495PadAutoDetect495Toggle() {
    val current = BiliClient.prefs.v495padAutoDetect495
    BiliClient.prefs.v495padAutoDetect495 = !current
    AppToast.show(this, "Pad Auto Detect495: ${if (!current) "ON" else "OFF"}")
}

// v495: Parent Control Pin495
internal fun PlayerActivity.showV495ParentControlPin495Toggle() {
    val current = BiliClient.prefs.v495parentControlPin495
    BiliClient.prefs.v495parentControlPin495 = !current
    AppToast.show(this, "Parent Control Pin495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pass Through Audio495
internal fun PlayerActivity.showV495PassThroughAudio495Toggle() {
    val current = BiliClient.prefs.v495passThroughAudio495
    BiliClient.prefs.v495passThroughAudio495 = !current
    AppToast.show(this, "Pass Through Audio495: ${if (!current) "ON" else "OFF"}")
}

// v495: Path Auto Resolve495
internal fun PlayerActivity.showV495PathAutoResolve495Toggle() {
    val current = BiliClient.prefs.v495pathAutoResolve495
    BiliClient.prefs.v495pathAutoResolve495 = !current
    AppToast.show(this, "Path Auto Resolve495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pattern Auto Match495
internal fun PlayerActivity.showV495PatternAutoMatch495Toggle() {
    val current = BiliClient.prefs.v495patternAutoMatch495
    BiliClient.prefs.v495patternAutoMatch495 = !current
    AppToast.show(this, "Pattern Auto Match495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pause On Headset495
internal fun PlayerActivity.showV495PauseOnHeadset495Toggle() {
    val current = BiliClient.prefs.v495pauseOnHeadset495
    BiliClient.prefs.v495pauseOnHeadset495 = !current
    AppToast.show(this, "Pause On Headset495: ${if (!current) "ON" else "OFF"}")
}

// v495: Peak Auto Detect495
internal fun PlayerActivity.showV495PeakAutoDetect495Toggle() {
    val current = BiliClient.prefs.v495peakAutoDetect495
    BiliClient.prefs.v495peakAutoDetect495 = !current
    AppToast.show(this, "Peak Auto Detect495: ${if (!current) "ON" else "OFF"}")
}

// v495: Period Auto Extend495
internal fun PlayerActivity.showV495PeriodAutoExtend495Toggle() {
    val current = BiliClient.prefs.v495periodAutoExtend495
    BiliClient.prefs.v495periodAutoExtend495 = !current
    AppToast.show(this, "Period Auto Extend495: ${if (!current) "ON" else "OFF"}")
}

// v495: Permission Auto Grant495
internal fun PlayerActivity.showV495PermissionAutoGrant495Toggle() {
    val current = BiliClient.prefs.v495permissionAutoGrant495
    BiliClient.prefs.v495permissionAutoGrant495 = !current
    AppToast.show(this, "Permission Auto Grant495: ${if (!current) "ON" else "OFF"}")
}

// v495: Phase Auto Align495
internal fun PlayerActivity.showV495PhaseAutoAlign495Toggle() {
    val current = BiliClient.prefs.v495phaseAutoAlign495
    BiliClient.prefs.v495phaseAutoAlign495 = !current
    AppToast.show(this, "Phase Auto Align495: ${if (!current) "ON" else "OFF"}")
}

// v495: Phone Auto Answer495
internal fun PlayerActivity.showV495PhoneAutoAnswer495Toggle() {
    val current = BiliClient.prefs.v495phoneAutoAnswer495
    BiliClient.prefs.v495phoneAutoAnswer495 = !current
    AppToast.show(this, "Phone Auto Answer495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pick Auto Confirm495
internal fun PlayerActivity.showV495PickAutoConfirm495Toggle() {
    val current = BiliClient.prefs.v495pickAutoConfirm495
    BiliClient.prefs.v495pickAutoConfirm495 = !current
    AppToast.show(this, "Pick Auto Confirm495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pin To Top495
internal fun PlayerActivity.showV495PinToTop495Toggle() {
    val current = BiliClient.prefs.v495pinToTop495
    BiliClient.prefs.v495pinToTop495 = !current
    AppToast.show(this, "Pin To Top495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pipe Auto Route495
internal fun PlayerActivity.showV495PipeAutoRoute495Toggle() {
    val current = BiliClient.prefs.v495pipeAutoRoute495
    BiliClient.prefs.v495pipeAutoRoute495 = !current
    AppToast.show(this, "Pipe Auto Route495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pixel Auto Correct495
internal fun PlayerActivity.showV495PixelAutoCorrect495Toggle() {
    val current = BiliClient.prefs.v495pixelAutoCorrect495
    BiliClient.prefs.v495pixelAutoCorrect495 = !current
    AppToast.show(this, "Pixel Auto Correct495: ${if (!current) "ON" else "OFF"}")
}

// v496: Pad Auto Detect496
internal fun PlayerActivity.showV496PadAutoDetect496Toggle() {
    val current = BiliClient.prefs.v496padAutoDetect496
    BiliClient.prefs.v496padAutoDetect496 = !current
    AppToast.show(this, "Pad Auto Detect496: ${if (!current) "ON" else "OFF"}")
}

// v496: Parent Control Pin496
internal fun PlayerActivity.showV496ParentControlPin496Toggle() {
    val current = BiliClient.prefs.v496parentControlPin496
    BiliClient.prefs.v496parentControlPin496 = !current
    AppToast.show(this, "Parent Control Pin496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pass Through Audio496
internal fun PlayerActivity.showV496PassThroughAudio496Toggle() {
    val current = BiliClient.prefs.v496passThroughAudio496
    BiliClient.prefs.v496passThroughAudio496 = !current
    AppToast.show(this, "Pass Through Audio496: ${if (!current) "ON" else "OFF"}")
}

// v496: Path Auto Resolve496
internal fun PlayerActivity.showV496PathAutoResolve496Toggle() {
    val current = BiliClient.prefs.v496pathAutoResolve496
    BiliClient.prefs.v496pathAutoResolve496 = !current
    AppToast.show(this, "Path Auto Resolve496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pattern Auto Match496
internal fun PlayerActivity.showV496PatternAutoMatch496Toggle() {
    val current = BiliClient.prefs.v496patternAutoMatch496
    BiliClient.prefs.v496patternAutoMatch496 = !current
    AppToast.show(this, "Pattern Auto Match496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pause On Headset496
internal fun PlayerActivity.showV496PauseOnHeadset496Toggle() {
    val current = BiliClient.prefs.v496pauseOnHeadset496
    BiliClient.prefs.v496pauseOnHeadset496 = !current
    AppToast.show(this, "Pause On Headset496: ${if (!current) "ON" else "OFF"}")
}

// v496: Peak Auto Detect496
internal fun PlayerActivity.showV496PeakAutoDetect496Toggle() {
    val current = BiliClient.prefs.v496peakAutoDetect496
    BiliClient.prefs.v496peakAutoDetect496 = !current
    AppToast.show(this, "Peak Auto Detect496: ${if (!current) "ON" else "OFF"}")
}

// v496: Period Auto Extend496
internal fun PlayerActivity.showV496PeriodAutoExtend496Toggle() {
    val current = BiliClient.prefs.v496periodAutoExtend496
    BiliClient.prefs.v496periodAutoExtend496 = !current
    AppToast.show(this, "Period Auto Extend496: ${if (!current) "ON" else "OFF"}")
}

// v496: Permission Auto Grant496
internal fun PlayerActivity.showV496PermissionAutoGrant496Toggle() {
    val current = BiliClient.prefs.v496permissionAutoGrant496
    BiliClient.prefs.v496permissionAutoGrant496 = !current
    AppToast.show(this, "Permission Auto Grant496: ${if (!current) "ON" else "OFF"}")
}

// v496: Phase Auto Align496
internal fun PlayerActivity.showV496PhaseAutoAlign496Toggle() {
    val current = BiliClient.prefs.v496phaseAutoAlign496
    BiliClient.prefs.v496phaseAutoAlign496 = !current
    AppToast.show(this, "Phase Auto Align496: ${if (!current) "ON" else "OFF"}")
}

// v496: Phone Auto Answer496
internal fun PlayerActivity.showV496PhoneAutoAnswer496Toggle() {
    val current = BiliClient.prefs.v496phoneAutoAnswer496
    BiliClient.prefs.v496phoneAutoAnswer496 = !current
    AppToast.show(this, "Phone Auto Answer496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pick Auto Confirm496
internal fun PlayerActivity.showV496PickAutoConfirm496Toggle() {
    val current = BiliClient.prefs.v496pickAutoConfirm496
    BiliClient.prefs.v496pickAutoConfirm496 = !current
    AppToast.show(this, "Pick Auto Confirm496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pin To Top496
internal fun PlayerActivity.showV496PinToTop496Toggle() {
    val current = BiliClient.prefs.v496pinToTop496
    BiliClient.prefs.v496pinToTop496 = !current
    AppToast.show(this, "Pin To Top496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pipe Auto Route496
internal fun PlayerActivity.showV496PipeAutoRoute496Toggle() {
    val current = BiliClient.prefs.v496pipeAutoRoute496
    BiliClient.prefs.v496pipeAutoRoute496 = !current
    AppToast.show(this, "Pipe Auto Route496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pixel Auto Correct496
internal fun PlayerActivity.showV496PixelAutoCorrect496Toggle() {
    val current = BiliClient.prefs.v496pixelAutoCorrect496
    BiliClient.prefs.v496pixelAutoCorrect496 = !current
    AppToast.show(this, "Pixel Auto Correct496: ${if (!current) "ON" else "OFF"}")
}

// v497: Pad Auto Detect497
internal fun PlayerActivity.showV497PadAutoDetect497Toggle() {
    val current = BiliClient.prefs.v497padAutoDetect497
    BiliClient.prefs.v497padAutoDetect497 = !current
    AppToast.show(this, "Pad Auto Detect497: ${if (!current) "ON" else "OFF"}")
}

// v497: Parent Control Pin497
internal fun PlayerActivity.showV497ParentControlPin497Toggle() {
    val current = BiliClient.prefs.v497parentControlPin497
    BiliClient.prefs.v497parentControlPin497 = !current
    AppToast.show(this, "Parent Control Pin497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pass Through Audio497
internal fun PlayerActivity.showV497PassThroughAudio497Toggle() {
    val current = BiliClient.prefs.v497passThroughAudio497
    BiliClient.prefs.v497passThroughAudio497 = !current
    AppToast.show(this, "Pass Through Audio497: ${if (!current) "ON" else "OFF"}")
}

// v497: Path Auto Resolve497
internal fun PlayerActivity.showV497PathAutoResolve497Toggle() {
    val current = BiliClient.prefs.v497pathAutoResolve497
    BiliClient.prefs.v497pathAutoResolve497 = !current
    AppToast.show(this, "Path Auto Resolve497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pattern Auto Match497
internal fun PlayerActivity.showV497PatternAutoMatch497Toggle() {
    val current = BiliClient.prefs.v497patternAutoMatch497
    BiliClient.prefs.v497patternAutoMatch497 = !current
    AppToast.show(this, "Pattern Auto Match497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pause On Headset497
internal fun PlayerActivity.showV497PauseOnHeadset497Toggle() {
    val current = BiliClient.prefs.v497pauseOnHeadset497
    BiliClient.prefs.v497pauseOnHeadset497 = !current
    AppToast.show(this, "Pause On Headset497: ${if (!current) "ON" else "OFF"}")
}

// v497: Peak Auto Detect497
internal fun PlayerActivity.showV497PeakAutoDetect497Toggle() {
    val current = BiliClient.prefs.v497peakAutoDetect497
    BiliClient.prefs.v497peakAutoDetect497 = !current
    AppToast.show(this, "Peak Auto Detect497: ${if (!current) "ON" else "OFF"}")
}

// v497: Period Auto Extend497
internal fun PlayerActivity.showV497PeriodAutoExtend497Toggle() {
    val current = BiliClient.prefs.v497periodAutoExtend497
    BiliClient.prefs.v497periodAutoExtend497 = !current
    AppToast.show(this, "Period Auto Extend497: ${if (!current) "ON" else "OFF"}")
}

// v497: Permission Auto Grant497
internal fun PlayerActivity.showV497PermissionAutoGrant497Toggle() {
    val current = BiliClient.prefs.v497permissionAutoGrant497
    BiliClient.prefs.v497permissionAutoGrant497 = !current
    AppToast.show(this, "Permission Auto Grant497: ${if (!current) "ON" else "OFF"}")
}

// v497: Phase Auto Align497
internal fun PlayerActivity.showV497PhaseAutoAlign497Toggle() {
    val current = BiliClient.prefs.v497phaseAutoAlign497
    BiliClient.prefs.v497phaseAutoAlign497 = !current
    AppToast.show(this, "Phase Auto Align497: ${if (!current) "ON" else "OFF"}")
}

// v497: Phone Auto Answer497
internal fun PlayerActivity.showV497PhoneAutoAnswer497Toggle() {
    val current = BiliClient.prefs.v497phoneAutoAnswer497
    BiliClient.prefs.v497phoneAutoAnswer497 = !current
    AppToast.show(this, "Phone Auto Answer497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pick Auto Confirm497
internal fun PlayerActivity.showV497PickAutoConfirm497Toggle() {
    val current = BiliClient.prefs.v497pickAutoConfirm497
    BiliClient.prefs.v497pickAutoConfirm497 = !current
    AppToast.show(this, "Pick Auto Confirm497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pin To Top497
internal fun PlayerActivity.showV497PinToTop497Toggle() {
    val current = BiliClient.prefs.v497pinToTop497
    BiliClient.prefs.v497pinToTop497 = !current
    AppToast.show(this, "Pin To Top497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pipe Auto Route497
internal fun PlayerActivity.showV497PipeAutoRoute497Toggle() {
    val current = BiliClient.prefs.v497pipeAutoRoute497
    BiliClient.prefs.v497pipeAutoRoute497 = !current
    AppToast.show(this, "Pipe Auto Route497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pixel Auto Correct497
internal fun PlayerActivity.showV497PixelAutoCorrect497Toggle() {
    val current = BiliClient.prefs.v497pixelAutoCorrect497
    BiliClient.prefs.v497pixelAutoCorrect497 = !current
    AppToast.show(this, "Pixel Auto Correct497: ${if (!current) "ON" else "OFF"}")
}

// v498: Pad Auto Detect498
internal fun PlayerActivity.showV498PadAutoDetect498Toggle() {
    val current = BiliClient.prefs.v498padAutoDetect498
    BiliClient.prefs.v498padAutoDetect498 = !current
    AppToast.show(this, "Pad Auto Detect498: ${if (!current) "ON" else "OFF"}")
}

// v498: Parent Control Pin498
internal fun PlayerActivity.showV498ParentControlPin498Toggle() {
    val current = BiliClient.prefs.v498parentControlPin498
    BiliClient.prefs.v498parentControlPin498 = !current
    AppToast.show(this, "Parent Control Pin498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pass Through Audio498
internal fun PlayerActivity.showV498PassThroughAudio498Toggle() {
    val current = BiliClient.prefs.v498passThroughAudio498
    BiliClient.prefs.v498passThroughAudio498 = !current
    AppToast.show(this, "Pass Through Audio498: ${if (!current) "ON" else "OFF"}")
}

// v498: Path Auto Resolve498
internal fun PlayerActivity.showV498PathAutoResolve498Toggle() {
    val current = BiliClient.prefs.v498pathAutoResolve498
    BiliClient.prefs.v498pathAutoResolve498 = !current
    AppToast.show(this, "Path Auto Resolve498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pattern Auto Match498
internal fun PlayerActivity.showV498PatternAutoMatch498Toggle() {
    val current = BiliClient.prefs.v498patternAutoMatch498
    BiliClient.prefs.v498patternAutoMatch498 = !current
    AppToast.show(this, "Pattern Auto Match498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pause On Headset498
internal fun PlayerActivity.showV498PauseOnHeadset498Toggle() {
    val current = BiliClient.prefs.v498pauseOnHeadset498
    BiliClient.prefs.v498pauseOnHeadset498 = !current
    AppToast.show(this, "Pause On Headset498: ${if (!current) "ON" else "OFF"}")
}

// v498: Peak Auto Detect498
internal fun PlayerActivity.showV498PeakAutoDetect498Toggle() {
    val current = BiliClient.prefs.v498peakAutoDetect498
    BiliClient.prefs.v498peakAutoDetect498 = !current
    AppToast.show(this, "Peak Auto Detect498: ${if (!current) "ON" else "OFF"}")
}

// v498: Period Auto Extend498
internal fun PlayerActivity.showV498PeriodAutoExtend498Toggle() {
    val current = BiliClient.prefs.v498periodAutoExtend498
    BiliClient.prefs.v498periodAutoExtend498 = !current
    AppToast.show(this, "Period Auto Extend498: ${if (!current) "ON" else "OFF"}")
}

// v498: Permission Auto Grant498
internal fun PlayerActivity.showV498PermissionAutoGrant498Toggle() {
    val current = BiliClient.prefs.v498permissionAutoGrant498
    BiliClient.prefs.v498permissionAutoGrant498 = !current
    AppToast.show(this, "Permission Auto Grant498: ${if (!current) "ON" else "OFF"}")
}

// v498: Phase Auto Align498
internal fun PlayerActivity.showV498PhaseAutoAlign498Toggle() {
    val current = BiliClient.prefs.v498phaseAutoAlign498
    BiliClient.prefs.v498phaseAutoAlign498 = !current
    AppToast.show(this, "Phase Auto Align498: ${if (!current) "ON" else "OFF"}")
}

// v498: Phone Auto Answer498
internal fun PlayerActivity.showV498PhoneAutoAnswer498Toggle() {
    val current = BiliClient.prefs.v498phoneAutoAnswer498
    BiliClient.prefs.v498phoneAutoAnswer498 = !current
    AppToast.show(this, "Phone Auto Answer498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pick Auto Confirm498
internal fun PlayerActivity.showV498PickAutoConfirm498Toggle() {
    val current = BiliClient.prefs.v498pickAutoConfirm498
    BiliClient.prefs.v498pickAutoConfirm498 = !current
    AppToast.show(this, "Pick Auto Confirm498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pin To Top498
internal fun PlayerActivity.showV498PinToTop498Toggle() {
    val current = BiliClient.prefs.v498pinToTop498
    BiliClient.prefs.v498pinToTop498 = !current
    AppToast.show(this, "Pin To Top498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pipe Auto Route498
internal fun PlayerActivity.showV498PipeAutoRoute498Toggle() {
    val current = BiliClient.prefs.v498pipeAutoRoute498
    BiliClient.prefs.v498pipeAutoRoute498 = !current
    AppToast.show(this, "Pipe Auto Route498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pixel Auto Correct498
internal fun PlayerActivity.showV498PixelAutoCorrect498Toggle() {
    val current = BiliClient.prefs.v498pixelAutoCorrect498
    BiliClient.prefs.v498pixelAutoCorrect498 = !current
    AppToast.show(this, "Pixel Auto Correct498: ${if (!current) "ON" else "OFF"}")
}

// v499: Pad Auto Detect499
internal fun PlayerActivity.showV499PadAutoDetect499Toggle() {
    val current = BiliClient.prefs.v499padAutoDetect499
    BiliClient.prefs.v499padAutoDetect499 = !current
    AppToast.show(this, "Pad Auto Detect499: ${if (!current) "ON" else "OFF"}")
}

// v499: Parent Control Pin499
internal fun PlayerActivity.showV499ParentControlPin499Toggle() {
    val current = BiliClient.prefs.v499parentControlPin499
    BiliClient.prefs.v499parentControlPin499 = !current
    AppToast.show(this, "Parent Control Pin499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pass Through Audio499
internal fun PlayerActivity.showV499PassThroughAudio499Toggle() {
    val current = BiliClient.prefs.v499passThroughAudio499
    BiliClient.prefs.v499passThroughAudio499 = !current
    AppToast.show(this, "Pass Through Audio499: ${if (!current) "ON" else "OFF"}")
}

// v499: Path Auto Resolve499
internal fun PlayerActivity.showV499PathAutoResolve499Toggle() {
    val current = BiliClient.prefs.v499pathAutoResolve499
    BiliClient.prefs.v499pathAutoResolve499 = !current
    AppToast.show(this, "Path Auto Resolve499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pattern Auto Match499
internal fun PlayerActivity.showV499PatternAutoMatch499Toggle() {
    val current = BiliClient.prefs.v499patternAutoMatch499
    BiliClient.prefs.v499patternAutoMatch499 = !current
    AppToast.show(this, "Pattern Auto Match499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pause On Headset499
internal fun PlayerActivity.showV499PauseOnHeadset499Toggle() {
    val current = BiliClient.prefs.v499pauseOnHeadset499
    BiliClient.prefs.v499pauseOnHeadset499 = !current
    AppToast.show(this, "Pause On Headset499: ${if (!current) "ON" else "OFF"}")
}

// v499: Peak Auto Detect499
internal fun PlayerActivity.showV499PeakAutoDetect499Toggle() {
    val current = BiliClient.prefs.v499peakAutoDetect499
    BiliClient.prefs.v499peakAutoDetect499 = !current
    AppToast.show(this, "Peak Auto Detect499: ${if (!current) "ON" else "OFF"}")
}

// v499: Period Auto Extend499
internal fun PlayerActivity.showV499PeriodAutoExtend499Toggle() {
    val current = BiliClient.prefs.v499periodAutoExtend499
    BiliClient.prefs.v499periodAutoExtend499 = !current
    AppToast.show(this, "Period Auto Extend499: ${if (!current) "ON" else "OFF"}")
}

// v499: Permission Auto Grant499
internal fun PlayerActivity.showV499PermissionAutoGrant499Toggle() {
    val current = BiliClient.prefs.v499permissionAutoGrant499
    BiliClient.prefs.v499permissionAutoGrant499 = !current
    AppToast.show(this, "Permission Auto Grant499: ${if (!current) "ON" else "OFF"}")
}

// v499: Phase Auto Align499
internal fun PlayerActivity.showV499PhaseAutoAlign499Toggle() {
    val current = BiliClient.prefs.v499phaseAutoAlign499
    BiliClient.prefs.v499phaseAutoAlign499 = !current
    AppToast.show(this, "Phase Auto Align499: ${if (!current) "ON" else "OFF"}")
}

// v499: Phone Auto Answer499
internal fun PlayerActivity.showV499PhoneAutoAnswer499Toggle() {
    val current = BiliClient.prefs.v499phoneAutoAnswer499
    BiliClient.prefs.v499phoneAutoAnswer499 = !current
    AppToast.show(this, "Phone Auto Answer499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pick Auto Confirm499
internal fun PlayerActivity.showV499PickAutoConfirm499Toggle() {
    val current = BiliClient.prefs.v499pickAutoConfirm499
    BiliClient.prefs.v499pickAutoConfirm499 = !current
    AppToast.show(this, "Pick Auto Confirm499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pin To Top499
internal fun PlayerActivity.showV499PinToTop499Toggle() {
    val current = BiliClient.prefs.v499pinToTop499
    BiliClient.prefs.v499pinToTop499 = !current
    AppToast.show(this, "Pin To Top499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pipe Auto Route499
internal fun PlayerActivity.showV499PipeAutoRoute499Toggle() {
    val current = BiliClient.prefs.v499pipeAutoRoute499
    BiliClient.prefs.v499pipeAutoRoute499 = !current
    AppToast.show(this, "Pipe Auto Route499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pixel Auto Correct499
internal fun PlayerActivity.showV499PixelAutoCorrect499Toggle() {
    val current = BiliClient.prefs.v499pixelAutoCorrect499
    BiliClient.prefs.v499pixelAutoCorrect499 = !current
    AppToast.show(this, "Pixel Auto Correct499: ${if (!current) "ON" else "OFF"}")
}

// v500: Pad Auto Detect500
internal fun PlayerActivity.showV500PadAutoDetect500Toggle() {
    val current = BiliClient.prefs.v500padAutoDetect500
    BiliClient.prefs.v500padAutoDetect500 = !current
    AppToast.show(this, "Pad Auto Detect500: ${if (!current) "ON" else "OFF"}")
}

// v500: Parent Control Pin500
internal fun PlayerActivity.showV500ParentControlPin500Toggle() {
    val current = BiliClient.prefs.v500parentControlPin500
    BiliClient.prefs.v500parentControlPin500 = !current
    AppToast.show(this, "Parent Control Pin500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pass Through Audio500
internal fun PlayerActivity.showV500PassThroughAudio500Toggle() {
    val current = BiliClient.prefs.v500passThroughAudio500
    BiliClient.prefs.v500passThroughAudio500 = !current
    AppToast.show(this, "Pass Through Audio500: ${if (!current) "ON" else "OFF"}")
}

// v500: Path Auto Resolve500
internal fun PlayerActivity.showV500PathAutoResolve500Toggle() {
    val current = BiliClient.prefs.v500pathAutoResolve500
    BiliClient.prefs.v500pathAutoResolve500 = !current
    AppToast.show(this, "Path Auto Resolve500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pattern Auto Match500
internal fun PlayerActivity.showV500PatternAutoMatch500Toggle() {
    val current = BiliClient.prefs.v500patternAutoMatch500
    BiliClient.prefs.v500patternAutoMatch500 = !current
    AppToast.show(this, "Pattern Auto Match500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pause On Headset500
internal fun PlayerActivity.showV500PauseOnHeadset500Toggle() {
    val current = BiliClient.prefs.v500pauseOnHeadset500
    BiliClient.prefs.v500pauseOnHeadset500 = !current
    AppToast.show(this, "Pause On Headset500: ${if (!current) "ON" else "OFF"}")
}

// v500: Peak Auto Detect500
internal fun PlayerActivity.showV500PeakAutoDetect500Toggle() {
    val current = BiliClient.prefs.v500peakAutoDetect500
    BiliClient.prefs.v500peakAutoDetect500 = !current
    AppToast.show(this, "Peak Auto Detect500: ${if (!current) "ON" else "OFF"}")
}

// v500: Period Auto Extend500
internal fun PlayerActivity.showV500PeriodAutoExtend500Toggle() {
    val current = BiliClient.prefs.v500periodAutoExtend500
    BiliClient.prefs.v500periodAutoExtend500 = !current
    AppToast.show(this, "Period Auto Extend500: ${if (!current) "ON" else "OFF"}")
}

// v500: Permission Auto Grant500
internal fun PlayerActivity.showV500PermissionAutoGrant500Toggle() {
    val current = BiliClient.prefs.v500permissionAutoGrant500
    BiliClient.prefs.v500permissionAutoGrant500 = !current
    AppToast.show(this, "Permission Auto Grant500: ${if (!current) "ON" else "OFF"}")
}

// v500: Phase Auto Align500
internal fun PlayerActivity.showV500PhaseAutoAlign500Toggle() {
    val current = BiliClient.prefs.v500phaseAutoAlign500
    BiliClient.prefs.v500phaseAutoAlign500 = !current
    AppToast.show(this, "Phase Auto Align500: ${if (!current) "ON" else "OFF"}")
}

// v500: Phone Auto Answer500
internal fun PlayerActivity.showV500PhoneAutoAnswer500Toggle() {
    val current = BiliClient.prefs.v500phoneAutoAnswer500
    BiliClient.prefs.v500phoneAutoAnswer500 = !current
    AppToast.show(this, "Phone Auto Answer500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pick Auto Confirm500
internal fun PlayerActivity.showV500PickAutoConfirm500Toggle() {
    val current = BiliClient.prefs.v500pickAutoConfirm500
    BiliClient.prefs.v500pickAutoConfirm500 = !current
    AppToast.show(this, "Pick Auto Confirm500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pin To Top500
internal fun PlayerActivity.showV500PinToTop500Toggle() {
    val current = BiliClient.prefs.v500pinToTop500
    BiliClient.prefs.v500pinToTop500 = !current
    AppToast.show(this, "Pin To Top500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pipe Auto Route500
internal fun PlayerActivity.showV500PipeAutoRoute500Toggle() {
    val current = BiliClient.prefs.v500pipeAutoRoute500
    BiliClient.prefs.v500pipeAutoRoute500 = !current
    AppToast.show(this, "Pipe Auto Route500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pixel Auto Correct500
internal fun PlayerActivity.showV500PixelAutoCorrect500Toggle() {
    val current = BiliClient.prefs.v500pixelAutoCorrect500
    BiliClient.prefs.v500pixelAutoCorrect500 = !current
    AppToast.show(this, "Pixel Auto Correct500: ${if (!current) "ON" else "OFF"}")
}

// v501: Place Auto Detect501
internal fun PlayerActivity.showV501PlaceAutoDetect501Toggle() {
    val current = BiliClient.prefs.v501placeAutoDetect501
    BiliClient.prefs.v501placeAutoDetect501 = !current
    AppToast.show(this, "Place Auto Detect501: ${if (!current) "ON" else "OFF"}")
}

// v501: Platform Auto Adapt501
internal fun PlayerActivity.showV501PlatformAutoAdapt501Toggle() {
    val current = BiliClient.prefs.v501platformAutoAdapt501
    BiliClient.prefs.v501platformAutoAdapt501 = !current
    AppToast.show(this, "Platform Auto Adapt501: ${if (!current) "ON" else "OFF"}")
}

// v501: Play Auto Resume501
internal fun PlayerActivity.showV501PlayAutoResume501Toggle() {
    val current = BiliClient.prefs.v501playAutoResume501
    BiliClient.prefs.v501playAutoResume501 = !current
    AppToast.show(this, "Play Auto Resume501: ${if (!current) "ON" else "OFF"}")
}

// v501: Plugin Auto Update501
internal fun PlayerActivity.showV501PluginAutoUpdate501Toggle() {
    val current = BiliClient.prefs.v501pluginAutoUpdate501
    BiliClient.prefs.v501pluginAutoUpdate501 = !current
    AppToast.show(this, "Plugin Auto Update501: ${if (!current) "ON" else "OFF"}")
}

// v501: Pop Up Auto Dismiss501
internal fun PlayerActivity.showV501PopUpAutoDismiss501Toggle() {
    val current = BiliClient.prefs.v501popUpAutoDismiss501
    BiliClient.prefs.v501popUpAutoDismiss501 = !current
    AppToast.show(this, "Pop Up Auto Dismiss501: ${if (!current) "ON" else "OFF"}")
}

// v501: Port Auto Scan501
internal fun PlayerActivity.showV501PortAutoScan501Toggle() {
    val current = BiliClient.prefs.v501portAutoScan501
    BiliClient.prefs.v501portAutoScan501 = !current
    AppToast.show(this, "Port Auto Scan501: ${if (!current) "ON" else "OFF"}")
}

// v501: Post Auto Share501
internal fun PlayerActivity.showV501PostAutoShare501Toggle() {
    val current = BiliClient.prefs.v501postAutoShare501
    BiliClient.prefs.v501postAutoShare501 = !current
    AppToast.show(this, "Post Auto Share501: ${if (!current) "ON" else "OFF"}")
}

// v501: Power Save Mode501
internal fun PlayerActivity.showV501PowerSaveMode501Toggle() {
    val current = BiliClient.prefs.v501powerSaveMode501
    BiliClient.prefs.v501powerSaveMode501 = !current
    AppToast.show(this, "Power Save Mode501: ${if (!current) "ON" else "OFF"}")
}

// v501: Pre Buffer Enabled501
internal fun PlayerActivity.showV501PreBufferEnabled501Toggle() {
    val current = BiliClient.prefs.v501preBufferEnabled501
    BiliClient.prefs.v501preBufferEnabled501 = !current
    AppToast.show(this, "Pre Buffer Enabled501: ${if (!current) "ON" else "OFF"}")
}

// v501: Prefix Auto Trim501
internal fun PlayerActivity.showV501PrefixAutoTrim501Toggle() {
    val current = BiliClient.prefs.v501prefixAutoTrim501
    BiliClient.prefs.v501prefixAutoTrim501 = !current
    AppToast.show(this, "Prefix Auto Trim501: ${if (!current) "ON" else "OFF"}")
}

// v501: Press And Hold Action501
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

// v501: Primary Audio Track501
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

// v501: Print Auto Format501
internal fun PlayerActivity.showV501PrintAutoFormat501Toggle() {
    val current = BiliClient.prefs.v501printAutoFormat501
    BiliClient.prefs.v501printAutoFormat501 = !current
    AppToast.show(this, "Print Auto Format501: ${if (!current) "ON" else "OFF"}")
}

// v501: Priority Queue Enabled501
internal fun PlayerActivity.showV501PriorityQueueEnabled501Toggle() {
    val current = BiliClient.prefs.v501priorityQueueEnabled501
    BiliClient.prefs.v501priorityQueueEnabled501 = !current
    AppToast.show(this, "Priority Queue Enabled501: ${if (!current) "ON" else "OFF"}")
}

// v501: Private Mode Auto501
internal fun PlayerActivity.showV501PrivateModeAuto501Toggle() {
    val current = BiliClient.prefs.v501privateModeAuto501
    BiliClient.prefs.v501privateModeAuto501 = !current
    AppToast.show(this, "Private Mode Auto501: ${if (!current) "ON" else "OFF"}")
}

// v502: Place Auto Detect502
internal fun PlayerActivity.showV502PlaceAutoDetect502Toggle() {
    val current = BiliClient.prefs.v502placeAutoDetect502
    BiliClient.prefs.v502placeAutoDetect502 = !current
    AppToast.show(this, "Place Auto Detect502: ${if (!current) "ON" else "OFF"}")
}

// v502: Platform Auto Adapt502
internal fun PlayerActivity.showV502PlatformAutoAdapt502Toggle() {
    val current = BiliClient.prefs.v502platformAutoAdapt502
    BiliClient.prefs.v502platformAutoAdapt502 = !current
    AppToast.show(this, "Platform Auto Adapt502: ${if (!current) "ON" else "OFF"}")
}

// v502: Play Auto Resume502
internal fun PlayerActivity.showV502PlayAutoResume502Toggle() {
    val current = BiliClient.prefs.v502playAutoResume502
    BiliClient.prefs.v502playAutoResume502 = !current
    AppToast.show(this, "Play Auto Resume502: ${if (!current) "ON" else "OFF"}")
}

// v502: Plugin Auto Update502
internal fun PlayerActivity.showV502PluginAutoUpdate502Toggle() {
    val current = BiliClient.prefs.v502pluginAutoUpdate502
    BiliClient.prefs.v502pluginAutoUpdate502 = !current
    AppToast.show(this, "Plugin Auto Update502: ${if (!current) "ON" else "OFF"}")
}

// v502: Pop Up Auto Dismiss502
internal fun PlayerActivity.showV502PopUpAutoDismiss502Toggle() {
    val current = BiliClient.prefs.v502popUpAutoDismiss502
    BiliClient.prefs.v502popUpAutoDismiss502 = !current
    AppToast.show(this, "Pop Up Auto Dismiss502: ${if (!current) "ON" else "OFF"}")
}

// v502: Port Auto Scan502
internal fun PlayerActivity.showV502PortAutoScan502Toggle() {
    val current = BiliClient.prefs.v502portAutoScan502
    BiliClient.prefs.v502portAutoScan502 = !current
    AppToast.show(this, "Port Auto Scan502: ${if (!current) "ON" else "OFF"}")
}

// v502: Post Auto Share502
internal fun PlayerActivity.showV502PostAutoShare502Toggle() {
    val current = BiliClient.prefs.v502postAutoShare502
    BiliClient.prefs.v502postAutoShare502 = !current
    AppToast.show(this, "Post Auto Share502: ${if (!current) "ON" else "OFF"}")
}

// v502: Power Save Mode502
internal fun PlayerActivity.showV502PowerSaveMode502Toggle() {
    val current = BiliClient.prefs.v502powerSaveMode502
    BiliClient.prefs.v502powerSaveMode502 = !current
    AppToast.show(this, "Power Save Mode502: ${if (!current) "ON" else "OFF"}")
}

// v502: Pre Buffer Enabled502
internal fun PlayerActivity.showV502PreBufferEnabled502Toggle() {
    val current = BiliClient.prefs.v502preBufferEnabled502
    BiliClient.prefs.v502preBufferEnabled502 = !current
    AppToast.show(this, "Pre Buffer Enabled502: ${if (!current) "ON" else "OFF"}")
}

// v502: Prefix Auto Trim502
internal fun PlayerActivity.showV502PrefixAutoTrim502Toggle() {
    val current = BiliClient.prefs.v502prefixAutoTrim502
    BiliClient.prefs.v502prefixAutoTrim502 = !current
    AppToast.show(this, "Prefix Auto Trim502: ${if (!current) "ON" else "OFF"}")
}

// v502: Press And Hold Action502
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

// v502: Primary Audio Track502
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

// v502: Print Auto Format502
internal fun PlayerActivity.showV502PrintAutoFormat502Toggle() {
    val current = BiliClient.prefs.v502printAutoFormat502
    BiliClient.prefs.v502printAutoFormat502 = !current
    AppToast.show(this, "Print Auto Format502: ${if (!current) "ON" else "OFF"}")
}

// v502: Priority Queue Enabled502
internal fun PlayerActivity.showV502PriorityQueueEnabled502Toggle() {
    val current = BiliClient.prefs.v502priorityQueueEnabled502
    BiliClient.prefs.v502priorityQueueEnabled502 = !current
    AppToast.show(this, "Priority Queue Enabled502: ${if (!current) "ON" else "OFF"}")
}

// v502: Private Mode Auto502
internal fun PlayerActivity.showV502PrivateModeAuto502Toggle() {
    val current = BiliClient.prefs.v502privateModeAuto502
    BiliClient.prefs.v502privateModeAuto502 = !current
    AppToast.show(this, "Private Mode Auto502: ${if (!current) "ON" else "OFF"}")
}

// v503: Place Auto Detect503
internal fun PlayerActivity.showV503PlaceAutoDetect503Toggle() {
    val current = BiliClient.prefs.v503placeAutoDetect503
    BiliClient.prefs.v503placeAutoDetect503 = !current
    AppToast.show(this, "Place Auto Detect503: ${if (!current) "ON" else "OFF"}")
}

// v503: Platform Auto Adapt503
internal fun PlayerActivity.showV503PlatformAutoAdapt503Toggle() {
    val current = BiliClient.prefs.v503platformAutoAdapt503
    BiliClient.prefs.v503platformAutoAdapt503 = !current
    AppToast.show(this, "Platform Auto Adapt503: ${if (!current) "ON" else "OFF"}")
}

// v503: Play Auto Resume503
internal fun PlayerActivity.showV503PlayAutoResume503Toggle() {
    val current = BiliClient.prefs.v503playAutoResume503
    BiliClient.prefs.v503playAutoResume503 = !current
    AppToast.show(this, "Play Auto Resume503: ${if (!current) "ON" else "OFF"}")
}

