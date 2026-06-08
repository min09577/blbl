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

// v781: Jump Auto Seek781
internal fun PlayerActivity.showV781JumpAutoSeek781Toggle() {
    val current = BiliClient.prefs.v781jumpAutoSeek781
    BiliClient.prefs.v781jumpAutoSeek781 = !current
    AppToast.show(this, "Jump Auto Seek781: ${if (!current) "ON" else "OFF"}")
}

// v781: Kernel Auto Tune781
internal fun PlayerActivity.showV781KernelAutoTune781Toggle() {
    val current = BiliClient.prefs.v781kernelAutoTune781
    BiliClient.prefs.v781kernelAutoTune781 = !current
    AppToast.show(this, "Kernel Auto Tune781: ${if (!current) "ON" else "OFF"}")
}

// v781: Key Auto Bind781
internal fun PlayerActivity.showV781KeyAutoBind781Toggle() {
    val current = BiliClient.prefs.v781keyAutoBind781
    BiliClient.prefs.v781keyAutoBind781 = !current
    AppToast.show(this, "Key Auto Bind781: ${if (!current) "ON" else "OFF"}")
}

// v781: Kill Auto Process781
internal fun PlayerActivity.showV781KillAutoProcess781Toggle() {
    val current = BiliClient.prefs.v781killAutoProcess781
    BiliClient.prefs.v781killAutoProcess781 = !current
    AppToast.show(this, "Kill Auto Process781: ${if (!current) "ON" else "OFF"}")
}

// v781: Kit Auto Load781
internal fun PlayerActivity.showV781KitAutoLoad781Toggle() {
    val current = BiliClient.prefs.v781kitAutoLoad781
    BiliClient.prefs.v781kitAutoLoad781 = !current
    AppToast.show(this, "Kit Auto Load781: ${if (!current) "ON" else "OFF"}")
}

// v781: Label Auto Tag781
internal fun PlayerActivity.showV781LabelAutoTag781Toggle() {
    val current = BiliClient.prefs.v781labelAutoTag781
    BiliClient.prefs.v781labelAutoTag781 = !current
    AppToast.show(this, "Label Auto Tag781: ${if (!current) "ON" else "OFF"}")
}

// v781: Lag Auto Compensate781
internal fun PlayerActivity.showV781LagAutoCompensate781Toggle() {
    val current = BiliClient.prefs.v781lagAutoCompensate781
    BiliClient.prefs.v781lagAutoCompensate781 = !current
    AppToast.show(this, "Lag Auto Compensate781: ${if (!current) "ON" else "OFF"}")
}

// v781: Language Auto Detect781
internal fun PlayerActivity.showV781LanguageAutoDetect781Toggle() {
    val current = BiliClient.prefs.v781languageAutoDetect781
    BiliClient.prefs.v781languageAutoDetect781 = !current
    AppToast.show(this, "Language Auto Detect781: ${if (!current) "ON" else "OFF"}")
}

// v781: Layer Auto ZOrder781
internal fun PlayerActivity.showV781LayerAutoZOrder781Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v781layerAutoZOrder781).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder781",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v781layerAutoZOrder781 = value
        AppToast.show(this, "Layer Auto ZOrder781: $value")
    }
}

// v781: Layout Auto Reflow781
internal fun PlayerActivity.showV781LayoutAutoReflow781Toggle() {
    val current = BiliClient.prefs.v781layoutAutoReflow781
    BiliClient.prefs.v781layoutAutoReflow781 = !current
    AppToast.show(this, "Layout Auto Reflow781: ${if (!current) "ON" else "OFF"}")
}

// v781: Lazy Auto Init781
internal fun PlayerActivity.showV781LazyAutoInit781Toggle() {
    val current = BiliClient.prefs.v781lazyAutoInit781
    BiliClient.prefs.v781lazyAutoInit781 = !current
    AppToast.show(this, "Lazy Auto Init781: ${if (!current) "ON" else "OFF"}")
}

// v781: Lead Auto Follow781
internal fun PlayerActivity.showV781LeadAutoFollow781Toggle() {
    val current = BiliClient.prefs.v781leadAutoFollow781
    BiliClient.prefs.v781leadAutoFollow781 = !current
    AppToast.show(this, "Lead Auto Follow781: ${if (!current) "ON" else "OFF"}")
}

// v781: Leaf Auto Node781
internal fun PlayerActivity.showV781LeafAutoNode781Toggle() {
    val current = BiliClient.prefs.v781leafAutoNode781
    BiliClient.prefs.v781leafAutoNode781 = !current
    AppToast.show(this, "Leaf Auto Node781: ${if (!current) "ON" else "OFF"}")
}

// v781: Learn Auto Adapt781
internal fun PlayerActivity.showV781LearnAutoAdapt781Toggle() {
    val current = BiliClient.prefs.v781learnAutoAdapt781
    BiliClient.prefs.v781learnAutoAdapt781 = !current
    AppToast.show(this, "Learn Auto Adapt781: ${if (!current) "ON" else "OFF"}")
}

// v781: Left Auto Panel781
internal fun PlayerActivity.showV781LeftAutoPanel781Toggle() {
    val current = BiliClient.prefs.v781leftAutoPanel781
    BiliClient.prefs.v781leftAutoPanel781 = !current
    AppToast.show(this, "Left Auto Panel781: ${if (!current) "ON" else "OFF"}")
}

// v782: Jump Auto Seek782
internal fun PlayerActivity.showV782JumpAutoSeek782Toggle() {
    val current = BiliClient.prefs.v782jumpAutoSeek782
    BiliClient.prefs.v782jumpAutoSeek782 = !current
    AppToast.show(this, "Jump Auto Seek782: ${if (!current) "ON" else "OFF"}")
}

// v782: Kernel Auto Tune782
internal fun PlayerActivity.showV782KernelAutoTune782Toggle() {
    val current = BiliClient.prefs.v782kernelAutoTune782
    BiliClient.prefs.v782kernelAutoTune782 = !current
    AppToast.show(this, "Kernel Auto Tune782: ${if (!current) "ON" else "OFF"}")
}

// v782: Key Auto Bind782
internal fun PlayerActivity.showV782KeyAutoBind782Toggle() {
    val current = BiliClient.prefs.v782keyAutoBind782
    BiliClient.prefs.v782keyAutoBind782 = !current
    AppToast.show(this, "Key Auto Bind782: ${if (!current) "ON" else "OFF"}")
}

// v782: Kill Auto Process782
internal fun PlayerActivity.showV782KillAutoProcess782Toggle() {
    val current = BiliClient.prefs.v782killAutoProcess782
    BiliClient.prefs.v782killAutoProcess782 = !current
    AppToast.show(this, "Kill Auto Process782: ${if (!current) "ON" else "OFF"}")
}

