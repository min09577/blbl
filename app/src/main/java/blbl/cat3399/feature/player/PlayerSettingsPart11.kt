package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v156: Volume Limiter Ceiling
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

// v156: History Auto Clean156
internal fun PlayerActivity.showV156HistoryAutoClean156Toggle() {
    val current = BiliClient.prefs.v156historyAutoClean156
    BiliClient.prefs.v156historyAutoClean156 = !current
    AppToast.show(this, "History Auto Clean156: ${if (!current) "ON" else "OFF"}")
}

// v156: Playback Speed Presets Face Track156
internal fun PlayerActivity.showV156PlaybackSpeedPresetsFaceTrack156Toggle() {
    val current = BiliClient.prefs.v156playbackSpeedPresetsFaceTrack156
    BiliClient.prefs.v156playbackSpeedPresetsFaceTrack156 = !current
    AppToast.show(this, "Playback Speed Presets Face Track156: ${if (!current) "ON" else "OFF"}")
}

// v156: Screenshot Auto Share Snapchat156
internal fun PlayerActivity.showV156ScreenshotAutoShareSnapchat156Toggle() {
    val current = BiliClient.prefs.v156screenshotAutoShareSnapchat156
    BiliClient.prefs.v156screenshotAutoShareSnapchat156 = !current
    AppToast.show(this, "Screenshot Auto Share Snapchat156: ${if (!current) "ON" else "OFF"}")
}

// v156: Video PIP Follow Spatial Audio156
internal fun PlayerActivity.showV156VideoPIPFollowSpatialAudio156Toggle() {
    val current = BiliClient.prefs.v156videoPIPFollowSpatialAudio156
    BiliClient.prefs.v156videoPIPFollowSpatialAudio156 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio156: ${if (!current) "ON" else "OFF"}")
}

// v156: Danmaku Font BG Fill Gradient Stops156
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

// v156: Subtitle Animation Rotate156
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

// v157: Audio Dynamic EQ Gain
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

// v157: Danmaku Font BG Fill Gradient Stops157
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

// v157: Subtitle Animation Rotate157
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

// v157: Gesture Tap Zone Visual Anim Scale157
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

// v157: Cast Video PIP Snap Direction
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

// v157: Playlist Auto Group By Tag157
internal fun PlayerActivity.showV157PlaylistAutoGroupByTag157Toggle() {
    val current = BiliClient.prefs.v157playlistAutoGroupByTag157
    BiliClient.prefs.v157playlistAutoGroupByTag157 = !current
    AppToast.show(this, "Playlist Auto Group By Tag157: ${if (!current) "ON" else "OFF"}")
}

// v157: Cache Smart Pinning On Schedule Priority
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

// v157: Progress Bar Custom Thumb Color157
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

// v157: Volume Limiter Ceiling157
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

// v157: History Auto Clean157
internal fun PlayerActivity.showV157HistoryAutoClean157Toggle() {
    val current = BiliClient.prefs.v157historyAutoClean157
    BiliClient.prefs.v157historyAutoClean157 = !current
    AppToast.show(this, "History Auto Clean157: ${if (!current) "ON" else "OFF"}")
}

// v157: Playback Speed Presets Motion Detect
internal fun PlayerActivity.showV157PlaybackSpeedPresetsMotionDetectToggle() {
    val current = BiliClient.prefs.v157playbackSpeedPresetsMotionDetect
    BiliClient.prefs.v157playbackSpeedPresetsMotionDetect = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect: ${if (!current) "ON" else "OFF"}")
}

// v157: Screenshot Auto Share TikTok157
internal fun PlayerActivity.showV157ScreenshotAutoShareTikTok157Toggle() {
    val current = BiliClient.prefs.v157screenshotAutoShareTikTok157
    BiliClient.prefs.v157screenshotAutoShareTikTok157 = !current
    AppToast.show(this, "Screenshot Auto Share TikTok157: ${if (!current) "ON" else "OFF"}")
}

// v157: Video PIP Follow Spatial Audio157
internal fun PlayerActivity.showV157VideoPIPFollowSpatialAudio157Toggle() {
    val current = BiliClient.prefs.v157videoPIPFollowSpatialAudio157
    BiliClient.prefs.v157videoPIPFollowSpatialAudio157 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio157: ${if (!current) "ON" else "OFF"}")
}

// v157: Danmaku Font BG Fill Gradient Stops158
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

// v157: Subtitle Animation Blur157
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

// v158: Audio Dynamic EQ Width
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

// v158: Danmaku Font BG Fill Gradient Stops159
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

// v158: Subtitle Animation Blur158
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

// v158: Gesture Tap Zone Visual Anim Speed158
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

// v158: Cast Video PIP Snap Easing
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

// v158: Playlist Auto Group By Tag158
internal fun PlayerActivity.showV158PlaylistAutoGroupByTag158Toggle() {
    val current = BiliClient.prefs.v158playlistAutoGroupByTag158
    BiliClient.prefs.v158playlistAutoGroupByTag158 = !current
    AppToast.show(this, "Playlist Auto Group By Tag158: ${if (!current) "ON" else "OFF"}")
}

// v158: Cache Smart Pinning On Schedule Status
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

// v158: Progress Bar Custom Thumb Glow158
internal fun PlayerActivity.showV158ProgressBarCustomThumbGlow158Toggle() {
    val current = BiliClient.prefs.v158progressBarCustomThumbGlow158
    BiliClient.prefs.v158progressBarCustomThumbGlow158 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow158: ${if (!current) "ON" else "OFF"}")
}

// v158: Volume Limiter Auto
internal fun PlayerActivity.showV158VolumeLimiterAutoToggle() {
    val current = BiliClient.prefs.v158volumeLimiterAuto
    BiliClient.prefs.v158volumeLimiterAuto = !current
    AppToast.show(this, "Volume Limiter Auto: ${if (!current) "ON" else "OFF"}")
}

// v158: History Auto Clean158
internal fun PlayerActivity.showV158HistoryAutoClean158Toggle() {
    val current = BiliClient.prefs.v158historyAutoClean158
    BiliClient.prefs.v158historyAutoClean158 = !current
    AppToast.show(this, "History Auto Clean158: ${if (!current) "ON" else "OFF"}")
}

// v158: Playback Speed Presets Motion Detect158
internal fun PlayerActivity.showV158PlaybackSpeedPresetsMotionDetect158Toggle() {
    val current = BiliClient.prefs.v158playbackSpeedPresetsMotionDetect158
    BiliClient.prefs.v158playbackSpeedPresetsMotionDetect158 = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect158: ${if (!current) "ON" else "OFF"}")
}

// v158: Screenshot Auto Share Twitch158
internal fun PlayerActivity.showV158ScreenshotAutoShareTwitch158Toggle() {
    val current = BiliClient.prefs.v158screenshotAutoShareTwitch158
    BiliClient.prefs.v158screenshotAutoShareTwitch158 = !current
    AppToast.show(this, "Screenshot Auto Share Twitch158: ${if (!current) "ON" else "OFF"}")
}

