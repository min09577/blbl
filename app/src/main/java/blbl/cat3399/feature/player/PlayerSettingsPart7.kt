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

internal fun PlayerActivity.showV108CacheProxyModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108cacheProxyModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Proxy Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108cacheProxyModeCustom = value
        AppToast.show(this, "Cache Proxy Mode Custom: $value")
    }
}

internal fun PlayerActivity.showV108ProgressBarCustomOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v108progressBarCustomOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108progressBarCustomOpacity = value
        AppToast.show(this, "Progress Bar Custom Opacity: $value")
    }
}

internal fun PlayerActivity.showV108VolumeSpeakerPhoneToggleToggle() {
    val enabled = !BiliClient.prefs.v108volumeSpeakerPhoneToggle
    BiliClient.prefs.v108volumeSpeakerPhoneToggle = enabled
    AppToast.show(this, "Volume Speaker Phone Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV108HistoryFilterByDateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108historyFilterByDate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Date",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108historyFilterByDate = value
        AppToast.show(this, "History Filter By Date: $value")
    }
}

internal fun PlayerActivity.showV108PlaybackABLoopTempoSyncToggle() {
    val enabled = !BiliClient.prefs.v108playbackABLoopTempoSync
    BiliClient.prefs.v108playbackABLoopTempoSync = enabled
    AppToast.show(this, "Playback AB Loop Tempo Sync: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV108ScreenshotAlbumAutoCreateToggle() {
    val enabled = !BiliClient.prefs.v108screenshotAlbumAutoCreate
    BiliClient.prefs.v108screenshotAlbumAutoCreate = enabled
    AppToast.show(this, "Screenshot Album Auto Create: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV108VideoZoomCustomDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v108videoZoomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Zoom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108videoZoomCustom = value
        AppToast.show(this, "Video Zoom Custom: $value")
    }
}

internal fun PlayerActivity.showV108DanmakuFontBgGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108danmakuFontBgGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Gradient Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108danmakuFontBgGradientType = value
        AppToast.show(this, "Danmaku Font BG Gradient Type: $value")
    }
}

internal fun PlayerActivity.showV108SubtitleFontBoldToggle108Toggle() {
    val enabled = !BiliClient.prefs.v108subtitleFontBoldToggle108
    BiliClient.prefs.v108subtitleFontBoldToggle108 = enabled
    AppToast.show(this, "Subtitle Font Bold Toggle108: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109AudioCompressorReleaseTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109audioCompressorReleaseTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109audioCompressorReleaseTime = value
        AppToast.show(this, "Audio Compressor Release Time: $value")
    }
}

internal fun PlayerActivity.showV109DanmakuFontBgGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v109danmakuFontBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109danmakuFontBgGradientAngle = value
        AppToast.show(this, "Danmaku Font BG Gradient Angle: $value")
    }
}

internal fun PlayerActivity.showV109SubtitleFontItalicToggle109Toggle() {
    val enabled = !BiliClient.prefs.v109subtitleFontItalicToggle109
    BiliClient.prefs.v109subtitleFontItalicToggle109 = enabled
    AppToast.show(this, "Subtitle Font Italic Toggle109: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109GestureQuickScreenshotToggle() {
    val enabled = !BiliClient.prefs.v109gestureQuickScreenshot
    BiliClient.prefs.v109gestureQuickScreenshot = enabled
    AppToast.show(this, "Gesture Quick Screenshot: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109CastVideoHardwareDecodingToggle() {
    val enabled = !BiliClient.prefs.v109castVideoHardwareDecoding
    BiliClient.prefs.v109castVideoHardwareDecoding = enabled
    AppToast.show(this, "Cast Video Hardware Decoding: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109PlaylistAutoSortByRatingToggle() {
    val enabled = !BiliClient.prefs.v109playlistAutoSortByRating
    BiliClient.prefs.v109playlistAutoSortByRating = enabled
    AppToast.show(this, "Playlist Auto Sort By Rating: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109CacheCleanOnAppExitToggle() {
    val enabled = !BiliClient.prefs.v109cacheCleanOnAppExit
    BiliClient.prefs.v109cacheCleanOnAppExit = enabled
    AppToast.show(this, "Cache Clean On App Exit: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109ProgressBarCustomThumbDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109progressBarCustomThumbDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109progressBarCustomThumbDelay = value
        AppToast.show(this, "Progress Bar Custom Thumb Delay: $value")
    }
}

internal fun PlayerActivity.showV109VolumeAudioFocusPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109volumeAudioFocusPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Audio Focus Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109volumeAudioFocusPriority = value
        AppToast.show(this, "Volume Audio Focus Priority: $value")
    }
}

internal fun PlayerActivity.showV109HistoryFilterByUpDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109historyFilterByUp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Up",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109historyFilterByUp = value
        AppToast.show(this, "History Filter By Up: $value")
    }
}

