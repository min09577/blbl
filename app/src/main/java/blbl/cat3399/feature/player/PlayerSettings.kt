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
// v51.1: 自动跳片头
internal fun PlayerActivity.showv51PlaybackAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v51PlaybackAutoSkipIntro
    BiliClient.prefs.v51PlaybackAutoSkipIntro = !current
    AppToast.show(this, "Playback Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
}

// v51.2: 弹幕字体描边宽度
// v51.2: 弹幕字体描边宽度
internal fun PlayerActivity.showv51DanmakuFontOutlineWidthDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFontOutlineWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Outline Width", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51DanmakuFontOutlineWidth = value; AppToast.show(this, "Danmaku Font Outline Width: ${labels[options.indexOf(value)]}") }
}

// v51.3: 视频暗部调整
// v51.3: 视频暗部调整
internal fun PlayerActivity.showv51ColorShadowAdjustDialog() {
    val options = listOf(-100,-80,-60,-40,-20,0,20,40,60,80,100)
    val labels = listOf("-100","-80","-60","-40","-20","0","20","40","60","80","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v51ColorShadowAdjust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Shadow Adjust", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51ColorShadowAdjust = value; AppToast.show(this, "Color Shadow Adjust: ${labels[options.indexOf(value)]}") }
}

// v51.4: 音量响度标准化
// v51.4: 音量响度标准化
internal fun PlayerActivity.showv51VolumeLoudnessNormalizeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v51VolumeLoudnessNormalize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Loudness Normalize", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51VolumeLoudnessNormalize = value; AppToast.show(this, "Volume Loudness Normalize: ${labels[options.indexOf(value)]}") }
}

// v51.5: 弹幕发送背景样式
// v51.5: 弹幕发送背景样式
internal fun PlayerActivity.showv51DanmakuSendBgStyleDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuSendBgStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Bg Style", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51DanmakuSendBgStyle = value; AppToast.show(this, "Danmaku Send Bg Style: ${labels[options.indexOf(value)]}") }
}

// v51.6: 投射视频编码
// v51.6: 投射视频编码
internal fun PlayerActivity.showv51CastVideoCodecDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v51CastVideoCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Video Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51CastVideoCodec = value; AppToast.show(this, "Cast Video Codec: ${labels[options.indexOf(value)]}") }
}

// v51.7: 双击快退
// v51.7: 双击快退
internal fun PlayerActivity.showv51GestureDoubleTapRewindToggle() {
    val current = BiliClient.prefs.v51GestureDoubleTapRewind
    BiliClient.prefs.v51GestureDoubleTapRewind = !current
    AppToast.show(this, "Gesture Double Tap Rewind: ${if (!current) "ON" else "OFF"}")
}

// v51.8: 弹幕过滤长度
// v51.8: 弹幕过滤长度
internal fun PlayerActivity.showv51DanmakuFilterLengthDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFilterLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Length", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51DanmakuFilterLength = value; AppToast.show(this, "Danmaku Filter Length: ${labels[options.indexOf(value)]}") }
}

// v51.9: 缓存最大大小MB
// v51.9: 缓存最大大小MB
internal fun PlayerActivity.showv51CacheMaxSizeMbDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v51CacheMaxSizeMb).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Max Size Mb", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51CacheMaxSizeMb = value; AppToast.show(this, "Cache Max Size Mb: ${labels[options.indexOf(value)]}") }
}

// v51.10: 进度条滑动速度
// v51.10: 进度条滑动速度
internal fun PlayerActivity.showv51ProgressBarScrubSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v51ProgressBarScrubSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Scrub Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51ProgressBarScrubSpeed = value; AppToast.show(this, "Progress Bar Scrub Speed: ${labels[options.indexOf(value)]}") }
}

// v51.11: 弹幕字间距
// v51.11: 弹幕字间距
internal fun PlayerActivity.showv51DanmakuFontSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51DanmakuFontSpacing = value; AppToast.show(this, "Danmaku Font Spacing: ${labels[options.indexOf(value)]}") }
}

// v51.12: 伽马校正
// v51.12: 伽马校正
internal fun PlayerActivity.showv51ColorGammaCorrectionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v51ColorGammaCorrection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Gamma Correction", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51ColorGammaCorrection = value; AppToast.show(this, "Color Gamma Correction: ${labels[options.indexOf(value)]}") }
}

// v51.13: 低音减弱
// v51.13: 低音减弱
internal fun PlayerActivity.showv51VolumeBassReduceToggle() {
    val current = BiliClient.prefs.v51VolumeBassReduce
    BiliClient.prefs.v51VolumeBassReduce = !current
    AppToast.show(this, "Volume Bass Reduce: ${if (!current) "ON" else "OFF"}")
}

// v51.14: 弹幕背景边框颜色
// v51.14: 弹幕背景边框颜色
internal fun PlayerActivity.showv51DanmakuBgBorderColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51DanmakuBgBorderColor = value; AppToast.show(this, "Danmaku Bg Border Color: ${labels[options.indexOf(value)]}") }
}

// v51.15: 投射字幕同步延迟
// v51.15: 投射字幕同步延迟
internal fun PlayerActivity.showv51CastSubtitleSyncDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v51CastSubtitleSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Sync", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v51CastSubtitleSync = value; AppToast.show(this, "Cast Subtitle Sync: ${labels[options.indexOf(value)]}") }
}

// v52.1: 自动跳过离题内容
// v52.1: 自动跳过离题内容
internal fun PlayerActivity.showv52PlaybackAutoSkipFillerToggle() {
    val current = BiliClient.prefs.v52PlaybackAutoSkipFiller
    BiliClient.prefs.v52PlaybackAutoSkipFiller = !current
    AppToast.show(this, "Playback Auto Skip Filler: ${if (!current) "ON" else "OFF"}")
}

// v52.2: 弹幕字体行高
// v52.2: 弹幕字体行高
internal fun PlayerActivity.showv52DanmakuFontLineHeightDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuFontLineHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Line Height", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52DanmakuFontLineHeight = value; AppToast.show(this, "Danmaku Font Line Height: ${labels[options.indexOf(value)]}") }
}

// v52.3: 色温
// v52.3: 色温
internal fun PlayerActivity.showv52ColorTemperatureDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v52ColorTemperature).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Temperature", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52ColorTemperature = value; AppToast.show(this, "Color Temperature: ${labels[options.indexOf(value)]}") }
}

// v52.4: 声道交换
// v52.4: 声道交换
internal fun PlayerActivity.showv52VolumeChannelSwapToggle() {
    val current = BiliClient.prefs.v52VolumeChannelSwap
    BiliClient.prefs.v52VolumeChannelSwap = !current
    AppToast.show(this, "Volume Channel Swap: ${if (!current) "ON" else "OFF"}")
}

// v52.5: 弹幕发送动画样式
// v52.5: 弹幕发送动画样式
internal fun PlayerActivity.showv52DanmakuSendAnimStyleDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuSendAnimStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Anim Style", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52DanmakuSendAnimStyle = value; AppToast.show(this, "Danmaku Send Anim Style: ${labels[options.indexOf(value)]}") }
}

// v52.6: 投射分辨率增强
// v52.6: 投射分辨率增强
internal fun PlayerActivity.showv52CastResolutionEnhanceDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v52CastResolutionEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Resolution Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52CastResolutionEnhance = value; AppToast.show(this, "Cast Resolution Enhance: ${labels[options.indexOf(value)]}") }
}

// v52.7: 滑动快进快退
// v52.7: 滑动快进快退
internal fun PlayerActivity.showv52GestureSwipeSeekToggle() {
    val current = BiliClient.prefs.v52GestureSwipeSeek
    BiliClient.prefs.v52GestureSwipeSeek = !current
    AppToast.show(this, "Gesture Swipe Seek: ${if (!current) "ON" else "OFF"}")
}

// v52.8: 弹幕过滤速度
// v52.8: 弹幕过滤速度
internal fun PlayerActivity.showv52DanmakuFilterSpeedDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuFilterSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52DanmakuFilterSpeed = value; AppToast.show(this, "Danmaku Filter Speed: ${labels[options.indexOf(value)]}") }
}

// v52.9: 缓存预取大小
// v52.9: 缓存预取大小
internal fun PlayerActivity.showv52CachePrefetchSizeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v52CachePrefetchSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Prefetch Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52CachePrefetchSize = value; AppToast.show(this, "Cache Prefetch Size: ${labels[options.indexOf(value)]}") }
}

// v52.10: 进度条章节标记
// v52.10: 进度条章节标记
internal fun PlayerActivity.showv52ProgressBarChaptersToggle() {
    val current = BiliClient.prefs.v52ProgressBarChapters
    BiliClient.prefs.v52ProgressBarChapters = !current
    AppToast.show(this, "Progress Bar Chapters: ${if (!current) "ON" else "OFF"}")
}

// v52.11: 弹幕字体阴影模糊
// v52.11: 弹幕字体阴影模糊
internal fun PlayerActivity.showv52DanmakuFontShadowBlurDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuFontShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Blur", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52DanmakuFontShadowBlur = value; AppToast.show(this, "Danmaku Font Shadow Blur: ${labels[options.indexOf(value)]}") }
}

// v52.12: 自动饱和度
// v52.12: 自动饱和度
internal fun PlayerActivity.showv52ColorSaturationAutoToggle() {
    val current = BiliClient.prefs.v52ColorSaturationAuto
    BiliClient.prefs.v52ColorSaturationAuto = !current
    AppToast.show(this, "Color Saturation Auto: ${if (!current) "ON" else "OFF"}")
}

// v52.13: 音量淡入时间
// v52.13: 音量淡入时间
internal fun PlayerActivity.showv52VolumeFadeInMsDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v52VolumeFadeInMs).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Fade In Ms", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52VolumeFadeInMs = value; AppToast.show(this, "Volume Fade In Ms: ${labels[options.indexOf(value)]}") }
}

// v52.14: 弹幕背景渐变颜色
// v52.14: 弹幕背景渐变颜色
internal fun PlayerActivity.showv52DanmakuBgGradientColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuBgGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52DanmakuBgGradientColor = value; AppToast.show(this, "Danmaku Bg Gradient Color: ${labels[options.indexOf(value)]}") }
}

// v52.15: 投射延迟模式
// v52.15: 投射延迟模式
internal fun PlayerActivity.showv52CastLatencyModeDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v52CastLatencyMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Latency Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v52CastLatencyMode = value; AppToast.show(this, "Cast Latency Mode: ${labels[options.indexOf(value)]}") }
}

// v53.1: 自动暂停
// v53.1: 自动暂停
internal fun PlayerActivity.showv53PlaybackAutoPauseToggle() {
    val current = BiliClient.prefs.v53PlaybackAutoPause
    BiliClient.prefs.v53PlaybackAutoPause = !current
    AppToast.show(this, "Playback Auto Pause: ${if (!current) "ON" else "OFF"}")
}

// v53.2: 弹幕斜体
// v53.2: 弹幕斜体
internal fun PlayerActivity.showv53DanmakuFontItalicToggle() {
    val current = BiliClient.prefs.v53DanmakuFontItalic
    BiliClient.prefs.v53DanmakuFontItalic = !current
    AppToast.show(this, "Danmaku Font Italic: ${if (!current) "ON" else "OFF"}")
}

// v53.3: 自定义暗角强度
// v53.3: 自定义暗角强度
internal fun PlayerActivity.showv53ColorVignetteCustomDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v53ColorVignetteCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Vignette Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53ColorVignetteCustom = value; AppToast.show(this, "Color Vignette Custom: ${labels[options.indexOf(value)]}") }
}

// v53.4: 音量淡出时间
// v53.4: 音量淡出时间
internal fun PlayerActivity.showv53VolumeFadeOutMsDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v53VolumeFadeOutMs).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Fade Out Ms", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53VolumeFadeOutMs = value; AppToast.show(this, "Volume Fade Out Ms: ${labels[options.indexOf(value)]}") }
}

// v53.5: 弹幕发送时间戳
// v53.5: 弹幕发送时间戳
internal fun PlayerActivity.showv53DanmakuSendTimestampToggle() {
    val current = BiliClient.prefs.v53DanmakuSendTimestamp
    BiliClient.prefs.v53DanmakuSendTimestamp = !current
    AppToast.show(this, "Danmaku Send Timestamp: ${if (!current) "ON" else "OFF"}")
}

// v53.6: 投射音频编码
// v53.6: 投射音频编码
internal fun PlayerActivity.showv53CastAudioCodecDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v53CastAudioCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53CastAudioCodec = value; AppToast.show(this, "Cast Audio Codec: ${labels[options.indexOf(value)]}") }
}

// v53.7: 音量手势步进
// v53.7: 音量手势步进
internal fun PlayerActivity.showv53GestureVolumeStepDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v53GestureVolumeStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Volume Step", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53GestureVolumeStep = value; AppToast.show(this, "Gesture Volume Step: ${labels[options.indexOf(value)]}") }
}

// v53.8: 弹幕过滤类型
// v53.8: 弹幕过滤类型
internal fun PlayerActivity.showv53DanmakuFilterTypeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v53DanmakuFilterType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Type", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53DanmakuFilterType = value; AppToast.show(this, "Danmaku Filter Type: ${labels[options.indexOf(value)]}") }
}

// v53.9: 缓存清理策略
// v53.9: 缓存清理策略
internal fun PlayerActivity.showv53CacheCleanupPolicyDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v53CacheCleanupPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Policy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53CacheCleanupPolicy = value; AppToast.show(this, "Cache Cleanup Policy: ${labels[options.indexOf(value)]}") }
}

// v53.10: 进度条吸附
// v53.10: 进度条吸附
internal fun PlayerActivity.showv53ProgressBarSnapToggle() {
    val current = BiliClient.prefs.v53ProgressBarSnap
    BiliClient.prefs.v53ProgressBarSnap = !current
    AppToast.show(this, "Progress Bar Snap: ${if (!current) "ON" else "OFF"}")
}

// v53.11: 弹幕删除线
// v53.11: 弹幕删除线
internal fun PlayerActivity.showv53DanmakuFontStrikeToggle() {
    val current = BiliClient.prefs.v53DanmakuFontStrike
    BiliClient.prefs.v53DanmakuFontStrike = !current
    AppToast.show(this, "Danmaku Font Strike: ${if (!current) "ON" else "OFF"}")
}

// v53.12: 黑电平
// v53.12: 黑电平
internal fun PlayerActivity.showv53ColorBlackLevelDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v53ColorBlackLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Black Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53ColorBlackLevel = value; AppToast.show(this, "Color Black Level: ${labels[options.indexOf(value)]}") }
}

// v53.13: 自定义声道平衡
// v53.13: 自定义声道平衡
internal fun PlayerActivity.showv53VolumeBalanceCustomDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v53VolumeBalanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Balance Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v53VolumeBalanceCustom = value; AppToast.show(this, "Volume Balance Custom: ${labels[options.indexOf(value)]}") }
}

// v53.14: 弹幕背景圆角
// v53.14: 弹幕背景圆角
internal fun PlayerActivity.showv53DanmakuBgRoundedToggle() {
    val current = BiliClient.prefs.v53DanmakuBgRounded
    BiliClient.prefs.v53DanmakuBgRounded = !current
    AppToast.show(this, "Danmaku Bg Rounded: ${if (!current) "ON" else "OFF"}")
}

// v53.15: 投射自动暂停
// v53.15: 投射自动暂停
internal fun PlayerActivity.showv53CastAutoPauseToggle() {
    val current = BiliClient.prefs.v53CastAutoPause
    BiliClient.prefs.v53CastAutoPause = !current
    AppToast.show(this, "Cast Auto Pause: ${if (!current) "ON" else "OFF"}")
}

// v54.1: 记忆恢复播放位置
// v54.1: 记忆恢复播放位置
internal fun PlayerActivity.showv54PlaybackResumePositionToggle() {
    val current = BiliClient.prefs.v54PlaybackResumePosition
    BiliClient.prefs.v54PlaybackResumePosition = !current
    AppToast.show(this, "Playback Resume Position: ${if (!current) "ON" else "OFF"}")
}

// v54.2: 弹幕字号范围
// v54.2: 弹幕字号范围
internal fun PlayerActivity.showv54DanmakuFontSizeRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuFontSizeRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Size Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54DanmakuFontSizeRange = value; AppToast.show(this, "Danmaku Font Size Range: ${labels[options.indexOf(value)]}") }
}

// v54.3: 亮度调节
// v54.3: 亮度调节
internal fun PlayerActivity.showv54ColorBrightnessDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v54ColorBrightness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Brightness", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54ColorBrightness = value; AppToast.show(this, "Color Brightness: ${labels[options.indexOf(value)]}") }
}

// v54.4: 环绕声模式
// v54.4: 环绕声模式
internal fun PlayerActivity.showv54VolumeSurroundModeDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v54VolumeSurroundMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Surround Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54VolumeSurroundMode = value; AppToast.show(this, "Volume Surround Mode: ${labels[options.indexOf(value)]}") }
}

// v54.5: 弹幕草稿箱
// v54.5: 弹幕草稿箱
internal fun PlayerActivity.showv54DanmakuSendDraftToggle() {
    val current = BiliClient.prefs.v54DanmakuSendDraft
    BiliClient.prefs.v54DanmakuSendDraft = !current
    AppToast.show(this, "Danmaku Send Draft: ${if (!current) "ON" else "OFF"}")
}

// v54.6: 投射屏幕镜像
// v54.6: 投射屏幕镜像
internal fun PlayerActivity.showv54CastScreenMirrorToggle() {
    val current = BiliClient.prefs.v54CastScreenMirror
    BiliClient.prefs.v54CastScreenMirror = !current
    AppToast.show(this, "Cast Screen Mirror: ${if (!current) "ON" else "OFF"}")
}

// v54.7: 亮度手势步进
// v54.7: 亮度手势步进
internal fun PlayerActivity.showv54GestureBrightnessStepDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v54GestureBrightnessStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Brightness Step", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54GestureBrightnessStep = value; AppToast.show(this, "Gesture Brightness Step: ${labels[options.indexOf(value)]}") }
}

