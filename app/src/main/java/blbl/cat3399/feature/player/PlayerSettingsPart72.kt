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

// v901: Quick Auto Action901
internal fun PlayerActivity.showV901QuickAutoAction901Toggle() {
    val current = BiliClient.prefs.v901quickAutoAction901
    BiliClient.prefs.v901quickAutoAction901 = !current
    AppToast.show(this, "Quick Auto Action901: ${if (!current) "ON" else "OFF"}")
}

// v901: Quit Auto Save901
internal fun PlayerActivity.showV901QuitAutoSave901Toggle() {
    val current = BiliClient.prefs.v901quitAutoSave901
    BiliClient.prefs.v901quitAutoSave901 = !current
    AppToast.show(this, "Quit Auto Save901: ${if (!current) "ON" else "OFF"}")
}

// v901: Quote Auto Format901
internal fun PlayerActivity.showV901QuoteAutoFormat901Toggle() {
    val current = BiliClient.prefs.v901quoteAutoFormat901
    BiliClient.prefs.v901quoteAutoFormat901 = !current
    AppToast.show(this, "Quote Auto Format901: ${if (!current) "ON" else "OFF"}")
}

// v901: Race Auto Condition901
internal fun PlayerActivity.showV901RaceAutoCondition901Toggle() {
    val current = BiliClient.prefs.v901raceAutoCondition901
    BiliClient.prefs.v901raceAutoCondition901 = !current
    AppToast.show(this, "Race Auto Condition901: ${if (!current) "ON" else "OFF"}")
}

// v901: Random Auto Shuffle901
internal fun PlayerActivity.showV901RandomAutoShuffle901Toggle() {
    val current = BiliClient.prefs.v901randomAutoShuffle901
    BiliClient.prefs.v901randomAutoShuffle901 = !current
    AppToast.show(this, "Random Auto Shuffle901: ${if (!current) "ON" else "OFF"}")
}

// v901: Range Auto Slider901
internal fun PlayerActivity.showV901RangeAutoSlider901Toggle() {
    val current = BiliClient.prefs.v901rangeAutoSlider901
    BiliClient.prefs.v901rangeAutoSlider901 = !current
    AppToast.show(this, "Range Auto Slider901: ${if (!current) "ON" else "OFF"}")
}

// v901: Rate Auto Limit901
internal fun PlayerActivity.showV901RateAutoLimit901Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v901rateAutoLimit901).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit901",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v901rateAutoLimit901 = value
        AppToast.show(this, "Rate Auto Limit901: $value")
    }
}

// v901: Raw Auto Decode901
internal fun PlayerActivity.showV901RawAutoDecode901Toggle() {
    val current = BiliClient.prefs.v901rawAutoDecode901
    BiliClient.prefs.v901rawAutoDecode901 = !current
    AppToast.show(this, "Raw Auto Decode901: ${if (!current) "ON" else "OFF"}")
}

// v901: Read Auto Bookmark901
internal fun PlayerActivity.showV901ReadAutoBookmark901Toggle() {
    val current = BiliClient.prefs.v901readAutoBookmark901
    BiliClient.prefs.v901readAutoBookmark901 = !current
    AppToast.show(this, "Read Auto Bookmark901: ${if (!current) "ON" else "OFF"}")
}

// v901: Ready Auto Check901
internal fun PlayerActivity.showV901ReadyAutoCheck901Toggle() {
    val current = BiliClient.prefs.v901readyAutoCheck901
    BiliClient.prefs.v901readyAutoCheck901 = !current
    AppToast.show(this, "Ready Auto Check901: ${if (!current) "ON" else "OFF"}")
}

// v901: Real Auto Time901
internal fun PlayerActivity.showV901RealAutoTime901Toggle() {
    val current = BiliClient.prefs.v901realAutoTime901
    BiliClient.prefs.v901realAutoTime901 = !current
    AppToast.show(this, "Real Auto Time901: ${if (!current) "ON" else "OFF"}")
}

// v901: Rebuild Auto Index901
internal fun PlayerActivity.showV901RebuildAutoIndex901Toggle() {
    val current = BiliClient.prefs.v901rebuildAutoIndex901
    BiliClient.prefs.v901rebuildAutoIndex901 = !current
    AppToast.show(this, "Rebuild Auto Index901: ${if (!current) "ON" else "OFF"}")
}

// v901: Record Auto History901
internal fun PlayerActivity.showV901RecordAutoHistory901Toggle() {
    val current = BiliClient.prefs.v901recordAutoHistory901
    BiliClient.prefs.v901recordAutoHistory901 = !current
    AppToast.show(this, "Record Auto History901: ${if (!current) "ON" else "OFF"}")
}

// v901: Recover Auto Session901
internal fun PlayerActivity.showV901RecoverAutoSession901Toggle() {
    val current = BiliClient.prefs.v901recoverAutoSession901
    BiliClient.prefs.v901recoverAutoSession901 = !current
    AppToast.show(this, "Recover Auto Session901: ${if (!current) "ON" else "OFF"}")
}

// v901: Recycle Auto Bin901
internal fun PlayerActivity.showV901RecycleAutoBin901Toggle() {
    val current = BiliClient.prefs.v901recycleAutoBin901
    BiliClient.prefs.v901recycleAutoBin901 = !current
    AppToast.show(this, "Recycle Auto Bin901: ${if (!current) "ON" else "OFF"}")
}

// v902: Quick Auto Action902
internal fun PlayerActivity.showV902QuickAutoAction902Toggle() {
    val current = BiliClient.prefs.v902quickAutoAction902
    BiliClient.prefs.v902quickAutoAction902 = !current
    AppToast.show(this, "Quick Auto Action902: ${if (!current) "ON" else "OFF"}")
}

// v902: Quit Auto Save902
internal fun PlayerActivity.showV902QuitAutoSave902Toggle() {
    val current = BiliClient.prefs.v902quitAutoSave902
    BiliClient.prefs.v902quitAutoSave902 = !current
    AppToast.show(this, "Quit Auto Save902: ${if (!current) "ON" else "OFF"}")
}

// v902: Quote Auto Format902
internal fun PlayerActivity.showV902QuoteAutoFormat902Toggle() {
    val current = BiliClient.prefs.v902quoteAutoFormat902
    BiliClient.prefs.v902quoteAutoFormat902 = !current
    AppToast.show(this, "Quote Auto Format902: ${if (!current) "ON" else "OFF"}")
}

