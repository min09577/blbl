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

// v771: Init Auto Lazy771
internal fun PlayerActivity.showV771InitAutoLazy771Toggle() {
    val current = BiliClient.prefs.v771initAutoLazy771
    BiliClient.prefs.v771initAutoLazy771 = !current
    AppToast.show(this, "Init Auto Lazy771: ${if (!current) "ON" else "OFF"}")
}

// v771: Input Auto Validate771
internal fun PlayerActivity.showV771InputAutoValidate771Toggle() {
    val current = BiliClient.prefs.v771inputAutoValidate771
    BiliClient.prefs.v771inputAutoValidate771 = !current
    AppToast.show(this, "Input Auto Validate771: ${if (!current) "ON" else "OFF"}")
}

// v771: Insert Auto Position771
internal fun PlayerActivity.showV771InsertAutoPosition771Toggle() {
    val current = BiliClient.prefs.v771insertAutoPosition771
    BiliClient.prefs.v771insertAutoPosition771 = !current
    AppToast.show(this, "Insert Auto Position771: ${if (!current) "ON" else "OFF"}")
}

// v771: Install Auto Check771
internal fun PlayerActivity.showV771InstallAutoCheck771Toggle() {
    val current = BiliClient.prefs.v771installAutoCheck771
    BiliClient.prefs.v771installAutoCheck771 = !current
    AppToast.show(this, "Install Auto Check771: ${if (!current) "ON" else "OFF"}")
}

// v771: Instance Auto Pool771
internal fun PlayerActivity.showV771InstanceAutoPool771Toggle() {
    val current = BiliClient.prefs.v771instanceAutoPool771
    BiliClient.prefs.v771instanceAutoPool771 = !current
    AppToast.show(this, "Instance Auto Pool771: ${if (!current) "ON" else "OFF"}")
}

// v771: Intent Auto Route771
internal fun PlayerActivity.showV771IntentAutoRoute771Toggle() {
    val current = BiliClient.prefs.v771intentAutoRoute771
    BiliClient.prefs.v771intentAutoRoute771 = !current
    AppToast.show(this, "Intent Auto Route771: ${if (!current) "ON" else "OFF"}")
}

// v771: Interact Auto Haptic771
internal fun PlayerActivity.showV771InteractAutoHaptic771Toggle() {
    val current = BiliClient.prefs.v771interactAutoHaptic771
    BiliClient.prefs.v771interactAutoHaptic771 = !current
    AppToast.show(this, "Interact Auto Haptic771: ${if (!current) "ON" else "OFF"}")
}

// v771: Interface Auto Switch771
internal fun PlayerActivity.showV771InterfaceAutoSwitch771Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v771interfaceAutoSwitch771).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch771",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v771interfaceAutoSwitch771 = value
        AppToast.show(this, "Interface Auto Switch771: $value")
    }
}

// v771: Internal Auto Debug771
internal fun PlayerActivity.showV771InternalAutoDebug771Toggle() {
    val current = BiliClient.prefs.v771internalAutoDebug771
    BiliClient.prefs.v771internalAutoDebug771 = !current
    AppToast.show(this, "Internal Auto Debug771: ${if (!current) "ON" else "OFF"}")
}

// v771: Interval Auto Throttle771
internal fun PlayerActivity.showV771IntervalAutoThrottle771Toggle() {
    val current = BiliClient.prefs.v771intervalAutoThrottle771
    BiliClient.prefs.v771intervalAutoThrottle771 = !current
    AppToast.show(this, "Interval Auto Throttle771: ${if (!current) "ON" else "OFF"}")
}

// v771: Invoke Auto Reflect771
internal fun PlayerActivity.showV771InvokeAutoReflect771Toggle() {
    val current = BiliClient.prefs.v771invokeAutoReflect771
    BiliClient.prefs.v771invokeAutoReflect771 = !current
    AppToast.show(this, "Invoke Auto Reflect771: ${if (!current) "ON" else "OFF"}")
}

// v771: Item Auto Recycle771
internal fun PlayerActivity.showV771ItemAutoRecycle771Toggle() {
    val current = BiliClient.prefs.v771itemAutoRecycle771
    BiliClient.prefs.v771itemAutoRecycle771 = !current
    AppToast.show(this, "Item Auto Recycle771: ${if (!current) "ON" else "OFF"}")
}

// v771: Iterate Auto Paginate771
internal fun PlayerActivity.showV771IterateAutoPaginate771Toggle() {
    val current = BiliClient.prefs.v771iterateAutoPaginate771
    BiliClient.prefs.v771iterateAutoPaginate771 = !current
    AppToast.show(this, "Iterate Auto Paginate771: ${if (!current) "ON" else "OFF"}")
}

// v771: Join Auto Merge771
internal fun PlayerActivity.showV771JoinAutoMerge771Toggle() {
    val current = BiliClient.prefs.v771joinAutoMerge771
    BiliClient.prefs.v771joinAutoMerge771 = !current
    AppToast.show(this, "Join Auto Merge771: ${if (!current) "ON" else "OFF"}")
}

// v771: Json Auto Pretty771
internal fun PlayerActivity.showV771JsonAutoPretty771Toggle() {
    val current = BiliClient.prefs.v771jsonAutoPretty771
    BiliClient.prefs.v771jsonAutoPretty771 = !current
    AppToast.show(this, "Json Auto Pretty771: ${if (!current) "ON" else "OFF"}")
}

// v772: Init Auto Lazy772
internal fun PlayerActivity.showV772InitAutoLazy772Toggle() {
    val current = BiliClient.prefs.v772initAutoLazy772
    BiliClient.prefs.v772initAutoLazy772 = !current
    AppToast.show(this, "Init Auto Lazy772: ${if (!current) "ON" else "OFF"}")
}

// v772: Input Auto Validate772
internal fun PlayerActivity.showV772InputAutoValidate772Toggle() {
    val current = BiliClient.prefs.v772inputAutoValidate772
    BiliClient.prefs.v772inputAutoValidate772 = !current
    AppToast.show(this, "Input Auto Validate772: ${if (!current) "ON" else "OFF"}")
}

// v772: Insert Auto Position772
internal fun PlayerActivity.showV772InsertAutoPosition772Toggle() {
    val current = BiliClient.prefs.v772insertAutoPosition772
    BiliClient.prefs.v772insertAutoPosition772 = !current
    AppToast.show(this, "Insert Auto Position772: ${if (!current) "ON" else "OFF"}")
}

// v772: Install Auto Check772
internal fun PlayerActivity.showV772InstallAutoCheck772Toggle() {
    val current = BiliClient.prefs.v772installAutoCheck772
    BiliClient.prefs.v772installAutoCheck772 = !current
    AppToast.show(this, "Install Auto Check772: ${if (!current) "ON" else "OFF"}")
}

