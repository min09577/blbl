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

internal fun PlayerActivity.showV23VideoColorTemperatureDialog() {
    val options = listOf(3000, 4000, 5000, 6500, 8000, 10000)
    val currentIndex = options.indexOf(BiliClient.prefs.v23VideoColorTemperature).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(
        title = "色彩温度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 3000 -> "暖色(3000K)"; 4000 -> "偏暖(4000K)"; 5000 -> "中性(5000K)"; 6500 -> "标准(6500K)"; 8000 -> "偏冷(8000K)"; 10000 -> "冷色(10000K)"; else -> "标准(6500K)" } },
    ) { temperature ->
        BiliClient.prefs.v23VideoColorTemperature = temperature
        AppToast.show(this, "色彩温度：${temperature}K")
    }
// v23.4: 弹幕发送震动强度


internal fun PlayerActivity.showV23GestureSensitivityDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v23GestureSensitivity).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "手势灵敏度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 10 -> "极低"; 25 -> "低"; 50 -> "中等"; 75 -> "高"; 100 -> "极高"; else -> "中等" } },
    ) { sensitivity ->
        BiliClient.prefs.v23GestureSensitivity = sensitivity
        AppToast.show(this, "手势灵敏度：$sensitivity%")
    }
// v23.6: 视频缓存预加载大小


internal fun PlayerActivity.showV23ScreenshotQualityDialog() {
    val options = listOf(50, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v23ScreenshotQuality).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(
        title = "截图质量",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { quality ->
        BiliClient.prefs.v23ScreenshotQuality = quality
        AppToast.show(this, "截图质量：$quality%")
    }
// v23.14: 视频画面色调调节


internal fun PlayerActivity.showV24PlaylistLoopModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("顺序播放", "列表循环", "单曲循环", "随机播放")
    val currentIndex = options.indexOf(BiliClient.prefs.v24PlaylistLoopMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "播放列表循环模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v24PlaylistLoopMode = mode
        AppToast.show(this, "循环模式：${labels[options.indexOf(mode)]}")
    }
// v24.2: 弹幕字体描边粗细（已存在同名函数，使用v24前缀）


internal fun PlayerActivity.showV24DanmakuStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v24DanmakuStrokeWidth).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "弹幕描边粗细",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "无描边"; 1 -> "细"; 2 -> "中等"; 3 -> "粗"; 4 -> "很粗"; 5 -> "极粗"; else -> "中等" } },
    ) { width ->
        BiliClient.prefs.v24DanmakuStrokeWidth = width
        AppToast.show(this, "描边粗细：$width")
    }
// v24.3: 视频画面亮度曲线


internal fun PlayerActivity.showV24ProgressBarStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("默认", "细线", "粗线", "渐变")
    val currentIndex = options.indexOf(BiliClient.prefs.v24ProgressBarStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "进度条样式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { style ->
        BiliClient.prefs.v24ProgressBarStyle = style
        AppToast.show(this, "进度条样式：${labels[options.indexOf(style)]}")
    }
// v24.11: 视频投射画面质量


internal fun PlayerActivity.showV24DanmakuStrokeOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v24DanmakuStrokeOpacity).takeIf { it >= 0 } ?: 4
    showSettingsChoiceDialog(
        title = "弹幕描边透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { opacity ->
        BiliClient.prefs.v24DanmakuStrokeOpacity = opacity
        AppToast.show(this, "描边透明度：$opacity%")
    }
// v24.13: 播放器手势双击功能


internal fun PlayerActivity.showV24DanmakuRefreshRateDialog() {
    val options = listOf(30, 60, 90, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v24DanmakuRefreshRate).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "弹幕刷新率",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}Hz" },
    ) { rate ->
        BiliClient.prefs.v24DanmakuRefreshRate = rate
        AppToast.show(this, "弹幕刷新率：${rate}Hz")
    }
// v25.2: 弹幕字体背景颜色


internal fun PlayerActivity.showV26ContrastCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "柔和", "高对比", "极高对比", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v26ContrastCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "对比度曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v26ContrastCurveMode = mode
        AppToast.show(this, "对比度曲线：${labels[options.indexOf(mode)]}")
    }
// v26.5: 播放器音量均衡


internal fun PlayerActivity.showV26CachePreloadSizeDialog() {
    val options = listOf(10, 25, 50, 100, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v26CachePreloadSize).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "缓存预加载大小",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}MB" },
    ) { size ->
        BiliClient.prefs.v26CachePreloadSize = size
        AppToast.show(this, "预加载大小：${size}MB")
    }
// v26.7: 弹幕显示透明度


internal fun PlayerActivity.showV26BrightnessCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "柔和", "明亮", "高对比", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v26BrightnessCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "亮度曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v26BrightnessCurveMode = mode
        AppToast.show(this, "亮度曲线：${labels[options.indexOf(mode)]}")
    }
// v26.9: 弹幕发送历史记录数


internal fun PlayerActivity.showV26SaturationCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "低饱和", "高饱和", "极高饱和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v26SaturationCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "饱和度曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v26SaturationCurveMode = mode
        AppToast.show(this, "饱和度曲线：${labels[options.indexOf(mode)]}")
    }
// v26.15: 弹幕显示字体样式


internal fun PlayerActivity.showV27ToneCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "暖色调", "冷色调", "复古", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v27ToneCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "色调曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v27ToneCurveMode = mode
        AppToast.show(this, "色调曲线：${labels[options.indexOf(mode)]}")
    }
// v27.9: 弹幕发送历史记录大小


internal fun PlayerActivity.showV27DoubleTapFunctionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "播放/暂停", "下一个视频", "上一个视频", "切换弹幕", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v27DoubleTapFunction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "双击功能",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { func ->
        BiliClient.prefs.v27DoubleTapFunction = func
        AppToast.show(this, "双击功能：${labels[options.indexOf(func)]}")
    }
// v27.14: 视频画面降噪强度


internal fun PlayerActivity.showV27DanmakuFontSpacingDialog() {
    val options = listOf(-5, -2, 0, 2, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v27DanmakuFontSpacing).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "弹幕字体间距",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -5 -> "紧密(-5)"; -2 -> "较紧密(-2)"; 0 -> "标准(0)"; 2 -> "较宽松(+2)"; 5 -> "宽松(+5)"; 10 -> "很宽松(+10)"; else -> "标准(0)" } },
    ) { spacing ->
        BiliClient.prefs.v27DanmakuFontSpacing = spacing
        AppToast.show(this, "字体间距：$spacing")
    }
// v28.2: 弹幕字体背景圆角


