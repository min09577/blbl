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

internal fun PlayerActivity.showV87CacheCleanupScheduleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87CacheCleanupSchedule).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Schedule",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87CacheCleanupSchedule = value
        AppToast.show(this, "Cache Cleanup Schedule: $value")
    }
// v87.9: Volume Limit Max


internal fun PlayerActivity.showV87VolumeLimitMaxDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VolumeLimitMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limit Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VolumeLimitMax = value
        AppToast.show(this, "Volume Limit Max: $value")
    }
// v87.13: Video Gamma Curve Custom


internal fun PlayerActivity.showV87VideoGammaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VideoGammaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Gamma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VideoGammaCurveCustom = value
        AppToast.show(this, "Video Gamma Curve Custom: $value")
    }
// v87.14: Danmaku Max On Screen


internal fun PlayerActivity.showV87DanmakuMaxOnScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuMaxOnScreen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Max On Screen",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87DanmakuMaxOnScreen = value
        AppToast.show(this, "Danmaku Max On Screen: $value")
    }
// v87.15: Subtitle Shadow Offset Y


internal fun PlayerActivity.showV87SubtitleShadowOffsetYDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v87SubtitleShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87SubtitleShadowOffsetY = value
        AppToast.show(this, "Subtitle Shadow Offset Y: $value")
    }
// v88.1: Video White Balance Custom


internal fun PlayerActivity.showV88VideoWhiteBalanceCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88VideoWhiteBalanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video White Balance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88VideoWhiteBalanceCustom = value
        AppToast.show(this, "Video White Balance Custom: $value")
    }
// v88.2: Danmaku Send Animation


internal fun PlayerActivity.showV88DanmakuSendAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuSendAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88DanmakuSendAnimation = value
        AppToast.show(this, "Danmaku Send Animation: $value")
    }
// v88.3: Subtitle Outline Color


internal fun PlayerActivity.showV88SubtitleOutlineColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88SubtitleOutlineColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88SubtitleOutlineColor = value
        AppToast.show(this, "Subtitle Outline Color: $value")
    }
// v88.4: Gesture Tap Action


internal fun PlayerActivity.showV88GestureTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88GestureTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88GestureTapAction = value
        AppToast.show(this, "Gesture Tap Action: $value")
    }
// v88.5: Cast Video Resolution


internal fun PlayerActivity.showV88CastVideoResolutionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88CastVideoResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Resolution",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88CastVideoResolution = value
        AppToast.show(this, "Cast Video Resolution: $value")
    }
// v88.12: Screenshot Format Custom


internal fun PlayerActivity.showV88ScreenshotFormatCustomDialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88ScreenshotFormatCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88ScreenshotFormatCustom = value
        AppToast.show(this, "Screenshot Format Custom: $value")
    }
// v88.13: Video Tint Custom


internal fun PlayerActivity.showV88VideoTintCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88VideoTintCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88VideoTintCustom = value
        AppToast.show(this, "Video Tint Custom: $value")
    }
// v88.14: Danmaku Scroll Speed Curve


internal fun PlayerActivity.showV88DanmakuScrollSpeedCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuScrollSpeedCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88DanmakuScrollSpeedCurve = value
        AppToast.show(this, "Danmaku Scroll Speed Curve: $value")
    }
// v88.15: Subtitle Shadow Blur


internal fun PlayerActivity.showV88SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v88SubtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88SubtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
// v89.1: Video Black Level Custom


internal fun PlayerActivity.showV89VideoBlackLevelCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89VideoBlackLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Black Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89VideoBlackLevelCustom = value
        AppToast.show(this, "Video Black Level Custom: $value")
    }
// v89.2: Danmaku Font Kerning Custom


internal fun PlayerActivity.showV89DanmakuFontKerningCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuFontKerningCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Kerning Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89DanmakuFontKerningCustom = value
        AppToast.show(this, "Danmaku Font Kerning Custom: $value")
    }
// v89.3: Subtitle Animation Loop Count


internal fun PlayerActivity.showV89SubtitleAnimationLoopCountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89SubtitleAnimationLoopCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Loop Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89SubtitleAnimationLoopCount = value
        AppToast.show(this, "Subtitle Animation Loop Count: $value")
    }
// v89.4: Gesture Pinch Action


internal fun PlayerActivity.showV89GesturePinchActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89GesturePinchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89GesturePinchAction = value
        AppToast.show(this, "Gesture Pinch Action: $value")
    }
// v89.5: Cast Audio Bitrate


internal fun PlayerActivity.showV89CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89CastAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89CastAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
// v89.10: History Sort Order


internal fun PlayerActivity.showV89HistorySortOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89HistorySortOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Sort Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89HistorySortOrder = value
        AppToast.show(this, "History Sort Order: $value")
    }
// v89.12: Screenshot Quality Custom


internal fun PlayerActivity.showV89ScreenshotQualityCustomDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v89ScreenshotQualityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Quality Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89ScreenshotQualityCustom = value
        AppToast.show(this, "Screenshot Quality Custom: $value")
    }
// v89.13: Video White Point Custom


internal fun PlayerActivity.showV89VideoWhitePointCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89VideoWhitePointCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video White Point Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89VideoWhitePointCustom = value
        AppToast.show(this, "Video White Point Custom: $value")
    }
// v89.14: Danmaku Scroll Speed Min


internal fun PlayerActivity.showV89DanmakuScrollSpeedMinDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuScrollSpeedMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89DanmakuScrollSpeedMin = value
        AppToast.show(this, "Danmaku Scroll Speed Min: $value")
    }
// v89.15: Subtitle Position Y Custom


internal fun PlayerActivity.showV89SubtitlePositionYCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89SubtitlePositionYCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Y Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89SubtitlePositionYCustom = value
        AppToast.show(this, "Subtitle Position Y Custom: $value")
    }
// v90.1: Video Midtone Custom


internal fun PlayerActivity.showV90VideoMidtoneCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VideoMidtoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Midtone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VideoMidtoneCustom = value
        AppToast.show(this, "Video Midtone Custom: $value")
    }
// v90.2: Danmaku Scroll Speed Max


internal fun PlayerActivity.showV90DanmakuScrollSpeedMaxDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuScrollSpeedMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90DanmakuScrollSpeedMax = value
        AppToast.show(this, "Danmaku Scroll Speed Max: $value")
    }
