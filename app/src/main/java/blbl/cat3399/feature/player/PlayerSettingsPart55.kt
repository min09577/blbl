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

// v731: Float Auto Anchor731
internal fun PlayerActivity.showV731FloatAutoAnchor731Toggle() {
    val current = BiliClient.prefs.v731floatAutoAnchor731
    BiliClient.prefs.v731floatAutoAnchor731 = !current
    AppToast.show(this, "Float Auto Anchor731: ${if (!current) "ON" else "OFF"}")
}

// v731: Flush Auto Buffer731
internal fun PlayerActivity.showV731FlushAutoBuffer731Toggle() {
    val current = BiliClient.prefs.v731flushAutoBuffer731
    BiliClient.prefs.v731flushAutoBuffer731 = !current
    AppToast.show(this, "Flush Auto Buffer731: ${if (!current) "ON" else "OFF"}")
}

// v731: Focus Auto Follow731
internal fun PlayerActivity.showV731FocusAutoFollow731Toggle() {
    val current = BiliClient.prefs.v731focusAutoFollow731
    BiliClient.prefs.v731focusAutoFollow731 = !current
    AppToast.show(this, "Focus Auto Follow731: ${if (!current) "ON" else "OFF"}")
}

// v731: Fold Auto Collapse731
internal fun PlayerActivity.showV731FoldAutoCollapse731Toggle() {
    val current = BiliClient.prefs.v731foldAutoCollapse731
    BiliClient.prefs.v731foldAutoCollapse731 = !current
    AppToast.show(this, "Fold Auto Collapse731: ${if (!current) "ON" else "OFF"}")
}

// v731: Font Auto Hinting731
internal fun PlayerActivity.showV731FontAutoHinting731Toggle() {
    val current = BiliClient.prefs.v731fontAutoHinting731
    BiliClient.prefs.v731fontAutoHinting731 = !current
    AppToast.show(this, "Font Auto Hinting731: ${if (!current) "ON" else "OFF"}")
}

// v731: Footer Auto Hide731
internal fun PlayerActivity.showV731FooterAutoHide731Toggle() {
    val current = BiliClient.prefs.v731footerAutoHide731
    BiliClient.prefs.v731footerAutoHide731 = !current
    AppToast.show(this, "Footer Auto Hide731: ${if (!current) "ON" else "OFF"}")
}

// v731: Force Auto Reload731
internal fun PlayerActivity.showV731ForceAutoReload731Toggle() {
    val current = BiliClient.prefs.v731forceAutoReload731
    BiliClient.prefs.v731forceAutoReload731 = !current
    AppToast.show(this, "Force Auto Reload731: ${if (!current) "ON" else "OFF"}")
}

// v731: Format Auto Convert731
internal fun PlayerActivity.showV731FormatAutoConvert731Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v731formatAutoConvert731).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert731",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v731formatAutoConvert731 = value
        AppToast.show(this, "Format Auto Convert731: $value")
    }
}

// v731: Fragment Auto Lazy731
internal fun PlayerActivity.showV731FragmentAutoLazy731Toggle() {
    val current = BiliClient.prefs.v731fragmentAutoLazy731
    BiliClient.prefs.v731fragmentAutoLazy731 = !current
    AppToast.show(this, "Fragment Auto Lazy731: ${if (!current) "ON" else "OFF"}")
}

// v731: Frame Auto Drop731
internal fun PlayerActivity.showV731FrameAutoDrop731Toggle() {
    val current = BiliClient.prefs.v731frameAutoDrop731
    BiliClient.prefs.v731frameAutoDrop731 = !current
    AppToast.show(this, "Frame Auto Drop731: ${if (!current) "ON" else "OFF"}")
}

// v731: Free Auto Memory731
internal fun PlayerActivity.showV731FreeAutoMemory731Toggle() {
    val current = BiliClient.prefs.v731freeAutoMemory731
    BiliClient.prefs.v731freeAutoMemory731 = !current
    AppToast.show(this, "Free Auto Memory731: ${if (!current) "ON" else "OFF"}")
}

// v731: Frequency Auto Hz731
internal fun PlayerActivity.showV731FrequencyAutoHz731Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v731frequencyAutoHz731).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz731",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v731frequencyAutoHz731 = value
        AppToast.show(this, "Frequency Auto Hz731: $value")
    }
}

// v731: Front Auto Camera731
internal fun PlayerActivity.showV731FrontAutoCamera731Toggle() {
    val current = BiliClient.prefs.v731frontAutoCamera731
    BiliClient.prefs.v731frontAutoCamera731 = !current
    AppToast.show(this, "Front Auto Camera731: ${if (!current) "ON" else "OFF"}")
}

// v731: Full Auto Screen731
internal fun PlayerActivity.showV731FullAutoScreen731Toggle() {
    val current = BiliClient.prefs.v731fullAutoScreen731
    BiliClient.prefs.v731fullAutoScreen731 = !current
    AppToast.show(this, "Full Auto Screen731: ${if (!current) "ON" else "OFF"}")
}

// v731: Function Auto Inline731
internal fun PlayerActivity.showV731FunctionAutoInline731Toggle() {
    val current = BiliClient.prefs.v731functionAutoInline731
    BiliClient.prefs.v731functionAutoInline731 = !current
    AppToast.show(this, "Function Auto Inline731: ${if (!current) "ON" else "OFF"}")
}

// v732: Float Auto Anchor732
internal fun PlayerActivity.showV732FloatAutoAnchor732Toggle() {
    val current = BiliClient.prefs.v732floatAutoAnchor732
    BiliClient.prefs.v732floatAutoAnchor732 = !current
    AppToast.show(this, "Float Auto Anchor732: ${if (!current) "ON" else "OFF"}")
}

// v732: Flush Auto Buffer732
internal fun PlayerActivity.showV732FlushAutoBuffer732Toggle() {
    val current = BiliClient.prefs.v732flushAutoBuffer732
    BiliClient.prefs.v732flushAutoBuffer732 = !current
    AppToast.show(this, "Flush Auto Buffer732: ${if (!current) "ON" else "OFF"}")
}

// v732: Focus Auto Follow732
internal fun PlayerActivity.showV732FocusAutoFollow732Toggle() {
    val current = BiliClient.prefs.v732focusAutoFollow732
    BiliClient.prefs.v732focusAutoFollow732 = !current
    AppToast.show(this, "Focus Auto Follow732: ${if (!current) "ON" else "OFF"}")
}

