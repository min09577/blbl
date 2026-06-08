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

// v981: Star Auto Favorite981
internal fun PlayerActivity.showV981StarAutoFavorite981Toggle() {
    val current = BiliClient.prefs.v981starAutoFavorite981
    BiliClient.prefs.v981starAutoFavorite981 = !current
    AppToast.show(this, "Star Auto Favorite981: ${if (!current) "ON" else "OFF"}")
}

// v981: Start Auto Launch981
internal fun PlayerActivity.showV981StartAutoLaunch981Toggle() {
    val current = BiliClient.prefs.v981startAutoLaunch981
    BiliClient.prefs.v981startAutoLaunch981 = !current
    AppToast.show(this, "Start Auto Launch981: ${if (!current) "ON" else "OFF"}")
}

// v981: State Auto Persist981
internal fun PlayerActivity.showV981StateAutoPersist981Toggle() {
    val current = BiliClient.prefs.v981stateAutoPersist981
    BiliClient.prefs.v981stateAutoPersist981 = !current
    AppToast.show(this, "State Auto Persist981: ${if (!current) "ON" else "OFF"}")
}

// v981: Static Auto Const981
internal fun PlayerActivity.showV981StaticAutoConst981Toggle() {
    val current = BiliClient.prefs.v981staticAutoConst981
    BiliClient.prefs.v981staticAutoConst981 = !current
    AppToast.show(this, "Static Auto Const981: ${if (!current) "ON" else "OFF"}")
}

// v981: Status Auto Badge981
internal fun PlayerActivity.showV981StatusAutoBadge981Toggle() {
    val current = BiliClient.prefs.v981statusAutoBadge981
    BiliClient.prefs.v981statusAutoBadge981 = !current
    AppToast.show(this, "Status Auto Badge981: ${if (!current) "ON" else "OFF"}")
}

// v981: Step Auto Guide981
internal fun PlayerActivity.showV981StepAutoGuide981Toggle() {
    val current = BiliClient.prefs.v981stepAutoGuide981
    BiliClient.prefs.v981stepAutoGuide981 = !current
    AppToast.show(this, "Step Auto Guide981: ${if (!current) "ON" else "OFF"}")
}

// v981: Stop Auto Cleanup981
internal fun PlayerActivity.showV981StopAutoCleanup981Toggle() {
    val current = BiliClient.prefs.v981stopAutoCleanup981
    BiliClient.prefs.v981stopAutoCleanup981 = !current
    AppToast.show(this, "Stop Auto Cleanup981: ${if (!current) "ON" else "OFF"}")
}

// v981: Storage Auto Quota981
internal fun PlayerActivity.showV981StorageAutoQuota981Toggle() {
    val current = BiliClient.prefs.v981storageAutoQuota981
    BiliClient.prefs.v981storageAutoQuota981 = !current
    AppToast.show(this, "Storage Auto Quota981: ${if (!current) "ON" else "OFF"}")
}

// v981: Store Auto Persist981
internal fun PlayerActivity.showV981StoreAutoPersist981Toggle() {
    val current = BiliClient.prefs.v981storeAutoPersist981
    BiliClient.prefs.v981storeAutoPersist981 = !current
    AppToast.show(this, "Store Auto Persist981: ${if (!current) "ON" else "OFF"}")
}

// v981: Stream Auto Buffer981
internal fun PlayerActivity.showV981StreamAutoBuffer981Toggle() {
    val current = BiliClient.prefs.v981streamAutoBuffer981
    BiliClient.prefs.v981streamAutoBuffer981 = !current
    AppToast.show(this, "Stream Auto Buffer981: ${if (!current) "ON" else "OFF"}")
}

// v981: Stretch Auto Fill981
internal fun PlayerActivity.showV981StretchAutoFill981Toggle() {
    val current = BiliClient.prefs.v981stretchAutoFill981
    BiliClient.prefs.v981stretchAutoFill981 = !current
    AppToast.show(this, "Stretch Auto Fill981: ${if (!current) "ON" else "OFF"}")
}

// v981: Strict Auto Mode981
internal fun PlayerActivity.showV981StrictAutoMode981Toggle() {
    val current = BiliClient.prefs.v981strictAutoMode981
    BiliClient.prefs.v981strictAutoMode981 = !current
    AppToast.show(this, "Strict Auto Mode981: ${if (!current) "ON" else "OFF"}")
}

// v981: String Auto Escape981
internal fun PlayerActivity.showV981StringAutoEscape981Toggle() {
    val current = BiliClient.prefs.v981stringAutoEscape981
    BiliClient.prefs.v981stringAutoEscape981 = !current
    AppToast.show(this, "String Auto Escape981: ${if (!current) "ON" else "OFF"}")
}

// v981: Strip Auto Whitespace981
internal fun PlayerActivity.showV981StripAutoWhitespace981Toggle() {
    val current = BiliClient.prefs.v981stripAutoWhitespace981
    BiliClient.prefs.v981stripAutoWhitespace981 = !current
    AppToast.show(this, "Strip Auto Whitespace981: ${if (!current) "ON" else "OFF"}")
}

// v981: Stroke Auto Width981
internal fun PlayerActivity.showV981StrokeAutoWidth981Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v981strokeAutoWidth981).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width981",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v981strokeAutoWidth981 = value
        AppToast.show(this, "Stroke Auto Width981: $value")
    }
}

// v982: Star Auto Favorite982
internal fun PlayerActivity.showV982StarAutoFavorite982Toggle() {
    val current = BiliClient.prefs.v982starAutoFavorite982
    BiliClient.prefs.v982starAutoFavorite982 = !current
    AppToast.show(this, "Star Auto Favorite982: ${if (!current) "ON" else "OFF"}")
}

// v982: Start Auto Launch982
internal fun PlayerActivity.showV982StartAutoLaunch982Toggle() {
    val current = BiliClient.prefs.v982startAutoLaunch982
    BiliClient.prefs.v982startAutoLaunch982 = !current
    AppToast.show(this, "Start Auto Launch982: ${if (!current) "ON" else "OFF"}")
}

// v982: State Auto Persist982
internal fun PlayerActivity.showV982StateAutoPersist982Toggle() {
    val current = BiliClient.prefs.v982stateAutoPersist982
    BiliClient.prefs.v982stateAutoPersist982 = !current
    AppToast.show(this, "State Auto Persist982: ${if (!current) "ON" else "OFF"}")
}

// v982: Static Auto Const982
internal fun PlayerActivity.showV982StaticAutoConst982Toggle() {
    val current = BiliClient.prefs.v982staticAutoConst982
    BiliClient.prefs.v982staticAutoConst982 = !current
    AppToast.show(this, "Static Auto Const982: ${if (!current) "ON" else "OFF"}")
}

