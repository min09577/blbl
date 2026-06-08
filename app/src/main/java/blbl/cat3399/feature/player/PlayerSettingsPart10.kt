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

// v143: Gesture Tap Zone Visual Anim Type
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

// v143: Cast Video PIP Snap Strength
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

// v143: Playlist Auto Group By Resolution
internal fun PlayerActivity.showV143PlaylistAutoGroupByResolutionToggle() {
    val current = BiliClient.prefs.v143playlistAutoGroupByResolution
    BiliClient.prefs.v143playlistAutoGroupByResolution = !current
    AppToast.show(this, "Playlist Auto Group By Resolution: ${if (!current) "ON" else "OFF"}")
}

// v143: Cache Smart Pinning On Schedule Time
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

// v143: Progress Bar Custom Thumb Size143
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

// v143: Volume Normalize Mid Side
internal fun PlayerActivity.showV143VolumeNormalizeMidSideToggle() {
    val current = BiliClient.prefs.v143volumeNormalizeMidSide
    BiliClient.prefs.v143volumeNormalizeMidSide = !current
    AppToast.show(this, "Volume Normalize Mid Side: ${if (!current) "ON" else "OFF"}")
}

// v143: History Auto Clean143
internal fun PlayerActivity.showV143HistoryAutoClean143Toggle() {
    val current = BiliClient.prefs.v143historyAutoClean143
    BiliClient.prefs.v143historyAutoClean143 = !current
    AppToast.show(this, "History Auto Clean143: ${if (!current) "ON" else "OFF"}")
}

// v143: Playback Speed Presets Proximity
internal fun PlayerActivity.showV143PlaybackSpeedPresetsProximityToggle() {
    val current = BiliClient.prefs.v143playbackSpeedPresetsProximity
    BiliClient.prefs.v143playbackSpeedPresetsProximity = !current
    AppToast.show(this, "Playback Speed Presets Proximity: ${if (!current) "ON" else "OFF"}")
}

// v143: Screenshot Auto Share Line
internal fun PlayerActivity.showV143ScreenshotAutoShareLineToggle() {
    val current = BiliClient.prefs.v143screenshotAutoShareLine
    BiliClient.prefs.v143screenshotAutoShareLine = !current
    AppToast.show(this, "Screenshot Auto Share Line: ${if (!current) "ON" else "OFF"}")
}

// v143: Video PIP Follow Color Bit
internal fun PlayerActivity.showV143VideoPIPFollowColorBitToggle() {
    val current = BiliClient.prefs.v143videoPIPFollowColorBit
    BiliClient.prefs.v143videoPIPFollowColorBit = !current
    AppToast.show(this, "Video PIP Follow Color Bit: ${if (!current) "ON" else "OFF"}")
}

// v143: Danmaku Font BG Fill Mask Radius
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

// v143: Subtitle Animation Translate143
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

// v144: Audio Compressor Toggle144
internal fun PlayerActivity.showV144AudioCompressorToggle144Toggle() {
    val current = BiliClient.prefs.v144audioCompressorToggle144
    BiliClient.prefs.v144audioCompressorToggle144 = !current
    AppToast.show(this, "Audio Compressor Toggle144: ${if (!current) "ON" else "OFF"}")
}

// v144: Danmaku Font BG Fill Mask Radius143
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

// v144: Subtitle Animation Translate144
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

// v144: Gesture Tap Zone Visual Anim Scale
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

// v144: Cast Video PIP Snap Offset
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

// v144: Playlist Auto Group By Codec
internal fun PlayerActivity.showV144PlaylistAutoGroupByCodecToggle() {
    val current = BiliClient.prefs.v144playlistAutoGroupByCodec
    BiliClient.prefs.v144playlistAutoGroupByCodec = !current
    AppToast.show(this, "Playlist Auto Group By Codec: ${if (!current) "ON" else "OFF"}")
}

// v144: Cache Smart Pinning On Schedule Day
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

// v144: Progress Bar Custom Thumb Color144
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

// v144: Volume Normalize Multiband
internal fun PlayerActivity.showV144VolumeNormalizeMultibandToggle() {
    val current = BiliClient.prefs.v144volumeNormalizeMultiband
    BiliClient.prefs.v144volumeNormalizeMultiband = !current
    AppToast.show(this, "Volume Normalize Multiband: ${if (!current) "ON" else "OFF"}")
}

// v144: History Auto Clean144
internal fun PlayerActivity.showV144HistoryAutoClean144Toggle() {
    val current = BiliClient.prefs.v144historyAutoClean144
    BiliClient.prefs.v144historyAutoClean144 = !current
    AppToast.show(this, "History Auto Clean144: ${if (!current) "ON" else "OFF"}")
}

// v144: Playback Speed Presets Light Sensor
internal fun PlayerActivity.showV144PlaybackSpeedPresetsLightSensorToggle() {
    val current = BiliClient.prefs.v144playbackSpeedPresetsLightSensor
    BiliClient.prefs.v144playbackSpeedPresetsLightSensor = !current
    AppToast.show(this, "Playback Speed Presets Light Sensor: ${if (!current) "ON" else "OFF"}")
}

// v144: Screenshot Auto Share Instagram
internal fun PlayerActivity.showV144ScreenshotAutoShareInstagramToggle() {
    val current = BiliClient.prefs.v144screenshotAutoShareInstagram
    BiliClient.prefs.v144screenshotAutoShareInstagram = !current
    AppToast.show(this, "Screenshot Auto Share Instagram: ${if (!current) "ON" else "OFF"}")
}

