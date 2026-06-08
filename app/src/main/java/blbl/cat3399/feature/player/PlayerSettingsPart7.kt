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
// v169: Danmaku Render Flush Interval


internal fun PlayerActivity.showV169DanmakuRenderFlushIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169danmakuRenderFlushInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169danmakuRenderFlushInterval = value
        AppToast.show(this, "Danmaku Render Flush Interval: $value")
    }
// v170: Audio Gate Mix


internal fun PlayerActivity.showV170AudioGateMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v170audioGateMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170audioGateMix = value
        AppToast.show(this, "Audio Gate Mix: $value")
    }
// v170: Danmaku Render Flush Interval170


internal fun PlayerActivity.showV170DanmakuRenderFlushInterval170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170danmakuRenderFlushInterval170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Interval170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170danmakuRenderFlushInterval170 = value
        AppToast.show(this, "Danmaku Render Flush Interval170: $value")
    }
// v170: Gesture Pinch Out Action


internal fun PlayerActivity.showV170GesturePinchOutActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170gesturePinchOutAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Out Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170gesturePinchOutAction = value
        AppToast.show(this, "Gesture Pinch Out Action: $value")
    }
// v170: Cast Video PIP Resolution Scale170


internal fun PlayerActivity.showV170CastVideoPIPResolutionScale170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170castVideoPIPResolutionScale170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Resolution Scale170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170castVideoPIPResolutionScale170 = value
        AppToast.show(this, "Cast Video PIP Resolution Scale170: $value")
    }
// v170: Cache Cleanup Max Age


internal fun PlayerActivity.showV170CacheCleanupMaxAgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170cacheCleanupMaxAge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Max Age",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170cacheCleanupMaxAge = value
        AppToast.show(this, "Cache Cleanup Max Age: $value")
    }
// v170: Progress Bar Loaded Opacity170


internal fun PlayerActivity.showV170ProgressBarLoadedOpacity170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170progressBarLoadedOpacity170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Opacity170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170progressBarLoadedOpacity170 = value
        AppToast.show(this, "Progress Bar Loaded Opacity170: $value")
    }
// v170: Volume Spatial Mode


internal fun PlayerActivity.showV170VolumeSpatialModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170volumeSpatialMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170volumeSpatialMode = value
        AppToast.show(this, "Volume Spatial Mode: $value")
    }
// v170: Video Sharpen Threshold170


internal fun PlayerActivity.showV170VideoSharpenThreshold170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170videoSharpenThreshold170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Threshold170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170videoSharpenThreshold170 = value
        AppToast.show(this, "Video Sharpen Threshold170: $value")
    }
// v171: Danmaku Scroll Direction


internal fun PlayerActivity.showV171DanmakuScrollDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171danmakuScrollDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171danmakuScrollDirection = value
        AppToast.show(this, "Danmaku Scroll Direction: $value")
    }
// v171: Subtitle Font Spacing


internal fun PlayerActivity.showV171SubtitleFontSpacingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171subtitleFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171subtitleFontSpacing = value
        AppToast.show(this, "Subtitle Font Spacing: $value")
    }
// v171: Gesture Tap Double Action


internal fun PlayerActivity.showV171GestureTapDoubleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171gestureTapDoubleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171gestureTapDoubleAction = value
        AppToast.show(this, "Gesture Tap Double Action: $value")
    }
// v171: Cast Video PIP FPS Limit


internal fun PlayerActivity.showV171CastVideoPIPFPSLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171castVideoPIPFPSLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP FPS Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171castVideoPIPFPSLimit = value
        AppToast.show(this, "Cast Video PIP FPS Limit: $value")
    }
// v171: Cache Disk Quota MB


internal fun PlayerActivity.showV171CacheDiskQuotaMBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171cacheDiskQuotaMB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Disk Quota MB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171cacheDiskQuotaMB = value
        AppToast.show(this, "Cache Disk Quota MB: $value")
    }
// v171: Volume Balance LR


internal fun PlayerActivity.showV171VolumeBalanceLRDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v171volumeBalanceLR).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance LR",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171volumeBalanceLR = value
        AppToast.show(this, "Volume Balance LR: $value")
    }
// v171: Playback Audio Offset


internal fun PlayerActivity.showV171PlaybackAudioOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171playbackAudioOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Audio Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171playbackAudioOffset = value
        AppToast.show(this, "Playback Audio Offset: $value")
    }
// v171: Danmaku Scroll Speed


