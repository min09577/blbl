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

internal fun PlayerActivity.showV148CacheSmartPinningOnScheduleNotifyToggle() {
    val current = BiliClient.prefs.v148cacheSmartPinningOnScheduleNotify
    BiliClient.prefs.v148cacheSmartPinningOnScheduleNotify = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Notify: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148ProgressBarCustomThumbGlow148Toggle() {
    val current = BiliClient.prefs.v148progressBarCustomThumbGlow148
    BiliClient.prefs.v148progressBarCustomThumbGlow148 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow148: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148VolumeNormalizeKneeWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v148volumeNormalizeKneeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Knee Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148volumeNormalizeKneeWidth = value
        AppToast.show(this, "Volume Normalize Knee Width: $value")
    }
}

internal fun PlayerActivity.showV148HistoryAutoClean148Toggle() {
    val current = BiliClient.prefs.v148historyAutoClean148
    BiliClient.prefs.v148historyAutoClean148 = !current
    AppToast.show(this, "History Auto Clean148: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148PlaybackSpeedPresetsFaceDetectToggle() {
    val current = BiliClient.prefs.v148playbackSpeedPresetsFaceDetect
    BiliClient.prefs.v148playbackSpeedPresetsFaceDetect = !current
    AppToast.show(this, "Playback Speed Presets Face Detect: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148ScreenshotAutoSharePinterest148Toggle() {
    val current = BiliClient.prefs.v148screenshotAutoSharePinterest148
    BiliClient.prefs.v148screenshotAutoSharePinterest148 = !current
    AppToast.show(this, "Screenshot Auto Share Pinterest148: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148VideoPIPFollowAtmosToggle() {
    val current = BiliClient.prefs.v148videoPIPFollowAtmos
    BiliClient.prefs.v148videoPIPFollowAtmos = !current
    AppToast.show(this, "Video PIP Follow Atmos: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV148DanmakuFontBgFillMaskOpacity148Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v148danmakuFontBgFillMaskOpacity148).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Opacity148",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148danmakuFontBgFillMaskOpacity148 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Opacity148: $value")
    }
}

internal fun PlayerActivity.showV148SubtitleAnimationFadeOut148Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v148subtitleAnimationFadeOut148).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out148",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v148subtitleAnimationFadeOut148 = value
        AppToast.show(this, "Subtitle Animation Fade Out148: $value")
    }
}

internal fun PlayerActivity.showV149AudioCompressorKneeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v149audioCompressorKnee).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Knee",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v149audioCompressorKnee = value
        AppToast.show(this, "Audio Compressor Knee: $value")
    }
}

internal fun PlayerActivity.showV149DanmakuFontBgFillMaskBlendModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v149danmakuFontBgFillMaskBlendMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Blend Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v149danmakuFontBgFillMaskBlendMode = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Blend Mode: $value")
    }
}

internal fun PlayerActivity.showV149SubtitleAnimationFadeOut149Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v149subtitleAnimationFadeOut149).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out149",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v149subtitleAnimationFadeOut149 = value
        AppToast.show(this, "Subtitle Animation Fade Out149: $value")
    }
}

internal fun PlayerActivity.showV149GestureTapZoneVisualAnimRepeatToggle() {
    val current = BiliClient.prefs.v149gestureTapZoneVisualAnimRepeat
    BiliClient.prefs.v149gestureTapZoneVisualAnimRepeat = !current
    AppToast.show(this, "Gesture Tap Zone Visual Anim Repeat: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149CastVideoPIPSnapFrictionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v149castVideoPIPSnapFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v149castVideoPIPSnapFriction = value
        AppToast.show(this, "Cast Video PIP Snap Friction: $value")
    }
}

internal fun PlayerActivity.showV149PlaylistAutoGroupByLength149Toggle() {
    val current = BiliClient.prefs.v149playlistAutoGroupByLength149
    BiliClient.prefs.v149playlistAutoGroupByLength149 = !current
    AppToast.show(this, "Playlist Auto Group By Length149: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149CacheSmartPinningOnScheduleLogToggle() {
    val current = BiliClient.prefs.v149cacheSmartPinningOnScheduleLog
    BiliClient.prefs.v149cacheSmartPinningOnScheduleLog = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Log: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149ProgressBarCustomThumbBorder149Toggle() {
    val current = BiliClient.prefs.v149progressBarCustomThumbBorder149
    BiliClient.prefs.v149progressBarCustomThumbBorder149 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border149: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149VolumeNormalizeLinkChannelsToggle() {
    val current = BiliClient.prefs.v149volumeNormalizeLinkChannels
    BiliClient.prefs.v149volumeNormalizeLinkChannels = !current
    AppToast.show(this, "Volume Normalize Link Channels: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149HistoryAutoClean149Toggle() {
    val current = BiliClient.prefs.v149historyAutoClean149
    BiliClient.prefs.v149historyAutoClean149 = !current
    AppToast.show(this, "History Auto Clean149: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149PlaybackSpeedPresetsEyeTrackToggle() {
    val current = BiliClient.prefs.v149playbackSpeedPresetsEyeTrack
    BiliClient.prefs.v149playbackSpeedPresetsEyeTrack = !current
    AppToast.show(this, "Playback Speed Presets Eye Track: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149ScreenshotAutoShareVK149Toggle() {
    val current = BiliClient.prefs.v149screenshotAutoShareVK149
    BiliClient.prefs.v149screenshotAutoShareVK149 = !current
    AppToast.show(this, "Screenshot Auto Share VK149: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149VideoPIPFollowSpatialToggle() {
    val current = BiliClient.prefs.v149videoPIPFollowSpatial
    BiliClient.prefs.v149videoPIPFollowSpatial = !current
    AppToast.show(this, "Video PIP Follow Spatial: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV149DanmakuFontBgFillMaskBlendMode149Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v149danmakuFontBgFillMaskBlendMode149).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Blend Mode149",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v149danmakuFontBgFillMaskBlendMode149 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Blend Mode149: $value")
    }
}

internal fun PlayerActivity.showV149SubtitleAnimationTranslate149Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v149subtitleAnimationTranslate149).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate149",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v149subtitleAnimationTranslate149 = value
        AppToast.show(this, "Subtitle Animation Translate149: $value")
    }
}

internal fun PlayerActivity.showV150AudioLimiterToggle150Toggle() {
    val current = BiliClient.prefs.v150audioLimiterToggle150
    BiliClient.prefs.v150audioLimiterToggle150 = !current
    AppToast.show(this, "Audio Limiter Toggle150: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150DanmakuFontBgFillMaskBlendMode150Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v150danmakuFontBgFillMaskBlendMode150).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mask Blend Mode150",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v150danmakuFontBgFillMaskBlendMode150 = value
        AppToast.show(this, "Danmaku Font BG Fill Mask Blend Mode150: $value")
    }
}

internal fun PlayerActivity.showV150SubtitleAnimationTranslate150Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v150subtitleAnimationTranslate150).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate150",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v150subtitleAnimationTranslate150 = value
        AppToast.show(this, "Subtitle Animation Translate150: $value")
    }
}

internal fun PlayerActivity.showV150GestureTapZoneVisualAnimLoopToggle() {
    val current = BiliClient.prefs.v150gestureTapZoneVisualAnimLoop
    BiliClient.prefs.v150gestureTapZoneVisualAnimLoop = !current
    AppToast.show(this, "Gesture Tap Zone Visual Anim Loop: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150CastVideoPIPSnapTensionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v150castVideoPIPSnapTension).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Tension",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v150castVideoPIPSnapTension = value
        AppToast.show(this, "Cast Video PIP Snap Tension: $value")
    }
}

internal fun PlayerActivity.showV150PlaylistAutoGroupByDate150Toggle() {
    val current = BiliClient.prefs.v150playlistAutoGroupByDate150
    BiliClient.prefs.v150playlistAutoGroupByDate150 = !current
    AppToast.show(this, "Playlist Auto Group By Date150: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150CacheSmartPinningOnScheduleRetryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v150cacheSmartPinningOnScheduleRetry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Retry",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v150cacheSmartPinningOnScheduleRetry = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Retry: $value")
    }
}

internal fun PlayerActivity.showV150ProgressBarCustomThumbColor150Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v150progressBarCustomThumbColor150).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color150",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v150progressBarCustomThumbColor150 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color150: $value")
    }
}

