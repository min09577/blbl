package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v23.4: 弹幕发送震动强度
internal fun PlayerActivity.showDanmakuVibrationStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v23DanmakuVibrationStrength).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "震动强度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微"; 50 -> "中等"; 75 -> "较强"; 100 -> "最强"; else -> "中等" } },
    ) { strength ->
        BiliClient.prefs.v23DanmakuVibrationStrength = strength
        AppToast.show(this, "震动强度：$strength%")
    }
}

// v23.5: 播放器手势灵敏度（已存在同名函数，使用v23前缀）
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
}

// v23.6: 视频缓存预加载大小
internal fun PlayerActivity.showCachePreloadSizeDialog() {
    val options = listOf(10, 25, 50, 100, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v23CachePreloadSizeMB).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "缓存预加载大小",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}MB" },
    ) { size ->
        BiliClient.prefs.v23CachePreloadSizeMB = size
        AppToast.show(this, "预加载大小：${size}MB")
    }
}

// v23.7: 弹幕显示区域透明度
internal fun PlayerActivity.showDanmakuAreaOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v23DanmakuAreaOpacity).takeIf { it >= 0 } ?: 4
    showSettingsChoiceDialog(
        title = "弹幕区域透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "完全透明"; 25 -> "较透明"; 50 -> "半透明"; 75 -> "较不透明"; 100 -> "完全不透明"; else -> "完全不透明" } },
    ) { opacity ->
        BiliClient.prefs.v23DanmakuAreaOpacity = opacity
        AppToast.show(this, "区域透明度：$opacity%")
    }
}

// v23.8: 视频画面伽马调节
internal fun PlayerActivity.showVideoGammaDialog() {
    val options = listOf(50, 75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v23VideoGamma).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "画面伽马值",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 50 -> "暗(0.5)"; 75 -> "偏暗(0.75)"; 100 -> "标准(1.0)"; 125 -> "偏亮(1.25)"; 150 -> "亮(1.5)"; 200 -> "很亮(2.0)"; else -> "标准(1.0)" } },
    ) { gamma ->
        BiliClient.prefs.v23VideoGamma = gamma
        AppToast.show(this, "伽马值：${gamma / 100f}")
    }
}

// v23.9: 弹幕发送确认震动
internal fun PlayerActivity.showDanmakuSendConfirmVibrationToggle() {
    val enabled = !BiliClient.prefs.v23DanmakuSendConfirmVibration
    BiliClient.prefs.v23DanmakuSendConfirmVibration = enabled
    AppToast.show(this, "发送确认震动：${if (enabled) "开启" else "关闭"}")
}

// v23.10: 播放器快捷键映射
internal fun PlayerActivity.showQuickKeyMappingToggle() {
    val enabled = !BiliClient.prefs.v23QuickKeyMapping
    BiliClient.prefs.v23QuickKeyMapping = enabled
    AppToast.show(this, "快捷键映射：${if (enabled) "开启" else "关闭"}")
}

// v23.11: 视频投射缓冲大小
internal fun PlayerActivity.showCastBufferSizeDialog() {
    val options = listOf(10, 20, 30, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v23CastBufferSizeMB).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "投射缓冲大小",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}MB" },
    ) { size ->
        BiliClient.prefs.v23CastBufferSizeMB = size
        AppToast.show(this, "投射缓冲：${size}MB")
    }
}

// v23.12: 弹幕字体间距调节
internal fun PlayerActivity.showDanmakuFontSpacingDialog() {
    val options = listOf(-5, -2, 0, 2, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v23DanmakuFontSpacing).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "弹幕字体间距",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -5 -> "紧密(-5)"; -2 -> "较紧密(-2)"; 0 -> "标准(0)"; 2 -> "较宽松(+2)"; 5 -> "宽松(+5)"; 10 -> "很宽松(+10)"; else -> "标准(0)" } },
    ) { spacing ->
        BiliClient.prefs.v23DanmakuFontSpacing = spacing
        AppToast.show(this, "字体间距：$spacing")
    }
}

// v23.13: 播放器截图质量（已存在同名函数，使用v23前缀）
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
}

// v23.14: 视频画面色调调节
internal fun PlayerActivity.showVideoHueDialog() {
    val options = listOf(-180, -90, -45, 0, 45, 90, 180)
    val currentIndex = options.indexOf(BiliClient.prefs.v23VideoHue).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(
        title = "画面色调",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -180 -> "反色(-180°)"; -90 -> "偏紫(-90°)"; -45 -> "偏蓝(-45°)"; 0 -> "标准(0°)"; 45 -> "偏黄(+45°)"; 90 -> "偏绿(+90°)"; 180 -> "反色(+180°)"; else -> "标准(0°)" } },
    ) { hue ->
        BiliClient.prefs.v23VideoHue = hue
        AppToast.show(this, "色调：${hue}°")
    }
}

// v23.15: 弹幕时间轴缩放速度
internal fun PlayerActivity.showTimelineZoomSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v23TimelineZoomSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "时间轴缩放速度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 10 -> "极慢"; 25 -> "慢"; 50 -> "中等"; 75 -> "快"; 100 -> "极快"; else -> "中等" } },
    ) { speed ->
        BiliClient.prefs.v23TimelineZoomSpeed = speed
        AppToast.show(this, "缩放速度：$speed%")
    }
}

// v24.1: 视频播放列表循环模式（已存在同名函数，使用v24前缀）
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
}

// v24.3: 视频画面亮度曲线
internal fun PlayerActivity.showBrightnessCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "柔和", "明亮", "高对比", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v24BrightnessCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "亮度曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v24BrightnessCurveMode = mode
        AppToast.show(this, "亮度曲线：${labels[options.indexOf(mode)]}")
    }
}

// v24.4: 弹幕发送延迟调节
internal fun PlayerActivity.showDanmakuSendDelayDialog() {
    val options = listOf(0, 500, 1000, 1500, 2000)
    val currentIndex = options.indexOf(BiliClient.prefs.v24DanmakuSendDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕发送延迟",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "无延迟"; 500 -> "0.5秒"; 1000 -> "1秒"; 1500 -> "1.5秒"; 2000 -> "2秒"; else -> "无延迟" } },
    ) { delay ->
        BiliClient.prefs.v24DanmakuSendDelay = delay
        AppToast.show(this, "发送延迟：${delay}ms")
    }
}

// v24.5: 播放器音量步进
internal fun PlayerActivity.showVolumeStepDialog() {
    val options = listOf(1, 2, 5, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v24VolumeStep).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "音量调节步进",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { step ->
        BiliClient.prefs.v24VolumeStep = step
        AppToast.show(this, "音量步进：$step%")
    }
}

// v24.6: 视频缓存清理间隔
internal fun PlayerActivity.showCacheCleanupIntervalDialog() {
    val options = listOf(1, 3, 7, 14, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v24CacheCleanupInterval).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "缓存清理间隔",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}天" },
    ) { days ->
        BiliClient.prefs.v24CacheCleanupInterval = days
        AppToast.show(this, "清理间隔：${days}天")
    }
}

// v24.7: 弹幕显示位置偏移
internal fun PlayerActivity.showDanmakuPositionOffsetDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v24DanmakuPositionOffset).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "弹幕位置偏移",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { -50 -> "最上(-50)"; -25 -> "偏上(-25)"; 0 -> "标准(0)"; 25 -> "偏下(+25)"; 50 -> "最下(+50)"; else -> "标准(0)" } },
    ) { offset ->
        BiliClient.prefs.v24DanmakuPositionOffset = offset
        AppToast.show(this, "位置偏移：$offset")
    }
}

// v24.8: 视频画面对比度曲线
internal fun PlayerActivity.showContrastCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "柔和", "高对比", "极高对比", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v24ContrastCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "对比度曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v24ContrastCurveMode = mode
        AppToast.show(this, "对比度曲线：${labels[options.indexOf(mode)]}")
    }
}

// v24.9: 弹幕发送历史记录数
internal fun PlayerActivity.showDanmakuSendHistoryCountDialog() {
    val options = listOf(5, 10, 20, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v24DanmakuSendHistoryCount).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "发送历史记录数",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}条" },
    ) { count ->
        BiliClient.prefs.v24DanmakuSendHistoryCount = count
        AppToast.show(this, "历史记录：${count}条")
    }
}

// v24.10: 播放器进度条样式（已存在同名函数，使用v24前缀）
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
}

// v24.11: 视频投射画面质量
internal fun PlayerActivity.showCastQualityDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("流畅", "标清", "高清", "超清")
    val currentIndex = options.indexOf(BiliClient.prefs.v24CastQuality).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "投射画面质量",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { quality ->
        BiliClient.prefs.v24CastQuality = quality
        AppToast.show(this, "投射质量：${labels[options.indexOf(quality)]}")
    }
}

// v24.12: 弹幕字体描边透明度（已存在同名函数，使用v24前缀）
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
}

// v24.13: 播放器手势双击功能
internal fun PlayerActivity.showDoubleTapFunctionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "播放/暂停", "下一个视频", "上一个视频", "切换弹幕", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v24DoubleTapFunction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "双击功能",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { func ->
        BiliClient.prefs.v24DoubleTapFunction = func
        AppToast.show(this, "双击功能：${labels[options.indexOf(func)]}")
    }
}

// v24.14: 视频画面色调曲线
internal fun PlayerActivity.showToneCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "暖色调", "冷色调", "复古", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v24ToneCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "色调曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v24ToneCurveMode = mode
        AppToast.show(this, "色调曲线：${labels[options.indexOf(mode)]}")
    }
}

// v24.15: 弹幕显示刷新率（已存在同名函数，使用v24前缀）
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
}

// v25.1: 视频播放列表随机播放
internal fun PlayerActivity.showPlaylistShuffleToggle() {
    val enabled = !BiliClient.prefs.v25PlaylistShuffle
    BiliClient.prefs.v25PlaylistShuffle = enabled
    AppToast.show(this, "随机播放：${if (enabled) "开启" else "关闭"}")
}

// v25.2: 弹幕字体背景颜色
internal fun PlayerActivity.showDanmakuBgColorDialog() {
    val colors = listOf(0x000000, 0x333333, 0x666666, 0x999999, 0xFFFFFF)
    val colorNames = listOf("黑色", "深灰", "灰色", "浅灰", "白色")
    val currentIndex = colors.indexOf(BiliClient.prefs.v25DanmakuBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕背景颜色",
        options = colors,
        checkedIndex = currentIndex,
        label = { v -> colorNames[colors.indexOf(v)] },
    ) { color ->
        BiliClient.prefs.v25DanmakuBgColor = color
        AppToast.show(this, "背景颜色：${colorNames[colors.indexOf(color)]}")
    }
}

// v25.3: 视频画面饱和度曲线
internal fun PlayerActivity.showSaturationCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "低饱和", "高饱和", "极高饱和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v25SaturationCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "饱和度曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v25SaturationCurveMode = mode
        AppToast.show(this, "饱和度曲线：${labels[options.indexOf(mode)]}")
    }
}

// v25.4: 弹幕发送确认对话框
internal fun PlayerActivity.showDanmakuSendConfirmToggle() {
    val enabled = !BiliClient.prefs.v25DanmakuSendConfirm
    BiliClient.prefs.v25DanmakuSendConfirm = enabled
    AppToast.show(this, "发送确认：${if (enabled) "开启" else "关闭"}")
}

// v25.5: 播放器音量记忆
internal fun PlayerActivity.showRememberVolumeToggle() {
    val enabled = !BiliClient.prefs.v25RememberVolume
    BiliClient.prefs.v25RememberVolume = enabled
    AppToast.show(this, "音量记忆：${if (enabled) "开启" else "关闭"}")
}

// v25.6: 视频缓存预加载策略
internal fun PlayerActivity.showCachePreloadStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("智能", "积极", "保守", "关闭")
    val currentIndex = options.indexOf(BiliClient.prefs.v25CachePreloadStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "缓存预加载策略",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { strategy ->
        BiliClient.prefs.v25CachePreloadStrategy = strategy
        AppToast.show(this, "预加载策略：${labels[options.indexOf(strategy)]}")
    }
}

