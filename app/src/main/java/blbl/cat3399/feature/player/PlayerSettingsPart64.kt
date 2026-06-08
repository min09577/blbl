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

// v821: Modify Auto Patch821
internal fun PlayerActivity.showV821ModifyAutoPatch821Toggle() {
    val current = BiliClient.prefs.v821modifyAutoPatch821
    BiliClient.prefs.v821modifyAutoPatch821 = !current
    AppToast.show(this, "Modify Auto Patch821: ${if (!current) "ON" else "OFF"}")
}

// v821: Module Auto Load821
internal fun PlayerActivity.showV821ModuleAutoLoad821Toggle() {
    val current = BiliClient.prefs.v821moduleAutoLoad821
    BiliClient.prefs.v821moduleAutoLoad821 = !current
    AppToast.show(this, "Module Auto Load821: ${if (!current) "ON" else "OFF"}")
}

// v821: Moment Auto Capture821
internal fun PlayerActivity.showV821MomentAutoCapture821Toggle() {
    val current = BiliClient.prefs.v821momentAutoCapture821
    BiliClient.prefs.v821momentAutoCapture821 = !current
    AppToast.show(this, "Moment Auto Capture821: ${if (!current) "ON" else "OFF"}")
}

// v821: Monitor Auto Watchdog821
internal fun PlayerActivity.showV821MonitorAutoWatchdog821Toggle() {
    val current = BiliClient.prefs.v821monitorAutoWatchdog821
    BiliClient.prefs.v821monitorAutoWatchdog821 = !current
    AppToast.show(this, "Monitor Auto Watchdog821: ${if (!current) "ON" else "OFF"}")
}

// v821: Motion Auto Blur821
internal fun PlayerActivity.showV821MotionAutoBlur821Toggle() {
    val current = BiliClient.prefs.v821motionAutoBlur821
    BiliClient.prefs.v821motionAutoBlur821 = !current
    AppToast.show(this, "Motion Auto Blur821: ${if (!current) "ON" else "OFF"}")
}

// v821: Mount Auto Bind821
internal fun PlayerActivity.showV821MountAutoBind821Toggle() {
    val current = BiliClient.prefs.v821mountAutoBind821
    BiliClient.prefs.v821mountAutoBind821 = !current
    AppToast.show(this, "Mount Auto Bind821: ${if (!current) "ON" else "OFF"}")
}

// v821: Mouse Auto Scroll821
internal fun PlayerActivity.showV821MouseAutoScroll821Toggle() {
    val current = BiliClient.prefs.v821mouseAutoScroll821
    BiliClient.prefs.v821mouseAutoScroll821 = !current
    AppToast.show(this, "Mouse Auto Scroll821: ${if (!current) "ON" else "OFF"}")
}

// v821: Move Auto Transition821
internal fun PlayerActivity.showV821MoveAutoTransition821Toggle() {
    val current = BiliClient.prefs.v821moveAutoTransition821
    BiliClient.prefs.v821moveAutoTransition821 = !current
    AppToast.show(this, "Move Auto Transition821: ${if (!current) "ON" else "OFF"}")
}

// v821: Multi Auto Thread821
internal fun PlayerActivity.showV821MultiAutoThread821Toggle() {
    val current = BiliClient.prefs.v821multiAutoThread821
    BiliClient.prefs.v821multiAutoThread821 = !current
    AppToast.show(this, "Multi Auto Thread821: ${if (!current) "ON" else "OFF"}")
}

// v821: Name Auto Resolve821
internal fun PlayerActivity.showV821NameAutoResolve821Toggle() {
    val current = BiliClient.prefs.v821nameAutoResolve821
    BiliClient.prefs.v821nameAutoResolve821 = !current
    AppToast.show(this, "Name Auto Resolve821: ${if (!current) "ON" else "OFF"}")
}

// v821: Native Auto Bridge821
internal fun PlayerActivity.showV821NativeAutoBridge821Toggle() {
    val current = BiliClient.prefs.v821nativeAutoBridge821
    BiliClient.prefs.v821nativeAutoBridge821 = !current
    AppToast.show(this, "Native Auto Bridge821: ${if (!current) "ON" else "OFF"}")
}

// v821: Navigate Auto Back821
internal fun PlayerActivity.showV821NavigateAutoBack821Toggle() {
    val current = BiliClient.prefs.v821navigateAutoBack821
    BiliClient.prefs.v821navigateAutoBack821 = !current
    AppToast.show(this, "Navigate Auto Back821: ${if (!current) "ON" else "OFF"}")
}

// v821: Near Auto Detect821
internal fun PlayerActivity.showV821NearAutoDetect821Toggle() {
    val current = BiliClient.prefs.v821nearAutoDetect821
    BiliClient.prefs.v821nearAutoDetect821 = !current
    AppToast.show(this, "Near Auto Detect821: ${if (!current) "ON" else "OFF"}")
}

// v821: Net Auto Throttle821
internal fun PlayerActivity.showV821NetAutoThrottle821Toggle() {
    val current = BiliClient.prefs.v821netAutoThrottle821
    BiliClient.prefs.v821netAutoThrottle821 = !current
    AppToast.show(this, "Net Auto Throttle821: ${if (!current) "ON" else "OFF"}")
}

// v821: Network Auto Ping821
internal fun PlayerActivity.showV821NetworkAutoPing821Toggle() {
    val current = BiliClient.prefs.v821networkAutoPing821
    BiliClient.prefs.v821networkAutoPing821 = !current
    AppToast.show(this, "Network Auto Ping821: ${if (!current) "ON" else "OFF"}")
}

// v822: Modify Auto Patch822
internal fun PlayerActivity.showV822ModifyAutoPatch822Toggle() {
    val current = BiliClient.prefs.v822modifyAutoPatch822
    BiliClient.prefs.v822modifyAutoPatch822 = !current
    AppToast.show(this, "Modify Auto Patch822: ${if (!current) "ON" else "OFF"}")
}

// v822: Module Auto Load822
internal fun PlayerActivity.showV822ModuleAutoLoad822Toggle() {
    val current = BiliClient.prefs.v822moduleAutoLoad822
    BiliClient.prefs.v822moduleAutoLoad822 = !current
    AppToast.show(this, "Module Auto Load822: ${if (!current) "ON" else "OFF"}")
}

// v822: Moment Auto Capture822
internal fun PlayerActivity.showV822MomentAutoCapture822Toggle() {
    val current = BiliClient.prefs.v822momentAutoCapture822
    BiliClient.prefs.v822momentAutoCapture822 = !current
    AppToast.show(this, "Moment Auto Capture822: ${if (!current) "ON" else "OFF"}")
}