// v144: Video PIP Follow HDR
internal fun PlayerActivity.showV144VideoPIPFollowHDRToggle() {
    val current = BiliClient.prefs.v144videoPIPFollowHDR
    BiliClient.prefs.v144videoPIPFollowHDR = !current
    AppToast.show(this, "Video PIP Follow HDR: ${if (!current) "ON" else "OFF"}")
}

// v144: Danmaku Font BG Fill Mask Radius144
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

// v144: Subtitle Animation Scale144
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

// v145: Audio Compressor Threshold
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

// v145: Danmaku Font BG Fill Mask Radius145
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

// v145: Subtitle Animation Scale145
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

// v145: Gesture Tap Zone Visual Anim Opacity
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

// v145: Cast Video PIP Snap Duration
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

// v145: Playlist Auto Group By Bitrate
internal fun PlayerActivity.showV145PlaylistAutoGroupByBitrateToggle() {
    val current = BiliClient.prefs.v145playlistAutoGroupByBitrate
    BiliClient.prefs.v145playlistAutoGroupByBitrate = !current
    AppToast.show(this, "Playlist Auto Group By Bitrate: ${if (!current) "ON" else "OFF"}")
}

// v145: Cache Smart Pinning On Schedule Hour
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

// v145: Progress Bar Custom Thumb Glow145
internal fun PlayerActivity.showV145ProgressBarCustomThumbGlow145Toggle() {
    val current = BiliClient.prefs.v145progressBarCustomThumbGlow145
    BiliClient.prefs.v145progressBarCustomThumbGlow145 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow145: ${if (!current) "ON" else "OFF"}")
}

// v145: Volume Normalize Auto Gain
internal fun PlayerActivity.showV145VolumeNormalizeAutoGainToggle() {
    val current = BiliClient.prefs.v145volumeNormalizeAutoGain
    BiliClient.prefs.v145volumeNormalizeAutoGain = !current
    AppToast.show(this, "Volume Normalize Auto Gain: ${if (!current) "ON" else "OFF"}")
}

// v145: History Auto Clean145
internal fun PlayerActivity.showV145HistoryAutoClean145Toggle() {
    val current = BiliClient.prefs.v145historyAutoClean145
    BiliClient.prefs.v145historyAutoClean145 = !current
    AppToast.show(this, "History Auto Clean145: ${if (!current) "ON" else "OFF"}")
}

// v145: Playback Speed Presets Gyro Adjust
internal fun PlayerActivity.showV145PlaybackSpeedPresetsGyroAdjustToggle() {
    val current = BiliClient.prefs.v145playbackSpeedPresetsGyroAdjust
    BiliClient.prefs.v145playbackSpeedPresetsGyroAdjust = !current
    AppToast.show(this, "Playback Speed Presets Gyro Adjust: ${if (!current) "ON" else "OFF"}")
}

// v145: Screenshot Auto Share Facebook
internal fun PlayerActivity.showV145ScreenshotAutoShareFacebookToggle() {
    val current = BiliClient.prefs.v145screenshotAutoShareFacebook
    BiliClient.prefs.v145screenshotAutoShareFacebook = !current
    AppToast.show(this, "Screenshot Auto Share Facebook: ${if (!current) "ON" else "OFF"}")
}

// v145: Video PIP Follow HDR10
internal fun PlayerActivity.showV145VideoPIPFollowHDR10Toggle() {
    val current = BiliClient.prefs.v145videoPIPFollowHDR10
    BiliClient.prefs.v145videoPIPFollowHDR10 = !current
    AppToast.show(this, "Video PIP Follow HDR10: ${if (!current) "ON" else "OFF"}")
}

// v145: Danmaku Font BG Fill Mask Type
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

// v145: Subtitle Animation Rotate145
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

// v146: Audio Compressor Ratio
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

// v146: Danmaku Font BG Fill Mask Type145
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

// v146: Subtitle Animation Rotate146
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

// v146: Gesture Tap Zone Visual Anim Color
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

// v146: Cast Video PIP Snap Animation
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

// v146: Playlist Auto Group By Fps
internal fun PlayerActivity.showV146PlaylistAutoGroupByFpsToggle() {
    val current = BiliClient.prefs.v146playlistAutoGroupByFps
    BiliClient.prefs.v146playlistAutoGroupByFps = !current
    AppToast.show(this, "Playlist Auto Group By Fps: ${if (!current) "ON" else "OFF"}")
}

// v146: Cache Smart Pinning On Schedule Minute
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

// v146: Progress Bar Custom Thumb Border146
internal fun PlayerActivity.showV146ProgressBarCustomThumbBorder146Toggle() {
    val current = BiliClient.prefs.v146progressBarCustomThumbBorder146
    BiliClient.prefs.v146progressBarCustomThumbBorder146 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border146: ${if (!current) "ON" else "OFF"}")
}

// v146: Volume Normalize Look Ahead
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

// v146: History Auto Clean146
internal fun PlayerActivity.showV146HistoryAutoClean146Toggle() {
    val current = BiliClient.prefs.v146historyAutoClean146
    BiliClient.prefs.v146historyAutoClean146 = !current
    AppToast.show(this, "History Auto Clean146: ${if (!current) "ON" else "OFF"}")
}

// v146: Playback Speed Presets Accel Adjust
internal fun PlayerActivity.showV146PlaybackSpeedPresetsAccelAdjustToggle() {
    val current = BiliClient.prefs.v146playbackSpeedPresetsAccelAdjust
    BiliClient.prefs.v146playbackSpeedPresetsAccelAdjust = !current
    AppToast.show(this, "Playback Speed Presets Accel Adjust: ${if (!current) "ON" else "OFF"}")
}