// v25.7: 弹幕显示时间长度
internal fun PlayerActivity.showDanmakuDisplayDurationDialog() {
    val options = listOf(5, 8, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v25DanmakuDisplayDuration).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "弹幕显示时长",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}秒" },
    ) { duration ->
        BiliClient.prefs.v25DanmakuDisplayDuration = duration
        AppToast.show(this, "显示时长：${duration}秒")
    }
}

// v25.8: 视频画面锐化曲线
internal fun PlayerActivity.showSharpenCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "柔和", "锐利", "极锐利", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v25SharpenCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "锐化曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v25SharpenCurveMode = mode
        AppToast.show(this, "锐化曲线：${labels[options.indexOf(mode)]}")
    }
}

// v25.9: 弹幕发送历史记录
internal fun PlayerActivity.showDanmakuSendHistoryToggle() {
    val enabled = !BiliClient.prefs.v25DanmakuSendHistory
    BiliClient.prefs.v25DanmakuSendHistory = enabled
    AppToast.show(this, "发送历史记录：${if (enabled) "开启" else "关闭"}")
}

// v25.10: 播放器进度条颜色
internal fun PlayerActivity.showProgressBarColorDialog() {
    val colors = listOf(0xFFFFFF, 0xFF0000, 0x00FF00, 0x0000FF, 0xFFFF00)
    val colorNames = listOf("白色", "红色", "绿色", "蓝色", "黄色")
    val currentIndex = colors.indexOf(BiliClient.prefs.v25ProgressBarColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "进度条颜色",
        options = colors,
        checkedIndex = currentIndex,
        label = { v -> colorNames[colors.indexOf(v)] },
    ) { color ->
        BiliClient.prefs.v25ProgressBarColor = color
        AppToast.show(this, "进度条颜色：${colorNames[colors.indexOf(color)]}")
    }
}

// v25.11: 视频投射音频质量
internal fun PlayerActivity.showCastAudioQualityDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("低质量", "标准", "高质量", "无损")
    val currentIndex = options.indexOf(BiliClient.prefs.v25CastAudioQuality).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "投射音频质量",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { quality ->
        BiliClient.prefs.v25CastAudioQuality = quality
        AppToast.show(this, "音频质量：${labels[options.indexOf(quality)]}")
    }
}

// v25.12: 弹幕字体背景透明度
internal fun PlayerActivity.showDanmakuBgOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v25DanmakuBgOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕背景透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { opacity ->
        BiliClient.prefs.v25DanmakuBgOpacity = opacity
        AppToast.show(this, "背景透明度：$opacity%")
    }
}

// v25.13: 播放器手势长按功能
internal fun PlayerActivity.showLongPressFunctionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "倍速播放", "弹幕开关", "截图", "投屏", "锁定")
    val currentIndex = options.indexOf(BiliClient.prefs.v25LongPressFunction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "长按功能",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { func ->
        BiliClient.prefs.v25LongPressFunction = func
        AppToast.show(this, "长按功能：${labels[options.indexOf(func)]}")
    }
}

// v25.14: 视频画面降噪曲线
internal fun PlayerActivity.showDenoiseCurveModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("标准", "轻度", "中度", "重度", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v25DenoiseCurveMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "降噪曲线模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v25DenoiseCurveMode = mode
        AppToast.show(this, "降噪曲线：${labels[options.indexOf(mode)]}")
    }
}

// v25.15: 弹幕显示字体大小
internal fun PlayerActivity.showDanmakuFontSizeDialog() {
    val options = listOf(12, 16, 20, 25, 30, 40, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v25DanmakuFontSize).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(
        title = "弹幕字体大小",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}sp" },
    ) { size ->
        BiliClient.prefs.v25DanmakuFontSize = size
        AppToast.show(this, "字体大小：${size}sp")
    }
}

// v26.1: 视频播放列表自动播放
internal fun PlayerActivity.showPlaylistAutoPlayToggle() {
    val enabled = !BiliClient.prefs.v26PlaylistAutoPlay
    BiliClient.prefs.v26PlaylistAutoPlay = enabled
    AppToast.show(this, "自动播放：${if (enabled) "开启" else "关闭"}")
}

// v26.2: 弹幕字体边框颜色
internal fun PlayerActivity.showDanmakuBorderColorDialog() {
    val colors = listOf(0x000000, 0x333333, 0x666666, 0x999999, 0xFFFFFF)
    val colorNames = listOf("黑色", "深灰", "灰色", "浅灰", "白色")
    val currentIndex = colors.indexOf(BiliClient.prefs.v26DanmakuBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕边框颜色",
        options = colors,
        checkedIndex = currentIndex,
        label = { v -> colorNames[colors.indexOf(v)] },
    ) { color ->
        BiliClient.prefs.v26DanmakuBorderColor = color
        AppToast.show(this, "边框颜色：${colorNames[colors.indexOf(color)]}")
    }
}

// v26.3: 视频画面对比度曲线（已存在同名函数，使用v26前缀）
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
}

// v26.4: 弹幕发送确认震动
internal fun PlayerActivity.showDanmakuSendVibrationToggle() {
    val enabled = !BiliClient.prefs.v26DanmakuSendVibration
    BiliClient.prefs.v26DanmakuSendVibration = enabled
    AppToast.show(this, "发送确认震动：${if (enabled) "开启" else "关闭"}")
}

// v26.5: 播放器音量均衡
internal fun PlayerActivity.showVolumeBalanceDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v26VolumeBalance).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "音量均衡",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "左声道"; 25 -> "偏左"; 50 -> "均衡"; 75 -> "偏右"; 100 -> "右声道"; else -> "均衡" } },
    ) { balance ->
        BiliClient.prefs.v26VolumeBalance = balance
        AppToast.show(this, "音量均衡：$balance%")
    }
}

// v26.6: 视频缓存预加载大小（已存在同名函数，使用v26前缀）
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
}

// v26.7: 弹幕显示透明度
internal fun PlayerActivity.showDanmakuDisplayOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v26DanmakuDisplayOpacity).takeIf { it >= 0 } ?: 4
    showSettingsChoiceDialog(
        title = "弹幕显示透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { opacity ->
        BiliClient.prefs.v26DanmakuDisplayOpacity = opacity
        AppToast.show(this, "显示透明度：$opacity%")
    }
}

// v26.8: 视频画面亮度曲线（已存在同名函数，使用v26前缀）
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
}

// v26.9: 弹幕发送历史记录数
internal fun PlayerActivity.showDanmakuHistoryCountDialog() {
    val options = listOf(5, 10, 20, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v26DanmakuHistoryCount).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "发送历史记录数",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}条" },
    ) { count ->
        BiliClient.prefs.v26DanmakuHistoryCount = count
        AppToast.show(this, "历史记录：${count}条")
    }
}

// v26.10: 播放器进度条透明度
internal fun PlayerActivity.showProgressBarOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v26ProgressBarOpacity).takeIf { it >= 0 } ?: 4
    showSettingsChoiceDialog(
        title = "进度条透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { opacity ->
        BiliClient.prefs.v26ProgressBarOpacity = opacity
        AppToast.show(this, "进度条透明度：$opacity%")
    }
}

// v26.11: 视频投射缓冲策略
internal fun PlayerActivity.showCastBufferStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("智能", "积极", "保守", "关闭")
    val currentIndex = options.indexOf(BiliClient.prefs.v26CastBufferStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "投射缓冲策略",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { strategy ->
        BiliClient.prefs.v26CastBufferStrategy = strategy
        AppToast.show(this, "缓冲策略：${labels[options.indexOf(strategy)]}")
    }
}

// v26.12: 弹幕字体边框透明度
internal fun PlayerActivity.showDanmakuBorderOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v26DanmakuBorderOpacity).takeIf { it >= 0 } ?: 4
    showSettingsChoiceDialog(
        title = "弹幕边框透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { opacity ->
        BiliClient.prefs.v26DanmakuBorderOpacity = opacity
        AppToast.show(this, "边框透明度：$opacity%")
    }
}

// v26.13: 播放器手势滑动功能
internal fun PlayerActivity.showSwipeFunctionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "音量", "亮度", "进度", "弹幕透明度", "播放速度")
    val currentIndex = options.indexOf(BiliClient.prefs.v26SwipeFunction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "滑动功能",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { func ->
        BiliClient.prefs.v26SwipeFunction = func
        AppToast.show(this, "滑动功能：${labels[options.indexOf(func)]}")
    }
}

// v26.14: 视频画面饱和度曲线（已存在同名函数，使用v26前缀）
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
}

// v26.15: 弹幕显示字体样式
internal fun PlayerActivity.showDanmakuFontStyleDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("默认", "粗体", "斜体", "粗斜体", "等宽")
    val currentIndex = options.indexOf(BiliClient.prefs.v26DanmakuFontStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕字体样式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { style ->
        BiliClient.prefs.v26DanmakuFontStyle = style
        AppToast.show(this, "字体样式：${labels[options.indexOf(style)]}")
    }
}

// v27.1: 视频播放列表自动下一个
internal fun PlayerActivity.showPlaylistAutoNextToggle() {
    val enabled = !BiliClient.prefs.v27PlaylistAutoNext
    BiliClient.prefs.v27PlaylistAutoNext = enabled
    AppToast.show(this, "自动下一个：${if (enabled) "开启" else "关闭"}")
}

// v27.2: 弹幕字体阴影透明度
internal fun PlayerActivity.showDanmakuShadowOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v27DanmakuShadowOpacity).takeIf { it >= 0 } ?: 4
    showSettingsChoiceDialog(
        title = "弹幕阴影透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { opacity ->
        BiliClient.prefs.v27DanmakuShadowOpacity = opacity
        AppToast.show(this, "阴影透明度：$opacity%")
    }
}

// v27.3: 视频画面色彩平衡
internal fun PlayerActivity.showColorBalanceDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v27ColorBalance).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩平衡",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "偏冷"; 25 -> "偏冷"; 50 -> "标准"; 75 -> "偏暖"; 100 -> "偏暖"; else -> "标准" } },
    ) { balance ->
        BiliClient.prefs.v27ColorBalance = balance
        AppToast.show(this, "色彩平衡：$balance%")
    }
}

// v27.4: 弹幕发送确认对话框
internal fun PlayerActivity.showDanmakuSendConfirmDialogToggle() {
    val enabled = !BiliClient.prefs.v27DanmakuSendConfirmDialog
    BiliClient.prefs.v27DanmakuSendConfirmDialog = enabled
    AppToast.show(this, "发送确认对话框：${if (enabled) "开启" else "关闭"}")
}

// v27.5: 播放器音量限制
internal fun PlayerActivity.showVolumeLimitDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v27VolumeLimit).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "音量限制",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { limit ->
        BiliClient.prefs.v27VolumeLimit = limit
        AppToast.show(this, "音量限制：$limit%")
    }
}

// v27.6: 视频缓存清理策略
internal fun PlayerActivity.showCacheCleanupStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("智能", "积极", "保守", "关闭")
    val currentIndex = options.indexOf(BiliClient.prefs.v27CacheCleanupStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "缓存清理策略",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { strategy ->
        BiliClient.prefs.v27CacheCleanupStrategy = strategy
        AppToast.show(this, "清理策略：${labels[options.indexOf(strategy)]}")
    }
}

// v27.7: 弹幕显示位置对齐
internal fun PlayerActivity.showDanmakuPositionAlignDialog() {
    val options = listOf(0, 1, 2)
    val labels = listOf("顶部", "居中", "底部")
    val currentIndex = options.indexOf(BiliClient.prefs.v27DanmakuPositionAlign).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕位置对齐",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { align ->
        BiliClient.prefs.v27DanmakuPositionAlign = align
        AppToast.show(this, "位置对齐：${labels[options.indexOf(align)]}")
    }
}

// v27.8: 视频画面色调曲线（已存在同名函数，使用v27前缀）
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
}

// v27.9: 弹幕发送历史记录大小
internal fun PlayerActivity.showDanmakuHistorySizeDialog() {
    val options = listOf(10, 25, 50, 100, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v27DanmakuHistorySize).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "发送历史记录大小",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}条" },
    ) { size ->
        BiliClient.prefs.v27DanmakuHistorySize = size
        AppToast.show(this, "历史记录大小：${size}条")
    }
}