internal fun PlayerActivity.showV150VolumeNormalizeBypassToggle() {
    val current = BiliClient.prefs.v150volumeNormalizeBypass
    BiliClient.prefs.v150volumeNormalizeBypass = !current
    AppToast.show(this, "Volume Normalize Bypass: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150HistoryAutoClean150Toggle() {
    val current = BiliClient.prefs.v150historyAutoClean150
    BiliClient.prefs.v150historyAutoClean150 = !current
    AppToast.show(this, "History Auto Clean150: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150PlaybackSpeedPresetsBiometricToggle() {
    val current = BiliClient.prefs.v150playbackSpeedPresetsBiometric
    BiliClient.prefs.v150playbackSpeedPresetsBiometric = !current
    AppToast.show(this, "Playback Speed Presets Biometric: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150ScreenshotAutoShareEmailToggle() {
    val current = BiliClient.prefs.v150screenshotAutoShareEmail
    BiliClient.prefs.v150screenshotAutoShareEmail = !current
    AppToast.show(this, "Screenshot Auto Share Email: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150VideoPIPFollowImmersiveToggle() {
    val current = BiliClient.prefs.v150videoPIPFollowImmersive
    BiliClient.prefs.v150videoPIPFollowImmersive = !current
    AppToast.show(this, "Video PIP Follow Immersive: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150DanmakuFontBgFillMaskInvertToggle() {
    val current = BiliClient.prefs.v150danmakuFontBgFillMaskInvert
    BiliClient.prefs.v150danmakuFontBgFillMaskInvert = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Invert: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV150SubtitleAnimationScale150Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v150subtitleAnimationScale150).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale150",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v150subtitleAnimationScale150 = value
        AppToast.show(this, "Subtitle Animation Scale150: $value")
    }
}

internal fun PlayerActivity.showV151AudioLimiterThresholdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v151audioLimiterThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Limiter Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151audioLimiterThreshold = value
        AppToast.show(this, "Audio Limiter Threshold: $value")
    }
}

internal fun PlayerActivity.showV151DanmakuFontBgFillMaskInvert151Toggle() {
    val current = BiliClient.prefs.v151danmakuFontBgFillMaskInvert151
    BiliClient.prefs.v151danmakuFontBgFillMaskInvert151 = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Invert151: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151SubtitleAnimationScale151Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v151subtitleAnimationScale151).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale151",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151subtitleAnimationScale151 = value
        AppToast.show(this, "Subtitle Animation Scale151: $value")
    }
}

internal fun PlayerActivity.showV151GestureTapZoneVisualAnimSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v151gestureTapZoneVisualAnimSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151gestureTapZoneVisualAnimSpeed = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Speed: $value")
    }
}

internal fun PlayerActivity.showV151CastVideoPIPSnapDampingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v151castVideoPIPSnapDamping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Damping",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151castVideoPIPSnapDamping = value
        AppToast.show(this, "Cast Video PIP Snap Damping: $value")
    }
}

internal fun PlayerActivity.showV151PlaylistAutoGroupByUploaderToggle() {
    val current = BiliClient.prefs.v151playlistAutoGroupByUploader
    BiliClient.prefs.v151playlistAutoGroupByUploader = !current
    AppToast.show(this, "Playlist Auto Group By Uploader: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151CacheSmartPinningOnScheduleStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v151cacheSmartPinningOnScheduleStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151cacheSmartPinningOnScheduleStart = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Start: $value")
    }
}

internal fun PlayerActivity.showV151ProgressBarCustomThumbColor151Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v151progressBarCustomThumbColor151).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color151",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151progressBarCustomThumbColor151 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color151: $value")
    }
}

