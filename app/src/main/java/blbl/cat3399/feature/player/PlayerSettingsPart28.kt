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
}

// v383: Page Auto Load383
internal fun PlayerActivity.showV383PageAutoLoad383Toggle() {
    val current = BiliClient.prefs.v383pageAutoLoad383
    BiliClient.prefs.v383pageAutoLoad383 = !current
    AppToast.show(this, "Page Auto Load383: ${if (!current) "ON" else "OFF"}")
}

// v383: Panel Auto Hide383
internal fun PlayerActivity.showV383PanelAutoHide383Toggle() {
    val current = BiliClient.prefs.v383panelAutoHide383
    BiliClient.prefs.v383panelAutoHide383 = !current
    AppToast.show(this, "Panel Auto Hide383: ${if (!current) "ON" else "OFF"}")
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
}

// v383: SubList Auto Collapse383
internal fun PlayerActivity.showV383SubListAutoCollapse383Toggle() {
    val current = BiliClient.prefs.v383subListAutoCollapse383
    BiliClient.prefs.v383subListAutoCollapse383 = !current
    AppToast.show(this, "SubList Auto Collapse383: ${if (!current) "ON" else "OFF"}")
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
}

// v383: SyncPlay Auto Join383
internal fun PlayerActivity.showV383SyncPlayAutoJoin383Toggle() {
    val current = BiliClient.prefs.v383syncPlayAutoJoin383
    BiliClient.prefs.v383syncPlayAutoJoin383 = !current
    AppToast.show(this, "SyncPlay Auto Join383: ${if (!current) "ON" else "OFF"}")
}

// v383: Proxy Auto Detect383
internal fun PlayerActivity.showV383ProxyAutoDetect383Toggle() {
    val current = BiliClient.prefs.v383proxyAutoDetect383
    BiliClient.prefs.v383proxyAutoDetect383 = !current
    AppToast.show(this, "Proxy Auto Detect383: ${if (!current) "ON" else "OFF"}")
}

// v383: Queue Auto Sort383
internal fun PlayerActivity.showV383QueueAutoSort383Toggle() {
    val current = BiliClient.prefs.v383queueAutoSort383
    BiliClient.prefs.v383queueAutoSort383 = !current
    AppToast.show(this, "Queue Auto Sort383: ${if (!current) "ON" else "OFF"}")
}

// v383: Record Auto Save383
internal fun PlayerActivity.showV383RecordAutoSave383Toggle() {
    val current = BiliClient.prefs.v383recordAutoSave383
    BiliClient.prefs.v383recordAutoSave383 = !current
    AppToast.show(this, "Record Auto Save383: ${if (!current) "ON" else "OFF"}")
}

// v383: Image Enhance Sharp383
internal fun PlayerActivity.showV383ImageEnhanceSharp383Toggle() {
    val current = BiliClient.prefs.v383imageEnhanceSharp383
    BiliClient.prefs.v383imageEnhanceSharp383 = !current
    AppToast.show(this, "Image Enhance Sharp383: ${if (!current) "ON" else "OFF"}")
}

// v383: Image Enhance Denoise383
internal fun PlayerActivity.showV383ImageEnhanceDenoise383Toggle() {
    val current = BiliClient.prefs.v383imageEnhanceDenoise383
    BiliClient.prefs.v383imageEnhanceDenoise383 = !current
    AppToast.show(this, "Image Enhance Denoise383: ${if (!current) "ON" else "OFF"}")
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
}

// v384: Grid Layout Animation384
internal fun PlayerActivity.showV384GridLayoutAnimation384Toggle() {
    val current = BiliClient.prefs.v384gridLayoutAnimation384
    BiliClient.prefs.v384gridLayoutAnimation384 = !current
    AppToast.show(this, "Grid Layout Animation384: ${if (!current) "ON" else "OFF"}")
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
}

// v384: Page Auto Load384
internal fun PlayerActivity.showV384PageAutoLoad384Toggle() {
    val current = BiliClient.prefs.v384pageAutoLoad384
    BiliClient.prefs.v384pageAutoLoad384 = !current
    AppToast.show(this, "Page Auto Load384: ${if (!current) "ON" else "OFF"}")
}

// v384: Panel Auto Hide384
internal fun PlayerActivity.showV384PanelAutoHide384Toggle() {
    val current = BiliClient.prefs.v384panelAutoHide384
    BiliClient.prefs.v384panelAutoHide384 = !current
    AppToast.show(this, "Panel Auto Hide384: ${if (!current) "ON" else "OFF"}")
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
}

// v384: SubList Auto Collapse384
internal fun PlayerActivity.showV384SubListAutoCollapse384Toggle() {
    val current = BiliClient.prefs.v384subListAutoCollapse384
    BiliClient.prefs.v384subListAutoCollapse384 = !current
    AppToast.show(this, "SubList Auto Collapse384: ${if (!current) "ON" else "OFF"}")
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
}

// v384: SyncPlay Auto Join384
internal fun PlayerActivity.showV384SyncPlayAutoJoin384Toggle() {
    val current = BiliClient.prefs.v384syncPlayAutoJoin384
    BiliClient.prefs.v384syncPlayAutoJoin384 = !current
    AppToast.show(this, "SyncPlay Auto Join384: ${if (!current) "ON" else "OFF"}")
}

// v384: Proxy Auto Detect384
internal fun PlayerActivity.showV384ProxyAutoDetect384Toggle() {
    val current = BiliClient.prefs.v384proxyAutoDetect384
    BiliClient.prefs.v384proxyAutoDetect384 = !current
    AppToast.show(this, "Proxy Auto Detect384: ${if (!current) "ON" else "OFF"}")
}

// v384: Queue Auto Sort384
internal fun PlayerActivity.showV384QueueAutoSort384Toggle() {
    val current = BiliClient.prefs.v384queueAutoSort384
    BiliClient.prefs.v384queueAutoSort384 = !current
    AppToast.show(this, "Queue Auto Sort384: ${if (!current) "ON" else "OFF"}")
}

// v384: Record Auto Save384
internal fun PlayerActivity.showV384RecordAutoSave384Toggle() {
    val current = BiliClient.prefs.v384recordAutoSave384
    BiliClient.prefs.v384recordAutoSave384 = !current
    AppToast.show(this, "Record Auto Save384: ${if (!current) "ON" else "OFF"}")
}