// v158: Video PIP Follow Spatial Audio158
internal fun PlayerActivity.showV158VideoPIPFollowSpatialAudio158Toggle() {
    val current = BiliClient.prefs.v158videoPIPFollowSpatialAudio158
    BiliClient.prefs.v158videoPIPFollowSpatialAudio158 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio158: ${if (!current) "ON" else "OFF"}")
}

// v158: Danmaku Font BG Fill Gradient Stops160
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

// v158: Subtitle Animation Fade In158
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

// v159: Audio Dynamic EQ Shape
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

// v159: Danmaku Font BG Fill Gradient Interp
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

// v159: Subtitle Animation Fade In159
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

// v159: Gesture Tap Zone Visual Anim Curve159
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

// v159: Cast Video PIP Snap Transform
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

// v159: Playlist Auto Group By Tag159
internal fun PlayerActivity.showV159PlaylistAutoGroupByTag159Toggle() {
    val current = BiliClient.prefs.v159playlistAutoGroupByTag159
    BiliClient.prefs.v159playlistAutoGroupByTag159 = !current
    AppToast.show(this, "Playlist Auto Group By Tag159: ${if (!current) "ON" else "OFF"}")
}

// v159: Cache Smart Pinning On Schedule Enabled
internal fun PlayerActivity.showV159CacheSmartPinningOnScheduleEnabledToggle() {
    val current = BiliClient.prefs.v159cacheSmartPinningOnScheduleEnabled
    BiliClient.prefs.v159cacheSmartPinningOnScheduleEnabled = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Enabled: ${if (!current) "ON" else "OFF"}")
}

// v159: Progress Bar Custom Thumb Border159
internal fun PlayerActivity.showV159ProgressBarCustomThumbBorder159Toggle() {
    val current = BiliClient.prefs.v159progressBarCustomThumbBorder159
    BiliClient.prefs.v159progressBarCustomThumbBorder159 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border159: ${if (!current) "ON" else "OFF"}")
}

// v159: Volume Limiter Auto159
internal fun PlayerActivity.showV159VolumeLimiterAuto159Toggle() {
    val current = BiliClient.prefs.v159volumeLimiterAuto159
    BiliClient.prefs.v159volumeLimiterAuto159 = !current
    AppToast.show(this, "Volume Limiter Auto159: ${if (!current) "ON" else "OFF"}")
}

// v159: History Auto Clean159
internal fun PlayerActivity.showV159HistoryAutoClean159Toggle() {
    val current = BiliClient.prefs.v159historyAutoClean159
    BiliClient.prefs.v159historyAutoClean159 = !current
    AppToast.show(this, "History Auto Clean159: ${if (!current) "ON" else "OFF"}")
}

// v159: Playback Speed Presets Motion Detect159
internal fun PlayerActivity.showV159PlaybackSpeedPresetsMotionDetect159Toggle() {
    val current = BiliClient.prefs.v159playbackSpeedPresetsMotionDetect159
    BiliClient.prefs.v159playbackSpeedPresetsMotionDetect159 = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect159: ${if (!current) "ON" else "OFF"}")
}

// v159: Screenshot Auto Share Twitch159
internal fun PlayerActivity.showV159ScreenshotAutoShareTwitch159Toggle() {
    val current = BiliClient.prefs.v159screenshotAutoShareTwitch159
    BiliClient.prefs.v159screenshotAutoShareTwitch159 = !current
    AppToast.show(this, "Screenshot Auto Share Twitch159: ${if (!current) "ON" else "OFF"}")
}

// v159: Video PIP Follow Spatial Audio159
internal fun PlayerActivity.showV159VideoPIPFollowSpatialAudio159Toggle() {
    val current = BiliClient.prefs.v159videoPIPFollowSpatialAudio159
    BiliClient.prefs.v159videoPIPFollowSpatialAudio159 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio159: ${if (!current) "ON" else "OFF"}")
}

// v159: Danmaku Font BG Fill Gradient Interp159
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

// v159: Subtitle Animation Fade Out159
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

// v160: Audio Dynamic EQ Mix
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

// v160: Danmaku Font BG Fill Gradient Interp160
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

// v160: Subtitle Animation Fade Out160
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

// v160: Gesture Tap Zone Visual Anim Curve160
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

// v160: Cast Video PIP Snap Transform160
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

// v160: Playlist Auto Group By Tag160
internal fun PlayerActivity.showV160PlaylistAutoGroupByTag160Toggle() {
    val current = BiliClient.prefs.v160playlistAutoGroupByTag160
    BiliClient.prefs.v160playlistAutoGroupByTag160 = !current
    AppToast.show(this, "Playlist Auto Group By Tag160: ${if (!current) "ON" else "OFF"}")
}

// v160: Cache Smart Pinning On Schedule Enabled160
internal fun PlayerActivity.showV160CacheSmartPinningOnScheduleEnabled160Toggle() {
    val current = BiliClient.prefs.v160cacheSmartPinningOnScheduleEnabled160
    BiliClient.prefs.v160cacheSmartPinningOnScheduleEnabled160 = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Enabled160: ${if (!current) "ON" else "OFF"}")
}

// v160: Progress Bar Custom Thumb Color160
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

// v160: Volume Limiter Auto160
internal fun PlayerActivity.showV160VolumeLimiterAuto160Toggle() {
    val current = BiliClient.prefs.v160volumeLimiterAuto160
    BiliClient.prefs.v160volumeLimiterAuto160 = !current
    AppToast.show(this, "Volume Limiter Auto160: ${if (!current) "ON" else "OFF"}")
}

// v160: History Auto Clean160
internal fun PlayerActivity.showV160HistoryAutoClean160Toggle() {
    val current = BiliClient.prefs.v160historyAutoClean160
    BiliClient.prefs.v160historyAutoClean160 = !current
    AppToast.show(this, "History Auto Clean160: ${if (!current) "ON" else "OFF"}")
}

// v160: Playback Speed Presets Motion Detect160
internal fun PlayerActivity.showV160PlaybackSpeedPresetsMotionDetect160Toggle() {
    val current = BiliClient.prefs.v160playbackSpeedPresetsMotionDetect160
    BiliClient.prefs.v160playbackSpeedPresetsMotionDetect160 = !current
    AppToast.show(this, "Playback Speed Presets Motion Detect160: ${if (!current) "ON" else "OFF"}")
}

// v160: Screenshot Auto Share Twitch160
internal fun PlayerActivity.showV160ScreenshotAutoShareTwitch160Toggle() {
    val current = BiliClient.prefs.v160screenshotAutoShareTwitch160
    BiliClient.prefs.v160screenshotAutoShareTwitch160 = !current
    AppToast.show(this, "Screenshot Auto Share Twitch160: ${if (!current) "ON" else "OFF"}")
}

// v160: Video PIP Follow Spatial Audio160
internal fun PlayerActivity.showV160VideoPIPFollowSpatialAudio160Toggle() {
    val current = BiliClient.prefs.v160videoPIPFollowSpatialAudio160
    BiliClient.prefs.v160videoPIPFollowSpatialAudio160 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio160: ${if (!current) "ON" else "OFF"}")
}