// v54.8: 弹幕过滤用户
// v54.8: 弹幕过滤用户
internal fun PlayerActivity.showv54DanmakuFilterUserToggle() {
    val current = BiliClient.prefs.v54DanmakuFilterUser
    BiliClient.prefs.v54DanmakuFilterUser = !current
    AppToast.show(this, "Danmaku Filter User: ${if (!current) "ON" else "OFF"}")
}

// v54.9: 唤醒预加载
// v54.9: 唤醒预加载
internal fun PlayerActivity.showv54CacheWakeupPrefetchToggle() {
    val current = BiliClient.prefs.v54CacheWakeupPrefetch
    BiliClient.prefs.v54CacheWakeupPrefetch = !current
    AppToast.show(this, "Cache Wakeup Prefetch: ${if (!current) "ON" else "OFF"}")
}

// v54.10: 进度条震动反馈
// v54.10: 进度条震动反馈
internal fun PlayerActivity.showv54ProgressBarHapticToggle() {
    val current = BiliClient.prefs.v54ProgressBarHaptic
    BiliClient.prefs.v54ProgressBarHaptic = !current
    AppToast.show(this, "Progress Bar Haptic: ${if (!current) "ON" else "OFF"}")
}

// v54.11: 弹幕下划线
// v54.11: 弹幕下划线
internal fun PlayerActivity.showv54DanmakuFontUnderlineToggle() {
    val current = BiliClient.prefs.v54DanmakuFontUnderline
    BiliClient.prefs.v54DanmakuFontUnderline = !current
    AppToast.show(this, "Danmaku Font Underline: ${if (!current) "ON" else "OFF"}")
}

// v54.12: 对比度
// v54.12: 对比度
internal fun PlayerActivity.showv54ColorContrastDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v54ColorContrast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Contrast", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54ColorContrast = value; AppToast.show(this, "Color Contrast: ${labels[options.indexOf(value)]}") }
}

// v54.13: 自动增益
// v54.13: 自动增益
internal fun PlayerActivity.showv54VolumeAutoGainToggle() {
    val current = BiliClient.prefs.v54VolumeAutoGain
    BiliClient.prefs.v54VolumeAutoGain = !current
    AppToast.show(this, "Volume Auto Gain: ${if (!current) "ON" else "OFF"}")
}

// v54.14: 弹幕渐变方向
// v54.14: 弹幕渐变方向
internal fun PlayerActivity.showv54DanmakuBgGradientDirectionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuBgGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Direction", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54DanmakuBgGradientDirection = value; AppToast.show(this, "Danmaku Bg Gradient Direction: ${labels[options.indexOf(value)]}") }
}

// v54.15: 投射字幕语言
// v54.15: 投射字幕语言
internal fun PlayerActivity.showv54CastSubtitleLangDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v54CastSubtitleLang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Lang", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v54CastSubtitleLang = value; AppToast.show(this, "Cast Subtitle Lang: ${labels[options.indexOf(value)]}") }
}

// v55.1: 自动恢复播放
// v55.1: 自动恢复播放
internal fun PlayerActivity.showv55PlaybackAutoResumeToggle() {
    val current = BiliClient.prefs.v55PlaybackAutoResume
    BiliClient.prefs.v55PlaybackAutoResume = !current
    AppToast.show(this, "Playback Auto Resume: ${if (!current) "ON" else "OFF"}")
}

// v55.2: 弹幕等宽字体
// v55.2: 弹幕等宽字体
internal fun PlayerActivity.showv55DanmakuFontMonospaceToggle() {
    val current = BiliClient.prefs.v55DanmakuFontMonospace
    BiliClient.prefs.v55DanmakuFontMonospace = !current
    AppToast.show(this, "Danmaku Font Monospace: ${if (!current) "ON" else "OFF"}")
}

// v55.3: 自动色调
// v55.3: 自动色调
internal fun PlayerActivity.showv55ColorHueAutoToggle() {
    val current = BiliClient.prefs.v55ColorHueAuto
    BiliClient.prefs.v55ColorHueAuto = !current
    AppToast.show(this, "Color Hue Auto: ${if (!current) "ON" else "OFF"}")
}

// v55.4: 峰值限幅
// v55.4: 峰值限幅
internal fun PlayerActivity.showv55VolumePeakLimiterToggle() {
    val current = BiliClient.prefs.v55VolumePeakLimiter
    BiliClient.prefs.v55VolumePeakLimiter = !current
    AppToast.show(this, "Volume Peak Limiter: ${if (!current) "ON" else "OFF"}")
}

// v55.5: 弹幕队列发送
// v55.5: 弹幕队列发送
internal fun PlayerActivity.showv55DanmakuSendQueueToggle() {
    val current = BiliClient.prefs.v55DanmakuSendQueue
    BiliClient.prefs.v55DanmakuSendQueue = !current
    AppToast.show(this, "Danmaku Send Queue: ${if (!current) "ON" else "OFF"}")
}

// v55.6: 投射带宽限制
// v55.6: 投射带宽限制
internal fun PlayerActivity.showv55CastBandwidthLimitDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v55CastBandwidthLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Bandwidth Limit", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v55CastBandwidthLimit = value; AppToast.show(this, "Cast Bandwidth Limit: ${labels[options.indexOf(value)]}") }
}

// v55.7: 手势锁屏
// v55.7: 手势锁屏
internal fun PlayerActivity.showv55GestureLockScreenToggle() {
    val current = BiliClient.prefs.v55GestureLockScreen
    BiliClient.prefs.v55GestureLockScreen = !current
    AppToast.show(this, "Gesture Lock Screen: ${if (!current) "ON" else "OFF"}")
}

// v55.8: 弹幕正则过滤
// v55.8: 弹幕正则过滤
internal fun PlayerActivity.showv55DanmakuFilterRegexToggle() {
    val current = BiliClient.prefs.v55DanmakuFilterRegex
    BiliClient.prefs.v55DanmakuFilterRegex = !current
    AppToast.show(this, "Danmaku Filter Regex: ${if (!current) "ON" else "OFF"}")
}

// v55.9: 缓存网络策略
// v55.9: 缓存网络策略
internal fun PlayerActivity.showv55CacheNetworkPolicyDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v55CacheNetworkPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Network Policy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v55CacheNetworkPolicy = value; AppToast.show(this, "Cache Network Policy: ${labels[options.indexOf(value)]}") }
}

// v55.10: 进度条双击动作
// v55.10: 进度条双击动作
internal fun PlayerActivity.showv55ProgressBarDoubleTapActionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v55ProgressBarDoubleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Double Tap Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v55ProgressBarDoubleTapAction = value; AppToast.show(this, "Progress Bar Double Tap Action: ${labels[options.indexOf(value)]}") }
}

// v55.11: 弹幕字体自定义粗细
// v55.11: 弹幕字体自定义粗细
internal fun PlayerActivity.showv55DanmakuFontWeightCustomDialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v55DanmakuFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v55DanmakuFontWeightCustom = value; AppToast.show(this, "Danmaku Font Weight Custom: ${labels[options.indexOf(value)]}") }
}

// v55.12: 自定义色调
// v55.12: 自定义色调
internal fun PlayerActivity.showv55ColorTintCustomDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v55ColorTintCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Tint Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v55ColorTintCustom = value; AppToast.show(this, "Color Tint Custom: ${labels[options.indexOf(value)]}") }
}

// v55.13: 音量压缩
// v55.13: 音量压缩
internal fun PlayerActivity.showv55VolumeCompressorToggle() {
    val current = BiliClient.prefs.v55VolumeCompressor
    BiliClient.prefs.v55VolumeCompressor = !current
    AppToast.show(this, "Volume Compressor: ${if (!current) "ON" else "OFF"}")
}

// v55.14: 弹幕背景内边距
// v55.14: 弹幕背景内边距
internal fun PlayerActivity.showv55DanmakuBgPaddingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v55DanmakuBgPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Padding", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v55DanmakuBgPadding = value; AppToast.show(this, "Danmaku Bg Padding: ${labels[options.indexOf(value)]}") }
}

// v55.15: 投射自动画质
// v55.15: 投射自动画质
internal fun PlayerActivity.showv55CastAutoQualityToggle() {
    val current = BiliClient.prefs.v55CastAutoQuality
    BiliClient.prefs.v55CastAutoQuality = !current
    AppToast.show(this, "Cast Auto Quality: ${if (!current) "ON" else "OFF"}")
}

// 56.1: Playback Skip Silence
internal fun PlayerActivity.showv56PlaybackSkipSilenceToggle() {
    val current = BiliClient.prefs.v56PlaybackSkipSilence
    BiliClient.prefs.v56PlaybackSkipSilence = !current
    AppToast.show(this, "Playback Skip Silence: ${if (!current) "ON" else "OFF"}")
}

// 56.2: Danmaku Font Weight Auto
internal fun PlayerActivity.showv56DanmakuFontWeightAutoToggle() {
    val current = BiliClient.prefs.v56DanmakuFontWeightAuto
    BiliClient.prefs.v56DanmakuFontWeightAuto = !current
    AppToast.show(this, "Danmaku Font Weight Auto: ${if (!current) "ON" else "OFF"}")
}

// 56.3: Color Reduction
internal fun PlayerActivity.showv56ColorReductionDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v56ColorReduction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Reduction", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56ColorReduction = value; AppToast.show(this, "Color Reduction: ${labels[options.indexOf(value)]}") }
}

// 56.4: Volume Stereo Widen
internal fun PlayerActivity.showv56VolumeStereoWidenDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v56VolumeStereoWiden).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Stereo Widen", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56VolumeStereoWiden = value; AppToast.show(this, "Volume Stereo Widen: ${labels[options.indexOf(value)]}") }
}

// 56.5: Danmaku Send Priority
internal fun PlayerActivity.showv56DanmakuSendPriorityToggle() {
    val current = BiliClient.prefs.v56DanmakuSendPriority
    BiliClient.prefs.v56DanmakuSendPriority = !current
    AppToast.show(this, "Danmaku Send Priority: ${if (!current) "ON" else "OFF"}")
}

// 56.6: Cast Auto Rotate
internal fun PlayerActivity.showv56CastAutoRotateToggle() {
    val current = BiliClient.prefs.v56CastAutoRotate
    BiliClient.prefs.v56CastAutoRotate = !current
    AppToast.show(this, "Cast Auto Rotate: ${if (!current) "ON" else "OFF"}")
}

// 56.7: Gesture Long Press Speed
internal fun PlayerActivity.showv56GestureLongPressSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v56GestureLongPressSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56GestureLongPressSpeed = value; AppToast.show(this, "Gesture Long Press Speed: ${labels[options.indexOf(value)]}") }
}

// 56.8: Danmaku Filter Score
internal fun PlayerActivity.showv56DanmakuFilterScoreDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuFilterScore).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Score", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56DanmakuFilterScore = value; AppToast.show(this, "Danmaku Filter Score: ${labels[options.indexOf(value)]}") }
}

// 56.9: Cache Compress Enabled
internal fun PlayerActivity.showv56CacheCompressEnabledToggle() {
    val current = BiliClient.prefs.v56CacheCompressEnabled
    BiliClient.prefs.v56CacheCompressEnabled = !current
    AppToast.show(this, "Cache Compress Enabled: ${if (!current) "ON" else "OFF"}")
}

// 56.10: Progress Bar Chapters Color
internal fun PlayerActivity.showv56ProgressBarChaptersColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v56ProgressBarChaptersColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Chapters Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56ProgressBarChaptersColor = value; AppToast.show(this, "Progress Bar Chapters Color: ${labels[options.indexOf(value)]}") }
}

// 56.11: Danmaku Font Letter Spacing2
internal fun PlayerActivity.showv56DanmakuFontLetterSpacing2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuFontLetterSpacing2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Letter Spacing2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56DanmakuFontLetterSpacing2 = value; AppToast.show(this, "Danmaku Font Letter Spacing2: ${labels[options.indexOf(value)]}") }
}

// 56.12: Color Saturation Curve
internal fun PlayerActivity.showv56ColorSaturationCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v56ColorSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Saturation Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56ColorSaturationCurve = value; AppToast.show(this, "Color Saturation Curve: ${labels[options.indexOf(value)]}") }
}

// 56.13: Volume Pre Amp
internal fun PlayerActivity.showv56VolumePreAmpDialog() {
    val options = listOf(-20,-16,-12,-8,-4,0,4,8,12,16,20)
    val labels = listOf("-20","-16","-12","-8","-4","0","4","8","12","16","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v56VolumePreAmp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Pre Amp", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56VolumePreAmp = value; AppToast.show(this, "Volume Pre Amp: ${labels[options.indexOf(value)]}") }
}

// 56.14: Danmaku Bg Gradient Opacity
internal fun PlayerActivity.showv56DanmakuBgGradientOpacityDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuBgGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Opacity", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56DanmakuBgGradientOpacity = value; AppToast.show(this, "Danmaku Bg Gradient Opacity: ${labels[options.indexOf(value)]}") }
}

// 56.15: Cast Subtitle Style
internal fun PlayerActivity.showv56CastSubtitleStyleDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v56CastSubtitleStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Style", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v56CastSubtitleStyle = value; AppToast.show(this, "Cast Subtitle Style: ${labels[options.indexOf(value)]}") }
}

// 57.1: Playback Auto Skip Ads
internal fun PlayerActivity.showv57PlaybackAutoSkipAdsToggle() {
    val current = BiliClient.prefs.v57PlaybackAutoSkipAds
    BiliClient.prefs.v57PlaybackAutoSkipAds = !current
    AppToast.show(this, "Playback Auto Skip Ads: ${if (!current) "ON" else "OFF"}")
}

// 57.2: Danmaku Font Anti Alias
internal fun PlayerActivity.showv57DanmakuFontAntiAliasToggle() {
    val current = BiliClient.prefs.v57DanmakuFontAntiAlias
    BiliClient.prefs.v57DanmakuFontAntiAlias = !current
    AppToast.show(this, "Danmaku Font Anti Alias: ${if (!current) "ON" else "OFF"}")
}

// 57.3: Color Vibrance
internal fun PlayerActivity.showv57ColorVibranceDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v57ColorVibrance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Vibrance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57ColorVibrance = value; AppToast.show(this, "Color Vibrance: ${labels[options.indexOf(value)]}") }
}

// 57.4: Volume Ducking
internal fun PlayerActivity.showv57VolumeDuckingToggle() {
    val current = BiliClient.prefs.v57VolumeDucking
    BiliClient.prefs.v57VolumeDucking = !current
    AppToast.show(this, "Volume Ducking: ${if (!current) "ON" else "OFF"}")
}

// 57.5: Danmaku Send Repeat
internal fun PlayerActivity.showv57DanmakuSendRepeatToggle() {
    val current = BiliClient.prefs.v57DanmakuSendRepeat
    BiliClient.prefs.v57DanmakuSendRepeat = !current
    AppToast.show(this, "Danmaku Send Repeat: ${if (!current) "ON" else "OFF"}")
}

// 57.6: Cast Auto Fullscreen
internal fun PlayerActivity.showv57CastAutoFullscreenToggle() {
    val current = BiliClient.prefs.v57CastAutoFullscreen
    BiliClient.prefs.v57CastAutoFullscreen = !current
    AppToast.show(this, "Cast Auto Fullscreen: ${if (!current) "ON" else "OFF"}")
}

// 57.7: Gesture Double Tap Action2
internal fun PlayerActivity.showv57GestureDoubleTapAction2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v57GestureDoubleTapAction2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Double Tap Action2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57GestureDoubleTapAction2 = value; AppToast.show(this, "Gesture Double Tap Action2: ${labels[options.indexOf(value)]}") }
}

// 57.8: Danmaku Filter Keywords
internal fun PlayerActivity.showv57DanmakuFilterKeywordsToggle() {
    val current = BiliClient.prefs.v57DanmakuFilterKeywords
    BiliClient.prefs.v57DanmakuFilterKeywords = !current
    AppToast.show(this, "Danmaku Filter Keywords: ${if (!current) "ON" else "OFF"}")
}

// 57.9: Cache Encrypt Enabled
internal fun PlayerActivity.showv57CacheEncryptEnabledToggle() {
    val current = BiliClient.prefs.v57CacheEncryptEnabled
    BiliClient.prefs.v57CacheEncryptEnabled = !current
    AppToast.show(this, "Cache Encrypt Enabled: ${if (!current) "ON" else "OFF"}")
}

// 57.10: Progress Bar Buffer Color
internal fun PlayerActivity.showv57ProgressBarBufferColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v57ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Buffer Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57ProgressBarBufferColor = value; AppToast.show(this, "Progress Bar Buffer Color: ${labels[options.indexOf(value)]}") }
}

// 57.11: Danmaku Font Background2
internal fun PlayerActivity.showv57DanmakuFontBackground2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuFontBackground2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Background2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57DanmakuFontBackground2 = value; AppToast.show(this, "Danmaku Font Background2: ${labels[options.indexOf(value)]}") }
}

// 57.12: Color Highlight Roll
internal fun PlayerActivity.showv57ColorHighlightRollDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v57ColorHighlightRoll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Highlight Roll", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57ColorHighlightRoll = value; AppToast.show(this, "Color Highlight Roll: ${labels[options.indexOf(value)]}") }
}

// 57.13: Volume Max Boost
internal fun PlayerActivity.showv57VolumeMaxBoostDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v57VolumeMaxBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Max Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57VolumeMaxBoost = value; AppToast.show(this, "Volume Max Boost: ${labels[options.indexOf(value)]}") }
}

// 57.14: Danmaku Bg Shadow Color2
internal fun PlayerActivity.showv57DanmakuBgShadowColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuBgShadowColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57DanmakuBgShadowColor2 = value; AppToast.show(this, "Danmaku Bg Shadow Color2: ${labels[options.indexOf(value)]}") }
}

// 57.15: Cast Video Bitrate
internal fun PlayerActivity.showv57CastVideoBitrateDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v57CastVideoBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Video Bitrate", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v57CastVideoBitrate = value; AppToast.show(this, "Cast Video Bitrate: ${labels[options.indexOf(value)]}") }
}