// v732: Fold Auto Collapse732
internal fun PlayerActivity.showV732FoldAutoCollapse732Toggle() {
    val current = BiliClient.prefs.v732foldAutoCollapse732
    BiliClient.prefs.v732foldAutoCollapse732 = !current
    AppToast.show(this, "Fold Auto Collapse732: ${if (!current) "ON" else "OFF"}")
}

// v732: Font Auto Hinting732
internal fun PlayerActivity.showV732FontAutoHinting732Toggle() {
    val current = BiliClient.prefs.v732fontAutoHinting732
    BiliClient.prefs.v732fontAutoHinting732 = !current
    AppToast.show(this, "Font Auto Hinting732: ${if (!current) "ON" else "OFF"}")
}

// v732: Footer Auto Hide732
internal fun PlayerActivity.showV732FooterAutoHide732Toggle() {
    val current = BiliClient.prefs.v732footerAutoHide732
    BiliClient.prefs.v732footerAutoHide732 = !current
    AppToast.show(this, "Footer Auto Hide732: ${if (!current) "ON" else "OFF"}")
}

// v732: Force Auto Reload732
internal fun PlayerActivity.showV732ForceAutoReload732Toggle() {
    val current = BiliClient.prefs.v732forceAutoReload732
    BiliClient.prefs.v732forceAutoReload732 = !current
    AppToast.show(this, "Force Auto Reload732: ${if (!current) "ON" else "OFF"}")
}

// v732: Format Auto Convert732
internal fun PlayerActivity.showV732FormatAutoConvert732Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v732formatAutoConvert732).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert732",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v732formatAutoConvert732 = value
        AppToast.show(this, "Format Auto Convert732: $value")
    }
}

// v732: Fragment Auto Lazy732
internal fun PlayerActivity.showV732FragmentAutoLazy732Toggle() {
    val current = BiliClient.prefs.v732fragmentAutoLazy732
    BiliClient.prefs.v732fragmentAutoLazy732 = !current
    AppToast.show(this, "Fragment Auto Lazy732: ${if (!current) "ON" else "OFF"}")
}

// v732: Frame Auto Drop732
internal fun PlayerActivity.showV732FrameAutoDrop732Toggle() {
    val current = BiliClient.prefs.v732frameAutoDrop732
    BiliClient.prefs.v732frameAutoDrop732 = !current
    AppToast.show(this, "Frame Auto Drop732: ${if (!current) "ON" else "OFF"}")
}

// v732: Free Auto Memory732
internal fun PlayerActivity.showV732FreeAutoMemory732Toggle() {
    val current = BiliClient.prefs.v732freeAutoMemory732
    BiliClient.prefs.v732freeAutoMemory732 = !current
    AppToast.show(this, "Free Auto Memory732: ${if (!current) "ON" else "OFF"}")
}

// v732: Frequency Auto Hz732
internal fun PlayerActivity.showV732FrequencyAutoHz732Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v732frequencyAutoHz732).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz732",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v732frequencyAutoHz732 = value
        AppToast.show(this, "Frequency Auto Hz732: $value")
    }
}

// v732: Front Auto Camera732
internal fun PlayerActivity.showV732FrontAutoCamera732Toggle() {
    val current = BiliClient.prefs.v732frontAutoCamera732
    BiliClient.prefs.v732frontAutoCamera732 = !current
    AppToast.show(this, "Front Auto Camera732: ${if (!current) "ON" else "OFF"}")
}

// v732: Full Auto Screen732
internal fun PlayerActivity.showV732FullAutoScreen732Toggle() {
    val current = BiliClient.prefs.v732fullAutoScreen732
    BiliClient.prefs.v732fullAutoScreen732 = !current
    AppToast.show(this, "Full Auto Screen732: ${if (!current) "ON" else "OFF"}")
}

// v732: Function Auto Inline732
internal fun PlayerActivity.showV732FunctionAutoInline732Toggle() {
    val current = BiliClient.prefs.v732functionAutoInline732
    BiliClient.prefs.v732functionAutoInline732 = !current
    AppToast.show(this, "Function Auto Inline732: ${if (!current) "ON" else "OFF"}")
}

// v733: Float Auto Anchor733
internal fun PlayerActivity.showV733FloatAutoAnchor733Toggle() {
    val current = BiliClient.prefs.v733floatAutoAnchor733
    BiliClient.prefs.v733floatAutoAnchor733 = !current
    AppToast.show(this, "Float Auto Anchor733: ${if (!current) "ON" else "OFF"}")
}

// v733: Flush Auto Buffer733
internal fun PlayerActivity.showV733FlushAutoBuffer733Toggle() {
    val current = BiliClient.prefs.v733flushAutoBuffer733
    BiliClient.prefs.v733flushAutoBuffer733 = !current
    AppToast.show(this, "Flush Auto Buffer733: ${if (!current) "ON" else "OFF"}")
}

// v733: Focus Auto Follow733
internal fun PlayerActivity.showV733FocusAutoFollow733Toggle() {
    val current = BiliClient.prefs.v733focusAutoFollow733
    BiliClient.prefs.v733focusAutoFollow733 = !current
    AppToast.show(this, "Focus Auto Follow733: ${if (!current) "ON" else "OFF"}")
}

// v733: Fold Auto Collapse733
internal fun PlayerActivity.showV733FoldAutoCollapse733Toggle() {
    val current = BiliClient.prefs.v733foldAutoCollapse733
    BiliClient.prefs.v733foldAutoCollapse733 = !current
    AppToast.show(this, "Fold Auto Collapse733: ${if (!current) "ON" else "OFF"}")
}

// v733: Font Auto Hinting733
internal fun PlayerActivity.showV733FontAutoHinting733Toggle() {
    val current = BiliClient.prefs.v733fontAutoHinting733
    BiliClient.prefs.v733fontAutoHinting733 = !current
    AppToast.show(this, "Font Auto Hinting733: ${if (!current) "ON" else "OFF"}")
}

// v733: Footer Auto Hide733
internal fun PlayerActivity.showV733FooterAutoHide733Toggle() {
    val current = BiliClient.prefs.v733footerAutoHide733
    BiliClient.prefs.v733footerAutoHide733 = !current
    AppToast.show(this, "Footer Auto Hide733: ${if (!current) "ON" else "OFF"}")
}

// v733: Force Auto Reload733
internal fun PlayerActivity.showV733ForceAutoReload733Toggle() {
    val current = BiliClient.prefs.v733forceAutoReload733
    BiliClient.prefs.v733forceAutoReload733 = !current
    AppToast.show(this, "Force Auto Reload733: ${if (!current) "ON" else "OFF"}")
}

