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

internal fun PlayerActivity.showV528ResultAutoSort528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528resultAutoSort528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528resultAutoSort528 = value
        AppToast.show(this, "Result Auto Sort528: $value")
    }
// v529: Render Auto Quality529


internal fun PlayerActivity.showV529RenderAutoQuality529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529renderAutoQuality529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529renderAutoQuality529 = value
        AppToast.show(this, "Render Auto Quality529: $value")
    }
// v529: Result Auto Sort529


internal fun PlayerActivity.showV529ResultAutoSort529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529resultAutoSort529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529resultAutoSort529 = value
        AppToast.show(this, "Result Auto Sort529: $value")
    }
// v530: Render Auto Quality530


internal fun PlayerActivity.showV530RenderAutoQuality530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530renderAutoQuality530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530renderAutoQuality530 = value
        AppToast.show(this, "Render Auto Quality530: $value")
    }
// v530: Result Auto Sort530


internal fun PlayerActivity.showV530ResultAutoSort530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530resultAutoSort530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530resultAutoSort530 = value
        AppToast.show(this, "Result Auto Sort530: $value")
    }
// v541: Sharp Auto Adjust541


internal fun PlayerActivity.showV541SharpAutoAdjust541Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v541sharpAutoAdjust541).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust541",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v541sharpAutoAdjust541 = value
        AppToast.show(this, "Sharp Auto Adjust541: $value")
    }
// v542: Sharp Auto Adjust542


internal fun PlayerActivity.showV542SharpAutoAdjust542Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v542sharpAutoAdjust542).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust542",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v542sharpAutoAdjust542 = value
        AppToast.show(this, "Sharp Auto Adjust542: $value")
    }
// v543: Sharp Auto Adjust543


internal fun PlayerActivity.showV543SharpAutoAdjust543Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v543sharpAutoAdjust543).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust543",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v543sharpAutoAdjust543 = value
        AppToast.show(this, "Sharp Auto Adjust543: $value")
    }
// v544: Sharp Auto Adjust544


internal fun PlayerActivity.showV544SharpAutoAdjust544Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v544sharpAutoAdjust544).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust544",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v544sharpAutoAdjust544 = value
        AppToast.show(this, "Sharp Auto Adjust544: $value")
    }
// v545: Sharp Auto Adjust545


internal fun PlayerActivity.showV545SharpAutoAdjust545Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v545sharpAutoAdjust545).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust545",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v545sharpAutoAdjust545 = value
        AppToast.show(this, "Sharp Auto Adjust545: $value")
    }
// v546: Sharp Auto Adjust546


internal fun PlayerActivity.showV546SharpAutoAdjust546Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v546sharpAutoAdjust546).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust546",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v546sharpAutoAdjust546 = value
        AppToast.show(this, "Sharp Auto Adjust546: $value")
    }
// v547: Sharp Auto Adjust547


internal fun PlayerActivity.showV547SharpAutoAdjust547Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v547sharpAutoAdjust547).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust547",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v547sharpAutoAdjust547 = value
        AppToast.show(this, "Sharp Auto Adjust547: $value")
    }
// v548: Sharp Auto Adjust548


internal fun PlayerActivity.showV548SharpAutoAdjust548Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v548sharpAutoAdjust548).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust548",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v548sharpAutoAdjust548 = value
        AppToast.show(this, "Sharp Auto Adjust548: $value")
    }
// v549: Sharp Auto Adjust549


internal fun PlayerActivity.showV549SharpAutoAdjust549Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v549sharpAutoAdjust549).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust549",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v549sharpAutoAdjust549 = value
        AppToast.show(this, "Sharp Auto Adjust549: $value")
    }
// v550: Sharp Auto Adjust550


internal fun PlayerActivity.showV550SharpAutoAdjust550Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v550sharpAutoAdjust550).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust550",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v550sharpAutoAdjust550 = value
        AppToast.show(this, "Sharp Auto Adjust550: $value")
    }
// v551: Smart Auto Quality551


internal fun PlayerActivity.showV551SmartAutoQuality551Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v551smartAutoQuality551).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality551",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v551smartAutoQuality551 = value
        AppToast.show(this, "Smart Auto Quality551: $value")
    }
// v551: Sort Auto Algorithm551


internal fun PlayerActivity.showV551SortAutoAlgorithm551Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v551sortAutoAlgorithm551).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm551",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v551sortAutoAlgorithm551 = value
        AppToast.show(this, "Sort Auto Algorithm551: $value")
    }
// v552: Smart Auto Quality552


internal fun PlayerActivity.showV552SmartAutoQuality552Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v552smartAutoQuality552).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality552",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v552smartAutoQuality552 = value
        AppToast.show(this, "Smart Auto Quality552: $value")
    }
// v552: Sort Auto Algorithm552


internal fun PlayerActivity.showV552SortAutoAlgorithm552Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v552sortAutoAlgorithm552).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm552",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v552sortAutoAlgorithm552 = value
        AppToast.show(this, "Sort Auto Algorithm552: $value")
    }
// v553: Smart Auto Quality553


internal fun PlayerActivity.showV553SmartAutoQuality553Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v553smartAutoQuality553).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality553",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v553smartAutoQuality553 = value
        AppToast.show(this, "Smart Auto Quality553: $value")
    }
// v553: Sort Auto Algorithm553


internal fun PlayerActivity.showV553SortAutoAlgorithm553Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v553sortAutoAlgorithm553).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm553",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v553sortAutoAlgorithm553 = value
        AppToast.show(this, "Sort Auto Algorithm553: $value")
    }
// v554: Smart Auto Quality554


internal fun PlayerActivity.showV554SmartAutoQuality554Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v554smartAutoQuality554).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality554",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v554smartAutoQuality554 = value
        AppToast.show(this, "Smart Auto Quality554: $value")
    }
// v554: Sort Auto Algorithm554


internal fun PlayerActivity.showV554SortAutoAlgorithm554Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v554sortAutoAlgorithm554).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm554",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v554sortAutoAlgorithm554 = value
        AppToast.show(this, "Sort Auto Algorithm554: $value")
    }