// v982: Status Auto Badge982
internal fun PlayerActivity.showV982StatusAutoBadge982Toggle() {
    val current = BiliClient.prefs.v982statusAutoBadge982
    BiliClient.prefs.v982statusAutoBadge982 = !current
    AppToast.show(this, "Status Auto Badge982: ${if (!current) "ON" else "OFF"}")
}

// v982: Step Auto Guide982
internal fun PlayerActivity.showV982StepAutoGuide982Toggle() {
    val current = BiliClient.prefs.v982stepAutoGuide982
    BiliClient.prefs.v982stepAutoGuide982 = !current
    AppToast.show(this, "Step Auto Guide982: ${if (!current) "ON" else "OFF"}")
}

// v982: Stop Auto Cleanup982
internal fun PlayerActivity.showV982StopAutoCleanup982Toggle() {
    val current = BiliClient.prefs.v982stopAutoCleanup982
    BiliClient.prefs.v982stopAutoCleanup982 = !current
    AppToast.show(this, "Stop Auto Cleanup982: ${if (!current) "ON" else "OFF"}")
}

// v982: Storage Auto Quota982
internal fun PlayerActivity.showV982StorageAutoQuota982Toggle() {
    val current = BiliClient.prefs.v982storageAutoQuota982
    BiliClient.prefs.v982storageAutoQuota982 = !current
    AppToast.show(this, "Storage Auto Quota982: ${if (!current) "ON" else "OFF"}")
}

// v982: Store Auto Persist982
internal fun PlayerActivity.showV982StoreAutoPersist982Toggle() {
    val current = BiliClient.prefs.v982storeAutoPersist982
    BiliClient.prefs.v982storeAutoPersist982 = !current
    AppToast.show(this, "Store Auto Persist982: ${if (!current) "ON" else "OFF"}")
}

// v982: Stream Auto Buffer982
internal fun PlayerActivity.showV982StreamAutoBuffer982Toggle() {
    val current = BiliClient.prefs.v982streamAutoBuffer982
    BiliClient.prefs.v982streamAutoBuffer982 = !current
    AppToast.show(this, "Stream Auto Buffer982: ${if (!current) "ON" else "OFF"}")
}

// v982: Stretch Auto Fill982
internal fun PlayerActivity.showV982StretchAutoFill982Toggle() {
    val current = BiliClient.prefs.v982stretchAutoFill982
    BiliClient.prefs.v982stretchAutoFill982 = !current
    AppToast.show(this, "Stretch Auto Fill982: ${if (!current) "ON" else "OFF"}")
}

// v982: Strict Auto Mode982
internal fun PlayerActivity.showV982StrictAutoMode982Toggle() {
    val current = BiliClient.prefs.v982strictAutoMode982
    BiliClient.prefs.v982strictAutoMode982 = !current
    AppToast.show(this, "Strict Auto Mode982: ${if (!current) "ON" else "OFF"}")
}

// v982: String Auto Escape982
internal fun PlayerActivity.showV982StringAutoEscape982Toggle() {
    val current = BiliClient.prefs.v982stringAutoEscape982
    BiliClient.prefs.v982stringAutoEscape982 = !current
    AppToast.show(this, "String Auto Escape982: ${if (!current) "ON" else "OFF"}")
}

// v982: Strip Auto Whitespace982
internal fun PlayerActivity.showV982StripAutoWhitespace982Toggle() {
    val current = BiliClient.prefs.v982stripAutoWhitespace982
    BiliClient.prefs.v982stripAutoWhitespace982 = !current
    AppToast.show(this, "Strip Auto Whitespace982: ${if (!current) "ON" else "OFF"}")
}

// v982: Stroke Auto Width982
internal fun PlayerActivity.showV982StrokeAutoWidth982Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v982strokeAutoWidth982).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width982",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v982strokeAutoWidth982 = value
        AppToast.show(this, "Stroke Auto Width982: $value")
    }
}

// v983: Star Auto Favorite983
internal fun PlayerActivity.showV983StarAutoFavorite983Toggle() {
    val current = BiliClient.prefs.v983starAutoFavorite983
    BiliClient.prefs.v983starAutoFavorite983 = !current
    AppToast.show(this, "Star Auto Favorite983: ${if (!current) "ON" else "OFF"}")
}

// v983: Start Auto Launch983
internal fun PlayerActivity.showV983StartAutoLaunch983Toggle() {
    val current = BiliClient.prefs.v983startAutoLaunch983
    BiliClient.prefs.v983startAutoLaunch983 = !current
    AppToast.show(this, "Start Auto Launch983: ${if (!current) "ON" else "OFF"}")
}

// v983: State Auto Persist983
internal fun PlayerActivity.showV983StateAutoPersist983Toggle() {
    val current = BiliClient.prefs.v983stateAutoPersist983
    BiliClient.prefs.v983stateAutoPersist983 = !current
    AppToast.show(this, "State Auto Persist983: ${if (!current) "ON" else "OFF"}")
}

// v983: Static Auto Const983
internal fun PlayerActivity.showV983StaticAutoConst983Toggle() {
    val current = BiliClient.prefs.v983staticAutoConst983
    BiliClient.prefs.v983staticAutoConst983 = !current
    AppToast.show(this, "Static Auto Const983: ${if (!current) "ON" else "OFF"}")
}

// v983: Status Auto Badge983
internal fun PlayerActivity.showV983StatusAutoBadge983Toggle() {
    val current = BiliClient.prefs.v983statusAutoBadge983
    BiliClient.prefs.v983statusAutoBadge983 = !current
    AppToast.show(this, "Status Auto Badge983: ${if (!current) "ON" else "OFF"}")
}

// v983: Step Auto Guide983
internal fun PlayerActivity.showV983StepAutoGuide983Toggle() {
    val current = BiliClient.prefs.v983stepAutoGuide983
    BiliClient.prefs.v983stepAutoGuide983 = !current
    AppToast.show(this, "Step Auto Guide983: ${if (!current) "ON" else "OFF"}")
}

// v983: Stop Auto Cleanup983
internal fun PlayerActivity.showV983StopAutoCleanup983Toggle() {
    val current = BiliClient.prefs.v983stopAutoCleanup983
    BiliClient.prefs.v983stopAutoCleanup983 = !current
    AppToast.show(this, "Stop Auto Cleanup983: ${if (!current) "ON" else "OFF"}")
}