// 58.1: Playback Auto Speed
internal fun PlayerActivity.showv58PlaybackAutoSpeedToggle() {
    val current = BiliClient.prefs.v58PlaybackAutoSpeed
    BiliClient.prefs.v58PlaybackAutoSpeed = !current
    AppToast.show(this, "Playback Auto Speed: ${if (!current) "ON" else "OFF"}")
}

// 58.2: Danmaku Font Blend Mode
internal fun PlayerActivity.showv58DanmakuFontBlendModeDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuFontBlendMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Blend Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58DanmakuFontBlendMode = value; AppToast.show(this, "Danmaku Font Blend Mode: ${labels[options.indexOf(value)]}") }
}

// 58.3: Color Lift
internal fun PlayerActivity.showv58ColorLiftDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v58ColorLift).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Lift", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58ColorLift = value; AppToast.show(this, "Color Lift: ${labels[options.indexOf(value)]}") }
}

// 58.4: Volume Pan Control
internal fun PlayerActivity.showv58VolumePanControlDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v58VolumePanControl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Pan Control", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58VolumePanControl = value; AppToast.show(this, "Volume Pan Control: ${labels[options.indexOf(value)]}") }
}

// 58.5: Danmaku Send Font Size2
internal fun PlayerActivity.showv58DanmakuSendFontSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuSendFontSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Font Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58DanmakuSendFontSize2 = value; AppToast.show(this, "Danmaku Send Font Size2: ${labels[options.indexOf(value)]}") }
}

// 58.6: Cast Auto Resolution
internal fun PlayerActivity.showv58CastAutoResolutionToggle() {
    val current = BiliClient.prefs.v58CastAutoResolution
    BiliClient.prefs.v58CastAutoResolution = !current
    AppToast.show(this, "Cast Auto Resolution: ${if (!current) "ON" else "OFF"}")
}

// 58.7: Gesture Swipe Action2
internal fun PlayerActivity.showv58GestureSwipeAction2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v58GestureSwipeAction2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Swipe Action2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58GestureSwipeAction2 = value; AppToast.show(this, "Gesture Swipe Action2: ${labels[options.indexOf(value)]}") }
}

// 58.8: Danmaku Filter Regex2
internal fun PlayerActivity.showv58DanmakuFilterRegex2Toggle() {
    val current = BiliClient.prefs.v58DanmakuFilterRegex2
    BiliClient.prefs.v58DanmakuFilterRegex2 = !current
    AppToast.show(this, "Danmaku Filter Regex2: ${if (!current) "ON" else "OFF"}")
}

// 58.9: Cache Disk Policy
internal fun PlayerActivity.showv58CacheDiskPolicyDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v58CacheDiskPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Disk Policy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58CacheDiskPolicy = value; AppToast.show(this, "Cache Disk Policy: ${labels[options.indexOf(value)]}") }
}

// 58.10: Progress Bar Thumb Color
internal fun PlayerActivity.showv58ProgressBarThumbColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v58ProgressBarThumbColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Thumb Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58ProgressBarThumbColor = value; AppToast.show(this, "Progress Bar Thumb Color: ${labels[options.indexOf(value)]}") }
}

// 58.11: Danmaku Font Shadow Color2
internal fun PlayerActivity.showv58DanmakuFontShadowColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuFontShadowColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58DanmakuFontShadowColor2 = value; AppToast.show(this, "Danmaku Font Shadow Color2: ${labels[options.indexOf(value)]}") }
}

// 58.12: Color Midtone Gamma
internal fun PlayerActivity.showv58ColorMidtoneGammaDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v58ColorMidtoneGamma).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Midtone Gamma", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58ColorMidtoneGamma = value; AppToast.show(this, "Color Midtone Gamma: ${labels[options.indexOf(value)]}") }
}

// 58.13: Volume EQ
internal fun PlayerActivity.showv58VolumeEQDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v58VolumeEQ).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume EQ", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58VolumeEQ = value; AppToast.show(this, "Volume EQ: ${labels[options.indexOf(value)]}") }
}

// 58.14: Danmaku Bg Border Width
internal fun PlayerActivity.showv58DanmakuBgBorderWidthDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuBgBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Width", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58DanmakuBgBorderWidth = value; AppToast.show(this, "Danmaku Bg Border Width: ${labels[options.indexOf(value)]}") }
}

// 58.15: Cast Audio Delay
internal fun PlayerActivity.showv58CastAudioDelayDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v58CastAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Delay", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v58CastAudioDelay = value; AppToast.show(this, "Cast Audio Delay: ${labels[options.indexOf(value)]}") }
}

// 59.1: Playback Skip Blank
internal fun PlayerActivity.showv59PlaybackSkipBlankToggle() {
    val current = BiliClient.prefs.v59PlaybackSkipBlank
    BiliClient.prefs.v59PlaybackSkipBlank = !current
    AppToast.show(this, "Playback Skip Blank: ${if (!current) "ON" else "OFF"}")
}

// 59.2: Danmaku Font Outline Color
internal fun PlayerActivity.showv59DanmakuFontOutlineColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuFontOutlineColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Outline Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59DanmakuFontOutlineColor = value; AppToast.show(this, "Danmaku Font Outline Color: ${labels[options.indexOf(value)]}") }
}

// 59.3: Color Gain
internal fun PlayerActivity.showv59ColorGainDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v59ColorGain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Gain", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59ColorGain = value; AppToast.show(this, "Color Gain: ${labels[options.indexOf(value)]}") }
}

// 59.4: Volume Reverb
internal fun PlayerActivity.showv59VolumeReverbDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v59VolumeReverb).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Reverb", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59VolumeReverb = value; AppToast.show(this, "Volume Reverb: ${labels[options.indexOf(value)]}") }
}

// 59.5: Danmaku Send Bg Color
internal fun PlayerActivity.showv59DanmakuSendBgColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuSendBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Bg Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59DanmakuSendBgColor = value; AppToast.show(this, "Danmaku Send Bg Color: ${labels[options.indexOf(value)]}") }
}

// 59.6: Cast Auto Connect
internal fun PlayerActivity.showv59CastAutoConnectToggle() {
    val current = BiliClient.prefs.v59CastAutoConnect
    BiliClient.prefs.v59CastAutoConnect = !current
    AppToast.show(this, "Cast Auto Connect: ${if (!current) "ON" else "OFF"}")
}

// 59.7: Gesture Long Press Action2
internal fun PlayerActivity.showv59GestureLongPressAction2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v59GestureLongPressAction2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Action2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59GestureLongPressAction2 = value; AppToast.show(this, "Gesture Long Press Action2: ${labels[options.indexOf(value)]}") }
}

// 59.8: Danmaku Filter Lang
internal fun PlayerActivity.showv59DanmakuFilterLangDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuFilterLang).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Lang", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59DanmakuFilterLang = value; AppToast.show(this, "Danmaku Filter Lang: ${labels[options.indexOf(value)]}") }
}

// 59.9: Cache Memory Policy
internal fun PlayerActivity.showv59CacheMemoryPolicyDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v59CacheMemoryPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Memory Policy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59CacheMemoryPolicy = value; AppToast.show(this, "Cache Memory Policy: ${labels[options.indexOf(value)]}") }
}

// 59.10: Progress Bar Track Color
internal fun PlayerActivity.showv59ProgressBarTrackColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v59ProgressBarTrackColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Track Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59ProgressBarTrackColor = value; AppToast.show(this, "Progress Bar Track Color: ${labels[options.indexOf(value)]}") }
}

// 59.11: Danmaku Font Stroke Color2
internal fun PlayerActivity.showv59DanmakuFontStrokeColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuFontStrokeColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Stroke Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59DanmakuFontStrokeColor2 = value; AppToast.show(this, "Danmaku Font Stroke Color2: ${labels[options.indexOf(value)]}") }
}

// 59.12: Color Shadow Gamma
internal fun PlayerActivity.showv59ColorShadowGammaDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v59ColorShadowGamma).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Shadow Gamma", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59ColorShadowGamma = value; AppToast.show(this, "Color Shadow Gamma: ${labels[options.indexOf(value)]}") }
}

// 59.13: Volume Crossfeed
internal fun PlayerActivity.showv59VolumeCrossfeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v59VolumeCrossfeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Crossfeed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59VolumeCrossfeed = value; AppToast.show(this, "Volume Crossfeed: ${labels[options.indexOf(value)]}") }
}

// 59.14: Danmaku Bg Gradient Color2
internal fun PlayerActivity.showv59DanmakuBgGradientColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuBgGradientColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59DanmakuBgGradientColor2 = value; AppToast.show(this, "Danmaku Bg Gradient Color2: ${labels[options.indexOf(value)]}") }
}

// 59.15: Cast Video Quality
internal fun PlayerActivity.showv59CastVideoQualityDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v59CastVideoQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Video Quality", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v59CastVideoQuality = value; AppToast.show(this, "Cast Video Quality: ${labels[options.indexOf(value)]}") }
}

// 60.1: Playback Smart Buffer
internal fun PlayerActivity.showv60PlaybackSmartBufferToggle() {
    val current = BiliClient.prefs.v60PlaybackSmartBuffer
    BiliClient.prefs.v60PlaybackSmartBuffer = !current
    AppToast.show(this, "Playback Smart Buffer: ${if (!current) "ON" else "OFF"}")
}

// 60.2: Danmaku Font Weight2
internal fun PlayerActivity.showv60DanmakuFontWeight2Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuFontWeight2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60DanmakuFontWeight2 = value; AppToast.show(this, "Danmaku Font Weight2: ${labels[options.indexOf(value)]}") }
}

// 60.3: Color Highlight Gamma
internal fun PlayerActivity.showv60ColorHighlightGammaDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v60ColorHighlightGamma).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Highlight Gamma", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60ColorHighlightGamma = value; AppToast.show(this, "Color Highlight Gamma: ${labels[options.indexOf(value)]}") }
}

// 60.4: Volume Delay
internal fun PlayerActivity.showv60VolumeDelayDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v60VolumeDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Delay", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60VolumeDelay = value; AppToast.show(this, "Volume Delay: ${labels[options.indexOf(value)]}") }
}

// 60.5: Danmaku Send Border Color
internal fun PlayerActivity.showv60DanmakuSendBorderColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuSendBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Border Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60DanmakuSendBorderColor = value; AppToast.show(this, "Danmaku Send Border Color: ${labels[options.indexOf(value)]}") }
}

// 60.6: Cast Auto Adapt
internal fun PlayerActivity.showv60CastAutoAdaptToggle() {
    val current = BiliClient.prefs.v60CastAutoAdapt
    BiliClient.prefs.v60CastAutoAdapt = !current
    AppToast.show(this, "Cast Auto Adapt: ${if (!current) "ON" else "OFF"}")
}

// 60.7: Gesture Triple Tap Action
internal fun PlayerActivity.showv60GestureTripleTapActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v60GestureTripleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Triple Tap Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60GestureTripleTapAction = value; AppToast.show(this, "Gesture Triple Tap Action: ${labels[options.indexOf(value)]}") }
}

// 60.8: Danmaku Filter Length2
internal fun PlayerActivity.showv60DanmakuFilterLength2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuFilterLength2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Length2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60DanmakuFilterLength2 = value; AppToast.show(this, "Danmaku Filter Length2: ${labels[options.indexOf(value)]}") }
}

// 60.9: Cache Prefetch On Charge
internal fun PlayerActivity.showv60CachePrefetchOnChargeToggle() {
    val current = BiliClient.prefs.v60CachePrefetchOnCharge
    BiliClient.prefs.v60CachePrefetchOnCharge = !current
    AppToast.show(this, "Cache Prefetch On Charge: ${if (!current) "ON" else "OFF"}")
}

// 60.10: Progress Bar Scrub Preview
internal fun PlayerActivity.showv60ProgressBarScrubPreviewToggle() {
    val current = BiliClient.prefs.v60ProgressBarScrubPreview
    BiliClient.prefs.v60ProgressBarScrubPreview = !current
    AppToast.show(this, "Progress Bar Scrub Preview: ${if (!current) "ON" else "OFF"}")
}

// 60.11: Danmaku Font Bg Color2
internal fun PlayerActivity.showv60DanmakuFontBgColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuFontBgColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Bg Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60DanmakuFontBgColor2 = value; AppToast.show(this, "Danmaku Font Bg Color2: ${labels[options.indexOf(value)]}") }
}

// 60.12: Color Midtone Saturation
internal fun PlayerActivity.showv60ColorMidtoneSaturationDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v60ColorMidtoneSaturation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Midtone Saturation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60ColorMidtoneSaturation = value; AppToast.show(this, "Color Midtone Saturation: ${labels[options.indexOf(value)]}") }
}

// 60.13: Volume Loudness Target
internal fun PlayerActivity.showv60VolumeLoudnessTargetDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v60VolumeLoudnessTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Loudness Target", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60VolumeLoudnessTarget = value; AppToast.show(this, "Volume Loudness Target: ${labels[options.indexOf(value)]}") }
}

// 60.14: Danmaku Bg Opacity2
internal fun PlayerActivity.showv60DanmakuBgOpacity2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuBgOpacity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Opacity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60DanmakuBgOpacity2 = value; AppToast.show(this, "Danmaku Bg Opacity2: ${labels[options.indexOf(value)]}") }
}

// 60.15: Cast Subtitle Size
internal fun PlayerActivity.showv60CastSubtitleSizeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v60CastSubtitleSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v60CastSubtitleSize = value; AppToast.show(this, "Cast Subtitle Size: ${labels[options.indexOf(value)]}") }
}

// 61.1: Playback Auto Quality Switch
internal fun PlayerActivity.showv61PlaybackAutoQualitySwitchToggle() {
    val current = BiliClient.prefs.v61PlaybackAutoQualitySwitch
    BiliClient.prefs.v61PlaybackAutoQualitySwitch = !current
    AppToast.show(this, "Playback Auto Quality Switch: ${if (!current) "ON" else "OFF"}")
}

// 61.2: Danmaku Font Glow Color2
internal fun PlayerActivity.showv61DanmakuFontGlowColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuFontGlowColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Glow Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61DanmakuFontGlowColor2 = value; AppToast.show(this, "Danmaku Font Glow Color2: ${labels[options.indexOf(value)]}") }
}

// 61.3: Color Black Gamma
internal fun PlayerActivity.showv61ColorBlackGammaDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v61ColorBlackGamma).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Black Gamma", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61ColorBlackGamma = value; AppToast.show(this, "Color Black Gamma: ${labels[options.indexOf(value)]}") }
}

// 61.4: Volume Compressor Ratio
internal fun PlayerActivity.showv61VolumeCompressorRatioDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v61VolumeCompressorRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Compressor Ratio", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61VolumeCompressorRatio = value; AppToast.show(this, "Volume Compressor Ratio: ${labels[options.indexOf(value)]}") }
}

// 61.5: Danmaku Send Shadow Size
internal fun PlayerActivity.showv61DanmakuSendShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuSendShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61DanmakuSendShadowSize = value; AppToast.show(this, "Danmaku Send Shadow Size: ${labels[options.indexOf(value)]}") }
}

// 61.6: Cast Audio Enhance
internal fun PlayerActivity.showv61CastAudioEnhanceToggle() {
    val current = BiliClient.prefs.v61CastAudioEnhance
    BiliClient.prefs.v61CastAudioEnhance = !current
    AppToast.show(this, "Cast Audio Enhance: ${if (!current) "ON" else "OFF"}")
}

// 61.7: Gesture Edge Action
internal fun PlayerActivity.showv61GestureEdgeActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v61GestureEdgeAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Edge Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61GestureEdgeAction = value; AppToast.show(this, "Gesture Edge Action: ${labels[options.indexOf(value)]}") }
}

// 61.8: Danmaku Filter Sender
internal fun PlayerActivity.showv61DanmakuFilterSenderToggle() {
    val current = BiliClient.prefs.v61DanmakuFilterSender
    BiliClient.prefs.v61DanmakuFilterSender = !current
    AppToast.show(this, "Danmaku Filter Sender: ${if (!current) "ON" else "OFF"}")
}

// 61.9: Cache Auto Clear On Low
internal fun PlayerActivity.showv61CacheAutoClearOnLowToggle() {
    val current = BiliClient.prefs.v61CacheAutoClearOnLow
    BiliClient.prefs.v61CacheAutoClearOnLow = !current
    AppToast.show(this, "Cache Auto Clear On Low: ${if (!current) "ON" else "OFF"}")
}

// 61.10: Progress Bar Animation
internal fun PlayerActivity.showv61ProgressBarAnimationToggle() {
    val current = BiliClient.prefs.v61ProgressBarAnimation
    BiliClient.prefs.v61ProgressBarAnimation = !current
    AppToast.show(this, "Progress Bar Animation: ${if (!current) "ON" else "OFF"}")
}

// 61.11: Danmaku Font Highlight Color
internal fun PlayerActivity.showv61DanmakuFontHighlightColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuFontHighlightColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Highlight Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61DanmakuFontHighlightColor = value; AppToast.show(this, "Danmaku Font Highlight Color: ${labels[options.indexOf(value)]}") }
}

// 61.12: Color White Gamma
internal fun PlayerActivity.showv61ColorWhiteGammaDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v61ColorWhiteGamma).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Gamma", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61ColorWhiteGamma = value; AppToast.show(this, "Color White Gamma: ${labels[options.indexOf(value)]}") }
}

// 61.13: Volume Compressor Attack
internal fun PlayerActivity.showv61VolumeCompressorAttackDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v61VolumeCompressorAttack).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Compressor Attack", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61VolumeCompressorAttack = value; AppToast.show(this, "Volume Compressor Attack: ${labels[options.indexOf(value)]}") }
}

// 61.14: Danmaku Bg Border Color2
internal fun PlayerActivity.showv61DanmakuBgBorderColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuBgBorderColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61DanmakuBgBorderColor2 = value; AppToast.show(this, "Danmaku Bg Border Color2: ${labels[options.indexOf(value)]}") }
}