// v555: Smart Auto Quality555


internal fun PlayerActivity.showV555SmartAutoQuality555Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v555smartAutoQuality555).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality555",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v555smartAutoQuality555 = value
        AppToast.show(this, "Smart Auto Quality555: $value")
    }
// v555: Sort Auto Algorithm555


internal fun PlayerActivity.showV555SortAutoAlgorithm555Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v555sortAutoAlgorithm555).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm555",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v555sortAutoAlgorithm555 = value
        AppToast.show(this, "Sort Auto Algorithm555: $value")
    }
// v556: Smart Auto Quality556


internal fun PlayerActivity.showV556SmartAutoQuality556Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v556smartAutoQuality556).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality556",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v556smartAutoQuality556 = value
        AppToast.show(this, "Smart Auto Quality556: $value")
    }
// v556: Sort Auto Algorithm556


internal fun PlayerActivity.showV556SortAutoAlgorithm556Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v556sortAutoAlgorithm556).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm556",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v556sortAutoAlgorithm556 = value
        AppToast.show(this, "Sort Auto Algorithm556: $value")
    }
// v557: Smart Auto Quality557


internal fun PlayerActivity.showV557SmartAutoQuality557Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v557smartAutoQuality557).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality557",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v557smartAutoQuality557 = value
        AppToast.show(this, "Smart Auto Quality557: $value")
    }
// v557: Sort Auto Algorithm557


internal fun PlayerActivity.showV557SortAutoAlgorithm557Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v557sortAutoAlgorithm557).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm557",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v557sortAutoAlgorithm557 = value
        AppToast.show(this, "Sort Auto Algorithm557: $value")
    }
// v558: Smart Auto Quality558


internal fun PlayerActivity.showV558SmartAutoQuality558Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v558smartAutoQuality558).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality558",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v558smartAutoQuality558 = value
        AppToast.show(this, "Smart Auto Quality558: $value")
    }
// v558: Sort Auto Algorithm558


internal fun PlayerActivity.showV558SortAutoAlgorithm558Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v558sortAutoAlgorithm558).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm558",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v558sortAutoAlgorithm558 = value
        AppToast.show(this, "Sort Auto Algorithm558: $value")
    }
// v559: Smart Auto Quality559


internal fun PlayerActivity.showV559SmartAutoQuality559Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v559smartAutoQuality559).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality559",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v559smartAutoQuality559 = value
        AppToast.show(this, "Smart Auto Quality559: $value")
    }
// v559: Sort Auto Algorithm559


internal fun PlayerActivity.showV559SortAutoAlgorithm559Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v559sortAutoAlgorithm559).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm559",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v559sortAutoAlgorithm559 = value
        AppToast.show(this, "Sort Auto Algorithm559: $value")
    }
// v560: Smart Auto Quality560


internal fun PlayerActivity.showV560SmartAutoQuality560Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v560smartAutoQuality560).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality560",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v560smartAutoQuality560 = value
        AppToast.show(this, "Smart Auto Quality560: $value")
    }
// v560: Sort Auto Algorithm560


internal fun PlayerActivity.showV560SortAutoAlgorithm560Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v560sortAutoAlgorithm560).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm560",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v560sortAutoAlgorithm560 = value
        AppToast.show(this, "Sort Auto Algorithm560: $value")
    }
// v561: Step Auto Increment561


internal fun PlayerActivity.showV561StepAutoIncrement561Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v561stepAutoIncrement561).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment561",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v561stepAutoIncrement561 = value
        AppToast.show(this, "Step Auto Increment561: $value")
    }
// v562: Step Auto Increment562


internal fun PlayerActivity.showV562StepAutoIncrement562Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v562stepAutoIncrement562).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment562",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v562stepAutoIncrement562 = value
        AppToast.show(this, "Step Auto Increment562: $value")
    }
// v563: Step Auto Increment563


internal fun PlayerActivity.showV563StepAutoIncrement563Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v563stepAutoIncrement563).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment563",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v563stepAutoIncrement563 = value
        AppToast.show(this, "Step Auto Increment563: $value")
    }
// v564: Step Auto Increment564


internal fun PlayerActivity.showV564StepAutoIncrement564Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v564stepAutoIncrement564).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment564",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v564stepAutoIncrement564 = value
        AppToast.show(this, "Step Auto Increment564: $value")
    }
// v565: Step Auto Increment565


internal fun PlayerActivity.showV565StepAutoIncrement565Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v565stepAutoIncrement565).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment565",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v565stepAutoIncrement565 = value
        AppToast.show(this, "Step Auto Increment565: $value")
    }
// v566: Step Auto Increment566


internal fun PlayerActivity.showV566StepAutoIncrement566Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v566stepAutoIncrement566).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment566",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v566stepAutoIncrement566 = value
        AppToast.show(this, "Step Auto Increment566: $value")
    }
// v567: Step Auto Increment567


internal fun PlayerActivity.showV567StepAutoIncrement567Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v567stepAutoIncrement567).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment567",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v567stepAutoIncrement567 = value
        AppToast.show(this, "Step Auto Increment567: $value")
    }
// v568: Step Auto Increment568


internal fun PlayerActivity.showV568StepAutoIncrement568Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v568stepAutoIncrement568).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment568",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v568stepAutoIncrement568 = value
        AppToast.show(this, "Step Auto Increment568: $value")
    }
// v569: Step Auto Increment569


internal fun PlayerActivity.showV569StepAutoIncrement569Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v569stepAutoIncrement569).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment569",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v569stepAutoIncrement569 = value
        AppToast.show(this, "Step Auto Increment569: $value")
    }
// v570: Step Auto Increment570


internal fun PlayerActivity.showV570StepAutoIncrement570Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v570stepAutoIncrement570).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment570",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v570stepAutoIncrement570 = value
        AppToast.show(this, "Step Auto Increment570: $value")
    }
// v571: Threshold Auto Set571


internal fun PlayerActivity.showV571ThresholdAutoSet571Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v571thresholdAutoSet571).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set571",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v571thresholdAutoSet571 = value
        AppToast.show(this, "Threshold Auto Set571: $value")
    }