// v733: Format Auto Convert733
internal fun PlayerActivity.showV733FormatAutoConvert733Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v733formatAutoConvert733).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert733",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v733formatAutoConvert733 = value
        AppToast.show(this, "Format Auto Convert733: $value")
    }
}

// v733: Fragment Auto Lazy733
internal fun PlayerActivity.showV733FragmentAutoLazy733Toggle() {
    val current = BiliClient.prefs.v733fragmentAutoLazy733
    BiliClient.prefs.v733fragmentAutoLazy733 = !current
    AppToast.show(this, "Fragment Auto Lazy733: ${if (!current) "ON" else "OFF"}")
}

// v733: Frame Auto Drop733
internal fun PlayerActivity.showV733FrameAutoDrop733Toggle() {
    val current = BiliClient.prefs.v733frameAutoDrop733
    BiliClient.prefs.v733frameAutoDrop733 = !current
    AppToast.show(this, "Frame Auto Drop733: ${if (!current) "ON" else "OFF"}")
}

// v733: Free Auto Memory733
internal fun PlayerActivity.showV733FreeAutoMemory733Toggle() {
    val current = BiliClient.prefs.v733freeAutoMemory733
    BiliClient.prefs.v733freeAutoMemory733 = !current
    AppToast.show(this, "Free Auto Memory733: ${if (!current) "ON" else "OFF"}")
}

// v733: Frequency Auto Hz733
internal fun PlayerActivity.showV733FrequencyAutoHz733Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v733frequencyAutoHz733).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz733",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v733frequencyAutoHz733 = value
        AppToast.show(this, "Frequency Auto Hz733: $value")
    }
}

// v733: Front Auto Camera733
internal fun PlayerActivity.showV733FrontAutoCamera733Toggle() {
    val current = BiliClient.prefs.v733frontAutoCamera733
    BiliClient.prefs.v733frontAutoCamera733 = !current
    AppToast.show(this, "Front Auto Camera733: ${if (!current) "ON" else "OFF"}")
}

// v733: Full Auto Screen733
internal fun PlayerActivity.showV733FullAutoScreen733Toggle() {
    val current = BiliClient.prefs.v733fullAutoScreen733
    BiliClient.prefs.v733fullAutoScreen733 = !current
    AppToast.show(this, "Full Auto Screen733: ${if (!current) "ON" else "OFF"}")
}

// v733: Function Auto Inline733
internal fun PlayerActivity.showV733FunctionAutoInline733Toggle() {
    val current = BiliClient.prefs.v733functionAutoInline733
    BiliClient.prefs.v733functionAutoInline733 = !current
    AppToast.show(this, "Function Auto Inline733: ${if (!current) "ON" else "OFF"}")
}

// v734: Float Auto Anchor734
internal fun PlayerActivity.showV734FloatAutoAnchor734Toggle() {
    val current = BiliClient.prefs.v734floatAutoAnchor734
    BiliClient.prefs.v734floatAutoAnchor734 = !current
    AppToast.show(this, "Float Auto Anchor734: ${if (!current) "ON" else "OFF"}")
}

// v734: Flush Auto Buffer734
internal fun PlayerActivity.showV734FlushAutoBuffer734Toggle() {
    val current = BiliClient.prefs.v734flushAutoBuffer734
    BiliClient.prefs.v734flushAutoBuffer734 = !current
    AppToast.show(this, "Flush Auto Buffer734: ${if (!current) "ON" else "OFF"}")
}

// v734: Focus Auto Follow734
internal fun PlayerActivity.showV734FocusAutoFollow734Toggle() {
    val current = BiliClient.prefs.v734focusAutoFollow734
    BiliClient.prefs.v734focusAutoFollow734 = !current
    AppToast.show(this, "Focus Auto Follow734: ${if (!current) "ON" else "OFF"}")
}

// v734: Fold Auto Collapse734
internal fun PlayerActivity.showV734FoldAutoCollapse734Toggle() {
    val current = BiliClient.prefs.v734foldAutoCollapse734
    BiliClient.prefs.v734foldAutoCollapse734 = !current
    AppToast.show(this, "Fold Auto Collapse734: ${if (!current) "ON" else "OFF"}")
}

// v734: Font Auto Hinting734
internal fun PlayerActivity.showV734FontAutoHinting734Toggle() {
    val current = BiliClient.prefs.v734fontAutoHinting734
    BiliClient.prefs.v734fontAutoHinting734 = !current
    AppToast.show(this, "Font Auto Hinting734: ${if (!current) "ON" else "OFF"}")
}

// v734: Footer Auto Hide734
internal fun PlayerActivity.showV734FooterAutoHide734Toggle() {
    val current = BiliClient.prefs.v734footerAutoHide734
    BiliClient.prefs.v734footerAutoHide734 = !current
    AppToast.show(this, "Footer Auto Hide734: ${if (!current) "ON" else "OFF"}")
}

// v734: Force Auto Reload734
internal fun PlayerActivity.showV734ForceAutoReload734Toggle() {
    val current = BiliClient.prefs.v734forceAutoReload734
    BiliClient.prefs.v734forceAutoReload734 = !current
    AppToast.show(this, "Force Auto Reload734: ${if (!current) "ON" else "OFF"}")
}

// v734: Format Auto Convert734
internal fun PlayerActivity.showV734FormatAutoConvert734Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v734formatAutoConvert734).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert734",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v734formatAutoConvert734 = value
        AppToast.show(this, "Format Auto Convert734: $value")
    }
}

// v734: Fragment Auto Lazy734
internal fun PlayerActivity.showV734FragmentAutoLazy734Toggle() {
    val current = BiliClient.prefs.v734fragmentAutoLazy734
    BiliClient.prefs.v734fragmentAutoLazy734 = !current
    AppToast.show(this, "Fragment Auto Lazy734: ${if (!current) "ON" else "OFF"}")
}

// v734: Frame Auto Drop734
internal fun PlayerActivity.showV734FrameAutoDrop734Toggle() {
    val current = BiliClient.prefs.v734frameAutoDrop734
    BiliClient.prefs.v734frameAutoDrop734 = !current
    AppToast.show(this, "Frame Auto Drop734: ${if (!current) "ON" else "OFF"}")
}

// v734: Free Auto Memory734
internal fun PlayerActivity.showV734FreeAutoMemory734Toggle() {
    val current = BiliClient.prefs.v734freeAutoMemory734
    BiliClient.prefs.v734freeAutoMemory734 = !current
    AppToast.show(this, "Free Auto Memory734: ${if (!current) "ON" else "OFF"}")
}