// v772: Instance Auto Pool772
internal fun PlayerActivity.showV772InstanceAutoPool772Toggle() {
    val current = BiliClient.prefs.v772instanceAutoPool772
    BiliClient.prefs.v772instanceAutoPool772 = !current
    AppToast.show(this, "Instance Auto Pool772: ${if (!current) "ON" else "OFF"}")
}

// v772: Intent Auto Route772
internal fun PlayerActivity.showV772IntentAutoRoute772Toggle() {
    val current = BiliClient.prefs.v772intentAutoRoute772
    BiliClient.prefs.v772intentAutoRoute772 = !current
    AppToast.show(this, "Intent Auto Route772: ${if (!current) "ON" else "OFF"}")
}

// v772: Interact Auto Haptic772
internal fun PlayerActivity.showV772InteractAutoHaptic772Toggle() {
    val current = BiliClient.prefs.v772interactAutoHaptic772
    BiliClient.prefs.v772interactAutoHaptic772 = !current
    AppToast.show(this, "Interact Auto Haptic772: ${if (!current) "ON" else "OFF"}")
}

// v772: Interface Auto Switch772
internal fun PlayerActivity.showV772InterfaceAutoSwitch772Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v772interfaceAutoSwitch772).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch772",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v772interfaceAutoSwitch772 = value
        AppToast.show(this, "Interface Auto Switch772: $value")
    }
}

// v772: Internal Auto Debug772
internal fun PlayerActivity.showV772InternalAutoDebug772Toggle() {
    val current = BiliClient.prefs.v772internalAutoDebug772
    BiliClient.prefs.v772internalAutoDebug772 = !current
    AppToast.show(this, "Internal Auto Debug772: ${if (!current) "ON" else "OFF"}")
}

// v772: Interval Auto Throttle772
internal fun PlayerActivity.showV772IntervalAutoThrottle772Toggle() {
    val current = BiliClient.prefs.v772intervalAutoThrottle772
    BiliClient.prefs.v772intervalAutoThrottle772 = !current
    AppToast.show(this, "Interval Auto Throttle772: ${if (!current) "ON" else "OFF"}")
}

// v772: Invoke Auto Reflect772
internal fun PlayerActivity.showV772InvokeAutoReflect772Toggle() {
    val current = BiliClient.prefs.v772invokeAutoReflect772
    BiliClient.prefs.v772invokeAutoReflect772 = !current
    AppToast.show(this, "Invoke Auto Reflect772: ${if (!current) "ON" else "OFF"}")
}

// v772: Item Auto Recycle772
internal fun PlayerActivity.showV772ItemAutoRecycle772Toggle() {
    val current = BiliClient.prefs.v772itemAutoRecycle772
    BiliClient.prefs.v772itemAutoRecycle772 = !current
    AppToast.show(this, "Item Auto Recycle772: ${if (!current) "ON" else "OFF"}")
}

// v772: Iterate Auto Paginate772
internal fun PlayerActivity.showV772IterateAutoPaginate772Toggle() {
    val current = BiliClient.prefs.v772iterateAutoPaginate772
    BiliClient.prefs.v772iterateAutoPaginate772 = !current
    AppToast.show(this, "Iterate Auto Paginate772: ${if (!current) "ON" else "OFF"}")
}

// v772: Join Auto Merge772
internal fun PlayerActivity.showV772JoinAutoMerge772Toggle() {
    val current = BiliClient.prefs.v772joinAutoMerge772
    BiliClient.prefs.v772joinAutoMerge772 = !current
    AppToast.show(this, "Join Auto Merge772: ${if (!current) "ON" else "OFF"}")
}

// v772: Json Auto Pretty772
internal fun PlayerActivity.showV772JsonAutoPretty772Toggle() {
    val current = BiliClient.prefs.v772jsonAutoPretty772
    BiliClient.prefs.v772jsonAutoPretty772 = !current
    AppToast.show(this, "Json Auto Pretty772: ${if (!current) "ON" else "OFF"}")
}

// v773: Init Auto Lazy773
internal fun PlayerActivity.showV773InitAutoLazy773Toggle() {
    val current = BiliClient.prefs.v773initAutoLazy773
    BiliClient.prefs.v773initAutoLazy773 = !current
    AppToast.show(this, "Init Auto Lazy773: ${if (!current) "ON" else "OFF"}")
}

// v773: Input Auto Validate773
internal fun PlayerActivity.showV773InputAutoValidate773Toggle() {
    val current = BiliClient.prefs.v773inputAutoValidate773
    BiliClient.prefs.v773inputAutoValidate773 = !current
    AppToast.show(this, "Input Auto Validate773: ${if (!current) "ON" else "OFF"}")
}

// v773: Insert Auto Position773
internal fun PlayerActivity.showV773InsertAutoPosition773Toggle() {
    val current = BiliClient.prefs.v773insertAutoPosition773
    BiliClient.prefs.v773insertAutoPosition773 = !current
    AppToast.show(this, "Insert Auto Position773: ${if (!current) "ON" else "OFF"}")
}

// v773: Install Auto Check773
internal fun PlayerActivity.showV773InstallAutoCheck773Toggle() {
    val current = BiliClient.prefs.v773installAutoCheck773
    BiliClient.prefs.v773installAutoCheck773 = !current
    AppToast.show(this, "Install Auto Check773: ${if (!current) "ON" else "OFF"}")
}

// v773: Instance Auto Pool773
internal fun PlayerActivity.showV773InstanceAutoPool773Toggle() {
    val current = BiliClient.prefs.v773instanceAutoPool773
    BiliClient.prefs.v773instanceAutoPool773 = !current
    AppToast.show(this, "Instance Auto Pool773: ${if (!current) "ON" else "OFF"}")
}

// v773: Intent Auto Route773
internal fun PlayerActivity.showV773IntentAutoRoute773Toggle() {
    val current = BiliClient.prefs.v773intentAutoRoute773
    BiliClient.prefs.v773intentAutoRoute773 = !current
    AppToast.show(this, "Intent Auto Route773: ${if (!current) "ON" else "OFF"}")
}

// v773: Interact Auto Haptic773
internal fun PlayerActivity.showV773InteractAutoHaptic773Toggle() {
    val current = BiliClient.prefs.v773interactAutoHaptic773
    BiliClient.prefs.v773interactAutoHaptic773 = !current
    AppToast.show(this, "Interact Auto Haptic773: ${if (!current) "ON" else "OFF"}")
}

// v773: Interface Auto Switch773
internal fun PlayerActivity.showV773InterfaceAutoSwitch773Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v773interfaceAutoSwitch773).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch773",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v773interfaceAutoSwitch773 = value
        AppToast.show(this, "Interface Auto Switch773: $value")
    }
}