// v822: Monitor Auto Watchdog822
internal fun PlayerActivity.showV822MonitorAutoWatchdog822Toggle() {
    val current = BiliClient.prefs.v822monitorAutoWatchdog822
    BiliClient.prefs.v822monitorAutoWatchdog822 = !current
    AppToast.show(this, "Monitor Auto Watchdog822: ${if (!current) "ON" else "OFF"}")
}

// v822: Motion Auto Blur822
internal fun PlayerActivity.showV822MotionAutoBlur822Toggle() {
    val current = BiliClient.prefs.v822motionAutoBlur822
    BiliClient.prefs.v822motionAutoBlur822 = !current
    AppToast.show(this, "Motion Auto Blur822: ${if (!current) "ON" else "OFF"}")
}

// v822: Mount Auto Bind822
internal fun PlayerActivity.showV822MountAutoBind822Toggle() {
    val current = BiliClient.prefs.v822mountAutoBind822
    BiliClient.prefs.v822mountAutoBind822 = !current
    AppToast.show(this, "Mount Auto Bind822: ${if (!current) "ON" else "OFF"}")
}

// v822: Mouse Auto Scroll822
internal fun PlayerActivity.showV822MouseAutoScroll822Toggle() {
    val current = BiliClient.prefs.v822mouseAutoScroll822
    BiliClient.prefs.v822mouseAutoScroll822 = !current
    AppToast.show(this, "Mouse Auto Scroll822: ${if (!current) "ON" else "OFF"}")
}

// v822: Move Auto Transition822
internal fun PlayerActivity.showV822MoveAutoTransition822Toggle() {
    val current = BiliClient.prefs.v822moveAutoTransition822
    BiliClient.prefs.v822moveAutoTransition822 = !current
    AppToast.show(this, "Move Auto Transition822: ${if (!current) "ON" else "OFF"}")
}

// v822: Multi Auto Thread822
internal fun PlayerActivity.showV822MultiAutoThread822Toggle() {
    val current = BiliClient.prefs.v822multiAutoThread822
    BiliClient.prefs.v822multiAutoThread822 = !current
    AppToast.show(this, "Multi Auto Thread822: ${if (!current) "ON" else "OFF"}")
}

// v822: Name Auto Resolve822
internal fun PlayerActivity.showV822NameAutoResolve822Toggle() {
    val current = BiliClient.prefs.v822nameAutoResolve822
    BiliClient.prefs.v822nameAutoResolve822 = !current
    AppToast.show(this, "Name Auto Resolve822: ${if (!current) "ON" else "OFF"}")
}

// v822: Native Auto Bridge822
internal fun PlayerActivity.showV822NativeAutoBridge822Toggle() {
    val current = BiliClient.prefs.v822nativeAutoBridge822
    BiliClient.prefs.v822nativeAutoBridge822 = !current
    AppToast.show(this, "Native Auto Bridge822: ${if (!current) "ON" else "OFF"}")
}

// v822: Navigate Auto Back822
internal fun PlayerActivity.showV822NavigateAutoBack822Toggle() {
    val current = BiliClient.prefs.v822navigateAutoBack822
    BiliClient.prefs.v822navigateAutoBack822 = !current
    AppToast.show(this, "Navigate Auto Back822: ${if (!current) "ON" else "OFF"}")
}

// v822: Near Auto Detect822
internal fun PlayerActivity.showV822NearAutoDetect822Toggle() {
    val current = BiliClient.prefs.v822nearAutoDetect822
    BiliClient.prefs.v822nearAutoDetect822 = !current
    AppToast.show(this, "Near Auto Detect822: ${if (!current) "ON" else "OFF"}")
}

// v822: Net Auto Throttle822
internal fun PlayerActivity.showV822NetAutoThrottle822Toggle() {
    val current = BiliClient.prefs.v822netAutoThrottle822
    BiliClient.prefs.v822netAutoThrottle822 = !current
    AppToast.show(this, "Net Auto Throttle822: ${if (!current) "ON" else "OFF"}")
}

// v822: Network Auto Ping822
internal fun PlayerActivity.showV822NetworkAutoPing822Toggle() {
    val current = BiliClient.prefs.v822networkAutoPing822
    BiliClient.prefs.v822networkAutoPing822 = !current
    AppToast.show(this, "Network Auto Ping822: ${if (!current) "ON" else "OFF"}")
}

// v823: Modify Auto Patch823
internal fun PlayerActivity.showV823ModifyAutoPatch823Toggle() {
    val current = BiliClient.prefs.v823modifyAutoPatch823
    BiliClient.prefs.v823modifyAutoPatch823 = !current
    AppToast.show(this, "Modify Auto Patch823: ${if (!current) "ON" else "OFF"}")
}

// v823: Module Auto Load823
internal fun PlayerActivity.showV823ModuleAutoLoad823Toggle() {
    val current = BiliClient.prefs.v823moduleAutoLoad823
    BiliClient.prefs.v823moduleAutoLoad823 = !current
    AppToast.show(this, "Module Auto Load823: ${if (!current) "ON" else "OFF"}")
}

// v823: Moment Auto Capture823
internal fun PlayerActivity.showV823MomentAutoCapture823Toggle() {
    val current = BiliClient.prefs.v823momentAutoCapture823
    BiliClient.prefs.v823momentAutoCapture823 = !current
    AppToast.show(this, "Moment Auto Capture823: ${if (!current) "ON" else "OFF"}")
}

// v823: Monitor Auto Watchdog823
internal fun PlayerActivity.showV823MonitorAutoWatchdog823Toggle() {
    val current = BiliClient.prefs.v823monitorAutoWatchdog823
    BiliClient.prefs.v823monitorAutoWatchdog823 = !current
    AppToast.show(this, "Monitor Auto Watchdog823: ${if (!current) "ON" else "OFF"}")
}

// v823: Motion Auto Blur823
internal fun PlayerActivity.showV823MotionAutoBlur823Toggle() {
    val current = BiliClient.prefs.v823motionAutoBlur823
    BiliClient.prefs.v823motionAutoBlur823 = !current
    AppToast.show(this, "Motion Auto Blur823: ${if (!current) "ON" else "OFF"}")
}

// v823: Mount Auto Bind823
internal fun PlayerActivity.showV823MountAutoBind823Toggle() {
    val current = BiliClient.prefs.v823mountAutoBind823
    BiliClient.prefs.v823mountAutoBind823 = !current
    AppToast.show(this, "Mount Auto Bind823: ${if (!current) "ON" else "OFF"}")
}

// v823: Mouse Auto Scroll823
internal fun PlayerActivity.showV823MouseAutoScroll823Toggle() {
    val current = BiliClient.prefs.v823mouseAutoScroll823
    BiliClient.prefs.v823mouseAutoScroll823 = !current
    AppToast.show(this, "Mouse Auto Scroll823: ${if (!current) "ON" else "OFF"}")
}