// v734: Frequency Auto Hz734
internal fun PlayerActivity.showV734FrequencyAutoHz734Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v734frequencyAutoHz734).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz734",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v734frequencyAutoHz734 = value
        AppToast.show(this, "Frequency Auto Hz734: $value")
    }
}

// v734: Front Auto Camera734
internal fun PlayerActivity.showV734FrontAutoCamera734Toggle() {
    val current = BiliClient.prefs.v734frontAutoCamera734
    BiliClient.prefs.v734frontAutoCamera734 = !current
    AppToast.show(this, "Front Auto Camera734: ${if (!current) "ON" else "OFF"}")
}

// v734: Full Auto Screen734
internal fun PlayerActivity.showV734FullAutoScreen734Toggle() {
    val current = BiliClient.prefs.v734fullAutoScreen734
    BiliClient.prefs.v734fullAutoScreen734 = !current
    AppToast.show(this, "Full Auto Screen734: ${if (!current) "ON" else "OFF"}")
}

// v734: Function Auto Inline734
internal fun PlayerActivity.showV734FunctionAutoInline734Toggle() {
    val current = BiliClient.prefs.v734functionAutoInline734
    BiliClient.prefs.v734functionAutoInline734 = !current
    AppToast.show(this, "Function Auto Inline734: ${if (!current) "ON" else "OFF"}")
}

// v735: Float Auto Anchor735
internal fun PlayerActivity.showV735FloatAutoAnchor735Toggle() {
    val current = BiliClient.prefs.v735floatAutoAnchor735
    BiliClient.prefs.v735floatAutoAnchor735 = !current
    AppToast.show(this, "Float Auto Anchor735: ${if (!current) "ON" else "OFF"}")
}

// v735: Flush Auto Buffer735
internal fun PlayerActivity.showV735FlushAutoBuffer735Toggle() {
    val current = BiliClient.prefs.v735flushAutoBuffer735
    BiliClient.prefs.v735flushAutoBuffer735 = !current
    AppToast.show(this, "Flush Auto Buffer735: ${if (!current) "ON" else "OFF"}")
}

// v735: Focus Auto Follow735
internal fun PlayerActivity.showV735FocusAutoFollow735Toggle() {
    val current = BiliClient.prefs.v735focusAutoFollow735
    BiliClient.prefs.v735focusAutoFollow735 = !current
    AppToast.show(this, "Focus Auto Follow735: ${if (!current) "ON" else "OFF"}")
}

// v735: Fold Auto Collapse735
internal fun PlayerActivity.showV735FoldAutoCollapse735Toggle() {
    val current = BiliClient.prefs.v735foldAutoCollapse735
    BiliClient.prefs.v735foldAutoCollapse735 = !current
    AppToast.show(this, "Fold Auto Collapse735: ${if (!current) "ON" else "OFF"}")
}

// v735: Font Auto Hinting735
internal fun PlayerActivity.showV735FontAutoHinting735Toggle() {
    val current = BiliClient.prefs.v735fontAutoHinting735
    BiliClient.prefs.v735fontAutoHinting735 = !current
    AppToast.show(this, "Font Auto Hinting735: ${if (!current) "ON" else "OFF"}")
}

// v735: Footer Auto Hide735
internal fun PlayerActivity.showV735FooterAutoHide735Toggle() {
    val current = BiliClient.prefs.v735footerAutoHide735
    BiliClient.prefs.v735footerAutoHide735 = !current
    AppToast.show(this, "Footer Auto Hide735: ${if (!current) "ON" else "OFF"}")
}

// v735: Force Auto Reload735
internal fun PlayerActivity.showV735ForceAutoReload735Toggle() {
    val current = BiliClient.prefs.v735forceAutoReload735
    BiliClient.prefs.v735forceAutoReload735 = !current
    AppToast.show(this, "Force Auto Reload735: ${if (!current) "ON" else "OFF"}")
}

// v735: Format Auto Convert735
internal fun PlayerActivity.showV735FormatAutoConvert735Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v735formatAutoConvert735).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert735",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v735formatAutoConvert735 = value
        AppToast.show(this, "Format Auto Convert735: $value")
    }
}

// v735: Fragment Auto Lazy735
internal fun PlayerActivity.showV735FragmentAutoLazy735Toggle() {
    val current = BiliClient.prefs.v735fragmentAutoLazy735
    BiliClient.prefs.v735fragmentAutoLazy735 = !current
    AppToast.show(this, "Fragment Auto Lazy735: ${if (!current) "ON" else "OFF"}")
}

// v735: Frame Auto Drop735
internal fun PlayerActivity.showV735FrameAutoDrop735Toggle() {
    val current = BiliClient.prefs.v735frameAutoDrop735
    BiliClient.prefs.v735frameAutoDrop735 = !current
    AppToast.show(this, "Frame Auto Drop735: ${if (!current) "ON" else "OFF"}")
}

// v735: Free Auto Memory735
internal fun PlayerActivity.showV735FreeAutoMemory735Toggle() {
    val current = BiliClient.prefs.v735freeAutoMemory735
    BiliClient.prefs.v735freeAutoMemory735 = !current
    AppToast.show(this, "Free Auto Memory735: ${if (!current) "ON" else "OFF"}")
}

// v735: Frequency Auto Hz735
internal fun PlayerActivity.showV735FrequencyAutoHz735Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v735frequencyAutoHz735).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz735",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v735frequencyAutoHz735 = value
        AppToast.show(this, "Frequency Auto Hz735: $value")
    }
}

// v735: Front Auto Camera735
internal fun PlayerActivity.showV735FrontAutoCamera735Toggle() {
    val current = BiliClient.prefs.v735frontAutoCamera735
    BiliClient.prefs.v735frontAutoCamera735 = !current
    AppToast.show(this, "Front Auto Camera735: ${if (!current) "ON" else "OFF"}")
}

// v735: Full Auto Screen735
internal fun PlayerActivity.showV735FullAutoScreen735Toggle() {
    val current = BiliClient.prefs.v735fullAutoScreen735
    BiliClient.prefs.v735fullAutoScreen735 = !current
    AppToast.show(this, "Full Auto Screen735: ${if (!current) "ON" else "OFF"}")
}

// v735: Function Auto Inline735
internal fun PlayerActivity.showV735FunctionAutoInline735Toggle() {
    val current = BiliClient.prefs.v735functionAutoInline735
    BiliClient.prefs.v735functionAutoInline735 = !current
    AppToast.show(this, "Function Auto Inline735: ${if (!current) "ON" else "OFF"}")
}

