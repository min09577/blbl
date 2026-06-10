package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v116.84: Volume Fade Duration Custom
internal fun PlayerActivity.showV116VolumeFadeDurationCustomDialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v116volumeFadeDurationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Duration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116volumeFadeDurationCustom = value
        AppToast.show(this, "Volume Fade Duration Custom: $value")
    }
}

// v116.85: History Search Scope Custom
internal fun PlayerActivity.showV116HistorySearchScopeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116historySearchScopeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116historySearchScopeCustom = value
        AppToast.show(this, "History Search Scope Custom: $value")
    }
}

// v116.86: Playback Speed Auto Adjust Max
internal fun PlayerActivity.showV116PlaybackSpeedAutoAdjustMaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116playbackSpeedAutoAdjustMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Auto Adjust Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116playbackSpeedAutoAdjustMax = value
        AppToast.show(this, "Playback Speed Auto Adjust Max: $value")
    }
}

// v116.87: Screenshot Auto Share WhatsApp
internal fun PlayerActivity.showV116ScreenshotAutoShareWhatsAppToggle() {
    val enabled = !BiliClient.prefs.v116screenshotAutoShareWhatsApp
    BiliClient.prefs.v116screenshotAutoShareWhatsApp = enabled
    AppToast.show(this, "Screenshot Auto Share WhatsApp: ${if (enabled) "ON" else "OFF"}")
}

// v116.88: Video PIP Mode Custom
internal fun PlayerActivity.showV116VideoPIPModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116videoPIPModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116videoPIPModeCustom = value
        AppToast.show(this, "Video PIP Mode Custom: $value")
    }
}

// v116.89: Danmaku Font BG Border Radius115
internal fun PlayerActivity.showV116DanmakuFontBgBorderRadius115Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v116danmakuFontBgBorderRadius115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Radius115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116danmakuFontBgBorderRadius115 = value
        AppToast.show(this, "Danmaku Font BG Border Radius115: $value")
    }
}

// v116.90: Subtitle Animation Type116
internal fun PlayerActivity.showV116SubtitleAnimationType116Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116subtitleAnimationType116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116subtitleAnimationType116 = value
        AppToast.show(this, "Subtitle Animation Type116: $value")
    }
}

// v117.91: Audio Dynamic EQ Toggle117
internal fun PlayerActivity.showV117AudioDynamicEQToggle117Toggle() {
    val enabled = !BiliClient.prefs.v117audioDynamicEQToggle117
    BiliClient.prefs.v117audioDynamicEQToggle117 = enabled
    AppToast.show(this, "Audio Dynamic EQ Toggle117: ${if (enabled) "ON" else "OFF"}")
}

// v117.92: Danmaku Font BG Border Radius116
internal fun PlayerActivity.showV117DanmakuFontBgBorderRadius116Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v117danmakuFontBgBorderRadius116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Radius116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117danmakuFontBgBorderRadius116 = value
        AppToast.show(this, "Danmaku Font BG Border Radius116: $value")
    }
}

// v117.93: Subtitle Animation Duration117
internal fun PlayerActivity.showV117SubtitleAnimationDuration117Dialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v117subtitleAnimationDuration117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117subtitleAnimationDuration117 = value
        AppToast.show(this, "Subtitle Animation Duration117: $value")
    }
}

// v117.94: Gesture Tap Quadruple Action
internal fun PlayerActivity.showV117GestureTapQuadrupleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v117gestureTapQuadrupleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Quadruple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117gestureTapQuadrupleAction = value
        AppToast.show(this, "Gesture Tap Quadruple Action: $value")
    }
}

// v117.95: Cast Video Negative Custom
internal fun PlayerActivity.showV117CastVideoNegativeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v117castVideoNegativeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Negative Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117castVideoNegativeCustom = value
        AppToast.show(this, "Cast Video Negative Custom: $value")
    }
}

// v117.96: Playlist Auto Skip On Low Battery
internal fun PlayerActivity.showV117PlaylistAutoSkipOnLowBatteryToggle() {
    val enabled = !BiliClient.prefs.v117playlistAutoSkipOnLowBattery
    BiliClient.prefs.v117playlistAutoSkipOnLowBattery = enabled
    AppToast.show(this, "Playlist Auto Skip On Low Battery: ${if (enabled) "ON" else "OFF"}")
}

// v117.97: Cache Preload On Wifi Toggle
internal fun PlayerActivity.showV117CachePreloadOnWifiToggleToggle() {
    val enabled = !BiliClient.prefs.v117cachePreloadOnWifiToggle
    BiliClient.prefs.v117cachePreloadOnWifiToggle = enabled
    AppToast.show(this, "Cache Preload On Wifi Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v117.98: Progress Bar Custom Live Edge Opacity
internal fun PlayerActivity.showV117ProgressBarCustomLiveEdgeOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v117progressBarCustomLiveEdgeOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Edge Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117progressBarCustomLiveEdgeOpacity = value
        AppToast.show(this, "Progress Bar Custom Live Edge Opacity: $value")
    }
}

// v117.99: Volume Smooth Fade Toggle
internal fun PlayerActivity.showV117VolumeSmoothFadeToggleToggle() {
    val enabled = !BiliClient.prefs.v117volumeSmoothFadeToggle
    BiliClient.prefs.v117volumeSmoothFadeToggle = enabled
    AppToast.show(this, "Volume Smooth Fade Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v117.100: History Search Regex Toggle
internal fun PlayerActivity.showV117HistorySearchRegexToggleToggle() {
    val enabled = !BiliClient.prefs.v117historySearchRegexToggle
    BiliClient.prefs.v117historySearchRegexToggle = enabled
    AppToast.show(this, "History Search Regex Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v117.101: Playback Speed Auto Adjust Active
internal fun PlayerActivity.showV117PlaybackSpeedAutoAdjustActiveToggle() {
    val enabled = !BiliClient.prefs.v117playbackSpeedAutoAdjustActive
    BiliClient.prefs.v117playbackSpeedAutoAdjustActive = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Active: ${if (enabled) "ON" else "OFF"}")
}

// v117.102: Screenshot Auto Share Telegram
internal fun PlayerActivity.showV117ScreenshotAutoShareTelegramToggle() {
    val enabled = !BiliClient.prefs.v117screenshotAutoShareTelegram
    BiliClient.prefs.v117screenshotAutoShareTelegram = enabled
    AppToast.show(this, "Screenshot Auto Share Telegram: ${if (enabled) "ON" else "OFF"}")
}

// v117.103: Video PIP Size Custom
internal fun PlayerActivity.showV117VideoPIPSizeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v117videoPIPSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117videoPIPSizeCustom = value
        AppToast.show(this, "Video PIP Size Custom: $value")
    }
}

// v117.104: Danmaku Font BG Border Opacity116
internal fun PlayerActivity.showV117DanmakuFontBgBorderOpacity116Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v117danmakuFontBgBorderOpacity116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Opacity116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117danmakuFontBgBorderOpacity116 = value
        AppToast.show(this, "Danmaku Font BG Border Opacity116: $value")
    }
}

// v117.105: Subtitle Animation Speed117
internal fun PlayerActivity.showV117SubtitleAnimationSpeed117Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v117subtitleAnimationSpeed117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117subtitleAnimationSpeed117 = value
        AppToast.show(this, "Subtitle Animation Speed117: $value")
    }
}

// v118.106: Audio Dynamic Range Expand
internal fun PlayerActivity.showV118AudioDynamicRangeExpandDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v118audioDynamicRangeExpand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range Expand",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118audioDynamicRangeExpand = value
        AppToast.show(this, "Audio Dynamic Range Expand: $value")
    }
}

// v118.107: Danmaku Font BG Border Opacity117
internal fun PlayerActivity.showV118DanmakuFontBgBorderOpacity117Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v118danmakuFontBgBorderOpacity117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Opacity117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118danmakuFontBgBorderOpacity117 = value
        AppToast.show(this, "Danmaku Font BG Border Opacity117: $value")
    }
}

// v118.108: Subtitle Animation Speed118
internal fun PlayerActivity.showV118SubtitleAnimationSpeed118Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v118subtitleAnimationSpeed118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118subtitleAnimationSpeed118 = value
        AppToast.show(this, "Subtitle Animation Speed118: $value")
    }
}

