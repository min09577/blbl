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

internal fun PlayerActivity.showV135CastVideoPIPFollowScreenToggle() {
    val current = BiliClient.prefs.v135castVideoPIPFollowScreen
    BiliClient.prefs.v135castVideoPIPFollowScreen = !current
    AppToast.show(this, "Cast Video PIP Follow Screen: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV135PlaylistAutoGroupByLikeCountToggle() {
    val current = BiliClient.prefs.v135playlistAutoGroupByLikeCount
    BiliClient.prefs.v135playlistAutoGroupByLikeCount = !current
    AppToast.show(this, "Playlist Auto Group By Like Count: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV135HistoryAutoClean135Toggle() {
    val current = BiliClient.prefs.v135historyAutoClean135
    BiliClient.prefs.v135historyAutoClean135 = !current
    AppToast.show(this, "History Auto Clean135: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV135PlaybackSpeedPresetsGestureToggle() {
    val current = BiliClient.prefs.v135playbackSpeedPresetsGesture
    BiliClient.prefs.v135playbackSpeedPresetsGesture = !current
    AppToast.show(this, "Playback Speed Presets Gesture: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV135ScreenshotAutoShareTumblrToggle() {
    val current = BiliClient.prefs.v135screenshotAutoShareTumblr
    BiliClient.prefs.v135screenshotAutoShareTumblr = !current
    AppToast.show(this, "Screenshot Auto Share Tumblr: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV135VideoPIPFollowSystemThemeToggle() {
    val current = BiliClient.prefs.v135videoPIPFollowSystemTheme
    BiliClient.prefs.v135videoPIPFollowSystemTheme = !current
    AppToast.show(this, "Video PIP Follow System Theme: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV135DanmakuFontBgFillClipToggleToggle() {
    val current = BiliClient.prefs.v135danmakuFontBgFillClipToggle
    BiliClient.prefs.v135danmakuFontBgFillClipToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Clip Toggle: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV136CastVideoPIPFollowOrientationToggle() {
    val current = BiliClient.prefs.v136castVideoPIPFollowOrientation
    BiliClient.prefs.v136castVideoPIPFollowOrientation = !current
    AppToast.show(this, "Cast Video PIP Follow Orientation: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV136PlaylistAutoGroupByCommentCountToggle() {
    val current = BiliClient.prefs.v136playlistAutoGroupByCommentCount
    BiliClient.prefs.v136playlistAutoGroupByCommentCount = !current
    AppToast.show(this, "Playlist Auto Group By Comment Count: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV136VolumeNormalizeAdaptiveToggle() {
    val current = BiliClient.prefs.v136volumeNormalizeAdaptive
    BiliClient.prefs.v136volumeNormalizeAdaptive = !current
    AppToast.show(this, "Volume Normalize Adaptive: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV136HistoryAutoClean136Toggle() {
    val current = BiliClient.prefs.v136historyAutoClean136
    BiliClient.prefs.v136historyAutoClean136 = !current
    AppToast.show(this, "History Auto Clean136: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV136PlaybackSpeedPresetsQuickAccessToggle() {
    val current = BiliClient.prefs.v136playbackSpeedPresetsQuickAccess
    BiliClient.prefs.v136playbackSpeedPresetsQuickAccess = !current
    AppToast.show(this, "Playback Speed Presets Quick Access: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV136ScreenshotAutoSharePinterestToggle() {
    val current = BiliClient.prefs.v136screenshotAutoSharePinterest
    BiliClient.prefs.v136screenshotAutoSharePinterest = !current
    AppToast.show(this, "Screenshot Auto Share Pinterest: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV136VideoPIPFollowAudioFocusToggle() {
    val current = BiliClient.prefs.v136videoPIPFollowAudioFocus
    BiliClient.prefs.v136videoPIPFollowAudioFocus = !current
    AppToast.show(this, "Video PIP Follow Audio Focus: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV137CastVideoPIPFollowBatteryToggle() {
    val current = BiliClient.prefs.v137castVideoPIPFollowBattery
    BiliClient.prefs.v137castVideoPIPFollowBattery = !current
    AppToast.show(this, "Cast Video PIP Follow Battery: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV137PlaylistAutoGroupByShareCountToggle() {
    val current = BiliClient.prefs.v137playlistAutoGroupByShareCount
    BiliClient.prefs.v137playlistAutoGroupByShareCount = !current
    AppToast.show(this, "Playlist Auto Group By Share Count: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV137HistoryAutoClean137Toggle() {
    val current = BiliClient.prefs.v137historyAutoClean137
    BiliClient.prefs.v137historyAutoClean137 = !current
    AppToast.show(this, "History Auto Clean137: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV137PlaybackSpeedPresetsNotificationToggleToggle() {
    val current = BiliClient.prefs.v137playbackSpeedPresetsNotificationToggle
    BiliClient.prefs.v137playbackSpeedPresetsNotificationToggle = !current
    AppToast.show(this, "Playback Speed Presets Notification Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV137ScreenshotAutoShareTwitchToggle() {
    val current = BiliClient.prefs.v137screenshotAutoShareTwitch
    BiliClient.prefs.v137screenshotAutoShareTwitch = !current
    AppToast.show(this, "Screenshot Auto Share Twitch: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV137VideoPIPFollowDoNotDisturbToggle() {
    val current = BiliClient.prefs.v137videoPIPFollowDoNotDisturb
    BiliClient.prefs.v137videoPIPFollowDoNotDisturb = !current
    AppToast.show(this, "Video PIP Follow Do Not Disturb: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV138AudioPhaserToggle138Toggle() {
    val current = BiliClient.prefs.v138audioPhaserToggle138
    BiliClient.prefs.v138audioPhaserToggle138 = !current
    AppToast.show(this, "Audio Phaser Toggle138: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV138CastVideoPIPFollowStorageToggle() {
    val current = BiliClient.prefs.v138castVideoPIPFollowStorage
    BiliClient.prefs.v138castVideoPIPFollowStorage = !current
    AppToast.show(this, "Cast Video PIP Follow Storage: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV138PlaylistAutoGroupByFavCountToggle() {
    val current = BiliClient.prefs.v138playlistAutoGroupByFavCount
    BiliClient.prefs.v138playlistAutoGroupByFavCount = !current
    AppToast.show(this, "Playlist Auto Group By Fav Count: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV138ProgressBarCustomThumbShadow138Toggle() {
    val current = BiliClient.prefs.v138progressBarCustomThumbShadow138
    BiliClient.prefs.v138progressBarCustomThumbShadow138 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow138: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV138HistoryAutoClean138Toggle() {
    val current = BiliClient.prefs.v138historyAutoClean138
    BiliClient.prefs.v138historyAutoClean138 = !current
    AppToast.show(this, "History Auto Clean138: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV138PlaybackSpeedPresetsDragAdjustToggle() {
    val current = BiliClient.prefs.v138playbackSpeedPresetsDragAdjust
    BiliClient.prefs.v138playbackSpeedPresetsDragAdjust = !current
    AppToast.show(this, "Playback Speed Presets Drag Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV138ScreenshotAutoShareYouTubeToggle() {
    val current = BiliClient.prefs.v138screenshotAutoShareYouTube
    BiliClient.prefs.v138screenshotAutoShareYouTube = !current
    AppToast.show(this, "Screenshot Auto Share YouTube: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV138VideoPIPFollowBrightnessToggle() {
    val current = BiliClient.prefs.v138videoPIPFollowBrightness
    BiliClient.prefs.v138videoPIPFollowBrightness = !current
    AppToast.show(this, "Video PIP Follow Brightness: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV139CastVideoPIPFollowVolumeToggle() {
    val current = BiliClient.prefs.v139castVideoPIPFollowVolume
    BiliClient.prefs.v139castVideoPIPFollowVolume = !current
    AppToast.show(this, "Cast Video PIP Follow Volume: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV139PlaylistAutoGroupByDanCountToggle() {
    val current = BiliClient.prefs.v139playlistAutoGroupByDanCount
    BiliClient.prefs.v139playlistAutoGroupByDanCount = !current
    AppToast.show(this, "Playlist Auto Group By Dan Count: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV139ProgressBarCustomThumbGlow139Toggle() {
    val current = BiliClient.prefs.v139progressBarCustomThumbGlow139
    BiliClient.prefs.v139progressBarCustomThumbGlow139 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow139: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV139HistoryAutoClean139Toggle() {
    val current = BiliClient.prefs.v139historyAutoClean139
    BiliClient.prefs.v139historyAutoClean139 = !current
    AppToast.show(this, "History Auto Clean139: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV139PlaybackSpeedPresetsSwipeAdjustToggle() {
    val current = BiliClient.prefs.v139playbackSpeedPresetsSwipeAdjust
    BiliClient.prefs.v139playbackSpeedPresetsSwipeAdjust = !current
    AppToast.show(this, "Playback Speed Presets Swipe Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV139ScreenshotAutoShareTwitchClipToggle() {
    val current = BiliClient.prefs.v139screenshotAutoShareTwitchClip
    BiliClient.prefs.v139screenshotAutoShareTwitchClip = !current
    AppToast.show(this, "Screenshot Auto Share Twitch Clip: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV139VideoPIPFollowContrastToggle() {
    val current = BiliClient.prefs.v139videoPIPFollowContrast
    BiliClient.prefs.v139videoPIPFollowContrast = !current
    AppToast.show(this, "Video PIP Follow Contrast: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV140CastVideoPIPFollowSaturationToggle() {
    val current = BiliClient.prefs.v140castVideoPIPFollowSaturation
    BiliClient.prefs.v140castVideoPIPFollowSaturation = !current
    AppToast.show(this, "Cast Video PIP Follow Saturation: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV140PlaylistAutoGroupByGenre140Toggle() {
    val current = BiliClient.prefs.v140playlistAutoGroupByGenre140
    BiliClient.prefs.v140playlistAutoGroupByGenre140 = !current
    AppToast.show(this, "Playlist Auto Group By Genre140: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV140ProgressBarCustomThumbBorder140Toggle() {
    val current = BiliClient.prefs.v140progressBarCustomThumbBorder140
    BiliClient.prefs.v140progressBarCustomThumbBorder140 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border140: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV140HistoryAutoClean140Toggle() {
    val current = BiliClient.prefs.v140historyAutoClean140
    BiliClient.prefs.v140historyAutoClean140 = !current
    AppToast.show(this, "History Auto Clean140: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV140PlaybackSpeedPresetsPinchAdjustToggle() {
    val current = BiliClient.prefs.v140playbackSpeedPresetsPinchAdjust
    BiliClient.prefs.v140playbackSpeedPresetsPinchAdjust = !current
    AppToast.show(this, "Playback Speed Presets Pinch Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV140ScreenshotAutoShareBilibiliToggle() {
    val current = BiliClient.prefs.v140screenshotAutoShareBilibili
    BiliClient.prefs.v140screenshotAutoShareBilibili = !current
    AppToast.show(this, "Screenshot Auto Share Bilibili: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV140VideoPIPFollowGammaToggle() {
    val current = BiliClient.prefs.v140videoPIPFollowGamma
    BiliClient.prefs.v140videoPIPFollowGamma = !current
    AppToast.show(this, "Video PIP Follow Gamma: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV141CastVideoPIPSnapToCornerToggle() {
    val current = BiliClient.prefs.v141castVideoPIPSnapToCorner
    BiliClient.prefs.v141castVideoPIPSnapToCorner = !current
    AppToast.show(this, "Cast Video PIP Snap To Corner: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV141PlaylistAutoGroupByDuration141Toggle() {
    val current = BiliClient.prefs.v141playlistAutoGroupByDuration141
    BiliClient.prefs.v141playlistAutoGroupByDuration141 = !current
    AppToast.show(this, "Playlist Auto Group By Duration141: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV141ProgressBarCustomThumbAnim141Toggle() {
    val current = BiliClient.prefs.v141progressBarCustomThumbAnim141
    BiliClient.prefs.v141progressBarCustomThumbAnim141 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Anim141: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV141HistoryAutoClean141Toggle() {
    val current = BiliClient.prefs.v141historyAutoClean141
    BiliClient.prefs.v141historyAutoClean141 = !current
    AppToast.show(this, "History Auto Clean141: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV141PlaybackSpeedPresetsShakeAdjustToggle() {
    val current = BiliClient.prefs.v141playbackSpeedPresetsShakeAdjust
    BiliClient.prefs.v141playbackSpeedPresetsShakeAdjust = !current
    AppToast.show(this, "Playback Speed Presets Shake Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV141ScreenshotAutoShareDiscordToggle() {
    val current = BiliClient.prefs.v141screenshotAutoShareDiscord
    BiliClient.prefs.v141screenshotAutoShareDiscord = !current
    AppToast.show(this, "Screenshot Auto Share Discord: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV141VideoPIPFollowColorTempToggle() {
    val current = BiliClient.prefs.v141videoPIPFollowColorTemp
    BiliClient.prefs.v141videoPIPFollowColorTemp = !current
    AppToast.show(this, "Video PIP Follow Color Temp: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV141DanmakuFontBgFillMaskToggleToggle() {
    val current = BiliClient.prefs.v141danmakuFontBgFillMaskToggle
    BiliClient.prefs.v141danmakuFontBgFillMaskToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Toggle: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV142CastVideoPIPSnapToEdgeToggle() {
    val current = BiliClient.prefs.v142castVideoPIPSnapToEdge
    BiliClient.prefs.v142castVideoPIPSnapToEdge = !current
    AppToast.show(this, "Cast Video PIP Snap To Edge: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV142PlaylistAutoGroupByDuration142Toggle() {
    val current = BiliClient.prefs.v142playlistAutoGroupByDuration142
    BiliClient.prefs.v142playlistAutoGroupByDuration142 = !current
    AppToast.show(this, "Playlist Auto Group By Duration142: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV142ProgressBarCustomThumbAnim142Toggle() {
    val current = BiliClient.prefs.v142progressBarCustomThumbAnim142
    BiliClient.prefs.v142progressBarCustomThumbAnim142 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Anim142: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV142VolumeNormalizeStereoToggle() {
    val current = BiliClient.prefs.v142volumeNormalizeStereo
    BiliClient.prefs.v142volumeNormalizeStereo = !current
    AppToast.show(this, "Volume Normalize Stereo: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV142HistoryAutoClean142Toggle() {
    val current = BiliClient.prefs.v142historyAutoClean142
    BiliClient.prefs.v142historyAutoClean142 = !current
    AppToast.show(this, "History Auto Clean142: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV142PlaybackSpeedPresetsTiltAdjustToggle() {
    val current = BiliClient.prefs.v142playbackSpeedPresetsTiltAdjust
    BiliClient.prefs.v142playbackSpeedPresetsTiltAdjust = !current
    AppToast.show(this, "Playback Speed Presets Tilt Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV142ScreenshotAutoShareWhatsAppToggle() {
    val current = BiliClient.prefs.v142screenshotAutoShareWhatsApp
    BiliClient.prefs.v142screenshotAutoShareWhatsApp = !current
    AppToast.show(this, "Screenshot Auto Share WhatsApp: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV142VideoPIPFollowColorSpaceToggle() {
    val current = BiliClient.prefs.v142videoPIPFollowColorSpace
    BiliClient.prefs.v142videoPIPFollowColorSpace = !current
    AppToast.show(this, "Video PIP Follow Color Space: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV143GestureTapZoneVisualAnimTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143gestureTapZoneVisualAnimType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143gestureTapZoneVisualAnimType = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Type: $value")
    }
}

internal fun PlayerActivity.showV143CastVideoPIPSnapStrengthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143castVideoPIPSnapStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143castVideoPIPSnapStrength = value
        AppToast.show(this, "Cast Video PIP Snap Strength: $value")
    }
}

internal fun PlayerActivity.showV143PlaylistAutoGroupByResolutionToggle() {
    val current = BiliClient.prefs.v143playlistAutoGroupByResolution
    BiliClient.prefs.v143playlistAutoGroupByResolution = !current
    AppToast.show(this, "Playlist Auto Group By Resolution: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV143CacheSmartPinningOnScheduleTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143cacheSmartPinningOnScheduleTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143cacheSmartPinningOnScheduleTime = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Time: $value")
    }
}

internal fun PlayerActivity.showV143ProgressBarCustomThumbSize143Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v143progressBarCustomThumbSize143).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Size143",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143progressBarCustomThumbSize143 = value
        AppToast.show(this, "Progress Bar Custom Thumb Size143: $value")
    }
}

internal fun PlayerActivity.showV143VolumeNormalizeMidSideToggle() {
    val current = BiliClient.prefs.v143volumeNormalizeMidSide
    BiliClient.prefs.v143volumeNormalizeMidSide = !current
    AppToast.show(this, "Volume Normalize Mid Side: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV143HistoryAutoClean143Toggle() {
    val current = BiliClient.prefs.v143historyAutoClean143
    BiliClient.prefs.v143historyAutoClean143 = !current
    AppToast.show(this, "History Auto Clean143: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV143PlaybackSpeedPresetsProximityToggle() {
    val current = BiliClient.prefs.v143playbackSpeedPresetsProximity
    BiliClient.prefs.v143playbackSpeedPresetsProximity = !current
    AppToast.show(this, "Playback Speed Presets Proximity: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV143ScreenshotAutoShareLineToggle() {
    val current = BiliClient.prefs.v143screenshotAutoShareLine
    BiliClient.prefs.v143screenshotAutoShareLine = !current
    AppToast.show(this, "Screenshot Auto Share Line: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV143VideoPIPFollowColorBitToggle() {
    val current = BiliClient.prefs.v143videoPIPFollowColorBit
    BiliClient.prefs.v143videoPIPFollowColorBit = !current
    AppToast.show(this, "Video PIP Follow Color Bit: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV143DanmakuFontBgFillMaskRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v143danmakuFontBgFillMaskRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143danmakuFontBgFillMaskRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Radius: $value")
    }
}

internal fun PlayerActivity.showV143SubtitleAnimationTranslate143Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v143subtitleAnimationTranslate143).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate143",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v143subtitleAnimationTranslate143 = value
        AppToast.show(this, "Subtitle Animation Translate143: $value")
    }
}

internal fun PlayerActivity.showV144AudioCompressorToggle144Toggle() {
    val current = BiliClient.prefs.v144audioCompressorToggle144
    BiliClient.prefs.v144audioCompressorToggle144 = !current
    AppToast.show(this, "Audio Compressor Toggle144: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144DanmakuFontBgFillMaskRadius143Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v144danmakuFontBgFillMaskRadius143).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Radius143",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144danmakuFontBgFillMaskRadius143 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Radius143: $value")
    }
}

internal fun PlayerActivity.showV144SubtitleAnimationTranslate144Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v144subtitleAnimationTranslate144).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate144",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144subtitleAnimationTranslate144 = value
        AppToast.show(this, "Subtitle Animation Translate144: $value")
    }
}

internal fun PlayerActivity.showV144GestureTapZoneVisualAnimScaleDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v144gestureTapZoneVisualAnimScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144gestureTapZoneVisualAnimScale = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Scale: $value")
    }
}

internal fun PlayerActivity.showV144CastVideoPIPSnapOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v144castVideoPIPSnapOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144castVideoPIPSnapOffset = value
        AppToast.show(this, "Cast Video PIP Snap Offset: $value")
    }
}

internal fun PlayerActivity.showV144PlaylistAutoGroupByCodecToggle() {
    val current = BiliClient.prefs.v144playlistAutoGroupByCodec
    BiliClient.prefs.v144playlistAutoGroupByCodec = !current
    AppToast.show(this, "Playlist Auto Group By Codec: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144CacheSmartPinningOnScheduleDayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v144cacheSmartPinningOnScheduleDay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Day",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144cacheSmartPinningOnScheduleDay = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Day: $value")
    }
}

internal fun PlayerActivity.showV144ProgressBarCustomThumbColor144Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v144progressBarCustomThumbColor144).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color144",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144progressBarCustomThumbColor144 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color144: $value")
    }
}

internal fun PlayerActivity.showV144VolumeNormalizeMultibandToggle() {
    val current = BiliClient.prefs.v144volumeNormalizeMultiband
    BiliClient.prefs.v144volumeNormalizeMultiband = !current
    AppToast.show(this, "Volume Normalize Multiband: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144HistoryAutoClean144Toggle() {
    val current = BiliClient.prefs.v144historyAutoClean144
    BiliClient.prefs.v144historyAutoClean144 = !current
    AppToast.show(this, "History Auto Clean144: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144PlaybackSpeedPresetsLightSensorToggle() {
    val current = BiliClient.prefs.v144playbackSpeedPresetsLightSensor
    BiliClient.prefs.v144playbackSpeedPresetsLightSensor = !current
    AppToast.show(this, "Playback Speed Presets Light Sensor: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144ScreenshotAutoShareInstagramToggle() {
    val current = BiliClient.prefs.v144screenshotAutoShareInstagram
    BiliClient.prefs.v144screenshotAutoShareInstagram = !current
    AppToast.show(this, "Screenshot Auto Share Instagram: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144VideoPIPFollowHDRToggle() {
    val current = BiliClient.prefs.v144videoPIPFollowHDR
    BiliClient.prefs.v144videoPIPFollowHDR = !current
    AppToast.show(this, "Video PIP Follow HDR: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV144DanmakuFontBgFillMaskRadius144Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v144danmakuFontBgFillMaskRadius144).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Radius144",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144danmakuFontBgFillMaskRadius144 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Radius144: $value")
    }
}

internal fun PlayerActivity.showV144SubtitleAnimationScale144Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v144subtitleAnimationScale144).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale144",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v144subtitleAnimationScale144 = value
        AppToast.show(this, "Subtitle Animation Scale144: $value")
    }
}

internal fun PlayerActivity.showV145AudioCompressorThresholdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v145audioCompressorThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145audioCompressorThreshold = value
        AppToast.show(this, "Audio Compressor Threshold: $value")
    }
}

internal fun PlayerActivity.showV145DanmakuFontBgFillMaskRadius145Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v145danmakuFontBgFillMaskRadius145).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Radius145",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145danmakuFontBgFillMaskRadius145 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Radius145: $value")
    }
}

internal fun PlayerActivity.showV145SubtitleAnimationScale145Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v145subtitleAnimationScale145).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale145",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145subtitleAnimationScale145 = value
        AppToast.show(this, "Subtitle Animation Scale145: $value")
    }
}

internal fun PlayerActivity.showV145GestureTapZoneVisualAnimOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v145gestureTapZoneVisualAnimOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145gestureTapZoneVisualAnimOpacity = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Opacity: $value")
    }
}

internal fun PlayerActivity.showV145CastVideoPIPSnapDurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v145castVideoPIPSnapDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145castVideoPIPSnapDuration = value
        AppToast.show(this, "Cast Video PIP Snap Duration: $value")
    }
}

internal fun PlayerActivity.showV145PlaylistAutoGroupByBitrateToggle() {
    val current = BiliClient.prefs.v145playlistAutoGroupByBitrate
    BiliClient.prefs.v145playlistAutoGroupByBitrate = !current
    AppToast.show(this, "Playlist Auto Group By Bitrate: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145CacheSmartPinningOnScheduleHourDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v145cacheSmartPinningOnScheduleHour).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Hour",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145cacheSmartPinningOnScheduleHour = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Hour: $value")
    }
}

internal fun PlayerActivity.showV145ProgressBarCustomThumbGlow145Toggle() {
    val current = BiliClient.prefs.v145progressBarCustomThumbGlow145
    BiliClient.prefs.v145progressBarCustomThumbGlow145 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow145: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145VolumeNormalizeAutoGainToggle() {
    val current = BiliClient.prefs.v145volumeNormalizeAutoGain
    BiliClient.prefs.v145volumeNormalizeAutoGain = !current
    AppToast.show(this, "Volume Normalize Auto Gain: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145HistoryAutoClean145Toggle() {
    val current = BiliClient.prefs.v145historyAutoClean145
    BiliClient.prefs.v145historyAutoClean145 = !current
    AppToast.show(this, "History Auto Clean145: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145PlaybackSpeedPresetsGyroAdjustToggle() {
    val current = BiliClient.prefs.v145playbackSpeedPresetsGyroAdjust
    BiliClient.prefs.v145playbackSpeedPresetsGyroAdjust = !current
    AppToast.show(this, "Playback Speed Presets Gyro Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145ScreenshotAutoShareFacebookToggle() {
    val current = BiliClient.prefs.v145screenshotAutoShareFacebook
    BiliClient.prefs.v145screenshotAutoShareFacebook = !current
    AppToast.show(this, "Screenshot Auto Share Facebook: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145VideoPIPFollowHDR10Toggle() {
    val current = BiliClient.prefs.v145videoPIPFollowHDR10
    BiliClient.prefs.v145videoPIPFollowHDR10 = !current
    AppToast.show(this, "Video PIP Follow HDR10: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV145DanmakuFontBgFillMaskTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v145danmakuFontBgFillMaskType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145danmakuFontBgFillMaskType = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Type: $value")
    }
}

internal fun PlayerActivity.showV145SubtitleAnimationRotate145Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v145subtitleAnimationRotate145).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate145",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v145subtitleAnimationRotate145 = value
        AppToast.show(this, "Subtitle Animation Rotate145: $value")
    }
}

internal fun PlayerActivity.showV146AudioCompressorRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146audioCompressorRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146audioCompressorRatio = value
        AppToast.show(this, "Audio Compressor Ratio: $value")
    }
}

internal fun PlayerActivity.showV146DanmakuFontBgFillMaskType145Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146danmakuFontBgFillMaskType145).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Type145",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146danmakuFontBgFillMaskType145 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Type145: $value")
    }
}

internal fun PlayerActivity.showV146SubtitleAnimationRotate146Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146subtitleAnimationRotate146).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate146",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146subtitleAnimationRotate146 = value
        AppToast.show(this, "Subtitle Animation Rotate146: $value")
    }
}

internal fun PlayerActivity.showV146GestureTapZoneVisualAnimColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146gestureTapZoneVisualAnimColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146gestureTapZoneVisualAnimColor = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Color: $value")
    }
}

internal fun PlayerActivity.showV146CastVideoPIPSnapAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146castVideoPIPSnapAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146castVideoPIPSnapAnimation = value
        AppToast.show(this, "Cast Video PIP Snap Animation: $value")
    }
}

internal fun PlayerActivity.showV146PlaylistAutoGroupByFpsToggle() {
    val current = BiliClient.prefs.v146playlistAutoGroupByFps
    BiliClient.prefs.v146playlistAutoGroupByFps = !current
    AppToast.show(this, "Playlist Auto Group By Fps: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV146CacheSmartPinningOnScheduleMinuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146cacheSmartPinningOnScheduleMinute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Minute",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146cacheSmartPinningOnScheduleMinute = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Minute: $value")
    }
}

internal fun PlayerActivity.showV146ProgressBarCustomThumbBorder146Toggle() {
    val current = BiliClient.prefs.v146progressBarCustomThumbBorder146
    BiliClient.prefs.v146progressBarCustomThumbBorder146 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border146: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV146VolumeNormalizeLookAheadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146volumeNormalizeLookAhead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Look Ahead",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146volumeNormalizeLookAhead = value
        AppToast.show(this, "Volume Normalize Look Ahead: $value")
    }
}

internal fun PlayerActivity.showV146HistoryAutoClean146Toggle() {
    val current = BiliClient.prefs.v146historyAutoClean146
    BiliClient.prefs.v146historyAutoClean146 = !current
    AppToast.show(this, "History Auto Clean146: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV146PlaybackSpeedPresetsAccelAdjustToggle() {
    val current = BiliClient.prefs.v146playbackSpeedPresetsAccelAdjust
    BiliClient.prefs.v146playbackSpeedPresetsAccelAdjust = !current
    AppToast.show(this, "Playback Speed Presets Accel Adjust: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV146ScreenshotAutoShareTwitterToggle() {
    val current = BiliClient.prefs.v146screenshotAutoShareTwitter
    BiliClient.prefs.v146screenshotAutoShareTwitter = !current
    AppToast.show(this, "Screenshot Auto Share Twitter: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV146VideoPIPFollowDolbyToggle() {
    val current = BiliClient.prefs.v146videoPIPFollowDolby
    BiliClient.prefs.v146videoPIPFollowDolby = !current
    AppToast.show(this, "Video PIP Follow Dolby: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV146DanmakuFontBgFillMaskType146Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v146danmakuFontBgFillMaskType146).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Type146",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146danmakuFontBgFillMaskType146 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Type146: $value")
    }
}

internal fun PlayerActivity.showV146SubtitleAnimationBlur146Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v146subtitleAnimationBlur146).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur146",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v146subtitleAnimationBlur146 = value
        AppToast.show(this, "Subtitle Animation Blur146: $value")
    }
}

internal fun PlayerActivity.showV147AudioCompressorAttackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v147audioCompressorAttack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147audioCompressorAttack = value
        AppToast.show(this, "Audio Compressor Attack: $value")
    }
}

internal fun PlayerActivity.showV147DanmakuFontBgFillMaskType147Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v147danmakuFontBgFillMaskType147).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Type147",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147danmakuFontBgFillMaskType147 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Type147: $value")
    }
}

internal fun PlayerActivity.showV147SubtitleAnimationBlur147Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v147subtitleAnimationBlur147).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur147",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147subtitleAnimationBlur147 = value
        AppToast.show(this, "Subtitle Animation Blur147: $value")
    }
}

internal fun PlayerActivity.showV147GestureTapZoneVisualAnimBlurDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v147gestureTapZoneVisualAnimBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147gestureTapZoneVisualAnimBlur = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Blur: $value")
    }
}

internal fun PlayerActivity.showV147CastVideoPIPSnapBounceToggle() {
    val current = BiliClient.prefs.v147castVideoPIPSnapBounce
    BiliClient.prefs.v147castVideoPIPSnapBounce = !current
    AppToast.show(this, "Cast Video PIP Snap Bounce: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147PlaylistAutoGroupByAspectRatioToggle() {
    val current = BiliClient.prefs.v147playlistAutoGroupByAspectRatio
    BiliClient.prefs.v147playlistAutoGroupByAspectRatio = !current
    AppToast.show(this, "Playlist Auto Group By Aspect Ratio: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147CacheSmartPinningOnScheduleRepeatToggle() {
    val current = BiliClient.prefs.v147cacheSmartPinningOnScheduleRepeat
    BiliClient.prefs.v147cacheSmartPinningOnScheduleRepeat = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Repeat: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147ProgressBarCustomThumbShadow147Toggle() {
    val current = BiliClient.prefs.v147progressBarCustomThumbShadow147
    BiliClient.prefs.v147progressBarCustomThumbShadow147 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow147: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147VolumeNormalizeReleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v147volumeNormalizeRelease).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Release",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147volumeNormalizeRelease = value
        AppToast.show(this, "Volume Normalize Release: $value")
    }
}

internal fun PlayerActivity.showV147HistoryAutoClean147Toggle() {
    val current = BiliClient.prefs.v147historyAutoClean147
    BiliClient.prefs.v147historyAutoClean147 = !current
    AppToast.show(this, "History Auto Clean147: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147PlaybackSpeedPresetsVoiceControlToggle() {
    val current = BiliClient.prefs.v147playbackSpeedPresetsVoiceControl
    BiliClient.prefs.v147playbackSpeedPresetsVoiceControl = !current
    AppToast.show(this, "Playback Speed Presets Voice Control: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147ScreenshotAutoShareLinkedInToggle() {
    val current = BiliClient.prefs.v147screenshotAutoShareLinkedIn
    BiliClient.prefs.v147screenshotAutoShareLinkedIn = !current
    AppToast.show(this, "Screenshot Auto Share LinkedIn: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147VideoPIPFollowDolbyVisionToggle() {
    val current = BiliClient.prefs.v147videoPIPFollowDolbyVision
    BiliClient.prefs.v147videoPIPFollowDolbyVision = !current
    AppToast.show(this, "Video PIP Follow Dolby Vision: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV147DanmakuFontBgFillMaskOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v147danmakuFontBgFillMaskOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147danmakuFontBgFillMaskOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Opacity: $value")
    }
}

internal fun PlayerActivity.showV147SubtitleAnimationFadeIn147Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v147subtitleAnimationFadeIn147).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In147",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v147subtitleAnimationFadeIn147 = value
        AppToast.show(this, "Subtitle Animation Fade In147: $value")
    }
}

internal fun PlayerActivity.showV148AudioCompressorReleaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v148audioCompressorRelease).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148audioCompressorRelease = value
        AppToast.show(this, "Audio Compressor Release: $value")
    }
}