// v736: Float Auto Anchor736
internal fun PlayerActivity.showV736FloatAutoAnchor736Toggle() {
    val current = BiliClient.prefs.v736floatAutoAnchor736
    BiliClient.prefs.v736floatAutoAnchor736 = !current
    AppToast.show(this, "Float Auto Anchor736: ${if (!current) "ON" else "OFF"}")
}

// v736: Flush Auto Buffer736
internal fun PlayerActivity.showV736FlushAutoBuffer736Toggle() {
    val current = BiliClient.prefs.v736flushAutoBuffer736
    BiliClient.prefs.v736flushAutoBuffer736 = !current
    AppToast.show(this, "Flush Auto Buffer736: ${if (!current) "ON" else "OFF"}")
}

// v736: Focus Auto Follow736
internal fun PlayerActivity.showV736FocusAutoFollow736Toggle() {
    val current = BiliClient.prefs.v736focusAutoFollow736
    BiliClient.prefs.v736focusAutoFollow736 = !current
    AppToast.show(this, "Focus Auto Follow736: ${if (!current) "ON" else "OFF"}")
}

// v736: Fold Auto Collapse736
internal fun PlayerActivity.showV736FoldAutoCollapse736Toggle() {
    val current = BiliClient.prefs.v736foldAutoCollapse736
    BiliClient.prefs.v736foldAutoCollapse736 = !current
    AppToast.show(this, "Fold Auto Collapse736: ${if (!current) "ON" else "OFF"}")
}

// v736: Font Auto Hinting736
internal fun PlayerActivity.showV736FontAutoHinting736Toggle() {
    val current = BiliClient.prefs.v736fontAutoHinting736
    BiliClient.prefs.v736fontAutoHinting736 = !current
    AppToast.show(this, "Font Auto Hinting736: ${if (!current) "ON" else "OFF"}")
}

// v736: Footer Auto Hide736
internal fun PlayerActivity.showV736FooterAutoHide736Toggle() {
    val current = BiliClient.prefs.v736footerAutoHide736
    BiliClient.prefs.v736footerAutoHide736 = !current
    AppToast.show(this, "Footer Auto Hide736: ${if (!current) "ON" else "OFF"}")
}

// v736: Force Auto Reload736
internal fun PlayerActivity.showV736ForceAutoReload736Toggle() {
    val current = BiliClient.prefs.v736forceAutoReload736
    BiliClient.prefs.v736forceAutoReload736 = !current
    AppToast.show(this, "Force Auto Reload736: ${if (!current) "ON" else "OFF"}")
}

// v736: Format Auto Convert736
internal fun PlayerActivity.showV736FormatAutoConvert736Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v736formatAutoConvert736).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert736",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v736formatAutoConvert736 = value
        AppToast.show(this, "Format Auto Convert736: $value")
    }
}

// v736: Fragment Auto Lazy736
internal fun PlayerActivity.showV736FragmentAutoLazy736Toggle() {
    val current = BiliClient.prefs.v736fragmentAutoLazy736
    BiliClient.prefs.v736fragmentAutoLazy736 = !current
    AppToast.show(this, "Fragment Auto Lazy736: ${if (!current) "ON" else "OFF"}")
}

// v736: Frame Auto Drop736
internal fun PlayerActivity.showV736FrameAutoDrop736Toggle() {
    val current = BiliClient.prefs.v736frameAutoDrop736
    BiliClient.prefs.v736frameAutoDrop736 = !current
    AppToast.show(this, "Frame Auto Drop736: ${if (!current) "ON" else "OFF"}")
}

// v736: Free Auto Memory736
internal fun PlayerActivity.showV736FreeAutoMemory736Toggle() {
    val current = BiliClient.prefs.v736freeAutoMemory736
    BiliClient.prefs.v736freeAutoMemory736 = !current
    AppToast.show(this, "Free Auto Memory736: ${if (!current) "ON" else "OFF"}")
}

// v736: Frequency Auto Hz736
internal fun PlayerActivity.showV736FrequencyAutoHz736Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v736frequencyAutoHz736).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz736",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v736frequencyAutoHz736 = value
        AppToast.show(this, "Frequency Auto Hz736: $value")
    }
}

// v736: Front Auto Camera736
internal fun PlayerActivity.showV736FrontAutoCamera736Toggle() {
    val current = BiliClient.prefs.v736frontAutoCamera736
    BiliClient.prefs.v736frontAutoCamera736 = !current
    AppToast.show(this, "Front Auto Camera736: ${if (!current) "ON" else "OFF"}")
}

// v736: Full Auto Screen736
internal fun PlayerActivity.showV736FullAutoScreen736Toggle() {
    val current = BiliClient.prefs.v736fullAutoScreen736
    BiliClient.prefs.v736fullAutoScreen736 = !current
    AppToast.show(this, "Full Auto Screen736: ${if (!current) "ON" else "OFF"}")
}

// v736: Function Auto Inline736
internal fun PlayerActivity.showV736FunctionAutoInline736Toggle() {
    val current = BiliClient.prefs.v736functionAutoInline736
    BiliClient.prefs.v736functionAutoInline736 = !current
    AppToast.show(this, "Function Auto Inline736: ${if (!current) "ON" else "OFF"}")
}

// v737: Float Auto Anchor737
internal fun PlayerActivity.showV737FloatAutoAnchor737Toggle() {
    val current = BiliClient.prefs.v737floatAutoAnchor737
    BiliClient.prefs.v737floatAutoAnchor737 = !current
    AppToast.show(this, "Float Auto Anchor737: ${if (!current) "ON" else "OFF"}")
}

// v737: Flush Auto Buffer737
internal fun PlayerActivity.showV737FlushAutoBuffer737Toggle() {
    val current = BiliClient.prefs.v737flushAutoBuffer737
    BiliClient.prefs.v737flushAutoBuffer737 = !current
    AppToast.show(this, "Flush Auto Buffer737: ${if (!current) "ON" else "OFF"}")
}

// v737: Focus Auto Follow737
internal fun PlayerActivity.showV737FocusAutoFollow737Toggle() {
    val current = BiliClient.prefs.v737focusAutoFollow737
    BiliClient.prefs.v737focusAutoFollow737 = !current
    AppToast.show(this, "Focus Auto Follow737: ${if (!current) "ON" else "OFF"}")
}

