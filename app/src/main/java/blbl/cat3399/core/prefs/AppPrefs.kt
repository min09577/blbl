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
    
    // v31.1: 视频播放列表自动跳过片头
    
    // v31.2: 弹幕字体背景渐变
    
    // v31.3: 视频画面色彩对比度曲线
    
    // v31.4: 弹幕发送确认震动间隔
    
    // v31.5: 播放器音量限制模式切换
    
    // v31.6: 视频缓存清理优先级
    
    // v31.7: 弹幕显示位置对齐偏移
    
    // v31.8: 视频画面色彩饱和度曲线
    
    // v31.9: 弹幕发送历史记录搜索
    
    // v31.10: 播放器进度条动画
    
    // v31.11: 视频投射画面缓冲策略
    // v31.12: 弹幕字体背景渐变方向
    
    // v31.13: 播放器手势滑动阈值
    
    // v31.14: 视频画面色彩亮度曲线
    
    // v31.15: 弹幕显示字体发光颜色
    
    // v32.1: 视频播放列表自动跳过片尾
    
    // v32.2: 弹幕字体背景渐变颜色
    
    // v32.3: 视频画面色彩色调曲线
    
    // v32.4: 弹幕发送确认震动强度曲线
    
    // v32.5: 播放器音量限制阈值曲线
    
    // v32.6: 视频缓存清理策略曲线
    
    // v32.7: 弹幕显示位置对齐方式曲线
    
    // v32.8: 视频画面色彩降噪曲线
    
    // v32.9: 弹幕发送历史记录导出格式
    
    // v32.10: 播放器进度条颜色渐变
    
    // v32.11: 视频投射画面延迟策略
    
    // v32.12: 弹幕字体背景渐变透明度
    
    // v32.13: 播放器手势滑动速度
    
    // v32.14: 视频画面色彩模糊曲线
    
    // v32.15: 弹幕显示字体发光强度
    
    // v33.1: 视频播放列表自动排序方式
    
    // v33.2: 弹幕字体背景渐变位置
    
    // v33.3: 视频画面色彩锐化曲线
    
    // v33.4: 弹幕发送确认震动模式曲线
    
    // v33.5: 播放器音量限制阈值模式
    
    // v33.6: 视频缓存清理模式曲线
    
    // v33.7: 弹幕显示位置对齐偏移曲线
    
    // v33.8: 视频画面色彩对比度曲线
    // v33.9: 弹幕发送历史记录导入格式
    
    // v33.10: 播放器进度条颜色渐变方向
    
    // v33.11: 视频投射画面缓冲策略曲线
    
    // v33.12: 弹幕字体背景渐变速度
    
    // v33.13: 播放器手势滑动方向
    
    // v33.14: 视频画面色彩饱和度曲线
    // v33.15: 弹幕显示字体发光颜色
    // v34.1: 视频播放列表自动循环模式
    
    // v34.2: 弹幕字体背景渐变类型
    
    // v34.3: 视频画面色彩色调曲线
    // v34.4: 弹幕发送确认震动强度曲线
    // v34.5: 播放器音量限制阈值曲线
    // v34.6: 视频缓存清理策略曲线
    // v34.7: 弹幕显示位置对齐方式曲线
    // v34.8: 视频画面色彩降噪曲线
    // v34.9: 弹幕发送历史记录导出格式
    // v34.10: 播放器进度条颜色渐变
    // v34.11: 视频投射画面延迟策略
    // v34.12: 弹幕字体背景渐变透明度
    // v34.13: 播放器手势滑动速度
    // v34.14: 视频画面色彩模糊曲线
    // v34.15: 弹幕显示字体发光强度
    // v35.1: 视频播放列表自动跳过片头片尾
    
    // v35.2: 弹幕字体背景渐变颜色自定义
    
    // v35.3: 视频画面色彩对比度自定义
    
    // v35.4: 弹幕发送确认震动自定义
    
    // v35.5: 播放器音量限制自定义
    
    // v35.6: 视频缓存清理自定义
    
    // v35.7: 弹幕显示位置对齐自定义
    
    // v35.8: 视频画面色彩饱和度自定义
    
    // v35.9: 弹幕发送历史记录自定义
    
    // v35.10: 播放器进度条颜色自定义
    
    // v35.11: 视频投射画面缓冲自定义
    
    // v35.12: 弹幕字体背景渐变自定义
    
    // v35.13: 播放器手势滑动自定义
    
    // v35.14: 视频画面色彩亮度自定义
    
    // v35.15: 弹幕显示字体发光自定义
    
    // v36.1: 视频播放速度记忆
    
    // v36.2: 弹幕字体描边颜色
    
    // v36.3: 视频画面色彩色温
    // v36.4: 弹幕发送确认震动模式
    
    // v36.5: 播放器音量步进值
    // v36.6: 视频缓存大小限制
    
    // v36.7: 弹幕显示区域限制
    
    // v36.8: 视频画面色彩伽马
    // v36.9: 弹幕发送历史记录搜索
    // v36.10: 播放器进度条样式
    // v36.11: 视频投射画面分辨率
    
    // v36.12: 弹幕字体背景模糊
    
    // v36.13: 播放器手势长按速度
    // v36.14: 视频画面色彩色调偏移
    
    // v36.15: 弹幕显示字体发光颜色
    // v37.1: 视频播放列表随机播放
    // v37.2: 弹幕字体阴影颜色
    // v37.3: 视频画面色彩鲜艳度
    
    // v37.4: 弹幕发送确认震动衰减
    
    // v37.5: 播放器音量淡入淡出
    // v37.6: 视频缓存预加载
    
    // v37.7: 弹幕显示滚动速度
    
    // v37.8: 视频画面色彩色阶
    
    // v37.9: 弹幕发送历史记录导出
    // v37.10: 播放器进度条高度
    // v37.11: 视频投射画面码率
    
    // v37.12: 弹幕字体背景边框颜色
    // v37.13: 播放器手势双击功能
    
    // v37.14: 视频画面色彩色调饱和度
    
    // v37.15: 弹幕显示字体发光强度
    
    // v38.1: 视频播放列表循环模式
    // v38.2: 弹幕字体背景圆角
    
    // v38.3: 视频画面色彩对比度曲线
    // v38.4: 弹幕发送确认震动频率
    
    // v38.5: 播放器音量限制模式
    // v38.6: 视频缓存清理策略
    // v38.7: 弹幕显示位置偏移X
    
    // v38.8: 视频画面色彩亮度曲线
    // v38.9: 弹幕发送历史记录搜索模式
    
    // v38.10: 播放器进度条动画
    // v38.11: 视频投射画面延迟
    // v38.12: 弹幕字体背景渐变方向
    
    // v38.13: 播放器手势滑动灵敏度
    
    // v38.14: 视频画面色彩饱和度曲线
    // v38.15: 弹幕显示字体描边宽度
    
    // v39.1: 视频播放列表自动跳过
    
    // v39.2: 弹幕字体背景透明度曲线
    
    // v39.3: 视频画面色彩锐化强度
    // v39.4: 弹幕发送确认震动模式曲线
    
    // v39.5: 播放器音量平衡
    // v39.6: 视频缓存预加载大小
    // v39.7: 弹幕显示位置偏移Y
    
    // v39.8: 视频画面色彩降噪强度
    // v39.9: 弹幕发送历史记录自动清理
    
    // v39.10: 播放器进度条颜色渐变
    
    // v39.11: 视频投射画面缓冲策略
    // v39.12: 弹幕字体背景渐变速度
    
    // v39.13: 播放器手势长按功能
    
    // v39.14: 视频画面色彩模糊强度
    // v39.15: 弹幕显示字体发光模式
    
    // v40.1: 视频播放列表智能排序
    
    // v40.2: 弹幕字体背景渐变颜色
    
    // v40.3: 视频画面色彩色调曲线
    // v40.4: 弹幕发送确认震动强度曲线
    
    // v40.5: 播放器音量限制阈值曲线
    
    // v40.6: 视频缓存清理策略曲线
    
    // v40.7: 弹幕显示位置对齐方式曲线
    
    // v40.8: 视频画面色彩降噪曲线
    // v40.9: 弹幕发送历史记录导出格式
    // v40.10: 播放器进度条颜色渐变方向
    
    // v40.11: 视频投射画面延迟策略
    // v40.12: 弹幕字体背景渐变透明度
    
    // v40.13: 播放器手势滑动速度
    
    // v40.14: 视频画面色彩模糊曲线
    // v40.15: 弹幕显示字体发光强度
    // ===== v41.x 系列 =====
    // v41.1: 视频播放速度记忆
    // v41.2: 弹幕发送确认震动模式
    // v41.3: 视频画面色彩自动调节
    // v41.4: 播放器音量增强模式
    // v41.5: 弹幕字体描边样式
    // v41.6: 视频投射画面色彩校正
    // v41.7: 播放器手势自定义映射
    // v41.8: 弹幕显示密度限制
    // v41.9: 视频缓存智能清理
    // v41.10: 播放器进度条缓冲显示
    // v41.11: 弹幕发送确认震动反馈
    // v41.12: 视频画面色彩HDR模拟
    // v41.13: 播放器音量限制模式增强
    // v41.14: 弹幕字体背景圆角增强
    // v41.15: 视频投射音频编码格式

    // ===== v42.x 系列 =====
    // v42.1: 弹幕显示字体描边颜色
    // v42.2: 视频画面色彩对比度自动
    // v42.3: 播放器手势震动反馈
    // v42.4: 弹幕发送历史记录统计
    // v42.5: 视频缓存大小自动调整
    // v42.6: 播放器进度条颜色自定义
    // v42.7: 弹幕字体背景渐变增强
    // v42.8: 视频投射画面色彩增强
    // v42.9: 播放器音量步进值自定义
    // v42.10: 弹幕显示位置智能调整
    // v42.11: 视频画面色彩饱和度自动
    // v42.12: 播放器手势长按震动
    // v42.13: 弹幕发送确认震动持续时间
    // v42.14: 视频缓存预加载策略
    // v42.15: 播放器进度条缓冲颜色

    // ===== v43.x 系列 =====
    // v43.1: 视频画面色彩色调自动
    // v43.2: 弹幕字体背景透明度
    // v43.3: 播放器手势双击震动
    // v43.4: 弹幕发送历史记录备份
    // v43.5: 视频缓存清理策略增强
    // v43.6: 播放器进度条渐变增强
    // v43.7: 弹幕字体阴影增强
    // v43.8: 视频投射画面分辨率增强
    // v43.9: 播放器音量限制曲线增强
    // v43.10: 弹幕显示字体发光增强
    // v43.11: 视频画面色彩亮度自动
    // v43.12: 播放器手势滑动震动
    // v43.13: 弹幕发送确认震动模式增强
    // v43.14: 视频缓存预加载大小增强
    // v43.15: 播放器进度条动画增强

    // ===== v44.x 系列 =====
    // v44.1: 视频画面色彩降噪增强
    // v44.2: 弹幕字体描边宽度增强
    // v44.3: 播放器手势长按速度增强
    // v44.4: 弹幕发送历史记录搜索增强
    // v44.5: 视频投射画面码率增强
    // v44.6: 播放器进度条高度增强
    // v44.7: 弹幕字体背景边框增强
    // v44.8: 视频画面色彩模糊增强
    // v44.9: 播放器音量淡入淡出增强
    // v44.10: 弹幕显示滚动速度增强
    // v44.11: 视频投射画面延迟增强
    // v44.12: 播放器手势滑动灵敏度增强
    // v44.13: 弹幕发送确认震动频率增强
    // v44.14: 视频缓存清理策略曲线增强
    // v44.15: 播放器进度条颜色渐变方向增强

    // ===== v45.x 系列 =====
    // v45.1: 视频画面色彩锐化增强
    // v45.2: 弹幕字体背景圆角增强
    // v45.3: 播放器手势双击功能增强
    // v45.4: 弹幕发送历史记录导出增强
    // v45.5: 视频投射画面缓冲策略增强
    // v45.6: 播放器进度条样式增强
    // v45.7: 弹幕字体背景渐变速度增强
    // v45.8: 视频画面色彩鲜艳度增强
    // v45.9: 播放器音量平衡增强
    // v45.10: 弹幕显示位置偏移增强
    // v45.11: 视频投射音频编码增强
    // v45.12: 播放器手势震动模式增强
    // v45.13: 弹幕发送确认震动强度增强
    // v45.14: 视频缓存智能清理增强
    // v45.15: 播放器进度条缓冲显示增强

