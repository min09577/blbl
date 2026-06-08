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

// v396: Boost Mode Enabled396
internal fun PlayerActivity.showV396BoostModeEnabled396Toggle() {
    val current = BiliClient.prefs.v396boostModeEnabled396
    BiliClient.prefs.v396boostModeEnabled396 = !current
    AppToast.show(this, "Boost Mode Enabled396: ${if (!current) "ON" else "OFF"}")
}

// v396: Bot Auto Reply396
internal fun PlayerActivity.showV396BotAutoReply396Toggle() {
    val current = BiliClient.prefs.v396botAutoReply396
    BiliClient.prefs.v396botAutoReply396 = !current
    AppToast.show(this, "Bot Auto Reply396: ${if (!current) "ON" else "OFF"}")
}

// v396: Bubble Animation396
internal fun PlayerActivity.showV396BubbleAnimation396Toggle() {
    val current = BiliClient.prefs.v396bubbleAnimation396
    BiliClient.prefs.v396bubbleAnimation396 = !current
    AppToast.show(this, "Bubble Animation396: ${if (!current) "ON" else "OFF"}")
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
}

// v396: Calendar Sync Enabled396
internal fun PlayerActivity.showV396CalendarSyncEnabled396Toggle() {
    val current = BiliClient.prefs.v396calendarSyncEnabled396
    BiliClient.prefs.v396calendarSyncEnabled396 = !current
    AppToast.show(this, "Calendar Sync Enabled396: ${if (!current) "ON" else "OFF"}")
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
}

// v396: Chat Auto Scroll396
internal fun PlayerActivity.showV396ChatAutoScroll396Toggle() {
    val current = BiliClient.prefs.v396chatAutoScroll396
    BiliClient.prefs.v396chatAutoScroll396 = !current
    AppToast.show(this, "Chat Auto Scroll396: ${if (!current) "ON" else "OFF"}")
}

// v397: AI Auto Tag Generate397
internal fun PlayerActivity.showV397AiAutoTagGenerate397Toggle() {
    val current = BiliClient.prefs.v397aiAutoTagGenerate397
    BiliClient.prefs.v397aiAutoTagGenerate397 = !current
    AppToast.show(this, "AI Auto Tag Generate397: ${if (!current) "ON" else "OFF"}")
}

// v397: AI Smart Recommend397
internal fun PlayerActivity.showV397AiSmartRecommend397Toggle() {
    val current = BiliClient.prefs.v397aiSmartRecommend397
    BiliClient.prefs.v397aiSmartRecommend397 = !current
    AppToast.show(this, "AI Smart Recommend397: ${if (!current) "ON" else "OFF"}")
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
}

// v397: Banner Auto Rotate397
internal fun PlayerActivity.showV397BannerAutoRotate397Toggle() {
    val current = BiliClient.prefs.v397bannerAutoRotate397
    BiliClient.prefs.v397bannerAutoRotate397 = !current
    AppToast.show(this, "Banner Auto Rotate397: ${if (!current) "ON" else "OFF"}")
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
}

// v397: Batch Operation Confirm397
internal fun PlayerActivity.showV397BatchOperationConfirm397Toggle() {
    val current = BiliClient.prefs.v397batchOperationConfirm397
    BiliClient.prefs.v397batchOperationConfirm397 = !current
    AppToast.show(this, "Batch Operation Confirm397: ${if (!current) "ON" else "OFF"}")
}

// v397: Block Auto Hide397
internal fun PlayerActivity.showV397BlockAutoHide397Toggle() {
    val current = BiliClient.prefs.v397blockAutoHide397
    BiliClient.prefs.v397blockAutoHide397 = !current
    AppToast.show(this, "Block Auto Hide397: ${if (!current) "ON" else "OFF"}")
}

// v397: Boost Mode Enabled397
internal fun PlayerActivity.showV397BoostModeEnabled397Toggle() {
    val current = BiliClient.prefs.v397boostModeEnabled397
    BiliClient.prefs.v397boostModeEnabled397 = !current
    AppToast.show(this, "Boost Mode Enabled397: ${if (!current) "ON" else "OFF"}")
}

// v397: Bot Auto Reply397
internal fun PlayerActivity.showV397BotAutoReply397Toggle() {
    val current = BiliClient.prefs.v397botAutoReply397
    BiliClient.prefs.v397botAutoReply397 = !current
    AppToast.show(this, "Bot Auto Reply397: ${if (!current) "ON" else "OFF"}")
}

// v397: Bubble Animation397
internal fun PlayerActivity.showV397BubbleAnimation397Toggle() {
    val current = BiliClient.prefs.v397bubbleAnimation397
    BiliClient.prefs.v397bubbleAnimation397 = !current
    AppToast.show(this, "Bubble Animation397: ${if (!current) "ON" else "OFF"}")
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
}

// v397: Calendar Sync Enabled397
internal fun PlayerActivity.showV397CalendarSyncEnabled397Toggle() {
    val current = BiliClient.prefs.v397calendarSyncEnabled397
    BiliClient.prefs.v397calendarSyncEnabled397 = !current
    AppToast.show(this, "Calendar Sync Enabled397: ${if (!current) "ON" else "OFF"}")
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
}

// v397: Chat Auto Scroll397
internal fun PlayerActivity.showV397ChatAutoScroll397Toggle() {
    val current = BiliClient.prefs.v397chatAutoScroll397
    BiliClient.prefs.v397chatAutoScroll397 = !current
    AppToast.show(this, "Chat Auto Scroll397: ${if (!current) "ON" else "OFF"}")
}

// v398: AI Auto Tag Generate398
internal fun PlayerActivity.showV398AiAutoTagGenerate398Toggle() {
    val current = BiliClient.prefs.v398aiAutoTagGenerate398
    BiliClient.prefs.v398aiAutoTagGenerate398 = !current
    AppToast.show(this, "AI Auto Tag Generate398: ${if (!current) "ON" else "OFF"}")
}

// v398: AI Smart Recommend398
internal fun PlayerActivity.showV398AiSmartRecommend398Toggle() {
    val current = BiliClient.prefs.v398aiSmartRecommend398
    BiliClient.prefs.v398aiSmartRecommend398 = !current
    AppToast.show(this, "AI Smart Recommend398: ${if (!current) "ON" else "OFF"}")
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
}

// v398: Banner Auto Rotate398
internal fun PlayerActivity.showV398BannerAutoRotate398Toggle() {
    val current = BiliClient.prefs.v398bannerAutoRotate398
    BiliClient.prefs.v398bannerAutoRotate398 = !current
    AppToast.show(this, "Banner Auto Rotate398: ${if (!current) "ON" else "OFF"}")
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
}