internal fun PlayerActivity.showV28ColorSaturationDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v28ColorSaturation).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩饱和度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "低(-50)"; -25 -> "较低(-25)"; 0 -> "标准(0)"; 25 -> "较高(+25)"; 50 -> "高(+50)"; else -> "标准(0)" } },
    ) { saturation ->
        BiliClient.prefs.v28ColorSaturation = saturation
        AppToast.show(this, "色彩饱和度：$saturation")
    }
// v28.4: 弹幕发送确认震动强度


internal fun PlayerActivity.showV28ColorContrastDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v28ColorContrast).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩对比度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "低(-50)"; -25 -> "较低(-25)"; 0 -> "标准(0)"; 25 -> "较高(+25)"; 50 -> "高(+50)"; else -> "标准(0)" } },
    ) { contrast ->
        BiliClient.prefs.v28ColorContrast = contrast
        AppToast.show(this, "色彩对比度：$contrast")
    }
// v28.9: 弹幕发送历史记录清理


internal fun PlayerActivity.showV28ProgressBarCornerRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v28ProgressBarCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "进度条圆角",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}px" },
    ) { radius ->
        BiliClient.prefs.v28ProgressBarCornerRadius = radius
        AppToast.show(this, "进度条圆角：${radius}px")
    }
// v28.11: 视频投射画面缓冲


internal fun PlayerActivity.showV28CastBufferDialog() {
    val options = listOf(1, 3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v28CastBuffer).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "投射缓冲",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}秒" },
    ) { buffer ->
        BiliClient.prefs.v28CastBuffer = buffer
        AppToast.show(this, "投射缓冲：${buffer}秒")
    }
// v28.12: 弹幕字体背景边距


internal fun PlayerActivity.showV28SwipeSensitivityDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v28SwipeSensitivity).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "滑动灵敏度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 10 -> "低(10)"; 25 -> "较低(25)"; 50 -> "中(50)"; 75 -> "较高(75)"; 100 -> "高(100)"; else -> "中(50)" } },
    ) { sensitivity ->
        BiliClient.prefs.v28SwipeSensitivity = sensitivity
        AppToast.show(this, "滑动灵敏度：$sensitivity")
    }
// v28.14: 视频画面色彩亮度


internal fun PlayerActivity.showV28ColorBrightnessDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v28ColorBrightness).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩亮度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "暗(-50)"; -25 -> "较暗(-25)"; 0 -> "标准(0)"; 25 -> "较亮(+25)"; 50 -> "亮(+50)"; else -> "标准(0)" } },
    ) { brightness ->
        BiliClient.prefs.v28ColorBrightness = brightness
        AppToast.show(this, "色彩亮度：$brightness")
    }
// v28.15: 弹幕显示字体阴影


internal fun PlayerActivity.showV29ColorHueDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v29ColorHue).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩色调",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "冷色(-50)"; -25 -> "较冷(-25)"; 0 -> "标准(0)"; 25 -> "较暖(+25)"; 50 -> "暖色(+50)"; else -> "标准(0)" } },
    ) { hue ->
        BiliClient.prefs.v29ColorHue = hue
        AppToast.show(this, "色彩色调：$hue")
    }
// v29.4: 弹幕发送确认对话框样式


internal fun PlayerActivity.showV29DanmakuPositionOffsetDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v29DanmakuPositionOffset).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "位置偏移",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "上移(-50)"; -25 -> "上移(-25)"; 0 -> "标准(0)"; 25 -> "下移(+25)"; 50 -> "下移(+50)"; else -> "标准(0)" } },
    ) { offset ->
        BiliClient.prefs.v29DanmakuPositionOffset = offset
        AppToast.show(this, "位置偏移：$offset")
    }
// v29.8: 视频画面色彩色温


internal fun PlayerActivity.showV29ColorTemperatureDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v29ColorTemperature).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩色温",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "冷色(-50)"; -25 -> "较冷(-25)"; 0 -> "标准(0)"; 25 -> "较暖(+25)"; 50 -> "暖色(+50)"; else -> "标准(0)" } },
    ) { temp ->
        BiliClient.prefs.v29ColorTemperature = temp
        AppToast.show(this, "色彩色温：$temp")
    }
// v29.10: 播放器进度条样式


internal fun PlayerActivity.showV29ProgressBarStyleDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("默认", "细线", "粗线", "渐变", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v29ProgressBarStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "进度条样式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { style ->
        BiliClient.prefs.v29ProgressBarStyle = style
        AppToast.show(this, "进度条样式：${labels[options.indexOf(style)]}")
    }
// v29.11: 视频投射画面质量


internal fun PlayerActivity.showV29CastQualityDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "流畅", "标清", "高清")
    val currentIndex = options.indexOf(BiliClient.prefs.v29CastQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "投射质量",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { quality ->
        BiliClient.prefs.v29CastQuality = quality
        AppToast.show(this, "投射质量：${labels[options.indexOf(quality)]}")
    }
// v29.12: 弹幕字体背景透明度


internal fun PlayerActivity.showV29LongPressFunctionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "播放/暂停", "下一个视频", "上一个视频", "切换弹幕", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v29LongPressFunction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "长按功能",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { func ->
        BiliClient.prefs.v29LongPressFunction = func
        AppToast.show(this, "长按功能：${labels[options.indexOf(func)]}")
    }
// v29.14: 视频画面色彩伽马


internal fun PlayerActivity.showV29ColorGammaDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v29ColorGamma).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩伽马",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "低(-50)"; -25 -> "较低(-25)"; 0 -> "标准(0)"; 25 -> "较高(+25)"; 50 -> "高(+50)"; else -> "标准(0)" } },
    ) { gamma ->
        BiliClient.prefs.v29ColorGamma = gamma
        AppToast.show(this, "色彩伽马：$gamma")
    }
// v29.15: 弹幕显示字体描边


internal fun PlayerActivity.showV30ColorSharpenDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v30ColorSharpen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "色彩锐化",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { sharpen ->
        BiliClient.prefs.v30ColorSharpen = sharpen
        AppToast.show(this, "色彩锐化：$sharpen")
    }
// v30.4: 弹幕发送确认震动模式


internal fun PlayerActivity.showV30VibrationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "短震", "长震", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v30VibrationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "震动模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v30VibrationMode = mode
        AppToast.show(this, "震动模式：${labels[options.indexOf(mode)]}")
    }
// v30.5: 播放器音量限制阈值


