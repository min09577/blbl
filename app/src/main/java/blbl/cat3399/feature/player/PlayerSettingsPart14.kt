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

internal fun PlayerActivity.showV371DataUsageLimit371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371dataUsageLimit371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371dataUsageLimit371 = value
        AppToast.show(this, "Data Usage Limit371: $value")
    }
// v372: Caption Font Size372


internal fun PlayerActivity.showV372CaptionFontSize372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372captionFontSize372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372captionFontSize372 = value
        AppToast.show(this, "Caption Font Size372: $value")
    }
// v372: Caption Position372


internal fun PlayerActivity.showV372CaptionPosition372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372captionPosition372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372captionPosition372 = value
        AppToast.show(this, "Caption Position372: $value")
    }
// v372: Chromecast Quality372


internal fun PlayerActivity.showV372ChromecastQuality372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372chromecastQuality372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372chromecastQuality372 = value
        AppToast.show(this, "Chromecast Quality372: $value")
    }
// v372: Floating Window Size372


internal fun PlayerActivity.showV372FloatingWindowSize372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372floatingWindowSize372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372floatingWindowSize372 = value
        AppToast.show(this, "Floating Window Size372: $value")
    }
// v372: Recommend Algorithm372


internal fun PlayerActivity.showV372RecommendAlgorithm372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372recommendAlgorithm372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372recommendAlgorithm372 = value
        AppToast.show(this, "Recommend Algorithm372: $value")
    }
// v372: Data Usage Limit372


internal fun PlayerActivity.showV372DataUsageLimit372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372dataUsageLimit372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372dataUsageLimit372 = value
        AppToast.show(this, "Data Usage Limit372: $value")
    }
// v373: Caption Font Size373


internal fun PlayerActivity.showV373CaptionFontSize373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373captionFontSize373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373captionFontSize373 = value
        AppToast.show(this, "Caption Font Size373: $value")
    }
// v373: Caption Position373


internal fun PlayerActivity.showV373CaptionPosition373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373captionPosition373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373captionPosition373 = value
        AppToast.show(this, "Caption Position373: $value")
    }
// v373: Chromecast Quality373


internal fun PlayerActivity.showV373ChromecastQuality373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373chromecastQuality373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373chromecastQuality373 = value
        AppToast.show(this, "Chromecast Quality373: $value")
    }
// v373: Floating Window Size373


internal fun PlayerActivity.showV373FloatingWindowSize373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373floatingWindowSize373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373floatingWindowSize373 = value
        AppToast.show(this, "Floating Window Size373: $value")
    }
// v373: Recommend Algorithm373


internal fun PlayerActivity.showV373RecommendAlgorithm373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373recommendAlgorithm373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373recommendAlgorithm373 = value
        AppToast.show(this, "Recommend Algorithm373: $value")
    }
// v373: Data Usage Limit373


internal fun PlayerActivity.showV373DataUsageLimit373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373dataUsageLimit373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373dataUsageLimit373 = value
        AppToast.show(this, "Data Usage Limit373: $value")
    }
// v374: Caption Font Size374


internal fun PlayerActivity.showV374CaptionFontSize374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374captionFontSize374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374captionFontSize374 = value
        AppToast.show(this, "Caption Font Size374: $value")
    }
// v374: Caption Position374


internal fun PlayerActivity.showV374CaptionPosition374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374captionPosition374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374captionPosition374 = value
        AppToast.show(this, "Caption Position374: $value")
    }
// v374: Chromecast Quality374


internal fun PlayerActivity.showV374ChromecastQuality374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374chromecastQuality374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374chromecastQuality374 = value
        AppToast.show(this, "Chromecast Quality374: $value")
    }
// v374: Floating Window Size374


internal fun PlayerActivity.showV374FloatingWindowSize374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374floatingWindowSize374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374floatingWindowSize374 = value
        AppToast.show(this, "Floating Window Size374: $value")
    }
// v374: Recommend Algorithm374


internal fun PlayerActivity.showV374RecommendAlgorithm374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374recommendAlgorithm374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374recommendAlgorithm374 = value
        AppToast.show(this, "Recommend Algorithm374: $value")
    }
// v374: Data Usage Limit374


internal fun PlayerActivity.showV374DataUsageLimit374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374dataUsageLimit374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374dataUsageLimit374 = value
        AppToast.show(this, "Data Usage Limit374: $value")
    }
// v375: Caption Font Size375


internal fun PlayerActivity.showV375CaptionFontSize375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375captionFontSize375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375captionFontSize375 = value
        AppToast.show(this, "Caption Font Size375: $value")
    }
// v375: Caption Position375


internal fun PlayerActivity.showV375CaptionPosition375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375captionPosition375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375captionPosition375 = value
        AppToast.show(this, "Caption Position375: $value")
    }
// v375: Chromecast Quality375


internal fun PlayerActivity.showV375ChromecastQuality375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375chromecastQuality375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375chromecastQuality375 = value
        AppToast.show(this, "Chromecast Quality375: $value")
    }
// v375: Floating Window Size375


internal fun PlayerActivity.showV375FloatingWindowSize375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375floatingWindowSize375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375floatingWindowSize375 = value
        AppToast.show(this, "Floating Window Size375: $value")
    }
// v375: Recommend Algorithm375


internal fun PlayerActivity.showV375RecommendAlgorithm375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375recommendAlgorithm375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375recommendAlgorithm375 = value
        AppToast.show(this, "Recommend Algorithm375: $value")
    }
// v375: Data Usage Limit375


internal fun PlayerActivity.showV375DataUsageLimit375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375dataUsageLimit375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375dataUsageLimit375 = value
        AppToast.show(this, "Data Usage Limit375: $value")
    }
// v376: Caption Font Size376


internal fun PlayerActivity.showV376CaptionFontSize376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376captionFontSize376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376captionFontSize376 = value
        AppToast.show(this, "Caption Font Size376: $value")
    }