// v27.10: 播放器进度条高度
internal fun PlayerActivity.showProgressBarHeightDialog() {
    val options = listOf(2, 4, 6, 8, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v27ProgressBarHeight).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "进度条高度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}dp" },
    ) { height ->
        BiliClient.prefs.v27ProgressBarHeight = height
        AppToast.show(this, "进度条高度：${height}dp")
    }
}

// v27.11: 视频投射画面延迟
internal fun PlayerActivity.showCastDelayDialog() {
    val options = listOf(0, 1000, 2000, 3000, 5000)
    val currentIndex = options.indexOf(BiliClient.prefs.v27CastDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "投射画面延迟",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "无延迟"; 1000 -> "1秒"; 2000 -> "2秒"; 3000 -> "3秒"; 5000 -> "5秒"; else -> "无延迟" } },
    ) { delay ->
        BiliClient.prefs.v27CastDelay = delay
        AppToast.show(this, "投射延迟：${delay}ms")
    }
}

// v27.12: 弹幕字体阴影大小
internal fun PlayerActivity.showDanmakuShadowSizeDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v27DanmakuShadowSize).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "弹幕阴影大小",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "无"; 1 -> "小"; 2 -> "中"; 3 -> "大"; 4 -> "很大"; 5 -> "极大"; else -> "中" } },
    ) { size ->
        BiliClient.prefs.v27DanmakuShadowSize = size
        AppToast.show(this, "阴影大小：$size")
    }
}

// v27.13: 播放器手势双击功能（已存在同名函数，使用v27前缀）
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
}

// v27.14: 视频画面降噪强度
internal fun PlayerActivity.showDenoiseStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v27DenoiseStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "降噪强度",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}%" },
    ) { strength ->
        BiliClient.prefs.v27DenoiseStrength = strength
        AppToast.show(this, "降噪强度：$strength%")
    }
}

// v27.15: 弹幕显示字体间距（已存在同名函数，使用v27前缀）
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
}

// v28.1: 视频播放列表自动跳过
internal fun PlayerActivity.showAutoSkipToggle() {
    val enabled = !BiliClient.prefs.v28AutoSkip
    BiliClient.prefs.v28AutoSkip = enabled
    AppToast.show(this, "自动跳过：${if (enabled) "开" else "关"}")
}

// v28.2: 弹幕字体背景圆角
internal fun PlayerActivity.showDanmakuBackgroundCornerRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v28DanmakuBackgroundCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "背景圆角",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}px" },
    ) { radius ->
        BiliClient.prefs.v28DanmakuBackgroundCornerRadius = radius
        AppToast.show(this, "背景圆角：${radius}px")
    }
}

// v28.3: 视频画面色彩饱和度
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
}

// v28.4: 弹幕发送确认震动强度
internal fun PlayerActivity.showSendConfirmVibrationStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v28SendConfirmVibrationStrength).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "震动强度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "中(50)" } },
    ) { strength ->
        BiliClient.prefs.v28SendConfirmVibrationStrength = strength
        AppToast.show(this, "震动强度：$strength")
    }
}

// v28.5: 播放器音量淡入淡出
internal fun PlayerActivity.showVolumeFadeToggle() {
    val enabled = !BiliClient.prefs.v28VolumeFade
    BiliClient.prefs.v28VolumeFade = enabled
    AppToast.show(this, "音量淡入淡出：${if (enabled) "开" else "关"}")
}

// v28.6: 视频缓存预加载间隔
internal fun PlayerActivity.showPreloadIntervalDialog() {
    val options = listOf(1, 3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v28PreloadInterval).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "预加载间隔",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}秒" },
    ) { interval ->
        BiliClient.prefs.v28PreloadInterval = interval
        AppToast.show(this, "预加载间隔：${interval}秒")
    }
}

// v28.7: 弹幕显示位置边距
internal fun PlayerActivity.showDanmakuPositionMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20, 30, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v28DanmakuPositionMargin).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "位置边距",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}px" },
    ) { margin ->
        BiliClient.prefs.v28DanmakuPositionMargin = margin
        AppToast.show(this, "位置边距：${margin}px")
    }
}

// v28.8: 视频画面色彩对比度
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
}

// v28.9: 弹幕发送历史记录清理
internal fun PlayerActivity.showHistoryCleanupDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("不清理", "1天后", "3天后", "7天后")
    val currentIndex = options.indexOf(BiliClient.prefs.v28HistoryCleanup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "历史记录清理",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { cleanup ->
        BiliClient.prefs.v28HistoryCleanup = cleanup
        AppToast.show(this, "历史记录清理：${labels[options.indexOf(cleanup)]}")
    }
}

// v28.10: 播放器进度条圆角
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
}

// v28.12: 弹幕字体背景边距
internal fun PlayerActivity.showDanmakuBackgroundPaddingDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v28DanmakuBackgroundPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "背景边距",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}px" },
    ) { padding ->
        BiliClient.prefs.v28DanmakuBackgroundPadding = padding
        AppToast.show(this, "背景边距：${padding}px")
    }
}

// v28.13: 播放器手势滑动灵敏度
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
}

// v28.15: 弹幕显示字体阴影
internal fun PlayerActivity.showDanmakuFontShadowDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v28DanmakuFontShadow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "字体阴影",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { shadow ->
        BiliClient.prefs.v28DanmakuFontShadow = shadow
        AppToast.show(this, "字体阴影：$shadow")
    }
}

// v29.1: 视频播放列表自动排序
internal fun PlayerActivity.showAutoSortToggle() {
    val enabled = !BiliClient.prefs.v29AutoSort
    BiliClient.prefs.v29AutoSort = enabled
    AppToast.show(this, "自动排序：${if (enabled) "开" else "关"}")
}

// v29.2: 弹幕字体背景颜色
internal fun PlayerActivity.showDanmakuBackgroundColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "白色", "灰色", "深灰", "透明")
    val currentIndex = options.indexOf(BiliClient.prefs.v29DanmakuBackgroundColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "背景颜色",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { color ->
        BiliClient.prefs.v29DanmakuBackgroundColor = color
        AppToast.show(this, "背景颜色：${labels[options.indexOf(color)]}")
    }
}

// v29.3: 视频画面色彩色调
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
}

// v29.4: 弹幕发送确认对话框样式
internal fun PlayerActivity.showSendConfirmDialogStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("默认", "简洁", "详细", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v29SendConfirmDialogStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "对话框样式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { style ->
        BiliClient.prefs.v29SendConfirmDialogStyle = style
        AppToast.show(this, "对话框样式：${labels[options.indexOf(style)]}")
    }
}

// v29.5: 播放器音量限制模式
internal fun PlayerActivity.showVolumeLimitModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "软限制", "硬限制", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v29VolumeLimitMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "音量限制模式",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { mode ->
        BiliClient.prefs.v29VolumeLimitMode = mode
        AppToast.show(this, "音量限制模式：${labels[options.indexOf(mode)]}")
    }
}

// v29.6: 视频缓存清理阈值
internal fun PlayerActivity.showCacheCleanupThresholdDialog() {
    val options = listOf(50, 100, 200, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v29CacheCleanupThreshold).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "清理阈值",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> "${v}MB" },
    ) { threshold ->
        BiliClient.prefs.v29CacheCleanupThreshold = threshold
        AppToast.show(this, "清理阈值：${threshold}MB")
    }
}

// v29.7: 弹幕显示位置偏移（已存在同名函数，使用v29前缀）
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
}

// v29.9: 弹幕发送历史记录导出
internal fun PlayerActivity.showHistoryExportToggle() {
    val enabled = !BiliClient.prefs.v29HistoryExport
    BiliClient.prefs.v29HistoryExport = enabled
    AppToast.show(this, "历史记录导出：${if (enabled) "开" else "关"}")
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
}

// v29.12: 弹幕字体背景透明度
internal fun PlayerActivity.showDanmakuBackgroundOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v29DanmakuBackgroundOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "背景透明度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } },
    ) { opacity ->
        BiliClient.prefs.v29DanmakuBackgroundOpacity = opacity
        AppToast.show(this, "背景透明度：$opacity%")
    }
}

// v29.13: 播放器手势长按功能
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
}

// v29.15: 弹幕显示字体描边
internal fun PlayerActivity.showDanmakuFontStrokeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v29DanmakuFontStroke).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "字体描边",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { stroke ->
        BiliClient.prefs.v29DanmakuFontStroke = stroke
        AppToast.show(this, "字体描边：$stroke")
    }
}

// v30.1: 视频播放列表自动循环
internal fun PlayerActivity.showAutoLoopToggle() {
    val enabled = !BiliClient.prefs.v30AutoLoop
    BiliClient.prefs.v30AutoLoop = enabled
    AppToast.show(this, "自动循环：${if (enabled) "开" else "关"}")
}

// v30.2: 弹幕字体背景边框
internal fun PlayerActivity.showDanmakuBackgroundBorderDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "细线", "中等", "粗线", "虚线", "点线")
    val currentIndex = options.indexOf(BiliClient.prefs.v30DanmakuBackgroundBorder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "背景边框",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> labels[options.indexOf(v)] },
    ) { border ->
        BiliClient.prefs.v30DanmakuBackgroundBorder = border
        AppToast.show(this, "背景边框：${labels[options.indexOf(border)]}")
    }
}

// v30.3: 视频画面色彩锐化
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
}

// v30.9: 弹幕发送历史记录导入
internal fun PlayerActivity.showHistoryImportToggle() {
    val enabled = !BiliClient.prefs.v30HistoryImport
    BiliClient.prefs.v30HistoryImport = enabled
    AppToast.show(this, "历史记录导入：${if (enabled) "开" else "关"}")
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
}

// v30.15: 弹幕显示字体发光
internal fun PlayerActivity.showDanmakuFontGlowDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v30DanmakuFontGlow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "字体发光",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } },
    ) { glow ->
        BiliClient.prefs.v30DanmakuFontGlow = glow
        AppToast.show(this, "字体发光：$glow")
    }
}

// v31.1: 视频播放列表自动跳过片头
internal fun PlayerActivity.showV31AutoSkipIntroToggle() {
    val enabled = !BiliClient.prefs.v31AutoSkipIntro
    BiliClient.prefs.v31AutoSkipIntro = enabled
    AppToast.show(this, "自动跳过片头：${if (enabled) "开" else "关"}")
}

// v31.2: 弹幕字体背景渐变
internal fun PlayerActivity.showV31DanmakuBackgroundGradientDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "线性", "径向", "角度", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuBackgroundGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景渐变", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v31DanmakuBackgroundGradient = gradient; AppToast.show(this, "背景渐变：${labels[options.indexOf(gradient)]}") }
}

// v31.3: 视频画面色彩对比度曲线
internal fun PlayerActivity.showV31ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v31ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

// v31.4: 弹幕发送确认震动间隔
internal fun PlayerActivity.showV31VibrationIntervalDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v31VibrationInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动间隔", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "关闭" else "${v}ms" }) { interval -> BiliClient.prefs.v31VibrationInterval = interval; AppToast.show(this, "震动间隔：${if (interval == 0) "关闭" else "${interval}ms"}") }
}

// v31.5: 播放器音量限制模式切换
internal fun PlayerActivity.showV31VolumeLimitModeSwitchToggle() {
    val enabled = !BiliClient.prefs.v31VolumeLimitModeSwitch
    BiliClient.prefs.v31VolumeLimitModeSwitch = enabled
    AppToast.show(this, "音量限制模式切换：${if (enabled) "开" else "关"}")
}

// v31.6: 视频缓存清理优先级
internal fun PlayerActivity.showV31CacheCleanupPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("低", "中", "高", "最高")
    val currentIndex = options.indexOf(BiliClient.prefs.v31CacheCleanupPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理优先级", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { priority -> BiliClient.prefs.v31CacheCleanupPriority = priority; AppToast.show(this, "清理优先级：${labels[options.indexOf(priority)]}") }
}