// v384: Image Enhance Sharp384
internal fun PlayerActivity.showV384ImageEnhanceSharp384Toggle() {
    val current = BiliClient.prefs.v384imageEnhanceSharp384
    BiliClient.prefs.v384imageEnhanceSharp384 = !current
    AppToast.show(this, "Image Enhance Sharp384: ${if (!current) "ON" else "OFF"}")
}

// v384: Image Enhance Denoise384
internal fun PlayerActivity.showV384ImageEnhanceDenoise384Toggle() {
    val current = BiliClient.prefs.v384imageEnhanceDenoise384
    BiliClient.prefs.v384imageEnhanceDenoise384 = !current
    AppToast.show(this, "Image Enhance Denoise384: ${if (!current) "ON" else "OFF"}")
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
}

// v385: Grid Layout Animation385
internal fun PlayerActivity.showV385GridLayoutAnimation385Toggle() {
    val current = BiliClient.prefs.v385gridLayoutAnimation385
    BiliClient.prefs.v385gridLayoutAnimation385 = !current
    AppToast.show(this, "Grid Layout Animation385: ${if (!current) "ON" else "OFF"}")
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
}

// v385: Page Auto Load385
internal fun PlayerActivity.showV385PageAutoLoad385Toggle() {
    val current = BiliClient.prefs.v385pageAutoLoad385
    BiliClient.prefs.v385pageAutoLoad385 = !current
    AppToast.show(this, "Page Auto Load385: ${if (!current) "ON" else "OFF"}")
}

// v385: Panel Auto Hide385
internal fun PlayerActivity.showV385PanelAutoHide385Toggle() {
    val current = BiliClient.prefs.v385panelAutoHide385
    BiliClient.prefs.v385panelAutoHide385 = !current
    AppToast.show(this, "Panel Auto Hide385: ${if (!current) "ON" else "OFF"}")
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
}

// v385: SubList Auto Collapse385
internal fun PlayerActivity.showV385SubListAutoCollapse385Toggle() {
    val current = BiliClient.prefs.v385subListAutoCollapse385
    BiliClient.prefs.v385subListAutoCollapse385 = !current
    AppToast.show(this, "SubList Auto Collapse385: ${if (!current) "ON" else "OFF"}")
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
}

// v385: SyncPlay Auto Join385
internal fun PlayerActivity.showV385SyncPlayAutoJoin385Toggle() {
    val current = BiliClient.prefs.v385syncPlayAutoJoin385
    BiliClient.prefs.v385syncPlayAutoJoin385 = !current
    AppToast.show(this, "SyncPlay Auto Join385: ${if (!current) "ON" else "OFF"}")
}

// v385: Proxy Auto Detect385
internal fun PlayerActivity.showV385ProxyAutoDetect385Toggle() {
    val current = BiliClient.prefs.v385proxyAutoDetect385
    BiliClient.prefs.v385proxyAutoDetect385 = !current
    AppToast.show(this, "Proxy Auto Detect385: ${if (!current) "ON" else "OFF"}")
}

// v385: Queue Auto Sort385
internal fun PlayerActivity.showV385QueueAutoSort385Toggle() {
    val current = BiliClient.prefs.v385queueAutoSort385
    BiliClient.prefs.v385queueAutoSort385 = !current
    AppToast.show(this, "Queue Auto Sort385: ${if (!current) "ON" else "OFF"}")
}

// v385: Record Auto Save385
internal fun PlayerActivity.showV385RecordAutoSave385Toggle() {
    val current = BiliClient.prefs.v385recordAutoSave385
    BiliClient.prefs.v385recordAutoSave385 = !current
    AppToast.show(this, "Record Auto Save385: ${if (!current) "ON" else "OFF"}")
}

// v385: Image Enhance Sharp385
internal fun PlayerActivity.showV385ImageEnhanceSharp385Toggle() {
    val current = BiliClient.prefs.v385imageEnhanceSharp385
    BiliClient.prefs.v385imageEnhanceSharp385 = !current
    AppToast.show(this, "Image Enhance Sharp385: ${if (!current) "ON" else "OFF"}")
}

// v385: Image Enhance Denoise385
internal fun PlayerActivity.showV385ImageEnhanceDenoise385Toggle() {
    val current = BiliClient.prefs.v385imageEnhanceDenoise385
    BiliClient.prefs.v385imageEnhanceDenoise385 = !current
    AppToast.show(this, "Image Enhance Denoise385: ${if (!current) "ON" else "OFF"}")
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
}

// v386: Grid Layout Animation386
internal fun PlayerActivity.showV386GridLayoutAnimation386Toggle() {
    val current = BiliClient.prefs.v386gridLayoutAnimation386
    BiliClient.prefs.v386gridLayoutAnimation386 = !current
    AppToast.show(this, "Grid Layout Animation386: ${if (!current) "ON" else "OFF"}")
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
}

// v386: Page Auto Load386
internal fun PlayerActivity.showV386PageAutoLoad386Toggle() {
    val current = BiliClient.prefs.v386pageAutoLoad386
    BiliClient.prefs.v386pageAutoLoad386 = !current
    AppToast.show(this, "Page Auto Load386: ${if (!current) "ON" else "OFF"}")
}

// v386: Panel Auto Hide386
internal fun PlayerActivity.showV386PanelAutoHide386Toggle() {
    val current = BiliClient.prefs.v386panelAutoHide386
    BiliClient.prefs.v386panelAutoHide386 = !current
    AppToast.show(this, "Panel Auto Hide386: ${if (!current) "ON" else "OFF"}")
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
}

// v386: SubList Auto Collapse386
internal fun PlayerActivity.showV386SubListAutoCollapse386Toggle() {
    val current = BiliClient.prefs.v386subListAutoCollapse386
    BiliClient.prefs.v386subListAutoCollapse386 = !current
    AppToast.show(this, "SubList Auto Collapse386: ${if (!current) "ON" else "OFF"}")
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
}