internal fun PlayerActivity.showV109PlaybackABLoopPresetToggleToggle() {
    val enabled = !BiliClient.prefs.v109playbackABLoopPresetToggle
    BiliClient.prefs.v109playbackABLoopPresetToggle = enabled
    AppToast.show(this, "Playback AB Loop Preset Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV109ScreenshotCropAutoRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109screenshotCropAutoRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Auto Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109screenshotCropAutoRatio = value
        AppToast.show(this, "Screenshot Crop Auto Ratio: $value")
    }
}

internal fun PlayerActivity.showV109VideoBlurBackgroundCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v109videoBlurBackgroundCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Blur Background Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109videoBlurBackgroundCustom = value
        AppToast.show(this, "Video Blur Background Custom: $value")
    }
}

internal fun PlayerActivity.showV109DanmakuFontBgGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v109danmakuFontBgGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Gradient Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109danmakuFontBgGradientOpacity = value
        AppToast.show(this, "Danmaku Font BG Gradient Opacity: $value")
    }
}

internal fun PlayerActivity.showV109SubtitleFontUnderline109Toggle() {
    val enabled = !BiliClient.prefs.v109subtitleFontUnderline109
    BiliClient.prefs.v109subtitleFontUnderline109 = enabled
    AppToast.show(this, "Subtitle Font Underline109: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110AudioLimiterThresholdDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v110audioLimiterThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Limiter Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110audioLimiterThreshold = value
        AppToast.show(this, "Audio Limiter Threshold: $value")
    }
}

internal fun PlayerActivity.showV110DanmakuFontTextureBlendModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110danmakuFontTextureBlendMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Blend Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110danmakuFontTextureBlendMode = value
        AppToast.show(this, "Danmaku Font Texture Blend Mode: $value")
    }
}

internal fun PlayerActivity.showV110SubtitleFontStrikeThrough110Toggle() {
    val enabled = !BiliClient.prefs.v110subtitleFontStrikeThrough110
    BiliClient.prefs.v110subtitleFontStrikeThrough110 = enabled
    AppToast.show(this, "Subtitle Font Strike Through110: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110GestureQuickSpeedToggleToggle() {
    val enabled = !BiliClient.prefs.v110gestureQuickSpeedToggle
    BiliClient.prefs.v110gestureQuickSpeedToggle = enabled
    AppToast.show(this, "Gesture Quick Speed Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110CastVideoSoftwareDecodingToggle() {
    val enabled = !BiliClient.prefs.v110castVideoSoftwareDecoding
    BiliClient.prefs.v110castVideoSoftwareDecoding = enabled
    AppToast.show(this, "Cast Video Software Decoding: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110PlaylistAutoSortByBilingualToggle() {
    val enabled = !BiliClient.prefs.v110playlistAutoSortByBilingual
    BiliClient.prefs.v110playlistAutoSortByBilingual = enabled
    AppToast.show(this, "Playlist Auto Sort By Bilingual: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110CacheCleanOnLowBatteryToggle() {
    val enabled = !BiliClient.prefs.v110cacheCleanOnLowBattery
    BiliClient.prefs.v110cacheCleanOnLowBattery = enabled
    AppToast.show(this, "Cache Clean On Low Battery: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110ProgressBarCustomThumbScaleDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v110progressBarCustomThumbScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110progressBarCustomThumbScale = value
        AppToast.show(this, "Progress Bar Custom Thumb Scale: $value")
    }
}

internal fun PlayerActivity.showV110VolumeAudioFocusDuckToggle() {
    val enabled = !BiliClient.prefs.v110volumeAudioFocusDuck
    BiliClient.prefs.v110volumeAudioFocusDuck = enabled
    AppToast.show(this, "Volume Audio Focus Duck: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110HistoryFilterBySeasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110historyFilterBySeason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Season",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110historyFilterBySeason = value
        AppToast.show(this, "History Filter By Season: $value")
    }
}

internal fun PlayerActivity.showV110PlaybackABLoopExportWavToggle() {
    val enabled = !BiliClient.prefs.v110playbackABLoopExportWav
    BiliClient.prefs.v110playbackABLoopExportWav = enabled
    AppToast.show(this, "Playback AB Loop Export Wav: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV110ScreenshotDelayTimerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110screenshotDelayTimer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Delay Timer",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110screenshotDelayTimer = value
        AppToast.show(this, "Screenshot Delay Timer: $value")
    }
}

internal fun PlayerActivity.showV110VideoAmbientLightCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v110videoAmbientLightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Ambient Light Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110videoAmbientLightCustom = value
        AppToast.show(this, "Video Ambient Light Custom: $value")
    }
}

internal fun PlayerActivity.showV110DanmakuFontTexturePatternCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110danmakuFontTexturePatternCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Pattern Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110danmakuFontTexturePatternCustom = value
        AppToast.show(this, "Danmaku Font Texture Pattern Custom: $value")
    }
}

internal fun PlayerActivity.showV110SubtitleFontCaseOverride110Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110subtitleFontCaseOverride110).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Case Override110",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110subtitleFontCaseOverride110 = value
        AppToast.show(this, "Subtitle Font Case Override110: $value")
    }
}

