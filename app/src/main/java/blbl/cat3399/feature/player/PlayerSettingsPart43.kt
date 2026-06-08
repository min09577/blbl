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

internal fun PlayerActivity.showV588VersionAutoCheck588Toggle() {
    val current = BiliClient.prefs.v588versionAutoCheck588
    BiliClient.prefs.v588versionAutoCheck588 = !current
    AppToast.show(this, "Version Auto Check588: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV588VirtualDisplay588Toggle() {
    val current = BiliClient.prefs.v588virtualDisplay588
    BiliClient.prefs.v588virtualDisplay588 = !current
    AppToast.show(this, "Virtual Display588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588VisibleAutoToggle588Toggle() {
    val current = BiliClient.prefs.v588visibleAutoToggle588
    BiliClient.prefs.v588visibleAutoToggle588 = !current
    AppToast.show(this, "Visible Auto Toggle588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588VoiceAutoRecognize588Toggle() {
    val current = BiliClient.prefs.v588voiceAutoRecognize588
    BiliClient.prefs.v588voiceAutoRecognize588 = !current
    AppToast.show(this, "Voice Auto Recognize588: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV588WarmAutoStart588Toggle() {
    val current = BiliClient.prefs.v588warmAutoStart588
    BiliClient.prefs.v588warmAutoStart588 = !current
    AppToast.show(this, "Warm Auto Start588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588WarningAutoAlert588Toggle() {
    val current = BiliClient.prefs.v588warningAutoAlert588
    BiliClient.prefs.v588warningAutoAlert588 = !current
    AppToast.show(this, "Warning Auto Alert588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588WatchAutoSync588Toggle() {
    val current = BiliClient.prefs.v588watchAutoSync588
    BiliClient.prefs.v588watchAutoSync588 = !current
    AppToast.show(this, "Watch Auto Sync588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589UpdateAutoDownload589Toggle() {
    val current = BiliClient.prefs.v589updateAutoDownload589
    BiliClient.prefs.v589updateAutoDownload589 = !current
    AppToast.show(this, "Update Auto Download589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589UploadAutoRetry589Toggle() {
    val current = BiliClient.prefs.v589uploadAutoRetry589
    BiliClient.prefs.v589uploadAutoRetry589 = !current
    AppToast.show(this, "Upload Auto Retry589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589UpscaleAutoEnhance589Toggle() {
    val current = BiliClient.prefs.v589upscaleAutoEnhance589
    BiliClient.prefs.v589upscaleAutoEnhance589 = !current
    AppToast.show(this, "Upscale Auto Enhance589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589UseAutoOptimize589Toggle() {
    val current = BiliClient.prefs.v589useAutoOptimize589
    BiliClient.prefs.v589useAutoOptimize589 = !current
    AppToast.show(this, "Use Auto Optimize589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589ValueAutoBind589Toggle() {
    val current = BiliClient.prefs.v589valueAutoBind589
    BiliClient.prefs.v589valueAutoBind589 = !current
    AppToast.show(this, "Value Auto Bind589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589VerifyAutoChecksum589Toggle() {
    val current = BiliClient.prefs.v589verifyAutoChecksum589
    BiliClient.prefs.v589verifyAutoChecksum589 = !current
    AppToast.show(this, "Verify Auto Checksum589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589VersionAutoCheck589Toggle() {
    val current = BiliClient.prefs.v589versionAutoCheck589
    BiliClient.prefs.v589versionAutoCheck589 = !current
    AppToast.show(this, "Version Auto Check589: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV589VirtualDisplay589Toggle() {
    val current = BiliClient.prefs.v589virtualDisplay589
    BiliClient.prefs.v589virtualDisplay589 = !current
    AppToast.show(this, "Virtual Display589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589VisibleAutoToggle589Toggle() {
    val current = BiliClient.prefs.v589visibleAutoToggle589
    BiliClient.prefs.v589visibleAutoToggle589 = !current
    AppToast.show(this, "Visible Auto Toggle589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589VoiceAutoRecognize589Toggle() {
    val current = BiliClient.prefs.v589voiceAutoRecognize589
    BiliClient.prefs.v589voiceAutoRecognize589 = !current
    AppToast.show(this, "Voice Auto Recognize589: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV589WarmAutoStart589Toggle() {
    val current = BiliClient.prefs.v589warmAutoStart589
    BiliClient.prefs.v589warmAutoStart589 = !current
    AppToast.show(this, "Warm Auto Start589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589WarningAutoAlert589Toggle() {
    val current = BiliClient.prefs.v589warningAutoAlert589
    BiliClient.prefs.v589warningAutoAlert589 = !current
    AppToast.show(this, "Warning Auto Alert589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV589WatchAutoSync589Toggle() {
    val current = BiliClient.prefs.v589watchAutoSync589
    BiliClient.prefs.v589watchAutoSync589 = !current
    AppToast.show(this, "Watch Auto Sync589: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590UpdateAutoDownload590Toggle() {
    val current = BiliClient.prefs.v590updateAutoDownload590
    BiliClient.prefs.v590updateAutoDownload590 = !current
    AppToast.show(this, "Update Auto Download590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590UploadAutoRetry590Toggle() {
    val current = BiliClient.prefs.v590uploadAutoRetry590
    BiliClient.prefs.v590uploadAutoRetry590 = !current
    AppToast.show(this, "Upload Auto Retry590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590UpscaleAutoEnhance590Toggle() {
    val current = BiliClient.prefs.v590upscaleAutoEnhance590
    BiliClient.prefs.v590upscaleAutoEnhance590 = !current
    AppToast.show(this, "Upscale Auto Enhance590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590UseAutoOptimize590Toggle() {
    val current = BiliClient.prefs.v590useAutoOptimize590
    BiliClient.prefs.v590useAutoOptimize590 = !current
    AppToast.show(this, "Use Auto Optimize590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590ValueAutoBind590Toggle() {
    val current = BiliClient.prefs.v590valueAutoBind590
    BiliClient.prefs.v590valueAutoBind590 = !current
    AppToast.show(this, "Value Auto Bind590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590VerifyAutoChecksum590Toggle() {
    val current = BiliClient.prefs.v590verifyAutoChecksum590
    BiliClient.prefs.v590verifyAutoChecksum590 = !current
    AppToast.show(this, "Verify Auto Checksum590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590VersionAutoCheck590Toggle() {
    val current = BiliClient.prefs.v590versionAutoCheck590
    BiliClient.prefs.v590versionAutoCheck590 = !current
    AppToast.show(this, "Version Auto Check590: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV590VirtualDisplay590Toggle() {
    val current = BiliClient.prefs.v590virtualDisplay590
    BiliClient.prefs.v590virtualDisplay590 = !current
    AppToast.show(this, "Virtual Display590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590VisibleAutoToggle590Toggle() {
    val current = BiliClient.prefs.v590visibleAutoToggle590
    BiliClient.prefs.v590visibleAutoToggle590 = !current
    AppToast.show(this, "Visible Auto Toggle590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590VoiceAutoRecognize590Toggle() {
    val current = BiliClient.prefs.v590voiceAutoRecognize590
    BiliClient.prefs.v590voiceAutoRecognize590 = !current
    AppToast.show(this, "Voice Auto Recognize590: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV590WarmAutoStart590Toggle() {
    val current = BiliClient.prefs.v590warmAutoStart590
    BiliClient.prefs.v590warmAutoStart590 = !current
    AppToast.show(this, "Warm Auto Start590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590WarningAutoAlert590Toggle() {
    val current = BiliClient.prefs.v590warningAutoAlert590
    BiliClient.prefs.v590warningAutoAlert590 = !current
    AppToast.show(this, "Warning Auto Alert590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV590WatchAutoSync590Toggle() {
    val current = BiliClient.prefs.v590watchAutoSync590
    BiliClient.prefs.v590watchAutoSync590 = !current
    AppToast.show(this, "Watch Auto Sync590: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591WebAutoRedirect591Toggle() {
    val current = BiliClient.prefs.v591webAutoRedirect591
    BiliClient.prefs.v591webAutoRedirect591 = !current
    AppToast.show(this, "Web Auto Redirect591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591WidgetAutoRefresh591Toggle() {
    val current = BiliClient.prefs.v591widgetAutoRefresh591
    BiliClient.prefs.v591widgetAutoRefresh591 = !current
    AppToast.show(this, "Widget Auto Refresh591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591WindowAutoSnap591Toggle() {
    val current = BiliClient.prefs.v591windowAutoSnap591
    BiliClient.prefs.v591windowAutoSnap591 = !current
    AppToast.show(this, "Window Auto Snap591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591WrapAutoBreak591Toggle() {
    val current = BiliClient.prefs.v591wrapAutoBreak591
    BiliClient.prefs.v591wrapAutoBreak591 = !current
    AppToast.show(this, "Wrap Auto Break591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591ZoneAutoDetect591Toggle() {
    val current = BiliClient.prefs.v591zoneAutoDetect591
    BiliClient.prefs.v591zoneAutoDetect591 = !current
    AppToast.show(this, "Zone Auto Detect591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591AnchorAutoPin591Toggle() {
    val current = BiliClient.prefs.v591anchorAutoPin591
    BiliClient.prefs.v591anchorAutoPin591 = !current
    AppToast.show(this, "Anchor Auto Pin591: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV591AttachAutoEmbed591Toggle() {
    val current = BiliClient.prefs.v591attachAutoEmbed591
    BiliClient.prefs.v591attachAutoEmbed591 = !current
    AppToast.show(this, "Attach Auto Embed591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591AudioAutoNormalize591Toggle() {
    val current = BiliClient.prefs.v591audioAutoNormalize591
    BiliClient.prefs.v591audioAutoNormalize591 = !current
    AppToast.show(this, "Audio Auto Normalize591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591AxisAutoAlign591Toggle() {
    val current = BiliClient.prefs.v591axisAutoAlign591
    BiliClient.prefs.v591axisAutoAlign591 = !current
    AppToast.show(this, "Axis Auto Align591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591BadgeAutoCount591Toggle() {
    val current = BiliClient.prefs.v591badgeAutoCount591
    BiliClient.prefs.v591badgeAutoCount591 = !current
    AppToast.show(this, "Badge Auto Count591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591BaselineAutoSync591Toggle() {
    val current = BiliClient.prefs.v591baselineAutoSync591
    BiliClient.prefs.v591baselineAutoSync591 = !current
    AppToast.show(this, "Baseline Auto Sync591: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV591BindAutoLink591Toggle() {
    val current = BiliClient.prefs.v591bindAutoLink591
    BiliClient.prefs.v591bindAutoLink591 = !current
    AppToast.show(this, "Bind Auto Link591: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV592WebAutoRedirect592Toggle() {
    val current = BiliClient.prefs.v592webAutoRedirect592
    BiliClient.prefs.v592webAutoRedirect592 = !current
    AppToast.show(this, "Web Auto Redirect592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592WidgetAutoRefresh592Toggle() {
    val current = BiliClient.prefs.v592widgetAutoRefresh592
    BiliClient.prefs.v592widgetAutoRefresh592 = !current
    AppToast.show(this, "Widget Auto Refresh592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592WindowAutoSnap592Toggle() {
    val current = BiliClient.prefs.v592windowAutoSnap592
    BiliClient.prefs.v592windowAutoSnap592 = !current
    AppToast.show(this, "Window Auto Snap592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592WrapAutoBreak592Toggle() {
    val current = BiliClient.prefs.v592wrapAutoBreak592
    BiliClient.prefs.v592wrapAutoBreak592 = !current
    AppToast.show(this, "Wrap Auto Break592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592ZoneAutoDetect592Toggle() {
    val current = BiliClient.prefs.v592zoneAutoDetect592
    BiliClient.prefs.v592zoneAutoDetect592 = !current
    AppToast.show(this, "Zone Auto Detect592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592AnchorAutoPin592Toggle() {
    val current = BiliClient.prefs.v592anchorAutoPin592
    BiliClient.prefs.v592anchorAutoPin592 = !current
    AppToast.show(this, "Anchor Auto Pin592: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV592AttachAutoEmbed592Toggle() {
    val current = BiliClient.prefs.v592attachAutoEmbed592
    BiliClient.prefs.v592attachAutoEmbed592 = !current
    AppToast.show(this, "Attach Auto Embed592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592AudioAutoNormalize592Toggle() {
    val current = BiliClient.prefs.v592audioAutoNormalize592
    BiliClient.prefs.v592audioAutoNormalize592 = !current
    AppToast.show(this, "Audio Auto Normalize592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592AxisAutoAlign592Toggle() {
    val current = BiliClient.prefs.v592axisAutoAlign592
    BiliClient.prefs.v592axisAutoAlign592 = !current
    AppToast.show(this, "Axis Auto Align592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592BadgeAutoCount592Toggle() {
    val current = BiliClient.prefs.v592badgeAutoCount592
    BiliClient.prefs.v592badgeAutoCount592 = !current
    AppToast.show(this, "Badge Auto Count592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592BaselineAutoSync592Toggle() {
    val current = BiliClient.prefs.v592baselineAutoSync592
    BiliClient.prefs.v592baselineAutoSync592 = !current
    AppToast.show(this, "Baseline Auto Sync592: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV592BindAutoLink592Toggle() {
    val current = BiliClient.prefs.v592bindAutoLink592
    BiliClient.prefs.v592bindAutoLink592 = !current
    AppToast.show(this, "Bind Auto Link592: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV593WebAutoRedirect593Toggle() {
    val current = BiliClient.prefs.v593webAutoRedirect593
    BiliClient.prefs.v593webAutoRedirect593 = !current
    AppToast.show(this, "Web Auto Redirect593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593WidgetAutoRefresh593Toggle() {
    val current = BiliClient.prefs.v593widgetAutoRefresh593
    BiliClient.prefs.v593widgetAutoRefresh593 = !current
    AppToast.show(this, "Widget Auto Refresh593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593WindowAutoSnap593Toggle() {
    val current = BiliClient.prefs.v593windowAutoSnap593
    BiliClient.prefs.v593windowAutoSnap593 = !current
    AppToast.show(this, "Window Auto Snap593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593WrapAutoBreak593Toggle() {
    val current = BiliClient.prefs.v593wrapAutoBreak593
    BiliClient.prefs.v593wrapAutoBreak593 = !current
    AppToast.show(this, "Wrap Auto Break593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593ZoneAutoDetect593Toggle() {
    val current = BiliClient.prefs.v593zoneAutoDetect593
    BiliClient.prefs.v593zoneAutoDetect593 = !current
    AppToast.show(this, "Zone Auto Detect593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593AnchorAutoPin593Toggle() {
    val current = BiliClient.prefs.v593anchorAutoPin593
    BiliClient.prefs.v593anchorAutoPin593 = !current
    AppToast.show(this, "Anchor Auto Pin593: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV593AttachAutoEmbed593Toggle() {
    val current = BiliClient.prefs.v593attachAutoEmbed593
    BiliClient.prefs.v593attachAutoEmbed593 = !current
    AppToast.show(this, "Attach Auto Embed593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593AudioAutoNormalize593Toggle() {
    val current = BiliClient.prefs.v593audioAutoNormalize593
    BiliClient.prefs.v593audioAutoNormalize593 = !current
    AppToast.show(this, "Audio Auto Normalize593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593AxisAutoAlign593Toggle() {
    val current = BiliClient.prefs.v593axisAutoAlign593
    BiliClient.prefs.v593axisAutoAlign593 = !current
    AppToast.show(this, "Axis Auto Align593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593BadgeAutoCount593Toggle() {
    val current = BiliClient.prefs.v593badgeAutoCount593
    BiliClient.prefs.v593badgeAutoCount593 = !current
    AppToast.show(this, "Badge Auto Count593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593BaselineAutoSync593Toggle() {
    val current = BiliClient.prefs.v593baselineAutoSync593
    BiliClient.prefs.v593baselineAutoSync593 = !current
    AppToast.show(this, "Baseline Auto Sync593: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV593BindAutoLink593Toggle() {
    val current = BiliClient.prefs.v593bindAutoLink593
    BiliClient.prefs.v593bindAutoLink593 = !current
    AppToast.show(this, "Bind Auto Link593: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV594WebAutoRedirect594Toggle() {
    val current = BiliClient.prefs.v594webAutoRedirect594
    BiliClient.prefs.v594webAutoRedirect594 = !current
    AppToast.show(this, "Web Auto Redirect594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594WidgetAutoRefresh594Toggle() {
    val current = BiliClient.prefs.v594widgetAutoRefresh594
    BiliClient.prefs.v594widgetAutoRefresh594 = !current
    AppToast.show(this, "Widget Auto Refresh594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594WindowAutoSnap594Toggle() {
    val current = BiliClient.prefs.v594windowAutoSnap594
    BiliClient.prefs.v594windowAutoSnap594 = !current
    AppToast.show(this, "Window Auto Snap594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594WrapAutoBreak594Toggle() {
    val current = BiliClient.prefs.v594wrapAutoBreak594
    BiliClient.prefs.v594wrapAutoBreak594 = !current
    AppToast.show(this, "Wrap Auto Break594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594ZoneAutoDetect594Toggle() {
    val current = BiliClient.prefs.v594zoneAutoDetect594
    BiliClient.prefs.v594zoneAutoDetect594 = !current
    AppToast.show(this, "Zone Auto Detect594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594AnchorAutoPin594Toggle() {
    val current = BiliClient.prefs.v594anchorAutoPin594
    BiliClient.prefs.v594anchorAutoPin594 = !current
    AppToast.show(this, "Anchor Auto Pin594: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV594AttachAutoEmbed594Toggle() {
    val current = BiliClient.prefs.v594attachAutoEmbed594
    BiliClient.prefs.v594attachAutoEmbed594 = !current
    AppToast.show(this, "Attach Auto Embed594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594AudioAutoNormalize594Toggle() {
    val current = BiliClient.prefs.v594audioAutoNormalize594
    BiliClient.prefs.v594audioAutoNormalize594 = !current
    AppToast.show(this, "Audio Auto Normalize594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594AxisAutoAlign594Toggle() {
    val current = BiliClient.prefs.v594axisAutoAlign594
    BiliClient.prefs.v594axisAutoAlign594 = !current
    AppToast.show(this, "Axis Auto Align594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594BadgeAutoCount594Toggle() {
    val current = BiliClient.prefs.v594badgeAutoCount594
    BiliClient.prefs.v594badgeAutoCount594 = !current
    AppToast.show(this, "Badge Auto Count594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594BaselineAutoSync594Toggle() {
    val current = BiliClient.prefs.v594baselineAutoSync594
    BiliClient.prefs.v594baselineAutoSync594 = !current
    AppToast.show(this, "Baseline Auto Sync594: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV594BindAutoLink594Toggle() {
    val current = BiliClient.prefs.v594bindAutoLink594
    BiliClient.prefs.v594bindAutoLink594 = !current
    AppToast.show(this, "Bind Auto Link594: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV595WebAutoRedirect595Toggle() {
    val current = BiliClient.prefs.v595webAutoRedirect595
    BiliClient.prefs.v595webAutoRedirect595 = !current
    AppToast.show(this, "Web Auto Redirect595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595WidgetAutoRefresh595Toggle() {
    val current = BiliClient.prefs.v595widgetAutoRefresh595
    BiliClient.prefs.v595widgetAutoRefresh595 = !current
    AppToast.show(this, "Widget Auto Refresh595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595WindowAutoSnap595Toggle() {
    val current = BiliClient.prefs.v595windowAutoSnap595
    BiliClient.prefs.v595windowAutoSnap595 = !current
    AppToast.show(this, "Window Auto Snap595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595WrapAutoBreak595Toggle() {
    val current = BiliClient.prefs.v595wrapAutoBreak595
    BiliClient.prefs.v595wrapAutoBreak595 = !current
    AppToast.show(this, "Wrap Auto Break595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595ZoneAutoDetect595Toggle() {
    val current = BiliClient.prefs.v595zoneAutoDetect595
    BiliClient.prefs.v595zoneAutoDetect595 = !current
    AppToast.show(this, "Zone Auto Detect595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595AnchorAutoPin595Toggle() {
    val current = BiliClient.prefs.v595anchorAutoPin595
    BiliClient.prefs.v595anchorAutoPin595 = !current
    AppToast.show(this, "Anchor Auto Pin595: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV595AttachAutoEmbed595Toggle() {
    val current = BiliClient.prefs.v595attachAutoEmbed595
    BiliClient.prefs.v595attachAutoEmbed595 = !current
    AppToast.show(this, "Attach Auto Embed595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595AudioAutoNormalize595Toggle() {
    val current = BiliClient.prefs.v595audioAutoNormalize595
    BiliClient.prefs.v595audioAutoNormalize595 = !current
    AppToast.show(this, "Audio Auto Normalize595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595AxisAutoAlign595Toggle() {
    val current = BiliClient.prefs.v595axisAutoAlign595
    BiliClient.prefs.v595axisAutoAlign595 = !current
    AppToast.show(this, "Axis Auto Align595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595BadgeAutoCount595Toggle() {
    val current = BiliClient.prefs.v595badgeAutoCount595
    BiliClient.prefs.v595badgeAutoCount595 = !current
    AppToast.show(this, "Badge Auto Count595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595BaselineAutoSync595Toggle() {
    val current = BiliClient.prefs.v595baselineAutoSync595
    BiliClient.prefs.v595baselineAutoSync595 = !current
    AppToast.show(this, "Baseline Auto Sync595: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV595BindAutoLink595Toggle() {
    val current = BiliClient.prefs.v595bindAutoLink595
    BiliClient.prefs.v595bindAutoLink595 = !current
    AppToast.show(this, "Bind Auto Link595: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV596WebAutoRedirect596Toggle() {
    val current = BiliClient.prefs.v596webAutoRedirect596
    BiliClient.prefs.v596webAutoRedirect596 = !current
    AppToast.show(this, "Web Auto Redirect596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596WidgetAutoRefresh596Toggle() {
    val current = BiliClient.prefs.v596widgetAutoRefresh596
    BiliClient.prefs.v596widgetAutoRefresh596 = !current
    AppToast.show(this, "Widget Auto Refresh596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596WindowAutoSnap596Toggle() {
    val current = BiliClient.prefs.v596windowAutoSnap596
    BiliClient.prefs.v596windowAutoSnap596 = !current
    AppToast.show(this, "Window Auto Snap596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596WrapAutoBreak596Toggle() {
    val current = BiliClient.prefs.v596wrapAutoBreak596
    BiliClient.prefs.v596wrapAutoBreak596 = !current
    AppToast.show(this, "Wrap Auto Break596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596ZoneAutoDetect596Toggle() {
    val current = BiliClient.prefs.v596zoneAutoDetect596
    BiliClient.prefs.v596zoneAutoDetect596 = !current
    AppToast.show(this, "Zone Auto Detect596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596AnchorAutoPin596Toggle() {
    val current = BiliClient.prefs.v596anchorAutoPin596
    BiliClient.prefs.v596anchorAutoPin596 = !current
    AppToast.show(this, "Anchor Auto Pin596: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV596AttachAutoEmbed596Toggle() {
    val current = BiliClient.prefs.v596attachAutoEmbed596
    BiliClient.prefs.v596attachAutoEmbed596 = !current
    AppToast.show(this, "Attach Auto Embed596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596AudioAutoNormalize596Toggle() {
    val current = BiliClient.prefs.v596audioAutoNormalize596
    BiliClient.prefs.v596audioAutoNormalize596 = !current
    AppToast.show(this, "Audio Auto Normalize596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596AxisAutoAlign596Toggle() {
    val current = BiliClient.prefs.v596axisAutoAlign596
    BiliClient.prefs.v596axisAutoAlign596 = !current
    AppToast.show(this, "Axis Auto Align596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596BadgeAutoCount596Toggle() {
    val current = BiliClient.prefs.v596badgeAutoCount596
    BiliClient.prefs.v596badgeAutoCount596 = !current
    AppToast.show(this, "Badge Auto Count596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596BaselineAutoSync596Toggle() {
    val current = BiliClient.prefs.v596baselineAutoSync596
    BiliClient.prefs.v596baselineAutoSync596 = !current
    AppToast.show(this, "Baseline Auto Sync596: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV596BindAutoLink596Toggle() {
    val current = BiliClient.prefs.v596bindAutoLink596
    BiliClient.prefs.v596bindAutoLink596 = !current
    AppToast.show(this, "Bind Auto Link596: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV597WebAutoRedirect597Toggle() {
    val current = BiliClient.prefs.v597webAutoRedirect597
    BiliClient.prefs.v597webAutoRedirect597 = !current
    AppToast.show(this, "Web Auto Redirect597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597WidgetAutoRefresh597Toggle() {
    val current = BiliClient.prefs.v597widgetAutoRefresh597
    BiliClient.prefs.v597widgetAutoRefresh597 = !current
    AppToast.show(this, "Widget Auto Refresh597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597WindowAutoSnap597Toggle() {
    val current = BiliClient.prefs.v597windowAutoSnap597
    BiliClient.prefs.v597windowAutoSnap597 = !current
    AppToast.show(this, "Window Auto Snap597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597WrapAutoBreak597Toggle() {
    val current = BiliClient.prefs.v597wrapAutoBreak597
    BiliClient.prefs.v597wrapAutoBreak597 = !current
    AppToast.show(this, "Wrap Auto Break597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597ZoneAutoDetect597Toggle() {
    val current = BiliClient.prefs.v597zoneAutoDetect597
    BiliClient.prefs.v597zoneAutoDetect597 = !current
    AppToast.show(this, "Zone Auto Detect597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597AnchorAutoPin597Toggle() {
    val current = BiliClient.prefs.v597anchorAutoPin597
    BiliClient.prefs.v597anchorAutoPin597 = !current
    AppToast.show(this, "Anchor Auto Pin597: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV597AttachAutoEmbed597Toggle() {
    val current = BiliClient.prefs.v597attachAutoEmbed597
    BiliClient.prefs.v597attachAutoEmbed597 = !current
    AppToast.show(this, "Attach Auto Embed597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597AudioAutoNormalize597Toggle() {
    val current = BiliClient.prefs.v597audioAutoNormalize597
    BiliClient.prefs.v597audioAutoNormalize597 = !current
    AppToast.show(this, "Audio Auto Normalize597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597AxisAutoAlign597Toggle() {
    val current = BiliClient.prefs.v597axisAutoAlign597
    BiliClient.prefs.v597axisAutoAlign597 = !current
    AppToast.show(this, "Axis Auto Align597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597BadgeAutoCount597Toggle() {
    val current = BiliClient.prefs.v597badgeAutoCount597
    BiliClient.prefs.v597badgeAutoCount597 = !current
    AppToast.show(this, "Badge Auto Count597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597BaselineAutoSync597Toggle() {
    val current = BiliClient.prefs.v597baselineAutoSync597
    BiliClient.prefs.v597baselineAutoSync597 = !current
    AppToast.show(this, "Baseline Auto Sync597: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV597BindAutoLink597Toggle() {
    val current = BiliClient.prefs.v597bindAutoLink597
    BiliClient.prefs.v597bindAutoLink597 = !current
    AppToast.show(this, "Bind Auto Link597: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV598WebAutoRedirect598Toggle() {
    val current = BiliClient.prefs.v598webAutoRedirect598
    BiliClient.prefs.v598webAutoRedirect598 = !current
    AppToast.show(this, "Web Auto Redirect598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598WidgetAutoRefresh598Toggle() {
    val current = BiliClient.prefs.v598widgetAutoRefresh598
    BiliClient.prefs.v598widgetAutoRefresh598 = !current
    AppToast.show(this, "Widget Auto Refresh598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598WindowAutoSnap598Toggle() {
    val current = BiliClient.prefs.v598windowAutoSnap598
    BiliClient.prefs.v598windowAutoSnap598 = !current
    AppToast.show(this, "Window Auto Snap598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598WrapAutoBreak598Toggle() {
    val current = BiliClient.prefs.v598wrapAutoBreak598
    BiliClient.prefs.v598wrapAutoBreak598 = !current
    AppToast.show(this, "Wrap Auto Break598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598ZoneAutoDetect598Toggle() {
    val current = BiliClient.prefs.v598zoneAutoDetect598
    BiliClient.prefs.v598zoneAutoDetect598 = !current
    AppToast.show(this, "Zone Auto Detect598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598AnchorAutoPin598Toggle() {
    val current = BiliClient.prefs.v598anchorAutoPin598
    BiliClient.prefs.v598anchorAutoPin598 = !current
    AppToast.show(this, "Anchor Auto Pin598: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV598AttachAutoEmbed598Toggle() {
    val current = BiliClient.prefs.v598attachAutoEmbed598
    BiliClient.prefs.v598attachAutoEmbed598 = !current
    AppToast.show(this, "Attach Auto Embed598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598AudioAutoNormalize598Toggle() {
    val current = BiliClient.prefs.v598audioAutoNormalize598
    BiliClient.prefs.v598audioAutoNormalize598 = !current
    AppToast.show(this, "Audio Auto Normalize598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598AxisAutoAlign598Toggle() {
    val current = BiliClient.prefs.v598axisAutoAlign598
    BiliClient.prefs.v598axisAutoAlign598 = !current
    AppToast.show(this, "Axis Auto Align598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598BadgeAutoCount598Toggle() {
    val current = BiliClient.prefs.v598badgeAutoCount598
    BiliClient.prefs.v598badgeAutoCount598 = !current
    AppToast.show(this, "Badge Auto Count598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598BaselineAutoSync598Toggle() {
    val current = BiliClient.prefs.v598baselineAutoSync598
    BiliClient.prefs.v598baselineAutoSync598 = !current
    AppToast.show(this, "Baseline Auto Sync598: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV598BindAutoLink598Toggle() {
    val current = BiliClient.prefs.v598bindAutoLink598
    BiliClient.prefs.v598bindAutoLink598 = !current
    AppToast.show(this, "Bind Auto Link598: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV599WebAutoRedirect599Toggle() {
    val current = BiliClient.prefs.v599webAutoRedirect599
    BiliClient.prefs.v599webAutoRedirect599 = !current
    AppToast.show(this, "Web Auto Redirect599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599WidgetAutoRefresh599Toggle() {
    val current = BiliClient.prefs.v599widgetAutoRefresh599
    BiliClient.prefs.v599widgetAutoRefresh599 = !current
    AppToast.show(this, "Widget Auto Refresh599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599WindowAutoSnap599Toggle() {
    val current = BiliClient.prefs.v599windowAutoSnap599
    BiliClient.prefs.v599windowAutoSnap599 = !current
    AppToast.show(this, "Window Auto Snap599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599WrapAutoBreak599Toggle() {
    val current = BiliClient.prefs.v599wrapAutoBreak599
    BiliClient.prefs.v599wrapAutoBreak599 = !current
    AppToast.show(this, "Wrap Auto Break599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599ZoneAutoDetect599Toggle() {
    val current = BiliClient.prefs.v599zoneAutoDetect599
    BiliClient.prefs.v599zoneAutoDetect599 = !current
    AppToast.show(this, "Zone Auto Detect599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599AnchorAutoPin599Toggle() {
    val current = BiliClient.prefs.v599anchorAutoPin599
    BiliClient.prefs.v599anchorAutoPin599 = !current
    AppToast.show(this, "Anchor Auto Pin599: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV599AttachAutoEmbed599Toggle() {
    val current = BiliClient.prefs.v599attachAutoEmbed599
    BiliClient.prefs.v599attachAutoEmbed599 = !current
    AppToast.show(this, "Attach Auto Embed599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599AudioAutoNormalize599Toggle() {
    val current = BiliClient.prefs.v599audioAutoNormalize599
    BiliClient.prefs.v599audioAutoNormalize599 = !current
    AppToast.show(this, "Audio Auto Normalize599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599AxisAutoAlign599Toggle() {
    val current = BiliClient.prefs.v599axisAutoAlign599
    BiliClient.prefs.v599axisAutoAlign599 = !current
    AppToast.show(this, "Axis Auto Align599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599BadgeAutoCount599Toggle() {
    val current = BiliClient.prefs.v599badgeAutoCount599
    BiliClient.prefs.v599badgeAutoCount599 = !current
    AppToast.show(this, "Badge Auto Count599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599BaselineAutoSync599Toggle() {
    val current = BiliClient.prefs.v599baselineAutoSync599
    BiliClient.prefs.v599baselineAutoSync599 = !current
    AppToast.show(this, "Baseline Auto Sync599: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV599BindAutoLink599Toggle() {
    val current = BiliClient.prefs.v599bindAutoLink599
    BiliClient.prefs.v599bindAutoLink599 = !current
    AppToast.show(this, "Bind Auto Link599: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV600WebAutoRedirect600Toggle() {
    val current = BiliClient.prefs.v600webAutoRedirect600
    BiliClient.prefs.v600webAutoRedirect600 = !current
    AppToast.show(this, "Web Auto Redirect600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600WidgetAutoRefresh600Toggle() {
    val current = BiliClient.prefs.v600widgetAutoRefresh600
    BiliClient.prefs.v600widgetAutoRefresh600 = !current
    AppToast.show(this, "Widget Auto Refresh600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600WindowAutoSnap600Toggle() {
    val current = BiliClient.prefs.v600windowAutoSnap600
    BiliClient.prefs.v600windowAutoSnap600 = !current
    AppToast.show(this, "Window Auto Snap600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600WrapAutoBreak600Toggle() {
    val current = BiliClient.prefs.v600wrapAutoBreak600
    BiliClient.prefs.v600wrapAutoBreak600 = !current
    AppToast.show(this, "Wrap Auto Break600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600ZoneAutoDetect600Toggle() {
    val current = BiliClient.prefs.v600zoneAutoDetect600
    BiliClient.prefs.v600zoneAutoDetect600 = !current
    AppToast.show(this, "Zone Auto Detect600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600AnchorAutoPin600Toggle() {
    val current = BiliClient.prefs.v600anchorAutoPin600
    BiliClient.prefs.v600anchorAutoPin600 = !current
    AppToast.show(this, "Anchor Auto Pin600: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV600AttachAutoEmbed600Toggle() {
    val current = BiliClient.prefs.v600attachAutoEmbed600
    BiliClient.prefs.v600attachAutoEmbed600 = !current
    AppToast.show(this, "Attach Auto Embed600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600AudioAutoNormalize600Toggle() {
    val current = BiliClient.prefs.v600audioAutoNormalize600
    BiliClient.prefs.v600audioAutoNormalize600 = !current
    AppToast.show(this, "Audio Auto Normalize600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600AxisAutoAlign600Toggle() {
    val current = BiliClient.prefs.v600axisAutoAlign600
    BiliClient.prefs.v600axisAutoAlign600 = !current
    AppToast.show(this, "Axis Auto Align600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600BadgeAutoCount600Toggle() {
    val current = BiliClient.prefs.v600badgeAutoCount600
    BiliClient.prefs.v600badgeAutoCount600 = !current
    AppToast.show(this, "Badge Auto Count600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600BaselineAutoSync600Toggle() {
    val current = BiliClient.prefs.v600baselineAutoSync600
    BiliClient.prefs.v600baselineAutoSync600 = !current
    AppToast.show(this, "Baseline Auto Sync600: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV600BindAutoLink600Toggle() {
    val current = BiliClient.prefs.v600bindAutoLink600
    BiliClient.prefs.v600bindAutoLink600 = !current
    AppToast.show(this, "Bind Auto Link600: ${if (!current) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV601ActionAutoRepeat601Toggle() {
    val current = BiliClient.prefs.v601actionAutoRepeat601
    BiliClient.prefs.v601actionAutoRepeat601 = !current
    AppToast.show(this, "Action Auto Repeat601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AdapterAutoSwitch601Toggle() {
    val current = BiliClient.prefs.v601adapterAutoSwitch601
    BiliClient.prefs.v601adapterAutoSwitch601 = !current
    AppToast.show(this, "Adapter Auto Switch601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AgentAutoConnect601Toggle() {
    val current = BiliClient.prefs.v601agentAutoConnect601
    BiliClient.prefs.v601agentAutoConnect601 = !current
    AppToast.show(this, "Agent Auto Connect601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AliasAutoResolve601Toggle() {
    val current = BiliClient.prefs.v601aliasAutoResolve601
    BiliClient.prefs.v601aliasAutoResolve601 = !current
    AppToast.show(this, "Alias Auto Resolve601: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV601AliveAutoKeep601Toggle() {
    val current = BiliClient.prefs.v601aliveAutoKeep601
    BiliClient.prefs.v601aliveAutoKeep601 = !current
    AppToast.show(this, "Alive Auto Keep601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AlphaAutoFade601Toggle() {
    val current = BiliClient.prefs.v601alphaAutoFade601
    BiliClient.prefs.v601alphaAutoFade601 = !current
    AppToast.show(this, "Alpha Auto Fade601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AmbientAutoLight601Toggle() {
    val current = BiliClient.prefs.v601ambientAutoLight601
    BiliClient.prefs.v601ambientAutoLight601 = !current
    AppToast.show(this, "Ambient Auto Light601: ${if (!current) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV601AngleAutoRotate601Toggle() {
    val current = BiliClient.prefs.v601angleAutoRotate601
    BiliClient.prefs.v601angleAutoRotate601 = !current
    AppToast.show(this, "Angle Auto Rotate601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AnswerAutoReply601Toggle() {
    val current = BiliClient.prefs.v601answerAutoReply601
    BiliClient.prefs.v601answerAutoReply601 = !current
    AppToast.show(this, "Answer Auto Reply601: ${if (!current) "ON" else "OFF"}")
}