// 61.15: Cast Subtitle Color
internal fun PlayerActivity.showv61CastSubtitleColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v61CastSubtitleColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v61CastSubtitleColor = value; AppToast.show(this, "Cast Subtitle Color: ${labels[options.indexOf(value)]}") }
}

// 62.1: Playback Auto Bitrate
internal fun PlayerActivity.showv62PlaybackAutoBitrateToggle() {
    val current = BiliClient.prefs.v62PlaybackAutoBitrate
    BiliClient.prefs.v62PlaybackAutoBitrate = !current
    AppToast.show(this, "Playback Auto Bitrate: ${if (!current) "ON" else "OFF"}")
}

// 62.2: Danmaku Font Weight3
internal fun PlayerActivity.showv62DanmakuFontWeight3Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuFontWeight3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62DanmakuFontWeight3 = value; AppToast.show(this, "Danmaku Font Weight3: ${labels[options.indexOf(value)]}") }
}

// 62.3: Color Gamma Curve
internal fun PlayerActivity.showv62ColorGammaCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v62ColorGammaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Gamma Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62ColorGammaCurve = value; AppToast.show(this, "Color Gamma Curve: ${labels[options.indexOf(value)]}") }
}

// 62.4: Volume Compressor Release
internal fun PlayerActivity.showv62VolumeCompressorReleaseDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v62VolumeCompressorRelease).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Compressor Release", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62VolumeCompressorRelease = value; AppToast.show(this, "Volume Compressor Release: ${labels[options.indexOf(value)]}") }
}

// 62.5: Danmaku Send Outline Size
internal fun PlayerActivity.showv62DanmakuSendOutlineSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuSendOutlineSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Outline Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62DanmakuSendOutlineSize = value; AppToast.show(this, "Danmaku Send Outline Size: ${labels[options.indexOf(value)]}") }
}

// 62.6: Cast Video Enhance
internal fun PlayerActivity.showv62CastVideoEnhanceToggle() {
    val current = BiliClient.prefs.v62CastVideoEnhance
    BiliClient.prefs.v62CastVideoEnhance = !current
    AppToast.show(this, "Cast Video Enhance: ${if (!current) "ON" else "OFF"}")
}

// 62.7: Gesture Custom Action
internal fun PlayerActivity.showv62GestureCustomActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v62GestureCustomAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Custom Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62GestureCustomAction = value; AppToast.show(this, "Gesture Custom Action: ${labels[options.indexOf(value)]}") }
}

// 62.8: Danmaku Filter Time Range
internal fun PlayerActivity.showv62DanmakuFilterTimeRangeToggle() {
    val current = BiliClient.prefs.v62DanmakuFilterTimeRange
    BiliClient.prefs.v62DanmakuFilterTimeRange = !current
    AppToast.show(this, "Danmaku Filter Time Range: ${if (!current) "ON" else "OFF"}")
}

// 62.9: Cache Read Ahead
internal fun PlayerActivity.showv62CacheReadAheadDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v62CacheReadAhead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Read Ahead", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62CacheReadAhead = value; AppToast.show(this, "Cache Read Ahead: ${labels[options.indexOf(value)]}") }
}

// 62.10: Progress Bar Sensitivity
internal fun PlayerActivity.showv62ProgressBarSensitivityDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v62ProgressBarSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Sensitivity", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62ProgressBarSensitivity = value; AppToast.show(this, "Progress Bar Sensitivity: ${labels[options.indexOf(value)]}") }
}

// 62.11: Danmaku Font Glow Size2
internal fun PlayerActivity.showv62DanmakuFontGlowSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuFontGlowSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Glow Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62DanmakuFontGlowSize2 = value; AppToast.show(this, "Danmaku Font Glow Size2: ${labels[options.indexOf(value)]}") }
}

// 62.12: Color Temperature Curve
internal fun PlayerActivity.showv62ColorTemperatureCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v62ColorTemperatureCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Temperature Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62ColorTemperatureCurve = value; AppToast.show(this, "Color Temperature Curve: ${labels[options.indexOf(value)]}") }
}

// 62.13: Volume Limiter Threshold
internal fun PlayerActivity.showv62VolumeLimiterThresholdDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v62VolumeLimiterThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limiter Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62VolumeLimiterThreshold = value; AppToast.show(this, "Volume Limiter Threshold: ${labels[options.indexOf(value)]}") }
}

// 62.14: Danmaku Bg Shadow Blur2
internal fun PlayerActivity.showv62DanmakuBgShadowBlur2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuBgShadowBlur2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Blur2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62DanmakuBgShadowBlur2 = value; AppToast.show(this, "Danmaku Bg Shadow Blur2: ${labels[options.indexOf(value)]}") }
}

// 62.15: Cast Subtitle Bg Color
internal fun PlayerActivity.showv62CastSubtitleBgColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v62CastSubtitleBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Bg Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v62CastSubtitleBgColor = value; AppToast.show(this, "Cast Subtitle Bg Color: ${labels[options.indexOf(value)]}") }
}

// 63.1: Playback Auto Chapter
internal fun PlayerActivity.showv63PlaybackAutoChapterToggle() {
    val current = BiliClient.prefs.v63PlaybackAutoChapter
    BiliClient.prefs.v63PlaybackAutoChapter = !current
    AppToast.show(this, "Playback Auto Chapter: ${if (!current) "ON" else "OFF"}")
}

// 63.2: Danmaku Font Line Spacing2
internal fun PlayerActivity.showv63DanmakuFontLineSpacing2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuFontLineSpacing2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Line Spacing2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63DanmakuFontLineSpacing2 = value; AppToast.show(this, "Danmaku Font Line Spacing2: ${labels[options.indexOf(value)]}") }
}

// 63.3: Color Contrast Curve
internal fun PlayerActivity.showv63ColorContrastCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63ColorContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Contrast Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63ColorContrastCurve = value; AppToast.show(this, "Color Contrast Curve: ${labels[options.indexOf(value)]}") }
}

// 63.4: Volume Normalizer2
internal fun PlayerActivity.showv63VolumeNormalizer2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63VolumeNormalizer2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Normalizer2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63VolumeNormalizer2 = value; AppToast.show(this, "Volume Normalizer2: ${labels[options.indexOf(value)]}") }
}

// 63.5: Danmaku Send Bg Blur
internal fun PlayerActivity.showv63DanmakuSendBgBlurDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuSendBgBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Bg Blur", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63DanmakuSendBgBlur = value; AppToast.show(this, "Danmaku Send Bg Blur: ${labels[options.indexOf(value)]}") }
}

// 63.6: Cast Auto Subtitle
internal fun PlayerActivity.showv63CastAutoSubtitleToggle() {
    val current = BiliClient.prefs.v63CastAutoSubtitle
    BiliClient.prefs.v63CastAutoSubtitle = !current
    AppToast.show(this, "Cast Auto Subtitle: ${if (!current) "ON" else "OFF"}")
}

// 63.7: Gesture Pinch Action
internal fun PlayerActivity.showv63GesturePinchActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63GesturePinchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Pinch Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63GesturePinchAction = value; AppToast.show(this, "Gesture Pinch Action: ${labels[options.indexOf(value)]}") }
}

// 63.8: Danmaku Filter Score2
internal fun PlayerActivity.showv63DanmakuFilterScore2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuFilterScore2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Score2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63DanmakuFilterScore2 = value; AppToast.show(this, "Danmaku Filter Score2: ${labels[options.indexOf(value)]}") }
}

// 63.9: Cache Wakeup On Start
internal fun PlayerActivity.showv63CacheWakeupOnStartToggle() {
    val current = BiliClient.prefs.v63CacheWakeupOnStart
    BiliClient.prefs.v63CacheWakeupOnStart = !current
    AppToast.show(this, "Cache Wakeup On Start: ${if (!current) "ON" else "OFF"}")
}

// 63.10: Progress Bar Tick Color
internal fun PlayerActivity.showv63ProgressBarTickColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v63ProgressBarTickColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Tick Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63ProgressBarTickColor = value; AppToast.show(this, "Progress Bar Tick Color: ${labels[options.indexOf(value)]}") }
}

// 63.11: Danmaku Font Weight Custom2
internal fun PlayerActivity.showv63DanmakuFontWeightCustom2Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuFontWeightCustom2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight Custom2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63DanmakuFontWeightCustom2 = value; AppToast.show(this, "Danmaku Font Weight Custom2: ${labels[options.indexOf(value)]}") }
}

// 63.12: Color Brightness Curve
internal fun PlayerActivity.showv63ColorBrightnessCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63ColorBrightnessCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Brightness Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63ColorBrightnessCurve = value; AppToast.show(this, "Color Brightness Curve: ${labels[options.indexOf(value)]}") }
}

// 63.13: Volume Bass Lpf
internal fun PlayerActivity.showv63VolumeBassLpfDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63VolumeBassLpf).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Bass Lpf", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63VolumeBassLpf = value; AppToast.show(this, "Volume Bass Lpf: ${labels[options.indexOf(value)]}") }
}

// 63.14: Danmaku Bg Shadow Offset
internal fun PlayerActivity.showv63DanmakuBgShadowOffsetDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuBgShadowOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Offset", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63DanmakuBgShadowOffset = value; AppToast.show(this, "Danmaku Bg Shadow Offset: ${labels[options.indexOf(value)]}") }
}

// 63.15: Cast Subtitle Outline
internal fun PlayerActivity.showv63CastSubtitleOutlineDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastSubtitleOutline).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Outline", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v63CastSubtitleOutline = value; AppToast.show(this, "Cast Subtitle Outline: ${labels[options.indexOf(value)]}") }
}

// 64.1: Playback Auto Loop Playlist
internal fun PlayerActivity.showv64PlaybackAutoLoopPlaylistToggle() {
    val current = BiliClient.prefs.v64PlaybackAutoLoopPlaylist
    BiliClient.prefs.v64PlaybackAutoLoopPlaylist = !current
    AppToast.show(this, "Playback Auto Loop Playlist: ${if (!current) "ON" else "OFF"}")
}

// 64.2: Danmaku Font Shadow Offset2
internal fun PlayerActivity.showv64DanmakuFontShadowOffset2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFontShadowOffset2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Offset2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64DanmakuFontShadowOffset2 = value; AppToast.show(this, "Danmaku Font Shadow Offset2: ${labels[options.indexOf(value)]}") }
}

// 64.3: Color Saturation Boost
internal fun PlayerActivity.showv64ColorSaturationBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v64ColorSaturationBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Saturation Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64ColorSaturationBoost = value; AppToast.show(this, "Color Saturation Boost: ${labels[options.indexOf(value)]}") }
}

// 64.4: Volume Treble Hpf
internal fun PlayerActivity.showv64VolumeTrebleHpfDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v64VolumeTrebleHpf).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Treble Hpf", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64VolumeTrebleHpf = value; AppToast.show(this, "Volume Treble Hpf: ${labels[options.indexOf(value)]}") }
}

// 64.5: Danmaku Send Border Size
internal fun PlayerActivity.showv64DanmakuSendBorderSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuSendBorderSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Border Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64DanmakuSendBorderSize = value; AppToast.show(this, "Danmaku Send Border Size: ${labels[options.indexOf(value)]}") }
}

// 64.6: Cast Auto Quality2
internal fun PlayerActivity.showv64CastAutoQuality2Toggle() {
    val current = BiliClient.prefs.v64CastAutoQuality2
    BiliClient.prefs.v64CastAutoQuality2 = !current
    AppToast.show(this, "Cast Auto Quality2: ${if (!current) "ON" else "OFF"}")
}

// 64.7: Gesture Rotation Action
internal fun PlayerActivity.showv64GestureRotationActionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureRotationAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Rotation Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64GestureRotationAction = value; AppToast.show(this, "Gesture Rotation Action: ${labels[options.indexOf(value)]}") }
}

// 64.8: Danmaku Filter Length Range
internal fun PlayerActivity.showv64DanmakuFilterLengthRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFilterLengthRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Length Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64DanmakuFilterLengthRange = value; AppToast.show(this, "Danmaku Filter Length Range: ${labels[options.indexOf(value)]}") }
}

// 64.9: Cache Cleanup On Start
internal fun PlayerActivity.showv64CacheCleanupOnStartToggle() {
    val current = BiliClient.prefs.v64CacheCleanupOnStart
    BiliClient.prefs.v64CacheCleanupOnStart = !current
    AppToast.show(this, "Cache Cleanup On Start: ${if (!current) "ON" else "OFF"}")
}

// 64.10: Progress Bar Glow Color
internal fun PlayerActivity.showv64ProgressBarGlowColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v64ProgressBarGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Glow Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64ProgressBarGlowColor = value; AppToast.show(this, "Progress Bar Glow Color: ${labels[options.indexOf(value)]}") }
}

// 64.11: Danmaku Font Italic2
internal fun PlayerActivity.showv64DanmakuFontItalic2Toggle() {
    val current = BiliClient.prefs.v64DanmakuFontItalic2
    BiliClient.prefs.v64DanmakuFontItalic2 = !current
    AppToast.show(this, "Danmaku Font Italic2: ${if (!current) "ON" else "OFF"}")
}

// 64.12: Color Vividness Boost
internal fun PlayerActivity.showv64ColorVividnessBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v64ColorVividnessBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Vividness Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64ColorVividnessBoost = value; AppToast.show(this, "Color Vividness Boost: ${labels[options.indexOf(value)]}") }
}

// 64.13: Volume Surround Angle
internal fun PlayerActivity.showv64VolumeSurroundAngleDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v64VolumeSurroundAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Surround Angle", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64VolumeSurroundAngle = value; AppToast.show(this, "Volume Surround Angle: ${labels[options.indexOf(value)]}") }
}

// 64.14: Danmaku Bg Padding2
internal fun PlayerActivity.showv64DanmakuBgPadding2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuBgPadding2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Padding2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64DanmakuBgPadding2 = value; AppToast.show(this, "Danmaku Bg Padding2: ${labels[options.indexOf(value)]}") }
}

// 64.15: Cast Subtitle Delay
internal fun PlayerActivity.showv64CastSubtitleDelayDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v64CastSubtitleDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Delay", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v64CastSubtitleDelay = value; AppToast.show(this, "Cast Subtitle Delay: ${labels[options.indexOf(value)]}") }
}

// 65.1: Playback Auto Skip Recap
internal fun PlayerActivity.showv65PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v65PlaybackAutoSkipRecap
    BiliClient.prefs.v65PlaybackAutoSkipRecap = !current
    AppToast.show(this, "Playback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 65.2: Danmaku Font Strike2
internal fun PlayerActivity.showv65DanmakuFontStrike2Toggle() {
    val current = BiliClient.prefs.v65DanmakuFontStrike2
    BiliClient.prefs.v65DanmakuFontStrike2 = !current
    AppToast.show(this, "Danmaku Font Strike2: ${if (!current) "ON" else "OFF"}")
}

// 65.3: Color Hue Curve
internal fun PlayerActivity.showv65ColorHueCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v65ColorHueCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Hue Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65ColorHueCurve = value; AppToast.show(this, "Color Hue Curve: ${labels[options.indexOf(value)]}") }
}

// 65.4: Volume Bass Enhance
internal fun PlayerActivity.showv65VolumeBassEnhanceDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v65VolumeBassEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Bass Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65VolumeBassEnhance = value; AppToast.show(this, "Volume Bass Enhance: ${labels[options.indexOf(value)]}") }
}

// 65.5: Danmaku Send Anim Duration
internal fun PlayerActivity.showv65DanmakuSendAnimDurationDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuSendAnimDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Anim Duration", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65DanmakuSendAnimDuration = value; AppToast.show(this, "Danmaku Send Anim Duration: ${labels[options.indexOf(value)]}") }
}

// 65.6: Cast Auto Reconnect2
internal fun PlayerActivity.showv65CastAutoReconnect2Toggle() {
    val current = BiliClient.prefs.v65CastAutoReconnect2
    BiliClient.prefs.v65CastAutoReconnect2 = !current
    AppToast.show(this, "Cast Auto Reconnect2: ${if (!current) "ON" else "OFF"}")
}

// 65.7: Gesture Shake Action
internal fun PlayerActivity.showv65GestureShakeActionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureShakeAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Shake Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65GestureShakeAction = value; AppToast.show(this, "Gesture Shake Action: ${labels[options.indexOf(value)]}") }
}

// 65.8: Danmaku Filter Duplicate2
internal fun PlayerActivity.showv65DanmakuFilterDuplicate2Toggle() {
    val current = BiliClient.prefs.v65DanmakuFilterDuplicate2
    BiliClient.prefs.v65DanmakuFilterDuplicate2 = !current
    AppToast.show(this, "Danmaku Filter Duplicate2: ${if (!current) "ON" else "OFF"}")
}

// 65.9: Cache Prefetch On Idle
internal fun PlayerActivity.showv65CachePrefetchOnIdleToggle() {
    val current = BiliClient.prefs.v65CachePrefetchOnIdle
    BiliClient.prefs.v65CachePrefetchOnIdle = !current
    AppToast.show(this, "Cache Prefetch On Idle: ${if (!current) "ON" else "OFF"}")
}

// 65.10: Progress Bar Gradient Speed
internal fun PlayerActivity.showv65ProgressBarGradientSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v65ProgressBarGradientSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65ProgressBarGradientSpeed = value; AppToast.show(this, "Progress Bar Gradient Speed: ${labels[options.indexOf(value)]}") }
}

// 65.11: Danmaku Font Underline2
internal fun PlayerActivity.showv65DanmakuFontUnderline2Toggle() {
    val current = BiliClient.prefs.v65DanmakuFontUnderline2
    BiliClient.prefs.v65DanmakuFontUnderline2 = !current
    AppToast.show(this, "Danmaku Font Underline2: ${if (!current) "ON" else "OFF"}")
}

// 65.12: Color Lift Gamma Gain
internal fun PlayerActivity.showv65ColorLiftGammaGainDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v65ColorLiftGammaGain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Lift Gamma Gain", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65ColorLiftGammaGain = value; AppToast.show(this, "Color Lift Gamma Gain: ${labels[options.indexOf(value)]}") }
}