// v90.3: Subtitle Position X Custom


internal fun PlayerActivity.showV90SubtitlePositionXCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90SubtitlePositionXCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position X Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90SubtitlePositionXCustom = value
        AppToast.show(this, "Subtitle Position X Custom: $value")
    }
// v90.4: Gesture Rotation Action


internal fun PlayerActivity.showV90GestureRotationActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90GestureRotationAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90GestureRotationAction = value
        AppToast.show(this, "Gesture Rotation Action: $value")
    }
// v90.5: Cast Video Codec Custom


internal fun PlayerActivity.showV90CastVideoCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90CastVideoCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90CastVideoCodecCustom = value
        AppToast.show(this, "Cast Video Codec Custom: $value")
    }
// v90.9: Volume Spatial Width


internal fun PlayerActivity.showV90VolumeSpatialWidthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VolumeSpatialWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VolumeSpatialWidth = value
        AppToast.show(this, "Volume Spatial Width: $value")
    }
// v90.13: Video Highlight Custom


internal fun PlayerActivity.showV90VideoHighlightCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VideoHighlightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Highlight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VideoHighlightCustom = value
        AppToast.show(this, "Video Highlight Custom: $value")
    }
// v90.14: Danmaku Send Max Length


internal fun PlayerActivity.showV90DanmakuSendMaxLengthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuSendMaxLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90DanmakuSendMaxLength = value
        AppToast.show(this, "Danmaku Send Max Length: $value")
    }
// v90.15: Subtitle Animation Delay Custom


internal fun PlayerActivity.showV90SubtitleAnimationDelayCustomDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v90SubtitleAnimationDelayCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90SubtitleAnimationDelayCustom = value
        AppToast.show(this, "Subtitle Animation Delay Custom: $value")
    }
// v91.1: Video Dithering Mode


internal fun PlayerActivity.showV91VideoDitheringModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91videoDitheringMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dithering Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91videoDitheringMode = value
        AppToast.show(this, "Video Dithering Mode: $value")
    }
// v91.3: Subtitle Fade In Out Custom


internal fun PlayerActivity.showV91SubtitleFadeInOutCustomDialog() {
    val options = listOf(0, 200, 400, 600, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v91subtitleFadeInOutCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Fade In Out Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91subtitleFadeInOutCustom = value
        AppToast.show(this, "Subtitle Fade In Out Custom: $value")
    }
// v91.4: Gesture Edge Dead Zone


internal fun PlayerActivity.showV91GestureEdgeDeadZoneDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v91gestureEdgeDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Dead Zone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91gestureEdgeDeadZone = value
        AppToast.show(this, "Gesture Edge Dead Zone: $value")
    }
// v91.5: Cast Video Latency Mode


internal fun PlayerActivity.showV91CastVideoLatencyModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91castVideoLatencyMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Latency Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91castVideoLatencyMode = value
        AppToast.show(this, "Cast Video Latency Mode: $value")
    }
// v91.7: Cache Segment Size


internal fun PlayerActivity.showV91CacheSegmentSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91cacheSegmentSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Segment Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91cacheSegmentSize = value
        AppToast.show(this, "Cache Segment Size: $value")
    }
// v91.11: Playback Auto Skip Next Countdown


internal fun PlayerActivity.showV91PlaybackAutoSkipNextCountdownDialog() {
    val options = listOf(3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v91playbackAutoSkipNextCountdown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Next Countdown",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91playbackAutoSkipNextCountdown = value
        AppToast.show(this, "Playback Auto Skip Next Countdown: $value")
    }
// v91.13: Video Film Grain Custom


internal fun PlayerActivity.showV91VideoFilmGrainCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v91videoFilmGrainCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Film Grain Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91videoFilmGrainCustom = value
        AppToast.show(this, "Video Film Grain Custom: $value")
    }
// v91.14: Danmaku BG Corner Radius


internal fun PlayerActivity.showV91DanmakuBgCornerRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v91danmakuBgCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Corner Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91danmakuBgCornerRadius = value
        AppToast.show(this, "Danmaku BG Corner Radius: $value")
    }
// v91.15: Subtitle BG Margin Bottom


internal fun PlayerActivity.showV91SubtitleBgMarginBottomDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v91subtitleBgMarginBottom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Margin Bottom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91subtitleBgMarginBottom = value
        AppToast.show(this, "Subtitle BG Margin Bottom: $value")
    }
// v92.16: Video Vignette Custom


internal fun PlayerActivity.showV92VideoVignetteCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92videoVignetteCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Vignette Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92videoVignetteCustom = value
        AppToast.show(this, "Video Vignette Custom: $value")
    }
// v92.18: Subtitle BG Padding Custom


internal fun PlayerActivity.showV92SubtitleBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v92subtitleBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92subtitleBgPaddingCustom = value
        AppToast.show(this, "Subtitle BG Padding Custom: $value")
    }
// v92.19: Gesture Swipe Back Action


internal fun PlayerActivity.showV92GestureSwipeBackActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92gestureSwipeBackAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Back Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92gestureSwipeBackAction = value
        AppToast.show(this, "Gesture Swipe Back Action: $value")
    }
// v92.21: Playlist Auto Skip Short


internal fun PlayerActivity.showV92PlaylistAutoSkipShortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92playlistAutoSkipShort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Skip Short",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92playlistAutoSkipShort = value
        AppToast.show(this, "Playlist Auto Skip Short: $value")
    }
// v92.22: Cache Download Policy


internal fun PlayerActivity.showV92CacheDownloadPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92cacheDownloadPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92cacheDownloadPolicy = value
        AppToast.show(this, "Cache Download Policy: $value")
    }
// v92.23: Progress Bar Thumb Shape


internal fun PlayerActivity.showV92ProgressBarThumbShapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92progressBarThumbShape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Shape",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92progressBarThumbShape = value
        AppToast.show(this, "Progress Bar Thumb Shape: $value")
    }
// v92.27: Screenshot Auto Delete Days


internal fun PlayerActivity.showV92ScreenshotAutoDeleteDaysDialog() {
    val options = listOf(7, 14, 30, 60, 90)
    val currentIndex = options.indexOf(BiliClient.prefs.v92screenshotAutoDeleteDays).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Delete Days",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92screenshotAutoDeleteDays = value
        AppToast.show(this, "Screenshot Auto Delete Days: $value")
    }