internal fun PlayerActivity.showV111AudioDelaySyncCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111audioDelaySyncCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Sync Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111audioDelaySyncCustom = value
        AppToast.show(this, "Audio Delay Sync Custom: $value")
    }
}

internal fun PlayerActivity.showV111DanmakuFontBlurToggle111Toggle() {
    val enabled = !BiliClient.prefs.v111danmakuFontBlurToggle111
    BiliClient.prefs.v111danmakuFontBlurToggle111 = enabled
    AppToast.show(this, "Danmaku Font Blur Toggle111: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV111SubtitleBgShadowSizeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v111subtitleBgShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Shadow Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111subtitleBgShadowSize = value
        AppToast.show(this, "Subtitle BG Shadow Size: $value")
    }
}

internal fun PlayerActivity.showV111GestureTapSeekStepDialog() {
    val options = listOf(3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v111gestureTapSeekStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Seek Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111gestureTapSeekStep = value
        AppToast.show(this, "Gesture Tap Seek Step: $value")
    }
}

internal fun PlayerActivity.showV111CastVideoSaturationCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v111castVideoSaturationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Saturation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111castVideoSaturationCustom = value
        AppToast.show(this, "Cast Video Saturation Custom: $value")
    }
}

internal fun PlayerActivity.showV111PlaylistAutoShuffleOnRepeatToggle() {
    val enabled = !BiliClient.prefs.v111playlistAutoShuffleOnRepeat
    BiliClient.prefs.v111playlistAutoShuffleOnRepeat = enabled
    AppToast.show(this, "Playlist Auto Shuffle On Repeat: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV111CacheDownloadBandwidthLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111cacheDownloadBandwidthLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Bandwidth Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111cacheDownloadBandwidthLimit = value
        AppToast.show(this, "Cache Download Bandwidth Limit: $value")
    }
}

internal fun PlayerActivity.showV111ProgressBarCustomBufferColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111progressBarCustomBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Buffer Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111progressBarCustomBufferColor = value
        AppToast.show(this, "Progress Bar Custom Buffer Color: $value")
    }
}

internal fun PlayerActivity.showV111VolumeLoudnessTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111volumeLoudnessTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Loudness Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111volumeLoudnessTarget = value
        AppToast.show(this, "Volume Loudness Target: $value")
    }
}

internal fun PlayerActivity.showV111HistoryAutoBackupToggle111Toggle() {
    val enabled = !BiliClient.prefs.v111historyAutoBackupToggle111
    BiliClient.prefs.v111historyAutoBackupToggle111 = enabled
    AppToast.show(this, "History Auto Backup Toggle111: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV111PlaybackSpeedAutoAdjustToggle() {
    val enabled = !BiliClient.prefs.v111playbackSpeedAutoAdjust
    BiliClient.prefs.v111playbackSpeedAutoAdjust = enabled
    AppToast.show(this, "Playback Speed Auto Adjust: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV111ScreenshotAutoShareWeiboToggle() {
    val enabled = !BiliClient.prefs.v111screenshotAutoShareWeibo
    BiliClient.prefs.v111screenshotAutoShareWeibo = enabled
    AppToast.show(this, "Screenshot Auto Share Weibo: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV111VideoBlendModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111videoBlendModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Blend Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111videoBlendModeCustom = value
        AppToast.show(this, "Video Blend Mode Custom: $value")
    }
}

internal fun PlayerActivity.showV111DanmakuFontDropShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v111danmakuFontDropShadowToggle
    BiliClient.prefs.v111danmakuFontDropShadowToggle = enabled
    AppToast.show(this, "Danmaku Font Drop Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV111SubtitleBgBorderColorAutoToggle() {
    val enabled = !BiliClient.prefs.v111subtitleBgBorderColorAuto
    BiliClient.prefs.v111subtitleBgBorderColorAuto = enabled
    AppToast.show(this, "Subtitle BG Border Color Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV112AudioCrossfeedToggle112Toggle() {
    val enabled = !BiliClient.prefs.v112audioCrossfeedToggle112
    BiliClient.prefs.v112audioCrossfeedToggle112 = enabled
    AppToast.show(this, "Audio Crossfeed Toggle112: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV112DanmakuFontDropShadowXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v112danmakuFontDropShadowX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112danmakuFontDropShadowX = value
        AppToast.show(this, "Danmaku Font Drop Shadow X: $value")
    }
}

internal fun PlayerActivity.showV112SubtitleBgBorderColorContrastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112subtitleBgBorderColorContrast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Contrast",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112subtitleBgBorderColorContrast = value
        AppToast.show(this, "Subtitle BG Border Color Contrast: $value")
    }
}

internal fun PlayerActivity.showV112GestureTapVolumeStepDialog() {
    val options = listOf(3, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v112gestureTapVolumeStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Volume Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112gestureTapVolumeStep = value
        AppToast.show(this, "Gesture Tap Volume Step: $value")
    }
}

internal fun PlayerActivity.showV112CastVideoContrastCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v112castVideoContrastCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Contrast Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112castVideoContrastCustom = value
        AppToast.show(this, "Cast Video Contrast Custom: $value")
    }
}