// v146: Screenshot Auto Share Twitter
internal fun PlayerActivity.showV146ScreenshotAutoShareTwitterToggle() {
    val current = BiliClient.prefs.v146screenshotAutoShareTwitter
    BiliClient.prefs.v146screenshotAutoShareTwitter = !current
    AppToast.show(this, "Screenshot Auto Share Twitter: ${if (!current) "ON" else "OFF"}")
}

// v146: Video PIP Follow Dolby
internal fun PlayerActivity.showV146VideoPIPFollowDolbyToggle() {
    val current = BiliClient.prefs.v146videoPIPFollowDolby
    BiliClient.prefs.v146videoPIPFollowDolby = !current
    AppToast.show(this, "Video PIP Follow Dolby: ${if (!current) "ON" else "OFF"}")
}

// v146: Danmaku Font BG Fill Mask Type146
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

// v146: Subtitle Animation Blur146
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

// v147: Audio Compressor Attack
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

// v147: Danmaku Font BG Fill Mask Type147
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

// v147: Subtitle Animation Blur147
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

// v147: Gesture Tap Zone Visual Anim Blur
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

// v147: Cast Video PIP Snap Bounce
internal fun PlayerActivity.showV147CastVideoPIPSnapBounceToggle() {
    val current = BiliClient.prefs.v147castVideoPIPSnapBounce
    BiliClient.prefs.v147castVideoPIPSnapBounce = !current
    AppToast.show(this, "Cast Video PIP Snap Bounce: ${if (!current) "ON" else "OFF"}")
}

// v147: Playlist Auto Group By Aspect Ratio
internal fun PlayerActivity.showV147PlaylistAutoGroupByAspectRatioToggle() {
    val current = BiliClient.prefs.v147playlistAutoGroupByAspectRatio
    BiliClient.prefs.v147playlistAutoGroupByAspectRatio = !current
    AppToast.show(this, "Playlist Auto Group By Aspect Ratio: ${if (!current) "ON" else "OFF"}")
}

// v147: Cache Smart Pinning On Schedule Repeat
internal fun PlayerActivity.showV147CacheSmartPinningOnScheduleRepeatToggle() {
    val current = BiliClient.prefs.v147cacheSmartPinningOnScheduleRepeat
    BiliClient.prefs.v147cacheSmartPinningOnScheduleRepeat = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Repeat: ${if (!current) "ON" else "OFF"}")
}

// v147: Progress Bar Custom Thumb Shadow147
internal fun PlayerActivity.showV147ProgressBarCustomThumbShadow147Toggle() {
    val current = BiliClient.prefs.v147progressBarCustomThumbShadow147
    BiliClient.prefs.v147progressBarCustomThumbShadow147 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow147: ${if (!current) "ON" else "OFF"}")
}

// v147: Volume Normalize Release
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

// v147: History Auto Clean147
internal fun PlayerActivity.showV147HistoryAutoClean147Toggle() {
    val current = BiliClient.prefs.v147historyAutoClean147
    BiliClient.prefs.v147historyAutoClean147 = !current
    AppToast.show(this, "History Auto Clean147: ${if (!current) "ON" else "OFF"}")
}

// v147: Playback Speed Presets Voice Control
internal fun PlayerActivity.showV147PlaybackSpeedPresetsVoiceControlToggle() {
    val current = BiliClient.prefs.v147playbackSpeedPresetsVoiceControl
    BiliClient.prefs.v147playbackSpeedPresetsVoiceControl = !current
    AppToast.show(this, "Playback Speed Presets Voice Control: ${if (!current) "ON" else "OFF"}")
}

// v147: Screenshot Auto Share LinkedIn
internal fun PlayerActivity.showV147ScreenshotAutoShareLinkedInToggle() {
    val current = BiliClient.prefs.v147screenshotAutoShareLinkedIn
    BiliClient.prefs.v147screenshotAutoShareLinkedIn = !current
    AppToast.show(this, "Screenshot Auto Share LinkedIn: ${if (!current) "ON" else "OFF"}")
}

// v147: Video PIP Follow Dolby Vision
internal fun PlayerActivity.showV147VideoPIPFollowDolbyVisionToggle() {
    val current = BiliClient.prefs.v147videoPIPFollowDolbyVision
    BiliClient.prefs.v147videoPIPFollowDolbyVision = !current
    AppToast.show(this, "Video PIP Follow Dolby Vision: ${if (!current) "ON" else "OFF"}")
}

// v147: Danmaku Font BG Fill Mask Opacity
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

// v147: Subtitle Animation Fade In147
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

// v148: Audio Compressor Release
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

// v148: Danmaku Font BG Fill Mask Opacity147
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

// v148: Subtitle Animation Fade In148
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

// v148: Gesture Tap Zone Visual Anim Delay
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

// v148: Cast Video PIP Snap Elastic
internal fun PlayerActivity.showV148CastVideoPIPSnapElasticToggle() {
    val current = BiliClient.prefs.v148castVideoPIPSnapElastic
    BiliClient.prefs.v148castVideoPIPSnapElastic = !current
    AppToast.show(this, "Cast Video PIP Snap Elastic: ${if (!current) "ON" else "OFF"}")
}

// v148: Playlist Auto Group By Size
internal fun PlayerActivity.showV148PlaylistAutoGroupBySizeToggle() {
    val current = BiliClient.prefs.v148playlistAutoGroupBySize
    BiliClient.prefs.v148playlistAutoGroupBySize = !current
    AppToast.show(this, "Playlist Auto Group By Size: ${if (!current) "ON" else "OFF"}")
}

