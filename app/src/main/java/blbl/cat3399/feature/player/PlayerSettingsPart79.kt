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

// v971: Smooth Auto Scroll971
internal fun PlayerActivity.showV971SmoothAutoScroll971Toggle() {
    val current = BiliClient.prefs.v971smoothAutoScroll971
    BiliClient.prefs.v971smoothAutoScroll971 = !current
    AppToast.show(this, "Smooth Auto Scroll971: ${if (!current) "ON" else "OFF"}")
}

// v971: Snap Auto Grid971
internal fun PlayerActivity.showV971SnapAutoGrid971Toggle() {
    val current = BiliClient.prefs.v971snapAutoGrid971
    BiliClient.prefs.v971snapAutoGrid971 = !current
    AppToast.show(this, "Snap Auto Grid971: ${if (!current) "ON" else "OFF"}")
}

// v971: Socket Auto KeepAlive971
internal fun PlayerActivity.showV971SocketAutoKeepAlive971Toggle() {
    val current = BiliClient.prefs.v971socketAutoKeepAlive971
    BiliClient.prefs.v971socketAutoKeepAlive971 = !current
    AppToast.show(this, "Socket Auto KeepAlive971: ${if (!current) "ON" else "OFF"}")
}

// v971: Soft Auto Keyboard971
internal fun PlayerActivity.showV971SoftAutoKeyboard971Toggle() {
    val current = BiliClient.prefs.v971softAutoKeyboard971
    BiliClient.prefs.v971softAutoKeyboard971 = !current
    AppToast.show(this, "Soft Auto Keyboard971: ${if (!current) "ON" else "OFF"}")
}

// v971: Sort Auto Algorithm971
internal fun PlayerActivity.showV971SortAutoAlgorithm971Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v971sortAutoAlgorithm971).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm971",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v971sortAutoAlgorithm971 = value
        AppToast.show(this, "Sort Auto Algorithm971: $value")
    }
}

// v971: Source Auto Select971
internal fun PlayerActivity.showV971SourceAutoSelect971Toggle() {
    val current = BiliClient.prefs.v971sourceAutoSelect971
    BiliClient.prefs.v971sourceAutoSelect971 = !current
    AppToast.show(this, "Source Auto Select971: ${if (!current) "ON" else "OFF"}")
}

// v971: Space Auto Compact971
internal fun PlayerActivity.showV971SpaceAutoCompact971Toggle() {
    val current = BiliClient.prefs.v971spaceAutoCompact971
    BiliClient.prefs.v971spaceAutoCompact971 = !current
    AppToast.show(this, "Space Auto Compact971: ${if (!current) "ON" else "OFF"}")
}

// v971: Span Auto Column971
internal fun PlayerActivity.showV971SpanAutoColumn971Toggle() {
    val current = BiliClient.prefs.v971spanAutoColumn971
    BiliClient.prefs.v971spanAutoColumn971 = !current
    AppToast.show(this, "Span Auto Column971: ${if (!current) "ON" else "OFF"}")
}

// v971: Spawn Auto Worker971
internal fun PlayerActivity.showV971SpawnAutoWorker971Toggle() {
    val current = BiliClient.prefs.v971spawnAutoWorker971
    BiliClient.prefs.v971spawnAutoWorker971 = !current
    AppToast.show(this, "Spawn Auto Worker971: ${if (!current) "ON" else "OFF"}")
}

// v971: Speed Auto Adaptive971
internal fun PlayerActivity.showV971SpeedAutoAdaptive971Toggle() {
    val current = BiliClient.prefs.v971speedAutoAdaptive971
    BiliClient.prefs.v971speedAutoAdaptive971 = !current
    AppToast.show(this, "Speed Auto Adaptive971: ${if (!current) "ON" else "OFF"}")
}

// v971: Split Auto Pane971
internal fun PlayerActivity.showV971SplitAutoPane971Toggle() {
    val current = BiliClient.prefs.v971splitAutoPane971
    BiliClient.prefs.v971splitAutoPane971 = !current
    AppToast.show(this, "Split Auto Pane971: ${if (!current) "ON" else "OFF"}")
}

// v971: Spot Auto Light971
internal fun PlayerActivity.showV971SpotAutoLight971Toggle() {
    val current = BiliClient.prefs.v971spotAutoLight971
    BiliClient.prefs.v971spotAutoLight971 = !current
    AppToast.show(this, "Spot Auto Light971: ${if (!current) "ON" else "OFF"}")
}

// v971: Stack Auto Trace971
internal fun PlayerActivity.showV971StackAutoTrace971Toggle() {
    val current = BiliClient.prefs.v971stackAutoTrace971
    BiliClient.prefs.v971stackAutoTrace971 = !current
    AppToast.show(this, "Stack Auto Trace971: ${if (!current) "ON" else "OFF"}")
}

// v971: Stage Auto Progress971
internal fun PlayerActivity.showV971StageAutoProgress971Toggle() {
    val current = BiliClient.prefs.v971stageAutoProgress971
    BiliClient.prefs.v971stageAutoProgress971 = !current
    AppToast.show(this, "Stage Auto Progress971: ${if (!current) "ON" else "OFF"}")
}

// v971: Standard Auto Compliance971
internal fun PlayerActivity.showV971StandardAutoCompliance971Toggle() {
    val current = BiliClient.prefs.v971standardAutoCompliance971
    BiliClient.prefs.v971standardAutoCompliance971 = !current
    AppToast.show(this, "Standard Auto Compliance971: ${if (!current) "ON" else "OFF"}")
}

// v972: Smooth Auto Scroll972
internal fun PlayerActivity.showV972SmoothAutoScroll972Toggle() {
    val current = BiliClient.prefs.v972smoothAutoScroll972
    BiliClient.prefs.v972smoothAutoScroll972 = !current
    AppToast.show(this, "Smooth Auto Scroll972: ${if (!current) "ON" else "OFF"}")
}

// v972: Snap Auto Grid972
internal fun PlayerActivity.showV972SnapAutoGrid972Toggle() {
    val current = BiliClient.prefs.v972snapAutoGrid972
    BiliClient.prefs.v972snapAutoGrid972 = !current
    AppToast.show(this, "Snap Auto Grid972: ${if (!current) "ON" else "OFF"}")
}

// v972: Socket Auto KeepAlive972
internal fun PlayerActivity.showV972SocketAutoKeepAlive972Toggle() {
    val current = BiliClient.prefs.v972socketAutoKeepAlive972
    BiliClient.prefs.v972socketAutoKeepAlive972 = !current
    AppToast.show(this, "Socket Auto KeepAlive972: ${if (!current) "ON" else "OFF"}")
}