internal fun PlayerActivity.showV112PlaylistAutoNextOnWifiToggle() {
    val enabled = !BiliClient.prefs.v112playlistAutoNextOnWifi
    BiliClient.prefs.v112playlistAutoNextOnWifi = enabled
    AppToast.show(this, "Playlist Auto Next On Wifi: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV112CacheSmartPrefetchToggle112Toggle() {
    val enabled = !BiliClient.prefs.v112cacheSmartPrefetchToggle112
    BiliClient.prefs.v112cacheSmartPrefetchToggle112 = enabled
    AppToast.show(this, "Cache Smart Prefetch Toggle112: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV112ProgressBarCustomChapterStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112progressBarCustomChapterStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Chapter Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112progressBarCustomChapterStyle = value
        AppToast.show(this, "Progress Bar Custom Chapter Style: $value")
    }
}

internal fun PlayerActivity.showV112VolumeDynamicRangeControlToggle() {
    val enabled = !BiliClient.prefs.v112volumeDynamicRangeControl
    BiliClient.prefs.v112volumeDynamicRangeControl = enabled
    AppToast.show(this, "Volume Dynamic Range Control: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV112HistoryAutoBackupIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112historyAutoBackupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112historyAutoBackupInterval = value
        AppToast.show(this, "History Auto Backup Interval: $value")
    }
}

internal fun PlayerActivity.showV112PlaybackSpeedAutoAdjustRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112playbackSpeedAutoAdjustRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Auto Adjust Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112playbackSpeedAutoAdjustRange = value
        AppToast.show(this, "Playback Speed Auto Adjust Range: $value")
    }
}

internal fun PlayerActivity.showV112ScreenshotAutoShareTwitterToggle() {
    val enabled = !BiliClient.prefs.v112screenshotAutoShareTwitter
    BiliClient.prefs.v112screenshotAutoShareTwitter = enabled
    AppToast.show(this, "Screenshot Auto Share Twitter: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV112VideoColorLUTCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112videoColorLUTCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color LUT Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112videoColorLUTCustom = value
        AppToast.show(this, "Video Color LUT Custom: $value")
    }
}

internal fun PlayerActivity.showV112DanmakuFontDropShadowYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v112danmakuFontDropShadowY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112danmakuFontDropShadowY = value
        AppToast.show(this, "Danmaku Font Drop Shadow Y: $value")
    }
}

internal fun PlayerActivity.showV112SubtitleBgBorderColorAutoThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v112subtitleBgBorderColorAutoThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Auto Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112subtitleBgBorderColorAutoThreshold = value
        AppToast.show(this, "Subtitle BG Border Color Auto Threshold: $value")
    }
}

internal fun PlayerActivity.showV113AudioCrossfeedStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v113audioCrossfeedStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Crossfeed Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113audioCrossfeedStrength = value
        AppToast.show(this, "Audio Crossfeed Strength: $value")
    }
}

internal fun PlayerActivity.showV113DanmakuFontDropShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v113danmakuFontDropShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113danmakuFontDropShadowBlur = value
        AppToast.show(this, "Danmaku Font Drop Shadow Blur: $value")
    }
}

internal fun PlayerActivity.showV113SubtitleFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v113subtitleFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113subtitleFontWeightCustom = value
        AppToast.show(this, "Subtitle Font Weight Custom: $value")
    }
}

internal fun PlayerActivity.showV113GestureTapBrightnessStepDialog() {
    val options = listOf(3, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v113gestureTapBrightnessStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Brightness Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113gestureTapBrightnessStep = value
        AppToast.show(this, "Gesture Tap Brightness Step: $value")
    }
}

internal fun PlayerActivity.showV113CastVideoBrightnessCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v113castVideoBrightnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Brightness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113castVideoBrightnessCustom = value
        AppToast.show(this, "Cast Video Brightness Custom: $value")
    }
}