// v148: Cache Smart Pinning On Schedule Notify
internal fun PlayerActivity.showV148CacheSmartPinningOnScheduleNotifyToggle() {
    val current = BiliClient.prefs.v148cacheSmartPinningOnScheduleNotify
    BiliClient.prefs.v148cacheSmartPinningOnScheduleNotify = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Notify: ${if (!current) "ON" else "OFF"}")
}

// v148: Progress Bar Custom Thumb Glow148
internal fun PlayerActivity.showV148ProgressBarCustomThumbGlow148Toggle() {
    val current = BiliClient.prefs.v148progressBarCustomThumbGlow148
    BiliClient.prefs.v148progressBarCustomThumbGlow148 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow148: ${if (!current) "ON" else "OFF"}")
}

// v148: Volume Normalize Knee Width
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

// v148: History Auto Clean148
internal fun PlayerActivity.showV148HistoryAutoClean148Toggle() {
    val current = BiliClient.prefs.v148historyAutoClean148
    BiliClient.prefs.v148historyAutoClean148 = !current
    AppToast.show(this, "History Auto Clean148: ${if (!current) "ON" else "OFF"}")
}

// v148: Playback Speed Presets Face Detect
internal fun PlayerActivity.showV148PlaybackSpeedPresetsFaceDetectToggle() {
    val current = BiliClient.prefs.v148playbackSpeedPresetsFaceDetect
    BiliClient.prefs.v148playbackSpeedPresetsFaceDetect = !current
    AppToast.show(this, "Playback Speed Presets Face Detect: ${if (!current) "ON" else "OFF"}")
}

// v148: Screenshot Auto Share Pinterest148
internal fun PlayerActivity.showV148ScreenshotAutoSharePinterest148Toggle() {
    val current = BiliClient.prefs.v148screenshotAutoSharePinterest148
    BiliClient.prefs.v148screenshotAutoSharePinterest148 = !current
    AppToast.show(this, "Screenshot Auto Share Pinterest148: ${if (!current) "ON" else "OFF"}")
}

// v148: Video PIP Follow Atmos
internal fun PlayerActivity.showV148VideoPIPFollowAtmosToggle() {
    val current = BiliClient.prefs.v148videoPIPFollowAtmos
    BiliClient.prefs.v148videoPIPFollowAtmos = !current
    AppToast.show(this, "Video PIP Follow Atmos: ${if (!current) "ON" else "OFF"}")
}

// v148: Danmaku Font BG Fill Mask Opacity148
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

// v148: Subtitle Animation Fade Out148
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

// v149: Audio Compressor Knee
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

// v149: Danmaku Font BG Fill Mask Blend Mode
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

// v149: Subtitle Animation Fade Out149
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

// v149: Gesture Tap Zone Visual Anim Repeat
internal fun PlayerActivity.showV149GestureTapZoneVisualAnimRepeatToggle() {
    val current = BiliClient.prefs.v149gestureTapZoneVisualAnimRepeat
    BiliClient.prefs.v149gestureTapZoneVisualAnimRepeat = !current
    AppToast.show(this, "Gesture Tap Zone Visual Anim Repeat: ${if (!current) "ON" else "OFF"}")
}

// v149: Cast Video PIP Snap Friction
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

// v149: Playlist Auto Group By Length149
internal fun PlayerActivity.showV149PlaylistAutoGroupByLength149Toggle() {
    val current = BiliClient.prefs.v149playlistAutoGroupByLength149
    BiliClient.prefs.v149playlistAutoGroupByLength149 = !current
    AppToast.show(this, "Playlist Auto Group By Length149: ${if (!current) "ON" else "OFF"}")
}

// v149: Cache Smart Pinning On Schedule Log
internal fun PlayerActivity.showV149CacheSmartPinningOnScheduleLogToggle() {
    val current = BiliClient.prefs.v149cacheSmartPinningOnScheduleLog
    BiliClient.prefs.v149cacheSmartPinningOnScheduleLog = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule Log: ${if (!current) "ON" else "OFF"}")
}

// v149: Progress Bar Custom Thumb Border149
internal fun PlayerActivity.showV149ProgressBarCustomThumbBorder149Toggle() {
    val current = BiliClient.prefs.v149progressBarCustomThumbBorder149
    BiliClient.prefs.v149progressBarCustomThumbBorder149 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border149: ${if (!current) "ON" else "OFF"}")
}

// v149: Volume Normalize Link Channels
internal fun PlayerActivity.showV149VolumeNormalizeLinkChannelsToggle() {
    val current = BiliClient.prefs.v149volumeNormalizeLinkChannels
    BiliClient.prefs.v149volumeNormalizeLinkChannels = !current
    AppToast.show(this, "Volume Normalize Link Channels: ${if (!current) "ON" else "OFF"}")
}

// v149: History Auto Clean149
internal fun PlayerActivity.showV149HistoryAutoClean149Toggle() {
    val current = BiliClient.prefs.v149historyAutoClean149
    BiliClient.prefs.v149historyAutoClean149 = !current
    AppToast.show(this, "History Auto Clean149: ${if (!current) "ON" else "OFF"}")
}

// v149: Playback Speed Presets Eye Track
internal fun PlayerActivity.showV149PlaybackSpeedPresetsEyeTrackToggle() {
    val current = BiliClient.prefs.v149playbackSpeedPresetsEyeTrack
    BiliClient.prefs.v149playbackSpeedPresetsEyeTrack = !current
    AppToast.show(this, "Playback Speed Presets Eye Track: ${if (!current) "ON" else "OFF"}")
}

