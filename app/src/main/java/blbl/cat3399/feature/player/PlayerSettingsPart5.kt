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
// v110.147: Screenshot Delay Timer


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
// v110.148: Video Ambient Light Custom


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
// v110.149: Danmaku Font Texture Pattern Custom


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
// v110.150: Subtitle Font Case Override110


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
// v111.1: Audio Delay Sync Custom


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
// v111.3: Subtitle BG Shadow Size


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
// v111.4: Gesture Tap Seek Step


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
// v111.5: Cast Video Saturation Custom


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
// v111.7: Cache Download Bandwidth Limit


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
// v111.8: Progress Bar Custom Buffer Color


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
// v111.9: Volume Loudness Target


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
// v111.13: Video Blend Mode Custom


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
// v112.17: Danmaku Font Drop Shadow X


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
// v112.18: Subtitle BG Border Color Contrast


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
// v112.19: Gesture Tap Volume Step


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
// v112.20: Cast Video Contrast Custom


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
// v112.23: Progress Bar Custom Chapter Style


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
// v112.25: History Auto Backup Interval


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
// v112.26: Playback Speed Auto Adjust Range


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
// v112.28: Video Color LUT Custom


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
// v112.29: Danmaku Font Drop Shadow Y


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
// v112.30: Subtitle BG Border Color Auto Threshold


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
// v113.31: Audio Crossfeed Strength


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
// v113.32: Danmaku Font Drop Shadow Blur


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
// v113.33: Subtitle Font Weight Custom


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
// v113.34: Gesture Tap Brightness Step


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
// v113.35: Cast Video Brightness Custom


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
// v113.38: Progress Bar Custom Live Edge Style


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
// v113.43: Video Color Temperature Custom113


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
// v113.44: Danmaku Font Drop Shadow Color


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
// v113.45: Subtitle Font Stretch Custom


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
// v114.46: Audio Dynamic Bass Boost


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
// v114.47: Danmaku Font Drop Shadow Opacity


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
// v114.48: Subtitle Font Letter Spacing114


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
// v114.50: Cast Video Gamma Custom


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
// v114.52: Cache Write Buffer Size


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
// v114.53: Progress Bar Custom Thumb Opacity


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
// v114.58: Video Tint Custom114


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
// v114.59: Danmaku Font BG Opacity Custom114


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
// v114.60: Subtitle Font Word Spacing114


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
// v115.61: Audio Dynamic Treble Boost


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
// v115.63: Subtitle Font Word Spacing115


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
// v115.64: Gesture Tap Double Action


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
// v115.65: Cast Video Tint Custom


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
// v115.67: Cache Read Buffer Size


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
// v115.68: Progress Bar Custom Chapter Opacity


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
// v115.71: Playback Speed Auto Adjust Min


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
// v115.73: Video Split Screen Custom


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
// v115.74: Danmaku Font BG Border Width115


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
// v115.75: Subtitle Font Features115


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
// v116.77: Danmaku Font BG Border Color115


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
// v116.78: Subtitle Font Features116


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
// v116.79: Gesture Tap Triple Action


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
// v116.80: Cast Video Sepia Custom


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
// v116.81: Playlist Auto Shuffle Seed


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
// v116.83: Progress Bar Custom Buffer Opacity


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
// v133: Audio Chorus Mix