// v118.109: Gesture Tap Hold Action
internal fun PlayerActivity.showV118GestureTapHoldActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118gestureTapHoldAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Hold Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118gestureTapHoldAction = value
        AppToast.show(this, "Gesture Tap Hold Action: $value")
    }
}

// v118.110: Cast Video Posterize Custom
internal fun PlayerActivity.showV118CastVideoPosterizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v118castVideoPosterizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Posterize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118castVideoPosterizeCustom = value
        AppToast.show(this, "Cast Video Posterize Custom: $value")
    }
}

// v118.111: Playlist Auto Load Metadata
internal fun PlayerActivity.showV118PlaylistAutoLoadMetadataToggle() {
    val enabled = !BiliClient.prefs.v118playlistAutoLoadMetadata
    BiliClient.prefs.v118playlistAutoLoadMetadata = enabled
    AppToast.show(this, "Playlist Auto Load Metadata: ${if (enabled) "ON" else "OFF"}")
}

// v118.112: Cache Smart Eviction Toggle
internal fun PlayerActivity.showV118CacheSmartEvictionToggleToggle() {
    val enabled = !BiliClient.prefs.v118cacheSmartEvictionToggle
    BiliClient.prefs.v118cacheSmartEvictionToggle = enabled
    AppToast.show(this, "Cache Smart Eviction Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v118.113: Progress Bar Custom Scale Type
internal fun PlayerActivity.showV118ProgressBarCustomScaleTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118progressBarCustomScaleType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118progressBarCustomScaleType = value
        AppToast.show(this, "Progress Bar Custom Scale Type: $value")
    }
}

// v118.114: Volume Spatial Audio Mode
internal fun PlayerActivity.showV118VolumeSpatialAudioModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118volumeSpatialAudioMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Audio Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118volumeSpatialAudioMode = value
        AppToast.show(this, "Volume Spatial Audio Mode: $value")
    }
}

// v118.115: History Search Fuzzy Match
internal fun PlayerActivity.showV118HistorySearchFuzzyMatchToggle() {
    val enabled = !BiliClient.prefs.v118historySearchFuzzyMatch
    BiliClient.prefs.v118historySearchFuzzyMatch = enabled
    AppToast.show(this, "History Search Fuzzy Match: ${if (enabled) "ON" else "OFF"}")
}

// v118.116: Playback Speed Auto Adjust Buffer
internal fun PlayerActivity.showV118PlaybackSpeedAutoAdjustBufferToggle() {
    val enabled = !BiliClient.prefs.v118playbackSpeedAutoAdjustBuffer
    BiliClient.prefs.v118playbackSpeedAutoAdjustBuffer = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Buffer: ${if (enabled) "ON" else "OFF"}")
}

// v118.117: Screenshot Auto Share Discord
internal fun PlayerActivity.showV118ScreenshotAutoShareDiscordToggle() {
    val enabled = !BiliClient.prefs.v118screenshotAutoShareDiscord
    BiliClient.prefs.v118screenshotAutoShareDiscord = enabled
    AppToast.show(this, "Screenshot Auto Share Discord: ${if (enabled) "ON" else "OFF"}")
}

// v118.118: Video PIP Position Custom
internal fun PlayerActivity.showV118VideoPIPPositionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118videoPIPPositionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Position Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118videoPIPPositionCustom = value
        AppToast.show(this, "Video PIP Position Custom: $value")
    }
}

// v118.119: Danmaku Font BG Fill Mode117
internal fun PlayerActivity.showV118DanmakuFontBgFillMode117Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118danmakuFontBgFillMode117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mode117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118danmakuFontBgFillMode117 = value
        AppToast.show(this, "Danmaku Font BG Fill Mode117: $value")
    }
}

// v118.120: Subtitle Animation Easing118
internal fun PlayerActivity.showV118SubtitleAnimationEasing118Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118subtitleAnimationEasing118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118subtitleAnimationEasing118 = value
        AppToast.show(this, "Subtitle Animation Easing118: $value")
    }
}

// v119.121: Audio Dynamic Stereo Width
internal fun PlayerActivity.showV119AudioDynamicStereoWidthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v119audioDynamicStereoWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Stereo Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119audioDynamicStereoWidth = value
        AppToast.show(this, "Audio Dynamic Stereo Width: $value")
    }
}

// v119.122: Danmaku Font BG Fill Mode118
internal fun PlayerActivity.showV119DanmakuFontBgFillMode118Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119danmakuFontBgFillMode118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mode118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119danmakuFontBgFillMode118 = value
        AppToast.show(this, "Danmaku Font BG Fill Mode118: $value")
    }
}

// v119.123: Subtitle Animation Easing119
internal fun PlayerActivity.showV119SubtitleAnimationEasing119Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119subtitleAnimationEasing119).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing119",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119subtitleAnimationEasing119 = value
        AppToast.show(this, "Subtitle Animation Easing119: $value")
    }
}

// v119.124: Gesture Tap Release Action
internal fun PlayerActivity.showV119GestureTapReleaseActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119gestureTapReleaseAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Release Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119gestureTapReleaseAction = value
        AppToast.show(this, "Gesture Tap Release Action: $value")
    }
}

// v119.125: Cast Video Solarize Custom
internal fun PlayerActivity.showV119CastVideoSolarizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v119castVideoSolarizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Solarize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119castVideoSolarizeCustom = value
        AppToast.show(this, "Cast Video Solarize Custom: $value")
    }
}

// v119.126: Playlist Auto Save Position
internal fun PlayerActivity.showV119PlaylistAutoSavePositionToggle() {
    val enabled = !BiliClient.prefs.v119playlistAutoSavePosition
    BiliClient.prefs.v119playlistAutoSavePosition = enabled
    AppToast.show(this, "Playlist Auto Save Position: ${if (enabled) "ON" else "OFF"}")
}

// v119.127: Cache Verify Integrity Toggle
internal fun PlayerActivity.showV119CacheVerifyIntegrityToggleToggle() {
    val enabled = !BiliClient.prefs.v119cacheVerifyIntegrityToggle
    BiliClient.prefs.v119cacheVerifyIntegrityToggle = enabled
    AppToast.show(this, "Cache Verify Integrity Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v119.128: Progress Bar Custom Scale Min
internal fun PlayerActivity.showV119ProgressBarCustomScaleMinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119progressBarCustomScaleMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119progressBarCustomScaleMin = value
        AppToast.show(this, "Progress Bar Custom Scale Min: $value")
    }
}

// v119.129: Volume Stereo Pan Custom
internal fun PlayerActivity.showV119VolumeStereoPanCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119volumeStereoPanCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Stereo Pan Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119volumeStereoPanCustom = value
        AppToast.show(this, "Volume Stereo Pan Custom: $value")
    }
}

// v119.130: History Search Match Case
internal fun PlayerActivity.showV119HistorySearchMatchCaseToggle() {
    val enabled = !BiliClient.prefs.v119historySearchMatchCase
    BiliClient.prefs.v119historySearchMatchCase = enabled
    AppToast.show(this, "History Search Match Case: ${if (enabled) "ON" else "OFF"}")
}

// v119.131: Playback Speed Auto Adjust Network
internal fun PlayerActivity.showV119PlaybackSpeedAutoAdjustNetworkToggle() {
    val enabled = !BiliClient.prefs.v119playbackSpeedAutoAdjustNetwork
    BiliClient.prefs.v119playbackSpeedAutoAdjustNetwork = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Network: ${if (enabled) "ON" else "OFF"}")
}

// v119.132: Screenshot Auto Share Line
internal fun PlayerActivity.showV119ScreenshotAutoShareLineToggle() {
    val enabled = !BiliClient.prefs.v119screenshotAutoShareLine
    BiliClient.prefs.v119screenshotAutoShareLine = enabled
    AppToast.show(this, "Screenshot Auto Share Line: ${if (enabled) "ON" else "OFF"}")
}

// v119.133: Video PIP Corner Radius
internal fun PlayerActivity.showV119VideoPIPCornerRadiusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119videoPIPCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Corner Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119videoPIPCornerRadius = value
        AppToast.show(this, "Video PIP Corner Radius: $value")
    }
}

// v119.134: Danmaku Font BG Fill Opacity118
internal fun PlayerActivity.showV119DanmakuFontBgFillOpacity118Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v119danmakuFontBgFillOpacity118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119danmakuFontBgFillOpacity118 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity118: $value")
    }
}