// v149: Screenshot Auto Share VK149
internal fun PlayerActivity.showV149ScreenshotAutoShareVK149Toggle() {
    val current = BiliClient.prefs.v149screenshotAutoShareVK149
    BiliClient.prefs.v149screenshotAutoShareVK149 = !current
    AppToast.show(this, "Screenshot Auto Share VK149: ${if (!current) "ON" else "OFF"}")
}

// v149: Video PIP Follow Spatial
internal fun PlayerActivity.showV149VideoPIPFollowSpatialToggle() {
    val current = BiliClient.prefs.v149videoPIPFollowSpatial
    BiliClient.prefs.v149videoPIPFollowSpatial = !current
    AppToast.show(this, "Video PIP Follow Spatial: ${if (!current) "ON" else "OFF"}")
}

// v149: Danmaku Font BG Fill Mask Blend Mode149
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

// v149: Subtitle Animation Translate149
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

// v150: Audio Limiter Toggle150
internal fun PlayerActivity.showV150AudioLimiterToggle150Toggle() {
    val current = BiliClient.prefs.v150audioLimiterToggle150
    BiliClient.prefs.v150audioLimiterToggle150 = !current
    AppToast.show(this, "Audio Limiter Toggle150: ${if (!current) "ON" else "OFF"}")
}

// v150: Danmaku Font BG Fill Mask Blend Mode150
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

// v150: Subtitle Animation Translate150
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

// v150: Gesture Tap Zone Visual Anim Loop
internal fun PlayerActivity.showV150GestureTapZoneVisualAnimLoopToggle() {
    val current = BiliClient.prefs.v150gestureTapZoneVisualAnimLoop
    BiliClient.prefs.v150gestureTapZoneVisualAnimLoop = !current
    AppToast.show(this, "Gesture Tap Zone Visual Anim Loop: ${if (!current) "ON" else "OFF"}")
}

// v150: Cast Video PIP Snap Tension
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

// v150: Playlist Auto Group By Date150
internal fun PlayerActivity.showV150PlaylistAutoGroupByDate150Toggle() {
    val current = BiliClient.prefs.v150playlistAutoGroupByDate150
    BiliClient.prefs.v150playlistAutoGroupByDate150 = !current
    AppToast.show(this, "Playlist Auto Group By Date150: ${if (!current) "ON" else "OFF"}")
}

// v150: Cache Smart Pinning On Schedule Retry
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

// v150: Progress Bar Custom Thumb Color150
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

// v150: Volume Normalize Bypass
internal fun PlayerActivity.showV150VolumeNormalizeBypassToggle() {
    val current = BiliClient.prefs.v150volumeNormalizeBypass
    BiliClient.prefs.v150volumeNormalizeBypass = !current
    AppToast.show(this, "Volume Normalize Bypass: ${if (!current) "ON" else "OFF"}")
}

// v150: History Auto Clean150
internal fun PlayerActivity.showV150HistoryAutoClean150Toggle() {
    val current = BiliClient.prefs.v150historyAutoClean150
    BiliClient.prefs.v150historyAutoClean150 = !current
    AppToast.show(this, "History Auto Clean150: ${if (!current) "ON" else "OFF"}")
}

// v150: Playback Speed Presets Biometric
internal fun PlayerActivity.showV150PlaybackSpeedPresetsBiometricToggle() {
    val current = BiliClient.prefs.v150playbackSpeedPresetsBiometric
    BiliClient.prefs.v150playbackSpeedPresetsBiometric = !current
    AppToast.show(this, "Playback Speed Presets Biometric: ${if (!current) "ON" else "OFF"}")
}

// v150: Screenshot Auto Share Email
internal fun PlayerActivity.showV150ScreenshotAutoShareEmailToggle() {
    val current = BiliClient.prefs.v150screenshotAutoShareEmail
    BiliClient.prefs.v150screenshotAutoShareEmail = !current
    AppToast.show(this, "Screenshot Auto Share Email: ${if (!current) "ON" else "OFF"}")
}

// v150: Video PIP Follow Immersive
internal fun PlayerActivity.showV150VideoPIPFollowImmersiveToggle() {
    val current = BiliClient.prefs.v150videoPIPFollowImmersive
    BiliClient.prefs.v150videoPIPFollowImmersive = !current
    AppToast.show(this, "Video PIP Follow Immersive: ${if (!current) "ON" else "OFF"}")
}

// v150: Danmaku Font BG Fill Mask Invert
internal fun PlayerActivity.showV150DanmakuFontBgFillMaskInvertToggle() {
    val current = BiliClient.prefs.v150danmakuFontBgFillMaskInvert
    BiliClient.prefs.v150danmakuFontBgFillMaskInvert = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Invert: ${if (!current) "ON" else "OFF"}")
}

// v150: Subtitle Animation Scale150
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

// v151: Audio Limiter Threshold
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

// v151: Danmaku Font BG Fill Mask Invert151
internal fun PlayerActivity.showV151DanmakuFontBgFillMaskInvert151Toggle() {
    val current = BiliClient.prefs.v151danmakuFontBgFillMaskInvert151
    BiliClient.prefs.v151danmakuFontBgFillMaskInvert151 = !current
    AppToast.show(this, "Danmaku Font BG Fill Mask Invert151: ${if (!current) "ON" else "OFF"}")
}

// v151: Subtitle Animation Scale151
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