internal fun PlayerActivity.showV151VolumeLimiterToggle151Toggle() {
    val current = BiliClient.prefs.v151volumeLimiterToggle151
    BiliClient.prefs.v151volumeLimiterToggle151 = !current
    AppToast.show(this, "Volume Limiter Toggle151: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151HistoryAutoClean151Toggle() {
    val current = BiliClient.prefs.v151historyAutoClean151
    BiliClient.prefs.v151historyAutoClean151 = !current
    AppToast.show(this, "History Auto Clean151: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151PlaybackSpeedPresetsHeadTrackToggle() {
    val current = BiliClient.prefs.v151playbackSpeedPresetsHeadTrack
    BiliClient.prefs.v151playbackSpeedPresetsHeadTrack = !current
    AppToast.show(this, "Playback Speed Presets Head Track: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151ScreenshotAutoShareTeams151Toggle() {
    val current = BiliClient.prefs.v151screenshotAutoShareTeams151
    BiliClient.prefs.v151screenshotAutoShareTeams151 = !current
    AppToast.show(this, "Screenshot Auto Share Teams151: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151VideoPIPFollowDolbyAtmosToggle() {
    val current = BiliClient.prefs.v151videoPIPFollowDolbyAtmos
    BiliClient.prefs.v151videoPIPFollowDolbyAtmos = !current
    AppToast.show(this, "Video PIP Follow Dolby Atmos: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151DanmakuFontBgFillGradientToggleToggle() {
    val current = BiliClient.prefs.v151danmakuFontBgFillGradientToggle
    BiliClient.prefs.v151danmakuFontBgFillGradientToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Gradient Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV151SubtitleAnimationBlur151Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v151subtitleAnimationBlur151).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur151",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v151subtitleAnimationBlur151 = value
        AppToast.show(this, "Subtitle Animation Blur151: $value")
    }
}

internal fun PlayerActivity.showV152AudioLimiterRelease151Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152audioLimiterRelease151).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Limiter Release151",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152audioLimiterRelease151 = value
        AppToast.show(this, "Audio Limiter Release151: $value")
    }
}

internal fun PlayerActivity.showV152DanmakuFontBgFillGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152danmakuFontBgFillGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152danmakuFontBgFillGradientStart = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Start: $value")
    }
}

internal fun PlayerActivity.showV152SubtitleAnimationBlur152Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v152subtitleAnimationBlur152).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur152",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152subtitleAnimationBlur152 = value
        AppToast.show(this, "Subtitle Animation Blur152: $value")
    }
}

internal fun PlayerActivity.showV152GestureTapZoneVisualAnimCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152gestureTapZoneVisualAnimCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152gestureTapZoneVisualAnimCurve = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Curve: $value")
    }
}

internal fun PlayerActivity.showV152CastVideoPIPSnapStiffnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152castVideoPIPSnapStiffness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Stiffness",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152castVideoPIPSnapStiffness = value
        AppToast.show(this, "Cast Video PIP Snap Stiffness: $value")
    }
}

internal fun PlayerActivity.showV152PlaylistAutoGroupByUploader152Toggle() {
    val current = BiliClient.prefs.v152playlistAutoGroupByUploader152
    BiliClient.prefs.v152playlistAutoGroupByUploader152 = !current
    AppToast.show(this, "Playlist Auto Group By Uploader152: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV152CacheSmartPinningOnScheduleEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152cacheSmartPinningOnScheduleEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152cacheSmartPinningOnScheduleEnd = value
        AppToast.show(this, "Cache Smart Pinning On Schedule End: $value")
    }
}

internal fun PlayerActivity.showV152ProgressBarCustomThumbGlow152Toggle() {
    val current = BiliClient.prefs.v152progressBarCustomThumbGlow152
    BiliClient.prefs.v152progressBarCustomThumbGlow152 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow152: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV152VolumeLimiterThreshold152Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152volumeLimiterThreshold152).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limiter Threshold152",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152volumeLimiterThreshold152 = value
        AppToast.show(this, "Volume Limiter Threshold152: $value")
    }
}

internal fun PlayerActivity.showV152HistoryAutoClean152Toggle() {
    val current = BiliClient.prefs.v152historyAutoClean152
    BiliClient.prefs.v152historyAutoClean152 = !current
    AppToast.show(this, "History Auto Clean152: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV152PlaybackSpeedPresetsHeadTrack152Toggle() {
    val current = BiliClient.prefs.v152playbackSpeedPresetsHeadTrack152
    BiliClient.prefs.v152playbackSpeedPresetsHeadTrack152 = !current
    AppToast.show(this, "Playback Speed Presets Head Track152: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV152ScreenshotAutoShareEmail152Toggle() {
    val current = BiliClient.prefs.v152screenshotAutoShareEmail152
    BiliClient.prefs.v152screenshotAutoShareEmail152 = !current
    AppToast.show(this, "Screenshot Auto Share Email152: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV152VideoPIPFollowDolbyAtmos152Toggle() {
    val current = BiliClient.prefs.v152videoPIPFollowDolbyAtmos152
    BiliClient.prefs.v152videoPIPFollowDolbyAtmos152 = !current
    AppToast.show(this, "Video PIP Follow Dolby Atmos152: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV152DanmakuFontBgFillGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v152danmakuFontBgFillGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152danmakuFontBgFillGradientEnd = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient End: $value")
    }
}

internal fun PlayerActivity.showV152SubtitleAnimationFadeIn152Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v152subtitleAnimationFadeIn152).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In152",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v152subtitleAnimationFadeIn152 = value
        AppToast.show(this, "Subtitle Animation Fade In152: $value")
    }
}

internal fun PlayerActivity.showV153AudioLimiterGain152Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153audioLimiterGain152).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Limiter Gain152",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153audioLimiterGain152 = value
        AppToast.show(this, "Audio Limiter Gain152: $value")
    }
}

internal fun PlayerActivity.showV153DanmakuFontBgFillGradientAngleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153danmakuFontBgFillGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153danmakuFontBgFillGradientAngle = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Angle: $value")
    }
}

internal fun PlayerActivity.showV153SubtitleAnimationFadeIn153Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v153subtitleAnimationFadeIn153).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In153",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153subtitleAnimationFadeIn153 = value
        AppToast.show(this, "Subtitle Animation Fade In153: $value")
    }
}

internal fun PlayerActivity.showV153GestureTapZoneVisualAnimDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153gestureTapZoneVisualAnimDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153gestureTapZoneVisualAnimDirection = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Direction: $value")
    }
}

internal fun PlayerActivity.showV153CastVideoPIPSnapMassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153castVideoPIPSnapMass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Mass",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153castVideoPIPSnapMass = value
        AppToast.show(this, "Cast Video PIP Snap Mass: $value")
    }
}

