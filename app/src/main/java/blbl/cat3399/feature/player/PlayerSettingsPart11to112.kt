package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
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

// v1281: bread mode
internal fun PlayerActivity.showV1281BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bread
    FeaturePrefsStore.batch1281.v1281bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1281: breed mode
internal fun PlayerActivity.showV1281BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1281breed
    FeaturePrefsStore.batch1281.v1281breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1281: brick mode
internal fun PlayerActivity.showV1281BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1281brick
    FeaturePrefsStore.batch1281.v1281brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1281: bride mode
internal fun PlayerActivity.showV1281BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bride
    FeaturePrefsStore.batch1281.v1281bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1281: brief mode
internal fun PlayerActivity.showV1281BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1281brief
    FeaturePrefsStore.batch1281.v1281brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1281: bring level
internal fun PlayerActivity.showV1281BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1281: broad level
internal fun PlayerActivity.showV1281BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1281: broken level
internal fun PlayerActivity.showV1281BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1281: bronze level
internal fun PlayerActivity.showV1281BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1281: brook level
internal fun PlayerActivity.showV1281BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1281: brush mode
internal fun PlayerActivity.showV1281BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1281brush
    FeaturePrefsStore.batch1281.v1281brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1281: bubble mode
internal fun PlayerActivity.showV1281BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bubble
    FeaturePrefsStore.batch1281.v1281bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1281: bucket mode
internal fun PlayerActivity.showV1281BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bucket
    FeaturePrefsStore.batch1281.v1281bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1281: budget mode
internal fun PlayerActivity.showV1281BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1281budget
    FeaturePrefsStore.batch1281.v1281budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1281: buff mode
internal fun PlayerActivity.showV1281BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1281buff
    FeaturePrefsStore.batch1281.v1281buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1282: bread mode
internal fun PlayerActivity.showV1282BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bread
    FeaturePrefsStore.batch1281.v1282bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1282: breed mode
internal fun PlayerActivity.showV1282BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1282breed
    FeaturePrefsStore.batch1281.v1282breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1282: brick mode
internal fun PlayerActivity.showV1282BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1282brick
    FeaturePrefsStore.batch1281.v1282brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1282: bride mode
internal fun PlayerActivity.showV1282BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bride
    FeaturePrefsStore.batch1281.v1282bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1282: brief mode
internal fun PlayerActivity.showV1282BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1282brief
    FeaturePrefsStore.batch1281.v1282brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1282: bring level
internal fun PlayerActivity.showV1282BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1282: broad level
internal fun PlayerActivity.showV1282BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1282: broken level
internal fun PlayerActivity.showV1282BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1282: bronze level
internal fun PlayerActivity.showV1282BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1282: brook level
internal fun PlayerActivity.showV1282BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1282: brush mode
internal fun PlayerActivity.showV1282BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1282brush
    FeaturePrefsStore.batch1281.v1282brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1282: bubble mode
internal fun PlayerActivity.showV1282BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bubble
    FeaturePrefsStore.batch1281.v1282bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1282: bucket mode
internal fun PlayerActivity.showV1282BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bucket
    FeaturePrefsStore.batch1281.v1282bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1282: budget mode
internal fun PlayerActivity.showV1282BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1282budget
    FeaturePrefsStore.batch1281.v1282budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1282: buff mode
internal fun PlayerActivity.showV1282BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1282buff
    FeaturePrefsStore.batch1281.v1282buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1283: bread mode
internal fun PlayerActivity.showV1283BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bread
    FeaturePrefsStore.batch1281.v1283bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1283: breed mode
internal fun PlayerActivity.showV1283BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1283breed
    FeaturePrefsStore.batch1281.v1283breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1283: brick mode
internal fun PlayerActivity.showV1283BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1283brick
    FeaturePrefsStore.batch1281.v1283brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1283: bride mode
internal fun PlayerActivity.showV1283BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bride
    FeaturePrefsStore.batch1281.v1283bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1283: brief mode
internal fun PlayerActivity.showV1283BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1283brief
    FeaturePrefsStore.batch1281.v1283brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1283: bring level
internal fun PlayerActivity.showV1283BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1283: broad level
internal fun PlayerActivity.showV1283BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1283: broken level
internal fun PlayerActivity.showV1283BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1283: bronze level
internal fun PlayerActivity.showV1283BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1283: brook level
internal fun PlayerActivity.showV1283BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1283: brush mode
internal fun PlayerActivity.showV1283BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1283brush
    FeaturePrefsStore.batch1281.v1283brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1283: bubble mode
internal fun PlayerActivity.showV1283BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bubble
    FeaturePrefsStore.batch1281.v1283bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1283: bucket mode
internal fun PlayerActivity.showV1283BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bucket
    FeaturePrefsStore.batch1281.v1283bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1283: budget mode
internal fun PlayerActivity.showV1283BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1283budget
    FeaturePrefsStore.batch1281.v1283budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1283: buff mode
internal fun PlayerActivity.showV1283BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1283buff
    FeaturePrefsStore.batch1281.v1283buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1284: bread mode
internal fun PlayerActivity.showV1284BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bread
    FeaturePrefsStore.batch1281.v1284bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1284: breed mode
internal fun PlayerActivity.showV1284BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1284breed
    FeaturePrefsStore.batch1281.v1284breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1284: brick mode
internal fun PlayerActivity.showV1284BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1284brick
    FeaturePrefsStore.batch1281.v1284brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1284: bride mode
internal fun PlayerActivity.showV1284BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bride
    FeaturePrefsStore.batch1281.v1284bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1284: brief mode
internal fun PlayerActivity.showV1284BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1284brief
    FeaturePrefsStore.batch1281.v1284brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1284: bring level
internal fun PlayerActivity.showV1284BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1284: broad level
internal fun PlayerActivity.showV1284BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1284: broken level
internal fun PlayerActivity.showV1284BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1284: bronze level
internal fun PlayerActivity.showV1284BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1284: brook level
internal fun PlayerActivity.showV1284BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1284: brush mode
internal fun PlayerActivity.showV1284BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1284brush
    FeaturePrefsStore.batch1281.v1284brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1284: bubble mode
internal fun PlayerActivity.showV1284BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bubble
    FeaturePrefsStore.batch1281.v1284bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1284: bucket mode
internal fun PlayerActivity.showV1284BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bucket
    FeaturePrefsStore.batch1281.v1284bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1284: budget mode
internal fun PlayerActivity.showV1284BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1284budget
    FeaturePrefsStore.batch1281.v1284budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1284: buff mode