// v151: Gesture Tap Zone Visual Anim Speed
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

// v151: Cast Video PIP Snap Damping
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

// v151: Playlist Auto Group By Uploader
internal fun PlayerActivity.showV151PlaylistAutoGroupByUploaderToggle() {
    val current = BiliClient.prefs.v151playlistAutoGroupByUploader
    BiliClient.prefs.v151playlistAutoGroupByUploader = !current
    AppToast.show(this, "Playlist Auto Group By Uploader: ${if (!current) "ON" else "OFF"}")
}

// v151: Cache Smart Pinning On Schedule Start
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

// v151: Progress Bar Custom Thumb Color151
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

// v151: Volume Limiter Toggle151
internal fun PlayerActivity.showV151VolumeLimiterToggle151Toggle() {
    val current = BiliClient.prefs.v151volumeLimiterToggle151
    BiliClient.prefs.v151volumeLimiterToggle151 = !current
    AppToast.show(this, "Volume Limiter Toggle151: ${if (!current) "ON" else "OFF"}")
}

// v151: History Auto Clean151
internal fun PlayerActivity.showV151HistoryAutoClean151Toggle() {
    val current = BiliClient.prefs.v151historyAutoClean151
    BiliClient.prefs.v151historyAutoClean151 = !current
    AppToast.show(this, "History Auto Clean151: ${if (!current) "ON" else "OFF"}")
}

// v151: Playback Speed Presets Head Track
internal fun PlayerActivity.showV151PlaybackSpeedPresetsHeadTrackToggle() {
    val current = BiliClient.prefs.v151playbackSpeedPresetsHeadTrack
    BiliClient.prefs.v151playbackSpeedPresetsHeadTrack = !current
    AppToast.show(this, "Playback Speed Presets Head Track: ${if (!current) "ON" else "OFF"}")
}

// v151: Screenshot Auto Share Teams151
internal fun PlayerActivity.showV151ScreenshotAutoShareTeams151Toggle() {
    val current = BiliClient.prefs.v151screenshotAutoShareTeams151
    BiliClient.prefs.v151screenshotAutoShareTeams151 = !current
    AppToast.show(this, "Screenshot Auto Share Teams151: ${if (!current) "ON" else "OFF"}")
}

// v151: Video PIP Follow Dolby Atmos
internal fun PlayerActivity.showV151VideoPIPFollowDolbyAtmosToggle() {
    val current = BiliClient.prefs.v151videoPIPFollowDolbyAtmos
    BiliClient.prefs.v151videoPIPFollowDolbyAtmos = !current
    AppToast.show(this, "Video PIP Follow Dolby Atmos: ${if (!current) "ON" else "OFF"}")
}

// v151: Danmaku Font BG Fill Gradient Toggle
internal fun PlayerActivity.showV151DanmakuFontBgFillGradientToggleToggle() {
    val current = BiliClient.prefs.v151danmakuFontBgFillGradientToggle
    BiliClient.prefs.v151danmakuFontBgFillGradientToggle = !current
    AppToast.show(this, "Danmaku Font BG Fill Gradient Toggle: ${if (!current) "ON" else "OFF"}")
}

// v151: Subtitle Animation Blur151
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

// v152: Audio Limiter Release151
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

// v152: Danmaku Font BG Fill Gradient Start
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

// v152: Subtitle Animation Blur152
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

// v152: Gesture Tap Zone Visual Anim Curve
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

// v152: Cast Video PIP Snap Stiffness
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

// v152: Playlist Auto Group By Uploader152
internal fun PlayerActivity.showV152PlaylistAutoGroupByUploader152Toggle() {
    val current = BiliClient.prefs.v152playlistAutoGroupByUploader152
    BiliClient.prefs.v152playlistAutoGroupByUploader152 = !current
    AppToast.show(this, "Playlist Auto Group By Uploader152: ${if (!current) "ON" else "OFF"}")
}

// v152: Cache Smart Pinning On Schedule End
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

// v152: Progress Bar Custom Thumb Glow152
internal fun PlayerActivity.showV152ProgressBarCustomThumbGlow152Toggle() {
    val current = BiliClient.prefs.v152progressBarCustomThumbGlow152
    BiliClient.prefs.v152progressBarCustomThumbGlow152 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow152: ${if (!current) "ON" else "OFF"}")
}

// v152: Volume Limiter Threshold152
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

// v152: History Auto Clean152
internal fun PlayerActivity.showV152HistoryAutoClean152Toggle() {
    val current = BiliClient.prefs.v152historyAutoClean152
    BiliClient.prefs.v152historyAutoClean152 = !current
    AppToast.show(this, "History Auto Clean152: ${if (!current) "ON" else "OFF"}")
}

// v152: Playback Speed Presets Head Track152
internal fun PlayerActivity.showV152PlaybackSpeedPresetsHeadTrack152Toggle() {
    val current = BiliClient.prefs.v152playbackSpeedPresetsHeadTrack152
    BiliClient.prefs.v152playbackSpeedPresetsHeadTrack152 = !current
    AppToast.show(this, "Playback Speed Presets Head Track152: ${if (!current) "ON" else "OFF"}")
}

// v152: Screenshot Auto Share Email152
internal fun PlayerActivity.showV152ScreenshotAutoShareEmail152Toggle() {
    val current = BiliClient.prefs.v152screenshotAutoShareEmail152
    BiliClient.prefs.v152screenshotAutoShareEmail152 = !current
    AppToast.show(this, "Screenshot Auto Share Email152: ${if (!current) "ON" else "OFF"}")
}