internal fun PlayerActivity.showV153PlaylistAutoGroupByCategoryToggle() {
    val current = BiliClient.prefs.v153playlistAutoGroupByCategory
    BiliClient.prefs.v153playlistAutoGroupByCategory = !current
    AppToast.show(this, "Playlist Auto Group By Category: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV153CacheSmartPinningOnScheduleWeekdayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153cacheSmartPinningOnScheduleWeekday).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Weekday",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153cacheSmartPinningOnScheduleWeekday = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Weekday: $value")
    }
}

internal fun PlayerActivity.showV153ProgressBarCustomThumbBorder153Toggle() {
    val current = BiliClient.prefs.v153progressBarCustomThumbBorder153
    BiliClient.prefs.v153progressBarCustomThumbBorder153 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border153: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV153VolumeLimiterRelease153Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153volumeLimiterRelease153).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limiter Release153",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153volumeLimiterRelease153 = value
        AppToast.show(this, "Volume Limiter Release153: $value")
    }
}

internal fun PlayerActivity.showV153HistoryAutoClean153Toggle() {
    val current = BiliClient.prefs.v153historyAutoClean153
    BiliClient.prefs.v153historyAutoClean153 = !current
    AppToast.show(this, "History Auto Clean153: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV153PlaybackSpeedPresetsHandGestureToggle() {
    val current = BiliClient.prefs.v153playbackSpeedPresetsHandGesture
    BiliClient.prefs.v153playbackSpeedPresetsHandGesture = !current
    AppToast.show(this, "Playback Speed Presets Hand Gesture: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV153ScreenshotAutoShareWeChat153Toggle() {
    val current = BiliClient.prefs.v153screenshotAutoShareWeChat153
    BiliClient.prefs.v153screenshotAutoShareWeChat153 = !current
    AppToast.show(this, "Screenshot Auto Share WeChat153: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV153VideoPIPFollowDolbyAtmos153Toggle() {
    val current = BiliClient.prefs.v153videoPIPFollowDolbyAtmos153
    BiliClient.prefs.v153videoPIPFollowDolbyAtmos153 = !current
    AppToast.show(this, "Video PIP Follow Dolby Atmos153: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV153DanmakuFontBgFillGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v153danmakuFontBgFillGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153danmakuFontBgFillGradientType = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Type: $value")
    }
}

internal fun PlayerActivity.showV153SubtitleAnimationFadeOut153Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v153subtitleAnimationFadeOut153).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out153",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v153subtitleAnimationFadeOut153 = value
        AppToast.show(this, "Subtitle Animation Fade Out153: $value")
    }
}

internal fun PlayerActivity.showV154AudioDynamicEQToggle154Toggle() {
    val current = BiliClient.prefs.v154audioDynamicEQToggle154
    BiliClient.prefs.v154audioDynamicEQToggle154 = !current
    AppToast.show(this, "Audio Dynamic EQ Toggle154: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154DanmakuFontBgFillGradientType153Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v154danmakuFontBgFillGradientType153).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Type153",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154danmakuFontBgFillGradientType153 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Type153: $value")
    }
}

internal fun PlayerActivity.showV154SubtitleAnimationFadeOut154Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v154subtitleAnimationFadeOut154).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out154",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154subtitleAnimationFadeOut154 = value
        AppToast.show(this, "Subtitle Animation Fade Out154: $value")
    }
}

internal fun PlayerActivity.showV154GestureTapZoneVisualAnimOpacity154Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v154gestureTapZoneVisualAnimOpacity154).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Opacity154",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154gestureTapZoneVisualAnimOpacity154 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Opacity154: $value")
    }
}

internal fun PlayerActivity.showV154CastVideoPIPSnapVelocityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v154castVideoPIPSnapVelocity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Velocity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154castVideoPIPSnapVelocity = value
        AppToast.show(this, "Cast Video PIP Snap Velocity: $value")
    }
}

internal fun PlayerActivity.showV154PlaylistAutoGroupByCategory154Toggle() {
    val current = BiliClient.prefs.v154playlistAutoGroupByCategory154
    BiliClient.prefs.v154playlistAutoGroupByCategory154 = !current
    AppToast.show(this, "Playlist Auto Group By Category154: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154CacheSmartPinningOnScheduleMonthdayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v154cacheSmartPinningOnScheduleMonthday).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Monthday",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154cacheSmartPinningOnScheduleMonthday = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Monthday: $value")
    }
}

internal fun PlayerActivity.showV154ProgressBarCustomThumbShadow154Toggle() {
    val current = BiliClient.prefs.v154progressBarCustomThumbShadow154
    BiliClient.prefs.v154progressBarCustomThumbShadow154 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow154: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154VolumeLimiterGain154Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v154volumeLimiterGain154).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limiter Gain154",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154volumeLimiterGain154 = value
        AppToast.show(this, "Volume Limiter Gain154: $value")
    }
}

internal fun PlayerActivity.showV154HistoryAutoClean154Toggle() {
    val current = BiliClient.prefs.v154historyAutoClean154
    BiliClient.prefs.v154historyAutoClean154 = !current
    AppToast.show(this, "History Auto Clean154: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154PlaybackSpeedPresetsHandGesture154Toggle() {
    val current = BiliClient.prefs.v154playbackSpeedPresetsHandGesture154
    BiliClient.prefs.v154playbackSpeedPresetsHandGesture154 = !current
    AppToast.show(this, "Playback Speed Presets Hand Gesture154: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154ScreenshotAutoShareQQ154Toggle() {
    val current = BiliClient.prefs.v154screenshotAutoShareQQ154
    BiliClient.prefs.v154screenshotAutoShareQQ154 = !current
    AppToast.show(this, "Screenshot Auto Share QQ154: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154VideoPIPFollowSpatialAudioToggle() {
    val current = BiliClient.prefs.v154videoPIPFollowSpatialAudio
    BiliClient.prefs.v154videoPIPFollowSpatialAudio = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV154DanmakuFontBgFillGradientType154Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v154danmakuFontBgFillGradientType154).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Type154",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154danmakuFontBgFillGradientType154 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Type154: $value")
    }
}

internal fun PlayerActivity.showV154SubtitleAnimationTranslate154Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v154subtitleAnimationTranslate154).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate154",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v154subtitleAnimationTranslate154 = value
        AppToast.show(this, "Subtitle Animation Translate154: $value")
    }
}