internal fun PlayerActivity.showV171DanmakuScrollSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171danmakuScrollSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171danmakuScrollSpeed = value
        AppToast.show(this, "Danmaku Scroll Speed: $value")
    }
// v171: Subtitle Line Spacing


internal fun PlayerActivity.showV171SubtitleLineSpacingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171subtitleLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171subtitleLineSpacing = value
        AppToast.show(this, "Subtitle Line Spacing: $value")
    }
// v172: Audio Normalizer Target172


internal fun PlayerActivity.showV172AudioNormalizerTarget172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172audioNormalizerTarget172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Target172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172audioNormalizerTarget172 = value
        AppToast.show(this, "Audio Normalizer Target172: $value")
    }
// v172: Danmaku Scroll Speed172


internal fun PlayerActivity.showV172DanmakuScrollSpeed172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172danmakuScrollSpeed172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172danmakuScrollSpeed172 = value
        AppToast.show(this, "Danmaku Scroll Speed172: $value")
    }
// v172: Subtitle Line Spacing172


internal fun PlayerActivity.showV172SubtitleLineSpacing172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172subtitleLineSpacing172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172subtitleLineSpacing172 = value
        AppToast.show(this, "Subtitle Line Spacing172: $value")
    }
// v172: Gesture Tap Double Action172


internal fun PlayerActivity.showV172GestureTapDoubleAction172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172gestureTapDoubleAction172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172gestureTapDoubleAction172 = value
        AppToast.show(this, "Gesture Tap Double Action172: $value")
    }
// v172: Cast Video PIP FPS Limit172


internal fun PlayerActivity.showV172CastVideoPIPFPSLimit172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172castVideoPIPFPSLimit172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP FPS Limit172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172castVideoPIPFPSLimit172 = value
        AppToast.show(this, "Cast Video PIP FPS Limit172: $value")
    }
// v172: Cache Disk Quota MB172


internal fun PlayerActivity.showV172CacheDiskQuotaMB172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172cacheDiskQuotaMB172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Disk Quota MB172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172cacheDiskQuotaMB172 = value
        AppToast.show(this, "Cache Disk Quota MB172: $value")
    }
// v172: Volume Balance LR172


internal fun PlayerActivity.showV172VolumeBalanceLR172Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v172volumeBalanceLR172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance LR172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172volumeBalanceLR172 = value
        AppToast.show(this, "Volume Balance LR172: $value")
    }
// v172: Playback Audio Offset172


internal fun PlayerActivity.showV172PlaybackAudioOffset172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172playbackAudioOffset172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Audio Offset172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172playbackAudioOffset172 = value
        AppToast.show(this, "Playback Audio Offset172: $value")
    }
// v172: Video Contrast Level172


internal fun PlayerActivity.showV172VideoContrastLevel172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172videoContrastLevel172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Level172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172videoContrastLevel172 = value
        AppToast.show(this, "Video Contrast Level172: $value")
    }
// v172: Subtitle Background Padding


internal fun PlayerActivity.showV172SubtitleBackgroundPaddingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172subtitleBackgroundPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Padding",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172subtitleBackgroundPadding = value
        AppToast.show(this, "Subtitle Background Padding: $value")
    }
// v173: Audio Normalizer Strength173


internal fun PlayerActivity.showV173AudioNormalizerStrength173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173audioNormalizerStrength173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Strength173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173audioNormalizerStrength173 = value
        AppToast.show(this, "Audio Normalizer Strength173: $value")
    }
// v173: Subtitle Background Padding173


internal fun PlayerActivity.showV173SubtitleBackgroundPadding173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173subtitleBackgroundPadding173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Padding173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173subtitleBackgroundPadding173 = value
        AppToast.show(this, "Subtitle Background Padding173: $value")
    }
// v173: Gesture Tap Triple Action


internal fun PlayerActivity.showV173GestureTapTripleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173gestureTapTripleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173gestureTapTripleAction = value
        AppToast.show(this, "Gesture Tap Triple Action: $value")
    }
// v173: Progress Bar Scrub Preview Size


internal fun PlayerActivity.showV173ProgressBarScrubPreviewSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173progressBarScrubPreviewSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Preview Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173progressBarScrubPreviewSize = value
        AppToast.show(this, "Progress Bar Scrub Preview Size: $value")
    }
// v173: Playback Subtitle Offset