// v152: Video PIP Follow Dolby Atmos152
internal fun PlayerActivity.showV152VideoPIPFollowDolbyAtmos152Toggle() {
    val current = BiliClient.prefs.v152videoPIPFollowDolbyAtmos152
    BiliClient.prefs.v152videoPIPFollowDolbyAtmos152 = !current
    AppToast.show(this, "Video PIP Follow Dolby Atmos152: ${if (!current) "ON" else "OFF"}")
}

// v152: Danmaku Font BG Fill Gradient End
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

// v152: Subtitle Animation Fade In152
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

// v153: Audio Limiter Gain152
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

// v153: Danmaku Font BG Fill Gradient Angle
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

// v153: Subtitle Animation Fade In153
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

// v153: Gesture Tap Zone Visual Anim Direction
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

// v153: Cast Video PIP Snap Mass
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

// v153: Playlist Auto Group By Category
internal fun PlayerActivity.showV153PlaylistAutoGroupByCategoryToggle() {
    val current = BiliClient.prefs.v153playlistAutoGroupByCategory
    BiliClient.prefs.v153playlistAutoGroupByCategory = !current
    AppToast.show(this, "Playlist Auto Group By Category: ${if (!current) "ON" else "OFF"}")
}

// v153: Cache Smart Pinning On Schedule Weekday
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

// v153: Progress Bar Custom Thumb Border153
internal fun PlayerActivity.showV153ProgressBarCustomThumbBorder153Toggle() {
    val current = BiliClient.prefs.v153progressBarCustomThumbBorder153
    BiliClient.prefs.v153progressBarCustomThumbBorder153 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border153: ${if (!current) "ON" else "OFF"}")
}

// v153: Volume Limiter Release153
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

// v153: History Auto Clean153
internal fun PlayerActivity.showV153HistoryAutoClean153Toggle() {
    val current = BiliClient.prefs.v153historyAutoClean153
    BiliClient.prefs.v153historyAutoClean153 = !current
    AppToast.show(this, "History Auto Clean153: ${if (!current) "ON" else "OFF"}")
}

// v153: Playback Speed Presets Hand Gesture
internal fun PlayerActivity.showV153PlaybackSpeedPresetsHandGestureToggle() {
    val current = BiliClient.prefs.v153playbackSpeedPresetsHandGesture
    BiliClient.prefs.v153playbackSpeedPresetsHandGesture = !current
    AppToast.show(this, "Playback Speed Presets Hand Gesture: ${if (!current) "ON" else "OFF"}")
}

// v153: Screenshot Auto Share WeChat153
internal fun PlayerActivity.showV153ScreenshotAutoShareWeChat153Toggle() {
    val current = BiliClient.prefs.v153screenshotAutoShareWeChat153
    BiliClient.prefs.v153screenshotAutoShareWeChat153 = !current
    AppToast.show(this, "Screenshot Auto Share WeChat153: ${if (!current) "ON" else "OFF"}")
}

// v153: Video PIP Follow Dolby Atmos153
internal fun PlayerActivity.showV153VideoPIPFollowDolbyAtmos153Toggle() {
    val current = BiliClient.prefs.v153videoPIPFollowDolbyAtmos153
    BiliClient.prefs.v153videoPIPFollowDolbyAtmos153 = !current
    AppToast.show(this, "Video PIP Follow Dolby Atmos153: ${if (!current) "ON" else "OFF"}")
}

// v153: Danmaku Font BG Fill Gradient Type
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

// v153: Subtitle Animation Fade Out153
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

// v154: Audio Dynamic EQ Toggle154
internal fun PlayerActivity.showV154AudioDynamicEQToggle154Toggle() {
    val current = BiliClient.prefs.v154audioDynamicEQToggle154
    BiliClient.prefs.v154audioDynamicEQToggle154 = !current
    AppToast.show(this, "Audio Dynamic EQ Toggle154: ${if (!current) "ON" else "OFF"}")
}

// v154: Danmaku Font BG Fill Gradient Type153
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

// v154: Subtitle Animation Fade Out154
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

// v154: Gesture Tap Zone Visual Anim Opacity154
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

// v154: Cast Video PIP Snap Velocity
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

// v154: Playlist Auto Group By Category154
internal fun PlayerActivity.showV154PlaylistAutoGroupByCategory154Toggle() {
    val current = BiliClient.prefs.v154playlistAutoGroupByCategory154
    BiliClient.prefs.v154playlistAutoGroupByCategory154 = !current
    AppToast.show(this, "Playlist Auto Group By Category154: ${if (!current) "ON" else "OFF"}")
}

// v154: Cache Smart Pinning On Schedule Monthday
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

// v154: Progress Bar Custom Thumb Shadow154
internal fun PlayerActivity.showV154ProgressBarCustomThumbShadow154Toggle() {
    val current = BiliClient.prefs.v154progressBarCustomThumbShadow154
    BiliClient.prefs.v154progressBarCustomThumbShadow154 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow154: ${if (!current) "ON" else "OFF"}")
}

// v154: Volume Limiter Gain154
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

// v154: History Auto Clean154
internal fun PlayerActivity.showV154HistoryAutoClean154Toggle() {
    val current = BiliClient.prefs.v154historyAutoClean154
    BiliClient.prefs.v154historyAutoClean154 = !current
    AppToast.show(this, "History Auto Clean154: ${if (!current) "ON" else "OFF"}")
}