// v782: Kit Auto Load782
internal fun PlayerActivity.showV782KitAutoLoad782Toggle() {
    val current = BiliClient.prefs.v782kitAutoLoad782
    BiliClient.prefs.v782kitAutoLoad782 = !current
    AppToast.show(this, "Kit Auto Load782: ${if (!current) "ON" else "OFF"}")
}

// v782: Label Auto Tag782
internal fun PlayerActivity.showV782LabelAutoTag782Toggle() {
    val current = BiliClient.prefs.v782labelAutoTag782
    BiliClient.prefs.v782labelAutoTag782 = !current
    AppToast.show(this, "Label Auto Tag782: ${if (!current) "ON" else "OFF"}")
}

// v782: Lag Auto Compensate782
internal fun PlayerActivity.showV782LagAutoCompensate782Toggle() {
    val current = BiliClient.prefs.v782lagAutoCompensate782
    BiliClient.prefs.v782lagAutoCompensate782 = !current
    AppToast.show(this, "Lag Auto Compensate782: ${if (!current) "ON" else "OFF"}")
}

// v782: Language Auto Detect782
internal fun PlayerActivity.showV782LanguageAutoDetect782Toggle() {
    val current = BiliClient.prefs.v782languageAutoDetect782
    BiliClient.prefs.v782languageAutoDetect782 = !current
    AppToast.show(this, "Language Auto Detect782: ${if (!current) "ON" else "OFF"}")
}

// v782: Layer Auto ZOrder782
internal fun PlayerActivity.showV782LayerAutoZOrder782Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v782layerAutoZOrder782).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder782",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v782layerAutoZOrder782 = value
        AppToast.show(this, "Layer Auto ZOrder782: $value")
    }
}

// v782: Layout Auto Reflow782
internal fun PlayerActivity.showV782LayoutAutoReflow782Toggle() {
    val current = BiliClient.prefs.v782layoutAutoReflow782
    BiliClient.prefs.v782layoutAutoReflow782 = !current
    AppToast.show(this, "Layout Auto Reflow782: ${if (!current) "ON" else "OFF"}")
}

// v782: Lazy Auto Init782
internal fun PlayerActivity.showV782LazyAutoInit782Toggle() {
    val current = BiliClient.prefs.v782lazyAutoInit782
    BiliClient.prefs.v782lazyAutoInit782 = !current
    AppToast.show(this, "Lazy Auto Init782: ${if (!current) "ON" else "OFF"}")
}

// v782: Lead Auto Follow782
internal fun PlayerActivity.showV782LeadAutoFollow782Toggle() {
    val current = BiliClient.prefs.v782leadAutoFollow782
    BiliClient.prefs.v782leadAutoFollow782 = !current
    AppToast.show(this, "Lead Auto Follow782: ${if (!current) "ON" else "OFF"}")
}

// v782: Leaf Auto Node782
internal fun PlayerActivity.showV782LeafAutoNode782Toggle() {
    val current = BiliClient.prefs.v782leafAutoNode782
    BiliClient.prefs.v782leafAutoNode782 = !current
    AppToast.show(this, "Leaf Auto Node782: ${if (!current) "ON" else "OFF"}")
}

// v782: Learn Auto Adapt782
internal fun PlayerActivity.showV782LearnAutoAdapt782Toggle() {
    val current = BiliClient.prefs.v782learnAutoAdapt782
    BiliClient.prefs.v782learnAutoAdapt782 = !current
    AppToast.show(this, "Learn Auto Adapt782: ${if (!current) "ON" else "OFF"}")
}

// v782: Left Auto Panel782
internal fun PlayerActivity.showV782LeftAutoPanel782Toggle() {
    val current = BiliClient.prefs.v782leftAutoPanel782
    BiliClient.prefs.v782leftAutoPanel782 = !current
    AppToast.show(this, "Left Auto Panel782: ${if (!current) "ON" else "OFF"}")
}

// v783: Jump Auto Seek783
internal fun PlayerActivity.showV783JumpAutoSeek783Toggle() {
    val current = BiliClient.prefs.v783jumpAutoSeek783
    BiliClient.prefs.v783jumpAutoSeek783 = !current
    AppToast.show(this, "Jump Auto Seek783: ${if (!current) "ON" else "OFF"}")
}

// v783: Kernel Auto Tune783
internal fun PlayerActivity.showV783KernelAutoTune783Toggle() {
    val current = BiliClient.prefs.v783kernelAutoTune783
    BiliClient.prefs.v783kernelAutoTune783 = !current
    AppToast.show(this, "Kernel Auto Tune783: ${if (!current) "ON" else "OFF"}")
}

// v783: Key Auto Bind783
internal fun PlayerActivity.showV783KeyAutoBind783Toggle() {
    val current = BiliClient.prefs.v783keyAutoBind783
    BiliClient.prefs.v783keyAutoBind783 = !current
    AppToast.show(this, "Key Auto Bind783: ${if (!current) "ON" else "OFF"}")
}

// v783: Kill Auto Process783
internal fun PlayerActivity.showV783KillAutoProcess783Toggle() {
    val current = BiliClient.prefs.v783killAutoProcess783
    BiliClient.prefs.v783killAutoProcess783 = !current
    AppToast.show(this, "Kill Auto Process783: ${if (!current) "ON" else "OFF"}")
}

// v783: Kit Auto Load783
internal fun PlayerActivity.showV783KitAutoLoad783Toggle() {
    val current = BiliClient.prefs.v783kitAutoLoad783
    BiliClient.prefs.v783kitAutoLoad783 = !current
    AppToast.show(this, "Kit Auto Load783: ${if (!current) "ON" else "OFF"}")
}

// v783: Label Auto Tag783
internal fun PlayerActivity.showV783LabelAutoTag783Toggle() {
    val current = BiliClient.prefs.v783labelAutoTag783
    BiliClient.prefs.v783labelAutoTag783 = !current
    AppToast.show(this, "Label Auto Tag783: ${if (!current) "ON" else "OFF"}")
}

// v783: Lag Auto Compensate783
internal fun PlayerActivity.showV783LagAutoCompensate783Toggle() {
    val current = BiliClient.prefs.v783lagAutoCompensate783
    BiliClient.prefs.v783lagAutoCompensate783 = !current
    AppToast.show(this, "Lag Auto Compensate783: ${if (!current) "ON" else "OFF"}")
}