internal fun PlayerActivity.showV1284BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1284buff
    FeaturePrefsStore.batch1281.v1284buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1285: bread mode
internal fun PlayerActivity.showV1285BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bread
    FeaturePrefsStore.batch1281.v1285bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1285: breed mode
internal fun PlayerActivity.showV1285BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1285breed
    FeaturePrefsStore.batch1281.v1285breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1285: brick mode
internal fun PlayerActivity.showV1285BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1285brick
    FeaturePrefsStore.batch1281.v1285brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1285: bride mode
internal fun PlayerActivity.showV1285BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bride
    FeaturePrefsStore.batch1281.v1285bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1285: brief mode
internal fun PlayerActivity.showV1285BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1285brief
    FeaturePrefsStore.batch1281.v1285brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1285: bring level
internal fun PlayerActivity.showV1285BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1285: broad level
internal fun PlayerActivity.showV1285BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1285: broken level
internal fun PlayerActivity.showV1285BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1285: bronze level
internal fun PlayerActivity.showV1285BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1285: brook level
internal fun PlayerActivity.showV1285BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1285: brush mode
internal fun PlayerActivity.showV1285BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1285brush
    FeaturePrefsStore.batch1281.v1285brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1285: bubble mode
internal fun PlayerActivity.showV1285BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bubble
    FeaturePrefsStore.batch1281.v1285bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1285: bucket mode
internal fun PlayerActivity.showV1285BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bucket
    FeaturePrefsStore.batch1281.v1285bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1285: budget mode
internal fun PlayerActivity.showV1285BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1285budget
    FeaturePrefsStore.batch1281.v1285budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1285: buff mode
internal fun PlayerActivity.showV1285BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1285buff
    FeaturePrefsStore.batch1281.v1285buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1286: bread mode
internal fun PlayerActivity.showV1286BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bread
    FeaturePrefsStore.batch1281.v1286bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1286: breed mode
internal fun PlayerActivity.showV1286BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1286breed
    FeaturePrefsStore.batch1281.v1286breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1286: brick mode
internal fun PlayerActivity.showV1286BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1286brick
    FeaturePrefsStore.batch1281.v1286brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1286: bride mode
internal fun PlayerActivity.showV1286BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bride
    FeaturePrefsStore.batch1281.v1286bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1286: brief mode
internal fun PlayerActivity.showV1286BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1286brief
    FeaturePrefsStore.batch1281.v1286brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1286: bring level
internal fun PlayerActivity.showV1286BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1286: broad level
internal fun PlayerActivity.showV1286BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1286: broken level
internal fun PlayerActivity.showV1286BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1286: bronze level
internal fun PlayerActivity.showV1286BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1286: brook level
internal fun PlayerActivity.showV1286BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1286: brush mode
internal fun PlayerActivity.showV1286BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1286brush
    FeaturePrefsStore.batch1281.v1286brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1286: bubble mode
internal fun PlayerActivity.showV1286BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bubble
    FeaturePrefsStore.batch1281.v1286bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1286: bucket mode
internal fun PlayerActivity.showV1286BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bucket
    FeaturePrefsStore.batch1281.v1286bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1286: budget mode
internal fun PlayerActivity.showV1286BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1286budget
    FeaturePrefsStore.batch1281.v1286budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1286: buff mode
internal fun PlayerActivity.showV1286BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1286buff
    FeaturePrefsStore.batch1281.v1286buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1287: bread mode
internal fun PlayerActivity.showV1287BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bread
    FeaturePrefsStore.batch1281.v1287bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1287: breed mode
internal fun PlayerActivity.showV1287BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1287breed
    FeaturePrefsStore.batch1281.v1287breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1287: brick mode
internal fun PlayerActivity.showV1287BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1287brick
    FeaturePrefsStore.batch1281.v1287brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1287: bride mode
internal fun PlayerActivity.showV1287BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bride
    FeaturePrefsStore.batch1281.v1287bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1287: brief mode
internal fun PlayerActivity.showV1287BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1287brief
    FeaturePrefsStore.batch1281.v1287brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1287: bring level
internal fun PlayerActivity.showV1287BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1287: broad level
internal fun PlayerActivity.showV1287BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1287: broken level
internal fun PlayerActivity.showV1287BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1287: bronze level
internal fun PlayerActivity.showV1287BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1287: brook level
internal fun PlayerActivity.showV1287BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1287: brush mode
internal fun PlayerActivity.showV1287BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1287brush
    FeaturePrefsStore.batch1281.v1287brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1287: bubble mode
internal fun PlayerActivity.showV1287BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bubble
    FeaturePrefsStore.batch1281.v1287bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1287: bucket mode
internal fun PlayerActivity.showV1287BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bucket
    FeaturePrefsStore.batch1281.v1287bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1287: budget mode
internal fun PlayerActivity.showV1287BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1287budget
    FeaturePrefsStore.batch1281.v1287budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1287: buff mode
internal fun PlayerActivity.showV1287BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1287buff
    FeaturePrefsStore.batch1281.v1287buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1288: bread mode
internal fun PlayerActivity.showV1288BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bread
    FeaturePrefsStore.batch1281.v1288bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1288: breed mode
internal fun PlayerActivity.showV1288BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1288breed
    FeaturePrefsStore.batch1281.v1288breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1288: brick mode
internal fun PlayerActivity.showV1288BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1288brick
    FeaturePrefsStore.batch1281.v1288brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1288: bride mode
internal fun PlayerActivity.showV1288BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bride
    FeaturePrefsStore.batch1281.v1288bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1288: brief mode
internal fun PlayerActivity.showV1288BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1288brief
    FeaturePrefsStore.batch1281.v1288brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1288: bring level
internal fun PlayerActivity.showV1288BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1288: broad level
internal fun PlayerActivity.showV1288BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1288: broken level
internal fun PlayerActivity.showV1288BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1288: bronze level
internal fun PlayerActivity.showV1288BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1288: brook level
internal fun PlayerActivity.showV1288BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1288: brush mode
internal fun PlayerActivity.showV1288BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1288brush
    FeaturePrefsStore.batch1281.v1288brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1288: bubble mode
internal fun PlayerActivity.showV1288BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bubble
    FeaturePrefsStore.batch1281.v1288bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1288: bucket mode
internal fun PlayerActivity.showV1288BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bucket
    FeaturePrefsStore.batch1281.v1288bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1288: budget mode
internal fun PlayerActivity.showV1288BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1288budget
    FeaturePrefsStore.batch1281.v1288budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1288: buff mode