// v398: Batch Operation Confirm398
internal fun PlayerActivity.showV398BatchOperationConfirm398Toggle() {
    val current = BiliClient.prefs.v398batchOperationConfirm398
    BiliClient.prefs.v398batchOperationConfirm398 = !current
    AppToast.show(this, "Batch Operation Confirm398: ${if (!current) "ON" else "OFF"}")
}

// v398: Block Auto Hide398
internal fun PlayerActivity.showV398BlockAutoHide398Toggle() {
    val current = BiliClient.prefs.v398blockAutoHide398
    BiliClient.prefs.v398blockAutoHide398 = !current
    AppToast.show(this, "Block Auto Hide398: ${if (!current) "ON" else "OFF"}")
}

// v398: Boost Mode Enabled398
internal fun PlayerActivity.showV398BoostModeEnabled398Toggle() {
    val current = BiliClient.prefs.v398boostModeEnabled398
    BiliClient.prefs.v398boostModeEnabled398 = !current
    AppToast.show(this, "Boost Mode Enabled398: ${if (!current) "ON" else "OFF"}")
}

// v398: Bot Auto Reply398
internal fun PlayerActivity.showV398BotAutoReply398Toggle() {
    val current = BiliClient.prefs.v398botAutoReply398
    BiliClient.prefs.v398botAutoReply398 = !current
    AppToast.show(this, "Bot Auto Reply398: ${if (!current) "ON" else "OFF"}")
}

// v398: Bubble Animation398
internal fun PlayerActivity.showV398BubbleAnimation398Toggle() {
    val current = BiliClient.prefs.v398bubbleAnimation398
    BiliClient.prefs.v398bubbleAnimation398 = !current
    AppToast.show(this, "Bubble Animation398: ${if (!current) "ON" else "OFF"}")
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
}

// v398: Calendar Sync Enabled398
internal fun PlayerActivity.showV398CalendarSyncEnabled398Toggle() {
    val current = BiliClient.prefs.v398calendarSyncEnabled398
    BiliClient.prefs.v398calendarSyncEnabled398 = !current
    AppToast.show(this, "Calendar Sync Enabled398: ${if (!current) "ON" else "OFF"}")
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
}

// v398: Chat Auto Scroll398
internal fun PlayerActivity.showV398ChatAutoScroll398Toggle() {
    val current = BiliClient.prefs.v398chatAutoScroll398
    BiliClient.prefs.v398chatAutoScroll398 = !current
    AppToast.show(this, "Chat Auto Scroll398: ${if (!current) "ON" else "OFF"}")
}

// v399: AI Auto Tag Generate399
internal fun PlayerActivity.showV399AiAutoTagGenerate399Toggle() {
    val current = BiliClient.prefs.v399aiAutoTagGenerate399
    BiliClient.prefs.v399aiAutoTagGenerate399 = !current
    AppToast.show(this, "AI Auto Tag Generate399: ${if (!current) "ON" else "OFF"}")
}

// v399: AI Smart Recommend399
internal fun PlayerActivity.showV399AiSmartRecommend399Toggle() {
    val current = BiliClient.prefs.v399aiSmartRecommend399
    BiliClient.prefs.v399aiSmartRecommend399 = !current
    AppToast.show(this, "AI Smart Recommend399: ${if (!current) "ON" else "OFF"}")
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
}

// v399: Banner Auto Rotate399
internal fun PlayerActivity.showV399BannerAutoRotate399Toggle() {
    val current = BiliClient.prefs.v399bannerAutoRotate399
    BiliClient.prefs.v399bannerAutoRotate399 = !current
    AppToast.show(this, "Banner Auto Rotate399: ${if (!current) "ON" else "OFF"}")
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
}

// v399: Batch Operation Confirm399
internal fun PlayerActivity.showV399BatchOperationConfirm399Toggle() {
    val current = BiliClient.prefs.v399batchOperationConfirm399
    BiliClient.prefs.v399batchOperationConfirm399 = !current
    AppToast.show(this, "Batch Operation Confirm399: ${if (!current) "ON" else "OFF"}")
}

// v399: Block Auto Hide399
internal fun PlayerActivity.showV399BlockAutoHide399Toggle() {
    val current = BiliClient.prefs.v399blockAutoHide399
    BiliClient.prefs.v399blockAutoHide399 = !current
    AppToast.show(this, "Block Auto Hide399: ${if (!current) "ON" else "OFF"}")
}

// v399: Boost Mode Enabled399
internal fun PlayerActivity.showV399BoostModeEnabled399Toggle() {
    val current = BiliClient.prefs.v399boostModeEnabled399
    BiliClient.prefs.v399boostModeEnabled399 = !current
    AppToast.show(this, "Boost Mode Enabled399: ${if (!current) "ON" else "OFF"}")
}

// v399: Bot Auto Reply399
internal fun PlayerActivity.showV399BotAutoReply399Toggle() {
    val current = BiliClient.prefs.v399botAutoReply399
    BiliClient.prefs.v399botAutoReply399 = !current
    AppToast.show(this, "Bot Auto Reply399: ${if (!current) "ON" else "OFF"}")
}

// v399: Bubble Animation399
internal fun PlayerActivity.showV399BubbleAnimation399Toggle() {
    val current = BiliClient.prefs.v399bubbleAnimation399
    BiliClient.prefs.v399bubbleAnimation399 = !current
    AppToast.show(this, "Bubble Animation399: ${if (!current) "ON" else "OFF"}")
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
}

// v399: Calendar Sync Enabled399
internal fun PlayerActivity.showV399CalendarSyncEnabled399Toggle() {
    val current = BiliClient.prefs.v399calendarSyncEnabled399
    BiliClient.prefs.v399calendarSyncEnabled399 = !current
    AppToast.show(this, "Calendar Sync Enabled399: ${if (!current) "ON" else "OFF"}")
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
}

// v399: Chat Auto Scroll399
internal fun PlayerActivity.showV399ChatAutoScroll399Toggle() {
    val current = BiliClient.prefs.v399chatAutoScroll399
    BiliClient.prefs.v399chatAutoScroll399 = !current
    AppToast.show(this, "Chat Auto Scroll399: ${if (!current) "ON" else "OFF"}")
}