// v31.7: 弹幕显示位置对齐偏移
internal fun PlayerActivity.showV31DanmakuPositionAlignOffsetDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuPositionAlignOffset).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "对齐偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "左移(-50)"; -25 -> "左移(-25)"; 0 -> "标准(0)"; 25 -> "右移(+25)"; 50 -> "右移(+50)"; else -> "标准(0)" } }) { offset -> BiliClient.prefs.v31DanmakuPositionAlignOffset = offset; AppToast.show(this, "对齐偏移：$offset") }
}

// v31.8: 视频画面色彩饱和度曲线
internal fun PlayerActivity.showV31ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v31ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

// v31.9: 弹幕发送历史记录搜索
internal fun PlayerActivity.showV31HistorySearchToggle() {
    val enabled = !BiliClient.prefs.v31HistorySearch
    BiliClient.prefs.v31HistorySearch = enabled
    AppToast.show(this, "历史记录搜索：${if (enabled) "开" else "关"}")
}

// v31.10: 播放器进度条动画
internal fun PlayerActivity.showV31ProgressBarAnimationDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("无", "淡入淡出", "滑动", "缩放", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ProgressBarAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条动画", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { animation -> BiliClient.prefs.v31ProgressBarAnimation = animation; AppToast.show(this, "进度条动画：${labels[options.indexOf(animation)]}") }
}

// v31.11: 视频投射画面缓冲策略
internal fun PlayerActivity.showV31CastBufferStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "保守", "激进", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31CastBufferStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v31CastBufferStrategy = strategy; AppToast.show(this, "缓冲策略：${labels[options.indexOf(strategy)]}") }
}

// v31.12: 弹幕字体背景渐变方向
internal fun PlayerActivity.showV31DanmakuBackgroundGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("上到下", "左到右", "对角", "径向")
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuBackgroundGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v31DanmakuBackgroundGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

// v31.13: 播放器手势滑动阈值
internal fun PlayerActivity.showV31SwipeThresholdDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v31SwipeThreshold).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动阈值", options = options, checkedIndex = currentIndex, label = { v -> "${v}px" }) { threshold -> BiliClient.prefs.v31SwipeThreshold = threshold; AppToast.show(this, "滑动阈值：${threshold}px") }
}

// v31.14: 视频画面色彩亮度曲线
internal fun PlayerActivity.showV31ColorBrightnessCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31ColorBrightnessCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "亮度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v31ColorBrightnessCurve = curve; AppToast.show(this, "亮度曲线：${labels[options.indexOf(curve)]}") }
}

// v31.15: 弹幕显示字体发光颜色
internal fun PlayerActivity.showV31DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v31DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v31DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

// v32.1: 视频播放列表自动跳过片尾
internal fun PlayerActivity.showV32AutoSkipOutroToggle() {
    val enabled = !BiliClient.prefs.v32AutoSkipOutro
    BiliClient.prefs.v32AutoSkipOutro = enabled
    AppToast.show(this, "自动跳过片尾：${if (enabled) "开" else "关"}")
}

// v32.2: 弹幕字体背景渐变颜色
internal fun PlayerActivity.showV32DanmakuBackgroundGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuBackgroundGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v32DanmakuBackgroundGradientColor = color; AppToast.show(this, "渐变颜色：${labels[options.indexOf(color)]}") }
}

// v32.3: 视频画面色彩色调曲线
internal fun PlayerActivity.showV32ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "暖色调", "冷色调", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

// v32.4: 弹幕发送确认震动强度曲线
internal fun PlayerActivity.showV32VibrationStrengthCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32VibrationStrengthCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32VibrationStrengthCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

// v32.5: 播放器音量限制阈值曲线
internal fun PlayerActivity.showV32VolumeLimitThresholdCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32VolumeLimitThresholdCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32VolumeLimitThresholdCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

// v32.6: 视频缓存清理策略曲线
internal fun PlayerActivity.showV32CacheCleanupStrategyCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32CacheCleanupStrategyCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32CacheCleanupStrategyCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

// v32.7: 弹幕显示位置对齐方式曲线
internal fun PlayerActivity.showV32DanmakuPositionAlignModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuPositionAlignModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32DanmakuPositionAlignModeCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

// v32.8: 视频画面色彩降噪曲线
internal fun PlayerActivity.showV32ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

// v32.9: 弹幕发送历史记录导出格式
internal fun PlayerActivity.showV32HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v32HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

// v32.10: 播放器进度条颜色渐变
internal fun PlayerActivity.showV32ProgressBarColorGradientDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "红到蓝", "蓝到绿", "绿到黄", "彩虹", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ProgressBarColorGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "颜色渐变", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v32ProgressBarColorGradient = gradient; AppToast.show(this, "颜色渐变：${labels[options.indexOf(gradient)]}") }
}

// v32.11: 视频投射画面延迟策略
internal fun PlayerActivity.showV32CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v32CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

// v32.12: 弹幕字体背景渐变透明度
internal fun PlayerActivity.showV32DanmakuBackgroundGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuBackgroundGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { opacity -> BiliClient.prefs.v32DanmakuBackgroundGradientOpacity = opacity; AppToast.show(this, "渐变透明度：$opacity%") }
}

// v32.13: 播放器手势滑动速度
internal fun PlayerActivity.showV32SwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v32SwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "慢(10)"; 25 -> "较慢(25)"; 50 -> "中(50)"; 75 -> "较快(75)"; 100 -> "快(100)"; else -> "中(50)" } }) { speed -> BiliClient.prefs.v32SwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

// v32.14: 视频画面色彩模糊曲线
internal fun PlayerActivity.showV32ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v32ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v32ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

// v32.15: 弹幕显示字体发光强度
internal fun PlayerActivity.showV32DanmakuFontGlowStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v32DanmakuFontGlowStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { strength -> BiliClient.prefs.v32DanmakuFontGlowStrength = strength; AppToast.show(this, "发光强度：$strength") }
}

// v33.1: 视频播放列表自动排序方式
internal fun PlayerActivity.showV33AutoSortModeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("默认", "正序", "倒序", "随机", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33AutoSortMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "排序方式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v33AutoSortMode = mode; AppToast.show(this, "排序方式：${labels[options.indexOf(mode)]}") }
}

// v33.2: 弹幕字体背景渐变位置
internal fun PlayerActivity.showV33DanmakuBackgroundGradientPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("顶部", "底部", "居中", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuBackgroundGradientPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变位置", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { position -> BiliClient.prefs.v33DanmakuBackgroundGradientPosition = position; AppToast.show(this, "渐变位置：${labels[options.indexOf(position)]}") }
}

// v33.3: 视频画面色彩锐化曲线
internal fun PlayerActivity.showV33ColorSharpenCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ColorSharpenCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "锐化曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33ColorSharpenCurve = curve; AppToast.show(this, "锐化曲线：${labels[options.indexOf(curve)]}") }
}

// v33.4: 弹幕发送确认震动模式曲线
internal fun PlayerActivity.showV33VibrationModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33VibrationModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动模式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33VibrationModeCurve = curve; AppToast.show(this, "震动模式曲线：${labels[options.indexOf(curve)]}") }
}

// v33.5: 播放器音量限制阈值模式
internal fun PlayerActivity.showV33VolumeLimitThresholdModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("固定", "动态", "自适应", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33VolumeLimitThresholdMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "阈值模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v33VolumeLimitThresholdMode = mode; AppToast.show(this, "阈值模式：${labels[options.indexOf(mode)]}") }
}

// v33.6: 视频缓存清理模式曲线
internal fun PlayerActivity.showV33CacheCleanupModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33CacheCleanupModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理模式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33CacheCleanupModeCurve = curve; AppToast.show(this, "清理模式曲线：${labels[options.indexOf(curve)]}") }
}

// v33.7: 弹幕显示位置对齐偏移曲线
internal fun PlayerActivity.showV33DanmakuPositionAlignOffsetCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuPositionAlignOffsetCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐偏移曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33DanmakuPositionAlignOffsetCurve = curve; AppToast.show(this, "对齐偏移曲线：${labels[options.indexOf(curve)]}") }
}

// v33.8: 视频画面色彩对比度曲线
internal fun PlayerActivity.showV33ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

// v33.9: 弹幕发送历史记录导入格式
internal fun PlayerActivity.showV33HistoryImportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33HistoryImportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导入格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v33HistoryImportFormat = format; AppToast.show(this, "导入格式：${labels[options.indexOf(format)]}") }
}

// v33.10: 播放器进度条颜色渐变方向
internal fun PlayerActivity.showV33ProgressBarColorGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("左到右", "右到左", "中心向外", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ProgressBarColorGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v33ProgressBarColorGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

// v33.11: 视频投射画面缓冲策略曲线
internal fun PlayerActivity.showV33CastBufferStrategyCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33CastBufferStrategyCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33CastBufferStrategyCurve = curve; AppToast.show(this, "缓冲策略曲线：${labels[options.indexOf(curve)]}") }
}

// v33.12: 弹幕字体背景渐变速度
internal fun PlayerActivity.showV33DanmakuBackgroundGradientSpeedDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuBackgroundGradientSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "慢(25)"; 50 -> "中(50)"; 75 -> "快(75)"; 100 -> "最快(100)"; else -> "关闭" } }) { speed -> BiliClient.prefs.v33DanmakuBackgroundGradientSpeed = speed; AppToast.show(this, "渐变速度：$speed") }
}

// v33.13: 播放器手势滑动方向
internal fun PlayerActivity.showV33SwipeDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("水平", "垂直", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33SwipeDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "滑动方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v33SwipeDirection = direction; AppToast.show(this, "滑动方向：${labels[options.indexOf(direction)]}") }
}

// v33.14: 视频画面色彩饱和度曲线
internal fun PlayerActivity.showV33ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v33ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

// v33.15: 弹幕显示字体发光颜色
internal fun PlayerActivity.showV33DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v33DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v33DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

// v34.1: 视频播放列表自动循环模式
internal fun PlayerActivity.showV34AutoLoopModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "单曲循环", "列表循环", "随机循环")
    val currentIndex = options.indexOf(BiliClient.prefs.v34AutoLoopMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "循环模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v34AutoLoopMode = mode; AppToast.show(this, "循环模式：${labels[options.indexOf(mode)]}") }
}

// v34.2: 弹幕字体背景渐变类型
internal fun PlayerActivity.showV34DanmakuBackgroundGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val labels = listOf("线性", "径向", "角度", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuBackgroundGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变类型", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { type -> BiliClient.prefs.v34DanmakuBackgroundGradientType = type; AppToast.show(this, "渐变类型：${labels[options.indexOf(type)]}") }
}

// v34.3: 视频画面色彩色调曲线
internal fun PlayerActivity.showV34ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "暖色调", "冷色调", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

// v34.4: 弹幕发送确认震动强度曲线
internal fun PlayerActivity.showV34VibrationStrengthCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34VibrationStrengthCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34VibrationStrengthCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

// v34.5: 播放器音量限制阈值曲线
internal fun PlayerActivity.showV34VolumeLimitThresholdCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34VolumeLimitThresholdCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34VolumeLimitThresholdCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

// v34.6: 视频缓存清理策略曲线
internal fun PlayerActivity.showV34CacheCleanupStrategyCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34CacheCleanupStrategyCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34CacheCleanupStrategyCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

// v34.7: 弹幕显示位置对齐方式曲线
internal fun PlayerActivity.showV34DanmakuPositionAlignModeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuPositionAlignModeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34DanmakuPositionAlignModeCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

// v34.8: 视频画面色彩降噪曲线
internal fun PlayerActivity.showV34ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

// v34.9: 弹幕发送历史记录导出格式
internal fun PlayerActivity.showV34HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v34HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

// v34.10: 播放器进度条颜色渐变
internal fun PlayerActivity.showV34ProgressBarColorGradientDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "红到蓝", "蓝到绿", "绿到黄", "彩虹", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ProgressBarColorGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "颜色渐变", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v34ProgressBarColorGradient = gradient; AppToast.show(this, "颜色渐变：${labels[options.indexOf(gradient)]}") }
}

// v34.11: 视频投射画面延迟策略
internal fun PlayerActivity.showV34CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v34CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