// v902: Race Auto Condition902
internal fun PlayerActivity.showV902RaceAutoCondition902Toggle() {
    val current = BiliClient.prefs.v902raceAutoCondition902
    BiliClient.prefs.v902raceAutoCondition902 = !current
    AppToast.show(this, "Race Auto Condition902: ${if (!current) "ON" else "OFF"}")
}

// v902: Random Auto Shuffle902
internal fun PlayerActivity.showV902RandomAutoShuffle902Toggle() {
    val current = BiliClient.prefs.v902randomAutoShuffle902
    BiliClient.prefs.v902randomAutoShuffle902 = !current
    AppToast.show(this, "Random Auto Shuffle902: ${if (!current) "ON" else "OFF"}")
}

// v902: Range Auto Slider902
internal fun PlayerActivity.showV902RangeAutoSlider902Toggle() {
    val current = BiliClient.prefs.v902rangeAutoSlider902
    BiliClient.prefs.v902rangeAutoSlider902 = !current
    AppToast.show(this, "Range Auto Slider902: ${if (!current) "ON" else "OFF"}")
}

// v902: Rate Auto Limit902
internal fun PlayerActivity.showV902RateAutoLimit902Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v902rateAutoLimit902).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit902",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v902rateAutoLimit902 = value
        AppToast.show(this, "Rate Auto Limit902: $value")
    }
}

// v902: Raw Auto Decode902
internal fun PlayerActivity.showV902RawAutoDecode902Toggle() {
    val current = BiliClient.prefs.v902rawAutoDecode902
    BiliClient.prefs.v902rawAutoDecode902 = !current
    AppToast.show(this, "Raw Auto Decode902: ${if (!current) "ON" else "OFF"}")
}

// v902: Read Auto Bookmark902
internal fun PlayerActivity.showV902ReadAutoBookmark902Toggle() {
    val current = BiliClient.prefs.v902readAutoBookmark902
    BiliClient.prefs.v902readAutoBookmark902 = !current
    AppToast.show(this, "Read Auto Bookmark902: ${if (!current) "ON" else "OFF"}")
}

// v902: Ready Auto Check902
internal fun PlayerActivity.showV902ReadyAutoCheck902Toggle() {
    val current = BiliClient.prefs.v902readyAutoCheck902
    BiliClient.prefs.v902readyAutoCheck902 = !current
    AppToast.show(this, "Ready Auto Check902: ${if (!current) "ON" else "OFF"}")
}

// v902: Real Auto Time902
internal fun PlayerActivity.showV902RealAutoTime902Toggle() {
    val current = BiliClient.prefs.v902realAutoTime902
    BiliClient.prefs.v902realAutoTime902 = !current
    AppToast.show(this, "Real Auto Time902: ${if (!current) "ON" else "OFF"}")
}

// v902: Rebuild Auto Index902
internal fun PlayerActivity.showV902RebuildAutoIndex902Toggle() {
    val current = BiliClient.prefs.v902rebuildAutoIndex902
    BiliClient.prefs.v902rebuildAutoIndex902 = !current
    AppToast.show(this, "Rebuild Auto Index902: ${if (!current) "ON" else "OFF"}")
}

// v902: Record Auto History902
internal fun PlayerActivity.showV902RecordAutoHistory902Toggle() {
    val current = BiliClient.prefs.v902recordAutoHistory902
    BiliClient.prefs.v902recordAutoHistory902 = !current
    AppToast.show(this, "Record Auto History902: ${if (!current) "ON" else "OFF"}")
}

// v902: Recover Auto Session902
internal fun PlayerActivity.showV902RecoverAutoSession902Toggle() {
    val current = BiliClient.prefs.v902recoverAutoSession902
    BiliClient.prefs.v902recoverAutoSession902 = !current
    AppToast.show(this, "Recover Auto Session902: ${if (!current) "ON" else "OFF"}")
}

// v902: Recycle Auto Bin902
internal fun PlayerActivity.showV902RecycleAutoBin902Toggle() {
    val current = BiliClient.prefs.v902recycleAutoBin902
    BiliClient.prefs.v902recycleAutoBin902 = !current
    AppToast.show(this, "Recycle Auto Bin902: ${if (!current) "ON" else "OFF"}")
}

// v903: Quick Auto Action903
internal fun PlayerActivity.showV903QuickAutoAction903Toggle() {
    val current = BiliClient.prefs.v903quickAutoAction903
    BiliClient.prefs.v903quickAutoAction903 = !current
    AppToast.show(this, "Quick Auto Action903: ${if (!current) "ON" else "OFF"}")
}

// v903: Quit Auto Save903
internal fun PlayerActivity.showV903QuitAutoSave903Toggle() {
    val current = BiliClient.prefs.v903quitAutoSave903
    BiliClient.prefs.v903quitAutoSave903 = !current
    AppToast.show(this, "Quit Auto Save903: ${if (!current) "ON" else "OFF"}")
}

// v903: Quote Auto Format903
internal fun PlayerActivity.showV903QuoteAutoFormat903Toggle() {
    val current = BiliClient.prefs.v903quoteAutoFormat903
    BiliClient.prefs.v903quoteAutoFormat903 = !current
    AppToast.show(this, "Quote Auto Format903: ${if (!current) "ON" else "OFF"}")
}

// v903: Race Auto Condition903
internal fun PlayerActivity.showV903RaceAutoCondition903Toggle() {
    val current = BiliClient.prefs.v903raceAutoCondition903
    BiliClient.prefs.v903raceAutoCondition903 = !current
    AppToast.show(this, "Race Auto Condition903: ${if (!current) "ON" else "OFF"}")
}

// v903: Random Auto Shuffle903
internal fun PlayerActivity.showV903RandomAutoShuffle903Toggle() {
    val current = BiliClient.prefs.v903randomAutoShuffle903
    BiliClient.prefs.v903randomAutoShuffle903 = !current
    AppToast.show(this, "Random Auto Shuffle903: ${if (!current) "ON" else "OFF"}")
}

// v903: Range Auto Slider903
internal fun PlayerActivity.showV903RangeAutoSlider903Toggle() {
    val current = BiliClient.prefs.v903rangeAutoSlider903
    BiliClient.prefs.v903rangeAutoSlider903 = !current
    AppToast.show(this, "Range Auto Slider903: ${if (!current) "ON" else "OFF"}")
}

// v903: Rate Auto Limit903
internal fun PlayerActivity.showV903RateAutoLimit903Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v903rateAutoLimit903).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit903",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v903rateAutoLimit903 = value
        AppToast.show(this, "Rate Auto Limit903: $value")
    }
}