// v400: AI Auto Tag Generate400
internal fun PlayerActivity.showV400AiAutoTagGenerate400Toggle() {
    val current = BiliClient.prefs.v400aiAutoTagGenerate400
    BiliClient.prefs.v400aiAutoTagGenerate400 = !current
    AppToast.show(this, "AI Auto Tag Generate400: ${if (!current) "ON" else "OFF"}")
}

// v400: AI Smart Recommend400
internal fun PlayerActivity.showV400AiSmartRecommend400Toggle() {
    val current = BiliClient.prefs.v400aiSmartRecommend400
    BiliClient.prefs.v400aiSmartRecommend400 = !current
    AppToast.show(this, "AI Smart Recommend400: ${if (!current) "ON" else "OFF"}")
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
}

// v400: Banner Auto Rotate400
internal fun PlayerActivity.showV400BannerAutoRotate400Toggle() {
    val current = BiliClient.prefs.v400bannerAutoRotate400
    BiliClient.prefs.v400bannerAutoRotate400 = !current
    AppToast.show(this, "Banner Auto Rotate400: ${if (!current) "ON" else "OFF"}")
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
}

// v400: Batch Operation Confirm400
internal fun PlayerActivity.showV400BatchOperationConfirm400Toggle() {
    val current = BiliClient.prefs.v400batchOperationConfirm400
    BiliClient.prefs.v400batchOperationConfirm400 = !current
    AppToast.show(this, "Batch Operation Confirm400: ${if (!current) "ON" else "OFF"}")
}

// v400: Block Auto Hide400
internal fun PlayerActivity.showV400BlockAutoHide400Toggle() {
    val current = BiliClient.prefs.v400blockAutoHide400
    BiliClient.prefs.v400blockAutoHide400 = !current
    AppToast.show(this, "Block Auto Hide400: ${if (!current) "ON" else "OFF"}")
}

// v400: Boost Mode Enabled400
internal fun PlayerActivity.showV400BoostModeEnabled400Toggle() {
    val current = BiliClient.prefs.v400boostModeEnabled400
    BiliClient.prefs.v400boostModeEnabled400 = !current
    AppToast.show(this, "Boost Mode Enabled400: ${if (!current) "ON" else "OFF"}")
}

// v400: Bot Auto Reply400
internal fun PlayerActivity.showV400BotAutoReply400Toggle() {
    val current = BiliClient.prefs.v400botAutoReply400
    BiliClient.prefs.v400botAutoReply400 = !current
    AppToast.show(this, "Bot Auto Reply400: ${if (!current) "ON" else "OFF"}")
}

// v400: Bubble Animation400
internal fun PlayerActivity.showV400BubbleAnimation400Toggle() {
    val current = BiliClient.prefs.v400bubbleAnimation400
    BiliClient.prefs.v400bubbleAnimation400 = !current
    AppToast.show(this, "Bubble Animation400: ${if (!current) "ON" else "OFF"}")
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
}

// v400: Calendar Sync Enabled400
internal fun PlayerActivity.showV400CalendarSyncEnabled400Toggle() {
    val current = BiliClient.prefs.v400calendarSyncEnabled400
    BiliClient.prefs.v400calendarSyncEnabled400 = !current
    AppToast.show(this, "Calendar Sync Enabled400: ${if (!current) "ON" else "OFF"}")
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
}

// v400: Chat Auto Scroll400
internal fun PlayerActivity.showV400ChatAutoScroll400Toggle() {
    val current = BiliClient.prefs.v400chatAutoScroll400
    BiliClient.prefs.v400chatAutoScroll400 = !current
    AppToast.show(this, "Chat Auto Scroll400: ${if (!current) "ON" else "OFF"}")
}

// v401: Cloud Auto Sync401
internal fun PlayerActivity.showV401CloudAutoSync401Toggle() {
    val current = BiliClient.prefs.v401cloudAutoSync401
    BiliClient.prefs.v401cloudAutoSync401 = !current
    AppToast.show(this, "Cloud Auto Sync401: ${if (!current) "ON" else "OFF"}")
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
}

// v401: Collect Auto Categorize401
internal fun PlayerActivity.showV401CollectAutoCategorize401Toggle() {
    val current = BiliClient.prefs.v401collectAutoCategorize401
    BiliClient.prefs.v401collectAutoCategorize401 = !current
    AppToast.show(this, "Collect Auto Categorize401: ${if (!current) "ON" else "OFF"}")
}

// v401: Compact Mode Enabled401
internal fun PlayerActivity.showV401CompactModeEnabled401Toggle() {
    val current = BiliClient.prefs.v401compactModeEnabled401
    BiliClient.prefs.v401compactModeEnabled401 = !current
    AppToast.show(this, "Compact Mode Enabled401: ${if (!current) "ON" else "OFF"}")
}

// v401: Compress Auto Quality401
internal fun PlayerActivity.showV401CompressAutoQuality401Toggle() {
    val current = BiliClient.prefs.v401compressAutoQuality401
    BiliClient.prefs.v401compressAutoQuality401 = !current
    AppToast.show(this, "Compress Auto Quality401: ${if (!current) "ON" else "OFF"}")
}

// v401: Connect Auto Retry401
internal fun PlayerActivity.showV401ConnectAutoRetry401Toggle() {
    val current = BiliClient.prefs.v401connectAutoRetry401
    BiliClient.prefs.v401connectAutoRetry401 = !current
    AppToast.show(this, "Connect Auto Retry401: ${if (!current) "ON" else "OFF"}")
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
}

// v401: Debug Log Verbose401
internal fun PlayerActivity.showV401DebugLogVerbose401Toggle() {
    val current = BiliClient.prefs.v401debugLogVerbose401
    BiliClient.prefs.v401debugLogVerbose401 = !current
    AppToast.show(this, "Debug Log Verbose401: ${if (!current) "ON" else "OFF"}")
}

// v401: Deep Color Enabled401
internal fun PlayerActivity.showV401DeepColorEnabled401Toggle() {
    val current = BiliClient.prefs.v401deepColorEnabled401
    BiliClient.prefs.v401deepColorEnabled401 = !current
    AppToast.show(this, "Deep Color Enabled401: ${if (!current) "ON" else "OFF"}")
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
}

// v401: Density Auto Adjust401
internal fun PlayerActivity.showV401DensityAutoAdjust401Toggle() {
    val current = BiliClient.prefs.v401densityAutoAdjust401
    BiliClient.prefs.v401densityAutoAdjust401 = !current
    AppToast.show(this, "Density Auto Adjust401: ${if (!current) "ON" else "OFF"}")
}