// v773: Internal Auto Debug773
internal fun PlayerActivity.showV773InternalAutoDebug773Toggle() {
    val current = BiliClient.prefs.v773internalAutoDebug773
    BiliClient.prefs.v773internalAutoDebug773 = !current
    AppToast.show(this, "Internal Auto Debug773: ${if (!current) "ON" else "OFF"}")
}

// v773: Interval Auto Throttle773
internal fun PlayerActivity.showV773IntervalAutoThrottle773Toggle() {
    val current = BiliClient.prefs.v773intervalAutoThrottle773
    BiliClient.prefs.v773intervalAutoThrottle773 = !current
    AppToast.show(this, "Interval Auto Throttle773: ${if (!current) "ON" else "OFF"}")
}

// v773: Invoke Auto Reflect773
internal fun PlayerActivity.showV773InvokeAutoReflect773Toggle() {
    val current = BiliClient.prefs.v773invokeAutoReflect773
    BiliClient.prefs.v773invokeAutoReflect773 = !current
    AppToast.show(this, "Invoke Auto Reflect773: ${if (!current) "ON" else "OFF"}")
}

// v773: Item Auto Recycle773
internal fun PlayerActivity.showV773ItemAutoRecycle773Toggle() {
    val current = BiliClient.prefs.v773itemAutoRecycle773
    BiliClient.prefs.v773itemAutoRecycle773 = !current
    AppToast.show(this, "Item Auto Recycle773: ${if (!current) "ON" else "OFF"}")
}

// v773: Iterate Auto Paginate773
internal fun PlayerActivity.showV773IterateAutoPaginate773Toggle() {
    val current = BiliClient.prefs.v773iterateAutoPaginate773
    BiliClient.prefs.v773iterateAutoPaginate773 = !current
    AppToast.show(this, "Iterate Auto Paginate773: ${if (!current) "ON" else "OFF"}")
}

// v773: Join Auto Merge773
internal fun PlayerActivity.showV773JoinAutoMerge773Toggle() {
    val current = BiliClient.prefs.v773joinAutoMerge773
    BiliClient.prefs.v773joinAutoMerge773 = !current
    AppToast.show(this, "Join Auto Merge773: ${if (!current) "ON" else "OFF"}")
}

// v773: Json Auto Pretty773
internal fun PlayerActivity.showV773JsonAutoPretty773Toggle() {
    val current = BiliClient.prefs.v773jsonAutoPretty773
    BiliClient.prefs.v773jsonAutoPretty773 = !current
    AppToast.show(this, "Json Auto Pretty773: ${if (!current) "ON" else "OFF"}")
}

// v774: Init Auto Lazy774
internal fun PlayerActivity.showV774InitAutoLazy774Toggle() {
    val current = BiliClient.prefs.v774initAutoLazy774
    BiliClient.prefs.v774initAutoLazy774 = !current
    AppToast.show(this, "Init Auto Lazy774: ${if (!current) "ON" else "OFF"}")
}

// v774: Input Auto Validate774
internal fun PlayerActivity.showV774InputAutoValidate774Toggle() {
    val current = BiliClient.prefs.v774inputAutoValidate774
    BiliClient.prefs.v774inputAutoValidate774 = !current
    AppToast.show(this, "Input Auto Validate774: ${if (!current) "ON" else "OFF"}")
}

// v774: Insert Auto Position774
internal fun PlayerActivity.showV774InsertAutoPosition774Toggle() {
    val current = BiliClient.prefs.v774insertAutoPosition774
    BiliClient.prefs.v774insertAutoPosition774 = !current
    AppToast.show(this, "Insert Auto Position774: ${if (!current) "ON" else "OFF"}")
}

// v774: Install Auto Check774
internal fun PlayerActivity.showV774InstallAutoCheck774Toggle() {
    val current = BiliClient.prefs.v774installAutoCheck774
    BiliClient.prefs.v774installAutoCheck774 = !current
    AppToast.show(this, "Install Auto Check774: ${if (!current) "ON" else "OFF"}")
}

// v774: Instance Auto Pool774
internal fun PlayerActivity.showV774InstanceAutoPool774Toggle() {
    val current = BiliClient.prefs.v774instanceAutoPool774
    BiliClient.prefs.v774instanceAutoPool774 = !current
    AppToast.show(this, "Instance Auto Pool774: ${if (!current) "ON" else "OFF"}")
}

// v774: Intent Auto Route774
internal fun PlayerActivity.showV774IntentAutoRoute774Toggle() {
    val current = BiliClient.prefs.v774intentAutoRoute774
    BiliClient.prefs.v774intentAutoRoute774 = !current
    AppToast.show(this, "Intent Auto Route774: ${if (!current) "ON" else "OFF"}")
}

// v774: Interact Auto Haptic774
internal fun PlayerActivity.showV774InteractAutoHaptic774Toggle() {
    val current = BiliClient.prefs.v774interactAutoHaptic774
    BiliClient.prefs.v774interactAutoHaptic774 = !current
    AppToast.show(this, "Interact Auto Haptic774: ${if (!current) "ON" else "OFF"}")
}

// v774: Interface Auto Switch774
internal fun PlayerActivity.showV774InterfaceAutoSwitch774Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v774interfaceAutoSwitch774).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch774",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v774interfaceAutoSwitch774 = value
        AppToast.show(this, "Interface Auto Switch774: $value")
    }
}

// v774: Internal Auto Debug774
internal fun PlayerActivity.showV774InternalAutoDebug774Toggle() {
    val current = BiliClient.prefs.v774internalAutoDebug774
    BiliClient.prefs.v774internalAutoDebug774 = !current
    AppToast.show(this, "Internal Auto Debug774: ${if (!current) "ON" else "OFF"}")
}

// v774: Interval Auto Throttle774
internal fun PlayerActivity.showV774IntervalAutoThrottle774Toggle() {
    val current = BiliClient.prefs.v774intervalAutoThrottle774
    BiliClient.prefs.v774intervalAutoThrottle774 = !current
    AppToast.show(this, "Interval Auto Throttle774: ${if (!current) "ON" else "OFF"}")
}

// v774: Invoke Auto Reflect774
internal fun PlayerActivity.showV774InvokeAutoReflect774Toggle() {
    val current = BiliClient.prefs.v774invokeAutoReflect774
    BiliClient.prefs.v774invokeAutoReflect774 = !current
    AppToast.show(this, "Invoke Auto Reflect774: ${if (!current) "ON" else "OFF"}")
}