// v154: Playback Speed Presets Hand Gesture154
internal fun PlayerActivity.showV154PlaybackSpeedPresetsHandGesture154Toggle() {
    val current = BiliClient.prefs.v154playbackSpeedPresetsHandGesture154
    BiliClient.prefs.v154playbackSpeedPresetsHandGesture154 = !current
    AppToast.show(this, "Playback Speed Presets Hand Gesture154: ${if (!current) "ON" else "OFF"}")
}

// v154: Screenshot Auto Share QQ154
internal fun PlayerActivity.showV154ScreenshotAutoShareQQ154Toggle() {
    val current = BiliClient.prefs.v154screenshotAutoShareQQ154
    BiliClient.prefs.v154screenshotAutoShareQQ154 = !current
    AppToast.show(this, "Screenshot Auto Share QQ154: ${if (!current) "ON" else "OFF"}")
}

// v154: Video PIP Follow Spatial Audio
internal fun PlayerActivity.showV154VideoPIPFollowSpatialAudioToggle() {
    val current = BiliClient.prefs.v154videoPIPFollowSpatialAudio
    BiliClient.prefs.v154videoPIPFollowSpatialAudio = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio: ${if (!current) "ON" else "OFF"}")
}

// v154: Danmaku Font BG Fill Gradient Type154
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

// v154: Subtitle Animation Translate154
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

// v155: Audio Dynamic EQ Band
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

// v155: Danmaku Font BG Fill Gradient Type155
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

// v155: Subtitle Animation Translate155
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

// v155: Gesture Tap Zone Visual Anim Blur155
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

// v155: Cast Video PIP Snap Gravity
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

// v155: Playlist Auto Group By Uploader155
internal fun PlayerActivity.showV155PlaylistAutoGroupByUploader155Toggle() {
    val current = BiliClient.prefs.v155playlistAutoGroupByUploader155
    BiliClient.prefs.v155playlistAutoGroupByUploader155 = !current
    AppToast.show(this, "Playlist Auto Group By Uploader155: ${if (!current) "ON" else "OFF"}")
}

// v155: Cache Smart Pinning On Schedule Action
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

// v155: Progress Bar Custom Thumb Glow155
internal fun PlayerActivity.showV155ProgressBarCustomThumbGlow155Toggle() {
    val current = BiliClient.prefs.v155progressBarCustomThumbGlow155
    BiliClient.prefs.v155progressBarCustomThumbGlow155 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow155: ${if (!current) "ON" else "OFF"}")
}

// v155: Volume Limiter Stereo
internal fun PlayerActivity.showV155VolumeLimiterStereoToggle() {
    val current = BiliClient.prefs.v155volumeLimiterStereo
    BiliClient.prefs.v155volumeLimiterStereo = !current
    AppToast.show(this, "Volume Limiter Stereo: ${if (!current) "ON" else "OFF"}")
}

// v155: History Auto Clean155
internal fun PlayerActivity.showV155HistoryAutoClean155Toggle() {
    val current = BiliClient.prefs.v155historyAutoClean155
    BiliClient.prefs.v155historyAutoClean155 = !current
    AppToast.show(this, "History Auto Clean155: ${if (!current) "ON" else "OFF"}")
}

// v155: Playback Speed Presets Face Track
internal fun PlayerActivity.showV155PlaybackSpeedPresetsFaceTrackToggle() {
    val current = BiliClient.prefs.v155playbackSpeedPresetsFaceTrack
    BiliClient.prefs.v155playbackSpeedPresetsFaceTrack = !current
    AppToast.show(this, "Playback Speed Presets Face Track: ${if (!current) "ON" else "OFF"}")
}

// v155: Screenshot Auto Share Douyin155
internal fun PlayerActivity.showV155ScreenshotAutoShareDouyin155Toggle() {
    val current = BiliClient.prefs.v155screenshotAutoShareDouyin155
    BiliClient.prefs.v155screenshotAutoShareDouyin155 = !current
    AppToast.show(this, "Screenshot Auto Share Douyin155: ${if (!current) "ON" else "OFF"}")
}

// v155: Video PIP Follow Spatial Audio155
internal fun PlayerActivity.showV155VideoPIPFollowSpatialAudio155Toggle() {
    val current = BiliClient.prefs.v155videoPIPFollowSpatialAudio155
    BiliClient.prefs.v155videoPIPFollowSpatialAudio155 = !current
    AppToast.show(this, "Video PIP Follow Spatial Audio155: ${if (!current) "ON" else "OFF"}")
}

// v155: Danmaku Font BG Fill Gradient Stops
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

// v155: Subtitle Animation Scale155
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

// v156: Audio Dynamic EQ Freq
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

// v156: Danmaku Font BG Fill Gradient Stops155
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

// v156: Subtitle Animation Scale156
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

// v156: Gesture Tap Zone Visual Anim Color156
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

// v156: Cast Video PIP Snap Mode
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

// v156: Playlist Auto Group By Tag
internal fun PlayerActivity.showV156PlaylistAutoGroupByTagToggle() {
    val current = BiliClient.prefs.v156playlistAutoGroupByTag
    BiliClient.prefs.v156playlistAutoGroupByTag = !current
    AppToast.show(this, "Playlist Auto Group By Tag: ${if (!current) "ON" else "OFF"}")
}

// v156: Cache Smart Pinning On Schedule Condition
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

// v156: Progress Bar Custom Thumb Border156
internal fun PlayerActivity.showV156ProgressBarCustomThumbBorder156Toggle() {
    val current = BiliClient.prefs.v156progressBarCustomThumbBorder156
    BiliClient.prefs.v156progressBarCustomThumbBorder156 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border156: ${if (!current) "ON" else "OFF"}")
}

