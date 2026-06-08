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

internal fun PlayerActivity.showV615AssetAutoLoad615Toggle() {
    val current = BiliClient.prefs.v615assetAutoLoad615
    BiliClient.prefs.v615assetAutoLoad615 = !current
    AppToast.show(this, "Asset Auto Load615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615AssignAutoTask615Toggle() {
    val current = BiliClient.prefs.v615assignAutoTask615
    BiliClient.prefs.v615assignAutoTask615 = !current
    AppToast.show(this, "Assign Auto Task615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615AsyncAutoExecute615Toggle() {
    val current = BiliClient.prefs.v615asyncAutoExecute615
    BiliClient.prefs.v615asyncAutoExecute615 = !current
    AppToast.show(this, "Async Auto Execute615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615AttackAutoBlock615Toggle() {
    val current = BiliClient.prefs.v615attackAutoBlock615
    BiliClient.prefs.v615attackAutoBlock615 = !current
    AppToast.show(this, "Attack Auto Block615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615AvatarAutoUpdate615Toggle() {
    val current = BiliClient.prefs.v615avatarAutoUpdate615
    BiliClient.prefs.v615avatarAutoUpdate615 = !current
    AppToast.show(this, "Avatar Auto Update615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BackAutoSave615Toggle() {
    val current = BiliClient.prefs.v615backAutoSave615
    BiliClient.prefs.v615backAutoSave615 = !current
    AppToast.show(this, "Back Auto Save615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BalanceAutoLoad615Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v615balanceAutoLoad615).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load615",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v615balanceAutoLoad615 = value
        AppToast.show(this, "Balance Auto Load615: $value")
    }
}

internal fun PlayerActivity.showV615BandAutoWidth615Toggle() {
    val current = BiliClient.prefs.v615bandAutoWidth615
    BiliClient.prefs.v615bandAutoWidth615 = !current
    AppToast.show(this, "Band Auto Width615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BarAutoScroll615Toggle() {
    val current = BiliClient.prefs.v615barAutoScroll615
    BiliClient.prefs.v615barAutoScroll615 = !current
    AppToast.show(this, "Bar Auto Scroll615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BeaconAutoPing615Toggle() {
    val current = BiliClient.prefs.v615beaconAutoPing615
    BiliClient.prefs.v615beaconAutoPing615 = !current
    AppToast.show(this, "Beacon Auto Ping615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BeamAutoForm615Toggle() {
    val current = BiliClient.prefs.v615beamAutoForm615
    BiliClient.prefs.v615beamAutoForm615 = !current
    AppToast.show(this, "Beam Auto Form615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BeforeAutoHook615Toggle() {
    val current = BiliClient.prefs.v615beforeAutoHook615
    BiliClient.prefs.v615beforeAutoHook615 = !current
    AppToast.show(this, "Before Auto Hook615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BeginAutoInit615Toggle() {
    val current = BiliClient.prefs.v615beginAutoInit615
    BiliClient.prefs.v615beginAutoInit615 = !current
    AppToast.show(this, "Begin Auto Init615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615BehaviorAutoTrack615Toggle() {
    val current = BiliClient.prefs.v615behaviorAutoTrack615
    BiliClient.prefs.v615behaviorAutoTrack615 = !current
    AppToast.show(this, "Behavior Auto Track615: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616ArrowAutoNavigate616Toggle() {
    val current = BiliClient.prefs.v616arrowAutoNavigate616
    BiliClient.prefs.v616arrowAutoNavigate616 = !current
    AppToast.show(this, "Arrow Auto Navigate616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616AssetAutoLoad616Toggle() {
    val current = BiliClient.prefs.v616assetAutoLoad616
    BiliClient.prefs.v616assetAutoLoad616 = !current
    AppToast.show(this, "Asset Auto Load616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616AssignAutoTask616Toggle() {
    val current = BiliClient.prefs.v616assignAutoTask616
    BiliClient.prefs.v616assignAutoTask616 = !current
    AppToast.show(this, "Assign Auto Task616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616AsyncAutoExecute616Toggle() {
    val current = BiliClient.prefs.v616asyncAutoExecute616
    BiliClient.prefs.v616asyncAutoExecute616 = !current
    AppToast.show(this, "Async Auto Execute616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616AttackAutoBlock616Toggle() {
    val current = BiliClient.prefs.v616attackAutoBlock616
    BiliClient.prefs.v616attackAutoBlock616 = !current
    AppToast.show(this, "Attack Auto Block616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616AvatarAutoUpdate616Toggle() {
    val current = BiliClient.prefs.v616avatarAutoUpdate616
    BiliClient.prefs.v616avatarAutoUpdate616 = !current
    AppToast.show(this, "Avatar Auto Update616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BackAutoSave616Toggle() {
    val current = BiliClient.prefs.v616backAutoSave616
    BiliClient.prefs.v616backAutoSave616 = !current
    AppToast.show(this, "Back Auto Save616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BalanceAutoLoad616Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v616balanceAutoLoad616).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load616",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v616balanceAutoLoad616 = value
        AppToast.show(this, "Balance Auto Load616: $value")
    }
}

internal fun PlayerActivity.showV616BandAutoWidth616Toggle() {
    val current = BiliClient.prefs.v616bandAutoWidth616
    BiliClient.prefs.v616bandAutoWidth616 = !current
    AppToast.show(this, "Band Auto Width616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BarAutoScroll616Toggle() {
    val current = BiliClient.prefs.v616barAutoScroll616
    BiliClient.prefs.v616barAutoScroll616 = !current
    AppToast.show(this, "Bar Auto Scroll616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BeaconAutoPing616Toggle() {
    val current = BiliClient.prefs.v616beaconAutoPing616
    BiliClient.prefs.v616beaconAutoPing616 = !current
    AppToast.show(this, "Beacon Auto Ping616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BeamAutoForm616Toggle() {
    val current = BiliClient.prefs.v616beamAutoForm616
    BiliClient.prefs.v616beamAutoForm616 = !current
    AppToast.show(this, "Beam Auto Form616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BeforeAutoHook616Toggle() {
    val current = BiliClient.prefs.v616beforeAutoHook616
    BiliClient.prefs.v616beforeAutoHook616 = !current
    AppToast.show(this, "Before Auto Hook616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BeginAutoInit616Toggle() {
    val current = BiliClient.prefs.v616beginAutoInit616
    BiliClient.prefs.v616beginAutoInit616 = !current
    AppToast.show(this, "Begin Auto Init616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV616BehaviorAutoTrack616Toggle() {
    val current = BiliClient.prefs.v616behaviorAutoTrack616
    BiliClient.prefs.v616behaviorAutoTrack616 = !current
    AppToast.show(this, "Behavior Auto Track616: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617ArrowAutoNavigate617Toggle() {
    val current = BiliClient.prefs.v617arrowAutoNavigate617
    BiliClient.prefs.v617arrowAutoNavigate617 = !current
    AppToast.show(this, "Arrow Auto Navigate617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617AssetAutoLoad617Toggle() {
    val current = BiliClient.prefs.v617assetAutoLoad617
    BiliClient.prefs.v617assetAutoLoad617 = !current
    AppToast.show(this, "Asset Auto Load617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617AssignAutoTask617Toggle() {
    val current = BiliClient.prefs.v617assignAutoTask617
    BiliClient.prefs.v617assignAutoTask617 = !current
    AppToast.show(this, "Assign Auto Task617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617AsyncAutoExecute617Toggle() {
    val current = BiliClient.prefs.v617asyncAutoExecute617
    BiliClient.prefs.v617asyncAutoExecute617 = !current
    AppToast.show(this, "Async Auto Execute617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617AttackAutoBlock617Toggle() {
    val current = BiliClient.prefs.v617attackAutoBlock617
    BiliClient.prefs.v617attackAutoBlock617 = !current
    AppToast.show(this, "Attack Auto Block617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617AvatarAutoUpdate617Toggle() {
    val current = BiliClient.prefs.v617avatarAutoUpdate617
    BiliClient.prefs.v617avatarAutoUpdate617 = !current
    AppToast.show(this, "Avatar Auto Update617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BackAutoSave617Toggle() {
    val current = BiliClient.prefs.v617backAutoSave617
    BiliClient.prefs.v617backAutoSave617 = !current
    AppToast.show(this, "Back Auto Save617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BalanceAutoLoad617Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v617balanceAutoLoad617).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load617",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v617balanceAutoLoad617 = value
        AppToast.show(this, "Balance Auto Load617: $value")
    }
}

internal fun PlayerActivity.showV617BandAutoWidth617Toggle() {
    val current = BiliClient.prefs.v617bandAutoWidth617
    BiliClient.prefs.v617bandAutoWidth617 = !current
    AppToast.show(this, "Band Auto Width617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BarAutoScroll617Toggle() {
    val current = BiliClient.prefs.v617barAutoScroll617
    BiliClient.prefs.v617barAutoScroll617 = !current
    AppToast.show(this, "Bar Auto Scroll617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BeaconAutoPing617Toggle() {
    val current = BiliClient.prefs.v617beaconAutoPing617
    BiliClient.prefs.v617beaconAutoPing617 = !current
    AppToast.show(this, "Beacon Auto Ping617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BeamAutoForm617Toggle() {
    val current = BiliClient.prefs.v617beamAutoForm617
    BiliClient.prefs.v617beamAutoForm617 = !current
    AppToast.show(this, "Beam Auto Form617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BeforeAutoHook617Toggle() {
    val current = BiliClient.prefs.v617beforeAutoHook617
    BiliClient.prefs.v617beforeAutoHook617 = !current
    AppToast.show(this, "Before Auto Hook617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BeginAutoInit617Toggle() {
    val current = BiliClient.prefs.v617beginAutoInit617
    BiliClient.prefs.v617beginAutoInit617 = !current
    AppToast.show(this, "Begin Auto Init617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV617BehaviorAutoTrack617Toggle() {
    val current = BiliClient.prefs.v617behaviorAutoTrack617
    BiliClient.prefs.v617behaviorAutoTrack617 = !current
    AppToast.show(this, "Behavior Auto Track617: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618ArrowAutoNavigate618Toggle() {
    val current = BiliClient.prefs.v618arrowAutoNavigate618
    BiliClient.prefs.v618arrowAutoNavigate618 = !current
    AppToast.show(this, "Arrow Auto Navigate618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618AssetAutoLoad618Toggle() {
    val current = BiliClient.prefs.v618assetAutoLoad618
    BiliClient.prefs.v618assetAutoLoad618 = !current
    AppToast.show(this, "Asset Auto Load618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618AssignAutoTask618Toggle() {
    val current = BiliClient.prefs.v618assignAutoTask618
    BiliClient.prefs.v618assignAutoTask618 = !current
    AppToast.show(this, "Assign Auto Task618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618AsyncAutoExecute618Toggle() {
    val current = BiliClient.prefs.v618asyncAutoExecute618
    BiliClient.prefs.v618asyncAutoExecute618 = !current
    AppToast.show(this, "Async Auto Execute618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618AttackAutoBlock618Toggle() {
    val current = BiliClient.prefs.v618attackAutoBlock618
    BiliClient.prefs.v618attackAutoBlock618 = !current
    AppToast.show(this, "Attack Auto Block618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618AvatarAutoUpdate618Toggle() {
    val current = BiliClient.prefs.v618avatarAutoUpdate618
    BiliClient.prefs.v618avatarAutoUpdate618 = !current
    AppToast.show(this, "Avatar Auto Update618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BackAutoSave618Toggle() {
    val current = BiliClient.prefs.v618backAutoSave618
    BiliClient.prefs.v618backAutoSave618 = !current
    AppToast.show(this, "Back Auto Save618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BalanceAutoLoad618Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v618balanceAutoLoad618).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load618",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v618balanceAutoLoad618 = value
        AppToast.show(this, "Balance Auto Load618: $value")
    }
}

internal fun PlayerActivity.showV618BandAutoWidth618Toggle() {
    val current = BiliClient.prefs.v618bandAutoWidth618
    BiliClient.prefs.v618bandAutoWidth618 = !current
    AppToast.show(this, "Band Auto Width618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BarAutoScroll618Toggle() {
    val current = BiliClient.prefs.v618barAutoScroll618
    BiliClient.prefs.v618barAutoScroll618 = !current
    AppToast.show(this, "Bar Auto Scroll618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BeaconAutoPing618Toggle() {
    val current = BiliClient.prefs.v618beaconAutoPing618
    BiliClient.prefs.v618beaconAutoPing618 = !current
    AppToast.show(this, "Beacon Auto Ping618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BeamAutoForm618Toggle() {
    val current = BiliClient.prefs.v618beamAutoForm618
    BiliClient.prefs.v618beamAutoForm618 = !current
    AppToast.show(this, "Beam Auto Form618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BeforeAutoHook618Toggle() {
    val current = BiliClient.prefs.v618beforeAutoHook618
    BiliClient.prefs.v618beforeAutoHook618 = !current
    AppToast.show(this, "Before Auto Hook618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BeginAutoInit618Toggle() {
    val current = BiliClient.prefs.v618beginAutoInit618
    BiliClient.prefs.v618beginAutoInit618 = !current
    AppToast.show(this, "Begin Auto Init618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV618BehaviorAutoTrack618Toggle() {
    val current = BiliClient.prefs.v618behaviorAutoTrack618
    BiliClient.prefs.v618behaviorAutoTrack618 = !current
    AppToast.show(this, "Behavior Auto Track618: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619ArrowAutoNavigate619Toggle() {
    val current = BiliClient.prefs.v619arrowAutoNavigate619
    BiliClient.prefs.v619arrowAutoNavigate619 = !current
    AppToast.show(this, "Arrow Auto Navigate619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619AssetAutoLoad619Toggle() {
    val current = BiliClient.prefs.v619assetAutoLoad619
    BiliClient.prefs.v619assetAutoLoad619 = !current
    AppToast.show(this, "Asset Auto Load619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619AssignAutoTask619Toggle() {
    val current = BiliClient.prefs.v619assignAutoTask619
    BiliClient.prefs.v619assignAutoTask619 = !current
    AppToast.show(this, "Assign Auto Task619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619AsyncAutoExecute619Toggle() {
    val current = BiliClient.prefs.v619asyncAutoExecute619
    BiliClient.prefs.v619asyncAutoExecute619 = !current
    AppToast.show(this, "Async Auto Execute619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619AttackAutoBlock619Toggle() {
    val current = BiliClient.prefs.v619attackAutoBlock619
    BiliClient.prefs.v619attackAutoBlock619 = !current
    AppToast.show(this, "Attack Auto Block619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619AvatarAutoUpdate619Toggle() {
    val current = BiliClient.prefs.v619avatarAutoUpdate619
    BiliClient.prefs.v619avatarAutoUpdate619 = !current
    AppToast.show(this, "Avatar Auto Update619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BackAutoSave619Toggle() {
    val current = BiliClient.prefs.v619backAutoSave619
    BiliClient.prefs.v619backAutoSave619 = !current
    AppToast.show(this, "Back Auto Save619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BalanceAutoLoad619Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v619balanceAutoLoad619).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load619",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v619balanceAutoLoad619 = value
        AppToast.show(this, "Balance Auto Load619: $value")
    }
}

internal fun PlayerActivity.showV619BandAutoWidth619Toggle() {
    val current = BiliClient.prefs.v619bandAutoWidth619
    BiliClient.prefs.v619bandAutoWidth619 = !current
    AppToast.show(this, "Band Auto Width619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BarAutoScroll619Toggle() {
    val current = BiliClient.prefs.v619barAutoScroll619
    BiliClient.prefs.v619barAutoScroll619 = !current
    AppToast.show(this, "Bar Auto Scroll619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BeaconAutoPing619Toggle() {
    val current = BiliClient.prefs.v619beaconAutoPing619
    BiliClient.prefs.v619beaconAutoPing619 = !current
    AppToast.show(this, "Beacon Auto Ping619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BeamAutoForm619Toggle() {
    val current = BiliClient.prefs.v619beamAutoForm619
    BiliClient.prefs.v619beamAutoForm619 = !current
    AppToast.show(this, "Beam Auto Form619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BeforeAutoHook619Toggle() {
    val current = BiliClient.prefs.v619beforeAutoHook619
    BiliClient.prefs.v619beforeAutoHook619 = !current
    AppToast.show(this, "Before Auto Hook619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BeginAutoInit619Toggle() {
    val current = BiliClient.prefs.v619beginAutoInit619
    BiliClient.prefs.v619beginAutoInit619 = !current
    AppToast.show(this, "Begin Auto Init619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV619BehaviorAutoTrack619Toggle() {
    val current = BiliClient.prefs.v619behaviorAutoTrack619
    BiliClient.prefs.v619behaviorAutoTrack619 = !current
    AppToast.show(this, "Behavior Auto Track619: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620ArrowAutoNavigate620Toggle() {
    val current = BiliClient.prefs.v620arrowAutoNavigate620
    BiliClient.prefs.v620arrowAutoNavigate620 = !current
    AppToast.show(this, "Arrow Auto Navigate620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620AssetAutoLoad620Toggle() {
    val current = BiliClient.prefs.v620assetAutoLoad620
    BiliClient.prefs.v620assetAutoLoad620 = !current
    AppToast.show(this, "Asset Auto Load620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620AssignAutoTask620Toggle() {
    val current = BiliClient.prefs.v620assignAutoTask620
    BiliClient.prefs.v620assignAutoTask620 = !current
    AppToast.show(this, "Assign Auto Task620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620AsyncAutoExecute620Toggle() {
    val current = BiliClient.prefs.v620asyncAutoExecute620
    BiliClient.prefs.v620asyncAutoExecute620 = !current
    AppToast.show(this, "Async Auto Execute620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620AttackAutoBlock620Toggle() {
    val current = BiliClient.prefs.v620attackAutoBlock620
    BiliClient.prefs.v620attackAutoBlock620 = !current
    AppToast.show(this, "Attack Auto Block620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620AvatarAutoUpdate620Toggle() {
    val current = BiliClient.prefs.v620avatarAutoUpdate620
    BiliClient.prefs.v620avatarAutoUpdate620 = !current
    AppToast.show(this, "Avatar Auto Update620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BackAutoSave620Toggle() {
    val current = BiliClient.prefs.v620backAutoSave620
    BiliClient.prefs.v620backAutoSave620 = !current
    AppToast.show(this, "Back Auto Save620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BalanceAutoLoad620Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v620balanceAutoLoad620).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load620",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v620balanceAutoLoad620 = value
        AppToast.show(this, "Balance Auto Load620: $value")
    }
}

internal fun PlayerActivity.showV620BandAutoWidth620Toggle() {
    val current = BiliClient.prefs.v620bandAutoWidth620
    BiliClient.prefs.v620bandAutoWidth620 = !current
    AppToast.show(this, "Band Auto Width620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BarAutoScroll620Toggle() {
    val current = BiliClient.prefs.v620barAutoScroll620
    BiliClient.prefs.v620barAutoScroll620 = !current
    AppToast.show(this, "Bar Auto Scroll620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BeaconAutoPing620Toggle() {
    val current = BiliClient.prefs.v620beaconAutoPing620
    BiliClient.prefs.v620beaconAutoPing620 = !current
    AppToast.show(this, "Beacon Auto Ping620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BeamAutoForm620Toggle() {
    val current = BiliClient.prefs.v620beamAutoForm620
    BiliClient.prefs.v620beamAutoForm620 = !current
    AppToast.show(this, "Beam Auto Form620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BeforeAutoHook620Toggle() {
    val current = BiliClient.prefs.v620beforeAutoHook620
    BiliClient.prefs.v620beforeAutoHook620 = !current
    AppToast.show(this, "Before Auto Hook620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BeginAutoInit620Toggle() {
    val current = BiliClient.prefs.v620beginAutoInit620
    BiliClient.prefs.v620beginAutoInit620 = !current
    AppToast.show(this, "Begin Auto Init620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV620BehaviorAutoTrack620Toggle() {
    val current = BiliClient.prefs.v620behaviorAutoTrack620
    BiliClient.prefs.v620behaviorAutoTrack620 = !current
    AppToast.show(this, "Behavior Auto Track620: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BenchmarkAutoRun621Toggle() {
    val current = BiliClient.prefs.v621benchmarkAutoRun621
    BiliClient.prefs.v621benchmarkAutoRun621 = !current
    AppToast.show(this, "Benchmark Auto Run621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BetaAutoUpdate621Toggle() {
    val current = BiliClient.prefs.v621betaAutoUpdate621
    BiliClient.prefs.v621betaAutoUpdate621 = !current
    AppToast.show(this, "Beta Auto Update621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BinaryAutoDecode621Toggle() {
    val current = BiliClient.prefs.v621binaryAutoDecode621
    BiliClient.prefs.v621binaryAutoDecode621 = !current
    AppToast.show(this, "Binary Auto Decode621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BlankAutoFill621Toggle() {
    val current = BiliClient.prefs.v621blankAutoFill621
    BiliClient.prefs.v621blankAutoFill621 = !current
    AppToast.show(this, "Blank Auto Fill621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BodyAutoParse621Toggle() {
    val current = BiliClient.prefs.v621bodyAutoParse621
    BiliClient.prefs.v621bodyAutoParse621 = !current
    AppToast.show(this, "Body Auto Parse621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BoldAutoDetect621Toggle() {
    val current = BiliClient.prefs.v621boldAutoDetect621
    BiliClient.prefs.v621boldAutoDetect621 = !current
    AppToast.show(this, "Bold Auto Detect621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BootAutoStart621Toggle() {
    val current = BiliClient.prefs.v621bootAutoStart621
    BiliClient.prefs.v621bootAutoStart621 = !current
    AppToast.show(this, "Boot Auto Start621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BorderAutoDraw621Toggle() {
    val current = BiliClient.prefs.v621borderAutoDraw621
    BiliClient.prefs.v621borderAutoDraw621 = !current
    AppToast.show(this, "Border Auto Draw621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BottomAutoNav621Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v621bottomAutoNav621).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav621",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v621bottomAutoNav621 = value
        AppToast.show(this, "Bottom Auto Nav621: $value")
    }
}

internal fun PlayerActivity.showV621BounceAutoEffect621Toggle() {
    val current = BiliClient.prefs.v621bounceAutoEffect621
    BiliClient.prefs.v621bounceAutoEffect621 = !current
    AppToast.show(this, "Bounce Auto Effect621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BoxAutoShadow621Toggle() {
    val current = BiliClient.prefs.v621boxAutoShadow621
    BiliClient.prefs.v621boxAutoShadow621 = !current
    AppToast.show(this, "Box Auto Shadow621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BranchAutoMerge621Toggle() {
    val current = BiliClient.prefs.v621branchAutoMerge621
    BiliClient.prefs.v621branchAutoMerge621 = !current
    AppToast.show(this, "Branch Auto Merge621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BrandAutoLogo621Toggle() {
    val current = BiliClient.prefs.v621brandAutoLogo621
    BiliClient.prefs.v621brandAutoLogo621 = !current
    AppToast.show(this, "Brand Auto Logo621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BreakAutoResume621Toggle() {
    val current = BiliClient.prefs.v621breakAutoResume621
    BiliClient.prefs.v621breakAutoResume621 = !current
    AppToast.show(this, "Break Auto Resume621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV621BridgeAutoConnect621Toggle() {
    val current = BiliClient.prefs.v621bridgeAutoConnect621
    BiliClient.prefs.v621bridgeAutoConnect621 = !current
    AppToast.show(this, "Bridge Auto Connect621: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BenchmarkAutoRun622Toggle() {
    val current = BiliClient.prefs.v622benchmarkAutoRun622
    BiliClient.prefs.v622benchmarkAutoRun622 = !current
    AppToast.show(this, "Benchmark Auto Run622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BetaAutoUpdate622Toggle() {
    val current = BiliClient.prefs.v622betaAutoUpdate622
    BiliClient.prefs.v622betaAutoUpdate622 = !current
    AppToast.show(this, "Beta Auto Update622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BinaryAutoDecode622Toggle() {
    val current = BiliClient.prefs.v622binaryAutoDecode622
    BiliClient.prefs.v622binaryAutoDecode622 = !current
    AppToast.show(this, "Binary Auto Decode622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BlankAutoFill622Toggle() {
    val current = BiliClient.prefs.v622blankAutoFill622
    BiliClient.prefs.v622blankAutoFill622 = !current
    AppToast.show(this, "Blank Auto Fill622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BodyAutoParse622Toggle() {
    val current = BiliClient.prefs.v622bodyAutoParse622
    BiliClient.prefs.v622bodyAutoParse622 = !current
    AppToast.show(this, "Body Auto Parse622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BoldAutoDetect622Toggle() {
    val current = BiliClient.prefs.v622boldAutoDetect622
    BiliClient.prefs.v622boldAutoDetect622 = !current
    AppToast.show(this, "Bold Auto Detect622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BootAutoStart622Toggle() {
    val current = BiliClient.prefs.v622bootAutoStart622
    BiliClient.prefs.v622bootAutoStart622 = !current
    AppToast.show(this, "Boot Auto Start622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BorderAutoDraw622Toggle() {
    val current = BiliClient.prefs.v622borderAutoDraw622
    BiliClient.prefs.v622borderAutoDraw622 = !current
    AppToast.show(this, "Border Auto Draw622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BottomAutoNav622Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v622bottomAutoNav622).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav622",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v622bottomAutoNav622 = value
        AppToast.show(this, "Bottom Auto Nav622: $value")
    }
}

internal fun PlayerActivity.showV622BounceAutoEffect622Toggle() {
    val current = BiliClient.prefs.v622bounceAutoEffect622
    BiliClient.prefs.v622bounceAutoEffect622 = !current
    AppToast.show(this, "Bounce Auto Effect622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BoxAutoShadow622Toggle() {
    val current = BiliClient.prefs.v622boxAutoShadow622
    BiliClient.prefs.v622boxAutoShadow622 = !current
    AppToast.show(this, "Box Auto Shadow622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BranchAutoMerge622Toggle() {
    val current = BiliClient.prefs.v622branchAutoMerge622
    BiliClient.prefs.v622branchAutoMerge622 = !current
    AppToast.show(this, "Branch Auto Merge622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BrandAutoLogo622Toggle() {
    val current = BiliClient.prefs.v622brandAutoLogo622
    BiliClient.prefs.v622brandAutoLogo622 = !current
    AppToast.show(this, "Brand Auto Logo622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BreakAutoResume622Toggle() {
    val current = BiliClient.prefs.v622breakAutoResume622
    BiliClient.prefs.v622breakAutoResume622 = !current
    AppToast.show(this, "Break Auto Resume622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV622BridgeAutoConnect622Toggle() {
    val current = BiliClient.prefs.v622bridgeAutoConnect622
    BiliClient.prefs.v622bridgeAutoConnect622 = !current
    AppToast.show(this, "Bridge Auto Connect622: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BenchmarkAutoRun623Toggle() {
    val current = BiliClient.prefs.v623benchmarkAutoRun623
    BiliClient.prefs.v623benchmarkAutoRun623 = !current
    AppToast.show(this, "Benchmark Auto Run623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BetaAutoUpdate623Toggle() {
    val current = BiliClient.prefs.v623betaAutoUpdate623
    BiliClient.prefs.v623betaAutoUpdate623 = !current
    AppToast.show(this, "Beta Auto Update623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BinaryAutoDecode623Toggle() {
    val current = BiliClient.prefs.v623binaryAutoDecode623
    BiliClient.prefs.v623binaryAutoDecode623 = !current
    AppToast.show(this, "Binary Auto Decode623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BlankAutoFill623Toggle() {
    val current = BiliClient.prefs.v623blankAutoFill623
    BiliClient.prefs.v623blankAutoFill623 = !current
    AppToast.show(this, "Blank Auto Fill623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BodyAutoParse623Toggle() {
    val current = BiliClient.prefs.v623bodyAutoParse623
    BiliClient.prefs.v623bodyAutoParse623 = !current
    AppToast.show(this, "Body Auto Parse623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BoldAutoDetect623Toggle() {
    val current = BiliClient.prefs.v623boldAutoDetect623
    BiliClient.prefs.v623boldAutoDetect623 = !current
    AppToast.show(this, "Bold Auto Detect623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BootAutoStart623Toggle() {
    val current = BiliClient.prefs.v623bootAutoStart623
    BiliClient.prefs.v623bootAutoStart623 = !current
    AppToast.show(this, "Boot Auto Start623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BorderAutoDraw623Toggle() {
    val current = BiliClient.prefs.v623borderAutoDraw623
    BiliClient.prefs.v623borderAutoDraw623 = !current
    AppToast.show(this, "Border Auto Draw623: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV623BounceAutoEffect623Toggle() {
    val current = BiliClient.prefs.v623bounceAutoEffect623
    BiliClient.prefs.v623bounceAutoEffect623 = !current
    AppToast.show(this, "Bounce Auto Effect623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BoxAutoShadow623Toggle() {
    val current = BiliClient.prefs.v623boxAutoShadow623
    BiliClient.prefs.v623boxAutoShadow623 = !current
    AppToast.show(this, "Box Auto Shadow623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BranchAutoMerge623Toggle() {
    val current = BiliClient.prefs.v623branchAutoMerge623
    BiliClient.prefs.v623branchAutoMerge623 = !current
    AppToast.show(this, "Branch Auto Merge623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BrandAutoLogo623Toggle() {
    val current = BiliClient.prefs.v623brandAutoLogo623
    BiliClient.prefs.v623brandAutoLogo623 = !current
    AppToast.show(this, "Brand Auto Logo623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BreakAutoResume623Toggle() {
    val current = BiliClient.prefs.v623breakAutoResume623
    BiliClient.prefs.v623breakAutoResume623 = !current
    AppToast.show(this, "Break Auto Resume623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV623BridgeAutoConnect623Toggle() {
    val current = BiliClient.prefs.v623bridgeAutoConnect623
    BiliClient.prefs.v623bridgeAutoConnect623 = !current
    AppToast.show(this, "Bridge Auto Connect623: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BenchmarkAutoRun624Toggle() {
    val current = BiliClient.prefs.v624benchmarkAutoRun624
    BiliClient.prefs.v624benchmarkAutoRun624 = !current
    AppToast.show(this, "Benchmark Auto Run624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BetaAutoUpdate624Toggle() {
    val current = BiliClient.prefs.v624betaAutoUpdate624
    BiliClient.prefs.v624betaAutoUpdate624 = !current
    AppToast.show(this, "Beta Auto Update624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BinaryAutoDecode624Toggle() {
    val current = BiliClient.prefs.v624binaryAutoDecode624
    BiliClient.prefs.v624binaryAutoDecode624 = !current
    AppToast.show(this, "Binary Auto Decode624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BlankAutoFill624Toggle() {
    val current = BiliClient.prefs.v624blankAutoFill624
    BiliClient.prefs.v624blankAutoFill624 = !current
    AppToast.show(this, "Blank Auto Fill624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BodyAutoParse624Toggle() {
    val current = BiliClient.prefs.v624bodyAutoParse624
    BiliClient.prefs.v624bodyAutoParse624 = !current
    AppToast.show(this, "Body Auto Parse624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BoldAutoDetect624Toggle() {
    val current = BiliClient.prefs.v624boldAutoDetect624
    BiliClient.prefs.v624boldAutoDetect624 = !current
    AppToast.show(this, "Bold Auto Detect624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BootAutoStart624Toggle() {
    val current = BiliClient.prefs.v624bootAutoStart624
    BiliClient.prefs.v624bootAutoStart624 = !current
    AppToast.show(this, "Boot Auto Start624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BorderAutoDraw624Toggle() {
    val current = BiliClient.prefs.v624borderAutoDraw624
    BiliClient.prefs.v624borderAutoDraw624 = !current
    AppToast.show(this, "Border Auto Draw624: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV624BounceAutoEffect624Toggle() {
    val current = BiliClient.prefs.v624bounceAutoEffect624
    BiliClient.prefs.v624bounceAutoEffect624 = !current
    AppToast.show(this, "Bounce Auto Effect624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BoxAutoShadow624Toggle() {
    val current = BiliClient.prefs.v624boxAutoShadow624
    BiliClient.prefs.v624boxAutoShadow624 = !current
    AppToast.show(this, "Box Auto Shadow624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BranchAutoMerge624Toggle() {
    val current = BiliClient.prefs.v624branchAutoMerge624
    BiliClient.prefs.v624branchAutoMerge624 = !current
    AppToast.show(this, "Branch Auto Merge624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BrandAutoLogo624Toggle() {
    val current = BiliClient.prefs.v624brandAutoLogo624
    BiliClient.prefs.v624brandAutoLogo624 = !current
    AppToast.show(this, "Brand Auto Logo624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BreakAutoResume624Toggle() {
    val current = BiliClient.prefs.v624breakAutoResume624
    BiliClient.prefs.v624breakAutoResume624 = !current
    AppToast.show(this, "Break Auto Resume624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV624BridgeAutoConnect624Toggle() {
    val current = BiliClient.prefs.v624bridgeAutoConnect624
    BiliClient.prefs.v624bridgeAutoConnect624 = !current
    AppToast.show(this, "Bridge Auto Connect624: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BenchmarkAutoRun625Toggle() {
    val current = BiliClient.prefs.v625benchmarkAutoRun625
    BiliClient.prefs.v625benchmarkAutoRun625 = !current
    AppToast.show(this, "Benchmark Auto Run625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BetaAutoUpdate625Toggle() {
    val current = BiliClient.prefs.v625betaAutoUpdate625
    BiliClient.prefs.v625betaAutoUpdate625 = !current
    AppToast.show(this, "Beta Auto Update625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BinaryAutoDecode625Toggle() {
    val current = BiliClient.prefs.v625binaryAutoDecode625
    BiliClient.prefs.v625binaryAutoDecode625 = !current
    AppToast.show(this, "Binary Auto Decode625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BlankAutoFill625Toggle() {
    val current = BiliClient.prefs.v625blankAutoFill625
    BiliClient.prefs.v625blankAutoFill625 = !current
    AppToast.show(this, "Blank Auto Fill625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BodyAutoParse625Toggle() {
    val current = BiliClient.prefs.v625bodyAutoParse625
    BiliClient.prefs.v625bodyAutoParse625 = !current
    AppToast.show(this, "Body Auto Parse625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BoldAutoDetect625Toggle() {
    val current = BiliClient.prefs.v625boldAutoDetect625
    BiliClient.prefs.v625boldAutoDetect625 = !current
    AppToast.show(this, "Bold Auto Detect625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BootAutoStart625Toggle() {
    val current = BiliClient.prefs.v625bootAutoStart625
    BiliClient.prefs.v625bootAutoStart625 = !current
    AppToast.show(this, "Boot Auto Start625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BorderAutoDraw625Toggle() {
    val current = BiliClient.prefs.v625borderAutoDraw625
    BiliClient.prefs.v625borderAutoDraw625 = !current
    AppToast.show(this, "Border Auto Draw625: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV625BounceAutoEffect625Toggle() {
    val current = BiliClient.prefs.v625bounceAutoEffect625
    BiliClient.prefs.v625bounceAutoEffect625 = !current
    AppToast.show(this, "Bounce Auto Effect625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BoxAutoShadow625Toggle() {
    val current = BiliClient.prefs.v625boxAutoShadow625
    BiliClient.prefs.v625boxAutoShadow625 = !current
    AppToast.show(this, "Box Auto Shadow625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BranchAutoMerge625Toggle() {
    val current = BiliClient.prefs.v625branchAutoMerge625
    BiliClient.prefs.v625branchAutoMerge625 = !current
    AppToast.show(this, "Branch Auto Merge625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BrandAutoLogo625Toggle() {
    val current = BiliClient.prefs.v625brandAutoLogo625
    BiliClient.prefs.v625brandAutoLogo625 = !current
    AppToast.show(this, "Brand Auto Logo625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BreakAutoResume625Toggle() {
    val current = BiliClient.prefs.v625breakAutoResume625
    BiliClient.prefs.v625breakAutoResume625 = !current
    AppToast.show(this, "Break Auto Resume625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV625BridgeAutoConnect625Toggle() {
    val current = BiliClient.prefs.v625bridgeAutoConnect625
    BiliClient.prefs.v625bridgeAutoConnect625 = !current
    AppToast.show(this, "Bridge Auto Connect625: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BenchmarkAutoRun626Toggle() {
    val current = BiliClient.prefs.v626benchmarkAutoRun626
    BiliClient.prefs.v626benchmarkAutoRun626 = !current
    AppToast.show(this, "Benchmark Auto Run626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BetaAutoUpdate626Toggle() {
    val current = BiliClient.prefs.v626betaAutoUpdate626
    BiliClient.prefs.v626betaAutoUpdate626 = !current
    AppToast.show(this, "Beta Auto Update626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BinaryAutoDecode626Toggle() {
    val current = BiliClient.prefs.v626binaryAutoDecode626
    BiliClient.prefs.v626binaryAutoDecode626 = !current
    AppToast.show(this, "Binary Auto Decode626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BlankAutoFill626Toggle() {
    val current = BiliClient.prefs.v626blankAutoFill626
    BiliClient.prefs.v626blankAutoFill626 = !current
    AppToast.show(this, "Blank Auto Fill626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BodyAutoParse626Toggle() {
    val current = BiliClient.prefs.v626bodyAutoParse626
    BiliClient.prefs.v626bodyAutoParse626 = !current
    AppToast.show(this, "Body Auto Parse626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BoldAutoDetect626Toggle() {
    val current = BiliClient.prefs.v626boldAutoDetect626
    BiliClient.prefs.v626boldAutoDetect626 = !current
    AppToast.show(this, "Bold Auto Detect626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BootAutoStart626Toggle() {
    val current = BiliClient.prefs.v626bootAutoStart626
    BiliClient.prefs.v626bootAutoStart626 = !current
    AppToast.show(this, "Boot Auto Start626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BorderAutoDraw626Toggle() {
    val current = BiliClient.prefs.v626borderAutoDraw626
    BiliClient.prefs.v626borderAutoDraw626 = !current
    AppToast.show(this, "Border Auto Draw626: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV626BounceAutoEffect626Toggle() {
    val current = BiliClient.prefs.v626bounceAutoEffect626
    BiliClient.prefs.v626bounceAutoEffect626 = !current
    AppToast.show(this, "Bounce Auto Effect626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BoxAutoShadow626Toggle() {
    val current = BiliClient.prefs.v626boxAutoShadow626
    BiliClient.prefs.v626boxAutoShadow626 = !current
    AppToast.show(this, "Box Auto Shadow626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BranchAutoMerge626Toggle() {
    val current = BiliClient.prefs.v626branchAutoMerge626
    BiliClient.prefs.v626branchAutoMerge626 = !current
    AppToast.show(this, "Branch Auto Merge626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BrandAutoLogo626Toggle() {
    val current = BiliClient.prefs.v626brandAutoLogo626
    BiliClient.prefs.v626brandAutoLogo626 = !current
    AppToast.show(this, "Brand Auto Logo626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BreakAutoResume626Toggle() {
    val current = BiliClient.prefs.v626breakAutoResume626
    BiliClient.prefs.v626breakAutoResume626 = !current
    AppToast.show(this, "Break Auto Resume626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV626BridgeAutoConnect626Toggle() {
    val current = BiliClient.prefs.v626bridgeAutoConnect626
    BiliClient.prefs.v626bridgeAutoConnect626 = !current
    AppToast.show(this, "Bridge Auto Connect626: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BenchmarkAutoRun627Toggle() {
    val current = BiliClient.prefs.v627benchmarkAutoRun627
    BiliClient.prefs.v627benchmarkAutoRun627 = !current
    AppToast.show(this, "Benchmark Auto Run627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BetaAutoUpdate627Toggle() {
    val current = BiliClient.prefs.v627betaAutoUpdate627
    BiliClient.prefs.v627betaAutoUpdate627 = !current
    AppToast.show(this, "Beta Auto Update627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BinaryAutoDecode627Toggle() {
    val current = BiliClient.prefs.v627binaryAutoDecode627
    BiliClient.prefs.v627binaryAutoDecode627 = !current
    AppToast.show(this, "Binary Auto Decode627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BlankAutoFill627Toggle() {
    val current = BiliClient.prefs.v627blankAutoFill627
    BiliClient.prefs.v627blankAutoFill627 = !current
    AppToast.show(this, "Blank Auto Fill627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BodyAutoParse627Toggle() {
    val current = BiliClient.prefs.v627bodyAutoParse627
    BiliClient.prefs.v627bodyAutoParse627 = !current
    AppToast.show(this, "Body Auto Parse627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BoldAutoDetect627Toggle() {
    val current = BiliClient.prefs.v627boldAutoDetect627
    BiliClient.prefs.v627boldAutoDetect627 = !current
    AppToast.show(this, "Bold Auto Detect627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BootAutoStart627Toggle() {
    val current = BiliClient.prefs.v627bootAutoStart627
    BiliClient.prefs.v627bootAutoStart627 = !current
    AppToast.show(this, "Boot Auto Start627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BorderAutoDraw627Toggle() {
    val current = BiliClient.prefs.v627borderAutoDraw627
    BiliClient.prefs.v627borderAutoDraw627 = !current
    AppToast.show(this, "Border Auto Draw627: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV627BounceAutoEffect627Toggle() {
    val current = BiliClient.prefs.v627bounceAutoEffect627
    BiliClient.prefs.v627bounceAutoEffect627 = !current
    AppToast.show(this, "Bounce Auto Effect627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BoxAutoShadow627Toggle() {
    val current = BiliClient.prefs.v627boxAutoShadow627
    BiliClient.prefs.v627boxAutoShadow627 = !current
    AppToast.show(this, "Box Auto Shadow627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BranchAutoMerge627Toggle() {
    val current = BiliClient.prefs.v627branchAutoMerge627
    BiliClient.prefs.v627branchAutoMerge627 = !current
    AppToast.show(this, "Branch Auto Merge627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BrandAutoLogo627Toggle() {
    val current = BiliClient.prefs.v627brandAutoLogo627
    BiliClient.prefs.v627brandAutoLogo627 = !current
    AppToast.show(this, "Brand Auto Logo627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BreakAutoResume627Toggle() {
    val current = BiliClient.prefs.v627breakAutoResume627
    BiliClient.prefs.v627breakAutoResume627 = !current
    AppToast.show(this, "Break Auto Resume627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV627BridgeAutoConnect627Toggle() {
    val current = BiliClient.prefs.v627bridgeAutoConnect627
    BiliClient.prefs.v627bridgeAutoConnect627 = !current
    AppToast.show(this, "Bridge Auto Connect627: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BenchmarkAutoRun628Toggle() {
    val current = BiliClient.prefs.v628benchmarkAutoRun628
    BiliClient.prefs.v628benchmarkAutoRun628 = !current
    AppToast.show(this, "Benchmark Auto Run628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BetaAutoUpdate628Toggle() {
    val current = BiliClient.prefs.v628betaAutoUpdate628
    BiliClient.prefs.v628betaAutoUpdate628 = !current
    AppToast.show(this, "Beta Auto Update628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BinaryAutoDecode628Toggle() {
    val current = BiliClient.prefs.v628binaryAutoDecode628
    BiliClient.prefs.v628binaryAutoDecode628 = !current
    AppToast.show(this, "Binary Auto Decode628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BlankAutoFill628Toggle() {
    val current = BiliClient.prefs.v628blankAutoFill628
    BiliClient.prefs.v628blankAutoFill628 = !current
    AppToast.show(this, "Blank Auto Fill628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BodyAutoParse628Toggle() {
    val current = BiliClient.prefs.v628bodyAutoParse628
    BiliClient.prefs.v628bodyAutoParse628 = !current
    AppToast.show(this, "Body Auto Parse628: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV628BoldAutoDetect628Toggle() {
    val current = BiliClient.prefs.v628boldAutoDetect628
    BiliClient.prefs.v628boldAutoDetect628 = !current
    AppToast.show(this, "Bold Auto Detect628: ${if (!current) "ON" else "OFF"}")
}