// v376: Caption Position376


internal fun PlayerActivity.showV376CaptionPosition376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376captionPosition376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376captionPosition376 = value
        AppToast.show(this, "Caption Position376: $value")
    }
// v376: Chromecast Quality376


internal fun PlayerActivity.showV376ChromecastQuality376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376chromecastQuality376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376chromecastQuality376 = value
        AppToast.show(this, "Chromecast Quality376: $value")
    }
// v376: Floating Window Size376


internal fun PlayerActivity.showV376FloatingWindowSize376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376floatingWindowSize376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376floatingWindowSize376 = value
        AppToast.show(this, "Floating Window Size376: $value")
    }
// v376: Recommend Algorithm376


internal fun PlayerActivity.showV376RecommendAlgorithm376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376recommendAlgorithm376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376recommendAlgorithm376 = value
        AppToast.show(this, "Recommend Algorithm376: $value")
    }
// v376: Data Usage Limit376


internal fun PlayerActivity.showV376DataUsageLimit376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376dataUsageLimit376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376dataUsageLimit376 = value
        AppToast.show(this, "Data Usage Limit376: $value")
    }
// v377: Caption Font Size377


internal fun PlayerActivity.showV377CaptionFontSize377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377captionFontSize377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377captionFontSize377 = value
        AppToast.show(this, "Caption Font Size377: $value")
    }
// v377: Caption Position377


internal fun PlayerActivity.showV377CaptionPosition377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377captionPosition377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377captionPosition377 = value
        AppToast.show(this, "Caption Position377: $value")
    }
// v377: Chromecast Quality377


internal fun PlayerActivity.showV377ChromecastQuality377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377chromecastQuality377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377chromecastQuality377 = value
        AppToast.show(this, "Chromecast Quality377: $value")
    }
// v377: Floating Window Size377


internal fun PlayerActivity.showV377FloatingWindowSize377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377floatingWindowSize377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377floatingWindowSize377 = value
        AppToast.show(this, "Floating Window Size377: $value")
    }
// v377: Recommend Algorithm377


internal fun PlayerActivity.showV377RecommendAlgorithm377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377recommendAlgorithm377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377recommendAlgorithm377 = value
        AppToast.show(this, "Recommend Algorithm377: $value")
    }
// v377: Data Usage Limit377


internal fun PlayerActivity.showV377DataUsageLimit377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377dataUsageLimit377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377dataUsageLimit377 = value
        AppToast.show(this, "Data Usage Limit377: $value")
    }
// v378: Caption Font Size378


internal fun PlayerActivity.showV378CaptionFontSize378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378captionFontSize378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378captionFontSize378 = value
        AppToast.show(this, "Caption Font Size378: $value")
    }
// v378: Caption Position378


internal fun PlayerActivity.showV378CaptionPosition378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378captionPosition378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378captionPosition378 = value
        AppToast.show(this, "Caption Position378: $value")
    }
// v378: Chromecast Quality378


internal fun PlayerActivity.showV378ChromecastQuality378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378chromecastQuality378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378chromecastQuality378 = value
        AppToast.show(this, "Chromecast Quality378: $value")
    }
// v378: Floating Window Size378


internal fun PlayerActivity.showV378FloatingWindowSize378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378floatingWindowSize378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378floatingWindowSize378 = value
        AppToast.show(this, "Floating Window Size378: $value")
    }
// v378: Recommend Algorithm378


internal fun PlayerActivity.showV378RecommendAlgorithm378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378recommendAlgorithm378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378recommendAlgorithm378 = value
        AppToast.show(this, "Recommend Algorithm378: $value")
    }
// v378: Data Usage Limit378


internal fun PlayerActivity.showV378DataUsageLimit378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378dataUsageLimit378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378dataUsageLimit378 = value
        AppToast.show(this, "Data Usage Limit378: $value")
    }
// v379: Caption Font Size379


internal fun PlayerActivity.showV379CaptionFontSize379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379captionFontSize379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379captionFontSize379 = value
        AppToast.show(this, "Caption Font Size379: $value")
    }
// v379: Caption Position379


internal fun PlayerActivity.showV379CaptionPosition379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379captionPosition379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379captionPosition379 = value
        AppToast.show(this, "Caption Position379: $value")
    }
// v379: Chromecast Quality379


internal fun PlayerActivity.showV379ChromecastQuality379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379chromecastQuality379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379chromecastQuality379 = value
        AppToast.show(this, "Chromecast Quality379: $value")
    }
// v379: Floating Window Size379


internal fun PlayerActivity.showV379FloatingWindowSize379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379floatingWindowSize379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379floatingWindowSize379 = value
        AppToast.show(this, "Floating Window Size379: $value")
    }
// v379: Recommend Algorithm379


internal fun PlayerActivity.showV379RecommendAlgorithm379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379recommendAlgorithm379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379recommendAlgorithm379 = value
        AppToast.show(this, "Recommend Algorithm379: $value")
    }
// v379: Data Usage Limit379


internal fun PlayerActivity.showV379DataUsageLimit379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379dataUsageLimit379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379dataUsageLimit379 = value
        AppToast.show(this, "Data Usage Limit379: $value")
    }
// v380: Caption Font Size380


internal fun PlayerActivity.showV380CaptionFontSize380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380captionFontSize380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380captionFontSize380 = value
        AppToast.show(this, "Caption Font Size380: $value")
    }
// v380: Caption Position380


internal fun PlayerActivity.showV380CaptionPosition380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380captionPosition380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380captionPosition380 = value
        AppToast.show(this, "Caption Position380: $value")
    }
// v380: Chromecast Quality380


internal fun PlayerActivity.showV380ChromecastQuality380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380chromecastQuality380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380chromecastQuality380 = value
        AppToast.show(this, "Chromecast Quality380: $value")
    }