internal fun PlayerActivity.showV1288BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1288buff
    FeaturePrefsStore.batch1281.v1288buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1289: bread mode
internal fun PlayerActivity.showV1289BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bread
    FeaturePrefsStore.batch1281.v1289bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1289: breed mode
internal fun PlayerActivity.showV1289BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1289breed
    FeaturePrefsStore.batch1281.v1289breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1289: brick mode
internal fun PlayerActivity.showV1289BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1289brick
    FeaturePrefsStore.batch1281.v1289brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1289: bride mode
internal fun PlayerActivity.showV1289BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bride
    FeaturePrefsStore.batch1281.v1289bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1289: brief mode
internal fun PlayerActivity.showV1289BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1289brief
    FeaturePrefsStore.batch1281.v1289brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1289: bring level
internal fun PlayerActivity.showV1289BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1289: broad level
internal fun PlayerActivity.showV1289BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1289: broken level
internal fun PlayerActivity.showV1289BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1289: bronze level
internal fun PlayerActivity.showV1289BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1289: brook level
internal fun PlayerActivity.showV1289BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1289: brush mode
internal fun PlayerActivity.showV1289BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1289brush
    FeaturePrefsStore.batch1281.v1289brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1289: bubble mode
internal fun PlayerActivity.showV1289BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bubble
    FeaturePrefsStore.batch1281.v1289bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1289: bucket mode
internal fun PlayerActivity.showV1289BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bucket
    FeaturePrefsStore.batch1281.v1289bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1289: budget mode
internal fun PlayerActivity.showV1289BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1289budget
    FeaturePrefsStore.batch1281.v1289budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1289: buff mode
internal fun PlayerActivity.showV1289BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1289buff
    FeaturePrefsStore.batch1281.v1289buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1290: bread mode
internal fun PlayerActivity.showV1290BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bread
    FeaturePrefsStore.batch1281.v1290bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1290: breed mode
internal fun PlayerActivity.showV1290BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1290breed
    FeaturePrefsStore.batch1281.v1290breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1290: brick mode
internal fun PlayerActivity.showV1290BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1290brick
    FeaturePrefsStore.batch1281.v1290brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1290: bride mode
internal fun PlayerActivity.showV1290BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bride
    FeaturePrefsStore.batch1281.v1290bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1290: brief mode
internal fun PlayerActivity.showV1290BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1290brief
    FeaturePrefsStore.batch1281.v1290brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1290: bring level
internal fun PlayerActivity.showV1290BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1290: broad level
internal fun PlayerActivity.showV1290BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1290: broken level
internal fun PlayerActivity.showV1290BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1290: bronze level
internal fun PlayerActivity.showV1290BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1290: brook level
internal fun PlayerActivity.showV1290BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1290: brush mode
internal fun PlayerActivity.showV1290BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1290brush
    FeaturePrefsStore.batch1281.v1290brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1290: bubble mode
internal fun PlayerActivity.showV1290BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bubble
    FeaturePrefsStore.batch1281.v1290bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1290: bucket mode
internal fun PlayerActivity.showV1290BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bucket
    FeaturePrefsStore.batch1281.v1290bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1290: budget mode
internal fun PlayerActivity.showV1290BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1290budget
    FeaturePrefsStore.batch1281.v1290budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1290: buff mode
internal fun PlayerActivity.showV1290BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1290buff
    FeaturePrefsStore.batch1281.v1290buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1291: bug mode
internal fun PlayerActivity.showV1291BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bug
    FeaturePrefsStore.batch1291.v1291bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1291: bullet mode
internal fun PlayerActivity.showV1291BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bullet
    FeaturePrefsStore.batch1291.v1291bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1291: bunch mode
internal fun PlayerActivity.showV1291BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bunch
    FeaturePrefsStore.batch1291.v1291bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1291: burn mode
internal fun PlayerActivity.showV1291BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1291burn
    FeaturePrefsStore.batch1291.v1291burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1291: bus mode
internal fun PlayerActivity.showV1291BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bus
    FeaturePrefsStore.batch1291.v1291bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1291: bush level
internal fun PlayerActivity.showV1291BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1291: busy level
internal fun PlayerActivity.showV1291BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1291: buzz level
internal fun PlayerActivity.showV1291BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1291: cabin level
internal fun PlayerActivity.showV1291CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1291: cable level
internal fun PlayerActivity.showV1291CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1291: cake mode
internal fun PlayerActivity.showV1291CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1291cake
    FeaturePrefsStore.batch1291.v1291cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1291: calm mode
internal fun PlayerActivity.showV1291CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1291calm
    FeaturePrefsStore.batch1291.v1291calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1291: camera mode
internal fun PlayerActivity.showV1291CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1291camera
    FeaturePrefsStore.batch1291.v1291camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1291: camp mode
internal fun PlayerActivity.showV1291CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1291camp
    FeaturePrefsStore.batch1291.v1291camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1291: canal mode
internal fun PlayerActivity.showV1291CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1291canal
    FeaturePrefsStore.batch1291.v1291canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1292: bug mode
internal fun PlayerActivity.showV1292BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bug
    FeaturePrefsStore.batch1291.v1292bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1292: bullet mode
internal fun PlayerActivity.showV1292BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bullet
    FeaturePrefsStore.batch1291.v1292bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1292: bunch mode
internal fun PlayerActivity.showV1292BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bunch
    FeaturePrefsStore.batch1291.v1292bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1292: burn mode
internal fun PlayerActivity.showV1292BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1292burn
    FeaturePrefsStore.batch1291.v1292burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1292: bus mode
internal fun PlayerActivity.showV1292BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bus
    FeaturePrefsStore.batch1291.v1292bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1292: bush level
internal fun PlayerActivity.showV1292BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1292: busy level
internal fun PlayerActivity.showV1292BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1292: buzz level
internal fun PlayerActivity.showV1292BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1292: cabin level
internal fun PlayerActivity.showV1292CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1292: cable level
internal fun PlayerActivity.showV1292CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1292: cake mode
internal fun PlayerActivity.showV1292CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1292cake
    FeaturePrefsStore.batch1291.v1292cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1292: calm mode
internal fun PlayerActivity.showV1292CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1292calm
    FeaturePrefsStore.batch1291.v1292calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1292: camera mode
internal fun PlayerActivity.showV1292CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1292camera
    FeaturePrefsStore.batch1291.v1292camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1292: camp mode