internal fun PlayerActivity.showV173PlaybackSubtitleOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173playbackSubtitleOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Subtitle Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173playbackSubtitleOffset = value
        AppToast.show(this, "Playback Subtitle Offset: $value")
    }
// v173: Video Contrast Level173


internal fun PlayerActivity.showV173VideoContrastLevel173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173videoContrastLevel173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Level173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173videoContrastLevel173 = value
        AppToast.show(this, "Video Contrast Level173: $value")
    }
// v173: Danmaku Scroll Max Lines


internal fun PlayerActivity.showV173DanmakuScrollMaxLinesDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173danmakuScrollMaxLines).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Max Lines",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173danmakuScrollMaxLines = value
        AppToast.show(this, "Danmaku Scroll Max Lines: $value")
    }
// v173: Subtitle Background Round


internal fun PlayerActivity.showV173SubtitleBackgroundRoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173subtitleBackgroundRound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Round",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173subtitleBackgroundRound = value
        AppToast.show(this, "Subtitle Background Round: $value")
    }
// v174: Audio Normalizer Attack174


internal fun PlayerActivity.showV174AudioNormalizerAttack174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174audioNormalizerAttack174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Attack174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174audioNormalizerAttack174 = value
        AppToast.show(this, "Audio Normalizer Attack174: $value")
    }
// v174: Danmaku Scroll Max Lines174


internal fun PlayerActivity.showV174DanmakuScrollMaxLines174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174danmakuScrollMaxLines174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Max Lines174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174danmakuScrollMaxLines174 = value
        AppToast.show(this, "Danmaku Scroll Max Lines174: $value")
    }
// v174: Subtitle Background Round174


internal fun PlayerActivity.showV174SubtitleBackgroundRound174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174subtitleBackgroundRound174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Round174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174subtitleBackgroundRound174 = value
        AppToast.show(this, "Subtitle Background Round174: $value")
    }
// v174: Gesture Tap Triple Action174


internal fun PlayerActivity.showV174GestureTapTripleAction174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174gestureTapTripleAction174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174gestureTapTripleAction174 = value
        AppToast.show(this, "Gesture Tap Triple Action174: $value")
    }
// v174: Cache Compress Level174


internal fun PlayerActivity.showV174CacheCompressLevel174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174cacheCompressLevel174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174cacheCompressLevel174 = value
        AppToast.show(this, "Cache Compress Level174: $value")
    }
// v174: Playback Subtitle Offset174


internal fun PlayerActivity.showV174PlaybackSubtitleOffset174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174playbackSubtitleOffset174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Subtitle Offset174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174playbackSubtitleOffset174 = value
        AppToast.show(this, "Playback Subtitle Offset174: $value")
    }
// v174: Danmaku Scroll Overlap Mode


internal fun PlayerActivity.showV174DanmakuScrollOverlapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174danmakuScrollOverlapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174danmakuScrollOverlapMode = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode: $value")
    }
// v175: Audio Compressor Ratio175


internal fun PlayerActivity.showV175AudioCompressorRatio175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175audioCompressorRatio175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175audioCompressorRatio175 = value
        AppToast.show(this, "Audio Compressor Ratio175: $value")
    }
// v175: Danmaku Scroll Overlap Mode175


internal fun PlayerActivity.showV175DanmakuScrollOverlapMode175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollOverlapMode175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollOverlapMode175 = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode175: $value")
    }
// v175: Gesture Double Tap Seek


internal fun PlayerActivity.showV175GestureDoubleTapSeekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175gestureDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175gestureDoubleTapSeek = value
        AppToast.show(this, "Gesture Double Tap Seek: $value")
    }
// v175: Cast Video PIP Disconnect Action


internal fun PlayerActivity.showV175CastVideoPIPDisconnectActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175castVideoPIPDisconnectAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Disconnect Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175castVideoPIPDisconnectAction = value
        AppToast.show(this, "Cast Video PIP Disconnect Action: $value")
    }
// v175: Cache Compress Level175


internal fun PlayerActivity.showV175CacheCompressLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175cacheCompressLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175cacheCompressLevel175 = value
        AppToast.show(this, "Cache Compress Level175: $value")
    }
// v175: Playback Video Offset


internal fun PlayerActivity.showV175PlaybackVideoOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175playbackVideoOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175playbackVideoOffset = value
        AppToast.show(this, "Playback Video Offset: $value")
    }
// v175: Video Saturation Level175