// v983: Storage Auto Quota983
internal fun PlayerActivity.showV983StorageAutoQuota983Toggle() {
    val current = BiliClient.prefs.v983storageAutoQuota983
    BiliClient.prefs.v983storageAutoQuota983 = !current
    AppToast.show(this, "Storage Auto Quota983: ${if (!current) "ON" else "OFF"}")
}

// v983: Store Auto Persist983
internal fun PlayerActivity.showV983StoreAutoPersist983Toggle() {
    val current = BiliClient.prefs.v983storeAutoPersist983
    BiliClient.prefs.v983storeAutoPersist983 = !current
    AppToast.show(this, "Store Auto Persist983: ${if (!current) "ON" else "OFF"}")
}

// v983: Stream Auto Buffer983
internal fun PlayerActivity.showV983StreamAutoBuffer983Toggle() {
    val current = BiliClient.prefs.v983streamAutoBuffer983
    BiliClient.prefs.v983streamAutoBuffer983 = !current
    AppToast.show(this, "Stream Auto Buffer983: ${if (!current) "ON" else "OFF"}")
}

// v983: Stretch Auto Fill983
internal fun PlayerActivity.showV983StretchAutoFill983Toggle() {
    val current = BiliClient.prefs.v983stretchAutoFill983
    BiliClient.prefs.v983stretchAutoFill983 = !current
    AppToast.show(this, "Stretch Auto Fill983: ${if (!current) "ON" else "OFF"}")
}

// v983: Strict Auto Mode983
internal fun PlayerActivity.showV983StrictAutoMode983Toggle() {
    val current = BiliClient.prefs.v983strictAutoMode983
    BiliClient.prefs.v983strictAutoMode983 = !current
    AppToast.show(this, "Strict Auto Mode983: ${if (!current) "ON" else "OFF"}")
}

// v983: String Auto Escape983
internal fun PlayerActivity.showV983StringAutoEscape983Toggle() {
    val current = BiliClient.prefs.v983stringAutoEscape983
    BiliClient.prefs.v983stringAutoEscape983 = !current
    AppToast.show(this, "String Auto Escape983: ${if (!current) "ON" else "OFF"}")
}

// v983: Strip Auto Whitespace983
internal fun PlayerActivity.showV983StripAutoWhitespace983Toggle() {
    val current = BiliClient.prefs.v983stripAutoWhitespace983
    BiliClient.prefs.v983stripAutoWhitespace983 = !current
    AppToast.show(this, "Strip Auto Whitespace983: ${if (!current) "ON" else "OFF"}")
}

// v983: Stroke Auto Width983
internal fun PlayerActivity.showV983StrokeAutoWidth983Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v983strokeAutoWidth983).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width983",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v983strokeAutoWidth983 = value
        AppToast.show(this, "Stroke Auto Width983: $value")
    }
}

// v984: Star Auto Favorite984
internal fun PlayerActivity.showV984StarAutoFavorite984Toggle() {
    val current = BiliClient.prefs.v984starAutoFavorite984
    BiliClient.prefs.v984starAutoFavorite984 = !current
    AppToast.show(this, "Star Auto Favorite984: ${if (!current) "ON" else "OFF"}")
}

// v984: Start Auto Launch984
internal fun PlayerActivity.showV984StartAutoLaunch984Toggle() {
    val current = BiliClient.prefs.v984startAutoLaunch984
    BiliClient.prefs.v984startAutoLaunch984 = !current
    AppToast.show(this, "Start Auto Launch984: ${if (!current) "ON" else "OFF"}")
}

// v984: State Auto Persist984
internal fun PlayerActivity.showV984StateAutoPersist984Toggle() {
    val current = BiliClient.prefs.v984stateAutoPersist984
    BiliClient.prefs.v984stateAutoPersist984 = !current
    AppToast.show(this, "State Auto Persist984: ${if (!current) "ON" else "OFF"}")
}

// v984: Static Auto Const984
internal fun PlayerActivity.showV984StaticAutoConst984Toggle() {
    val current = BiliClient.prefs.v984staticAutoConst984
    BiliClient.prefs.v984staticAutoConst984 = !current
    AppToast.show(this, "Static Auto Const984: ${if (!current) "ON" else "OFF"}")
}

// v984: Status Auto Badge984
internal fun PlayerActivity.showV984StatusAutoBadge984Toggle() {
    val current = BiliClient.prefs.v984statusAutoBadge984
    BiliClient.prefs.v984statusAutoBadge984 = !current
    AppToast.show(this, "Status Auto Badge984: ${if (!current) "ON" else "OFF"}")
}

// v984: Step Auto Guide984
internal fun PlayerActivity.showV984StepAutoGuide984Toggle() {
    val current = BiliClient.prefs.v984stepAutoGuide984
    BiliClient.prefs.v984stepAutoGuide984 = !current
    AppToast.show(this, "Step Auto Guide984: ${if (!current) "ON" else "OFF"}")
}

// v984: Stop Auto Cleanup984
internal fun PlayerActivity.showV984StopAutoCleanup984Toggle() {
    val current = BiliClient.prefs.v984stopAutoCleanup984
    BiliClient.prefs.v984stopAutoCleanup984 = !current
    AppToast.show(this, "Stop Auto Cleanup984: ${if (!current) "ON" else "OFF"}")
}

// v984: Storage Auto Quota984
internal fun PlayerActivity.showV984StorageAutoQuota984Toggle() {
    val current = BiliClient.prefs.v984storageAutoQuota984
    BiliClient.prefs.v984storageAutoQuota984 = !current
    AppToast.show(this, "Storage Auto Quota984: ${if (!current) "ON" else "OFF"}")
}

// v984: Store Auto Persist984
internal fun PlayerActivity.showV984StoreAutoPersist984Toggle() {
    val current = BiliClient.prefs.v984storeAutoPersist984
    BiliClient.prefs.v984storeAutoPersist984 = !current
    AppToast.show(this, "Store Auto Persist984: ${if (!current) "ON" else "OFF"}")
}

// v984: Stream Auto Buffer984
internal fun PlayerActivity.showV984StreamAutoBuffer984Toggle() {
    val current = BiliClient.prefs.v984streamAutoBuffer984
    BiliClient.prefs.v984streamAutoBuffer984 = !current
    AppToast.show(this, "Stream Auto Buffer984: ${if (!current) "ON" else "OFF"}")
}

// v984: Stretch Auto Fill984
internal fun PlayerActivity.showV984StretchAutoFill984Toggle() {
    val current = BiliClient.prefs.v984stretchAutoFill984
    BiliClient.prefs.v984stretchAutoFill984 = !current
    AppToast.show(this, "Stretch Auto Fill984: ${if (!current) "ON" else "OFF"}")
}