// v783: Language Auto Detect783
internal fun PlayerActivity.showV783LanguageAutoDetect783Toggle() {
    val current = BiliClient.prefs.v783languageAutoDetect783
    BiliClient.prefs.v783languageAutoDetect783 = !current
    AppToast.show(this, "Language Auto Detect783: ${if (!current) "ON" else "OFF"}")
}

// v783: Layer Auto ZOrder783
internal fun PlayerActivity.showV783LayerAutoZOrder783Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v783layerAutoZOrder783).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder783",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v783layerAutoZOrder783 = value
        AppToast.show(this, "Layer Auto ZOrder783: $value")
    }
}

// v783: Layout Auto Reflow783
internal fun PlayerActivity.showV783LayoutAutoReflow783Toggle() {
    val current = BiliClient.prefs.v783layoutAutoReflow783
    BiliClient.prefs.v783layoutAutoReflow783 = !current
    AppToast.show(this, "Layout Auto Reflow783: ${if (!current) "ON" else "OFF"}")
}

// v783: Lazy Auto Init783
internal fun PlayerActivity.showV783LazyAutoInit783Toggle() {
    val current = BiliClient.prefs.v783lazyAutoInit783
    BiliClient.prefs.v783lazyAutoInit783 = !current
    AppToast.show(this, "Lazy Auto Init783: ${if (!current) "ON" else "OFF"}")
}

// v783: Lead Auto Follow783
internal fun PlayerActivity.showV783LeadAutoFollow783Toggle() {
    val current = BiliClient.prefs.v783leadAutoFollow783
    BiliClient.prefs.v783leadAutoFollow783 = !current
    AppToast.show(this, "Lead Auto Follow783: ${if (!current) "ON" else "OFF"}")
}

// v783: Leaf Auto Node783
internal fun PlayerActivity.showV783LeafAutoNode783Toggle() {
    val current = BiliClient.prefs.v783leafAutoNode783
    BiliClient.prefs.v783leafAutoNode783 = !current
    AppToast.show(this, "Leaf Auto Node783: ${if (!current) "ON" else "OFF"}")
}

// v783: Learn Auto Adapt783
internal fun PlayerActivity.showV783LearnAutoAdapt783Toggle() {
    val current = BiliClient.prefs.v783learnAutoAdapt783
    BiliClient.prefs.v783learnAutoAdapt783 = !current
    AppToast.show(this, "Learn Auto Adapt783: ${if (!current) "ON" else "OFF"}")
}

// v783: Left Auto Panel783
internal fun PlayerActivity.showV783LeftAutoPanel783Toggle() {
    val current = BiliClient.prefs.v783leftAutoPanel783
    BiliClient.prefs.v783leftAutoPanel783 = !current
    AppToast.show(this, "Left Auto Panel783: ${if (!current) "ON" else "OFF"}")
}

// v784: Jump Auto Seek784
internal fun PlayerActivity.showV784JumpAutoSeek784Toggle() {
    val current = BiliClient.prefs.v784jumpAutoSeek784
    BiliClient.prefs.v784jumpAutoSeek784 = !current
    AppToast.show(this, "Jump Auto Seek784: ${if (!current) "ON" else "OFF"}")
}

// v784: Kernel Auto Tune784
internal fun PlayerActivity.showV784KernelAutoTune784Toggle() {
    val current = BiliClient.prefs.v784kernelAutoTune784
    BiliClient.prefs.v784kernelAutoTune784 = !current
    AppToast.show(this, "Kernel Auto Tune784: ${if (!current) "ON" else "OFF"}")
}

// v784: Key Auto Bind784
internal fun PlayerActivity.showV784KeyAutoBind784Toggle() {
    val current = BiliClient.prefs.v784keyAutoBind784
    BiliClient.prefs.v784keyAutoBind784 = !current
    AppToast.show(this, "Key Auto Bind784: ${if (!current) "ON" else "OFF"}")
}

// v784: Kill Auto Process784
internal fun PlayerActivity.showV784KillAutoProcess784Toggle() {
    val current = BiliClient.prefs.v784killAutoProcess784
    BiliClient.prefs.v784killAutoProcess784 = !current
    AppToast.show(this, "Kill Auto Process784: ${if (!current) "ON" else "OFF"}")
}

// v784: Kit Auto Load784
internal fun PlayerActivity.showV784KitAutoLoad784Toggle() {
    val current = BiliClient.prefs.v784kitAutoLoad784
    BiliClient.prefs.v784kitAutoLoad784 = !current
    AppToast.show(this, "Kit Auto Load784: ${if (!current) "ON" else "OFF"}")
}

// v784: Label Auto Tag784
internal fun PlayerActivity.showV784LabelAutoTag784Toggle() {
    val current = BiliClient.prefs.v784labelAutoTag784
    BiliClient.prefs.v784labelAutoTag784 = !current
    AppToast.show(this, "Label Auto Tag784: ${if (!current) "ON" else "OFF"}")
}

// v784: Lag Auto Compensate784
internal fun PlayerActivity.showV784LagAutoCompensate784Toggle() {
    val current = BiliClient.prefs.v784lagAutoCompensate784
    BiliClient.prefs.v784lagAutoCompensate784 = !current
    AppToast.show(this, "Lag Auto Compensate784: ${if (!current) "ON" else "OFF"}")
}

// v784: Language Auto Detect784
internal fun PlayerActivity.showV784LanguageAutoDetect784Toggle() {
    val current = BiliClient.prefs.v784languageAutoDetect784
    BiliClient.prefs.v784languageAutoDetect784 = !current
    AppToast.show(this, "Language Auto Detect784: ${if (!current) "ON" else "OFF"}")
}

// v784: Layer Auto ZOrder784
internal fun PlayerActivity.showV784LayerAutoZOrder784Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v784layerAutoZOrder784).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder784",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v784layerAutoZOrder784 = value
        AppToast.show(this, "Layer Auto ZOrder784: $value")
    }
}

// v784: Layout Auto Reflow784
internal fun PlayerActivity.showV784LayoutAutoReflow784Toggle() {
    val current = BiliClient.prefs.v784layoutAutoReflow784
    BiliClient.prefs.v784layoutAutoReflow784 = !current
    AppToast.show(this, "Layout Auto Reflow784: ${if (!current) "ON" else "OFF"}")
}

// v784: Lazy Auto Init784
internal fun PlayerActivity.showV784LazyAutoInit784Toggle() {
    val current = BiliClient.prefs.v784lazyAutoInit784
    BiliClient.prefs.v784lazyAutoInit784 = !current
    AppToast.show(this, "Lazy Auto Init784: ${if (!current) "ON" else "OFF"}")
}

