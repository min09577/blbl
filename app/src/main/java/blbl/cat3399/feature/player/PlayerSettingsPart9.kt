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

// v129.134: Danmaku Font BG Fill Border Miter Limit
internal fun PlayerActivity.showV129DanmakuFontBgFillBorderMiterLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129danmakuFontBgFillBorderMiterLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Miter Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129danmakuFontBgFillBorderMiterLimit = value
        AppToast.show(this, "Danmaku Font BG Fill Border Miter Limit: $value")
    }
}

// v129.135: Subtitle Animation Scale129
internal fun PlayerActivity.showV129SubtitleAnimationScale129Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v129subtitleAnimationScale129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129subtitleAnimationScale129 = value
        AppToast.show(this, "Subtitle Animation Scale129: $value")
    }
}

// v130.136: Audio Chorus Rate
internal fun PlayerActivity.showV130AudioChorusRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v130audioChorusRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130audioChorusRate = value
        AppToast.show(this, "Audio Chorus Rate: $value")
    }
}

// v130.137: Danmaku Font BG Fill Border Miter129
internal fun PlayerActivity.showV130DanmakuFontBgFillBorderMiter129Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130danmakuFontBgFillBorderMiter129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Miter129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130danmakuFontBgFillBorderMiter129 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Miter129: $value")
    }
}

// v130.138: Subtitle Animation Scale130
internal fun PlayerActivity.showV130SubtitleAnimationScale130Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v130subtitleAnimationScale130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130subtitleAnimationScale130 = value
        AppToast.show(this, "Subtitle Animation Scale130: $value")
    }
}

// v130.139: Gesture Tap Zone Dead Zone
internal fun PlayerActivity.showV130GestureTapZoneDeadZoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130gestureTapZoneDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Dead Zone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130gestureTapZoneDeadZone = value
        AppToast.show(this, "Gesture Tap Zone Dead Zone: $value")
    }
}

// v130.140: Cast Video PIP Position
internal fun PlayerActivity.showV130CastVideoPIPPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130castVideoPIPPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130castVideoPIPPosition = value
        AppToast.show(this, "Cast Video PIP Position: $value")
    }
}

// v130.141: Playlist Auto Group By Language
internal fun PlayerActivity.showV130PlaylistAutoGroupByLanguageToggle() {
    val enabled = !BiliClient.prefs.v130playlistAutoGroupByLanguage
    BiliClient.prefs.v130playlistAutoGroupByLanguage = enabled
    AppToast.show(this, "Playlist Auto Group By Language: ${if (enabled) "ON" else "OFF"}")
}

// v130.142: Cache Smart Pinning On Idle
internal fun PlayerActivity.showV130CacheSmartPinningOnIdleToggle() {
    val enabled = !BiliClient.prefs.v130cacheSmartPinningOnIdle
    BiliClient.prefs.v130cacheSmartPinningOnIdle = enabled
    AppToast.show(this, "Cache Smart Pinning On Idle: ${if (enabled) "ON" else "OFF"}")
}

// v130.143: Progress Bar Custom Thumb Color130
internal fun PlayerActivity.showV130ProgressBarCustomThumbColor130Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130progressBarCustomThumbColor130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130progressBarCustomThumbColor130 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color130: $value")
    }
}

// v130.144: Volume Normalize Track
internal fun PlayerActivity.showV130VolumeNormalizeTrackToggle() {
    val enabled = !BiliClient.prefs.v130volumeNormalizeTrack
    BiliClient.prefs.v130volumeNormalizeTrack = enabled
    AppToast.show(this, "Volume Normalize Track: ${if (enabled) "ON" else "OFF"}")
}

// v130.145: History Auto Clean130
internal fun PlayerActivity.showV130HistoryAutoClean130Toggle() {
    val enabled = !BiliClient.prefs.v130historyAutoClean130
    BiliClient.prefs.v130historyAutoClean130 = enabled
    AppToast.show(this, "History Auto Clean130: ${if (enabled) "ON" else "OFF"}")
}

// v130.146: Playback Speed Presets Widget
internal fun PlayerActivity.showV130PlaybackSpeedPresetsWidgetToggle() {
    val enabled = !BiliClient.prefs.v130playbackSpeedPresetsWidget
    BiliClient.prefs.v130playbackSpeedPresetsWidget = enabled
    AppToast.show(this, "Playback Speed Presets Widget: ${if (enabled) "ON" else "OFF"}")
}

// v130.147: Screenshot Auto Share Teams
internal fun PlayerActivity.showV130ScreenshotAutoShareTeamsToggle() {
    val enabled = !BiliClient.prefs.v130screenshotAutoShareTeams
    BiliClient.prefs.v130screenshotAutoShareTeams = enabled
    AppToast.show(this, "Screenshot Auto Share Teams: ${if (enabled) "ON" else "OFF"}")
}

// v130.148: Video PIP Opacity On Drag
internal fun PlayerActivity.showV130VideoPIPOpacityOnDragDialog() {
    val options = listOf(50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v130videoPIPOpacityOnDrag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Opacity On Drag",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130videoPIPOpacityOnDrag = value
        AppToast.show(this, "Video PIP Opacity On Drag: $value")
    }
}

// v130.149: Danmaku Font BG Fill Shadow Toggle
internal fun PlayerActivity.showV130DanmakuFontBgFillShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v130danmakuFontBgFillShadowToggle
    BiliClient.prefs.v130danmakuFontBgFillShadowToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v130.150: Subtitle Animation Rotate130
internal fun PlayerActivity.showV130SubtitleAnimationRotate130Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130subtitleAnimationRotate130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130subtitleAnimationRotate130 = value
        AppToast.show(this, "Subtitle Animation Rotate130: $value")
    }
}

// v131: Audio Chorus Depth
internal fun PlayerActivity.showV131AudioChorusDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v131audioChorusDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131audioChorusDepth = value
        AppToast.show(this, "Audio Chorus Depth: $value")
    }
}

// v131: Danmaku Font BG Fill Shadow Color
internal fun PlayerActivity.showV131DanmakuFontBgFillShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131danmakuFontBgFillShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131danmakuFontBgFillShadowColor = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Color: $value")
    }
}

// v131: Subtitle Animation Rotate131
internal fun PlayerActivity.showV131SubtitleAnimationRotate131Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131subtitleAnimationRotate131).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate131",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131subtitleAnimationRotate131 = value
        AppToast.show(this, "Subtitle Animation Rotate131: $value")
    }
}

// v131: Gesture Tap Zone Sensitivity
internal fun PlayerActivity.showV131GestureTapZoneSensitivityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v131gestureTapZoneSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Sensitivity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131gestureTapZoneSensitivity = value
        AppToast.show(this, "Gesture Tap Zone Sensitivity: $value")
    }
}

// v131: Cast Video PIP Follow Main
internal fun PlayerActivity.showV131CastVideoPIPFollowMainToggle() {
    val current = BiliClient.prefs.v131castVideoPIPFollowMain
    BiliClient.prefs.v131castVideoPIPFollowMain = !current
    AppToast.show(this, "Cast Video PIP Follow Main: ${if (!current) "ON" else "OFF"}")
}

// v131: Playlist Auto Group By Genre
internal fun PlayerActivity.showV131PlaylistAutoGroupByGenreToggle() {
    val current = BiliClient.prefs.v131playlistAutoGroupByGenre
    BiliClient.prefs.v131playlistAutoGroupByGenre = !current
    AppToast.show(this, "Playlist Auto Group By Genre: ${if (!current) "ON" else "OFF"}")
}

// v131: Cache Smart Pinning On Schedule
internal fun PlayerActivity.showV131CacheSmartPinningOnScheduleToggle() {
    val current = BiliClient.prefs.v131cacheSmartPinningOnSchedule
    BiliClient.prefs.v131cacheSmartPinningOnSchedule = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule: ${if (!current) "ON" else "OFF"}")
}

// v131: Progress Bar Custom Thumb Shadow131
internal fun PlayerActivity.showV131ProgressBarCustomThumbShadow131Toggle() {
    val current = BiliClient.prefs.v131progressBarCustomThumbShadow131
    BiliClient.prefs.v131progressBarCustomThumbShadow131 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow131: ${if (!current) "ON" else "OFF"}")
}

// v131: Volume Normalize Mode
internal fun PlayerActivity.showV131VolumeNormalizeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131volumeNormalizeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131volumeNormalizeMode = value
        AppToast.show(this, "Volume Normalize Mode: $value")
    }
}

