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

internal fun PlayerActivity.showV668CoreAutoAffinity668Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v668coreAutoAffinity668).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity668",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v668coreAutoAffinity668 = value
        AppToast.show(this, "Core Auto Affinity668: $value")
    }
// v669: Control Auto Hide669


internal fun PlayerActivity.showV669ControlAutoHide669Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v669controlAutoHide669).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide669",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v669controlAutoHide669 = value
        AppToast.show(this, "Control Auto Hide669: $value")
    }
// v669: Core Auto Affinity669


internal fun PlayerActivity.showV669CoreAutoAffinity669Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v669coreAutoAffinity669).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity669",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v669coreAutoAffinity669 = value
        AppToast.show(this, "Core Auto Affinity669: $value")
    }
// v670: Control Auto Hide670


internal fun PlayerActivity.showV670ControlAutoHide670Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v670controlAutoHide670).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide670",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v670controlAutoHide670 = value
        AppToast.show(this, "Control Auto Hide670: $value")
    }
// v670: Core Auto Affinity670


internal fun PlayerActivity.showV670CoreAutoAffinity670Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v670coreAutoAffinity670).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity670",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v670coreAutoAffinity670 = value
        AppToast.show(this, "Core Auto Affinity670: $value")
    }
// v671: Cycle Auto Repeat671


internal fun PlayerActivity.showV671CycleAutoRepeat671Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v671cycleAutoRepeat671).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat671",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v671cycleAutoRepeat671 = value
        AppToast.show(this, "Cycle Auto Repeat671: $value")
    }
// v671: Decode Auto Codec671


internal fun PlayerActivity.showV671DecodeAutoCodec671Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v671decodeAutoCodec671).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec671",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v671decodeAutoCodec671 = value
        AppToast.show(this, "Decode Auto Codec671: $value")
    }
// v672: Cycle Auto Repeat672


internal fun PlayerActivity.showV672CycleAutoRepeat672Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v672cycleAutoRepeat672).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat672",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v672cycleAutoRepeat672 = value
        AppToast.show(this, "Cycle Auto Repeat672: $value")
    }
// v672: Decode Auto Codec672


internal fun PlayerActivity.showV672DecodeAutoCodec672Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v672decodeAutoCodec672).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec672",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v672decodeAutoCodec672 = value
        AppToast.show(this, "Decode Auto Codec672: $value")
    }
// v673: Cycle Auto Repeat673


internal fun PlayerActivity.showV673CycleAutoRepeat673Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v673cycleAutoRepeat673).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat673",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v673cycleAutoRepeat673 = value
        AppToast.show(this, "Cycle Auto Repeat673: $value")
    }
// v673: Decode Auto Codec673


internal fun PlayerActivity.showV673DecodeAutoCodec673Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v673decodeAutoCodec673).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec673",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v673decodeAutoCodec673 = value
        AppToast.show(this, "Decode Auto Codec673: $value")
    }
// v674: Cycle Auto Repeat674


internal fun PlayerActivity.showV674CycleAutoRepeat674Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v674cycleAutoRepeat674).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat674",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v674cycleAutoRepeat674 = value
        AppToast.show(this, "Cycle Auto Repeat674: $value")
    }
// v674: Decode Auto Codec674


internal fun PlayerActivity.showV674DecodeAutoCodec674Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v674decodeAutoCodec674).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec674",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v674decodeAutoCodec674 = value
        AppToast.show(this, "Decode Auto Codec674: $value")
    }
// v675: Cycle Auto Repeat675


internal fun PlayerActivity.showV675CycleAutoRepeat675Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v675cycleAutoRepeat675).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat675",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v675cycleAutoRepeat675 = value
        AppToast.show(this, "Cycle Auto Repeat675: $value")
    }
// v675: Decode Auto Codec675


internal fun PlayerActivity.showV675DecodeAutoCodec675Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v675decodeAutoCodec675).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec675",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v675decodeAutoCodec675 = value
        AppToast.show(this, "Decode Auto Codec675: $value")
    }
