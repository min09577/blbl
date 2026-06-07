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
    // v27.14: 视频画面降噪强度
    var v27DenoiseStrength: Int
        get() = prefs.getInt(KEY_V27_DENOISE_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V27_DENOISE_STRENGTH, value.coerceIn(0, 100)).apply()

    // v27.15: 弹幕显示字体间距
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
    // v29.8: 视频画面色彩色温
    var v29ColorTemperature: Int
        get() = prefs.getInt(KEY_V29_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V29_COLOR_TEMPERATURE, value.coerceIn(-50, 50)).apply()
    
    // v29.9: 弹幕发送历史记录导出
    var v29HistoryExport: Boolean
        get() = prefs.getBoolean(KEY_V29_HISTORY_EXPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V29_HISTORY_EXPORT, value).apply()
    
    // v29.10: 播放器进度条样式
    // v29.11: 视频投射画面质量
    // v29.12: 弹幕字体背景透明度
    var v29DanmakuBackgroundOpacity: Int
        get() = prefs.getInt(KEY_V29_DANMAKU_BACKGROUND_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V29_DANMAKU_BACKGROUND_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v29.13: 播放器手势长按功能
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
    // v30.11: 视频投射画面延迟
    var v30CastLatency: Int
        get() = prefs.getInt(KEY_V30_CAST_LATENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V30_CAST_LATENCY, value.coerceIn(0, 500)).apply()
    
    // v30.12: 弹幕字体背景阴影
    var v30DanmakuBackgroundShadow: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_BACKGROUND_SHADOW, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_BACKGROUND_SHADOW, value.coerceIn(0, 100)).apply()
    
    // v30.13: 播放器手势滑动功能
    // v30.14: 视频画面色彩模糊
    var v30ColorBlur: Int
        get() = prefs.getInt(KEY_V30_COLOR_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V30_COLOR_BLUR, value.coerceIn(0, 100)).apply()
    
    // v30.15: 弹幕显示字体发光
    var v30DanmakuFontGlow: Int
        get() = prefs.getInt(KEY_V30_DANMAKU_FONT_GLOW, 0)
        set(value) = prefs.edit().putInt(KEY_V30_DANMAKU_FONT_GLOW, value.coerceIn(0, 100)).apply()
    // v31.1: 弹幕重叠自动合并
    var v31DanmakuMergeOverlap: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKU_MERGE_OVERLAP, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_DANMAKU_MERGE_OVERLAP, value).apply()
    // v31.2: 静音片段自动跳过
    var v31VideoFrameSkipSilence: Boolean
        get() = prefs.getBoolean(KEY_V31_VIDEO_FRAME_SKIP_SILENCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_VIDEO_FRAME_SKIP_SILENCE, value).apply()
    // v31.3: 字幕字号自动适配
    var v31SubtitleFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V31_SUBTITLE_FONT_SIZE_AUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_SUBTITLE_FONT_SIZE_AUTO, value).apply()
    // v31.4: 预缓冲时长(秒)
    var v31PlaybackBufferAheadSec: Int
        get() = prefs.getInt(KEY_V31_PLAYBACK_BUFFER_AHEAD_SEC, 0)
        set(value) = prefs.edit().putInt(KEY_V31_PLAYBACK_BUFFER_AHEAD_SEC, value).apply()
    // v31.5: 弹幕防刷等级
    var v31DanmakuAntiSpamLevel: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_ANTI_SPAM_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_ANTI_SPAM_LEVEL, value).apply()
    // v31.6: 视频反交错模式
    var v31VideoDeinterlaceMode: Int
        get() = prefs.getInt(KEY_V31_VIDEO_DEINTERLACE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_VIDEO_DEINTERLACE_MODE, value).apply()
    // v31.7: 音频夜间模式
    var v31AudioNightMode: Boolean
        get() = prefs.getBoolean(KEY_V31_AUDIO_NIGHT_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_AUDIO_NIGHT_MODE, value).apply()
    // v31.8: 弹幕关键词高亮
    var v31DanmakuKeywordHighlight: Boolean
        get() = prefs.getBoolean(KEY_V31_DANMAKU_KEYWORD_HIGHLIGHT, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_DANMAKU_KEYWORD_HIGHLIGHT, value).apply()
    // v31.9: 画中画模式支持
    var v31PlayerPiPSupport: Boolean
        get() = prefs.getBoolean(KEY_V31_PLAYER_PI_P_SUPPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_PLAYER_PI_P_SUPPORT, value).apply()
    // v31.10: A-B循环播放
    var v31VideoABoopMode: Boolean
        get() = prefs.getBoolean(KEY_V31_VIDEO_A_BOOP_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_VIDEO_A_BOOP_MODE, value).apply()
    // v31.11: 弹幕层级排序
    var v31DanmakuLayerOrder: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_LAYER_ORDER, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_LAYER_ORDER, value).apply()
    // v31.12: 字幕同步偏移(ms)
    var v31SubtitleSyncOffset: Int
        get() = prefs.getInt(KEY_V31_SUBTITLE_SYNC_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V31_SUBTITLE_SYNC_OFFSET, value).apply()
    // v31.13: 播放自动恢复
    var v31PlaybackAutoResume: Boolean
        get() = prefs.getBoolean(KEY_V31_PLAYBACK_AUTO_RESUME, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_PLAYBACK_AUTO_RESUME, value).apply()
    // v31.14: 弹幕屏蔽用户等级
    var v31DanmakuBlockUserLevel: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_BLOCK_USER_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_BLOCK_USER_LEVEL, value).apply()
    // v31.15: 视频解码优先级
    var v31VideoCodecPriority: Int
        get() = prefs.getInt(KEY_V31_VIDEO_CODEC_PRIORITY, 0)
        set(value) = prefs.edit().putInt(KEY_V31_VIDEO_CODEC_PRIORITY, value).apply()
    // v32.1: 息屏定时器(分钟)
    var v32ScreenOffTimer: Int
        get() = prefs.getInt(KEY_V32_SCREEN_OFF_TIMER, 0)
        set(value) = prefs.edit().putInt(KEY_V32_SCREEN_OFF_TIMER, value).apply()
    // v32.2: 弹幕雨模式
    var v32DanmakuRainMode: Boolean
        get() = prefs.getBoolean(KEY_V32_DANMAKU_RAIN_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_DANMAKU_RAIN_MODE, value).apply()
    // v32.3: 音频声道交换
    var v32AudioChannelSwap: Boolean
        get() = prefs.getBoolean(KEY_V32_AUDIO_CHANNEL_SWAP, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_AUDIO_CHANNEL_SWAP, value).apply()
    // v32.4: 视频缩放手势
    var v32VideoZoomGesture: Boolean
        get() = prefs.getBoolean(KEY_V32_VIDEO_ZOOM_GESTURE, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_VIDEO_ZOOM_GESTURE, value).apply()
    // v32.5: 弹幕时间戳显示
    var v32DanmakuTimestampDisplay: Boolean
        get() = prefs.getBoolean(KEY_V32_DANMAKU_TIMESTAMP_DISPLAY, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_DANMAKU_TIMESTAMP_DISPLAY, value).apply()
    // v32.6: 自动移除已播放项
    var v32PlaylistRemovePlayed: Boolean
        get() = prefs.getBoolean(KEY_V32_PLAYLIST_REMOVE_PLAYED, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_PLAYLIST_REMOVE_PLAYED, value).apply()
    // v32.7: 后台播放
    var v32PlayerBackgroundPlay: Boolean
        get() = prefs.getBoolean(KEY_V32_PLAYER_BACKGROUND_PLAY, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_PLAYER_BACKGROUND_PLAY, value).apply()
    // v32.8: 双语字幕
    var v32SubtitleDualLang: Boolean
        get() = prefs.getBoolean(KEY_V32_SUBTITLE_DUAL_LANG, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_SUBTITLE_DUAL_LANG, value).apply()
    // v32.9: 弹幕透明度渐隐
    var v32DanmakuOpacityFade: Boolean
        get() = prefs.getBoolean(KEY_V32_DANMAKU_OPACITY_FADE, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_DANMAKU_OPACITY_FADE, value).apply()
    // v32.10: 变速平滑过渡
    var v32VideoSpeedRampMode: Boolean
        get() = prefs.getBoolean(KEY_V32_VIDEO_SPEED_RAMP_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_VIDEO_SPEED_RAMP_MODE, value).apply()
    // v32.11: 音频虚拟环绕声
    var v32AudioVirtualSurround: Boolean
        get() = prefs.getBoolean(KEY_V32_AUDIO_VIRTUAL_SURROUND, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_AUDIO_VIRTUAL_SURROUND, value).apply()
    // v32.12: 弹幕气泡样式
    var v32DanmakuBubbleStyle: Boolean
        get() = prefs.getBoolean(KEY_V32_DANMAKU_BUBBLE_STYLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_DANMAKU_BUBBLE_STYLE, value).apply()
    // v32.13: 播放器锁定超时(秒)
    var v32PlayerLockTimeout: Int
        get() = prefs.getInt(KEY_V32_PLAYER_LOCK_TIMEOUT, 0)
        set(value) = prefs.edit().putInt(KEY_V32_PLAYER_LOCK_TIMEOUT, value).apply()
    // v32.14: 视频裁剪预设
    var v32VideoCropPreset: Int
        get() = prefs.getInt(KEY_V32_VIDEO_CROP_PRESET, 0)
        set(value) = prefs.edit().putInt(KEY_V32_VIDEO_CROP_PRESET, value).apply()
    // v32.15: 弹幕表情过滤
    var v32DanmakuEmojiFilter: Boolean
        get() = prefs.getBoolean(KEY_V32_DANMAKU_EMOJI_FILTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_DANMAKU_EMOJI_FILTER, value).apply()
    // v33.1: 低音增强
    var v33AudioBassBoost: Int
        get() = prefs.getInt(KEY_V33_AUDIO_BASS_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V33_AUDIO_BASS_BOOST, value).apply()
    // v33.2: 弹幕滚动方向
    var v33DanmakuScrollDirection: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_SCROLL_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_SCROLL_DIRECTION, value).apply()
    // v33.3: 缩略图时间点(秒)
    var v33VideoThumbnailTimeSec: Int
        get() = prefs.getInt(KEY_V33_VIDEO_THUMBNAIL_TIME_SEC, 0)
        set(value) = prefs.edit().putInt(KEY_V33_VIDEO_THUMBNAIL_TIME_SEC, value).apply()
    // v33.4: 双击快进秒数
    var v33PlayerDoubleTapSeekSec: Int
        get() = prefs.getInt(KEY_V33_PLAYER_DOUBLE_TAP_SEEK_SEC, 0)
        set(value) = prefs.edit().putInt(KEY_V33_PLAYER_DOUBLE_TAP_SEEK_SEC, value).apply()
    // v33.5: 弹幕行数限制
    var v33DanmakuLineNumber: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_LINE_NUMBER, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_LINE_NUMBER, value).apply()
    // v33.6: 字幕描边宽度
    var v33SubtitleBorderWidth: Int
        get() = prefs.getInt(KEY_V33_SUBTITLE_BORDER_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V33_SUBTITLE_BORDER_WIDTH, value).apply()
    // v33.7: HDR色调映射
    var v33VideoHdrToneMap: Int
        get() = prefs.getInt(KEY_V33_VIDEO_HDR_TONE_MAP, 0)
        set(value) = prefs.edit().putInt(KEY_V33_VIDEO_HDR_TONE_MAP, value).apply()
    // v33.8: 跳过片头秒数
    var v33PlaybackSkipIntroSec: Int
        get() = prefs.getInt(KEY_V33_PLAYBACK_SKIP_INTRO_SEC, 0)
        set(value) = prefs.edit().putInt(KEY_V33_PLAYBACK_SKIP_INTRO_SEC, value).apply()
    // v33.9: 弹幕自定义字体路径
    var v33DanmakuCustomFontPath: Boolean
        get() = prefs.getBoolean(KEY_V33_DANMAKU_CUSTOM_FONT_PATH, false)
        set(value) = prefs.edit().putBoolean(KEY_V33_DANMAKU_CUSTOM_FONT_PATH, value).apply()
    // v33.10: 音频增益(dB)
    var v33AudioGainDb: Int
        get() = prefs.getInt(KEY_V33_AUDIO_GAIN_DB, 0)
        set(value) = prefs.edit().putInt(KEY_V33_AUDIO_GAIN_DB, value).apply()
    // v33.11: 进度条章节标记
    var v33PlayerSeekBarChapter: Boolean
        get() = prefs.getBoolean(KEY_V33_PLAYER_SEEK_BAR_CHAPTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V33_PLAYER_SEEK_BAR_CHAPTER, value).apply()
    // v33.12: 视频旋转锁定
    var v33VideoRotationLock: Boolean
        get() = prefs.getBoolean(KEY_V33_VIDEO_ROTATION_LOCK, false)
        set(value) = prefs.edit().putBoolean(KEY_V33_VIDEO_ROTATION_LOCK, value).apply()
    // v33.13: 弹幕重复过滤
    var v33DanmakuRepeatFilter: Boolean
        get() = prefs.getBoolean(KEY_V33_DANMAKU_REPEAT_FILTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V33_DANMAKU_REPEAT_FILTER, value).apply()
    // v33.14: 字幕阴影偏移
    var v33SubtitleShadowOffset: Int
        get() = prefs.getInt(KEY_V33_SUBTITLE_SHADOW_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V33_SUBTITLE_SHADOW_OFFSET, value).apply()
    // v33.15: 播放列表倒序
    var v33PlaylistReverseOrder: Boolean
        get() = prefs.getBoolean(KEY_V33_PLAYLIST_REVERSE_ORDER, false)
        set(value) = prefs.edit().putBoolean(KEY_V33_PLAYLIST_REVERSE_ORDER, value).apply()
    // v34.1: 弹幕最大显示时长(秒)
    var v34DanmakuMaxDisplaySec: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_MAX_DISPLAY_SEC, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_MAX_DISPLAY_SEC, value).apply()
    // v34.2: 亮度自动感应
    var v34VideoBrightnessSensor: Boolean
        get() = prefs.getBoolean(KEY_V34_VIDEO_BRIGHTNESS_SENSOR, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_VIDEO_BRIGHTNESS_SENSOR, value).apply()
    // v34.3: 音频压缩阈值
    var v34AudioCompressorThreshold: Int
        get() = prefs.getInt(KEY_V34_AUDIO_COMPRESSOR_THRESHOLD, 0)
        set(value) = prefs.edit().putInt(KEY_V34_AUDIO_COMPRESSOR_THRESHOLD, value).apply()
    // v34.4: 自定义手势映射
    var v34PlayerGestureCustomMap: Boolean
        get() = prefs.getBoolean(KEY_V34_PLAYER_GESTURE_CUSTOM_MAP, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_PLAYER_GESTURE_CUSTOM_MAP, value).apply()
    // v34.5: 弹幕正则屏蔽
    var v34DanmakuShieldRegex: Boolean
        get() = prefs.getBoolean(KEY_V34_DANMAKU_SHIELD_REGEX, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_DANMAKU_SHIELD_REGEX, value).apply()
    // v34.6: 字幕卡拉OK模式
    var v34SubtitleKaraokeMode: Boolean
        get() = prefs.getBoolean(KEY_V34_SUBTITLE_KARAOKE_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_SUBTITLE_KARAOKE_MODE, value).apply()
    // v34.7: 扫描线滤镜
    var v34VideoScanLineFilter: Boolean
        get() = prefs.getBoolean(KEY_V34_VIDEO_SCAN_LINE_FILTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_VIDEO_SCAN_LINE_FILTER, value).apply()
    // v34.8: 耳机断开自动暂停
    var v34PlaybackAutoPauseOnHeadset: Boolean
        get() = prefs.getBoolean(KEY_V34_PLAYBACK_AUTO_PAUSE_ON_HEADSET, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_PLAYBACK_AUTO_PAUSE_ON_HEADSET, value).apply()
    // v34.9: 弹幕镜像翻转
    var v34DanmakuMirrorFlip: Boolean
        get() = prefs.getBoolean(KEY_V34_DANMAKU_MIRROR_FLIP, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_DANMAKU_MIRROR_FLIP, value).apply()
    // v34.10: 均衡器预设
    var v34AudioEqPreset: Int
        get() = prefs.getInt(KEY_V34_AUDIO_EQ_PRESET, 0)
        set(value) = prefs.edit().putInt(KEY_V34_AUDIO_EQ_PRESET, value).apply()
    // v34.11: 播放器音量增强
    var v34PlayerVolumeBoost: Boolean
        get() = prefs.getBoolean(KEY_V34_PLAYER_VOLUME_BOOST, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_PLAYER_VOLUME_BOOST, value).apply()
    // v34.12: 像素风格模式
    var v34VideoPixelArtMode: Boolean
        get() = prefs.getBoolean(KEY_V34_VIDEO_PIXEL_ART_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_VIDEO_PIXEL_ART_MODE, value).apply()
    // v34.13: 弹幕最小字号
    var v34DanmakuFontSizeMin: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_FONT_SIZE_MIN, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_FONT_SIZE_MIN, value).apply()
    // v34.14: 字幕自定义颜色
    var v34SubtitleTextColorCustom: Boolean
        get() = prefs.getBoolean(KEY_V34_SUBTITLE_TEXT_COLOR_CUSTOM, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_SUBTITLE_TEXT_COLOR_CUSTOM, value).apply()
    // v34.15: 单曲循环模式
    var v34PlaylistRepeatSingle: Boolean
        get() = prefs.getBoolean(KEY_V34_PLAYLIST_REPEAT_SINGLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V34_PLAYLIST_REPEAT_SINGLE, value).apply()
    // v35.1: 帧率覆盖
    var v35VideoFrameRateOverride: Int
        get() = prefs.getInt(KEY_V35_VIDEO_FRAME_RATE_OVERRIDE, 0)
        set(value) = prefs.edit().putInt(KEY_V35_VIDEO_FRAME_RATE_OVERRIDE, value).apply()
    // v35.2: 弹幕发送者头像
    var v35DanmakuSenderAvatar: Boolean
        get() = prefs.getBoolean(KEY_V35_DANMAKU_SENDER_AVATAR, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_DANMAKU_SENDER_AVATAR, value).apply()
    // v35.3: 空间音频宽度
    var v35AudioSpatialWidth: Int
        get() = prefs.getInt(KEY_V35_AUDIO_SPATIAL_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V35_AUDIO_SPATIAL_WIDTH, value).apply()
    // v35.4: 横屏自动全屏
    var v35PlayerAutoFullscreenLandscape: Boolean
        get() = prefs.getBoolean(KEY_V35_PLAYER_AUTO_FULLSCREEN_LANDSCAPE, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_PLAYER_AUTO_FULLSCREEN_LANDSCAPE, value).apply()
    // v35.5: 弹幕拼音转换
    var v35DanmakuPinyinConvert: Boolean
        get() = prefs.getBoolean(KEY_V35_DANMAKU_PINYIN_CONVERT, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_DANMAKU_PINYIN_CONVERT, value).apply()
    // v35.6: 字幕顶部显示
    var v35SubtitlePositionTop: Boolean
        get() = prefs.getBoolean(KEY_V35_SUBTITLE_POSITION_TOP, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_SUBTITLE_POSITION_TOP, value).apply()
    // v35.7: 暗角效果强度
    var v35VideoVignetteEffect: Int
        get() = prefs.getInt(KEY_V35_VIDEO_VIGNETTE_EFFECT, 0)
        set(value) = prefs.edit().putInt(KEY_V35_VIDEO_VIGNETTE_EFFECT, value).apply()
    // v35.8: 仅WiFi预加载
    var v35PlaybackPreloadOnWifi: Boolean
        get() = prefs.getBoolean(KEY_V35_PLAYBACK_PRELOAD_ON_WIFI, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_PLAYBACK_PRELOAD_ON_WIFI, value).apply()
    // v35.9: 弹幕渐变色
    var v35DanmakuGradientColor: Boolean
        get() = prefs.getBoolean(KEY_V35_DANMAKU_GRADIENT_COLOR, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_DANMAKU_GRADIENT_COLOR, value).apply()
    // v35.10: 音频响度标准化
    var v35AudioLoudnessNormalize: Boolean
        get() = prefs.getBoolean(KEY_V35_AUDIO_LOUDNESS_NORMALIZE, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_AUDIO_LOUDNESS_NORMALIZE, value).apply()
    // v35.11: 小窗播放
    var v35PlayerMiniWindow: Boolean
        get() = prefs.getBoolean(KEY_V35_PLAYER_MINI_WINDOW, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_PLAYER_MINI_WINDOW, value).apply()
    // v35.12: 视频降噪强度
    var v35VideoNoiseReduction: Int
        get() = prefs.getInt(KEY_V35_VIDEO_NOISE_REDUCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V35_VIDEO_NOISE_REDUCTION, value).apply()
    // v35.13: 弹幕动画速度
    var v35DanmakuAnimationSpeed: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_ANIMATION_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_ANIMATION_SPEED, value).apply()
    // v35.14: 字幕行间距
    var v35SubtitleLineSpacing: Int
        get() = prefs.getInt(KEY_V35_SUBTITLE_LINE_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V35_SUBTITLE_LINE_SPACING, value).apply()
    // v35.15: 智能随机播放
    var v35PlaylistSmartShuffle: Boolean
        get() = prefs.getBoolean(KEY_V35_PLAYLIST_SMART_SHUFFLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_PLAYLIST_SMART_SHUFFLE, value).apply()
    // v36.1: 画面适配模式
    var v36VideoAspectFitMode: Int
        get() = prefs.getInt(KEY_V36_VIDEO_ASPECT_FIT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_VIDEO_ASPECT_FIT_MODE, value).apply()
    // v36.2: 弹幕类型透明度
    var v36DanmakuOpacityPerType: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_OPACITY_PER_TYPE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_OPACITY_PER_TYPE, value).apply()
    // v36.3: 人声隔离
    var v36AudioVoiceIsolate: Boolean
        get() = prefs.getBoolean(KEY_V36_AUDIO_VOICE_ISOLATE, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_AUDIO_VOICE_ISOLATE, value).apply()
    // v36.4: 跳过片尾秒数
    var v36PlayerSkipOutroSec: Int
        get() = prefs.getInt(KEY_V36_PLAYER_SKIP_OUTRO_SEC, 0)
        set(value) = prefs.edit().putInt(KEY_V36_PLAYER_SKIP_OUTRO_SEC, value).apply()
    // v36.5: 弹幕自动缩放
    var v36DanmakuAutoScale: Boolean
        get() = prefs.getBoolean(KEY_V36_DANMAKU_AUTO_SCALE, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_DANMAKU_AUTO_SCALE, value).apply()
    // v36.6: 字幕边缘模糊
    var v36SubtitleEdgeBlur: Int
        get() = prefs.getInt(KEY_V36_SUBTITLE_EDGE_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_SUBTITLE_EDGE_BLUR, value).apply()
    // v36.7: 色彩LUT预设
    var v36VideoColorLutPreset: Int
        get() = prefs.getInt(KEY_V36_VIDEO_COLOR_LUT_PRESET, 0)
        set(value) = prefs.edit().putInt(KEY_V36_VIDEO_COLOR_LUT_PRESET, value).apply()
    // v36.8: 变速音调修正
    var v36PlaybackSpeedPitchCorrect: Boolean
        get() = prefs.getBoolean(KEY_V36_PLAYBACK_SPEED_PITCH_CORRECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_PLAYBACK_SPEED_PITCH_CORRECT, value).apply()
    // v36.9: 弹幕长度上限
    var v36DanmakuBlockLength: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_BLOCK_LENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_BLOCK_LENGTH, value).apply()
    // v36.10: 音频延迟(ms)
    var v36AudioDelayMs: Int
        get() = prefs.getInt(KEY_V36_AUDIO_DELAY_MS, 0)
        set(value) = prefs.edit().putInt(KEY_V36_AUDIO_DELAY_MS, value).apply()
    // v36.11: 滑动亮度曲线
    var v36PlayerSwipeBrightnessCurve: Int
        get() = prefs.getInt(KEY_V36_PLAYER_SWIPE_BRIGHTNESS_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_PLAYER_SWIPE_BRIGHTNESS_CURVE, value).apply()
    // v36.12: 边缘锐化模式
    var v36VideoSharpenEdgeMode: Int
        get() = prefs.getInt(KEY_V36_VIDEO_SHARPEN_EDGE_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_VIDEO_SHARPEN_EDGE_MODE, value).apply()
    // v36.13: 弹幕粉丝徽章
    var v36DanmakuFanBadge: Boolean
        get() = prefs.getBoolean(KEY_V36_DANMAKU_FAN_BADGE, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_DANMAKU_FAN_BADGE, value).apply()
    // v36.14: 字幕字重
    var v36SubtitleFontWeightCustom: Int
        get() = prefs.getInt(KEY_V36_SUBTITLE_FONT_WEIGHT_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V36_SUBTITLE_FONT_WEIGHT_CUSTOM, value).apply()
    // v36.15: 自动播放下一集
    var v36PlaylistAutoplayNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V36_PLAYLIST_AUTOPLAY_NEXT_EPISODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_PLAYLIST_AUTOPLAY_NEXT_EPISODE, value).apply()
    // v37.1: 黑边自动检测
    var v37VideoBlackBarDetect: Boolean
        get() = prefs.getBoolean(KEY_V37_VIDEO_BLACK_BAR_DETECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_VIDEO_BLACK_BAR_DETECT, value).apply()
    // v37.2: 弹幕分组合并
    var v37DanmakuGroupMerge: Boolean
        get() = prefs.getBoolean(KEY_V37_DANMAKU_GROUP_MERGE, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_DANMAKU_GROUP_MERGE, value).apply()
    // v37.3: 立体声宽度
    var v37AudioStereoWidth: Int
        get() = prefs.getInt(KEY_V37_AUDIO_STEREO_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V37_AUDIO_STEREO_WIDTH, value).apply()
    // v37.4: 恢复播放阈值(秒)
    var v37PlayerResumeThreshold: Int
        get() = prefs.getInt(KEY_V37_PLAYER_RESUME_THRESHOLD, 0)
        set(value) = prefs.edit().putInt(KEY_V37_PLAYER_RESUME_THRESHOLD, value).apply()
    // v37.5: 弹幕注音显示
    var v37DanmakuFuriganaShow: Boolean
        get() = prefs.getBoolean(KEY_V37_DANMAKU_FURIGANA_SHOW, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_DANMAKU_FURIGANA_SHOW, value).apply()
    // v37.6: 字幕外框颜色
    var v37SubtitleOutlineColor: Boolean
        get() = prefs.getBoolean(KEY_V37_SUBTITLE_OUTLINE_COLOR, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_SUBTITLE_OUTLINE_COLOR, value).apply()
    // v37.7: 帧率计数器
    var v37VideoFpsCounter: Boolean
        get() = prefs.getBoolean(KEY_V37_VIDEO_FPS_COUNTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_VIDEO_FPS_COUNTER, value).apply()
    // v37.8: 缓冲策略
    var v37PlaybackBufferStrategy: Int
        get() = prefs.getInt(KEY_V37_PLAYBACK_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V37_PLAYBACK_BUFFER_STRATEGY, value).apply()
    // v37.9: 弹幕等级屏蔽
    var v37DanmakuLevelShield: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_LEVEL_SHIELD, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_LEVEL_SHIELD, value).apply()
    // v37.10: 混响预设
    var v37AudioReverbPreset: Int
        get() = prefs.getInt(KEY_V37_AUDIO_REVERB_PRESET, 0)
        set(value) = prefs.edit().putInt(KEY_V37_AUDIO_REVERB_PRESET, value).apply()
    // v37.11: 长按倍速值
    var v37PlayerLongPressSpeed: Int
        get() = prefs.getInt(KEY_V37_PLAYER_LONG_PRESS_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V37_PLAYER_LONG_PRESS_SPEED, value).apply()
    // v37.12: 插帧模式
    var v37VideoInterpolationMode: Int
        get() = prefs.getInt(KEY_V37_VIDEO_INTERPOLATION_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V37_VIDEO_INTERPOLATION_MODE, value).apply()







































































































    // ===== v40.x =====

    // ===== v39.x =====

    // ===== v38.x =====

    // ===== v37.x =====

    // ===== v36.x =====

    // ===== v35.x =====

    // ===== v34.x =====

    // ===== v33.x =====

    // ===== v32.x =====

    // ===== v31.x =====
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    // ===== v150.x =====


    // v13.10: 暗角效果
    var vignetteIntensity: Int
        get() = prefs.getInt(KEY_VIGNETTE_INTENSITY, 0)
        set(value) = prefs.edit().putInt(KEY_VIGNETTE_INTENSITY, value.coerceIn(0, 100)).apply()

    // v13.10: 自定义文字水印
    var customWatermarkText: String
        get() = prefs.getString(KEY_CUSTOM_WATERMARK_TEXT, "").orEmpty()
        set(value) = prefs.edit().putString(KEY_CUSTOM_WATERMARK_TEXT, value).apply()
    var customWatermarkColor: Int
        get() = prefs.getInt(KEY_CUSTOM_WATERMARK_COLOR, 0xFFFFFFFF.toInt())
        set(value) = prefs.edit().putInt(KEY_CUSTOM_WATERMARK_COLOR, value).apply()
    var customWatermarkSize: Int
        get() = prefs.getInt(KEY_CUSTOM_WATERMARK_SIZE, 16)
        set(value) = prefs.edit().putInt(KEY_CUSTOM_WATERMARK_SIZE, value.coerceIn(10, 32)).apply()

    // v13.11: 弹幕历史记录
    var danmakuHistory: List<String>
        get() {
            val raw = prefs.getString(KEY_DANMAKU_HISTORY, "").orEmpty()
            return if (raw.isEmpty()) emptyList() else raw.split("|||").filter { it.isNotEmpty() }
        }
        set(value) {
            val raw = value.take(100).joinToString("|||")
            prefs.edit().putString(KEY_DANMAKU_HISTORY, raw).apply()
        }

    // v13.12: 快捷调节
    var quickBrightness: Int
        get() = prefs.getInt(KEY_QUICK_BRIGHTNESS, 100)
        set(value) = prefs.edit().putInt(KEY_QUICK_BRIGHTNESS, value).apply()
    var quickContrast: Int
        get() = prefs.getInt(KEY_QUICK_CONTRAST, 100)
        set(value) = prefs.edit().putInt(KEY_QUICK_CONTRAST, value).apply()
    var quickSaturation: Int
        get() = prefs.getInt(KEY_QUICK_SATURATION, 100)
        set(value) = prefs.edit().putInt(KEY_QUICK_SATURATION, value).apply()

    // v13.13: 音频声道
    var audioChannelMode: Int
        get() = prefs.getInt(KEY_AUDIO_CHANNEL, 0)
        set(value) = prefs.edit().putInt(KEY_AUDIO_CHANNEL, value).apply()

    // v6.8: 视频播放速度记忆
    fun getVideoSpeed(bvid: String): Float {
        if (bvid.isBlank()) return Float.NaN
        return prefs.getFloat("speed_$bvid", Float.NaN)
    }

    fun setVideoSpeed(bvid: String, speed: Float) {
        if (bvid.isBlank()) return
        prefs.edit().putFloat("speed_$bvid", speed).apply()
    }

    // v12.10: 视频播放位置记忆
    fun getVideoPosition(bvid: String, cid: Long): Long {
        if (bvid.isBlank() || cid <= 0) return -1L
        return prefs.getLong("pos_${bvid}_$cid", -1L)
    }

    fun setVideoPosition(bvid: String, cid: Long, positionMs: Long) {
        if (bvid.isBlank() || cid <= 0) return
        prefs.edit().putLong("pos_${bvid}_$cid", positionMs).apply()
    }

    fun clearVideoPosition(bvid: String, cid: Long) {
        if (bvid.isBlank() || cid <= 0) return
        prefs.edit().remove("pos_${bvid}_$cid").apply()
    }

    // v13.17: 视频画质记忆 - per video quality
    fun getVideoQuality(bvid: String): Int {
        if (bvid.isBlank()) return -1
        return prefs.getInt("quality_$bvid", -1)
    }

    fun setVideoQuality(bvid: String, quality: Int) {
        if (bvid.isBlank()) return
        prefs.edit().putInt("quality_$bvid", quality).apply()
    }

    fun clearVideoQuality(bvid: String) {
        if (bvid.isBlank()) return
        prefs.edit().remove("quality_$bvid").apply()
    }

    // v6.11: 倍速预设
    var speedPresets: List<Float>
        get() {
            val raw = prefs.getString(KEY_SPEED_PRESETS, "").orEmpty().trim()
            if (raw.isBlank()) return emptyList()
            return raw.split(",").mapNotNull { it.trim().toFloatOrNull() }.filter { it in 0.25f..4.0f }
        }
        set(value) {
            val clean = value.filter { it in 0.25f..4.0f }.distinct().sorted()
            prefs.edit().putString(KEY_SPEED_PRESETS, clean.joinToString(",")).apply()
        }

    // v7.0: 跳过片头
    var skipIntroSeconds: Int
        get() = prefs.getInt(KEY_SKIP_INTRO_SECONDS, 0)
        set(value) = prefs.edit().putInt(KEY_SKIP_INTRO_SECONDS, value.coerceIn(0, 300)).apply()

    // v7.0: 跳过片尾
    var skipOutroSeconds: Int
        get() = prefs.getInt(KEY_SKIP_OUTRO_SECONDS, 0)
        set(value) = prefs.edit().putInt(KEY_SKIP_OUTRO_SECONDS, value.coerceIn(0, 300)).apply()

    var danmakuOpacity: Float
        get() = prefs.getFloat(KEY_DANMAKU_OPACITY, 1.0f)
        set(value) = prefs.edit().putFloat(KEY_DANMAKU_OPACITY, value).apply()

    // v12.7: 弹幕密度自适应
    var danmakuAutoDensity: Boolean
        get() = prefs.getBoolean(KEY_DANMAKU_AUTO_DENSITY, false)
        set(value) = prefs.edit().putBoolean(KEY_DANMAKU_AUTO_DENSITY, value).apply()

    var danmakuTextSizeSp: Float
        get() = prefs.getFloat(KEY_DANMAKU_TEXT_SIZE_SP, 18f)
        set(value) = prefs.edit().putFloat(KEY_DANMAKU_TEXT_SIZE_SP, value).apply()

    var danmakuLaneDensity: String
        get() {
            val raw = prefs.getString(KEY_DANMAKU_LANE_DENSITY, DANMAKU_LANE_DENSITY_STANDARD) ?: DANMAKU_LANE_DENSITY_STANDARD
            val v = raw.trim()
            return when (v) {
                DANMAKU_LANE_DENSITY_VERY_SPARSE,
                DANMAKU_LANE_DENSITY_SPARSE,
                DANMAKU_LANE_DENSITY_STANDARD,
                DANMAKU_LANE_DENSITY_DENSE,
                DANMAKU_LANE_DENSITY_VERY_DENSE,
                -> v

                else -> DANMAKU_LANE_DENSITY_STANDARD
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    DANMAKU_LANE_DENSITY_VERY_SPARSE -> DANMAKU_LANE_DENSITY_VERY_SPARSE
                    DANMAKU_LANE_DENSITY_SPARSE -> DANMAKU_LANE_DENSITY_SPARSE
                    DANMAKU_LANE_DENSITY_DENSE -> DANMAKU_LANE_DENSITY_DENSE
                    DANMAKU_LANE_DENSITY_VERY_DENSE -> DANMAKU_LANE_DENSITY_VERY_DENSE
                    else -> DANMAKU_LANE_DENSITY_STANDARD
                }
            prefs.edit().putString(KEY_DANMAKU_LANE_DENSITY, normalized).apply()
        }

    var danmakuStrokeWidthPx: Int
        get() {
            val v = prefs.getInt(KEY_DANMAKU_STROKE_WIDTH_PX, 4)
            return when (v) {
                0, 2, 4, 6 -> v
                else -> 4
            }
        }
        set(value) {
            val v =
                when (value) {
                    0, 2, 4, 6 -> value
                    else -> 4
                }
            prefs.edit().putInt(KEY_DANMAKU_STROKE_WIDTH_PX, v).apply()
        }

    var danmakuFontWeight: String
        get() {
            val raw = prefs.getString(KEY_DANMAKU_FONT_WEIGHT, DANMAKU_FONT_WEIGHT_BOLD) ?: DANMAKU_FONT_WEIGHT_BOLD
            val v = raw.trim()
            return when (v) {
                DANMAKU_FONT_WEIGHT_NORMAL,
                DANMAKU_FONT_WEIGHT_BOLD,
                -> v

                else -> DANMAKU_FONT_WEIGHT_BOLD
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    DANMAKU_FONT_WEIGHT_NORMAL -> DANMAKU_FONT_WEIGHT_NORMAL
                    else -> DANMAKU_FONT_WEIGHT_BOLD
                }
            prefs.edit().putString(KEY_DANMAKU_FONT_WEIGHT, normalized).apply()
        }

    var danmakuSpeed: Int
        get() = prefs.getInt(KEY_DANMAKU_SPEED, 4)
        set(value) = prefs.edit().putInt(KEY_DANMAKU_SPEED, value).apply()

    var danmakuArea: Float
        get() {
            val raw = prefs.getFloat(KEY_DANMAKU_AREA, DANMAKU_AREA_DEFAULT)
            val normalized = normalizeLegacyDanmakuAreaCompat(raw)
            if (abs(raw - normalized) > DANMAKU_AREA_COMPAT_EPSILON) {
                prefs.edit().putFloat(KEY_DANMAKU_AREA, normalized).apply()
            }
            return normalized
        }
        set(value) = prefs.edit().putFloat(KEY_DANMAKU_AREA, normalizeDanmakuArea(value)).apply()

    // v4.4: Smart quality switching
    var playerSmartQualityEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_SMART_QUALITY_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_SMART_QUALITY_ENABLED, value).apply()

    var playerPreferredQn: Int
        get() = prefs.getInt(KEY_PLAYER_PREFERRED_QN, 80)  // 80 = 1080p
        set(value) = prefs.edit().putInt(KEY_PLAYER_PREFERRED_QN, value).apply()

    var playerPreferredQnPortrait: Int
        get() {
            if (!prefs.contains(KEY_PLAYER_PREFERRED_QN_PORTRAIT)) return playerPreferredQn
            return prefs.getInt(KEY_PLAYER_PREFERRED_QN_PORTRAIT, playerPreferredQn)
        }
        set(value) = prefs.edit().putInt(KEY_PLAYER_PREFERRED_QN_PORTRAIT, value).apply()

    var playerPreferredCodec: String
        get() = prefs.getString(KEY_PLAYER_CODEC, "AVC") ?: "AVC"
        set(value) = prefs.edit().putString(KEY_PLAYER_CODEC, value).apply()

    var playerRenderViewType: String
        get() {
            val raw = prefs.getString(KEY_PLAYER_RENDER_VIEW, PLAYER_RENDER_VIEW_TEXTURE_VIEW) ?: PLAYER_RENDER_VIEW_TEXTURE_VIEW
            val v = raw.trim()
            return when (v) {
                PLAYER_RENDER_VIEW_SURFACE_VIEW,
                PLAYER_RENDER_VIEW_TEXTURE_VIEW,
                -> v

                else -> PLAYER_RENDER_VIEW_SURFACE_VIEW
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    PLAYER_RENDER_VIEW_SURFACE_VIEW,
                    PLAYER_RENDER_VIEW_TEXTURE_VIEW,
                    -> v

                    else -> PLAYER_RENDER_VIEW_TEXTURE_VIEW
                }
            prefs.edit().putString(KEY_PLAYER_RENDER_VIEW, normalized).apply()
        }

    var playerEngineKind: String
        get() {
            val raw = prefs.getString(KEY_PLAYER_ENGINE_KIND, PLAYER_ENGINE_IJK) ?: PLAYER_ENGINE_IJK
            val v = raw.trim()
            return when (v) {
                PLAYER_ENGINE_EXO,
                PLAYER_ENGINE_IJK,
                -> v
                else -> PLAYER_ENGINE_IJK
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    PLAYER_ENGINE_IJK -> PLAYER_ENGINE_IJK
                    else -> PLAYER_ENGINE_EXO
                }
            prefs.edit().putString(KEY_PLAYER_ENGINE_KIND, normalized).apply()
        }

    var playerStyle: String
        get() {
            val raw = prefs.getString(KEY_PLAYER_STYLE, PLAYER_STYLE_FULLSCREEN) ?: PLAYER_STYLE_FULLSCREEN
            val v = raw.trim()
            return when (v) {
                PLAYER_STYLE_FULLSCREEN,
                PLAYER_STYLE_HD,
                -> v

                else -> PLAYER_STYLE_FULLSCREEN
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    PLAYER_STYLE_HD -> PLAYER_STYLE_HD
                    else -> PLAYER_STYLE_FULLSCREEN
                }
            prefs.edit().putString(KEY_PLAYER_STYLE, normalized).apply()
        }

    var playerPreferredAudioId: Int
        get() = prefs.getInt(KEY_PLAYER_AUDIO_ID, 30280)
        set(value) = prefs.edit().putInt(KEY_PLAYER_AUDIO_ID, value).apply()

    var playerCdnPreference: String
        get() = prefs.getString(KEY_PLAYER_CDN_PREFERENCE, PLAYER_CDN_BILIVIDEO) ?: PLAYER_CDN_BILIVIDEO
        set(value) = prefs.edit().putString(KEY_PLAYER_CDN_PREFERENCE, value).apply()

    /**
     * When enabled, try to rewrite live m3u8 urls to remove Bilibili's transcoding suffix
     * (e.g. `_2500`, `_bluray`) in order to fetch the origin stream and get higher bitrate.
     *
     * Note: Some rooms/CDNs may reject the rewritten url (403/404) or have unstable playlists.
     */
    var liveHighBitrateEnabled: Boolean
        get() = prefs.getBoolean(KEY_LIVE_HIGH_BITRATE_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_LIVE_HIGH_BITRATE_ENABLED, value).apply()

    /** 直播帧数：0=原生, 30=30fps, 60=60fps */
    var liveFps: Int
        get() = prefs.getInt(KEY_LIVE_FPS, 0)
        set(value) = prefs.edit().putInt(KEY_LIVE_FPS, value).apply()

    var subtitlePreferredLang: String
        get() = prefs.getString(KEY_SUBTITLE_LANG, "auto") ?: "auto"
        set(value) = prefs.edit().putString(KEY_SUBTITLE_LANG, value).apply()

    var subtitleEnabledDefault: Boolean
        get() = prefs.getBoolean(KEY_SUBTITLE_ENABLED_DEFAULT, false)
        set(value) = prefs.edit().putBoolean(KEY_SUBTITLE_ENABLED_DEFAULT, value).apply()

    var subtitleTextSizeSp: Float
        get() {
            val v = prefs.getFloat(KEY_SUBTITLE_TEXT_SIZE_SP, 26f)
            if (!v.isFinite()) return 26f
            return v.coerceIn(10f, 60f)
        }
        set(value) {
            val v = if (value.isFinite()) value.coerceIn(10f, 60f) else 26f
            prefs.edit().putFloat(KEY_SUBTITLE_TEXT_SIZE_SP, v).apply()
        }

    var subtitleBottomPaddingFraction: Float
        get() {
            val v = prefs.getFloat(KEY_SUBTITLE_BOTTOM_PADDING_FRACTION, SUBTITLE_BOTTOM_PADDING_FRACTION_DEFAULT)
            if (!v.isFinite()) return SUBTITLE_BOTTOM_PADDING_FRACTION_DEFAULT
            return v.coerceIn(0f, 0.30f)
        }
        set(value) {
            val v = if (value.isFinite()) value.coerceIn(0f, 0.30f) else SUBTITLE_BOTTOM_PADDING_FRACTION_DEFAULT
            prefs.edit().putFloat(KEY_SUBTITLE_BOTTOM_PADDING_FRACTION, v).apply()
        }

    var subtitleBackgroundOpacity: Float
        get() {
            val v = prefs.getFloat(KEY_SUBTITLE_BACKGROUND_OPACITY, SUBTITLE_BACKGROUND_OPACITY_DEFAULT)
            if (!v.isFinite()) return SUBTITLE_BACKGROUND_OPACITY_DEFAULT
            return v.coerceIn(0f, 1.0f)
        }
        set(value) {
            val v = if (value.isFinite()) value.coerceIn(0f, 1.0f) else SUBTITLE_BACKGROUND_OPACITY_DEFAULT
            prefs.edit().putFloat(KEY_SUBTITLE_BACKGROUND_OPACITY, v).apply()
        }

    var playerSpeed: Float
        get() = prefs.getFloat(KEY_PLAYER_SPEED, 1.0f)
        set(value) = prefs.edit().putFloat(KEY_PLAYER_SPEED, value).apply()

    var playerShortSeekStepSeconds: Int
        get() =
            normalizePlayerShortSeekStepSeconds(
                prefs.getInt(KEY_PLAYER_SHORT_SEEK_STEP_SECONDS, PLAYER_SHORT_SEEK_STEP_SECONDS_DEFAULT),
            )
        set(value) =
            prefs.edit()
                .putInt(
                    KEY_PLAYER_SHORT_SEEK_STEP_SECONDS,
                    normalizePlayerShortSeekStepSeconds(value),
                ).apply()

    var playerHoldSeekSpeed: Float
        get() {
            val v = prefs.getFloat(KEY_PLAYER_HOLD_SEEK_SPEED, PLAYER_HOLD_SEEK_SPEED_DEFAULT)
            if (!v.isFinite()) return PLAYER_HOLD_SEEK_SPEED_DEFAULT
            return v.coerceIn(1.5f, 4.0f)
        }
        set(value) = prefs.edit().putFloat(KEY_PLAYER_HOLD_SEEK_SPEED, value.coerceIn(1.5f, 4.0f)).apply()

    var playerHoldSeekMode: String
        get() {
            val raw = prefs.getString(KEY_PLAYER_HOLD_SEEK_MODE, PLAYER_HOLD_SEEK_MODE_SPEED) ?: PLAYER_HOLD_SEEK_MODE_SPEED
            val v = raw.trim()
            return when (v) {
                PLAYER_HOLD_SEEK_MODE_SPEED,
                PLAYER_HOLD_SEEK_MODE_SCRUB,
                PLAYER_HOLD_SEEK_MODE_SCRUB_FIXED_TIME,
                -> v

                else -> PLAYER_HOLD_SEEK_MODE_SPEED
            }
        }
        set(value) {
            val v =
                when (value) {
                    PLAYER_HOLD_SEEK_MODE_SPEED,
                    PLAYER_HOLD_SEEK_MODE_SCRUB,
                    PLAYER_HOLD_SEEK_MODE_SCRUB_FIXED_TIME,
                    -> value

                    else -> PLAYER_HOLD_SEEK_MODE_SPEED
                }
            prefs.edit().putString(KEY_PLAYER_HOLD_SEEK_MODE, v).apply()
        }

    var playerHoldScrubTraverseSeconds: Int
        get() =
            normalizePlayerHoldScrubSeconds(
                prefs.getInt(KEY_PLAYER_HOLD_SCRUB_TRAVERSE_SECONDS, PLAYER_HOLD_SCRUB_SECONDS_DEFAULT),
            )
        set(value) =
            prefs.edit()
                .putInt(
                    KEY_PLAYER_HOLD_SCRUB_TRAVERSE_SECONDS,
                    normalizePlayerHoldScrubSeconds(value),
                ).apply()

    var playerHoldScrubFixedStepSeconds: Int
        get() =
            normalizePlayerHoldScrubSeconds(
                prefs.getInt(KEY_PLAYER_HOLD_SCRUB_FIXED_STEP_SECONDS, PLAYER_HOLD_SCRUB_SECONDS_DEFAULT),
            )
        set(value) =
            prefs.edit()
                .putInt(
                    KEY_PLAYER_HOLD_SCRUB_FIXED_STEP_SECONDS,
                    normalizePlayerHoldScrubSeconds(value),
                ).apply()

    var playerAutoResumeEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_AUTO_RESUME_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_AUTO_RESUME_ENABLED, value).apply()

    var playerAutoSkipSegmentsEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_AUTO_SKIP_SEGMENTS_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_AUTO_SKIP_SEGMENTS_ENABLED, value).apply()

    var playerAutoSkipServerBaseUrl: String
        get() =
            normalizePlayerAutoSkipServerBaseUrl(prefs.getString(KEY_PLAYER_AUTO_SKIP_SERVER_BASE_URL, null))
                ?: DEFAULT_PLAYER_AUTO_SKIP_SERVER_BASE_URL
        set(value) {
            val normalized = normalizePlayerAutoSkipServerBaseUrl(value) ?: DEFAULT_PLAYER_AUTO_SKIP_SERVER_BASE_URL
            if (normalized == DEFAULT_PLAYER_AUTO_SKIP_SERVER_BASE_URL) {
                prefs.edit().remove(KEY_PLAYER_AUTO_SKIP_SERVER_BASE_URL).apply()
            } else {
                prefs.edit().putString(KEY_PLAYER_AUTO_SKIP_SERVER_BASE_URL, normalized).apply()
            }
        }

    var sponsorBlockPrivateUserId: String
        get() {
            val cached =
                prefs.getString(KEY_SPONSOR_BLOCK_PRIVATE_USER_ID, null)
                    ?.trim()
                    ?.takeIf { isValidSponsorBlockPrivateUserId(it) }
            if (cached != null) return cached
            val generated = generateSponsorBlockPrivateUserId()
            prefs.edit().putString(KEY_SPONSOR_BLOCK_PRIVATE_USER_ID, generated).apply()
            return generated
        }
        set(value) {
            val normalized = value.trim()
            if (isValidSponsorBlockPrivateUserId(normalized)) {
                prefs.edit().putString(KEY_SPONSOR_BLOCK_PRIVATE_USER_ID, normalized).apply()
            }
        }

    var playerOpenDetailBeforePlay: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_OPEN_DETAIL_BEFORE_PLAY, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_OPEN_DETAIL_BEFORE_PLAY, value).apply()

    var fullscreenEnabled: Boolean
        get() = prefs.getBoolean(KEY_FULLSCREEN, true)
        set(value) = prefs.edit().putBoolean(KEY_FULLSCREEN, value).apply()

    var avoidDisplayCutout: Boolean
        get() = prefs.getBoolean(KEY_AVOID_DISPLAY_CUTOUT, true)
        set(value) = prefs.edit().putBoolean(KEY_AVOID_DISPLAY_CUTOUT, value).apply()

    var tabSwitchFollowsFocus: Boolean
        get() = prefs.getBoolean(KEY_TAB_SWITCH_FOLLOWS_FOCUS, true)
        set(value) = prefs.edit().putBoolean(KEY_TAB_SWITCH_FOLLOWS_FOCUS, value).apply()

    var mainAutoHideSidebarOnEnterContent: Boolean
        get() = prefs.getBoolean(KEY_MAIN_AUTO_HIDE_SIDEBAR_ON_ENTER_CONTENT, false)
        set(value) = prefs.edit().putBoolean(KEY_MAIN_AUTO_HIDE_SIDEBAR_ON_ENTER_CONTENT, value).apply()

    /**
     * Main page (Home/Category/Live/My) "Back" key focus-return scheme.
     *
     * Applied when focus is inside a page content area:
     * - Tab pages: focus is inside the ViewPager content.
     * - Dynamic page: focus is inside the page root (no tabs).
     *
     * Schemes:
     * - [MAIN_BACK_FOCUS_SCHEME_A] (Default): content -> focus current tab; tab -> focus sidebar.
     * - [MAIN_BACK_FOCUS_SCHEME_B]: content -> go to tab0 content; when already at tab0 content -> focus sidebar.
     * - [MAIN_BACK_FOCUS_SCHEME_C]: content -> focus sidebar.
     *
     * Notes:
     * - Search has its own back behavior (input/results panels).
     * - App-level navigation (return to startup page / exit) is still handled by MainActivity when unconsumed.
     */
    var mainBackFocusScheme: String
        get() {
            val raw = prefs.getString(KEY_MAIN_BACK_FOCUS_SCHEME, MAIN_BACK_FOCUS_SCHEME_A) ?: MAIN_BACK_FOCUS_SCHEME_A
            val v = raw.trim()
            return when (v) {
                MAIN_BACK_FOCUS_SCHEME_A,
                MAIN_BACK_FOCUS_SCHEME_B,
                MAIN_BACK_FOCUS_SCHEME_C,
                -> v
                else -> MAIN_BACK_FOCUS_SCHEME_A
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    MAIN_BACK_FOCUS_SCHEME_A,
                    MAIN_BACK_FOCUS_SCHEME_B,
                    MAIN_BACK_FOCUS_SCHEME_C,
                    -> v
                    else -> MAIN_BACK_FOCUS_SCHEME_A
            }
            prefs.edit().putString(KEY_MAIN_BACK_FOCUS_SCHEME, normalized).apply()
        }

    var videoCardLongPressAction: String
        get() = normalizeVideoCardLongPressAction(prefs.getString(KEY_VIDEO_CARD_LONG_PRESS_ACTION, VIDEO_CARD_LONG_PRESS_ACTION_MANUAL))
        set(value) = prefs.edit().putString(KEY_VIDEO_CARD_LONG_PRESS_ACTION, normalizeVideoCardLongPressAction(value)).apply()

    var playerDebugEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_DEBUG, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_DEBUG, value).apply()

    var playerDoubleBackToExit: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_DOUBLE_BACK_TO_EXIT, true)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_DOUBLE_BACK_TO_EXIT, value).apply()

    var playerDownKeyOsdFocusTarget: String
        get() {
            val raw =
                prefs.getString(KEY_PLAYER_DOWN_KEY_OSD_FOCUS_TARGET, PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE)
                    ?: PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE
            val value = raw.trim()
            val normalized =
                when (value) {
                    PLAYER_DOWN_KEY_OSD_FOCUS_RECOMMEND_LEGACY,
                    PLAYER_DOWN_KEY_OSD_FOCUS_PLAYLIST_LEGACY,
                    -> PLAYER_DOWN_KEY_OSD_FOCUS_LIST_PANEL

                    else -> value
                }
            return when (normalized) {
                PLAYER_DOWN_KEY_OSD_FOCUS_PREV,
                PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE,
                PLAYER_DOWN_KEY_OSD_FOCUS_NEXT,
                PLAYER_DOWN_KEY_OSD_FOCUS_SUBTITLE,
                PLAYER_DOWN_KEY_OSD_FOCUS_DANMAKU,
                PLAYER_DOWN_KEY_OSD_FOCUS_COMMENTS,
                PLAYER_DOWN_KEY_OSD_FOCUS_DETAIL,
                PLAYER_DOWN_KEY_OSD_FOCUS_UP,
                PLAYER_DOWN_KEY_OSD_FOCUS_LIKE,
                PLAYER_DOWN_KEY_OSD_FOCUS_COIN,
                PLAYER_DOWN_KEY_OSD_FOCUS_FAV,
                PLAYER_DOWN_KEY_OSD_FOCUS_LIST_PANEL,
                PLAYER_DOWN_KEY_OSD_FOCUS_SPONSOR_SUBMIT,
                PLAYER_DOWN_KEY_OSD_FOCUS_ADVANCED,
                -> normalized

                else -> PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE
            }
        }
        set(value) {
            val next =
                when (value) {
                    PLAYER_DOWN_KEY_OSD_FOCUS_PREV,
                    PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE,
                    PLAYER_DOWN_KEY_OSD_FOCUS_NEXT,
                    PLAYER_DOWN_KEY_OSD_FOCUS_SUBTITLE,
                    PLAYER_DOWN_KEY_OSD_FOCUS_DANMAKU,
                    PLAYER_DOWN_KEY_OSD_FOCUS_COMMENTS,
                    PLAYER_DOWN_KEY_OSD_FOCUS_DETAIL,
                    PLAYER_DOWN_KEY_OSD_FOCUS_UP,
                    PLAYER_DOWN_KEY_OSD_FOCUS_LIKE,
                    PLAYER_DOWN_KEY_OSD_FOCUS_COIN,
                    PLAYER_DOWN_KEY_OSD_FOCUS_FAV,
                    PLAYER_DOWN_KEY_OSD_FOCUS_LIST_PANEL,
                    PLAYER_DOWN_KEY_OSD_FOCUS_SPONSOR_SUBMIT,
                    PLAYER_DOWN_KEY_OSD_FOCUS_ADVANCED,
                    -> value

                    else -> PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE
                }
            prefs.edit().putString(KEY_PLAYER_DOWN_KEY_OSD_FOCUS_TARGET, next).apply()
        }

    var playerTogglePlayStateShowOsd: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_TOGGLE_PLAY_STATE_SHOW_OSD, true)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_TOGGLE_PLAY_STATE_SHOW_OSD, value).apply()

    var playerPersistentBottomProgressEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_PERSISTENT_BOTTOM_PROGRESS, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_PERSISTENT_BOTTOM_PROGRESS, value).apply()

    var playerPersistentClockEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_PERSISTENT_CLOCK, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_PERSISTENT_CLOCK, value).apply()

    var playerTouchGesturesEnabled: Boolean
        get() {
            if (!prefs.contains(KEY_PLAYER_TOUCH_GESTURES_ENABLED)) return defaultPlayerTouchGesturesEnabled
            return prefs.getBoolean(KEY_PLAYER_TOUCH_GESTURES_ENABLED, defaultPlayerTouchGesturesEnabled)
        }
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_TOUCH_GESTURES_ENABLED, value).apply()

    /** 手势灵敏度：1=低, 2=中(默认), 3=高 */
    /** v5.0: 全局字体大小缩放因子 */
    var fontScaleFactor: Float
        get() {
            val v = prefs.getFloat(KEY_FONT_SCALE_FACTOR, FONT_SCALE_FACTOR_DEFAULT)
            if (!v.isFinite()) return FONT_SCALE_FACTOR_DEFAULT
            return v.coerceIn(FONT_SCALE_FACTOR_MIN, FONT_SCALE_FACTOR_MAX)
        }
        set(value) {
            val v = if (value.isFinite()) value.coerceIn(FONT_SCALE_FACTOR_MIN, FONT_SCALE_FACTOR_MAX) else FONT_SCALE_FACTOR_DEFAULT
            prefs.edit().putFloat(KEY_FONT_SCALE_FACTOR, v).apply()
        }

    var playerGestureSensitivity: Int
        get() = prefs.getInt(KEY_PLAYER_GESTURE_SENSITIVITY, 2)
        set(value) = prefs.edit().putInt(KEY_PLAYER_GESTURE_SENSITIVITY, value).apply()

    // v5.7: 双击中心区域动作 (0=播放/暂停, 1=点赞, 2=弹幕开关)
    var doubleTapAction: Int
        get() = prefs.getInt(KEY_DOUBLE_TAP_ACTION, DOUBLE_TAP_ACTION_PLAY_PAUSE)
        set(value) = prefs.edit().putInt(KEY_DOUBLE_TAP_ACTION, value.coerceIn(0, 2)).apply()

    // v5.8: 省流模式
    var dataSaverMode: Boolean
        get() = prefs.getBoolean(KEY_DATA_SAVER_MODE, false)
        set(value) {
            prefs.edit().putBoolean(KEY_DATA_SAVER_MODE, value).apply()
            if (value) {
                // 省流模式开启：自动降画质+关弹幕+低图片质量
                imageQuality = "low"
                playerPreferredQn = 32  // 480p
                danmakuEnabled = false
            } else {
                // 恢复默认
                imageQuality = "medium"
                playerPreferredQn = 80  // 1080p
                danmakuEnabled = true
            }
        }

    /** 护眼模式：0=关闭, 1=轻度, 2=中度, 3=重度 */
    var eyeProtectionMode: Int
        get() = prefs.getInt(KEY_EYE_PROTECTION_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_EYE_PROTECTION_MODE, value).apply()

    /** 隐藏的侧边栏Tab ID集合，逗号分隔 */
    var hiddenSidebarTabs: Set<Int>
        get() {
            val raw = prefs.getString(KEY_HIDDEN_SIDEBAR_TABS, "") ?: ""
            if (raw.isBlank()) return emptySet()
            return raw.split(",").mapNotNull { it.trim().toIntOrNull() }.toSet()
        }
        set(value) = prefs.edit().putString(KEY_HIDDEN_SIDEBAR_TABS, value.joinToString(",")).apply()

    var playerVideoShotPreviewSize: String
        get() {
            val raw = prefs.getString(KEY_PLAYER_VIDEOSHOT_PREVIEW_SIZE, PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM)
                ?: PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM
            val v = raw.trim()
            return when (v) {
                PLAYER_VIDEOSHOT_PREVIEW_SIZE_OFF,
                PLAYER_VIDEOSHOT_PREVIEW_SIZE_SMALL,
                PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM,
                PLAYER_VIDEOSHOT_PREVIEW_SIZE_LARGE,
                -> v
                else -> PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    PLAYER_VIDEOSHOT_PREVIEW_SIZE_OFF,
                    PLAYER_VIDEOSHOT_PREVIEW_SIZE_SMALL,
                    PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM,
                    PLAYER_VIDEOSHOT_PREVIEW_SIZE_LARGE,
                    -> v
                    else -> PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM
                }
            prefs.edit().putString(KEY_PLAYER_VIDEOSHOT_PREVIEW_SIZE, normalized).apply()
        }

    var playerAudioBalanceLevel: String
        get() {
            val raw = prefs.getString(KEY_PLAYER_AUDIO_BALANCE_LEVEL, PLAYER_AUDIO_BALANCE_OFF) ?: PLAYER_AUDIO_BALANCE_OFF
            val v = raw.trim()
            return when (v) {
                PLAYER_AUDIO_BALANCE_OFF,
                PLAYER_AUDIO_BALANCE_LOW,
                PLAYER_AUDIO_BALANCE_MEDIUM,
                PLAYER_AUDIO_BALANCE_HIGH,
                -> v

                else -> PLAYER_AUDIO_BALANCE_OFF
            }
        }
        set(value) {
            val v = value.trim()
            val normalized =
                when (v) {
                    PLAYER_AUDIO_BALANCE_LOW -> PLAYER_AUDIO_BALANCE_LOW
                    PLAYER_AUDIO_BALANCE_MEDIUM -> PLAYER_AUDIO_BALANCE_MEDIUM
                    PLAYER_AUDIO_BALANCE_HIGH -> PLAYER_AUDIO_BALANCE_HIGH
                    else -> PLAYER_AUDIO_BALANCE_OFF
                }
            prefs.edit().putString(KEY_PLAYER_AUDIO_BALANCE_LEVEL, normalized).apply()
        }

    var playerPlaybackMode: String
        get() = PlayerPlaybackModes.normalize(prefs.getString(KEY_PLAYER_PLAYBACK_MODE, PLAYER_PLAYBACK_MODE_NONE))
        set(value) = prefs.edit().putString(KEY_PLAYER_PLAYBACK_MODE, PlayerPlaybackModes.normalize(value)).apply()

    var playerSettingsApplyToGlobal: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_SETTINGS_APPLY_TO_GLOBAL, false)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_SETTINGS_APPLY_TO_GLOBAL, value).apply()

    var playerUpQuickCardEnabled: Boolean
        get() = prefs.getBoolean(KEY_PLAYER_UP_QUICK_CARD_ENABLED, true)
        set(value) = prefs.edit().putBoolean(KEY_PLAYER_UP_QUICK_CARD_ENABLED, value).apply()

    var playerOsdButtons: List<String>
        get() {
            // IMPORTANT:
            // - If the key doesn't exist yet, user never configured OSD -> return our default set.
            // - If the key exists (even if empty), respect it and only normalize (e.g. keep Play/Pause).
            if (!prefs.contains(KEY_PLAYER_OSD_BUTTONS)) return DEFAULT_PLAYER_OSD_BUTTONS
            val stored = loadStringList(KEY_PLAYER_OSD_BUTTONS)
            val normalized = normalizePlayerOsdButtons(stored)
            return migratePlayerOsdDetailButtonIfNeeded(normalized)
        }
        set(value) {
            saveStringList(KEY_PLAYER_OSD_BUTTONS, normalizePlayerOsdButtons(value))
            // Once user manually configures OSD buttons, never force-enable new buttons again.
            prefs.edit().putBoolean(KEY_PLAYER_OSD_BUTTONS_DETAIL_MIGRATED, true).apply()
        }

    internal var playerCustomShortcuts: List<PlayerCustomShortcut>
        get() = PlayerCustomShortcutsStore.parse(prefs.getString(KEY_PLAYER_CUSTOM_SHORTCUTS, null))
        set(value) {
            if (value.isEmpty()) {
                prefs.edit().remove(KEY_PLAYER_CUSTOM_SHORTCUTS).apply()
            } else {
                prefs.edit().putString(KEY_PLAYER_CUSTOM_SHORTCUTS, PlayerCustomShortcutsStore.serialize(value)).apply()
            }
        }

    var gridSpanCount: Int
        get() {
            val stored = prefs.getInt(KEY_GRID_SPAN, 4)
            val span = if (stored <= 0) 4 else stored
            return span.coerceIn(1, 6)
        }
        set(value) {
            val span = if (value <= 0) 4 else value
            prefs.edit().putInt(KEY_GRID_SPAN, span.coerceIn(1, 6)).apply()
        }

    var dynamicGridSpanCount: Int
        get() = prefs.getInt(KEY_DYNAMIC_GRID_SPAN, 3)
        set(value) = prefs.edit().putInt(KEY_DYNAMIC_GRID_SPAN, value).apply()

    var pgcGridSpanCount: Int
        get() {
            val stored = prefs.getInt(KEY_PGC_GRID_SPAN, 6)
            val span = if (stored <= 0) 6 else stored
            return span.coerceIn(1, 6)
        }
        set(value) {
            val span = if (value <= 0) 6 else value
            prefs.edit().putInt(KEY_PGC_GRID_SPAN, span.coerceIn(1, 6)).apply()
        }

    var pgcEpisodeOrderReversed: Boolean
        get() = prefs.getBoolean(KEY_PGC_EPISODE_ORDER_REVERSED, false)
        set(value) = prefs.edit().putBoolean(KEY_PGC_EPISODE_ORDER_REVERSED, value).apply()

    var searchHistory: List<String>
        get() = loadStringList(KEY_SEARCH_HISTORY)
        set(value) = saveStringList(KEY_SEARCH_HISTORY, value)

    var gaiaVgateVVoucher: String?
        get() = prefs.getString(KEY_GAIA_VGATE_V_VOUCHER, null)?.trim()?.takeIf { it.isNotBlank() }
        set(value) = prefs.edit().putString(KEY_GAIA_VGATE_V_VOUCHER, value?.trim()).apply()

    var gaiaVgateVVoucherSavedAtMs: Long
        get() = prefs.getLong(KEY_GAIA_VGATE_V_VOUCHER_SAVED_AT_MS, -1L)
        set(value) = prefs.edit().putLong(KEY_GAIA_VGATE_V_VOUCHER_SAVED_AT_MS, value).apply()

    // v10.1: 网络速度指示器
    var networkSpeedIndicatorEnabled: Boolean
        get() = prefs.getBoolean(KEY_NETWORK_SPEED_INDICATOR, false)
        set(value) = prefs.edit().putBoolean(KEY_NETWORK_SPEED_INDICATOR, value).apply()

    // v12.12: 电池电量指示器
    var playerBatteryIndicatorEnabled: Boolean
        get() = prefs.getBoolean(KEY_BATTERY_INDICATOR, false)
        set(value) = prefs.edit().putBoolean(KEY_BATTERY_INDICATOR, value).apply()

    // v12.14: 视频画面旋转
    var videoRotation: Int
        get() = prefs.getInt(KEY_VIDEO_ROTATION, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_ROTATION, value % 360).apply()

    // v12.15: 视频画面镜像
    var videoMirror: Int
        get() = prefs.getInt(KEY_VIDEO_MIRROR, 0)
        set(value) = prefs.edit().putInt(KEY_VIDEO_MIRROR, value.coerceIn(0, 2)).apply()

    // v12.16: 画面比例持久化
    var playerAspectRatio: String
        get() = prefs.getString(KEY_PLAYER_ASPECT_RATIO, "fit") ?: "fit"
        set(value) = prefs.edit().putString(KEY_PLAYER_ASPECT_RATIO, value).apply()

    // v12.21: 播放时长提醒
    var playbackTimeReminderMinutes: Int
        get() = prefs.getInt(KEY_PLAYBACK_TIME_REMINDER, 0)
        set(value) = prefs.edit().putInt(KEY_PLAYBACK_TIME_REMINDER, value).apply()

    // v10.2: 视频书签 (bvid -> comma-separated timestamps in ms)
    var videoBookmarks: Map<String, List<Long>>
        get() {
            val raw = prefs.getString(KEY_VIDEO_BOOKMARKS, null) ?: return emptyMap()
            val map = mutableMapOf<String, List<Long>>()
            for (line in raw.split("\n")) {
                val parts = line.split("=", limit = 2)
                if (parts.size == 2) {
                    val bvid = parts[0]
                    val timestamps = parts[1].split(",").mapNotNull { it.toLongOrNull() }
                    if (timestamps.isNotEmpty()) map[bvid] = timestamps
                }
            }
            return map
        }
        set(value) {
            val sb = StringBuilder()
            for ((bvid, timestamps) in value) {
                if (sb.isNotEmpty()) sb.append("\n")
                sb.append(bvid).append("=").append(timestamps.joinToString(","))
            }
            prefs.edit().putString(KEY_VIDEO_BOOKMARKS, sb.toString()).apply()
        }

    fun addVideoBookmark(bvid: String, positionMs: Long, maxSize: Int = 50) {
        val map = videoBookmarks.toMutableMap()
        val list = (map[bvid] ?: emptyList()).toMutableList()
        if (!list.contains(positionMs)) {
            list.add(positionMs)
            list.sort()
            if (list.size > maxSize) list.removeAt(0)
            map[bvid] = list
            videoBookmarks = map
        }
    }

    fun removeVideoBookmark(bvid: String, positionMs: Long) {
        val map = videoBookmarks.toMutableMap()
        val list = (map[bvid] ?: emptyList()).toMutableList()
        list.remove(positionMs)
        if (list.isEmpty()) map.remove(bvid) else map[bvid] = list
        videoBookmarks = map
    }

    fun getVideoBookmarks(bvid: String): List<Long> {
        return videoBookmarks[bvid] ?: emptyList()
    }

    fun clearVideoBookmarks(bvid: String) {
        val map = videoBookmarks.toMutableMap()
        map.remove(bvid)
        videoBookmarks = map
    }

    fun addSearchHistory(keyword: String, maxSize: Int = 20) {
        val k = keyword.trim()
        if (k.isBlank()) return
        val old = searchHistory
        val out = ArrayList<String>(old.size + 1)
        out.add(k)
        for (item in old) {
            if (item.equals(k, ignoreCase = true)) continue
            out.add(item)
            if (out.size >= maxSize) break
        }
        searchHistory = out
    }

    fun clearSearchHistory() {
        prefs.edit().remove(KEY_SEARCH_HISTORY).apply()
    }

    // v9.5: 删除单条搜索历史
    fun removeSearchHistory(keyword: String) {
        val k = keyword.trim()
        if (k.isBlank()) return
        searchHistory = searchHistory.filter { !it.equals(k, ignoreCase = true) }
    }

    fun exportConfigSnapshotJson(): JSONObject =
        SharedPreferencesSnapshot.encode(
            prefs = prefs,
            excludeKeys = CREDENTIAL_KEYS,
        )

    fun exportDiagnosticsSnapshotJson(): JSONObject =
        SharedPreferencesSnapshot.encode(
            prefs = prefs,
            excludeKeys = DIAGNOSTIC_EXCLUDED_KEYS,
        )

    fun exportCredentialsSnapshotJson(): JSONObject =
        SharedPreferencesSnapshot.encode(
            prefs = prefs,
            includeKeys = CREDENTIAL_KEYS,
        )

    fun replaceConfigFromSnapshotJson(root: JSONObject) =
        SharedPreferencesSnapshot.replaceAll(
            prefs = prefs,
            root = root,
            excludeKeys = CREDENTIAL_KEYS,
        )

    fun replaceCredentialsFromSnapshotJson(root: JSONObject) =
        SharedPreferencesSnapshot.replaceAll(
            prefs = prefs,
            root = root,
            includeKeys = CREDENTIAL_KEYS,
        )

    private fun loadStringList(key: String): List<String> {
        val raw = prefs.getString(key, null) ?: return emptyList()
        return runCatching {
            val arr = JSONArray(raw)
            val out = ArrayList<String>(arr.length())
            for (i in 0 until arr.length()) {
                val s = arr.optString(i, "").trim()
                if (s.isNotBlank()) out.add(s)
            }
            out
        }.getOrDefault(emptyList())
    }

    private fun saveStringList(key: String, value: List<String>) {
        val arr = JSONArray()
        for (s in value) {
            val v = s.trim()
            if (v.isNotBlank()) arr.put(v)
        }
        prefs.edit().putString(key, arr.toString()).apply()
    }

    private fun normalizeStringList(value: List<String>): List<String> {
        if (value.isEmpty()) return emptyList()
        val out = ArrayList<String>(value.size)
        val seen = HashSet<String>(value.size * 2)
        for (raw in value) {
            val key = raw.trim()
            if (key.isBlank()) continue
            if (seen.add(key)) out.add(key)
        }
        return out
    }

    private fun migratePlayerOsdDetailButtonIfNeeded(normalized: List<String>): List<String> {
        if (prefs.getBoolean(KEY_PLAYER_OSD_BUTTONS_DETAIL_MIGRATED, false)) return normalized
        // Requirement: auto-enable the new "Detail" button even for users who previously customized OSD.
        // Do it only once so the user can later disable it in Settings.
        prefs.edit().putBoolean(KEY_PLAYER_OSD_BUTTONS_DETAIL_MIGRATED, true).apply()
        if (normalized.contains(PLAYER_OSD_BTN_DETAIL)) return normalized

        val migrated = normalized + PLAYER_OSD_BTN_DETAIL
        saveStringList(KEY_PLAYER_OSD_BUTTONS, migrated)
        return migrated
    }

    private fun normalizePlayerOsdButtons(value: List<String>): List<String> {
        val out = ArrayList<String>(value.size + 1)
        val seen = HashSet<String>(value.size + 1)
        for (raw in value) {
            val key = raw.trim()
            if (key.isBlank()) continue
            if (!PLAYER_OSD_BUTTON_KEYS.contains(key)) continue
            if (seen.add(key)) out.add(key)
        }
        if (!seen.contains(PLAYER_OSD_BTN_PLAY_PAUSE)) {
            out.add(0, PLAYER_OSD_BTN_PLAY_PAUSE)
        }
        return out
    }

    private fun normalizeUiScaleFactor(value: Float): Float {
        val v = if (value.isFinite()) value else UI_SCALE_FACTOR_DEFAULT
        val clamped = v.coerceIn(UI_SCALE_FACTOR_MIN, UI_SCALE_FACTOR_MAX)
        val scaled = (clamped * 100f).roundToInt()
        val step = (UI_SCALE_FACTOR_STEP * 100f).roundToInt().coerceAtLeast(1)
        val snapped = ((scaled + step / 2) / step) * step
        return (snapped / 100f).coerceIn(UI_SCALE_FACTOR_MIN, UI_SCALE_FACTOR_MAX)
    }

    private fun normalizePlayerShortSeekStepSeconds(value: Int): Int {
        return if (PLAYER_SHORT_SEEK_STEP_SECONDS_OPTIONS.contains(value)) value else PLAYER_SHORT_SEEK_STEP_SECONDS_DEFAULT
    }

    private fun normalizePlayerHoldScrubSeconds(value: Int): Int {
        return if (PLAYER_HOLD_SCRUB_SECONDS_OPTIONS.contains(value)) value else PLAYER_HOLD_SCRUB_SECONDS_DEFAULT
    }

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
        // v26.4: 弹幕发送确认震动
        private const val KEY_V26_DANMAKU_SEND_VIBRATION = "v26_danmaku_send_vibration"
        // v26.5: 播放器音量均衡
        private const val KEY_V26_VOLUME_BALANCE = "v26_volume_balance"
        // v26.6: 视频缓存预加载大小
        private const val KEY_V26_CACHE_PRELOAD_SIZE = "v26_cache_preload_size"
        // v26.7: 弹幕显示透明度
        private const val KEY_V26_DANMAKU_DISPLAY_OPACITY = "v26_danmaku_display_opacity"
        // v26.8: 视频画面亮度曲线
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
        // v27.9: 弹幕发送历史记录大小
        private const val KEY_V27_DANMAKU_HISTORY_SIZE = "v27_danmaku_history_size"
        // v27.10: 播放器进度条高度
        private const val KEY_V27_PROGRESS_BAR_HEIGHT = "v27_progress_bar_height"
        // v27.11: 视频投射画面延迟
        private const val KEY_V27_CAST_DELAY = "v27_cast_delay"
        // v27.12: 弹幕字体阴影大小
        private const val KEY_V27_DANMAKU_SHADOW_SIZE = "v27_danmaku_shadow_size"
        // v27.13: 播放器手势双击功能
        // v27.14: 视频画面降噪强度
        private const val KEY_V27_DENOISE_STRENGTH = "v27_denoise_strength"
        // v27.15: 弹幕显示字体间距
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
        // v29.8: 视频画面色彩色温
        private const val KEY_V29_COLOR_TEMPERATURE = "v29_color_temperature"
        // v29.9: 弹幕发送历史记录导出
        private const val KEY_V29_HISTORY_EXPORT = "v29_history_export"
        // v29.10: 播放器进度条样式
        // v29.11: 视频投射画面质量
        // v29.12: 弹幕字体背景透明度
        private const val KEY_V29_DANMAKU_BACKGROUND_OPACITY = "v29_danmaku_background_opacity"
        // v29.13: 播放器手势长按功能
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
        // v30.11: 视频投射画面延迟
        private const val KEY_V30_CAST_LATENCY = "v30_cast_latency"
        // v30.12: 弹幕字体背景阴影
        private const val KEY_V30_DANMAKU_BACKGROUND_SHADOW = "v30_danmaku_background_shadow"
        // v30.13: 播放器手势滑动功能
        // v30.14: 视频画面色彩模糊
        private const val KEY_V30_COLOR_BLUR = "v30_color_blur"
        // v30.15: 弹幕显示字体发光
        private const val KEY_V30_DANMAKU_FONT_GLOW = "v30_danmaku_font_glow"
        private const val KEY_VOLUME_AMBIENT_MODE = "v50_volume_ambient_mode"


        


        // ===== v150.x KEY =====


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
        private const val KEY_V31_DANMAKU_MERGE_OVERLAP = "v31_danmaku_merge_overlap"
        private const val KEY_V31_VIDEO_FRAME_SKIP_SILENCE = "v31_video_frame_skip_silence"
        private const val KEY_V31_SUBTITLE_FONT_SIZE_AUTO = "v31_subtitle_font_size_auto"
        private const val KEY_V31_PLAYBACK_BUFFER_AHEAD_SEC = "v31_playback_buffer_ahead_sec"
        private const val KEY_V31_DANMAKU_ANTI_SPAM_LEVEL = "v31_danmaku_anti_spam_level"
        private const val KEY_V31_VIDEO_DEINTERLACE_MODE = "v31_video_deinterlace_mode"
        private const val KEY_V31_AUDIO_NIGHT_MODE = "v31_audio_night_mode"
        private const val KEY_V31_DANMAKU_KEYWORD_HIGHLIGHT = "v31_danmaku_keyword_highlight"
        private const val KEY_V31_PLAYER_PI_P_SUPPORT = "v31_player_pi_p_support"
        private const val KEY_V31_VIDEO_A_BOOP_MODE = "v31_video_a_boop_mode"
        private const val KEY_V31_DANMAKU_LAYER_ORDER = "v31_danmaku_layer_order"
        private const val KEY_V31_SUBTITLE_SYNC_OFFSET = "v31_subtitle_sync_offset"
        private const val KEY_V31_PLAYBACK_AUTO_RESUME = "v31_playback_auto_resume"
        private const val KEY_V31_DANMAKU_BLOCK_USER_LEVEL = "v31_danmaku_block_user_level"
        private const val KEY_V31_VIDEO_CODEC_PRIORITY = "v31_video_codec_priority"
        private const val KEY_V32_SCREEN_OFF_TIMER = "v32_screen_off_timer"
        private const val KEY_V32_DANMAKU_RAIN_MODE = "v32_danmaku_rain_mode"
        private const val KEY_V32_AUDIO_CHANNEL_SWAP = "v32_audio_channel_swap"
        private const val KEY_V32_VIDEO_ZOOM_GESTURE = "v32_video_zoom_gesture"
        private const val KEY_V32_DANMAKU_TIMESTAMP_DISPLAY = "v32_danmaku_timestamp_display"
        private const val KEY_V32_PLAYLIST_REMOVE_PLAYED = "v32_playlist_remove_played"
        private const val KEY_V32_PLAYER_BACKGROUND_PLAY = "v32_player_background_play"
        private const val KEY_V32_SUBTITLE_DUAL_LANG = "v32_subtitle_dual_lang"
        private const val KEY_V32_DANMAKU_OPACITY_FADE = "v32_danmaku_opacity_fade"
        private const val KEY_V32_VIDEO_SPEED_RAMP_MODE = "v32_video_speed_ramp_mode"
        private const val KEY_V32_AUDIO_VIRTUAL_SURROUND = "v32_audio_virtual_surround"
        private const val KEY_V32_DANMAKU_BUBBLE_STYLE = "v32_danmaku_bubble_style"
        private const val KEY_V32_PLAYER_LOCK_TIMEOUT = "v32_player_lock_timeout"
        private const val KEY_V32_VIDEO_CROP_PRESET = "v32_video_crop_preset"
        private const val KEY_V32_DANMAKU_EMOJI_FILTER = "v32_danmaku_emoji_filter"
        private const val KEY_V33_AUDIO_BASS_BOOST = "v33_audio_bass_boost"
        private const val KEY_V33_DANMAKU_SCROLL_DIRECTION = "v33_danmaku_scroll_direction"
        private const val KEY_V33_VIDEO_THUMBNAIL_TIME_SEC = "v33_video_thumbnail_time_sec"
        private const val KEY_V33_PLAYER_DOUBLE_TAP_SEEK_SEC = "v33_player_double_tap_seek_sec"
        private const val KEY_V33_DANMAKU_LINE_NUMBER = "v33_danmaku_line_number"
        private const val KEY_V33_SUBTITLE_BORDER_WIDTH = "v33_subtitle_border_width"
        private const val KEY_V33_VIDEO_HDR_TONE_MAP = "v33_video_hdr_tone_map"
        private const val KEY_V33_PLAYBACK_SKIP_INTRO_SEC = "v33_playback_skip_intro_sec"
        private const val KEY_V33_DANMAKU_CUSTOM_FONT_PATH = "v33_danmaku_custom_font_path"
        private const val KEY_V33_AUDIO_GAIN_DB = "v33_audio_gain_db"
        private const val KEY_V33_PLAYER_SEEK_BAR_CHAPTER = "v33_player_seek_bar_chapter"
        private const val KEY_V33_VIDEO_ROTATION_LOCK = "v33_video_rotation_lock"
        private const val KEY_V33_DANMAKU_REPEAT_FILTER = "v33_danmaku_repeat_filter"
        private const val KEY_V33_SUBTITLE_SHADOW_OFFSET = "v33_subtitle_shadow_offset"
        private const val KEY_V33_PLAYLIST_REVERSE_ORDER = "v33_playlist_reverse_order"
        private const val KEY_V34_DANMAKU_MAX_DISPLAY_SEC = "v34_danmaku_max_display_sec"
        private const val KEY_V34_VIDEO_BRIGHTNESS_SENSOR = "v34_video_brightness_sensor"
        private const val KEY_V34_AUDIO_COMPRESSOR_THRESHOLD = "v34_audio_compressor_threshold"
        private const val KEY_V34_PLAYER_GESTURE_CUSTOM_MAP = "v34_player_gesture_custom_map"
        private const val KEY_V34_DANMAKU_SHIELD_REGEX = "v34_danmaku_shield_regex"
        private const val KEY_V34_SUBTITLE_KARAOKE_MODE = "v34_subtitle_karaoke_mode"
        private const val KEY_V34_VIDEO_SCAN_LINE_FILTER = "v34_video_scan_line_filter"
        private const val KEY_V34_PLAYBACK_AUTO_PAUSE_ON_HEADSET = "v34_playback_auto_pause_on_headset"
        private const val KEY_V34_DANMAKU_MIRROR_FLIP = "v34_danmaku_mirror_flip"
        private const val KEY_V34_AUDIO_EQ_PRESET = "v34_audio_eq_preset"
        private const val KEY_V34_PLAYER_VOLUME_BOOST = "v34_player_volume_boost"
        private const val KEY_V34_VIDEO_PIXEL_ART_MODE = "v34_video_pixel_art_mode"
        private const val KEY_V34_DANMAKU_FONT_SIZE_MIN = "v34_danmaku_font_size_min"
        private const val KEY_V34_SUBTITLE_TEXT_COLOR_CUSTOM = "v34_subtitle_text_color_custom"
        private const val KEY_V34_PLAYLIST_REPEAT_SINGLE = "v34_playlist_repeat_single"
        private const val KEY_V35_VIDEO_FRAME_RATE_OVERRIDE = "v35_video_frame_rate_override"
        private const val KEY_V35_DANMAKU_SENDER_AVATAR = "v35_danmaku_sender_avatar"
        private const val KEY_V35_AUDIO_SPATIAL_WIDTH = "v35_audio_spatial_width"
        private const val KEY_V35_PLAYER_AUTO_FULLSCREEN_LANDSCAPE = "v35_player_auto_fullscreen_landscape"
        private const val KEY_V35_DANMAKU_PINYIN_CONVERT = "v35_danmaku_pinyin_convert"
        private const val KEY_V35_SUBTITLE_POSITION_TOP = "v35_subtitle_position_top"
        private const val KEY_V35_VIDEO_VIGNETTE_EFFECT = "v35_video_vignette_effect"
        private const val KEY_V35_PLAYBACK_PRELOAD_ON_WIFI = "v35_playback_preload_on_wifi"
        private const val KEY_V35_DANMAKU_GRADIENT_COLOR = "v35_danmaku_gradient_color"
        private const val KEY_V35_AUDIO_LOUDNESS_NORMALIZE = "v35_audio_loudness_normalize"
        private const val KEY_V35_PLAYER_MINI_WINDOW = "v35_player_mini_window"
        private const val KEY_V35_VIDEO_NOISE_REDUCTION = "v35_video_noise_reduction"
        private const val KEY_V35_DANMAKU_ANIMATION_SPEED = "v35_danmaku_animation_speed"
        private const val KEY_V35_SUBTITLE_LINE_SPACING = "v35_subtitle_line_spacing"
        private const val KEY_V35_PLAYLIST_SMART_SHUFFLE = "v35_playlist_smart_shuffle"
        private const val KEY_V36_VIDEO_ASPECT_FIT_MODE = "v36_video_aspect_fit_mode"
        private const val KEY_V36_DANMAKU_OPACITY_PER_TYPE = "v36_danmaku_opacity_per_type"
        private const val KEY_V36_AUDIO_VOICE_ISOLATE = "v36_audio_voice_isolate"
        private const val KEY_V36_PLAYER_SKIP_OUTRO_SEC = "v36_player_skip_outro_sec"
        private const val KEY_V36_DANMAKU_AUTO_SCALE = "v36_danmaku_auto_scale"
        private const val KEY_V36_SUBTITLE_EDGE_BLUR = "v36_subtitle_edge_blur"
        private const val KEY_V36_VIDEO_COLOR_LUT_PRESET = "v36_video_color_lut_preset"
        private const val KEY_V36_PLAYBACK_SPEED_PITCH_CORRECT = "v36_playback_speed_pitch_correct"
        private const val KEY_V36_DANMAKU_BLOCK_LENGTH = "v36_danmaku_block_length"
        private const val KEY_V36_AUDIO_DELAY_MS = "v36_audio_delay_ms"
        private const val KEY_V36_PLAYER_SWIPE_BRIGHTNESS_CURVE = "v36_player_swipe_brightness_curve"
        private const val KEY_V36_VIDEO_SHARPEN_EDGE_MODE = "v36_video_sharpen_edge_mode"
        private const val KEY_V36_DANMAKU_FAN_BADGE = "v36_danmaku_fan_badge"
        private const val KEY_V36_SUBTITLE_FONT_WEIGHT_CUSTOM = "v36_subtitle_font_weight_custom"
        private const val KEY_V36_PLAYLIST_AUTOPLAY_NEXT_EPISODE = "v36_playlist_autoplay_next_episode"
        private const val KEY_V37_VIDEO_BLACK_BAR_DETECT = "v37_video_black_bar_detect"
        private const val KEY_V37_DANMAKU_GROUP_MERGE = "v37_danmaku_group_merge"
        private const val KEY_V37_AUDIO_STEREO_WIDTH = "v37_audio_stereo_width"
        private const val KEY_V37_PLAYER_RESUME_THRESHOLD = "v37_player_resume_threshold"
        private const val KEY_V37_DANMAKU_FURIGANA_SHOW = "v37_danmaku_furigana_show"
        private const val KEY_V37_SUBTITLE_OUTLINE_COLOR = "v37_subtitle_outline_color"
        private const val KEY_V37_VIDEO_FPS_COUNTER = "v37_video_fps_counter"
        private const val KEY_V37_PLAYBACK_BUFFER_STRATEGY = "v37_playback_buffer_strategy"
        private const val KEY_V37_DANMAKU_LEVEL_SHIELD = "v37_danmaku_level_shield"
        private const val KEY_V37_AUDIO_REVERB_PRESET = "v37_audio_reverb_preset"
        private const val KEY_V37_PLAYER_LONG_PRESS_SPEED = "v37_player_long_press_speed"
        private const val KEY_V37_VIDEO_INTERPOLATION_MODE = "v37_video_interpolation_mode"

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
}