// v903: Raw Auto Decode903
internal fun PlayerActivity.showV903RawAutoDecode903Toggle() {
    val current = BiliClient.prefs.v903rawAutoDecode903
    BiliClient.prefs.v903rawAutoDecode903 = !current
    AppToast.show(this, "Raw Auto Decode903: ${if (!current) "ON" else "OFF"}")
}

// v903: Read Auto Bookmark903
internal fun PlayerActivity.showV903ReadAutoBookmark903Toggle() {
    val current = BiliClient.prefs.v903readAutoBookmark903
    BiliClient.prefs.v903readAutoBookmark903 = !current
    AppToast.show(this, "Read Auto Bookmark903: ${if (!current) "ON" else "OFF"}")
}

// v903: Ready Auto Check903
internal fun PlayerActivity.showV903ReadyAutoCheck903Toggle() {
    val current = BiliClient.prefs.v903readyAutoCheck903
    BiliClient.prefs.v903readyAutoCheck903 = !current
    AppToast.show(this, "Ready Auto Check903: ${if (!current) "ON" else "OFF"}")
}

// v903: Real Auto Time903
internal fun PlayerActivity.showV903RealAutoTime903Toggle() {
    val current = BiliClient.prefs.v903realAutoTime903
    BiliClient.prefs.v903realAutoTime903 = !current
    AppToast.show(this, "Real Auto Time903: ${if (!current) "ON" else "OFF"}")
}

// v903: Rebuild Auto Index903
internal fun PlayerActivity.showV903RebuildAutoIndex903Toggle() {
    val current = BiliClient.prefs.v903rebuildAutoIndex903
    BiliClient.prefs.v903rebuildAutoIndex903 = !current
    AppToast.show(this, "Rebuild Auto Index903: ${if (!current) "ON" else "OFF"}")
}

// v903: Record Auto History903
internal fun PlayerActivity.showV903RecordAutoHistory903Toggle() {
    val current = BiliClient.prefs.v903recordAutoHistory903
    BiliClient.prefs.v903recordAutoHistory903 = !current
    AppToast.show(this, "Record Auto History903: ${if (!current) "ON" else "OFF"}")
}

// v903: Recover Auto Session903
internal fun PlayerActivity.showV903RecoverAutoSession903Toggle() {
    val current = BiliClient.prefs.v903recoverAutoSession903
    BiliClient.prefs.v903recoverAutoSession903 = !current
    AppToast.show(this, "Recover Auto Session903: ${if (!current) "ON" else "OFF"}")
}

// v903: Recycle Auto Bin903
internal fun PlayerActivity.showV903RecycleAutoBin903Toggle() {
    val current = BiliClient.prefs.v903recycleAutoBin903
    BiliClient.prefs.v903recycleAutoBin903 = !current
    AppToast.show(this, "Recycle Auto Bin903: ${if (!current) "ON" else "OFF"}")
}

// v904: Quick Auto Action904
internal fun PlayerActivity.showV904QuickAutoAction904Toggle() {
    val current = BiliClient.prefs.v904quickAutoAction904
    BiliClient.prefs.v904quickAutoAction904 = !current
    AppToast.show(this, "Quick Auto Action904: ${if (!current) "ON" else "OFF"}")
}

// v904: Quit Auto Save904
internal fun PlayerActivity.showV904QuitAutoSave904Toggle() {
    val current = BiliClient.prefs.v904quitAutoSave904
    BiliClient.prefs.v904quitAutoSave904 = !current
    AppToast.show(this, "Quit Auto Save904: ${if (!current) "ON" else "OFF"}")
}

// v904: Quote Auto Format904
internal fun PlayerActivity.showV904QuoteAutoFormat904Toggle() {
    val current = BiliClient.prefs.v904quoteAutoFormat904
    BiliClient.prefs.v904quoteAutoFormat904 = !current
    AppToast.show(this, "Quote Auto Format904: ${if (!current) "ON" else "OFF"}")
}

// v904: Race Auto Condition904
internal fun PlayerActivity.showV904RaceAutoCondition904Toggle() {
    val current = BiliClient.prefs.v904raceAutoCondition904
    BiliClient.prefs.v904raceAutoCondition904 = !current
    AppToast.show(this, "Race Auto Condition904: ${if (!current) "ON" else "OFF"}")
}

// v904: Random Auto Shuffle904
internal fun PlayerActivity.showV904RandomAutoShuffle904Toggle() {
    val current = BiliClient.prefs.v904randomAutoShuffle904
    BiliClient.prefs.v904randomAutoShuffle904 = !current
    AppToast.show(this, "Random Auto Shuffle904: ${if (!current) "ON" else "OFF"}")
}

// v904: Range Auto Slider904
internal fun PlayerActivity.showV904RangeAutoSlider904Toggle() {
    val current = BiliClient.prefs.v904rangeAutoSlider904
    BiliClient.prefs.v904rangeAutoSlider904 = !current
    AppToast.show(this, "Range Auto Slider904: ${if (!current) "ON" else "OFF"}")
}

// v904: Rate Auto Limit904
internal fun PlayerActivity.showV904RateAutoLimit904Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v904rateAutoLimit904).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit904",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v904rateAutoLimit904 = value
        AppToast.show(this, "Rate Auto Limit904: $value")
    }
}

// v904: Raw Auto Decode904
internal fun PlayerActivity.showV904RawAutoDecode904Toggle() {
    val current = BiliClient.prefs.v904rawAutoDecode904
    BiliClient.prefs.v904rawAutoDecode904 = !current
    AppToast.show(this, "Raw Auto Decode904: ${if (!current) "ON" else "OFF"}")
}

// v904: Read Auto Bookmark904
internal fun PlayerActivity.showV904ReadAutoBookmark904Toggle() {
    val current = BiliClient.prefs.v904readAutoBookmark904
    BiliClient.prefs.v904readAutoBookmark904 = !current
    AppToast.show(this, "Read Auto Bookmark904: ${if (!current) "ON" else "OFF"}")
}

// v904: Ready Auto Check904
internal fun PlayerActivity.showV904ReadyAutoCheck904Toggle() {
    val current = BiliClient.prefs.v904readyAutoCheck904
    BiliClient.prefs.v904readyAutoCheck904 = !current
    AppToast.show(this, "Ready Auto Check904: ${if (!current) "ON" else "OFF"}")
}

// v904: Real Auto Time904
internal fun PlayerActivity.showV904RealAutoTime904Toggle() {
    val current = BiliClient.prefs.v904realAutoTime904
    BiliClient.prefs.v904realAutoTime904 = !current
    AppToast.show(this, "Real Auto Time904: ${if (!current) "ON" else "OFF"}")
}