// v34.12: 弹幕字体背景渐变透明度
internal fun PlayerActivity.showV34DanmakuBackgroundGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuBackgroundGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { opacity -> BiliClient.prefs.v34DanmakuBackgroundGradientOpacity = opacity; AppToast.show(this, "渐变透明度：$opacity%") }
}

// v34.13: 播放器手势滑动速度
internal fun PlayerActivity.showV34SwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v34SwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "慢(10)"; 25 -> "较慢(25)"; 50 -> "中(50)"; 75 -> "较快(75)"; 100 -> "快(100)"; else -> "中(50)" } }) { speed -> BiliClient.prefs.v34SwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

// v34.14: 视频画面色彩模糊曲线
internal fun PlayerActivity.showV34ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("标准", "增强", "柔和", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v34ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v34ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

// v34.15: 弹幕显示字体发光强度
internal fun PlayerActivity.showV34DanmakuFontGlowStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v34DanmakuFontGlowStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { strength -> BiliClient.prefs.v34DanmakuFontGlowStrength = strength; AppToast.show(this, "发光强度：$strength") }
}

// v35.1: 视频播放列表自动跳过片头片尾
internal fun PlayerActivity.showV35AutoSkipIntroOutroToggle() {
    val enabled = !BiliClient.prefs.v35AutoSkipIntroOutro
    BiliClient.prefs.v35AutoSkipIntroOutro = enabled
    AppToast.show(this, "自动跳过片头片尾：${if (enabled) "开" else "关"}")
}

// v35.2: 弹幕字体背景渐变颜色自定义
internal fun PlayerActivity.showV35DanmakuBackgroundGradientCustomColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuBackgroundGradientCustomColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v35DanmakuBackgroundGradientCustomColor = color; AppToast.show(this, "渐变颜色自定义：${labels[options.indexOf(color)]}") }
}

// v35.3: 视频画面色彩对比度自定义
internal fun PlayerActivity.showV35ColorContrastCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35ColorContrastCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "对比度自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "降低(-50)"; -25 -> "略降(-25)"; 0 -> "标准(0)"; 25 -> "略增(+25)"; 50 -> "增强(+50)"; else -> "标准(0)" } }) { contrast -> BiliClient.prefs.v35ColorContrastCustom = contrast; AppToast.show(this, "对比度自定义：$contrast") }
}

// v35.4: 弹幕发送确认震动自定义
internal fun PlayerActivity.showV35VibrationCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v35VibrationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { vibration -> BiliClient.prefs.v35VibrationCustom = vibration; AppToast.show(this, "震动自定义：$vibration") }
}

// v35.5: 播放器音量限制自定义
internal fun PlayerActivity.showV35VolumeLimitCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v35VolumeLimitCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量限制自定义", options = options, checkedIndex = currentIndex, label = { v -> "${v}%" }) { limit -> BiliClient.prefs.v35VolumeLimitCustom = limit; AppToast.show(this, "音量限制自定义：${limit}%") }
}

// v35.6: 视频缓存清理自定义
internal fun PlayerActivity.showV35CacheCleanupCustomDialog() {
    val options = listOf(0, 250, 500, 750, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v35CacheCleanupCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓存清理自定义", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "自动" else "${v}MB" }) { cleanup -> BiliClient.prefs.v35CacheCleanupCustom = cleanup; AppToast.show(this, "缓存清理自定义：${if (cleanup == 0) "自动" else "${cleanup}MB"}") }
}

// v35.7: 弹幕显示位置对齐自定义
internal fun PlayerActivity.showV35DanmakuPositionAlignCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuPositionAlignCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "对齐自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "左移(-50)"; -25 -> "左移(-25)"; 0 -> "标准(0)"; 25 -> "右移(+25)"; 50 -> "右移(+50)"; else -> "标准(0)" } }) { align -> BiliClient.prefs.v35DanmakuPositionAlignCustom = align; AppToast.show(this, "对齐自定义：$align") }
}

// v35.8: 视频画面色彩饱和度自定义
internal fun PlayerActivity.showV35ColorSaturationCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35ColorSaturationCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "饱和度自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "降低(-50)"; -25 -> "略降(-25)"; 0 -> "标准(0)"; 25 -> "略增(+25)"; 50 -> "增强(+50)"; else -> "标准(0)" } }) { saturation -> BiliClient.prefs.v35ColorSaturationCustom = saturation; AppToast.show(this, "饱和度自定义：$saturation") }
}

// v35.9: 弹幕发送历史记录自定义
internal fun PlayerActivity.showV35HistoryCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v35HistoryCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "历史记录自定义", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "不限制" else "${v}条" }) { history -> BiliClient.prefs.v35HistoryCustom = history; AppToast.show(this, "历史记录自定义：${if (history == 0) "不限制" else "${history}条"}") }
}

// v35.10: 播放器进度条颜色自定义
internal fun PlayerActivity.showV35ProgressBarColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "蓝色", "绿色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35ProgressBarColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条颜色自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v35ProgressBarColorCustom = color; AppToast.show(this, "进度条颜色自定义：${labels[options.indexOf(color)]}") }
}

// v35.11: 视频投射画面缓冲自定义
internal fun PlayerActivity.showV35CastBufferCustomDialog() {
    val options = listOf(0, 5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v35CastBufferCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲自定义", options = options, checkedIndex = currentIndex, label = { v -> if (v == 0) "自动" else "${v}秒" }) { buffer -> BiliClient.prefs.v35CastBufferCustom = buffer; AppToast.show(this, "缓冲自定义：${if (buffer == 0) "自动" else "${buffer}秒"}") }
}

// v35.12: 弹幕字体背景渐变自定义
internal fun PlayerActivity.showV35DanmakuBackgroundGradientCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("无", "线性", "径向", "角度", "对角", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuBackgroundGradientCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { gradient -> BiliClient.prefs.v35DanmakuBackgroundGradientCustom = gradient; AppToast.show(this, "渐变自定义：${labels[options.indexOf(gradient)]}") }
}

// v35.13: 播放器手势滑动自定义
internal fun PlayerActivity.showV35SwipeCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "灵敏", "迟钝", "水平", "垂直", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v35SwipeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "滑动自定义", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { swipe -> BiliClient.prefs.v35SwipeCustom = swipe; AppToast.show(this, "滑动自定义：${labels[options.indexOf(swipe)]}") }
}

// v35.14: 视频画面色彩亮度自定义
internal fun PlayerActivity.showV35ColorBrightnessCustomDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v35ColorBrightnessCustom).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "亮度自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "降低(-50)"; -25 -> "略降(-25)"; 0 -> "标准(0)"; 25 -> "略增(+25)"; 50 -> "增强(+50)"; else -> "标准(0)" } }) { brightness -> BiliClient.prefs.v35ColorBrightnessCustom = brightness; AppToast.show(this, "亮度自定义：$brightness") }
}

// v35.15: 弹幕显示字体发光自定义
internal fun PlayerActivity.showV35DanmakuFontGlowCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v35DanmakuFontGlowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光自定义", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { glow -> BiliClient.prefs.v35DanmakuFontGlowCustom = glow; AppToast.show(this, "发光自定义：$glow") }
}

// v36.1: 视频播放速度记忆
internal fun PlayerActivity.showV36PlaybackSpeedMemoryToggle() {
    val current = BiliClient.prefs.v36PlaybackSpeedMemory
    BiliClient.prefs.v36PlaybackSpeedMemory = !current
    AppToast.show(this, "播放速度记忆：${if (!current) "开启" else "关闭"}")
}

// v36.2: 弹幕字体描边颜色
internal fun PlayerActivity.showV36DanmakuFontStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "白色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuFontStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "描边颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v36DanmakuFontStrokeColor = color; AppToast.show(this, "描边颜色：${labels[options.indexOf(color)]}") }
}

// v36.3: 视频画面色彩色温
internal fun PlayerActivity.showV36ColorTemperatureDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorTemperature).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色温调节", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "冷色(-50)"; -25 -> "略冷(-25)"; 0 -> "标准(0)"; 25 -> "略暖(+25)"; 50 -> "暖色(+50)"; else -> "标准(0)" } }) { temp -> BiliClient.prefs.v36ColorTemperature = temp; AppToast.show(this, "色温：$temp") }
}

// v36.4: 弹幕发送确认震动模式
internal fun PlayerActivity.showV36VibrationPatternDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("关闭", "短促", "持续", "脉冲", "渐弱", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36VibrationPattern).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { pattern -> BiliClient.prefs.v36VibrationPattern = pattern; AppToast.show(this, "震动模式：${labels[options.indexOf(pattern)]}") }
}

// v36.5: 播放器音量步进值
internal fun PlayerActivity.showV36VolumeStepDialog() {
    val options = listOf(1, 2, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v36VolumeStep).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量步进", options = options, checkedIndex = currentIndex, label = { v -> "${v}%" }) { step -> BiliClient.prefs.v36VolumeStep = step; AppToast.show(this, "音量步进：${step}%") }
}

// v36.6: 视频缓存大小限制
internal fun PlayerActivity.showV36CacheSizeLimitDialog() {
    val options = listOf(100, 200, 500, 1000, 1500, 2000)
    val currentIndex = options.indexOf(BiliClient.prefs.v36CacheSizeLimit).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "缓存限制", options = options, checkedIndex = currentIndex, label = { v -> "${v}MB" }) { limit -> BiliClient.prefs.v36CacheSizeLimit = limit; AppToast.show(this, "缓存限制：${limit}MB") }
}

// v36.7: 弹幕显示区域限制
internal fun PlayerActivity.showV36DanmakuDisplayAreaDialog() {
    val options = listOf(25, 50, 75, 100)
    val labels = listOf("1/4屏", "半屏", "3/4屏", "全屏")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuDisplayArea).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(title = "显示区域", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { area -> BiliClient.prefs.v36DanmakuDisplayArea = area; AppToast.show(this, "显示区域：${labels[options.indexOf(area)]}") }
}

// v36.8: 视频画面色彩伽马
internal fun PlayerActivity.showV36ColorGammaDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorGamma).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "伽马调节", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "暗沉(-50)"; -25 -> "略暗(-25)"; 0 -> "标准(0)"; 25 -> "略亮(+25)"; 50 -> "明亮(+50)"; else -> "标准(0)" } }) { gamma -> BiliClient.prefs.v36ColorGamma = gamma; AppToast.show(this, "伽马：$gamma") }
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

// v1181: adapt mode
internal fun PlayerActivity.showV1181AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adapt
    FeaturePrefsStore.batch1181.v1181adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1181: adept mode
internal fun PlayerActivity.showV1181AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adept
    FeaturePrefsStore.batch1181.v1181adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1181: admit mode
internal fun PlayerActivity.showV1181AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1181admit
    FeaturePrefsStore.batch1181.v1181admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1181: adopt mode
internal fun PlayerActivity.showV1181AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adopt
    FeaturePrefsStore.batch1181.v1181adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1181: adult mode
internal fun PlayerActivity.showV1181AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1181adult
    FeaturePrefsStore.batch1181.v1181adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1181: advance level
internal fun PlayerActivity.showV1181AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1181: advice level
internal fun PlayerActivity.showV1181AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1181: aerial level
internal fun PlayerActivity.showV1181AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1181: affair level
internal fun PlayerActivity.showV1181AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1181: affect level
internal fun PlayerActivity.showV1181AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1181affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1181affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1181: afford mode
internal fun PlayerActivity.showV1181AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1181afford
    FeaturePrefsStore.batch1181.v1181afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1181: afield mode
internal fun PlayerActivity.showV1181AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1181afield
    FeaturePrefsStore.batch1181.v1181afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1181: age mode
internal fun PlayerActivity.showV1181AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1181age
    FeaturePrefsStore.batch1181.v1181age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1181: agency mode
internal fun PlayerActivity.showV1181AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1181agency
    FeaturePrefsStore.batch1181.v1181agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1181: agenda mode
internal fun PlayerActivity.showV1181AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1181agenda
    FeaturePrefsStore.batch1181.v1181agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1182: adapt mode
internal fun PlayerActivity.showV1182AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adapt
    FeaturePrefsStore.batch1181.v1182adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1182: adept mode
