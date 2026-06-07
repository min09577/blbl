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


// 31.1: 弹幕重叠自动合并
internal fun PlayerActivity.showv31DanmakuMergeOverlapToggle() {
    val current = BiliClient.prefs.v31DanmakuMergeOverlap
    AppPopup.Builder(this)
        .title("弹幕重叠自动合并")
        .option(switchText(current)) { BiliClient.prefs.v31DanmakuMergeOverlap = !current }
        .show()
}
// 31.2: 静音片段自动跳过
internal fun PlayerActivity.showv31VideoFrameSkipSilenceToggle() {
    val current = BiliClient.prefs.v31VideoFrameSkipSilence
    AppPopup.Builder(this)
        .title("静音片段自动跳过")
        .option(switchText(current)) { BiliClient.prefs.v31VideoFrameSkipSilence = !current }
        .show()
}
// 31.3: 字幕字号自动适配
internal fun PlayerActivity.showv31SubtitleFontSizeAutoToggle() {
    val current = BiliClient.prefs.v31SubtitleFontSizeAuto
    AppPopup.Builder(this)
        .title("字幕字号自动适配")
        .option(switchText(current)) { BiliClient.prefs.v31SubtitleFontSizeAuto = !current }
        .show()
}
// 31.4: 预缓冲时长(秒)
internal fun PlayerActivity.showv31PlaybackBufferAheadSecDialog() {
    val current = BiliClient.prefs.v31PlaybackBufferAheadSec
    AppPopup.Builder(this)
        .title("预缓冲时长(秒)")
        .option("0") { BiliClient.prefs.v31PlaybackBufferAheadSec = 0 }
        .option("1") { BiliClient.prefs.v31PlaybackBufferAheadSec = 1 }
        .option("2") { BiliClient.prefs.v31PlaybackBufferAheadSec = 2 }
        .option("3") { BiliClient.prefs.v31PlaybackBufferAheadSec = 3 }
        .option("5") { BiliClient.prefs.v31PlaybackBufferAheadSec = 5 }
        .option("10") { BiliClient.prefs.v31PlaybackBufferAheadSec = 10 }
        .show()
}
// 31.5: 弹幕防刷等级
internal fun PlayerActivity.showv31DanmakuAntiSpamLevelDialog() {
    val current = BiliClient.prefs.v31DanmakuAntiSpamLevel
    AppPopup.Builder(this)
        .title("弹幕防刷等级")
        .option("0") { BiliClient.prefs.v31DanmakuAntiSpamLevel = 0 }
        .option("1") { BiliClient.prefs.v31DanmakuAntiSpamLevel = 1 }
        .option("2") { BiliClient.prefs.v31DanmakuAntiSpamLevel = 2 }
        .option("3") { BiliClient.prefs.v31DanmakuAntiSpamLevel = 3 }
        .option("5") { BiliClient.prefs.v31DanmakuAntiSpamLevel = 5 }
        .option("10") { BiliClient.prefs.v31DanmakuAntiSpamLevel = 10 }
        .show()
}
// 31.6: 视频反交错模式
internal fun PlayerActivity.showv31VideoDeinterlaceModeDialog() {
    val current = BiliClient.prefs.v31VideoDeinterlaceMode
    AppPopup.Builder(this)
        .title("视频反交错模式")
        .option("0") { BiliClient.prefs.v31VideoDeinterlaceMode = 0 }
        .option("1") { BiliClient.prefs.v31VideoDeinterlaceMode = 1 }
        .option("2") { BiliClient.prefs.v31VideoDeinterlaceMode = 2 }
        .option("3") { BiliClient.prefs.v31VideoDeinterlaceMode = 3 }
        .option("5") { BiliClient.prefs.v31VideoDeinterlaceMode = 5 }
        .option("10") { BiliClient.prefs.v31VideoDeinterlaceMode = 10 }
        .show()
}
// 31.7: 音频夜间模式
internal fun PlayerActivity.showv31AudioNightModeToggle() {
    val current = BiliClient.prefs.v31AudioNightMode
    AppPopup.Builder(this)
        .title("音频夜间模式")
        .option(switchText(current)) { BiliClient.prefs.v31AudioNightMode = !current }
        .show()
}
// 31.8: 弹幕关键词高亮
internal fun PlayerActivity.showv31DanmakuKeywordHighlightToggle() {
    val current = BiliClient.prefs.v31DanmakuKeywordHighlight
    AppPopup.Builder(this)
        .title("弹幕关键词高亮")
        .option(switchText(current)) { BiliClient.prefs.v31DanmakuKeywordHighlight = !current }
        .show()
}
// 31.9: 画中画模式支持
internal fun PlayerActivity.showv31PlayerPiPSupportToggle() {
    val current = BiliClient.prefs.v31PlayerPiPSupport
    AppPopup.Builder(this)
        .title("画中画模式支持")
        .option(switchText(current)) { BiliClient.prefs.v31PlayerPiPSupport = !current }
        .show()
}
// 31.10: A-B循环播放
internal fun PlayerActivity.showv31VideoABoopModeToggle() {
    val current = BiliClient.prefs.v31VideoABoopMode
    AppPopup.Builder(this)
        .title("A-B循环播放")
        .option(switchText(current)) { BiliClient.prefs.v31VideoABoopMode = !current }
        .show()
}
// 31.11: 弹幕层级排序
internal fun PlayerActivity.showv31DanmakuLayerOrderDialog() {
    val current = BiliClient.prefs.v31DanmakuLayerOrder
    AppPopup.Builder(this)
        .title("弹幕层级排序")
        .option("0") { BiliClient.prefs.v31DanmakuLayerOrder = 0 }
        .option("1") { BiliClient.prefs.v31DanmakuLayerOrder = 1 }
        .option("2") { BiliClient.prefs.v31DanmakuLayerOrder = 2 }
        .option("3") { BiliClient.prefs.v31DanmakuLayerOrder = 3 }
        .option("5") { BiliClient.prefs.v31DanmakuLayerOrder = 5 }
        .option("10") { BiliClient.prefs.v31DanmakuLayerOrder = 10 }
        .show()
}
// 31.12: 字幕同步偏移(ms)
internal fun PlayerActivity.showv31SubtitleSyncOffsetDialog() {
    val current = BiliClient.prefs.v31SubtitleSyncOffset
    AppPopup.Builder(this)
        .title("字幕同步偏移(ms)")
        .option("0") { BiliClient.prefs.v31SubtitleSyncOffset = 0 }
        .option("1") { BiliClient.prefs.v31SubtitleSyncOffset = 1 }
        .option("2") { BiliClient.prefs.v31SubtitleSyncOffset = 2 }
        .option("3") { BiliClient.prefs.v31SubtitleSyncOffset = 3 }
        .option("5") { BiliClient.prefs.v31SubtitleSyncOffset = 5 }
        .option("10") { BiliClient.prefs.v31SubtitleSyncOffset = 10 }
        .show()
}
// 31.13: 播放自动恢复
internal fun PlayerActivity.showv31PlaybackAutoResumeToggle() {
    val current = BiliClient.prefs.v31PlaybackAutoResume
    AppPopup.Builder(this)
        .title("播放自动恢复")
        .option(switchText(current)) { BiliClient.prefs.v31PlaybackAutoResume = !current }
        .show()
}
// 31.14: 弹幕屏蔽用户等级
internal fun PlayerActivity.showv31DanmakuBlockUserLevelDialog() {
    val current = BiliClient.prefs.v31DanmakuBlockUserLevel
    AppPopup.Builder(this)
        .title("弹幕屏蔽用户等级")
        .option("0") { BiliClient.prefs.v31DanmakuBlockUserLevel = 0 }
        .option("1") { BiliClient.prefs.v31DanmakuBlockUserLevel = 1 }
        .option("2") { BiliClient.prefs.v31DanmakuBlockUserLevel = 2 }
        .option("3") { BiliClient.prefs.v31DanmakuBlockUserLevel = 3 }
        .option("5") { BiliClient.prefs.v31DanmakuBlockUserLevel = 5 }
        .option("10") { BiliClient.prefs.v31DanmakuBlockUserLevel = 10 }
        .show()
}
// 31.15: 视频解码优先级
internal fun PlayerActivity.showv31VideoCodecPriorityDialog() {
    val current = BiliClient.prefs.v31VideoCodecPriority
    AppPopup.Builder(this)
        .title("视频解码优先级")
        .option("0") { BiliClient.prefs.v31VideoCodecPriority = 0 }
        .option("1") { BiliClient.prefs.v31VideoCodecPriority = 1 }
        .option("2") { BiliClient.prefs.v31VideoCodecPriority = 2 }
        .option("3") { BiliClient.prefs.v31VideoCodecPriority = 3 }
        .option("5") { BiliClient.prefs.v31VideoCodecPriority = 5 }
        .option("10") { BiliClient.prefs.v31VideoCodecPriority = 10 }
        .show()
}
// 32.1: 息屏定时器(分钟)
internal fun PlayerActivity.showv32ScreenOffTimerDialog() {
    val current = BiliClient.prefs.v32ScreenOffTimer
    AppPopup.Builder(this)
        .title("息屏定时器(分钟)")
        .option("0") { BiliClient.prefs.v32ScreenOffTimer = 0 }
        .option("1") { BiliClient.prefs.v32ScreenOffTimer = 1 }
        .option("2") { BiliClient.prefs.v32ScreenOffTimer = 2 }
        .option("3") { BiliClient.prefs.v32ScreenOffTimer = 3 }
        .option("5") { BiliClient.prefs.v32ScreenOffTimer = 5 }
        .option("10") { BiliClient.prefs.v32ScreenOffTimer = 10 }
        .show()
}
// 32.2: 弹幕雨模式
internal fun PlayerActivity.showv32DanmakuRainModeToggle() {
    val current = BiliClient.prefs.v32DanmakuRainMode
    AppPopup.Builder(this)
        .title("弹幕雨模式")
        .option(switchText(current)) { BiliClient.prefs.v32DanmakuRainMode = !current }
        .show()
}
// 32.3: 音频声道交换
internal fun PlayerActivity.showv32AudioChannelSwapToggle() {
    val current = BiliClient.prefs.v32AudioChannelSwap
    AppPopup.Builder(this)
        .title("音频声道交换")
        .option(switchText(current)) { BiliClient.prefs.v32AudioChannelSwap = !current }
        .show()
}
// 32.4: 视频缩放手势
internal fun PlayerActivity.showv32VideoZoomGestureToggle() {
    val current = BiliClient.prefs.v32VideoZoomGesture
    AppPopup.Builder(this)
        .title("视频缩放手势")
        .option(switchText(current)) { BiliClient.prefs.v32VideoZoomGesture = !current }
        .show()
}
// 32.5: 弹幕时间戳显示
internal fun PlayerActivity.showv32DanmakuTimestampDisplayToggle() {
    val current = BiliClient.prefs.v32DanmakuTimestampDisplay
    AppPopup.Builder(this)
        .title("弹幕时间戳显示")
        .option(switchText(current)) { BiliClient.prefs.v32DanmakuTimestampDisplay = !current }
        .show()
}
// 32.6: 自动移除已播放项
internal fun PlayerActivity.showv32PlaylistRemovePlayedToggle() {
    val current = BiliClient.prefs.v32PlaylistRemovePlayed
    AppPopup.Builder(this)
        .title("自动移除已播放项")
        .option(switchText(current)) { BiliClient.prefs.v32PlaylistRemovePlayed = !current }
        .show()
}
// 32.7: 后台播放
internal fun PlayerActivity.showv32PlayerBackgroundPlayToggle() {
    val current = BiliClient.prefs.v32PlayerBackgroundPlay
    AppPopup.Builder(this)
        .title("后台播放")
        .option(switchText(current)) { BiliClient.prefs.v32PlayerBackgroundPlay = !current }
        .show()
}
// 32.8: 双语字幕
internal fun PlayerActivity.showv32SubtitleDualLangToggle() {
    val current = BiliClient.prefs.v32SubtitleDualLang
    AppPopup.Builder(this)
        .title("双语字幕")
        .option(switchText(current)) { BiliClient.prefs.v32SubtitleDualLang = !current }
        .show()
}
// 32.9: 弹幕透明度渐隐
internal fun PlayerActivity.showv32DanmakuOpacityFadeToggle() {
    val current = BiliClient.prefs.v32DanmakuOpacityFade
    AppPopup.Builder(this)
        .title("弹幕透明度渐隐")
        .option(switchText(current)) { BiliClient.prefs.v32DanmakuOpacityFade = !current }
        .show()
}
// 32.10: 变速平滑过渡
internal fun PlayerActivity.showv32VideoSpeedRampModeToggle() {
    val current = BiliClient.prefs.v32VideoSpeedRampMode
    AppPopup.Builder(this)
        .title("变速平滑过渡")
        .option(switchText(current)) { BiliClient.prefs.v32VideoSpeedRampMode = !current }
        .show()
}
// 32.11: 音频虚拟环绕声
internal fun PlayerActivity.showv32AudioVirtualSurroundToggle() {
    val current = BiliClient.prefs.v32AudioVirtualSurround
    AppPopup.Builder(this)
        .title("音频虚拟环绕声")
        .option(switchText(current)) { BiliClient.prefs.v32AudioVirtualSurround = !current }
        .show()
}
// 32.12: 弹幕气泡样式
internal fun PlayerActivity.showv32DanmakuBubbleStyleToggle() {
    val current = BiliClient.prefs.v32DanmakuBubbleStyle
    AppPopup.Builder(this)
        .title("弹幕气泡样式")
        .option(switchText(current)) { BiliClient.prefs.v32DanmakuBubbleStyle = !current }
        .show()
}
// 32.13: 播放器锁定超时(秒)
internal fun PlayerActivity.showv32PlayerLockTimeoutDialog() {
    val current = BiliClient.prefs.v32PlayerLockTimeout
    AppPopup.Builder(this)
        .title("播放器锁定超时(秒)")
        .option("0") { BiliClient.prefs.v32PlayerLockTimeout = 0 }
        .option("1") { BiliClient.prefs.v32PlayerLockTimeout = 1 }
        .option("2") { BiliClient.prefs.v32PlayerLockTimeout = 2 }
        .option("3") { BiliClient.prefs.v32PlayerLockTimeout = 3 }
        .option("5") { BiliClient.prefs.v32PlayerLockTimeout = 5 }
        .option("10") { BiliClient.prefs.v32PlayerLockTimeout = 10 }
        .show()
}
// 32.14: 视频裁剪预设
internal fun PlayerActivity.showv32VideoCropPresetDialog() {
    val current = BiliClient.prefs.v32VideoCropPreset
    AppPopup.Builder(this)
        .title("视频裁剪预设")
        .option("0") { BiliClient.prefs.v32VideoCropPreset = 0 }
        .option("1") { BiliClient.prefs.v32VideoCropPreset = 1 }
        .option("2") { BiliClient.prefs.v32VideoCropPreset = 2 }
        .option("3") { BiliClient.prefs.v32VideoCropPreset = 3 }
        .option("5") { BiliClient.prefs.v32VideoCropPreset = 5 }
        .option("10") { BiliClient.prefs.v32VideoCropPreset = 10 }
        .show()
}
// 32.15: 弹幕表情过滤
internal fun PlayerActivity.showv32DanmakuEmojiFilterToggle() {
    val current = BiliClient.prefs.v32DanmakuEmojiFilter
    AppPopup.Builder(this)
        .title("弹幕表情过滤")
        .option(switchText(current)) { BiliClient.prefs.v32DanmakuEmojiFilter = !current }
        .show()
}
// 33.1: 低音增强
internal fun PlayerActivity.showv33AudioBassBoostDialog() {
    val current = BiliClient.prefs.v33AudioBassBoost
    AppPopup.Builder(this)
        .title("低音增强")
        .option("0") { BiliClient.prefs.v33AudioBassBoost = 0 }
        .option("1") { BiliClient.prefs.v33AudioBassBoost = 1 }
        .option("2") { BiliClient.prefs.v33AudioBassBoost = 2 }
        .option("3") { BiliClient.prefs.v33AudioBassBoost = 3 }
        .option("5") { BiliClient.prefs.v33AudioBassBoost = 5 }
        .option("10") { BiliClient.prefs.v33AudioBassBoost = 10 }
        .show()
}
// 33.2: 弹幕滚动方向
internal fun PlayerActivity.showv33DanmakuScrollDirectionDialog() {
    val current = BiliClient.prefs.v33DanmakuScrollDirection
    AppPopup.Builder(this)
        .title("弹幕滚动方向")
        .option("0") { BiliClient.prefs.v33DanmakuScrollDirection = 0 }
        .option("1") { BiliClient.prefs.v33DanmakuScrollDirection = 1 }
        .option("2") { BiliClient.prefs.v33DanmakuScrollDirection = 2 }
        .option("3") { BiliClient.prefs.v33DanmakuScrollDirection = 3 }
        .option("5") { BiliClient.prefs.v33DanmakuScrollDirection = 5 }
        .option("10") { BiliClient.prefs.v33DanmakuScrollDirection = 10 }
        .show()
}
// 33.3: 缩略图时间点(秒)
internal fun PlayerActivity.showv33VideoThumbnailTimeSecDialog() {
    val current = BiliClient.prefs.v33VideoThumbnailTimeSec
    AppPopup.Builder(this)
        .title("缩略图时间点(秒)")
        .option("0") { BiliClient.prefs.v33VideoThumbnailTimeSec = 0 }
        .option("1") { BiliClient.prefs.v33VideoThumbnailTimeSec = 1 }
        .option("2") { BiliClient.prefs.v33VideoThumbnailTimeSec = 2 }
        .option("3") { BiliClient.prefs.v33VideoThumbnailTimeSec = 3 }
        .option("5") { BiliClient.prefs.v33VideoThumbnailTimeSec = 5 }
        .option("10") { BiliClient.prefs.v33VideoThumbnailTimeSec = 10 }
        .show()
}
// 33.4: 双击快进秒数
internal fun PlayerActivity.showv33PlayerDoubleTapSeekSecDialog() {
    val current = BiliClient.prefs.v33PlayerDoubleTapSeekSec
    AppPopup.Builder(this)
        .title("双击快进秒数")
        .option("0") { BiliClient.prefs.v33PlayerDoubleTapSeekSec = 0 }
        .option("1") { BiliClient.prefs.v33PlayerDoubleTapSeekSec = 1 }
        .option("2") { BiliClient.prefs.v33PlayerDoubleTapSeekSec = 2 }
        .option("3") { BiliClient.prefs.v33PlayerDoubleTapSeekSec = 3 }
        .option("5") { BiliClient.prefs.v33PlayerDoubleTapSeekSec = 5 }
        .option("10") { BiliClient.prefs.v33PlayerDoubleTapSeekSec = 10 }
        .show()
}
// 33.5: 弹幕行数限制
internal fun PlayerActivity.showv33DanmakuLineNumberDialog() {
    val current = BiliClient.prefs.v33DanmakuLineNumber
    AppPopup.Builder(this)
        .title("弹幕行数限制")
        .option("0") { BiliClient.prefs.v33DanmakuLineNumber = 0 }
        .option("1") { BiliClient.prefs.v33DanmakuLineNumber = 1 }
        .option("2") { BiliClient.prefs.v33DanmakuLineNumber = 2 }
        .option("3") { BiliClient.prefs.v33DanmakuLineNumber = 3 }
        .option("5") { BiliClient.prefs.v33DanmakuLineNumber = 5 }
        .option("10") { BiliClient.prefs.v33DanmakuLineNumber = 10 }
        .show()
}
// 33.6: 字幕描边宽度
internal fun PlayerActivity.showv33SubtitleBorderWidthDialog() {
    val current = BiliClient.prefs.v33SubtitleBorderWidth
    AppPopup.Builder(this)
        .title("字幕描边宽度")
        .option("0") { BiliClient.prefs.v33SubtitleBorderWidth = 0 }
        .option("1") { BiliClient.prefs.v33SubtitleBorderWidth = 1 }
        .option("2") { BiliClient.prefs.v33SubtitleBorderWidth = 2 }
        .option("3") { BiliClient.prefs.v33SubtitleBorderWidth = 3 }
        .option("5") { BiliClient.prefs.v33SubtitleBorderWidth = 5 }
        .option("10") { BiliClient.prefs.v33SubtitleBorderWidth = 10 }
        .show()
}
// 33.7: HDR色调映射
internal fun PlayerActivity.showv33VideoHdrToneMapDialog() {
    val current = BiliClient.prefs.v33VideoHdrToneMap
    AppPopup.Builder(this)
        .title("HDR色调映射")
        .option("0") { BiliClient.prefs.v33VideoHdrToneMap = 0 }
        .option("1") { BiliClient.prefs.v33VideoHdrToneMap = 1 }
        .option("2") { BiliClient.prefs.v33VideoHdrToneMap = 2 }
        .option("3") { BiliClient.prefs.v33VideoHdrToneMap = 3 }
        .option("5") { BiliClient.prefs.v33VideoHdrToneMap = 5 }
        .option("10") { BiliClient.prefs.v33VideoHdrToneMap = 10 }
        .show()
}
// 33.8: 跳过片头秒数
internal fun PlayerActivity.showv33PlaybackSkipIntroSecDialog() {
    val current = BiliClient.prefs.v33PlaybackSkipIntroSec
    AppPopup.Builder(this)
        .title("跳过片头秒数")
        .option("0") { BiliClient.prefs.v33PlaybackSkipIntroSec = 0 }
        .option("1") { BiliClient.prefs.v33PlaybackSkipIntroSec = 1 }
        .option("2") { BiliClient.prefs.v33PlaybackSkipIntroSec = 2 }
        .option("3") { BiliClient.prefs.v33PlaybackSkipIntroSec = 3 }
        .option("5") { BiliClient.prefs.v33PlaybackSkipIntroSec = 5 }
        .option("10") { BiliClient.prefs.v33PlaybackSkipIntroSec = 10 }
        .show()
}
// 33.9: 弹幕自定义字体路径
internal fun PlayerActivity.showv33DanmakuCustomFontPathToggle() {
    val current = BiliClient.prefs.v33DanmakuCustomFontPath
    AppPopup.Builder(this)
        .title("弹幕自定义字体路径")
        .option(switchText(current)) { BiliClient.prefs.v33DanmakuCustomFontPath = !current }
        .show()
}
// 33.10: 音频增益(dB)
internal fun PlayerActivity.showv33AudioGainDbDialog() {
    val current = BiliClient.prefs.v33AudioGainDb
    AppPopup.Builder(this)
        .title("音频增益(dB)")
        .option("0") { BiliClient.prefs.v33AudioGainDb = 0 }
        .option("1") { BiliClient.prefs.v33AudioGainDb = 1 }
        .option("2") { BiliClient.prefs.v33AudioGainDb = 2 }
        .option("3") { BiliClient.prefs.v33AudioGainDb = 3 }
        .option("5") { BiliClient.prefs.v33AudioGainDb = 5 }
        .option("10") { BiliClient.prefs.v33AudioGainDb = 10 }
        .show()
}
// 33.11: 进度条章节标记
internal fun PlayerActivity.showv33PlayerSeekBarChapterToggle() {
    val current = BiliClient.prefs.v33PlayerSeekBarChapter
    AppPopup.Builder(this)
        .title("进度条章节标记")
        .option(switchText(current)) { BiliClient.prefs.v33PlayerSeekBarChapter = !current }
        .show()
}
// 33.12: 视频旋转锁定
internal fun PlayerActivity.showv33VideoRotationLockToggle() {
    val current = BiliClient.prefs.v33VideoRotationLock
    AppPopup.Builder(this)
        .title("视频旋转锁定")
        .option(switchText(current)) { BiliClient.prefs.v33VideoRotationLock = !current }
        .show()
}
// 33.13: 弹幕重复过滤
internal fun PlayerActivity.showv33DanmakuRepeatFilterToggle() {
    val current = BiliClient.prefs.v33DanmakuRepeatFilter
    AppPopup.Builder(this)
        .title("弹幕重复过滤")
        .option(switchText(current)) { BiliClient.prefs.v33DanmakuRepeatFilter = !current }
        .show()
}
// 33.14: 字幕阴影偏移
internal fun PlayerActivity.showv33SubtitleShadowOffsetDialog() {
    val current = BiliClient.prefs.v33SubtitleShadowOffset
    AppPopup.Builder(this)
        .title("字幕阴影偏移")
        .option("0") { BiliClient.prefs.v33SubtitleShadowOffset = 0 }
        .option("1") { BiliClient.prefs.v33SubtitleShadowOffset = 1 }
        .option("2") { BiliClient.prefs.v33SubtitleShadowOffset = 2 }
        .option("3") { BiliClient.prefs.v33SubtitleShadowOffset = 3 }
        .option("5") { BiliClient.prefs.v33SubtitleShadowOffset = 5 }
        .option("10") { BiliClient.prefs.v33SubtitleShadowOffset = 10 }
        .show()
}
// 33.15: 播放列表倒序
internal fun PlayerActivity.showv33PlaylistReverseOrderToggle() {
    val current = BiliClient.prefs.v33PlaylistReverseOrder
    AppPopup.Builder(this)
        .title("播放列表倒序")
        .option(switchText(current)) { BiliClient.prefs.v33PlaylistReverseOrder = !current }
        .show()
}
// 34.1: 弹幕最大显示时长(秒)
internal fun PlayerActivity.showv34DanmakuMaxDisplaySecDialog() {
    val current = BiliClient.prefs.v34DanmakuMaxDisplaySec
    AppPopup.Builder(this)
        .title("弹幕最大显示时长(秒)")
        .option("0") { BiliClient.prefs.v34DanmakuMaxDisplaySec = 0 }
        .option("1") { BiliClient.prefs.v34DanmakuMaxDisplaySec = 1 }
        .option("2") { BiliClient.prefs.v34DanmakuMaxDisplaySec = 2 }
        .option("3") { BiliClient.prefs.v34DanmakuMaxDisplaySec = 3 }
        .option("5") { BiliClient.prefs.v34DanmakuMaxDisplaySec = 5 }
        .option("10") { BiliClient.prefs.v34DanmakuMaxDisplaySec = 10 }
        .show()
}
// 34.2: 亮度自动感应
internal fun PlayerActivity.showv34VideoBrightnessSensorToggle() {
    val current = BiliClient.prefs.v34VideoBrightnessSensor
    AppPopup.Builder(this)
        .title("亮度自动感应")
        .option(switchText(current)) { BiliClient.prefs.v34VideoBrightnessSensor = !current }
        .show()
}
// 34.3: 音频压缩阈值
internal fun PlayerActivity.showv34AudioCompressorThresholdDialog() {
    val current = BiliClient.prefs.v34AudioCompressorThreshold
    AppPopup.Builder(this)
        .title("音频压缩阈值")
        .option("0") { BiliClient.prefs.v34AudioCompressorThreshold = 0 }
        .option("1") { BiliClient.prefs.v34AudioCompressorThreshold = 1 }
        .option("2") { BiliClient.prefs.v34AudioCompressorThreshold = 2 }
        .option("3") { BiliClient.prefs.v34AudioCompressorThreshold = 3 }
        .option("5") { BiliClient.prefs.v34AudioCompressorThreshold = 5 }
        .option("10") { BiliClient.prefs.v34AudioCompressorThreshold = 10 }
        .show()
}
// 34.4: 自定义手势映射
internal fun PlayerActivity.showv34PlayerGestureCustomMapToggle() {
    val current = BiliClient.prefs.v34PlayerGestureCustomMap
    AppPopup.Builder(this)
        .title("自定义手势映射")
        .option(switchText(current)) { BiliClient.prefs.v34PlayerGestureCustomMap = !current }
        .show()
}
// 34.5: 弹幕正则屏蔽
internal fun PlayerActivity.showv34DanmakuShieldRegexToggle() {
    val current = BiliClient.prefs.v34DanmakuShieldRegex
    AppPopup.Builder(this)
        .title("弹幕正则屏蔽")
        .option(switchText(current)) { BiliClient.prefs.v34DanmakuShieldRegex = !current }
        .show()
}
// 34.6: 字幕卡拉OK模式
internal fun PlayerActivity.showv34SubtitleKaraokeModeToggle() {
    val current = BiliClient.prefs.v34SubtitleKaraokeMode
    AppPopup.Builder(this)
        .title("字幕卡拉OK模式")
        .option(switchText(current)) { BiliClient.prefs.v34SubtitleKaraokeMode = !current }
        .show()
}
// 34.7: 扫描线滤镜
internal fun PlayerActivity.showv34VideoScanLineFilterToggle() {
    val current = BiliClient.prefs.v34VideoScanLineFilter
    AppPopup.Builder(this)
        .title("扫描线滤镜")
        .option(switchText(current)) { BiliClient.prefs.v34VideoScanLineFilter = !current }
        .show()
}
// 34.8: 耳机断开自动暂停
internal fun PlayerActivity.showv34PlaybackAutoPauseOnHeadsetToggle() {
    val current = BiliClient.prefs.v34PlaybackAutoPauseOnHeadset
    AppPopup.Builder(this)
        .title("耳机断开自动暂停")
        .option(switchText(current)) { BiliClient.prefs.v34PlaybackAutoPauseOnHeadset = !current }
        .show()
}
// 34.9: 弹幕镜像翻转
internal fun PlayerActivity.showv34DanmakuMirrorFlipToggle() {
    val current = BiliClient.prefs.v34DanmakuMirrorFlip
    AppPopup.Builder(this)
        .title("弹幕镜像翻转")
        .option(switchText(current)) { BiliClient.prefs.v34DanmakuMirrorFlip = !current }
        .show()
}
// 34.10: 均衡器预设
internal fun PlayerActivity.showv34AudioEqPresetDialog() {
    val current = BiliClient.prefs.v34AudioEqPreset
    AppPopup.Builder(this)
        .title("均衡器预设")
        .option("0") { BiliClient.prefs.v34AudioEqPreset = 0 }
        .option("1") { BiliClient.prefs.v34AudioEqPreset = 1 }
        .option("2") { BiliClient.prefs.v34AudioEqPreset = 2 }
        .option("3") { BiliClient.prefs.v34AudioEqPreset = 3 }
        .option("5") { BiliClient.prefs.v34AudioEqPreset = 5 }
        .option("10") { BiliClient.prefs.v34AudioEqPreset = 10 }
        .show()
}
// 34.11: 播放器音量增强
internal fun PlayerActivity.showv34PlayerVolumeBoostToggle() {
    val current = BiliClient.prefs.v34PlayerVolumeBoost
    AppPopup.Builder(this)
        .title("播放器音量增强")
        .option(switchText(current)) { BiliClient.prefs.v34PlayerVolumeBoost = !current }
        .show()
}
// 34.12: 像素风格模式
internal fun PlayerActivity.showv34VideoPixelArtModeToggle() {
    val current = BiliClient.prefs.v34VideoPixelArtMode
    AppPopup.Builder(this)
        .title("像素风格模式")
        .option(switchText(current)) { BiliClient.prefs.v34VideoPixelArtMode = !current }
        .show()
}
// 34.13: 弹幕最小字号
internal fun PlayerActivity.showv34DanmakuFontSizeMinDialog() {
    val current = BiliClient.prefs.v34DanmakuFontSizeMin
    AppPopup.Builder(this)
        .title("弹幕最小字号")
        .option("0") { BiliClient.prefs.v34DanmakuFontSizeMin = 0 }
        .option("1") { BiliClient.prefs.v34DanmakuFontSizeMin = 1 }
        .option("2") { BiliClient.prefs.v34DanmakuFontSizeMin = 2 }
        .option("3") { BiliClient.prefs.v34DanmakuFontSizeMin = 3 }
        .option("5") { BiliClient.prefs.v34DanmakuFontSizeMin = 5 }
        .option("10") { BiliClient.prefs.v34DanmakuFontSizeMin = 10 }
        .show()
}
// 34.14: 字幕自定义颜色
internal fun PlayerActivity.showv34SubtitleTextColorCustomToggle() {
    val current = BiliClient.prefs.v34SubtitleTextColorCustom
    AppPopup.Builder(this)
        .title("字幕自定义颜色")
        .option(switchText(current)) { BiliClient.prefs.v34SubtitleTextColorCustom = !current }
        .show()
}
// 34.15: 单曲循环模式
internal fun PlayerActivity.showv34PlaylistRepeatSingleToggle() {
    val current = BiliClient.prefs.v34PlaylistRepeatSingle
    AppPopup.Builder(this)
        .title("单曲循环模式")
        .option(switchText(current)) { BiliClient.prefs.v34PlaylistRepeatSingle = !current }
        .show()
}
// 35.1: 帧率覆盖
internal fun PlayerActivity.showv35VideoFrameRateOverrideDialog() {
    val current = BiliClient.prefs.v35VideoFrameRateOverride
    AppPopup.Builder(this)
        .title("帧率覆盖")
        .option("0") { BiliClient.prefs.v35VideoFrameRateOverride = 0 }
        .option("1") { BiliClient.prefs.v35VideoFrameRateOverride = 1 }
        .option("2") { BiliClient.prefs.v35VideoFrameRateOverride = 2 }
        .option("3") { BiliClient.prefs.v35VideoFrameRateOverride = 3 }
        .option("5") { BiliClient.prefs.v35VideoFrameRateOverride = 5 }
        .option("10") { BiliClient.prefs.v35VideoFrameRateOverride = 10 }
        .show()
}
// 35.2: 弹幕发送者头像
internal fun PlayerActivity.showv35DanmakuSenderAvatarToggle() {
    val current = BiliClient.prefs.v35DanmakuSenderAvatar
    AppPopup.Builder(this)
        .title("弹幕发送者头像")
        .option(switchText(current)) { BiliClient.prefs.v35DanmakuSenderAvatar = !current }
        .show()
}
// 35.3: 空间音频宽度
internal fun PlayerActivity.showv35AudioSpatialWidthDialog() {
    val current = BiliClient.prefs.v35AudioSpatialWidth
    AppPopup.Builder(this)
        .title("空间音频宽度")
        .option("0") { BiliClient.prefs.v35AudioSpatialWidth = 0 }
        .option("1") { BiliClient.prefs.v35AudioSpatialWidth = 1 }
        .option("2") { BiliClient.prefs.v35AudioSpatialWidth = 2 }
        .option("3") { BiliClient.prefs.v35AudioSpatialWidth = 3 }
        .option("5") { BiliClient.prefs.v35AudioSpatialWidth = 5 }
        .option("10") { BiliClient.prefs.v35AudioSpatialWidth = 10 }
        .show()
}
// 35.4: 横屏自动全屏
internal fun PlayerActivity.showv35PlayerAutoFullscreenLandscapeToggle() {
    val current = BiliClient.prefs.v35PlayerAutoFullscreenLandscape
    AppPopup.Builder(this)
        .title("横屏自动全屏")
        .option(switchText(current)) { BiliClient.prefs.v35PlayerAutoFullscreenLandscape = !current }
        .show()
}
// 35.5: 弹幕拼音转换
internal fun PlayerActivity.showv35DanmakuPinyinConvertToggle() {
    val current = BiliClient.prefs.v35DanmakuPinyinConvert
    AppPopup.Builder(this)
        .title("弹幕拼音转换")
        .option(switchText(current)) { BiliClient.prefs.v35DanmakuPinyinConvert = !current }
        .show()
}
// 35.6: 字幕顶部显示
internal fun PlayerActivity.showv35SubtitlePositionTopToggle() {
    val current = BiliClient.prefs.v35SubtitlePositionTop
    AppPopup.Builder(this)
        .title("字幕顶部显示")
        .option(switchText(current)) { BiliClient.prefs.v35SubtitlePositionTop = !current }
        .show()
}
// 35.7: 暗角效果强度
internal fun PlayerActivity.showv35VideoVignetteEffectDialog() {
    val current = BiliClient.prefs.v35VideoVignetteEffect
    AppPopup.Builder(this)
        .title("暗角效果强度")
        .option("0") { BiliClient.prefs.v35VideoVignetteEffect = 0 }
        .option("1") { BiliClient.prefs.v35VideoVignetteEffect = 1 }
        .option("2") { BiliClient.prefs.v35VideoVignetteEffect = 2 }
        .option("3") { BiliClient.prefs.v35VideoVignetteEffect = 3 }
        .option("5") { BiliClient.prefs.v35VideoVignetteEffect = 5 }
        .option("10") { BiliClient.prefs.v35VideoVignetteEffect = 10 }
        .show()
}
// 35.8: 仅WiFi预加载
internal fun PlayerActivity.showv35PlaybackPreloadOnWifiToggle() {
    val current = BiliClient.prefs.v35PlaybackPreloadOnWifi
    AppPopup.Builder(this)
        .title("仅WiFi预加载")
        .option(switchText(current)) { BiliClient.prefs.v35PlaybackPreloadOnWifi = !current }
        .show()
}
// 35.9: 弹幕渐变色
internal fun PlayerActivity.showv35DanmakuGradientColorToggle() {
    val current = BiliClient.prefs.v35DanmakuGradientColor
    AppPopup.Builder(this)
        .title("弹幕渐变色")
        .option(switchText(current)) { BiliClient.prefs.v35DanmakuGradientColor = !current }
        .show()
}
// 35.10: 音频响度标准化
internal fun PlayerActivity.showv35AudioLoudnessNormalizeToggle() {
    val current = BiliClient.prefs.v35AudioLoudnessNormalize
    AppPopup.Builder(this)
        .title("音频响度标准化")
        .option(switchText(current)) { BiliClient.prefs.v35AudioLoudnessNormalize = !current }
        .show()
}
// 35.11: 小窗播放
internal fun PlayerActivity.showv35PlayerMiniWindowToggle() {
    val current = BiliClient.prefs.v35PlayerMiniWindow
    AppPopup.Builder(this)
        .title("小窗播放")
        .option(switchText(current)) { BiliClient.prefs.v35PlayerMiniWindow = !current }
        .show()
}
// 35.12: 视频降噪强度
internal fun PlayerActivity.showv35VideoNoiseReductionDialog() {
    val current = BiliClient.prefs.v35VideoNoiseReduction
    AppPopup.Builder(this)
        .title("视频降噪强度")
        .option("0") { BiliClient.prefs.v35VideoNoiseReduction = 0 }
        .option("1") { BiliClient.prefs.v35VideoNoiseReduction = 1 }
        .option("2") { BiliClient.prefs.v35VideoNoiseReduction = 2 }
        .option("3") { BiliClient.prefs.v35VideoNoiseReduction = 3 }
        .option("5") { BiliClient.prefs.v35VideoNoiseReduction = 5 }
        .option("10") { BiliClient.prefs.v35VideoNoiseReduction = 10 }
        .show()
}
// 35.13: 弹幕动画速度
internal fun PlayerActivity.showv35DanmakuAnimationSpeedDialog() {
    val current = BiliClient.prefs.v35DanmakuAnimationSpeed
    AppPopup.Builder(this)
        .title("弹幕动画速度")
        .option("0") { BiliClient.prefs.v35DanmakuAnimationSpeed = 0 }
        .option("1") { BiliClient.prefs.v35DanmakuAnimationSpeed = 1 }
        .option("2") { BiliClient.prefs.v35DanmakuAnimationSpeed = 2 }
        .option("3") { BiliClient.prefs.v35DanmakuAnimationSpeed = 3 }
        .option("5") { BiliClient.prefs.v35DanmakuAnimationSpeed = 5 }
        .option("10") { BiliClient.prefs.v35DanmakuAnimationSpeed = 10 }
        .show()
}
// 35.14: 字幕行间距
internal fun PlayerActivity.showv35SubtitleLineSpacingDialog() {
    val current = BiliClient.prefs.v35SubtitleLineSpacing
    AppPopup.Builder(this)
        .title("字幕行间距")
        .option("0") { BiliClient.prefs.v35SubtitleLineSpacing = 0 }
        .option("1") { BiliClient.prefs.v35SubtitleLineSpacing = 1 }
        .option("2") { BiliClient.prefs.v35SubtitleLineSpacing = 2 }
        .option("3") { BiliClient.prefs.v35SubtitleLineSpacing = 3 }
        .option("5") { BiliClient.prefs.v35SubtitleLineSpacing = 5 }
        .option("10") { BiliClient.prefs.v35SubtitleLineSpacing = 10 }
        .show()
}
// 35.15: 智能随机播放
internal fun PlayerActivity.showv35PlaylistSmartShuffleToggle() {
    val current = BiliClient.prefs.v35PlaylistSmartShuffle
    AppPopup.Builder(this)
        .title("智能随机播放")
        .option(switchText(current)) { BiliClient.prefs.v35PlaylistSmartShuffle = !current }
        .show()
}
// 36.1: 画面适配模式
internal fun PlayerActivity.showv36VideoAspectFitModeDialog() {
    val current = BiliClient.prefs.v36VideoAspectFitMode
    AppPopup.Builder(this)
        .title("画面适配模式")
        .option("0") { BiliClient.prefs.v36VideoAspectFitMode = 0 }
        .option("1") { BiliClient.prefs.v36VideoAspectFitMode = 1 }
        .option("2") { BiliClient.prefs.v36VideoAspectFitMode = 2 }
        .option("3") { BiliClient.prefs.v36VideoAspectFitMode = 3 }
        .option("5") { BiliClient.prefs.v36VideoAspectFitMode = 5 }
        .option("10") { BiliClient.prefs.v36VideoAspectFitMode = 10 }
        .show()
}
// 36.2: 弹幕类型透明度
internal fun PlayerActivity.showv36DanmakuOpacityPerTypeDialog() {
    val current = BiliClient.prefs.v36DanmakuOpacityPerType
    AppPopup.Builder(this)
        .title("弹幕类型透明度")
        .option("0") { BiliClient.prefs.v36DanmakuOpacityPerType = 0 }
        .option("1") { BiliClient.prefs.v36DanmakuOpacityPerType = 1 }
        .option("2") { BiliClient.prefs.v36DanmakuOpacityPerType = 2 }
        .option("3") { BiliClient.prefs.v36DanmakuOpacityPerType = 3 }
        .option("5") { BiliClient.prefs.v36DanmakuOpacityPerType = 5 }
        .option("10") { BiliClient.prefs.v36DanmakuOpacityPerType = 10 }
        .show()
}
// 36.3: 人声隔离
internal fun PlayerActivity.showv36AudioVoiceIsolateToggle() {
    val current = BiliClient.prefs.v36AudioVoiceIsolate
    AppPopup.Builder(this)
        .title("人声隔离")
        .option(switchText(current)) { BiliClient.prefs.v36AudioVoiceIsolate = !current }
        .show()
}
// 36.4: 跳过片尾秒数
internal fun PlayerActivity.showv36PlayerSkipOutroSecDialog() {
    val current = BiliClient.prefs.v36PlayerSkipOutroSec
    AppPopup.Builder(this)
        .title("跳过片尾秒数")
        .option("0") { BiliClient.prefs.v36PlayerSkipOutroSec = 0 }
        .option("1") { BiliClient.prefs.v36PlayerSkipOutroSec = 1 }
        .option("2") { BiliClient.prefs.v36PlayerSkipOutroSec = 2 }
        .option("3") { BiliClient.prefs.v36PlayerSkipOutroSec = 3 }
        .option("5") { BiliClient.prefs.v36PlayerSkipOutroSec = 5 }
        .option("10") { BiliClient.prefs.v36PlayerSkipOutroSec = 10 }
        .show()
}
// 36.5: 弹幕自动缩放
internal fun PlayerActivity.showv36DanmakuAutoScaleToggle() {
    val current = BiliClient.prefs.v36DanmakuAutoScale
    AppPopup.Builder(this)
        .title("弹幕自动缩放")
        .option(switchText(current)) { BiliClient.prefs.v36DanmakuAutoScale = !current }
        .show()
}
// 36.6: 字幕边缘模糊
internal fun PlayerActivity.showv36SubtitleEdgeBlurDialog() {
    val current = BiliClient.prefs.v36SubtitleEdgeBlur
    AppPopup.Builder(this)
        .title("字幕边缘模糊")
        .option("0") { BiliClient.prefs.v36SubtitleEdgeBlur = 0 }
        .option("1") { BiliClient.prefs.v36SubtitleEdgeBlur = 1 }
        .option("2") { BiliClient.prefs.v36SubtitleEdgeBlur = 2 }
        .option("3") { BiliClient.prefs.v36SubtitleEdgeBlur = 3 }
        .option("5") { BiliClient.prefs.v36SubtitleEdgeBlur = 5 }
        .option("10") { BiliClient.prefs.v36SubtitleEdgeBlur = 10 }
        .show()
}
// 36.7: 色彩LUT预设
internal fun PlayerActivity.showv36VideoColorLutPresetDialog() {
    val current = BiliClient.prefs.v36VideoColorLutPreset
    AppPopup.Builder(this)
        .title("色彩LUT预设")
        .option("0") { BiliClient.prefs.v36VideoColorLutPreset = 0 }
        .option("1") { BiliClient.prefs.v36VideoColorLutPreset = 1 }
        .option("2") { BiliClient.prefs.v36VideoColorLutPreset = 2 }
        .option("3") { BiliClient.prefs.v36VideoColorLutPreset = 3 }
        .option("5") { BiliClient.prefs.v36VideoColorLutPreset = 5 }
        .option("10") { BiliClient.prefs.v36VideoColorLutPreset = 10 }
        .show()
}
// 36.8: 变速音调修正
internal fun PlayerActivity.showv36PlaybackSpeedPitchCorrectToggle() {
    val current = BiliClient.prefs.v36PlaybackSpeedPitchCorrect
    AppPopup.Builder(this)
        .title("变速音调修正")
        .option(switchText(current)) { BiliClient.prefs.v36PlaybackSpeedPitchCorrect = !current }
        .show()
}
// 36.9: 弹幕长度上限
internal fun PlayerActivity.showv36DanmakuBlockLengthDialog() {
    val current = BiliClient.prefs.v36DanmakuBlockLength
    AppPopup.Builder(this)
        .title("弹幕长度上限")
        .option("0") { BiliClient.prefs.v36DanmakuBlockLength = 0 }
        .option("1") { BiliClient.prefs.v36DanmakuBlockLength = 1 }
        .option("2") { BiliClient.prefs.v36DanmakuBlockLength = 2 }
        .option("3") { BiliClient.prefs.v36DanmakuBlockLength = 3 }
        .option("5") { BiliClient.prefs.v36DanmakuBlockLength = 5 }
        .option("10") { BiliClient.prefs.v36DanmakuBlockLength = 10 }
        .show()
}
// 36.10: 音频延迟(ms)
internal fun PlayerActivity.showv36AudioDelayMsDialog() {
    val current = BiliClient.prefs.v36AudioDelayMs
    AppPopup.Builder(this)
        .title("音频延迟(ms)")
        .option("0") { BiliClient.prefs.v36AudioDelayMs = 0 }
        .option("1") { BiliClient.prefs.v36AudioDelayMs = 1 }
        .option("2") { BiliClient.prefs.v36AudioDelayMs = 2 }
        .option("3") { BiliClient.prefs.v36AudioDelayMs = 3 }
        .option("5") { BiliClient.prefs.v36AudioDelayMs = 5 }
        .option("10") { BiliClient.prefs.v36AudioDelayMs = 10 }
        .show()
}
// 36.11: 滑动亮度曲线
internal fun PlayerActivity.showv36PlayerSwipeBrightnessCurveDialog() {
    val current = BiliClient.prefs.v36PlayerSwipeBrightnessCurve
    AppPopup.Builder(this)
        .title("滑动亮度曲线")
        .option("0") { BiliClient.prefs.v36PlayerSwipeBrightnessCurve = 0 }
        .option("1") { BiliClient.prefs.v36PlayerSwipeBrightnessCurve = 1 }
        .option("2") { BiliClient.prefs.v36PlayerSwipeBrightnessCurve = 2 }
        .option("3") { BiliClient.prefs.v36PlayerSwipeBrightnessCurve = 3 }
        .option("5") { BiliClient.prefs.v36PlayerSwipeBrightnessCurve = 5 }
        .option("10") { BiliClient.prefs.v36PlayerSwipeBrightnessCurve = 10 }
        .show()
}
// 36.12: 边缘锐化模式
internal fun PlayerActivity.showv36VideoSharpenEdgeModeDialog() {
    val current = BiliClient.prefs.v36VideoSharpenEdgeMode
    AppPopup.Builder(this)
        .title("边缘锐化模式")
        .option("0") { BiliClient.prefs.v36VideoSharpenEdgeMode = 0 }
        .option("1") { BiliClient.prefs.v36VideoSharpenEdgeMode = 1 }
        .option("2") { BiliClient.prefs.v36VideoSharpenEdgeMode = 2 }
        .option("3") { BiliClient.prefs.v36VideoSharpenEdgeMode = 3 }
        .option("5") { BiliClient.prefs.v36VideoSharpenEdgeMode = 5 }
        .option("10") { BiliClient.prefs.v36VideoSharpenEdgeMode = 10 }
        .show()
}
// 36.13: 弹幕粉丝徽章
internal fun PlayerActivity.showv36DanmakuFanBadgeToggle() {
    val current = BiliClient.prefs.v36DanmakuFanBadge
    AppPopup.Builder(this)
        .title("弹幕粉丝徽章")
        .option(switchText(current)) { BiliClient.prefs.v36DanmakuFanBadge = !current }
        .show()
}
// 36.14: 字幕字重
internal fun PlayerActivity.showv36SubtitleFontWeightCustomDialog() {
    val current = BiliClient.prefs.v36SubtitleFontWeightCustom
    AppPopup.Builder(this)
        .title("字幕字重")
        .option("0") { BiliClient.prefs.v36SubtitleFontWeightCustom = 0 }
        .option("1") { BiliClient.prefs.v36SubtitleFontWeightCustom = 1 }
        .option("2") { BiliClient.prefs.v36SubtitleFontWeightCustom = 2 }
        .option("3") { BiliClient.prefs.v36SubtitleFontWeightCustom = 3 }
        .option("5") { BiliClient.prefs.v36SubtitleFontWeightCustom = 5 }
        .option("10") { BiliClient.prefs.v36SubtitleFontWeightCustom = 10 }
        .show()
}
// 36.15: 自动播放下一集
internal fun PlayerActivity.showv36PlaylistAutoplayNextEpisodeToggle() {
    val current = BiliClient.prefs.v36PlaylistAutoplayNextEpisode
    AppPopup.Builder(this)
        .title("自动播放下一集")
        .option(switchText(current)) { BiliClient.prefs.v36PlaylistAutoplayNextEpisode = !current }
        .show()
}
// 37.1: 黑边自动检测
internal fun PlayerActivity.showv37VideoBlackBarDetectToggle() {
    val current = BiliClient.prefs.v37VideoBlackBarDetect
    AppPopup.Builder(this)
        .title("黑边自动检测")
        .option(switchText(current)) { BiliClient.prefs.v37VideoBlackBarDetect = !current }
        .show()
}
// 37.2: 弹幕分组合并
internal fun PlayerActivity.showv37DanmakuGroupMergeToggle() {
    val current = BiliClient.prefs.v37DanmakuGroupMerge
    AppPopup.Builder(this)
        .title("弹幕分组合并")
        .option(switchText(current)) { BiliClient.prefs.v37DanmakuGroupMerge = !current }
        .show()
}
// 37.3: 立体声宽度
internal fun PlayerActivity.showv37AudioStereoWidthDialog() {
    val current = BiliClient.prefs.v37AudioStereoWidth
    AppPopup.Builder(this)
        .title("立体声宽度")
        .option("0") { BiliClient.prefs.v37AudioStereoWidth = 0 }
        .option("1") { BiliClient.prefs.v37AudioStereoWidth = 1 }
        .option("2") { BiliClient.prefs.v37AudioStereoWidth = 2 }
        .option("3") { BiliClient.prefs.v37AudioStereoWidth = 3 }
        .option("5") { BiliClient.prefs.v37AudioStereoWidth = 5 }
        .option("10") { BiliClient.prefs.v37AudioStereoWidth = 10 }
        .show()
}
// 37.4: 恢复播放阈值(秒)
internal fun PlayerActivity.showv37PlayerResumeThresholdDialog() {
    val current = BiliClient.prefs.v37PlayerResumeThreshold
    AppPopup.Builder(this)
        .title("恢复播放阈值(秒)")
        .option("0") { BiliClient.prefs.v37PlayerResumeThreshold = 0 }
        .option("1") { BiliClient.prefs.v37PlayerResumeThreshold = 1 }
        .option("2") { BiliClient.prefs.v37PlayerResumeThreshold = 2 }
        .option("3") { BiliClient.prefs.v37PlayerResumeThreshold = 3 }
        .option("5") { BiliClient.prefs.v37PlayerResumeThreshold = 5 }
        .option("10") { BiliClient.prefs.v37PlayerResumeThreshold = 10 }
        .show()
}
// 37.5: 弹幕注音显示
internal fun PlayerActivity.showv37DanmakuFuriganaShowToggle() {
    val current = BiliClient.prefs.v37DanmakuFuriganaShow
    AppPopup.Builder(this)
        .title("弹幕注音显示")
        .option(switchText(current)) { BiliClient.prefs.v37DanmakuFuriganaShow = !current }
        .show()
}






























































