internal fun PlayerActivity.showV30VolumeLimitThresholdDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v30VolumeLimitThreshold).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "音量限制阈值",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}%" },
    ) { threshold ->
        BiliClient.prefs.v30VolumeLimitThreshold = threshold
        AppToast.show(this, "音量限制阈值：${threshold}%")
    }
// v30.6: 视频缓存清理模式


internal fun PlayerActivity.showV30CacheCleanupModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "手动", "定时", "智能")
    val currentIndex = options.indexOf(BiliClient.prefs.v30CacheCleanupMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "清理模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v30CacheCleanupMode = mode
        AppToast.show(this, "清理模式：${labels[options.indexOf(mode)]}")
    }
// v30.7: 弹幕显示位置对齐方式


internal fun PlayerActivity.showV30DanmakuPositionAlignModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("默认", "左对齐", "居中", "右对齐")
    val currentIndex = options.indexOf(BiliClient.prefs.v30DanmakuPositionAlignMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "对齐方式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { align ->
        BiliClient.prefs.v30DanmakuPositionAlignMode = align
        AppToast.show(this, "对齐方式：${labels[options.indexOf(align)]}")
    }
// v30.8: 视频画面色彩降噪


internal fun PlayerActivity.showV30ColorDenoiseDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v30ColorDenoise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "色彩降噪",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { denoise ->
        BiliClient.prefs.v30ColorDenoise = denoise
        AppToast.show(this, "色彩降噪：$denoise")
    }
// v30.10: 播放器进度条颜色


internal fun PlayerActivity.showV30ProgressBarColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v30ProgressBarColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "进度条颜色",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { color ->
        BiliClient.prefs.v30ProgressBarColor = color
        AppToast.show(this, "进度条颜色：${labels[options.indexOf(color)]}")
    }
// v30.11: 视频投射画面延迟


internal fun PlayerActivity.showV30CastLatencyDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v30CastLatency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "投射延迟",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 100 -> "100ms"; 200 -> "200ms"; 300 -> "300ms"; 500 -> "500ms"; else -> "关闭" } },
    ) { latency ->
        BiliClient.prefs.v30CastLatency = latency
        AppToast.show(this, "投射延迟：${latency}ms")
    }
// v30.12: 弹幕字体背景阴影


internal fun PlayerActivity.showV30DanmakuBackgroundShadowDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v30DanmakuBackgroundShadow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "背景阴影",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { shadow ->
        BiliClient.prefs.v30DanmakuBackgroundShadow = shadow
        AppToast.show(this, "背景阴影：$shadow")
    }
// v30.13: 播放器手势滑动功能


internal fun PlayerActivity.showV30SwipeFunctionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "播放/暂停", "下一个视频", "上一个视频", "切换弹幕", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v30SwipeFunction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "滑动功能",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { func ->
        BiliClient.prefs.v30SwipeFunction = func
        AppToast.show(this, "滑动功能：${labels[options.indexOf(func)]}")
    }
// v30.14: 视频画面色彩模糊


internal fun PlayerActivity.showV30ColorBlurDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v30ColorBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "色彩模糊",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { blur ->
        BiliClient.prefs.v30ColorBlur = blur
        AppToast.show(this, "色彩模糊：$blur")
    }
// v30.15: 弹幕显示字体发光


internal fun PlayerActivity.showV31DanmakuBackgroundGradientDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "线性", "径向", "角度", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuBackgroundGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景渐变", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v31DanmakuBackgroundGradient = gradient; AppToast.show(this, "背景渐变：${labels[options.indexOf(gradient)]}") }
}

internal fun PlayerActivity.showV31ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v31ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV31VibrationIntervalDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v31VibrationInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动间隔", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "关闭" else "${v}ms" }) { interval -> BiliClient.prefs.v31VibrationInterval = interval; AppToast.show(this, "震动间隔：${if (interval == 0) "关闭" else "${interval}ms"}") }
}

internal fun PlayerActivity.showV31CacheCleanupPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("低", "中", "高", "最高")
    val currentIndex = options.indexOf(BiliClient.prefs.v31CacheCleanupPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理优先级", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { priority -> BiliClient.prefs.v31CacheCleanupPriority = priority; AppToast.show(this, "清理优先级：${labels[options.indexOf(priority)]}") }
}

internal fun PlayerActivity.showV31DanmakuPositionAlignOffsetDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuPositionAlignOffset).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "对齐偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "左移(-50)"; -25 -> "左移(-25)"; 0 -> "标准(0)"; 25 -> "右移(+25)"; 50 -> "右移(+50)"; else -> "标准(0)" } }) { offset -> BiliClient.prefs.v31DanmakuPositionAlignOffset = offset; AppToast.show(this, "对齐偏移：$offset") }
}

internal fun PlayerActivity.showV31ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v31ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV31ProgressBarAnimationDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("无", "淡入淡出", "滑动", "缩放", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ProgressBarAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条动画", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { animation -> BiliClient.prefs.v31ProgressBarAnimation = animation; AppToast.show(this, "进度条动画：${labels[options.indexOf(animation)]}") }
}

internal fun PlayerActivity.showV31CastBufferStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "保守", "激进", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31CastBufferStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v31CastBufferStrategy = strategy; AppToast.show(this, "缓冲策略：${labels[options.indexOf(strategy)]}") }
}

internal fun PlayerActivity.showV31DanmakuBackgroundGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("上到下", "左到右", "对角", "径向")
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuBackgroundGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v31DanmakuBackgroundGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

internal fun PlayerActivity.showV31SwipeThresholdDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v31SwipeThreshold).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动阈值", options = options, checkedIndex = currentIndex, label = { v -> "${v}px" }) { threshold -> BiliClient.prefs.v31SwipeThreshold = threshold; AppToast.show(this, "滑动阈值：${threshold}px") }
}

internal fun PlayerActivity.showV31ColorBrightnessCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ColorBrightnessCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "亮度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v31ColorBrightnessCurve = curve; AppToast.show(this, "亮度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV31DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v31DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV32DanmakuBackgroundGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuBackgroundGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v32DanmakuBackgroundGradientColor = color; AppToast.show(this, "渐变颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV32ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "暖色调", "冷色调", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32VibrationStrengthCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32VibrationStrengthCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32VibrationStrengthCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32VolumeLimitThresholdCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32VolumeLimitThresholdCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32VolumeLimitThresholdCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32CacheCleanupStrategyCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32CacheCleanupStrategyCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32CacheCleanupStrategyCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32DanmakuPositionAlignModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuPositionAlignModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32DanmakuPositionAlignModeCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v32HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

internal fun PlayerActivity.showV32ProgressBarColorGradientDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "红到蓝", "蓝到绿", "绿到黄", "彩虹", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ProgressBarColorGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "颜色渐变", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v32ProgressBarColorGradient = gradient; AppToast.show(this, "颜色渐变：${labels[options.indexOf(gradient)]}") }
}