// v904: Rebuild Auto Index904
internal fun PlayerActivity.showV904RebuildAutoIndex904Toggle() {
    val current = BiliClient.prefs.v904rebuildAutoIndex904
    BiliClient.prefs.v904rebuildAutoIndex904 = !current
    AppToast.show(this, "Rebuild Auto Index904: ${if (!current) "ON" else "OFF"}")
}

// v904: Record Auto History904
internal fun PlayerActivity.showV904RecordAutoHistory904Toggle() {
    val current = BiliClient.prefs.v904recordAutoHistory904
    BiliClient.prefs.v904recordAutoHistory904 = !current
    AppToast.show(this, "Record Auto History904: ${if (!current) "ON" else "OFF"}")
}

// v904: Recover Auto Session904
internal fun PlayerActivity.showV904RecoverAutoSession904Toggle() {
    val current = BiliClient.prefs.v904recoverAutoSession904
    BiliClient.prefs.v904recoverAutoSession904 = !current
    AppToast.show(this, "Recover Auto Session904: ${if (!current) "ON" else "OFF"}")
}

// v904: Recycle Auto Bin904
internal fun PlayerActivity.showV904RecycleAutoBin904Toggle() {
    val current = BiliClient.prefs.v904recycleAutoBin904
    BiliClient.prefs.v904recycleAutoBin904 = !current
    AppToast.show(this, "Recycle Auto Bin904: ${if (!current) "ON" else "OFF"}")
}

// v905: Quick Auto Action905
internal fun PlayerActivity.showV905QuickAutoAction905Toggle() {
    val current = BiliClient.prefs.v905quickAutoAction905
    BiliClient.prefs.v905quickAutoAction905 = !current
    AppToast.show(this, "Quick Auto Action905: ${if (!current) "ON" else "OFF"}")
}

// v905: Quit Auto Save905
internal fun PlayerActivity.showV905QuitAutoSave905Toggle() {
    val current = BiliClient.prefs.v905quitAutoSave905
    BiliClient.prefs.v905quitAutoSave905 = !current
    AppToast.show(this, "Quit Auto Save905: ${if (!current) "ON" else "OFF"}")
}

// v905: Quote Auto Format905
internal fun PlayerActivity.showV905QuoteAutoFormat905Toggle() {
    val current = BiliClient.prefs.v905quoteAutoFormat905
    BiliClient.prefs.v905quoteAutoFormat905 = !current
    AppToast.show(this, "Quote Auto Format905: ${if (!current) "ON" else "OFF"}")
}

// v905: Race Auto Condition905
internal fun PlayerActivity.showV905RaceAutoCondition905Toggle() {
    val current = BiliClient.prefs.v905raceAutoCondition905
    BiliClient.prefs.v905raceAutoCondition905 = !current
    AppToast.show(this, "Race Auto Condition905: ${if (!current) "ON" else "OFF"}")
}

// v905: Random Auto Shuffle905
internal fun PlayerActivity.showV905RandomAutoShuffle905Toggle() {
    val current = BiliClient.prefs.v905randomAutoShuffle905
    BiliClient.prefs.v905randomAutoShuffle905 = !current
    AppToast.show(this, "Random Auto Shuffle905: ${if (!current) "ON" else "OFF"}")
}

// v905: Range Auto Slider905
internal fun PlayerActivity.showV905RangeAutoSlider905Toggle() {
    val current = BiliClient.prefs.v905rangeAutoSlider905
    BiliClient.prefs.v905rangeAutoSlider905 = !current
    AppToast.show(this, "Range Auto Slider905: ${if (!current) "ON" else "OFF"}")
}

// v905: Rate Auto Limit905
internal fun PlayerActivity.showV905RateAutoLimit905Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v905rateAutoLimit905).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit905",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v905rateAutoLimit905 = value
        AppToast.show(this, "Rate Auto Limit905: $value")
    }
}

// v905: Raw Auto Decode905
internal fun PlayerActivity.showV905RawAutoDecode905Toggle() {
    val current = BiliClient.prefs.v905rawAutoDecode905
    BiliClient.prefs.v905rawAutoDecode905 = !current
    AppToast.show(this, "Raw Auto Decode905: ${if (!current) "ON" else "OFF"}")
}

// v905: Read Auto Bookmark905
internal fun PlayerActivity.showV905ReadAutoBookmark905Toggle() {
    val current = BiliClient.prefs.v905readAutoBookmark905
    BiliClient.prefs.v905readAutoBookmark905 = !current
    AppToast.show(this, "Read Auto Bookmark905: ${if (!current) "ON" else "OFF"}")
}

// v905: Ready Auto Check905
internal fun PlayerActivity.showV905ReadyAutoCheck905Toggle() {
    val current = BiliClient.prefs.v905readyAutoCheck905
    BiliClient.prefs.v905readyAutoCheck905 = !current
    AppToast.show(this, "Ready Auto Check905: ${if (!current) "ON" else "OFF"}")
}

// v905: Real Auto Time905
internal fun PlayerActivity.showV905RealAutoTime905Toggle() {
    val current = BiliClient.prefs.v905realAutoTime905
    BiliClient.prefs.v905realAutoTime905 = !current
    AppToast.show(this, "Real Auto Time905: ${if (!current) "ON" else "OFF"}")
}

// v905: Rebuild Auto Index905
internal fun PlayerActivity.showV905RebuildAutoIndex905Toggle() {
    val current = BiliClient.prefs.v905rebuildAutoIndex905
    BiliClient.prefs.v905rebuildAutoIndex905 = !current
    AppToast.show(this, "Rebuild Auto Index905: ${if (!current) "ON" else "OFF"}")
}

// v905: Record Auto History905
internal fun PlayerActivity.showV905RecordAutoHistory905Toggle() {
    val current = BiliClient.prefs.v905recordAutoHistory905
    BiliClient.prefs.v905recordAutoHistory905 = !current
    AppToast.show(this, "Record Auto History905: ${if (!current) "ON" else "OFF"}")
}

// v905: Recover Auto Session905
internal fun PlayerActivity.showV905RecoverAutoSession905Toggle() {
    val current = BiliClient.prefs.v905recoverAutoSession905
    BiliClient.prefs.v905recoverAutoSession905 = !current
    AppToast.show(this, "Recover Auto Session905: ${if (!current) "ON" else "OFF"}")
}

// v905: Recycle Auto Bin905
internal fun PlayerActivity.showV905RecycleAutoBin905Toggle() {
    val current = BiliClient.prefs.v905recycleAutoBin905
    BiliClient.prefs.v905recycleAutoBin905 = !current
    AppToast.show(this, "Recycle Auto Bin905: ${if (!current) "ON" else "OFF"}")
}