// v380: Floating Window Size380


internal fun PlayerActivity.showV380FloatingWindowSize380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380floatingWindowSize380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380floatingWindowSize380 = value
        AppToast.show(this, "Floating Window Size380: $value")
    }
// v380: Recommend Algorithm380


internal fun PlayerActivity.showV380RecommendAlgorithm380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380recommendAlgorithm380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380recommendAlgorithm380 = value
        AppToast.show(this, "Recommend Algorithm380: $value")
    }
// v380: Data Usage Limit380


internal fun PlayerActivity.showV380DataUsageLimit380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380dataUsageLimit380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380dataUsageLimit380 = value
        AppToast.show(this, "Data Usage Limit380: $value")
    }
// v381: Grid Layout Columns381


internal fun PlayerActivity.showV381GridLayoutColumns381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381gridLayoutColumns381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381gridLayoutColumns381 = value
        AppToast.show(this, "Grid Layout Columns381: $value")
    }
// v381: Grid Layout Spacing381


internal fun PlayerActivity.showV381GridLayoutSpacing381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381gridLayoutSpacing381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381gridLayoutSpacing381 = value
        AppToast.show(this, "Grid Layout Spacing381: $value")
    }
// v381: Page Size Limit381


internal fun PlayerActivity.showV381PageSizeLimit381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381pageSizeLimit381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381pageSizeLimit381 = value
        AppToast.show(this, "Page Size Limit381: $value")
    }
// v381: Panel Position381


internal fun PlayerActivity.showV381PanelPosition381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381panelPosition381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381panelPosition381 = value
        AppToast.show(this, "Panel Position381: $value")
    }
// v381: SyncPlay Latency381


internal fun PlayerActivity.showV381SyncPlayLatency381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381syncPlayLatency381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381syncPlayLatency381 = value
        AppToast.show(this, "SyncPlay Latency381: $value")
    }
// v382: Grid Layout Columns382


internal fun PlayerActivity.showV382GridLayoutColumns382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382gridLayoutColumns382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382gridLayoutColumns382 = value
        AppToast.show(this, "Grid Layout Columns382: $value")
    }
// v382: Grid Layout Spacing382


internal fun PlayerActivity.showV382GridLayoutSpacing382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382gridLayoutSpacing382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382gridLayoutSpacing382 = value
        AppToast.show(this, "Grid Layout Spacing382: $value")
    }
// v382: Page Size Limit382


internal fun PlayerActivity.showV382PageSizeLimit382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382pageSizeLimit382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382pageSizeLimit382 = value
        AppToast.show(this, "Page Size Limit382: $value")
    }
// v382: Panel Position382


internal fun PlayerActivity.showV382PanelPosition382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382panelPosition382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382panelPosition382 = value
        AppToast.show(this, "Panel Position382: $value")
    }
// v382: SyncPlay Latency382


internal fun PlayerActivity.showV382SyncPlayLatency382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382syncPlayLatency382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382syncPlayLatency382 = value
        AppToast.show(this, "SyncPlay Latency382: $value")
    }
// v383: Grid Layout Columns383


internal fun PlayerActivity.showV383GridLayoutColumns383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383gridLayoutColumns383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383gridLayoutColumns383 = value
        AppToast.show(this, "Grid Layout Columns383: $value")
    }
// v383: Grid Layout Spacing383


internal fun PlayerActivity.showV383GridLayoutSpacing383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383gridLayoutSpacing383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383gridLayoutSpacing383 = value
        AppToast.show(this, "Grid Layout Spacing383: $value")
    }
// v383: Page Size Limit383


internal fun PlayerActivity.showV383PageSizeLimit383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383pageSizeLimit383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383pageSizeLimit383 = value
        AppToast.show(this, "Page Size Limit383: $value")
    }
// v383: Panel Position383


internal fun PlayerActivity.showV383PanelPosition383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383panelPosition383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383panelPosition383 = value
        AppToast.show(this, "Panel Position383: $value")
    }
// v383: SyncPlay Latency383


internal fun PlayerActivity.showV383SyncPlayLatency383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383syncPlayLatency383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383syncPlayLatency383 = value
        AppToast.show(this, "SyncPlay Latency383: $value")
    }
// v384: Grid Layout Columns384


internal fun PlayerActivity.showV384GridLayoutColumns384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384gridLayoutColumns384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384gridLayoutColumns384 = value
        AppToast.show(this, "Grid Layout Columns384: $value")
    }
// v384: Grid Layout Spacing384


internal fun PlayerActivity.showV384GridLayoutSpacing384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384gridLayoutSpacing384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384gridLayoutSpacing384 = value
        AppToast.show(this, "Grid Layout Spacing384: $value")
    }
// v384: Page Size Limit384


internal fun PlayerActivity.showV384PageSizeLimit384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384pageSizeLimit384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384pageSizeLimit384 = value
        AppToast.show(this, "Page Size Limit384: $value")
    }
// v384: Panel Position384


internal fun PlayerActivity.showV384PanelPosition384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384panelPosition384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384panelPosition384 = value
        AppToast.show(this, "Panel Position384: $value")
    }
// v384: SyncPlay Latency384


internal fun PlayerActivity.showV384SyncPlayLatency384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384syncPlayLatency384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384syncPlayLatency384 = value
        AppToast.show(this, "SyncPlay Latency384: $value")
    }
// v385: Grid Layout Columns385


internal fun PlayerActivity.showV385GridLayoutColumns385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385gridLayoutColumns385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385gridLayoutColumns385 = value
        AppToast.show(this, "Grid Layout Columns385: $value")
    }
// v385: Grid Layout Spacing385


internal fun PlayerActivity.showV385GridLayoutSpacing385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385gridLayoutSpacing385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385gridLayoutSpacing385 = value
        AppToast.show(this, "Grid Layout Spacing385: $value")
    }