// v572: Threshold Auto Set572


internal fun PlayerActivity.showV572ThresholdAutoSet572Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v572thresholdAutoSet572).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set572",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v572thresholdAutoSet572 = value
        AppToast.show(this, "Threshold Auto Set572: $value")
    }
// v573: Threshold Auto Set573


internal fun PlayerActivity.showV573ThresholdAutoSet573Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v573thresholdAutoSet573).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set573",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v573thresholdAutoSet573 = value
        AppToast.show(this, "Threshold Auto Set573: $value")
    }
// v574: Threshold Auto Set574


internal fun PlayerActivity.showV574ThresholdAutoSet574Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v574thresholdAutoSet574).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set574",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v574thresholdAutoSet574 = value
        AppToast.show(this, "Threshold Auto Set574: $value")
    }
// v575: Threshold Auto Set575


internal fun PlayerActivity.showV575ThresholdAutoSet575Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v575thresholdAutoSet575).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set575",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v575thresholdAutoSet575 = value
        AppToast.show(this, "Threshold Auto Set575: $value")
    }
// v576: Threshold Auto Set576


internal fun PlayerActivity.showV576ThresholdAutoSet576Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v576thresholdAutoSet576).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set576",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v576thresholdAutoSet576 = value
        AppToast.show(this, "Threshold Auto Set576: $value")
    }
// v577: Threshold Auto Set577


internal fun PlayerActivity.showV577ThresholdAutoSet577Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v577thresholdAutoSet577).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set577",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v577thresholdAutoSet577 = value
        AppToast.show(this, "Threshold Auto Set577: $value")
    }
// v578: Threshold Auto Set578


internal fun PlayerActivity.showV578ThresholdAutoSet578Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v578thresholdAutoSet578).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set578",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v578thresholdAutoSet578 = value
        AppToast.show(this, "Threshold Auto Set578: $value")
    }
// v579: Threshold Auto Set579


internal fun PlayerActivity.showV579ThresholdAutoSet579Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v579thresholdAutoSet579).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set579",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v579thresholdAutoSet579 = value
        AppToast.show(this, "Threshold Auto Set579: $value")
    }
// v580: Threshold Auto Set580


internal fun PlayerActivity.showV580ThresholdAutoSet580Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v580thresholdAutoSet580).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set580",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v580thresholdAutoSet580 = value
        AppToast.show(this, "Threshold Auto Set580: $value")
    }
// v581: View Auto Switch581


internal fun PlayerActivity.showV581ViewAutoSwitch581Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v581viewAutoSwitch581).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch581",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v581viewAutoSwitch581 = value
        AppToast.show(this, "View Auto Switch581: $value")
    }
// v581: Wait Auto Timeout581


internal fun PlayerActivity.showV581WaitAutoTimeout581Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v581waitAutoTimeout581).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout581",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v581waitAutoTimeout581 = value
        AppToast.show(this, "Wait Auto Timeout581: $value")
    }
// v582: View Auto Switch582


internal fun PlayerActivity.showV582ViewAutoSwitch582Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v582viewAutoSwitch582).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch582",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v582viewAutoSwitch582 = value
        AppToast.show(this, "View Auto Switch582: $value")
    }
// v582: Wait Auto Timeout582


internal fun PlayerActivity.showV582WaitAutoTimeout582Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v582waitAutoTimeout582).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout582",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v582waitAutoTimeout582 = value
        AppToast.show(this, "Wait Auto Timeout582: $value")
    }
// v583: View Auto Switch583


internal fun PlayerActivity.showV583ViewAutoSwitch583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583viewAutoSwitch583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583viewAutoSwitch583 = value
        AppToast.show(this, "View Auto Switch583: $value")
    }
// v583: Wait Auto Timeout583


internal fun PlayerActivity.showV583WaitAutoTimeout583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583waitAutoTimeout583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583waitAutoTimeout583 = value
        AppToast.show(this, "Wait Auto Timeout583: $value")
    }
// v584: View Auto Switch584


internal fun PlayerActivity.showV584ViewAutoSwitch584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584viewAutoSwitch584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584viewAutoSwitch584 = value
        AppToast.show(this, "View Auto Switch584: $value")
    }
// v584: Wait Auto Timeout584


internal fun PlayerActivity.showV584WaitAutoTimeout584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584waitAutoTimeout584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584waitAutoTimeout584 = value
        AppToast.show(this, "Wait Auto Timeout584: $value")
    }
// v585: View Auto Switch585


internal fun PlayerActivity.showV585ViewAutoSwitch585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585viewAutoSwitch585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585viewAutoSwitch585 = value
        AppToast.show(this, "View Auto Switch585: $value")
    }
// v585: Wait Auto Timeout585


internal fun PlayerActivity.showV585WaitAutoTimeout585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585waitAutoTimeout585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585waitAutoTimeout585 = value
        AppToast.show(this, "Wait Auto Timeout585: $value")
    }
// v586: View Auto Switch586


internal fun PlayerActivity.showV586ViewAutoSwitch586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586viewAutoSwitch586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586viewAutoSwitch586 = value
        AppToast.show(this, "View Auto Switch586: $value")
    }
// v586: Wait Auto Timeout586


internal fun PlayerActivity.showV586WaitAutoTimeout586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586waitAutoTimeout586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586waitAutoTimeout586 = value
        AppToast.show(this, "Wait Auto Timeout586: $value")
    }
// v587: View Auto Switch587


internal fun PlayerActivity.showV587ViewAutoSwitch587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587viewAutoSwitch587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587viewAutoSwitch587 = value
        AppToast.show(this, "View Auto Switch587: $value")
    }
// v587: Wait Auto Timeout587


internal fun PlayerActivity.showV587WaitAutoTimeout587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587waitAutoTimeout587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587waitAutoTimeout587 = value
        AppToast.show(this, "Wait Auto Timeout587: $value")
    }
// v588: View Auto Switch588


internal fun PlayerActivity.showV588ViewAutoSwitch588Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v588viewAutoSwitch588).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch588",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v588viewAutoSwitch588 = value
        AppToast.show(this, "View Auto Switch588: $value")
    }