// v131: History Auto Clean131
internal fun PlayerActivity.showV131HistoryAutoClean131Toggle() {
    val current = BiliClient.prefs.v131historyAutoClean131
    BiliClient.prefs.v131historyAutoClean131 = !current
    AppToast.show(this, "History Auto Clean131: ${if (!current) "ON" else "OFF"}")
}

// v131: Playback Speed Presets Quick Switch
internal fun PlayerActivity.showV131PlaybackSpeedPresetsQuickSwitchToggle() {
    val current = BiliClient.prefs.v131playbackSpeedPresetsQuickSwitch
    BiliClient.prefs.v131playbackSpeedPresetsQuickSwitch = !current
    AppToast.show(this, "Playback Speed Presets Quick Switch: ${if (!current) "ON" else "OFF"}")
}

// v131: Screenshot Auto Share Messenger
internal fun PlayerActivity.showV131ScreenshotAutoShareMessengerToggle() {
    val current = BiliClient.prefs.v131screenshotAutoShareMessenger
    BiliClient.prefs.v131screenshotAutoShareMessenger = !current
    AppToast.show(this, "Screenshot Auto Share Messenger: ${if (!current) "ON" else "OFF"}")
}

// v131: Video PIP Transition Speed
internal fun PlayerActivity.showV131VideoPIPTransitionSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131videoPIPTransitionSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131videoPIPTransitionSpeed = value
        AppToast.show(this, "Video PIP Transition Speed: $value")
    }
}

// v131: Danmaku Font BG Fill Shadow Offset X
internal fun PlayerActivity.showV131DanmakuFontBgFillShadowOffsetXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v131danmakuFontBgFillShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131danmakuFontBgFillShadowOffsetX = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Offset X: $value")
    }
}

// v131: Subtitle Animation Translate131
internal fun PlayerActivity.showV131SubtitleAnimationTranslate131Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131subtitleAnimationTranslate131).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate131",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131subtitleAnimationTranslate131 = value
        AppToast.show(this, "Subtitle Animation Translate131: $value")
    }
}

// v132: Audio Chorus Feedback
internal fun PlayerActivity.showV132AudioChorusFeedbackDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v132audioChorusFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132audioChorusFeedback = value
        AppToast.show(this, "Audio Chorus Feedback: $value")
    }
}

// v132: Danmaku Font BG Fill Shadow Offset Y
internal fun PlayerActivity.showV132DanmakuFontBgFillShadowOffsetYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v132danmakuFontBgFillShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132danmakuFontBgFillShadowOffsetY = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Offset Y: $value")
    }
}

// v132: Subtitle Animation Translate132
internal fun PlayerActivity.showV132SubtitleAnimationTranslate132Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132subtitleAnimationTranslate132).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate132",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132subtitleAnimationTranslate132 = value
        AppToast.show(this, "Subtitle Animation Translate132: $value")
    }
}

// v132: Gesture Tap Zone Visual Feedback
internal fun PlayerActivity.showV132GestureTapZoneVisualFeedbackToggle() {
    val current = BiliClient.prefs.v132gestureTapZoneVisualFeedback
    BiliClient.prefs.v132gestureTapZoneVisualFeedback = !current
    AppToast.show(this, "Gesture Tap Zone Visual Feedback: ${if (!current) "ON" else "OFF"}")
}

// v132: Cast Video PIP Follow Fullscreen
internal fun PlayerActivity.showV132CastVideoPIPFollowFullscreenToggle() {
    val current = BiliClient.prefs.v132castVideoPIPFollowFullscreen
    BiliClient.prefs.v132castVideoPIPFollowFullscreen = !current
    AppToast.show(this, "Cast Video PIP Follow Fullscreen: ${if (!current) "ON" else "OFF"}")
}

// v132: Playlist Auto Group By Series132
internal fun PlayerActivity.showV132PlaylistAutoGroupBySeries132Toggle() {
    val current = BiliClient.prefs.v132playlistAutoGroupBySeries132
    BiliClient.prefs.v132playlistAutoGroupBySeries132 = !current
    AppToast.show(this, "Playlist Auto Group By Series132: ${if (!current) "ON" else "OFF"}")
}

// v132: Cache Smart Pinning On Network Change
internal fun PlayerActivity.showV132CacheSmartPinningOnNetworkChangeToggle() {
    val current = BiliClient.prefs.v132cacheSmartPinningOnNetworkChange
    BiliClient.prefs.v132cacheSmartPinningOnNetworkChange = !current
    AppToast.show(this, "Cache Smart Pinning On Network Change: ${if (!current) "ON" else "OFF"}")
}

// v132: Progress Bar Custom Thumb Glow132
internal fun PlayerActivity.showV132ProgressBarCustomThumbGlow132Toggle() {
    val current = BiliClient.prefs.v132progressBarCustomThumbGlow132
    BiliClient.prefs.v132progressBarCustomThumbGlow132 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow132: ${if (!current) "ON" else "OFF"}")
}

// v132: Volume Normalize Target
internal fun PlayerActivity.showV132VolumeNormalizeTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132volumeNormalizeTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132volumeNormalizeTarget = value
        AppToast.show(this, "Volume Normalize Target: $value")
    }
}

// v132: History Auto Clean132
internal fun PlayerActivity.showV132HistoryAutoClean132Toggle() {
    val current = BiliClient.prefs.v132historyAutoClean132
    BiliClient.prefs.v132historyAutoClean132 = !current
    AppToast.show(this, "History Auto Clean132: ${if (!current) "ON" else "OFF"}")
}

// v132: Playback Speed Presets Long Press
internal fun PlayerActivity.showV132PlaybackSpeedPresetsLongPressToggle() {
    val current = BiliClient.prefs.v132playbackSpeedPresetsLongPress
    BiliClient.prefs.v132playbackSpeedPresetsLongPress = !current
    AppToast.show(this, "Playback Speed Presets Long Press: ${if (!current) "ON" else "OFF"}")
}

// v132: Screenshot Auto Share Viber
internal fun PlayerActivity.showV132ScreenshotAutoShareViberToggle() {
    val current = BiliClient.prefs.v132screenshotAutoShareViber
    BiliClient.prefs.v132screenshotAutoShareViber = !current
    AppToast.show(this, "Screenshot Auto Share Viber: ${if (!current) "ON" else "OFF"}")
}

// v132: Video PIP Transition Type
internal fun PlayerActivity.showV132VideoPIPTransitionTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132videoPIPTransitionType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132videoPIPTransitionType = value
        AppToast.show(this, "Video PIP Transition Type: $value")
    }
}

// v132: Danmaku Font BG Fill Shadow Blur
internal fun PlayerActivity.showV132DanmakuFontBgFillShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v132danmakuFontBgFillShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132danmakuFontBgFillShadowBlur = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Blur: $value")
    }
}

// v132: Subtitle Animation Scale132
internal fun PlayerActivity.showV132SubtitleAnimationScale132Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v132subtitleAnimationScale132).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale132",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132subtitleAnimationScale132 = value
        AppToast.show(this, "Subtitle Animation Scale132: $value")
    }
}

// v133: Audio Chorus Mix
internal fun PlayerActivity.showV133AudioChorusMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v133audioChorusMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133audioChorusMix = value
        AppToast.show(this, "Audio Chorus Mix: $value")
    }
}

// v133: Danmaku Font BG Fill Shadow Opacity
internal fun PlayerActivity.showV133DanmakuFontBgFillShadowOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v133danmakuFontBgFillShadowOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133danmakuFontBgFillShadowOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Opacity: $value")
    }
}

// v133: Subtitle Animation Scale133
internal fun PlayerActivity.showV133SubtitleAnimationScale133Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v133subtitleAnimationScale133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133subtitleAnimationScale133 = value
        AppToast.show(this, "Subtitle Animation Scale133: $value")
    }
}

// v133: Gesture Tap Zone Haptic Feedback
internal fun PlayerActivity.showV133GestureTapZoneHapticFeedbackToggle() {
    val current = BiliClient.prefs.v133gestureTapZoneHapticFeedback
    BiliClient.prefs.v133gestureTapZoneHapticFeedback = !current
    AppToast.show(this, "Gesture Tap Zone Haptic Feedback: ${if (!current) "ON" else "OFF"}")
}