// v906: Quick Auto Action906
internal fun PlayerActivity.showV906QuickAutoAction906Toggle() {
    val current = BiliClient.prefs.v906quickAutoAction906
    BiliClient.prefs.v906quickAutoAction906 = !current
    AppToast.show(this, "Quick Auto Action906: ${if (!current) "ON" else "OFF"}")
}

// v906: Quit Auto Save906
internal fun PlayerActivity.showV906QuitAutoSave906Toggle() {
    val current = BiliClient.prefs.v906quitAutoSave906
    BiliClient.prefs.v906quitAutoSave906 = !current
    AppToast.show(this, "Quit Auto Save906: ${if (!current) "ON" else "OFF"}")
}

// v906: Quote Auto Format906
internal fun PlayerActivity.showV906QuoteAutoFormat906Toggle() {
    val current = BiliClient.prefs.v906quoteAutoFormat906
    BiliClient.prefs.v906quoteAutoFormat906 = !current
    AppToast.show(this, "Quote Auto Format906: ${if (!current) "ON" else "OFF"}")
}

// v906: Race Auto Condition906
internal fun PlayerActivity.showV906RaceAutoCondition906Toggle() {
    val current = BiliClient.prefs.v906raceAutoCondition906
    BiliClient.prefs.v906raceAutoCondition906 = !current
    AppToast.show(this, "Race Auto Condition906: ${if (!current) "ON" else "OFF"}")
}

// v906: Random Auto Shuffle906
internal fun PlayerActivity.showV906RandomAutoShuffle906Toggle() {
    val current = BiliClient.prefs.v906randomAutoShuffle906
    BiliClient.prefs.v906randomAutoShuffle906 = !current
    AppToast.show(this, "Random Auto Shuffle906: ${if (!current) "ON" else "OFF"}")
}

// v906: Range Auto Slider906
internal fun PlayerActivity.showV906RangeAutoSlider906Toggle() {
    val current = BiliClient.prefs.v906rangeAutoSlider906
    BiliClient.prefs.v906rangeAutoSlider906 = !current
    AppToast.show(this, "Range Auto Slider906: ${if (!current) "ON" else "OFF"}")
}

// v906: Rate Auto Limit906
internal fun PlayerActivity.showV906RateAutoLimit906Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v906rateAutoLimit906).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit906",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v906rateAutoLimit906 = value
        AppToast.show(this, "Rate Auto Limit906: $value")
    }
}

// v906: Raw Auto Decode906
internal fun PlayerActivity.showV906RawAutoDecode906Toggle() {
    val current = BiliClient.prefs.v906rawAutoDecode906
    BiliClient.prefs.v906rawAutoDecode906 = !current
    AppToast.show(this, "Raw Auto Decode906: ${if (!current) "ON" else "OFF"}")
}

// v906: Read Auto Bookmark906
internal fun PlayerActivity.showV906ReadAutoBookmark906Toggle() {
    val current = BiliClient.prefs.v906readAutoBookmark906
    BiliClient.prefs.v906readAutoBookmark906 = !current
    AppToast.show(this, "Read Auto Bookmark906: ${if (!current) "ON" else "OFF"}")
}

// v906: Ready Auto Check906
internal fun PlayerActivity.showV906ReadyAutoCheck906Toggle() {
    val current = BiliClient.prefs.v906readyAutoCheck906
    BiliClient.prefs.v906readyAutoCheck906 = !current
    AppToast.show(this, "Ready Auto Check906: ${if (!current) "ON" else "OFF"}")
}

// v906: Real Auto Time906
internal fun PlayerActivity.showV906RealAutoTime906Toggle() {
    val current = BiliClient.prefs.v906realAutoTime906
    BiliClient.prefs.v906realAutoTime906 = !current
    AppToast.show(this, "Real Auto Time906: ${if (!current) "ON" else "OFF"}")
}

// v906: Rebuild Auto Index906
internal fun PlayerActivity.showV906RebuildAutoIndex906Toggle() {
    val current = BiliClient.prefs.v906rebuildAutoIndex906
    BiliClient.prefs.v906rebuildAutoIndex906 = !current
    AppToast.show(this, "Rebuild Auto Index906: ${if (!current) "ON" else "OFF"}")
}

// v906: Record Auto History906
internal fun PlayerActivity.showV906RecordAutoHistory906Toggle() {
    val current = BiliClient.prefs.v906recordAutoHistory906
    BiliClient.prefs.v906recordAutoHistory906 = !current
    AppToast.show(this, "Record Auto History906: ${if (!current) "ON" else "OFF"}")
}

// v906: Recover Auto Session906
internal fun PlayerActivity.showV906RecoverAutoSession906Toggle() {
    val current = BiliClient.prefs.v906recoverAutoSession906
    BiliClient.prefs.v906recoverAutoSession906 = !current
    AppToast.show(this, "Recover Auto Session906: ${if (!current) "ON" else "OFF"}")
}

// v906: Recycle Auto Bin906
internal fun PlayerActivity.showV906RecycleAutoBin906Toggle() {
    val current = BiliClient.prefs.v906recycleAutoBin906
    BiliClient.prefs.v906recycleAutoBin906 = !current
    AppToast.show(this, "Recycle Auto Bin906: ${if (!current) "ON" else "OFF"}")
}

// v907: Quick Auto Action907
internal fun PlayerActivity.showV907QuickAutoAction907Toggle() {
    val current = BiliClient.prefs.v907quickAutoAction907
    BiliClient.prefs.v907quickAutoAction907 = !current
    AppToast.show(this, "Quick Auto Action907: ${if (!current) "ON" else "OFF"}")
}

// v907: Quit Auto Save907
internal fun PlayerActivity.showV907QuitAutoSave907Toggle() {
    val current = BiliClient.prefs.v907quitAutoSave907
    BiliClient.prefs.v907quitAutoSave907 = !current
    AppToast.show(this, "Quit Auto Save907: ${if (!current) "ON" else "OFF"}")
}

// v907: Quote Auto Format907
internal fun PlayerActivity.showV907QuoteAutoFormat907Toggle() {
    val current = BiliClient.prefs.v907quoteAutoFormat907
    BiliClient.prefs.v907quoteAutoFormat907 = !current
    AppToast.show(this, "Quote Auto Format907: ${if (!current) "ON" else "OFF"}")
}

// v907: Race Auto Condition907
internal fun PlayerActivity.showV907RaceAutoCondition907Toggle() {
    val current = BiliClient.prefs.v907raceAutoCondition907
    BiliClient.prefs.v907raceAutoCondition907 = !current
    AppToast.show(this, "Race Auto Condition907: ${if (!current) "ON" else "OFF"}")
}