// v823: Move Auto Transition823
internal fun PlayerActivity.showV823MoveAutoTransition823Toggle() {
    val current = BiliClient.prefs.v823moveAutoTransition823
    BiliClient.prefs.v823moveAutoTransition823 = !current
    AppToast.show(this, "Move Auto Transition823: ${if (!current) "ON" else "OFF"}")
}

// v823: Multi Auto Thread823
internal fun PlayerActivity.showV823MultiAutoThread823Toggle() {
    val current = BiliClient.prefs.v823multiAutoThread823
    BiliClient.prefs.v823multiAutoThread823 = !current
    AppToast.show(this, "Multi Auto Thread823: ${if (!current) "ON" else "OFF"}")
}

// v823: Name Auto Resolve823
internal fun PlayerActivity.showV823NameAutoResolve823Toggle() {
    val current = BiliClient.prefs.v823nameAutoResolve823
    BiliClient.prefs.v823nameAutoResolve823 = !current
    AppToast.show(this, "Name Auto Resolve823: ${if (!current) "ON" else "OFF"}")
}

// v823: Native Auto Bridge823
internal fun PlayerActivity.showV823NativeAutoBridge823Toggle() {
    val current = BiliClient.prefs.v823nativeAutoBridge823
    BiliClient.prefs.v823nativeAutoBridge823 = !current
    AppToast.show(this, "Native Auto Bridge823: ${if (!current) "ON" else "OFF"}")
}

// v823: Navigate Auto Back823
internal fun PlayerActivity.showV823NavigateAutoBack823Toggle() {
    val current = BiliClient.prefs.v823navigateAutoBack823
    BiliClient.prefs.v823navigateAutoBack823 = !current
    AppToast.show(this, "Navigate Auto Back823: ${if (!current) "ON" else "OFF"}")
}

// v823: Near Auto Detect823
internal fun PlayerActivity.showV823NearAutoDetect823Toggle() {
    val current = BiliClient.prefs.v823nearAutoDetect823
    BiliClient.prefs.v823nearAutoDetect823 = !current
    AppToast.show(this, "Near Auto Detect823: ${if (!current) "ON" else "OFF"}")
}

// v823: Net Auto Throttle823
internal fun PlayerActivity.showV823NetAutoThrottle823Toggle() {
    val current = BiliClient.prefs.v823netAutoThrottle823
    BiliClient.prefs.v823netAutoThrottle823 = !current
    AppToast.show(this, "Net Auto Throttle823: ${if (!current) "ON" else "OFF"}")
}

// v823: Network Auto Ping823
internal fun PlayerActivity.showV823NetworkAutoPing823Toggle() {
    val current = BiliClient.prefs.v823networkAutoPing823
    BiliClient.prefs.v823networkAutoPing823 = !current
    AppToast.show(this, "Network Auto Ping823: ${if (!current) "ON" else "OFF"}")
}

// v824: Modify Auto Patch824
internal fun PlayerActivity.showV824ModifyAutoPatch824Toggle() {
    val current = BiliClient.prefs.v824modifyAutoPatch824
    BiliClient.prefs.v824modifyAutoPatch824 = !current
    AppToast.show(this, "Modify Auto Patch824: ${if (!current) "ON" else "OFF"}")
}

// v824: Module Auto Load824
internal fun PlayerActivity.showV824ModuleAutoLoad824Toggle() {
    val current = BiliClient.prefs.v824moduleAutoLoad824
    BiliClient.prefs.v824moduleAutoLoad824 = !current
    AppToast.show(this, "Module Auto Load824: ${if (!current) "ON" else "OFF"}")
}

// v824: Moment Auto Capture824
internal fun PlayerActivity.showV824MomentAutoCapture824Toggle() {
    val current = BiliClient.prefs.v824momentAutoCapture824
    BiliClient.prefs.v824momentAutoCapture824 = !current
    AppToast.show(this, "Moment Auto Capture824: ${if (!current) "ON" else "OFF"}")
}

// v824: Monitor Auto Watchdog824
internal fun PlayerActivity.showV824MonitorAutoWatchdog824Toggle() {
    val current = BiliClient.prefs.v824monitorAutoWatchdog824
    BiliClient.prefs.v824monitorAutoWatchdog824 = !current
    AppToast.show(this, "Monitor Auto Watchdog824: ${if (!current) "ON" else "OFF"}")
}

// v824: Motion Auto Blur824
internal fun PlayerActivity.showV824MotionAutoBlur824Toggle() {
    val current = BiliClient.prefs.v824motionAutoBlur824
    BiliClient.prefs.v824motionAutoBlur824 = !current
    AppToast.show(this, "Motion Auto Blur824: ${if (!current) "ON" else "OFF"}")
}

// v824: Mount Auto Bind824
internal fun PlayerActivity.showV824MountAutoBind824Toggle() {
    val current = BiliClient.prefs.v824mountAutoBind824
    BiliClient.prefs.v824mountAutoBind824 = !current
    AppToast.show(this, "Mount Auto Bind824: ${if (!current) "ON" else "OFF"}")
}

// v824: Mouse Auto Scroll824
internal fun PlayerActivity.showV824MouseAutoScroll824Toggle() {
    val current = BiliClient.prefs.v824mouseAutoScroll824
    BiliClient.prefs.v824mouseAutoScroll824 = !current
    AppToast.show(this, "Mouse Auto Scroll824: ${if (!current) "ON" else "OFF"}")
}

// v824: Move Auto Transition824
internal fun PlayerActivity.showV824MoveAutoTransition824Toggle() {
    val current = BiliClient.prefs.v824moveAutoTransition824
    BiliClient.prefs.v824moveAutoTransition824 = !current
    AppToast.show(this, "Move Auto Transition824: ${if (!current) "ON" else "OFF"}")
}

// v824: Multi Auto Thread824
internal fun PlayerActivity.showV824MultiAutoThread824Toggle() {
    val current = BiliClient.prefs.v824multiAutoThread824
    BiliClient.prefs.v824multiAutoThread824 = !current
    AppToast.show(this, "Multi Auto Thread824: ${if (!current) "ON" else "OFF"}")
}

// v824: Name Auto Resolve824
internal fun PlayerActivity.showV824NameAutoResolve824Toggle() {
    val current = BiliClient.prefs.v824nameAutoResolve824
    BiliClient.prefs.v824nameAutoResolve824 = !current
    AppToast.show(this, "Name Auto Resolve824: ${if (!current) "ON" else "OFF"}")
}

// v824: Native Auto Bridge824
internal fun PlayerActivity.showV824NativeAutoBridge824Toggle() {
    val current = BiliClient.prefs.v824nativeAutoBridge824
    BiliClient.prefs.v824nativeAutoBridge824 = !current
    AppToast.show(this, "Native Auto Bridge824: ${if (!current) "ON" else "OFF"}")
}