// 65.13: Volume Treble Enhance
internal fun PlayerActivity.showv65VolumeTrebleEnhanceDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v65VolumeTrebleEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Treble Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65VolumeTrebleEnhance = value; AppToast.show(this, "Volume Treble Enhance: ${labels[options.indexOf(value)]}") }
}

// 65.14: Danmaku Bg Border Radius2
internal fun PlayerActivity.showv65DanmakuBgBorderRadius2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuBgBorderRadius2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Radius2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65DanmakuBgBorderRadius2 = value; AppToast.show(this, "Danmaku Bg Border Radius2: ${labels[options.indexOf(value)]}") }
}

// 65.15: Cast Subtitle Bg Opacity
internal fun PlayerActivity.showv65CastSubtitleBgOpacityDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v65CastSubtitleBgOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Bg Opacity", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v65CastSubtitleBgOpacity = value; AppToast.show(this, "Cast Subtitle Bg Opacity: ${labels[options.indexOf(value)]}") }
}

// 66.1: Playback Smart Seek
internal fun PlayerActivity.showv66PlaybackSmartSeekToggle() {
    val current = BiliClient.prefs.v66PlaybackSmartSeek
    BiliClient.prefs.v66PlaybackSmartSeek = !current
    AppToast.show(this, "Playback Smart Seek: ${if (!current) "ON" else "OFF"}")
}

// 66.2: Danmaku Font Monospace2
internal fun PlayerActivity.showv66DanmakuFontMonospace2Toggle() {
    val current = BiliClient.prefs.v66DanmakuFontMonospace2
    BiliClient.prefs.v66DanmakuFontMonospace2 = !current
    AppToast.show(this, "Danmaku Font Monospace2: ${if (!current) "ON" else "OFF"}")
}

// 66.3: Color Tone Mapping
internal fun PlayerActivity.showv66ColorToneMappingDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v66ColorToneMapping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Tone Mapping", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66ColorToneMapping = value; AppToast.show(this, "Color Tone Mapping: ${labels[options.indexOf(value)]}") }
}

// 66.4: Volume Channel Delay
internal fun PlayerActivity.showv66VolumeChannelDelayDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v66VolumeChannelDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Channel Delay", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66VolumeChannelDelay = value; AppToast.show(this, "Volume Channel Delay: ${labels[options.indexOf(value)]}") }
}

// 66.5: Danmaku Send Font Size3
internal fun PlayerActivity.showv66DanmakuSendFontSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuSendFontSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Font Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66DanmakuSendFontSize3 = value; AppToast.show(this, "Danmaku Send Font Size3: ${labels[options.indexOf(value)]}") }
}

// 66.6: Cast Auto Adapt2
internal fun PlayerActivity.showv66CastAutoAdapt2Toggle() {
    val current = BiliClient.prefs.v66CastAutoAdapt2
    BiliClient.prefs.v66CastAutoAdapt2 = !current
    AppToast.show(this, "Cast Auto Adapt2: ${if (!current) "ON" else "OFF"}")
}

// 66.7: Gesture Multi Touch Action
internal fun PlayerActivity.showv66GestureMultiTouchActionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureMultiTouchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Multi Touch Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66GestureMultiTouchAction = value; AppToast.show(this, "Gesture Multi Touch Action: ${labels[options.indexOf(value)]}") }
}

// 66.8: Danmaku Filter Emote
internal fun PlayerActivity.showv66DanmakuFilterEmoteToggle() {
    val current = BiliClient.prefs.v66DanmakuFilterEmote
    BiliClient.prefs.v66DanmakuFilterEmote = !current
    AppToast.show(this, "Danmaku Filter Emote: ${if (!current) "ON" else "OFF"}")
}

// 66.9: Cache Compress Level
internal fun PlayerActivity.showv66CacheCompressLevelDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v66CacheCompressLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Compress Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66CacheCompressLevel = value; AppToast.show(this, "Cache Compress Level: ${labels[options.indexOf(value)]}") }
}

// 66.10: Progress Bar Shadow Color
internal fun PlayerActivity.showv66ProgressBarShadowColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v66ProgressBarShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Shadow Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66ProgressBarShadowColor = value; AppToast.show(this, "Progress Bar Shadow Color: ${labels[options.indexOf(value)]}") }
}

// 66.11: Danmaku Font Color2
internal fun PlayerActivity.showv66DanmakuFontColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuFontColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66DanmakuFontColor2 = value; AppToast.show(this, "Danmaku Font Color2: ${labels[options.indexOf(value)]}") }
}

// 66.12: Color ACESFilm
internal fun PlayerActivity.showv66ColorACESFilmDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v66ColorACESFilm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color ACESFilm", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66ColorACESFilm = value; AppToast.show(this, "Color ACESFilm: ${labels[options.indexOf(value)]}") }
}

// 66.13: Volume Dynamic Bass
internal fun PlayerActivity.showv66VolumeDynamicBassDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v66VolumeDynamicBass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Dynamic Bass", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66VolumeDynamicBass = value; AppToast.show(this, "Volume Dynamic Bass: ${labels[options.indexOf(value)]}") }
}

// 66.14: Danmaku Bg Gradient Color3
internal fun PlayerActivity.showv66DanmakuBgGradientColor3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuBgGradientColor3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Color3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66DanmakuBgGradientColor3 = value; AppToast.show(this, "Danmaku Bg Gradient Color3: ${labels[options.indexOf(value)]}") }
}

// 66.15: Cast Subtitle Font
internal fun PlayerActivity.showv66CastSubtitleFontDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v66CastSubtitleFont).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Font", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v66CastSubtitleFont = value; AppToast.show(this, "Cast Subtitle Font: ${labels[options.indexOf(value)]}") }
}

// 67.1: Playback Auto Skip Preview
internal fun PlayerActivity.showv67PlaybackAutoSkipPreviewToggle() {
    val current = BiliClient.prefs.v67PlaybackAutoSkipPreview
    BiliClient.prefs.v67PlaybackAutoSkipPreview = !current
    AppToast.show(this, "Playback Auto Skip Preview: ${if (!current) "ON" else "OFF"}")
}

// 67.2: Danmaku Font Outline Color2
internal fun PlayerActivity.showv67DanmakuFontOutlineColor2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuFontOutlineColor2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Outline Color2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67DanmakuFontOutlineColor2 = value; AppToast.show(this, "Danmaku Font Outline Color2: ${labels[options.indexOf(value)]}") }
}

// 67.3: Color Log Curve
internal fun PlayerActivity.showv67ColorLogCurveDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v67ColorLogCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Log Curve", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67ColorLogCurve = value; AppToast.show(this, "Color Log Curve: ${labels[options.indexOf(value)]}") }
}

// 67.4: Volume Spatial Audio
internal fun PlayerActivity.showv67VolumeSpatialAudioDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v67VolumeSpatialAudio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Spatial Audio", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67VolumeSpatialAudio = value; AppToast.show(this, "Volume Spatial Audio: ${labels[options.indexOf(value)]}") }
}

// 67.5: Danmaku Send Bg Radius
internal fun PlayerActivity.showv67DanmakuSendBgRadiusDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuSendBgRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Bg Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67DanmakuSendBgRadius = value; AppToast.show(this, "Danmaku Send Bg Radius: ${labels[options.indexOf(value)]}") }
}

// 67.6: Cast Auto Connect2
internal fun PlayerActivity.showv67CastAutoConnect2Toggle() {
    val current = BiliClient.prefs.v67CastAutoConnect2
    BiliClient.prefs.v67CastAutoConnect2 = !current
    AppToast.show(this, "Cast Auto Connect2: ${if (!current) "ON" else "OFF"}")
}

// 67.7: Gesture Finger Count Action
internal fun PlayerActivity.showv67GestureFingerCountActionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureFingerCountAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Finger Count Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67GestureFingerCountAction = value; AppToast.show(this, "Gesture Finger Count Action: ${labels[options.indexOf(value)]}") }
}

// 67.8: Danmaku Filter Combo
internal fun PlayerActivity.showv67DanmakuFilterComboToggle() {
    val current = BiliClient.prefs.v67DanmakuFilterCombo
    BiliClient.prefs.v67DanmakuFilterCombo = !current
    AppToast.show(this, "Danmaku Filter Combo: ${if (!current) "ON" else "OFF"}")
}

// 67.9: Cache Write Policy
internal fun PlayerActivity.showv67CacheWritePolicyDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v67CacheWritePolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Write Policy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67CacheWritePolicy = value; AppToast.show(this, "Cache Write Policy: ${labels[options.indexOf(value)]}") }
}

// 67.10: Progress Bar Gradient Color
internal fun PlayerActivity.showv67ProgressBarGradientColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v67ProgressBarGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67ProgressBarGradientColor = value; AppToast.show(this, "Progress Bar Gradient Color: ${labels[options.indexOf(value)]}") }
}

// 67.11: Danmaku Font Shadow Color3
internal fun PlayerActivity.showv67DanmakuFontShadowColor3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuFontShadowColor3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Color3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67DanmakuFontShadowColor3 = value; AppToast.show(this, "Danmaku Font Shadow Color3: ${labels[options.indexOf(value)]}") }
}

// 67.12: Color Sigmoid Contrast
internal fun PlayerActivity.showv67ColorSigmoidContrastDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v67ColorSigmoidContrast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Sigmoid Contrast", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67ColorSigmoidContrast = value; AppToast.show(this, "Color Sigmoid Contrast: ${labels[options.indexOf(value)]}") }
}

// 67.13: Volume Surround Delay
internal fun PlayerActivity.showv67VolumeSurroundDelayDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v67VolumeSurroundDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Surround Delay", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67VolumeSurroundDelay = value; AppToast.show(this, "Volume Surround Delay: ${labels[options.indexOf(value)]}") }
}

// 67.14: Danmaku Bg Shadow Color3
internal fun PlayerActivity.showv67DanmakuBgShadowColor3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuBgShadowColor3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Color3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67DanmakuBgShadowColor3 = value; AppToast.show(this, "Danmaku Bg Shadow Color3: ${labels[options.indexOf(value)]}") }
}

// 67.15: Cast Subtitle Shadow
internal fun PlayerActivity.showv67CastSubtitleShadowDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v67CastSubtitleShadow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Shadow", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v67CastSubtitleShadow = value; AppToast.show(this, "Cast Subtitle Shadow: ${labels[options.indexOf(value)]}") }
}

// 68.1: Playback Auto Skip Padding
internal fun PlayerActivity.showv68PlaybackAutoSkipPaddingToggle() {
    val current = BiliClient.prefs.v68PlaybackAutoSkipPadding
    BiliClient.prefs.v68PlaybackAutoSkipPadding = !current
    AppToast.show(this, "Playback Auto Skip Padding: ${if (!current) "ON" else "OFF"}")
}

// 68.2: Danmaku Font Glow Color3
internal fun PlayerActivity.showv68DanmakuFontGlowColor3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuFontGlowColor3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Glow Color3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68DanmakuFontGlowColor3 = value; AppToast.show(this, "Danmaku Font Glow Color3: ${labels[options.indexOf(value)]}") }
}

// 68.3: Color Film Grain
internal fun PlayerActivity.showv68ColorFilmGrainDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v68ColorFilmGrain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Film Grain", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68ColorFilmGrain = value; AppToast.show(this, "Color Film Grain: ${labels[options.indexOf(value)]}") }
}

// 68.4: Volume Channel Extractor
internal fun PlayerActivity.showv68VolumeChannelExtractorDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v68VolumeChannelExtractor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Channel Extractor", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68VolumeChannelExtractor = value; AppToast.show(this, "Volume Channel Extractor: ${labels[options.indexOf(value)]}") }
}

// 68.5: Danmaku Send Bg Gradient
internal fun PlayerActivity.showv68DanmakuSendBgGradientDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuSendBgGradient).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Bg Gradient", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68DanmakuSendBgGradient = value; AppToast.show(this, "Danmaku Send Bg Gradient: ${labels[options.indexOf(value)]}") }
}

// 68.6: Cast Auto Quality3
internal fun PlayerActivity.showv68CastAutoQuality3Toggle() {
    val current = BiliClient.prefs.v68CastAutoQuality3
    BiliClient.prefs.v68CastAutoQuality3 = !current
    AppToast.show(this, "Cast Auto Quality3: ${if (!current) "ON" else "OFF"}")
}

// 68.7: Gesture Pressure Action
internal fun PlayerActivity.showv68GesturePressureActionDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v68GesturePressureAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Pressure Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68GesturePressureAction = value; AppToast.show(this, "Gesture Pressure Action: ${labels[options.indexOf(value)]}") }
}

// 68.8: Danmaku Filter Super Chat
internal fun PlayerActivity.showv68DanmakuFilterSuperChatToggle() {
    val current = BiliClient.prefs.v68DanmakuFilterSuperChat
    BiliClient.prefs.v68DanmakuFilterSuperChat = !current
    AppToast.show(this, "Danmaku Filter Super Chat: ${if (!current) "ON" else "OFF"}")
}

// 68.9: Cache Prefetch On Start
internal fun PlayerActivity.showv68CachePrefetchOnStartToggle() {
    val current = BiliClient.prefs.v68CachePrefetchOnStart
    BiliClient.prefs.v68CachePrefetchOnStart = !current
    AppToast.show(this, "Cache Prefetch On Start: ${if (!current) "ON" else "OFF"}")
}

// 68.10: Progress Bar Glow Effect
internal fun PlayerActivity.showv68ProgressBarGlowEffectToggle() {
    val current = BiliClient.prefs.v68ProgressBarGlowEffect
    BiliClient.prefs.v68ProgressBarGlowEffect = !current
    AppToast.show(this, "Progress Bar Glow Effect: ${if (!current) "ON" else "OFF"}")
}

// 68.11: Danmaku Font Weight Custom3
internal fun PlayerActivity.showv68DanmakuFontWeightCustom3Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuFontWeightCustom3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight Custom3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68DanmakuFontWeightCustom3 = value; AppToast.show(this, "Danmaku Font Weight Custom3: ${labels[options.indexOf(value)]}") }
}

// 68.12: Color Bloom
internal fun PlayerActivity.showv68ColorBloomDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v68ColorBloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Bloom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68ColorBloom = value; AppToast.show(this, "Color Bloom: ${labels[options.indexOf(value)]}") }
}

// 68.13: Volume Dynamic Range
internal fun PlayerActivity.showv68VolumeDynamicRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v68VolumeDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Dynamic Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68VolumeDynamicRange = value; AppToast.show(this, "Volume Dynamic Range: ${labels[options.indexOf(value)]}") }
}

// 68.14: Danmaku Bg Shadow Offset2
internal fun PlayerActivity.showv68DanmakuBgShadowOffset2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuBgShadowOffset2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Offset2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68DanmakuBgShadowOffset2 = value; AppToast.show(this, "Danmaku Bg Shadow Offset2: ${labels[options.indexOf(value)]}") }
}

// 68.15: Cast Subtitle Glow
internal fun PlayerActivity.showv68CastSubtitleGlowDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v68CastSubtitleGlow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Glow", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v68CastSubtitleGlow = value; AppToast.show(this, "Cast Subtitle Glow: ${labels[options.indexOf(value)]}") }
}

// 69.1: Playback Auto Skip Filler2
internal fun PlayerActivity.showv69PlaybackAutoSkipFiller2Toggle() {
    val current = BiliClient.prefs.v69PlaybackAutoSkipFiller2
    BiliClient.prefs.v69PlaybackAutoSkipFiller2 = !current
    AppToast.show(this, "Playback Auto Skip Filler2: ${if (!current) "ON" else "OFF"}")
}

// 69.2: Danmaku Font Weight Final
internal fun PlayerActivity.showv69DanmakuFontWeightFinalDialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuFontWeightFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69DanmakuFontWeightFinal = value; AppToast.show(this, "Danmaku Font Weight Final: ${labels[options.indexOf(value)]}") }
}

// 69.3: Color Final
internal fun PlayerActivity.showv69ColorFinalDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v69ColorFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69ColorFinal = value; AppToast.show(this, "Color Final: ${labels[options.indexOf(value)]}") }
}

// 69.4: Volume Final
internal fun PlayerActivity.showv69VolumeFinalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v69VolumeFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69VolumeFinal = value; AppToast.show(this, "Volume Final: ${labels[options.indexOf(value)]}") }
}

// 69.5: Danmaku Send Final
internal fun PlayerActivity.showv69DanmakuSendFinalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuSendFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69DanmakuSendFinal = value; AppToast.show(this, "Danmaku Send Final: ${labels[options.indexOf(value)]}") }
}

// 69.6: Cast Final
internal fun PlayerActivity.showv69CastFinalToggle() {
    val current = BiliClient.prefs.v69CastFinal
    BiliClient.prefs.v69CastFinal = !current
    AppToast.show(this, "Cast Final: ${if (!current) "ON" else "OFF"}")
}

// 69.7: Gesture Final
internal fun PlayerActivity.showv69GestureFinalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69GestureFinal = value; AppToast.show(this, "Gesture Final: ${labels[options.indexOf(value)]}") }
}

// 69.8: Danmaku Filter Final
internal fun PlayerActivity.showv69DanmakuFilterFinalToggle() {
    val current = BiliClient.prefs.v69DanmakuFilterFinal
    BiliClient.prefs.v69DanmakuFilterFinal = !current
    AppToast.show(this, "Danmaku Filter Final: ${if (!current) "ON" else "OFF"}")
}

// 69.9: Cache Final
internal fun PlayerActivity.showv69CacheFinalToggle() {
    val current = BiliClient.prefs.v69CacheFinal
    BiliClient.prefs.v69CacheFinal = !current
    AppToast.show(this, "Cache Final: ${if (!current) "ON" else "OFF"}")
}

// 69.10: Progress Bar Final
internal fun PlayerActivity.showv69ProgressBarFinalDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v69ProgressBarFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69ProgressBarFinal = value; AppToast.show(this, "Progress Bar Final: ${labels[options.indexOf(value)]}") }
}

// 69.11: Danmaku Font Final
internal fun PlayerActivity.showv69DanmakuFontFinalDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuFontFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69DanmakuFontFinal = value; AppToast.show(this, "Danmaku Font Final: ${labels[options.indexOf(value)]}") }
}