// v588: Wait Auto Timeout588


internal fun PlayerActivity.showV588WaitAutoTimeout588Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v588waitAutoTimeout588).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout588",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v588waitAutoTimeout588 = value
        AppToast.show(this, "Wait Auto Timeout588: $value")
    }
// v589: View Auto Switch589


internal fun PlayerActivity.showV589ViewAutoSwitch589Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v589viewAutoSwitch589).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch589",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v589viewAutoSwitch589 = value
        AppToast.show(this, "View Auto Switch589: $value")
    }
// v589: Wait Auto Timeout589


internal fun PlayerActivity.showV589WaitAutoTimeout589Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v589waitAutoTimeout589).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout589",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v589waitAutoTimeout589 = value
        AppToast.show(this, "Wait Auto Timeout589: $value")
    }
// v590: View Auto Switch590


internal fun PlayerActivity.showV590ViewAutoSwitch590Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v590viewAutoSwitch590).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch590",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v590viewAutoSwitch590 = value
        AppToast.show(this, "View Auto Switch590: $value")
    }
// v590: Wait Auto Timeout590


internal fun PlayerActivity.showV590WaitAutoTimeout590Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v590waitAutoTimeout590).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout590",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v590waitAutoTimeout590 = value
        AppToast.show(this, "Wait Auto Timeout590: $value")
    }
// v591: Aspect Auto Ratio591


internal fun PlayerActivity.showV591AspectAutoRatio591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591aspectAutoRatio591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591aspectAutoRatio591 = value
        AppToast.show(this, "Aspect Auto Ratio591: $value")
    }
// v591: Bitrate Auto Scale591


internal fun PlayerActivity.showV591BitrateAutoScale591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591bitrateAutoScale591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591bitrateAutoScale591 = value
        AppToast.show(this, "Bitrate Auto Scale591: $value")
    }
// v591: Blend Auto Mode591


internal fun PlayerActivity.showV591BlendAutoMode591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591blendAutoMode591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591blendAutoMode591 = value
        AppToast.show(this, "Blend Auto Mode591: $value")
    }
// v592: Aspect Auto Ratio592


internal fun PlayerActivity.showV592AspectAutoRatio592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592aspectAutoRatio592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592aspectAutoRatio592 = value
        AppToast.show(this, "Aspect Auto Ratio592: $value")
    }
// v592: Bitrate Auto Scale592


internal fun PlayerActivity.showV592BitrateAutoScale592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592bitrateAutoScale592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592bitrateAutoScale592 = value
        AppToast.show(this, "Bitrate Auto Scale592: $value")
    }
// v592: Blend Auto Mode592


internal fun PlayerActivity.showV592BlendAutoMode592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592blendAutoMode592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592blendAutoMode592 = value
        AppToast.show(this, "Blend Auto Mode592: $value")
    }
// v593: Aspect Auto Ratio593


internal fun PlayerActivity.showV593AspectAutoRatio593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593aspectAutoRatio593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593aspectAutoRatio593 = value
        AppToast.show(this, "Aspect Auto Ratio593: $value")
    }
// v593: Bitrate Auto Scale593


internal fun PlayerActivity.showV593BitrateAutoScale593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593bitrateAutoScale593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593bitrateAutoScale593 = value
        AppToast.show(this, "Bitrate Auto Scale593: $value")
    }
// v593: Blend Auto Mode593


internal fun PlayerActivity.showV593BlendAutoMode593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593blendAutoMode593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593blendAutoMode593 = value
        AppToast.show(this, "Blend Auto Mode593: $value")
    }
// v594: Aspect Auto Ratio594


internal fun PlayerActivity.showV594AspectAutoRatio594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594aspectAutoRatio594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594aspectAutoRatio594 = value
        AppToast.show(this, "Aspect Auto Ratio594: $value")
    }
// v594: Bitrate Auto Scale594


internal fun PlayerActivity.showV594BitrateAutoScale594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594bitrateAutoScale594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594bitrateAutoScale594 = value
        AppToast.show(this, "Bitrate Auto Scale594: $value")
    }
// v594: Blend Auto Mode594


internal fun PlayerActivity.showV594BlendAutoMode594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594blendAutoMode594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594blendAutoMode594 = value
        AppToast.show(this, "Blend Auto Mode594: $value")
    }
// v595: Aspect Auto Ratio595


internal fun PlayerActivity.showV595AspectAutoRatio595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595aspectAutoRatio595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595aspectAutoRatio595 = value
        AppToast.show(this, "Aspect Auto Ratio595: $value")
    }
// v595: Bitrate Auto Scale595


internal fun PlayerActivity.showV595BitrateAutoScale595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595bitrateAutoScale595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595bitrateAutoScale595 = value
        AppToast.show(this, "Bitrate Auto Scale595: $value")
    }
// v595: Blend Auto Mode595


internal fun PlayerActivity.showV595BlendAutoMode595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595blendAutoMode595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595blendAutoMode595 = value
        AppToast.show(this, "Blend Auto Mode595: $value")
    }
// v596: Aspect Auto Ratio596


internal fun PlayerActivity.showV596AspectAutoRatio596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596aspectAutoRatio596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596aspectAutoRatio596 = value
        AppToast.show(this, "Aspect Auto Ratio596: $value")
    }
// v596: Bitrate Auto Scale596


internal fun PlayerActivity.showV596BitrateAutoScale596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596bitrateAutoScale596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596bitrateAutoScale596 = value
        AppToast.show(this, "Bitrate Auto Scale596: $value")
    }
// v596: Blend Auto Mode596


internal fun PlayerActivity.showV596BlendAutoMode596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596blendAutoMode596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596blendAutoMode596 = value
        AppToast.show(this, "Blend Auto Mode596: $value")
    }
// v597: Aspect Auto Ratio597


internal fun PlayerActivity.showV597AspectAutoRatio597Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v597aspectAutoRatio597).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio597",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v597aspectAutoRatio597 = value
        AppToast.show(this, "Aspect Auto Ratio597: $value")
    }
// v597: Bitrate Auto Scale597


