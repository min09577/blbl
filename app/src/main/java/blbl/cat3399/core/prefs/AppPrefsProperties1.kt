package blbl.cat3399.core.prefs

// Auto-generated extension properties for AppPrefs

var AppPrefs.v22PlaybackSpeedCurveMode: Int
        get() = prefs.getInt(KEY_V22_PLAYBACK_SPEED_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_PLAYBACK_SPEED_CURVE_MODE, value.coerceIn(0, 3)).apply()

    // v22.2: 弹幕颜色过滤

var AppPrefs.v22DanmakuColorFilterEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_DANMAKU_COLOR_FILTER_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_DANMAKU_COLOR_FILTER_ENABLED, value).apply()

    // v22.3: 视频画面锐化强度

var AppPrefs.v22VideoSharpenStrength: Int
        get() = prefs.getInt(KEY_V22_VIDEO_SHARPEN_STRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V22_VIDEO_SHARPEN_STRENGTH, value.coerceIn(0, 100)).apply()

    // v22.4: 弹幕描边颜色渐变

var AppPrefs.v22DanmakuStrokeGradientMode: Int
        get() = prefs.getInt(KEY_V22_DANMAKU_STROKE_GRADIENT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_DANMAKU_STROKE_GRADIENT_MODE, value.coerceIn(0, 2)).apply()

    // v22.5: 手势轨迹显示

var AppPrefs.v22ShowGestureTrail: Boolean
        get() = prefs.getBoolean(KEY_V22_SHOW_GESTURE_TRAIL, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_SHOW_GESTURE_TRAIL, value).apply()

    // v22.6: 视频缓存大小限制

var AppPrefs.v22VideoCacheSizeMB: Long
        get() = prefs.getLong(KEY_V22_VIDEO_CACHE_SIZE_MB, 512L)
        set(value) = prefs.edit().putLong(KEY_V22_VIDEO_CACHE_SIZE_MB, value.coerceIn(100L, 2048L)).apply()

    // v22.7: 弹幕发送字数统计

var AppPrefs.v22ShowDanmakuCharCount: Boolean
        get() = prefs.getBoolean(KEY_V22_SHOW_DANMAKU_CHAR_COUNT, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_SHOW_DANMAKU_CHAR_COUNT, value).apply()

    // v22.8: 视频画面降噪

var AppPrefs.v22VideoDenoiseEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_VIDEO_DENOISE_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_VIDEO_DENOISE_ENABLED, value).apply()

    // v22.9: 弹幕透明度动画曲线

var AppPrefs.v22DanmakuOpacityCurveMode: Int
        get() = prefs.getInt(KEY_V22_DANMAKU_OPACITY_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_DANMAKU_OPACITY_CURVE_MODE, value.coerceIn(0, 3)).apply()

    // v22.10: 播放器快捷面板自定义

var AppPrefs.v22QuickPanelCustomEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_QUICK_PANEL_CUSTOM_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_QUICK_PANEL_CUSTOM_ENABLED, value).apply()

    // v22.11: 视频投射分辨率限制

var AppPrefs.v22CastResolutionLimit: Int
        get() = prefs.getInt(KEY_V22_CAST_RESOLUTION_LIMIT, 0)
        set(value) = prefs.edit().putInt(KEY_V22_CAST_RESOLUTION_LIMIT, value).apply()

    // v22.12: 弹幕字体大小自适应

var AppPrefs.v22DanmakuFontAutoSizeMode: Int
        get() = prefs.getInt(KEY_V22_DANMAKU_FONT_AUTO_SIZE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_DANMAKU_FONT_AUTO_SIZE_MODE, value.coerceIn(0, 2)).apply()

    // v22.13: 播放器截图格式选择

var AppPrefs.v22ScreenshotFormat: String
        get() = prefs.getString(KEY_V22_SCREENSHOT_FORMAT, "png") ?: "png"
        set(value) = prefs.edit().putString(KEY_V22_SCREENSHOT_FORMAT, value).apply()

    // v22.14: 视频色彩饱和度调节

var AppPrefs.v22VideoSaturation: Int
        get() = prefs.getInt(KEY_V22_VIDEO_SATURATION, 100)
        set(value) = prefs.edit().putInt(KEY_V22_VIDEO_SATURATION, value.coerceIn(50, 150)).apply()

    // v22.15: 弹幕时间轴标记

var AppPrefs.v22DanmakuTimelineMarkerEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_DANMAKU_TIMELINE_MARKER_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_DANMAKU_TIMELINE_MARKER_ENABLED, value).apply()

    // ==================== v23.x 新功能 ====================
    // v23.1: 视频播放速度预设自定义

var AppPrefs.v23CustomSpeedPresets: String
        get() = prefs.getString(KEY_V23_CUSTOM_SPEED_PRESETS, "0.5,0.75,1.0,1.25,1.5,2.0,3.0") ?: "0.5,0.75,1.0,1.25,1.5,2.0,3.0"
        set(value) = prefs.edit().putString(KEY_V23_CUSTOM_SPEED_PRESETS, value).apply()

var AppPrefs.v23CustomSpeedPresetsEnabled: Boolean
        get() = prefs.getBoolean("v23_custom_speed_presets_enabled", false)
        set(value) = prefs.edit().putBoolean("v23_custom_speed_presets_enabled", value).apply()

    // v23.2: 弹幕字体阴影颜色

var AppPrefs.v23DanmakuShadowColor: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_SHADOW_COLOR, 0x000000)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_SHADOW_COLOR, value).apply()

    // v23.3: 视频画面色彩温度

var AppPrefs.v23VideoColorTemperature: Int
        get() = prefs.getInt(KEY_V23_VIDEO_COLOR_TEMPERATURE, 6500)
        set(value) = prefs.edit().putInt(KEY_V23_VIDEO_COLOR_TEMPERATURE, value.coerceIn(3000, 10000)).apply()

    // v23.4: 弹幕发送震动强度

var AppPrefs.v23DanmakuVibrationStrength: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_VIBRATION_STRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_VIBRATION_STRENGTH, value.coerceIn(0, 100)).apply()

    // v23.5: 播放器手势灵敏度

var AppPrefs.v23GestureSensitivity: Int
        get() = prefs.getInt(KEY_V23_GESTURE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_V23_GESTURE_SENSITIVITY, value.coerceIn(10, 100)).apply()

    // v23.6: 视频缓存预加载大小

var AppPrefs.v23CachePreloadSizeMB: Int
        get() = prefs.getInt(KEY_V23_CACHE_PRELOAD_SIZE_MB, 50)
        set(value) = prefs.edit().putInt(KEY_V23_CACHE_PRELOAD_SIZE_MB, value.coerceIn(10, 200)).apply()

    // v23.7: 弹幕显示区域透明度

var AppPrefs.v23DanmakuAreaOpacity: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_AREA_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_AREA_OPACITY, value.coerceIn(0, 100)).apply()

    // v23.8: 视频画面伽马调节

var AppPrefs.v23VideoGamma: Int
        get() = prefs.getInt(KEY_V23_VIDEO_GAMMA, 100)
        set(value) = prefs.edit().putInt(KEY_V23_VIDEO_GAMMA, value.coerceIn(50, 200)).apply()

    // v23.9: 弹幕发送确认震动

var AppPrefs.v23DanmakuSendConfirmVibration: Boolean
        get() = prefs.getBoolean(KEY_V23_DANMAKU_SEND_CONFIRM_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V23_DANMAKU_SEND_CONFIRM_VIBRATION, value).apply()

    // v23.10: 播放器快捷键映射

var AppPrefs.v23QuickKeyMapping: Boolean
        get() = prefs.getBoolean(KEY_V23_QUICK_KEY_MAPPING, false)
        set(value) = prefs.edit().putBoolean(KEY_V23_QUICK_KEY_MAPPING, value).apply()

    // v23.11: 视频投射缓冲大小

var AppPrefs.v23CastBufferSizeMB: Int
        get() = prefs.getInt(KEY_V23_CAST_BUFFER_SIZE_MB, 30)
        set(value) = prefs.edit().putInt(KEY_V23_CAST_BUFFER_SIZE_MB, value.coerceIn(10, 100)).apply()

    // v23.12: 弹幕字体间距调节

var AppPrefs.v23DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_FONT_SPACING, value.coerceIn(-5, 10)).apply()

    // v23.13: 播放器截图质量

var AppPrefs.v23ScreenshotQuality: Int
        get() = prefs.getInt(KEY_V23_SCREENSHOT_QUALITY, 90)
        set(value) = prefs.edit().putInt(KEY_V23_SCREENSHOT_QUALITY, value.coerceIn(50, 100)).apply()

    // v23.14: 视频画面色调调节

var AppPrefs.v23VideoHue: Int
        get() = prefs.getInt(KEY_V23_VIDEO_HUE, 0)
        set(value) = prefs.edit().putInt(KEY_V23_VIDEO_HUE, value.coerceIn(-180, 180)).apply()

    // v23.15: 弹幕时间轴缩放速度

var AppPrefs.v23TimelineZoomSpeed: Int
        get() = prefs.getInt(KEY_V23_TIMELINE_ZOOM_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V23_TIMELINE_ZOOM_SPEED, value.coerceIn(10, 100)).apply()

    // ==================== v24.x 新功能 ====================
    // v24.1: 视频播放列表循环模式

var AppPrefs.v24PlaylistLoopMode: Int
        get() = prefs.getInt(KEY_V24_PLAYLIST_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_PLAYLIST_LOOP_MODE, value.coerceIn(0, 3)).apply()

    // v24.2: 弹幕字体描边粗细

var AppPrefs.v24DanmakuStrokeWidth: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_STROKE_WIDTH, 2)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_STROKE_WIDTH, value.coerceIn(0, 5)).apply()

    // v24.3: 视频画面亮度曲线

var AppPrefs.v24BrightnessCurveMode: Int
        get() = prefs.getInt(KEY_V24_BRIGHTNESS_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_BRIGHTNESS_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v24.4: 弹幕发送延迟调节

var AppPrefs.v24DanmakuSendDelay: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_SEND_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_SEND_DELAY, value.coerceIn(0, 2000)).apply()

    // v24.5: 播放器音量步进

var AppPrefs.v24VolumeStep: Int
        get() = prefs.getInt(KEY_V24_VOLUME_STEP, 5)
        set(value) = prefs.edit().putInt(KEY_V24_VOLUME_STEP, value.coerceIn(1, 20)).apply()

    // v24.6: 视频缓存清理间隔

var AppPrefs.v24CacheCleanupInterval: Int
        get() = prefs.getInt(KEY_V24_CACHE_CLEANUP_INTERVAL, 7)
        set(value) = prefs.edit().putInt(KEY_V24_CACHE_CLEANUP_INTERVAL, value.coerceIn(1, 30)).apply()

    // v24.7: 弹幕显示位置偏移

var AppPrefs.v24DanmakuPositionOffset: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_POSITION_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_POSITION_OFFSET, value.coerceIn(-50, 50)).apply()

    // v24.8: 视频画面对比度曲线

var AppPrefs.v24ContrastCurveMode: Int
        get() = prefs.getInt(KEY_V24_CONTRAST_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_CONTRAST_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v24.9: 弹幕发送历史记录数

var AppPrefs.v24DanmakuSendHistoryCount: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_SEND_HISTORY_COUNT, 20)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_SEND_HISTORY_COUNT, value.coerceIn(5, 100)).apply()

    // v24.10: 播放器进度条样式

var AppPrefs.v24ProgressBarStyle: Int
        get() = prefs.getInt(KEY_V24_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_PROGRESS_BAR_STYLE, value.coerceIn(0, 3)).apply()

    // v24.11: 视频投射画面质量

var AppPrefs.v24CastQuality: Int
        get() = prefs.getInt(KEY_V24_CAST_QUALITY, 1)
        set(value) = prefs.edit().putInt(KEY_V24_CAST_QUALITY, value.coerceIn(0, 3)).apply()

    // v24.12: 弹幕字体描边透明度

var AppPrefs.v24DanmakuStrokeOpacity: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_STROKE_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_STROKE_OPACITY, value.coerceIn(0, 100)).apply()

    // v24.13: 播放器手势双击功能

var AppPrefs.v24DoubleTapFunction: Int
        get() = prefs.getInt(KEY_V24_DOUBLE_TAP_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V24_DOUBLE_TAP_FUNCTION, value.coerceIn(0, 5)).apply()

    // v24.14: 视频画面色调曲线

var AppPrefs.v24ToneCurveMode: Int
        get() = prefs.getInt(KEY_V24_TONE_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_TONE_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v24.15: 弹幕显示刷新率

var AppPrefs.v24DanmakuRefreshRate: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_REFRESH_RATE, 60)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_REFRESH_RATE, value.coerceIn(30, 120)).apply()

    // ==================== v25.x 新功能 ====================
    // v25.1: 视频播放列表随机播放

var AppPrefs.v25PlaylistShuffle: Boolean
        get() = prefs.getBoolean(KEY_V25_PLAYLIST_SHUFFLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V25_PLAYLIST_SHUFFLE, value).apply()

    // v25.2: 弹幕字体背景颜色

var AppPrefs.v25DanmakuBgColor: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_BG_COLOR, 0x000000)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_BG_COLOR, value).apply()

    // v25.3: 视频画面饱和度曲线

var AppPrefs.v25SaturationCurveMode: Int
        get() = prefs.getInt(KEY_V25_SATURATION_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V25_SATURATION_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v25.4: 弹幕发送确认对话框

var AppPrefs.v25DanmakuSendConfirm: Boolean
        get() = prefs.getBoolean(KEY_V25_DANMAKU_SEND_CONFIRM, false)
        set(value) = prefs.edit().putBoolean(KEY_V25_DANMAKU_SEND_CONFIRM, value).apply()

    // v25.5: 播放器音量记忆

var AppPrefs.v25RememberVolume: Boolean
        get() = prefs.getBoolean(KEY_V25_REMEMBER_VOLUME, false)
        set(value) = prefs.edit().putBoolean(KEY_V25_REMEMBER_VOLUME, value).apply()

    // v25.6: 视频缓存预加载策略

var AppPrefs.v25CachePreloadStrategy: Int
        get() = prefs.getInt(KEY_V25_CACHE_PRELOAD_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V25_CACHE_PRELOAD_STRATEGY, value.coerceIn(0, 3)).apply()

    // v25.7: 弹幕显示时间长度

var AppPrefs.v25DanmakuDisplayDuration: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_DISPLAY_DURATION, 10)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_DISPLAY_DURATION, value.coerceIn(5, 30)).apply()

    // v25.8: 视频画面锐化曲线

var AppPrefs.v25SharpenCurveMode: Int
        get() = prefs.getInt(KEY_V25_SHARPEN_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V25_SHARPEN_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v25.9: 弹幕发送历史记录

var AppPrefs.v25DanmakuSendHistory: Boolean
        get() = prefs.getBoolean(KEY_V25_DANMAKU_SEND_HISTORY, true)
        set(value) = prefs.edit().putBoolean(KEY_V25_DANMAKU_SEND_HISTORY, value).apply()

    // v25.10: 播放器进度条颜色

var AppPrefs.v25ProgressBarColor: Int
        get() = prefs.getInt(KEY_V25_PROGRESS_BAR_COLOR, 0xFFFFFF)
        set(value) = prefs.edit().putInt(KEY_V25_PROGRESS_BAR_COLOR, value).apply()

    // v25.11: 视频投射音频质量

var AppPrefs.v25CastAudioQuality: Int
        get() = prefs.getInt(KEY_V25_CAST_AUDIO_QUALITY, 1)
        set(value) = prefs.edit().putInt(KEY_V25_CAST_AUDIO_QUALITY, value.coerceIn(0, 3)).apply()

    // v25.12: 弹幕字体背景透明度

var AppPrefs.v25DanmakuBgOpacity: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_BG_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_BG_OPACITY, value.coerceIn(0, 100)).apply()

    // v25.13: 播放器手势长按功能