// v119.135: Subtitle Animation Loop119
internal fun PlayerActivity.showV119SubtitleAnimationLoop119Toggle() {
    val enabled = !BiliClient.prefs.v119subtitleAnimationLoop119
    BiliClient.prefs.v119subtitleAnimationLoop119 = enabled
    AppToast.show(this, "Subtitle Animation Loop119: ${if (enabled) "ON" else "OFF"}")
}

// v120.136: Audio Dynamic Mono Fold
internal fun PlayerActivity.showV120AudioDynamicMonoFoldToggle() {
    val enabled = !BiliClient.prefs.v120audioDynamicMonoFold
    BiliClient.prefs.v120audioDynamicMonoFold = enabled
    AppToast.show(this, "Audio Dynamic Mono Fold: ${if (enabled) "ON" else "OFF"}")
}

// v120.137: Danmaku Font BG Fill Opacity119
internal fun PlayerActivity.showV120DanmakuFontBgFillOpacity119Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v120danmakuFontBgFillOpacity119).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity119",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120danmakuFontBgFillOpacity119 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity119: $value")
    }
}

// v120.138: Subtitle Animation Loop120
internal fun PlayerActivity.showV120SubtitleAnimationLoop120Toggle() {
    val enabled = !BiliClient.prefs.v120subtitleAnimationLoop120
    BiliClient.prefs.v120subtitleAnimationLoop120 = enabled
    AppToast.show(this, "Subtitle Animation Loop120: ${if (enabled) "ON" else "OFF"}")
}

// v120.139: Gesture Tap Custom Action
internal fun PlayerActivity.showV120GestureTapCustomActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v120gestureTapCustomAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Custom Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120gestureTapCustomAction = value
        AppToast.show(this, "Gesture Tap Custom Action: $value")
    }
}

// v120.140: Cast Video Duotone Custom
internal fun PlayerActivity.showV120CastVideoDuotoneCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v120castVideoDuotoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Duotone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120castVideoDuotoneCustom = value
        AppToast.show(this, "Cast Video Duotone Custom: $value")
    }
}

// v120.141: Playlist Auto Save Position Toggle
internal fun PlayerActivity.showV120PlaylistAutoSavePositionToggleToggle() {
    val enabled = !BiliClient.prefs.v120playlistAutoSavePositionToggle
    BiliClient.prefs.v120playlistAutoSavePositionToggle = enabled
    AppToast.show(this, "Playlist Auto Save Position Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v120.142: Cache Verify Integrity On Start
internal fun PlayerActivity.showV120CacheVerifyIntegrityOnStartToggle() {
    val enabled = !BiliClient.prefs.v120cacheVerifyIntegrityOnStart
    BiliClient.prefs.v120cacheVerifyIntegrityOnStart = enabled
    AppToast.show(this, "Cache Verify Integrity On Start: ${if (enabled) "ON" else "OFF"}")
}

// v120.143: Progress Bar Custom Scale Max
internal fun PlayerActivity.showV120ProgressBarCustomScaleMaxDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v120progressBarCustomScaleMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120progressBarCustomScaleMax = value
        AppToast.show(this, "Progress Bar Custom Scale Max: $value")
    }
}

// v120.144: Volume Stereo Width Custom
internal fun PlayerActivity.showV120VolumeStereoWidthCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v120volumeStereoWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Stereo Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120volumeStereoWidthCustom = value
        AppToast.show(this, "Volume Stereo Width Custom: $value")
    }
}

// v120.145: History Search Whole Word
internal fun PlayerActivity.showV120HistorySearchWholeWordToggle() {
    val enabled = !BiliClient.prefs.v120historySearchWholeWord
    BiliClient.prefs.v120historySearchWholeWord = enabled
    AppToast.show(this, "History Search Whole Word: ${if (enabled) "ON" else "OFF"}")
}

// v120.146: Playback Speed Auto Adjust Quality
internal fun PlayerActivity.showV120PlaybackSpeedAutoAdjustQualityToggle() {
    val enabled = !BiliClient.prefs.v120playbackSpeedAutoAdjustQuality
    BiliClient.prefs.v120playbackSpeedAutoAdjustQuality = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Quality: ${if (enabled) "ON" else "OFF"}")
}

// v120.147: Screenshot Auto Share KakaoTalk
internal fun PlayerActivity.showV120ScreenshotAutoShareKakaoTalkToggle() {
    val enabled = !BiliClient.prefs.v120screenshotAutoShareKakaoTalk
    BiliClient.prefs.v120screenshotAutoShareKakaoTalk = enabled
    AppToast.show(this, "Screenshot Auto Share KakaoTalk: ${if (enabled) "ON" else "OFF"}")
}

// v120.148: Video PIP Opacity Custom
internal fun PlayerActivity.showV120VideoPIPOpacityCustomDialog() {
    val options = listOf(50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v120videoPIPOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120videoPIPOpacityCustom = value
        AppToast.show(this, "Video PIP Opacity Custom: $value")
    }
}

// v120.149: Danmaku Font BG Fill Angle119
internal fun PlayerActivity.showV120DanmakuFontBgFillAngle119Dialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v120danmakuFontBgFillAngle119).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Angle119",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120danmakuFontBgFillAngle119 = value
        AppToast.show(this, "Danmaku Font BG Fill Angle119: $value")
    }
}

// v120.150: Subtitle Animation Delay120
internal fun PlayerActivity.showV120SubtitleAnimationDelay120Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v120subtitleAnimationDelay120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120subtitleAnimationDelay120 = value
        AppToast.show(this, "Subtitle Animation Delay120: $value")
    }
}

// v121.1: Audio Ducking Ratio Custom
internal fun PlayerActivity.showV121AudioDuckingRatioCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121audioDuckingRatioCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Ducking Ratio Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121audioDuckingRatioCustom = value
        AppToast.show(this, "Audio Ducking Ratio Custom: $value")
    }
}

// v121.2: Danmaku Font BG Fill Angle120
internal fun PlayerActivity.showV121DanmakuFontBgFillAngle120Dialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v121danmakuFontBgFillAngle120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Angle120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121danmakuFontBgFillAngle120 = value
        AppToast.show(this, "Danmaku Font BG Fill Angle120: $value")
    }
}

// v121.3: Subtitle Animation Delay121
internal fun PlayerActivity.showV121SubtitleAnimationDelay121Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v121subtitleAnimationDelay121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121subtitleAnimationDelay121 = value
        AppToast.show(this, "Subtitle Animation Delay121: $value")
    }
}

// v121.4: Gesture Tap Shift Action
internal fun PlayerActivity.showV121GestureTapShiftActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121gestureTapShiftAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121gestureTapShiftAction = value
        AppToast.show(this, "Gesture Tap Shift Action: $value")
    }
}

// v121.5: Cast Video Flip Horizontal
internal fun PlayerActivity.showV121CastVideoFlipHorizontalToggle() {
    val enabled = !BiliClient.prefs.v121castVideoFlipHorizontal
    BiliClient.prefs.v121castVideoFlipHorizontal = enabled
    AppToast.show(this, "Cast Video Flip Horizontal: ${if (enabled) "ON" else "OFF"}")
}

// v121.6: Playlist Auto Resume Queue
internal fun PlayerActivity.showV121PlaylistAutoResumeQueueToggle() {
    val enabled = !BiliClient.prefs.v121playlistAutoResumeQueue
    BiliClient.prefs.v121playlistAutoResumeQueue = enabled
    AppToast.show(this, "Playlist Auto Resume Queue: ${if (enabled) "ON" else "OFF"}")
}

// v121.7: Cache Smart Pinning Toggle
internal fun PlayerActivity.showV121CacheSmartPinningToggleToggle() {
    val enabled = !BiliClient.prefs.v121cacheSmartPinningToggle
    BiliClient.prefs.v121cacheSmartPinningToggle = enabled
    AppToast.show(this, "Cache Smart Pinning Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v121.8: Progress Bar Custom Live Color
internal fun PlayerActivity.showV121ProgressBarCustomLiveColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121progressBarCustomLiveColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121progressBarCustomLiveColor = value
        AppToast.show(this, "Progress Bar Custom Live Color: $value")
    }
}

