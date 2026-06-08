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

internal fun PlayerActivity.showV412EncodeAutoSelect412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412encodeAutoSelect412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412encodeAutoSelect412 = value
        AppToast.show(this, "Encode Auto Select412: $value")
    }
// v413: Display Refresh Rate413


internal fun PlayerActivity.showV413DisplayRefreshRate413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayRefreshRate413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayRefreshRate413 = value
        AppToast.show(this, "Display Refresh Rate413: $value")
    }
// v413: Display Color Temp413


internal fun PlayerActivity.showV413DisplayColorTemp413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayColorTemp413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayColorTemp413 = value
        AppToast.show(this, "Display Color Temp413: $value")
    }
// v413: Encode Auto Select413


internal fun PlayerActivity.showV413EncodeAutoSelect413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413encodeAutoSelect413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413encodeAutoSelect413 = value
        AppToast.show(this, "Encode Auto Select413: $value")
    }
// v414: Display Refresh Rate414


internal fun PlayerActivity.showV414DisplayRefreshRate414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayRefreshRate414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayRefreshRate414 = value
        AppToast.show(this, "Display Refresh Rate414: $value")
    }
// v414: Display Color Temp414


internal fun PlayerActivity.showV414DisplayColorTemp414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayColorTemp414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayColorTemp414 = value
        AppToast.show(this, "Display Color Temp414: $value")
    }
// v414: Encode Auto Select414


internal fun PlayerActivity.showV414EncodeAutoSelect414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414encodeAutoSelect414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414encodeAutoSelect414 = value
        AppToast.show(this, "Encode Auto Select414: $value")
    }
// v415: Display Refresh Rate415


internal fun PlayerActivity.showV415DisplayRefreshRate415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayRefreshRate415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayRefreshRate415 = value
        AppToast.show(this, "Display Refresh Rate415: $value")
    }
// v415: Display Color Temp415


internal fun PlayerActivity.showV415DisplayColorTemp415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayColorTemp415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayColorTemp415 = value
        AppToast.show(this, "Display Color Temp415: $value")
    }
// v415: Encode Auto Select415


internal fun PlayerActivity.showV415EncodeAutoSelect415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415encodeAutoSelect415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415encodeAutoSelect415 = value
        AppToast.show(this, "Encode Auto Select415: $value")
    }
// v416: Display Refresh Rate416


internal fun PlayerActivity.showV416DisplayRefreshRate416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayRefreshRate416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayRefreshRate416 = value
        AppToast.show(this, "Display Refresh Rate416: $value")
    }
// v416: Display Color Temp416


internal fun PlayerActivity.showV416DisplayColorTemp416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayColorTemp416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayColorTemp416 = value
        AppToast.show(this, "Display Color Temp416: $value")
    }
// v416: Encode Auto Select416


internal fun PlayerActivity.showV416EncodeAutoSelect416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416encodeAutoSelect416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416encodeAutoSelect416 = value
        AppToast.show(this, "Encode Auto Select416: $value")
    }
// v417: Display Refresh Rate417


internal fun PlayerActivity.showV417DisplayRefreshRate417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayRefreshRate417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayRefreshRate417 = value
        AppToast.show(this, "Display Refresh Rate417: $value")
    }
// v417: Display Color Temp417


internal fun PlayerActivity.showV417DisplayColorTemp417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayColorTemp417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayColorTemp417 = value
        AppToast.show(this, "Display Color Temp417: $value")
    }
// v417: Encode Auto Select417


internal fun PlayerActivity.showV417EncodeAutoSelect417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417encodeAutoSelect417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417encodeAutoSelect417 = value
        AppToast.show(this, "Encode Auto Select417: $value")
    }
// v418: Display Refresh Rate418


internal fun PlayerActivity.showV418DisplayRefreshRate418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayRefreshRate418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayRefreshRate418 = value
        AppToast.show(this, "Display Refresh Rate418: $value")
    }
// v418: Display Color Temp418


internal fun PlayerActivity.showV418DisplayColorTemp418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayColorTemp418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayColorTemp418 = value
        AppToast.show(this, "Display Color Temp418: $value")
    }
// v418: Encode Auto Select418