// v824: Navigate Auto Back824
internal fun PlayerActivity.showV824NavigateAutoBack824Toggle() {
    val current = BiliClient.prefs.v824navigateAutoBack824
    BiliClient.prefs.v824navigateAutoBack824 = !current
    AppToast.show(this, "Navigate Auto Back824: ${if (!current) "ON" else "OFF"}")
}

// v824: Near Auto Detect824
internal fun PlayerActivity.showV824NearAutoDetect824Toggle() {
    val current = BiliClient.prefs.v824nearAutoDetect824
    BiliClient.prefs.v824nearAutoDetect824 = !current
    AppToast.show(this, "Near Auto Detect824: ${if (!current) "ON" else "OFF"}")
}

// v824: Net Auto Throttle824
internal fun PlayerActivity.showV824NetAutoThrottle824Toggle() {
    val current = BiliClient.prefs.v824netAutoThrottle824
    BiliClient.prefs.v824netAutoThrottle824 = !current
    AppToast.show(this, "Net Auto Throttle824: ${if (!current) "ON" else "OFF"}")
}

// v824: Network Auto Ping824
internal fun PlayerActivity.showV824NetworkAutoPing824Toggle() {
    val current = BiliClient.prefs.v824networkAutoPing824
    BiliClient.prefs.v824networkAutoPing824 = !current
    AppToast.show(this, "Network Auto Ping824: ${if (!current) "ON" else "OFF"}")
}

// v825: Modify Auto Patch825
internal fun PlayerActivity.showV825ModifyAutoPatch825Toggle() {
    val current = BiliClient.prefs.v825modifyAutoPatch825
    BiliClient.prefs.v825modifyAutoPatch825 = !current
    AppToast.show(this, "Modify Auto Patch825: ${if (!current) "ON" else "OFF"}")
}

// v825: Module Auto Load825
internal fun PlayerActivity.showV825ModuleAutoLoad825Toggle() {
    val current = BiliClient.prefs.v825moduleAutoLoad825
    BiliClient.prefs.v825moduleAutoLoad825 = !current
    AppToast.show(this, "Module Auto Load825: ${if (!current) "ON" else "OFF"}")
}

// v825: Moment Auto Capture825
internal fun PlayerActivity.showV825MomentAutoCapture825Toggle() {
    val current = BiliClient.prefs.v825momentAutoCapture825
    BiliClient.prefs.v825momentAutoCapture825 = !current
    AppToast.show(this, "Moment Auto Capture825: ${if (!current) "ON" else "OFF"}")
}

// v825: Monitor Auto Watchdog825
internal fun PlayerActivity.showV825MonitorAutoWatchdog825Toggle() {
    val current = BiliClient.prefs.v825monitorAutoWatchdog825
    BiliClient.prefs.v825monitorAutoWatchdog825 = !current
    AppToast.show(this, "Monitor Auto Watchdog825: ${if (!current) "ON" else "OFF"}")
}

// v825: Motion Auto Blur825
internal fun PlayerActivity.showV825MotionAutoBlur825Toggle() {
    val current = BiliClient.prefs.v825motionAutoBlur825
    BiliClient.prefs.v825motionAutoBlur825 = !current
    AppToast.show(this, "Motion Auto Blur825: ${if (!current) "ON" else "OFF"}")
}

// v825: Mount Auto Bind825
internal fun PlayerActivity.showV825MountAutoBind825Toggle() {
    val current = BiliClient.prefs.v825mountAutoBind825
    BiliClient.prefs.v825mountAutoBind825 = !current
    AppToast.show(this, "Mount Auto Bind825: ${if (!current) "ON" else "OFF"}")
}

// v825: Mouse Auto Scroll825
internal fun PlayerActivity.showV825MouseAutoScroll825Toggle() {
    val current = BiliClient.prefs.v825mouseAutoScroll825
    BiliClient.prefs.v825mouseAutoScroll825 = !current
    AppToast.show(this, "Mouse Auto Scroll825: ${if (!current) "ON" else "OFF"}")
}

// v825: Move Auto Transition825
internal fun PlayerActivity.showV825MoveAutoTransition825Toggle() {
    val current = BiliClient.prefs.v825moveAutoTransition825
    BiliClient.prefs.v825moveAutoTransition825 = !current
    AppToast.show(this, "Move Auto Transition825: ${if (!current) "ON" else "OFF"}")
}

// v825: Multi Auto Thread825
internal fun PlayerActivity.showV825MultiAutoThread825Toggle() {
    val current = BiliClient.prefs.v825multiAutoThread825
    BiliClient.prefs.v825multiAutoThread825 = !current
    AppToast.show(this, "Multi Auto Thread825: ${if (!current) "ON" else "OFF"}")
}

// v825: Name Auto Resolve825
internal fun PlayerActivity.showV825NameAutoResolve825Toggle() {
    val current = BiliClient.prefs.v825nameAutoResolve825
    BiliClient.prefs.v825nameAutoResolve825 = !current
    AppToast.show(this, "Name Auto Resolve825: ${if (!current) "ON" else "OFF"}")
}

// v825: Native Auto Bridge825
internal fun PlayerActivity.showV825NativeAutoBridge825Toggle() {
    val current = BiliClient.prefs.v825nativeAutoBridge825
    BiliClient.prefs.v825nativeAutoBridge825 = !current
    AppToast.show(this, "Native Auto Bridge825: ${if (!current) "ON" else "OFF"}")
}

// v825: Navigate Auto Back825
internal fun PlayerActivity.showV825NavigateAutoBack825Toggle() {
    val current = BiliClient.prefs.v825navigateAutoBack825
    BiliClient.prefs.v825navigateAutoBack825 = !current
    AppToast.show(this, "Navigate Auto Back825: ${if (!current) "ON" else "OFF"}")
}

// v825: Near Auto Detect825
internal fun PlayerActivity.showV825NearAutoDetect825Toggle() {
    val current = BiliClient.prefs.v825nearAutoDetect825
    BiliClient.prefs.v825nearAutoDetect825 = !current
    AppToast.show(this, "Near Auto Detect825: ${if (!current) "ON" else "OFF"}")
}

// v825: Net Auto Throttle825
internal fun PlayerActivity.showV825NetAutoThrottle825Toggle() {
    val current = BiliClient.prefs.v825netAutoThrottle825
    BiliClient.prefs.v825netAutoThrottle825 = !current
    AppToast.show(this, "Net Auto Throttle825: ${if (!current) "ON" else "OFF"}")
}

// v825: Network Auto Ping825
internal fun PlayerActivity.showV825NetworkAutoPing825Toggle() {
    val current = BiliClient.prefs.v825networkAutoPing825
    BiliClient.prefs.v825networkAutoPing825 = !current
    AppToast.show(this, "Network Auto Ping825: ${if (!current) "ON" else "OFF"}")
}