// v676: Cycle Auto Repeat676


internal fun PlayerActivity.showV676CycleAutoRepeat676Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v676cycleAutoRepeat676).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat676",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v676cycleAutoRepeat676 = value
        AppToast.show(this, "Cycle Auto Repeat676: $value")
    }
// v676: Decode Auto Codec676


internal fun PlayerActivity.showV676DecodeAutoCodec676Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v676decodeAutoCodec676).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec676",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v676decodeAutoCodec676 = value
        AppToast.show(this, "Decode Auto Codec676: $value")
    }
// v677: Cycle Auto Repeat677


internal fun PlayerActivity.showV677CycleAutoRepeat677Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v677cycleAutoRepeat677).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat677",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v677cycleAutoRepeat677 = value
        AppToast.show(this, "Cycle Auto Repeat677: $value")
    }
// v677: Decode Auto Codec677


internal fun PlayerActivity.showV677DecodeAutoCodec677Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v677decodeAutoCodec677).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec677",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v677decodeAutoCodec677 = value
        AppToast.show(this, "Decode Auto Codec677: $value")
    }
// v678: Cycle Auto Repeat678


internal fun PlayerActivity.showV678CycleAutoRepeat678Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v678cycleAutoRepeat678).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat678",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v678cycleAutoRepeat678 = value
        AppToast.show(this, "Cycle Auto Repeat678: $value")
    }
// v678: Decode Auto Codec678


internal fun PlayerActivity.showV678DecodeAutoCodec678Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v678decodeAutoCodec678).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec678",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v678decodeAutoCodec678 = value
        AppToast.show(this, "Decode Auto Codec678: $value")
    }
// v679: Cycle Auto Repeat679


internal fun PlayerActivity.showV679CycleAutoRepeat679Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v679cycleAutoRepeat679).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat679",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v679cycleAutoRepeat679 = value
        AppToast.show(this, "Cycle Auto Repeat679: $value")
    }
// v679: Decode Auto Codec679


internal fun PlayerActivity.showV679DecodeAutoCodec679Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v679decodeAutoCodec679).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec679",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v679decodeAutoCodec679 = value
        AppToast.show(this, "Decode Auto Codec679: $value")
    }
// v680: Cycle Auto Repeat680


internal fun PlayerActivity.showV680CycleAutoRepeat680Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v680cycleAutoRepeat680).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat680",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v680cycleAutoRepeat680 = value
        AppToast.show(this, "Cycle Auto Repeat680: $value")
    }
// v680: Decode Auto Codec680


internal fun PlayerActivity.showV680DecodeAutoCodec680Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v680decodeAutoCodec680).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec680",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v680decodeAutoCodec680 = value
        AppToast.show(this, "Decode Auto Codec680: $value")
    }
// v681: Desktop Auto Mode681


internal fun PlayerActivity.showV681DesktopAutoMode681Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v681desktopAutoMode681).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode681",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v681desktopAutoMode681 = value
        AppToast.show(this, "Desktop Auto Mode681: $value")
    }
// v682: Desktop Auto Mode682


internal fun PlayerActivity.showV682DesktopAutoMode682Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v682desktopAutoMode682).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode682",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v682desktopAutoMode682 = value
        AppToast.show(this, "Desktop Auto Mode682: $value")
    }
// v683: Desktop Auto Mode683


internal fun PlayerActivity.showV683DesktopAutoMode683Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v683desktopAutoMode683).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode683",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v683desktopAutoMode683 = value
        AppToast.show(this, "Desktop Auto Mode683: $value")
    }
// v684: Desktop Auto Mode684


internal fun PlayerActivity.showV684DesktopAutoMode684Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v684desktopAutoMode684).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode684",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v684desktopAutoMode684 = value
        AppToast.show(this, "Desktop Auto Mode684: $value")
    }
// v685: Desktop Auto Mode685


internal fun PlayerActivity.showV685DesktopAutoMode685Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v685desktopAutoMode685).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode685",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v685desktopAutoMode685 = value
        AppToast.show(this, "Desktop Auto Mode685: $value")
    }