var AppPrefs.v25LongPressFunction: Int
        get() = prefs.getInt(KEY_V25_LONG_PRESS_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V25_LONG_PRESS_FUNCTION, value.coerceIn(0, 5)).apply()

    // v25.14: 视频画面降噪曲线

var AppPrefs.v25DenoiseCurveMode: Int
        get() = prefs.getInt(KEY_V25_DENOISE_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V25_DENOISE_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v25.15: 弹幕显示字体大小

var AppPrefs.v25DanmakuFontSize: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_FONT_SIZE, 25)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_FONT_SIZE, value.coerceIn(12, 50)).apply()

    // ==================== v26.x 新功能 ====================
    // v26.1: 视频播放列表自动播放

var AppPrefs.v26PlaylistAutoPlay: Boolean
        get() = prefs.getBoolean(KEY_V26_PLAYLIST_AUTO_PLAY, true)
        set(value) = prefs.edit().putBoolean(KEY_V26_PLAYLIST_AUTO_PLAY, value).apply()

    // v26.2: 弹幕字体边框颜色

var AppPrefs.v26DanmakuBorderColor: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_BORDER_COLOR, 0x000000)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_BORDER_COLOR, value).apply()

    // v26.3: 视频画面对比度曲线

var AppPrefs.v26ContrastCurveMode: Int
        get() = prefs.getInt(KEY_V26_CONTRAST_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_CONTRAST_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v26.4: 弹幕发送确认震动

var AppPrefs.v26DanmakuSendVibration: Boolean
        get() = prefs.getBoolean(KEY_V26_DANMAKU_SEND_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V26_DANMAKU_SEND_VIBRATION, value).apply()

    // v26.5: 播放器音量均衡

var AppPrefs.v26VolumeBalance: Int
        get() = prefs.getInt(KEY_V26_VOLUME_BALANCE, 50)
        set(value) = prefs.edit().putInt(KEY_V26_VOLUME_BALANCE, value.coerceIn(0, 100)).apply()

    // v26.6: 视频缓存预加载大小

var AppPrefs.v26CachePreloadSize: Int
        get() = prefs.getInt(KEY_V26_CACHE_PRELOAD_SIZE, 50)
        set(value) = prefs.edit().putInt(KEY_V26_CACHE_PRELOAD_SIZE, value.coerceIn(10, 200)).apply()

    // v26.7: 弹幕显示透明度

var AppPrefs.v26DanmakuDisplayOpacity: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_DISPLAY_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_DISPLAY_OPACITY, value.coerceIn(0, 100)).apply()

    // v26.8: 视频画面亮度曲线

var AppPrefs.v26BrightnessCurveMode: Int
        get() = prefs.getInt(KEY_V26_BRIGHTNESS_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_BRIGHTNESS_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v26.9: 弹幕发送历史记录数

var AppPrefs.v26DanmakuHistoryCount: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_HISTORY_COUNT, 20)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_HISTORY_COUNT, value.coerceIn(5, 100)).apply()

    // v26.10: 播放器进度条透明度

var AppPrefs.v26ProgressBarOpacity: Int
        get() = prefs.getInt(KEY_V26_PROGRESS_BAR_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V26_PROGRESS_BAR_OPACITY, value.coerceIn(0, 100)).apply()

    // v26.11: 视频投射缓冲策略

var AppPrefs.v26CastBufferStrategy: Int
        get() = prefs.getInt(KEY_V26_CAST_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V26_CAST_BUFFER_STRATEGY, value.coerceIn(0, 3)).apply()

    // v26.12: 弹幕字体边框透明度

var AppPrefs.v26DanmakuBorderOpacity: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_BORDER_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_BORDER_OPACITY, value.coerceIn(0, 100)).apply()

    // v26.13: 播放器手势滑动功能

var AppPrefs.v26SwipeFunction: Int
        get() = prefs.getInt(KEY_V26_SWIPE_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V26_SWIPE_FUNCTION, value.coerceIn(0, 5)).apply()

    // v26.14: 视频画面饱和度曲线

var AppPrefs.v26SaturationCurveMode: Int
        get() = prefs.getInt(KEY_V26_SATURATION_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_SATURATION_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v26.15: 弹幕显示字体样式

var AppPrefs.v26DanmakuFontStyle: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_FONT_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_FONT_STYLE, value.coerceIn(0, 4)).apply()

    // ==================== v27.x 新功能 ====================
    // v27.1: 视频播放列表自动下一个

var AppPrefs.v27PlaylistAutoNext: Boolean
        get() = prefs.getBoolean(KEY_V27_PLAYLIST_AUTO_NEXT, true)
        set(value) = prefs.edit().putBoolean(KEY_V27_PLAYLIST_AUTO_NEXT, value).apply()

    // v27.2: 弹幕字体阴影透明度

var AppPrefs.v27DanmakuShadowOpacity: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_SHADOW_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_SHADOW_OPACITY, value.coerceIn(0, 100)).apply()

    // v27.3: 视频画面色彩平衡

var AppPrefs.v27ColorBalance: Int
        get() = prefs.getInt(KEY_V27_COLOR_BALANCE, 50)
        set(value) = prefs.edit().putInt(KEY_V27_COLOR_BALANCE, value.coerceIn(0, 100)).apply()

    // v27.4: 弹幕发送确认对话框

var AppPrefs.v27DanmakuSendConfirmDialog: Boolean
        get() = prefs.getBoolean(KEY_V27_DANMAKU_SEND_CONFIRM_DIALOG, false)
        set(value) = prefs.edit().putBoolean(KEY_V27_DANMAKU_SEND_CONFIRM_DIALOG, value).apply()

    // v27.5: 播放器音量限制

var AppPrefs.v27VolumeLimit: Int
        get() = prefs.getInt(KEY_V27_VOLUME_LIMIT, 100)
        set(value) = prefs.edit().putInt(KEY_V27_VOLUME_LIMIT, value.coerceIn(50, 150)).apply()

    // v27.6: 视频缓存清理策略

var AppPrefs.v27CacheCleanupStrategy: Int
        get() = prefs.getInt(KEY_V27_CACHE_CLEANUP_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V27_CACHE_CLEANUP_STRATEGY, value.coerceIn(0, 3)).apply()

    // v27.7: 弹幕显示位置对齐

var AppPrefs.v27DanmakuPositionAlign: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_POSITION_ALIGN, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_POSITION_ALIGN, value.coerceIn(0, 2)).apply()

    // v27.8: 视频画面色调曲线

var AppPrefs.v27ToneCurveMode: Int
        get() = prefs.getInt(KEY_V27_TONE_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V27_TONE_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v27.9: 弹幕发送历史记录大小

var AppPrefs.v27DanmakuHistorySize: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_HISTORY_SIZE, 50)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_HISTORY_SIZE, value.coerceIn(10, 200)).apply()

    // v27.10: 播放器进度条高度

var AppPrefs.v27ProgressBarHeight: Int
        get() = prefs.getInt(KEY_V27_PROGRESS_BAR_HEIGHT, 4)
        set(value) = prefs.edit().putInt(KEY_V27_PROGRESS_BAR_HEIGHT, value.coerceIn(2, 10)).apply()

    // v27.11: 视频投射画面延迟

var AppPrefs.v27CastDelay: Int
        get() = prefs.getInt(KEY_V27_CAST_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V27_CAST_DELAY, value.coerceIn(0, 5000)).apply()

    // v27.12: 弹幕字体阴影大小

var AppPrefs.v27DanmakuShadowSize: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_SHADOW_SIZE, 2)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_SHADOW_SIZE, value.coerceIn(0, 5)).apply()

    // v27.13: 播放器手势双击功能

var AppPrefs.v27DoubleTapFunction: Int
        get() = prefs.getInt(KEY_V27_DOUBLE_TAP_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DOUBLE_TAP_FUNCTION, value.coerceIn(0, 5)).apply()

    // v27.14: 视频画面降噪强度

var AppPrefs.v27DenoiseStrength: Int
        get() = prefs.getInt(KEY_V27_DENOISE_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DENOISE_STRENGTH, value.coerceIn(0, 100)).apply()

    // v27.15: 弹幕显示字体间距

var AppPrefs.v27DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_FONT_SPACING, value.coerceIn(-5, 10)).apply()
    
    // v28.1: 视频播放列表自动跳过

var AppPrefs.v28AutoSkip: Boolean
        get() = prefs.getBoolean(KEY_V28_AUTO_SKIP, false)
        set(value) = prefs.edit().putBoolean(KEY_V28_AUTO_SKIP, value).apply()
    
    // v28.2: 弹幕字体背景圆角

var AppPrefs.v28DanmakuBackgroundCornerRadius: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_BACKGROUND_CORNER_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_BACKGROUND_CORNER_RADIUS, value.coerceIn(0, 20)).apply()
    
    // v28.3: 视频画面色彩饱和度

var AppPrefs.v28ColorSaturation: Int
        get() = prefs.getInt(KEY_V28_COLOR_SATURATION, 0)
        set(value) = prefs.edit().putInt(KEY_V28_COLOR_SATURATION, value.coerceIn(-50, 50)).apply()
    
    // v28.4: 弹幕发送确认震动强度

var AppPrefs.v28SendConfirmVibrationStrength: Int
        get() = prefs.getInt(KEY_V28_SEND_CONFIRM_VIBRATION_STRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V28_SEND_CONFIRM_VIBRATION_STRENGTH, value.coerceIn(0, 100)).apply()
    
    // v28.5: 播放器音量淡入淡出

var AppPrefs.v28VolumeFade: Boolean
        get() = prefs.getBoolean(KEY_V28_VOLUME_FADE, false)
        set(value) = prefs.edit().putBoolean(KEY_V28_VOLUME_FADE, value).apply()
    
    // v28.6: 视频缓存预加载间隔

var AppPrefs.v28PreloadInterval: Int
        get() = prefs.getInt(KEY_V28_PRELOAD_INTERVAL, 5)
        set(value) = prefs.edit().putInt(KEY_V28_PRELOAD_INTERVAL, value.coerceIn(1, 30)).apply()
    
    // v28.7: 弹幕显示位置边距

var AppPrefs.v28DanmakuPositionMargin: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_POSITION_MARGIN, 10)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_POSITION_MARGIN, value.coerceIn(0, 50)).apply()
    
    // v28.8: 视频画面色彩对比度

var AppPrefs.v28ColorContrast: Int
        get() = prefs.getInt(KEY_V28_COLOR_CONTRAST, 0)
        set(value) = prefs.edit().putInt(KEY_V28_COLOR_CONTRAST, value.coerceIn(-50, 50)).apply()
    
    // v28.9: 弹幕发送历史记录清理

var AppPrefs.v28HistoryCleanup: Int
        get() = prefs.getInt(KEY_V28_HISTORY_CLEANUP, 0)
        set(value) = prefs.edit().putInt(KEY_V28_HISTORY_CLEANUP, value.coerceIn(0, 3)).apply()
    
    // v28.10: 播放器进度条圆角

var AppPrefs.v28ProgressBarCornerRadius: Int
        get() = prefs.getInt(KEY_V28_PROGRESS_BAR_CORNER_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V28_PROGRESS_BAR_CORNER_RADIUS, value.coerceIn(0, 20)).apply()
    
    // v28.11: 视频投射画面缓冲

var AppPrefs.v28CastBuffer: Int
        get() = prefs.getInt(KEY_V28_CAST_BUFFER, 5)
        set(value) = prefs.edit().putInt(KEY_V28_CAST_BUFFER, value.coerceIn(1, 30)).apply()
    
    // v28.12: 弹幕字体背景边距

var AppPrefs.v28DanmakuBackgroundPadding: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_BACKGROUND_PADDING, 0)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_BACKGROUND_PADDING, value.coerceIn(0, 20)).apply()
    
    // v28.13: 播放器手势滑动灵敏度

var AppPrefs.v28SwipeSensitivity: Int
        get() = prefs.getInt(KEY_V28_SWIPE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_V28_SWIPE_SENSITIVITY, value.coerceIn(10, 100)).apply()
    
    // v28.14: 视频画面色彩亮度

var AppPrefs.v28ColorBrightness: Int
        get() = prefs.getInt(KEY_V28_COLOR_BRIGHTNESS, 0)
        set(value) = prefs.edit().putInt(KEY_V28_COLOR_BRIGHTNESS, value.coerceIn(-50, 50)).apply()
    
    // v28.15: 弹幕显示字体阴影

var AppPrefs.v28DanmakuFontShadow: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_FONT_SHADOW, 0)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_FONT_SHADOW, value.coerceIn(0, 100)).apply()
    
    // v29.1: 视频播放列表自动排序

var AppPrefs.v29AutoSort: Boolean
        get() = prefs.getBoolean(KEY_V29_AUTO_SORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V29_AUTO_SORT, value).apply()
    
    // v29.2: 弹幕字体背景颜色

var AppPrefs.v29DanmakuBackgroundColor: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_BACKGROUND_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_BACKGROUND_COLOR, value.coerceIn(0, 5)).apply()
    
    // v29.3: 视频画面色彩色调

var AppPrefs.v29ColorHue: Int
        get() = prefs.getInt(KEY_V29_COLOR_HUE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_HUE, value.coerceIn(-50, 50)).apply()
    
    // v29.4: 弹幕发送确认对话框样式

var AppPrefs.v29SendConfirmDialogStyle: Int
        get() = prefs.getInt(KEY_V29_SEND_CONFIRM_DIALOG_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_SEND_CONFIRM_DIALOG_STYLE, value.coerceIn(0, 3)).apply()
    
    // v29.5: 播放器音量限制模式

var AppPrefs.v29VolumeLimitMode: Int
        get() = prefs.getInt(KEY_V29_VOLUME_LIMIT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_VOLUME_LIMIT_MODE, value.coerceIn(0, 3)).apply()
    
    // v29.6: 视频缓存清理阈值

var AppPrefs.v29CacheCleanupThreshold: Int
        get() = prefs.getInt(KEY_V29_CACHE_CLEANUP_THRESHOLD, 100)
        set(value) = prefs.edit().putInt(KEY_V29_CACHE_CLEANUP_THRESHOLD, value.coerceIn(50, 1000)).apply()
    
    // v29.7: 弹幕显示位置偏移

var AppPrefs.v29DanmakuPositionOffset: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_POSITION_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_POSITION_OFFSET, value.coerceIn(-50, 50)).apply()
    
    // v29.8: 视频画面色彩色温

var AppPrefs.v29ColorTemperature: Int
        get() = prefs.getInt(KEY_V29_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_TEMPERATURE, value.coerceIn(-50, 50)).apply()
    
    // v29.9: 弹幕发送历史记录导出

var AppPrefs.v29HistoryExport: Boolean
        get() = prefs.getBoolean(KEY_V29_HISTORY_EXPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V29_HISTORY_EXPORT, value).apply()
    
    // v29.10: 播放器进度条样式

var AppPrefs.v29ProgressBarStyle: Int
        get() = prefs.getInt(KEY_V29_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_PROGRESS_BAR_STYLE, value.coerceIn(0, 4)).apply()
    
    // v29.11: 视频投射画面质量

var AppPrefs.v29CastQuality: Int
        get() = prefs.getInt(KEY_V29_CAST_QUALITY, 0)
        set(value) = prefs.edit().putInt(KEY_V29_CAST_QUALITY, value.coerceIn(0, 3)).apply()
    
    // v29.12: 弹幕字体背景透明度

var AppPrefs.v29DanmakuBackgroundOpacity: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_BACKGROUND_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_BACKGROUND_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v29.13: 播放器手势长按功能

var AppPrefs.v29LongPressFunction: Int
        get() = prefs.getInt(KEY_V29_LONG_PRESS_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V29_LONG_PRESS_FUNCTION, value.coerceIn(0, 5)).apply()
    
    // v29.14: 视频画面色彩伽马