// v972: Soft Auto Keyboard972
internal fun PlayerActivity.showV972SoftAutoKeyboard972Toggle() {
    val current = BiliClient.prefs.v972softAutoKeyboard972
    BiliClient.prefs.v972softAutoKeyboard972 = !current
    AppToast.show(this, "Soft Auto Keyboard972: ${if (!current) "ON" else "OFF"}")
}

// v972: Sort Auto Algorithm972
internal fun PlayerActivity.showV972SortAutoAlgorithm972Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v972sortAutoAlgorithm972).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm972",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v972sortAutoAlgorithm972 = value
        AppToast.show(this, "Sort Auto Algorithm972: $value")
    }
}

// v972: Source Auto Select972
internal fun PlayerActivity.showV972SourceAutoSelect972Toggle() {
    val current = BiliClient.prefs.v972sourceAutoSelect972
    BiliClient.prefs.v972sourceAutoSelect972 = !current
    AppToast.show(this, "Source Auto Select972: ${if (!current) "ON" else "OFF"}")
}

// v972: Space Auto Compact972
internal fun PlayerActivity.showV972SpaceAutoCompact972Toggle() {
    val current = BiliClient.prefs.v972spaceAutoCompact972
    BiliClient.prefs.v972spaceAutoCompact972 = !current
    AppToast.show(this, "Space Auto Compact972: ${if (!current) "ON" else "OFF"}")
}

// v972: Span Auto Column972
internal fun PlayerActivity.showV972SpanAutoColumn972Toggle() {
    val current = BiliClient.prefs.v972spanAutoColumn972
    BiliClient.prefs.v972spanAutoColumn972 = !current
    AppToast.show(this, "Span Auto Column972: ${if (!current) "ON" else "OFF"}")
}

// v972: Spawn Auto Worker972
internal fun PlayerActivity.showV972SpawnAutoWorker972Toggle() {
    val current = BiliClient.prefs.v972spawnAutoWorker972
    BiliClient.prefs.v972spawnAutoWorker972 = !current
    AppToast.show(this, "Spawn Auto Worker972: ${if (!current) "ON" else "OFF"}")
}

// v972: Speed Auto Adaptive972
internal fun PlayerActivity.showV972SpeedAutoAdaptive972Toggle() {
    val current = BiliClient.prefs.v972speedAutoAdaptive972
    BiliClient.prefs.v972speedAutoAdaptive972 = !current
    AppToast.show(this, "Speed Auto Adaptive972: ${if (!current) "ON" else "OFF"}")
}

// v972: Split Auto Pane972
internal fun PlayerActivity.showV972SplitAutoPane972Toggle() {
    val current = BiliClient.prefs.v972splitAutoPane972
    BiliClient.prefs.v972splitAutoPane972 = !current
    AppToast.show(this, "Split Auto Pane972: ${if (!current) "ON" else "OFF"}")
}

// v972: Spot Auto Light972
internal fun PlayerActivity.showV972SpotAutoLight972Toggle() {
    val current = BiliClient.prefs.v972spotAutoLight972
    BiliClient.prefs.v972spotAutoLight972 = !current
    AppToast.show(this, "Spot Auto Light972: ${if (!current) "ON" else "OFF"}")
}

// v972: Stack Auto Trace972
internal fun PlayerActivity.showV972StackAutoTrace972Toggle() {
    val current = BiliClient.prefs.v972stackAutoTrace972
    BiliClient.prefs.v972stackAutoTrace972 = !current
    AppToast.show(this, "Stack Auto Trace972: ${if (!current) "ON" else "OFF"}")
}

// v972: Stage Auto Progress972
internal fun PlayerActivity.showV972StageAutoProgress972Toggle() {
    val current = BiliClient.prefs.v972stageAutoProgress972
    BiliClient.prefs.v972stageAutoProgress972 = !current
    AppToast.show(this, "Stage Auto Progress972: ${if (!current) "ON" else "OFF"}")
}

// v972: Standard Auto Compliance972
internal fun PlayerActivity.showV972StandardAutoCompliance972Toggle() {
    val current = BiliClient.prefs.v972standardAutoCompliance972
    BiliClient.prefs.v972standardAutoCompliance972 = !current
    AppToast.show(this, "Standard Auto Compliance972: ${if (!current) "ON" else "OFF"}")
}

// v973: Smooth Auto Scroll973
internal fun PlayerActivity.showV973SmoothAutoScroll973Toggle() {
    val current = BiliClient.prefs.v973smoothAutoScroll973
    BiliClient.prefs.v973smoothAutoScroll973 = !current
    AppToast.show(this, "Smooth Auto Scroll973: ${if (!current) "ON" else "OFF"}")
}

// v973: Snap Auto Grid973
internal fun PlayerActivity.showV973SnapAutoGrid973Toggle() {
    val current = BiliClient.prefs.v973snapAutoGrid973
    BiliClient.prefs.v973snapAutoGrid973 = !current
    AppToast.show(this, "Snap Auto Grid973: ${if (!current) "ON" else "OFF"}")
}

// v973: Socket Auto KeepAlive973
internal fun PlayerActivity.showV973SocketAutoKeepAlive973Toggle() {
    val current = BiliClient.prefs.v973socketAutoKeepAlive973
    BiliClient.prefs.v973socketAutoKeepAlive973 = !current
    AppToast.show(this, "Socket Auto KeepAlive973: ${if (!current) "ON" else "OFF"}")
}

// v973: Soft Auto Keyboard973
internal fun PlayerActivity.showV973SoftAutoKeyboard973Toggle() {
    val current = BiliClient.prefs.v973softAutoKeyboard973
    BiliClient.prefs.v973softAutoKeyboard973 = !current
    AppToast.show(this, "Soft Auto Keyboard973: ${if (!current) "ON" else "OFF"}")
}

// v973: Sort Auto Algorithm973
internal fun PlayerActivity.showV973SortAutoAlgorithm973Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v973sortAutoAlgorithm973).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm973",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v973sortAutoAlgorithm973 = value
        AppToast.show(this, "Sort Auto Algorithm973: $value")
    }
}

// v973: Source Auto Select973
internal fun PlayerActivity.showV973SourceAutoSelect973Toggle() {
    val current = BiliClient.prefs.v973sourceAutoSelect973
    BiliClient.prefs.v973sourceAutoSelect973 = !current
    AppToast.show(this, "Source Auto Select973: ${if (!current) "ON" else "OFF"}")
}

// v973: Space Auto Compact973
internal fun PlayerActivity.showV973SpaceAutoCompact973Toggle() {
    val current = BiliClient.prefs.v973spaceAutoCompact973
    BiliClient.prefs.v973spaceAutoCompact973 = !current
    AppToast.show(this, "Space Auto Compact973: ${if (!current) "ON" else "OFF"}")
}