// v401: Deploy Auto Update401
internal fun PlayerActivity.showV401DeployAutoUpdate401Toggle() {
    val current = BiliClient.prefs.v401deployAutoUpdate401
    BiliClient.prefs.v401deployAutoUpdate401 = !current
    AppToast.show(this, "Deploy Auto Update401: ${if (!current) "ON" else "OFF"}")
}

// v401: Detect Motion Enabled401
internal fun PlayerActivity.showV401DetectMotionEnabled401Toggle() {
    val current = BiliClient.prefs.v401detectMotionEnabled401
    BiliClient.prefs.v401detectMotionEnabled401 = !current
    AppToast.show(this, "Detect Motion Enabled401: ${if (!current) "ON" else "OFF"}")
}

// v401: Dim Screen On Idle401
internal fun PlayerActivity.showV401DimScreenOnIdle401Toggle() {
    val current = BiliClient.prefs.v401dimScreenOnIdle401
    BiliClient.prefs.v401dimScreenOnIdle401 = !current
    AppToast.show(this, "Dim Screen On Idle401: ${if (!current) "ON" else "OFF"}")
}

// v402: Cloud Auto Sync402
internal fun PlayerActivity.showV402CloudAutoSync402Toggle() {
    val current = BiliClient.prefs.v402cloudAutoSync402
    BiliClient.prefs.v402cloudAutoSync402 = !current
    AppToast.show(this, "Cloud Auto Sync402: ${if (!current) "ON" else "OFF"}")
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
}

// v402: Collect Auto Categorize402
internal fun PlayerActivity.showV402CollectAutoCategorize402Toggle() {
    val current = BiliClient.prefs.v402collectAutoCategorize402
    BiliClient.prefs.v402collectAutoCategorize402 = !current
    AppToast.show(this, "Collect Auto Categorize402: ${if (!current) "ON" else "OFF"}")
}

// v402: Compact Mode Enabled402
internal fun PlayerActivity.showV402CompactModeEnabled402Toggle() {
    val current = BiliClient.prefs.v402compactModeEnabled402
    BiliClient.prefs.v402compactModeEnabled402 = !current
    AppToast.show(this, "Compact Mode Enabled402: ${if (!current) "ON" else "OFF"}")
}

// v402: Compress Auto Quality402
internal fun PlayerActivity.showV402CompressAutoQuality402Toggle() {
    val current = BiliClient.prefs.v402compressAutoQuality402
    BiliClient.prefs.v402compressAutoQuality402 = !current
    AppToast.show(this, "Compress Auto Quality402: ${if (!current) "ON" else "OFF"}")
}

// v402: Connect Auto Retry402
internal fun PlayerActivity.showV402ConnectAutoRetry402Toggle() {
    val current = BiliClient.prefs.v402connectAutoRetry402
    BiliClient.prefs.v402connectAutoRetry402 = !current
    AppToast.show(this, "Connect Auto Retry402: ${if (!current) "ON" else "OFF"}")
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
}

// v402: Debug Log Verbose402
internal fun PlayerActivity.showV402DebugLogVerbose402Toggle() {
    val current = BiliClient.prefs.v402debugLogVerbose402
    BiliClient.prefs.v402debugLogVerbose402 = !current
    AppToast.show(this, "Debug Log Verbose402: ${if (!current) "ON" else "OFF"}")
}

// v402: Deep Color Enabled402
internal fun PlayerActivity.showV402DeepColorEnabled402Toggle() {
    val current = BiliClient.prefs.v402deepColorEnabled402
    BiliClient.prefs.v402deepColorEnabled402 = !current
    AppToast.show(this, "Deep Color Enabled402: ${if (!current) "ON" else "OFF"}")
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
}

// v402: Density Auto Adjust402
internal fun PlayerActivity.showV402DensityAutoAdjust402Toggle() {
    val current = BiliClient.prefs.v402densityAutoAdjust402
    BiliClient.prefs.v402densityAutoAdjust402 = !current
    AppToast.show(this, "Density Auto Adjust402: ${if (!current) "ON" else "OFF"}")
}

// v402: Deploy Auto Update402
internal fun PlayerActivity.showV402DeployAutoUpdate402Toggle() {
    val current = BiliClient.prefs.v402deployAutoUpdate402
    BiliClient.prefs.v402deployAutoUpdate402 = !current
    AppToast.show(this, "Deploy Auto Update402: ${if (!current) "ON" else "OFF"}")
}

// v402: Detect Motion Enabled402
internal fun PlayerActivity.showV402DetectMotionEnabled402Toggle() {
    val current = BiliClient.prefs.v402detectMotionEnabled402
    BiliClient.prefs.v402detectMotionEnabled402 = !current
    AppToast.show(this, "Detect Motion Enabled402: ${if (!current) "ON" else "OFF"}")
}

// v402: Dim Screen On Idle402
internal fun PlayerActivity.showV402DimScreenOnIdle402Toggle() {
    val current = BiliClient.prefs.v402dimScreenOnIdle402
    BiliClient.prefs.v402dimScreenOnIdle402 = !current
    AppToast.show(this, "Dim Screen On Idle402: ${if (!current) "ON" else "OFF"}")
}

// v403: Cloud Auto Sync403
internal fun PlayerActivity.showV403CloudAutoSync403Toggle() {
    val current = BiliClient.prefs.v403cloudAutoSync403
    BiliClient.prefs.v403cloudAutoSync403 = !current
    AppToast.show(this, "Cloud Auto Sync403: ${if (!current) "ON" else "OFF"}")
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
}

// v403: Collect Auto Categorize403
internal fun PlayerActivity.showV403CollectAutoCategorize403Toggle() {
    val current = BiliClient.prefs.v403collectAutoCategorize403
    BiliClient.prefs.v403collectAutoCategorize403 = !current
    AppToast.show(this, "Collect Auto Categorize403: ${if (!current) "ON" else "OFF"}")
}

// v403: Compact Mode Enabled403
internal fun PlayerActivity.showV403CompactModeEnabled403Toggle() {
    val current = BiliClient.prefs.v403compactModeEnabled403
    BiliClient.prefs.v403compactModeEnabled403 = !current
    AppToast.show(this, "Compact Mode Enabled403: ${if (!current) "ON" else "OFF"}")
}

// v403: Compress Auto Quality403
internal fun PlayerActivity.showV403CompressAutoQuality403Toggle() {
    val current = BiliClient.prefs.v403compressAutoQuality403
    BiliClient.prefs.v403compressAutoQuality403 = !current
    AppToast.show(this, "Compress Auto Quality403: ${if (!current) "ON" else "OFF"}")
}