internal fun PlayerActivity.showV1292CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1292camp
    FeaturePrefsStore.batch1291.v1292camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1292: canal mode
internal fun PlayerActivity.showV1292CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1292canal
    FeaturePrefsStore.batch1291.v1292canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1293: bug mode
internal fun PlayerActivity.showV1293BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bug
    FeaturePrefsStore.batch1291.v1293bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1293: bullet mode
internal fun PlayerActivity.showV1293BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bullet
    FeaturePrefsStore.batch1291.v1293bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1293: bunch mode
internal fun PlayerActivity.showV1293BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bunch
    FeaturePrefsStore.batch1291.v1293bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1293: burn mode
internal fun PlayerActivity.showV1293BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1293burn
    FeaturePrefsStore.batch1291.v1293burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1293: bus mode
internal fun PlayerActivity.showV1293BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bus
    FeaturePrefsStore.batch1291.v1293bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1293: bush level
internal fun PlayerActivity.showV1293BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1293: busy level
internal fun PlayerActivity.showV1293BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1293: buzz level
internal fun PlayerActivity.showV1293BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1293: cabin level
internal fun PlayerActivity.showV1293CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1293: cable level
internal fun PlayerActivity.showV1293CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1293: cake mode
internal fun PlayerActivity.showV1293CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1293cake
    FeaturePrefsStore.batch1291.v1293cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1293: calm mode
internal fun PlayerActivity.showV1293CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1293calm
    FeaturePrefsStore.batch1291.v1293calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1293: camera mode
internal fun PlayerActivity.showV1293CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1293camera
    FeaturePrefsStore.batch1291.v1293camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1293: camp mode
internal fun PlayerActivity.showV1293CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1293camp
    FeaturePrefsStore.batch1291.v1293camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1293: canal mode
internal fun PlayerActivity.showV1293CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1293canal
    FeaturePrefsStore.batch1291.v1293canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1294: bug mode
internal fun PlayerActivity.showV1294BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bug
    FeaturePrefsStore.batch1291.v1294bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1294: bullet mode
internal fun PlayerActivity.showV1294BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bullet
    FeaturePrefsStore.batch1291.v1294bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1294: bunch mode
internal fun PlayerActivity.showV1294BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bunch
    FeaturePrefsStore.batch1291.v1294bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1294: burn mode
internal fun PlayerActivity.showV1294BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1294burn
    FeaturePrefsStore.batch1291.v1294burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1294: bus mode
internal fun PlayerActivity.showV1294BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bus
    FeaturePrefsStore.batch1291.v1294bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1294: bush level
internal fun PlayerActivity.showV1294BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1294: busy level
internal fun PlayerActivity.showV1294BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1294: buzz level
internal fun PlayerActivity.showV1294BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1294: cabin level
internal fun PlayerActivity.showV1294CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1294: cable level
internal fun PlayerActivity.showV1294CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1294: cake mode
internal fun PlayerActivity.showV1294CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1294cake
    FeaturePrefsStore.batch1291.v1294cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1294: calm mode
internal fun PlayerActivity.showV1294CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1294calm
    FeaturePrefsStore.batch1291.v1294calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1294: camera mode
internal fun PlayerActivity.showV1294CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1294camera
    FeaturePrefsStore.batch1291.v1294camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1294: camp mode
internal fun PlayerActivity.showV1294CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1294camp
    FeaturePrefsStore.batch1291.v1294camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1294: canal mode
internal fun PlayerActivity.showV1294CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1294canal
    FeaturePrefsStore.batch1291.v1294canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1295: bug mode
internal fun PlayerActivity.showV1295BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bug
    FeaturePrefsStore.batch1291.v1295bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1295: bullet mode
internal fun PlayerActivity.showV1295BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bullet
    FeaturePrefsStore.batch1291.v1295bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1295: bunch mode
internal fun PlayerActivity.showV1295BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bunch
    FeaturePrefsStore.batch1291.v1295bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1295: burn mode
internal fun PlayerActivity.showV1295BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1295burn
    FeaturePrefsStore.batch1291.v1295burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1295: bus mode
internal fun PlayerActivity.showV1295BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bus
    FeaturePrefsStore.batch1291.v1295bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1295: bush level
internal fun PlayerActivity.showV1295BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1295: busy level
internal fun PlayerActivity.showV1295BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1295: buzz level
internal fun PlayerActivity.showV1295BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1295: cabin level
internal fun PlayerActivity.showV1295CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1295: cable level
internal fun PlayerActivity.showV1295CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1295: cake mode
internal fun PlayerActivity.showV1295CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1295cake
    FeaturePrefsStore.batch1291.v1295cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1295: calm mode
internal fun PlayerActivity.showV1295CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1295calm
    FeaturePrefsStore.batch1291.v1295calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1295: camera mode
internal fun PlayerActivity.showV1295CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1295camera
    FeaturePrefsStore.batch1291.v1295camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1295: camp mode
internal fun PlayerActivity.showV1295CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1295camp
    FeaturePrefsStore.batch1291.v1295camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1295: canal mode
internal fun PlayerActivity.showV1295CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1295canal
    FeaturePrefsStore.batch1291.v1295canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1296: bug mode
internal fun PlayerActivity.showV1296BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bug
    FeaturePrefsStore.batch1291.v1296bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1296: bullet mode
internal fun PlayerActivity.showV1296BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bullet
    FeaturePrefsStore.batch1291.v1296bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1296: bunch mode
internal fun PlayerActivity.showV1296BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bunch
    FeaturePrefsStore.batch1291.v1296bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1296: burn mode
internal fun PlayerActivity.showV1296BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1296burn
    FeaturePrefsStore.batch1291.v1296burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1296: bus mode
internal fun PlayerActivity.showV1296BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bus
    FeaturePrefsStore.batch1291.v1296bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1296: bush level
internal fun PlayerActivity.showV1296BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1296: busy level
internal fun PlayerActivity.showV1296BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1296: buzz level
internal fun PlayerActivity.showV1296BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1296: cabin level
internal fun PlayerActivity.showV1296CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1296: cable level
internal fun PlayerActivity.showV1296CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1296: cake mode
internal fun PlayerActivity.showV1296CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1296cake
    FeaturePrefsStore.batch1291.v1296cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1296: calm mode
internal fun PlayerActivity.showV1296CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1296calm
    FeaturePrefsStore.batch1291.v1296calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1296: camera mode
internal fun PlayerActivity.showV1296CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1296camera
    FeaturePrefsStore.batch1291.v1296camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1296: camp mode