// v686: Desktop Auto Mode686


internal fun PlayerActivity.showV686DesktopAutoMode686Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v686desktopAutoMode686).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode686",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v686desktopAutoMode686 = value
        AppToast.show(this, "Desktop Auto Mode686: $value")
    }
// v687: Desktop Auto Mode687


internal fun PlayerActivity.showV687DesktopAutoMode687Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v687desktopAutoMode687).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode687",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v687desktopAutoMode687 = value
        AppToast.show(this, "Desktop Auto Mode687: $value")
    }
// v688: Desktop Auto Mode688


internal fun PlayerActivity.showV688DesktopAutoMode688Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v688desktopAutoMode688).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode688",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v688desktopAutoMode688 = value
        AppToast.show(this, "Desktop Auto Mode688: $value")
    }
// v689: Desktop Auto Mode689


internal fun PlayerActivity.showV689DesktopAutoMode689Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v689desktopAutoMode689).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode689",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v689desktopAutoMode689 = value
        AppToast.show(this, "Desktop Auto Mode689: $value")
    }
// v690: Desktop Auto Mode690


internal fun PlayerActivity.showV690DesktopAutoMode690Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v690desktopAutoMode690).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode690",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v690desktopAutoMode690 = value
        AppToast.show(this, "Desktop Auto Mode690: $value")
    }
// v691: Display Auto Rotate691


internal fun PlayerActivity.showV691DisplayAutoRotate691Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v691displayAutoRotate691).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate691",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v691displayAutoRotate691 = value
        AppToast.show(this, "Display Auto Rotate691: $value")
    }
// v692: Display Auto Rotate692


internal fun PlayerActivity.showV692DisplayAutoRotate692Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v692displayAutoRotate692).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate692",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v692displayAutoRotate692 = value
        AppToast.show(this, "Display Auto Rotate692: $value")
    }
// v693: Display Auto Rotate693


internal fun PlayerActivity.showV693DisplayAutoRotate693Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v693displayAutoRotate693).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate693",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v693displayAutoRotate693 = value
        AppToast.show(this, "Display Auto Rotate693: $value")
    }
// v694: Display Auto Rotate694


internal fun PlayerActivity.showV694DisplayAutoRotate694Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v694displayAutoRotate694).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate694",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v694displayAutoRotate694 = value
        AppToast.show(this, "Display Auto Rotate694: $value")
    }
// v695: Display Auto Rotate695


internal fun PlayerActivity.showV695DisplayAutoRotate695Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v695displayAutoRotate695).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate695",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v695displayAutoRotate695 = value
        AppToast.show(this, "Display Auto Rotate695: $value")
    }
// v696: Display Auto Rotate696


internal fun PlayerActivity.showV696DisplayAutoRotate696Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v696displayAutoRotate696).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate696",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v696displayAutoRotate696 = value
        AppToast.show(this, "Display Auto Rotate696: $value")
    }
// v697: Display Auto Rotate697


internal fun PlayerActivity.showV697DisplayAutoRotate697Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v697displayAutoRotate697).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate697",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v697displayAutoRotate697 = value
        AppToast.show(this, "Display Auto Rotate697: $value")
    }
// v698: Display Auto Rotate698


internal fun PlayerActivity.showV698DisplayAutoRotate698Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v698displayAutoRotate698).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate698",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v698displayAutoRotate698 = value
        AppToast.show(this, "Display Auto Rotate698: $value")
    }
// v699: Display Auto Rotate699


internal fun PlayerActivity.showV699DisplayAutoRotate699Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v699displayAutoRotate699).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate699",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v699displayAutoRotate699 = value
        AppToast.show(this, "Display Auto Rotate699: $value")
    }
// v700: Display Auto Rotate700


internal fun PlayerActivity.showV700DisplayAutoRotate700Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v700displayAutoRotate700).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate700",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v700displayAutoRotate700 = value
        AppToast.show(this, "Display Auto Rotate700: $value")
    }