var AppPrefs.v29ColorGamma: Int
        get() = prefs.getInt(KEY_V29_COLOR_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_GAMMA, value.coerceIn(-50, 50)).apply()
    
    // v29.15: 弹幕显示字体描边

var AppPrefs.v29DanmakuFontStroke: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_FONT_STROKE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_FONT_STROKE, value.coerceIn(0, 100)).apply()
    
    // v30.1: 视频播放列表自动循环

var AppPrefs.v30AutoLoop: Boolean
        get() = prefs.getBoolean(KEY_V30_AUTO_LOOP, false)
        set(value) = prefs.edit().putBoolean(KEY_V30_AUTO_LOOP, value).apply()
    
    // v30.2: 弹幕字体背景边框

var AppPrefs.v30DanmakuBackgroundBorder: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_BACKGROUND_BORDER, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_BACKGROUND_BORDER, value.coerceIn(0, 5)).apply()
    
    // v30.3: 视频画面色彩锐化

var AppPrefs.v30ColorSharpen: Int
        get() = prefs.getInt(KEY_V30_COLOR_SHARPEN, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_SHARPEN, value.coerceIn(0, 100)).apply()
    
    // v30.4: 弹幕发送确认震动模式

var AppPrefs.v30VibrationMode: Int
        get() = prefs.getInt(KEY_V30_VIBRATION_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_VIBRATION_MODE, value.coerceIn(0, 3)).apply()
    
    // v30.5: 播放器音量限制阈值

var AppPrefs.v30VolumeLimitThreshold: Int
        get() = prefs.getInt(KEY_V30_VOLUME_LIMIT_THRESHOLD, 100)
        set(value) = prefs.edit().putInt(KEY_V30_VOLUME_LIMIT_THRESHOLD, value.coerceIn(50, 150)).apply()
    
    // v30.6: 视频缓存清理模式

var AppPrefs.v30CacheCleanupMode: Int
        get() = prefs.getInt(KEY_V30_CACHE_CLEANUP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_CACHE_CLEANUP_MODE, value.coerceIn(0, 3)).apply()
    
    // v30.7: 弹幕显示位置对齐方式

var AppPrefs.v30DanmakuPositionAlignMode: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_POSITION_ALIGN_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_POSITION_ALIGN_MODE, value.coerceIn(0, 3)).apply()
    
    // v30.8: 视频画面色彩降噪

var AppPrefs.v30ColorDenoise: Int
        get() = prefs.getInt(KEY_V30_COLOR_DENOISE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_DENOISE, value.coerceIn(0, 100)).apply()
    
    // v30.9: 弹幕发送历史记录导入

var AppPrefs.v30HistoryImport: Boolean
        get() = prefs.getBoolean(KEY_V30_HISTORY_IMPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V30_HISTORY_IMPORT, value).apply()
    
    // v30.10: 播放器进度条颜色

var AppPrefs.v30ProgressBarColor: Int
        get() = prefs.getInt(KEY_V30_PROGRESS_BAR_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V30_PROGRESS_BAR_COLOR, value.coerceIn(0, 5)).apply()
    
    // v30.11: 视频投射画面延迟

var AppPrefs.v30CastLatency: Int
        get() = prefs.getInt(KEY_V30_CAST_LATENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V30_CAST_LATENCY, value.coerceIn(0, 500)).apply()
    
    // v30.12: 弹幕字体背景阴影

var AppPrefs.v30DanmakuBackgroundShadow: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_BACKGROUND_SHADOW, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_BACKGROUND_SHADOW, value.coerceIn(0, 100)).apply()
    
    // v30.13: 播放器手势滑动功能

var AppPrefs.v30SwipeFunction: Int
        get() = prefs.getInt(KEY_V30_SWIPE_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V30_SWIPE_FUNCTION, value.coerceIn(0, 5)).apply()
    
    // v30.14: 视频画面色彩模糊

var AppPrefs.v30ColorBlur: Int
        get() = prefs.getInt(KEY_V30_COLOR_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_BLUR, value.coerceIn(0, 100)).apply()
    
    // v30.15: 弹幕显示字体发光

var AppPrefs.v30DanmakuFontGlow: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_FONT_GLOW, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_FONT_GLOW, value.coerceIn(0, 100)).apply()
    
    // v31.1: 视频播放列表自动跳过片头

var AppPrefs.v31AutoSkipIntro: Boolean
        get() = prefs.getBoolean(KEY_V31_AUTO_SKIP_INTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_AUTO_SKIP_INTRO, value).apply()
    
    // v31.2: 弹幕字体背景渐变

var AppPrefs.v31DanmakuBackgroundGradient: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT, value.coerceIn(0, 5)).apply()
    
    // v31.3: 视频画面色彩对比度曲线

var AppPrefs.v31ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V31_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_COLOR_CONTRAST_CURVE, value.coerceIn(0, 3)).apply()
    
    // v31.4: 弹幕发送确认震动间隔

var AppPrefs.v31VibrationInterval: Int
        get() = prefs.getInt(KEY_V31_VIBRATION_INTERVAL, 0)
        set(value) = prefs.edit().putInt(KEY_V31_VIBRATION_INTERVAL, value.coerceIn(0, 500)).apply()
    
    // v31.5: 播放器音量限制模式切换

var AppPrefs.v31VolumeLimitModeSwitch: Boolean
        get() = prefs.getBoolean(KEY_V31_VOLUME_LIMIT_MODE_SWITCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_VOLUME_LIMIT_MODE_SWITCH, value).apply()
    
    // v31.6: 视频缓存清理优先级

var AppPrefs.v31CacheCleanupPriority: Int
        get() = prefs.getInt(KEY_V31_CACHE_CLEANUP_PRIORITY, 0)
        set(value) = prefs.edit().putInt(KEY_V31_CACHE_CLEANUP_PRIORITY, value.coerceIn(0, 3)).apply()
    
    // v31.7: 弹幕显示位置对齐偏移

var AppPrefs.v31DanmakuPositionAlignOffset: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_POSITION_ALIGN_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_POSITION_ALIGN_OFFSET, value.coerceIn(-50, 50)).apply()
    
    // v31.8: 视频画面色彩饱和度曲线

var AppPrefs.v31ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V31_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_COLOR_SATURATION_CURVE, value.coerceIn(0, 3)).apply()
    
    // v31.9: 弹幕发送历史记录搜索

var AppPrefs.v31HistorySearch: Boolean
        get() = prefs.getBoolean(KEY_V31_HISTORY_SEARCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_HISTORY_SEARCH, value).apply()
    
    // v31.10: 播放器进度条动画

var AppPrefs.v31ProgressBarAnimation: Int
        get() = prefs.getInt(KEY_V31_PROGRESS_BAR_ANIMATION, 0)
        set(value) = prefs.edit().putInt(KEY_V31_PROGRESS_BAR_ANIMATION, value.coerceIn(0, 4)).apply()
    
    // v31.11: 视频投射画面缓冲策略

var AppPrefs.v31CastBufferStrategy: Int
        get() = prefs.getInt(KEY_V31_CAST_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V31_CAST_BUFFER_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v31.12: 弹幕字体背景渐变方向

var AppPrefs.v31DanmakuBackgroundGradientDirection: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v31.13: 播放器手势滑动阈值

var AppPrefs.v31SwipeThreshold: Int
        get() = prefs.getInt(KEY_V31_SWIPE_THRESHOLD, 50)
        set(value) = prefs.edit().putInt(KEY_V31_SWIPE_THRESHOLD, value.coerceIn(10, 100)).apply()
    
    // v31.14: 视频画面色彩亮度曲线

var AppPrefs.v31ColorBrightnessCurve: Int
        get() = prefs.getInt(KEY_V31_COLOR_BRIGHTNESS_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_COLOR_BRIGHTNESS_CURVE, value.coerceIn(0, 3)).apply()
    
    // v31.15: 弹幕显示字体发光颜色

var AppPrefs.v31DanmakuFontGlowColor: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_FONT_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_FONT_GLOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v32.1: 视频播放列表自动跳过片尾

var AppPrefs.v32AutoSkipOutro: Boolean
        get() = prefs.getBoolean(KEY_V32_AUTO_SKIP_OUTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_AUTO_SKIP_OUTRO, value).apply()
    
    // v32.2: 弹幕字体背景渐变颜色

var AppPrefs.v32DanmakuBackgroundGradientColor: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_COLOR, value.coerceIn(0, 5)).apply()
    
    // v32.3: 视频画面色彩色调曲线