internal fun PlayerActivity.showV175VideoSaturationLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175videoSaturationLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175videoSaturationLevel175 = value
        AppToast.show(this, "Video Saturation Level175: $value")
    }
// v175: Danmaku Scroll Filter


internal fun PlayerActivity.showV175DanmakuScrollFilterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollFilter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollFilter = value
        AppToast.show(this, "Danmaku Scroll Filter: $value")
    }
// v175: Subtitle Shadow Color


internal fun PlayerActivity.showV175SubtitleShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175subtitleShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175subtitleShadowColor = value
        AppToast.show(this, "Subtitle Shadow Color: $value")
    }
// v176: Audio Compressor Ratio176


internal fun PlayerActivity.showV176AudioCompressorRatio176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176audioCompressorRatio176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176audioCompressorRatio176 = value
        AppToast.show(this, "Audio Compressor Ratio176: $value")
    }
// v176: Danmaku Scroll Filter176


internal fun PlayerActivity.showV176DanmakuScrollFilter176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176danmakuScrollFilter176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176danmakuScrollFilter176 = value
        AppToast.show(this, "Danmaku Scroll Filter176: $value")
    }
// v176: Subtitle Shadow Color176


internal fun PlayerActivity.showV176SubtitleShadowColor176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowColor176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowColor176 = value
        AppToast.show(this, "Subtitle Shadow Color176: $value")
    }
// v176: Gesture Double Tap Seek176


internal fun PlayerActivity.showV176GestureDoubleTapSeek176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176gestureDoubleTapSeek176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176gestureDoubleTapSeek176 = value
        AppToast.show(this, "Gesture Double Tap Seek176: $value")
    }
// v176: Cache Stream Buffer Size


internal fun PlayerActivity.showV176CacheStreamBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176cacheStreamBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176cacheStreamBufferSize = value
        AppToast.show(this, "Cache Stream Buffer Size: $value")
    }
// v176: Playback Video Offset176


internal fun PlayerActivity.showV176PlaybackVideoOffset176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176playbackVideoOffset176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176playbackVideoOffset176 = value
        AppToast.show(this, "Playback Video Offset176: $value")
    }
// v176: Video Saturation Level176


internal fun PlayerActivity.showV176VideoSaturationLevel176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176videoSaturationLevel176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176videoSaturationLevel176 = value
        AppToast.show(this, "Video Saturation Level176: $value")
    }
// v176: Subtitle Shadow Blur


internal fun PlayerActivity.showV176SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
// v177: Audio Compressor Knee177


internal fun PlayerActivity.showV177AudioCompressorKnee177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177audioCompressorKnee177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Knee177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177audioCompressorKnee177 = value
        AppToast.show(this, "Audio Compressor Knee177: $value")
    }
// v177: Subtitle Shadow Blur177


internal fun PlayerActivity.showV177SubtitleShadowBlur177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowBlur177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowBlur177 = value
        AppToast.show(this, "Subtitle Shadow Blur177: $value")
    }
// v177: Playlist Max History Size


internal fun PlayerActivity.showV177PlaylistMaxHistorySizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177playlistMaxHistorySize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177playlistMaxHistorySize = value
        AppToast.show(this, "Playlist Max History Size: $value")
    }
// v177: Cache Stream Buffer Size177


internal fun PlayerActivity.showV177CacheStreamBufferSize177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177cacheStreamBufferSize177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177cacheStreamBufferSize177 = value
        AppToast.show(this, "Cache Stream Buffer Size177: $value")
    }
// v177: Subtitle Shadow Offset


internal fun PlayerActivity.showV177SubtitleShadowOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowOffset = value
        AppToast.show(this, "Subtitle Shadow Offset: $value")
    }
// v178: Audio Compressor Attack178


internal fun PlayerActivity.showV178AudioCompressorAttack178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178audioCompressorAttack178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178audioCompressorAttack178 = value
        AppToast.show(this, "Audio Compressor Attack178: $value")
    }
// v178: Subtitle Shadow Offset178


internal fun PlayerActivity.showV178SubtitleShadowOffset178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178subtitleShadowOffset178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178subtitleShadowOffset178 = value
        AppToast.show(this, "Subtitle Shadow Offset178: $value")
    }
// v178: Playlist Max History Size178


internal fun PlayerActivity.showV178PlaylistMaxHistorySize178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178playlistMaxHistorySize178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178playlistMaxHistorySize178 = value
        AppToast.show(this, "Playlist Max History Size178: $value")
    }