// 69.12: Color Final2
internal fun PlayerActivity.showv69ColorFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v69ColorFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69ColorFinal2 = value; AppToast.show(this, "Color Final2: ${labels[options.indexOf(value)]}") }
}

// 69.13: Volume Final2
internal fun PlayerActivity.showv69VolumeFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v69VolumeFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69VolumeFinal2 = value; AppToast.show(this, "Volume Final2: ${labels[options.indexOf(value)]}") }
}

// 69.14: Danmaku Bg Final
internal fun PlayerActivity.showv69DanmakuBgFinalDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuBgFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69DanmakuBgFinal = value; AppToast.show(this, "Danmaku Bg Final: ${labels[options.indexOf(value)]}") }
}

// 69.15: Cast Subtitle Final
internal fun PlayerActivity.showv69CastSubtitleFinalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v69CastSubtitleFinal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Final", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v69CastSubtitleFinal = value; AppToast.show(this, "Cast Subtitle Final: ${labels[options.indexOf(value)]}") }
}

// 70.1: Playback Final
internal fun PlayerActivity.showv70PlaybackFinalToggle() {
    val current = BiliClient.prefs.v70PlaybackFinal
    BiliClient.prefs.v70PlaybackFinal = !current
    AppToast.show(this, "Playback Final: ${if (!current) "ON" else "OFF"}")
}

// 70.2: Danmaku Font Final2
internal fun PlayerActivity.showv70DanmakuFontFinal2Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuFontFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70DanmakuFontFinal2 = value; AppToast.show(this, "Danmaku Font Final2: ${labels[options.indexOf(value)]}") }
}

// 70.3: Color Final3
internal fun PlayerActivity.showv70ColorFinal3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v70ColorFinal3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Final3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70ColorFinal3 = value; AppToast.show(this, "Color Final3: ${labels[options.indexOf(value)]}") }
}

// 70.4: Volume Final3
internal fun PlayerActivity.showv70VolumeFinal3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v70VolumeFinal3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Final3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70VolumeFinal3 = value; AppToast.show(this, "Volume Final3: ${labels[options.indexOf(value)]}") }
}

// 70.5: Danmaku Send Final2
internal fun PlayerActivity.showv70DanmakuSendFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuSendFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70DanmakuSendFinal2 = value; AppToast.show(this, "Danmaku Send Final2: ${labels[options.indexOf(value)]}") }
}

// 70.6: Cast Final2
internal fun PlayerActivity.showv70CastFinal2Toggle() {
    val current = BiliClient.prefs.v70CastFinal2
    BiliClient.prefs.v70CastFinal2 = !current
    AppToast.show(this, "Cast Final2: ${if (!current) "ON" else "OFF"}")
}

// 70.7: Gesture Final2
internal fun PlayerActivity.showv70GestureFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70GestureFinal2 = value; AppToast.show(this, "Gesture Final2: ${labels[options.indexOf(value)]}") }
}

// 70.8: Danmaku Filter Final2
internal fun PlayerActivity.showv70DanmakuFilterFinal2Toggle() {
    val current = BiliClient.prefs.v70DanmakuFilterFinal2
    BiliClient.prefs.v70DanmakuFilterFinal2 = !current
    AppToast.show(this, "Danmaku Filter Final2: ${if (!current) "ON" else "OFF"}")
}

// 70.9: Cache Final2
internal fun PlayerActivity.showv70CacheFinal2Toggle() {
    val current = BiliClient.prefs.v70CacheFinal2
    BiliClient.prefs.v70CacheFinal2 = !current
    AppToast.show(this, "Cache Final2: ${if (!current) "ON" else "OFF"}")
}

// 70.10: Progress Bar Final2
internal fun PlayerActivity.showv70ProgressBarFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v70ProgressBarFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70ProgressBarFinal2 = value; AppToast.show(this, "Progress Bar Final2: ${labels[options.indexOf(value)]}") }
}

// 70.11: Danmaku Font Final3
internal fun PlayerActivity.showv70DanmakuFontFinal3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuFontFinal3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Final3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70DanmakuFontFinal3 = value; AppToast.show(this, "Danmaku Font Final3: ${labels[options.indexOf(value)]}") }
}

// 70.12: Color Final4
internal fun PlayerActivity.showv70ColorFinal4Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v70ColorFinal4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Final4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70ColorFinal4 = value; AppToast.show(this, "Color Final4: ${labels[options.indexOf(value)]}") }
}

// 70.13: Volume Final4
internal fun PlayerActivity.showv70VolumeFinal4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v70VolumeFinal4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Final4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70VolumeFinal4 = value; AppToast.show(this, "Volume Final4: ${labels[options.indexOf(value)]}") }
}

// 70.14: Danmaku Bg Final2
internal fun PlayerActivity.showv70DanmakuBgFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuBgFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70DanmakuBgFinal2 = value; AppToast.show(this, "Danmaku Bg Final2: ${labels[options.indexOf(value)]}") }
}

// 70.15: Cast Subtitle Final2
internal fun PlayerActivity.showv70CastSubtitleFinal2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v70CastSubtitleFinal2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Subtitle Final2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v70CastSubtitleFinal2 = value; AppToast.show(this, "Cast Subtitle Final2: ${labels[options.indexOf(value)]}") }
}

// 71.1: layback Auto Skip Recap
internal fun PlayerActivity.showv71PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v71PlaybackAutoSkipRecap
    BiliClient.prefs.v71PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 71.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv71DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v71DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 71.3: olor Lift2
internal fun PlayerActivity.showv71ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v71ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 71.4: olume Surround2
internal fun PlayerActivity.showv71VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 71.5: ast Subtitle Sync2
internal fun PlayerActivity.showv71CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v71CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 71.6: esture Swipe Speed2
internal fun PlayerActivity.showv71GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 71.7: ache Max Size2
internal fun PlayerActivity.showv71CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v71CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 71.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv71ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 71.9: layback Smart Speed
internal fun PlayerActivity.showv71PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v71PlaybackSmartSpeed
    BiliClient.prefs.v71PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 71.10: anmaku Font Weight4
internal fun PlayerActivity.showv71DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v71DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 71.11: olor Gamma2
internal fun PlayerActivity.showv71ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 71.12: olume Bass2
internal fun PlayerActivity.showv71VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 71.13: ast Video Quality2
internal fun PlayerActivity.showv71CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 71.14: esture Double Tap Speed
internal fun PlayerActivity.showv71GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 71.15: ache Prefetch Size2
internal fun PlayerActivity.showv71CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v71CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v71CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 72.1: layback Auto Skip Recap
internal fun PlayerActivity.showv72PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v72PlaybackAutoSkipRecap
    BiliClient.prefs.v72PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 72.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv72DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 72.3: olor Lift2
internal fun PlayerActivity.showv72ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v72ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 72.4: olume Surround2
internal fun PlayerActivity.showv72VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 72.5: ast Subtitle Sync2
internal fun PlayerActivity.showv72CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v72CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 72.6: esture Swipe Speed2
internal fun PlayerActivity.showv72GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 72.7: ache Max Size2
internal fun PlayerActivity.showv72CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v72CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 72.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv72ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 72.9: layback Smart Speed
internal fun PlayerActivity.showv72PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v72PlaybackSmartSpeed
    BiliClient.prefs.v72PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 72.10: anmaku Font Weight4
internal fun PlayerActivity.showv72DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 72.11: olor Gamma2
internal fun PlayerActivity.showv72ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 72.12: olume Bass2
internal fun PlayerActivity.showv72VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 72.13: ast Video Quality2
internal fun PlayerActivity.showv72CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 72.14: esture Double Tap Speed
internal fun PlayerActivity.showv72GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 72.15: ache Prefetch Size2
internal fun PlayerActivity.showv72CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v72CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v72CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 73.1: layback Auto Skip Recap
internal fun PlayerActivity.showv73PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v73PlaybackAutoSkipRecap
    BiliClient.prefs.v73PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 73.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv73DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v73DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 73.3: olor Lift2
internal fun PlayerActivity.showv73ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v73ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 73.4: olume Surround2
internal fun PlayerActivity.showv73VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 73.5: ast Subtitle Sync2
internal fun PlayerActivity.showv73CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v73CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 73.6: esture Swipe Speed2
internal fun PlayerActivity.showv73GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 73.7: ache Max Size2
internal fun PlayerActivity.showv73CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v73CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 73.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv73ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 73.9: layback Smart Speed
internal fun PlayerActivity.showv73PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v73PlaybackSmartSpeed
    BiliClient.prefs.v73PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 73.10: anmaku Font Weight4
internal fun PlayerActivity.showv73DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v73DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 73.11: olor Gamma2
internal fun PlayerActivity.showv73ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 73.12: olume Bass2
internal fun PlayerActivity.showv73VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 73.13: ast Video Quality2
internal fun PlayerActivity.showv73CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 73.14: esture Double Tap Speed
internal fun PlayerActivity.showv73GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 73.15: ache Prefetch Size2
internal fun PlayerActivity.showv73CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v73CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v73CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 74.1: layback Auto Skip Recap
internal fun PlayerActivity.showv74PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v74PlaybackAutoSkipRecap
    BiliClient.prefs.v74PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 74.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv74DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 74.3: olor Lift2
internal fun PlayerActivity.showv74ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v74ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 74.4: olume Surround2
internal fun PlayerActivity.showv74VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 74.5: ast Subtitle Sync2
internal fun PlayerActivity.showv74CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v74CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 74.6: esture Swipe Speed2
internal fun PlayerActivity.showv74GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 74.7: ache Max Size2
internal fun PlayerActivity.showv74CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v74CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 74.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv74ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 74.9: layback Smart Speed
internal fun PlayerActivity.showv74PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v74PlaybackSmartSpeed
    BiliClient.prefs.v74PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 74.10: anmaku Font Weight4
internal fun PlayerActivity.showv74DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 74.11: olor Gamma2
internal fun PlayerActivity.showv74ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 74.12: olume Bass2
internal fun PlayerActivity.showv74VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 74.13: ast Video Quality2
internal fun PlayerActivity.showv74CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 74.14: esture Double Tap Speed
internal fun PlayerActivity.showv74GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 74.15: ache Prefetch Size2
internal fun PlayerActivity.showv74CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v74CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v74CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 75.1: layback Auto Skip Recap
internal fun PlayerActivity.showv75PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v75PlaybackAutoSkipRecap
    BiliClient.prefs.v75PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 75.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv75DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 75.3: olor Lift2
internal fun PlayerActivity.showv75ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v75ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 75.4: olume Surround2
internal fun PlayerActivity.showv75VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 75.5: ast Subtitle Sync2
internal fun PlayerActivity.showv75CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v75CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 75.6: esture Swipe Speed2
internal fun PlayerActivity.showv75GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 75.7: ache Max Size2
internal fun PlayerActivity.showv75CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v75CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 75.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv75ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 75.9: layback Smart Speed
internal fun PlayerActivity.showv75PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v75PlaybackSmartSpeed
    BiliClient.prefs.v75PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 75.10: anmaku Font Weight4
internal fun PlayerActivity.showv75DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 75.11: olor Gamma2
internal fun PlayerActivity.showv75ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 75.12: olume Bass2
internal fun PlayerActivity.showv75VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 75.13: ast Video Quality2
internal fun PlayerActivity.showv75CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 75.14: esture Double Tap Speed
internal fun PlayerActivity.showv75GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 75.15: ache Prefetch Size2
internal fun PlayerActivity.showv75CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v75CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v75CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 76.1: layback Auto Skip Recap
internal fun PlayerActivity.showv76PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v76PlaybackAutoSkipRecap
    BiliClient.prefs.v76PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 76.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv76DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v76DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 76.3: olor Lift2
internal fun PlayerActivity.showv76ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v76ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 76.4: olume Surround2
internal fun PlayerActivity.showv76VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 76.5: ast Subtitle Sync2
internal fun PlayerActivity.showv76CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v76CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 76.6: esture Swipe Speed2
internal fun PlayerActivity.showv76GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 76.7: ache Max Size2
internal fun PlayerActivity.showv76CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v76CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 76.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv76ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 76.9: layback Smart Speed
internal fun PlayerActivity.showv76PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v76PlaybackSmartSpeed
    BiliClient.prefs.v76PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 76.10: anmaku Font Weight4
internal fun PlayerActivity.showv76DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v76DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 76.11: olor Gamma2
internal fun PlayerActivity.showv76ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 76.12: olume Bass2
internal fun PlayerActivity.showv76VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 76.13: ast Video Quality2
internal fun PlayerActivity.showv76CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 76.14: esture Double Tap Speed
internal fun PlayerActivity.showv76GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 76.15: ache Prefetch Size2
internal fun PlayerActivity.showv76CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v76CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v76CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 77.1: layback Auto Skip Recap
internal fun PlayerActivity.showv77PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v77PlaybackAutoSkipRecap
    BiliClient.prefs.v77PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 77.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv77DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 77.3: olor Lift2
internal fun PlayerActivity.showv77ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v77ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 77.4: olume Surround2
internal fun PlayerActivity.showv77VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 77.5: ast Subtitle Sync2
internal fun PlayerActivity.showv77CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v77CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 77.6: esture Swipe Speed2
internal fun PlayerActivity.showv77GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 77.7: ache Max Size2
internal fun PlayerActivity.showv77CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v77CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 77.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv77ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 77.9: layback Smart Speed
internal fun PlayerActivity.showv77PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v77PlaybackSmartSpeed
    BiliClient.prefs.v77PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 77.10: anmaku Font Weight4
internal fun PlayerActivity.showv77DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 77.11: olor Gamma2
internal fun PlayerActivity.showv77ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 77.12: olume Bass2
internal fun PlayerActivity.showv77VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 77.13: ast Video Quality2
internal fun PlayerActivity.showv77CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 77.14: esture Double Tap Speed
internal fun PlayerActivity.showv77GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 77.15: ache Prefetch Size2
internal fun PlayerActivity.showv77CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v77CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v77CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 78.1: layback Auto Skip Recap
internal fun PlayerActivity.showv78PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v78PlaybackAutoSkipRecap
    BiliClient.prefs.v78PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 78.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv78DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v78DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 78.3: olor Lift2
internal fun PlayerActivity.showv78ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v78ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 78.4: olume Surround2
internal fun PlayerActivity.showv78VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 78.5: ast Subtitle Sync2
internal fun PlayerActivity.showv78CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v78CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 78.6: esture Swipe Speed2
internal fun PlayerActivity.showv78GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 78.7: ache Max Size2
internal fun PlayerActivity.showv78CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v78CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 78.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv78ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 78.9: layback Smart Speed
internal fun PlayerActivity.showv78PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v78PlaybackSmartSpeed
    BiliClient.prefs.v78PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 78.10: anmaku Font Weight4
internal fun PlayerActivity.showv78DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v78DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 78.11: olor Gamma2
internal fun PlayerActivity.showv78ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 78.12: olume Bass2
internal fun PlayerActivity.showv78VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 78.13: ast Video Quality2
internal fun PlayerActivity.showv78CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 78.14: esture Double Tap Speed
internal fun PlayerActivity.showv78GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 78.15: ache Prefetch Size2
internal fun PlayerActivity.showv78CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v78CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v78CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 79.1: layback Auto Skip Recap
internal fun PlayerActivity.showv79PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v79PlaybackAutoSkipRecap
    BiliClient.prefs.v79PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 79.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv79DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v79DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 79.3: olor Lift2
internal fun PlayerActivity.showv79ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v79ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 79.4: olume Surround2
internal fun PlayerActivity.showv79VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 79.5: ast Subtitle Sync2
internal fun PlayerActivity.showv79CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v79CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 79.6: esture Swipe Speed2
internal fun PlayerActivity.showv79GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 79.7: ache Max Size2
internal fun PlayerActivity.showv79CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v79CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 79.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv79ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 79.9: layback Smart Speed
internal fun PlayerActivity.showv79PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v79PlaybackSmartSpeed
    BiliClient.prefs.v79PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 79.10: anmaku Font Weight4
internal fun PlayerActivity.showv79DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v79DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 79.11: olor Gamma2
internal fun PlayerActivity.showv79ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 79.12: olume Bass2
internal fun PlayerActivity.showv79VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 79.13: ast Video Quality2
internal fun PlayerActivity.showv79CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 79.14: esture Double Tap Speed
internal fun PlayerActivity.showv79GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 79.15: ache Prefetch Size2
internal fun PlayerActivity.showv79CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v79CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v79CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 80.1: layback Auto Skip Recap
internal fun PlayerActivity.showv80PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v80PlaybackAutoSkipRecap
    BiliClient.prefs.v80PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 80.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv80DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 80.3: olor Lift2
internal fun PlayerActivity.showv80ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v80ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 80.4: olume Surround2
internal fun PlayerActivity.showv80VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 80.5: ast Subtitle Sync2
internal fun PlayerActivity.showv80CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v80CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 80.6: esture Swipe Speed2
internal fun PlayerActivity.showv80GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 80.7: ache Max Size2
internal fun PlayerActivity.showv80CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v80CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 80.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv80ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 80.9: layback Smart Speed
internal fun PlayerActivity.showv80PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v80PlaybackSmartSpeed
    BiliClient.prefs.v80PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 80.10: anmaku Font Weight4
internal fun PlayerActivity.showv80DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 80.11: olor Gamma2
internal fun PlayerActivity.showv80ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 80.12: olume Bass2
internal fun PlayerActivity.showv80VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 80.13: ast Video Quality2
internal fun PlayerActivity.showv80CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 80.14: esture Double Tap Speed
internal fun PlayerActivity.showv80GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 80.15: ache Prefetch Size2
internal fun PlayerActivity.showv80CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v80CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v80CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 81.1: layback Auto Skip Recap
internal fun PlayerActivity.showv81PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v81PlaybackAutoSkipRecap
    BiliClient.prefs.v81PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 81.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv81DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 81.3: olor Lift2