internal fun PlayerActivity.showV32CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v32CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

internal fun PlayerActivity.showV32DanmakuBackgroundGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuBackgroundGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { opacity -> BiliClient.prefs.v32DanmakuBackgroundGradientOpacity = opacity; AppToast.show(this, "渐变透明度：$opacity%") }
}

internal fun PlayerActivity.showV32SwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v32SwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "慢(10)"; 25 -> "较慢(25)"; 50 -> "中(50)"; 75 -> "较快(75)"; 100 -> "快(100)"; else -> "中(50)" } }) { speed -> BiliClient.prefs.v32SwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

internal fun PlayerActivity.showV32ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV32DanmakuFontGlowStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuFontGlowStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { strength -> BiliClient.prefs.v32DanmakuFontGlowStrength = strength; AppToast.show(this, "发光强度：$strength") }
}

internal fun PlayerActivity.showV33AutoSortModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("默认", "正序", "倒序", "随机", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33AutoSortMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "排序方式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v33AutoSortMode = mode; AppToast.show(this, "排序方式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV33DanmakuBackgroundGradientPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("顶部", "底部", "居中", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuBackgroundGradientPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变位置", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { position -> BiliClient.prefs.v33DanmakuBackgroundGradientPosition = position; AppToast.show(this, "渐变位置：${labels[options.indexOf(position)]}") }
}

internal fun PlayerActivity.showV33ColorSharpenCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ColorSharpenCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "锐化曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33ColorSharpenCurve = curve; AppToast.show(this, "锐化曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33VibrationModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33VibrationModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动模式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33VibrationModeCurve = curve; AppToast.show(this, "震动模式曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33VolumeLimitThresholdModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("固定", "动态", "自适应", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33VolumeLimitThresholdMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "阈值模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v33VolumeLimitThresholdMode = mode; AppToast.show(this, "阈值模式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV33CacheCleanupModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33CacheCleanupModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理模式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33CacheCleanupModeCurve = curve; AppToast.show(this, "清理模式曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33DanmakuPositionAlignOffsetCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuPositionAlignOffsetCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐偏移曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33DanmakuPositionAlignOffsetCurve = curve; AppToast.show(this, "对齐偏移曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33HistoryImportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33HistoryImportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导入格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v33HistoryImportFormat = format; AppToast.show(this, "导入格式：${labels[options.indexOf(format)]}") }
}

internal fun PlayerActivity.showV33ProgressBarColorGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("左到右", "右到左", "中心向外", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ProgressBarColorGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v33ProgressBarColorGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

internal fun PlayerActivity.showV33CastBufferStrategyCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33CastBufferStrategyCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33CastBufferStrategyCurve = curve; AppToast.show(this, "缓冲策略曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33DanmakuBackgroundGradientSpeedDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuBackgroundGradientSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "慢(25)"; 50 -> "中(50)"; 75 -> "快(75)"; 100 -> "最快(100)"; else -> "关闭" } }) { speed -> BiliClient.prefs.v33DanmakuBackgroundGradientSpeed = speed; AppToast.show(this, "渐变速度：$speed") }
}

internal fun PlayerActivity.showV33SwipeDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("水平", "垂直", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33SwipeDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "滑动方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v33SwipeDirection = direction; AppToast.show(this, "滑动方向：${labels[options.indexOf(direction)]}") }
}

internal fun PlayerActivity.showV33ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV33DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v33DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV34AutoLoopModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "单曲循环", "列表循环", "随机循环")
    val currentIndex = options.indexOf(BiliClient.prefs.v34AutoLoopMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "循环模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v34AutoLoopMode = mode; AppToast.show(this, "循环模式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV34DanmakuBackgroundGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("线性", "径向", "角度", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuBackgroundGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变类型", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { type -> BiliClient.prefs.v34DanmakuBackgroundGradientType = type; AppToast.show(this, "渐变类型：${labels[options.indexOf(type)]}") }
}

internal fun PlayerActivity.showV34ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "暖色调", "冷色调", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34VibrationStrengthCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34VibrationStrengthCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34VibrationStrengthCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34VolumeLimitThresholdCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34VolumeLimitThresholdCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34VolumeLimitThresholdCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34CacheCleanupStrategyCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34CacheCleanupStrategyCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34CacheCleanupStrategyCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34DanmakuPositionAlignModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuPositionAlignModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34DanmakuPositionAlignModeCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v34HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

internal fun PlayerActivity.showV34ProgressBarColorGradientDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "红到蓝", "蓝到绿", "绿到黄", "彩虹", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ProgressBarColorGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "颜色渐变", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v34ProgressBarColorGradient = gradient; AppToast.show(this, "颜色渐变：${labels[options.indexOf(gradient)]}") }
}

internal fun PlayerActivity.showV34CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v34CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

internal fun PlayerActivity.showV34DanmakuBackgroundGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuBackgroundGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { opacity -> BiliClient.prefs.v34DanmakuBackgroundGradientOpacity = opacity; AppToast.show(this, "渐变透明度：$opacity%") }
}

internal fun PlayerActivity.showV34SwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v34SwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "慢(10)"; 25 -> "较慢(25)"; 50 -> "中(50)"; 75 -> "较快(75)"; 100 -> "快(100)"; else -> "中(50)" } }) { speed -> BiliClient.prefs.v34SwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

internal fun PlayerActivity.showV34ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV34DanmakuFontGlowStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuFontGlowStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { strength -> BiliClient.prefs.v34DanmakuFontGlowStrength = strength; AppToast.show(this, "发光强度：$strength") }
}

internal fun PlayerActivity.showV35DanmakuBackgroundGradientCustomColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuBackgroundGradientCustomColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v35DanmakuBackgroundGradientCustomColor = color; AppToast.show(this, "渐变颜色自定义：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV35ColorContrastCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35ColorContrastCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "对比度自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "降低(-50)"; -25 -> "略降(-25)"; 0 -> "标准(0)"; 25 -> "略增(+25)"; 50 -> "增强(+50)"; else -> "标准(0)" } }) { contrast -> BiliClient.prefs.v35ColorContrastCustom = contrast; AppToast.show(this, "对比度自定义：$contrast") }
}

internal fun PlayerActivity.showV35VibrationCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v35VibrationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { vibration -> BiliClient.prefs.v35VibrationCustom = vibration; AppToast.show(this, "震动自定义：$vibration") }
}