// v386: SyncPlay Auto Join386
internal fun PlayerActivity.showV386SyncPlayAutoJoin386Toggle() {
    val current = BiliClient.prefs.v386syncPlayAutoJoin386
    BiliClient.prefs.v386syncPlayAutoJoin386 = !current
    AppToast.show(this, "SyncPlay Auto Join386: ${if (!current) "ON" else "OFF"}")
}

// v386: Proxy Auto Detect386
internal fun PlayerActivity.showV386ProxyAutoDetect386Toggle() {
    val current = BiliClient.prefs.v386proxyAutoDetect386
    BiliClient.prefs.v386proxyAutoDetect386 = !current
    AppToast.show(this, "Proxy Auto Detect386: ${if (!current) "ON" else "OFF"}")
}

// v386: Queue Auto Sort386
internal fun PlayerActivity.showV386QueueAutoSort386Toggle() {
    val current = BiliClient.prefs.v386queueAutoSort386
    BiliClient.prefs.v386queueAutoSort386 = !current
    AppToast.show(this, "Queue Auto Sort386: ${if (!current) "ON" else "OFF"}")
}

// v386: Record Auto Save386
internal fun PlayerActivity.showV386RecordAutoSave386Toggle() {
    val current = BiliClient.prefs.v386recordAutoSave386
    BiliClient.prefs.v386recordAutoSave386 = !current
    AppToast.show(this, "Record Auto Save386: ${if (!current) "ON" else "OFF"}")
}

// v386: Image Enhance Sharp386
internal fun PlayerActivity.showV386ImageEnhanceSharp386Toggle() {
    val current = BiliClient.prefs.v386imageEnhanceSharp386
    BiliClient.prefs.v386imageEnhanceSharp386 = !current
    AppToast.show(this, "Image Enhance Sharp386: ${if (!current) "ON" else "OFF"}")
}

// v386: Image Enhance Denoise386
internal fun PlayerActivity.showV386ImageEnhanceDenoise386Toggle() {
    val current = BiliClient.prefs.v386imageEnhanceDenoise386
    BiliClient.prefs.v386imageEnhanceDenoise386 = !current
    AppToast.show(this, "Image Enhance Denoise386: ${if (!current) "ON" else "OFF"}")
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
}

// v387: Grid Layout Animation387
internal fun PlayerActivity.showV387GridLayoutAnimation387Toggle() {
    val current = BiliClient.prefs.v387gridLayoutAnimation387
    BiliClient.prefs.v387gridLayoutAnimation387 = !current
    AppToast.show(this, "Grid Layout Animation387: ${if (!current) "ON" else "OFF"}")
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
}

// v387: Page Auto Load387
internal fun PlayerActivity.showV387PageAutoLoad387Toggle() {
    val current = BiliClient.prefs.v387pageAutoLoad387
    BiliClient.prefs.v387pageAutoLoad387 = !current
    AppToast.show(this, "Page Auto Load387: ${if (!current) "ON" else "OFF"}")
}

// v387: Panel Auto Hide387
internal fun PlayerActivity.showV387PanelAutoHide387Toggle() {
    val current = BiliClient.prefs.v387panelAutoHide387
    BiliClient.prefs.v387panelAutoHide387 = !current
    AppToast.show(this, "Panel Auto Hide387: ${if (!current) "ON" else "OFF"}")
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
}

// v387: SubList Auto Collapse387
internal fun PlayerActivity.showV387SubListAutoCollapse387Toggle() {
    val current = BiliClient.prefs.v387subListAutoCollapse387
    BiliClient.prefs.v387subListAutoCollapse387 = !current
    AppToast.show(this, "SubList Auto Collapse387: ${if (!current) "ON" else "OFF"}")
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
}

// v387: SyncPlay Auto Join387
internal fun PlayerActivity.showV387SyncPlayAutoJoin387Toggle() {
    val current = BiliClient.prefs.v387syncPlayAutoJoin387
    BiliClient.prefs.v387syncPlayAutoJoin387 = !current
    AppToast.show(this, "SyncPlay Auto Join387: ${if (!current) "ON" else "OFF"}")
}

// v387: Proxy Auto Detect387
internal fun PlayerActivity.showV387ProxyAutoDetect387Toggle() {
    val current = BiliClient.prefs.v387proxyAutoDetect387
    BiliClient.prefs.v387proxyAutoDetect387 = !current
    AppToast.show(this, "Proxy Auto Detect387: ${if (!current) "ON" else "OFF"}")
}

// v387: Queue Auto Sort387
internal fun PlayerActivity.showV387QueueAutoSort387Toggle() {
    val current = BiliClient.prefs.v387queueAutoSort387
    BiliClient.prefs.v387queueAutoSort387 = !current
    AppToast.show(this, "Queue Auto Sort387: ${if (!current) "ON" else "OFF"}")
}

// v387: Record Auto Save387
internal fun PlayerActivity.showV387RecordAutoSave387Toggle() {
    val current = BiliClient.prefs.v387recordAutoSave387
    BiliClient.prefs.v387recordAutoSave387 = !current
    AppToast.show(this, "Record Auto Save387: ${if (!current) "ON" else "OFF"}")
}

// v387: Image Enhance Sharp387
internal fun PlayerActivity.showV387ImageEnhanceSharp387Toggle() {
    val current = BiliClient.prefs.v387imageEnhanceSharp387
    BiliClient.prefs.v387imageEnhanceSharp387 = !current
    AppToast.show(this, "Image Enhance Sharp387: ${if (!current) "ON" else "OFF"}")
}

// v387: Image Enhance Denoise387
internal fun PlayerActivity.showV387ImageEnhanceDenoise387Toggle() {
    val current = BiliClient.prefs.v387imageEnhanceDenoise387
    BiliClient.prefs.v387imageEnhanceDenoise387 = !current
    AppToast.show(this, "Image Enhance Denoise387: ${if (!current) "ON" else "OFF"}")
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
}

// v388: Grid Layout Animation388
internal fun PlayerActivity.showV388GridLayoutAnimation388Toggle() {
    val current = BiliClient.prefs.v388gridLayoutAnimation388
    BiliClient.prefs.v388gridLayoutAnimation388 = !current
    AppToast.show(this, "Grid Layout Animation388: ${if (!current) "ON" else "OFF"}")
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
}