// v133: Cast Video PIP Follow Playback
internal fun PlayerActivity.showV133CastVideoPIPFollowPlaybackToggle() {
    val current = BiliClient.prefs.v133castVideoPIPFollowPlayback
    BiliClient.prefs.v133castVideoPIPFollowPlayback = !current
    AppToast.show(this, "Cast Video PIP Follow Playback: ${if (!current) "ON" else "OFF"}")
}

// v133: Playlist Auto Group By Date Range
internal fun PlayerActivity.showV133PlaylistAutoGroupByDateRangeToggle() {
    val current = BiliClient.prefs.v133playlistAutoGroupByDateRange
    BiliClient.prefs.v133playlistAutoGroupByDateRange = !current
    AppToast.show(this, "Playlist Auto Group By Date Range: ${if (!current) "ON" else "OFF"}")
}

// v133: Cache Smart Pinning On Battery Level
internal fun PlayerActivity.showV133CacheSmartPinningOnBatteryLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133cacheSmartPinningOnBatteryLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Battery Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133cacheSmartPinningOnBatteryLevel = value
        AppToast.show(this, "Cache Smart Pinning On Battery Level: $value")
    }
}

// v133: Progress Bar Custom Thumb Border133
internal fun PlayerActivity.showV133ProgressBarCustomThumbBorder133Toggle() {
    val current = BiliClient.prefs.v133progressBarCustomThumbBorder133
    BiliClient.prefs.v133progressBarCustomThumbBorder133 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border133: ${if (!current) "ON" else "OFF"}")
}

// v133: Volume Normalize Ceiling
internal fun PlayerActivity.showV133VolumeNormalizeCeilingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133volumeNormalizeCeiling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Ceiling",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133volumeNormalizeCeiling = value
        AppToast.show(this, "Volume Normalize Ceiling: $value")
    }
}

// v133: History Auto Clean133
internal fun PlayerActivity.showV133HistoryAutoClean133Toggle() {
    val current = BiliClient.prefs.v133historyAutoClean133
    BiliClient.prefs.v133historyAutoClean133 = !current
    AppToast.show(this, "History Auto Clean133: ${if (!current) "ON" else "OFF"}")
}

// v133: Playback Speed Presets Double Tap
internal fun PlayerActivity.showV133PlaybackSpeedPresetsDoubleTapToggle() {
    val current = BiliClient.prefs.v133playbackSpeedPresetsDoubleTap
    BiliClient.prefs.v133playbackSpeedPresetsDoubleTap = !current
    AppToast.show(this, "Playback Speed Presets Double Tap: ${if (!current) "ON" else "OFF"}")
}

// v133: Screenshot Auto Share Signal
internal fun PlayerActivity.showV133ScreenshotAutoShareSignalToggle() {
    val current = BiliClient.prefs.v133screenshotAutoShareSignal
    BiliClient.prefs.v133screenshotAutoShareSignal = !current
    AppToast.show(this, "Screenshot Auto Share Signal: ${if (!current) "ON" else "OFF"}")
}

// v133: Video PIP Background Opacity
internal fun PlayerActivity.showV133VideoPIPBackgroundOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133videoPIPBackgroundOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Background Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133videoPIPBackgroundOpacity = value
        AppToast.show(this, "Video PIP Background Opacity: $value")
    }
}

// v133: Danmaku Font BG Fill Shadow Spread
internal fun PlayerActivity.showV133DanmakuFontBgFillShadowSpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133danmakuFontBgFillShadowSpread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Spread",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133danmakuFontBgFillShadowSpread = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Spread: $value")
    }
}

// v133: Subtitle Animation Rotate133
internal fun PlayerActivity.showV133SubtitleAnimationRotate133Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133subtitleAnimationRotate133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133subtitleAnimationRotate133 = value
        AppToast.show(this, "Subtitle Animation Rotate133: $value")
    }
}

// v134: Audio Flanger Toggle134
internal fun PlayerActivity.showV134AudioFlangerToggle134Toggle() {
    val current = BiliClient.prefs.v134audioFlangerToggle134
    BiliClient.prefs.v134audioFlangerToggle134 = !current
    AppToast.show(this, "Audio Flanger Toggle134: ${if (!current) "ON" else "OFF"}")
}

// v134: Danmaku Font BG Fill Shadow Type
internal fun PlayerActivity.showV134DanmakuFontBgFillShadowTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134danmakuFontBgFillShadowType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134danmakuFontBgFillShadowType = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type: $value")
    }
}

// v134: Subtitle Animation Rotate134
internal fun PlayerActivity.showV134SubtitleAnimationRotate134Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134subtitleAnimationRotate134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134subtitleAnimationRotate134 = value
        AppToast.show(this, "Subtitle Animation Rotate134: $value")
    }
}

// v134: Gesture Tap Zone Timeout
internal fun PlayerActivity.showV134GestureTapZoneTimeoutDialog() {
    val options = listOf(300, 400, 500, 700, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v134gestureTapZoneTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134gestureTapZoneTimeout = value
        AppToast.show(this, "Gesture Tap Zone Timeout: $value")
    }
}

// v134: Cast Video PIP Follow Gesture
internal fun PlayerActivity.showV134CastVideoPIPFollowGestureToggle() {
    val current = BiliClient.prefs.v134castVideoPIPFollowGesture
    BiliClient.prefs.v134castVideoPIPFollowGesture = !current
    AppToast.show(this, "Cast Video PIP Follow Gesture: ${if (!current) "ON" else "OFF"}")
}

// v134: Playlist Auto Group By Watch Count
internal fun PlayerActivity.showV134PlaylistAutoGroupByWatchCountToggle() {
    val current = BiliClient.prefs.v134playlistAutoGroupByWatchCount
    BiliClient.prefs.v134playlistAutoGroupByWatchCount = !current
    AppToast.show(this, "Playlist Auto Group By Watch Count: ${if (!current) "ON" else "OFF"}")
}

// v134: Cache Smart Pinning On Storage Type
internal fun PlayerActivity.showV134CacheSmartPinningOnStorageTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134cacheSmartPinningOnStorageType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134cacheSmartPinningOnStorageType = value
        AppToast.show(this, "Cache Smart Pinning On Storage Type: $value")
    }
}

// v134: Progress Bar Custom Thumb Size134
internal fun PlayerActivity.showV134ProgressBarCustomThumbSize134Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v134progressBarCustomThumbSize134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Size134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134progressBarCustomThumbSize134 = value
        AppToast.show(this, "Progress Bar Custom Thumb Size134: $value")
    }
}

// v134: Volume Normalize Window
internal fun PlayerActivity.showV134VolumeNormalizeWindowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134volumeNormalizeWindow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Window",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134volumeNormalizeWindow = value
        AppToast.show(this, "Volume Normalize Window: $value")
    }
}

// v134: History Auto Clean134
internal fun PlayerActivity.showV134HistoryAutoClean134Toggle() {
    val current = BiliClient.prefs.v134historyAutoClean134
    BiliClient.prefs.v134historyAutoClean134 = !current
    AppToast.show(this, "History Auto Clean134: ${if (!current) "ON" else "OFF"}")
}

// v134: Playback Speed Presets Triple Tap
internal fun PlayerActivity.showV134PlaybackSpeedPresetsTripleTapToggle() {
    val current = BiliClient.prefs.v134playbackSpeedPresetsTripleTap
    BiliClient.prefs.v134playbackSpeedPresetsTripleTap = !current
    AppToast.show(this, "Playback Speed Presets Triple Tap: ${if (!current) "ON" else "OFF"}")
}

// v134: Screenshot Auto Share X
internal fun PlayerActivity.showV134ScreenshotAutoShareXToggle() {
    val current = BiliClient.prefs.v134screenshotAutoShareX
    BiliClient.prefs.v134screenshotAutoShareX = !current
    AppToast.show(this, "Screenshot Auto Share X: ${if (!current) "ON" else "OFF"}")
}

// v134: Video PIP Follow Orientation
internal fun PlayerActivity.showV134VideoPIPFollowOrientationToggle() {
    val current = BiliClient.prefs.v134videoPIPFollowOrientation
    BiliClient.prefs.v134videoPIPFollowOrientation = !current
    AppToast.show(this, "Video PIP Follow Orientation: ${if (!current) "ON" else "OFF"}")
}