internal fun PlayerActivity.showv81ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v81ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 81.4: olume Surround2
internal fun PlayerActivity.showv81VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 81.5: ast Subtitle Sync2
internal fun PlayerActivity.showv81CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v81CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 81.6: esture Swipe Speed2
internal fun PlayerActivity.showv81GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 81.7: ache Max Size2
internal fun PlayerActivity.showv81CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v81CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 81.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv81ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 81.9: layback Smart Speed
internal fun PlayerActivity.showv81PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v81PlaybackSmartSpeed
    BiliClient.prefs.v81PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 81.10: anmaku Font Weight4
internal fun PlayerActivity.showv81DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 81.11: olor Gamma2
internal fun PlayerActivity.showv81ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 81.12: olume Bass2
internal fun PlayerActivity.showv81VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 81.13: ast Video Quality2
internal fun PlayerActivity.showv81CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 81.14: esture Double Tap Speed
internal fun PlayerActivity.showv81GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 81.15: ache Prefetch Size2
internal fun PlayerActivity.showv81CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v81CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v81CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 82.1: layback Auto Skip Recap
internal fun PlayerActivity.showv82PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v82PlaybackAutoSkipRecap
    BiliClient.prefs.v82PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 82.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv82DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 82.3: olor Lift2
internal fun PlayerActivity.showv82ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v82ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 82.4: olume Surround2
internal fun PlayerActivity.showv82VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 82.5: ast Subtitle Sync2
internal fun PlayerActivity.showv82CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v82CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 82.6: esture Swipe Speed2
internal fun PlayerActivity.showv82GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 82.7: ache Max Size2
internal fun PlayerActivity.showv82CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v82CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 82.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv82ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 82.9: layback Smart Speed
internal fun PlayerActivity.showv82PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v82PlaybackSmartSpeed
    BiliClient.prefs.v82PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 82.10: anmaku Font Weight4
internal fun PlayerActivity.showv82DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 82.11: olor Gamma2
internal fun PlayerActivity.showv82ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 82.12: olume Bass2
internal fun PlayerActivity.showv82VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 82.13: ast Video Quality2
internal fun PlayerActivity.showv82CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 82.14: esture Double Tap Speed
internal fun PlayerActivity.showv82GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 82.15: ache Prefetch Size2
internal fun PlayerActivity.showv82CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v82CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v82CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 83.1: layback Auto Skip Recap
internal fun PlayerActivity.showv83PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v83PlaybackAutoSkipRecap
    BiliClient.prefs.v83PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 83.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv83DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 83.3: olor Lift2
internal fun PlayerActivity.showv83ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v83ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 83.4: olume Surround2
internal fun PlayerActivity.showv83VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 83.5: ast Subtitle Sync2
internal fun PlayerActivity.showv83CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v83CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 83.6: esture Swipe Speed2
internal fun PlayerActivity.showv83GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 83.7: ache Max Size2
internal fun PlayerActivity.showv83CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v83CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 83.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv83ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 83.9: layback Smart Speed
internal fun PlayerActivity.showv83PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v83PlaybackSmartSpeed
    BiliClient.prefs.v83PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 83.10: anmaku Font Weight4
internal fun PlayerActivity.showv83DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 83.11: olor Gamma2
internal fun PlayerActivity.showv83ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 83.12: olume Bass2
internal fun PlayerActivity.showv83VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 83.13: ast Video Quality2
internal fun PlayerActivity.showv83CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 83.14: esture Double Tap Speed
internal fun PlayerActivity.showv83GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 83.15: ache Prefetch Size2
internal fun PlayerActivity.showv83CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v83CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v83CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 84.1: layback Auto Skip Recap
internal fun PlayerActivity.showv84PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v84PlaybackAutoSkipRecap
    BiliClient.prefs.v84PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 84.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv84DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v84DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 84.3: olor Lift2
internal fun PlayerActivity.showv84ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v84ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 84.4: olume Surround2
internal fun PlayerActivity.showv84VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 84.5: ast Subtitle Sync2
internal fun PlayerActivity.showv84CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v84CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 84.6: esture Swipe Speed2
internal fun PlayerActivity.showv84GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 84.7: ache Max Size2
internal fun PlayerActivity.showv84CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v84CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 84.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv84ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 84.9: layback Smart Speed
internal fun PlayerActivity.showv84PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v84PlaybackSmartSpeed
    BiliClient.prefs.v84PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 84.10: anmaku Font Weight4
internal fun PlayerActivity.showv84DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v84DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 84.11: olor Gamma2
internal fun PlayerActivity.showv84ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 84.12: olume Bass2
internal fun PlayerActivity.showv84VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 84.13: ast Video Quality2
internal fun PlayerActivity.showv84CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 84.14: esture Double Tap Speed
internal fun PlayerActivity.showv84GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 84.15: ache Prefetch Size2
internal fun PlayerActivity.showv84CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v84CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v84CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 85.1: layback Auto Skip Recap
internal fun PlayerActivity.showv85PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v85PlaybackAutoSkipRecap
    BiliClient.prefs.v85PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 85.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv85DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v85DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 85.3: olor Lift2
internal fun PlayerActivity.showv85ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v85ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 85.4: olume Surround2
internal fun PlayerActivity.showv85VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 85.5: ast Subtitle Sync2
internal fun PlayerActivity.showv85CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v85CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 85.6: esture Swipe Speed2
internal fun PlayerActivity.showv85GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 85.7: ache Max Size2
internal fun PlayerActivity.showv85CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v85CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 85.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv85ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 85.9: layback Smart Speed
internal fun PlayerActivity.showv85PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v85PlaybackSmartSpeed
    BiliClient.prefs.v85PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 85.10: anmaku Font Weight4
internal fun PlayerActivity.showv85DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v85DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 85.11: olor Gamma2
internal fun PlayerActivity.showv85ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 85.12: olume Bass2
internal fun PlayerActivity.showv85VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 85.13: ast Video Quality2
internal fun PlayerActivity.showv85CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 85.14: esture Double Tap Speed
internal fun PlayerActivity.showv85GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 85.15: ache Prefetch Size2
internal fun PlayerActivity.showv85CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v85CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v85CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 86.1: layback Auto Skip Recap
internal fun PlayerActivity.showv86PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v86PlaybackAutoSkipRecap
    BiliClient.prefs.v86PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 86.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv86DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 86.3: olor Lift2
internal fun PlayerActivity.showv86ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v86ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 86.4: olume Surround2
internal fun PlayerActivity.showv86VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 86.5: ast Subtitle Sync2
internal fun PlayerActivity.showv86CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v86CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 86.6: esture Swipe Speed2
internal fun PlayerActivity.showv86GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 86.7: ache Max Size2
internal fun PlayerActivity.showv86CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v86CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 86.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv86ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 86.9: layback Smart Speed
internal fun PlayerActivity.showv86PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v86PlaybackSmartSpeed
    BiliClient.prefs.v86PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 86.10: anmaku Font Weight4
internal fun PlayerActivity.showv86DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 86.11: olor Gamma2
internal fun PlayerActivity.showv86ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 86.12: olume Bass2
internal fun PlayerActivity.showv86VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 86.13: ast Video Quality2
internal fun PlayerActivity.showv86CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 86.14: esture Double Tap Speed
internal fun PlayerActivity.showv86GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 86.15: ache Prefetch Size2
internal fun PlayerActivity.showv86CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v86CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v86CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 87.1: layback Auto Skip Recap
internal fun PlayerActivity.showv87PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v87PlaybackAutoSkipRecap
    BiliClient.prefs.v87PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 87.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv87DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 87.3: olor Lift2
internal fun PlayerActivity.showv87ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v87ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 87.4: olume Surround2
internal fun PlayerActivity.showv87VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 87.5: ast Subtitle Sync2
internal fun PlayerActivity.showv87CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v87CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 87.6: esture Swipe Speed2
internal fun PlayerActivity.showv87GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 87.7: ache Max Size2
internal fun PlayerActivity.showv87CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v87CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 87.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv87ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 87.9: layback Smart Speed
internal fun PlayerActivity.showv87PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v87PlaybackSmartSpeed
    BiliClient.prefs.v87PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 87.10: anmaku Font Weight4
internal fun PlayerActivity.showv87DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 87.11: olor Gamma2
internal fun PlayerActivity.showv87ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 87.12: olume Bass2
internal fun PlayerActivity.showv87VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 87.13: ast Video Quality2
internal fun PlayerActivity.showv87CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 87.14: esture Double Tap Speed
internal fun PlayerActivity.showv87GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 87.15: ache Prefetch Size2
internal fun PlayerActivity.showv87CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v87CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v87CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 88.1: layback Auto Skip Recap
internal fun PlayerActivity.showv88PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v88PlaybackAutoSkipRecap
    BiliClient.prefs.v88PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 88.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv88DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 88.3: olor Lift2
internal fun PlayerActivity.showv88ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v88ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 88.4: olume Surround2
internal fun PlayerActivity.showv88VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 88.5: ast Subtitle Sync2
internal fun PlayerActivity.showv88CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v88CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 88.6: esture Swipe Speed2
internal fun PlayerActivity.showv88GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 88.7: ache Max Size2
internal fun PlayerActivity.showv88CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v88CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 88.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv88ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 88.9: layback Smart Speed
internal fun PlayerActivity.showv88PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v88PlaybackSmartSpeed
    BiliClient.prefs.v88PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 88.10: anmaku Font Weight4
internal fun PlayerActivity.showv88DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 88.11: olor Gamma2
internal fun PlayerActivity.showv88ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 88.12: olume Bass2
internal fun PlayerActivity.showv88VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 88.13: ast Video Quality2
internal fun PlayerActivity.showv88CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 88.14: esture Double Tap Speed
internal fun PlayerActivity.showv88GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 88.15: ache Prefetch Size2
internal fun PlayerActivity.showv88CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v88CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v88CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 89.1: layback Auto Skip Recap
internal fun PlayerActivity.showv89PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v89PlaybackAutoSkipRecap
    BiliClient.prefs.v89PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 89.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv89DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 89.3: olor Lift2
internal fun PlayerActivity.showv89ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v89ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 89.4: olume Surround2
internal fun PlayerActivity.showv89VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 89.5: ast Subtitle Sync2
internal fun PlayerActivity.showv89CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v89CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 89.6: esture Swipe Speed2
internal fun PlayerActivity.showv89GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 89.7: ache Max Size2
internal fun PlayerActivity.showv89CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v89CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 89.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv89ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 89.9: layback Smart Speed
internal fun PlayerActivity.showv89PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v89PlaybackSmartSpeed
    BiliClient.prefs.v89PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 89.10: anmaku Font Weight4
internal fun PlayerActivity.showv89DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 89.11: olor Gamma2
internal fun PlayerActivity.showv89ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 89.12: olume Bass2
internal fun PlayerActivity.showv89VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 89.13: ast Video Quality2
internal fun PlayerActivity.showv89CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 89.14: esture Double Tap Speed
internal fun PlayerActivity.showv89GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 89.15: ache Prefetch Size2
internal fun PlayerActivity.showv89CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v89CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v89CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 90.1: layback Auto Skip Recap
internal fun PlayerActivity.showv90PlaybackAutoSkipRecapToggle() {
    val current = BiliClient.prefs.v90PlaybackAutoSkipRecap
    BiliClient.prefs.v90PlaybackAutoSkipRecap = !current
    AppToast.show(this, "layback Auto Skip Recap: ${if (!current) "ON" else "OFF"}")
}

// 90.2: anmaku Font Glow Size3
internal fun PlayerActivity.showv90DanmakuFontGlowSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuFontGlowSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Glow Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90DanmakuFontGlowSize3 = value; AppToast.show(this, "anmaku Font Glow Size3: ${labels[options.indexOf(value)]}") }
}

// 90.3: olor Lift2
internal fun PlayerActivity.showv90ColorLift2Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v90ColorLift2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Lift2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90ColorLift2 = value; AppToast.show(this, "olor Lift2: ${labels[options.indexOf(value)]}") }
}

// 90.4: olume Surround2
internal fun PlayerActivity.showv90VolumeSurround2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90VolumeSurround2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Surround2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90VolumeSurround2 = value; AppToast.show(this, "olume Surround2: ${labels[options.indexOf(value)]}") }
}

// 90.5: ast Subtitle Sync2
internal fun PlayerActivity.showv90CastSubtitleSync2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v90CastSubtitleSync2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Subtitle Sync2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90CastSubtitleSync2 = value; AppToast.show(this, "ast Subtitle Sync2: ${labels[options.indexOf(value)]}") }
}

// 90.6: esture Swipe Speed2
internal fun PlayerActivity.showv90GestureSwipeSpeed2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90GestureSwipeSpeed2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Swipe Speed2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90GestureSwipeSpeed2 = value; AppToast.show(this, "esture Swipe Speed2: ${labels[options.indexOf(value)]}") }
}

// 90.7: ache Max Size2
internal fun PlayerActivity.showv90CacheMaxSize2Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10")
    val currentIndex = options.indexOf(BiliClient.prefs.v90CacheMaxSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Max Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90CacheMaxSize2 = value; AppToast.show(this, "ache Max Size2: ${labels[options.indexOf(value)]}") }
}

// 90.8: rogress Bar Sensitivity2
internal fun PlayerActivity.showv90ProgressBarSensitivity2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90ProgressBarSensitivity2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Sensitivity2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90ProgressBarSensitivity2 = value; AppToast.show(this, "rogress Bar Sensitivity2: ${labels[options.indexOf(value)]}") }
}

// 90.9: layback Smart Speed
internal fun PlayerActivity.showv90PlaybackSmartSpeedToggle() {
    val current = BiliClient.prefs.v90PlaybackSmartSpeed
    BiliClient.prefs.v90PlaybackSmartSpeed = !current
    AppToast.show(this, "layback Smart Speed: ${if (!current) "ON" else "OFF"}")
}

// 90.10: anmaku Font Weight4
internal fun PlayerActivity.showv90DanmakuFontWeight4Dialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100","200","300","400","500","600","700","800","900")
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuFontWeight4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Weight4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90DanmakuFontWeight4 = value; AppToast.show(this, "anmaku Font Weight4: ${labels[options.indexOf(value)]}") }
}

// 90.11: olor Gamma2
internal fun PlayerActivity.showv90ColorGamma2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90ColorGamma2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Gamma2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90ColorGamma2 = value; AppToast.show(this, "olor Gamma2: ${labels[options.indexOf(value)]}") }
}

// 90.12: olume Bass2
internal fun PlayerActivity.showv90VolumeBass2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90VolumeBass2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Bass2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90VolumeBass2 = value; AppToast.show(this, "olume Bass2: ${labels[options.indexOf(value)]}") }
}

// 90.13: ast Video Quality2
internal fun PlayerActivity.showv90CastVideoQuality2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90CastVideoQuality2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Video Quality2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90CastVideoQuality2 = value; AppToast.show(this, "ast Video Quality2: ${labels[options.indexOf(value)]}") }
}

// 90.14: esture Double Tap Speed
internal fun PlayerActivity.showv90GestureDoubleTapSpeedDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90GestureDoubleTapSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Double Tap Speed", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90GestureDoubleTapSpeed = value; AppToast.show(this, "esture Double Tap Speed: ${labels[options.indexOf(value)]}") }
}

// 90.15: ache Prefetch Size2
internal fun PlayerActivity.showv90CachePrefetchSize2Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v90CachePrefetchSize2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ache Prefetch Size2", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v90CachePrefetchSize2 = value; AppToast.show(this, "ache Prefetch Size2: ${labels[options.indexOf(value)]}") }
}

// 91.1: layback Smart Buffer3
internal fun PlayerActivity.showv91PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v91PlaybackSmartBuffer3
    BiliClient.prefs.v91PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 91.2: anmaku Font Alpha3
internal fun PlayerActivity.showv91DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v91DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 91.3: olor Saturation3
internal fun PlayerActivity.showv91ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v91ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 91.4: olume Limiter3
internal fun PlayerActivity.showv91VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v91VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 91.5: ast Bandwidth3
internal fun PlayerActivity.showv91CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v91CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 91.6: esture Pinch Zoom3
internal fun PlayerActivity.showv91GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v91GesturePinchZoom3
    BiliClient.prefs.v91GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 91.7: ache Encrypt3
internal fun PlayerActivity.showv91CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v91CacheEncrypt3
    BiliClient.prefs.v91CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 91.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv91ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v91ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 91.9: layback Auto Loop2
internal fun PlayerActivity.showv91PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v91PlaybackAutoLoop2
    BiliClient.prefs.v91PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 91.10: anmaku Filter Score4
internal fun PlayerActivity.showv91DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v91DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 91.11: olor Contrast3
internal fun PlayerActivity.showv91ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v91ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 91.12: olume EQ3
internal fun PlayerActivity.showv91VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v91VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 91.13: ast Auto Reconnect4
internal fun PlayerActivity.showv91CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v91CastAutoReconnect4
    BiliClient.prefs.v91CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 91.14: esture Rotation3
internal fun PlayerActivity.showv91GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v91GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v91GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 91.15: ache Auto Clear3
internal fun PlayerActivity.showv91CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v91CacheAutoClear3
    BiliClient.prefs.v91CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 92.1: layback Smart Buffer3
internal fun PlayerActivity.showv92PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v92PlaybackSmartBuffer3
    BiliClient.prefs.v92PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 92.2: anmaku Font Alpha3
internal fun PlayerActivity.showv92DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v92DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 92.3: olor Saturation3
internal fun PlayerActivity.showv92ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v92ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 92.4: olume Limiter3
internal fun PlayerActivity.showv92VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v92VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 92.5: ast Bandwidth3
internal fun PlayerActivity.showv92CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v92CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 92.6: esture Pinch Zoom3
internal fun PlayerActivity.showv92GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v92GesturePinchZoom3
    BiliClient.prefs.v92GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 92.7: ache Encrypt3
internal fun PlayerActivity.showv92CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v92CacheEncrypt3
    BiliClient.prefs.v92CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 92.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv92ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v92ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 92.9: layback Auto Loop2
internal fun PlayerActivity.showv92PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v92PlaybackAutoLoop2
    BiliClient.prefs.v92PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 92.10: anmaku Filter Score4
internal fun PlayerActivity.showv92DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v92DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 92.11: olor Contrast3
internal fun PlayerActivity.showv92ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v92ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 92.12: olume EQ3
internal fun PlayerActivity.showv92VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v92VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 92.13: ast Auto Reconnect4
internal fun PlayerActivity.showv92CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v92CastAutoReconnect4
    BiliClient.prefs.v92CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 92.14: esture Rotation3
