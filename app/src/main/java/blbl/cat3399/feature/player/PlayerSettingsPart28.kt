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

internal fun PlayerActivity.showV388SubListAutoCollapse388Toggle() {
    val current = BiliClient.prefs.v388subListAutoCollapse388
    BiliClient.prefs.v388subListAutoCollapse388 = !current
    AppToast.show(this, "SubList Auto Collapse388: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV388SyncPlayAutoJoin388Toggle() {
    val current = BiliClient.prefs.v388syncPlayAutoJoin388
    BiliClient.prefs.v388syncPlayAutoJoin388 = !current
    AppToast.show(this, "SyncPlay Auto Join388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV388ProxyAutoDetect388Toggle() {
    val current = BiliClient.prefs.v388proxyAutoDetect388
    BiliClient.prefs.v388proxyAutoDetect388 = !current
    AppToast.show(this, "Proxy Auto Detect388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV388QueueAutoSort388Toggle() {
    val current = BiliClient.prefs.v388queueAutoSort388
    BiliClient.prefs.v388queueAutoSort388 = !current
    AppToast.show(this, "Queue Auto Sort388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV388RecordAutoSave388Toggle() {
    val current = BiliClient.prefs.v388recordAutoSave388
    BiliClient.prefs.v388recordAutoSave388 = !current
    AppToast.show(this, "Record Auto Save388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV388ImageEnhanceSharp388Toggle() {
    val current = BiliClient.prefs.v388imageEnhanceSharp388
    BiliClient.prefs.v388imageEnhanceSharp388 = !current
    AppToast.show(this, "Image Enhance Sharp388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV388ImageEnhanceDenoise388Toggle() {
    val current = BiliClient.prefs.v388imageEnhanceDenoise388
    BiliClient.prefs.v388imageEnhanceDenoise388 = !current
    AppToast.show(this, "Image Enhance Denoise388: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV389GridLayoutAnimation389Toggle() {
    val current = BiliClient.prefs.v389gridLayoutAnimation389
    BiliClient.prefs.v389gridLayoutAnimation389 = !current
    AppToast.show(this, "Grid Layout Animation389: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV389PageAutoLoad389Toggle() {
    val current = BiliClient.prefs.v389pageAutoLoad389
    BiliClient.prefs.v389pageAutoLoad389 = !current
    AppToast.show(this, "Page Auto Load389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV389PanelAutoHide389Toggle() {
    val current = BiliClient.prefs.v389panelAutoHide389
    BiliClient.prefs.v389panelAutoHide389 = !current
    AppToast.show(this, "Panel Auto Hide389: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV389SubListAutoCollapse389Toggle() {
    val current = BiliClient.prefs.v389subListAutoCollapse389
    BiliClient.prefs.v389subListAutoCollapse389 = !current
    AppToast.show(this, "SubList Auto Collapse389: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV389SyncPlayAutoJoin389Toggle() {
    val current = BiliClient.prefs.v389syncPlayAutoJoin389
    BiliClient.prefs.v389syncPlayAutoJoin389 = !current
    AppToast.show(this, "SyncPlay Auto Join389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV389ProxyAutoDetect389Toggle() {
    val current = BiliClient.prefs.v389proxyAutoDetect389
    BiliClient.prefs.v389proxyAutoDetect389 = !current
    AppToast.show(this, "Proxy Auto Detect389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV389QueueAutoSort389Toggle() {
    val current = BiliClient.prefs.v389queueAutoSort389
    BiliClient.prefs.v389queueAutoSort389 = !current
    AppToast.show(this, "Queue Auto Sort389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV389RecordAutoSave389Toggle() {
    val current = BiliClient.prefs.v389recordAutoSave389
    BiliClient.prefs.v389recordAutoSave389 = !current
    AppToast.show(this, "Record Auto Save389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV389ImageEnhanceSharp389Toggle() {
    val current = BiliClient.prefs.v389imageEnhanceSharp389
    BiliClient.prefs.v389imageEnhanceSharp389 = !current
    AppToast.show(this, "Image Enhance Sharp389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV389ImageEnhanceDenoise389Toggle() {
    val current = BiliClient.prefs.v389imageEnhanceDenoise389
    BiliClient.prefs.v389imageEnhanceDenoise389 = !current
    AppToast.show(this, "Image Enhance Denoise389: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV390GridLayoutAnimation390Toggle() {
    val current = BiliClient.prefs.v390gridLayoutAnimation390
    BiliClient.prefs.v390gridLayoutAnimation390 = !current
    AppToast.show(this, "Grid Layout Animation390: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV390PageAutoLoad390Toggle() {
    val current = BiliClient.prefs.v390pageAutoLoad390
    BiliClient.prefs.v390pageAutoLoad390 = !current
    AppToast.show(this, "Page Auto Load390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV390PanelAutoHide390Toggle() {
    val current = BiliClient.prefs.v390panelAutoHide390
    BiliClient.prefs.v390panelAutoHide390 = !current
    AppToast.show(this, "Panel Auto Hide390: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV390SubListAutoCollapse390Toggle() {
    val current = BiliClient.prefs.v390subListAutoCollapse390
    BiliClient.prefs.v390subListAutoCollapse390 = !current
    AppToast.show(this, "SubList Auto Collapse390: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV390SyncPlayAutoJoin390Toggle() {
    val current = BiliClient.prefs.v390syncPlayAutoJoin390
    BiliClient.prefs.v390syncPlayAutoJoin390 = !current
    AppToast.show(this, "SyncPlay Auto Join390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV390ProxyAutoDetect390Toggle() {
    val current = BiliClient.prefs.v390proxyAutoDetect390
    BiliClient.prefs.v390proxyAutoDetect390 = !current
    AppToast.show(this, "Proxy Auto Detect390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV390QueueAutoSort390Toggle() {
    val current = BiliClient.prefs.v390queueAutoSort390
    BiliClient.prefs.v390queueAutoSort390 = !current
    AppToast.show(this, "Queue Auto Sort390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV390RecordAutoSave390Toggle() {
    val current = BiliClient.prefs.v390recordAutoSave390
    BiliClient.prefs.v390recordAutoSave390 = !current
    AppToast.show(this, "Record Auto Save390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV390ImageEnhanceSharp390Toggle() {
    val current = BiliClient.prefs.v390imageEnhanceSharp390
    BiliClient.prefs.v390imageEnhanceSharp390 = !current
    AppToast.show(this, "Image Enhance Sharp390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV390ImageEnhanceDenoise390Toggle() {
    val current = BiliClient.prefs.v390imageEnhanceDenoise390
    BiliClient.prefs.v390imageEnhanceDenoise390 = !current
    AppToast.show(this, "Image Enhance Denoise390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV391AiAutoTagGenerate391Toggle() {
    val current = BiliClient.prefs.v391aiAutoTagGenerate391
    BiliClient.prefs.v391aiAutoTagGenerate391 = !current
    AppToast.show(this, "AI Auto Tag Generate391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV391AiSmartRecommend391Toggle() {
    val current = BiliClient.prefs.v391aiSmartRecommend391
    BiliClient.prefs.v391aiSmartRecommend391 = !current
    AppToast.show(this, "AI Smart Recommend391: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV391BannerAutoRotate391Toggle() {
    val current = BiliClient.prefs.v391bannerAutoRotate391
    BiliClient.prefs.v391bannerAutoRotate391 = !current
    AppToast.show(this, "Banner Auto Rotate391: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV391BatchOperationConfirm391Toggle() {
    val current = BiliClient.prefs.v391batchOperationConfirm391
    BiliClient.prefs.v391batchOperationConfirm391 = !current
    AppToast.show(this, "Batch Operation Confirm391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV391BlockAutoHide391Toggle() {
    val current = BiliClient.prefs.v391blockAutoHide391
    BiliClient.prefs.v391blockAutoHide391 = !current
    AppToast.show(this, "Block Auto Hide391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV391BoostModeEnabled391Toggle() {
    val current = BiliClient.prefs.v391boostModeEnabled391
    BiliClient.prefs.v391boostModeEnabled391 = !current
    AppToast.show(this, "Boost Mode Enabled391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV391BotAutoReply391Toggle() {
    val current = BiliClient.prefs.v391botAutoReply391
    BiliClient.prefs.v391botAutoReply391 = !current
    AppToast.show(this, "Bot Auto Reply391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV391BubbleAnimation391Toggle() {
    val current = BiliClient.prefs.v391bubbleAnimation391
    BiliClient.prefs.v391bubbleAnimation391 = !current
    AppToast.show(this, "Bubble Animation391: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV391CalendarSyncEnabled391Toggle() {
    val current = BiliClient.prefs.v391calendarSyncEnabled391
    BiliClient.prefs.v391calendarSyncEnabled391 = !current
    AppToast.show(this, "Calendar Sync Enabled391: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV391ChatAutoScroll391Toggle() {
    val current = BiliClient.prefs.v391chatAutoScroll391
    BiliClient.prefs.v391chatAutoScroll391 = !current
    AppToast.show(this, "Chat Auto Scroll391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV392AiAutoTagGenerate392Toggle() {
    val current = BiliClient.prefs.v392aiAutoTagGenerate392
    BiliClient.prefs.v392aiAutoTagGenerate392 = !current
    AppToast.show(this, "AI Auto Tag Generate392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV392AiSmartRecommend392Toggle() {
    val current = BiliClient.prefs.v392aiSmartRecommend392
    BiliClient.prefs.v392aiSmartRecommend392 = !current
    AppToast.show(this, "AI Smart Recommend392: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV392BannerAutoRotate392Toggle() {
    val current = BiliClient.prefs.v392bannerAutoRotate392
    BiliClient.prefs.v392bannerAutoRotate392 = !current
    AppToast.show(this, "Banner Auto Rotate392: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV392BatchOperationConfirm392Toggle() {
    val current = BiliClient.prefs.v392batchOperationConfirm392
    BiliClient.prefs.v392batchOperationConfirm392 = !current
    AppToast.show(this, "Batch Operation Confirm392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV392BlockAutoHide392Toggle() {
    val current = BiliClient.prefs.v392blockAutoHide392
    BiliClient.prefs.v392blockAutoHide392 = !current
    AppToast.show(this, "Block Auto Hide392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV392BoostModeEnabled392Toggle() {
    val current = BiliClient.prefs.v392boostModeEnabled392
    BiliClient.prefs.v392boostModeEnabled392 = !current
    AppToast.show(this, "Boost Mode Enabled392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV392BotAutoReply392Toggle() {
    val current = BiliClient.prefs.v392botAutoReply392
    BiliClient.prefs.v392botAutoReply392 = !current
    AppToast.show(this, "Bot Auto Reply392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV392BubbleAnimation392Toggle() {
    val current = BiliClient.prefs.v392bubbleAnimation392
    BiliClient.prefs.v392bubbleAnimation392 = !current
    AppToast.show(this, "Bubble Animation392: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV392CalendarSyncEnabled392Toggle() {
    val current = BiliClient.prefs.v392calendarSyncEnabled392
    BiliClient.prefs.v392calendarSyncEnabled392 = !current
    AppToast.show(this, "Calendar Sync Enabled392: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV392ChatAutoScroll392Toggle() {
    val current = BiliClient.prefs.v392chatAutoScroll392
    BiliClient.prefs.v392chatAutoScroll392 = !current
    AppToast.show(this, "Chat Auto Scroll392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV393AiAutoTagGenerate393Toggle() {
    val current = BiliClient.prefs.v393aiAutoTagGenerate393
    BiliClient.prefs.v393aiAutoTagGenerate393 = !current
    AppToast.show(this, "AI Auto Tag Generate393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV393AiSmartRecommend393Toggle() {
    val current = BiliClient.prefs.v393aiSmartRecommend393
    BiliClient.prefs.v393aiSmartRecommend393 = !current
    AppToast.show(this, "AI Smart Recommend393: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV393BannerAutoRotate393Toggle() {
    val current = BiliClient.prefs.v393bannerAutoRotate393
    BiliClient.prefs.v393bannerAutoRotate393 = !current
    AppToast.show(this, "Banner Auto Rotate393: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV393BatchOperationConfirm393Toggle() {
    val current = BiliClient.prefs.v393batchOperationConfirm393
    BiliClient.prefs.v393batchOperationConfirm393 = !current
    AppToast.show(this, "Batch Operation Confirm393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV393BlockAutoHide393Toggle() {
    val current = BiliClient.prefs.v393blockAutoHide393
    BiliClient.prefs.v393blockAutoHide393 = !current
    AppToast.show(this, "Block Auto Hide393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV393BoostModeEnabled393Toggle() {
    val current = BiliClient.prefs.v393boostModeEnabled393
    BiliClient.prefs.v393boostModeEnabled393 = !current
    AppToast.show(this, "Boost Mode Enabled393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV393BotAutoReply393Toggle() {
    val current = BiliClient.prefs.v393botAutoReply393
    BiliClient.prefs.v393botAutoReply393 = !current
    AppToast.show(this, "Bot Auto Reply393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV393BubbleAnimation393Toggle() {
    val current = BiliClient.prefs.v393bubbleAnimation393
    BiliClient.prefs.v393bubbleAnimation393 = !current
    AppToast.show(this, "Bubble Animation393: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV393CalendarSyncEnabled393Toggle() {
    val current = BiliClient.prefs.v393calendarSyncEnabled393
    BiliClient.prefs.v393calendarSyncEnabled393 = !current
    AppToast.show(this, "Calendar Sync Enabled393: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV393ChatAutoScroll393Toggle() {
    val current = BiliClient.prefs.v393chatAutoScroll393
    BiliClient.prefs.v393chatAutoScroll393 = !current
    AppToast.show(this, "Chat Auto Scroll393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV394AiAutoTagGenerate394Toggle() {
    val current = BiliClient.prefs.v394aiAutoTagGenerate394
    BiliClient.prefs.v394aiAutoTagGenerate394 = !current
    AppToast.show(this, "AI Auto Tag Generate394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV394AiSmartRecommend394Toggle() {
    val current = BiliClient.prefs.v394aiSmartRecommend394
    BiliClient.prefs.v394aiSmartRecommend394 = !current
    AppToast.show(this, "AI Smart Recommend394: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV394BannerAutoRotate394Toggle() {
    val current = BiliClient.prefs.v394bannerAutoRotate394
    BiliClient.prefs.v394bannerAutoRotate394 = !current
    AppToast.show(this, "Banner Auto Rotate394: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV394BatchOperationConfirm394Toggle() {
    val current = BiliClient.prefs.v394batchOperationConfirm394
    BiliClient.prefs.v394batchOperationConfirm394 = !current
    AppToast.show(this, "Batch Operation Confirm394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV394BlockAutoHide394Toggle() {
    val current = BiliClient.prefs.v394blockAutoHide394
    BiliClient.prefs.v394blockAutoHide394 = !current
    AppToast.show(this, "Block Auto Hide394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV394BoostModeEnabled394Toggle() {
    val current = BiliClient.prefs.v394boostModeEnabled394
    BiliClient.prefs.v394boostModeEnabled394 = !current
    AppToast.show(this, "Boost Mode Enabled394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV394BotAutoReply394Toggle() {
    val current = BiliClient.prefs.v394botAutoReply394
    BiliClient.prefs.v394botAutoReply394 = !current
    AppToast.show(this, "Bot Auto Reply394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV394BubbleAnimation394Toggle() {
    val current = BiliClient.prefs.v394bubbleAnimation394
    BiliClient.prefs.v394bubbleAnimation394 = !current
    AppToast.show(this, "Bubble Animation394: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV394CalendarSyncEnabled394Toggle() {
    val current = BiliClient.prefs.v394calendarSyncEnabled394
    BiliClient.prefs.v394calendarSyncEnabled394 = !current
    AppToast.show(this, "Calendar Sync Enabled394: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV394ChatAutoScroll394Toggle() {
    val current = BiliClient.prefs.v394chatAutoScroll394
    BiliClient.prefs.v394chatAutoScroll394 = !current
    AppToast.show(this, "Chat Auto Scroll394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV395AiAutoTagGenerate395Toggle() {
    val current = BiliClient.prefs.v395aiAutoTagGenerate395
    BiliClient.prefs.v395aiAutoTagGenerate395 = !current
    AppToast.show(this, "AI Auto Tag Generate395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV395AiSmartRecommend395Toggle() {
    val current = BiliClient.prefs.v395aiSmartRecommend395
    BiliClient.prefs.v395aiSmartRecommend395 = !current
    AppToast.show(this, "AI Smart Recommend395: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV395BannerAutoRotate395Toggle() {
    val current = BiliClient.prefs.v395bannerAutoRotate395
    BiliClient.prefs.v395bannerAutoRotate395 = !current
    AppToast.show(this, "Banner Auto Rotate395: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV395BatchOperationConfirm395Toggle() {
    val current = BiliClient.prefs.v395batchOperationConfirm395
    BiliClient.prefs.v395batchOperationConfirm395 = !current
    AppToast.show(this, "Batch Operation Confirm395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV395BlockAutoHide395Toggle() {
    val current = BiliClient.prefs.v395blockAutoHide395
    BiliClient.prefs.v395blockAutoHide395 = !current
    AppToast.show(this, "Block Auto Hide395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV395BoostModeEnabled395Toggle() {
    val current = BiliClient.prefs.v395boostModeEnabled395
    BiliClient.prefs.v395boostModeEnabled395 = !current
    AppToast.show(this, "Boost Mode Enabled395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV395BotAutoReply395Toggle() {
    val current = BiliClient.prefs.v395botAutoReply395
    BiliClient.prefs.v395botAutoReply395 = !current
    AppToast.show(this, "Bot Auto Reply395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV395BubbleAnimation395Toggle() {
    val current = BiliClient.prefs.v395bubbleAnimation395
    BiliClient.prefs.v395bubbleAnimation395 = !current
    AppToast.show(this, "Bubble Animation395: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV395CalendarSyncEnabled395Toggle() {
    val current = BiliClient.prefs.v395calendarSyncEnabled395
    BiliClient.prefs.v395calendarSyncEnabled395 = !current
    AppToast.show(this, "Calendar Sync Enabled395: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV395ChatAutoScroll395Toggle() {
    val current = BiliClient.prefs.v395chatAutoScroll395
    BiliClient.prefs.v395chatAutoScroll395 = !current
    AppToast.show(this, "Chat Auto Scroll395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV396AiAutoTagGenerate396Toggle() {
    val current = BiliClient.prefs.v396aiAutoTagGenerate396
    BiliClient.prefs.v396aiAutoTagGenerate396 = !current
    AppToast.show(this, "AI Auto Tag Generate396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV396AiSmartRecommend396Toggle() {
    val current = BiliClient.prefs.v396aiSmartRecommend396
    BiliClient.prefs.v396aiSmartRecommend396 = !current
    AppToast.show(this, "AI Smart Recommend396: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV396BannerAutoRotate396Toggle() {
    val current = BiliClient.prefs.v396bannerAutoRotate396
    BiliClient.prefs.v396bannerAutoRotate396 = !current
    AppToast.show(this, "Banner Auto Rotate396: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV396BatchOperationConfirm396Toggle() {
    val current = BiliClient.prefs.v396batchOperationConfirm396
    BiliClient.prefs.v396batchOperationConfirm396 = !current
    AppToast.show(this, "Batch Operation Confirm396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV396BlockAutoHide396Toggle() {
    val current = BiliClient.prefs.v396blockAutoHide396
    BiliClient.prefs.v396blockAutoHide396 = !current
    AppToast.show(this, "Block Auto Hide396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV396BoostModeEnabled396Toggle() {
    val current = BiliClient.prefs.v396boostModeEnabled396
    BiliClient.prefs.v396boostModeEnabled396 = !current
    AppToast.show(this, "Boost Mode Enabled396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV396BotAutoReply396Toggle() {
    val current = BiliClient.prefs.v396botAutoReply396
    BiliClient.prefs.v396botAutoReply396 = !current
    AppToast.show(this, "Bot Auto Reply396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV396BubbleAnimation396Toggle() {
    val current = BiliClient.prefs.v396bubbleAnimation396
    BiliClient.prefs.v396bubbleAnimation396 = !current
    AppToast.show(this, "Bubble Animation396: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV396CalendarSyncEnabled396Toggle() {
    val current = BiliClient.prefs.v396calendarSyncEnabled396
    BiliClient.prefs.v396calendarSyncEnabled396 = !current
    AppToast.show(this, "Calendar Sync Enabled396: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV396ChatAutoScroll396Toggle() {
    val current = BiliClient.prefs.v396chatAutoScroll396
    BiliClient.prefs.v396chatAutoScroll396 = !current
    AppToast.show(this, "Chat Auto Scroll396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV397AiAutoTagGenerate397Toggle() {
    val current = BiliClient.prefs.v397aiAutoTagGenerate397
    BiliClient.prefs.v397aiAutoTagGenerate397 = !current
    AppToast.show(this, "AI Auto Tag Generate397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV397AiSmartRecommend397Toggle() {
    val current = BiliClient.prefs.v397aiSmartRecommend397
    BiliClient.prefs.v397aiSmartRecommend397 = !current
    AppToast.show(this, "AI Smart Recommend397: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV397BannerAutoRotate397Toggle() {
    val current = BiliClient.prefs.v397bannerAutoRotate397
    BiliClient.prefs.v397bannerAutoRotate397 = !current
    AppToast.show(this, "Banner Auto Rotate397: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV397BatchOperationConfirm397Toggle() {
    val current = BiliClient.prefs.v397batchOperationConfirm397
    BiliClient.prefs.v397batchOperationConfirm397 = !current
    AppToast.show(this, "Batch Operation Confirm397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV397BlockAutoHide397Toggle() {
    val current = BiliClient.prefs.v397blockAutoHide397
    BiliClient.prefs.v397blockAutoHide397 = !current
    AppToast.show(this, "Block Auto Hide397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV397BoostModeEnabled397Toggle() {
    val current = BiliClient.prefs.v397boostModeEnabled397
    BiliClient.prefs.v397boostModeEnabled397 = !current
    AppToast.show(this, "Boost Mode Enabled397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV397BotAutoReply397Toggle() {
    val current = BiliClient.prefs.v397botAutoReply397
    BiliClient.prefs.v397botAutoReply397 = !current
    AppToast.show(this, "Bot Auto Reply397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV397BubbleAnimation397Toggle() {
    val current = BiliClient.prefs.v397bubbleAnimation397
    BiliClient.prefs.v397bubbleAnimation397 = !current
    AppToast.show(this, "Bubble Animation397: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV397CalendarSyncEnabled397Toggle() {
    val current = BiliClient.prefs.v397calendarSyncEnabled397
    BiliClient.prefs.v397calendarSyncEnabled397 = !current
    AppToast.show(this, "Calendar Sync Enabled397: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV397ChatAutoScroll397Toggle() {
    val current = BiliClient.prefs.v397chatAutoScroll397
    BiliClient.prefs.v397chatAutoScroll397 = !current
    AppToast.show(this, "Chat Auto Scroll397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV398AiAutoTagGenerate398Toggle() {
    val current = BiliClient.prefs.v398aiAutoTagGenerate398
    BiliClient.prefs.v398aiAutoTagGenerate398 = !current
    AppToast.show(this, "AI Auto Tag Generate398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV398AiSmartRecommend398Toggle() {
    val current = BiliClient.prefs.v398aiSmartRecommend398
    BiliClient.prefs.v398aiSmartRecommend398 = !current
    AppToast.show(this, "AI Smart Recommend398: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV398BannerAutoRotate398Toggle() {
    val current = BiliClient.prefs.v398bannerAutoRotate398
    BiliClient.prefs.v398bannerAutoRotate398 = !current
    AppToast.show(this, "Banner Auto Rotate398: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV398BatchOperationConfirm398Toggle() {
    val current = BiliClient.prefs.v398batchOperationConfirm398
    BiliClient.prefs.v398batchOperationConfirm398 = !current
    AppToast.show(this, "Batch Operation Confirm398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV398BlockAutoHide398Toggle() {
    val current = BiliClient.prefs.v398blockAutoHide398
    BiliClient.prefs.v398blockAutoHide398 = !current
    AppToast.show(this, "Block Auto Hide398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV398BoostModeEnabled398Toggle() {
    val current = BiliClient.prefs.v398boostModeEnabled398
    BiliClient.prefs.v398boostModeEnabled398 = !current
    AppToast.show(this, "Boost Mode Enabled398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV398BotAutoReply398Toggle() {
    val current = BiliClient.prefs.v398botAutoReply398
    BiliClient.prefs.v398botAutoReply398 = !current
    AppToast.show(this, "Bot Auto Reply398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV398BubbleAnimation398Toggle() {
    val current = BiliClient.prefs.v398bubbleAnimation398
    BiliClient.prefs.v398bubbleAnimation398 = !current
    AppToast.show(this, "Bubble Animation398: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV398CalendarSyncEnabled398Toggle() {
    val current = BiliClient.prefs.v398calendarSyncEnabled398
    BiliClient.prefs.v398calendarSyncEnabled398 = !current
    AppToast.show(this, "Calendar Sync Enabled398: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV398ChatAutoScroll398Toggle() {
    val current = BiliClient.prefs.v398chatAutoScroll398
    BiliClient.prefs.v398chatAutoScroll398 = !current
    AppToast.show(this, "Chat Auto Scroll398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV399AiAutoTagGenerate399Toggle() {
    val current = BiliClient.prefs.v399aiAutoTagGenerate399
    BiliClient.prefs.v399aiAutoTagGenerate399 = !current
    AppToast.show(this, "AI Auto Tag Generate399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV399AiSmartRecommend399Toggle() {
    val current = BiliClient.prefs.v399aiSmartRecommend399
    BiliClient.prefs.v399aiSmartRecommend399 = !current
    AppToast.show(this, "AI Smart Recommend399: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV399BannerAutoRotate399Toggle() {
    val current = BiliClient.prefs.v399bannerAutoRotate399
    BiliClient.prefs.v399bannerAutoRotate399 = !current
    AppToast.show(this, "Banner Auto Rotate399: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV399BatchOperationConfirm399Toggle() {
    val current = BiliClient.prefs.v399batchOperationConfirm399
    BiliClient.prefs.v399batchOperationConfirm399 = !current
    AppToast.show(this, "Batch Operation Confirm399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV399BlockAutoHide399Toggle() {
    val current = BiliClient.prefs.v399blockAutoHide399
    BiliClient.prefs.v399blockAutoHide399 = !current
    AppToast.show(this, "Block Auto Hide399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV399BoostModeEnabled399Toggle() {
    val current = BiliClient.prefs.v399boostModeEnabled399
    BiliClient.prefs.v399boostModeEnabled399 = !current
    AppToast.show(this, "Boost Mode Enabled399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV399BotAutoReply399Toggle() {
    val current = BiliClient.prefs.v399botAutoReply399
    BiliClient.prefs.v399botAutoReply399 = !current
    AppToast.show(this, "Bot Auto Reply399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV399BubbleAnimation399Toggle() {
    val current = BiliClient.prefs.v399bubbleAnimation399
    BiliClient.prefs.v399bubbleAnimation399 = !current
    AppToast.show(this, "Bubble Animation399: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV399CalendarSyncEnabled399Toggle() {
    val current = BiliClient.prefs.v399calendarSyncEnabled399
    BiliClient.prefs.v399calendarSyncEnabled399 = !current
    AppToast.show(this, "Calendar Sync Enabled399: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV399ChatAutoScroll399Toggle() {
    val current = BiliClient.prefs.v399chatAutoScroll399
    BiliClient.prefs.v399chatAutoScroll399 = !current
    AppToast.show(this, "Chat Auto Scroll399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV400AiAutoTagGenerate400Toggle() {
    val current = BiliClient.prefs.v400aiAutoTagGenerate400
    BiliClient.prefs.v400aiAutoTagGenerate400 = !current
    AppToast.show(this, "AI Auto Tag Generate400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV400AiSmartRecommend400Toggle() {
    val current = BiliClient.prefs.v400aiSmartRecommend400
    BiliClient.prefs.v400aiSmartRecommend400 = !current
    AppToast.show(this, "AI Smart Recommend400: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV400BannerAutoRotate400Toggle() {
    val current = BiliClient.prefs.v400bannerAutoRotate400
    BiliClient.prefs.v400bannerAutoRotate400 = !current
    AppToast.show(this, "Banner Auto Rotate400: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV400BatchOperationConfirm400Toggle() {
    val current = BiliClient.prefs.v400batchOperationConfirm400
    BiliClient.prefs.v400batchOperationConfirm400 = !current
    AppToast.show(this, "Batch Operation Confirm400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV400BlockAutoHide400Toggle() {
    val current = BiliClient.prefs.v400blockAutoHide400
    BiliClient.prefs.v400blockAutoHide400 = !current
    AppToast.show(this, "Block Auto Hide400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV400BoostModeEnabled400Toggle() {
    val current = BiliClient.prefs.v400boostModeEnabled400
    BiliClient.prefs.v400boostModeEnabled400 = !current
    AppToast.show(this, "Boost Mode Enabled400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV400BotAutoReply400Toggle() {
    val current = BiliClient.prefs.v400botAutoReply400
    BiliClient.prefs.v400botAutoReply400 = !current
    AppToast.show(this, "Bot Auto Reply400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV400BubbleAnimation400Toggle() {
    val current = BiliClient.prefs.v400bubbleAnimation400
    BiliClient.prefs.v400bubbleAnimation400 = !current
    AppToast.show(this, "Bubble Animation400: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV400CalendarSyncEnabled400Toggle() {
    val current = BiliClient.prefs.v400calendarSyncEnabled400
    BiliClient.prefs.v400calendarSyncEnabled400 = !current
    AppToast.show(this, "Calendar Sync Enabled400: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV400ChatAutoScroll400Toggle() {
    val current = BiliClient.prefs.v400chatAutoScroll400
    BiliClient.prefs.v400chatAutoScroll400 = !current
    AppToast.show(this, "Chat Auto Scroll400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401CloudAutoSync401Toggle() {
    val current = BiliClient.prefs.v401cloudAutoSync401
    BiliClient.prefs.v401cloudAutoSync401 = !current
    AppToast.show(this, "Cloud Auto Sync401: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV401CollectAutoCategorize401Toggle() {
    val current = BiliClient.prefs.v401collectAutoCategorize401
    BiliClient.prefs.v401collectAutoCategorize401 = !current
    AppToast.show(this, "Collect Auto Categorize401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401CompactModeEnabled401Toggle() {
    val current = BiliClient.prefs.v401compactModeEnabled401
    BiliClient.prefs.v401compactModeEnabled401 = !current
    AppToast.show(this, "Compact Mode Enabled401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401CompressAutoQuality401Toggle() {
    val current = BiliClient.prefs.v401compressAutoQuality401
    BiliClient.prefs.v401compressAutoQuality401 = !current
    AppToast.show(this, "Compress Auto Quality401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401ConnectAutoRetry401Toggle() {
    val current = BiliClient.prefs.v401connectAutoRetry401
    BiliClient.prefs.v401connectAutoRetry401 = !current
    AppToast.show(this, "Connect Auto Retry401: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV401DebugLogVerbose401Toggle() {
    val current = BiliClient.prefs.v401debugLogVerbose401
    BiliClient.prefs.v401debugLogVerbose401 = !current
    AppToast.show(this, "Debug Log Verbose401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401DeepColorEnabled401Toggle() {
    val current = BiliClient.prefs.v401deepColorEnabled401
    BiliClient.prefs.v401deepColorEnabled401 = !current
    AppToast.show(this, "Deep Color Enabled401: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