// v134: Danmaku Font BG Fill Shadow Type133
internal fun PlayerActivity.showV134DanmakuFontBgFillShadowType133Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134danmakuFontBgFillShadowType133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134danmakuFontBgFillShadowType133 = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type133: $value")
    }
}

// v134: Subtitle Animation Blur134
internal fun PlayerActivity.showV134SubtitleAnimationBlur134Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v134subtitleAnimationBlur134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134subtitleAnimationBlur134 = value
        AppToast.show(this, "Subtitle Animation Blur134: $value")
    }
}

// v135: Audio Flanger Rate
internal fun PlayerActivity.showV135AudioFlangerRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v135audioFlangerRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135audioFlangerRate = value
        AppToast.show(this, "Audio Flanger Rate: $value")
    }
}

// v135: Danmaku Font BG Fill Shadow Type134
internal fun PlayerActivity.showV135DanmakuFontBgFillShadowType134Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v135danmakuFontBgFillShadowType134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135danmakuFontBgFillShadowType134 = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type134: $value")
    }
}

// v135: Subtitle Animation Blur135
internal fun PlayerActivity.showV135SubtitleAnimationBlur135Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v135subtitleAnimationBlur135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135subtitleAnimationBlur135 = value
        AppToast.show(this, "Subtitle Animation Blur135: $value")
    }
}

// v135: Gesture Tap Zone Min Distance
internal fun PlayerActivity.showV135GestureTapZoneMinDistanceDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v135gestureTapZoneMinDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Min Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135gestureTapZoneMinDistance = value
        AppToast.show(this, "Gesture Tap Zone Min Distance: $value")
    }
}

// v135: Cast Video PIP Follow Screen
internal fun PlayerActivity.showV135CastVideoPIPFollowScreenToggle() {
    val current = BiliClient.prefs.v135castVideoPIPFollowScreen
    BiliClient.prefs.v135castVideoPIPFollowScreen = !current
    AppToast.show(this, "Cast Video PIP Follow Screen: ${if (!current) "ON" else "OFF"}")
}

// v135: Playlist Auto Group By Like Count
internal fun PlayerActivity.showV135PlaylistAutoGroupByLikeCountToggle() {
    val current = BiliClient.prefs.v135playlistAutoGroupByLikeCount
    BiliClient.prefs.v135playlistAutoGroupByLikeCount = !current
    AppToast.show(this, "Playlist Auto Group By Like Count: ${if (!current) "ON" else "OFF"}")
}

// v135: Cache Smart Pinning On Storage Free
internal fun PlayerActivity.showV135CacheSmartPinningOnStorageFreeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v135cacheSmartPinningOnStorageFree).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Free",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135cacheSmartPinningOnStorageFree = value
        AppToast.show(this, "Cache Smart Pinning On Storage Free: $value")
    }
}

// v135: Progress Bar Custom Thumb Size135
internal fun PlayerActivity.showV135ProgressBarCustomThumbSize135Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v135progressBarCustomThumbSize135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Size135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135progressBarCustomThumbSize135 = value
        AppToast.show(this, "Progress Bar Custom Thumb Size135: $value")
    }
}

// v135: Volume Normalize Threshold
internal fun PlayerActivity.showV135VolumeNormalizeThresholdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v135volumeNormalizeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135volumeNormalizeThreshold = value
        AppToast.show(this, "Volume Normalize Threshold: $value")
    }
}

// v135: History Auto Clean135
internal fun PlayerActivity.showV135HistoryAutoClean135Toggle() {
    val current = BiliClient.prefs.v135historyAutoClean135
    BiliClient.prefs.v135historyAutoClean135 = !current
    AppToast.show(this, "History Auto Clean135: ${if (!current) "ON" else "OFF"}")
}

// v135: Playback Speed Presets Gesture
internal fun PlayerActivity.showV135PlaybackSpeedPresetsGestureToggle() {
    val current = BiliClient.prefs.v135playbackSpeedPresetsGesture
    BiliClient.prefs.v135playbackSpeedPresetsGesture = !current
    AppToast.show(this, "Playback Speed Presets Gesture: ${if (!current) "ON" else "OFF"}")
}

// v135: Screenshot Auto Share Tumblr
internal fun PlayerActivity.showV135ScreenshotAutoShareTumblrToggle() {
    val current = BiliClient.prefs.v135screenshotAutoShareTumblr
    BiliClient.prefs.v135screenshotAutoShareTumblr = !current
    AppToast.show(this, "Screenshot Auto Share Tumblr: ${if (!current) "ON" else "OFF"}")
}

// v135: Video PIP Follow System Theme
internal fun PlayerActivity.showV135VideoPIPFollowSystemThemeToggle() {
    val current = BiliClient.prefs.v135videoPIPFollowSystemTheme
    BiliClient.prefs.v135videoPIPFollowSystemTheme = !current
    AppToast.show(this, "Video PIP Follow System Theme: ${if (!current) "ON" else "OFF"}")
}

// v135: Danmaku Font BG Fill Clip Toggle
internal fun PlayerActivity.showV135DanmakuFontBgFillClipToggleToggle() {
    val current = BiliClient.prefs.v135danmakuFontBgFillClipToggle
    BiliClient.prefs.v135danmakuFontBgFillClipToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Clip Toggle: ${if (!current) "ON" else "OFF"}")
}

// v135: Subtitle Animation Fade In135
internal fun PlayerActivity.showV135SubtitleAnimationFadeIn135Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v135subtitleAnimationFadeIn135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135subtitleAnimationFadeIn135 = value
        AppToast.show(this, "Subtitle Animation Fade In135: $value")
    }
}

// v136: Audio Flanger Depth
internal fun PlayerActivity.showV136AudioFlangerDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v136audioFlangerDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136audioFlangerDepth = value
        AppToast.show(this, "Audio Flanger Depth: $value")
    }
}

// v136: Danmaku Font BG Fill Clip Path
internal fun PlayerActivity.showV136DanmakuFontBgFillClipPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136danmakuFontBgFillClipPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136danmakuFontBgFillClipPath = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Path: $value")
    }
}

// v136: Subtitle Animation Fade In136
internal fun PlayerActivity.showV136SubtitleAnimationFadeIn136Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v136subtitleAnimationFadeIn136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136subtitleAnimationFadeIn136 = value
        AppToast.show(this, "Subtitle Animation Fade In136: $value")
    }
}

// v136: Gesture Tap Zone Visual Style
internal fun PlayerActivity.showV136GestureTapZoneVisualStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136gestureTapZoneVisualStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136gestureTapZoneVisualStyle = value
        AppToast.show(this, "Gesture Tap Zone Visual Style: $value")
    }
}

// v136: Cast Video PIP Follow Orientation
internal fun PlayerActivity.showV136CastVideoPIPFollowOrientationToggle() {
    val current = BiliClient.prefs.v136castVideoPIPFollowOrientation
    BiliClient.prefs.v136castVideoPIPFollowOrientation = !current
    AppToast.show(this, "Cast Video PIP Follow Orientation: ${if (!current) "ON" else "OFF"}")
}

// v136: Playlist Auto Group By Comment Count
internal fun PlayerActivity.showV136PlaylistAutoGroupByCommentCountToggle() {
    val current = BiliClient.prefs.v136playlistAutoGroupByCommentCount
    BiliClient.prefs.v136playlistAutoGroupByCommentCount = !current
    AppToast.show(this, "Playlist Auto Group By Comment Count: ${if (!current) "ON" else "OFF"}")
}

// v136: Cache Smart Pinning On Network Speed
internal fun PlayerActivity.showV136CacheSmartPinningOnNetworkSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136cacheSmartPinningOnNetworkSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Network Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136cacheSmartPinningOnNetworkSpeed = value
        AppToast.show(this, "Cache Smart Pinning On Network Speed: $value")
    }
}

// v136: Progress Bar Custom Thumb Color136
internal fun PlayerActivity.showV136ProgressBarCustomThumbColor136Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136progressBarCustomThumbColor136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136progressBarCustomThumbColor136 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color136: $value")
    }
}

// v136: Volume Normalize Adaptive
internal fun PlayerActivity.showV136VolumeNormalizeAdaptiveToggle() {
    val current = BiliClient.prefs.v136volumeNormalizeAdaptive
    BiliClient.prefs.v136volumeNormalizeAdaptive = !current
    AppToast.show(this, "Volume Normalize Adaptive: ${if (!current) "ON" else "OFF"}")
}