// v973: Span Auto Column973
internal fun PlayerActivity.showV973SpanAutoColumn973Toggle() {
    val current = BiliClient.prefs.v973spanAutoColumn973
    BiliClient.prefs.v973spanAutoColumn973 = !current
    AppToast.show(this, "Span Auto Column973: ${if (!current) "ON" else "OFF"}")
}

// v973: Spawn Auto Worker973
internal fun PlayerActivity.showV973SpawnAutoWorker973Toggle() {
    val current = BiliClient.prefs.v973spawnAutoWorker973
    BiliClient.prefs.v973spawnAutoWorker973 = !current
    AppToast.show(this, "Spawn Auto Worker973: ${if (!current) "ON" else "OFF"}")
}

// v973: Speed Auto Adaptive973
internal fun PlayerActivity.showV973SpeedAutoAdaptive973Toggle() {
    val current = BiliClient.prefs.v973speedAutoAdaptive973
    BiliClient.prefs.v973speedAutoAdaptive973 = !current
    AppToast.show(this, "Speed Auto Adaptive973: ${if (!current) "ON" else "OFF"}")
}

// v973: Split Auto Pane973
internal fun PlayerActivity.showV973SplitAutoPane973Toggle() {
    val current = BiliClient.prefs.v973splitAutoPane973
    BiliClient.prefs.v973splitAutoPane973 = !current
    AppToast.show(this, "Split Auto Pane973: ${if (!current) "ON" else "OFF"}")
}

// v973: Spot Auto Light973
internal fun PlayerActivity.showV973SpotAutoLight973Toggle() {
    val current = BiliClient.prefs.v973spotAutoLight973
    BiliClient.prefs.v973spotAutoLight973 = !current
    AppToast.show(this, "Spot Auto Light973: ${if (!current) "ON" else "OFF"}")
}

// v973: Stack Auto Trace973
internal fun PlayerActivity.showV973StackAutoTrace973Toggle() {
    val current = BiliClient.prefs.v973stackAutoTrace973
    BiliClient.prefs.v973stackAutoTrace973 = !current
    AppToast.show(this, "Stack Auto Trace973: ${if (!current) "ON" else "OFF"}")
}

// v973: Stage Auto Progress973
internal fun PlayerActivity.showV973StageAutoProgress973Toggle() {
    val current = BiliClient.prefs.v973stageAutoProgress973
    BiliClient.prefs.v973stageAutoProgress973 = !current
    AppToast.show(this, "Stage Auto Progress973: ${if (!current) "ON" else "OFF"}")
}

// v973: Standard Auto Compliance973
internal fun PlayerActivity.showV973StandardAutoCompliance973Toggle() {
    val current = BiliClient.prefs.v973standardAutoCompliance973
    BiliClient.prefs.v973standardAutoCompliance973 = !current
    AppToast.show(this, "Standard Auto Compliance973: ${if (!current) "ON" else "OFF"}")
}

// v974: Smooth Auto Scroll974
internal fun PlayerActivity.showV974SmoothAutoScroll974Toggle() {
    val current = BiliClient.prefs.v974smoothAutoScroll974
    BiliClient.prefs.v974smoothAutoScroll974 = !current
    AppToast.show(this, "Smooth Auto Scroll974: ${if (!current) "ON" else "OFF"}")
}

// v974: Snap Auto Grid974
internal fun PlayerActivity.showV974SnapAutoGrid974Toggle() {
    val current = BiliClient.prefs.v974snapAutoGrid974
    BiliClient.prefs.v974snapAutoGrid974 = !current
    AppToast.show(this, "Snap Auto Grid974: ${if (!current) "ON" else "OFF"}")
}

// v974: Socket Auto KeepAlive974
internal fun PlayerActivity.showV974SocketAutoKeepAlive974Toggle() {
    val current = BiliClient.prefs.v974socketAutoKeepAlive974
    BiliClient.prefs.v974socketAutoKeepAlive974 = !current
    AppToast.show(this, "Socket Auto KeepAlive974: ${if (!current) "ON" else "OFF"}")
}

// v974: Soft Auto Keyboard974
internal fun PlayerActivity.showV974SoftAutoKeyboard974Toggle() {
    val current = BiliClient.prefs.v974softAutoKeyboard974
    BiliClient.prefs.v974softAutoKeyboard974 = !current
    AppToast.show(this, "Soft Auto Keyboard974: ${if (!current) "ON" else "OFF"}")
}

// v974: Sort Auto Algorithm974
internal fun PlayerActivity.showV974SortAutoAlgorithm974Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v974sortAutoAlgorithm974).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm974",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v974sortAutoAlgorithm974 = value
        AppToast.show(this, "Sort Auto Algorithm974: $value")
    }
}

// v974: Source Auto Select974
internal fun PlayerActivity.showV974SourceAutoSelect974Toggle() {
    val current = BiliClient.prefs.v974sourceAutoSelect974
    BiliClient.prefs.v974sourceAutoSelect974 = !current
    AppToast.show(this, "Source Auto Select974: ${if (!current) "ON" else "OFF"}")
}

// v974: Space Auto Compact974
internal fun PlayerActivity.showV974SpaceAutoCompact974Toggle() {
    val current = BiliClient.prefs.v974spaceAutoCompact974
    BiliClient.prefs.v974spaceAutoCompact974 = !current
    AppToast.show(this, "Space Auto Compact974: ${if (!current) "ON" else "OFF"}")
}

// v974: Span Auto Column974
internal fun PlayerActivity.showV974SpanAutoColumn974Toggle() {
    val current = BiliClient.prefs.v974spanAutoColumn974
    BiliClient.prefs.v974spanAutoColumn974 = !current
    AppToast.show(this, "Span Auto Column974: ${if (!current) "ON" else "OFF"}")
}

// v974: Spawn Auto Worker974
internal fun PlayerActivity.showV974SpawnAutoWorker974Toggle() {
    val current = BiliClient.prefs.v974spawnAutoWorker974
    BiliClient.prefs.v974spawnAutoWorker974 = !current
    AppToast.show(this, "Spawn Auto Worker974: ${if (!current) "ON" else "OFF"}")
}

// v974: Speed Auto Adaptive974
internal fun PlayerActivity.showV974SpeedAutoAdaptive974Toggle() {
    val current = BiliClient.prefs.v974speedAutoAdaptive974
    BiliClient.prefs.v974speedAutoAdaptive974 = !current
    AppToast.show(this, "Speed Auto Adaptive974: ${if (!current) "ON" else "OFF"}")
}

// v974: Split Auto Pane974
internal fun PlayerActivity.showV974SplitAutoPane974Toggle() {
    val current = BiliClient.prefs.v974splitAutoPane974
    BiliClient.prefs.v974splitAutoPane974 = !current
    AppToast.show(this, "Split Auto Pane974: ${if (!current) "ON" else "OFF"}")
}