internal fun PlayerActivity.showV1296CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1296camp
    FeaturePrefsStore.batch1291.v1296camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1296: canal mode
internal fun PlayerActivity.showV1296CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1296canal
    FeaturePrefsStore.batch1291.v1296canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1297: bug mode
internal fun PlayerActivity.showV1297BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bug
    FeaturePrefsStore.batch1291.v1297bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1297: bullet mode
internal fun PlayerActivity.showV1297BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bullet
    FeaturePrefsStore.batch1291.v1297bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1297: bunch mode
internal fun PlayerActivity.showV1297BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bunch
    FeaturePrefsStore.batch1291.v1297bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1297: burn mode
internal fun PlayerActivity.showV1297BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1297burn
    FeaturePrefsStore.batch1291.v1297burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1297: bus mode
internal fun PlayerActivity.showV1297BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bus
    FeaturePrefsStore.batch1291.v1297bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1297: bush level
internal fun PlayerActivity.showV1297BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1297: busy level
internal fun PlayerActivity.showV1297BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1297: buzz level
internal fun PlayerActivity.showV1297BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1297: cabin level
internal fun PlayerActivity.showV1297CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1297: cable level
internal fun PlayerActivity.showV1297CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1297: cake mode
internal fun PlayerActivity.showV1297CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1297cake
    FeaturePrefsStore.batch1291.v1297cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1297: calm mode
internal fun PlayerActivity.showV1297CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1297calm
    FeaturePrefsStore.batch1291.v1297calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1297: camera mode
internal fun PlayerActivity.showV1297CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1297camera
    FeaturePrefsStore.batch1291.v1297camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1297: camp mode
internal fun PlayerActivity.showV1297CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1297camp
    FeaturePrefsStore.batch1291.v1297camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1297: canal mode
internal fun PlayerActivity.showV1297CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1297canal
    FeaturePrefsStore.batch1291.v1297canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1298: bug mode
internal fun PlayerActivity.showV1298BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bug
    FeaturePrefsStore.batch1291.v1298bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1298: bullet mode
internal fun PlayerActivity.showV1298BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bullet
    FeaturePrefsStore.batch1291.v1298bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1298: bunch mode
internal fun PlayerActivity.showV1298BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bunch
    FeaturePrefsStore.batch1291.v1298bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1298: burn mode
internal fun PlayerActivity.showV1298BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1298burn
    FeaturePrefsStore.batch1291.v1298burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1298: bus mode
internal fun PlayerActivity.showV1298BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bus
    FeaturePrefsStore.batch1291.v1298bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1298: bush level
internal fun PlayerActivity.showV1298BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1298: busy level
internal fun PlayerActivity.showV1298BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1298: buzz level
internal fun PlayerActivity.showV1298BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1298: cabin level
internal fun PlayerActivity.showV1298CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1298: cable level
internal fun PlayerActivity.showV1298CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1298: cake mode
internal fun PlayerActivity.showV1298CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1298cake
    FeaturePrefsStore.batch1291.v1298cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1298: calm mode
internal fun PlayerActivity.showV1298CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1298calm
    FeaturePrefsStore.batch1291.v1298calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1298: camera mode
internal fun PlayerActivity.showV1298CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1298camera
    FeaturePrefsStore.batch1291.v1298camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1298: camp mode
internal fun PlayerActivity.showV1298CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1298camp
    FeaturePrefsStore.batch1291.v1298camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1298: canal mode
internal fun PlayerActivity.showV1298CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1298canal
    FeaturePrefsStore.batch1291.v1298canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1299: bug mode
internal fun PlayerActivity.showV1299BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bug
    FeaturePrefsStore.batch1291.v1299bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1299: bullet mode
internal fun PlayerActivity.showV1299BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bullet
    FeaturePrefsStore.batch1291.v1299bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1299: bunch mode
internal fun PlayerActivity.showV1299BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bunch
    FeaturePrefsStore.batch1291.v1299bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1299: burn mode
internal fun PlayerActivity.showV1299BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1299burn
    FeaturePrefsStore.batch1291.v1299burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1299: bus mode
internal fun PlayerActivity.showV1299BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bus
    FeaturePrefsStore.batch1291.v1299bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1299: bush level
internal fun PlayerActivity.showV1299BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1299: busy level
internal fun PlayerActivity.showV1299BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1299: buzz level
internal fun PlayerActivity.showV1299BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1299: cabin level
internal fun PlayerActivity.showV1299CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1299: cable level
internal fun PlayerActivity.showV1299CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1299: cake mode
internal fun PlayerActivity.showV1299CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1299cake
    FeaturePrefsStore.batch1291.v1299cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1299: calm mode
internal fun PlayerActivity.showV1299CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1299calm
    FeaturePrefsStore.batch1291.v1299calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1299: camera mode
internal fun PlayerActivity.showV1299CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1299camera
    FeaturePrefsStore.batch1291.v1299camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1299: camp mode
internal fun PlayerActivity.showV1299CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1299camp
    FeaturePrefsStore.batch1291.v1299camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1299: canal mode
internal fun PlayerActivity.showV1299CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1299canal
    FeaturePrefsStore.batch1291.v1299canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1300: bug mode
internal fun PlayerActivity.showV1300BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bug
    FeaturePrefsStore.batch1291.v1300bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1300: bullet mode
internal fun PlayerActivity.showV1300BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bullet
    FeaturePrefsStore.batch1291.v1300bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1300: bunch mode
internal fun PlayerActivity.showV1300BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bunch
    FeaturePrefsStore.batch1291.v1300bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1300: burn mode
internal fun PlayerActivity.showV1300BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1300burn
    FeaturePrefsStore.batch1291.v1300burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1300: bus mode
internal fun PlayerActivity.showV1300BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bus
    FeaturePrefsStore.batch1291.v1300bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1300: bush level
internal fun PlayerActivity.showV1300BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1300: busy level
internal fun PlayerActivity.showV1300BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1300: buzz level
internal fun PlayerActivity.showV1300BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1300: cabin level
internal fun PlayerActivity.showV1300CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1300: cable level
internal fun PlayerActivity.showV1300CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1300: cake mode
internal fun PlayerActivity.showV1300CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1300cake
    FeaturePrefsStore.batch1291.v1300cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1300: calm mode
internal fun PlayerActivity.showV1300CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1300calm
    FeaturePrefsStore.batch1291.v1300calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1300: camera mode
internal fun PlayerActivity.showV1300CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1300camera
    FeaturePrefsStore.batch1291.v1300camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1300: camp mode