// v121.9: Volume Mono Downmix Toggle
internal fun PlayerActivity.showV121VolumeMonoDownmixToggleToggle() {
    val enabled = !BiliClient.prefs.v121volumeMonoDownmixToggle
    BiliClient.prefs.v121volumeMonoDownmixToggle = enabled
    AppToast.show(this, "Volume Mono Downmix Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v121.10: History Search Scope121
internal fun PlayerActivity.showV121HistorySearchScope121Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121historySearchScope121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121historySearchScope121 = value
        AppToast.show(this, "History Search Scope121: $value")
    }
}

// v121.11: Playback Speed Presets Custom
internal fun PlayerActivity.showV121PlaybackSpeedPresetsCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121playbackSpeedPresetsCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121playbackSpeedPresetsCustom = value
        AppToast.show(this, "Playback Speed Presets Custom: $value")
    }
}

// v121.12: Screenshot Auto Share QQ
internal fun PlayerActivity.showV121ScreenshotAutoShareQQToggle() {
    val enabled = !BiliClient.prefs.v121screenshotAutoShareQQ
    BiliClient.prefs.v121screenshotAutoShareQQ = enabled
    AppToast.show(this, "Screenshot Auto Share QQ: ${if (enabled) "ON" else "OFF"}")
}

// v121.13: Video PIP Swipe Dismiss
internal fun PlayerActivity.showV121VideoPIPSwipeDismissToggle() {
    val enabled = !BiliClient.prefs.v121videoPIPSwipeDismiss
    BiliClient.prefs.v121videoPIPSwipeDismiss = enabled
    AppToast.show(this, "Video PIP Swipe Dismiss: ${if (enabled) "ON" else "OFF"}")
}

// v121.14: Danmaku Font BG Fill Start Color
internal fun PlayerActivity.showV121DanmakuFontBgFillStartColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121danmakuFontBgFillStartColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Start Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121danmakuFontBgFillStartColor = value
        AppToast.show(this, "Danmaku Font BG Fill Start Color: $value")
    }
}

// v121.15: Subtitle Animation Fade In121
internal fun PlayerActivity.showV121SubtitleAnimationFadeIn121Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v121subtitleAnimationFadeIn121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121subtitleAnimationFadeIn121 = value
        AppToast.show(this, "Subtitle Animation Fade In121: $value")
    }
}

// v122.16: Audio Fade In Duration122
internal fun PlayerActivity.showV122AudioFadeInDuration122Dialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v122audioFadeInDuration122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Fade In Duration122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122audioFadeInDuration122 = value
        AppToast.show(this, "Audio Fade In Duration122: $value")
    }
}

// v122.17: Danmaku Font BG Fill End Color
internal fun PlayerActivity.showV122DanmakuFontBgFillEndColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122danmakuFontBgFillEndColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill End Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122danmakuFontBgFillEndColor = value
        AppToast.show(this, "Danmaku Font BG Fill End Color: $value")
    }
}

// v122.18: Subtitle Animation Fade Out122
internal fun PlayerActivity.showV122SubtitleAnimationFadeOut122Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v122subtitleAnimationFadeOut122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122subtitleAnimationFadeOut122 = value
        AppToast.show(this, "Subtitle Animation Fade Out122: $value")
    }
}

// v122.19: Gesture Tap Ctrl Action
internal fun PlayerActivity.showV122GestureTapCtrlActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122gestureTapCtrlAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Ctrl Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122gestureTapCtrlAction = value
        AppToast.show(this, "Gesture Tap Ctrl Action: $value")
    }
}

// v122.20: Cast Video Flip Vertical
internal fun PlayerActivity.showV122CastVideoFlipVerticalToggle() {
    val enabled = !BiliClient.prefs.v122castVideoFlipVertical
    BiliClient.prefs.v122castVideoFlipVertical = enabled
    AppToast.show(this, "Cast Video Flip Vertical: ${if (enabled) "ON" else "OFF"}")
}

// v122.21: Playlist Auto Resume Last Position
internal fun PlayerActivity.showV122PlaylistAutoResumeLastPositionToggle() {
    val enabled = !BiliClient.prefs.v122playlistAutoResumeLastPosition
    BiliClient.prefs.v122playlistAutoResumeLastPosition = enabled
    AppToast.show(this, "Playlist Auto Resume Last Position: ${if (enabled) "ON" else "OFF"}")
}

// v122.22: Cache Smart Pinning Max Size
internal fun PlayerActivity.showV122CacheSmartPinningMaxSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122cacheSmartPinningMaxSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Max Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122cacheSmartPinningMaxSize = value
        AppToast.show(this, "Cache Smart Pinning Max Size: $value")
    }
}

// v122.23: Progress Bar Custom Live Width
internal fun PlayerActivity.showV122ProgressBarCustomLiveWidthDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v122progressBarCustomLiveWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122progressBarCustomLiveWidth = value
        AppToast.show(this, "Progress Bar Custom Live Width: $value")
    }
}

// v122.24: Volume Mono Downmix Balance
internal fun PlayerActivity.showV122VolumeMonoDownmixBalanceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v122volumeMonoDownmixBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Mono Downmix Balance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122volumeMonoDownmixBalance = value
        AppToast.show(this, "Volume Mono Downmix Balance: $value")
    }
}

// v122.25: History Search Scope122
internal fun PlayerActivity.showV122HistorySearchScope122Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122historySearchScope122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122historySearchScope122 = value
        AppToast.show(this, "History Search Scope122: $value")
    }
}

// v122.26: Playback Speed Presets List
internal fun PlayerActivity.showV122PlaybackSpeedPresetsListDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122playbackSpeedPresetsList).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets List",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122playbackSpeedPresetsList = value
        AppToast.show(this, "Playback Speed Presets List: $value")
    }
}

// v122.27: Screenshot Auto Share WeChat
internal fun PlayerActivity.showV122ScreenshotAutoShareWeChatToggle() {
    val enabled = !BiliClient.prefs.v122screenshotAutoShareWeChat
    BiliClient.prefs.v122screenshotAutoShareWeChat = enabled
    AppToast.show(this, "Screenshot Auto Share WeChat: ${if (enabled) "ON" else "OFF"}")
}

// v122.28: Video PIP Always On Top
internal fun PlayerActivity.showV122VideoPIPAlwaysOnTopToggle() {
    val enabled = !BiliClient.prefs.v122videoPIPAlwaysOnTop
    BiliClient.prefs.v122videoPIPAlwaysOnTop = enabled
    AppToast.show(this, "Video PIP Always On Top: ${if (enabled) "ON" else "OFF"}")
}

// v122.29: Danmaku Font BG Fill Radius
internal fun PlayerActivity.showV122DanmakuFontBgFillRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v122danmakuFontBgFillRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122danmakuFontBgFillRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Radius: $value")
    }
}

// v122.30: Subtitle Animation Fade Out121
internal fun PlayerActivity.showV122SubtitleAnimationFadeOut121Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v122subtitleAnimationFadeOut121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122subtitleAnimationFadeOut121 = value
        AppToast.show(this, "Subtitle Animation Fade Out121: $value")
    }
}

// v123.31: Audio Fade Out Duration123
internal fun PlayerActivity.showV123AudioFadeOutDuration123Dialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v123audioFadeOutDuration123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Fade Out Duration123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123audioFadeOutDuration123 = value
        AppToast.show(this, "Audio Fade Out Duration123: $value")
    }
}

// v123.32: Danmaku Font BG Fill Opacity120
internal fun PlayerActivity.showV123DanmakuFontBgFillOpacity120Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v123danmakuFontBgFillOpacity120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123danmakuFontBgFillOpacity120 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity120: $value")
    }
}

// v123.33: Subtitle Animation Fade In123
internal fun PlayerActivity.showV123SubtitleAnimationFadeIn123Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v123subtitleAnimationFadeIn123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123subtitleAnimationFadeIn123 = value
        AppToast.show(this, "Subtitle Animation Fade In123: $value")
    }
}

// v123.34: Gesture Tap Alt Action
internal fun PlayerActivity.showV123GestureTapAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123gestureTapAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123gestureTapAltAction = value
        AppToast.show(this, "Gesture Tap Alt Action: $value")
    }
}

// v123.35: Cast Video Rotate Custom
internal fun PlayerActivity.showV123CastVideoRotateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123castVideoRotateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Rotate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123castVideoRotateCustom = value
        AppToast.show(this, "Cast Video Rotate Custom: $value")
    }
}