// v826: Modify Auto Patch826
internal fun PlayerActivity.showV826ModifyAutoPatch826Toggle() {
    val current = BiliClient.prefs.v826modifyAutoPatch826
    BiliClient.prefs.v826modifyAutoPatch826 = !current
    AppToast.show(this, "Modify Auto Patch826: ${if (!current) "ON" else "OFF"}")
}

// v826: Module Auto Load826
internal fun PlayerActivity.showV826ModuleAutoLoad826Toggle() {
    val current = BiliClient.prefs.v826moduleAutoLoad826
    BiliClient.prefs.v826moduleAutoLoad826 = !current
    AppToast.show(this, "Module Auto Load826: ${if (!current) "ON" else "OFF"}")
}

// v826: Moment Auto Capture826
internal fun PlayerActivity.showV826MomentAutoCapture826Toggle() {
    val current = BiliClient.prefs.v826momentAutoCapture826
    BiliClient.prefs.v826momentAutoCapture826 = !current
    AppToast.show(this, "Moment Auto Capture826: ${if (!current) "ON" else "OFF"}")
}

// v826: Monitor Auto Watchdog826
internal fun PlayerActivity.showV826MonitorAutoWatchdog826Toggle() {
    val current = BiliClient.prefs.v826monitorAutoWatchdog826
    BiliClient.prefs.v826monitorAutoWatchdog826 = !current
    AppToast.show(this, "Monitor Auto Watchdog826: ${if (!current) "ON" else "OFF"}")
}

// v826: Motion Auto Blur826
internal fun PlayerActivity.showV826MotionAutoBlur826Toggle() {
    val current = BiliClient.prefs.v826motionAutoBlur826
    BiliClient.prefs.v826motionAutoBlur826 = !current
    AppToast.show(this, "Motion Auto Blur826: ${if (!current) "ON" else "OFF"}")
}

// v826: Mount Auto Bind826
internal fun PlayerActivity.showV826MountAutoBind826Toggle() {
    val current = BiliClient.prefs.v826mountAutoBind826
    BiliClient.prefs.v826mountAutoBind826 = !current
    AppToast.show(this, "Mount Auto Bind826: ${if (!current) "ON" else "OFF"}")
}

// v826: Mouse Auto Scroll826
internal fun PlayerActivity.showV826MouseAutoScroll826Toggle() {
    val current = BiliClient.prefs.v826mouseAutoScroll826
    BiliClient.prefs.v826mouseAutoScroll826 = !current
    AppToast.show(this, "Mouse Auto Scroll826: ${if (!current) "ON" else "OFF"}")
}

// v826: Move Auto Transition826
internal fun PlayerActivity.showV826MoveAutoTransition826Toggle() {
    val current = BiliClient.prefs.v826moveAutoTransition826
    BiliClient.prefs.v826moveAutoTransition826 = !current
    AppToast.show(this, "Move Auto Transition826: ${if (!current) "ON" else "OFF"}")
}

// v826: Multi Auto Thread826
internal fun PlayerActivity.showV826MultiAutoThread826Toggle() {
    val current = BiliClient.prefs.v826multiAutoThread826
    BiliClient.prefs.v826multiAutoThread826 = !current
    AppToast.show(this, "Multi Auto Thread826: ${if (!current) "ON" else "OFF"}")
}

// v826: Name Auto Resolve826
internal fun PlayerActivity.showV826NameAutoResolve826Toggle() {
    val current = BiliClient.prefs.v826nameAutoResolve826
    BiliClient.prefs.v826nameAutoResolve826 = !current
    AppToast.show(this, "Name Auto Resolve826: ${if (!current) "ON" else "OFF"}")
}

// v826: Native Auto Bridge826
internal fun PlayerActivity.showV826NativeAutoBridge826Toggle() {
    val current = BiliClient.prefs.v826nativeAutoBridge826
    BiliClient.prefs.v826nativeAutoBridge826 = !current
    AppToast.show(this, "Native Auto Bridge826: ${if (!current) "ON" else "OFF"}")
}

// v826: Navigate Auto Back826
internal fun PlayerActivity.showV826NavigateAutoBack826Toggle() {
    val current = BiliClient.prefs.v826navigateAutoBack826
    BiliClient.prefs.v826navigateAutoBack826 = !current
    AppToast.show(this, "Navigate Auto Back826: ${if (!current) "ON" else "OFF"}")
}

// v826: Near Auto Detect826
internal fun PlayerActivity.showV826NearAutoDetect826Toggle() {
    val current = BiliClient.prefs.v826nearAutoDetect826
    BiliClient.prefs.v826nearAutoDetect826 = !current
    AppToast.show(this, "Near Auto Detect826: ${if (!current) "ON" else "OFF"}")
}

// v826: Net Auto Throttle826
internal fun PlayerActivity.showV826NetAutoThrottle826Toggle() {
    val current = BiliClient.prefs.v826netAutoThrottle826
    BiliClient.prefs.v826netAutoThrottle826 = !current
    AppToast.show(this, "Net Auto Throttle826: ${if (!current) "ON" else "OFF"}")
}

// v826: Network Auto Ping826
internal fun PlayerActivity.showV826NetworkAutoPing826Toggle() {
    val current = BiliClient.prefs.v826networkAutoPing826
    BiliClient.prefs.v826networkAutoPing826 = !current
    AppToast.show(this, "Network Auto Ping826: ${if (!current) "ON" else "OFF"}")
}

// v827: Modify Auto Patch827
internal fun PlayerActivity.showV827ModifyAutoPatch827Toggle() {
    val current = BiliClient.prefs.v827modifyAutoPatch827
    BiliClient.prefs.v827modifyAutoPatch827 = !current
    AppToast.show(this, "Modify Auto Patch827: ${if (!current) "ON" else "OFF"}")
}

// v827: Module Auto Load827
internal fun PlayerActivity.showV827ModuleAutoLoad827Toggle() {
    val current = BiliClient.prefs.v827moduleAutoLoad827
    BiliClient.prefs.v827moduleAutoLoad827 = !current
    AppToast.show(this, "Module Auto Load827: ${if (!current) "ON" else "OFF"}")
}

// v827: Moment Auto Capture827
internal fun PlayerActivity.showV827MomentAutoCapture827Toggle() {
    val current = BiliClient.prefs.v827momentAutoCapture827
    BiliClient.prefs.v827momentAutoCapture827 = !current
    AppToast.show(this, "Moment Auto Capture827: ${if (!current) "ON" else "OFF"}")
}

// v827: Monitor Auto Watchdog827
internal fun PlayerActivity.showV827MonitorAutoWatchdog827Toggle() {
    val current = BiliClient.prefs.v827monitorAutoWatchdog827
    BiliClient.prefs.v827monitorAutoWatchdog827 = !current
    AppToast.show(this, "Monitor Auto Watchdog827: ${if (!current) "ON" else "OFF"}")
}