internal fun PlayerActivity.showV1300CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1300camp
    FeaturePrefsStore.batch1291.v1300camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1300: canal mode
internal fun PlayerActivity.showV1300CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1300canal
    FeaturePrefsStore.batch1291.v1300canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1301: candy mode
internal fun PlayerActivity.showV1301CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1301candy
    FeaturePrefsStore.batch1301.v1301candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1301: canvas mode
internal fun PlayerActivity.showV1301CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1301canvas
    FeaturePrefsStore.batch1301.v1301canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1301: carbon mode
internal fun PlayerActivity.showV1301CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1301carbon
    FeaturePrefsStore.batch1301.v1301carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1301: card mode
internal fun PlayerActivity.showV1301CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1301card
    FeaturePrefsStore.batch1301.v1301card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1301: cargo mode
internal fun PlayerActivity.showV1301CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cargo
    FeaturePrefsStore.batch1301.v1301cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1301: carpet level
internal fun PlayerActivity.showV1301CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1301: carry level
internal fun PlayerActivity.showV1301CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1301: cart level
internal fun PlayerActivity.showV1301CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1301: case level
internal fun PlayerActivity.showV1301CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301case = value
        AppToast.show(this, "case: $value")
    }
}

// v1301: cash level
internal fun PlayerActivity.showV1301CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1301cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1301cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1301: cast mode
internal fun PlayerActivity.showV1301CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cast
    FeaturePrefsStore.batch1301.v1301cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1301: castle mode
internal fun PlayerActivity.showV1301CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1301castle
    FeaturePrefsStore.batch1301.v1301castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1301: catch mode
internal fun PlayerActivity.showV1301CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1301catch
    FeaturePrefsStore.batch1301.v1301catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1301: cause mode
internal fun PlayerActivity.showV1301CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cause
    FeaturePrefsStore.batch1301.v1301cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1301: cave mode
internal fun PlayerActivity.showV1301CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1301cave
    FeaturePrefsStore.batch1301.v1301cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1302: candy mode
internal fun PlayerActivity.showV1302CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1302candy
    FeaturePrefsStore.batch1301.v1302candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1302: canvas mode
internal fun PlayerActivity.showV1302CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1302canvas
    FeaturePrefsStore.batch1301.v1302canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1302: carbon mode
internal fun PlayerActivity.showV1302CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1302carbon
    FeaturePrefsStore.batch1301.v1302carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1302: card mode
internal fun PlayerActivity.showV1302CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1302card
    FeaturePrefsStore.batch1301.v1302card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1302: cargo mode
internal fun PlayerActivity.showV1302CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cargo
    FeaturePrefsStore.batch1301.v1302cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1302: carpet level
internal fun PlayerActivity.showV1302CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1302: carry level
internal fun PlayerActivity.showV1302CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1302: cart level
internal fun PlayerActivity.showV1302CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1302: case level
internal fun PlayerActivity.showV1302CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302case = value
        AppToast.show(this, "case: $value")
    }
}

// v1302: cash level
internal fun PlayerActivity.showV1302CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1302cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1302cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1302: cast mode
internal fun PlayerActivity.showV1302CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cast
    FeaturePrefsStore.batch1301.v1302cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1302: castle mode
internal fun PlayerActivity.showV1302CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1302castle
    FeaturePrefsStore.batch1301.v1302castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1302: catch mode
internal fun PlayerActivity.showV1302CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1302catch
    FeaturePrefsStore.batch1301.v1302catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1302: cause mode
internal fun PlayerActivity.showV1302CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cause
    FeaturePrefsStore.batch1301.v1302cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1302: cave mode
internal fun PlayerActivity.showV1302CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1302cave
    FeaturePrefsStore.batch1301.v1302cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1303: candy mode
internal fun PlayerActivity.showV1303CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1303candy
    FeaturePrefsStore.batch1301.v1303candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1303: canvas mode
internal fun PlayerActivity.showV1303CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1303canvas
    FeaturePrefsStore.batch1301.v1303canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1303: carbon mode
internal fun PlayerActivity.showV1303CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1303carbon
    FeaturePrefsStore.batch1301.v1303carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1303: card mode
internal fun PlayerActivity.showV1303CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1303card
    FeaturePrefsStore.batch1301.v1303card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1303: cargo mode
internal fun PlayerActivity.showV1303CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cargo
    FeaturePrefsStore.batch1301.v1303cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1303: carpet level
internal fun PlayerActivity.showV1303CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1303: carry level
internal fun PlayerActivity.showV1303CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1303: cart level
internal fun PlayerActivity.showV1303CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1303: case level
internal fun PlayerActivity.showV1303CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303case = value
        AppToast.show(this, "case: $value")
    }
}

// v1303: cash level
internal fun PlayerActivity.showV1303CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1303cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1303cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1303: cast mode
internal fun PlayerActivity.showV1303CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cast
    FeaturePrefsStore.batch1301.v1303cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1303: castle mode
internal fun PlayerActivity.showV1303CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1303castle
    FeaturePrefsStore.batch1301.v1303castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1303: catch mode
internal fun PlayerActivity.showV1303CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1303catch
    FeaturePrefsStore.batch1301.v1303catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1303: cause mode
internal fun PlayerActivity.showV1303CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cause
    FeaturePrefsStore.batch1301.v1303cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1303: cave mode
internal fun PlayerActivity.showV1303CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1303cave
    FeaturePrefsStore.batch1301.v1303cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1304: candy mode
internal fun PlayerActivity.showV1304CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1304candy
    FeaturePrefsStore.batch1301.v1304candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1304: canvas mode
internal fun PlayerActivity.showV1304CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1304canvas
    FeaturePrefsStore.batch1301.v1304canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1304: carbon mode
internal fun PlayerActivity.showV1304CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1304carbon
    FeaturePrefsStore.batch1301.v1304carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1304: card mode
internal fun PlayerActivity.showV1304CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1304card
    FeaturePrefsStore.batch1301.v1304card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1304: cargo mode
internal fun PlayerActivity.showV1304CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cargo
    FeaturePrefsStore.batch1301.v1304cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1304: carpet level
internal fun PlayerActivity.showV1304CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1304: carry level
internal fun PlayerActivity.showV1304CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1304: cart level
internal fun PlayerActivity.showV1304CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1304: case level
internal fun PlayerActivity.showV1304CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304case = value
        AppToast.show(this, "case: $value")
    }
}