// v385: Page Size Limit385


internal fun PlayerActivity.showV385PageSizeLimit385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385pageSizeLimit385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385pageSizeLimit385 = value
        AppToast.show(this, "Page Size Limit385: $value")
    }
// v385: Panel Position385


internal fun PlayerActivity.showV385PanelPosition385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385panelPosition385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385panelPosition385 = value
        AppToast.show(this, "Panel Position385: $value")
    }
// v385: SyncPlay Latency385


internal fun PlayerActivity.showV385SyncPlayLatency385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385syncPlayLatency385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385syncPlayLatency385 = value
        AppToast.show(this, "SyncPlay Latency385: $value")
    }
// v386: Grid Layout Columns386


internal fun PlayerActivity.showV386GridLayoutColumns386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386gridLayoutColumns386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386gridLayoutColumns386 = value
        AppToast.show(this, "Grid Layout Columns386: $value")
    }
// v386: Grid Layout Spacing386


internal fun PlayerActivity.showV386GridLayoutSpacing386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386gridLayoutSpacing386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386gridLayoutSpacing386 = value
        AppToast.show(this, "Grid Layout Spacing386: $value")
    }
// v386: Page Size Limit386


internal fun PlayerActivity.showV386PageSizeLimit386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386pageSizeLimit386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386pageSizeLimit386 = value
        AppToast.show(this, "Page Size Limit386: $value")
    }
// v386: Panel Position386


internal fun PlayerActivity.showV386PanelPosition386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386panelPosition386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386panelPosition386 = value
        AppToast.show(this, "Panel Position386: $value")
    }
// v386: SyncPlay Latency386


internal fun PlayerActivity.showV386SyncPlayLatency386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386syncPlayLatency386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386syncPlayLatency386 = value
        AppToast.show(this, "SyncPlay Latency386: $value")
    }
// v387: Grid Layout Columns387


internal fun PlayerActivity.showV387GridLayoutColumns387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387gridLayoutColumns387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387gridLayoutColumns387 = value
        AppToast.show(this, "Grid Layout Columns387: $value")
    }
// v387: Grid Layout Spacing387


internal fun PlayerActivity.showV387GridLayoutSpacing387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387gridLayoutSpacing387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387gridLayoutSpacing387 = value
        AppToast.show(this, "Grid Layout Spacing387: $value")
    }
// v387: Page Size Limit387


internal fun PlayerActivity.showV387PageSizeLimit387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387pageSizeLimit387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387pageSizeLimit387 = value
        AppToast.show(this, "Page Size Limit387: $value")
    }
// v387: Panel Position387


internal fun PlayerActivity.showV387PanelPosition387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387panelPosition387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387panelPosition387 = value
        AppToast.show(this, "Panel Position387: $value")
    }
// v387: SyncPlay Latency387


internal fun PlayerActivity.showV387SyncPlayLatency387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387syncPlayLatency387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387syncPlayLatency387 = value
        AppToast.show(this, "SyncPlay Latency387: $value")
    }
// v388: Grid Layout Columns388


internal fun PlayerActivity.showV388GridLayoutColumns388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388gridLayoutColumns388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388gridLayoutColumns388 = value
        AppToast.show(this, "Grid Layout Columns388: $value")
    }
// v388: Grid Layout Spacing388


internal fun PlayerActivity.showV388GridLayoutSpacing388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388gridLayoutSpacing388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388gridLayoutSpacing388 = value
        AppToast.show(this, "Grid Layout Spacing388: $value")
    }
// v388: Page Size Limit388


internal fun PlayerActivity.showV388PageSizeLimit388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388pageSizeLimit388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388pageSizeLimit388 = value
        AppToast.show(this, "Page Size Limit388: $value")
    }
// v388: Panel Position388


internal fun PlayerActivity.showV388PanelPosition388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388panelPosition388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388panelPosition388 = value
        AppToast.show(this, "Panel Position388: $value")
    }
// v388: SyncPlay Latency388


internal fun PlayerActivity.showV388SyncPlayLatency388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388syncPlayLatency388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388syncPlayLatency388 = value
        AppToast.show(this, "SyncPlay Latency388: $value")
    }
// v389: Grid Layout Columns389


internal fun PlayerActivity.showV389GridLayoutColumns389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389gridLayoutColumns389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389gridLayoutColumns389 = value
        AppToast.show(this, "Grid Layout Columns389: $value")
    }
// v389: Grid Layout Spacing389


internal fun PlayerActivity.showV389GridLayoutSpacing389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389gridLayoutSpacing389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389gridLayoutSpacing389 = value
        AppToast.show(this, "Grid Layout Spacing389: $value")
    }
// v389: Page Size Limit389


internal fun PlayerActivity.showV389PageSizeLimit389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389pageSizeLimit389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389pageSizeLimit389 = value
        AppToast.show(this, "Page Size Limit389: $value")
    }
// v389: Panel Position389


internal fun PlayerActivity.showV389PanelPosition389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389panelPosition389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389panelPosition389 = value
        AppToast.show(this, "Panel Position389: $value")
    }
// v389: SyncPlay Latency389


internal fun PlayerActivity.showV389SyncPlayLatency389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389syncPlayLatency389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389syncPlayLatency389 = value
        AppToast.show(this, "SyncPlay Latency389: $value")
    }
// v390: Grid Layout Columns390


internal fun PlayerActivity.showV390GridLayoutColumns390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390gridLayoutColumns390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390gridLayoutColumns390 = value
        AppToast.show(this, "Grid Layout Columns390: $value")
    }
// v390: Grid Layout Spacing390


internal fun PlayerActivity.showV390GridLayoutSpacing390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390gridLayoutSpacing390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390gridLayoutSpacing390 = value
        AppToast.show(this, "Grid Layout Spacing390: $value")
    }