// v92.28: Video Color Fringe Custom


internal fun PlayerActivity.showV92VideoColorFringeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92videoColorFringeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fringe Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92videoColorFringeCustom = value
        AppToast.show(this, "Video Color Fringe Custom: $value")
    }
// v92.29: Danmaku BG Opacity Custom


internal fun PlayerActivity.showV92DanmakuBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92danmakuBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92danmakuBgOpacityCustom = value
        AppToast.show(this, "Danmaku BG Opacity Custom: $value")
    }
// v92.30: Subtitle BG Margin Top


internal fun PlayerActivity.showV92SubtitleBgMarginTopDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v92subtitleBgMarginTop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Margin Top",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92subtitleBgMarginTop = value
        AppToast.show(this, "Subtitle BG Margin Top: $value")
    }
// v93.32: Danmaku Send Max Length Custom


internal fun PlayerActivity.showV93DanmakuSendMaxLengthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93danmakuSendMaxLengthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93danmakuSendMaxLengthCustom = value
        AppToast.show(this, "Danmaku Send Max Length Custom: $value")
    }
// v93.33: Subtitle BG Border Color Custom


internal fun PlayerActivity.showV93SubtitleBgBorderColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93subtitleBgBorderColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93subtitleBgBorderColorCustom = value
        AppToast.show(this, "Subtitle BG Border Color Custom: $value")
    }
// v93.34: Gesture Swipe Forward Action


internal fun PlayerActivity.showV93GestureSwipeForwardActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93gestureSwipeForwardAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Forward Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93gestureSwipeForwardAction = value
        AppToast.show(this, "Gesture Swipe Forward Action: $value")
    }
// v93.35: Cast Audio Dynamic Range


internal fun PlayerActivity.showV93CastAudioDynamicRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93castAudioDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Dynamic Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93castAudioDynamicRange = value
        AppToast.show(this, "Cast Audio Dynamic Range: $value")
    }
// v93.36: Playlist Auto Skip Long


internal fun PlayerActivity.showV93PlaylistAutoSkipLongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93playlistAutoSkipLong).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Skip Long",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93playlistAutoSkipLong = value
        AppToast.show(this, "Playlist Auto Skip Long: $value")
    }
// v93.37: Cache Network Policy


internal fun PlayerActivity.showV93CacheNetworkPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93cacheNetworkPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Network Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93cacheNetworkPolicy = value
        AppToast.show(this, "Cache Network Policy: $value")
    }
// v93.38: Progress Bar Buffer Color Custom


internal fun PlayerActivity.showV93ProgressBarBufferColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93progressBarBufferColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffer Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93progressBarBufferColorCustom = value
        AppToast.show(this, "Progress Bar Buffer Color Custom: $value")
    }
// v93.42: Screenshot Naming Template


internal fun PlayerActivity.showV93ScreenshotNamingTemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93screenshotNamingTemplate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Naming Template",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93screenshotNamingTemplate = value
        AppToast.show(this, "Screenshot Naming Template: $value")
    }
// v93.43: Video CRT Filter Custom


internal fun PlayerActivity.showV93VideoCRTFilterCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v93videoCRTFilterCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video CRT Filter Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93videoCRTFilterCustom = value
        AppToast.show(this, "Video CRT Filter Custom: $value")
    }
// v93.45: Subtitle BG Border Width Custom


internal fun PlayerActivity.showV93SubtitleBgBorderWidthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93subtitleBgBorderWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93subtitleBgBorderWidthCustom = value
        AppToast.show(this, "Subtitle BG Border Width Custom: $value")
    }
// v94.48: Subtitle BG Border Radius Custom


internal fun PlayerActivity.showV94SubtitleBgBorderRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v94subtitleBgBorderRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94subtitleBgBorderRadiusCustom = value
        AppToast.show(this, "Subtitle BG Border Radius Custom: $value")
    }
// v94.49: Gesture Long Press Timeout


internal fun PlayerActivity.showV94GestureLongPressTimeoutDialog() {
    val options = listOf(300, 400, 500, 700, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v94gestureLongPressTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94gestureLongPressTimeout = value
        AppToast.show(this, "Gesture Long Press Timeout: $value")
    }
// v94.50: Cast Video Buffer Size


internal fun PlayerActivity.showV94CastVideoBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v94castVideoBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94castVideoBufferSize = value
        AppToast.show(this, "Cast Video Buffer Size: $value")
    }
// v94.59: Danmaku Font Size Step


internal fun PlayerActivity.showV94DanmakuFontSizeStepDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v94danmakuFontSizeStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94danmakuFontSizeStep = value
        AppToast.show(this, "Danmaku Font Size Step: $value")
    }
// v94.60: Subtitle Animation Fade Time


internal fun PlayerActivity.showV94SubtitleAnimationFadeTimeDialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v94subtitleAnimationFadeTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94subtitleAnimationFadeTime = value
        AppToast.show(this, "Subtitle Animation Fade Time: $value")
    }
// v95.61: Video Glitch Effect Custom


internal fun PlayerActivity.showV95VideoGlitchEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95videoGlitchEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Glitch Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95videoGlitchEffectCustom = value
        AppToast.show(this, "Video Glitch Effect Custom: $value")
    }
// v95.62: Danmaku Scroll Easing


internal fun PlayerActivity.showV95DanmakuScrollEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95danmakuScrollEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95danmakuScrollEasing = value
        AppToast.show(this, "Danmaku Scroll Easing: $value")
    }
// v95.63: Subtitle BG Gradient Angle


internal fun PlayerActivity.showV95SubtitleBgGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v95subtitleBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95subtitleBgGradientAngle = value
        AppToast.show(this, "Subtitle BG Gradient Angle: $value")
    }
// v95.64: Gesture Double Tap Timeout


internal fun PlayerActivity.showV95GestureDoubleTapTimeoutDialog() {
    val options = listOf(200, 250, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v95gestureDoubleTapTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95gestureDoubleTapTimeout = value
        AppToast.show(this, "Gesture Double Tap Timeout: $value")
    }
// v95.65: Cast Audio Buffer Size


internal fun PlayerActivity.showV95CastAudioBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95castAudioBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95castAudioBufferSize = value
        AppToast.show(this, "Cast Audio Buffer Size: $value")
    }
// v95.67: Cache Storage Limit