// v403: Connect Auto Retry403
internal fun PlayerActivity.showV403ConnectAutoRetry403Toggle() {
    val current = BiliClient.prefs.v403connectAutoRetry403
    BiliClient.prefs.v403connectAutoRetry403 = !current
    AppToast.show(this, "Connect Auto Retry403: ${if (!current) "ON" else "OFF"}")
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
}

// v403: Debug Log Verbose403
internal fun PlayerActivity.showV403DebugLogVerbose403Toggle() {
    val current = BiliClient.prefs.v403debugLogVerbose403
    BiliClient.prefs.v403debugLogVerbose403 = !current
    AppToast.show(this, "Debug Log Verbose403: ${if (!current) "ON" else "OFF"}")
}

// v403: Deep Color Enabled403
internal fun PlayerActivity.showV403DeepColorEnabled403Toggle() {
    val current = BiliClient.prefs.v403deepColorEnabled403
    BiliClient.prefs.v403deepColorEnabled403 = !current
    AppToast.show(this, "Deep Color Enabled403: ${if (!current) "ON" else "OFF"}")
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
}

// v403: Density Auto Adjust403
internal fun PlayerActivity.showV403DensityAutoAdjust403Toggle() {
    val current = BiliClient.prefs.v403densityAutoAdjust403
    BiliClient.prefs.v403densityAutoAdjust403 = !current
    AppToast.show(this, "Density Auto Adjust403: ${if (!current) "ON" else "OFF"}")
}

// v403: Deploy Auto Update403
internal fun PlayerActivity.showV403DeployAutoUpdate403Toggle() {
    val current = BiliClient.prefs.v403deployAutoUpdate403
    BiliClient.prefs.v403deployAutoUpdate403 = !current
    AppToast.show(this, "Deploy Auto Update403: ${if (!current) "ON" else "OFF"}")
}

// v403: Detect Motion Enabled403
internal fun PlayerActivity.showV403DetectMotionEnabled403Toggle() {
    val current = BiliClient.prefs.v403detectMotionEnabled403
    BiliClient.prefs.v403detectMotionEnabled403 = !current
    AppToast.show(this, "Detect Motion Enabled403: ${if (!current) "ON" else "OFF"}")
}

// v403: Dim Screen On Idle403
internal fun PlayerActivity.showV403DimScreenOnIdle403Toggle() {
    val current = BiliClient.prefs.v403dimScreenOnIdle403
    BiliClient.prefs.v403dimScreenOnIdle403 = !current
    AppToast.show(this, "Dim Screen On Idle403: ${if (!current) "ON" else "OFF"}")
}

// v404: Cloud Auto Sync404
internal fun PlayerActivity.showV404CloudAutoSync404Toggle() {
    val current = BiliClient.prefs.v404cloudAutoSync404
    BiliClient.prefs.v404cloudAutoSync404 = !current
    AppToast.show(this, "Cloud Auto Sync404: ${if (!current) "ON" else "OFF"}")
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
}

// v404: Collect Auto Categorize404
internal fun PlayerActivity.showV404CollectAutoCategorize404Toggle() {
    val current = BiliClient.prefs.v404collectAutoCategorize404
    BiliClient.prefs.v404collectAutoCategorize404 = !current
    AppToast.show(this, "Collect Auto Categorize404: ${if (!current) "ON" else "OFF"}")
}

// v404: Compact Mode Enabled404
internal fun PlayerActivity.showV404CompactModeEnabled404Toggle() {
    val current = BiliClient.prefs.v404compactModeEnabled404
    BiliClient.prefs.v404compactModeEnabled404 = !current
    AppToast.show(this, "Compact Mode Enabled404: ${if (!current) "ON" else "OFF"}")
}

// v404: Compress Auto Quality404
internal fun PlayerActivity.showV404CompressAutoQuality404Toggle() {
    val current = BiliClient.prefs.v404compressAutoQuality404
    BiliClient.prefs.v404compressAutoQuality404 = !current
    AppToast.show(this, "Compress Auto Quality404: ${if (!current) "ON" else "OFF"}")
}

// v404: Connect Auto Retry404
internal fun PlayerActivity.showV404ConnectAutoRetry404Toggle() {
    val current = BiliClient.prefs.v404connectAutoRetry404
    BiliClient.prefs.v404connectAutoRetry404 = !current
    AppToast.show(this, "Connect Auto Retry404: ${if (!current) "ON" else "OFF"}")
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
}

// v404: Debug Log Verbose404
internal fun PlayerActivity.showV404DebugLogVerbose404Toggle() {
    val current = BiliClient.prefs.v404debugLogVerbose404
    BiliClient.prefs.v404debugLogVerbose404 = !current
    AppToast.show(this, "Debug Log Verbose404: ${if (!current) "ON" else "OFF"}")
}

// v404: Deep Color Enabled404
internal fun PlayerActivity.showV404DeepColorEnabled404Toggle() {
    val current = BiliClient.prefs.v404deepColorEnabled404
    BiliClient.prefs.v404deepColorEnabled404 = !current
    AppToast.show(this, "Deep Color Enabled404: ${if (!current) "ON" else "OFF"}")
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
}

// v404: Density Auto Adjust404
internal fun PlayerActivity.showV404DensityAutoAdjust404Toggle() {
    val current = BiliClient.prefs.v404densityAutoAdjust404
    BiliClient.prefs.v404densityAutoAdjust404 = !current
    AppToast.show(this, "Density Auto Adjust404: ${if (!current) "ON" else "OFF"}")
}

// v404: Deploy Auto Update404
internal fun PlayerActivity.showV404DeployAutoUpdate404Toggle() {
    val current = BiliClient.prefs.v404deployAutoUpdate404
    BiliClient.prefs.v404deployAutoUpdate404 = !current
    AppToast.show(this, "Deploy Auto Update404: ${if (!current) "ON" else "OFF"}")
}

// v404: Detect Motion Enabled404
internal fun PlayerActivity.showV404DetectMotionEnabled404Toggle() {
    val current = BiliClient.prefs.v404detectMotionEnabled404
    BiliClient.prefs.v404detectMotionEnabled404 = !current
    AppToast.show(this, "Detect Motion Enabled404: ${if (!current) "ON" else "OFF"}")
}

// v404: Dim Screen On Idle404
internal fun PlayerActivity.showV404DimScreenOnIdle404Toggle() {
    val current = BiliClient.prefs.v404dimScreenOnIdle404
    BiliClient.prefs.v404dimScreenOnIdle404 = !current
    AppToast.show(this, "Dim Screen On Idle404: ${if (!current) "ON" else "OFF"}")
}