// v390: Page Size Limit390


internal fun PlayerActivity.showV390PageSizeLimit390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390pageSizeLimit390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390pageSizeLimit390 = value
        AppToast.show(this, "Page Size Limit390: $value")
    }
// v390: Panel Position390


internal fun PlayerActivity.showV390PanelPosition390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390panelPosition390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390panelPosition390 = value
        AppToast.show(this, "Panel Position390: $value")
    }
// v390: SyncPlay Latency390


internal fun PlayerActivity.showV390SyncPlayLatency390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390syncPlayLatency390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390syncPlayLatency390 = value
        AppToast.show(this, "SyncPlay Latency390: $value")
    }
// v391: AI Content Analysis391


internal fun PlayerActivity.showV391AiContentAnalysis391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391aiContentAnalysis391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391aiContentAnalysis391 = value
        AppToast.show(this, "AI Content Analysis391: $value")
    }
// v391: Banner Position391


internal fun PlayerActivity.showV391BannerPosition391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391bannerPosition391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391bannerPosition391 = value
        AppToast.show(this, "Banner Position391: $value")
    }
// v391: Batch Download Limit391


internal fun PlayerActivity.showV391BatchDownloadLimit391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391batchDownloadLimit391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391batchDownloadLimit391 = value
        AppToast.show(this, "Batch Download Limit391: $value")
    }
// v391: Buffer Prefetch Size391


internal fun PlayerActivity.showV391BufferPrefetchSize391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391bufferPrefetchSize391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391bufferPrefetchSize391 = value
        AppToast.show(this, "Buffer Prefetch Size391: $value")
    }
// v391: Card Layout Style391


internal fun PlayerActivity.showV391CardLayoutStyle391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391cardLayoutStyle391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391cardLayoutStyle391 = value
        AppToast.show(this, "Card Layout Style391: $value")
    }
// v392: AI Content Analysis392


internal fun PlayerActivity.showV392AiContentAnalysis392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392aiContentAnalysis392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392aiContentAnalysis392 = value
        AppToast.show(this, "AI Content Analysis392: $value")
    }
// v392: Banner Position392


internal fun PlayerActivity.showV392BannerPosition392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392bannerPosition392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392bannerPosition392 = value
        AppToast.show(this, "Banner Position392: $value")
    }
// v392: Batch Download Limit392


internal fun PlayerActivity.showV392BatchDownloadLimit392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392batchDownloadLimit392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392batchDownloadLimit392 = value
        AppToast.show(this, "Batch Download Limit392: $value")
    }
// v392: Buffer Prefetch Size392


internal fun PlayerActivity.showV392BufferPrefetchSize392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392bufferPrefetchSize392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392bufferPrefetchSize392 = value
        AppToast.show(this, "Buffer Prefetch Size392: $value")
    }
// v392: Card Layout Style392


internal fun PlayerActivity.showV392CardLayoutStyle392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392cardLayoutStyle392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392cardLayoutStyle392 = value
        AppToast.show(this, "Card Layout Style392: $value")
    }
// v393: AI Content Analysis393


internal fun PlayerActivity.showV393AiContentAnalysis393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393aiContentAnalysis393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393aiContentAnalysis393 = value
        AppToast.show(this, "AI Content Analysis393: $value")
    }
// v393: Banner Position393


internal fun PlayerActivity.showV393BannerPosition393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393bannerPosition393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393bannerPosition393 = value
        AppToast.show(this, "Banner Position393: $value")
    }
// v393: Batch Download Limit393


internal fun PlayerActivity.showV393BatchDownloadLimit393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393batchDownloadLimit393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393batchDownloadLimit393 = value
        AppToast.show(this, "Batch Download Limit393: $value")
    }
// v393: Buffer Prefetch Size393


internal fun PlayerActivity.showV393BufferPrefetchSize393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393bufferPrefetchSize393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393bufferPrefetchSize393 = value
        AppToast.show(this, "Buffer Prefetch Size393: $value")
    }
// v393: Card Layout Style393


internal fun PlayerActivity.showV393CardLayoutStyle393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393cardLayoutStyle393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393cardLayoutStyle393 = value
        AppToast.show(this, "Card Layout Style393: $value")
    }
// v394: AI Content Analysis394


internal fun PlayerActivity.showV394AiContentAnalysis394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394aiContentAnalysis394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394aiContentAnalysis394 = value
        AppToast.show(this, "AI Content Analysis394: $value")
    }
// v394: Banner Position394


internal fun PlayerActivity.showV394BannerPosition394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394bannerPosition394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394bannerPosition394 = value
        AppToast.show(this, "Banner Position394: $value")
    }
// v394: Batch Download Limit394


internal fun PlayerActivity.showV394BatchDownloadLimit394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394batchDownloadLimit394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394batchDownloadLimit394 = value
        AppToast.show(this, "Batch Download Limit394: $value")
    }
// v394: Buffer Prefetch Size394


internal fun PlayerActivity.showV394BufferPrefetchSize394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394bufferPrefetchSize394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394bufferPrefetchSize394 = value
        AppToast.show(this, "Buffer Prefetch Size394: $value")
    }
// v394: Card Layout Style394


internal fun PlayerActivity.showV394CardLayoutStyle394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394cardLayoutStyle394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394cardLayoutStyle394 = value
        AppToast.show(this, "Card Layout Style394: $value")
    }
// v395: AI Content Analysis395


internal fun PlayerActivity.showV395AiContentAnalysis395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395aiContentAnalysis395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395aiContentAnalysis395 = value
        AppToast.show(this, "AI Content Analysis395: $value")
    }
// v395: Banner Position395


internal fun PlayerActivity.showV395BannerPosition395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395bannerPosition395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395bannerPosition395 = value
        AppToast.show(this, "Banner Position395: $value")
    }
// v395: Batch Download Limit395