// v984: Strict Auto Mode984
internal fun PlayerActivity.showV984StrictAutoMode984Toggle() {
    val current = BiliClient.prefs.v984strictAutoMode984
    BiliClient.prefs.v984strictAutoMode984 = !current
    AppToast.show(this, "Strict Auto Mode984: ${if (!current) "ON" else "OFF"}")
}

// v984: String Auto Escape984
internal fun PlayerActivity.showV984StringAutoEscape984Toggle() {
    val current = BiliClient.prefs.v984stringAutoEscape984
    BiliClient.prefs.v984stringAutoEscape984 = !current
    AppToast.show(this, "String Auto Escape984: ${if (!current) "ON" else "OFF"}")
}

// v984: Strip Auto Whitespace984
internal fun PlayerActivity.showV984StripAutoWhitespace984Toggle() {
    val current = BiliClient.prefs.v984stripAutoWhitespace984
    BiliClient.prefs.v984stripAutoWhitespace984 = !current
    AppToast.show(this, "Strip Auto Whitespace984: ${if (!current) "ON" else "OFF"}")
}

// v984: Stroke Auto Width984
internal fun PlayerActivity.showV984StrokeAutoWidth984Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v984strokeAutoWidth984).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width984",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v984strokeAutoWidth984 = value
        AppToast.show(this, "Stroke Auto Width984: $value")
    }
}

// v985: Star Auto Favorite985
internal fun PlayerActivity.showV985StarAutoFavorite985Toggle() {
    val current = BiliClient.prefs.v985starAutoFavorite985
    BiliClient.prefs.v985starAutoFavorite985 = !current
    AppToast.show(this, "Star Auto Favorite985: ${if (!current) "ON" else "OFF"}")
}

// v985: Start Auto Launch985
internal fun PlayerActivity.showV985StartAutoLaunch985Toggle() {
    val current = BiliClient.prefs.v985startAutoLaunch985
    BiliClient.prefs.v985startAutoLaunch985 = !current
    AppToast.show(this, "Start Auto Launch985: ${if (!current) "ON" else "OFF"}")
}

// v985: State Auto Persist985
internal fun PlayerActivity.showV985StateAutoPersist985Toggle() {
    val current = BiliClient.prefs.v985stateAutoPersist985
    BiliClient.prefs.v985stateAutoPersist985 = !current
    AppToast.show(this, "State Auto Persist985: ${if (!current) "ON" else "OFF"}")
}

// v985: Static Auto Const985
internal fun PlayerActivity.showV985StaticAutoConst985Toggle() {
    val current = BiliClient.prefs.v985staticAutoConst985
    BiliClient.prefs.v985staticAutoConst985 = !current
    AppToast.show(this, "Static Auto Const985: ${if (!current) "ON" else "OFF"}")
}

// v985: Status Auto Badge985
internal fun PlayerActivity.showV985StatusAutoBadge985Toggle() {
    val current = BiliClient.prefs.v985statusAutoBadge985
    BiliClient.prefs.v985statusAutoBadge985 = !current
    AppToast.show(this, "Status Auto Badge985: ${if (!current) "ON" else "OFF"}")
}

// v985: Step Auto Guide985
internal fun PlayerActivity.showV985StepAutoGuide985Toggle() {
    val current = BiliClient.prefs.v985stepAutoGuide985
    BiliClient.prefs.v985stepAutoGuide985 = !current
    AppToast.show(this, "Step Auto Guide985: ${if (!current) "ON" else "OFF"}")
}

// v985: Stop Auto Cleanup985
internal fun PlayerActivity.showV985StopAutoCleanup985Toggle() {
    val current = BiliClient.prefs.v985stopAutoCleanup985
    BiliClient.prefs.v985stopAutoCleanup985 = !current
    AppToast.show(this, "Stop Auto Cleanup985: ${if (!current) "ON" else "OFF"}")
}

// v985: Storage Auto Quota985
internal fun PlayerActivity.showV985StorageAutoQuota985Toggle() {
    val current = BiliClient.prefs.v985storageAutoQuota985
    BiliClient.prefs.v985storageAutoQuota985 = !current
    AppToast.show(this, "Storage Auto Quota985: ${if (!current) "ON" else "OFF"}")
}

// v985: Store Auto Persist985
internal fun PlayerActivity.showV985StoreAutoPersist985Toggle() {
    val current = BiliClient.prefs.v985storeAutoPersist985
    BiliClient.prefs.v985storeAutoPersist985 = !current
    AppToast.show(this, "Store Auto Persist985: ${if (!current) "ON" else "OFF"}")
}

// v985: Stream Auto Buffer985
internal fun PlayerActivity.showV985StreamAutoBuffer985Toggle() {
    val current = BiliClient.prefs.v985streamAutoBuffer985
    BiliClient.prefs.v985streamAutoBuffer985 = !current
    AppToast.show(this, "Stream Auto Buffer985: ${if (!current) "ON" else "OFF"}")
}

// v985: Stretch Auto Fill985
internal fun PlayerActivity.showV985StretchAutoFill985Toggle() {
    val current = BiliClient.prefs.v985stretchAutoFill985
    BiliClient.prefs.v985stretchAutoFill985 = !current
    AppToast.show(this, "Stretch Auto Fill985: ${if (!current) "ON" else "OFF"}")
}

// v985: Strict Auto Mode985
internal fun PlayerActivity.showV985StrictAutoMode985Toggle() {
    val current = BiliClient.prefs.v985strictAutoMode985
    BiliClient.prefs.v985strictAutoMode985 = !current
    AppToast.show(this, "Strict Auto Mode985: ${if (!current) "ON" else "OFF"}")
}

// v985: String Auto Escape985
internal fun PlayerActivity.showV985StringAutoEscape985Toggle() {
    val current = BiliClient.prefs.v985stringAutoEscape985
    BiliClient.prefs.v985stringAutoEscape985 = !current
    AppToast.show(this, "String Auto Escape985: ${if (!current) "ON" else "OFF"}")
}

// v985: Strip Auto Whitespace985
internal fun PlayerActivity.showV985StripAutoWhitespace985Toggle() {
    val current = BiliClient.prefs.v985stripAutoWhitespace985
    BiliClient.prefs.v985stripAutoWhitespace985 = !current
    AppToast.show(this, "Strip Auto Whitespace985: ${if (!current) "ON" else "OFF"}")
}

// v985: Stroke Auto Width985
internal fun PlayerActivity.showV985StrokeAutoWidth985Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v985strokeAutoWidth985).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width985",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v985strokeAutoWidth985 = value
        AppToast.show(this, "Stroke Auto Width985: $value")
    }
}

