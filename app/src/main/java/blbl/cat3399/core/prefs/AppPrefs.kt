package blbl.cat3399.core.prefs

import android.content.Context
import android.provider.Settings
import blbl.cat3399.core.tv.isTvDevice
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import org.json.JSONArray
import org.json.JSONObject
import java.util.UUID
import kotlin.math.abs
import kotlin.math.roundToInt

class AppPrefs(context: Context) {
    private val appContext = context.applicationContext
    private val prefs = context.getSharedPreferences("blbl_prefs", Context.MODE_PRIVATE)
    private val defaultPlayerTouchGesturesEnabled by lazy(LazyThreadSafetyMode.NONE) { !appContext.isTvDevice() }

    var disclaimerAccepted: Boolean
        get() = prefs.getBoolean(KEY_DISCLAIMER_ACCEPTED, false)
        set(value) = prefs.edit().putBoolean(KEY_DISCLAIMER_ACCEPTED, value).apply()

    var webRefreshToken: String?
        get() = prefs.getString(KEY_WEB_REFRESH_TOKEN, null)?.trim()?.takeIf { it.isNotBlank() }
        set(value) = prefs.edit().putString(KEY_WEB_REFRESH_TOKEN, value?.trim()).apply()

    var appAuthSession: BiliAppAuthSession?
        get() {
            val raw = prefs.getString(KEY_APP_AUTH_SESSION, null)?.trim()?.takeIf { it.isNotBlank() } ?: return null
            return runCatching { BiliAppAuthSession.fromJson(JSONObject(raw)) }.getOrNull()
        }
        set(value) {
            val editor = prefs.edit()
            if (value == null) {
                editor.remove(KEY_APP_AUTH_SESSION)
            } else {
                editor.putString(KEY_APP_AUTH_SESSION, value.toJson().toString())
            }
            editor.apply()
        }

    var webCookieRefreshCheckedEpochDay: Long
        get() = prefs.getLong(KEY_WEB_COOKIE_REFRESH_CHECKED_EPOCH_DAY, -1L)
        set(value) = prefs.edit().putLong(KEY_WEB_COOKIE_REFRESH_CHECKED_EPOCH_DAY, value).apply()

    var biliTicketCheckedEpochDay: Long
        get() = prefs.getLong(KEY_BILI_TICKET_CHECKED_EPOCH_DAY, -1L)
        set(value) = prefs.edit().putLong(KEY_BILI_TICKET_CHECKED_EPOCH_DAY, value).apply()

    var sidebarSize: String
        get() = prefs.getString(KEY_SIDEBAR_SIZE, SIDEBAR_SIZE_MEDIUM) ?: SIDEBAR_SIZE_MEDIUM
        set(value) = prefs.edit().putString(KEY_SIDEBAR_SIZE, value).apply()

    var uiScaleFactor: Float
        get() {
            if (prefs.contains(KEY_UI_SCALE_FACTOR)) {
                return normalizeUiScaleFactor(prefs.getFloat(KEY_UI_SCALE_FACTOR, UI_SCALE_FACTOR_DEFAULT))
            }
            // Legacy fallback (kept for migration): sidebar_size small/medium/large -> 0.90/1.00/1.10.
            return when (sidebarSize) {
                SIDEBAR_SIZE_SMALL -> 0.90f
                SIDEBAR_SIZE_LARGE -> 1.10f
                else -> UI_SCALE_FACTOR_DEFAULT
            }
        }
        set(value) = prefs.edit().putFloat(KEY_UI_SCALE_FACTOR, normalizeUiScaleFactor(value)).apply()

    var themePreset: String
        get() {
            return normalizeThemePreset(prefs.getString(KEY_THEME_PRESET, THEME_PRESET_DEFAULT))
        }
        set(value) {
            prefs.edit().putString(KEY_THEME_PRESET, normalizeThemePreset(value)).apply()
        }

    var startupPage: String
        get() = prefs.getString(KEY_STARTUP_PAGE, STARTUP_PAGE_HOME)?.trim()?.takeIf { it.isNotBlank() } ?: STARTUP_PAGE_HOME
        set(value) {
            val v = value.trim().takeIf { it.isNotBlank() } ?: STARTUP_PAGE_HOME
            prefs.edit().putString(KEY_STARTUP_PAGE, v).apply()
        }

    var customPageConfig: CustomPageConfig
        get() = CustomPageConfigStore.parse(prefs.getString(KEY_CUSTOM_PAGE_CONFIG, null))
        set(value) {
            val normalized = CustomPageConfigStore.normalize(value)
            if (!normalized.enabled && normalized.tabs.isEmpty()) {
                prefs.edit().remove(KEY_CUSTOM_PAGE_CONFIG).apply()
            } else {
                prefs.edit().putString(KEY_CUSTOM_PAGE_CONFIG, CustomPageConfigStore.serialize(normalized)).apply()
            }
        }

    var mainHomeVisibleTabs: List<String>
        get() = loadStringList(KEY_MAIN_HOME_VISIBLE_TABS)
        set(value) = saveStringList(KEY_MAIN_HOME_VISIBLE_TABS, normalizeStringList(value))

    var mainCategoryVisibleTabs: List<String>
        get() = loadStringList(KEY_MAIN_CATEGORY_VISIBLE_TABS)
        set(value) = saveStringList(KEY_MAIN_CATEGORY_VISIBLE_TABS, normalizeStringList(value))

    var mainLiveVisibleTabs: List<String>
        get() = loadStringList(KEY_MAIN_LIVE_VISIBLE_TABS)
        set(value) = saveStringList(KEY_MAIN_LIVE_VISIBLE_TABS, normalizeStringList(value))

    var mainMyVisibleTabs: List<String>
        get() = loadStringList(KEY_MAIN_MY_VISIBLE_TABS)
        set(value) = saveStringList(KEY_MAIN_MY_VISIBLE_TABS, normalizeStringList(value))

    var followingListOrder: String
        get() {
            val raw = prefs.getString(KEY_FOLLOWING_LIST_ORDER, FOLLOWING_LIST_ORDER_FOLLOW_TIME) ?: FOLLOWING_LIST_ORDER_FOLLOW_TIME
            return when (raw.trim()) {
                FOLLOWING_LIST_ORDER_RECENT_VISIT -> FOLLOWING_LIST_ORDER_RECENT_VISIT
                else -> FOLLOWING_LIST_ORDER_FOLLOW_TIME
            }
        }
        set(value) {
            val normalized =
                when (value.trim()) {
                    FOLLOWING_LIST_ORDER_RECENT_VISIT -> FOLLOWING_LIST_ORDER_RECENT_VISIT
                    else -> FOLLOWING_LIST_ORDER_FOLLOW_TIME
                }
            prefs.edit().putString(KEY_FOLLOWING_LIST_ORDER, normalized).apply()
        }

    var dynamicFollowingRecentUpdateDotEnabled: Boolean
        get() = prefs.getBoolean(KEY_DYNAMIC_FOLLOWING_RECENT_UPDATE_DOT_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_DYNAMIC_FOLLOWING_RECENT_UPDATE_DOT_ENABLED, value).apply()

    var autoUpdateCheckEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUTO_UPDATE_CHECK_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_UPDATE_CHECK_ENABLED, value).apply()

    var autoUpdateIgnoredVersionName: String?
        get() = prefs.getString(KEY_AUTO_UPDATE_IGNORED_VERSION_NAME, null)?.trim()?.takeIf { it.isNotBlank() }
        set(value) = prefs.edit().putString(KEY_AUTO_UPDATE_IGNORED_VERSION_NAME, value?.trim()).apply()

    var userAgent: String
        get() = prefs.getString(KEY_UA, DEFAULT_UA) ?: DEFAULT_UA
        set(value) = prefs.edit().putString(KEY_UA, value).apply()

    var apiSource: String
        get() = normalizeApiSource(prefs.getString(KEY_API_SOURCE, API_SOURCE_WEB))
        set(value) = prefs.edit().putString(KEY_API_SOURCE, normalizeApiSource(value)).apply()

    var ipv4OnlyEnabled: Boolean
        get() = prefs.getBoolean(KEY_IPV4_ONLY_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_IPV4_ONLY_ENABLED, value).apply()

    var deviceBuvid: String
        get() = prefs.getString(KEY_DEVICE_BUVID, null) ?: generateBuvid().also { prefs.edit().putString(KEY_DEVICE_BUVID, it).apply() }
        set(value) = prefs.edit().putString(KEY_DEVICE_BUVID, value.trim()).apply()

    /**
     * Stable per-device UUID for diagnostics (e.g. log uploads).
     *
     * - Pref-backed (memory): once created/derived, keep using it.
     * - Prefer deriving from ANDROID_ID (stable across reinstall on most devices).
     * - Fallback to random UUID when ANDROID_ID is unavailable/invalid.
     */
    var deviceUuid: String
        get() {
            val cached =
                prefs.getString(KEY_DEVICE_UUID, null)
                    ?.trim()
                    ?.takeIf { it.isNotBlank() }
                    ?.takeIf { isValidUuid(it) }
            if (cached != null) return cached

            val derived = deriveDeviceUuid()
            prefs.edit().putString(KEY_DEVICE_UUID, derived).apply()
            return derived
        }
        set(value) = prefs.edit().putString(KEY_DEVICE_UUID, value.trim()).apply()

    var buvidActivatedMid: Long
        get() = prefs.getLong(KEY_BUVID_ACTIVATED_MID, 0L)
        set(value) = prefs.edit().putLong(KEY_BUVID_ACTIVATED_MID, value).apply()

    var buvidActivatedEpochDay: Long
        get() = prefs.getLong(KEY_BUVID_ACTIVATED_EPOCH_DAY, -1L)
        set(value) = prefs.edit().putLong(KEY_BUVID_ACTIVATED_EPOCH_DAY, value).apply()

    var imageQuality: String
        get() = prefs.getString(KEY_IMAGE_QUALITY, "low") ?: "low"
        set(value) = prefs.edit().putString(KEY_IMAGE_QUALITY, value).apply()

    var danmakuEnabled: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ENABLED, value).apply()

    var danmakuAllowTop: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ALLOW_TOP, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ALLOW_TOP, value).apply()

    var danmakuAllowBottom: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ALLOW_BOTTOM, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ALLOW_BOTTOM, value).apply()

    var danmakuAllowScroll: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ALLOW_SCROLL, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ALLOW_SCROLL, value).apply()

    var danmakuAllowColor: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ALLOW_COLOR, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ALLOW_COLOR, value).apply()

    var danmakuAllowSpecial: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ALLOW_SPECIAL, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ALLOW_SPECIAL, value).apply()

    var danmakuAiShieldEnabled: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_AI_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_AI_ENABLED, value).apply()

    var danmakuAiShieldLevel: Int
        get() = prefs.getInt(KEY_DANMAKU_AI_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_AI_LEVEL, value.coerceIn(0, 10)).apply()

    var danmakuFollowBiliShield: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_FOLLOW_BILI_SHIELD, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_FOLLOW_BILI_SHIELD, value).apply()

    var danmakuShowHighLikeIcon: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_SHOW_HIGH_LIKE_ICON, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_SHOW_HIGH_LIKE_ICON, value).apply()

    // v4.3: 本地弹幕关键词过滤
    var danmakuLocalKeywords: Set<String>
        get() = prefs.getStringSet(KEY_DANMAKU_LOCAL_KEYWORDS, emptySet()) ?: emptySet()
        set(value) = prefs.edit().putStringSet(KEY_DANMAKU_LOCAL_KEYWORDS, value).apply()

    // v6.4: 弹幕关键词高亮
    var danmakuHighlightKeywords: Set<String>
        get() = prefs.getStringSet(KEY_DANMAKU_HIGHLIGHT_KEYWORDS, emptySet()) ?: emptySet()
        set(value) = prefs.edit().putStringSet(KEY_DANMAKU_HIGHLIGHT_KEYWORDS, value).apply()

    var danmakuHighlightColor: Int
        get() = prefs.getInt(KEY_DANMAKU_HIGHLIGHT_COLOR, 0xFFFF00)  // 默认黄色
        set(value) = prefs.edit().putInt(KEY_DANMAKU_HIGHLIGHT_COLOR, value).apply()

    // v6.7: 弹幕发送历史
    var danmakuSendHistory: List<String>
        get() = loadStringList(KEY_DANMAKU_SEND_HISTORY)
        set(value) = saveStringList(KEY_DANMAKU_SEND_HISTORY, value.take(danmakuSendHistoryLimit))

    // v12.3: 弹幕发送历史数量限制
    var danmakuSendHistoryLimit: Int
        get() = prefs.getInt(KEY_DANMAKU_SEND_HISTORY_LIMIT, 10)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_SEND_HISTORY_LIMIT, value.coerceIn(5, 100)).apply()

    fun addDanmakuSendHistory(message: String) {
        val old = danmakuSendHistory.toMutableList()
        old.remove(message)
        old.add(0, message)
        danmakuSendHistory = old.take(danmakuSendHistoryLimit)
    }

    // v9.8: 清空弹幕发送历史
    fun clearDanmakuSendHistory() {
        prefs.edit().remove(KEY_DANMAKU_SEND_HISTORY).apply()
    }

    // v9.2: 评论排序偏好
    var commentSort: Int
        get() = prefs.getInt(KEY_COMMENT_SORT, 1) // 0=new, 1=hot, 2=reply
        set(value) = prefs.edit().putInt(KEY_COMMENT_SORT, value.coerceIn(0, 2)).apply()

    // v10.1: 屏幕常亮
    var keepScreenOn: Boolean
        get() = prefs.getBoolean(KEY_KEEP_SCREEN_ON, true)
        set(value) = prefs.edit().putBoolean(KEY_KEEP_SCREEN_ON, value).apply()

    // v10.2: 弹幕去重
    var danmakuDedup: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_DEDUP, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_DEDUP, value).apply()

    // v11.1: 评论关键词过滤
    var commentFilterKeywords: Set<String>
        get() = prefs.getStringSet(KEY_COMMENT_FILTER_KEYWORDS, emptySet()) ?: emptySet()
        set(value) = prefs.edit().putStringSet(KEY_COMMENT_FILTER_KEYWORDS, value).apply()

    // v11.3: 弹幕最大数量限制
    var danmakuMaxCount: Int
        get() = prefs.getInt(KEY_DANMAKU_MAX_COUNT, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_MAX_COUNT, value.coerceIn(0, 5000)).apply()

    // v11.4: 视频简介自动展开
    var autoExpandDesc: Boolean
        get() = prefs.getBoolean(KEY_AUTO_EXPAND_DESC, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_EXPAND_DESC, value).apply()

    // v11.5: 直播弹幕发送历史
    var liveDanmakuHistory: List<String>
        get() {
            val raw = prefs.getString(KEY_LIVE_DANMAKU_HISTORY, "") ?: ""
            return if (raw.isBlank()) emptyList() else raw.split("\u001F").filter { it.isNotBlank() }
        }
        set(value) {
            val s = value.filter { it.isNotBlank() }.joinToString("\u001F")
            prefs.edit().putString(KEY_LIVE_DANMAKU_HISTORY, s).apply()
        }

    // v11.7: 字幕延迟 (毫秒)
    var subtitleDelayMs: Long
        get() = prefs.getLong(KEY_SUBTITLE_DELAY_MS, 0L)
        set(value) = prefs.edit().putLong(KEY_SUBTITLE_DELAY_MS, value.coerceIn(-10000L, 10000L)).apply()

    // v11.8: 视频循环模式 (0=关, 1=单视频循环)
    var videoLoopMode: Int
        get() = prefs.getInt(KEY_VIDEO_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_LOOP_MODE, value.coerceIn(0, 1)).apply()

    // v11.9: 默认亮度 (-1=系统默认, 0.0~1.0)
    var defaultBrightness: Float
        get() = prefs.getFloat(KEY_DEFAULT_BRIGHTNESS, -1f)
        set(value) = prefs.edit().putFloat(KEY_DEFAULT_BRIGHTNESS, value.coerceIn(-1f, 1f)).apply()

    // v12.1: 截图水印模式 (0=关, 1=仅标题, 2=标题+UP主, 3=标题+UP主+时间)
    var screenshotWatermarkMode: Int
        get() = prefs.getInt(KEY_SCREENSHOT_WATERMARK_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_SCREENSHOT_WATERMARK_MODE, value.coerceIn(0, 3)).apply()

    // v12.22: 截图水印位置
    var screenshotWatermarkPosition: Int
        get() = prefs.getInt(KEY_SCREENSHOT_WATERMARK_POSITION, 2) // 默认左下
        set(value) = prefs.edit().putInt(KEY_SCREENSHOT_WATERMARK_POSITION, value.coerceIn(0, 3)).apply()

    // v12.23: 弹幕描边颜色
    var danmakuStrokeColor: Int
        get() = prefs.getInt(KEY_DANMAKU_STROKE_COLOR, 0x000000) // 默认黑色
        set(value) = prefs.edit().putInt(KEY_DANMAKU_STROKE_COLOR, value).apply()

    // v12.25: 视频质量指示器
    var videoQualityIndicatorEnabled: Boolean
        get() = prefs.getBoolean(KEY_VIDEO_QUALITY_INDICATOR, false)
        set(value) = prefs.edit().putBoolean(KEY_VIDEO_QUALITY_INDICATOR, value).apply()

    // v12.26: 视频色彩调节
    var videoBrightness: Int
        get() = prefs.getInt(KEY_VIDEO_BRIGHTNESS, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_BRIGHTNESS, value.coerceIn(-100, 100)).apply()
    var videoContrast: Int
        get() = prefs.getInt(KEY_VIDEO_CONTRAST, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_CONTRAST, value.coerceIn(-100, 100)).apply()
    var videoSaturation: Int
        get() = prefs.getInt(KEY_VIDEO_SATURATION, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_SATURATION, value.coerceIn(-100, 100)).apply()

    // v12.27: 视频画面裁剪
    var videoCropLeft: Int
        get() = prefs.getInt(KEY_VIDEO_CROP_LEFT, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_CROP_LEFT, value.coerceIn(0, 50)).apply()
    var videoCropTop: Int
        get() = prefs.getInt(KEY_VIDEO_CROP_TOP, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_CROP_TOP, value.coerceIn(0, 50)).apply()
    var videoCropRight: Int
        get() = prefs.getInt(KEY_VIDEO_CROP_RIGHT, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_CROP_RIGHT, value.coerceIn(0, 50)).apply()
    var videoCropBottom: Int
        get() = prefs.getInt(KEY_VIDEO_CROP_BOTTOM, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_CROP_BOTTOM, value.coerceIn(0, 50)).apply()

    // v12.28: 视频画面锐化/模糊
    var videoSharpenLevel: Int
        get() = prefs.getInt(KEY_VIDEO_SHARPEN_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_SHARPEN_LEVEL, value.coerceIn(-100, 100)).apply()

    // v12.29: 视频画面色温调节
    var videoColorTemperature: Int
        get() = prefs.getInt(KEY_VIDEO_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_COLOR_TEMPERATURE, value.coerceIn(-100, 100)).apply()

    // v12.30: 视频画面滤镜预设
    var videoFilterPreset: Int
        get() = prefs.getInt(KEY_VIDEO_FILTER_PRESET, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_FILTER_PRESET, value.coerceIn(0, 7)).apply()

    // v13.1: 手势自定义
    var gestureDoubleTapLeft: Int
        get() = prefs.getInt(KEY_GESTURE_DOUBLE_TAP_LEFT, 1) // 默认: SEEK_BACK_10
        set(value) = prefs.edit().putInt(KEY_GESTURE_DOUBLE_TAP_LEFT, value).apply()
    var gestureDoubleTapCenter: Int
        get() = prefs.getInt(KEY_GESTURE_DOUBLE_TAP_CENTER, 4) // 默认: TOGGLE_PLAY_PAUSE
        set(value) = prefs.edit().putInt(KEY_GESTURE_DOUBLE_TAP_CENTER, value).apply()
    var gestureDoubleTapRight: Int
        get() = prefs.getInt(KEY_GESTURE_DOUBLE_TAP_RIGHT, 2) // 默认: SEEK_FORWARD_10
        set(value) = prefs.edit().putInt(KEY_GESTURE_DOUBLE_TAP_RIGHT, value).apply()

    // v13.7: 剩余时间倒计时显示
    var countdownDisplayEnabled: Boolean
        get() = prefs.getBoolean(KEY_COUNTDOWN_DISPLAY, false)
        set(value) = prefs.edit().putBoolean(KEY_COUNTDOWN_DISPLAY, value).apply()

    // v13.8: 播放速度曲线显示
    var speedCurveDisplayEnabled: Boolean
        get() = prefs.getBoolean(KEY_SPEED_CURVE_DISPLAY, false)
        set(value) = prefs.edit().putBoolean(KEY_SPEED_CURVE_DISPLAY, value).apply()

    // v13.9: 播放位置百分比显示
    var percentageDisplayEnabled: Boolean
        get() = prefs.getBoolean(KEY_PERCENTAGE_DISPLAY, false)
        set(value) = prefs.edit().putBoolean(KEY_PERCENTAGE_DISPLAY, value).apply()

    // v13.10: 视频亮度记忆
    var brightnessMemoryEnabled: Boolean
        get() = prefs.getBoolean(KEY_BRIGHTNESS_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_BRIGHTNESS_MEMORY, value).apply()
    var lastVideoBrightness: Float
        get() = prefs.getFloat(KEY_LAST_VIDEO_BRIGHTNESS, 0f)
        set(value) = prefs.edit().putFloat(KEY_LAST_VIDEO_BRIGHTNESS, value).apply()

    // v13.15: 音量记忆
    var volumeMemoryEnabled: Boolean
        get() = prefs.getBoolean(KEY_VOLUME_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_VOLUME_MEMORY, value).apply()
    var lastVideoVolume: Int
        get() = prefs.getInt(KEY_LAST_VIDEO_VOLUME, -1)
        set(value) = prefs.edit().putInt(KEY_LAST_VIDEO_VOLUME, value.coerceIn(-1, 100)).apply()

    // v13.16: 播放位置记忆
    var playbackPositionMemoryEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYBACK_POSITION_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYBACK_POSITION_MEMORY, value).apply()
    var lastVideoPosition: Long
        get() = prefs.getLong(KEY_LAST_VIDEO_POSITION, 0L)
        set(value) = prefs.edit().putLong(KEY_LAST_VIDEO_POSITION, value).apply()

    // v13.17: 视频画质记忆
    var qualityMemoryEnabled: Boolean
        get() = prefs.getBoolean(KEY_QUALITY_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_QUALITY_MEMORY, value).apply()

    // v13.18: 弹幕描边样式
    var danmakuStrokeStyle: Int
        get() = prefs.getInt(KEY_DANMAKU_STROKE_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_STROKE_STYLE, value.coerceIn(0, 3)).apply()

    // v13.19: 截图保存路径
    var screenshotSavePath: String
        get() = prefs.getString(KEY_SCREENSHOT_SAVE_PATH, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_SCREENSHOT_SAVE_PATH, value).apply()

    // v13.20: 播放速度微调
    var speedFineTuneEnabled: Boolean
        get() = prefs.getBoolean(KEY_SPEED_FINE_TUNE, false)
        set(value) = prefs.edit().putBoolean(KEY_SPEED_FINE_TUNE, value).apply()

    // v13.21: 弹幕时间轴预览
    var danmakuTimelinePreviewEnabled: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_TIMELINE_PREVIEW, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_TIMELINE_PREVIEW, value).apply()

    // v13.22: 弹幕速度预设
    var danmakuSpeedPreset: Int
        get() = prefs.getInt(KEY_DANMAKU_SPEED_PRESET, 1)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_SPEED_PRESET, value.coerceIn(0, 5)).apply()

    // v14.1: 自动连播
    var autoPlaylistEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUTO_PLAYLIST, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_PLAYLIST, value).apply()

    // v14.2: 弹幕透明度预设
    var danmakuOpacityPreset: Int
        get() = prefs.getInt(KEY_DANMAKU_OPACITY_PRESET, 100)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_OPACITY_PRESET, value.coerceIn(0, 100)).apply()

    // v14.3: 播放列表排序方式
    var playlistSortOrder: Int
        get() = prefs.getInt(KEY_PLAYLIST_SORT_ORDER, 0)
        set(value) = prefs.edit().putInt(KEY_PLAYLIST_SORT_ORDER, value.coerceIn(0, 3)).apply()

    // v14.4: 快捷键映射
    var shortcutKeyMapping: String
        get() = prefs.getString(KEY_SHORTCUT_KEY_MAPPING, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_SHORTCUT_KEY_MAPPING, value).apply()

    // v14.5: 视频对比模式
    var videoCompareModeEnabled: Boolean
        get() = prefs.getBoolean(KEY_VIDEO_COMPARE_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_VIDEO_COMPARE_MODE, value).apply()

    // v14.6: 弹幕过滤规则预设
    var danmakuFilterPreset: Int
        get() = prefs.getInt(KEY_DANMAKU_FILTER_PRESET, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_FILTER_PRESET, value.coerceIn(0, 5)).apply()

    // v14.7: 记住播放倍速
    var rememberPlaybackSpeed: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_PLAYBACK_SPEED, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_PLAYBACK_SPEED, value).apply()

    // v14.8: 弹幕发送快捷键
    var danmakuQuickSendEnabled: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_QUICK_SEND, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_QUICK_SEND, value).apply()

    // v14.9: 视频缩略图预览
    var thumbnailPreviewEnabled: Boolean
        get() = prefs.getBoolean(KEY_THUMBNAIL_PREVIEW, false)
        set(value) = prefs.edit().putBoolean(KEY_THUMBNAIL_PREVIEW, value).apply()

    // v14.10: 播放历史记录导出
    var exportPlayHistoryEnabled: Boolean
        get() = prefs.getBoolean(KEY_EXPORT_PLAY_HISTORY, false)
        set(value) = prefs.edit().putBoolean(KEY_EXPORT_PLAY_HISTORY, value).apply()

    // v14.11: 弹幕字体阴影
    var danmakuTextShadow: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_TEXT_SHADOW, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_TEXT_SHADOW, value).apply()

    // v14.12: 音频可视化
    var audioVisualizerEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUDIO_VISUALIZER, false)
        set(value) = prefs.edit().putBoolean(KEY_AUDIO_VISUALIZER, value).apply()

    // v14.13: 播放失败重试
    var autoRetryEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUTO_RETRY, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_RETRY, value).apply()

    // v14.14: 双击反馈震动
    var doubleTapHapticEnabled: Boolean
        get() = prefs.getBoolean(KEY_DOUBLE_TAP_HAPTIC, true)
        set(value) = prefs.edit().putBoolean(KEY_DOUBLE_TAP_HAPTIC, value).apply()

    // v14.15: 弹幕呼吸灯效果
    var danmakuBreathingEnabled: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_BREATHING, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_BREATHING, value).apply()

    // v14.16: 锁屏播放控制
    var lockScreenControlEnabled: Boolean
        get() = prefs.getBoolean(KEY_LOCK_SCREEN_CONTROL, true)
        set(value) = prefs.edit().putBoolean(KEY_LOCK_SCREEN_CONTROL, value).apply()

    // v14.17: 跳过结尾动画
    var skipEndingAnimationEnabled: Boolean
        get() = prefs.getBoolean(KEY_SKIP_ENDING_ANIMATION, false)
        set(value) = prefs.edit().putBoolean(KEY_SKIP_ENDING_ANIMATION, value).apply()

    // v14.18: 记忆播放模式
    var rememberPlayMode: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_PLAY_MODE, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_PLAY_MODE, value).apply()

    // v14.19: 弹幕池容量
    var danmakuPoolSize: Int
        get() = prefs.getInt(KEY_DANMAKU_POOL_SIZE, 1000)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_POOL_SIZE, value.coerceIn(100, 5000)).apply()

    // v14.20: 视频投射模式
    var castModeEnabled: Boolean
        get() = prefs.getBoolean(KEY_CAST_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_CAST_MODE, value).apply()

    // v15.1: 弹幕缩放比例
    var danmakuScale: Float
        get() = prefs.getFloat(KEY_DANMAKU_SCALE, 1.0f)
        set(value) = prefs.edit().putFloat(KEY_DANMAKU_SCALE, value.coerceIn(0.5f, 2.0f)).apply()

    // v15.2: 自动播放下一集
    var autoPlayNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_AUTO_PLAY_NEXT_EPISODE, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_PLAY_NEXT_EPISODE, value).apply()

    // v15.3: 弹幕描边模糊
    var danmakuStrokeBlur: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_STROKE_BLUR, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_STROKE_BLUR, value).apply()

    // v15.4: 记住音量
    var rememberVolume: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_VOLUME, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_VOLUME, value).apply()

    // v15.5: 记住亮度
    var rememberBrightness: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_BRIGHTNESS, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_BRIGHTNESS, value).apply()

    // v15.6: 弹幕间隔时间
    var danmakuInterval: Int
        get() = prefs.getInt(KEY_DANMAKU_INTERVAL, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_INTERVAL, value.coerceIn(0, 500)).apply()

    // v15.7: 播放速度曲线
    var playbackSpeedCurve: Boolean
        get() = prefs.getBoolean(KEY_PLAYBACK_SPEED_CURVE, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYBACK_SPEED_CURVE, value).apply()

    // v15.8: 弹幕池优先级
    var danmakuPoolPriority: Int
        get() = prefs.getInt(KEY_DANMAKU_POOL_PRIORITY, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_POOL_PRIORITY, value.coerceIn(0, 2)).apply()

    // v15.9: 视频镜像翻转
    var videoMirrorEnabled: Boolean
        get() = prefs.getBoolean(KEY_VIDEO_MIRROR, false)
        set(value) = prefs.edit().putBoolean(KEY_VIDEO_MIRROR, value).apply()

    // v15.10: 弹幕时间偏移
    var danmakuTimeOffset: Int
        get() = prefs.getInt(KEY_DANMAKU_TIME_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_TIME_OFFSET, value.coerceIn(-300, 300)).apply()

    // v15.11: 自动跳过片头
    var autoSkipOpening: Boolean
        get() = prefs.getBoolean(KEY_AUTO_SKIP_OPENING, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_SKIP_OPENING, value).apply()

    // v15.12: 弹幕透明度动画
    var danmakuOpacityAnimation: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_OPACITY_ANIM, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_OPACITY_ANIM, value).apply()

    // v15.13: 弹幕发送历史备份
    var danmakuSendHistoryBackup: String
        get() = prefs.getString(KEY_DANMAKU_SEND_HISTORY_BACKUP, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_DANMAKU_SEND_HISTORY_BACKUP, value).apply()

    // v15.14: 视频旋转记忆
    var rememberVideoRotation: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_VIDEO_ROTATION, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_VIDEO_ROTATION, value).apply()

    // v15.15: 弹幕模糊半径
    var danmakuBlurRadius: Int
        get() = prefs.getInt(KEY_DANMAKU_BLUR_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_BLUR_RADIUS, value.coerceIn(0, 20)).apply()

    // v15.16: 快捷分享
    var quickShareEnabled: Boolean
        get() = prefs.getBoolean(KEY_QUICK_SHARE, true)
        set(value) = prefs.edit().putBoolean(KEY_QUICK_SHARE, value).apply()

    // v15.17: 记住弹幕开关
    var rememberDanmakuEnabled: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_DANMAKU_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_DANMAKU_ENABLED, value).apply()

    // v15.18: 弹幕入场动画
    var danmakuEntryAnimation: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ENTRY_ANIM, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ENTRY_ANIM, value).apply()

    // v15.19: 视频截图质量
    var screenshotQuality: Int
        get() = prefs.getInt(KEY_SCREENSHOT_QUALITY, 100)
        set(value) = prefs.edit().putInt(KEY_SCREENSHOT_QUALITY, value.coerceIn(50, 100)).apply()

    // v15.20: 弹幕输出模式
    var danmakuOutputMode: Int
        get() = prefs.getInt(KEY_DANMAKU_OUTPUT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_OUTPUT_MODE, value.coerceIn(0, 2)).apply()

    // v15.21: 播放进度条样式
    var progressBarStyle: Int
        get() = prefs.getInt(KEY_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_PROGRESS_BAR_STYLE, value.coerceIn(0, 2)).apply()

    // v15.22: 弹幕渲染层级
    var danmakuRenderLayer: Int
        get() = prefs.getInt(KEY_DANMAKU_RENDER_LAYER, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_RENDER_LAYER, value.coerceIn(0, 3)).apply()

    // v15.23: 自动播放记忆
    var rememberAutoPlay: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_AUTO_PLAY, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_AUTO_PLAY, value).apply()

    // v15.24: 弹幕过滤关键词
    var danmakuFilterKeywords: String
        get() = prefs.getString(KEY_DANMAKU_FILTER_KEYWORDS, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_DANMAKU_FILTER_KEYWORDS, value).apply()

    // v15.25: 视频色彩空间
    var videoColorSpace: Int
        get() = prefs.getInt(KEY_VIDEO_COLOR_SPACE, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_COLOR_SPACE, value.coerceIn(0, 4)).apply()

    // v15.26: 弹幕发送快捷键
    var danmakuSendKey: Int
        get() = prefs.getInt(KEY_DANMAKU_SEND_KEY, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_SEND_KEY, value.coerceIn(0, 5)).apply()

    // v15.27: 播放倍速预设
    var playbackSpeedPresets: String
        get() = prefs.getString(KEY_PLAYBACK_SPEED_PRESETS, "0.5,0.75,1.0,1.25,1.5,2.0").orEmpty()
        set(value) = prefs.edit().putString(KEY_PLAYBACK_SPEED_PRESETS, value).apply()

    // v15.28: 弹幕过滤正则
    var danmakuFilterRegex: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_FILTER_REGEX, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_FILTER_REGEX, value).apply()

    // v15.29: 视频投射设备
    var castDeviceName: String
        get() = prefs.getString(KEY_CAST_DEVICE_NAME, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_CAST_DEVICE_NAME, value).apply()

    // v15.30: 弹幕描边3D效果
    var danmakuStroke3D: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_STROKE_3D, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_STROKE_3D, value).apply()

    // v16.1: 弹幕字体描边颜色
    var danmakuStrokeColorV2: Int
        get() = prefs.getInt(KEY_DANMAKU_STROKE_COLOR_V2, 0xFF000000.toInt())
        set(value) = prefs.edit().putInt(KEY_DANMAKU_STROKE_COLOR_V2, value).apply()

    // v16.2: 弹幕抗锯齿
    var danmakuAntiAliasing: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_ANTI_ALIASING, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_ANTI_ALIASING, value).apply()

    // v16.3: 视频倍速记忆
    var rememberVideoSpeed: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_VIDEO_SPEED, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_VIDEO_SPEED, value).apply()

    // v16.4: 弹幕发送确认
    var danmakuSendConfirm: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_SEND_CONFIRM, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_SEND_CONFIRM, value).apply()

    // v16.5: 播放完成后动作
    var playbackCompleteAction: Int
        get() = prefs.getInt(KEY_PLAYBACK_COMPLETE_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_PLAYBACK_COMPLETE_ACTION, value.coerceIn(0, 3)).apply()

    // v16.6: 弹幕显示区域
    var danmakuDisplayArea: Float
        get() = prefs.getFloat(KEY_DANMAKU_DISPLAY_AREA, 1.0f)
        set(value) = prefs.edit().putFloat(KEY_DANMAKU_DISPLAY_AREA, value.coerceIn(0.5f, 1.0f)).apply()

    // v16.7: 视频解码方式
    var videoDecoder: Int
        get() = prefs.getInt(KEY_VIDEO_DECODER, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_DECODER, value.coerceIn(0, 2)).apply()

    // v16.8: 弹幕发送框位置
    var danmakuInputPosition: Int
        get() = prefs.getInt(KEY_DANMAKU_INPUT_POSITION, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_INPUT_POSITION, value.coerceIn(0, 2)).apply()

    // v16.9: 跳过片尾时长
    var skipEndingDuration: Int
        get() = prefs.getInt(KEY_SKIP_ENDING_DURATION, 0)
        set(value) = prefs.edit().putInt(KEY_SKIP_ENDING_DURATION, value.coerceIn(0, 300)).apply()

    // v16.10: 弹幕粗体模式
    var danmakuBoldMode: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_BOLD_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_BOLD_MODE, value).apply()

    // v16.11: 视频投射音量
    var castVolume: Int
        get() = prefs.getInt(KEY_CAST_VOLUME, 100)
        set(value) = prefs.edit().putInt(KEY_CAST_VOLUME, value.coerceIn(0, 100)).apply()

    // v16.12: 记住弹幕密度
    var rememberDanmakuDensity: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_DANMAKU_DENSITY, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_DANMAKU_DENSITY, value).apply()

    // v16.13: 弹幕刷新率
    var danmakuRefreshRate: Int
        get() = prefs.getInt(KEY_DANMAKU_REFRESH_RATE, 60)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_REFRESH_RATE, value.coerceIn(30, 120)).apply()

    // v16.14: 视频截图格式
    var screenshotFormat: Int
        get() = prefs.getInt(KEY_SCREENSHOT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_SCREENSHOT_FORMAT, value.coerceIn(0, 2)).apply()

    // v16.15: 弹幕描边透明度
    var danmakuStrokeOpacity: Float
        get() = prefs.getFloat(KEY_DANMAKU_STROKE_OPACITY, 1.0f)
        set(value) = prefs.edit().putFloat(KEY_DANMAKU_STROKE_OPACITY, value.coerceIn(0.0f, 1.0f)).apply()

    // v17.1: 弹幕发光效果
    var danmakuGlowEffect: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_GLOW_EFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_GLOW_EFFECT, value).apply()

    // v17.2: 视频缓存路径
    var videoCachePath: String
        get() = prefs.getString(KEY_VIDEO_CACHE_PATH, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_VIDEO_CACHE_PATH, value).apply()

    // v17.3: 弹幕合并模式
    var danmakuMergeMode: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_MERGE_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_MERGE_MODE, value).apply()

    // v17.4: 记住播放比例
    var rememberAspectRatio: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_ASPECT_RATIO, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_ASPECT_RATIO, value).apply()

    // v17.5: 弹幕字体选择
    var danmakuFontFamily: Int
        get() = prefs.getInt(KEY_DANMAKU_FONT_FAMILY, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_FONT_FAMILY, value.coerceIn(0, 5)).apply()

    // v17.6: 视频投射延迟
    var castLatency: Int
        get() = prefs.getInt(KEY_CAST_LATENCY, 0)
        set(value) = prefs.edit().putInt(KEY_CAST_LATENCY, value.coerceIn(0, 500)).apply()

    // v17.7: 弹幕过滤强度
    var danmakuFilterStrength: Int
        get() = prefs.getInt(KEY_DANMAKU_FILTER_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_FILTER_STRENGTH, value.coerceIn(0, 100)).apply()

    // v17.8: 播放列表循环模式
    var playlistLoopMode: Int
        get() = prefs.getInt(KEY_PLAYLIST_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_PLAYLIST_LOOP_MODE, value.coerceIn(0, 2)).apply()

    // v17.9: 弹幕时间戳显示
    var danmakuTimestampVisible: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_TIMESTAMP_VISIBLE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_TIMESTAMP_VISIBLE, value).apply()

    // v17.10: 视频缩放模式
    var videoScaleMode: Int
        get() = prefs.getInt(KEY_VIDEO_SCALE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_SCALE_MODE, value.coerceIn(0, 4)).apply()

    // v17.11: 自动清理缓存
    var autoCleanCache: Boolean
        get() = prefs.getBoolean(KEY_AUTO_CLEAN_CACHE, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_CLEAN_CACHE, value).apply()

    // v17.12: 弹幕预览模式
    var danmakuPreviewMode: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_PREVIEW_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_PREVIEW_MODE, value).apply()

    // v17.13: 记住弹幕位置
    var rememberDanmakuPosition: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_DANMAKU_POSITION, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_DANMAKU_POSITION, value).apply()

    // v17.14: 视频HDR模式
    var videoHdrMode: Int
        get() = prefs.getInt(KEY_VIDEO_HDR_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_HDR_MODE, value.coerceIn(0, 3)).apply()

    // v17.15: 弹幕描边渐变
    var danmakuStrokeGradient: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_STROKE_GRADIENT, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_STROKE_GRADIENT, value).apply()

    // v18.1: 弹幕延迟发送
    var danmakuDelayedSend: Int
        get() = prefs.getInt(KEY_DANMAKU_DELAYED_SEND, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_DELAYED_SEND, value.coerceIn(0, 10)).apply()

    // v18.2: 视频投屏标准
    var castStandard: Int
        get() = prefs.getInt(KEY_CAST_STANDARD, 0)
        set(value) = prefs.edit().putInt(KEY_CAST_STANDARD, value.coerceIn(0, 2)).apply()

    // v18.3: 弹幕滚动速度
    var danmakuScrollSpeed: Int
        get() = prefs.getInt(KEY_DANMAKU_SCROLL_SPEED, 1)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_SCROLL_SPEED, value.coerceIn(0, 5)).apply()

    // v18.4: 记住画中画模式
    var rememberPipMode: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_PIP_MODE, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_PIP_MODE, value).apply()

    // v18.5: 弹幕文字阴影颜色
    var danmakuTextShadowColor: Int
        get() = prefs.getInt(KEY_DANMAKU_TEXT_SHADOW_COLOR, 0xFF000000.toInt())
        set(value) = prefs.edit().putInt(KEY_DANMAKU_TEXT_SHADOW_COLOR, value).apply()

    // v18.6: 视频自动旋转
    var autoRotateVideo: Boolean
        get() = prefs.getBoolean(KEY_AUTO_ROTATE_VIDEO, true)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_ROTATE_VIDEO, value).apply()

    // v18.7: 弹幕过滤模式
    var danmakuFilterMode: Int
        get() = prefs.getInt(KEY_DANMAKU_FILTER_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_FILTER_MODE, value.coerceIn(0, 3)).apply()

    // v18.8: 播放网络检测
    var networkCheckEnabled: Boolean
        get() = prefs.getBoolean(KEY_NETWORK_CHECK, true)
        set(value) = prefs.edit().putBoolean(KEY_NETWORK_CHECK, value).apply()

    // v18.10: 视频倍数记忆 (使用v16.10已有属性)
    // v18.11: 弹幕透明度记忆
    var rememberDanmakuOpacity: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_DANMAKU_OPACITY, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_DANMAKU_OPACITY, value).apply()

    // v18.12: 视频截图声音
    var screenshotSound: Boolean
        get() = prefs.getBoolean(KEY_SCREENSHOT_SOUND, true)
        set(value) = prefs.edit().putBoolean(KEY_SCREENSHOT_SOUND, value).apply()

    // v18.13: 弹幕历史记录上限
    var danmakuHistoryLimit: Int
        get() = prefs.getInt(KEY_DANMAKU_HISTORY_LIMIT, 100)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_HISTORY_LIMIT, value.coerceIn(10, 500)).apply()

    // v18.14: 播放记忆天数
    var playHistoryDays: Int
        get() = prefs.getInt(KEY_PLAY_HISTORY_DAYS, 30)
        set(value) = prefs.edit().putInt(KEY_PLAY_HISTORY_DAYS, value.coerceIn(7, 365)).apply()

    // v18.15: 弹幕字体轮廓
    var danmakuFontOutline: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_FONT_OUTLINE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_FONT_OUTLINE, value).apply()

    // v19.1: 弹幕动画效果
    var danmakuAnimation: Int
        get() = prefs.getInt(KEY_DANMAKU_ANIMATION, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_ANIMATION, value.coerceIn(0, 3)).apply()

    // v19.2: 视频弹幕同步
    var danmakuVideoSync: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_VIDEO_SYNC, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_VIDEO_SYNC, value).apply()

    // v19.3: 弹幕呼吸灯模式
    var danmakuBreathingMode: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_BREATHING_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_BREATHING_MODE, value).apply()

    // v19.4: 记住播放模式 (使用v16.x已有功能)
    // v19.5: 弹幕快速复制
    var danmakuQuickCopy: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_QUICK_COPY, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_QUICK_COPY, value).apply()

    // v19.6: 视频投射优先
    var castPriority: Int
        get() = prefs.getInt(KEY_CAST_PRIORITY, 0)
        set(value) = prefs.edit().putInt(KEY_CAST_PRIORITY, value.coerceIn(0, 2)).apply()

    // v19.7: 弹幕收藏功能
    var danmakuFavorite: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_FAVORITE, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_FAVORITE, value).apply()

    // v19.8: 记住播放速度 (使用v14.7已有功能)
    // v19.9: 弹幕智能屏蔽
    var danmakuSmartBlock: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_SMART_BLOCK, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_SMART_BLOCK, value).apply()

    // v19.10: 视频记忆亮度 (使用v16.x已有功能)
    // v19.11: 弹幕屏蔽关键词
    var blockKeywords: List<String>
        get() = prefs.getString(KEY_BLOCK_KEYWORDS, "").orEmpty().split("|||").filter { it.isNotEmpty() }
        set(value) = prefs.edit().putString(KEY_BLOCK_KEYWORDS, value.joinToString("|||")).apply()

    // v19.12: 视频投射镜像
    var castMirror: Boolean
        get() = prefs.getBoolean(KEY_CAST_MIRROR, false)
        set(value) = prefs.edit().putBoolean(KEY_CAST_MIRROR, value).apply()

    // v19.13: 弹幕显示延迟
    var danmakuDisplayDelay: Int
        get() = prefs.getInt(KEY_DANMAKU_DISPLAY_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_DISPLAY_DELAY, value.coerceIn(-500, 500)).apply()

    // v19.14: 记住音量 (使用v16.x已有功能)
    // v19.15: 弹幕背景模糊
    var danmakuBackgroundBlur: Int
        get() = prefs.getInt(KEY_DANMAKU_BACKGROUND_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_BACKGROUND_BLUR, value.coerceIn(0, 10)).apply()

    // v20.1: 弹幕彩虹特效
    var danmakuRainbowEffect: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_RAINBOW_EFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_RAINBOW_EFFECT, value).apply()

    // v20.2: 视频平滑过渡
    var videoSmoothTransition: Boolean
        get() = prefs.getBoolean(KEY_VIDEO_SMOOTH_TRANSITION, true)
        set(value) = prefs.edit().putBoolean(KEY_VIDEO_SMOOTH_TRANSITION, value).apply()

    // v20.3: 弹幕打字机效果
    var danmakuTypewriterEffect: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_TYPEWRITER_EFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_TYPEWRITER_EFFECT, value).apply()

    // v20.4: 记住播放列表顺序
    var rememberPlaylistOrder: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_PLAYLIST_ORDER, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_PLAYLIST_ORDER, value).apply()

    // v20.5: 弹幕批量复制
    var danmakuBatchCopy: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_BATCH_COPY, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_BATCH_COPY, value).apply()

    // v20.6: 视频投射性能模式
    var castPerformanceMode: Boolean
        get() = prefs.getBoolean(KEY_CAST_PERFORMANCE_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_CAST_PERFORMANCE_MODE, value).apply()

    // v20.7: 弹幕缩放效果
    var danmakuZoomEffect: Int
        get() = prefs.getInt(KEY_DANMAKU_ZOOM_EFFECT, 100)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_ZOOM_EFFECT, value.coerceIn(50, 200)).apply()

    // v20.8: 视频自动跳过片头 (使用v16.x已有)
    // v20.9: 弹幕模板回复
    var danmakuTemplateReply: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_TEMPLATE_REPLY, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_TEMPLATE_REPLY, value).apply()

    // v20.10: 视频投射省电模式
    var castPowerSaving: Boolean
        get() = prefs.getBoolean(KEY_CAST_POWER_SAVING, false)
        set(value) = prefs.edit().putBoolean(KEY_CAST_POWER_SAVING, value).apply()

    // v20.11: 弹幕高亮特效
    var danmakuHighlightEffect: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_HIGHLIGHT_EFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_HIGHLIGHT_EFFECT, value).apply()

    // v20.12: 记住播放位置
    var rememberPlayPosition: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_PLAY_POSITION, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_PLAY_POSITION, value).apply()

    // v20.13: 弹幕发送动画
    var danmakuSendAnimation: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_SEND_ANIMATION, true)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_SEND_ANIMATION, value).apply()

    // v20.14: 视频记忆跳过
    var rememberSkipSettings: Boolean
        get() = prefs.getBoolean(KEY_REMEMBER_SKIP_SETTINGS, true)
        set(value) = prefs.edit().putBoolean(KEY_REMEMBER_SKIP_SETTINGS, value).apply()

    // v20.15: 弹幕3D效果
    var danmaku3DEffect: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_3D_EFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_3D_EFFECT, value).apply()

    // ==================== v22.x 新功能 ====================
    // v22.1: 播放速度曲线自定义（带v22前缀避免冲突）
    var v22PlaybackSpeedCurveMode: Int
        get() = prefs.getInt(KEY_V22_PLAYBACK_SPEED_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_PLAYBACK_SPEED_CURVE_MODE, value.coerceIn(0, 3)).apply()

    // v22.2: 弹幕颜色过滤
    var v22DanmakuColorFilterEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_DANMAKU_COLOR_FILTER_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_DANMAKU_COLOR_FILTER_ENABLED, value).apply()

    // v22.3: 视频画面锐化强度
    var v22VideoSharpenStrength: Int
        get() = prefs.getInt(KEY_V22_VIDEO_SHARPEN_STRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V22_VIDEO_SHARPEN_STRENGTH, value.coerceIn(0, 100)).apply()

    // v22.4: 弹幕描边颜色渐变
    var v22DanmakuStrokeGradientMode: Int
        get() = prefs.getInt(KEY_V22_DANMAKU_STROKE_GRADIENT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_DANMAKU_STROKE_GRADIENT_MODE, value.coerceIn(0, 2)).apply()

    // v22.5: 手势轨迹显示
    var v22ShowGestureTrail: Boolean
        get() = prefs.getBoolean(KEY_V22_SHOW_GESTURE_TRAIL, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_SHOW_GESTURE_TRAIL, value).apply()

    // v22.6: 视频缓存大小限制
    var v22VideoCacheSizeMB: Long
        get() = prefs.getLong(KEY_V22_VIDEO_CACHE_SIZE_MB, 512L)
        set(value) = prefs.edit().putLong(KEY_V22_VIDEO_CACHE_SIZE_MB, value.coerceIn(100L, 2048L)).apply()

    // v22.7: 弹幕发送字数统计
    var v22ShowDanmakuCharCount: Boolean
        get() = prefs.getBoolean(KEY_V22_SHOW_DANMAKU_CHAR_COUNT, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_SHOW_DANMAKU_CHAR_COUNT, value).apply()

    // v22.8: 视频画面降噪
    var v22VideoDenoiseEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_VIDEO_DENOISE_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_VIDEO_DENOISE_ENABLED, value).apply()

    // v22.9: 弹幕透明度动画曲线
    var v22DanmakuOpacityCurveMode: Int
        get() = prefs.getInt(KEY_V22_DANMAKU_OPACITY_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_DANMAKU_OPACITY_CURVE_MODE, value.coerceIn(0, 3)).apply()

    // v22.10: 播放器快捷面板自定义
    var v22QuickPanelCustomEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_QUICK_PANEL_CUSTOM_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_QUICK_PANEL_CUSTOM_ENABLED, value).apply()

    // v22.11: 视频投射分辨率限制
    var v22CastResolutionLimit: Int
        get() = prefs.getInt(KEY_V22_CAST_RESOLUTION_LIMIT, 0)
        set(value) = prefs.edit().putInt(KEY_V22_CAST_RESOLUTION_LIMIT, value).apply()

    // v22.12: 弹幕字体大小自适应
    var v22DanmakuFontAutoSizeMode: Int
        get() = prefs.getInt(KEY_V22_DANMAKU_FONT_AUTO_SIZE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V22_DANMAKU_FONT_AUTO_SIZE_MODE, value.coerceIn(0, 2)).apply()

    // v22.13: 播放器截图格式选择
    var v22ScreenshotFormat: String
        get() = prefs.getString(KEY_V22_SCREENSHOT_FORMAT, "png") ?: "png"
        set(value) = prefs.edit().putString(KEY_V22_SCREENSHOT_FORMAT, value).apply()

    // v22.14: 视频色彩饱和度调节
    var v22VideoSaturation: Int
        get() = prefs.getInt(KEY_V22_VIDEO_SATURATION, 100)
        set(value) = prefs.edit().putInt(KEY_V22_VIDEO_SATURATION, value.coerceIn(50, 150)).apply()

    // v22.15: 弹幕时间轴标记
    var v22DanmakuTimelineMarkerEnabled: Boolean
        get() = prefs.getBoolean(KEY_V22_DANMAKU_TIMELINE_MARKER_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V22_DANMAKU_TIMELINE_MARKER_ENABLED, value).apply()

    // ==================== v23.x 新功能 ====================
    // v23.1: 视频播放速度预设自定义
    var v23CustomSpeedPresets: String
        get() = prefs.getString(KEY_V23_CUSTOM_SPEED_PRESETS, "0.5,0.75,1.0,1.25,1.5,2.0,3.0") ?: "0.5,0.75,1.0,1.25,1.5,2.0,3.0"
        set(value) = prefs.edit().putString(KEY_V23_CUSTOM_SPEED_PRESETS, value).apply()
    var v23CustomSpeedPresetsEnabled: Boolean
        get() = prefs.getBoolean("v23_custom_speed_presets_enabled", false)
        set(value) = prefs.edit().putBoolean("v23_custom_speed_presets_enabled", value).apply()

    // v23.2: 弹幕字体阴影颜色
    var v23DanmakuShadowColor: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_SHADOW_COLOR, 0x000000)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_SHADOW_COLOR, value).apply()

    // v23.3: 视频画面色彩温度
    var v23VideoColorTemperature: Int
        get() = prefs.getInt(KEY_V23_VIDEO_COLOR_TEMPERATURE, 6500)
        set(value) = prefs.edit().putInt(KEY_V23_VIDEO_COLOR_TEMPERATURE, value.coerceIn(3000, 10000)).apply()

    // v23.4: 弹幕发送震动强度
    var v23DanmakuVibrationStrength: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_VIBRATION_STRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_VIBRATION_STRENGTH, value.coerceIn(0, 100)).apply()

    // v23.5: 播放器手势灵敏度
    var v23GestureSensitivity: Int
        get() = prefs.getInt(KEY_V23_GESTURE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_V23_GESTURE_SENSITIVITY, value.coerceIn(10, 100)).apply()

    // v23.6: 视频缓存预加载大小
    var v23CachePreloadSizeMB: Int
        get() = prefs.getInt(KEY_V23_CACHE_PRELOAD_SIZE_MB, 50)
        set(value) = prefs.edit().putInt(KEY_V23_CACHE_PRELOAD_SIZE_MB, value.coerceIn(10, 200)).apply()

    // v23.7: 弹幕显示区域透明度
    var v23DanmakuAreaOpacity: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_AREA_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_AREA_OPACITY, value.coerceIn(0, 100)).apply()

    // v23.8: 视频画面伽马调节
    var v23VideoGamma: Int
        get() = prefs.getInt(KEY_V23_VIDEO_GAMMA, 100)
        set(value) = prefs.edit().putInt(KEY_V23_VIDEO_GAMMA, value.coerceIn(50, 200)).apply()

    // v23.9: 弹幕发送确认震动
    var v23DanmakuSendConfirmVibration: Boolean
        get() = prefs.getBoolean(KEY_V23_DANMAKU_SEND_CONFIRM_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V23_DANMAKU_SEND_CONFIRM_VIBRATION, value).apply()

    // v23.10: 播放器快捷键映射
    var v23QuickKeyMapping: Boolean
        get() = prefs.getBoolean(KEY_V23_QUICK_KEY_MAPPING, false)
        set(value) = prefs.edit().putBoolean(KEY_V23_QUICK_KEY_MAPPING, value).apply()

    // v23.11: 视频投射缓冲大小
    var v23CastBufferSizeMB: Int
        get() = prefs.getInt(KEY_V23_CAST_BUFFER_SIZE_MB, 30)
        set(value) = prefs.edit().putInt(KEY_V23_CAST_BUFFER_SIZE_MB, value.coerceIn(10, 100)).apply()

    // v23.12: 弹幕字体间距调节
    var v23DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V23_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V23_DANMAKU_FONT_SPACING, value.coerceIn(-5, 10)).apply()

    // v23.13: 播放器截图质量
    var v23ScreenshotQuality: Int
        get() = prefs.getInt(KEY_V23_SCREENSHOT_QUALITY, 90)
        set(value) = prefs.edit().putInt(KEY_V23_SCREENSHOT_QUALITY, value.coerceIn(50, 100)).apply()

    // v23.14: 视频画面色调调节
    var v23VideoHue: Int
        get() = prefs.getInt(KEY_V23_VIDEO_HUE, 0)
        set(value) = prefs.edit().putInt(KEY_V23_VIDEO_HUE, value.coerceIn(-180, 180)).apply()

    // v23.15: 弹幕时间轴缩放速度
    var v23TimelineZoomSpeed: Int
        get() = prefs.getInt(KEY_V23_TIMELINE_ZOOM_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V23_TIMELINE_ZOOM_SPEED, value.coerceIn(10, 100)).apply()

    // ==================== v24.x 新功能 ====================
    // v24.1: 视频播放列表循环模式
    var v24PlaylistLoopMode: Int
        get() = prefs.getInt(KEY_V24_PLAYLIST_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_PLAYLIST_LOOP_MODE, value.coerceIn(0, 3)).apply()

    // v24.2: 弹幕字体描边粗细
    var v24DanmakuStrokeWidth: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_STROKE_WIDTH, 2)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_STROKE_WIDTH, value.coerceIn(0, 5)).apply()

    // v24.3: 视频画面亮度曲线
    var v24BrightnessCurveMode: Int
        get() = prefs.getInt(KEY_V24_BRIGHTNESS_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_BRIGHTNESS_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v24.4: 弹幕发送延迟调节
    var v24DanmakuSendDelay: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_SEND_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_SEND_DELAY, value.coerceIn(0, 2000)).apply()

    // v24.5: 播放器音量步进
    var v24VolumeStep: Int
        get() = prefs.getInt(KEY_V24_VOLUME_STEP, 5)
        set(value) = prefs.edit().putInt(KEY_V24_VOLUME_STEP, value.coerceIn(1, 20)).apply()

    // v24.6: 视频缓存清理间隔
    var v24CacheCleanupInterval: Int
        get() = prefs.getInt(KEY_V24_CACHE_CLEANUP_INTERVAL, 7)
        set(value) = prefs.edit().putInt(KEY_V24_CACHE_CLEANUP_INTERVAL, value.coerceIn(1, 30)).apply()

    // v24.7: 弹幕显示位置偏移
    var v24DanmakuPositionOffset: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_POSITION_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_POSITION_OFFSET, value.coerceIn(-50, 50)).apply()

    // v24.8: 视频画面对比度曲线
    var v24ContrastCurveMode: Int
        get() = prefs.getInt(KEY_V24_CONTRAST_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_CONTRAST_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v24.9: 弹幕发送历史记录数
    var v24DanmakuSendHistoryCount: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_SEND_HISTORY_COUNT, 20)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_SEND_HISTORY_COUNT, value.coerceIn(5, 100)).apply()

    // v24.10: 播放器进度条样式
    var v24ProgressBarStyle: Int
        get() = prefs.getInt(KEY_V24_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_PROGRESS_BAR_STYLE, value.coerceIn(0, 3)).apply()

    // v24.11: 视频投射画面质量
    var v24CastQuality: Int
        get() = prefs.getInt(KEY_V24_CAST_QUALITY, 1)
        set(value) = prefs.edit().putInt(KEY_V24_CAST_QUALITY, value.coerceIn(0, 3)).apply()

    // v24.12: 弹幕字体描边透明度
    var v24DanmakuStrokeOpacity: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_STROKE_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_STROKE_OPACITY, value.coerceIn(0, 100)).apply()

    // v24.13: 播放器手势双击功能
    var v24DoubleTapFunction: Int
        get() = prefs.getInt(KEY_V24_DOUBLE_TAP_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V24_DOUBLE_TAP_FUNCTION, value.coerceIn(0, 5)).apply()

    // v24.14: 视频画面色调曲线
    var v24ToneCurveMode: Int
        get() = prefs.getInt(KEY_V24_TONE_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V24_TONE_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v24.15: 弹幕显示刷新率
    var v24DanmakuRefreshRate: Int
        get() = prefs.getInt(KEY_V24_DANMAKU_REFRESH_RATE, 60)
        set(value) = prefs.edit().putInt(KEY_V24_DANMAKU_REFRESH_RATE, value.coerceIn(30, 120)).apply()

    // ==================== v25.x 新功能 ====================
    // v25.1: 视频播放列表随机播放
    var v25PlaylistShuffle: Boolean
        get() = prefs.getBoolean(KEY_V25_PLAYLIST_SHUFFLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V25_PLAYLIST_SHUFFLE, value).apply()

    // v25.2: 弹幕字体背景颜色
    var v25DanmakuBgColor: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_BG_COLOR, 0x000000)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_BG_COLOR, value).apply()

    // v25.3: 视频画面饱和度曲线
    var v25SaturationCurveMode: Int
        get() = prefs.getInt(KEY_V25_SATURATION_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V25_SATURATION_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v25.4: 弹幕发送确认对话框
    var v25DanmakuSendConfirm: Boolean
        get() = prefs.getBoolean(KEY_V25_DANMAKU_SEND_CONFIRM, false)
        set(value) = prefs.edit().putBoolean(KEY_V25_DANMAKU_SEND_CONFIRM, value).apply()

    // v25.5: 播放器音量记忆
    var v25RememberVolume: Boolean
        get() = prefs.getBoolean(KEY_V25_REMEMBER_VOLUME, false)
        set(value) = prefs.edit().putBoolean(KEY_V25_REMEMBER_VOLUME, value).apply()

    // v25.6: 视频缓存预加载策略
    var v25CachePreloadStrategy: Int
        get() = prefs.getInt(KEY_V25_CACHE_PRELOAD_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V25_CACHE_PRELOAD_STRATEGY, value.coerceIn(0, 3)).apply()

    // v25.7: 弹幕显示时间长度
    var v25DanmakuDisplayDuration: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_DISPLAY_DURATION, 10)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_DISPLAY_DURATION, value.coerceIn(5, 30)).apply()

    // v25.8: 视频画面锐化曲线
    var v25SharpenCurveMode: Int
        get() = prefs.getInt(KEY_V25_SHARPEN_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V25_SHARPEN_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v25.9: 弹幕发送历史记录
    var v25DanmakuSendHistory: Boolean
        get() = prefs.getBoolean(KEY_V25_DANMAKU_SEND_HISTORY, true)
        set(value) = prefs.edit().putBoolean(KEY_V25_DANMAKU_SEND_HISTORY, value).apply()

    // v25.10: 播放器进度条颜色
    var v25ProgressBarColor: Int
        get() = prefs.getInt(KEY_V25_PROGRESS_BAR_COLOR, 0xFFFFFF)
        set(value) = prefs.edit().putInt(KEY_V25_PROGRESS_BAR_COLOR, value).apply()

    // v25.11: 视频投射音频质量
    var v25CastAudioQuality: Int
        get() = prefs.getInt(KEY_V25_CAST_AUDIO_QUALITY, 1)
        set(value) = prefs.edit().putInt(KEY_V25_CAST_AUDIO_QUALITY, value.coerceIn(0, 3)).apply()

    // v25.12: 弹幕字体背景透明度
    var v25DanmakuBgOpacity: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_BG_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_BG_OPACITY, value.coerceIn(0, 100)).apply()

    // v25.13: 播放器手势长按功能
    var v25LongPressFunction: Int
        get() = prefs.getInt(KEY_V25_LONG_PRESS_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V25_LONG_PRESS_FUNCTION, value.coerceIn(0, 5)).apply()

    // v25.14: 视频画面降噪曲线
    var v25DenoiseCurveMode: Int
        get() = prefs.getInt(KEY_V25_DENOISE_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V25_DENOISE_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v25.15: 弹幕显示字体大小
    var v25DanmakuFontSize: Int
        get() = prefs.getInt(KEY_V25_DANMAKU_FONT_SIZE, 25)
        set(value) = prefs.edit().putInt(KEY_V25_DANMAKU_FONT_SIZE, value.coerceIn(12, 50)).apply()

    // ==================== v26.x 新功能 ====================
    // v26.1: 视频播放列表自动播放
    var v26PlaylistAutoPlay: Boolean
        get() = prefs.getBoolean(KEY_V26_PLAYLIST_AUTO_PLAY, true)
        set(value) = prefs.edit().putBoolean(KEY_V26_PLAYLIST_AUTO_PLAY, value).apply()

    // v26.2: 弹幕字体边框颜色
    var v26DanmakuBorderColor: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_BORDER_COLOR, 0x000000)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_BORDER_COLOR, value).apply()

    // v26.3: 视频画面对比度曲线
    var v26ContrastCurveMode: Int
        get() = prefs.getInt(KEY_V26_CONTRAST_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_CONTRAST_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v26.4: 弹幕发送确认震动
    var v26DanmakuSendVibration: Boolean
        get() = prefs.getBoolean(KEY_V26_DANMAKU_SEND_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V26_DANMAKU_SEND_VIBRATION, value).apply()

    // v26.5: 播放器音量均衡
    var v26VolumeBalance: Int
        get() = prefs.getInt(KEY_V26_VOLUME_BALANCE, 50)
        set(value) = prefs.edit().putInt(KEY_V26_VOLUME_BALANCE, value.coerceIn(0, 100)).apply()

    // v26.6: 视频缓存预加载大小
    var v26CachePreloadSize: Int
        get() = prefs.getInt(KEY_V26_CACHE_PRELOAD_SIZE, 50)
        set(value) = prefs.edit().putInt(KEY_V26_CACHE_PRELOAD_SIZE, value.coerceIn(10, 200)).apply()

    // v26.7: 弹幕显示透明度
    var v26DanmakuDisplayOpacity: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_DISPLAY_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_DISPLAY_OPACITY, value.coerceIn(0, 100)).apply()

    // v26.8: 视频画面亮度曲线
    var v26BrightnessCurveMode: Int
        get() = prefs.getInt(KEY_V26_BRIGHTNESS_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_BRIGHTNESS_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v26.9: 弹幕发送历史记录数
    var v26DanmakuHistoryCount: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_HISTORY_COUNT, 20)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_HISTORY_COUNT, value.coerceIn(5, 100)).apply()

    // v26.10: 播放器进度条透明度
    var v26ProgressBarOpacity: Int
        get() = prefs.getInt(KEY_V26_PROGRESS_BAR_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V26_PROGRESS_BAR_OPACITY, value.coerceIn(0, 100)).apply()

    // v26.11: 视频投射缓冲策略
    var v26CastBufferStrategy: Int
        get() = prefs.getInt(KEY_V26_CAST_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V26_CAST_BUFFER_STRATEGY, value.coerceIn(0, 3)).apply()

    // v26.12: 弹幕字体边框透明度
    var v26DanmakuBorderOpacity: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_BORDER_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_BORDER_OPACITY, value.coerceIn(0, 100)).apply()

    // v26.13: 播放器手势滑动功能
    var v26SwipeFunction: Int
        get() = prefs.getInt(KEY_V26_SWIPE_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V26_SWIPE_FUNCTION, value.coerceIn(0, 5)).apply()

    // v26.14: 视频画面饱和度曲线
    var v26SaturationCurveMode: Int
        get() = prefs.getInt(KEY_V26_SATURATION_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_SATURATION_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v26.15: 弹幕显示字体样式
    var v26DanmakuFontStyle: Int
        get() = prefs.getInt(KEY_V26_DANMAKU_FONT_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V26_DANMAKU_FONT_STYLE, value.coerceIn(0, 4)).apply()

    // ==================== v27.x 新功能 ====================
    // v27.1: 视频播放列表自动下一个
    var v27PlaylistAutoNext: Boolean
        get() = prefs.getBoolean(KEY_V27_PLAYLIST_AUTO_NEXT, true)
        set(value) = prefs.edit().putBoolean(KEY_V27_PLAYLIST_AUTO_NEXT, value).apply()

    // v27.2: 弹幕字体阴影透明度
    var v27DanmakuShadowOpacity: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_SHADOW_OPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_SHADOW_OPACITY, value.coerceIn(0, 100)).apply()

    // v27.3: 视频画面色彩平衡
    var v27ColorBalance: Int
        get() = prefs.getInt(KEY_V27_COLOR_BALANCE, 50)
        set(value) = prefs.edit().putInt(KEY_V27_COLOR_BALANCE, value.coerceIn(0, 100)).apply()

    // v27.4: 弹幕发送确认对话框
    var v27DanmakuSendConfirmDialog: Boolean
        get() = prefs.getBoolean(KEY_V27_DANMAKU_SEND_CONFIRM_DIALOG, false)
        set(value) = prefs.edit().putBoolean(KEY_V27_DANMAKU_SEND_CONFIRM_DIALOG, value).apply()

    // v27.5: 播放器音量限制
    var v27VolumeLimit: Int
        get() = prefs.getInt(KEY_V27_VOLUME_LIMIT, 100)
        set(value) = prefs.edit().putInt(KEY_V27_VOLUME_LIMIT, value.coerceIn(50, 150)).apply()

    // v27.6: 视频缓存清理策略
    var v27CacheCleanupStrategy: Int
        get() = prefs.getInt(KEY_V27_CACHE_CLEANUP_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V27_CACHE_CLEANUP_STRATEGY, value.coerceIn(0, 3)).apply()

    // v27.7: 弹幕显示位置对齐
    var v27DanmakuPositionAlign: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_POSITION_ALIGN, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_POSITION_ALIGN, value.coerceIn(0, 2)).apply()

    // v27.8: 视频画面色调曲线
    var v27ToneCurveMode: Int
        get() = prefs.getInt(KEY_V27_TONE_CURVE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V27_TONE_CURVE_MODE, value.coerceIn(0, 4)).apply()

    // v27.9: 弹幕发送历史记录大小
    var v27DanmakuHistorySize: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_HISTORY_SIZE, 50)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_HISTORY_SIZE, value.coerceIn(10, 200)).apply()

    // v27.10: 播放器进度条高度
    var v27ProgressBarHeight: Int
        get() = prefs.getInt(KEY_V27_PROGRESS_BAR_HEIGHT, 4)
        set(value) = prefs.edit().putInt(KEY_V27_PROGRESS_BAR_HEIGHT, value.coerceIn(2, 10)).apply()

    // v27.11: 视频投射画面延迟
    var v27CastDelay: Int
        get() = prefs.getInt(KEY_V27_CAST_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V27_CAST_DELAY, value.coerceIn(0, 5000)).apply()

    // v27.12: 弹幕字体阴影大小
    var v27DanmakuShadowSize: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_SHADOW_SIZE, 2)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_SHADOW_SIZE, value.coerceIn(0, 5)).apply()

    // v27.13: 播放器手势双击功能
    var v27DoubleTapFunction: Int
        get() = prefs.getInt(KEY_V27_DOUBLE_TAP_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DOUBLE_TAP_FUNCTION, value.coerceIn(0, 5)).apply()

    // v27.14: 视频画面降噪强度
    var v27DenoiseStrength: Int
        get() = prefs.getInt(KEY_V27_DENOISE_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DENOISE_STRENGTH, value.coerceIn(0, 100)).apply()

    // v27.15: 弹幕显示字体间距
    var v27DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V27_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DANMAKU_FONT_SPACING, value.coerceIn(-5, 10)).apply()
    
    // v28.1: 视频播放列表自动跳过
    var v28AutoSkip: Boolean
        get() = prefs.getBoolean(KEY_V28_AUTO_SKIP, false)
        set(value) = prefs.edit().putBoolean(KEY_V28_AUTO_SKIP, value).apply()
    
    // v28.2: 弹幕字体背景圆角
    var v28DanmakuBackgroundCornerRadius: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_BACKGROUND_CORNER_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_BACKGROUND_CORNER_RADIUS, value.coerceIn(0, 20)).apply()
    
    // v28.3: 视频画面色彩饱和度
    var v28ColorSaturation: Int
        get() = prefs.getInt(KEY_V28_COLOR_SATURATION, 0)
        set(value) = prefs.edit().putInt(KEY_V28_COLOR_SATURATION, value.coerceIn(-50, 50)).apply()
    
    // v28.4: 弹幕发送确认震动强度
    var v28SendConfirmVibrationStrength: Int
        get() = prefs.getInt(KEY_V28_SEND_CONFIRM_VIBRATION_STRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V28_SEND_CONFIRM_VIBRATION_STRENGTH, value.coerceIn(0, 100)).apply()
    
    // v28.5: 播放器音量淡入淡出
    var v28VolumeFade: Boolean
        get() = prefs.getBoolean(KEY_V28_VOLUME_FADE, false)
        set(value) = prefs.edit().putBoolean(KEY_V28_VOLUME_FADE, value).apply()
    
    // v28.6: 视频缓存预加载间隔
    var v28PreloadInterval: Int
        get() = prefs.getInt(KEY_V28_PRELOAD_INTERVAL, 5)
        set(value) = prefs.edit().putInt(KEY_V28_PRELOAD_INTERVAL, value.coerceIn(1, 30)).apply()
    
    // v28.7: 弹幕显示位置边距
    var v28DanmakuPositionMargin: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_POSITION_MARGIN, 10)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_POSITION_MARGIN, value.coerceIn(0, 50)).apply()
    
    // v28.8: 视频画面色彩对比度
    var v28ColorContrast: Int
        get() = prefs.getInt(KEY_V28_COLOR_CONTRAST, 0)
        set(value) = prefs.edit().putInt(KEY_V28_COLOR_CONTRAST, value.coerceIn(-50, 50)).apply()
    
    // v28.9: 弹幕发送历史记录清理
    var v28HistoryCleanup: Int
        get() = prefs.getInt(KEY_V28_HISTORY_CLEANUP, 0)
        set(value) = prefs.edit().putInt(KEY_V28_HISTORY_CLEANUP, value.coerceIn(0, 3)).apply()
    
    // v28.10: 播放器进度条圆角
    var v28ProgressBarCornerRadius: Int
        get() = prefs.getInt(KEY_V28_PROGRESS_BAR_CORNER_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V28_PROGRESS_BAR_CORNER_RADIUS, value.coerceIn(0, 20)).apply()
    
    // v28.11: 视频投射画面缓冲
    var v28CastBuffer: Int
        get() = prefs.getInt(KEY_V28_CAST_BUFFER, 5)
        set(value) = prefs.edit().putInt(KEY_V28_CAST_BUFFER, value.coerceIn(1, 30)).apply()
    
    // v28.12: 弹幕字体背景边距
    var v28DanmakuBackgroundPadding: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_BACKGROUND_PADDING, 0)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_BACKGROUND_PADDING, value.coerceIn(0, 20)).apply()
    
    // v28.13: 播放器手势滑动灵敏度
    var v28SwipeSensitivity: Int
        get() = prefs.getInt(KEY_V28_SWIPE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_V28_SWIPE_SENSITIVITY, value.coerceIn(10, 100)).apply()
    
    // v28.14: 视频画面色彩亮度
    var v28ColorBrightness: Int
        get() = prefs.getInt(KEY_V28_COLOR_BRIGHTNESS, 0)
        set(value) = prefs.edit().putInt(KEY_V28_COLOR_BRIGHTNESS, value.coerceIn(-50, 50)).apply()
    
    // v28.15: 弹幕显示字体阴影
    var v28DanmakuFontShadow: Int
        get() = prefs.getInt(KEY_V28_DANMAKU_FONT_SHADOW, 0)
        set(value) = prefs.edit().putInt(KEY_V28_DANMAKU_FONT_SHADOW, value.coerceIn(0, 100)).apply()
    
    // v29.1: 视频播放列表自动排序
    var v29AutoSort: Boolean
        get() = prefs.getBoolean(KEY_V29_AUTO_SORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V29_AUTO_SORT, value).apply()
    
    // v29.2: 弹幕字体背景颜色
    var v29DanmakuBackgroundColor: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_BACKGROUND_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_BACKGROUND_COLOR, value.coerceIn(0, 5)).apply()
    
    // v29.3: 视频画面色彩色调
    var v29ColorHue: Int
        get() = prefs.getInt(KEY_V29_COLOR_HUE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_HUE, value.coerceIn(-50, 50)).apply()
    
    // v29.4: 弹幕发送确认对话框样式
    var v29SendConfirmDialogStyle: Int
        get() = prefs.getInt(KEY_V29_SEND_CONFIRM_DIALOG_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_SEND_CONFIRM_DIALOG_STYLE, value.coerceIn(0, 3)).apply()
    
    // v29.5: 播放器音量限制模式
    var v29VolumeLimitMode: Int
        get() = prefs.getInt(KEY_V29_VOLUME_LIMIT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_VOLUME_LIMIT_MODE, value.coerceIn(0, 3)).apply()
    
    // v29.6: 视频缓存清理阈值
    var v29CacheCleanupThreshold: Int
        get() = prefs.getInt(KEY_V29_CACHE_CLEANUP_THRESHOLD, 100)
        set(value) = prefs.edit().putInt(KEY_V29_CACHE_CLEANUP_THRESHOLD, value.coerceIn(50, 1000)).apply()
    
    // v29.7: 弹幕显示位置偏移
    var v29DanmakuPositionOffset: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_POSITION_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_POSITION_OFFSET, value.coerceIn(-50, 50)).apply()
    
    // v29.8: 视频画面色彩色温
    var v29ColorTemperature: Int
        get() = prefs.getInt(KEY_V29_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_TEMPERATURE, value.coerceIn(-50, 50)).apply()
    
    // v29.9: 弹幕发送历史记录导出
    var v29HistoryExport: Boolean
        get() = prefs.getBoolean(KEY_V29_HISTORY_EXPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V29_HISTORY_EXPORT, value).apply()
    
    // v29.10: 播放器进度条样式
    var v29ProgressBarStyle: Int
        get() = prefs.getInt(KEY_V29_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_PROGRESS_BAR_STYLE, value.coerceIn(0, 4)).apply()
    
    // v29.11: 视频投射画面质量
    var v29CastQuality: Int
        get() = prefs.getInt(KEY_V29_CAST_QUALITY, 0)
        set(value) = prefs.edit().putInt(KEY_V29_CAST_QUALITY, value.coerceIn(0, 3)).apply()
    
    // v29.12: 弹幕字体背景透明度
    var v29DanmakuBackgroundOpacity: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_BACKGROUND_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_BACKGROUND_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v29.13: 播放器手势长按功能
    var v29LongPressFunction: Int
        get() = prefs.getInt(KEY_V29_LONG_PRESS_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V29_LONG_PRESS_FUNCTION, value.coerceIn(0, 5)).apply()
    
    // v29.14: 视频画面色彩伽马
    var v29ColorGamma: Int
        get() = prefs.getInt(KEY_V29_COLOR_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_GAMMA, value.coerceIn(-50, 50)).apply()
    
    // v29.15: 弹幕显示字体描边
    var v29DanmakuFontStroke: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_FONT_STROKE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_FONT_STROKE, value.coerceIn(0, 100)).apply()
    
    // v30.1: 视频播放列表自动循环
    var v30AutoLoop: Boolean
        get() = prefs.getBoolean(KEY_V30_AUTO_LOOP, false)
        set(value) = prefs.edit().putBoolean(KEY_V30_AUTO_LOOP, value).apply()
    
    // v30.2: 弹幕字体背景边框
    var v30DanmakuBackgroundBorder: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_BACKGROUND_BORDER, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_BACKGROUND_BORDER, value.coerceIn(0, 5)).apply()
    
    // v30.3: 视频画面色彩锐化
    var v30ColorSharpen: Int
        get() = prefs.getInt(KEY_V30_COLOR_SHARPEN, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_SHARPEN, value.coerceIn(0, 100)).apply()
    
    // v30.4: 弹幕发送确认震动模式
    var v30VibrationMode: Int
        get() = prefs.getInt(KEY_V30_VIBRATION_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_VIBRATION_MODE, value.coerceIn(0, 3)).apply()
    
    // v30.5: 播放器音量限制阈值
    var v30VolumeLimitThreshold: Int
        get() = prefs.getInt(KEY_V30_VOLUME_LIMIT_THRESHOLD, 100)
        set(value) = prefs.edit().putInt(KEY_V30_VOLUME_LIMIT_THRESHOLD, value.coerceIn(50, 150)).apply()
    
    // v30.6: 视频缓存清理模式
    var v30CacheCleanupMode: Int
        get() = prefs.getInt(KEY_V30_CACHE_CLEANUP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_CACHE_CLEANUP_MODE, value.coerceIn(0, 3)).apply()
    
    // v30.7: 弹幕显示位置对齐方式
    var v30DanmakuPositionAlignMode: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_POSITION_ALIGN_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_POSITION_ALIGN_MODE, value.coerceIn(0, 3)).apply()
    
    // v30.8: 视频画面色彩降噪
    var v30ColorDenoise: Int
        get() = prefs.getInt(KEY_V30_COLOR_DENOISE, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_DENOISE, value.coerceIn(0, 100)).apply()
    
    // v30.9: 弹幕发送历史记录导入
    var v30HistoryImport: Boolean
        get() = prefs.getBoolean(KEY_V30_HISTORY_IMPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V30_HISTORY_IMPORT, value).apply()
    
    // v30.10: 播放器进度条颜色
    var v30ProgressBarColor: Int
        get() = prefs.getInt(KEY_V30_PROGRESS_BAR_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V30_PROGRESS_BAR_COLOR, value.coerceIn(0, 5)).apply()
    
    // v30.11: 视频投射画面延迟
    var v30CastLatency: Int
        get() = prefs.getInt(KEY_V30_CAST_LATENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V30_CAST_LATENCY, value.coerceIn(0, 500)).apply()
    
    // v30.12: 弹幕字体背景阴影
    var v30DanmakuBackgroundShadow: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_BACKGROUND_SHADOW, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_BACKGROUND_SHADOW, value.coerceIn(0, 100)).apply()
    
    // v30.13: 播放器手势滑动功能
    var v30SwipeFunction: Int
        get() = prefs.getInt(KEY_V30_SWIPE_FUNCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V30_SWIPE_FUNCTION, value.coerceIn(0, 5)).apply()
    
    // v30.14: 视频画面色彩模糊
    var v30ColorBlur: Int
        get() = prefs.getInt(KEY_V30_COLOR_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_BLUR, value.coerceIn(0, 100)).apply()
    
    // v30.15: 弹幕显示字体发光
    var v30DanmakuFontGlow: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_FONT_GLOW, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_FONT_GLOW, value.coerceIn(0, 100)).apply()
    // ==================== v31.x - v40.x New Features ====================

    // === v31.x ===
    // v31.1: Danmaku Rainbow Effect
    var v31DanmakuRainbow: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKURAINBOW, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_DANMAKURAINBOW, v).apply()

    // v31.2: Video Smooth Transition
    var v31VideoSmoothTransition: Boolean
        get() = prefs.getBoolean(KEY_V31_VIDEOSMOOTHTRANSITION, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_VIDEOSMOOTHTRANSITION, v).apply()

    // v31.3: Danmaku Typewriter Effect
    var v31DanmakuTypewriter: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKUTYPEWRITER, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_DANMAKUTYPEWRITER, v).apply()

    // v31.4: Remember Playlist Order
    var v31PlaylistRememberOrder: Boolean
        get() = prefs.getBoolean(KEY_V31_PLAYLISTREMEMBERORDER, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_PLAYLISTREMEMBERORDER, v).apply()

    // v31.5: Danmaku Batch Copy
    var v31DanmakuBatchCopy: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKUBATCHCOPY, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_DANMAKUBATCHCOPY, v).apply()

    // v31.6: Cast Performance Mode
    var v31CastPerformanceMode: Int
        get() = prefs.getInt(KEY_V31_CASTPERFORMANCEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V31_CASTPERFORMANCEMODE, v).apply()

    // v31.7: Danmaku Scale Effect
    var v31DanmakuScaleEffect: Int
        get() = prefs.getInt(KEY_V31_DANMAKUSCALEEFFECT, 0)
        set(v) = prefs.edit().putInt(KEY_V31_DANMAKUSCALEEFFECT, v).apply()

    // v31.8: Danmaku Template Reply
    var v31DanmakuTemplateReply: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKUTEMPLATEREPLY, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_DANMAKUTEMPLATEREPLY, v).apply()

    // v31.9: Cast Power Saving
    var v31CastPowerSaving: Boolean
        get() = prefs.getBoolean(KEY_V31_CASTPOWERSAVING, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_CASTPOWERSAVING, v).apply()

    // v31.10: Danmaku Highlight Effect
    var v31DanmakuHighlightFx: Int
        get() = prefs.getInt(KEY_V31_DANMAKUHIGHLIGHTFX, 0)
        set(v) = prefs.edit().putInt(KEY_V31_DANMAKUHIGHLIGHTFX, v).apply()

    // v31.11: Remember Playback Position
    var v31RememberPlaybackPos: Boolean
        get() = prefs.getBoolean(KEY_V31_REMEMBERPLAYBACKPOS, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_REMEMBERPLAYBACKPOS, v).apply()

    // v31.12: Danmaku Send Animation
    var v31DanmakuSendAnimation: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKUSENDANIMATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_DANMAKUSENDANIMATION, v).apply()

    // v31.13: Remember Playback Skip
    var v31RememberPlaybackSkip: Boolean
        get() = prefs.getBoolean(KEY_V31_REMEMBERPLAYBACKSKIP, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_REMEMBERPLAYBACKSKIP, v).apply()

    // v31.14: Danmaku 3D Effect Level
    var v31Danmaku3dEffect: Int
        get() = prefs.getInt(KEY_V31_DANMAKU3DEFFECT, 0)
        set(v) = prefs.edit().putInt(KEY_V31_DANMAKU3DEFFECT, v).apply()

    // v31.15: Video Auto Next
    var v31VideoAutoNext: Boolean
        get() = prefs.getBoolean(KEY_V31_VIDEOAUTONEXT, false)
        set(v) = prefs.edit().putBoolean(KEY_V31_VIDEOAUTONEXT, v).apply()

    // === v32.x ===
    // v32.1: Danmaku Font Size Curve
    var v32DanmakuFontSizeCurve: Int
        get() = prefs.getInt(KEY_V32_DANMAKUFONTSIZECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V32_DANMAKUFONTSIZECURVE, v).apply()

    // v32.2: Video Debanding
    var v32VideoDeband: Boolean
        get() = prefs.getBoolean(KEY_V32_VIDEODEBAND, false)
        set(v) = prefs.edit().putBoolean(KEY_V32_VIDEODEBAND, v).apply()

    // v32.3: Danmaku Shadow Depth
    var v32DanmakuShadowDepth: Int
        get() = prefs.getInt(KEY_V32_DANMAKUSHADOWDEPTH, 2)
        set(v) = prefs.edit().putInt(KEY_V32_DANMAKUSHADOWDEPTH, v).apply()

    // v32.4: Video Color Vibrance
    var v32VideoColorVibrance: Int
        get() = prefs.getInt(KEY_V32_VIDEOCOLORVIBRANCE, 50)
        set(v) = prefs.edit().putInt(KEY_V32_VIDEOCOLORVIBRANCE, v).apply()

    // v32.5: Subtitle BG Round Corner
    var v32SubtitleBgRoundCorner: Int
        get() = prefs.getInt(KEY_V32_SUBTITLEBGROUNDCORNER, 4)
        set(v) = prefs.edit().putInt(KEY_V32_SUBTITLEBGROUNDCORNER, v).apply()

    // v32.6: Danmaku Scroll Inertia
    var v32DanmakuScrollInertia: Int
        get() = prefs.getInt(KEY_V32_DANMAKUSCROLLINERTIA, 50)
        set(v) = prefs.edit().putInt(KEY_V32_DANMAKUSCROLLINERTIA, v).apply()

    // v32.7: Gesture Haptic Feedback
    var v32GestureHapticFeedback: Boolean
        get() = prefs.getBoolean(KEY_V32_GESTUREHAPTICFEEDBACK, true)
        set(v) = prefs.edit().putBoolean(KEY_V32_GESTUREHAPTICFEEDBACK, v).apply()

    // v32.8: Video Anti-Aliasing
    var v32VideoAntiAliasing: Boolean
        get() = prefs.getBoolean(KEY_V32_VIDEOANTIALIASING, false)
        set(v) = prefs.edit().putBoolean(KEY_V32_VIDEOANTIALIASING, v).apply()

    // v32.9: Danmaku Overlap Limit
    var v32DanmakuOverlapLimit: Int
        get() = prefs.getInt(KEY_V32_DANMAKUOVERLAPLIMIT, 3)
        set(v) = prefs.edit().putInt(KEY_V32_DANMAKUOVERLAPLIMIT, v).apply()

    // v32.10: Subtitle Sync Offset (ms)
    var v32SubtitleSyncOffset: Int
        get() = prefs.getInt(KEY_V32_SUBTITLESYNCOFFSET, 0)
        set(v) = prefs.edit().putInt(KEY_V32_SUBTITLESYNCOFFSET, v).apply()

    // v32.11: Cast Auto Reconnect
    var v32CastAutoReconnect: Boolean
        get() = prefs.getBoolean(KEY_V32_CASTAUTORECONNECT, true)
        set(v) = prefs.edit().putBoolean(KEY_V32_CASTAUTORECONNECT, v).apply()

    // v32.12: Danmaku Edge Style
    var v32DanmakuEdgeStyle: Int
        get() = prefs.getInt(KEY_V32_DANMAKUEDGESTYLE, 0)
        set(v) = prefs.edit().putInt(KEY_V32_DANMAKUEDGESTYLE, v).apply()

    // v32.13: Video Frame Interpolation
    var v32VideoFrameInterpolation: Boolean
        get() = prefs.getBoolean(KEY_V32_VIDEOFRAMEINTERPOLATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V32_VIDEOFRAMEINTERPOLATION, v).apply()

    // v32.14: Playlist Auto Expand
    var v32PlaylistAutoExpand: Boolean
        get() = prefs.getBoolean(KEY_V32_PLAYLISTAUTOEXPAND, false)
        set(v) = prefs.edit().putBoolean(KEY_V32_PLAYLISTAUTOEXPAND, v).apply()

    // v32.15: Danmaku Color Palette Size
    var v32DanmakuColorPalette: Int
        get() = prefs.getInt(KEY_V32_DANMAKUCOLORPALETTE, 0)
        set(v) = prefs.edit().putInt(KEY_V32_DANMAKUCOLORPALETTE, v).apply()

    // === v33.x ===
    // v33.1: Video Denoise Level
    var v33VideoDenoiseLevel: Int
        get() = prefs.getInt(KEY_V33_VIDEODENOISELEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V33_VIDEODENOISELEVEL, v).apply()

    // v33.2: Danmaku Font Weight
    var v33DanmakuFontWeightAdj: Int
        get() = prefs.getInt(KEY_V33_DANMAKUFONTWEIGHTADJ, 50)
        set(v) = prefs.edit().putInt(KEY_V33_DANMAKUFONTWEIGHTADJ, v).apply()

    // v33.3: Subtitle Auto Detect
    var v33SubtitleAutoDetect: Boolean
        get() = prefs.getBoolean(KEY_V33_SUBTITLEAUTODETECT, true)
        set(v) = prefs.edit().putBoolean(KEY_V33_SUBTITLEAUTODETECT, v).apply()

    // v33.4: Gesture Double Tap Action
    var v33GestureDoubleTapAction: Int
        get() = prefs.getInt(KEY_V33_GESTUREDOUBLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V33_GESTUREDOUBLETAPACTION, v).apply()

    // v33.5: Video Gamma Correction
    var v33VideoGammaCorrection: Int
        get() = prefs.getInt(KEY_V33_VIDEOGAMMACORRECTION, 50)
        set(v) = prefs.edit().putInt(KEY_V33_VIDEOGAMMACORRECTION, v).apply()

    // v33.6: Danmaku Merge Window (s)
    var v33DanmakuMergeWindow: Int
        get() = prefs.getInt(KEY_V33_DANMAKUMERGEWINDOW, 5)
        set(v) = prefs.edit().putInt(KEY_V33_DANMAKUMERGEWINDOW, v).apply()

    // v33.7: Cast Audio Sync
    var v33CastAudioSync: Boolean
        get() = prefs.getBoolean(KEY_V33_CASTAUDIOSYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V33_CASTAUDIOSYNC, v).apply()

    // v33.8: Subtitle Font Size Step
    var v33SubtitleFontSizeStep: Int
        get() = prefs.getInt(KEY_V33_SUBTITLEFONTSIZESTEP, 2)
        set(v) = prefs.edit().putInt(KEY_V33_SUBTITLEFONTSIZESTEP, v).apply()

    // v33.9: Video Saturation Curve
    var v33VideoSaturationCurve: Int
        get() = prefs.getInt(KEY_V33_VIDEOSATURATIONCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V33_VIDEOSATURATIONCURVE, v).apply()

    // v33.10: Danmaku Speed Adaptive
    var v33DanmakuSpeedAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V33_DANMAKUSPEEDADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V33_DANMAKUSPEEDADAPTIVE, v).apply()

    // v33.11: Playlist Loop Count
    var v33PlaylistLoopCount: Int
        get() = prefs.getInt(KEY_V33_PLAYLISTLOOPCOUNT, 0)
        set(v) = prefs.edit().putInt(KEY_V33_PLAYLISTLOOPCOUNT, v).apply()

    // v33.12: Gesture Swipe Threshold
    var v33GestureSwipeThreshold: Int
        get() = prefs.getInt(KEY_V33_GESTURESWIPETHRESHOLD, 50)
        set(v) = prefs.edit().putInt(KEY_V33_GESTURESWIPETHRESHOLD, v).apply()

    // v33.13: Video Brightness Curve
    var v33VideoBrightnessCurve: Int
        get() = prefs.getInt(KEY_V33_VIDEOBRIGHTNESSCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V33_VIDEOBRIGHTNESSCURVE, v).apply()

    // v33.14: Danmaku Font Italic
    var v33DanmakuFontItalic: Boolean
        get() = prefs.getBoolean(KEY_V33_DANMAKUFONTITALIC, false)
        set(v) = prefs.edit().putBoolean(KEY_V33_DANMAKUFONTITALIC, v).apply()

    // v33.15: Cast Resolution
    var v33CastResolution: Int
        get() = prefs.getInt(KEY_V33_CASTRESOLUTION, 0)
        set(v) = prefs.edit().putInt(KEY_V33_CASTRESOLUTION, v).apply()

    // === v34.x ===
    // v34.1: Video Color Space
    var v34VideoColorSpace: Int
        get() = prefs.getInt(KEY_V34_VIDEOCOLORSPACE, 0)
        set(v) = prefs.edit().putInt(KEY_V34_VIDEOCOLORSPACE, v).apply()

    // v34.2: Danmaku Animation Duration
    var v34DanmakuAnimDuration: Int
        get() = prefs.getInt(KEY_V34_DANMAKUANIMDURATION, 300)
        set(v) = prefs.edit().putInt(KEY_V34_DANMAKUANIMDURATION, v).apply()

    // v34.3: Subtitle Outline Width
    var v34SubtitleOutlineWidth: Int
        get() = prefs.getInt(KEY_V34_SUBTITLEOUTLINEWIDTH, 2)
        set(v) = prefs.edit().putInt(KEY_V34_SUBTITLEOUTLINEWIDTH, v).apply()

    // v34.4: Gesture Long Press Action
    var v34GestureLongPressAction: Int
        get() = prefs.getInt(KEY_V34_GESTURELONGPRESSACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V34_GESTURELONGPRESSACTION, v).apply()

    // v34.5: Video Peak Brightness
    var v34VideoPeakBrightness: Int
        get() = prefs.getInt(KEY_V34_VIDEOPEAKBRIGHTNESS, 100)
        set(v) = prefs.edit().putInt(KEY_V34_VIDEOPEAKBRIGHTNESS, v).apply()

    // v34.6: Danmaku Filter Regex
    var v34DanmakuFilterRegex: Boolean
        get() = prefs.getBoolean(KEY_V34_DANMAKUFILTERREGEX, false)
        set(v) = prefs.edit().putBoolean(KEY_V34_DANMAKUFILTERREGEX, v).apply()

    // v34.7: Cast Video Codec
    var v34CastVideoCodec: Int
        get() = prefs.getInt(KEY_V34_CASTVIDEOCODEC, 0)
        set(v) = prefs.edit().putInt(KEY_V34_CASTVIDEOCODEC, v).apply()

    // v34.8: Subtitle Position Y
    var v34SubtitlePositionY: Int
        get() = prefs.getInt(KEY_V34_SUBTITLEPOSITIONY, 0)
        set(v) = prefs.edit().putInt(KEY_V34_SUBTITLEPOSITIONY, v).apply()

    // v34.9: Video Contrast Adaptive
    var v34VideoContrastAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V34_VIDEOCONTRASTADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V34_VIDEOCONTRASTADAPTIVE, v).apply()

    // v34.10: Danmaku Merge Similar
    var v34DanmakuMergeSimilar: Boolean
        get() = prefs.getBoolean(KEY_V34_DANMAKUMERGESIMILAR, false)
        set(v) = prefs.edit().putBoolean(KEY_V34_DANMAKUMERGESIMILAR, v).apply()

    // v34.11: Playlist Shuffle Seed
    var v34PlaylistShuffleSeed: Int
        get() = prefs.getInt(KEY_V34_PLAYLISTSHUFFLESEED, 0)
        set(v) = prefs.edit().putInt(KEY_V34_PLAYLISTSHUFFLESEED, v).apply()

    // v34.12: Gesture Pinch Action
    var v34GesturePinchAction: Int
        get() = prefs.getInt(KEY_V34_GESTUREPINCHACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V34_GESTUREPINCHACTION, v).apply()

    // v34.13: Video Noise Reduction
    var v34VideoNoiseReduction: Int
        get() = prefs.getInt(KEY_V34_VIDEONOISEREDUCTION, 50)
        set(v) = prefs.edit().putInt(KEY_V34_VIDEONOISEREDUCTION, v).apply()

    // v34.14: Danmaku Send Cooldown (s)
    var v34DanmakuSendCooldown: Int
        get() = prefs.getInt(KEY_V34_DANMAKUSENDCOOLDOWN, 0)
        set(v) = prefs.edit().putInt(KEY_V34_DANMAKUSENDCOOLDOWN, v).apply()

    // v34.15: Cast Bitrate Limit (Mbps)
    var v34CastBitrateLimit: Int
        get() = prefs.getInt(KEY_V34_CASTBITRATELIMIT, 0)
        set(v) = prefs.edit().putInt(KEY_V34_CASTBITRATELIMIT, v).apply()

    // === v35.x ===
    // v35.1: Video Sharpen Radius
    var v35VideoSharpenRadius: Int
        get() = prefs.getInt(KEY_V35_VIDEOSHARPENRADIUS, 1)
        set(v) = prefs.edit().putInt(KEY_V35_VIDEOSHARPENRADIUS, v).apply()

    // v35.2: Danmaku Glow Effect
    var v35DanmakuGlowEffect: Boolean
        get() = prefs.getBoolean(KEY_V35_DANMAKUGLOWEFFECT, false)
        set(v) = prefs.edit().putBoolean(KEY_V35_DANMAKUGLOWEFFECT, v).apply()

    // v35.3: Subtitle Font Weight
    var v35SubtitleFontWeight: Int
        get() = prefs.getInt(KEY_V35_SUBTITLEFONTWEIGHT, 400)
        set(v) = prefs.edit().putInt(KEY_V35_SUBTITLEFONTWEIGHT, v).apply()

    // v35.4: Gesture Volume Sensitivity
    var v35GestureVolumeSensitivity: Int
        get() = prefs.getInt(KEY_V35_GESTUREVOLUMESENSITIVITY, 50)
        set(v) = prefs.edit().putInt(KEY_V35_GESTUREVOLUMESENSITIVITY, v).apply()

    // v35.5: Video Highlight Recovery
    var v35VideoHighlightRecovery: Boolean
        get() = prefs.getBoolean(KEY_V35_VIDEOHIGHLIGHTRECOVERY, false)
        set(v) = prefs.edit().putBoolean(KEY_V35_VIDEOHIGHLIGHTRECOVERY, v).apply()

    // v35.6: Danmaku Persist Across Episodes
    var v35DanmakuPersistAcrossEp: Boolean
        get() = prefs.getBoolean(KEY_V35_DANMAKUPERSISTACROSSEP, false)
        set(v) = prefs.edit().putBoolean(KEY_V35_DANMAKUPERSISTACROSSEP, v).apply()

    // v35.7: Cast Subtitle Enabled
    var v35CastSubtitleEnabled: Boolean
        get() = prefs.getBoolean(KEY_V35_CASTSUBTITLEENABLED, true)
        set(v) = prefs.edit().putBoolean(KEY_V35_CASTSUBTITLEENABLED, v).apply()

    // v35.8: Subtitle Shadow Offset
    var v35SubtitleShadowOffset: Int
        get() = prefs.getInt(KEY_V35_SUBTITLESHADOWOFFSET, 1)
        set(v) = prefs.edit().putInt(KEY_V35_SUBTITLESHADOWOFFSET, v).apply()

    // v35.9: Video Color Gradient
    var v35VideoColorGradient: Int
        get() = prefs.getInt(KEY_V35_VIDEOCOLORGRADIENT, 0)
        set(v) = prefs.edit().putInt(KEY_V35_VIDEOCOLORGRADIENT, v).apply()

    // v35.10: Danmaku Scroll Direction
    var v35DanmakuScrollDirection: Int
        get() = prefs.getInt(KEY_V35_DANMAKUSCROLLDIRECTION, 0)
        set(v) = prefs.edit().putInt(KEY_V35_DANMAKUSCROLLDIRECTION, v).apply()

    // v35.11: Playlist Auto Play Next
    var v35PlaylistAutoPlayNext: Boolean
        get() = prefs.getBoolean(KEY_V35_PLAYLISTAUTOPLAYNEXT, true)
        set(v) = prefs.edit().putBoolean(KEY_V35_PLAYLISTAUTOPLAYNEXT, v).apply()

    // v35.12: Gesture Brightness Sensitivity
    var v35GestureBrightnessSensitivity: Int
        get() = prefs.getInt(KEY_V35_GESTUREBRIGHTNESSSENSITIVITY, 50)
        set(v) = prefs.edit().putInt(KEY_V35_GESTUREBRIGHTNESSSENSITIVITY, v).apply()

    // v35.13: Video Black Level
    var v35VideoBlackLevelAdj: Int
        get() = prefs.getInt(KEY_V35_VIDEOBLACKLEVELADJ, 0)
        set(v) = prefs.edit().putInt(KEY_V35_VIDEOBLACKLEVELADJ, v).apply()

    // v35.14: Danmaku Border Color
    var v35DanmakuBorderColor: Int
        get() = prefs.getInt(KEY_V35_DANMAKUBORDERCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V35_DANMAKUBORDERCOLOR, v).apply()

    // v35.15: Cast Audio Delay (ms)
    var v35CastAudioDelay: Int
        get() = prefs.getInt(KEY_V35_CASTAUDIODELAY, 0)
        set(v) = prefs.edit().putInt(KEY_V35_CASTAUDIODELAY, v).apply()

    // === v36.x ===
    // v36.1: Video White Balance (K)
    var v36VideoWhiteBalance: Int
        get() = prefs.getInt(KEY_V36_VIDEOWHITEBALANCE, 6500)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOWHITEBALANCE, v).apply()

    // v36.2: Danmaku Font Stretch
    var v36DanmakuFontStretch: Int
        get() = prefs.getInt(KEY_V36_DANMAKUFONTSTRETCH, 100)
        set(v) = prefs.edit().putInt(KEY_V36_DANMAKUFONTSTRETCH, v).apply()

    // v36.3: Subtitle Encoding
    var v36SubtitleEncoding: Int
        get() = prefs.getInt(KEY_V36_SUBTITLEENCODING, 0)
        set(v) = prefs.edit().putInt(KEY_V36_SUBTITLEENCODING, v).apply()

    // v36.4: Gesture Seek Step (s)
    var v36GestureSeekStep: Int
        get() = prefs.getInt(KEY_V36_GESTURESEEKSTEP, 5)
        set(v) = prefs.edit().putInt(KEY_V36_GESTURESEEKSTEP, v).apply()

    // v36.5: Video Color Tint
    var v36VideoColorTint: Int
        get() = prefs.getInt(KEY_V36_VIDEOCOLORTINT, 0)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOCOLORTINT, v).apply()

    // v36.6: Danmaku Fade In
    var v36DanmakuFadeIn: Boolean
        get() = prefs.getBoolean(KEY_V36_DANMAKUFADEIN, false)
        set(v) = prefs.edit().putBoolean(KEY_V36_DANMAKUFADEIN, v).apply()

    // v36.7: Cast Screen Mirror
    var v36CastScreenMirror: Boolean
        get() = prefs.getBoolean(KEY_V36_CASTSCREENMIRROR, false)
        set(v) = prefs.edit().putBoolean(KEY_V36_CASTSCREENMIRROR, v).apply()

    // v36.8: Subtitle Line Spacing
    var v36SubtitleLineSpacing: Int
        get() = prefs.getInt(KEY_V36_SUBTITLELINESPACING, 120)
        set(v) = prefs.edit().putInt(KEY_V36_SUBTITLELINESPACING, v).apply()

    // v36.9: Video Gamma Tone Map
    var v36VideoGammaToneMap: Int
        get() = prefs.getInt(KEY_V36_VIDEOGAMMATONEMAP, 0)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOGAMMATONEMAP, v).apply()

    // v36.10: Danmaku History Depth
    var v36DanmakuHistoryDepth: Int
        get() = prefs.getInt(KEY_V36_DANMAKUHISTORYDEPTH, 0)
        set(v) = prefs.edit().putInt(KEY_V36_DANMAKUHISTORYDEPTH, v).apply()

    // v36.11: Playlist Resume Last
    var v36PlaylistResumeLast: Boolean
        get() = prefs.getBoolean(KEY_V36_PLAYLISTRESUMELAST, true)
        set(v) = prefs.edit().putBoolean(KEY_V36_PLAYLISTRESUMELAST, v).apply()

    // v36.12: Gesture Double Swipe
    var v36GestureDoubleSwipeAction: Int
        get() = prefs.getInt(KEY_V36_GESTUREDOUBLESWIPEACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V36_GESTUREDOUBLESWIPEACTION, v).apply()

    // v36.13: Video Contrast Ratio
    var v36VideoContrastRatio: Int
        get() = prefs.getInt(KEY_V36_VIDEOCONTRASTRATIO, 100)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOCONTRASTRATIO, v).apply()

    // v36.14: Danmaku Speed Multiplier
    var v36DanmakuSpeedMultiplier: Int
        get() = prefs.getInt(KEY_V36_DANMAKUSPEEDMULTIPLIER, 100)
        set(v) = prefs.edit().putInt(KEY_V36_DANMAKUSPEEDMULTIPLIER, v).apply()

    // v36.15: Cast Auto Quality
    var v36CastAutoQuality: Boolean
        get() = prefs.getBoolean(KEY_V36_CASTAUTOQUALITY, true)
        set(v) = prefs.edit().putBoolean(KEY_V36_CASTAUTOQUALITY, v).apply()

    // === v37.x ===
    // v37.1: Video Dynamic Range
    var v37VideoDynamicRange: Int
        get() = prefs.getInt(KEY_V37_VIDEODYNAMICRANGE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEODYNAMICRANGE, v).apply()

    // v37.2: Danmaku Blend Mode
    var v37DanmakuBlendMode: Int
        get() = prefs.getInt(KEY_V37_DANMAKUBLENDMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_DANMAKUBLENDMODE, v).apply()

    // v37.3: Subtitle Karaoke Mode
    var v37SubtitleKaraokeMode: Boolean
        get() = prefs.getBoolean(KEY_V37_SUBTITLEKARAOKEMODE, false)
        set(v) = prefs.edit().putBoolean(KEY_V37_SUBTITLEKARAOKEMODE, v).apply()

    // v37.4: Gesture Rotate Action
    var v37GestureRotateAction: Int
        get() = prefs.getInt(KEY_V37_GESTUREROTATEACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V37_GESTUREROTATEACTION, v).apply()

    // v37.5: Video Color Depth
    var v37VideoColorDepth: Int
        get() = prefs.getInt(KEY_V37_VIDEOCOLORDEPTH, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEOCOLORDEPTH, v).apply()

    // v37.6: Danmaku Preview Mode
    var v37DanmakuPreviewMode: Boolean
        get() = prefs.getBoolean(KEY_V37_DANMAKUPREVIEWMODE, false)
        set(v) = prefs.edit().putBoolean(KEY_V37_DANMAKUPREVIEWMODE, v).apply()

    // v37.7: Cast Audio Channel
    var v37CastAudioChannel: Int
        get() = prefs.getInt(KEY_V37_CASTAUDIOCHANNEL, 0)
        set(v) = prefs.edit().putInt(KEY_V37_CASTAUDIOCHANNEL, v).apply()

    // v37.8: Subtitle Font Size Auto
    var v37SubtitleFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V37_SUBTITLEFONTSIZEAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V37_SUBTITLEFONTSIZEAUTO, v).apply()

    // v37.9: Video Edge Enhancement
    var v37VideoEdgeEnhance: Int
        get() = prefs.getInt(KEY_V37_VIDEOEDGEENHANCE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEOEDGEENHANCE, v).apply()

    // v37.10: Danmaku Send Font
    var v37DanmakuSendFont: Int
        get() = prefs.getInt(KEY_V37_DANMAKUSENDFONT, 0)
        set(v) = prefs.edit().putInt(KEY_V37_DANMAKUSENDFONT, v).apply()

    // v37.11: Playlist Repeat Mode
    var v37PlaylistRepeatMode: Int
        get() = prefs.getInt(KEY_V37_PLAYLISTREPEATMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_PLAYLISTREPEATMODE, v).apply()

    // v37.12: Gesture Triple Tap
    var v37GestureTripleTapAction: Int
        get() = prefs.getInt(KEY_V37_GESTURETRIPLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V37_GESTURETRIPLETAPACTION, v).apply()

    // v37.13: Video Color Curve
    var v37VideoColorCurve: Int
        get() = prefs.getInt(KEY_V37_VIDEOCOLORCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEOCOLORCURVE, v).apply()

    // v37.14: Danmaku Shadow Color
    var v37DanmakuShadowColor: Int
        get() = prefs.getInt(KEY_V37_DANMAKUSHADOWCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V37_DANMAKUSHADOWCOLOR, v).apply()

    // v37.15: Cast Keep Alive
    var v37CastKeepAlive: Boolean
        get() = prefs.getBoolean(KEY_V37_CASTKEEPALIVE, true)
        set(v) = prefs.edit().putBoolean(KEY_V37_CASTKEEPALIVE, v).apply()

    // === v38.x ===
    // v38.1: Video Chroma Upsampling
    var v38VideoChromaUpsampling: Int
        get() = prefs.getInt(KEY_V38_VIDEOCHROMAUPSAMPLING, 0)
        set(v) = prefs.edit().putInt(KEY_V38_VIDEOCHROMAUPSAMPLING, v).apply()

    // v38.2: Danmaku Preset Slots
    var v38DanmakuPresetSlots: Int
        get() = prefs.getInt(KEY_V38_DANMAKUPRESETSLOTS, 3)
        set(v) = prefs.edit().putInt(KEY_V38_DANMAKUPRESETSLOTS, v).apply()

    // v38.3: Subtitle BG Blur
    var v38SubtitleBgBlur: Int
        get() = prefs.getInt(KEY_V38_SUBTITLEBGBLUR, 0)
        set(v) = prefs.edit().putInt(KEY_V38_SUBTITLEBGBLUR, v).apply()

    // v38.4: Gesture Edge Zone Width
    var v38GestureEdgeZoneWidth: Int
        get() = prefs.getInt(KEY_V38_GESTUREEDGEZONEWIDTH, 10)
        set(v) = prefs.edit().putInt(KEY_V38_GESTUREEDGEZONEWIDTH, v).apply()

    // v38.5: Video Deinterlace
    var v38VideoDeinterlace: Boolean
        get() = prefs.getBoolean(KEY_V38_VIDEODEINTERLACE, true)
        set(v) = prefs.edit().putBoolean(KEY_V38_VIDEODEINTERLACE, v).apply()

    // v38.6: Danmaku Keyboard Send
    var v38DanmakuKeyboardSend: Boolean
        get() = prefs.getBoolean(KEY_V38_DANMAKUKEYBOARDSEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_DANMAKUKEYBOARDSEND, v).apply()

    // v38.7: Cast Video HDR
    var v38CastVideoHDR: Boolean
        get() = prefs.getBoolean(KEY_V38_CASTVIDEOHDR, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_CASTVIDEOHDR, v).apply()

    // v38.8: Subtitle Font Outline
    var v38SubtitleFontOutline: Boolean
        get() = prefs.getBoolean(KEY_V38_SUBTITLEFONTOUTLINE, true)
        set(v) = prefs.edit().putBoolean(KEY_V38_SUBTITLEFONTOUTLINE, v).apply()

    // v38.9: Video Banding Fix
    var v38VideoBandingFix: Boolean
        get() = prefs.getBoolean(KEY_V38_VIDEOBANDINGFIX, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_VIDEOBANDINGFIX, v).apply()

    // v38.10: Danmaku Lane Count
    var v38DanmakuLaneCount: Int
        get() = prefs.getInt(KEY_V38_DANMAKULANECOUNT, 0)
        set(v) = prefs.edit().putInt(KEY_V38_DANMAKULANECOUNT, v).apply()

    // v38.11: Playlist Smart Sort
    var v38PlaylistSmartSort: Boolean
        get() = prefs.getBoolean(KEY_V38_PLAYLISTSMARTSORT, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_PLAYLISTSMARTSORT, v).apply()

    // v38.12: Gesture Dead Zone
    var v38GestureDeadZone: Int
        get() = prefs.getInt(KEY_V38_GESTUREDEADZONE, 20)
        set(v) = prefs.edit().putInt(KEY_V38_GESTUREDEADZONE, v).apply()

    // v38.13: Video Overscan Crop
    var v38VideoOverscan: Int
        get() = prefs.getInt(KEY_V38_VIDEOOVERSCAN, 0)
        set(v) = prefs.edit().putInt(KEY_V38_VIDEOOVERSCAN, v).apply()

    // v38.14: Danmaku Merge Threshold
    var v38DanmakuMergeThreshold: Int
        get() = prefs.getInt(KEY_V38_DANMAKUMERGETHRESHOLD, 80)
        set(v) = prefs.edit().putInt(KEY_V38_DANMAKUMERGETHRESHOLD, v).apply()

    // v38.15: Cast Volume Control
    var v38CastVolumeControl: Boolean
        get() = prefs.getBoolean(KEY_V38_CASTVOLUMECONTROL, true)
        set(v) = prefs.edit().putBoolean(KEY_V38_CASTVOLUMECONTROL, v).apply()

    // === v39.x ===
    // v39.1: Video Temporal Denoise
    var v39VideoTemporalDenoise: Int
        get() = prefs.getInt(KEY_V39_VIDEOTEMPORALDENOISE, 0)
        set(v) = prefs.edit().putInt(KEY_V39_VIDEOTEMPORALDENOISE, v).apply()

    // v39.2: Danmaku Font Family
    var v39DanmakuFontFamily: Int
        get() = prefs.getInt(KEY_V39_DANMAKUFONTFAMILY, 0)
        set(v) = prefs.edit().putInt(KEY_V39_DANMAKUFONTFAMILY, v).apply()

    // v39.3: Subtitle BG Color
    var v39SubtitleBgColor: Int
        get() = prefs.getInt(KEY_V39_SUBTITLEBGCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V39_SUBTITLEBGCOLOR, v).apply()

    // v39.4: Gesture Scroll Action
    var v39GestureScrollAction: Int
        get() = prefs.getInt(KEY_V39_GESTURESCROLLACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V39_GESTURESCROLLACTION, v).apply()

    // v39.5: Video Adaptive Sharpen
    var v39VideoAdaptiveSharpen: Boolean
        get() = prefs.getBoolean(KEY_V39_VIDEOADAPTIVESHARPEN, false)
        set(v) = prefs.edit().putBoolean(KEY_V39_VIDEOADAPTIVESHARPEN, v).apply()

    // v39.6: Danmaku Send Privilege
    var v39DanmakuSendPrivilege: Boolean
        get() = prefs.getBoolean(KEY_V39_DANMAKUSENDPRIVILEGE, false)
        set(v) = prefs.edit().putBoolean(KEY_V39_DANMAKUSENDPRIVILEGE, v).apply()

    // v39.7: Cast Subtitle Track
    var v39CastSubtitles: Int
        get() = prefs.getInt(KEY_V39_CASTSUBTITLES, 0)
        set(v) = prefs.edit().putInt(KEY_V39_CASTSUBTITLES, v).apply()

    // v39.8: Subtitle BG Padding
    var v39SubtitleBgPadding: Int
        get() = prefs.getInt(KEY_V39_SUBTITLEBGPADDING, 4)
        set(v) = prefs.edit().putInt(KEY_V39_SUBTITLEBGPADDING, v).apply()

    // v39.9: Video Color Temp Fine
    var v39VideoColorTemperatureFine: Int
        get() = prefs.getInt(KEY_V39_VIDEOCOLORTEMPERATUREFINE, 50)
        set(v) = prefs.edit().putInt(KEY_V39_VIDEOCOLORTEMPERATUREFINE, v).apply()

    // v39.10: Danmaku Max Per Screen
    var v39DanmakuMaxPerScreen: Int
        get() = prefs.getInt(KEY_V39_DANMAKUMAXPERSCREEN, 3)
        set(v) = prefs.edit().putInt(KEY_V39_DANMAKUMAXPERSCREEN, v).apply()

    // v39.11: Playlist Load Related
    var v39PlaylistLoadRelated: Boolean
        get() = prefs.getBoolean(KEY_V39_PLAYLISTLOADRELATED, true)
        set(v) = prefs.edit().putBoolean(KEY_V39_PLAYLISTLOADRELATED, v).apply()

    // v39.12: Video Smoothing Level
    var v39VideoSmoothingLevel: Int
        get() = prefs.getInt(KEY_V39_VIDEOSMOOTHINGLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V39_VIDEOSMOOTHINGLEVEL, v).apply()

    // v39.13: Danmaku Sender Level Icon
    var v39DanmakuSenderLevelIcon: Boolean
        get() = prefs.getBoolean(KEY_V39_DANMAKUSENDERLEVELICON, true)
        set(v) = prefs.edit().putBoolean(KEY_V39_DANMAKUSENDERLEVELICON, v).apply()

    // v39.14: Subtitle Auto Translate
    var v39SubtitleAutoTranslate: Boolean
        get() = prefs.getBoolean(KEY_V39_SUBTITLEAUTOTRANSLATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V39_SUBTITLEAUTOTRANSLATE, v).apply()

    // v39.15: Cast Audio Quality
    var v39CastAudioQuality: Int
        get() = prefs.getInt(KEY_V39_CASTAUDIOQUALITY, 0)
        set(v) = prefs.edit().putInt(KEY_V39_CASTAUDIOQUALITY, v).apply()

    // === v40.x ===
    // v40.1: Video Spatial Denoise
    var v40VideoSpatialDenoise: Int
        get() = prefs.getInt(KEY_V40_VIDEOSPATIALDENOISE, 0)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEOSPATIALDENOISE, v).apply()

    // v40.2: Danmaku Preview Size
    var v40DanmakuPreviewSize: Int
        get() = prefs.getInt(KEY_V40_DANMAKUPREVIEWSIZE, 14)
        set(v) = prefs.edit().putInt(KEY_V40_DANMAKUPREVIEWSIZE, v).apply()

    // v40.3: Subtitle Stroke Color Custom
    var v40SubtitleStrokeColor: Boolean
        get() = prefs.getBoolean(KEY_V40_SUBTITLESTROKECOLOR, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_SUBTITLESTROKECOLOR, v).apply()

    // v40.4: Gesture Invert Scroll
    var v40GestureInvertScroll: Boolean
        get() = prefs.getBoolean(KEY_V40_GESTUREINVERTSCROLL, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_GESTUREINVERTSCROLL, v).apply()

    // v40.5: Video Motion Blur
    var v40VideoMotionBlur: Int
        get() = prefs.getInt(KEY_V40_VIDEOMOTIONBLUR, 0)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEOMOTIONBLUR, v).apply()

    // v40.6: Danmaku Report Button
    var v40DanmakuReportEnabled: Boolean
        get() = prefs.getBoolean(KEY_V40_DANMAKUREPORTENABLED, true)
        set(v) = prefs.edit().putBoolean(KEY_V40_DANMAKUREPORTENABLED, v).apply()

    // v40.7: Cast Auto Pause
    var v40CastAutoPause: Boolean
        get() = prefs.getBoolean(KEY_V40_CASTAUTOPAUSE, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_CASTAUTOPAUSE, v).apply()

    // v40.8: Subtitle Stroke Width
    var v40SubtitleStrokeWidth: Int
        get() = prefs.getInt(KEY_V40_SUBTITLESTROKEWIDTH, 1)
        set(v) = prefs.edit().putInt(KEY_V40_SUBTITLESTROKEWIDTH, v).apply()

    // v40.9: Video Detail Enhancement
    var v40VideoDetailEnhance: Int
        get() = prefs.getInt(KEY_V40_VIDEODETAILENHANCE, 0)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEODETAILENHANCE, v).apply()

    // v40.10: Danmaku Block Level
    var v40DanmakuBlockLevel: Int
        get() = prefs.getInt(KEY_V40_DANMAKUBLOCKLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V40_DANMAKUBLOCKLEVEL, v).apply()

    // v40.11: Playlist Next Episode
    var v40PlaylistNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V40_PLAYLISTNEXTEPISODE, true)
        set(v) = prefs.edit().putBoolean(KEY_V40_PLAYLISTNEXTEPISODE, v).apply()

    // v40.12: Gesture Custom Mapping
    var v40GestureCustomMapping: Boolean
        get() = prefs.getBoolean(KEY_V40_GESTURECUSTOMMAPPING, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_GESTURECUSTOMMAPPING, v).apply()

    // v40.13: Video Color Boost
    var v40VideoColorBoost: Int
        get() = prefs.getInt(KEY_V40_VIDEOCOLORBOOST, 100)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEOCOLORBOOST, v).apply()

    // v40.14: Danmaku Font Size Override
    var v40DanmakuFontSizeOverride: Int
        get() = prefs.getInt(KEY_V40_DANMAKUFONTSIZEOVERRIDE, 0)
        set(v) = prefs.edit().putInt(KEY_V40_DANMAKUFONTSIZEOVERRIDE, v).apply()

    // v40.15: Cast Audio Normalization
    var v40CastAudioNormalization: Boolean
        get() = prefs.getBoolean(KEY_V40_CASTAUDIONORMALIZATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_CASTAUDIONORMALIZATION, v).apply()

    companion object {
        const val STARTUP_PAGE_HOME = "home"
        const val STARTUP_PAGE_CATEGORY = "category"
        const val STARTUP_PAGE_DYNAMIC = "dynamic"
        const val STARTUP_PAGE_LIVE = "live"
        const val STARTUP_PAGE_MY = "my"
        const val STARTUP_PAGE_CUSTOM = "custom"

        const val SIDEBAR_SIZE_SMALL = "small"
        const val SIDEBAR_SIZE_MEDIUM = "medium"
        const val SIDEBAR_SIZE_LARGE = "large"

        const val UI_SCALE_FACTOR_MIN = 0.70f
        const val UI_SCALE_FACTOR_MAX = 1.40f
        const val UI_SCALE_FACTOR_STEP = 0.05f
        const val UI_SCALE_FACTOR_DEFAULT = 1.00f

        const val THEME_PRESET_DEFAULT = "default"
        const val THEME_PRESET_TV_PINK = "tv_pink"
        const val THEME_PRESET_TV_PINK_ILLUSTRATION = "tv_pink_illustration"
        // v5.0: 新主题
        const val THEME_PRESET_BLUE_DARK = "blue_dark"
        const val THEME_PRESET_GREEN_DARK = "green_dark"

        const val FOLLOWING_LIST_ORDER_FOLLOW_TIME = "follow_time"
        const val FOLLOWING_LIST_ORDER_RECENT_VISIT = "recent_visit"

        // Main page back focus schemes for "Settings -> Page Settings".
        const val MAIN_BACK_FOCUS_SCHEME_A = "A"
        const val MAIN_BACK_FOCUS_SCHEME_B = "B"
        const val MAIN_BACK_FOCUS_SCHEME_C = "C"

        const val VIDEO_CARD_LONG_PRESS_ACTION_MANUAL = "manual"
        const val VIDEO_CARD_LONG_PRESS_ACTION_WATCH_LATER = "watch_later"
        const val VIDEO_CARD_LONG_PRESS_ACTION_OPEN_DETAIL = "open_detail"
        const val VIDEO_CARD_LONG_PRESS_ACTION_OPEN_UP = "open_up"
        const val VIDEO_CARD_LONG_PRESS_ACTION_DISMISS = "dismiss"
        // v5.9: 分享视频
        const val VIDEO_CARD_LONG_PRESS_ACTION_SHARE = "share"
        // v6.3: 复制链接
        const val VIDEO_CARD_LONG_PRESS_ACTION_COPY_LINK = "copy_link"

        private const val KEY_DISCLAIMER_ACCEPTED = "disclaimer_accepted"
        private const val KEY_WEB_REFRESH_TOKEN = "web_refresh_token"
        private const val KEY_APP_AUTH_SESSION = "app_auth_session"
        private const val KEY_WEB_COOKIE_REFRESH_CHECKED_EPOCH_DAY = "web_cookie_refresh_checked_epoch_day"
        private const val KEY_BILI_TICKET_CHECKED_EPOCH_DAY = "bili_ticket_checked_epoch_day"

        private const val KEY_UA = "ua"
        private const val KEY_API_SOURCE = "api_source"
        private const val KEY_IPV4_ONLY_ENABLED = "ipv4_only_enabled"
        private const val KEY_DEVICE_BUVID = "device_buvid"
        private const val KEY_DEVICE_UUID = "device_uuid"
        private const val KEY_BUVID_ACTIVATED_MID = "buvid_activated_mid"
        private const val KEY_BUVID_ACTIVATED_EPOCH_DAY = "buvid_activated_epoch_day"
        private const val KEY_SIDEBAR_SIZE = "sidebar_size"
        private const val KEY_UI_SCALE_FACTOR = "ui_scale_factor"
        private const val KEY_THEME_PRESET = "theme_preset"
        private const val KEY_FONT_SCALE_FACTOR = "font_scale_factor"
        const val FONT_SCALE_FACTOR_MIN = 0.80f
        const val FONT_SCALE_FACTOR_MAX = 1.30f
        const val FONT_SCALE_FACTOR_STEP = 0.05f
        const val FONT_SCALE_FACTOR_DEFAULT = 1.00f
        private const val KEY_STARTUP_PAGE = "startup_page"
        private const val KEY_CUSTOM_PAGE_CONFIG = "custom_page_config"
        private const val KEY_MAIN_HOME_VISIBLE_TABS = "main_home_visible_tabs"
        private const val KEY_MAIN_CATEGORY_VISIBLE_TABS = "main_category_visible_tabs"
        private const val KEY_MAIN_LIVE_VISIBLE_TABS = "main_live_visible_tabs"
        private const val KEY_MAIN_MY_VISIBLE_TABS = "main_my_visible_tabs"
        private const val KEY_FOLLOWING_LIST_ORDER = "following_list_order"
        private const val KEY_DYNAMIC_FOLLOWING_RECENT_UPDATE_DOT_ENABLED = "dynamic_following_recent_update_dot_enabled"
        private const val KEY_AUTO_UPDATE_CHECK_ENABLED = "auto_update_check_enabled"
        private const val KEY_AUTO_UPDATE_IGNORED_VERSION_NAME = "auto_update_ignored_version_name"
        private const val KEY_IMAGE_QUALITY = "image_quality"
        private const val KEY_DANMAKU_ENABLED = "danmaku_enabled"
        private const val KEY_DANMAKU_ALLOW_TOP = "danmaku_allow_top"
        private const val KEY_DANMAKU_ALLOW_BOTTOM = "danmaku_allow_bottom"
        private const val KEY_DANMAKU_ALLOW_SCROLL = "danmaku_allow_scroll"
        private const val KEY_DANMAKU_ALLOW_COLOR = "danmaku_allow_color"
        private const val KEY_DANMAKU_ALLOW_SPECIAL = "danmaku_allow_special"
        private const val KEY_DANMAKU_AI_ENABLED = "danmaku_ai_enabled"
        private const val KEY_DANMAKU_AI_LEVEL = "danmaku_ai_level"
        private const val KEY_DANMAKU_FOLLOW_BILI_SHIELD = "danmaku_follow_bili_shield"
        private const val KEY_DANMAKU_SHOW_HIGH_LIKE_ICON = "danmaku_show_high_like_icon"
        private const val KEY_DANMAKU_OPACITY = "danmaku_opacity"
        private const val KEY_DANMAKU_AUTO_DENSITY = "danmaku_auto_density"
        private const val KEY_DANMAKU_TEXT_SIZE_SP = "danmaku_text_size_sp"
        private const val KEY_DANMAKU_LANE_DENSITY = "danmaku_lane_density"
        private const val KEY_DANMAKU_STROKE_WIDTH_PX = "danmaku_stroke_width_px"
        private const val KEY_DANMAKU_FONT_WEIGHT = "danmaku_font_weight"
        private const val KEY_DANMAKU_SPEED = "danmaku_speed"
        private const val KEY_DANMAKU_AREA = "danmaku_area"
        // v4.3: 本地弹幕关键词过滤
        private const val KEY_DANMAKU_LOCAL_KEYWORDS = "danmaku_local_keywords"
        // v6.4: 弹幕关键词高亮
        private const val KEY_DANMAKU_HIGHLIGHT_KEYWORDS = "danmaku_highlight_keywords"
        private const val KEY_DANMAKU_HIGHLIGHT_COLOR = "danmaku_highlight_color"
        private const val KEY_DANMAKU_SEND_HISTORY = "danmaku_send_history"
        private const val KEY_DANMAKU_SEND_HISTORY_LIMIT = "danmaku_send_history_limit"
        // v9.2: 评论排序偏好
        private const val KEY_COMMENT_SORT = "comment_sort"
        private const val KEY_KEEP_SCREEN_ON = "keep_screen_on"
        private const val KEY_DANMAKU_DEDUP = "danmaku_dedup"
        private const val KEY_COMMENT_FILTER_KEYWORDS = "comment_filter_keywords"
        private const val KEY_DANMAKU_MAX_COUNT = "danmaku_max_count"
        private const val KEY_AUTO_EXPAND_DESC = "auto_expand_desc"
        private const val KEY_LIVE_DANMAKU_HISTORY = "live_danmaku_history"
        private const val KEY_SUBTITLE_DELAY_MS = "subtitle_delay_ms"
        private const val KEY_VIDEO_LOOP_MODE = "video_loop_mode"
        private const val KEY_DEFAULT_BRIGHTNESS = "default_brightness"
        private const val KEY_SCREENSHOT_WATERMARK_MODE = "screenshot_watermark_mode"
        // v12.22: 截图水印位置
        private const val KEY_SCREENSHOT_WATERMARK_POSITION = "screenshot_watermark_position"
        // v12.23: 弹幕描边颜色
        private const val KEY_DANMAKU_STROKE_COLOR = "danmaku_stroke_color"
        // v12.25: 视频质量指示器
        private const val KEY_VIDEO_QUALITY_INDICATOR = "video_quality_indicator"
        // v12.26: 视频色彩调节
        private const val KEY_VIDEO_BRIGHTNESS = "video_brightness"
        private const val KEY_VIDEO_CONTRAST = "video_contrast"
        private const val KEY_VIDEO_SATURATION = "video_saturation"
        // v12.27: 视频画面裁剪
        private const val KEY_VIDEO_CROP_LEFT = "video_crop_left"
        private const val KEY_VIDEO_CROP_TOP = "video_crop_top"
        private const val KEY_VIDEO_CROP_RIGHT = "video_crop_right"
        private const val KEY_VIDEO_CROP_BOTTOM = "video_crop_bottom"
        // v12.28: 视频画面锐化/模糊
        private const val KEY_VIDEO_SHARPEN_LEVEL = "video_sharpen_level"
        // v12.29: 视频画面色温调节
        private const val KEY_VIDEO_COLOR_TEMPERATURE = "video_color_temperature"
        // v12.30: 视频画面滤镜预设
        private const val KEY_VIDEO_FILTER_PRESET = "video_filter_preset"
        // v13.1: 手势自定义
        private const val KEY_GESTURE_DOUBLE_TAP_LEFT = "gesture_double_tap_left"
        private const val KEY_GESTURE_DOUBLE_TAP_CENTER = "gesture_double_tap_center"
        private const val KEY_GESTURE_DOUBLE_TAP_RIGHT = "gesture_double_tap_right"
        // v13.7: 剩余时间倒计时显示
        private const val KEY_COUNTDOWN_DISPLAY = "countdown_display"
        // v13.8: 播放速度曲线显示
        private const val KEY_SPEED_CURVE_DISPLAY = "speed_curve_display"
        // v13.9: 播放位置百分比显示
        private const val KEY_PERCENTAGE_DISPLAY = "percentage_display"
        // v13.10: 视频亮度记忆
        private const val KEY_BRIGHTNESS_MEMORY = "brightness_memory"
        private const val KEY_LAST_VIDEO_BRIGHTNESS = "last_video_brightness"
        // v13.15: 音量记忆
        private const val KEY_VOLUME_MEMORY = "volume_memory"
        private const val KEY_LAST_VIDEO_VOLUME = "last_video_volume"
        // v13.16: 播放位置记忆
        private const val KEY_PLAYBACK_POSITION_MEMORY = "playback_position_memory"
        private const val KEY_LAST_VIDEO_POSITION = "last_video_position"
        // v13.17: 视频画质记忆
        private const val KEY_QUALITY_MEMORY = "quality_memory"
        // v13.18: 弹幕描边样式
        private const val KEY_DANMAKU_STROKE_STYLE = "danmaku_stroke_style"
        // v13.19: 截图保存路径
        private const val KEY_SCREENSHOT_SAVE_PATH = "screenshot_save_path"
        // v13.20: 播放速度微调
        private const val KEY_SPEED_FINE_TUNE = "speed_fine_tune"
        // v13.21: 弹幕时间轴预览
        private const val KEY_DANMAKU_TIMELINE_PREVIEW = "danmaku_timeline_preview"
        // v13.22: 弹幕速度预设
        private const val KEY_DANMAKU_SPEED_PRESET = "danmaku_speed_preset"
        // v14.1: 自动连播
        private const val KEY_AUTO_PLAYLIST = "auto_playlist"
        // v14.2: 弹幕透明度预设
        private const val KEY_DANMAKU_OPACITY_PRESET = "danmaku_opacity_preset"
        // v14.3: 播放列表排序方式
        private const val KEY_PLAYLIST_SORT_ORDER = "playlist_sort_order"
        // v14.4: 快捷键映射
        private const val KEY_SHORTCUT_KEY_MAPPING = "shortcut_key_mapping"
        // v14.5: 视频对比模式
        private const val KEY_VIDEO_COMPARE_MODE = "video_compare_mode"
        // v14.6: 弹幕过滤规则预设
        private const val KEY_DANMAKU_FILTER_PRESET = "danmaku_filter_preset"
        // v14.7: 记住播放倍速
        private const val KEY_REMEMBER_PLAYBACK_SPEED = "remember_playback_speed"
        // v14.8: 弹幕发送快捷键
        private const val KEY_DANMAKU_QUICK_SEND = "danmaku_quick_send"
        // v14.9: 视频缩略图预览
        private const val KEY_THUMBNAIL_PREVIEW = "thumbnail_preview"
        // v14.10: 播放历史记录导出
        private const val KEY_EXPORT_PLAY_HISTORY = "export_play_history"
        // v14.11: 弹幕字体阴影
        private const val KEY_DANMAKU_TEXT_SHADOW = "danmaku_text_shadow"
        // v14.12: 音频可视化
        private const val KEY_AUDIO_VISUALIZER = "audio_visualizer"
        // v14.13: 播放失败重试
        private const val KEY_AUTO_RETRY = "auto_retry"
        // v14.14: 双击反馈震动
        private const val KEY_DOUBLE_TAP_HAPTIC = "double_tap_haptic"
        // v14.15: 弹幕呼吸灯效果
        private const val KEY_DANMAKU_BREATHING = "danmaku_breathing"
        // v14.16: 锁屏播放控制
        private const val KEY_LOCK_SCREEN_CONTROL = "lock_screen_control"
        // v14.17: 跳过结尾动画
        private const val KEY_SKIP_ENDING_ANIMATION = "skip_ending_animation"
        // v14.18: 记忆播放模式
        private const val KEY_REMEMBER_PLAY_MODE = "remember_play_mode"
        // v14.19: 弹幕池容量
        private const val KEY_DANMAKU_POOL_SIZE = "danmaku_pool_size"
        // v14.20: 视频投射模式
        private const val KEY_CAST_MODE = "cast_mode"
        // v15.1: 弹幕缩放比例
        private const val KEY_DANMAKU_SCALE = "danmaku_scale"
        // v15.2: 自动播放下一集
        private const val KEY_AUTO_PLAY_NEXT_EPISODE = "auto_play_next_episode"
        // v15.3: 弹幕描边模糊
        private const val KEY_DANMAKU_STROKE_BLUR = "danmaku_stroke_blur"
        // v15.4: 记住音量
        private const val KEY_REMEMBER_VOLUME = "remember_volume"
        // v15.5: 记住亮度
        private const val KEY_REMEMBER_BRIGHTNESS = "remember_brightness"
        // v15.6: 弹幕间隔时间
        private const val KEY_DANMAKU_INTERVAL = "danmaku_interval"
        // v15.7: 播放速度曲线
        private const val KEY_PLAYBACK_SPEED_CURVE = "playback_speed_curve"
        // v15.8: 弹幕池优先级
        private const val KEY_DANMAKU_POOL_PRIORITY = "danmaku_pool_priority"
        // v15.10: 弹幕时间偏移
        private const val KEY_DANMAKU_TIME_OFFSET = "danmaku_time_offset"
        // v15.11: 自动跳过片头
        private const val KEY_AUTO_SKIP_OPENING = "auto_skip_opening"
        // v15.12: 弹幕透明度动画
        private const val KEY_DANMAKU_OPACITY_ANIM = "danmaku_opacity_anim"
        // v15.13: 弹幕发送历史备份
        private const val KEY_DANMAKU_SEND_HISTORY_BACKUP = "danmaku_send_history_backup"
        // v15.14: 视频旋转记忆
        private const val KEY_REMEMBER_VIDEO_ROTATION = "remember_video_rotation"
        // v15.15: 弹幕模糊半径
        private const val KEY_DANMAKU_BLUR_RADIUS = "danmaku_blur_radius"
        // v15.16: 快捷分享
        private const val KEY_QUICK_SHARE = "quick_share"
        // v15.17: 记住弹幕开关
        private const val KEY_REMEMBER_DANMAKU_ENABLED = "remember_danmaku_enabled"
        // v15.18: 弹幕入场动画
        private const val KEY_DANMAKU_ENTRY_ANIM = "danmaku_entry_anim"
        // v15.19: 视频截图质量
        private const val KEY_SCREENSHOT_QUALITY = "screenshot_quality"
        // v15.20: 弹幕输出模式
        private const val KEY_DANMAKU_OUTPUT_MODE = "danmaku_output_mode"
        // v15.21: 播放进度条样式
        private const val KEY_PROGRESS_BAR_STYLE = "progress_bar_style"
        // v15.22: 弹幕渲染层级
        private const val KEY_DANMAKU_RENDER_LAYER = "danmaku_render_layer"
        // v15.23: 自动播放记忆
        private const val KEY_REMEMBER_AUTO_PLAY = "remember_auto_play"
        // v15.24: 弹幕过滤关键词
        private const val KEY_DANMAKU_FILTER_KEYWORDS = "danmaku_filter_keywords"
        // v15.25: 视频色彩空间
        private const val KEY_VIDEO_COLOR_SPACE = "video_color_space"
        // v15.26: 弹幕发送快捷键
        private const val KEY_DANMAKU_SEND_KEY = "danmaku_send_key"
        // v15.27: 播放倍速预设
        private const val KEY_PLAYBACK_SPEED_PRESETS = "playback_speed_presets"
        // v15.28: 弹幕过滤正则
        private const val KEY_DANMAKU_FILTER_REGEX = "danmaku_filter_regex"
        // v15.29: 视频投射设备
        private const val KEY_CAST_DEVICE_NAME = "cast_device_name"
        // v15.30: 弹幕描边3D效果
        private const val KEY_DANMAKU_STROKE_3D = "danmaku_stroke_3d"
        // v16.1: 弹幕字体描边颜色
        private const val KEY_DANMAKU_STROKE_COLOR_V2 = "danmaku_stroke_color_v2"
        // v16.2: 弹幕抗锯齿
        private const val KEY_DANMAKU_ANTI_ALIASING = "danmaku_anti_aliasing"
        // v16.3: 视频倍速记忆
        private const val KEY_REMEMBER_VIDEO_SPEED = "remember_video_speed"
        // v16.4: 弹幕发送确认
        private const val KEY_DANMAKU_SEND_CONFIRM = "danmaku_send_confirm"
        // v16.5: 播放完成后动作
        private const val KEY_PLAYBACK_COMPLETE_ACTION = "playback_complete_action"
        // v16.6: 弹幕显示区域
        private const val KEY_DANMAKU_DISPLAY_AREA = "danmaku_display_area"
        // v16.7: 视频解码方式
        private const val KEY_VIDEO_DECODER = "video_decoder"
        // v16.8: 弹幕发送框位置
        private const val KEY_DANMAKU_INPUT_POSITION = "danmaku_input_position"
        // v16.9: 跳过片尾时长
        private const val KEY_SKIP_ENDING_DURATION = "skip_ending_duration"
        // v16.10: 弹幕粗体模式
        private const val KEY_DANMAKU_BOLD_MODE = "danmaku_bold_mode"
        // v16.11: 视频投射音量
        private const val KEY_CAST_VOLUME = "cast_volume"
        // v16.12: 记住弹幕密度
        private const val KEY_REMEMBER_DANMAKU_DENSITY = "remember_danmaku_density"
        // v16.13: 弹幕刷新率
        private const val KEY_DANMAKU_REFRESH_RATE = "danmaku_refresh_rate"
        // v16.14: 视频截图格式
        private const val KEY_SCREENSHOT_FORMAT = "screenshot_format"
        // v16.15: 弹幕描边透明度
        private const val KEY_DANMAKU_STROKE_OPACITY = "danmaku_stroke_opacity"
        // v17.1: 弹幕发光效果
        private const val KEY_DANMAKU_GLOW_EFFECT = "danmaku_glow_effect"
        // v17.2: 视频缓存路径
        private const val KEY_VIDEO_CACHE_PATH = "video_cache_path"
        // v17.3: 弹幕合并模式
        private const val KEY_DANMAKU_MERGE_MODE = "danmaku_merge_mode"
        // v17.4: 记住播放比例
        private const val KEY_REMEMBER_ASPECT_RATIO = "remember_aspect_ratio"
        // v17.5: 弹幕字体选择
        private const val KEY_DANMAKU_FONT_FAMILY = "danmaku_font_family"
        // v17.6: 视频投射延迟
        private const val KEY_CAST_LATENCY = "cast_latency"
        // v17.7: 弹幕过滤强度
        private const val KEY_DANMAKU_FILTER_STRENGTH = "danmaku_filter_strength"
        // v17.8: 播放列表循环模式
        private const val KEY_PLAYLIST_LOOP_MODE = "playlist_loop_mode"
        // v17.9: 弹幕时间戳显示
        private const val KEY_DANMAKU_TIMESTAMP_VISIBLE = "danmaku_timestamp_visible"
        // v17.10: 视频缩放模式
        private const val KEY_VIDEO_SCALE_MODE = "video_scale_mode"
        // v17.11: 自动清理缓存
        private const val KEY_AUTO_CLEAN_CACHE = "auto_clean_cache"
        // v17.12: 弹幕预览模式
        private const val KEY_DANMAKU_PREVIEW_MODE = "danmaku_preview_mode"
        // v17.13: 记住弹幕位置
        private const val KEY_REMEMBER_DANMAKU_POSITION = "remember_danmaku_position"
        // v17.14: 视频HDR模式
        private const val KEY_VIDEO_HDR_MODE = "video_hdr_mode"
        // v17.15: 弹幕描边渐变
        private const val KEY_DANMAKU_STROKE_GRADIENT = "danmaku_stroke_gradient"
        // v18.1: 弹幕延迟发送
        private const val KEY_DANMAKU_DELAYED_SEND = "danmaku_delayed_send"
        // v18.2: 视频投屏标准
        private const val KEY_CAST_STANDARD = "cast_standard"
        // v18.3: 弹幕滚动速度
        private const val KEY_DANMAKU_SCROLL_SPEED = "danmaku_scroll_speed"
        // v18.4: 记住画中画模式
        private const val KEY_REMEMBER_PIP_MODE = "remember_pip_mode"
        // v18.5: 弹幕文字阴影颜色
        private const val KEY_DANMAKU_TEXT_SHADOW_COLOR = "danmaku_text_shadow_color"
        // v18.6: 视频自动旋转
        private const val KEY_AUTO_ROTATE_VIDEO = "auto_rotate_video"
        // v18.7: 弹幕过滤模式
        private const val KEY_DANMAKU_FILTER_MODE = "danmaku_filter_mode"
        // v18.8: 播放网络检测
        private const val KEY_NETWORK_CHECK = "network_check"
        // v18.11: 弹幕透明度记忆
        private const val KEY_REMEMBER_DANMAKU_OPACITY = "remember_danmaku_opacity"
        // v18.12: 视频截图声音
        private const val KEY_SCREENSHOT_SOUND = "screenshot_sound"
        // v18.13: 弹幕历史记录上限
        private const val KEY_DANMAKU_HISTORY_LIMIT = "danmaku_history_limit"
        // v18.14: 播放记忆天数
        private const val KEY_PLAY_HISTORY_DAYS = "play_history_days"
        // v18.15: 弹幕字体轮廓
        private const val KEY_DANMAKU_FONT_OUTLINE = "danmaku_font_outline"
        // v19.1: 弹幕动画效果
        private const val KEY_DANMAKU_ANIMATION = "danmaku_animation"
        // v19.2: 视频弹幕同步
        private const val KEY_DANMAKU_VIDEO_SYNC = "danmaku_video_sync"
        // v19.3: 弹幕呼吸灯模式
        private const val KEY_DANMAKU_BREATHING_MODE = "danmaku_breathing_mode"
        // v19.4: 记住播放模式 (使用v16.x已有)
        // v19.5: 弹幕快速复制
        private const val KEY_DANMAKU_QUICK_COPY = "danmaku_quick_copy"
        // v19.6: 视频投射优先
        private const val KEY_CAST_PRIORITY = "cast_priority"
        // v19.7: 弹幕收藏功能
        private const val KEY_DANMAKU_FAVORITE = "danmaku_favorite"
        // v19.8: 记住播放速度 (使用v14.7已有)
        // v19.9: 弹幕智能屏蔽
        private const val KEY_DANMAKU_SMART_BLOCK = "danmaku_smart_block"
        // v19.10: 视频记忆亮度 (使用v16.x已有)
        // v19.11: 弹幕屏蔽关键词
        private const val KEY_BLOCK_KEYWORDS = "block_keywords"
        // v19.12: 视频投射镜像
        private const val KEY_CAST_MIRROR = "cast_mirror"
        // v19.13: 弹幕显示延迟
        private const val KEY_DANMAKU_DISPLAY_DELAY = "danmaku_display_delay"
        // v19.14: 记住音量 (使用v16.x已有)
        // v19.15: 弹幕背景模糊
        private const val KEY_DANMAKU_BACKGROUND_BLUR = "danmaku_background_blur"
        // v20.1: 弹幕彩虹特效
        private const val KEY_DANMAKU_RAINBOW_EFFECT = "danmaku_rainbow_effect"
        // v20.2: 视频平滑过渡
        private const val KEY_VIDEO_SMOOTH_TRANSITION = "video_smooth_transition"
        // v20.3: 弹幕打字机效果
        private const val KEY_DANMAKU_TYPEWRITER_EFFECT = "danmaku_typewriter_effect"
        // v20.4: 记住播放列表顺序
        private const val KEY_REMEMBER_PLAYLIST_ORDER = "remember_playlist_order"
        // v20.5: 弹幕批量复制
        private const val KEY_DANMAKU_BATCH_COPY = "danmaku_batch_copy"
        // v20.6: 视频投射性能模式
        private const val KEY_CAST_PERFORMANCE_MODE = "cast_performance_mode"
        // v20.7: 弹幕缩放效果
        private const val KEY_DANMAKU_ZOOM_EFFECT = "danmaku_zoom_effect"
        // v20.8: 视频自动跳过片头 (使用v16.x已有)
        // v20.9: 弹幕模板回复
        private const val KEY_DANMAKU_TEMPLATE_REPLY = "danmaku_template_reply"
        // v20.10: 视频投射省电模式
        private const val KEY_CAST_POWER_SAVING = "cast_power_saving"
        // v20.11: 弹幕高亮特效
        private const val KEY_DANMAKU_HIGHLIGHT_EFFECT = "danmaku_highlight_effect"
        // v20.12: 记住播放位置
        private const val KEY_REMEMBER_PLAY_POSITION = "remember_play_position"
        // v20.13: 弹幕发送动画
        private const val KEY_DANMAKU_SEND_ANIMATION = "danmaku_send_animation"
        // v20.14: 记住播放跳过
        private const val KEY_REMEMBER_SKIP_SETTINGS = "remember_skip_settings"
        // v20.15: 弹幕3D效果
        private const val KEY_DANMAKU_3D_EFFECT = "danmaku_3d_effect"
        // ==================== v22.x 新功能 ====================
        // v22.1: 播放速度曲线自定义
        private const val KEY_V22_PLAYBACK_SPEED_CURVE_MODE = "v22_playback_speed_curve_mode"
        // v22.2: 弹幕颜色过滤
        private const val KEY_V22_DANMAKU_COLOR_FILTER_ENABLED = "v22_danmaku_color_filter_enabled"
        // v22.3: 视频画面锐化强度
        private const val KEY_V22_VIDEO_SHARPEN_STRENGTH = "v22_video_sharpen_strength"
        // v22.4: 弹幕描边颜色渐变
        private const val KEY_V22_DANMAKU_STROKE_GRADIENT_MODE = "v22_danmaku_stroke_gradient_mode"
        // v22.5: 手势轨迹显示
        private const val KEY_V22_SHOW_GESTURE_TRAIL = "v22_show_gesture_trail"
        // v22.6: 视频缓存大小限制
        private const val KEY_V22_VIDEO_CACHE_SIZE_MB = "v22_video_cache_size_mb"
        // v22.7: 弹幕发送字数统计
        private const val KEY_V22_SHOW_DANMAKU_CHAR_COUNT = "v22_show_danmaku_char_count"
        // v22.8: 视频画面降噪
        private const val KEY_V22_VIDEO_DENOISE_ENABLED = "v22_video_denoise_enabled"
        // v22.9: 弹幕透明度动画曲线
        private const val KEY_V22_DANMAKU_OPACITY_CURVE_MODE = "v22_danmaku_opacity_curve_mode"
        // v22.10: 播放器快捷面板自定义
        private const val KEY_V22_QUICK_PANEL_CUSTOM_ENABLED = "v22_quick_panel_custom_enabled"
        // v22.11: 视频投射分辨率限制
        private const val KEY_V22_CAST_RESOLUTION_LIMIT = "v22_cast_resolution_limit"
        // v22.12: 弹幕字体大小自适应
        private const val KEY_V22_DANMAKU_FONT_AUTO_SIZE_MODE = "v22_danmaku_font_auto_size_mode"
        // v22.13: 播放器截图格式选择
        private const val KEY_V22_SCREENSHOT_FORMAT = "v22_screenshot_format"
        // v22.14: 视频色彩饱和度调节
        private const val KEY_V22_VIDEO_SATURATION = "v22_video_saturation"
        // v22.15: 弹幕时间轴标记
        private const val KEY_V22_DANMAKU_TIMELINE_MARKER_ENABLED = "v22_danmaku_timeline_marker_enabled"
        // ==================== v23.x 新功能 ====================
        // v23.1: 视频播放速度预设自定义
        private const val KEY_V23_CUSTOM_SPEED_PRESETS = "v23_custom_speed_presets"
        // v23.2: 弹幕字体阴影颜色
        private const val KEY_V23_DANMAKU_SHADOW_COLOR = "v23_danmaku_shadow_color"
        // v23.3: 视频画面色彩温度
        private const val KEY_V23_VIDEO_COLOR_TEMPERATURE = "v23_video_color_temperature"
        // v23.4: 弹幕发送震动强度
        private const val KEY_V23_DANMAKU_VIBRATION_STRENGTH = "v23_danmaku_vibration_strength"
        // v23.5: 播放器手势灵敏度
        private const val KEY_V23_GESTURE_SENSITIVITY = "v23_gesture_sensitivity"
        // v23.6: 视频缓存预加载大小
        private const val KEY_V23_CACHE_PRELOAD_SIZE_MB = "v23_cache_preload_size_mb"
        // v23.7: 弹幕显示区域透明度
        private const val KEY_V23_DANMAKU_AREA_OPACITY = "v23_danmaku_area_opacity"
        // v23.8: 视频画面伽马调节
        private const val KEY_V23_VIDEO_GAMMA = "v23_video_gamma"
        // v23.9: 弹幕发送确认震动
        private const val KEY_V23_DANMAKU_SEND_CONFIRM_VIBRATION = "v23_danmaku_send_confirm_vibration"
        // v23.10: 播放器快捷键映射
        private const val KEY_V23_QUICK_KEY_MAPPING = "v23_quick_key_mapping"
        // v23.11: 视频投射缓冲大小
        private const val KEY_V23_CAST_BUFFER_SIZE_MB = "v23_cast_buffer_size_mb"
        // v23.12: 弹幕字体间距调节
        private const val KEY_V23_DANMAKU_FONT_SPACING = "v23_danmaku_font_spacing"
        // v23.13: 播放器截图质量
        private const val KEY_V23_SCREENSHOT_QUALITY = "v23_screenshot_quality"
        // v23.14: 视频画面色调调节
        private const val KEY_V23_VIDEO_HUE = "v23_video_hue"
        // v23.15: 弹幕时间轴缩放速度
        private const val KEY_V23_TIMELINE_ZOOM_SPEED = "v23_timeline_zoom_speed"
        // ==================== v24.x 新功能 ====================
        // v24.1: 视频播放列表循环模式
        private const val KEY_V24_PLAYLIST_LOOP_MODE = "v24_playlist_loop_mode"
        // v24.2: 弹幕字体描边粗细
        private const val KEY_V24_DANMAKU_STROKE_WIDTH = "v24_danmaku_stroke_width"
        // v24.3: 视频画面亮度曲线
        private const val KEY_V24_BRIGHTNESS_CURVE_MODE = "v24_brightness_curve_mode"
        // v24.4: 弹幕发送延迟调节
        private const val KEY_V24_DANMAKU_SEND_DELAY = "v24_danmaku_send_delay"
        // v24.5: 播放器音量步进
        private const val KEY_V24_VOLUME_STEP = "v24_volume_step"
        // v24.6: 视频缓存清理间隔
        private const val KEY_V24_CACHE_CLEANUP_INTERVAL = "v24_cache_cleanup_interval"
        // v24.7: 弹幕显示位置偏移
        private const val KEY_V24_DANMAKU_POSITION_OFFSET = "v24_danmaku_position_offset"
        // v24.8: 视频画面对比度曲线
        private const val KEY_V24_CONTRAST_CURVE_MODE = "v24_contrast_curve_mode"
        // v24.9: 弹幕发送历史记录数
        private const val KEY_V24_DANMAKU_SEND_HISTORY_COUNT = "v24_danmaku_send_history_count"
        // v24.10: 播放器进度条样式
        private const val KEY_V24_PROGRESS_BAR_STYLE = "v24_progress_bar_style"
        // v24.11: 视频投射画面质量
        private const val KEY_V24_CAST_QUALITY = "v24_cast_quality"
        // v24.12: 弹幕字体描边透明度
        private const val KEY_V24_DANMAKU_STROKE_OPACITY = "v24_danmaku_stroke_opacity"
        // v24.13: 播放器手势双击功能
        private const val KEY_V24_DOUBLE_TAP_FUNCTION = "v24_double_tap_function"
        // v24.14: 视频画面色调曲线
        private const val KEY_V24_TONE_CURVE_MODE = "v24_tone_curve_mode"
        // v24.15: 弹幕显示刷新率
        private const val KEY_V24_DANMAKU_REFRESH_RATE = "v24_danmaku_refresh_rate"
        // ==================== v25.x 新功能 ====================
        // v25.1: 视频播放列表随机播放
        private const val KEY_V25_PLAYLIST_SHUFFLE = "v25_playlist_shuffle"
        // v25.2: 弹幕字体背景颜色
        private const val KEY_V25_DANMAKU_BG_COLOR = "v25_danmaku_bg_color"
        // v25.3: 视频画面饱和度曲线
        private const val KEY_V25_SATURATION_CURVE_MODE = "v25_saturation_curve_mode"
        // v25.4: 弹幕发送确认对话框
        private const val KEY_V25_DANMAKU_SEND_CONFIRM = "v25_danmaku_send_confirm"
        // v25.5: 播放器音量记忆
        private const val KEY_V25_REMEMBER_VOLUME = "v25_remember_volume"
        // v25.6: 视频缓存预加载策略
        private const val KEY_V25_CACHE_PRELOAD_STRATEGY = "v25_cache_preload_strategy"
        // v25.7: 弹幕显示时间长度
        private const val KEY_V25_DANMAKU_DISPLAY_DURATION = "v25_danmaku_display_duration"
        // v25.8: 视频画面锐化曲线
        private const val KEY_V25_SHARPEN_CURVE_MODE = "v25_sharpen_curve_mode"
        // v25.9: 弹幕发送历史记录
        private const val KEY_V25_DANMAKU_SEND_HISTORY = "v25_danmaku_send_history"
        // v25.10: 播放器进度条颜色
        private const val KEY_V25_PROGRESS_BAR_COLOR = "v25_progress_bar_color"
        // v25.11: 视频投射音频质量
        private const val KEY_V25_CAST_AUDIO_QUALITY = "v25_cast_audio_quality"
        // v25.12: 弹幕字体背景透明度
        private const val KEY_V25_DANMAKU_BG_OPACITY = "v25_danmaku_bg_opacity"
        // v25.13: 播放器手势长按功能
        private const val KEY_V25_LONG_PRESS_FUNCTION = "v25_long_press_function"
        // v25.14: 视频画面降噪曲线
        private const val KEY_V25_DENOISE_CURVE_MODE = "v25_denoise_curve_mode"
        // v25.15: 弹幕显示字体大小
        private const val KEY_V25_DANMAKU_FONT_SIZE = "v25_danmaku_font_size"
        // ==================== v26.x 新功能 ====================
        // v26.1: 视频播放列表自动播放
        private const val KEY_V26_PLAYLIST_AUTO_PLAY = "v26_playlist_auto_play"
        // v26.2: 弹幕字体边框颜色
        private const val KEY_V26_DANMAKU_BORDER_COLOR = "v26_danmaku_border_color"
        // v26.3: 视频画面对比度曲线
        private const val KEY_V26_CONTRAST_CURVE_MODE = "v26_contrast_curve_mode"
        // v26.4: 弹幕发送确认震动
        private const val KEY_V26_DANMAKU_SEND_VIBRATION = "v26_danmaku_send_vibration"
        // v26.5: 播放器音量均衡
        private const val KEY_V26_VOLUME_BALANCE = "v26_volume_balance"
        // v26.6: 视频缓存预加载大小
        private const val KEY_V26_CACHE_PRELOAD_SIZE = "v26_cache_preload_size"
        // v26.7: 弹幕显示透明度
        private const val KEY_V26_DANMAKU_DISPLAY_OPACITY = "v26_danmaku_display_opacity"
        // v26.8: 视频画面亮度曲线
        private const val KEY_V26_BRIGHTNESS_CURVE_MODE = "v26_brightness_curve_mode"
        // v26.9: 弹幕发送历史记录数
        private const val KEY_V26_DANMAKU_HISTORY_COUNT = "v26_danmaku_history_count"
        // v26.10: 播放器进度条透明度
        private const val KEY_V26_PROGRESS_BAR_OPACITY = "v26_progress_bar_opacity"
        // v26.11: 视频投射缓冲策略
        private const val KEY_V26_CAST_BUFFER_STRATEGY = "v26_cast_buffer_strategy"
        // v26.12: 弹幕字体边框透明度
        private const val KEY_V26_DANMAKU_BORDER_OPACITY = "v26_danmaku_border_opacity"
        // v26.13: 播放器手势滑动功能
        private const val KEY_V26_SWIPE_FUNCTION = "v26_swipe_function"
        // v26.14: 视频画面饱和度曲线
        private const val KEY_V26_SATURATION_CURVE_MODE = "v26_saturation_curve_mode"
        // v26.15: 弹幕显示字体样式
        private const val KEY_V26_DANMAKU_FONT_STYLE = "v26_danmaku_font_style"
        // ==================== v27.x 新功能 ====================
        // v27.1: 视频播放列表自动下一个
        private const val KEY_V27_PLAYLIST_AUTO_NEXT = "v27_playlist_auto_next"
        // v27.2: 弹幕字体阴影透明度
        private const val KEY_V27_DANMAKU_SHADOW_OPACITY = "v27_danmaku_shadow_opacity"
        // v27.3: 视频画面色彩平衡
        private const val KEY_V27_COLOR_BALANCE = "v27_color_balance"
        // v27.4: 弹幕发送确认对话框
        private const val KEY_V27_DANMAKU_SEND_CONFIRM_DIALOG = "v27_danmaku_send_confirm_dialog"
        // v27.5: 播放器音量限制
        private const val KEY_V27_VOLUME_LIMIT = "v27_volume_limit"
        // v27.6: 视频缓存清理策略
        private const val KEY_V27_CACHE_CLEANUP_STRATEGY = "v27_cache_cleanup_strategy"
        // v27.7: 弹幕显示位置对齐
        private const val KEY_V27_DANMAKU_POSITION_ALIGN = "v27_danmaku_position_align"
        // v27.8: 视频画面色调曲线
        private const val KEY_V27_TONE_CURVE_MODE = "v27_tone_curve_mode"
        // v27.9: 弹幕发送历史记录大小
        private const val KEY_V27_DANMAKU_HISTORY_SIZE = "v27_danmaku_history_size"
        // v27.10: 播放器进度条高度
        private const val KEY_V27_PROGRESS_BAR_HEIGHT = "v27_progress_bar_height"
        // v27.11: 视频投射画面延迟
        private const val KEY_V27_CAST_DELAY = "v27_cast_delay"
        // v27.12: 弹幕字体阴影大小
        private const val KEY_V27_DANMAKU_SHADOW_SIZE = "v27_danmaku_shadow_size"
        // v27.13: 播放器手势双击功能
        private const val KEY_V27_DOUBLE_TAP_FUNCTION = "v27_double_tap_function"
        // v27.14: 视频画面降噪强度
        private const val KEY_V27_DENOISE_STRENGTH = "v27_denoise_strength"
        // v27.15: 弹幕显示字体间距
        private const val KEY_V27_DANMAKU_FONT_SPACING = "v27_danmaku_font_spacing"
        // v28.1: 视频播放列表自动跳过
        private const val KEY_V28_AUTO_SKIP = "v28_auto_skip"
        // v28.2: 弹幕字体背景圆角
        private const val KEY_V28_DANMAKU_BACKGROUND_CORNER_RADIUS = "v28_danmaku_background_corner_radius"
        // v28.3: 视频画面色彩饱和度
        private const val KEY_V28_COLOR_SATURATION = "v28_color_saturation"
        // v28.4: 弹幕发送确认震动强度
        private const val KEY_V28_SEND_CONFIRM_VIBRATION_STRENGTH = "v28_send_confirm_vibration_strength"
        // v28.5: 播放器音量淡入淡出
        private const val KEY_V28_VOLUME_FADE = "v28_volume_fade"
        // v28.6: 视频缓存预加载间隔
        private const val KEY_V28_PRELOAD_INTERVAL = "v28_preload_interval"
        // v28.7: 弹幕显示位置边距
        private const val KEY_V28_DANMAKU_POSITION_MARGIN = "v28_danmaku_position_margin"
        // v28.8: 视频画面色彩对比度
        private const val KEY_V28_COLOR_CONTRAST = "v28_color_contrast"
        // v28.9: 弹幕发送历史记录清理
        private const val KEY_V28_HISTORY_CLEANUP = "v28_history_cleanup"
        // v28.10: 播放器进度条圆角
        private const val KEY_V28_PROGRESS_BAR_CORNER_RADIUS = "v28_progress_bar_corner_radius"
        // v28.11: 视频投射画面缓冲
        private const val KEY_V28_CAST_BUFFER = "v28_cast_buffer"
        // v28.12: 弹幕字体背景边距
        private const val KEY_V28_DANMAKU_BACKGROUND_PADDING = "v28_danmaku_background_padding"
        // v28.13: 播放器手势滑动灵敏度
        private const val KEY_V28_SWIPE_SENSITIVITY = "v28_swipe_sensitivity"
        // v28.14: 视频画面色彩亮度
        private const val KEY_V28_COLOR_BRIGHTNESS = "v28_color_brightness"
        // v28.15: 弹幕显示字体阴影
        private const val KEY_V28_DANMAKU_FONT_SHADOW = "v28_danmaku_font_shadow"
        // v29.1: 视频播放列表自动排序
        private const val KEY_V29_AUTO_SORT = "v29_auto_sort"
        // v29.2: 弹幕字体背景颜色
        private const val KEY_V29_DANMAKU_BACKGROUND_COLOR = "v29_danmaku_background_color"
        // v29.3: 视频画面色彩色调
        private const val KEY_V29_COLOR_HUE = "v29_color_hue"
        // v29.4: 弹幕发送确认对话框样式
        private const val KEY_V29_SEND_CONFIRM_DIALOG_STYLE = "v29_send_confirm_dialog_style"
        // v29.5: 播放器音量限制模式
        private const val KEY_V29_VOLUME_LIMIT_MODE = "v29_volume_limit_mode"
        // v29.6: 视频缓存清理阈值
        private const val KEY_V29_CACHE_CLEANUP_THRESHOLD = "v29_cache_cleanup_threshold"
        // v29.7: 弹幕显示位置偏移
        private const val KEY_V29_DANMAKU_POSITION_OFFSET = "v29_danmaku_position_offset"
        // v29.8: 视频画面色彩色温
        private const val KEY_V29_COLOR_TEMPERATURE = "v29_color_temperature"
        // v29.9: 弹幕发送历史记录导出
        private const val KEY_V29_HISTORY_EXPORT = "v29_history_export"
        // v29.10: 播放器进度条样式
        private const val KEY_V29_PROGRESS_BAR_STYLE = "v29_progress_bar_style"
        // v29.11: 视频投射画面质量
        private const val KEY_V29_CAST_QUALITY = "v29_cast_quality"
        // v29.12: 弹幕字体背景透明度
        private const val KEY_V29_DANMAKU_BACKGROUND_OPACITY = "v29_danmaku_background_opacity"
        // v29.13: 播放器手势长按功能
        private const val KEY_V29_LONG_PRESS_FUNCTION = "v29_long_press_function"
        // v29.14: 视频画面色彩伽马
        private const val KEY_V29_COLOR_GAMMA = "v29_color_gamma"
        // v29.15: 弹幕显示字体描边
        private const val KEY_V29_DANMAKU_FONT_STROKE = "v29_danmaku_font_stroke"
        // v30.1: 视频播放列表自动循环
        private const val KEY_V30_AUTO_LOOP = "v30_auto_loop"
        // v30.2: 弹幕字体背景边框
        private const val KEY_V30_DANMAKU_BACKGROUND_BORDER = "v30_danmaku_background_border"
        // v30.3: 视频画面色彩锐化
        private const val KEY_V30_COLOR_SHARPEN = "v30_color_sharpen"
        // v30.4: 弹幕发送确认震动模式
        private const val KEY_V30_VIBRATION_MODE = "v30_vibration_mode"
        // v30.5: 播放器音量限制阈值
        private const val KEY_V30_VOLUME_LIMIT_THRESHOLD = "v30_volume_limit_threshold"
        // v30.6: 视频缓存清理模式
        private const val KEY_V30_CACHE_CLEANUP_MODE = "v30_cache_cleanup_mode"
        // v30.7: 弹幕显示位置对齐方式
        private const val KEY_V30_DANMAKU_POSITION_ALIGN_MODE = "v30_danmaku_position_align_mode"
        // v30.8: 视频画面色彩降噪
        private const val KEY_V30_COLOR_DENOISE = "v30_color_denoise"
        // v30.9: 弹幕发送历史记录导入
        private const val KEY_V30_HISTORY_IMPORT = "v30_history_import"
        // v30.10: 播放器进度条颜色
        private const val KEY_V30_PROGRESS_BAR_COLOR = "v30_progress_bar_color"
        // v30.11: 视频投射画面延迟
        private const val KEY_V30_CAST_LATENCY = "v30_cast_latency"
        // v30.12: 弹幕字体背景阴影
        private const val KEY_V30_DANMAKU_BACKGROUND_SHADOW = "v30_danmaku_background_shadow"
        // v30.13: 播放器手势滑动功能
        private const val KEY_V30_SWIPE_FUNCTION = "v30_swipe_function"
        // v30.14: 视频画面色彩模糊
        private const val KEY_V30_COLOR_BLUR = "v30_color_blur"
        // v30.15: 弹幕显示字体发光
        private const val KEY_V30_DANMAKU_FONT_GLOW = "v30_danmaku_font_glow"
        // v31.1: 视频播放列表自动跳过片头
        private const val KEY_V31_AUTO_SKIP_INTRO = "v31_auto_skip_intro"
        // v31.2: 弹幕字体背景渐变
        private const val KEY_V31_DANMAKU_BACKGROUND_GRADIENT = "v31_danmaku_background_gradient"
        // v31.3: 视频画面色彩对比度曲线
        private const val KEY_V31_COLOR_CONTRAST_CURVE = "v31_color_contrast_curve"
        // v31.4: 弹幕发送确认震动间隔
        private const val KEY_V31_VIBRATION_INTERVAL = "v31_vibration_interval"
        // v31.5: 播放器音量限制模式切换
        private const val KEY_V31_VOLUME_LIMIT_MODE_SWITCH = "v31_volume_limit_mode_switch"
        // v31.6: 视频缓存清理优先级
        private const val KEY_V31_CACHE_CLEANUP_PRIORITY = "v31_cache_cleanup_priority"
        // v31.7: 弹幕显示位置对齐偏移
        private const val KEY_V31_DANMAKU_POSITION_ALIGN_OFFSET = "v31_danmaku_position_align_offset"
        // v31.8: 视频画面色彩饱和度曲线
        private const val KEY_V31_COLOR_SATURATION_CURVE = "v31_color_saturation_curve"
        // v31.9: 弹幕发送历史记录搜索
        private const val KEY_V31_HISTORY_SEARCH = "v31_history_search"
        // v31.10: 播放器进度条动画
        private const val KEY_V31_PROGRESS_BAR_ANIMATION = "v31_progress_bar_animation"
        // v31.11: 视频投射画面缓冲策略
        private const val KEY_V31_CAST_BUFFER_STRATEGY = "v31_cast_buffer_strategy"
        // v31.12: 弹幕字体背景渐变方向
        private const val KEY_V31_DANMAKU_BACKGROUND_GRADIENT_DIRECTION = "v31_danmaku_background_gradient_direction"
        // v31.13: 播放器手势滑动阈值
        private const val KEY_V31_SWIPE_THRESHOLD = "v31_swipe_threshold"
        // v31.14: 视频画面色彩亮度曲线
        private const val KEY_V31_COLOR_BRIGHTNESS_CURVE = "v31_color_brightness_curve"
        // v31.15: 弹幕显示字体发光颜色
        private const val KEY_V31_DANMAKU_FONT_GLOW_COLOR = "v31_danmaku_font_glow_color"
        // v32.1: 视频播放列表自动跳过片尾
        private const val KEY_V32_AUTO_SKIP_OUTRO = "v32_auto_skip_outro"
        // v32.2: 弹幕字体背景渐变颜色
        private const val KEY_V32_DANMAKU_BACKGROUND_GRADIENT_COLOR = "v32_danmaku_background_gradient_color"
        // v32.3: 视频画面色彩色调曲线
        private const val KEY_V32_COLOR_HUE_CURVE = "v32_color_hue_curve"
        // v32.4: 弹幕发送确认震动强度曲线
        private const val KEY_V32_VIBRATION_STRENGTH_CURVE = "v32_vibration_strength_curve"
        // v32.5: 播放器音量限制阈值曲线
        private const val KEY_V32_VOLUME_LIMIT_THRESHOLD_CURVE = "v32_volume_limit_threshold_curve"
        // v32.6: 视频缓存清理策略曲线
        private const val KEY_V32_CACHE_CLEANUP_STRATEGY_CURVE = "v32_cache_cleanup_strategy_curve"
        // v32.7: 弹幕显示位置对齐方式曲线
        private const val KEY_V32_DANMAKU_POSITION_ALIGN_MODE_CURVE = "v32_danmaku_position_align_mode_curve"
        // v32.8: 视频画面色彩降噪曲线
        private const val KEY_V32_COLOR_DENOISE_CURVE = "v32_color_denoise_curve"
        // v32.9: 弹幕发送历史记录导出格式
        private const val KEY_V32_HISTORY_EXPORT_FORMAT = "v32_history_export_format"
        // v32.10: 播放器进度条颜色渐变
        private const val KEY_V32_PROGRESS_BAR_COLOR_GRADIENT = "v32_progress_bar_color_gradient"
        // v32.11: 视频投射画面延迟策略
        private const val KEY_V32_CAST_LATENCY_STRATEGY = "v32_cast_latency_strategy"
        // v32.12: 弹幕字体背景渐变透明度
        private const val KEY_V32_DANMAKU_BACKGROUND_GRADIENT_OPACITY = "v32_danmaku_background_gradient_opacity"
        // v32.13: 播放器手势滑动速度
        private const val KEY_V32_SWIPE_SPEED = "v32_swipe_speed"
        // v32.14: 视频画面色彩模糊曲线
        private const val KEY_V32_COLOR_BLUR_CURVE = "v32_color_blur_curve"
        // v32.15: 弹幕显示字体发光强度
        private const val KEY_V32_DANMAKU_FONT_GLOW_STRENGTH = "v32_danmaku_font_glow_strength"
        // v33.1: 视频播放列表自动排序方式
        private const val KEY_V33_AUTO_SORT_MODE = "v33_auto_sort_mode"
        // v33.2: 弹幕字体背景渐变位置
        private const val KEY_V33_DANMAKU_BACKGROUND_GRADIENT_POSITION = "v33_danmaku_background_gradient_position"
        // v33.3: 视频画面色彩锐化曲线
        private const val KEY_V33_COLOR_SHARPEN_CURVE = "v33_color_sharpen_curve"
        // v33.4: 弹幕发送确认震动模式曲线
        private const val KEY_V33_VIBRATION_MODE_CURVE = "v33_vibration_mode_curve"
        // v33.5: 播放器音量限制阈值模式
        private const val KEY_V33_VOLUME_LIMIT_THRESHOLD_MODE = "v33_volume_limit_threshold_mode"
        // v33.6: 视频缓存清理模式曲线
        private const val KEY_V33_CACHE_CLEANUP_MODE_CURVE = "v33_cache_cleanup_mode_curve"
        // v33.7: 弹幕显示位置对齐偏移曲线
        private const val KEY_V33_DANMAKU_POSITION_ALIGN_OFFSET_CURVE = "v33_danmaku_position_align_offset_curve"
        // v33.8: 视频画面色彩对比度曲线
        private const val KEY_V33_COLOR_CONTRAST_CURVE = "v33_color_contrast_curve"
        // v33.9: 弹幕发送历史记录导入格式
        private const val KEY_V33_HISTORY_IMPORT_FORMAT = "v33_history_import_format"
        // v33.10: 播放器进度条颜色渐变方向
        private const val KEY_V33_PROGRESS_BAR_COLOR_GRADIENT_DIRECTION = "v33_progress_bar_color_gradient_direction"
        // v33.11: 视频投射画面缓冲策略曲线
        private const val KEY_V33_CAST_BUFFER_STRATEGY_CURVE = "v33_cast_buffer_strategy_curve"
        // v33.12: 弹幕字体背景渐变速度
        private const val KEY_V33_DANMAKU_BACKGROUND_GRADIENT_SPEED = "v33_danmaku_background_gradient_speed"
        // v33.13: 播放器手势滑动方向
        private const val KEY_V33_SWIPE_DIRECTION = "v33_swipe_direction"
        // v33.14: 视频画面色彩饱和度曲线
        private const val KEY_V33_COLOR_SATURATION_CURVE = "v33_color_saturation_curve"
        // v33.15: 弹幕显示字体发光颜色
        private const val KEY_V33_DANMAKU_FONT_GLOW_COLOR = "v33_danmaku_font_glow_color"
        // v34.1: 视频播放列表自动循环模式
        private const val KEY_V34_AUTO_LOOP_MODE = "v34_auto_loop_mode"
        // v34.2: 弹幕字体背景渐变类型
        private const val KEY_V34_DANMAKU_BACKGROUND_GRADIENT_TYPE = "v34_danmaku_background_gradient_type"
        // v34.3: 视频画面色彩色调曲线
        private const val KEY_V34_COLOR_HUE_CURVE = "v34_color_hue_curve"
        // v34.4: 弹幕发送确认震动强度曲线
        private const val KEY_V34_VIBRATION_STRENGTH_CURVE = "v34_vibration_strength_curve"
        // v34.5: 播放器音量限制阈值曲线
        private const val KEY_V34_VOLUME_LIMIT_THRESHOLD_CURVE = "v34_volume_limit_threshold_curve"
        // v34.6: 视频缓存清理策略曲线
        private const val KEY_V34_CACHE_CLEANUP_STRATEGY_CURVE = "v34_cache_cleanup_strategy_curve"
        // v34.7: 弹幕显示位置对齐方式曲线
        private const val KEY_V34_DANMAKU_POSITION_ALIGN_MODE_CURVE = "v34_danmaku_position_align_mode_curve"
        // v34.8: 视频画面色彩降噪曲线
        private const val KEY_V34_COLOR_DENOISE_CURVE = "v34_color_denoise_curve"
        // v34.9: 弹幕发送历史记录导出格式
        private const val KEY_V34_HISTORY_EXPORT_FORMAT = "v34_history_export_format"
        // v34.10: 播放器进度条颜色渐变
        private const val KEY_V34_PROGRESS_BAR_COLOR_GRADIENT = "v34_progress_bar_color_gradient"
        // v34.11: 视频投射画面延迟策略
        private const val KEY_V34_CAST_LATENCY_STRATEGY = "v34_cast_latency_strategy"
        // v34.12: 弹幕字体背景渐变透明度
        private const val KEY_V34_DANMAKU_BACKGROUND_GRADIENT_OPACITY = "v34_danmaku_background_gradient_opacity"
        // v34.13: 播放器手势滑动速度
        private const val KEY_V34_SWIPE_SPEED = "v34_swipe_speed"
        // v34.14: 视频画面色彩模糊曲线
        private const val KEY_V34_COLOR_BLUR_CURVE = "v34_color_blur_curve"
        // v34.15: 弹幕显示字体发光强度
        private const val KEY_V34_DANMAKU_FONT_GLOW_STRENGTH = "v34_danmaku_font_glow_strength"
        // v35.1: 视频播放列表自动跳过片头片尾
        private const val KEY_V35_AUTO_SKIP_INTRO_OUTRO = "v35_auto_skip_intro_outro"
        // v35.2: 弹幕字体背景渐变颜色自定义
        private const val KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM_COLOR = "v35_danmaku_background_gradient_custom_color"
        // v35.3: 视频画面色彩对比度自定义
        private const val KEY_V35_COLOR_CONTRAST_CUSTOM = "v35_color_contrast_custom"
        // v35.4: 弹幕发送确认震动自定义
        private const val KEY_V35_VIBRATION_CUSTOM = "v35_vibration_custom"
        // v35.5: 播放器音量限制自定义
        private const val KEY_V35_VOLUME_LIMIT_CUSTOM = "v35_volume_limit_custom"
        // v35.6: 视频缓存清理自定义
        private const val KEY_V35_CACHE_CLEANUP_CUSTOM = "v35_cache_cleanup_custom"
        // v35.7: 弹幕显示位置对齐自定义
        private const val KEY_V35_DANMAKU_POSITION_ALIGN_CUSTOM = "v35_danmaku_position_align_custom"
        // v35.8: 视频画面色彩饱和度自定义
        private const val KEY_V35_COLOR_SATURATION_CUSTOM = "v35_color_saturation_custom"
        // v35.9: 弹幕发送历史记录自定义
        private const val KEY_V35_HISTORY_CUSTOM = "v35_history_custom"
        // v35.10: 播放器进度条颜色自定义
        private const val KEY_V35_PROGRESS_BAR_COLOR_CUSTOM = "v35_progress_bar_color_custom"
        // v35.11: 视频投射画面缓冲自定义
        private const val KEY_V35_CAST_BUFFER_CUSTOM = "v35_cast_buffer_custom"
        // v35.12: 弹幕字体背景渐变自定义
        private const val KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM = "v35_danmaku_background_gradient_custom"
        // v35.13: 播放器手势滑动自定义
        private const val KEY_V35_SWIPE_CUSTOM = "v35_swipe_custom"
        // v35.14: 视频画面色彩亮度自定义
        private const val KEY_V35_COLOR_BRIGHTNESS_CUSTOM = "v35_color_brightness_custom"
        // v35.15: 弹幕显示字体发光自定义
        private const val KEY_V35_DANMAKU_FONT_GLOW_CUSTOM = "v35_danmaku_font_glow_custom"
        // v36.1: 视频播放速度记忆
        private const val KEY_V36_PLAYBACK_SPEED_MEMORY = "v36_playback_speed_memory"
        // v36.2: 弹幕字体描边颜色
        private const val KEY_V36_DANMAKU_FONT_STROKE_COLOR = "v36_danmaku_font_stroke_color"
        // v36.3: 视频画面色彩色温
        private const val KEY_V36_COLOR_TEMPERATURE = "v36_color_temperature"
        // v36.4: 弹幕发送确认震动模式
        private const val KEY_V36_VIBRATION_PATTERN = "v36_vibration_pattern"
        // v36.5: 播放器音量步进值
        private const val KEY_V36_VOLUME_STEP = "v36_volume_step"
        // v36.6: 视频缓存大小限制
        private const val KEY_V36_CACHE_SIZE_LIMIT = "v36_cache_size_limit"
        // v36.7: 弹幕显示区域限制
        private const val KEY_V36_DANMAKU_DISPLAY_AREA = "v36_danmaku_display_area"
        // v36.8: 视频画面色彩伽马
        private const val KEY_V36_COLOR_GAMMA = "v36_color_gamma"
        // v36.9: 弹幕发送历史记录搜索
        private const val KEY_V36_HISTORY_SEARCH = "v36_history_search"
        // v36.10: 播放器进度条样式
        private const val KEY_V36_PROGRESS_BAR_STYLE = "v36_progress_bar_style"
        // v36.11: 视频投射画面分辨率
        private const val KEY_V36_CAST_RESOLUTION = "v36_cast_resolution"
        // v36.12: 弹幕字体背景模糊
        private const val KEY_V36_DANMAKU_BACKGROUND_BLUR = "v36_danmaku_background_blur"
        // v36.13: 播放器手势长按速度
        private const val KEY_V36_GESTURE_LONG_PRESS_SPEED = "v36_gesture_long_press_speed"
        // v36.14: 视频画面色彩色调偏移
        private const val KEY_V36_COLOR_HUE_SHIFT = "v36_color_hue_shift"
        // v36.15: 弹幕显示字体发光颜色
        private const val KEY_V36_DANMAKU_FONT_GLOW_COLOR = "v36_danmaku_font_glow_color"
        // v37.1: 视频播放列表随机播放
        private const val KEY_V37_PLAYLIST_SHUFFLE = "v37_playlist_shuffle"
        // v37.2: 弹幕字体阴影颜色
        private const val KEY_V37_DANMAKU_SHADOW_COLOR = "v37_danmaku_shadow_color"
        // v37.3: 视频画面色彩鲜艳度
        private const val KEY_V37_COLOR_VIVIDNESS = "v37_color_vividness"
        // v37.4: 弹幕发送确认震动衰减
        private const val KEY_V37_VIBRATION_DECAY = "v37_vibration_decay"
        // v37.5: 播放器音量淡入淡出
        private const val KEY_V37_VOLUME_FADE = "v37_volume_fade"
        // v37.6: 视频缓存预加载
        private const val KEY_V37_CACHE_PRELOAD = "v37_cache_preload"
        // v37.7: 弹幕显示滚动速度
        private const val KEY_V37_DANMAKU_SCROLL_SPEED = "v37_danmaku_scroll_speed"
        // v37.8: 视频画面色彩色阶
        private const val KEY_V37_COLOR_TONEMAP = "v37_color_tonemap"
        // v37.9: 弹幕发送历史记录导出
        private const val KEY_V37_HISTORY_EXPORT = "v37_history_export"
        // v37.10: 播放器进度条高度
        private const val KEY_V37_PROGRESS_BAR_HEIGHT = "v37_progress_bar_height"
        // v37.11: 视频投射画面码率
        private const val KEY_V37_CAST_BITRATE = "v37_cast_bitrate"
        // v37.12: 弹幕字体背景边框颜色
        private const val KEY_V37_DANMAKU_BORDER_COLOR = "v37_danmaku_border_color"
        // v37.13: 播放器手势双击功能
        private const val KEY_V37_GESTURE_DOUBLE_TAP = "v37_gesture_double_tap"
        // v37.14: 视频画面色彩色调饱和度
        private const val KEY_V37_COLOR_HUE_SATURATION = "v37_color_hue_saturation"
        // v37.15: 弹幕显示字体发光强度
        private const val KEY_V37_DANMAKU_GLOW_INTENSITY = "v37_danmaku_glow_intensity"
        // v38.1: 视频播放列表循环模式
        private const val KEY_V38_PLAYLIST_LOOP_MODE = "v38_playlist_loop_mode"
        // v38.2: 弹幕字体背景圆角
        private const val KEY_V38_DANMAKU_BACKGROUND_RADIUS = "v38_danmaku_background_radius"
        // v38.3: 视频画面色彩对比度曲线
        private const val KEY_V38_COLOR_CONTRAST_CURVE = "v38_color_contrast_curve"
        // v38.4: 弹幕发送确认震动频率
        private const val KEY_V38_VIBRATION_FREQUENCY = "v38_vibration_frequency"
        // v38.5: 播放器音量限制模式
        private const val KEY_V38_VOLUME_LIMIT_MODE = "v38_volume_limit_mode"
        // v38.6: 视频缓存清理策略
        private const val KEY_V38_CACHE_CLEANUP_STRATEGY = "v38_cache_cleanup_strategy"
        // v38.7: 弹幕显示位置偏移X
        private const val KEY_V38_DANMAKU_OFFSET_X = "v38_danmaku_offset_x"
        // v38.8: 视频画面色彩亮度曲线
        private const val KEY_V38_COLOR_BRIGHTNESS_CURVE = "v38_color_brightness_curve"
        // v38.9: 弹幕发送历史记录搜索模式
        private const val KEY_V38_HISTORY_SEARCH_MODE = "v38_history_search_mode"
        // v38.10: 播放器进度条动画
        private const val KEY_V38_PROGRESS_BAR_ANIMATION = "v38_progress_bar_animation"
        // v38.11: 视频投射画面延迟
        private const val KEY_V38_CAST_LATENCY = "v38_cast_latency"
        // v38.12: 弹幕字体背景渐变方向
        private const val KEY_V38_DANMAKU_GRADIENT_DIRECTION = "v38_danmaku_gradient_direction"
        // v38.13: 播放器手势滑动灵敏度
        private const val KEY_V38_GESTURE_SWIPE_SENSITIVITY = "v38_gesture_swipe_sensitivity"
        // v38.14: 视频画面色彩饱和度曲线
        private const val KEY_V38_COLOR_SATURATION_CURVE = "v38_color_saturation_curve"
        // v38.15: 弹幕显示字体描边宽度
        private const val KEY_V38_DANMAKU_FONT_STROKE_WIDTH = "v38_danmaku_font_stroke_width"
        // v39.1: 视频播放列表自动跳过
        private const val KEY_V39_PLAYLIST_AUTO_SKIP = "v39_playlist_auto_skip"
        // v39.2: 弹幕字体背景透明度曲线
        private const val KEY_V39_DANMAKU_BACKGROUND_ALPHA_CURVE = "v39_danmaku_background_alpha_curve"
        // v39.3: 视频画面色彩锐化强度
        private const val KEY_V39_COLOR_SHARPEN = "v39_color_sharpen"
        // v39.4: 弹幕发送确认震动模式曲线
        private const val KEY_V39_VIBRATION_PATTERN_CURVE = "v39_vibration_pattern_curve"
        // v39.5: 播放器音量平衡
        private const val KEY_V39_VOLUME_BALANCE = "v39_volume_balance"
        // v39.6: 视频缓存预加载大小
        private const val KEY_V39_CACHE_PRELOAD_SIZE = "v39_cache_preload_size"
        // v39.7: 弹幕显示位置偏移Y
        private const val KEY_V39_DANMAKU_OFFSET_Y = "v39_danmaku_offset_y"
        // v39.8: 视频画面色彩降噪强度
        private const val KEY_V39_COLOR_DENOISE = "v39_color_denoise"
        // v39.9: 弹幕发送历史记录自动清理
        private const val KEY_V39_HISTORY_AUTO_CLEANUP = "v39_history_auto_cleanup"
        // v39.10: 播放器进度条颜色渐变
        private const val KEY_V39_PROGRESS_BAR_GRADIENT = "v39_progress_bar_gradient"
        // v39.11: 视频投射画面缓冲策略
        private const val KEY_V39_CAST_BUFFER_STRATEGY = "v39_cast_buffer_strategy"
        // v39.12: 弹幕字体背景渐变速度
        private const val KEY_V39_DANMAKU_GRADIENT_SPEED = "v39_danmaku_gradient_speed"
        // v39.13: 播放器手势长按功能
        private const val KEY_V39_GESTURE_LONG_PRESS = "v39_gesture_long_press"
        // v39.14: 视频画面色彩模糊强度
        private const val KEY_V39_COLOR_BLUR = "v39_color_blur"
        // v39.15: 弹幕显示字体发光模式
        private const val KEY_V39_DANMAKU_GLOW_MODE = "v39_danmaku_glow_mode"
        // v40.1: 视频播放列表智能排序
        private const val KEY_V40_PLAYLIST_SMART_SORT = "v40_playlist_smart_sort"
        // v40.2: 弹幕字体背景渐变颜色
        private const val KEY_V40_DANMAKU_GRADIENT_COLOR = "v40_danmaku_gradient_color"
        // v40.3: 视频画面色彩色调曲线
        private const val KEY_V40_COLOR_HUE_CURVE = "v40_color_hue_curve"
        // v40.4: 弹幕发送确认震动强度曲线
        private const val KEY_V40_VIBRATION_INTENSITY_CURVE = "v40_vibration_intensity_curve"
        // v40.5: 播放器音量限制阈值曲线
        private const val KEY_V40_VOLUME_LIMIT_CURVE = "v40_volume_limit_curve"
        // v40.6: 视频缓存清理策略曲线
        private const val KEY_V40_CACHE_CLEANUP_CURVE = "v40_cache_cleanup_curve"
        // v40.7: 弹幕显示位置对齐方式曲线
        private const val KEY_V40_DANMAKU_ALIGN_CURVE = "v40_danmaku_align_curve"
        // v40.8: 视频画面色彩降噪曲线
        private const val KEY_V40_COLOR_DENOISE_CURVE = "v40_color_denoise_curve"
        // v40.9: 弹幕发送历史记录导出格式
        private const val KEY_V40_HISTORY_EXPORT_FORMAT = "v40_history_export_format"
        // v40.10: 播放器进度条颜色渐变方向
        private const val KEY_V40_PROGRESS_BAR_GRADIENT_DIRECTION = "v40_progress_bar_gradient_direction"
        // v40.11: 视频投射画面延迟策略
        private const val KEY_V40_CAST_LATENCY_STRATEGY = "v40_cast_latency_strategy"
        // v40.12: 弹幕字体背景渐变透明度
        private const val KEY_V40_DANMAKU_GRADIENT_ALPHA = "v40_danmaku_gradient_alpha"
        // v40.13: 播放器手势滑动速度
        private const val KEY_V40_GESTURE_SWIPE_SPEED = "v40_gesture_swipe_speed"
        // v40.14: 视频画面色彩模糊曲线
        private const val KEY_V40_COLOR_BLUR_CURVE = "v40_color_blur_curve"
        // v40.15: 弹幕显示字体发光强度
        private const val KEY_V40_DANMAKU_GLOW_INTENSITY = "v40_danmaku_glow_intensity"
        // ===== v41.x KEY =====
        private const val KEY_V41_PLAYBACK_SPEED_MEMORY = "v41_playback_speed_memory"
        private const val KEY_V41_DANMAKU_VIBRATION_MODE = "v41_danmaku_vibration_mode"
        private const val KEY_V41_COLOR_AUTO_ADJUST = "v41_color_auto_adjust"
        private const val KEY_V41_VOLUME_BOOST_MODE = "v41_volume_boost_mode"
        private const val KEY_V41_DANMAKU_STROKE_STYLE = "v41_danmaku_stroke_style"
        private const val KEY_V41_CAST_COLOR_CORRECTION = "v41_cast_color_correction"
        private const val KEY_V41_GESTURE_CUSTOM_MAPPING = "v41_gesture_custom_mapping"
        private const val KEY_V41_DANMAKU_DENSITY_LIMIT = "v41_danmaku_density_limit"
        private const val KEY_V41_CACHE_SMART_CLEANUP = "v41_cache_smart_cleanup"
        private const val KEY_V41_PROGRESS_BAR_BUFFER = "v41_progress_bar_buffer"
        private const val KEY_V41_DANMAKU_VIBRATION_FEEDBACK = "v41_danmaku_vibration_feedback"
        private const val KEY_V41_COLOR_HDR_SIMULATION = "v41_color_hdr_simulation"
        private const val KEY_V41_VOLUME_LIMIT_ENHANCED = "v41_volume_limit_enhanced"
        private const val KEY_V41_DANMAKU_BG_RADIUS = "v41_danmaku_bg_radius"
        private const val KEY_V41_CAST_AUDIO_CODEC = "v41_cast_audio_codec"
        // ===== v42.x KEY =====
        private const val KEY_V42_DANMAKU_STROKE_COLOR = "v42_danmaku_stroke_color"
        private const val KEY_V42_COLOR_AUTO_CONTRAST = "v42_color_auto_contrast"
        private const val KEY_V42_GESTURE_VIBRATION = "v42_gesture_vibration"
        private const val KEY_V42_DANMAKU_HISTORY_STATS = "v42_danmaku_history_stats"
        private const val KEY_V42_CACHE_AUTO_SIZE = "v42_cache_auto_size"
        private const val KEY_V42_PROGRESS_BAR_COLOR = "v42_progress_bar_color"
        private const val KEY_V42_DANMAKU_GRADIENT_ENHANCED = "v42_danmaku_gradient_enhanced"
        private const val KEY_V42_CAST_COLOR_ENHANCE = "v42_cast_color_enhance"
        private const val KEY_V42_VOLUME_STEP_CUSTOM = "v42_volume_step_custom"
        private const val KEY_V42_DANMAKU_SMART_POSITION = "v42_danmaku_smart_position"
        private const val KEY_V42_COLOR_AUTO_SATURATION = "v42_color_auto_saturation"
        private const val KEY_V42_GESTURE_LONG_PRESS_VIBRATION = "v42_gesture_long_press_vibration"
        private const val KEY_V42_DANMAKU_VIBRATION_DURATION = "v42_danmaku_vibration_duration"
        private const val KEY_V42_CACHE_PRELOAD_STRATEGY = "v42_cache_preload_strategy"
        private const val KEY_V42_PROGRESS_BAR_BUFFER_COLOR = "v42_progress_bar_buffer_color"
        // ===== v43.x KEY =====
        private const val KEY_V43_COLOR_AUTO_HUE = "v43_color_auto_hue"
        private const val KEY_V43_DANMAKU_BG_ALPHA = "v43_danmaku_bg_alpha"
        private const val KEY_V43_GESTURE_DOUBLE_TAP_VIBRATION = "v43_gesture_double_tap_vibration"
        private const val KEY_V43_DANMAKU_HISTORY_BACKUP = "v43_danmaku_history_backup"
        private const val KEY_V43_CACHE_CLEANUP_ENHANCED = "v43_cache_cleanup_enhanced"
        private const val KEY_V43_PROGRESS_BAR_GRADIENT_ENHANCED = "v43_progress_bar_gradient_enhanced"
        private const val KEY_V43_DANMAKU_SHADOW_ENHANCED = "v43_danmaku_shadow_enhanced"
        private const val KEY_V43_CAST_RESOLUTION_ENHANCED = "v43_cast_resolution_enhanced"
        private const val KEY_V43_VOLUME_LIMIT_CURVE_ENHANCED = "v43_volume_limit_curve_enhanced"
        private const val KEY_V43_DANMAKU_GLOW_ENHANCED = "v43_danmaku_glow_enhanced"
        private const val KEY_V43_COLOR_AUTO_BRIGHTNESS = "v43_color_auto_brightness"
        private const val KEY_V43_GESTURE_SWIPE_VIBRATION = "v43_gesture_swipe_vibration"
        private const val KEY_V43_DANMAKU_VIBRATION_MODE_ENHANCED = "v43_danmaku_vibration_mode_enhanced"
        private const val KEY_V43_CACHE_PRELOAD_SIZE_ENHANCED = "v43_cache_preload_size_enhanced"
        private const val KEY_V43_PROGRESS_BAR_ANIMATION_ENHANCED = "v43_progress_bar_animation_enhanced"
        // ===== v44.x KEY =====
        private const val KEY_V44_COLOR_DENOISE_ENHANCED = "v44_color_denoise_enhanced"
        private const val KEY_V44_DANMAKU_STROKE_WIDTH_ENHANCED = "v44_danmaku_stroke_width_enhanced"
        private const val KEY_V44_GESTURE_LONG_PRESS_SPEED_ENHANCED = "v44_gesture_long_press_speed_enhanced"
        private const val KEY_V44_DANMAKU_HISTORY_SEARCH_ENHANCED = "v44_danmaku_history_search_enhanced"
        private const val KEY_V44_CAST_BITRATE_ENHANCED = "v44_cast_bitrate_enhanced"
        private const val KEY_V44_PROGRESS_BAR_HEIGHT_ENHANCED = "v44_progress_bar_height_enhanced"
        private const val KEY_V44_DANMAKU_BORDER_ENHANCED = "v44_danmaku_border_enhanced"
        private const val KEY_V44_COLOR_BLUR_ENHANCED = "v44_color_blur_enhanced"
        private const val KEY_V44_VOLUME_FADE_ENHANCED = "v44_volume_fade_enhanced"
        private const val KEY_V44_DANMAKU_SCROLL_SPEED_ENHANCED = "v44_danmaku_scroll_speed_enhanced"
        private const val KEY_V44_CAST_LATENCY_ENHANCED = "v44_cast_latency_enhanced"
        private const val KEY_V44_GESTURE_SWIPE_SENSITIVITY_ENHANCED = "v44_gesture_swipe_sensitivity_enhanced"
        private const val KEY_V44_DANMAKU_VIBRATION_FREQUENCY_ENHANCED = "v44_danmaku_vibration_frequency_enhanced"
        private const val KEY_V44_CACHE_CLEANUP_CURVE_ENHANCED = "v44_cache_cleanup_curve_enhanced"
        private const val KEY_V44_PROGRESS_BAR_GRADIENT_DIRECTION_ENHANCED = "v44_progress_bar_gradient_direction_enhanced"
        // ===== v45.x KEY =====
        private const val KEY_V45_COLOR_SHARPEN_ENHANCED = "v45_color_sharpen_enhanced"
        private const val KEY_V45_DANMAKU_BG_RADIUS_ENHANCED = "v45_danmaku_bg_radius_enhanced"
        private const val KEY_V45_GESTURE_DOUBLE_TAP_ENHANCED = "v45_gesture_double_tap_enhanced"
        private const val KEY_V45_DANMAKU_HISTORY_EXPORT_ENHANCED = "v45_danmaku_history_export_enhanced"
        private const val KEY_V45_CAST_BUFFER_ENHANCED = "v45_cast_buffer_enhanced"
        private const val KEY_V45_PROGRESS_BAR_STYLE_ENHANCED = "v45_progress_bar_style_enhanced"
        private const val KEY_V45_DANMAKU_GRADIENT_SPEED_ENHANCED = "v45_danmaku_gradient_speed_enhanced"
        private const val KEY_V45_COLOR_VIVIDNESS_ENHANCED = "v45_color_vividness_enhanced"
        private const val KEY_V45_VOLUME_BALANCE_ENHANCED = "v45_volume_balance_enhanced"
        private const val KEY_V45_DANMAKU_OFFSET_ENHANCED = "v45_danmaku_offset_enhanced"
        private const val KEY_V45_CAST_AUDIO_ENHANCED = "v45_cast_audio_enhanced"
        private const val KEY_V45_GESTURE_VIBRATION_ENHANCED = "v45_gesture_vibration_enhanced"
        private const val KEY_V45_DANMAKU_VIBRATION_INTENSITY_ENHANCED = "v45_danmaku_vibration_intensity_enhanced"
        private const val KEY_V45_CACHE_SMART_CLEANUP_ENHANCED = "v45_cache_smart_cleanup_enhanced"
        private const val KEY_V45_PROGRESS_BAR_BUFFER_ENHANCED = "v45_progress_bar_buffer_enhanced"
        // ===== v46.x KEY =====
        private const val KEY_V46_PLAYBACK_LOOP_MEMORY = "v46_playback_loop_memory"
        private const val KEY_V46_DANMAKU_FONT_WEIGHT = "v46_danmaku_font_weight"
        private const val KEY_V46_COLOR_AUTO_GAMMA = "v46_color_auto_gamma"
        private const val KEY_V46_VOLUME_NORMALIZATION = "v46_volume_normalization"
        private const val KEY_V46_DANMAKU_STROKE_OFFSET = "v46_danmaku_stroke_offset"
        private const val KEY_V46_CAST_COLOR_TEMPERATURE = "v46_cast_color_temperature"
        private const val KEY_V46_GESTURE_EDGE_EXCLUSION = "v46_gesture_edge_exclusion"
        private const val KEY_V46_DANMAKU_ROW_SPACING = "v46_danmaku_row_spacing"
        private const val KEY_V46_CACHE_PREFETCH_ON_WIFI = "v46_cache_prefetch_on_wifi"
        private const val KEY_V46_PROGRESS_BAR_THUMB_SIZE = "v46_progress_bar_thumb_size"
        private const val KEY_V46_DANMAKU_SEND_CONFIRM_DIALOG = "v46_danmaku_send_confirm_dialog"
        private const val KEY_V46_COLOR_WHITE_BALANCE = "v46_color_white_balance"
        private const val KEY_V46_VOLUME_LIMIT_THRESHOLD = "v46_volume_limit_threshold"
        private const val KEY_V46_DANMAKU_BG_PADDING = "v46_danmaku_bg_padding"
        private const val KEY_V46_CAST_VIDEO_CODEC = "v46_cast_video_codec"
        // ===== v47.x KEY =====
        private const val KEY_V47_PLAYBACK_RESUME_PROMPT = "v47_playback_resume_prompt"
        private const val KEY_V47_DANMAKU_FONT_SPACING = "v47_danmaku_font_spacing"
        private const val KEY_V47_COLOR_EXPOSURE_COMPENSATION = "v47_color_exposure_compensation"
        private const val KEY_V47_VOLUME_LOUDNESS_ENHANCER = "v47_volume_loudness_enhancer"
        private const val KEY_V47_DANMAKU_STROKE_BLUR = "v47_danmaku_stroke_blur"
        private const val KEY_V47_CAST_AUDIO_BITRATE = "v47_cast_audio_bitrate"
        private const val KEY_V47_GESTURE_DEAD_ZONE = "v47_gesture_dead_zone"
        private const val KEY_V47_DANMAKU_MAX_LINES = "v47_danmaku_max_lines"
        private const val KEY_V47_CACHE_MAX_SIZE_MB = "v47_cache_max_size_mb"
        private const val KEY_V47_PROGRESS_BAR_SEEK_PREVIEW = "v47_progress_bar_seek_preview"
        private const val KEY_V47_DANMAKU_HIGHLIGHT_MENTION = "v47_danmaku_highlight_mention"
        private const val KEY_V47_COLOR_TINT = "v47_color_tint"
        private const val KEY_V47_VOLUME_CHANNEL_BALANCE = "v47_volume_channel_balance"
        private const val KEY_V47_DANMAKU_BG_BORDER_COLOR = "v47_danmaku_bg_border_color"
        private const val KEY_V47_CAST_SUBTITLE_ENABLED = "v47_cast_subtitle_enabled"
        // ===== v48.x KEY =====
        private const val KEY_V48_PLAYBACK_AUTO_SKIP_INTRO = "v48_playback_auto_skip_intro"
        private const val KEY_V48_DANMAKU_FONT_LINE_HEIGHT = "v48_danmaku_font_line_height"
        private const val KEY_V48_COLOR_BLACK_LEVEL = "v48_color_black_level"
        private const val KEY_V48_VOLUME_BASS_BOOST = "v48_volume_bass_boost"
        private const val KEY_V48_DANMAKU_SEND_MAX_LENGTH = "v48_danmaku_send_max_length"
        private const val KEY_V48_CAST_RESOLUTION_AUTO = "v48_cast_resolution_auto"
        private const val KEY_V48_GESTURE_TAP_FEEDBACK = "v48_gesture_tap_feedback"
        private const val KEY_V48_DANMAKU_FILTER_REGEX = "v48_danmaku_filter_regex"
        private const val KEY_V48_CACHE_CLEANUP_INTERVAL = "v48_cache_cleanup_interval"
        private const val KEY_V48_PROGRESS_BAR_TOUCH_AREA = "v48_progress_bar_touch_area"
        private const val KEY_V48_DANMAKU_FONT_SIZE_ADAPTIVE = "v48_danmaku_font_size_adaptive"
        private const val KEY_V48_COLOR_WHITE_LEVEL = "v48_color_white_level"
        private const val KEY_V48_VOLUME_VIRTUALIZER = "v48_volume_virtualizer"
        private const val KEY_V48_DANMAKU_BG_SHADOW_SIZE = "v48_danmaku_bg_shadow_size"
        private const val KEY_V48_CAST_MIRROR_QUALITY = "v48_cast_mirror_quality"
        // ===== v49.x KEY =====
        private const val KEY_V49_PLAYBACK_AUTO_SKIP_OUTRO = "v49_playback_auto_skip_outro"
        private const val KEY_V49_DANMAKU_FONT_LETTER_SPACING = "v49_danmaku_font_letter_spacing"
        private const val KEY_V49_COLOR_HIGHLIGHT_RECOVERY = "v49_color_highlight_recovery"
        private const val KEY_V49_VOLUME_TREBLE_BOOST = "v49_volume_treble_boost"
        private const val KEY_V49_DANMAKU_SEND_FONT_SIZE = "v49_danmaku_send_font_size"
        private const val KEY_V49_CAST_AUDIO_SYNC = "v49_cast_audio_sync"
        private const val KEY_V49_GESTURE_LONG_PRESS_ACTION = "v49_gesture_long_press_action"
        private const val KEY_V49_DANMAKU_FILTER_DUPLICATE = "v49_danmaku_filter_duplicate"
        private const val KEY_V49_CACHE_AUTO_CLEANUP_THRESHOLD = "v49_cache_auto_cleanup_threshold"
        private const val KEY_V49_PROGRESS_BAR_CHAPTER_MARK = "v49_progress_bar_chapter_mark"
        private const val KEY_V49_DANMAKU_HIGHLIGHT_KEYWORD = "v49_danmaku_highlight_keyword"
        private const val KEY_V49_COLOR_SHADOW_RECOVERY = "v49_color_shadow_recovery"
        private const val KEY_V49_VOLUME_REPLAY_GAIN = "v49_volume_replay_gain"
        private const val KEY_V49_DANMAKU_BG_GRADIENT_ANGLE = "v49_danmaku_bg_gradient_angle"
        private const val KEY_V49_CAST_AUTO_RECONNECT = "v49_cast_auto_reconnect"
        // ===== v50.x KEY =====
        private const val KEY_V50_PLAYBACK_AUTO_NEXT_EPISODE = "v50_playback_auto_next_episode"
        private const val KEY_V50_DANMAKU_FONT_SHADOW_SIZE = "v50_danmaku_font_shadow_size"
        private const val KEY_V50_COLOR_MIDTONE_ADJUST = "v50_color_midtone_adjust"
        private const val KEY_VOLUME_AMBIENT_MODE = "v50_volume_ambient_mode"
        private const val KEY_V50_DANMAKU_SEND_COLOR_CUSTOM = "v50_danmaku_send_color_custom"
        private const val KEY_V50_CAST_VOLUME_SYNC = "v50_cast_volume_sync"
        private const val KEY_V50_GESTURE_PINCH_ZOOM = "v50_gesture_pinch_zoom"
        private const val KEY_V50_DANMAKU_FILTER_COLOR = "v50_danmaku_filter_color"
        private const val KEY_V50_CACHE_PREBUFFER_SECONDS = "v50_cache_prebuffer_seconds"
        private const val KEY_V50_PROGRESS_BAR_DOUBLE_TAP_SEEK = "v50_progress_bar_double_tap_seek"
        private const val KEY_V50_DANMAKU_FONT_SIZE_AUTO = "v50_danmaku_font_size_auto"
        private const val KEY_V50_COLOR_DYNAMIC_RANGE = "v50_color_dynamic_range"
        private const val KEY_V50_VOLUME_NIGHT_MODE = "v50_volume_night_mode"
        private const val KEY_V50_DANMAKU_BG_BLUR_RADIUS = "v50_danmaku_bg_blur_radius"
        private const val KEY_V50_CAST_AUTO_DISCOVER = "v50_cast_auto_discover"

        // ===== v51.x KEY =====
        private const val KEY_V51_PLAYBACK_AUTO_SKIP_INTRO = "v51_playback_auto_skip_intro"
        private const val KEY_V51_DANMAKU_FONT_OUTLINE_WIDTH = "v51_danmaku_font_outline_width"
        private const val KEY_V51_COLOR_SHADOW_ADJUST = "v51_color_shadow_adjust"
        private const val KEY_V51_VOLUME_LOUDNESS_NORMALIZE = "v51_volume_loudness_normalize"
        private const val KEY_V51_DANMAKU_SEND_BG_STYLE = "v51_danmaku_send_bg_style"
        private const val KEY_V51_CAST_VIDEO_CODEC = "v51_cast_video_codec"
        private const val KEY_V51_GESTURE_DOUBLE_TAP_REWIND = "v51_gesture_double_tap_rewind"
        private const val KEY_V51_DANMAKU_FILTER_LENGTH = "v51_danmaku_filter_length"
        private const val KEY_V51_CACHE_MAX_SIZE_MB = "v51_cache_max_size_mb"
        private const val KEY_V51_PROGRESS_BAR_SCRUB_SPEED = "v51_progress_bar_scrub_speed"
        private const val KEY_V51_DANMAKU_FONT_SPACING = "v51_danmaku_font_spacing"
        private const val KEY_V51_COLOR_GAMMA_CORRECTION = "v51_color_gamma_correction"
        private const val KEY_V51_VOLUME_BASS_REDUCE = "v51_volume_bass_reduce"
        private const val KEY_V51_DANMAKU_BG_BORDER_COLOR = "v51_danmaku_bg_border_color"
        private const val KEY_V51_CAST_SUBTITLE_SYNC = "v51_cast_subtitle_sync"

        // ===== v52.x KEY =====
        private const val KEY_V52_PLAYBACK_AUTO_SKIP_FILLER = "v52_playback_auto_skip_filler"
        private const val KEY_V52_DANMAKU_FONT_LINE_HEIGHT = "v52_danmaku_font_line_height"
        private const val KEY_V52_COLOR_TEMPERATURE = "v52_color_temperature"
        private const val KEY_V52_VOLUME_CHANNEL_SWAP = "v52_volume_channel_swap"
        private const val KEY_V52_DANMAKU_SEND_ANIM_STYLE = "v52_danmaku_send_anim_style"
        private const val KEY_V52_CAST_RESOLUTION_ENHANCE = "v52_cast_resolution_enhance"
        private const val KEY_V52_GESTURE_SWIPE_SEEK = "v52_gesture_swipe_seek"
        private const val KEY_V52_DANMAKU_FILTER_SPEED = "v52_danmaku_filter_speed"
        private const val KEY_V52_CACHE_PREFETCH_SIZE = "v52_cache_prefetch_size"
        private const val KEY_V52_PROGRESS_BAR_CHAPTERS = "v52_progress_bar_chapters"
        private const val KEY_V52_DANMAKU_FONT_SHADOW_BLUR = "v52_danmaku_font_shadow_blur"
        private const val KEY_V52_COLOR_SATURATION_AUTO = "v52_color_saturation_auto"
        private const val KEY_V52_VOLUME_FADE_IN_MS = "v52_volume_fade_in_ms"
        private const val KEY_V52_DANMAKU_BG_GRADIENT_COLOR = "v52_danmaku_bg_gradient_color"
        private const val KEY_V52_CAST_LATENCY_MODE = "v52_cast_latency_mode"

        // ===== v53.x KEY =====
        private const val KEY_V53_PLAYBACK_AUTO_PAUSE = "v53_playback_auto_pause"
        private const val KEY_V53_DANMAKU_FONT_ITALIC = "v53_danmaku_font_italic"
        private const val KEY_V53_COLOR_VIGNETTE_CUSTOM = "v53_color_vignette_custom"
        private const val KEY_V53_VOLUME_FADE_OUT_MS = "v53_volume_fade_out_ms"
        private const val KEY_V53_DANMAKU_SEND_TIMESTAMP = "v53_danmaku_send_timestamp"
        private const val KEY_V53_CAST_AUDIO_CODEC = "v53_cast_audio_codec"
        private const val KEY_V53_GESTURE_VOLUME_STEP = "v53_gesture_volume_step"
        private const val KEY_V53_DANMAKU_FILTER_TYPE = "v53_danmaku_filter_type"
        private const val KEY_V53_CACHE_CLEANUP_POLICY = "v53_cache_cleanup_policy"
        private const val KEY_V53_PROGRESS_BAR_SNAP = "v53_progress_bar_snap"
        private const val KEY_V53_DANMAKU_FONT_STRIKE = "v53_danmaku_font_strike"
        private const val KEY_V53_COLOR_BLACK_LEVEL = "v53_color_black_level"
        private const val KEY_V53_VOLUME_BALANCE_CUSTOM = "v53_volume_balance_custom"
        private const val KEY_V53_DANMAKU_BG_ROUNDED = "v53_danmaku_bg_rounded"
        private const val KEY_V53_CAST_AUTO_PAUSE = "v53_cast_auto_pause"

        // ===== v54.x KEY =====
        private const val KEY_V54_PLAYBACK_RESUME_POSITION = "v54_playback_resume_position"
        private const val KEY_V54_DANMAKU_FONT_SIZE_RANGE = "v54_danmaku_font_size_range"
        private const val KEY_V54_COLOR_BRIGHTNESS = "v54_color_brightness"
        private const val KEY_V54_VOLUME_SURROUND_MODE = "v54_volume_surround_mode"
        private const val KEY_V54_DANMAKU_SEND_DRAFT = "v54_danmaku_send_draft"
        private const val KEY_V54_CAST_SCREEN_MIRROR = "v54_cast_screen_mirror"
        private const val KEY_V54_GESTURE_BRIGHTNESS_STEP = "v54_gesture_brightness_step"
        private const val KEY_V54_DANMAKU_FILTER_USER = "v54_danmaku_filter_user"
        private const val KEY_V54_CACHE_WAKEUP_PREFETCH = "v54_cache_wakeup_prefetch"
        private const val KEY_V54_PROGRESS_BAR_HAPTIC = "v54_progress_bar_haptic"
        private const val KEY_V54_DANMAKU_FONT_UNDERLINE = "v54_danmaku_font_underline"
        private const val KEY_V54_COLOR_CONTRAST = "v54_color_contrast"
        private const val KEY_V54_VOLUME_AUTO_GAIN = "v54_volume_auto_gain"
        private const val KEY_V54_DANMAKU_BG_GRADIENT_DIRECTION = "v54_danmaku_bg_gradient_direction"
        private const val KEY_V54_CAST_SUBTITLE_LANG = "v54_cast_subtitle_lang"

        // ===== v55.x KEY =====
        private const val KEY_V55_PLAYBACK_AUTO_RESUME = "v55_playback_auto_resume"
        private const val KEY_V55_DANMAKU_FONT_MONOSPACE = "v55_danmaku_font_monospace"
        private const val KEY_V55_COLOR_HUE_AUTO = "v55_color_hue_auto"
        private const val KEY_V55_VOLUME_PEAK_LIMITER = "v55_volume_peak_limiter"
        private const val KEY_V55_DANMAKU_SEND_QUEUE = "v55_danmaku_send_queue"
        private const val KEY_V55_CAST_BANDWIDTH_LIMIT = "v55_cast_bandwidth_limit"
        private const val KEY_V55_GESTURE_LOCK_SCREEN = "v55_gesture_lock_screen"
        private const val KEY_V55_DANMAKU_FILTER_REGEX = "v55_danmaku_filter_regex"
        private const val KEY_V55_CACHE_NETWORK_POLICY = "v55_cache_network_policy"
        private const val KEY_V55_PROGRESS_BAR_DOUBLE_TAP_ACTION = "v55_progress_bar_double_tap_action"
        private const val KEY_V55_DANMAKU_FONT_WEIGHT_CUSTOM = "v55_danmaku_font_weight_custom"
        private const val KEY_V55_COLOR_TINT_CUSTOM = "v55_color_tint_custom"
        private const val KEY_V55_VOLUME_COMPRESSOR = "v55_volume_compressor"
        private const val KEY_V55_DANMAKU_BG_PADDING = "v55_danmaku_bg_padding"
        private const val KEY_V55_CAST_AUTO_QUALITY = "v55_cast_auto_quality"

        private const val KEY_V56_PLAYBACK_SKIP_SILENCE = "v56_playback_skip_silence"
        private const val KEY_V56_DANMAKU_FONT_WEIGHT_AUTO = "v56_danmaku_font_weight_auto"
        private const val KEY_V56_COLOR_REDUCTION = "v56_color_reduction"
        private const val KEY_V56_VOLUME_STEREO_WIDEN = "v56_volume_stereo_widen"
        private const val KEY_V56_DANMAKU_SEND_PRIORITY = "v56_danmaku_send_priority"
        private const val KEY_V56_CAST_AUTO_ROTATE = "v56_cast_auto_rotate"
        private const val KEY_V56_GESTURE_LONG_PRESS_SPEED = "v56_gesture_long_press_speed"
        private const val KEY_V56_DANMAKU_FILTER_SCORE = "v56_danmaku_filter_score"
        private const val KEY_V56_CACHE_COMPRESS_ENABLED = "v56_cache_compress_enabled"
        private const val KEY_V56_PROGRESS_BAR_CHAPTERS_COLOR = "v56_progress_bar_chapters_color"
        private const val KEY_V56_DANMAKU_FONT_LETTER_SPACING2 = "v56_danmaku_font_letter_spacing2"
        private const val KEY_V56_COLOR_SATURATION_CURVE = "v56_color_saturation_curve"
        private const val KEY_V56_VOLUME_PRE_AMP = "v56_volume_pre_amp"
        private const val KEY_V56_DANMAKU_BG_GRADIENT_OPACITY = "v56_danmaku_bg_gradient_opacity"
        private const val KEY_V56_CAST_SUBTITLE_STYLE = "v56_cast_subtitle_style"
        private const val KEY_V57_PLAYBACK_AUTO_SKIP_ADS = "v57_playback_auto_skip_ads"
        private const val KEY_V57_DANMAKU_FONT_ANTI_ALIAS = "v57_danmaku_font_anti_alias"
        private const val KEY_V57_COLOR_VIBRANCE = "v57_color_vibrance"
        private const val KEY_V57_VOLUME_DUCKING = "v57_volume_ducking"
        private const val KEY_V57_DANMAKU_SEND_REPEAT = "v57_danmaku_send_repeat"
        private const val KEY_V57_CAST_AUTO_FULLSCREEN = "v57_cast_auto_fullscreen"
        private const val KEY_V57_GESTURE_DOUBLE_TAP_ACTION2 = "v57_gesture_double_tap_action2"
        private const val KEY_V57_DANMAKU_FILTER_KEYWORDS = "v57_danmaku_filter_keywords"
        private const val KEY_V57_CACHE_ENCRYPT_ENABLED = "v57_cache_encrypt_enabled"
        private const val KEY_V57_PROGRESS_BAR_BUFFER_COLOR = "v57_progress_bar_buffer_color"
        private const val KEY_V57_DANMAKU_FONT_BACKGROUND2 = "v57_danmaku_font_background2"
        private const val KEY_V57_COLOR_HIGHLIGHT_ROLL = "v57_color_highlight_roll"
        private const val KEY_V57_VOLUME_MAX_BOOST = "v57_volume_max_boost"
        private const val KEY_V57_DANMAKU_BG_SHADOW_COLOR2 = "v57_danmaku_bg_shadow_color2"
        private const val KEY_V57_CAST_VIDEO_BITRATE = "v57_cast_video_bitrate"
        private const val KEY_V58_PLAYBACK_AUTO_SPEED = "v58_playback_auto_speed"
        private const val KEY_V58_DANMAKU_FONT_BLEND_MODE = "v58_danmaku_font_blend_mode"
        private const val KEY_V58_COLOR_LIFT = "v58_color_lift"
        private const val KEY_V58_VOLUME_PAN_CONTROL = "v58_volume_pan_control"
        private const val KEY_V58_DANMAKU_SEND_FONT_SIZE2 = "v58_danmaku_send_font_size2"
        private const val KEY_V58_CAST_AUTO_RESOLUTION = "v58_cast_auto_resolution"
        private const val KEY_V58_GESTURE_SWIPE_ACTION2 = "v58_gesture_swipe_action2"
        private const val KEY_V58_DANMAKU_FILTER_REGEX2 = "v58_danmaku_filter_regex2"
        private const val KEY_V58_CACHE_DISK_POLICY = "v58_cache_disk_policy"
        private const val KEY_V58_PROGRESS_BAR_THUMB_COLOR = "v58_progress_bar_thumb_color"
        private const val KEY_V58_DANMAKU_FONT_SHADOW_COLOR2 = "v58_danmaku_font_shadow_color2"
        private const val KEY_V58_COLOR_MIDTONE_GAMMA = "v58_color_midtone_gamma"
        private const val KEY_V58_VOLUME_EQ = "v58_volume_eq"
        private const val KEY_V58_DANMAKU_BG_BORDER_WIDTH = "v58_danmaku_bg_border_width"
        private const val KEY_V58_CAST_AUDIO_DELAY = "v58_cast_audio_delay"
        private const val KEY_V59_PLAYBACK_SKIP_BLANK = "v59_playback_skip_blank"
        private const val KEY_V59_DANMAKU_FONT_OUTLINE_COLOR = "v59_danmaku_font_outline_color"
        private const val KEY_V59_COLOR_GAIN = "v59_color_gain"
        private const val KEY_V59_VOLUME_REVERB = "v59_volume_reverb"
        private const val KEY_V59_DANMAKU_SEND_BG_COLOR = "v59_danmaku_send_bg_color"
        private const val KEY_V59_CAST_AUTO_CONNECT = "v59_cast_auto_connect"
        private const val KEY_V59_GESTURE_LONG_PRESS_ACTION2 = "v59_gesture_long_press_action2"
        private const val KEY_V59_DANMAKU_FILTER_LANG = "v59_danmaku_filter_lang"
        private const val KEY_V59_CACHE_MEMORY_POLICY = "v59_cache_memory_policy"
        private const val KEY_V59_PROGRESS_BAR_TRACK_COLOR = "v59_progress_bar_track_color"
        private const val KEY_V59_DANMAKU_FONT_STROKE_COLOR2 = "v59_danmaku_font_stroke_color2"
        private const val KEY_V59_COLOR_SHADOW_GAMMA = "v59_color_shadow_gamma"
        private const val KEY_V59_VOLUME_CROSSFEED = "v59_volume_crossfeed"
        private const val KEY_V59_DANMAKU_BG_GRADIENT_COLOR2 = "v59_danmaku_bg_gradient_color2"
        private const val KEY_V59_CAST_VIDEO_QUALITY = "v59_cast_video_quality"
        private const val KEY_V60_PLAYBACK_SMART_BUFFER = "v60_playback_smart_buffer"
        private const val KEY_V60_DANMAKU_FONT_WEIGHT2 = "v60_danmaku_font_weight2"
        private const val KEY_V60_COLOR_HIGHLIGHT_GAMMA = "v60_color_highlight_gamma"
        private const val KEY_V60_VOLUME_DELAY = "v60_volume_delay"
        private const val KEY_V60_DANMAKU_SEND_BORDER_COLOR = "v60_danmaku_send_border_color"
        private const val KEY_V60_CAST_AUTO_ADAPT = "v60_cast_auto_adapt"
        private const val KEY_V60_GESTURE_TRIPLE_TAP_ACTION = "v60_gesture_triple_tap_action"
        private const val KEY_V60_DANMAKU_FILTER_LENGTH2 = "v60_danmaku_filter_length2"
        private const val KEY_V60_CACHE_PREFETCH_ON_CHARGE = "v60_cache_prefetch_on_charge"
        private const val KEY_V60_PROGRESS_BAR_SCRUB_PREVIEW = "v60_progress_bar_scrub_preview"
        private const val KEY_V60_DANMAKU_FONT_BG_COLOR2 = "v60_danmaku_font_bg_color2"
        private const val KEY_V60_COLOR_MIDTONE_SATURATION = "v60_color_midtone_saturation"
        private const val KEY_V60_VOLUME_LOUDNESS_TARGET = "v60_volume_loudness_target"
        private const val KEY_V60_DANMAKU_BG_OPACITY2 = "v60_danmaku_bg_opacity2"
        private const val KEY_V60_CAST_SUBTITLE_SIZE = "v60_cast_subtitle_size"
        private const val KEY_V61_PLAYBACK_AUTO_QUALITY_SWITCH = "v61_playback_auto_quality_switch"
        private const val KEY_V61_DANMAKU_FONT_GLOW_COLOR2 = "v61_danmaku_font_glow_color2"
        private const val KEY_V61_COLOR_BLACK_GAMMA = "v61_color_black_gamma"
        private const val KEY_V61_VOLUME_COMPRESSOR_RATIO = "v61_volume_compressor_ratio"
        private const val KEY_V61_DANMAKU_SEND_SHADOW_SIZE = "v61_danmaku_send_shadow_size"
        private const val KEY_V61_CAST_AUDIO_ENHANCE = "v61_cast_audio_enhance"
        private const val KEY_V61_GESTURE_EDGE_ACTION = "v61_gesture_edge_action"
        private const val KEY_V61_DANMAKU_FILTER_SENDER = "v61_danmaku_filter_sender"
        private const val KEY_V61_CACHE_AUTO_CLEAR_ON_LOW = "v61_cache_auto_clear_on_low"
        private const val KEY_V61_PROGRESS_BAR_ANIMATION = "v61_progress_bar_animation"
        private const val KEY_V61_DANMAKU_FONT_HIGHLIGHT_COLOR = "v61_danmaku_font_highlight_color"
        private const val KEY_V61_COLOR_WHITE_GAMMA = "v61_color_white_gamma"
        private const val KEY_V61_VOLUME_COMPRESSOR_ATTACK = "v61_volume_compressor_attack"
        private const val KEY_V61_DANMAKU_BG_BORDER_COLOR2 = "v61_danmaku_bg_border_color2"
        private const val KEY_V61_CAST_SUBTITLE_COLOR = "v61_cast_subtitle_color"
        private const val KEY_V62_PLAYBACK_AUTO_BITRATE = "v62_playback_auto_bitrate"
        private const val KEY_V62_DANMAKU_FONT_WEIGHT3 = "v62_danmaku_font_weight3"
        private const val KEY_V62_COLOR_GAMMA_CURVE = "v62_color_gamma_curve"
        private const val KEY_V62_VOLUME_COMPRESSOR_RELEASE = "v62_volume_compressor_release"
        private const val KEY_V62_DANMAKU_SEND_OUTLINE_SIZE = "v62_danmaku_send_outline_size"
        private const val KEY_V62_CAST_VIDEO_ENHANCE = "v62_cast_video_enhance"
        private const val KEY_V62_GESTURE_CUSTOM_ACTION = "v62_gesture_custom_action"
        private const val KEY_V62_DANMAKU_FILTER_TIME_RANGE = "v62_danmaku_filter_time_range"
        private const val KEY_V62_CACHE_READ_AHEAD = "v62_cache_read_ahead"
        private const val KEY_V62_PROGRESS_BAR_SENSITIVITY = "v62_progress_bar_sensitivity"
        private const val KEY_V62_DANMAKU_FONT_GLOW_SIZE2 = "v62_danmaku_font_glow_size2"
        private const val KEY_V62_COLOR_TEMPERATURE_CURVE = "v62_color_temperature_curve"
        private const val KEY_V62_VOLUME_LIMITER_THRESHOLD = "v62_volume_limiter_threshold"
        private const val KEY_V62_DANMAKU_BG_SHADOW_BLUR2 = "v62_danmaku_bg_shadow_blur2"
        private const val KEY_V62_CAST_SUBTITLE_BG_COLOR = "v62_cast_subtitle_bg_color"
        private const val KEY_V63_PLAYBACK_AUTO_CHAPTER = "v63_playback_auto_chapter"
        private const val KEY_V63_DANMAKU_FONT_LINE_SPACING2 = "v63_danmaku_font_line_spacing2"
        private const val KEY_V63_COLOR_CONTRAST_CURVE = "v63_color_contrast_curve"
        private const val KEY_V63_VOLUME_NORMALIZER2 = "v63_volume_normalizer2"
        private const val KEY_V63_DANMAKU_SEND_BG_BLUR = "v63_danmaku_send_bg_blur"
        private const val KEY_V63_CAST_AUTO_SUBTITLE = "v63_cast_auto_subtitle"
        private const val KEY_V63_GESTURE_PINCH_ACTION = "v63_gesture_pinch_action"
        private const val KEY_V63_DANMAKU_FILTER_SCORE2 = "v63_danmaku_filter_score2"
        private const val KEY_V63_CACHE_WAKEUP_ON_START = "v63_cache_wakeup_on_start"
        private const val KEY_V63_PROGRESS_BAR_TICK_COLOR = "v63_progress_bar_tick_color"
        private const val KEY_V63_DANMAKU_FONT_WEIGHT_CUSTOM2 = "v63_danmaku_font_weight_custom2"
        private const val KEY_V63_COLOR_BRIGHTNESS_CURVE = "v63_color_brightness_curve"
        private const val KEY_V63_VOLUME_BASS_LPF = "v63_volume_bass_lpf"
        private const val KEY_V63_DANMAKU_BG_SHADOW_OFFSET = "v63_danmaku_bg_shadow_offset"
        private const val KEY_V63_CAST_SUBTITLE_OUTLINE = "v63_cast_subtitle_outline"
        private const val KEY_V64_PLAYBACK_AUTO_LOOP_PLAYLIST = "v64_playback_auto_loop_playlist"
        private const val KEY_V64_DANMAKU_FONT_SHADOW_OFFSET2 = "v64_danmaku_font_shadow_offset2"
        private const val KEY_V64_COLOR_SATURATION_BOOST = "v64_color_saturation_boost"
        private const val KEY_V64_VOLUME_TREBLE_HPF = "v64_volume_treble_hpf"
        private const val KEY_V64_DANMAKU_SEND_BORDER_SIZE = "v64_danmaku_send_border_size"
        private const val KEY_V64_CAST_AUTO_QUALITY2 = "v64_cast_auto_quality2"
        private const val KEY_V64_GESTURE_ROTATION_ACTION = "v64_gesture_rotation_action"
        private const val KEY_V64_DANMAKU_FILTER_LENGTH_RANGE = "v64_danmaku_filter_length_range"
        private const val KEY_V64_CACHE_CLEANUP_ON_START = "v64_cache_cleanup_on_start"
        private const val KEY_V64_PROGRESS_BAR_GLOW_COLOR = "v64_progress_bar_glow_color"
        private const val KEY_V64_DANMAKU_FONT_ITALIC2 = "v64_danmaku_font_italic2"
        private const val KEY_V64_COLOR_VIVIDNESS_BOOST = "v64_color_vividness_boost"
        private const val KEY_V64_VOLUME_SURROUND_ANGLE = "v64_volume_surround_angle"
        private const val KEY_V64_DANMAKU_BG_PADDING2 = "v64_danmaku_bg_padding2"
        private const val KEY_V64_CAST_SUBTITLE_DELAY = "v64_cast_subtitle_delay"
        private const val KEY_V65_PLAYBACK_AUTO_SKIP_RECAP = "v65_playback_auto_skip_recap"
        private const val KEY_V65_DANMAKU_FONT_STRIKE2 = "v65_danmaku_font_strike2"
        private const val KEY_V65_COLOR_HUE_CURVE = "v65_color_hue_curve"
        private const val KEY_V65_VOLUME_BASS_ENHANCE = "v65_volume_bass_enhance"
        private const val KEY_V65_DANMAKU_SEND_ANIM_DURATION = "v65_danmaku_send_anim_duration"
        private const val KEY_V65_CAST_AUTO_RECONNECT2 = "v65_cast_auto_reconnect2"
        private const val KEY_V65_GESTURE_SHAKE_ACTION = "v65_gesture_shake_action"
        private const val KEY_V65_DANMAKU_FILTER_DUPLICATE2 = "v65_danmaku_filter_duplicate2"
        private const val KEY_V65_CACHE_PREFETCH_ON_IDLE = "v65_cache_prefetch_on_idle"
        private const val KEY_V65_PROGRESS_BAR_GRADIENT_SPEED = "v65_progress_bar_gradient_speed"
        private const val KEY_V65_DANMAKU_FONT_UNDERLINE2 = "v65_danmaku_font_underline2"
        private const val KEY_V65_COLOR_LIFT_GAMMA_GAIN = "v65_color_lift_gamma_gain"
        private const val KEY_V65_VOLUME_TREBLE_ENHANCE = "v65_volume_treble_enhance"
        private const val KEY_V65_DANMAKU_BG_BORDER_RADIUS2 = "v65_danmaku_bg_border_radius2"
        private const val KEY_V65_CAST_SUBTITLE_BG_OPACITY = "v65_cast_subtitle_bg_opacity"
        private const val KEY_V66_PLAYBACK_SMART_SEEK = "v66_playback_smart_seek"
        private const val KEY_V66_DANMAKU_FONT_MONOSPACE2 = "v66_danmaku_font_monospace2"
        private const val KEY_V66_COLOR_TONE_MAPPING = "v66_color_tone_mapping"
        private const val KEY_V66_VOLUME_CHANNEL_DELAY = "v66_volume_channel_delay"
        private const val KEY_V66_DANMAKU_SEND_FONT_SIZE3 = "v66_danmaku_send_font_size3"
        private const val KEY_V66_CAST_AUTO_ADAPT2 = "v66_cast_auto_adapt2"
        private const val KEY_V66_GESTURE_MULTI_TOUCH_ACTION = "v66_gesture_multi_touch_action"
        private const val KEY_V66_DANMAKU_FILTER_EMOTE = "v66_danmaku_filter_emote"
        private const val KEY_V66_CACHE_COMPRESS_LEVEL = "v66_cache_compress_level"
        private const val KEY_V66_PROGRESS_BAR_SHADOW_COLOR = "v66_progress_bar_shadow_color"
        private const val KEY_V66_DANMAKU_FONT_COLOR2 = "v66_danmaku_font_color2"
        private const val KEY_V66_COLOR_ACES_FILM = "v66_color_aces_film"
        private const val KEY_V66_VOLUME_DYNAMIC_BASS = "v66_volume_dynamic_bass"
        private const val KEY_V66_DANMAKU_BG_GRADIENT_COLOR3 = "v66_danmaku_bg_gradient_color3"
        private const val KEY_V66_CAST_SUBTITLE_FONT = "v66_cast_subtitle_font"
        private const val KEY_V67_PLAYBACK_AUTO_SKIP_PREVIEW = "v67_playback_auto_skip_preview"
        private const val KEY_V67_DANMAKU_FONT_OUTLINE_COLOR2 = "v67_danmaku_font_outline_color2"
        private const val KEY_V67_COLOR_LOG_CURVE = "v67_color_log_curve"
        private const val KEY_V67_VOLUME_SPATIAL_AUDIO = "v67_volume_spatial_audio"
        private const val KEY_V67_DANMAKU_SEND_BG_RADIUS = "v67_danmaku_send_bg_radius"
        private const val KEY_V67_CAST_AUTO_CONNECT2 = "v67_cast_auto_connect2"
        private const val KEY_V67_GESTURE_FINGER_COUNT_ACTION = "v67_gesture_finger_count_action"
        private const val KEY_V67_DANMAKU_FILTER_COMBO = "v67_danmaku_filter_combo"
        private const val KEY_V67_CACHE_WRITE_POLICY = "v67_cache_write_policy"
        private const val KEY_V67_PROGRESS_BAR_GRADIENT_COLOR = "v67_progress_bar_gradient_color"
        private const val KEY_V67_DANMAKU_FONT_SHADOW_COLOR3 = "v67_danmaku_font_shadow_color3"
        private const val KEY_V67_COLOR_SIGMOID_CONTRAST = "v67_color_sigmoid_contrast"
        private const val KEY_V67_VOLUME_SURROUND_DELAY = "v67_volume_surround_delay"
        private const val KEY_V67_DANMAKU_BG_SHADOW_COLOR3 = "v67_danmaku_bg_shadow_color3"
        private const val KEY_V67_CAST_SUBTITLE_SHADOW = "v67_cast_subtitle_shadow"
        private const val KEY_V68_PLAYBACK_AUTO_SKIP_PADDING = "v68_playback_auto_skip_padding"
        private const val KEY_V68_DANMAKU_FONT_GLOW_COLOR3 = "v68_danmaku_font_glow_color3"
        private const val KEY_V68_COLOR_FILM_GRAIN = "v68_color_film_grain"
        private const val KEY_V68_VOLUME_CHANNEL_EXTRACTOR = "v68_volume_channel_extractor"
        private const val KEY_V68_DANMAKU_SEND_BG_GRADIENT = "v68_danmaku_send_bg_gradient"
        private const val KEY_V68_CAST_AUTO_QUALITY3 = "v68_cast_auto_quality3"
        private const val KEY_V68_GESTURE_PRESSURE_ACTION = "v68_gesture_pressure_action"
        private const val KEY_V68_DANMAKU_FILTER_SUPER_CHAT = "v68_danmaku_filter_super_chat"
        private const val KEY_V68_CACHE_PREFETCH_ON_START = "v68_cache_prefetch_on_start"
        private const val KEY_V68_PROGRESS_BAR_GLOW_EFFECT = "v68_progress_bar_glow_effect"
        private const val KEY_V68_DANMAKU_FONT_WEIGHT_CUSTOM3 = "v68_danmaku_font_weight_custom3"
        private const val KEY_V68_COLOR_BLOOM = "v68_color_bloom"
        private const val KEY_V68_VOLUME_DYNAMIC_RANGE = "v68_volume_dynamic_range"
        private const val KEY_V68_DANMAKU_BG_SHADOW_OFFSET2 = "v68_danmaku_bg_shadow_offset2"
        private const val KEY_V68_CAST_SUBTITLE_GLOW = "v68_cast_subtitle_glow"
        private const val KEY_V69_PLAYBACK_AUTO_SKIP_FILLER2 = "v69_playback_auto_skip_filler2"
        private const val KEY_V69_DANMAKU_FONT_WEIGHT_FINAL = "v69_danmaku_font_weight_final"
        private const val KEY_V69_COLOR_FINAL = "v69_color_final"
        private const val KEY_V69_VOLUME_FINAL = "v69_volume_final"
        private const val KEY_V69_DANMAKU_SEND_FINAL = "v69_danmaku_send_final"
        private const val KEY_V69_CAST_FINAL = "v69_cast_final"
        private const val KEY_V69_GESTURE_FINAL = "v69_gesture_final"
        private const val KEY_V69_DANMAKU_FILTER_FINAL = "v69_danmaku_filter_final"
        private const val KEY_V69_CACHE_FINAL = "v69_cache_final"
        private const val KEY_V69_PROGRESS_BAR_FINAL = "v69_progress_bar_final"
        private const val KEY_V69_DANMAKU_FONT_FINAL = "v69_danmaku_font_final"
        private const val KEY_V69_COLOR_FINAL2 = "v69_color_final2"
        private const val KEY_V69_VOLUME_FINAL2 = "v69_volume_final2"
        private const val KEY_V69_DANMAKU_BG_FINAL = "v69_danmaku_bg_final"
        private const val KEY_V69_CAST_SUBTITLE_FINAL = "v69_cast_subtitle_final"
        private const val KEY_V70_PLAYBACK_FINAL = "v70_playback_final"
        private const val KEY_V70_DANMAKU_FONT_FINAL2 = "v70_danmaku_font_final2"
        private const val KEY_V70_COLOR_FINAL3 = "v70_color_final3"
        private const val KEY_V70_VOLUME_FINAL3 = "v70_volume_final3"
        private const val KEY_V70_DANMAKU_SEND_FINAL2 = "v70_danmaku_send_final2"
        private const val KEY_V70_CAST_FINAL2 = "v70_cast_final2"
        private const val KEY_V70_GESTURE_FINAL2 = "v70_gesture_final2"
        private const val KEY_V70_DANMAKU_FILTER_FINAL2 = "v70_danmaku_filter_final2"
        private const val KEY_V70_CACHE_FINAL2 = "v70_cache_final2"
        private const val KEY_V70_PROGRESS_BAR_FINAL2 = "v70_progress_bar_final2"
        private const val KEY_V70_DANMAKU_FONT_FINAL3 = "v70_danmaku_font_final3"
        private const val KEY_V70_COLOR_FINAL4 = "v70_color_final4"
        private const val KEY_V70_VOLUME_FINAL4 = "v70_volume_final4"
        private const val KEY_V70_DANMAKU_BG_FINAL2 = "v70_danmaku_bg_final2"
        private const val KEY_V70_CAST_SUBTITLE_FINAL2 = "v70_cast_subtitle_final2"

        



        // ===== v121.x KEY =====
        private const val KEY_V121_PLAYBACK_SKIP_INTRO2 = "v121_playback_skip_intro2"
        private const val KEY_V121_DANMAKU_SPEED2 = "v121_danmaku_speed2"
        private const val KEY_V121_COLOR_FADE2 = "v121_color_fade2"
        private const val KEY_V121_VOLUME_FADE_IN2 = "v121_volume_fade_in2"
        private const val KEY_V121_CAST_BITRATE2 = "v121_cast_bitrate2"
        private const val KEY_V121_GESTURE_TAP_ZONE2 = "v121_gesture_tap_zone2"
        private const val KEY_V121_CACHE_COMP_LEVEL3 = "v121_cache_comp_level3"
        private const val KEY_V121_PROGRESS_BAR_FADE2 = "v121_progress_bar_fade2"
        private const val KEY_V121_PLAYBACK_AUTO_PAUSE2 = "v121_playback_auto_pause2"
        private const val KEY_V121_DANMAKU_SCROLL_SPEED2 = "v121_danmaku_scroll_speed2"
        private const val KEY_V121_COLOR_TINT2 = "v121_color_tint2"
        private const val KEY_V121_VOLUME_FADE_OUT2 = "v121_volume_fade_out2"
        private const val KEY_V121_CAST_CODEC2 = "v121_cast_codec2"
        private const val KEY_V121_GESTURE_DOUBLE_SWIPE2 = "v121_gesture_double_swipe2"
        private const val KEY_V121_CACHE_MEMORY_SIZE2 = "v121_cache_memory_size2"

        // ===== v122.x KEY =====
        private const val KEY_V122_PLAYBACK_SKIP_INTRO2 = "v122_playback_skip_intro2"
        private const val KEY_V122_DANMAKU_SPEED2 = "v122_danmaku_speed2"
        private const val KEY_V122_COLOR_FADE2 = "v122_color_fade2"
        private const val KEY_V122_VOLUME_FADE_IN2 = "v122_volume_fade_in2"
        private const val KEY_V122_CAST_BITRATE2 = "v122_cast_bitrate2"
        private const val KEY_V122_GESTURE_TAP_ZONE2 = "v122_gesture_tap_zone2"
        private const val KEY_V122_CACHE_COMP_LEVEL3 = "v122_cache_comp_level3"
        private const val KEY_V122_PROGRESS_BAR_FADE2 = "v122_progress_bar_fade2"
        private const val KEY_V122_PLAYBACK_AUTO_PAUSE2 = "v122_playback_auto_pause2"
        private const val KEY_V122_DANMAKU_SCROLL_SPEED2 = "v122_danmaku_scroll_speed2"
        private const val KEY_V122_COLOR_TINT2 = "v122_color_tint2"
        private const val KEY_V122_VOLUME_FADE_OUT2 = "v122_volume_fade_out2"
        private const val KEY_V122_CAST_CODEC2 = "v122_cast_codec2"
        private const val KEY_V122_GESTURE_DOUBLE_SWIPE2 = "v122_gesture_double_swipe2"
        private const val KEY_V122_CACHE_MEMORY_SIZE2 = "v122_cache_memory_size2"

        // ===== v123.x KEY =====
        private const val KEY_V123_PLAYBACK_SKIP_INTRO2 = "v123_playback_skip_intro2"
        private const val KEY_V123_DANMAKU_SPEED2 = "v123_danmaku_speed2"
        private const val KEY_V123_COLOR_FADE2 = "v123_color_fade2"
        private const val KEY_V123_VOLUME_FADE_IN2 = "v123_volume_fade_in2"
        private const val KEY_V123_CAST_BITRATE2 = "v123_cast_bitrate2"
        private const val KEY_V123_GESTURE_TAP_ZONE2 = "v123_gesture_tap_zone2"
        private const val KEY_V123_CACHE_COMP_LEVEL3 = "v123_cache_comp_level3"
        private const val KEY_V123_PROGRESS_BAR_FADE2 = "v123_progress_bar_fade2"
        private const val KEY_V123_PLAYBACK_AUTO_PAUSE2 = "v123_playback_auto_pause2"
        private const val KEY_V123_DANMAKU_SCROLL_SPEED2 = "v123_danmaku_scroll_speed2"
        private const val KEY_V123_COLOR_TINT2 = "v123_color_tint2"
        private const val KEY_V123_VOLUME_FADE_OUT2 = "v123_volume_fade_out2"
        private const val KEY_V123_CAST_CODEC2 = "v123_cast_codec2"
        private const val KEY_V123_GESTURE_DOUBLE_SWIPE2 = "v123_gesture_double_swipe2"
        private const val KEY_V123_CACHE_MEMORY_SIZE2 = "v123_cache_memory_size2"

        // ===== v124.x KEY =====
        private const val KEY_V124_PLAYBACK_SKIP_INTRO2 = "v124_playback_skip_intro2"
        private const val KEY_V124_DANMAKU_SPEED2 = "v124_danmaku_speed2"
        private const val KEY_V124_COLOR_FADE2 = "v124_color_fade2"
        private const val KEY_V124_VOLUME_FADE_IN2 = "v124_volume_fade_in2"
        private const val KEY_V124_CAST_BITRATE2 = "v124_cast_bitrate2"
        private const val KEY_V124_GESTURE_TAP_ZONE2 = "v124_gesture_tap_zone2"
        private const val KEY_V124_CACHE_COMP_LEVEL3 = "v124_cache_comp_level3"
        private const val KEY_V124_PROGRESS_BAR_FADE2 = "v124_progress_bar_fade2"
        private const val KEY_V124_PLAYBACK_AUTO_PAUSE2 = "v124_playback_auto_pause2"
        private const val KEY_V124_DANMAKU_SCROLL_SPEED2 = "v124_danmaku_scroll_speed2"
        private const val KEY_V124_COLOR_TINT2 = "v124_color_tint2"
        private const val KEY_V124_VOLUME_FADE_OUT2 = "v124_volume_fade_out2"
        private const val KEY_V124_CAST_CODEC2 = "v124_cast_codec2"
        private const val KEY_V124_GESTURE_DOUBLE_SWIPE2 = "v124_gesture_double_swipe2"
        private const val KEY_V124_CACHE_MEMORY_SIZE2 = "v124_cache_memory_size2"

        // ===== v125.x KEY =====
        private const val KEY_V125_PLAYBACK_SKIP_INTRO2 = "v125_playback_skip_intro2"
        private const val KEY_V125_DANMAKU_SPEED2 = "v125_danmaku_speed2"
        private const val KEY_V125_COLOR_FADE2 = "v125_color_fade2"
        private const val KEY_V125_VOLUME_FADE_IN2 = "v125_volume_fade_in2"
        private const val KEY_V125_CAST_BITRATE2 = "v125_cast_bitrate2"
        private const val KEY_V125_GESTURE_TAP_ZONE2 = "v125_gesture_tap_zone2"
        private const val KEY_V125_CACHE_COMP_LEVEL3 = "v125_cache_comp_level3"
        private const val KEY_V125_PROGRESS_BAR_FADE2 = "v125_progress_bar_fade2"
        private const val KEY_V125_PLAYBACK_AUTO_PAUSE2 = "v125_playback_auto_pause2"
        private const val KEY_V125_DANMAKU_SCROLL_SPEED2 = "v125_danmaku_scroll_speed2"
        private const val KEY_V125_COLOR_TINT2 = "v125_color_tint2"
        private const val KEY_V125_VOLUME_FADE_OUT2 = "v125_volume_fade_out2"
        private const val KEY_V125_CAST_CODEC2 = "v125_cast_codec2"
        private const val KEY_V125_GESTURE_DOUBLE_SWIPE2 = "v125_gesture_double_swipe2"
        private const val KEY_V125_CACHE_MEMORY_SIZE2 = "v125_cache_memory_size2"

        // ===== v126.x KEY =====
        private const val KEY_V126_PLAYBACK_SKIP_INTRO2 = "v126_playback_skip_intro2"
        private const val KEY_V126_DANMAKU_SPEED2 = "v126_danmaku_speed2"
        private const val KEY_V126_COLOR_FADE2 = "v126_color_fade2"
        private const val KEY_V126_VOLUME_FADE_IN2 = "v126_volume_fade_in2"
        private const val KEY_V126_CAST_BITRATE2 = "v126_cast_bitrate2"
        private const val KEY_V126_GESTURE_TAP_ZONE2 = "v126_gesture_tap_zone2"
        private const val KEY_V126_CACHE_COMP_LEVEL3 = "v126_cache_comp_level3"
        private const val KEY_V126_PROGRESS_BAR_FADE2 = "v126_progress_bar_fade2"
        private const val KEY_V126_PLAYBACK_AUTO_PAUSE2 = "v126_playback_auto_pause2"
        private const val KEY_V126_DANMAKU_SCROLL_SPEED2 = "v126_danmaku_scroll_speed2"
        private const val KEY_V126_COLOR_TINT2 = "v126_color_tint2"
        private const val KEY_V126_VOLUME_FADE_OUT2 = "v126_volume_fade_out2"
        private const val KEY_V126_CAST_CODEC2 = "v126_cast_codec2"
        private const val KEY_V126_GESTURE_DOUBLE_SWIPE2 = "v126_gesture_double_swipe2"
        private const val KEY_V126_CACHE_MEMORY_SIZE2 = "v126_cache_memory_size2"

        // ===== v127.x KEY =====
        private const val KEY_V127_PLAYBACK_SKIP_INTRO2 = "v127_playback_skip_intro2"
        private const val KEY_V127_DANMAKU_SPEED2 = "v127_danmaku_speed2"
        private const val KEY_V127_COLOR_FADE2 = "v127_color_fade2"
        private const val KEY_V127_VOLUME_FADE_IN2 = "v127_volume_fade_in2"
        private const val KEY_V127_CAST_BITRATE2 = "v127_cast_bitrate2"
        private const val KEY_V127_GESTURE_TAP_ZONE2 = "v127_gesture_tap_zone2"
        private const val KEY_V127_CACHE_COMP_LEVEL3 = "v127_cache_comp_level3"
        private const val KEY_V127_PROGRESS_BAR_FADE2 = "v127_progress_bar_fade2"
        private const val KEY_V127_PLAYBACK_AUTO_PAUSE2 = "v127_playback_auto_pause2"
        private const val KEY_V127_DANMAKU_SCROLL_SPEED2 = "v127_danmaku_scroll_speed2"
        private const val KEY_V127_COLOR_TINT2 = "v127_color_tint2"
        private const val KEY_V127_VOLUME_FADE_OUT2 = "v127_volume_fade_out2"
        private const val KEY_V127_CAST_CODEC2 = "v127_cast_codec2"
        private const val KEY_V127_GESTURE_DOUBLE_SWIPE2 = "v127_gesture_double_swipe2"
        private const val KEY_V127_CACHE_MEMORY_SIZE2 = "v127_cache_memory_size2"

        // ===== v128.x KEY =====
        private const val KEY_V128_PLAYBACK_SKIP_INTRO2 = "v128_playback_skip_intro2"
        private const val KEY_V128_DANMAKU_SPEED2 = "v128_danmaku_speed2"
        private const val KEY_V128_COLOR_FADE2 = "v128_color_fade2"
        private const val KEY_V128_VOLUME_FADE_IN2 = "v128_volume_fade_in2"
        private const val KEY_V128_CAST_BITRATE2 = "v128_cast_bitrate2"
        private const val KEY_V128_GESTURE_TAP_ZONE2 = "v128_gesture_tap_zone2"
        private const val KEY_V128_CACHE_COMP_LEVEL3 = "v128_cache_comp_level3"
        private const val KEY_V128_PROGRESS_BAR_FADE2 = "v128_progress_bar_fade2"
        private const val KEY_V128_PLAYBACK_AUTO_PAUSE2 = "v128_playback_auto_pause2"
        private const val KEY_V128_DANMAKU_SCROLL_SPEED2 = "v128_danmaku_scroll_speed2"
        private const val KEY_V128_COLOR_TINT2 = "v128_color_tint2"
        private const val KEY_V128_VOLUME_FADE_OUT2 = "v128_volume_fade_out2"
        private const val KEY_V128_CAST_CODEC2 = "v128_cast_codec2"
        private const val KEY_V128_GESTURE_DOUBLE_SWIPE2 = "v128_gesture_double_swipe2"
        private const val KEY_V128_CACHE_MEMORY_SIZE2 = "v128_cache_memory_size2"

        // ===== v129.x KEY =====
        private const val KEY_V129_PLAYBACK_SKIP_INTRO2 = "v129_playback_skip_intro2"
        private const val KEY_V129_DANMAKU_SPEED2 = "v129_danmaku_speed2"
        private const val KEY_V129_COLOR_FADE2 = "v129_color_fade2"
        private const val KEY_V129_VOLUME_FADE_IN2 = "v129_volume_fade_in2"
        private const val KEY_V129_CAST_BITRATE2 = "v129_cast_bitrate2"
        private const val KEY_V129_GESTURE_TAP_ZONE2 = "v129_gesture_tap_zone2"
        private const val KEY_V129_CACHE_COMP_LEVEL3 = "v129_cache_comp_level3"
        private const val KEY_V129_PROGRESS_BAR_FADE2 = "v129_progress_bar_fade2"
        private const val KEY_V129_PLAYBACK_AUTO_PAUSE2 = "v129_playback_auto_pause2"
        private const val KEY_V129_DANMAKU_SCROLL_SPEED2 = "v129_danmaku_scroll_speed2"
        private const val KEY_V129_COLOR_TINT2 = "v129_color_tint2"
        private const val KEY_V129_VOLUME_FADE_OUT2 = "v129_volume_fade_out2"
        private const val KEY_V129_CAST_CODEC2 = "v129_cast_codec2"
        private const val KEY_V129_GESTURE_DOUBLE_SWIPE2 = "v129_gesture_double_swipe2"
        private const val KEY_V129_CACHE_MEMORY_SIZE2 = "v129_cache_memory_size2"

        // ===== v130.x KEY =====
        private const val KEY_V130_PLAYBACK_SKIP_INTRO2 = "v130_playback_skip_intro2"
        private const val KEY_V130_DANMAKU_SPEED2 = "v130_danmaku_speed2"
        private const val KEY_V130_COLOR_FADE2 = "v130_color_fade2"
        private const val KEY_V130_VOLUME_FADE_IN2 = "v130_volume_fade_in2"
        private const val KEY_V130_CAST_BITRATE2 = "v130_cast_bitrate2"
        private const val KEY_V130_GESTURE_TAP_ZONE2 = "v130_gesture_tap_zone2"
        private const val KEY_V130_CACHE_COMP_LEVEL3 = "v130_cache_comp_level3"
        private const val KEY_V130_PROGRESS_BAR_FADE2 = "v130_progress_bar_fade2"
        private const val KEY_V130_PLAYBACK_AUTO_PAUSE2 = "v130_playback_auto_pause2"
        private const val KEY_V130_DANMAKU_SCROLL_SPEED2 = "v130_danmaku_scroll_speed2"
        private const val KEY_V130_COLOR_TINT2 = "v130_color_tint2"
        private const val KEY_V130_VOLUME_FADE_OUT2 = "v130_volume_fade_out2"
        private const val KEY_V130_CAST_CODEC2 = "v130_cast_codec2"
        private const val KEY_V130_GESTURE_DOUBLE_SWIPE2 = "v130_gesture_double_swipe2"
        private const val KEY_V130_CACHE_MEMORY_SIZE2 = "v130_cache_memory_size2"

        // ===== v131.x KEY =====
        private const val KEY_V131_PLAYBACK_SKIP_INTRO2 = "v131_playback_skip_intro2"
        private const val KEY_V131_DANMAKU_SPEED2 = "v131_danmaku_speed2"
        private const val KEY_V131_COLOR_FADE2 = "v131_color_fade2"
        private const val KEY_V131_VOLUME_FADE_IN2 = "v131_volume_fade_in2"
        private const val KEY_V131_CAST_BITRATE2 = "v131_cast_bitrate2"
        private const val KEY_V131_GESTURE_TAP_ZONE2 = "v131_gesture_tap_zone2"
        private const val KEY_V131_CACHE_COMP_LEVEL3 = "v131_cache_comp_level3"
        private const val KEY_V131_PROGRESS_BAR_FADE2 = "v131_progress_bar_fade2"
        private const val KEY_V131_PLAYBACK_AUTO_PAUSE2 = "v131_playback_auto_pause2"
        private const val KEY_V131_DANMAKU_SCROLL_SPEED2 = "v131_danmaku_scroll_speed2"
        private const val KEY_V131_COLOR_TINT2 = "v131_color_tint2"
        private const val KEY_V131_VOLUME_FADE_OUT2 = "v131_volume_fade_out2"
        private const val KEY_V131_CAST_CODEC2 = "v131_cast_codec2"
        private const val KEY_V131_GESTURE_DOUBLE_SWIPE2 = "v131_gesture_double_swipe2"
        private const val KEY_V131_CACHE_MEMORY_SIZE2 = "v131_cache_memory_size2"

        // ===== v132.x KEY =====
        private const val KEY_V132_PLAYBACK_SKIP_INTRO2 = "v132_playback_skip_intro2"
        private const val KEY_V132_DANMAKU_SPEED2 = "v132_danmaku_speed2"
        private const val KEY_V132_COLOR_FADE2 = "v132_color_fade2"
        private const val KEY_V132_VOLUME_FADE_IN2 = "v132_volume_fade_in2"
        private const val KEY_V132_CAST_BITRATE2 = "v132_cast_bitrate2"
        private const val KEY_V132_GESTURE_TAP_ZONE2 = "v132_gesture_tap_zone2"
        private const val KEY_V132_CACHE_COMP_LEVEL3 = "v132_cache_comp_level3"
        private const val KEY_V132_PROGRESS_BAR_FADE2 = "v132_progress_bar_fade2"
        private const val KEY_V132_PLAYBACK_AUTO_PAUSE2 = "v132_playback_auto_pause2"
        private const val KEY_V132_DANMAKU_SCROLL_SPEED2 = "v132_danmaku_scroll_speed2"
        private const val KEY_V132_COLOR_TINT2 = "v132_color_tint2"
        private const val KEY_V132_VOLUME_FADE_OUT2 = "v132_volume_fade_out2"
        private const val KEY_V132_CAST_CODEC2 = "v132_cast_codec2"
        private const val KEY_V132_GESTURE_DOUBLE_SWIPE2 = "v132_gesture_double_swipe2"
        private const val KEY_V132_CACHE_MEMORY_SIZE2 = "v132_cache_memory_size2"

        // ===== v133.x KEY =====
        private const val KEY_V133_PLAYBACK_SKIP_INTRO2 = "v133_playback_skip_intro2"
        private const val KEY_V133_DANMAKU_SPEED2 = "v133_danmaku_speed2"
        private const val KEY_V133_COLOR_FADE2 = "v133_color_fade2"
        private const val KEY_V133_VOLUME_FADE_IN2 = "v133_volume_fade_in2"
        private const val KEY_V133_CAST_BITRATE2 = "v133_cast_bitrate2"
        private const val KEY_V133_GESTURE_TAP_ZONE2 = "v133_gesture_tap_zone2"
        private const val KEY_V133_CACHE_COMP_LEVEL3 = "v133_cache_comp_level3"
        private const val KEY_V133_PROGRESS_BAR_FADE2 = "v133_progress_bar_fade2"
        private const val KEY_V133_PLAYBACK_AUTO_PAUSE2 = "v133_playback_auto_pause2"
        private const val KEY_V133_DANMAKU_SCROLL_SPEED2 = "v133_danmaku_scroll_speed2"
        private const val KEY_V133_COLOR_TINT2 = "v133_color_tint2"
        private const val KEY_V133_VOLUME_FADE_OUT2 = "v133_volume_fade_out2"
        private const val KEY_V133_CAST_CODEC2 = "v133_cast_codec2"
        private const val KEY_V133_GESTURE_DOUBLE_SWIPE2 = "v133_gesture_double_swipe2"
        private const val KEY_V133_CACHE_MEMORY_SIZE2 = "v133_cache_memory_size2"

        // ===== v134.x KEY =====
        private const val KEY_V134_PLAYBACK_SKIP_INTRO2 = "v134_playback_skip_intro2"
        private const val KEY_V134_DANMAKU_SPEED2 = "v134_danmaku_speed2"
        private const val KEY_V134_COLOR_FADE2 = "v134_color_fade2"
        private const val KEY_V134_VOLUME_FADE_IN2 = "v134_volume_fade_in2"
        private const val KEY_V134_CAST_BITRATE2 = "v134_cast_bitrate2"
        private const val KEY_V134_GESTURE_TAP_ZONE2 = "v134_gesture_tap_zone2"
        private const val KEY_V134_CACHE_COMP_LEVEL3 = "v134_cache_comp_level3"
        private const val KEY_V134_PROGRESS_BAR_FADE2 = "v134_progress_bar_fade2"
        private const val KEY_V134_PLAYBACK_AUTO_PAUSE2 = "v134_playback_auto_pause2"
        private const val KEY_V134_DANMAKU_SCROLL_SPEED2 = "v134_danmaku_scroll_speed2"
        private const val KEY_V134_COLOR_TINT2 = "v134_color_tint2"
        private const val KEY_V134_VOLUME_FADE_OUT2 = "v134_volume_fade_out2"
        private const val KEY_V134_CAST_CODEC2 = "v134_cast_codec2"
        private const val KEY_V134_GESTURE_DOUBLE_SWIPE2 = "v134_gesture_double_swipe2"
        private const val KEY_V134_CACHE_MEMORY_SIZE2 = "v134_cache_memory_size2"

        // ===== v135.x KEY =====
        private const val KEY_V135_PLAYBACK_SKIP_INTRO2 = "v135_playback_skip_intro2"
        private const val KEY_V135_DANMAKU_SPEED2 = "v135_danmaku_speed2"
        private const val KEY_V135_COLOR_FADE2 = "v135_color_fade2"
        private const val KEY_V135_VOLUME_FADE_IN2 = "v135_volume_fade_in2"
        private const val KEY_V135_CAST_BITRATE2 = "v135_cast_bitrate2"
        private const val KEY_V135_GESTURE_TAP_ZONE2 = "v135_gesture_tap_zone2"
        private const val KEY_V135_CACHE_COMP_LEVEL3 = "v135_cache_comp_level3"
        private const val KEY_V135_PROGRESS_BAR_FADE2 = "v135_progress_bar_fade2"
        private const val KEY_V135_PLAYBACK_AUTO_PAUSE2 = "v135_playback_auto_pause2"
        private const val KEY_V135_DANMAKU_SCROLL_SPEED2 = "v135_danmaku_scroll_speed2"
        private const val KEY_V135_COLOR_TINT2 = "v135_color_tint2"
        private const val KEY_V135_VOLUME_FADE_OUT2 = "v135_volume_fade_out2"
        private const val KEY_V135_CAST_CODEC2 = "v135_cast_codec2"
        private const val KEY_V135_GESTURE_DOUBLE_SWIPE2 = "v135_gesture_double_swipe2"
        private const val KEY_V135_CACHE_MEMORY_SIZE2 = "v135_cache_memory_size2"

        // ===== v136.x KEY =====
        private const val KEY_V136_PLAYBACK_SKIP_INTRO2 = "v136_playback_skip_intro2"
        private const val KEY_V136_DANMAKU_SPEED2 = "v136_danmaku_speed2"
        private const val KEY_V136_COLOR_FADE2 = "v136_color_fade2"
        private const val KEY_V136_VOLUME_FADE_IN2 = "v136_volume_fade_in2"
        private const val KEY_V136_CAST_BITRATE2 = "v136_cast_bitrate2"
        private const val KEY_V136_GESTURE_TAP_ZONE2 = "v136_gesture_tap_zone2"
        private const val KEY_V136_CACHE_COMP_LEVEL3 = "v136_cache_comp_level3"
        private const val KEY_V136_PROGRESS_BAR_FADE2 = "v136_progress_bar_fade2"
        private const val KEY_V136_PLAYBACK_AUTO_PAUSE2 = "v136_playback_auto_pause2"
        private const val KEY_V136_DANMAKU_SCROLL_SPEED2 = "v136_danmaku_scroll_speed2"
        private const val KEY_V136_COLOR_TINT2 = "v136_color_tint2"
        private const val KEY_V136_VOLUME_FADE_OUT2 = "v136_volume_fade_out2"
        private const val KEY_V136_CAST_CODEC2 = "v136_cast_codec2"
        private const val KEY_V136_GESTURE_DOUBLE_SWIPE2 = "v136_gesture_double_swipe2"
        private const val KEY_V136_CACHE_MEMORY_SIZE2 = "v136_cache_memory_size2"

        // ===== v137.x KEY =====
        private const val KEY_V137_PLAYBACK_SKIP_INTRO2 = "v137_playback_skip_intro2"
        private const val KEY_V137_DANMAKU_SPEED2 = "v137_danmaku_speed2"
        private const val KEY_V137_COLOR_FADE2 = "v137_color_fade2"
        private const val KEY_V137_VOLUME_FADE_IN2 = "v137_volume_fade_in2"
        private const val KEY_V137_CAST_BITRATE2 = "v137_cast_bitrate2"
        private const val KEY_V137_GESTURE_TAP_ZONE2 = "v137_gesture_tap_zone2"
        private const val KEY_V137_CACHE_COMP_LEVEL3 = "v137_cache_comp_level3"
        private const val KEY_V137_PROGRESS_BAR_FADE2 = "v137_progress_bar_fade2"
        private const val KEY_V137_PLAYBACK_AUTO_PAUSE2 = "v137_playback_auto_pause2"
        private const val KEY_V137_DANMAKU_SCROLL_SPEED2 = "v137_danmaku_scroll_speed2"
        private const val KEY_V137_COLOR_TINT2 = "v137_color_tint2"
        private const val KEY_V137_VOLUME_FADE_OUT2 = "v137_volume_fade_out2"
        private const val KEY_V137_CAST_CODEC2 = "v137_cast_codec2"
        private const val KEY_V137_GESTURE_DOUBLE_SWIPE2 = "v137_gesture_double_swipe2"
        private const val KEY_V137_CACHE_MEMORY_SIZE2 = "v137_cache_memory_size2"

        // ===== v138.x KEY =====
        private const val KEY_V138_PLAYBACK_SKIP_INTRO2 = "v138_playback_skip_intro2"
        private const val KEY_V138_DANMAKU_SPEED2 = "v138_danmaku_speed2"
        private const val KEY_V138_COLOR_FADE2 = "v138_color_fade2"
        private const val KEY_V138_VOLUME_FADE_IN2 = "v138_volume_fade_in2"
        private const val KEY_V138_CAST_BITRATE2 = "v138_cast_bitrate2"
        private const val KEY_V138_GESTURE_TAP_ZONE2 = "v138_gesture_tap_zone2"
        private const val KEY_V138_CACHE_COMP_LEVEL3 = "v138_cache_comp_level3"
        private const val KEY_V138_PROGRESS_BAR_FADE2 = "v138_progress_bar_fade2"
        private const val KEY_V138_PLAYBACK_AUTO_PAUSE2 = "v138_playback_auto_pause2"
        private const val KEY_V138_DANMAKU_SCROLL_SPEED2 = "v138_danmaku_scroll_speed2"
        private const val KEY_V138_COLOR_TINT2 = "v138_color_tint2"
        private const val KEY_V138_VOLUME_FADE_OUT2 = "v138_volume_fade_out2"
        private const val KEY_V138_CAST_CODEC2 = "v138_cast_codec2"
        private const val KEY_V138_GESTURE_DOUBLE_SWIPE2 = "v138_gesture_double_swipe2"
        private const val KEY_V138_CACHE_MEMORY_SIZE2 = "v138_cache_memory_size2"

        // ===== v139.x KEY =====
        private const val KEY_V139_PLAYBACK_SKIP_INTRO2 = "v139_playback_skip_intro2"
        private const val KEY_V139_DANMAKU_SPEED2 = "v139_danmaku_speed2"
        private const val KEY_V139_COLOR_FADE2 = "v139_color_fade2"
        private const val KEY_V139_VOLUME_FADE_IN2 = "v139_volume_fade_in2"
        private const val KEY_V139_CAST_BITRATE2 = "v139_cast_bitrate2"
        private const val KEY_V139_GESTURE_TAP_ZONE2 = "v139_gesture_tap_zone2"
        private const val KEY_V139_CACHE_COMP_LEVEL3 = "v139_cache_comp_level3"
        private const val KEY_V139_PROGRESS_BAR_FADE2 = "v139_progress_bar_fade2"
        private const val KEY_V139_PLAYBACK_AUTO_PAUSE2 = "v139_playback_auto_pause2"
        private const val KEY_V139_DANMAKU_SCROLL_SPEED2 = "v139_danmaku_scroll_speed2"
        private const val KEY_V139_COLOR_TINT2 = "v139_color_tint2"
        private const val KEY_V139_VOLUME_FADE_OUT2 = "v139_volume_fade_out2"
        private const val KEY_V139_CAST_CODEC2 = "v139_cast_codec2"
        private const val KEY_V139_GESTURE_DOUBLE_SWIPE2 = "v139_gesture_double_swipe2"
        private const val KEY_V139_CACHE_MEMORY_SIZE2 = "v139_cache_memory_size2"

        // ===== v140.x KEY =====
        private const val KEY_V140_PLAYBACK_SKIP_INTRO2 = "v140_playback_skip_intro2"
        private const val KEY_V140_DANMAKU_SPEED2 = "v140_danmaku_speed2"
        private const val KEY_V140_COLOR_FADE2 = "v140_color_fade2"
        private const val KEY_V140_VOLUME_FADE_IN2 = "v140_volume_fade_in2"
        private const val KEY_V140_CAST_BITRATE2 = "v140_cast_bitrate2"
        private const val KEY_V140_GESTURE_TAP_ZONE2 = "v140_gesture_tap_zone2"
        private const val KEY_V140_CACHE_COMP_LEVEL3 = "v140_cache_comp_level3"
        private const val KEY_V140_PROGRESS_BAR_FADE2 = "v140_progress_bar_fade2"
        private const val KEY_V140_PLAYBACK_AUTO_PAUSE2 = "v140_playback_auto_pause2"
        private const val KEY_V140_DANMAKU_SCROLL_SPEED2 = "v140_danmaku_scroll_speed2"
        private const val KEY_V140_COLOR_TINT2 = "v140_color_tint2"
        private const val KEY_V140_VOLUME_FADE_OUT2 = "v140_volume_fade_out2"
        private const val KEY_V140_CAST_CODEC2 = "v140_cast_codec2"
        private const val KEY_V140_GESTURE_DOUBLE_SWIPE2 = "v140_gesture_double_swipe2"
        private const val KEY_V140_CACHE_MEMORY_SIZE2 = "v140_cache_memory_size2"

        // ===== v141.x KEY =====
        private const val KEY_V141_PLAYBACK_SKIP_INTRO2 = "v141_playback_skip_intro2"
        private const val KEY_V141_DANMAKU_SPEED2 = "v141_danmaku_speed2"
        private const val KEY_V141_COLOR_FADE2 = "v141_color_fade2"
        private const val KEY_V141_VOLUME_FADE_IN2 = "v141_volume_fade_in2"
        private const val KEY_V141_CAST_BITRATE2 = "v141_cast_bitrate2"
        private const val KEY_V141_GESTURE_TAP_ZONE2 = "v141_gesture_tap_zone2"
        private const val KEY_V141_CACHE_COMP_LEVEL3 = "v141_cache_comp_level3"
        private const val KEY_V141_PROGRESS_BAR_FADE2 = "v141_progress_bar_fade2"
        private const val KEY_V141_PLAYBACK_AUTO_PAUSE2 = "v141_playback_auto_pause2"
        private const val KEY_V141_DANMAKU_SCROLL_SPEED2 = "v141_danmaku_scroll_speed2"
        private const val KEY_V141_COLOR_TINT2 = "v141_color_tint2"
        private const val KEY_V141_VOLUME_FADE_OUT2 = "v141_volume_fade_out2"
        private const val KEY_V141_CAST_CODEC2 = "v141_cast_codec2"
        private const val KEY_V141_GESTURE_DOUBLE_SWIPE2 = "v141_gesture_double_swipe2"
        private const val KEY_V141_CACHE_MEMORY_SIZE2 = "v141_cache_memory_size2"

        // ===== v142.x KEY =====
        private const val KEY_V142_PLAYBACK_SKIP_INTRO2 = "v142_playback_skip_intro2"
        private const val KEY_V142_DANMAKU_SPEED2 = "v142_danmaku_speed2"
        private const val KEY_V142_COLOR_FADE2 = "v142_color_fade2"
        private const val KEY_V142_VOLUME_FADE_IN2 = "v142_volume_fade_in2"
        private const val KEY_V142_CAST_BITRATE2 = "v142_cast_bitrate2"
        private const val KEY_V142_GESTURE_TAP_ZONE2 = "v142_gesture_tap_zone2"
        private const val KEY_V142_CACHE_COMP_LEVEL3 = "v142_cache_comp_level3"
        private const val KEY_V142_PROGRESS_BAR_FADE2 = "v142_progress_bar_fade2"
        private const val KEY_V142_PLAYBACK_AUTO_PAUSE2 = "v142_playback_auto_pause2"
        private const val KEY_V142_DANMAKU_SCROLL_SPEED2 = "v142_danmaku_scroll_speed2"
        private const val KEY_V142_COLOR_TINT2 = "v142_color_tint2"
        private const val KEY_V142_VOLUME_FADE_OUT2 = "v142_volume_fade_out2"
        private const val KEY_V142_CAST_CODEC2 = "v142_cast_codec2"
        private const val KEY_V142_GESTURE_DOUBLE_SWIPE2 = "v142_gesture_double_swipe2"
        private const val KEY_V142_CACHE_MEMORY_SIZE2 = "v142_cache_memory_size2"

        // ===== v143.x KEY =====
        private const val KEY_V143_PLAYBACK_SKIP_INTRO2 = "v143_playback_skip_intro2"
        private const val KEY_V143_DANMAKU_SPEED2 = "v143_danmaku_speed2"
        private const val KEY_V143_COLOR_FADE2 = "v143_color_fade2"
        private const val KEY_V143_VOLUME_FADE_IN2 = "v143_volume_fade_in2"
        private const val KEY_V143_CAST_BITRATE2 = "v143_cast_bitrate2"
        private const val KEY_V143_GESTURE_TAP_ZONE2 = "v143_gesture_tap_zone2"
        private const val KEY_V143_CACHE_COMP_LEVEL3 = "v143_cache_comp_level3"
        private const val KEY_V143_PROGRESS_BAR_FADE2 = "v143_progress_bar_fade2"
        private const val KEY_V143_PLAYBACK_AUTO_PAUSE2 = "v143_playback_auto_pause2"
        private const val KEY_V143_DANMAKU_SCROLL_SPEED2 = "v143_danmaku_scroll_speed2"
        private const val KEY_V143_COLOR_TINT2 = "v143_color_tint2"
        private const val KEY_V143_VOLUME_FADE_OUT2 = "v143_volume_fade_out2"
        private const val KEY_V143_CAST_CODEC2 = "v143_cast_codec2"
        private const val KEY_V143_GESTURE_DOUBLE_SWIPE2 = "v143_gesture_double_swipe2"
        private const val KEY_V143_CACHE_MEMORY_SIZE2 = "v143_cache_memory_size2"

        // ===== v144.x KEY =====
        private const val KEY_V144_PLAYBACK_SKIP_INTRO2 = "v144_playback_skip_intro2"
        private const val KEY_V144_DANMAKU_SPEED2 = "v144_danmaku_speed2"
        private const val KEY_V144_COLOR_FADE2 = "v144_color_fade2"
        private const val KEY_V144_VOLUME_FADE_IN2 = "v144_volume_fade_in2"
        private const val KEY_V144_CAST_BITRATE2 = "v144_cast_bitrate2"
        private const val KEY_V144_GESTURE_TAP_ZONE2 = "v144_gesture_tap_zone2"
        private const val KEY_V144_CACHE_COMP_LEVEL3 = "v144_cache_comp_level3"
        private const val KEY_V144_PROGRESS_BAR_FADE2 = "v144_progress_bar_fade2"
        private const val KEY_V144_PLAYBACK_AUTO_PAUSE2 = "v144_playback_auto_pause2"
        private const val KEY_V144_DANMAKU_SCROLL_SPEED2 = "v144_danmaku_scroll_speed2"
        private const val KEY_V144_COLOR_TINT2 = "v144_color_tint2"
        private const val KEY_V144_VOLUME_FADE_OUT2 = "v144_volume_fade_out2"
        private const val KEY_V144_CAST_CODEC2 = "v144_cast_codec2"
        private const val KEY_V144_GESTURE_DOUBLE_SWIPE2 = "v144_gesture_double_swipe2"
        private const val KEY_V144_CACHE_MEMORY_SIZE2 = "v144_cache_memory_size2"

        // ===== v145.x KEY =====
        private const val KEY_V145_PLAYBACK_SKIP_INTRO2 = "v145_playback_skip_intro2"
        private const val KEY_V145_DANMAKU_SPEED2 = "v145_danmaku_speed2"
        private const val KEY_V145_COLOR_FADE2 = "v145_color_fade2"
        private const val KEY_V145_VOLUME_FADE_IN2 = "v145_volume_fade_in2"
        private const val KEY_V145_CAST_BITRATE2 = "v145_cast_bitrate2"
        private const val KEY_V145_GESTURE_TAP_ZONE2 = "v145_gesture_tap_zone2"
        private const val KEY_V145_CACHE_COMP_LEVEL3 = "v145_cache_comp_level3"
        private const val KEY_V145_PROGRESS_BAR_FADE2 = "v145_progress_bar_fade2"
        private const val KEY_V145_PLAYBACK_AUTO_PAUSE2 = "v145_playback_auto_pause2"
        private const val KEY_V145_DANMAKU_SCROLL_SPEED2 = "v145_danmaku_scroll_speed2"
        private const val KEY_V145_COLOR_TINT2 = "v145_color_tint2"
        private const val KEY_V145_VOLUME_FADE_OUT2 = "v145_volume_fade_out2"
        private const val KEY_V145_CAST_CODEC2 = "v145_cast_codec2"
        private const val KEY_V145_GESTURE_DOUBLE_SWIPE2 = "v145_gesture_double_swipe2"
        private const val KEY_V145_CACHE_MEMORY_SIZE2 = "v145_cache_memory_size2"

        // ===== v146.x KEY =====
        private const val KEY_V146_PLAYBACK_SKIP_INTRO2 = "v146_playback_skip_intro2"
        private const val KEY_V146_DANMAKU_SPEED2 = "v146_danmaku_speed2"
        private const val KEY_V146_COLOR_FADE2 = "v146_color_fade2"
        private const val KEY_V146_VOLUME_FADE_IN2 = "v146_volume_fade_in2"
        private const val KEY_V146_CAST_BITRATE2 = "v146_cast_bitrate2"
        private const val KEY_V146_GESTURE_TAP_ZONE2 = "v146_gesture_tap_zone2"
        private const val KEY_V146_CACHE_COMP_LEVEL3 = "v146_cache_comp_level3"
        private const val KEY_V146_PROGRESS_BAR_FADE2 = "v146_progress_bar_fade2"
        private const val KEY_V146_PLAYBACK_AUTO_PAUSE2 = "v146_playback_auto_pause2"
        private const val KEY_V146_DANMAKU_SCROLL_SPEED2 = "v146_danmaku_scroll_speed2"
        private const val KEY_V146_COLOR_TINT2 = "v146_color_tint2"
        private const val KEY_V146_VOLUME_FADE_OUT2 = "v146_volume_fade_out2"
        private const val KEY_V146_CAST_CODEC2 = "v146_cast_codec2"
        private const val KEY_V146_GESTURE_DOUBLE_SWIPE2 = "v146_gesture_double_swipe2"
        private const val KEY_V146_CACHE_MEMORY_SIZE2 = "v146_cache_memory_size2"

        // ===== v147.x KEY =====
        private const val KEY_V147_PLAYBACK_SKIP_INTRO2 = "v147_playback_skip_intro2"
        private const val KEY_V147_DANMAKU_SPEED2 = "v147_danmaku_speed2"
        private const val KEY_V147_COLOR_FADE2 = "v147_color_fade2"
        private const val KEY_V147_VOLUME_FADE_IN2 = "v147_volume_fade_in2"
        private const val KEY_V147_CAST_BITRATE2 = "v147_cast_bitrate2"
        private const val KEY_V147_GESTURE_TAP_ZONE2 = "v147_gesture_tap_zone2"
        private const val KEY_V147_CACHE_COMP_LEVEL3 = "v147_cache_comp_level3"
        private const val KEY_V147_PROGRESS_BAR_FADE2 = "v147_progress_bar_fade2"
        private const val KEY_V147_PLAYBACK_AUTO_PAUSE2 = "v147_playback_auto_pause2"
        private const val KEY_V147_DANMAKU_SCROLL_SPEED2 = "v147_danmaku_scroll_speed2"
        private const val KEY_V147_COLOR_TINT2 = "v147_color_tint2"
        private const val KEY_V147_VOLUME_FADE_OUT2 = "v147_volume_fade_out2"
        private const val KEY_V147_CAST_CODEC2 = "v147_cast_codec2"
        private const val KEY_V147_GESTURE_DOUBLE_SWIPE2 = "v147_gesture_double_swipe2"
        private const val KEY_V147_CACHE_MEMORY_SIZE2 = "v147_cache_memory_size2"

        // ===== v148.x KEY =====
        private const val KEY_V148_PLAYBACK_SKIP_INTRO2 = "v148_playback_skip_intro2"
        private const val KEY_V148_DANMAKU_SPEED2 = "v148_danmaku_speed2"
        private const val KEY_V148_COLOR_FADE2 = "v148_color_fade2"
        private const val KEY_V148_VOLUME_FADE_IN2 = "v148_volume_fade_in2"
        private const val KEY_V148_CAST_BITRATE2 = "v148_cast_bitrate2"
        private const val KEY_V148_GESTURE_TAP_ZONE2 = "v148_gesture_tap_zone2"
        private const val KEY_V148_CACHE_COMP_LEVEL3 = "v148_cache_comp_level3"
        private const val KEY_V148_PROGRESS_BAR_FADE2 = "v148_progress_bar_fade2"
        private const val KEY_V148_PLAYBACK_AUTO_PAUSE2 = "v148_playback_auto_pause2"
        private const val KEY_V148_DANMAKU_SCROLL_SPEED2 = "v148_danmaku_scroll_speed2"
        private const val KEY_V148_COLOR_TINT2 = "v148_color_tint2"
        private const val KEY_V148_VOLUME_FADE_OUT2 = "v148_volume_fade_out2"
        private const val KEY_V148_CAST_CODEC2 = "v148_cast_codec2"
        private const val KEY_V148_GESTURE_DOUBLE_SWIPE2 = "v148_gesture_double_swipe2"
        private const val KEY_V148_CACHE_MEMORY_SIZE2 = "v148_cache_memory_size2"

        // ===== v149.x KEY =====
        private const val KEY_V149_PLAYBACK_SKIP_INTRO2 = "v149_playback_skip_intro2"
        private const val KEY_V149_DANMAKU_SPEED2 = "v149_danmaku_speed2"
        private const val KEY_V149_COLOR_FADE2 = "v149_color_fade2"
        private const val KEY_V149_VOLUME_FADE_IN2 = "v149_volume_fade_in2"
        private const val KEY_V149_CAST_BITRATE2 = "v149_cast_bitrate2"
        private const val KEY_V149_GESTURE_TAP_ZONE2 = "v149_gesture_tap_zone2"
        private const val KEY_V149_CACHE_COMP_LEVEL3 = "v149_cache_comp_level3"
        private const val KEY_V149_PROGRESS_BAR_FADE2 = "v149_progress_bar_fade2"
        private const val KEY_V149_PLAYBACK_AUTO_PAUSE2 = "v149_playback_auto_pause2"
        private const val KEY_V149_DANMAKU_SCROLL_SPEED2 = "v149_danmaku_scroll_speed2"
        private const val KEY_V149_COLOR_TINT2 = "v149_color_tint2"
        private const val KEY_V149_VOLUME_FADE_OUT2 = "v149_volume_fade_out2"
        private const val KEY_V149_CAST_CODEC2 = "v149_cast_codec2"
        private const val KEY_V149_GESTURE_DOUBLE_SWIPE2 = "v149_gesture_double_swipe2"
        private const val KEY_V149_CACHE_MEMORY_SIZE2 = "v149_cache_memory_size2"

        // ===== v150.x KEY =====
        private const val KEY_V150_PLAYBACK_SKIP_INTRO2 = "v150_playback_skip_intro2"
        private const val KEY_V150_DANMAKU_SPEED2 = "v150_danmaku_speed2"
        private const val KEY_V150_COLOR_FADE2 = "v150_color_fade2"
        private const val KEY_V150_VOLUME_FADE_IN2 = "v150_volume_fade_in2"
        private const val KEY_V150_CAST_BITRATE2 = "v150_cast_bitrate2"
        private const val KEY_V150_GESTURE_TAP_ZONE2 = "v150_gesture_tap_zone2"
        private const val KEY_V150_CACHE_COMP_LEVEL3 = "v150_cache_comp_level3"
        private const val KEY_V150_PROGRESS_BAR_FADE2 = "v150_progress_bar_fade2"
        private const val KEY_V150_PLAYBACK_AUTO_PAUSE2 = "v150_playback_auto_pause2"
        private const val KEY_V150_DANMAKU_SCROLL_SPEED2 = "v150_danmaku_scroll_speed2"
        private const val KEY_V150_COLOR_TINT2 = "v150_color_tint2"
        private const val KEY_V150_VOLUME_FADE_OUT2 = "v150_volume_fade_out2"
        private const val KEY_V150_CAST_CODEC2 = "v150_cast_codec2"
        private const val KEY_V150_GESTURE_DOUBLE_SWIPE2 = "v150_gesture_double_swipe2"
        private const val KEY_V150_CACHE_MEMORY_SIZE2 = "v150_cache_memory_size2"

                // ===== v101.x KEY =====
        private const val KEY_V101_PLAYBACK_AUTO_RESUME3 = "v101_playback_auto_resume3"
        private const val KEY_V101_DANMAKU_FONT_BLUR3 = "v101_danmaku_font_blur3"
        private const val KEY_V101_COLOR_MIDTONE3 = "v101_color_midtone3"
        private const val KEY_V101_VOLUME_COMPRESSOR3 = "v101_volume_compressor3"
        private const val KEY_V101_CAST_SUBTITLE_FONT3 = "v101_cast_subtitle_font3"
        private const val KEY_V101_GESTURE_EDGE_PAN3 = "v101_gesture_edge_pan3"
        private const val KEY_V101_CACHE_READ_AHEAD3 = "v101_cache_read_ahead3"
        private const val KEY_V101_PROGRESS_BAR_COLOR3 = "v101_progress_bar_color3"
        private const val KEY_V101_PLAYBACK_AUTO_SKIP_CREDITS2 = "v101_playback_auto_skip_credits2"
        private const val KEY_V101_DANMAKU_FONT_GLOW_COLOR4 = "v101_danmaku_font_glow_color4"
        private const val KEY_V101_COLOR_HIGHLIGHT3 = "v101_color_highlight3"
        private const val KEY_V101_VOLUME_PEAK_LIMITER3 = "v101_volume_peak_limiter3"
        private const val KEY_V101_CAST_RESOLUTION3 = "v101_cast_resolution3"
        private const val KEY_V101_GESTURE_HAPTIC3 = "v101_gesture_haptic3"
        private const val KEY_V101_CACHE_DISK_POLICY3 = "v101_cache_disk_policy3"

        // ===== v102.x KEY =====
        private const val KEY_V102_PLAYBACK_AUTO_RESUME3 = "v102_playback_auto_resume3"
        private const val KEY_V102_DANMAKU_FONT_BLUR3 = "v102_danmaku_font_blur3"
        private const val KEY_V102_COLOR_MIDTONE3 = "v102_color_midtone3"
        private const val KEY_V102_VOLUME_COMPRESSOR3 = "v102_volume_compressor3"
        private const val KEY_V102_CAST_SUBTITLE_FONT3 = "v102_cast_subtitle_font3"
        private const val KEY_V102_GESTURE_EDGE_PAN3 = "v102_gesture_edge_pan3"
        private const val KEY_V102_CACHE_READ_AHEAD3 = "v102_cache_read_ahead3"
        private const val KEY_V102_PROGRESS_BAR_COLOR3 = "v102_progress_bar_color3"
        private const val KEY_V102_PLAYBACK_AUTO_SKIP_CREDITS2 = "v102_playback_auto_skip_credits2"
        private const val KEY_V102_DANMAKU_FONT_GLOW_COLOR4 = "v102_danmaku_font_glow_color4"
        private const val KEY_V102_COLOR_HIGHLIGHT3 = "v102_color_highlight3"
        private const val KEY_V102_VOLUME_PEAK_LIMITER3 = "v102_volume_peak_limiter3"
        private const val KEY_V102_CAST_RESOLUTION3 = "v102_cast_resolution3"
        private const val KEY_V102_GESTURE_HAPTIC3 = "v102_gesture_haptic3"
        private const val KEY_V102_CACHE_DISK_POLICY3 = "v102_cache_disk_policy3"

        // ===== v103.x KEY =====
        private const val KEY_V103_PLAYBACK_AUTO_RESUME3 = "v103_playback_auto_resume3"
        private const val KEY_V103_DANMAKU_FONT_BLUR3 = "v103_danmaku_font_blur3"
        private const val KEY_V103_COLOR_MIDTONE3 = "v103_color_midtone3"
        private const val KEY_V103_VOLUME_COMPRESSOR3 = "v103_volume_compressor3"
        private const val KEY_V103_CAST_SUBTITLE_FONT3 = "v103_cast_subtitle_font3"
        private const val KEY_V103_GESTURE_EDGE_PAN3 = "v103_gesture_edge_pan3"
        private const val KEY_V103_CACHE_READ_AHEAD3 = "v103_cache_read_ahead3"
        private const val KEY_V103_PROGRESS_BAR_COLOR3 = "v103_progress_bar_color3"
        private const val KEY_V103_PLAYBACK_AUTO_SKIP_CREDITS2 = "v103_playback_auto_skip_credits2"
        private const val KEY_V103_DANMAKU_FONT_GLOW_COLOR4 = "v103_danmaku_font_glow_color4"
        private const val KEY_V103_COLOR_HIGHLIGHT3 = "v103_color_highlight3"
        private const val KEY_V103_VOLUME_PEAK_LIMITER3 = "v103_volume_peak_limiter3"
        private const val KEY_V103_CAST_RESOLUTION3 = "v103_cast_resolution3"
        private const val KEY_V103_GESTURE_HAPTIC3 = "v103_gesture_haptic3"
        private const val KEY_V103_CACHE_DISK_POLICY3 = "v103_cache_disk_policy3"

        // ===== v104.x KEY =====
        private const val KEY_V104_PLAYBACK_AUTO_RESUME3 = "v104_playback_auto_resume3"
        private const val KEY_V104_DANMAKU_FONT_BLUR3 = "v104_danmaku_font_blur3"
        private const val KEY_V104_COLOR_MIDTONE3 = "v104_color_midtone3"
        private const val KEY_V104_VOLUME_COMPRESSOR3 = "v104_volume_compressor3"
        private const val KEY_V104_CAST_SUBTITLE_FONT3 = "v104_cast_subtitle_font3"
        private const val KEY_V104_GESTURE_EDGE_PAN3 = "v104_gesture_edge_pan3"
        private const val KEY_V104_CACHE_READ_AHEAD3 = "v104_cache_read_ahead3"
        private const val KEY_V104_PROGRESS_BAR_COLOR3 = "v104_progress_bar_color3"
        private const val KEY_V104_PLAYBACK_AUTO_SKIP_CREDITS2 = "v104_playback_auto_skip_credits2"
        private const val KEY_V104_DANMAKU_FONT_GLOW_COLOR4 = "v104_danmaku_font_glow_color4"
        private const val KEY_V104_COLOR_HIGHLIGHT3 = "v104_color_highlight3"
        private const val KEY_V104_VOLUME_PEAK_LIMITER3 = "v104_volume_peak_limiter3"
        private const val KEY_V104_CAST_RESOLUTION3 = "v104_cast_resolution3"
        private const val KEY_V104_GESTURE_HAPTIC3 = "v104_gesture_haptic3"
        private const val KEY_V104_CACHE_DISK_POLICY3 = "v104_cache_disk_policy3"

        // ===== v105.x KEY =====
        private const val KEY_V105_PLAYBACK_AUTO_RESUME3 = "v105_playback_auto_resume3"
        private const val KEY_V105_DANMAKU_FONT_BLUR3 = "v105_danmaku_font_blur3"
        private const val KEY_V105_COLOR_MIDTONE3 = "v105_color_midtone3"
        private const val KEY_V105_VOLUME_COMPRESSOR3 = "v105_volume_compressor3"
        private const val KEY_V105_CAST_SUBTITLE_FONT3 = "v105_cast_subtitle_font3"
        private const val KEY_V105_GESTURE_EDGE_PAN3 = "v105_gesture_edge_pan3"
        private const val KEY_V105_CACHE_READ_AHEAD3 = "v105_cache_read_ahead3"
        private const val KEY_V105_PROGRESS_BAR_COLOR3 = "v105_progress_bar_color3"
        private const val KEY_V105_PLAYBACK_AUTO_SKIP_CREDITS2 = "v105_playback_auto_skip_credits2"
        private const val KEY_V105_DANMAKU_FONT_GLOW_COLOR4 = "v105_danmaku_font_glow_color4"
        private const val KEY_V105_COLOR_HIGHLIGHT3 = "v105_color_highlight3"
        private const val KEY_V105_VOLUME_PEAK_LIMITER3 = "v105_volume_peak_limiter3"
        private const val KEY_V105_CAST_RESOLUTION3 = "v105_cast_resolution3"
        private const val KEY_V105_GESTURE_HAPTIC3 = "v105_gesture_haptic3"
        private const val KEY_V105_CACHE_DISK_POLICY3 = "v105_cache_disk_policy3"

        // ===== v106.x KEY =====
        private const val KEY_V106_PLAYBACK_AUTO_RESUME3 = "v106_playback_auto_resume3"
        private const val KEY_V106_DANMAKU_FONT_BLUR3 = "v106_danmaku_font_blur3"
        private const val KEY_V106_COLOR_MIDTONE3 = "v106_color_midtone3"
        private const val KEY_V106_VOLUME_COMPRESSOR3 = "v106_volume_compressor3"
        private const val KEY_V106_CAST_SUBTITLE_FONT3 = "v106_cast_subtitle_font3"
        private const val KEY_V106_GESTURE_EDGE_PAN3 = "v106_gesture_edge_pan3"
        private const val KEY_V106_CACHE_READ_AHEAD3 = "v106_cache_read_ahead3"
        private const val KEY_V106_PROGRESS_BAR_COLOR3 = "v106_progress_bar_color3"
        private const val KEY_V106_PLAYBACK_AUTO_SKIP_CREDITS2 = "v106_playback_auto_skip_credits2"
        private const val KEY_V106_DANMAKU_FONT_GLOW_COLOR4 = "v106_danmaku_font_glow_color4"
        private const val KEY_V106_COLOR_HIGHLIGHT3 = "v106_color_highlight3"
        private const val KEY_V106_VOLUME_PEAK_LIMITER3 = "v106_volume_peak_limiter3"
        private const val KEY_V106_CAST_RESOLUTION3 = "v106_cast_resolution3"
        private const val KEY_V106_GESTURE_HAPTIC3 = "v106_gesture_haptic3"
        private const val KEY_V106_CACHE_DISK_POLICY3 = "v106_cache_disk_policy3"

        // ===== v107.x KEY =====
        private const val KEY_V107_PLAYBACK_AUTO_RESUME3 = "v107_playback_auto_resume3"
        private const val KEY_V107_DANMAKU_FONT_BLUR3 = "v107_danmaku_font_blur3"
        private const val KEY_V107_COLOR_MIDTONE3 = "v107_color_midtone3"
        private const val KEY_V107_VOLUME_COMPRESSOR3 = "v107_volume_compressor3"
        private const val KEY_V107_CAST_SUBTITLE_FONT3 = "v107_cast_subtitle_font3"
        private const val KEY_V107_GESTURE_EDGE_PAN3 = "v107_gesture_edge_pan3"
        private const val KEY_V107_CACHE_READ_AHEAD3 = "v107_cache_read_ahead3"
        private const val KEY_V107_PROGRESS_BAR_COLOR3 = "v107_progress_bar_color3"
        private const val KEY_V107_PLAYBACK_AUTO_SKIP_CREDITS2 = "v107_playback_auto_skip_credits2"
        private const val KEY_V107_DANMAKU_FONT_GLOW_COLOR4 = "v107_danmaku_font_glow_color4"
        private const val KEY_V107_COLOR_HIGHLIGHT3 = "v107_color_highlight3"
        private const val KEY_V107_VOLUME_PEAK_LIMITER3 = "v107_volume_peak_limiter3"
        private const val KEY_V107_CAST_RESOLUTION3 = "v107_cast_resolution3"
        private const val KEY_V107_GESTURE_HAPTIC3 = "v107_gesture_haptic3"
        private const val KEY_V107_CACHE_DISK_POLICY3 = "v107_cache_disk_policy3"

        // ===== v108.x KEY =====
        private const val KEY_V108_PLAYBACK_AUTO_RESUME3 = "v108_playback_auto_resume3"
        private const val KEY_V108_DANMAKU_FONT_BLUR3 = "v108_danmaku_font_blur3"
        private const val KEY_V108_COLOR_MIDTONE3 = "v108_color_midtone3"
        private const val KEY_V108_VOLUME_COMPRESSOR3 = "v108_volume_compressor3"
        private const val KEY_V108_CAST_SUBTITLE_FONT3 = "v108_cast_subtitle_font3"
        private const val KEY_V108_GESTURE_EDGE_PAN3 = "v108_gesture_edge_pan3"
        private const val KEY_V108_CACHE_READ_AHEAD3 = "v108_cache_read_ahead3"
        private const val KEY_V108_PROGRESS_BAR_COLOR3 = "v108_progress_bar_color3"
        private const val KEY_V108_PLAYBACK_AUTO_SKIP_CREDITS2 = "v108_playback_auto_skip_credits2"
        private const val KEY_V108_DANMAKU_FONT_GLOW_COLOR4 = "v108_danmaku_font_glow_color4"
        private const val KEY_V108_COLOR_HIGHLIGHT3 = "v108_color_highlight3"
        private const val KEY_V108_VOLUME_PEAK_LIMITER3 = "v108_volume_peak_limiter3"
        private const val KEY_V108_CAST_RESOLUTION3 = "v108_cast_resolution3"
        private const val KEY_V108_GESTURE_HAPTIC3 = "v108_gesture_haptic3"
        private const val KEY_V108_CACHE_DISK_POLICY3 = "v108_cache_disk_policy3"

        // ===== v109.x KEY =====
        private const val KEY_V109_PLAYBACK_AUTO_RESUME3 = "v109_playback_auto_resume3"
        private const val KEY_V109_DANMAKU_FONT_BLUR3 = "v109_danmaku_font_blur3"
        private const val KEY_V109_COLOR_MIDTONE3 = "v109_color_midtone3"
        private const val KEY_V109_VOLUME_COMPRESSOR3 = "v109_volume_compressor3"
        private const val KEY_V109_CAST_SUBTITLE_FONT3 = "v109_cast_subtitle_font3"
        private const val KEY_V109_GESTURE_EDGE_PAN3 = "v109_gesture_edge_pan3"
        private const val KEY_V109_CACHE_READ_AHEAD3 = "v109_cache_read_ahead3"
        private const val KEY_V109_PROGRESS_BAR_COLOR3 = "v109_progress_bar_color3"
        private const val KEY_V109_PLAYBACK_AUTO_SKIP_CREDITS2 = "v109_playback_auto_skip_credits2"
        private const val KEY_V109_DANMAKU_FONT_GLOW_COLOR4 = "v109_danmaku_font_glow_color4"
        private const val KEY_V109_COLOR_HIGHLIGHT3 = "v109_color_highlight3"
        private const val KEY_V109_VOLUME_PEAK_LIMITER3 = "v109_volume_peak_limiter3"
        private const val KEY_V109_CAST_RESOLUTION3 = "v109_cast_resolution3"
        private const val KEY_V109_GESTURE_HAPTIC3 = "v109_gesture_haptic3"
        private const val KEY_V109_CACHE_DISK_POLICY3 = "v109_cache_disk_policy3"

        // ===== v110.x KEY =====
        private const val KEY_V110_PLAYBACK_AUTO_RESUME3 = "v110_playback_auto_resume3"
        private const val KEY_V110_DANMAKU_FONT_BLUR3 = "v110_danmaku_font_blur3"
        private const val KEY_V110_COLOR_MIDTONE3 = "v110_color_midtone3"
        private const val KEY_V110_VOLUME_COMPRESSOR3 = "v110_volume_compressor3"
        private const val KEY_V110_CAST_SUBTITLE_FONT3 = "v110_cast_subtitle_font3"
        private const val KEY_V110_GESTURE_EDGE_PAN3 = "v110_gesture_edge_pan3"
        private const val KEY_V110_CACHE_READ_AHEAD3 = "v110_cache_read_ahead3"
        private const val KEY_V110_PROGRESS_BAR_COLOR3 = "v110_progress_bar_color3"
        private const val KEY_V110_PLAYBACK_AUTO_SKIP_CREDITS2 = "v110_playback_auto_skip_credits2"
        private const val KEY_V110_DANMAKU_FONT_GLOW_COLOR4 = "v110_danmaku_font_glow_color4"
        private const val KEY_V110_COLOR_HIGHLIGHT3 = "v110_color_highlight3"
        private const val KEY_V110_VOLUME_PEAK_LIMITER3 = "v110_volume_peak_limiter3"
        private const val KEY_V110_CAST_RESOLUTION3 = "v110_cast_resolution3"
        private const val KEY_V110_GESTURE_HAPTIC3 = "v110_gesture_haptic3"
        private const val KEY_V110_CACHE_DISK_POLICY3 = "v110_cache_disk_policy3"

        // ===== v111.x KEY =====
        private const val KEY_V111_PLAYBACK_AUTO_RESUME3 = "v111_playback_auto_resume3"
        private const val KEY_V111_DANMAKU_FONT_BLUR3 = "v111_danmaku_font_blur3"
        private const val KEY_V111_COLOR_MIDTONE3 = "v111_color_midtone3"
        private const val KEY_V111_VOLUME_COMPRESSOR3 = "v111_volume_compressor3"
        private const val KEY_V111_CAST_SUBTITLE_FONT3 = "v111_cast_subtitle_font3"
        private const val KEY_V111_GESTURE_EDGE_PAN3 = "v111_gesture_edge_pan3"
        private const val KEY_V111_CACHE_READ_AHEAD3 = "v111_cache_read_ahead3"
        private const val KEY_V111_PROGRESS_BAR_COLOR3 = "v111_progress_bar_color3"
        private const val KEY_V111_PLAYBACK_AUTO_SKIP_CREDITS2 = "v111_playback_auto_skip_credits2"
        private const val KEY_V111_DANMAKU_FONT_GLOW_COLOR4 = "v111_danmaku_font_glow_color4"
        private const val KEY_V111_COLOR_HIGHLIGHT3 = "v111_color_highlight3"
        private const val KEY_V111_VOLUME_PEAK_LIMITER3 = "v111_volume_peak_limiter3"
        private const val KEY_V111_CAST_RESOLUTION3 = "v111_cast_resolution3"
        private const val KEY_V111_GESTURE_HAPTIC3 = "v111_gesture_haptic3"
        private const val KEY_V111_CACHE_DISK_POLICY3 = "v111_cache_disk_policy3"

        // ===== v112.x KEY =====
        private const val KEY_V112_PLAYBACK_AUTO_RESUME3 = "v112_playback_auto_resume3"
        private const val KEY_V112_DANMAKU_FONT_BLUR3 = "v112_danmaku_font_blur3"
        private const val KEY_V112_COLOR_MIDTONE3 = "v112_color_midtone3"
        private const val KEY_V112_VOLUME_COMPRESSOR3 = "v112_volume_compressor3"
        private const val KEY_V112_CAST_SUBTITLE_FONT3 = "v112_cast_subtitle_font3"
        private const val KEY_V112_GESTURE_EDGE_PAN3 = "v112_gesture_edge_pan3"
        private const val KEY_V112_CACHE_READ_AHEAD3 = "v112_cache_read_ahead3"
        private const val KEY_V112_PROGRESS_BAR_COLOR3 = "v112_progress_bar_color3"
        private const val KEY_V112_PLAYBACK_AUTO_SKIP_CREDITS2 = "v112_playback_auto_skip_credits2"
        private const val KEY_V112_DANMAKU_FONT_GLOW_COLOR4 = "v112_danmaku_font_glow_color4"
        private const val KEY_V112_COLOR_HIGHLIGHT3 = "v112_color_highlight3"
        private const val KEY_V112_VOLUME_PEAK_LIMITER3 = "v112_volume_peak_limiter3"
        private const val KEY_V112_CAST_RESOLUTION3 = "v112_cast_resolution3"
        private const val KEY_V112_GESTURE_HAPTIC3 = "v112_gesture_haptic3"
        private const val KEY_V112_CACHE_DISK_POLICY3 = "v112_cache_disk_policy3"

        // ===== v113.x KEY =====
        private const val KEY_V113_PLAYBACK_AUTO_RESUME3 = "v113_playback_auto_resume3"
        private const val KEY_V113_DANMAKU_FONT_BLUR3 = "v113_danmaku_font_blur3"
        private const val KEY_V113_COLOR_MIDTONE3 = "v113_color_midtone3"
        private const val KEY_V113_VOLUME_COMPRESSOR3 = "v113_volume_compressor3"
        private const val KEY_V113_CAST_SUBTITLE_FONT3 = "v113_cast_subtitle_font3"
        private const val KEY_V113_GESTURE_EDGE_PAN3 = "v113_gesture_edge_pan3"
        private const val KEY_V113_CACHE_READ_AHEAD3 = "v113_cache_read_ahead3"
        private const val KEY_V113_PROGRESS_BAR_COLOR3 = "v113_progress_bar_color3"
        private const val KEY_V113_PLAYBACK_AUTO_SKIP_CREDITS2 = "v113_playback_auto_skip_credits2"
        private const val KEY_V113_DANMAKU_FONT_GLOW_COLOR4 = "v113_danmaku_font_glow_color4"
        private const val KEY_V113_COLOR_HIGHLIGHT3 = "v113_color_highlight3"
        private const val KEY_V113_VOLUME_PEAK_LIMITER3 = "v113_volume_peak_limiter3"
        private const val KEY_V113_CAST_RESOLUTION3 = "v113_cast_resolution3"
        private const val KEY_V113_GESTURE_HAPTIC3 = "v113_gesture_haptic3"
        private const val KEY_V113_CACHE_DISK_POLICY3 = "v113_cache_disk_policy3"

        // ===== v114.x KEY =====
        private const val KEY_V114_PLAYBACK_AUTO_RESUME3 = "v114_playback_auto_resume3"
        private const val KEY_V114_DANMAKU_FONT_BLUR3 = "v114_danmaku_font_blur3"
        private const val KEY_V114_COLOR_MIDTONE3 = "v114_color_midtone3"
        private const val KEY_V114_VOLUME_COMPRESSOR3 = "v114_volume_compressor3"
        private const val KEY_V114_CAST_SUBTITLE_FONT3 = "v114_cast_subtitle_font3"
        private const val KEY_V114_GESTURE_EDGE_PAN3 = "v114_gesture_edge_pan3"
        private const val KEY_V114_CACHE_READ_AHEAD3 = "v114_cache_read_ahead3"
        private const val KEY_V114_PROGRESS_BAR_COLOR3 = "v114_progress_bar_color3"
        private const val KEY_V114_PLAYBACK_AUTO_SKIP_CREDITS2 = "v114_playback_auto_skip_credits2"
        private const val KEY_V114_DANMAKU_FONT_GLOW_COLOR4 = "v114_danmaku_font_glow_color4"
        private const val KEY_V114_COLOR_HIGHLIGHT3 = "v114_color_highlight3"
        private const val KEY_V114_VOLUME_PEAK_LIMITER3 = "v114_volume_peak_limiter3"
        private const val KEY_V114_CAST_RESOLUTION3 = "v114_cast_resolution3"
        private const val KEY_V114_GESTURE_HAPTIC3 = "v114_gesture_haptic3"
        private const val KEY_V114_CACHE_DISK_POLICY3 = "v114_cache_disk_policy3"

        // ===== v115.x KEY =====
        private const val KEY_V115_PLAYBACK_AUTO_RESUME3 = "v115_playback_auto_resume3"
        private const val KEY_V115_DANMAKU_FONT_BLUR3 = "v115_danmaku_font_blur3"
        private const val KEY_V115_COLOR_MIDTONE3 = "v115_color_midtone3"
        private const val KEY_V115_VOLUME_COMPRESSOR3 = "v115_volume_compressor3"
        private const val KEY_V115_CAST_SUBTITLE_FONT3 = "v115_cast_subtitle_font3"
        private const val KEY_V115_GESTURE_EDGE_PAN3 = "v115_gesture_edge_pan3"
        private const val KEY_V115_CACHE_READ_AHEAD3 = "v115_cache_read_ahead3"
        private const val KEY_V115_PROGRESS_BAR_COLOR3 = "v115_progress_bar_color3"
        private const val KEY_V115_PLAYBACK_AUTO_SKIP_CREDITS2 = "v115_playback_auto_skip_credits2"
        private const val KEY_V115_DANMAKU_FONT_GLOW_COLOR4 = "v115_danmaku_font_glow_color4"
        private const val KEY_V115_COLOR_HIGHLIGHT3 = "v115_color_highlight3"
        private const val KEY_V115_VOLUME_PEAK_LIMITER3 = "v115_volume_peak_limiter3"
        private const val KEY_V115_CAST_RESOLUTION3 = "v115_cast_resolution3"
        private const val KEY_V115_GESTURE_HAPTIC3 = "v115_gesture_haptic3"
        private const val KEY_V115_CACHE_DISK_POLICY3 = "v115_cache_disk_policy3"

        // ===== v116.x KEY =====
        private const val KEY_V116_PLAYBACK_AUTO_RESUME3 = "v116_playback_auto_resume3"
        private const val KEY_V116_DANMAKU_FONT_BLUR3 = "v116_danmaku_font_blur3"
        private const val KEY_V116_COLOR_MIDTONE3 = "v116_color_midtone3"
        private const val KEY_V116_VOLUME_COMPRESSOR3 = "v116_volume_compressor3"
        private const val KEY_V116_CAST_SUBTITLE_FONT3 = "v116_cast_subtitle_font3"
        private const val KEY_V116_GESTURE_EDGE_PAN3 = "v116_gesture_edge_pan3"
        private const val KEY_V116_CACHE_READ_AHEAD3 = "v116_cache_read_ahead3"
        private const val KEY_V116_PROGRESS_BAR_COLOR3 = "v116_progress_bar_color3"
        private const val KEY_V116_PLAYBACK_AUTO_SKIP_CREDITS2 = "v116_playback_auto_skip_credits2"
        private const val KEY_V116_DANMAKU_FONT_GLOW_COLOR4 = "v116_danmaku_font_glow_color4"
        private const val KEY_V116_COLOR_HIGHLIGHT3 = "v116_color_highlight3"
        private const val KEY_V116_VOLUME_PEAK_LIMITER3 = "v116_volume_peak_limiter3"
        private const val KEY_V116_CAST_RESOLUTION3 = "v116_cast_resolution3"
        private const val KEY_V116_GESTURE_HAPTIC3 = "v116_gesture_haptic3"
        private const val KEY_V116_CACHE_DISK_POLICY3 = "v116_cache_disk_policy3"

        // ===== v117.x KEY =====
        private const val KEY_V117_PLAYBACK_AUTO_RESUME3 = "v117_playback_auto_resume3"
        private const val KEY_V117_DANMAKU_FONT_BLUR3 = "v117_danmaku_font_blur3"
        private const val KEY_V117_COLOR_MIDTONE3 = "v117_color_midtone3"
        private const val KEY_V117_VOLUME_COMPRESSOR3 = "v117_volume_compressor3"
        private const val KEY_V117_CAST_SUBTITLE_FONT3 = "v117_cast_subtitle_font3"
        private const val KEY_V117_GESTURE_EDGE_PAN3 = "v117_gesture_edge_pan3"
        private const val KEY_V117_CACHE_READ_AHEAD3 = "v117_cache_read_ahead3"
        private const val KEY_V117_PROGRESS_BAR_COLOR3 = "v117_progress_bar_color3"
        private const val KEY_V117_PLAYBACK_AUTO_SKIP_CREDITS2 = "v117_playback_auto_skip_credits2"
        private const val KEY_V117_DANMAKU_FONT_GLOW_COLOR4 = "v117_danmaku_font_glow_color4"
        private const val KEY_V117_COLOR_HIGHLIGHT3 = "v117_color_highlight3"
        private const val KEY_V117_VOLUME_PEAK_LIMITER3 = "v117_volume_peak_limiter3"
        private const val KEY_V117_CAST_RESOLUTION3 = "v117_cast_resolution3"
        private const val KEY_V117_GESTURE_HAPTIC3 = "v117_gesture_haptic3"
        private const val KEY_V117_CACHE_DISK_POLICY3 = "v117_cache_disk_policy3"

        // ===== v118.x KEY =====
        private const val KEY_V118_PLAYBACK_AUTO_RESUME3 = "v118_playback_auto_resume3"
        private const val KEY_V118_DANMAKU_FONT_BLUR3 = "v118_danmaku_font_blur3"
        private const val KEY_V118_COLOR_MIDTONE3 = "v118_color_midtone3"
        private const val KEY_V118_VOLUME_COMPRESSOR3 = "v118_volume_compressor3"
        private const val KEY_V118_CAST_SUBTITLE_FONT3 = "v118_cast_subtitle_font3"
        private const val KEY_V118_GESTURE_EDGE_PAN3 = "v118_gesture_edge_pan3"
        private const val KEY_V118_CACHE_READ_AHEAD3 = "v118_cache_read_ahead3"
        private const val KEY_V118_PROGRESS_BAR_COLOR3 = "v118_progress_bar_color3"
        private const val KEY_V118_PLAYBACK_AUTO_SKIP_CREDITS2 = "v118_playback_auto_skip_credits2"
        private const val KEY_V118_DANMAKU_FONT_GLOW_COLOR4 = "v118_danmaku_font_glow_color4"
        private const val KEY_V118_COLOR_HIGHLIGHT3 = "v118_color_highlight3"
        private const val KEY_V118_VOLUME_PEAK_LIMITER3 = "v118_volume_peak_limiter3"
        private const val KEY_V118_CAST_RESOLUTION3 = "v118_cast_resolution3"
        private const val KEY_V118_GESTURE_HAPTIC3 = "v118_gesture_haptic3"
        private const val KEY_V118_CACHE_DISK_POLICY3 = "v118_cache_disk_policy3"

        // ===== v119.x KEY =====
        private const val KEY_V119_PLAYBACK_AUTO_RESUME3 = "v119_playback_auto_resume3"
        private const val KEY_V119_DANMAKU_FONT_BLUR3 = "v119_danmaku_font_blur3"
        private const val KEY_V119_COLOR_MIDTONE3 = "v119_color_midtone3"
        private const val KEY_V119_VOLUME_COMPRESSOR3 = "v119_volume_compressor3"
        private const val KEY_V119_CAST_SUBTITLE_FONT3 = "v119_cast_subtitle_font3"
        private const val KEY_V119_GESTURE_EDGE_PAN3 = "v119_gesture_edge_pan3"
        private const val KEY_V119_CACHE_READ_AHEAD3 = "v119_cache_read_ahead3"
        private const val KEY_V119_PROGRESS_BAR_COLOR3 = "v119_progress_bar_color3"
        private const val KEY_V119_PLAYBACK_AUTO_SKIP_CREDITS2 = "v119_playback_auto_skip_credits2"
        private const val KEY_V119_DANMAKU_FONT_GLOW_COLOR4 = "v119_danmaku_font_glow_color4"
        private const val KEY_V119_COLOR_HIGHLIGHT3 = "v119_color_highlight3"
        private const val KEY_V119_VOLUME_PEAK_LIMITER3 = "v119_volume_peak_limiter3"
        private const val KEY_V119_CAST_RESOLUTION3 = "v119_cast_resolution3"
        private const val KEY_V119_GESTURE_HAPTIC3 = "v119_gesture_haptic3"
        private const val KEY_V119_CACHE_DISK_POLICY3 = "v119_cache_disk_policy3"

        // ===== v120.x KEY =====
        private const val KEY_V120_PLAYBACK_AUTO_RESUME3 = "v120_playback_auto_resume3"
        private const val KEY_V120_DANMAKU_FONT_BLUR3 = "v120_danmaku_font_blur3"
        private const val KEY_V120_COLOR_MIDTONE3 = "v120_color_midtone3"
        private const val KEY_V120_VOLUME_COMPRESSOR3 = "v120_volume_compressor3"
        private const val KEY_V120_CAST_SUBTITLE_FONT3 = "v120_cast_subtitle_font3"
        private const val KEY_V120_GESTURE_EDGE_PAN3 = "v120_gesture_edge_pan3"
        private const val KEY_V120_CACHE_READ_AHEAD3 = "v120_cache_read_ahead3"
        private const val KEY_V120_PROGRESS_BAR_COLOR3 = "v120_progress_bar_color3"
        private const val KEY_V120_PLAYBACK_AUTO_SKIP_CREDITS2 = "v120_playback_auto_skip_credits2"
        private const val KEY_V120_DANMAKU_FONT_GLOW_COLOR4 = "v120_danmaku_font_glow_color4"
        private const val KEY_V120_COLOR_HIGHLIGHT3 = "v120_color_highlight3"
        private const val KEY_V120_VOLUME_PEAK_LIMITER3 = "v120_volume_peak_limiter3"
        private const val KEY_V120_CAST_RESOLUTION3 = "v120_cast_resolution3"
        private const val KEY_V120_GESTURE_HAPTIC3 = "v120_gesture_haptic3"
        private const val KEY_V120_CACHE_DISK_POLICY3 = "v120_cache_disk_policy3"

                // ===== v91.x KEY =====
        private const val KEY_V91_PLAYBACK_SMART_BUFFER3 = "v91_playback_smart_buffer3"
        private const val KEY_V91_DANMAKU_FONT_ALPHA3 = "v91_danmaku_font_alpha3"
        private const val KEY_V91_COLOR_SATURATION3 = "v91_color_saturation3"
        private const val KEY_V91_VOLUME_LIMITER3 = "v91_volume_limiter3"
        private const val KEY_V91_CAST_BANDWIDTH3 = "v91_cast_bandwidth3"
        private const val KEY_V91_GESTURE_PINCH_ZOOM3 = "v91_gesture_pinch_zoom3"
        private const val KEY_V91_CACHE_ENCRYPT3 = "v91_cache_encrypt3"
        private const val KEY_V91_PROGRESS_BAR_THUMB_SIZE3 = "v91_progress_bar_thumb_size3"
        private const val KEY_V91_PLAYBACK_AUTO_LOOP2 = "v91_playback_auto_loop2"
        private const val KEY_V91_DANMAKU_FILTER_SCORE4 = "v91_danmaku_filter_score4"
        private const val KEY_V91_COLOR_CONTRAST3 = "v91_color_contrast3"
        private const val KEY_V91_VOLUME_EQ3 = "v91_volume_eq3"
        private const val KEY_V91_CAST_AUTO_RECONNECT4 = "v91_cast_auto_reconnect4"
        private const val KEY_V91_GESTURE_ROTATION3 = "v91_gesture_rotation3"
        private const val KEY_V91_CACHE_AUTO_CLEAR3 = "v91_cache_auto_clear3"

        // ===== v92.x KEY =====
        private const val KEY_V92_PLAYBACK_SMART_BUFFER3 = "v92_playback_smart_buffer3"
        private const val KEY_V92_DANMAKU_FONT_ALPHA3 = "v92_danmaku_font_alpha3"
        private const val KEY_V92_COLOR_SATURATION3 = "v92_color_saturation3"
        private const val KEY_V92_VOLUME_LIMITER3 = "v92_volume_limiter3"
        private const val KEY_V92_CAST_BANDWIDTH3 = "v92_cast_bandwidth3"
        private const val KEY_V92_GESTURE_PINCH_ZOOM3 = "v92_gesture_pinch_zoom3"
        private const val KEY_V92_CACHE_ENCRYPT3 = "v92_cache_encrypt3"
        private const val KEY_V92_PROGRESS_BAR_THUMB_SIZE3 = "v92_progress_bar_thumb_size3"
        private const val KEY_V92_PLAYBACK_AUTO_LOOP2 = "v92_playback_auto_loop2"
        private const val KEY_V92_DANMAKU_FILTER_SCORE4 = "v92_danmaku_filter_score4"
        private const val KEY_V92_COLOR_CONTRAST3 = "v92_color_contrast3"
        private const val KEY_V92_VOLUME_EQ3 = "v92_volume_eq3"
        private const val KEY_V92_CAST_AUTO_RECONNECT4 = "v92_cast_auto_reconnect4"
        private const val KEY_V92_GESTURE_ROTATION3 = "v92_gesture_rotation3"
        private const val KEY_V92_CACHE_AUTO_CLEAR3 = "v92_cache_auto_clear3"

        // ===== v93.x KEY =====
        private const val KEY_V93_PLAYBACK_SMART_BUFFER3 = "v93_playback_smart_buffer3"
        private const val KEY_V93_DANMAKU_FONT_ALPHA3 = "v93_danmaku_font_alpha3"
        private const val KEY_V93_COLOR_SATURATION3 = "v93_color_saturation3"
        private const val KEY_V93_VOLUME_LIMITER3 = "v93_volume_limiter3"
        private const val KEY_V93_CAST_BANDWIDTH3 = "v93_cast_bandwidth3"
        private const val KEY_V93_GESTURE_PINCH_ZOOM3 = "v93_gesture_pinch_zoom3"
        private const val KEY_V93_CACHE_ENCRYPT3 = "v93_cache_encrypt3"
        private const val KEY_V93_PROGRESS_BAR_THUMB_SIZE3 = "v93_progress_bar_thumb_size3"
        private const val KEY_V93_PLAYBACK_AUTO_LOOP2 = "v93_playback_auto_loop2"
        private const val KEY_V93_DANMAKU_FILTER_SCORE4 = "v93_danmaku_filter_score4"
        private const val KEY_V93_COLOR_CONTRAST3 = "v93_color_contrast3"
        private const val KEY_V93_VOLUME_EQ3 = "v93_volume_eq3"
        private const val KEY_V93_CAST_AUTO_RECONNECT4 = "v93_cast_auto_reconnect4"
        private const val KEY_V93_GESTURE_ROTATION3 = "v93_gesture_rotation3"
        private const val KEY_V93_CACHE_AUTO_CLEAR3 = "v93_cache_auto_clear3"

        // ===== v94.x KEY =====
        private const val KEY_V94_PLAYBACK_SMART_BUFFER3 = "v94_playback_smart_buffer3"
        private const val KEY_V94_DANMAKU_FONT_ALPHA3 = "v94_danmaku_font_alpha3"
        private const val KEY_V94_COLOR_SATURATION3 = "v94_color_saturation3"
        private const val KEY_V94_VOLUME_LIMITER3 = "v94_volume_limiter3"
        private const val KEY_V94_CAST_BANDWIDTH3 = "v94_cast_bandwidth3"
        private const val KEY_V94_GESTURE_PINCH_ZOOM3 = "v94_gesture_pinch_zoom3"
        private const val KEY_V94_CACHE_ENCRYPT3 = "v94_cache_encrypt3"
        private const val KEY_V94_PROGRESS_BAR_THUMB_SIZE3 = "v94_progress_bar_thumb_size3"
        private const val KEY_V94_PLAYBACK_AUTO_LOOP2 = "v94_playback_auto_loop2"
        private const val KEY_V94_DANMAKU_FILTER_SCORE4 = "v94_danmaku_filter_score4"
        private const val KEY_V94_COLOR_CONTRAST3 = "v94_color_contrast3"
        private const val KEY_V94_VOLUME_EQ3 = "v94_volume_eq3"
        private const val KEY_V94_CAST_AUTO_RECONNECT4 = "v94_cast_auto_reconnect4"
        private const val KEY_V94_GESTURE_ROTATION3 = "v94_gesture_rotation3"
        private const val KEY_V94_CACHE_AUTO_CLEAR3 = "v94_cache_auto_clear3"

        // ===== v95.x KEY =====
        private const val KEY_V95_PLAYBACK_SMART_BUFFER3 = "v95_playback_smart_buffer3"
        private const val KEY_V95_DANMAKU_FONT_ALPHA3 = "v95_danmaku_font_alpha3"
        private const val KEY_V95_COLOR_SATURATION3 = "v95_color_saturation3"
        private const val KEY_V95_VOLUME_LIMITER3 = "v95_volume_limiter3"
        private const val KEY_V95_CAST_BANDWIDTH3 = "v95_cast_bandwidth3"
        private const val KEY_V95_GESTURE_PINCH_ZOOM3 = "v95_gesture_pinch_zoom3"
        private const val KEY_V95_CACHE_ENCRYPT3 = "v95_cache_encrypt3"
        private const val KEY_V95_PROGRESS_BAR_THUMB_SIZE3 = "v95_progress_bar_thumb_size3"
        private const val KEY_V95_PLAYBACK_AUTO_LOOP2 = "v95_playback_auto_loop2"
        private const val KEY_V95_DANMAKU_FILTER_SCORE4 = "v95_danmaku_filter_score4"
        private const val KEY_V95_COLOR_CONTRAST3 = "v95_color_contrast3"
        private const val KEY_V95_VOLUME_EQ3 = "v95_volume_eq3"
        private const val KEY_V95_CAST_AUTO_RECONNECT4 = "v95_cast_auto_reconnect4"
        private const val KEY_V95_GESTURE_ROTATION3 = "v95_gesture_rotation3"
        private const val KEY_V95_CACHE_AUTO_CLEAR3 = "v95_cache_auto_clear3"

        // ===== v96.x KEY =====
        private const val KEY_V96_PLAYBACK_SMART_BUFFER3 = "v96_playback_smart_buffer3"
        private const val KEY_V96_DANMAKU_FONT_ALPHA3 = "v96_danmaku_font_alpha3"
        private const val KEY_V96_COLOR_SATURATION3 = "v96_color_saturation3"
        private const val KEY_V96_VOLUME_LIMITER3 = "v96_volume_limiter3"
        private const val KEY_V96_CAST_BANDWIDTH3 = "v96_cast_bandwidth3"
        private const val KEY_V96_GESTURE_PINCH_ZOOM3 = "v96_gesture_pinch_zoom3"
        private const val KEY_V96_CACHE_ENCRYPT3 = "v96_cache_encrypt3"
        private const val KEY_V96_PROGRESS_BAR_THUMB_SIZE3 = "v96_progress_bar_thumb_size3"
        private const val KEY_V96_PLAYBACK_AUTO_LOOP2 = "v96_playback_auto_loop2"
        private const val KEY_V96_DANMAKU_FILTER_SCORE4 = "v96_danmaku_filter_score4"
        private const val KEY_V96_COLOR_CONTRAST3 = "v96_color_contrast3"
        private const val KEY_V96_VOLUME_EQ3 = "v96_volume_eq3"
        private const val KEY_V96_CAST_AUTO_RECONNECT4 = "v96_cast_auto_reconnect4"
        private const val KEY_V96_GESTURE_ROTATION3 = "v96_gesture_rotation3"
        private const val KEY_V96_CACHE_AUTO_CLEAR3 = "v96_cache_auto_clear3"

        // ===== v97.x KEY =====
        private const val KEY_V97_PLAYBACK_SMART_BUFFER3 = "v97_playback_smart_buffer3"
        private const val KEY_V97_DANMAKU_FONT_ALPHA3 = "v97_danmaku_font_alpha3"
        private const val KEY_V97_COLOR_SATURATION3 = "v97_color_saturation3"
        private const val KEY_V97_VOLUME_LIMITER3 = "v97_volume_limiter3"
        private const val KEY_V97_CAST_BANDWIDTH3 = "v97_cast_bandwidth3"
        private const val KEY_V97_GESTURE_PINCH_ZOOM3 = "v97_gesture_pinch_zoom3"
        private const val KEY_V97_CACHE_ENCRYPT3 = "v97_cache_encrypt3"
        private const val KEY_V97_PROGRESS_BAR_THUMB_SIZE3 = "v97_progress_bar_thumb_size3"
        private const val KEY_V97_PLAYBACK_AUTO_LOOP2 = "v97_playback_auto_loop2"
        private const val KEY_V97_DANMAKU_FILTER_SCORE4 = "v97_danmaku_filter_score4"
        private const val KEY_V97_COLOR_CONTRAST3 = "v97_color_contrast3"
        private const val KEY_V97_VOLUME_EQ3 = "v97_volume_eq3"
        private const val KEY_V97_CAST_AUTO_RECONNECT4 = "v97_cast_auto_reconnect4"
        private const val KEY_V97_GESTURE_ROTATION3 = "v97_gesture_rotation3"
        private const val KEY_V97_CACHE_AUTO_CLEAR3 = "v97_cache_auto_clear3"

        // ===== v98.x KEY =====
        private const val KEY_V98_PLAYBACK_SMART_BUFFER3 = "v98_playback_smart_buffer3"
        private const val KEY_V98_DANMAKU_FONT_ALPHA3 = "v98_danmaku_font_alpha3"
        private const val KEY_V98_COLOR_SATURATION3 = "v98_color_saturation3"
        private const val KEY_V98_VOLUME_LIMITER3 = "v98_volume_limiter3"
        private const val KEY_V98_CAST_BANDWIDTH3 = "v98_cast_bandwidth3"
        private const val KEY_V98_GESTURE_PINCH_ZOOM3 = "v98_gesture_pinch_zoom3"
        private const val KEY_V98_CACHE_ENCRYPT3 = "v98_cache_encrypt3"
        private const val KEY_V98_PROGRESS_BAR_THUMB_SIZE3 = "v98_progress_bar_thumb_size3"
        private const val KEY_V98_PLAYBACK_AUTO_LOOP2 = "v98_playback_auto_loop2"
        private const val KEY_V98_DANMAKU_FILTER_SCORE4 = "v98_danmaku_filter_score4"
        private const val KEY_V98_COLOR_CONTRAST3 = "v98_color_contrast3"
        private const val KEY_V98_VOLUME_EQ3 = "v98_volume_eq3"
        private const val KEY_V98_CAST_AUTO_RECONNECT4 = "v98_cast_auto_reconnect4"
        private const val KEY_V98_GESTURE_ROTATION3 = "v98_gesture_rotation3"
        private const val KEY_V98_CACHE_AUTO_CLEAR3 = "v98_cache_auto_clear3"

        // ===== v99.x KEY =====
        private const val KEY_V99_PLAYBACK_SMART_BUFFER3 = "v99_playback_smart_buffer3"
        private const val KEY_V99_DANMAKU_FONT_ALPHA3 = "v99_danmaku_font_alpha3"
        private const val KEY_V99_COLOR_SATURATION3 = "v99_color_saturation3"
        private const val KEY_V99_VOLUME_LIMITER3 = "v99_volume_limiter3"
        private const val KEY_V99_CAST_BANDWIDTH3 = "v99_cast_bandwidth3"
        private const val KEY_V99_GESTURE_PINCH_ZOOM3 = "v99_gesture_pinch_zoom3"
        private const val KEY_V99_CACHE_ENCRYPT3 = "v99_cache_encrypt3"
        private const val KEY_V99_PROGRESS_BAR_THUMB_SIZE3 = "v99_progress_bar_thumb_size3"
        private const val KEY_V99_PLAYBACK_AUTO_LOOP2 = "v99_playback_auto_loop2"
        private const val KEY_V99_DANMAKU_FILTER_SCORE4 = "v99_danmaku_filter_score4"
        private const val KEY_V99_COLOR_CONTRAST3 = "v99_color_contrast3"
        private const val KEY_V99_VOLUME_EQ3 = "v99_volume_eq3"
        private const val KEY_V99_CAST_AUTO_RECONNECT4 = "v99_cast_auto_reconnect4"
        private const val KEY_V99_GESTURE_ROTATION3 = "v99_gesture_rotation3"
        private const val KEY_V99_CACHE_AUTO_CLEAR3 = "v99_cache_auto_clear3"

        // ===== v100.x KEY =====
        private const val KEY_V100_PLAYBACK_SMART_BUFFER3 = "v100_playback_smart_buffer3"
        private const val KEY_V100_DANMAKU_FONT_ALPHA3 = "v100_danmaku_font_alpha3"
        private const val KEY_V100_COLOR_SATURATION3 = "v100_color_saturation3"
        private const val KEY_V100_VOLUME_LIMITER3 = "v100_volume_limiter3"
        private const val KEY_V100_CAST_BANDWIDTH3 = "v100_cast_bandwidth3"
        private const val KEY_V100_GESTURE_PINCH_ZOOM3 = "v100_gesture_pinch_zoom3"
        private const val KEY_V100_CACHE_ENCRYPT3 = "v100_cache_encrypt3"
        private const val KEY_V100_PROGRESS_BAR_THUMB_SIZE3 = "v100_progress_bar_thumb_size3"
        private const val KEY_V100_PLAYBACK_AUTO_LOOP2 = "v100_playback_auto_loop2"
        private const val KEY_V100_DANMAKU_FILTER_SCORE4 = "v100_danmaku_filter_score4"
        private const val KEY_V100_COLOR_CONTRAST3 = "v100_color_contrast3"
        private const val KEY_V100_VOLUME_EQ3 = "v100_volume_eq3"
        private const val KEY_V100_CAST_AUTO_RECONNECT4 = "v100_cast_auto_reconnect4"
        private const val KEY_V100_GESTURE_ROTATION3 = "v100_gesture_rotation3"
        private const val KEY_V100_CACHE_AUTO_CLEAR3 = "v100_cache_auto_clear3"

                // ===== v71.x KEY =====
        private const val KEY_V71_PLAYBACK_AUTO_SKIP_RECAP = "v71_playback_auto_skip_recap"
        private const val KEY_V71_DANMAKU_FONT_GLOW_SIZE3 = "v71_danmaku_font_glow_size3"
        private const val KEY_V71_COLOR_LIFT2 = "v71_color_lift2"
        private const val KEY_V71_VOLUME_SURROUND2 = "v71_volume_surround2"
        private const val KEY_V71_CAST_SUBTITLE_SYNC2 = "v71_cast_subtitle_sync2"
        private const val KEY_V71_GESTURE_SWIPE_SPEED2 = "v71_gesture_swipe_speed2"
        private const val KEY_V71_CACHE_MAX_SIZE2 = "v71_cache_max_size2"
        private const val KEY_V71_PROGRESS_BAR_SENSITIVITY2 = "v71_progress_bar_sensitivity2"
        private const val KEY_V71_PLAYBACK_SMART_SPEED = "v71_playback_smart_speed"
        private const val KEY_V71_DANMAKU_FONT_WEIGHT4 = "v71_danmaku_font_weight4"
        private const val KEY_V71_COLOR_GAMMA2 = "v71_color_gamma2"
        private const val KEY_V71_VOLUME_BASS2 = "v71_volume_bass2"
        private const val KEY_V71_CAST_VIDEO_QUALITY2 = "v71_cast_video_quality2"
        private const val KEY_V71_GESTURE_DOUBLE_TAP_SPEED = "v71_gesture_double_tap_speed"
        private const val KEY_V71_CACHE_PREFETCH_SIZE2 = "v71_cache_prefetch_size2"

        // ===== v72.x KEY =====
        private const val KEY_V72_PLAYBACK_AUTO_SKIP_RECAP = "v72_playback_auto_skip_recap"
        private const val KEY_V72_DANMAKU_FONT_GLOW_SIZE3 = "v72_danmaku_font_glow_size3"
        private const val KEY_V72_COLOR_LIFT2 = "v72_color_lift2"
        private const val KEY_V72_VOLUME_SURROUND2 = "v72_volume_surround2"
        private const val KEY_V72_CAST_SUBTITLE_SYNC2 = "v72_cast_subtitle_sync2"
        private const val KEY_V72_GESTURE_SWIPE_SPEED2 = "v72_gesture_swipe_speed2"
        private const val KEY_V72_CACHE_MAX_SIZE2 = "v72_cache_max_size2"
        private const val KEY_V72_PROGRESS_BAR_SENSITIVITY2 = "v72_progress_bar_sensitivity2"
        private const val KEY_V72_PLAYBACK_SMART_SPEED = "v72_playback_smart_speed"
        private const val KEY_V72_DANMAKU_FONT_WEIGHT4 = "v72_danmaku_font_weight4"
        private const val KEY_V72_COLOR_GAMMA2 = "v72_color_gamma2"
        private const val KEY_V72_VOLUME_BASS2 = "v72_volume_bass2"
        private const val KEY_V72_CAST_VIDEO_QUALITY2 = "v72_cast_video_quality2"
        private const val KEY_V72_GESTURE_DOUBLE_TAP_SPEED = "v72_gesture_double_tap_speed"
        private const val KEY_V72_CACHE_PREFETCH_SIZE2 = "v72_cache_prefetch_size2"

        // ===== v73.x KEY =====
        private const val KEY_V73_PLAYBACK_AUTO_SKIP_RECAP = "v73_playback_auto_skip_recap"
        private const val KEY_V73_DANMAKU_FONT_GLOW_SIZE3 = "v73_danmaku_font_glow_size3"
        private const val KEY_V73_COLOR_LIFT2 = "v73_color_lift2"
        private const val KEY_V73_VOLUME_SURROUND2 = "v73_volume_surround2"
        private const val KEY_V73_CAST_SUBTITLE_SYNC2 = "v73_cast_subtitle_sync2"
        private const val KEY_V73_GESTURE_SWIPE_SPEED2 = "v73_gesture_swipe_speed2"
        private const val KEY_V73_CACHE_MAX_SIZE2 = "v73_cache_max_size2"
        private const val KEY_V73_PROGRESS_BAR_SENSITIVITY2 = "v73_progress_bar_sensitivity2"
        private const val KEY_V73_PLAYBACK_SMART_SPEED = "v73_playback_smart_speed"
        private const val KEY_V73_DANMAKU_FONT_WEIGHT4 = "v73_danmaku_font_weight4"
        private const val KEY_V73_COLOR_GAMMA2 = "v73_color_gamma2"
        private const val KEY_V73_VOLUME_BASS2 = "v73_volume_bass2"
        private const val KEY_V73_CAST_VIDEO_QUALITY2 = "v73_cast_video_quality2"
        private const val KEY_V73_GESTURE_DOUBLE_TAP_SPEED = "v73_gesture_double_tap_speed"
        private const val KEY_V73_CACHE_PREFETCH_SIZE2 = "v73_cache_prefetch_size2"

        // ===== v74.x KEY =====
        private const val KEY_V74_PLAYBACK_AUTO_SKIP_RECAP = "v74_playback_auto_skip_recap"
        private const val KEY_V74_DANMAKU_FONT_GLOW_SIZE3 = "v74_danmaku_font_glow_size3"
        private const val KEY_V74_COLOR_LIFT2 = "v74_color_lift2"
        private const val KEY_V74_VOLUME_SURROUND2 = "v74_volume_surround2"
        private const val KEY_V74_CAST_SUBTITLE_SYNC2 = "v74_cast_subtitle_sync2"
        private const val KEY_V74_GESTURE_SWIPE_SPEED2 = "v74_gesture_swipe_speed2"
        private const val KEY_V74_CACHE_MAX_SIZE2 = "v74_cache_max_size2"
        private const val KEY_V74_PROGRESS_BAR_SENSITIVITY2 = "v74_progress_bar_sensitivity2"
        private const val KEY_V74_PLAYBACK_SMART_SPEED = "v74_playback_smart_speed"
        private const val KEY_V74_DANMAKU_FONT_WEIGHT4 = "v74_danmaku_font_weight4"
        private const val KEY_V74_COLOR_GAMMA2 = "v74_color_gamma2"
        private const val KEY_V74_VOLUME_BASS2 = "v74_volume_bass2"
        private const val KEY_V74_CAST_VIDEO_QUALITY2 = "v74_cast_video_quality2"
        private const val KEY_V74_GESTURE_DOUBLE_TAP_SPEED = "v74_gesture_double_tap_speed"
        private const val KEY_V74_CACHE_PREFETCH_SIZE2 = "v74_cache_prefetch_size2"

        // ===== v75.x KEY =====
        private const val KEY_V75_PLAYBACK_AUTO_SKIP_RECAP = "v75_playback_auto_skip_recap"
        private const val KEY_V75_DANMAKU_FONT_GLOW_SIZE3 = "v75_danmaku_font_glow_size3"
        private const val KEY_V75_COLOR_LIFT2 = "v75_color_lift2"
        private const val KEY_V75_VOLUME_SURROUND2 = "v75_volume_surround2"
        private const val KEY_V75_CAST_SUBTITLE_SYNC2 = "v75_cast_subtitle_sync2"
        private const val KEY_V75_GESTURE_SWIPE_SPEED2 = "v75_gesture_swipe_speed2"
        private const val KEY_V75_CACHE_MAX_SIZE2 = "v75_cache_max_size2"
        private const val KEY_V75_PROGRESS_BAR_SENSITIVITY2 = "v75_progress_bar_sensitivity2"
        private const val KEY_V75_PLAYBACK_SMART_SPEED = "v75_playback_smart_speed"
        private const val KEY_V75_DANMAKU_FONT_WEIGHT4 = "v75_danmaku_font_weight4"
        private const val KEY_V75_COLOR_GAMMA2 = "v75_color_gamma2"
        private const val KEY_V75_VOLUME_BASS2 = "v75_volume_bass2"
        private const val KEY_V75_CAST_VIDEO_QUALITY2 = "v75_cast_video_quality2"
        private const val KEY_V75_GESTURE_DOUBLE_TAP_SPEED = "v75_gesture_double_tap_speed"
        private const val KEY_V75_CACHE_PREFETCH_SIZE2 = "v75_cache_prefetch_size2"

        // ===== v76.x KEY =====
        private const val KEY_V76_PLAYBACK_AUTO_SKIP_RECAP = "v76_playback_auto_skip_recap"
        private const val KEY_V76_DANMAKU_FONT_GLOW_SIZE3 = "v76_danmaku_font_glow_size3"
        private const val KEY_V76_COLOR_LIFT2 = "v76_color_lift2"
        private const val KEY_V76_VOLUME_SURROUND2 = "v76_volume_surround2"
        private const val KEY_V76_CAST_SUBTITLE_SYNC2 = "v76_cast_subtitle_sync2"
        private const val KEY_V76_GESTURE_SWIPE_SPEED2 = "v76_gesture_swipe_speed2"
        private const val KEY_V76_CACHE_MAX_SIZE2 = "v76_cache_max_size2"
        private const val KEY_V76_PROGRESS_BAR_SENSITIVITY2 = "v76_progress_bar_sensitivity2"
        private const val KEY_V76_PLAYBACK_SMART_SPEED = "v76_playback_smart_speed"
        private const val KEY_V76_DANMAKU_FONT_WEIGHT4 = "v76_danmaku_font_weight4"
        private const val KEY_V76_COLOR_GAMMA2 = "v76_color_gamma2"
        private const val KEY_V76_VOLUME_BASS2 = "v76_volume_bass2"
        private const val KEY_V76_CAST_VIDEO_QUALITY2 = "v76_cast_video_quality2"
        private const val KEY_V76_GESTURE_DOUBLE_TAP_SPEED = "v76_gesture_double_tap_speed"
        private const val KEY_V76_CACHE_PREFETCH_SIZE2 = "v76_cache_prefetch_size2"

        // ===== v77.x KEY =====
        private const val KEY_V77_PLAYBACK_AUTO_SKIP_RECAP = "v77_playback_auto_skip_recap"
        private const val KEY_V77_DANMAKU_FONT_GLOW_SIZE3 = "v77_danmaku_font_glow_size3"
        private const val KEY_V77_COLOR_LIFT2 = "v77_color_lift2"
        private const val KEY_V77_VOLUME_SURROUND2 = "v77_volume_surround2"
        private const val KEY_V77_CAST_SUBTITLE_SYNC2 = "v77_cast_subtitle_sync2"
        private const val KEY_V77_GESTURE_SWIPE_SPEED2 = "v77_gesture_swipe_speed2"
        private const val KEY_V77_CACHE_MAX_SIZE2 = "v77_cache_max_size2"
        private const val KEY_V77_PROGRESS_BAR_SENSITIVITY2 = "v77_progress_bar_sensitivity2"
        private const val KEY_V77_PLAYBACK_SMART_SPEED = "v77_playback_smart_speed"
        private const val KEY_V77_DANMAKU_FONT_WEIGHT4 = "v77_danmaku_font_weight4"
        private const val KEY_V77_COLOR_GAMMA2 = "v77_color_gamma2"
        private const val KEY_V77_VOLUME_BASS2 = "v77_volume_bass2"
        private const val KEY_V77_CAST_VIDEO_QUALITY2 = "v77_cast_video_quality2"
        private const val KEY_V77_GESTURE_DOUBLE_TAP_SPEED = "v77_gesture_double_tap_speed"
        private const val KEY_V77_CACHE_PREFETCH_SIZE2 = "v77_cache_prefetch_size2"

        // ===== v78.x KEY =====
        private const val KEY_V78_PLAYBACK_AUTO_SKIP_RECAP = "v78_playback_auto_skip_recap"
        private const val KEY_V78_DANMAKU_FONT_GLOW_SIZE3 = "v78_danmaku_font_glow_size3"
        private const val KEY_V78_COLOR_LIFT2 = "v78_color_lift2"
        private const val KEY_V78_VOLUME_SURROUND2 = "v78_volume_surround2"
        private const val KEY_V78_CAST_SUBTITLE_SYNC2 = "v78_cast_subtitle_sync2"
        private const val KEY_V78_GESTURE_SWIPE_SPEED2 = "v78_gesture_swipe_speed2"
        private const val KEY_V78_CACHE_MAX_SIZE2 = "v78_cache_max_size2"
        private const val KEY_V78_PROGRESS_BAR_SENSITIVITY2 = "v78_progress_bar_sensitivity2"
        private const val KEY_V78_PLAYBACK_SMART_SPEED = "v78_playback_smart_speed"
        private const val KEY_V78_DANMAKU_FONT_WEIGHT4 = "v78_danmaku_font_weight4"
        private const val KEY_V78_COLOR_GAMMA2 = "v78_color_gamma2"
        private const val KEY_V78_VOLUME_BASS2 = "v78_volume_bass2"
        private const val KEY_V78_CAST_VIDEO_QUALITY2 = "v78_cast_video_quality2"
        private const val KEY_V78_GESTURE_DOUBLE_TAP_SPEED = "v78_gesture_double_tap_speed"
        private const val KEY_V78_CACHE_PREFETCH_SIZE2 = "v78_cache_prefetch_size2"

        // ===== v79.x KEY =====
        private const val KEY_V79_PLAYBACK_AUTO_SKIP_RECAP = "v79_playback_auto_skip_recap"
        private const val KEY_V79_DANMAKU_FONT_GLOW_SIZE3 = "v79_danmaku_font_glow_size3"
        private const val KEY_V79_COLOR_LIFT2 = "v79_color_lift2"
        private const val KEY_V79_VOLUME_SURROUND2 = "v79_volume_surround2"
        private const val KEY_V79_CAST_SUBTITLE_SYNC2 = "v79_cast_subtitle_sync2"
        private const val KEY_V79_GESTURE_SWIPE_SPEED2 = "v79_gesture_swipe_speed2"
        private const val KEY_V79_CACHE_MAX_SIZE2 = "v79_cache_max_size2"
        private const val KEY_V79_PROGRESS_BAR_SENSITIVITY2 = "v79_progress_bar_sensitivity2"
        private const val KEY_V79_PLAYBACK_SMART_SPEED = "v79_playback_smart_speed"
        private const val KEY_V79_DANMAKU_FONT_WEIGHT4 = "v79_danmaku_font_weight4"
        private const val KEY_V79_COLOR_GAMMA2 = "v79_color_gamma2"
        private const val KEY_V79_VOLUME_BASS2 = "v79_volume_bass2"
        private const val KEY_V79_CAST_VIDEO_QUALITY2 = "v79_cast_video_quality2"
        private const val KEY_V79_GESTURE_DOUBLE_TAP_SPEED = "v79_gesture_double_tap_speed"
        private const val KEY_V79_CACHE_PREFETCH_SIZE2 = "v79_cache_prefetch_size2"

        // ===== v80.x KEY =====
        private const val KEY_V80_PLAYBACK_AUTO_SKIP_RECAP = "v80_playback_auto_skip_recap"
        private const val KEY_V80_DANMAKU_FONT_GLOW_SIZE3 = "v80_danmaku_font_glow_size3"
        private const val KEY_V80_COLOR_LIFT2 = "v80_color_lift2"
        private const val KEY_V80_VOLUME_SURROUND2 = "v80_volume_surround2"
        private const val KEY_V80_CAST_SUBTITLE_SYNC2 = "v80_cast_subtitle_sync2"
        private const val KEY_V80_GESTURE_SWIPE_SPEED2 = "v80_gesture_swipe_speed2"
        private const val KEY_V80_CACHE_MAX_SIZE2 = "v80_cache_max_size2"
        private const val KEY_V80_PROGRESS_BAR_SENSITIVITY2 = "v80_progress_bar_sensitivity2"
        private const val KEY_V80_PLAYBACK_SMART_SPEED = "v80_playback_smart_speed"
        private const val KEY_V80_DANMAKU_FONT_WEIGHT4 = "v80_danmaku_font_weight4"
        private const val KEY_V80_COLOR_GAMMA2 = "v80_color_gamma2"
        private const val KEY_V80_VOLUME_BASS2 = "v80_volume_bass2"
        private const val KEY_V80_CAST_VIDEO_QUALITY2 = "v80_cast_video_quality2"
        private const val KEY_V80_GESTURE_DOUBLE_TAP_SPEED = "v80_gesture_double_tap_speed"
        private const val KEY_V80_CACHE_PREFETCH_SIZE2 = "v80_cache_prefetch_size2"

        // ===== v81.x KEY =====
        private const val KEY_V81_PLAYBACK_AUTO_SKIP_RECAP = "v81_playback_auto_skip_recap"
        private const val KEY_V81_DANMAKU_FONT_GLOW_SIZE3 = "v81_danmaku_font_glow_size3"
        private const val KEY_V81_COLOR_LIFT2 = "v81_color_lift2"
        private const val KEY_V81_VOLUME_SURROUND2 = "v81_volume_surround2"
        private const val KEY_V81_CAST_SUBTITLE_SYNC2 = "v81_cast_subtitle_sync2"
        private const val KEY_V81_GESTURE_SWIPE_SPEED2 = "v81_gesture_swipe_speed2"
        private const val KEY_V81_CACHE_MAX_SIZE2 = "v81_cache_max_size2"
        private const val KEY_V81_PROGRESS_BAR_SENSITIVITY2 = "v81_progress_bar_sensitivity2"
        private const val KEY_V81_PLAYBACK_SMART_SPEED = "v81_playback_smart_speed"
        private const val KEY_V81_DANMAKU_FONT_WEIGHT4 = "v81_danmaku_font_weight4"
        private const val KEY_V81_COLOR_GAMMA2 = "v81_color_gamma2"
        private const val KEY_V81_VOLUME_BASS2 = "v81_volume_bass2"
        private const val KEY_V81_CAST_VIDEO_QUALITY2 = "v81_cast_video_quality2"
        private const val KEY_V81_GESTURE_DOUBLE_TAP_SPEED = "v81_gesture_double_tap_speed"
        private const val KEY_V81_CACHE_PREFETCH_SIZE2 = "v81_cache_prefetch_size2"

        // ===== v82.x KEY =====
        private const val KEY_V82_PLAYBACK_AUTO_SKIP_RECAP = "v82_playback_auto_skip_recap"
        private const val KEY_V82_DANMAKU_FONT_GLOW_SIZE3 = "v82_danmaku_font_glow_size3"
        private const val KEY_V82_COLOR_LIFT2 = "v82_color_lift2"
        private const val KEY_V82_VOLUME_SURROUND2 = "v82_volume_surround2"
        private const val KEY_V82_CAST_SUBTITLE_SYNC2 = "v82_cast_subtitle_sync2"
        private const val KEY_V82_GESTURE_SWIPE_SPEED2 = "v82_gesture_swipe_speed2"
        private const val KEY_V82_CACHE_MAX_SIZE2 = "v82_cache_max_size2"
        private const val KEY_V82_PROGRESS_BAR_SENSITIVITY2 = "v82_progress_bar_sensitivity2"
        private const val KEY_V82_PLAYBACK_SMART_SPEED = "v82_playback_smart_speed"
        private const val KEY_V82_DANMAKU_FONT_WEIGHT4 = "v82_danmaku_font_weight4"
        private const val KEY_V82_COLOR_GAMMA2 = "v82_color_gamma2"
        private const val KEY_V82_VOLUME_BASS2 = "v82_volume_bass2"
        private const val KEY_V82_CAST_VIDEO_QUALITY2 = "v82_cast_video_quality2"
        private const val KEY_V82_GESTURE_DOUBLE_TAP_SPEED = "v82_gesture_double_tap_speed"
        private const val KEY_V82_CACHE_PREFETCH_SIZE2 = "v82_cache_prefetch_size2"

        // ===== v83.x KEY =====
        private const val KEY_V83_PLAYBACK_AUTO_SKIP_RECAP = "v83_playback_auto_skip_recap"
        private const val KEY_V83_DANMAKU_FONT_GLOW_SIZE3 = "v83_danmaku_font_glow_size3"
        private const val KEY_V83_COLOR_LIFT2 = "v83_color_lift2"
        private const val KEY_V83_VOLUME_SURROUND2 = "v83_volume_surround2"
        private const val KEY_V83_CAST_SUBTITLE_SYNC2 = "v83_cast_subtitle_sync2"
        private const val KEY_V83_GESTURE_SWIPE_SPEED2 = "v83_gesture_swipe_speed2"
        private const val KEY_V83_CACHE_MAX_SIZE2 = "v83_cache_max_size2"
        private const val KEY_V83_PROGRESS_BAR_SENSITIVITY2 = "v83_progress_bar_sensitivity2"
        private const val KEY_V83_PLAYBACK_SMART_SPEED = "v83_playback_smart_speed"
        private const val KEY_V83_DANMAKU_FONT_WEIGHT4 = "v83_danmaku_font_weight4"
        private const val KEY_V83_COLOR_GAMMA2 = "v83_color_gamma2"
        private const val KEY_V83_VOLUME_BASS2 = "v83_volume_bass2"
        private const val KEY_V83_CAST_VIDEO_QUALITY2 = "v83_cast_video_quality2"
        private const val KEY_V83_GESTURE_DOUBLE_TAP_SPEED = "v83_gesture_double_tap_speed"
        private const val KEY_V83_CACHE_PREFETCH_SIZE2 = "v83_cache_prefetch_size2"

        // ===== v84.x KEY =====
        private const val KEY_V84_PLAYBACK_AUTO_SKIP_RECAP = "v84_playback_auto_skip_recap"
        private const val KEY_V84_DANMAKU_FONT_GLOW_SIZE3 = "v84_danmaku_font_glow_size3"
        private const val KEY_V84_COLOR_LIFT2 = "v84_color_lift2"
        private const val KEY_V84_VOLUME_SURROUND2 = "v84_volume_surround2"
        private const val KEY_V84_CAST_SUBTITLE_SYNC2 = "v84_cast_subtitle_sync2"
        private const val KEY_V84_GESTURE_SWIPE_SPEED2 = "v84_gesture_swipe_speed2"
        private const val KEY_V84_CACHE_MAX_SIZE2 = "v84_cache_max_size2"
        private const val KEY_V84_PROGRESS_BAR_SENSITIVITY2 = "v84_progress_bar_sensitivity2"
        private const val KEY_V84_PLAYBACK_SMART_SPEED = "v84_playback_smart_speed"
        private const val KEY_V84_DANMAKU_FONT_WEIGHT4 = "v84_danmaku_font_weight4"
        private const val KEY_V84_COLOR_GAMMA2 = "v84_color_gamma2"
        private const val KEY_V84_VOLUME_BASS2 = "v84_volume_bass2"
        private const val KEY_V84_CAST_VIDEO_QUALITY2 = "v84_cast_video_quality2"
        private const val KEY_V84_GESTURE_DOUBLE_TAP_SPEED = "v84_gesture_double_tap_speed"
        private const val KEY_V84_CACHE_PREFETCH_SIZE2 = "v84_cache_prefetch_size2"

        // ===== v85.x KEY =====
        private const val KEY_V85_PLAYBACK_AUTO_SKIP_RECAP = "v85_playback_auto_skip_recap"
        private const val KEY_V85_DANMAKU_FONT_GLOW_SIZE3 = "v85_danmaku_font_glow_size3"
        private const val KEY_V85_COLOR_LIFT2 = "v85_color_lift2"
        private const val KEY_V85_VOLUME_SURROUND2 = "v85_volume_surround2"
        private const val KEY_V85_CAST_SUBTITLE_SYNC2 = "v85_cast_subtitle_sync2"
        private const val KEY_V85_GESTURE_SWIPE_SPEED2 = "v85_gesture_swipe_speed2"
        private const val KEY_V85_CACHE_MAX_SIZE2 = "v85_cache_max_size2"
        private const val KEY_V85_PROGRESS_BAR_SENSITIVITY2 = "v85_progress_bar_sensitivity2"
        private const val KEY_V85_PLAYBACK_SMART_SPEED = "v85_playback_smart_speed"
        private const val KEY_V85_DANMAKU_FONT_WEIGHT4 = "v85_danmaku_font_weight4"
        private const val KEY_V85_COLOR_GAMMA2 = "v85_color_gamma2"
        private const val KEY_V85_VOLUME_BASS2 = "v85_volume_bass2"
        private const val KEY_V85_CAST_VIDEO_QUALITY2 = "v85_cast_video_quality2"
        private const val KEY_V85_GESTURE_DOUBLE_TAP_SPEED = "v85_gesture_double_tap_speed"
        private const val KEY_V85_CACHE_PREFETCH_SIZE2 = "v85_cache_prefetch_size2"

        // ===== v86.x KEY =====
        private const val KEY_V86_PLAYBACK_AUTO_SKIP_RECAP = "v86_playback_auto_skip_recap"
        private const val KEY_V86_DANMAKU_FONT_GLOW_SIZE3 = "v86_danmaku_font_glow_size3"
        private const val KEY_V86_COLOR_LIFT2 = "v86_color_lift2"
        private const val KEY_V86_VOLUME_SURROUND2 = "v86_volume_surround2"
        private const val KEY_V86_CAST_SUBTITLE_SYNC2 = "v86_cast_subtitle_sync2"
        private const val KEY_V86_GESTURE_SWIPE_SPEED2 = "v86_gesture_swipe_speed2"
        private const val KEY_V86_CACHE_MAX_SIZE2 = "v86_cache_max_size2"
        private const val KEY_V86_PROGRESS_BAR_SENSITIVITY2 = "v86_progress_bar_sensitivity2"
        private const val KEY_V86_PLAYBACK_SMART_SPEED = "v86_playback_smart_speed"
        private const val KEY_V86_DANMAKU_FONT_WEIGHT4 = "v86_danmaku_font_weight4"
        private const val KEY_V86_COLOR_GAMMA2 = "v86_color_gamma2"
        private const val KEY_V86_VOLUME_BASS2 = "v86_volume_bass2"
        private const val KEY_V86_CAST_VIDEO_QUALITY2 = "v86_cast_video_quality2"
        private const val KEY_V86_GESTURE_DOUBLE_TAP_SPEED = "v86_gesture_double_tap_speed"
        private const val KEY_V86_CACHE_PREFETCH_SIZE2 = "v86_cache_prefetch_size2"

        // ===== v87.x KEY =====
        private const val KEY_V87_PLAYBACK_AUTO_SKIP_RECAP = "v87_playback_auto_skip_recap"
        private const val KEY_V87_DANMAKU_FONT_GLOW_SIZE3 = "v87_danmaku_font_glow_size3"
        private const val KEY_V87_COLOR_LIFT2 = "v87_color_lift2"
        private const val KEY_V87_VOLUME_SURROUND2 = "v87_volume_surround2"
        private const val KEY_V87_CAST_SUBTITLE_SYNC2 = "v87_cast_subtitle_sync2"
        private const val KEY_V87_GESTURE_SWIPE_SPEED2 = "v87_gesture_swipe_speed2"
        private const val KEY_V87_CACHE_MAX_SIZE2 = "v87_cache_max_size2"
        private const val KEY_V87_PROGRESS_BAR_SENSITIVITY2 = "v87_progress_bar_sensitivity2"
        private const val KEY_V87_PLAYBACK_SMART_SPEED = "v87_playback_smart_speed"
        private const val KEY_V87_DANMAKU_FONT_WEIGHT4 = "v87_danmaku_font_weight4"
        private const val KEY_V87_COLOR_GAMMA2 = "v87_color_gamma2"
        private const val KEY_V87_VOLUME_BASS2 = "v87_volume_bass2"
        private const val KEY_V87_CAST_VIDEO_QUALITY2 = "v87_cast_video_quality2"
        private const val KEY_V87_GESTURE_DOUBLE_TAP_SPEED = "v87_gesture_double_tap_speed"
        private const val KEY_V87_CACHE_PREFETCH_SIZE2 = "v87_cache_prefetch_size2"

        // ===== v88.x KEY =====
        private const val KEY_V88_PLAYBACK_AUTO_SKIP_RECAP = "v88_playback_auto_skip_recap"
        private const val KEY_V88_DANMAKU_FONT_GLOW_SIZE3 = "v88_danmaku_font_glow_size3"
        private const val KEY_V88_COLOR_LIFT2 = "v88_color_lift2"
        private const val KEY_V88_VOLUME_SURROUND2 = "v88_volume_surround2"
        private const val KEY_V88_CAST_SUBTITLE_SYNC2 = "v88_cast_subtitle_sync2"
        private const val KEY_V88_GESTURE_SWIPE_SPEED2 = "v88_gesture_swipe_speed2"
        private const val KEY_V88_CACHE_MAX_SIZE2 = "v88_cache_max_size2"
        private const val KEY_V88_PROGRESS_BAR_SENSITIVITY2 = "v88_progress_bar_sensitivity2"
        private const val KEY_V88_PLAYBACK_SMART_SPEED = "v88_playback_smart_speed"
        private const val KEY_V88_DANMAKU_FONT_WEIGHT4 = "v88_danmaku_font_weight4"
        private const val KEY_V88_COLOR_GAMMA2 = "v88_color_gamma2"
        private const val KEY_V88_VOLUME_BASS2 = "v88_volume_bass2"
        private const val KEY_V88_CAST_VIDEO_QUALITY2 = "v88_cast_video_quality2"
        private const val KEY_V88_GESTURE_DOUBLE_TAP_SPEED = "v88_gesture_double_tap_speed"
        private const val KEY_V88_CACHE_PREFETCH_SIZE2 = "v88_cache_prefetch_size2"

        // ===== v89.x KEY =====
        private const val KEY_V89_PLAYBACK_AUTO_SKIP_RECAP = "v89_playback_auto_skip_recap"
        private const val KEY_V89_DANMAKU_FONT_GLOW_SIZE3 = "v89_danmaku_font_glow_size3"
        private const val KEY_V89_COLOR_LIFT2 = "v89_color_lift2"
        private const val KEY_V89_VOLUME_SURROUND2 = "v89_volume_surround2"
        private const val KEY_V89_CAST_SUBTITLE_SYNC2 = "v89_cast_subtitle_sync2"
        private const val KEY_V89_GESTURE_SWIPE_SPEED2 = "v89_gesture_swipe_speed2"
        private const val KEY_V89_CACHE_MAX_SIZE2 = "v89_cache_max_size2"
        private const val KEY_V89_PROGRESS_BAR_SENSITIVITY2 = "v89_progress_bar_sensitivity2"
        private const val KEY_V89_PLAYBACK_SMART_SPEED = "v89_playback_smart_speed"
        private const val KEY_V89_DANMAKU_FONT_WEIGHT4 = "v89_danmaku_font_weight4"
        private const val KEY_V89_COLOR_GAMMA2 = "v89_color_gamma2"
        private const val KEY_V89_VOLUME_BASS2 = "v89_volume_bass2"
        private const val KEY_V89_CAST_VIDEO_QUALITY2 = "v89_cast_video_quality2"
        private const val KEY_V89_GESTURE_DOUBLE_TAP_SPEED = "v89_gesture_double_tap_speed"
        private const val KEY_V89_CACHE_PREFETCH_SIZE2 = "v89_cache_prefetch_size2"

        // ===== v90.x KEY =====
        private const val KEY_V90_PLAYBACK_AUTO_SKIP_RECAP = "v90_playback_auto_skip_recap"
        private const val KEY_V90_DANMAKU_FONT_GLOW_SIZE3 = "v90_danmaku_font_glow_size3"
        private const val KEY_V90_COLOR_LIFT2 = "v90_color_lift2"
        private const val KEY_V90_VOLUME_SURROUND2 = "v90_volume_surround2"
        private const val KEY_V90_CAST_SUBTITLE_SYNC2 = "v90_cast_subtitle_sync2"
        private const val KEY_V90_GESTURE_SWIPE_SPEED2 = "v90_gesture_swipe_speed2"
        private const val KEY_V90_CACHE_MAX_SIZE2 = "v90_cache_max_size2"
        private const val KEY_V90_PROGRESS_BAR_SENSITIVITY2 = "v90_progress_bar_sensitivity2"
        private const val KEY_V90_PLAYBACK_SMART_SPEED = "v90_playback_smart_speed"
        private const val KEY_V90_DANMAKU_FONT_WEIGHT4 = "v90_danmaku_font_weight4"
        private const val KEY_V90_COLOR_GAMMA2 = "v90_color_gamma2"
        private const val KEY_V90_VOLUME_BASS2 = "v90_volume_bass2"
        private const val KEY_V90_CAST_VIDEO_QUALITY2 = "v90_cast_video_quality2"
        private const val KEY_V90_GESTURE_DOUBLE_TAP_SPEED = "v90_gesture_double_tap_speed"
        private const val KEY_V90_CACHE_PREFETCH_SIZE2 = "v90_cache_prefetch_size2"

                // v13.10: 暗角效果
        private const val KEY_VIGNETTE_INTENSITY = "vignette_intensity"
        // v13.10: 自定义文字水印
        private const val KEY_CUSTOM_WATERMARK_TEXT = "custom_watermark_text"
        private const val KEY_CUSTOM_WATERMARK_COLOR = "custom_watermark_color"
        private const val KEY_CUSTOM_WATERMARK_SIZE = "custom_watermark_size"
        // v13.11: 弹幕历史记录
        private const val KEY_DANMAKU_HISTORY = "danmaku_history"
        // v13.12: 快捷调节
        private const val KEY_QUICK_BRIGHTNESS = "quick_brightness"
        private const val KEY_QUICK_CONTRAST = "quick_contrast"
        private const val KEY_QUICK_SATURATION = "quick_saturation"
        // v13.13: 音频声道
        private const val KEY_AUDIO_CHANNEL = "audio_channel"
        private const val KEY_SPEED_PRESETS = "speed_presets"
        private const val KEY_SKIP_INTRO_SECONDS = "skip_intro_seconds"
        private const val KEY_SKIP_OUTRO_SECONDS = "skip_outro_seconds"
        private const val KEY_PLAYER_PREFERRED_QN = "player_preferred_qn"
        private const val KEY_PLAYER_PREFERRED_QN_PORTRAIT = "player_preferred_qn_portrait"
        private const val KEY_PLAYER_CODEC = "player_codec"
        private const val KEY_PLAYER_RENDER_VIEW = "player_render_view"
        private const val KEY_PLAYER_ENGINE_KIND = "player_engine_kind"
        private const val KEY_PLAYER_STYLE = "player_style"
        private const val KEY_PLAYER_AUDIO_ID = "player_audio_id"
        private const val KEY_PLAYER_CDN_PREFERENCE = "player_cdn_preference"
        private const val KEY_LIVE_HIGH_BITRATE_ENABLED = "live_high_bitrate_enabled"
        private const val KEY_LIVE_FPS = "live_fps"
        private const val KEY_SUBTITLE_LANG = "subtitle_lang"
        private const val KEY_SUBTITLE_ENABLED_DEFAULT = "subtitle_enabled_default"
        private const val KEY_SUBTITLE_TEXT_SIZE_SP = "subtitle_text_size_sp"
        private const val KEY_SUBTITLE_BOTTOM_PADDING_FRACTION = "subtitle_bottom_padding_fraction"
        private const val KEY_SUBTITLE_BACKGROUND_OPACITY = "subtitle_background_opacity"
        private const val KEY_PLAYER_SPEED = "player_speed"
        private const val KEY_PLAYER_SHORT_SEEK_STEP_SECONDS = "player_short_seek_step_seconds"
        private const val KEY_PLAYER_HOLD_SEEK_SPEED = "player_hold_seek_speed"
        private const val KEY_PLAYER_HOLD_SEEK_MODE = "player_hold_seek_mode"
        private const val KEY_PLAYER_HOLD_SCRUB_TRAVERSE_SECONDS = "player_hold_scrub_traverse_seconds"
        private const val KEY_PLAYER_HOLD_SCRUB_FIXED_STEP_SECONDS = "player_hold_scrub_fixed_step_seconds"
        private const val KEY_PLAYER_AUTO_RESUME_ENABLED = "player_auto_resume_enabled"
        private const val KEY_PLAYER_AUTO_SKIP_SEGMENTS_ENABLED = "player_auto_skip_segments_enabled"
        private const val KEY_PLAYER_AUTO_SKIP_SERVER_BASE_URL = "player_auto_skip_server_base_url"
        private const val KEY_SPONSOR_BLOCK_PRIVATE_USER_ID = "sponsor_block_private_user_id"
        private const val KEY_PLAYER_OPEN_DETAIL_BEFORE_PLAY = "player_open_detail_before_play"
        private const val KEY_FULLSCREEN = "fullscreen_enabled"
        private const val KEY_AVOID_DISPLAY_CUTOUT = "avoid_display_cutout"
        private const val KEY_TAB_SWITCH_FOLLOWS_FOCUS = "tab_switch_follows_focus"
        private const val KEY_MAIN_AUTO_HIDE_SIDEBAR_ON_ENTER_CONTENT = "main_auto_hide_sidebar_on_enter_content"
        private const val KEY_MAIN_BACK_FOCUS_SCHEME = "main_back_focus_scheme"
        private const val KEY_VIDEO_CARD_LONG_PRESS_ACTION = "video_card_long_press_action"
        private const val KEY_PLAYER_DEBUG = "player_debug_enabled"
        private const val KEY_PLAYER_DOUBLE_BACK_TO_EXIT = "player_double_back_on_ended"
        private const val KEY_PLAYER_DOWN_KEY_OSD_FOCUS_TARGET = "player_down_key_osd_focus_target"
        private const val KEY_PLAYER_TOGGLE_PLAY_STATE_SHOW_OSD = "player_toggle_play_state_show_osd"
        private const val KEY_PLAYER_PERSISTENT_BOTTOM_PROGRESS = "player_persistent_bottom_progress"
        private const val KEY_PLAYER_PERSISTENT_CLOCK = "player_persistent_clock"
        private const val KEY_PLAYER_TOUCH_GESTURES_ENABLED = "player_touch_gestures_enabled"
        private const val KEY_PLAYER_GESTURE_SENSITIVITY = "player_gesture_sensitivity"
        // v5.7: 双击动作
        private const val KEY_DOUBLE_TAP_ACTION = "double_tap_action"
        const val DOUBLE_TAP_ACTION_PLAY_PAUSE = 0
        const val DOUBLE_TAP_ACTION_LIKE = 1
        const val DOUBLE_TAP_ACTION_DANMAKU_TOGGLE = 2
        // v5.8: 省流模式
        private const val KEY_DATA_SAVER_MODE = "data_saver_mode"
        private const val KEY_EYE_PROTECTION_MODE = "eye_protection_mode"
        private const val KEY_HIDDEN_SIDEBAR_TABS = "hidden_sidebar_tabs"
        private const val KEY_PLAYER_VIDEOSHOT_PREVIEW_SIZE = "player_videoshot_preview_size"
        private const val KEY_PLAYER_AUDIO_BALANCE_LEVEL = "player_audio_balance_level"
        private const val KEY_PLAYER_PLAYBACK_MODE = "player_playback_mode"
        private const val KEY_PLAYER_SETTINGS_APPLY_TO_GLOBAL = "player_settings_apply_to_global"
        private const val KEY_PLAYER_UP_QUICK_CARD_ENABLED = "player_up_quick_card_enabled"
        private const val KEY_PLAYER_OSD_BUTTONS = "player_osd_buttons"
        private const val KEY_PLAYER_OSD_BUTTONS_DETAIL_MIGRATED = "player_osd_buttons_detail_migrated"
        private const val KEY_PLAYER_CUSTOM_SHORTCUTS = "player_custom_shortcuts"
        private const val KEY_PLAYER_SMART_QUALITY_ENABLED = "player_smart_quality_enabled"
        private const val KEY_GRID_SPAN = "grid_span"
        private const val KEY_DYNAMIC_GRID_SPAN = "dynamic_grid_span"
        private const val KEY_PGC_GRID_SPAN = "pgc_grid_span"
        private const val KEY_PGC_EPISODE_ORDER_REVERSED = "pgc_episode_order_reversed"
        private const val KEY_SEARCH_HISTORY = "search_history"
        private const val KEY_GAIA_VGATE_V_VOUCHER = "gaia_vgate_v_voucher"
        private const val KEY_GAIA_VGATE_V_VOUCHER_SAVED_AT_MS = "gaia_vgate_v_voucher_saved_at_ms"
        // v10.1: 网络速度指示器
        private const val KEY_NETWORK_SPEED_INDICATOR = "network_speed_indicator"
        // v12.12: 电池电量指示器
        private const val KEY_BATTERY_INDICATOR = "battery_indicator"
        // v12.14: 视频画面旋转
        private const val KEY_VIDEO_ROTATION = "video_rotation"
        // v12.15: 视频画面镜像
        private const val KEY_VIDEO_MIRROR = "video_mirror"
        // v12.16: 画面比例持久化
        private const val KEY_PLAYER_ASPECT_RATIO = "player_aspect_ratio"
        // v12.21: 播放时长提醒
        private const val KEY_PLAYBACK_TIME_REMINDER = "playback_time_reminder"
        // v10.2: 视频书签
        private const val KEY_VIDEO_BOOKMARKS = "video_bookmarks"

        private val CREDENTIAL_KEYS: Set<String> =
            setOf(
                KEY_WEB_REFRESH_TOKEN,
                KEY_APP_AUTH_SESSION,
                KEY_WEB_COOKIE_REFRESH_CHECKED_EPOCH_DAY,
                KEY_BILI_TICKET_CHECKED_EPOCH_DAY,
                KEY_GAIA_VGATE_V_VOUCHER,
                KEY_GAIA_VGATE_V_VOUCHER_SAVED_AT_MS,
                KEY_SPONSOR_BLOCK_PRIVATE_USER_ID,
            )

        private val DIAGNOSTIC_EXCLUDED_KEYS: Set<String> =
            CREDENTIAL_KEYS +
                setOf(
                    KEY_BUVID_ACTIVATED_MID,
                    KEY_SEARCH_HISTORY,
                )

        // PC browser UA is used to reduce CDN 403 for media resources.
        const val DEFAULT_UA =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36"

        const val PLAYER_CDN_BILIVIDEO = "bilivideo"
        const val PLAYER_CDN_MCDN = "mcdn"

        const val DANMAKU_LANE_DENSITY_SPARSE = "sparse"
        const val DANMAKU_LANE_DENSITY_STANDARD = "standard"
        const val DANMAKU_LANE_DENSITY_DENSE = "dense"
        // v5.4: 极疏/极密
        const val DANMAKU_LANE_DENSITY_VERY_SPARSE = "very_sparse"
        const val DANMAKU_LANE_DENSITY_VERY_DENSE = "very_dense"

        const val DANMAKU_AREA_MIN = 0.10f
        const val DANMAKU_AREA_MAX = 1.00f
        const val DANMAKU_AREA_STEP = 0.10f
        const val DANMAKU_AREA_DEFAULT = DANMAKU_AREA_MAX
        const val DANMAKU_AREA_COMPAT_EPSILON = 0.0001f

        val DANMAKU_AREA_OPTIONS: List<Float> = (1..10).map { it / 10f }

        private val LEGACY_DANMAKU_AREA_OPTIONS: List<Float> =
            listOf(
                1f / 6f,
                1f / 5f,
                0.25f,
                1f / 3f,
                2f / 5f,
                0.50f,
                3f / 5f,
                2f / 3f,
                0.75f,
                4f / 5f,
                1.00f,
            )

        fun normalizeDanmakuArea(value: Float): Float {
            val v = value.takeIf { it.isFinite() } ?: DANMAKU_AREA_DEFAULT
            val clamped = v.coerceIn(DANMAKU_AREA_MIN, DANMAKU_AREA_MAX)
            val scaled = (clamped * 100f).roundToInt()
            val step = (DANMAKU_AREA_STEP * 100f).roundToInt().coerceAtLeast(1)
            val snapped = ((scaled + step / 2) / step) * step
            return (snapped / 100f).coerceIn(DANMAKU_AREA_MIN, DANMAKU_AREA_MAX)
        }

        /**
         * 0.1.22 生效，3 个版本后移除兼容：
         * 兼容历史分数档位（1/6、1/5、1/4、1/3、2/5、1/2、3/5、2/3、3/4、4/5、1），
         * 统一按新的 10% 档位四舍五入吸收到规范值。
         */
        fun normalizeLegacyDanmakuAreaCompat(value: Float): Float {
            val sanitized = value.takeIf { it.isFinite() } ?: DANMAKU_AREA_DEFAULT
            val legacy =
                LEGACY_DANMAKU_AREA_OPTIONS.firstOrNull { legacyValue ->
                    abs(legacyValue - sanitized) < DANMAKU_AREA_COMPAT_EPSILON
                }
            return normalizeDanmakuArea(legacy ?: sanitized)
        }

        fun normalizeVideoCardLongPressAction(value: String?): String {
            return when (value?.trim()) {
                VIDEO_CARD_LONG_PRESS_ACTION_WATCH_LATER -> VIDEO_CARD_LONG_PRESS_ACTION_WATCH_LATER
                VIDEO_CARD_LONG_PRESS_ACTION_OPEN_DETAIL -> VIDEO_CARD_LONG_PRESS_ACTION_OPEN_DETAIL
                VIDEO_CARD_LONG_PRESS_ACTION_OPEN_UP -> VIDEO_CARD_LONG_PRESS_ACTION_OPEN_UP
                VIDEO_CARD_LONG_PRESS_ACTION_DISMISS -> VIDEO_CARD_LONG_PRESS_ACTION_DISMISS
                VIDEO_CARD_LONG_PRESS_ACTION_SHARE -> VIDEO_CARD_LONG_PRESS_ACTION_SHARE
                VIDEO_CARD_LONG_PRESS_ACTION_COPY_LINK -> VIDEO_CARD_LONG_PRESS_ACTION_COPY_LINK
                else -> VIDEO_CARD_LONG_PRESS_ACTION_MANUAL
            }
        }

        const val DANMAKU_FONT_WEIGHT_NORMAL = "normal"
        const val DANMAKU_FONT_WEIGHT_BOLD = "bold"

        const val PLAYER_RENDER_VIEW_SURFACE_VIEW = "surface_view"
        const val PLAYER_RENDER_VIEW_TEXTURE_VIEW = "texture_view"

        const val PLAYER_ENGINE_EXO = "exoplayer"
        const val PLAYER_ENGINE_IJK = "ijkplayer"

        const val PLAYER_STYLE_FULLSCREEN = "fullscreen"
        const val PLAYER_STYLE_HD = "hd"

        const val PLAYER_AUDIO_BALANCE_OFF = "off"
        const val PLAYER_AUDIO_BALANCE_LOW = "low"
        const val PLAYER_AUDIO_BALANCE_MEDIUM = "medium"
        const val PLAYER_AUDIO_BALANCE_HIGH = "high"

        const val API_SOURCE_WEB = "web"
        const val API_SOURCE_APP = "app"

        const val PLAYER_PLAYBACK_MODE_NONE = "none"
        const val PLAYER_PLAYBACK_MODE_LOOP_ONE = "loop_one"
        const val PLAYER_PLAYBACK_MODE_EXIT = "exit"
        const val PLAYER_PLAYBACK_MODE_PAGE_LIST = "page_list"
        const val PLAYER_PLAYBACK_MODE_PARTS_LIST = "parts_list"
        const val PLAYER_PLAYBACK_MODE_PARTS_LIST_THEN_RECOMMEND = "parts_list_then_recommend"
        const val PLAYER_PLAYBACK_MODE_RECOMMEND = "recommend"
        // v7.4: 随机播放
        const val PLAYER_PLAYBACK_MODE_RANDOM = "random"

        val PLAYER_SHORT_SEEK_STEP_SECONDS_OPTIONS: Set<Int> = linkedSetOf(3, 5, 8, 10, 15, 20)
        const val PLAYER_SHORT_SEEK_STEP_SECONDS_DEFAULT = 10

        const val PLAYER_HOLD_SEEK_MODE_SPEED = "speed"
        const val PLAYER_HOLD_SEEK_MODE_SCRUB = "scrub"
        const val PLAYER_HOLD_SEEK_MODE_SCRUB_FIXED_TIME = "scrub_fixed_time"
        const val PLAYER_HOLD_SEEK_SPEED_DEFAULT = 3.0f
        val PLAYER_HOLD_SCRUB_SECONDS_OPTIONS: Set<Int> = linkedSetOf(5, 8, 10, 12, 15, 17, 20, 22, 25, 27, 30)
        const val PLAYER_HOLD_SCRUB_SECONDS_DEFAULT = 10

        const val DEFAULT_PLAYER_AUTO_SKIP_SERVER_BASE_URL = "https://bsbsb.top"
        const val FALLBACK_PLAYER_AUTO_SKIP_SERVER_BASE_URL = "http://154.222.28.109"

        const val PLAYER_VIDEOSHOT_PREVIEW_SIZE_OFF = "off"
        const val PLAYER_VIDEOSHOT_PREVIEW_SIZE_SMALL = "small"
        const val PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM = "medium"
        const val PLAYER_VIDEOSHOT_PREVIEW_SIZE_LARGE = "large"

        private const val SUBTITLE_BOTTOM_PADDING_FRACTION_DEFAULT = 0.16f
        private const val SUBTITLE_BACKGROUND_OPACITY_DEFAULT = 34f / 255f

        const val PLAYER_OSD_BTN_PREV = "prev"
        const val PLAYER_OSD_BTN_PLAY_PAUSE = "play_pause"
        const val PLAYER_OSD_BTN_NEXT = "next"
        const val PLAYER_OSD_BTN_SUBTITLE = "subtitle"
        const val PLAYER_OSD_BTN_DANMAKU = "danmaku"
        const val PLAYER_OSD_BTN_COMMENTS = "comments"
        const val PLAYER_OSD_BTN_DETAIL = "detail"
        const val PLAYER_OSD_BTN_UP = "up"
        const val PLAYER_OSD_BTN_LIKE = "like"
        const val PLAYER_OSD_BTN_COIN = "coin"
        const val PLAYER_OSD_BTN_FAV = "fav"
        const val PLAYER_OSD_BTN_LIST_PANEL = "list_panel"
        const val PLAYER_OSD_BTN_SPONSOR_SUBMIT = "sponsor_submit"
        const val PLAYER_OSD_BTN_ADVANCED = "advanced"

        val DEFAULT_PLAYER_OSD_BUTTONS: List<String> =
            listOf(
                PLAYER_OSD_BTN_PLAY_PAUSE,
                PLAYER_OSD_BTN_NEXT,
                PLAYER_OSD_BTN_SUBTITLE,
                PLAYER_OSD_BTN_DANMAKU,
                PLAYER_OSD_BTN_COMMENTS,
                PLAYER_OSD_BTN_DETAIL,
                PLAYER_OSD_BTN_SPONSOR_SUBMIT,
                PLAYER_OSD_BTN_UP,
                PLAYER_OSD_BTN_LIST_PANEL,
                PLAYER_OSD_BTN_ADVANCED,
            )

        private val PLAYER_OSD_BUTTON_KEYS: Set<String> =
            setOf(
                PLAYER_OSD_BTN_PREV,
                PLAYER_OSD_BTN_PLAY_PAUSE,
                PLAYER_OSD_BTN_NEXT,
                PLAYER_OSD_BTN_SUBTITLE,
                PLAYER_OSD_BTN_DANMAKU,
                PLAYER_OSD_BTN_COMMENTS,
                PLAYER_OSD_BTN_DETAIL,
                PLAYER_OSD_BTN_UP,
                PLAYER_OSD_BTN_LIKE,
                PLAYER_OSD_BTN_COIN,
                PLAYER_OSD_BTN_FAV,
                PLAYER_OSD_BTN_LIST_PANEL,
                PLAYER_OSD_BTN_SPONSOR_SUBMIT,
                PLAYER_OSD_BTN_ADVANCED,
            )

        const val PLAYER_DOWN_KEY_OSD_FOCUS_PREV = "prev"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE = "play_pause"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_NEXT = "next"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_SUBTITLE = "subtitle"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_DANMAKU = "danmaku"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_COMMENTS = "comments"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_DETAIL = "detail"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_UP = "up"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_LIKE = "like"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_COIN = "coin"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_FAV = "fav"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_LIST_PANEL = "list_panel"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_SPONSOR_SUBMIT = "sponsor_submit"
        const val PLAYER_DOWN_KEY_OSD_FOCUS_ADVANCED = "advanced"

        private const val PLAYER_DOWN_KEY_OSD_FOCUS_RECOMMEND_LEGACY = "recommend"
        private const val PLAYER_DOWN_KEY_OSD_FOCUS_PLAYLIST_LEGACY = "playlist"

        private fun generateBuvid(): String {
            val bytes = ByteArray(16)
            java.security.SecureRandom().nextBytes(bytes)
            val md5 = java.security.MessageDigest.getInstance("MD5").digest(bytes)
            val hex = buildString(md5.size * 2) { md5.forEach { append(String.format(java.util.Locale.US, "%02x", it)) } }
            return "XY${hex[2]}${hex[12]}${hex[22]}$hex"
        }

        private fun isValidSponsorBlockPrivateUserId(text: String): Boolean {
            val value = text.trim()
            return value.length >= 30 && value.none { it.isWhitespace() }
        }

        private fun generateSponsorBlockPrivateUserId(): String {
            val alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            val random = java.security.SecureRandom()
            return buildString(40) {
                repeat(40) {
                    append(alphabet[random.nextInt(alphabet.length)])
                }
            }
        }

        private fun isValidUuid(text: String): Boolean {
            return runCatching {
                UUID.fromString(text.trim())
                true
            }.getOrDefault(false)
        }

        fun normalizePlayerAutoSkipServerBaseUrl(raw: String?): String? {
            val value = raw?.trim()?.takeIf { it.isNotBlank() } ?: return null
            val url = value.toHttpUrlOrNull() ?: return null
            if (url.query != null || url.fragment != null) return null
            return url.toString().trimEnd('/')
        }

        fun normalizeThemePreset(value: String?): String {
            return when (value?.trim()) {
                THEME_PRESET_TV_PINK -> THEME_PRESET_TV_PINK
                THEME_PRESET_TV_PINK_ILLUSTRATION -> THEME_PRESET_TV_PINK_ILLUSTRATION
                THEME_PRESET_BLUE_DARK -> THEME_PRESET_BLUE_DARK
                THEME_PRESET_GREEN_DARK -> THEME_PRESET_GREEN_DARK
                else -> THEME_PRESET_DEFAULT
            }
        }

        fun normalizeApiSource(value: String?): String {
            return when (value?.trim()?.lowercase()) {
                API_SOURCE_APP -> API_SOURCE_APP
                else -> API_SOURCE_WEB
            }
        }
    }

    private fun deriveDeviceUuid(): String {
        val androidId =
            runCatching {
                Settings.Secure.getString(appContext.contentResolver, Settings.Secure.ANDROID_ID)
            }.getOrNull()
                ?.trim()
                ?.takeIf { it.isNotBlank() }

        if (!androidId.isNullOrBlank()) {
            val name = "blbl:device_uuid:$androidId"
            return UUID.nameUUIDFromBytes(name.toByteArray(Charsets.UTF_8)).toString()
        }

        return UUID.randomUUID().toString()
    }

        // v31-v40 KEY constants
        const val KEY_V31_DANMAKURAINBOW = "v31DanmakuRainbow"
        const val KEY_V31_VIDEOSMOOTHTRANSITION = "v31VideoSmoothTransition"
        const val KEY_V31_DANMAKUTYPEWRITER = "v31DanmakuTypewriter"
        const val KEY_V31_PLAYLISTREMEMBERORDER = "v31PlaylistRememberOrder"
        const val KEY_V31_DANMAKUBATCHCOPY = "v31DanmakuBatchCopy"
        const val KEY_V31_CASTPERFORMANCEMODE = "v31CastPerformanceMode"
        const val KEY_V31_DANMAKUSCALEEFFECT = "v31DanmakuScaleEffect"
        const val KEY_V31_DANMAKUTEMPLATEREPLY = "v31DanmakuTemplateReply"
        const val KEY_V31_CASTPOWERSAVING = "v31CastPowerSaving"
        const val KEY_V31_DANMAKUHIGHLIGHTFX = "v31DanmakuHighlightFx"
        const val KEY_V31_REMEMBERPLAYBACKPOS = "v31RememberPlaybackPos"
        const val KEY_V31_DANMAKUSENDANIMATION = "v31DanmakuSendAnimation"
        const val KEY_V31_REMEMBERPLAYBACKSKIP = "v31RememberPlaybackSkip"
        const val KEY_V31_DANMAKU3DEFFECT = "v31Danmaku3dEffect"
        const val KEY_V31_VIDEOAUTONEXT = "v31VideoAutoNext"
        const val KEY_V32_DANMAKUFONTSIZECURVE = "v32DanmakuFontSizeCurve"
        const val KEY_V32_VIDEODEBAND = "v32VideoDeband"
        const val KEY_V32_DANMAKUSHADOWDEPTH = "v32DanmakuShadowDepth"
        const val KEY_V32_VIDEOCOLORVIBRANCE = "v32VideoColorVibrance"
        const val KEY_V32_SUBTITLEBGROUNDCORNER = "v32SubtitleBgRoundCorner"
        const val KEY_V32_DANMAKUSCROLLINERTIA = "v32DanmakuScrollInertia"
        const val KEY_V32_GESTUREHAPTICFEEDBACK = "v32GestureHapticFeedback"
        const val KEY_V32_VIDEOANTIALIASING = "v32VideoAntiAliasing"
        const val KEY_V32_DANMAKUOVERLAPLIMIT = "v32DanmakuOverlapLimit"
        const val KEY_V32_SUBTITLESYNCOFFSET = "v32SubtitleSyncOffset"
        const val KEY_V32_CASTAUTORECONNECT = "v32CastAutoReconnect"
        const val KEY_V32_DANMAKUEDGESTYLE = "v32DanmakuEdgeStyle"
        const val KEY_V32_VIDEOFRAMEINTERPOLATION = "v32VideoFrameInterpolation"
        const val KEY_V32_PLAYLISTAUTOEXPAND = "v32PlaylistAutoExpand"
        const val KEY_V32_DANMAKUCOLORPALETTE = "v32DanmakuColorPalette"
        const val KEY_V33_VIDEODENOISELEVEL = "v33VideoDenoiseLevel"
        const val KEY_V33_DANMAKUFONTWEIGHTADJ = "v33DanmakuFontWeightAdj"
        const val KEY_V33_SUBTITLEAUTODETECT = "v33SubtitleAutoDetect"
        const val KEY_V33_GESTUREDOUBLETAPACTION = "v33GestureDoubleTapAction"
        const val KEY_V33_VIDEOGAMMACORRECTION = "v33VideoGammaCorrection"
        const val KEY_V33_DANMAKUMERGEWINDOW = "v33DanmakuMergeWindow"
        const val KEY_V33_CASTAUDIOSYNC = "v33CastAudioSync"
        const val KEY_V33_SUBTITLEFONTSIZESTEP = "v33SubtitleFontSizeStep"
        const val KEY_V33_VIDEOSATURATIONCURVE = "v33VideoSaturationCurve"
        const val KEY_V33_DANMAKUSPEEDADAPTIVE = "v33DanmakuSpeedAdaptive"
        const val KEY_V33_PLAYLISTLOOPCOUNT = "v33PlaylistLoopCount"
        const val KEY_V33_GESTURESWIPETHRESHOLD = "v33GestureSwipeThreshold"
        const val KEY_V33_VIDEOBRIGHTNESSCURVE = "v33VideoBrightnessCurve"
        const val KEY_V33_DANMAKUFONTITALIC = "v33DanmakuFontItalic"
        const val KEY_V33_CASTRESOLUTION = "v33CastResolution"
        const val KEY_V34_VIDEOCOLORSPACE = "v34VideoColorSpace"
        const val KEY_V34_DANMAKUANIMDURATION = "v34DanmakuAnimDuration"
        const val KEY_V34_SUBTITLEOUTLINEWIDTH = "v34SubtitleOutlineWidth"
        const val KEY_V34_GESTURELONGPRESSACTION = "v34GestureLongPressAction"
        const val KEY_V34_VIDEOPEAKBRIGHTNESS = "v34VideoPeakBrightness"
        const val KEY_V34_DANMAKUFILTERREGEX = "v34DanmakuFilterRegex"
        const val KEY_V34_CASTVIDEOCODEC = "v34CastVideoCodec"
        const val KEY_V34_SUBTITLEPOSITIONY = "v34SubtitlePositionY"
        const val KEY_V34_VIDEOCONTRASTADAPTIVE = "v34VideoContrastAdaptive"
        const val KEY_V34_DANMAKUMERGESIMILAR = "v34DanmakuMergeSimilar"
        const val KEY_V34_PLAYLISTSHUFFLESEED = "v34PlaylistShuffleSeed"
        const val KEY_V34_GESTUREPINCHACTION = "v34GesturePinchAction"
        const val KEY_V34_VIDEONOISEREDUCTION = "v34VideoNoiseReduction"
        const val KEY_V34_DANMAKUSENDCOOLDOWN = "v34DanmakuSendCooldown"
        const val KEY_V34_CASTBITRATELIMIT = "v34CastBitrateLimit"
        const val KEY_V35_VIDEOSHARPENRADIUS = "v35VideoSharpenRadius"
        const val KEY_V35_DANMAKUGLOWEFFECT = "v35DanmakuGlowEffect"
        const val KEY_V35_SUBTITLEFONTWEIGHT = "v35SubtitleFontWeight"
        const val KEY_V35_GESTUREVOLUMESENSITIVITY = "v35GestureVolumeSensitivity"
        const val KEY_V35_VIDEOHIGHLIGHTRECOVERY = "v35VideoHighlightRecovery"
        const val KEY_V35_DANMAKUPERSISTACROSSEP = "v35DanmakuPersistAcrossEp"
        const val KEY_V35_CASTSUBTITLEENABLED = "v35CastSubtitleEnabled"
        const val KEY_V35_SUBTITLESHADOWOFFSET = "v35SubtitleShadowOffset"
        const val KEY_V35_VIDEOCOLORGRADIENT = "v35VideoColorGradient"
        const val KEY_V35_DANMAKUSCROLLDIRECTION = "v35DanmakuScrollDirection"
        const val KEY_V35_PLAYLISTAUTOPLAYNEXT = "v35PlaylistAutoPlayNext"
        const val KEY_V35_GESTUREBRIGHTNESSSENSITIVITY = "v35GestureBrightnessSensitivity"
        const val KEY_V35_VIDEOBLACKLEVELADJ = "v35VideoBlackLevelAdj"
        const val KEY_V35_DANMAKUBORDERCOLOR = "v35DanmakuBorderColor"
        const val KEY_V35_CASTAUDIODELAY = "v35CastAudioDelay"
        const val KEY_V36_VIDEOWHITEBALANCE = "v36VideoWhiteBalance"
        const val KEY_V36_DANMAKUFONTSTRETCH = "v36DanmakuFontStretch"
        const val KEY_V36_SUBTITLEENCODING = "v36SubtitleEncoding"
        const val KEY_V36_GESTURESEEKSTEP = "v36GestureSeekStep"
        const val KEY_V36_VIDEOCOLORTINT = "v36VideoColorTint"
        const val KEY_V36_DANMAKUFADEIN = "v36DanmakuFadeIn"
        const val KEY_V36_CASTSCREENMIRROR = "v36CastScreenMirror"
        const val KEY_V36_SUBTITLELINESPACING = "v36SubtitleLineSpacing"
        const val KEY_V36_VIDEOGAMMATONEMAP = "v36VideoGammaToneMap"
        const val KEY_V36_DANMAKUHISTORYDEPTH = "v36DanmakuHistoryDepth"
        const val KEY_V36_PLAYLISTRESUMELAST = "v36PlaylistResumeLast"
        const val KEY_V36_GESTUREDOUBLESWIPEACTION = "v36GestureDoubleSwipeAction"
        const val KEY_V36_VIDEOCONTRASTRATIO = "v36VideoContrastRatio"
        const val KEY_V36_DANMAKUSPEEDMULTIPLIER = "v36DanmakuSpeedMultiplier"
        const val KEY_V36_CASTAUTOQUALITY = "v36CastAutoQuality"
        const val KEY_V37_VIDEODYNAMICRANGE = "v37VideoDynamicRange"
        const val KEY_V37_DANMAKUBLENDMODE = "v37DanmakuBlendMode"
        const val KEY_V37_SUBTITLEKARAOKEMODE = "v37SubtitleKaraokeMode"
        const val KEY_V37_GESTUREROTATEACTION = "v37GestureRotateAction"
        const val KEY_V37_VIDEOCOLORDEPTH = "v37VideoColorDepth"
        const val KEY_V37_DANMAKUPREVIEWMODE = "v37DanmakuPreviewMode"
        const val KEY_V37_CASTAUDIOCHANNEL = "v37CastAudioChannel"
        const val KEY_V37_SUBTITLEFONTSIZEAUTO = "v37SubtitleFontSizeAuto"
        const val KEY_V37_VIDEOEDGEENHANCE = "v37VideoEdgeEnhance"
        const val KEY_V37_DANMAKUSENDFONT = "v37DanmakuSendFont"
        const val KEY_V37_PLAYLISTREPEATMODE = "v37PlaylistRepeatMode"
        const val KEY_V37_GESTURETRIPLETAPACTION = "v37GestureTripleTapAction"
        const val KEY_V37_VIDEOCOLORCURVE = "v37VideoColorCurve"
        const val KEY_V37_DANMAKUSHADOWCOLOR = "v37DanmakuShadowColor"
        const val KEY_V37_CASTKEEPALIVE = "v37CastKeepAlive"
        const val KEY_V38_VIDEOCHROMAUPSAMPLING = "v38VideoChromaUpsampling"
        const val KEY_V38_DANMAKUPRESETSLOTS = "v38DanmakuPresetSlots"
        const val KEY_V38_SUBTITLEBGBLUR = "v38SubtitleBgBlur"
        const val KEY_V38_GESTUREEDGEZONEWIDTH = "v38GestureEdgeZoneWidth"
        const val KEY_V38_VIDEODEINTERLACE = "v38VideoDeinterlace"
        const val KEY_V38_DANMAKUKEYBOARDSEND = "v38DanmakuKeyboardSend"
        const val KEY_V38_CASTVIDEOHDR = "v38CastVideoHDR"
        const val KEY_V38_SUBTITLEFONTOUTLINE = "v38SubtitleFontOutline"
        const val KEY_V38_VIDEOBANDINGFIX = "v38VideoBandingFix"
        const val KEY_V38_DANMAKULANECOUNT = "v38DanmakuLaneCount"
        const val KEY_V38_PLAYLISTSMARTSORT = "v38PlaylistSmartSort"
        const val KEY_V38_GESTUREDEADZONE = "v38GestureDeadZone"
        const val KEY_V38_VIDEOOVERSCAN = "v38VideoOverscan"
        const val KEY_V38_DANMAKUMERGETHRESHOLD = "v38DanmakuMergeThreshold"
        const val KEY_V38_CASTVOLUMECONTROL = "v38CastVolumeControl"
        const val KEY_V39_VIDEOTEMPORALDENOISE = "v39VideoTemporalDenoise"
        const val KEY_V39_DANMAKUFONTFAMILY = "v39DanmakuFontFamily"
        const val KEY_V39_SUBTITLEBGCOLOR = "v39SubtitleBgColor"
        const val KEY_V39_GESTURESCROLLACTION = "v39GestureScrollAction"
        const val KEY_V39_VIDEOADAPTIVESHARPEN = "v39VideoAdaptiveSharpen"
        const val KEY_V39_DANMAKUSENDPRIVILEGE = "v39DanmakuSendPrivilege"
        const val KEY_V39_CASTSUBTITLES = "v39CastSubtitles"
        const val KEY_V39_SUBTITLEBGPADDING = "v39SubtitleBgPadding"
        const val KEY_V39_VIDEOCOLORTEMPERATUREFINE = "v39VideoColorTemperatureFine"
        const val KEY_V39_DANMAKUMAXPERSCREEN = "v39DanmakuMaxPerScreen"
        const val KEY_V39_PLAYLISTLOADRELATED = "v39PlaylistLoadRelated"
        const val KEY_V39_VIDEOSMOOTHINGLEVEL = "v39VideoSmoothingLevel"
        const val KEY_V39_DANMAKUSENDERLEVELICON = "v39DanmakuSenderLevelIcon"
        const val KEY_V39_SUBTITLEAUTOTRANSLATE = "v39SubtitleAutoTranslate"
        const val KEY_V39_CASTAUDIOQUALITY = "v39CastAudioQuality"
        const val KEY_V40_VIDEOSPATIALDENOISE = "v40VideoSpatialDenoise"
        const val KEY_V40_DANMAKUPREVIEWSIZE = "v40DanmakuPreviewSize"
        const val KEY_V40_SUBTITLESTROKECOLOR = "v40SubtitleStrokeColor"
        const val KEY_V40_GESTUREINVERTSCROLL = "v40GestureInvertScroll"
        const val KEY_V40_VIDEOMOTIONBLUR = "v40VideoMotionBlur"
        const val KEY_V40_DANMAKUREPORTENABLED = "v40DanmakuReportEnabled"
        const val KEY_V40_CASTAUTOPAUSE = "v40CastAutoPause"
        const val KEY_V40_SUBTITLESTROKEWIDTH = "v40SubtitleStrokeWidth"
        const val KEY_V40_VIDEODETAILENHANCE = "v40VideoDetailEnhance"
        const val KEY_V40_DANMAKUBLOCKLEVEL = "v40DanmakuBlockLevel"
        const val KEY_V40_PLAYLISTNEXTEPISODE = "v40PlaylistNextEpisode"
        const val KEY_V40_GESTURECUSTOMMAPPING = "v40GestureCustomMapping"
        const val KEY_V40_VIDEOCOLORBOOST = "v40VideoColorBoost"
        const val KEY_V40_DANMAKUFONTSIZEOVERRIDE = "v40DanmakuFontSizeOverride"
        const val KEY_V40_CASTAUDIONORMALIZATION = "v40CastAudioNormalization"

}