// v136: History Auto Clean136
internal fun PlayerActivity.showV136HistoryAutoClean136Toggle() {
    val current = BiliClient.prefs.v136historyAutoClean136
    BiliClient.prefs.v136historyAutoClean136 = !current
    AppToast.show(this, "History Auto Clean136: ${if (!current) "ON" else "OFF"}")
}

// v136: Playback Speed Presets Quick Access
internal fun PlayerActivity.showV136PlaybackSpeedPresetsQuickAccessToggle() {
    val current = BiliClient.prefs.v136playbackSpeedPresetsQuickAccess
    BiliClient.prefs.v136playbackSpeedPresetsQuickAccess = !current
    AppToast.show(this, "Playback Speed Presets Quick Access: ${if (!current) "ON" else "OFF"}")
}

// v136: Screenshot Auto Share Pinterest
internal fun PlayerActivity.showV136ScreenshotAutoSharePinterestToggle() {
    val current = BiliClient.prefs.v136screenshotAutoSharePinterest
    BiliClient.prefs.v136screenshotAutoSharePinterest = !current
    AppToast.show(this, "Screenshot Auto Share Pinterest: ${if (!current) "ON" else "OFF"}")
}

// v136: Video PIP Follow Audio Focus
internal fun PlayerActivity.showV136VideoPIPFollowAudioFocusToggle() {
    val current = BiliClient.prefs.v136videoPIPFollowAudioFocus
    BiliClient.prefs.v136videoPIPFollowAudioFocus = !current
    AppToast.show(this, "Video PIP Follow Audio Focus: ${if (!current) "ON" else "OFF"}")
}

// v136: Danmaku Font BG Fill Clip Path135
internal fun PlayerActivity.showV136DanmakuFontBgFillClipPath135Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v136danmakuFontBgFillClipPath135).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Path135",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136danmakuFontBgFillClipPath135 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Path135: $value")
    }
}

// v136: Subtitle Animation Fade Out136
internal fun PlayerActivity.showV136SubtitleAnimationFadeOut136Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v136subtitleAnimationFadeOut136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v136subtitleAnimationFadeOut136 = value
        AppToast.show(this, "Subtitle Animation Fade Out136: $value")
    }
}

// v137: Audio Flanger Feedback136
internal fun PlayerActivity.showV137AudioFlangerFeedback136Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v137audioFlangerFeedback136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Feedback136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137audioFlangerFeedback136 = value
        AppToast.show(this, "Audio Flanger Feedback136: $value")
    }
}

// v137: Danmaku Font BG Fill Clip Path136
internal fun PlayerActivity.showV137DanmakuFontBgFillClipPath136Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137danmakuFontBgFillClipPath136).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Path136",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137danmakuFontBgFillClipPath136 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Path136: $value")
    }
}

// v137: Subtitle Animation Fade Out137
internal fun PlayerActivity.showV137SubtitleAnimationFadeOut137Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v137subtitleAnimationFadeOut137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137subtitleAnimationFadeOut137 = value
        AppToast.show(this, "Subtitle Animation Fade Out137: $value")
    }
}

// v137: Gesture Tap Zone Visual Color
internal fun PlayerActivity.showV137GestureTapZoneVisualColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137gestureTapZoneVisualColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137gestureTapZoneVisualColor = value
        AppToast.show(this, "Gesture Tap Zone Visual Color: $value")
    }
}

// v137: Cast Video PIP Follow Battery
internal fun PlayerActivity.showV137CastVideoPIPFollowBatteryToggle() {
    val current = BiliClient.prefs.v137castVideoPIPFollowBattery
    BiliClient.prefs.v137castVideoPIPFollowBattery = !current
    AppToast.show(this, "Cast Video PIP Follow Battery: ${if (!current) "ON" else "OFF"}")
}

// v137: Playlist Auto Group By Share Count
internal fun PlayerActivity.showV137PlaylistAutoGroupByShareCountToggle() {
    val current = BiliClient.prefs.v137playlistAutoGroupByShareCount
    BiliClient.prefs.v137playlistAutoGroupByShareCount = !current
    AppToast.show(this, "Playlist Auto Group By Share Count: ${if (!current) "ON" else "OFF"}")
}

// v137: Cache Smart Pinning On Network Type
internal fun PlayerActivity.showV137CacheSmartPinningOnNetworkTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137cacheSmartPinningOnNetworkType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Network Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137cacheSmartPinningOnNetworkType = value
        AppToast.show(this, "Cache Smart Pinning On Network Type: $value")
    }
}

// v137: Progress Bar Custom Thumb Color137
internal fun PlayerActivity.showV137ProgressBarCustomThumbColor137Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137progressBarCustomThumbColor137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137progressBarCustomThumbColor137 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color137: $value")
    }
}

// v137: Volume Normalize Smoothing
internal fun PlayerActivity.showV137VolumeNormalizeSmoothingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137volumeNormalizeSmoothing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Smoothing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137volumeNormalizeSmoothing = value
        AppToast.show(this, "Volume Normalize Smoothing: $value")
    }
}

// v137: History Auto Clean137
internal fun PlayerActivity.showV137HistoryAutoClean137Toggle() {
    val current = BiliClient.prefs.v137historyAutoClean137
    BiliClient.prefs.v137historyAutoClean137 = !current
    AppToast.show(this, "History Auto Clean137: ${if (!current) "ON" else "OFF"}")
}

// v137: Playback Speed Presets Notification Toggle
internal fun PlayerActivity.showV137PlaybackSpeedPresetsNotificationToggleToggle() {
    val current = BiliClient.prefs.v137playbackSpeedPresetsNotificationToggle
    BiliClient.prefs.v137playbackSpeedPresetsNotificationToggle = !current
    AppToast.show(this, "Playback Speed Presets Notification Toggle: ${if (!current) "ON" else "OFF"}")
}

// v137: Screenshot Auto Share Twitch
internal fun PlayerActivity.showV137ScreenshotAutoShareTwitchToggle() {
    val current = BiliClient.prefs.v137screenshotAutoShareTwitch
    BiliClient.prefs.v137screenshotAutoShareTwitch = !current
    AppToast.show(this, "Screenshot Auto Share Twitch: ${if (!current) "ON" else "OFF"}")
}

// v137: Video PIP Follow Do Not Disturb
internal fun PlayerActivity.showV137VideoPIPFollowDoNotDisturbToggle() {
    val current = BiliClient.prefs.v137videoPIPFollowDoNotDisturb
    BiliClient.prefs.v137videoPIPFollowDoNotDisturb = !current
    AppToast.show(this, "Video PIP Follow Do Not Disturb: ${if (!current) "ON" else "OFF"}")
}

// v137: Danmaku Font BG Fill Clip Radius
internal fun PlayerActivity.showV137DanmakuFontBgFillClipRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v137danmakuFontBgFillClipRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137danmakuFontBgFillClipRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius: $value")
    }
}

// v137: Subtitle Animation Translate137
internal fun PlayerActivity.showV137SubtitleAnimationTranslate137Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v137subtitleAnimationTranslate137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v137subtitleAnimationTranslate137 = value
        AppToast.show(this, "Subtitle Animation Translate137: $value")
    }
}

// v138: Audio Phaser Toggle138
internal fun PlayerActivity.showV138AudioPhaserToggle138Toggle() {
    val current = BiliClient.prefs.v138audioPhaserToggle138
    BiliClient.prefs.v138audioPhaserToggle138 = !current
    AppToast.show(this, "Audio Phaser Toggle138: ${if (!current) "ON" else "OFF"}")
}

// v138: Danmaku Font BG Fill Clip Radius137
internal fun PlayerActivity.showV138DanmakuFontBgFillClipRadius137Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v138danmakuFontBgFillClipRadius137).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius137",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138danmakuFontBgFillClipRadius137 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius137: $value")
    }
}

// v138: Subtitle Animation Translate138
internal fun PlayerActivity.showV138SubtitleAnimationTranslate138Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v138subtitleAnimationTranslate138).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate138",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138subtitleAnimationTranslate138 = value
        AppToast.show(this, "Subtitle Animation Translate138: $value")
    }
}

// v138: Gesture Tap Zone Visual Opacity
internal fun PlayerActivity.showV138GestureTapZoneVisualOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v138gestureTapZoneVisualOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138gestureTapZoneVisualOpacity = value
        AppToast.show(this, "Gesture Tap Zone Visual Opacity: $value")
    }
}