// v784: Lead Auto Follow784
internal fun PlayerActivity.showV784LeadAutoFollow784Toggle() {
    val current = BiliClient.prefs.v784leadAutoFollow784
    BiliClient.prefs.v784leadAutoFollow784 = !current
    AppToast.show(this, "Lead Auto Follow784: ${if (!current) "ON" else "OFF"}")
}

// v784: Leaf Auto Node784
internal fun PlayerActivity.showV784LeafAutoNode784Toggle() {
    val current = BiliClient.prefs.v784leafAutoNode784
    BiliClient.prefs.v784leafAutoNode784 = !current
    AppToast.show(this, "Leaf Auto Node784: ${if (!current) "ON" else "OFF"}")
}

// v784: Learn Auto Adapt784
internal fun PlayerActivity.showV784LearnAutoAdapt784Toggle() {
    val current = BiliClient.prefs.v784learnAutoAdapt784
    BiliClient.prefs.v784learnAutoAdapt784 = !current
    AppToast.show(this, "Learn Auto Adapt784: ${if (!current) "ON" else "OFF"}")
}

// v784: Left Auto Panel784
internal fun PlayerActivity.showV784LeftAutoPanel784Toggle() {
    val current = BiliClient.prefs.v784leftAutoPanel784
    BiliClient.prefs.v784leftAutoPanel784 = !current
    AppToast.show(this, "Left Auto Panel784: ${if (!current) "ON" else "OFF"}")
}

// v785: Jump Auto Seek785
internal fun PlayerActivity.showV785JumpAutoSeek785Toggle() {
    val current = BiliClient.prefs.v785jumpAutoSeek785
    BiliClient.prefs.v785jumpAutoSeek785 = !current
    AppToast.show(this, "Jump Auto Seek785: ${if (!current) "ON" else "OFF"}")
}

// v785: Kernel Auto Tune785
internal fun PlayerActivity.showV785KernelAutoTune785Toggle() {
    val current = BiliClient.prefs.v785kernelAutoTune785
    BiliClient.prefs.v785kernelAutoTune785 = !current
    AppToast.show(this, "Kernel Auto Tune785: ${if (!current) "ON" else "OFF"}")
}

// v785: Key Auto Bind785
internal fun PlayerActivity.showV785KeyAutoBind785Toggle() {
    val current = BiliClient.prefs.v785keyAutoBind785
    BiliClient.prefs.v785keyAutoBind785 = !current
    AppToast.show(this, "Key Auto Bind785: ${if (!current) "ON" else "OFF"}")
}

// v785: Kill Auto Process785
internal fun PlayerActivity.showV785KillAutoProcess785Toggle() {
    val current = BiliClient.prefs.v785killAutoProcess785
    BiliClient.prefs.v785killAutoProcess785 = !current
    AppToast.show(this, "Kill Auto Process785: ${if (!current) "ON" else "OFF"}")
}

// v785: Kit Auto Load785
internal fun PlayerActivity.showV785KitAutoLoad785Toggle() {
    val current = BiliClient.prefs.v785kitAutoLoad785
    BiliClient.prefs.v785kitAutoLoad785 = !current
    AppToast.show(this, "Kit Auto Load785: ${if (!current) "ON" else "OFF"}")
}

// v785: Label Auto Tag785
internal fun PlayerActivity.showV785LabelAutoTag785Toggle() {
    val current = BiliClient.prefs.v785labelAutoTag785
    BiliClient.prefs.v785labelAutoTag785 = !current
    AppToast.show(this, "Label Auto Tag785: ${if (!current) "ON" else "OFF"}")
}

// v785: Lag Auto Compensate785
internal fun PlayerActivity.showV785LagAutoCompensate785Toggle() {
    val current = BiliClient.prefs.v785lagAutoCompensate785
    BiliClient.prefs.v785lagAutoCompensate785 = !current
    AppToast.show(this, "Lag Auto Compensate785: ${if (!current) "ON" else "OFF"}")
}

// v785: Language Auto Detect785
internal fun PlayerActivity.showV785LanguageAutoDetect785Toggle() {
    val current = BiliClient.prefs.v785languageAutoDetect785
    BiliClient.prefs.v785languageAutoDetect785 = !current
    AppToast.show(this, "Language Auto Detect785: ${if (!current) "ON" else "OFF"}")
}

// v785: Layer Auto ZOrder785
internal fun PlayerActivity.showV785LayerAutoZOrder785Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v785layerAutoZOrder785).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder785",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v785layerAutoZOrder785 = value
        AppToast.show(this, "Layer Auto ZOrder785: $value")
    }
}

// v785: Layout Auto Reflow785
internal fun PlayerActivity.showV785LayoutAutoReflow785Toggle() {
    val current = BiliClient.prefs.v785layoutAutoReflow785
    BiliClient.prefs.v785layoutAutoReflow785 = !current
    AppToast.show(this, "Layout Auto Reflow785: ${if (!current) "ON" else "OFF"}")
}

// v785: Lazy Auto Init785
internal fun PlayerActivity.showV785LazyAutoInit785Toggle() {
    val current = BiliClient.prefs.v785lazyAutoInit785
    BiliClient.prefs.v785lazyAutoInit785 = !current
    AppToast.show(this, "Lazy Auto Init785: ${if (!current) "ON" else "OFF"}")
}

// v785: Lead Auto Follow785
internal fun PlayerActivity.showV785LeadAutoFollow785Toggle() {
    val current = BiliClient.prefs.v785leadAutoFollow785
    BiliClient.prefs.v785leadAutoFollow785 = !current
    AppToast.show(this, "Lead Auto Follow785: ${if (!current) "ON" else "OFF"}")
}

// v785: Leaf Auto Node785
internal fun PlayerActivity.showV785LeafAutoNode785Toggle() {
    val current = BiliClient.prefs.v785leafAutoNode785
    BiliClient.prefs.v785leafAutoNode785 = !current
    AppToast.show(this, "Leaf Auto Node785: ${if (!current) "ON" else "OFF"}")
}

// v785: Learn Auto Adapt785
internal fun PlayerActivity.showV785LearnAutoAdapt785Toggle() {
    val current = BiliClient.prefs.v785learnAutoAdapt785
    BiliClient.prefs.v785learnAutoAdapt785 = !current
    AppToast.show(this, "Learn Auto Adapt785: ${if (!current) "ON" else "OFF"}")
}

// v785: Left Auto Panel785
internal fun PlayerActivity.showV785LeftAutoPanel785Toggle() {
    val current = BiliClient.prefs.v785leftAutoPanel785
    BiliClient.prefs.v785leftAutoPanel785 = !current
    AppToast.show(this, "Left Auto Panel785: ${if (!current) "ON" else "OFF"}")
}