internal fun PlayerActivity.showV95CacheStorageLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95cacheStorageLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Storage Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95cacheStorageLimit = value
        AppToast.show(this, "Cache Storage Limit: $value")
    }
// v95.68: Progress Bar Chapter Color


internal fun PlayerActivity.showV95ProgressBarChapterColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95progressBarChapterColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Chapter Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95progressBarChapterColor = value
        AppToast.show(this, "Progress Bar Chapter Color: $value")
    }
// v95.73: Video VHS Effect Custom


internal fun PlayerActivity.showV95VideoVHSEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95videoVHSEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video VHS Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95videoVHSEffectCustom = value
        AppToast.show(this, "Video VHS Effect Custom: $value")
    }
// v95.74: Danmaku Scroll Acceleration


internal fun PlayerActivity.showV95DanmakuScrollAccelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95danmakuScrollAcceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Acceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95danmakuScrollAcceleration = value
        AppToast.show(this, "Danmaku Scroll Acceleration: $value")
    }
// v95.75: Subtitle BG Gradient Opacity


internal fun PlayerActivity.showV95SubtitleBgGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95subtitleBgGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95subtitleBgGradientOpacity = value
        AppToast.show(this, "Subtitle BG Gradient Opacity: $value")
    }
// v96.76: Video Neon Glow Custom


internal fun PlayerActivity.showV96VideoNeonGlowCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96videoNeonGlowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Neon Glow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96videoNeonGlowCustom = value
        AppToast.show(this, "Video Neon Glow Custom: $value")
    }
// v96.77: Danmaku Font Letter Spacing


internal fun PlayerActivity.showV96DanmakuFontLetterSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v96danmakuFontLetterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Letter Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96danmakuFontLetterSpacing = value
        AppToast.show(this, "Danmaku Font Letter Spacing: $value")
    }
// v96.78: Subtitle BG Gradient Type


internal fun PlayerActivity.showV96SubtitleBgGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96subtitleBgGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96subtitleBgGradientType = value
        AppToast.show(this, "Subtitle BG Gradient Type: $value")
    }
// v96.79: Gesture Swipe Min Distance


internal fun PlayerActivity.showV96GestureSwipeMinDistanceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96gestureSwipeMinDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Min Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96gestureSwipeMinDistance = value
        AppToast.show(this, "Gesture Swipe Min Distance: $value")
    }
// v96.80: Cast Video Decode Threads


internal fun PlayerActivity.showV96CastVideoDecodeThreadsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96castVideoDecodeThreads).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Decode Threads",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96castVideoDecodeThreads = value
        AppToast.show(this, "Cast Video Decode Threads: $value")
    }
// v96.82: Cache Cleanup Interval


internal fun PlayerActivity.showV96CacheCleanupIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96cacheCleanupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96cacheCleanupInterval = value
        AppToast.show(this, "Cache Cleanup Interval: $value")
    }
// v96.85: History Auto Clean Max Days


internal fun PlayerActivity.showV96HistoryAutoCleanMaxDaysDialog() {
    val options = listOf(30, 60, 90, 180, 365)
    val currentIndex = options.indexOf(BiliClient.prefs.v96historyAutoCleanMaxDays).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Clean Max Days",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96historyAutoCleanMaxDays = value
        AppToast.show(this, "History Auto Clean Max Days: $value")
    }
// v96.87: Screenshot Auto Share Target


internal fun PlayerActivity.showV96ScreenshotAutoShareTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96screenshotAutoShareTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Share Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96screenshotAutoShareTarget = value
        AppToast.show(this, "Screenshot Auto Share Target: $value")
    }
// v96.88: Video Dreamy Effect Custom


internal fun PlayerActivity.showV96VideoDreamyEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96videoDreamyEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dreamy Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96videoDreamyEffectCustom = value
        AppToast.show(this, "Video Dreamy Effect Custom: $value")
    }
// v96.89: Danmaku Scroll Deceleration


internal fun PlayerActivity.showV96DanmakuScrollDecelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96danmakuScrollDeceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Deceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96danmakuScrollDeceleration = value
        AppToast.show(this, "Danmaku Scroll Deceleration: $value")
    }
// v96.90: Subtitle BG Gradient Start


internal fun PlayerActivity.showV96SubtitleBgGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96subtitleBgGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96subtitleBgGradientStart = value
        AppToast.show(this, "Subtitle BG Gradient Start: $value")
    }
// v97.91: Video Sepia Custom


internal fun PlayerActivity.showV97VideoSepiaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v97videoSepiaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sepia Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97videoSepiaCustom = value
        AppToast.show(this, "Video Sepia Custom: $value")
    }
// v97.92: Danmaku Font Weight Range


internal fun PlayerActivity.showV97DanmakuFontWeightRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97danmakuFontWeightRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97danmakuFontWeightRange = value
        AppToast.show(this, "Danmaku Font Weight Range: $value")
    }
// v97.93: Subtitle BG Gradient End


internal fun PlayerActivity.showV97SubtitleBgGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97subtitleBgGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97subtitleBgGradientEnd = value
        AppToast.show(this, "Subtitle BG Gradient End: $value")
    }
// v97.94: Gesture Swipe Angle Threshold


internal fun PlayerActivity.showV97GestureSwipeAngleThresholdDialog() {
    val options = listOf(15, 20, 30, 45, 60)
    val currentIndex = options.indexOf(BiliClient.prefs.v97gestureSwipeAngleThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Angle Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97gestureSwipeAngleThreshold = value
        AppToast.show(this, "Gesture Swipe Angle Threshold: $value")
    }
// v97.97: Cache Preload Policy


internal fun PlayerActivity.showV97CachePreloadPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97cachePreloadPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97cachePreloadPolicy = value
        AppToast.show(this, "Cache Preload Policy: $value")
    }
// v97.100: History Auto Clean Min Items


internal fun PlayerActivity.showV97HistoryAutoCleanMinItemsDialog() {
    val options = listOf(50, 100, 200, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v97historyAutoCleanMinItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Clean Min Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97historyAutoCleanMinItems = value
        AppToast.show(this, "History Auto Clean Min Items: $value")
    }
// v97.103: Video Polaroid Custom


internal fun PlayerActivity.showV97VideoPolaroidCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v97videoPolaroidCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Polaroid Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97videoPolaroidCustom = value
        AppToast.show(this, "Video Polaroid Custom: $value")
    }