// v178: Video Brightness Level178


internal fun PlayerActivity.showV178VideoBrightnessLevel178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178videoBrightnessLevel178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178videoBrightnessLevel178 = value
        AppToast.show(this, "Video Brightness Level178: $value")
    }
// v178: Danmaku Scroll Priority


internal fun PlayerActivity.showV178DanmakuScrollPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178danmakuScrollPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178danmakuScrollPriority = value
        AppToast.show(this, "Danmaku Scroll Priority: $value")
    }
// v179: Audio Compressor Release179


internal fun PlayerActivity.showV179AudioCompressorRelease179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179audioCompressorRelease179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179audioCompressorRelease179 = value
        AppToast.show(this, "Audio Compressor Release179: $value")
    }
// v179: Danmaku Scroll Priority179


internal fun PlayerActivity.showV179DanmakuScrollPriority179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179danmakuScrollPriority179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179danmakuScrollPriority179 = value
        AppToast.show(this, "Danmaku Scroll Priority179: $value")
    }
// v179: Progress Bar Scrub Gesture


internal fun PlayerActivity.showV179ProgressBarScrubGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179progressBarScrubGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179progressBarScrubGesture = value
        AppToast.show(this, "Progress Bar Scrub Gesture: $value")
    }
// v179: Playback Rotate Video


internal fun PlayerActivity.showV179PlaybackRotateVideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179playbackRotateVideo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179playbackRotateVideo = value
        AppToast.show(this, "Playback Rotate Video: $value")
    }
// v179: Video Brightness Level179


internal fun PlayerActivity.showV179VideoBrightnessLevel179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179videoBrightnessLevel179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179videoBrightnessLevel179 = value
        AppToast.show(this, "Video Brightness Level179: $value")
    }
// v179: Subtitle Outline Color179


internal fun PlayerActivity.showV179SubtitleOutlineColor179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179subtitleOutlineColor179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179subtitleOutlineColor179 = value
        AppToast.show(this, "Subtitle Outline Color179: $value")
    }
// v180: Audio Compressor Mix180


internal fun PlayerActivity.showV180AudioCompressorMix180Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v180audioCompressorMix180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Mix180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180audioCompressorMix180 = value
        AppToast.show(this, "Audio Compressor Mix180: $value")
    }
// v180: Subtitle Outline Color180


internal fun PlayerActivity.showV180SubtitleOutlineColor180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineColor180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineColor180 = value
        AppToast.show(this, "Subtitle Outline Color180: $value")
    }
// v180: Cast Video PIP Sync Mode


internal fun PlayerActivity.showV180CastVideoPIPSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180castVideoPIPSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180castVideoPIPSyncMode = value
        AppToast.show(this, "Cast Video PIP Sync Mode: $value")
    }
// v180: Progress Bar Scrub Gesture180


internal fun PlayerActivity.showV180ProgressBarScrubGesture180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180progressBarScrubGesture180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180progressBarScrubGesture180 = value
        AppToast.show(this, "Progress Bar Scrub Gesture180: $value")
    }
// v180: Playback Rotate Video180


internal fun PlayerActivity.showV180PlaybackRotateVideo180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180playbackRotateVideo180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180playbackRotateVideo180 = value
        AppToast.show(this, "Playback Rotate Video180: $value")
    }
// v180: Danmaku Scroll Merge Mode


internal fun PlayerActivity.showV180DanmakuScrollMergeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180danmakuScrollMergeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Merge Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180danmakuScrollMergeMode = value
        AppToast.show(this, "Danmaku Scroll Merge Mode: $value")
    }
// v180: Subtitle Outline Width180


internal fun PlayerActivity.showV180SubtitleOutlineWidth180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineWidth180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineWidth180 = value
        AppToast.show(this, "Subtitle Outline Width180: $value")
    }
// v181: Danmaku Fixed Position


internal fun PlayerActivity.showV181DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
// v181: Subtitle Bg Color Alpha


internal fun PlayerActivity.showV181SubtitleBgColorAlphaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha = value
        AppToast.show(this, "Subtitle Bg Color Alpha: $value")
    }
// v181: Gesture Edge Swipe Left


internal fun PlayerActivity.showV181GestureEdgeSwipeLeftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181gestureEdgeSwipeLeft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Left",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181gestureEdgeSwipeLeft = value
        AppToast.show(this, "Gesture Edge Swipe Left: $value")
    }