// v160: Danmaku Font BG Fill Gradient Interp161
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

// v160: Subtitle Animation Translate160
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

// v161: Audio Gate Toggle161
internal fun PlayerActivity.showV161AudioGateToggle161Toggle() {
    val current = BiliClient.prefs.v161audioGateToggle161
    BiliClient.prefs.v161audioGateToggle161 = !current
    AppToast.show(this, "Audio Gate Toggle161: ${if (!current) "ON" else "OFF"}")
}

// v161: Danmaku Render Batch Size
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

// v161: Subtitle Position Anchor
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

// v161: Gesture Long Press Action
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

// v161: Cast Video PIP Max Resolution
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

// v161: Playlist Continue Play Next
internal fun PlayerActivity.showV161PlaylistContinuePlayNextToggle() {
    val current = BiliClient.prefs.v161playlistContinuePlayNext
    BiliClient.prefs.v161playlistContinuePlayNext = !current
    AppToast.show(this, "Playlist Continue Play Next: ${if (!current) "ON" else "OFF"}")
}

// v161: Cache Preload Next Episode
internal fun PlayerActivity.showV161CachePreloadNextEpisodeToggle() {
    val current = BiliClient.prefs.v161cachePreloadNextEpisode
    BiliClient.prefs.v161cachePreloadNextEpisode = !current
    AppToast.show(this, "Cache Preload Next Episode: ${if (!current) "ON" else "OFF"}")
}

// v161: Progress Bar Buffered Color
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

// v161: Volume Fade In On Resume
internal fun PlayerActivity.showV161VolumeFadeInOnResumeToggle() {
    val current = BiliClient.prefs.v161volumeFadeInOnResume
    BiliClient.prefs.v161volumeFadeInOnResume = !current
    AppToast.show(this, "Volume Fade In On Resume: ${if (!current) "ON" else "OFF"}")
}

// v161: History Import Export
internal fun PlayerActivity.showV161HistoryImportExportToggle() {
    val current = BiliClient.prefs.v161historyImportExport
    BiliClient.prefs.v161historyImportExport = !current
    AppToast.show(this, "History Import Export: ${if (!current) "ON" else "OFF"}")
}

// v161: Playback Auto Rotate Landscape
internal fun PlayerActivity.showV161PlaybackAutoRotateLandscapeToggle() {
    val current = BiliClient.prefs.v161playbackAutoRotateLandscape
    BiliClient.prefs.v161playbackAutoRotateLandscape = !current
    AppToast.show(this, "Playback Auto Rotate Landscape: ${if (!current) "ON" else "OFF"}")
}

// v161: Screenshot Format PNG
internal fun PlayerActivity.showV161ScreenshotFormatPNGToggle() {
    val current = BiliClient.prefs.v161screenshotFormatPNG
    BiliClient.prefs.v161screenshotFormatPNG = !current
    AppToast.show(this, "Screenshot Format PNG: ${if (!current) "ON" else "OFF"}")
}

// v161: Video Denoise Toggle161
internal fun PlayerActivity.showV161VideoDenoiseToggle161Toggle() {
    val current = BiliClient.prefs.v161videoDenoiseToggle161
    BiliClient.prefs.v161videoDenoiseToggle161 = !current
    AppToast.show(this, "Video Denoise Toggle161: ${if (!current) "ON" else "OFF"}")
}

// v161: Danmaku Render Thread Count
internal fun PlayerActivity.showV161DanmakuRenderThreadCountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161danmakuRenderThreadCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Thread Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161danmakuRenderThreadCount = value
        AppToast.show(this, "Danmaku Render Thread Count: $value")
    }
}

// v161: Subtitle Karaoke Highlight
internal fun PlayerActivity.showV161SubtitleKaraokeHighlightToggle() {
    val current = BiliClient.prefs.v161subtitleKaraokeHighlight
    BiliClient.prefs.v161subtitleKaraokeHighlight = !current
    AppToast.show(this, "Subtitle Karaoke Highlight: ${if (!current) "ON" else "OFF"}")
}

// v162: Audio Gate Threshold162
internal fun PlayerActivity.showV162AudioGateThreshold162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162audioGateThreshold162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Threshold162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162audioGateThreshold162 = value
        AppToast.show(this, "Audio Gate Threshold162: $value")
    }
}

// v162: Danmaku Render Thread Count162
internal fun PlayerActivity.showV162DanmakuRenderThreadCount162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162danmakuRenderThreadCount162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Thread Count162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162danmakuRenderThreadCount162 = value
        AppToast.show(this, "Danmaku Render Thread Count162: $value")
    }
}

// v162: Subtitle Karaoke Highlight162
internal fun PlayerActivity.showV162SubtitleKaraokeHighlight162Toggle() {
    val current = BiliClient.prefs.v162subtitleKaraokeHighlight162
    BiliClient.prefs.v162subtitleKaraokeHighlight162 = !current
    AppToast.show(this, "Subtitle Karaoke Highlight162: ${if (!current) "ON" else "OFF"}")
}

// v162: Gesture Long Press Duration
internal fun PlayerActivity.showV162GestureLongPressDurationDialog() {
    val options = listOf(300, 500, 700, 1000, 1500)
    val currentIndex = options.indexOf(BiliClient.prefs.v162gestureLongPressDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162gestureLongPressDuration = value
        AppToast.show(this, "Gesture Long Press Duration: $value")
    }
}

// v162: Cast Video PIP Max Resolution162
internal fun PlayerActivity.showV162CastVideoPIPMaxResolution162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162castVideoPIPMaxResolution162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Max Resolution162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162castVideoPIPMaxResolution162 = value
        AppToast.show(this, "Cast Video PIP Max Resolution162: $value")
    }
}

// v162: Playlist Continue Play Next162
internal fun PlayerActivity.showV162PlaylistContinuePlayNext162Toggle() {
    val current = BiliClient.prefs.v162playlistContinuePlayNext162
    BiliClient.prefs.v162playlistContinuePlayNext162 = !current
    AppToast.show(this, "Playlist Continue Play Next162: ${if (!current) "ON" else "OFF"}")
}

// v162: Cache Preload Next Episode162
internal fun PlayerActivity.showV162CachePreloadNextEpisode162Toggle() {
    val current = BiliClient.prefs.v162cachePreloadNextEpisode162
    BiliClient.prefs.v162cachePreloadNextEpisode162 = !current
    AppToast.show(this, "Cache Preload Next Episode162: ${if (!current) "ON" else "OFF"}")
}

// v162: Progress Bar Buffered Color162
internal fun PlayerActivity.showV162ProgressBarBufferedColor162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162progressBarBufferedColor162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Color162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162progressBarBufferedColor162 = value
        AppToast.show(this, "Progress Bar Buffered Color162: $value")
    }
}