// v388: Page Auto Load388
internal fun PlayerActivity.showV388PageAutoLoad388Toggle() {
    val current = BiliClient.prefs.v388pageAutoLoad388
    BiliClient.prefs.v388pageAutoLoad388 = !current
    AppToast.show(this, "Page Auto Load388: ${if (!current) "ON" else "OFF"}")
}

// v388: Panel Auto Hide388
internal fun PlayerActivity.showV388PanelAutoHide388Toggle() {
    val current = BiliClient.prefs.v388panelAutoHide388
    BiliClient.prefs.v388panelAutoHide388 = !current
    AppToast.show(this, "Panel Auto Hide388: ${if (!current) "ON" else "OFF"}")
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
}

// v388: SubList Auto Collapse388
internal fun PlayerActivity.showV388SubListAutoCollapse388Toggle() {
    val current = BiliClient.prefs.v388subListAutoCollapse388
    BiliClient.prefs.v388subListAutoCollapse388 = !current
    AppToast.show(this, "SubList Auto Collapse388: ${if (!current) "ON" else "OFF"}")
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
}

// v388: SyncPlay Auto Join388
internal fun PlayerActivity.showV388SyncPlayAutoJoin388Toggle() {
    val current = BiliClient.prefs.v388syncPlayAutoJoin388
    BiliClient.prefs.v388syncPlayAutoJoin388 = !current
    AppToast.show(this, "SyncPlay Auto Join388: ${if (!current) "ON" else "OFF"}")
}

// v388: Proxy Auto Detect388
internal fun PlayerActivity.showV388ProxyAutoDetect388Toggle() {
    val current = BiliClient.prefs.v388proxyAutoDetect388
    BiliClient.prefs.v388proxyAutoDetect388 = !current
    AppToast.show(this, "Proxy Auto Detect388: ${if (!current) "ON" else "OFF"}")
}

// v388: Queue Auto Sort388
internal fun PlayerActivity.showV388QueueAutoSort388Toggle() {
    val current = BiliClient.prefs.v388queueAutoSort388
    BiliClient.prefs.v388queueAutoSort388 = !current
    AppToast.show(this, "Queue Auto Sort388: ${if (!current) "ON" else "OFF"}")
}

// v388: Record Auto Save388
internal fun PlayerActivity.showV388RecordAutoSave388Toggle() {
    val current = BiliClient.prefs.v388recordAutoSave388
    BiliClient.prefs.v388recordAutoSave388 = !current
    AppToast.show(this, "Record Auto Save388: ${if (!current) "ON" else "OFF"}")
}

// v388: Image Enhance Sharp388
internal fun PlayerActivity.showV388ImageEnhanceSharp388Toggle() {
    val current = BiliClient.prefs.v388imageEnhanceSharp388
    BiliClient.prefs.v388imageEnhanceSharp388 = !current
    AppToast.show(this, "Image Enhance Sharp388: ${if (!current) "ON" else "OFF"}")
}

// v388: Image Enhance Denoise388
internal fun PlayerActivity.showV388ImageEnhanceDenoise388Toggle() {
    val current = BiliClient.prefs.v388imageEnhanceDenoise388
    BiliClient.prefs.v388imageEnhanceDenoise388 = !current
    AppToast.show(this, "Image Enhance Denoise388: ${if (!current) "ON" else "OFF"}")
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
}

// v389: Grid Layout Animation389
internal fun PlayerActivity.showV389GridLayoutAnimation389Toggle() {
    val current = BiliClient.prefs.v389gridLayoutAnimation389
    BiliClient.prefs.v389gridLayoutAnimation389 = !current
    AppToast.show(this, "Grid Layout Animation389: ${if (!current) "ON" else "OFF"}")
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
}

// v389: Page Auto Load389
internal fun PlayerActivity.showV389PageAutoLoad389Toggle() {
    val current = BiliClient.prefs.v389pageAutoLoad389
    BiliClient.prefs.v389pageAutoLoad389 = !current
    AppToast.show(this, "Page Auto Load389: ${if (!current) "ON" else "OFF"}")
}

// v389: Panel Auto Hide389
internal fun PlayerActivity.showV389PanelAutoHide389Toggle() {
    val current = BiliClient.prefs.v389panelAutoHide389
    BiliClient.prefs.v389panelAutoHide389 = !current
    AppToast.show(this, "Panel Auto Hide389: ${if (!current) "ON" else "OFF"}")
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
}

// v389: SubList Auto Collapse389
internal fun PlayerActivity.showV389SubListAutoCollapse389Toggle() {
    val current = BiliClient.prefs.v389subListAutoCollapse389
    BiliClient.prefs.v389subListAutoCollapse389 = !current
    AppToast.show(this, "SubList Auto Collapse389: ${if (!current) "ON" else "OFF"}")
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
}

// v389: SyncPlay Auto Join389
internal fun PlayerActivity.showV389SyncPlayAutoJoin389Toggle() {
    val current = BiliClient.prefs.v389syncPlayAutoJoin389
    BiliClient.prefs.v389syncPlayAutoJoin389 = !current
    AppToast.show(this, "SyncPlay Auto Join389: ${if (!current) "ON" else "OFF"}")
}

// v389: Proxy Auto Detect389
internal fun PlayerActivity.showV389ProxyAutoDetect389Toggle() {
    val current = BiliClient.prefs.v389proxyAutoDetect389
    BiliClient.prefs.v389proxyAutoDetect389 = !current
    AppToast.show(this, "Proxy Auto Detect389: ${if (!current) "ON" else "OFF"}")
}

// v389: Queue Auto Sort389
internal fun PlayerActivity.showV389QueueAutoSort389Toggle() {
    val current = BiliClient.prefs.v389queueAutoSort389
    BiliClient.prefs.v389queueAutoSort389 = !current
    AppToast.show(this, "Queue Auto Sort389: ${if (!current) "ON" else "OFF"}")
}

// v389: Record Auto Save389
internal fun PlayerActivity.showV389RecordAutoSave389Toggle() {
    val current = BiliClient.prefs.v389recordAutoSave389
    BiliClient.prefs.v389recordAutoSave389 = !current
    AppToast.show(this, "Record Auto Save389: ${if (!current) "ON" else "OFF"}")
}