internal fun PlayerActivity.showV1182AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adept
    FeaturePrefsStore.batch1181.v1182adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1182: admit mode
internal fun PlayerActivity.showV1182AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1182admit
    FeaturePrefsStore.batch1181.v1182admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1182: adopt mode
internal fun PlayerActivity.showV1182AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adopt
    FeaturePrefsStore.batch1181.v1182adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1182: adult mode
internal fun PlayerActivity.showV1182AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1182adult
    FeaturePrefsStore.batch1181.v1182adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1182: advance level
internal fun PlayerActivity.showV1182AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1182: advice level
internal fun PlayerActivity.showV1182AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1182: aerial level
internal fun PlayerActivity.showV1182AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1182: affair level
internal fun PlayerActivity.showV1182AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1182: affect level
internal fun PlayerActivity.showV1182AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1182affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1182affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1182: afford mode
internal fun PlayerActivity.showV1182AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1182afford
    FeaturePrefsStore.batch1181.v1182afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1182: afield mode
internal fun PlayerActivity.showV1182AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1182afield
    FeaturePrefsStore.batch1181.v1182afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1182: age mode
internal fun PlayerActivity.showV1182AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1182age
    FeaturePrefsStore.batch1181.v1182age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1182: agency mode
internal fun PlayerActivity.showV1182AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1182agency
    FeaturePrefsStore.batch1181.v1182agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1182: agenda mode
internal fun PlayerActivity.showV1182AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1182agenda
    FeaturePrefsStore.batch1181.v1182agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1183: adapt mode
internal fun PlayerActivity.showV1183AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adapt
    FeaturePrefsStore.batch1181.v1183adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1183: adept mode
internal fun PlayerActivity.showV1183AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adept
    FeaturePrefsStore.batch1181.v1183adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1183: admit mode
internal fun PlayerActivity.showV1183AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1183admit
    FeaturePrefsStore.batch1181.v1183admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1183: adopt mode
internal fun PlayerActivity.showV1183AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adopt
    FeaturePrefsStore.batch1181.v1183adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1183: adult mode
internal fun PlayerActivity.showV1183AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1183adult
    FeaturePrefsStore.batch1181.v1183adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1183: advance level
internal fun PlayerActivity.showV1183AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1183: advice level
internal fun PlayerActivity.showV1183AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1183: aerial level
internal fun PlayerActivity.showV1183AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1183: affair level
internal fun PlayerActivity.showV1183AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1183: affect level
internal fun PlayerActivity.showV1183AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1183affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1183affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1183: afford mode
internal fun PlayerActivity.showV1183AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1183afford
    FeaturePrefsStore.batch1181.v1183afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1183: afield mode
internal fun PlayerActivity.showV1183AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1183afield
    FeaturePrefsStore.batch1181.v1183afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1183: age mode
internal fun PlayerActivity.showV1183AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1183age
    FeaturePrefsStore.batch1181.v1183age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1183: agency mode
internal fun PlayerActivity.showV1183AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1183agency
    FeaturePrefsStore.batch1181.v1183agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1183: agenda mode
internal fun PlayerActivity.showV1183AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1183agenda
    FeaturePrefsStore.batch1181.v1183agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1184: adapt mode
internal fun PlayerActivity.showV1184AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adapt
    FeaturePrefsStore.batch1181.v1184adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1184: adept mode
internal fun PlayerActivity.showV1184AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adept
    FeaturePrefsStore.batch1181.v1184adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1184: admit mode
internal fun PlayerActivity.showV1184AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1184admit
    FeaturePrefsStore.batch1181.v1184admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1184: adopt mode
internal fun PlayerActivity.showV1184AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adopt
    FeaturePrefsStore.batch1181.v1184adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1184: adult mode
internal fun PlayerActivity.showV1184AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1184adult
    FeaturePrefsStore.batch1181.v1184adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1184: advance level
internal fun PlayerActivity.showV1184AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1184: advice level
internal fun PlayerActivity.showV1184AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1184: aerial level
internal fun PlayerActivity.showV1184AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1184: affair level
internal fun PlayerActivity.showV1184AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1184: affect level
internal fun PlayerActivity.showV1184AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1184affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1184affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1184: afford mode
internal fun PlayerActivity.showV1184AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1184afford
    FeaturePrefsStore.batch1181.v1184afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1184: afield mode
internal fun PlayerActivity.showV1184AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1184afield
    FeaturePrefsStore.batch1181.v1184afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1184: age mode
internal fun PlayerActivity.showV1184AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1184age
    FeaturePrefsStore.batch1181.v1184age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1184: agency mode
internal fun PlayerActivity.showV1184AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1184agency
    FeaturePrefsStore.batch1181.v1184agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1184: agenda mode
internal fun PlayerActivity.showV1184AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1184agenda
    FeaturePrefsStore.batch1181.v1184agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1185: adapt mode
internal fun PlayerActivity.showV1185AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adapt
    FeaturePrefsStore.batch1181.v1185adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1185: adept mode
internal fun PlayerActivity.showV1185AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adept
    FeaturePrefsStore.batch1181.v1185adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1185: admit mode
internal fun PlayerActivity.showV1185AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1185admit
    FeaturePrefsStore.batch1181.v1185admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1185: adopt mode
internal fun PlayerActivity.showV1185AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adopt
    FeaturePrefsStore.batch1181.v1185adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1185: adult mode
internal fun PlayerActivity.showV1185AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1185adult
    FeaturePrefsStore.batch1181.v1185adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1185: advance level
internal fun PlayerActivity.showV1185AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1185: advice level
internal fun PlayerActivity.showV1185AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1185: aerial level
internal fun PlayerActivity.showV1185AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1185: affair level
internal fun PlayerActivity.showV1185AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1185: affect level
internal fun PlayerActivity.showV1185AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1185affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1185affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1185: afford mode
internal fun PlayerActivity.showV1185AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1185afford
    FeaturePrefsStore.batch1181.v1185afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1185: afield mode
internal fun PlayerActivity.showV1185AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1185afield
    FeaturePrefsStore.batch1181.v1185afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1185: age mode
internal fun PlayerActivity.showV1185AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1185age
    FeaturePrefsStore.batch1181.v1185age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1185: agency mode
internal fun PlayerActivity.showV1185AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1185agency
    FeaturePrefsStore.batch1181.v1185agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1185: agenda mode
internal fun PlayerActivity.showV1185AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1185agenda
    FeaturePrefsStore.batch1181.v1185agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1186: adapt mode
internal fun PlayerActivity.showV1186AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adapt
    FeaturePrefsStore.batch1181.v1186adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1186: adept mode
internal fun PlayerActivity.showV1186AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adept
    FeaturePrefsStore.batch1181.v1186adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1186: admit mode
internal fun PlayerActivity.showV1186AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1186admit
    FeaturePrefsStore.batch1181.v1186admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1186: adopt mode
internal fun PlayerActivity.showV1186AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adopt
    FeaturePrefsStore.batch1181.v1186adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1186: adult mode
internal fun PlayerActivity.showV1186AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1186adult
    FeaturePrefsStore.batch1181.v1186adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1186: advance level
internal fun PlayerActivity.showV1186AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1186: advice level
internal fun PlayerActivity.showV1186AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1186: aerial level
internal fun PlayerActivity.showV1186AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1186: affair level
internal fun PlayerActivity.showV1186AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1186: affect level
internal fun PlayerActivity.showV1186AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1186affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1186affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1186: afford mode
internal fun PlayerActivity.showV1186AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1186afford
    FeaturePrefsStore.batch1181.v1186afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1186: afield mode
internal fun PlayerActivity.showV1186AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1186afield
    FeaturePrefsStore.batch1181.v1186afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1186: age mode
internal fun PlayerActivity.showV1186AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1186age
    FeaturePrefsStore.batch1181.v1186age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1186: agency mode
internal fun PlayerActivity.showV1186AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1186agency
    FeaturePrefsStore.batch1181.v1186agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1186: agenda mode
internal fun PlayerActivity.showV1186AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1186agenda
    FeaturePrefsStore.batch1181.v1186agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1187: adapt mode
internal fun PlayerActivity.showV1187AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adapt
    FeaturePrefsStore.batch1181.v1187adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1187: adept mode
internal fun PlayerActivity.showV1187AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adept
    FeaturePrefsStore.batch1181.v1187adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1187: admit mode
internal fun PlayerActivity.showV1187AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1187admit
    FeaturePrefsStore.batch1181.v1187admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1187: adopt mode
internal fun PlayerActivity.showV1187AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adopt
    FeaturePrefsStore.batch1181.v1187adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1187: adult mode
internal fun PlayerActivity.showV1187AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1187adult
    FeaturePrefsStore.batch1181.v1187adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1187: advance level
internal fun PlayerActivity.showV1187AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1187: advice level
internal fun PlayerActivity.showV1187AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1187: aerial level
internal fun PlayerActivity.showV1187AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1187: affair level
internal fun PlayerActivity.showV1187AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1187: affect level
internal fun PlayerActivity.showV1187AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1187affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1187affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1187: afford mode
internal fun PlayerActivity.showV1187AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1187afford
    FeaturePrefsStore.batch1181.v1187afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1187: afield mode
internal fun PlayerActivity.showV1187AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1187afield
    FeaturePrefsStore.batch1181.v1187afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1187: age mode
internal fun PlayerActivity.showV1187AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1187age
    FeaturePrefsStore.batch1181.v1187age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1187: agency mode
internal fun PlayerActivity.showV1187AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1187agency
    FeaturePrefsStore.batch1181.v1187agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1187: agenda mode
internal fun PlayerActivity.showV1187AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1187agenda
    FeaturePrefsStore.batch1181.v1187agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1188: adapt mode
internal fun PlayerActivity.showV1188AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adapt
    FeaturePrefsStore.batch1181.v1188adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1188: adept mode
internal fun PlayerActivity.showV1188AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adept
    FeaturePrefsStore.batch1181.v1188adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1188: admit mode
internal fun PlayerActivity.showV1188AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1188admit
    FeaturePrefsStore.batch1181.v1188admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1188: adopt mode
internal fun PlayerActivity.showV1188AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adopt
    FeaturePrefsStore.batch1181.v1188adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1188: adult mode
internal fun PlayerActivity.showV1188AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1188adult
    FeaturePrefsStore.batch1181.v1188adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1188: advance level
internal fun PlayerActivity.showV1188AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1188: advice level
internal fun PlayerActivity.showV1188AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1188: aerial level
internal fun PlayerActivity.showV1188AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1188: affair level
internal fun PlayerActivity.showV1188AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1188: affect level
internal fun PlayerActivity.showV1188AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1188affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1188affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1188: afford mode
internal fun PlayerActivity.showV1188AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1188afford
    FeaturePrefsStore.batch1181.v1188afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1188: afield mode
internal fun PlayerActivity.showV1188AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1188afield
    FeaturePrefsStore.batch1181.v1188afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1188: age mode
internal fun PlayerActivity.showV1188AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1188age
    FeaturePrefsStore.batch1181.v1188age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1188: agency mode
internal fun PlayerActivity.showV1188AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1188agency
    FeaturePrefsStore.batch1181.v1188agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1188: agenda mode
internal fun PlayerActivity.showV1188AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1188agenda
    FeaturePrefsStore.batch1181.v1188agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1189: adapt mode
internal fun PlayerActivity.showV1189AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adapt
    FeaturePrefsStore.batch1181.v1189adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1189: adept mode
internal fun PlayerActivity.showV1189AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adept
    FeaturePrefsStore.batch1181.v1189adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1189: admit mode
internal fun PlayerActivity.showV1189AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1189admit
    FeaturePrefsStore.batch1181.v1189admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1189: adopt mode
internal fun PlayerActivity.showV1189AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adopt
    FeaturePrefsStore.batch1181.v1189adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1189: adult mode
internal fun PlayerActivity.showV1189AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1189adult
    FeaturePrefsStore.batch1181.v1189adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1189: advance level