// v138: Cast Video PIP Follow Storage
internal fun PlayerActivity.showV138CastVideoPIPFollowStorageToggle() {
    val current = BiliClient.prefs.v138castVideoPIPFollowStorage
    BiliClient.prefs.v138castVideoPIPFollowStorage = !current
    AppToast.show(this, "Cast Video PIP Follow Storage: ${if (!current) "ON" else "OFF"}")
}

// v138: Playlist Auto Group By Fav Count
internal fun PlayerActivity.showV138PlaylistAutoGroupByFavCountToggle() {
    val current = BiliClient.prefs.v138playlistAutoGroupByFavCount
    BiliClient.prefs.v138playlistAutoGroupByFavCount = !current
    AppToast.show(this, "Playlist Auto Group By Fav Count: ${if (!current) "ON" else "OFF"}")
}

// v138: Cache Smart Pinning On Storage Read
internal fun PlayerActivity.showV138CacheSmartPinningOnStorageReadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v138cacheSmartPinningOnStorageRead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Read",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138cacheSmartPinningOnStorageRead = value
        AppToast.show(this, "Cache Smart Pinning On Storage Read: $value")
    }
}

// v138: Progress Bar Custom Thumb Shadow138
internal fun PlayerActivity.showV138ProgressBarCustomThumbShadow138Toggle() {
    val current = BiliClient.prefs.v138progressBarCustomThumbShadow138
    BiliClient.prefs.v138progressBarCustomThumbShadow138 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow138: ${if (!current) "ON" else "OFF"}")
}

// v138: Volume Normalize Gate
internal fun PlayerActivity.showV138VolumeNormalizeGateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v138volumeNormalizeGate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Gate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138volumeNormalizeGate = value
        AppToast.show(this, "Volume Normalize Gate: $value")
    }
}

// v138: History Auto Clean138
internal fun PlayerActivity.showV138HistoryAutoClean138Toggle() {
    val current = BiliClient.prefs.v138historyAutoClean138
    BiliClient.prefs.v138historyAutoClean138 = !current
    AppToast.show(this, "History Auto Clean138: ${if (!current) "ON" else "OFF"}")
}

// v138: Playback Speed Presets Drag Adjust
internal fun PlayerActivity.showV138PlaybackSpeedPresetsDragAdjustToggle() {
    val current = BiliClient.prefs.v138playbackSpeedPresetsDragAdjust
    BiliClient.prefs.v138playbackSpeedPresetsDragAdjust = !current
    AppToast.show(this, "Playback Speed Presets Drag Adjust: ${if (!current) "ON" else "OFF"}")
}

// v138: Screenshot Auto Share YouTube
internal fun PlayerActivity.showV138ScreenshotAutoShareYouTubeToggle() {
    val current = BiliClient.prefs.v138screenshotAutoShareYouTube
    BiliClient.prefs.v138screenshotAutoShareYouTube = !current
    AppToast.show(this, "Screenshot Auto Share YouTube: ${if (!current) "ON" else "OFF"}")
}

// v138: Video PIP Follow Brightness
internal fun PlayerActivity.showV138VideoPIPFollowBrightnessToggle() {
    val current = BiliClient.prefs.v138videoPIPFollowBrightness
    BiliClient.prefs.v138videoPIPFollowBrightness = !current
    AppToast.show(this, "Video PIP Follow Brightness: ${if (!current) "ON" else "OFF"}")
}

// v138: Danmaku Font BG Fill Clip Radius138
internal fun PlayerActivity.showV138DanmakuFontBgFillClipRadius138Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v138danmakuFontBgFillClipRadius138).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius138",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138danmakuFontBgFillClipRadius138 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius138: $value")
    }
}

// v138: Subtitle Animation Scale138
internal fun PlayerActivity.showV138SubtitleAnimationScale138Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v138subtitleAnimationScale138).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale138",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v138subtitleAnimationScale138 = value
        AppToast.show(this, "Subtitle Animation Scale138: $value")
    }
}

// v139: Audio Phaser Rate
internal fun PlayerActivity.showV139AudioPhaserRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v139audioPhaserRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139audioPhaserRate = value
        AppToast.show(this, "Audio Phaser Rate: $value")
    }
}

// v139: Danmaku Font BG Fill Clip Radius139
internal fun PlayerActivity.showV139DanmakuFontBgFillClipRadius139Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v139danmakuFontBgFillClipRadius139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Radius139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139danmakuFontBgFillClipRadius139 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Radius139: $value")
    }
}

// v139: Subtitle Animation Scale139
internal fun PlayerActivity.showV139SubtitleAnimationScale139Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v139subtitleAnimationScale139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139subtitleAnimationScale139 = value
        AppToast.show(this, "Subtitle Animation Scale139: $value")
    }
}

// v139: Gesture Tap Zone Visual Duration
internal fun PlayerActivity.showV139GestureTapZoneVisualDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v139gestureTapZoneVisualDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139gestureTapZoneVisualDuration = value
        AppToast.show(this, "Gesture Tap Zone Visual Duration: $value")
    }
}

// v139: Cast Video PIP Follow Volume
internal fun PlayerActivity.showV139CastVideoPIPFollowVolumeToggle() {
    val current = BiliClient.prefs.v139castVideoPIPFollowVolume
    BiliClient.prefs.v139castVideoPIPFollowVolume = !current
    AppToast.show(this, "Cast Video PIP Follow Volume: ${if (!current) "ON" else "OFF"}")
}

// v139: Playlist Auto Group By Dan Count
internal fun PlayerActivity.showV139PlaylistAutoGroupByDanCountToggle() {
    val current = BiliClient.prefs.v139playlistAutoGroupByDanCount
    BiliClient.prefs.v139playlistAutoGroupByDanCount = !current
    AppToast.show(this, "Playlist Auto Group By Dan Count: ${if (!current) "ON" else "OFF"}")
}

// v139: Cache Smart Pinning On Storage Write
internal fun PlayerActivity.showV139CacheSmartPinningOnStorageWriteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139cacheSmartPinningOnStorageWrite).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Write",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139cacheSmartPinningOnStorageWrite = value
        AppToast.show(this, "Cache Smart Pinning On Storage Write: $value")
    }
}

// v139: Progress Bar Custom Thumb Glow139
internal fun PlayerActivity.showV139ProgressBarCustomThumbGlow139Toggle() {
    val current = BiliClient.prefs.v139progressBarCustomThumbGlow139
    BiliClient.prefs.v139progressBarCustomThumbGlow139 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow139: ${if (!current) "ON" else "OFF"}")
}

// v139: Volume Normalize Knee
internal fun PlayerActivity.showV139VolumeNormalizeKneeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139volumeNormalizeKnee).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Knee",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139volumeNormalizeKnee = value
        AppToast.show(this, "Volume Normalize Knee: $value")
    }
}

// v139: History Auto Clean139
internal fun PlayerActivity.showV139HistoryAutoClean139Toggle() {
    val current = BiliClient.prefs.v139historyAutoClean139
    BiliClient.prefs.v139historyAutoClean139 = !current
    AppToast.show(this, "History Auto Clean139: ${if (!current) "ON" else "OFF"}")
}

// v139: Playback Speed Presets Swipe Adjust
internal fun PlayerActivity.showV139PlaybackSpeedPresetsSwipeAdjustToggle() {
    val current = BiliClient.prefs.v139playbackSpeedPresetsSwipeAdjust
    BiliClient.prefs.v139playbackSpeedPresetsSwipeAdjust = !current
    AppToast.show(this, "Playback Speed Presets Swipe Adjust: ${if (!current) "ON" else "OFF"}")
}

// v139: Screenshot Auto Share Twitch Clip
internal fun PlayerActivity.showV139ScreenshotAutoShareTwitchClipToggle() {
    val current = BiliClient.prefs.v139screenshotAutoShareTwitchClip
    BiliClient.prefs.v139screenshotAutoShareTwitchClip = !current
    AppToast.show(this, "Screenshot Auto Share Twitch Clip: ${if (!current) "ON" else "OFF"}")
}

// v139: Video PIP Follow Contrast
internal fun PlayerActivity.showV139VideoPIPFollowContrastToggle() {
    val current = BiliClient.prefs.v139videoPIPFollowContrast
    BiliClient.prefs.v139videoPIPFollowContrast = !current
    AppToast.show(this, "Video PIP Follow Contrast: ${if (!current) "ON" else "OFF"}")
}