// v162: Volume Fade In On Resume162
internal fun PlayerActivity.showV162VolumeFadeInOnResume162Toggle() {
    val current = BiliClient.prefs.v162volumeFadeInOnResume162
    BiliClient.prefs.v162volumeFadeInOnResume162 = !current
    AppToast.show(this, "Volume Fade In On Resume162: ${if (!current) "ON" else "OFF"}")
}

// v162: History Import Export162
internal fun PlayerActivity.showV162HistoryImportExport162Toggle() {
    val current = BiliClient.prefs.v162historyImportExport162
    BiliClient.prefs.v162historyImportExport162 = !current
    AppToast.show(this, "History Import Export162: ${if (!current) "ON" else "OFF"}")
}

// v162: Playback Auto Rotate Landscape162
internal fun PlayerActivity.showV162PlaybackAutoRotateLandscape162Toggle() {
    val current = BiliClient.prefs.v162playbackAutoRotateLandscape162
    BiliClient.prefs.v162playbackAutoRotateLandscape162 = !current
    AppToast.show(this, "Playback Auto Rotate Landscape162: ${if (!current) "ON" else "OFF"}")
}

// v162: Screenshot Format JPEG
internal fun PlayerActivity.showV162ScreenshotFormatJPEGToggle() {
    val current = BiliClient.prefs.v162screenshotFormatJPEG
    BiliClient.prefs.v162screenshotFormatJPEG = !current
    AppToast.show(this, "Screenshot Format JPEG: ${if (!current) "ON" else "OFF"}")
}

// v162: Video Denoise Strength162
internal fun PlayerActivity.showV162VideoDenoiseStrength162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162videoDenoiseStrength162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Denoise Strength162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162videoDenoiseStrength162 = value
        AppToast.show(this, "Video Denoise Strength162: $value")
    }
}

// v162: Danmaku Render Cache Toggle
internal fun PlayerActivity.showV162DanmakuRenderCacheToggleToggle() {
    val current = BiliClient.prefs.v162danmakuRenderCacheToggle
    BiliClient.prefs.v162danmakuRenderCacheToggle = !current
    AppToast.show(this, "Danmaku Render Cache Toggle: ${if (!current) "ON" else "OFF"}")
}

// v162: Subtitle Karaoke Speed
internal fun PlayerActivity.showV162SubtitleKaraokeSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162subtitleKaraokeSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162subtitleKaraokeSpeed = value
        AppToast.show(this, "Subtitle Karaoke Speed: $value")
    }
}

// v163: Audio Gate Release163
internal fun PlayerActivity.showV163AudioGateRelease163Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163audioGateRelease163).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Release163",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163audioGateRelease163 = value
        AppToast.show(this, "Audio Gate Release163: $value")
    }
}

// v163: Danmaku Render Cache Toggle163
internal fun PlayerActivity.showV163DanmakuRenderCacheToggle163Toggle() {
    val current = BiliClient.prefs.v163danmakuRenderCacheToggle163
    BiliClient.prefs.v163danmakuRenderCacheToggle163 = !current
    AppToast.show(this, "Danmaku Render Cache Toggle163: ${if (!current) "ON" else "OFF"}")
}

// v163: Subtitle Karaoke Speed163
internal fun PlayerActivity.showV163SubtitleKaraokeSpeed163Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163subtitleKaraokeSpeed163).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Speed163",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163subtitleKaraokeSpeed163 = value
        AppToast.show(this, "Subtitle Karaoke Speed163: $value")
    }
}

// v163: Gesture Long Press Vibrate
internal fun PlayerActivity.showV163GestureLongPressVibrateToggle() {
    val current = BiliClient.prefs.v163gestureLongPressVibrate
    BiliClient.prefs.v163gestureLongPressVibrate = !current
    AppToast.show(this, "Gesture Long Press Vibrate: ${if (!current) "ON" else "OFF"}")
}

// v163: Cast Video PIP Bitrate Limit
internal fun PlayerActivity.showV163CastVideoPIPBitrateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163castVideoPIPBitrateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Bitrate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163castVideoPIPBitrateLimit = value
        AppToast.show(this, "Cast Video PIP Bitrate Limit: $value")
    }
}

// v163: Playlist Continue On Wifi
internal fun PlayerActivity.showV163PlaylistContinueOnWifiToggle() {
    val current = BiliClient.prefs.v163playlistContinueOnWifi
    BiliClient.prefs.v163playlistContinueOnWifi = !current
    AppToast.show(this, "Playlist Continue On Wifi: ${if (!current) "ON" else "OFF"}")
}

// v163: Cache Preload Size MB
internal fun PlayerActivity.showV163CachePreloadSizeMBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163cachePreloadSizeMB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size MB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163cachePreloadSizeMB = value
        AppToast.show(this, "Cache Preload Size MB: $value")
    }
}

// v163: Progress Bar Buffered Width
internal fun PlayerActivity.showV163ProgressBarBufferedWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163progressBarBufferedWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163progressBarBufferedWidth = value
        AppToast.show(this, "Progress Bar Buffered Width: $value")
    }
}

// v163: Volume Fade Out On Pause
internal fun PlayerActivity.showV163VolumeFadeOutOnPauseToggle() {
    val current = BiliClient.prefs.v163volumeFadeOutOnPause
    BiliClient.prefs.v163volumeFadeOutOnPause = !current
    AppToast.show(this, "Volume Fade Out On Pause: ${if (!current) "ON" else "OFF"}")
}

// v163: History Sync Cloud
internal fun PlayerActivity.showV163HistorySyncCloudToggle() {
    val current = BiliClient.prefs.v163historySyncCloud
    BiliClient.prefs.v163historySyncCloud = !current
    AppToast.show(this, "History Sync Cloud: ${if (!current) "ON" else "OFF"}")
}

// v163: Playback Auto Rotate Portrait
internal fun PlayerActivity.showV163PlaybackAutoRotatePortraitToggle() {
    val current = BiliClient.prefs.v163playbackAutoRotatePortrait
    BiliClient.prefs.v163playbackAutoRotatePortrait = !current
    AppToast.show(this, "Playback Auto Rotate Portrait: ${if (!current) "ON" else "OFF"}")
}

// v163: Screenshot Quality Level
internal fun PlayerActivity.showV163ScreenshotQualityLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163screenshotQualityLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Quality Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163screenshotQualityLevel = value
        AppToast.show(this, "Screenshot Quality Level: $value")
    }
}

// v163: Video Denoise Strength163
internal fun PlayerActivity.showV163VideoDenoiseStrength163Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163videoDenoiseStrength163).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Denoise Strength163",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163videoDenoiseStrength163 = value
        AppToast.show(this, "Video Denoise Strength163: $value")
    }
}

// v163: Danmaku Render Cache Size
internal fun PlayerActivity.showV163DanmakuRenderCacheSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163danmakuRenderCacheSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163danmakuRenderCacheSize = value
        AppToast.show(this, "Danmaku Render Cache Size: $value")
    }
}