internal fun PlayerActivity.showV35VolumeLimitCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v35VolumeLimitCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量限制自定义", options = options, checkedIndex = currentIndex, label = { v -> "${v}%" }) { limit -> BiliClient.prefs.v35VolumeLimitCustom = limit; AppToast.show(this, "音量限制自定义：${limit}%") }
}

internal fun PlayerActivity.showV35CacheCleanupCustomDialog() {
    val options = listOf(0, 250, 500, 750, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v35CacheCleanupCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓存清理自定义", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "自动" else "${v}MB" }) { cleanup -> BiliClient.prefs.v35CacheCleanupCustom = cleanup; AppToast.show(this, "缓存清理自定义：${if (cleanup == 0) "自动" else "${cleanup}MB"}") }
}

internal fun PlayerActivity.showV35DanmakuPositionAlignCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuPositionAlignCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "对齐自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "左移(-50)"; -25 -> "左移(-25)"; 0 -> "标准(0)"; 25 -> "右移(+25)"; 50 -> "右移(+50)"; else -> "标准(0)" } }) { align -> BiliClient.prefs.v35DanmakuPositionAlignCustom = align; AppToast.show(this, "对齐自定义：$align") }
}

internal fun PlayerActivity.showV35ColorSaturationCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35ColorSaturationCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "饱和度自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "降低(-50)"; -25 -> "略降(-25)"; 0 -> "标准(0)"; 25 -> "略增(+25)"; 50 -> "增强(+50)"; else -> "标准(0)" } }) { saturation -> BiliClient.prefs.v35ColorSaturationCustom = saturation; AppToast.show(this, "饱和度自定义：$saturation") }
}

internal fun PlayerActivity.showV35HistoryCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v35HistoryCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "历史记录自定义", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "不限制" else "${v}条" }) { history -> BiliClient.prefs.v35HistoryCustom = history; AppToast.show(this, "历史记录自定义：${if (history == 0) "不限制" else "${history}条"}") }
}

internal fun PlayerActivity.showV35ProgressBarColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35ProgressBarColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条颜色自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v35ProgressBarColorCustom = color; AppToast.show(this, "进度条颜色自定义：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV35CastBufferCustomDialog() {
    val options = listOf(0, 5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v35CastBufferCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲自定义", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "自动" else "${v}秒" }) { buffer -> BiliClient.prefs.v35CastBufferCustom = buffer; AppToast.show(this, "缓冲自定义：${if (buffer == 0) "自动" else "${buffer}秒"}") }
}

internal fun PlayerActivity.showV35DanmakuBackgroundGradientCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "线性", "径向", "角度", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuBackgroundGradientCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v35DanmakuBackgroundGradientCustom = gradient; AppToast.show(this, "渐变自定义：${labels[options.indexOf(gradient)]}") }
}

internal fun PlayerActivity.showV35SwipeCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "灵敏", "迟钝", "水平", "垂直", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35SwipeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "滑动自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { swipe -> BiliClient.prefs.v35SwipeCustom = swipe; AppToast.show(this, "滑动自定义：${labels[options.indexOf(swipe)]}") }
}

internal fun PlayerActivity.showV35ColorBrightnessCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35ColorBrightnessCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "亮度自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "降低(-50)"; -25 -> "略降(-25)"; 0 -> "标准(0)"; 25 -> "略增(+25)"; 50 -> "增强(+50)"; else -> "标准(0)" } }) { brightness -> BiliClient.prefs.v35ColorBrightnessCustom = brightness; AppToast.show(this, "亮度自定义：$brightness") }
}

internal fun PlayerActivity.showV35DanmakuFontGlowCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuFontGlowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { glow -> BiliClient.prefs.v35DanmakuFontGlowCustom = glow; AppToast.show(this, "发光自定义：$glow") }
}

internal fun PlayerActivity.showV36DanmakuFontStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "白色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuFontStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "描边颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v36DanmakuFontStrokeColor = color; AppToast.show(this, "描边颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV36ColorTemperatureDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorTemperature).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色温调节", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "冷色(-50)"; -25 -> "略冷(-25)"; 0 -> "标准(0)"; 25 -> "略暖(+25)"; 50 -> "暖色(+50)"; else -> "标准(0)" } }) { temp -> BiliClient.prefs.v36ColorTemperature = temp; AppToast.show(this, "色温：$temp") }
}

internal fun PlayerActivity.showV36VibrationPatternDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("关闭", "短促", "持续", "脉冲", "渐弱", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36VibrationPattern).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { pattern -> BiliClient.prefs.v36VibrationPattern = pattern; AppToast.show(this, "震动模式：${labels[options.indexOf(pattern)]}") }
}

internal fun PlayerActivity.showV36VolumeStepDialog() {
    val options = listOf(1, 2, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v36VolumeStep).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量步进", options = options, checkedIndex = currentIndex, label = { v -> "${v}%" }) { step -> BiliClient.prefs.v36VolumeStep = step; AppToast.show(this, "音量步进：${step}%") }
}

internal fun PlayerActivity.showV36CacheSizeLimitDialog() {
    val options = listOf(100, 200, 500, 1000, 1500, 2000)
    val currentIndex = options.indexOf(BiliClient.prefs.v36CacheSizeLimit).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "缓存限制", options = options, checkedIndex = currentIndex, label = { v -> "${v}MB" }) { limit -> BiliClient.prefs.v36CacheSizeLimit = limit; AppToast.show(this, "缓存限制：${limit}MB") }
}

internal fun PlayerActivity.showV36DanmakuDisplayAreaDialog() {
    val options = listOf(25, 50, 75, 100)
    val labels = listOf("1/4屏", "半屏", "3/4屏", "全屏")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuDisplayArea).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(title = "显示区域", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { area -> BiliClient.prefs.v36DanmakuDisplayArea = area; AppToast.show(this, "显示区域：${labels[options.indexOf(area)]}") }
}

internal fun PlayerActivity.showV36ColorGammaDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorGamma).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "伽马调节", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "暗沉(-50)"; -25 -> "略暗(-25)"; 0 -> "标准(0)"; 25 -> "略亮(+25)"; 50 -> "明亮(+50)"; else -> "标准(0)" } }) { gamma -> BiliClient.prefs.v36ColorGamma = gamma; AppToast.show(this, "伽马：$gamma") }
}

internal fun PlayerActivity.showV36ProgressBarStyleDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "细线", "粗线", "渐变", "脉冲", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36ProgressBarStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条样式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { style -> BiliClient.prefs.v36ProgressBarStyle = style; AppToast.show(this, "进度条样式：${labels[options.indexOf(style)]}") }
}