// v97.104: Danmaku Font Size Min


internal fun PlayerActivity.showV97DanmakuFontSizeMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v97danmakuFontSizeMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97danmakuFontSizeMin = value
        AppToast.show(this, "Danmaku Font Size Min: $value")
    }
// v97.105: Subtitle Animation Type97


internal fun PlayerActivity.showV97SubtitleAnimationType97Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97subtitleAnimationType97).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type97",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97subtitleAnimationType97 = value
        AppToast.show(this, "Subtitle Animation Type97: $value")
    }
// v98.106: Video Negative Custom


internal fun PlayerActivity.showV98VideoNegativeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v98videoNegativeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Negative Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98videoNegativeCustom = value
        AppToast.show(this, "Video Negative Custom: $value")
    }
// v98.107: Danmaku Font Size Max


internal fun PlayerActivity.showV98DanmakuFontSizeMaxDialog() {
    val options = listOf(24, 32, 40, 48, 64)
    val currentIndex = options.indexOf(BiliClient.prefs.v98danmakuFontSizeMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98danmakuFontSizeMax = value
        AppToast.show(this, "Danmaku Font Size Max: $value")
    }
// v98.108: Subtitle Animation Speed98


internal fun PlayerActivity.showV98SubtitleAnimationSpeed98Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v98subtitleAnimationSpeed98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98subtitleAnimationSpeed98 = value
        AppToast.show(this, "Subtitle Animation Speed98: $value")
    }
// v98.109: Gesture Pinch Min Scale


internal fun PlayerActivity.showV98GesturePinchMinScaleDialog() {
    val options = listOf(25, 30, 50, 70, 80)
    val currentIndex = options.indexOf(BiliClient.prefs.v98gesturePinchMinScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Min Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98gesturePinchMinScale = value
        AppToast.show(this, "Gesture Pinch Min Scale: $value")
    }
// v98.118: Video Monochrome Custom


internal fun PlayerActivity.showV98VideoMonochromeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v98videoMonochromeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Monochrome Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98videoMonochromeCustom = value
        AppToast.show(this, "Video Monochrome Custom: $value")
    }
// v98.119: Danmaku Font Style Custom98


internal fun PlayerActivity.showV98DanmakuFontStyleCustom98Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v98danmakuFontStyleCustom98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Style Custom98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98danmakuFontStyleCustom98 = value
        AppToast.show(this, "Danmaku Font Style Custom98: $value")
    }
// v98.120: Subtitle Animation Easing98


internal fun PlayerActivity.showV98SubtitleAnimationEasing98Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v98subtitleAnimationEasing98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98subtitleAnimationEasing98 = value
        AppToast.show(this, "Subtitle Animation Easing98: $value")
    }
// v99.121: Video Posterize Custom


internal fun PlayerActivity.showV99VideoPosterizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v99videoPosterizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Posterize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99videoPosterizeCustom = value
        AppToast.show(this, "Video Posterize Custom: $value")
    }
// v99.123: Subtitle Animation Duration99


internal fun PlayerActivity.showV99SubtitleAnimationDuration99Dialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v99subtitleAnimationDuration99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99subtitleAnimationDuration99 = value
        AppToast.show(this, "Subtitle Animation Duration99: $value")
    }
// v99.124: Gesture Pinch Max Scale


internal fun PlayerActivity.showV99GesturePinchMaxScaleDialog() {
    val options = listOf(150, 200, 250, 300, 400)
    val currentIndex = options.indexOf(BiliClient.prefs.v99gesturePinchMaxScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Max Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99gesturePinchMaxScale = value
        AppToast.show(this, "Gesture Pinch Max Scale: $value")
    }
// v99.127: Cache Download Speed Limit


internal fun PlayerActivity.showV99CacheDownloadSpeedLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v99cacheDownloadSpeedLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99cacheDownloadSpeedLimit = value
        AppToast.show(this, "Cache Download Speed Limit: $value")
    }
// v99.128: Progress Bar Thumb Size99


internal fun PlayerActivity.showV99ProgressBarThumbSize99Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v99progressBarThumbSize99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99progressBarThumbSize99 = value
        AppToast.show(this, "Progress Bar Thumb Size99: $value")
    }
// v99.133: Video Solarize Custom


internal fun PlayerActivity.showV99VideoSolarizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v99videoSolarizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Solarize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99videoSolarizeCustom = value
        AppToast.show(this, "Video Solarize Custom: $value")
    }
// v99.134: Danmaku Font Color Custom


internal fun PlayerActivity.showV99DanmakuFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v99danmakuFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99danmakuFontColorCustom = value
        AppToast.show(this, "Danmaku Font Color Custom: $value")
    }
// v100.136: Video Duotone Custom


internal fun PlayerActivity.showV100VideoDuotoneCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v100videoDuotoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Duotone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100videoDuotoneCustom = value
        AppToast.show(this, "Video Duotone Custom: $value")
    }
// v100.138: Subtitle Animation Delay99


internal fun PlayerActivity.showV100SubtitleAnimationDelay99Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v100subtitleAnimationDelay99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100subtitleAnimationDelay99 = value
        AppToast.show(this, "Subtitle Animation Delay99: $value")
    }
// v100.139: Gesture Pinch Speed99


internal fun PlayerActivity.showV100GesturePinchSpeed99Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v100gesturePinchSpeed99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Speed99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100gesturePinchSpeed99 = value
        AppToast.show(this, "Gesture Pinch Speed99: $value")
    }
// v100.142: Cache Download Retry


internal fun PlayerActivity.showV100CacheDownloadRetryDialog() {
    val options = listOf(1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v100cacheDownloadRetry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Retry",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100cacheDownloadRetry = value
        AppToast.show(this, "Cache Download Retry: $value")
    }
// v100.143: Progress Bar Thumb Color99


internal fun PlayerActivity.showV100ProgressBarThumbColor99Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v100progressBarThumbColor99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Color99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100progressBarThumbColor99 = value
        AppToast.show(this, "Progress Bar Thumb Color99: $value")
    }
// v100.147: Screenshot Auto Format99


internal fun PlayerActivity.showV100ScreenshotAutoFormat99Dialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v100screenshotAutoFormat99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Format99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100screenshotAutoFormat99 = value
        AppToast.show(this, "Screenshot Auto Format99: $value")
    }