// v163: Subtitle Karaoke Color
internal fun PlayerActivity.showV163SubtitleKaraokeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163subtitleKaraokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163subtitleKaraokeColor = value
        AppToast.show(this, "Subtitle Karaoke Color: $value")
    }
}

// v164: Audio Gate Range164
internal fun PlayerActivity.showV164AudioGateRange164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164audioGateRange164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Range164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164audioGateRange164 = value
        AppToast.show(this, "Audio Gate Range164: $value")
    }
}

// v164: Danmaku Render Cache Size164
internal fun PlayerActivity.showV164DanmakuRenderCacheSize164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164danmakuRenderCacheSize164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Size164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164danmakuRenderCacheSize164 = value
        AppToast.show(this, "Danmaku Render Cache Size164: $value")
    }
}

// v164: Subtitle Karaoke Color164
internal fun PlayerActivity.showV164SubtitleKaraokeColor164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164subtitleKaraokeColor164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Color164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164subtitleKaraokeColor164 = value
        AppToast.show(this, "Subtitle Karaoke Color164: $value")
    }
}

// v164: Gesture Long Press Vibrate164
internal fun PlayerActivity.showV164GestureLongPressVibrate164Toggle() {
    val current = BiliClient.prefs.v164gestureLongPressVibrate164
    BiliClient.prefs.v164gestureLongPressVibrate164 = !current
    AppToast.show(this, "Gesture Long Press Vibrate164: ${if (!current) "ON" else "OFF"}")
}

// v164: Cast Video PIP Bitrate Limit164
internal fun PlayerActivity.showV164CastVideoPIPBitrateLimit164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164castVideoPIPBitrateLimit164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Bitrate Limit164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164castVideoPIPBitrateLimit164 = value
        AppToast.show(this, "Cast Video PIP Bitrate Limit164: $value")
    }
}

// v164: Playlist Continue On Wifi164
internal fun PlayerActivity.showV164PlaylistContinueOnWifi164Toggle() {
    val current = BiliClient.prefs.v164playlistContinueOnWifi164
    BiliClient.prefs.v164playlistContinueOnWifi164 = !current
    AppToast.show(this, "Playlist Continue On Wifi164: ${if (!current) "ON" else "OFF"}")
}

// v164: Cache Preload On Wifi
internal fun PlayerActivity.showV164CachePreloadOnWifiToggle() {
    val current = BiliClient.prefs.v164cachePreloadOnWifi
    BiliClient.prefs.v164cachePreloadOnWifi = !current
    AppToast.show(this, "Cache Preload On Wifi: ${if (!current) "ON" else "OFF"}")
}

// v164: Progress Bar Buffered Opacity
internal fun PlayerActivity.showV164ProgressBarBufferedOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164progressBarBufferedOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164progressBarBufferedOpacity = value
        AppToast.show(this, "Progress Bar Buffered Opacity: $value")
    }
}

// v164: Volume Fade Out On Pause164
internal fun PlayerActivity.showV164VolumeFadeOutOnPause164Toggle() {
    val current = BiliClient.prefs.v164volumeFadeOutOnPause164
    BiliClient.prefs.v164volumeFadeOutOnPause164 = !current
    AppToast.show(this, "Volume Fade Out On Pause164: ${if (!current) "ON" else "OFF"}")
}

// v164: History Sync Cloud164
internal fun PlayerActivity.showV164HistorySyncCloud164Toggle() {
    val current = BiliClient.prefs.v164historySyncCloud164
    BiliClient.prefs.v164historySyncCloud164 = !current
    AppToast.show(this, "History Sync Cloud164: ${if (!current) "ON" else "OFF"}")
}

// v164: Playback Remember Speed
internal fun PlayerActivity.showV164PlaybackRememberSpeedToggle() {
    val current = BiliClient.prefs.v164playbackRememberSpeed
    BiliClient.prefs.v164playbackRememberSpeed = !current
    AppToast.show(this, "Playback Remember Speed: ${if (!current) "ON" else "OFF"}")
}

// v164: Screenshot Auto Name
internal fun PlayerActivity.showV164ScreenshotAutoNameToggle() {
    val current = BiliClient.prefs.v164screenshotAutoName
    BiliClient.prefs.v164screenshotAutoName = !current
    AppToast.show(this, "Screenshot Auto Name: ${if (!current) "ON" else "OFF"}")
}

// v164: Video Sharpen Toggle164
internal fun PlayerActivity.showV164VideoSharpenToggle164Toggle() {
    val current = BiliClient.prefs.v164videoSharpenToggle164
    BiliClient.prefs.v164videoSharpenToggle164 = !current
    AppToast.show(this, "Video Sharpen Toggle164: ${if (!current) "ON" else "OFF"}")
}

// v164: Danmaku Render Cache Policy
internal fun PlayerActivity.showV164DanmakuRenderCachePolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164danmakuRenderCachePolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164danmakuRenderCachePolicy = value
        AppToast.show(this, "Danmaku Render Cache Policy: $value")
    }
}

// v164: Subtitle Karaoke Font
internal fun PlayerActivity.showV164SubtitleKaraokeFontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164subtitleKaraokeFont).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164subtitleKaraokeFont = value
        AppToast.show(this, "Subtitle Karaoke Font: $value")
    }
}

// v165: Audio Gate Attack165
internal fun PlayerActivity.showV165AudioGateAttack165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165audioGateAttack165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Attack165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165audioGateAttack165 = value
        AppToast.show(this, "Audio Gate Attack165: $value")
    }
}

// v165: Danmaku Render Cache Policy165
internal fun PlayerActivity.showV165DanmakuRenderCachePolicy165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165danmakuRenderCachePolicy165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Policy165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165danmakuRenderCachePolicy165 = value
        AppToast.show(this, "Danmaku Render Cache Policy165: $value")
    }
}

// v165: Subtitle Karaoke Font165
internal fun PlayerActivity.showV165SubtitleKaraokeFont165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165subtitleKaraokeFont165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165subtitleKaraokeFont165 = value
        AppToast.show(this, "Subtitle Karaoke Font165: $value")
    }
}

// v165: Gesture Swipe Left Action
internal fun PlayerActivity.showV165GestureSwipeLeftActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165gestureSwipeLeftAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Left Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165gestureSwipeLeftAction = value
        AppToast.show(this, "Gesture Swipe Left Action: $value")
    }
}

// v165: Cast Video PIP Frame Drop
internal fun PlayerActivity.showV165CastVideoPIPFrameDropToggle() {
    val current = BiliClient.prefs.v165castVideoPIPFrameDrop
    BiliClient.prefs.v165castVideoPIPFrameDrop = !current
    AppToast.show(this, "Cast Video PIP Frame Drop: ${if (!current) "ON" else "OFF"}")
}

// v165: Playlist Shuffle Mode
internal fun PlayerActivity.showV165PlaylistShuffleModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165playlistShuffleMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Shuffle Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165playlistShuffleMode = value
        AppToast.show(this, "Playlist Shuffle Mode: $value")
    }
}