// v737: Fold Auto Collapse737
internal fun PlayerActivity.showV737FoldAutoCollapse737Toggle() {
    val current = BiliClient.prefs.v737foldAutoCollapse737
    BiliClient.prefs.v737foldAutoCollapse737 = !current
    AppToast.show(this, "Fold Auto Collapse737: ${if (!current) "ON" else "OFF"}")
}

// v737: Font Auto Hinting737
internal fun PlayerActivity.showV737FontAutoHinting737Toggle() {
    val current = BiliClient.prefs.v737fontAutoHinting737
    BiliClient.prefs.v737fontAutoHinting737 = !current
    AppToast.show(this, "Font Auto Hinting737: ${if (!current) "ON" else "OFF"}")
}

// v737: Footer Auto Hide737
internal fun PlayerActivity.showV737FooterAutoHide737Toggle() {
    val current = BiliClient.prefs.v737footerAutoHide737
    BiliClient.prefs.v737footerAutoHide737 = !current
    AppToast.show(this, "Footer Auto Hide737: ${if (!current) "ON" else "OFF"}")
}

// v737: Force Auto Reload737
internal fun PlayerActivity.showV737ForceAutoReload737Toggle() {
    val current = BiliClient.prefs.v737forceAutoReload737
    BiliClient.prefs.v737forceAutoReload737 = !current
    AppToast.show(this, "Force Auto Reload737: ${if (!current) "ON" else "OFF"}")
}

// v737: Format Auto Convert737
internal fun PlayerActivity.showV737FormatAutoConvert737Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v737formatAutoConvert737).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert737",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v737formatAutoConvert737 = value
        AppToast.show(this, "Format Auto Convert737: $value")
    }
}

// v737: Fragment Auto Lazy737
internal fun PlayerActivity.showV737FragmentAutoLazy737Toggle() {
    val current = BiliClient.prefs.v737fragmentAutoLazy737
    BiliClient.prefs.v737fragmentAutoLazy737 = !current
    AppToast.show(this, "Fragment Auto Lazy737: ${if (!current) "ON" else "OFF"}")
}

// v737: Frame Auto Drop737
internal fun PlayerActivity.showV737FrameAutoDrop737Toggle() {
    val current = BiliClient.prefs.v737frameAutoDrop737
    BiliClient.prefs.v737frameAutoDrop737 = !current
    AppToast.show(this, "Frame Auto Drop737: ${if (!current) "ON" else "OFF"}")
}

// v737: Free Auto Memory737
internal fun PlayerActivity.showV737FreeAutoMemory737Toggle() {
    val current = BiliClient.prefs.v737freeAutoMemory737
    BiliClient.prefs.v737freeAutoMemory737 = !current
    AppToast.show(this, "Free Auto Memory737: ${if (!current) "ON" else "OFF"}")
}

// v737: Frequency Auto Hz737
internal fun PlayerActivity.showV737FrequencyAutoHz737Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v737frequencyAutoHz737).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz737",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v737frequencyAutoHz737 = value
        AppToast.show(this, "Frequency Auto Hz737: $value")
    }
}

// v737: Front Auto Camera737
internal fun PlayerActivity.showV737FrontAutoCamera737Toggle() {
    val current = BiliClient.prefs.v737frontAutoCamera737
    BiliClient.prefs.v737frontAutoCamera737 = !current
    AppToast.show(this, "Front Auto Camera737: ${if (!current) "ON" else "OFF"}")
}

// v737: Full Auto Screen737
internal fun PlayerActivity.showV737FullAutoScreen737Toggle() {
    val current = BiliClient.prefs.v737fullAutoScreen737
    BiliClient.prefs.v737fullAutoScreen737 = !current
    AppToast.show(this, "Full Auto Screen737: ${if (!current) "ON" else "OFF"}")
}

// v737: Function Auto Inline737
internal fun PlayerActivity.showV737FunctionAutoInline737Toggle() {
    val current = BiliClient.prefs.v737functionAutoInline737
    BiliClient.prefs.v737functionAutoInline737 = !current
    AppToast.show(this, "Function Auto Inline737: ${if (!current) "ON" else "OFF"}")
}

// v738: Float Auto Anchor738
internal fun PlayerActivity.showV738FloatAutoAnchor738Toggle() {
    val current = BiliClient.prefs.v738floatAutoAnchor738
    BiliClient.prefs.v738floatAutoAnchor738 = !current
    AppToast.show(this, "Float Auto Anchor738: ${if (!current) "ON" else "OFF"}")
}

// v738: Flush Auto Buffer738
internal fun PlayerActivity.showV738FlushAutoBuffer738Toggle() {
    val current = BiliClient.prefs.v738flushAutoBuffer738
    BiliClient.prefs.v738flushAutoBuffer738 = !current
    AppToast.show(this, "Flush Auto Buffer738: ${if (!current) "ON" else "OFF"}")
}

// v738: Focus Auto Follow738
internal fun PlayerActivity.showV738FocusAutoFollow738Toggle() {
    val current = BiliClient.prefs.v738focusAutoFollow738
    BiliClient.prefs.v738focusAutoFollow738 = !current
    AppToast.show(this, "Focus Auto Follow738: ${if (!current) "ON" else "OFF"}")
}

// v738: Fold Auto Collapse738
internal fun PlayerActivity.showV738FoldAutoCollapse738Toggle() {
    val current = BiliClient.prefs.v738foldAutoCollapse738
    BiliClient.prefs.v738foldAutoCollapse738 = !current
    AppToast.show(this, "Fold Auto Collapse738: ${if (!current) "ON" else "OFF"}")
}

// v738: Font Auto Hinting738
internal fun PlayerActivity.showV738FontAutoHinting738Toggle() {
    val current = BiliClient.prefs.v738fontAutoHinting738
    BiliClient.prefs.v738fontAutoHinting738 = !current
    AppToast.show(this, "Font Auto Hinting738: ${if (!current) "ON" else "OFF"}")
}

// v738: Footer Auto Hide738
internal fun PlayerActivity.showV738FooterAutoHide738Toggle() {
    val current = BiliClient.prefs.v738footerAutoHide738
    BiliClient.prefs.v738footerAutoHide738 = !current
    AppToast.show(this, "Footer Auto Hide738: ${if (!current) "ON" else "OFF"}")
}

// v738: Force Auto Reload738
internal fun PlayerActivity.showV738ForceAutoReload738Toggle() {
    val current = BiliClient.prefs.v738forceAutoReload738
    BiliClient.prefs.v738forceAutoReload738 = !current
    AppToast.show(this, "Force Auto Reload738: ${if (!current) "ON" else "OFF"}")
}