// v986: Star Auto Favorite986
internal fun PlayerActivity.showV986StarAutoFavorite986Toggle() {
    val current = BiliClient.prefs.v986starAutoFavorite986
    BiliClient.prefs.v986starAutoFavorite986 = !current
    AppToast.show(this, "Star Auto Favorite986: ${if (!current) "ON" else "OFF"}")
}

// v986: Start Auto Launch986
internal fun PlayerActivity.showV986StartAutoLaunch986Toggle() {
    val current = BiliClient.prefs.v986startAutoLaunch986
    BiliClient.prefs.v986startAutoLaunch986 = !current
    AppToast.show(this, "Start Auto Launch986: ${if (!current) "ON" else "OFF"}")
}

// v986: State Auto Persist986
internal fun PlayerActivity.showV986StateAutoPersist986Toggle() {
    val current = BiliClient.prefs.v986stateAutoPersist986
    BiliClient.prefs.v986stateAutoPersist986 = !current
    AppToast.show(this, "State Auto Persist986: ${if (!current) "ON" else "OFF"}")
}

// v986: Static Auto Const986
internal fun PlayerActivity.showV986StaticAutoConst986Toggle() {
    val current = BiliClient.prefs.v986staticAutoConst986
    BiliClient.prefs.v986staticAutoConst986 = !current
    AppToast.show(this, "Static Auto Const986: ${if (!current) "ON" else "OFF"}")
}

// v986: Status Auto Badge986
internal fun PlayerActivity.showV986StatusAutoBadge986Toggle() {
    val current = BiliClient.prefs.v986statusAutoBadge986
    BiliClient.prefs.v986statusAutoBadge986 = !current
    AppToast.show(this, "Status Auto Badge986: ${if (!current) "ON" else "OFF"}")
}

// v986: Step Auto Guide986
internal fun PlayerActivity.showV986StepAutoGuide986Toggle() {
    val current = BiliClient.prefs.v986stepAutoGuide986
    BiliClient.prefs.v986stepAutoGuide986 = !current
    AppToast.show(this, "Step Auto Guide986: ${if (!current) "ON" else "OFF"}")
}

// v986: Stop Auto Cleanup986
internal fun PlayerActivity.showV986StopAutoCleanup986Toggle() {
    val current = BiliClient.prefs.v986stopAutoCleanup986
    BiliClient.prefs.v986stopAutoCleanup986 = !current
    AppToast.show(this, "Stop Auto Cleanup986: ${if (!current) "ON" else "OFF"}")
}

// v986: Storage Auto Quota986
internal fun PlayerActivity.showV986StorageAutoQuota986Toggle() {
    val current = BiliClient.prefs.v986storageAutoQuota986
    BiliClient.prefs.v986storageAutoQuota986 = !current
    AppToast.show(this, "Storage Auto Quota986: ${if (!current) "ON" else "OFF"}")
}

// v986: Store Auto Persist986
internal fun PlayerActivity.showV986StoreAutoPersist986Toggle() {
    val current = BiliClient.prefs.v986storeAutoPersist986
    BiliClient.prefs.v986storeAutoPersist986 = !current
    AppToast.show(this, "Store Auto Persist986: ${if (!current) "ON" else "OFF"}")
}

// v986: Stream Auto Buffer986
internal fun PlayerActivity.showV986StreamAutoBuffer986Toggle() {
    val current = BiliClient.prefs.v986streamAutoBuffer986
    BiliClient.prefs.v986streamAutoBuffer986 = !current
    AppToast.show(this, "Stream Auto Buffer986: ${if (!current) "ON" else "OFF"}")
}

// v986: Stretch Auto Fill986
internal fun PlayerActivity.showV986StretchAutoFill986Toggle() {
    val current = BiliClient.prefs.v986stretchAutoFill986
    BiliClient.prefs.v986stretchAutoFill986 = !current
    AppToast.show(this, "Stretch Auto Fill986: ${if (!current) "ON" else "OFF"}")
}

// v986: Strict Auto Mode986
internal fun PlayerActivity.showV986StrictAutoMode986Toggle() {
    val current = BiliClient.prefs.v986strictAutoMode986
    BiliClient.prefs.v986strictAutoMode986 = !current
    AppToast.show(this, "Strict Auto Mode986: ${if (!current) "ON" else "OFF"}")
}

// v986: String Auto Escape986
internal fun PlayerActivity.showV986StringAutoEscape986Toggle() {
    val current = BiliClient.prefs.v986stringAutoEscape986
    BiliClient.prefs.v986stringAutoEscape986 = !current
    AppToast.show(this, "String Auto Escape986: ${if (!current) "ON" else "OFF"}")
}

// v986: Strip Auto Whitespace986
internal fun PlayerActivity.showV986StripAutoWhitespace986Toggle() {
    val current = BiliClient.prefs.v986stripAutoWhitespace986
    BiliClient.prefs.v986stripAutoWhitespace986 = !current
    AppToast.show(this, "Strip Auto Whitespace986: ${if (!current) "ON" else "OFF"}")
}

// v986: Stroke Auto Width986
internal fun PlayerActivity.showV986StrokeAutoWidth986Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v986strokeAutoWidth986).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width986",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v986strokeAutoWidth986 = value
        AppToast.show(this, "Stroke Auto Width986: $value")
    }
}

// v987: Star Auto Favorite987
internal fun PlayerActivity.showV987StarAutoFavorite987Toggle() {
    val current = BiliClient.prefs.v987starAutoFavorite987
    BiliClient.prefs.v987starAutoFavorite987 = !current
    AppToast.show(this, "Star Auto Favorite987: ${if (!current) "ON" else "OFF"}")
}

// v987: Start Auto Launch987
internal fun PlayerActivity.showV987StartAutoLaunch987Toggle() {
    val current = BiliClient.prefs.v987startAutoLaunch987
    BiliClient.prefs.v987startAutoLaunch987 = !current
    AppToast.show(this, "Start Auto Launch987: ${if (!current) "ON" else "OFF"}")
}

// v987: State Auto Persist987
internal fun PlayerActivity.showV987StateAutoPersist987Toggle() {
    val current = BiliClient.prefs.v987stateAutoPersist987
    BiliClient.prefs.v987stateAutoPersist987 = !current
    AppToast.show(this, "State Auto Persist987: ${if (!current) "ON" else "OFF"}")
}

// v987: Static Auto Const987
internal fun PlayerActivity.showV987StaticAutoConst987Toggle() {
    val current = BiliClient.prefs.v987staticAutoConst987
    BiliClient.prefs.v987staticAutoConst987 = !current
    AppToast.show(this, "Static Auto Const987: ${if (!current) "ON" else "OFF"}")
}