internal fun PlayerActivity.showV113PlaylistAutoPlayOnConnectToggle() {
    val enabled = !BiliClient.prefs.v113playlistAutoPlayOnConnect
    BiliClient.prefs.v113playlistAutoPlayOnConnect = enabled
    AppToast.show(this, "Playlist Auto Play On Connect: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV113CacheCleanupOnStartToggle113Toggle() {
    val enabled = !BiliClient.prefs.v113cacheCleanupOnStartToggle113
    BiliClient.prefs.v113cacheCleanupOnStartToggle113 = enabled
    AppToast.show(this, "Cache Cleanup On Start Toggle113: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV113ProgressBarCustomLiveEdgeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v113progressBarCustomLiveEdgeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Edge Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113progressBarCustomLiveEdgeStyle = value
        AppToast.show(this, "Progress Bar Custom Live Edge Style: $value")
    }
}

internal fun PlayerActivity.showV113VolumeAutoGainCompensationToggle() {
    val enabled = !BiliClient.prefs.v113volumeAutoGainCompensation
    BiliClient.prefs.v113volumeAutoGainCompensation = enabled
    AppToast.show(this, "Volume Auto Gain Compensation: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV113HistoryAutoBackupCloudToggle() {
    val enabled = !BiliClient.prefs.v113historyAutoBackupCloud
    BiliClient.prefs.v113historyAutoBackupCloud = enabled
    AppToast.show(this, "History Auto Backup Cloud: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV113PlaybackSpeedAutoAdjustSilenceToggle() {
    val enabled = !BiliClient.prefs.v113playbackSpeedAutoAdjustSilence
    BiliClient.prefs.v113playbackSpeedAutoAdjustSilence = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Silence: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV113ScreenshotAutoShareInstagramToggle() {
    val enabled = !BiliClient.prefs.v113screenshotAutoShareInstagram
    BiliClient.prefs.v113screenshotAutoShareInstagram = enabled
    AppToast.show(this, "Screenshot Auto Share Instagram: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV113VideoColorTemperatureCustom113Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v113videoColorTemperatureCustom113).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom113",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113videoColorTemperatureCustom113 = value
        AppToast.show(this, "Video Color Temperature Custom113: $value")
    }
}

internal fun PlayerActivity.showV113DanmakuFontDropShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v113danmakuFontDropShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113danmakuFontDropShadowColor = value
        AppToast.show(this, "Danmaku Font Drop Shadow Color: $value")
    }
}

internal fun PlayerActivity.showV113SubtitleFontStretchCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v113subtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113subtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
}

internal fun PlayerActivity.showV114AudioDynamicBassBoostDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114audioDynamicBassBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Bass Boost",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114audioDynamicBassBoost = value
        AppToast.show(this, "Audio Dynamic Bass Boost: $value")
    }
}

internal fun PlayerActivity.showV114DanmakuFontDropShadowOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114danmakuFontDropShadowOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114danmakuFontDropShadowOpacity = value
        AppToast.show(this, "Danmaku Font Drop Shadow Opacity: $value")
    }
}

internal fun PlayerActivity.showV114SubtitleFontLetterSpacing114Dialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v114subtitleFontLetterSpacing114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Letter Spacing114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114subtitleFontLetterSpacing114 = value
        AppToast.show(this, "Subtitle Font Letter Spacing114: $value")
    }
}

internal fun PlayerActivity.showV114GestureTapPlayPauseToggleToggle() {
    val enabled = !BiliClient.prefs.v114gestureTapPlayPauseToggle
    BiliClient.prefs.v114gestureTapPlayPauseToggle = enabled
    AppToast.show(this, "Gesture Tap Play Pause Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV114CastVideoGammaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114castVideoGammaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Gamma Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114castVideoGammaCustom = value
        AppToast.show(this, "Cast Video Gamma Custom: $value")
    }
}

internal fun PlayerActivity.showV114PlaylistAutoPauseOnHeadsetToggle() {
    val enabled = !BiliClient.prefs.v114playlistAutoPauseOnHeadset
    BiliClient.prefs.v114playlistAutoPauseOnHeadset = enabled
    AppToast.show(this, "Playlist Auto Pause On Headset: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV114CacheWriteBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v114cacheWriteBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Write Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114cacheWriteBufferSize = value
        AppToast.show(this, "Cache Write Buffer Size: $value")
    }
}

internal fun PlayerActivity.showV114ProgressBarCustomThumbOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114progressBarCustomThumbOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114progressBarCustomThumbOpacity = value
        AppToast.show(this, "Progress Bar Custom Thumb Opacity: $value")
    }
}

internal fun PlayerActivity.showV114VolumeFadeInOnResumeToggle() {
    val enabled = !BiliClient.prefs.v114volumeFadeInOnResume
    BiliClient.prefs.v114volumeFadeInOnResume = enabled
    AppToast.show(this, "Volume Fade In On Resume: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV114HistoryAutoBackupFileToggle() {
    val enabled = !BiliClient.prefs.v114historyAutoBackupFile
    BiliClient.prefs.v114historyAutoBackupFile = enabled
    AppToast.show(this, "History Auto Backup File: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV114PlaybackSpeedAutoAdjustPitchToggle() {
    val enabled = !BiliClient.prefs.v114playbackSpeedAutoAdjustPitch
    BiliClient.prefs.v114playbackSpeedAutoAdjustPitch = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Pitch: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV114ScreenshotAutoShareFacebookToggle() {
    val enabled = !BiliClient.prefs.v114screenshotAutoShareFacebook
    BiliClient.prefs.v114screenshotAutoShareFacebook = enabled
    AppToast.show(this, "Screenshot Auto Share Facebook: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV114VideoTintCustom114Dialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v114videoTintCustom114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Custom114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114videoTintCustom114 = value
        AppToast.show(this, "Video Tint Custom114: $value")
    }
}

internal fun PlayerActivity.showV114DanmakuFontBgOpacityCustom114Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114danmakuFontBgOpacityCustom114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Opacity Custom114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114danmakuFontBgOpacityCustom114 = value
        AppToast.show(this, "Danmaku Font BG Opacity Custom114: $value")
    }
}

internal fun PlayerActivity.showV114SubtitleFontWordSpacing114Dialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v114subtitleFontWordSpacing114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Word Spacing114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114subtitleFontWordSpacing114 = value
        AppToast.show(this, "Subtitle Font Word Spacing114: $value")
    }
}