internal fun PlayerActivity.showV36CastResolutionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("自动", "480p", "720p", "1080p", "2K", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v36CastResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射分辨率", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { res -> BiliClient.prefs.v36CastResolution = res; AppToast.show(this, "投射分辨率：${labels[options.indexOf(res)]}") }
}

internal fun PlayerActivity.showV36DanmakuBackgroundBlurDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuBackgroundBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景模糊", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 5 -> "轻微(5)"; 10 -> "中等(10)"; 15 -> "较强(15)"; 20 -> "最强(20)"; else -> "关闭" } }) { blur -> BiliClient.prefs.v36DanmakuBackgroundBlur = blur; AppToast.show(this, "背景模糊：$blur") }
}

internal fun PlayerActivity.showV36GestureLongPressSpeedDialog() {
    val options = listOf(0.5f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
    val currentIndex = options.indexOf(BiliClient.prefs.v36GestureLongPressSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "长按速度", options = options, checkedIndex = currentIndex, label = { v -> "${v}x" }) { speed -> BiliClient.prefs.v36GestureLongPressSpeed = speed; AppToast.show(this, "长按速度：${speed}x") }
}

internal fun PlayerActivity.showV36ColorHueShiftDialog() {
    val options = listOf(-180, -90, 0, 90, 180)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorHueShift).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色调偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -180 -> "反转(-180)"; -90 -> "偏绿(-90)"; 0 -> "标准(0)"; 90 -> "偏蓝(+90)"; 180 -> "反转(+180)"; else -> "标准(0)" } }) { shift -> BiliClient.prefs.v36ColorHueShift = shift; AppToast.show(this, "色调偏移：$shift") }
}

internal fun PlayerActivity.showV36DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "绿色", "蓝色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v36DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV37DanmakuShadowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "灰色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "阴影颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v37DanmakuShadowColor = color; AppToast.show(this, "阴影颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV37ColorVividnessDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorVividness).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "鲜艳度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "淡雅(-50)"; -25 -> "略淡(-25)"; 0 -> "标准(0)"; 25 -> "鲜艳(+25)"; 50 -> "极鲜艳(+50)"; else -> "标准(0)" } }) { vivid -> BiliClient.prefs.v37ColorVividness = vivid; AppToast.show(this, "鲜艳度：$vivid") }
}

internal fun PlayerActivity.showV37VibrationDecayDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v37VibrationDecay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动衰减", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "快速(25)"; 50 -> "中等(50)"; 75 -> "缓慢(75)"; 100 -> "极慢(100)"; else -> "关闭" } }) { decay -> BiliClient.prefs.v37VibrationDecay = decay; AppToast.show(this, "震动衰减：$decay") }
}

internal fun PlayerActivity.showV37DanmakuScrollSpeedDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuScrollSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滚动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "极慢(-50)"; -25 -> "较慢(-25)"; 0 -> "正常(0)"; 25 -> "较快(+25)"; 50 -> "极快(+50)"; else -> "正常(0)" } }) { speed -> BiliClient.prefs.v37DanmakuScrollSpeed = speed; AppToast.show(this, "滚动速度：$speed") }
}

internal fun PlayerActivity.showV37ColorTonemapDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "电影", "鲜艳", "柔和", "复古", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorTonemap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色阶映射", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { tonemap -> BiliClient.prefs.v37ColorTonemap = tonemap; AppToast.show(this, "色阶映射：${labels[options.indexOf(tonemap)]}") }
}

internal fun PlayerActivity.showV37ProgressBarHeightDialog() {
    val options = listOf(1, 2, 3, 5, 7, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ProgressBarHeight).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "进度条高度", options = options, checkedIndex = currentIndex, label = { v -> "${v}dp" }) { height -> BiliClient.prefs.v37ProgressBarHeight = height; AppToast.show(this, "进度条高度：${height}dp") }
}

internal fun PlayerActivity.showV37CastBitrateDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("自动", "1Mbps", "2Mbps", "5Mbps", "10Mbps", "20Mbps")
    val currentIndex = options.indexOf(BiliClient.prefs.v37CastBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射码率", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { bitrate -> BiliClient.prefs.v37CastBitrate = bitrate; AppToast.show(this, "投射码率：${labels[options.indexOf(bitrate)]}") }
}

internal fun PlayerActivity.showV37DanmakuBorderColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "白色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "边框颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v37DanmakuBorderColor = color; AppToast.show(this, "边框颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV37GestureDoubleTapDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "播放/暂停", "快进", "快退", "点赞", "收藏")
    val currentIndex = options.indexOf(BiliClient.prefs.v37GestureDoubleTap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "双击功能", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { func -> BiliClient.prefs.v37GestureDoubleTap = func; AppToast.show(this, "双击功能：${labels[options.indexOf(func)]}") }
}

internal fun PlayerActivity.showV37ColorHueSaturationDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorHueSaturation).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色调饱和度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "灰度(-50)"; -25 -> "淡雅(-25)"; 0 -> "标准(0)"; 25 -> "鲜艳(+25)"; 50 -> "极鲜艳(+50)"; else -> "标准(0)" } }) { sat -> BiliClient.prefs.v37ColorHueSaturation = sat; AppToast.show(this, "色调饱和度：$sat") }
}

internal fun PlayerActivity.showV37DanmakuGlowIntensityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { intensity -> BiliClient.prefs.v37DanmakuGlowIntensity = intensity; AppToast.show(this, "发光强度：$intensity") }
}