var AppPrefs.v32ColorHueCurve: Int
        get() = prefs.getInt(KEY_V32_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_COLOR_HUE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.4: 弹幕发送确认震动强度曲线

var AppPrefs.v32VibrationStrengthCurve: Int
        get() = prefs.getInt(KEY_V32_VIBRATION_STRENGTH_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_VIBRATION_STRENGTH_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.5: 播放器音量限制阈值曲线

var AppPrefs.v32VolumeLimitThresholdCurve: Int
        get() = prefs.getInt(KEY_V32_VOLUME_LIMIT_THRESHOLD_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_VOLUME_LIMIT_THRESHOLD_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.6: 视频缓存清理策略曲线

var AppPrefs.v32CacheCleanupStrategyCurve: Int
        get() = prefs.getInt(KEY_V32_CACHE_CLEANUP_STRATEGY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_CACHE_CLEANUP_STRATEGY_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.7: 弹幕显示位置对齐方式曲线

var AppPrefs.v32DanmakuPositionAlignModeCurve: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_POSITION_ALIGN_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_POSITION_ALIGN_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.8: 视频画面色彩降噪曲线

var AppPrefs.v32ColorDenoiseCurve: Int
        get() = prefs.getInt(KEY_V32_COLOR_DENOISE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_COLOR_DENOISE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.9: 弹幕发送历史记录导出格式

var AppPrefs.v32HistoryExportFormat: Int
        get() = prefs.getInt(KEY_V32_HISTORY_EXPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V32_HISTORY_EXPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v32.10: 播放器进度条颜色渐变

var AppPrefs.v32ProgressBarColorGradient: Int
        get() = prefs.getInt(KEY_V32_PROGRESS_BAR_COLOR_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V32_PROGRESS_BAR_COLOR_GRADIENT, value.coerceIn(0, 5)).apply()
    
    // v32.11: 视频投射画面延迟策略

var AppPrefs.v32CastLatencyStrategy: Int
        get() = prefs.getInt(KEY_V32_CAST_LATENCY_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V32_CAST_LATENCY_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v32.12: 弹幕字体背景渐变透明度

var AppPrefs.v32DanmakuBackgroundGradientOpacity: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v32.13: 播放器手势滑动速度

var AppPrefs.v32SwipeSpeed: Int
        get() = prefs.getInt(KEY_V32_SWIPE_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V32_SWIPE_SPEED, value.coerceIn(10, 100)).apply()
    
    // v32.14: 视频画面色彩模糊曲线

var AppPrefs.v32ColorBlurCurve: Int
        get() = prefs.getInt(KEY_V32_COLOR_BLUR_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_COLOR_BLUR_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.15: 弹幕显示字体发光强度

var AppPrefs.v32DanmakuFontGlowStrength: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_FONT_GLOW_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_FONT_GLOW_STRENGTH, value.coerceIn(0, 100)).apply()
    
    // v33.1: 视频播放列表自动排序方式

var AppPrefs.v33AutoSortMode: Int
        get() = prefs.getInt(KEY_V33_AUTO_SORT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_AUTO_SORT_MODE, value.coerceIn(0, 4)).apply()
    
    // v33.2: 弹幕字体背景渐变位置

var AppPrefs.v33DanmakuBackgroundGradientPosition: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_POSITION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_POSITION, value.coerceIn(0, 3)).apply()
    
    // v33.3: 视频画面色彩锐化曲线

var AppPrefs.v33ColorSharpenCurve: Int
        get() = prefs.getInt(KEY_V33_COLOR_SHARPEN_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_COLOR_SHARPEN_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.4: 弹幕发送确认震动模式曲线

var AppPrefs.v33VibrationModeCurve: Int
        get() = prefs.getInt(KEY_V33_VIBRATION_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_VIBRATION_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.5: 播放器音量限制阈值模式

var AppPrefs.v33VolumeLimitThresholdMode: Int
        get() = prefs.getInt(KEY_V33_VOLUME_LIMIT_THRESHOLD_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_VOLUME_LIMIT_THRESHOLD_MODE, value.coerceIn(0, 3)).apply()
    
    // v33.6: 视频缓存清理模式曲线

var AppPrefs.v33CacheCleanupModeCurve: Int
        get() = prefs.getInt(KEY_V33_CACHE_CLEANUP_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_CACHE_CLEANUP_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.7: 弹幕显示位置对齐偏移曲线

var AppPrefs.v33DanmakuPositionAlignOffsetCurve: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_POSITION_ALIGN_OFFSET_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_POSITION_ALIGN_OFFSET_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.8: 视频画面色彩对比度曲线

var AppPrefs.v33ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V33_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_COLOR_CONTRAST_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.9: 弹幕发送历史记录导入格式

var AppPrefs.v33HistoryImportFormat: Int
        get() = prefs.getInt(KEY_V33_HISTORY_IMPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V33_HISTORY_IMPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v33.10: 播放器进度条颜色渐变方向

var AppPrefs.v33ProgressBarColorGradientDirection: Int
        get() = prefs.getInt(KEY_V33_PROGRESS_BAR_COLOR_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_PROGRESS_BAR_COLOR_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v33.11: 视频投射画面缓冲策略曲线

var AppPrefs.v33CastBufferStrategyCurve: Int
        get() = prefs.getInt(KEY_V33_CAST_BUFFER_STRATEGY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_CAST_BUFFER_STRATEGY_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.12: 弹幕字体背景渐变速度

var AppPrefs.v33DanmakuBackgroundGradientSpeed: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_SPEED, value.coerceIn(0, 100)).apply()
    
    // v33.13: 播放器手势滑动方向

var AppPrefs.v33SwipeDirection: Int
        get() = prefs.getInt(KEY_V33_SWIPE_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_SWIPE_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v33.14: 视频画面色彩饱和度曲线

var AppPrefs.v33ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V33_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_COLOR_SATURATION_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.15: 弹幕显示字体发光颜色

var AppPrefs.v33DanmakuFontGlowColor: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_FONT_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_FONT_GLOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v34.1: 视频播放列表自动循环模式

var AppPrefs.v34AutoLoopMode: Int
        get() = prefs.getInt(KEY_V34_AUTO_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_AUTO_LOOP_MODE, value.coerceIn(0, 3)).apply()
    
    // v34.2: 弹幕字体背景渐变类型

var AppPrefs.v34DanmakuBackgroundGradientType: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_TYPE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_TYPE, value.coerceIn(0, 4)).apply()
    
    // v34.3: 视频画面色彩色调曲线

var AppPrefs.v34ColorHueCurve: Int
        get() = prefs.getInt(KEY_V34_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_COLOR_HUE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.4: 弹幕发送确认震动强度曲线

var AppPrefs.v34VibrationStrengthCurve: Int
        get() = prefs.getInt(KEY_V34_VIBRATION_STRENGTH_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_VIBRATION_STRENGTH_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.5: 播放器音量限制阈值曲线

var AppPrefs.v34VolumeLimitThresholdCurve: Int
        get() = prefs.getInt(KEY_V34_VOLUME_LIMIT_THRESHOLD_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_VOLUME_LIMIT_THRESHOLD_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.6: 视频缓存清理策略曲线

var AppPrefs.v34CacheCleanupStrategyCurve: Int
        get() = prefs.getInt(KEY_V34_CACHE_CLEANUP_STRATEGY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_CACHE_CLEANUP_STRATEGY_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.7: 弹幕显示位置对齐方式曲线

var AppPrefs.v34DanmakuPositionAlignModeCurve: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_POSITION_ALIGN_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_POSITION_ALIGN_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.8: 视频画面色彩降噪曲线

var AppPrefs.v34ColorDenoiseCurve: Int
        get() = prefs.getInt(KEY_V34_COLOR_DENOISE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_COLOR_DENOISE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.9: 弹幕发送历史记录导出格式

var AppPrefs.v34HistoryExportFormat: Int
        get() = prefs.getInt(KEY_V34_HISTORY_EXPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V34_HISTORY_EXPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v34.10: 播放器进度条颜色渐变

var AppPrefs.v34ProgressBarColorGradient: Int
        get() = prefs.getInt(KEY_V34_PROGRESS_BAR_COLOR_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V34_PROGRESS_BAR_COLOR_GRADIENT, value.coerceIn(0, 5)).apply()
    
    // v34.11: 视频投射画面延迟策略

var AppPrefs.v34CastLatencyStrategy: Int
        get() = prefs.getInt(KEY_V34_CAST_LATENCY_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V34_CAST_LATENCY_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v34.12: 弹幕字体背景渐变透明度

var AppPrefs.v34DanmakuBackgroundGradientOpacity: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v34.13: 播放器手势滑动速度

var AppPrefs.v34SwipeSpeed: Int
        get() = prefs.getInt(KEY_V34_SWIPE_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V34_SWIPE_SPEED, value.coerceIn(10, 100)).apply()
    
    // v34.14: 视频画面色彩模糊曲线

var AppPrefs.v34ColorBlurCurve: Int
        get() = prefs.getInt(KEY_V34_COLOR_BLUR_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_COLOR_BLUR_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.15: 弹幕显示字体发光强度

var AppPrefs.v34DanmakuFontGlowStrength: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_FONT_GLOW_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_FONT_GLOW_STRENGTH, value.coerceIn(0, 100)).apply()
    
    // v35.1: 视频播放列表自动跳过片头片尾

var AppPrefs.v35AutoSkipIntroOutro: Boolean
        get() = prefs.getBoolean(KEY_V35_AUTO_SKIP_INTRO_OUTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_AUTO_SKIP_INTRO_OUTRO, value).apply()
    
    // v35.2: 弹幕字体背景渐变颜色自定义

var AppPrefs.v35DanmakuBackgroundGradientCustomColor: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM_COLOR, value.coerceIn(0, 5)).apply()
    
    // v35.3: 视频画面色彩对比度自定义

var AppPrefs.v35ColorContrastCustom: Int
        get() = prefs.getInt(KEY_V35_COLOR_CONTRAST_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_COLOR_CONTRAST_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.4: 弹幕发送确认震动自定义

var AppPrefs.v35VibrationCustom: Int
        get() = prefs.getInt(KEY_V35_VIBRATION_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_VIBRATION_CUSTOM, value.coerceIn(0, 100)).apply()
    
    // v35.5: 播放器音量限制自定义

var AppPrefs.v35VolumeLimitCustom: Int
        get() = prefs.getInt(KEY_V35_VOLUME_LIMIT_CUSTOM, 100)
        set(value) = prefs.edit().putInt(KEY_V35_VOLUME_LIMIT_CUSTOM, value.coerceIn(50, 150)).apply()
    
    // v35.6: 视频缓存清理自定义

var AppPrefs.v35CacheCleanupCustom: Int
        get() = prefs.getInt(KEY_V35_CACHE_CLEANUP_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_CACHE_CLEANUP_CUSTOM, value.coerceIn(0, 1000)).apply()
    
    // v35.7: 弹幕显示位置对齐自定义

var AppPrefs.v35DanmakuPositionAlignCustom: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_POSITION_ALIGN_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_POSITION_ALIGN_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.8: 视频画面色彩饱和度自定义

var AppPrefs.v35ColorSaturationCustom: Int
        get() = prefs.getInt(KEY_V35_COLOR_SATURATION_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_COLOR_SATURATION_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.9: 弹幕发送历史记录自定义

var AppPrefs.v35HistoryCustom: Int
        get() = prefs.getInt(KEY_V35_HISTORY_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_HISTORY_CUSTOM, value.coerceIn(0, 100)).apply()
    
    // v35.10: 播放器进度条颜色自定义

var AppPrefs.v35ProgressBarColorCustom: Int
        get() = prefs.getInt(KEY_V35_PROGRESS_BAR_COLOR_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_PROGRESS_BAR_COLOR_CUSTOM, value.coerceIn(0, 5)).apply()
    
    // v35.11: 视频投射画面缓冲自定义

var AppPrefs.v35CastBufferCustom: Int
        get() = prefs.getInt(KEY_V35_CAST_BUFFER_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_CAST_BUFFER_CUSTOM, value.coerceIn(0, 30)).apply()
    
    // v35.12: 弹幕字体背景渐变自定义

var AppPrefs.v35DanmakuBackgroundGradientCustom: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM, value.coerceIn(0, 5)).apply()
    
    // v35.13: 播放器手势滑动自定义

var AppPrefs.v35SwipeCustom: Int
        get() = prefs.getInt(KEY_V35_SWIPE_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_SWIPE_CUSTOM, value.coerceIn(0, 5)).apply()
    
    // v35.14: 视频画面色彩亮度自定义

var AppPrefs.v35ColorBrightnessCustom: Int
        get() = prefs.getInt(KEY_V35_COLOR_BRIGHTNESS_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_COLOR_BRIGHTNESS_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.15: 弹幕显示字体发光自定义

var AppPrefs.v35DanmakuFontGlowCustom: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_FONT_GLOW_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_FONT_GLOW_CUSTOM, value.coerceIn(0, 100)).apply()
    
    // v36.1: 视频播放速度记忆

var AppPrefs.v36PlaybackSpeedMemory: Boolean
        get() = prefs.getBoolean(KEY_V36_PLAYBACK_SPEED_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_PLAYBACK_SPEED_MEMORY, value).apply()
    
    // v36.2: 弹幕字体描边颜色

var AppPrefs.v36DanmakuFontStrokeColor: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_FONT_STROKE_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_FONT_STROKE_COLOR, value.coerceIn(0, 5)).apply()
    
    // v36.3: 视频画面色彩色温

var AppPrefs.v36ColorTemperature: Int
        get() = prefs.getInt(KEY_V36_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_COLOR_TEMPERATURE, value.coerceIn(-50, 50)).apply()
    
    // v36.4: 弹幕发送确认震动模式

var AppPrefs.v36VibrationPattern: Int
        get() = prefs.getInt(KEY_V36_VIBRATION_PATTERN, 0)
        set(value) = prefs.edit().putInt(KEY_V36_VIBRATION_PATTERN, value.coerceIn(0, 5)).apply()
    
    // v36.5: 播放器音量步进值

var AppPrefs.v36VolumeStep: Int
        get() = prefs.getInt(KEY_V36_VOLUME_STEP, 5)
        set(value) = prefs.edit().putInt(KEY_V36_VOLUME_STEP, value.coerceIn(1, 20)).apply()
    
    // v36.6: 视频缓存大小限制

var AppPrefs.v36CacheSizeLimit: Int
        get() = prefs.getInt(KEY_V36_CACHE_SIZE_LIMIT, 500)
        set(value) = prefs.edit().putInt(KEY_V36_CACHE_SIZE_LIMIT, value.coerceIn(100, 2000)).apply()
    
    // v36.7: 弹幕显示区域限制

var AppPrefs.v36DanmakuDisplayArea: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_DISPLAY_AREA, 100)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_DISPLAY_AREA, value.coerceIn(25, 100)).apply()
    
    // v36.8: 视频画面色彩伽马

var AppPrefs.v36ColorGamma: Int
        get() = prefs.getInt(KEY_V36_COLOR_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V36_COLOR_GAMMA, value.coerceIn(-50, 50)).apply()
    
    // v36.9: 弹幕发送历史记录搜索

var AppPrefs.v36HistorySearch: Boolean
        get() = prefs.getBoolean(KEY_V36_HISTORY_SEARCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_HISTORY_SEARCH, value).apply()
    
    // v36.10: 播放器进度条样式

var AppPrefs.v36ProgressBarStyle: Int
        get() = prefs.getInt(KEY_V36_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_PROGRESS_BAR_STYLE, value.coerceIn(0, 5)).apply()
    
    // v36.11: 视频投射画面分辨率

var AppPrefs.v36CastResolution: Int
        get() = prefs.getInt(KEY_V36_CAST_RESOLUTION, 0)
        set(value) = prefs.edit().putInt(KEY_V36_CAST_RESOLUTION, value.coerceIn(0, 5)).apply()
    
    // v36.12: 弹幕字体背景模糊

var AppPrefs.v36DanmakuBackgroundBlur: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_BACKGROUND_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_BACKGROUND_BLUR, value.coerceIn(0, 20)).apply()
    
    // v36.13: 播放器手势长按速度

var AppPrefs.v36GestureLongPressSpeed: Float
        get() = prefs.getFloat(KEY_V36_GESTURE_LONG_PRESS_SPEED, 2.0f)
        set(value) = prefs.edit().putFloat(KEY_V36_GESTURE_LONG_PRESS_SPEED, value.coerceIn(0.5f, 5.0f)).apply()
    
    // v36.14: 视频画面色彩色调偏移

var AppPrefs.v36ColorHueShift: Int
        get() = prefs.getInt(KEY_V36_COLOR_HUE_SHIFT, 0)
        set(value) = prefs.edit().putInt(KEY_V36_COLOR_HUE_SHIFT, value.coerceIn(-180, 180)).apply()
    
    // v36.15: 弹幕显示字体发光颜色

var AppPrefs.v36DanmakuFontGlowColor: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_FONT_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_FONT_GLOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v37.1: 视频播放列表随机播放

var AppPrefs.v37PlaylistShuffle: Boolean
        get() = prefs.getBoolean(KEY_V37_PLAYLIST_SHUFFLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_PLAYLIST_SHUFFLE, value).apply()
    
    // v37.2: 弹幕字体阴影颜色

var AppPrefs.v37DanmakuShadowColor: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_SHADOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_SHADOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v37.3: 视频画面色彩鲜艳度

var AppPrefs.v37ColorVividness: Int
        get() = prefs.getInt(KEY_V37_COLOR_VIVIDNESS, 0)
        set(value) = prefs.edit().putInt(KEY_V37_COLOR_VIVIDNESS, value.coerceIn(-50, 50)).apply()
    
    // v37.4: 弹幕发送确认震动衰减

var AppPrefs.v37VibrationDecay: Int
        get() = prefs.getInt(KEY_V37_VIBRATION_DECAY, 0)
        set(value) = prefs.edit().putInt(KEY_V37_VIBRATION_DECAY, value.coerceIn(0, 100)).apply()
    
    // v37.5: 播放器音量淡入淡出

var AppPrefs.v37VolumeFade: Boolean
        get() = prefs.getBoolean(KEY_V37_VOLUME_FADE, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_VOLUME_FADE, value).apply()
    
    // v37.6: 视频缓存预加载

var AppPrefs.v37CachePreload: Boolean
        get() = prefs.getBoolean(KEY_V37_CACHE_PRELOAD, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_CACHE_PRELOAD, value).apply()
    
    // v37.7: 弹幕显示滚动速度

var AppPrefs.v37DanmakuScrollSpeed: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_SCROLL_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_SCROLL_SPEED, value.coerceIn(-50, 50)).apply()
    
    // v37.8: 视频画面色彩色阶

var AppPrefs.v37ColorTonemap: Int
        get() = prefs.getInt(KEY_V37_COLOR_TONEMAP, 0)
        set(value) = prefs.edit().putInt(KEY_V37_COLOR_TONEMAP, value.coerceIn(0, 5)).apply()
    
    // v37.9: 弹幕发送历史记录导出

var AppPrefs.v37HistoryExport: Boolean
        get() = prefs.getBoolean(KEY_V37_HISTORY_EXPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_HISTORY_EXPORT, value).apply()
    
    // v37.10: 播放器进度条高度

var AppPrefs.v37ProgressBarHeight: Int
        get() = prefs.getInt(KEY_V37_PROGRESS_BAR_HEIGHT, 3)
        set(value) = prefs.edit().putInt(KEY_V37_PROGRESS_BAR_HEIGHT, value.coerceIn(1, 10)).apply()
    
    // v37.11: 视频投射画面码率

var AppPrefs.v37CastBitrate: Int
        get() = prefs.getInt(KEY_V37_CAST_BITRATE, 0)
        set(value) = prefs.edit().putInt(KEY_V37_CAST_BITRATE, value.coerceIn(0, 5)).apply()
    
    // v37.12: 弹幕字体背景边框颜色

var AppPrefs.v37DanmakuBorderColor: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_BORDER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_BORDER_COLOR, value.coerceIn(0, 5)).apply()
    
    // v37.13: 播放器手势双击功能

var AppPrefs.v37GestureDoubleTap: Int
        get() = prefs.getInt(KEY_V37_GESTURE_DOUBLE_TAP, 0)
        set(value) = prefs.edit().putInt(KEY_V37_GESTURE_DOUBLE_TAP, value.coerceIn(0, 5)).apply()
    
    // v37.14: 视频画面色彩色调饱和度

var AppPrefs.v37ColorHueSaturation: Int
        get() = prefs.getInt(KEY_V37_COLOR_HUE_SATURATION, 0)
        set(value) = prefs.edit().putInt(KEY_V37_COLOR_HUE_SATURATION, value.coerceIn(-50, 50)).apply()
    
    // v37.15: 弹幕显示字体发光强度

var AppPrefs.v37DanmakuGlowIntensity: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_GLOW_INTENSITY, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_GLOW_INTENSITY, value.coerceIn(0, 100)).apply()
    
    // v38.1: 视频播放列表循环模式

var AppPrefs.v38PlaylistLoopMode: Int
        get() = prefs.getInt(KEY_V38_PLAYLIST_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_PLAYLIST_LOOP_MODE, value.coerceIn(0, 3)).apply()
    
    // v38.2: 弹幕字体背景圆角

var AppPrefs.v38DanmakuBackgroundRadius: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_BACKGROUND_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_BACKGROUND_RADIUS, value.coerceIn(0, 20)).apply()
    
    // v38.3: 视频画面色彩对比度曲线

var AppPrefs.v38ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V38_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_COLOR_CONTRAST_CURVE, value.coerceIn(0, 5)).apply()
    
    // v38.4: 弹幕发送确认震动频率

var AppPrefs.v38VibrationFrequency: Int
        get() = prefs.getInt(KEY_V38_VIBRATION_FREQUENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V38_VIBRATION_FREQUENCY, value.coerceIn(0, 100)).apply()
    
    // v38.5: 播放器音量限制模式

var AppPrefs.v38VolumeLimitMode: Int
        get() = prefs.getInt(KEY_V38_VOLUME_LIMIT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_VOLUME_LIMIT_MODE, value.coerceIn(0, 3)).apply()
    
    // v38.6: 视频缓存清理策略

var AppPrefs.v38CacheCleanupStrategy: Int
        get() = prefs.getInt(KEY_V38_CACHE_CLEANUP_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V38_CACHE_CLEANUP_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v38.7: 弹幕显示位置偏移X

var AppPrefs.v38DanmakuOffsetX: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_OFFSET_X, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_OFFSET_X, value.coerceIn(-100, 100)).apply()
    
    // v38.8: 视频画面色彩亮度曲线

var AppPrefs.v38ColorBrightnessCurve: Int
        get() = prefs.getInt(KEY_V38_COLOR_BRIGHTNESS_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_COLOR_BRIGHTNESS_CURVE, value.coerceIn(0, 5)).apply()
    
    // v38.9: 弹幕发送历史记录搜索模式

var AppPrefs.v38HistorySearchMode: Int
        get() = prefs.getInt(KEY_V38_HISTORY_SEARCH_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_HISTORY_SEARCH_MODE, value.coerceIn(0, 3)).apply()
    
    // v38.10: 播放器进度条动画

var AppPrefs.v38ProgressBarAnimation: Boolean
        get() = prefs.getBoolean(KEY_V38_PROGRESS_BAR_ANIMATION, true)
        set(value) = prefs.edit().putBoolean(KEY_V38_PROGRESS_BAR_ANIMATION, value).apply()
    
    // v38.11: 视频投射画面延迟

var AppPrefs.v38CastLatency: Int
        get() = prefs.getInt(KEY_V38_CAST_LATENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V38_CAST_LATENCY, value.coerceIn(0, 5000)).apply()
    
    // v38.12: 弹幕字体背景渐变方向

var AppPrefs.v38DanmakuGradientDirection: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v38.13: 播放器手势滑动灵敏度

var AppPrefs.v38GestureSwipeSensitivity: Int
        get() = prefs.getInt(KEY_V38_GESTURE_SWIPE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_V38_GESTURE_SWIPE_SENSITIVITY, value.coerceIn(10, 100)).apply()
    
    // v38.14: 视频画面色彩饱和度曲线

var AppPrefs.v38ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V38_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_COLOR_SATURATION_CURVE, value.coerceIn(0, 5)).apply()
    
    // v38.15: 弹幕显示字体描边宽度

var AppPrefs.v38DanmakuFontStrokeWidth: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_FONT_STROKE_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_FONT_STROKE_WIDTH, value.coerceIn(0, 10)).apply()
    
    // v39.1: 视频播放列表自动跳过

var AppPrefs.v39PlaylistAutoSkip: Boolean
        get() = prefs.getBoolean(KEY_V39_PLAYLIST_AUTO_SKIP, false)
        set(value) = prefs.edit().putBoolean(KEY_V39_PLAYLIST_AUTO_SKIP, value).apply()
    
    // v39.2: 弹幕字体背景透明度曲线

var AppPrefs.v39DanmakuBackgroundAlphaCurve: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_BACKGROUND_ALPHA_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_BACKGROUND_ALPHA_CURVE, value.coerceIn(0, 5)).apply()
    
    // v39.3: 视频画面色彩锐化强度

var AppPrefs.v39ColorSharpen: Int
        get() = prefs.getInt(KEY_V39_COLOR_SHARPEN, 0)
        set(value) = prefs.edit().putInt(KEY_V39_COLOR_SHARPEN, value.coerceIn(0, 100)).apply()
    
    // v39.4: 弹幕发送确认震动模式曲线

var AppPrefs.v39VibrationPatternCurve: Int
        get() = prefs.getInt(KEY_V39_VIBRATION_PATTERN_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_VIBRATION_PATTERN_CURVE, value.coerceIn(0, 5)).apply()
    
    // v39.5: 播放器音量平衡

var AppPrefs.v39VolumeBalance: Int
        get() = prefs.getInt(KEY_V39_VOLUME_BALANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_VOLUME_BALANCE, value.coerceIn(-100, 100)).apply()
    
    // v39.6: 视频缓存预加载大小

var AppPrefs.v39CachePreloadSize: Int
        get() = prefs.getInt(KEY_V39_CACHE_PRELOAD_SIZE, 50)
        set(value) = prefs.edit().putInt(KEY_V39_CACHE_PRELOAD_SIZE, value.coerceIn(10, 500)).apply()
    
    // v39.7: 弹幕显示位置偏移Y

var AppPrefs.v39DanmakuOffsetY: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_OFFSET_Y, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_OFFSET_Y, value.coerceIn(-100, 100)).apply()
    
    // v39.8: 视频画面色彩降噪强度

var AppPrefs.v39ColorDenoise: Int
        get() = prefs.getInt(KEY_V39_COLOR_DENOISE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_COLOR_DENOISE, value.coerceIn(0, 100)).apply()
    
    // v39.9: 弹幕发送历史记录自动清理

var AppPrefs.v39HistoryAutoCleanup: Boolean
        get() = prefs.getBoolean(KEY_V39_HISTORY_AUTO_CLEANUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V39_HISTORY_AUTO_CLEANUP, value).apply()
    
    // v39.10: 播放器进度条颜色渐变

var AppPrefs.v39ProgressBarGradient: Boolean
        get() = prefs.getBoolean(KEY_V39_PROGRESS_BAR_GRADIENT, false)
        set(value) = prefs.edit().putBoolean(KEY_V39_PROGRESS_BAR_GRADIENT, value).apply()
    
    // v39.11: 视频投射画面缓冲策略

var AppPrefs.v39CastBufferStrategy: Int
        get() = prefs.getInt(KEY_V39_CAST_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V39_CAST_BUFFER_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v39.12: 弹幕字体背景渐变速度

var AppPrefs.v39DanmakuGradientSpeed: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_GRADIENT_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_GRADIENT_SPEED, value.coerceIn(0, 100)).apply()
    
    // v39.13: 播放器手势长按功能

var AppPrefs.v39GestureLongPress: Int
        get() = prefs.getInt(KEY_V39_GESTURE_LONG_PRESS, 0)
        set(value) = prefs.edit().putInt(KEY_V39_GESTURE_LONG_PRESS, value.coerceIn(0, 5)).apply()
    
    // v39.14: 视频画面色彩模糊强度

var AppPrefs.v39ColorBlur: Int
        get() = prefs.getInt(KEY_V39_COLOR_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V39_COLOR_BLUR, value.coerceIn(0, 20)).apply()
    
    // v39.15: 弹幕显示字体发光模式

var AppPrefs.v39DanmakuGlowMode: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_GLOW_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_GLOW_MODE, value.coerceIn(0, 3)).apply()
    
    // v40.1: 视频播放列表智能排序

var AppPrefs.v40PlaylistSmartSort: Boolean
        get() = prefs.getBoolean(KEY_V40_PLAYLIST_SMART_SORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V40_PLAYLIST_SMART_SORT, value).apply()
    
    // v40.2: 弹幕字体背景渐变颜色

var AppPrefs.v40DanmakuGradientColor: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_GRADIENT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_GRADIENT_COLOR, value.coerceIn(0, 5)).apply()
    
    // v40.3: 视频画面色彩色调曲线

var AppPrefs.v40ColorHueCurve: Int
        get() = prefs.getInt(KEY_V40_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_COLOR_HUE_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.4: 弹幕发送确认震动强度曲线

var AppPrefs.v40VibrationIntensityCurve: Int
        get() = prefs.getInt(KEY_V40_VIBRATION_INTENSITY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_VIBRATION_INTENSITY_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.5: 播放器音量限制阈值曲线

var AppPrefs.v40VolumeLimitCurve: Int
        get() = prefs.getInt(KEY_V40_VOLUME_LIMIT_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_VOLUME_LIMIT_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.6: 视频缓存清理策略曲线

var AppPrefs.v40CacheCleanupCurve: Int
        get() = prefs.getInt(KEY_V40_CACHE_CLEANUP_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_CACHE_CLEANUP_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.7: 弹幕显示位置对齐方式曲线

var AppPrefs.v40DanmakuAlignCurve: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_ALIGN_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_ALIGN_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.8: 视频画面色彩降噪曲线

var AppPrefs.v40ColorDenoiseCurve: Int
        get() = prefs.getInt(KEY_V40_COLOR_DENOISE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_COLOR_DENOISE_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.9: 弹幕发送历史记录导出格式

var AppPrefs.v40HistoryExportFormat: Int
        get() = prefs.getInt(KEY_V40_HISTORY_EXPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V40_HISTORY_EXPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v40.10: 播放器进度条颜色渐变方向

var AppPrefs.v40ProgressBarGradientDirection: Int
        get() = prefs.getInt(KEY_V40_PROGRESS_BAR_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V40_PROGRESS_BAR_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v40.11: 视频投射画面延迟策略

var AppPrefs.v40CastLatencyStrategy: Int
        get() = prefs.getInt(KEY_V40_CAST_LATENCY_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V40_CAST_LATENCY_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v40.12: 弹幕字体背景渐变透明度

var AppPrefs.v40DanmakuGradientAlpha: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_GRADIENT_ALPHA, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_GRADIENT_ALPHA, value.coerceIn(0, 100)).apply()
    
    // v40.13: 播放器手势滑动速度

var AppPrefs.v40GestureSwipeSpeed: Int
        get() = prefs.getInt(KEY_V40_GESTURE_SWIPE_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V40_GESTURE_SWIPE_SPEED, value.coerceIn(10, 100)).apply()
    
    // v40.14: 视频画面色彩模糊曲线

var AppPrefs.v40ColorBlurCurve: Int
        get() = prefs.getInt(KEY_V40_COLOR_BLUR_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_COLOR_BLUR_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.15: 弹幕显示字体发光强度

var AppPrefs.v40DanmakuGlowIntensity: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_GLOW_INTENSITY, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_GLOW_INTENSITY, value.coerceIn(0, 100)).apply()

    // ===== v41.x 系列 =====
    // v41.1: 视频播放速度记忆

var AppPrefs.v41PlaybackSpeedMemory: Boolean
        get() = prefs.getBoolean(KEY_V41_PLAYBACK_SPEED_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_PLAYBACK_SPEED_MEMORY, value).apply()
    // v41.2: 弹幕发送确认震动模式

var AppPrefs.v41DanmakuVibrationMode: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_VIBRATION_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_VIBRATION_MODE, value.coerceIn(0, 3)).apply()
    // v41.3: 视频画面色彩自动调节

var AppPrefs.v41ColorAutoAdjust: Boolean
        get() = prefs.getBoolean(KEY_V41_COLOR_AUTO_ADJUST, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_COLOR_AUTO_ADJUST, value).apply()
    // v41.4: 播放器音量增强模式

var AppPrefs.v41VolumeBoostMode: Int
        get() = prefs.getInt(KEY_V41_VOLUME_BOOST_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V41_VOLUME_BOOST_MODE, value.coerceIn(0, 3)).apply()
    // v41.5: 弹幕字体描边样式

var AppPrefs.v41DanmakuStrokeStyle: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_STROKE_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_STROKE_STYLE, value.coerceIn(0, 3)).apply()
    // v41.6: 视频投射画面色彩校正

var AppPrefs.v41CastColorCorrection: Int
        get() = prefs.getInt(KEY_V41_CAST_COLOR_CORRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V41_CAST_COLOR_CORRECTION, value.coerceIn(0, 5)).apply()
    // v41.7: 播放器手势自定义映射

var AppPrefs.v41GestureCustomMapping: Int
        get() = prefs.getInt(KEY_V41_GESTURE_CUSTOM_MAPPING, 0)
        set(value) = prefs.edit().putInt(KEY_V41_GESTURE_CUSTOM_MAPPING, value.coerceIn(0, 5)).apply()
    // v41.8: 弹幕显示密度限制

var AppPrefs.v41DanmakuDensityLimit: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_DENSITY_LIMIT, 100)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_DENSITY_LIMIT, value.coerceIn(10, 100)).apply()
    // v41.9: 视频缓存智能清理

var AppPrefs.v41CacheSmartCleanup: Boolean
        get() = prefs.getBoolean(KEY_V41_CACHE_SMART_CLEANUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_CACHE_SMART_CLEANUP, value).apply()
    // v41.10: 播放器进度条缓冲显示

var AppPrefs.v41ProgressBarBuffer: Boolean
        get() = prefs.getBoolean(KEY_V41_PROGRESS_BAR_BUFFER, true)
        set(value) = prefs.edit().putBoolean(KEY_V41_PROGRESS_BAR_BUFFER, value).apply()
    // v41.11: 弹幕发送确认震动反馈

var AppPrefs.v41DanmakuVibrationFeedback: Boolean
        get() = prefs.getBoolean(KEY_V41_DANMAKU_VIBRATION_FEEDBACK, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_DANMAKU_VIBRATION_FEEDBACK, value).apply()
    // v41.12: 视频画面色彩HDR模拟

var AppPrefs.v41ColorHdrSimulation: Int
        get() = prefs.getInt(KEY_V41_COLOR_HDR_SIMULATION, 0)
        set(value) = prefs.edit().putInt(KEY_V41_COLOR_HDR_SIMULATION, value.coerceIn(0, 3)).apply()
    // v41.13: 播放器音量限制模式增强

var AppPrefs.v41VolumeLimitEnhanced: Int
        get() = prefs.getInt(KEY_V41_VOLUME_LIMIT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V41_VOLUME_LIMIT_ENHANCED, value.coerceIn(0, 3)).apply()
    // v41.14: 弹幕字体背景圆角增强

var AppPrefs.v41DanmakuBgRadius: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_BG_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_BG_RADIUS, value.coerceIn(0, 20)).apply()
    // v41.15: 视频投射音频编码格式

var AppPrefs.v41CastAudioCodec: Int
        get() = prefs.getInt(KEY_V41_CAST_AUDIO_CODEC, 0)
        set(value) = prefs.edit().putInt(KEY_V41_CAST_AUDIO_CODEC, value.coerceIn(0, 3)).apply()

    // ===== v42.x 系列 =====
    // v42.1: 弹幕显示字体描边颜色

var AppPrefs.v42DanmakuStrokeColor: Int
        get() = prefs.getInt(KEY_V42_DANMAKU_STROKE_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V42_DANMAKU_STROKE_COLOR, value.coerceIn(0, 10)).apply()
    // v42.2: 视频画面色彩对比度自动

var AppPrefs.v42ColorAutoContrast: Boolean
        get() = prefs.getBoolean(KEY_V42_COLOR_AUTO_CONTRAST, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_COLOR_AUTO_CONTRAST, value).apply()
    // v42.3: 播放器手势震动反馈

var AppPrefs.v42GestureVibration: Boolean
        get() = prefs.getBoolean(KEY_V42_GESTURE_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_GESTURE_VIBRATION, value).apply()
    // v42.4: 弹幕发送历史记录统计

var AppPrefs.v42DanmakuHistoryStats: Boolean
        get() = prefs.getBoolean(KEY_V42_DANMAKU_HISTORY_STATS, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_DANMAKU_HISTORY_STATS, value).apply()
    // v42.5: 视频缓存大小自动调整

var AppPrefs.v42CacheAutoSize: Boolean
        get() = prefs.getBoolean(KEY_V42_CACHE_AUTO_SIZE, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_CACHE_AUTO_SIZE, value).apply()
    // v42.6: 播放器进度条颜色自定义

var AppPrefs.v42ProgressBarColor: Int
        get() = prefs.getInt(KEY_V42_PROGRESS_BAR_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V42_PROGRESS_BAR_COLOR, value.coerceIn(0, 10)).apply()
    // v42.7: 弹幕字体背景渐变增强

var AppPrefs.v42DanmakuGradientEnhanced: Int
        get() = prefs.getInt(KEY_V42_DANMAKU_GRADIENT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V42_DANMAKU_GRADIENT_ENHANCED, value.coerceIn(0, 5)).apply()
    // v42.8: 视频投射画面色彩增强

var AppPrefs.v42CastColorEnhance: Int
        get() = prefs.getInt(KEY_V42_CAST_COLOR_ENHANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V42_CAST_COLOR_ENHANCE, value.coerceIn(0, 5)).apply()
    // v42.9: 播放器音量步进值自定义

var AppPrefs.v42VolumeStepCustom: Int
        get() = prefs.getInt(KEY_V42_VOLUME_STEP_CUSTOM, 5)
        set(value) = prefs.edit().putInt(KEY_V42_VOLUME_STEP_CUSTOM, value.coerceIn(1, 20)).apply()
    // v42.10: 弹幕显示位置智能调整

var AppPrefs.v42DanmakuSmartPosition: Boolean
        get() = prefs.getBoolean(KEY_V42_DANMAKU_SMART_POSITION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_DANMAKU_SMART_POSITION, value).apply()
    // v42.11: 视频画面色彩饱和度自动

var AppPrefs.v42ColorAutoSaturation: Boolean
        get() = prefs.getBoolean(KEY_V42_COLOR_AUTO_SATURATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_COLOR_AUTO_SATURATION, value).apply()
    // v42.12: 播放器手势长按震动

var AppPrefs.v42GestureLongPressVibration: Boolean
        get() = prefs.getBoolean(KEY_V42_GESTURE_LONG_PRESS_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_GESTURE_LONG_PRESS_VIBRATION, value).apply()
    // v42.13: 弹幕发送确认震动持续时间

var AppPrefs.v42DanmakuVibrationDuration: Int
        get() = prefs.getInt(KEY_V42_DANMAKU_VIBRATION_DURATION, 100)
        set(value) = prefs.edit().putInt(KEY_V42_DANMAKU_VIBRATION_DURATION, value.coerceIn(50, 500)).apply()
    // v42.14: 视频缓存预加载策略

var AppPrefs.v42CachePreloadStrategy: Int
        get() = prefs.getInt(KEY_V42_CACHE_PRELOAD_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V42_CACHE_PRELOAD_STRATEGY, value.coerceIn(0, 3)).apply()
    // v42.15: 播放器进度条缓冲颜色

var AppPrefs.v42ProgressBarBufferColor: Int
        get() = prefs.getInt(KEY_V42_PROGRESS_BAR_BUFFER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V42_PROGRESS_BAR_BUFFER_COLOR, value.coerceIn(0, 10)).apply()

    // ===== v43.x 系列 =====
    // v43.1: 视频画面色彩色调自动

var AppPrefs.v43ColorAutoHue: Boolean
        get() = prefs.getBoolean(KEY_V43_COLOR_AUTO_HUE, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_COLOR_AUTO_HUE, value).apply()
    // v43.2: 弹幕字体背景透明度

var AppPrefs.v43DanmakuBgAlpha: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_BG_ALPHA, 100)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_BG_ALPHA, value.coerceIn(0, 100)).apply()
    // v43.3: 播放器手势双击震动

var AppPrefs.v43GestureDoubleTapVibration: Boolean
        get() = prefs.getBoolean(KEY_V43_GESTURE_DOUBLE_TAP_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_GESTURE_DOUBLE_TAP_VIBRATION, value).apply()
    // v43.4: 弹幕发送历史记录备份

var AppPrefs.v43DanmakuHistoryBackup: Boolean
        get() = prefs.getBoolean(KEY_V43_DANMAKU_HISTORY_BACKUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_DANMAKU_HISTORY_BACKUP, value).apply()
    // v43.5: 视频缓存清理策略增强

var AppPrefs.v43CacheCleanupEnhanced: Int
        get() = prefs.getInt(KEY_V43_CACHE_CLEANUP_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_CACHE_CLEANUP_ENHANCED, value.coerceIn(0, 3)).apply()
    // v43.6: 播放器进度条渐变增强

var AppPrefs.v43ProgressBarGradientEnhanced: Int
        get() = prefs.getInt(KEY_V43_PROGRESS_BAR_GRADIENT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_PROGRESS_BAR_GRADIENT_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.7: 弹幕字体阴影增强

var AppPrefs.v43DanmakuShadowEnhanced: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_SHADOW_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_SHADOW_ENHANCED, value.coerceIn(0, 10)).apply()
    // v43.8: 视频投射画面分辨率增强

var AppPrefs.v43CastResolutionEnhanced: Int
        get() = prefs.getInt(KEY_V43_CAST_RESOLUTION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_CAST_RESOLUTION_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.9: 播放器音量限制曲线增强

var AppPrefs.v43VolumeLimitCurveEnhanced: Int
        get() = prefs.getInt(KEY_V43_VOLUME_LIMIT_CURVE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_VOLUME_LIMIT_CURVE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.10: 弹幕显示字体发光增强

var AppPrefs.v43DanmakuGlowEnhanced: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_GLOW_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_GLOW_ENHANCED, value.coerceIn(0, 100)).apply()
    // v43.11: 视频画面色彩亮度自动

var AppPrefs.v43ColorAutoBrightness: Boolean
        get() = prefs.getBoolean(KEY_V43_COLOR_AUTO_BRIGHTNESS, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_COLOR_AUTO_BRIGHTNESS, value).apply()
    // v43.12: 播放器手势滑动震动

var AppPrefs.v43GestureSwipeVibration: Boolean
        get() = prefs.getBoolean(KEY_V43_GESTURE_SWIPE_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_GESTURE_SWIPE_VIBRATION, value).apply()
    // v43.13: 弹幕发送确认震动模式增强

var AppPrefs.v43DanmakuVibrationModeEnhanced: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_VIBRATION_MODE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_VIBRATION_MODE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.14: 视频缓存预加载大小增强

var AppPrefs.v43CachePreloadSizeEnhanced: Int
        get() = prefs.getInt(KEY_V43_CACHE_PRELOAD_SIZE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_CACHE_PRELOAD_SIZE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.15: 播放器进度条动画增强

var AppPrefs.v43ProgressBarAnimationEnhanced: Int
        get() = prefs.getInt(KEY_V43_PROGRESS_BAR_ANIMATION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_PROGRESS_BAR_ANIMATION_ENHANCED, value.coerceIn(0, 3)).apply()

    // ===== v44.x 系列 =====
    // v44.1: 视频画面色彩降噪增强

var AppPrefs.v44ColorDenoiseEnhanced: Int
        get() = prefs.getInt(KEY_V44_COLOR_DENOISE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_COLOR_DENOISE_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.2: 弹幕字体描边宽度增强

var AppPrefs.v44DanmakuStrokeWidthEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_STROKE_WIDTH_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_STROKE_WIDTH_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.3: 播放器手势长按速度增强

var AppPrefs.v44GestureLongPressSpeedEnhanced: Int
        get() = prefs.getInt(KEY_V44_GESTURE_LONG_PRESS_SPEED_ENHANCED, 500)
        set(value) = prefs.edit().putInt(KEY_V44_GESTURE_LONG_PRESS_SPEED_ENHANCED, value.coerceIn(200, 2000)).apply()
    // v44.4: 弹幕发送历史记录搜索增强

var AppPrefs.v44DanmakuHistorySearchEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V44_DANMAKU_HISTORY_SEARCH_ENHANCED, false)
        set(value) = prefs.edit().putBoolean(KEY_V44_DANMAKU_HISTORY_SEARCH_ENHANCED, value).apply()
    // v44.5: 视频投射画面码率增强

var AppPrefs.v44CastBitrateEnhanced: Int
        get() = prefs.getInt(KEY_V44_CAST_BITRATE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_CAST_BITRATE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.6: 播放器进度条高度增强

var AppPrefs.v44ProgressBarHeightEnhanced: Int
        get() = prefs.getInt(KEY_V44_PROGRESS_BAR_HEIGHT_ENHANCED, 4)
        set(value) = prefs.edit().putInt(KEY_V44_PROGRESS_BAR_HEIGHT_ENHANCED, value.coerceIn(2, 20)).apply()
    // v44.7: 弹幕字体背景边框增强

var AppPrefs.v44DanmakuBorderEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_BORDER_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_BORDER_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.8: 视频画面色彩模糊增强

var AppPrefs.v44ColorBlurEnhanced: Int
        get() = prefs.getInt(KEY_V44_COLOR_BLUR_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_COLOR_BLUR_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.9: 播放器音量淡入淡出增强

var AppPrefs.v44VolumeFadeEnhanced: Int
        get() = prefs.getInt(KEY_V44_VOLUME_FADE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_VOLUME_FADE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.10: 弹幕显示滚动速度增强

var AppPrefs.v44DanmakuScrollSpeedEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_SCROLL_SPEED_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_SCROLL_SPEED_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.11: 视频投射画面延迟增强

var AppPrefs.v44CastLatencyEnhanced: Int
        get() = prefs.getInt(KEY_V44_CAST_LATENCY_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_CAST_LATENCY_ENHANCED, value.coerceIn(0, 3)).apply()
    // v44.12: 播放器手势滑动灵敏度增强

var AppPrefs.v44GestureSwipeSensitivityEnhanced: Int
        get() = prefs.getInt(KEY_V44_GESTURE_SWIPE_SENSITIVITY_ENHANCED, 50)
        set(value) = prefs.edit().putInt(KEY_V44_GESTURE_SWIPE_SENSITIVITY_ENHANCED, value.coerceIn(10, 100)).apply()
    // v44.13: 弹幕发送确认震动频率增强

var AppPrefs.v44DanmakuVibrationFrequencyEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_VIBRATION_FREQUENCY_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_VIBRATION_FREQUENCY_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.14: 视频缓存清理策略曲线增强

var AppPrefs.v44CacheCleanupCurveEnhanced: Int
        get() = prefs.getInt(KEY_V44_CACHE_CLEANUP_CURVE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_CACHE_CLEANUP_CURVE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.15: 播放器进度条颜色渐变方向增强

var AppPrefs.v44ProgressBarGradientDirectionEnhanced: Int
        get() = prefs.getInt(KEY_V44_PROGRESS_BAR_GRADIENT_DIRECTION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_PROGRESS_BAR_GRADIENT_DIRECTION_ENHANCED, value.coerceIn(0, 5)).apply()

    // ===== v45.x 系列 =====
    // v45.1: 视频画面色彩锐化增强

var AppPrefs.v45ColorSharpenEnhanced: Int
        get() = prefs.getInt(KEY_V45_COLOR_SHARPEN_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_COLOR_SHARPEN_ENHANCED, value.coerceIn(0, 10)).apply()
    // v45.2: 弹幕字体背景圆角增强

var AppPrefs.v45DanmakuBgRadiusEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_BG_RADIUS_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_BG_RADIUS_ENHANCED, value.coerceIn(0, 30)).apply()
    // v45.3: 播放器手势双击功能增强

var AppPrefs.v45GestureDoubleTapEnhanced: Int
        get() = prefs.getInt(KEY_V45_GESTURE_DOUBLE_TAP_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_GESTURE_DOUBLE_TAP_ENHANCED, value.coerceIn(0, 5)).apply()
    // v45.4: 弹幕发送历史记录导出增强

var AppPrefs.v45DanmakuHistoryExportEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_HISTORY_EXPORT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_HISTORY_EXPORT_ENHANCED, value.coerceIn(0, 3)).apply()
    // v45.5: 视频投射画面缓冲策略增强

var AppPrefs.v45CastBufferEnhanced: Int
        get() = prefs.getInt(KEY_V45_CAST_BUFFER_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_CAST_BUFFER_ENHANCED, value.coerceIn(0, 3)).apply()
    // v45.6: 播放器进度条样式增强

var AppPrefs.v45ProgressBarStyleEnhanced: Int
        get() = prefs.getInt(KEY_V45_PROGRESS_BAR_STYLE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_PROGRESS_BAR_STYLE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v45.7: 弹幕字体背景渐变速度增强

var AppPrefs.v45DanmakuGradientSpeedEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_GRADIENT_SPEED_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_GRADIENT_SPEED_ENHANCED, value.coerceIn(0, 10)).apply()
    // v45.8: 视频画面色彩鲜艳度增强

var AppPrefs.v45ColorVividnessEnhanced: Int
        get() = prefs.getInt(KEY_V45_COLOR_VIVIDNESS_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_COLOR_VIVIDNESS_ENHANCED, value.coerceIn(0, 10)).apply()
    // v45.9: 播放器音量平衡增强

var AppPrefs.v45VolumeBalanceEnhanced: Int
        get() = prefs.getInt(KEY_V45_VOLUME_BALANCE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_VOLUME_BALANCE_ENHANCED, value.coerceIn(-50, 50)).apply()
    // v45.10: 弹幕显示位置偏移增强

var AppPrefs.v45DanmakuOffsetEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_OFFSET_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_OFFSET_ENHANCED, value.coerceIn(-100, 100)).apply()
    // v45.11: 视频投射音频编码增强

var AppPrefs.v45CastAudioEnhanced: Int
        get() = prefs.getInt(KEY_V45_CAST_AUDIO_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_CAST_AUDIO_ENHANCED, value.coerceIn(0, 3)).apply()
    // v45.12: 播放器手势震动模式增强

var AppPrefs.v45GestureVibrationEnhanced: Int
        get() = prefs.getInt(KEY_V45_GESTURE_VIBRATION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_GESTURE_VIBRATION_ENHANCED, value.coerceIn(0, 5)).apply()
    // v45.13: 弹幕发送确认震动强度增强

var AppPrefs.v45DanmakuVibrationIntensityEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_VIBRATION_INTENSITY_ENHANCED, 50)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_VIBRATION_INTENSITY_ENHANCED, value.coerceIn(0, 100)).apply()
    // v45.14: 视频缓存智能清理增强

var AppPrefs.v45CacheSmartCleanupEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V45_CACHE_SMART_CLEANUP_ENHANCED, false)
        set(value) = prefs.edit().putBoolean(KEY_V45_CACHE_SMART_CLEANUP_ENHANCED, value).apply()
    // v45.15: 播放器进度条缓冲显示增强

var AppPrefs.v45ProgressBarBufferEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V45_PROGRESS_BAR_BUFFER_ENHANCED, true)
        set(value) = prefs.edit().putBoolean(KEY_V45_PROGRESS_BAR_BUFFER_ENHANCED, value).apply()

    // ===== v46.x =====

var AppPrefs.v46PlaybackLoopMemory: Boolean
        get() = prefs.getBoolean(KEY_V46_PLAYBACK_LOOP_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_PLAYBACK_LOOP_MEMORY, value).apply()

var AppPrefs.v46DanmakuFontWeight: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_FONT_WEIGHT, 400)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_FONT_WEIGHT, value.coerceIn(100, 900)).apply()