internal fun PlayerActivity.showV115AudioDynamicTrebleBoostDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v115audioDynamicTrebleBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Treble Boost",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115audioDynamicTrebleBoost = value
        AppToast.show(this, "Audio Dynamic Treble Boost: $value")
    }
}

internal fun PlayerActivity.showV115DanmakuFontBgBorderToggle115Toggle() {
    val enabled = !BiliClient.prefs.v115danmakuFontBgBorderToggle115
    BiliClient.prefs.v115danmakuFontBgBorderToggle115 = enabled
    AppToast.show(this, "Danmaku Font BG Border Toggle115: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV115SubtitleFontWordSpacing115Dialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v115subtitleFontWordSpacing115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Word Spacing115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115subtitleFontWordSpacing115 = value
        AppToast.show(this, "Subtitle Font Word Spacing115: $value")
    }
}

internal fun PlayerActivity.showV115GestureTapDoubleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115gestureTapDoubleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115gestureTapDoubleAction = value
        AppToast.show(this, "Gesture Tap Double Action: $value")
    }
}

internal fun PlayerActivity.showV115CastVideoTintCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v115castVideoTintCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Tint Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115castVideoTintCustom = value
        AppToast.show(this, "Cast Video Tint Custom: $value")
    }
}

internal fun PlayerActivity.showV115PlaylistAutoResumeOnLaunchToggle() {
    val enabled = !BiliClient.prefs.v115playlistAutoResumeOnLaunch
    BiliClient.prefs.v115playlistAutoResumeOnLaunch = enabled
    AppToast.show(this, "Playlist Auto Resume On Launch: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV115CacheReadBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115cacheReadBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Read Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115cacheReadBufferSize = value
        AppToast.show(this, "Cache Read Buffer Size: $value")
    }
}

internal fun PlayerActivity.showV115ProgressBarCustomChapterOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v115progressBarCustomChapterOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Chapter Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115progressBarCustomChapterOpacity = value
        AppToast.show(this, "Progress Bar Custom Chapter Opacity: $value")
    }
}

internal fun PlayerActivity.showV115VolumeFadeOutOnPauseToggle() {
    val enabled = !BiliClient.prefs.v115volumeFadeOutOnPause
    BiliClient.prefs.v115volumeFadeOutOnPause = enabled
    AppToast.show(this, "Volume Fade Out On Pause: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV115HistorySearchAutoCompleteToggle() {
    val enabled = !BiliClient.prefs.v115historySearchAutoComplete
    BiliClient.prefs.v115historySearchAutoComplete = enabled
    AppToast.show(this, "History Search Auto Complete: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV115PlaybackSpeedAutoAdjustMinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115playbackSpeedAutoAdjustMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Auto Adjust Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115playbackSpeedAutoAdjustMin = value
        AppToast.show(this, "Playback Speed Auto Adjust Min: $value")
    }
}

internal fun PlayerActivity.showV115ScreenshotAutoShareLinkedInToggle() {
    val enabled = !BiliClient.prefs.v115screenshotAutoShareLinkedIn
    BiliClient.prefs.v115screenshotAutoShareLinkedIn = enabled
    AppToast.show(this, "Screenshot Auto Share LinkedIn: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV115VideoSplitScreenCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115videoSplitScreenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Split Screen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115videoSplitScreenCustom = value
        AppToast.show(this, "Video Split Screen Custom: $value")
    }
}

internal fun PlayerActivity.showV115DanmakuFontBgBorderWidth115Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115danmakuFontBgBorderWidth115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Width115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115danmakuFontBgBorderWidth115 = value
        AppToast.show(this, "Danmaku Font BG Border Width115: $value")
    }
}

internal fun PlayerActivity.showV115SubtitleFontFeatures115Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115subtitleFontFeatures115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Features115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115subtitleFontFeatures115 = value
        AppToast.show(this, "Subtitle Font Features115: $value")
    }
}

internal fun PlayerActivity.showV116AudioDynamicCompressorToggle116Toggle() {
    val enabled = !BiliClient.prefs.v116audioDynamicCompressorToggle116
    BiliClient.prefs.v116audioDynamicCompressorToggle116 = enabled
    AppToast.show(this, "Audio Dynamic Compressor Toggle116: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV116DanmakuFontBgBorderColor115Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116danmakuFontBgBorderColor115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Color115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116danmakuFontBgBorderColor115 = value
        AppToast.show(this, "Danmaku Font BG Border Color115: $value")
    }
}