// v987: Status Auto Badge987
internal fun PlayerActivity.showV987StatusAutoBadge987Toggle() {
    val current = BiliClient.prefs.v987statusAutoBadge987
    BiliClient.prefs.v987statusAutoBadge987 = !current
    AppToast.show(this, "Status Auto Badge987: ${if (!current) "ON" else "OFF"}")
}

// v987: Step Auto Guide987
internal fun PlayerActivity.showV987StepAutoGuide987Toggle() {
    val current = BiliClient.prefs.v987stepAutoGuide987
    BiliClient.prefs.v987stepAutoGuide987 = !current
    AppToast.show(this, "Step Auto Guide987: ${if (!current) "ON" else "OFF"}")
}

// v987: Stop Auto Cleanup987
internal fun PlayerActivity.showV987StopAutoCleanup987Toggle() {
    val current = BiliClient.prefs.v987stopAutoCleanup987
    BiliClient.prefs.v987stopAutoCleanup987 = !current
    AppToast.show(this, "Stop Auto Cleanup987: ${if (!current) "ON" else "OFF"}")
}

// v987: Storage Auto Quota987
internal fun PlayerActivity.showV987StorageAutoQuota987Toggle() {
    val current = BiliClient.prefs.v987storageAutoQuota987
    BiliClient.prefs.v987storageAutoQuota987 = !current
    AppToast.show(this, "Storage Auto Quota987: ${if (!current) "ON" else "OFF"}")
}

// v987: Store Auto Persist987
internal fun PlayerActivity.showV987StoreAutoPersist987Toggle() {
    val current = BiliClient.prefs.v987storeAutoPersist987
    BiliClient.prefs.v987storeAutoPersist987 = !current
    AppToast.show(this, "Store Auto Persist987: ${if (!current) "ON" else "OFF"}")
}

// v987: Stream Auto Buffer987
internal fun PlayerActivity.showV987StreamAutoBuffer987Toggle() {
    val current = BiliClient.prefs.v987streamAutoBuffer987
    BiliClient.prefs.v987streamAutoBuffer987 = !current
    AppToast.show(this, "Stream Auto Buffer987: ${if (!current) "ON" else "OFF"}")
}

// v987: Stretch Auto Fill987
internal fun PlayerActivity.showV987StretchAutoFill987Toggle() {
    val current = BiliClient.prefs.v987stretchAutoFill987
    BiliClient.prefs.v987stretchAutoFill987 = !current
    AppToast.show(this, "Stretch Auto Fill987: ${if (!current) "ON" else "OFF"}")
}

// v987: Strict Auto Mode987
internal fun PlayerActivity.showV987StrictAutoMode987Toggle() {
    val current = BiliClient.prefs.v987strictAutoMode987
    BiliClient.prefs.v987strictAutoMode987 = !current
    AppToast.show(this, "Strict Auto Mode987: ${if (!current) "ON" else "OFF"}")
}

// v987: String Auto Escape987
internal fun PlayerActivity.showV987StringAutoEscape987Toggle() {
    val current = BiliClient.prefs.v987stringAutoEscape987
    BiliClient.prefs.v987stringAutoEscape987 = !current
    AppToast.show(this, "String Auto Escape987: ${if (!current) "ON" else "OFF"}")
}

// v987: Strip Auto Whitespace987
internal fun PlayerActivity.showV987StripAutoWhitespace987Toggle() {
    val current = BiliClient.prefs.v987stripAutoWhitespace987
    BiliClient.prefs.v987stripAutoWhitespace987 = !current
    AppToast.show(this, "Strip Auto Whitespace987: ${if (!current) "ON" else "OFF"}")
}

// v987: Stroke Auto Width987
internal fun PlayerActivity.showV987StrokeAutoWidth987Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v987strokeAutoWidth987).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width987",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v987strokeAutoWidth987 = value
        AppToast.show(this, "Stroke Auto Width987: $value")
    }
}

// v988: Star Auto Favorite988
internal fun PlayerActivity.showV988StarAutoFavorite988Toggle() {
    val current = BiliClient.prefs.v988starAutoFavorite988
    BiliClient.prefs.v988starAutoFavorite988 = !current
    AppToast.show(this, "Star Auto Favorite988: ${if (!current) "ON" else "OFF"}")
}

// v988: Start Auto Launch988
internal fun PlayerActivity.showV988StartAutoLaunch988Toggle() {
    val current = BiliClient.prefs.v988startAutoLaunch988
    BiliClient.prefs.v988startAutoLaunch988 = !current
    AppToast.show(this, "Start Auto Launch988: ${if (!current) "ON" else "OFF"}")
}

// v988: State Auto Persist988
internal fun PlayerActivity.showV988StateAutoPersist988Toggle() {
    val current = BiliClient.prefs.v988stateAutoPersist988
    BiliClient.prefs.v988stateAutoPersist988 = !current
    AppToast.show(this, "State Auto Persist988: ${if (!current) "ON" else "OFF"}")
}

// v988: Static Auto Const988
internal fun PlayerActivity.showV988StaticAutoConst988Toggle() {
    val current = BiliClient.prefs.v988staticAutoConst988
    BiliClient.prefs.v988staticAutoConst988 = !current
    AppToast.show(this, "Static Auto Const988: ${if (!current) "ON" else "OFF"}")
}

// v988: Status Auto Badge988
internal fun PlayerActivity.showV988StatusAutoBadge988Toggle() {
    val current = BiliClient.prefs.v988statusAutoBadge988
    BiliClient.prefs.v988statusAutoBadge988 = !current
    AppToast.show(this, "Status Auto Badge988: ${if (!current) "ON" else "OFF"}")
}

// v988: Step Auto Guide988
internal fun PlayerActivity.showV988StepAutoGuide988Toggle() {
    val current = BiliClient.prefs.v988stepAutoGuide988
    BiliClient.prefs.v988stepAutoGuide988 = !current
    AppToast.show(this, "Step Auto Guide988: ${if (!current) "ON" else "OFF"}")
}

// v988: Stop Auto Cleanup988
internal fun PlayerActivity.showV988StopAutoCleanup988Toggle() {
    val current = BiliClient.prefs.v988stopAutoCleanup988
    BiliClient.prefs.v988stopAutoCleanup988 = !current
    AppToast.show(this, "Stop Auto Cleanup988: ${if (!current) "ON" else "OFF"}")
}