// v405: Cloud Auto Sync405
internal fun PlayerActivity.showV405CloudAutoSync405Toggle() {
    val current = BiliClient.prefs.v405cloudAutoSync405
    BiliClient.prefs.v405cloudAutoSync405 = !current
    AppToast.show(this, "Cloud Auto Sync405: ${if (!current) "ON" else "OFF"}")
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
}

// v405: Collect Auto Categorize405
internal fun PlayerActivity.showV405CollectAutoCategorize405Toggle() {
    val current = BiliClient.prefs.v405collectAutoCategorize405
    BiliClient.prefs.v405collectAutoCategorize405 = !current
    AppToast.show(this, "Collect Auto Categorize405: ${if (!current) "ON" else "OFF"}")
}

// v405: Compact Mode Enabled405
internal fun PlayerActivity.showV405CompactModeEnabled405Toggle() {
    val current = BiliClient.prefs.v405compactModeEnabled405
    BiliClient.prefs.v405compactModeEnabled405 = !current
    AppToast.show(this, "Compact Mode Enabled405: ${if (!current) "ON" else "OFF"}")
}

// v405: Compress Auto Quality405
internal fun PlayerActivity.showV405CompressAutoQuality405Toggle() {
    val current = BiliClient.prefs.v405compressAutoQuality405
    BiliClient.prefs.v405compressAutoQuality405 = !current
    AppToast.show(this, "Compress Auto Quality405: ${if (!current) "ON" else "OFF"}")
}

// v405: Connect Auto Retry405
internal fun PlayerActivity.showV405ConnectAutoRetry405Toggle() {
    val current = BiliClient.prefs.v405connectAutoRetry405
    BiliClient.prefs.v405connectAutoRetry405 = !current
    AppToast.show(this, "Connect Auto Retry405: ${if (!current) "ON" else "OFF"}")
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
}

// v405: Debug Log Verbose405
internal fun PlayerActivity.showV405DebugLogVerbose405Toggle() {
    val current = BiliClient.prefs.v405debugLogVerbose405
    BiliClient.prefs.v405debugLogVerbose405 = !current
    AppToast.show(this, "Debug Log Verbose405: ${if (!current) "ON" else "OFF"}")
}

// v405: Deep Color Enabled405
internal fun PlayerActivity.showV405DeepColorEnabled405Toggle() {
    val current = BiliClient.prefs.v405deepColorEnabled405
    BiliClient.prefs.v405deepColorEnabled405 = !current
    AppToast.show(this, "Deep Color Enabled405: ${if (!current) "ON" else "OFF"}")
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
}

// v405: Density Auto Adjust405
internal fun PlayerActivity.showV405DensityAutoAdjust405Toggle() {
    val current = BiliClient.prefs.v405densityAutoAdjust405
    BiliClient.prefs.v405densityAutoAdjust405 = !current
    AppToast.show(this, "Density Auto Adjust405: ${if (!current) "ON" else "OFF"}")
}

// v405: Deploy Auto Update405
internal fun PlayerActivity.showV405DeployAutoUpdate405Toggle() {
    val current = BiliClient.prefs.v405deployAutoUpdate405
    BiliClient.prefs.v405deployAutoUpdate405 = !current
    AppToast.show(this, "Deploy Auto Update405: ${if (!current) "ON" else "OFF"}")
}

// v405: Detect Motion Enabled405
internal fun PlayerActivity.showV405DetectMotionEnabled405Toggle() {
    val current = BiliClient.prefs.v405detectMotionEnabled405
    BiliClient.prefs.v405detectMotionEnabled405 = !current
    AppToast.show(this, "Detect Motion Enabled405: ${if (!current) "ON" else "OFF"}")
}

// v405: Dim Screen On Idle405
internal fun PlayerActivity.showV405DimScreenOnIdle405Toggle() {
    val current = BiliClient.prefs.v405dimScreenOnIdle405
    BiliClient.prefs.v405dimScreenOnIdle405 = !current
    AppToast.show(this, "Dim Screen On Idle405: ${if (!current) "ON" else "OFF"}")
}

// v406: Cloud Auto Sync406
internal fun PlayerActivity.showV406CloudAutoSync406Toggle() {
    val current = BiliClient.prefs.v406cloudAutoSync406
    BiliClient.prefs.v406cloudAutoSync406 = !current
    AppToast.show(this, "Cloud Auto Sync406: ${if (!current) "ON" else "OFF"}")
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
}

// v406: Collect Auto Categorize406
internal fun PlayerActivity.showV406CollectAutoCategorize406Toggle() {
    val current = BiliClient.prefs.v406collectAutoCategorize406
    BiliClient.prefs.v406collectAutoCategorize406 = !current
    AppToast.show(this, "Collect Auto Categorize406: ${if (!current) "ON" else "OFF"}")
}

// v406: Compact Mode Enabled406
internal fun PlayerActivity.showV406CompactModeEnabled406Toggle() {
    val current = BiliClient.prefs.v406compactModeEnabled406
    BiliClient.prefs.v406compactModeEnabled406 = !current
    AppToast.show(this, "Compact Mode Enabled406: ${if (!current) "ON" else "OFF"}")
}

// v406: Compress Auto Quality406
internal fun PlayerActivity.showV406CompressAutoQuality406Toggle() {
    val current = BiliClient.prefs.v406compressAutoQuality406
    BiliClient.prefs.v406compressAutoQuality406 = !current
    AppToast.show(this, "Compress Auto Quality406: ${if (!current) "ON" else "OFF"}")
}

// v406: Connect Auto Retry406
internal fun PlayerActivity.showV406ConnectAutoRetry406Toggle() {
    val current = BiliClient.prefs.v406connectAutoRetry406
    BiliClient.prefs.v406connectAutoRetry406 = !current
    AppToast.show(this, "Connect Auto Retry406: ${if (!current) "ON" else "OFF"}")
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
}

// v406: Debug Log Verbose406
internal fun PlayerActivity.showV406DebugLogVerbose406Toggle() {
    val current = BiliClient.prefs.v406debugLogVerbose406
    BiliClient.prefs.v406debugLogVerbose406 = !current
    AppToast.show(this, "Debug Log Verbose406: ${if (!current) "ON" else "OFF"}")
}