// v738: Format Auto Convert738
internal fun PlayerActivity.showV738FormatAutoConvert738Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v738formatAutoConvert738).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert738",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v738formatAutoConvert738 = value
        AppToast.show(this, "Format Auto Convert738: $value")
    }
}

// v738: Fragment Auto Lazy738
internal fun PlayerActivity.showV738FragmentAutoLazy738Toggle() {
    val current = BiliClient.prefs.v738fragmentAutoLazy738
    BiliClient.prefs.v738fragmentAutoLazy738 = !current
    AppToast.show(this, "Fragment Auto Lazy738: ${if (!current) "ON" else "OFF"}")
}

// v738: Frame Auto Drop738
internal fun PlayerActivity.showV738FrameAutoDrop738Toggle() {
    val current = BiliClient.prefs.v738frameAutoDrop738
    BiliClient.prefs.v738frameAutoDrop738 = !current
    AppToast.show(this, "Frame Auto Drop738: ${if (!current) "ON" else "OFF"}")
}

// v738: Free Auto Memory738
internal fun PlayerActivity.showV738FreeAutoMemory738Toggle() {
    val current = BiliClient.prefs.v738freeAutoMemory738
    BiliClient.prefs.v738freeAutoMemory738 = !current
    AppToast.show(this, "Free Auto Memory738: ${if (!current) "ON" else "OFF"}")
}

// v738: Frequency Auto Hz738
internal fun PlayerActivity.showV738FrequencyAutoHz738Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v738frequencyAutoHz738).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz738",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v738frequencyAutoHz738 = value
        AppToast.show(this, "Frequency Auto Hz738: $value")
    }
}

// v738: Front Auto Camera738
internal fun PlayerActivity.showV738FrontAutoCamera738Toggle() {
    val current = BiliClient.prefs.v738frontAutoCamera738
    BiliClient.prefs.v738frontAutoCamera738 = !current
    AppToast.show(this, "Front Auto Camera738: ${if (!current) "ON" else "OFF"}")
}

// v738: Full Auto Screen738
internal fun PlayerActivity.showV738FullAutoScreen738Toggle() {
    val current = BiliClient.prefs.v738fullAutoScreen738
    BiliClient.prefs.v738fullAutoScreen738 = !current
    AppToast.show(this, "Full Auto Screen738: ${if (!current) "ON" else "OFF"}")
}

// v738: Function Auto Inline738
internal fun PlayerActivity.showV738FunctionAutoInline738Toggle() {
    val current = BiliClient.prefs.v738functionAutoInline738
    BiliClient.prefs.v738functionAutoInline738 = !current
    AppToast.show(this, "Function Auto Inline738: ${if (!current) "ON" else "OFF"}")
}

// v739: Float Auto Anchor739
internal fun PlayerActivity.showV739FloatAutoAnchor739Toggle() {
    val current = BiliClient.prefs.v739floatAutoAnchor739
    BiliClient.prefs.v739floatAutoAnchor739 = !current
    AppToast.show(this, "Float Auto Anchor739: ${if (!current) "ON" else "OFF"}")
}

// v739: Flush Auto Buffer739
internal fun PlayerActivity.showV739FlushAutoBuffer739Toggle() {
    val current = BiliClient.prefs.v739flushAutoBuffer739
    BiliClient.prefs.v739flushAutoBuffer739 = !current
    AppToast.show(this, "Flush Auto Buffer739: ${if (!current) "ON" else "OFF"}")
}

// v739: Focus Auto Follow739
internal fun PlayerActivity.showV739FocusAutoFollow739Toggle() {
    val current = BiliClient.prefs.v739focusAutoFollow739
    BiliClient.prefs.v739focusAutoFollow739 = !current
    AppToast.show(this, "Focus Auto Follow739: ${if (!current) "ON" else "OFF"}")
}

// v739: Fold Auto Collapse739
internal fun PlayerActivity.showV739FoldAutoCollapse739Toggle() {
    val current = BiliClient.prefs.v739foldAutoCollapse739
    BiliClient.prefs.v739foldAutoCollapse739 = !current
    AppToast.show(this, "Fold Auto Collapse739: ${if (!current) "ON" else "OFF"}")
}

// v739: Font Auto Hinting739
internal fun PlayerActivity.showV739FontAutoHinting739Toggle() {
    val current = BiliClient.prefs.v739fontAutoHinting739
    BiliClient.prefs.v739fontAutoHinting739 = !current
    AppToast.show(this, "Font Auto Hinting739: ${if (!current) "ON" else "OFF"}")
}

// v739: Footer Auto Hide739
internal fun PlayerActivity.showV739FooterAutoHide739Toggle() {
    val current = BiliClient.prefs.v739footerAutoHide739
    BiliClient.prefs.v739footerAutoHide739 = !current
    AppToast.show(this, "Footer Auto Hide739: ${if (!current) "ON" else "OFF"}")
}

// v739: Force Auto Reload739
internal fun PlayerActivity.showV739ForceAutoReload739Toggle() {
    val current = BiliClient.prefs.v739forceAutoReload739
    BiliClient.prefs.v739forceAutoReload739 = !current
    AppToast.show(this, "Force Auto Reload739: ${if (!current) "ON" else "OFF"}")
}

// v739: Format Auto Convert739
internal fun PlayerActivity.showV739FormatAutoConvert739Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v739formatAutoConvert739).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert739",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v739formatAutoConvert739 = value
        AppToast.show(this, "Format Auto Convert739: $value")
    }
}

// v739: Fragment Auto Lazy739
internal fun PlayerActivity.showV739FragmentAutoLazy739Toggle() {
    val current = BiliClient.prefs.v739fragmentAutoLazy739
    BiliClient.prefs.v739fragmentAutoLazy739 = !current
    AppToast.show(this, "Fragment Auto Lazy739: ${if (!current) "ON" else "OFF"}")
}

// v739: Frame Auto Drop739
internal fun PlayerActivity.showV739FrameAutoDrop739Toggle() {
    val current = BiliClient.prefs.v739frameAutoDrop739
    BiliClient.prefs.v739frameAutoDrop739 = !current
    AppToast.show(this, "Frame Auto Drop739: ${if (!current) "ON" else "OFF"}")
}

// v739: Free Auto Memory739
internal fun PlayerActivity.showV739FreeAutoMemory739Toggle() {
    val current = BiliClient.prefs.v739freeAutoMemory739
    BiliClient.prefs.v739freeAutoMemory739 = !current
    AppToast.show(this, "Free Auto Memory739: ${if (!current) "ON" else "OFF"}")
}