// v165: Cache Preload On Wifi165
internal fun PlayerActivity.showV165CachePreloadOnWifi165Toggle() {
    val current = BiliClient.prefs.v165cachePreloadOnWifi165
    BiliClient.prefs.v165cachePreloadOnWifi165 = !current
    AppToast.show(this, "Cache Preload On Wifi165: ${if (!current) "ON" else "OFF"}")
}

// v165: Progress Bar Buffered Anim
internal fun PlayerActivity.showV165ProgressBarBufferedAnimToggle() {
    val current = BiliClient.prefs.v165progressBarBufferedAnim
    BiliClient.prefs.v165progressBarBufferedAnim = !current
    AppToast.show(this, "Progress Bar Buffered Anim: ${if (!current) "ON" else "OFF"}")
}

// v165: Volume Fade Duration
internal fun PlayerActivity.showV165VolumeFadeDurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165volumeFadeDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165volumeFadeDuration = value
        AppToast.show(this, "Volume Fade Duration: $value")
    }
}

// v165: History Sync Wifi
internal fun PlayerActivity.showV165HistorySyncWifiToggle() {
    val current = BiliClient.prefs.v165historySyncWifi
    BiliClient.prefs.v165historySyncWifi = !current
    AppToast.show(this, "History Sync Wifi: ${if (!current) "ON" else "OFF"}")
}

// v165: Playback Remember Speed165
internal fun PlayerActivity.showV165PlaybackRememberSpeed165Toggle() {
    val current = BiliClient.prefs.v165playbackRememberSpeed165
    BiliClient.prefs.v165playbackRememberSpeed165 = !current
    AppToast.show(this, "Playback Remember Speed165: ${if (!current) "ON" else "OFF"}")
}

// v165: Screenshot Auto Name165
internal fun PlayerActivity.showV165ScreenshotAutoName165Toggle() {
    val current = BiliClient.prefs.v165screenshotAutoName165
    BiliClient.prefs.v165screenshotAutoName165 = !current
    AppToast.show(this, "Screenshot Auto Name165: ${if (!current) "ON" else "OFF"}")
}

// v165: Video Sharpen Strength165
internal fun PlayerActivity.showV165VideoSharpenStrength165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165videoSharpenStrength165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Strength165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165videoSharpenStrength165 = value
        AppToast.show(this, "Video Sharpen Strength165: $value")
    }
}

// v165: Danmaku Render Batch
internal fun PlayerActivity.showV165DanmakuRenderBatchToggle() {
    val current = BiliClient.prefs.v165danmakuRenderBatch
    BiliClient.prefs.v165danmakuRenderBatch = !current
    AppToast.show(this, "Danmaku Render Batch: ${if (!current) "ON" else "OFF"}")
}

// v165: Subtitle Karaoke Timing
internal fun PlayerActivity.showV165SubtitleKaraokeTimingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165subtitleKaraokeTiming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Timing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165subtitleKaraokeTiming = value
        AppToast.show(this, "Subtitle Karaoke Timing: $value")
    }
}

// v166: Audio Gate Hysteresis
internal fun PlayerActivity.showV166AudioGateHysteresisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166audioGateHysteresis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Hysteresis",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166audioGateHysteresis = value
        AppToast.show(this, "Audio Gate Hysteresis: $value")
    }
}

// v166: Danmaku Render Batch166
internal fun PlayerActivity.showV166DanmakuRenderBatch166Toggle() {
    val current = BiliClient.prefs.v166danmakuRenderBatch166
    BiliClient.prefs.v166danmakuRenderBatch166 = !current
    AppToast.show(this, "Danmaku Render Batch166: ${if (!current) "ON" else "OFF"}")
}

// v166: Subtitle Karaoke Timing166
internal fun PlayerActivity.showV166SubtitleKaraokeTiming166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166subtitleKaraokeTiming166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Timing166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166subtitleKaraokeTiming166 = value
        AppToast.show(this, "Subtitle Karaoke Timing166: $value")
    }
}

// v166: Gesture Swipe Right Action
internal fun PlayerActivity.showV166GestureSwipeRightActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166gestureSwipeRightAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Right Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166gestureSwipeRightAction = value
        AppToast.show(this, "Gesture Swipe Right Action: $value")
    }
}

// v166: Cast Video PIP Frame Drop166
internal fun PlayerActivity.showV166CastVideoPIPFrameDrop166Toggle() {
    val current = BiliClient.prefs.v166castVideoPIPFrameDrop166
    BiliClient.prefs.v166castVideoPIPFrameDrop166 = !current
    AppToast.show(this, "Cast Video PIP Frame Drop166: ${if (!current) "ON" else "OFF"}")
}

// v166: Playlist Shuffle Mode166
internal fun PlayerActivity.showV166PlaylistShuffleMode166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166playlistShuffleMode166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Shuffle Mode166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166playlistShuffleMode166 = value
        AppToast.show(this, "Playlist Shuffle Mode166: $value")
    }
}

// v166: Cache Preload Priority
internal fun PlayerActivity.showV166CachePreloadPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166cachePreloadPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166cachePreloadPriority = value
        AppToast.show(this, "Cache Preload Priority: $value")
    }
}

// v166: Progress Bar Buffered Anim166
internal fun PlayerActivity.showV166ProgressBarBufferedAnim166Toggle() {
    val current = BiliClient.prefs.v166progressBarBufferedAnim166
    BiliClient.prefs.v166progressBarBufferedAnim166 = !current
    AppToast.show(this, "Progress Bar Buffered Anim166: ${if (!current) "ON" else "OFF"}")
}

// v166: Volume Fade Duration166
internal fun PlayerActivity.showV166VolumeFadeDuration166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166volumeFadeDuration166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Duration166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166volumeFadeDuration166 = value
        AppToast.show(this, "Volume Fade Duration166: $value")
    }
}

// v166: History Sync Wifi166
internal fun PlayerActivity.showV166HistorySyncWifi166Toggle() {
    val current = BiliClient.prefs.v166historySyncWifi166
    BiliClient.prefs.v166historySyncWifi166 = !current
    AppToast.show(this, "History Sync Wifi166: ${if (!current) "ON" else "OFF"}")
}

// v166: Playback Remember Quality
internal fun PlayerActivity.showV166PlaybackRememberQualityToggle() {
    val current = BiliClient.prefs.v166playbackRememberQuality
    BiliClient.prefs.v166playbackRememberQuality = !current
    AppToast.show(this, "Playback Remember Quality: ${if (!current) "ON" else "OFF"}")
}

// v166: Screenshot Prefix Custom
internal fun PlayerActivity.showV166ScreenshotPrefixCustomToggle() {
    val current = BiliClient.prefs.v166screenshotPrefixCustom
    BiliClient.prefs.v166screenshotPrefixCustom = !current
    AppToast.show(this, "Screenshot Prefix Custom: ${if (!current) "ON" else "OFF"}")
}

// v166: Video Sharpen Strength166
internal fun PlayerActivity.showV166VideoSharpenStrength166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166videoSharpenStrength166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Strength166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166videoSharpenStrength166 = value
        AppToast.show(this, "Video Sharpen Strength166: $value")
    }
}