// v907: Random Auto Shuffle907
internal fun PlayerActivity.showV907RandomAutoShuffle907Toggle() {
    val current = BiliClient.prefs.v907randomAutoShuffle907
    BiliClient.prefs.v907randomAutoShuffle907 = !current
    AppToast.show(this, "Random Auto Shuffle907: ${if (!current) "ON" else "OFF"}")
}

// v907: Range Auto Slider907
internal fun PlayerActivity.showV907RangeAutoSlider907Toggle() {
    val current = BiliClient.prefs.v907rangeAutoSlider907
    BiliClient.prefs.v907rangeAutoSlider907 = !current
    AppToast.show(this, "Range Auto Slider907: ${if (!current) "ON" else "OFF"}")
}

// v907: Rate Auto Limit907
internal fun PlayerActivity.showV907RateAutoLimit907Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v907rateAutoLimit907).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit907",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v907rateAutoLimit907 = value
        AppToast.show(this, "Rate Auto Limit907: $value")
    }
}

// v907: Raw Auto Decode907
internal fun PlayerActivity.showV907RawAutoDecode907Toggle() {
    val current = BiliClient.prefs.v907rawAutoDecode907
    BiliClient.prefs.v907rawAutoDecode907 = !current
    AppToast.show(this, "Raw Auto Decode907: ${if (!current) "ON" else "OFF"}")
}

// v907: Read Auto Bookmark907
internal fun PlayerActivity.showV907ReadAutoBookmark907Toggle() {
    val current = BiliClient.prefs.v907readAutoBookmark907
    BiliClient.prefs.v907readAutoBookmark907 = !current
    AppToast.show(this, "Read Auto Bookmark907: ${if (!current) "ON" else "OFF"}")
}

// v907: Ready Auto Check907
internal fun PlayerActivity.showV907ReadyAutoCheck907Toggle() {
    val current = BiliClient.prefs.v907readyAutoCheck907
    BiliClient.prefs.v907readyAutoCheck907 = !current
    AppToast.show(this, "Ready Auto Check907: ${if (!current) "ON" else "OFF"}")
}

// v907: Real Auto Time907
internal fun PlayerActivity.showV907RealAutoTime907Toggle() {
    val current = BiliClient.prefs.v907realAutoTime907
    BiliClient.prefs.v907realAutoTime907 = !current
    AppToast.show(this, "Real Auto Time907: ${if (!current) "ON" else "OFF"}")
}

// v907: Rebuild Auto Index907
internal fun PlayerActivity.showV907RebuildAutoIndex907Toggle() {
    val current = BiliClient.prefs.v907rebuildAutoIndex907
    BiliClient.prefs.v907rebuildAutoIndex907 = !current
    AppToast.show(this, "Rebuild Auto Index907: ${if (!current) "ON" else "OFF"}")
}

// v907: Record Auto History907
internal fun PlayerActivity.showV907RecordAutoHistory907Toggle() {
    val current = BiliClient.prefs.v907recordAutoHistory907
    BiliClient.prefs.v907recordAutoHistory907 = !current
    AppToast.show(this, "Record Auto History907: ${if (!current) "ON" else "OFF"}")
}

// v907: Recover Auto Session907
internal fun PlayerActivity.showV907RecoverAutoSession907Toggle() {
    val current = BiliClient.prefs.v907recoverAutoSession907
    BiliClient.prefs.v907recoverAutoSession907 = !current
    AppToast.show(this, "Recover Auto Session907: ${if (!current) "ON" else "OFF"}")
}

// v907: Recycle Auto Bin907
internal fun PlayerActivity.showV907RecycleAutoBin907Toggle() {
    val current = BiliClient.prefs.v907recycleAutoBin907
    BiliClient.prefs.v907recycleAutoBin907 = !current
    AppToast.show(this, "Recycle Auto Bin907: ${if (!current) "ON" else "OFF"}")
}

// v908: Quick Auto Action908
internal fun PlayerActivity.showV908QuickAutoAction908Toggle() {
    val current = BiliClient.prefs.v908quickAutoAction908
    BiliClient.prefs.v908quickAutoAction908 = !current
    AppToast.show(this, "Quick Auto Action908: ${if (!current) "ON" else "OFF"}")
}

// v908: Quit Auto Save908
internal fun PlayerActivity.showV908QuitAutoSave908Toggle() {
    val current = BiliClient.prefs.v908quitAutoSave908
    BiliClient.prefs.v908quitAutoSave908 = !current
    AppToast.show(this, "Quit Auto Save908: ${if (!current) "ON" else "OFF"}")
}

// v908: Quote Auto Format908
internal fun PlayerActivity.showV908QuoteAutoFormat908Toggle() {
    val current = BiliClient.prefs.v908quoteAutoFormat908
    BiliClient.prefs.v908quoteAutoFormat908 = !current
    AppToast.show(this, "Quote Auto Format908: ${if (!current) "ON" else "OFF"}")
}

// v908: Race Auto Condition908
internal fun PlayerActivity.showV908RaceAutoCondition908Toggle() {
    val current = BiliClient.prefs.v908raceAutoCondition908
    BiliClient.prefs.v908raceAutoCondition908 = !current
    AppToast.show(this, "Race Auto Condition908: ${if (!current) "ON" else "OFF"}")
}

// v908: Random Auto Shuffle908
internal fun PlayerActivity.showV908RandomAutoShuffle908Toggle() {
    val current = BiliClient.prefs.v908randomAutoShuffle908
    BiliClient.prefs.v908randomAutoShuffle908 = !current
    AppToast.show(this, "Random Auto Shuffle908: ${if (!current) "ON" else "OFF"}")
}

// v908: Range Auto Slider908
internal fun PlayerActivity.showV908RangeAutoSlider908Toggle() {
    val current = BiliClient.prefs.v908rangeAutoSlider908
    BiliClient.prefs.v908rangeAutoSlider908 = !current
    AppToast.show(this, "Range Auto Slider908: ${if (!current) "ON" else "OFF"}")
}

// v908: Rate Auto Limit908
internal fun PlayerActivity.showV908RateAutoLimit908Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v908rateAutoLimit908).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit908",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v908rateAutoLimit908 = value
        AppToast.show(this, "Rate Auto Limit908: $value")
    }
}

// v908: Raw Auto Decode908
internal fun PlayerActivity.showV908RawAutoDecode908Toggle() {
    val current = BiliClient.prefs.v908rawAutoDecode908
    BiliClient.prefs.v908rawAutoDecode908 = !current
    AppToast.show(this, "Raw Auto Decode908: ${if (!current) "ON" else "OFF"}")
}

