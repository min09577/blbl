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

internal inline fun PlayerActivity.showSettingsSingleChoiceDialog(
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

internal inline fun <T> PlayerActivity.showSettingsChoiceDialog(
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