// v389: Image Enhance Sharp389
internal fun PlayerActivity.showV389ImageEnhanceSharp389Toggle() {
    val current = BiliClient.prefs.v389imageEnhanceSharp389
    BiliClient.prefs.v389imageEnhanceSharp389 = !current
    AppToast.show(this, "Image Enhance Sharp389: ${if (!current) "ON" else "OFF"}")
}

// v389: Image Enhance Denoise389
internal fun PlayerActivity.showV389ImageEnhanceDenoise389Toggle() {
    val current = BiliClient.prefs.v389imageEnhanceDenoise389
    BiliClient.prefs.v389imageEnhanceDenoise389 = !current
    AppToast.show(this, "Image Enhance Denoise389: ${if (!current) "ON" else "OFF"}")
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
}

// v390: Grid Layout Animation390
internal fun PlayerActivity.showV390GridLayoutAnimation390Toggle() {
    val current = BiliClient.prefs.v390gridLayoutAnimation390
    BiliClient.prefs.v390gridLayoutAnimation390 = !current
    AppToast.show(this, "Grid Layout Animation390: ${if (!current) "ON" else "OFF"}")
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
}

// v390: Page Auto Load390
internal fun PlayerActivity.showV390PageAutoLoad390Toggle() {
    val current = BiliClient.prefs.v390pageAutoLoad390
    BiliClient.prefs.v390pageAutoLoad390 = !current
    AppToast.show(this, "Page Auto Load390: ${if (!current) "ON" else "OFF"}")
}

// v390: Panel Auto Hide390
internal fun PlayerActivity.showV390PanelAutoHide390Toggle() {
    val current = BiliClient.prefs.v390panelAutoHide390
    BiliClient.prefs.v390panelAutoHide390 = !current
    AppToast.show(this, "Panel Auto Hide390: ${if (!current) "ON" else "OFF"}")
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
}

// v390: SubList Auto Collapse390
internal fun PlayerActivity.showV390SubListAutoCollapse390Toggle() {
    val current = BiliClient.prefs.v390subListAutoCollapse390
    BiliClient.prefs.v390subListAutoCollapse390 = !current
    AppToast.show(this, "SubList Auto Collapse390: ${if (!current) "ON" else "OFF"}")
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
}

// v390: SyncPlay Auto Join390
internal fun PlayerActivity.showV390SyncPlayAutoJoin390Toggle() {
    val current = BiliClient.prefs.v390syncPlayAutoJoin390
    BiliClient.prefs.v390syncPlayAutoJoin390 = !current
    AppToast.show(this, "SyncPlay Auto Join390: ${if (!current) "ON" else "OFF"}")
}

// v390: Proxy Auto Detect390
internal fun PlayerActivity.showV390ProxyAutoDetect390Toggle() {
    val current = BiliClient.prefs.v390proxyAutoDetect390
    BiliClient.prefs.v390proxyAutoDetect390 = !current
    AppToast.show(this, "Proxy Auto Detect390: ${if (!current) "ON" else "OFF"}")
}

// v390: Queue Auto Sort390
internal fun PlayerActivity.showV390QueueAutoSort390Toggle() {
    val current = BiliClient.prefs.v390queueAutoSort390
    BiliClient.prefs.v390queueAutoSort390 = !current
    AppToast.show(this, "Queue Auto Sort390: ${if (!current) "ON" else "OFF"}")
}

// v390: Record Auto Save390
internal fun PlayerActivity.showV390RecordAutoSave390Toggle() {
    val current = BiliClient.prefs.v390recordAutoSave390
    BiliClient.prefs.v390recordAutoSave390 = !current
    AppToast.show(this, "Record Auto Save390: ${if (!current) "ON" else "OFF"}")
}

// v390: Image Enhance Sharp390
internal fun PlayerActivity.showV390ImageEnhanceSharp390Toggle() {
    val current = BiliClient.prefs.v390imageEnhanceSharp390
    BiliClient.prefs.v390imageEnhanceSharp390 = !current
    AppToast.show(this, "Image Enhance Sharp390: ${if (!current) "ON" else "OFF"}")
}

// v390: Image Enhance Denoise390
internal fun PlayerActivity.showV390ImageEnhanceDenoise390Toggle() {
    val current = BiliClient.prefs.v390imageEnhanceDenoise390
    BiliClient.prefs.v390imageEnhanceDenoise390 = !current
    AppToast.show(this, "Image Enhance Denoise390: ${if (!current) "ON" else "OFF"}")
}

// v391: AI Auto Tag Generate391
internal fun PlayerActivity.showV391AiAutoTagGenerate391Toggle() {
    val current = BiliClient.prefs.v391aiAutoTagGenerate391
    BiliClient.prefs.v391aiAutoTagGenerate391 = !current
    AppToast.show(this, "AI Auto Tag Generate391: ${if (!current) "ON" else "OFF"}")
}

// v391: AI Smart Recommend391
internal fun PlayerActivity.showV391AiSmartRecommend391Toggle() {
    val current = BiliClient.prefs.v391aiSmartRecommend391
    BiliClient.prefs.v391aiSmartRecommend391 = !current
    AppToast.show(this, "AI Smart Recommend391: ${if (!current) "ON" else "OFF"}")
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
}

// v391: Banner Auto Rotate391
internal fun PlayerActivity.showV391BannerAutoRotate391Toggle() {
    val current = BiliClient.prefs.v391bannerAutoRotate391
    BiliClient.prefs.v391bannerAutoRotate391 = !current
    AppToast.show(this, "Banner Auto Rotate391: ${if (!current) "ON" else "OFF"}")
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
}

// v391: Batch Operation Confirm391
internal fun PlayerActivity.showV391BatchOperationConfirm391Toggle() {
    val current = BiliClient.prefs.v391batchOperationConfirm391
    BiliClient.prefs.v391batchOperationConfirm391 = !current
    AppToast.show(this, "Batch Operation Confirm391: ${if (!current) "ON" else "OFF"}")
}