// v988: Storage Auto Quota988
internal fun PlayerActivity.showV988StorageAutoQuota988Toggle() {
    val current = BiliClient.prefs.v988storageAutoQuota988
    BiliClient.prefs.v988storageAutoQuota988 = !current
    AppToast.show(this, "Storage Auto Quota988: ${if (!current) "ON" else "OFF"}")
}

// v988: Store Auto Persist988
internal fun PlayerActivity.showV988StoreAutoPersist988Toggle() {
    val current = BiliClient.prefs.v988storeAutoPersist988
    BiliClient.prefs.v988storeAutoPersist988 = !current
    AppToast.show(this, "Store Auto Persist988: ${if (!current) "ON" else "OFF"}")
}

// v988: Stream Auto Buffer988
internal fun PlayerActivity.showV988StreamAutoBuffer988Toggle() {
    val current = BiliClient.prefs.v988streamAutoBuffer988
    BiliClient.prefs.v988streamAutoBuffer988 = !current
    AppToast.show(this, "Stream Auto Buffer988: ${if (!current) "ON" else "OFF"}")
}

// v988: Stretch Auto Fill988
internal fun PlayerActivity.showV988StretchAutoFill988Toggle() {
    val current = BiliClient.prefs.v988stretchAutoFill988
    BiliClient.prefs.v988stretchAutoFill988 = !current
    AppToast.show(this, "Stretch Auto Fill988: ${if (!current) "ON" else "OFF"}")
}

// v988: Strict Auto Mode988
internal fun PlayerActivity.showV988StrictAutoMode988Toggle() {
    val current = BiliClient.prefs.v988strictAutoMode988
    BiliClient.prefs.v988strictAutoMode988 = !current
    AppToast.show(this, "Strict Auto Mode988: ${if (!current) "ON" else "OFF"}")
}

// v988: String Auto Escape988
internal fun PlayerActivity.showV988StringAutoEscape988Toggle() {
    val current = BiliClient.prefs.v988stringAutoEscape988
    BiliClient.prefs.v988stringAutoEscape988 = !current
    AppToast.show(this, "String Auto Escape988: ${if (!current) "ON" else "OFF"}")
}

// v988: Strip Auto Whitespace988
internal fun PlayerActivity.showV988StripAutoWhitespace988Toggle() {
    val current = BiliClient.prefs.v988stripAutoWhitespace988
    BiliClient.prefs.v988stripAutoWhitespace988 = !current
    AppToast.show(this, "Strip Auto Whitespace988: ${if (!current) "ON" else "OFF"}")
}

// v988: Stroke Auto Width988
internal fun PlayerActivity.showV988StrokeAutoWidth988Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v988strokeAutoWidth988).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width988",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v988strokeAutoWidth988 = value
        AppToast.show(this, "Stroke Auto Width988: $value")
    }
}

// v989: Star Auto Favorite989
internal fun PlayerActivity.showV989StarAutoFavorite989Toggle() {
    val current = BiliClient.prefs.v989starAutoFavorite989
    BiliClient.prefs.v989starAutoFavorite989 = !current
    AppToast.show(this, "Star Auto Favorite989: ${if (!current) "ON" else "OFF"}")
}

// v989: Start Auto Launch989
internal fun PlayerActivity.showV989StartAutoLaunch989Toggle() {
    val current = BiliClient.prefs.v989startAutoLaunch989
    BiliClient.prefs.v989startAutoLaunch989 = !current
    AppToast.show(this, "Start Auto Launch989: ${if (!current) "ON" else "OFF"}")
}

// v989: State Auto Persist989
internal fun PlayerActivity.showV989StateAutoPersist989Toggle() {
    val current = BiliClient.prefs.v989stateAutoPersist989
    BiliClient.prefs.v989stateAutoPersist989 = !current
    AppToast.show(this, "State Auto Persist989: ${if (!current) "ON" else "OFF"}")
}

// v989: Static Auto Const989
internal fun PlayerActivity.showV989StaticAutoConst989Toggle() {
    val current = BiliClient.prefs.v989staticAutoConst989
    BiliClient.prefs.v989staticAutoConst989 = !current
    AppToast.show(this, "Static Auto Const989: ${if (!current) "ON" else "OFF"}")
}

// v989: Status Auto Badge989
internal fun PlayerActivity.showV989StatusAutoBadge989Toggle() {
    val current = BiliClient.prefs.v989statusAutoBadge989
    BiliClient.prefs.v989statusAutoBadge989 = !current
    AppToast.show(this, "Status Auto Badge989: ${if (!current) "ON" else "OFF"}")
}

// v989: Step Auto Guide989
internal fun PlayerActivity.showV989StepAutoGuide989Toggle() {
    val current = BiliClient.prefs.v989stepAutoGuide989
    BiliClient.prefs.v989stepAutoGuide989 = !current
    AppToast.show(this, "Step Auto Guide989: ${if (!current) "ON" else "OFF"}")
}

// v989: Stop Auto Cleanup989
internal fun PlayerActivity.showV989StopAutoCleanup989Toggle() {
    val current = BiliClient.prefs.v989stopAutoCleanup989
    BiliClient.prefs.v989stopAutoCleanup989 = !current
    AppToast.show(this, "Stop Auto Cleanup989: ${if (!current) "ON" else "OFF"}")
}

// v989: Storage Auto Quota989
internal fun PlayerActivity.showV989StorageAutoQuota989Toggle() {
    val current = BiliClient.prefs.v989storageAutoQuota989
    BiliClient.prefs.v989storageAutoQuota989 = !current
    AppToast.show(this, "Storage Auto Quota989: ${if (!current) "ON" else "OFF"}")
}

// v989: Store Auto Persist989
internal fun PlayerActivity.showV989StoreAutoPersist989Toggle() {
    val current = BiliClient.prefs.v989storeAutoPersist989
    BiliClient.prefs.v989storeAutoPersist989 = !current
    AppToast.show(this, "Store Auto Persist989: ${if (!current) "ON" else "OFF"}")
}

// v989: Stream Auto Buffer989
internal fun PlayerActivity.showV989StreamAutoBuffer989Toggle() {
    val current = BiliClient.prefs.v989streamAutoBuffer989
    BiliClient.prefs.v989streamAutoBuffer989 = !current
    AppToast.show(this, "Stream Auto Buffer989: ${if (!current) "ON" else "OFF"}")
}

// v989: Stretch Auto Fill989
internal fun PlayerActivity.showV989StretchAutoFill989Toggle() {
    val current = BiliClient.prefs.v989stretchAutoFill989
    BiliClient.prefs.v989stretchAutoFill989 = !current
    AppToast.show(this, "Stretch Auto Fill989: ${if (!current) "ON" else "OFF"}")
}