internal fun PlayerActivity.showV116SubtitleFontFeatures116Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116subtitleFontFeatures116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Features116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116subtitleFontFeatures116 = value
        AppToast.show(this, "Subtitle Font Features116: $value")
    }
}

internal fun PlayerActivity.showV116GestureTapTripleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116gestureTapTripleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116gestureTapTripleAction = value
        AppToast.show(this, "Gesture Tap Triple Action: $value")
    }
}

internal fun PlayerActivity.showV116CastVideoSepiaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v116castVideoSepiaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Sepia Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116castVideoSepiaCustom = value
        AppToast.show(this, "Cast Video Sepia Custom: $value")
    }
}

internal fun PlayerActivity.showV116PlaylistAutoShuffleSeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116playlistAutoShuffleSeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Shuffle Seed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116playlistAutoShuffleSeed = value
        AppToast.show(this, "Playlist Auto Shuffle Seed: $value")
    }
}

internal fun PlayerActivity.showV116CachePreloadOnStartToggleToggle() {
    val enabled = !BiliClient.prefs.v116cachePreloadOnStartToggle
    BiliClient.prefs.v116cachePreloadOnStartToggle = enabled
    AppToast.show(this, "Cache Preload On Start Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV116ProgressBarCustomBufferOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v116progressBarCustomBufferOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Buffer Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116progressBarCustomBufferOpacity = value
        AppToast.show(this, "Progress Bar Custom Buffer Opacity: $value")
    }
}

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