// v1304: cash level
internal fun PlayerActivity.showV1304CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1304cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1304cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1304: cast mode
internal fun PlayerActivity.showV1304CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cast
    FeaturePrefsStore.batch1301.v1304cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1304: castle mode
internal fun PlayerActivity.showV1304CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1304castle
    FeaturePrefsStore.batch1301.v1304castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1304: catch mode
internal fun PlayerActivity.showV1304CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1304catch
    FeaturePrefsStore.batch1301.v1304catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1304: cause mode
internal fun PlayerActivity.showV1304CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cause
    FeaturePrefsStore.batch1301.v1304cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1304: cave mode
internal fun PlayerActivity.showV1304CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1304cave
    FeaturePrefsStore.batch1301.v1304cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1305: candy mode
internal fun PlayerActivity.showV1305CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1305candy
    FeaturePrefsStore.batch1301.v1305candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1305: canvas mode
internal fun PlayerActivity.showV1305CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1305canvas
    FeaturePrefsStore.batch1301.v1305canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1305: carbon mode
internal fun PlayerActivity.showV1305CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1305carbon
    FeaturePrefsStore.batch1301.v1305carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1305: card mode
internal fun PlayerActivity.showV1305CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1305card
    FeaturePrefsStore.batch1301.v1305card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1305: cargo mode
internal fun PlayerActivity.showV1305CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cargo
    FeaturePrefsStore.batch1301.v1305cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1305: carpet level
internal fun PlayerActivity.showV1305CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1305: carry level
internal fun PlayerActivity.showV1305CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1305: cart level
internal fun PlayerActivity.showV1305CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1305: case level
internal fun PlayerActivity.showV1305CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305case = value
        AppToast.show(this, "case: $value")
    }
}

// v1305: cash level
internal fun PlayerActivity.showV1305CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1305cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1305cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1305: cast mode
internal fun PlayerActivity.showV1305CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cast
    FeaturePrefsStore.batch1301.v1305cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1305: castle mode
internal fun PlayerActivity.showV1305CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1305castle
    FeaturePrefsStore.batch1301.v1305castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1305: catch mode
internal fun PlayerActivity.showV1305CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1305catch
    FeaturePrefsStore.batch1301.v1305catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1305: cause mode
internal fun PlayerActivity.showV1305CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cause
    FeaturePrefsStore.batch1301.v1305cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1305: cave mode
internal fun PlayerActivity.showV1305CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1305cave
    FeaturePrefsStore.batch1301.v1305cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1306: candy mode
internal fun PlayerActivity.showV1306CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1306candy
    FeaturePrefsStore.batch1301.v1306candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1306: canvas mode
internal fun PlayerActivity.showV1306CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1306canvas
    FeaturePrefsStore.batch1301.v1306canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1306: carbon mode
internal fun PlayerActivity.showV1306CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1306carbon
    FeaturePrefsStore.batch1301.v1306carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1306: card mode
internal fun PlayerActivity.showV1306CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1306card
    FeaturePrefsStore.batch1301.v1306card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1306: cargo mode
internal fun PlayerActivity.showV1306CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cargo
    FeaturePrefsStore.batch1301.v1306cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1306: carpet level
internal fun PlayerActivity.showV1306CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1306: carry level
internal fun PlayerActivity.showV1306CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1306: cart level
internal fun PlayerActivity.showV1306CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1306: case level
internal fun PlayerActivity.showV1306CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306case = value
        AppToast.show(this, "case: $value")
    }
}

// v1306: cash level
internal fun PlayerActivity.showV1306CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1306cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1306cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1306: cast mode
internal fun PlayerActivity.showV1306CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cast
    FeaturePrefsStore.batch1301.v1306cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1306: castle mode
internal fun PlayerActivity.showV1306CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1306castle
    FeaturePrefsStore.batch1301.v1306castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1306: catch mode
internal fun PlayerActivity.showV1306CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1306catch
    FeaturePrefsStore.batch1301.v1306catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1306: cause mode
internal fun PlayerActivity.showV1306CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cause
    FeaturePrefsStore.batch1301.v1306cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1306: cave mode
internal fun PlayerActivity.showV1306CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1306cave
    FeaturePrefsStore.batch1301.v1306cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1307: candy mode
internal fun PlayerActivity.showV1307CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1307candy
    FeaturePrefsStore.batch1301.v1307candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1307: canvas mode
internal fun PlayerActivity.showV1307CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1307canvas
    FeaturePrefsStore.batch1301.v1307canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1307: carbon mode
internal fun PlayerActivity.showV1307CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1307carbon
    FeaturePrefsStore.batch1301.v1307carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1307: card mode
internal fun PlayerActivity.showV1307CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1307card
    FeaturePrefsStore.batch1301.v1307card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1307: cargo mode
internal fun PlayerActivity.showV1307CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cargo
    FeaturePrefsStore.batch1301.v1307cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1307: carpet level
internal fun PlayerActivity.showV1307CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1307: carry level
internal fun PlayerActivity.showV1307CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1307: cart level
internal fun PlayerActivity.showV1307CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1307: case level
internal fun PlayerActivity.showV1307CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307case = value
        AppToast.show(this, "case: $value")
    }
}

// v1307: cash level
internal fun PlayerActivity.showV1307CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1307cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1307cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1307: cast mode
internal fun PlayerActivity.showV1307CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cast
    FeaturePrefsStore.batch1301.v1307cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1307: castle mode
internal fun PlayerActivity.showV1307CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1307castle
    FeaturePrefsStore.batch1301.v1307castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1307: catch mode
internal fun PlayerActivity.showV1307CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1307catch
    FeaturePrefsStore.batch1301.v1307catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1307: cause mode
internal fun PlayerActivity.showV1307CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cause
    FeaturePrefsStore.batch1301.v1307cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1307: cave mode
internal fun PlayerActivity.showV1307CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1307cave
    FeaturePrefsStore.batch1301.v1307cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1308: candy mode
internal fun PlayerActivity.showV1308CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1308candy
    FeaturePrefsStore.batch1301.v1308candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1308: canvas mode
internal fun PlayerActivity.showV1308CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1308canvas
    FeaturePrefsStore.batch1301.v1308canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1308: carbon mode
internal fun PlayerActivity.showV1308CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1308carbon
    FeaturePrefsStore.batch1301.v1308carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1308: card mode
internal fun PlayerActivity.showV1308CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1308card
    FeaturePrefsStore.batch1301.v1308card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1308: cargo mode
internal fun PlayerActivity.showV1308CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cargo
    FeaturePrefsStore.batch1301.v1308cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1308: carpet level