// v181: Cast Audio Bitrate


internal fun PlayerActivity.showV181CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181castAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181castAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
// v181: Progress Bar Thumb Size


internal fun PlayerActivity.showV181ProgressBarThumbSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181progressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181progressBarThumbSize = value
        AppToast.show(this, "Progress Bar Thumb Size: $value")
    }
// v181: Danmaku Fixed Position181


internal fun PlayerActivity.showV181DanmakuFixedPosition181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition181 = value
        AppToast.show(this, "Danmaku Fixed Position181: $value")
    }
// v181: Subtitle Bg Color Alpha181


internal fun PlayerActivity.showV181SubtitleBgColorAlpha181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha181 = value
        AppToast.show(this, "Subtitle Bg Color Alpha181: $value")
    }
// v182: Audio Reverb Decay182


internal fun PlayerActivity.showV182AudioReverbDecay182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182audioReverbDecay182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182audioReverbDecay182 = value
        AppToast.show(this, "Audio Reverb Decay182: $value")
    }
// v182: Danmaku Fixed Font182


internal fun PlayerActivity.showV182DanmakuFixedFont182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedFont182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Font182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedFont182 = value
        AppToast.show(this, "Danmaku Fixed Font182: $value")
    }
// v182: Subtitle Bg Color Alpha182


internal fun PlayerActivity.showV182SubtitleBgColorAlpha182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColorAlpha182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColorAlpha182 = value
        AppToast.show(this, "Subtitle Bg Color Alpha182: $value")
    }
// v182: Gesture Edge Swipe Right182


internal fun PlayerActivity.showV182GestureEdgeSwipeRight182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182gestureEdgeSwipeRight182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Right182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182gestureEdgeSwipeRight182 = value
        AppToast.show(this, "Gesture Edge Swipe Right182: $value")
    }
// v182: Cast Audio Bitrate182


internal fun PlayerActivity.showV182CastAudioBitrate182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182castAudioBitrate182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182castAudioBitrate182 = value
        AppToast.show(this, "Cast Audio Bitrate182: $value")
    }
// v182: Progress Bar Thumb Size182


internal fun PlayerActivity.showV182ProgressBarThumbSize182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182progressBarThumbSize182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182progressBarThumbSize182 = value
        AppToast.show(this, "Progress Bar Thumb Size182: $value")
    }
// v182: Volume Boost Level182


internal fun PlayerActivity.showV182VolumeBoostLevel182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182volumeBoostLevel182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182volumeBoostLevel182 = value
        AppToast.show(this, "Volume Boost Level182: $value")
    }
// v182: Video HDR10 Level182


internal fun PlayerActivity.showV182VideoHDR10Level182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182videoHDR10Level182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182videoHDR10Level182 = value
        AppToast.show(this, "Video HDR10 Level182: $value")
    }
// v182: Danmaku Fixed Speed


internal fun PlayerActivity.showV182DanmakuFixedSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedSpeed = value
        AppToast.show(this, "Danmaku Fixed Speed: $value")
    }
// v182: Subtitle Bg Color


internal fun PlayerActivity.showV182SubtitleBgColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColor = value
        AppToast.show(this, "Subtitle Bg Color: $value")
    }
// v183: Audio Reverb Decay183


internal fun PlayerActivity.showV183AudioReverbDecay183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183audioReverbDecay183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183audioReverbDecay183 = value
        AppToast.show(this, "Audio Reverb Decay183: $value")
    }
// v183: Danmaku Fixed Speed183


internal fun PlayerActivity.showV183DanmakuFixedSpeed183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedSpeed183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedSpeed183 = value
        AppToast.show(this, "Danmaku Fixed Speed183: $value")
    }
// v183: Subtitle Bg Color183


internal fun PlayerActivity.showV183SubtitleBgColor183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor183 = value
        AppToast.show(this, "Subtitle Bg Color183: $value")
    }
// v183: Gesture Edge Swipe Up183


internal fun PlayerActivity.showV183GestureEdgeSwipeUp183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183gestureEdgeSwipeUp183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Up183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183gestureEdgeSwipeUp183 = value
        AppToast.show(this, "Gesture Edge Swipe Up183: $value")
    }
// v183: Cast Audio Channel


internal fun PlayerActivity.showV183CastAudioChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183castAudioChannel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183castAudioChannel = value
        AppToast.show(this, "Cast Audio Channel: $value")
    }
// v183: Volume Boost Level183