internal fun PlayerActivity.showV155AudioDynamicEQBandDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v155audioDynamicEQBand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic EQ Band",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155audioDynamicEQBand = value
        AppToast.show(this, "Audio Dynamic EQ Band: $value")
    }
}

internal fun PlayerActivity.showV155DanmakuFontBgFillGradientType155Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v155danmakuFontBgFillGradientType155).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Type155",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155danmakuFontBgFillGradientType155 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Type155: $value")
    }
}

internal fun PlayerActivity.showV155SubtitleAnimationTranslate155Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v155subtitleAnimationTranslate155).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate155",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155subtitleAnimationTranslate155 = value
        AppToast.show(this, "Subtitle Animation Translate155: $value")
    }
}

internal fun PlayerActivity.showV155GestureTapZoneVisualAnimBlur155Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v155gestureTapZoneVisualAnimBlur155).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Blur155",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155gestureTapZoneVisualAnimBlur155 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Blur155: $value")
    }
}

internal fun PlayerActivity.showV155CastVideoPIPSnapGravityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v155castVideoPIPSnapGravity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Gravity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155castVideoPIPSnapGravity = value
        AppToast.show(this, "Cast Video PIP Snap Gravity: $value")
    }
}

internal fun PlayerActivity.showV155PlaylistAutoGroupByUploader155Toggle() {
    val current = BiliClient.prefs.v155playlistAutoGroupByUploader155
    BiliClient.prefs.v155playlistAutoGroupByUploader155 = !current
    AppToast.show(this, "Playlist Auto Group By Uploader155: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155CacheSmartPinningOnScheduleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v155cacheSmartPinningOnScheduleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155cacheSmartPinningOnScheduleAction = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Action: $value")
    }
}

internal fun PlayerActivity.showV155ProgressBarCustomThumbGlow155Toggle() {
    val current = BiliClient.prefs.v155progressBarCustomThumbGlow155
    BiliClient.prefs.v155progressBarCustomThumbGlow155 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow155: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155VolumeLimiterStereoToggle() {
    val current = BiliClient.prefs.v155volumeLimiterStereo
    BiliClient.prefs.v155volumeLimiterStereo = !current
    AppToast.show(this, "Volume Limiter Stereo: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155HistoryAutoClean155Toggle() {
    val current = BiliClient.prefs.v155historyAutoClean155
    BiliClient.prefs.v155historyAutoClean155 = !current
    AppToast.show(this, "History Auto Clean155: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155PlaybackSpeedPresetsFaceTrackToggle() {
    val current = BiliClient.prefs.v155playbackSpeedPresetsFaceTrack
    BiliClient.prefs.v155playbackSpeedPresetsFaceTrack = !current
    AppToast.show(this, "Playback Speed Presets Face Track: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155ScreenshotAutoShareDouyin155Toggle() {
    val current = BiliClient.prefs.v155screenshotAutoShareDouyin155
    BiliClient.prefs.v155screenshotAutoShareDouyin155 = !current
    AppToast.show(this, "Screenshot Auto Share Douyin155: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155VideoPIPFollowSpatialAudio155Toggle() {
    val current = BiliClient.prefs.v155videoPIPFollowSpatialAudio155
    BiliClient.prefs.v155videoPIPFollowSpatialAudio155 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio155: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV155DanmakuFontBgFillGradientStopsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v155danmakuFontBgFillGradientStops).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155danmakuFontBgFillGradientStops = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops: $value")
    }
}

internal fun PlayerActivity.showV155SubtitleAnimationScale155Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v155subtitleAnimationScale155).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale155",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v155subtitleAnimationScale155 = value
        AppToast.show(this, "Subtitle Animation Scale155: $value")
    }
}

internal fun PlayerActivity.showV156AudioDynamicEQFreqDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156audioDynamicEQFreq).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic EQ Freq",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156audioDynamicEQFreq = value
        AppToast.show(this, "Audio Dynamic EQ Freq: $value")
    }
}

internal fun PlayerActivity.showV156DanmakuFontBgFillGradientStops155Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156danmakuFontBgFillGradientStops155).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops155",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156danmakuFontBgFillGradientStops155 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops155: $value")
    }
}

internal fun PlayerActivity.showV156SubtitleAnimationScale156Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v156subtitleAnimationScale156).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale156",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156subtitleAnimationScale156 = value
        AppToast.show(this, "Subtitle Animation Scale156: $value")
    }
}

internal fun PlayerActivity.showV156GestureTapZoneVisualAnimColor156Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156gestureTapZoneVisualAnimColor156).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Color156",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156gestureTapZoneVisualAnimColor156 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Color156: $value")
    }
}

internal fun PlayerActivity.showV156CastVideoPIPSnapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156castVideoPIPSnapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156castVideoPIPSnapMode = value
        AppToast.show(this, "Cast Video PIP Snap Mode: $value")
    }
}

internal fun PlayerActivity.showV156PlaylistAutoGroupByTagToggle() {
    val current = BiliClient.prefs.v156playlistAutoGroupByTag
    BiliClient.prefs.v156playlistAutoGroupByTag = !current
    AppToast.show(this, "Playlist Auto Group By Tag: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV156CacheSmartPinningOnScheduleConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156cacheSmartPinningOnScheduleCondition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Condition",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156cacheSmartPinningOnScheduleCondition = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Condition: $value")
    }
}

internal fun PlayerActivity.showV156ProgressBarCustomThumbBorder156Toggle() {
    val current = BiliClient.prefs.v156progressBarCustomThumbBorder156
    BiliClient.prefs.v156progressBarCustomThumbBorder156 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border156: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV156VolumeLimiterCeilingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156volumeLimiterCeiling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limiter Ceiling",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156volumeLimiterCeiling = value
        AppToast.show(this, "Volume Limiter Ceiling: $value")
    }
}