internal fun PlayerActivity.showV418EncodeAutoSelect418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418encodeAutoSelect418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418encodeAutoSelect418 = value
        AppToast.show(this, "Encode Auto Select418: $value")
    }
// v419: Display Refresh Rate419


internal fun PlayerActivity.showV419DisplayRefreshRate419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayRefreshRate419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayRefreshRate419 = value
        AppToast.show(this, "Display Refresh Rate419: $value")
    }
// v419: Display Color Temp419


internal fun PlayerActivity.showV419DisplayColorTemp419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayColorTemp419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayColorTemp419 = value
        AppToast.show(this, "Display Color Temp419: $value")
    }
// v419: Encode Auto Select419


internal fun PlayerActivity.showV419EncodeAutoSelect419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419encodeAutoSelect419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419encodeAutoSelect419 = value
        AppToast.show(this, "Encode Auto Select419: $value")
    }
// v420: Display Refresh Rate420


internal fun PlayerActivity.showV420DisplayRefreshRate420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayRefreshRate420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayRefreshRate420 = value
        AppToast.show(this, "Display Refresh Rate420: $value")
    }
// v420: Display Color Temp420


internal fun PlayerActivity.showV420DisplayColorTemp420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayColorTemp420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayColorTemp420 = value
        AppToast.show(this, "Display Color Temp420: $value")
    }
// v420: Encode Auto Select420


internal fun PlayerActivity.showV420EncodeAutoSelect420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420encodeAutoSelect420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420encodeAutoSelect420 = value
        AppToast.show(this, "Encode Auto Select420: $value")
    }
// v421: Export Format Default421


internal fun PlayerActivity.showV421ExportFormatDefault421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421exportFormatDefault421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421exportFormatDefault421 = value
        AppToast.show(this, "Export Format Default421: $value")
    }
// v421: Feed Layout Style421


internal fun PlayerActivity.showV421FeedLayoutStyle421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421feedLayoutStyle421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421feedLayoutStyle421 = value
        AppToast.show(this, "Feed Layout Style421: $value")
    }
// v422: Export Format Default422


internal fun PlayerActivity.showV422ExportFormatDefault422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422exportFormatDefault422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422exportFormatDefault422 = value
        AppToast.show(this, "Export Format Default422: $value")
    }
// v422: Feed Layout Style422


internal fun PlayerActivity.showV422FeedLayoutStyle422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422feedLayoutStyle422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422feedLayoutStyle422 = value
        AppToast.show(this, "Feed Layout Style422: $value")
    }
// v423: Export Format Default423


internal fun PlayerActivity.showV423ExportFormatDefault423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423exportFormatDefault423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423exportFormatDefault423 = value
        AppToast.show(this, "Export Format Default423: $value")
    }
// v423: Feed Layout Style423


internal fun PlayerActivity.showV423FeedLayoutStyle423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423feedLayoutStyle423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423feedLayoutStyle423 = value
        AppToast.show(this, "Feed Layout Style423: $value")
    }
// v424: Export Format Default424


internal fun PlayerActivity.showV424ExportFormatDefault424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424exportFormatDefault424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424exportFormatDefault424 = value
        AppToast.show(this, "Export Format Default424: $value")
    }
// v424: Feed Layout Style424


internal fun PlayerActivity.showV424FeedLayoutStyle424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424feedLayoutStyle424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424feedLayoutStyle424 = value
        AppToast.show(this, "Feed Layout Style424: $value")
    }
// v425: Export Format Default425


internal fun PlayerActivity.showV425ExportFormatDefault425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425exportFormatDefault425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425exportFormatDefault425 = value
        AppToast.show(this, "Export Format Default425: $value")
    }
// v425: Feed Layout Style425


internal fun PlayerActivity.showV425FeedLayoutStyle425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425feedLayoutStyle425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425feedLayoutStyle425 = value
        AppToast.show(this, "Feed Layout Style425: $value")
    }
// v426: Export Format Default426


internal fun PlayerActivity.showV426ExportFormatDefault426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426exportFormatDefault426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426exportFormatDefault426 = value
        AppToast.show(this, "Export Format Default426: $value")
    }
// v426: Feed Layout Style426