// v739: Frequency Auto Hz739
internal fun PlayerActivity.showV739FrequencyAutoHz739Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v739frequencyAutoHz739).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz739",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v739frequencyAutoHz739 = value
        AppToast.show(this, "Frequency Auto Hz739: $value")
    }
}

// v739: Front Auto Camera739
internal fun PlayerActivity.showV739FrontAutoCamera739Toggle() {
    val current = BiliClient.prefs.v739frontAutoCamera739
    BiliClient.prefs.v739frontAutoCamera739 = !current
    AppToast.show(this, "Front Auto Camera739: ${if (!current) "ON" else "OFF"}")
}

// v739: Full Auto Screen739
internal fun PlayerActivity.showV739FullAutoScreen739Toggle() {
    val current = BiliClient.prefs.v739fullAutoScreen739
    BiliClient.prefs.v739fullAutoScreen739 = !current
    AppToast.show(this, "Full Auto Screen739: ${if (!current) "ON" else "OFF"}")
}

// v739: Function Auto Inline739
internal fun PlayerActivity.showV739FunctionAutoInline739Toggle() {
    val current = BiliClient.prefs.v739functionAutoInline739
    BiliClient.prefs.v739functionAutoInline739 = !current
    AppToast.show(this, "Function Auto Inline739: ${if (!current) "ON" else "OFF"}")
}

// v740: Float Auto Anchor740
internal fun PlayerActivity.showV740FloatAutoAnchor740Toggle() {
    val current = BiliClient.prefs.v740floatAutoAnchor740
    BiliClient.prefs.v740floatAutoAnchor740 = !current
    AppToast.show(this, "Float Auto Anchor740: ${if (!current) "ON" else "OFF"}")
}

// v740: Flush Auto Buffer740
internal fun PlayerActivity.showV740FlushAutoBuffer740Toggle() {
    val current = BiliClient.prefs.v740flushAutoBuffer740
    BiliClient.prefs.v740flushAutoBuffer740 = !current
    AppToast.show(this, "Flush Auto Buffer740: ${if (!current) "ON" else "OFF"}")
}

// v740: Focus Auto Follow740
internal fun PlayerActivity.showV740FocusAutoFollow740Toggle() {
    val current = BiliClient.prefs.v740focusAutoFollow740
    BiliClient.prefs.v740focusAutoFollow740 = !current
    AppToast.show(this, "Focus Auto Follow740: ${if (!current) "ON" else "OFF"}")
}

// v740: Fold Auto Collapse740
internal fun PlayerActivity.showV740FoldAutoCollapse740Toggle() {
    val current = BiliClient.prefs.v740foldAutoCollapse740
    BiliClient.prefs.v740foldAutoCollapse740 = !current
    AppToast.show(this, "Fold Auto Collapse740: ${if (!current) "ON" else "OFF"}")
}

// v740: Font Auto Hinting740
internal fun PlayerActivity.showV740FontAutoHinting740Toggle() {
    val current = BiliClient.prefs.v740fontAutoHinting740
    BiliClient.prefs.v740fontAutoHinting740 = !current
    AppToast.show(this, "Font Auto Hinting740: ${if (!current) "ON" else "OFF"}")
}

// v740: Footer Auto Hide740
internal fun PlayerActivity.showV740FooterAutoHide740Toggle() {
    val current = BiliClient.prefs.v740footerAutoHide740
    BiliClient.prefs.v740footerAutoHide740 = !current
    AppToast.show(this, "Footer Auto Hide740: ${if (!current) "ON" else "OFF"}")
}

// v740: Force Auto Reload740
internal fun PlayerActivity.showV740ForceAutoReload740Toggle() {
    val current = BiliClient.prefs.v740forceAutoReload740
    BiliClient.prefs.v740forceAutoReload740 = !current
    AppToast.show(this, "Force Auto Reload740: ${if (!current) "ON" else "OFF"}")
}

// v740: Format Auto Convert740
internal fun PlayerActivity.showV740FormatAutoConvert740Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v740formatAutoConvert740).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Format Auto Convert740",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v740formatAutoConvert740 = value
        AppToast.show(this, "Format Auto Convert740: $value")
    }
}

// v740: Fragment Auto Lazy740
internal fun PlayerActivity.showV740FragmentAutoLazy740Toggle() {
    val current = BiliClient.prefs.v740fragmentAutoLazy740
    BiliClient.prefs.v740fragmentAutoLazy740 = !current
    AppToast.show(this, "Fragment Auto Lazy740: ${if (!current) "ON" else "OFF"}")
}

// v740: Frame Auto Drop740
internal fun PlayerActivity.showV740FrameAutoDrop740Toggle() {
    val current = BiliClient.prefs.v740frameAutoDrop740
    BiliClient.prefs.v740frameAutoDrop740 = !current
    AppToast.show(this, "Frame Auto Drop740: ${if (!current) "ON" else "OFF"}")
}

// v740: Free Auto Memory740
internal fun PlayerActivity.showV740FreeAutoMemory740Toggle() {
    val current = BiliClient.prefs.v740freeAutoMemory740
    BiliClient.prefs.v740freeAutoMemory740 = !current
    AppToast.show(this, "Free Auto Memory740: ${if (!current) "ON" else "OFF"}")
}

// v740: Frequency Auto Hz740
internal fun PlayerActivity.showV740FrequencyAutoHz740Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v740frequencyAutoHz740).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Frequency Auto Hz740",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v740frequencyAutoHz740 = value
        AppToast.show(this, "Frequency Auto Hz740: $value")
    }
}

// v740: Front Auto Camera740
internal fun PlayerActivity.showV740FrontAutoCamera740Toggle() {
    val current = BiliClient.prefs.v740frontAutoCamera740
    BiliClient.prefs.v740frontAutoCamera740 = !current
    AppToast.show(this, "Front Auto Camera740: ${if (!current) "ON" else "OFF"}")
}

// v740: Full Auto Screen740
internal fun PlayerActivity.showV740FullAutoScreen740Toggle() {
    val current = BiliClient.prefs.v740fullAutoScreen740
    BiliClient.prefs.v740fullAutoScreen740 = !current
    AppToast.show(this, "Full Auto Screen740: ${if (!current) "ON" else "OFF"}")
}

// v740: Function Auto Inline740
internal fun PlayerActivity.showV740FunctionAutoInline740Toggle() {
    val current = BiliClient.prefs.v740functionAutoInline740
    BiliClient.prefs.v740functionAutoInline740 = !current
    AppToast.show(this, "Function Auto Inline740: ${if (!current) "ON" else "OFF"}")
}