internal fun PlayerActivity.showV38PlaylistLoopModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("顺序播放", "单曲循环", "列表循环", "随机播放")
    val currentIndex = options.indexOf(BiliClient.prefs.v38PlaylistLoopMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "循环模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38PlaylistLoopMode = mode; AppToast.show(this, "循环模式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV38DanmakuBackgroundRadiusDialog() {
    val options = listOf(0, 4, 8, 12, 16, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuBackgroundRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景圆角", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "直角"; 4 -> "微圆(4)"; 8 -> "圆角(8)"; 12 -> "较圆(12)"; 16 -> "很圆(16)"; 20 -> "极圆(20)"; else -> "直角" } }) { radius -> BiliClient.prefs.v38DanmakuBackgroundRadius = radius; AppToast.show(this, "背景圆角：$radius") }
}

internal fun PlayerActivity.showV38ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV38VibrationFrequencyDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38VibrationFrequency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动频率", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "低频(25)"; 50 -> "中频(50)"; 75 -> "高频(75)"; 100 -> "极高频(100)"; else -> "关闭" } }) { freq -> BiliClient.prefs.v38VibrationFrequency = freq; AppToast.show(this, "震动频率：$freq") }
}

internal fun PlayerActivity.showV38VolumeLimitModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "软限制", "硬限制", "自适应")
    val currentIndex = options.indexOf(BiliClient.prefs.v38VolumeLimitMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38VolumeLimitMode = mode; AppToast.show(this, "音量限制模式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV38CacheCleanupStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("手动", "自动", "定时", "智能")
    val currentIndex = options.indexOf(BiliClient.prefs.v38CacheCleanupStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v38CacheCleanupStrategy = strategy; AppToast.show(this, "清理策略：${labels[options.indexOf(strategy)]}") }
}

internal fun PlayerActivity.showV38DanmakuOffsetXDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuOffsetX).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "水平偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "最左(-100)"; -50 -> "偏左(-50)"; 0 -> "居中(0)"; 50 -> "偏右(+50)"; 100 -> "最右(+100)"; else -> "居中(0)" } }) { offset -> BiliClient.prefs.v38DanmakuOffsetX = offset; AppToast.show(this, "水平偏移：$offset") }
}

internal fun PlayerActivity.showV38ColorBrightnessCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorBrightnessCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "亮度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorBrightnessCurve = curve; AppToast.show(this, "亮度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV38HistorySearchModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("精确匹配", "模糊匹配", "正则表达式", "拼音搜索")
    val currentIndex = options.indexOf(BiliClient.prefs.v38HistorySearchMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "搜索模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38HistorySearchMode = mode; AppToast.show(this, "搜索模式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV38CastLatencyDialog() {
    val options = listOf(0, 1000, 2000, 3000, 4000, 5000)
    val currentIndex = options.indexOf(BiliClient.prefs.v38CastLatency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射延迟", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "自动"; 1000 -> "1秒"; 2000 -> "2秒"; 3000 -> "3秒"; 4000 -> "4秒"; 5000 -> "5秒"; else -> "自动" } }) { latency -> BiliClient.prefs.v38CastLatency = latency; AppToast.show(this, "投射延迟：${latency}ms") }
}

internal fun PlayerActivity.showV38DanmakuGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("从左到右", "从右到左", "从上到下", "从下到上")
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v38DanmakuGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

internal fun PlayerActivity.showV38GestureSwipeSensitivityDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38GestureSwipeSensitivity).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动灵敏度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "极低(10)"; 25 -> "较低(25)"; 50 -> "中等(50)"; 75 -> "较高(75)"; 100 -> "极高(100)"; else -> "中等(50)" } }) { sensitivity -> BiliClient.prefs.v38GestureSwipeSensitivity = sensitivity; AppToast.show(this, "滑动灵敏度：$sensitivity") }
}

internal fun PlayerActivity.showV38ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV38DanmakuFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "描边宽度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 1 -> "极细(1)"; 2 -> "细(2)"; 3 -> "中等(3)"; 5 -> "粗(5)"; 10 -> "极粗(10)"; else -> "关闭" } }) { width -> BiliClient.prefs.v38DanmakuFontStrokeWidth = width; AppToast.show(this, "描边宽度：$width") }
}

internal fun PlayerActivity.showV39DanmakuBackgroundAlphaCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuBackgroundAlphaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "透明度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v39DanmakuBackgroundAlphaCurve = curve; AppToast.show(this, "透明度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV39ColorSharpenDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorSharpen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "锐化强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微(25)"; 50 -> "中等(50)"; 75 -> "较强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { sharpen -> BiliClient.prefs.v39ColorSharpen = sharpen; AppToast.show(this, "锐化强度：$sharpen") }
}

internal fun PlayerActivity.showV39VibrationPatternCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39VibrationPatternCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v39VibrationPatternCurve = curve; AppToast.show(this, "震动曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV39VolumeBalanceDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39VolumeBalance).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量平衡", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "全左(-100)"; -50 -> "偏左(-50)"; 0 -> "居中(0)"; 50 -> "偏右(+50)"; 100 -> "全右(+100)"; else -> "居中(0)" } }) { balance -> BiliClient.prefs.v39VolumeBalance = balance; AppToast.show(this, "音量平衡：$balance") }
}

internal fun PlayerActivity.showV39CachePreloadSizeDialog() {
    val options = listOf(10, 50, 100, 200, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v39CachePreloadSize).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(title = "预加载大小", options = options, checkedIndex = currentIndex, label = { v -> "${v}MB" }) { size -> BiliClient.prefs.v39CachePreloadSize = size; AppToast.show(this, "预加载大小：${size}MB") }
}

internal fun PlayerActivity.showV39DanmakuOffsetYDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuOffsetY).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "垂直偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "最上(-100)"; -50 -> "偏上(-50)"; 0 -> "居中(0)"; 50 -> "偏下(+50)"; 100 -> "最下(+100)"; else -> "居中(0)" } }) { offset -> BiliClient.prefs.v39DanmakuOffsetY = offset; AppToast.show(this, "垂直偏移：$offset") }
}

internal fun PlayerActivity.showV39ColorDenoiseDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorDenoise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微(25)"; 50 -> "中等(50)"; 75 -> "较强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { denoise -> BiliClient.prefs.v39ColorDenoise = denoise; AppToast.show(this, "降噪强度：$denoise") }
}

internal fun PlayerActivity.showV39CastBufferStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "激进", "保守", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39CastBufferStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v39CastBufferStrategy = strategy; AppToast.show(this, "缓冲策略：${labels[options.indexOf(strategy)]}") }
}

internal fun PlayerActivity.showV39DanmakuGradientSpeedDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuGradientSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "慢速(25)"; 50 -> "中速(50)"; 75 -> "快速(75)"; 100 -> "极速(100)"; else -> "关闭" } }) { speed -> BiliClient.prefs.v39DanmakuGradientSpeed = speed; AppToast.show(this, "渐变速度：$speed") }
}

internal fun PlayerActivity.showV39GestureLongPressDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "快进", "快退", "点赞", "收藏", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v39GestureLongPress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "长按功能", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { func -> BiliClient.prefs.v39GestureLongPress = func; AppToast.show(this, "长按功能：${labels[options.indexOf(func)]}") }
}

internal fun PlayerActivity.showV39ColorBlurDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 5 -> "轻微(5)"; 10 -> "中等(10)"; 15 -> "较强(15)"; 20 -> "最强(20)"; else -> "关闭" } }) { blur -> BiliClient.prefs.v39ColorBlur = blur; AppToast.show(this, "模糊强度：$blur") }
}