internal fun PlayerActivity.showV426FeedLayoutStyle426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426feedLayoutStyle426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426feedLayoutStyle426 = value
        AppToast.show(this, "Feed Layout Style426: $value")
    }
// v427: Export Format Default427


internal fun PlayerActivity.showV427ExportFormatDefault427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427exportFormatDefault427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427exportFormatDefault427 = value
        AppToast.show(this, "Export Format Default427: $value")
    }
// v427: Feed Layout Style427


internal fun PlayerActivity.showV427FeedLayoutStyle427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427feedLayoutStyle427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427feedLayoutStyle427 = value
        AppToast.show(this, "Feed Layout Style427: $value")
    }
// v428: Export Format Default428


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
// v428: Feed Layout Style428


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
// v429: Export Format Default429


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
// v429: Feed Layout Style429


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
// v430: Export Format Default430


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
// v430: Feed Layout Style430


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
// v431: Fly Mode Speed431


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
// v431: Gallery Auto Layout431


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
// v432: Fly Mode Speed432


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
// v432: Gallery Auto Layout432


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
// v433: Fly Mode Speed433


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
// v433: Gallery Auto Layout433


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
// v434: Fly Mode Speed434


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
// v434: Gallery Auto Layout434


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
// v435: Fly Mode Speed435


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
// v435: Gallery Auto Layout435


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
// v436: Fly Mode Speed436


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
// v450: Hang Detection Ms450


internal fun PlayerActivity.showV450HangDetectionMs450Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v450hangDetectionMs450).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms450",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v450hangDetectionMs450 = value
        AppToast.show(this, "Hang Detection Ms450: $value")
    }
// v450: Heart Beat Interval450


internal fun PlayerActivity.showV450HeartBeatInterval450Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v450heartBeatInterval450).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval450",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v450heartBeatInterval450 = value
        AppToast.show(this, "Heart Beat Interval450: $value")
    }
// v451: Icon Pack Custom451


internal fun PlayerActivity.showV451IconPackCustom451Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v451iconPackCustom451).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom451",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v451iconPackCustom451 = value
        AppToast.show(this, "Icon Pack Custom451: $value")
    }
// v452: Icon Pack Custom452


internal fun PlayerActivity.showV452IconPackCustom452Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v452iconPackCustom452).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom452",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v452iconPackCustom452 = value
        AppToast.show(this, "Icon Pack Custom452: $value")
    }
// v453: Icon Pack Custom453


internal fun PlayerActivity.showV453IconPackCustom453Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v453iconPackCustom453).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom453",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v453iconPackCustom453 = value
        AppToast.show(this, "Icon Pack Custom453: $value")
    }
// v454: Icon Pack Custom454


internal fun PlayerActivity.showV454IconPackCustom454Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v454iconPackCustom454).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom454",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v454iconPackCustom454 = value
        AppToast.show(this, "Icon Pack Custom454: $value")
    }
// v455: Icon Pack Custom455


internal fun PlayerActivity.showV455IconPackCustom455Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v455iconPackCustom455).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom455",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v455iconPackCustom455 = value
        AppToast.show(this, "Icon Pack Custom455: $value")
    }
// v456: Icon Pack Custom456


internal fun PlayerActivity.showV456IconPackCustom456Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v456iconPackCustom456).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom456",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v456iconPackCustom456 = value
        AppToast.show(this, "Icon Pack Custom456: $value")
    }
// v457: Icon Pack Custom457


internal fun PlayerActivity.showV457IconPackCustom457Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v457iconPackCustom457).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom457",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v457iconPackCustom457 = value
        AppToast.show(this, "Icon Pack Custom457: $value")
    }
// v458: Icon Pack Custom458


internal fun PlayerActivity.showV458IconPackCustom458Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v458iconPackCustom458).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom458",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v458iconPackCustom458 = value
        AppToast.show(this, "Icon Pack Custom458: $value")
    }
// v459: Icon Pack Custom459


internal fun PlayerActivity.showV459IconPackCustom459Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v459iconPackCustom459).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom459",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v459iconPackCustom459 = value
        AppToast.show(this, "Icon Pack Custom459: $value")
    }
// v460: Icon Pack Custom460