// v786: Jump Auto Seek786
internal fun PlayerActivity.showV786JumpAutoSeek786Toggle() {
    val current = BiliClient.prefs.v786jumpAutoSeek786
    BiliClient.prefs.v786jumpAutoSeek786 = !current
    AppToast.show(this, "Jump Auto Seek786: ${if (!current) "ON" else "OFF"}")
}

// v786: Kernel Auto Tune786
internal fun PlayerActivity.showV786KernelAutoTune786Toggle() {
    val current = BiliClient.prefs.v786kernelAutoTune786
    BiliClient.prefs.v786kernelAutoTune786 = !current
    AppToast.show(this, "Kernel Auto Tune786: ${if (!current) "ON" else "OFF"}")
}

// v786: Key Auto Bind786
internal fun PlayerActivity.showV786KeyAutoBind786Toggle() {
    val current = BiliClient.prefs.v786keyAutoBind786
    BiliClient.prefs.v786keyAutoBind786 = !current
    AppToast.show(this, "Key Auto Bind786: ${if (!current) "ON" else "OFF"}")
}

// v786: Kill Auto Process786
internal fun PlayerActivity.showV786KillAutoProcess786Toggle() {
    val current = BiliClient.prefs.v786killAutoProcess786
    BiliClient.prefs.v786killAutoProcess786 = !current
    AppToast.show(this, "Kill Auto Process786: ${if (!current) "ON" else "OFF"}")
}

// v786: Kit Auto Load786
internal fun PlayerActivity.showV786KitAutoLoad786Toggle() {
    val current = BiliClient.prefs.v786kitAutoLoad786
    BiliClient.prefs.v786kitAutoLoad786 = !current
    AppToast.show(this, "Kit Auto Load786: ${if (!current) "ON" else "OFF"}")
}

// v786: Label Auto Tag786
internal fun PlayerActivity.showV786LabelAutoTag786Toggle() {
    val current = BiliClient.prefs.v786labelAutoTag786
    BiliClient.prefs.v786labelAutoTag786 = !current
    AppToast.show(this, "Label Auto Tag786: ${if (!current) "ON" else "OFF"}")
}

// v786: Lag Auto Compensate786
internal fun PlayerActivity.showV786LagAutoCompensate786Toggle() {
    val current = BiliClient.prefs.v786lagAutoCompensate786
    BiliClient.prefs.v786lagAutoCompensate786 = !current
    AppToast.show(this, "Lag Auto Compensate786: ${if (!current) "ON" else "OFF"}")
}

// v786: Language Auto Detect786
internal fun PlayerActivity.showV786LanguageAutoDetect786Toggle() {
    val current = BiliClient.prefs.v786languageAutoDetect786
    BiliClient.prefs.v786languageAutoDetect786 = !current
    AppToast.show(this, "Language Auto Detect786: ${if (!current) "ON" else "OFF"}")
}

// v786: Layer Auto ZOrder786
internal fun PlayerActivity.showV786LayerAutoZOrder786Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v786layerAutoZOrder786).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder786",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v786layerAutoZOrder786 = value
        AppToast.show(this, "Layer Auto ZOrder786: $value")
    }
}

// v786: Layout Auto Reflow786
internal fun PlayerActivity.showV786LayoutAutoReflow786Toggle() {
    val current = BiliClient.prefs.v786layoutAutoReflow786
    BiliClient.prefs.v786layoutAutoReflow786 = !current
    AppToast.show(this, "Layout Auto Reflow786: ${if (!current) "ON" else "OFF"}")
}

// v786: Lazy Auto Init786
internal fun PlayerActivity.showV786LazyAutoInit786Toggle() {
    val current = BiliClient.prefs.v786lazyAutoInit786
    BiliClient.prefs.v786lazyAutoInit786 = !current
    AppToast.show(this, "Lazy Auto Init786: ${if (!current) "ON" else "OFF"}")
}

// v786: Lead Auto Follow786
internal fun PlayerActivity.showV786LeadAutoFollow786Toggle() {
    val current = BiliClient.prefs.v786leadAutoFollow786
    BiliClient.prefs.v786leadAutoFollow786 = !current
    AppToast.show(this, "Lead Auto Follow786: ${if (!current) "ON" else "OFF"}")
}

// v786: Leaf Auto Node786
internal fun PlayerActivity.showV786LeafAutoNode786Toggle() {
    val current = BiliClient.prefs.v786leafAutoNode786
    BiliClient.prefs.v786leafAutoNode786 = !current
    AppToast.show(this, "Leaf Auto Node786: ${if (!current) "ON" else "OFF"}")
}

// v786: Learn Auto Adapt786
internal fun PlayerActivity.showV786LearnAutoAdapt786Toggle() {
    val current = BiliClient.prefs.v786learnAutoAdapt786
    BiliClient.prefs.v786learnAutoAdapt786 = !current
    AppToast.show(this, "Learn Auto Adapt786: ${if (!current) "ON" else "OFF"}")
}

// v786: Left Auto Panel786
internal fun PlayerActivity.showV786LeftAutoPanel786Toggle() {
    val current = BiliClient.prefs.v786leftAutoPanel786
    BiliClient.prefs.v786leftAutoPanel786 = !current
    AppToast.show(this, "Left Auto Panel786: ${if (!current) "ON" else "OFF"}")
}

// v787: Jump Auto Seek787
internal fun PlayerActivity.showV787JumpAutoSeek787Toggle() {
    val current = BiliClient.prefs.v787jumpAutoSeek787
    BiliClient.prefs.v787jumpAutoSeek787 = !current
    AppToast.show(this, "Jump Auto Seek787: ${if (!current) "ON" else "OFF"}")
}

// v787: Kernel Auto Tune787
internal fun PlayerActivity.showV787KernelAutoTune787Toggle() {
    val current = BiliClient.prefs.v787kernelAutoTune787
    BiliClient.prefs.v787kernelAutoTune787 = !current
    AppToast.show(this, "Kernel Auto Tune787: ${if (!current) "ON" else "OFF"}")
}

// v787: Key Auto Bind787
internal fun PlayerActivity.showV787KeyAutoBind787Toggle() {
    val current = BiliClient.prefs.v787keyAutoBind787
    BiliClient.prefs.v787keyAutoBind787 = !current
    AppToast.show(this, "Key Auto Bind787: ${if (!current) "ON" else "OFF"}")
}

// v787: Kill Auto Process787
internal fun PlayerActivity.showV787KillAutoProcess787Toggle() {
    val current = BiliClient.prefs.v787killAutoProcess787
    BiliClient.prefs.v787killAutoProcess787 = !current
    AppToast.show(this, "Kill Auto Process787: ${if (!current) "ON" else "OFF"}")
}