// v406: Deep Color Enabled406
internal fun PlayerActivity.showV406DeepColorEnabled406Toggle() {
    val current = BiliClient.prefs.v406deepColorEnabled406
    BiliClient.prefs.v406deepColorEnabled406 = !current
    AppToast.show(this, "Deep Color Enabled406: ${if (!current) "ON" else "OFF"}")
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
}

// v406: Density Auto Adjust406
internal fun PlayerActivity.showV406DensityAutoAdjust406Toggle() {
    val current = BiliClient.prefs.v406densityAutoAdjust406
    BiliClient.prefs.v406densityAutoAdjust406 = !current
    AppToast.show(this, "Density Auto Adjust406: ${if (!current) "ON" else "OFF"}")
}

// v406: Deploy Auto Update406
internal fun PlayerActivity.showV406DeployAutoUpdate406Toggle() {
    val current = BiliClient.prefs.v406deployAutoUpdate406
    BiliClient.prefs.v406deployAutoUpdate406 = !current
    AppToast.show(this, "Deploy Auto Update406: ${if (!current) "ON" else "OFF"}")
}

// v406: Detect Motion Enabled406
internal fun PlayerActivity.showV406DetectMotionEnabled406Toggle() {
    val current = BiliClient.prefs.v406detectMotionEnabled406
    BiliClient.prefs.v406detectMotionEnabled406 = !current
    AppToast.show(this, "Detect Motion Enabled406: ${if (!current) "ON" else "OFF"}")
}

// v406: Dim Screen On Idle406
internal fun PlayerActivity.showV406DimScreenOnIdle406Toggle() {
    val current = BiliClient.prefs.v406dimScreenOnIdle406
    BiliClient.prefs.v406dimScreenOnIdle406 = !current
    AppToast.show(this, "Dim Screen On Idle406: ${if (!current) "ON" else "OFF"}")
}

// v407: Cloud Auto Sync407
internal fun PlayerActivity.showV407CloudAutoSync407Toggle() {
    val current = BiliClient.prefs.v407cloudAutoSync407
    BiliClient.prefs.v407cloudAutoSync407 = !current
    AppToast.show(this, "Cloud Auto Sync407: ${if (!current) "ON" else "OFF"}")
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
}

// v407: Collect Auto Categorize407
internal fun PlayerActivity.showV407CollectAutoCategorize407Toggle() {
    val current = BiliClient.prefs.v407collectAutoCategorize407
    BiliClient.prefs.v407collectAutoCategorize407 = !current
    AppToast.show(this, "Collect Auto Categorize407: ${if (!current) "ON" else "OFF"}")
}

// v407: Compact Mode Enabled407
internal fun PlayerActivity.showV407CompactModeEnabled407Toggle() {
    val current = BiliClient.prefs.v407compactModeEnabled407
    BiliClient.prefs.v407compactModeEnabled407 = !current
    AppToast.show(this, "Compact Mode Enabled407: ${if (!current) "ON" else "OFF"}")
}

// v407: Compress Auto Quality407
internal fun PlayerActivity.showV407CompressAutoQuality407Toggle() {
    val current = BiliClient.prefs.v407compressAutoQuality407
    BiliClient.prefs.v407compressAutoQuality407 = !current
    AppToast.show(this, "Compress Auto Quality407: ${if (!current) "ON" else "OFF"}")
}

// v407: Connect Auto Retry407
internal fun PlayerActivity.showV407ConnectAutoRetry407Toggle() {
    val current = BiliClient.prefs.v407connectAutoRetry407
    BiliClient.prefs.v407connectAutoRetry407 = !current
    AppToast.show(this, "Connect Auto Retry407: ${if (!current) "ON" else "OFF"}")
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
}

// v407: Debug Log Verbose407
internal fun PlayerActivity.showV407DebugLogVerbose407Toggle() {
    val current = BiliClient.prefs.v407debugLogVerbose407
    BiliClient.prefs.v407debugLogVerbose407 = !current
    AppToast.show(this, "Debug Log Verbose407: ${if (!current) "ON" else "OFF"}")
}

// v407: Deep Color Enabled407
internal fun PlayerActivity.showV407DeepColorEnabled407Toggle() {
    val current = BiliClient.prefs.v407deepColorEnabled407
    BiliClient.prefs.v407deepColorEnabled407 = !current
    AppToast.show(this, "Deep Color Enabled407: ${if (!current) "ON" else "OFF"}")
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
}

// v407: Density Auto Adjust407
internal fun PlayerActivity.showV407DensityAutoAdjust407Toggle() {
    val current = BiliClient.prefs.v407densityAutoAdjust407
    BiliClient.prefs.v407densityAutoAdjust407 = !current
    AppToast.show(this, "Density Auto Adjust407: ${if (!current) "ON" else "OFF"}")
}

// v407: Deploy Auto Update407
internal fun PlayerActivity.showV407DeployAutoUpdate407Toggle() {
    val current = BiliClient.prefs.v407deployAutoUpdate407
    BiliClient.prefs.v407deployAutoUpdate407 = !current
    AppToast.show(this, "Deploy Auto Update407: ${if (!current) "ON" else "OFF"}")
}

// v407: Detect Motion Enabled407
internal fun PlayerActivity.showV407DetectMotionEnabled407Toggle() {
    val current = BiliClient.prefs.v407detectMotionEnabled407
    BiliClient.prefs.v407detectMotionEnabled407 = !current
    AppToast.show(this, "Detect Motion Enabled407: ${if (!current) "ON" else "OFF"}")
}

// v407: Dim Screen On Idle407
internal fun PlayerActivity.showV407DimScreenOnIdle407Toggle() {
    val current = BiliClient.prefs.v407dimScreenOnIdle407
    BiliClient.prefs.v407dimScreenOnIdle407 = !current
    AppToast.show(this, "Dim Screen On Idle407: ${if (!current) "ON" else "OFF"}")
}

// v408: Cloud Auto Sync408
internal fun PlayerActivity.showV408CloudAutoSync408Toggle() {
    val current = BiliClient.prefs.v408cloudAutoSync408
    BiliClient.prefs.v408cloudAutoSync408 = !current
    AppToast.show(this, "Cloud Auto Sync408: ${if (!current) "ON" else "OFF"}")
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
}

// v408: Collect Auto Categorize408
internal fun PlayerActivity.showV408CollectAutoCategorize408Toggle() {
    val current = BiliClient.prefs.v408collectAutoCategorize408
    BiliClient.prefs.v408collectAutoCategorize408 = !current
    AppToast.show(this, "Collect Auto Categorize408: ${if (!current) "ON" else "OFF"}")
}