internal fun PlayerActivity.showV148DanmakuFontBgFillMaskOpacity147Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v148danmakuFontBgFillMaskOpacity147).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Opacity147",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148danmakuFontBgFillMaskOpacity147 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Opacity147: $value")
    }
}

internal fun PlayerActivity.showV148SubtitleAnimationFadeIn148Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v148subtitleAnimationFadeIn148).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In148",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148subtitleAnimationFadeIn148 = value
        AppToast.show(this, "Subtitle Animation Fade In148: $value")
    }
}

internal fun PlayerActivity.showV148GestureTapZoneVisualAnimDelayDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v148gestureTapZoneVisualAnimDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148gestureTapZoneVisualAnimDelay = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Delay: $value")
    }
}

internal fun PlayerActivity.showV148CastVideoPIPSnapElasticToggle() {
    val current = BiliClient.prefs.v148castVideoPIPSnapElastic
    BiliClient.prefs.v148castVideoPIPSnapElastic = !current
    AppToast.show(this, "Cast Video PIP Snap Elastic: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148PlaylistAutoGroupBySizeToggle() {
    val current = BiliClient.prefs.v148playlistAutoGroupBySize
    BiliClient.prefs.v148playlistAutoGroupBySize = !current
    AppToast.show(this, "Playlist Auto Group By Size: ${if (!current) "ON" else "OFF"}")
}