// v123.36: Playlist Auto Sort By Length
internal fun PlayerActivity.showV123PlaylistAutoSortByLengthToggle() {
    val enabled = !BiliClient.prefs.v123playlistAutoSortByLength
    BiliClient.prefs.v123playlistAutoSortByLength = enabled
    AppToast.show(this, "Playlist Auto Sort By Length: ${if (enabled) "ON" else "OFF"}")
}

// v123.37: Cache Smart Pinning Expire
internal fun PlayerActivity.showV123CacheSmartPinningExpireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123cacheSmartPinningExpire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Expire",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123cacheSmartPinningExpire = value
        AppToast.show(this, "Cache Smart Pinning Expire: $value")
    }
}

// v123.38: Progress Bar Custom Live Height
internal fun PlayerActivity.showV123ProgressBarCustomLiveHeightDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v123progressBarCustomLiveHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Height",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123progressBarCustomLiveHeight = value
        AppToast.show(this, "Progress Bar Custom Live Height: $value")
    }
}

// v123.39: Volume Headroom Custom
internal fun PlayerActivity.showV123VolumeHeadroomCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123volumeHeadroomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Headroom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123volumeHeadroomCustom = value
        AppToast.show(this, "Volume Headroom Custom: $value")
    }
}

// v123.40: History Auto Clean123
internal fun PlayerActivity.showV123HistoryAutoClean123Toggle() {
    val enabled = !BiliClient.prefs.v123historyAutoClean123
    BiliClient.prefs.v123historyAutoClean123 = enabled
    AppToast.show(this, "History Auto Clean123: ${if (enabled) "ON" else "OFF"}")
}

// v123.41: Playback Speed Presets Custom123
internal fun PlayerActivity.showV123PlaybackSpeedPresetsCustom123Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123playbackSpeedPresetsCustom123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Custom123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123playbackSpeedPresetsCustom123 = value
        AppToast.show(this, "Playback Speed Presets Custom123: $value")
    }
}

// v123.42: Screenshot Auto Share Douyin
internal fun PlayerActivity.showV123ScreenshotAutoShareDouyinToggle() {
    val enabled = !BiliClient.prefs.v123screenshotAutoShareDouyin
    BiliClient.prefs.v123screenshotAutoShareDouyin = enabled
    AppToast.show(this, "Screenshot Auto Share Douyin: ${if (enabled) "ON" else "OFF"}")
}

// v123.43: Video PIP Resize Handle
internal fun PlayerActivity.showV123VideoPIPResizeHandleToggle() {
    val enabled = !BiliClient.prefs.v123videoPIPResizeHandle
    BiliClient.prefs.v123videoPIPResizeHandle = enabled
    AppToast.show(this, "Video PIP Resize Handle: ${if (enabled) "ON" else "OFF"}")
}

// v123.44: Danmaku Font BG Fill Border Toggle
internal fun PlayerActivity.showV123DanmakuFontBgFillBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v123danmakuFontBgFillBorderToggle
    BiliClient.prefs.v123danmakuFontBgFillBorderToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v123.45: Subtitle Animation Fade Out123
internal fun PlayerActivity.showV123SubtitleAnimationFadeOut123Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v123subtitleAnimationFadeOut123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123subtitleAnimationFadeOut123 = value
        AppToast.show(this, "Subtitle Animation Fade Out123: $value")
    }
}

// v124.46: Audio Reverb Preset Custom
internal fun PlayerActivity.showV124AudioReverbPresetCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124audioReverbPresetCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Preset Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124audioReverbPresetCustom = value
        AppToast.show(this, "Audio Reverb Preset Custom: $value")
    }
}

// v124.47: Danmaku Font BG Fill Border Width
internal fun PlayerActivity.showV124DanmakuFontBgFillBorderWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124danmakuFontBgFillBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124danmakuFontBgFillBorderWidth = value
        AppToast.show(this, "Danmaku Font BG Fill Border Width: $value")
    }
}

// v124.48: Subtitle Animation Scale124
internal fun PlayerActivity.showV124SubtitleAnimationScale124Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v124subtitleAnimationScale124).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale124",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124subtitleAnimationScale124 = value
        AppToast.show(this, "Subtitle Animation Scale124: $value")
    }
}

// v124.49: Gesture Tap Shift Ctrl Action
internal fun PlayerActivity.showV124GestureTapShiftCtrlActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124gestureTapShiftCtrlAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Ctrl Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124gestureTapShiftCtrlAction = value
        AppToast.show(this, "Gesture Tap Shift Ctrl Action: $value")
    }
}

// v124.50: Cast Video Crop Custom
internal fun PlayerActivity.showV124CastVideoCropCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124castVideoCropCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Crop Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124castVideoCropCustom = value
        AppToast.show(this, "Cast Video Crop Custom: $value")
    }
}

// v124.51: Playlist Auto Sort By Title
internal fun PlayerActivity.showV124PlaylistAutoSortByTitleToggle() {
    val enabled = !BiliClient.prefs.v124playlistAutoSortByTitle
    BiliClient.prefs.v124playlistAutoSortByTitle = enabled
    AppToast.show(this, "Playlist Auto Sort By Title: ${if (enabled) "ON" else "OFF"}")
}

// v124.52: Cache Smart Pinning Priority
internal fun PlayerActivity.showV124CacheSmartPinningPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124cacheSmartPinningPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124cacheSmartPinningPriority = value
        AppToast.show(this, "Cache Smart Pinning Priority: $value")
    }
}

// v124.53: Progress Bar Custom Thumb Color124
internal fun PlayerActivity.showV124ProgressBarCustomThumbColor124Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124progressBarCustomThumbColor124).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color124",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124progressBarCustomThumbColor124 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color124: $value")
    }
}

// v124.54: Volume Replay Gain Album
internal fun PlayerActivity.showV124VolumeReplayGainAlbumToggle() {
    val enabled = !BiliClient.prefs.v124volumeReplayGainAlbum
    BiliClient.prefs.v124volumeReplayGainAlbum = enabled
    AppToast.show(this, "Volume Replay Gain Album: ${if (enabled) "ON" else "OFF"}")
}

// v124.55: History Auto Clean124
internal fun PlayerActivity.showV124HistoryAutoClean124Toggle() {
    val enabled = !BiliClient.prefs.v124historyAutoClean124
    BiliClient.prefs.v124historyAutoClean124 = enabled
    AppToast.show(this, "History Auto Clean124: ${if (enabled) "ON" else "OFF"}")
}

// v124.56: Playback Speed Presets Toggle
internal fun PlayerActivity.showV124PlaybackSpeedPresetsToggleToggle() {
    val enabled = !BiliClient.prefs.v124playbackSpeedPresetsToggle
    BiliClient.prefs.v124playbackSpeedPresetsToggle = enabled
    AppToast.show(this, "Playback Speed Presets Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v124.57: Screenshot Auto Share TikTok
internal fun PlayerActivity.showV124ScreenshotAutoShareTikTokToggle() {
    val enabled = !BiliClient.prefs.v124screenshotAutoShareTikTok
    BiliClient.prefs.v124screenshotAutoShareTikTok = enabled
    AppToast.show(this, "Screenshot Auto Share TikTok: ${if (enabled) "ON" else "OFF"}")
}

// v124.58: Video PIP Keyboard Control
internal fun PlayerActivity.showV124VideoPIPKeyboardControlToggle() {
    val enabled = !BiliClient.prefs.v124videoPIPKeyboardControl
    BiliClient.prefs.v124videoPIPKeyboardControl = enabled
    AppToast.show(this, "Video PIP Keyboard Control: ${if (enabled) "ON" else "OFF"}")
}

// v124.59: Danmaku Font BG Fill Border Color
internal fun PlayerActivity.showV124DanmakuFontBgFillBorderColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124danmakuFontBgFillBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124danmakuFontBgFillBorderColor = value
        AppToast.show(this, "Danmaku Font BG Fill Border Color: $value")
    }
}

// v124.60: Subtitle Animation Scale125
internal fun PlayerActivity.showV124SubtitleAnimationScale125Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v124subtitleAnimationScale125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124subtitleAnimationScale125 = value
        AppToast.show(this, "Subtitle Animation Scale125: $value")
    }
}