var AppPrefs.v46ColorAutoGamma: Boolean
        get() = prefs.getBoolean(KEY_V46_COLOR_AUTO_GAMMA, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_COLOR_AUTO_GAMMA, value).apply()

var AppPrefs.v46VolumeNormalization: Boolean
        get() = prefs.getBoolean(KEY_V46_VOLUME_NORMALIZATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_VOLUME_NORMALIZATION, value).apply()

var AppPrefs.v46DanmakuStrokeOffset: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_STROKE_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_STROKE_OFFSET, value.coerceIn(-5, 5)).apply()

var AppPrefs.v46CastColorTemperature: Int
        get() = prefs.getInt(KEY_V46_CAST_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V46_CAST_COLOR_TEMPERATURE, value.coerceIn(-100, 100)).apply()

var AppPrefs.v46GestureEdgeExclusion: Int
        get() = prefs.getInt(KEY_V46_GESTURE_EDGE_EXCLUSION, 0)
        set(value) = prefs.edit().putInt(KEY_V46_GESTURE_EDGE_EXCLUSION, value.coerceIn(0, 50)).apply()

var AppPrefs.v46DanmakuRowSpacing: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_ROW_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_ROW_SPACING, value.coerceIn(0, 20)).apply()

var AppPrefs.v46CachePrefetchOnWifi: Boolean
        get() = prefs.getBoolean(KEY_V46_CACHE_PREFETCH_ON_WIFI, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_CACHE_PREFETCH_ON_WIFI, value).apply()