// v100.148: Video Tint Duotone


internal fun PlayerActivity.showV100VideoTintDuotoneDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v100videoTintDuotone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Duotone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100videoTintDuotone = value
        AppToast.show(this, "Video Tint Duotone: $value")
    }
// v100.149: Danmaku Font Weight99


internal fun PlayerActivity.showV100DanmakuFontWeight99Dialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v100danmakuFontWeight99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100danmakuFontWeight99 = value
        AppToast.show(this, "Danmaku Font Weight99: $value")
    }
// v100.150: Subtitle Animation Type99


internal fun PlayerActivity.showV100SubtitleAnimationType99Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v100subtitleAnimationType99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100subtitleAnimationType99 = value
        AppToast.show(this, "Subtitle Animation Type99: $value")
    }
// v101.1: Audio Spatial Width Custom


internal fun PlayerActivity.showV101AudioSpatialWidthCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v101audioSpatialWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Spatial Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101audioSpatialWidthCustom = value
        AppToast.show(this, "Audio Spatial Width Custom: $value")
    }
// v101.3: Subtitle Shadow Color Custom


internal fun PlayerActivity.showV101SubtitleShadowColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101subtitleShadowColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101subtitleShadowColorCustom = value
        AppToast.show(this, "Subtitle Shadow Color Custom: $value")
    }
// v101.5: Cast Video HDR Mode


internal fun PlayerActivity.showV101CastVideoHDRModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101castVideoHDRMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video HDR Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101castVideoHDRMode = value
        AppToast.show(this, "Cast Video HDR Mode: $value")
    }
// v101.9: Volume EQ Preset Custom


internal fun PlayerActivity.showV101VolumeEQPresetCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101volumeEQPresetCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume EQ Preset Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101volumeEQPresetCustom = value
        AppToast.show(this, "Volume EQ Preset Custom: $value")
    }
// v101.13: Video Edge Enhance Custom


internal fun PlayerActivity.showV101VideoEdgeEnhanceCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v101videoEdgeEnhanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Edge Enhance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101videoEdgeEnhanceCustom = value
        AppToast.show(this, "Video Edge Enhance Custom: $value")
    }
// v101.15: Subtitle Line Spacing


internal fun PlayerActivity.showV101SubtitleLineSpacingDialog() {
    val options = listOf(80, 100, 120, 140, 160)
    val currentIndex = options.indexOf(BiliClient.prefs.v101subtitleLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101subtitleLineSpacing = value
        AppToast.show(this, "Subtitle Line Spacing: $value")
    }
// v102.16: Audio Bass Boost Custom


internal fun PlayerActivity.showV102AudioBassBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v102audioBassBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Bass Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102audioBassBoostCustom = value
        AppToast.show(this, "Audio Bass Boost Custom: $value")
    }
// v102.17: Danmaku Font Stroke Width


internal fun PlayerActivity.showV102DanmakuFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v102danmakuFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Stroke Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102danmakuFontStrokeWidth = value
        AppToast.show(this, "Danmaku Font Stroke Width: $value")
    }
// v102.18: Subtitle Text Alignment


internal fun PlayerActivity.showV102SubtitleTextAlignmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102subtitleTextAlignment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Text Alignment",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102subtitleTextAlignment = value
        AppToast.show(this, "Subtitle Text Alignment: $value")
    }
// v102.20: Cast Video AV Sync


internal fun PlayerActivity.showV102CastVideoAVSyncDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102castVideoAVSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video AV Sync",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102castVideoAVSync = value
        AppToast.show(this, "Cast Video AV Sync: $value")
    }
// v102.24: Volume EQ Gain Preamp


internal fun PlayerActivity.showV102VolumeEQGainPreampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102volumeEQGainPreamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume EQ Gain Preamp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102volumeEQGainPreamp = value
        AppToast.show(this, "Volume EQ Gain Preamp: $value")
    }
// v102.26: Playback Loop Segment Count


internal fun PlayerActivity.showV102PlaybackLoopSegmentCountDialog() {
    val options = listOf(1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v102playbackLoopSegmentCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Loop Segment Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102playbackLoopSegmentCount = value
        AppToast.show(this, "Playback Loop Segment Count: $value")
    }
// v102.28: Video Mosaic Effect Custom


internal fun PlayerActivity.showV102VideoMosaicEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v102videoMosaicEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Mosaic Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102videoMosaicEffectCustom = value
        AppToast.show(this, "Video Mosaic Effect Custom: $value")
    }
// v102.29: Danmaku Font Glow Color


internal fun PlayerActivity.showV102DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102danmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102danmakuFontGlowColor = value
        AppToast.show(this, "Danmaku Font Glow Color: $value")
    }
// v102.30: Subtitle Text Transform Custom


internal fun PlayerActivity.showV102SubtitleTextTransformCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102subtitleTextTransformCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Text Transform Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102subtitleTextTransformCustom = value
        AppToast.show(this, "Subtitle Text Transform Custom: $value")
    }
// v103.31: Audio Treble Boost Custom


internal fun PlayerActivity.showV103AudioTrebleBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v103audioTrebleBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Treble Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103audioTrebleBoostCustom = value
        AppToast.show(this, "Audio Treble Boost Custom: $value")
    }
// v103.32: Danmaku Font Glow Radius


internal fun PlayerActivity.showV103DanmakuFontGlowRadiusDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v103danmakuFontGlowRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103danmakuFontGlowRadius = value
        AppToast.show(this, "Danmaku Font Glow Radius: $value")
    }
// v103.33: Subtitle Font Variant Custom


internal fun PlayerActivity.showV103SubtitleFontVariantCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103subtitleFontVariantCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Variant Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103subtitleFontVariantCustom = value
        AppToast.show(this, "Subtitle Font Variant Custom: $value")
    }
// v103.34: Gesture Long Press Drag Action


internal fun PlayerActivity.showV103GestureLongPressDragActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103gestureLongPressDragAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Drag Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103gestureLongPressDragAction = value
        AppToast.show(this, "Gesture Long Press Drag Action: $value")
    }
// v103.35: Cast Video Bit Depth


internal fun PlayerActivity.showV103CastVideoBitDepthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103castVideoBitDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Bit Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103castVideoBitDepth = value
        AppToast.show(this, "Cast Video Bit Depth: $value")
    }