internal fun PlayerActivity.showV460IconPackCustom460Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v460iconPackCustom460).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom460",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v460iconPackCustom460 = value
        AppToast.show(this, "Icon Pack Custom460: $value")
    }
// v461: Level Auto Adjust461


internal fun PlayerActivity.showV461LevelAutoAdjust461Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v461levelAutoAdjust461).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust461",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v461levelAutoAdjust461 = value
        AppToast.show(this, "Level Auto Adjust461: $value")
    }
// v461: Line Spacing Adjust461


internal fun PlayerActivity.showV461LineSpacingAdjust461Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v461lineSpacingAdjust461).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust461",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v461lineSpacingAdjust461 = value
        AppToast.show(this, "Line Spacing Adjust461: $value")
    }
// v462: Level Auto Adjust462


internal fun PlayerActivity.showV462LevelAutoAdjust462Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v462levelAutoAdjust462).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust462",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v462levelAutoAdjust462 = value
        AppToast.show(this, "Level Auto Adjust462: $value")
    }
// v462: Line Spacing Adjust462


internal fun PlayerActivity.showV462LineSpacingAdjust462Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v462lineSpacingAdjust462).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust462",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v462lineSpacingAdjust462 = value
        AppToast.show(this, "Line Spacing Adjust462: $value")
    }
// v463: Level Auto Adjust463


internal fun PlayerActivity.showV463LevelAutoAdjust463Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v463levelAutoAdjust463).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust463",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v463levelAutoAdjust463 = value
        AppToast.show(this, "Level Auto Adjust463: $value")
    }
// v463: Line Spacing Adjust463


internal fun PlayerActivity.showV463LineSpacingAdjust463Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v463lineSpacingAdjust463).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust463",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v463lineSpacingAdjust463 = value
        AppToast.show(this, "Line Spacing Adjust463: $value")
    }
// v464: Level Auto Adjust464


internal fun PlayerActivity.showV464LevelAutoAdjust464Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v464levelAutoAdjust464).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust464",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v464levelAutoAdjust464 = value
        AppToast.show(this, "Level Auto Adjust464: $value")
    }
// v464: Line Spacing Adjust464


internal fun PlayerActivity.showV464LineSpacingAdjust464Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v464lineSpacingAdjust464).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust464",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v464lineSpacingAdjust464 = value
        AppToast.show(this, "Line Spacing Adjust464: $value")
    }
// v465: Level Auto Adjust465


internal fun PlayerActivity.showV465LevelAutoAdjust465Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v465levelAutoAdjust465).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust465",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v465levelAutoAdjust465 = value
        AppToast.show(this, "Level Auto Adjust465: $value")
    }
// v465: Line Spacing Adjust465


internal fun PlayerActivity.showV465LineSpacingAdjust465Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v465lineSpacingAdjust465).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust465",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v465lineSpacingAdjust465 = value
        AppToast.show(this, "Line Spacing Adjust465: $value")
    }
// v466: Level Auto Adjust466


internal fun PlayerActivity.showV466LevelAutoAdjust466Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v466levelAutoAdjust466).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust466",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v466levelAutoAdjust466 = value
        AppToast.show(this, "Level Auto Adjust466: $value")
    }
// v466: Line Spacing Adjust466


internal fun PlayerActivity.showV466LineSpacingAdjust466Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v466lineSpacingAdjust466).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust466",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v466lineSpacingAdjust466 = value
        AppToast.show(this, "Line Spacing Adjust466: $value")
    }
// v467: Level Auto Adjust467


internal fun PlayerActivity.showV467LevelAutoAdjust467Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v467levelAutoAdjust467).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust467",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v467levelAutoAdjust467 = value
        AppToast.show(this, "Level Auto Adjust467: $value")
    }
// v467: Line Spacing Adjust467


internal fun PlayerActivity.showV467LineSpacingAdjust467Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v467lineSpacingAdjust467).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust467",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v467lineSpacingAdjust467 = value
        AppToast.show(this, "Line Spacing Adjust467: $value")
    }
// v468: Level Auto Adjust468


internal fun PlayerActivity.showV468LevelAutoAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468levelAutoAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468levelAutoAdjust468 = value
        AppToast.show(this, "Level Auto Adjust468: $value")
    }