// v774: Item Auto Recycle774
internal fun PlayerActivity.showV774ItemAutoRecycle774Toggle() {
    val current = BiliClient.prefs.v774itemAutoRecycle774
    BiliClient.prefs.v774itemAutoRecycle774 = !current
    AppToast.show(this, "Item Auto Recycle774: ${if (!current) "ON" else "OFF"}")
}

// v774: Iterate Auto Paginate774
internal fun PlayerActivity.showV774IterateAutoPaginate774Toggle() {
    val current = BiliClient.prefs.v774iterateAutoPaginate774
    BiliClient.prefs.v774iterateAutoPaginate774 = !current
    AppToast.show(this, "Iterate Auto Paginate774: ${if (!current) "ON" else "OFF"}")
}

// v774: Join Auto Merge774
internal fun PlayerActivity.showV774JoinAutoMerge774Toggle() {
    val current = BiliClient.prefs.v774joinAutoMerge774
    BiliClient.prefs.v774joinAutoMerge774 = !current
    AppToast.show(this, "Join Auto Merge774: ${if (!current) "ON" else "OFF"}")
}

// v774: Json Auto Pretty774
internal fun PlayerActivity.showV774JsonAutoPretty774Toggle() {
    val current = BiliClient.prefs.v774jsonAutoPretty774
    BiliClient.prefs.v774jsonAutoPretty774 = !current
    AppToast.show(this, "Json Auto Pretty774: ${if (!current) "ON" else "OFF"}")
}

// v775: Init Auto Lazy775
internal fun PlayerActivity.showV775InitAutoLazy775Toggle() {
    val current = BiliClient.prefs.v775initAutoLazy775
    BiliClient.prefs.v775initAutoLazy775 = !current
    AppToast.show(this, "Init Auto Lazy775: ${if (!current) "ON" else "OFF"}")
}

// v775: Input Auto Validate775
internal fun PlayerActivity.showV775InputAutoValidate775Toggle() {
    val current = BiliClient.prefs.v775inputAutoValidate775
    BiliClient.prefs.v775inputAutoValidate775 = !current
    AppToast.show(this, "Input Auto Validate775: ${if (!current) "ON" else "OFF"}")
}

// v775: Insert Auto Position775
internal fun PlayerActivity.showV775InsertAutoPosition775Toggle() {
    val current = BiliClient.prefs.v775insertAutoPosition775
    BiliClient.prefs.v775insertAutoPosition775 = !current
    AppToast.show(this, "Insert Auto Position775: ${if (!current) "ON" else "OFF"}")
}

// v775: Install Auto Check775
internal fun PlayerActivity.showV775InstallAutoCheck775Toggle() {
    val current = BiliClient.prefs.v775installAutoCheck775
    BiliClient.prefs.v775installAutoCheck775 = !current
    AppToast.show(this, "Install Auto Check775: ${if (!current) "ON" else "OFF"}")
}

// v775: Instance Auto Pool775
internal fun PlayerActivity.showV775InstanceAutoPool775Toggle() {
    val current = BiliClient.prefs.v775instanceAutoPool775
    BiliClient.prefs.v775instanceAutoPool775 = !current
    AppToast.show(this, "Instance Auto Pool775: ${if (!current) "ON" else "OFF"}")
}

// v775: Intent Auto Route775
internal fun PlayerActivity.showV775IntentAutoRoute775Toggle() {
    val current = BiliClient.prefs.v775intentAutoRoute775
    BiliClient.prefs.v775intentAutoRoute775 = !current
    AppToast.show(this, "Intent Auto Route775: ${if (!current) "ON" else "OFF"}")
}

// v775: Interact Auto Haptic775
internal fun PlayerActivity.showV775InteractAutoHaptic775Toggle() {
    val current = BiliClient.prefs.v775interactAutoHaptic775
    BiliClient.prefs.v775interactAutoHaptic775 = !current
    AppToast.show(this, "Interact Auto Haptic775: ${if (!current) "ON" else "OFF"}")
}

// v775: Interface Auto Switch775
internal fun PlayerActivity.showV775InterfaceAutoSwitch775Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v775interfaceAutoSwitch775).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch775",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v775interfaceAutoSwitch775 = value
        AppToast.show(this, "Interface Auto Switch775: $value")
    }
}

// v775: Internal Auto Debug775
internal fun PlayerActivity.showV775InternalAutoDebug775Toggle() {
    val current = BiliClient.prefs.v775internalAutoDebug775
    BiliClient.prefs.v775internalAutoDebug775 = !current
    AppToast.show(this, "Internal Auto Debug775: ${if (!current) "ON" else "OFF"}")
}

// v775: Interval Auto Throttle775
internal fun PlayerActivity.showV775IntervalAutoThrottle775Toggle() {
    val current = BiliClient.prefs.v775intervalAutoThrottle775
    BiliClient.prefs.v775intervalAutoThrottle775 = !current
    AppToast.show(this, "Interval Auto Throttle775: ${if (!current) "ON" else "OFF"}")
}

// v775: Invoke Auto Reflect775
internal fun PlayerActivity.showV775InvokeAutoReflect775Toggle() {
    val current = BiliClient.prefs.v775invokeAutoReflect775
    BiliClient.prefs.v775invokeAutoReflect775 = !current
    AppToast.show(this, "Invoke Auto Reflect775: ${if (!current) "ON" else "OFF"}")
}

// v775: Item Auto Recycle775
internal fun PlayerActivity.showV775ItemAutoRecycle775Toggle() {
    val current = BiliClient.prefs.v775itemAutoRecycle775
    BiliClient.prefs.v775itemAutoRecycle775 = !current
    AppToast.show(this, "Item Auto Recycle775: ${if (!current) "ON" else "OFF"}")
}

// v775: Iterate Auto Paginate775
internal fun PlayerActivity.showV775IterateAutoPaginate775Toggle() {
    val current = BiliClient.prefs.v775iterateAutoPaginate775
    BiliClient.prefs.v775iterateAutoPaginate775 = !current
    AppToast.show(this, "Iterate Auto Paginate775: ${if (!current) "ON" else "OFF"}")
}

// v775: Join Auto Merge775
internal fun PlayerActivity.showV775JoinAutoMerge775Toggle() {
    val current = BiliClient.prefs.v775joinAutoMerge775
    BiliClient.prefs.v775joinAutoMerge775 = !current
    AppToast.show(this, "Join Auto Merge775: ${if (!current) "ON" else "OFF"}")
}

// v775: Json Auto Pretty775
internal fun PlayerActivity.showV775JsonAutoPretty775Toggle() {
    val current = BiliClient.prefs.v775jsonAutoPretty775
    BiliClient.prefs.v775jsonAutoPretty775 = !current
    AppToast.show(this, "Json Auto Pretty775: ${if (!current) "ON" else "OFF"}")
}