// v125.61: Audio Reverb Room Size
internal fun PlayerActivity.showV125AudioReverbRoomSizeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v125audioReverbRoomSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Room Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125audioReverbRoomSize = value
        AppToast.show(this, "Audio Reverb Room Size: $value")
    }
}

// v125.62: Danmaku Font BG Fill Border Radius
internal fun PlayerActivity.showV125DanmakuFontBgFillBorderRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v125danmakuFontBgFillBorderRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125danmakuFontBgFillBorderRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Border Radius: $value")
    }
}

// v125.63: Subtitle Animation Translate125
internal fun PlayerActivity.showV125SubtitleAnimationTranslate125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125subtitleAnimationTranslate125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125subtitleAnimationTranslate125 = value
        AppToast.show(this, "Subtitle Animation Translate125: $value")
    }
}

// v125.64: Gesture Tap Shift Alt Action
internal fun PlayerActivity.showV125GestureTapShiftAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125gestureTapShiftAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125gestureTapShiftAltAction = value
        AppToast.show(this, "Gesture Tap Shift Alt Action: $value")
    }
}

// v125.65: Cast Video Scale Custom
internal fun PlayerActivity.showV125CastVideoScaleCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v125castVideoScaleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Scale Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125castVideoScaleCustom = value
        AppToast.show(this, "Cast Video Scale Custom: $value")
    }
}

// v125.66: Playlist Auto Sort By Upload Date
internal fun PlayerActivity.showV125PlaylistAutoSortByUploadDateToggle() {
    val enabled = !BiliClient.prefs.v125playlistAutoSortByUploadDate
    BiliClient.prefs.v125playlistAutoSortByUploadDate = enabled
    AppToast.show(this, "Playlist Auto Sort By Upload Date: ${if (enabled) "ON" else "OFF"}")
}

// v125.67: Cache Smart Pinning Refresh
internal fun PlayerActivity.showV125CacheSmartPinningRefreshToggle() {
    val enabled = !BiliClient.prefs.v125cacheSmartPinningRefresh
    BiliClient.prefs.v125cacheSmartPinningRefresh = enabled
    AppToast.show(this, "Cache Smart Pinning Refresh: ${if (enabled) "ON" else "OFF"}")
}

// v125.68: Progress Bar Custom Thumb Shape125
internal fun PlayerActivity.showV125ProgressBarCustomThumbShape125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125progressBarCustomThumbShape125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Shape125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125progressBarCustomThumbShape125 = value
        AppToast.show(this, "Progress Bar Custom Thumb Shape125: $value")
    }
}

// v125.69: Volume Replay Gain Track
internal fun PlayerActivity.showV125VolumeReplayGainTrackToggle() {
    val enabled = !BiliClient.prefs.v125volumeReplayGainTrack
    BiliClient.prefs.v125volumeReplayGainTrack = enabled
    AppToast.show(this, "Volume Replay Gain Track: ${if (enabled) "ON" else "OFF"}")
}

// v125.70: History Auto Clean125
internal fun PlayerActivity.showV125HistoryAutoClean125Toggle() {
    val enabled = !BiliClient.prefs.v125historyAutoClean125
    BiliClient.prefs.v125historyAutoClean125 = enabled
    AppToast.show(this, "History Auto Clean125: ${if (enabled) "ON" else "OFF"}")
}

// v125.71: Playback Speed Presets Range
internal fun PlayerActivity.showV125PlaybackSpeedPresetsRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125playbackSpeedPresetsRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125playbackSpeedPresetsRange = value
        AppToast.show(this, "Playback Speed Presets Range: $value")
    }
}

// v125.72: Screenshot Auto Share Snapchat
internal fun PlayerActivity.showV125ScreenshotAutoShareSnapchatToggle() {
    val enabled = !BiliClient.prefs.v125screenshotAutoShareSnapchat
    BiliClient.prefs.v125screenshotAutoShareSnapchat = enabled
    AppToast.show(this, "Screenshot Auto Share Snapchat: ${if (enabled) "ON" else "OFF"}")
}

// v125.73: Video PIP Auto Hide Delay
internal fun PlayerActivity.showV125VideoPIPAutoHideDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125videoPIPAutoHideDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Auto Hide Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125videoPIPAutoHideDelay = value
        AppToast.show(this, "Video PIP Auto Hide Delay: $value")
    }
}

// v125.74: Danmaku Font BG Fill Border Opacity
internal fun PlayerActivity.showV125DanmakuFontBgFillBorderOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v125danmakuFontBgFillBorderOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125danmakuFontBgFillBorderOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Border Opacity: $value")
    }
}

// v125.75: Subtitle Animation Rotate125
internal fun PlayerActivity.showV125SubtitleAnimationRotate125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125subtitleAnimationRotate125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125subtitleAnimationRotate125 = value
        AppToast.show(this, "Subtitle Animation Rotate125: $value")
    }
}

// v126.76: Audio Reverb Damping
internal fun PlayerActivity.showV126AudioReverbDampingDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v126audioReverbDamping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Damping",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126audioReverbDamping = value
        AppToast.show(this, "Audio Reverb Damping: $value")
    }
}

// v126.77: Danmaku Font BG Fill Border Dash Toggle
internal fun PlayerActivity.showV126DanmakuFontBgFillBorderDashToggleToggle() {
    val enabled = !BiliClient.prefs.v126danmakuFontBgFillBorderDashToggle
    BiliClient.prefs.v126danmakuFontBgFillBorderDashToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Border Dash Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v126.78: Subtitle Animation Rotate126
internal fun PlayerActivity.showV126SubtitleAnimationRotate126Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126subtitleAnimationRotate126).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate126",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126subtitleAnimationRotate126 = value
        AppToast.show(this, "Subtitle Animation Rotate126: $value")
    }
}

// v126.79: Gesture Tap Ctrl Alt Action
internal fun PlayerActivity.showV126GestureTapCtrlAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126gestureTapCtrlAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Ctrl Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126gestureTapCtrlAltAction = value
        AppToast.show(this, "Gesture Tap Ctrl Alt Action: $value")
    }
}

// v126.80: Cast Video Mirror Flip
internal fun PlayerActivity.showV126CastVideoMirrorFlipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126castVideoMirrorFlip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Mirror Flip",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126castVideoMirrorFlip = value
        AppToast.show(this, "Cast Video Mirror Flip: $value")
    }
}

// v126.81: Playlist Auto Sort By Random
internal fun PlayerActivity.showV126PlaylistAutoSortByRandomToggle() {
    val enabled = !BiliClient.prefs.v126playlistAutoSortByRandom
    BiliClient.prefs.v126playlistAutoSortByRandom = enabled
    AppToast.show(this, "Playlist Auto Sort By Random: ${if (enabled) "ON" else "OFF"}")
}

// v126.82: Cache Smart Pinning On Low Space
internal fun PlayerActivity.showV126CacheSmartPinningOnLowSpaceToggle() {
    val enabled = !BiliClient.prefs.v126cacheSmartPinningOnLowSpace
    BiliClient.prefs.v126cacheSmartPinningOnLowSpace = enabled
    AppToast.show(this, "Cache Smart Pinning On Low Space: ${if (enabled) "ON" else "OFF"}")
}

// v126.83: Progress Bar Custom Thumb Glow126
internal fun PlayerActivity.showV126ProgressBarCustomThumbGlow126Toggle() {
    val enabled = !BiliClient.prefs.v126progressBarCustomThumbGlow126
    BiliClient.prefs.v126progressBarCustomThumbGlow126 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Glow126: ${if (enabled) "ON" else "OFF"}")
}

// v126.84: Volume Replay Gain Preamp
internal fun PlayerActivity.showV126VolumeReplayGainPreampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126volumeReplayGainPreamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Replay Gain Preamp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126volumeReplayGainPreamp = value
        AppToast.show(this, "Volume Replay Gain Preamp: $value")
    }
}

// v126.85: History Auto Clean126
internal fun PlayerActivity.showV126HistoryAutoClean126Toggle() {
    val enabled = !BiliClient.prefs.v126historyAutoClean126
    BiliClient.prefs.v126historyAutoClean126 = enabled
    AppToast.show(this, "History Auto Clean126: ${if (enabled) "ON" else "OFF"}")
}