internal fun PlayerActivity.showV156HistoryAutoClean156Toggle() {
    val current = BiliClient.prefs.v156historyAutoClean156
    BiliClient.prefs.v156historyAutoClean156 = !current
    AppToast.show(this, "History Auto Clean156: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV156PlaybackSpeedPresetsFaceTrack156Toggle() {
    val current = BiliClient.prefs.v156playbackSpeedPresetsFaceTrack156
    BiliClient.prefs.v156playbackSpeedPresetsFaceTrack156 = !current
    AppToast.show(this, "Playback Speed Presets Face Track156: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV156ScreenshotAutoShareSnapchat156Toggle() {
    val current = BiliClient.prefs.v156screenshotAutoShareSnapchat156
    BiliClient.prefs.v156screenshotAutoShareSnapchat156 = !current
    AppToast.show(this, "Screenshot Auto Share Snapchat156: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV156VideoPIPFollowSpatialAudio156Toggle() {
    val current = BiliClient.prefs.v156videoPIPFollowSpatialAudio156
    BiliClient.prefs.v156videoPIPFollowSpatialAudio156 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio156: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV156DanmakuFontBgFillGradientStops156Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156danmakuFontBgFillGradientStops156).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops156",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156danmakuFontBgFillGradientStops156 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops156: $value")
    }
}

internal fun PlayerActivity.showV156SubtitleAnimationRotate156Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v156subtitleAnimationRotate156).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate156",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v156subtitleAnimationRotate156 = value
        AppToast.show(this, "Subtitle Animation Rotate156: $value")
    }
}

internal fun PlayerActivity.showV157AudioDynamicEQGainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157audioDynamicEQGain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic EQ Gain",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157audioDynamicEQGain = value
        AppToast.show(this, "Audio Dynamic EQ Gain: $value")
    }
}

internal fun PlayerActivity.showV157DanmakuFontBgFillGradientStops157Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157danmakuFontBgFillGradientStops157).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops157",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157danmakuFontBgFillGradientStops157 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops157: $value")
    }
}

internal fun PlayerActivity.showV157SubtitleAnimationRotate157Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157subtitleAnimationRotate157).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate157",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157subtitleAnimationRotate157 = value
        AppToast.show(this, "Subtitle Animation Rotate157: $value")
    }
}

internal fun PlayerActivity.showV157GestureTapZoneVisualAnimScale157Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v157gestureTapZoneVisualAnimScale157).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Scale157",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157gestureTapZoneVisualAnimScale157 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Scale157: $value")
    }
}

internal fun PlayerActivity.showV157CastVideoPIPSnapDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157castVideoPIPSnapDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157castVideoPIPSnapDirection = value
        AppToast.show(this, "Cast Video PIP Snap Direction: $value")
    }
}

internal fun PlayerActivity.showV157PlaylistAutoGroupByTag157Toggle() {
    val current = BiliClient.prefs.v157playlistAutoGroupByTag157
    BiliClient.prefs.v157playlistAutoGroupByTag157 = !current
    AppToast.show(this, "Playlist Auto Group By Tag157: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV157CacheSmartPinningOnSchedulePriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157cacheSmartPinningOnSchedulePriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157cacheSmartPinningOnSchedulePriority = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Priority: $value")
    }
}

internal fun PlayerActivity.showV157ProgressBarCustomThumbColor157Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157progressBarCustomThumbColor157).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color157",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157progressBarCustomThumbColor157 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color157: $value")
    }
}

internal fun PlayerActivity.showV157VolumeLimiterCeiling157Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157volumeLimiterCeiling157).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limiter Ceiling157",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157volumeLimiterCeiling157 = value
        AppToast.show(this, "Volume Limiter Ceiling157: $value")
    }
}

internal fun PlayerActivity.showV157HistoryAutoClean157Toggle() {
    val current = BiliClient.prefs.v157historyAutoClean157
    BiliClient.prefs.v157historyAutoClean157 = !current
    AppToast.show(this, "History Auto Clean157: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV157PlaybackSpeedPresetsMotionDetectToggle() {
    val current = BiliClient.prefs.v157playbackSpeedPresetsMotionDetect
    BiliClient.prefs.v157playbackSpeedPresetsMotionDetect = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV157ScreenshotAutoShareTikTok157Toggle() {
    val current = BiliClient.prefs.v157screenshotAutoShareTikTok157
    BiliClient.prefs.v157screenshotAutoShareTikTok157 = !current
    AppToast.show(this, "Screenshot Auto Share TikTok157: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV157VideoPIPFollowSpatialAudio157Toggle() {
    val current = BiliClient.prefs.v157videoPIPFollowSpatialAudio157
    BiliClient.prefs.v157videoPIPFollowSpatialAudio157 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio157: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV157DanmakuFontBgFillGradientStops158Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v157danmakuFontBgFillGradientStops158).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops158",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157danmakuFontBgFillGradientStops158 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops158: $value")
    }
}

internal fun PlayerActivity.showV157SubtitleAnimationBlur157Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v157subtitleAnimationBlur157).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur157",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v157subtitleAnimationBlur157 = value
        AppToast.show(this, "Subtitle Animation Blur157: $value")
    }
}

internal fun PlayerActivity.showV158AudioDynamicEQWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v158audioDynamicEQWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic EQ Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158audioDynamicEQWidth = value
        AppToast.show(this, "Audio Dynamic EQ Width: $value")
    }
}

internal fun PlayerActivity.showV158DanmakuFontBgFillGradientStops159Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v158danmakuFontBgFillGradientStops159).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops159",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158danmakuFontBgFillGradientStops159 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops159: $value")
    }
}

internal fun PlayerActivity.showV158SubtitleAnimationBlur158Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v158subtitleAnimationBlur158).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur158",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158subtitleAnimationBlur158 = value
        AppToast.show(this, "Subtitle Animation Blur158: $value")
    }
}

internal fun PlayerActivity.showV158GestureTapZoneVisualAnimSpeed158Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v158gestureTapZoneVisualAnimSpeed158).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Speed158",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158gestureTapZoneVisualAnimSpeed158 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Speed158: $value")
    }
}

internal fun PlayerActivity.showV158CastVideoPIPSnapEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v158castVideoPIPSnapEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158castVideoPIPSnapEasing = value
        AppToast.show(this, "Cast Video PIP Snap Easing: $value")
    }
}