// v974: Spot Auto Light974
internal fun PlayerActivity.showV974SpotAutoLight974Toggle() {
    val current = BiliClient.prefs.v974spotAutoLight974
    BiliClient.prefs.v974spotAutoLight974 = !current
    AppToast.show(this, "Spot Auto Light974: ${if (!current) "ON" else "OFF"}")
}

// v974: Stack Auto Trace974
internal fun PlayerActivity.showV974StackAutoTrace974Toggle() {
    val current = BiliClient.prefs.v974stackAutoTrace974
    BiliClient.prefs.v974stackAutoTrace974 = !current
    AppToast.show(this, "Stack Auto Trace974: ${if (!current) "ON" else "OFF"}")
}

// v974: Stage Auto Progress974
internal fun PlayerActivity.showV974StageAutoProgress974Toggle() {
    val current = BiliClient.prefs.v974stageAutoProgress974
    BiliClient.prefs.v974stageAutoProgress974 = !current
    AppToast.show(this, "Stage Auto Progress974: ${if (!current) "ON" else "OFF"}")
}

// v974: Standard Auto Compliance974
internal fun PlayerActivity.showV974StandardAutoCompliance974Toggle() {
    val current = BiliClient.prefs.v974standardAutoCompliance974
    BiliClient.prefs.v974standardAutoCompliance974 = !current
    AppToast.show(this, "Standard Auto Compliance974: ${if (!current) "ON" else "OFF"}")
}

// v975: Smooth Auto Scroll975
internal fun PlayerActivity.showV975SmoothAutoScroll975Toggle() {
    val current = BiliClient.prefs.v975smoothAutoScroll975
    BiliClient.prefs.v975smoothAutoScroll975 = !current
    AppToast.show(this, "Smooth Auto Scroll975: ${if (!current) "ON" else "OFF"}")
}

// v975: Snap Auto Grid975
internal fun PlayerActivity.showV975SnapAutoGrid975Toggle() {
    val current = BiliClient.prefs.v975snapAutoGrid975
    BiliClient.prefs.v975snapAutoGrid975 = !current
    AppToast.show(this, "Snap Auto Grid975: ${if (!current) "ON" else "OFF"}")
}

// v975: Socket Auto KeepAlive975
internal fun PlayerActivity.showV975SocketAutoKeepAlive975Toggle() {
    val current = BiliClient.prefs.v975socketAutoKeepAlive975
    BiliClient.prefs.v975socketAutoKeepAlive975 = !current
    AppToast.show(this, "Socket Auto KeepAlive975: ${if (!current) "ON" else "OFF"}")
}

// v975: Soft Auto Keyboard975
internal fun PlayerActivity.showV975SoftAutoKeyboard975Toggle() {
    val current = BiliClient.prefs.v975softAutoKeyboard975
    BiliClient.prefs.v975softAutoKeyboard975 = !current
    AppToast.show(this, "Soft Auto Keyboard975: ${if (!current) "ON" else "OFF"}")
}

// v975: Sort Auto Algorithm975
internal fun PlayerActivity.showV975SortAutoAlgorithm975Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v975sortAutoAlgorithm975).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm975",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v975sortAutoAlgorithm975 = value
        AppToast.show(this, "Sort Auto Algorithm975: $value")
    }
}

// v975: Source Auto Select975
internal fun PlayerActivity.showV975SourceAutoSelect975Toggle() {
    val current = BiliClient.prefs.v975sourceAutoSelect975
    BiliClient.prefs.v975sourceAutoSelect975 = !current
    AppToast.show(this, "Source Auto Select975: ${if (!current) "ON" else "OFF"}")
}

// v975: Space Auto Compact975
internal fun PlayerActivity.showV975SpaceAutoCompact975Toggle() {
    val current = BiliClient.prefs.v975spaceAutoCompact975
    BiliClient.prefs.v975spaceAutoCompact975 = !current
    AppToast.show(this, "Space Auto Compact975: ${if (!current) "ON" else "OFF"}")
}

// v975: Span Auto Column975
internal fun PlayerActivity.showV975SpanAutoColumn975Toggle() {
    val current = BiliClient.prefs.v975spanAutoColumn975
    BiliClient.prefs.v975spanAutoColumn975 = !current
    AppToast.show(this, "Span Auto Column975: ${if (!current) "ON" else "OFF"}")
}

// v975: Spawn Auto Worker975
internal fun PlayerActivity.showV975SpawnAutoWorker975Toggle() {
    val current = BiliClient.prefs.v975spawnAutoWorker975
    BiliClient.prefs.v975spawnAutoWorker975 = !current
    AppToast.show(this, "Spawn Auto Worker975: ${if (!current) "ON" else "OFF"}")
}

// v975: Speed Auto Adaptive975
internal fun PlayerActivity.showV975SpeedAutoAdaptive975Toggle() {
    val current = BiliClient.prefs.v975speedAutoAdaptive975
    BiliClient.prefs.v975speedAutoAdaptive975 = !current
    AppToast.show(this, "Speed Auto Adaptive975: ${if (!current) "ON" else "OFF"}")
}

// v975: Split Auto Pane975
internal fun PlayerActivity.showV975SplitAutoPane975Toggle() {
    val current = BiliClient.prefs.v975splitAutoPane975
    BiliClient.prefs.v975splitAutoPane975 = !current
    AppToast.show(this, "Split Auto Pane975: ${if (!current) "ON" else "OFF"}")
}

// v975: Spot Auto Light975
internal fun PlayerActivity.showV975SpotAutoLight975Toggle() {
    val current = BiliClient.prefs.v975spotAutoLight975
    BiliClient.prefs.v975spotAutoLight975 = !current
    AppToast.show(this, "Spot Auto Light975: ${if (!current) "ON" else "OFF"}")
}

// v975: Stack Auto Trace975
internal fun PlayerActivity.showV975StackAutoTrace975Toggle() {
    val current = BiliClient.prefs.v975stackAutoTrace975
    BiliClient.prefs.v975stackAutoTrace975 = !current
    AppToast.show(this, "Stack Auto Trace975: ${if (!current) "ON" else "OFF"}")
}

// v975: Stage Auto Progress975
internal fun PlayerActivity.showV975StageAutoProgress975Toggle() {
    val current = BiliClient.prefs.v975stageAutoProgress975
    BiliClient.prefs.v975stageAutoProgress975 = !current
    AppToast.show(this, "Stage Auto Progress975: ${if (!current) "ON" else "OFF"}")
}

// v975: Standard Auto Compliance975
internal fun PlayerActivity.showV975StandardAutoCompliance975Toggle() {
    val current = BiliClient.prefs.v975standardAutoCompliance975
    BiliClient.prefs.v975standardAutoCompliance975 = !current
    AppToast.show(this, "Standard Auto Compliance975: ${if (!current) "ON" else "OFF"}")
}