// v776: Init Auto Lazy776
internal fun PlayerActivity.showV776InitAutoLazy776Toggle() {
    val current = BiliClient.prefs.v776initAutoLazy776
    BiliClient.prefs.v776initAutoLazy776 = !current
    AppToast.show(this, "Init Auto Lazy776: ${if (!current) "ON" else "OFF"}")
}

// v776: Input Auto Validate776
internal fun PlayerActivity.showV776InputAutoValidate776Toggle() {
    val current = BiliClient.prefs.v776inputAutoValidate776
    BiliClient.prefs.v776inputAutoValidate776 = !current
    AppToast.show(this, "Input Auto Validate776: ${if (!current) "ON" else "OFF"}")
}

// v776: Insert Auto Position776
internal fun PlayerActivity.showV776InsertAutoPosition776Toggle() {
    val current = BiliClient.prefs.v776insertAutoPosition776
    BiliClient.prefs.v776insertAutoPosition776 = !current
    AppToast.show(this, "Insert Auto Position776: ${if (!current) "ON" else "OFF"}")
}

// v776: Install Auto Check776
internal fun PlayerActivity.showV776InstallAutoCheck776Toggle() {
    val current = BiliClient.prefs.v776installAutoCheck776
    BiliClient.prefs.v776installAutoCheck776 = !current
    AppToast.show(this, "Install Auto Check776: ${if (!current) "ON" else "OFF"}")
}

// v776: Instance Auto Pool776
internal fun PlayerActivity.showV776InstanceAutoPool776Toggle() {
    val current = BiliClient.prefs.v776instanceAutoPool776
    BiliClient.prefs.v776instanceAutoPool776 = !current
    AppToast.show(this, "Instance Auto Pool776: ${if (!current) "ON" else "OFF"}")
}

// v776: Intent Auto Route776
internal fun PlayerActivity.showV776IntentAutoRoute776Toggle() {
    val current = BiliClient.prefs.v776intentAutoRoute776
    BiliClient.prefs.v776intentAutoRoute776 = !current
    AppToast.show(this, "Intent Auto Route776: ${if (!current) "ON" else "OFF"}")
}

// v776: Interact Auto Haptic776
internal fun PlayerActivity.showV776InteractAutoHaptic776Toggle() {
    val current = BiliClient.prefs.v776interactAutoHaptic776
    BiliClient.prefs.v776interactAutoHaptic776 = !current
    AppToast.show(this, "Interact Auto Haptic776: ${if (!current) "ON" else "OFF"}")
}

// v776: Interface Auto Switch776
internal fun PlayerActivity.showV776InterfaceAutoSwitch776Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v776interfaceAutoSwitch776).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch776",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v776interfaceAutoSwitch776 = value
        AppToast.show(this, "Interface Auto Switch776: $value")
    }
}

// v776: Internal Auto Debug776
internal fun PlayerActivity.showV776InternalAutoDebug776Toggle() {
    val current = BiliClient.prefs.v776internalAutoDebug776
    BiliClient.prefs.v776internalAutoDebug776 = !current
    AppToast.show(this, "Internal Auto Debug776: ${if (!current) "ON" else "OFF"}")
}

// v776: Interval Auto Throttle776
internal fun PlayerActivity.showV776IntervalAutoThrottle776Toggle() {
    val current = BiliClient.prefs.v776intervalAutoThrottle776
    BiliClient.prefs.v776intervalAutoThrottle776 = !current
    AppToast.show(this, "Interval Auto Throttle776: ${if (!current) "ON" else "OFF"}")
}

// v776: Invoke Auto Reflect776
internal fun PlayerActivity.showV776InvokeAutoReflect776Toggle() {
    val current = BiliClient.prefs.v776invokeAutoReflect776
    BiliClient.prefs.v776invokeAutoReflect776 = !current
    AppToast.show(this, "Invoke Auto Reflect776: ${if (!current) "ON" else "OFF"}")
}

// v776: Item Auto Recycle776
internal fun PlayerActivity.showV776ItemAutoRecycle776Toggle() {
    val current = BiliClient.prefs.v776itemAutoRecycle776
    BiliClient.prefs.v776itemAutoRecycle776 = !current
    AppToast.show(this, "Item Auto Recycle776: ${if (!current) "ON" else "OFF"}")
}

// v776: Iterate Auto Paginate776
internal fun PlayerActivity.showV776IterateAutoPaginate776Toggle() {
    val current = BiliClient.prefs.v776iterateAutoPaginate776
    BiliClient.prefs.v776iterateAutoPaginate776 = !current
    AppToast.show(this, "Iterate Auto Paginate776: ${if (!current) "ON" else "OFF"}")
}

// v776: Join Auto Merge776
internal fun PlayerActivity.showV776JoinAutoMerge776Toggle() {
    val current = BiliClient.prefs.v776joinAutoMerge776
    BiliClient.prefs.v776joinAutoMerge776 = !current
    AppToast.show(this, "Join Auto Merge776: ${if (!current) "ON" else "OFF"}")
}

// v776: Json Auto Pretty776
internal fun PlayerActivity.showV776JsonAutoPretty776Toggle() {
    val current = BiliClient.prefs.v776jsonAutoPretty776
    BiliClient.prefs.v776jsonAutoPretty776 = !current
    AppToast.show(this, "Json Auto Pretty776: ${if (!current) "ON" else "OFF"}")
}

// v777: Init Auto Lazy777
internal fun PlayerActivity.showV777InitAutoLazy777Toggle() {
    val current = BiliClient.prefs.v777initAutoLazy777
    BiliClient.prefs.v777initAutoLazy777 = !current
    AppToast.show(this, "Init Auto Lazy777: ${if (!current) "ON" else "OFF"}")
}

// v777: Input Auto Validate777
internal fun PlayerActivity.showV777InputAutoValidate777Toggle() {
    val current = BiliClient.prefs.v777inputAutoValidate777
    BiliClient.prefs.v777inputAutoValidate777 = !current
    AppToast.show(this, "Input Auto Validate777: ${if (!current) "ON" else "OFF"}")
}

// v777: Insert Auto Position777
internal fun PlayerActivity.showV777InsertAutoPosition777Toggle() {
    val current = BiliClient.prefs.v777insertAutoPosition777
    BiliClient.prefs.v777insertAutoPosition777 = !current
    AppToast.show(this, "Insert Auto Position777: ${if (!current) "ON" else "OFF"}")
}

// v777: Install Auto Check777
internal fun PlayerActivity.showV777InstallAutoCheck777Toggle() {
    val current = BiliClient.prefs.v777installAutoCheck777
    BiliClient.prefs.v777installAutoCheck777 = !current
    AppToast.show(this, "Install Auto Check777: ${if (!current) "ON" else "OFF"}")
}