// v139: Danmaku Font BG Fill Clip Type
internal fun PlayerActivity.showV139DanmakuFontBgFillClipTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139danmakuFontBgFillClipType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139danmakuFontBgFillClipType = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type: $value")
    }
}

// v139: Subtitle Animation Rotate139
internal fun PlayerActivity.showV139SubtitleAnimationRotate139Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v139subtitleAnimationRotate139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v139subtitleAnimationRotate139 = value
        AppToast.show(this, "Subtitle Animation Rotate139: $value")
    }
}

// v140: Audio Phaser Depth
internal fun PlayerActivity.showV140AudioPhaserDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v140audioPhaserDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140audioPhaserDepth = value
        AppToast.show(this, "Audio Phaser Depth: $value")
    }
}

// v140: Danmaku Font BG Fill Clip Type139
internal fun PlayerActivity.showV140DanmakuFontBgFillClipType139Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140danmakuFontBgFillClipType139).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type139",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140danmakuFontBgFillClipType139 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type139: $value")
    }
}

// v140: Subtitle Animation Rotate140
internal fun PlayerActivity.showV140SubtitleAnimationRotate140Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140subtitleAnimationRotate140).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate140",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140subtitleAnimationRotate140 = value
        AppToast.show(this, "Subtitle Animation Rotate140: $value")
    }
}

// v140: Gesture Tap Zone Visual Scale
internal fun PlayerActivity.showV140GestureTapZoneVisualScaleDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v140gestureTapZoneVisualScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140gestureTapZoneVisualScale = value
        AppToast.show(this, "Gesture Tap Zone Visual Scale: $value")
    }
}

// v140: Cast Video PIP Follow Saturation
internal fun PlayerActivity.showV140CastVideoPIPFollowSaturationToggle() {
    val current = BiliClient.prefs.v140castVideoPIPFollowSaturation
    BiliClient.prefs.v140castVideoPIPFollowSaturation = !current
    AppToast.show(this, "Cast Video PIP Follow Saturation: ${if (!current) "ON" else "OFF"}")
}

// v140: Playlist Auto Group By Genre140
internal fun PlayerActivity.showV140PlaylistAutoGroupByGenre140Toggle() {
    val current = BiliClient.prefs.v140playlistAutoGroupByGenre140
    BiliClient.prefs.v140playlistAutoGroupByGenre140 = !current
    AppToast.show(this, "Playlist Auto Group By Genre140: ${if (!current) "ON" else "OFF"}")
}

// v140: Cache Smart Pinning On Storage IOPS
internal fun PlayerActivity.showV140CacheSmartPinningOnStorageIOPSDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140cacheSmartPinningOnStorageIOPS).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage IOPS",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140cacheSmartPinningOnStorageIOPS = value
        AppToast.show(this, "Cache Smart Pinning On Storage IOPS: $value")
    }
}

// v140: Progress Bar Custom Thumb Border140
internal fun PlayerActivity.showV140ProgressBarCustomThumbBorder140Toggle() {
    val current = BiliClient.prefs.v140progressBarCustomThumbBorder140
    BiliClient.prefs.v140progressBarCustomThumbBorder140 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border140: ${if (!current) "ON" else "OFF"}")
}

// v140: Volume Normalize Attack
internal fun PlayerActivity.showV140VolumeNormalizeAttackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140volumeNormalizeAttack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Attack",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140volumeNormalizeAttack = value
        AppToast.show(this, "Volume Normalize Attack: $value")
    }
}

// v140: History Auto Clean140
internal fun PlayerActivity.showV140HistoryAutoClean140Toggle() {
    val current = BiliClient.prefs.v140historyAutoClean140
    BiliClient.prefs.v140historyAutoClean140 = !current
    AppToast.show(this, "History Auto Clean140: ${if (!current) "ON" else "OFF"}")
}

// v140: Playback Speed Presets Pinch Adjust
internal fun PlayerActivity.showV140PlaybackSpeedPresetsPinchAdjustToggle() {
    val current = BiliClient.prefs.v140playbackSpeedPresetsPinchAdjust
    BiliClient.prefs.v140playbackSpeedPresetsPinchAdjust = !current
    AppToast.show(this, "Playback Speed Presets Pinch Adjust: ${if (!current) "ON" else "OFF"}")
}

// v140: Screenshot Auto Share Bilibili
internal fun PlayerActivity.showV140ScreenshotAutoShareBilibiliToggle() {
    val current = BiliClient.prefs.v140screenshotAutoShareBilibili
    BiliClient.prefs.v140screenshotAutoShareBilibili = !current
    AppToast.show(this, "Screenshot Auto Share Bilibili: ${if (!current) "ON" else "OFF"}")
}

// v140: Video PIP Follow Gamma
internal fun PlayerActivity.showV140VideoPIPFollowGammaToggle() {
    val current = BiliClient.prefs.v140videoPIPFollowGamma
    BiliClient.prefs.v140videoPIPFollowGamma = !current
    AppToast.show(this, "Video PIP Follow Gamma: ${if (!current) "ON" else "OFF"}")
}

// v140: Danmaku Font BG Fill Clip Type140
internal fun PlayerActivity.showV140DanmakuFontBgFillClipType140Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v140danmakuFontBgFillClipType140).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type140",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140danmakuFontBgFillClipType140 = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type140: $value")
    }
}

// v140: Subtitle Animation Blur140
internal fun PlayerActivity.showV140SubtitleAnimationBlur140Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v140subtitleAnimationBlur140).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur140",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v140subtitleAnimationBlur140 = value
        AppToast.show(this, "Subtitle Animation Blur140: $value")
    }
}

// v141: Audio Phaser Feedback
internal fun PlayerActivity.showV141AudioPhaserFeedbackDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v141audioPhaserFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141audioPhaserFeedback = value
        AppToast.show(this, "Audio Phaser Feedback: $value")
    }
}

// v141: Danmaku Font BG Fill Clip Type140x
internal fun PlayerActivity.showV141DanmakuFontBgFillClipType140xDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141danmakuFontBgFillClipType140x).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Clip Type140x",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141danmakuFontBgFillClipType140x = value
        AppToast.show(this, "Danmaku Font BG Fill Clip Type140x: $value")
    }
}

// v141: Subtitle Animation Blur141
internal fun PlayerActivity.showV141SubtitleAnimationBlur141Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v141subtitleAnimationBlur141).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur141",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141subtitleAnimationBlur141 = value
        AppToast.show(this, "Subtitle Animation Blur141: $value")
    }
}

// v141: Gesture Tap Zone Visual Anim
internal fun PlayerActivity.showV141GestureTapZoneVisualAnimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141gestureTapZoneVisualAnim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141gestureTapZoneVisualAnim = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim: $value")
    }
}

// v141: Cast Video PIP Snap To Corner
internal fun PlayerActivity.showV141CastVideoPIPSnapToCornerToggle() {
    val current = BiliClient.prefs.v141castVideoPIPSnapToCorner
    BiliClient.prefs.v141castVideoPIPSnapToCorner = !current
    AppToast.show(this, "Cast Video PIP Snap To Corner: ${if (!current) "ON" else "OFF"}")
}

// v141: Playlist Auto Group By Duration141
internal fun PlayerActivity.showV141PlaylistAutoGroupByDuration141Toggle() {
    val current = BiliClient.prefs.v141playlistAutoGroupByDuration141
    BiliClient.prefs.v141playlistAutoGroupByDuration141 = !current
    AppToast.show(this, "Playlist Auto Group By Duration141: ${if (!current) "ON" else "OFF"}")
}

// v141: Cache Smart Pinning On Schedule Type
internal fun PlayerActivity.showV141CacheSmartPinningOnScheduleTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141cacheSmartPinningOnScheduleType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141cacheSmartPinningOnScheduleType = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Type: $value")
    }
}

// v141: Progress Bar Custom Thumb Anim141
internal fun PlayerActivity.showV141ProgressBarCustomThumbAnim141Toggle() {
    val current = BiliClient.prefs.v141progressBarCustomThumbAnim141
    BiliClient.prefs.v141progressBarCustomThumbAnim141 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Anim141: ${if (!current) "ON" else "OFF"}")
}

// v141: Volume Normalize Range
internal fun PlayerActivity.showV141VolumeNormalizeRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v141volumeNormalizeRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141volumeNormalizeRange = value
        AppToast.show(this, "Volume Normalize Range: $value")
    }
}