// v908: Read Auto Bookmark908
internal fun PlayerActivity.showV908ReadAutoBookmark908Toggle() {
    val current = BiliClient.prefs.v908readAutoBookmark908
    BiliClient.prefs.v908readAutoBookmark908 = !current
    AppToast.show(this, "Read Auto Bookmark908: ${if (!current) "ON" else "OFF"}")
}

// v908: Ready Auto Check908
internal fun PlayerActivity.showV908ReadyAutoCheck908Toggle() {
    val current = BiliClient.prefs.v908readyAutoCheck908
    BiliClient.prefs.v908readyAutoCheck908 = !current
    AppToast.show(this, "Ready Auto Check908: ${if (!current) "ON" else "OFF"}")
}

// v908: Real Auto Time908
internal fun PlayerActivity.showV908RealAutoTime908Toggle() {
    val current = BiliClient.prefs.v908realAutoTime908
    BiliClient.prefs.v908realAutoTime908 = !current
    AppToast.show(this, "Real Auto Time908: ${if (!current) "ON" else "OFF"}")
}

// v908: Rebuild Auto Index908
internal fun PlayerActivity.showV908RebuildAutoIndex908Toggle() {
    val current = BiliClient.prefs.v908rebuildAutoIndex908
    BiliClient.prefs.v908rebuildAutoIndex908 = !current
    AppToast.show(this, "Rebuild Auto Index908: ${if (!current) "ON" else "OFF"}")
}

// v908: Record Auto History908
internal fun PlayerActivity.showV908RecordAutoHistory908Toggle() {
    val current = BiliClient.prefs.v908recordAutoHistory908
    BiliClient.prefs.v908recordAutoHistory908 = !current
    AppToast.show(this, "Record Auto History908: ${if (!current) "ON" else "OFF"}")
}

// v908: Recover Auto Session908
internal fun PlayerActivity.showV908RecoverAutoSession908Toggle() {
    val current = BiliClient.prefs.v908recoverAutoSession908
    BiliClient.prefs.v908recoverAutoSession908 = !current
    AppToast.show(this, "Recover Auto Session908: ${if (!current) "ON" else "OFF"}")
}

// v908: Recycle Auto Bin908
internal fun PlayerActivity.showV908RecycleAutoBin908Toggle() {
    val current = BiliClient.prefs.v908recycleAutoBin908
    BiliClient.prefs.v908recycleAutoBin908 = !current
    AppToast.show(this, "Recycle Auto Bin908: ${if (!current) "ON" else "OFF"}")
}

// v909: Quick Auto Action909
internal fun PlayerActivity.showV909QuickAutoAction909Toggle() {
    val current = BiliClient.prefs.v909quickAutoAction909
    BiliClient.prefs.v909quickAutoAction909 = !current
    AppToast.show(this, "Quick Auto Action909: ${if (!current) "ON" else "OFF"}")
}

// v909: Quit Auto Save909
internal fun PlayerActivity.showV909QuitAutoSave909Toggle() {
    val current = BiliClient.prefs.v909quitAutoSave909
    BiliClient.prefs.v909quitAutoSave909 = !current
    AppToast.show(this, "Quit Auto Save909: ${if (!current) "ON" else "OFF"}")
}

// v909: Quote Auto Format909
internal fun PlayerActivity.showV909QuoteAutoFormat909Toggle() {
    val current = BiliClient.prefs.v909quoteAutoFormat909
    BiliClient.prefs.v909quoteAutoFormat909 = !current
    AppToast.show(this, "Quote Auto Format909: ${if (!current) "ON" else "OFF"}")
}

// v909: Race Auto Condition909
internal fun PlayerActivity.showV909RaceAutoCondition909Toggle() {
    val current = BiliClient.prefs.v909raceAutoCondition909
    BiliClient.prefs.v909raceAutoCondition909 = !current
    AppToast.show(this, "Race Auto Condition909: ${if (!current) "ON" else "OFF"}")
}

// v909: Random Auto Shuffle909
internal fun PlayerActivity.showV909RandomAutoShuffle909Toggle() {
    val current = BiliClient.prefs.v909randomAutoShuffle909
    BiliClient.prefs.v909randomAutoShuffle909 = !current
    AppToast.show(this, "Random Auto Shuffle909: ${if (!current) "ON" else "OFF"}")
}

// v909: Range Auto Slider909
internal fun PlayerActivity.showV909RangeAutoSlider909Toggle() {
    val current = BiliClient.prefs.v909rangeAutoSlider909
    BiliClient.prefs.v909rangeAutoSlider909 = !current
    AppToast.show(this, "Range Auto Slider909: ${if (!current) "ON" else "OFF"}")
}

// v909: Rate Auto Limit909
internal fun PlayerActivity.showV909RateAutoLimit909Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v909rateAutoLimit909).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit909",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v909rateAutoLimit909 = value
        AppToast.show(this, "Rate Auto Limit909: $value")
    }
}

// v909: Raw Auto Decode909
internal fun PlayerActivity.showV909RawAutoDecode909Toggle() {
    val current = BiliClient.prefs.v909rawAutoDecode909
    BiliClient.prefs.v909rawAutoDecode909 = !current
    AppToast.show(this, "Raw Auto Decode909: ${if (!current) "ON" else "OFF"}")
}

// v909: Read Auto Bookmark909
internal fun PlayerActivity.showV909ReadAutoBookmark909Toggle() {
    val current = BiliClient.prefs.v909readAutoBookmark909
    BiliClient.prefs.v909readAutoBookmark909 = !current
    AppToast.show(this, "Read Auto Bookmark909: ${if (!current) "ON" else "OFF"}")
}

// v909: Ready Auto Check909
internal fun PlayerActivity.showV909ReadyAutoCheck909Toggle() {
    val current = BiliClient.prefs.v909readyAutoCheck909
    BiliClient.prefs.v909readyAutoCheck909 = !current
    AppToast.show(this, "Ready Auto Check909: ${if (!current) "ON" else "OFF"}")
}

// v909: Real Auto Time909
internal fun PlayerActivity.showV909RealAutoTime909Toggle() {
    val current = BiliClient.prefs.v909realAutoTime909
    BiliClient.prefs.v909realAutoTime909 = !current
    AppToast.show(this, "Real Auto Time909: ${if (!current) "ON" else "OFF"}")
}