// v989: Strict Auto Mode989
internal fun PlayerActivity.showV989StrictAutoMode989Toggle() {
    val current = BiliClient.prefs.v989strictAutoMode989
    BiliClient.prefs.v989strictAutoMode989 = !current
    AppToast.show(this, "Strict Auto Mode989: ${if (!current) "ON" else "OFF"}")
}

// v989: String Auto Escape989
internal fun PlayerActivity.showV989StringAutoEscape989Toggle() {
    val current = BiliClient.prefs.v989stringAutoEscape989
    BiliClient.prefs.v989stringAutoEscape989 = !current
    AppToast.show(this, "String Auto Escape989: ${if (!current) "ON" else "OFF"}")
}

// v989: Strip Auto Whitespace989
internal fun PlayerActivity.showV989StripAutoWhitespace989Toggle() {
    val current = BiliClient.prefs.v989stripAutoWhitespace989
    BiliClient.prefs.v989stripAutoWhitespace989 = !current
    AppToast.show(this, "Strip Auto Whitespace989: ${if (!current) "ON" else "OFF"}")
}

// v989: Stroke Auto Width989
internal fun PlayerActivity.showV989StrokeAutoWidth989Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v989strokeAutoWidth989).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width989",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v989strokeAutoWidth989 = value
        AppToast.show(this, "Stroke Auto Width989: $value")
    }
}

// v990: Star Auto Favorite990
internal fun PlayerActivity.showV990StarAutoFavorite990Toggle() {
    val current = BiliClient.prefs.v990starAutoFavorite990
    BiliClient.prefs.v990starAutoFavorite990 = !current
    AppToast.show(this, "Star Auto Favorite990: ${if (!current) "ON" else "OFF"}")
}

// v990: Start Auto Launch990
internal fun PlayerActivity.showV990StartAutoLaunch990Toggle() {
    val current = BiliClient.prefs.v990startAutoLaunch990
    BiliClient.prefs.v990startAutoLaunch990 = !current
    AppToast.show(this, "Start Auto Launch990: ${if (!current) "ON" else "OFF"}")
}

// v990: State Auto Persist990
internal fun PlayerActivity.showV990StateAutoPersist990Toggle() {
    val current = BiliClient.prefs.v990stateAutoPersist990
    BiliClient.prefs.v990stateAutoPersist990 = !current
    AppToast.show(this, "State Auto Persist990: ${if (!current) "ON" else "OFF"}")
}

// v990: Static Auto Const990
internal fun PlayerActivity.showV990StaticAutoConst990Toggle() {
    val current = BiliClient.prefs.v990staticAutoConst990
    BiliClient.prefs.v990staticAutoConst990 = !current
    AppToast.show(this, "Static Auto Const990: ${if (!current) "ON" else "OFF"}")
}

// v990: Status Auto Badge990
internal fun PlayerActivity.showV990StatusAutoBadge990Toggle() {
    val current = BiliClient.prefs.v990statusAutoBadge990
    BiliClient.prefs.v990statusAutoBadge990 = !current
    AppToast.show(this, "Status Auto Badge990: ${if (!current) "ON" else "OFF"}")
}

// v990: Step Auto Guide990
internal fun PlayerActivity.showV990StepAutoGuide990Toggle() {
    val current = BiliClient.prefs.v990stepAutoGuide990
    BiliClient.prefs.v990stepAutoGuide990 = !current
    AppToast.show(this, "Step Auto Guide990: ${if (!current) "ON" else "OFF"}")
}

// v990: Stop Auto Cleanup990
internal fun PlayerActivity.showV990StopAutoCleanup990Toggle() {
    val current = BiliClient.prefs.v990stopAutoCleanup990
    BiliClient.prefs.v990stopAutoCleanup990 = !current
    AppToast.show(this, "Stop Auto Cleanup990: ${if (!current) "ON" else "OFF"}")
}

// v990: Storage Auto Quota990
internal fun PlayerActivity.showV990StorageAutoQuota990Toggle() {
    val current = BiliClient.prefs.v990storageAutoQuota990
    BiliClient.prefs.v990storageAutoQuota990 = !current
    AppToast.show(this, "Storage Auto Quota990: ${if (!current) "ON" else "OFF"}")
}

// v990: Store Auto Persist990
internal fun PlayerActivity.showV990StoreAutoPersist990Toggle() {
    val current = BiliClient.prefs.v990storeAutoPersist990
    BiliClient.prefs.v990storeAutoPersist990 = !current
    AppToast.show(this, "Store Auto Persist990: ${if (!current) "ON" else "OFF"}")
}

// v990: Stream Auto Buffer990
internal fun PlayerActivity.showV990StreamAutoBuffer990Toggle() {
    val current = BiliClient.prefs.v990streamAutoBuffer990
    BiliClient.prefs.v990streamAutoBuffer990 = !current
    AppToast.show(this, "Stream Auto Buffer990: ${if (!current) "ON" else "OFF"}")
}

// v990: Stretch Auto Fill990
internal fun PlayerActivity.showV990StretchAutoFill990Toggle() {
    val current = BiliClient.prefs.v990stretchAutoFill990
    BiliClient.prefs.v990stretchAutoFill990 = !current
    AppToast.show(this, "Stretch Auto Fill990: ${if (!current) "ON" else "OFF"}")
}

// v990: Strict Auto Mode990
internal fun PlayerActivity.showV990StrictAutoMode990Toggle() {
    val current = BiliClient.prefs.v990strictAutoMode990
    BiliClient.prefs.v990strictAutoMode990 = !current
    AppToast.show(this, "Strict Auto Mode990: ${if (!current) "ON" else "OFF"}")
}

// v990: String Auto Escape990
internal fun PlayerActivity.showV990StringAutoEscape990Toggle() {
    val current = BiliClient.prefs.v990stringAutoEscape990
    BiliClient.prefs.v990stringAutoEscape990 = !current
    AppToast.show(this, "String Auto Escape990: ${if (!current) "ON" else "OFF"}")
}

// v990: Strip Auto Whitespace990
internal fun PlayerActivity.showV990StripAutoWhitespace990Toggle() {
    val current = BiliClient.prefs.v990stripAutoWhitespace990
    BiliClient.prefs.v990stripAutoWhitespace990 = !current
    AppToast.show(this, "Strip Auto Whitespace990: ${if (!current) "ON" else "OFF"}")
}

// v990: Stroke Auto Width990
internal fun PlayerActivity.showV990StrokeAutoWidth990Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v990strokeAutoWidth990).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Stroke Auto Width990",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v990strokeAutoWidth990 = value
        AppToast.show(this, "Stroke Auto Width990: $value")
    }
}