// v777: Instance Auto Pool777
internal fun PlayerActivity.showV777InstanceAutoPool777Toggle() {
    val current = BiliClient.prefs.v777instanceAutoPool777
    BiliClient.prefs.v777instanceAutoPool777 = !current
    AppToast.show(this, "Instance Auto Pool777: ${if (!current) "ON" else "OFF"}")
}

// v777: Intent Auto Route777
internal fun PlayerActivity.showV777IntentAutoRoute777Toggle() {
    val current = BiliClient.prefs.v777intentAutoRoute777
    BiliClient.prefs.v777intentAutoRoute777 = !current
    AppToast.show(this, "Intent Auto Route777: ${if (!current) "ON" else "OFF"}")
}

// v777: Interact Auto Haptic777
internal fun PlayerActivity.showV777InteractAutoHaptic777Toggle() {
    val current = BiliClient.prefs.v777interactAutoHaptic777
    BiliClient.prefs.v777interactAutoHaptic777 = !current
    AppToast.show(this, "Interact Auto Haptic777: ${if (!current) "ON" else "OFF"}")
}

// v777: Interface Auto Switch777
internal fun PlayerActivity.showV777InterfaceAutoSwitch777Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v777interfaceAutoSwitch777).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch777",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v777interfaceAutoSwitch777 = value
        AppToast.show(this, "Interface Auto Switch777: $value")
    }
}

// v777: Internal Auto Debug777
internal fun PlayerActivity.showV777InternalAutoDebug777Toggle() {
    val current = BiliClient.prefs.v777internalAutoDebug777
    BiliClient.prefs.v777internalAutoDebug777 = !current
    AppToast.show(this, "Internal Auto Debug777: ${if (!current) "ON" else "OFF"}")
}

// v777: Interval Auto Throttle777
internal fun PlayerActivity.showV777IntervalAutoThrottle777Toggle() {
    val current = BiliClient.prefs.v777intervalAutoThrottle777
    BiliClient.prefs.v777intervalAutoThrottle777 = !current
    AppToast.show(this, "Interval Auto Throttle777: ${if (!current) "ON" else "OFF"}")
}

// v777: Invoke Auto Reflect777
internal fun PlayerActivity.showV777InvokeAutoReflect777Toggle() {
    val current = BiliClient.prefs.v777invokeAutoReflect777
    BiliClient.prefs.v777invokeAutoReflect777 = !current
    AppToast.show(this, "Invoke Auto Reflect777: ${if (!current) "ON" else "OFF"}")
}

// v777: Item Auto Recycle777
internal fun PlayerActivity.showV777ItemAutoRecycle777Toggle() {
    val current = BiliClient.prefs.v777itemAutoRecycle777
    BiliClient.prefs.v777itemAutoRecycle777 = !current
    AppToast.show(this, "Item Auto Recycle777: ${if (!current) "ON" else "OFF"}")
}

// v777: Iterate Auto Paginate777
internal fun PlayerActivity.showV777IterateAutoPaginate777Toggle() {
    val current = BiliClient.prefs.v777iterateAutoPaginate777
    BiliClient.prefs.v777iterateAutoPaginate777 = !current
    AppToast.show(this, "Iterate Auto Paginate777: ${if (!current) "ON" else "OFF"}")
}

// v777: Join Auto Merge777
internal fun PlayerActivity.showV777JoinAutoMerge777Toggle() {
    val current = BiliClient.prefs.v777joinAutoMerge777
    BiliClient.prefs.v777joinAutoMerge777 = !current
    AppToast.show(this, "Join Auto Merge777: ${if (!current) "ON" else "OFF"}")
}

// v777: Json Auto Pretty777
internal fun PlayerActivity.showV777JsonAutoPretty777Toggle() {
    val current = BiliClient.prefs.v777jsonAutoPretty777
    BiliClient.prefs.v777jsonAutoPretty777 = !current
    AppToast.show(this, "Json Auto Pretty777: ${if (!current) "ON" else "OFF"}")
}

// v778: Init Auto Lazy778
internal fun PlayerActivity.showV778InitAutoLazy778Toggle() {
    val current = BiliClient.prefs.v778initAutoLazy778
    BiliClient.prefs.v778initAutoLazy778 = !current
    AppToast.show(this, "Init Auto Lazy778: ${if (!current) "ON" else "OFF"}")
}

// v778: Input Auto Validate778
internal fun PlayerActivity.showV778InputAutoValidate778Toggle() {
    val current = BiliClient.prefs.v778inputAutoValidate778
    BiliClient.prefs.v778inputAutoValidate778 = !current
    AppToast.show(this, "Input Auto Validate778: ${if (!current) "ON" else "OFF"}")
}

// v778: Insert Auto Position778
internal fun PlayerActivity.showV778InsertAutoPosition778Toggle() {
    val current = BiliClient.prefs.v778insertAutoPosition778
    BiliClient.prefs.v778insertAutoPosition778 = !current
    AppToast.show(this, "Insert Auto Position778: ${if (!current) "ON" else "OFF"}")
}

// v778: Install Auto Check778
internal fun PlayerActivity.showV778InstallAutoCheck778Toggle() {
    val current = BiliClient.prefs.v778installAutoCheck778
    BiliClient.prefs.v778installAutoCheck778 = !current
    AppToast.show(this, "Install Auto Check778: ${if (!current) "ON" else "OFF"}")
}

// v778: Instance Auto Pool778
internal fun PlayerActivity.showV778InstanceAutoPool778Toggle() {
    val current = BiliClient.prefs.v778instanceAutoPool778
    BiliClient.prefs.v778instanceAutoPool778 = !current
    AppToast.show(this, "Instance Auto Pool778: ${if (!current) "ON" else "OFF"}")
}

// v778: Intent Auto Route778
internal fun PlayerActivity.showV778IntentAutoRoute778Toggle() {
    val current = BiliClient.prefs.v778intentAutoRoute778
    BiliClient.prefs.v778intentAutoRoute778 = !current
    AppToast.show(this, "Intent Auto Route778: ${if (!current) "ON" else "OFF"}")
}

// v778: Interact Auto Haptic778
internal fun PlayerActivity.showV778InteractAutoHaptic778Toggle() {
    val current = BiliClient.prefs.v778interactAutoHaptic778
    BiliClient.prefs.v778interactAutoHaptic778 = !current
    AppToast.show(this, "Interact Auto Haptic778: ${if (!current) "ON" else "OFF"}")
}

// v778: Interface Auto Switch778
internal fun PlayerActivity.showV778InterfaceAutoSwitch778Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v778interfaceAutoSwitch778).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch778",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v778interfaceAutoSwitch778 = value
        AppToast.show(this, "Interface Auto Switch778: $value")
    }
}

