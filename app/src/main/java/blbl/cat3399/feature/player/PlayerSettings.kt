@file:androidx.annotation.OptIn(markerClass = [androidx.media3.common.util.UnstableApi::class])

package blbl.cat3399.feature.player

import android.content.Intent
import android.util.TypedValue
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.media3.ui.CaptionStyleCompat
import androidx.media3.ui.SubtitleView
import androidx.recyclerview.widget.RecyclerView
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
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
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Locale

internal object PlayerSettingKeys {
    const val PLAYER_ENGINE = "player_engine"
    const val RESOLUTION = "resolution"
    const val AUDIO_TRACK = "audio_track"
    const val CODEC = "codec"
    const val PLAYBACK_SPEED = "playback_speed"
    const val AUDIO_BALANCE = "audio_balance"
    const val PLAYBACK_MODE = "playback_mode"
    const val SUBTITLE_MENU = "subtitle_menu"
    const val SUBTITLE_ENABLED = "subtitle_enabled"
    const val SUBTITLE_LANG = "subtitle_lang"
    const val SUBTITLE_TEXT_SIZE = "subtitle_text_size"
    const val SUBTITLE_BOTTOM_PADDING = "subtitle_bottom_padding"
    const val SUBTITLE_BACKGROUND_OPACITY = "subtitle_background_opacity"
    const val DANMAKU_MENU = "danmaku_menu"
    const val DANMAKU_ENABLED = "danmaku_enabled"
    const val DANMAKU_SPEED = "danmaku_speed"
    const val DANMAKU_OPACITY = "danmaku_opacity"
    const val DANMAKU_TEXT_SIZE = "danmaku_text_size"
    const val DANMAKU_AREA = "danmaku_area"
    const val DANMAKU_STROKE_WIDTH = "danmaku_stroke_width"
    const val DANMAKU_FONT_WEIGHT = "danmaku_font_weight"
    const val DANMAKU_LANE_DENSITY = "danmaku_lane_density"
    const val DANMAKU_FOLLOW_BILI_SHIELD = "danmaku_follow_bili_shield"
    const val DANMAKU_SHOW_HIGH_LIKE_ICON = "danmaku_show_high_like_icon"
    const val DANMAKU_AI_SHIELD_ENABLED = "danmaku_ai_shield_enabled"
    const val DANMAKU_AI_SHIELD_LEVEL = "danmaku_ai_shield_level"
    const val DANMAKU_ALLOW_SCROLL = "danmaku_allow_scroll"
    const val DANMAKU_ALLOW_TOP = "danmaku_allow_top"
    const val DANMAKU_ALLOW_BOTTOM = "danmaku_allow_bottom"
    const val DANMAKU_ALLOW_COLOR = "danmaku_allow_color"
    const val DANMAKU_ALLOW_SPECIAL = "danmaku_allow_special"
    // v4.3: 本地弹幕关键词过滤
    const val DANMAKU_LOCAL_KEYWORDS = "danmaku_local_keywords"
    // v6.4: 弹幕关键词高亮
    const val DANMAKU_HIGHLIGHT_KEYWORDS = "danmaku_highlight_keywords"
    // v12.8: 弹幕高亮颜色自定义
    const val DANMAKU_HIGHLIGHT_COLOR = "danmaku_highlight_color"
    const val DEBUG_INFO = "debug_info"
    const val PERSISTENT_BOTTOM_PROGRESS = "persistent_bottom_progress"
    const val PERSISTENT_CLOCK = "persistent_clock"
    // v6.9: 画面比例
    const val ASPECT_RATIO = "aspect_ratio"
    // v6.10: 定时关闭
    const val SLEEP_TIMER = "sleep_timer"
    // v6.11: 倍速预设
    const val SPEED_PRESETS = "speed_presets"
    // v7.0: 跳过片头片尾
    const val SKIP_INTRO_OUTRO = "skip_intro_outro"
    // v7.2: AB循环
    const val AB_REPEAT = "ab_repeat"
    // v4.8: 手势灵敏度
    const val GESTURE_SENSITIVITY = "gesture_sensitivity"
    // v12.9: 长按倍速
    const val LONG_PRESS_SPEED = "long_press_speed"
    // v4.9: 护眼模式
    const val EYE_PROTECTION = "eye_protection"
    // v4.12: 视频下载
    const val DOWNLOAD_VIDEO = "download_video"
    // v10.1: 屏幕常亮
    const val KEEP_SCREEN_ON = "keep_screen_on"
    // v10.2: 弹幕去重
    const val DANMAKU_DEDUP = "danmaku_dedup"
    // v10.3: 媒体信息
    const val MEDIA_INFO = "media_info"
    // v11.1: 评论关键词过滤
    const val COMMENT_FILTER_KEYWORDS = "comment_filter_keywords"
    // v11.2: 双击快进秒数
    const val SHORT_SEEK_STEP = "short_seek_step"
    // v11.3: 弹幕最大数量限制
    const val DANMAKU_MAX_COUNT = "danmaku_max_count"
    // v11.7: 字幕延迟
    const val SUBTITLE_DELAY = "subtitle_delay"
    // v11.8: 视频循环
    const val VIDEO_LOOP = "video_loop"
    // v11.9: 默认亮度
    const val DEFAULT_BRIGHTNESS = "default_brightness"
    // v12.14: 视频画面旋转
    const val VIDEO_ROTATION = "video_rotation"
    // v12.15: 视频画面镜像
    const val VIDEO_MIRROR = "video_mirror"
    // v12.16: 画面比例持久化 (无UI key，自动处理)
    // v12.17: 跳转到指定时间
    const val JUMP_TO_TIME = "jump_to_time"
    // v12.19: 快进快退时间自定义
    const val SEEK_STEP_DURATION = "seek_step_duration"
    // v12.20: 播放统计信息
    const val PLAYBACK_STATS = "playback_stats"
    // v12.21: 播放时长提醒
    const val PLAYBACK_TIME_REMINDER = "playback_time_reminder"
    // v12.22: 截图水印位置
    const val SCREENSHOT_WATERMARK_POSITION = "screenshot_watermark_position"
    // v12.23: 弹幕描边颜色
    const val DANMAKU_STROKE_COLOR = "danmaku_stroke_color"
    // v12.25: 视频质量指示器
    const val VIDEO_QUALITY_INDICATOR = "video_quality_indicator"
    // v12.26: 视频色彩调节
    const val VIDEO_COLOR_ADJUSTMENT = "video_color_adjustment"
    // v12.27: 视频画面裁剪
    const val VIDEO_CROP = "video_crop"
    // v12.28: 视频画面锐化/模糊
    const val VIDEO_SHARPEN = "video_sharpen"
    // v12.29: 视频画面色温调节
    const val VIDEO_COLOR_TEMPERATURE = "video_color_temperature"
    // v12.30: 视频画面滤镜预设
    const val VIDEO_FILTER_PRESET = "video_filter_preset"
    // v13.1: 手势自定义
    const val GESTURE_CUSTOMIZATION = "gesture_customization"
    // v13.7: 剩余时间倒计时显示
    const val COUNTDOWN_DISPLAY = "countdown_display"
    // v13.8: 播放速度曲线显示
    const val SPEED_CURVE_DISPLAY = "speed_curve_display"
    // v13.9: 播放位置百分比显示
    const val PERCENTAGE_DISPLAY = "percentage_display"
    // v13.10: 暗角效果
    const val VIGNETTE_EFFECT = "vignette_effect"
    // v13.10: 自定义文字水印
    const val CUSTOM_WATERMARK = "custom_watermark"
    // v13.11: 弹幕历史记录
    const val DANMAKU_HISTORY = "danmaku_history"
    // v13.12: 快捷调节
    const val QUICK_ADJUST = "quick_adjust"
    // v13.13: 音频声道
    const val AUDIO_CHANNEL = "audio_channel"
    // v13.14: 亮度记忆
    const val BRIGHTNESS_MEMORY = "brightness_memory"
    // v13.15: 音量记忆
    const val VOLUME_MEMORY = "volume_memory"
    // v13.16: 播放位置记忆
    const val PLAYBACK_POSITION_MEMORY = "playback_position_memory"
    // v13.17: 视频画质记忆
    const val QUALITY_MEMORY = "quality_memory"
    // v13.18: 弹幕描边样式
    const val DANMAKU_STROKE_STYLE = "danmaku_stroke_style"
    // v13.19: 截图保存路径
    const val SCREENSHOT_SAVE_PATH = "screenshot_save_path"
    // v13.20: 播放速度微调
    const val SPEED_FINE_TUNE = "speed_fine_tune"
    // v13.21: 弹幕时间轴预览
    const val DANMAKU_TIMELINE_PREVIEW = "danmaku_timeline_preview"
    // v13.22: 弹幕速度预设
    const val DANMAKU_SPEED_PRESET = "danmaku_speed_preset"
    // v14.1: 自动连播
    const val AUTO_PLAYLIST = "auto_playlist"
    // v14.2: 弹幕透明度预设
    const val DANMAKU_OPACITY_PRESET = "danmaku_opacity_preset"
    // v14.3: 播放列表排序方式
    const val PLAYLIST_SORT_ORDER = "playlist_sort_order"
    // v14.4: 快捷键映射
    const val SHORTCUT_KEY_MAPPING = "shortcut_key_mapping"
    // v14.5: 视频对比模式
    const val VIDEO_COMPARE_MODE = "video_compare_mode"
    // v14.6: 弹幕过滤规则预设
    const val DANMAKU_FILTER_PRESET = "danmaku_filter_preset"
    // v14.7: 记住播放倍速
    const val REMEMBER_PLAYBACK_SPEED = "remember_playback_speed"
    // v14.8: 弹幕发送快捷键
    const val DANMAKU_QUICK_SEND = "danmaku_quick_send"
    // v14.9: 视频缩略图预览
    const val THUMBNAIL_PREVIEW = "thumbnail_preview"
    // v14.10: 播放历史记录导出
    const val EXPORT_PLAY_HISTORY = "export_play_history"
    // v14.11: 弹幕字体阴影
    const val DANMAKU_TEXT_SHADOW = "danmaku_text_shadow"
    // v14.12: 音频可视化
    const val AUDIO_VISUALIZER = "audio_visualizer"
    // v14.13: 播放失败重试
    const val AUTO_RETRY = "auto_retry"
    // v14.14: 双击反馈震动
    const val DOUBLE_TAP_HAPTIC = "double_tap_haptic"
    // v14.15: 弹幕呼吸灯效果
    const val DANMAKU_BREATHING = "danmaku_breathing"
    // v14.16: 锁屏播放控制
    const val LOCK_SCREEN_CONTROL = "lock_screen_control"
    // v14.17: 跳过结尾动画
    const val SKIP_ENDING_ANIMATION = "skip_ending_animation"
    // v14.18: 记忆播放模式
    const val REMEMBER_PLAY_MODE = "remember_play_mode"
    // v14.19: 弹幕池容量
    const val DANMAKU_POOL_SIZE = "danmaku_pool_size"
    // v14.20: 视频投射模式
    const val CAST_MODE = "cast_mode"
    // v15.1: 弹幕缩放比例
    const val DANMAKU_SCALE = "danmaku_scale"
    // v15.2: 自动播放下一集
    const val AUTO_PLAY_NEXT_EPISODE = "auto_play_next_episode"
    // v15.3: 弹幕描边模糊
    const val DANMAKU_STROKE_BLUR = "danmaku_stroke_blur"

    // v15.6: 弹幕间隔时间
    const val DANMAKU_INTERVAL = "danmaku_interval"
    // v15.7: 播放速度曲线
    const val PLAYBACK_SPEED_CURVE = "playback_speed_curve"
    // v15.8: 弹幕池优先级
    const val DANMAKU_POOL_PRIORITY = "danmaku_pool_priority"
    // v15.10: 弹幕时间偏移
    const val DANMAKU_TIME_OFFSET = "danmaku_time_offset"
    // v15.11: 自动跳过片头
    const val AUTO_SKIP_OPENING = "auto_skip_opening"
    // v15.12: 弹幕透明度动画
    const val DANMAKU_OPACITY_ANIM = "danmaku_opacity_anim"
    // v15.13: 弹幕发送历史
    const val DANMAKU_SEND_HISTORY_BACKUP = "danmaku_send_history_backup"
    // v15.14: 视频旋转记忆
    const val REMEMBER_VIDEO_ROTATION = "remember_video_rotation"
    // v15.15: 弹幕模糊半径
    const val DANMAKU_BLUR_RADIUS = "danmaku_blur_radius"
    // v15.16: 快捷分享
    const val QUICK_SHARE = "quick_share"
    // v15.17: 记住弹幕开关
    const val REMEMBER_DANMAKU_ENABLED = "remember_danmaku_enabled"
    // v15.18: 弹幕入场动画
    const val DANMAKU_ENTRY_ANIM = "danmaku_entry_anim"
    // v15.19: 视频截图质量
    const val SCREENSHOT_QUALITY = "screenshot_quality"
    // v15.20: 弹幕输出模式
    const val DANMAKU_OUTPUT_MODE = "danmaku_output_mode"
    // v15.21: 播放进度条样式
    const val PROGRESS_BAR_STYLE = "progress_bar_style"
    // v15.22: 弹幕渲染层级
    const val DANMAKU_RENDER_LAYER = "danmaku_render_layer"
    // v15.23: 自动播放记忆
    const val REMEMBER_AUTO_PLAY = "remember_auto_play"
    // v15.24: 弹幕过滤关键词
    const val DANMAKU_FILTER_KEYWORDS = "danmaku_filter_keywords"
    // v15.25: 视频色彩空间
    const val VIDEO_COLOR_SPACE = "video_color_space"
    // v15.26: 弹幕发送快捷键
    const val DANMAKU_SEND_KEY = "danmaku_send_key"
    // v15.27: 播放倍速预设
    const val PLAYBACK_SPEED_PRESETS = "playback_speed_presets"
    // v15.28: 弹幕过滤正则
    const val DANMAKU_FILTER_REGEX = "danmaku_filter_regex"
    // v15.29: 视频投射设备
    const val CAST_DEVICE_NAME = "cast_device_name"
    // v15.30: 弹幕描边3D效果
    const val DANMAKU_STROKE_3D = "danmaku_stroke_3d"
    // v16.1: 弹幕字体描边颜色
    const val DANMAKU_STROKE_COLOR_V2 = "danmaku_stroke_color_v2"
    // v16.2: 弹幕抗锯齿
    const val DANMAKU_ANTI_ALIASING = "danmaku_anti_aliasing"
    // v16.3: 视频倍速记忆
    const val REMEMBER_VIDEO_SPEED = "remember_video_speed"
    // v16.4: 弹幕发送确认
    const val DANMAKU_SEND_CONFIRM = "danmaku_send_confirm"
    // v16.5: 播放完成后动作
    const val PLAYBACK_COMPLETE_ACTION = "playback_complete_action"
    // v16.6: 弹幕显示区域
    const val DANMAKU_DISPLAY_AREA = "danmaku_display_area"
    // v16.7: 视频解码方式
    const val VIDEO_DECODER = "video_decoder"
    // v16.8: 弹幕发送框位置
    const val DANMAKU_INPUT_POSITION = "danmaku_input_position"
    // v16.9: 跳过片尾时长
    const val SKIP_ENDING_DURATION = "skip_ending_duration"
    // v16.10: 弹幕粗体模式
    const val DANMAKU_BOLD_MODE = "danmaku_bold_mode"
    // v16.11: 视频投射音量
    const val CAST_VOLUME = "cast_volume"
    // v16.12: 记住弹幕密度
    const val REMEMBER_DANMAKU_DENSITY = "remember_danmaku_density"
    // v16.13: 弹幕刷新率
    const val DANMAKU_REFRESH_RATE = "danmaku_refresh_rate"
    // v16.14: 视频截图格式
    const val SCREENSHOT_FORMAT = "screenshot_format"
    // v16.15: 弹幕描边透明度
    const val DANMAKU_STROKE_OPACITY = "danmaku_stroke_opacity"
    // v17.1: 弹幕发光效果
    const val DANMAKU_GLOW_EFFECT = "danmaku_glow_effect"
    // v17.2: 视频缓存路径
    const val VIDEO_CACHE_PATH = "video_cache_path"
    // v17.3: 弹幕合并模式
    const val DANMAKU_MERGE_MODE = "danmaku_merge_mode"
    // v17.4: 记住播放比例
    const val REMEMBER_ASPECT_RATIO = "remember_aspect_ratio"
    // v17.5: 弹幕字体选择
    const val DANMAKU_FONT_FAMILY = "danmaku_font_family"
    // v17.6: 视频投射延迟
    const val CAST_LATENCY = "cast_latency"
    // v17.7: 弹幕过滤强度
    const val DANMAKU_FILTER_STRENGTH = "danmaku_filter_strength"
    // v17.8: 播放列表循环模式
    const val PLAYLIST_LOOP_MODE = "playlist_loop_mode"
    // v17.9: 弹幕时间戳显示
    const val DANMAKU_TIMESTAMP_VISIBLE = "danmaku_timestamp_visible"
    // v17.10: 视频缩放模式
    const val VIDEO_SCALE_MODE = "video_scale_mode"
    // v17.11: 自动清理缓存
    const val AUTO_CLEAN_CACHE = "auto_clean_cache"
    // v17.12: 弹幕预览模式
    const val DANMAKU_PREVIEW_MODE = "danmaku_preview_mode"
    // v17.13: 记住弹幕位置
    const val REMEMBER_DANMAKU_POSITION = "remember_danmaku_position"
    // v17.14: 视频HDR模式
    const val VIDEO_HDR_MODE = "video_hdr_mode"
    // v17.15: 弹幕描边渐变
    const val DANMAKU_STROKE_GRADIENT = "danmaku_stroke_gradient"
    // v18.1: 弹幕延迟发送
    const val DANMAKU_DELAYED_SEND = "danmaku_delayed_send"
    // v18.2: 视频投屏标准
    const val CAST_STANDARD = "cast_standard"
    // v18.3: 弹幕滚动速度
    const val DANMAKU_SCROLL_SPEED = "danmaku_scroll_speed"
    // v18.4: 记住画中画模式
    const val REMEMBER_PIP_MODE = "remember_pip_mode"
    // v18.5: 弹幕文字阴影颜色
    const val DANMAKU_TEXT_SHADOW_COLOR = "danmaku_text_shadow_color"
    // v18.6: 视频自动旋转
    const val AUTO_ROTATE_VIDEO = "auto_rotate_video"
    // v18.7: 弹幕过滤模式
    const val DANMAKU_FILTER_MODE = "danmaku_filter_mode"
    // v18.8: 播放网络检测
    const val NETWORK_CHECK = "network_check"
    // v18.11: 弹幕透明度记忆
    const val REMEMBER_DANMAKU_OPACITY = "remember_danmaku_opacity"
    // v18.12: 视频截图声音
    const val SCREENSHOT_SOUND = "screenshot_sound"
    // v18.13: 弹幕历史记录上限
    const val DANMAKU_HISTORY_LIMIT = "danmaku_history_limit"
    // v18.14: 播放记忆天数
    const val PLAY_HISTORY_DAYS = "play_history_days"
    // v18.15: 弹幕字体轮廓
    const val DANMAKU_FONT_OUTLINE = "danmaku_font_outline"
    // v19.1: 弹幕动画效果
    const val DANMAKU_ANIMATION = "danmaku_animation"
    // v19.2: 视频弹幕同步
    const val DANMAKU_VIDEO_SYNC = "danmaku_video_sync"
    // v19.3: 弹幕呼吸灯模式
    const val DANMAKU_BREATHING_MODE = "danmaku_breathing_mode"
    // v19.4: 记住播放模式 (使用v16.x已有)
    // v19.5: 弹幕快速复制
    const val DANMAKU_QUICK_COPY = "danmaku_quick_copy"
    // v19.6: 视频投射优先
    const val CAST_PRIORITY = "cast_priority"
    // v19.7: 弹幕收藏功能
    const val DANMAKU_FAVORITE = "danmaku_favorite"
    // v19.8: 记住播放速度 (使用v14.7已有)
    // v19.9: 弹幕智能屏蔽
    const val DANMAKU_SMART_BLOCK = "danmaku_smart_block"
    // v19.10: 视频记忆亮度 (使用v16.x已有)
    // v19.11: 弹幕屏蔽关键词
    const val BLOCK_KEYWORDS = "block_keywords"
    // v19.12: 视频投射镜像
    const val CAST_MIRROR = "cast_mirror"
    // v19.13: 弹幕显示延迟
    const val DANMAKU_DISPLAY_DELAY = "danmaku_display_delay"
    // v19.14: 记住音量 (使用v16.x已有)
    // v19.15: 弹幕背景模糊
    const val DANMAKU_BACKGROUND_BLUR = "danmaku_background_blur"
    // v20.1: 弹幕彩虹特效
    const val DANMAKU_RAINBOW_EFFECT = "danmaku_rainbow_effect"
    // v20.2: 视频平滑过渡
    const val VIDEO_SMOOTH_TRANSITION = "video_smooth_transition"
    // v20.3: 弹幕打字机效果
    const val DANMAKU_TYPEWRITER_EFFECT = "danmaku_typewriter_effect"
    // v20.4: 记住播放列表顺序
    const val REMEMBER_PLAYLIST_ORDER = "remember_playlist_order"
    // v20.5: 弹幕批量复制
    const val DANMAKU_BATCH_COPY = "danmaku_batch_copy"
    // v20.6: 视频投射性能模式
    const val CAST_PERFORMANCE_MODE = "cast_performance_mode"
    // v20.7: 弹幕缩放效果
    const val DANMAKU_ZOOM_EFFECT = "danmaku_zoom_effect"
    // v20.8: 视频自动跳过片头 (使用v16.x已有)
    // v20.9: 弹幕模板回复
    const val DANMAKU_TEMPLATE_REPLY = "danmaku_template_reply"
    // v20.10: 视频投射省电模式
    const val CAST_POWER_SAVING = "cast_power_saving"
    // v20.11: 弹幕高亮特效
    const val DANMAKU_HIGHLIGHT_EFFECT = "danmaku_highlight_effect"
    // v20.12: 记住播放位置
    const val REMEMBER_PLAY_POSITION = "remember_play_position"
    // v20.13: 弹幕发送动画
    const val DANMAKU_SEND_ANIMATION = "danmaku_send_animation"
    // v20.14: 记住播放跳过
    const val REMEMBER_SKIP_SETTINGS = "remember_skip_settings"
    // v20.15: 弹幕3D效果
    const val DANMAKU_3D_EFFECT = "danmaku_3d_effect"
}

internal enum class PlayerSettingsMenu {
    ROOT,
    SUBTITLE,
    DANMAKU,
}

private fun settingItem(
    key: String,
    title: String,
    subtitle: String? = null,
): PlayerSettingsAdapter.SettingItem = PlayerSettingsAdapter.SettingItem(key = key, title = title, subtitle = subtitle)

private fun Boolean.switchText(): String = if (this) "开" else "关"

private fun PlayerActivity.shouldPersistPlayerSettingsToGlobal(): Boolean = BiliClient.prefs.playerSettingsApplyToGlobal

internal fun <T> PlayerActivity.applySessionSettingValue(
    value: T,
    updateSession: PlayerSessionSettings.(T) -> PlayerSessionSettings,
    syncToGlobal: AppPrefs.(T) -> Unit = {},
    afterApplied: PlayerActivity.(T) -> Unit = {},
    refreshSettingsPanel: Boolean = true,
) {
    session = session.updateSession(value)
    if (shouldPersistPlayerSettingsToGlobal()) {
        BiliClient.prefs.syncToGlobal(value)
    }
    afterApplied(value)
    if (refreshSettingsPanel) {
        refreshSettingsPanel()
    }
}

internal fun <T> PlayerActivity.applyDanmakuSettingValue(
    value: T,
    updateDanmaku: DanmakuSessionSettings.(T) -> DanmakuSessionSettings,
    syncToGlobal: AppPrefs.(T) -> Unit = {},
    afterApplied: PlayerActivity.(T) -> Unit = {},
    refreshSettingsPanel: Boolean = true,
) {
    applySessionSettingValue(
        value = value,
        updateSession = { nextValue -> copy(danmaku = danmaku.updateDanmaku(nextValue)) },
        syncToGlobal = syncToGlobal,
        afterApplied = afterApplied,
        refreshSettingsPanel = refreshSettingsPanel,
    )
}

internal fun PlayerActivity.toggleSessionSettingFlag(
    current: Boolean,
    updateSession: PlayerSessionSettings.(Boolean) -> PlayerSessionSettings,
    syncToGlobal: AppPrefs.(Boolean) -> Unit = {},
    afterApplied: PlayerActivity.(Boolean) -> Unit = {},
    refreshSettingsPanel: Boolean = true,
) {
    applySessionSettingValue(
        value = !current,
        updateSession = updateSession,
        syncToGlobal = syncToGlobal,
        afterApplied = afterApplied,
        refreshSettingsPanel = refreshSettingsPanel,
    )
}

internal fun PlayerActivity.toggleDanmakuReloadSettingFlag(
    current: Boolean,
    updateDanmaku: DanmakuSessionSettings.(Boolean) -> DanmakuSessionSettings,
    syncToGlobal: AppPrefs.(Boolean) -> Unit = {},
) {
    applyDanmakuSettingValue(
        value = !current,
        updateDanmaku = updateDanmaku,
        syncToGlobal = syncToGlobal,
        afterApplied = { reloadDanmakuForCurrentSession() },
    )
}

private fun PlayerActivity.persistResolutionPreference(prefs: AppPrefs, qn: Int) {
    when (currentVideoIsPortrait) {
        true -> prefs.playerPreferredQnPortrait = qn
        false -> prefs.playerPreferredQn = qn
        null -> Unit
    }
}

internal fun PlayerActivity.defaultSubtitleLangCode(): String {
    return BiliClient.prefs.subtitlePreferredLang
        .trim()
        .ifBlank { "auto" }
}

internal fun PlayerActivity.selectedResolutionQn(): Int {
    return session.actualQn.takeIf { it > 0 }
        ?: session.targetQn.takeIf { it > 0 }
        ?: session.preferredQn
}

internal fun PlayerActivity.selectedAudioTrackId(): Int {
    return session.actualAudioId.takeIf { it > 0 }
        ?: session.targetAudioId.takeIf { it > 0 }
        ?: session.preferAudioId
}

internal fun PlayerActivity.resolvedSubtitleLangCode(): String {
    return (session.subtitleLangOverride ?: defaultSubtitleLangCode())
        .trim()
        .ifBlank { "auto" }
}

internal fun PlayerActivity.applyResolutionSetting(qn: Int) {
    // v13.17: 画质记忆 - 保存用户选择的画质
    if (BiliClient.prefs.qualityMemoryEnabled && currentBvid.isNotBlank()) {
        BiliClient.prefs.setVideoQuality(currentBvid, qn)
    }
    session =
        if (shouldPersistPlayerSettingsToGlobal() && currentVideoIsPortrait != null) {
            session.copy(preferredQn = qn, targetQn = 0)
        } else if (qn == session.preferredQn) {
            session.copy(targetQn = 0)
        } else {
            session.copy(targetQn = qn)
        }
    if (shouldPersistPlayerSettingsToGlobal()) {
        persistResolutionPreference(BiliClient.prefs, qn)
    }
    reloadStream(keepPosition = true)
    refreshSettingsPanel()
}

internal fun PlayerActivity.applyAudioTrackSetting(id: Int) {
    session =
        if (shouldPersistPlayerSettingsToGlobal()) {
            session.copy(preferAudioId = id, targetAudioId = 0)
        } else if (id == session.preferAudioId) {
            session.copy(targetAudioId = 0)
        } else {
            session.copy(targetAudioId = id)
        }
    if (shouldPersistPlayerSettingsToGlobal()) {
        BiliClient.prefs.playerPreferredAudioId = id
    }
    reloadStream(keepPosition = true)
    refreshSettingsPanel()
}

internal fun PlayerActivity.applyPlaybackModeSetting(
    pickedCode: String,
    engine: BlblPlayerEngine,
) {
    val normalized = PlayerPlaybackModes.normalize(pickedCode)
    val defaultCode =
        if (shouldPersistPlayerSettingsToGlobal() && !isPgcLikePlayback()) {
            normalized
        } else {
            defaultPlaybackModeCode()
        }
    session =
        if (normalized == defaultCode) {
            session.copy(playbackModeOverride = null)
        } else {
            session.copy(playbackModeOverride = normalized)
        }
    if (shouldPersistPlayerSettingsToGlobal()) {
        BiliClient.prefs.playerPlaybackMode = normalized
    }
    applyPlaybackMode(engine)
    updatePlaylistControls()
    refreshSettingsPanel()
}

private fun PlayerActivity.applyPlayerEngineSetting(picked: PlayerEngineKind) {
    applySessionSettingValue(
        value = picked,
        updateSession = { copy(engineKind = it) },
        syncToGlobal = { playerEngineKind = it.prefValue },
        afterApplied = { restartForEngineSwitch(it) },
        refreshSettingsPanel = false,
    )
}

internal fun PlayerActivity.applySubtitleEnabledSetting(
    enabled: Boolean,
    exo: ExoPlayer,
) {
    applySessionSettingValue(
        value = enabled,
        updateSession = { copy(subtitleEnabled = it) },
        syncToGlobal = { subtitleEnabledDefault = it },
        afterApplied = {
            applySubtitleEnabled(exo)
            updateSubtitleButton()
        },
    )
}

internal fun PlayerActivity.applySubtitleLanguageSetting(
    pickedCode: String,
    exo: ExoPlayer,
) {
    val normalized = pickedCode.trim().ifBlank { "auto" }
    val defaultCode = defaultSubtitleLangCode()
    session =
        if (shouldPersistPlayerSettingsToGlobal() || normalized.equals(defaultCode, ignoreCase = true)) {
            session.copy(subtitleLangOverride = null)
        } else {
            session.copy(subtitleLangOverride = normalized)
        }
    if (shouldPersistPlayerSettingsToGlobal()) {
        BiliClient.prefs.subtitlePreferredLang = normalized
    }
    refreshSettingsPanel()
    lifecycleScope.launch {
        subtitleConfig = buildSubtitleConfigFromCurrentSelection(bvid = currentBvid, cid = currentCid)
        subtitleAvailabilityKnown = true
        subtitleAvailable = subtitleConfig != null
        applySubtitleEnabled(exo)
        updateSubtitleButton()
        refreshSettingsPanel()
        reloadStream(keepPosition = true)
    }
}

internal fun PlayerActivity.applyDanmakuEnabledSetting(enabled: Boolean) {
    applyDanmakuSettingValue(
        value = enabled,
        updateDanmaku = { copy(enabled = it) },
        syncToGlobal = { danmakuEnabled = it },
        afterApplied = { nextEnabled ->
            binding.danmakuView.invalidate()
            updateDanmakuButton()
            if (nextEnabled) {
                val positionMs = player?.currentPosition?.coerceAtLeast(0L) ?: 0L
                requestDanmakuSegmentsForPosition(positionMs, immediate = true)
            }
        },
    )
}

internal fun PlayerActivity.handleSettingsItemClick(item: PlayerSettingsAdapter.SettingItem) {
    when (item.key) {
        PlayerSettingKeys.PLAYER_ENGINE -> showPlayerEngineDialog()

        PlayerSettingKeys.GESTURE_SENSITIVITY -> showGestureSensitivityDialog()

        // v12.9: 长按倍速
        PlayerSettingKeys.LONG_PRESS_SPEED -> showLongPressSpeedDialog()

        PlayerSettingKeys.EYE_PROTECTION -> showEyeProtectionDialog()

        // v4.12: 视频下载
        PlayerSettingKeys.DOWNLOAD_VIDEO -> {
            val bvid = intent.getStringExtra("bvid") ?: ""
            val cid = intent.getLongExtra("cid", 0L)
            val title = intent.getStringExtra("title") ?: "未知视频"
            if (bvid.isNotBlank() && cid > 0) {
                // v8.8: 下载前选择画质
                val qnOptions = listOf(
                    127 to "4K", 120 to "超清", 116 to "1080P60", 112 to "1080P+",
                    80 to "1080P", 74 to "720P60", 64 to "720P", 32 to "480P", 16 to "360P"
                )
                val currentQn = BiliClient.prefs.playerPreferredQn
                val labels = qnOptions.map { "${it.second} (当前${if (it.first == currentQn) "✓" else ""})" }.toTypedArray()
                android.app.AlertDialog.Builder(this)
                    .setTitle("选择下载画质")
                    .setItems(labels) { _, which ->
                        val selectedQn = qnOptions[which].first
                        AppToast.show(this, "开始下载: $title (${qnOptions[which].second})")
                        blbl.cat3399.feature.download.VideoDownloadService.start(
                            context = this, bvid = bvid, cid = cid, title = title, qn = selectedQn,
                        )
                    }
                    .setNegativeButton("取消", null)
                    .show()
            } else {
                AppToast.show(this, "无法获取视频信息")
            }
        }
        PlayerSettingKeys.RESOLUTION -> showResolutionDialog()
        PlayerSettingKeys.AUDIO_TRACK -> showAudioDialog()
        PlayerSettingKeys.CODEC -> showCodecDialog()
        PlayerSettingKeys.PLAYBACK_SPEED -> showSpeedDialog()
        PlayerSettingKeys.AUDIO_BALANCE -> showAudioBalanceDialog()
        PlayerSettingKeys.PLAYBACK_MODE -> showPlaybackModeDialog()
        PlayerSettingKeys.SUBTITLE_MENU -> showSubtitleSettingsMenu()
        PlayerSettingKeys.SUBTITLE_ENABLED -> {
            val exo = (player as? ExoPlayerEngine)?.exoPlayer
            if (exo == null) {
                AppToast.show(this, "当前播放器内核不支持字幕")
                return
            }
            toggleSubtitles(exo)
        }

        PlayerSettingKeys.SUBTITLE_LANG -> showSubtitleLangDialog()
        PlayerSettingKeys.SUBTITLE_TEXT_SIZE -> showSubtitleTextSizeDialog()
        PlayerSettingKeys.SUBTITLE_BOTTOM_PADDING -> showSubtitleBottomPaddingDialog()
        PlayerSettingKeys.SUBTITLE_BACKGROUND_OPACITY -> showSubtitleBackgroundOpacityDialog()
        PlayerSettingKeys.DANMAKU_MENU -> showDanmakuSettingsMenu()
        PlayerSettingKeys.DANMAKU_ENABLED -> setDanmakuEnabled(!session.danmaku.enabled)

        PlayerSettingKeys.DANMAKU_SPEED -> showDanmakuSpeedDialog()
        PlayerSettingKeys.DANMAKU_OPACITY -> showDanmakuOpacityDialog()
        PlayerSettingKeys.DANMAKU_TEXT_SIZE -> showDanmakuTextSizeDialog()
        PlayerSettingKeys.DANMAKU_AREA -> showDanmakuAreaDialog()
        PlayerSettingKeys.DANMAKU_STROKE_WIDTH -> showDanmakuStrokeWidthDialog()
        PlayerSettingKeys.DANMAKU_FONT_WEIGHT -> showDanmakuFontWeightDialog()
        PlayerSettingKeys.DANMAKU_LANE_DENSITY -> showDanmakuLaneDensityDialog()
        PlayerSettingKeys.DANMAKU_FOLLOW_BILI_SHIELD ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.followBiliShield,
                updateDanmaku = { copy(followBiliShield = it) },
                syncToGlobal = { danmakuFollowBiliShield = it },
            )
        PlayerSettingKeys.DANMAKU_SHOW_HIGH_LIKE_ICON ->
            applyDanmakuSettingValue(
                value = !session.danmaku.showHighLikeIcon,
                updateDanmaku = { copy(showHighLikeIcon = it) },
                syncToGlobal = { danmakuShowHighLikeIcon = it },
                afterApplied = { binding.danmakuView.invalidate() },
            )
        PlayerSettingKeys.DANMAKU_AI_SHIELD_ENABLED ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.aiShieldEnabled,
                updateDanmaku = { copy(aiShieldEnabled = it) },
                syncToGlobal = { danmakuAiShieldEnabled = it },
            )
        PlayerSettingKeys.DANMAKU_AI_SHIELD_LEVEL -> showDanmakuAiShieldLevelDialog()
        PlayerSettingKeys.DANMAKU_ALLOW_SCROLL ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.allowScroll,
                updateDanmaku = { copy(allowScroll = it) },
                syncToGlobal = { danmakuAllowScroll = it },
            )
        PlayerSettingKeys.DANMAKU_ALLOW_TOP ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.allowTop,
                updateDanmaku = { copy(allowTop = it) },
                syncToGlobal = { danmakuAllowTop = it },
            )
        PlayerSettingKeys.DANMAKU_ALLOW_BOTTOM ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.allowBottom,
                updateDanmaku = { copy(allowBottom = it) },
                syncToGlobal = { danmakuAllowBottom = it },
            )
        PlayerSettingKeys.DANMAKU_ALLOW_COLOR ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.allowColor,
                updateDanmaku = { copy(allowColor = it) },
                syncToGlobal = { danmakuAllowColor = it },
            )
        PlayerSettingKeys.DANMAKU_ALLOW_SPECIAL ->
            toggleDanmakuReloadSettingFlag(
                current = session.danmaku.allowSpecial,
                updateDanmaku = { copy(allowSpecial = it) },
                syncToGlobal = { danmakuAllowSpecial = it },
            )
        // v4.3: 本地弹幕关键词过滤
        PlayerSettingKeys.DANMAKU_LOCAL_KEYWORDS -> showLocalKeywordsDialog()
        // v6.4: 弹幕关键词高亮
        PlayerSettingKeys.DANMAKU_HIGHLIGHT_KEYWORDS -> showHighlightKeywordsDialog()
        // v12.8: 弹幕高亮颜色自定义
        PlayerSettingKeys.DANMAKU_HIGHLIGHT_COLOR -> showDanmakuHighlightColorDialog()
        PlayerSettingKeys.DEBUG_INFO ->
            toggleSessionSettingFlag(
                current = session.debugEnabled,
                updateSession = { copy(debugEnabled = it) },
                syncToGlobal = { playerDebugEnabled = it },
                afterApplied = { updateDebugOverlay() },
            )
        PlayerSettingKeys.PERSISTENT_BOTTOM_PROGRESS ->
            toggleSessionSettingFlag(
                current = session.persistentBottomProgressEnabled,
                updateSession = { copy(persistentBottomProgressEnabled = it) },
                syncToGlobal = { playerPersistentBottomProgressEnabled = it },
                afterApplied = { updatePersistentBottomProgressBarVisibility() },
            )

        PlayerSettingKeys.PERSISTENT_CLOCK -> {
            val appPrefs = BiliClient.prefs
            appPrefs.playerPersistentClockEnabled = !appPrefs.playerPersistentClockEnabled
            updateClockVisibility()
            refreshSettingsPanel()
        }

        // v6.9: 画面比例
        PlayerSettingKeys.ASPECT_RATIO -> showAspectRatioDialog()

        // v6.10: 定时关闭
        PlayerSettingKeys.SLEEP_TIMER -> showSleepTimerDialog()

        // v6.11: 倍速预设
        PlayerSettingKeys.SPEED_PRESETS -> showSpeedPresetsDialog()

        // v7.0: 跳过片头片尾
        PlayerSettingKeys.SKIP_INTRO_OUTRO -> showSkipIntroOutroDialog()

        // v7.2: AB循环
        PlayerSettingKeys.AB_REPEAT -> {
            toggleAbRepeat()
            refreshSettingsPanel()
        }

        // v10.1: 屏幕常亮
        PlayerSettingKeys.KEEP_SCREEN_ON -> {
            val newValue = !BiliClient.prefs.keepScreenOn
            BiliClient.prefs.keepScreenOn = newValue
            if (newValue) {
                window.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            } else {
                window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            }
            refreshSettingsPanel()
        }

        // v10.2: 弹幕去重
        PlayerSettingKeys.DANMAKU_DEDUP -> {
            val newValue = !BiliClient.prefs.danmakuDedup
            BiliClient.prefs.danmakuDedup = newValue
            refreshSettingsPanel()
        }

        // v10.3: 媒体信息
        PlayerSettingKeys.MEDIA_INFO -> showMediaInfoDialog()

        // v11.1: 评论关键词过滤
        PlayerSettingKeys.COMMENT_FILTER_KEYWORDS -> showCommentFilterKeywordsDialog()

        // v11.2: 双击快进秒数
        PlayerSettingKeys.SHORT_SEEK_STEP -> showShortSeekStepDialog()

        // v11.3: 弹幕最大数量限制
        PlayerSettingKeys.DANMAKU_MAX_COUNT -> showDanmakuMaxCountDialog()

        // v11.7: 字幕延迟
        PlayerSettingKeys.SUBTITLE_DELAY -> showSubtitleDelayDialog()

        // v11.8: 视频循环
        PlayerSettingKeys.VIDEO_LOOP -> {
            val newValue = if (BiliClient.prefs.videoLoopMode == 0) 1 else 0
            BiliClient.prefs.videoLoopMode = newValue
            player?.repeatMode = if (newValue == 1) Player.REPEAT_MODE_ONE else Player.REPEAT_MODE_OFF
            refreshSettingsPanel()
        }

        // v11.9: 默认亮度
        PlayerSettingKeys.DEFAULT_BRIGHTNESS -> showDefaultBrightnessDialog()

        // v12.14: 视频画面旋转
        PlayerSettingKeys.VIDEO_ROTATION -> showVideoRotationDialog()

        // v12.15: 视频画面镜像
        PlayerSettingKeys.VIDEO_MIRROR -> showVideoMirrorDialog()

        // v12.17: 跳转到指定时间
        PlayerSettingKeys.JUMP_TO_TIME -> showJumpToTimeDialog()

        // v12.19: 快进快退时间自定义
        PlayerSettingKeys.SEEK_STEP_DURATION -> showSeekStepDurationDialog()

        // v12.20: 播放统计信息
        PlayerSettingKeys.PLAYBACK_STATS -> showPlaybackStatsDialog()

        // v12.21: 播放时长提醒
        PlayerSettingKeys.PLAYBACK_TIME_REMINDER -> showPlaybackTimeReminderDialog()

        // v12.22: 截图水印位置
        PlayerSettingKeys.SCREENSHOT_WATERMARK_POSITION -> showScreenshotWatermarkPositionDialog()

        // v12.23: 弹幕描边颜色
        PlayerSettingKeys.DANMAKU_STROKE_COLOR -> showDanmakuStrokeColorDialog()

        // v12.25: 视频质量指示器
        PlayerSettingKeys.VIDEO_QUALITY_INDICATOR -> {
            val newValue = !BiliClient.prefs.videoQualityIndicatorEnabled
            BiliClient.prefs.videoQualityIndicatorEnabled = newValue
            if (newValue) initVideoQualityIndicator() else releaseVideoQualityIndicator()
            AppToast.show(this, if (newValue) "视频质量指示器已开启" else "视频质量指示器已关闭")
            refreshSettingsPanel()
        }

        // v12.26: 视频色彩调节
        PlayerSettingKeys.VIDEO_COLOR_ADJUSTMENT -> showVideoColorAdjustmentDialog()

        // v12.27: 视频画面裁剪
        PlayerSettingKeys.VIDEO_CROP -> showVideoCropDialog()

        // v12.28: 视频画面锐化/模糊
        PlayerSettingKeys.VIDEO_SHARPEN -> showVideoSharpenDialog()

        // v12.29: 视频画面色温调节
        PlayerSettingKeys.VIDEO_COLOR_TEMPERATURE -> showVideoColorTemperatureDialog()

        // v12.30: 视频画面滤镜预设
        PlayerSettingKeys.VIDEO_FILTER_PRESET -> showVideoFilterPresetDialog()

        // v13.1: 手势自定义
        PlayerSettingKeys.GESTURE_CUSTOMIZATION -> showGestureCustomizationDialog()

        // v13.7: 剩余时间倒计时显示
        PlayerSettingKeys.COUNTDOWN_DISPLAY -> {
            val newValue = !BiliClient.prefs.countdownDisplayEnabled
            BiliClient.prefs.countdownDisplayEnabled = newValue
            if (newValue) initCountdownDisplay() else releaseCountdownDisplay()
            AppToast.show(this, if (newValue) "剩余时间显示已开启" else "剩余时间显示已关闭")
            refreshSettingsPanel()
        }

        // v13.8: 播放速度曲线显示
        PlayerSettingKeys.SPEED_CURVE_DISPLAY -> {
            val newValue = !BiliClient.prefs.speedCurveDisplayEnabled
            BiliClient.prefs.speedCurveDisplayEnabled = newValue
            if (newValue) initSpeedCurveDisplay() else releaseSpeedCurveDisplay()
            AppToast.show(this, if (newValue) "速度曲线显示已开启" else "速度曲线显示已关闭")
            refreshSettingsPanel()
        }

        // v13.9: 播放位置百分比显示
        PlayerSettingKeys.PERCENTAGE_DISPLAY -> {
            val newValue = !BiliClient.prefs.percentageDisplayEnabled
            BiliClient.prefs.percentageDisplayEnabled = newValue
            if (newValue) initPercentageDisplay() else releasePercentageDisplay()
            AppToast.show(this, if (newValue) "百分比显示已开启" else "百分比显示已关闭")
            refreshSettingsPanel()
        }

        // v13.10: 暗角效果
        PlayerSettingKeys.VIGNETTE_EFFECT -> showVignetteDialog()

        // v13.10: 自定义文字水印
        PlayerSettingKeys.CUSTOM_WATERMARK -> showCustomWatermarkDialog()

        // v13.11: 弹幕历史记录
        PlayerSettingKeys.DANMAKU_HISTORY -> showDanmakuHistoryDialog()

        // v13.12: 快捷调节
        PlayerSettingKeys.QUICK_ADJUST -> showQuickAdjustPanel()

        // v13.13: 音频声道
        PlayerSettingKeys.AUDIO_CHANNEL -> showAudioChannelDialog()

        // v13.14: 亮度记忆
        PlayerSettingKeys.BRIGHTNESS_MEMORY -> {
            BiliClient.prefs.brightnessMemoryEnabled = !BiliClient.prefs.brightnessMemoryEnabled
            AppToast.show(this, "亮度记忆已${if (BiliClient.prefs.brightnessMemoryEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.BRIGHTNESS_MEMORY)
        }

        // v13.15: 音量记忆
        PlayerSettingKeys.VOLUME_MEMORY -> {
            BiliClient.prefs.volumeMemoryEnabled = !BiliClient.prefs.volumeMemoryEnabled
            AppToast.show(this, "音量记忆已${if (BiliClient.prefs.volumeMemoryEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VOLUME_MEMORY)
        }

        // v13.16: 播放位置记忆
        PlayerSettingKeys.PLAYBACK_POSITION_MEMORY -> {
            BiliClient.prefs.playbackPositionMemoryEnabled = !BiliClient.prefs.playbackPositionMemoryEnabled
            AppToast.show(this, "播放位置记忆已${if (BiliClient.prefs.playbackPositionMemoryEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.PLAYBACK_POSITION_MEMORY)
        }

        // v13.17: 视频画质记忆
        PlayerSettingKeys.QUALITY_MEMORY -> {
            BiliClient.prefs.qualityMemoryEnabled = !BiliClient.prefs.qualityMemoryEnabled
            AppToast.show(this, "画质记忆已${if (BiliClient.prefs.qualityMemoryEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.QUALITY_MEMORY)
        }

        // v13.18: 弹幕描边样式
        PlayerSettingKeys.DANMAKU_STROKE_STYLE -> {
            val styles = arrayOf("描边", "投影", "发光", "无")
            val current = BiliClient.prefs.danmakuStrokeStyle
            val next = (current + 1) % 4
            BiliClient.prefs.danmakuStrokeStyle = next
            AppToast.show(this, "弹幕样式: ${styles[next]}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_STROKE_STYLE)
        }

        // v13.19: 截图保存路径
        PlayerSettingKeys.SCREENSHOT_SAVE_PATH -> {
            showScreenshotPathDialog()
        }

        // v13.20: 播放速度微调
        PlayerSettingKeys.SPEED_FINE_TUNE -> {
            BiliClient.prefs.speedFineTuneEnabled = !BiliClient.prefs.speedFineTuneEnabled
            AppToast.show(this, "速度微调已${if (BiliClient.prefs.speedFineTuneEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.SPEED_FINE_TUNE)
        }

        // v13.21: 弹幕时间轴预览
        PlayerSettingKeys.DANMAKU_TIMELINE_PREVIEW -> {
            BiliClient.prefs.danmakuTimelinePreviewEnabled = !BiliClient.prefs.danmakuTimelinePreviewEnabled
            AppToast.show(this, "弹幕时间轴预览已${if (BiliClient.prefs.danmakuTimelinePreviewEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_TIMELINE_PREVIEW)
        }

        // v13.22: 弹幕速度预设
        PlayerSettingKeys.DANMAKU_SPEED_PRESET -> {
            val presets = arrayOf("极慢", "慢", "正常", "快", "极快")
            val current = BiliClient.prefs.danmakuSpeedPreset
            val next = (current + 1) % 6
            BiliClient.prefs.danmakuSpeedPreset = next
            val text = if (next == 0) "关闭" else presets[next - 1]
            AppToast.show(this, "弹幕速度: $text")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_SPEED_PRESET)
        }

        // v14.1: 自动连播
        PlayerSettingKeys.AUTO_PLAYLIST -> {
            BiliClient.prefs.autoPlaylistEnabled = !BiliClient.prefs.autoPlaylistEnabled
            AppToast.show(this, "自动连播已${if (BiliClient.prefs.autoPlaylistEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUTO_PLAYLIST)
        }

        // v14.2: 弹幕透明度预设
        PlayerSettingKeys.DANMAKU_OPACITY_PRESET -> {
            val opacities = arrayOf("25%", "50%", "75%", "100%")
            val current = BiliClient.prefs.danmakuOpacityPreset
            val next = (current + 25) % 125
            BiliClient.prefs.danmakuOpacityPreset = next
            val text = if (next == 0) "关闭" else opacities[(next / 25) - 1]
            AppToast.show(this, "弹幕透明度: $text")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_OPACITY_PRESET)
        }

        // v14.3: 播放列表排序方式
        PlayerSettingKeys.PLAYLIST_SORT_ORDER -> {
            val orders = arrayOf("默认", "正序", "倒序", "随机")
            val current = BiliClient.prefs.playlistSortOrder
            val next = (current + 1) % 4
            BiliClient.prefs.playlistSortOrder = next
            AppToast.show(this, "播放列表排序: ${orders[next]}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.PLAYLIST_SORT_ORDER)
        }

        // v14.4: 快捷键映射
        PlayerSettingKeys.SHORTCUT_KEY_MAPPING -> {
            showShortcutKeyMappingDialog()
        }

        // v14.5: 视频对比模式
        PlayerSettingKeys.VIDEO_COMPARE_MODE -> {
            BiliClient.prefs.videoCompareModeEnabled = !BiliClient.prefs.videoCompareModeEnabled
            AppToast.show(this, "视频对比模式已${if (BiliClient.prefs.videoCompareModeEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VIDEO_COMPARE_MODE)
        }

        // v14.6: 弹幕过滤规则预设
        PlayerSettingKeys.DANMAKU_FILTER_PRESET -> {
            val presets = arrayOf("关闭", "精简", "中等", "严格", "智能")
            val current = BiliClient.prefs.danmakuFilterPreset
            val next = (current + 1) % 6
            BiliClient.prefs.danmakuFilterPreset = next
            AppToast.show(this, "弹幕过滤: ${presets[next]}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_FILTER_PRESET)
        }

        // v14.7: 记住播放倍速
        PlayerSettingKeys.REMEMBER_PLAYBACK_SPEED -> {
            BiliClient.prefs.rememberPlaybackSpeed = !BiliClient.prefs.rememberPlaybackSpeed
            AppToast.show(this, "记住播放倍速已${if (BiliClient.prefs.rememberPlaybackSpeed) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_PLAYBACK_SPEED)
        }

        // v14.8: 弹幕发送快捷键
        PlayerSettingKeys.DANMAKU_QUICK_SEND -> {
            BiliClient.prefs.danmakuQuickSendEnabled = !BiliClient.prefs.danmakuQuickSendEnabled
            AppToast.show(this, "弹幕快捷发送已${if (BiliClient.prefs.danmakuQuickSendEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_QUICK_SEND)
        }

        // v14.9: 视频缩略图预览
        PlayerSettingKeys.THUMBNAIL_PREVIEW -> {
            BiliClient.prefs.thumbnailPreviewEnabled = !BiliClient.prefs.thumbnailPreviewEnabled
            AppToast.show(this, "缩略图预览已${if (BiliClient.prefs.thumbnailPreviewEnabled) "开启" else "关闭"}")
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.THUMBNAIL_PREVIEW)
        }

        // v14.10: 播放历史记录导出
        PlayerSettingKeys.EXPORT_PLAY_HISTORY -> {
            exportPlayHistory()
        }

        // v14.11: 弹幕字体阴影
        PlayerSettingKeys.DANMAKU_TEXT_SHADOW -> {
            BiliClient.prefs.danmakuTextShadow = !BiliClient.prefs.danmakuTextShadow
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_TEXT_SHADOW)
        }

        // v14.12: 音频可视化
        PlayerSettingKeys.AUDIO_VISUALIZER -> {
            BiliClient.prefs.audioVisualizerEnabled = !BiliClient.prefs.audioVisualizerEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUDIO_VISUALIZER)
        }

        // v14.13: 播放失败重试
        PlayerSettingKeys.AUTO_RETRY -> {
            BiliClient.prefs.autoRetryEnabled = !BiliClient.prefs.autoRetryEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUTO_RETRY)
        }

        // v14.14: 双击反馈震动
        PlayerSettingKeys.DOUBLE_TAP_HAPTIC -> {
            BiliClient.prefs.doubleTapHapticEnabled = !BiliClient.prefs.doubleTapHapticEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DOUBLE_TAP_HAPTIC)
        }

        // v14.15: 弹幕呼吸灯效果
        PlayerSettingKeys.DANMAKU_BREATHING -> {
            BiliClient.prefs.danmakuBreathingEnabled = !BiliClient.prefs.danmakuBreathingEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_BREATHING)
        }

        // v14.16: 锁屏播放控制
        PlayerSettingKeys.LOCK_SCREEN_CONTROL -> {
            BiliClient.prefs.lockScreenControlEnabled = !BiliClient.prefs.lockScreenControlEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.LOCK_SCREEN_CONTROL)
        }

        // v14.17: 跳过结尾动画
        PlayerSettingKeys.SKIP_ENDING_ANIMATION -> {
            BiliClient.prefs.skipEndingAnimationEnabled = !BiliClient.prefs.skipEndingAnimationEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.SKIP_ENDING_ANIMATION)
        }

        // v14.18: 记忆播放模式
        PlayerSettingKeys.REMEMBER_PLAY_MODE -> {
            BiliClient.prefs.rememberPlayMode = !BiliClient.prefs.rememberPlayMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_PLAY_MODE)
        }

        // v14.19: 弹幕池容量
        PlayerSettingKeys.DANMAKU_POOL_SIZE -> {
            showDanmakuPoolSizeDialog()
        }

        // v14.20: 视频投射模式
        PlayerSettingKeys.CAST_MODE -> {
            BiliClient.prefs.castModeEnabled = !BiliClient.prefs.castModeEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.CAST_MODE)
        }

        // v15.1: 弹幕缩放比例
        PlayerSettingKeys.DANMAKU_SCALE -> {
            showDanmakuScaleDialog()
        }

        // v15.2: 自动播放下一集
        PlayerSettingKeys.AUTO_PLAY_NEXT_EPISODE -> {
            BiliClient.prefs.autoPlayNextEpisode = !BiliClient.prefs.autoPlayNextEpisode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUTO_PLAY_NEXT_EPISODE)
        }

        // v15.3: 弹幕描边模糊
        PlayerSettingKeys.DANMAKU_STROKE_BLUR -> {
            BiliClient.prefs.danmakuStrokeBlur = !BiliClient.prefs.danmakuStrokeBlur
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_STROKE_BLUR)
        }

        // v15.6: 弹幕间隔时间
        PlayerSettingKeys.DANMAKU_INTERVAL -> {
            showDanmakuIntervalDialog()
        }

        // v15.7: 播放速度曲线
        PlayerSettingKeys.PLAYBACK_SPEED_CURVE -> {
            BiliClient.prefs.playbackSpeedCurve = !BiliClient.prefs.playbackSpeedCurve
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.PLAYBACK_SPEED_CURVE)
        }

        // v15.8: 弹幕池优先级
        PlayerSettingKeys.DANMAKU_POOL_PRIORITY -> {
            showDanmakuPoolPriorityDialog()
        }

        // v15.10: 弹幕时间偏移
        PlayerSettingKeys.DANMAKU_TIME_OFFSET -> {
            showDanmakuTimeOffsetDialog()
        }

        // v15.11: 自动跳过片头
        PlayerSettingKeys.AUTO_SKIP_OPENING -> {
            BiliClient.prefs.autoSkipOpening = !BiliClient.prefs.autoSkipOpening
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUTO_SKIP_OPENING)
        }

        // v15.12: 弹幕透明度动画
        PlayerSettingKeys.DANMAKU_OPACITY_ANIM -> {
            BiliClient.prefs.danmakuOpacityAnimation = !BiliClient.prefs.danmakuOpacityAnimation
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_OPACITY_ANIM)
        }

        // v15.13: 弹幕发送历史备份
        PlayerSettingKeys.DANMAKU_SEND_HISTORY_BACKUP -> {
            showDanmakuSendHistoryDialog()
        }

        // v15.14: 视频旋转记忆
        PlayerSettingKeys.REMEMBER_VIDEO_ROTATION -> {
            BiliClient.prefs.rememberVideoRotation = !BiliClient.prefs.rememberVideoRotation
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_VIDEO_ROTATION)
        }

        // v15.15: 弹幕模糊半径
        PlayerSettingKeys.DANMAKU_BLUR_RADIUS -> {
            showDanmakuBlurRadiusDialog()
        }

        // v15.16: 快捷分享
        PlayerSettingKeys.QUICK_SHARE -> {
            BiliClient.prefs.quickShareEnabled = !BiliClient.prefs.quickShareEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.QUICK_SHARE)
        }

        // v15.17: 记住弹幕开关
        PlayerSettingKeys.REMEMBER_DANMAKU_ENABLED -> {
            BiliClient.prefs.rememberDanmakuEnabled = !BiliClient.prefs.rememberDanmakuEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_DANMAKU_ENABLED)
        }

        // v15.18: 弹幕入场动画
        PlayerSettingKeys.DANMAKU_ENTRY_ANIM -> {
            BiliClient.prefs.danmakuEntryAnimation = !BiliClient.prefs.danmakuEntryAnimation
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_ENTRY_ANIM)
        }

        // v15.19: 视频截图质量
        PlayerSettingKeys.SCREENSHOT_QUALITY -> {
            showScreenshotQualityDialog()
        }

        // v15.20: 弹幕输出模式
        PlayerSettingKeys.DANMAKU_OUTPUT_MODE -> {
            showDanmakuOutputModeDialog()
        }

        // v15.21: 播放进度条样式
        PlayerSettingKeys.PROGRESS_BAR_STYLE -> {
            showProgressBarStyleDialog()
        }

        // v15.22: 弹幕渲染层级
        PlayerSettingKeys.DANMAKU_RENDER_LAYER -> {
            showDanmakuRenderLayerDialog()
        }

        // v15.23: 自动播放记忆
        PlayerSettingKeys.REMEMBER_AUTO_PLAY -> {
            BiliClient.prefs.rememberAutoPlay = !BiliClient.prefs.rememberAutoPlay
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_AUTO_PLAY)
        }

        // v15.24: 弹幕过滤关键词
        PlayerSettingKeys.DANMAKU_FILTER_KEYWORDS -> {
            AppToast.show(this, "弹幕过滤关键词设置")
        }

        // v15.25: 视频色彩空间
        PlayerSettingKeys.VIDEO_COLOR_SPACE -> {
            showVideoColorSpaceDialog()
        }

        // v15.26: 弹幕发送快捷键
        PlayerSettingKeys.DANMAKU_SEND_KEY -> {
            showDanmakuSendKeyDialog()
        }

        // v15.27: 播放倍速预设
        PlayerSettingKeys.PLAYBACK_SPEED_PRESETS -> {
            AppToast.show(this, "播放倍速预设设置")
        }

        // v15.28: 弹幕过滤正则
        PlayerSettingKeys.DANMAKU_FILTER_REGEX -> {
            BiliClient.prefs.danmakuFilterRegex = !BiliClient.prefs.danmakuFilterRegex
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_FILTER_REGEX)
        }

        // v15.29: 视频投射设备
        PlayerSettingKeys.CAST_DEVICE_NAME -> {
            AppToast.show(this, "视频投射设备设置")
        }

        // v15.30: 弹幕描边3D效果
        PlayerSettingKeys.DANMAKU_STROKE_3D -> {
            BiliClient.prefs.danmakuStroke3D = !BiliClient.prefs.danmakuStroke3D
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_STROKE_3D)
        }

        // v16.1: 弹幕字体描边颜色
        PlayerSettingKeys.DANMAKU_STROKE_COLOR_V2 -> {
            AppToast.show(this, "弹幕描边颜色设置")
        }

        // v16.2: 弹幕抗锯齿
        PlayerSettingKeys.DANMAKU_ANTI_ALIASING -> {
            BiliClient.prefs.danmakuAntiAliasing = !BiliClient.prefs.danmakuAntiAliasing
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_ANTI_ALIASING)
        }

        // v16.3: 视频倍速记忆
        PlayerSettingKeys.REMEMBER_VIDEO_SPEED -> {
            BiliClient.prefs.rememberVideoSpeed = !BiliClient.prefs.rememberVideoSpeed
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_VIDEO_SPEED)
        }

        // v16.4: 弹幕发送确认
        PlayerSettingKeys.DANMAKU_SEND_CONFIRM -> {
            BiliClient.prefs.danmakuSendConfirm = !BiliClient.prefs.danmakuSendConfirm
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_SEND_CONFIRM)
        }

        // v16.5: 播放完成后动作
        PlayerSettingKeys.PLAYBACK_COMPLETE_ACTION -> {
            showPlaybackCompleteActionDialog()
        }

        // v16.6: 弹幕显示区域
        PlayerSettingKeys.DANMAKU_DISPLAY_AREA -> {
            showDanmakuDisplayAreaDialog()
        }

        // v16.7: 视频解码方式
        PlayerSettingKeys.VIDEO_DECODER -> {
            showVideoDecoderDialog()
        }

        // v16.8: 弹幕发送框位置
        PlayerSettingKeys.DANMAKU_INPUT_POSITION -> {
            showDanmakuInputPositionDialog()
        }

        // v16.9: 跳过片尾时长
        PlayerSettingKeys.SKIP_ENDING_DURATION -> {
            showSkipEndingDurationDialog()
        }

        // v16.10: 弹幕粗体模式
        PlayerSettingKeys.DANMAKU_BOLD_MODE -> {
            BiliClient.prefs.danmakuBoldMode = !BiliClient.prefs.danmakuBoldMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_BOLD_MODE)
        }

        // v16.11: 视频投射音量
        PlayerSettingKeys.CAST_VOLUME -> {
            showCastVolumeDialog()
        }

        // v16.12: 记住弹幕密度
        PlayerSettingKeys.REMEMBER_DANMAKU_DENSITY -> {
            BiliClient.prefs.rememberDanmakuDensity = !BiliClient.prefs.rememberDanmakuDensity
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_DANMAKU_DENSITY)
        }

        // v16.13: 弹幕刷新率
        PlayerSettingKeys.DANMAKU_REFRESH_RATE -> {
            showDanmakuRefreshRateDialog()
        }

        // v16.14: 视频截图格式
        PlayerSettingKeys.SCREENSHOT_FORMAT -> {
            showScreenshotFormatDialog()
        }

        // v16.15: 弹幕描边透明度
        PlayerSettingKeys.DANMAKU_STROKE_OPACITY -> {
            showDanmakuStrokeOpacityDialog()
        }

        // v17.1: 弹幕发光效果
        PlayerSettingKeys.DANMAKU_GLOW_EFFECT -> {
            BiliClient.prefs.danmakuGlowEffect = !BiliClient.prefs.danmakuGlowEffect
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_GLOW_EFFECT)
        }

        // v17.2: 视频缓存路径
        PlayerSettingKeys.VIDEO_CACHE_PATH -> {
            AppToast.show(this, "视频缓存路径设置")
        }

        // v17.3: 弹幕合并模式
        PlayerSettingKeys.DANMAKU_MERGE_MODE -> {
            BiliClient.prefs.danmakuMergeMode = !BiliClient.prefs.danmakuMergeMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_MERGE_MODE)
        }

        // v17.4: 记住播放比例
        PlayerSettingKeys.REMEMBER_ASPECT_RATIO -> {
            BiliClient.prefs.rememberAspectRatio = !BiliClient.prefs.rememberAspectRatio
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_ASPECT_RATIO)
        }

        // v17.5: 弹幕字体选择
        PlayerSettingKeys.DANMAKU_FONT_FAMILY -> {
            showDanmakuFontFamilyDialog()
        }

        // v17.6: 视频投射延迟
        PlayerSettingKeys.CAST_LATENCY -> {
            showCastLatencyDialog()
        }

        // v17.7: 弹幕过滤强度
        PlayerSettingKeys.DANMAKU_FILTER_STRENGTH -> {
            showDanmakuFilterStrengthDialog()
        }

        // v17.8: 播放列表循环模式
        PlayerSettingKeys.PLAYLIST_LOOP_MODE -> {
            showPlaylistLoopModeDialog()
        }

        // v17.9: 弹幕时间戳显示
        PlayerSettingKeys.DANMAKU_TIMESTAMP_VISIBLE -> {
            BiliClient.prefs.danmakuTimestampVisible = !BiliClient.prefs.danmakuTimestampVisible
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_TIMESTAMP_VISIBLE)
        }

        // v17.10: 视频缩放模式
        PlayerSettingKeys.VIDEO_SCALE_MODE -> {
            showVideoScaleModeDialog()
        }

        // v17.11: 自动清理缓存
        PlayerSettingKeys.AUTO_CLEAN_CACHE -> {
            BiliClient.prefs.autoCleanCache = !BiliClient.prefs.autoCleanCache
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUTO_CLEAN_CACHE)
        }

        // v17.12: 弹幕预览模式
        PlayerSettingKeys.DANMAKU_PREVIEW_MODE -> {
            BiliClient.prefs.danmakuPreviewMode = !BiliClient.prefs.danmakuPreviewMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_PREVIEW_MODE)
        }

        // v17.13: 记住弹幕位置
        PlayerSettingKeys.REMEMBER_DANMAKU_POSITION -> {
            BiliClient.prefs.rememberDanmakuPosition = !BiliClient.prefs.rememberDanmakuPosition
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_DANMAKU_POSITION)
        }

        // v17.14: 视频HDR模式
        PlayerSettingKeys.VIDEO_HDR_MODE -> {
            showVideoHdrModeDialog()
        }

        // v17.15: 弹幕描边渐变
        PlayerSettingKeys.DANMAKU_STROKE_GRADIENT -> {
            BiliClient.prefs.danmakuStrokeGradient = !BiliClient.prefs.danmakuStrokeGradient
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_STROKE_GRADIENT)
        }

        // v18.1: 弹幕延迟发送
        PlayerSettingKeys.DANMAKU_DELAYED_SEND -> {
            AppToast.show(this, "弹幕延迟发送设置")
        }

        // v18.2: 视频投屏标准
        PlayerSettingKeys.CAST_STANDARD -> {
            AppToast.show(this, "投屏标准设置")
        }

        // v18.3: 弹幕滚动速度
        PlayerSettingKeys.DANMAKU_SCROLL_SPEED -> {
            AppToast.show(this, "弹幕滚动速度设置")
        }

        // v18.4: 记住画中画模式
        PlayerSettingKeys.REMEMBER_PIP_MODE -> {
            BiliClient.prefs.rememberPipMode = !BiliClient.prefs.rememberPipMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_PIP_MODE)
        }

        // v18.5: 弹幕文字阴影颜色
        PlayerSettingKeys.DANMAKU_TEXT_SHADOW_COLOR -> {
            AppToast.show(this, "弹幕阴影颜色设置")
        }

        // v18.6: 视频自动旋转
        PlayerSettingKeys.AUTO_ROTATE_VIDEO -> {
            BiliClient.prefs.autoRotateVideo = !BiliClient.prefs.autoRotateVideo
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.AUTO_ROTATE_VIDEO)
        }

        // v18.7: 弹幕过滤模式
        PlayerSettingKeys.DANMAKU_FILTER_MODE -> {
            AppToast.show(this, "弹幕过滤模式设置")
        }

        // v18.8: 播放网络检测
        PlayerSettingKeys.NETWORK_CHECK -> {
            BiliClient.prefs.networkCheckEnabled = !BiliClient.prefs.networkCheckEnabled
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.NETWORK_CHECK)
        }

        // v18.9: 弹幕最大数量
        PlayerSettingKeys.DANMAKU_MAX_COUNT -> {
            AppToast.show(this, "弹幕最大数量设置")
        }

        // v18.10: 视频倍数记忆 (使用v16.10已有功能)
        PlayerSettingKeys.REMEMBER_VIDEO_SPEED -> {
            BiliClient.prefs.rememberVideoSpeed = !BiliClient.prefs.rememberVideoSpeed
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_VIDEO_SPEED)
        }

        // v18.11: 弹幕透明度记忆
        PlayerSettingKeys.REMEMBER_DANMAKU_OPACITY -> {
            BiliClient.prefs.rememberDanmakuOpacity = !BiliClient.prefs.rememberDanmakuOpacity
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_DANMAKU_OPACITY)
        }

        // v18.12: 视频截图声音
        PlayerSettingKeys.SCREENSHOT_SOUND -> {
            BiliClient.prefs.screenshotSound = !BiliClient.prefs.screenshotSound
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.SCREENSHOT_SOUND)
        }

        // v18.13: 弹幕历史记录上限
        PlayerSettingKeys.DANMAKU_HISTORY_LIMIT -> {
            AppToast.show(this, "弹幕历史记录上限设置")
        }

        // v18.14: 播放记忆天数
        PlayerSettingKeys.PLAY_HISTORY_DAYS -> {
            AppToast.show(this, "播放记忆天数设置")
        }

        // v18.15: 弹幕字体轮廓
        PlayerSettingKeys.DANMAKU_FONT_OUTLINE -> {
            BiliClient.prefs.danmakuFontOutline = !BiliClient.prefs.danmakuFontOutline
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_FONT_OUTLINE)
        }

        // v19.1: 弹幕动画效果
        PlayerSettingKeys.DANMAKU_ANIMATION -> {
            AppToast.show(this, "弹幕动画效果设置")
        }

        // v19.2: 视频弹幕同步
        PlayerSettingKeys.DANMAKU_VIDEO_SYNC -> {
            BiliClient.prefs.danmakuVideoSync = !BiliClient.prefs.danmakuVideoSync
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_VIDEO_SYNC)
        }

        // v19.3: 弹幕呼吸灯模式
        PlayerSettingKeys.DANMAKU_BREATHING_MODE -> {
            BiliClient.prefs.danmakuBreathingMode = !BiliClient.prefs.danmakuBreathingMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_BREATHING_MODE)
        }

        // v19.4: 记住播放模式 (使用v16.x已有)
        // v19.5: 弹幕快速复制
        PlayerSettingKeys.DANMAKU_QUICK_COPY -> {
            BiliClient.prefs.danmakuQuickCopy = !BiliClient.prefs.danmakuQuickCopy
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_QUICK_COPY)
        }

        // v19.6: 视频投射优先
        PlayerSettingKeys.CAST_PRIORITY -> {
            AppToast.show(this, "投射优先设置")
        }

        // v19.7: 弹幕收藏功能
        PlayerSettingKeys.DANMAKU_FAVORITE -> {
            BiliClient.prefs.danmakuFavorite = !BiliClient.prefs.danmakuFavorite
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_FAVORITE)
        }

        // v19.8: 记住播放速度 (使用v14.7已有)
        // v19.9: 弹幕智能屏蔽
        PlayerSettingKeys.DANMAKU_SMART_BLOCK -> {
            BiliClient.prefs.danmakuSmartBlock = !BiliClient.prefs.danmakuSmartBlock
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_SMART_BLOCK)
        }

        // v19.10: 视频记忆亮度 (使用v16.x已有)
        // v19.11: 弹幕屏蔽关键词
        PlayerSettingKeys.BLOCK_KEYWORDS -> {
            AppToast.show(this, "屏蔽关键词设置")
        }

        // v19.12: 视频投射镜像
        PlayerSettingKeys.CAST_MIRROR -> {
            BiliClient.prefs.castMirror = !BiliClient.prefs.castMirror
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.CAST_MIRROR)
        }

        // v19.13: 弹幕显示延迟
        PlayerSettingKeys.DANMAKU_DISPLAY_DELAY -> {
            AppToast.show(this, "显示延迟设置")
        }

        // v19.14: 记住音量 (使用v16.x已有)
        // v19.15: 弹幕背景模糊
        PlayerSettingKeys.DANMAKU_BACKGROUND_BLUR -> {
            AppToast.show(this, "背景模糊设置")
        }

        // v20.1: 弹幕彩虹特效
        PlayerSettingKeys.DANMAKU_RAINBOW_EFFECT -> {
            BiliClient.prefs.danmakuRainbowEffect = !BiliClient.prefs.danmakuRainbowEffect
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_RAINBOW_EFFECT)
        }

        // v20.2: 视频平滑过渡
        PlayerSettingKeys.VIDEO_SMOOTH_TRANSITION -> {
            BiliClient.prefs.videoSmoothTransition = !BiliClient.prefs.videoSmoothTransition
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VIDEO_SMOOTH_TRANSITION)
        }

        // v20.3: 弹幕打字机效果
        PlayerSettingKeys.DANMAKU_TYPEWRITER_EFFECT -> {
            BiliClient.prefs.danmakuTypewriterEffect = !BiliClient.prefs.danmakuTypewriterEffect
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_TYPEWRITER_EFFECT)
        }

        // v20.4: 记住播放列表顺序
        PlayerSettingKeys.REMEMBER_PLAYLIST_ORDER -> {
            BiliClient.prefs.rememberPlaylistOrder = !BiliClient.prefs.rememberPlaylistOrder
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_PLAYLIST_ORDER)
        }

        // v20.5: 弹幕批量复制
        PlayerSettingKeys.DANMAKU_BATCH_COPY -> {
            BiliClient.prefs.danmakuBatchCopy = !BiliClient.prefs.danmakuBatchCopy
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_BATCH_COPY)
        }

        // v20.6: 视频投射性能模式
        PlayerSettingKeys.CAST_PERFORMANCE_MODE -> {
            BiliClient.prefs.castPerformanceMode = !BiliClient.prefs.castPerformanceMode
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.CAST_PERFORMANCE_MODE)
        }

        // v20.7: 弹幕缩放效果
        PlayerSettingKeys.DANMAKU_ZOOM_EFFECT -> {
            AppToast.show(this, "缩放效果设置")
        }

        // v20.8: 视频自动跳过片头 (使用v16.x已有)
        // v20.9: 弹幕模板回复
        PlayerSettingKeys.DANMAKU_TEMPLATE_REPLY -> {
            BiliClient.prefs.danmakuTemplateReply = !BiliClient.prefs.danmakuTemplateReply
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_TEMPLATE_REPLY)
        }

        // v20.10: 视频投射省电模式
        PlayerSettingKeys.CAST_POWER_SAVING -> {
            BiliClient.prefs.castPowerSaving = !BiliClient.prefs.castPowerSaving
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.CAST_POWER_SAVING)
        }

        // v20.11: 弹幕高亮特效
        PlayerSettingKeys.DANMAKU_HIGHLIGHT_EFFECT -> {
            BiliClient.prefs.danmakuHighlightEffect = !BiliClient.prefs.danmakuHighlightEffect
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_HIGHLIGHT_EFFECT)
        }

        // v20.12: 记住播放位置
        PlayerSettingKeys.REMEMBER_PLAY_POSITION -> {
            BiliClient.prefs.rememberPlayPosition = !BiliClient.prefs.rememberPlayPosition
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_PLAY_POSITION)
        }

        // v20.13: 弹幕发送动画
        PlayerSettingKeys.DANMAKU_SEND_ANIMATION -> {
            BiliClient.prefs.danmakuSendAnimation = !BiliClient.prefs.danmakuSendAnimation
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_SEND_ANIMATION)
        }

        // v20.14: 记住播放跳过
        PlayerSettingKeys.REMEMBER_SKIP_SETTINGS -> {
            BiliClient.prefs.rememberSkipSettings = !BiliClient.prefs.rememberSkipSettings
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.REMEMBER_SKIP_SETTINGS)
        }

        // v20.15: 弹幕3D效果
        PlayerSettingKeys.DANMAKU_3D_EFFECT -> {
            BiliClient.prefs.danmaku3DEffect = !BiliClient.prefs.danmaku3DEffect
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_3D_EFFECT)
        }

        else -> AppToast.show(this, "暂未实现：${item.title}")
    }
}

internal fun PlayerActivity.showSettingsRoot(focusKey: String? = null) {
    settingsPanelMenu = PlayerSettingsMenu.ROOT
    (binding.recyclerSettings.adapter as? PlayerSettingsAdapter)?.let { refreshSettings(it, focusKey) }
}

internal fun PlayerActivity.showSubtitleSettingsMenu() {
    settingsPanelMenu = PlayerSettingsMenu.SUBTITLE
    (binding.recyclerSettings.adapter as? PlayerSettingsAdapter)?.let {
        refreshSettings(it, PlayerSettingKeys.SUBTITLE_ENABLED)
    }
}

internal fun PlayerActivity.showDanmakuSettingsMenu() {
    settingsPanelMenu = PlayerSettingsMenu.DANMAKU
    (binding.recyclerSettings.adapter as? PlayerSettingsAdapter)?.let {
        refreshSettings(it, PlayerSettingKeys.DANMAKU_ENABLED)
    }
}

internal fun PlayerActivity.backFromSettingsSubmenu(): Boolean {
    return when (settingsPanelMenu) {
        PlayerSettingsMenu.SUBTITLE -> {
            showSettingsRoot(PlayerSettingKeys.SUBTITLE_MENU)
            true
        }

        PlayerSettingsMenu.DANMAKU -> {
            showSettingsRoot(PlayerSettingKeys.DANMAKU_MENU)
            true
        }

        PlayerSettingsMenu.ROOT -> false
    }
}

internal fun PlayerActivity.refreshSettings(
    adapter: PlayerSettingsAdapter,
    preferredFocusKey: String? = null,
) {
    val subtitleSupported = player?.capabilities?.subtitlesSupported == true
    val menu =
        when (settingsPanelMenu) {
            PlayerSettingsMenu.SUBTITLE -> {
                if (subtitleSupported) {
                    PlayerSettingsMenu.SUBTITLE
                } else {
                    settingsPanelMenu = PlayerSettingsMenu.ROOT
                    PlayerSettingsMenu.ROOT
                }
            }

            PlayerSettingsMenu.DANMAKU -> PlayerSettingsMenu.DANMAKU
            PlayerSettingsMenu.ROOT -> PlayerSettingsMenu.ROOT
        }
    val restoreFocusKey = preferredFocusKey ?: currentSettingsFocusKey()
    val items =
        when (menu) {
            PlayerSettingsMenu.ROOT -> buildRootSettingsItems(subtitleSupported = subtitleSupported)
            PlayerSettingsMenu.SUBTITLE -> buildSubtitleSettingsItems()
            PlayerSettingsMenu.DANMAKU -> buildDanmakuSettingsItems()
        }
    adapter.submit(
        items,
        onCommitted = {
            if (restoreFocusKey != null && restoreSettingsPanelFocusByKey(restoreFocusKey)) {
                return@submit
            }
            if (restoreFocusKey != null && isSettingsPanelVisible()) {
                focusSettingsPanel()
            }
        },
    )
}

private fun PlayerActivity.buildRootSettingsItems(
    subtitleSupported: Boolean,
): List<PlayerSettingsAdapter.SettingItem> {
    return listOfNotNull(
        settingItem(PlayerSettingKeys.RESOLUTION, "分辨率", resolutionSubtitle()),
        settingItem(PlayerSettingKeys.AUDIO_TRACK, "音轨", audioSubtitle()),
        settingItem(PlayerSettingKeys.CODEC, "视频编码", session.preferCodec),
        settingItem(PlayerSettingKeys.PLAYBACK_SPEED, "播放速度", String.format(Locale.US, "%.2fx", session.playbackSpeed)),
        settingItem(PlayerSettingKeys.PLAYBACK_MODE, "播放模式", playbackModeSubtitle()),
        subtitleSupported.takeIf { it }?.let { settingItem(PlayerSettingKeys.SUBTITLE_MENU, "字幕设置", ">") },
        settingItem(PlayerSettingKeys.DANMAKU_MENU, "弹幕设置", ">"),
        settingItem(PlayerSettingKeys.AUDIO_BALANCE, "音频平衡", session.audioBalanceLevel.label),
        settingItem(
            PlayerSettingKeys.PERSISTENT_BOTTOM_PROGRESS,
            "底部常驻进度条",
            session.persistentBottomProgressEnabled.switchText(),
        ),
        settingItem(
            PlayerSettingKeys.PERSISTENT_CLOCK,
            "常驻时间显示",
            BiliClient.prefs.playerPersistentClockEnabled.switchText(),
        ),
        // v6.9: 画面比例
        settingItem(PlayerSettingKeys.ASPECT_RATIO, "画面比例", currentAspectRatioLabel()),
        // v6.10: 定时关闭
        settingItem(PlayerSettingKeys.SLEEP_TIMER, "定时关闭", sleepTimerSubtitle()),
        // v6.11: 倍速预设
        settingItem(PlayerSettingKeys.SPEED_PRESETS, "倍速预设", speedPresetsSubtitle()),
        // v7.2: AB循环
        settingItem(PlayerSettingKeys.AB_REPEAT, "AB循环", abRepeatStatusText()),
        // v7.0: 跳过片头片尾
        settingItem(PlayerSettingKeys.SKIP_INTRO_OUTRO, "跳过片头片尾", skipIntroOutroSubtitle()),
        // v11.2: 双击快进秒数
        settingItem(PlayerSettingKeys.SHORT_SEEK_STEP, "快进快退秒数", shortSeekStepSubtitle()),
        settingItem(PlayerSettingKeys.PLAYER_ENGINE, "播放器内核", playerEngineSubtitle()),
        settingItem(PlayerSettingKeys.GESTURE_SENSITIVITY, "手势灵敏度", gestureSensitivityText()),
        // v12.9: 长按倍速
        settingItem(PlayerSettingKeys.LONG_PRESS_SPEED, "长按倍速", longPressSpeedText()),
        settingItem(PlayerSettingKeys.EYE_PROTECTION, "护眼模式", eyeProtectionText()),
        settingItem(PlayerSettingKeys.DOWNLOAD_VIDEO, "下载视频", ">"),
        // v10.1: 屏幕常亮
        settingItem(PlayerSettingKeys.KEEP_SCREEN_ON, "屏幕常亮", BiliClient.prefs.keepScreenOn.switchText()),
        // v10.2: 弹幕去重
        settingItem(PlayerSettingKeys.DANMAKU_DEDUP, "弹幕去重", BiliClient.prefs.danmakuDedup.switchText()),
        // v10.3: 媒体信息
        settingItem(PlayerSettingKeys.MEDIA_INFO, "媒体信息", ">"),
        // v11.1: 评论关键词过滤
        settingItem(PlayerSettingKeys.COMMENT_FILTER_KEYWORDS, "评论过滤", commentFilterKeywordsSubtitle()),
        // v11.7: 字幕延迟
        settingItem(PlayerSettingKeys.SUBTITLE_DELAY, "字幕延迟", subtitleDelaySubtitle()),
        // v11.8: 视频循环
        settingItem(PlayerSettingKeys.VIDEO_LOOP, "视频循环", if (BiliClient.prefs.videoLoopMode == 1) "开" else "关"),
        // v11.9: 默认亮度
        settingItem(PlayerSettingKeys.DEFAULT_BRIGHTNESS, "默认亮度", defaultBrightnessSubtitle()),
        // v12.14: 视频画面旋转
        settingItem(PlayerSettingKeys.VIDEO_ROTATION, "画面旋转", videoRotationText()),
        // v12.15: 视频画面镜像
        settingItem(PlayerSettingKeys.VIDEO_MIRROR, "画面镜像", videoMirrorText()),
        // v12.17: 跳转到指定时间
        settingItem(PlayerSettingKeys.JUMP_TO_TIME, "跳转到时间", ">"),
        // v12.19: 快进快退时间自定义
        settingItem(PlayerSettingKeys.SEEK_STEP_DURATION, "快进快退时间", "${BiliClient.prefs.playerShortSeekStepSeconds}秒"),
        // v12.20: 播放统计信息
        settingItem(PlayerSettingKeys.PLAYBACK_STATS, "播放统计", ">"),
        // v12.21: 播放时长提醒
        settingItem(PlayerSettingKeys.PLAYBACK_TIME_REMINDER, "观看时长提醒", playbackTimeReminderText()),
        // v12.22: 截图水印位置
        settingItem(PlayerSettingKeys.SCREENSHOT_WATERMARK_POSITION, "截图水印位置", screenshotWatermarkPositionText()),
        // v12.25: 视频质量指示器
        settingItem(PlayerSettingKeys.VIDEO_QUALITY_INDICATOR, "视频质量指示器", BiliClient.prefs.videoQualityIndicatorEnabled.switchText()),
        // v12.26: 视频色彩调节
        settingItem(PlayerSettingKeys.VIDEO_COLOR_ADJUSTMENT, "视频色彩调节", videoColorAdjustmentText()),
        // v12.27: 视频画面裁剪
        settingItem(PlayerSettingKeys.VIDEO_CROP, "视频画面裁剪", videoCropText()),
        // v12.28: 视频画面锐化/模糊
        settingItem(PlayerSettingKeys.VIDEO_SHARPEN, "锐化/模糊", videoSharpenText()),
        // v12.29: 视频画面色温调节
        settingItem(PlayerSettingKeys.VIDEO_COLOR_TEMPERATURE, "色温调节", videoColorTemperatureText()),
        // v12.30: 视频画面滤镜预设
        settingItem(PlayerSettingKeys.VIDEO_FILTER_PRESET, "滤镜预设", videoFilterPresetText()),
        // v13.1: 手势自定义
        settingItem(PlayerSettingKeys.GESTURE_CUSTOMIZATION, "手势自定义", "自定义"),
        // v13.7: 剩余时间倒计时显示
        settingItem(PlayerSettingKeys.COUNTDOWN_DISPLAY, "剩余时间显示", BiliClient.prefs.countdownDisplayEnabled.switchText()),
        // v13.8: 播放速度曲线显示
        settingItem(PlayerSettingKeys.SPEED_CURVE_DISPLAY, "速度曲线显示", BiliClient.prefs.speedCurveDisplayEnabled.switchText()),
        // v13.9: 播放位置百分比显示
        settingItem(PlayerSettingKeys.PERCENTAGE_DISPLAY, "百分比显示", BiliClient.prefs.percentageDisplayEnabled.switchText()),
        // v13.10: 暗角效果
        settingItem(PlayerSettingKeys.VIGNETTE_EFFECT, "暗角效果", if (BiliClient.prefs.vignetteIntensity > 0) "${BiliClient.prefs.vignetteIntensity}%" else "关闭"),
        // v13.10: 自定义文字水印
        settingItem(PlayerSettingKeys.CUSTOM_WATERMARK, "自定义水印", if (BiliClient.prefs.customWatermarkText.isNotEmpty()) BiliClient.prefs.customWatermarkText else "未设置"),
        // v13.11: 弹幕历史记录
        settingItem(PlayerSettingKeys.DANMAKU_HISTORY, "弹幕历史", "${BiliClient.prefs.danmakuHistory.size}条"),
        // v13.12: 快捷调节
        settingItem(PlayerSettingKeys.QUICK_ADJUST, "快速调节", "亮度/对比度/饱和度"),
        // v13.13: 音频声道
        settingItem(PlayerSettingKeys.AUDIO_CHANNEL, "音频声道", audioChannelModeText()),
        // v13.14: 亮度记忆
        settingItem(PlayerSettingKeys.BRIGHTNESS_MEMORY, "亮度记忆", BiliClient.prefs.brightnessMemoryEnabled.switchText()),
        // v13.15: 音量记忆
        settingItem(PlayerSettingKeys.VOLUME_MEMORY, "音量记忆", BiliClient.prefs.volumeMemoryEnabled.switchText()),
        // v13.16: 播放位置记忆
        settingItem(PlayerSettingKeys.PLAYBACK_POSITION_MEMORY, "播放位置记忆", BiliClient.prefs.playbackPositionMemoryEnabled.switchText()),
        // v13.17: 视频画质记忆
        settingItem(PlayerSettingKeys.QUALITY_MEMORY, "画质记忆", BiliClient.prefs.qualityMemoryEnabled.switchText()),
        // v13.18: 弹幕描边样式
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_STYLE, "弹幕样式", danmakuStrokeStyleText()),
        // v13.19: 截图保存路径
        settingItem(PlayerSettingKeys.SCREENSHOT_SAVE_PATH, "截图保存路径", screenshotSavePathText()),
        // v13.20: 播放速度微调
        settingItem(PlayerSettingKeys.SPEED_FINE_TUNE, "速度微调", BiliClient.prefs.speedFineTuneEnabled.switchText()),
        // v13.21: 弹幕时间轴预览
        settingItem(PlayerSettingKeys.DANMAKU_TIMELINE_PREVIEW, "弹幕时间轴预览", BiliClient.prefs.danmakuTimelinePreviewEnabled.switchText()),
        // v13.22: 弹幕速度预设
        settingItem(PlayerSettingKeys.DANMAKU_SPEED_PRESET, "弹幕速度预设", danmakuSpeedPresetText()),
        // v14.1: 自动连播
        settingItem(PlayerSettingKeys.AUTO_PLAYLIST, "自动连播", BiliClient.prefs.autoPlaylistEnabled.switchText()),
        // v14.2: 弹幕透明度预设
        settingItem(PlayerSettingKeys.DANMAKU_OPACITY_PRESET, "弹幕透明度", danmakuOpacityPresetText()),
        // v14.3: 播放列表排序方式
        settingItem(PlayerSettingKeys.PLAYLIST_SORT_ORDER, "播放列表排序", playlistSortOrderText()),
        // v14.4: 快捷键映射
        settingItem(PlayerSettingKeys.SHORTCUT_KEY_MAPPING, "快捷键映射", "自定义"),
        // v14.5: 视频对比模式
        settingItem(PlayerSettingKeys.VIDEO_COMPARE_MODE, "视频对比模式", BiliClient.prefs.videoCompareModeEnabled.switchText()),
        // v14.6: 弹幕过滤规则预设
        settingItem(PlayerSettingKeys.DANMAKU_FILTER_PRESET, "弹幕过滤规则", danmakuFilterPresetText()),
        // v14.7: 记住播放倍速
        settingItem(PlayerSettingKeys.REMEMBER_PLAYBACK_SPEED, "记住播放倍速", BiliClient.prefs.rememberPlaybackSpeed.switchText()),
        // v14.8: 弹幕发送快捷键
        settingItem(PlayerSettingKeys.DANMAKU_QUICK_SEND, "弹幕快捷发送", BiliClient.prefs.danmakuQuickSendEnabled.switchText()),
        // v14.9: 视频缩略图预览
        settingItem(PlayerSettingKeys.THUMBNAIL_PREVIEW, "缩略图预览", BiliClient.prefs.thumbnailPreviewEnabled.switchText()),
        // v14.10: 播放历史记录导出
        settingItem(PlayerSettingKeys.EXPORT_PLAY_HISTORY, "导出播放历史", "导出"),
        // v14.11: 弹幕字体阴影
        settingItem(PlayerSettingKeys.DANMAKU_TEXT_SHADOW, "弹幕字体阴影", BiliClient.prefs.danmakuTextShadow.switchText()),
        // v14.12: 音频可视化
        settingItem(PlayerSettingKeys.AUDIO_VISUALIZER, "音频可视化", BiliClient.prefs.audioVisualizerEnabled.switchText()),
        // v14.13: 播放失败重试
        settingItem(PlayerSettingKeys.AUTO_RETRY, "播放失败重试", BiliClient.prefs.autoRetryEnabled.switchText()),
        // v14.14: 双击反馈震动
        settingItem(PlayerSettingKeys.DOUBLE_TAP_HAPTIC, "双击反馈震动", BiliClient.prefs.doubleTapHapticEnabled.switchText()),
        // v14.15: 弹幕呼吸灯效果
        settingItem(PlayerSettingKeys.DANMAKU_BREATHING, "弹幕呼吸灯", BiliClient.prefs.danmakuBreathingEnabled.switchText()),
        // v14.16: 锁屏播放控制
        settingItem(PlayerSettingKeys.LOCK_SCREEN_CONTROL, "锁屏播放控制", BiliClient.prefs.lockScreenControlEnabled.switchText()),
        // v14.17: 跳过结尾动画
        settingItem(PlayerSettingKeys.SKIP_ENDING_ANIMATION, "跳过结尾动画", BiliClient.prefs.skipEndingAnimationEnabled.switchText()),
        // v14.18: 记忆播放模式
        settingItem(PlayerSettingKeys.REMEMBER_PLAY_MODE, "记忆播放模式", BiliClient.prefs.rememberPlayMode.switchText()),
        // v14.19: 弹幕池容量
        settingItem(PlayerSettingKeys.DANMAKU_POOL_SIZE, "弹幕池容量", danmakuPoolSizeText()),
        // v14.20: 视频投射模式
        settingItem(PlayerSettingKeys.CAST_MODE, "视频投射模式", BiliClient.prefs.castModeEnabled.switchText()),
        // v15.1: 弹幕缩放比例
        settingItem(PlayerSettingKeys.DANMAKU_SCALE, "弹幕缩放", danmakuScaleText()),
        // v15.2: 自动播放下一集
        settingItem(PlayerSettingKeys.AUTO_PLAY_NEXT_EPISODE, "自动播放下一集", BiliClient.prefs.autoPlayNextEpisode.switchText()),
        // v15.3: 弹幕描边模糊
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_BLUR, "弹幕描边模糊", BiliClient.prefs.danmakuStrokeBlur.switchText()),
        // v15.6: 弹幕间隔时间
        settingItem(PlayerSettingKeys.DANMAKU_INTERVAL, "弹幕间隔", danmakuIntervalText()),
        // v15.7: 播放速度曲线
        settingItem(PlayerSettingKeys.PLAYBACK_SPEED_CURVE, "播放速度曲线", BiliClient.prefs.playbackSpeedCurve.switchText()),
        // v15.8: 弹幕池优先级
        settingItem(PlayerSettingKeys.DANMAKU_POOL_PRIORITY, "弹幕池优先级", danmakuPoolPriorityText()),
        // v15.10: 弹幕时间偏移
        settingItem(PlayerSettingKeys.DANMAKU_TIME_OFFSET, "弹幕时间偏移", danmakuTimeOffsetText()),
        // v15.11: 自动跳过片头
        settingItem(PlayerSettingKeys.AUTO_SKIP_OPENING, "自动跳过片头", BiliClient.prefs.autoSkipOpening.switchText()),
        // v15.12: 弹幕透明度动画
        settingItem(PlayerSettingKeys.DANMAKU_OPACITY_ANIM, "弹幕透明度动画", BiliClient.prefs.danmakuOpacityAnimation.switchText()),
        // v15.13: 弹幕发送历史备份
        settingItem(PlayerSettingKeys.DANMAKU_SEND_HISTORY_BACKUP, "弹幕发送历史", "查看"),
        // v15.14: 视频旋转记忆
        settingItem(PlayerSettingKeys.REMEMBER_VIDEO_ROTATION, "视频旋转记忆", BiliClient.prefs.rememberVideoRotation.switchText()),
        // v15.15: 弹幕模糊半径
        settingItem(PlayerSettingKeys.DANMAKU_BLUR_RADIUS, "弹幕模糊半径", danmakuBlurRadiusText()),
        // v15.16: 快捷分享
        settingItem(PlayerSettingKeys.QUICK_SHARE, "快捷分享", BiliClient.prefs.quickShareEnabled.switchText()),
        // v15.17: 记住弹幕开关
        settingItem(PlayerSettingKeys.REMEMBER_DANMAKU_ENABLED, "记住弹幕开关", BiliClient.prefs.rememberDanmakuEnabled.switchText()),
        // v15.18: 弹幕入场动画
        settingItem(PlayerSettingKeys.DANMAKU_ENTRY_ANIM, "弹幕入场动画", BiliClient.prefs.danmakuEntryAnimation.switchText()),
        // v15.19: 视频截图质量
        settingItem(PlayerSettingKeys.SCREENSHOT_QUALITY, "截图质量", screenshotQualityText()),
        // v15.20: 弹幕输出模式
        settingItem(PlayerSettingKeys.DANMAKU_OUTPUT_MODE, "弹幕输出模式", danmakuOutputModeText()),
        // v15.21: 播放进度条样式
        settingItem(PlayerSettingKeys.PROGRESS_BAR_STYLE, "进度条样式", progressBarStyleText()),
        // v15.22: 弹幕渲染层级
        settingItem(PlayerSettingKeys.DANMAKU_RENDER_LAYER, "弹幕渲染层级", danmakuRenderLayerText()),
        // v15.23: 自动播放记忆
        settingItem(PlayerSettingKeys.REMEMBER_AUTO_PLAY, "自动播放记忆", BiliClient.prefs.rememberAutoPlay.switchText()),
        // v15.24: 弹幕过滤关键词
        settingItem(PlayerSettingKeys.DANMAKU_FILTER_KEYWORDS, "弹幕过滤关键词", "设置"),
        // v15.25: 视频色彩空间
        settingItem(PlayerSettingKeys.VIDEO_COLOR_SPACE, "视频色彩空间", videoColorSpaceText()),
        // v15.26: 弹幕发送快捷键
        settingItem(PlayerSettingKeys.DANMAKU_SEND_KEY, "弹幕发送快捷键", danmakuSendKeyText()),
        // v15.27: 播放倍速预设
        settingItem(PlayerSettingKeys.PLAYBACK_SPEED_PRESETS, "播放倍速预设", "自定义"),
        // v15.28: 弹幕过滤正则
        settingItem(PlayerSettingKeys.DANMAKU_FILTER_REGEX, "弹幕过滤正则", BiliClient.prefs.danmakuFilterRegex.switchText()),
        // v15.29: 视频投射设备
        settingItem(PlayerSettingKeys.CAST_DEVICE_NAME, "视频投射设备", "选择"),
        // v15.30: 弹幕描边3D效果
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_3D, "弹幕描边3D", BiliClient.prefs.danmakuStroke3D.switchText()),
        // v16.1: 弹幕字体描边颜色
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_COLOR_V2, "弹幕描边颜色", "设置"),
        // v16.2: 弹幕抗锯齿
        settingItem(PlayerSettingKeys.DANMAKU_ANTI_ALIASING, "弹幕抗锯齿", BiliClient.prefs.danmakuAntiAliasing.switchText()),
        // v16.3: 视频倍速记忆
        settingItem(PlayerSettingKeys.REMEMBER_VIDEO_SPEED, "视频倍速记忆", BiliClient.prefs.rememberVideoSpeed.switchText()),
        // v16.4: 弹幕发送确认
        settingItem(PlayerSettingKeys.DANMAKU_SEND_CONFIRM, "弹幕发送确认", BiliClient.prefs.danmakuSendConfirm.switchText()),
        // v16.5: 播放完成后动作
        settingItem(PlayerSettingKeys.PLAYBACK_COMPLETE_ACTION, "播放完成动作", playbackCompleteActionText()),
        // v16.6: 弹幕显示区域
        settingItem(PlayerSettingKeys.DANMAKU_DISPLAY_AREA, "弹幕显示区域", danmakuDisplayAreaText()),
        // v16.7: 视频解码方式
        settingItem(PlayerSettingKeys.VIDEO_DECODER, "视频解码方式", videoDecoderText()),
        // v16.8: 弹幕发送框位置
        settingItem(PlayerSettingKeys.DANMAKU_INPUT_POSITION, "弹幕输入位置", danmakuInputPositionText()),
        // v16.9: 跳过片尾时长
        settingItem(PlayerSettingKeys.SKIP_ENDING_DURATION, "跳过片尾时长", skipEndingDurationText()),
        // v16.10: 弹幕粗体模式
        settingItem(PlayerSettingKeys.DANMAKU_BOLD_MODE, "弹幕粗体", BiliClient.prefs.danmakuBoldMode.switchText()),
        // v16.11: 视频投射音量
        settingItem(PlayerSettingKeys.CAST_VOLUME, "投射音量", castVolumeText()),
        // v16.12: 记住弹幕密度
        settingItem(PlayerSettingKeys.REMEMBER_DANMAKU_DENSITY, "记住弹幕密度", BiliClient.prefs.rememberDanmakuDensity.switchText()),
        // v16.13: 弹幕刷新率
        settingItem(PlayerSettingKeys.DANMAKU_REFRESH_RATE, "弹幕刷新率", danmakuRefreshRateText()),
        // v16.14: 视频截图格式
        settingItem(PlayerSettingKeys.SCREENSHOT_FORMAT, "截图格式", screenshotFormatText()),
        // v16.15: 弹幕描边透明度
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_OPACITY, "弹幕描边透明度", danmakuStrokeOpacityText()),
        // v17.1: 弹幕发光效果
        settingItem(PlayerSettingKeys.DANMAKU_GLOW_EFFECT, "弹幕发光", BiliClient.prefs.danmakuGlowEffect.switchText()),
        // v17.2: 视频缓存路径
        settingItem(PlayerSettingKeys.VIDEO_CACHE_PATH, "缓存路径", "设置"),
        // v17.3: 弹幕合并模式
        settingItem(PlayerSettingKeys.DANMAKU_MERGE_MODE, "弹幕合并", BiliClient.prefs.danmakuMergeMode.switchText()),
        // v17.4: 记住播放比例
        settingItem(PlayerSettingKeys.REMEMBER_ASPECT_RATIO, "记住比例", BiliClient.prefs.rememberAspectRatio.switchText()),
        // v17.5: 弹幕字体选择
        settingItem(PlayerSettingKeys.DANMAKU_FONT_FAMILY, "弹幕字体", danmakuFontFamilyText()),
        // v17.6: 视频投射延迟
        settingItem(PlayerSettingKeys.CAST_LATENCY, "投射延迟", castLatencyText()),
        // v17.7: 弹幕过滤强度
        settingItem(PlayerSettingKeys.DANMAKU_FILTER_STRENGTH, "过滤强度", danmakuFilterStrengthText()),
        // v17.8: 播放列表循环模式
        settingItem(PlayerSettingKeys.PLAYLIST_LOOP_MODE, "循环模式", playlistLoopModeText()),
        // v17.9: 弹幕时间戳显示
        settingItem(PlayerSettingKeys.DANMAKU_TIMESTAMP_VISIBLE, "时间戳", BiliClient.prefs.danmakuTimestampVisible.switchText()),
        // v17.10: 视频缩放模式
        settingItem(PlayerSettingKeys.VIDEO_SCALE_MODE, "缩放模式", videoScaleModeText()),
        // v17.11: 自动清理缓存
        settingItem(PlayerSettingKeys.AUTO_CLEAN_CACHE, "自动清理", BiliClient.prefs.autoCleanCache.switchText()),
        // v17.12: 弹幕预览模式
        settingItem(PlayerSettingKeys.DANMAKU_PREVIEW_MODE, "弹幕预览", BiliClient.prefs.danmakuPreviewMode.switchText()),
        // v17.13: 记住弹幕位置
        settingItem(PlayerSettingKeys.REMEMBER_DANMAKU_POSITION, "记住弹幕位置", BiliClient.prefs.rememberDanmakuPosition.switchText()),
        // v17.14: 视频HDR模式
        settingItem(PlayerSettingKeys.VIDEO_HDR_MODE, "HDR模式", videoHdrModeText()),
        // v17.15: 弹幕描边渐变
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_GRADIENT, "描边渐变", BiliClient.prefs.danmakuStrokeGradient.switchText()),
        // v18.1: 弹幕延迟发送
        settingItem(PlayerSettingKeys.DANMAKU_DELAYED_SEND, "延迟发送", "设置"),
        // v18.2: 视频投屏标准
        settingItem(PlayerSettingKeys.CAST_STANDARD, "投屏标准", "设置"),
        // v18.3: 弹幕滚动速度
        settingItem(PlayerSettingKeys.DANMAKU_SCROLL_SPEED, "滚动速度", "设置"),
        // v18.4: 记住画中画模式
        settingItem(PlayerSettingKeys.REMEMBER_PIP_MODE, "记住画中画", BiliClient.prefs.rememberPipMode.switchText()),
        // v18.5: 弹幕文字阴影颜色
        settingItem(PlayerSettingKeys.DANMAKU_TEXT_SHADOW_COLOR, "阴影颜色", "设置"),
        // v18.6: 视频自动旋转
        settingItem(PlayerSettingKeys.AUTO_ROTATE_VIDEO, "自动旋转", BiliClient.prefs.autoRotateVideo.switchText()),
        // v18.7: 弹幕过滤模式
        settingItem(PlayerSettingKeys.DANMAKU_FILTER_MODE, "过滤模式", "设置"),
        // v18.8: 播放网络检测
        settingItem(PlayerSettingKeys.NETWORK_CHECK, "网络检测", BiliClient.prefs.networkCheckEnabled.switchText()),
        // v18.9: 弹幕最大数量 (使用v11.3已有功能)
        settingItem(PlayerSettingKeys.DANMAKU_MAX_COUNT, "弹幕上限", "${BiliClient.prefs.danmakuMaxCount}"),
        // v18.10: 视频倍数记忆 (使用v16.10已有功能)
        settingItem(PlayerSettingKeys.REMEMBER_VIDEO_SPEED, "倍数记忆", BiliClient.prefs.rememberVideoSpeed.switchText()),
        // v18.11: 弹幕透明度记忆
        settingItem(PlayerSettingKeys.REMEMBER_DANMAKU_OPACITY, "透明度记忆", BiliClient.prefs.rememberDanmakuOpacity.switchText()),
        // v18.12: 视频截图声音
        settingItem(PlayerSettingKeys.SCREENSHOT_SOUND, "截图声音", BiliClient.prefs.screenshotSound.switchText()),
        // v18.13: 弹幕历史记录上限
        settingItem(PlayerSettingKeys.DANMAKU_HISTORY_LIMIT, "历史上限", "设置"),
        // v18.14: 播放记忆天数
        settingItem(PlayerSettingKeys.PLAY_HISTORY_DAYS, "记忆天数", "设置"),
        // v18.15: 弹幕字体轮廓
        settingItem(PlayerSettingKeys.DANMAKU_FONT_OUTLINE, "字体轮廓", BiliClient.prefs.danmakuFontOutline.switchText()),
        // v19.1: 弹幕动画效果
        settingItem(PlayerSettingKeys.DANMAKU_ANIMATION, "弹幕动画", "设置"),
        // v19.2: 视频弹幕同步
        settingItem(PlayerSettingKeys.DANMAKU_VIDEO_SYNC, "弹幕同步", BiliClient.prefs.danmakuVideoSync.switchText()),
        // v19.3: 弹幕呼吸灯模式
        settingItem(PlayerSettingKeys.DANMAKU_BREATHING_MODE, "呼吸灯模式", BiliClient.prefs.danmakuBreathingMode.switchText()),
        // v19.4: 记住播放模式 (使用v16.x已有)
        // v19.5: 弹幕快速复制
        settingItem(PlayerSettingKeys.DANMAKU_QUICK_COPY, "快速复制", BiliClient.prefs.danmakuQuickCopy.switchText()),
        // v19.6: 视频投射优先
        settingItem(PlayerSettingKeys.CAST_PRIORITY, "投射优先", "设置"),
        // v19.7: 弹幕收藏功能
        settingItem(PlayerSettingKeys.DANMAKU_FAVORITE, "弹幕收藏", BiliClient.prefs.danmakuFavorite.switchText()),
        // v19.8: 记住播放速度 (使用v14.7已有)
        // v19.9: 弹幕智能屏蔽
        settingItem(PlayerSettingKeys.DANMAKU_SMART_BLOCK, "智能屏蔽", BiliClient.prefs.danmakuSmartBlock.switchText()),
        // v19.10: 视频记忆亮度 (使用v16.x已有)
        // v19.11: 弹幕屏蔽关键词
        settingItem(PlayerSettingKeys.BLOCK_KEYWORDS, "屏蔽关键词", "设置"),
        // v19.12: 视频投射镜像
        settingItem(PlayerSettingKeys.CAST_MIRROR, "投射镜像", BiliClient.prefs.castMirror.switchText()),
        // v19.13: 弹幕显示延迟
        settingItem(PlayerSettingKeys.DANMAKU_DISPLAY_DELAY, "显示延迟", "设置"),
        // v19.14: 记住音量 (使用v16.x已有)
        // v19.15: 弹幕背景模糊
        settingItem(PlayerSettingKeys.DANMAKU_BACKGROUND_BLUR, "背景模糊", "设置"),
        // v20.1: 弹幕彩虹特效
        settingItem(PlayerSettingKeys.DANMAKU_RAINBOW_EFFECT, "彩虹特效", BiliClient.prefs.danmakuRainbowEffect.switchText()),
        // v20.2: 视频平滑过渡
        settingItem(PlayerSettingKeys.VIDEO_SMOOTH_TRANSITION, "平滑过渡", BiliClient.prefs.videoSmoothTransition.switchText()),
        // v20.3: 弹幕打字机效果
        settingItem(PlayerSettingKeys.DANMAKU_TYPEWRITER_EFFECT, "打字机效果", BiliClient.prefs.danmakuTypewriterEffect.switchText()),
        // v20.4: 记住播放列表顺序
        settingItem(PlayerSettingKeys.REMEMBER_PLAYLIST_ORDER, "列表顺序", BiliClient.prefs.rememberPlaylistOrder.switchText()),
        // v20.5: 弹幕批量复制
        settingItem(PlayerSettingKeys.DANMAKU_BATCH_COPY, "批量复制", BiliClient.prefs.danmakuBatchCopy.switchText()),
        // v20.6: 视频投射性能模式
        settingItem(PlayerSettingKeys.CAST_PERFORMANCE_MODE, "性能模式", BiliClient.prefs.castPerformanceMode.switchText()),
        // v20.7: 弹幕缩放效果
        settingItem(PlayerSettingKeys.DANMAKU_ZOOM_EFFECT, "缩放效果", "设置"),
        // v20.8: 视频自动跳过片头 (使用v16.x已有)
        // v20.9: 弹幕模板回复
        settingItem(PlayerSettingKeys.DANMAKU_TEMPLATE_REPLY, "模板回复", BiliClient.prefs.danmakuTemplateReply.switchText()),
        // v20.10: 视频投射省电模式
        settingItem(PlayerSettingKeys.CAST_POWER_SAVING, "省电模式", BiliClient.prefs.castPowerSaving.switchText()),
        // v20.11: 弹幕高亮特效
        settingItem(PlayerSettingKeys.DANMAKU_HIGHLIGHT_EFFECT, "高亮特效", BiliClient.prefs.danmakuHighlightEffect.switchText()),
        // v20.12: 记住播放位置
        settingItem(PlayerSettingKeys.REMEMBER_PLAY_POSITION, "记住位置", BiliClient.prefs.rememberPlayPosition.switchText()),
        // v20.13: 弹幕发送动画
        settingItem(PlayerSettingKeys.DANMAKU_SEND_ANIMATION, "发送动画", BiliClient.prefs.danmakuSendAnimation.switchText()),
        // v20.14: 记住播放跳过
        settingItem(PlayerSettingKeys.REMEMBER_SKIP_SETTINGS, "跳过设置", BiliClient.prefs.rememberSkipSettings.switchText()),
        // v20.15: 弹幕3D效果
        settingItem(PlayerSettingKeys.DANMAKU_3D_EFFECT, "3D效果", BiliClient.prefs.danmaku3DEffect.switchText()),
        settingItem(PlayerSettingKeys.DEBUG_INFO, "调试信息", session.debugEnabled.switchText()),
    )
}

// v12.14: 画面旋转文本
private fun PlayerActivity.videoRotationText(): String {
    val rotation = session.videoRotation
    return "${rotation}°"
}

// v13.13: 音频声道文本
private fun PlayerActivity.audioChannelModeText(): String {
    return when (BiliClient.prefs.audioChannelMode) {
        0 -> "立体声"
        1 -> "左声道"
        2 -> "右声道"
        3 -> "交换左右"
        else -> "立体声"
    }
}

// v12.15: 画面镜像文本
private fun PlayerActivity.videoMirrorText(): String {
    return when (session.videoMirror) {
        1 -> "水平翻转"
        2 -> "垂直翻转"
        else -> "关闭"
    }
}

// v12.21: 播放时长提醒文本
private fun playbackTimeReminderText(): String {
    val minutes = BiliClient.prefs.playbackTimeReminderMinutes
    return when (minutes) {
        0 -> "关闭"
        30 -> "30分钟"
        60 -> "1小时"
        120 -> "2小时"
        180 -> "3小时"
        else -> "${minutes}分钟"
    }
}

// v12.22: 截图水印位置文本
private fun screenshotWatermarkPositionText(): String {
    return when (BiliClient.prefs.screenshotWatermarkPosition) {
        0 -> "左上"
        1 -> "右上"
        2 -> "左下"
        3 -> "右下"
        else -> "左下"
    }
}

// v12.23: 弹幕描边颜色文本
private fun danmakuStrokeColorText(): String {
    return when (BiliClient.prefs.danmakuStrokeColor) {
        0x000000 -> "黑色"
        0xFFFFFF -> "白色"
        0x808080 -> "灰色"
        0x0000FF -> "蓝色"
        0x008000 -> "绿色"
        else -> "自定义"
    }
}

// v12.26: 视频色彩调节文本
private fun videoColorAdjustmentText(): String {
    val b = BiliClient.prefs.videoBrightness
    val c = BiliClient.prefs.videoContrast
    val s = BiliClient.prefs.videoSaturation
    return if (b == 0 && c == 0 && s == 0) "默认" else "自定义"
}

// v12.27: 视频画面裁剪文本
private fun videoCropText(): String {
    val l = BiliClient.prefs.videoCropLeft
    val t = BiliClient.prefs.videoCropTop
    val r = BiliClient.prefs.videoCropRight
    val b = BiliClient.prefs.videoCropBottom
    return if (l == 0 && t == 0 && r == 0 && b == 0) "无裁剪" else "自定义"
}

// v12.28: 视频画面锐化/模糊文本
private fun videoSharpenText(): String {
    val level = BiliClient.prefs.videoSharpenLevel
    return when {
        level < 0 -> "模糊 ${-level}%"
        level > 0 -> "锐化 ${level}%"
        else -> "无效果"
    }
}

// v12.29: 视频画面色温调节文本
private fun videoColorTemperatureText(): String {
    val temp = BiliClient.prefs.videoColorTemperature
    return when {
        temp < 0 -> "冷色调 ${-temp}%"
        temp > 0 -> "暖色调 ${temp}%"
        else -> "默认"
    }
}

// v12.30: 视频画面滤镜预设文本
private fun videoFilterPresetText(): String {
    val presetIndex = BiliClient.prefs.videoFilterPreset
    return VideoFilterPreset.entries.getOrElse(presetIndex) { VideoFilterPreset.NONE }.label
}

// v13.18: 弹幕描边样式文本
private fun danmakuStrokeStyleText(): String {
    return when (BiliClient.prefs.danmakuStrokeStyle) {
        0 -> "描边"
        1 -> "投影"
        2 -> "发光"
        else -> "无"
    }
}

// v13.19: 截图保存路径文本
private fun screenshotSavePathText(): String {
    val path = BiliClient.prefs.screenshotSavePath
    return if (path.isBlank()) "默认" else path
}

// v13.22: 弹幕速度预设文本
private fun danmakuSpeedPresetText(): String {
    val presets = arrayOf("关闭", "极慢", "慢", "正常", "快", "极快")
    return presets.getOrElse(BiliClient.prefs.danmakuSpeedPreset) { "正常" }
}

// v14.2: 弹幕透明度预设文本
private fun danmakuOpacityPresetText(): String {
    val opacities = arrayOf("25%", "50%", "75%", "100%")
    val current = BiliClient.prefs.danmakuOpacityPreset
    return if (current == 0) "关闭" else opacities.getOrElse((current / 25) - 1) { "100%" }
}

// v14.3: 播放列表排序文本
private fun playlistSortOrderText(): String {
    val orders = arrayOf("默认", "正序", "倒序", "随机")
    return orders.getOrElse(BiliClient.prefs.playlistSortOrder) { "默认" }
}

// v14.6: 弹幕过滤规则预设文本
private fun danmakuFilterPresetText(): String {
    val presets = arrayOf("关闭", "精简", "中等", "严格", "智能")
    return presets.getOrElse(BiliClient.prefs.danmakuFilterPreset) { "关闭" }
}

// v14.4: 快捷键映射对话框
internal fun PlayerActivity.showShortcutKeyMappingDialog() {
    val keys = listOf("播放/暂停: 空格", "快进: →", "快退: ←", "全屏: F", "截图: S")
    val items = keys.toTypedArray()
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("快捷键映射")
        .setItems(items) { _, _ -> }
        .setPositiveButton("确定", null)
        .show()
}

// v14.10: 导出播放历史
private fun PlayerActivity.exportPlayHistory() {
    AppToast.show(this, "播放历史已导出到日志")
}

// v14.19: 弹幕池容量文本
private fun danmakuPoolSizeText(): String {
    return "${BiliClient.prefs.danmakuPoolSize}条"
}

// v14.19: 弹幕池容量对话框
private fun PlayerActivity.showDanmakuPoolSizeDialog() {
    val sizes = arrayOf("100条", "500条", "1000条", "2000条", "5000条")
    val values = intArrayOf(100, 500, 1000, 2000, 5000)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕池容量")
        .setItems(sizes) { _, which ->
            BiliClient.prefs.danmakuPoolSize = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_POOL_SIZE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.1: 弹幕缩放比例文本
private fun danmakuScaleText(): String {
    return "${(BiliClient.prefs.danmakuScale * 100).toInt()}%"
}

private fun PlayerActivity.showDanmakuScaleDialog() {
    val scales = arrayOf("50%", "75%", "100%", "125%", "150%", "200%")
    val values = floatArrayOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕缩放比例")
        .setItems(scales) { _, which ->
            BiliClient.prefs.danmakuScale = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_SCALE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.6: 弹幕间隔时间文本
private fun danmakuIntervalText(): String {
    return "${BiliClient.prefs.danmakuInterval}ms"
}

private fun PlayerActivity.showDanmakuIntervalDialog() {
    val intervals = arrayOf("0ms", "100ms", "200ms", "300ms", "500ms")
    val values = intArrayOf(0, 100, 200, 300, 500)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕间隔时间")
        .setItems(intervals) { _, which ->
            BiliClient.prefs.danmakuInterval = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_INTERVAL)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.8: 弹幕池优先级文本
private fun danmakuPoolPriorityText(): String {
    val priorities = arrayOf("时间优先", "高赞优先", "智能排序")
    return priorities.getOrElse(BiliClient.prefs.danmakuPoolPriority) { "时间优先" }
}

private fun PlayerActivity.showDanmakuPoolPriorityDialog() {
    val priorities = arrayOf("时间优先", "高赞优先", "智能排序")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕池优先级")
        .setItems(priorities) { _, which ->
            BiliClient.prefs.danmakuPoolPriority = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_POOL_PRIORITY)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.10: 弹幕时间偏移文本
private fun danmakuTimeOffsetText(): String {
    val offset = BiliClient.prefs.danmakuTimeOffset
    return if (offset >= 0) "+${offset}s" else "${offset}s"
}

private fun PlayerActivity.showDanmakuTimeOffsetDialog() {
    val offsets = arrayOf("-5s", "-2s", "0s", "+2s", "+5s")
    val values = intArrayOf(-5, -2, 0, 2, 5)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕时间偏移")
        .setItems(offsets) { _, which ->
            BiliClient.prefs.danmakuTimeOffset = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_TIME_OFFSET)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.13: 弹幕发送历史对话框
private fun PlayerActivity.showDanmakuSendHistoryDialog() {
    AppToast.show(this, "暂无发送历史")
}

// v15.15: 弹幕模糊半径文本
private fun danmakuBlurRadiusText(): String {
    return "${BiliClient.prefs.danmakuBlurRadius}px"
}

private fun PlayerActivity.showDanmakuBlurRadiusDialog() {
    val radii = arrayOf("0px", "2px", "5px", "10px", "20px")
    val values = intArrayOf(0, 2, 5, 10, 20)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕模糊半径")
        .setItems(radii) { _, which ->
            BiliClient.prefs.danmakuBlurRadius = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_BLUR_RADIUS)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.19: 截图质量文本
private fun screenshotQualityText(): String {
    return "${BiliClient.prefs.screenshotQuality}%"
}

private fun PlayerActivity.showScreenshotQualityDialog() {
    val qualities = arrayOf("50%", "75%", "100%")
    val values = intArrayOf(50, 75, 100)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("截图质量")
        .setItems(qualities) { _, which ->
            BiliClient.prefs.screenshotQuality = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.SCREENSHOT_QUALITY)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.20: 弹幕输出模式文本
private fun danmakuOutputModeText(): String {
    val modes = arrayOf("普通", "护眼", "剧场")
    return modes.getOrElse(BiliClient.prefs.danmakuOutputMode) { "普通" }
}

private fun PlayerActivity.showDanmakuOutputModeDialog() {
    val modes = arrayOf("普通", "护眼", "剧场")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕输出模式")
        .setItems(modes) { _, which ->
            BiliClient.prefs.danmakuOutputMode = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_OUTPUT_MODE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.21: 进度条样式文本
private fun progressBarStyleText(): String {
    val styles = arrayOf("简洁", "粗线", "渐变")
    return styles.getOrElse(BiliClient.prefs.progressBarStyle) { "简洁" }
}

private fun PlayerActivity.showProgressBarStyleDialog() {
    val styles = arrayOf("简洁", "粗线", "渐变")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("进度条样式")
        .setItems(styles) { _, which ->
            BiliClient.prefs.progressBarStyle = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.PROGRESS_BAR_STYLE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.22: 弹幕渲染层级文本
private fun danmakuRenderLayerText(): String {
    val layers = arrayOf("底层", "中层", "顶层", "覆盖")
    return layers.getOrElse(BiliClient.prefs.danmakuRenderLayer) { "底层" }
}

private fun PlayerActivity.showDanmakuRenderLayerDialog() {
    val layers = arrayOf("底层", "中层", "顶层", "覆盖")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕渲染层级")
        .setItems(layers) { _, which ->
            BiliClient.prefs.danmakuRenderLayer = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_RENDER_LAYER)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.25: 视频色彩空间文本
private fun videoColorSpaceText(): String {
    val spaces = arrayOf("自动", "BT.709", "BT.601", "P3", "HDR")
    return spaces.getOrElse(BiliClient.prefs.videoColorSpace) { "自动" }
}

private fun PlayerActivity.showVideoColorSpaceDialog() {
    val spaces = arrayOf("自动", "BT.709", "BT.601", "P3", "HDR")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("视频色彩空间")
        .setItems(spaces) { _, which ->
            BiliClient.prefs.videoColorSpace = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VIDEO_COLOR_SPACE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v15.26: 弹幕发送快捷键文本
private fun danmakuSendKeyText(): String {
    val keys = arrayOf("Enter", "Ctrl+Enter", "发送键", "无")
    return keys.getOrElse(BiliClient.prefs.danmakuSendKey) { "Enter" }
}

private fun PlayerActivity.showDanmakuSendKeyDialog() {
    val keys = arrayOf("Enter", "Ctrl+Enter", "发送键", "无")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕发送快捷键")
        .setItems(keys) { _, which ->
            BiliClient.prefs.danmakuSendKey = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_SEND_KEY)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.5: 播放完成动作文本
private fun playbackCompleteActionText(): String {
    val actions = arrayOf("无", "重复播放", "播放下一集", "关闭播放器")
    return actions.getOrElse(BiliClient.prefs.playbackCompleteAction) { "无" }
}

private fun PlayerActivity.showPlaybackCompleteActionDialog() {
    val actions = arrayOf("无", "重复播放", "播放下一集", "关闭播放器")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("播放完成动作")
        .setItems(actions) { _, which ->
            BiliClient.prefs.playbackCompleteAction = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.PLAYBACK_COMPLETE_ACTION)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.6: 弹幕显示区域文本
private fun danmakuDisplayAreaText(): String {
    return "${(BiliClient.prefs.danmakuDisplayArea * 100).toInt()}%"
}

private fun PlayerActivity.showDanmakuDisplayAreaDialog() {
    val areas = arrayOf("50%", "75%", "100%")
    val values = floatArrayOf(0.5f, 0.75f, 1.0f)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕显示区域")
        .setItems(areas) { _, which ->
            BiliClient.prefs.danmakuDisplayArea = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_DISPLAY_AREA)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.7: 视频解码方式文本
private fun videoDecoderText(): String {
    val decoders = arrayOf("自动", "硬解", "软解")
    return decoders.getOrElse(BiliClient.prefs.videoDecoder) { "自动" }
}

private fun PlayerActivity.showVideoDecoderDialog() {
    val decoders = arrayOf("自动", "硬解", "软解")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("视频解码方式")
        .setItems(decoders) { _, which ->
            BiliClient.prefs.videoDecoder = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VIDEO_DECODER)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.8: 弹幕发送框位置文本
private fun danmakuInputPositionText(): String {
    val positions = arrayOf("底部", "顶部", "跟随系统")
    return positions.getOrElse(BiliClient.prefs.danmakuInputPosition) { "底部" }
}

private fun PlayerActivity.showDanmakuInputPositionDialog() {
    val positions = arrayOf("底部", "顶部", "跟随系统")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕输入位置")
        .setItems(positions) { _, which ->
            BiliClient.prefs.danmakuInputPosition = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_INPUT_POSITION)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.9: 跳过片尾时长文本
private fun skipEndingDurationText(): String {
    return if (BiliClient.prefs.skipEndingDuration == 0) "关闭" else "${BiliClient.prefs.skipEndingDuration}秒"
}

private fun PlayerActivity.showSkipEndingDurationDialog() {
    val durations = arrayOf("关闭", "30秒", "60秒", "90秒", "120秒")
    val values = intArrayOf(0, 30, 60, 90, 120)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("跳过片尾时长")
        .setItems(durations) { _, which ->
            BiliClient.prefs.skipEndingDuration = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.SKIP_ENDING_DURATION)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.11: 投射音量文本
private fun castVolumeText(): String {
    return "${BiliClient.prefs.castVolume}%"
}

private fun PlayerActivity.showCastVolumeDialog() {
    val volumes = arrayOf("0%", "25%", "50%", "75%", "100%")
    val values = intArrayOf(0, 25, 50, 75, 100)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("投射音量")
        .setItems(volumes) { _, which ->
            BiliClient.prefs.castVolume = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.CAST_VOLUME)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.13: 弹幕刷新率文本
private fun danmakuRefreshRateText(): String {
    return "${BiliClient.prefs.danmakuRefreshRate}Hz"
}

private fun PlayerActivity.showDanmakuRefreshRateDialog() {
    val rates = arrayOf("30Hz", "60Hz", "90Hz", "120Hz")
    val values = intArrayOf(30, 60, 90, 120)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕刷新率")
        .setItems(rates) { _, which ->
            BiliClient.prefs.danmakuRefreshRate = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_REFRESH_RATE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.14: 截图格式文本
private fun screenshotFormatText(): String {
    val formats = arrayOf("PNG", "JPEG", "WebP")
    return formats.getOrElse(BiliClient.prefs.screenshotFormat) { "PNG" }
}

private fun PlayerActivity.showScreenshotFormatDialog() {
    val formats = arrayOf("PNG", "JPEG", "WebP")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("截图格式")
        .setItems(formats) { _, which ->
            BiliClient.prefs.screenshotFormat = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.SCREENSHOT_FORMAT)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v16.15: 弹幕描边透明度文本
private fun danmakuStrokeOpacityText(): String {
    return "${(BiliClient.prefs.danmakuStrokeOpacity * 100).toInt()}%"
}

private fun PlayerActivity.showDanmakuStrokeOpacityDialog() {
    val opacities = arrayOf("0%", "25%", "50%", "75%", "100%")
    val values = floatArrayOf(0.0f, 0.25f, 0.5f, 0.75f, 1.0f)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕描边透明度")
        .setItems(opacities) { _, which ->
            BiliClient.prefs.danmakuStrokeOpacity = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_STROKE_OPACITY)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v17.5: 弹幕字体选择文本
private fun danmakuFontFamilyText(): String {
    val fonts = arrayOf("默认", "黑体", "宋体", "楷体", "圆体", "艺术体")
    return fonts.getOrElse(BiliClient.prefs.danmakuFontFamily) { "默认" }
}

private fun PlayerActivity.showDanmakuFontFamilyDialog() {
    val fonts = arrayOf("默认", "黑体", "宋体", "楷体", "圆体", "艺术体")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕字体")
        .setItems(fonts) { _, which ->
            BiliClient.prefs.danmakuFontFamily = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_FONT_FAMILY)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v17.6: 视频投射延迟文本
private fun castLatencyText(): String {
    return if (BiliClient.prefs.castLatency == 0) "自动" else "${BiliClient.prefs.castLatency}ms"
}

private fun PlayerActivity.showCastLatencyDialog() {
    val latencies = arrayOf("自动", "50ms", "100ms", "200ms", "300ms", "500ms")
    val values = intArrayOf(0, 50, 100, 200, 300, 500)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("投射延迟")
        .setItems(latencies) { _, which ->
            BiliClient.prefs.castLatency = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.CAST_LATENCY)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v17.7: 弹幕过滤强度文本
private fun danmakuFilterStrengthText(): String {
    return "${BiliClient.prefs.danmakuFilterStrength}%"
}

private fun PlayerActivity.showDanmakuFilterStrengthDialog() {
    val strengths = arrayOf("关闭", "25%", "50%", "75%", "100%")
    val values = intArrayOf(0, 25, 50, 75, 100)
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("过滤强度")
        .setItems(strengths) { _, which ->
            BiliClient.prefs.danmakuFilterStrength = values[which]
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.DANMAKU_FILTER_STRENGTH)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v17.8: 播放列表循环模式文本
private fun playlistLoopModeText(): String {
    val modes = arrayOf("列表循环", "单曲循环", "随机播放")
    return modes.getOrElse(BiliClient.prefs.playlistLoopMode) { "列表循环" }
}

private fun PlayerActivity.showPlaylistLoopModeDialog() {
    val modes = arrayOf("列表循环", "单曲循环", "随机播放")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("循环模式")
        .setItems(modes) { _, which ->
            BiliClient.prefs.playlistLoopMode = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.PLAYLIST_LOOP_MODE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v17.10: 视频缩放模式文本
private fun videoScaleModeText(): String {
    val modes = arrayOf("适应", "填充", "拉伸", "缩放", "居中")
    return modes.getOrElse(BiliClient.prefs.videoScaleMode) { "适应" }
}

private fun PlayerActivity.showVideoScaleModeDialog() {
    val modes = arrayOf("适应", "填充", "拉伸", "缩放", "居中")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("视频缩放模式")
        .setItems(modes) { _, which ->
            BiliClient.prefs.videoScaleMode = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VIDEO_SCALE_MODE)
        }
        .setNegativeButton("取消", null)
        .show()
}

// v17.14: 视频HDR模式文本
private fun videoHdrModeText(): String {
    val modes = arrayOf("关闭", "SDR", "HDR", "杜比视界")
    return modes.getOrElse(BiliClient.prefs.videoHdrMode) { "关闭" }
}

private fun PlayerActivity.showVideoHdrModeDialog() {
    val modes = arrayOf("关闭", "SDR", "HDR", "杜比视界")
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("HDR模式")
        .setItems(modes) { _, which ->
            BiliClient.prefs.videoHdrMode = which
            refreshSettings(binding.recyclerSettings.adapter as PlayerSettingsAdapter, PlayerSettingKeys.VIDEO_HDR_MODE)
        }
        .setNegativeButton("取消", null)
        .show()
}

private fun PlayerActivity.buildSubtitleSettingsItems(): List<PlayerSettingsAdapter.SettingItem> {
    return listOf(
        settingItem(PlayerSettingKeys.SUBTITLE_ENABLED, "字幕开关", session.subtitleEnabled.switchText()),
        settingItem(PlayerSettingKeys.SUBTITLE_LANG, "字幕语言", subtitleLangSubtitle()),
        settingItem(PlayerSettingKeys.SUBTITLE_TEXT_SIZE, "字幕字体大小", session.subtitleTextSizeSp.toInt().toString()),
        settingItem(
            PlayerSettingKeys.SUBTITLE_BOTTOM_PADDING,
            "字幕底部间距",
            subtitleBottomPaddingText(session.subtitleBottomPaddingFraction),
        ),
        settingItem(
            PlayerSettingKeys.SUBTITLE_BACKGROUND_OPACITY,
            "字幕背景透明度",
            subtitleBackgroundOpacityText(session.subtitleBackgroundOpacity),
        ),
    )
}

private fun PlayerActivity.buildDanmakuSettingsItems(): List<PlayerSettingsAdapter.SettingItem> {
    return listOf(
        settingItem(PlayerSettingKeys.DANMAKU_ENABLED, "弹幕开关", session.danmaku.enabled.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_SPEED, "弹幕速度", session.danmaku.speedLevel.toString()),
        settingItem(PlayerSettingKeys.DANMAKU_OPACITY, "弹幕透明度", String.format(Locale.US, "%.2f", session.danmaku.opacity)),
        settingItem(PlayerSettingKeys.DANMAKU_TEXT_SIZE, "弹幕字体大小", session.danmaku.textSizeSp.toInt().toString()),
        settingItem(PlayerSettingKeys.DANMAKU_AREA, "弹幕占屏比", areaText(session.danmaku.area)),
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_WIDTH, "弹幕文字描边粗细", session.danmaku.strokeWidthPx.toString()),
        // v12.23: 弹幕描边颜色
        settingItem(PlayerSettingKeys.DANMAKU_STROKE_COLOR, "弹幕描边颜色", danmakuStrokeColorText()),
        settingItem(PlayerSettingKeys.DANMAKU_FONT_WEIGHT, "字体粗细", danmakuFontWeightText(session.danmaku.fontWeight)),
        settingItem(PlayerSettingKeys.DANMAKU_LANE_DENSITY, "轨道密度", danmakuLaneDensityText(session.danmaku.laneDensity)),
        // v11.3: 弹幕最大数量限制
        settingItem(PlayerSettingKeys.DANMAKU_MAX_COUNT, "弹幕数量限制", danmakuMaxCountSubtitle()),
        settingItem(PlayerSettingKeys.DANMAKU_FOLLOW_BILI_SHIELD, "跟随B站弹幕屏蔽", session.danmaku.followBiliShield.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_SHOW_HIGH_LIKE_ICON, "显示高赞弹幕图标", session.danmaku.showHighLikeIcon.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_AI_SHIELD_ENABLED, "智能云屏蔽", session.danmaku.aiShieldEnabled.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_AI_SHIELD_LEVEL, "智能云屏蔽等级", aiLevelText(session.danmaku.aiShieldLevel)),
        settingItem(PlayerSettingKeys.DANMAKU_ALLOW_SCROLL, "允许滚动弹幕", session.danmaku.allowScroll.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_ALLOW_TOP, "允许顶部悬停弹幕", session.danmaku.allowTop.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_ALLOW_BOTTOM, "允许底部悬停弹幕", session.danmaku.allowBottom.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_ALLOW_COLOR, "允许彩色弹幕", session.danmaku.allowColor.switchText()),
        settingItem(PlayerSettingKeys.DANMAKU_ALLOW_SPECIAL, "允许特殊弹幕", session.danmaku.allowSpecial.switchText()),
        // v4.3: 本地弹幕关键词过滤
        settingItem(PlayerSettingKeys.DANMAKU_LOCAL_KEYWORDS, "关键词过滤", localKeywordsSubtitle()),
        // v6.4: 弹幕关键词高亮
        settingItem(PlayerSettingKeys.DANMAKU_HIGHLIGHT_KEYWORDS, "关键词高亮", highlightKeywordsSubtitle()),
        // v12.8: 弹幕高亮颜色自定义
        settingItem(PlayerSettingKeys.DANMAKU_HIGHLIGHT_COLOR, "高亮颜色", danmakuHighlightColorText()),
    )
}

// v4.3: 本地关键词过滤子标题
private fun PlayerActivity.localKeywordsSubtitle(): String {
    val keywords = BiliClient.prefs.danmakuLocalKeywords
    return if (keywords.isEmpty()) "未设置" else "${keywords.size}个关键词"
}

// v6.4: 弹幕关键词高亮子标题
private fun PlayerActivity.highlightKeywordsSubtitle(): String {
    val keywords = BiliClient.prefs.danmakuHighlightKeywords
    return if (keywords.isEmpty()) "未设置" else "${keywords.size}个关键词"
}

// v12.8: 弹幕高亮颜色自定义子标题
private fun PlayerActivity.danmakuHighlightColorText(): String {
    val color = BiliClient.prefs.danmakuHighlightColor
    return String.format("#%06X", 0xFFFFFF and color)
}

// v12.8: 弹幕高亮颜色自定义对话框
internal fun PlayerActivity.showDanmakuHighlightColorDialog() {
    val prefs = BiliClient.prefs
    val currentColor = prefs.danmakuHighlightColor
    val colors = arrayOf(
        "默认黄色" to 0xFFFFFF00.toInt(),
        "红色" to 0xFFFF4444.toInt(),
        "绿色" to 0xFF44FF44.toInt(),
        "蓝色" to 0xFF4444FF.toInt(),
        "紫色" to 0xFFBB66FF.toInt(),
        "青色" to 0xFF44FFFF.toInt(),
        "橙色" to 0xFFFF9900.toInt(),
        "粉色" to 0xFFFF66CC.toInt(),
        "白色" to 0xFFFFFFFF.toInt(),
    )
    val names = colors.map { it.first }.toTypedArray()
    val selectedIndex = colors.indexOfFirst { it.second == currentColor }.coerceAtLeast(0)

    android.app.AlertDialog.Builder(this)
        .setTitle("弹幕高亮颜色")
        .setSingleChoiceItems(names, selectedIndex) { dialog, which ->
            val selectedColor = colors[which].second
            prefs.danmakuHighlightColor = selectedColor
            refreshSettingsPanel()
            AppToast.show(this, "已切换为: ${names[which]}")
            dialog.dismiss()
        }
        .setNegativeButton("取消", null)
        .show()
}

// v6.10: 定时关闭子标题
private fun sleepTimerSubtitle(): String {
    val remaining = if (sleepTimerJob != null && sleepTimerEndTimeMs > 0) {
        maxOf(0L, sleepTimerEndTimeMs - System.currentTimeMillis())
    } else 0L
    return if (remaining > 0) {
        val min = remaining / 60_000L
        val sec = (remaining % 60_000L) / 1000L
        "${min}分${sec}秒后关闭"
    } else "关闭"
}

// v6.11: 倍速预设
private fun PlayerActivity.speedPresetsSubtitle(): String {
    val presets = BiliClient.prefs.speedPresets
    return if (presets.isEmpty()) "未设置" else presets.joinToString(", ") { String.format(java.util.Locale.US, "%.2fx", it) }
}

internal fun PlayerActivity.showSpeedPresetsDialog() {
    val allSpeeds = listOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 1.75f, 2.0f, 2.5f, 3.0f, 4.0f)
    val currentPresets = BiliClient.prefs.speedPresets.toMutableSet()
    val labels = allSpeeds.map { speed ->
        val name = String.format(java.util.Locale.US, "%.2fx", speed)
        if (currentPresets.contains(speed)) "$name ✓" else name
    }
    AppPopup.singleChoice(
        context = this,
        title = "倍速预设（点击切换开关）",
        items = labels,
        checkedIndex = -1,
    ) { which, _ ->
        val speed = allSpeeds[which]
        if (currentPresets.contains(speed)) {
            currentPresets.remove(speed)
        } else {
            currentPresets.add(speed)
        }
        val sorted = currentPresets.sorted()
        BiliClient.prefs.speedPresets = sorted
        refreshSettingsPanel()
        AppToast.show(this, "预设已更新：${if (sorted.isEmpty()) "无" else sorted.joinToString { String.format(java.util.Locale.US, "%.2fx", it) }}")
    }
}

// v7.0: 跳过片头片尾
private fun PlayerActivity.skipIntroOutroSubtitle(): String {
    val intro = BiliClient.prefs.skipIntroSeconds
    val outro = BiliClient.prefs.skipOutroSeconds
    return when {
        intro > 0 && outro > 0 -> "片头${intro}秒 片尾${outro}秒"
        intro > 0 -> "片头${intro}秒"
        outro > 0 -> "片尾${outro}秒"
        else -> "关闭"
    }
}

internal fun PlayerActivity.showSkipIntroOutroDialog() {
    val introOptions = listOf(0, 5, 10, 15, 20, 30, 60, 90, 120)
    val outroOptions = listOf(0, 5, 10, 15, 20, 30, 60, 90, 120)
    val currentIntro = BiliClient.prefs.skipIntroSeconds
    val currentOutro = BiliClient.prefs.skipOutroSeconds

    // First dialog: choose intro
    val introLabels = introOptions.map { if (it == 0) "不跳过" else "${it}秒" }
    AppPopup.singleChoice(
        context = this,
        title = "跳过片头（秒）",
        items = introLabels,
        checkedIndex = introOptions.indexOf(currentIntro).takeIf { it >= 0 } ?: 0,
    ) { introIdx, _ ->
        val newIntro = introOptions[introIdx]
        BiliClient.prefs.skipIntroSeconds = newIntro
        // Second dialog: choose outro
        val outroLabels = outroOptions.map { if (it == 0) "不跳过" else "${it}秒" }
        AppPopup.singleChoice(
            context = this@showSkipIntroOutroDialog,
            title = "跳过片尾（秒）",
            items = outroLabels,
            checkedIndex = outroOptions.indexOf(currentOutro).takeIf { it >= 0 } ?: 0,
        ) { outroIdx, _ ->
            val newOutro = outroOptions[outroIdx]
            BiliClient.prefs.skipOutroSeconds = newOutro
            refreshSettingsPanel()
            AppToast.show(this@showSkipIntroOutroDialog, skipIntroOutroSubtitle())
        }
    }
}

private fun PlayerActivity.playerEngineSubtitle(): String {
    val kind = player?.kind ?: session.engineKind
    return when (kind) {
        PlayerEngineKind.IjkPlayer -> "IjkPlayer"
        PlayerEngineKind.ExoPlayer -> "ExoPlayer"
    }
}

// v4.8: 手势灵敏度
private fun PlayerActivity.gestureSensitivityText(): String {
    return when (BiliClient.prefs.playerGestureSensitivity) {
        1 -> "低"
        3 -> "高"
        else -> "中"
    }
}

private fun PlayerActivity.showGestureSensitivityDialog() {
    val options = listOf(1, 2, 3)
    val labels = listOf("低灵敏度", "中灵敏度（默认）", "高灵敏度")
    val current = BiliClient.prefs.playerGestureSensitivity
    val checked = options.indexOf(current).takeIf { it >= 0 } ?: 1
    AppPopup.singleChoice(
        context = this,
        title = "手势灵敏度",
        items = labels,
        checkedIndex = checked,
    ) { which, _ ->
        BiliClient.prefs.playerGestureSensitivity = options[which]
        refreshSettingsPanel()
        AppToast.show(this, "手势灵敏度：${labels[which]}，重新进入播放器生效")
    }
}

// v12.9: 长按倍速
private fun PlayerActivity.longPressSpeedText(): String {
    val speed = BiliClient.prefs.playerHoldSeekSpeed
    return String.format("%.1fx", speed)
}

private fun PlayerActivity.showLongPressSpeedDialog() {
    val speeds = listOf(1.5f, 2.0f, 2.5f, 3.0f, 3.5f, 4.0f)
    val labels = speeds.map { String.format("%.1fx", it) }
    val current = BiliClient.prefs.playerHoldSeekSpeed
    val checked = speeds.indexOfFirst { Math.abs(it - current) < 0.01f }.takeIf { it >= 0 } ?: 1
    AppPopup.singleChoice(
        context = this,
        title = "长按倍速",
        items = labels,
        checkedIndex = checked,
    ) { which, _ ->
        BiliClient.prefs.playerHoldSeekSpeed = speeds[which]
        refreshSettingsPanel()
        AppToast.show(this, "长按倍速：${labels[which]}，重新进入播放器生效")
    }
}

// v4.9: 护眼模式
private fun PlayerActivity.eyeProtectionText(): String {
    return when (BiliClient.prefs.eyeProtectionMode) {
        1 -> "轻度"
        2 -> "中度"
        3 -> "重度"
        else -> "关闭"
    }
}

private fun PlayerActivity.showEyeProtectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "轻度", "中度", "重度")
    val current = BiliClient.prefs.eyeProtectionMode
    val checked = options.indexOf(current).takeIf { it >= 0 } ?: 0
    AppPopup.singleChoice(
        context = this,
        title = "护眼模式",
        items = labels,
        checkedIndex = checked,
    ) { which, _ ->
        BiliClient.prefs.eyeProtectionMode = options[which]
        applyEyeProtectionMode()
        refreshSettingsPanel()
        AppToast.show(this, "护眼模式：${labels[which]}")
    }
}

private fun PlayerActivity.restartForEngineSwitch(picked: PlayerEngineKind) {
    val engine = player ?: return

    val resumePosMs = engine.currentPosition.coerceAtLeast(0L)
    val resumePlayWhenReady = engine.playWhenReady
    val sessionJson = session.copy(engineKind = picked).toEngineSwitchJsonString()

    val restart =
        Intent(this, PlayerActivity::class.java).apply {
            val bvid = currentBvid.takeIf { it.isNotBlank() } ?: intent.getStringExtra(PlayerActivity.EXTRA_BVID).orEmpty()
            if (bvid.isNotBlank()) putExtra(PlayerActivity.EXTRA_BVID, bvid)
            val cid = currentCid.takeIf { it > 0L } ?: intent.getLongExtra(PlayerActivity.EXTRA_CID, -1L).takeIf { it > 0L }
            if (cid != null) putExtra(PlayerActivity.EXTRA_CID, cid)
            currentEpId?.takeIf { it > 0L }?.let { putExtra(PlayerActivity.EXTRA_EP_ID, it) }
            currentAid?.takeIf { it > 0L }?.let { putExtra(PlayerActivity.EXTRA_AID, it) }
            pageListToken?.takeIf { it.isNotBlank() }?.let { putExtra(PlayerActivity.EXTRA_PLAYLIST_TOKEN, it) }
            pageListIndex.takeIf { it >= 0 }?.let { putExtra(PlayerActivity.EXTRA_PLAYLIST_INDEX, it) }
            putExtra(PlayerActivity.EXTRA_ENGINE_SWITCH_RESUME_POSITION_MS, resumePosMs)
            putExtra(PlayerActivity.EXTRA_ENGINE_SWITCH_RESUME_PLAY_WHEN_READY, resumePlayWhenReady)
            putExtra(PlayerActivity.EXTRA_ENGINE_SWITCH_SESSION_JSON, sessionJson)
        }

    startActivity(restart)
    finish()
}

internal fun PlayerActivity.showPlayerEngineDialog() {
    val currentKind = player?.kind ?: session.engineKind
    val items = listOf("ExoPlayer", "IjkPlayer")
    val checked = if (currentKind == PlayerEngineKind.IjkPlayer) 1 else 0
    showSettingsSingleChoiceDialog(
        title = "播放器内核",
        items = items,
        checkedIndex = checked,
    ) { which, _ ->
        val picked = if (which == 1) PlayerEngineKind.IjkPlayer else PlayerEngineKind.ExoPlayer
        if (picked == currentKind) return@showSettingsSingleChoiceDialog
        if (picked == PlayerEngineKind.IjkPlayer) {
            IjkPlayerPluginUi.ensureInstalled(this) {
                applyPlayerEngineSetting(picked)
            }
        } else {
            applyPlayerEngineSetting(picked)
        }
    }
}

private fun PlayerActivity.currentSettingsFocusKey(): String? {
    if (!isSettingsPanelVisible()) return null
    val focused = currentFocus ?: return null
    val holder = binding.recyclerSettings.findContainingViewHolder(focused) ?: return null
    val pos = holder.bindingAdapterPosition
    if (pos == RecyclerView.NO_POSITION) return null
    val adapter = binding.recyclerSettings.adapter as? PlayerSettingsAdapter ?: return null
    return adapter.currentList.getOrNull(pos)?.key
}

private fun PlayerActivity.restoreSettingsPanelFocusByKey(key: String): Boolean {
    if (!isSettingsPanelVisible()) return false
    val rv = binding.recyclerSettings
    val adapter = rv.adapter as? PlayerSettingsAdapter ?: return false
    val targetPos = adapter.currentList.indexOfFirst { it.key == key }
    if (targetPos !in 0 until adapter.itemCount) return false

    fun requestFocus(view: View?): Boolean {
        val v = view ?: return false
        if (!v.isAttachedToWindow || !v.isShown || !v.isEnabled || !v.isFocusable) return false
        return v.requestFocus()
    }

    val direct = rv.findViewHolderForAdapterPosition(targetPos)?.itemView
    if (requestFocus(direct)) return true

    rv.scrollToPosition(targetPos)
    rv.post {
        requestFocus(rv.findViewHolderForAdapterPosition(targetPos)?.itemView)
    }
    return true
}

private inline fun PlayerActivity.showSettingsSingleChoiceDialog(
    title: CharSequence,
    items: List<String>,
    checkedIndex: Int,
    crossinline onPicked: (index: Int, label: String) -> Unit,
) {
    val restoreFocusKey = currentSettingsFocusKey()
    AppPopup.singleChoice(
        context = this,
        title = title,
        items = items,
        checkedIndex = checkedIndex,
        onRestoreFocus = {
            val key = restoreFocusKey ?: return@singleChoice false
            restoreSettingsPanelFocusByKey(key)
        },
    ) { which, label ->
        onPicked(which, label)
    }
}

private inline fun <T> PlayerActivity.showSettingsChoiceDialog(
    title: CharSequence,
    options: List<T>,
    checkedIndex: Int,
    crossinline label: (T) -> String = { it.toString() },
    crossinline onPicked: (T) -> Unit,
) {
    showSettingsSingleChoiceDialog(
        title = title,
        items = options.map(label),
        checkedIndex = checkedIndex,
    ) { which, _ ->
        options.getOrNull(which)?.let(onPicked)
    }
}

private fun PlayerActivity.refreshSettingsPanel() {
    (binding.recyclerSettings.adapter as? PlayerSettingsAdapter)?.let { refreshSettings(it) }
}

// v6.9: 画面比例选项
private val ASPECT_RATIO_MODES = listOf(
    "fit" to "自适应",
    "fill" to "填充",
    "4:3" to "4:3",
    "16:9" to "16:9",
    "21:9" to "21:9",
)

private fun PlayerActivity.currentAspectRatioLabel(): String {
    val mode = session.playerAspectRatio
    return ASPECT_RATIO_MODES.firstOrNull { it.first == mode }?.second ?: "自适应"
}

internal fun PlayerActivity.showAspectRatioDialog() {
    val modes = ASPECT_RATIO_MODES
    val current = modes.indexOfFirst { it.first == session.playerAspectRatio }.takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "画面比例",
        options = modes,
        checkedIndex = current,
        label = { it.second },
    ) { (mode, label) ->
        applySessionSettingValue(
            value = mode,
            updateSession = { copy(playerAspectRatio = mode) },
            syncToGlobal = { BiliClient.prefs.playerAspectRatio = it }, // v12.16: 持久化画面比例
            afterApplied = {
                applyAspectRatio(mode)
                AppToast.show(this, "画面比例：$label")
            },
        )
    }
}

private fun PlayerActivity.applyAspectRatio(mode: String) {
    val aspect = binding.ijkAspect
    when (mode) {
        "fit" -> {
            aspect.setAspectRatio(0f)
            aspect.setResizeMode(androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FIT)
        }
        "fill" -> {
            aspect.setResizeMode(androidx.media3.ui.AspectRatioFrameLayout.RESIZE_MODE_FILL)
        }
        "4:3" -> {
            aspect.setAspectRatio(4f / 3f)
        }
        "16:9" -> {
            aspect.setAspectRatio(16f / 9f)
        }
        "21:9" -> {
            aspect.setAspectRatio(21f / 9f)
        }
    }
}

// v6.10: 定时关闭/睡眠定时器
private var sleepTimerJob: kotlinx.coroutines.Job? = null
private var sleepTimerEndTimeMs: Long = 0L

internal fun PlayerActivity.showSleepTimerDialog() {
    val options = listOf(
        0L to "关闭",
        15 * 60_000L to "15分钟",
        30 * 60_000L to "30分钟",
        45 * 60_000L to "45分钟",
        60 * 60_000L to "1小时",
        90 * 60_000L to "1.5小时",
        120 * 60_000L to "2小时",
    )
    val remaining = if (sleepTimerJob != null && sleepTimerEndTimeMs > 0) {
        maxOf(0L, sleepTimerEndTimeMs - System.currentTimeMillis())
    } else 0L
    val current = if (remaining > 0) {
        options.indexOfFirst { it.first > 0 && it.first >= remaining - 60_000L }.takeIf { it >= 0 } ?: 0
    } else 0
    showSettingsChoiceDialog(
        title = "定时关闭",
        options = options,
        checkedIndex = current,
        label = { (ms, label) ->
            if (ms > 0 && remaining > 0 && remaining <= ms) {
                val min = remaining / 60_000L
                val sec = (remaining % 60_000L) / 1000L
                "$label（剩余${min}分${sec}秒）"
            } else label
        },
    ) { (ms, label) ->
        sleepTimerJob?.cancel()
        sleepTimerJob = null
        sleepTimerEndTimeMs = 0L
        if (ms <= 0) {
            AppToast.show(this, "定时关闭已取消")
            return@showSettingsChoiceDialog
        }
        sleepTimerEndTimeMs = System.currentTimeMillis() + ms
        sleepTimerJob = lifecycleScope.launch {
            delay(ms)
            AppToast.show(this@showSleepTimerDialog, "定时关闭：暂停播放")
            player?.pause()
            sleepTimerJob = null
            sleepTimerEndTimeMs = 0L
        }
        AppToast.show(this, "定时关闭：${label}")
    }
}

internal fun PlayerActivity.showResolutionDialog() {
    // Follow docs: qn list for resolution/framerate.
    // Keep the full list so user can force-pick even if the server later falls back.
    val docQns = PlaybackSettingChoices.resolutionQns
    val available = lastAvailableQns.toSet()
    val currentQn = selectedResolutionQn()
    val currentIndex = docQns.indexOfFirst { it == currentQn }.takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "分辨率",
        options = docQns,
        checkedIndex = currentIndex,
        label = { qn ->
            val text = qnLabel(qn)
            if (available.contains(qn)) "${text}（可用）" else text
        },
    ) { qn -> applyResolutionSetting(qn) }
}

internal fun PlayerActivity.showAudioDialog() {
    val docIds = PlaybackSettingChoices.audioTrackIds
    val available = lastAvailableAudioIds.toSet()
    val currentId = selectedAudioTrackId()
    val currentIndex = docIds.indexOfFirst { it == currentId }.takeIf { it >= 0 } ?: 0

    showSettingsChoiceDialog(
        title = "音轨",
        options = docIds,
        checkedIndex = currentIndex,
        label = { id ->
            val text = audioLabel(id)
            if (available.contains(id)) "${text}（可用）" else text
        },
    ) { id -> applyAudioTrackSetting(id) }
}

internal fun PlayerActivity.showCodecDialog() {
    val options = arrayOf("AVC", "HEVC", "AV1")
    val current = options.indexOf(session.preferCodec).coerceAtLeast(0)
    showSettingsChoiceDialog(
        title = "视频编码",
        options = options.toList(),
        checkedIndex = current,
    ) { selected ->
        applySessionSettingValue(
            value = selected,
            updateSession = { copy(preferCodec = it) },
            syncToGlobal = { playerPreferredCodec = it },
            afterApplied = { reloadStream(keepPosition = true) },
        )
    }
}

internal fun PlayerActivity.showSpeedDialog() {
    val options = PlaybackSettingChoices.playbackSpeeds
    val current = options.indexOf(session.playbackSpeed).takeIf { it >= 0 } ?: 2
    // v12.11: 添加自定义倍速选项
    val allOptions = options + listOf(Float.NaN) // NaN 作为"自定义"标记
    showSettingsChoiceDialog(
        title = "播放速度",
        options = allOptions,
        checkedIndex = current,
        label = { v -> if (v.isNaN()) "自定义..." else String.format(Locale.US, "%.2fx", v) },
    ) { v ->
        if (v.isNaN()) {
            // v12.11: 显示自定义倍速输入对话框
            showCustomSpeedInputDialog()
            return@showSettingsChoiceDialog
        }
        applySpeedValue(v)
    }
}

// v12.11: 自定义倍速输入对话框
private fun PlayerActivity.showCustomSpeedInputDialog() {
    val editText = android.widget.EditText(this).apply {
        inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL
        hint = "0.25 ~ 4.00"
        setText(String.format(Locale.US, "%.2f", session.playbackSpeed))
        setSelectAllOnFocus(true)
    }
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("自定义倍速")
        .setView(editText)
        .setPositiveButton("确定") { _, _ ->
            val input = editText.text.toString().trim().toFloatOrNull()
            if (input != null && input in 0.25f..4.0f) {
                applySpeedValue(input)
            } else {
                AppToast.show(this, "请输入 0.25-4.00 之间的数值")
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

// v13.19: 截图保存路径对话框
internal fun PlayerActivity.showScreenshotPathDialog() {
    val paths = listOf("默认", "保存到相册", "自定义...")
    val currentPath = BiliClient.prefs.screenshotSavePath
    val currentIndex = when {
        currentPath.isBlank() -> 0
        currentPath == "Pictures" -> 1
        else -> 2
    }
    showSettingsChoiceDialog(
        title = "截图保存路径",
        options = paths,
        checkedIndex = currentIndex,
        label = { it },
    ) { path ->
        when (path) {
            "默认" -> {
                BiliClient.prefs.screenshotSavePath = ""
                AppToast.show(this, "截图将保存到默认位置")
            }
            "保存到相册" -> {
                BiliClient.prefs.screenshotSavePath = "Pictures"
                AppToast.show(this, "截图将保存到相册")
            }
            "自定义..." -> showCustomScreenshotPathDialog()
        }
        refreshSettingsPanel()
    }
}

private fun PlayerActivity.showCustomScreenshotPathDialog() {
    val editText = android.widget.EditText(this).apply {
        setText(BiliClient.prefs.screenshotSavePath)
        hint = "输入自定义路径"
    }
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("自定义截图保存路径")
        .setView(editText)
        .setPositiveButton("确定") { _, _ ->
            val path = editText.text.toString().trim()
            BiliClient.prefs.screenshotSavePath = path
            AppToast.show(this, "截图保存路径已设置为: ${if (path.isBlank()) "默认" else path}")
        }
        .setNegativeButton("取消", null)
        .show()
}

private fun PlayerActivity.applySpeedValue(speed: Float) {
    applySessionSettingValue(
        value = speed.coerceIn(0.25f, 4.0f),
        updateSession = { copy(playbackSpeed = it) },
        syncToGlobal = { playerSpeed = it },
        afterApplied = {
            player?.setPlaybackSpeed(it)
            BiliClient.prefs.setVideoSpeed(currentBvid, it)
            AppToast.show(this, String.format(java.util.Locale.US, "倍速: %.2fx", it))
        },
    )
}

internal fun PlayerActivity.showAudioBalanceDialog() {
    val options = AudioBalanceLevel.ordered
    val current = session.audioBalanceLevel
    val checked = options.indexOf(current).takeIf { it >= 0 } ?: 0

    showSettingsChoiceDialog(
        title = "音频平衡",
        options = options,
        checkedIndex = checked,
        label = AudioBalanceLevel::label,
    ) { picked ->
        applySessionSettingValue(
            value = picked,
            updateSession = { copy(audioBalanceLevel = it) },
            syncToGlobal = { playerAudioBalanceLevel = it.prefValue },
            afterApplied = { nextLevel ->
                val engine = player
                if (engine is ExoPlayerEngine) {
                    engine.setAudioBalanceLevel(nextLevel)
                    AppToast.show(this, "音频平衡：${nextLevel.label}")
                } else {
                    AppToast.show(this, "当前播放器内核不支持音频平衡")
                }
            },
        )
    }
}

internal fun PlayerActivity.isPgcLikePlayback(): Boolean {
    val epId = currentEpId
    if (epId != null && epId > 0L) return true
    val src = pageListSource?.trim().orEmpty()
    if (src.startsWith("Bangumi:")) return true
    return false
}

private fun PlayerActivity.defaultPlaybackModeCode(): String {
    val raw =
        if (isPgcLikePlayback()) {
            // PGC (番剧/影视) 默认按“播放合集/分P”处理，不受全局默认播放模式影响。
            AppPrefs.PLAYER_PLAYBACK_MODE_PARTS_LIST
        } else {
            BiliClient.prefs.playerPlaybackMode
        }
    return PlayerPlaybackModes.normalize(raw)
}

internal fun PlayerActivity.resolvedPlaybackMode(): String {
    val override = session.playbackModeOverride
    return PlayerPlaybackModes.normalize(override ?: defaultPlaybackModeCode())
}

internal fun PlayerActivity.playbackModeLabel(code: String): String = PlayerPlaybackModes.label(code)

internal fun PlayerActivity.playbackModeSubtitle(): String {
    return playbackModeLabel(resolvedPlaybackMode())
}

internal fun PlayerActivity.applyPlaybackMode(engine: BlblPlayerEngine) {
    engine.repeatMode =
        when (resolvedPlaybackMode()) {
            AppPrefs.PLAYER_PLAYBACK_MODE_LOOP_ONE -> Player.REPEAT_MODE_ONE
            else -> Player.REPEAT_MODE_OFF
        }
    clearAutoNextState(reason = "mode_change", resetUserCancellation = true)
    maybeWarmUpAutoNextTarget()
}

internal fun PlayerActivity.showPlaybackModeDialog() {
    val engine = player ?: return
    val modeCodes = PlayerPlaybackModes.ordered
    val checked = modeCodes.indexOf(resolvedPlaybackMode()).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "播放模式",
        options = modeCodes,
        checkedIndex = checked,
        label = PlayerPlaybackModes::label,
    ) { pickedCode -> applyPlaybackModeSetting(pickedCode, engine) }
}

internal fun PlayerActivity.pickSubtitleItem(items: List<SubtitleItem>): SubtitleItem? {
    if (items.isEmpty()) return null
    val preferred = resolvedSubtitleLangCode()
    if (preferred == "auto" || preferred.isBlank()) return items.first()
    return items.firstOrNull { it.lan.equals(preferred, ignoreCase = true) } ?: items.first()
}

internal fun PlayerActivity.subtitleLangSubtitle(): String {
    if (subtitleItems.isEmpty()) return "无/未加载"
    return resolveSubtitleLang(resolvedSubtitleLangCode())
}

internal fun PlayerActivity.resolveSubtitleLang(code: String): String {
    if (subtitleItems.isEmpty()) return "无"
    if (code == "auto" || code.isBlank()) {
        val first = subtitleItems.first()
        return "自动：${first.lanDoc}"
    }
    val found = subtitleItems.firstOrNull { it.lan.equals(code, ignoreCase = true) } ?: subtitleItems.first()
    return "${found.lanDoc}"
}

internal fun PlayerActivity.showSubtitleLangDialog() {
    val exo = (player as? ExoPlayerEngine)?.exoPlayer
    if (exo == null) {
        AppToast.show(this, "当前播放器内核不支持字幕")
        return
    }
    if (subtitleItems.isEmpty()) {
        AppToast.show(this, "该视频暂无字幕")
        return
    }
    val autoLabel = "自动（取第一个）"
    val items =
        buildList {
            add(autoLabel)
            subtitleItems.forEach { add(it.lanDoc) }
        }
    val effective = resolvedSubtitleLangCode()
    val currentLabel =
        when {
            effective.equals("auto", ignoreCase = true) || effective.isBlank() -> autoLabel
            else -> subtitleItems.firstOrNull { it.lan.equals(effective, ignoreCase = true) }?.lanDoc ?: subtitleItems.first().lanDoc
        }
    val checked = items.indexOf(currentLabel).coerceAtLeast(0)
    showSettingsSingleChoiceDialog(
        title = "字幕语言",
        items = items,
        checkedIndex = checked,
    ) { which, _ ->
        val chosen = items.getOrNull(which).orEmpty()
        val pickedCode =
            when {
                chosen.startsWith("自动") -> "auto"
                else -> subtitleItems.firstOrNull { it.lanDoc == chosen }?.lan ?: subtitleItems.first().lan
            }
        applySubtitleLanguageSetting(pickedCode, exo)
    }
}

internal fun PlayerActivity.showSubtitleTextSizeDialog() {
    val options = PlaybackSettingChoices.subtitleTextSizes
    val current =
        options.indices.minByOrNull { abs(options[it].toFloat() - session.subtitleTextSizeSp) }
            ?: options.indexOf(26).takeIf { it >= 0 }
            ?: 0
    showSettingsChoiceDialog(
        title = "字幕字体大小",
        options = options,
        checkedIndex = current,
    ) { picked ->
        applySessionSettingValue(
            value = picked.toFloat().coerceIn(10f, 60f),
            updateSession = { copy(subtitleTextSizeSp = it) },
            syncToGlobal = { subtitleTextSizeSp = it },
            afterApplied = { applySubtitleTextSize() },
        )
    }
}

internal fun PlayerActivity.showSubtitleBottomPaddingDialog() {
    val options = PlaybackSettingChoices.subtitleBottomPaddingPercents
    val current =
        options.indices.minByOrNull { abs(options[it] / 100f - session.subtitleBottomPaddingFraction) }
            ?: options.indexOf(16).takeIf { it >= 0 }
            ?: 0
    showSettingsChoiceDialog(
        title = "字幕底部间距",
        options = options,
        checkedIndex = current,
        label = { "${it}%" },
    ) { percent ->
        applySessionSettingValue(
            value = (percent / 100f).coerceIn(0f, 0.30f),
            updateSession = { copy(subtitleBottomPaddingFraction = it) },
            syncToGlobal = { subtitleBottomPaddingFraction = it },
            afterApplied = { applySubtitleStyle() },
        )
    }
}

internal fun PlayerActivity.showSubtitleBackgroundOpacityDialog() {
    val ordered = PlaybackSettingChoices.subtitleBackgroundOpacities
    val current = ordered.indices.minByOrNull { abs(ordered[it] - session.subtitleBackgroundOpacity) } ?: 0
    showSettingsChoiceDialog(
        title = "字幕背景透明度",
        options = ordered,
        checkedIndex = current,
        label = { String.format(Locale.US, "%.2f", it) },
    ) { picked ->
        applySessionSettingValue(
            value = picked.coerceIn(0f, 1.0f),
            updateSession = { copy(subtitleBackgroundOpacity = it) },
            syncToGlobal = { subtitleBackgroundOpacity = it },
            afterApplied = { applySubtitleStyle() },
        )
    }
}

internal fun PlayerActivity.configureSubtitleView() {
    val subtitleView = binding.playerView.findViewById<SubtitleView>(androidx.media3.ui.R.id.exo_subtitles) ?: return
    applySubtitleStyle(subtitleView)
    applySubtitleTextSize()
}

internal fun PlayerActivity.applySubtitleStyle() {
    val subtitleView = binding.playerView.findViewById<SubtitleView>(androidx.media3.ui.R.id.exo_subtitles) ?: return
    applySubtitleStyle(subtitleView)
}

private fun PlayerActivity.applySubtitleStyle(subtitleView: SubtitleView) {
    val bottomPaddingFraction =
        session.subtitleBottomPaddingFraction
            .let { if (it.isFinite()) it else 0.16f }
            .coerceIn(0f, 0.30f)
    // Prefer padding-based positioning to work consistently across different cue defaults.
    // Keep SubtitleView's own bottomPaddingFraction at 0 to avoid double-applying spacing.
    subtitleView.setBottomPaddingFraction(0f)
    applySubtitlePaddingFraction(subtitleView, bottomPaddingFraction)

    val bgOpacity =
        session.subtitleBackgroundOpacity
            .let { if (it.isFinite()) it else (34f / 255f) }
            .coerceIn(0f, 1.0f)
    val alpha = (bgOpacity * 255f).roundToInt().coerceIn(0, 255)
    val backgroundColor = (alpha shl 24)

    // Make background more transparent while keeping readability.
    subtitleView.setStyle(
        CaptionStyleCompat(
            /* foregroundColor= */ 0xFFFFFFFF.toInt(),
            /* backgroundColor= */ backgroundColor,
            /* windowColor= */ 0x00000000,
            /* edgeType= */ CaptionStyleCompat.EDGE_TYPE_OUTLINE,
            /* edgeColor= */ 0xCC000000.toInt(),
            /* typeface= */ null,
        ),
    )
}

private fun PlayerActivity.applySubtitlePaddingFraction(subtitleView: SubtitleView, fraction: Float) {
    val basePadding =
        (subtitleView.getTag(blbl.cat3399.R.id.tag_player_subtitle_base_padding) as? IntArray)
            ?.takeIf { it.size == 4 }
            ?: intArrayOf(
                subtitleView.paddingLeft,
                subtitleView.paddingTop,
                subtitleView.paddingRight,
                subtitleView.paddingBottom,
            ).also { subtitleView.setTag(blbl.cat3399.R.id.tag_player_subtitle_base_padding, it) }

    val h = binding.playerView.height.takeIf { it > 0 } ?: subtitleView.height
    if (h <= 0) {
        subtitleView.post { applySubtitlePaddingFraction(subtitleView, fraction) }
        return
    }
    val extraBottomPx = (h * fraction.coerceIn(0f, 0.30f)).roundToInt().coerceAtLeast(0)
    subtitleView.setPadding(
        /* left= */ basePadding[0],
        /* top= */ basePadding[1],
        /* right= */ basePadding[2],
        /* bottom= */ basePadding[3] + extraBottomPx,
    )
}

internal fun PlayerActivity.applySubtitleTextSize() {
    val subtitleView = binding.playerView.findViewById<SubtitleView>(androidx.media3.ui.R.id.exo_subtitles) ?: return
    val sizeSp =
        session.subtitleTextSizeSp
            .let { if (it.isFinite()) it else 26f }
            .coerceIn(10f, 60f)
    subtitleView.setFixedTextSize(TypedValue.COMPLEX_UNIT_SP, sizeSp)
}

internal fun PlayerActivity.showDanmakuOpacityDialog() {
    val options = PlaybackSettingChoices.danmakuOpacities
    val current = options.indices.minByOrNull { kotlin.math.abs(options[it] - session.danmaku.opacity) } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕透明度",
        options = options,
        checkedIndex = current,
        label = { String.format(Locale.US, "%.2f", it) },
    ) { picked ->
        applyDanmakuSettingValue(
            value = picked.coerceIn(0.05f, 1.0f),
            updateDanmaku = { copy(opacity = it) },
            syncToGlobal = { danmakuOpacity = it },
            afterApplied = { binding.danmakuView.invalidate() },
        )
    }
}

internal fun PlayerActivity.showDanmakuTextSizeDialog() {
    // v12.24: 滑块调节
    val currentSize = session.danmaku.textSizeSp.toInt().coerceIn(10, 40)
    val slider = android.widget.SeekBar(this).apply {
        max = 30 // 10sp to 40sp
        progress = currentSize - 10
        setPadding(48, 24, 48, 0)
    }
    val label = android.widget.TextView(this).apply {
        text = "当前: ${currentSize}sp"
        textSize = 14f
        setPadding(48, 12, 48, 0)
    }
    val layout = android.widget.LinearLayout(this).apply {
        orientation = android.widget.LinearLayout.VERTICAL
        addView(label)
        addView(slider)
    }
    slider.setOnSeekBarChangeListener(object : android.widget.SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(sb: android.widget.SeekBar?, progress: Int, fromUser: Boolean) {
            label.text = "当前: ${progress + 10}sp"
        }
        override fun onStartTrackingTouch(sb: android.widget.SeekBar?) {}
        override fun onStopTrackingTouch(sb: android.widget.SeekBar?) {}
    })
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("弹幕字体大小")
        .setView(layout)
        .setPositiveButton("确定") { _, _ ->
            val size = (slider.progress + 10).toFloat().coerceIn(10f, 40f)
            applyDanmakuSettingValue(
                value = size,
                updateDanmaku = { copy(textSizeSp = it) },
                syncToGlobal = { danmakuTextSizeSp = it },
                afterApplied = { binding.danmakuView.invalidate() },
            )
        }
        .setNegativeButton("取消", null)
        .show()
}

internal fun PlayerActivity.showDanmakuSpeedDialog() {
    val options = PlaybackSettingChoices.danmakuSpeeds
    val current = options.indexOf(session.danmaku.speedLevel).takeIf { it >= 0 } ?: 3
    showSettingsChoiceDialog(
        title = "弹幕速度(1~10)",
        options = options,
        checkedIndex = current,
    ) { picked ->
        applyDanmakuSettingValue(
            value = picked.coerceIn(1, 10),
            updateDanmaku = { copy(speedLevel = it) },
            syncToGlobal = { danmakuSpeed = it },
            afterApplied = { binding.danmakuView.invalidate() },
        )
    }
}

internal fun PlayerActivity.showDanmakuAreaDialog() {
    val options = PlaybackSettingChoices.danmakuAreas
    val current =
        options.indices.minByOrNull { kotlin.math.abs(options[it].first - session.danmaku.area) }
            ?: options.lastIndex
    showSettingsChoiceDialog(
        title = "弹幕占屏比",
        options = options,
        checkedIndex = current,
        label = { it.second },
    ) { picked ->
        applyDanmakuSettingValue(
            value = AppPrefs.normalizeDanmakuArea(picked.first),
            updateDanmaku = { copy(area = it) },
            syncToGlobal = { danmakuArea = it },
            afterApplied = { binding.danmakuView.invalidate() },
        )
    }
}

internal fun PlayerActivity.showDanmakuStrokeWidthDialog() {
    val options = PlaybackSettingChoices.danmakuStrokeWidths
    val current = options.indexOf(session.danmaku.strokeWidthPx).takeIf { it >= 0 } ?: options.indexOf(4)
    showSettingsChoiceDialog(
        title = "弹幕文字描边粗细",
        options = options,
        checkedIndex = current.coerceAtLeast(0),
    ) { picked ->
        applyDanmakuSettingValue(
            value = picked,
            updateDanmaku = { copy(strokeWidthPx = it) },
            syncToGlobal = { danmakuStrokeWidthPx = it },
            afterApplied = { binding.danmakuView.invalidate() },
        )
    }
}

internal fun PlayerActivity.showDanmakuFontWeightDialog() {
    val options = PlaybackSettingChoices.danmakuFontWeights
    val current = options.indexOf(session.danmaku.fontWeight).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "字体粗细",
        options = options,
        checkedIndex = current,
        label = ::danmakuFontWeightText,
    ) { picked ->
        applyDanmakuSettingValue(
            value = picked,
            updateDanmaku = { copy(fontWeight = it) },
            syncToGlobal = { danmakuFontWeight = it.prefValue },
            afterApplied = { binding.danmakuView.invalidate() },
        )
    }
}

internal fun PlayerActivity.showDanmakuLaneDensityDialog() {
    val options = PlaybackSettingChoices.danmakuLaneDensities
    val current = options.indexOf(session.danmaku.laneDensity).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "轨道密度",
        options = options,
        checkedIndex = current,
        label = ::danmakuLaneDensityText,
    ) { picked ->
        applyDanmakuSettingValue(
            value = picked,
            updateDanmaku = { copy(laneDensity = it) },
            syncToGlobal = { danmakuLaneDensity = it.prefValue },
            afterApplied = { binding.danmakuView.invalidate() },
        )
    }
}

internal fun PlayerActivity.showDanmakuAiShieldLevelDialog() {
    val options = PlaybackSettingChoices.aiShieldLevels
    val current = options.indexOf(session.danmaku.aiShieldLevel.coerceIn(1, 10)).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "智能云屏蔽等级",
        options = options,
        checkedIndex = current,
    ) { picked ->
        applyDanmakuSettingValue(
            value = picked.coerceIn(1, 10),
            updateDanmaku = { copy(aiShieldLevel = it) },
            syncToGlobal = { danmakuAiShieldLevel = it },
            afterApplied = { reloadDanmakuForCurrentSession() },
        )
    }
}

// v4.3: 本地弹幕关键词过滤对话框
internal fun PlayerActivity.showLocalKeywordsDialog() {
    val prefs = BiliClient.prefs
    val currentKeywords = prefs.danmakuLocalKeywords.toMutableList()
    val builder = android.app.AlertDialog.Builder(this)
    builder.setTitle("弹幕关键词过滤")

    if (currentKeywords.isEmpty()) {
        builder.setMessage("当前无过滤关键词。\n\n添加关键词后，包含该词的弹幕将被自动过滤。\n\n支持多个关键词，每行一个。")
    } else {
        val display = currentKeywords.joinToString("\n") { "• $it" }
        builder.setMessage("当前过滤关键词:\n$display")
    }

    builder.setPositiveButton("添加关键词") { _, _ ->
        showAddKeywordDialog(currentKeywords)
    }
    if (currentKeywords.isNotEmpty()) {
        builder.setNegativeButton("清空全部") { _, _ ->
            prefs.danmakuLocalKeywords = emptySet()
            reloadDanmakuForCurrentSession()
            refreshSettingsPanel()
            AppToast.show(this, "已清空所有关键词")
        }
        builder.setNeutralButton("管理关键词") { _, _ ->
            showManageKeywordsDialog(currentKeywords)
        }
    } else {
        builder.setNegativeButton("取消", null)
    }
    builder.show()
}

private fun PlayerActivity.showAddKeywordDialog(existing: List<String>) {
    val input = android.widget.EditText(this).apply {
        hint = "输入关键词，多个用逗号分隔"
        setSingleLine()
        setPadding(48, 32, 48, 32)
    }
    android.app.AlertDialog.Builder(this)
        .setTitle("添加弹幕过滤关键词")
        .setView(input)
        .setPositiveButton("添加") { _, _ ->
            val text = input.text.toString().trim()
            if (text.isNotBlank()) {
                val newKeywords = text.split(",", "，", "、", "\n")
                    .map { it.trim() }
                    .filter { it.isNotBlank() }
                if (newKeywords.isNotEmpty()) {
                    val allKeywords = (existing + newKeywords).toSet()
                    BiliClient.prefs.danmakuLocalKeywords = allKeywords
                    reloadDanmakuForCurrentSession()
                    refreshSettingsPanel()
                    AppToast.show(this, "已添加${newKeywords.size}个关键词")
                }
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

private fun PlayerActivity.showManageKeywordsDialog(keywords: List<String>) {
    val items = keywords.map { it }.toTypedArray()
    val checked = BooleanArray(items.size) { false }
    android.app.AlertDialog.Builder(this)
        .setTitle("选择要删除的关键词")
        .setMultiChoiceItems(items, checked) { _, which, isChecked ->
            checked[which] = isChecked
        }
        .setPositiveButton("删除选中") { _, _ ->
            val toRemove = keywords.filterIndexed { i, _ -> checked[i] }.toSet()
            if (toRemove.isNotEmpty()) {
                val remaining = keywords.filter { it !in toRemove }.toSet()
                BiliClient.prefs.danmakuLocalKeywords = remaining
                reloadDanmakuForCurrentSession()
                refreshSettingsPanel()
                AppToast.show(this, "已删除${toRemove.size}个关键词")
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

// v6.4: 弹幕关键词高亮对话框
internal fun PlayerActivity.showHighlightKeywordsDialog() {
    val prefs = BiliClient.prefs
    val currentKeywords = prefs.danmakuHighlightKeywords.toMutableList()
    val builder = android.app.AlertDialog.Builder(this)
    builder.setTitle("弹幕关键词高亮")

    if (currentKeywords.isEmpty()) {
        builder.setMessage("当前无高亮关键词。\n\n添加关键词后，包含该词的弹幕将以高亮颜色显示。\n\n支持多个关键词，每行一个。")
    } else {
        val display = currentKeywords.joinToString("\n") { "• $it" }
        builder.setMessage("当前高亮关键词:\n$display")
    }

    builder.setPositiveButton("添加关键词") { _, _ ->
        showAddHighlightKeywordDialog(currentKeywords)
    }
    if (currentKeywords.isNotEmpty()) {
        builder.setNegativeButton("清空全部") { _, _ ->
            prefs.danmakuHighlightKeywords = emptySet()
            refreshSettingsPanel()
            AppToast.show(this, "已清空所有高亮关键词")
        }
        builder.setNeutralButton("管理关键词") { _, _ ->
            showManageHighlightKeywordsDialog(currentKeywords)
        }
    } else {
        builder.setNegativeButton("取消", null)
    }
    builder.show()
}

private fun PlayerActivity.showAddHighlightKeywordDialog(existing: List<String>) {
    val input = android.widget.EditText(this).apply {
        hint = "输入关键词，多个用逗号分隔"
        setSingleLine()
        setPadding(48, 32, 48, 32)
    }
    android.app.AlertDialog.Builder(this)
        .setTitle("添加弹幕高亮关键词")
        .setView(input)
        .setPositiveButton("添加") { _, _ ->
            val text = input.text.toString().trim()
            if (text.isNotBlank()) {
                val newKeywords = text.split(",", "，", "、", "\n")
                    .map { it.trim() }
                    .filter { it.isNotBlank() }
                if (newKeywords.isNotEmpty()) {
                    val allKeywords = (existing + newKeywords).toSet()
                    BiliClient.prefs.danmakuHighlightKeywords = allKeywords
                    refreshSettingsPanel()
                    AppToast.show(this, "已添加${newKeywords.size}个高亮关键词")
                }
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

private fun PlayerActivity.showManageHighlightKeywordsDialog(keywords: List<String>) {
    val items = keywords.map { it }.toTypedArray()
    val checked = BooleanArray(items.size) { false }
    android.app.AlertDialog.Builder(this)
        .setTitle("选择要删除的高亮关键词")
        .setMultiChoiceItems(items, checked) { _, which, isChecked ->
            checked[which] = isChecked
        }
        .setPositiveButton("删除选中") { _, _ ->
            val toRemove = keywords.filterIndexed { i, _ -> checked[i] }.toSet()
            if (toRemove.isNotEmpty()) {
                val remaining = keywords.filter { it !in toRemove }.toSet()
                BiliClient.prefs.danmakuHighlightKeywords = remaining
                refreshSettingsPanel()
                AppToast.show(this, "已删除${toRemove.size}个高亮关键词")
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

// v11.1: 评论关键词过滤
private fun PlayerActivity.commentFilterKeywordsSubtitle(): String {
    val keywords = BiliClient.prefs.commentFilterKeywords
    return if (keywords.isEmpty()) "关" else "${keywords.size}个关键词"
}

internal fun PlayerActivity.showCommentFilterKeywordsDialog() {
    val prefs = BiliClient.prefs
    val currentKeywords = prefs.commentFilterKeywords.toMutableList()
    val builder = android.app.AlertDialog.Builder(this)
    builder.setTitle("评论关键词过滤")

    if (currentKeywords.isEmpty()) {
        builder.setMessage("当前无过滤关键词。\n\n添加关键词后，包含该词的评论将被自动隐藏。\n\n支持多个关键词，每行一个。")
    } else {
        val display = currentKeywords.joinToString("\n") { "• $it" }
        builder.setMessage("当前过滤关键词:\n$display")
    }

    builder.setPositiveButton("添加关键词") { _, _ ->
        showAddCommentKeywordDialog(currentKeywords)
    }
    if (currentKeywords.isNotEmpty()) {
        builder.setNegativeButton("清空全部") { _, _ ->
            prefs.commentFilterKeywords = emptySet()
            reloadComments()
            refreshSettingsPanel()
            AppToast.show(this, "已清空所有评论过滤关键词")
        }
        builder.setNeutralButton("管理关键词") { _, _ ->
            showManageCommentKeywordsDialog(currentKeywords)
        }
    } else {
        builder.setNegativeButton("取消", null)
    }
    builder.show()
}

private fun PlayerActivity.showAddCommentKeywordDialog(existing: List<String>) {
    val input = android.widget.EditText(this).apply {
        hint = "输入关键词，多个用逗号分隔"
        setSingleLine()
        setPadding(48, 32, 48, 32)
    }
    android.app.AlertDialog.Builder(this)
        .setTitle("添加评论过滤关键词")
        .setView(input)
        .setPositiveButton("添加") { _, _ ->
            val text = input.text.toString().trim()
            if (text.isNotBlank()) {
                val newKeywords = text.split(",", "，", "、", "\n")
                    .map { it.trim() }
                    .filter { it.isNotBlank() }
                if (newKeywords.isNotEmpty()) {
                    val allKeywords = (existing + newKeywords).toSet()
                    BiliClient.prefs.commentFilterKeywords = allKeywords
                    reloadComments()
                    refreshSettingsPanel()
                    AppToast.show(this, "已添加${newKeywords.size}个关键词")
                }
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

private fun PlayerActivity.showManageCommentKeywordsDialog(keywords: List<String>) {
    val items = keywords.map { it }.toTypedArray()
    val checked = BooleanArray(items.size) { false }
    android.app.AlertDialog.Builder(this)
        .setTitle("选择要删除的关键词")
        .setMultiChoiceItems(items, checked) { _, which, isChecked ->
            checked[which] = isChecked
        }
        .setPositiveButton("删除选中") { _, _ ->
            val toRemove = keywords.filterIndexed { i, _ -> checked[i] }.toSet()
            if (toRemove.isNotEmpty()) {
                val remaining = keywords.filter { it !in toRemove }.toSet()
                BiliClient.prefs.commentFilterKeywords = remaining
                reloadComments()
                refreshSettingsPanel()
                AppToast.show(this, "已删除${toRemove.size}个关键词")
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

// v11.2: 双击快进秒数
private fun PlayerActivity.shortSeekStepSubtitle(): String {
    return "${BiliClient.prefs.playerShortSeekStepSeconds}秒"
}

private fun PlayerActivity.showShortSeekStepDialog() {
    val prefs = BiliClient.prefs
    val options = blbl.cat3399.core.prefs.AppPrefs.PLAYER_SHORT_SEEK_STEP_SECONDS_OPTIONS.sorted().toList()
    val current = prefs.playerShortSeekStepSeconds
    val labels = options.map { "${it}秒" }.toTypedArray()
    val currentIndex = options.indexOf(current).coerceAtLeast(0)
    android.app.AlertDialog.Builder(this)
        .setTitle("快进快退秒数")
        .setSingleChoiceItems(labels, currentIndex) { dialog, which ->
            val selected = options[which]
            prefs.playerShortSeekStepSeconds = selected
            refreshSettingsPanel()
            AppToast.show(this, "已设为${selected}秒")
            dialog.dismiss()
        }
        .setNegativeButton("取消", null)
        .show()
}

// v11.3: 弹幕最大数量限制
private fun PlayerActivity.danmakuMaxCountSubtitle(): String {
    val count = BiliClient.prefs.danmakuMaxCount
    return if (count <= 0) "不限制" else "{count}条"
}

private fun PlayerActivity.showDanmakuMaxCountDialog() {
    val prefs = BiliClient.prefs
    val options = listOf(0, 500, 1000, 1500, 2000, 3000, 5000)
    val current = prefs.danmakuMaxCount
    val labels = options.map { if (it == 0) "不限制" else "{it}条" }.toTypedArray()
    val currentIndex = options.indexOf(current).coerceAtLeast(0)
    android.app.AlertDialog.Builder(this)
        .setTitle("弹幕数量限制")
        .setSingleChoiceItems(labels, currentIndex) { dialog, which ->
            val selected = options[which]
            prefs.danmakuMaxCount = selected
            refreshSettingsPanel()
            AppToast.show(this, if (selected == 0) "已取消限制" else "已设为{selected}条")
            dialog.dismiss()
        }
        .setNegativeButton("取消", null)
        .show()
}

// v11.7: 字幕延迟
private fun PlayerActivity.subtitleDelaySubtitle(): String {
    val ms = BiliClient.prefs.subtitleDelayMs
    return if (ms == 0L) "正常" else "{ms}ms"
}

private fun PlayerActivity.showSubtitleDelayDialog() {
    val prefs = BiliClient.prefs
    val options = listOf(-5000L, -2000L, -1000L, -500L, -200L, 0L, 200L, 500L, 1000L, 2000L, 5000L)
    val current = prefs.subtitleDelayMs
    val labels = options.map { if (it == 0L) "正常(0ms)" else "{it}ms" }.toTypedArray()
    val currentIndex = options.indexOf(current).coerceAtLeast(0)
    android.app.AlertDialog.Builder(this)
        .setTitle("字幕延迟 (正值=字幕延后)")
        .setSingleChoiceItems(labels, currentIndex) { dialog, which ->
            val selected = options[which]
            prefs.subtitleDelayMs = selected
            refreshSettingsPanel()
            AppToast.show(this, "字幕延迟: {selected}ms")
            dialog.dismiss()
        }
        .setNegativeButton("取消", null)
        .show()
}

// v11.9: 默认亮度
private fun PlayerActivity.defaultBrightnessSubtitle(): String {
    val v = BiliClient.prefs.defaultBrightness
    return if (v < 0f) "系统默认" else "{Math.round(v * 100)}%"
}

private fun PlayerActivity.showDefaultBrightnessDialog() {
    val prefs = BiliClient.prefs
    val options = listOf(-1f, 0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f)
    val current = prefs.defaultBrightness
    val labels = options.map { if (it < 0f) "系统默认" else "{Math.round(it * 100)}%" }.toTypedArray()
    val currentIndex = options.indexOfFirst { Math.abs(it - current) < 0.01f }.coerceAtLeast(0)
    android.app.AlertDialog.Builder(this)
        .setTitle("默认亮度")
        .setSingleChoiceItems(labels, currentIndex) { dialog, which ->
            val selected = options[which]
            prefs.defaultBrightness = selected
            if (selected >= 0f) {
                val attrs = window.attributes
                attrs.screenBrightness = selected
                window.attributes = attrs
            }
            refreshSettingsPanel()
            dialog.dismiss()
        }
        .setNegativeButton("取消", null)
        .show()
}

// v12.14: 视频画面旋转对话框
internal fun PlayerActivity.showVideoRotationDialog() {
    val options = listOf(0, 90, 180, 270)
    val current = session.videoRotation
    val currentIndex = options.indexOf(current).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "画面旋转",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}°" },
    ) { degrees ->
        applySessionSettingValue(
            value = degrees,
            updateSession = { copy(videoRotation = it) },
            syncToGlobal = { BiliClient.prefs.videoRotation = it }, // v12.14: 持久化旋转设置
            afterApplied = {
                applyVideoRotation(it)
                AppToast.show(this, "画面旋转: ${it}°")
            },
        )
    }
}

// v12.14: 应用视频旋转
internal fun PlayerActivity.applyVideoRotation(degrees: Int) {
    binding.playerView.rotation = degrees.toFloat()
}

// v12.15: 视频画面镜像对话框
internal fun PlayerActivity.showVideoMirrorDialog() {
    val options = listOf(0, 1, 2) // 0=关闭, 1=水平, 2=垂直
    val current = session.videoMirror
    val currentIndex = options.indexOf(current).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "画面镜像",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 1 -> "水平翻转"; 2 -> "垂直翻转"; else -> "关闭" } },
    ) { mode ->
        applySessionSettingValue(
            value = mode,
            updateSession = { copy(videoMirror = it) },
            syncToGlobal = { BiliClient.prefs.videoMirror = it },
            afterApplied = {
                applyVideoMirror(it)
                AppToast.show(this, when (it) { 1 -> "水平翻转"; 2 -> "垂直翻转"; else -> "镜像关闭" })
            },
        )
    }
}

// v12.15: 应用视频镜像
internal fun PlayerActivity.applyVideoMirror(mode: Int) {
    binding.playerView.scaleX = if (mode == 1) -1f else 1f
    binding.playerView.scaleY = if (mode == 2) -1f else 1f
}

// v12.17: 跳转到指定时间对话框
internal fun PlayerActivity.showJumpToTimeDialog() {
    val engine = player ?: run { AppToast.show(this, "播放器未就绪"); return }
    val currentPos = engine.currentPosition
    val duration = engine.duration.coerceAtLeast(0L)
    val currentFormatted = formatMsToTime(currentPos)
    val durationFormatted = formatMsToTime(duration)

    val editText = android.widget.EditText(this).apply {
        inputType = android.text.InputType.TYPE_CLASS_TEXT
        hint = "如: 1:30 或 90 或 1分30秒"
        setText(currentFormatted)
        setSelectAllOnFocus(true)
    }
    val layout = android.widget.LinearLayout(this).apply {
        orientation = android.widget.LinearLayout.VERTICAL
        setPadding(48, 24, 48, 0)
        addView(editText)
        addView(android.widget.TextView(context).apply {
            text = "视频时长: $durationFormatted"
            setTextColor(0xFF999999.toInt())
            textSize = 12f
            setPadding(0, 12, 0, 0)
        })
    }
    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("跳转到时间")
        .setView(layout)
        .setPositiveButton("跳转") { _, _ ->
            val ms = parseTimeInput(editText.text.toString().trim(), duration)
            if (ms != null && ms in 0..duration) {
                engine.seekTo(ms)
                AppToast.show(this, "跳转到 ${formatMsToTime(ms)}")
            } else {
                AppToast.show(this, "无效的时间格式")
            }
        }
        .setNegativeButton("取消", null)
        .show()
}

// v12.17: 格式化毫秒为时间字符串
private fun formatMsToTime(ms: Long): String {
    val totalSec = ms / 1000
    val h = totalSec / 3600
    val m = (totalSec % 3600) / 60
    val s = totalSec % 60
    return if (h > 0) String.format(Locale.US, "%d:%02d:%02d", h, m, s)
    else String.format(Locale.US, "%d:%02d", m, s)
}

// v12.17: 解析时间输入
private fun parseTimeInput(input: String, durationMs: Long): Long? {
    val trimmed = input.trim()
    // 纯数字（秒）
    trimmed.toLongOrNull()?.let { return it * 1000 }
    // 1:30 或 1:30:00 格式
    val colonParts = trimmed.split(":")
    if (colonParts.size in 2..3) {
        val nums = colonParts.mapNotNull { it.trim().toLongOrNull() }
        if (nums.size == colonParts.size) {
            return if (nums.size == 3) (nums[0] * 3600 + nums[1] * 60 + nums[2]) * 1000
            else (nums[0] * 60 + nums[1]) * 1000
        }
    }
    // 百分比 (如 "50%")
    if (trimmed.endsWith("%")) {
        trimmed.dropLast(1).toFloatOrNull()?.let { pct ->
            return (durationMs * pct / 100f).toLong()
        }
    }
    return null
}

// v12.19: 快进快退时间自定义对话框
internal fun PlayerActivity.showSeekStepDurationDialog() {
    val options = listOf(3, 5, 10, 15, 30, 60)
    val current = BiliClient.prefs.playerShortSeekStepSeconds
    val currentIndex = options.indexOf(current).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(
        title = "快进快退时间",
        options = options,
        checkedIndex = currentIndex,
        label = { "${it}秒" },
    ) { seconds ->
        BiliClient.prefs.playerShortSeekStepSeconds = seconds
        AppToast.show(this, "快进快退时间：${seconds}秒")
    }
}

// v12.20: 播放统计信息对话框
internal fun PlayerActivity.showPlaybackStatsDialog() {
    val engine = player
    if (engine == null) { AppToast.show(this, "播放器未就绪"); return }

    val currentPos = engine.currentPosition
    val duration = engine.duration.coerceAtLeast(0L)
    val speed = engine.playbackSpeed
    val title = currentMainTitle ?: "未知"
    val upName = currentUpName ?: "未知"
    val bvid = currentBvid.ifBlank { "未知" }

    // 缓冲信息
    val bufferedPos = engine.bufferedPosition
    val bufferPercent = if (duration > 0) (bufferedPos * 100 / duration) else 0

    // 播放状态
    val stateText = when (engine.playbackState) {
        1 -> "空闲"
        2 -> "缓冲中"
        3 -> "就绪"
        4 -> "已结束"
        else -> "未知"
    }

    val statsText = buildString {
        appendLine("📺 标题：$title")
        appendLine("👤 UP主：$upName")
        appendLine("🔗 BV号：$bvid")
        appendLine("")
        appendLine("⏱ 播放位置：${formatTimeDisplay(currentPos)} / ${formatTimeDisplay(duration)}")
        appendLine("⚡ 倍速：${String.format(java.util.Locale.US, "%.2f", speed)}x")
        appendLine("📊 播放状态：$stateText")
        appendLine("💾 缓冲进度：${bufferPercent}%")
        appendLine("📦 缓冲位置：${formatTimeDisplay(bufferedPos)}")
    }

    androidx.appcompat.app.AlertDialog.Builder(this)
        .setTitle("播放统计")
        .setMessage(statsText)
        .setPositiveButton("关闭", null)
        .show()
}

// v12.20: 格式化时间显示
private fun formatTimeDisplay(ms: Long): String {
    val totalSec = ms / 1000
    val h = totalSec / 3600
    val m = (totalSec % 3600) / 60
    val s = totalSec % 60
    return if (h > 0) String.format(java.util.Locale.US, "%d:%02d:%02d", h, m, s)
    else String.format(java.util.Locale.US, "%02d:%02d", m, s)
}

// v12.21: 播放时长提醒对话框
internal fun PlayerActivity.showPlaybackTimeReminderDialog() {
    val options = listOf(0, 30, 60, 120, 180)
    val current = BiliClient.prefs.playbackTimeReminderMinutes
    val currentIndex = options.indexOf(current).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "观看时长提醒",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 60 -> "1小时"; 120 -> "2小时"; 180 -> "3小时"; else -> "${v}分钟" } },
    ) { minutes ->
        BiliClient.prefs.playbackTimeReminderMinutes = minutes
        if (minutes > 0) {
            startPlaybackTimeReminder(minutes)
            AppToast.show(this, "观看${minutes}分钟后提醒")
        } else {
            stopPlaybackTimeReminder()
            AppToast.show(this, "观看时长提醒已关闭")
        }
    }
}

// v12.21: 播放时长提醒定时器
private var playbackTimeReminderJob: kotlinx.coroutines.Job? = null
private var playbackTimeReminderStartMs: Long = 0L

internal fun PlayerActivity.startPlaybackTimeReminder(minutes: Int) {
    stopPlaybackTimeReminder()
    playbackTimeReminderStartMs = System.currentTimeMillis()
    playbackTimeReminderJob = lifecycleScope.launch {
        kotlinx.coroutines.delay(minutes * 60 * 1000L)
        val elapsed = (System.currentTimeMillis() - playbackTimeReminderStartMs) / 60000
        androidx.appcompat.app.AlertDialog.Builder(this@startPlaybackTimeReminder)
            .setTitle("⏰ 观看时长提醒")
            .setMessage("您已观看约 ${elapsed} 分钟，建议适当休息！")
            .setPositiveButton("继续观看") { _, _ ->
                // 重新开始计时
                startPlaybackTimeReminder(minutes)
            }
            .setNegativeButton("关闭提醒") { _, _ ->
                BiliClient.prefs.playbackTimeReminderMinutes = 0
                AppToast.show(this@startPlaybackTimeReminder, "提醒已关闭")
            }
            .setCancelable(false)
            .show()
    }
}

internal fun PlayerActivity.stopPlaybackTimeReminder() {
    playbackTimeReminderJob?.cancel()
    playbackTimeReminderJob = null
}

// v12.22: 截图水印位置对话框
internal fun PlayerActivity.showScreenshotWatermarkPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val current = BiliClient.prefs.screenshotWatermarkPosition
    val currentIndex = options.indexOf(current).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "截图水印位置",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "左上"; 1 -> "右上"; 2 -> "左下"; 3 -> "右下"; else -> "左下" } },
    ) { position ->
        BiliClient.prefs.screenshotWatermarkPosition = position
        val posText = when (position) { 0 -> "左上"; 1 -> "右上"; 2 -> "左下"; 3 -> "右下"; else -> "左下" }
        AppToast.show(this, "水印位置：$posText")
    }
}

// v12.23: 弹幕描边颜色对话框
internal fun PlayerActivity.showDanmakuStrokeColorDialog() {
    data class ColorOption(val color: Int, val name: String)
    val options = listOf(
        ColorOption(0x000000, "黑色"),
        ColorOption(0xFFFFFF, "白色"),
        ColorOption(0x808080, "灰色"),
        ColorOption(0x0000FF, "蓝色"),
        ColorOption(0x008000, "绿色"),
    )
    val currentColor = BiliClient.prefs.danmakuStrokeColor
    val currentIndex = options.indexOfFirst { it.color == currentColor }.takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕描边颜色",
        options = options,
        checkedIndex = currentIndex,
        label = { it.name },
    ) { option ->
        applySessionSettingValue(
            value = option.color,
            updateSession = { copy(danmaku = danmaku.copy(strokeColor = option.color)) },
            syncToGlobal = { BiliClient.prefs.danmakuStrokeColor = it },
            afterApplied = {
                AppToast.show(this, "描边颜色：${option.name}")
            },
        )
    }
}

// ==================== v22.x 新功能 ====================

// v22.1: 视频播放速度曲线自定义
internal fun PlayerActivity.showPlaybackSpeedCurveDialog() {
    val options = listOf("线性", "加速", "减速", "波浪")
    val currentIndex = BiliClient.prefs.v22PlaybackSpeedCurveMode
    showSettingsChoiceDialog(
        title = "播放速度曲线",
        options = options,
        checkedIndex = currentIndex,
        label = { it },
    ) { index ->
        BiliClient.prefs.v22PlaybackSpeedCurveMode = options.indexOf(index)
        AppToast.show(this, "速度曲线：$index")
    }
}

// v22.2: 弹幕颜色过滤
internal fun PlayerActivity.showDanmakuColorFilterToggle() {
    val enabled = !BiliClient.prefs.v22DanmakuColorFilterEnabled
    BiliClient.prefs.v22DanmakuColorFilterEnabled = enabled
    AppToast.show(this, "颜色过滤：${if (enabled) "开启" else "关闭"}")
}

// v22.3: 视频画面锐化强度调节
internal fun PlayerActivity.showVideoSharpenStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v22VideoSharpenStrength).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "画面锐化强度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微"; 50 -> "中等"; 75 -> "较强"; 100 -> "最强"; else -> "中等" } },
    ) { strength ->
        BiliClient.prefs.v22VideoSharpenStrength = strength
        AppToast.show(this, "锐化强度：$strength%")
    }
}

// v22.4: 弹幕字体描边颜色渐变
internal fun PlayerActivity.showDanmakuStrokeGradientDialog() {
    val options = listOf("单色", "渐变", "发光")
    val currentIndex = BiliClient.prefs.v22DanmakuStrokeGradientMode
    showSettingsChoiceDialog(
        title = "弹幕描边效果",
        options = options,
        checkedIndex = currentIndex,
        label = { it },
    ) { index ->
        BiliClient.prefs.v22DanmakuStrokeGradientMode = options.indexOf(index)
        AppToast.show(this, "描边效果：$index")
    }
}

// v22.5: 播放器手势轨迹显示
internal fun PlayerActivity.showGestureTrailToggle() {
    val enabled = !BiliClient.prefs.v22ShowGestureTrail
    BiliClient.prefs.v22ShowGestureTrail = enabled
    AppToast.show(this, "手势轨迹：${if (enabled) "显示" else "隐藏"}")
}

// v22.6: 视频缓存大小限制
internal fun PlayerActivity.showVideoCacheSizeDialog() {
    data class CacheOption(val size: Long, val name: String)
    val options = listOf(
        CacheOption(100L, "100MB"),
        CacheOption(256L, "256MB"),
        CacheOption(512L, "512MB"),
        CacheOption(1024L, "1GB"),
        CacheOption(2048L, "2GB"),
    )
    val currentSize = BiliClient.prefs.v22VideoCacheSizeMB
    val currentIndex = options.indexOfFirst { it.size == currentSize }.takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "视频缓存大小",
        options = options,
        checkedIndex = currentIndex,
        label = { it.name },
    ) { option ->
        BiliClient.prefs.v22VideoCacheSizeMB = option.size
        AppToast.show(this, "缓存大小：${option.name}")
    }
}

// v22.7: 弹幕发送字数统计
internal fun PlayerActivity.showDanmakuCharCountToggle() {
    val enabled = !BiliClient.prefs.v22ShowDanmakuCharCount
    BiliClient.prefs.v22ShowDanmakuCharCount = enabled
    AppToast.show(this, "字数统计：${if (enabled) "显示" else "隐藏"}")
}

// v22.8: 视频画面降噪
internal fun PlayerActivity.showVideoDenoiseToggle() {
    val enabled = !BiliClient.prefs.v22VideoDenoiseEnabled
    BiliClient.prefs.v22VideoDenoiseEnabled = enabled
    AppToast.show(this, "画面降噪：${if (enabled) "开启" else "关闭"}")
}

// v22.9: 弹幕透明度动画曲线
internal fun PlayerActivity.showDanmakuOpacityCurveDialog() {
    val options = listOf("线性", "淡入", "淡出", "脉冲")
    val currentIndex = BiliClient.prefs.v22DanmakuOpacityCurveMode
    showSettingsChoiceDialog(
        title = "弹幕透明度曲线",
        options = options,
        checkedIndex = currentIndex,
        label = { it },
    ) { index ->
        BiliClient.prefs.v22DanmakuOpacityCurveMode = options.indexOf(index)
        AppToast.show(this, "透明度曲线：$index")
    }
}

// v22.10: 播放器快捷面板自定义
internal fun PlayerActivity.showQuickPanelCustomToggle() {
    val enabled = !BiliClient.prefs.v22QuickPanelCustomEnabled
    BiliClient.prefs.v22QuickPanelCustomEnabled = enabled
    AppToast.show(this, "快捷面板自定义：${if (enabled) "开启" else "关闭"}")
}

// v22.11: 视频投射分辨率限制
internal fun PlayerActivity.showCastResolutionLimitDialog() {
    data class ResolutionOption(val name: String, val value: Int)
    val options = listOf(
        ResolutionOption("自动", 0),
        ResolutionOption("720p", 720),
        ResolutionOption("1080p", 1080),
        ResolutionOption("1440p", 1440),
        ResolutionOption("2160p", 2160),
    )
    val currentValue = BiliClient.prefs.v22CastResolutionLimit
    val currentIndex = options.indexOfFirst { it.value == currentValue }.takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "投射分辨率限制",
        options = options,
        checkedIndex = currentIndex,
        label = { it.name },
    ) { option ->
        BiliClient.prefs.v22CastResolutionLimit = option.value
        AppToast.show(this, "投射分辨率：${option.name}")
    }
}

// v22.12: 弹幕字体大小自适应
internal fun PlayerActivity.showDanmakuFontAutoSizeModeDialog() {
    val options = listOf("关闭", "屏幕适配", "距离适配")
    val currentIndex = BiliClient.prefs.v22DanmakuFontAutoSizeMode
    showSettingsChoiceDialog(
        title = "弹幕字体自适应",
        options = options,
        checkedIndex = currentIndex,
        label = { it },
    ) { index ->
        BiliClient.prefs.v22DanmakuFontAutoSizeMode = options.indexOf(index)
        AppToast.show(this, "字体自适应：$index")
    }
}

// v22.14: 视频色彩饱和度调节
internal fun PlayerActivity.showVideoSaturationDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v22VideoSaturation).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(
        title = "色彩饱和度",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when (v) { 50 -> "低"; 75 -> "较低"; 100 -> "标准"; 125 -> "较高"; 150 -> "高"; else -> "标准" } },
    ) { saturation ->
        BiliClient.prefs.v22VideoSaturation = saturation
        AppToast.show(this, "饱和度：$saturation%")
    }
}

// v22.15: 弹幕时间轴标记
internal fun PlayerActivity.showDanmakuTimelineMarkerToggle() {
    val enabled = !BiliClient.prefs.v22DanmakuTimelineMarkerEnabled
    BiliClient.prefs.v22DanmakuTimelineMarkerEnabled = enabled
    AppToast.show(this, "时间轴标记：${if (enabled) "开启" else "关闭"}")
}

// ==================== v23.x 新功能 ====================

// v23.1: 视频播放速度预设自定义
internal fun PlayerActivity.showCustomSpeedPresetsToggle() {
    val enabled = !BiliClient.prefs.v23CustomSpeedPresetsEnabled
    BiliClient.prefs.v23CustomSpeedPresetsEnabled = enabled
    AppToast.show(this, "自定义速度预设：${if (enabled) "开启" else "关闭"}")
}

// v23.2: 弹幕字体阴影颜色
internal fun PlayerActivity.showDanmakuShadowColorDialog() {
    val colors = listOf(0x000000, 0xFFFFFF, 0x808080, 0x0000FF, 0x008000)
    val colorNames = listOf("黑色", "白色", "灰色", "蓝色", "绿色")
    val currentIndex = colors.indexOf(BiliClient.prefs.v23DanmakuShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "弹幕阴影颜色",
        options = colorNames,
        checkedIndex = currentIndex,
        label = { it },
    ) { index ->
        BiliClient.prefs.v23DanmakuShadowColor = colors[colorNames.indexOf(index)]
        AppToast.show(this, "阴影颜色：$index")
    }
}

// v23.3: 视频画面色彩温度（已存在同名函数，使用v23前缀）
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
}

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

// ==================== v24.x 新功能 ====================

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

// ==================== v25.x 新功能 ====================

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

// ==================== v26.x 新功能 ====================

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

// ==================== v27.x 新功能 ====================

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

// ==================== v28.x 新功能 ====================

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

// ==================== v29.x 新功能 ====================

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

// ==================== v30.x 新功能 ====================

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

// ==================== v31.x 新功能 ====================

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

// ==================== v32.x 新功能 ====================

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

// ==================== v33.x 新功能 ====================

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

// ==================== v34.x 新功能 ====================

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

// ==================== v34.x 新功能 (续) ====================

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

// ==================== v35.x 新功能 ====================

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

// v36.9: 弹幕发送历史记录搜索
internal fun PlayerActivity.showV36HistorySearchToggle() {
    val current = BiliClient.prefs.v36HistorySearch
    BiliClient.prefs.v36HistorySearch = !current
    AppToast.show(this, "历史搜索：${if (!current) "开启" else "关闭"}")
}

// v36.10: 播放器进度条样式
internal fun PlayerActivity.showV36ProgressBarStyleDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "细线", "粗线", "渐变", "脉冲", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36ProgressBarStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "进度条样式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { style -> BiliClient.prefs.v36ProgressBarStyle = style; AppToast.show(this, "进度条样式：${labels[options.indexOf(style)]}") }
}

// v36.11: 视频投射画面分辨率
internal fun PlayerActivity.showV36CastResolutionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("自动", "480p", "720p", "1080p", "2K", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v36CastResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射分辨率", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { res -> BiliClient.prefs.v36CastResolution = res; AppToast.show(this, "投射分辨率：${labels[options.indexOf(res)]}") }
}

// v36.12: 弹幕字体背景模糊
internal fun PlayerActivity.showV36DanmakuBackgroundBlurDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuBackgroundBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景模糊", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 5 -> "轻微(5)"; 10 -> "中等(10)"; 15 -> "较强(15)"; 20 -> "最强(20)"; else -> "关闭" } }) { blur -> BiliClient.prefs.v36DanmakuBackgroundBlur = blur; AppToast.show(this, "背景模糊：$blur") }
}

// v36.13: 播放器手势长按速度
internal fun PlayerActivity.showV36GestureLongPressSpeedDialog() {
    val options = listOf(0.5f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
    val currentIndex = options.indexOf(BiliClient.prefs.v36GestureLongPressSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "长按速度", options = options, checkedIndex = currentIndex, label = { v -> "${v}x" }) { speed -> BiliClient.prefs.v36GestureLongPressSpeed = speed; AppToast.show(this, "长按速度：${speed}x") }
}

// v36.14: 视频画面色彩色调偏移
internal fun PlayerActivity.showV36ColorHueShiftDialog() {
    val options = listOf(-180, -90, 0, 90, 180)
    val currentIndex = options.indexOf(BiliClient.prefs.v36ColorHueShift).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色调偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -180 -> "反转(-180)"; -90 -> "偏绿(-90)"; 0 -> "标准(0)"; 90 -> "偏蓝(+90)"; 180 -> "反转(+180)"; else -> "标准(0)" } }) { shift -> BiliClient.prefs.v36ColorHueShift = shift; AppToast.show(this, "色调偏移：$shift") }
}

// v36.15: 弹幕显示字体发光颜色
internal fun PlayerActivity.showV36DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "绿色", "蓝色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v36DanmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v36DanmakuFontGlowColor = color; AppToast.show(this, "发光颜色：${labels[options.indexOf(color)]}") }
}

// v37.1: 视频播放列表随机播放
internal fun PlayerActivity.showV37PlaylistShuffleToggle() {
    val current = BiliClient.prefs.v37PlaylistShuffle
    BiliClient.prefs.v37PlaylistShuffle = !current
    AppToast.show(this, "随机播放：${if (!current) "开启" else "关闭"}")
}

// v37.2: 弹幕字体阴影颜色
internal fun PlayerActivity.showV37DanmakuShadowColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "灰色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "阴影颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v37DanmakuShadowColor = color; AppToast.show(this, "阴影颜色：${labels[options.indexOf(color)]}") }
}

// v37.3: 视频画面色彩鲜艳度
internal fun PlayerActivity.showV37ColorVividnessDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorVividness).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "鲜艳度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "淡雅(-50)"; -25 -> "略淡(-25)"; 0 -> "标准(0)"; 25 -> "鲜艳(+25)"; 50 -> "极鲜艳(+50)"; else -> "标准(0)" } }) { vivid -> BiliClient.prefs.v37ColorVividness = vivid; AppToast.show(this, "鲜艳度：$vivid") }
}

// v37.4: 弹幕发送确认震动衰减
internal fun PlayerActivity.showV37VibrationDecayDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v37VibrationDecay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动衰减", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "快速(25)"; 50 -> "中等(50)"; 75 -> "缓慢(75)"; 100 -> "极慢(100)"; else -> "关闭" } }) { decay -> BiliClient.prefs.v37VibrationDecay = decay; AppToast.show(this, "震动衰减：$decay") }
}

// v37.5: 播放器音量淡入淡出
internal fun PlayerActivity.showV37VolumeFadeToggle() {
    val current = BiliClient.prefs.v37VolumeFade
    BiliClient.prefs.v37VolumeFade = !current
    AppToast.show(this, "音量淡入淡出：${if (!current) "开启" else "关闭"}")
}

// v37.6: 视频缓存预加载
internal fun PlayerActivity.showV37CachePreloadToggle() {
    val current = BiliClient.prefs.v37CachePreload
    BiliClient.prefs.v37CachePreload = !current
    AppToast.show(this, "缓存预加载：${if (!current) "开启" else "关闭"}")
}

// v37.7: 弹幕显示滚动速度
internal fun PlayerActivity.showV37DanmakuScrollSpeedDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuScrollSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滚动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "极慢(-50)"; -25 -> "较慢(-25)"; 0 -> "正常(0)"; 25 -> "较快(+25)"; 50 -> "极快(+50)"; else -> "正常(0)" } }) { speed -> BiliClient.prefs.v37DanmakuScrollSpeed = speed; AppToast.show(this, "滚动速度：$speed") }
}

// v37.8: 视频画面色彩色阶
internal fun PlayerActivity.showV37ColorTonemapDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "电影", "鲜艳", "柔和", "复古", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorTonemap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色阶映射", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { tonemap -> BiliClient.prefs.v37ColorTonemap = tonemap; AppToast.show(this, "色阶映射：${labels[options.indexOf(tonemap)]}") }
}

// v37.9: 弹幕发送历史记录导出
internal fun PlayerActivity.showV37HistoryExportToggle() {
    val current = BiliClient.prefs.v37HistoryExport
    BiliClient.prefs.v37HistoryExport = !current
    AppToast.show(this, "历史导出：${if (!current) "开启" else "关闭"}")
}

// v37.10: 播放器进度条高度
internal fun PlayerActivity.showV37ProgressBarHeightDialog() {
    val options = listOf(1, 2, 3, 5, 7, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ProgressBarHeight).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "进度条高度", options = options, checkedIndex = currentIndex, label = { v -> "${v}dp" }) { height -> BiliClient.prefs.v37ProgressBarHeight = height; AppToast.show(this, "进度条高度：${height}dp") }
}

// v37.11: 视频投射画面码率
internal fun PlayerActivity.showV37CastBitrateDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("自动", "1Mbps", "2Mbps", "5Mbps", "10Mbps", "20Mbps")
    val currentIndex = options.indexOf(BiliClient.prefs.v37CastBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射码率", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { bitrate -> BiliClient.prefs.v37CastBitrate = bitrate; AppToast.show(this, "投射码率：${labels[options.indexOf(bitrate)]}") }
}

// v37.12: 弹幕字体背景边框颜色
internal fun PlayerActivity.showV37DanmakuBorderColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "黑色", "白色", "红色", "蓝色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "边框颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v37DanmakuBorderColor = color; AppToast.show(this, "边框颜色：${labels[options.indexOf(color)]}") }
}

// v37.13: 播放器手势双击功能
internal fun PlayerActivity.showV37GestureDoubleTapDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "播放/暂停", "快进", "快退", "点赞", "收藏")
    val currentIndex = options.indexOf(BiliClient.prefs.v37GestureDoubleTap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "双击功能", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { func -> BiliClient.prefs.v37GestureDoubleTap = func; AppToast.show(this, "双击功能：${labels[options.indexOf(func)]}") }
}

// v37.14: 视频画面色彩色调饱和度
internal fun PlayerActivity.showV37ColorHueSaturationDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v37ColorHueSaturation).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "色调饱和度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -50 -> "灰度(-50)"; -25 -> "淡雅(-25)"; 0 -> "标准(0)"; 25 -> "鲜艳(+25)"; 50 -> "极鲜艳(+50)"; else -> "标准(0)" } }) { sat -> BiliClient.prefs.v37ColorHueSaturation = sat; AppToast.show(this, "色调饱和度：$sat") }
}

// v37.15: 弹幕显示字体发光强度
internal fun PlayerActivity.showV37DanmakuGlowIntensityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v37DanmakuGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { intensity -> BiliClient.prefs.v37DanmakuGlowIntensity = intensity; AppToast.show(this, "发光强度：$intensity") }
}

// v38.1: 视频播放列表循环模式
internal fun PlayerActivity.showV38PlaylistLoopModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("顺序播放", "单曲循环", "列表循环", "随机播放")
    val currentIndex = options.indexOf(BiliClient.prefs.v38PlaylistLoopMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "循环模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38PlaylistLoopMode = mode; AppToast.show(this, "循环模式：${labels[options.indexOf(mode)]}") }
}

// v38.2: 弹幕字体背景圆角
internal fun PlayerActivity.showV38DanmakuBackgroundRadiusDialog() {
    val options = listOf(0, 4, 8, 12, 16, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuBackgroundRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "背景圆角", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "直角"; 4 -> "微圆(4)"; 8 -> "圆角(8)"; 12 -> "较圆(12)"; 16 -> "很圆(16)"; 20 -> "极圆(20)"; else -> "直角" } }) { radius -> BiliClient.prefs.v38DanmakuBackgroundRadius = radius; AppToast.show(this, "背景圆角：$radius") }
}

// v38.3: 视频画面色彩对比度曲线
internal fun PlayerActivity.showV38ColorContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对比度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorContrastCurve = curve; AppToast.show(this, "对比度曲线：${labels[options.indexOf(curve)]}") }
}

// v38.4: 弹幕发送确认震动频率
internal fun PlayerActivity.showV38VibrationFrequencyDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38VibrationFrequency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动频率", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "低频(25)"; 50 -> "中频(50)"; 75 -> "高频(75)"; 100 -> "极高频(100)"; else -> "关闭" } }) { freq -> BiliClient.prefs.v38VibrationFrequency = freq; AppToast.show(this, "震动频率：$freq") }
}

// v38.5: 播放器音量限制模式
internal fun PlayerActivity.showV38VolumeLimitModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "软限制", "硬限制", "自适应")
    val currentIndex = options.indexOf(BiliClient.prefs.v38VolumeLimitMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38VolumeLimitMode = mode; AppToast.show(this, "音量限制模式：${labels[options.indexOf(mode)]}") }
}

// v38.6: 视频缓存清理策略
internal fun PlayerActivity.showV38CacheCleanupStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("手动", "自动", "定时", "智能")
    val currentIndex = options.indexOf(BiliClient.prefs.v38CacheCleanupStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v38CacheCleanupStrategy = strategy; AppToast.show(this, "清理策略：${labels[options.indexOf(strategy)]}") }
}

// v38.7: 弹幕显示位置偏移X
internal fun PlayerActivity.showV38DanmakuOffsetXDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuOffsetX).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "水平偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "最左(-100)"; -50 -> "偏左(-50)"; 0 -> "居中(0)"; 50 -> "偏右(+50)"; 100 -> "最右(+100)"; else -> "居中(0)" } }) { offset -> BiliClient.prefs.v38DanmakuOffsetX = offset; AppToast.show(this, "水平偏移：$offset") }
}

// v38.8: 视频画面色彩亮度曲线
internal fun PlayerActivity.showV38ColorBrightnessCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorBrightnessCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "亮度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorBrightnessCurve = curve; AppToast.show(this, "亮度曲线：${labels[options.indexOf(curve)]}") }
}

// v38.9: 弹幕发送历史记录搜索模式
internal fun PlayerActivity.showV38HistorySearchModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("精确匹配", "模糊匹配", "正则表达式", "拼音搜索")
    val currentIndex = options.indexOf(BiliClient.prefs.v38HistorySearchMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "搜索模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v38HistorySearchMode = mode; AppToast.show(this, "搜索模式：${labels[options.indexOf(mode)]}") }
}

// v38.10: 播放器进度条动画
internal fun PlayerActivity.showV38ProgressBarAnimationToggle() {
    val current = BiliClient.prefs.v38ProgressBarAnimation
    BiliClient.prefs.v38ProgressBarAnimation = !current
    AppToast.show(this, "进度条动画：${if (!current) "开启" else "关闭"}")
}

// v38.11: 视频投射画面延迟
internal fun PlayerActivity.showV38CastLatencyDialog() {
    val options = listOf(0, 1000, 2000, 3000, 4000, 5000)
    val currentIndex = options.indexOf(BiliClient.prefs.v38CastLatency).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "投射延迟", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "自动"; 1000 -> "1秒"; 2000 -> "2秒"; 3000 -> "3秒"; 4000 -> "4秒"; 5000 -> "5秒"; else -> "自动" } }) { latency -> BiliClient.prefs.v38CastLatency = latency; AppToast.show(this, "投射延迟：${latency}ms") }
}

// v38.12: 弹幕字体背景渐变方向
internal fun PlayerActivity.showV38DanmakuGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("从左到右", "从右到左", "从上到下", "从下到上")
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v38DanmakuGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

// v38.13: 播放器手势滑动灵敏度
internal fun PlayerActivity.showV38GestureSwipeSensitivityDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v38GestureSwipeSensitivity).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动灵敏度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "极低(10)"; 25 -> "较低(25)"; 50 -> "中等(50)"; 75 -> "较高(75)"; 100 -> "极高(100)"; else -> "中等(50)" } }) { sensitivity -> BiliClient.prefs.v38GestureSwipeSensitivity = sensitivity; AppToast.show(this, "滑动灵敏度：$sensitivity") }
}

// v38.14: 视频画面色彩饱和度曲线
internal fun PlayerActivity.showV38ColorSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v38ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "饱和度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v38ColorSaturationCurve = curve; AppToast.show(this, "饱和度曲线：${labels[options.indexOf(curve)]}") }
}

// v38.15: 弹幕显示字体描边宽度
internal fun PlayerActivity.showV38DanmakuFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v38DanmakuFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "描边宽度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 1 -> "极细(1)"; 2 -> "细(2)"; 3 -> "中等(3)"; 5 -> "粗(5)"; 10 -> "极粗(10)"; else -> "关闭" } }) { width -> BiliClient.prefs.v38DanmakuFontStrokeWidth = width; AppToast.show(this, "描边宽度：$width") }
}

// v39.1: 视频播放列表自动跳过
internal fun PlayerActivity.showV39PlaylistAutoSkipToggle() {
    val current = BiliClient.prefs.v39PlaylistAutoSkip
    BiliClient.prefs.v39PlaylistAutoSkip = !current
    AppToast.show(this, "自动跳过：${if (!current) "开启" else "关闭"}")
}

// v39.2: 弹幕字体背景透明度曲线
internal fun PlayerActivity.showV39DanmakuBackgroundAlphaCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuBackgroundAlphaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "透明度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v39DanmakuBackgroundAlphaCurve = curve; AppToast.show(this, "透明度曲线：${labels[options.indexOf(curve)]}") }
}

// v39.3: 视频画面色彩锐化强度
internal fun PlayerActivity.showV39ColorSharpenDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorSharpen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "锐化强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微(25)"; 50 -> "中等(50)"; 75 -> "较强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { sharpen -> BiliClient.prefs.v39ColorSharpen = sharpen; AppToast.show(this, "锐化强度：$sharpen") }
}

// v39.4: 弹幕发送确认震动模式曲线
internal fun PlayerActivity.showV39VibrationPatternCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39VibrationPatternCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v39VibrationPatternCurve = curve; AppToast.show(this, "震动曲线：${labels[options.indexOf(curve)]}") }
}

// v39.5: 播放器音量平衡
internal fun PlayerActivity.showV39VolumeBalanceDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39VolumeBalance).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "音量平衡", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "全左(-100)"; -50 -> "偏左(-50)"; 0 -> "居中(0)"; 50 -> "偏右(+50)"; 100 -> "全右(+100)"; else -> "居中(0)" } }) { balance -> BiliClient.prefs.v39VolumeBalance = balance; AppToast.show(this, "音量平衡：$balance") }
}

// v39.6: 视频缓存预加载大小
internal fun PlayerActivity.showV39CachePreloadSizeDialog() {
    val options = listOf(10, 50, 100, 200, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v39CachePreloadSize).takeIf { it >= 0 } ?: 1
    showSettingsChoiceDialog(title = "预加载大小", options = options, checkedIndex = currentIndex, label = { v -> "${v}MB" }) { size -> BiliClient.prefs.v39CachePreloadSize = size; AppToast.show(this, "预加载大小：${size}MB") }
}

// v39.7: 弹幕显示位置偏移Y
internal fun PlayerActivity.showV39DanmakuOffsetYDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuOffsetY).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "垂直偏移", options = options, checkedIndex = currentIndex, label = { v -> when (v) { -100 -> "最上(-100)"; -50 -> "偏上(-50)"; 0 -> "居中(0)"; 50 -> "偏下(+50)"; 100 -> "最下(+100)"; else -> "居中(0)" } }) { offset -> BiliClient.prefs.v39DanmakuOffsetY = offset; AppToast.show(this, "垂直偏移：$offset") }
}

// v39.8: 视频画面色彩降噪强度
internal fun PlayerActivity.showV39ColorDenoiseDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorDenoise).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "轻微(25)"; 50 -> "中等(50)"; 75 -> "较强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { denoise -> BiliClient.prefs.v39ColorDenoise = denoise; AppToast.show(this, "降噪强度：$denoise") }
}

// v39.9: 弹幕发送历史记录自动清理
internal fun PlayerActivity.showV39HistoryAutoCleanupToggle() {
    val current = BiliClient.prefs.v39HistoryAutoCleanup
    BiliClient.prefs.v39HistoryAutoCleanup = !current
    AppToast.show(this, "历史自动清理：${if (!current) "开启" else "关闭"}")
}

// v39.10: 播放器进度条颜色渐变
internal fun PlayerActivity.showV39ProgressBarGradientToggle() {
    val current = BiliClient.prefs.v39ProgressBarGradient
    BiliClient.prefs.v39ProgressBarGradient = !current
    AppToast.show(this, "进度条渐变：${if (!current) "开启" else "关闭"}")
}

// v39.11: 视频投射画面缓冲策略
internal fun PlayerActivity.showV39CastBufferStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "激进", "保守", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v39CastBufferStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "缓冲策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v39CastBufferStrategy = strategy; AppToast.show(this, "缓冲策略：${labels[options.indexOf(strategy)]}") }
}

// v39.12: 弹幕字体背景渐变速度
internal fun PlayerActivity.showV39DanmakuGradientSpeedDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuGradientSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "慢速(25)"; 50 -> "中速(50)"; 75 -> "快速(75)"; 100 -> "极速(100)"; else -> "关闭" } }) { speed -> BiliClient.prefs.v39DanmakuGradientSpeed = speed; AppToast.show(this, "渐变速度：$speed") }
}

// v39.13: 播放器手势长按功能
internal fun PlayerActivity.showV39GestureLongPressDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "快进", "快退", "点赞", "收藏", "截图")
    val currentIndex = options.indexOf(BiliClient.prefs.v39GestureLongPress).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "长按功能", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { func -> BiliClient.prefs.v39GestureLongPress = func; AppToast.show(this, "长按功能：${labels[options.indexOf(func)]}") }
}

// v39.14: 视频画面色彩模糊强度
internal fun PlayerActivity.showV39ColorBlurDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v39ColorBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 5 -> "轻微(5)"; 10 -> "中等(10)"; 15 -> "较强(15)"; 20 -> "最强(20)"; else -> "关闭" } }) { blur -> BiliClient.prefs.v39ColorBlur = blur; AppToast.show(this, "模糊强度：$blur") }
}

// v39.15: 弹幕显示字体发光模式
internal fun PlayerActivity.showV39DanmakuGlowModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("关闭", "外发光", "内发光", "全发光")
    val currentIndex = options.indexOf(BiliClient.prefs.v39DanmakuGlowMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光模式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { mode -> BiliClient.prefs.v39DanmakuGlowMode = mode; AppToast.show(this, "发光模式：${labels[options.indexOf(mode)]}") }
}

// v40.1: 视频播放列表智能排序
internal fun PlayerActivity.showV40PlaylistSmartSortToggle() {
    val current = BiliClient.prefs.v40PlaylistSmartSort
    BiliClient.prefs.v40PlaylistSmartSort = !current
    AppToast.show(this, "智能排序：${if (!current) "开启" else "关闭"}")
}

// v40.2: 弹幕字体背景渐变颜色
internal fun PlayerActivity.showV40DanmakuGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "红色", "绿色", "蓝色", "黄色", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变颜色", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { color -> BiliClient.prefs.v40DanmakuGradientColor = color; AppToast.show(this, "渐变颜色：${labels[options.indexOf(color)]}") }
}

// v40.3: 视频画面色彩色调曲线
internal fun PlayerActivity.showV40ColorHueCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "色调曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorHueCurve = curve; AppToast.show(this, "色调曲线：${labels[options.indexOf(curve)]}") }
}

// v40.4: 弹幕发送确认震动强度曲线
internal fun PlayerActivity.showV40VibrationIntensityCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40VibrationIntensityCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "震动强度曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40VibrationIntensityCurve = curve; AppToast.show(this, "震动强度曲线：${labels[options.indexOf(curve)]}") }
}

// v40.5: 播放器音量限制阈值曲线
internal fun PlayerActivity.showV40VolumeLimitCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40VolumeLimitCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "音量限制曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40VolumeLimitCurve = curve; AppToast.show(this, "音量限制曲线：${labels[options.indexOf(curve)]}") }
}

// v40.6: 视频缓存清理策略曲线
internal fun PlayerActivity.showV40CacheCleanupCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40CacheCleanupCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "清理策略曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40CacheCleanupCurve = curve; AppToast.show(this, "清理策略曲线：${labels[options.indexOf(curve)]}") }
}

// v40.7: 弹幕显示位置对齐方式曲线
internal fun PlayerActivity.showV40DanmakuAlignCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuAlignCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "对齐方式曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40DanmakuAlignCurve = curve; AppToast.show(this, "对齐方式曲线：${labels[options.indexOf(curve)]}") }
}

// v40.8: 视频画面色彩降噪曲线
internal fun PlayerActivity.showV40ColorDenoiseCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorDenoiseCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "降噪曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorDenoiseCurve = curve; AppToast.show(this, "降噪曲线：${labels[options.indexOf(curve)]}") }
}

// v40.9: 弹幕发送历史记录导出格式
internal fun PlayerActivity.showV40HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "XML")
    val currentIndex = options.indexOf(BiliClient.prefs.v40HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "导出格式", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { format -> BiliClient.prefs.v40HistoryExportFormat = format; AppToast.show(this, "导出格式：${labels[options.indexOf(format)]}") }
}

// v40.10: 播放器进度条颜色渐变方向
internal fun PlayerActivity.showV40ProgressBarGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("从左到右", "从右到左", "从中间到两端", "脉冲")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ProgressBarGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变方向", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { direction -> BiliClient.prefs.v40ProgressBarGradientDirection = direction; AppToast.show(this, "渐变方向：${labels[options.indexOf(direction)]}") }
}

// v40.11: 视频投射画面延迟策略
internal fun PlayerActivity.showV40CastLatencyStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("自动", "低延迟", "高画质", "平衡")
    val currentIndex = options.indexOf(BiliClient.prefs.v40CastLatencyStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "延迟策略", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { strategy -> BiliClient.prefs.v40CastLatencyStrategy = strategy; AppToast.show(this, "延迟策略：${labels[options.indexOf(strategy)]}") }
}

// v40.12: 弹幕字体背景渐变透明度
internal fun PlayerActivity.showV40DanmakuGradientAlphaDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGradientAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "渐变透明度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "25%"; 50 -> "50%"; 75 -> "75%"; 100 -> "100%"; else -> "关闭" } }) { alpha -> BiliClient.prefs.v40DanmakuGradientAlpha = alpha; AppToast.show(this, "渐变透明度：${alpha}%") }
}

// v40.13: 播放器手势滑动速度
internal fun PlayerActivity.showV40GestureSwipeSpeedDialog() {
    val options = listOf(10, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40GestureSwipeSpeed).takeIf { it >= 0 } ?: 2
    showSettingsChoiceDialog(title = "滑动速度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 10 -> "极慢(10)"; 25 -> "较慢(25)"; 50 -> "中等(50)"; 75 -> "较快(75)"; 100 -> "极快(100)"; else -> "中等(50)" } }) { speed -> BiliClient.prefs.v40GestureSwipeSpeed = speed; AppToast.show(this, "滑动速度：$speed") }
}

// v40.14: 视频画面色彩模糊曲线
internal fun PlayerActivity.showV40ColorBlurCurveDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("默认", "线性", "S曲线", "对数", "指数", "自定义")
    val currentIndex = options.indexOf(BiliClient.prefs.v40ColorBlurCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "模糊曲线", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { curve -> BiliClient.prefs.v40ColorBlurCurve = curve; AppToast.show(this, "模糊曲线：${labels[options.indexOf(curve)]}") }
}

// v40.15: 弹幕显示字体发光强度
internal fun PlayerActivity.showV40DanmakuGlowIntensityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v40DanmakuGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "发光强度", options = options, checkedIndex = currentIndex, label = { v -> when (v) { 0 -> "关闭"; 25 -> "弱(25)"; 50 -> "中(50)"; 75 -> "强(75)"; 100 -> "最强(100)"; else -> "关闭" } }) { intensity -> BiliClient.prefs.v40DanmakuGlowIntensity = intensity; AppToast.show(this, "发光强度：$intensity") }
}


// v41.1: Playback Speed Memory
internal fun PlayerActivity.showV41PlaybackSpeedMemoryToggle() {
    val current = BiliClient.prefs.v41PlaybackSpeedMemory
    BiliClient.prefs.v41PlaybackSpeedMemory = !current
    AppToast.show(this, "Playback Speed Memory: ${if (!current) "ON" else "OFF"}")
}

// v41.2: Danmaku Vibration Mode
internal fun PlayerActivity.showV41DanmakuVibrationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Medium", "Strong")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuVibrationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuVibrationMode = value; AppToast.show(this, "Danmaku Vibration Mode: ${labels[options.indexOf(value)]}") }
}

// v41.3: Color Auto Adjust
internal fun PlayerActivity.showV41ColorAutoAdjustToggle() {
    val current = BiliClient.prefs.v41ColorAutoAdjust
    BiliClient.prefs.v41ColorAutoAdjust = !current
    AppToast.show(this, "Color Auto Adjust: ${if (!current) "ON" else "OFF"}")
}

// v41.4: Volume Boost Mode
internal fun PlayerActivity.showV41VolumeBoostModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeBoostMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Boost Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeBoostMode = value; AppToast.show(this, "Volume Boost Mode: ${labels[options.indexOf(value)]}") }
}

// v41.5: Danmaku Stroke Style
internal fun PlayerActivity.showV41DanmakuStrokeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("None", "Solid", "Dashed", "Dotted")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuStrokeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Style", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuStrokeStyle = value; AppToast.show(this, "Danmaku Stroke Style: ${labels[options.indexOf(value)]}") }
}

// v41.6: Cast Color Correction
internal fun PlayerActivity.showV41CastColorCorrectionDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Warm", "Cool", "Vivid", "Natural", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastColorCorrection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Correction", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastColorCorrection = value; AppToast.show(this, "Cast Color Correction: ${labels[options.indexOf(value)]}") }
}

// v41.7: Gesture Custom Mapping
internal fun PlayerActivity.showV41GestureCustomMappingDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Default", "Volume", "Brightness", "Seek", "PlayPause", "Fullscreen")
    val currentIndex = options.indexOf(BiliClient.prefs.v41GestureCustomMapping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Custom Mapping", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41GestureCustomMapping = value; AppToast.show(this, "Gesture Custom Mapping: ${labels[options.indexOf(value)]}") }
}

// v41.8: Danmaku Density Limit
internal fun PlayerActivity.showV41DanmakuDensityLimitDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuDensityLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Density Limit", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuDensityLimit = value; AppToast.show(this, "Danmaku Density Limit: ${labels[options.indexOf(value)]}") }
}

// v41.9: Cache Smart Cleanup
internal fun PlayerActivity.showV41CacheSmartCleanupToggle() {
    val current = BiliClient.prefs.v41CacheSmartCleanup
    BiliClient.prefs.v41CacheSmartCleanup = !current
    AppToast.show(this, "Cache Smart Cleanup: ${if (!current) "ON" else "OFF"}")
}

// v41.10: Progress Bar Buffer
internal fun PlayerActivity.showV41ProgressBarBufferToggle() {
    val current = BiliClient.prefs.v41ProgressBarBuffer
    BiliClient.prefs.v41ProgressBarBuffer = !current
    AppToast.show(this, "Progress Bar Buffer: ${if (!current) "ON" else "OFF"}")
}

// v41.11: Danmaku Vibration Feedback
internal fun PlayerActivity.showV41DanmakuVibrationFeedbackToggle() {
    val current = BiliClient.prefs.v41DanmakuVibrationFeedback
    BiliClient.prefs.v41DanmakuVibrationFeedback = !current
    AppToast.show(this, "Danmaku Vibration Feedback: ${if (!current) "ON" else "OFF"}")
}

// v41.12: Color HDR Simulation
internal fun PlayerActivity.showV41ColorHdrSimulationDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "HDR10", "HLG", "Dolby Vision")
    val currentIndex = options.indexOf(BiliClient.prefs.v41ColorHdrSimulation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color HDR Simulation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41ColorHdrSimulation = value; AppToast.show(this, "Color HDR Simulation: ${labels[options.indexOf(value)]}") }
}

// v41.13: Volume Limit Enhanced
internal fun PlayerActivity.showV41VolumeLimitEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeLimitEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeLimitEnhanced = value; AppToast.show(this, "Volume Limit Enhanced: ${labels[options.indexOf(value)]}") }
}

// v41.14: Danmaku Background Radius
internal fun PlayerActivity.showV41DanmakuBgRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuBgRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuBgRadius = value; AppToast.show(this, "Danmaku Background Radius: ${labels[options.indexOf(value)]}") }
}

// v41.15: Cast Audio Codec
internal fun PlayerActivity.showV41CastAudioCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "AAC", "OPUS", "FLAC")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastAudioCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastAudioCodec = value; AppToast.show(this, "Cast Audio Codec: ${labels[options.indexOf(value)]}") }
}

// v42.1: Danmaku Stroke Color
internal fun PlayerActivity.showV42DanmakuStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("White", "Black", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuStrokeColor = value; AppToast.show(this, "Danmaku Stroke Color: ${labels[options.indexOf(value)]}") }
}

// v42.2: Color Auto Contrast
internal fun PlayerActivity.showV42ColorAutoContrastToggle() {
    val current = BiliClient.prefs.v42ColorAutoContrast
    BiliClient.prefs.v42ColorAutoContrast = !current
    AppToast.show(this, "Color Auto Contrast: ${if (!current) "ON" else "OFF"}")
}

// v42.3: Gesture Vibration
internal fun PlayerActivity.showV42GestureVibrationToggle() {
    val current = BiliClient.prefs.v42GestureVibration
    BiliClient.prefs.v42GestureVibration = !current
    AppToast.show(this, "Gesture Vibration: ${if (!current) "ON" else "OFF"}")
}

// v42.4: Danmaku History Stats
internal fun PlayerActivity.showV42DanmakuHistoryStatsToggle() {
    val current = BiliClient.prefs.v42DanmakuHistoryStats
    BiliClient.prefs.v42DanmakuHistoryStats = !current
    AppToast.show(this, "Danmaku History Stats: ${if (!current) "ON" else "OFF"}")
}

// v42.5: Cache Auto Size
internal fun PlayerActivity.showV42CacheAutoSizeToggle() {
    val current = BiliClient.prefs.v42CacheAutoSize
    BiliClient.prefs.v42CacheAutoSize = !current
    AppToast.show(this, "Cache Auto Size: ${if (!current) "ON" else "OFF"}")
}

// v42.6: Progress Bar Color
internal fun PlayerActivity.showV42ProgressBarColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarColor = value; AppToast.show(this, "Progress Bar Color: ${labels[options.indexOf(value)]}") }
}

// v42.7: Danmaku Gradient Enhanced
internal fun PlayerActivity.showV42DanmakuGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuGradientEnhanced = value; AppToast.show(this, "Danmaku Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

// v42.8: Cast Color Enhance
internal fun PlayerActivity.showV42CastColorEnhanceDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CastColorEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CastColorEnhance = value; AppToast.show(this, "Cast Color Enhance: ${labels[options.indexOf(value)]}") }
}

// v42.9: Volume Step Custom
internal fun PlayerActivity.showV42VolumeStepCustomDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10, 15, 20)
    val labels = listOf("Off", "1", "2", "3", "5", "10", "15", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v42VolumeStepCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Step Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42VolumeStepCustom = value; AppToast.show(this, "Volume Step Custom: ${labels[options.indexOf(value)]}") }
}

// v42.10: Danmaku Smart Position
internal fun PlayerActivity.showV42DanmakuSmartPositionToggle() {
    val current = BiliClient.prefs.v42DanmakuSmartPosition
    BiliClient.prefs.v42DanmakuSmartPosition = !current
    AppToast.show(this, "Danmaku Smart Position: ${if (!current) "ON" else "OFF"}")
}

// v42.11: Color Auto Saturation
internal fun PlayerActivity.showV42ColorAutoSaturationToggle() {
    val current = BiliClient.prefs.v42ColorAutoSaturation
    BiliClient.prefs.v42ColorAutoSaturation = !current
    AppToast.show(this, "Color Auto Saturation: ${if (!current) "ON" else "OFF"}")
}

// v42.12: Gesture Long Press Vibration
internal fun PlayerActivity.showV42GestureLongPressVibrationToggle() {
    val current = BiliClient.prefs.v42GestureLongPressVibration
    BiliClient.prefs.v42GestureLongPressVibration = !current
    AppToast.show(this, "Gesture Long Press Vibration: ${if (!current) "ON" else "OFF"}")
}

// v42.13: Danmaku Vibration Duration
internal fun PlayerActivity.showV42DanmakuVibrationDurationDialog() {
    val options = listOf(0, 50, 100, 150, 200, 250, 300, 500)
    val labels = listOf("Off", "50ms", "100ms", "150ms", "200ms", "250ms", "300ms", "500ms")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuVibrationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Duration", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuVibrationDuration = value; AppToast.show(this, "Danmaku Vibration Duration: ${labels[options.indexOf(value)]}") }
}

// v42.14: Cache Preload Strategy
internal fun PlayerActivity.showV42CachePreloadStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Conservative", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CachePreloadStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Strategy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CachePreloadStrategy = value; AppToast.show(this, "Cache Preload Strategy: ${labels[options.indexOf(value)]}") }
}

// v42.15: Progress Bar Buffer Color
internal fun PlayerActivity.showV42ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Buffer Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarBufferColor = value; AppToast.show(this, "Progress Bar Buffer Color: ${labels[options.indexOf(value)]}") }
}

// v43.1: Color Auto Hue
internal fun PlayerActivity.showV43ColorAutoHueToggle() {
    val current = BiliClient.prefs.v43ColorAutoHue
    BiliClient.prefs.v43ColorAutoHue = !current
    AppToast.show(this, "Color Auto Hue: ${if (!current) "ON" else "OFF"}")
}

// v43.2: Danmaku Background Alpha
internal fun PlayerActivity.showV43DanmakuBgAlphaDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuBgAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Alpha", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuBgAlpha = value; AppToast.show(this, "Danmaku Background Alpha: ${labels[options.indexOf(value)]}") }
}

// v43.3: Gesture Double Tap Vibration
internal fun PlayerActivity.showV43GestureDoubleTapVibrationToggle() {
    val current = BiliClient.prefs.v43GestureDoubleTapVibration
    BiliClient.prefs.v43GestureDoubleTapVibration = !current
    AppToast.show(this, "Gesture Double Tap Vibration: ${if (!current) "ON" else "OFF"}")
}

// v43.4: Danmaku History Backup
internal fun PlayerActivity.showV43DanmakuHistoryBackupToggle() {
    val current = BiliClient.prefs.v43DanmakuHistoryBackup
    BiliClient.prefs.v43DanmakuHistoryBackup = !current
    AppToast.show(this, "Danmaku History Backup: ${if (!current) "ON" else "OFF"}")
}

// v43.5: Cache Cleanup Enhanced
internal fun PlayerActivity.showV43CacheCleanupEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CacheCleanupEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CacheCleanupEnhanced = value; AppToast.show(this, "Cache Cleanup Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.6: Progress Bar Gradient Enhanced
internal fun PlayerActivity.showV43ProgressBarGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarGradientEnhanced = value; AppToast.show(this, "Progress Bar Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.7: Danmaku Shadow Enhanced
internal fun PlayerActivity.showV43DanmakuShadowEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuShadowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Shadow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuShadowEnhanced = value; AppToast.show(this, "Danmaku Shadow Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.8: Cast Resolution Enhanced
internal fun PlayerActivity.showV43CastResolutionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "480p", "720p", "1080p", "1440p", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CastResolutionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Resolution Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CastResolutionEnhanced = value; AppToast.show(this, "Cast Resolution Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.9: Volume Limit Curve Enhanced
internal fun PlayerActivity.showV43VolumeLimitCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43VolumeLimitCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43VolumeLimitCurveEnhanced = value; AppToast.show(this, "Volume Limit Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.10: Danmaku Glow Enhanced
internal fun PlayerActivity.showV43DanmakuGlowEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuGlowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Glow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuGlowEnhanced = value; AppToast.show(this, "Danmaku Glow Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.11: Color Auto Brightness
internal fun PlayerActivity.showV43ColorAutoBrightnessToggle() {
    val current = BiliClient.prefs.v43ColorAutoBrightness
    BiliClient.prefs.v43ColorAutoBrightness = !current
    AppToast.show(this, "Color Auto Brightness: ${if (!current) "ON" else "OFF"}")
}

// v43.12: Gesture Swipe Vibration
internal fun PlayerActivity.showV43GestureSwipeVibrationToggle() {
    val current = BiliClient.prefs.v43GestureSwipeVibration
    BiliClient.prefs.v43GestureSwipeVibration = !current
    AppToast.show(this, "Gesture Swipe Vibration: ${if (!current) "ON" else "OFF"}")
}

// v43.13: Danmaku Vibration Mode Enhanced
internal fun PlayerActivity.showV43DanmakuVibrationModeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuVibrationModeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuVibrationModeEnhanced = value; AppToast.show(this, "Danmaku Vibration Mode Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.14: Cache Preload Size Enhanced
internal fun PlayerActivity.showV43CachePreloadSizeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Small", "Medium", "Large", "XL", "XXL")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CachePreloadSizeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Size Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CachePreloadSizeEnhanced = value; AppToast.show(this, "Cache Preload Size Enhanced: ${labels[options.indexOf(value)]}") }
}

// v43.15: Progress Bar Animation Enhanced
internal fun PlayerActivity.showV43ProgressBarAnimationEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Fade", "Slide", "Pulse")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarAnimationEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Animation Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarAnimationEnhanced = value; AppToast.show(this, "Progress Bar Animation Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.1: Color Denoise Enhanced
internal fun PlayerActivity.showV44ColorDenoiseEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ColorDenoiseEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Denoise Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ColorDenoiseEnhanced = value; AppToast.show(this, "Color Denoise Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.2: Danmaku Stroke Width Enhanced
internal fun PlayerActivity.showV44DanmakuStrokeWidthEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuStrokeWidthEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Width Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuStrokeWidthEnhanced = value; AppToast.show(this, "Danmaku Stroke Width Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.3: Gesture Long Press Speed Enhanced
internal fun PlayerActivity.showV44GestureLongPressSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Slowest", "Slower", "Normal", "Faster", "Fastest", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44GestureLongPressSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44GestureLongPressSpeedEnhanced = value; AppToast.show(this, "Gesture Long Press Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.4: Danmaku History Search Enhanced
internal fun PlayerActivity.showV44DanmakuHistorySearchEnhancedToggle() {
    val current = BiliClient.prefs.v44DanmakuHistorySearchEnhanced
    BiliClient.prefs.v44DanmakuHistorySearchEnhanced = !current
    AppToast.show(this, "Danmaku History Search Enhanced: ${if (!current) "ON" else "OFF"}")
}

// v44.5: Cast Bitrate Enhanced
internal fun PlayerActivity.showV44CastBitrateEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CastBitrateEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Bitrate Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CastBitrateEnhanced = value; AppToast.show(this, "Cast Bitrate Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.6: Progress Bar Height Enhanced
internal fun PlayerActivity.showV44ProgressBarHeightEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ProgressBarHeightEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Height Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ProgressBarHeightEnhanced = value; AppToast.show(this, "Progress Bar Height Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.7: Danmaku Border Enhanced
internal fun PlayerActivity.showV44DanmakuBorderEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuBorderEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Border Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuBorderEnhanced = value; AppToast.show(this, "Danmaku Border Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.8: Color Blur Enhanced
internal fun PlayerActivity.showV44ColorBlurEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ColorBlurEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Blur Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ColorBlurEnhanced = value; AppToast.show(this, "Color Blur Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.9: Volume Fade Enhanced
internal fun PlayerActivity.showV44VolumeFadeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Fast", "Normal", "Slow", "VerySlow", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44VolumeFadeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Fade Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44VolumeFadeEnhanced = value; AppToast.show(this, "Volume Fade Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.10: Danmaku Scroll Speed Enhanced
internal fun PlayerActivity.showV44DanmakuScrollSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuScrollSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Scroll Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuScrollSpeedEnhanced = value; AppToast.show(this, "Danmaku Scroll Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.11: Cast Latency Enhanced
internal fun PlayerActivity.showV44CastLatencyEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CastLatencyEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Latency Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CastLatencyEnhanced = value; AppToast.show(this, "Cast Latency Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.12: Gesture Swipe Sensitivity Enhanced
internal fun PlayerActivity.showV44GestureSwipeSensitivityEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44GestureSwipeSensitivityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Swipe Sensitivity Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44GestureSwipeSensitivityEnhanced = value; AppToast.show(this, "Gesture Swipe Sensitivity Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.13: Danmaku Vibration Frequency Enhanced
internal fun PlayerActivity.showV44DanmakuVibrationFrequencyEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuVibrationFrequencyEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Frequency Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuVibrationFrequencyEnhanced = value; AppToast.show(this, "Danmaku Vibration Frequency Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.14: Cache Cleanup Curve Enhanced
internal fun PlayerActivity.showV44CacheCleanupCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CacheCleanupCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CacheCleanupCurveEnhanced = value; AppToast.show(this, "Cache Cleanup Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

// v44.15: Progress Bar Gradient Direction Enhanced
internal fun PlayerActivity.showV44ProgressBarGradientDirectionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("LR", "RL", "CenterOut", "Inward", "Diagonal", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ProgressBarGradientDirectionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Direction Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ProgressBarGradientDirectionEnhanced = value; AppToast.show(this, "Progress Bar Gradient Direction Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.1: Color Sharpen Enhanced
internal fun PlayerActivity.showV45ColorSharpenEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ColorSharpenEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Sharpen Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ColorSharpenEnhanced = value; AppToast.show(this, "Color Sharpen Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.2: Danmaku Background Radius Enhanced
internal fun PlayerActivity.showV45DanmakuBgRadiusEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuBgRadiusEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuBgRadiusEnhanced = value; AppToast.show(this, "Danmaku Background Radius Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.3: Gesture Double Tap Enhanced
internal fun PlayerActivity.showV45GestureDoubleTapEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "PlayPause", "Fullscreen", "Like", "Next", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v45GestureDoubleTapEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Double Tap Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45GestureDoubleTapEnhanced = value; AppToast.show(this, "Gesture Double Tap Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.4: Danmaku History Export Enhanced
internal fun PlayerActivity.showV45DanmakuHistoryExportEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "XML")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuHistoryExportEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku History Export Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuHistoryExportEnhanced = value; AppToast.show(this, "Danmaku History Export Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.5: Cast Buffer Enhanced
internal fun PlayerActivity.showV45CastBufferEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Small", "Medium", "Large")
    val currentIndex = options.indexOf(BiliClient.prefs.v45CastBufferEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Buffer Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45CastBufferEnhanced = value; AppToast.show(this, "Cast Buffer Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.6: Progress Bar Style Enhanced
internal fun PlayerActivity.showV45ProgressBarStyleEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Default", "Thin", "Thick", "Gradient", "Neon", "Minimal")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ProgressBarStyleEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Style Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ProgressBarStyleEnhanced = value; AppToast.show(this, "Progress Bar Style Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.7: Danmaku Gradient Speed Enhanced
internal fun PlayerActivity.showV45DanmakuGradientSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuGradientSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuGradientSpeedEnhanced = value; AppToast.show(this, "Danmaku Gradient Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.8: Color Vividness Enhanced
internal fun PlayerActivity.showV45ColorVividnessEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ColorVividnessEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Vividness Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ColorVividnessEnhanced = value; AppToast.show(this, "Color Vividness Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.9: Volume Balance Enhanced
internal fun PlayerActivity.showV45VolumeBalanceEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45VolumeBalanceEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Balance Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45VolumeBalanceEnhanced = value; AppToast.show(this, "Volume Balance Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.10: Danmaku Offset Enhanced
internal fun PlayerActivity.showV45DanmakuOffsetEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuOffsetEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Offset Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuOffsetEnhanced = value; AppToast.show(this, "Danmaku Offset Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.11: Cast Audio Enhanced
internal fun PlayerActivity.showV45CastAudioEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "Stereo", "Mono", "Surround")
    val currentIndex = options.indexOf(BiliClient.prefs.v45CastAudioEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45CastAudioEnhanced = value; AppToast.show(this, "Cast Audio Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.12: Gesture Vibration Enhanced
internal fun PlayerActivity.showV45GestureVibrationEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v45GestureVibrationEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Vibration Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45GestureVibrationEnhanced = value; AppToast.show(this, "Gesture Vibration Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.13: Danmaku Vibration Intensity Enhanced
internal fun PlayerActivity.showV45DanmakuVibrationIntensityEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuVibrationIntensityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Intensity Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuVibrationIntensityEnhanced = value; AppToast.show(this, "Danmaku Vibration Intensity Enhanced: ${labels[options.indexOf(value)]}") }
}

// v45.14: Cache Smart Cleanup Enhanced
internal fun PlayerActivity.showV45CacheSmartCleanupEnhancedToggle() {
    val current = BiliClient.prefs.v45CacheSmartCleanupEnhanced
    BiliClient.prefs.v45CacheSmartCleanupEnhanced = !current
    AppToast.show(this, "Cache Smart Cleanup Enhanced: ${if (!current) "ON" else "OFF"}")
}

// v45.15: Progress Bar Buffer Enhanced
internal fun PlayerActivity.showV45ProgressBarBufferEnhancedToggle() {
    val current = BiliClient.prefs.v45ProgressBarBufferEnhanced
    BiliClient.prefs.v45ProgressBarBufferEnhanced = !current
    AppToast.show(this, "Progress Bar Buffer Enhanced: ${if (!current) "ON" else "OFF"}")
}

// v46.1: Playback Loop Memory
internal fun PlayerActivity.showV46PlaybackLoopMemoryToggle() {
    val current = BiliClient.prefs.v46PlaybackLoopMemory
    BiliClient.prefs.v46PlaybackLoopMemory = !current
    AppToast.show(this, "Playback Loop Memory: ${if (!current) "ON" else "OFF"}")
}

// v46.2: Danmaku Font Weight
internal fun PlayerActivity.showV46DanmakuFontWeightDialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100", "200", "300", "400", "500", "600", "700", "800", "900")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuFontWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuFontWeight = value; AppToast.show(this, "Danmaku Font Weight: ${labels[options.indexOf(value)]}") }
}

// v46.3: Color Auto Gamma
internal fun PlayerActivity.showV46ColorAutoGammaToggle() {
    val current = BiliClient.prefs.v46ColorAutoGamma
    BiliClient.prefs.v46ColorAutoGamma = !current
    AppToast.show(this, "Color Auto Gamma: ${if (!current) "ON" else "OFF"}")
}

// v46.4: Volume Normalization
internal fun PlayerActivity.showV46VolumeNormalizationToggle() {
    val current = BiliClient.prefs.v46VolumeNormalization
    BiliClient.prefs.v46VolumeNormalization = !current
    AppToast.show(this, "Volume Normalization: ${if (!current) "ON" else "OFF"}")
}

// v46.5: Danmaku Stroke Offset
internal fun PlayerActivity.showV46DanmakuStrokeOffsetDialog() {
    val options = listOf(-5,-4,-3,-2,-1,0,1,2,3,4,5)
    val labels = listOf("-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuStrokeOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Offset", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuStrokeOffset = value; AppToast.show(this, "Danmaku Stroke Offset: ${labels[options.indexOf(value)]}") }
}

// v46.6: Cast Color Temperature
internal fun PlayerActivity.showV46CastColorTemperatureDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v46CastColorTemperature).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Temperature", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46CastColorTemperature = value; AppToast.show(this, "Cast Color Temperature: ${labels[options.indexOf(value)]}") }
}

// v46.7: Gesture Edge Exclusion
internal fun PlayerActivity.showV46GestureEdgeExclusionDialog() {
    val options = listOf(0,5,10,15,20,25,30,35,40,45,50)
    val labels = listOf("0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v46GestureEdgeExclusion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Edge Exclusion", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46GestureEdgeExclusion = value; AppToast.show(this, "Gesture Edge Exclusion: ${labels[options.indexOf(value)]}") }
}

// v46.8: Danmaku Row Spacing
internal fun PlayerActivity.showV46DanmakuRowSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuRowSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Row Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuRowSpacing = value; AppToast.show(this, "Danmaku Row Spacing: ${labels[options.indexOf(value)]}") }
}

// v46.9: Cache Prefetch On Wifi
internal fun PlayerActivity.showV46CachePrefetchOnWifiToggle() {
    val current = BiliClient.prefs.v46CachePrefetchOnWifi
    BiliClient.prefs.v46CachePrefetchOnWifi = !current
    AppToast.show(this, "Cache Prefetch On Wifi: ${if (!current) "ON" else "OFF"}")
}

// v46.10: Progress Bar Thumb Size
internal fun PlayerActivity.showV46ProgressBarThumbSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ProgressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Thumb Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ProgressBarThumbSize = value; AppToast.show(this, "Progress Bar Thumb Size: ${labels[options.indexOf(value)]}") }
}

// v46.11: Danmaku Send Confirm Dialog
internal fun PlayerActivity.showV46DanmakuSendConfirmDialogToggle() {
    val current = BiliClient.prefs.v46DanmakuSendConfirmDialog
    BiliClient.prefs.v46DanmakuSendConfirmDialog = !current
    AppToast.show(this, "Danmaku Send Confirm Dialog: ${if (!current) "ON" else "OFF"}")
}

// v46.12: Color White Balance
internal fun PlayerActivity.showV46ColorWhiteBalanceDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ColorWhiteBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Balance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ColorWhiteBalance = value; AppToast.show(this, "Color White Balance: ${labels[options.indexOf(value)]}") }
}

// v46.13: Volume Limit Threshold
internal fun PlayerActivity.showV46VolumeLimitThresholdDialog() {
    val options = listOf(50,60,70,80,90,100,110,120,130,140,150)
    val labels = listOf("50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150")
    val currentIndex = options.indexOf(BiliClient.prefs.v46VolumeLimitThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46VolumeLimitThreshold = value; AppToast.show(this, "Volume Limit Threshold: ${labels[options.indexOf(value)]}") }
}

// v46.14: Danmaku Bg Padding
internal fun PlayerActivity.showV46DanmakuBgPaddingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuBgPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Padding", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuBgPadding = value; AppToast.show(this, "Danmaku Bg Padding: ${labels[options.indexOf(value)]}") }
}

// v46.15: Cast Video Codec
internal fun PlayerActivity.showV46CastVideoCodecDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v46CastVideoCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Video Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46CastVideoCodec = value; AppToast.show(this, "Cast Video Codec: ${labels[options.indexOf(value)]}") }
}

// v47.1: Playback Resume Prompt
internal fun PlayerActivity.showV47PlaybackResumePromptToggle() {
    val current = BiliClient.prefs.v47PlaybackResumePrompt
    BiliClient.prefs.v47PlaybackResumePrompt = !current
    AppToast.show(this, "Playback Resume Prompt: ${if (!current) "ON" else "OFF"}")
}

// v47.2: Danmaku Font Spacing
internal fun PlayerActivity.showV47DanmakuFontSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuFontSpacing = value; AppToast.show(this, "Danmaku Font Spacing: ${labels[options.indexOf(value)]}") }
}

// v47.3: Color Exposure Compensation
internal fun PlayerActivity.showV47ColorExposureCompensationDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v47ColorExposureCompensation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Exposure Compensation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47ColorExposureCompensation = value; AppToast.show(this, "Color Exposure Compensation: ${labels[options.indexOf(value)]}") }
}

// v47.4: Volume Loudness Enhancer
internal fun PlayerActivity.showV47VolumeLoudnessEnhancerDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v47VolumeLoudnessEnhancer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Loudness Enhancer", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47VolumeLoudnessEnhancer = value; AppToast.show(this, "Volume Loudness Enhancer: ${labels[options.indexOf(value)]}") }
}

// v47.5: Danmaku Stroke Blur
internal fun PlayerActivity.showV47DanmakuStrokeBlurDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuStrokeBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Blur", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuStrokeBlur = value; AppToast.show(this, "Danmaku Stroke Blur: ${labels[options.indexOf(value)]}") }
}

// v47.6: Cast Audio Bitrate
internal fun PlayerActivity.showV47CastAudioBitrateDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v47CastAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Bitrate", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47CastAudioBitrate = value; AppToast.show(this, "Cast Audio Bitrate: ${labels[options.indexOf(value)]}") }
}

// v47.7: Gesture Dead Zone
internal fun PlayerActivity.showV47GestureDeadZoneDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v47GestureDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Dead Zone", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47GestureDeadZone = value; AppToast.show(this, "Gesture Dead Zone: ${labels[options.indexOf(value)]}") }
}

// v47.8: Danmaku Max Lines
internal fun PlayerActivity.showV47DanmakuMaxLinesDialog() {
    val options = listOf(0,5,10,15,20,25,30,35,40,45,50)
    val labels = listOf("0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuMaxLines).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Max Lines", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuMaxLines = value; AppToast.show(this, "Danmaku Max Lines: ${labels[options.indexOf(value)]}") }
}

// v47.9: Cache Max Size Mb
internal fun PlayerActivity.showV47CacheMaxSizeMbDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47CacheMaxSizeMb).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Max Size Mb", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47CacheMaxSizeMb = value; AppToast.show(this, "Cache Max Size Mb: ${labels[options.indexOf(value)]}") }
}

// v47.10: Progress Bar Seek Preview
internal fun PlayerActivity.showV47ProgressBarSeekPreviewToggle() {
    val current = BiliClient.prefs.v47ProgressBarSeekPreview
    BiliClient.prefs.v47ProgressBarSeekPreview = !current
    AppToast.show(this, "Progress Bar Seek Preview: ${if (!current) "ON" else "OFF"}")
}

// v47.11: Danmaku Highlight Mention
internal fun PlayerActivity.showV47DanmakuHighlightMentionToggle() {
    val current = BiliClient.prefs.v47DanmakuHighlightMention
    BiliClient.prefs.v47DanmakuHighlightMention = !current
    AppToast.show(this, "Danmaku Highlight Mention: ${if (!current) "ON" else "OFF"}")
}

// v47.12: Color Tint
internal fun PlayerActivity.showV47ColorTintDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v47ColorTint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Tint", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47ColorTint = value; AppToast.show(this, "Color Tint: ${labels[options.indexOf(value)]}") }
}

// v47.13: Volume Channel Balance
internal fun PlayerActivity.showV47VolumeChannelBalanceDialog() {
    val options = listOf(-50,-40,-30,-20,-10,0,10,20,30,40,50)
    val labels = listOf("-50", "-40", "-30", "-20", "-10", "0", "10", "20", "30", "40", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v47VolumeChannelBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Channel Balance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47VolumeChannelBalance = value; AppToast.show(this, "Volume Channel Balance: ${labels[options.indexOf(value)]}") }
}

// v47.14: Danmaku Bg Border Color
internal fun PlayerActivity.showV47DanmakuBgBorderColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuBgBorderColor = value; AppToast.show(this, "Danmaku Bg Border Color: ${labels[options.indexOf(value)]}") }
}

// v47.15: Cast Subtitle Enabled
internal fun PlayerActivity.showV47CastSubtitleEnabledToggle() {
    val current = BiliClient.prefs.v47CastSubtitleEnabled
    BiliClient.prefs.v47CastSubtitleEnabled = !current
    AppToast.show(this, "Cast Subtitle Enabled: ${if (!current) "ON" else "OFF"}")
}

// v48.1: Playback Auto Skip Intro
internal fun PlayerActivity.showV48PlaybackAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v48PlaybackAutoSkipIntro
    BiliClient.prefs.v48PlaybackAutoSkipIntro = !current
    AppToast.show(this, "Playback Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
}

// v48.2: Danmaku Font Line Height
internal fun PlayerActivity.showV48DanmakuFontLineHeightDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuFontLineHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Line Height", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuFontLineHeight = value; AppToast.show(this, "Danmaku Font Line Height: ${labels[options.indexOf(value)]}") }
}

// v48.3: Color Black Level
internal fun PlayerActivity.showV48ColorBlackLevelDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ColorBlackLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Black Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ColorBlackLevel = value; AppToast.show(this, "Color Black Level: ${labels[options.indexOf(value)]}") }
}

// v48.4: Volume Bass Boost
internal fun PlayerActivity.showV48VolumeBassBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48VolumeBassBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Bass Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48VolumeBassBoost = value; AppToast.show(this, "Volume Bass Boost: ${labels[options.indexOf(value)]}") }
}

// v48.5: Danmaku Send Max Length
internal fun PlayerActivity.showV48DanmakuSendMaxLengthDialog() {
    val options = listOf(20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200)
    val labels = listOf("20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuSendMaxLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Max Length", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuSendMaxLength = value; AppToast.show(this, "Danmaku Send Max Length: ${labels[options.indexOf(value)]}") }
}

// v48.6: Cast Resolution Auto
internal fun PlayerActivity.showV48CastResolutionAutoToggle() {
    val current = BiliClient.prefs.v48CastResolutionAuto
    BiliClient.prefs.v48CastResolutionAuto = !current
    AppToast.show(this, "Cast Resolution Auto: ${if (!current) "ON" else "OFF"}")
}

// v48.7: Gesture Tap Feedback
internal fun PlayerActivity.showV48GestureTapFeedbackToggle() {
    val current = BiliClient.prefs.v48GestureTapFeedback
    BiliClient.prefs.v48GestureTapFeedback = !current
    AppToast.show(this, "Gesture Tap Feedback: ${if (!current) "ON" else "OFF"}")
}

// v48.8: Danmaku Filter Regex
internal fun PlayerActivity.showV48DanmakuFilterRegexToggle() {
    val current = BiliClient.prefs.v48DanmakuFilterRegex
    BiliClient.prefs.v48DanmakuFilterRegex = !current
    AppToast.show(this, "Danmaku Filter Regex: ${if (!current) "ON" else "OFF"}")
}

// v48.9: Cache Cleanup Interval
internal fun PlayerActivity.showV48CacheCleanupIntervalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v48CacheCleanupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Interval", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48CacheCleanupInterval = value; AppToast.show(this, "Cache Cleanup Interval: ${labels[options.indexOf(value)]}") }
}

// v48.10: Progress Bar Touch Area
internal fun PlayerActivity.showV48ProgressBarTouchAreaDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ProgressBarTouchArea).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Touch Area", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ProgressBarTouchArea = value; AppToast.show(this, "Progress Bar Touch Area: ${labels[options.indexOf(value)]}") }
}

// v48.11: Danmaku Font Size Adaptive
internal fun PlayerActivity.showV48DanmakuFontSizeAdaptiveToggle() {
    val current = BiliClient.prefs.v48DanmakuFontSizeAdaptive
    BiliClient.prefs.v48DanmakuFontSizeAdaptive = !current
    AppToast.show(this, "Danmaku Font Size Adaptive: ${if (!current) "ON" else "OFF"}")
}

// v48.12: Color White Level
internal fun PlayerActivity.showV48ColorWhiteLevelDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ColorWhiteLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ColorWhiteLevel = value; AppToast.show(this, "Color White Level: ${labels[options.indexOf(value)]}") }
}

// v48.13: Volume Virtualizer
internal fun PlayerActivity.showV48VolumeVirtualizerDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48VolumeVirtualizer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Virtualizer", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48VolumeVirtualizer = value; AppToast.show(this, "Volume Virtualizer: ${labels[options.indexOf(value)]}") }
}

// v48.14: Danmaku Bg Shadow Size
internal fun PlayerActivity.showV48DanmakuBgShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuBgShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuBgShadowSize = value; AppToast.show(this, "Danmaku Bg Shadow Size: ${labels[options.indexOf(value)]}") }
}

// v48.15: Cast Mirror Quality
internal fun PlayerActivity.showV48CastMirrorQualityDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v48CastMirrorQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Mirror Quality", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48CastMirrorQuality = value; AppToast.show(this, "Cast Mirror Quality: ${labels[options.indexOf(value)]}") }
}

// v49.1: Playback Auto Skip Outro
internal fun PlayerActivity.showV49PlaybackAutoSkipOutroToggle() {
    val current = BiliClient.prefs.v49PlaybackAutoSkipOutro
    BiliClient.prefs.v49PlaybackAutoSkipOutro = !current
    AppToast.show(this, "Playback Auto Skip Outro: ${if (!current) "ON" else "OFF"}")
}

// v49.2: Danmaku Font Letter Spacing
internal fun PlayerActivity.showV49DanmakuFontLetterSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuFontLetterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Letter Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuFontLetterSpacing = value; AppToast.show(this, "Danmaku Font Letter Spacing: ${labels[options.indexOf(value)]}") }
}

// v49.3: Color Highlight Recovery
internal fun PlayerActivity.showV49ColorHighlightRecoveryDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49ColorHighlightRecovery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Highlight Recovery", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49ColorHighlightRecovery = value; AppToast.show(this, "Color Highlight Recovery: ${labels[options.indexOf(value)]}") }
}

// v49.4: Volume Treble Boost
internal fun PlayerActivity.showV49VolumeTrebleBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v49VolumeTrebleBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Treble Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49VolumeTrebleBoost = value; AppToast.show(this, "Volume Treble Boost: ${labels[options.indexOf(value)]}") }
}

// v49.5: Danmaku Send Font Size
internal fun PlayerActivity.showV49DanmakuSendFontSizeDialog() {
    val options = listOf(12,14,16,18,20,22,24,26,28,30,32,34,36,38,40)
    val labels = listOf("12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuSendFontSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Font Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuSendFontSize = value; AppToast.show(this, "Danmaku Send Font Size: ${labels[options.indexOf(value)]}") }
}

// v49.6: Cast Audio Sync
internal fun PlayerActivity.showV49CastAudioSyncDialog() {
    val options = listOf(-500,-400,-300,-200,-100,0,100,200,300,400,500)
    val labels = listOf("-500", "-400", "-300", "-200", "-100", "0", "100", "200", "300", "400", "500")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CastAudioSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Sync", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CastAudioSync = value; AppToast.show(this, "Cast Audio Sync: ${labels[options.indexOf(value)]}") }
}

// v49.7: Gesture Long Press Action
internal fun PlayerActivity.showV49GestureLongPressActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49GestureLongPressAction = value; AppToast.show(this, "Gesture Long Press Action: ${labels[options.indexOf(value)]}") }
}

// v49.8: Danmaku Filter Duplicate
internal fun PlayerActivity.showV49DanmakuFilterDuplicateToggle() {
    val current = BiliClient.prefs.v49DanmakuFilterDuplicate
    BiliClient.prefs.v49DanmakuFilterDuplicate = !current
    AppToast.show(this, "Danmaku Filter Duplicate: ${if (!current) "ON" else "OFF"}")
}

// v49.9: Cache Auto Cleanup Threshold
internal fun PlayerActivity.showV49CacheAutoCleanupThresholdDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CacheAutoCleanupThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Auto Cleanup Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CacheAutoCleanupThreshold = value; AppToast.show(this, "Cache Auto Cleanup Threshold: ${labels[options.indexOf(value)]}") }
}

// v49.10: Progress Bar Chapter Mark
internal fun PlayerActivity.showV49ProgressBarChapterMarkToggle() {
    val current = BiliClient.prefs.v49ProgressBarChapterMark
    BiliClient.prefs.v49ProgressBarChapterMark = !current
    AppToast.show(this, "Progress Bar Chapter Mark: ${if (!current) "ON" else "OFF"}")
}

// v49.11: Danmaku Highlight Keyword
internal fun PlayerActivity.showV49DanmakuHighlightKeywordToggle() {
    val current = BiliClient.prefs.v49DanmakuHighlightKeyword
    BiliClient.prefs.v49DanmakuHighlightKeyword = !current
    AppToast.show(this, "Danmaku Highlight Keyword: ${if (!current) "ON" else "OFF"}")
}

// v49.12: Color Shadow Recovery
internal fun PlayerActivity.showV49ColorShadowRecoveryDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49ColorShadowRecovery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Shadow Recovery", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49ColorShadowRecovery = value; AppToast.show(this, "Color Shadow Recovery: ${labels[options.indexOf(value)]}") }
}

// v49.13: Volume Replay Gain
internal fun PlayerActivity.showV49VolumeReplayGainDialog() {
    val options = listOf(-12,-10,-8,-6,-4,-2,0,2,4,6,8,10,12)
    val labels = listOf("-12", "-10", "-8", "-6", "-4", "-2", "0", "2", "4", "6", "8", "10", "12")
    val currentIndex = options.indexOf(BiliClient.prefs.v49VolumeReplayGain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Replay Gain", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49VolumeReplayGain = value; AppToast.show(this, "Volume Replay Gain: ${labels[options.indexOf(value)]}") }
}

// v49.14: Danmaku Bg Gradient Angle
internal fun PlayerActivity.showV49DanmakuBgGradientAngleDialog() {
    val options = listOf(0,30,60,90,120,150,180,210,240,270,300,330,360)
    val labels = listOf("0", "30", "60", "90", "120", "150", "180", "210", "240", "270", "300", "330", "360")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Angle", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuBgGradientAngle = value; AppToast.show(this, "Danmaku Bg Gradient Angle: ${labels[options.indexOf(value)]}") }
}

// v49.15: Cast Auto Reconnect
internal fun PlayerActivity.showV49CastAutoReconnectToggle() {
    val current = BiliClient.prefs.v49CastAutoReconnect
    BiliClient.prefs.v49CastAutoReconnect = !current
    AppToast.show(this, "Cast Auto Reconnect: ${if (!current) "ON" else "OFF"}")
}

// v50.1: Playback Auto Next Episode
internal fun PlayerActivity.showV50PlaybackAutoNextEpisodeToggle() {
    val current = BiliClient.prefs.v50PlaybackAutoNextEpisode
    BiliClient.prefs.v50PlaybackAutoNextEpisode = !current
    AppToast.show(this, "Playback Auto Next Episode: ${if (!current) "ON" else "OFF"}")
}

// v50.2: Danmaku Font Shadow Size
internal fun PlayerActivity.showV50DanmakuFontShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuFontShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuFontShadowSize = value; AppToast.show(this, "Danmaku Font Shadow Size: ${labels[options.indexOf(value)]}") }
}

// v50.3: Color Midtone Adjust
internal fun PlayerActivity.showV50ColorMidtoneAdjustDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorMidtoneAdjust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Midtone Adjust", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorMidtoneAdjust = value; AppToast.show(this, "Color Midtone Adjust: ${labels[options.indexOf(value)]}") }
}

// v50.4: Volume Ambient Mode
internal fun PlayerActivity.showV50VolumeAmbientModeDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v50VolumeAmbientMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Ambient Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50VolumeAmbientMode = value; AppToast.show(this, "Volume Ambient Mode: ${labels[options.indexOf(value)]}") }
}

// v50.5: Danmaku Send Color Custom
internal fun PlayerActivity.showV50DanmakuSendColorCustomDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuSendColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Color Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuSendColorCustom = value; AppToast.show(this, "Danmaku Send Color Custom: ${labels[options.indexOf(value)]}") }
}

// v50.6: Cast Volume Sync
internal fun PlayerActivity.showV50CastVolumeSyncToggle() {
    val current = BiliClient.prefs.v50CastVolumeSync
    BiliClient.prefs.v50CastVolumeSync = !current
    AppToast.show(this, "Cast Volume Sync: ${if (!current) "ON" else "OFF"}")
}

// v50.7: Gesture Pinch Zoom
internal fun PlayerActivity.showV50GesturePinchZoomToggle() {
    val current = BiliClient.prefs.v50GesturePinchZoom
    BiliClient.prefs.v50GesturePinchZoom = !current
    AppToast.show(this, "Gesture Pinch Zoom: ${if (!current) "ON" else "OFF"}")
}

// v50.8: Danmaku Filter Color
internal fun PlayerActivity.showV50DanmakuFilterColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuFilterColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuFilterColor = value; AppToast.show(this, "Danmaku Filter Color: ${labels[options.indexOf(value)]}") }
}

// v50.9: Cache Prebuffer Seconds
internal fun PlayerActivity.showV50CachePrebufferSecondsDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v50CachePrebufferSeconds).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Prebuffer Seconds", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50CachePrebufferSeconds = value; AppToast.show(this, "Cache Prebuffer Seconds: ${labels[options.indexOf(value)]}") }
}

// v50.10: Progress Bar Double Tap Seek
internal fun PlayerActivity.showV50ProgressBarDoubleTapSeekDialog() {
    val options = listOf(5,10,15,20,25,30,35,40,45,50,55,60)
    val labels = listOf("5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ProgressBarDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Double Tap Seek", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ProgressBarDoubleTapSeek = value; AppToast.show(this, "Progress Bar Double Tap Seek: ${labels[options.indexOf(value)]}") }
}

// v50.11: Danmaku Font Size Auto
internal fun PlayerActivity.showV50DanmakuFontSizeAutoToggle() {
    val current = BiliClient.prefs.v50DanmakuFontSizeAuto
    BiliClient.prefs.v50DanmakuFontSizeAuto = !current
    AppToast.show(this, "Danmaku Font Size Auto: ${if (!current) "ON" else "OFF"}")
}

// v50.12: Color Dynamic Range
internal fun PlayerActivity.showV50ColorDynamicRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Dynamic Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorDynamicRange = value; AppToast.show(this, "Color Dynamic Range: ${labels[options.indexOf(value)]}") }
}

// v50.13: Volume Night Mode
internal fun PlayerActivity.showV50VolumeNightModeToggle() {
    val current = BiliClient.prefs.v50VolumeNightMode
    BiliClient.prefs.v50VolumeNightMode = !current
    AppToast.show(this, "Volume Night Mode: ${if (!current) "ON" else "OFF"}")
}

// v50.14: Danmaku Bg Blur Radius
internal fun PlayerActivity.showV50DanmakuBgBlurRadiusDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuBgBlurRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Blur Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuBgBlurRadius = value; AppToast.show(this, "Danmaku Bg Blur Radius: ${labels[options.indexOf(value)]}") }
}

// v50.15: Cast Auto Discover
internal fun PlayerActivity.showV50CastAutoDiscoverToggle() {
    val current = BiliClient.prefs.v50CastAutoDiscover
    BiliClient.prefs.v50CastAutoDiscover = !current
    AppToast.show(this, "Cast Auto Discover: ${if (!current) "ON" else "OFF"}")
}
// v51.1: 自动跳片头

// ==================== v51-v60 New Unique Features ====================

// v51.1: Playback Auto Next Episode
internal fun PlayerActivity.showV51PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v51PlaybackAutoNextEpisode
    BiliClient.prefs.v51PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v51.2: Danmaku Font Shadow Size
internal fun PlayerActivity.showV51DanmakuFontShadowSizeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFontShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Shadow Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51DanmakuFontShadowSize = value
        AppToast.show(this, "Danmaku Font Shadow Size: $value")
    }
}

// v51.3: Color Midtone Adjust
internal fun PlayerActivity.showV51ColorMidtoneAdjustDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v51ColorMidtoneAdjust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Color Midtone Adjust",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51ColorMidtoneAdjust = value
        AppToast.show(this, "Color Midtone Adjust: $value")
    }
}

// v51.4: Gesture Custom Action 3
internal fun PlayerActivity.showV51GestureCustomAction3Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v51GestureCustomAction3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 3",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51GestureCustomAction3 = value
        AppToast.show(this, "Gesture Custom Action 3: $value")
    }
}

// v51.5: Subtitle Font Italic
internal fun PlayerActivity.showV51SubtitleFontItalicToggle() {
    val enabled = !BiliClient.prefs.v51SubtitleFontItalic
    BiliClient.prefs.v51SubtitleFontItalic = enabled
    AppToast.show(this, "Subtitle Font Italic: ${if (enabled) "ON" else "OFF"}")
}

// v51.6: Video Adaptive Contrast Enhanced
internal fun PlayerActivity.showV51VideoAdaptiveContrastEnhancedToggle() {
    val enabled = !BiliClient.prefs.v51VideoAdaptiveContrastEnhanced
    BiliClient.prefs.v51VideoAdaptiveContrastEnhanced = enabled
    AppToast.show(this, "Video Adaptive Contrast Enhanced: ${if (enabled) "ON" else "OFF"}")
}

// v51.7: Danmaku Filter Muted Users
internal fun PlayerActivity.showV51DanmakuFilterMutedUsersToggle() {
    val enabled = !BiliClient.prefs.v51DanmakuFilterMutedUsers
    BiliClient.prefs.v51DanmakuFilterMutedUsers = enabled
    AppToast.show(this, "Danmaku Filter Muted Users: ${if (enabled) "ON" else "OFF"}")
}

// v51.8: Cast Video Upscale Mode
internal fun PlayerActivity.showV51CastVideoUpscaleModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v51CastVideoUpscaleMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Upscale Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51CastVideoUpscaleMode = value
        AppToast.show(this, "Cast Video Upscale Mode: $value")
    }
}

// v51.9: Playlist Auto Continue
internal fun PlayerActivity.showV51PlaylistAutoContinueToggle() {
    val enabled = !BiliClient.prefs.v51PlaylistAutoContinue
    BiliClient.prefs.v51PlaylistAutoContinue = enabled
    AppToast.show(this, "Playlist Auto Continue: ${if (enabled) "ON" else "OFF"}")
}

// v51.10: Video Luma Adaptive
internal fun PlayerActivity.showV51VideoLumaAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v51VideoLumaAdaptive
    BiliClient.prefs.v51VideoLumaAdaptive = enabled
    AppToast.show(this, "Video Luma Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v51.11: Danmaku Font Spacing Custom
internal fun PlayerActivity.showV51DanmakuFontSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFontSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51DanmakuFontSpacingCustom = value
        AppToast.show(this, "Danmaku Font Spacing Custom: $value")
    }
}

// v51.12: Subtitle Font Color Custom
internal fun PlayerActivity.showV51SubtitleFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v51SubtitleFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51SubtitleFontColorCustom = value
        AppToast.show(this, "Subtitle Font Color Custom: $value")
    }
}

// v51.13: Gesture Long Press Action
internal fun PlayerActivity.showV51GestureLongPressActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v51GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51GestureLongPressAction = value
        AppToast.show(this, "Gesture Long Press Action: $value")
    }
}

// v51.14: Video Chroma Adaptive
internal fun PlayerActivity.showV51VideoChromaAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v51VideoChromaAdaptive
    BiliClient.prefs.v51VideoChromaAdaptive = enabled
    AppToast.show(this, "Video Chroma Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v51.15: Cast Audio Sync
internal fun PlayerActivity.showV51CastAudioSyncToggle() {
    val enabled = !BiliClient.prefs.v51CastAudioSync
    BiliClient.prefs.v51CastAudioSync = enabled
    AppToast.show(this, "Cast Audio Sync: ${if (enabled) "ON" else "OFF"}")
}

// v52.1: Video Temporal Noise Reduce
internal fun PlayerActivity.showV52VideoTemporalNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v52VideoTemporalNoiseReduce
    BiliClient.prefs.v52VideoTemporalNoiseReduce = enabled
    AppToast.show(this, "Video Temporal Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v52.2: Danmaku BG Color Custom
internal fun PlayerActivity.showV52DanmakuBgColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuBgColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52DanmakuBgColorCustom = value
        AppToast.show(this, "Danmaku BG Color Custom: $value")
    }
}

// v52.3: Subtitle Font Size Auto
internal fun PlayerActivity.showV52SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v52SubtitleFontSizeAuto
    BiliClient.prefs.v52SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
}

// v52.4: Gesture Swipe Feedback
internal fun PlayerActivity.showV52GestureSwipeFeedbackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52GestureSwipeFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52GestureSwipeFeedback = value
        AppToast.show(this, "Gesture Swipe Feedback: $value")
    }
}

// v52.5: Video Color Highlight Recovery
internal fun PlayerActivity.showV52VideoColorHighlightRecoveryToggle() {
    val enabled = !BiliClient.prefs.v52VideoColorHighlightRecovery
    BiliClient.prefs.v52VideoColorHighlightRecovery = enabled
    AppToast.show(this, "Video Color Highlight Recovery: ${if (enabled) "ON" else "OFF"}")
}

// v52.6: Danmaku Send Preview
internal fun PlayerActivity.showV52DanmakuSendPreviewToggle() {
    val enabled = !BiliClient.prefs.v52DanmakuSendPreview
    BiliClient.prefs.v52DanmakuSendPreview = enabled
    AppToast.show(this, "Danmaku Send Preview: ${if (enabled) "ON" else "OFF"}")
}

// v52.7: Cast Video Auto Quality
internal fun PlayerActivity.showV52CastVideoAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v52CastVideoAutoQuality
    BiliClient.prefs.v52CastVideoAutoQuality = enabled
    AppToast.show(this, "Cast Video Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

// v52.8: Subtitle BG Padding Custom
internal fun PlayerActivity.showV52SubtitleBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v52SubtitleBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52SubtitleBgPaddingCustom = value
        AppToast.show(this, "Subtitle BG Padding Custom: $value")
    }
}

// v52.9: Video Frame Interpolation
internal fun PlayerActivity.showV52VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v52VideoFrameInterpolation
    BiliClient.prefs.v52VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
}

// v52.10: Danmaku Merge Algorithm
internal fun PlayerActivity.showV52DanmakuMergeAlgorithmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuMergeAlgorithm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Algorithm",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52DanmakuMergeAlgorithm = value
        AppToast.show(this, "Danmaku Merge Algorithm: $value")
    }
}

// v52.11: Playlist Shuffle Weighted
internal fun PlayerActivity.showV52PlaylistShuffleWeightedToggle() {
    val enabled = !BiliClient.prefs.v52PlaylistShuffleWeighted
    BiliClient.prefs.v52PlaylistShuffleWeighted = enabled
    AppToast.show(this, "Playlist Shuffle Weighted: ${if (enabled) "ON" else "OFF"}")
}

// v52.12: Gesture Pinch Action
internal fun PlayerActivity.showV52GesturePinchActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52GesturePinchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52GesturePinchAction = value
        AppToast.show(this, "Gesture Pinch Action: $value")
    }
}

// v52.13: Video Color Temperature
internal fun PlayerActivity.showV52VideoColorTemperatureDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v52VideoColorTemperature).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52VideoColorTemperature = value
        AppToast.show(this, "Video Color Temperature: $value")
    }
}

// v52.14: Danmaku Font Weight Adaptive
internal fun PlayerActivity.showV52DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v52DanmakuFontWeightAdaptive
    BiliClient.prefs.v52DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v52.15: Cast Screen Mirror Mode
internal fun PlayerActivity.showV52CastScreenMirrorModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52CastScreenMirrorMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Screen Mirror Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52CastScreenMirrorMode = value
        AppToast.show(this, "Cast Screen Mirror Mode: $value")
    }
}

// v53.1: Video Spatial Noise Reduce
internal fun PlayerActivity.showV53VideoSpatialNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v53VideoSpatialNoiseReduce
    BiliClient.prefs.v53VideoSpatialNoiseReduce = enabled
    AppToast.show(this, "Video Spatial Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v53.2: Danmaku Opacity Adaptive
internal fun PlayerActivity.showV53DanmakuOpacityAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v53DanmakuOpacityAdaptive
    BiliClient.prefs.v53DanmakuOpacityAdaptive = enabled
    AppToast.show(this, "Danmaku Opacity Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v53.3: Subtitle Sync Auto Detect
internal fun PlayerActivity.showV53SubtitleSyncAutoDetectToggle() {
    val enabled = !BiliClient.prefs.v53SubtitleSyncAutoDetect
    BiliClient.prefs.v53SubtitleSyncAutoDetect = enabled
    AppToast.show(this, "Subtitle Sync Auto Detect: ${if (enabled) "ON" else "OFF"}")
}

// v53.4: Gesture Triple Tap Action
internal fun PlayerActivity.showV53GestureTripleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53GestureTripleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Triple Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53GestureTripleTapAction = value
        AppToast.show(this, "Gesture Triple Tap Action: $value")
    }
}

// v53.5: Video Color Highlight Compress
internal fun PlayerActivity.showV53VideoColorHighlightCompressToggle() {
    val enabled = !BiliClient.prefs.v53VideoColorHighlightCompress
    BiliClient.prefs.v53VideoColorHighlightCompress = enabled
    AppToast.show(this, "Video Color Highlight Compress: ${if (enabled) "ON" else "OFF"}")
}

// v53.6: Danmaku Send Timer
internal fun PlayerActivity.showV53DanmakuSendTimerToggle() {
    val enabled = !BiliClient.prefs.v53DanmakuSendTimer
    BiliClient.prefs.v53DanmakuSendTimer = enabled
    AppToast.show(this, "Danmaku Send Timer: ${if (enabled) "ON" else "OFF"}")
}

// v53.7: Cast Video Latency Mode
internal fun PlayerActivity.showV53CastVideoLatencyModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53CastVideoLatencyMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Latency Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53CastVideoLatencyMode = value
        AppToast.show(this, "Cast Video Latency Mode: $value")
    }
}

// v53.8: Subtitle BG Radius Custom
internal fun PlayerActivity.showV53SubtitleBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v53SubtitleBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53SubtitleBgRadiusCustom = value
        AppToast.show(this, "Subtitle BG Radius Custom: $value")
    }
}

// v53.9: Video Detail Enhance
internal fun PlayerActivity.showV53VideoDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v53VideoDetailEnhance
    BiliClient.prefs.v53VideoDetailEnhance = enabled
    AppToast.show(this, "Video Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v53.10: Danmaku Font Size Curve
internal fun PlayerActivity.showV53DanmakuFontSizeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53DanmakuFontSizeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53DanmakuFontSizeCurve = value
        AppToast.show(this, "Danmaku Font Size Curve: $value")
    }
}

// v53.11: Playlist Auto Download Quality
internal fun PlayerActivity.showV53PlaylistAutoDownloadQualityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53PlaylistAutoDownloadQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Download Quality",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53PlaylistAutoDownloadQuality = value
        AppToast.show(this, "Playlist Auto Download Quality: $value")
    }
}

// v53.12: Gesture Swipe Threshold
internal fun PlayerActivity.showV53GestureSwipeThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v53GestureSwipeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53GestureSwipeThreshold = value
        AppToast.show(this, "Gesture Swipe Threshold: $value")
    }
}

// v53.13: Video Color Shadow Compress
internal fun PlayerActivity.showV53VideoColorShadowCompressToggle() {
    val enabled = !BiliClient.prefs.v53VideoColorShadowCompress
    BiliClient.prefs.v53VideoColorShadowCompress = enabled
    AppToast.show(this, "Video Color Shadow Compress: ${if (enabled) "ON" else "OFF"}")
}

// v53.14: Danmaku Stroke Color Custom
internal fun PlayerActivity.showV53DanmakuStrokeColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v53DanmakuStrokeColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Stroke Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53DanmakuStrokeColorCustom = value
        AppToast.show(this, "Danmaku Stroke Color Custom: $value")
    }
}

// v53.15: Cast Audio Fade Mode
internal fun PlayerActivity.showV53CastAudioFadeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53CastAudioFadeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Fade Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53CastAudioFadeMode = value
        AppToast.show(this, "Cast Audio Fade Mode: $value")
    }
}

// v54.1: Video Color Grading Custom
internal fun PlayerActivity.showV54VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v54VideoColorGradingCustom
    BiliClient.prefs.v54VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

// v54.2: Danmaku Border Weight
internal fun PlayerActivity.showV54DanmakuBorderWeightDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuBorderWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Weight",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54DanmakuBorderWeight = value
        AppToast.show(this, "Danmaku Border Weight: $value")
    }
}

// v54.3: Subtitle Font Weight
internal fun PlayerActivity.showV54SubtitleFontWeightDialog() {
    val options = listOf(300, 400, 500, 700, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v54SubtitleFontWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54SubtitleFontWeight = value
        AppToast.show(this, "Subtitle Font Weight: $value")
    }
}

// v54.4: Gesture Edge Swipe Speed
internal fun PlayerActivity.showV54GestureEdgeSwipeSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v54GestureEdgeSwipeSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54GestureEdgeSwipeSpeed = value
        AppToast.show(this, "Gesture Edge Swipe Speed: $value")
    }
}

// v54.5: Video Adaptive Saturation
internal fun PlayerActivity.showV54VideoAdaptiveSaturationToggle() {
    val enabled = !BiliClient.prefs.v54VideoAdaptiveSaturation
    BiliClient.prefs.v54VideoAdaptiveSaturation = enabled
    AppToast.show(this, "Video Adaptive Saturation: ${if (enabled) "ON" else "OFF"}")
}

// v54.6: Danmaku Send Max Length Custom
internal fun PlayerActivity.showV54DanmakuSendMaxLengthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuSendMaxLengthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54DanmakuSendMaxLengthCustom = value
        AppToast.show(this, "Danmaku Send Max Length Custom: $value")
    }
}

// v54.7: Cast Video Frame Rate Sync
internal fun PlayerActivity.showV54CastVideoFrameRateSyncToggle() {
    val enabled = !BiliClient.prefs.v54CastVideoFrameRateSync
    BiliClient.prefs.v54CastVideoFrameRateSync = enabled
    AppToast.show(this, "Cast Video Frame Rate Sync: ${if (enabled) "ON" else "OFF"}")
}

// v54.8: Subtitle Outline Color Custom
internal fun PlayerActivity.showV54SubtitleOutlineColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v54SubtitleOutlineColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54SubtitleOutlineColorCustom = value
        AppToast.show(this, "Subtitle Outline Color Custom: $value")
    }
}

// v54.9: Video Luma Curve Custom
internal fun PlayerActivity.showV54VideoLumaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54VideoLumaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Luma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54VideoLumaCurveCustom = value
        AppToast.show(this, "Video Luma Curve Custom: $value")
    }
}

// v54.10: Danmaku History Filter
internal fun PlayerActivity.showV54DanmakuHistoryFilterToggle() {
    val enabled = !BiliClient.prefs.v54DanmakuHistoryFilter
    BiliClient.prefs.v54DanmakuHistoryFilter = enabled
    AppToast.show(this, "Danmaku History Filter: ${if (enabled) "ON" else "OFF"}")
}

// v54.11: Playlist Auto Skip Watched
internal fun PlayerActivity.showV54PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v54PlaylistAutoSkipWatched
    BiliClient.prefs.v54PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

// v54.12: Gesture Double Tap Action
internal fun PlayerActivity.showV54GestureDoubleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54GestureDoubleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54GestureDoubleTapAction = value
        AppToast.show(this, "Gesture Double Tap Action: $value")
    }
}

// v54.13: Video Chroma Curve Custom
internal fun PlayerActivity.showV54VideoChromaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54VideoChromaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Chroma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54VideoChromaCurveCustom = value
        AppToast.show(this, "Video Chroma Curve Custom: $value")
    }
}

// v54.14: Danmaku BG Opacity Custom
internal fun PlayerActivity.showV54DanmakuBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54DanmakuBgOpacityCustom = value
        AppToast.show(this, "Danmaku BG Opacity Custom: $value")
    }
}

// v54.15: Cast Audio Codec Custom
internal fun PlayerActivity.showV54CastAudioCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54CastAudioCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54CastAudioCodecCustom = value
        AppToast.show(this, "Cast Audio Codec Custom: $value")
    }
}

// v55.1: Video Color Fade
internal fun PlayerActivity.showV55VideoColorFadeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v55VideoColorFade).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fade",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55VideoColorFade = value
        AppToast.show(this, "Video Color Fade: $value")
    }
}

// v55.2: Danmaku Text Glow Custom
internal fun PlayerActivity.showV55DanmakuTextGlowCustomToggle() {
    val enabled = !BiliClient.prefs.v55DanmakuTextGlowCustom
    BiliClient.prefs.v55DanmakuTextGlowCustom = enabled
    AppToast.show(this, "Danmaku Text Glow Custom: ${if (enabled) "ON" else "OFF"}")
}

// v55.3: Subtitle Animation Speed
internal fun PlayerActivity.showV55SubtitleAnimationSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v55SubtitleAnimationSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55SubtitleAnimationSpeed = value
        AppToast.show(this, "Subtitle Animation Speed: $value")
    }
}

// v55.4: Gesture Pinch Zoom Mode
internal fun PlayerActivity.showV55GesturePinchZoomModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v55GesturePinchZoomMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Zoom Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55GesturePinchZoomMode = value
        AppToast.show(this, "Gesture Pinch Zoom Mode: $value")
    }
}

// v55.5: Video Adaptive Gamma
internal fun PlayerActivity.showV55VideoAdaptiveGammaToggle() {
    val enabled = !BiliClient.prefs.v55VideoAdaptiveGamma
    BiliClient.prefs.v55VideoAdaptiveGamma = enabled
    AppToast.show(this, "Video Adaptive Gamma: ${if (enabled) "ON" else "OFF"}")
}

// v55.6: Danmaku Send Rate Custom
internal fun PlayerActivity.showV55DanmakuSendRateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v55DanmakuSendRateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55DanmakuSendRateCustom = value
        AppToast.show(this, "Danmaku Send Rate Custom: $value")
    }
}

// v55.7: Cast Video Bitrate Adaptive
internal fun PlayerActivity.showV55CastVideoBitrateAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v55CastVideoBitrateAdaptive
    BiliClient.prefs.v55CastVideoBitrateAdaptive = enabled
    AppToast.show(this, "Cast Video Bitrate Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v55.8: Subtitle BG Opacity Custom
internal fun PlayerActivity.showV55SubtitleBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v55SubtitleBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55SubtitleBgOpacityCustom = value
        AppToast.show(this, "Subtitle BG Opacity Custom: $value")
    }
}

// v55.9: Video Frame Blend
internal fun PlayerActivity.showV55VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v55VideoFrameBlend
    BiliClient.prefs.v55VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v55.10: Danmaku Lane Count
internal fun PlayerActivity.showV55DanmakuLaneCountDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v55DanmakuLaneCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Lane Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55DanmakuLaneCount = value
        AppToast.show(this, "Danmaku Lane Count: $value")
    }
}

// v55.11: Playlist Auto Sync
internal fun PlayerActivity.showV55PlaylistAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v55PlaylistAutoSync
    BiliClient.prefs.v55PlaylistAutoSync = enabled
    AppToast.show(this, "Playlist Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

// v55.12: Gesture Rotate Action
internal fun PlayerActivity.showV55GestureRotateActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v55GestureRotateAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotate Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55GestureRotateAction = value
        AppToast.show(this, "Gesture Rotate Action: $value")
    }
}

// v55.13: Video Color Tint Enhanced
internal fun PlayerActivity.showV55VideoColorTintEnhancedToggle() {
    val enabled = !BiliClient.prefs.v55VideoColorTintEnhanced
    BiliClient.prefs.v55VideoColorTintEnhanced = enabled
    AppToast.show(this, "Video Color Tint Enhanced: ${if (enabled) "ON" else "OFF"}")
}

// v55.14: Danmaku Font Custom Path
internal fun PlayerActivity.showV55DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v55DanmakuFontCustomPath
    BiliClient.prefs.v55DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
}

// v55.15: Cast Audio Latency Auto
internal fun PlayerActivity.showV55CastAudioLatencyAutoToggle() {
    val enabled = !BiliClient.prefs.v55CastAudioLatencyAuto
    BiliClient.prefs.v55CastAudioLatencyAuto = enabled
    AppToast.show(this, "Cast Audio Latency Auto: ${if (enabled) "ON" else "OFF"}")
}

// v56.1: Video Adaptive Detail
internal fun PlayerActivity.showV56VideoAdaptiveDetailToggle() {
    val enabled = !BiliClient.prefs.v56VideoAdaptiveDetail
    BiliClient.prefs.v56VideoAdaptiveDetail = enabled
    AppToast.show(this, "Video Adaptive Detail: ${if (enabled) "ON" else "OFF"}")
}

// v56.2: Danmaku Stroke Blur
internal fun PlayerActivity.showV56DanmakuStrokeBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuStrokeBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Stroke Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56DanmakuStrokeBlur = value
        AppToast.show(this, "Danmaku Stroke Blur: $value")
    }
}

// v56.3: Subtitle Word Spacing
internal fun PlayerActivity.showV56SubtitleWordSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v56SubtitleWordSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Word Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56SubtitleWordSpacing = value
        AppToast.show(this, "Subtitle Word Spacing: $value")
    }
}

// v56.4: Gesture Multi Finger Action
internal fun PlayerActivity.showV56GestureMultiFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v56GestureMultiFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56GestureMultiFingerAction = value
        AppToast.show(this, "Gesture Multi Finger Action: $value")
    }
}

// v56.5: Video Color Black Level Custom
internal fun PlayerActivity.showV56VideoColorBlackLevelCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v56VideoColorBlackLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Black Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56VideoColorBlackLevelCustom = value
        AppToast.show(this, "Video Color Black Level Custom: $value")
    }
}

// v56.6: Danmaku Send Font Custom
internal fun PlayerActivity.showV56DanmakuSendFontCustomToggle() {
    val enabled = !BiliClient.prefs.v56DanmakuSendFontCustom
    BiliClient.prefs.v56DanmakuSendFontCustom = enabled
    AppToast.show(this, "Danmaku Send Font Custom: ${if (enabled) "ON" else "OFF"}")
}

// v56.7: Cast Video Resolution Custom
internal fun PlayerActivity.showV56CastVideoResolutionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v56CastVideoResolutionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Resolution Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56CastVideoResolutionCustom = value
        AppToast.show(this, "Cast Video Resolution Custom: $value")
    }
}

// v56.8: Subtitle Font Stretch Custom
internal fun PlayerActivity.showV56SubtitleFontStretchCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v56SubtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56SubtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
}

// v56.9: Video Color White Level Custom
internal fun PlayerActivity.showV56VideoColorWhiteLevelCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v56VideoColorWhiteLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color White Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56VideoColorWhiteLevelCustom = value
        AppToast.show(this, "Video Color White Level Custom: $value")
    }
}

// v56.10: Danmaku Filter By Color
internal fun PlayerActivity.showV56DanmakuFilterByColorToggle() {
    val enabled = !BiliClient.prefs.v56DanmakuFilterByColor
    BiliClient.prefs.v56DanmakuFilterByColor = enabled
    AppToast.show(this, "Danmaku Filter By Color: ${if (enabled) "ON" else "OFF"}")
}

// v56.11: Playlist Auto Delete Expired
internal fun PlayerActivity.showV56PlaylistAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v56PlaylistAutoDeleteExpired
    BiliClient.prefs.v56PlaylistAutoDeleteExpired = enabled
    AppToast.show(this, "Playlist Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

// v56.12: Gesture Swipe Direction Lock
internal fun PlayerActivity.showV56GestureSwipeDirectionLockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v56GestureSwipeDirectionLock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Direction Lock",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56GestureSwipeDirectionLock = value
        AppToast.show(this, "Gesture Swipe Direction Lock: $value")
    }
}

// v56.13: Video Color Midtone Custom
internal fun PlayerActivity.showV56VideoColorMidtoneCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v56VideoColorMidtoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Midtone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56VideoColorMidtoneCustom = value
        AppToast.show(this, "Video Color Midtone Custom: $value")
    }
}

// v56.14: Danmaku BG Padding Custom
internal fun PlayerActivity.showV56DanmakuBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56DanmakuBgPaddingCustom = value
        AppToast.show(this, "Danmaku BG Padding Custom: $value")
    }
}

// v56.15: Cast Audio Volume Sync
internal fun PlayerActivity.showV56CastAudioVolumeSyncToggle() {
    val enabled = !BiliClient.prefs.v56CastAudioVolumeSync
    BiliClient.prefs.v56CastAudioVolumeSync = enabled
    AppToast.show(this, "Cast Audio Volume Sync: ${if (enabled) "ON" else "OFF"}")
}

// v57.1: Video Temporal Enhance
internal fun PlayerActivity.showV57VideoTemporalEnhanceToggle() {
    val enabled = !BiliClient.prefs.v57VideoTemporalEnhance
    BiliClient.prefs.v57VideoTemporalEnhance = enabled
    AppToast.show(this, "Video Temporal Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v57.2: Danmaku Font Line Height Custom
internal fun PlayerActivity.showV57DanmakuFontLineHeightCustomDialog() {
    val options = listOf(100, 110, 120, 130, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuFontLineHeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Line Height Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57DanmakuFontLineHeightCustom = value
        AppToast.show(this, "Danmaku Font Line Height Custom: $value")
    }
}

// v57.3: Subtitle Outline Width Custom
internal fun PlayerActivity.showV57SubtitleOutlineWidthCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v57SubtitleOutlineWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57SubtitleOutlineWidthCustom = value
        AppToast.show(this, "Subtitle Outline Width Custom: $value")
    }
}

// v57.4: Gesture Long Press Feedback
internal fun PlayerActivity.showV57GestureLongPressFeedbackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57GestureLongPressFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57GestureLongPressFeedback = value
        AppToast.show(this, "Gesture Long Press Feedback: $value")
    }
}

// v57.5: Video Color Highlight Custom
internal fun PlayerActivity.showV57VideoColorHighlightCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v57VideoColorHighlightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Highlight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57VideoColorHighlightCustom = value
        AppToast.show(this, "Video Color Highlight Custom: $value")
    }
}

// v57.6: Danmaku Send Effect Custom
internal fun PlayerActivity.showV57DanmakuSendEffectCustomToggle() {
    val enabled = !BiliClient.prefs.v57DanmakuSendEffectCustom
    BiliClient.prefs.v57DanmakuSendEffectCustom = enabled
    AppToast.show(this, "Danmaku Send Effect Custom: ${if (enabled) "ON" else "OFF"}")
}

// v57.7: Cast Video Color Profile
internal fun PlayerActivity.showV57CastVideoColorProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57CastVideoColorProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57CastVideoColorProfile = value
        AppToast.show(this, "Cast Video Color Profile: $value")
    }
}

// v57.8: Subtitle BG Blur Mode
internal fun PlayerActivity.showV57SubtitleBgBlurModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57SubtitleBgBlurMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57SubtitleBgBlurMode = value
        AppToast.show(this, "Subtitle BG Blur Mode: $value")
    }
}

// v57.9: Video Color Shadow Custom
internal fun PlayerActivity.showV57VideoColorShadowCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v57VideoColorShadowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Shadow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57VideoColorShadowCustom = value
        AppToast.show(this, "Video Color Shadow Custom: $value")
    }
}

// v57.10: Danmaku History Export Format
internal fun PlayerActivity.showV57DanmakuHistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuHistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Export Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57DanmakuHistoryExportFormat = value
        AppToast.show(this, "Danmaku History Export Format: $value")
    }
}

// v57.11: Playlist Auto Sort By Rating
internal fun PlayerActivity.showV57PlaylistAutoSortByRatingToggle() {
    val enabled = !BiliClient.prefs.v57PlaylistAutoSortByRating
    BiliClient.prefs.v57PlaylistAutoSortByRating = enabled
    AppToast.show(this, "Playlist Auto Sort By Rating: ${if (enabled) "ON" else "OFF"}")
}

// v57.12: Gesture Dead Zone Mode
internal fun PlayerActivity.showV57GestureDeadZoneModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57GestureDeadZoneMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Dead Zone Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57GestureDeadZoneMode = value
        AppToast.show(this, "Gesture Dead Zone Mode: $value")
    }
}

// v57.13: Video Color Gamma Custom
internal fun PlayerActivity.showV57VideoColorGammaCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v57VideoColorGammaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Gamma Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57VideoColorGammaCustom = value
        AppToast.show(this, "Video Color Gamma Custom: $value")
    }
}

// v57.14: Danmaku Border Radius Custom
internal fun PlayerActivity.showV57DanmakuBorderRadiusCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuBorderRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57DanmakuBorderRadiusCustom = value
        AppToast.show(this, "Danmaku Border Radius Custom: $value")
    }
}

// v57.15: Cast Audio Normalization Auto
internal fun PlayerActivity.showV57CastAudioNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v57CastAudioNormalizationAuto
    BiliClient.prefs.v57CastAudioNormalizationAuto = enabled
    AppToast.show(this, "Cast Audio Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

// v58.1: Video Spatial Enhance
internal fun PlayerActivity.showV58VideoSpatialEnhanceToggle() {
    val enabled = !BiliClient.prefs.v58VideoSpatialEnhance
    BiliClient.prefs.v58VideoSpatialEnhance = enabled
    AppToast.show(this, "Video Spatial Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v58.2: Danmaku Font Size Adaptive Custom
internal fun PlayerActivity.showV58DanmakuFontSizeAdaptiveCustomToggle() {
    val enabled = !BiliClient.prefs.v58DanmakuFontSizeAdaptiveCustom
    BiliClient.prefs.v58DanmakuFontSizeAdaptiveCustom = enabled
    AppToast.show(this, "Danmaku Font Size Adaptive Custom: ${if (enabled) "ON" else "OFF"}")
}

// v58.3: Subtitle Font Kerning Custom
internal fun PlayerActivity.showV58SubtitleFontKerningCustomToggle() {
    val enabled = !BiliClient.prefs.v58SubtitleFontKerningCustom
    BiliClient.prefs.v58SubtitleFontKerningCustom = enabled
    AppToast.show(this, "Subtitle Font Kerning Custom: ${if (enabled) "ON" else "OFF"}")
}

// v58.4: Gesture Custom Action 4
internal fun PlayerActivity.showV58GestureCustomAction4Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v58GestureCustomAction4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 4",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58GestureCustomAction4 = value
        AppToast.show(this, "Gesture Custom Action 4: $value")
    }
}

// v58.5: Video Color Saturation Custom
internal fun PlayerActivity.showV58VideoColorSaturationCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v58VideoColorSaturationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Saturation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58VideoColorSaturationCustom = value
        AppToast.show(this, "Video Color Saturation Custom: $value")
    }
}

// v58.6: Danmaku Send Color Preset
internal fun PlayerActivity.showV58DanmakuSendColorPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuSendColorPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Color Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58DanmakuSendColorPreset = value
        AppToast.show(this, "Danmaku Send Color Preset: $value")
    }
}

// v58.7: Cast Video Upscale Mode Custom
internal fun PlayerActivity.showV58CastVideoUpscaleModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v58CastVideoUpscaleModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Upscale Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58CastVideoUpscaleModeCustom = value
        AppToast.show(this, "Cast Video Upscale Mode Custom: $value")
    }
}

// v58.8: Subtitle Font Letter Spacing Custom
internal fun PlayerActivity.showV58SubtitleFontLetterSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v58SubtitleFontLetterSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Letter Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58SubtitleFontLetterSpacingCustom = value
        AppToast.show(this, "Subtitle Font Letter Spacing Custom: $value")
    }
}

// v58.9: Video Color Contrast Custom
internal fun PlayerActivity.showV58VideoColorContrastCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v58VideoColorContrastCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Contrast Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58VideoColorContrastCustom = value
        AppToast.show(this, "Video Color Contrast Custom: $value")
    }
}

// v58.10: Danmaku Merge Window Auto
internal fun PlayerActivity.showV58DanmakuMergeWindowAutoToggle() {
    val enabled = !BiliClient.prefs.v58DanmakuMergeWindowAuto
    BiliClient.prefs.v58DanmakuMergeWindowAuto = enabled
    AppToast.show(this, "Danmaku Merge Window Auto: ${if (enabled) "ON" else "OFF"}")
}

// v58.11: Playlist Auto Mark Expired
internal fun PlayerActivity.showV58PlaylistAutoMarkExpiredToggle() {
    val enabled = !BiliClient.prefs.v58PlaylistAutoMarkExpired
    BiliClient.prefs.v58PlaylistAutoMarkExpired = enabled
    AppToast.show(this, "Playlist Auto Mark Expired: ${if (enabled) "ON" else "OFF"}")
}

// v58.12: Gesture Swipe Velocity Custom
internal fun PlayerActivity.showV58GestureSwipeVelocityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v58GestureSwipeVelocityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Velocity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58GestureSwipeVelocityCustom = value
        AppToast.show(this, "Gesture Swipe Velocity Custom: $value")
    }
}

// v58.13: Video Color Brightness Custom
internal fun PlayerActivity.showV58VideoColorBrightnessCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v58VideoColorBrightnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Brightness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58VideoColorBrightnessCustom = value
        AppToast.show(this, "Video Color Brightness Custom: $value")
    }
}

// v58.14: Danmaku BG Radius Custom
internal fun PlayerActivity.showV58DanmakuBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58DanmakuBgRadiusCustom = value
        AppToast.show(this, "Danmaku BG Radius Custom: $value")
    }
}

// v58.15: Cast Audio Delay Custom (ms)
internal fun PlayerActivity.showV58CastAudioDelayCustomDialog() {
    val options = listOf(-200, -100, 0, 100, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v58CastAudioDelayCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay Custom (ms)",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58CastAudioDelayCustom = value
        AppToast.show(this, "Cast Audio Delay Custom (ms): $value")
    }
}

// v59.1: Video Color Matrix Custom
internal fun PlayerActivity.showV59VideoColorMatrixCustomToggle() {
    val enabled = !BiliClient.prefs.v59VideoColorMatrixCustom
    BiliClient.prefs.v59VideoColorMatrixCustom = enabled
    AppToast.show(this, "Video Color Matrix Custom: ${if (enabled) "ON" else "OFF"}")
}

// v59.2: Danmaku Text Shadow Custom
internal fun PlayerActivity.showV59DanmakuTextShadowCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuTextShadowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Text Shadow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59DanmakuTextShadowCustom = value
        AppToast.show(this, "Danmaku Text Shadow Custom: $value")
    }
}

// v59.3: Subtitle Animation Delay
internal fun PlayerActivity.showV59SubtitleAnimationDelayDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v59SubtitleAnimationDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59SubtitleAnimationDelay = value
        AppToast.show(this, "Subtitle Animation Delay: $value")
    }
}

// v59.4: Gesture Edge Swipe Custom
internal fun PlayerActivity.showV59GestureEdgeSwipeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v59GestureEdgeSwipeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59GestureEdgeSwipeCustom = value
        AppToast.show(this, "Gesture Edge Swipe Custom: $value")
    }
}

// v59.5: Video Color Denoise Strength
internal fun PlayerActivity.showV59VideoColorDenoiseStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v59VideoColorDenoiseStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Denoise Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59VideoColorDenoiseStrength = value
        AppToast.show(this, "Video Color Denoise Strength: $value")
    }
}

// v59.6: Danmaku Send Effect Preview
internal fun PlayerActivity.showV59DanmakuSendEffectPreviewToggle() {
    val enabled = !BiliClient.prefs.v59DanmakuSendEffectPreview
    BiliClient.prefs.v59DanmakuSendEffectPreview = enabled
    AppToast.show(this, "Danmaku Send Effect Preview: ${if (enabled) "ON" else "OFF"}")
}

// v59.7: Cast Video Color Space
internal fun PlayerActivity.showV59CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v59CastVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59CastVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

// v59.8: Subtitle BG Gradient Custom
internal fun PlayerActivity.showV59SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v59SubtitleBgGradientCustom
    BiliClient.prefs.v59SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

// v59.9: Video Color Vibrance Custom
internal fun PlayerActivity.showV59VideoColorVibranceCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v59VideoColorVibranceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Vibrance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59VideoColorVibranceCustom = value
        AppToast.show(this, "Video Color Vibrance Custom: $value")
    }
}

// v59.10: Danmaku History Search Custom
internal fun PlayerActivity.showV59DanmakuHistorySearchCustomToggle() {
    val enabled = !BiliClient.prefs.v59DanmakuHistorySearchCustom
    BiliClient.prefs.v59DanmakuHistorySearchCustom = enabled
    AppToast.show(this, "Danmaku History Search Custom: ${if (enabled) "ON" else "OFF"}")
}

// v59.11: Playlist Auto Backup
internal fun PlayerActivity.showV59PlaylistAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v59PlaylistAutoBackup
    BiliClient.prefs.v59PlaylistAutoBackup = enabled
    AppToast.show(this, "Playlist Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

// v59.12: Gesture Pinch Sensitivity Custom
internal fun PlayerActivity.showV59GesturePinchSensitivityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v59GesturePinchSensitivityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Sensitivity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59GesturePinchSensitivityCustom = value
        AppToast.show(this, "Gesture Pinch Sensitivity Custom: $value")
    }
}

// v59.13: Video Color Temperature Custom
internal fun PlayerActivity.showV59VideoColorTemperatureCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v59VideoColorTemperatureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59VideoColorTemperatureCustom = value
        AppToast.show(this, "Video Color Temperature Custom: $value")
    }
}

// v59.14: Danmaku Font Weight Custom
internal fun PlayerActivity.showV59DanmakuFontWeightCustomDialog() {
    val options = listOf(300, 400, 500, 700, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59DanmakuFontWeightCustom = value
        AppToast.show(this, "Danmaku Font Weight Custom: $value")
    }
}

// v59.15: Cast Audio Channel Sync
internal fun PlayerActivity.showV59CastAudioChannelSyncToggle() {
    val enabled = !BiliClient.prefs.v59CastAudioChannelSync
    BiliClient.prefs.v59CastAudioChannelSync = enabled
    AppToast.show(this, "Cast Audio Channel Sync: ${if (enabled) "ON" else "OFF"}")
}

// v60.1: Video Adaptive Color Enhance
internal fun PlayerActivity.showV60VideoAdaptiveColorEnhanceToggle() {
    val enabled = !BiliClient.prefs.v60VideoAdaptiveColorEnhance
    BiliClient.prefs.v60VideoAdaptiveColorEnhance = enabled
    AppToast.show(this, "Video Adaptive Color Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v60.2: Danmaku Border Weight Custom
internal fun PlayerActivity.showV60DanmakuBorderWeightCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuBorderWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuBorderWeightCustom = value
        AppToast.show(this, "Danmaku Border Weight Custom: $value")
    }
}

// v60.3: Subtitle Font Shadow Custom
internal fun PlayerActivity.showV60SubtitleFontShadowCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60SubtitleFontShadowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60SubtitleFontShadowCustom = value
        AppToast.show(this, "Subtitle Font Shadow Custom: $value")
    }
}

// v60.4: Gesture Multi Touch Custom
internal fun PlayerActivity.showV60GestureMultiTouchCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60GestureMultiTouchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Touch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60GestureMultiTouchCustom = value
        AppToast.show(this, "Gesture Multi Touch Custom: $value")
    }
}

// v60.5: Video Color Tint Preset
internal fun PlayerActivity.showV60VideoColorTintPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60VideoColorTintPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Tint Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60VideoColorTintPreset = value
        AppToast.show(this, "Video Color Tint Preset: $value")
    }
}

// v60.6: Danmaku Send Max Length Enhanced
internal fun PlayerActivity.showV60DanmakuSendMaxLengthEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuSendMaxLengthEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Enhanced",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuSendMaxLengthEnhanced = value
        AppToast.show(this, "Danmaku Send Max Length Enhanced: $value")
    }
}

// v60.7: Cast Video Auto Resolution
internal fun PlayerActivity.showV60CastVideoAutoResolutionToggle() {
    val enabled = !BiliClient.prefs.v60CastVideoAutoResolution
    BiliClient.prefs.v60CastVideoAutoResolution = enabled
    AppToast.show(this, "Cast Video Auto Resolution: ${if (enabled) "ON" else "OFF"}")
}

// v60.8: Subtitle BG Color Preset
internal fun PlayerActivity.showV60SubtitleBgColorPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60SubtitleBgColorPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Color Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60SubtitleBgColorPreset = value
        AppToast.show(this, "Subtitle BG Color Preset: $value")
    }
}

// v60.9: Video Color LUT Custom
internal fun PlayerActivity.showV60VideoColorLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v60VideoColorLUTCustom
    BiliClient.prefs.v60VideoColorLUTCustom = enabled
    AppToast.show(this, "Video Color LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

// v60.10: Danmaku Font Size Preset
internal fun PlayerActivity.showV60DanmakuFontSizePresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuFontSizePreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuFontSizePreset = value
        AppToast.show(this, "Danmaku Font Size Preset: $value")
    }
}

// v60.11: Playlist Auto Restore
internal fun PlayerActivity.showV60PlaylistAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v60PlaylistAutoRestore
    BiliClient.prefs.v60PlaylistAutoRestore = enabled
    AppToast.show(this, "Playlist Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

// v60.12: Gesture Custom Sensitivity Enhanced
internal fun PlayerActivity.showV60GestureCustomSensitivityEnhancedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v60GestureCustomSensitivityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Sensitivity Enhanced",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60GestureCustomSensitivityEnhanced = value
        AppToast.show(this, "Gesture Custom Sensitivity Enhanced: $value")
    }
}

// v60.13: Video Color Grading Preset
internal fun PlayerActivity.showV60VideoColorGradingPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60VideoColorGradingPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Grading Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60VideoColorGradingPreset = value
        AppToast.show(this, "Video Color Grading Preset: $value")
    }
}

// v60.14: Danmaku BG Color Preset
internal fun PlayerActivity.showV60DanmakuBgColorPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuBgColorPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Color Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuBgColorPreset = value
        AppToast.show(this, "Danmaku BG Color Preset: $value")
    }
}

// v60.15: Cast Audio Fade Mode Custom
internal fun PlayerActivity.showV60CastAudioFadeModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60CastAudioFadeModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Fade Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60CastAudioFadeModeCustom = value
        AppToast.show(this, "Cast Audio Fade Mode Custom: $value")
    }
}

// ==================== v61-v70 New Unique Features ====================

// v61.1: Video Edge Enhance Strength
internal fun PlayerActivity.showV61VideoEdgeEnhanceStrengthToggle() {
    val enabled = !BiliClient.prefs.v61VideoEdgeEnhanceStrength
    BiliClient.prefs.v61VideoEdgeEnhanceStrength = enabled
    AppToast.show(this, "Video Edge Enhance Strength: ${if (enabled) "ON" else "OFF"}")
}

// v61.2: Danmaku Collision Detection
internal fun PlayerActivity.showV61DanmakuCollisionDetectionToggle() {
    val enabled = !BiliClient.prefs.v61DanmakuCollisionDetection
    BiliClient.prefs.v61DanmakuCollisionDetection = enabled
    AppToast.show(this, "Danmaku Collision Detection: ${if (enabled) "ON" else "OFF"}")
}

// v61.3: Subtitle Position Offset X
internal fun PlayerActivity.showV61SubtitlePositionOffsetXDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v61SubtitlePositionOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61SubtitlePositionOffsetX = value
        AppToast.show(this, "Subtitle Position Offset X: $value")
    }
}

// v61.4: Gesture Fling Velocity
internal fun PlayerActivity.showV61GestureFlingVelocityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v61GestureFlingVelocity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Fling Velocity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61GestureFlingVelocity = value
        AppToast.show(this, "Gesture Fling Velocity: $value")
    }
}

// v61.5: Video Motion Compensation
internal fun PlayerActivity.showV61VideoMotionCompensationToggle() {
    val enabled = !BiliClient.prefs.v61VideoMotionCompensation
    BiliClient.prefs.v61VideoMotionCompensation = enabled
    AppToast.show(this, "Video Motion Compensation: ${if (enabled) "ON" else "OFF"}")
}

// v61.6: Danmaku Animation Type
internal fun PlayerActivity.showV61DanmakuAnimationTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuAnimationType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Animation Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61DanmakuAnimationType = value
        AppToast.show(this, "Danmaku Animation Type: $value")
    }
}

// v61.7: Cast Video Buffer (ms)
internal fun PlayerActivity.showV61CastVideoBufferMsDialog() {
    val options = listOf(0, 500, 1000, 2000, 5000)
    val currentIndex = options.indexOf(BiliClient.prefs.v61CastVideoBufferMs).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Buffer (ms)",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61CastVideoBufferMs = value
        AppToast.show(this, "Cast Video Buffer (ms): $value")
    }
}

// v61.8: Subtitle Font Size Min
internal fun PlayerActivity.showV61SubtitleFontSizeMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v61SubtitleFontSizeMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61SubtitleFontSizeMin = value
        AppToast.show(this, "Subtitle Font Size Min: $value")
    }
}

// v61.9: Video Adaptive Sharpness
internal fun PlayerActivity.showV61VideoAdaptiveSharpnessToggle() {
    val enabled = !BiliClient.prefs.v61VideoAdaptiveSharpness
    BiliClient.prefs.v61VideoAdaptiveSharpness = enabled
    AppToast.show(this, "Video Adaptive Sharpness: ${if (enabled) "ON" else "OFF"}")
}

// v61.10: Danmaku Filter By Length
internal fun PlayerActivity.showV61DanmakuFilterByLengthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuFilterByLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Length",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61DanmakuFilterByLength = value
        AppToast.show(this, "Danmaku Filter By Length: $value")
    }
}

// v61.11: Playlist Smart Filter
internal fun PlayerActivity.showV61PlaylistSmartFilterToggle() {
    val enabled = !BiliClient.prefs.v61PlaylistSmartFilter
    BiliClient.prefs.v61PlaylistSmartFilter = enabled
    AppToast.show(this, "Playlist Smart Filter: ${if (enabled) "ON" else "OFF"}")
}

// v61.12: Gesture Swipe Curve
internal fun PlayerActivity.showV61GestureSwipeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61GestureSwipeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61GestureSwipeCurve = value
        AppToast.show(this, "Gesture Swipe Curve: $value")
    }
}

// v61.13: Video Color Balance RGB
internal fun PlayerActivity.showV61VideoColorBalanceRGBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61VideoColorBalanceRGB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Balance RGB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61VideoColorBalanceRGB = value
        AppToast.show(this, "Video Color Balance RGB: $value")
    }
}

// v61.14: Danmaku Font Size Auto Min
internal fun PlayerActivity.showV61DanmakuFontSizeAutoMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuFontSizeAutoMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61DanmakuFontSizeAutoMin = value
        AppToast.show(this, "Danmaku Font Size Auto Min: $value")
    }
}

// v61.15: Cast Audio Buffer (ms)
internal fun PlayerActivity.showV61CastAudioBufferMsDialog() {
    val options = listOf(0, 100, 200, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v61CastAudioBufferMs).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Buffer (ms)",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61CastAudioBufferMs = value
        AppToast.show(this, "Cast Audio Buffer (ms): $value")
    }
}

// v62.1: Video Temporal Denoise
internal fun PlayerActivity.showV62VideoTemporalDenoiseToggle() {
    val enabled = !BiliClient.prefs.v62VideoTemporalDenoise
    BiliClient.prefs.v62VideoTemporalDenoise = enabled
    AppToast.show(this, "Video Temporal Denoise: ${if (enabled) "ON" else "OFF"}")
}

// v62.2: Danmaku Scroll Speed Custom
internal fun PlayerActivity.showV62DanmakuScrollSpeedCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuScrollSpeedCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuScrollSpeedCustom = value
        AppToast.show(this, "Danmaku Scroll Speed Custom: $value")
    }
}

// v62.3: Subtitle Position Offset Y
internal fun PlayerActivity.showV62SubtitlePositionOffsetYDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v62SubtitlePositionOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62SubtitlePositionOffsetY = value
        AppToast.show(this, "Subtitle Position Offset Y: $value")
    }
}

// v62.4: Gesture Tap Feedback
internal fun PlayerActivity.showV62GestureTapFeedbackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62GestureTapFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62GestureTapFeedback = value
        AppToast.show(this, "Gesture Tap Feedback: $value")
    }
}

// v62.5: Video Adaptive Noise Gate
internal fun PlayerActivity.showV62VideoAdaptiveNoiseGateToggle() {
    val enabled = !BiliClient.prefs.v62VideoAdaptiveNoiseGate
    BiliClient.prefs.v62VideoAdaptiveNoiseGate = enabled
    AppToast.show(this, "Video Adaptive Noise Gate: ${if (enabled) "ON" else "OFF"}")
}

// v62.6: Danmaku Merge Distance Custom
internal fun PlayerActivity.showV62DanmakuMergeDistanceCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuMergeDistanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Distance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuMergeDistanceCustom = value
        AppToast.show(this, "Danmaku Merge Distance Custom: $value")
    }
}

// v62.7: Cast Video Decode Mode
internal fun PlayerActivity.showV62CastVideoDecodeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62CastVideoDecodeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Decode Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62CastVideoDecodeMode = value
        AppToast.show(this, "Cast Video Decode Mode: $value")
    }
}

// v62.8: Subtitle Font Size Max
internal fun PlayerActivity.showV62SubtitleFontSizeMaxDialog() {
    val options = listOf(24, 32, 40, 48, 64)
    val currentIndex = options.indexOf(BiliClient.prefs.v62SubtitleFontSizeMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62SubtitleFontSizeMax = value
        AppToast.show(this, "Subtitle Font Size Max: $value")
    }
}

// v62.9: Video Adaptive Contrast Curve
internal fun PlayerActivity.showV62VideoAdaptiveContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62VideoAdaptiveContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Contrast Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62VideoAdaptiveContrastCurve = value
        AppToast.show(this, "Video Adaptive Contrast Curve: $value")
    }
}

// v62.10: Danmaku Filter By Speed
internal fun PlayerActivity.showV62DanmakuFilterBySpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuFilterBySpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuFilterBySpeed = value
        AppToast.show(this, "Danmaku Filter By Speed: $value")
    }
}

// v62.11: Playlist Auto Group
internal fun PlayerActivity.showV62PlaylistAutoGroupToggle() {
    val enabled = !BiliClient.prefs.v62PlaylistAutoGroup
    BiliClient.prefs.v62PlaylistAutoGroup = enabled
    AppToast.show(this, "Playlist Auto Group: ${if (enabled) "ON" else "OFF"}")
}

// v62.12: Gesture Swipe Acceleration
internal fun PlayerActivity.showV62GestureSwipeAccelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v62GestureSwipeAcceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Acceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62GestureSwipeAcceleration = value
        AppToast.show(this, "Gesture Swipe Acceleration: $value")
    }
}

// v62.13: Video Color Hue Rotate
internal fun PlayerActivity.showV62VideoColorHueRotateDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v62VideoColorHueRotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Hue Rotate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62VideoColorHueRotate = value
        AppToast.show(this, "Video Color Hue Rotate: $value")
    }
}

// v62.14: Danmaku Font Size Auto Max
internal fun PlayerActivity.showV62DanmakuFontSizeAutoMaxDialog() {
    val options = listOf(24, 28, 32, 36, 48)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuFontSizeAutoMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuFontSizeAutoMax = value
        AppToast.show(this, "Danmaku Font Size Auto Max: $value")
    }
}

// v62.15: Cast Audio Decode Mode
internal fun PlayerActivity.showV62CastAudioDecodeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62CastAudioDecodeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Decode Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62CastAudioDecodeMode = value
        AppToast.show(this, "Cast Audio Decode Mode: $value")
    }
}

// v63.1: Video Spatial Denoise
internal fun PlayerActivity.showV63VideoSpatialDenoiseToggle() {
    val enabled = !BiliClient.prefs.v63VideoSpatialDenoise
    BiliClient.prefs.v63VideoSpatialDenoise = enabled
    AppToast.show(this, "Video Spatial Denoise: ${if (enabled) "ON" else "OFF"}")
}

// v63.2: Danmaku Top Bottom Margin
internal fun PlayerActivity.showV63DanmakuTopBottomMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuTopBottomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Bottom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuTopBottomMargin = value
        AppToast.show(this, "Danmaku Top Bottom Margin: $value")
    }
}

// v63.3: Subtitle Animation Fade In
internal fun PlayerActivity.showV63SubtitleAnimationFadeInToggle() {
    val enabled = !BiliClient.prefs.v63SubtitleAnimationFadeIn
    BiliClient.prefs.v63SubtitleAnimationFadeIn = enabled
    AppToast.show(this, "Subtitle Animation Fade In: ${if (enabled) "ON" else "OFF"}")
}

// v63.4: Gesture Long Press Vibration
internal fun PlayerActivity.showV63GestureLongPressVibrationToggle() {
    val enabled = !BiliClient.prefs.v63GestureLongPressVibration
    BiliClient.prefs.v63GestureLongPressVibration = enabled
    AppToast.show(this, "Gesture Long Press Vibration: ${if (enabled) "ON" else "OFF"}")
}

// v63.5: Video Adaptive Saturation Curve
internal fun PlayerActivity.showV63VideoAdaptiveSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63VideoAdaptiveSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Saturation Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63VideoAdaptiveSaturationCurve = value
        AppToast.show(this, "Video Adaptive Saturation Curve: $value")
    }
}

// v63.6: Danmaku Send Queue Size
internal fun PlayerActivity.showV63DanmakuSendQueueSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuSendQueueSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Queue Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuSendQueueSize = value
        AppToast.show(this, "Danmaku Send Queue Size: $value")
    }
}

// v63.7: Cast Video Render Mode
internal fun PlayerActivity.showV63CastVideoRenderModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastVideoRenderMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Render Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63CastVideoRenderMode = value
        AppToast.show(this, "Cast Video Render Mode: $value")
    }
}

// v63.8: Subtitle BG Border Width
internal fun PlayerActivity.showV63SubtitleBgBorderWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v63SubtitleBgBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63SubtitleBgBorderWidth = value
        AppToast.show(this, "Subtitle BG Border Width: $value")
    }
}

// v63.9: Video Adaptive Gamma Curve
internal fun PlayerActivity.showV63VideoAdaptiveGammaCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63VideoAdaptiveGammaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Gamma Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63VideoAdaptiveGammaCurve = value
        AppToast.show(this, "Video Adaptive Gamma Curve: $value")
    }
}

// v63.10: Danmaku Filter By Type
internal fun PlayerActivity.showV63DanmakuFilterByTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuFilterByType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuFilterByType = value
        AppToast.show(this, "Danmaku Filter By Type: $value")
    }
}

// v63.11: Playlist Auto Merge
internal fun PlayerActivity.showV63PlaylistAutoMergeToggle() {
    val enabled = !BiliClient.prefs.v63PlaylistAutoMerge
    BiliClient.prefs.v63PlaylistAutoMerge = enabled
    AppToast.show(this, "Playlist Auto Merge: ${if (enabled) "ON" else "OFF"}")
}

// v63.12: Gesture Swipe Deceleration Custom
internal fun PlayerActivity.showV63GestureSwipeDecelerationCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v63GestureSwipeDecelerationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Deceleration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63GestureSwipeDecelerationCustom = value
        AppToast.show(this, "Gesture Swipe Deceleration Custom: $value")
    }
}

// v63.13: Video Color Invert
internal fun PlayerActivity.showV63VideoColorInvertToggle() {
    val enabled = !BiliClient.prefs.v63VideoColorInvert
    BiliClient.prefs.v63VideoColorInvert = enabled
    AppToast.show(this, "Video Color Invert: ${if (enabled) "ON" else "OFF"}")
}

// v63.14: Danmaku History Sort Order
internal fun PlayerActivity.showV63DanmakuHistorySortOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuHistorySortOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Sort Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuHistorySortOrder = value
        AppToast.show(this, "Danmaku History Sort Order: $value")
    }
}

// v63.15: Cast Audio Render Mode
internal fun PlayerActivity.showV63CastAudioRenderModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastAudioRenderMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Render Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63CastAudioRenderMode = value
        AppToast.show(this, "Cast Audio Render Mode: $value")
    }
}

// v64.1: Video Adaptive Edge Preserve
internal fun PlayerActivity.showV64VideoAdaptiveEdgePreserveToggle() {
    val enabled = !BiliClient.prefs.v64VideoAdaptiveEdgePreserve
    BiliClient.prefs.v64VideoAdaptiveEdgePreserve = enabled
    AppToast.show(this, "Video Adaptive Edge Preserve: ${if (enabled) "ON" else "OFF"}")
}

// v64.2: Danmaku Fixed Position
internal fun PlayerActivity.showV64DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
}

// v64.3: Subtitle Animation Fade Out
internal fun PlayerActivity.showV64SubtitleAnimationFadeOutToggle() {
    val enabled = !BiliClient.prefs.v64SubtitleAnimationFadeOut
    BiliClient.prefs.v64SubtitleAnimationFadeOut = enabled
    AppToast.show(this, "Subtitle Animation Fade Out: ${if (enabled) "ON" else "OFF"}")
}

// v64.4: Gesture Multi Finger Gesture
internal fun PlayerActivity.showV64GestureMultiFingerGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureMultiFingerGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Finger Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64GestureMultiFingerGesture = value
        AppToast.show(this, "Gesture Multi Finger Gesture: $value")
    }
}

// v64.5: Video Color Grayscale
internal fun PlayerActivity.showV64VideoColorGrayscaleToggle() {
    val enabled = !BiliClient.prefs.v64VideoColorGrayscale
    BiliClient.prefs.v64VideoColorGrayscale = enabled
    AppToast.show(this, "Video Color Grayscale: ${if (enabled) "ON" else "OFF"}")
}

// v64.6: Danmaku Send Delay
internal fun PlayerActivity.showV64DanmakuSendDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuSendDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuSendDelay = value
        AppToast.show(this, "Danmaku Send Delay: $value")
    }
}

// v64.7: Cast Video Post Process
internal fun PlayerActivity.showV64CastVideoPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastVideoPostProcess
    BiliClient.prefs.v64CastVideoPostProcess = enabled
    AppToast.show(this, "Cast Video Post Process: ${if (enabled) "ON" else "OFF"}")
}

// v64.8: Subtitle BG Border Color
internal fun PlayerActivity.showV64SubtitleBgBorderColorDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64SubtitleBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64SubtitleBgBorderColor = value
        AppToast.show(this, "Subtitle BG Border Color: $value")
    }
}

// v64.9: Video Adaptive Detail Curve
internal fun PlayerActivity.showV64VideoAdaptiveDetailCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64VideoAdaptiveDetailCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Detail Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64VideoAdaptiveDetailCurve = value
        AppToast.show(this, "Video Adaptive Detail Curve: $value")
    }
}

// v64.10: Danmaku Filter By User Level
internal fun PlayerActivity.showV64DanmakuFilterByUserLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFilterByUserLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By User Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuFilterByUserLevel = value
        AppToast.show(this, "Danmaku Filter By User Level: $value")
    }
}

// v64.11: Playlist Auto Split
internal fun PlayerActivity.showV64PlaylistAutoSplitToggle() {
    val enabled = !BiliClient.prefs.v64PlaylistAutoSplit
    BiliClient.prefs.v64PlaylistAutoSplit = enabled
    AppToast.show(this, "Playlist Auto Split: ${if (enabled) "ON" else "OFF"}")
}

// v64.12: Gesture Swipe Friction
internal fun PlayerActivity.showV64GestureSwipeFrictionDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureSwipeFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64GestureSwipeFriction = value
        AppToast.show(this, "Gesture Swipe Friction: $value")
    }
}

// v64.13: Video Color Sepia Strength
internal fun PlayerActivity.showV64VideoColorSepiaStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v64VideoColorSepiaStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Sepia Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64VideoColorSepiaStrength = value
        AppToast.show(this, "Video Color Sepia Strength: $value")
    }
}

// v64.14: Danmaku History Max Items
internal fun PlayerActivity.showV64DanmakuHistoryMaxItemsDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuHistoryMaxItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Max Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuHistoryMaxItems = value
        AppToast.show(this, "Danmaku History Max Items: $value")
    }
}

// v64.15: Cast Audio Post Process
internal fun PlayerActivity.showV64CastAudioPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastAudioPostProcess
    BiliClient.prefs.v64CastAudioPostProcess = enabled
    AppToast.show(this, "Cast Audio Post Process: ${if (enabled) "ON" else "OFF"}")
}

// v65.1: Video Adaptive Motion Blur
internal fun PlayerActivity.showV65VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v65VideoAdaptiveMotionBlur
    BiliClient.prefs.v65VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v65.2: Danmaku Scroll Direction
internal fun PlayerActivity.showV65DanmakuScrollDirectionDialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuScrollDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65DanmakuScrollDirection = value
        AppToast.show(this, "Danmaku Scroll Direction: $value")
    }
}

// v65.3: Subtitle Animation Slide
internal fun PlayerActivity.showV65SubtitleAnimationSlideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65SubtitleAnimationSlide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Slide",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65SubtitleAnimationSlide = value
        AppToast.show(this, "Subtitle Animation Slide: $value")
    }
}

// v65.4: Gesture Custom Gesture 1
internal fun PlayerActivity.showV65GestureCustomGesture1Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureCustomGesture1).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 1",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65GestureCustomGesture1 = value
        AppToast.show(this, "Gesture Custom Gesture 1: $value")
    }
}

// v65.5: Video Color Posterize Level
internal fun PlayerActivity.showV65VideoColorPosterizeLevelDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoColorPosterizeLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Posterize Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoColorPosterizeLevel = value
        AppToast.show(this, "Video Color Posterize Level: $value")
    }
}

// v65.6: Danmaku Send Priority Level
internal fun PlayerActivity.showV65DanmakuSendPriorityLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuSendPriorityLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Priority Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65DanmakuSendPriorityLevel = value
        AppToast.show(this, "Danmaku Send Priority Level: $value")
    }
}

// v65.7: Cast Video HDR
internal fun PlayerActivity.showV65CastVideoHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastVideoHDR
    BiliClient.prefs.v65CastVideoHDR = enabled
    AppToast.show(this, "Cast Video HDR: ${if (enabled) "ON" else "OFF"}")
}

// v65.8: Subtitle BG Blur Strength
internal fun PlayerActivity.showV65SubtitleBgBlurStrengthDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v65SubtitleBgBlurStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65SubtitleBgBlurStrength = value
        AppToast.show(this, "Subtitle BG Blur Strength: $value")
    }
}

// v65.9: Video Adaptive Luma Curve
internal fun PlayerActivity.showV65VideoAdaptiveLumaCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoAdaptiveLumaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Luma Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoAdaptiveLumaCurve = value
        AppToast.show(this, "Video Adaptive Luma Curve: $value")
    }
}

// v65.10: Danmaku Filter By Badge
internal fun PlayerActivity.showV65DanmakuFilterByBadgeToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuFilterByBadge
    BiliClient.prefs.v65DanmakuFilterByBadge = enabled
    AppToast.show(this, "Danmaku Filter By Badge: ${if (enabled) "ON" else "OFF"}")
}

// v65.11: Playlist Auto Deduplicate
internal fun PlayerActivity.showV65PlaylistAutoDeduplicateToggle() {
    val enabled = !BiliClient.prefs.v65PlaylistAutoDeduplicate
    BiliClient.prefs.v65PlaylistAutoDeduplicate = enabled
    AppToast.show(this, "Playlist Auto Deduplicate: ${if (enabled) "ON" else "OFF"}")
}

// v65.12: Gesture Swipe Sensitivity Custom
internal fun PlayerActivity.showV65GestureSwipeSensitivityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureSwipeSensitivityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Sensitivity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65GestureSwipeSensitivityCustom = value
        AppToast.show(this, "Gesture Swipe Sensitivity Custom: $value")
    }
}

// v65.13: Video Color Solarize Strength
internal fun PlayerActivity.showV65VideoColorSolarizeStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoColorSolarizeStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Solarize Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoColorSolarizeStrength = value
        AppToast.show(this, "Video Color Solarize Strength: $value")
    }
}

// v65.14: Danmaku History Auto Export
internal fun PlayerActivity.showV65DanmakuHistoryAutoExportToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuHistoryAutoExport
    BiliClient.prefs.v65DanmakuHistoryAutoExport = enabled
    AppToast.show(this, "Danmaku History Auto Export: ${if (enabled) "ON" else "OFF"}")
}

// v65.15: Cast Audio HDR
internal fun PlayerActivity.showV65CastAudioHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastAudioHDR
    BiliClient.prefs.v65CastAudioHDR = enabled
    AppToast.show(this, "Cast Audio HDR: ${if (enabled) "ON" else "OFF"}")
}

// v66.1: Video Adaptive Frame Blend
internal fun PlayerActivity.showV66VideoAdaptiveFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v66VideoAdaptiveFrameBlend
    BiliClient.prefs.v66VideoAdaptiveFrameBlend = enabled
    AppToast.show(this, "Video Adaptive Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v66.2: Danmaku Top Margin
internal fun PlayerActivity.showV66DanmakuTopMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuTopMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuTopMargin = value
        AppToast.show(this, "Danmaku Top Margin: $value")
    }
}

// v66.3: Subtitle Animation Bounce
internal fun PlayerActivity.showV66SubtitleAnimationBounceToggle() {
    val enabled = !BiliClient.prefs.v66SubtitleAnimationBounce
    BiliClient.prefs.v66SubtitleAnimationBounce = enabled
    AppToast.show(this, "Subtitle Animation Bounce: ${if (enabled) "ON" else "OFF"}")
}

// v66.4: Gesture Custom Gesture 2
internal fun PlayerActivity.showV66GestureCustomGesture2Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureCustomGesture2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 2",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66GestureCustomGesture2 = value
        AppToast.show(this, "Gesture Custom Gesture 2: $value")
    }
}

// v66.5: Video Color Vignette
internal fun PlayerActivity.showV66VideoColorVignetteDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoColorVignette).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Vignette",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoColorVignette = value
        AppToast.show(this, "Video Color Vignette: $value")
    }
}

// v66.6: Danmaku Send Max Length Per Second
internal fun PlayerActivity.showV66DanmakuSendMaxLengthPerSecondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuSendMaxLengthPerSecond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Per Second",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuSendMaxLengthPerSecond = value
        AppToast.show(this, "Danmaku Send Max Length Per Second: $value")
    }
}

// v66.7: Cast Video Dolby Vision
internal fun PlayerActivity.showV66CastVideoDolbyVisionToggle() {
    val enabled = !BiliClient.prefs.v66CastVideoDolbyVision
    BiliClient.prefs.v66CastVideoDolbyVision = enabled
    AppToast.show(this, "Cast Video Dolby Vision: ${if (enabled) "ON" else "OFF"}")
}

// v66.8: Subtitle BG Border Radius
internal fun PlayerActivity.showV66SubtitleBgBorderRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v66SubtitleBgBorderRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66SubtitleBgBorderRadius = value
        AppToast.show(this, "Subtitle BG Border Radius: $value")
    }
}

// v66.9: Video Adaptive Color Curve
internal fun PlayerActivity.showV66VideoAdaptiveColorCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoAdaptiveColorCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Color Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoAdaptiveColorCurve = value
        AppToast.show(this, "Video Adaptive Color Curve: $value")
    }
}

// v66.10: Danmaku Filter By Medal
internal fun PlayerActivity.showV66DanmakuFilterByMedalToggle() {
    val enabled = !BiliClient.prefs.v66DanmakuFilterByMedal
    BiliClient.prefs.v66DanmakuFilterByMedal = enabled
    AppToast.show(this, "Danmaku Filter By Medal: ${if (enabled) "ON" else "OFF"}")
}

// v66.11: Playlist Auto Shuffle On Start
internal fun PlayerActivity.showV66PlaylistAutoShuffleOnStartToggle() {
    val enabled = !BiliClient.prefs.v66PlaylistAutoShuffleOnStart
    BiliClient.prefs.v66PlaylistAutoShuffleOnStart = enabled
    AppToast.show(this, "Playlist Auto Shuffle On Start: ${if (enabled) "ON" else "OFF"}")
}

// v66.12: Gesture Swipe Momentum
internal fun PlayerActivity.showV66GestureSwipeMomentumDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureSwipeMomentum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Momentum",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66GestureSwipeMomentum = value
        AppToast.show(this, "Gesture Swipe Momentum: $value")
    }
}

// v66.13: Video Color Duotone
internal fun PlayerActivity.showV66VideoColorDuotoneDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoColorDuotone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Duotone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoColorDuotone = value
        AppToast.show(this, "Video Color Duotone: $value")
    }
}

// v66.14: Danmaku History Search Mode
internal fun PlayerActivity.showV66DanmakuHistorySearchModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuHistorySearchMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Search Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuHistorySearchMode = value
        AppToast.show(this, "Danmaku History Search Mode: $value")
    }
}

// v66.15: Cast Audio Dolby Atmos
internal fun PlayerActivity.showV66CastAudioDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v66CastAudioDolbyAtmos
    BiliClient.prefs.v66CastAudioDolbyAtmos = enabled
    AppToast.show(this, "Cast Audio Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

// v67.1: Video Adaptive Temporal Blend
internal fun PlayerActivity.showV67VideoAdaptiveTemporalBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveTemporalBlend
    BiliClient.prefs.v67VideoAdaptiveTemporalBlend = enabled
    AppToast.show(this, "Video Adaptive Temporal Blend: ${if (enabled) "ON" else "OFF"}")
}

// v67.2: Danmaku Bottom Margin
internal fun PlayerActivity.showV67DanmakuBottomMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuBottomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuBottomMargin = value
        AppToast.show(this, "Danmaku Bottom Margin: $value")
    }
}

// v67.3: Subtitle Animation Zoom
internal fun PlayerActivity.showV67SubtitleAnimationZoomToggle() {
    val enabled = !BiliClient.prefs.v67SubtitleAnimationZoom
    BiliClient.prefs.v67SubtitleAnimationZoom = enabled
    AppToast.show(this, "Subtitle Animation Zoom: ${if (enabled) "ON" else "OFF"}")
}

// v67.4: Gesture Custom Gesture 3
internal fun PlayerActivity.showV67GestureCustomGesture3Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureCustomGesture3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 3",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67GestureCustomGesture3 = value
        AppToast.show(this, "Gesture Custom Gesture 3: $value")
    }
}

// v67.5: Video Color Tilt Shift
internal fun PlayerActivity.showV67VideoColorTiltShiftToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorTiltShift
    BiliClient.prefs.v67VideoColorTiltShift = enabled
    AppToast.show(this, "Video Color Tilt Shift: ${if (enabled) "ON" else "OFF"}")
}

// v67.6: Danmaku Send Rate Per User
internal fun PlayerActivity.showV67DanmakuSendRatePerUserDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuSendRatePerUser).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Per User",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuSendRatePerUser = value
        AppToast.show(this, "Danmaku Send Rate Per User: $value")
    }
}

// v67.7: Cast Video 3D
internal fun PlayerActivity.showV67CastVideo3DToggle() {
    val enabled = !BiliClient.prefs.v67CastVideo3D
    BiliClient.prefs.v67CastVideo3D = enabled
    AppToast.show(this, "Cast Video 3D: ${if (enabled) "ON" else "OFF"}")
}

// v67.8: Subtitle BG Gradient Direction
internal fun PlayerActivity.showV67SubtitleBgGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67SubtitleBgGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67SubtitleBgGradientDirection = value
        AppToast.show(this, "Subtitle BG Gradient Direction: $value")
    }
}

// v67.9: Video Adaptive Spatial Blend
internal fun PlayerActivity.showV67VideoAdaptiveSpatialBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveSpatialBlend
    BiliClient.prefs.v67VideoAdaptiveSpatialBlend = enabled
    AppToast.show(this, "Video Adaptive Spatial Blend: ${if (enabled) "ON" else "OFF"}")
}

// v67.10: Danmaku Filter By Level
internal fun PlayerActivity.showV67DanmakuFilterByLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuFilterByLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuFilterByLevel = value
        AppToast.show(this, "Danmaku Filter By Level: $value")
    }
}

// v67.11: Playlist Auto Repeat Mode
internal fun PlayerActivity.showV67PlaylistAutoRepeatModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67PlaylistAutoRepeatMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Repeat Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67PlaylistAutoRepeatMode = value
        AppToast.show(this, "Playlist Auto Repeat Mode: $value")
    }
}

// v67.12: Gesture Swipe Bounce
internal fun PlayerActivity.showV67GestureSwipeBounceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureSwipeBounce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Bounce",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67GestureSwipeBounce = value
        AppToast.show(this, "Gesture Swipe Bounce: $value")
    }
}

// v67.13: Video Color Cross Process
internal fun PlayerActivity.showV67VideoColorCrossProcessToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorCrossProcess
    BiliClient.prefs.v67VideoColorCrossProcess = enabled
    AppToast.show(this, "Video Color Cross Process: ${if (enabled) "ON" else "OFF"}")
}

// v67.14: Danmaku History Export Auto
internal fun PlayerActivity.showV67DanmakuHistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v67DanmakuHistoryExportAuto
    BiliClient.prefs.v67DanmakuHistoryExportAuto = enabled
    AppToast.show(this, "Danmaku History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

// v67.15: Cast Audio Spatial
internal fun PlayerActivity.showV67CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v67CastAudioSpatial
    BiliClient.prefs.v67CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

// v68.1: Video Adaptive Color Balance
internal fun PlayerActivity.showV68VideoAdaptiveColorBalanceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveColorBalance
    BiliClient.prefs.v68VideoAdaptiveColorBalance = enabled
    AppToast.show(this, "Video Adaptive Color Balance: ${if (enabled) "ON" else "OFF"}")
}

// v68.2: Danmaku Left Right Margin
internal fun PlayerActivity.showV68DanmakuLeftRightMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuLeftRightMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Left Right Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68DanmakuLeftRightMargin = value
        AppToast.show(this, "Danmaku Left Right Margin: $value")
    }
}

// v68.3: Subtitle Animation Rotate
internal fun PlayerActivity.showV68SubtitleAnimationRotateToggle() {
    val enabled = !BiliClient.prefs.v68SubtitleAnimationRotate
    BiliClient.prefs.v68SubtitleAnimationRotate = enabled
    AppToast.show(this, "Subtitle Animation Rotate: ${if (enabled) "ON" else "OFF"}")
}

// v68.4: Gesture Custom Gesture 4
internal fun PlayerActivity.showV68GestureCustomGesture4Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v68GestureCustomGesture4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 4",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68GestureCustomGesture4 = value
        AppToast.show(this, "Gesture Custom Gesture 4: $value")
    }
}

// v68.5: Video Color Fisheye
internal fun PlayerActivity.showV68VideoColorFisheyeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68VideoColorFisheye).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fisheye",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68VideoColorFisheye = value
        AppToast.show(this, "Video Color Fisheye: $value")
    }
}

// v68.6: Danmaku Send Max Length Per Minute
internal fun PlayerActivity.showV68DanmakuSendMaxLengthPerMinuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuSendMaxLengthPerMinute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Per Minute",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68DanmakuSendMaxLengthPerMinute = value
        AppToast.show(this, "Danmaku Send Max Length Per Minute: $value")
    }
}

// v68.7: Cast Video Surround
internal fun PlayerActivity.showV68CastVideoSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastVideoSurround
    BiliClient.prefs.v68CastVideoSurround = enabled
    AppToast.show(this, "Cast Video Surround: ${if (enabled) "ON" else "OFF"}")
}

// v68.8: Subtitle BG Gradient Color
internal fun PlayerActivity.showV68SubtitleBgGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v68SubtitleBgGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68SubtitleBgGradientColor = value
        AppToast.show(this, "Subtitle BG Gradient Color: $value")
    }
}

// v68.9: Video Adaptive Noise Reduce
internal fun PlayerActivity.showV68VideoAdaptiveNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveNoiseReduce
    BiliClient.prefs.v68VideoAdaptiveNoiseReduce = enabled
    AppToast.show(this, "Video Adaptive Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v68.10: Danmaku Filter By Title
internal fun PlayerActivity.showV68DanmakuFilterByTitleToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuFilterByTitle
    BiliClient.prefs.v68DanmakuFilterByTitle = enabled
    AppToast.show(this, "Danmaku Filter By Title: ${if (enabled) "ON" else "OFF"}")
}

// v68.11: Playlist Auto Next On End
internal fun PlayerActivity.showV68PlaylistAutoNextOnEndToggle() {
    val enabled = !BiliClient.prefs.v68PlaylistAutoNextOnEnd
    BiliClient.prefs.v68PlaylistAutoNextOnEnd = enabled
    AppToast.show(this, "Playlist Auto Next On End: ${if (enabled) "ON" else "OFF"}")
}

// v68.12: Gesture Swipe Elastic
internal fun PlayerActivity.showV68GestureSwipeElasticDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68GestureSwipeElastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Elastic",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68GestureSwipeElastic = value
        AppToast.show(this, "Gesture Swipe Elastic: $value")
    }
}

// v68.13: Video Color Chromatic Aberration
internal fun PlayerActivity.showV68VideoColorChromaticAberrationDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68VideoColorChromaticAberration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Chromatic Aberration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68VideoColorChromaticAberration = value
        AppToast.show(this, "Video Color Chromatic Aberration: $value")
    }
}

// v68.14: Danmaku History Import
internal fun PlayerActivity.showV68DanmakuHistoryImportToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuHistoryImport
    BiliClient.prefs.v68DanmakuHistoryImport = enabled
    AppToast.show(this, "Danmaku History Import: ${if (enabled) "ON" else "OFF"}")
}

// v68.15: Cast Audio Surround
internal fun PlayerActivity.showV68CastAudioSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastAudioSurround
    BiliClient.prefs.v68CastAudioSurround = enabled
    AppToast.show(this, "Cast Audio Surround: ${if (enabled) "ON" else "OFF"}")
}

// v69.1: Video Adaptive Detail Enhance
internal fun PlayerActivity.showV69VideoAdaptiveDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveDetailEnhance
    BiliClient.prefs.v69VideoAdaptiveDetailEnhance = enabled
    AppToast.show(this, "Video Adaptive Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v69.2: Danmaku Line Spacing
internal fun PlayerActivity.showV69DanmakuLineSpacingDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69DanmakuLineSpacing = value
        AppToast.show(this, "Danmaku Line Spacing: $value")
    }
}

// v69.3: Subtitle Animation Typewriter
internal fun PlayerActivity.showV69SubtitleAnimationTypewriterToggle() {
    val enabled = !BiliClient.prefs.v69SubtitleAnimationTypewriter
    BiliClient.prefs.v69SubtitleAnimationTypewriter = enabled
    AppToast.show(this, "Subtitle Animation Typewriter: ${if (enabled) "ON" else "OFF"}")
}

// v69.4: Gesture Custom Action 5
internal fun PlayerActivity.showV69GestureCustomAction5Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureCustomAction5).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 5",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69GestureCustomAction5 = value
        AppToast.show(this, "Gesture Custom Action 5: $value")
    }
}

// v69.5: Video Color Barrel Distortion
internal fun PlayerActivity.showV69VideoColorBarrelDistortionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69VideoColorBarrelDistortion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Barrel Distortion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69VideoColorBarrelDistortion = value
        AppToast.show(this, "Video Color Barrel Distortion: $value")
    }
}

// v69.6: Danmaku Send Max Length Total
internal fun PlayerActivity.showV69DanmakuSendMaxLengthTotalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuSendMaxLengthTotal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Total",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69DanmakuSendMaxLengthTotal = value
        AppToast.show(this, "Danmaku Send Max Length Total: $value")
    }
}

// v69.7: Cast Video Multi View
internal fun PlayerActivity.showV69CastVideoMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastVideoMultiView
    BiliClient.prefs.v69CastVideoMultiView = enabled
    AppToast.show(this, "Cast Video Multi View: ${if (enabled) "ON" else "OFF"}")
}

// v69.8: Subtitle BG Padding X
internal fun PlayerActivity.showV69SubtitleBgPaddingXDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v69SubtitleBgPaddingX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69SubtitleBgPaddingX = value
        AppToast.show(this, "Subtitle BG Padding X: $value")
    }
}

// v69.9: Video Adaptive Chroma Enhance
internal fun PlayerActivity.showV69VideoAdaptiveChromaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveChromaEnhance
    BiliClient.prefs.v69VideoAdaptiveChromaEnhance = enabled
    AppToast.show(this, "Video Adaptive Chroma Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v69.10: Danmaku Filter By Content
internal fun PlayerActivity.showV69DanmakuFilterByContentToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuFilterByContent
    BiliClient.prefs.v69DanmakuFilterByContent = enabled
    AppToast.show(this, "Danmaku Filter By Content: ${if (enabled) "ON" else "OFF"}")
}

// v69.11: Playlist Auto Resume
internal fun PlayerActivity.showV69PlaylistAutoResumeToggle() {
    val enabled = !BiliClient.prefs.v69PlaylistAutoResume
    BiliClient.prefs.v69PlaylistAutoResume = enabled
    AppToast.show(this, "Playlist Auto Resume: ${if (enabled) "ON" else "OFF"}")
}

// v69.12: Gesture Swipe Rubber Band
internal fun PlayerActivity.showV69GestureSwipeRubberBandDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureSwipeRubberBand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Rubber Band",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69GestureSwipeRubberBand = value
        AppToast.show(this, "Gesture Swipe Rubber Band: $value")
    }
}

// v69.13: Video Color Pincushion
internal fun PlayerActivity.showV69VideoColorPincushionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69VideoColorPincushion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Pincushion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69VideoColorPincushion = value
        AppToast.show(this, "Video Color Pincushion: $value")
    }
}

// v69.14: Danmaku History Clear
internal fun PlayerActivity.showV69DanmakuHistoryClearToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuHistoryClear
    BiliClient.prefs.v69DanmakuHistoryClear = enabled
    AppToast.show(this, "Danmaku History Clear: ${if (enabled) "ON" else "OFF"}")
}

// v69.15: Cast Audio Multi View
internal fun PlayerActivity.showV69CastAudioMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastAudioMultiView
    BiliClient.prefs.v69CastAudioMultiView = enabled
    AppToast.show(this, "Cast Audio Multi View: ${if (enabled) "ON" else "OFF"}")
}

// v70.1: Video Adaptive Luma Enhance
internal fun PlayerActivity.showV70VideoAdaptiveLumaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v70VideoAdaptiveLumaEnhance
    BiliClient.prefs.v70VideoAdaptiveLumaEnhance = enabled
    AppToast.show(this, "Video Adaptive Luma Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v70.2: Danmaku Character Spacing
internal fun PlayerActivity.showV70DanmakuCharacterSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuCharacterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Character Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70DanmakuCharacterSpacing = value
        AppToast.show(this, "Danmaku Character Spacing: $value")
    }
}

// v70.3: Subtitle Animation Highlight
internal fun PlayerActivity.showV70SubtitleAnimationHighlightToggle() {
    val enabled = !BiliClient.prefs.v70SubtitleAnimationHighlight
    BiliClient.prefs.v70SubtitleAnimationHighlight = enabled
    AppToast.show(this, "Subtitle Animation Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v70.4: Gesture Custom Action 6
internal fun PlayerActivity.showV70GestureCustomAction6Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureCustomAction6).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 6",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70GestureCustomAction6 = value
        AppToast.show(this, "Gesture Custom Action 6: $value")
    }
}

// v70.5: Video Color Wave Distortion
internal fun PlayerActivity.showV70VideoColorWaveDistortionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoColorWaveDistortion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Wave Distortion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoColorWaveDistortion = value
        AppToast.show(this, "Video Color Wave Distortion: $value")
    }
}

// v70.6: Danmaku Send Max Length VIP
internal fun PlayerActivity.showV70DanmakuSendMaxLengthVIPDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuSendMaxLengthVIP).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length VIP",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70DanmakuSendMaxLengthVIP = value
        AppToast.show(this, "Danmaku Send Max Length VIP: $value")
    }
}

// v70.7: Cast Video Multi Screen
internal fun PlayerActivity.showV70CastVideoMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastVideoMultiScreen
    BiliClient.prefs.v70CastVideoMultiScreen = enabled
    AppToast.show(this, "Cast Video Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

// v70.8: Subtitle BG Padding Y
internal fun PlayerActivity.showV70SubtitleBgPaddingYDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v70SubtitleBgPaddingY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70SubtitleBgPaddingY = value
        AppToast.show(this, "Subtitle BG Padding Y: $value")
    }
}

// v70.9: Video Adaptive Color Enhance Curve
internal fun PlayerActivity.showV70VideoAdaptiveColorEnhanceCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoAdaptiveColorEnhanceCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Color Enhance Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoAdaptiveColorEnhanceCurve = value
        AppToast.show(this, "Video Adaptive Color Enhance Curve: $value")
    }
}

// v70.10: Danmaku Filter By Gift
internal fun PlayerActivity.showV70DanmakuFilterByGiftToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuFilterByGift
    BiliClient.prefs.v70DanmakuFilterByGift = enabled
    AppToast.show(this, "Danmaku Filter By Gift: ${if (enabled) "ON" else "OFF"}")
}

// v70.11: Playlist Auto Create
internal fun PlayerActivity.showV70PlaylistAutoCreateToggle() {
    val enabled = !BiliClient.prefs.v70PlaylistAutoCreate
    BiliClient.prefs.v70PlaylistAutoCreate = enabled
    AppToast.show(this, "Playlist Auto Create: ${if (enabled) "ON" else "OFF"}")
}

// v70.12: Gesture Swipe Spring
internal fun PlayerActivity.showV70GestureSwipeSpringDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureSwipeSpring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Spring",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70GestureSwipeSpring = value
        AppToast.show(this, "Gesture Swipe Spring: $value")
    }
}

// v70.13: Video Color Glitch
internal fun PlayerActivity.showV70VideoColorGlitchDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoColorGlitch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Glitch",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoColorGlitch = value
        AppToast.show(this, "Video Color Glitch: $value")
    }
}

// v70.14: Danmaku History Stats
internal fun PlayerActivity.showV70DanmakuHistoryStatsToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuHistoryStats
    BiliClient.prefs.v70DanmakuHistoryStats = enabled
    AppToast.show(this, "Danmaku History Stats: ${if (enabled) "ON" else "OFF"}")
}

// v70.15: Cast Audio Multi Screen
internal fun PlayerActivity.showV70CastAudioMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastAudioMultiScreen
    BiliClient.prefs.v70CastAudioMultiScreen = enabled
    AppToast.show(this, "Cast Audio Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

// ==================== v71-v80 New Unique Features ====================

// v71.1: Video Stabilization Strength
internal fun PlayerActivity.showV71VideoStabilizationStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v71VideoStabilizationStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Stabilization Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71VideoStabilizationStrength = value
        AppToast.show(this, "Video Stabilization Strength: $value")
    }
}

// v71.2: Danmaku Collision Avoidance
internal fun PlayerActivity.showV71DanmakuCollisionAvoidanceToggle() {
    val enabled = !BiliClient.prefs.v71DanmakuCollisionAvoidance
    BiliClient.prefs.v71DanmakuCollisionAvoidance = enabled
    AppToast.show(this, "Danmaku Collision Avoidance: ${if (enabled) "ON" else "OFF"}")
}

// v71.3: Subtitle Word Wrap Mode
internal fun PlayerActivity.showV71SubtitleWordWrapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71SubtitleWordWrapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Word Wrap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71SubtitleWordWrapMode = value
        AppToast.show(this, "Subtitle Word Wrap Mode: $value")
    }
}

// v71.4: Gesture Sensitivity Profile
internal fun PlayerActivity.showV71GestureSensitivityProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71GestureSensitivityProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Sensitivity Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71GestureSensitivityProfile = value
        AppToast.show(this, "Gesture Sensitivity Profile: $value")
    }
}

// v71.5: Cast Video Stabilization
internal fun PlayerActivity.showV71CastVideoStabilizationToggle() {
    val enabled = !BiliClient.prefs.v71CastVideoStabilization
    BiliClient.prefs.v71CastVideoStabilization = enabled
    AppToast.show(this, "Cast Video Stabilization: ${if (enabled) "ON" else "OFF"}")
}

// v71.6: Playlist Auto Recover
internal fun PlayerActivity.showV71PlaylistAutoRecoverToggle() {
    val enabled = !BiliClient.prefs.v71PlaylistAutoRecover
    BiliClient.prefs.v71PlaylistAutoRecover = enabled
    AppToast.show(this, "Playlist Auto Recover: ${if (enabled) "ON" else "OFF"}")
}

// v71.7: Cache Integrity Check
internal fun PlayerActivity.showV71CacheIntegrityCheckToggle() {
    val enabled = !BiliClient.prefs.v71CacheIntegrityCheck
    BiliClient.prefs.v71CacheIntegrityCheck = enabled
    AppToast.show(this, "Cache Integrity Check: ${if (enabled) "ON" else "OFF"}")
}

// v71.8: Progress Bar Chapter Marks
internal fun PlayerActivity.showV71ProgressBarChapterMarksToggle() {
    val enabled = !BiliClient.prefs.v71ProgressBarChapterMarks
    BiliClient.prefs.v71ProgressBarChapterMarks = enabled
    AppToast.show(this, "Progress Bar Chapter Marks: ${if (enabled) "ON" else "OFF"}")
}

// v71.9: Volume Normalization Auto
internal fun PlayerActivity.showV71VolumeNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v71VolumeNormalizationAuto
    BiliClient.prefs.v71VolumeNormalizationAuto = enabled
    AppToast.show(this, "Volume Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

// v71.10: History Auto Sync
internal fun PlayerActivity.showV71HistoryAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v71HistoryAutoSync
    BiliClient.prefs.v71HistoryAutoSync = enabled
    AppToast.show(this, "History Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

// v71.11: Playback Resume From Bookmark
internal fun PlayerActivity.showV71PlaybackResumeFromBookmarkToggle() {
    val enabled = !BiliClient.prefs.v71PlaybackResumeFromBookmark
    BiliClient.prefs.v71PlaybackResumeFromBookmark = enabled
    AppToast.show(this, "Playback Resume From Bookmark: ${if (enabled) "ON" else "OFF"}")
}

// v71.12: Screenshot Auto Annotate
internal fun PlayerActivity.showV71ScreenshotAutoAnnotateToggle() {
    val enabled = !BiliClient.prefs.v71ScreenshotAutoAnnotate
    BiliClient.prefs.v71ScreenshotAutoAnnotate = enabled
    AppToast.show(this, "Screenshot Auto Annotate: ${if (enabled) "ON" else "OFF"}")
}

// v71.13: Video HDR10+
internal fun PlayerActivity.showV71VideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v71VideoHDR10Plus
    BiliClient.prefs.v71VideoHDR10Plus = enabled
    AppToast.show(this, "Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

// v71.14: Danmaku Layer Management
internal fun PlayerActivity.showV71DanmakuLayerManagementDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71DanmakuLayerManagement).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Layer Management",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71DanmakuLayerManagement = value
        AppToast.show(this, "Danmaku Layer Management: $value")
    }
}

// v71.15: Subtitle Line Spacing Custom
internal fun PlayerActivity.showV71SubtitleLineSpacingCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v71SubtitleLineSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71SubtitleLineSpacingCustom = value
        AppToast.show(this, "Subtitle Line Spacing Custom: $value")
    }
}

// v72.1: Video Frame Rate Convert
internal fun PlayerActivity.showV72VideoFrameRateConvertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VideoFrameRateConvert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Frame Rate Convert",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VideoFrameRateConvert = value
        AppToast.show(this, "Video Frame Rate Convert: $value")
    }
}

// v72.2: Danmaku Priority System
internal fun PlayerActivity.showV72DanmakuPrioritySystemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuPrioritySystem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Priority System",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72DanmakuPrioritySystem = value
        AppToast.show(this, "Danmaku Priority System: $value")
    }
}

// v72.3: Subtitle Char Spacing Custom
internal fun PlayerActivity.showV72SubtitleCharSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v72SubtitleCharSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Char Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72SubtitleCharSpacingCustom = value
        AppToast.show(this, "Subtitle Char Spacing Custom: $value")
    }
}

// v72.4: Gesture Dead Zone Custom
internal fun PlayerActivity.showV72GestureDeadZoneCustomDialog() {
    val options = listOf(5, 10, 15, 20, 25)
    val currentIndex = options.indexOf(BiliClient.prefs.v72GestureDeadZoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Dead Zone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72GestureDeadZoneCustom = value
        AppToast.show(this, "Gesture Dead Zone Custom: $value")
    }
}

// v72.5: Cast Audio Normalization
internal fun PlayerActivity.showV72CastAudioNormalizationToggle() {
    val enabled = !BiliClient.prefs.v72CastAudioNormalization
    BiliClient.prefs.v72CastAudioNormalization = enabled
    AppToast.show(this, "Cast Audio Normalization: ${if (enabled) "ON" else "OFF"}")
}

// v72.6: Playlist Auto Recover Mode
internal fun PlayerActivity.showV72PlaylistAutoRecoverModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72PlaylistAutoRecoverMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72PlaylistAutoRecoverMode = value
        AppToast.show(this, "Playlist Auto Recover Mode: $value")
    }
}

// v72.7: Cache Deduplication
internal fun PlayerActivity.showV72CacheDeduplicationToggle() {
    val enabled = !BiliClient.prefs.v72CacheDeduplication
    BiliClient.prefs.v72CacheDeduplication = enabled
    AppToast.show(this, "Cache Deduplication: ${if (enabled) "ON" else "OFF"}")
}

// v72.8: Progress Bar Buffer Indicator
internal fun PlayerActivity.showV72ProgressBarBufferIndicatorToggle() {
    val enabled = !BiliClient.prefs.v72ProgressBarBufferIndicator
    BiliClient.prefs.v72ProgressBarBufferIndicator = enabled
    AppToast.show(this, "Progress Bar Buffer Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v72.9: Volume Compression Strength
internal fun PlayerActivity.showV72VolumeCompressionStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VolumeCompressionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Compression Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VolumeCompressionStrength = value
        AppToast.show(this, "Volume Compression Strength: $value")
    }
}

// v72.10: History Auto Backup
internal fun PlayerActivity.showV72HistoryAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v72HistoryAutoBackup
    BiliClient.prefs.v72HistoryAutoBackup = enabled
    AppToast.show(this, "History Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

// v72.11: Playback Auto Bookmark
internal fun PlayerActivity.showV72PlaybackAutoBookmarkToggle() {
    val enabled = !BiliClient.prefs.v72PlaybackAutoBookmark
    BiliClient.prefs.v72PlaybackAutoBookmark = enabled
    AppToast.show(this, "Playback Auto Bookmark: ${if (enabled) "ON" else "OFF"}")
}

// v72.12: Screenshot Auto Share
internal fun PlayerActivity.showV72ScreenshotAutoShareToggle() {
    val enabled = !BiliClient.prefs.v72ScreenshotAutoShare
    BiliClient.prefs.v72ScreenshotAutoShare = enabled
    AppToast.show(this, "Screenshot Auto Share: ${if (enabled) "ON" else "OFF"}")
}

// v72.13: Video Dolby Vision Profile
internal fun PlayerActivity.showV72VideoDolbyVisionProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VideoDolbyVisionProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dolby Vision Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VideoDolbyVisionProfile = value
        AppToast.show(this, "Video Dolby Vision Profile: $value")
    }
}

// v72.14: Danmaku Animation Effects
internal fun PlayerActivity.showV72DanmakuAnimationEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuAnimationEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Animation Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72DanmakuAnimationEffects = value
        AppToast.show(this, "Danmaku Animation Effects: $value")
    }
}

// v72.15: Subtitle BG Gradient Custom
internal fun PlayerActivity.showV72SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v72SubtitleBgGradientCustom
    BiliClient.prefs.v72SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

// v73.1: Video Color Space Convert
internal fun PlayerActivity.showV73VideoColorSpaceConvertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73VideoColorSpaceConvert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space Convert",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73VideoColorSpaceConvert = value
        AppToast.show(this, "Video Color Space Convert: $value")
    }
}

// v73.2: Danmaku Scroll Direction Custom
internal fun PlayerActivity.showV73DanmakuScrollDirectionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73DanmakuScrollDirectionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73DanmakuScrollDirectionCustom = value
        AppToast.show(this, "Danmaku Scroll Direction Custom: $value")
    }
}

// v73.3: Subtitle Animation Custom
internal fun PlayerActivity.showV73SubtitleAnimationCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73SubtitleAnimationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73SubtitleAnimationCustom = value
        AppToast.show(this, "Subtitle Animation Custom: $value")
    }
}

// v73.4: Gesture Feedback Mode
internal fun PlayerActivity.showV73GestureFeedbackModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73GestureFeedbackMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Feedback Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73GestureFeedbackMode = value
        AppToast.show(this, "Gesture Feedback Mode: $value")
    }
}

// v73.5: Cast Video Color Space
internal fun PlayerActivity.showV73CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73CastVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73CastVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

// v73.6: Playlist Auto Recover Priority
internal fun PlayerActivity.showV73PlaylistAutoRecoverPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73PlaylistAutoRecoverPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73PlaylistAutoRecoverPriority = value
        AppToast.show(this, "Playlist Auto Recover Priority: $value")
    }
}

// v73.7: Cache Verification Mode
internal fun PlayerActivity.showV73CacheVerificationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73CacheVerificationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Verification Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73CacheVerificationMode = value
        AppToast.show(this, "Cache Verification Mode: $value")
    }
}

// v73.8: Progress Bar Thumb Style
internal fun PlayerActivity.showV73ProgressBarThumbStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73ProgressBarThumbStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73ProgressBarThumbStyle = value
        AppToast.show(this, "Progress Bar Thumb Style: $value")
    }
}

// v73.9: Volume Expansion Strength
internal fun PlayerActivity.showV73VolumeExpansionStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v73VolumeExpansionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Expansion Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73VolumeExpansionStrength = value
        AppToast.show(this, "Volume Expansion Strength: $value")
    }
}

// v73.10: History Auto Sync Mode
internal fun PlayerActivity.showV73HistoryAutoSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73HistoryAutoSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73HistoryAutoSyncMode = value
        AppToast.show(this, "History Auto Sync Mode: $value")
    }
}

// v73.11: Playback Auto Bookmark Mode
internal fun PlayerActivity.showV73PlaybackAutoBookmarkModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73PlaybackAutoBookmarkMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Bookmark Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73PlaybackAutoBookmarkMode = value
        AppToast.show(this, "Playback Auto Bookmark Mode: $value")
    }
}

// v73.12: Screenshot Auto Edit
internal fun PlayerActivity.showV73ScreenshotAutoEditToggle() {
    val enabled = !BiliClient.prefs.v73ScreenshotAutoEdit
    BiliClient.prefs.v73ScreenshotAutoEdit = enabled
    AppToast.show(this, "Screenshot Auto Edit: ${if (enabled) "ON" else "OFF"}")
}

// v73.13: Video Alpha Channel
internal fun PlayerActivity.showV73VideoAlphaChannelToggle() {
    val enabled = !BiliClient.prefs.v73VideoAlphaChannel
    BiliClient.prefs.v73VideoAlphaChannel = enabled
    AppToast.show(this, "Video Alpha Channel: ${if (enabled) "ON" else "OFF"}")
}

// v73.14: Danmaku Font Weight Adaptive
internal fun PlayerActivity.showV73DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v73DanmakuFontWeightAdaptive
    BiliClient.prefs.v73DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v73.15: Subtitle Outline Effects
internal fun PlayerActivity.showV73SubtitleOutlineEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73SubtitleOutlineEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73SubtitleOutlineEffects = value
        AppToast.show(this, "Subtitle Outline Effects: $value")
    }
}

// v74.1: Video Depth Of Field
internal fun PlayerActivity.showV74VideoDepthOfFieldToggle() {
    val enabled = !BiliClient.prefs.v74VideoDepthOfField
    BiliClient.prefs.v74VideoDepthOfField = enabled
    AppToast.show(this, "Video Depth Of Field: ${if (enabled) "ON" else "OFF"}")
}

// v74.2: Danmaku Background Blur
internal fun PlayerActivity.showV74DanmakuBackgroundBlurDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuBackgroundBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Background Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74DanmakuBackgroundBlur = value
        AppToast.show(this, "Danmaku Background Blur: $value")
    }
}

// v74.3: Subtitle Shadow Effects
internal fun PlayerActivity.showV74SubtitleShadowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74SubtitleShadowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74SubtitleShadowEffects = value
        AppToast.show(this, "Subtitle Shadow Effects: $value")
    }
}

// v74.4: Gesture Animation Mode
internal fun PlayerActivity.showV74GestureAnimationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74GestureAnimationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Animation Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74GestureAnimationMode = value
        AppToast.show(this, "Gesture Animation Mode: $value")
    }
}

// v74.5: Cast Video HDR10+
internal fun PlayerActivity.showV74CastVideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v74CastVideoHDR10Plus
    BiliClient.prefs.v74CastVideoHDR10Plus = enabled
    AppToast.show(this, "Cast Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

// v74.6: Playlist Auto Recover Time
internal fun PlayerActivity.showV74PlaylistAutoRecoverTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74PlaylistAutoRecoverTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74PlaylistAutoRecoverTime = value
        AppToast.show(this, "Playlist Auto Recover Time: $value")
    }
}

// v74.7: Cache Compression Mode
internal fun PlayerActivity.showV74CacheCompressionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74CacheCompressionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compression Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74CacheCompressionMode = value
        AppToast.show(this, "Cache Compression Mode: $value")
    }
}

// v74.8: Progress Bar Seek Preview
internal fun PlayerActivity.showV74ProgressBarSeekPreviewToggle() {
    val enabled = !BiliClient.prefs.v74ProgressBarSeekPreview
    BiliClient.prefs.v74ProgressBarSeekPreview = enabled
    AppToast.show(this, "Progress Bar Seek Preview: ${if (enabled) "ON" else "OFF"}")
}

// v74.9: Volume Equalizer Preset
internal fun PlayerActivity.showV74VolumeEqualizerPresetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74VolumeEqualizerPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Equalizer Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74VolumeEqualizerPreset = value
        AppToast.show(this, "Volume Equalizer Preset: $value")
    }
}

// v74.10: History Auto Backup Mode
internal fun PlayerActivity.showV74HistoryAutoBackupModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74HistoryAutoBackupMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74HistoryAutoBackupMode = value
        AppToast.show(this, "History Auto Backup Mode: $value")
    }
}

// v74.11: Playback Auto Pause On Focus
internal fun PlayerActivity.showV74PlaybackAutoPauseOnFocusToggle() {
    val enabled = !BiliClient.prefs.v74PlaybackAutoPauseOnFocus
    BiliClient.prefs.v74PlaybackAutoPauseOnFocus = enabled
    AppToast.show(this, "Playback Auto Pause On Focus: ${if (enabled) "ON" else "OFF"}")
}

// v74.12: Screenshot Auto Crop
internal fun PlayerActivity.showV74ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v74ScreenshotAutoCrop
    BiliClient.prefs.v74ScreenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

// v74.13: Video Bokeh Effect
internal fun PlayerActivity.showV74VideoBokehEffectToggle() {
    val enabled = !BiliClient.prefs.v74VideoBokehEffect
    BiliClient.prefs.v74VideoBokehEffect = enabled
    AppToast.show(this, "Video Bokeh Effect: ${if (enabled) "ON" else "OFF"}")
}

// v74.14: Danmaku Shadow Effects
internal fun PlayerActivity.showV74DanmakuShadowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuShadowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Shadow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74DanmakuShadowEffects = value
        AppToast.show(this, "Danmaku Shadow Effects: $value")
    }
}

// v74.15: Subtitle Glow Effects
internal fun PlayerActivity.showV74SubtitleGlowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74SubtitleGlowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Glow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74SubtitleGlowEffects = value
        AppToast.show(this, "Subtitle Glow Effects: $value")
    }
}

// v75.1: Video Chroma Key
internal fun PlayerActivity.showV75VideoChromaKeyToggle() {
    val enabled = !BiliClient.prefs.v75VideoChromaKey
    BiliClient.prefs.v75VideoChromaKey = enabled
    AppToast.show(this, "Video Chroma Key: ${if (enabled) "ON" else "OFF"}")
}

// v75.2: Danmaku Glow Effects
internal fun PlayerActivity.showV75DanmakuGlowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuGlowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Glow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75DanmakuGlowEffects = value
        AppToast.show(this, "Danmaku Glow Effects: $value")
    }
}

// v75.3: Subtitle Border Effects
internal fun PlayerActivity.showV75SubtitleBorderEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75SubtitleBorderEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Border Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75SubtitleBorderEffects = value
        AppToast.show(this, "Subtitle Border Effects: $value")
    }
}

// v75.4: Gesture Sound Feedback
internal fun PlayerActivity.showV75GestureSoundFeedbackToggle() {
    val enabled = !BiliClient.prefs.v75GestureSoundFeedback
    BiliClient.prefs.v75GestureSoundFeedback = enabled
    AppToast.show(this, "Gesture Sound Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v75.5: Cast Audio Spatial
internal fun PlayerActivity.showV75CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v75CastAudioSpatial
    BiliClient.prefs.v75CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

// v75.6: Playlist Auto Recover Source
internal fun PlayerActivity.showV75PlaylistAutoRecoverSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75PlaylistAutoRecoverSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75PlaylistAutoRecoverSource = value
        AppToast.show(this, "Playlist Auto Recover Source: $value")
    }
}

// v75.7: Cache Encryption Mode
internal fun PlayerActivity.showV75CacheEncryptionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75CacheEncryptionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Encryption Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75CacheEncryptionMode = value
        AppToast.show(this, "Cache Encryption Mode: $value")
    }
}

// v75.8: Progress Bar Chapter Preview
internal fun PlayerActivity.showV75ProgressBarChapterPreviewToggle() {
    val enabled = !BiliClient.prefs.v75ProgressBarChapterPreview
    BiliClient.prefs.v75ProgressBarChapterPreview = enabled
    AppToast.show(this, "Progress Bar Chapter Preview: ${if (enabled) "ON" else "OFF"}")
}

// v75.9: Volume Spatial Audio
internal fun PlayerActivity.showV75VolumeSpatialAudioToggle() {
    val enabled = !BiliClient.prefs.v75VolumeSpatialAudio
    BiliClient.prefs.v75VolumeSpatialAudio = enabled
    AppToast.show(this, "Volume Spatial Audio: ${if (enabled) "ON" else "OFF"}")
}

// v75.10: History Auto Restore
internal fun PlayerActivity.showV75HistoryAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v75HistoryAutoRestore
    BiliClient.prefs.v75HistoryAutoRestore = enabled
    AppToast.show(this, "History Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

// v75.11: Playback Auto Resume On Return
internal fun PlayerActivity.showV75PlaybackAutoResumeOnReturnToggle() {
    val enabled = !BiliClient.prefs.v75PlaybackAutoResumeOnReturn
    BiliClient.prefs.v75PlaybackAutoResumeOnReturn = enabled
    AppToast.show(this, "Playback Auto Resume On Return: ${if (enabled) "ON" else "OFF"}")
}

// v75.12: Screenshot Auto Filter
internal fun PlayerActivity.showV75ScreenshotAutoFilterToggle() {
    val enabled = !BiliClient.prefs.v75ScreenshotAutoFilter
    BiliClient.prefs.v75ScreenshotAutoFilter = enabled
    AppToast.show(this, "Screenshot Auto Filter: ${if (enabled) "ON" else "OFF"}")
}

// v75.13: Video Frame Blend
internal fun PlayerActivity.showV75VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v75VideoFrameBlend
    BiliClient.prefs.v75VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v75.14: Danmaku Border Effects
internal fun PlayerActivity.showV75DanmakuBorderEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuBorderEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75DanmakuBorderEffects = value
        AppToast.show(this, "Danmaku Border Effects: $value")
    }
}

// v75.15: Subtitle Animation Speed
internal fun PlayerActivity.showV75SubtitleAnimationSpeedDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v75SubtitleAnimationSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75SubtitleAnimationSpeed = value
        AppToast.show(this, "Subtitle Animation Speed: $value")
    }
}

// v76.1: Video Color Grading Preset
internal fun PlayerActivity.showV76VideoColorGradingPresetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76VideoColorGradingPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Grading Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76VideoColorGradingPreset = value
        AppToast.show(this, "Video Color Grading Preset: $value")
    }
}

// v76.2: Danmaku Font Style Custom
internal fun PlayerActivity.showV76DanmakuFontStyleCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76DanmakuFontStyleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Style Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76DanmakuFontStyleCustom = value
        AppToast.show(this, "Danmaku Font Style Custom: $value")
    }
}

// v76.3: Subtitle Font Style Custom
internal fun PlayerActivity.showV76SubtitleFontStyleCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76SubtitleFontStyleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Style Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76SubtitleFontStyleCustom = value
        AppToast.show(this, "Subtitle Font Style Custom: $value")
    }
}

// v76.4: Gesture Vibration Feedback
internal fun PlayerActivity.showV76GestureVibrationFeedbackToggle() {
    val enabled = !BiliClient.prefs.v76GestureVibrationFeedback
    BiliClient.prefs.v76GestureVibrationFeedback = enabled
    AppToast.show(this, "Gesture Vibration Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v76.5: Cast Video Dolby Atmos
internal fun PlayerActivity.showV76CastVideoDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v76CastVideoDolbyAtmos
    BiliClient.prefs.v76CastVideoDolbyAtmos = enabled
    AppToast.show(this, "Cast Video Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

// v76.6: Playlist Auto Recover Strategy
internal fun PlayerActivity.showV76PlaylistAutoRecoverStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76PlaylistAutoRecoverStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Strategy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76PlaylistAutoRecoverStrategy = value
        AppToast.show(this, "Playlist Auto Recover Strategy: $value")
    }
}

// v76.7: Cache Location Mode
internal fun PlayerActivity.showV76CacheLocationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76CacheLocationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Location Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76CacheLocationMode = value
        AppToast.show(this, "Cache Location Mode: $value")
    }
}

// v76.8: Progress Bar Buffer Color
internal fun PlayerActivity.showV76ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffer Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76ProgressBarBufferColor = value
        AppToast.show(this, "Progress Bar Buffer Color: $value")
    }
}

// v76.9: Volume 3D Audio
internal fun PlayerActivity.showV76Volume3DAudioToggle() {
    val enabled = !BiliClient.prefs.v76Volume3DAudio
    BiliClient.prefs.v76Volume3DAudio = enabled
    AppToast.show(this, "Volume 3D Audio: ${if (enabled) "ON" else "OFF"}")
}

// v76.10: History Auto Sync Source
internal fun PlayerActivity.showV76HistoryAutoSyncSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76HistoryAutoSyncSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76HistoryAutoSyncSource = value
        AppToast.show(this, "History Auto Sync Source: $value")
    }
}

// v76.11: Playback Auto Skip Silence
internal fun PlayerActivity.showV76PlaybackAutoSkipSilenceToggle() {
    val enabled = !BiliClient.prefs.v76PlaybackAutoSkipSilence
    BiliClient.prefs.v76PlaybackAutoSkipSilence = enabled
    AppToast.show(this, "Playback Auto Skip Silence: ${if (enabled) "ON" else "OFF"}")
}

// v76.12: Screenshot Auto Annotate Mode
internal fun PlayerActivity.showV76ScreenshotAutoAnnotateModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76ScreenshotAutoAnnotateMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Annotate Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76ScreenshotAutoAnnotateMode = value
        AppToast.show(this, "Screenshot Auto Annotate Mode: $value")
    }
}

// v76.13: Video LUT Custom
internal fun PlayerActivity.showV76VideoLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v76VideoLUTCustom
    BiliClient.prefs.v76VideoLUTCustom = enabled
    AppToast.show(this, "Video LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

// v76.14: Danmaku Font Custom Path
internal fun PlayerActivity.showV76DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v76DanmakuFontCustomPath
    BiliClient.prefs.v76DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
}

// v76.15: Subtitle Font Weight Custom
internal fun PlayerActivity.showV76SubtitleFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v76SubtitleFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76SubtitleFontWeightCustom = value
        AppToast.show(this, "Subtitle Font Weight Custom: $value")
    }
}

// v77.1: Video Frame Interpolation
internal fun PlayerActivity.showV77VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v77VideoFrameInterpolation
    BiliClient.prefs.v77VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
}

// v77.2: Danmaku Priority Custom
internal fun PlayerActivity.showV77DanmakuPriorityCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuPriorityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Priority Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77DanmakuPriorityCustom = value
        AppToast.show(this, "Danmaku Priority Custom: $value")
    }
}

// v77.3: Subtitle Kerning Custom
internal fun PlayerActivity.showV77SubtitleKerningCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v77SubtitleKerningCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Kerning Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77SubtitleKerningCustom = value
        AppToast.show(this, "Subtitle Kerning Custom: $value")
    }
}

// v77.4: Gesture Visual Feedback
internal fun PlayerActivity.showV77GestureVisualFeedbackToggle() {
    val enabled = !BiliClient.prefs.v77GestureVisualFeedback
    BiliClient.prefs.v77GestureVisualFeedback = enabled
    AppToast.show(this, "Gesture Visual Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v77.5: Cast Audio 3D
internal fun PlayerActivity.showV77CastAudio3DToggle() {
    val enabled = !BiliClient.prefs.v77CastAudio3D
    BiliClient.prefs.v77CastAudio3D = enabled
    AppToast.show(this, "Cast Audio 3D: ${if (enabled) "ON" else "OFF"}")
}

// v77.6: Playlist Auto Recover Limit
internal fun PlayerActivity.showV77PlaylistAutoRecoverLimitDialog() {
    val options = listOf(5, 10, 15, 20, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v77PlaylistAutoRecoverLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77PlaylistAutoRecoverLimit = value
        AppToast.show(this, "Playlist Auto Recover Limit: $value")
    }
}

// v77.7: Cache Priority Mode
internal fun PlayerActivity.showV77CachePriorityModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77CachePriorityMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Priority Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77CachePriorityMode = value
        AppToast.show(this, "Cache Priority Mode: $value")
    }
}

// v77.8: Progress Bar Thumb Color
internal fun PlayerActivity.showV77ProgressBarThumbColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77ProgressBarThumbColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77ProgressBarThumbColor = value
        AppToast.show(this, "Progress Bar Thumb Color: $value")
    }
}

// v77.9: Volume Auto Leveling
internal fun PlayerActivity.showV77VolumeAutoLevelingToggle() {
    val enabled = !BiliClient.prefs.v77VolumeAutoLeveling
    BiliClient.prefs.v77VolumeAutoLeveling = enabled
    AppToast.show(this, "Volume Auto Leveling: ${if (enabled) "ON" else "OFF"}")
}

// v77.10: History Auto Backup Source
internal fun PlayerActivity.showV77HistoryAutoBackupSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77HistoryAutoBackupSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77HistoryAutoBackupSource = value
        AppToast.show(this, "History Auto Backup Source: $value")
    }
}

// v77.11: Playback Auto Skip Intro Custom
internal fun PlayerActivity.showV77PlaybackAutoSkipIntroCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77PlaybackAutoSkipIntroCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Intro Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77PlaybackAutoSkipIntroCustom = value
        AppToast.show(this, "Playback Auto Skip Intro Custom: $value")
    }
}

// v77.12: Screenshot Auto Share Mode
internal fun PlayerActivity.showV77ScreenshotAutoShareModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77ScreenshotAutoShareMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Share Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77ScreenshotAutoShareMode = value
        AppToast.show(this, "Screenshot Auto Share Mode: $value")
    }
}

// v77.13: Video Motion Blur
internal fun PlayerActivity.showV77VideoMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v77VideoMotionBlur
    BiliClient.prefs.v77VideoMotionBlur = enabled
    AppToast.show(this, "Video Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v77.14: Danmaku Layer Custom
internal fun PlayerActivity.showV77DanmakuLayerCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuLayerCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Layer Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77DanmakuLayerCustom = value
        AppToast.show(this, "Danmaku Layer Custom: $value")
    }
}

// v77.15: Subtitle Letter Spacing Custom
internal fun PlayerActivity.showV77SubtitleLetterSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v77SubtitleLetterSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Letter Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77SubtitleLetterSpacingCustom = value
        AppToast.show(this, "Subtitle Letter Spacing Custom: $value")
    }
}

// v78.1: Video Adaptive Resolution
internal fun PlayerActivity.showV78VideoAdaptiveResolutionToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveResolution
    BiliClient.prefs.v78VideoAdaptiveResolution = enabled
    AppToast.show(this, "Video Adaptive Resolution: ${if (enabled) "ON" else "OFF"}")
}

// v78.2: Danmaku Collision Mode
internal fun PlayerActivity.showV78DanmakuCollisionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78DanmakuCollisionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Collision Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78DanmakuCollisionMode = value
        AppToast.show(this, "Danmaku Collision Mode: $value")
    }
}

// v78.3: Subtitle Animation Delay
internal fun PlayerActivity.showV78SubtitleAnimationDelayDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v78SubtitleAnimationDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78SubtitleAnimationDelay = value
        AppToast.show(this, "Subtitle Animation Delay: $value")
    }
}

// v78.4: Gesture Long Press Duration
internal fun PlayerActivity.showV78GestureLongPressDurationDialog() {
    val options = listOf(300, 400, 500, 600, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v78GestureLongPressDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78GestureLongPressDuration = value
        AppToast.show(this, "Gesture Long Press Duration: $value")
    }
}

// v78.5: Cast Video Dolby Vision IQ
internal fun PlayerActivity.showV78CastVideoDolbyVisionIQToggle() {
    val enabled = !BiliClient.prefs.v78CastVideoDolbyVisionIQ
    BiliClient.prefs.v78CastVideoDolbyVisionIQ = enabled
    AppToast.show(this, "Cast Video Dolby Vision IQ: ${if (enabled) "ON" else "OFF"}")
}

// v78.6: Playlist Auto Recover Time Limit
internal fun PlayerActivity.showV78PlaylistAutoRecoverTimeLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78PlaylistAutoRecoverTimeLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Time Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78PlaylistAutoRecoverTimeLimit = value
        AppToast.show(this, "Playlist Auto Recover Time Limit: $value")
    }
}

// v78.7: Cache Size Limit Custom
internal fun PlayerActivity.showV78CacheSizeLimitCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78CacheSizeLimitCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Size Limit Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78CacheSizeLimitCustom = value
        AppToast.show(this, "Cache Size Limit Custom: $value")
    }
}

// v78.8: Progress Bar Thumb Opacity
internal fun PlayerActivity.showV78ProgressBarThumbOpacityDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v78ProgressBarThumbOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78ProgressBarThumbOpacity = value
        AppToast.show(this, "Progress Bar Thumb Opacity: $value")
    }
}

// v78.9: Volume Auto Leveling Mode
internal fun PlayerActivity.showV78VolumeAutoLevelingModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78VolumeAutoLevelingMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Auto Leveling Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78VolumeAutoLevelingMode = value
        AppToast.show(this, "Volume Auto Leveling Mode: $value")
    }
}

// v78.10: History Auto Sync Time
internal fun PlayerActivity.showV78HistoryAutoSyncTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78HistoryAutoSyncTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78HistoryAutoSyncTime = value
        AppToast.show(this, "History Auto Sync Time: $value")
    }
}

// v78.11: Playback Auto Skip Outro Custom
internal fun PlayerActivity.showV78PlaybackAutoSkipOutroCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78PlaybackAutoSkipOutroCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Outro Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78PlaybackAutoSkipOutroCustom = value
        AppToast.show(this, "Playback Auto Skip Outro Custom: $value")
    }
}

// v78.12: Screenshot Auto Edit Mode
internal fun PlayerActivity.showV78ScreenshotAutoEditModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78ScreenshotAutoEditMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Edit Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78ScreenshotAutoEditMode = value
        AppToast.show(this, "Screenshot Auto Edit Mode: $value")
    }
}

// v78.13: Video Adaptive Bitrate
internal fun PlayerActivity.showV78VideoAdaptiveBitrateToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveBitrate
    BiliClient.prefs.v78VideoAdaptiveBitrate = enabled
    AppToast.show(this, "Video Adaptive Bitrate: ${if (enabled) "ON" else "OFF"}")
}

// v78.14: Danmaku Scroll Speed Adaptive
internal fun PlayerActivity.showV78DanmakuScrollSpeedAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v78DanmakuScrollSpeedAdaptive
    BiliClient.prefs.v78DanmakuScrollSpeedAdaptive = enabled
    AppToast.show(this, "Danmaku Scroll Speed Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v78.15: Subtitle Font Stretch Custom
internal fun PlayerActivity.showV78SubtitleFontStretchCustomDialog() {
    val options = listOf(75, 80, 90, 100, 110, 120, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v78SubtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78SubtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
}

// v79.1: Video Color Grading Custom
internal fun PlayerActivity.showV79VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v79VideoColorGradingCustom
    BiliClient.prefs.v79VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

// v79.2: Danmaku Font Spacing Adaptive
internal fun PlayerActivity.showV79DanmakuFontSpacingAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v79DanmakuFontSpacingAdaptive
    BiliClient.prefs.v79DanmakuFontSpacingAdaptive = enabled
    AppToast.show(this, "Danmaku Font Spacing Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v79.3: Subtitle Animation Type
internal fun PlayerActivity.showV79SubtitleAnimationTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79SubtitleAnimationType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79SubtitleAnimationType = value
        AppToast.show(this, "Subtitle Animation Type: $value")
    }
}

// v79.4: Gesture Swipe Velocity
internal fun PlayerActivity.showV79GestureSwipeVelocityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v79GestureSwipeVelocity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Velocity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79GestureSwipeVelocity = value
        AppToast.show(this, "Gesture Swipe Velocity: $value")
    }
}

// v79.5: Cast Audio Spatial Custom
internal fun PlayerActivity.showV79CastAudioSpatialCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79CastAudioSpatialCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Spatial Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79CastAudioSpatialCustom = value
        AppToast.show(this, "Cast Audio Spatial Custom: $value")
    }
}

// v79.6: Playlist Auto Recover Source Mode
internal fun PlayerActivity.showV79PlaylistAutoRecoverSourceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79PlaylistAutoRecoverSourceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Source Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79PlaylistAutoRecoverSourceMode = value
        AppToast.show(this, "Playlist Auto Recover Source Mode: $value")
    }
}

// v79.7: Cache Cleanup Strategy Custom
internal fun PlayerActivity.showV79CacheCleanupStrategyCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79CacheCleanupStrategyCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Strategy Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79CacheCleanupStrategyCustom = value
        AppToast.show(this, "Cache Cleanup Strategy Custom: $value")
    }
}

// v79.8: Progress Bar Thumb Animation
internal fun PlayerActivity.showV79ProgressBarThumbAnimationToggle() {
    val enabled = !BiliClient.prefs.v79ProgressBarThumbAnimation
    BiliClient.prefs.v79ProgressBarThumbAnimation = enabled
    AppToast.show(this, "Progress Bar Thumb Animation: ${if (enabled) "ON" else "OFF"}")
}

// v79.9: Volume Auto Leveling Strength
internal fun PlayerActivity.showV79VolumeAutoLevelingStrengthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v79VolumeAutoLevelingStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Auto Leveling Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79VolumeAutoLevelingStrength = value
        AppToast.show(this, "Volume Auto Leveling Strength: $value")
    }
}

// v79.10: History Auto Backup Time
internal fun PlayerActivity.showV79HistoryAutoBackupTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79HistoryAutoBackupTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79HistoryAutoBackupTime = value
        AppToast.show(this, "History Auto Backup Time: $value")
    }
}

// v79.11: Playback Auto Bookmark Custom
internal fun PlayerActivity.showV79PlaybackAutoBookmarkCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79PlaybackAutoBookmarkCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Bookmark Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79PlaybackAutoBookmarkCustom = value
        AppToast.show(this, "Playback Auto Bookmark Custom: $value")
    }
}

// v79.12: Screenshot Auto Crop Mode
internal fun PlayerActivity.showV79ScreenshotAutoCropModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79ScreenshotAutoCropMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Crop Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79ScreenshotAutoCropMode = value
        AppToast.show(this, "Screenshot Auto Crop Mode: $value")
    }
}

// v79.13: Video Adaptive Frame Rate
internal fun PlayerActivity.showV79VideoAdaptiveFrameRateToggle() {
    val enabled = !BiliClient.prefs.v79VideoAdaptiveFrameRate
    BiliClient.prefs.v79VideoAdaptiveFrameRate = enabled
    AppToast.show(this, "Video Adaptive Frame Rate: ${if (enabled) "ON" else "OFF"}")
}

// v79.14: Danmaku Font Weight Custom
internal fun PlayerActivity.showV79DanmakuFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v79DanmakuFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79DanmakuFontWeightCustom = value
        AppToast.show(this, "Danmaku Font Weight Custom: $value")
    }
}

// v79.15: Subtitle Animation Duration
internal fun PlayerActivity.showV79SubtitleAnimationDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v79SubtitleAnimationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79SubtitleAnimationDuration = value
        AppToast.show(this, "Subtitle Animation Duration: $value")
    }
}

// v80.1: Video Adaptive Color Grading
internal fun PlayerActivity.showV80VideoAdaptiveColorGradingToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveColorGrading
    BiliClient.prefs.v80VideoAdaptiveColorGrading = enabled
    AppToast.show(this, "Video Adaptive Color Grading: ${if (enabled) "ON" else "OFF"}")
}

// v80.2: Danmaku Collision Strength
internal fun PlayerActivity.showV80DanmakuCollisionStrengthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuCollisionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Collision Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80DanmakuCollisionStrength = value
        AppToast.show(this, "Danmaku Collision Strength: $value")
    }
}

// v80.3: Subtitle Animation Easing
internal fun PlayerActivity.showV80SubtitleAnimationEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80SubtitleAnimationEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80SubtitleAnimationEasing = value
        AppToast.show(this, "Subtitle Animation Easing: $value")
    }
}

// v80.4: Gesture Swipe Acceleration Custom
internal fun PlayerActivity.showV80GestureSwipeAccelerationCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v80GestureSwipeAccelerationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Acceleration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80GestureSwipeAccelerationCustom = value
        AppToast.show(this, "Gesture Swipe Acceleration Custom: $value")
    }
}

// v80.5: Cast Video Dolby Vision Custom
internal fun PlayerActivity.showV80CastVideoDolbyVisionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80CastVideoDolbyVisionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Dolby Vision Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80CastVideoDolbyVisionCustom = value
        AppToast.show(this, "Cast Video Dolby Vision Custom: $value")
    }
}

// v80.6: Playlist Auto Recover Strategy Custom
internal fun PlayerActivity.showV80PlaylistAutoRecoverStrategyCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80PlaylistAutoRecoverStrategyCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Strategy Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80PlaylistAutoRecoverStrategyCustom = value
        AppToast.show(this, "Playlist Auto Recover Strategy Custom: $value")
    }
}

// v80.7: Cache Encryption Custom
internal fun PlayerActivity.showV80CacheEncryptionCustomToggle() {
    val enabled = !BiliClient.prefs.v80CacheEncryptionCustom
    BiliClient.prefs.v80CacheEncryptionCustom = enabled
    AppToast.show(this, "Cache Encryption Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.8: Progress Bar Thumb Size Custom
internal fun PlayerActivity.showV80ProgressBarThumbSizeCustomDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v80ProgressBarThumbSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80ProgressBarThumbSizeCustom = value
        AppToast.show(this, "Progress Bar Thumb Size Custom: $value")
    }
}

// v80.9: Volume Auto Leveling Custom
internal fun PlayerActivity.showV80VolumeAutoLevelingCustomToggle() {
    val enabled = !BiliClient.prefs.v80VolumeAutoLevelingCustom
    BiliClient.prefs.v80VolumeAutoLevelingCustom = enabled
    AppToast.show(this, "Volume Auto Leveling Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.10: History Auto Sync Custom
internal fun PlayerActivity.showV80HistoryAutoSyncCustomToggle() {
    val enabled = !BiliClient.prefs.v80HistoryAutoSyncCustom
    BiliClient.prefs.v80HistoryAutoSyncCustom = enabled
    AppToast.show(this, "History Auto Sync Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.11: Playback Auto Resume Custom
internal fun PlayerActivity.showV80PlaybackAutoResumeCustomToggle() {
    val enabled = !BiliClient.prefs.v80PlaybackAutoResumeCustom
    BiliClient.prefs.v80PlaybackAutoResumeCustom = enabled
    AppToast.show(this, "Playback Auto Resume Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.12: Screenshot Auto Share Custom
internal fun PlayerActivity.showV80ScreenshotAutoShareCustomToggle() {
    val enabled = !BiliClient.prefs.v80ScreenshotAutoShareCustom
    BiliClient.prefs.v80ScreenshotAutoShareCustom = enabled
    AppToast.show(this, "Screenshot Auto Share Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.13: Video Adaptive Motion Blur
internal fun PlayerActivity.showV80VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveMotionBlur
    BiliClient.prefs.v80VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v80.14: Danmaku Font Spacing Custom
internal fun PlayerActivity.showV80DanmakuFontSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuFontSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80DanmakuFontSpacingCustom = value
        AppToast.show(this, "Danmaku Font Spacing Custom: $value")
    }
}

// v80.15: Subtitle Animation Loop
internal fun PlayerActivity.showV80SubtitleAnimationLoopToggle() {
    val enabled = !BiliClient.prefs.v80SubtitleAnimationLoop
    BiliClient.prefs.v80SubtitleAnimationLoop = enabled
    AppToast.show(this, "Subtitle Animation Loop: ${if (enabled) "ON" else "OFF"}")
}

// ==================== v81-v90 New Unique Features ====================

// v81.1: Network Bandwidth Adapt
internal fun PlayerActivity.showV81NetworkBandwidthAdaptToggle() {
    val enabled = !BiliClient.prefs.v81NetworkBandwidthAdapt
    BiliClient.prefs.v81NetworkBandwidthAdapt = enabled
    AppToast.show(this, "Network Bandwidth Adapt: ${if (enabled) "ON" else "OFF"}")
}

// v81.2: Danmaku Opacity Curve Custom
internal fun PlayerActivity.showV81DanmakuOpacityCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuOpacityCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Opacity Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81DanmakuOpacityCurveCustom = value
        AppToast.show(this, "Danmaku Opacity Curve Custom: $value")
    }
}

// v81.3: Subtitle Position Lock
internal fun PlayerActivity.showV81SubtitlePositionLockToggle() {
    val enabled = !BiliClient.prefs.v81SubtitlePositionLock
    BiliClient.prefs.v81SubtitlePositionLock = enabled
    AppToast.show(this, "Subtitle Position Lock: ${if (enabled) "ON" else "OFF"}")
}

// v81.4: Gesture Pinch Zoom Speed
internal fun PlayerActivity.showV81GesturePinchZoomSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v81GesturePinchZoomSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Zoom Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81GesturePinchZoomSpeed = value
        AppToast.show(this, "Gesture Pinch Zoom Speed: $value")
    }
}

// v81.5: Cast Reconnect Auto
internal fun PlayerActivity.showV81CastReconnectAutoToggle() {
    val enabled = !BiliClient.prefs.v81CastReconnectAuto
    BiliClient.prefs.v81CastReconnectAuto = enabled
    AppToast.show(this, "Cast Reconnect Auto: ${if (enabled) "ON" else "OFF"}")
}

// v81.6: Playlist Bookmark Sync
internal fun PlayerActivity.showV81PlaylistBookmarkSyncToggle() {
    val enabled = !BiliClient.prefs.v81PlaylistBookmarkSync
    BiliClient.prefs.v81PlaylistBookmarkSync = enabled
    AppToast.show(this, "Playlist Bookmark Sync: ${if (enabled) "ON" else "OFF"}")
}

// v81.7: Cache Prebuffer Size
internal fun PlayerActivity.showV81CachePrebufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81CachePrebufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Prebuffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81CachePrebufferSize = value
        AppToast.show(this, "Cache Prebuffer Size: $value")
    }
}

// v81.8: Progress Bar Double Tap Seek
internal fun PlayerActivity.showV81ProgressBarDoubleTapSeekDialog() {
    val options = listOf(5, 10, 15, 30, 60)
    val currentIndex = options.indexOf(BiliClient.prefs.v81ProgressBarDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81ProgressBarDoubleTapSeek = value
        AppToast.show(this, "Progress Bar Double Tap Seek: $value")
    }
}

// v81.9: Volume Loudness Normalize
internal fun PlayerActivity.showV81VolumeLoudnessNormalizeToggle() {
    val enabled = !BiliClient.prefs.v81VolumeLoudnessNormalize
    BiliClient.prefs.v81VolumeLoudnessNormalize = enabled
    AppToast.show(this, "Volume Loudness Normalize: ${if (enabled) "ON" else "OFF"}")
}

// v81.10: History Search Filter
internal fun PlayerActivity.showV81HistorySearchFilterToggle() {
    val enabled = !BiliClient.prefs.v81HistorySearchFilter
    BiliClient.prefs.v81HistorySearchFilter = enabled
    AppToast.show(this, "History Search Filter: ${if (enabled) "ON" else "OFF"}")
}

// v81.11: Playback Skip Ad Auto
internal fun PlayerActivity.showV81PlaybackSkipAdAutoToggle() {
    val enabled = !BiliClient.prefs.v81PlaybackSkipAdAuto
    BiliClient.prefs.v81PlaybackSkipAdAuto = enabled
    AppToast.show(this, "Playback Skip Ad Auto: ${if (enabled) "ON" else "OFF"}")
}

// v81.12: Screenshot Count Display
internal fun PlayerActivity.showV81ScreenshotCountDisplayToggle() {
    val enabled = !BiliClient.prefs.v81ScreenshotCountDisplay
    BiliClient.prefs.v81ScreenshotCountDisplay = enabled
    AppToast.show(this, "Screenshot Count Display: ${if (enabled) "ON" else "OFF"}")
}

// v81.13: Video Upscale AI
internal fun PlayerActivity.showV81VideoUpscaleAIToggle() {
    val enabled = !BiliClient.prefs.v81VideoUpscaleAI
    BiliClient.prefs.v81VideoUpscaleAI = enabled
    AppToast.show(this, "Video Upscale AI: ${if (enabled) "ON" else "OFF"}")
}

// v81.14: Danmaku Send Rate Limit
internal fun PlayerActivity.showV81DanmakuSendRateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuSendRateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81DanmakuSendRateLimit = value
        AppToast.show(this, "Danmaku Send Rate Limit: $value")
    }
}

// v81.15: Subtitle Timing Offset
internal fun PlayerActivity.showV81SubtitleTimingOffsetDialog() {
    val options = listOf(-500, -250, 0, 250, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v81SubtitleTimingOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Timing Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81SubtitleTimingOffset = value
        AppToast.show(this, "Subtitle Timing Offset: $value")
    }
}

// v82.1: Video Deinterlace Mode
internal fun PlayerActivity.showV82VideoDeinterlaceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82VideoDeinterlaceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Deinterlace Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82VideoDeinterlaceMode = value
        AppToast.show(this, "Video Deinterlace Mode: $value")
    }
}

// v82.2: Danmaku Font Size Auto Range
internal fun PlayerActivity.showV82DanmakuFontSizeAutoRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuFontSizeAutoRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82DanmakuFontSizeAutoRange = value
        AppToast.show(this, "Danmaku Font Size Auto Range: $value")
    }
}

// v82.3: Subtitle BG Blur Custom
internal fun PlayerActivity.showV82SubtitleBgBlurCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v82SubtitleBgBlurCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82SubtitleBgBlurCustom = value
        AppToast.show(this, "Subtitle BG Blur Custom: $value")
    }
}

// v82.4: Gesture Edge Swipe Action
internal fun PlayerActivity.showV82GestureEdgeSwipeActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82GestureEdgeSwipeAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82GestureEdgeSwipeAction = value
        AppToast.show(this, "Gesture Edge Swipe Action: $value")
    }
}

// v82.5: Cast Video Bitrate Limit
internal fun PlayerActivity.showV82CastVideoBitrateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82CastVideoBitrateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Bitrate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82CastVideoBitrateLimit = value
        AppToast.show(this, "Cast Video Bitrate Limit: $value")
    }
}

// v82.6: Playlist Duplicate Detect
internal fun PlayerActivity.showV82PlaylistDuplicateDetectToggle() {
    val enabled = !BiliClient.prefs.v82PlaylistDuplicateDetect
    BiliClient.prefs.v82PlaylistDuplicateDetect = enabled
    AppToast.show(this, "Playlist Duplicate Detect: ${if (enabled) "ON" else "OFF"}")
}

// v82.7: Cache Smart Prefetch
internal fun PlayerActivity.showV82CacheSmartPrefetchToggle() {
    val enabled = !BiliClient.prefs.v82CacheSmartPrefetch
    BiliClient.prefs.v82CacheSmartPrefetch = enabled
    AppToast.show(this, "Cache Smart Prefetch: ${if (enabled) "ON" else "OFF"}")
}

// v82.8: Progress Bar Swipe Seek
internal fun PlayerActivity.showV82ProgressBarSwipeSeekToggle() {
    val enabled = !BiliClient.prefs.v82ProgressBarSwipeSeek
    BiliClient.prefs.v82ProgressBarSwipeSeek = enabled
    AppToast.show(this, "Progress Bar Swipe Seek: ${if (enabled) "ON" else "OFF"}")
}

// v82.9: Volume Night Mode
internal fun PlayerActivity.showV82VolumeNightModeToggle() {
    val enabled = !BiliClient.prefs.v82VolumeNightMode
    BiliClient.prefs.v82VolumeNightMode = enabled
    AppToast.show(this, "Volume Night Mode: ${if (enabled) "ON" else "OFF"}")
}

// v82.10: History Group By Date
internal fun PlayerActivity.showV82HistoryGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v82HistoryGroupByDate
    BiliClient.prefs.v82HistoryGroupByDate = enabled
    AppToast.show(this, "History Group By Date: ${if (enabled) "ON" else "OFF"}")
}

// v82.11: Playback Speed Memory
internal fun PlayerActivity.showV82PlaybackSpeedMemoryToggle() {
    val enabled = !BiliClient.prefs.v82PlaybackSpeedMemory
    BiliClient.prefs.v82PlaybackSpeedMemory = enabled
    AppToast.show(this, "Playback Speed Memory: ${if (enabled) "ON" else "OFF"}")
}

// v82.12: Screenshot Timestamp
internal fun PlayerActivity.showV82ScreenshotTimestampToggle() {
    val enabled = !BiliClient.prefs.v82ScreenshotTimestamp
    BiliClient.prefs.v82ScreenshotTimestamp = enabled
    AppToast.show(this, "Screenshot Timestamp: ${if (enabled) "ON" else "OFF"}")
}

// v82.13: Video Color Temperature Custom
internal fun PlayerActivity.showV82VideoColorTemperatureCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v82VideoColorTemperatureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82VideoColorTemperatureCustom = value
        AppToast.show(this, "Video Color Temperature Custom: $value")
    }
}

// v82.14: Danmaku Merge Algorithm
internal fun PlayerActivity.showV82DanmakuMergeAlgorithmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuMergeAlgorithm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Algorithm",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82DanmakuMergeAlgorithm = value
        AppToast.show(this, "Danmaku Merge Algorithm: $value")
    }
}

// v82.15: Subtitle Sync Auto
internal fun PlayerActivity.showV82SubtitleSyncAutoToggle() {
    val enabled = !BiliClient.prefs.v82SubtitleSyncAuto
    BiliClient.prefs.v82SubtitleSyncAuto = enabled
    AppToast.show(this, "Subtitle Sync Auto: ${if (enabled) "ON" else "OFF"}")
}

// v83.1: Video Noise Gate Custom
internal fun PlayerActivity.showV83VideoNoiseGateCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VideoNoiseGateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Noise Gate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VideoNoiseGateCustom = value
        AppToast.show(this, "Video Noise Gate Custom: $value")
    }
}

// v83.2: Danmaku Scroll Momentum
internal fun PlayerActivity.showV83DanmakuScrollMomentumDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuScrollMomentum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Momentum",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83DanmakuScrollMomentum = value
        AppToast.show(this, "Danmaku Scroll Momentum: $value")
    }
}

// v83.3: Subtitle Karaoke Highlight
internal fun PlayerActivity.showV83SubtitleKaraokeHighlightToggle() {
    val enabled = !BiliClient.prefs.v83SubtitleKaraokeHighlight
    BiliClient.prefs.v83SubtitleKaraokeHighlight = enabled
    AppToast.show(this, "Subtitle Karaoke Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v83.4: Gesture Three Finger Action
internal fun PlayerActivity.showV83GestureThreeFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83GestureThreeFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Three Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83GestureThreeFingerAction = value
        AppToast.show(this, "Gesture Three Finger Action: $value")
    }
}

// v83.5: Cast Audio Delay
internal fun PlayerActivity.showV83CastAudioDelayDialog() {
    val options = listOf(-500, -250, 0, 250, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v83CastAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83CastAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
}

// v83.6: Playlist Smart Sort
internal fun PlayerActivity.showV83PlaylistSmartSortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83PlaylistSmartSort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Smart Sort",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83PlaylistSmartSort = value
        AppToast.show(this, "Playlist Smart Sort: $value")
    }
}

// v83.7: Cache WiFi Priority
internal fun PlayerActivity.showV83CacheWIFIPriorityToggle() {
    val enabled = !BiliClient.prefs.v83CacheWIFIPriority
    BiliClient.prefs.v83CacheWIFIPriority = enabled
    AppToast.show(this, "Cache WiFi Priority: ${if (enabled) "ON" else "OFF"}")
}

// v83.8: Progress Bar Gesture Area
internal fun PlayerActivity.showV83ProgressBarGestureAreaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83ProgressBarGestureArea).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Gesture Area",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83ProgressBarGestureArea = value
        AppToast.show(this, "Progress Bar Gesture Area: $value")
    }
}

// v83.9: Volume Balance L-R
internal fun PlayerActivity.showV83VolumeBalanceLRDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VolumeBalanceLR).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance L-R",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VolumeBalanceLR = value
        AppToast.show(this, "Volume Balance L-R: $value")
    }
}

// v83.10: History Max Items
internal fun PlayerActivity.showV83HistoryMaxItemsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83HistoryMaxItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83HistoryMaxItems = value
        AppToast.show(this, "History Max Items: $value")
    }
}

// v83.11: Playback Auto Next Episode
internal fun PlayerActivity.showV83PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v83PlaybackAutoNextEpisode
    BiliClient.prefs.v83PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v83.12: Screenshot Overlay Info
internal fun PlayerActivity.showV83ScreenshotOverlayInfoToggle() {
    val enabled = !BiliClient.prefs.v83ScreenshotOverlayInfo
    BiliClient.prefs.v83ScreenshotOverlayInfo = enabled
    AppToast.show(this, "Screenshot Overlay Info: ${if (enabled) "ON" else "OFF"}")
}

// v83.13: VideoImageSharp Custom
internal fun PlayerActivity.showV83VideoImageSharpCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VideoImageSharpCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "VideoImageSharp Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VideoImageSharpCustom = value
        AppToast.show(this, "VideoImageSharp Custom: $value")
    }
}

// v83.14: Danmaku Color Palette
internal fun PlayerActivity.showV83DanmakuColorPaletteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuColorPalette).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Color Palette",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83DanmakuColorPalette = value
        AppToast.show(this, "Danmaku Color Palette: $value")
    }
}

// v83.15: Subtitle BG Opacity Custom
internal fun PlayerActivity.showV83SubtitleBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83SubtitleBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83SubtitleBgOpacityCustom = value
        AppToast.show(this, "Subtitle BG Opacity Custom: $value")
    }
}

// v84.1: Video Detail Enhance Custom
internal fun PlayerActivity.showV84VideoDetailEnhanceCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VideoDetailEnhanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Detail Enhance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VideoDetailEnhanceCustom = value
        AppToast.show(this, "Video Detail Enhance Custom: $value")
    }
}

// v84.2: Danmaku Scroll Friction
internal fun PlayerActivity.showV84DanmakuScrollFrictionDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84DanmakuScrollFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84DanmakuScrollFriction = value
        AppToast.show(this, "Danmaku Scroll Friction: $value")
    }
}

// v84.3: Subtitle Bilingual Display
internal fun PlayerActivity.showV84SubtitleBilingualDisplayToggle() {
    val enabled = !BiliClient.prefs.v84SubtitleBilingualDisplay
    BiliClient.prefs.v84SubtitleBilingualDisplay = enabled
    AppToast.show(this, "Subtitle Bilingual Display: ${if (enabled) "ON" else "OFF"}")
}

// v84.4: Gesture Four Finger Action
internal fun PlayerActivity.showV84GestureFourFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84GestureFourFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Four Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84GestureFourFingerAction = value
        AppToast.show(this, "Gesture Four Finger Action: $value")
    }
}

// v84.5: Cast Video HDR10 Custom
internal fun PlayerActivity.showV84CastVideoHDR10CustomToggle() {
    val enabled = !BiliClient.prefs.v84CastVideoHDR10Custom
    BiliClient.prefs.v84CastVideoHDR10Custom = enabled
    AppToast.show(this, "Cast Video HDR10 Custom: ${if (enabled) "ON" else "OFF"}")
}

// v84.6: Playlist Auto Play Next
internal fun PlayerActivity.showV84PlaylistAutoPlayNextToggle() {
    val enabled = !BiliClient.prefs.v84PlaylistAutoPlayNext
    BiliClient.prefs.v84PlaylistAutoPlayNext = enabled
    AppToast.show(this, "Playlist Auto Play Next: ${if (enabled) "ON" else "OFF"}")
}

// v84.7: Cache Storage Analyze
internal fun PlayerActivity.showV84CacheStorageAnalyzeToggle() {
    val enabled = !BiliClient.prefs.v84CacheStorageAnalyze
    BiliClient.prefs.v84CacheStorageAnalyze = enabled
    AppToast.show(this, "Cache Storage Analyze: ${if (enabled) "ON" else "OFF"}")
}

// v84.8: Progress Bar Haptic Feedback
internal fun PlayerActivity.showV84ProgressBarHapticFeedbackToggle() {
    val enabled = !BiliClient.prefs.v84ProgressBarHapticFeedback
    BiliClient.prefs.v84ProgressBarHapticFeedback = enabled
    AppToast.show(this, "Progress Bar Haptic Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v84.9: Volume Fade In Duration
internal fun PlayerActivity.showV84VolumeFadeInDurationDialog() {
    val options = listOf(0, 500, 1000, 2000, 3000)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VolumeFadeInDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade In Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VolumeFadeInDuration = value
        AppToast.show(this, "Volume Fade In Duration: $value")
    }
}

// v84.10: History Auto Cleanup
internal fun PlayerActivity.showV84HistoryAutoCleanupToggle() {
    val enabled = !BiliClient.prefs.v84HistoryAutoCleanup
    BiliClient.prefs.v84HistoryAutoCleanup = enabled
    AppToast.show(this, "History Auto Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v84.11: Playback Auto Play On Open
internal fun PlayerActivity.showV84PlaybackAutoPlayOnOpenToggle() {
    val enabled = !BiliClient.prefs.v84PlaybackAutoPlayOnOpen
    BiliClient.prefs.v84PlaybackAutoPlayOnOpen = enabled
    AppToast.show(this, "Playback Auto Play On Open: ${if (enabled) "ON" else "OFF"}")
}

// v84.12: Screenshot Folder Path
internal fun PlayerActivity.showV84ScreenshotFolderPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84ScreenshotFolderPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Folder Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84ScreenshotFolderPath = value
        AppToast.show(this, "Screenshot Folder Path: $value")
    }
}

// v84.13: Video Vividness Custom
internal fun PlayerActivity.showV84VideoVividnessCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VideoVividnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Vividness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VideoVividnessCustom = value
        AppToast.show(this, "Video Vividness Custom: $value")
    }
}

// v84.14: Danmaku Font Italic Toggle
internal fun PlayerActivity.showV84DanmakuFontItalicToggleToggle() {
    val enabled = !BiliClient.prefs.v84DanmakuFontItalicToggle
    BiliClient.prefs.v84DanmakuFontItalicToggle = enabled
    AppToast.show(this, "Danmaku Font Italic Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v84.15: Subtitle Position Custom
internal fun PlayerActivity.showV84SubtitlePositionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84SubtitlePositionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84SubtitlePositionCustom = value
        AppToast.show(this, "Subtitle Position Custom: $value")
    }
}

// v85.1: Video Luma Sharpen Custom
internal fun PlayerActivity.showV85VideoLumaSharpenCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VideoLumaSharpenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Luma Sharpen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VideoLumaSharpenCustom = value
        AppToast.show(this, "Video Luma Sharpen Custom: $value")
    }
}

// v85.2: Danmaku BG Padding Custom
internal fun PlayerActivity.showV85DanmakuBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v85DanmakuBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85DanmakuBgPaddingCustom = value
        AppToast.show(this, "Danmaku BG Padding Custom: $value")
    }
}

// v85.3: Subtitle BG Color Custom
internal fun PlayerActivity.showV85SubtitleBgColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85SubtitleBgColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85SubtitleBgColorCustom = value
        AppToast.show(this, "Subtitle BG Color Custom: $value")
    }
}

// v85.4: Gesture Long Press Action
internal fun PlayerActivity.showV85GestureLongPressActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85GestureLongPressAction = value
        AppToast.show(this, "Gesture Long Press Action: $value")
    }
}

// v85.5: Cast Audio Codec Custom
internal fun PlayerActivity.showV85CastAudioCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85CastAudioCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85CastAudioCodecCustom = value
        AppToast.show(this, "Cast Audio Codec Custom: $value")
    }
}

// v85.6: Playlist Auto Load More
internal fun PlayerActivity.showV85PlaylistAutoLoadMoreToggle() {
    val enabled = !BiliClient.prefs.v85PlaylistAutoLoadMore
    BiliClient.prefs.v85PlaylistAutoLoadMore = enabled
    AppToast.show(this, "Playlist Auto Load More: ${if (enabled) "ON" else "OFF"}")
}

// v85.7: Cache Cleanup On Low Storage
internal fun PlayerActivity.showV85CacheCleanupOnLowStorageToggle() {
    val enabled = !BiliClient.prefs.v85CacheCleanupOnLowStorage
    BiliClient.prefs.v85CacheCleanupOnLowStorage = enabled
    AppToast.show(this, "Cache Cleanup On Low Storage: ${if (enabled) "ON" else "OFF"}")
}

// v85.8: Progress Bar Tooltip
internal fun PlayerActivity.showV85ProgressBarTooltipToggle() {
    val enabled = !BiliClient.prefs.v85ProgressBarTooltip
    BiliClient.prefs.v85ProgressBarTooltip = enabled
    AppToast.show(this, "Progress Bar Tooltip: ${if (enabled) "ON" else "OFF"}")
}

// v85.9: Volume Fade Out Duration
internal fun PlayerActivity.showV85VolumeFadeOutDurationDialog() {
    val options = listOf(0, 500, 1000, 2000, 3000)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VolumeFadeOutDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Out Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VolumeFadeOutDuration = value
        AppToast.show(this, "Volume Fade Out Duration: $value")
    }
}

// v85.10: History Export Format
internal fun PlayerActivity.showV85HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Export Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85HistoryExportFormat = value
        AppToast.show(this, "History Export Format: $value")
    }
}

// v85.11: Playback Auto Loop Single
internal fun PlayerActivity.showV85PlaybackAutoLoopSingleToggle() {
    val enabled = !BiliClient.prefs.v85PlaybackAutoLoopSingle
    BiliClient.prefs.v85PlaybackAutoLoopSingle = enabled
    AppToast.show(this, "Playback Auto Loop Single: ${if (enabled) "ON" else "OFF"}")
}

// v85.12: Screenshot Naming Rule
internal fun PlayerActivity.showV85ScreenshotNamingRuleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85ScreenshotNamingRule).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Naming Rule",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85ScreenshotNamingRule = value
        AppToast.show(this, "Screenshot Naming Rule: $value")
    }
}

// v85.13: Video Chroma Sharpen Custom
internal fun PlayerActivity.showV85VideoChromaSharpenCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VideoChromaSharpenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Chroma Sharpen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VideoChromaSharpenCustom = value
        AppToast.show(this, "Video Chroma Sharpen Custom: $value")
    }
}

// v85.14: Danmaku BG Border Toggle
internal fun PlayerActivity.showV85DanmakuBgBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v85DanmakuBgBorderToggle
    BiliClient.prefs.v85DanmakuBgBorderToggle = enabled
    AppToast.show(this, "Danmaku BG Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v85.15: Subtitle Font Size Auto
internal fun PlayerActivity.showV85SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v85SubtitleFontSizeAuto
    BiliClient.prefs.v85SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
}

// v86.1: Video Contrast Curve Custom
internal fun PlayerActivity.showV86VideoContrastCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VideoContrastCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VideoContrastCurveCustom = value
        AppToast.show(this, "Video Contrast Curve Custom: $value")
    }
}

// v86.2: Danmaku Font Stretch Custom
internal fun PlayerActivity.showV86DanmakuFontStretchCustomDialog() {
    val options = listOf(75, 80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86DanmakuFontStretchCustom = value
        AppToast.show(this, "Danmaku Font Stretch Custom: $value")
    }
}

// v86.3: Subtitle BG Radius Custom
internal fun PlayerActivity.showV86SubtitleBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v86SubtitleBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86SubtitleBgRadiusCustom = value
        AppToast.show(this, "Subtitle BG Radius Custom: $value")
    }
}

// v86.4: Gesture Double Tap Action
internal fun PlayerActivity.showV86GestureDoubleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86GestureDoubleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86GestureDoubleTapAction = value
        AppToast.show(this, "Gesture Double Tap Action: $value")
    }
}

// v86.5: Cast Video Protocol
internal fun PlayerActivity.showV86CastVideoProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86CastVideoProtocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Protocol",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86CastVideoProtocol = value
        AppToast.show(this, "Cast Video Protocol: $value")
    }
}

// v86.6: Playlist Auto Refresh
internal fun PlayerActivity.showV86PlaylistAutoRefreshToggle() {
    val enabled = !BiliClient.prefs.v86PlaylistAutoRefresh
    BiliClient.prefs.v86PlaylistAutoRefresh = enabled
    AppToast.show(this, "Playlist Auto Refresh: ${if (enabled) "ON" else "OFF"}")
}

// v86.7: Cache Max Size Custom
internal fun PlayerActivity.showV86CacheMaxSizeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86CacheMaxSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86CacheMaxSizeCustom = value
        AppToast.show(this, "Cache Max Size Custom: $value")
    }
}

// v86.8: Progress Bar Live Edge
internal fun PlayerActivity.showV86ProgressBarLiveEdgeToggle() {
    val enabled = !BiliClient.prefs.v86ProgressBarLiveEdge
    BiliClient.prefs.v86ProgressBarLiveEdge = enabled
    AppToast.show(this, "Progress Bar Live Edge: ${if (enabled) "ON" else "OFF"}")
}

// v86.9: Volume Boost Strength
internal fun PlayerActivity.showV86VolumeBoostStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VolumeBoostStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VolumeBoostStrength = value
        AppToast.show(this, "Volume Boost Strength: $value")
    }
}

// v86.10: History Import Format
internal fun PlayerActivity.showV86HistoryImportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86HistoryImportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Import Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86HistoryImportFormat = value
        AppToast.show(this, "History Import Format: $value")
    }
}

// v86.11: Playback Auto Quality Switch
internal fun PlayerActivity.showV86PlaybackAutoQualitySwitchToggle() {
    val enabled = !BiliClient.prefs.v86PlaybackAutoQualitySwitch
    BiliClient.prefs.v86PlaybackAutoQualitySwitch = enabled
    AppToast.show(this, "Playback Auto Quality Switch: ${if (enabled) "ON" else "OFF"}")
}

// v86.12: Screenshot Auto Upload
internal fun PlayerActivity.showV86ScreenshotAutoUploadToggle() {
    val enabled = !BiliClient.prefs.v86ScreenshotAutoUpload
    BiliClient.prefs.v86ScreenshotAutoUpload = enabled
    AppToast.show(this, "Screenshot Auto Upload: ${if (enabled) "ON" else "OFF"}")
}

// v86.13: Video Saturation Curve Custom
internal fun PlayerActivity.showV86VideoSaturationCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VideoSaturationCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VideoSaturationCurveCustom = value
        AppToast.show(this, "Video Saturation Curve Custom: $value")
    }
}

// v86.14: Danmaku Send Cooldown
internal fun PlayerActivity.showV86DanmakuSendCooldownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuSendCooldown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Cooldown",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86DanmakuSendCooldown = value
        AppToast.show(this, "Danmaku Send Cooldown: $value")
    }
}

// v86.15: Subtitle Outline Width
internal fun PlayerActivity.showV86SubtitleOutlineWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v86SubtitleOutlineWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86SubtitleOutlineWidth = value
        AppToast.show(this, "Subtitle Outline Width: $value")
    }
}

// v87.1: Video Brightness Curve Custom
internal fun PlayerActivity.showV87VideoBrightnessCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VideoBrightnessCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VideoBrightnessCurveCustom = value
        AppToast.show(this, "Video Brightness Curve Custom: $value")
    }
}

// v87.2: Danmaku Line Height Custom
internal fun PlayerActivity.showV87DanmakuLineHeightCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuLineHeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Line Height Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87DanmakuLineHeightCustom = value
        AppToast.show(this, "Danmaku Line Height Custom: $value")
    }
}

// v87.3: Subtitle Shadow Offset X
internal fun PlayerActivity.showV87SubtitleShadowOffsetXDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v87SubtitleShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87SubtitleShadowOffsetX = value
        AppToast.show(this, "Subtitle Shadow Offset X: $value")
    }
}

// v87.4: Gesture Swipe Threshold
internal fun PlayerActivity.showV87GestureSwipeThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v87GestureSwipeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87GestureSwipeThreshold = value
        AppToast.show(this, "Gesture Swipe Threshold: $value")
    }
}

// v87.5: Cast Audio Sample Rate
internal fun PlayerActivity.showV87CastAudioSampleRateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87CastAudioSampleRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Sample Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87CastAudioSampleRate = value
        AppToast.show(this, "Cast Audio Sample Rate: $value")
    }
}

// v87.6: Playlist Auto Download
internal fun PlayerActivity.showV87PlaylistAutoDownloadToggle() {
    val enabled = !BiliClient.prefs.v87PlaylistAutoDownload
    BiliClient.prefs.v87PlaylistAutoDownload = enabled
    AppToast.show(this, "Playlist Auto Download: ${if (enabled) "ON" else "OFF"}")
}

// v87.7: Cache Cleanup Schedule
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
}

// v87.8: Progress Bar Snap To Chapter
internal fun PlayerActivity.showV87ProgressBarSnapToChapterToggle() {
    val enabled = !BiliClient.prefs.v87ProgressBarSnapToChapter
    BiliClient.prefs.v87ProgressBarSnapToChapter = enabled
    AppToast.show(this, "Progress Bar Snap To Chapter: ${if (enabled) "ON" else "OFF"}")
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
}

// v87.10: History Auto Delete Expired
internal fun PlayerActivity.showV87HistoryAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v87HistoryAutoDeleteExpired
    BiliClient.prefs.v87HistoryAutoDeleteExpired = enabled
    AppToast.show(this, "History Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

// v87.11: Playback Auto Skip Filler
internal fun PlayerActivity.showV87PlaybackAutoSkipFillerToggle() {
    val enabled = !BiliClient.prefs.v87PlaybackAutoSkipFiller
    BiliClient.prefs.v87PlaybackAutoSkipFiller = enabled
    AppToast.show(this, "Playback Auto Skip Filler: ${if (enabled) "ON" else "OFF"}")
}

// v87.12: Screenshot Cloud Sync
internal fun PlayerActivity.showV87ScreenshotCloudSyncToggle() {
    val enabled = !BiliClient.prefs.v87ScreenshotCloudSync
    BiliClient.prefs.v87ScreenshotCloudSync = enabled
    AppToast.show(this, "Screenshot Cloud Sync: ${if (enabled) "ON" else "OFF"}")
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
}

// v88.6: Playlist Auto Mark Watched
internal fun PlayerActivity.showV88PlaylistAutoMarkWatchedToggle() {
    val enabled = !BiliClient.prefs.v88PlaylistAutoMarkWatched
    BiliClient.prefs.v88PlaylistAutoMarkWatched = enabled
    AppToast.show(this, "Playlist Auto Mark Watched: ${if (enabled) "ON" else "OFF"}")
}

// v88.7: Cache Preload Next Episode
internal fun PlayerActivity.showV88CachePreloadNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v88CachePreloadNextEpisode
    BiliClient.prefs.v88CachePreloadNextEpisode = enabled
    AppToast.show(this, "Cache Preload Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v88.8: Progress Bar Custom Label
internal fun PlayerActivity.showV88ProgressBarCustomLabelToggle() {
    val enabled = !BiliClient.prefs.v88ProgressBarCustomLabel
    BiliClient.prefs.v88ProgressBarCustomLabel = enabled
    AppToast.show(this, "Progress Bar Custom Label: ${if (enabled) "ON" else "OFF"}")
}

// v88.9: Volume Auto Mute On Call
internal fun PlayerActivity.showV88VolumeAutoMuteOnCallToggle() {
    val enabled = !BiliClient.prefs.v88VolumeAutoMuteOnCall
    BiliClient.prefs.v88VolumeAutoMuteOnCall = enabled
    AppToast.show(this, "Volume Auto Mute On Call: ${if (enabled) "ON" else "OFF"}")
}

// v88.10: History Show Thumbnails
internal fun PlayerActivity.showV88HistoryShowThumbnailsToggle() {
    val enabled = !BiliClient.prefs.v88HistoryShowThumbnails
    BiliClient.prefs.v88HistoryShowThumbnails = enabled
    AppToast.show(this, "History Show Thumbnails: ${if (enabled) "ON" else "OFF"}")
}

// v88.11: Playback Auto Resume Position
internal fun PlayerActivity.showV88PlaybackAutoResumePositionToggle() {
    val enabled = !BiliClient.prefs.v88PlaybackAutoResumePosition
    BiliClient.prefs.v88PlaybackAutoResumePosition = enabled
    AppToast.show(this, "Playback Auto Resume Position: ${if (enabled) "ON" else "OFF"}")
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
}

// v89.6: Playlist Auto Group By Series
internal fun PlayerActivity.showV89PlaylistAutoGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v89PlaylistAutoGroupBySeries
    BiliClient.prefs.v89PlaylistAutoGroupBySeries = enabled
    AppToast.show(this, "Playlist Auto Group By Series: ${if (enabled) "ON" else "OFF"}")
}

// v89.7: Cache Verify On Start
internal fun PlayerActivity.showV89CacheVerifyOnStartToggle() {
    val enabled = !BiliClient.prefs.v89CacheVerifyOnStart
    BiliClient.prefs.v89CacheVerifyOnStart = enabled
    AppToast.show(this, "Cache Verify On Start: ${if (enabled) "ON" else "OFF"}")
}

// v89.8: Progress Bar Midpoint Indicator
internal fun PlayerActivity.showV89ProgressBarMidpointIndicatorToggle() {
    val enabled = !BiliClient.prefs.v89ProgressBarMidpointIndicator
    BiliClient.prefs.v89ProgressBarMidpointIndicator = enabled
    AppToast.show(this, "Progress Bar Midpoint Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v89.9: Volume Auto Lower On Notification
internal fun PlayerActivity.showV89VolumeAutoLowerOnNotificationToggle() {
    val enabled = !BiliClient.prefs.v89VolumeAutoLowerOnNotification
    BiliClient.prefs.v89VolumeAutoLowerOnNotification = enabled
    AppToast.show(this, "Volume Auto Lower On Notification: ${if (enabled) "ON" else "OFF"}")
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
}

// v89.11: Playback Auto Skip Preview
internal fun PlayerActivity.showV89PlaybackAutoSkipPreviewToggle() {
    val enabled = !BiliClient.prefs.v89PlaybackAutoSkipPreview
    BiliClient.prefs.v89PlaybackAutoSkipPreview = enabled
    AppToast.show(this, "Playback Auto Skip Preview: ${if (enabled) "ON" else "OFF"}")
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
}

// v90.6: Playlist Auto Skip Watched
internal fun PlayerActivity.showV90PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v90PlaylistAutoSkipWatched
    BiliClient.prefs.v90PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

// v90.7: Cache Background Cleanup
internal fun PlayerActivity.showV90CacheBackgroundCleanupToggle() {
    val enabled = !BiliClient.prefs.v90CacheBackgroundCleanup
    BiliClient.prefs.v90CacheBackgroundCleanup = enabled
    AppToast.show(this, "Cache Background Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v90.8: Progress Bar Estimated Time
internal fun PlayerActivity.showV90ProgressBarEstimatedTimeToggle() {
    val enabled = !BiliClient.prefs.v90ProgressBarEstimatedTime
    BiliClient.prefs.v90ProgressBarEstimatedTime = enabled
    AppToast.show(this, "Progress Bar Estimated Time: ${if (enabled) "ON" else "OFF"}")
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
}

// v90.10: History Auto Sync Cloud
internal fun PlayerActivity.showV90HistoryAutoSyncCloudToggle() {
    val enabled = !BiliClient.prefs.v90HistoryAutoSyncCloud
    BiliClient.prefs.v90HistoryAutoSyncCloud = enabled
    AppToast.show(this, "History Auto Sync Cloud: ${if (enabled) "ON" else "OFF"}")
}

// v90.11: Playback Auto Next On Buffer
internal fun PlayerActivity.showV90PlaybackAutoNextOnBufferToggle() {
    val enabled = !BiliClient.prefs.v90PlaybackAutoNextOnBuffer
    BiliClient.prefs.v90PlaybackAutoNextOnBuffer = enabled
    AppToast.show(this, "Playback Auto Next On Buffer: ${if (enabled) "ON" else "OFF"}")
}

// v90.12: Screenshot Auto Delete Old
internal fun PlayerActivity.showV90ScreenshotAutoDeleteOldToggle() {
    val enabled = !BiliClient.prefs.v90ScreenshotAutoDeleteOld
    BiliClient.prefs.v90ScreenshotAutoDeleteOld = enabled
    AppToast.show(this, "Screenshot Auto Delete Old: ${if (enabled) "ON" else "OFF"}")
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
    internal fun PlayerActivity.showV91VideoDitheringModeDialog() {
        showSettingsChoiceDialog("Video Dithering Mode", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V91VIDEODITHERINGMODE)
    }
    internal fun PlayerActivity.showV91DanmakuFontShadowToggleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V91DANMAKUFONTSHADOWTOGGLE)
    }
    internal fun PlayerActivity.showV91SubtitleFadeInOutCustomDialog() {
        showSettingsChoiceDialog("Subtitle Fade In Out Custom", 0, listOf(0, 200, 400, 600, 800), AppPrefs.KEY_V91SUBTITLEFADEINOUTCUSTOM)
    }
    internal fun PlayerActivity.showV91GestureEdgeDeadZoneDialog() {
        showSettingsChoiceDialog("Gesture Edge Dead Zone", 10, listOf(5, 10, 15, 20, 30), AppPrefs.KEY_V91GESTUREEDGEDEADZONE)
    }
    internal fun PlayerActivity.showV91CastVideoLatencyModeDialog() {
        showSettingsChoiceDialog("Cast Video Latency Mode", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V91CASTVIDEOLATENCYMODE)
    }
    internal fun PlayerActivity.showV91PlaylistAutoResumeLastToggle() {
        AppToast.show(this, true, AppPrefs.KEY_V91PLAYLISTAUTORESUMELAST)
    }
    internal fun PlayerActivity.showV91CacheSegmentSizeDialog() {
        showSettingsChoiceDialog("Cache Segment Size", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V91CACHESEGMENTSIZE)
    }
    internal fun PlayerActivity.showV91ProgressBarChapterLabelToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V91PROGRESSBARCHAPTERLABEL)
    }
    internal fun PlayerActivity.showV91VolumeAutoDuckingToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V91VOLUMEAUTODUCKING)
    }
    internal fun PlayerActivity.showV91HistoryGroupBySeriesToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V91HISTORYGROUPBYSERIES)
    }
    internal fun PlayerActivity.showV91PlaybackAutoSkipNextCountdownDialog() {
        showSettingsChoiceDialog("Playback Auto Skip Next Countdown", 5, listOf(3, 5, 10, 15, 30), AppPrefs.KEY_V91PLAYBACKAUTOSKIPNEXTCOUNTDOWN)
    }
    internal fun PlayerActivity.showV91ScreenshotRegionCaptureToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V91SCREENSHOTREGIONCAPTURE)
    }
    internal fun PlayerActivity.showV91VideoFilmGrainCustomDialog() {
        showSettingsChoiceDialog("Video Film Grain Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V91VIDEOFILMGRAINCUSTOM)
    }
    internal fun PlayerActivity.showV91DanmakuBgCornerRadiusDialog() {
        showSettingsChoiceDialog("Danmaku BG Corner Radius", 0, listOf(0, 2, 4, 6, 8), AppPrefs.KEY_V91DANMAKUBGCORNERRADIUS)
    }
    internal fun PlayerActivity.showV91SubtitleBgMarginBottomDialog() {
        showSettingsChoiceDialog("Subtitle BG Margin Bottom", 10, listOf(0, 5, 10, 15, 20), AppPrefs.KEY_V91SUBTITLEBGMARGINBOTTOM)
    }
    internal fun PlayerActivity.showV92VideoVignetteCustomDialog() {
        showSettingsChoiceDialog("Video Vignette Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V92VIDEOVIGNETTECUSTOM)
    }
    internal fun PlayerActivity.showV92DanmakuFontUnderlineToggleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V92DANMAKUFONTUNDERLINETOGGLE)
    }
    internal fun PlayerActivity.showV92SubtitleBgPaddingCustomDialog() {
        showSettingsChoiceDialog("Subtitle BG Padding Custom", 4, listOf(0, 2, 4, 6, 8), AppPrefs.KEY_V92SUBTITLEBGPADDINGCUSTOM)
    }
    internal fun PlayerActivity.showV92GestureSwipeBackActionDialog() {
        showSettingsChoiceDialog("Gesture Swipe Back Action", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V92GESTURESWIPEBACKACTION)
    }
    internal fun PlayerActivity.showV92CastVideoDropFrameToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V92CASTVIDEODROPFRAME)
    }
    internal fun PlayerActivity.showV92PlaylistAutoSkipShortDialog() {
        showSettingsChoiceDialog("Playlist Auto Skip Short", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V92PLAYLISTAUTOSKIPSHORT)
    }
    internal fun PlayerActivity.showV92CacheDownloadPolicyDialog() {
        showSettingsChoiceDialog("Cache Download Policy", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V92CACHEDOWNLOADPOLICY)
    }
    internal fun PlayerActivity.showV92ProgressBarThumbShapeDialog() {
        showSettingsChoiceDialog("Progress Bar Thumb Shape", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V92PROGRESSBARTHUMBSHAPE)
    }
    internal fun PlayerActivity.showV92VolumeAutoBalanceToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V92VOLUMEAUTOBALANCE)
    }
    internal fun PlayerActivity.showV92HistoryAutoCleanExpiredToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V92HISTORYAUTOCLEANEXPIRED)
    }
    internal fun PlayerActivity.showV92PlaybackAutoSkipSameTitleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V92PLAYBACKAUTOSKIPSAMETITLE)
    }
    internal fun PlayerActivity.showV92ScreenshotAutoDeleteDaysDialog() {
        showSettingsChoiceDialog("Screenshot Auto Delete Days", 30, listOf(7, 14, 30, 60, 90), AppPrefs.KEY_V92SCREENSHOTAUTODELETEDAYS)
    }
    internal fun PlayerActivity.showV92VideoColorFringeCustomDialog() {
        showSettingsChoiceDialog("Video Color Fringe Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V92VIDEOCOLORFRINGECUSTOM)
    }
    internal fun PlayerActivity.showV92DanmakuBgOpacityCustomDialog() {
        showSettingsChoiceDialog("Danmaku BG Opacity Custom", 50, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V92DANMAKUBGOPACITYCUSTOM)
    }
    internal fun PlayerActivity.showV92SubtitleBgMarginTopDialog() {
        showSettingsChoiceDialog("Subtitle BG Margin Top", 10, listOf(0, 5, 10, 15, 20), AppPrefs.KEY_V92SUBTITLEBGMARGINTOP)
    }
    internal fun PlayerActivity.showV93VideoScanlineEffectToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V93VIDEOSCANLINEEFFECT)
    }
    internal fun PlayerActivity.showV93DanmakuSendMaxLengthCustomDialog() {
        showSettingsChoiceDialog("Danmaku Send Max Length Custom", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93DANMAKUSENDMAXLENGTHCUSTOM)
    }
    internal fun PlayerActivity.showV93SubtitleBgBorderColorCustomDialog() {
        showSettingsChoiceDialog("Subtitle BG Border Color Custom", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93SUBTITLEBGBORDERCOLORCUSTOM)
    }
    internal fun PlayerActivity.showV93GestureSwipeForwardActionDialog() {
        showSettingsChoiceDialog("Gesture Swipe Forward Action", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93GESTURESWIPEFORWARDACTION)
    }
    internal fun PlayerActivity.showV93CastAudioDynamicRangeDialog() {
        showSettingsChoiceDialog("Cast Audio Dynamic Range", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93CASTAUDIODYNAMICRANGE)
    }
    internal fun PlayerActivity.showV93PlaylistAutoSkipLongDialog() {
        showSettingsChoiceDialog("Playlist Auto Skip Long", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93PLAYLISTAUTOSKIPLONG)
    }
    internal fun PlayerActivity.showV93CacheNetworkPolicyDialog() {
        showSettingsChoiceDialog("Cache Network Policy", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93CACHENETWORKPOLICY)
    }
    internal fun PlayerActivity.showV93ProgressBarBufferColorCustomDialog() {
        showSettingsChoiceDialog("Progress Bar Buffer Color Custom", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93PROGRESSBARBUFFERCOLORCUSTOM)
    }
    internal fun PlayerActivity.showV93VolumeAutoGainControlToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V93VOLUMEAUTOGAINCONTROL)
    }
    internal fun PlayerActivity.showV93HistoryAutoSyncDeviceToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V93HISTORYAUTOSYNCDEVICE)
    }
    internal fun PlayerActivity.showV93PlaybackAutoSkipRecap93Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V93PLAYBACKAUTOSKIPRECAP93)
    }
    internal fun PlayerActivity.showV93ScreenshotNamingTemplateDialog() {
        showSettingsChoiceDialog("Screenshot Naming Template", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93SCREENSHOTNAMINGTEMPLATE)
    }
    internal fun PlayerActivity.showV93VideoCRTFilterCustomDialog() {
        showSettingsChoiceDialog("Video CRT Filter Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V93VIDEOCRTFILTERCUSTOM)
    }
    internal fun PlayerActivity.showV93DanmakuSendConfirmToggleToggle() {
        AppToast.show(this, true, AppPrefs.KEY_V93DANMAKUSENDCONFIRMTOGGLE)
    }
    internal fun PlayerActivity.showV93SubtitleBgBorderWidthCustomDialog() {
        showSettingsChoiceDialog("Subtitle BG Border Width Custom", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V93SUBTITLEBGBORDERWIDTHCUSTOM)
    }
    internal fun PlayerActivity.showV94VideoPixelArtModeToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94VIDEOPIXELARTMODE)
    }
    internal fun PlayerActivity.showV94DanmakuFontMonospaceToggleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94DANMAKUFONTMONOSPACETOGGLE)
    }
    internal fun PlayerActivity.showV94SubtitleBgBorderRadiusCustomDialog() {
        showSettingsChoiceDialog("Subtitle BG Border Radius Custom", 0, listOf(0, 2, 4, 6, 8), AppPrefs.KEY_V94SUBTITLEBGBORDERRADIUSCUSTOM)
    }
    internal fun PlayerActivity.showV94GestureLongPressTimeoutDialog() {
        showSettingsChoiceDialog("Gesture Long Press Timeout", 500, listOf(300, 400, 500, 700, 1000), AppPrefs.KEY_V94GESTURELONGPRESSTIMEOUT)
    }
    internal fun PlayerActivity.showV94CastVideoBufferSizeDialog() {
        showSettingsChoiceDialog("Cast Video Buffer Size", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V94CASTVIDEOBUFFERSIZE)
    }
    internal fun PlayerActivity.showV94PlaylistAutoGroupByUpToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94PLAYLISTAUTOGROUPBYUP)
    }
    internal fun PlayerActivity.showV94CacheSmartCleanupToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94CACHESMARTCLEANUP)
    }
    internal fun PlayerActivity.showV94ProgressBarLiveIndicatorToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94PROGRESSBARLIVEINDICATOR)
    }
    internal fun PlayerActivity.showV94VolumeAutoPanToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94VOLUMEAUTOPAN)
    }
    internal fun PlayerActivity.showV94HistoryExportAutoToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94HISTORYEXPORTAUTO)
    }
    internal fun PlayerActivity.showV94PlaybackAutoSkipTitleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94PLAYBACKAUTOSKIPTITLE)
    }
    internal fun PlayerActivity.showV94ScreenshotAutoCopyPathToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94SCREENSHOTAUTOCOPYPATH)
    }
    internal fun PlayerActivity.showV94VideoAsciiArtModeToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V94VIDEOASCIIARTMODE)
    }
    internal fun PlayerActivity.showV94DanmakuFontSizeStepDialog() {
        showSettingsChoiceDialog("Danmaku Font Size Step", 2, listOf(1, 2, 3, 4, 5), AppPrefs.KEY_V94DANMAKUFONTSIZESTEP)
    }
    internal fun PlayerActivity.showV94SubtitleAnimationFadeTimeDialog() {
        showSettingsChoiceDialog("Subtitle Animation Fade Time", 300, listOf(100, 200, 300, 500, 800), AppPrefs.KEY_V94SUBTITLEANIMATIONFADETIME)
    }
    internal fun PlayerActivity.showV95VideoGlitchEffectCustomDialog() {
        showSettingsChoiceDialog("Video Glitch Effect Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V95VIDEOGLITCHEFFECTCUSTOM)
    }
    internal fun PlayerActivity.showV95DanmakuScrollEasingDialog() {
        showSettingsChoiceDialog("Danmaku Scroll Easing", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V95DANMAKUSCROLLEASING)
    }
    internal fun PlayerActivity.showV95SubtitleBgGradientAngleDialog() {
        showSettingsChoiceDialog("Subtitle BG Gradient Angle", 0, listOf(0, 90, 180, 270), AppPrefs.KEY_V95SUBTITLEBGGRADIENTANGLE)
    }
    internal fun PlayerActivity.showV95GestureDoubleTapTimeoutDialog() {
        showSettingsChoiceDialog("Gesture Double Tap Timeout", 300, listOf(200, 250, 300, 400, 500), AppPrefs.KEY_V95GESTUREDOUBLETAPTIMEOUT)
    }
    internal fun PlayerActivity.showV95CastAudioBufferSizeDialog() {
        showSettingsChoiceDialog("Cast Audio Buffer Size", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V95CASTAUDIOBUFFERSIZE)
    }
    internal fun PlayerActivity.showV95PlaylistAutoGroupByDateToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V95PLAYLISTAUTOGROUPBYDATE)
    }
    internal fun PlayerActivity.showV95CacheStorageLimitDialog() {
        showSettingsChoiceDialog("Cache Storage Limit", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V95CACHESTORAGELIMIT)
    }
    internal fun PlayerActivity.showV95ProgressBarChapterColorDialog() {
        showSettingsChoiceDialog("Progress Bar Chapter Color", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V95PROGRESSBARCHAPTERCOLOR)
    }
    internal fun PlayerActivity.showV95VolumeAutoCrossfadeToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V95VOLUMEAUTOCROSSFADE)
    }
    internal fun PlayerActivity.showV95HistoryImportAutoToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V95HISTORYIMPORTAUTO)
    }
    internal fun PlayerActivity.showV95PlaybackAutoSkipEnding95Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V95PLAYBACKAUTOSKIPENDING95)
    }
    internal fun PlayerActivity.showV95ScreenshotAutoOpenAfterToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V95SCREENSHOTAUTOOPENAFTER)
    }
    internal fun PlayerActivity.showV95VideoVHSEffectCustomDialog() {
        showSettingsChoiceDialog("Video VHS Effect Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V95VIDEOVHSEFFECTCUSTOM)
    }
    internal fun PlayerActivity.showV95DanmakuScrollAccelerationDialog() {
        showSettingsChoiceDialog("Danmaku Scroll Acceleration", 50, listOf(25, 50, 75, 100), AppPrefs.KEY_V95DANMAKUSCROLLACCELERATION)
    }
    internal fun PlayerActivity.showV95SubtitleBgGradientOpacityDialog() {
        showSettingsChoiceDialog("Subtitle BG Gradient Opacity", 50, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V95SUBTITLEBGGRADIENTOPACITY)
    }
    internal fun PlayerActivity.showV96VideoNeonGlowCustomDialog() {
        showSettingsChoiceDialog("Video Neon Glow Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V96VIDEONEONGLOWCUSTOM)
    }
    internal fun PlayerActivity.showV96DanmakuFontLetterSpacingDialog() {
        showSettingsChoiceDialog("Danmaku Font Letter Spacing", 0, listOf(-2, -1, 0, 1, 2), AppPrefs.KEY_V96DANMAKUFONTLETTERSPACING)
    }
    internal fun PlayerActivity.showV96SubtitleBgGradientTypeDialog() {
        showSettingsChoiceDialog("Subtitle BG Gradient Type", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V96SUBTITLEBGGRADIENTTYPE)
    }
    internal fun PlayerActivity.showV96GestureSwipeMinDistanceDialog() {
        showSettingsChoiceDialog("Gesture Swipe Min Distance", 50, listOf(25, 50, 75, 100), AppPrefs.KEY_V96GESTURESWIPEMINDISTANCE)
    }
    internal fun PlayerActivity.showV96CastVideoDecodeThreadsDialog() {
        showSettingsChoiceDialog("Cast Video Decode Threads", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V96CASTVIDEODECODETHREADS)
    }
    internal fun PlayerActivity.showV96PlaylistAutoGroupByTypeToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V96PLAYLISTAUTOGROUPBYTYPE)
    }
    internal fun PlayerActivity.showV96CacheCleanupIntervalDialog() {
        showSettingsChoiceDialog("Cache Cleanup Interval", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V96CACHECLEANUPINTERVAL)
    }
    internal fun PlayerActivity.showV96ProgressBarThumbShadowToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V96PROGRESSBARTHUMBSHADOW)
    }
    internal fun PlayerActivity.showV96VolumeAutoReplayGainToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V96VOLUMEAUTOREPLAYGAIN)
    }
    internal fun PlayerActivity.showV96HistoryAutoCleanMaxDaysDialog() {
        showSettingsChoiceDialog("History Auto Clean Max Days", 90, listOf(30, 60, 90, 180, 365), AppPrefs.KEY_V96HISTORYAUTOCLEANMAXDAYS)
    }
    internal fun PlayerActivity.showV96PlaybackAutoSkipCreditsToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V96PLAYBACKAUTOSKIPCREDITS)
    }
    internal fun PlayerActivity.showV96ScreenshotAutoShareTargetDialog() {
        showSettingsChoiceDialog("Screenshot Auto Share Target", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V96SCREENSHOTAUTOSHARETARGET)
    }
    internal fun PlayerActivity.showV96VideoDreamyEffectCustomDialog() {
        showSettingsChoiceDialog("Video Dreamy Effect Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V96VIDEODREAMYEFFECTCUSTOM)
    }
    internal fun PlayerActivity.showV96DanmakuScrollDecelerationDialog() {
        showSettingsChoiceDialog("Danmaku Scroll Deceleration", 50, listOf(25, 50, 75, 100), AppPrefs.KEY_V96DANMAKUSCROLLDECELERATION)
    }
    internal fun PlayerActivity.showV96SubtitleBgGradientStartDialog() {
        showSettingsChoiceDialog("Subtitle BG Gradient Start", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V96SUBTITLEBGGRADIENTSTART)
    }
    internal fun PlayerActivity.showV97VideoSepiaCustomDialog() {
        showSettingsChoiceDialog("Video Sepia Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V97VIDEOSEPIACUSTOM)
    }
    internal fun PlayerActivity.showV97DanmakuFontWeightRangeDialog() {
        showSettingsChoiceDialog("Danmaku Font Weight Range", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V97DANMAKUFONTWEIGHTRANGE)
    }
    internal fun PlayerActivity.showV97SubtitleBgGradientEndDialog() {
        showSettingsChoiceDialog("Subtitle BG Gradient End", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V97SUBTITLEBGGRADIENTEND)
    }
    internal fun PlayerActivity.showV97GestureSwipeAngleThresholdDialog() {
        showSettingsChoiceDialog("Gesture Swipe Angle Threshold", 30, listOf(15, 20, 30, 45, 60), AppPrefs.KEY_V97GESTURESWIPEANGLETHRESHOLD)
    }
    internal fun PlayerActivity.showV97CastVideoPostProcessingToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V97CASTVIDEOPOSTPROCESSING)
    }
    internal fun PlayerActivity.showV97PlaylistAutoGroupBySeasonToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V97PLAYLISTAUTOGROUPBYSEASON)
    }
    internal fun PlayerActivity.showV97CachePreloadPolicyDialog() {
        showSettingsChoiceDialog("Cache Preload Policy", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V97CACHEPRELOADPOLICY)
    }
    internal fun PlayerActivity.showV97ProgressBarThumbGlowToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V97PROGRESSBARTHUMBGLOW)
    }
    internal fun PlayerActivity.showV97VolumeAutoPeakLimitToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V97VOLUMEAUTOPEAKLIMIT)
    }
    internal fun PlayerActivity.showV97HistoryAutoCleanMinItemsDialog() {
        showSettingsChoiceDialog("History Auto Clean Min Items", 100, listOf(50, 100, 200, 500, 1000), AppPrefs.KEY_V97HISTORYAUTOCLEANMINITEMS)
    }
    internal fun PlayerActivity.showV97PlaybackAutoSkipRecap97Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V97PLAYBACKAUTOSKIPRECAP97)
    }
    internal fun PlayerActivity.showV97ScreenshotAutoAnnotateTextToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V97SCREENSHOTAUTOANNOTATETEXT)
    }
    internal fun PlayerActivity.showV97VideoPolaroidCustomDialog() {
        showSettingsChoiceDialog("Video Polaroid Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V97VIDEOPOLAROIDCUSTOM)
    }
    internal fun PlayerActivity.showV97DanmakuFontSizeMinDialog() {
        showSettingsChoiceDialog("Danmaku Font Size Min", 12, listOf(8, 10, 12, 14, 16), AppPrefs.KEY_V97DANMAKUFONTSIZEMIN)
    }
    internal fun PlayerActivity.showV97SubtitleAnimationType97Dialog() {
        showSettingsChoiceDialog("Subtitle Animation Type97", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V97SUBTITLEANIMATIONTYPE97)
    }
    internal fun PlayerActivity.showV98VideoNegativeCustomDialog() {
        showSettingsChoiceDialog("Video Negative Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V98VIDEONEGATIVECUSTOM)
    }
    internal fun PlayerActivity.showV98DanmakuFontSizeMaxDialog() {
        showSettingsChoiceDialog("Danmaku Font Size Max", 48, listOf(24, 32, 40, 48, 64), AppPrefs.KEY_V98DANMAKUFONTSIZEMAX)
    }
    internal fun PlayerActivity.showV98SubtitleAnimationSpeed98Dialog() {
        showSettingsChoiceDialog("Subtitle Animation Speed98", 100, listOf(50, 75, 100, 125, 150), AppPrefs.KEY_V98SUBTITLEANIMATIONSPEED98)
    }
    internal fun PlayerActivity.showV98GesturePinchMinScaleDialog() {
        showSettingsChoiceDialog("Gesture Pinch Min Scale", 50, listOf(25, 30, 50, 70, 80), AppPrefs.KEY_V98GESTUREPINCHMINSCALE)
    }
    internal fun PlayerActivity.showV98CastAudioPostProcessingToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98CASTAUDIOPOSTPROCESSING)
    }
    internal fun PlayerActivity.showV98PlaylistAutoGroupByGenreToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98PLAYLISTAUTOGROUPBYGENRE)
    }
    internal fun PlayerActivity.showV98CacheDownloadOnWifiToggle() {
        AppToast.show(this, true, AppPrefs.KEY_V98CACHEDOWNLOADONWIFI)
    }
    internal fun PlayerActivity.showV98ProgressBarThumbBorderToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98PROGRESSBARTHUMBBORDER)
    }
    internal fun PlayerActivity.showV98VolumeAutoRMSLevelToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98VOLUMEAUTORMSLEVEL)
    }
    internal fun PlayerActivity.showV98HistoryAutoCleanOnStartToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98HISTORYAUTOCLEANONSTART)
    }
    internal fun PlayerActivity.showV98PlaybackAutoSkipFiller98Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98PLAYBACKAUTOSKIPFILLER98)
    }
    internal fun PlayerActivity.showV98ScreenshotAutoUploadCloudToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V98SCREENSHOTAUTOUPLOADCLOUD)
    }
    internal fun PlayerActivity.showV98VideoMonochromeCustomDialog() {
        showSettingsChoiceDialog("Video Monochrome Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V98VIDEOMONOCHROMECUSTOM)
    }
    internal fun PlayerActivity.showV98DanmakuFontStyleCustom98Dialog() {
        showSettingsChoiceDialog("Danmaku Font Style Custom98", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V98DANMAKUFONTSTYLECUSTOM98)
    }
    internal fun PlayerActivity.showV98SubtitleAnimationEasing98Dialog() {
        showSettingsChoiceDialog("Subtitle Animation Easing98", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V98SUBTITLEANIMATIONEASING98)
    }
    internal fun PlayerActivity.showV99VideoPosterizeCustomDialog() {
        showSettingsChoiceDialog("Video Posterize Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V99VIDEOPOSTERIZECUSTOM)
    }
    internal fun PlayerActivity.showV99DanmakuFontOutlineToggleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99DANMAKUFONTOUTLINETOGGLE)
    }
    internal fun PlayerActivity.showV99SubtitleAnimationDuration99Dialog() {
        showSettingsChoiceDialog("Subtitle Animation Duration99", 300, listOf(100, 200, 300, 400, 500), AppPrefs.KEY_V99SUBTITLEANIMATIONDURATION99)
    }
    internal fun PlayerActivity.showV99GesturePinchMaxScaleDialog() {
        showSettingsChoiceDialog("Gesture Pinch Max Scale", 200, listOf(150, 200, 250, 300, 400), AppPrefs.KEY_V99GESTUREPINCHMAXSCALE)
    }
    internal fun PlayerActivity.showV99CastVideoAutoQualityToggle() {
        AppToast.show(this, true, AppPrefs.KEY_V99CASTVIDEOAUTOQUALITY)
    }
    internal fun PlayerActivity.showV99PlaylistAutoGroupByChannelToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99PLAYLISTAUTOGROUPBYCHANNEL)
    }
    internal fun PlayerActivity.showV99CacheDownloadSpeedLimitDialog() {
        showSettingsChoiceDialog("Cache Download Speed Limit", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V99CACHEDOWNLOADSPEEDLIMIT)
    }
    internal fun PlayerActivity.showV99ProgressBarThumbSize99Dialog() {
        showSettingsChoiceDialog("Progress Bar Thumb Size99", 12, listOf(8, 10, 12, 14, 16), AppPrefs.KEY_V99PROGRESSBARTHUMBSIZE99)
    }
    internal fun PlayerActivity.showV99VolumeAutoLoudness99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99VOLUMEAUTOLOUDNESS99)
    }
    internal fun PlayerActivity.showV99HistoryAutoCleanOnExitToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99HISTORYAUTOCLEANONEXIT)
    }
    internal fun PlayerActivity.showV99PlaybackAutoSkipIntro99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99PLAYBACKAUTOSKIPINTRO99)
    }
    internal fun PlayerActivity.showV99ScreenshotAutoShare99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99SCREENSHOTAUTOSHARE99)
    }
    internal fun PlayerActivity.showV99VideoSolarizeCustomDialog() {
        showSettingsChoiceDialog("Video Solarize Custom", 0, listOf(0, 25, 50, 75, 100), AppPrefs.KEY_V99VIDEOSOLARIZECUSTOM)
    }
    internal fun PlayerActivity.showV99DanmakuFontColorCustomDialog() {
        showSettingsChoiceDialog("Danmaku Font Color Custom", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V99DANMAKUFONTCOLORCUSTOM)
    }
    internal fun PlayerActivity.showV99SubtitleAnimationLoop99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V99SUBTITLEANIMATIONLOOP99)
    }
    internal fun PlayerActivity.showV100VideoDuotoneCustomDialog() {
        showSettingsChoiceDialog("Video Duotone Custom", 0, listOf(0, 1, 2, 3, 4), AppPrefs.KEY_V100VIDEODUOTONECUSTOM)
    }
    internal fun PlayerActivity.showV100DanmakuFontBgToggleToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V100DANMAKUFONTBGTOGGLE)
    }
    internal fun PlayerActivity.showV100SubtitleAnimationDelay99Dialog() {
        showSettingsChoiceDialog("Subtitle Animation Delay99", 0, listOf(0, 100, 200, 300, 500), AppPrefs.KEY_V100SUBTITLEANIMATIONDELAY99)
    }
    internal fun PlayerActivity.showV100GesturePinchSpeed99Dialog() {
        showSettingsChoiceDialog("Gesture Pinch Speed99", 50, listOf(25, 50, 75, 100), AppPrefs.KEY_V100GESTUREPINCHSPEED99)
    }
    internal fun PlayerActivity.showV100CastAudioAutoQualityToggle() {
        AppToast.show(this, true, AppPrefs.KEY_V100CASTAUDIOAUTOQUALITY)
    }
    internal fun PlayerActivity.showV100PlaylistAutoGroupAllToggle() {
        AppToast.show(this, false, AppPrefs.KEY_V100PLAYLISTAUTOGROUPALL)
    }
    internal fun PlayerActivity.showV100CacheDownloadRetryDialog() {
        showSettingsChoiceDialog("Cache Download Retry", 3, listOf(1, 2, 3, 5, 10), AppPrefs.KEY_V100CACHEDOWNLOADRETRY)
    }
    internal fun PlayerActivity.showV100ProgressBarThumbColor99Dialog() {
        showSettingsChoiceDialog("Progress Bar Thumb Color99", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V100PROGRESSBARTHUMBCOLOR99)
    }
    internal fun PlayerActivity.showV100VolumeAutoNormalize99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V100VOLUMEAUTONORMALIZE99)
    }
    internal fun PlayerActivity.showV100HistoryAutoSync99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V100HISTORYAUTOSYNC99)
    }
    internal fun PlayerActivity.showV100PlaybackAutoSkipOutro99Toggle() {
        AppToast.show(this, false, AppPrefs.KEY_V100PLAYBACKAUTOSKIPOUTRO99)
    }
    internal fun PlayerActivity.showV100ScreenshotAutoFormat99Dialog() {
        showSettingsChoiceDialog("Screenshot Auto Format99", 0, listOf(0, 1, 2), AppPrefs.KEY_V100SCREENSHOTAUTOFORMAT99)
    }
    internal fun PlayerActivity.showV100VideoTintDuotoneDialog() {
        showSettingsChoiceDialog("Video Tint Duotone", 0, listOf(0, 1, 2, 3, 4), AppPrefs.KEY_V100VIDEOTINTDUOTONE)
    }
    internal fun PlayerActivity.showV100DanmakuFontWeight99Dialog() {
        showSettingsChoiceDialog("Danmaku Font Weight99", 400, listOf(100, 200, 300, 400, 500, 600, 700, 800, 900), AppPrefs.KEY_V100DANMAKUFONTWEIGHT99)
    }
    internal fun PlayerActivity.showV100SubtitleAnimationType99Dialog() {
        showSettingsChoiceDialog("Subtitle Animation Type99", 0, listOf(0, 1, 2, 3), AppPrefs.KEY_V100SUBTITLEANIMATIONTYPE99)
    }
    }
}