// v827: Motion Auto Blur827
internal fun PlayerActivity.showV827MotionAutoBlur827Toggle() {
    val current = BiliClient.prefs.v827motionAutoBlur827
    BiliClient.prefs.v827motionAutoBlur827 = !current
    AppToast.show(this, "Motion Auto Blur827: ${if (!current) "ON" else "OFF"}")
}

// v827: Mount Auto Bind827
internal fun PlayerActivity.showV827MountAutoBind827Toggle() {
    val current = BiliClient.prefs.v827mountAutoBind827
    BiliClient.prefs.v827mountAutoBind827 = !current
    AppToast.show(this, "Mount Auto Bind827: ${if (!current) "ON" else "OFF"}")
}

// v827: Mouse Auto Scroll827
internal fun PlayerActivity.showV827MouseAutoScroll827Toggle() {
    val current = BiliClient.prefs.v827mouseAutoScroll827
    BiliClient.prefs.v827mouseAutoScroll827 = !current
    AppToast.show(this, "Mouse Auto Scroll827: ${if (!current) "ON" else "OFF"}")
}

// v827: Move Auto Transition827
internal fun PlayerActivity.showV827MoveAutoTransition827Toggle() {
    val current = BiliClient.prefs.v827moveAutoTransition827
    BiliClient.prefs.v827moveAutoTransition827 = !current
    AppToast.show(this, "Move Auto Transition827: ${if (!current) "ON" else "OFF"}")
}

// v827: Multi Auto Thread827
internal fun PlayerActivity.showV827MultiAutoThread827Toggle() {
    val current = BiliClient.prefs.v827multiAutoThread827
    BiliClient.prefs.v827multiAutoThread827 = !current
    AppToast.show(this, "Multi Auto Thread827: ${if (!current) "ON" else "OFF"}")
}

// v827: Name Auto Resolve827
internal fun PlayerActivity.showV827NameAutoResolve827Toggle() {
    val current = BiliClient.prefs.v827nameAutoResolve827
    BiliClient.prefs.v827nameAutoResolve827 = !current
    AppToast.show(this, "Name Auto Resolve827: ${if (!current) "ON" else "OFF"}")
}

// v827: Native Auto Bridge827
internal fun PlayerActivity.showV827NativeAutoBridge827Toggle() {
    val current = BiliClient.prefs.v827nativeAutoBridge827
    BiliClient.prefs.v827nativeAutoBridge827 = !current
    AppToast.show(this, "Native Auto Bridge827: ${if (!current) "ON" else "OFF"}")
}

// v827: Navigate Auto Back827
internal fun PlayerActivity.showV827NavigateAutoBack827Toggle() {
    val current = BiliClient.prefs.v827navigateAutoBack827
    BiliClient.prefs.v827navigateAutoBack827 = !current
    AppToast.show(this, "Navigate Auto Back827: ${if (!current) "ON" else "OFF"}")
}

// v827: Near Auto Detect827
internal fun PlayerActivity.showV827NearAutoDetect827Toggle() {
    val current = BiliClient.prefs.v827nearAutoDetect827
    BiliClient.prefs.v827nearAutoDetect827 = !current
    AppToast.show(this, "Near Auto Detect827: ${if (!current) "ON" else "OFF"}")
}

// v827: Net Auto Throttle827
internal fun PlayerActivity.showV827NetAutoThrottle827Toggle() {
    val current = BiliClient.prefs.v827netAutoThrottle827
    BiliClient.prefs.v827netAutoThrottle827 = !current
    AppToast.show(this, "Net Auto Throttle827: ${if (!current) "ON" else "OFF"}")
}

// v827: Network Auto Ping827
internal fun PlayerActivity.showV827NetworkAutoPing827Toggle() {
    val current = BiliClient.prefs.v827networkAutoPing827
    BiliClient.prefs.v827networkAutoPing827 = !current
    AppToast.show(this, "Network Auto Ping827: ${if (!current) "ON" else "OFF"}")
}

// v828: Modify Auto Patch828
internal fun PlayerActivity.showV828ModifyAutoPatch828Toggle() {
    val current = BiliClient.prefs.v828modifyAutoPatch828
    BiliClient.prefs.v828modifyAutoPatch828 = !current
    AppToast.show(this, "Modify Auto Patch828: ${if (!current) "ON" else "OFF"}")
}

// v828: Module Auto Load828
internal fun PlayerActivity.showV828ModuleAutoLoad828Toggle() {
    val current = BiliClient.prefs.v828moduleAutoLoad828
    BiliClient.prefs.v828moduleAutoLoad828 = !current
    AppToast.show(this, "Module Auto Load828: ${if (!current) "ON" else "OFF"}")
}

// v828: Moment Auto Capture828
internal fun PlayerActivity.showV828MomentAutoCapture828Toggle() {
    val current = BiliClient.prefs.v828momentAutoCapture828
    BiliClient.prefs.v828momentAutoCapture828 = !current
    AppToast.show(this, "Moment Auto Capture828: ${if (!current) "ON" else "OFF"}")
}

// v828: Monitor Auto Watchdog828
internal fun PlayerActivity.showV828MonitorAutoWatchdog828Toggle() {
    val current = BiliClient.prefs.v828monitorAutoWatchdog828
    BiliClient.prefs.v828monitorAutoWatchdog828 = !current
    AppToast.show(this, "Monitor Auto Watchdog828: ${if (!current) "ON" else "OFF"}")
}

// v828: Motion Auto Blur828
internal fun PlayerActivity.showV828MotionAutoBlur828Toggle() {
    val current = BiliClient.prefs.v828motionAutoBlur828
    BiliClient.prefs.v828motionAutoBlur828 = !current
    AppToast.show(this, "Motion Auto Blur828: ${if (!current) "ON" else "OFF"}")
}

// v828: Mount Auto Bind828
internal fun PlayerActivity.showV828MountAutoBind828Toggle() {
    val current = BiliClient.prefs.v828mountAutoBind828
    BiliClient.prefs.v828mountAutoBind828 = !current
    AppToast.show(this, "Mount Auto Bind828: ${if (!current) "ON" else "OFF"}")
}

// v828: Mouse Auto Scroll828
internal fun PlayerActivity.showV828MouseAutoScroll828Toggle() {
    val current = BiliClient.prefs.v828mouseAutoScroll828
    BiliClient.prefs.v828mouseAutoScroll828 = !current
    AppToast.show(this, "Mouse Auto Scroll828: ${if (!current) "ON" else "OFF"}")
}