internal fun PlayerActivity.showV116ScreenshotAutoShareWhatsAppToggle() {
    val enabled = !BiliClient.prefs.v116screenshotAutoShareWhatsApp
    BiliClient.prefs.v116screenshotAutoShareWhatsApp = enabled
    AppToast.show(this, "Screenshot Auto Share WhatsApp: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV117AudioDynamicEQToggle117Toggle() {
    val enabled = !BiliClient.prefs.v117audioDynamicEQToggle117
    BiliClient.prefs.v117audioDynamicEQToggle117 = enabled
    AppToast.show(this, "Audio Dynamic EQ Toggle117: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV117PlaylistAutoSkipOnLowBatteryToggle() {
    val enabled = !BiliClient.prefs.v117playlistAutoSkipOnLowBattery
    BiliClient.prefs.v117playlistAutoSkipOnLowBattery = enabled
    AppToast.show(this, "Playlist Auto Skip On Low Battery: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV117CachePreloadOnWifiToggleToggle() {
    val enabled = !BiliClient.prefs.v117cachePreloadOnWifiToggle
    BiliClient.prefs.v117cachePreloadOnWifiToggle = enabled
    AppToast.show(this, "Cache Preload On Wifi Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV117VolumeSmoothFadeToggleToggle() {
    val enabled = !BiliClient.prefs.v117volumeSmoothFadeToggle
    BiliClient.prefs.v117volumeSmoothFadeToggle = enabled
    AppToast.show(this, "Volume Smooth Fade Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV117HistorySearchRegexToggleToggle() {
    val enabled = !BiliClient.prefs.v117historySearchRegexToggle
    BiliClient.prefs.v117historySearchRegexToggle = enabled
    AppToast.show(this, "History Search Regex Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV117PlaybackSpeedAutoAdjustActiveToggle() {
    val enabled = !BiliClient.prefs.v117playbackSpeedAutoAdjustActive
    BiliClient.prefs.v117playbackSpeedAutoAdjustActive = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Active: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV117ScreenshotAutoShareTelegramToggle() {
    val enabled = !BiliClient.prefs.v117screenshotAutoShareTelegram
    BiliClient.prefs.v117screenshotAutoShareTelegram = enabled
    AppToast.show(this, "Screenshot Auto Share Telegram: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV118PlaylistAutoLoadMetadataToggle() {
    val enabled = !BiliClient.prefs.v118playlistAutoLoadMetadata
    BiliClient.prefs.v118playlistAutoLoadMetadata = enabled
    AppToast.show(this, "Playlist Auto Load Metadata: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV118CacheSmartEvictionToggleToggle() {
    val enabled = !BiliClient.prefs.v118cacheSmartEvictionToggle
    BiliClient.prefs.v118cacheSmartEvictionToggle = enabled
    AppToast.show(this, "Cache Smart Eviction Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV118HistorySearchFuzzyMatchToggle() {
    val enabled = !BiliClient.prefs.v118historySearchFuzzyMatch
    BiliClient.prefs.v118historySearchFuzzyMatch = enabled
    AppToast.show(this, "History Search Fuzzy Match: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV118PlaybackSpeedAutoAdjustBufferToggle() {
    val enabled = !BiliClient.prefs.v118playbackSpeedAutoAdjustBuffer
    BiliClient.prefs.v118playbackSpeedAutoAdjustBuffer = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Buffer: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV118ScreenshotAutoShareDiscordToggle() {
    val enabled = !BiliClient.prefs.v118screenshotAutoShareDiscord
    BiliClient.prefs.v118screenshotAutoShareDiscord = enabled
    AppToast.show(this, "Screenshot Auto Share Discord: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV119PlaylistAutoSavePositionToggle() {
    val enabled = !BiliClient.prefs.v119playlistAutoSavePosition
    BiliClient.prefs.v119playlistAutoSavePosition = enabled
    AppToast.show(this, "Playlist Auto Save Position: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV119CacheVerifyIntegrityToggleToggle() {
    val enabled = !BiliClient.prefs.v119cacheVerifyIntegrityToggle
    BiliClient.prefs.v119cacheVerifyIntegrityToggle = enabled
    AppToast.show(this, "Cache Verify Integrity Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV119HistorySearchMatchCaseToggle() {
    val enabled = !BiliClient.prefs.v119historySearchMatchCase
    BiliClient.prefs.v119historySearchMatchCase = enabled
    AppToast.show(this, "History Search Match Case: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV119PlaybackSpeedAutoAdjustNetworkToggle() {
    val enabled = !BiliClient.prefs.v119playbackSpeedAutoAdjustNetwork
    BiliClient.prefs.v119playbackSpeedAutoAdjustNetwork = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Network: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV119ScreenshotAutoShareLineToggle() {
    val enabled = !BiliClient.prefs.v119screenshotAutoShareLine
    BiliClient.prefs.v119screenshotAutoShareLine = enabled
    AppToast.show(this, "Screenshot Auto Share Line: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV119SubtitleAnimationLoop119Toggle() {
    val enabled = !BiliClient.prefs.v119subtitleAnimationLoop119
    BiliClient.prefs.v119subtitleAnimationLoop119 = enabled
    AppToast.show(this, "Subtitle Animation Loop119: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV120AudioDynamicMonoFoldToggle() {
    val enabled = !BiliClient.prefs.v120audioDynamicMonoFold
    BiliClient.prefs.v120audioDynamicMonoFold = enabled
    AppToast.show(this, "Audio Dynamic Mono Fold: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV120SubtitleAnimationLoop120Toggle() {
    val enabled = !BiliClient.prefs.v120subtitleAnimationLoop120
    BiliClient.prefs.v120subtitleAnimationLoop120 = enabled
    AppToast.show(this, "Subtitle Animation Loop120: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV120PlaylistAutoSavePositionToggleToggle() {
    val enabled = !BiliClient.prefs.v120playlistAutoSavePositionToggle
    BiliClient.prefs.v120playlistAutoSavePositionToggle = enabled
    AppToast.show(this, "Playlist Auto Save Position Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV120CacheVerifyIntegrityOnStartToggle() {
    val enabled = !BiliClient.prefs.v120cacheVerifyIntegrityOnStart
    BiliClient.prefs.v120cacheVerifyIntegrityOnStart = enabled
    AppToast.show(this, "Cache Verify Integrity On Start: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV120HistorySearchWholeWordToggle() {
    val enabled = !BiliClient.prefs.v120historySearchWholeWord
    BiliClient.prefs.v120historySearchWholeWord = enabled
    AppToast.show(this, "History Search Whole Word: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV120PlaybackSpeedAutoAdjustQualityToggle() {
    val enabled = !BiliClient.prefs.v120playbackSpeedAutoAdjustQuality
    BiliClient.prefs.v120playbackSpeedAutoAdjustQuality = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Quality: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV120ScreenshotAutoShareKakaoTalkToggle() {
    val enabled = !BiliClient.prefs.v120screenshotAutoShareKakaoTalk
    BiliClient.prefs.v120screenshotAutoShareKakaoTalk = enabled
    AppToast.show(this, "Screenshot Auto Share KakaoTalk: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV121CastVideoFlipHorizontalToggle() {
    val enabled = !BiliClient.prefs.v121castVideoFlipHorizontal
    BiliClient.prefs.v121castVideoFlipHorizontal = enabled
    AppToast.show(this, "Cast Video Flip Horizontal: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV121PlaylistAutoResumeQueueToggle() {
    val enabled = !BiliClient.prefs.v121playlistAutoResumeQueue
    BiliClient.prefs.v121playlistAutoResumeQueue = enabled
    AppToast.show(this, "Playlist Auto Resume Queue: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV121CacheSmartPinningToggleToggle() {
    val enabled = !BiliClient.prefs.v121cacheSmartPinningToggle
    BiliClient.prefs.v121cacheSmartPinningToggle = enabled
    AppToast.show(this, "Cache Smart Pinning Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV121VolumeMonoDownmixToggleToggle() {
    val enabled = !BiliClient.prefs.v121volumeMonoDownmixToggle
    BiliClient.prefs.v121volumeMonoDownmixToggle = enabled
    AppToast.show(this, "Volume Mono Downmix Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