internal fun PlayerActivity.showV1189AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1189: advice level
internal fun PlayerActivity.showV1189AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1189: aerial level
internal fun PlayerActivity.showV1189AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1189: affair level
internal fun PlayerActivity.showV1189AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1189: affect level
internal fun PlayerActivity.showV1189AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1189affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1189affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1189: afford mode
internal fun PlayerActivity.showV1189AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1189afford
    FeaturePrefsStore.batch1181.v1189afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1189: afield mode
internal fun PlayerActivity.showV1189AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1189afield
    FeaturePrefsStore.batch1181.v1189afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1189: age mode
internal fun PlayerActivity.showV1189AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1189age
    FeaturePrefsStore.batch1181.v1189age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1189: agency mode
internal fun PlayerActivity.showV1189AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1189agency
    FeaturePrefsStore.batch1181.v1189agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1189: agenda mode
internal fun PlayerActivity.showV1189AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1189agenda
    FeaturePrefsStore.batch1181.v1189agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1190: adapt mode
internal fun PlayerActivity.showV1190AdaptToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adapt
    FeaturePrefsStore.batch1181.v1190adapt = !current
    AppToast.show(this, "adapt: ${if (!current) "ON" else "OFF"}")
}

// v1190: adept mode
internal fun PlayerActivity.showV1190AdeptToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adept
    FeaturePrefsStore.batch1181.v1190adept = !current
    AppToast.show(this, "adept: ${if (!current) "ON" else "OFF"}")
}

// v1190: admit mode
internal fun PlayerActivity.showV1190AdmitToggle() {
    val current = FeaturePrefsStore.batch1181.v1190admit
    FeaturePrefsStore.batch1181.v1190admit = !current
    AppToast.show(this, "admit: ${if (!current) "ON" else "OFF"}")
}

// v1190: adopt mode
internal fun PlayerActivity.showV1190AdoptToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adopt
    FeaturePrefsStore.batch1181.v1190adopt = !current
    AppToast.show(this, "adopt: ${if (!current) "ON" else "OFF"}")
}

// v1190: adult mode
internal fun PlayerActivity.showV1190AdultToggle() {
    val current = FeaturePrefsStore.batch1181.v1190adult
    FeaturePrefsStore.batch1181.v1190adult = !current
    AppToast.show(this, "adult: ${if (!current) "ON" else "OFF"}")
}

// v1190: advance level
internal fun PlayerActivity.showV1190AdvanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190advance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190advance = value
        AppToast.show(this, "advance: $value")
    }
}

// v1190: advice level
internal fun PlayerActivity.showV1190AdviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190advice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "advice level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190advice = value
        AppToast.show(this, "advice: $value")
    }
}

// v1190: aerial level
internal fun PlayerActivity.showV1190AerialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190aerial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aerial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190aerial = value
        AppToast.show(this, "aerial: $value")
    }
}

// v1190: affair level
internal fun PlayerActivity.showV1190AffairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190affair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190affair = value
        AppToast.show(this, "affair: $value")
    }
}

// v1190: affect level
internal fun PlayerActivity.showV1190AffectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1181.v1190affect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "affect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1181.v1190affect = value
        AppToast.show(this, "affect: $value")
    }
}

// v1190: afford mode
internal fun PlayerActivity.showV1190AffordToggle() {
    val current = FeaturePrefsStore.batch1181.v1190afford
    FeaturePrefsStore.batch1181.v1190afford = !current
    AppToast.show(this, "afford: ${if (!current) "ON" else "OFF"}")
}

// v1190: afield mode
internal fun PlayerActivity.showV1190AfieldToggle() {
    val current = FeaturePrefsStore.batch1181.v1190afield
    FeaturePrefsStore.batch1181.v1190afield = !current
    AppToast.show(this, "afield: ${if (!current) "ON" else "OFF"}")
}

// v1190: age mode
internal fun PlayerActivity.showV1190AgeToggle() {
    val current = FeaturePrefsStore.batch1181.v1190age
    FeaturePrefsStore.batch1181.v1190age = !current
    AppToast.show(this, "age: ${if (!current) "ON" else "OFF"}")
}

// v1190: agency mode
internal fun PlayerActivity.showV1190AgencyToggle() {
    val current = FeaturePrefsStore.batch1181.v1190agency
    FeaturePrefsStore.batch1181.v1190agency = !current
    AppToast.show(this, "agency: ${if (!current) "ON" else "OFF"}")
}

// v1190: agenda mode
internal fun PlayerActivity.showV1190AgendaToggle() {
    val current = FeaturePrefsStore.batch1181.v1190agenda
    FeaturePrefsStore.batch1181.v1190agenda = !current
    AppToast.show(this, "agenda: ${if (!current) "ON" else "OFF"}")
}

// v1191: agent mode
internal fun PlayerActivity.showV1191AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1191agent
    FeaturePrefsStore.batch1191.v1191agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1191: agile mode
internal fun PlayerActivity.showV1191AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1191agile
    FeaturePrefsStore.batch1191.v1191agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1191: aging mode
internal fun PlayerActivity.showV1191AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1191aging
    FeaturePrefsStore.batch1191.v1191aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1191: agree mode
internal fun PlayerActivity.showV1191AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1191agree
    FeaturePrefsStore.batch1191.v1191agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1191: ahead mode
internal fun PlayerActivity.showV1191AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1191ahead
    FeaturePrefsStore.batch1191.v1191ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1191: aid level
internal fun PlayerActivity.showV1191AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1191: aim level
internal fun PlayerActivity.showV1191AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1191: air level
internal fun PlayerActivity.showV1191AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191air = value
        AppToast.show(this, "air: $value")
    }
}

// v1191: alarm level
internal fun PlayerActivity.showV1191AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1191: album level
internal fun PlayerActivity.showV1191AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1191album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1191album = value
        AppToast.show(this, "album: $value")
    }
}

// v1191: algae mode
internal fun PlayerActivity.showV1191AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1191algae
    FeaturePrefsStore.batch1191.v1191algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1191: alias mode
internal fun PlayerActivity.showV1191AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alias
    FeaturePrefsStore.batch1191.v1191alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1191: alien mode
internal fun PlayerActivity.showV1191AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alien
    FeaturePrefsStore.batch1191.v1191alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1191: alive mode
internal fun PlayerActivity.showV1191AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alive
    FeaturePrefsStore.batch1191.v1191alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1191: alley mode
internal fun PlayerActivity.showV1191AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1191alley
    FeaturePrefsStore.batch1191.v1191alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1192: agent mode
internal fun PlayerActivity.showV1192AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1192agent
    FeaturePrefsStore.batch1191.v1192agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1192: agile mode
internal fun PlayerActivity.showV1192AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1192agile
    FeaturePrefsStore.batch1191.v1192agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1192: aging mode
internal fun PlayerActivity.showV1192AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1192aging
    FeaturePrefsStore.batch1191.v1192aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1192: agree mode
internal fun PlayerActivity.showV1192AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1192agree
    FeaturePrefsStore.batch1191.v1192agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1192: ahead mode
internal fun PlayerActivity.showV1192AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1192ahead
    FeaturePrefsStore.batch1191.v1192ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1192: aid level
internal fun PlayerActivity.showV1192AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1192: aim level
internal fun PlayerActivity.showV1192AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1192: air level
internal fun PlayerActivity.showV1192AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192air = value
        AppToast.show(this, "air: $value")
    }
}

// v1192: alarm level
internal fun PlayerActivity.showV1192AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1192: album level
internal fun PlayerActivity.showV1192AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1192album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1192album = value
        AppToast.show(this, "album: $value")
    }
}

// v1192: algae mode
internal fun PlayerActivity.showV1192AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1192algae
    FeaturePrefsStore.batch1191.v1192algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1192: alias mode
internal fun PlayerActivity.showV1192AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alias
    FeaturePrefsStore.batch1191.v1192alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1192: alien mode
internal fun PlayerActivity.showV1192AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alien
    FeaturePrefsStore.batch1191.v1192alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1192: alive mode
internal fun PlayerActivity.showV1192AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alive
    FeaturePrefsStore.batch1191.v1192alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1192: alley mode
internal fun PlayerActivity.showV1192AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1192alley
    FeaturePrefsStore.batch1191.v1192alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1193: agent mode
internal fun PlayerActivity.showV1193AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1193agent
    FeaturePrefsStore.batch1191.v1193agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1193: agile mode
internal fun PlayerActivity.showV1193AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1193agile
    FeaturePrefsStore.batch1191.v1193agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1193: aging mode
internal fun PlayerActivity.showV1193AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1193aging
    FeaturePrefsStore.batch1191.v1193aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1193: agree mode
internal fun PlayerActivity.showV1193AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1193agree
    FeaturePrefsStore.batch1191.v1193agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1193: ahead mode
internal fun PlayerActivity.showV1193AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1193ahead
    FeaturePrefsStore.batch1191.v1193ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1193: aid level
internal fun PlayerActivity.showV1193AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1193: aim level
internal fun PlayerActivity.showV1193AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1193: air level
internal fun PlayerActivity.showV1193AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193air = value
        AppToast.show(this, "air: $value")
    }
}

// v1193: alarm level
internal fun PlayerActivity.showV1193AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1193: album level
internal fun PlayerActivity.showV1193AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1193album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1193album = value
        AppToast.show(this, "album: $value")
    }
}

// v1193: algae mode
internal fun PlayerActivity.showV1193AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1193algae
    FeaturePrefsStore.batch1191.v1193algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1193: alias mode
internal fun PlayerActivity.showV1193AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alias
    FeaturePrefsStore.batch1191.v1193alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1193: alien mode
internal fun PlayerActivity.showV1193AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alien
    FeaturePrefsStore.batch1191.v1193alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1193: alive mode
internal fun PlayerActivity.showV1193AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alive
    FeaturePrefsStore.batch1191.v1193alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1193: alley mode
internal fun PlayerActivity.showV1193AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1193alley
    FeaturePrefsStore.batch1191.v1193alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1194: agent mode
internal fun PlayerActivity.showV1194AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1194agent
    FeaturePrefsStore.batch1191.v1194agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1194: agile mode
internal fun PlayerActivity.showV1194AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1194agile
    FeaturePrefsStore.batch1191.v1194agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1194: aging mode
internal fun PlayerActivity.showV1194AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1194aging
    FeaturePrefsStore.batch1191.v1194aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1194: agree mode
internal fun PlayerActivity.showV1194AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1194agree
    FeaturePrefsStore.batch1191.v1194agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1194: ahead mode
internal fun PlayerActivity.showV1194AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1194ahead
    FeaturePrefsStore.batch1191.v1194ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1194: aid level
internal fun PlayerActivity.showV1194AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1194: aim level
internal fun PlayerActivity.showV1194AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1194: air level
internal fun PlayerActivity.showV1194AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194air = value
        AppToast.show(this, "air: $value")
    }
}

// v1194: alarm level
internal fun PlayerActivity.showV1194AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1194: album level
internal fun PlayerActivity.showV1194AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1194album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1194album = value
        AppToast.show(this, "album: $value")
    }
}

// v1194: algae mode
internal fun PlayerActivity.showV1194AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1194algae
    FeaturePrefsStore.batch1191.v1194algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1194: alias mode
internal fun PlayerActivity.showV1194AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alias
    FeaturePrefsStore.batch1191.v1194alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1194: alien mode
internal fun PlayerActivity.showV1194AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alien
    FeaturePrefsStore.batch1191.v1194alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1194: alive mode
internal fun PlayerActivity.showV1194AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alive
    FeaturePrefsStore.batch1191.v1194alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1194: alley mode
internal fun PlayerActivity.showV1194AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1194alley
    FeaturePrefsStore.batch1191.v1194alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1195: agent mode
internal fun PlayerActivity.showV1195AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1195agent
    FeaturePrefsStore.batch1191.v1195agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1195: agile mode
internal fun PlayerActivity.showV1195AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1195agile
    FeaturePrefsStore.batch1191.v1195agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1195: aging mode
internal fun PlayerActivity.showV1195AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1195aging
    FeaturePrefsStore.batch1191.v1195aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1195: agree mode