// v976: Smooth Auto Scroll976
internal fun PlayerActivity.showV976SmoothAutoScroll976Toggle() {
    val current = BiliClient.prefs.v976smoothAutoScroll976
    BiliClient.prefs.v976smoothAutoScroll976 = !current
    AppToast.show(this, "Smooth Auto Scroll976: ${if (!current) "ON" else "OFF"}")
}

// v976: Snap Auto Grid976
internal fun PlayerActivity.showV976SnapAutoGrid976Toggle() {
    val current = BiliClient.prefs.v976snapAutoGrid976
    BiliClient.prefs.v976snapAutoGrid976 = !current
    AppToast.show(this, "Snap Auto Grid976: ${if (!current) "ON" else "OFF"}")
}

// v976: Socket Auto KeepAlive976
internal fun PlayerActivity.showV976SocketAutoKeepAlive976Toggle() {
    val current = BiliClient.prefs.v976socketAutoKeepAlive976
    BiliClient.prefs.v976socketAutoKeepAlive976 = !current
    AppToast.show(this, "Socket Auto KeepAlive976: ${if (!current) "ON" else "OFF"}")
}

// v976: Soft Auto Keyboard976
internal fun PlayerActivity.showV976SoftAutoKeyboard976Toggle() {
    val current = BiliClient.prefs.v976softAutoKeyboard976
    BiliClient.prefs.v976softAutoKeyboard976 = !current
    AppToast.show(this, "Soft Auto Keyboard976: ${if (!current) "ON" else "OFF"}")
}

// v976: Sort Auto Algorithm976
internal fun PlayerActivity.showV976SortAutoAlgorithm976Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v976sortAutoAlgorithm976).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm976",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v976sortAutoAlgorithm976 = value
        AppToast.show(this, "Sort Auto Algorithm976: $value")
    }
}

// v976: Source Auto Select976
internal fun PlayerActivity.showV976SourceAutoSelect976Toggle() {
    val current = BiliClient.prefs.v976sourceAutoSelect976
    BiliClient.prefs.v976sourceAutoSelect976 = !current
    AppToast.show(this, "Source Auto Select976: ${if (!current) "ON" else "OFF"}")
}

// v976: Space Auto Compact976
internal fun PlayerActivity.showV976SpaceAutoCompact976Toggle() {
    val current = BiliClient.prefs.v976spaceAutoCompact976
    BiliClient.prefs.v976spaceAutoCompact976 = !current
    AppToast.show(this, "Space Auto Compact976: ${if (!current) "ON" else "OFF"}")
}

// v976: Span Auto Column976
internal fun PlayerActivity.showV976SpanAutoColumn976Toggle() {
    val current = BiliClient.prefs.v976spanAutoColumn976
    BiliClient.prefs.v976spanAutoColumn976 = !current
    AppToast.show(this, "Span Auto Column976: ${if (!current) "ON" else "OFF"}")
}

// v976: Spawn Auto Worker976
internal fun PlayerActivity.showV976SpawnAutoWorker976Toggle() {
    val current = BiliClient.prefs.v976spawnAutoWorker976
    BiliClient.prefs.v976spawnAutoWorker976 = !current
    AppToast.show(this, "Spawn Auto Worker976: ${if (!current) "ON" else "OFF"}")
}

// v976: Speed Auto Adaptive976
internal fun PlayerActivity.showV976SpeedAutoAdaptive976Toggle() {
    val current = BiliClient.prefs.v976speedAutoAdaptive976
    BiliClient.prefs.v976speedAutoAdaptive976 = !current
    AppToast.show(this, "Speed Auto Adaptive976: ${if (!current) "ON" else "OFF"}")
}

// v976: Split Auto Pane976
internal fun PlayerActivity.showV976SplitAutoPane976Toggle() {
    val current = BiliClient.prefs.v976splitAutoPane976
    BiliClient.prefs.v976splitAutoPane976 = !current
    AppToast.show(this, "Split Auto Pane976: ${if (!current) "ON" else "OFF"}")
}

// v976: Spot Auto Light976
internal fun PlayerActivity.showV976SpotAutoLight976Toggle() {
    val current = BiliClient.prefs.v976spotAutoLight976
    BiliClient.prefs.v976spotAutoLight976 = !current
    AppToast.show(this, "Spot Auto Light976: ${if (!current) "ON" else "OFF"}")
}

// v976: Stack Auto Trace976
internal fun PlayerActivity.showV976StackAutoTrace976Toggle() {
    val current = BiliClient.prefs.v976stackAutoTrace976
    BiliClient.prefs.v976stackAutoTrace976 = !current
    AppToast.show(this, "Stack Auto Trace976: ${if (!current) "ON" else "OFF"}")
}

// v976: Stage Auto Progress976
internal fun PlayerActivity.showV976StageAutoProgress976Toggle() {
    val current = BiliClient.prefs.v976stageAutoProgress976
    BiliClient.prefs.v976stageAutoProgress976 = !current
    AppToast.show(this, "Stage Auto Progress976: ${if (!current) "ON" else "OFF"}")
}

// v976: Standard Auto Compliance976
internal fun PlayerActivity.showV976StandardAutoCompliance976Toggle() {
    val current = BiliClient.prefs.v976standardAutoCompliance976
    BiliClient.prefs.v976standardAutoCompliance976 = !current
    AppToast.show(this, "Standard Auto Compliance976: ${if (!current) "ON" else "OFF"}")
}

// v977: Smooth Auto Scroll977
internal fun PlayerActivity.showV977SmoothAutoScroll977Toggle() {
    val current = BiliClient.prefs.v977smoothAutoScroll977
    BiliClient.prefs.v977smoothAutoScroll977 = !current
    AppToast.show(this, "Smooth Auto Scroll977: ${if (!current) "ON" else "OFF"}")
}

// v977: Snap Auto Grid977
internal fun PlayerActivity.showV977SnapAutoGrid977Toggle() {
    val current = BiliClient.prefs.v977snapAutoGrid977
    BiliClient.prefs.v977snapAutoGrid977 = !current
    AppToast.show(this, "Snap Auto Grid977: ${if (!current) "ON" else "OFF"}")
}

// v977: Socket Auto KeepAlive977
internal fun PlayerActivity.showV977SocketAutoKeepAlive977Toggle() {
    val current = BiliClient.prefs.v977socketAutoKeepAlive977
    BiliClient.prefs.v977socketAutoKeepAlive977 = !current
    AppToast.show(this, "Socket Auto KeepAlive977: ${if (!current) "ON" else "OFF"}")
}

