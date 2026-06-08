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
// v158: Subtitle Animation Blur158