internal fun PlayerActivity.showV1195AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1195agree
    FeaturePrefsStore.batch1191.v1195agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1195: ahead mode
internal fun PlayerActivity.showV1195AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1195ahead
    FeaturePrefsStore.batch1191.v1195ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1195: aid level
internal fun PlayerActivity.showV1195AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1195: aim level
internal fun PlayerActivity.showV1195AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1195: air level
internal fun PlayerActivity.showV1195AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195air = value
        AppToast.show(this, "air: $value")
    }
}

// v1195: alarm level
internal fun PlayerActivity.showV1195AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1195: album level
internal fun PlayerActivity.showV1195AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1195album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1195album = value
        AppToast.show(this, "album: $value")
    }
}

// v1195: algae mode
internal fun PlayerActivity.showV1195AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1195algae
    FeaturePrefsStore.batch1191.v1195algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1195: alias mode
internal fun PlayerActivity.showV1195AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alias
    FeaturePrefsStore.batch1191.v1195alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1195: alien mode
internal fun PlayerActivity.showV1195AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alien
    FeaturePrefsStore.batch1191.v1195alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1195: alive mode
internal fun PlayerActivity.showV1195AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alive
    FeaturePrefsStore.batch1191.v1195alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1195: alley mode
internal fun PlayerActivity.showV1195AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1195alley
    FeaturePrefsStore.batch1191.v1195alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1196: agent mode
internal fun PlayerActivity.showV1196AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1196agent
    FeaturePrefsStore.batch1191.v1196agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1196: agile mode
internal fun PlayerActivity.showV1196AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1196agile
    FeaturePrefsStore.batch1191.v1196agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1196: aging mode
internal fun PlayerActivity.showV1196AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1196aging
    FeaturePrefsStore.batch1191.v1196aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1196: agree mode
internal fun PlayerActivity.showV1196AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1196agree
    FeaturePrefsStore.batch1191.v1196agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1196: ahead mode
internal fun PlayerActivity.showV1196AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1196ahead
    FeaturePrefsStore.batch1191.v1196ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1196: aid level
internal fun PlayerActivity.showV1196AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1196: aim level
internal fun PlayerActivity.showV1196AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1196: air level
internal fun PlayerActivity.showV1196AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196air = value
        AppToast.show(this, "air: $value")
    }
}

// v1196: alarm level
internal fun PlayerActivity.showV1196AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1196: album level
internal fun PlayerActivity.showV1196AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1196album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1196album = value
        AppToast.show(this, "album: $value")
    }
}

// v1196: algae mode
internal fun PlayerActivity.showV1196AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1196algae
    FeaturePrefsStore.batch1191.v1196algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1196: alias mode
internal fun PlayerActivity.showV1196AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alias
    FeaturePrefsStore.batch1191.v1196alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1196: alien mode
internal fun PlayerActivity.showV1196AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alien
    FeaturePrefsStore.batch1191.v1196alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1196: alive mode
internal fun PlayerActivity.showV1196AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alive
    FeaturePrefsStore.batch1191.v1196alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1196: alley mode
internal fun PlayerActivity.showV1196AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1196alley
    FeaturePrefsStore.batch1191.v1196alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1197: agent mode
internal fun PlayerActivity.showV1197AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1197agent
    FeaturePrefsStore.batch1191.v1197agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1197: agile mode
internal fun PlayerActivity.showV1197AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1197agile
    FeaturePrefsStore.batch1191.v1197agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1197: aging mode
internal fun PlayerActivity.showV1197AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1197aging
    FeaturePrefsStore.batch1191.v1197aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1197: agree mode
internal fun PlayerActivity.showV1197AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1197agree
    FeaturePrefsStore.batch1191.v1197agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1197: ahead mode
internal fun PlayerActivity.showV1197AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1197ahead
    FeaturePrefsStore.batch1191.v1197ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1197: aid level
internal fun PlayerActivity.showV1197AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1197: aim level
internal fun PlayerActivity.showV1197AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1197: air level
internal fun PlayerActivity.showV1197AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197air = value
        AppToast.show(this, "air: $value")
    }
}

// v1197: alarm level
internal fun PlayerActivity.showV1197AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1197: album level
internal fun PlayerActivity.showV1197AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1197album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1197album = value
        AppToast.show(this, "album: $value")
    }
}

// v1197: algae mode
internal fun PlayerActivity.showV1197AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1197algae
    FeaturePrefsStore.batch1191.v1197algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1197: alias mode
internal fun PlayerActivity.showV1197AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alias
    FeaturePrefsStore.batch1191.v1197alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1197: alien mode
internal fun PlayerActivity.showV1197AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alien
    FeaturePrefsStore.batch1191.v1197alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1197: alive mode
internal fun PlayerActivity.showV1197AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alive
    FeaturePrefsStore.batch1191.v1197alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1197: alley mode
internal fun PlayerActivity.showV1197AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1197alley
    FeaturePrefsStore.batch1191.v1197alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1198: agent mode
internal fun PlayerActivity.showV1198AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1198agent
    FeaturePrefsStore.batch1191.v1198agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1198: agile mode
internal fun PlayerActivity.showV1198AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1198agile
    FeaturePrefsStore.batch1191.v1198agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1198: aging mode
internal fun PlayerActivity.showV1198AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1198aging
    FeaturePrefsStore.batch1191.v1198aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1198: agree mode
internal fun PlayerActivity.showV1198AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1198agree
    FeaturePrefsStore.batch1191.v1198agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1198: ahead mode
internal fun PlayerActivity.showV1198AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1198ahead
    FeaturePrefsStore.batch1191.v1198ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1198: aid level
internal fun PlayerActivity.showV1198AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1198: aim level
internal fun PlayerActivity.showV1198AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1198: air level
internal fun PlayerActivity.showV1198AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198air = value
        AppToast.show(this, "air: $value")
    }
}

// v1198: alarm level
internal fun PlayerActivity.showV1198AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1198: album level
internal fun PlayerActivity.showV1198AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1198album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1198album = value
        AppToast.show(this, "album: $value")
    }
}

// v1198: algae mode
internal fun PlayerActivity.showV1198AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1198algae
    FeaturePrefsStore.batch1191.v1198algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1198: alias mode
internal fun PlayerActivity.showV1198AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alias
    FeaturePrefsStore.batch1191.v1198alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1198: alien mode
internal fun PlayerActivity.showV1198AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alien
    FeaturePrefsStore.batch1191.v1198alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1198: alive mode
internal fun PlayerActivity.showV1198AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alive
    FeaturePrefsStore.batch1191.v1198alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1198: alley mode
internal fun PlayerActivity.showV1198AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1198alley
    FeaturePrefsStore.batch1191.v1198alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1199: agent mode
internal fun PlayerActivity.showV1199AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1199agent
    FeaturePrefsStore.batch1191.v1199agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1199: agile mode
internal fun PlayerActivity.showV1199AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1199agile
    FeaturePrefsStore.batch1191.v1199agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1199: aging mode
internal fun PlayerActivity.showV1199AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1199aging
    FeaturePrefsStore.batch1191.v1199aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1199: agree mode
internal fun PlayerActivity.showV1199AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1199agree
    FeaturePrefsStore.batch1191.v1199agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1199: ahead mode
internal fun PlayerActivity.showV1199AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1199ahead
    FeaturePrefsStore.batch1191.v1199ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1199: aid level
internal fun PlayerActivity.showV1199AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1199: aim level
internal fun PlayerActivity.showV1199AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1199: air level
internal fun PlayerActivity.showV1199AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199air = value
        AppToast.show(this, "air: $value")
    }
}

// v1199: alarm level
internal fun PlayerActivity.showV1199AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1199: album level
internal fun PlayerActivity.showV1199AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1199album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1199album = value
        AppToast.show(this, "album: $value")
    }
}

// v1199: algae mode
internal fun PlayerActivity.showV1199AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1199algae
    FeaturePrefsStore.batch1191.v1199algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1199: alias mode
internal fun PlayerActivity.showV1199AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alias
    FeaturePrefsStore.batch1191.v1199alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1199: alien mode
internal fun PlayerActivity.showV1199AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alien
    FeaturePrefsStore.batch1191.v1199alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1199: alive mode
internal fun PlayerActivity.showV1199AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alive
    FeaturePrefsStore.batch1191.v1199alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1199: alley mode
internal fun PlayerActivity.showV1199AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1199alley
    FeaturePrefsStore.batch1191.v1199alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}

// v1200: agent mode
internal fun PlayerActivity.showV1200AgentToggle() {
    val current = FeaturePrefsStore.batch1191.v1200agent
    FeaturePrefsStore.batch1191.v1200agent = !current
    AppToast.show(this, "agent: ${if (!current) "ON" else "OFF"}")
}

// v1200: agile mode
internal fun PlayerActivity.showV1200AgileToggle() {
    val current = FeaturePrefsStore.batch1191.v1200agile
    FeaturePrefsStore.batch1191.v1200agile = !current
    AppToast.show(this, "agile: ${if (!current) "ON" else "OFF"}")
}

// v1200: aging mode
internal fun PlayerActivity.showV1200AgingToggle() {
    val current = FeaturePrefsStore.batch1191.v1200aging
    FeaturePrefsStore.batch1191.v1200aging = !current
    AppToast.show(this, "aging: ${if (!current) "ON" else "OFF"}")
}

// v1200: agree mode
internal fun PlayerActivity.showV1200AgreeToggle() {
    val current = FeaturePrefsStore.batch1191.v1200agree
    FeaturePrefsStore.batch1191.v1200agree = !current
    AppToast.show(this, "agree: ${if (!current) "ON" else "OFF"}")
}

// v1200: ahead mode
internal fun PlayerActivity.showV1200AheadToggle() {
    val current = FeaturePrefsStore.batch1191.v1200ahead
    FeaturePrefsStore.batch1191.v1200ahead = !current
    AppToast.show(this, "ahead: ${if (!current) "ON" else "OFF"}")
}

// v1200: aid level
internal fun PlayerActivity.showV1200AidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200aid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200aid = value
        AppToast.show(this, "aid: $value")
    }
}

// v1200: aim level
internal fun PlayerActivity.showV1200AimDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200aim).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "aim level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200aim = value
        AppToast.show(this, "aim: $value")
    }
}

// v1200: air level
internal fun PlayerActivity.showV1200AirDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200air).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "air level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200air = value
        AppToast.show(this, "air: $value")
    }
}

// v1200: alarm level
internal fun PlayerActivity.showV1200AlarmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200alarm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "alarm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200alarm = value
        AppToast.show(this, "alarm: $value")
    }
}

// v1200: album level
internal fun PlayerActivity.showV1200AlbumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1191.v1200album).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "album level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1191.v1200album = value
        AppToast.show(this, "album: $value")
    }
}

// v1200: algae mode
internal fun PlayerActivity.showV1200AlgaeToggle() {
    val current = FeaturePrefsStore.batch1191.v1200algae
    FeaturePrefsStore.batch1191.v1200algae = !current
    AppToast.show(this, "algae: ${if (!current) "ON" else "OFF"}")
}

// v1200: alias mode
internal fun PlayerActivity.showV1200AliasToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alias
    FeaturePrefsStore.batch1191.v1200alias = !current
    AppToast.show(this, "alias: ${if (!current) "ON" else "OFF"}")
}

// v1200: alien mode
internal fun PlayerActivity.showV1200AlienToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alien
    FeaturePrefsStore.batch1191.v1200alien = !current
    AppToast.show(this, "alien: ${if (!current) "ON" else "OFF"}")
}

// v1200: alive mode
internal fun PlayerActivity.showV1200AliveToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alive
    FeaturePrefsStore.batch1191.v1200alive = !current
    AppToast.show(this, "alive: ${if (!current) "ON" else "OFF"}")
}

// v1200: alley mode
internal fun PlayerActivity.showV1200AlleyToggle() {
    val current = FeaturePrefsStore.batch1191.v1200alley
    FeaturePrefsStore.batch1191.v1200alley = !current
    AppToast.show(this, "alley: ${if (!current) "ON" else "OFF"}")
}