internal fun PlayerActivity.showV597BitrateAutoScale597Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v597bitrateAutoScale597).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale597",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v597bitrateAutoScale597 = value
        AppToast.show(this, "Bitrate Auto Scale597: $value")
    }
// v597: Blend Auto Mode597


internal fun PlayerActivity.showV597BlendAutoMode597Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v597blendAutoMode597).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode597",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v597blendAutoMode597 = value
        AppToast.show(this, "Blend Auto Mode597: $value")
    }
// v598: Aspect Auto Ratio598


internal fun PlayerActivity.showV598AspectAutoRatio598Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v598aspectAutoRatio598).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio598",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v598aspectAutoRatio598 = value
        AppToast.show(this, "Aspect Auto Ratio598: $value")
    }
// v598: Bitrate Auto Scale598


internal fun PlayerActivity.showV598BitrateAutoScale598Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v598bitrateAutoScale598).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale598",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v598bitrateAutoScale598 = value
        AppToast.show(this, "Bitrate Auto Scale598: $value")
    }
// v598: Blend Auto Mode598


internal fun PlayerActivity.showV598BlendAutoMode598Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v598blendAutoMode598).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode598",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v598blendAutoMode598 = value
        AppToast.show(this, "Blend Auto Mode598: $value")
    }
// v599: Aspect Auto Ratio599


internal fun PlayerActivity.showV599AspectAutoRatio599Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v599aspectAutoRatio599).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio599",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v599aspectAutoRatio599 = value
        AppToast.show(this, "Aspect Auto Ratio599: $value")
    }
// v599: Bitrate Auto Scale599


internal fun PlayerActivity.showV599BitrateAutoScale599Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v599bitrateAutoScale599).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale599",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v599bitrateAutoScale599 = value
        AppToast.show(this, "Bitrate Auto Scale599: $value")
    }
// v599: Blend Auto Mode599


internal fun PlayerActivity.showV599BlendAutoMode599Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v599blendAutoMode599).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode599",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v599blendAutoMode599 = value
        AppToast.show(this, "Blend Auto Mode599: $value")
    }
// v600: Aspect Auto Ratio600


internal fun PlayerActivity.showV600AspectAutoRatio600Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v600aspectAutoRatio600).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio600",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v600aspectAutoRatio600 = value
        AppToast.show(this, "Aspect Auto Ratio600: $value")
    }
// v600: Bitrate Auto Scale600


internal fun PlayerActivity.showV600BitrateAutoScale600Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v600bitrateAutoScale600).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale600",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v600bitrateAutoScale600 = value
        AppToast.show(this, "Bitrate Auto Scale600: $value")
    }
// v600: Blend Auto Mode600


internal fun PlayerActivity.showV600BlendAutoMode600Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v600blendAutoMode600).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode600",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v600blendAutoMode600 = value
        AppToast.show(this, "Blend Auto Mode600: $value")
    }
// v601: Align Auto Center601


internal fun PlayerActivity.showV601AlignAutoCenter601Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v601alignAutoCenter601).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center601",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v601alignAutoCenter601 = value
        AppToast.show(this, "Align Auto Center601: $value")
    }
// v601: Amount Auto Limit601


internal fun PlayerActivity.showV601AmountAutoLimit601Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v601amountAutoLimit601).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit601",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v601amountAutoLimit601 = value
        AppToast.show(this, "Amount Auto Limit601: $value")
    }
// v602: Align Auto Center602


internal fun PlayerActivity.showV602AlignAutoCenter602Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v602alignAutoCenter602).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center602",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v602alignAutoCenter602 = value
        AppToast.show(this, "Align Auto Center602: $value")
    }
// v602: Amount Auto Limit602


internal fun PlayerActivity.showV602AmountAutoLimit602Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v602amountAutoLimit602).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit602",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v602amountAutoLimit602 = value
        AppToast.show(this, "Amount Auto Limit602: $value")
    }
// v603: Align Auto Center603


internal fun PlayerActivity.showV603AlignAutoCenter603Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v603alignAutoCenter603).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center603",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v603alignAutoCenter603 = value
        AppToast.show(this, "Align Auto Center603: $value")
    }
// v603: Amount Auto Limit603


internal fun PlayerActivity.showV603AmountAutoLimit603Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v603amountAutoLimit603).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit603",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v603amountAutoLimit603 = value
        AppToast.show(this, "Amount Auto Limit603: $value")
    }
// v604: Align Auto Center604


internal fun PlayerActivity.showV604AlignAutoCenter604Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v604alignAutoCenter604).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center604",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v604alignAutoCenter604 = value
        AppToast.show(this, "Align Auto Center604: $value")
    }
// v604: Amount Auto Limit604


internal fun PlayerActivity.showV604AmountAutoLimit604Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v604amountAutoLimit604).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit604",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v604amountAutoLimit604 = value
        AppToast.show(this, "Amount Auto Limit604: $value")
    }
// v605: Align Auto Center605


internal fun PlayerActivity.showV605AlignAutoCenter605Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v605alignAutoCenter605).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center605",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v605alignAutoCenter605 = value
        AppToast.show(this, "Align Auto Center605: $value")
    }
// v605: Amount Auto Limit605


internal fun PlayerActivity.showV605AmountAutoLimit605Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v605amountAutoLimit605).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit605",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v605amountAutoLimit605 = value
        AppToast.show(this, "Amount Auto Limit605: $value")
    }
// v606: Align Auto Center606


internal fun PlayerActivity.showV606AlignAutoCenter606Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v606alignAutoCenter606).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center606",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v606alignAutoCenter606 = value
        AppToast.show(this, "Align Auto Center606: $value")
    }
// v606: Amount Auto Limit606


internal fun PlayerActivity.showV606AmountAutoLimit606Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v606amountAutoLimit606).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit606",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v606amountAutoLimit606 = value
        AppToast.show(this, "Amount Auto Limit606: $value")
    }
// v607: Align Auto Center607


internal fun PlayerActivity.showV607AlignAutoCenter607Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v607alignAutoCenter607).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center607",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v607alignAutoCenter607 = value
        AppToast.show(this, "Align Auto Center607: $value")
    }