internal fun PlayerActivity.showV1308CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1308: carry level
internal fun PlayerActivity.showV1308CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1308: cart level
internal fun PlayerActivity.showV1308CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1308: case level
internal fun PlayerActivity.showV1308CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308case = value
        AppToast.show(this, "case: $value")
    }
}

// v1308: cash level
internal fun PlayerActivity.showV1308CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1308cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1308cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1308: cast mode
internal fun PlayerActivity.showV1308CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cast
    FeaturePrefsStore.batch1301.v1308cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1308: castle mode
internal fun PlayerActivity.showV1308CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1308castle
    FeaturePrefsStore.batch1301.v1308castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1308: catch mode
internal fun PlayerActivity.showV1308CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1308catch
    FeaturePrefsStore.batch1301.v1308catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1308: cause mode
internal fun PlayerActivity.showV1308CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cause
    FeaturePrefsStore.batch1301.v1308cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1308: cave mode
internal fun PlayerActivity.showV1308CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1308cave
    FeaturePrefsStore.batch1301.v1308cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1309: candy mode
internal fun PlayerActivity.showV1309CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1309candy
    FeaturePrefsStore.batch1301.v1309candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1309: canvas mode
internal fun PlayerActivity.showV1309CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1309canvas
    FeaturePrefsStore.batch1301.v1309canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1309: carbon mode
internal fun PlayerActivity.showV1309CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1309carbon
    FeaturePrefsStore.batch1301.v1309carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1309: card mode
internal fun PlayerActivity.showV1309CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1309card
    FeaturePrefsStore.batch1301.v1309card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1309: cargo mode
internal fun PlayerActivity.showV1309CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cargo
    FeaturePrefsStore.batch1301.v1309cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1309: carpet level
internal fun PlayerActivity.showV1309CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1309: carry level
internal fun PlayerActivity.showV1309CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1309: cart level
internal fun PlayerActivity.showV1309CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1309: case level
internal fun PlayerActivity.showV1309CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309case = value
        AppToast.show(this, "case: $value")
    }
}

// v1309: cash level
internal fun PlayerActivity.showV1309CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1309cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1309cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1309: cast mode
internal fun PlayerActivity.showV1309CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cast
    FeaturePrefsStore.batch1301.v1309cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1309: castle mode
internal fun PlayerActivity.showV1309CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1309castle
    FeaturePrefsStore.batch1301.v1309castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1309: catch mode
internal fun PlayerActivity.showV1309CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1309catch
    FeaturePrefsStore.batch1301.v1309catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1309: cause mode
internal fun PlayerActivity.showV1309CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cause
    FeaturePrefsStore.batch1301.v1309cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1309: cave mode
internal fun PlayerActivity.showV1309CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1309cave
    FeaturePrefsStore.batch1301.v1309cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}

// v1310: candy mode
internal fun PlayerActivity.showV1310CandyToggle() {
    val current = FeaturePrefsStore.batch1301.v1310candy
    FeaturePrefsStore.batch1301.v1310candy = !current
    AppToast.show(this, "candy: ${if (!current) "ON" else "OFF"}")
}

// v1310: canvas mode
internal fun PlayerActivity.showV1310CanvasToggle() {
    val current = FeaturePrefsStore.batch1301.v1310canvas
    FeaturePrefsStore.batch1301.v1310canvas = !current
    AppToast.show(this, "canvas: ${if (!current) "ON" else "OFF"}")
}

// v1310: carbon mode
internal fun PlayerActivity.showV1310CarbonToggle() {
    val current = FeaturePrefsStore.batch1301.v1310carbon
    FeaturePrefsStore.batch1301.v1310carbon = !current
    AppToast.show(this, "carbon: ${if (!current) "ON" else "OFF"}")
}

// v1310: card mode
internal fun PlayerActivity.showV1310CardToggle() {
    val current = FeaturePrefsStore.batch1301.v1310card
    FeaturePrefsStore.batch1301.v1310card = !current
    AppToast.show(this, "card: ${if (!current) "ON" else "OFF"}")
}

// v1310: cargo mode
internal fun PlayerActivity.showV1310CargoToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cargo
    FeaturePrefsStore.batch1301.v1310cargo = !current
    AppToast.show(this, "cargo: ${if (!current) "ON" else "OFF"}")
}

// v1310: carpet level
internal fun PlayerActivity.showV1310CarpetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310carpet).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carpet level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310carpet = value
        AppToast.show(this, "carpet: $value")
    }
}

// v1310: carry level
internal fun PlayerActivity.showV1310CarryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310carry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "carry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310carry = value
        AppToast.show(this, "carry: $value")
    }
}

// v1310: cart level
internal fun PlayerActivity.showV1310CartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310cart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cart level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310cart = value
        AppToast.show(this, "cart: $value")
    }
}

// v1310: case level
internal fun PlayerActivity.showV1310CaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310case).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "case level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310case = value
        AppToast.show(this, "case: $value")
    }
}

// v1310: cash level
internal fun PlayerActivity.showV1310CashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1301.v1310cash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1301.v1310cash = value
        AppToast.show(this, "cash: $value")
    }
}

// v1310: cast mode
internal fun PlayerActivity.showV1310CastToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cast
    FeaturePrefsStore.batch1301.v1310cast = !current
    AppToast.show(this, "cast: ${if (!current) "ON" else "OFF"}")
}

// v1310: castle mode
internal fun PlayerActivity.showV1310CastleToggle() {
    val current = FeaturePrefsStore.batch1301.v1310castle
    FeaturePrefsStore.batch1301.v1310castle = !current
    AppToast.show(this, "castle: ${if (!current) "ON" else "OFF"}")
}

// v1310: catch mode
internal fun PlayerActivity.showV1310CatchToggle() {
    val current = FeaturePrefsStore.batch1301.v1310catch
    FeaturePrefsStore.batch1301.v1310catch = !current
    AppToast.show(this, "catch: ${if (!current) "ON" else "OFF"}")
}

// v1310: cause mode
internal fun PlayerActivity.showV1310CauseToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cause
    FeaturePrefsStore.batch1301.v1310cause = !current
    AppToast.show(this, "cause: ${if (!current) "ON" else "OFF"}")
}

// v1310: cave mode
internal fun PlayerActivity.showV1310CaveToggle() {
    val current = FeaturePrefsStore.batch1301.v1310cave
    FeaturePrefsStore.batch1301.v1310cave = !current
    AppToast.show(this, "cave: ${if (!current) "ON" else "OFF"}")
}