// v103.38: Progress Bar Live Edge Color


internal fun PlayerActivity.showV103ProgressBarLiveEdgeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103progressBarLiveEdgeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Live Edge Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103progressBarLiveEdgeColor = value
        AppToast.show(this, "Progress Bar Live Edge Color: $value")
    }
// v103.42: Screenshot Auto Naming Scheme


internal fun PlayerActivity.showV103ScreenshotAutoNamingSchemeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103screenshotAutoNamingScheme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Naming Scheme",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103screenshotAutoNamingScheme = value
        AppToast.show(this, "Screenshot Auto Naming Scheme: $value")
    }
// v103.43: Video Kaleidoscope Custom


internal fun PlayerActivity.showV103VideoKaleidoscopeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103videoKaleidoscopeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Kaleidoscope Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103videoKaleidoscopeCustom = value
        AppToast.show(this, "Video Kaleidoscope Custom: $value")
    }
// v103.44: Danmaku Font Glow Intensity


internal fun PlayerActivity.showV103DanmakuFontGlowIntensityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v103danmakuFontGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Intensity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103danmakuFontGlowIntensity = value
        AppToast.show(this, "Danmaku Font Glow Intensity: $value")
    }
// v103.45: Subtitle Font Load Custom


internal fun PlayerActivity.showV103SubtitleFontLoadCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103subtitleFontLoadCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Load Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103subtitleFontLoadCustom = value
        AppToast.show(this, "Subtitle Font Load Custom: $value")
    }
// v104.46: Audio Vocal Boost Custom


internal fun PlayerActivity.showV104AudioVocalBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v104audioVocalBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Vocal Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104audioVocalBoostCustom = value
        AppToast.show(this, "Audio Vocal Boost Custom: $value")
    }
// v104.47: Danmaku Font Glow Spread


internal fun PlayerActivity.showV104DanmakuFontGlowSpreadDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v104danmakuFontGlowSpread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Spread",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104danmakuFontGlowSpread = value
        AppToast.show(this, "Danmaku Font Glow Spread: $value")
    }
// v104.48: Subtitle Font Scale Custom


internal fun PlayerActivity.showV104SubtitleFontScaleCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v104subtitleFontScaleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Scale Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104subtitleFontScaleCustom = value
        AppToast.show(this, "Subtitle Font Scale Custom: $value")
    }
// v104.50: Cast Video Field Order


internal fun PlayerActivity.showV104CastVideoFieldOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104castVideoFieldOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Field Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104castVideoFieldOrder = value
        AppToast.show(this, "Cast Video Field Order: $value")
    }
// v104.53: Progress Bar Time Code Format


internal fun PlayerActivity.showV104ProgressBarTimeCodeFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104progressBarTimeCodeFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Time Code Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104progressBarTimeCodeFormat = value
        AppToast.show(this, "Progress Bar Time Code Format: $value")
    }
// v104.54: Volume Audio Channel Map


internal fun PlayerActivity.showV104VolumeAudioChannelMapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104volumeAudioChannelMap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Audio Channel Map",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104volumeAudioChannelMap = value
        AppToast.show(this, "Volume Audio Channel Map: $value")
    }
// v104.58: Video Mirror Flip Custom


internal fun PlayerActivity.showV104VideoMirrorFlipCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104videoMirrorFlipCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Mirror Flip Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104videoMirrorFlipCustom = value
        AppToast.show(this, "Video Mirror Flip Custom: $value")
    }
// v104.60: Subtitle Font Color Custom


internal fun PlayerActivity.showV104SubtitleFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104subtitleFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104subtitleFontColorCustom = value
        AppToast.show(this, "Subtitle Font Color Custom: $value")
    }
// v105.61: Audio Virtual Surround Custom


internal fun PlayerActivity.showV105AudioVirtualSurroundCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v105audioVirtualSurroundCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Virtual Surround Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105audioVirtualSurroundCustom = value
        AppToast.show(this, "Audio Virtual Surround Custom: $value")
    }
// v105.62: Danmaku Font Gradient Start


internal fun PlayerActivity.showV105DanmakuFontGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105danmakuFontGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105danmakuFontGradientStart = value
        AppToast.show(this, "Danmaku Font Gradient Start: $value")
    }
// v105.63: Subtitle Font Alpha Custom


internal fun PlayerActivity.showV105SubtitleFontAlphaCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v105subtitleFontAlphaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Alpha Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105subtitleFontAlphaCustom = value
        AppToast.show(this, "Subtitle Font Alpha Custom: $value")
    }
// v105.64: Gesture Quick Seek Distance


internal fun PlayerActivity.showV105GestureQuickSeekDistanceDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v105gestureQuickSeekDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Quick Seek Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105gestureQuickSeekDistance = value
        AppToast.show(this, "Gesture Quick Seek Distance: $value")
    }
// v105.65: Cast Video Color Space


internal fun PlayerActivity.showV105CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105castVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105castVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
// v105.68: Progress Bar Custom Scale


internal fun PlayerActivity.showV105ProgressBarCustomScaleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105progressBarCustomScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105progressBarCustomScale = value
        AppToast.show(this, "Progress Bar Custom Scale: $value")
    }
// v105.73: Video Rotate Custom


internal fun PlayerActivity.showV105VideoRotateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105videoRotateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105videoRotateCustom = value
        AppToast.show(this, "Video Rotate Custom: $value")
    }
// v105.74: Danmaku Font Gradient End


internal fun PlayerActivity.showV105DanmakuFontGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105danmakuFontGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105danmakuFontGradientEnd = value
        AppToast.show(this, "Danmaku Font Gradient End: $value")
    }
// v105.75: Subtitle Font Stroke Width


internal fun PlayerActivity.showV105SubtitleFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v105subtitleFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stroke Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105subtitleFontStrokeWidth = value
        AppToast.show(this, "Subtitle Font Stroke Width: $value")
    }
// v106.76: Audio Compressor Threshold


internal fun PlayerActivity.showV106AudioCompressorThresholdDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v106audioCompressorThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106audioCompressorThreshold = value
        AppToast.show(this, "Audio Compressor Threshold: $value")
    }
// v106.77: Danmaku Font Gradient Angle


internal fun PlayerActivity.showV106DanmakuFontGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v106danmakuFontGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106danmakuFontGradientAngle = value
        AppToast.show(this, "Danmaku Font Gradient Angle: $value")
    }