// v607: Amount Auto Limit607


internal fun PlayerActivity.showV607AmountAutoLimit607Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v607amountAutoLimit607).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit607",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v607amountAutoLimit607 = value
        AppToast.show(this, "Amount Auto Limit607: $value")
    }
// v608: Align Auto Center608


internal fun PlayerActivity.showV608AlignAutoCenter608Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v608alignAutoCenter608).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center608",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v608alignAutoCenter608 = value
        AppToast.show(this, "Align Auto Center608: $value")
    }
// v608: Amount Auto Limit608


internal fun PlayerActivity.showV608AmountAutoLimit608Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v608amountAutoLimit608).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit608",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v608amountAutoLimit608 = value
        AppToast.show(this, "Amount Auto Limit608: $value")
    }
// v609: Align Auto Center609


internal fun PlayerActivity.showV609AlignAutoCenter609Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v609alignAutoCenter609).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center609",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v609alignAutoCenter609 = value
        AppToast.show(this, "Align Auto Center609: $value")
    }
// v609: Amount Auto Limit609


internal fun PlayerActivity.showV609AmountAutoLimit609Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v609amountAutoLimit609).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit609",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v609amountAutoLimit609 = value
        AppToast.show(this, "Amount Auto Limit609: $value")
    }
// v610: Align Auto Center610


internal fun PlayerActivity.showV610AlignAutoCenter610Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v610alignAutoCenter610).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center610",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v610alignAutoCenter610 = value
        AppToast.show(this, "Align Auto Center610: $value")
    }
// v610: Amount Auto Limit610


internal fun PlayerActivity.showV610AmountAutoLimit610Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v610amountAutoLimit610).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit610",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v610amountAutoLimit610 = value
        AppToast.show(this, "Amount Auto Limit610: $value")
    }
// v611: Balance Auto Load611


internal fun PlayerActivity.showV611BalanceAutoLoad611Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v611balanceAutoLoad611).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load611",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v611balanceAutoLoad611 = value
        AppToast.show(this, "Balance Auto Load611: $value")
    }
// v612: Balance Auto Load612


internal fun PlayerActivity.showV612BalanceAutoLoad612Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v612balanceAutoLoad612).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load612",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v612balanceAutoLoad612 = value
        AppToast.show(this, "Balance Auto Load612: $value")
    }
// v613: Balance Auto Load613


internal fun PlayerActivity.showV613BalanceAutoLoad613Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v613balanceAutoLoad613).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load613",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v613balanceAutoLoad613 = value
        AppToast.show(this, "Balance Auto Load613: $value")
    }
// v614: Balance Auto Load614


internal fun PlayerActivity.showV614BalanceAutoLoad614Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v614balanceAutoLoad614).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load614",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v614balanceAutoLoad614 = value
        AppToast.show(this, "Balance Auto Load614: $value")
    }
// v615: Balance Auto Load615


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
// v616: Balance Auto Load616


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
// v617: Balance Auto Load617


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
// v618: Balance Auto Load618


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
// v619: Balance Auto Load619


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
// v620: Balance Auto Load620


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
// v621: Bottom Auto Nav621


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
// v622: Bottom Auto Nav622


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
// v623: Bottom Auto Nav623


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
// v624: Bottom Auto Nav624


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
// v625: Bottom Auto Nav625


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
// v626: Bottom Auto Nav626


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
// v627: Bottom Auto Nav627


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
// v628: Bottom Auto Nav628


internal fun PlayerActivity.showV628BottomAutoNav628Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v628bottomAutoNav628).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav628",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v628bottomAutoNav628 = value
        AppToast.show(this, "Bottom Auto Nav628: $value")
    }
// v629: Bottom Auto Nav629


internal fun PlayerActivity.showV629BottomAutoNav629Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v629bottomAutoNav629).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav629",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v629bottomAutoNav629 = value
        AppToast.show(this, "Bottom Auto Nav629: $value")
    }
// v630: Bottom Auto Nav630


internal fun PlayerActivity.showV630BottomAutoNav630Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v630bottomAutoNav630).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav630",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v630bottomAutoNav630 = value
        AppToast.show(this, "Bottom Auto Nav630: $value")
    }
// v631: Campus Auto Select631


internal fun PlayerActivity.showV631CampusAutoSelect631Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v631campusAutoSelect631).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select631",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v631campusAutoSelect631 = value
        AppToast.show(this, "Campus Auto Select631: $value")
    }
// v631: Capture Auto Mode631


internal fun PlayerActivity.showV631CaptureAutoMode631Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v631captureAutoMode631).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode631",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v631captureAutoMode631 = value
        AppToast.show(this, "Capture Auto Mode631: $value")
    }
// v632: Campus Auto Select632


internal fun PlayerActivity.showV632CampusAutoSelect632Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v632campusAutoSelect632).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select632",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v632campusAutoSelect632 = value
        AppToast.show(this, "Campus Auto Select632: $value")
    }
// v632: Capture Auto Mode632


internal fun PlayerActivity.showV632CaptureAutoMode632Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v632captureAutoMode632).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode632",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v632captureAutoMode632 = value
        AppToast.show(this, "Capture Auto Mode632: $value")
    }
// v633: Campus Auto Select633


internal fun PlayerActivity.showV633CampusAutoSelect633Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v633campusAutoSelect633).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select633",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v633campusAutoSelect633 = value
        AppToast.show(this, "Campus Auto Select633: $value")
    }
// v633: Capture Auto Mode633


internal fun PlayerActivity.showV633CaptureAutoMode633Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v633captureAutoMode633).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode633",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v633captureAutoMode633 = value
        AppToast.show(this, "Capture Auto Mode633: $value")
    }
// v634: Campus Auto Select634


internal fun PlayerActivity.showV634CampusAutoSelect634Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v634campusAutoSelect634).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select634",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v634campusAutoSelect634 = value
        AppToast.show(this, "Campus Auto Select634: $value")
    }
// v634: Capture Auto Mode634


internal fun PlayerActivity.showV634CaptureAutoMode634Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v634captureAutoMode634).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode634",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v634captureAutoMode634 = value
        AppToast.show(this, "Capture Auto Mode634: $value")
    }