// v977: Soft Auto Keyboard977
internal fun PlayerActivity.showV977SoftAutoKeyboard977Toggle() {
    val current = BiliClient.prefs.v977softAutoKeyboard977
    BiliClient.prefs.v977softAutoKeyboard977 = !current
    AppToast.show(this, "Soft Auto Keyboard977: ${if (!current) "ON" else "OFF"}")
}

// v977: Sort Auto Algorithm977
internal fun PlayerActivity.showV977SortAutoAlgorithm977Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v977sortAutoAlgorithm977).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm977",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v977sortAutoAlgorithm977 = value
        AppToast.show(this, "Sort Auto Algorithm977: $value")
    }
}

// v977: Source Auto Select977
internal fun PlayerActivity.showV977SourceAutoSelect977Toggle() {
    val current = BiliClient.prefs.v977sourceAutoSelect977
    BiliClient.prefs.v977sourceAutoSelect977 = !current
    AppToast.show(this, "Source Auto Select977: ${if (!current) "ON" else "OFF"}")
}

// v977: Space Auto Compact977
internal fun PlayerActivity.showV977SpaceAutoCompact977Toggle() {
    val current = BiliClient.prefs.v977spaceAutoCompact977
    BiliClient.prefs.v977spaceAutoCompact977 = !current
    AppToast.show(this, "Space Auto Compact977: ${if (!current) "ON" else "OFF"}")
}

// v977: Span Auto Column977
internal fun PlayerActivity.showV977SpanAutoColumn977Toggle() {
    val current = BiliClient.prefs.v977spanAutoColumn977
    BiliClient.prefs.v977spanAutoColumn977 = !current
    AppToast.show(this, "Span Auto Column977: ${if (!current) "ON" else "OFF"}")
}

// v977: Spawn Auto Worker977
internal fun PlayerActivity.showV977SpawnAutoWorker977Toggle() {
    val current = BiliClient.prefs.v977spawnAutoWorker977
    BiliClient.prefs.v977spawnAutoWorker977 = !current
    AppToast.show(this, "Spawn Auto Worker977: ${if (!current) "ON" else "OFF"}")
}

// v977: Speed Auto Adaptive977
internal fun PlayerActivity.showV977SpeedAutoAdaptive977Toggle() {
    val current = BiliClient.prefs.v977speedAutoAdaptive977
    BiliClient.prefs.v977speedAutoAdaptive977 = !current
    AppToast.show(this, "Speed Auto Adaptive977: ${if (!current) "ON" else "OFF"}")
}

// v977: Split Auto Pane977
internal fun PlayerActivity.showV977SplitAutoPane977Toggle() {
    val current = BiliClient.prefs.v977splitAutoPane977
    BiliClient.prefs.v977splitAutoPane977 = !current
    AppToast.show(this, "Split Auto Pane977: ${if (!current) "ON" else "OFF"}")
}

// v977: Spot Auto Light977
internal fun PlayerActivity.showV977SpotAutoLight977Toggle() {
    val current = BiliClient.prefs.v977spotAutoLight977
    BiliClient.prefs.v977spotAutoLight977 = !current
    AppToast.show(this, "Spot Auto Light977: ${if (!current) "ON" else "OFF"}")
}

// v977: Stack Auto Trace977
internal fun PlayerActivity.showV977StackAutoTrace977Toggle() {
    val current = BiliClient.prefs.v977stackAutoTrace977
    BiliClient.prefs.v977stackAutoTrace977 = !current
    AppToast.show(this, "Stack Auto Trace977: ${if (!current) "ON" else "OFF"}")
}

// v977: Stage Auto Progress977
internal fun PlayerActivity.showV977StageAutoProgress977Toggle() {
    val current = BiliClient.prefs.v977stageAutoProgress977
    BiliClient.prefs.v977stageAutoProgress977 = !current
    AppToast.show(this, "Stage Auto Progress977: ${if (!current) "ON" else "OFF"}")
}

// v977: Standard Auto Compliance977
internal fun PlayerActivity.showV977StandardAutoCompliance977Toggle() {
    val current = BiliClient.prefs.v977standardAutoCompliance977
    BiliClient.prefs.v977standardAutoCompliance977 = !current
    AppToast.show(this, "Standard Auto Compliance977: ${if (!current) "ON" else "OFF"}")
}

// v978: Smooth Auto Scroll978
internal fun PlayerActivity.showV978SmoothAutoScroll978Toggle() {
    val current = BiliClient.prefs.v978smoothAutoScroll978
    BiliClient.prefs.v978smoothAutoScroll978 = !current
    AppToast.show(this, "Smooth Auto Scroll978: ${if (!current) "ON" else "OFF"}")
}

// v978: Snap Auto Grid978
internal fun PlayerActivity.showV978SnapAutoGrid978Toggle() {
    val current = BiliClient.prefs.v978snapAutoGrid978
    BiliClient.prefs.v978snapAutoGrid978 = !current
    AppToast.show(this, "Snap Auto Grid978: ${if (!current) "ON" else "OFF"}")
}

// v978: Socket Auto KeepAlive978
internal fun PlayerActivity.showV978SocketAutoKeepAlive978Toggle() {
    val current = BiliClient.prefs.v978socketAutoKeepAlive978
    BiliClient.prefs.v978socketAutoKeepAlive978 = !current
    AppToast.show(this, "Socket Auto KeepAlive978: ${if (!current) "ON" else "OFF"}")
}

// v978: Soft Auto Keyboard978
internal fun PlayerActivity.showV978SoftAutoKeyboard978Toggle() {
    val current = BiliClient.prefs.v978softAutoKeyboard978
    BiliClient.prefs.v978softAutoKeyboard978 = !current
    AppToast.show(this, "Soft Auto Keyboard978: ${if (!current) "ON" else "OFF"}")
}

// v978: Sort Auto Algorithm978
internal fun PlayerActivity.showV978SortAutoAlgorithm978Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v978sortAutoAlgorithm978).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm978",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v978sortAutoAlgorithm978 = value
        AppToast.show(this, "Sort Auto Algorithm978: $value")
    }
}

// v978: Source Auto Select978
internal fun PlayerActivity.showV978SourceAutoSelect978Toggle() {
    val current = BiliClient.prefs.v978sourceAutoSelect978
    BiliClient.prefs.v978sourceAutoSelect978 = !current
    AppToast.show(this, "Source Auto Select978: ${if (!current) "ON" else "OFF"}")
}

// v978: Space Auto Compact978
internal fun PlayerActivity.showV978SpaceAutoCompact978Toggle() {
    val current = BiliClient.prefs.v978spaceAutoCompact978
    BiliClient.prefs.v978spaceAutoCompact978 = !current
    AppToast.show(this, "Space Auto Compact978: ${if (!current) "ON" else "OFF"}")
}