// v468: Line Spacing Adjust468


internal fun PlayerActivity.showV468LineSpacingAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468lineSpacingAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468lineSpacingAdjust468 = value
        AppToast.show(this, "Line Spacing Adjust468: $value")
    }
// v469: Level Auto Adjust469


internal fun PlayerActivity.showV469LevelAutoAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469levelAutoAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469levelAutoAdjust469 = value
        AppToast.show(this, "Level Auto Adjust469: $value")
    }
// v469: Line Spacing Adjust469


internal fun PlayerActivity.showV469LineSpacingAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469lineSpacingAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469lineSpacingAdjust469 = value
        AppToast.show(this, "Line Spacing Adjust469: $value")
    }
// v470: Level Auto Adjust470


internal fun PlayerActivity.showV470LevelAutoAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470levelAutoAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470levelAutoAdjust470 = value
        AppToast.show(this, "Level Auto Adjust470: $value")
    }
// v470: Line Spacing Adjust470


internal fun PlayerActivity.showV470LineSpacingAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470lineSpacingAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470lineSpacingAdjust470 = value
        AppToast.show(this, "Line Spacing Adjust470: $value")
    }
// v471: Matrix Transform471


internal fun PlayerActivity.showV471MatrixTransform471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471matrixTransform471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471matrixTransform471 = value
        AppToast.show(this, "Matrix Transform471: $value")
    }
// v471: Max Concurrent Load471


internal fun PlayerActivity.showV471MaxConcurrentLoad471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471maxConcurrentLoad471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471maxConcurrentLoad471 = value
        AppToast.show(this, "Max Concurrent Load471: $value")
    }
// v471: Min Bitrate Auto471


internal fun PlayerActivity.showV471MinBitrateAuto471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471minBitrateAuto471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471minBitrateAuto471 = value
        AppToast.show(this, "Min Bitrate Auto471: $value")
    }
// v472: Matrix Transform472


internal fun PlayerActivity.showV472MatrixTransform472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472matrixTransform472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472matrixTransform472 = value
        AppToast.show(this, "Matrix Transform472: $value")
    }
// v472: Max Concurrent Load472


internal fun PlayerActivity.showV472MaxConcurrentLoad472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472maxConcurrentLoad472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472maxConcurrentLoad472 = value
        AppToast.show(this, "Max Concurrent Load472: $value")
    }
// v472: Min Bitrate Auto472


internal fun PlayerActivity.showV472MinBitrateAuto472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472minBitrateAuto472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472minBitrateAuto472 = value
        AppToast.show(this, "Min Bitrate Auto472: $value")
    }
// v473: Matrix Transform473


internal fun PlayerActivity.showV473MatrixTransform473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473matrixTransform473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473matrixTransform473 = value
        AppToast.show(this, "Matrix Transform473: $value")
    }
// v473: Max Concurrent Load473


internal fun PlayerActivity.showV473MaxConcurrentLoad473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473maxConcurrentLoad473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473maxConcurrentLoad473 = value
        AppToast.show(this, "Max Concurrent Load473: $value")
    }
// v473: Min Bitrate Auto473


internal fun PlayerActivity.showV473MinBitrateAuto473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473minBitrateAuto473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473minBitrateAuto473 = value
        AppToast.show(this, "Min Bitrate Auto473: $value")
    }
// v474: Matrix Transform474


internal fun PlayerActivity.showV474MatrixTransform474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474matrixTransform474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474matrixTransform474 = value
        AppToast.show(this, "Matrix Transform474: $value")
    }
// v474: Max Concurrent Load474


internal fun PlayerActivity.showV474MaxConcurrentLoad474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474maxConcurrentLoad474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474maxConcurrentLoad474 = value
        AppToast.show(this, "Max Concurrent Load474: $value")
    }
// v474: Min Bitrate Auto474


internal fun PlayerActivity.showV474MinBitrateAuto474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474minBitrateAuto474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474minBitrateAuto474 = value
        AppToast.show(this, "Min Bitrate Auto474: $value")
    }
// v475: Matrix Transform475


internal fun PlayerActivity.showV475MatrixTransform475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475matrixTransform475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475matrixTransform475 = value
        AppToast.show(this, "Matrix Transform475: $value")
    }