// v635: Campus Auto Select635


internal fun PlayerActivity.showV635CampusAutoSelect635Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v635campusAutoSelect635).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select635",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v635campusAutoSelect635 = value
        AppToast.show(this, "Campus Auto Select635: $value")
    }
// v635: Capture Auto Mode635


internal fun PlayerActivity.showV635CaptureAutoMode635Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v635captureAutoMode635).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode635",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v635captureAutoMode635 = value
        AppToast.show(this, "Capture Auto Mode635: $value")
    }
// v636: Campus Auto Select636


internal fun PlayerActivity.showV636CampusAutoSelect636Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v636campusAutoSelect636).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select636",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v636campusAutoSelect636 = value
        AppToast.show(this, "Campus Auto Select636: $value")
    }
// v636: Capture Auto Mode636


internal fun PlayerActivity.showV636CaptureAutoMode636Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v636captureAutoMode636).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode636",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v636captureAutoMode636 = value
        AppToast.show(this, "Capture Auto Mode636: $value")
    }
// v637: Campus Auto Select637


internal fun PlayerActivity.showV637CampusAutoSelect637Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v637campusAutoSelect637).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select637",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v637campusAutoSelect637 = value
        AppToast.show(this, "Campus Auto Select637: $value")
    }
// v637: Capture Auto Mode637


internal fun PlayerActivity.showV637CaptureAutoMode637Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v637captureAutoMode637).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode637",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v637captureAutoMode637 = value
        AppToast.show(this, "Capture Auto Mode637: $value")
    }
// v638: Campus Auto Select638


internal fun PlayerActivity.showV638CampusAutoSelect638Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v638campusAutoSelect638).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select638",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v638campusAutoSelect638 = value
        AppToast.show(this, "Campus Auto Select638: $value")
    }
// v638: Capture Auto Mode638


internal fun PlayerActivity.showV638CaptureAutoMode638Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v638captureAutoMode638).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode638",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v638captureAutoMode638 = value
        AppToast.show(this, "Capture Auto Mode638: $value")
    }
// v639: Campus Auto Select639


internal fun PlayerActivity.showV639CampusAutoSelect639Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v639campusAutoSelect639).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select639",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v639campusAutoSelect639 = value
        AppToast.show(this, "Campus Auto Select639: $value")
    }
// v639: Capture Auto Mode639


internal fun PlayerActivity.showV639CaptureAutoMode639Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v639captureAutoMode639).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode639",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v639captureAutoMode639 = value
        AppToast.show(this, "Capture Auto Mode639: $value")
    }
// v640: Campus Auto Select640


internal fun PlayerActivity.showV640CampusAutoSelect640Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v640campusAutoSelect640).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select640",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v640campusAutoSelect640 = value
        AppToast.show(this, "Campus Auto Select640: $value")
    }
// v640: Capture Auto Mode640


internal fun PlayerActivity.showV640CaptureAutoMode640Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v640captureAutoMode640).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode640",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v640captureAutoMode640 = value
        AppToast.show(this, "Capture Auto Mode640: $value")
    }
// v641: Channel Auto Switch641


internal fun PlayerActivity.showV641ChannelAutoSwitch641Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v641channelAutoSwitch641).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch641",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v641channelAutoSwitch641 = value
        AppToast.show(this, "Channel Auto Switch641: $value")
    }
// v642: Channel Auto Switch642


internal fun PlayerActivity.showV642ChannelAutoSwitch642Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v642channelAutoSwitch642).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch642",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v642channelAutoSwitch642 = value
        AppToast.show(this, "Channel Auto Switch642: $value")
    }
// v643: Channel Auto Switch643


internal fun PlayerActivity.showV643ChannelAutoSwitch643Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v643channelAutoSwitch643).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch643",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v643channelAutoSwitch643 = value
        AppToast.show(this, "Channel Auto Switch643: $value")
    }
// v644: Channel Auto Switch644


internal fun PlayerActivity.showV644ChannelAutoSwitch644Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v644channelAutoSwitch644).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch644",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v644channelAutoSwitch644 = value
        AppToast.show(this, "Channel Auto Switch644: $value")
    }
// v645: Channel Auto Switch645


internal fun PlayerActivity.showV645ChannelAutoSwitch645Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v645channelAutoSwitch645).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch645",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v645channelAutoSwitch645 = value
        AppToast.show(this, "Channel Auto Switch645: $value")
    }
// v646: Channel Auto Switch646


internal fun PlayerActivity.showV646ChannelAutoSwitch646Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v646channelAutoSwitch646).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch646",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v646channelAutoSwitch646 = value
        AppToast.show(this, "Channel Auto Switch646: $value")
    }
// v647: Channel Auto Switch647


internal fun PlayerActivity.showV647ChannelAutoSwitch647Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v647channelAutoSwitch647).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch647",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v647channelAutoSwitch647 = value
        AppToast.show(this, "Channel Auto Switch647: $value")
    }
// v648: Channel Auto Switch648


internal fun PlayerActivity.showV648ChannelAutoSwitch648Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v648channelAutoSwitch648).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch648",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v648channelAutoSwitch648 = value
        AppToast.show(this, "Channel Auto Switch648: $value")
    }
// v649: Channel Auto Switch649


internal fun PlayerActivity.showV649ChannelAutoSwitch649Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v649channelAutoSwitch649).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch649",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v649channelAutoSwitch649 = value
        AppToast.show(this, "Channel Auto Switch649: $value")
    }
// v650: Channel Auto Switch650


internal fun PlayerActivity.showV650ChannelAutoSwitch650Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v650channelAutoSwitch650).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch650",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v650channelAutoSwitch650 = value
        AppToast.show(this, "Channel Auto Switch650: $value")
    }
// v651: Compare Auto Diff651


internal fun PlayerActivity.showV651CompareAutoDiff651Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v651compareAutoDiff651).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff651",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v651compareAutoDiff651 = value
        AppToast.show(this, "Compare Auto Diff651: $value")
    }
// v652: Compare Auto Diff652