// v978: Span Auto Column978
internal fun PlayerActivity.showV978SpanAutoColumn978Toggle() {
    val current = BiliClient.prefs.v978spanAutoColumn978
    BiliClient.prefs.v978spanAutoColumn978 = !current
    AppToast.show(this, "Span Auto Column978: ${if (!current) "ON" else "OFF"}")
}

// v978: Spawn Auto Worker978
internal fun PlayerActivity.showV978SpawnAutoWorker978Toggle() {
    val current = BiliClient.prefs.v978spawnAutoWorker978
    BiliClient.prefs.v978spawnAutoWorker978 = !current
    AppToast.show(this, "Spawn Auto Worker978: ${if (!current) "ON" else "OFF"}")
}

// v978: Speed Auto Adaptive978
internal fun PlayerActivity.showV978SpeedAutoAdaptive978Toggle() {
    val current = BiliClient.prefs.v978speedAutoAdaptive978
    BiliClient.prefs.v978speedAutoAdaptive978 = !current
    AppToast.show(this, "Speed Auto Adaptive978: ${if (!current) "ON" else "OFF"}")
}

// v978: Split Auto Pane978
internal fun PlayerActivity.showV978SplitAutoPane978Toggle() {
    val current = BiliClient.prefs.v978splitAutoPane978
    BiliClient.prefs.v978splitAutoPane978 = !current
    AppToast.show(this, "Split Auto Pane978: ${if (!current) "ON" else "OFF"}")
}

// v978: Spot Auto Light978
internal fun PlayerActivity.showV978SpotAutoLight978Toggle() {
    val current = BiliClient.prefs.v978spotAutoLight978
    BiliClient.prefs.v978spotAutoLight978 = !current
    AppToast.show(this, "Spot Auto Light978: ${if (!current) "ON" else "OFF"}")
}

// v978: Stack Auto Trace978
internal fun PlayerActivity.showV978StackAutoTrace978Toggle() {
    val current = BiliClient.prefs.v978stackAutoTrace978
    BiliClient.prefs.v978stackAutoTrace978 = !current
    AppToast.show(this, "Stack Auto Trace978: ${if (!current) "ON" else "OFF"}")
}

// v978: Stage Auto Progress978
internal fun PlayerActivity.showV978StageAutoProgress978Toggle() {
    val current = BiliClient.prefs.v978stageAutoProgress978
    BiliClient.prefs.v978stageAutoProgress978 = !current
    AppToast.show(this, "Stage Auto Progress978: ${if (!current) "ON" else "OFF"}")
}

// v978: Standard Auto Compliance978
internal fun PlayerActivity.showV978StandardAutoCompliance978Toggle() {
    val current = BiliClient.prefs.v978standardAutoCompliance978
    BiliClient.prefs.v978standardAutoCompliance978 = !current
    AppToast.show(this, "Standard Auto Compliance978: ${if (!current) "ON" else "OFF"}")
}

// v979: Smooth Auto Scroll979
internal fun PlayerActivity.showV979SmoothAutoScroll979Toggle() {
    val current = BiliClient.prefs.v979smoothAutoScroll979
    BiliClient.prefs.v979smoothAutoScroll979 = !current
    AppToast.show(this, "Smooth Auto Scroll979: ${if (!current) "ON" else "OFF"}")
}

// v979: Snap Auto Grid979
internal fun PlayerActivity.showV979SnapAutoGrid979Toggle() {
    val current = BiliClient.prefs.v979snapAutoGrid979
    BiliClient.prefs.v979snapAutoGrid979 = !current
    AppToast.show(this, "Snap Auto Grid979: ${if (!current) "ON" else "OFF"}")
}

// v979: Socket Auto KeepAlive979
internal fun PlayerActivity.showV979SocketAutoKeepAlive979Toggle() {
    val current = BiliClient.prefs.v979socketAutoKeepAlive979
    BiliClient.prefs.v979socketAutoKeepAlive979 = !current
    AppToast.show(this, "Socket Auto KeepAlive979: ${if (!current) "ON" else "OFF"}")
}

// v979: Soft Auto Keyboard979
internal fun PlayerActivity.showV979SoftAutoKeyboard979Toggle() {
    val current = BiliClient.prefs.v979softAutoKeyboard979
    BiliClient.prefs.v979softAutoKeyboard979 = !current
    AppToast.show(this, "Soft Auto Keyboard979: ${if (!current) "ON" else "OFF"}")
}

// v979: Sort Auto Algorithm979
internal fun PlayerActivity.showV979SortAutoAlgorithm979Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v979sortAutoAlgorithm979).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm979",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v979sortAutoAlgorithm979 = value
        AppToast.show(this, "Sort Auto Algorithm979: $value")
    }
}

// v979: Source Auto Select979
internal fun PlayerActivity.showV979SourceAutoSelect979Toggle() {
    val current = BiliClient.prefs.v979sourceAutoSelect979
    BiliClient.prefs.v979sourceAutoSelect979 = !current
    AppToast.show(this, "Source Auto Select979: ${if (!current) "ON" else "OFF"}")
}

// v979: Space Auto Compact979
internal fun PlayerActivity.showV979SpaceAutoCompact979Toggle() {
    val current = BiliClient.prefs.v979spaceAutoCompact979
    BiliClient.prefs.v979spaceAutoCompact979 = !current
    AppToast.show(this, "Space Auto Compact979: ${if (!current) "ON" else "OFF"}")
}

// v979: Span Auto Column979
internal fun PlayerActivity.showV979SpanAutoColumn979Toggle() {
    val current = BiliClient.prefs.v979spanAutoColumn979
    BiliClient.prefs.v979spanAutoColumn979 = !current
    AppToast.show(this, "Span Auto Column979: ${if (!current) "ON" else "OFF"}")
}

// v979: Spawn Auto Worker979
internal fun PlayerActivity.showV979SpawnAutoWorker979Toggle() {
    val current = BiliClient.prefs.v979spawnAutoWorker979
    BiliClient.prefs.v979spawnAutoWorker979 = !current
    AppToast.show(this, "Spawn Auto Worker979: ${if (!current) "ON" else "OFF"}")
}

// v979: Speed Auto Adaptive979
internal fun PlayerActivity.showV979SpeedAutoAdaptive979Toggle() {
    val current = BiliClient.prefs.v979speedAutoAdaptive979
    BiliClient.prefs.v979speedAutoAdaptive979 = !current
    AppToast.show(this, "Speed Auto Adaptive979: ${if (!current) "ON" else "OFF"}")
}

// v979: Split Auto Pane979
internal fun PlayerActivity.showV979SplitAutoPane979Toggle() {
    val current = BiliClient.prefs.v979splitAutoPane979
    BiliClient.prefs.v979splitAutoPane979 = !current
    AppToast.show(this, "Split Auto Pane979: ${if (!current) "ON" else "OFF"}")
}