// v778: Internal Auto Debug778
internal fun PlayerActivity.showV778InternalAutoDebug778Toggle() {
    val current = BiliClient.prefs.v778internalAutoDebug778
    BiliClient.prefs.v778internalAutoDebug778 = !current
    AppToast.show(this, "Internal Auto Debug778: ${if (!current) "ON" else "OFF"}")
}

// v778: Interval Auto Throttle778
internal fun PlayerActivity.showV778IntervalAutoThrottle778Toggle() {
    val current = BiliClient.prefs.v778intervalAutoThrottle778
    BiliClient.prefs.v778intervalAutoThrottle778 = !current
    AppToast.show(this, "Interval Auto Throttle778: ${if (!current) "ON" else "OFF"}")
}

// v778: Invoke Auto Reflect778
internal fun PlayerActivity.showV778InvokeAutoReflect778Toggle() {
    val current = BiliClient.prefs.v778invokeAutoReflect778
    BiliClient.prefs.v778invokeAutoReflect778 = !current
    AppToast.show(this, "Invoke Auto Reflect778: ${if (!current) "ON" else "OFF"}")
}

// v778: Item Auto Recycle778
internal fun PlayerActivity.showV778ItemAutoRecycle778Toggle() {
    val current = BiliClient.prefs.v778itemAutoRecycle778
    BiliClient.prefs.v778itemAutoRecycle778 = !current
    AppToast.show(this, "Item Auto Recycle778: ${if (!current) "ON" else "OFF"}")
}

// v778: Iterate Auto Paginate778
internal fun PlayerActivity.showV778IterateAutoPaginate778Toggle() {
    val current = BiliClient.prefs.v778iterateAutoPaginate778
    BiliClient.prefs.v778iterateAutoPaginate778 = !current
    AppToast.show(this, "Iterate Auto Paginate778: ${if (!current) "ON" else "OFF"}")
}

// v778: Join Auto Merge778
internal fun PlayerActivity.showV778JoinAutoMerge778Toggle() {
    val current = BiliClient.prefs.v778joinAutoMerge778
    BiliClient.prefs.v778joinAutoMerge778 = !current
    AppToast.show(this, "Join Auto Merge778: ${if (!current) "ON" else "OFF"}")
}

// v778: Json Auto Pretty778
internal fun PlayerActivity.showV778JsonAutoPretty778Toggle() {
    val current = BiliClient.prefs.v778jsonAutoPretty778
    BiliClient.prefs.v778jsonAutoPretty778 = !current
    AppToast.show(this, "Json Auto Pretty778: ${if (!current) "ON" else "OFF"}")
}

// v779: Init Auto Lazy779
internal fun PlayerActivity.showV779InitAutoLazy779Toggle() {
    val current = BiliClient.prefs.v779initAutoLazy779
    BiliClient.prefs.v779initAutoLazy779 = !current
    AppToast.show(this, "Init Auto Lazy779: ${if (!current) "ON" else "OFF"}")
}

// v779: Input Auto Validate779
internal fun PlayerActivity.showV779InputAutoValidate779Toggle() {
    val current = BiliClient.prefs.v779inputAutoValidate779
    BiliClient.prefs.v779inputAutoValidate779 = !current
    AppToast.show(this, "Input Auto Validate779: ${if (!current) "ON" else "OFF"}")
}

// v779: Insert Auto Position779
internal fun PlayerActivity.showV779InsertAutoPosition779Toggle() {
    val current = BiliClient.prefs.v779insertAutoPosition779
    BiliClient.prefs.v779insertAutoPosition779 = !current
    AppToast.show(this, "Insert Auto Position779: ${if (!current) "ON" else "OFF"}")
}

// v779: Install Auto Check779
internal fun PlayerActivity.showV779InstallAutoCheck779Toggle() {
    val current = BiliClient.prefs.v779installAutoCheck779
    BiliClient.prefs.v779installAutoCheck779 = !current
    AppToast.show(this, "Install Auto Check779: ${if (!current) "ON" else "OFF"}")
}

// v779: Instance Auto Pool779
internal fun PlayerActivity.showV779InstanceAutoPool779Toggle() {
    val current = BiliClient.prefs.v779instanceAutoPool779
    BiliClient.prefs.v779instanceAutoPool779 = !current
    AppToast.show(this, "Instance Auto Pool779: ${if (!current) "ON" else "OFF"}")
}

// v779: Intent Auto Route779
internal fun PlayerActivity.showV779IntentAutoRoute779Toggle() {
    val current = BiliClient.prefs.v779intentAutoRoute779
    BiliClient.prefs.v779intentAutoRoute779 = !current
    AppToast.show(this, "Intent Auto Route779: ${if (!current) "ON" else "OFF"}")
}

// v779: Interact Auto Haptic779
internal fun PlayerActivity.showV779InteractAutoHaptic779Toggle() {
    val current = BiliClient.prefs.v779interactAutoHaptic779
    BiliClient.prefs.v779interactAutoHaptic779 = !current
    AppToast.show(this, "Interact Auto Haptic779: ${if (!current) "ON" else "OFF"}")
}

// v779: Interface Auto Switch779
internal fun PlayerActivity.showV779InterfaceAutoSwitch779Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v779interfaceAutoSwitch779).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch779",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v779interfaceAutoSwitch779 = value
        AppToast.show(this, "Interface Auto Switch779: $value")
    }
}

// v779: Internal Auto Debug779
internal fun PlayerActivity.showV779InternalAutoDebug779Toggle() {
    val current = BiliClient.prefs.v779internalAutoDebug779
    BiliClient.prefs.v779internalAutoDebug779 = !current
    AppToast.show(this, "Internal Auto Debug779: ${if (!current) "ON" else "OFF"}")
}

// v779: Interval Auto Throttle779
internal fun PlayerActivity.showV779IntervalAutoThrottle779Toggle() {
    val current = BiliClient.prefs.v779intervalAutoThrottle779
    BiliClient.prefs.v779intervalAutoThrottle779 = !current
    AppToast.show(this, "Interval Auto Throttle779: ${if (!current) "ON" else "OFF"}")
}

// v779: Invoke Auto Reflect779
internal fun PlayerActivity.showV779InvokeAutoReflect779Toggle() {
    val current = BiliClient.prefs.v779invokeAutoReflect779
    BiliClient.prefs.v779invokeAutoReflect779 = !current
    AppToast.show(this, "Invoke Auto Reflect779: ${if (!current) "ON" else "OFF"}")
}