var AppPrefs.v46ProgressBarThumbSize: Int
        get() = prefs.getInt(KEY_V46_PROGRESS_BAR_THUMB_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V46_PROGRESS_BAR_THUMB_SIZE, value.coerceIn(0, 20)).apply()

var AppPrefs.v46DanmakuSendConfirmDialog: Boolean
        get() = prefs.getBoolean(KEY_V46_DANMAKU_SEND_CONFIRM_DIALOG, true)
        set(value) = prefs.edit().putBoolean(KEY_V46_DANMAKU_SEND_CONFIRM_DIALOG, value).apply()

var AppPrefs.v46ColorWhiteBalance: Int
        get() = prefs.getInt(KEY_V46_COLOR_WHITE_BALANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V46_COLOR_WHITE_BALANCE, value.coerceIn(-100, 100)).apply()

var AppPrefs.v46VolumeLimitThreshold: Int
        get() = prefs.getInt(KEY_V46_VOLUME_LIMIT_THRESHOLD, 100)
        set(value) = prefs.edit().putInt(KEY_V46_VOLUME_LIMIT_THRESHOLD, value.coerceIn(50, 150)).apply()

var AppPrefs.v46DanmakuBgPadding: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_BG_PADDING, 0)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_BG_PADDING, value.coerceIn(0, 20)).apply()