// v391: Block Auto Hide391
internal fun PlayerActivity.showV391BlockAutoHide391Toggle() {
    val current = BiliClient.prefs.v391blockAutoHide391
    BiliClient.prefs.v391blockAutoHide391 = !current
    AppToast.show(this, "Block Auto Hide391: ${if (!current) "ON" else "OFF"}")
}

// v391: Boost Mode Enabled391
internal fun PlayerActivity.showV391BoostModeEnabled391Toggle() {
    val current = BiliClient.prefs.v391boostModeEnabled391
    BiliClient.prefs.v391boostModeEnabled391 = !current
    AppToast.show(this, "Boost Mode Enabled391: ${if (!current) "ON" else "OFF"}")
}

// v391: Bot Auto Reply391
internal fun PlayerActivity.showV391BotAutoReply391Toggle() {
    val current = BiliClient.prefs.v391botAutoReply391
    BiliClient.prefs.v391botAutoReply391 = !current
    AppToast.show(this, "Bot Auto Reply391: ${if (!current) "ON" else "OFF"}")
}

// v391: Bubble Animation391
internal fun PlayerActivity.showV391BubbleAnimation391Toggle() {
    val current = BiliClient.prefs.v391bubbleAnimation391
    BiliClient.prefs.v391bubbleAnimation391 = !current
    AppToast.show(this, "Bubble Animation391: ${if (!current) "ON" else "OFF"}")
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
}

// v391: Calendar Sync Enabled391
internal fun PlayerActivity.showV391CalendarSyncEnabled391Toggle() {
    val current = BiliClient.prefs.v391calendarSyncEnabled391
    BiliClient.prefs.v391calendarSyncEnabled391 = !current
    AppToast.show(this, "Calendar Sync Enabled391: ${if (!current) "ON" else "OFF"}")
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
}

// v391: Chat Auto Scroll391
internal fun PlayerActivity.showV391ChatAutoScroll391Toggle() {
    val current = BiliClient.prefs.v391chatAutoScroll391
    BiliClient.prefs.v391chatAutoScroll391 = !current
    AppToast.show(this, "Chat Auto Scroll391: ${if (!current) "ON" else "OFF"}")
}

// v392: AI Auto Tag Generate392
internal fun PlayerActivity.showV392AiAutoTagGenerate392Toggle() {
    val current = BiliClient.prefs.v392aiAutoTagGenerate392
    BiliClient.prefs.v392aiAutoTagGenerate392 = !current
    AppToast.show(this, "AI Auto Tag Generate392: ${if (!current) "ON" else "OFF"}")
}

// v392: AI Smart Recommend392
internal fun PlayerActivity.showV392AiSmartRecommend392Toggle() {
    val current = BiliClient.prefs.v392aiSmartRecommend392
    BiliClient.prefs.v392aiSmartRecommend392 = !current
    AppToast.show(this, "AI Smart Recommend392: ${if (!current) "ON" else "OFF"}")
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
}

// v392: Banner Auto Rotate392
internal fun PlayerActivity.showV392BannerAutoRotate392Toggle() {
    val current = BiliClient.prefs.v392bannerAutoRotate392
    BiliClient.prefs.v392bannerAutoRotate392 = !current
    AppToast.show(this, "Banner Auto Rotate392: ${if (!current) "ON" else "OFF"}")
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
}

// v392: Batch Operation Confirm392
internal fun PlayerActivity.showV392BatchOperationConfirm392Toggle() {
    val current = BiliClient.prefs.v392batchOperationConfirm392
    BiliClient.prefs.v392batchOperationConfirm392 = !current
    AppToast.show(this, "Batch Operation Confirm392: ${if (!current) "ON" else "OFF"}")
}

// v392: Block Auto Hide392
internal fun PlayerActivity.showV392BlockAutoHide392Toggle() {
    val current = BiliClient.prefs.v392blockAutoHide392
    BiliClient.prefs.v392blockAutoHide392 = !current
    AppToast.show(this, "Block Auto Hide392: ${if (!current) "ON" else "OFF"}")
}

// v392: Boost Mode Enabled392
internal fun PlayerActivity.showV392BoostModeEnabled392Toggle() {
    val current = BiliClient.prefs.v392boostModeEnabled392
    BiliClient.prefs.v392boostModeEnabled392 = !current
    AppToast.show(this, "Boost Mode Enabled392: ${if (!current) "ON" else "OFF"}")
}

// v392: Bot Auto Reply392
internal fun PlayerActivity.showV392BotAutoReply392Toggle() {
    val current = BiliClient.prefs.v392botAutoReply392
    BiliClient.prefs.v392botAutoReply392 = !current
    AppToast.show(this, "Bot Auto Reply392: ${if (!current) "ON" else "OFF"}")
}

// v392: Bubble Animation392
internal fun PlayerActivity.showV392BubbleAnimation392Toggle() {
    val current = BiliClient.prefs.v392bubbleAnimation392
    BiliClient.prefs.v392bubbleAnimation392 = !current
    AppToast.show(this, "Bubble Animation392: ${if (!current) "ON" else "OFF"}")
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
}

// v392: Calendar Sync Enabled392
internal fun PlayerActivity.showV392CalendarSyncEnabled392Toggle() {
    val current = BiliClient.prefs.v392calendarSyncEnabled392
    BiliClient.prefs.v392calendarSyncEnabled392 = !current
    AppToast.show(this, "Calendar Sync Enabled392: ${if (!current) "ON" else "OFF"}")
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
}

// v392: Chat Auto Scroll392
internal fun PlayerActivity.showV392ChatAutoScroll392Toggle() {
    val current = BiliClient.prefs.v392chatAutoScroll392
    BiliClient.prefs.v392chatAutoScroll392 = !current
    AppToast.show(this, "Chat Auto Scroll392: ${if (!current) "ON" else "OFF"}")
}

// v393: AI Auto Tag Generate393
internal fun PlayerActivity.showV393AiAutoTagGenerate393Toggle() {
    val current = BiliClient.prefs.v393aiAutoTagGenerate393
    BiliClient.prefs.v393aiAutoTagGenerate393 = !current
    AppToast.show(this, "AI Auto Tag Generate393: ${if (!current) "ON" else "OFF"}")
}