// v787: Kit Auto Load787
internal fun PlayerActivity.showV787KitAutoLoad787Toggle() {
    val current = BiliClient.prefs.v787kitAutoLoad787
    BiliClient.prefs.v787kitAutoLoad787 = !current
    AppToast.show(this, "Kit Auto Load787: ${if (!current) "ON" else "OFF"}")
}

// v787: Label Auto Tag787
internal fun PlayerActivity.showV787LabelAutoTag787Toggle() {
    val current = BiliClient.prefs.v787labelAutoTag787
    BiliClient.prefs.v787labelAutoTag787 = !current
    AppToast.show(this, "Label Auto Tag787: ${if (!current) "ON" else "OFF"}")
}

// v787: Lag Auto Compensate787
internal fun PlayerActivity.showV787LagAutoCompensate787Toggle() {
    val current = BiliClient.prefs.v787lagAutoCompensate787
    BiliClient.prefs.v787lagAutoCompensate787 = !current
    AppToast.show(this, "Lag Auto Compensate787: ${if (!current) "ON" else "OFF"}")
}

// v787: Language Auto Detect787
internal fun PlayerActivity.showV787LanguageAutoDetect787Toggle() {
    val current = BiliClient.prefs.v787languageAutoDetect787
    BiliClient.prefs.v787languageAutoDetect787 = !current
    AppToast.show(this, "Language Auto Detect787: ${if (!current) "ON" else "OFF"}")
}

// v787: Layer Auto ZOrder787
internal fun PlayerActivity.showV787LayerAutoZOrder787Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v787layerAutoZOrder787).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder787",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v787layerAutoZOrder787 = value
        AppToast.show(this, "Layer Auto ZOrder787: $value")
    }
}

// v787: Layout Auto Reflow787
internal fun PlayerActivity.showV787LayoutAutoReflow787Toggle() {
    val current = BiliClient.prefs.v787layoutAutoReflow787
    BiliClient.prefs.v787layoutAutoReflow787 = !current
    AppToast.show(this, "Layout Auto Reflow787: ${if (!current) "ON" else "OFF"}")
}

// v787: Lazy Auto Init787
internal fun PlayerActivity.showV787LazyAutoInit787Toggle() {
    val current = BiliClient.prefs.v787lazyAutoInit787
    BiliClient.prefs.v787lazyAutoInit787 = !current
    AppToast.show(this, "Lazy Auto Init787: ${if (!current) "ON" else "OFF"}")
}

// v787: Lead Auto Follow787
internal fun PlayerActivity.showV787LeadAutoFollow787Toggle() {
    val current = BiliClient.prefs.v787leadAutoFollow787
    BiliClient.prefs.v787leadAutoFollow787 = !current
    AppToast.show(this, "Lead Auto Follow787: ${if (!current) "ON" else "OFF"}")
}

// v787: Leaf Auto Node787
internal fun PlayerActivity.showV787LeafAutoNode787Toggle() {
    val current = BiliClient.prefs.v787leafAutoNode787
    BiliClient.prefs.v787leafAutoNode787 = !current
    AppToast.show(this, "Leaf Auto Node787: ${if (!current) "ON" else "OFF"}")
}

// v787: Learn Auto Adapt787
internal fun PlayerActivity.showV787LearnAutoAdapt787Toggle() {
    val current = BiliClient.prefs.v787learnAutoAdapt787
    BiliClient.prefs.v787learnAutoAdapt787 = !current
    AppToast.show(this, "Learn Auto Adapt787: ${if (!current) "ON" else "OFF"}")
}

// v787: Left Auto Panel787
internal fun PlayerActivity.showV787LeftAutoPanel787Toggle() {
    val current = BiliClient.prefs.v787leftAutoPanel787
    BiliClient.prefs.v787leftAutoPanel787 = !current
    AppToast.show(this, "Left Auto Panel787: ${if (!current) "ON" else "OFF"}")
}

// v788: Jump Auto Seek788
internal fun PlayerActivity.showV788JumpAutoSeek788Toggle() {
    val current = BiliClient.prefs.v788jumpAutoSeek788
    BiliClient.prefs.v788jumpAutoSeek788 = !current
    AppToast.show(this, "Jump Auto Seek788: ${if (!current) "ON" else "OFF"}")
}

// v788: Kernel Auto Tune788
internal fun PlayerActivity.showV788KernelAutoTune788Toggle() {
    val current = BiliClient.prefs.v788kernelAutoTune788
    BiliClient.prefs.v788kernelAutoTune788 = !current
    AppToast.show(this, "Kernel Auto Tune788: ${if (!current) "ON" else "OFF"}")
}

// v788: Key Auto Bind788
internal fun PlayerActivity.showV788KeyAutoBind788Toggle() {
    val current = BiliClient.prefs.v788keyAutoBind788
    BiliClient.prefs.v788keyAutoBind788 = !current
    AppToast.show(this, "Key Auto Bind788: ${if (!current) "ON" else "OFF"}")
}

// v788: Kill Auto Process788
internal fun PlayerActivity.showV788KillAutoProcess788Toggle() {
    val current = BiliClient.prefs.v788killAutoProcess788
    BiliClient.prefs.v788killAutoProcess788 = !current
    AppToast.show(this, "Kill Auto Process788: ${if (!current) "ON" else "OFF"}")
}

// v788: Kit Auto Load788
internal fun PlayerActivity.showV788KitAutoLoad788Toggle() {
    val current = BiliClient.prefs.v788kitAutoLoad788
    BiliClient.prefs.v788kitAutoLoad788 = !current
    AppToast.show(this, "Kit Auto Load788: ${if (!current) "ON" else "OFF"}")
}

// v788: Label Auto Tag788
internal fun PlayerActivity.showV788LabelAutoTag788Toggle() {
    val current = BiliClient.prefs.v788labelAutoTag788
    BiliClient.prefs.v788labelAutoTag788 = !current
    AppToast.show(this, "Label Auto Tag788: ${if (!current) "ON" else "OFF"}")
}

// v788: Lag Auto Compensate788
internal fun PlayerActivity.showV788LagAutoCompensate788Toggle() {
    val current = BiliClient.prefs.v788lagAutoCompensate788
    BiliClient.prefs.v788lagAutoCompensate788 = !current
    AppToast.show(this, "Lag Auto Compensate788: ${if (!current) "ON" else "OFF"}")
}