// v126.86: Playback Speed Presets Label
internal fun PlayerActivity.showV126PlaybackSpeedPresetsLabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126playbackSpeedPresetsLabel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Label",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126playbackSpeedPresetsLabel = value
        AppToast.show(this, "Playback Speed Presets Label: $value")
    }
}

// v126.87: Screenshot Auto Share Reddit
internal fun PlayerActivity.showV126ScreenshotAutoShareRedditToggle() {
    val enabled = !BiliClient.prefs.v126screenshotAutoShareReddit
    BiliClient.prefs.v126screenshotAutoShareReddit = enabled
    AppToast.show(this, "Screenshot Auto Share Reddit: ${if (enabled) "ON" else "OFF"}")
}

// v126.88: Video PIP Follow Scroll
internal fun PlayerActivity.showV126VideoPIPFollowScrollToggle() {
    val enabled = !BiliClient.prefs.v126videoPIPFollowScroll
    BiliClient.prefs.v126videoPIPFollowScroll = enabled
    AppToast.show(this, "Video PIP Follow Scroll: ${if (enabled) "ON" else "OFF"}")
}

// v126.89: Danmaku Font BG Fill Border Dash Width
internal fun PlayerActivity.showV126DanmakuFontBgFillBorderDashWidthDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v126danmakuFontBgFillBorderDashWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Dash Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126danmakuFontBgFillBorderDashWidth = value
        AppToast.show(this, "Danmaku Font BG Fill Border Dash Width: $value")
    }
}

// v126.90: Subtitle Animation Translate126
internal fun PlayerActivity.showV126SubtitleAnimationTranslate126Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126subtitleAnimationTranslate126).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate126",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126subtitleAnimationTranslate126 = value
        AppToast.show(this, "Subtitle Animation Translate126: $value")
    }
}

// v127.91: Audio Reverb Wet Dry Mix
internal fun PlayerActivity.showV127AudioReverbWetDryMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127audioReverbWetDryMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Wet Dry Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127audioReverbWetDryMix = value
        AppToast.show(this, "Audio Reverb Wet Dry Mix: $value")
    }
}

// v127.92: Danmaku Font BG Fill Border Dash Gap
internal fun PlayerActivity.showV127DanmakuFontBgFillBorderDashGapDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v127danmakuFontBgFillBorderDashGap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Dash Gap",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127danmakuFontBgFillBorderDashGap = value
        AppToast.show(this, "Danmaku Font BG Fill Border Dash Gap: $value")
    }
}

// v127.93: Subtitle Animation Blur127
internal fun PlayerActivity.showV127SubtitleAnimationBlur127Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127subtitleAnimationBlur127).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur127",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127subtitleAnimationBlur127 = value
        AppToast.show(this, "Subtitle Animation Blur127: $value")
    }
}

// v127.94: Gesture Tap Multi Finger Action
internal fun PlayerActivity.showV127GestureTapMultiFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v127gestureTapMultiFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Multi Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127gestureTapMultiFingerAction = value
        AppToast.show(this, "Gesture Tap Multi Finger Action: $value")
    }
}

// v127.95: Cast Video Zoom Custom
internal fun PlayerActivity.showV127CastVideoZoomCustomDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v127castVideoZoomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Zoom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127castVideoZoomCustom = value
        AppToast.show(this, "Cast Video Zoom Custom: $value")
    }
}

// v127.96: Playlist Auto Group By Similarity
internal fun PlayerActivity.showV127PlaylistAutoGroupBySimilarityToggle() {
    val enabled = !BiliClient.prefs.v127playlistAutoGroupBySimilarity
    BiliClient.prefs.v127playlistAutoGroupBySimilarity = enabled
    AppToast.show(this, "Playlist Auto Group By Similarity: ${if (enabled) "ON" else "OFF"}")
}

// v127.97: Cache Smart Pinning Alert
internal fun PlayerActivity.showV127CacheSmartPinningAlertToggle() {
    val enabled = !BiliClient.prefs.v127cacheSmartPinningAlert
    BiliClient.prefs.v127cacheSmartPinningAlert = enabled
    AppToast.show(this, "Cache Smart Pinning Alert: ${if (enabled) "ON" else "OFF"}")
}

// v127.98: Progress Bar Custom Thumb Shadow127
internal fun PlayerActivity.showV127ProgressBarCustomThumbShadow127Toggle() {
    val enabled = !BiliClient.prefs.v127progressBarCustomThumbShadow127
    BiliClient.prefs.v127progressBarCustomThumbShadow127 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Shadow127: ${if (enabled) "ON" else "OFF"}")
}

// v127.99: Volume Replay Gain Clip Protect
internal fun PlayerActivity.showV127VolumeReplayGainClipProtectToggle() {
    val enabled = !BiliClient.prefs.v127volumeReplayGainClipProtect
    BiliClient.prefs.v127volumeReplayGainClipProtect = enabled
    AppToast.show(this, "Volume Replay Gain Clip Protect: ${if (enabled) "ON" else "OFF"}")
}

// v127.100: History Auto Clean127
internal fun PlayerActivity.showV127HistoryAutoClean127Toggle() {
    val enabled = !BiliClient.prefs.v127historyAutoClean127
    BiliClient.prefs.v127historyAutoClean127 = enabled
    AppToast.show(this, "History Auto Clean127: ${if (enabled) "ON" else "OFF"}")
}

// v127.101: Playback Speed Presets Adaptive
internal fun PlayerActivity.showV127PlaybackSpeedPresetsAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v127playbackSpeedPresetsAdaptive
    BiliClient.prefs.v127playbackSpeedPresetsAdaptive = enabled
    AppToast.show(this, "Playback Speed Presets Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v127.102: Screenshot Auto Share VK
internal fun PlayerActivity.showV127ScreenshotAutoShareVKToggle() {
    val enabled = !BiliClient.prefs.v127screenshotAutoShareVK
    BiliClient.prefs.v127screenshotAutoShareVK = enabled
    AppToast.show(this, "Screenshot Auto Share VK: ${if (enabled) "ON" else "OFF"}")
}

// v127.103: Video PIP Snap To Edge
internal fun PlayerActivity.showV127VideoPIPSnapToEdgeToggle() {
    val enabled = !BiliClient.prefs.v127videoPIPSnapToEdge
    BiliClient.prefs.v127videoPIPSnapToEdge = enabled
    AppToast.show(this, "Video PIP Snap To Edge: ${if (enabled) "ON" else "OFF"}")
}

// v127.104: Danmaku Font BG Fill Border Type
internal fun PlayerActivity.showV127DanmakuFontBgFillBorderTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v127danmakuFontBgFillBorderType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127danmakuFontBgFillBorderType = value
        AppToast.show(this, "Danmaku Font BG Fill Border Type: $value")
    }
}

// v127.105: Subtitle Animation Blur128
internal fun PlayerActivity.showV127SubtitleAnimationBlur128Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127subtitleAnimationBlur128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127subtitleAnimationBlur128 = value
        AppToast.show(this, "Subtitle Animation Blur128: $value")
    }
}

// v128.106: Audio Reverb Pre Delay
internal fun PlayerActivity.showV128AudioReverbPreDelayDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v128audioReverbPreDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Pre Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128audioReverbPreDelay = value
        AppToast.show(this, "Audio Reverb Pre Delay: $value")
    }
}

// v128.107: Danmaku Font BG Fill Border Type127
internal fun PlayerActivity.showV128DanmakuFontBgFillBorderType127Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128danmakuFontBgFillBorderType127).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Type127",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128danmakuFontBgFillBorderType127 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Type127: $value")
    }
}

// v128.108: Subtitle Animation Blur129
internal fun PlayerActivity.showV128SubtitleAnimationBlur129Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v128subtitleAnimationBlur129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128subtitleAnimationBlur129 = value
        AppToast.show(this, "Subtitle Animation Blur129: $value")
    }
}

// v128.109: Gesture Tap Finger Count
internal fun PlayerActivity.showV128GestureTapFingerCountDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v128gestureTapFingerCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Finger Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128gestureTapFingerCount = value
        AppToast.show(this, "Gesture Tap Finger Count: $value")
    }
}

// v128.110: Cast Video PIP Mode
internal fun PlayerActivity.showV128CastVideoPIPModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128castVideoPIPMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128castVideoPIPMode = value
        AppToast.show(this, "Cast Video PIP Mode: $value")
    }
}