// v909: Rebuild Auto Index909
internal fun PlayerActivity.showV909RebuildAutoIndex909Toggle() {
    val current = BiliClient.prefs.v909rebuildAutoIndex909
    BiliClient.prefs.v909rebuildAutoIndex909 = !current
    AppToast.show(this, "Rebuild Auto Index909: ${if (!current) "ON" else "OFF"}")
}

// v909: Record Auto History909
internal fun PlayerActivity.showV909RecordAutoHistory909Toggle() {
    val current = BiliClient.prefs.v909recordAutoHistory909
    BiliClient.prefs.v909recordAutoHistory909 = !current
    AppToast.show(this, "Record Auto History909: ${if (!current) "ON" else "OFF"}")
}

// v909: Recover Auto Session909
internal fun PlayerActivity.showV909RecoverAutoSession909Toggle() {
    val current = BiliClient.prefs.v909recoverAutoSession909
    BiliClient.prefs.v909recoverAutoSession909 = !current
    AppToast.show(this, "Recover Auto Session909: ${if (!current) "ON" else "OFF"}")
}

// v909: Recycle Auto Bin909
internal fun PlayerActivity.showV909RecycleAutoBin909Toggle() {
    val current = BiliClient.prefs.v909recycleAutoBin909
    BiliClient.prefs.v909recycleAutoBin909 = !current
    AppToast.show(this, "Recycle Auto Bin909: ${if (!current) "ON" else "OFF"}")
}

// v910: Quick Auto Action910
internal fun PlayerActivity.showV910QuickAutoAction910Toggle() {
    val current = BiliClient.prefs.v910quickAutoAction910
    BiliClient.prefs.v910quickAutoAction910 = !current
    AppToast.show(this, "Quick Auto Action910: ${if (!current) "ON" else "OFF"}")
}

// v910: Quit Auto Save910
internal fun PlayerActivity.showV910QuitAutoSave910Toggle() {
    val current = BiliClient.prefs.v910quitAutoSave910
    BiliClient.prefs.v910quitAutoSave910 = !current
    AppToast.show(this, "Quit Auto Save910: ${if (!current) "ON" else "OFF"}")
}

// v910: Quote Auto Format910
internal fun PlayerActivity.showV910QuoteAutoFormat910Toggle() {
    val current = BiliClient.prefs.v910quoteAutoFormat910
    BiliClient.prefs.v910quoteAutoFormat910 = !current
    AppToast.show(this, "Quote Auto Format910: ${if (!current) "ON" else "OFF"}")
}

// v910: Race Auto Condition910
internal fun PlayerActivity.showV910RaceAutoCondition910Toggle() {
    val current = BiliClient.prefs.v910raceAutoCondition910
    BiliClient.prefs.v910raceAutoCondition910 = !current
    AppToast.show(this, "Race Auto Condition910: ${if (!current) "ON" else "OFF"}")
}

// v910: Random Auto Shuffle910
internal fun PlayerActivity.showV910RandomAutoShuffle910Toggle() {
    val current = BiliClient.prefs.v910randomAutoShuffle910
    BiliClient.prefs.v910randomAutoShuffle910 = !current
    AppToast.show(this, "Random Auto Shuffle910: ${if (!current) "ON" else "OFF"}")
}

// v910: Range Auto Slider910
internal fun PlayerActivity.showV910RangeAutoSlider910Toggle() {
    val current = BiliClient.prefs.v910rangeAutoSlider910
    BiliClient.prefs.v910rangeAutoSlider910 = !current
    AppToast.show(this, "Range Auto Slider910: ${if (!current) "ON" else "OFF"}")
}

// v910: Rate Auto Limit910
internal fun PlayerActivity.showV910RateAutoLimit910Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v910rateAutoLimit910).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Rate Auto Limit910",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v910rateAutoLimit910 = value
        AppToast.show(this, "Rate Auto Limit910: $value")
    }
}

// v910: Raw Auto Decode910
internal fun PlayerActivity.showV910RawAutoDecode910Toggle() {
    val current = BiliClient.prefs.v910rawAutoDecode910
    BiliClient.prefs.v910rawAutoDecode910 = !current
    AppToast.show(this, "Raw Auto Decode910: ${if (!current) "ON" else "OFF"}")
}

// v910: Read Auto Bookmark910
internal fun PlayerActivity.showV910ReadAutoBookmark910Toggle() {
    val current = BiliClient.prefs.v910readAutoBookmark910
    BiliClient.prefs.v910readAutoBookmark910 = !current
    AppToast.show(this, "Read Auto Bookmark910: ${if (!current) "ON" else "OFF"}")
}

// v910: Ready Auto Check910
internal fun PlayerActivity.showV910ReadyAutoCheck910Toggle() {
    val current = BiliClient.prefs.v910readyAutoCheck910
    BiliClient.prefs.v910readyAutoCheck910 = !current
    AppToast.show(this, "Ready Auto Check910: ${if (!current) "ON" else "OFF"}")
}

// v910: Real Auto Time910
internal fun PlayerActivity.showV910RealAutoTime910Toggle() {
    val current = BiliClient.prefs.v910realAutoTime910
    BiliClient.prefs.v910realAutoTime910 = !current
    AppToast.show(this, "Real Auto Time910: ${if (!current) "ON" else "OFF"}")
}

// v910: Rebuild Auto Index910
internal fun PlayerActivity.showV910RebuildAutoIndex910Toggle() {
    val current = BiliClient.prefs.v910rebuildAutoIndex910
    BiliClient.prefs.v910rebuildAutoIndex910 = !current
    AppToast.show(this, "Rebuild Auto Index910: ${if (!current) "ON" else "OFF"}")
}

// v910: Record Auto History910
internal fun PlayerActivity.showV910RecordAutoHistory910Toggle() {
    val current = BiliClient.prefs.v910recordAutoHistory910
    BiliClient.prefs.v910recordAutoHistory910 = !current
    AppToast.show(this, "Record Auto History910: ${if (!current) "ON" else "OFF"}")
}

// v910: Recover Auto Session910
internal fun PlayerActivity.showV910RecoverAutoSession910Toggle() {
    val current = BiliClient.prefs.v910recoverAutoSession910
    BiliClient.prefs.v910recoverAutoSession910 = !current
    AppToast.show(this, "Recover Auto Session910: ${if (!current) "ON" else "OFF"}")
}

// v910: Recycle Auto Bin910
internal fun PlayerActivity.showV910RecycleAutoBin910Toggle() {
    val current = BiliClient.prefs.v910recycleAutoBin910
    BiliClient.prefs.v910recycleAutoBin910 = !current
    AppToast.show(this, "Recycle Auto Bin910: ${if (!current) "ON" else "OFF"}")
}