internal fun PlayerActivity.showV395BatchDownloadLimit395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395batchDownloadLimit395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395batchDownloadLimit395 = value
        AppToast.show(this, "Batch Download Limit395: $value")
    }
// v395: Buffer Prefetch Size395


internal fun PlayerActivity.showV395BufferPrefetchSize395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395bufferPrefetchSize395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395bufferPrefetchSize395 = value
        AppToast.show(this, "Buffer Prefetch Size395: $value")
    }
// v395: Card Layout Style395


internal fun PlayerActivity.showV395CardLayoutStyle395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395cardLayoutStyle395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395cardLayoutStyle395 = value
        AppToast.show(this, "Card Layout Style395: $value")
    }
// v396: AI Content Analysis396


internal fun PlayerActivity.showV396AiContentAnalysis396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396aiContentAnalysis396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396aiContentAnalysis396 = value
        AppToast.show(this, "AI Content Analysis396: $value")
    }
// v396: Banner Position396


internal fun PlayerActivity.showV396BannerPosition396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396bannerPosition396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396bannerPosition396 = value
        AppToast.show(this, "Banner Position396: $value")
    }
// v396: Batch Download Limit396


internal fun PlayerActivity.showV396BatchDownloadLimit396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396batchDownloadLimit396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396batchDownloadLimit396 = value
        AppToast.show(this, "Batch Download Limit396: $value")
    }
// v396: Buffer Prefetch Size396


internal fun PlayerActivity.showV396BufferPrefetchSize396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396bufferPrefetchSize396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396bufferPrefetchSize396 = value
        AppToast.show(this, "Buffer Prefetch Size396: $value")
    }
// v396: Card Layout Style396


internal fun PlayerActivity.showV396CardLayoutStyle396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396cardLayoutStyle396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396cardLayoutStyle396 = value
        AppToast.show(this, "Card Layout Style396: $value")
    }
// v397: AI Content Analysis397


internal fun PlayerActivity.showV397AiContentAnalysis397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397aiContentAnalysis397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397aiContentAnalysis397 = value
        AppToast.show(this, "AI Content Analysis397: $value")
    }
// v397: Banner Position397


internal fun PlayerActivity.showV397BannerPosition397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397bannerPosition397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397bannerPosition397 = value
        AppToast.show(this, "Banner Position397: $value")
    }
// v397: Batch Download Limit397


internal fun PlayerActivity.showV397BatchDownloadLimit397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397batchDownloadLimit397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397batchDownloadLimit397 = value
        AppToast.show(this, "Batch Download Limit397: $value")
    }
// v397: Buffer Prefetch Size397


internal fun PlayerActivity.showV397BufferPrefetchSize397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397bufferPrefetchSize397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397bufferPrefetchSize397 = value
        AppToast.show(this, "Buffer Prefetch Size397: $value")
    }
// v397: Card Layout Style397


internal fun PlayerActivity.showV397CardLayoutStyle397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397cardLayoutStyle397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397cardLayoutStyle397 = value
        AppToast.show(this, "Card Layout Style397: $value")
    }
// v398: AI Content Analysis398


internal fun PlayerActivity.showV398AiContentAnalysis398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398aiContentAnalysis398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398aiContentAnalysis398 = value
        AppToast.show(this, "AI Content Analysis398: $value")
    }
// v398: Banner Position398


internal fun PlayerActivity.showV398BannerPosition398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398bannerPosition398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398bannerPosition398 = value
        AppToast.show(this, "Banner Position398: $value")
    }
// v398: Batch Download Limit398


internal fun PlayerActivity.showV398BatchDownloadLimit398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398batchDownloadLimit398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398batchDownloadLimit398 = value
        AppToast.show(this, "Batch Download Limit398: $value")
    }
// v398: Buffer Prefetch Size398


internal fun PlayerActivity.showV398BufferPrefetchSize398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398bufferPrefetchSize398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398bufferPrefetchSize398 = value
        AppToast.show(this, "Buffer Prefetch Size398: $value")
    }
// v398: Card Layout Style398


internal fun PlayerActivity.showV398CardLayoutStyle398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398cardLayoutStyle398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398cardLayoutStyle398 = value
        AppToast.show(this, "Card Layout Style398: $value")
    }
// v399: AI Content Analysis399


internal fun PlayerActivity.showV399AiContentAnalysis399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399aiContentAnalysis399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399aiContentAnalysis399 = value
        AppToast.show(this, "AI Content Analysis399: $value")
    }
// v399: Banner Position399


internal fun PlayerActivity.showV399BannerPosition399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399bannerPosition399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399bannerPosition399 = value
        AppToast.show(this, "Banner Position399: $value")
    }
// v399: Batch Download Limit399


internal fun PlayerActivity.showV399BatchDownloadLimit399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399batchDownloadLimit399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399batchDownloadLimit399 = value
        AppToast.show(this, "Batch Download Limit399: $value")
    }
// v399: Buffer Prefetch Size399


internal fun PlayerActivity.showV399BufferPrefetchSize399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399bufferPrefetchSize399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399bufferPrefetchSize399 = value
        AppToast.show(this, "Buffer Prefetch Size399: $value")
    }
// v399: Card Layout Style399


internal fun PlayerActivity.showV399CardLayoutStyle399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399cardLayoutStyle399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399cardLayoutStyle399 = value
        AppToast.show(this, "Card Layout Style399: $value")
    }
// v400: AI Content Analysis400


internal fun PlayerActivity.showV400AiContentAnalysis400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400aiContentAnalysis400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400aiContentAnalysis400 = value
        AppToast.show(this, "AI Content Analysis400: $value")
    }
// v400: Banner Position400


internal fun PlayerActivity.showV400BannerPosition400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400bannerPosition400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400bannerPosition400 = value
        AppToast.show(this, "Banner Position400: $value")
    }
// v400: Batch Download Limit400