// v475: Max Concurrent Load475


internal fun PlayerActivity.showV475MaxConcurrentLoad475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475maxConcurrentLoad475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475maxConcurrentLoad475 = value
        AppToast.show(this, "Max Concurrent Load475: $value")
    }
// v475: Min Bitrate Auto475


internal fun PlayerActivity.showV475MinBitrateAuto475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475minBitrateAuto475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475minBitrateAuto475 = value
        AppToast.show(this, "Min Bitrate Auto475: $value")
    }
// v476: Matrix Transform476


internal fun PlayerActivity.showV476MatrixTransform476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476matrixTransform476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476matrixTransform476 = value
        AppToast.show(this, "Matrix Transform476: $value")
    }
// v476: Max Concurrent Load476


internal fun PlayerActivity.showV476MaxConcurrentLoad476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476maxConcurrentLoad476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476maxConcurrentLoad476 = value
        AppToast.show(this, "Max Concurrent Load476: $value")
    }
// v476: Min Bitrate Auto476


internal fun PlayerActivity.showV476MinBitrateAuto476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476minBitrateAuto476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476minBitrateAuto476 = value
        AppToast.show(this, "Min Bitrate Auto476: $value")
    }
// v477: Matrix Transform477


internal fun PlayerActivity.showV477MatrixTransform477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477matrixTransform477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477matrixTransform477 = value
        AppToast.show(this, "Matrix Transform477: $value")
    }
// v477: Max Concurrent Load477


internal fun PlayerActivity.showV477MaxConcurrentLoad477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477maxConcurrentLoad477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477maxConcurrentLoad477 = value
        AppToast.show(this, "Max Concurrent Load477: $value")
    }
// v477: Min Bitrate Auto477


internal fun PlayerActivity.showV477MinBitrateAuto477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477minBitrateAuto477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477minBitrateAuto477 = value
        AppToast.show(this, "Min Bitrate Auto477: $value")
    }
// v478: Matrix Transform478


internal fun PlayerActivity.showV478MatrixTransform478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478matrixTransform478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478matrixTransform478 = value
        AppToast.show(this, "Matrix Transform478: $value")
    }
// v478: Max Concurrent Load478


internal fun PlayerActivity.showV478MaxConcurrentLoad478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478maxConcurrentLoad478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478maxConcurrentLoad478 = value
        AppToast.show(this, "Max Concurrent Load478: $value")
    }
// v478: Min Bitrate Auto478


internal fun PlayerActivity.showV478MinBitrateAuto478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478minBitrateAuto478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478minBitrateAuto478 = value
        AppToast.show(this, "Min Bitrate Auto478: $value")
    }
// v479: Matrix Transform479


internal fun PlayerActivity.showV479MatrixTransform479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479matrixTransform479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479matrixTransform479 = value
        AppToast.show(this, "Matrix Transform479: $value")
    }
// v479: Max Concurrent Load479


internal fun PlayerActivity.showV479MaxConcurrentLoad479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479maxConcurrentLoad479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479maxConcurrentLoad479 = value
        AppToast.show(this, "Max Concurrent Load479: $value")
    }
// v479: Min Bitrate Auto479


internal fun PlayerActivity.showV479MinBitrateAuto479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479minBitrateAuto479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479minBitrateAuto479 = value
        AppToast.show(this, "Min Bitrate Auto479: $value")
    }
// v480: Matrix Transform480


internal fun PlayerActivity.showV480MatrixTransform480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480matrixTransform480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480matrixTransform480 = value
        AppToast.show(this, "Matrix Transform480: $value")
    }
// v480: Max Concurrent Load480


internal fun PlayerActivity.showV480MaxConcurrentLoad480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480maxConcurrentLoad480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480maxConcurrentLoad480 = value
        AppToast.show(this, "Max Concurrent Load480: $value")
    }
// v480: Min Bitrate Auto480


internal fun PlayerActivity.showV480MinBitrateAuto480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480minBitrateAuto480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480minBitrateAuto480 = value
        AppToast.show(this, "Min Bitrate Auto480: $value")
    }
// v481: Order Auto Sort481