// v128.111: Playlist Auto Group By Topic
internal fun PlayerActivity.showV128PlaylistAutoGroupByTopicToggle() {
    val enabled = !BiliClient.prefs.v128playlistAutoGroupByTopic
    BiliClient.prefs.v128playlistAutoGroupByTopic = enabled
    AppToast.show(this, "Playlist Auto Group By Topic: ${if (enabled) "ON" else "OFF"}")
}

// v128.112: Cache Smart Pinning On Wifi
internal fun PlayerActivity.showV128CacheSmartPinningOnWifiToggle() {
    val enabled = !BiliClient.prefs.v128cacheSmartPinningOnWifi
    BiliClient.prefs.v128cacheSmartPinningOnWifi = enabled
    AppToast.show(this, "Cache Smart Pinning On Wifi: ${if (enabled) "ON" else "OFF"}")
}

// v128.113: Progress Bar Custom Thumb Border128
internal fun PlayerActivity.showV128ProgressBarCustomThumbBorder128Toggle() {
    val enabled = !BiliClient.prefs.v128progressBarCustomThumbBorder128
    BiliClient.prefs.v128progressBarCustomThumbBorder128 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Border128: ${if (enabled) "ON" else "OFF"}")
}

// v128.114: Volume Normalize Per Track
internal fun PlayerActivity.showV128VolumeNormalizePerTrackToggle() {
    val enabled = !BiliClient.prefs.v128volumeNormalizePerTrack
    BiliClient.prefs.v128volumeNormalizePerTrack = enabled
    AppToast.show(this, "Volume Normalize Per Track: ${if (enabled) "ON" else "OFF"}")
}

// v128.115: History Auto Clean128
internal fun PlayerActivity.showV128HistoryAutoClean128Toggle() {
    val enabled = !BiliClient.prefs.v128historyAutoClean128
    BiliClient.prefs.v128historyAutoClean128 = enabled
    AppToast.show(this, "History Auto Clean128: ${if (enabled) "ON" else "OFF"}")
}

// v128.116: Playback Speed Presets Display
internal fun PlayerActivity.showV128PlaybackSpeedPresetsDisplayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128playbackSpeedPresetsDisplay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Display",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128playbackSpeedPresetsDisplay = value
        AppToast.show(this, "Playback Speed Presets Display: $value")
    }
}

// v128.117: Screenshot Auto Share Telegram Channel
internal fun PlayerActivity.showV128ScreenshotAutoShareTelegramChannelToggle() {
    val enabled = !BiliClient.prefs.v128screenshotAutoShareTelegramChannel
    BiliClient.prefs.v128screenshotAutoShareTelegramChannel = enabled
    AppToast.show(this, "Screenshot Auto Share Telegram Channel: ${if (enabled) "ON" else "OFF"}")
}

// v128.118: Video PIP Minimize To Notification
internal fun PlayerActivity.showV128VideoPIPMinimizeToNotificationToggle() {
    val enabled = !BiliClient.prefs.v128videoPIPMinimizeToNotification
    BiliClient.prefs.v128videoPIPMinimizeToNotification = enabled
    AppToast.show(this, "Video PIP Minimize To Notification: ${if (enabled) "ON" else "OFF"}")
}

// v128.119: Danmaku Font BG Fill Border Join
internal fun PlayerActivity.showV128DanmakuFontBgFillBorderJoinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128danmakuFontBgFillBorderJoin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Join",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128danmakuFontBgFillBorderJoin = value
        AppToast.show(this, "Danmaku Font BG Fill Border Join: $value")
    }
}

// v128.120: Subtitle Animation Translate128
internal fun PlayerActivity.showV128SubtitleAnimationTranslate128Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128subtitleAnimationTranslate128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128subtitleAnimationTranslate128 = value
        AppToast.show(this, "Subtitle Animation Translate128: $value")
    }
}

// v129.121: Audio Chorus Toggle129
internal fun PlayerActivity.showV129AudioChorusToggle129Toggle() {
    val enabled = !BiliClient.prefs.v129audioChorusToggle129
    BiliClient.prefs.v129audioChorusToggle129 = enabled
    AppToast.show(this, "Audio Chorus Toggle129: ${if (enabled) "ON" else "OFF"}")
}

// v129.122: Danmaku Font BG Fill Border Join128
internal fun PlayerActivity.showV129DanmakuFontBgFillBorderJoin128Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129danmakuFontBgFillBorderJoin128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Join128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129danmakuFontBgFillBorderJoin128 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Join128: $value")
    }
}

// v129.123: Subtitle Animation Translate129
internal fun PlayerActivity.showV129SubtitleAnimationTranslate129Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129subtitleAnimationTranslate129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129subtitleAnimationTranslate129 = value
        AppToast.show(this, "Subtitle Animation Translate129: $value")
    }
}

// v129.124: Gesture Tap Zone Custom
internal fun PlayerActivity.showV129GestureTapZoneCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129gestureTapZoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129gestureTapZoneCustom = value
        AppToast.show(this, "Gesture Tap Zone Custom: $value")
    }
}

// v129.125: Cast Video PIP Size
internal fun PlayerActivity.showV129CastVideoPIPSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129castVideoPIPSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129castVideoPIPSize = value
        AppToast.show(this, "Cast Video PIP Size: $value")
    }
}

// v129.126: Playlist Auto Group By Mood
internal fun PlayerActivity.showV129PlaylistAutoGroupByMoodToggle() {
    val enabled = !BiliClient.prefs.v129playlistAutoGroupByMood
    BiliClient.prefs.v129playlistAutoGroupByMood = enabled
    AppToast.show(this, "Playlist Auto Group By Mood: ${if (enabled) "ON" else "OFF"}")
}

// v129.127: Cache Smart Pinning On Charging
internal fun PlayerActivity.showV129CacheSmartPinningOnChargingToggle() {
    val enabled = !BiliClient.prefs.v129cacheSmartPinningOnCharging
    BiliClient.prefs.v129cacheSmartPinningOnCharging = enabled
    AppToast.show(this, "Cache Smart Pinning On Charging: ${if (enabled) "ON" else "OFF"}")
}

// v129.128: Progress Bar Custom Thumb Border129
internal fun PlayerActivity.showV129ProgressBarCustomThumbBorder129Toggle() {
    val enabled = !BiliClient.prefs.v129progressBarCustomThumbBorder129
    BiliClient.prefs.v129progressBarCustomThumbBorder129 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Border129: ${if (enabled) "ON" else "OFF"}")
}

// v129.129: Volume Normalize Album
internal fun PlayerActivity.showV129VolumeNormalizeAlbumToggle() {
    val enabled = !BiliClient.prefs.v129volumeNormalizeAlbum
    BiliClient.prefs.v129volumeNormalizeAlbum = enabled
    AppToast.show(this, "Volume Normalize Album: ${if (enabled) "ON" else "OFF"}")
}

// v129.130: History Auto Clean129
internal fun PlayerActivity.showV129HistoryAutoClean129Toggle() {
    val enabled = !BiliClient.prefs.v129historyAutoClean129
    BiliClient.prefs.v129historyAutoClean129 = enabled
    AppToast.show(this, "History Auto Clean129: ${if (enabled) "ON" else "OFF"}")
}

// v129.131: Playback Speed Presets Notification
internal fun PlayerActivity.showV129PlaybackSpeedPresetsNotificationToggle() {
    val enabled = !BiliClient.prefs.v129playbackSpeedPresetsNotification
    BiliClient.prefs.v129playbackSpeedPresetsNotification = enabled
    AppToast.show(this, "Playback Speed Presets Notification: ${if (enabled) "ON" else "OFF"}")
}

// v129.132: Screenshot Auto Share Slack
internal fun PlayerActivity.showV129ScreenshotAutoShareSlackToggle() {
    val enabled = !BiliClient.prefs.v129screenshotAutoShareSlack
    BiliClient.prefs.v129screenshotAutoShareSlack = enabled
    AppToast.show(this, "Screenshot Auto Share Slack: ${if (enabled) "ON" else "OFF"}")
}

// v129.133: Video PIP Transition Animation
internal fun PlayerActivity.showV129VideoPIPTransitionAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129videoPIPTransitionAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129videoPIPTransitionAnimation = value
        AppToast.show(this, "Video PIP Transition Animation: $value")
    }
}