var AppPrefs.v46CastVideoCodec: Int
        get() = prefs.getInt(KEY_V46_CAST_VIDEO_CODEC, 0)
        set(value) = prefs.edit().putInt(KEY_V46_CAST_VIDEO_CODEC, value.coerceIn(0, 3)).apply()

    // ===== v47.x =====

var AppPrefs.v47PlaybackResumePrompt: Boolean
        get() = prefs.getBoolean(KEY_V47_PLAYBACK_RESUME_PROMPT, true)
        set(value) = prefs.edit().putBoolean(KEY_V47_PLAYBACK_RESUME_PROMPT, value).apply()

var AppPrefs.v47DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_FONT_SPACING, value.coerceIn(0, 10)).apply()

var AppPrefs.v47ColorExposureCompensation: Int
        get() = prefs.getInt(KEY_V47_COLOR_EXPOSURE_COMPENSATION, 0)
        set(value) = prefs.edit().putInt(KEY_V47_COLOR_EXPOSURE_COMPENSATION, value.coerceIn(-100, 100)).apply()

var AppPrefs.v47VolumeLoudnessEnhancer: Int
        get() = prefs.getInt(KEY_V47_VOLUME_LOUDNESS_ENHANCER, 0)
        set(value) = prefs.edit().putInt(KEY_V47_VOLUME_LOUDNESS_ENHANCER, value.coerceIn(0, 100)).apply()

var AppPrefs.v47DanmakuStrokeBlur: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_STROKE_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_STROKE_BLUR, value.coerceIn(0, 10)).apply()

var AppPrefs.v47CastAudioBitrate: Int
        get() = prefs.getInt(KEY_V47_CAST_AUDIO_BITRATE, 0)
        set(value) = prefs.edit().putInt(KEY_V47_CAST_AUDIO_BITRATE, value.coerceIn(0, 5)).apply()

var AppPrefs.v47GestureDeadZone: Int
        get() = prefs.getInt(KEY_V47_GESTURE_DEAD_ZONE, 0)
        set(value) = prefs.edit().putInt(KEY_V47_GESTURE_DEAD_ZONE, value.coerceIn(0, 30)).apply()

var AppPrefs.v47DanmakuMaxLines: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_MAX_LINES, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_MAX_LINES, value.coerceIn(0, 50)).apply()

var AppPrefs.v47CacheMaxSizeMb: Int
        get() = prefs.getInt(KEY_V47_CACHE_MAX_SIZE_MB, 0)
        set(value) = prefs.edit().putInt(KEY_V47_CACHE_MAX_SIZE_MB, value.coerceIn(0, 2048)).apply()

var AppPrefs.v47ProgressBarSeekPreview: Boolean
        get() = prefs.getBoolean(KEY_V47_PROGRESS_BAR_SEEK_PREVIEW, false)
        set(value) = prefs.edit().putBoolean(KEY_V47_PROGRESS_BAR_SEEK_PREVIEW, value).apply()

var AppPrefs.v47DanmakuHighlightMention: Boolean
        get() = prefs.getBoolean(KEY_V47_DANMAKU_HIGHLIGHT_MENTION, false)
        set(value) = prefs.edit().putBoolean(KEY_V47_DANMAKU_HIGHLIGHT_MENTION, value).apply()

var AppPrefs.v47ColorTint: Int
        get() = prefs.getInt(KEY_V47_COLOR_TINT, 0)
        set(value) = prefs.edit().putInt(KEY_V47_COLOR_TINT, value.coerceIn(0, 5)).apply()

var AppPrefs.v47VolumeChannelBalance: Int
        get() = prefs.getInt(KEY_V47_VOLUME_CHANNEL_BALANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V47_VOLUME_CHANNEL_BALANCE, value.coerceIn(-50, 50)).apply()

var AppPrefs.v47DanmakuBgBorderColor: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_BG_BORDER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_BG_BORDER_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v47CastSubtitleEnabled: Boolean
        get() = prefs.getBoolean(KEY_V47_CAST_SUBTITLE_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V47_CAST_SUBTITLE_ENABLED, value).apply()

    // ===== v48.x =====

var AppPrefs.v48PlaybackAutoSkipIntro: Boolean
        get() = prefs.getBoolean(KEY_V48_PLAYBACK_AUTO_SKIP_INTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_PLAYBACK_AUTO_SKIP_INTRO, value).apply()

var AppPrefs.v48DanmakuFontLineHeight: Int
        get() = prefs.getInt(KEY_V48_DANMAKU_FONT_LINE_HEIGHT, 0)
        set(value) = prefs.edit().putInt(KEY_V48_DANMAKU_FONT_LINE_HEIGHT, value.coerceIn(0, 20)).apply()

var AppPrefs.v48ColorBlackLevel: Int
        get() = prefs.getInt(KEY_V48_COLOR_BLACK_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V48_COLOR_BLACK_LEVEL, value.coerceIn(-100, 100)).apply()

var AppPrefs.v48VolumeBassBoost: Int
        get() = prefs.getInt(KEY_V48_VOLUME_BASS_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V48_VOLUME_BASS_BOOST, value.coerceIn(0, 100)).apply()

var AppPrefs.v48DanmakuSendMaxLength: Int
        get() = prefs.getInt(KEY_V48_DANMAKU_SEND_MAX_LENGTH, 100)
        set(value) = prefs.edit().putInt(KEY_V48_DANMAKU_SEND_MAX_LENGTH, value.coerceIn(20, 200)).apply()

var AppPrefs.v48CastResolutionAuto: Boolean
        get() = prefs.getBoolean(KEY_V48_CAST_RESOLUTION_AUTO, true)
        set(value) = prefs.edit().putBoolean(KEY_V48_CAST_RESOLUTION_AUTO, value).apply()

var AppPrefs.v48GestureTapFeedback: Boolean
        get() = prefs.getBoolean(KEY_V48_GESTURE_TAP_FEEDBACK, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_GESTURE_TAP_FEEDBACK, value).apply()

var AppPrefs.v48DanmakuFilterRegex: Boolean
        get() = prefs.getBoolean(KEY_V48_DANMAKU_FILTER_REGEX, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_DANMAKU_FILTER_REGEX, value).apply()

var AppPrefs.v48CacheCleanupInterval: Int
        get() = prefs.getInt(KEY_V48_CACHE_CLEANUP_INTERVAL, 0)
        set(value) = prefs.edit().putInt(KEY_V48_CACHE_CLEANUP_INTERVAL, value.coerceIn(0, 5)).apply()

var AppPrefs.v48ProgressBarTouchArea: Int
        get() = prefs.getInt(KEY_V48_PROGRESS_BAR_TOUCH_AREA, 0)
        set(value) = prefs.edit().putInt(KEY_V48_PROGRESS_BAR_TOUCH_AREA, value.coerceIn(0, 30)).apply()

var AppPrefs.v48DanmakuFontSizeAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V48_DANMAKU_FONT_SIZE_ADAPTIVE, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_DANMAKU_FONT_SIZE_ADAPTIVE, value).apply()

var AppPrefs.v48ColorWhiteLevel: Int
        get() = prefs.getInt(KEY_V48_COLOR_WHITE_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V48_COLOR_WHITE_LEVEL, value.coerceIn(-100, 100)).apply()

var AppPrefs.v48VolumeVirtualizer: Int
        get() = prefs.getInt(KEY_V48_VOLUME_VIRTUALIZER, 0)
        set(value) = prefs.edit().putInt(KEY_V48_VOLUME_VIRTUALIZER, value.coerceIn(0, 100)).apply()

var AppPrefs.v48DanmakuBgShadowSize: Int
        get() = prefs.getInt(KEY_V48_DANMAKU_BG_SHADOW_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V48_DANMAKU_BG_SHADOW_SIZE, value.coerceIn(0, 10)).apply()

var AppPrefs.v48CastMirrorQuality: Int
        get() = prefs.getInt(KEY_V48_CAST_MIRROR_QUALITY, 0)
        set(value) = prefs.edit().putInt(KEY_V48_CAST_MIRROR_QUALITY, value.coerceIn(0, 3)).apply()

    // ===== v49.x =====

var AppPrefs.v49PlaybackAutoSkipOutro: Boolean
        get() = prefs.getBoolean(KEY_V49_PLAYBACK_AUTO_SKIP_OUTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_PLAYBACK_AUTO_SKIP_OUTRO, value).apply()

var AppPrefs.v49DanmakuFontLetterSpacing: Int
        get() = prefs.getInt(KEY_V49_DANMAKU_FONT_LETTER_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V49_DANMAKU_FONT_LETTER_SPACING, value.coerceIn(0, 10)).apply()

var AppPrefs.v49ColorHighlightRecovery: Int
        get() = prefs.getInt(KEY_V49_COLOR_HIGHLIGHT_RECOVERY, 0)
        set(value) = prefs.edit().putInt(KEY_V49_COLOR_HIGHLIGHT_RECOVERY, value.coerceIn(0, 5)).apply()

var AppPrefs.v49VolumeTrebleBoost: Int
        get() = prefs.getInt(KEY_V49_VOLUME_TREBLE_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V49_VOLUME_TREBLE_BOOST, value.coerceIn(0, 100)).apply()

var AppPrefs.v49DanmakuSendFontSize: Int
        get() = prefs.getInt(KEY_V49_DANMAKU_SEND_FONT_SIZE, 25)
        set(value) = prefs.edit().putInt(KEY_V49_DANMAKU_SEND_FONT_SIZE, value.coerceIn(12, 40)).apply()

var AppPrefs.v49CastAudioSync: Int
        get() = prefs.getInt(KEY_V49_CAST_AUDIO_SYNC, 0)
        set(value) = prefs.edit().putInt(KEY_V49_CAST_AUDIO_SYNC, value.coerceIn(-500, 500)).apply()

var AppPrefs.v49GestureLongPressAction: Int
        get() = prefs.getInt(KEY_V49_GESTURE_LONG_PRESS_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V49_GESTURE_LONG_PRESS_ACTION, value.coerceIn(0, 5)).apply()

var AppPrefs.v49DanmakuFilterDuplicate: Boolean
        get() = prefs.getBoolean(KEY_V49_DANMAKU_FILTER_DUPLICATE, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_DANMAKU_FILTER_DUPLICATE, value).apply()

var AppPrefs.v49CacheAutoCleanupThreshold: Int
        get() = prefs.getInt(KEY_V49_CACHE_AUTO_CLEANUP_THRESHOLD, 0)
        set(value) = prefs.edit().putInt(KEY_V49_CACHE_AUTO_CLEANUP_THRESHOLD, value.coerceIn(0, 5)).apply()

var AppPrefs.v49ProgressBarChapterMark: Boolean
        get() = prefs.getBoolean(KEY_V49_PROGRESS_BAR_CHAPTER_MARK, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_PROGRESS_BAR_CHAPTER_MARK, value).apply()

var AppPrefs.v49DanmakuHighlightKeyword: Boolean
        get() = prefs.getBoolean(KEY_V49_DANMAKU_HIGHLIGHT_KEYWORD, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_DANMAKU_HIGHLIGHT_KEYWORD, value).apply()

var AppPrefs.v49ColorShadowRecovery: Int
        get() = prefs.getInt(KEY_V49_COLOR_SHADOW_RECOVERY, 0)
        set(value) = prefs.edit().putInt(KEY_V49_COLOR_SHADOW_RECOVERY, value.coerceIn(0, 5)).apply()

var AppPrefs.v49VolumeReplayGain: Int
        get() = prefs.getInt(KEY_V49_VOLUME_REPLAY_GAIN, 0)
        set(value) = prefs.edit().putInt(KEY_V49_VOLUME_REPLAY_GAIN, value.coerceIn(-12, 12)).apply()

var AppPrefs.v49DanmakuBgGradientAngle: Int
        get() = prefs.getInt(KEY_V49_DANMAKU_BG_GRADIENT_ANGLE, 0)
        set(value) = prefs.edit().putInt(KEY_V49_DANMAKU_BG_GRADIENT_ANGLE, value.coerceIn(0, 360)).apply()

var AppPrefs.v49CastAutoReconnect: Boolean
        get() = prefs.getBoolean(KEY_V49_CAST_AUTO_RECONNECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_CAST_AUTO_RECONNECT, value).apply()

    // ===== v50.x =====

var AppPrefs.v50PlaybackAutoNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V50_PLAYBACK_AUTO_NEXT_EPISODE, true)
        set(value) = prefs.edit().putBoolean(KEY_V50_PLAYBACK_AUTO_NEXT_EPISODE, value).apply()

var AppPrefs.v50DanmakuFontShadowSize: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_FONT_SHADOW_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_FONT_SHADOW_SIZE, value.coerceIn(0, 10)).apply()

var AppPrefs.v50ColorMidtoneAdjust: Int
        get() = prefs.getInt(KEY_V50_COLOR_MIDTONE_ADJUST, 0)
        set(value) = prefs.edit().putInt(KEY_V50_COLOR_MIDTONE_ADJUST, value.coerceIn(-100, 100)).apply()

var AppPrefs.v50VolumeAmbientMode: Int
        get() = prefs.getInt(KEY_VOLUME_AMBIENT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_VOLUME_AMBIENT_MODE, value.coerceIn(0, 3)).apply()

var AppPrefs.v50DanmakuSendColorCustom: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_SEND_COLOR_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_SEND_COLOR_CUSTOM, value.coerceIn(0, 10)).apply()

var AppPrefs.v50CastVolumeSync: Boolean
        get() = prefs.getBoolean(KEY_V50_CAST_VOLUME_SYNC, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_CAST_VOLUME_SYNC, value).apply()

var AppPrefs.v50GesturePinchZoom: Boolean
        get() = prefs.getBoolean(KEY_V50_GESTURE_PINCH_ZOOM, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_GESTURE_PINCH_ZOOM, value).apply()

var AppPrefs.v50DanmakuFilterColor: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_FILTER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_FILTER_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v50CachePrebufferSeconds: Int
        get() = prefs.getInt(KEY_V50_CACHE_PREBUFFER_SECONDS, 0)
        set(value) = prefs.edit().putInt(KEY_V50_CACHE_PREBUFFER_SECONDS, value.coerceIn(0, 30)).apply()

var AppPrefs.v50ProgressBarDoubleTapSeek: Int
        get() = prefs.getInt(KEY_V50_PROGRESS_BAR_DOUBLE_TAP_SEEK, 10)
        set(value) = prefs.edit().putInt(KEY_V50_PROGRESS_BAR_DOUBLE_TAP_SEEK, value.coerceIn(5, 60)).apply()

var AppPrefs.v50DanmakuFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V50_DANMAKU_FONT_SIZE_AUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_DANMAKU_FONT_SIZE_AUTO, value).apply()

var AppPrefs.v50ColorDynamicRange: Int
        get() = prefs.getInt(KEY_V50_COLOR_DYNAMIC_RANGE, 0)
        set(value) = prefs.edit().putInt(KEY_V50_COLOR_DYNAMIC_RANGE, value.coerceIn(0, 5)).apply()

var AppPrefs.v50VolumeNightMode: Boolean
        get() = prefs.getBoolean(KEY_V50_VOLUME_NIGHT_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_VOLUME_NIGHT_MODE, value).apply()

var AppPrefs.v50DanmakuBgBlurRadius: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_BG_BLUR_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_BG_BLUR_RADIUS, value.coerceIn(0, 20)).apply()

var AppPrefs.v50CastAutoDiscover: Boolean
        get() = prefs.getBoolean(KEY_V50_CAST_AUTO_DISCOVER, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_CAST_AUTO_DISCOVER, value).apply()

    // ===== v51.x =====