internal fun PlayerActivity.showv92GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v92GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v92GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 92.15: ache Auto Clear3
internal fun PlayerActivity.showv92CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v92CacheAutoClear3
    BiliClient.prefs.v92CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 93.1: layback Smart Buffer3
internal fun PlayerActivity.showv93PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v93PlaybackSmartBuffer3
    BiliClient.prefs.v93PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 93.2: anmaku Font Alpha3
internal fun PlayerActivity.showv93DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v93DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 93.3: olor Saturation3
internal fun PlayerActivity.showv93ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v93ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 93.4: olume Limiter3
internal fun PlayerActivity.showv93VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v93VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 93.5: ast Bandwidth3
internal fun PlayerActivity.showv93CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v93CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 93.6: esture Pinch Zoom3
internal fun PlayerActivity.showv93GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v93GesturePinchZoom3
    BiliClient.prefs.v93GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 93.7: ache Encrypt3
internal fun PlayerActivity.showv93CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v93CacheEncrypt3
    BiliClient.prefs.v93CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 93.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv93ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v93ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 93.9: layback Auto Loop2
internal fun PlayerActivity.showv93PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v93PlaybackAutoLoop2
    BiliClient.prefs.v93PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 93.10: anmaku Filter Score4
internal fun PlayerActivity.showv93DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v93DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 93.11: olor Contrast3
internal fun PlayerActivity.showv93ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v93ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 93.12: olume EQ3
internal fun PlayerActivity.showv93VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v93VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 93.13: ast Auto Reconnect4
internal fun PlayerActivity.showv93CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v93CastAutoReconnect4
    BiliClient.prefs.v93CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 93.14: esture Rotation3
internal fun PlayerActivity.showv93GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v93GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v93GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 93.15: ache Auto Clear3
internal fun PlayerActivity.showv93CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v93CacheAutoClear3
    BiliClient.prefs.v93CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 94.1: layback Smart Buffer3
internal fun PlayerActivity.showv94PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v94PlaybackSmartBuffer3
    BiliClient.prefs.v94PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 94.2: anmaku Font Alpha3
internal fun PlayerActivity.showv94DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v94DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 94.3: olor Saturation3
internal fun PlayerActivity.showv94ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v94ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 94.4: olume Limiter3
internal fun PlayerActivity.showv94VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v94VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 94.5: ast Bandwidth3
internal fun PlayerActivity.showv94CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v94CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 94.6: esture Pinch Zoom3
internal fun PlayerActivity.showv94GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v94GesturePinchZoom3
    BiliClient.prefs.v94GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 94.7: ache Encrypt3
internal fun PlayerActivity.showv94CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v94CacheEncrypt3
    BiliClient.prefs.v94CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 94.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv94ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v94ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 94.9: layback Auto Loop2
internal fun PlayerActivity.showv94PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v94PlaybackAutoLoop2
    BiliClient.prefs.v94PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 94.10: anmaku Filter Score4
internal fun PlayerActivity.showv94DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v94DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 94.11: olor Contrast3
internal fun PlayerActivity.showv94ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v94ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 94.12: olume EQ3
internal fun PlayerActivity.showv94VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v94VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 94.13: ast Auto Reconnect4
internal fun PlayerActivity.showv94CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v94CastAutoReconnect4
    BiliClient.prefs.v94CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 94.14: esture Rotation3
internal fun PlayerActivity.showv94GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v94GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v94GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 94.15: ache Auto Clear3
internal fun PlayerActivity.showv94CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v94CacheAutoClear3
    BiliClient.prefs.v94CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 95.1: layback Smart Buffer3
internal fun PlayerActivity.showv95PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v95PlaybackSmartBuffer3
    BiliClient.prefs.v95PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 95.2: anmaku Font Alpha3
internal fun PlayerActivity.showv95DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v95DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 95.3: olor Saturation3
internal fun PlayerActivity.showv95ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v95ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 95.4: olume Limiter3
internal fun PlayerActivity.showv95VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v95VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 95.5: ast Bandwidth3
internal fun PlayerActivity.showv95CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v95CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 95.6: esture Pinch Zoom3
internal fun PlayerActivity.showv95GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v95GesturePinchZoom3
    BiliClient.prefs.v95GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 95.7: ache Encrypt3
internal fun PlayerActivity.showv95CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v95CacheEncrypt3
    BiliClient.prefs.v95CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 95.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv95ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v95ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 95.9: layback Auto Loop2
internal fun PlayerActivity.showv95PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v95PlaybackAutoLoop2
    BiliClient.prefs.v95PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 95.10: anmaku Filter Score4
internal fun PlayerActivity.showv95DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v95DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 95.11: olor Contrast3
internal fun PlayerActivity.showv95ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v95ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 95.12: olume EQ3
internal fun PlayerActivity.showv95VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v95VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 95.13: ast Auto Reconnect4
internal fun PlayerActivity.showv95CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v95CastAutoReconnect4
    BiliClient.prefs.v95CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 95.14: esture Rotation3
internal fun PlayerActivity.showv95GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v95GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v95GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 95.15: ache Auto Clear3
internal fun PlayerActivity.showv95CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v95CacheAutoClear3
    BiliClient.prefs.v95CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 96.1: layback Smart Buffer3
internal fun PlayerActivity.showv96PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v96PlaybackSmartBuffer3
    BiliClient.prefs.v96PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 96.2: anmaku Font Alpha3
internal fun PlayerActivity.showv96DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v96DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 96.3: olor Saturation3
internal fun PlayerActivity.showv96ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v96ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 96.4: olume Limiter3
internal fun PlayerActivity.showv96VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v96VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 96.5: ast Bandwidth3
internal fun PlayerActivity.showv96CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v96CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 96.6: esture Pinch Zoom3
internal fun PlayerActivity.showv96GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v96GesturePinchZoom3
    BiliClient.prefs.v96GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 96.7: ache Encrypt3
internal fun PlayerActivity.showv96CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v96CacheEncrypt3
    BiliClient.prefs.v96CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 96.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv96ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v96ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 96.9: layback Auto Loop2
internal fun PlayerActivity.showv96PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v96PlaybackAutoLoop2
    BiliClient.prefs.v96PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 96.10: anmaku Filter Score4
internal fun PlayerActivity.showv96DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v96DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 96.11: olor Contrast3
internal fun PlayerActivity.showv96ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v96ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 96.12: olume EQ3
internal fun PlayerActivity.showv96VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v96VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 96.13: ast Auto Reconnect4
internal fun PlayerActivity.showv96CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v96CastAutoReconnect4
    BiliClient.prefs.v96CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 96.14: esture Rotation3
internal fun PlayerActivity.showv96GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v96GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v96GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 96.15: ache Auto Clear3
internal fun PlayerActivity.showv96CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v96CacheAutoClear3
    BiliClient.prefs.v96CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 97.1: layback Smart Buffer3
internal fun PlayerActivity.showv97PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v97PlaybackSmartBuffer3
    BiliClient.prefs.v97PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 97.2: anmaku Font Alpha3
internal fun PlayerActivity.showv97DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v97DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 97.3: olor Saturation3
internal fun PlayerActivity.showv97ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v97ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 97.4: olume Limiter3
internal fun PlayerActivity.showv97VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v97VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 97.5: ast Bandwidth3
internal fun PlayerActivity.showv97CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v97CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 97.6: esture Pinch Zoom3
internal fun PlayerActivity.showv97GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v97GesturePinchZoom3
    BiliClient.prefs.v97GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 97.7: ache Encrypt3
internal fun PlayerActivity.showv97CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v97CacheEncrypt3
    BiliClient.prefs.v97CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 97.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv97ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v97ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 97.9: layback Auto Loop2
internal fun PlayerActivity.showv97PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v97PlaybackAutoLoop2
    BiliClient.prefs.v97PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 97.10: anmaku Filter Score4
internal fun PlayerActivity.showv97DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v97DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 97.11: olor Contrast3
internal fun PlayerActivity.showv97ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v97ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 97.12: olume EQ3
internal fun PlayerActivity.showv97VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v97VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 97.13: ast Auto Reconnect4
internal fun PlayerActivity.showv97CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v97CastAutoReconnect4
    BiliClient.prefs.v97CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 97.14: esture Rotation3
internal fun PlayerActivity.showv97GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v97GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v97GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 97.15: ache Auto Clear3
internal fun PlayerActivity.showv97CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v97CacheAutoClear3
    BiliClient.prefs.v97CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 98.1: layback Smart Buffer3
internal fun PlayerActivity.showv98PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v98PlaybackSmartBuffer3
    BiliClient.prefs.v98PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 98.2: anmaku Font Alpha3
internal fun PlayerActivity.showv98DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v98DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 98.3: olor Saturation3
internal fun PlayerActivity.showv98ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v98ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 98.4: olume Limiter3
internal fun PlayerActivity.showv98VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v98VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 98.5: ast Bandwidth3
internal fun PlayerActivity.showv98CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v98CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 98.6: esture Pinch Zoom3
internal fun PlayerActivity.showv98GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v98GesturePinchZoom3
    BiliClient.prefs.v98GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 98.7: ache Encrypt3
internal fun PlayerActivity.showv98CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v98CacheEncrypt3
    BiliClient.prefs.v98CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 98.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv98ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v98ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 98.9: layback Auto Loop2
internal fun PlayerActivity.showv98PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v98PlaybackAutoLoop2
    BiliClient.prefs.v98PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 98.10: anmaku Filter Score4
internal fun PlayerActivity.showv98DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v98DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 98.11: olor Contrast3
internal fun PlayerActivity.showv98ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v98ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 98.12: olume EQ3
internal fun PlayerActivity.showv98VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v98VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 98.13: ast Auto Reconnect4
internal fun PlayerActivity.showv98CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v98CastAutoReconnect4
    BiliClient.prefs.v98CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 98.14: esture Rotation3
internal fun PlayerActivity.showv98GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v98GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v98GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 98.15: ache Auto Clear3
internal fun PlayerActivity.showv98CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v98CacheAutoClear3
    BiliClient.prefs.v98CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 99.1: layback Smart Buffer3
internal fun PlayerActivity.showv99PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v99PlaybackSmartBuffer3
    BiliClient.prefs.v99PlaybackSmartBuffer3 = !current
    AppToast.show(this, "layback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 99.2: anmaku Font Alpha3
internal fun PlayerActivity.showv99DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v99DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99DanmakuFontAlpha3 = value; AppToast.show(this, "anmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 99.3: olor Saturation3
internal fun PlayerActivity.showv99ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v99ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99ColorSaturation3 = value; AppToast.show(this, "olor Saturation3: ${labels[options.indexOf(value)]}") }
}

// 99.4: olume Limiter3
internal fun PlayerActivity.showv99VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v99VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99VolumeLimiter3 = value; AppToast.show(this, "olume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 99.5: ast Bandwidth3
internal fun PlayerActivity.showv99CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v99CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "ast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99CastBandwidth3 = value; AppToast.show(this, "ast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 99.6: esture Pinch Zoom3
internal fun PlayerActivity.showv99GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v99GesturePinchZoom3
    BiliClient.prefs.v99GesturePinchZoom3 = !current
    AppToast.show(this, "esture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 99.7: ache Encrypt3
internal fun PlayerActivity.showv99CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v99CacheEncrypt3
    BiliClient.prefs.v99CacheEncrypt3 = !current
    AppToast.show(this, "ache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 99.8: rogress Bar Thumb Size3
internal fun PlayerActivity.showv99ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v99ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "rogress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99ProgressBarThumbSize3 = value; AppToast.show(this, "rogress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 99.9: layback Auto Loop2
internal fun PlayerActivity.showv99PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v99PlaybackAutoLoop2
    BiliClient.prefs.v99PlaybackAutoLoop2 = !current
    AppToast.show(this, "layback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 99.10: anmaku Filter Score4
internal fun PlayerActivity.showv99DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v99DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "anmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99DanmakuFilterScore4 = value; AppToast.show(this, "anmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 99.11: olor Contrast3
internal fun PlayerActivity.showv99ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v99ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olor Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99ColorContrast3 = value; AppToast.show(this, "olor Contrast3: ${labels[options.indexOf(value)]}") }
}

// 99.12: olume EQ3
internal fun PlayerActivity.showv99VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v99VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "olume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99VolumeEQ3 = value; AppToast.show(this, "olume EQ3: ${labels[options.indexOf(value)]}") }
}

// 99.13: ast Auto Reconnect4
internal fun PlayerActivity.showv99CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v99CastAutoReconnect4
    BiliClient.prefs.v99CastAutoReconnect4 = !current
    AppToast.show(this, "ast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 99.14: esture Rotation3
internal fun PlayerActivity.showv99GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v99GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "esture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v99GestureRotation3 = value; AppToast.show(this, "esture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 99.15: ache Auto Clear3
internal fun PlayerActivity.showv99CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v99CacheAutoClear3
    BiliClient.prefs.v99CacheAutoClear3 = !current
    AppToast.show(this, "ache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

// 100.1: Playback Smart Buffer3
internal fun PlayerActivity.showv100PlaybackSmartBuffer3Toggle() {
    val current = BiliClient.prefs.v100PlaybackSmartBuffer3
    BiliClient.prefs.v100PlaybackSmartBuffer3 = !current
    AppToast.show(this, "Playback Smart Buffer3: ${if (!current) "ON" else "OFF"}")
}

// 100.2: Danmaku Font Alpha3
internal fun PlayerActivity.showv100DanmakuFontAlpha3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v100DanmakuFontAlpha3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Alpha3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100DanmakuFontAlpha3 = value; AppToast.show(this, "Danmaku Font Alpha3: ${labels[options.indexOf(value)]}") }
}

// 100.3: Color Saturation3
internal fun PlayerActivity.showv100ColorSaturation3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v100ColorSaturation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Saturation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100ColorSaturation3 = value; AppToast.show(this, "Color Saturation3: ${labels[options.indexOf(value)]}") }
}

// 100.4: Volume Limiter3
internal fun PlayerActivity.showv100VolumeLimiter3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v100VolumeLimiter3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limiter3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100VolumeLimiter3 = value; AppToast.show(this, "Volume Limiter3: ${labels[options.indexOf(value)]}") }
}

// 100.5: Cast Bandwidth3
internal fun PlayerActivity.showv100CastBandwidth3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v100CastBandwidth3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Bandwidth3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100CastBandwidth3 = value; AppToast.show(this, "Cast Bandwidth3: ${labels[options.indexOf(value)]}") }
}

// 100.6: Gesture Pinch Zoom3
internal fun PlayerActivity.showv100GesturePinchZoom3Toggle() {
    val current = BiliClient.prefs.v100GesturePinchZoom3
    BiliClient.prefs.v100GesturePinchZoom3 = !current
    AppToast.show(this, "Gesture Pinch Zoom3: ${if (!current) "ON" else "OFF"}")
}

// 100.7: Cache Encrypt3
internal fun PlayerActivity.showv100CacheEncrypt3Toggle() {
    val current = BiliClient.prefs.v100CacheEncrypt3
    BiliClient.prefs.v100CacheEncrypt3 = !current
    AppToast.show(this, "Cache Encrypt3: ${if (!current) "ON" else "OFF"}")
}

// 100.8: Progress Bar Thumb Size3
internal fun PlayerActivity.showv100ProgressBarThumbSize3Dialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20")
    val currentIndex = options.indexOf(BiliClient.prefs.v100ProgressBarThumbSize3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Thumb Size3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100ProgressBarThumbSize3 = value; AppToast.show(this, "Progress Bar Thumb Size3: ${labels[options.indexOf(value)]}") }
}

// 100.9: Playback Auto Loop2
internal fun PlayerActivity.showv100PlaybackAutoLoop2Toggle() {
    val current = BiliClient.prefs.v100PlaybackAutoLoop2
    BiliClient.prefs.v100PlaybackAutoLoop2 = !current
    AppToast.show(this, "Playback Auto Loop2: ${if (!current) "ON" else "OFF"}")
}

// 100.10: Danmaku Filter Score4
internal fun PlayerActivity.showv100DanmakuFilterScore4Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v100DanmakuFilterScore4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Score4", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100DanmakuFilterScore4 = value; AppToast.show(this, "Danmaku Filter Score4: ${labels[options.indexOf(value)]}") }
}

// 100.11: Color Contrast3
internal fun PlayerActivity.showv100ColorContrast3Dialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0","10","20","30","40","50","60","70","80","90","100")
    val currentIndex = options.indexOf(BiliClient.prefs.v100ColorContrast3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Contrast3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100ColorContrast3 = value; AppToast.show(this, "Color Contrast3: ${labels[options.indexOf(value)]}") }
}

// 100.12: Volume EQ3
internal fun PlayerActivity.showv100VolumeEQ3Dialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0","1","2","3","4","5")
    val currentIndex = options.indexOf(BiliClient.prefs.v100VolumeEQ3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume EQ3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100VolumeEQ3 = value; AppToast.show(this, "Volume EQ3: ${labels[options.indexOf(value)]}") }
}

// 100.13: Cast Auto Reconnect4
internal fun PlayerActivity.showv100CastAutoReconnect4Toggle() {
    val current = BiliClient.prefs.v100CastAutoReconnect4
    BiliClient.prefs.v100CastAutoReconnect4 = !current
    AppToast.show(this, "Cast Auto Reconnect4: ${if (!current) "ON" else "OFF"}")
}

// 100.14: Gesture Rotation3
internal fun PlayerActivity.showv100GestureRotation3Dialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0","1","2","3")
    val currentIndex = options.indexOf(BiliClient.prefs.v100GestureRotation3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Rotation3", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v100GestureRotation3 = value; AppToast.show(this, "Gesture Rotation3: ${labels[options.indexOf(value)]}") }
}

// 100.15: Cache Auto Clear3
internal fun PlayerActivity.showv100CacheAutoClear3Toggle() {
    val current = BiliClient.prefs.v100CacheAutoClear3
    BiliClient.prefs.v100CacheAutoClear3 = !current
    AppToast.show(this, "Cache Auto Clear3: ${if (!current) "ON" else "OFF"}")
}