internal fun PlayerActivity.showV158PlaylistAutoGroupByTag158Toggle() {
    val current = BiliClient.prefs.v158playlistAutoGroupByTag158
    BiliClient.prefs.v158playlistAutoGroupByTag158 = !current
    AppToast.show(this, "Playlist Auto Group By Tag158: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158CacheSmartPinningOnScheduleStatusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v158cacheSmartPinningOnScheduleStatus).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Schedule Status",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158cacheSmartPinningOnScheduleStatus = value
        AppToast.show(this, "Cache Smart Pinning On Schedule Status: $value")
    }
}

internal fun PlayerActivity.showV158ProgressBarCustomThumbGlow158Toggle() {
    val current = BiliClient.prefs.v158progressBarCustomThumbGlow158
    BiliClient.prefs.v158progressBarCustomThumbGlow158 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow158: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158VolumeLimiterAutoToggle() {
    val current = BiliClient.prefs.v158volumeLimiterAuto
    BiliClient.prefs.v158volumeLimiterAuto = !current
    AppToast.show(this, "Volume Limiter Auto: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158HistoryAutoClean158Toggle() {
    val current = BiliClient.prefs.v158historyAutoClean158
    BiliClient.prefs.v158historyAutoClean158 = !current
    AppToast.show(this, "History Auto Clean158: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158PlaybackSpeedPresetsMotionDetect158Toggle() {
    val current = BiliClient.prefs.v158playbackSpeedPresetsMotionDetect158
    BiliClient.prefs.v158playbackSpeedPresetsMotionDetect158 = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect158: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158ScreenshotAutoShareTwitch158Toggle() {
    val current = BiliClient.prefs.v158screenshotAutoShareTwitch158
    BiliClient.prefs.v158screenshotAutoShareTwitch158 = !current
    AppToast.show(this, "Screenshot Auto Share Twitch158: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158VideoPIPFollowSpatialAudio158Toggle() {
    val current = BiliClient.prefs.v158videoPIPFollowSpatialAudio158
    BiliClient.prefs.v158videoPIPFollowSpatialAudio158 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio158: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV158DanmakuFontBgFillGradientStops160Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v158danmakuFontBgFillGradientStops160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Stops160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158danmakuFontBgFillGradientStops160 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Stops160: $value")
    }
}

internal fun PlayerActivity.showV158SubtitleAnimationFadeIn158Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v158subtitleAnimationFadeIn158).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In158",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v158subtitleAnimationFadeIn158 = value
        AppToast.show(this, "Subtitle Animation Fade In158: $value")
    }
}

internal fun PlayerActivity.showV159AudioDynamicEQShapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v159audioDynamicEQShape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic EQ Shape",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159audioDynamicEQShape = value
        AppToast.show(this, "Audio Dynamic EQ Shape: $value")
    }
}

internal fun PlayerActivity.showV159DanmakuFontBgFillGradientInterpDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v159danmakuFontBgFillGradientInterp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Interp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159danmakuFontBgFillGradientInterp = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Interp: $value")
    }
}

internal fun PlayerActivity.showV159SubtitleAnimationFadeIn159Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v159subtitleAnimationFadeIn159).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In159",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159subtitleAnimationFadeIn159 = value
        AppToast.show(this, "Subtitle Animation Fade In159: $value")
    }
}

internal fun PlayerActivity.showV159GestureTapZoneVisualAnimCurve159Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v159gestureTapZoneVisualAnimCurve159).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Curve159",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159gestureTapZoneVisualAnimCurve159 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Curve159: $value")
    }
}

internal fun PlayerActivity.showV159CastVideoPIPSnapTransformDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v159castVideoPIPSnapTransform).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Transform",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159castVideoPIPSnapTransform = value
        AppToast.show(this, "Cast Video PIP Snap Transform: $value")
    }
}

internal fun PlayerActivity.showV159PlaylistAutoGroupByTag159Toggle() {
    val current = BiliClient.prefs.v159playlistAutoGroupByTag159
    BiliClient.prefs.v159playlistAutoGroupByTag159 = !current
    AppToast.show(this, "Playlist Auto Group By Tag159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159CacheSmartPinningOnScheduleEnabledToggle() {
    val current = BiliClient.prefs.v159cacheSmartPinningOnScheduleEnabled
    BiliClient.prefs.v159cacheSmartPinningOnScheduleEnabled = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Enabled: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159ProgressBarCustomThumbBorder159Toggle() {
    val current = BiliClient.prefs.v159progressBarCustomThumbBorder159
    BiliClient.prefs.v159progressBarCustomThumbBorder159 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159VolumeLimiterAuto159Toggle() {
    val current = BiliClient.prefs.v159volumeLimiterAuto159
    BiliClient.prefs.v159volumeLimiterAuto159 = !current
    AppToast.show(this, "Volume Limiter Auto159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159HistoryAutoClean159Toggle() {
    val current = BiliClient.prefs.v159historyAutoClean159
    BiliClient.prefs.v159historyAutoClean159 = !current
    AppToast.show(this, "History Auto Clean159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159PlaybackSpeedPresetsMotionDetect159Toggle() {
    val current = BiliClient.prefs.v159playbackSpeedPresetsMotionDetect159
    BiliClient.prefs.v159playbackSpeedPresetsMotionDetect159 = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159ScreenshotAutoShareTwitch159Toggle() {
    val current = BiliClient.prefs.v159screenshotAutoShareTwitch159
    BiliClient.prefs.v159screenshotAutoShareTwitch159 = !current
    AppToast.show(this, "Screenshot Auto Share Twitch159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159VideoPIPFollowSpatialAudio159Toggle() {
    val current = BiliClient.prefs.v159videoPIPFollowSpatialAudio159
    BiliClient.prefs.v159videoPIPFollowSpatialAudio159 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio159: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV159DanmakuFontBgFillGradientInterp159Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v159danmakuFontBgFillGradientInterp159).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Interp159",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159danmakuFontBgFillGradientInterp159 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Interp159: $value")
    }
}

internal fun PlayerActivity.showV159SubtitleAnimationFadeOut159Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v159subtitleAnimationFadeOut159).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out159",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v159subtitleAnimationFadeOut159 = value
        AppToast.show(this, "Subtitle Animation Fade Out159: $value")
    }
}

internal fun PlayerActivity.showV160AudioDynamicEQMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v160audioDynamicEQMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic EQ Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160audioDynamicEQMix = value
        AppToast.show(this, "Audio Dynamic EQ Mix: $value")
    }
}