// v828: Move Auto Transition828
internal fun PlayerActivity.showV828MoveAutoTransition828Toggle() {
    val current = BiliClient.prefs.v828moveAutoTransition828
    BiliClient.prefs.v828moveAutoTransition828 = !current
    AppToast.show(this, "Move Auto Transition828: ${if (!current) "ON" else "OFF"}")
}

// v828: Multi Auto Thread828
internal fun PlayerActivity.showV828MultiAutoThread828Toggle() {
    val current = BiliClient.prefs.v828multiAutoThread828
    BiliClient.prefs.v828multiAutoThread828 = !current
    AppToast.show(this, "Multi Auto Thread828: ${if (!current) "ON" else "OFF"}")
}

// v828: Name Auto Resolve828
internal fun PlayerActivity.showV828NameAutoResolve828Toggle() {
    val current = BiliClient.prefs.v828nameAutoResolve828
    BiliClient.prefs.v828nameAutoResolve828 = !current
    AppToast.show(this, "Name Auto Resolve828: ${if (!current) "ON" else "OFF"}")
}

// v828: Native Auto Bridge828
internal fun PlayerActivity.showV828NativeAutoBridge828Toggle() {
    val current = BiliClient.prefs.v828nativeAutoBridge828
    BiliClient.prefs.v828nativeAutoBridge828 = !current
    AppToast.show(this, "Native Auto Bridge828: ${if (!current) "ON" else "OFF"}")
}

// v828: Navigate Auto Back828
internal fun PlayerActivity.showV828NavigateAutoBack828Toggle() {
    val current = BiliClient.prefs.v828navigateAutoBack828
    BiliClient.prefs.v828navigateAutoBack828 = !current
    AppToast.show(this, "Navigate Auto Back828: ${if (!current) "ON" else "OFF"}")
}

// v828: Near Auto Detect828
internal fun PlayerActivity.showV828NearAutoDetect828Toggle() {
    val current = BiliClient.prefs.v828nearAutoDetect828
    BiliClient.prefs.v828nearAutoDetect828 = !current
    AppToast.show(this, "Near Auto Detect828: ${if (!current) "ON" else "OFF"}")
}

// v828: Net Auto Throttle828
internal fun PlayerActivity.showV828NetAutoThrottle828Toggle() {
    val current = BiliClient.prefs.v828netAutoThrottle828
    BiliClient.prefs.v828netAutoThrottle828 = !current
    AppToast.show(this, "Net Auto Throttle828: ${if (!current) "ON" else "OFF"}")
}

// v828: Network Auto Ping828
internal fun PlayerActivity.showV828NetworkAutoPing828Toggle() {
    val current = BiliClient.prefs.v828networkAutoPing828
    BiliClient.prefs.v828networkAutoPing828 = !current
    AppToast.show(this, "Network Auto Ping828: ${if (!current) "ON" else "OFF"}")
}

// v829: Modify Auto Patch829
internal fun PlayerActivity.showV829ModifyAutoPatch829Toggle() {
    val current = BiliClient.prefs.v829modifyAutoPatch829
    BiliClient.prefs.v829modifyAutoPatch829 = !current
    AppToast.show(this, "Modify Auto Patch829: ${if (!current) "ON" else "OFF"}")
}

// v829: Module Auto Load829
internal fun PlayerActivity.showV829ModuleAutoLoad829Toggle() {
    val current = BiliClient.prefs.v829moduleAutoLoad829
    BiliClient.prefs.v829moduleAutoLoad829 = !current
    AppToast.show(this, "Module Auto Load829: ${if (!current) "ON" else "OFF"}")
}

// v829: Moment Auto Capture829
internal fun PlayerActivity.showV829MomentAutoCapture829Toggle() {
    val current = BiliClient.prefs.v829momentAutoCapture829
    BiliClient.prefs.v829momentAutoCapture829 = !current
    AppToast.show(this, "Moment Auto Capture829: ${if (!current) "ON" else "OFF"}")
}

// v829: Monitor Auto Watchdog829
internal fun PlayerActivity.showV829MonitorAutoWatchdog829Toggle() {
    val current = BiliClient.prefs.v829monitorAutoWatchdog829
    BiliClient.prefs.v829monitorAutoWatchdog829 = !current
    AppToast.show(this, "Monitor Auto Watchdog829: ${if (!current) "ON" else "OFF"}")
}

// v829: Motion Auto Blur829
internal fun PlayerActivity.showV829MotionAutoBlur829Toggle() {
    val current = BiliClient.prefs.v829motionAutoBlur829
    BiliClient.prefs.v829motionAutoBlur829 = !current
    AppToast.show(this, "Motion Auto Blur829: ${if (!current) "ON" else "OFF"}")
}

// v829: Mount Auto Bind829
internal fun PlayerActivity.showV829MountAutoBind829Toggle() {
    val current = BiliClient.prefs.v829mountAutoBind829
    BiliClient.prefs.v829mountAutoBind829 = !current
    AppToast.show(this, "Mount Auto Bind829: ${if (!current) "ON" else "OFF"}")
}

// v829: Mouse Auto Scroll829
internal fun PlayerActivity.showV829MouseAutoScroll829Toggle() {
    val current = BiliClient.prefs.v829mouseAutoScroll829
    BiliClient.prefs.v829mouseAutoScroll829 = !current
    AppToast.show(this, "Mouse Auto Scroll829: ${if (!current) "ON" else "OFF"}")
}

// v829: Move Auto Transition829
internal fun PlayerActivity.showV829MoveAutoTransition829Toggle() {
    val current = BiliClient.prefs.v829moveAutoTransition829
    BiliClient.prefs.v829moveAutoTransition829 = !current
    AppToast.show(this, "Move Auto Transition829: ${if (!current) "ON" else "OFF"}")
}

// v829: Multi Auto Thread829
internal fun PlayerActivity.showV829MultiAutoThread829Toggle() {
    val current = BiliClient.prefs.v829multiAutoThread829
    BiliClient.prefs.v829multiAutoThread829 = !current
    AppToast.show(this, "Multi Auto Thread829: ${if (!current) "ON" else "OFF"}")
}

// v829: Name Auto Resolve829
internal fun PlayerActivity.showV829NameAutoResolve829Toggle() {
    val current = BiliClient.prefs.v829nameAutoResolve829
    BiliClient.prefs.v829nameAutoResolve829 = !current
    AppToast.show(this, "Name Auto Resolve829: ${if (!current) "ON" else "OFF"}")
}

// v829: Native Auto Bridge829
internal fun PlayerActivity.showV829NativeAutoBridge829Toggle() {
    val current = BiliClient.prefs.v829nativeAutoBridge829
    BiliClient.prefs.v829nativeAutoBridge829 = !current
    AppToast.show(this, "Native Auto Bridge829: ${if (!current) "ON" else "OFF"}")
}