// v393: AI Smart Recommend393
internal fun PlayerActivity.showV393AiSmartRecommend393Toggle() {
    val current = BiliClient.prefs.v393aiSmartRecommend393
    BiliClient.prefs.v393aiSmartRecommend393 = !current
    AppToast.show(this, "AI Smart Recommend393: ${if (!current) "ON" else "OFF"}")
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
}

// v393: Banner Auto Rotate393
internal fun PlayerActivity.showV393BannerAutoRotate393Toggle() {
    val current = BiliClient.prefs.v393bannerAutoRotate393
    BiliClient.prefs.v393bannerAutoRotate393 = !current
    AppToast.show(this, "Banner Auto Rotate393: ${if (!current) "ON" else "OFF"}")
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
}

// v393: Batch Operation Confirm393
internal fun PlayerActivity.showV393BatchOperationConfirm393Toggle() {
    val current = BiliClient.prefs.v393batchOperationConfirm393
    BiliClient.prefs.v393batchOperationConfirm393 = !current
    AppToast.show(this, "Batch Operation Confirm393: ${if (!current) "ON" else "OFF"}")
}

// v393: Block Auto Hide393
internal fun PlayerActivity.showV393BlockAutoHide393Toggle() {
    val current = BiliClient.prefs.v393blockAutoHide393
    BiliClient.prefs.v393blockAutoHide393 = !current
    AppToast.show(this, "Block Auto Hide393: ${if (!current) "ON" else "OFF"}")
}

// v393: Boost Mode Enabled393
internal fun PlayerActivity.showV393BoostModeEnabled393Toggle() {
    val current = BiliClient.prefs.v393boostModeEnabled393
    BiliClient.prefs.v393boostModeEnabled393 = !current
    AppToast.show(this, "Boost Mode Enabled393: ${if (!current) "ON" else "OFF"}")
}

// v393: Bot Auto Reply393
internal fun PlayerActivity.showV393BotAutoReply393Toggle() {
    val current = BiliClient.prefs.v393botAutoReply393
    BiliClient.prefs.v393botAutoReply393 = !current
    AppToast.show(this, "Bot Auto Reply393: ${if (!current) "ON" else "OFF"}")
}

// v393: Bubble Animation393
internal fun PlayerActivity.showV393BubbleAnimation393Toggle() {
    val current = BiliClient.prefs.v393bubbleAnimation393
    BiliClient.prefs.v393bubbleAnimation393 = !current
    AppToast.show(this, "Bubble Animation393: ${if (!current) "ON" else "OFF"}")
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
}

// v393: Calendar Sync Enabled393
internal fun PlayerActivity.showV393CalendarSyncEnabled393Toggle() {
    val current = BiliClient.prefs.v393calendarSyncEnabled393
    BiliClient.prefs.v393calendarSyncEnabled393 = !current
    AppToast.show(this, "Calendar Sync Enabled393: ${if (!current) "ON" else "OFF"}")
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
}

// v393: Chat Auto Scroll393
internal fun PlayerActivity.showV393ChatAutoScroll393Toggle() {
    val current = BiliClient.prefs.v393chatAutoScroll393
    BiliClient.prefs.v393chatAutoScroll393 = !current
    AppToast.show(this, "Chat Auto Scroll393: ${if (!current) "ON" else "OFF"}")
}

// v394: AI Auto Tag Generate394
internal fun PlayerActivity.showV394AiAutoTagGenerate394Toggle() {
    val current = BiliClient.prefs.v394aiAutoTagGenerate394
    BiliClient.prefs.v394aiAutoTagGenerate394 = !current
    AppToast.show(this, "AI Auto Tag Generate394: ${if (!current) "ON" else "OFF"}")
}

// v394: AI Smart Recommend394
internal fun PlayerActivity.showV394AiSmartRecommend394Toggle() {
    val current = BiliClient.prefs.v394aiSmartRecommend394
    BiliClient.prefs.v394aiSmartRecommend394 = !current
    AppToast.show(this, "AI Smart Recommend394: ${if (!current) "ON" else "OFF"}")
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
}

// v394: Banner Auto Rotate394
internal fun PlayerActivity.showV394BannerAutoRotate394Toggle() {
    val current = BiliClient.prefs.v394bannerAutoRotate394
    BiliClient.prefs.v394bannerAutoRotate394 = !current
    AppToast.show(this, "Banner Auto Rotate394: ${if (!current) "ON" else "OFF"}")
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
}

// v394: Batch Operation Confirm394
internal fun PlayerActivity.showV394BatchOperationConfirm394Toggle() {
    val current = BiliClient.prefs.v394batchOperationConfirm394
    BiliClient.prefs.v394batchOperationConfirm394 = !current
    AppToast.show(this, "Batch Operation Confirm394: ${if (!current) "ON" else "OFF"}")
}

// v394: Block Auto Hide394
internal fun PlayerActivity.showV394BlockAutoHide394Toggle() {
    val current = BiliClient.prefs.v394blockAutoHide394
    BiliClient.prefs.v394blockAutoHide394 = !current
    AppToast.show(this, "Block Auto Hide394: ${if (!current) "ON" else "OFF"}")
}

// v394: Boost Mode Enabled394
internal fun PlayerActivity.showV394BoostModeEnabled394Toggle() {
    val current = BiliClient.prefs.v394boostModeEnabled394
    BiliClient.prefs.v394boostModeEnabled394 = !current
    AppToast.show(this, "Boost Mode Enabled394: ${if (!current) "ON" else "OFF"}")
}

// v394: Bot Auto Reply394
internal fun PlayerActivity.showV394BotAutoReply394Toggle() {
    val current = BiliClient.prefs.v394botAutoReply394
    BiliClient.prefs.v394botAutoReply394 = !current
    AppToast.show(this, "Bot Auto Reply394: ${if (!current) "ON" else "OFF"}")
}

// v394: Bubble Animation394
internal fun PlayerActivity.showV394BubbleAnimation394Toggle() {
    val current = BiliClient.prefs.v394bubbleAnimation394
    BiliClient.prefs.v394bubbleAnimation394 = !current
    AppToast.show(this, "Bubble Animation394: ${if (!current) "ON" else "OFF"}")
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
}