internal fun PlayerActivity.showV160DanmakuFontBgFillGradientInterp160Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v160danmakuFontBgFillGradientInterp160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Interp160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160danmakuFontBgFillGradientInterp160 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Interp160: $value")
    }
}

internal fun PlayerActivity.showV160SubtitleAnimationFadeOut160Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v160subtitleAnimationFadeOut160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160subtitleAnimationFadeOut160 = value
        AppToast.show(this, "Subtitle Animation Fade Out160: $value")
    }
}

internal fun PlayerActivity.showV160GestureTapZoneVisualAnimCurve160Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v160gestureTapZoneVisualAnimCurve160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Visual Anim Curve160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160gestureTapZoneVisualAnimCurve160 = value
        AppToast.show(this, "Gesture Tap Zone Visual Anim Curve160: $value")
    }
}

internal fun PlayerActivity.showV160CastVideoPIPSnapTransform160Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v160castVideoPIPSnapTransform160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Snap Transform160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160castVideoPIPSnapTransform160 = value
        AppToast.show(this, "Cast Video PIP Snap Transform160: $value")
    }
}

internal fun PlayerActivity.showV160PlaylistAutoGroupByTag160Toggle() {
    val current = BiliClient.prefs.v160playlistAutoGroupByTag160
    BiliClient.prefs.v160playlistAutoGroupByTag160 = !current
    AppToast.show(this, "Playlist Auto Group By Tag160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160CacheSmartPinningOnScheduleEnabled160Toggle() {
    val current = BiliClient.prefs.v160cacheSmartPinningOnScheduleEnabled160
    BiliClient.prefs.v160cacheSmartPinningOnScheduleEnabled160 = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Enabled160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160ProgressBarCustomThumbColor160Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v160progressBarCustomThumbColor160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160progressBarCustomThumbColor160 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color160: $value")
    }
}

internal fun PlayerActivity.showV160VolumeLimiterAuto160Toggle() {
    val current = BiliClient.prefs.v160volumeLimiterAuto160
    BiliClient.prefs.v160volumeLimiterAuto160 = !current
    AppToast.show(this, "Volume Limiter Auto160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160HistoryAutoClean160Toggle() {
    val current = BiliClient.prefs.v160historyAutoClean160
    BiliClient.prefs.v160historyAutoClean160 = !current
    AppToast.show(this, "History Auto Clean160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160PlaybackSpeedPresetsMotionDetect160Toggle() {
    val current = BiliClient.prefs.v160playbackSpeedPresetsMotionDetect160
    BiliClient.prefs.v160playbackSpeedPresetsMotionDetect160 = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160ScreenshotAutoShareTwitch160Toggle() {
    val current = BiliClient.prefs.v160screenshotAutoShareTwitch160
    BiliClient.prefs.v160screenshotAutoShareTwitch160 = !current
    AppToast.show(this, "Screenshot Auto Share Twitch160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160VideoPIPFollowSpatialAudio160Toggle() {
    val current = BiliClient.prefs.v160videoPIPFollowSpatialAudio160
    BiliClient.prefs.v160videoPIPFollowSpatialAudio160 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio160: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV160DanmakuFontBgFillGradientInterp161Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v160danmakuFontBgFillGradientInterp161).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Gradient Interp161",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160danmakuFontBgFillGradientInterp161 = value
        AppToast.show(this, "Danmaku Font BG Fill Gradient Interp161: $value")
    }
}

internal fun PlayerActivity.showV160SubtitleAnimationTranslate160Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v160subtitleAnimationTranslate160).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate160",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v160subtitleAnimationTranslate160 = value
        AppToast.show(this, "Subtitle Animation Translate160: $value")
    }
}

internal fun PlayerActivity.showV161AudioGateToggle161Toggle() {
    val current = BiliClient.prefs.v161audioGateToggle161
    BiliClient.prefs.v161audioGateToggle161 = !current
    AppToast.show(this, "Audio Gate Toggle161: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161DanmakuRenderBatchSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161danmakuRenderBatchSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161danmakuRenderBatchSize = value
        AppToast.show(this, "Danmaku Render Batch Size: $value")
    }
}

internal fun PlayerActivity.showV161SubtitlePositionAnchorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161subtitlePositionAnchor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Anchor",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161subtitlePositionAnchor = value
        AppToast.show(this, "Subtitle Position Anchor: $value")
    }
}

internal fun PlayerActivity.showV161GestureLongPressActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161gestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161gestureLongPressAction = value
        AppToast.show(this, "Gesture Long Press Action: $value")
    }
}

internal fun PlayerActivity.showV161CastVideoPIPMaxResolutionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161castVideoPIPMaxResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Max Resolution",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161castVideoPIPMaxResolution = value
        AppToast.show(this, "Cast Video PIP Max Resolution: $value")
    }
}

internal fun PlayerActivity.showV161PlaylistContinuePlayNextToggle() {
    val current = BiliClient.prefs.v161playlistContinuePlayNext
    BiliClient.prefs.v161playlistContinuePlayNext = !current
    AppToast.show(this, "Playlist Continue Play Next: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161CachePreloadNextEpisodeToggle() {
    val current = BiliClient.prefs.v161cachePreloadNextEpisode
    BiliClient.prefs.v161cachePreloadNextEpisode = !current
    AppToast.show(this, "Cache Preload Next Episode: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161ProgressBarBufferedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161progressBarBufferedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161progressBarBufferedColor = value
        AppToast.show(this, "Progress Bar Buffered Color: $value")
    }
}

internal fun PlayerActivity.showV161VolumeFadeInOnResumeToggle() {
    val current = BiliClient.prefs.v161volumeFadeInOnResume
    BiliClient.prefs.v161volumeFadeInOnResume = !current
    AppToast.show(this, "Volume Fade In On Resume: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161HistoryImportExportToggle() {
    val current = BiliClient.prefs.v161historyImportExport
    BiliClient.prefs.v161historyImportExport = !current
    AppToast.show(this, "History Import Export: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161PlaybackAutoRotateLandscapeToggle() {
    val current = BiliClient.prefs.v161playbackAutoRotateLandscape
    BiliClient.prefs.v161playbackAutoRotateLandscape = !current
    AppToast.show(this, "Playback Auto Rotate Landscape: ${if (!current) "ON" else "OFF"}")
}