// v106.78: Subtitle Font Stroke Color


internal fun PlayerActivity.showV106SubtitleFontStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106subtitleFontStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stroke Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106subtitleFontStrokeColor = value
        AppToast.show(this, "Subtitle Font Stroke Color: $value")
    }
// v106.80: Cast Video Frame Rate Limit


internal fun PlayerActivity.showV106CastVideoFrameRateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106castVideoFrameRateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Frame Rate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106castVideoFrameRateLimit = value
        AppToast.show(this, "Cast Video Frame Rate Limit: $value")
    }
// v106.83: Progress Bar Custom Height


internal fun PlayerActivity.showV106ProgressBarCustomHeightDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v106progressBarCustomHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Height",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106progressBarCustomHeight = value
        AppToast.show(this, "Progress Bar Custom Height: $value")
    }
// v106.84: Volume Bluetooth Codec


internal fun PlayerActivity.showV106VolumeBluetoothCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106volumeBluetoothCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Bluetooth Codec",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106volumeBluetoothCodec = value
        AppToast.show(this, "Volume Bluetooth Codec: $value")
    }
// v106.85: History Filter By Type


internal fun PlayerActivity.showV106HistoryFilterByTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106historyFilterByType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106historyFilterByType = value
        AppToast.show(this, "History Filter By Type: $value")
    }
// v106.88: Video Stretch Custom


internal fun PlayerActivity.showV106VideoStretchCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106videoStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106videoStretchCustom = value
        AppToast.show(this, "Video Stretch Custom: $value")
    }
// v106.89: Danmaku Font Texture Custom


internal fun PlayerActivity.showV106DanmakuFontTextureCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106danmakuFontTextureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106danmakuFontTextureCustom = value
        AppToast.show(this, "Danmaku Font Texture Custom: $value")
    }
// v106.90: Subtitle Font Shadow Color


internal fun PlayerActivity.showV106SubtitleFontShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106subtitleFontShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106subtitleFontShadowColor = value
        AppToast.show(this, "Subtitle Font Shadow Color: $value")
    }
// v107.91: Audio Compressor Ratio


internal fun PlayerActivity.showV107AudioCompressorRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107audioCompressorRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107audioCompressorRatio = value
        AppToast.show(this, "Audio Compressor Ratio: $value")
    }
// v107.92: Danmaku Font Fade Edge Size


internal fun PlayerActivity.showV107DanmakuFontFadeEdgeSizeDialog() {
    val options = listOf(5, 10, 15, 20, 25)
    val currentIndex = options.indexOf(BiliClient.prefs.v107danmakuFontFadeEdgeSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Fade Edge Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107danmakuFontFadeEdgeSize = value
        AppToast.show(this, "Danmaku Font Fade Edge Size: $value")
    }
// v107.93: Subtitle Font Shadow Radius


internal fun PlayerActivity.showV107SubtitleFontShadowRadiusDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v107subtitleFontShadowRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107subtitleFontShadowRadius = value
        AppToast.show(this, "Subtitle Font Shadow Radius: $value")
    }
// v107.95: Cast Video Deinterlace Mode


internal fun PlayerActivity.showV107CastVideoDeinterlaceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107castVideoDeinterlaceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Deinterlace Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107castVideoDeinterlaceMode = value
        AppToast.show(this, "Cast Video Deinterlace Mode: $value")
    }
// v107.98: Progress Bar Custom Margin


internal fun PlayerActivity.showV107ProgressBarCustomMarginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107progressBarCustomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107progressBarCustomMargin = value
        AppToast.show(this, "Progress Bar Custom Margin: $value")
    }
// v107.100: History Filter By Duration


internal fun PlayerActivity.showV107HistoryFilterByDurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107historyFilterByDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107historyFilterByDuration = value
        AppToast.show(this, "History Filter By Duration: $value")
    }
// v107.103: Video Crop Custom


internal fun PlayerActivity.showV107VideoCropCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107videoCropCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107videoCropCustom = value
        AppToast.show(this, "Video Crop Custom: $value")
    }
// v107.104: Danmaku Font Fade Style


internal fun PlayerActivity.showV107DanmakuFontFadeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107danmakuFontFadeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Fade Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107danmakuFontFadeStyle = value
        AppToast.show(this, "Danmaku Font Fade Style: $value")
    }
// v107.105: Subtitle Font Shadow Offset X


internal fun PlayerActivity.showV107SubtitleFontShadowOffsetXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v107subtitleFontShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107subtitleFontShadowOffsetX = value
        AppToast.show(this, "Subtitle Font Shadow Offset X: $value")
    }
// v108.106: Audio Compressor Attack Time


internal fun PlayerActivity.showV108AudioCompressorAttackTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108audioCompressorAttackTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108audioCompressorAttackTime = value
        AppToast.show(this, "Audio Compressor Attack Time: $value")
    }
// v108.108: Subtitle Font Shadow Offset Y


internal fun PlayerActivity.showV108SubtitleFontShadowOffsetYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v108subtitleFontShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108subtitleFontShadowOffsetY = value
        AppToast.show(this, "Subtitle Font Shadow Offset Y: $value")
    }
// v108.110: Cast Video Scaling Mode


internal fun PlayerActivity.showV108CastVideoScalingModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108castVideoScalingMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Scaling Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108castVideoScalingMode = value
        AppToast.show(this, "Cast Video Scaling Mode: $value")
    }
// v108.112: Cache Proxy Mode Custom


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
// v108.113: Progress Bar Custom Opacity


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
// v108.115: History Filter By Date


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
// v108.118: Video Zoom Custom


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
// v108.119: Danmaku Font BG Gradient Type


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
// v109.121: Audio Compressor Release Time


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
// v109.122: Danmaku Font BG Gradient Angle


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
// v109.128: Progress Bar Custom Thumb Delay


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
// v109.129: Volume Audio Focus Priority


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
// v109.130: History Filter By Up


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
// v109.132: Screenshot Crop Auto Ratio


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
// v109.133: Video Blur Background Custom


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
// v109.134: Danmaku Font BG Gradient Opacity


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
// v110.136: Audio Limiter Threshold


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
// v110.137: Danmaku Font Texture Blend Mode


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
// v110.143: Progress Bar Custom Thumb Scale


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
// v110.145: History Filter By Season