// v166: Danmaku Render Batch Size166
internal fun PlayerActivity.showV166DanmakuRenderBatchSize166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166danmakuRenderBatchSize166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Size166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166danmakuRenderBatchSize166 = value
        AppToast.show(this, "Danmaku Render Batch Size166: $value")
    }
}

// v166: Subtitle Karaoke Mode
internal fun PlayerActivity.showV166SubtitleKaraokeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166subtitleKaraokeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166subtitleKaraokeMode = value
        AppToast.show(this, "Subtitle Karaoke Mode: $value")
    }
}

// v167: Audio Gate Ratio
internal fun PlayerActivity.showV167AudioGateRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167audioGateRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167audioGateRatio = value
        AppToast.show(this, "Audio Gate Ratio: $value")
    }
}

// v167: Danmaku Render Batch Size167
internal fun PlayerActivity.showV167DanmakuRenderBatchSize167Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167danmakuRenderBatchSize167).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Size167",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167danmakuRenderBatchSize167 = value
        AppToast.show(this, "Danmaku Render Batch Size167: $value")
    }
}

// v167: Subtitle Karaoke Mode167
internal fun PlayerActivity.showV167SubtitleKaraokeMode167Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167subtitleKaraokeMode167).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Mode167",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167subtitleKaraokeMode167 = value
        AppToast.show(this, "Subtitle Karaoke Mode167: $value")
    }
}

// v167: Gesture Swipe Up Action
internal fun PlayerActivity.showV167GestureSwipeUpActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167gestureSwipeUpAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167gestureSwipeUpAction = value
        AppToast.show(this, "Gesture Swipe Up Action: $value")
    }
}

// v167: Cast Video PIP Adaptive Bitrate
internal fun PlayerActivity.showV167CastVideoPIPAdaptiveBitrateToggle() {
    val current = BiliClient.prefs.v167castVideoPIPAdaptiveBitrate
    BiliClient.prefs.v167castVideoPIPAdaptiveBitrate = !current
    AppToast.show(this, "Cast Video PIP Adaptive Bitrate: ${if (!current) "ON" else "OFF"}")
}

// v167: Playlist Repeat Mode
internal fun PlayerActivity.showV167PlaylistRepeatModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167playlistRepeatMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167playlistRepeatMode = value
        AppToast.show(this, "Playlist Repeat Mode: $value")
    }
}

// v167: Cache Preload Priority167
internal fun PlayerActivity.showV167CachePreloadPriority167Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167cachePreloadPriority167).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Priority167",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167cachePreloadPriority167 = value
        AppToast.show(this, "Cache Preload Priority167: $value")
    }
}

// v167: Progress Bar Loaded Color
internal fun PlayerActivity.showV167ProgressBarLoadedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167progressBarLoadedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167progressBarLoadedColor = value
        AppToast.show(this, "Progress Bar Loaded Color: $value")
    }
}

// v167: Volume Fade Curve
internal fun PlayerActivity.showV167VolumeFadeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167volumeFadeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167volumeFadeCurve = value
        AppToast.show(this, "Volume Fade Curve: $value")
    }
}

// v167: History Sync Bluetooth
internal fun PlayerActivity.showV167HistorySyncBluetoothToggle() {
    val current = BiliClient.prefs.v167historySyncBluetooth
    BiliClient.prefs.v167historySyncBluetooth = !current
    AppToast.show(this, "History Sync Bluetooth: ${if (!current) "ON" else "OFF"}")
}

// v167: Playback Remember Quality167
internal fun PlayerActivity.showV167PlaybackRememberQuality167Toggle() {
    val current = BiliClient.prefs.v167playbackRememberQuality167
    BiliClient.prefs.v167playbackRememberQuality167 = !current
    AppToast.show(this, "Playback Remember Quality167: ${if (!current) "ON" else "OFF"}")
}

// v167: Screenshot Prefix Custom167
internal fun PlayerActivity.showV167ScreenshotPrefixCustom167Toggle() {
    val current = BiliClient.prefs.v167screenshotPrefixCustom167
    BiliClient.prefs.v167screenshotPrefixCustom167 = !current
    AppToast.show(this, "Screenshot Prefix Custom167: ${if (!current) "ON" else "OFF"}")
}

// v167: Video Sharpen Radius
internal fun PlayerActivity.showV167VideoSharpenRadiusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167videoSharpenRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167videoSharpenRadius = value
        AppToast.show(this, "Video Sharpen Radius: $value")
    }
}

// v167: Danmaku Render Batch Timeout
internal fun PlayerActivity.showV167DanmakuRenderBatchTimeoutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167danmakuRenderBatchTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167danmakuRenderBatchTimeout = value
        AppToast.show(this, "Danmaku Render Batch Timeout: $value")
    }
}

// v167: Subtitle Karaoke Font Size
internal fun PlayerActivity.showV167SubtitleKaraokeFontSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167subtitleKaraokeFontSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167subtitleKaraokeFontSize = value
        AppToast.show(this, "Subtitle Karaoke Font Size: $value")
    }
}

// v168: Audio Gate Range168
internal fun PlayerActivity.showV168AudioGateRange168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168audioGateRange168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Range168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168audioGateRange168 = value
        AppToast.show(this, "Audio Gate Range168: $value")
    }
}

// v168: Danmaku Render Batch Timeout168
internal fun PlayerActivity.showV168DanmakuRenderBatchTimeout168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168danmakuRenderBatchTimeout168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Timeout168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168danmakuRenderBatchTimeout168 = value
        AppToast.show(this, "Danmaku Render Batch Timeout168: $value")
    }
}

// v168: Subtitle Karaoke Font Size168
internal fun PlayerActivity.showV168SubtitleKaraokeFontSize168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168subtitleKaraokeFontSize168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font Size168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168subtitleKaraokeFontSize168 = value
        AppToast.show(this, "Subtitle Karaoke Font Size168: $value")
    }
}

// v168: Gesture Swipe Down Action
internal fun PlayerActivity.showV168GestureSwipeDownActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168gestureSwipeDownAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Down Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168gestureSwipeDownAction = value
        AppToast.show(this, "Gesture Swipe Down Action: $value")
    }
}

// v168: Cast Video PIP Adaptive Bitrate168
internal fun PlayerActivity.showV168CastVideoPIPAdaptiveBitrate168Toggle() {
    val current = BiliClient.prefs.v168castVideoPIPAdaptiveBitrate168
    BiliClient.prefs.v168castVideoPIPAdaptiveBitrate168 = !current
    AppToast.show(this, "Cast Video PIP Adaptive Bitrate168: ${if (!current) "ON" else "OFF"}")
}

// v168: Playlist Repeat Mode168
internal fun PlayerActivity.showV168PlaylistRepeatMode168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168playlistRepeatMode168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168playlistRepeatMode168 = value
        AppToast.show(this, "Playlist Repeat Mode168: $value")
    }
}