// v779: Item Auto Recycle779
internal fun PlayerActivity.showV779ItemAutoRecycle779Toggle() {
    val current = BiliClient.prefs.v779itemAutoRecycle779
    BiliClient.prefs.v779itemAutoRecycle779 = !current
    AppToast.show(this, "Item Auto Recycle779: ${if (!current) "ON" else "OFF"}")
}

// v779: Iterate Auto Paginate779
internal fun PlayerActivity.showV779IterateAutoPaginate779Toggle() {
    val current = BiliClient.prefs.v779iterateAutoPaginate779
    BiliClient.prefs.v779iterateAutoPaginate779 = !current
    AppToast.show(this, "Iterate Auto Paginate779: ${if (!current) "ON" else "OFF"}")
}

// v779: Join Auto Merge779
internal fun PlayerActivity.showV779JoinAutoMerge779Toggle() {
    val current = BiliClient.prefs.v779joinAutoMerge779
    BiliClient.prefs.v779joinAutoMerge779 = !current
    AppToast.show(this, "Join Auto Merge779: ${if (!current) "ON" else "OFF"}")
}

// v779: Json Auto Pretty779
internal fun PlayerActivity.showV779JsonAutoPretty779Toggle() {
    val current = BiliClient.prefs.v779jsonAutoPretty779
    BiliClient.prefs.v779jsonAutoPretty779 = !current
    AppToast.show(this, "Json Auto Pretty779: ${if (!current) "ON" else "OFF"}")
}

// v780: Init Auto Lazy780
internal fun PlayerActivity.showV780InitAutoLazy780Toggle() {
    val current = BiliClient.prefs.v780initAutoLazy780
    BiliClient.prefs.v780initAutoLazy780 = !current
    AppToast.show(this, "Init Auto Lazy780: ${if (!current) "ON" else "OFF"}")
}

// v780: Input Auto Validate780
internal fun PlayerActivity.showV780InputAutoValidate780Toggle() {
    val current = BiliClient.prefs.v780inputAutoValidate780
    BiliClient.prefs.v780inputAutoValidate780 = !current
    AppToast.show(this, "Input Auto Validate780: ${if (!current) "ON" else "OFF"}")
}

// v780: Insert Auto Position780
internal fun PlayerActivity.showV780InsertAutoPosition780Toggle() {
    val current = BiliClient.prefs.v780insertAutoPosition780
    BiliClient.prefs.v780insertAutoPosition780 = !current
    AppToast.show(this, "Insert Auto Position780: ${if (!current) "ON" else "OFF"}")
}

// v780: Install Auto Check780
internal fun PlayerActivity.showV780InstallAutoCheck780Toggle() {
    val current = BiliClient.prefs.v780installAutoCheck780
    BiliClient.prefs.v780installAutoCheck780 = !current
    AppToast.show(this, "Install Auto Check780: ${if (!current) "ON" else "OFF"}")
}

// v780: Instance Auto Pool780
internal fun PlayerActivity.showV780InstanceAutoPool780Toggle() {
    val current = BiliClient.prefs.v780instanceAutoPool780
    BiliClient.prefs.v780instanceAutoPool780 = !current
    AppToast.show(this, "Instance Auto Pool780: ${if (!current) "ON" else "OFF"}")
}

// v780: Intent Auto Route780
internal fun PlayerActivity.showV780IntentAutoRoute780Toggle() {
    val current = BiliClient.prefs.v780intentAutoRoute780
    BiliClient.prefs.v780intentAutoRoute780 = !current
    AppToast.show(this, "Intent Auto Route780: ${if (!current) "ON" else "OFF"}")
}

// v780: Interact Auto Haptic780
internal fun PlayerActivity.showV780InteractAutoHaptic780Toggle() {
    val current = BiliClient.prefs.v780interactAutoHaptic780
    BiliClient.prefs.v780interactAutoHaptic780 = !current
    AppToast.show(this, "Interact Auto Haptic780: ${if (!current) "ON" else "OFF"}")
}

// v780: Interface Auto Switch780
internal fun PlayerActivity.showV780InterfaceAutoSwitch780Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v780interfaceAutoSwitch780).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Interface Auto Switch780",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v780interfaceAutoSwitch780 = value
        AppToast.show(this, "Interface Auto Switch780: $value")
    }
}

// v780: Internal Auto Debug780
internal fun PlayerActivity.showV780InternalAutoDebug780Toggle() {
    val current = BiliClient.prefs.v780internalAutoDebug780
    BiliClient.prefs.v780internalAutoDebug780 = !current
    AppToast.show(this, "Internal Auto Debug780: ${if (!current) "ON" else "OFF"}")
}

// v780: Interval Auto Throttle780
internal fun PlayerActivity.showV780IntervalAutoThrottle780Toggle() {
    val current = BiliClient.prefs.v780intervalAutoThrottle780
    BiliClient.prefs.v780intervalAutoThrottle780 = !current
    AppToast.show(this, "Interval Auto Throttle780: ${if (!current) "ON" else "OFF"}")
}

// v780: Invoke Auto Reflect780
internal fun PlayerActivity.showV780InvokeAutoReflect780Toggle() {
    val current = BiliClient.prefs.v780invokeAutoReflect780
    BiliClient.prefs.v780invokeAutoReflect780 = !current
    AppToast.show(this, "Invoke Auto Reflect780: ${if (!current) "ON" else "OFF"}")
}

// v780: Item Auto Recycle780
internal fun PlayerActivity.showV780ItemAutoRecycle780Toggle() {
    val current = BiliClient.prefs.v780itemAutoRecycle780
    BiliClient.prefs.v780itemAutoRecycle780 = !current
    AppToast.show(this, "Item Auto Recycle780: ${if (!current) "ON" else "OFF"}")
}

// v780: Iterate Auto Paginate780
internal fun PlayerActivity.showV780IterateAutoPaginate780Toggle() {
    val current = BiliClient.prefs.v780iterateAutoPaginate780
    BiliClient.prefs.v780iterateAutoPaginate780 = !current
    AppToast.show(this, "Iterate Auto Paginate780: ${if (!current) "ON" else "OFF"}")
}

// v780: Join Auto Merge780
internal fun PlayerActivity.showV780JoinAutoMerge780Toggle() {
    val current = BiliClient.prefs.v780joinAutoMerge780
    BiliClient.prefs.v780joinAutoMerge780 = !current
    AppToast.show(this, "Join Auto Merge780: ${if (!current) "ON" else "OFF"}")
}

// v780: Json Auto Pretty780
internal fun PlayerActivity.showV780JsonAutoPretty780Toggle() {
    val current = BiliClient.prefs.v780jsonAutoPretty780
    BiliClient.prefs.v780jsonAutoPretty780 = !current
    AppToast.show(this, "Json Auto Pretty780: ${if (!current) "ON" else "OFF"}")
}