// v408: Compact Mode Enabled408
internal fun PlayerActivity.showV408CompactModeEnabled408Toggle() {
    val current = BiliClient.prefs.v408compactModeEnabled408
    BiliClient.prefs.v408compactModeEnabled408 = !current
    AppToast.show(this, "Compact Mode Enabled408: ${if (!current) "ON" else "OFF"}")
}

// v408: Compress Auto Quality408
internal fun PlayerActivity.showV408CompressAutoQuality408Toggle() {
    val current = BiliClient.prefs.v408compressAutoQuality408
    BiliClient.prefs.v408compressAutoQuality408 = !current
    AppToast.show(this, "Compress Auto Quality408: ${if (!current) "ON" else "OFF"}")
}

// v408: Connect Auto Retry408
internal fun PlayerActivity.showV408ConnectAutoRetry408Toggle() {
    val current = BiliClient.prefs.v408connectAutoRetry408
    BiliClient.prefs.v408connectAutoRetry408 = !current
    AppToast.show(this, "Connect Auto Retry408: ${if (!current) "ON" else "OFF"}")
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
}

// v408: Debug Log Verbose408
internal fun PlayerActivity.showV408DebugLogVerbose408Toggle() {
    val current = BiliClient.prefs.v408debugLogVerbose408
    BiliClient.prefs.v408debugLogVerbose408 = !current
    AppToast.show(this, "Debug Log Verbose408: ${if (!current) "ON" else "OFF"}")
}

// v408: Deep Color Enabled408
internal fun PlayerActivity.showV408DeepColorEnabled408Toggle() {
    val current = BiliClient.prefs.v408deepColorEnabled408
    BiliClient.prefs.v408deepColorEnabled408 = !current
    AppToast.show(this, "Deep Color Enabled408: ${if (!current) "ON" else "OFF"}")
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
}

// v408: Density Auto Adjust408
internal fun PlayerActivity.showV408DensityAutoAdjust408Toggle() {
    val current = BiliClient.prefs.v408densityAutoAdjust408
    BiliClient.prefs.v408densityAutoAdjust408 = !current
    AppToast.show(this, "Density Auto Adjust408: ${if (!current) "ON" else "OFF"}")
}

// v408: Deploy Auto Update408
internal fun PlayerActivity.showV408DeployAutoUpdate408Toggle() {
    val current = BiliClient.prefs.v408deployAutoUpdate408
    BiliClient.prefs.v408deployAutoUpdate408 = !current
    AppToast.show(this, "Deploy Auto Update408: ${if (!current) "ON" else "OFF"}")
}

// v408: Detect Motion Enabled408
internal fun PlayerActivity.showV408DetectMotionEnabled408Toggle() {
    val current = BiliClient.prefs.v408detectMotionEnabled408
    BiliClient.prefs.v408detectMotionEnabled408 = !current
    AppToast.show(this, "Detect Motion Enabled408: ${if (!current) "ON" else "OFF"}")
}

// v408: Dim Screen On Idle408
internal fun PlayerActivity.showV408DimScreenOnIdle408Toggle() {
    val current = BiliClient.prefs.v408dimScreenOnIdle408
    BiliClient.prefs.v408dimScreenOnIdle408 = !current
    AppToast.show(this, "Dim Screen On Idle408: ${if (!current) "ON" else "OFF"}")
}

// v409: Cloud Auto Sync409
internal fun PlayerActivity.showV409CloudAutoSync409Toggle() {
    val current = BiliClient.prefs.v409cloudAutoSync409
    BiliClient.prefs.v409cloudAutoSync409 = !current
    AppToast.show(this, "Cloud Auto Sync409: ${if (!current) "ON" else "OFF"}")
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
}

// v409: Collect Auto Categorize409
internal fun PlayerActivity.showV409CollectAutoCategorize409Toggle() {
    val current = BiliClient.prefs.v409collectAutoCategorize409
    BiliClient.prefs.v409collectAutoCategorize409 = !current
    AppToast.show(this, "Collect Auto Categorize409: ${if (!current) "ON" else "OFF"}")
}

// v409: Compact Mode Enabled409
internal fun PlayerActivity.showV409CompactModeEnabled409Toggle() {
    val current = BiliClient.prefs.v409compactModeEnabled409
    BiliClient.prefs.v409compactModeEnabled409 = !current
    AppToast.show(this, "Compact Mode Enabled409: ${if (!current) "ON" else "OFF"}")
}

// v409: Compress Auto Quality409
internal fun PlayerActivity.showV409CompressAutoQuality409Toggle() {
    val current = BiliClient.prefs.v409compressAutoQuality409
    BiliClient.prefs.v409compressAutoQuality409 = !current
    AppToast.show(this, "Compress Auto Quality409: ${if (!current) "ON" else "OFF"}")
}

// v409: Connect Auto Retry409
internal fun PlayerActivity.showV409ConnectAutoRetry409Toggle() {
    val current = BiliClient.prefs.v409connectAutoRetry409
    BiliClient.prefs.v409connectAutoRetry409 = !current
    AppToast.show(this, "Connect Auto Retry409: ${if (!current) "ON" else "OFF"}")
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
}

// v409: Debug Log Verbose409
internal fun PlayerActivity.showV409DebugLogVerbose409Toggle() {
    val current = BiliClient.prefs.v409debugLogVerbose409
    BiliClient.prefs.v409debugLogVerbose409 = !current
    AppToast.show(this, "Debug Log Verbose409: ${if (!current) "ON" else "OFF"}")
}

// v409: Deep Color Enabled409
internal fun PlayerActivity.showV409DeepColorEnabled409Toggle() {
    val current = BiliClient.prefs.v409deepColorEnabled409
    BiliClient.prefs.v409deepColorEnabled409 = !current
    AppToast.show(this, "Deep Color Enabled409: ${if (!current) "ON" else "OFF"}")
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
}

// v409: Density Auto Adjust409
internal fun PlayerActivity.showV409DensityAutoAdjust409Toggle() {
    val current = BiliClient.prefs.v409densityAutoAdjust409
    BiliClient.prefs.v409densityAutoAdjust409 = !current
    AppToast.show(this, "Density Auto Adjust409: ${if (!current) "ON" else "OFF"}")
}

// v409: Deploy Auto Update409
internal fun PlayerActivity.showV409DeployAutoUpdate409Toggle() {
    val current = BiliClient.prefs.v409deployAutoUpdate409
    BiliClient.prefs.v409deployAutoUpdate409 = !current
    AppToast.show(this, "Deploy Auto Update409: ${if (!current) "ON" else "OFF"}")
}