// v394: Calendar Sync Enabled394
internal fun PlayerActivity.showV394CalendarSyncEnabled394Toggle() {
    val current = BiliClient.prefs.v394calendarSyncEnabled394
    BiliClient.prefs.v394calendarSyncEnabled394 = !current
    AppToast.show(this, "Calendar Sync Enabled394: ${if (!current) "ON" else "OFF"}")
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
}

// v394: Chat Auto Scroll394
internal fun PlayerActivity.showV394ChatAutoScroll394Toggle() {
    val current = BiliClient.prefs.v394chatAutoScroll394
    BiliClient.prefs.v394chatAutoScroll394 = !current
    AppToast.show(this, "Chat Auto Scroll394: ${if (!current) "ON" else "OFF"}")
}

// v395: AI Auto Tag Generate395
internal fun PlayerActivity.showV395AiAutoTagGenerate395Toggle() {
    val current = BiliClient.prefs.v395aiAutoTagGenerate395
    BiliClient.prefs.v395aiAutoTagGenerate395 = !current
    AppToast.show(this, "AI Auto Tag Generate395: ${if (!current) "ON" else "OFF"}")
}

// v395: AI Smart Recommend395
internal fun PlayerActivity.showV395AiSmartRecommend395Toggle() {
    val current = BiliClient.prefs.v395aiSmartRecommend395
    BiliClient.prefs.v395aiSmartRecommend395 = !current
    AppToast.show(this, "AI Smart Recommend395: ${if (!current) "ON" else "OFF"}")
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
}

// v395: Banner Auto Rotate395
internal fun PlayerActivity.showV395BannerAutoRotate395Toggle() {
    val current = BiliClient.prefs.v395bannerAutoRotate395
    BiliClient.prefs.v395bannerAutoRotate395 = !current
    AppToast.show(this, "Banner Auto Rotate395: ${if (!current) "ON" else "OFF"}")
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
}

// v395: Batch Operation Confirm395
internal fun PlayerActivity.showV395BatchOperationConfirm395Toggle() {
    val current = BiliClient.prefs.v395batchOperationConfirm395
    BiliClient.prefs.v395batchOperationConfirm395 = !current
    AppToast.show(this, "Batch Operation Confirm395: ${if (!current) "ON" else "OFF"}")
}

// v395: Block Auto Hide395
internal fun PlayerActivity.showV395BlockAutoHide395Toggle() {
    val current = BiliClient.prefs.v395blockAutoHide395
    BiliClient.prefs.v395blockAutoHide395 = !current
    AppToast.show(this, "Block Auto Hide395: ${if (!current) "ON" else "OFF"}")
}

// v395: Boost Mode Enabled395
internal fun PlayerActivity.showV395BoostModeEnabled395Toggle() {
    val current = BiliClient.prefs.v395boostModeEnabled395
    BiliClient.prefs.v395boostModeEnabled395 = !current
    AppToast.show(this, "Boost Mode Enabled395: ${if (!current) "ON" else "OFF"}")
}

// v395: Bot Auto Reply395
internal fun PlayerActivity.showV395BotAutoReply395Toggle() {
    val current = BiliClient.prefs.v395botAutoReply395
    BiliClient.prefs.v395botAutoReply395 = !current
    AppToast.show(this, "Bot Auto Reply395: ${if (!current) "ON" else "OFF"}")
}

// v395: Bubble Animation395
internal fun PlayerActivity.showV395BubbleAnimation395Toggle() {
    val current = BiliClient.prefs.v395bubbleAnimation395
    BiliClient.prefs.v395bubbleAnimation395 = !current
    AppToast.show(this, "Bubble Animation395: ${if (!current) "ON" else "OFF"}")
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
}

// v395: Calendar Sync Enabled395
internal fun PlayerActivity.showV395CalendarSyncEnabled395Toggle() {
    val current = BiliClient.prefs.v395calendarSyncEnabled395
    BiliClient.prefs.v395calendarSyncEnabled395 = !current
    AppToast.show(this, "Calendar Sync Enabled395: ${if (!current) "ON" else "OFF"}")
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
}

// v395: Chat Auto Scroll395
internal fun PlayerActivity.showV395ChatAutoScroll395Toggle() {
    val current = BiliClient.prefs.v395chatAutoScroll395
    BiliClient.prefs.v395chatAutoScroll395 = !current
    AppToast.show(this, "Chat Auto Scroll395: ${if (!current) "ON" else "OFF"}")
}

// v396: AI Auto Tag Generate396
internal fun PlayerActivity.showV396AiAutoTagGenerate396Toggle() {
    val current = BiliClient.prefs.v396aiAutoTagGenerate396
    BiliClient.prefs.v396aiAutoTagGenerate396 = !current
    AppToast.show(this, "AI Auto Tag Generate396: ${if (!current) "ON" else "OFF"}")
}

// v396: AI Smart Recommend396
internal fun PlayerActivity.showV396AiSmartRecommend396Toggle() {
    val current = BiliClient.prefs.v396aiSmartRecommend396
    BiliClient.prefs.v396aiSmartRecommend396 = !current
    AppToast.show(this, "AI Smart Recommend396: ${if (!current) "ON" else "OFF"}")
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
}

// v396: Banner Auto Rotate396
internal fun PlayerActivity.showV396BannerAutoRotate396Toggle() {
    val current = BiliClient.prefs.v396bannerAutoRotate396
    BiliClient.prefs.v396bannerAutoRotate396 = !current
    AppToast.show(this, "Banner Auto Rotate396: ${if (!current) "ON" else "OFF"}")
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
}

// v396: Batch Operation Confirm396
internal fun PlayerActivity.showV396BatchOperationConfirm396Toggle() {
    val current = BiliClient.prefs.v396batchOperationConfirm396
    BiliClient.prefs.v396batchOperationConfirm396 = !current
    AppToast.show(this, "Batch Operation Confirm396: ${if (!current) "ON" else "OFF"}")
}

// v396: Block Auto Hide396
internal fun PlayerActivity.showV396BlockAutoHide396Toggle() {
    val current = BiliClient.prefs.v396blockAutoHide396
    BiliClient.prefs.v396blockAutoHide396 = !current
    AppToast.show(this, "Block Auto Hide396: ${if (!current) "ON" else "OFF"}")
}