internal fun PlayerActivity.showV400BatchDownloadLimit400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400batchDownloadLimit400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400batchDownloadLimit400 = value
        AppToast.show(this, "Batch Download Limit400: $value")
    }
// v400: Buffer Prefetch Size400


internal fun PlayerActivity.showV400BufferPrefetchSize400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400bufferPrefetchSize400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400bufferPrefetchSize400 = value
        AppToast.show(this, "Buffer Prefetch Size400: $value")
    }
// v400: Card Layout Style400


internal fun PlayerActivity.showV400CardLayoutStyle400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400cardLayoutStyle400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400cardLayoutStyle400 = value
        AppToast.show(this, "Card Layout Style400: $value")
    }
// v401: Cloud Storage Limit401


internal fun PlayerActivity.showV401CloudStorageLimit401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401cloudStorageLimit401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401cloudStorageLimit401 = value
        AppToast.show(this, "Cloud Storage Limit401: $value")
    }
// v401: Dashboard Widget Layout401


internal fun PlayerActivity.showV401DashboardWidgetLayout401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401dashboardWidgetLayout401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401dashboardWidgetLayout401 = value
        AppToast.show(this, "Dashboard Widget Layout401: $value")
    }
// v401: Default Player Engine401


internal fun PlayerActivity.showV401DefaultPlayerEngine401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401defaultPlayerEngine401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401defaultPlayerEngine401 = value
        AppToast.show(this, "Default Player Engine401: $value")
    }
// v401: Delay Start Ms401


internal fun PlayerActivity.showV401DelayStartMs401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401delayStartMs401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401delayStartMs401 = value
        AppToast.show(this, "Delay Start Ms401: $value")
    }
// v402: Cloud Storage Limit402


internal fun PlayerActivity.showV402CloudStorageLimit402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402cloudStorageLimit402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402cloudStorageLimit402 = value
        AppToast.show(this, "Cloud Storage Limit402: $value")
    }
// v402: Dashboard Widget Layout402


internal fun PlayerActivity.showV402DashboardWidgetLayout402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402dashboardWidgetLayout402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402dashboardWidgetLayout402 = value
        AppToast.show(this, "Dashboard Widget Layout402: $value")
    }
// v402: Default Player Engine402


internal fun PlayerActivity.showV402DefaultPlayerEngine402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402defaultPlayerEngine402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402defaultPlayerEngine402 = value
        AppToast.show(this, "Default Player Engine402: $value")
    }
// v402: Delay Start Ms402


internal fun PlayerActivity.showV402DelayStartMs402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402delayStartMs402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402delayStartMs402 = value
        AppToast.show(this, "Delay Start Ms402: $value")
    }
// v403: Cloud Storage Limit403


internal fun PlayerActivity.showV403CloudStorageLimit403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403cloudStorageLimit403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403cloudStorageLimit403 = value
        AppToast.show(this, "Cloud Storage Limit403: $value")
    }
// v403: Dashboard Widget Layout403


internal fun PlayerActivity.showV403DashboardWidgetLayout403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403dashboardWidgetLayout403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403dashboardWidgetLayout403 = value
        AppToast.show(this, "Dashboard Widget Layout403: $value")
    }
// v403: Default Player Engine403


internal fun PlayerActivity.showV403DefaultPlayerEngine403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403defaultPlayerEngine403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403defaultPlayerEngine403 = value
        AppToast.show(this, "Default Player Engine403: $value")
    }
// v403: Delay Start Ms403


internal fun PlayerActivity.showV403DelayStartMs403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403delayStartMs403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403delayStartMs403 = value
        AppToast.show(this, "Delay Start Ms403: $value")
    }
// v404: Cloud Storage Limit404


internal fun PlayerActivity.showV404CloudStorageLimit404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404cloudStorageLimit404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404cloudStorageLimit404 = value
        AppToast.show(this, "Cloud Storage Limit404: $value")
    }
// v404: Dashboard Widget Layout404


internal fun PlayerActivity.showV404DashboardWidgetLayout404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404dashboardWidgetLayout404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404dashboardWidgetLayout404 = value
        AppToast.show(this, "Dashboard Widget Layout404: $value")
    }
// v404: Default Player Engine404


internal fun PlayerActivity.showV404DefaultPlayerEngine404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404defaultPlayerEngine404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404defaultPlayerEngine404 = value
        AppToast.show(this, "Default Player Engine404: $value")
    }
// v404: Delay Start Ms404


internal fun PlayerActivity.showV404DelayStartMs404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404delayStartMs404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404delayStartMs404 = value
        AppToast.show(this, "Delay Start Ms404: $value")
    }
// v405: Cloud Storage Limit405


internal fun PlayerActivity.showV405CloudStorageLimit405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405cloudStorageLimit405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405cloudStorageLimit405 = value
        AppToast.show(this, "Cloud Storage Limit405: $value")
    }
// v405: Dashboard Widget Layout405


internal fun PlayerActivity.showV405DashboardWidgetLayout405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405dashboardWidgetLayout405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405dashboardWidgetLayout405 = value
        AppToast.show(this, "Dashboard Widget Layout405: $value")
    }
// v405: Default Player Engine405


internal fun PlayerActivity.showV405DefaultPlayerEngine405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405defaultPlayerEngine405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405defaultPlayerEngine405 = value
        AppToast.show(this, "Default Player Engine405: $value")
    }
// v405: Delay Start Ms405


internal fun PlayerActivity.showV405DelayStartMs405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405delayStartMs405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405delayStartMs405 = value
        AppToast.show(this, "Delay Start Ms405: $value")
    }
// v406: Cloud Storage Limit406


internal fun PlayerActivity.showV406CloudStorageLimit406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406cloudStorageLimit406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406cloudStorageLimit406 = value
        AppToast.show(this, "Cloud Storage Limit406: $value")
    }