// v979: Spot Auto Light979
internal fun PlayerActivity.showV979SpotAutoLight979Toggle() {
    val current = BiliClient.prefs.v979spotAutoLight979
    BiliClient.prefs.v979spotAutoLight979 = !current
    AppToast.show(this, "Spot Auto Light979: ${if (!current) "ON" else "OFF"}")
}

// v979: Stack Auto Trace979
internal fun PlayerActivity.showV979StackAutoTrace979Toggle() {
    val current = BiliClient.prefs.v979stackAutoTrace979
    BiliClient.prefs.v979stackAutoTrace979 = !current
    AppToast.show(this, "Stack Auto Trace979: ${if (!current) "ON" else "OFF"}")
}

// v979: Stage Auto Progress979
internal fun PlayerActivity.showV979StageAutoProgress979Toggle() {
    val current = BiliClient.prefs.v979stageAutoProgress979
    BiliClient.prefs.v979stageAutoProgress979 = !current
    AppToast.show(this, "Stage Auto Progress979: ${if (!current) "ON" else "OFF"}")
}

// v979: Standard Auto Compliance979
internal fun PlayerActivity.showV979StandardAutoCompliance979Toggle() {
    val current = BiliClient.prefs.v979standardAutoCompliance979
    BiliClient.prefs.v979standardAutoCompliance979 = !current
    AppToast.show(this, "Standard Auto Compliance979: ${if (!current) "ON" else "OFF"}")
}

// v980: Smooth Auto Scroll980
internal fun PlayerActivity.showV980SmoothAutoScroll980Toggle() {
    val current = BiliClient.prefs.v980smoothAutoScroll980
    BiliClient.prefs.v980smoothAutoScroll980 = !current
    AppToast.show(this, "Smooth Auto Scroll980: ${if (!current) "ON" else "OFF"}")
}

// v980: Snap Auto Grid980
internal fun PlayerActivity.showV980SnapAutoGrid980Toggle() {
    val current = BiliClient.prefs.v980snapAutoGrid980
    BiliClient.prefs.v980snapAutoGrid980 = !current
    AppToast.show(this, "Snap Auto Grid980: ${if (!current) "ON" else "OFF"}")
}

// v980: Socket Auto KeepAlive980
internal fun PlayerActivity.showV980SocketAutoKeepAlive980Toggle() {
    val current = BiliClient.prefs.v980socketAutoKeepAlive980
    BiliClient.prefs.v980socketAutoKeepAlive980 = !current
    AppToast.show(this, "Socket Auto KeepAlive980: ${if (!current) "ON" else "OFF"}")
}

// v980: Soft Auto Keyboard980
internal fun PlayerActivity.showV980SoftAutoKeyboard980Toggle() {
    val current = BiliClient.prefs.v980softAutoKeyboard980
    BiliClient.prefs.v980softAutoKeyboard980 = !current
    AppToast.show(this, "Soft Auto Keyboard980: ${if (!current) "ON" else "OFF"}")
}

// v980: Sort Auto Algorithm980
internal fun PlayerActivity.showV980SortAutoAlgorithm980Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v980sortAutoAlgorithm980).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm980",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v980sortAutoAlgorithm980 = value
        AppToast.show(this, "Sort Auto Algorithm980: $value")
    }
}

// v980: Source Auto Select980
internal fun PlayerActivity.showV980SourceAutoSelect980Toggle() {
    val current = BiliClient.prefs.v980sourceAutoSelect980
    BiliClient.prefs.v980sourceAutoSelect980 = !current
    AppToast.show(this, "Source Auto Select980: ${if (!current) "ON" else "OFF"}")
}

// v980: Space Auto Compact980
internal fun PlayerActivity.showV980SpaceAutoCompact980Toggle() {
    val current = BiliClient.prefs.v980spaceAutoCompact980
    BiliClient.prefs.v980spaceAutoCompact980 = !current
    AppToast.show(this, "Space Auto Compact980: ${if (!current) "ON" else "OFF"}")
}

// v980: Span Auto Column980
internal fun PlayerActivity.showV980SpanAutoColumn980Toggle() {
    val current = BiliClient.prefs.v980spanAutoColumn980
    BiliClient.prefs.v980spanAutoColumn980 = !current
    AppToast.show(this, "Span Auto Column980: ${if (!current) "ON" else "OFF"}")
}

// v980: Spawn Auto Worker980
internal fun PlayerActivity.showV980SpawnAutoWorker980Toggle() {
    val current = BiliClient.prefs.v980spawnAutoWorker980
    BiliClient.prefs.v980spawnAutoWorker980 = !current
    AppToast.show(this, "Spawn Auto Worker980: ${if (!current) "ON" else "OFF"}")
}

// v980: Speed Auto Adaptive980
internal fun PlayerActivity.showV980SpeedAutoAdaptive980Toggle() {
    val current = BiliClient.prefs.v980speedAutoAdaptive980
    BiliClient.prefs.v980speedAutoAdaptive980 = !current
    AppToast.show(this, "Speed Auto Adaptive980: ${if (!current) "ON" else "OFF"}")
}

// v980: Split Auto Pane980
internal fun PlayerActivity.showV980SplitAutoPane980Toggle() {
    val current = BiliClient.prefs.v980splitAutoPane980
    BiliClient.prefs.v980splitAutoPane980 = !current
    AppToast.show(this, "Split Auto Pane980: ${if (!current) "ON" else "OFF"}")
}

// v980: Spot Auto Light980
internal fun PlayerActivity.showV980SpotAutoLight980Toggle() {
    val current = BiliClient.prefs.v980spotAutoLight980
    BiliClient.prefs.v980spotAutoLight980 = !current
    AppToast.show(this, "Spot Auto Light980: ${if (!current) "ON" else "OFF"}")
}

// v980: Stack Auto Trace980
internal fun PlayerActivity.showV980StackAutoTrace980Toggle() {
    val current = BiliClient.prefs.v980stackAutoTrace980
    BiliClient.prefs.v980stackAutoTrace980 = !current
    AppToast.show(this, "Stack Auto Trace980: ${if (!current) "ON" else "OFF"}")
}

// v980: Stage Auto Progress980
internal fun PlayerActivity.showV980StageAutoProgress980Toggle() {
    val current = BiliClient.prefs.v980stageAutoProgress980
    BiliClient.prefs.v980stageAutoProgress980 = !current
    AppToast.show(this, "Stage Auto Progress980: ${if (!current) "ON" else "OFF"}")
}

// v980: Standard Auto Compliance980
internal fun PlayerActivity.showV980StandardAutoCompliance980Toggle() {
    val current = BiliClient.prefs.v980standardAutoCompliance980
    BiliClient.prefs.v980standardAutoCompliance980 = !current
    AppToast.show(this, "Standard Auto Compliance980: ${if (!current) "ON" else "OFF"}")
}