// v788: Language Auto Detect788
internal fun PlayerActivity.showV788LanguageAutoDetect788Toggle() {
    val current = BiliClient.prefs.v788languageAutoDetect788
    BiliClient.prefs.v788languageAutoDetect788 = !current
    AppToast.show(this, "Language Auto Detect788: ${if (!current) "ON" else "OFF"}")
}

// v788: Layer Auto ZOrder788
internal fun PlayerActivity.showV788LayerAutoZOrder788Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v788layerAutoZOrder788).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder788",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v788layerAutoZOrder788 = value
        AppToast.show(this, "Layer Auto ZOrder788: $value")
    }
}

// v788: Layout Auto Reflow788
internal fun PlayerActivity.showV788LayoutAutoReflow788Toggle() {
    val current = BiliClient.prefs.v788layoutAutoReflow788
    BiliClient.prefs.v788layoutAutoReflow788 = !current
    AppToast.show(this, "Layout Auto Reflow788: ${if (!current) "ON" else "OFF"}")
}

// v788: Lazy Auto Init788
internal fun PlayerActivity.showV788LazyAutoInit788Toggle() {
    val current = BiliClient.prefs.v788lazyAutoInit788
    BiliClient.prefs.v788lazyAutoInit788 = !current
    AppToast.show(this, "Lazy Auto Init788: ${if (!current) "ON" else "OFF"}")
}

// v788: Lead Auto Follow788
internal fun PlayerActivity.showV788LeadAutoFollow788Toggle() {
    val current = BiliClient.prefs.v788leadAutoFollow788
    BiliClient.prefs.v788leadAutoFollow788 = !current
    AppToast.show(this, "Lead Auto Follow788: ${if (!current) "ON" else "OFF"}")
}

// v788: Leaf Auto Node788
internal fun PlayerActivity.showV788LeafAutoNode788Toggle() {
    val current = BiliClient.prefs.v788leafAutoNode788
    BiliClient.prefs.v788leafAutoNode788 = !current
    AppToast.show(this, "Leaf Auto Node788: ${if (!current) "ON" else "OFF"}")
}

// v788: Learn Auto Adapt788
internal fun PlayerActivity.showV788LearnAutoAdapt788Toggle() {
    val current = BiliClient.prefs.v788learnAutoAdapt788
    BiliClient.prefs.v788learnAutoAdapt788 = !current
    AppToast.show(this, "Learn Auto Adapt788: ${if (!current) "ON" else "OFF"}")
}

// v788: Left Auto Panel788
internal fun PlayerActivity.showV788LeftAutoPanel788Toggle() {
    val current = BiliClient.prefs.v788leftAutoPanel788
    BiliClient.prefs.v788leftAutoPanel788 = !current
    AppToast.show(this, "Left Auto Panel788: ${if (!current) "ON" else "OFF"}")
}

// v789: Jump Auto Seek789
internal fun PlayerActivity.showV789JumpAutoSeek789Toggle() {
    val current = BiliClient.prefs.v789jumpAutoSeek789
    BiliClient.prefs.v789jumpAutoSeek789 = !current
    AppToast.show(this, "Jump Auto Seek789: ${if (!current) "ON" else "OFF"}")
}

// v789: Kernel Auto Tune789
internal fun PlayerActivity.showV789KernelAutoTune789Toggle() {
    val current = BiliClient.prefs.v789kernelAutoTune789
    BiliClient.prefs.v789kernelAutoTune789 = !current
    AppToast.show(this, "Kernel Auto Tune789: ${if (!current) "ON" else "OFF"}")
}

// v789: Key Auto Bind789
internal fun PlayerActivity.showV789KeyAutoBind789Toggle() {
    val current = BiliClient.prefs.v789keyAutoBind789
    BiliClient.prefs.v789keyAutoBind789 = !current
    AppToast.show(this, "Key Auto Bind789: ${if (!current) "ON" else "OFF"}")
}

// v789: Kill Auto Process789
internal fun PlayerActivity.showV789KillAutoProcess789Toggle() {
    val current = BiliClient.prefs.v789killAutoProcess789
    BiliClient.prefs.v789killAutoProcess789 = !current
    AppToast.show(this, "Kill Auto Process789: ${if (!current) "ON" else "OFF"}")
}

// v789: Kit Auto Load789
internal fun PlayerActivity.showV789KitAutoLoad789Toggle() {
    val current = BiliClient.prefs.v789kitAutoLoad789
    BiliClient.prefs.v789kitAutoLoad789 = !current
    AppToast.show(this, "Kit Auto Load789: ${if (!current) "ON" else "OFF"}")
}

// v789: Label Auto Tag789
internal fun PlayerActivity.showV789LabelAutoTag789Toggle() {
    val current = BiliClient.prefs.v789labelAutoTag789
    BiliClient.prefs.v789labelAutoTag789 = !current
    AppToast.show(this, "Label Auto Tag789: ${if (!current) "ON" else "OFF"}")
}

// v789: Lag Auto Compensate789
internal fun PlayerActivity.showV789LagAutoCompensate789Toggle() {
    val current = BiliClient.prefs.v789lagAutoCompensate789
    BiliClient.prefs.v789lagAutoCompensate789 = !current
    AppToast.show(this, "Lag Auto Compensate789: ${if (!current) "ON" else "OFF"}")
}

// v789: Language Auto Detect789
internal fun PlayerActivity.showV789LanguageAutoDetect789Toggle() {
    val current = BiliClient.prefs.v789languageAutoDetect789
    BiliClient.prefs.v789languageAutoDetect789 = !current
    AppToast.show(this, "Language Auto Detect789: ${if (!current) "ON" else "OFF"}")
}

// v789: Layer Auto ZOrder789
internal fun PlayerActivity.showV789LayerAutoZOrder789Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v789layerAutoZOrder789).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder789",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v789layerAutoZOrder789 = value
        AppToast.show(this, "Layer Auto ZOrder789: $value")
    }
}

// v789: Layout Auto Reflow789
internal fun PlayerActivity.showV789LayoutAutoReflow789Toggle() {
    val current = BiliClient.prefs.v789layoutAutoReflow789
    BiliClient.prefs.v789layoutAutoReflow789 = !current
    AppToast.show(this, "Layout Auto Reflow789: ${if (!current) "ON" else "OFF"}")
}

// v789: Lazy Auto Init789
internal fun PlayerActivity.showV789LazyAutoInit789Toggle() {
    val current = BiliClient.prefs.v789lazyAutoInit789
    BiliClient.prefs.v789lazyAutoInit789 = !current
    AppToast.show(this, "Lazy Auto Init789: ${if (!current) "ON" else "OFF"}")
}