// v406: Dashboard Widget Layout406


internal fun PlayerActivity.showV406DashboardWidgetLayout406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406dashboardWidgetLayout406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406dashboardWidgetLayout406 = value
        AppToast.show(this, "Dashboard Widget Layout406: $value")
    }
// v406: Default Player Engine406


internal fun PlayerActivity.showV406DefaultPlayerEngine406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406defaultPlayerEngine406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406defaultPlayerEngine406 = value
        AppToast.show(this, "Default Player Engine406: $value")
    }
// v406: Delay Start Ms406


internal fun PlayerActivity.showV406DelayStartMs406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406delayStartMs406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406delayStartMs406 = value
        AppToast.show(this, "Delay Start Ms406: $value")
    }
// v407: Cloud Storage Limit407


internal fun PlayerActivity.showV407CloudStorageLimit407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407cloudStorageLimit407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407cloudStorageLimit407 = value
        AppToast.show(this, "Cloud Storage Limit407: $value")
    }
// v407: Dashboard Widget Layout407


internal fun PlayerActivity.showV407DashboardWidgetLayout407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407dashboardWidgetLayout407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407dashboardWidgetLayout407 = value
        AppToast.show(this, "Dashboard Widget Layout407: $value")
    }
// v407: Default Player Engine407


internal fun PlayerActivity.showV407DefaultPlayerEngine407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407defaultPlayerEngine407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407defaultPlayerEngine407 = value
        AppToast.show(this, "Default Player Engine407: $value")
    }
// v407: Delay Start Ms407


internal fun PlayerActivity.showV407DelayStartMs407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407delayStartMs407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407delayStartMs407 = value
        AppToast.show(this, "Delay Start Ms407: $value")
    }
// v408: Cloud Storage Limit408


internal fun PlayerActivity.showV408CloudStorageLimit408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408cloudStorageLimit408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408cloudStorageLimit408 = value
        AppToast.show(this, "Cloud Storage Limit408: $value")
    }
// v408: Dashboard Widget Layout408


internal fun PlayerActivity.showV408DashboardWidgetLayout408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408dashboardWidgetLayout408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408dashboardWidgetLayout408 = value
        AppToast.show(this, "Dashboard Widget Layout408: $value")
    }
// v408: Default Player Engine408


internal fun PlayerActivity.showV408DefaultPlayerEngine408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408defaultPlayerEngine408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408defaultPlayerEngine408 = value
        AppToast.show(this, "Default Player Engine408: $value")
    }
// v408: Delay Start Ms408


internal fun PlayerActivity.showV408DelayStartMs408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408delayStartMs408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408delayStartMs408 = value
        AppToast.show(this, "Delay Start Ms408: $value")
    }
// v409: Cloud Storage Limit409


internal fun PlayerActivity.showV409CloudStorageLimit409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409cloudStorageLimit409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409cloudStorageLimit409 = value
        AppToast.show(this, "Cloud Storage Limit409: $value")
    }
// v409: Dashboard Widget Layout409


internal fun PlayerActivity.showV409DashboardWidgetLayout409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409dashboardWidgetLayout409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409dashboardWidgetLayout409 = value
        AppToast.show(this, "Dashboard Widget Layout409: $value")
    }
// v409: Default Player Engine409


internal fun PlayerActivity.showV409DefaultPlayerEngine409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409defaultPlayerEngine409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409defaultPlayerEngine409 = value
        AppToast.show(this, "Default Player Engine409: $value")
    }
// v409: Delay Start Ms409


internal fun PlayerActivity.showV409DelayStartMs409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409delayStartMs409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409delayStartMs409 = value
        AppToast.show(this, "Delay Start Ms409: $value")
    }
// v410: Cloud Storage Limit410


internal fun PlayerActivity.showV410CloudStorageLimit410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410cloudStorageLimit410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410cloudStorageLimit410 = value
        AppToast.show(this, "Cloud Storage Limit410: $value")
    }
// v410: Dashboard Widget Layout410


internal fun PlayerActivity.showV410DashboardWidgetLayout410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410dashboardWidgetLayout410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410dashboardWidgetLayout410 = value
        AppToast.show(this, "Dashboard Widget Layout410: $value")
    }
// v410: Default Player Engine410


internal fun PlayerActivity.showV410DefaultPlayerEngine410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410defaultPlayerEngine410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410defaultPlayerEngine410 = value
        AppToast.show(this, "Default Player Engine410: $value")
    }
// v410: Delay Start Ms410


internal fun PlayerActivity.showV410DelayStartMs410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410delayStartMs410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410delayStartMs410 = value
        AppToast.show(this, "Delay Start Ms410: $value")
    }
// v411: Display Refresh Rate411


internal fun PlayerActivity.showV411DisplayRefreshRate411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayRefreshRate411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayRefreshRate411 = value
        AppToast.show(this, "Display Refresh Rate411: $value")
    }
// v411: Display Color Temp411


internal fun PlayerActivity.showV411DisplayColorTemp411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayColorTemp411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayColorTemp411 = value
        AppToast.show(this, "Display Color Temp411: $value")
    }
// v411: Encode Auto Select411


internal fun PlayerActivity.showV411EncodeAutoSelect411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411encodeAutoSelect411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411encodeAutoSelect411 = value
        AppToast.show(this, "Encode Auto Select411: $value")
    }
// v412: Display Refresh Rate412


internal fun PlayerActivity.showV412DisplayRefreshRate412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayRefreshRate412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayRefreshRate412 = value
        AppToast.show(this, "Display Refresh Rate412: $value")
    }
// v412: Display Color Temp412


internal fun PlayerActivity.showV412DisplayColorTemp412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayColorTemp412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayColorTemp412 = value
        AppToast.show(this, "Display Color Temp412: $value")
    }
// v412: Encode Auto Select412