internal fun PlayerActivity.showV481OrderAutoSort481Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v481orderAutoSort481).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort481",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v481orderAutoSort481 = value
        AppToast.show(this, "Order Auto Sort481: $value")
    }
// v482: Order Auto Sort482


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
// v483: Order Auto Sort483


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
// v484: Order Auto Sort484


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
// v485: Order Auto Sort485


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
// v486: Order Auto Sort486


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
// v487: Order Auto Sort487


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
// v488: Order Auto Sort488


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
// v489: Order Auto Sort489


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
// v503: Press And Hold Action503


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
// v503: Primary Audio Track503


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
// v504: Press And Hold Action504


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
// v504: Primary Audio Track504


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
// v505: Press And Hold Action505


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
// v505: Primary Audio Track505


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
// v506: Press And Hold Action506


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
// v506: Primary Audio Track506


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
// v507: Press And Hold Action507


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
// v507: Primary Audio Track507


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
// v508: Press And Hold Action508


internal fun PlayerActivity.showV508PressAndHoldAction508Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v508pressAndHoldAction508).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action508",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v508pressAndHoldAction508 = value
        AppToast.show(this, "Press And Hold Action508: $value")
    }
// v508: Primary Audio Track508


internal fun PlayerActivity.showV508PrimaryAudioTrack508Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v508primaryAudioTrack508).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track508",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v508primaryAudioTrack508 = value
        AppToast.show(this, "Primary Audio Track508: $value")
    }
// v509: Press And Hold Action509


internal fun PlayerActivity.showV509PressAndHoldAction509Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v509pressAndHoldAction509).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action509",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v509pressAndHoldAction509 = value
        AppToast.show(this, "Press And Hold Action509: $value")
    }
// v509: Primary Audio Track509


internal fun PlayerActivity.showV509PrimaryAudioTrack509Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v509primaryAudioTrack509).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track509",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v509primaryAudioTrack509 = value
        AppToast.show(this, "Primary Audio Track509: $value")
    }
// v510: Press And Hold Action510


internal fun PlayerActivity.showV510PressAndHoldAction510Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v510pressAndHoldAction510).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action510",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v510pressAndHoldAction510 = value
        AppToast.show(this, "Press And Hold Action510: $value")
    }
// v510: Primary Audio Track510


internal fun PlayerActivity.showV510PrimaryAudioTrack510Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v510primaryAudioTrack510).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track510",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v510primaryAudioTrack510 = value
        AppToast.show(this, "Primary Audio Track510: $value")
    }
// v511: Region Auto Select511


internal fun PlayerActivity.showV511RegionAutoSelect511Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v511regionAutoSelect511).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select511",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v511regionAutoSelect511 = value
        AppToast.show(this, "Region Auto Select511: $value")
    }
// v512: Region Auto Select512


internal fun PlayerActivity.showV512RegionAutoSelect512Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v512regionAutoSelect512).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select512",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v512regionAutoSelect512 = value
        AppToast.show(this, "Region Auto Select512: $value")
    }
// v513: Region Auto Select513


internal fun PlayerActivity.showV513RegionAutoSelect513Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v513regionAutoSelect513).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select513",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v513regionAutoSelect513 = value
        AppToast.show(this, "Region Auto Select513: $value")
    }
// v514: Region Auto Select514


internal fun PlayerActivity.showV514RegionAutoSelect514Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v514regionAutoSelect514).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select514",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v514regionAutoSelect514 = value
        AppToast.show(this, "Region Auto Select514: $value")
    }
// v515: Region Auto Select515


internal fun PlayerActivity.showV515RegionAutoSelect515Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v515regionAutoSelect515).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select515",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v515regionAutoSelect515 = value
        AppToast.show(this, "Region Auto Select515: $value")
    }
// v516: Region Auto Select516


internal fun PlayerActivity.showV516RegionAutoSelect516Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v516regionAutoSelect516).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select516",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v516regionAutoSelect516 = value
        AppToast.show(this, "Region Auto Select516: $value")
    }
// v517: Region Auto Select517


internal fun PlayerActivity.showV517RegionAutoSelect517Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v517regionAutoSelect517).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select517",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v517regionAutoSelect517 = value
        AppToast.show(this, "Region Auto Select517: $value")
    }
// v518: Region Auto Select518