internal fun PlayerActivity.showV39DanmakuGlowModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "外发光", "内发光", "全发光")
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuGlowMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v39DanmakuGlowMode = mode; AppToast.show(this, "发光模式：${labels[options.indexOf(mode)]}") }
}

internal fun PlayerActivity.showV40DanmakuGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "绿色", "蓝色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v40DanmakuGradientColor = color; AppToast.show(this, "渐变颜色：${labels[options.indexOf(color)]}") }
}

internal fun PlayerActivity.showV40ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40VibrationIntensityCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40VibrationIntensityCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40VibrationIntensityCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40VolumeLimitCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40VolumeLimitCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40VolumeLimitCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40CacheCleanupCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40CacheCleanupCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40CacheCleanupCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40DanmakuAlignCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuAlignCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40DanmakuAlignCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "XML")
    val currentIndex = options.indexOf(BiliClient.prefs.v40HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v40HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

internal fun PlayerActivity.showV40ProgressBarGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("从左到右", "从右到左", "从中间到两端", "脉冲")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ProgressBarGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v40ProgressBarGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

internal fun PlayerActivity.showV40CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "平衡")
    val currentIndex = options.indexOf(BiliClient.prefs.v40CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v40CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

internal fun PlayerActivity.showV40DanmakuGradientAlphaDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGradientAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { alpha -> BiliClient.prefs.v40DanmakuGradientAlpha = alpha; AppToast.show(this, "渐变透明度：${alpha}%") }
}

internal fun PlayerActivity.showV40GestureSwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40GestureSwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "极慢(10)"; 25 -> "较慢(25)"; 50 -> "中等(50)"; 75 -> "较快(75)"; 100 -> "极快(100)"; else -> "中等(50)" } }) { speed -> BiliClient.prefs.v40GestureSwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

internal fun PlayerActivity.showV40ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

internal fun PlayerActivity.showV40DanmakuGlowIntensityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { intensity -> BiliClient.prefs.v40DanmakuGlowIntensity = intensity; AppToast.show(this, "发光强度：$intensity") }
}

internal fun PlayerActivity.showV41DanmakuVibrationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Medium", "Strong")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuVibrationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuVibrationMode = value; AppToast.show(this, "Danmaku Vibration Mode: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41VolumeBoostModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeBoostMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Boost Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeBoostMode = value; AppToast.show(this, "Volume Boost Mode: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41DanmakuStrokeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("None", "Solid", "Dashed", "Dotted")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuStrokeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Style", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuStrokeStyle = value; AppToast.show(this, "Danmaku Stroke Style: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41CastColorCorrectionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Warm", "Cool", "Vivid", "Natural", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastColorCorrection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Correction", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastColorCorrection = value; AppToast.show(this, "Cast Color Correction: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41GestureCustomMappingDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Default", "Volume", "Brightness", "Seek", "PlayPause", "Fullscreen")
    val currentIndex = options.indexOf(BiliClient.prefs.v41GestureCustomMapping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Custom Mapping", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41GestureCustomMapping = value; AppToast.show(this, "Gesture Custom Mapping: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41DanmakuDensityLimitDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuDensityLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Density Limit", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuDensityLimit = value; AppToast.show(this, "Danmaku Density Limit: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41ColorHdrSimulationDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "HDR10", "HLG", "Dolby Vision")
    val currentIndex = options.indexOf(BiliClient.prefs.v41ColorHdrSimulation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color HDR Simulation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41ColorHdrSimulation = value; AppToast.show(this, "Color HDR Simulation: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41VolumeLimitEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeLimitEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeLimitEnhanced = value; AppToast.show(this, "Volume Limit Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41DanmakuBgRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuBgRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuBgRadius = value; AppToast.show(this, "Danmaku Background Radius: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41CastAudioCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "AAC", "OPUS", "FLAC")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastAudioCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastAudioCodec = value; AppToast.show(this, "Cast Audio Codec: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42DanmakuStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("White", "Black", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuStrokeColor = value; AppToast.show(this, "Danmaku Stroke Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42ProgressBarColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarColor = value; AppToast.show(this, "Progress Bar Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42DanmakuGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuGradientEnhanced = value; AppToast.show(this, "Danmaku Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42CastColorEnhanceDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CastColorEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CastColorEnhance = value; AppToast.show(this, "Cast Color Enhance: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42VolumeStepCustomDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10, 15, 20)
    val labels = listOf("Off", "1", "2", "3", "5", "10", "15", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v42VolumeStepCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Step Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42VolumeStepCustom = value; AppToast.show(this, "Volume Step Custom: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42DanmakuVibrationDurationDialog() {
    val options = listOf(0, 50, 100, 150, 200, 250, 300, 500)
    val labels = listOf("Off", "50ms", "100ms", "150ms", "200ms", "250ms", "300ms", "500ms")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuVibrationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Duration", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuVibrationDuration = value; AppToast.show(this, "Danmaku Vibration Duration: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42CachePreloadStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Conservative", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CachePreloadStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Strategy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CachePreloadStrategy = value; AppToast.show(this, "Cache Preload Strategy: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Buffer Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarBufferColor = value; AppToast.show(this, "Progress Bar Buffer Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43DanmakuBgAlphaDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuBgAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Alpha", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuBgAlpha = value; AppToast.show(this, "Danmaku Background Alpha: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43CacheCleanupEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CacheCleanupEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CacheCleanupEnhanced = value; AppToast.show(this, "Cache Cleanup Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43ProgressBarGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarGradientEnhanced = value; AppToast.show(this, "Progress Bar Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43DanmakuShadowEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuShadowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Shadow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuShadowEnhanced = value; AppToast.show(this, "Danmaku Shadow Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43CastResolutionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "480p", "720p", "1080p", "1440p", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CastResolutionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Resolution Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CastResolutionEnhanced = value; AppToast.show(this, "Cast Resolution Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43VolumeLimitCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43VolumeLimitCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43VolumeLimitCurveEnhanced = value; AppToast.show(this, "Volume Limit Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43DanmakuGlowEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuGlowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Glow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuGlowEnhanced = value; AppToast.show(this, "Danmaku Glow Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43DanmakuVibrationModeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuVibrationModeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuVibrationModeEnhanced = value; AppToast.show(this, "Danmaku Vibration Mode Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43CachePreloadSizeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Small", "Medium", "Large", "XL", "XXL")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CachePreloadSizeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Size Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CachePreloadSizeEnhanced = value; AppToast.show(this, "Cache Preload Size Enhanced: ${labels[options.indexOf(value)]}") }
}