// v168: Cache Cleanup On Low Storage
internal fun PlayerActivity.showV168CacheCleanupOnLowStorageToggle() {
    val current = BiliClient.prefs.v168cacheCleanupOnLowStorage
    BiliClient.prefs.v168cacheCleanupOnLowStorage = !current
    AppToast.show(this, "Cache Cleanup On Low Storage: ${if (!current) "ON" else "OFF"}")
}

// v168: Progress Bar Loaded Color168
internal fun PlayerActivity.showV168ProgressBarLoadedColor168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168progressBarLoadedColor168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Color168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168progressBarLoadedColor168 = value
        AppToast.show(this, "Progress Bar Loaded Color168: $value")
    }
}

// v168: Volume Fade Curve168
internal fun PlayerActivity.showV168VolumeFadeCurve168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168volumeFadeCurve168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Curve168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168volumeFadeCurve168 = value
        AppToast.show(this, "Volume Fade Curve168: $value")
    }
}

// v168: History Sync Bluetooth168
internal fun PlayerActivity.showV168HistorySyncBluetooth168Toggle() {
    val current = BiliClient.prefs.v168historySyncBluetooth168
    BiliClient.prefs.v168historySyncBluetooth168 = !current
    AppToast.show(this, "History Sync Bluetooth168: ${if (!current) "ON" else "OFF"}")
}

// v168: Playback Auto Next
internal fun PlayerActivity.showV168PlaybackAutoNextToggle() {
    val current = BiliClient.prefs.v168playbackAutoNext
    BiliClient.prefs.v168playbackAutoNext = !current
    AppToast.show(this, "Playback Auto Next: ${if (!current) "ON" else "OFF"}")
}

// v168: Screenshot Timestamp Toggle
internal fun PlayerActivity.showV168ScreenshotTimestampToggleToggle() {
    val current = BiliClient.prefs.v168screenshotTimestampToggle
    BiliClient.prefs.v168screenshotTimestampToggle = !current
    AppToast.show(this, "Screenshot Timestamp Toggle: ${if (!current) "ON" else "OFF"}")
}

// v168: Video Sharpen Radius168
internal fun PlayerActivity.showV168VideoSharpenRadius168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168videoSharpenRadius168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Radius168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168videoSharpenRadius168 = value
        AppToast.show(this, "Video Sharpen Radius168: $value")
    }
}

// v168: Danmaku Render Flush Policy
internal fun PlayerActivity.showV168DanmakuRenderFlushPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168danmakuRenderFlushPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168danmakuRenderFlushPolicy = value
        AppToast.show(this, "Danmaku Render Flush Policy: $value")
    }
}

// v168: Subtitle Karaoke Align
internal fun PlayerActivity.showV168SubtitleKaraokeAlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168subtitleKaraokeAlign).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Align",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168subtitleKaraokeAlign = value
        AppToast.show(this, "Subtitle Karaoke Align: $value")
    }
}

// v169: Audio Gate Knee
internal fun PlayerActivity.showV169AudioGateKneeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169audioGateKnee).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Knee",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169audioGateKnee = value
        AppToast.show(this, "Audio Gate Knee: $value")
    }
}

// v169: Danmaku Render Flush Policy169
internal fun PlayerActivity.showV169DanmakuRenderFlushPolicy169Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169danmakuRenderFlushPolicy169).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Policy169",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169danmakuRenderFlushPolicy169 = value
        AppToast.show(this, "Danmaku Render Flush Policy169: $value")
    }
}

// v169: Subtitle Karaoke Align169
internal fun PlayerActivity.showV169SubtitleKaraokeAlign169Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169subtitleKaraokeAlign169).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Align169",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169subtitleKaraokeAlign169 = value
        AppToast.show(this, "Subtitle Karaoke Align169: $value")
    }
}

// v169: Gesture Pinch In Action
internal fun PlayerActivity.showV169GesturePinchInActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169gesturePinchInAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch In Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169gesturePinchInAction = value
        AppToast.show(this, "Gesture Pinch In Action: $value")
    }
}

// v169: Cast Video PIP Resolution Scale
internal fun PlayerActivity.showV169CastVideoPIPResolutionScaleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169castVideoPIPResolutionScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Resolution Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169castVideoPIPResolutionScale = value
        AppToast.show(this, "Cast Video PIP Resolution Scale: $value")
    }
}

// v169: Playlist Auto Play Related
internal fun PlayerActivity.showV169PlaylistAutoPlayRelatedToggle() {
    val current = BiliClient.prefs.v169playlistAutoPlayRelated
    BiliClient.prefs.v169playlistAutoPlayRelated = !current
    AppToast.show(this, "Playlist Auto Play Related: ${if (!current) "ON" else "OFF"}")
}

// v169: Cache Cleanup On Low Storage169
internal fun PlayerActivity.showV169CacheCleanupOnLowStorage169Toggle() {
    val current = BiliClient.prefs.v169cacheCleanupOnLowStorage169
    BiliClient.prefs.v169cacheCleanupOnLowStorage169 = !current
    AppToast.show(this, "Cache Cleanup On Low Storage169: ${if (!current) "ON" else "OFF"}")
}

// v169: Progress Bar Loaded Opacity
internal fun PlayerActivity.showV169ProgressBarLoadedOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169progressBarLoadedOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169progressBarLoadedOpacity = value
        AppToast.show(this, "Progress Bar Loaded Opacity: $value")
    }
}

// v169: Volume Spatial Toggle169
internal fun PlayerActivity.showV169VolumeSpatialToggle169Toggle() {
    val current = BiliClient.prefs.v169volumeSpatialToggle169
    BiliClient.prefs.v169volumeSpatialToggle169 = !current
    AppToast.show(this, "Volume Spatial Toggle169: ${if (!current) "ON" else "OFF"}")
}

// v169: History Search Full Text
internal fun PlayerActivity.showV169HistorySearchFullTextToggle() {
    val current = BiliClient.prefs.v169historySearchFullText
    BiliClient.prefs.v169historySearchFullText = !current
    AppToast.show(this, "History Search Full Text: ${if (!current) "ON" else "OFF"}")
}

// v169: Playback Auto Next169
internal fun PlayerActivity.showV169PlaybackAutoNext169Toggle() {
    val current = BiliClient.prefs.v169playbackAutoNext169
    BiliClient.prefs.v169playbackAutoNext169 = !current
    AppToast.show(this, "Playback Auto Next169: ${if (!current) "ON" else "OFF"}")
}

// v169: Screenshot Timestamp Toggle169
internal fun PlayerActivity.showV169ScreenshotTimestampToggle169Toggle() {
    val current = BiliClient.prefs.v169screenshotTimestampToggle169
    BiliClient.prefs.v169screenshotTimestampToggle169 = !current
    AppToast.show(this, "Screenshot Timestamp Toggle169: ${if (!current) "ON" else "OFF"}")
}

// v169: Video Sharpen Threshold
internal fun PlayerActivity.showV169VideoSharpenThresholdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169videoSharpenThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169videoSharpenThreshold = value
        AppToast.show(this, "Video Sharpen Threshold: $value")
    }
}