internal fun PlayerActivity.showV518RegionAutoSelect518Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v518regionAutoSelect518).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select518",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v518regionAutoSelect518 = value
        AppToast.show(this, "Region Auto Select518: $value")
    }
// v519: Region Auto Select519


internal fun PlayerActivity.showV519RegionAutoSelect519Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v519regionAutoSelect519).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select519",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v519regionAutoSelect519 = value
        AppToast.show(this, "Region Auto Select519: $value")
    }
// v520: Region Auto Select520


internal fun PlayerActivity.showV520RegionAutoSelect520Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v520regionAutoSelect520).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select520",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v520regionAutoSelect520 = value
        AppToast.show(this, "Region Auto Select520: $value")
    }
// v521: Render Auto Quality521


internal fun PlayerActivity.showV521RenderAutoQuality521Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v521renderAutoQuality521).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality521",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v521renderAutoQuality521 = value
        AppToast.show(this, "Render Auto Quality521: $value")
    }
// v521: Result Auto Sort521


internal fun PlayerActivity.showV521ResultAutoSort521Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v521resultAutoSort521).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort521",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v521resultAutoSort521 = value
        AppToast.show(this, "Result Auto Sort521: $value")
    }
// v522: Render Auto Quality522


internal fun PlayerActivity.showV522RenderAutoQuality522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522renderAutoQuality522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522renderAutoQuality522 = value
        AppToast.show(this, "Render Auto Quality522: $value")
    }
// v522: Result Auto Sort522


internal fun PlayerActivity.showV522ResultAutoSort522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522resultAutoSort522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522resultAutoSort522 = value
        AppToast.show(this, "Result Auto Sort522: $value")
    }
// v523: Render Auto Quality523


internal fun PlayerActivity.showV523RenderAutoQuality523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523renderAutoQuality523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523renderAutoQuality523 = value
        AppToast.show(this, "Render Auto Quality523: $value")
    }
// v523: Result Auto Sort523


internal fun PlayerActivity.showV523ResultAutoSort523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523resultAutoSort523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523resultAutoSort523 = value
        AppToast.show(this, "Result Auto Sort523: $value")
    }
// v524: Render Auto Quality524


internal fun PlayerActivity.showV524RenderAutoQuality524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524renderAutoQuality524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524renderAutoQuality524 = value
        AppToast.show(this, "Render Auto Quality524: $value")
    }
// v524: Result Auto Sort524


internal fun PlayerActivity.showV524ResultAutoSort524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524resultAutoSort524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524resultAutoSort524 = value
        AppToast.show(this, "Result Auto Sort524: $value")
    }
// v525: Render Auto Quality525


internal fun PlayerActivity.showV525RenderAutoQuality525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525renderAutoQuality525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525renderAutoQuality525 = value
        AppToast.show(this, "Render Auto Quality525: $value")
    }
// v525: Result Auto Sort525


internal fun PlayerActivity.showV525ResultAutoSort525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525resultAutoSort525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525resultAutoSort525 = value
        AppToast.show(this, "Result Auto Sort525: $value")
    }
// v526: Render Auto Quality526


internal fun PlayerActivity.showV526RenderAutoQuality526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526renderAutoQuality526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526renderAutoQuality526 = value
        AppToast.show(this, "Render Auto Quality526: $value")
    }
// v526: Result Auto Sort526


internal fun PlayerActivity.showV526ResultAutoSort526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526resultAutoSort526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526resultAutoSort526 = value
        AppToast.show(this, "Result Auto Sort526: $value")
    }
// v527: Render Auto Quality527


internal fun PlayerActivity.showV527RenderAutoQuality527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527renderAutoQuality527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527renderAutoQuality527 = value
        AppToast.show(this, "Render Auto Quality527: $value")
    }
// v527: Result Auto Sort527


internal fun PlayerActivity.showV527ResultAutoSort527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527resultAutoSort527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527resultAutoSort527 = value
        AppToast.show(this, "Result Auto Sort527: $value")
    }
// v528: Render Auto Quality528


internal fun PlayerActivity.showV528RenderAutoQuality528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528renderAutoQuality528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528renderAutoQuality528 = value
        AppToast.show(this, "Render Auto Quality528: $value")
    }
// v528: Result Auto Sort528


