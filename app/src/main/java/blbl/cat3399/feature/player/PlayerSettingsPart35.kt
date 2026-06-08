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

internal fun PlayerActivity.showV481OutputAutoSelect481Toggle() {
    val current = BiliClient.prefs.v481outputAutoSelect481
    BiliClient.prefs.v481outputAutoSelect481 = !current
    AppToast.show(this, "Output Auto Select481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481OverlayAutoShow481Toggle() {
    val current = BiliClient.prefs.v481overlayAutoShow481
    BiliClient.prefs.v481overlayAutoShow481 = !current
    AppToast.show(this, "Overlay Auto Show481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481OverrideGlobal481Toggle() {
    val current = BiliClient.prefs.v481overrideGlobal481
    BiliClient.prefs.v481overrideGlobal481 = !current
    AppToast.show(this, "Override Global481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV481PackAutoCompress481Toggle() {
    val current = BiliClient.prefs.v481packAutoCompress481
    BiliClient.prefs.v481packAutoCompress481 = !current
    AppToast.show(this, "Pack Auto Compress481: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482ModuleAutoLoad482Toggle() {
    val current = BiliClient.prefs.v482moduleAutoLoad482
    BiliClient.prefs.v482moduleAutoLoad482 = !current
    AppToast.show(this, "Module Auto Load482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482MonitorCpuUsage482Toggle() {
    val current = BiliClient.prefs.v482monitorCpuUsage482
    BiliClient.prefs.v482monitorCpuUsage482 = !current
    AppToast.show(this, "Monitor CPU Usage482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482MountAutoDetect482Toggle() {
    val current = BiliClient.prefs.v482mountAutoDetect482
    BiliClient.prefs.v482mountAutoDetect482 = !current
    AppToast.show(this, "Mount Auto Detect482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482MouseHoverPreview482Toggle() {
    val current = BiliClient.prefs.v482mouseHoverPreview482
    BiliClient.prefs.v482mouseHoverPreview482 = !current
    AppToast.show(this, "Mouse Hover Preview482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482MoveTransition482Toggle() {
    val current = BiliClient.prefs.v482moveTransition482
    BiliClient.prefs.v482moveTransition482 = !current
    AppToast.show(this, "Move Transition482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482MultiThreadDecode482Toggle() {
    val current = BiliClient.prefs.v482multiThreadDecode482
    BiliClient.prefs.v482multiThreadDecode482 = !current
    AppToast.show(this, "Multi Thread Decode482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482NavAutoCollapse482Toggle() {
    val current = BiliClient.prefs.v482navAutoCollapse482
    BiliClient.prefs.v482navAutoCollapse482 = !current
    AppToast.show(this, "Nav Auto Collapse482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482NodeAutoConnect482Toggle() {
    val current = BiliClient.prefs.v482nodeAutoConnect482
    BiliClient.prefs.v482nodeAutoConnect482 = !current
    AppToast.show(this, "Node Auto Connect482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482OffsetAutoCalibrate482Toggle() {
    val current = BiliClient.prefs.v482offsetAutoCalibrate482
    BiliClient.prefs.v482offsetAutoCalibrate482 = !current
    AppToast.show(this, "Offset Auto Calibrate482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482OpenWithExternal482Toggle() {
    val current = BiliClient.prefs.v482openWithExternal482
    BiliClient.prefs.v482openWithExternal482 = !current
    AppToast.show(this, "Open With External482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482OrderAutoSort482Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v482orderAutoSort482).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort482",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v482orderAutoSort482 = value
        AppToast.show(this, "Order Auto Sort482: $value")
    }
}

internal fun PlayerActivity.showV482OutputAutoSelect482Toggle() {
    val current = BiliClient.prefs.v482outputAutoSelect482
    BiliClient.prefs.v482outputAutoSelect482 = !current
    AppToast.show(this, "Output Auto Select482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482OverlayAutoShow482Toggle() {
    val current = BiliClient.prefs.v482overlayAutoShow482
    BiliClient.prefs.v482overlayAutoShow482 = !current
    AppToast.show(this, "Overlay Auto Show482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482OverrideGlobal482Toggle() {
    val current = BiliClient.prefs.v482overrideGlobal482
    BiliClient.prefs.v482overrideGlobal482 = !current
    AppToast.show(this, "Override Global482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV482PackAutoCompress482Toggle() {
    val current = BiliClient.prefs.v482packAutoCompress482
    BiliClient.prefs.v482packAutoCompress482 = !current
    AppToast.show(this, "Pack Auto Compress482: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483ModuleAutoLoad483Toggle() {
    val current = BiliClient.prefs.v483moduleAutoLoad483
    BiliClient.prefs.v483moduleAutoLoad483 = !current
    AppToast.show(this, "Module Auto Load483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483MonitorCpuUsage483Toggle() {
    val current = BiliClient.prefs.v483monitorCpuUsage483
    BiliClient.prefs.v483monitorCpuUsage483 = !current
    AppToast.show(this, "Monitor CPU Usage483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483MountAutoDetect483Toggle() {
    val current = BiliClient.prefs.v483mountAutoDetect483
    BiliClient.prefs.v483mountAutoDetect483 = !current
    AppToast.show(this, "Mount Auto Detect483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483MouseHoverPreview483Toggle() {
    val current = BiliClient.prefs.v483mouseHoverPreview483
    BiliClient.prefs.v483mouseHoverPreview483 = !current
    AppToast.show(this, "Mouse Hover Preview483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483MoveTransition483Toggle() {
    val current = BiliClient.prefs.v483moveTransition483
    BiliClient.prefs.v483moveTransition483 = !current
    AppToast.show(this, "Move Transition483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483MultiThreadDecode483Toggle() {
    val current = BiliClient.prefs.v483multiThreadDecode483
    BiliClient.prefs.v483multiThreadDecode483 = !current
    AppToast.show(this, "Multi Thread Decode483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483NavAutoCollapse483Toggle() {
    val current = BiliClient.prefs.v483navAutoCollapse483
    BiliClient.prefs.v483navAutoCollapse483 = !current
    AppToast.show(this, "Nav Auto Collapse483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483NodeAutoConnect483Toggle() {
    val current = BiliClient.prefs.v483nodeAutoConnect483
    BiliClient.prefs.v483nodeAutoConnect483 = !current
    AppToast.show(this, "Node Auto Connect483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483OffsetAutoCalibrate483Toggle() {
    val current = BiliClient.prefs.v483offsetAutoCalibrate483
    BiliClient.prefs.v483offsetAutoCalibrate483 = !current
    AppToast.show(this, "Offset Auto Calibrate483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483OpenWithExternal483Toggle() {
    val current = BiliClient.prefs.v483openWithExternal483
    BiliClient.prefs.v483openWithExternal483 = !current
    AppToast.show(this, "Open With External483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483OrderAutoSort483Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v483orderAutoSort483).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort483",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v483orderAutoSort483 = value
        AppToast.show(this, "Order Auto Sort483: $value")
    }
}

internal fun PlayerActivity.showV483OutputAutoSelect483Toggle() {
    val current = BiliClient.prefs.v483outputAutoSelect483
    BiliClient.prefs.v483outputAutoSelect483 = !current
    AppToast.show(this, "Output Auto Select483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483OverlayAutoShow483Toggle() {
    val current = BiliClient.prefs.v483overlayAutoShow483
    BiliClient.prefs.v483overlayAutoShow483 = !current
    AppToast.show(this, "Overlay Auto Show483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483OverrideGlobal483Toggle() {
    val current = BiliClient.prefs.v483overrideGlobal483
    BiliClient.prefs.v483overrideGlobal483 = !current
    AppToast.show(this, "Override Global483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV483PackAutoCompress483Toggle() {
    val current = BiliClient.prefs.v483packAutoCompress483
    BiliClient.prefs.v483packAutoCompress483 = !current
    AppToast.show(this, "Pack Auto Compress483: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484ModuleAutoLoad484Toggle() {
    val current = BiliClient.prefs.v484moduleAutoLoad484
    BiliClient.prefs.v484moduleAutoLoad484 = !current
    AppToast.show(this, "Module Auto Load484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484MonitorCpuUsage484Toggle() {
    val current = BiliClient.prefs.v484monitorCpuUsage484
    BiliClient.prefs.v484monitorCpuUsage484 = !current
    AppToast.show(this, "Monitor CPU Usage484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484MountAutoDetect484Toggle() {
    val current = BiliClient.prefs.v484mountAutoDetect484
    BiliClient.prefs.v484mountAutoDetect484 = !current
    AppToast.show(this, "Mount Auto Detect484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484MouseHoverPreview484Toggle() {
    val current = BiliClient.prefs.v484mouseHoverPreview484
    BiliClient.prefs.v484mouseHoverPreview484 = !current
    AppToast.show(this, "Mouse Hover Preview484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484MoveTransition484Toggle() {
    val current = BiliClient.prefs.v484moveTransition484
    BiliClient.prefs.v484moveTransition484 = !current
    AppToast.show(this, "Move Transition484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484MultiThreadDecode484Toggle() {
    val current = BiliClient.prefs.v484multiThreadDecode484
    BiliClient.prefs.v484multiThreadDecode484 = !current
    AppToast.show(this, "Multi Thread Decode484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484NavAutoCollapse484Toggle() {
    val current = BiliClient.prefs.v484navAutoCollapse484
    BiliClient.prefs.v484navAutoCollapse484 = !current
    AppToast.show(this, "Nav Auto Collapse484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484NodeAutoConnect484Toggle() {
    val current = BiliClient.prefs.v484nodeAutoConnect484
    BiliClient.prefs.v484nodeAutoConnect484 = !current
    AppToast.show(this, "Node Auto Connect484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484OffsetAutoCalibrate484Toggle() {
    val current = BiliClient.prefs.v484offsetAutoCalibrate484
    BiliClient.prefs.v484offsetAutoCalibrate484 = !current
    AppToast.show(this, "Offset Auto Calibrate484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484OpenWithExternal484Toggle() {
    val current = BiliClient.prefs.v484openWithExternal484
    BiliClient.prefs.v484openWithExternal484 = !current
    AppToast.show(this, "Open With External484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484OrderAutoSort484Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v484orderAutoSort484).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort484",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v484orderAutoSort484 = value
        AppToast.show(this, "Order Auto Sort484: $value")
    }
}

internal fun PlayerActivity.showV484OutputAutoSelect484Toggle() {
    val current = BiliClient.prefs.v484outputAutoSelect484
    BiliClient.prefs.v484outputAutoSelect484 = !current
    AppToast.show(this, "Output Auto Select484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484OverlayAutoShow484Toggle() {
    val current = BiliClient.prefs.v484overlayAutoShow484
    BiliClient.prefs.v484overlayAutoShow484 = !current
    AppToast.show(this, "Overlay Auto Show484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484OverrideGlobal484Toggle() {
    val current = BiliClient.prefs.v484overrideGlobal484
    BiliClient.prefs.v484overrideGlobal484 = !current
    AppToast.show(this, "Override Global484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV484PackAutoCompress484Toggle() {
    val current = BiliClient.prefs.v484packAutoCompress484
    BiliClient.prefs.v484packAutoCompress484 = !current
    AppToast.show(this, "Pack Auto Compress484: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485ModuleAutoLoad485Toggle() {
    val current = BiliClient.prefs.v485moduleAutoLoad485
    BiliClient.prefs.v485moduleAutoLoad485 = !current
    AppToast.show(this, "Module Auto Load485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485MonitorCpuUsage485Toggle() {
    val current = BiliClient.prefs.v485monitorCpuUsage485
    BiliClient.prefs.v485monitorCpuUsage485 = !current
    AppToast.show(this, "Monitor CPU Usage485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485MountAutoDetect485Toggle() {
    val current = BiliClient.prefs.v485mountAutoDetect485
    BiliClient.prefs.v485mountAutoDetect485 = !current
    AppToast.show(this, "Mount Auto Detect485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485MouseHoverPreview485Toggle() {
    val current = BiliClient.prefs.v485mouseHoverPreview485
    BiliClient.prefs.v485mouseHoverPreview485 = !current
    AppToast.show(this, "Mouse Hover Preview485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485MoveTransition485Toggle() {
    val current = BiliClient.prefs.v485moveTransition485
    BiliClient.prefs.v485moveTransition485 = !current
    AppToast.show(this, "Move Transition485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485MultiThreadDecode485Toggle() {
    val current = BiliClient.prefs.v485multiThreadDecode485
    BiliClient.prefs.v485multiThreadDecode485 = !current
    AppToast.show(this, "Multi Thread Decode485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485NavAutoCollapse485Toggle() {
    val current = BiliClient.prefs.v485navAutoCollapse485
    BiliClient.prefs.v485navAutoCollapse485 = !current
    AppToast.show(this, "Nav Auto Collapse485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485NodeAutoConnect485Toggle() {
    val current = BiliClient.prefs.v485nodeAutoConnect485
    BiliClient.prefs.v485nodeAutoConnect485 = !current
    AppToast.show(this, "Node Auto Connect485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485OffsetAutoCalibrate485Toggle() {
    val current = BiliClient.prefs.v485offsetAutoCalibrate485
    BiliClient.prefs.v485offsetAutoCalibrate485 = !current
    AppToast.show(this, "Offset Auto Calibrate485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485OpenWithExternal485Toggle() {
    val current = BiliClient.prefs.v485openWithExternal485
    BiliClient.prefs.v485openWithExternal485 = !current
    AppToast.show(this, "Open With External485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485OrderAutoSort485Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v485orderAutoSort485).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort485",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v485orderAutoSort485 = value
        AppToast.show(this, "Order Auto Sort485: $value")
    }
}

internal fun PlayerActivity.showV485OutputAutoSelect485Toggle() {
    val current = BiliClient.prefs.v485outputAutoSelect485
    BiliClient.prefs.v485outputAutoSelect485 = !current
    AppToast.show(this, "Output Auto Select485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485OverlayAutoShow485Toggle() {
    val current = BiliClient.prefs.v485overlayAutoShow485
    BiliClient.prefs.v485overlayAutoShow485 = !current
    AppToast.show(this, "Overlay Auto Show485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485OverrideGlobal485Toggle() {
    val current = BiliClient.prefs.v485overrideGlobal485
    BiliClient.prefs.v485overrideGlobal485 = !current
    AppToast.show(this, "Override Global485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV485PackAutoCompress485Toggle() {
    val current = BiliClient.prefs.v485packAutoCompress485
    BiliClient.prefs.v485packAutoCompress485 = !current
    AppToast.show(this, "Pack Auto Compress485: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486ModuleAutoLoad486Toggle() {
    val current = BiliClient.prefs.v486moduleAutoLoad486
    BiliClient.prefs.v486moduleAutoLoad486 = !current
    AppToast.show(this, "Module Auto Load486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486MonitorCpuUsage486Toggle() {
    val current = BiliClient.prefs.v486monitorCpuUsage486
    BiliClient.prefs.v486monitorCpuUsage486 = !current
    AppToast.show(this, "Monitor CPU Usage486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486MountAutoDetect486Toggle() {
    val current = BiliClient.prefs.v486mountAutoDetect486
    BiliClient.prefs.v486mountAutoDetect486 = !current
    AppToast.show(this, "Mount Auto Detect486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486MouseHoverPreview486Toggle() {
    val current = BiliClient.prefs.v486mouseHoverPreview486
    BiliClient.prefs.v486mouseHoverPreview486 = !current
    AppToast.show(this, "Mouse Hover Preview486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486MoveTransition486Toggle() {
    val current = BiliClient.prefs.v486moveTransition486
    BiliClient.prefs.v486moveTransition486 = !current
    AppToast.show(this, "Move Transition486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486MultiThreadDecode486Toggle() {
    val current = BiliClient.prefs.v486multiThreadDecode486
    BiliClient.prefs.v486multiThreadDecode486 = !current
    AppToast.show(this, "Multi Thread Decode486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486NavAutoCollapse486Toggle() {
    val current = BiliClient.prefs.v486navAutoCollapse486
    BiliClient.prefs.v486navAutoCollapse486 = !current
    AppToast.show(this, "Nav Auto Collapse486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486NodeAutoConnect486Toggle() {
    val current = BiliClient.prefs.v486nodeAutoConnect486
    BiliClient.prefs.v486nodeAutoConnect486 = !current
    AppToast.show(this, "Node Auto Connect486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486OffsetAutoCalibrate486Toggle() {
    val current = BiliClient.prefs.v486offsetAutoCalibrate486
    BiliClient.prefs.v486offsetAutoCalibrate486 = !current
    AppToast.show(this, "Offset Auto Calibrate486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486OpenWithExternal486Toggle() {
    val current = BiliClient.prefs.v486openWithExternal486
    BiliClient.prefs.v486openWithExternal486 = !current
    AppToast.show(this, "Open With External486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486OrderAutoSort486Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v486orderAutoSort486).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort486",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v486orderAutoSort486 = value
        AppToast.show(this, "Order Auto Sort486: $value")
    }
}

internal fun PlayerActivity.showV486OutputAutoSelect486Toggle() {
    val current = BiliClient.prefs.v486outputAutoSelect486
    BiliClient.prefs.v486outputAutoSelect486 = !current
    AppToast.show(this, "Output Auto Select486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486OverlayAutoShow486Toggle() {
    val current = BiliClient.prefs.v486overlayAutoShow486
    BiliClient.prefs.v486overlayAutoShow486 = !current
    AppToast.show(this, "Overlay Auto Show486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486OverrideGlobal486Toggle() {
    val current = BiliClient.prefs.v486overrideGlobal486
    BiliClient.prefs.v486overrideGlobal486 = !current
    AppToast.show(this, "Override Global486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV486PackAutoCompress486Toggle() {
    val current = BiliClient.prefs.v486packAutoCompress486
    BiliClient.prefs.v486packAutoCompress486 = !current
    AppToast.show(this, "Pack Auto Compress486: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487ModuleAutoLoad487Toggle() {
    val current = BiliClient.prefs.v487moduleAutoLoad487
    BiliClient.prefs.v487moduleAutoLoad487 = !current
    AppToast.show(this, "Module Auto Load487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487MonitorCpuUsage487Toggle() {
    val current = BiliClient.prefs.v487monitorCpuUsage487
    BiliClient.prefs.v487monitorCpuUsage487 = !current
    AppToast.show(this, "Monitor CPU Usage487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487MountAutoDetect487Toggle() {
    val current = BiliClient.prefs.v487mountAutoDetect487
    BiliClient.prefs.v487mountAutoDetect487 = !current
    AppToast.show(this, "Mount Auto Detect487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487MouseHoverPreview487Toggle() {
    val current = BiliClient.prefs.v487mouseHoverPreview487
    BiliClient.prefs.v487mouseHoverPreview487 = !current
    AppToast.show(this, "Mouse Hover Preview487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487MoveTransition487Toggle() {
    val current = BiliClient.prefs.v487moveTransition487
    BiliClient.prefs.v487moveTransition487 = !current
    AppToast.show(this, "Move Transition487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487MultiThreadDecode487Toggle() {
    val current = BiliClient.prefs.v487multiThreadDecode487
    BiliClient.prefs.v487multiThreadDecode487 = !current
    AppToast.show(this, "Multi Thread Decode487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487NavAutoCollapse487Toggle() {
    val current = BiliClient.prefs.v487navAutoCollapse487
    BiliClient.prefs.v487navAutoCollapse487 = !current
    AppToast.show(this, "Nav Auto Collapse487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487NodeAutoConnect487Toggle() {
    val current = BiliClient.prefs.v487nodeAutoConnect487
    BiliClient.prefs.v487nodeAutoConnect487 = !current
    AppToast.show(this, "Node Auto Connect487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487OffsetAutoCalibrate487Toggle() {
    val current = BiliClient.prefs.v487offsetAutoCalibrate487
    BiliClient.prefs.v487offsetAutoCalibrate487 = !current
    AppToast.show(this, "Offset Auto Calibrate487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487OpenWithExternal487Toggle() {
    val current = BiliClient.prefs.v487openWithExternal487
    BiliClient.prefs.v487openWithExternal487 = !current
    AppToast.show(this, "Open With External487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487OrderAutoSort487Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v487orderAutoSort487).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort487",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v487orderAutoSort487 = value
        AppToast.show(this, "Order Auto Sort487: $value")
    }
}

internal fun PlayerActivity.showV487OutputAutoSelect487Toggle() {
    val current = BiliClient.prefs.v487outputAutoSelect487
    BiliClient.prefs.v487outputAutoSelect487 = !current
    AppToast.show(this, "Output Auto Select487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487OverlayAutoShow487Toggle() {
    val current = BiliClient.prefs.v487overlayAutoShow487
    BiliClient.prefs.v487overlayAutoShow487 = !current
    AppToast.show(this, "Overlay Auto Show487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487OverrideGlobal487Toggle() {
    val current = BiliClient.prefs.v487overrideGlobal487
    BiliClient.prefs.v487overrideGlobal487 = !current
    AppToast.show(this, "Override Global487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV487PackAutoCompress487Toggle() {
    val current = BiliClient.prefs.v487packAutoCompress487
    BiliClient.prefs.v487packAutoCompress487 = !current
    AppToast.show(this, "Pack Auto Compress487: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488ModuleAutoLoad488Toggle() {
    val current = BiliClient.prefs.v488moduleAutoLoad488
    BiliClient.prefs.v488moduleAutoLoad488 = !current
    AppToast.show(this, "Module Auto Load488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488MonitorCpuUsage488Toggle() {
    val current = BiliClient.prefs.v488monitorCpuUsage488
    BiliClient.prefs.v488monitorCpuUsage488 = !current
    AppToast.show(this, "Monitor CPU Usage488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488MountAutoDetect488Toggle() {
    val current = BiliClient.prefs.v488mountAutoDetect488
    BiliClient.prefs.v488mountAutoDetect488 = !current
    AppToast.show(this, "Mount Auto Detect488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488MouseHoverPreview488Toggle() {
    val current = BiliClient.prefs.v488mouseHoverPreview488
    BiliClient.prefs.v488mouseHoverPreview488 = !current
    AppToast.show(this, "Mouse Hover Preview488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488MoveTransition488Toggle() {
    val current = BiliClient.prefs.v488moveTransition488
    BiliClient.prefs.v488moveTransition488 = !current
    AppToast.show(this, "Move Transition488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488MultiThreadDecode488Toggle() {
    val current = BiliClient.prefs.v488multiThreadDecode488
    BiliClient.prefs.v488multiThreadDecode488 = !current
    AppToast.show(this, "Multi Thread Decode488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488NavAutoCollapse488Toggle() {
    val current = BiliClient.prefs.v488navAutoCollapse488
    BiliClient.prefs.v488navAutoCollapse488 = !current
    AppToast.show(this, "Nav Auto Collapse488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488NodeAutoConnect488Toggle() {
    val current = BiliClient.prefs.v488nodeAutoConnect488
    BiliClient.prefs.v488nodeAutoConnect488 = !current
    AppToast.show(this, "Node Auto Connect488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488OffsetAutoCalibrate488Toggle() {
    val current = BiliClient.prefs.v488offsetAutoCalibrate488
    BiliClient.prefs.v488offsetAutoCalibrate488 = !current
    AppToast.show(this, "Offset Auto Calibrate488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488OpenWithExternal488Toggle() {
    val current = BiliClient.prefs.v488openWithExternal488
    BiliClient.prefs.v488openWithExternal488 = !current
    AppToast.show(this, "Open With External488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488OrderAutoSort488Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v488orderAutoSort488).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort488",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v488orderAutoSort488 = value
        AppToast.show(this, "Order Auto Sort488: $value")
    }
}

internal fun PlayerActivity.showV488OutputAutoSelect488Toggle() {
    val current = BiliClient.prefs.v488outputAutoSelect488
    BiliClient.prefs.v488outputAutoSelect488 = !current
    AppToast.show(this, "Output Auto Select488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488OverlayAutoShow488Toggle() {
    val current = BiliClient.prefs.v488overlayAutoShow488
    BiliClient.prefs.v488overlayAutoShow488 = !current
    AppToast.show(this, "Overlay Auto Show488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488OverrideGlobal488Toggle() {
    val current = BiliClient.prefs.v488overrideGlobal488
    BiliClient.prefs.v488overrideGlobal488 = !current
    AppToast.show(this, "Override Global488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV488PackAutoCompress488Toggle() {
    val current = BiliClient.prefs.v488packAutoCompress488
    BiliClient.prefs.v488packAutoCompress488 = !current
    AppToast.show(this, "Pack Auto Compress488: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489ModuleAutoLoad489Toggle() {
    val current = BiliClient.prefs.v489moduleAutoLoad489
    BiliClient.prefs.v489moduleAutoLoad489 = !current
    AppToast.show(this, "Module Auto Load489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489MonitorCpuUsage489Toggle() {
    val current = BiliClient.prefs.v489monitorCpuUsage489
    BiliClient.prefs.v489monitorCpuUsage489 = !current
    AppToast.show(this, "Monitor CPU Usage489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489MountAutoDetect489Toggle() {
    val current = BiliClient.prefs.v489mountAutoDetect489
    BiliClient.prefs.v489mountAutoDetect489 = !current
    AppToast.show(this, "Mount Auto Detect489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489MouseHoverPreview489Toggle() {
    val current = BiliClient.prefs.v489mouseHoverPreview489
    BiliClient.prefs.v489mouseHoverPreview489 = !current
    AppToast.show(this, "Mouse Hover Preview489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489MoveTransition489Toggle() {
    val current = BiliClient.prefs.v489moveTransition489
    BiliClient.prefs.v489moveTransition489 = !current
    AppToast.show(this, "Move Transition489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489MultiThreadDecode489Toggle() {
    val current = BiliClient.prefs.v489multiThreadDecode489
    BiliClient.prefs.v489multiThreadDecode489 = !current
    AppToast.show(this, "Multi Thread Decode489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489NavAutoCollapse489Toggle() {
    val current = BiliClient.prefs.v489navAutoCollapse489
    BiliClient.prefs.v489navAutoCollapse489 = !current
    AppToast.show(this, "Nav Auto Collapse489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489NodeAutoConnect489Toggle() {
    val current = BiliClient.prefs.v489nodeAutoConnect489
    BiliClient.prefs.v489nodeAutoConnect489 = !current
    AppToast.show(this, "Node Auto Connect489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489OffsetAutoCalibrate489Toggle() {
    val current = BiliClient.prefs.v489offsetAutoCalibrate489
    BiliClient.prefs.v489offsetAutoCalibrate489 = !current
    AppToast.show(this, "Offset Auto Calibrate489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489OpenWithExternal489Toggle() {
    val current = BiliClient.prefs.v489openWithExternal489
    BiliClient.prefs.v489openWithExternal489 = !current
    AppToast.show(this, "Open With External489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489OrderAutoSort489Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v489orderAutoSort489).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort489",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v489orderAutoSort489 = value
        AppToast.show(this, "Order Auto Sort489: $value")
    }
}

internal fun PlayerActivity.showV489OutputAutoSelect489Toggle() {
    val current = BiliClient.prefs.v489outputAutoSelect489
    BiliClient.prefs.v489outputAutoSelect489 = !current
    AppToast.show(this, "Output Auto Select489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489OverlayAutoShow489Toggle() {
    val current = BiliClient.prefs.v489overlayAutoShow489
    BiliClient.prefs.v489overlayAutoShow489 = !current
    AppToast.show(this, "Overlay Auto Show489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489OverrideGlobal489Toggle() {
    val current = BiliClient.prefs.v489overrideGlobal489
    BiliClient.prefs.v489overrideGlobal489 = !current
    AppToast.show(this, "Override Global489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV489PackAutoCompress489Toggle() {
    val current = BiliClient.prefs.v489packAutoCompress489
    BiliClient.prefs.v489packAutoCompress489 = !current
    AppToast.show(this, "Pack Auto Compress489: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490ModuleAutoLoad490Toggle() {
    val current = BiliClient.prefs.v490moduleAutoLoad490
    BiliClient.prefs.v490moduleAutoLoad490 = !current
    AppToast.show(this, "Module Auto Load490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490MonitorCpuUsage490Toggle() {
    val current = BiliClient.prefs.v490monitorCpuUsage490
    BiliClient.prefs.v490monitorCpuUsage490 = !current
    AppToast.show(this, "Monitor CPU Usage490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490MountAutoDetect490Toggle() {
    val current = BiliClient.prefs.v490mountAutoDetect490
    BiliClient.prefs.v490mountAutoDetect490 = !current
    AppToast.show(this, "Mount Auto Detect490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490MouseHoverPreview490Toggle() {
    val current = BiliClient.prefs.v490mouseHoverPreview490
    BiliClient.prefs.v490mouseHoverPreview490 = !current
    AppToast.show(this, "Mouse Hover Preview490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490MoveTransition490Toggle() {
    val current = BiliClient.prefs.v490moveTransition490
    BiliClient.prefs.v490moveTransition490 = !current
    AppToast.show(this, "Move Transition490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490MultiThreadDecode490Toggle() {
    val current = BiliClient.prefs.v490multiThreadDecode490
    BiliClient.prefs.v490multiThreadDecode490 = !current
    AppToast.show(this, "Multi Thread Decode490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490NavAutoCollapse490Toggle() {
    val current = BiliClient.prefs.v490navAutoCollapse490
    BiliClient.prefs.v490navAutoCollapse490 = !current
    AppToast.show(this, "Nav Auto Collapse490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490NodeAutoConnect490Toggle() {
    val current = BiliClient.prefs.v490nodeAutoConnect490
    BiliClient.prefs.v490nodeAutoConnect490 = !current
    AppToast.show(this, "Node Auto Connect490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490OffsetAutoCalibrate490Toggle() {
    val current = BiliClient.prefs.v490offsetAutoCalibrate490
    BiliClient.prefs.v490offsetAutoCalibrate490 = !current
    AppToast.show(this, "Offset Auto Calibrate490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490OpenWithExternal490Toggle() {
    val current = BiliClient.prefs.v490openWithExternal490
    BiliClient.prefs.v490openWithExternal490 = !current
    AppToast.show(this, "Open With External490: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV490OutputAutoSelect490Toggle() {
    val current = BiliClient.prefs.v490outputAutoSelect490
    BiliClient.prefs.v490outputAutoSelect490 = !current
    AppToast.show(this, "Output Auto Select490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490OverlayAutoShow490Toggle() {
    val current = BiliClient.prefs.v490overlayAutoShow490
    BiliClient.prefs.v490overlayAutoShow490 = !current
    AppToast.show(this, "Overlay Auto Show490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490OverrideGlobal490Toggle() {
    val current = BiliClient.prefs.v490overrideGlobal490
    BiliClient.prefs.v490overrideGlobal490 = !current
    AppToast.show(this, "Override Global490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV490PackAutoCompress490Toggle() {
    val current = BiliClient.prefs.v490packAutoCompress490
    BiliClient.prefs.v490packAutoCompress490 = !current
    AppToast.show(this, "Pack Auto Compress490: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PadAutoDetect491Toggle() {
    val current = BiliClient.prefs.v491padAutoDetect491
    BiliClient.prefs.v491padAutoDetect491 = !current
    AppToast.show(this, "Pad Auto Detect491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491ParentControlPin491Toggle() {
    val current = BiliClient.prefs.v491parentControlPin491
    BiliClient.prefs.v491parentControlPin491 = !current
    AppToast.show(this, "Parent Control Pin491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PassThroughAudio491Toggle() {
    val current = BiliClient.prefs.v491passThroughAudio491
    BiliClient.prefs.v491passThroughAudio491 = !current
    AppToast.show(this, "Pass Through Audio491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PathAutoResolve491Toggle() {
    val current = BiliClient.prefs.v491pathAutoResolve491
    BiliClient.prefs.v491pathAutoResolve491 = !current
    AppToast.show(this, "Path Auto Resolve491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PatternAutoMatch491Toggle() {
    val current = BiliClient.prefs.v491patternAutoMatch491
    BiliClient.prefs.v491patternAutoMatch491 = !current
    AppToast.show(this, "Pattern Auto Match491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PauseOnHeadset491Toggle() {
    val current = BiliClient.prefs.v491pauseOnHeadset491
    BiliClient.prefs.v491pauseOnHeadset491 = !current
    AppToast.show(this, "Pause On Headset491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PeakAutoDetect491Toggle() {
    val current = BiliClient.prefs.v491peakAutoDetect491
    BiliClient.prefs.v491peakAutoDetect491 = !current
    AppToast.show(this, "Peak Auto Detect491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PeriodAutoExtend491Toggle() {
    val current = BiliClient.prefs.v491periodAutoExtend491
    BiliClient.prefs.v491periodAutoExtend491 = !current
    AppToast.show(this, "Period Auto Extend491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PermissionAutoGrant491Toggle() {
    val current = BiliClient.prefs.v491permissionAutoGrant491
    BiliClient.prefs.v491permissionAutoGrant491 = !current
    AppToast.show(this, "Permission Auto Grant491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PhaseAutoAlign491Toggle() {
    val current = BiliClient.prefs.v491phaseAutoAlign491
    BiliClient.prefs.v491phaseAutoAlign491 = !current
    AppToast.show(this, "Phase Auto Align491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PhoneAutoAnswer491Toggle() {
    val current = BiliClient.prefs.v491phoneAutoAnswer491
    BiliClient.prefs.v491phoneAutoAnswer491 = !current
    AppToast.show(this, "Phone Auto Answer491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PickAutoConfirm491Toggle() {
    val current = BiliClient.prefs.v491pickAutoConfirm491
    BiliClient.prefs.v491pickAutoConfirm491 = !current
    AppToast.show(this, "Pick Auto Confirm491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PinToTop491Toggle() {
    val current = BiliClient.prefs.v491pinToTop491
    BiliClient.prefs.v491pinToTop491 = !current
    AppToast.show(this, "Pin To Top491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PipeAutoRoute491Toggle() {
    val current = BiliClient.prefs.v491pipeAutoRoute491
    BiliClient.prefs.v491pipeAutoRoute491 = !current
    AppToast.show(this, "Pipe Auto Route491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV491PixelAutoCorrect491Toggle() {
    val current = BiliClient.prefs.v491pixelAutoCorrect491
    BiliClient.prefs.v491pixelAutoCorrect491 = !current
    AppToast.show(this, "Pixel Auto Correct491: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PadAutoDetect492Toggle() {
    val current = BiliClient.prefs.v492padAutoDetect492
    BiliClient.prefs.v492padAutoDetect492 = !current
    AppToast.show(this, "Pad Auto Detect492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492ParentControlPin492Toggle() {
    val current = BiliClient.prefs.v492parentControlPin492
    BiliClient.prefs.v492parentControlPin492 = !current
    AppToast.show(this, "Parent Control Pin492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PassThroughAudio492Toggle() {
    val current = BiliClient.prefs.v492passThroughAudio492
    BiliClient.prefs.v492passThroughAudio492 = !current
    AppToast.show(this, "Pass Through Audio492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PathAutoResolve492Toggle() {
    val current = BiliClient.prefs.v492pathAutoResolve492
    BiliClient.prefs.v492pathAutoResolve492 = !current
    AppToast.show(this, "Path Auto Resolve492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PatternAutoMatch492Toggle() {
    val current = BiliClient.prefs.v492patternAutoMatch492
    BiliClient.prefs.v492patternAutoMatch492 = !current
    AppToast.show(this, "Pattern Auto Match492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PauseOnHeadset492Toggle() {
    val current = BiliClient.prefs.v492pauseOnHeadset492
    BiliClient.prefs.v492pauseOnHeadset492 = !current
    AppToast.show(this, "Pause On Headset492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PeakAutoDetect492Toggle() {
    val current = BiliClient.prefs.v492peakAutoDetect492
    BiliClient.prefs.v492peakAutoDetect492 = !current
    AppToast.show(this, "Peak Auto Detect492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PeriodAutoExtend492Toggle() {
    val current = BiliClient.prefs.v492periodAutoExtend492
    BiliClient.prefs.v492periodAutoExtend492 = !current
    AppToast.show(this, "Period Auto Extend492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PermissionAutoGrant492Toggle() {
    val current = BiliClient.prefs.v492permissionAutoGrant492
    BiliClient.prefs.v492permissionAutoGrant492 = !current
    AppToast.show(this, "Permission Auto Grant492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PhaseAutoAlign492Toggle() {
    val current = BiliClient.prefs.v492phaseAutoAlign492
    BiliClient.prefs.v492phaseAutoAlign492 = !current
    AppToast.show(this, "Phase Auto Align492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PhoneAutoAnswer492Toggle() {
    val current = BiliClient.prefs.v492phoneAutoAnswer492
    BiliClient.prefs.v492phoneAutoAnswer492 = !current
    AppToast.show(this, "Phone Auto Answer492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PickAutoConfirm492Toggle() {
    val current = BiliClient.prefs.v492pickAutoConfirm492
    BiliClient.prefs.v492pickAutoConfirm492 = !current
    AppToast.show(this, "Pick Auto Confirm492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PinToTop492Toggle() {
    val current = BiliClient.prefs.v492pinToTop492
    BiliClient.prefs.v492pinToTop492 = !current
    AppToast.show(this, "Pin To Top492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PipeAutoRoute492Toggle() {
    val current = BiliClient.prefs.v492pipeAutoRoute492
    BiliClient.prefs.v492pipeAutoRoute492 = !current
    AppToast.show(this, "Pipe Auto Route492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV492PixelAutoCorrect492Toggle() {
    val current = BiliClient.prefs.v492pixelAutoCorrect492
    BiliClient.prefs.v492pixelAutoCorrect492 = !current
    AppToast.show(this, "Pixel Auto Correct492: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PadAutoDetect493Toggle() {
    val current = BiliClient.prefs.v493padAutoDetect493
    BiliClient.prefs.v493padAutoDetect493 = !current
    AppToast.show(this, "Pad Auto Detect493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493ParentControlPin493Toggle() {
    val current = BiliClient.prefs.v493parentControlPin493
    BiliClient.prefs.v493parentControlPin493 = !current
    AppToast.show(this, "Parent Control Pin493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PassThroughAudio493Toggle() {
    val current = BiliClient.prefs.v493passThroughAudio493
    BiliClient.prefs.v493passThroughAudio493 = !current
    AppToast.show(this, "Pass Through Audio493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PathAutoResolve493Toggle() {
    val current = BiliClient.prefs.v493pathAutoResolve493
    BiliClient.prefs.v493pathAutoResolve493 = !current
    AppToast.show(this, "Path Auto Resolve493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PatternAutoMatch493Toggle() {
    val current = BiliClient.prefs.v493patternAutoMatch493
    BiliClient.prefs.v493patternAutoMatch493 = !current
    AppToast.show(this, "Pattern Auto Match493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PauseOnHeadset493Toggle() {
    val current = BiliClient.prefs.v493pauseOnHeadset493
    BiliClient.prefs.v493pauseOnHeadset493 = !current
    AppToast.show(this, "Pause On Headset493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PeakAutoDetect493Toggle() {
    val current = BiliClient.prefs.v493peakAutoDetect493
    BiliClient.prefs.v493peakAutoDetect493 = !current
    AppToast.show(this, "Peak Auto Detect493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PeriodAutoExtend493Toggle() {
    val current = BiliClient.prefs.v493periodAutoExtend493
    BiliClient.prefs.v493periodAutoExtend493 = !current
    AppToast.show(this, "Period Auto Extend493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PermissionAutoGrant493Toggle() {
    val current = BiliClient.prefs.v493permissionAutoGrant493
    BiliClient.prefs.v493permissionAutoGrant493 = !current
    AppToast.show(this, "Permission Auto Grant493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PhaseAutoAlign493Toggle() {
    val current = BiliClient.prefs.v493phaseAutoAlign493
    BiliClient.prefs.v493phaseAutoAlign493 = !current
    AppToast.show(this, "Phase Auto Align493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PhoneAutoAnswer493Toggle() {
    val current = BiliClient.prefs.v493phoneAutoAnswer493
    BiliClient.prefs.v493phoneAutoAnswer493 = !current
    AppToast.show(this, "Phone Auto Answer493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PickAutoConfirm493Toggle() {
    val current = BiliClient.prefs.v493pickAutoConfirm493
    BiliClient.prefs.v493pickAutoConfirm493 = !current
    AppToast.show(this, "Pick Auto Confirm493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PinToTop493Toggle() {
    val current = BiliClient.prefs.v493pinToTop493
    BiliClient.prefs.v493pinToTop493 = !current
    AppToast.show(this, "Pin To Top493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PipeAutoRoute493Toggle() {
    val current = BiliClient.prefs.v493pipeAutoRoute493
    BiliClient.prefs.v493pipeAutoRoute493 = !current
    AppToast.show(this, "Pipe Auto Route493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV493PixelAutoCorrect493Toggle() {
    val current = BiliClient.prefs.v493pixelAutoCorrect493
    BiliClient.prefs.v493pixelAutoCorrect493 = !current
    AppToast.show(this, "Pixel Auto Correct493: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PadAutoDetect494Toggle() {
    val current = BiliClient.prefs.v494padAutoDetect494
    BiliClient.prefs.v494padAutoDetect494 = !current
    AppToast.show(this, "Pad Auto Detect494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494ParentControlPin494Toggle() {
    val current = BiliClient.prefs.v494parentControlPin494
    BiliClient.prefs.v494parentControlPin494 = !current
    AppToast.show(this, "Parent Control Pin494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PassThroughAudio494Toggle() {
    val current = BiliClient.prefs.v494passThroughAudio494
    BiliClient.prefs.v494passThroughAudio494 = !current
    AppToast.show(this, "Pass Through Audio494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PathAutoResolve494Toggle() {
    val current = BiliClient.prefs.v494pathAutoResolve494
    BiliClient.prefs.v494pathAutoResolve494 = !current
    AppToast.show(this, "Path Auto Resolve494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PatternAutoMatch494Toggle() {
    val current = BiliClient.prefs.v494patternAutoMatch494
    BiliClient.prefs.v494patternAutoMatch494 = !current
    AppToast.show(this, "Pattern Auto Match494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PauseOnHeadset494Toggle() {
    val current = BiliClient.prefs.v494pauseOnHeadset494
    BiliClient.prefs.v494pauseOnHeadset494 = !current
    AppToast.show(this, "Pause On Headset494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PeakAutoDetect494Toggle() {
    val current = BiliClient.prefs.v494peakAutoDetect494
    BiliClient.prefs.v494peakAutoDetect494 = !current
    AppToast.show(this, "Peak Auto Detect494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PeriodAutoExtend494Toggle() {
    val current = BiliClient.prefs.v494periodAutoExtend494
    BiliClient.prefs.v494periodAutoExtend494 = !current
    AppToast.show(this, "Period Auto Extend494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PermissionAutoGrant494Toggle() {
    val current = BiliClient.prefs.v494permissionAutoGrant494
    BiliClient.prefs.v494permissionAutoGrant494 = !current
    AppToast.show(this, "Permission Auto Grant494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PhaseAutoAlign494Toggle() {
    val current = BiliClient.prefs.v494phaseAutoAlign494
    BiliClient.prefs.v494phaseAutoAlign494 = !current
    AppToast.show(this, "Phase Auto Align494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PhoneAutoAnswer494Toggle() {
    val current = BiliClient.prefs.v494phoneAutoAnswer494
    BiliClient.prefs.v494phoneAutoAnswer494 = !current
    AppToast.show(this, "Phone Auto Answer494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PickAutoConfirm494Toggle() {
    val current = BiliClient.prefs.v494pickAutoConfirm494
    BiliClient.prefs.v494pickAutoConfirm494 = !current
    AppToast.show(this, "Pick Auto Confirm494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PinToTop494Toggle() {
    val current = BiliClient.prefs.v494pinToTop494
    BiliClient.prefs.v494pinToTop494 = !current
    AppToast.show(this, "Pin To Top494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PipeAutoRoute494Toggle() {
    val current = BiliClient.prefs.v494pipeAutoRoute494
    BiliClient.prefs.v494pipeAutoRoute494 = !current
    AppToast.show(this, "Pipe Auto Route494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV494PixelAutoCorrect494Toggle() {
    val current = BiliClient.prefs.v494pixelAutoCorrect494
    BiliClient.prefs.v494pixelAutoCorrect494 = !current
    AppToast.show(this, "Pixel Auto Correct494: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV495PadAutoDetect495Toggle() {
    val current = BiliClient.prefs.v495padAutoDetect495
    BiliClient.prefs.v495padAutoDetect495 = !current
    AppToast.show(this, "Pad Auto Detect495: ${if (!current) "ON" else "OFF"}")
}