internal fun PlayerActivity.showV652CompareAutoDiff652Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v652compareAutoDiff652).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff652",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v652compareAutoDiff652 = value
        AppToast.show(this, "Compare Auto Diff652: $value")
    }
// v653: Compare Auto Diff653


internal fun PlayerActivity.showV653CompareAutoDiff653Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v653compareAutoDiff653).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff653",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v653compareAutoDiff653 = value
        AppToast.show(this, "Compare Auto Diff653: $value")
    }
// v654: Compare Auto Diff654


internal fun PlayerActivity.showV654CompareAutoDiff654Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v654compareAutoDiff654).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff654",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v654compareAutoDiff654 = value
        AppToast.show(this, "Compare Auto Diff654: $value")
    }
// v655: Compare Auto Diff655


internal fun PlayerActivity.showV655CompareAutoDiff655Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v655compareAutoDiff655).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff655",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v655compareAutoDiff655 = value
        AppToast.show(this, "Compare Auto Diff655: $value")
    }
// v656: Compare Auto Diff656


internal fun PlayerActivity.showV656CompareAutoDiff656Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v656compareAutoDiff656).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff656",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v656compareAutoDiff656 = value
        AppToast.show(this, "Compare Auto Diff656: $value")
    }
// v657: Compare Auto Diff657


internal fun PlayerActivity.showV657CompareAutoDiff657Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v657compareAutoDiff657).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff657",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v657compareAutoDiff657 = value
        AppToast.show(this, "Compare Auto Diff657: $value")
    }
// v658: Compare Auto Diff658


internal fun PlayerActivity.showV658CompareAutoDiff658Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v658compareAutoDiff658).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff658",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v658compareAutoDiff658 = value
        AppToast.show(this, "Compare Auto Diff658: $value")
    }
// v659: Compare Auto Diff659


internal fun PlayerActivity.showV659CompareAutoDiff659Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v659compareAutoDiff659).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff659",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v659compareAutoDiff659 = value
        AppToast.show(this, "Compare Auto Diff659: $value")
    }
// v660: Compare Auto Diff660


internal fun PlayerActivity.showV660CompareAutoDiff660Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v660compareAutoDiff660).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff660",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v660compareAutoDiff660 = value
        AppToast.show(this, "Compare Auto Diff660: $value")
    }
// v661: Control Auto Hide661


internal fun PlayerActivity.showV661ControlAutoHide661Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v661controlAutoHide661).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide661",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v661controlAutoHide661 = value
        AppToast.show(this, "Control Auto Hide661: $value")
    }
// v661: Core Auto Affinity661


internal fun PlayerActivity.showV661CoreAutoAffinity661Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v661coreAutoAffinity661).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity661",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v661coreAutoAffinity661 = value
        AppToast.show(this, "Core Auto Affinity661: $value")
    }
// v662: Control Auto Hide662


internal fun PlayerActivity.showV662ControlAutoHide662Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v662controlAutoHide662).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide662",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v662controlAutoHide662 = value
        AppToast.show(this, "Control Auto Hide662: $value")
    }
// v662: Core Auto Affinity662


internal fun PlayerActivity.showV662CoreAutoAffinity662Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v662coreAutoAffinity662).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity662",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v662coreAutoAffinity662 = value
        AppToast.show(this, "Core Auto Affinity662: $value")
    }
// v663: Control Auto Hide663


internal fun PlayerActivity.showV663ControlAutoHide663Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v663controlAutoHide663).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide663",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v663controlAutoHide663 = value
        AppToast.show(this, "Control Auto Hide663: $value")
    }
// v663: Core Auto Affinity663


internal fun PlayerActivity.showV663CoreAutoAffinity663Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v663coreAutoAffinity663).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity663",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v663coreAutoAffinity663 = value
        AppToast.show(this, "Core Auto Affinity663: $value")
    }
// v664: Control Auto Hide664


internal fun PlayerActivity.showV664ControlAutoHide664Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v664controlAutoHide664).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide664",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v664controlAutoHide664 = value
        AppToast.show(this, "Control Auto Hide664: $value")
    }
// v664: Core Auto Affinity664


internal fun PlayerActivity.showV664CoreAutoAffinity664Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v664coreAutoAffinity664).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity664",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v664coreAutoAffinity664 = value
        AppToast.show(this, "Core Auto Affinity664: $value")
    }
// v665: Control Auto Hide665


internal fun PlayerActivity.showV665ControlAutoHide665Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v665controlAutoHide665).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide665",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v665controlAutoHide665 = value
        AppToast.show(this, "Control Auto Hide665: $value")
    }
// v665: Core Auto Affinity665


internal fun PlayerActivity.showV665CoreAutoAffinity665Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v665coreAutoAffinity665).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity665",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v665coreAutoAffinity665 = value
        AppToast.show(this, "Core Auto Affinity665: $value")
    }
// v666: Control Auto Hide666


internal fun PlayerActivity.showV666ControlAutoHide666Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v666controlAutoHide666).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide666",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v666controlAutoHide666 = value
        AppToast.show(this, "Control Auto Hide666: $value")
    }
// v666: Core Auto Affinity666


internal fun PlayerActivity.showV666CoreAutoAffinity666Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v666coreAutoAffinity666).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity666",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v666coreAutoAffinity666 = value
        AppToast.show(this, "Core Auto Affinity666: $value")
    }
// v667: Control Auto Hide667


internal fun PlayerActivity.showV667ControlAutoHide667Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v667controlAutoHide667).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide667",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v667controlAutoHide667 = value
        AppToast.show(this, "Control Auto Hide667: $value")
    }
// v667: Core Auto Affinity667


internal fun PlayerActivity.showV667CoreAutoAffinity667Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v667coreAutoAffinity667).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity667",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v667coreAutoAffinity667 = value
        AppToast.show(this, "Core Auto Affinity667: $value")
    }
// v668: Control Auto Hide668


internal fun PlayerActivity.showV668ControlAutoHide668Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v668controlAutoHide668).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide668",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v668controlAutoHide668 = value
        AppToast.show(this, "Control Auto Hide668: $value")
    }
// v668: Core Auto Affinity668