var AppPrefs.v51PlaybackAutoSkipIntro: Boolean
        get() = prefs.getBoolean(KEY_V51_PLAYBACK_AUTO_SKIP_INTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V51_PLAYBACK_AUTO_SKIP_INTRO, value).apply()

var AppPrefs.v51DanmakuFontOutlineWidth: Int
        get() = prefs.getInt(KEY_V51_DANMAKU_FONT_OUTLINE_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V51_DANMAKU_FONT_OUTLINE_WIDTH, value.coerceIn(0, 10)).apply()

var AppPrefs.v51ColorShadowAdjust: Int
        get() = prefs.getInt(KEY_V51_COLOR_SHADOW_ADJUST, 0)
        set(value) = prefs.edit().putInt(KEY_V51_COLOR_SHADOW_ADJUST, value.coerceIn(-100, 100)).apply()

var AppPrefs.v51VolumeLoudnessNormalize: Int
        get() = prefs.getInt(KEY_V51_VOLUME_LOUDNESS_NORMALIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V51_VOLUME_LOUDNESS_NORMALIZE, value.coerceIn(0, 5)).apply()

var AppPrefs.v51DanmakuSendBgStyle: Int
        get() = prefs.getInt(KEY_V51_DANMAKU_SEND_BG_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V51_DANMAKU_SEND_BG_STYLE, value.coerceIn(0, 5)).apply()

var AppPrefs.v51CastVideoCodec: Int
        get() = prefs.getInt(KEY_V51_CAST_VIDEO_CODEC, 0)
        set(value) = prefs.edit().putInt(KEY_V51_CAST_VIDEO_CODEC, value.coerceIn(0, 3)).apply()

var AppPrefs.v51GestureDoubleTapRewind: Boolean
        get() = prefs.getBoolean(KEY_V51_GESTURE_DOUBLE_TAP_REWIND, false)
        set(value) = prefs.edit().putBoolean(KEY_V51_GESTURE_DOUBLE_TAP_REWIND, value).apply()

var AppPrefs.v51DanmakuFilterLength: Int
        get() = prefs.getInt(KEY_V51_DANMAKU_FILTER_LENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V51_DANMAKU_FILTER_LENGTH, value.coerceIn(0, 5)).apply()

var AppPrefs.v51CacheMaxSizeMb: Int
        get() = prefs.getInt(KEY_V51_CACHE_MAX_SIZE_MB, 0)
        set(value) = prefs.edit().putInt(KEY_V51_CACHE_MAX_SIZE_MB, value.coerceIn(0, 10)).apply()

var AppPrefs.v51ProgressBarScrubSpeed: Int
        get() = prefs.getInt(KEY_V51_PROGRESS_BAR_SCRUB_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V51_PROGRESS_BAR_SCRUB_SPEED, value.coerceIn(0, 5)).apply()

var AppPrefs.v51DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V51_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V51_DANMAKU_FONT_SPACING, value.coerceIn(0, 10)).apply()

var AppPrefs.v51ColorGammaCorrection: Int
        get() = prefs.getInt(KEY_V51_COLOR_GAMMA_CORRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V51_COLOR_GAMMA_CORRECTION, value.coerceIn(0, 5)).apply()

var AppPrefs.v51VolumeBassReduce: Boolean
        get() = prefs.getBoolean(KEY_V51_VOLUME_BASS_REDUCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V51_VOLUME_BASS_REDUCE, value).apply()

var AppPrefs.v51DanmakuBgBorderColor: Int
        get() = prefs.getInt(KEY_V51_DANMAKU_BG_BORDER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V51_DANMAKU_BG_BORDER_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v51CastSubtitleSync: Int
        get() = prefs.getInt(KEY_V51_CAST_SUBTITLE_SYNC, 0)
        set(value) = prefs.edit().putInt(KEY_V51_CAST_SUBTITLE_SYNC, value.coerceIn(0, 10)).apply()

    // ===== v52.x =====

var AppPrefs.v52PlaybackAutoSkipFiller: Boolean
        get() = prefs.getBoolean(KEY_V52_PLAYBACK_AUTO_SKIP_FILLER, false)
        set(value) = prefs.edit().putBoolean(KEY_V52_PLAYBACK_AUTO_SKIP_FILLER, value).apply()

var AppPrefs.v52DanmakuFontLineHeight: Int
        get() = prefs.getInt(KEY_V52_DANMAKU_FONT_LINE_HEIGHT, 0)
        set(value) = prefs.edit().putInt(KEY_V52_DANMAKU_FONT_LINE_HEIGHT, value.coerceIn(0, 20)).apply()

var AppPrefs.v52ColorTemperature: Int
        get() = prefs.getInt(KEY_V52_COLOR_TEMPERATURE, 50)
        set(value) = prefs.edit().putInt(KEY_V52_COLOR_TEMPERATURE, value.coerceIn(0, 100)).apply()

var AppPrefs.v52VolumeChannelSwap: Boolean
        get() = prefs.getBoolean(KEY_V52_VOLUME_CHANNEL_SWAP, false)
        set(value) = prefs.edit().putBoolean(KEY_V52_VOLUME_CHANNEL_SWAP, value).apply()

var AppPrefs.v52DanmakuSendAnimStyle: Int
        get() = prefs.getInt(KEY_V52_DANMAKU_SEND_ANIM_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V52_DANMAKU_SEND_ANIM_STYLE, value.coerceIn(0, 3)).apply()

var AppPrefs.v52CastResolutionEnhance: Int
        get() = prefs.getInt(KEY_V52_CAST_RESOLUTION_ENHANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V52_CAST_RESOLUTION_ENHANCE, value.coerceIn(0, 5)).apply()

var AppPrefs.v52GestureSwipeSeek: Boolean
        get() = prefs.getBoolean(KEY_V52_GESTURE_SWIPE_SEEK, false)
        set(value) = prefs.edit().putBoolean(KEY_V52_GESTURE_SWIPE_SEEK, value).apply()

var AppPrefs.v52DanmakuFilterSpeed: Int
        get() = prefs.getInt(KEY_V52_DANMAKU_FILTER_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V52_DANMAKU_FILTER_SPEED, value.coerceIn(0, 3)).apply()

var AppPrefs.v52CachePrefetchSize: Int
        get() = prefs.getInt(KEY_V52_CACHE_PREFETCH_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V52_CACHE_PREFETCH_SIZE, value.coerceIn(0, 5)).apply()

var AppPrefs.v52ProgressBarChapters: Boolean
        get() = prefs.getBoolean(KEY_V52_PROGRESS_BAR_CHAPTERS, false)
        set(value) = prefs.edit().putBoolean(KEY_V52_PROGRESS_BAR_CHAPTERS, value).apply()

var AppPrefs.v52DanmakuFontShadowBlur: Int
        get() = prefs.getInt(KEY_V52_DANMAKU_FONT_SHADOW_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V52_DANMAKU_FONT_SHADOW_BLUR, value.coerceIn(0, 10)).apply()

var AppPrefs.v52ColorSaturationAuto: Boolean
        get() = prefs.getBoolean(KEY_V52_COLOR_SATURATION_AUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V52_COLOR_SATURATION_AUTO, value).apply()

var AppPrefs.v52VolumeFadeInMs: Int
        get() = prefs.getInt(KEY_V52_VOLUME_FADE_IN_MS, 0)
        set(value) = prefs.edit().putInt(KEY_V52_VOLUME_FADE_IN_MS, value.coerceIn(0, 5)).apply()

var AppPrefs.v52DanmakuBgGradientColor: Int
        get() = prefs.getInt(KEY_V52_DANMAKU_BG_GRADIENT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V52_DANMAKU_BG_GRADIENT_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v52CastLatencyMode: Int
        get() = prefs.getInt(KEY_V52_CAST_LATENCY_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V52_CAST_LATENCY_MODE, value.coerceIn(0, 3)).apply()

    // ===== v53.x =====

var AppPrefs.v53PlaybackAutoPause: Boolean
        get() = prefs.getBoolean(KEY_V53_PLAYBACK_AUTO_PAUSE, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_PLAYBACK_AUTO_PAUSE, value).apply()

var AppPrefs.v53DanmakuFontItalic: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKU_FONT_ITALIC, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_DANMAKU_FONT_ITALIC, value).apply()

var AppPrefs.v53ColorVignetteCustom: Int
        get() = prefs.getInt(KEY_V53_COLOR_VIGNETTE_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V53_COLOR_VIGNETTE_CUSTOM, value.coerceIn(0, 100)).apply()

var AppPrefs.v53VolumeFadeOutMs: Int
        get() = prefs.getInt(KEY_V53_VOLUME_FADE_OUT_MS, 0)
        set(value) = prefs.edit().putInt(KEY_V53_VOLUME_FADE_OUT_MS, value.coerceIn(0, 5)).apply()

var AppPrefs.v53DanmakuSendTimestamp: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKU_SEND_TIMESTAMP, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_DANMAKU_SEND_TIMESTAMP, value).apply()

var AppPrefs.v53CastAudioCodec: Int
        get() = prefs.getInt(KEY_V53_CAST_AUDIO_CODEC, 0)
        set(value) = prefs.edit().putInt(KEY_V53_CAST_AUDIO_CODEC, value.coerceIn(0, 3)).apply()

var AppPrefs.v53GestureVolumeStep: Int
        get() = prefs.getInt(KEY_V53_GESTURE_VOLUME_STEP, 0)
        set(value) = prefs.edit().putInt(KEY_V53_GESTURE_VOLUME_STEP, value.coerceIn(0, 5)).apply()

var AppPrefs.v53DanmakuFilterType: Int
        get() = prefs.getInt(KEY_V53_DANMAKU_FILTER_TYPE, 0)
        set(value) = prefs.edit().putInt(KEY_V53_DANMAKU_FILTER_TYPE, value.coerceIn(0, 5)).apply()

var AppPrefs.v53CacheCleanupPolicy: Int
        get() = prefs.getInt(KEY_V53_CACHE_CLEANUP_POLICY, 0)
        set(value) = prefs.edit().putInt(KEY_V53_CACHE_CLEANUP_POLICY, value.coerceIn(0, 3)).apply()

var AppPrefs.v53ProgressBarSnap: Boolean
        get() = prefs.getBoolean(KEY_V53_PROGRESS_BAR_SNAP, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_PROGRESS_BAR_SNAP, value).apply()

var AppPrefs.v53DanmakuFontStrike: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKU_FONT_STRIKE, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_DANMAKU_FONT_STRIKE, value).apply()

var AppPrefs.v53ColorBlackLevel: Int
        get() = prefs.getInt(KEY_V53_COLOR_BLACK_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V53_COLOR_BLACK_LEVEL, value.coerceIn(0, 100)).apply()

var AppPrefs.v53VolumeBalanceCustom: Int
        get() = prefs.getInt(KEY_V53_VOLUME_BALANCE_CUSTOM, 5)
        set(value) = prefs.edit().putInt(KEY_V53_VOLUME_BALANCE_CUSTOM, value.coerceIn(0, 10)).apply()

var AppPrefs.v53DanmakuBgRounded: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKU_BG_ROUNDED, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_DANMAKU_BG_ROUNDED, value).apply()

var AppPrefs.v53CastAutoPause: Boolean
        get() = prefs.getBoolean(KEY_V53_CAST_AUTO_PAUSE, false)
        set(value) = prefs.edit().putBoolean(KEY_V53_CAST_AUTO_PAUSE, value).apply()

    // ===== v54.x =====

var AppPrefs.v54PlaybackResumePosition: Boolean
        get() = prefs.getBoolean(KEY_V54_PLAYBACK_RESUME_POSITION, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_PLAYBACK_RESUME_POSITION, value).apply()

var AppPrefs.v54DanmakuFontSizeRange: Int
        get() = prefs.getInt(KEY_V54_DANMAKU_FONT_SIZE_RANGE, 0)
        set(value) = prefs.edit().putInt(KEY_V54_DANMAKU_FONT_SIZE_RANGE, value.coerceIn(0, 5)).apply()

var AppPrefs.v54ColorBrightness: Int
        get() = prefs.getInt(KEY_V54_COLOR_BRIGHTNESS, 50)
        set(value) = prefs.edit().putInt(KEY_V54_COLOR_BRIGHTNESS, value.coerceIn(0, 100)).apply()

var AppPrefs.v54VolumeSurroundMode: Int
        get() = prefs.getInt(KEY_V54_VOLUME_SURROUND_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V54_VOLUME_SURROUND_MODE, value.coerceIn(0, 3)).apply()

var AppPrefs.v54DanmakuSendDraft: Boolean
        get() = prefs.getBoolean(KEY_V54_DANMAKU_SEND_DRAFT, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_DANMAKU_SEND_DRAFT, value).apply()

var AppPrefs.v54CastScreenMirror: Boolean
        get() = prefs.getBoolean(KEY_V54_CAST_SCREEN_MIRROR, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_CAST_SCREEN_MIRROR, value).apply()

var AppPrefs.v54GestureBrightnessStep: Int
        get() = prefs.getInt(KEY_V54_GESTURE_BRIGHTNESS_STEP, 0)
        set(value) = prefs.edit().putInt(KEY_V54_GESTURE_BRIGHTNESS_STEP, value.coerceIn(0, 5)).apply()

var AppPrefs.v54DanmakuFilterUser: Boolean
        get() = prefs.getBoolean(KEY_V54_DANMAKU_FILTER_USER, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_DANMAKU_FILTER_USER, value).apply()

var AppPrefs.v54CacheWakeupPrefetch: Boolean
        get() = prefs.getBoolean(KEY_V54_CACHE_WAKEUP_PREFETCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_CACHE_WAKEUP_PREFETCH, value).apply()

var AppPrefs.v54ProgressBarHaptic: Boolean
        get() = prefs.getBoolean(KEY_V54_PROGRESS_BAR_HAPTIC, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_PROGRESS_BAR_HAPTIC, value).apply()

var AppPrefs.v54DanmakuFontUnderline: Boolean
        get() = prefs.getBoolean(KEY_V54_DANMAKU_FONT_UNDERLINE, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_DANMAKU_FONT_UNDERLINE, value).apply()

var AppPrefs.v54ColorContrast: Int
        get() = prefs.getInt(KEY_V54_COLOR_CONTRAST, 50)
        set(value) = prefs.edit().putInt(KEY_V54_COLOR_CONTRAST, value.coerceIn(0, 100)).apply()

var AppPrefs.v54VolumeAutoGain: Boolean
        get() = prefs.getBoolean(KEY_V54_VOLUME_AUTO_GAIN, false)
        set(value) = prefs.edit().putBoolean(KEY_V54_VOLUME_AUTO_GAIN, value).apply()

var AppPrefs.v54DanmakuBgGradientDirection: Int
        get() = prefs.getInt(KEY_V54_DANMAKU_BG_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V54_DANMAKU_BG_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v54CastSubtitleLang: Int
        get() = prefs.getInt(KEY_V54_CAST_SUBTITLE_LANG, 0)
        set(value) = prefs.edit().putInt(KEY_V54_CAST_SUBTITLE_LANG, value.coerceIn(0, 5)).apply()

    // ===== v55.x =====

var AppPrefs.v55PlaybackAutoResume: Boolean
        get() = prefs.getBoolean(KEY_V55_PLAYBACK_AUTO_RESUME, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_PLAYBACK_AUTO_RESUME, value).apply()

var AppPrefs.v55DanmakuFontMonospace: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKU_FONT_MONOSPACE, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_DANMAKU_FONT_MONOSPACE, value).apply()

var AppPrefs.v55ColorHueAuto: Boolean
        get() = prefs.getBoolean(KEY_V55_COLOR_HUE_AUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_COLOR_HUE_AUTO, value).apply()

var AppPrefs.v55VolumePeakLimiter: Boolean
        get() = prefs.getBoolean(KEY_V55_VOLUME_PEAK_LIMITER, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_VOLUME_PEAK_LIMITER, value).apply()