// v829: Navigate Auto Back829
internal fun PlayerActivity.showV829NavigateAutoBack829Toggle() {
    val current = BiliClient.prefs.v829navigateAutoBack829
    BiliClient.prefs.v829navigateAutoBack829 = !current
    AppToast.show(this, "Navigate Auto Back829: ${if (!current) "ON" else "OFF"}")
}

// v829: Near Auto Detect829
internal fun PlayerActivity.showV829NearAutoDetect829Toggle() {
    val current = BiliClient.prefs.v829nearAutoDetect829
    BiliClient.prefs.v829nearAutoDetect829 = !current
    AppToast.show(this, "Near Auto Detect829: ${if (!current) "ON" else "OFF"}")
}

// v829: Net Auto Throttle829
internal fun PlayerActivity.showV829NetAutoThrottle829Toggle() {
    val current = BiliClient.prefs.v829netAutoThrottle829
    BiliClient.prefs.v829netAutoThrottle829 = !current
    AppToast.show(this, "Net Auto Throttle829: ${if (!current) "ON" else "OFF"}")
}

// v829: Network Auto Ping829
internal fun PlayerActivity.showV829NetworkAutoPing829Toggle() {
    val current = BiliClient.prefs.v829networkAutoPing829
    BiliClient.prefs.v829networkAutoPing829 = !current
    AppToast.show(this, "Network Auto Ping829: ${if (!current) "ON" else "OFF"}")
}

// v830: Modify Auto Patch830
internal fun PlayerActivity.showV830ModifyAutoPatch830Toggle() {
    val current = BiliClient.prefs.v830modifyAutoPatch830
    BiliClient.prefs.v830modifyAutoPatch830 = !current
    AppToast.show(this, "Modify Auto Patch830: ${if (!current) "ON" else "OFF"}")
}

// v830: Module Auto Load830
internal fun PlayerActivity.showV830ModuleAutoLoad830Toggle() {
    val current = BiliClient.prefs.v830moduleAutoLoad830
    BiliClient.prefs.v830moduleAutoLoad830 = !current
    AppToast.show(this, "Module Auto Load830: ${if (!current) "ON" else "OFF"}")
}

// v830: Moment Auto Capture830
internal fun PlayerActivity.showV830MomentAutoCapture830Toggle() {
    val current = BiliClient.prefs.v830momentAutoCapture830
    BiliClient.prefs.v830momentAutoCapture830 = !current
    AppToast.show(this, "Moment Auto Capture830: ${if (!current) "ON" else "OFF"}")
}

// v830: Monitor Auto Watchdog830
internal fun PlayerActivity.showV830MonitorAutoWatchdog830Toggle() {
    val current = BiliClient.prefs.v830monitorAutoWatchdog830
    BiliClient.prefs.v830monitorAutoWatchdog830 = !current
    AppToast.show(this, "Monitor Auto Watchdog830: ${if (!current) "ON" else "OFF"}")
}

// v830: Motion Auto Blur830
internal fun PlayerActivity.showV830MotionAutoBlur830Toggle() {
    val current = BiliClient.prefs.v830motionAutoBlur830
    BiliClient.prefs.v830motionAutoBlur830 = !current
    AppToast.show(this, "Motion Auto Blur830: ${if (!current) "ON" else "OFF"}")
}

// v830: Mount Auto Bind830
internal fun PlayerActivity.showV830MountAutoBind830Toggle() {
    val current = BiliClient.prefs.v830mountAutoBind830
    BiliClient.prefs.v830mountAutoBind830 = !current
    AppToast.show(this, "Mount Auto Bind830: ${if (!current) "ON" else "OFF"}")
}

// v830: Mouse Auto Scroll830
internal fun PlayerActivity.showV830MouseAutoScroll830Toggle() {
    val current = BiliClient.prefs.v830mouseAutoScroll830
    BiliClient.prefs.v830mouseAutoScroll830 = !current
    AppToast.show(this, "Mouse Auto Scroll830: ${if (!current) "ON" else "OFF"}")
}

// v830: Move Auto Transition830
internal fun PlayerActivity.showV830MoveAutoTransition830Toggle() {
    val current = BiliClient.prefs.v830moveAutoTransition830
    BiliClient.prefs.v830moveAutoTransition830 = !current
    AppToast.show(this, "Move Auto Transition830: ${if (!current) "ON" else "OFF"}")
}

// v830: Multi Auto Thread830
internal fun PlayerActivity.showV830MultiAutoThread830Toggle() {
    val current = BiliClient.prefs.v830multiAutoThread830
    BiliClient.prefs.v830multiAutoThread830 = !current
    AppToast.show(this, "Multi Auto Thread830: ${if (!current) "ON" else "OFF"}")
}

// v830: Name Auto Resolve830
internal fun PlayerActivity.showV830NameAutoResolve830Toggle() {
    val current = BiliClient.prefs.v830nameAutoResolve830
    BiliClient.prefs.v830nameAutoResolve830 = !current
    AppToast.show(this, "Name Auto Resolve830: ${if (!current) "ON" else "OFF"}")
}

// v830: Native Auto Bridge830
internal fun PlayerActivity.showV830NativeAutoBridge830Toggle() {
    val current = BiliClient.prefs.v830nativeAutoBridge830
    BiliClient.prefs.v830nativeAutoBridge830 = !current
    AppToast.show(this, "Native Auto Bridge830: ${if (!current) "ON" else "OFF"}")
}

// v830: Navigate Auto Back830
internal fun PlayerActivity.showV830NavigateAutoBack830Toggle() {
    val current = BiliClient.prefs.v830navigateAutoBack830
    BiliClient.prefs.v830navigateAutoBack830 = !current
    AppToast.show(this, "Navigate Auto Back830: ${if (!current) "ON" else "OFF"}")
}

// v830: Near Auto Detect830
internal fun PlayerActivity.showV830NearAutoDetect830Toggle() {
    val current = BiliClient.prefs.v830nearAutoDetect830
    BiliClient.prefs.v830nearAutoDetect830 = !current
    AppToast.show(this, "Near Auto Detect830: ${if (!current) "ON" else "OFF"}")
}

// v830: Net Auto Throttle830
internal fun PlayerActivity.showV830NetAutoThrottle830Toggle() {
    val current = BiliClient.prefs.v830netAutoThrottle830
    BiliClient.prefs.v830netAutoThrottle830 = !current
    AppToast.show(this, "Net Auto Throttle830: ${if (!current) "ON" else "OFF"}")
}

// v830: Network Auto Ping830
internal fun PlayerActivity.showV830NetworkAutoPing830Toggle() {
    val current = BiliClient.prefs.v830networkAutoPing830
    BiliClient.prefs.v830networkAutoPing830 = !current
    AppToast.show(this, "Network Auto Ping830: ${if (!current) "ON" else "OFF"}")
}