// v789: Lead Auto Follow789
internal fun PlayerActivity.showV789LeadAutoFollow789Toggle() {
    val current = BiliClient.prefs.v789leadAutoFollow789
    BiliClient.prefs.v789leadAutoFollow789 = !current
    AppToast.show(this, "Lead Auto Follow789: ${if (!current) "ON" else "OFF"}")
}

// v789: Leaf Auto Node789
internal fun PlayerActivity.showV789LeafAutoNode789Toggle() {
    val current = BiliClient.prefs.v789leafAutoNode789
    BiliClient.prefs.v789leafAutoNode789 = !current
    AppToast.show(this, "Leaf Auto Node789: ${if (!current) "ON" else "OFF"}")
}

// v789: Learn Auto Adapt789
internal fun PlayerActivity.showV789LearnAutoAdapt789Toggle() {
    val current = BiliClient.prefs.v789learnAutoAdapt789
    BiliClient.prefs.v789learnAutoAdapt789 = !current
    AppToast.show(this, "Learn Auto Adapt789: ${if (!current) "ON" else "OFF"}")
}

// v789: Left Auto Panel789
internal fun PlayerActivity.showV789LeftAutoPanel789Toggle() {
    val current = BiliClient.prefs.v789leftAutoPanel789
    BiliClient.prefs.v789leftAutoPanel789 = !current
    AppToast.show(this, "Left Auto Panel789: ${if (!current) "ON" else "OFF"}")
}

// v790: Jump Auto Seek790
internal fun PlayerActivity.showV790JumpAutoSeek790Toggle() {
    val current = BiliClient.prefs.v790jumpAutoSeek790
    BiliClient.prefs.v790jumpAutoSeek790 = !current
    AppToast.show(this, "Jump Auto Seek790: ${if (!current) "ON" else "OFF"}")
}

// v790: Kernel Auto Tune790
internal fun PlayerActivity.showV790KernelAutoTune790Toggle() {
    val current = BiliClient.prefs.v790kernelAutoTune790
    BiliClient.prefs.v790kernelAutoTune790 = !current
    AppToast.show(this, "Kernel Auto Tune790: ${if (!current) "ON" else "OFF"}")
}

// v790: Key Auto Bind790
internal fun PlayerActivity.showV790KeyAutoBind790Toggle() {
    val current = BiliClient.prefs.v790keyAutoBind790
    BiliClient.prefs.v790keyAutoBind790 = !current
    AppToast.show(this, "Key Auto Bind790: ${if (!current) "ON" else "OFF"}")
}

// v790: Kill Auto Process790
internal fun PlayerActivity.showV790KillAutoProcess790Toggle() {
    val current = BiliClient.prefs.v790killAutoProcess790
    BiliClient.prefs.v790killAutoProcess790 = !current
    AppToast.show(this, "Kill Auto Process790: ${if (!current) "ON" else "OFF"}")
}

// v790: Kit Auto Load790
internal fun PlayerActivity.showV790KitAutoLoad790Toggle() {
    val current = BiliClient.prefs.v790kitAutoLoad790
    BiliClient.prefs.v790kitAutoLoad790 = !current
    AppToast.show(this, "Kit Auto Load790: ${if (!current) "ON" else "OFF"}")
}

// v790: Label Auto Tag790
internal fun PlayerActivity.showV790LabelAutoTag790Toggle() {
    val current = BiliClient.prefs.v790labelAutoTag790
    BiliClient.prefs.v790labelAutoTag790 = !current
    AppToast.show(this, "Label Auto Tag790: ${if (!current) "ON" else "OFF"}")
}

// v790: Lag Auto Compensate790
internal fun PlayerActivity.showV790LagAutoCompensate790Toggle() {
    val current = BiliClient.prefs.v790lagAutoCompensate790
    BiliClient.prefs.v790lagAutoCompensate790 = !current
    AppToast.show(this, "Lag Auto Compensate790: ${if (!current) "ON" else "OFF"}")
}

// v790: Language Auto Detect790
internal fun PlayerActivity.showV790LanguageAutoDetect790Toggle() {
    val current = BiliClient.prefs.v790languageAutoDetect790
    BiliClient.prefs.v790languageAutoDetect790 = !current
    AppToast.show(this, "Language Auto Detect790: ${if (!current) "ON" else "OFF"}")
}

// v790: Layer Auto ZOrder790
internal fun PlayerActivity.showV790LayerAutoZOrder790Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v790layerAutoZOrder790).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Layer Auto ZOrder790",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v790layerAutoZOrder790 = value
        AppToast.show(this, "Layer Auto ZOrder790: $value")
    }
}

// v790: Layout Auto Reflow790
internal fun PlayerActivity.showV790LayoutAutoReflow790Toggle() {
    val current = BiliClient.prefs.v790layoutAutoReflow790
    BiliClient.prefs.v790layoutAutoReflow790 = !current
    AppToast.show(this, "Layout Auto Reflow790: ${if (!current) "ON" else "OFF"}")
}

// v790: Lazy Auto Init790
internal fun PlayerActivity.showV790LazyAutoInit790Toggle() {
    val current = BiliClient.prefs.v790lazyAutoInit790
    BiliClient.prefs.v790lazyAutoInit790 = !current
    AppToast.show(this, "Lazy Auto Init790: ${if (!current) "ON" else "OFF"}")
}

// v790: Lead Auto Follow790
internal fun PlayerActivity.showV790LeadAutoFollow790Toggle() {
    val current = BiliClient.prefs.v790leadAutoFollow790
    BiliClient.prefs.v790leadAutoFollow790 = !current
    AppToast.show(this, "Lead Auto Follow790: ${if (!current) "ON" else "OFF"}")
}

// v790: Leaf Auto Node790
internal fun PlayerActivity.showV790LeafAutoNode790Toggle() {
    val current = BiliClient.prefs.v790leafAutoNode790
    BiliClient.prefs.v790leafAutoNode790 = !current
    AppToast.show(this, "Leaf Auto Node790: ${if (!current) "ON" else "OFF"}")
}

// v790: Learn Auto Adapt790
internal fun PlayerActivity.showV790LearnAutoAdapt790Toggle() {
    val current = BiliClient.prefs.v790learnAutoAdapt790
    BiliClient.prefs.v790learnAutoAdapt790 = !current
    AppToast.show(this, "Learn Auto Adapt790: ${if (!current) "ON" else "OFF"}")
}

// v790: Left Auto Panel790
internal fun PlayerActivity.showV790LeftAutoPanel790Toggle() {
    val current = BiliClient.prefs.v790leftAutoPanel790
    BiliClient.prefs.v790leftAutoPanel790 = !current
    AppToast.show(this, "Left Auto Panel790: ${if (!current) "ON" else "OFF"}")
}