// v141: History Auto Clean141
internal fun PlayerActivity.showV141HistoryAutoClean141Toggle() {
    val current = BiliClient.prefs.v141historyAutoClean141
    BiliClient.prefs.v141historyAutoClean141 = !current
    AppToast.show(this, "History Auto Clean141: ${if (!current) "ON" else "OFF"}")
}

// v141: Playback Speed Presets Shake Adjust
internal fun PlayerActivity.showV141PlaybackSpeedPresetsShakeAdjustToggle() {
    val current = BiliClient.prefs.v141playbackSpeedPresetsShakeAdjust
    BiliClient.prefs.v141playbackSpeedPresetsShakeAdjust = !current
    AppToast.show(this, "Playback Speed Presets Shake Adjust: ${if (!current) "ON" else "OFF"}")
}

// v141: Screenshot Auto Share Discord
internal fun PlayerActivity.showV141ScreenshotAutoShareDiscordToggle() {
    val current = BiliClient.prefs.v141screenshotAutoShareDiscord
    BiliClient.prefs.v141screenshotAutoShareDiscord = !current
    AppToast.show(this, "Screenshot Auto Share Discord: ${if (!current) "ON" else "OFF"}")
}

// v141: Video PIP Follow Color Temp
internal fun PlayerActivity.showV141VideoPIPFollowColorTempToggle() {
    val current = BiliClient.prefs.v141videoPIPFollowColorTemp
    BiliClient.prefs.v141videoPIPFollowColorTemp = !current
    AppToast.show(this, "Video PIP Follow Color Temp: ${if (!current) "ON" else "OFF"}")
}

// v141: Danmaku Font BG Fill Mask Toggle
internal fun PlayerActivity.showV141DanmakuFontBgFillMaskToggleToggle() {
    val current = BiliClient.prefs.v141danmakuFontBgFillMaskToggle
    BiliClient.prefs.v141danmakuFontBgFillMaskToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Toggle: ${if (!current) "ON" else "OFF"}")
}

// v141: Subtitle Animation Fade In141
internal fun PlayerActivity.showV141SubtitleAnimationFadeIn141Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v141subtitleAnimationFadeIn141).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In141",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v141subtitleAnimationFadeIn141 = value
        AppToast.show(this, "Subtitle Animation Fade In141: $value")
    }
}

// v142: Audio Phaser Mix
internal fun PlayerActivity.showV142AudioPhaserMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v142audioPhaserMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142audioPhaserMix = value
        AppToast.show(this, "Audio Phaser Mix: $value")
    }
}

// v142: Danmaku Font BG Fill Mask Path
internal fun PlayerActivity.showV142DanmakuFontBgFillMaskPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v142danmakuFontBgFillMaskPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142danmakuFontBgFillMaskPath = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Path: $value")
    }
}

// v142: Subtitle Animation Fade In142
internal fun PlayerActivity.showV142SubtitleAnimationFadeIn142Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v142subtitleAnimationFadeIn142).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In142",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142subtitleAnimationFadeIn142 = value
        AppToast.show(this, "Subtitle Animation Fade In142: $value")
    }
}

// v142: Gesture Tap Zone Visual Anim Duration
internal fun PlayerActivity.showV142GestureTapZoneVisualAnimDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v142gestureTapZoneVisualAnimDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142gestureTapZoneVisualAnimDuration = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Duration: $value")
    }
}

// v142: Cast Video PIP Snap To Edge
internal fun PlayerActivity.showV142CastVideoPIPSnapToEdgeToggle() {
    val current = BiliClient.prefs.v142castVideoPIPSnapToEdge
    BiliClient.prefs.v142castVideoPIPSnapToEdge = !current
    AppToast.show(this, "Cast Video PIP Snap To Edge: ${if (!current) "ON" else "OFF"}")
}

// v142: Playlist Auto Group By Duration142
internal fun PlayerActivity.showV142PlaylistAutoGroupByDuration142Toggle() {
    val current = BiliClient.prefs.v142playlistAutoGroupByDuration142
    BiliClient.prefs.v142playlistAutoGroupByDuration142 = !current
    AppToast.show(this, "Playlist Auto Group By Duration142: ${if (!current) "ON" else "OFF"}")
}

// v142: Cache Smart Pinning On Schedule Freq
internal fun PlayerActivity.showV142CacheSmartPinningOnScheduleFreqDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v142cacheSmartPinningOnScheduleFreq).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Freq",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142cacheSmartPinningOnScheduleFreq = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Freq: $value")
    }
}

// v142: Progress Bar Custom Thumb Anim142
internal fun PlayerActivity.showV142ProgressBarCustomThumbAnim142Toggle() {
    val current = BiliClient.prefs.v142progressBarCustomThumbAnim142
    BiliClient.prefs.v142progressBarCustomThumbAnim142 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Anim142: ${if (!current) "ON" else "OFF"}")
}

// v142: Volume Normalize Stereo
internal fun PlayerActivity.showV142VolumeNormalizeStereoToggle() {
    val current = BiliClient.prefs.v142volumeNormalizeStereo
    BiliClient.prefs.v142volumeNormalizeStereo = !current
    AppToast.show(this, "Volume Normalize Stereo: ${if (!current) "ON" else "OFF"}")
}

// v142: History Auto Clean142
internal fun PlayerActivity.showV142HistoryAutoClean142Toggle() {
    val current = BiliClient.prefs.v142historyAutoClean142
    BiliClient.prefs.v142historyAutoClean142 = !current
    AppToast.show(this, "History Auto Clean142: ${if (!current) "ON" else "OFF"}")
}

// v142: Playback Speed Presets Tilt Adjust
internal fun PlayerActivity.showV142PlaybackSpeedPresetsTiltAdjustToggle() {
    val current = BiliClient.prefs.v142playbackSpeedPresetsTiltAdjust
    BiliClient.prefs.v142playbackSpeedPresetsTiltAdjust = !current
    AppToast.show(this, "Playback Speed Presets Tilt Adjust: ${if (!current) "ON" else "OFF"}")
}

// v142: Screenshot Auto Share WhatsApp
internal fun PlayerActivity.showV142ScreenshotAutoShareWhatsAppToggle() {
    val current = BiliClient.prefs.v142screenshotAutoShareWhatsApp
    BiliClient.prefs.v142screenshotAutoShareWhatsApp = !current
    AppToast.show(this, "Screenshot Auto Share WhatsApp: ${if (!current) "ON" else "OFF"}")
}

// v142: Video PIP Follow Color Space
internal fun PlayerActivity.showV142VideoPIPFollowColorSpaceToggle() {
    val current = BiliClient.prefs.v142videoPIPFollowColorSpace
    BiliClient.prefs.v142videoPIPFollowColorSpace = !current
    AppToast.show(this, "Video PIP Follow Color Space: ${if (!current) "ON" else "OFF"}")
}

// v142: Danmaku Font BG Fill Mask Path141
internal fun PlayerActivity.showV142DanmakuFontBgFillMaskPath141Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v142danmakuFontBgFillMaskPath141).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Path141",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142danmakuFontBgFillMaskPath141 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Path141: $value")
    }
}

// v142: Subtitle Animation Fade Out142
internal fun PlayerActivity.showV142SubtitleAnimationFadeOut142Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v142subtitleAnimationFadeOut142).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out142",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v142subtitleAnimationFadeOut142 = value
        AppToast.show(this, "Subtitle Animation Fade Out142: $value")
    }
}

// v143: Audio Phaser Stages
internal fun PlayerActivity.showV143AudioPhaserStagesDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143audioPhaserStages).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Phaser Stages",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143audioPhaserStages = value
        AppToast.show(this, "Audio Phaser Stages: $value")
    }
}

// v143: Danmaku Font BG Fill Mask Path142
internal fun PlayerActivity.showV143DanmakuFontBgFillMaskPath142Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143danmakuFontBgFillMaskPath142).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Path142",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143danmakuFontBgFillMaskPath142 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Path142: $value")
    }
}

// v143: Subtitle Animation Fade Out143
internal fun PlayerActivity.showV143SubtitleAnimationFadeOut143Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v143subtitleAnimationFadeOut143).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out143",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143subtitleAnimationFadeOut143 = value
        AppToast.show(this, "Subtitle Animation Fade Out143: $value")
    }
}

