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
    
    // v31.1: 视频播放列表自动跳过片头
    var v31AutoSkipIntro: Boolean
        get() = prefs.getBoolean(KEY_V31_AUTO_SKIP_INTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_AUTO_SKIP_INTRO, value).apply()
    
    // v31.2: 弹幕字体背景渐变
    var v31DanmakuBackgroundGradient: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT, value.coerceIn(0, 5)).apply()
    
    // v31.3: 视频画面色彩对比度曲线
    var v31ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V31_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_COLOR_CONTRAST_CURVE, value.coerceIn(0, 3)).apply()
    
    // v31.4: 弹幕发送确认震动间隔
    var v31VibrationInterval: Int
        get() = prefs.getInt(KEY_V31_VIBRATION_INTERVAL, 0)
        set(value) = prefs.edit().putInt(KEY_V31_VIBRATION_INTERVAL, value.coerceIn(0, 500)).apply()
    
    // v31.5: 播放器音量限制模式切换
    var v31VolumeLimitModeSwitch: Boolean
        get() = prefs.getBoolean(KEY_V31_VOLUME_LIMIT_MODE_SWITCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_VOLUME_LIMIT_MODE_SWITCH, value).apply()
    
    // v31.6: 视频缓存清理优先级
    var v31CacheCleanupPriority: Int
        get() = prefs.getInt(KEY_V31_CACHE_CLEANUP_PRIORITY, 0)
        set(value) = prefs.edit().putInt(KEY_V31_CACHE_CLEANUP_PRIORITY, value.coerceIn(0, 3)).apply()
    
    // v31.7: 弹幕显示位置对齐偏移
    var v31DanmakuPositionAlignOffset: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_POSITION_ALIGN_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_POSITION_ALIGN_OFFSET, value.coerceIn(-50, 50)).apply()
    
    // v31.8: 视频画面色彩饱和度曲线
    var v31ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V31_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_COLOR_SATURATION_CURVE, value.coerceIn(0, 3)).apply()
    
    // v31.9: 弹幕发送历史记录搜索
    var v31HistorySearch: Boolean
        get() = prefs.getBoolean(KEY_V31_HISTORY_SEARCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V31_HISTORY_SEARCH, value).apply()
    
    // v31.10: 播放器进度条动画
    var v31ProgressBarAnimation: Int
        get() = prefs.getInt(KEY_V31_PROGRESS_BAR_ANIMATION, 0)
        set(value) = prefs.edit().putInt(KEY_V31_PROGRESS_BAR_ANIMATION, value.coerceIn(0, 4)).apply()
    
    // v31.11: 视频投射画面缓冲策略
    var v31CastBufferStrategy: Int
        get() = prefs.getInt(KEY_V31_CAST_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V31_CAST_BUFFER_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v31.12: 弹幕字体背景渐变方向
    var v31DanmakuBackgroundGradientDirection: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_BACKGROUND_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v31.13: 播放器手势滑动阈值
    var v31SwipeThreshold: Int
        get() = prefs.getInt(KEY_V31_SWIPE_THRESHOLD, 50)
        set(value) = prefs.edit().putInt(KEY_V31_SWIPE_THRESHOLD, value.coerceIn(10, 100)).apply()
    
    // v31.14: 视频画面色彩亮度曲线
    var v31ColorBrightnessCurve: Int
        get() = prefs.getInt(KEY_V31_COLOR_BRIGHTNESS_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V31_COLOR_BRIGHTNESS_CURVE, value.coerceIn(0, 3)).apply()
    
    // v31.15: 弹幕显示字体发光颜色
    var v31DanmakuFontGlowColor: Int
        get() = prefs.getInt(KEY_V31_DANMAKU_FONT_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V31_DANMAKU_FONT_GLOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v32.1: 视频播放列表自动跳过片尾
    var v32AutoSkipOutro: Boolean
        get() = prefs.getBoolean(KEY_V32_AUTO_SKIP_OUTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V32_AUTO_SKIP_OUTRO, value).apply()
    
    // v32.2: 弹幕字体背景渐变颜色
    var v32DanmakuBackgroundGradientColor: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_COLOR, value.coerceIn(0, 5)).apply()
    
    // v32.3: 视频画面色彩色调曲线
    var v32ColorHueCurve: Int
        get() = prefs.getInt(KEY_V32_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_COLOR_HUE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.4: 弹幕发送确认震动强度曲线
    var v32VibrationStrengthCurve: Int
        get() = prefs.getInt(KEY_V32_VIBRATION_STRENGTH_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_VIBRATION_STRENGTH_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.5: 播放器音量限制阈值曲线
    var v32VolumeLimitThresholdCurve: Int
        get() = prefs.getInt(KEY_V32_VOLUME_LIMIT_THRESHOLD_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_VOLUME_LIMIT_THRESHOLD_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.6: 视频缓存清理策略曲线
    var v32CacheCleanupStrategyCurve: Int
        get() = prefs.getInt(KEY_V32_CACHE_CLEANUP_STRATEGY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_CACHE_CLEANUP_STRATEGY_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.7: 弹幕显示位置对齐方式曲线
    var v32DanmakuPositionAlignModeCurve: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_POSITION_ALIGN_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_POSITION_ALIGN_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.8: 视频画面色彩降噪曲线
    var v32ColorDenoiseCurve: Int
        get() = prefs.getInt(KEY_V32_COLOR_DENOISE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_COLOR_DENOISE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.9: 弹幕发送历史记录导出格式
    var v32HistoryExportFormat: Int
        get() = prefs.getInt(KEY_V32_HISTORY_EXPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V32_HISTORY_EXPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v32.10: 播放器进度条颜色渐变
    var v32ProgressBarColorGradient: Int
        get() = prefs.getInt(KEY_V32_PROGRESS_BAR_COLOR_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V32_PROGRESS_BAR_COLOR_GRADIENT, value.coerceIn(0, 5)).apply()
    
    // v32.11: 视频投射画面延迟策略
    var v32CastLatencyStrategy: Int
        get() = prefs.getInt(KEY_V32_CAST_LATENCY_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V32_CAST_LATENCY_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v32.12: 弹幕字体背景渐变透明度
    var v32DanmakuBackgroundGradientOpacity: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_BACKGROUND_GRADIENT_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v32.13: 播放器手势滑动速度
    var v32SwipeSpeed: Int
        get() = prefs.getInt(KEY_V32_SWIPE_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V32_SWIPE_SPEED, value.coerceIn(10, 100)).apply()
    
    // v32.14: 视频画面色彩模糊曲线
    var v32ColorBlurCurve: Int
        get() = prefs.getInt(KEY_V32_COLOR_BLUR_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V32_COLOR_BLUR_CURVE, value.coerceIn(0, 3)).apply()
    
    // v32.15: 弹幕显示字体发光强度
    var v32DanmakuFontGlowStrength: Int
        get() = prefs.getInt(KEY_V32_DANMAKU_FONT_GLOW_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V32_DANMAKU_FONT_GLOW_STRENGTH, value.coerceIn(0, 100)).apply()
    
    // v33.1: 视频播放列表自动排序方式
    var v33AutoSortMode: Int
        get() = prefs.getInt(KEY_V33_AUTO_SORT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_AUTO_SORT_MODE, value.coerceIn(0, 4)).apply()
    
    // v33.2: 弹幕字体背景渐变位置
    var v33DanmakuBackgroundGradientPosition: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_POSITION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_POSITION, value.coerceIn(0, 3)).apply()
    
    // v33.3: 视频画面色彩锐化曲线
    var v33ColorSharpenCurve: Int
        get() = prefs.getInt(KEY_V33_COLOR_SHARPEN_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_COLOR_SHARPEN_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.4: 弹幕发送确认震动模式曲线
    var v33VibrationModeCurve: Int
        get() = prefs.getInt(KEY_V33_VIBRATION_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_VIBRATION_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.5: 播放器音量限制阈值模式
    var v33VolumeLimitThresholdMode: Int
        get() = prefs.getInt(KEY_V33_VOLUME_LIMIT_THRESHOLD_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_VOLUME_LIMIT_THRESHOLD_MODE, value.coerceIn(0, 3)).apply()
    
    // v33.6: 视频缓存清理模式曲线
    var v33CacheCleanupModeCurve: Int
        get() = prefs.getInt(KEY_V33_CACHE_CLEANUP_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_CACHE_CLEANUP_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.7: 弹幕显示位置对齐偏移曲线
    var v33DanmakuPositionAlignOffsetCurve: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_POSITION_ALIGN_OFFSET_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_POSITION_ALIGN_OFFSET_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.8: 视频画面色彩对比度曲线
    var v33ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V33_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_COLOR_CONTRAST_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.9: 弹幕发送历史记录导入格式
    var v33HistoryImportFormat: Int
        get() = prefs.getInt(KEY_V33_HISTORY_IMPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V33_HISTORY_IMPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v33.10: 播放器进度条颜色渐变方向
    var v33ProgressBarColorGradientDirection: Int
        get() = prefs.getInt(KEY_V33_PROGRESS_BAR_COLOR_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_PROGRESS_BAR_COLOR_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v33.11: 视频投射画面缓冲策略曲线
    var v33CastBufferStrategyCurve: Int
        get() = prefs.getInt(KEY_V33_CAST_BUFFER_STRATEGY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_CAST_BUFFER_STRATEGY_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.12: 弹幕字体背景渐变速度
    var v33DanmakuBackgroundGradientSpeed: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_BACKGROUND_GRADIENT_SPEED, value.coerceIn(0, 100)).apply()
    
    // v33.13: 播放器手势滑动方向
    var v33SwipeDirection: Int
        get() = prefs.getInt(KEY_V33_SWIPE_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V33_SWIPE_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v33.14: 视频画面色彩饱和度曲线
    var v33ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V33_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V33_COLOR_SATURATION_CURVE, value.coerceIn(0, 3)).apply()
    
    // v33.15: 弹幕显示字体发光颜色
    var v33DanmakuFontGlowColor: Int
        get() = prefs.getInt(KEY_V33_DANMAKU_FONT_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V33_DANMAKU_FONT_GLOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v34.1: 视频播放列表自动循环模式
    var v34AutoLoopMode: Int
        get() = prefs.getInt(KEY_V34_AUTO_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_AUTO_LOOP_MODE, value.coerceIn(0, 3)).apply()
    
    // v34.2: 弹幕字体背景渐变类型
    var v34DanmakuBackgroundGradientType: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_TYPE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_TYPE, value.coerceIn(0, 4)).apply()
    
    // v34.3: 视频画面色彩色调曲线
    var v34ColorHueCurve: Int
        get() = prefs.getInt(KEY_V34_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_COLOR_HUE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.4: 弹幕发送确认震动强度曲线
    var v34VibrationStrengthCurve: Int
        get() = prefs.getInt(KEY_V34_VIBRATION_STRENGTH_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_VIBRATION_STRENGTH_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.5: 播放器音量限制阈值曲线
    var v34VolumeLimitThresholdCurve: Int
        get() = prefs.getInt(KEY_V34_VOLUME_LIMIT_THRESHOLD_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_VOLUME_LIMIT_THRESHOLD_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.6: 视频缓存清理策略曲线
    var v34CacheCleanupStrategyCurve: Int
        get() = prefs.getInt(KEY_V34_CACHE_CLEANUP_STRATEGY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_CACHE_CLEANUP_STRATEGY_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.7: 弹幕显示位置对齐方式曲线
    var v34DanmakuPositionAlignModeCurve: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_POSITION_ALIGN_MODE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_POSITION_ALIGN_MODE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.8: 视频画面色彩降噪曲线
    var v34ColorDenoiseCurve: Int
        get() = prefs.getInt(KEY_V34_COLOR_DENOISE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_COLOR_DENOISE_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.9: 弹幕发送历史记录导出格式
    var v34HistoryExportFormat: Int
        get() = prefs.getInt(KEY_V34_HISTORY_EXPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V34_HISTORY_EXPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v34.10: 播放器进度条颜色渐变
    var v34ProgressBarColorGradient: Int
        get() = prefs.getInt(KEY_V34_PROGRESS_BAR_COLOR_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V34_PROGRESS_BAR_COLOR_GRADIENT, value.coerceIn(0, 5)).apply()
    
    // v34.11: 视频投射画面延迟策略
    var v34CastLatencyStrategy: Int
        get() = prefs.getInt(KEY_V34_CAST_LATENCY_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V34_CAST_LATENCY_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v34.12: 弹幕字体背景渐变透明度
    var v34DanmakuBackgroundGradientOpacity: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_BACKGROUND_GRADIENT_OPACITY, value.coerceIn(0, 100)).apply()
    
    // v34.13: 播放器手势滑动速度
    var v34SwipeSpeed: Int
        get() = prefs.getInt(KEY_V34_SWIPE_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V34_SWIPE_SPEED, value.coerceIn(10, 100)).apply()
    
    // v34.14: 视频画面色彩模糊曲线
    var v34ColorBlurCurve: Int
        get() = prefs.getInt(KEY_V34_COLOR_BLUR_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V34_COLOR_BLUR_CURVE, value.coerceIn(0, 3)).apply()
    
    // v34.15: 弹幕显示字体发光强度
    var v34DanmakuFontGlowStrength: Int
        get() = prefs.getInt(KEY_V34_DANMAKU_FONT_GLOW_STRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V34_DANMAKU_FONT_GLOW_STRENGTH, value.coerceIn(0, 100)).apply()
    
    // v35.1: 视频播放列表自动跳过片头片尾
    var v35AutoSkipIntroOutro: Boolean
        get() = prefs.getBoolean(KEY_V35_AUTO_SKIP_INTRO_OUTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V35_AUTO_SKIP_INTRO_OUTRO, value).apply()
    
    // v35.2: 弹幕字体背景渐变颜色自定义
    var v35DanmakuBackgroundGradientCustomColor: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM_COLOR, value.coerceIn(0, 5)).apply()
    
    // v35.3: 视频画面色彩对比度自定义
    var v35ColorContrastCustom: Int
        get() = prefs.getInt(KEY_V35_COLOR_CONTRAST_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_COLOR_CONTRAST_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.4: 弹幕发送确认震动自定义
    var v35VibrationCustom: Int
        get() = prefs.getInt(KEY_V35_VIBRATION_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_VIBRATION_CUSTOM, value.coerceIn(0, 100)).apply()
    
    // v35.5: 播放器音量限制自定义
    var v35VolumeLimitCustom: Int
        get() = prefs.getInt(KEY_V35_VOLUME_LIMIT_CUSTOM, 100)
        set(value) = prefs.edit().putInt(KEY_V35_VOLUME_LIMIT_CUSTOM, value.coerceIn(50, 150)).apply()
    
    // v35.6: 视频缓存清理自定义
    var v35CacheCleanupCustom: Int
        get() = prefs.getInt(KEY_V35_CACHE_CLEANUP_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_CACHE_CLEANUP_CUSTOM, value.coerceIn(0, 1000)).apply()
    
    // v35.7: 弹幕显示位置对齐自定义
    var v35DanmakuPositionAlignCustom: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_POSITION_ALIGN_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_POSITION_ALIGN_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.8: 视频画面色彩饱和度自定义
    var v35ColorSaturationCustom: Int
        get() = prefs.getInt(KEY_V35_COLOR_SATURATION_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_COLOR_SATURATION_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.9: 弹幕发送历史记录自定义
    var v35HistoryCustom: Int
        get() = prefs.getInt(KEY_V35_HISTORY_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_HISTORY_CUSTOM, value.coerceIn(0, 100)).apply()
    
    // v35.10: 播放器进度条颜色自定义
    var v35ProgressBarColorCustom: Int
        get() = prefs.getInt(KEY_V35_PROGRESS_BAR_COLOR_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_PROGRESS_BAR_COLOR_CUSTOM, value.coerceIn(0, 5)).apply()
    
    // v35.11: 视频投射画面缓冲自定义
    var v35CastBufferCustom: Int
        get() = prefs.getInt(KEY_V35_CAST_BUFFER_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_CAST_BUFFER_CUSTOM, value.coerceIn(0, 30)).apply()
    
    // v35.12: 弹幕字体背景渐变自定义
    var v35DanmakuBackgroundGradientCustom: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_BACKGROUND_GRADIENT_CUSTOM, value.coerceIn(0, 5)).apply()
    
    // v35.13: 播放器手势滑动自定义
    var v35SwipeCustom: Int
        get() = prefs.getInt(KEY_V35_SWIPE_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_SWIPE_CUSTOM, value.coerceIn(0, 5)).apply()
    
    // v35.14: 视频画面色彩亮度自定义
    var v35ColorBrightnessCustom: Int
        get() = prefs.getInt(KEY_V35_COLOR_BRIGHTNESS_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_COLOR_BRIGHTNESS_CUSTOM, value.coerceIn(-50, 50)).apply()
    
    // v35.15: 弹幕显示字体发光自定义
    var v35DanmakuFontGlowCustom: Int
        get() = prefs.getInt(KEY_V35_DANMAKU_FONT_GLOW_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V35_DANMAKU_FONT_GLOW_CUSTOM, value.coerceIn(0, 100)).apply()
    
    // v36.1: 视频播放速度记忆
    var v36PlaybackSpeedMemory: Boolean
        get() = prefs.getBoolean(KEY_V36_PLAYBACK_SPEED_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_PLAYBACK_SPEED_MEMORY, value).apply()
    
    // v36.2: 弹幕字体描边颜色
    var v36DanmakuFontStrokeColor: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_FONT_STROKE_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_FONT_STROKE_COLOR, value.coerceIn(0, 5)).apply()
    
    // v36.3: 视频画面色彩色温
    var v36ColorTemperature: Int
        get() = prefs.getInt(KEY_V36_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_COLOR_TEMPERATURE, value.coerceIn(-50, 50)).apply()
    
    // v36.4: 弹幕发送确认震动模式
    var v36VibrationPattern: Int
        get() = prefs.getInt(KEY_V36_VIBRATION_PATTERN, 0)
        set(value) = prefs.edit().putInt(KEY_V36_VIBRATION_PATTERN, value.coerceIn(0, 5)).apply()
    
    // v36.5: 播放器音量步进值
    var v36VolumeStep: Int
        get() = prefs.getInt(KEY_V36_VOLUME_STEP, 5)
        set(value) = prefs.edit().putInt(KEY_V36_VOLUME_STEP, value.coerceIn(1, 20)).apply()
    
    // v36.6: 视频缓存大小限制
    var v36CacheSizeLimit: Int
        get() = prefs.getInt(KEY_V36_CACHE_SIZE_LIMIT, 500)
        set(value) = prefs.edit().putInt(KEY_V36_CACHE_SIZE_LIMIT, value.coerceIn(100, 2000)).apply()
    
    // v36.7: 弹幕显示区域限制
    var v36DanmakuDisplayArea: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_DISPLAY_AREA, 100)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_DISPLAY_AREA, value.coerceIn(25, 100)).apply()
    
    // v36.8: 视频画面色彩伽马
    var v36ColorGamma: Int
        get() = prefs.getInt(KEY_V36_COLOR_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V36_COLOR_GAMMA, value.coerceIn(-50, 50)).apply()
    
    // v36.9: 弹幕发送历史记录搜索
    var v36HistorySearch: Boolean
        get() = prefs.getBoolean(KEY_V36_HISTORY_SEARCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V36_HISTORY_SEARCH, value).apply()
    
    // v36.10: 播放器进度条样式
    var v36ProgressBarStyle: Int
        get() = prefs.getInt(KEY_V36_PROGRESS_BAR_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V36_PROGRESS_BAR_STYLE, value.coerceIn(0, 5)).apply()
    
    // v36.11: 视频投射画面分辨率
    var v36CastResolution: Int
        get() = prefs.getInt(KEY_V36_CAST_RESOLUTION, 0)
        set(value) = prefs.edit().putInt(KEY_V36_CAST_RESOLUTION, value.coerceIn(0, 5)).apply()
    
    // v36.12: 弹幕字体背景模糊
    var v36DanmakuBackgroundBlur: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_BACKGROUND_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_BACKGROUND_BLUR, value.coerceIn(0, 20)).apply()
    
    // v36.13: 播放器手势长按速度
    var v36GestureLongPressSpeed: Float
        get() = prefs.getFloat(KEY_V36_GESTURE_LONG_PRESS_SPEED, 2.0f)
        set(value) = prefs.edit().putFloat(KEY_V36_GESTURE_LONG_PRESS_SPEED, value.coerceIn(0.5f, 5.0f)).apply()
    
    // v36.14: 视频画面色彩色调偏移
    var v36ColorHueShift: Int
        get() = prefs.getInt(KEY_V36_COLOR_HUE_SHIFT, 0)
        set(value) = prefs.edit().putInt(KEY_V36_COLOR_HUE_SHIFT, value.coerceIn(-180, 180)).apply()
    
    // v36.15: 弹幕显示字体发光颜色
    var v36DanmakuFontGlowColor: Int
        get() = prefs.getInt(KEY_V36_DANMAKU_FONT_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V36_DANMAKU_FONT_GLOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v37.1: 视频播放列表随机播放
    var v37PlaylistShuffle: Boolean
        get() = prefs.getBoolean(KEY_V37_PLAYLIST_SHUFFLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_PLAYLIST_SHUFFLE, value).apply()
    
    // v37.2: 弹幕字体阴影颜色
    var v37DanmakuShadowColor: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_SHADOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_SHADOW_COLOR, value.coerceIn(0, 5)).apply()
    
    // v37.3: 视频画面色彩鲜艳度
    var v37ColorVividness: Int
        get() = prefs.getInt(KEY_V37_COLOR_VIVIDNESS, 0)
        set(value) = prefs.edit().putInt(KEY_V37_COLOR_VIVIDNESS, value.coerceIn(-50, 50)).apply()
    
    // v37.4: 弹幕发送确认震动衰减
    var v37VibrationDecay: Int
        get() = prefs.getInt(KEY_V37_VIBRATION_DECAY, 0)
        set(value) = prefs.edit().putInt(KEY_V37_VIBRATION_DECAY, value.coerceIn(0, 100)).apply()
    
    // v37.5: 播放器音量淡入淡出
    var v37VolumeFade: Boolean
        get() = prefs.getBoolean(KEY_V37_VOLUME_FADE, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_VOLUME_FADE, value).apply()
    
    // v37.6: 视频缓存预加载
    var v37CachePreload: Boolean
        get() = prefs.getBoolean(KEY_V37_CACHE_PRELOAD, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_CACHE_PRELOAD, value).apply()
    
    // v37.7: 弹幕显示滚动速度
    var v37DanmakuScrollSpeed: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_SCROLL_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_SCROLL_SPEED, value.coerceIn(-50, 50)).apply()
    
    // v37.8: 视频画面色彩色阶
    var v37ColorTonemap: Int
        get() = prefs.getInt(KEY_V37_COLOR_TONEMAP, 0)
        set(value) = prefs.edit().putInt(KEY_V37_COLOR_TONEMAP, value.coerceIn(0, 5)).apply()
    
    // v37.9: 弹幕发送历史记录导出
    var v37HistoryExport: Boolean
        get() = prefs.getBoolean(KEY_V37_HISTORY_EXPORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V37_HISTORY_EXPORT, value).apply()
    
    // v37.10: 播放器进度条高度
    var v37ProgressBarHeight: Int
        get() = prefs.getInt(KEY_V37_PROGRESS_BAR_HEIGHT, 3)
        set(value) = prefs.edit().putInt(KEY_V37_PROGRESS_BAR_HEIGHT, value.coerceIn(1, 10)).apply()
    
    // v37.11: 视频投射画面码率
    var v37CastBitrate: Int
        get() = prefs.getInt(KEY_V37_CAST_BITRATE, 0)
        set(value) = prefs.edit().putInt(KEY_V37_CAST_BITRATE, value.coerceIn(0, 5)).apply()
    
    // v37.12: 弹幕字体背景边框颜色
    var v37DanmakuBorderColor: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_BORDER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_BORDER_COLOR, value.coerceIn(0, 5)).apply()
    
    // v37.13: 播放器手势双击功能
    var v37GestureDoubleTap: Int
        get() = prefs.getInt(KEY_V37_GESTURE_DOUBLE_TAP, 0)
        set(value) = prefs.edit().putInt(KEY_V37_GESTURE_DOUBLE_TAP, value.coerceIn(0, 5)).apply()
    
    // v37.14: 视频画面色彩色调饱和度
    var v37ColorHueSaturation: Int
        get() = prefs.getInt(KEY_V37_COLOR_HUE_SATURATION, 0)
        set(value) = prefs.edit().putInt(KEY_V37_COLOR_HUE_SATURATION, value.coerceIn(-50, 50)).apply()
    
    // v37.15: 弹幕显示字体发光强度
    var v37DanmakuGlowIntensity: Int
        get() = prefs.getInt(KEY_V37_DANMAKU_GLOW_INTENSITY, 0)
        set(value) = prefs.edit().putInt(KEY_V37_DANMAKU_GLOW_INTENSITY, value.coerceIn(0, 100)).apply()
    
    // v38.1: 视频播放列表循环模式
    var v38PlaylistLoopMode: Int
        get() = prefs.getInt(KEY_V38_PLAYLIST_LOOP_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_PLAYLIST_LOOP_MODE, value.coerceIn(0, 3)).apply()
    
    // v38.2: 弹幕字体背景圆角
    var v38DanmakuBackgroundRadius: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_BACKGROUND_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_BACKGROUND_RADIUS, value.coerceIn(0, 20)).apply()
    
    // v38.3: 视频画面色彩对比度曲线
    var v38ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V38_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_COLOR_CONTRAST_CURVE, value.coerceIn(0, 5)).apply()
    
    // v38.4: 弹幕发送确认震动频率
    var v38VibrationFrequency: Int
        get() = prefs.getInt(KEY_V38_VIBRATION_FREQUENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V38_VIBRATION_FREQUENCY, value.coerceIn(0, 100)).apply()
    
    // v38.5: 播放器音量限制模式
    var v38VolumeLimitMode: Int
        get() = prefs.getInt(KEY_V38_VOLUME_LIMIT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_VOLUME_LIMIT_MODE, value.coerceIn(0, 3)).apply()
    
    // v38.6: 视频缓存清理策略
    var v38CacheCleanupStrategy: Int
        get() = prefs.getInt(KEY_V38_CACHE_CLEANUP_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V38_CACHE_CLEANUP_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v38.7: 弹幕显示位置偏移X
    var v38DanmakuOffsetX: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_OFFSET_X, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_OFFSET_X, value.coerceIn(-100, 100)).apply()
    
    // v38.8: 视频画面色彩亮度曲线
    var v38ColorBrightnessCurve: Int
        get() = prefs.getInt(KEY_V38_COLOR_BRIGHTNESS_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_COLOR_BRIGHTNESS_CURVE, value.coerceIn(0, 5)).apply()
    
    // v38.9: 弹幕发送历史记录搜索模式
    var v38HistorySearchMode: Int
        get() = prefs.getInt(KEY_V38_HISTORY_SEARCH_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_HISTORY_SEARCH_MODE, value.coerceIn(0, 3)).apply()
    
    // v38.10: 播放器进度条动画
    var v38ProgressBarAnimation: Boolean
        get() = prefs.getBoolean(KEY_V38_PROGRESS_BAR_ANIMATION, true)
        set(value) = prefs.edit().putBoolean(KEY_V38_PROGRESS_BAR_ANIMATION, value).apply()
    
    // v38.11: 视频投射画面延迟
    var v38CastLatency: Int
        get() = prefs.getInt(KEY_V38_CAST_LATENCY, 0)
        set(value) = prefs.edit().putInt(KEY_V38_CAST_LATENCY, value.coerceIn(0, 5000)).apply()
    
    // v38.12: 弹幕字体背景渐变方向
    var v38DanmakuGradientDirection: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v38.13: 播放器手势滑动灵敏度
    var v38GestureSwipeSensitivity: Int
        get() = prefs.getInt(KEY_V38_GESTURE_SWIPE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_V38_GESTURE_SWIPE_SENSITIVITY, value.coerceIn(10, 100)).apply()
    
    // v38.14: 视频画面色彩饱和度曲线
    var v38ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V38_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V38_COLOR_SATURATION_CURVE, value.coerceIn(0, 5)).apply()
    
    // v38.15: 弹幕显示字体描边宽度
    var v38DanmakuFontStrokeWidth: Int
        get() = prefs.getInt(KEY_V38_DANMAKU_FONT_STROKE_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V38_DANMAKU_FONT_STROKE_WIDTH, value.coerceIn(0, 10)).apply()
    
    // v39.1: 视频播放列表自动跳过
    var v39PlaylistAutoSkip: Boolean
        get() = prefs.getBoolean(KEY_V39_PLAYLIST_AUTO_SKIP, false)
        set(value) = prefs.edit().putBoolean(KEY_V39_PLAYLIST_AUTO_SKIP, value).apply()
    
    // v39.2: 弹幕字体背景透明度曲线
    var v39DanmakuBackgroundAlphaCurve: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_BACKGROUND_ALPHA_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_BACKGROUND_ALPHA_CURVE, value.coerceIn(0, 5)).apply()
    
    // v39.3: 视频画面色彩锐化强度
    var v39ColorSharpen: Int
        get() = prefs.getInt(KEY_V39_COLOR_SHARPEN, 0)
        set(value) = prefs.edit().putInt(KEY_V39_COLOR_SHARPEN, value.coerceIn(0, 100)).apply()
    
    // v39.4: 弹幕发送确认震动模式曲线
    var v39VibrationPatternCurve: Int
        get() = prefs.getInt(KEY_V39_VIBRATION_PATTERN_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_VIBRATION_PATTERN_CURVE, value.coerceIn(0, 5)).apply()
    
    // v39.5: 播放器音量平衡
    var v39VolumeBalance: Int
        get() = prefs.getInt(KEY_V39_VOLUME_BALANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_VOLUME_BALANCE, value.coerceIn(-100, 100)).apply()
    
    // v39.6: 视频缓存预加载大小
    var v39CachePreloadSize: Int
        get() = prefs.getInt(KEY_V39_CACHE_PRELOAD_SIZE, 50)
        set(value) = prefs.edit().putInt(KEY_V39_CACHE_PRELOAD_SIZE, value.coerceIn(10, 500)).apply()
    
    // v39.7: 弹幕显示位置偏移Y
    var v39DanmakuOffsetY: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_OFFSET_Y, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_OFFSET_Y, value.coerceIn(-100, 100)).apply()
    
    // v39.8: 视频画面色彩降噪强度
    var v39ColorDenoise: Int
        get() = prefs.getInt(KEY_V39_COLOR_DENOISE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_COLOR_DENOISE, value.coerceIn(0, 100)).apply()
    
    // v39.9: 弹幕发送历史记录自动清理
    var v39HistoryAutoCleanup: Boolean
        get() = prefs.getBoolean(KEY_V39_HISTORY_AUTO_CLEANUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V39_HISTORY_AUTO_CLEANUP, value).apply()
    
    // v39.10: 播放器进度条颜色渐变
    var v39ProgressBarGradient: Boolean
        get() = prefs.getBoolean(KEY_V39_PROGRESS_BAR_GRADIENT, false)
        set(value) = prefs.edit().putBoolean(KEY_V39_PROGRESS_BAR_GRADIENT, value).apply()
    
    // v39.11: 视频投射画面缓冲策略
    var v39CastBufferStrategy: Int
        get() = prefs.getInt(KEY_V39_CAST_BUFFER_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V39_CAST_BUFFER_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v39.12: 弹幕字体背景渐变速度
    var v39DanmakuGradientSpeed: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_GRADIENT_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_GRADIENT_SPEED, value.coerceIn(0, 100)).apply()
    
    // v39.13: 播放器手势长按功能
    var v39GestureLongPress: Int
        get() = prefs.getInt(KEY_V39_GESTURE_LONG_PRESS, 0)
        set(value) = prefs.edit().putInt(KEY_V39_GESTURE_LONG_PRESS, value.coerceIn(0, 5)).apply()
    
    // v39.14: 视频画面色彩模糊强度
    var v39ColorBlur: Int
        get() = prefs.getInt(KEY_V39_COLOR_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V39_COLOR_BLUR, value.coerceIn(0, 20)).apply()
    
    // v39.15: 弹幕显示字体发光模式
    var v39DanmakuGlowMode: Int
        get() = prefs.getInt(KEY_V39_DANMAKU_GLOW_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V39_DANMAKU_GLOW_MODE, value.coerceIn(0, 3)).apply()
    
    // v40.1: 视频播放列表智能排序
    var v40PlaylistSmartSort: Boolean
        get() = prefs.getBoolean(KEY_V40_PLAYLIST_SMART_SORT, false)
        set(value) = prefs.edit().putBoolean(KEY_V40_PLAYLIST_SMART_SORT, value).apply()
    
    // v40.2: 弹幕字体背景渐变颜色
    var v40DanmakuGradientColor: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_GRADIENT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_GRADIENT_COLOR, value.coerceIn(0, 5)).apply()
    
    // v40.3: 视频画面色彩色调曲线
    var v40ColorHueCurve: Int
        get() = prefs.getInt(KEY_V40_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_COLOR_HUE_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.4: 弹幕发送确认震动强度曲线
    var v40VibrationIntensityCurve: Int
        get() = prefs.getInt(KEY_V40_VIBRATION_INTENSITY_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_VIBRATION_INTENSITY_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.5: 播放器音量限制阈值曲线
    var v40VolumeLimitCurve: Int
        get() = prefs.getInt(KEY_V40_VOLUME_LIMIT_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_VOLUME_LIMIT_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.6: 视频缓存清理策略曲线
    var v40CacheCleanupCurve: Int
        get() = prefs.getInt(KEY_V40_CACHE_CLEANUP_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_CACHE_CLEANUP_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.7: 弹幕显示位置对齐方式曲线
    var v40DanmakuAlignCurve: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_ALIGN_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_ALIGN_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.8: 视频画面色彩降噪曲线
    var v40ColorDenoiseCurve: Int
        get() = prefs.getInt(KEY_V40_COLOR_DENOISE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_COLOR_DENOISE_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.9: 弹幕发送历史记录导出格式
    var v40HistoryExportFormat: Int
        get() = prefs.getInt(KEY_V40_HISTORY_EXPORT_FORMAT, 0)
        set(value) = prefs.edit().putInt(KEY_V40_HISTORY_EXPORT_FORMAT, value.coerceIn(0, 3)).apply()
    
    // v40.10: 播放器进度条颜色渐变方向
    var v40ProgressBarGradientDirection: Int
        get() = prefs.getInt(KEY_V40_PROGRESS_BAR_GRADIENT_DIRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V40_PROGRESS_BAR_GRADIENT_DIRECTION, value.coerceIn(0, 3)).apply()
    
    // v40.11: 视频投射画面延迟策略
    var v40CastLatencyStrategy: Int
        get() = prefs.getInt(KEY_V40_CAST_LATENCY_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V40_CAST_LATENCY_STRATEGY, value.coerceIn(0, 3)).apply()
    
    // v40.12: 弹幕字体背景渐变透明度
    var v40DanmakuGradientAlpha: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_GRADIENT_ALPHA, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_GRADIENT_ALPHA, value.coerceIn(0, 100)).apply()
    
    // v40.13: 播放器手势滑动速度
    var v40GestureSwipeSpeed: Int
        get() = prefs.getInt(KEY_V40_GESTURE_SWIPE_SPEED, 50)
        set(value) = prefs.edit().putInt(KEY_V40_GESTURE_SWIPE_SPEED, value.coerceIn(10, 100)).apply()
    
    // v40.14: 视频画面色彩模糊曲线
    var v40ColorBlurCurve: Int
        get() = prefs.getInt(KEY_V40_COLOR_BLUR_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V40_COLOR_BLUR_CURVE, value.coerceIn(0, 5)).apply()
    
    // v40.15: 弹幕显示字体发光强度
    var v40DanmakuGlowIntensity: Int
        get() = prefs.getInt(KEY_V40_DANMAKU_GLOW_INTENSITY, 0)
        set(value) = prefs.edit().putInt(KEY_V40_DANMAKU_GLOW_INTENSITY, value.coerceIn(0, 100)).apply()

    // ===== v41.x 系列 =====
    // v41.1: 视频播放速度记忆
    var v41PlaybackSpeedMemory: Boolean
        get() = prefs.getBoolean(KEY_V41_PLAYBACK_SPEED_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_PLAYBACK_SPEED_MEMORY, value).apply()
    // v41.2: 弹幕发送确认震动模式
    var v41DanmakuVibrationMode: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_VIBRATION_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_VIBRATION_MODE, value.coerceIn(0, 3)).apply()
    // v41.3: 视频画面色彩自动调节
    var v41ColorAutoAdjust: Boolean
        get() = prefs.getBoolean(KEY_V41_COLOR_AUTO_ADJUST, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_COLOR_AUTO_ADJUST, value).apply()
    // v41.4: 播放器音量增强模式
    var v41VolumeBoostMode: Int
        get() = prefs.getInt(KEY_V41_VOLUME_BOOST_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V41_VOLUME_BOOST_MODE, value.coerceIn(0, 3)).apply()
    // v41.5: 弹幕字体描边样式
    var v41DanmakuStrokeStyle: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_STROKE_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_STROKE_STYLE, value.coerceIn(0, 3)).apply()
    // v41.6: 视频投射画面色彩校正
    var v41CastColorCorrection: Int
        get() = prefs.getInt(KEY_V41_CAST_COLOR_CORRECTION, 0)
        set(value) = prefs.edit().putInt(KEY_V41_CAST_COLOR_CORRECTION, value.coerceIn(0, 5)).apply()
    // v41.7: 播放器手势自定义映射
    var v41GestureCustomMapping: Int
        get() = prefs.getInt(KEY_V41_GESTURE_CUSTOM_MAPPING, 0)
        set(value) = prefs.edit().putInt(KEY_V41_GESTURE_CUSTOM_MAPPING, value.coerceIn(0, 5)).apply()
    // v41.8: 弹幕显示密度限制
    var v41DanmakuDensityLimit: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_DENSITY_LIMIT, 100)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_DENSITY_LIMIT, value.coerceIn(10, 100)).apply()
    // v41.9: 视频缓存智能清理
    var v41CacheSmartCleanup: Boolean
        get() = prefs.getBoolean(KEY_V41_CACHE_SMART_CLEANUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_CACHE_SMART_CLEANUP, value).apply()
    // v41.10: 播放器进度条缓冲显示
    var v41ProgressBarBuffer: Boolean
        get() = prefs.getBoolean(KEY_V41_PROGRESS_BAR_BUFFER, true)
        set(value) = prefs.edit().putBoolean(KEY_V41_PROGRESS_BAR_BUFFER, value).apply()
    // v41.11: 弹幕发送确认震动反馈
    var v41DanmakuVibrationFeedback: Boolean
        get() = prefs.getBoolean(KEY_V41_DANMAKU_VIBRATION_FEEDBACK, false)
        set(value) = prefs.edit().putBoolean(KEY_V41_DANMAKU_VIBRATION_FEEDBACK, value).apply()
    // v41.12: 视频画面色彩HDR模拟
    var v41ColorHdrSimulation: Int
        get() = prefs.getInt(KEY_V41_COLOR_HDR_SIMULATION, 0)
        set(value) = prefs.edit().putInt(KEY_V41_COLOR_HDR_SIMULATION, value.coerceIn(0, 3)).apply()
    // v41.13: 播放器音量限制模式增强
    var v41VolumeLimitEnhanced: Int
        get() = prefs.getInt(KEY_V41_VOLUME_LIMIT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V41_VOLUME_LIMIT_ENHANCED, value.coerceIn(0, 3)).apply()
    // v41.14: 弹幕字体背景圆角增强
    var v41DanmakuBgRadius: Int
        get() = prefs.getInt(KEY_V41_DANMAKU_BG_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V41_DANMAKU_BG_RADIUS, value.coerceIn(0, 20)).apply()
    // v41.15: 视频投射音频编码格式
    var v41CastAudioCodec: Int
        get() = prefs.getInt(KEY_V41_CAST_AUDIO_CODEC, 0)
        set(value) = prefs.edit().putInt(KEY_V41_CAST_AUDIO_CODEC, value.coerceIn(0, 3)).apply()

    // ===== v42.x 系列 =====
    // v42.1: 弹幕显示字体描边颜色
    var v42DanmakuStrokeColor: Int
        get() = prefs.getInt(KEY_V42_DANMAKU_STROKE_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V42_DANMAKU_STROKE_COLOR, value.coerceIn(0, 10)).apply()
    // v42.2: 视频画面色彩对比度自动
    var v42ColorAutoContrast: Boolean
        get() = prefs.getBoolean(KEY_V42_COLOR_AUTO_CONTRAST, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_COLOR_AUTO_CONTRAST, value).apply()
    // v42.3: 播放器手势震动反馈
    var v42GestureVibration: Boolean
        get() = prefs.getBoolean(KEY_V42_GESTURE_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_GESTURE_VIBRATION, value).apply()
    // v42.4: 弹幕发送历史记录统计
    var v42DanmakuHistoryStats: Boolean
        get() = prefs.getBoolean(KEY_V42_DANMAKU_HISTORY_STATS, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_DANMAKU_HISTORY_STATS, value).apply()
    // v42.5: 视频缓存大小自动调整
    var v42CacheAutoSize: Boolean
        get() = prefs.getBoolean(KEY_V42_CACHE_AUTO_SIZE, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_CACHE_AUTO_SIZE, value).apply()
    // v42.6: 播放器进度条颜色自定义
    var v42ProgressBarColor: Int
        get() = prefs.getInt(KEY_V42_PROGRESS_BAR_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V42_PROGRESS_BAR_COLOR, value.coerceIn(0, 10)).apply()
    // v42.7: 弹幕字体背景渐变增强
    var v42DanmakuGradientEnhanced: Int
        get() = prefs.getInt(KEY_V42_DANMAKU_GRADIENT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V42_DANMAKU_GRADIENT_ENHANCED, value.coerceIn(0, 5)).apply()
    // v42.8: 视频投射画面色彩增强
    var v42CastColorEnhance: Int
        get() = prefs.getInt(KEY_V42_CAST_COLOR_ENHANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V42_CAST_COLOR_ENHANCE, value.coerceIn(0, 5)).apply()
    // v42.9: 播放器音量步进值自定义
    var v42VolumeStepCustom: Int
        get() = prefs.getInt(KEY_V42_VOLUME_STEP_CUSTOM, 5)
        set(value) = prefs.edit().putInt(KEY_V42_VOLUME_STEP_CUSTOM, value.coerceIn(1, 20)).apply()
    // v42.10: 弹幕显示位置智能调整
    var v42DanmakuSmartPosition: Boolean
        get() = prefs.getBoolean(KEY_V42_DANMAKU_SMART_POSITION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_DANMAKU_SMART_POSITION, value).apply()
    // v42.11: 视频画面色彩饱和度自动
    var v42ColorAutoSaturation: Boolean
        get() = prefs.getBoolean(KEY_V42_COLOR_AUTO_SATURATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_COLOR_AUTO_SATURATION, value).apply()
    // v42.12: 播放器手势长按震动
    var v42GestureLongPressVibration: Boolean
        get() = prefs.getBoolean(KEY_V42_GESTURE_LONG_PRESS_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V42_GESTURE_LONG_PRESS_VIBRATION, value).apply()
    // v42.13: 弹幕发送确认震动持续时间
    var v42DanmakuVibrationDuration: Int
        get() = prefs.getInt(KEY_V42_DANMAKU_VIBRATION_DURATION, 100)
        set(value) = prefs.edit().putInt(KEY_V42_DANMAKU_VIBRATION_DURATION, value.coerceIn(50, 500)).apply()
    // v42.14: 视频缓存预加载策略
    var v42CachePreloadStrategy: Int
        get() = prefs.getInt(KEY_V42_CACHE_PRELOAD_STRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V42_CACHE_PRELOAD_STRATEGY, value.coerceIn(0, 3)).apply()
    // v42.15: 播放器进度条缓冲颜色
    var v42ProgressBarBufferColor: Int
        get() = prefs.getInt(KEY_V42_PROGRESS_BAR_BUFFER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V42_PROGRESS_BAR_BUFFER_COLOR, value.coerceIn(0, 10)).apply()

    // ===== v43.x 系列 =====
    // v43.1: 视频画面色彩色调自动
    var v43ColorAutoHue: Boolean
        get() = prefs.getBoolean(KEY_V43_COLOR_AUTO_HUE, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_COLOR_AUTO_HUE, value).apply()
    // v43.2: 弹幕字体背景透明度
    var v43DanmakuBgAlpha: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_BG_ALPHA, 100)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_BG_ALPHA, value.coerceIn(0, 100)).apply()
    // v43.3: 播放器手势双击震动
    var v43GestureDoubleTapVibration: Boolean
        get() = prefs.getBoolean(KEY_V43_GESTURE_DOUBLE_TAP_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_GESTURE_DOUBLE_TAP_VIBRATION, value).apply()
    // v43.4: 弹幕发送历史记录备份
    var v43DanmakuHistoryBackup: Boolean
        get() = prefs.getBoolean(KEY_V43_DANMAKU_HISTORY_BACKUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_DANMAKU_HISTORY_BACKUP, value).apply()
    // v43.5: 视频缓存清理策略增强
    var v43CacheCleanupEnhanced: Int
        get() = prefs.getInt(KEY_V43_CACHE_CLEANUP_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_CACHE_CLEANUP_ENHANCED, value.coerceIn(0, 3)).apply()
    // v43.6: 播放器进度条渐变增强
    var v43ProgressBarGradientEnhanced: Int
        get() = prefs.getInt(KEY_V43_PROGRESS_BAR_GRADIENT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_PROGRESS_BAR_GRADIENT_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.7: 弹幕字体阴影增强
    var v43DanmakuShadowEnhanced: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_SHADOW_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_SHADOW_ENHANCED, value.coerceIn(0, 10)).apply()
    // v43.8: 视频投射画面分辨率增强
    var v43CastResolutionEnhanced: Int
        get() = prefs.getInt(KEY_V43_CAST_RESOLUTION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_CAST_RESOLUTION_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.9: 播放器音量限制曲线增强
    var v43VolumeLimitCurveEnhanced: Int
        get() = prefs.getInt(KEY_V43_VOLUME_LIMIT_CURVE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_VOLUME_LIMIT_CURVE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.10: 弹幕显示字体发光增强
    var v43DanmakuGlowEnhanced: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_GLOW_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_GLOW_ENHANCED, value.coerceIn(0, 100)).apply()
    // v43.11: 视频画面色彩亮度自动
    var v43ColorAutoBrightness: Boolean
        get() = prefs.getBoolean(KEY_V43_COLOR_AUTO_BRIGHTNESS, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_COLOR_AUTO_BRIGHTNESS, value).apply()
    // v43.12: 播放器手势滑动震动
    var v43GestureSwipeVibration: Boolean
        get() = prefs.getBoolean(KEY_V43_GESTURE_SWIPE_VIBRATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V43_GESTURE_SWIPE_VIBRATION, value).apply()
    // v43.13: 弹幕发送确认震动模式增强
    var v43DanmakuVibrationModeEnhanced: Int
        get() = prefs.getInt(KEY_V43_DANMAKU_VIBRATION_MODE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_DANMAKU_VIBRATION_MODE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.14: 视频缓存预加载大小增强
    var v43CachePreloadSizeEnhanced: Int
        get() = prefs.getInt(KEY_V43_CACHE_PRELOAD_SIZE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_CACHE_PRELOAD_SIZE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v43.15: 播放器进度条动画增强
    var v43ProgressBarAnimationEnhanced: Int
        get() = prefs.getInt(KEY_V43_PROGRESS_BAR_ANIMATION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V43_PROGRESS_BAR_ANIMATION_ENHANCED, value.coerceIn(0, 3)).apply()

    // ===== v44.x 系列 =====
    // v44.1: 视频画面色彩降噪增强
    var v44ColorDenoiseEnhanced: Int
        get() = prefs.getInt(KEY_V44_COLOR_DENOISE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_COLOR_DENOISE_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.2: 弹幕字体描边宽度增强
    var v44DanmakuStrokeWidthEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_STROKE_WIDTH_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_STROKE_WIDTH_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.3: 播放器手势长按速度增强
    var v44GestureLongPressSpeedEnhanced: Int
        get() = prefs.getInt(KEY_V44_GESTURE_LONG_PRESS_SPEED_ENHANCED, 500)
        set(value) = prefs.edit().putInt(KEY_V44_GESTURE_LONG_PRESS_SPEED_ENHANCED, value.coerceIn(200, 2000)).apply()
    // v44.4: 弹幕发送历史记录搜索增强
    var v44DanmakuHistorySearchEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V44_DANMAKU_HISTORY_SEARCH_ENHANCED, false)
        set(value) = prefs.edit().putBoolean(KEY_V44_DANMAKU_HISTORY_SEARCH_ENHANCED, value).apply()
    // v44.5: 视频投射画面码率增强
    var v44CastBitrateEnhanced: Int
        get() = prefs.getInt(KEY_V44_CAST_BITRATE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_CAST_BITRATE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.6: 播放器进度条高度增强
    var v44ProgressBarHeightEnhanced: Int
        get() = prefs.getInt(KEY_V44_PROGRESS_BAR_HEIGHT_ENHANCED, 4)
        set(value) = prefs.edit().putInt(KEY_V44_PROGRESS_BAR_HEIGHT_ENHANCED, value.coerceIn(2, 20)).apply()
    // v44.7: 弹幕字体背景边框增强
    var v44DanmakuBorderEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_BORDER_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_BORDER_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.8: 视频画面色彩模糊增强
    var v44ColorBlurEnhanced: Int
        get() = prefs.getInt(KEY_V44_COLOR_BLUR_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_COLOR_BLUR_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.9: 播放器音量淡入淡出增强
    var v44VolumeFadeEnhanced: Int
        get() = prefs.getInt(KEY_V44_VOLUME_FADE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_VOLUME_FADE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.10: 弹幕显示滚动速度增强
    var v44DanmakuScrollSpeedEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_SCROLL_SPEED_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_SCROLL_SPEED_ENHANCED, value.coerceIn(0, 10)).apply()
    // v44.11: 视频投射画面延迟增强
    var v44CastLatencyEnhanced: Int
        get() = prefs.getInt(KEY_V44_CAST_LATENCY_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_CAST_LATENCY_ENHANCED, value.coerceIn(0, 3)).apply()
    // v44.12: 播放器手势滑动灵敏度增强
    var v44GestureSwipeSensitivityEnhanced: Int
        get() = prefs.getInt(KEY_V44_GESTURE_SWIPE_SENSITIVITY_ENHANCED, 50)
        set(value) = prefs.edit().putInt(KEY_V44_GESTURE_SWIPE_SENSITIVITY_ENHANCED, value.coerceIn(10, 100)).apply()
    // v44.13: 弹幕发送确认震动频率增强
    var v44DanmakuVibrationFrequencyEnhanced: Int
        get() = prefs.getInt(KEY_V44_DANMAKU_VIBRATION_FREQUENCY_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_DANMAKU_VIBRATION_FREQUENCY_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.14: 视频缓存清理策略曲线增强
    var v44CacheCleanupCurveEnhanced: Int
        get() = prefs.getInt(KEY_V44_CACHE_CLEANUP_CURVE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_CACHE_CLEANUP_CURVE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v44.15: 播放器进度条颜色渐变方向增强
    var v44ProgressBarGradientDirectionEnhanced: Int
        get() = prefs.getInt(KEY_V44_PROGRESS_BAR_GRADIENT_DIRECTION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V44_PROGRESS_BAR_GRADIENT_DIRECTION_ENHANCED, value.coerceIn(0, 5)).apply()

    // ===== v45.x 系列 =====
    // v45.1: 视频画面色彩锐化增强
    var v45ColorSharpenEnhanced: Int
        get() = prefs.getInt(KEY_V45_COLOR_SHARPEN_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_COLOR_SHARPEN_ENHANCED, value.coerceIn(0, 10)).apply()
    // v45.2: 弹幕字体背景圆角增强
    var v45DanmakuBgRadiusEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_BG_RADIUS_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_BG_RADIUS_ENHANCED, value.coerceIn(0, 30)).apply()
    // v45.3: 播放器手势双击功能增强
    var v45GestureDoubleTapEnhanced: Int
        get() = prefs.getInt(KEY_V45_GESTURE_DOUBLE_TAP_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_GESTURE_DOUBLE_TAP_ENHANCED, value.coerceIn(0, 5)).apply()
    // v45.4: 弹幕发送历史记录导出增强
    var v45DanmakuHistoryExportEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_HISTORY_EXPORT_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_HISTORY_EXPORT_ENHANCED, value.coerceIn(0, 3)).apply()
    // v45.5: 视频投射画面缓冲策略增强
    var v45CastBufferEnhanced: Int
        get() = prefs.getInt(KEY_V45_CAST_BUFFER_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_CAST_BUFFER_ENHANCED, value.coerceIn(0, 3)).apply()
    // v45.6: 播放器进度条样式增强
    var v45ProgressBarStyleEnhanced: Int
        get() = prefs.getInt(KEY_V45_PROGRESS_BAR_STYLE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_PROGRESS_BAR_STYLE_ENHANCED, value.coerceIn(0, 5)).apply()
    // v45.7: 弹幕字体背景渐变速度增强
    var v45DanmakuGradientSpeedEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_GRADIENT_SPEED_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_GRADIENT_SPEED_ENHANCED, value.coerceIn(0, 10)).apply()
    // v45.8: 视频画面色彩鲜艳度增强
    var v45ColorVividnessEnhanced: Int
        get() = prefs.getInt(KEY_V45_COLOR_VIVIDNESS_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_COLOR_VIVIDNESS_ENHANCED, value.coerceIn(0, 10)).apply()
    // v45.9: 播放器音量平衡增强
    var v45VolumeBalanceEnhanced: Int
        get() = prefs.getInt(KEY_V45_VOLUME_BALANCE_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_VOLUME_BALANCE_ENHANCED, value.coerceIn(-50, 50)).apply()
    // v45.10: 弹幕显示位置偏移增强
    var v45DanmakuOffsetEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_OFFSET_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_OFFSET_ENHANCED, value.coerceIn(-100, 100)).apply()
    // v45.11: 视频投射音频编码增强
    var v45CastAudioEnhanced: Int
        get() = prefs.getInt(KEY_V45_CAST_AUDIO_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_CAST_AUDIO_ENHANCED, value.coerceIn(0, 3)).apply()
    // v45.12: 播放器手势震动模式增强
    var v45GestureVibrationEnhanced: Int
        get() = prefs.getInt(KEY_V45_GESTURE_VIBRATION_ENHANCED, 0)
        set(value) = prefs.edit().putInt(KEY_V45_GESTURE_VIBRATION_ENHANCED, value.coerceIn(0, 5)).apply()
    // v45.13: 弹幕发送确认震动强度增强
    var v45DanmakuVibrationIntensityEnhanced: Int
        get() = prefs.getInt(KEY_V45_DANMAKU_VIBRATION_INTENSITY_ENHANCED, 50)
        set(value) = prefs.edit().putInt(KEY_V45_DANMAKU_VIBRATION_INTENSITY_ENHANCED, value.coerceIn(0, 100)).apply()
    // v45.14: 视频缓存智能清理增强
    var v45CacheSmartCleanupEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V45_CACHE_SMART_CLEANUP_ENHANCED, false)
        set(value) = prefs.edit().putBoolean(KEY_V45_CACHE_SMART_CLEANUP_ENHANCED, value).apply()
    // v45.15: 播放器进度条缓冲显示增强
    var v45ProgressBarBufferEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V45_PROGRESS_BAR_BUFFER_ENHANCED, true)
        set(value) = prefs.edit().putBoolean(KEY_V45_PROGRESS_BAR_BUFFER_ENHANCED, value).apply()

    // ===== v46.x =====
    var v46PlaybackLoopMemory: Boolean
        get() = prefs.getBoolean(KEY_V46_PLAYBACK_LOOP_MEMORY, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_PLAYBACK_LOOP_MEMORY, value).apply()
    var v46DanmakuFontWeight: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_FONT_WEIGHT, 400)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_FONT_WEIGHT, value.coerceIn(100, 900)).apply()
    var v46ColorAutoGamma: Boolean
        get() = prefs.getBoolean(KEY_V46_COLOR_AUTO_GAMMA, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_COLOR_AUTO_GAMMA, value).apply()
    var v46VolumeNormalization: Boolean
        get() = prefs.getBoolean(KEY_V46_VOLUME_NORMALIZATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_VOLUME_NORMALIZATION, value).apply()
    var v46DanmakuStrokeOffset: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_STROKE_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_STROKE_OFFSET, value.coerceIn(-5, 5)).apply()
    var v46CastColorTemperature: Int
        get() = prefs.getInt(KEY_V46_CAST_COLOR_TEMPERATURE, 0)
        set(value) = prefs.edit().putInt(KEY_V46_CAST_COLOR_TEMPERATURE, value.coerceIn(-100, 100)).apply()
    var v46GestureEdgeExclusion: Int
        get() = prefs.getInt(KEY_V46_GESTURE_EDGE_EXCLUSION, 0)
        set(value) = prefs.edit().putInt(KEY_V46_GESTURE_EDGE_EXCLUSION, value.coerceIn(0, 50)).apply()
    var v46DanmakuRowSpacing: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_ROW_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_ROW_SPACING, value.coerceIn(0, 20)).apply()
    var v46CachePrefetchOnWifi: Boolean
        get() = prefs.getBoolean(KEY_V46_CACHE_PREFETCH_ON_WIFI, false)
        set(value) = prefs.edit().putBoolean(KEY_V46_CACHE_PREFETCH_ON_WIFI, value).apply()
    var v46ProgressBarThumbSize: Int
        get() = prefs.getInt(KEY_V46_PROGRESS_BAR_THUMB_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V46_PROGRESS_BAR_THUMB_SIZE, value.coerceIn(0, 20)).apply()
    var v46DanmakuSendConfirmDialog: Boolean
        get() = prefs.getBoolean(KEY_V46_DANMAKU_SEND_CONFIRM_DIALOG, true)
        set(value) = prefs.edit().putBoolean(KEY_V46_DANMAKU_SEND_CONFIRM_DIALOG, value).apply()
    var v46ColorWhiteBalance: Int
        get() = prefs.getInt(KEY_V46_COLOR_WHITE_BALANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V46_COLOR_WHITE_BALANCE, value.coerceIn(-100, 100)).apply()
    var v46VolumeLimitThreshold: Int
        get() = prefs.getInt(KEY_V46_VOLUME_LIMIT_THRESHOLD, 100)
        set(value) = prefs.edit().putInt(KEY_V46_VOLUME_LIMIT_THRESHOLD, value.coerceIn(50, 150)).apply()
    var v46DanmakuBgPadding: Int
        get() = prefs.getInt(KEY_V46_DANMAKU_BG_PADDING, 0)
        set(value) = prefs.edit().putInt(KEY_V46_DANMAKU_BG_PADDING, value.coerceIn(0, 20)).apply()
    var v46CastVideoCodec: Int
        get() = prefs.getInt(KEY_V46_CAST_VIDEO_CODEC, 0)
        set(value) = prefs.edit().putInt(KEY_V46_CAST_VIDEO_CODEC, value.coerceIn(0, 3)).apply()

    // ===== v47.x =====
    var v47PlaybackResumePrompt: Boolean
        get() = prefs.getBoolean(KEY_V47_PLAYBACK_RESUME_PROMPT, true)
        set(value) = prefs.edit().putBoolean(KEY_V47_PLAYBACK_RESUME_PROMPT, value).apply()
    var v47DanmakuFontSpacing: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_FONT_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_FONT_SPACING, value.coerceIn(0, 10)).apply()
    var v47ColorExposureCompensation: Int
        get() = prefs.getInt(KEY_V47_COLOR_EXPOSURE_COMPENSATION, 0)
        set(value) = prefs.edit().putInt(KEY_V47_COLOR_EXPOSURE_COMPENSATION, value.coerceIn(-100, 100)).apply()
    var v47VolumeLoudnessEnhancer: Int
        get() = prefs.getInt(KEY_V47_VOLUME_LOUDNESS_ENHANCER, 0)
        set(value) = prefs.edit().putInt(KEY_V47_VOLUME_LOUDNESS_ENHANCER, value.coerceIn(0, 100)).apply()
    var v47DanmakuStrokeBlur: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_STROKE_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_STROKE_BLUR, value.coerceIn(0, 10)).apply()
    var v47CastAudioBitrate: Int
        get() = prefs.getInt(KEY_V47_CAST_AUDIO_BITRATE, 0)
        set(value) = prefs.edit().putInt(KEY_V47_CAST_AUDIO_BITRATE, value.coerceIn(0, 5)).apply()
    var v47GestureDeadZone: Int
        get() = prefs.getInt(KEY_V47_GESTURE_DEAD_ZONE, 0)
        set(value) = prefs.edit().putInt(KEY_V47_GESTURE_DEAD_ZONE, value.coerceIn(0, 30)).apply()
    var v47DanmakuMaxLines: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_MAX_LINES, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_MAX_LINES, value.coerceIn(0, 50)).apply()
    var v47CacheMaxSizeMb: Int
        get() = prefs.getInt(KEY_V47_CACHE_MAX_SIZE_MB, 0)
        set(value) = prefs.edit().putInt(KEY_V47_CACHE_MAX_SIZE_MB, value.coerceIn(0, 2048)).apply()
    var v47ProgressBarSeekPreview: Boolean
        get() = prefs.getBoolean(KEY_V47_PROGRESS_BAR_SEEK_PREVIEW, false)
        set(value) = prefs.edit().putBoolean(KEY_V47_PROGRESS_BAR_SEEK_PREVIEW, value).apply()
    var v47DanmakuHighlightMention: Boolean
        get() = prefs.getBoolean(KEY_V47_DANMAKU_HIGHLIGHT_MENTION, false)
        set(value) = prefs.edit().putBoolean(KEY_V47_DANMAKU_HIGHLIGHT_MENTION, value).apply()
    var v47ColorTint: Int
        get() = prefs.getInt(KEY_V47_COLOR_TINT, 0)
        set(value) = prefs.edit().putInt(KEY_V47_COLOR_TINT, value.coerceIn(0, 5)).apply()
    var v47VolumeChannelBalance: Int
        get() = prefs.getInt(KEY_V47_VOLUME_CHANNEL_BALANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V47_VOLUME_CHANNEL_BALANCE, value.coerceIn(-50, 50)).apply()
    var v47DanmakuBgBorderColor: Int
        get() = prefs.getInt(KEY_V47_DANMAKU_BG_BORDER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V47_DANMAKU_BG_BORDER_COLOR, value.coerceIn(0, 10)).apply()
    var v47CastSubtitleEnabled: Boolean
        get() = prefs.getBoolean(KEY_V47_CAST_SUBTITLE_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V47_CAST_SUBTITLE_ENABLED, value).apply()

    // ===== v48.x =====
    var v48PlaybackAutoSkipIntro: Boolean
        get() = prefs.getBoolean(KEY_V48_PLAYBACK_AUTO_SKIP_INTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_PLAYBACK_AUTO_SKIP_INTRO, value).apply()
    var v48DanmakuFontLineHeight: Int
        get() = prefs.getInt(KEY_V48_DANMAKU_FONT_LINE_HEIGHT, 0)
        set(value) = prefs.edit().putInt(KEY_V48_DANMAKU_FONT_LINE_HEIGHT, value.coerceIn(0, 20)).apply()
    var v48ColorBlackLevel: Int
        get() = prefs.getInt(KEY_V48_COLOR_BLACK_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V48_COLOR_BLACK_LEVEL, value.coerceIn(-100, 100)).apply()
    var v48VolumeBassBoost: Int
        get() = prefs.getInt(KEY_V48_VOLUME_BASS_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V48_VOLUME_BASS_BOOST, value.coerceIn(0, 100)).apply()
    var v48DanmakuSendMaxLength: Int
        get() = prefs.getInt(KEY_V48_DANMAKU_SEND_MAX_LENGTH, 100)
        set(value) = prefs.edit().putInt(KEY_V48_DANMAKU_SEND_MAX_LENGTH, value.coerceIn(20, 200)).apply()
    var v48CastResolutionAuto: Boolean
        get() = prefs.getBoolean(KEY_V48_CAST_RESOLUTION_AUTO, true)
        set(value) = prefs.edit().putBoolean(KEY_V48_CAST_RESOLUTION_AUTO, value).apply()
    var v48GestureTapFeedback: Boolean
        get() = prefs.getBoolean(KEY_V48_GESTURE_TAP_FEEDBACK, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_GESTURE_TAP_FEEDBACK, value).apply()
    var v48DanmakuFilterRegex: Boolean
        get() = prefs.getBoolean(KEY_V48_DANMAKU_FILTER_REGEX, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_DANMAKU_FILTER_REGEX, value).apply()
    var v48CacheCleanupInterval: Int
        get() = prefs.getInt(KEY_V48_CACHE_CLEANUP_INTERVAL, 0)
        set(value) = prefs.edit().putInt(KEY_V48_CACHE_CLEANUP_INTERVAL, value.coerceIn(0, 5)).apply()
    var v48ProgressBarTouchArea: Int
        get() = prefs.getInt(KEY_V48_PROGRESS_BAR_TOUCH_AREA, 0)
        set(value) = prefs.edit().putInt(KEY_V48_PROGRESS_BAR_TOUCH_AREA, value.coerceIn(0, 30)).apply()
    var v48DanmakuFontSizeAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V48_DANMAKU_FONT_SIZE_ADAPTIVE, false)
        set(value) = prefs.edit().putBoolean(KEY_V48_DANMAKU_FONT_SIZE_ADAPTIVE, value).apply()
    var v48ColorWhiteLevel: Int
        get() = prefs.getInt(KEY_V48_COLOR_WHITE_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V48_COLOR_WHITE_LEVEL, value.coerceIn(-100, 100)).apply()
    var v48VolumeVirtualizer: Int
        get() = prefs.getInt(KEY_V48_VOLUME_VIRTUALIZER, 0)
        set(value) = prefs.edit().putInt(KEY_V48_VOLUME_VIRTUALIZER, value.coerceIn(0, 100)).apply()
    var v48DanmakuBgShadowSize: Int
        get() = prefs.getInt(KEY_V48_DANMAKU_BG_SHADOW_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V48_DANMAKU_BG_SHADOW_SIZE, value.coerceIn(0, 10)).apply()
    var v48CastMirrorQuality: Int
        get() = prefs.getInt(KEY_V48_CAST_MIRROR_QUALITY, 0)
        set(value) = prefs.edit().putInt(KEY_V48_CAST_MIRROR_QUALITY, value.coerceIn(0, 3)).apply()

    // ===== v49.x =====
    var v49PlaybackAutoSkipOutro: Boolean
        get() = prefs.getBoolean(KEY_V49_PLAYBACK_AUTO_SKIP_OUTRO, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_PLAYBACK_AUTO_SKIP_OUTRO, value).apply()
    var v49DanmakuFontLetterSpacing: Int
        get() = prefs.getInt(KEY_V49_DANMAKU_FONT_LETTER_SPACING, 0)
        set(value) = prefs.edit().putInt(KEY_V49_DANMAKU_FONT_LETTER_SPACING, value.coerceIn(0, 10)).apply()
    var v49ColorHighlightRecovery: Int
        get() = prefs.getInt(KEY_V49_COLOR_HIGHLIGHT_RECOVERY, 0)
        set(value) = prefs.edit().putInt(KEY_V49_COLOR_HIGHLIGHT_RECOVERY, value.coerceIn(0, 5)).apply()
    var v49VolumeTrebleBoost: Int
        get() = prefs.getInt(KEY_V49_VOLUME_TREBLE_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V49_VOLUME_TREBLE_BOOST, value.coerceIn(0, 100)).apply()
    var v49DanmakuSendFontSize: Int
        get() = prefs.getInt(KEY_V49_DANMAKU_SEND_FONT_SIZE, 25)
        set(value) = prefs.edit().putInt(KEY_V49_DANMAKU_SEND_FONT_SIZE, value.coerceIn(12, 40)).apply()
    var v49CastAudioSync: Int
        get() = prefs.getInt(KEY_V49_CAST_AUDIO_SYNC, 0)
        set(value) = prefs.edit().putInt(KEY_V49_CAST_AUDIO_SYNC, value.coerceIn(-500, 500)).apply()
    var v49GestureLongPressAction: Int
        get() = prefs.getInt(KEY_V49_GESTURE_LONG_PRESS_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V49_GESTURE_LONG_PRESS_ACTION, value.coerceIn(0, 5)).apply()
    var v49DanmakuFilterDuplicate: Boolean
        get() = prefs.getBoolean(KEY_V49_DANMAKU_FILTER_DUPLICATE, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_DANMAKU_FILTER_DUPLICATE, value).apply()
    var v49CacheAutoCleanupThreshold: Int
        get() = prefs.getInt(KEY_V49_CACHE_AUTO_CLEANUP_THRESHOLD, 0)
        set(value) = prefs.edit().putInt(KEY_V49_CACHE_AUTO_CLEANUP_THRESHOLD, value.coerceIn(0, 5)).apply()
    var v49ProgressBarChapterMark: Boolean
        get() = prefs.getBoolean(KEY_V49_PROGRESS_BAR_CHAPTER_MARK, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_PROGRESS_BAR_CHAPTER_MARK, value).apply()
    var v49DanmakuHighlightKeyword: Boolean
        get() = prefs.getBoolean(KEY_V49_DANMAKU_HIGHLIGHT_KEYWORD, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_DANMAKU_HIGHLIGHT_KEYWORD, value).apply()
    var v49ColorShadowRecovery: Int
        get() = prefs.getInt(KEY_V49_COLOR_SHADOW_RECOVERY, 0)
        set(value) = prefs.edit().putInt(KEY_V49_COLOR_SHADOW_RECOVERY, value.coerceIn(0, 5)).apply()
    var v49VolumeReplayGain: Int
        get() = prefs.getInt(KEY_V49_VOLUME_REPLAY_GAIN, 0)
        set(value) = prefs.edit().putInt(KEY_V49_VOLUME_REPLAY_GAIN, value.coerceIn(-12, 12)).apply()
    var v49DanmakuBgGradientAngle: Int
        get() = prefs.getInt(KEY_V49_DANMAKU_BG_GRADIENT_ANGLE, 0)
        set(value) = prefs.edit().putInt(KEY_V49_DANMAKU_BG_GRADIENT_ANGLE, value.coerceIn(0, 360)).apply()
    var v49CastAutoReconnect: Boolean
        get() = prefs.getBoolean(KEY_V49_CAST_AUTO_RECONNECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V49_CAST_AUTO_RECONNECT, value).apply()

    // ===== v50.x =====
    var v50PlaybackAutoNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V50_PLAYBACK_AUTO_NEXT_EPISODE, true)
        set(value) = prefs.edit().putBoolean(KEY_V50_PLAYBACK_AUTO_NEXT_EPISODE, value).apply()
    var v50DanmakuFontShadowSize: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_FONT_SHADOW_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_FONT_SHADOW_SIZE, value.coerceIn(0, 10)).apply()
    var v50ColorMidtoneAdjust: Int
        get() = prefs.getInt(KEY_V50_COLOR_MIDTONE_ADJUST, 0)
        set(value) = prefs.edit().putInt(KEY_V50_COLOR_MIDTONE_ADJUST, value.coerceIn(-100, 100)).apply()
    var v50VolumeAmbientMode: Int
        get() = prefs.getInt(KEY_VOLUME_AMBIENT_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_VOLUME_AMBIENT_MODE, value.coerceIn(0, 3)).apply()
    var v50DanmakuSendColorCustom: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_SEND_COLOR_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_SEND_COLOR_CUSTOM, value.coerceIn(0, 10)).apply()
    var v50CastVolumeSync: Boolean
        get() = prefs.getBoolean(KEY_V50_CAST_VOLUME_SYNC, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_CAST_VOLUME_SYNC, value).apply()
    var v50GesturePinchZoom: Boolean
        get() = prefs.getBoolean(KEY_V50_GESTURE_PINCH_ZOOM, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_GESTURE_PINCH_ZOOM, value).apply()
    var v50DanmakuFilterColor: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_FILTER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_FILTER_COLOR, value.coerceIn(0, 10)).apply()
    var v50CachePrebufferSeconds: Int
        get() = prefs.getInt(KEY_V50_CACHE_PREBUFFER_SECONDS, 0)
        set(value) = prefs.edit().putInt(KEY_V50_CACHE_PREBUFFER_SECONDS, value.coerceIn(0, 30)).apply()
    var v50ProgressBarDoubleTapSeek: Int
        get() = prefs.getInt(KEY_V50_PROGRESS_BAR_DOUBLE_TAP_SEEK, 10)
        set(value) = prefs.edit().putInt(KEY_V50_PROGRESS_BAR_DOUBLE_TAP_SEEK, value.coerceIn(5, 60)).apply()
    var v50DanmakuFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V50_DANMAKU_FONT_SIZE_AUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_DANMAKU_FONT_SIZE_AUTO, value).apply()
    var v50ColorDynamicRange: Int
        get() = prefs.getInt(KEY_V50_COLOR_DYNAMIC_RANGE, 0)
        set(value) = prefs.edit().putInt(KEY_V50_COLOR_DYNAMIC_RANGE, value.coerceIn(0, 5)).apply()
    var v50VolumeNightMode: Boolean
        get() = prefs.getBoolean(KEY_V50_VOLUME_NIGHT_MODE, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_VOLUME_NIGHT_MODE, value).apply()
    var v50DanmakuBgBlurRadius: Int
        get() = prefs.getInt(KEY_V50_DANMAKU_BG_BLUR_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V50_DANMAKU_BG_BLUR_RADIUS, value.coerceIn(0, 20)).apply()
    var v50CastAutoDiscover: Boolean
        get() = prefs.getBoolean(KEY_V50_CAST_AUTO_DISCOVER, false)
        set(value) = prefs.edit().putBoolean(KEY_V50_CAST_AUTO_DISCOVER, value).apply()


    // ==================== v51-v60 New Unique Features ====================

    // === v51.x ===
    // v51.1: Playback Auto Next Episode
    var v51PlaybackAutoNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V51_PLAYBACKAUTONEXTEPISODE, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_PLAYBACKAUTONEXTEPISODE, v).apply()

    // v51.2: Danmaku Font Shadow Size
    var v51DanmakuFontShadowSize: Int
        get() = prefs.getInt(KEY_V51_DANMAKUFONTSHADOWSIZE, 0)
        set(v) = prefs.edit().putInt(KEY_V51_DANMAKUFONTSHADOWSIZE, v).apply()

    // v51.3: Color Midtone Adjust
    var v51ColorMidtoneAdjust: Int
        get() = prefs.getInt(KEY_V51_COLORMIDTONEADJUST, 0)
        set(v) = prefs.edit().putInt(KEY_V51_COLORMIDTONEADJUST, v).apply()

    // v51.4: Gesture Custom Action 3
    var v51GestureCustomAction3: Int
        get() = prefs.getInt(KEY_V51_GESTURECUSTOMACTION3, 0)
        set(v) = prefs.edit().putInt(KEY_V51_GESTURECUSTOMACTION3, v).apply()

    // v51.5: Subtitle Font Italic
    var v51SubtitleFontItalic: Boolean
        get() = prefs.getBoolean(KEY_V51_SUBTITLEFONTITALIC, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_SUBTITLEFONTITALIC, v).apply()

    // v51.6: Video Adaptive Contrast Enhanced
    var v51VideoAdaptiveContrastEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V51_VIDEOADAPTIVECONTRASTENHANCED, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_VIDEOADAPTIVECONTRASTENHANCED, v).apply()

    // v51.7: Danmaku Filter Muted Users
    var v51DanmakuFilterMutedUsers: Boolean
        get() = prefs.getBoolean(KEY_V51_DANMAKUFILTERMUTEDUSERS, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_DANMAKUFILTERMUTEDUSERS, v).apply()

    // v51.8: Cast Video Upscale Mode
    var v51CastVideoUpscaleMode: Int
        get() = prefs.getInt(KEY_V51_CASTVIDEOUPSCALEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V51_CASTVIDEOUPSCALEMODE, v).apply()

    // v51.9: Playlist Auto Continue
    var v51PlaylistAutoContinue: Boolean
        get() = prefs.getBoolean(KEY_V51_PLAYLISTAUTOCONTINUE, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_PLAYLISTAUTOCONTINUE, v).apply()

    // v51.10: Video Luma Adaptive
    var v51VideoLumaAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V51_VIDEOLUMAADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_VIDEOLUMAADAPTIVE, v).apply()

    // v51.11: Danmaku Font Spacing Custom
    var v51DanmakuFontSpacingCustom: Int
        get() = prefs.getInt(KEY_V51_DANMAKUFONTSPACINGCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V51_DANMAKUFONTSPACINGCUSTOM, v).apply()

    // v51.12: Subtitle Font Color Custom
    var v51SubtitleFontColorCustom: Int
        get() = prefs.getInt(KEY_V51_SUBTITLEFONTCOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V51_SUBTITLEFONTCOLORCUSTOM, v).apply()

    // v51.13: Gesture Long Press Action
    var v51GestureLongPressAction: Int
        get() = prefs.getInt(KEY_V51_GESTURELONGPRESSACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V51_GESTURELONGPRESSACTION, v).apply()

    // v51.14: Video Chroma Adaptive
    var v51VideoChromaAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V51_VIDEOCHROMAADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_VIDEOCHROMAADAPTIVE, v).apply()

    // v51.15: Cast Audio Sync
    var v51CastAudioSync: Boolean
        get() = prefs.getBoolean(KEY_V51_CASTAUDIOSYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_CASTAUDIOSYNC, v).apply()

    // === v52.x ===
    // v52.1: Video Temporal Noise Reduce
    var v52VideoTemporalNoiseReduce: Boolean
        get() = prefs.getBoolean(KEY_V52_VIDEOTEMPORALNOISEREDUCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_VIDEOTEMPORALNOISEREDUCE, v).apply()

    // v52.2: Danmaku BG Color Custom
    var v52DanmakuBgColorCustom: Int
        get() = prefs.getInt(KEY_V52_DANMAKUBGCOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V52_DANMAKUBGCOLORCUSTOM, v).apply()

    // v52.3: Subtitle Font Size Auto
    var v52SubtitleFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V52_SUBTITLEFONTSIZEAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_SUBTITLEFONTSIZEAUTO, v).apply()

    // v52.4: Gesture Swipe Feedback
    var v52GestureSwipeFeedback: Int
        get() = prefs.getInt(KEY_V52_GESTURESWIPEFEEDBACK, 0)
        set(v) = prefs.edit().putInt(KEY_V52_GESTURESWIPEFEEDBACK, v).apply()

    // v52.5: Video Color Highlight Recovery
    var v52VideoColorHighlightRecovery: Boolean
        get() = prefs.getBoolean(KEY_V52_VIDEOCOLORHIGHLIGHTRECOVERY, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_VIDEOCOLORHIGHLIGHTRECOVERY, v).apply()

    // v52.6: Danmaku Send Preview
    var v52DanmakuSendPreview: Boolean
        get() = prefs.getBoolean(KEY_V52_DANMAKUSENDPREVIEW, true)
        set(v) = prefs.edit().putBoolean(KEY_V52_DANMAKUSENDPREVIEW, v).apply()

    // v52.7: Cast Video Auto Quality
    var v52CastVideoAutoQuality: Boolean
        get() = prefs.getBoolean(KEY_V52_CASTVIDEOAUTOQUALITY, true)
        set(v) = prefs.edit().putBoolean(KEY_V52_CASTVIDEOAUTOQUALITY, v).apply()

    // v52.8: Subtitle BG Padding Custom
    var v52SubtitleBgPaddingCustom: Int
        get() = prefs.getInt(KEY_V52_SUBTITLEBGPADDINGCUSTOM, 2)
        set(v) = prefs.edit().putInt(KEY_V52_SUBTITLEBGPADDINGCUSTOM, v).apply()

    // v52.9: Video Frame Interpolation
    var v52VideoFrameInterpolation: Boolean
        get() = prefs.getBoolean(KEY_V52_VIDEOFRAMEINTERPOLATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_VIDEOFRAMEINTERPOLATION, v).apply()

    // v52.10: Danmaku Merge Algorithm
    var v52DanmakuMergeAlgorithm: Int
        get() = prefs.getInt(KEY_V52_DANMAKUMERGEALGORITHM, 0)
        set(v) = prefs.edit().putInt(KEY_V52_DANMAKUMERGEALGORITHM, v).apply()

    // v52.11: Playlist Shuffle Weighted
    var v52PlaylistShuffleWeighted: Boolean
        get() = prefs.getBoolean(KEY_V52_PLAYLISTSHUFFLEWEIGHTED, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_PLAYLISTSHUFFLEWEIGHTED, v).apply()

    // v52.12: Gesture Pinch Action
    var v52GesturePinchAction: Int
        get() = prefs.getInt(KEY_V52_GESTUREPINCHACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V52_GESTUREPINCHACTION, v).apply()

    // v52.13: Video Color Temperature
    var v52VideoColorTemperature: Int
        get() = prefs.getInt(KEY_V52_VIDEOCOLORTEMPERATURE, 0)
        set(v) = prefs.edit().putInt(KEY_V52_VIDEOCOLORTEMPERATURE, v).apply()

    // v52.14: Danmaku Font Weight Adaptive
    var v52DanmakuFontWeightAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V52_DANMAKUFONTWEIGHTADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_DANMAKUFONTWEIGHTADAPTIVE, v).apply()

    // v52.15: Cast Screen Mirror Mode
    var v52CastScreenMirrorMode: Int
        get() = prefs.getInt(KEY_V52_CASTSCREENMIRRORMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V52_CASTSCREENMIRRORMODE, v).apply()

    // === v53.x ===
    // v53.1: Video Spatial Noise Reduce
    var v53VideoSpatialNoiseReduce: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEOSPATIALNOISEREDUCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEOSPATIALNOISEREDUCE, v).apply()

    // v53.2: Danmaku Opacity Adaptive
    var v53DanmakuOpacityAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKUOPACITYADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_DANMAKUOPACITYADAPTIVE, v).apply()

    // v53.3: Subtitle Sync Auto Detect
    var v53SubtitleSyncAutoDetect: Boolean
        get() = prefs.getBoolean(KEY_V53_SUBTITLESYNCAUTODETECT, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_SUBTITLESYNCAUTODETECT, v).apply()

    // v53.4: Gesture Triple Tap Action
    var v53GestureTripleTapAction: Int
        get() = prefs.getInt(KEY_V53_GESTURETRIPLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V53_GESTURETRIPLETAPACTION, v).apply()

    // v53.5: Video Color Highlight Compress
    var v53VideoColorHighlightCompress: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEOCOLORHIGHLIGHTCOMPRESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEOCOLORHIGHLIGHTCOMPRESS, v).apply()

    // v53.6: Danmaku Send Timer
    var v53DanmakuSendTimer: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKUSENDTIMER, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_DANMAKUSENDTIMER, v).apply()

    // v53.7: Cast Video Latency Mode
    var v53CastVideoLatencyMode: Int
        get() = prefs.getInt(KEY_V53_CASTVIDEOLATENCYMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V53_CASTVIDEOLATENCYMODE, v).apply()

    // v53.8: Subtitle BG Radius Custom
    var v53SubtitleBgRadiusCustom: Int
        get() = prefs.getInt(KEY_V53_SUBTITLEBGRADIUSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V53_SUBTITLEBGRADIUSCUSTOM, v).apply()

    // v53.9: Video Detail Enhance
    var v53VideoDetailEnhance: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEODETAILENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEODETAILENHANCE, v).apply()

    // v53.10: Danmaku Font Size Curve
    var v53DanmakuFontSizeCurve: Int
        get() = prefs.getInt(KEY_V53_DANMAKUFONTSIZECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V53_DANMAKUFONTSIZECURVE, v).apply()

    // v53.11: Playlist Auto Download Quality
    var v53PlaylistAutoDownloadQuality: Int
        get() = prefs.getInt(KEY_V53_PLAYLISTAUTODOWNLOADQUALITY, 0)
        set(v) = prefs.edit().putInt(KEY_V53_PLAYLISTAUTODOWNLOADQUALITY, v).apply()

    // v53.12: Gesture Swipe Threshold
    var v53GestureSwipeThreshold: Int
        get() = prefs.getInt(KEY_V53_GESTURESWIPETHRESHOLD, 50)
        set(v) = prefs.edit().putInt(KEY_V53_GESTURESWIPETHRESHOLD, v).apply()

    // v53.13: Video Color Shadow Compress
    var v53VideoColorShadowCompress: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEOCOLORSHADOWCOMPRESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEOCOLORSHADOWCOMPRESS, v).apply()

    // v53.14: Danmaku Stroke Color Custom
    var v53DanmakuStrokeColorCustom: Int
        get() = prefs.getInt(KEY_V53_DANMAKUSTROKECOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V53_DANMAKUSTROKECOLORCUSTOM, v).apply()

    // v53.15: Cast Audio Fade Mode
    var v53CastAudioFadeMode: Int
        get() = prefs.getInt(KEY_V53_CASTAUDIOFADEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V53_CASTAUDIOFADEMODE, v).apply()

    // === v54.x ===
    // v54.1: Video Color Grading Custom
    var v54VideoColorGradingCustom: Boolean
        get() = prefs.getBoolean(KEY_V54_VIDEOCOLORGRADINGCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_VIDEOCOLORGRADINGCUSTOM, v).apply()

    // v54.2: Danmaku Border Weight
    var v54DanmakuBorderWeight: Int
        get() = prefs.getInt(KEY_V54_DANMAKUBORDERWEIGHT, 1)
        set(v) = prefs.edit().putInt(KEY_V54_DANMAKUBORDERWEIGHT, v).apply()

    // v54.3: Subtitle Font Weight
    var v54SubtitleFontWeight: Int
        get() = prefs.getInt(KEY_V54_SUBTITLEFONTWEIGHT, 400)
        set(v) = prefs.edit().putInt(KEY_V54_SUBTITLEFONTWEIGHT, v).apply()

    // v54.4: Gesture Edge Swipe Speed
    var v54GestureEdgeSwipeSpeed: Int
        get() = prefs.getInt(KEY_V54_GESTUREEDGESWIPESPEED, 50)
        set(v) = prefs.edit().putInt(KEY_V54_GESTUREEDGESWIPESPEED, v).apply()

    // v54.5: Video Adaptive Saturation
    var v54VideoAdaptiveSaturation: Boolean
        get() = prefs.getBoolean(KEY_V54_VIDEOADAPTIVESATURATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_VIDEOADAPTIVESATURATION, v).apply()

    // v54.6: Danmaku Send Max Length Custom
    var v54DanmakuSendMaxLengthCustom: Int
        get() = prefs.getInt(KEY_V54_DANMAKUSENDMAXLENGTHCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_DANMAKUSENDMAXLENGTHCUSTOM, v).apply()

    // v54.7: Cast Video Frame Rate Sync
    var v54CastVideoFrameRateSync: Boolean
        get() = prefs.getBoolean(KEY_V54_CASTVIDEOFRAMERATESYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V54_CASTVIDEOFRAMERATESYNC, v).apply()

    // v54.8: Subtitle Outline Color Custom
    var v54SubtitleOutlineColorCustom: Int
        get() = prefs.getInt(KEY_V54_SUBTITLEOUTLINECOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_SUBTITLEOUTLINECOLORCUSTOM, v).apply()

    // v54.9: Video Luma Curve Custom
    var v54VideoLumaCurveCustom: Int
        get() = prefs.getInt(KEY_V54_VIDEOLUMACURVECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_VIDEOLUMACURVECUSTOM, v).apply()

    // v54.10: Danmaku History Filter
    var v54DanmakuHistoryFilter: Boolean
        get() = prefs.getBoolean(KEY_V54_DANMAKUHISTORYFILTER, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_DANMAKUHISTORYFILTER, v).apply()

    // v54.11: Playlist Auto Skip Watched
    var v54PlaylistAutoSkipWatched: Boolean
        get() = prefs.getBoolean(KEY_V54_PLAYLISTAUTOSKIPWATCHED, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_PLAYLISTAUTOSKIPWATCHED, v).apply()

    // v54.12: Gesture Double Tap Action
    var v54GestureDoubleTapAction: Int
        get() = prefs.getInt(KEY_V54_GESTUREDOUBLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V54_GESTUREDOUBLETAPACTION, v).apply()

    // v54.13: Video Chroma Curve Custom
    var v54VideoChromaCurveCustom: Int
        get() = prefs.getInt(KEY_V54_VIDEOCHROMACURVECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_VIDEOCHROMACURVECUSTOM, v).apply()

    // v54.14: Danmaku BG Opacity Custom
    var v54DanmakuBgOpacityCustom: Int
        get() = prefs.getInt(KEY_V54_DANMAKUBGOPACITYCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_DANMAKUBGOPACITYCUSTOM, v).apply()

    // v54.15: Cast Audio Codec Custom
    var v54CastAudioCodecCustom: Int
        get() = prefs.getInt(KEY_V54_CASTAUDIOCODECCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_CASTAUDIOCODECCUSTOM, v).apply()

    // === v55.x ===
    // v55.1: Video Color Fade
    var v55VideoColorFade: Int
        get() = prefs.getInt(KEY_V55_VIDEOCOLORFADE, 0)
        set(v) = prefs.edit().putInt(KEY_V55_VIDEOCOLORFADE, v).apply()

    // v55.2: Danmaku Text Glow Custom
    var v55DanmakuTextGlowCustom: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKUTEXTGLOWCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_DANMAKUTEXTGLOWCUSTOM, v).apply()

    // v55.3: Subtitle Animation Speed
    var v55SubtitleAnimationSpeed: Int
        get() = prefs.getInt(KEY_V55_SUBTITLEANIMATIONSPEED, 50)
        set(v) = prefs.edit().putInt(KEY_V55_SUBTITLEANIMATIONSPEED, v).apply()

    // v55.4: Gesture Pinch Zoom Mode
    var v55GesturePinchZoomMode: Int
        get() = prefs.getInt(KEY_V55_GESTUREPINCHZOOMMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V55_GESTUREPINCHZOOMMODE, v).apply()

    // v55.5: Video Adaptive Gamma
    var v55VideoAdaptiveGamma: Boolean
        get() = prefs.getBoolean(KEY_V55_VIDEOADAPTIVEGAMMA, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_VIDEOADAPTIVEGAMMA, v).apply()

    // v55.6: Danmaku Send Rate Custom
    var v55DanmakuSendRateCustom: Int
        get() = prefs.getInt(KEY_V55_DANMAKUSENDRATECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V55_DANMAKUSENDRATECUSTOM, v).apply()

    // v55.7: Cast Video Bitrate Adaptive
    var v55CastVideoBitrateAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V55_CASTVIDEOBITRATEADAPTIVE, true)
        set(v) = prefs.edit().putBoolean(KEY_V55_CASTVIDEOBITRATEADAPTIVE, v).apply()

    // v55.8: Subtitle BG Opacity Custom
    var v55SubtitleBgOpacityCustom: Int
        get() = prefs.getInt(KEY_V55_SUBTITLEBGOPACITYCUSTOM, 80)
        set(v) = prefs.edit().putInt(KEY_V55_SUBTITLEBGOPACITYCUSTOM, v).apply()

    // v55.9: Video Frame Blend
    var v55VideoFrameBlend: Boolean
        get() = prefs.getBoolean(KEY_V55_VIDEOFRAMEBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_VIDEOFRAMEBLEND, v).apply()

    // v55.10: Danmaku Lane Count
    var v55DanmakuLaneCount: Int
        get() = prefs.getInt(KEY_V55_DANMAKULANECOUNT, 0)
        set(v) = prefs.edit().putInt(KEY_V55_DANMAKULANECOUNT, v).apply()

    // v55.11: Playlist Auto Sync
    var v55PlaylistAutoSync: Boolean
        get() = prefs.getBoolean(KEY_V55_PLAYLISTAUTOSYNC, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_PLAYLISTAUTOSYNC, v).apply()

    // v55.12: Gesture Rotate Action
    var v55GestureRotateAction: Int
        get() = prefs.getInt(KEY_V55_GESTUREROTATEACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V55_GESTUREROTATEACTION, v).apply()

    // v55.13: Video Color Tint Enhanced
    var v55VideoColorTintEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V55_VIDEOCOLORTINTENHANCED, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_VIDEOCOLORTINTENHANCED, v).apply()

    // v55.14: Danmaku Font Custom Path
    var v55DanmakuFontCustomPath: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKUFONTCUSTOMPATH, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_DANMAKUFONTCUSTOMPATH, v).apply()

    // v55.15: Cast Audio Latency Auto
    var v55CastAudioLatencyAuto: Boolean
        get() = prefs.getBoolean(KEY_V55_CASTAUDIOLATENCYAUTO, true)
        set(v) = prefs.edit().putBoolean(KEY_V55_CASTAUDIOLATENCYAUTO, v).apply()

    // === v56.x ===
    // v56.1: Video Adaptive Detail
    var v56VideoAdaptiveDetail: Boolean
        get() = prefs.getBoolean(KEY_V56_VIDEOADAPTIVEDETAIL, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_VIDEOADAPTIVEDETAIL, v).apply()

    // v56.2: Danmaku Stroke Blur
    var v56DanmakuStrokeBlur: Int
        get() = prefs.getInt(KEY_V56_DANMAKUSTROKEBLUR, 0)
        set(v) = prefs.edit().putInt(KEY_V56_DANMAKUSTROKEBLUR, v).apply()

    // v56.3: Subtitle Word Spacing
    var v56SubtitleWordSpacing: Int
        get() = prefs.getInt(KEY_V56_SUBTITLEWORDSPACING, 0)
        set(v) = prefs.edit().putInt(KEY_V56_SUBTITLEWORDSPACING, v).apply()

    // v56.4: Gesture Multi Finger Action
    var v56GestureMultiFingerAction: Int
        get() = prefs.getInt(KEY_V56_GESTUREMULTIFINGERACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V56_GESTUREMULTIFINGERACTION, v).apply()

    // v56.5: Video Color Black Level Custom
    var v56VideoColorBlackLevelCustom: Int
        get() = prefs.getInt(KEY_V56_VIDEOCOLORBLACKLEVELCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_VIDEOCOLORBLACKLEVELCUSTOM, v).apply()

    // v56.6: Danmaku Send Font Custom
    var v56DanmakuSendFontCustom: Boolean
        get() = prefs.getBoolean(KEY_V56_DANMAKUSENDFONTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_DANMAKUSENDFONTCUSTOM, v).apply()

    // v56.7: Cast Video Resolution Custom
    var v56CastVideoResolutionCustom: Int
        get() = prefs.getInt(KEY_V56_CASTVIDEORESOLUTIONCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_CASTVIDEORESOLUTIONCUSTOM, v).apply()

    // v56.8: Subtitle Font Stretch Custom
    var v56SubtitleFontStretchCustom: Int
        get() = prefs.getInt(KEY_V56_SUBTITLEFONTSTRETCHCUSTOM, 100)
        set(v) = prefs.edit().putInt(KEY_V56_SUBTITLEFONTSTRETCHCUSTOM, v).apply()

    // v56.9: Video Color White Level Custom
    var v56VideoColorWhiteLevelCustom: Int
        get() = prefs.getInt(KEY_V56_VIDEOCOLORWHITELEVELCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_VIDEOCOLORWHITELEVELCUSTOM, v).apply()

    // v56.10: Danmaku Filter By Color
    var v56DanmakuFilterByColor: Boolean
        get() = prefs.getBoolean(KEY_V56_DANMAKUFILTERBYCOLOR, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_DANMAKUFILTERBYCOLOR, v).apply()

    // v56.11: Playlist Auto Delete Expired
    var v56PlaylistAutoDeleteExpired: Boolean
        get() = prefs.getBoolean(KEY_V56_PLAYLISTAUTODELETEEXPIRED, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_PLAYLISTAUTODELETEEXPIRED, v).apply()

    // v56.12: Gesture Swipe Direction Lock
    var v56GestureSwipeDirectionLock: Int
        get() = prefs.getInt(KEY_V56_GESTURESWIPEDIRECTIONLOCK, 0)
        set(v) = prefs.edit().putInt(KEY_V56_GESTURESWIPEDIRECTIONLOCK, v).apply()

    // v56.13: Video Color Midtone Custom
    var v56VideoColorMidtoneCustom: Int
        get() = prefs.getInt(KEY_V56_VIDEOCOLORMIDTONECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_VIDEOCOLORMIDTONECUSTOM, v).apply()

    // v56.14: Danmaku BG Padding Custom
    var v56DanmakuBgPaddingCustom: Int
        get() = prefs.getInt(KEY_V56_DANMAKUBGPADDINGCUSTOM, 2)
        set(v) = prefs.edit().putInt(KEY_V56_DANMAKUBGPADDINGCUSTOM, v).apply()

    // v56.15: Cast Audio Volume Sync
    var v56CastAudioVolumeSync: Boolean
        get() = prefs.getBoolean(KEY_V56_CASTAUDIOVOLUMESYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V56_CASTAUDIOVOLUMESYNC, v).apply()

    // === v57.x ===
    // v57.1: Video Temporal Enhance
    var v57VideoTemporalEnhance: Boolean
        get() = prefs.getBoolean(KEY_V57_VIDEOTEMPORALENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_VIDEOTEMPORALENHANCE, v).apply()

    // v57.2: Danmaku Font Line Height Custom
    var v57DanmakuFontLineHeightCustom: Int
        get() = prefs.getInt(KEY_V57_DANMAKUFONTLINEHEIGHTCUSTOM, 120)
        set(v) = prefs.edit().putInt(KEY_V57_DANMAKUFONTLINEHEIGHTCUSTOM, v).apply()

    // v57.3: Subtitle Outline Width Custom
    var v57SubtitleOutlineWidthCustom: Int
        get() = prefs.getInt(KEY_V57_SUBTITLEOUTLINEWIDTHCUSTOM, 1)
        set(v) = prefs.edit().putInt(KEY_V57_SUBTITLEOUTLINEWIDTHCUSTOM, v).apply()

    // v57.4: Gesture Long Press Feedback
    var v57GestureLongPressFeedback: Int
        get() = prefs.getInt(KEY_V57_GESTURELONGPRESSFEEDBACK, 0)
        set(v) = prefs.edit().putInt(KEY_V57_GESTURELONGPRESSFEEDBACK, v).apply()

    // v57.5: Video Color Highlight Custom
    var v57VideoColorHighlightCustom: Int
        get() = prefs.getInt(KEY_V57_VIDEOCOLORHIGHLIGHTCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_VIDEOCOLORHIGHLIGHTCUSTOM, v).apply()

    // v57.6: Danmaku Send Effect Custom
    var v57DanmakuSendEffectCustom: Boolean
        get() = prefs.getBoolean(KEY_V57_DANMAKUSENDEFFECTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_DANMAKUSENDEFFECTCUSTOM, v).apply()

    // v57.7: Cast Video Color Profile
    var v57CastVideoColorProfile: Int
        get() = prefs.getInt(KEY_V57_CASTVIDEOCOLORPROFILE, 0)
        set(v) = prefs.edit().putInt(KEY_V57_CASTVIDEOCOLORPROFILE, v).apply()

    // v57.8: Subtitle BG Blur Mode
    var v57SubtitleBgBlurMode: Int
        get() = prefs.getInt(KEY_V57_SUBTITLEBGBLURMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V57_SUBTITLEBGBLURMODE, v).apply()

    // v57.9: Video Color Shadow Custom
    var v57VideoColorShadowCustom: Int
        get() = prefs.getInt(KEY_V57_VIDEOCOLORSHADOWCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_VIDEOCOLORSHADOWCUSTOM, v).apply()

    // v57.10: Danmaku History Export Format
    var v57DanmakuHistoryExportFormat: Int
        get() = prefs.getInt(KEY_V57_DANMAKUHISTORYEXPORTFORMAT, 0)
        set(v) = prefs.edit().putInt(KEY_V57_DANMAKUHISTORYEXPORTFORMAT, v).apply()

    // v57.11: Playlist Auto Sort By Rating
    var v57PlaylistAutoSortByRating: Boolean
        get() = prefs.getBoolean(KEY_V57_PLAYLISTAUTOSORTBYRATING, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_PLAYLISTAUTOSORTBYRATING, v).apply()

    // v57.12: Gesture Dead Zone Mode
    var v57GestureDeadZoneMode: Int
        get() = prefs.getInt(KEY_V57_GESTUREDEADZONEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V57_GESTUREDEADZONEMODE, v).apply()

    // v57.13: Video Color Gamma Custom
    var v57VideoColorGammaCustom: Int
        get() = prefs.getInt(KEY_V57_VIDEOCOLORGAMMACUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_VIDEOCOLORGAMMACUSTOM, v).apply()

    // v57.14: Danmaku Border Radius Custom
    var v57DanmakuBorderRadiusCustom: Int
        get() = prefs.getInt(KEY_V57_DANMAKUBORDERRADIUSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_DANMAKUBORDERRADIUSCUSTOM, v).apply()

    // v57.15: Cast Audio Normalization Auto
    var v57CastAudioNormalizationAuto: Boolean
        get() = prefs.getBoolean(KEY_V57_CASTAUDIONORMALIZATIONAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_CASTAUDIONORMALIZATIONAUTO, v).apply()

    // === v58.x ===
    // v58.1: Video Spatial Enhance
    var v58VideoSpatialEnhance: Boolean
        get() = prefs.getBoolean(KEY_V58_VIDEOSPATIALENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_VIDEOSPATIALENHANCE, v).apply()

    // v58.2: Danmaku Font Size Adaptive Custom
    var v58DanmakuFontSizeAdaptiveCustom: Boolean
        get() = prefs.getBoolean(KEY_V58_DANMAKUFONTSIZEADAPTIVECUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_DANMAKUFONTSIZEADAPTIVECUSTOM, v).apply()

    // v58.3: Subtitle Font Kerning Custom
    var v58SubtitleFontKerningCustom: Boolean
        get() = prefs.getBoolean(KEY_V58_SUBTITLEFONTKERNINGCUSTOM, true)
        set(v) = prefs.edit().putBoolean(KEY_V58_SUBTITLEFONTKERNINGCUSTOM, v).apply()

    // v58.4: Gesture Custom Action 4
    var v58GestureCustomAction4: Int
        get() = prefs.getInt(KEY_V58_GESTURECUSTOMACTION4, 0)
        set(v) = prefs.edit().putInt(KEY_V58_GESTURECUSTOMACTION4, v).apply()

    // v58.5: Video Color Saturation Custom
    var v58VideoColorSaturationCustom: Int
        get() = prefs.getInt(KEY_V58_VIDEOCOLORSATURATIONCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_VIDEOCOLORSATURATIONCUSTOM, v).apply()

    // v58.6: Danmaku Send Color Preset
    var v58DanmakuSendColorPreset: Int
        get() = prefs.getInt(KEY_V58_DANMAKUSENDCOLORPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V58_DANMAKUSENDCOLORPRESET, v).apply()

    // v58.7: Cast Video Upscale Mode Custom
    var v58CastVideoUpscaleModeCustom: Int
        get() = prefs.getInt(KEY_V58_CASTVIDEOUPSCALEMODECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_CASTVIDEOUPSCALEMODECUSTOM, v).apply()

    // v58.8: Subtitle Font Letter Spacing Custom
    var v58SubtitleFontLetterSpacingCustom: Int
        get() = prefs.getInt(KEY_V58_SUBTITLEFONTLETTERSPACINGCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_SUBTITLEFONTLETTERSPACINGCUSTOM, v).apply()

    // v58.9: Video Color Contrast Custom
    var v58VideoColorContrastCustom: Int
        get() = prefs.getInt(KEY_V58_VIDEOCOLORCONTRASTCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_VIDEOCOLORCONTRASTCUSTOM, v).apply()

    // v58.10: Danmaku Merge Window Auto
    var v58DanmakuMergeWindowAuto: Boolean
        get() = prefs.getBoolean(KEY_V58_DANMAKUMERGEWINDOWAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_DANMAKUMERGEWINDOWAUTO, v).apply()

    // v58.11: Playlist Auto Mark Expired
    var v58PlaylistAutoMarkExpired: Boolean
        get() = prefs.getBoolean(KEY_V58_PLAYLISTAUTOMARKEXPIRED, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_PLAYLISTAUTOMARKEXPIRED, v).apply()

    // v58.12: Gesture Swipe Velocity Custom
    var v58GestureSwipeVelocityCustom: Int
        get() = prefs.getInt(KEY_V58_GESTURESWIPEVELOCITYCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V58_GESTURESWIPEVELOCITYCUSTOM, v).apply()

    // v58.13: Video Color Brightness Custom
    var v58VideoColorBrightnessCustom: Int
        get() = prefs.getInt(KEY_V58_VIDEOCOLORBRIGHTNESSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_VIDEOCOLORBRIGHTNESSCUSTOM, v).apply()

    // v58.14: Danmaku BG Radius Custom
    var v58DanmakuBgRadiusCustom: Int
        get() = prefs.getInt(KEY_V58_DANMAKUBGRADIUSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_DANMAKUBGRADIUSCUSTOM, v).apply()

    // v58.15: Cast Audio Delay Custom (ms)
    var v58CastAudioDelayCustom: Int
        get() = prefs.getInt(KEY_V58_CASTAUDIODELAYCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_CASTAUDIODELAYCUSTOM, v).apply()

    // === v59.x ===
    // v59.1: Video Color Matrix Custom
    var v59VideoColorMatrixCustom: Boolean
        get() = prefs.getBoolean(KEY_V59_VIDEOCOLORMATRIXCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_VIDEOCOLORMATRIXCUSTOM, v).apply()

    // v59.2: Danmaku Text Shadow Custom
    var v59DanmakuTextShadowCustom: Int
        get() = prefs.getInt(KEY_V59_DANMAKUTEXTSHADOWCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_DANMAKUTEXTSHADOWCUSTOM, v).apply()

    // v59.3: Subtitle Animation Delay
    var v59SubtitleAnimationDelay: Int
        get() = prefs.getInt(KEY_V59_SUBTITLEANIMATIONDELAY, 0)
        set(v) = prefs.edit().putInt(KEY_V59_SUBTITLEANIMATIONDELAY, v).apply()

    // v59.4: Gesture Edge Swipe Custom
    var v59GestureEdgeSwipeCustom: Int
        get() = prefs.getInt(KEY_V59_GESTUREEDGESWIPECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_GESTUREEDGESWIPECUSTOM, v).apply()

    // v59.5: Video Color Denoise Strength
    var v59VideoColorDenoiseStrength: Int
        get() = prefs.getInt(KEY_V59_VIDEOCOLORDENOISESTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V59_VIDEOCOLORDENOISESTRENGTH, v).apply()

    // v59.6: Danmaku Send Effect Preview
    var v59DanmakuSendEffectPreview: Boolean
        get() = prefs.getBoolean(KEY_V59_DANMAKUSENDEFFECTPREVIEW, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_DANMAKUSENDEFFECTPREVIEW, v).apply()

    // v59.7: Cast Video Color Space
    var v59CastVideoColorSpace: Int
        get() = prefs.getInt(KEY_V59_CASTVIDEOCOLORSPACE, 0)
        set(v) = prefs.edit().putInt(KEY_V59_CASTVIDEOCOLORSPACE, v).apply()

    // v59.8: Subtitle BG Gradient Custom
    var v59SubtitleBgGradientCustom: Boolean
        get() = prefs.getBoolean(KEY_V59_SUBTITLEBGGRADIENTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_SUBTITLEBGGRADIENTCUSTOM, v).apply()

    // v59.9: Video Color Vibrance Custom
    var v59VideoColorVibranceCustom: Int
        get() = prefs.getInt(KEY_V59_VIDEOCOLORVIBRANCECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_VIDEOCOLORVIBRANCECUSTOM, v).apply()

    // v59.10: Danmaku History Search Custom
    var v59DanmakuHistorySearchCustom: Boolean
        get() = prefs.getBoolean(KEY_V59_DANMAKUHISTORYSEARCHCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_DANMAKUHISTORYSEARCHCUSTOM, v).apply()

    // v59.11: Playlist Auto Backup
    var v59PlaylistAutoBackup: Boolean
        get() = prefs.getBoolean(KEY_V59_PLAYLISTAUTOBACKUP, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_PLAYLISTAUTOBACKUP, v).apply()

    // v59.12: Gesture Pinch Sensitivity Custom
    var v59GesturePinchSensitivityCustom: Int
        get() = prefs.getInt(KEY_V59_GESTUREPINCHSENSITIVITYCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V59_GESTUREPINCHSENSITIVITYCUSTOM, v).apply()

    // v59.13: Video Color Temperature Custom
    var v59VideoColorTemperatureCustom: Int
        get() = prefs.getInt(KEY_V59_VIDEOCOLORTEMPERATURECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_VIDEOCOLORTEMPERATURECUSTOM, v).apply()

    // v59.14: Danmaku Font Weight Custom
    var v59DanmakuFontWeightCustom: Int
        get() = prefs.getInt(KEY_V59_DANMAKUFONTWEIGHTCUSTOM, 400)
        set(v) = prefs.edit().putInt(KEY_V59_DANMAKUFONTWEIGHTCUSTOM, v).apply()

    // v59.15: Cast Audio Channel Sync
    var v59CastAudioChannelSync: Boolean
        get() = prefs.getBoolean(KEY_V59_CASTAUDIOCHANNELSYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V59_CASTAUDIOCHANNELSYNC, v).apply()

    // === v60.x ===
    // v60.1: Video Adaptive Color Enhance
    var v60VideoAdaptiveColorEnhance: Boolean
        get() = prefs.getBoolean(KEY_V60_VIDEOADAPTIVECOLORENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V60_VIDEOADAPTIVECOLORENHANCE, v).apply()

    // v60.2: Danmaku Border Weight Custom
    var v60DanmakuBorderWeightCustom: Int
        get() = prefs.getInt(KEY_V60_DANMAKUBORDERWEIGHTCUSTOM, 1)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUBORDERWEIGHTCUSTOM, v).apply()

    // v60.3: Subtitle Font Shadow Custom
    var v60SubtitleFontShadowCustom: Int
        get() = prefs.getInt(KEY_V60_SUBTITLEFONTSHADOWCUSTOM, 1)
        set(v) = prefs.edit().putInt(KEY_V60_SUBTITLEFONTSHADOWCUSTOM, v).apply()

    // v60.4: Gesture Multi Touch Custom
    var v60GestureMultiTouchCustom: Int
        get() = prefs.getInt(KEY_V60_GESTUREMULTITOUCHCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V60_GESTUREMULTITOUCHCUSTOM, v).apply()

    // v60.5: Video Color Tint Preset
    var v60VideoColorTintPreset: Int
        get() = prefs.getInt(KEY_V60_VIDEOCOLORTINTPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_VIDEOCOLORTINTPRESET, v).apply()

    // v60.6: Danmaku Send Max Length Enhanced
    var v60DanmakuSendMaxLengthEnhanced: Int
        get() = prefs.getInt(KEY_V60_DANMAKUSENDMAXLENGTHENHANCED, 0)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUSENDMAXLENGTHENHANCED, v).apply()

    // v60.7: Cast Video Auto Resolution
    var v60CastVideoAutoResolution: Boolean
        get() = prefs.getBoolean(KEY_V60_CASTVIDEOAUTORESOLUTION, true)
        set(v) = prefs.edit().putBoolean(KEY_V60_CASTVIDEOAUTORESOLUTION, v).apply()

    // v60.8: Subtitle BG Color Preset
    var v60SubtitleBgColorPreset: Int
        get() = prefs.getInt(KEY_V60_SUBTITLEBGCOLORPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_SUBTITLEBGCOLORPRESET, v).apply()

    // v60.9: Video Color LUT Custom
    var v60VideoColorLUTCustom: Boolean
        get() = prefs.getBoolean(KEY_V60_VIDEOCOLORLUTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V60_VIDEOCOLORLUTCUSTOM, v).apply()

    // v60.10: Danmaku Font Size Preset
    var v60DanmakuFontSizePreset: Int
        get() = prefs.getInt(KEY_V60_DANMAKUFONTSIZEPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUFONTSIZEPRESET, v).apply()

    // v60.11: Playlist Auto Restore
    var v60PlaylistAutoRestore: Boolean
        get() = prefs.getBoolean(KEY_V60_PLAYLISTAUTORESTORE, false)
        set(v) = prefs.edit().putBoolean(KEY_V60_PLAYLISTAUTORESTORE, v).apply()

    // v60.12: Gesture Custom Sensitivity Enhanced
    var v60GestureCustomSensitivityEnhanced: Int
        get() = prefs.getInt(KEY_V60_GESTURECUSTOMSENSITIVITYENHANCED, 50)
        set(v) = prefs.edit().putInt(KEY_V60_GESTURECUSTOMSENSITIVITYENHANCED, v).apply()

    // v60.13: Video Color Grading Preset
    var v60VideoColorGradingPreset: Int
        get() = prefs.getInt(KEY_V60_VIDEOCOLORGRADINGPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_VIDEOCOLORGRADINGPRESET, v).apply()

    // v60.14: Danmaku BG Color Preset
    var v60DanmakuBgColorPreset: Int
        get() = prefs.getInt(KEY_V60_DANMAKUBGCOLORPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUBGCOLORPRESET, v).apply()

    // v60.15: Cast Audio Fade Mode Custom
    var v60CastAudioFadeModeCustom: Int
        get() = prefs.getInt(KEY_V60_CASTAUDIOFADEMODECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V60_CASTAUDIOFADEMODECUSTOM, v).apply()


    // ==================== v61-v70 New Unique Features ====================

    // === v61.x ===
    // v61.1: Video Edge Enhance Strength
    var v61VideoEdgeEnhanceStrength: Boolean
        get() = prefs.getBoolean(KEY_V61_VIDEOEDGEENHANCESTRENGTH, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_VIDEOEDGEENHANCESTRENGTH, v).apply()

    // v61.2: Danmaku Collision Detection
    var v61DanmakuCollisionDetection: Boolean
        get() = prefs.getBoolean(KEY_V61_DANMAKUCOLLISIONDETECTION, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_DANMAKUCOLLISIONDETECTION, v).apply()

    // v61.3: Subtitle Position Offset X
    var v61SubtitlePositionOffsetX: Int
        get() = prefs.getInt(KEY_V61_SUBTITLEPOSITIONOFFSETX, 0)
        set(v) = prefs.edit().putInt(KEY_V61_SUBTITLEPOSITIONOFFSETX, v).apply()

    // v61.4: Gesture Fling Velocity
    var v61GestureFlingVelocity: Int
        get() = prefs.getInt(KEY_V61_GESTUREFLINGVELOCITY, 50)
        set(v) = prefs.edit().putInt(KEY_V61_GESTUREFLINGVELOCITY, v).apply()

    // v61.5: Video Motion Compensation
    var v61VideoMotionCompensation: Boolean
        get() = prefs.getBoolean(KEY_V61_VIDEOMOTIONCOMPENSATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_VIDEOMOTIONCOMPENSATION, v).apply()

    // v61.6: Danmaku Animation Type
    var v61DanmakuAnimationType: Int
        get() = prefs.getInt(KEY_V61_DANMAKUANIMATIONTYPE, 0)
        set(v) = prefs.edit().putInt(KEY_V61_DANMAKUANIMATIONTYPE, v).apply()

    // v61.7: Cast Video Buffer (ms)
    var v61CastVideoBufferMs: Int
        get() = prefs.getInt(KEY_V61_CASTVIDEOBUFFERMS, 0)
        set(v) = prefs.edit().putInt(KEY_V61_CASTVIDEOBUFFERMS, v).apply()

    // v61.8: Subtitle Font Size Min
    var v61SubtitleFontSizeMin: Int
        get() = prefs.getInt(KEY_V61_SUBTITLEFONTSIZEMIN, 12)
        set(v) = prefs.edit().putInt(KEY_V61_SUBTITLEFONTSIZEMIN, v).apply()

    // v61.9: Video Adaptive Sharpness
    var v61VideoAdaptiveSharpness: Boolean
        get() = prefs.getBoolean(KEY_V61_VIDEOADAPTIVESHARPNESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_VIDEOADAPTIVESHARPNESS, v).apply()

    // v61.10: Danmaku Filter By Length
    var v61DanmakuFilterByLength: Int
        get() = prefs.getInt(KEY_V61_DANMAKUFILTERBYLENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V61_DANMAKUFILTERBYLENGTH, v).apply()

    // v61.11: Playlist Smart Filter
    var v61PlaylistSmartFilter: Boolean
        get() = prefs.getBoolean(KEY_V61_PLAYLISTSMARTFILTER, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_PLAYLISTSMARTFILTER, v).apply()

    // v61.12: Gesture Swipe Curve
    var v61GestureSwipeCurve: Int
        get() = prefs.getInt(KEY_V61_GESTURESWIPECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V61_GESTURESWIPECURVE, v).apply()

    // v61.13: Video Color Balance RGB
    var v61VideoColorBalanceRGB: Int
        get() = prefs.getInt(KEY_V61_VIDEOCOLORBALANCERGB, 0)
        set(v) = prefs.edit().putInt(KEY_V61_VIDEOCOLORBALANCERGB, v).apply()

    // v61.14: Danmaku Font Size Auto Min
    var v61DanmakuFontSizeAutoMin: Int
        get() = prefs.getInt(KEY_V61_DANMAKUFONTSIZEAUTOMIN, 12)
        set(v) = prefs.edit().putInt(KEY_V61_DANMAKUFONTSIZEAUTOMIN, v).apply()

    // v61.15: Cast Audio Buffer (ms)
    var v61CastAudioBufferMs: Int
        get() = prefs.getInt(KEY_V61_CASTAUDIOBUFFERMS, 0)
        set(v) = prefs.edit().putInt(KEY_V61_CASTAUDIOBUFFERMS, v).apply()

    // === v62.x ===
    // v62.1: Video Temporal Denoise
    var v62VideoTemporalDenoise: Boolean
        get() = prefs.getBoolean(KEY_V62_VIDEOTEMPORALDENOISE, false)
        set(v) = prefs.edit().putBoolean(KEY_V62_VIDEOTEMPORALDENOISE, v).apply()

    // v62.2: Danmaku Scroll Speed Custom
    var v62DanmakuScrollSpeedCustom: Int
        get() = prefs.getInt(KEY_V62_DANMAKUSCROLLSPEEDCUSTOM, 100)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUSCROLLSPEEDCUSTOM, v).apply()

    // v62.3: Subtitle Position Offset Y
    var v62SubtitlePositionOffsetY: Int
        get() = prefs.getInt(KEY_V62_SUBTITLEPOSITIONOFFSETY, 0)
        set(v) = prefs.edit().putInt(KEY_V62_SUBTITLEPOSITIONOFFSETY, v).apply()

    // v62.4: Gesture Tap Feedback
    var v62GestureTapFeedback: Int
        get() = prefs.getInt(KEY_V62_GESTURETAPFEEDBACK, 0)
        set(v) = prefs.edit().putInt(KEY_V62_GESTURETAPFEEDBACK, v).apply()

    // v62.5: Video Adaptive Noise Gate
    var v62VideoAdaptiveNoiseGate: Boolean
        get() = prefs.getBoolean(KEY_V62_VIDEOADAPTIVENOISEGATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V62_VIDEOADAPTIVENOISEGATE, v).apply()

    // v62.6: Danmaku Merge Distance Custom
    var v62DanmakuMergeDistanceCustom: Int
        get() = prefs.getInt(KEY_V62_DANMAKUMERGEDISTANCECUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUMERGEDISTANCECUSTOM, v).apply()

    // v62.7: Cast Video Decode Mode
    var v62CastVideoDecodeMode: Int
        get() = prefs.getInt(KEY_V62_CASTVIDEODECODEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_CASTVIDEODECODEMODE, v).apply()

    // v62.8: Subtitle Font Size Max
    var v62SubtitleFontSizeMax: Int
        get() = prefs.getInt(KEY_V62_SUBTITLEFONTSIZEMAX, 48)
        set(v) = prefs.edit().putInt(KEY_V62_SUBTITLEFONTSIZEMAX, v).apply()

    // v62.9: Video Adaptive Contrast Curve
    var v62VideoAdaptiveContrastCurve: Int
        get() = prefs.getInt(KEY_V62_VIDEOADAPTIVECONTRASTCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_VIDEOADAPTIVECONTRASTCURVE, v).apply()

    // v62.10: Danmaku Filter By Speed
    var v62DanmakuFilterBySpeed: Int
        get() = prefs.getInt(KEY_V62_DANMAKUFILTERBYSPEED, 0)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUFILTERBYSPEED, v).apply()

    // v62.11: Playlist Auto Group
    var v62PlaylistAutoGroup: Boolean
        get() = prefs.getBoolean(KEY_V62_PLAYLISTAUTOGROUP, false)
        set(v) = prefs.edit().putBoolean(KEY_V62_PLAYLISTAUTOGROUP, v).apply()

    // v62.12: Gesture Swipe Acceleration
    var v62GestureSwipeAcceleration: Int
        get() = prefs.getInt(KEY_V62_GESTURESWIPEACCELERATION, 50)
        set(v) = prefs.edit().putInt(KEY_V62_GESTURESWIPEACCELERATION, v).apply()

    // v62.13: Video Color Hue Rotate
    var v62VideoColorHueRotate: Int
        get() = prefs.getInt(KEY_V62_VIDEOCOLORHUEROTATE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_VIDEOCOLORHUEROTATE, v).apply()

    // v62.14: Danmaku Font Size Auto Max
    var v62DanmakuFontSizeAutoMax: Int
        get() = prefs.getInt(KEY_V62_DANMAKUFONTSIZEAUTOMAX, 36)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUFONTSIZEAUTOMAX, v).apply()

    // v62.15: Cast Audio Decode Mode
    var v62CastAudioDecodeMode: Int
        get() = prefs.getInt(KEY_V62_CASTAUDIODECODEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_CASTAUDIODECODEMODE, v).apply()

    // === v63.x ===
    // v63.1: Video Spatial Denoise
    var v63VideoSpatialDenoise: Boolean
        get() = prefs.getBoolean(KEY_V63_VIDEOSPATIALDENOISE, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_VIDEOSPATIALDENOISE, v).apply()

    // v63.2: Danmaku Top Bottom Margin
    var v63DanmakuTopBottomMargin: Int
        get() = prefs.getInt(KEY_V63_DANMAKUTOPBOTTOMMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUTOPBOTTOMMARGIN, v).apply()

    // v63.3: Subtitle Animation Fade In
    var v63SubtitleAnimationFadeIn: Boolean
        get() = prefs.getBoolean(KEY_V63_SUBTITLEANIMATIONFADEIN, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_SUBTITLEANIMATIONFADEIN, v).apply()

    // v63.4: Gesture Long Press Vibration
    var v63GestureLongPressVibration: Boolean
        get() = prefs.getBoolean(KEY_V63_GESTURELONGPRESSVIBRATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_GESTURELONGPRESSVIBRATION, v).apply()

    // v63.5: Video Adaptive Saturation Curve
    var v63VideoAdaptiveSaturationCurve: Int
        get() = prefs.getInt(KEY_V63_VIDEOADAPTIVESATURATIONCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_VIDEOADAPTIVESATURATIONCURVE, v).apply()

    // v63.6: Danmaku Send Queue Size
    var v63DanmakuSendQueueSize: Int
        get() = prefs.getInt(KEY_V63_DANMAKUSENDQUEUESIZE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUSENDQUEUESIZE, v).apply()

    // v63.7: Cast Video Render Mode
    var v63CastVideoRenderMode: Int
        get() = prefs.getInt(KEY_V63_CASTVIDEORENDERMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_CASTVIDEORENDERMODE, v).apply()

    // v63.8: Subtitle BG Border Width
    var v63SubtitleBgBorderWidth: Int
        get() = prefs.getInt(KEY_V63_SUBTITLEBGBORDERWIDTH, 0)
        set(v) = prefs.edit().putInt(KEY_V63_SUBTITLEBGBORDERWIDTH, v).apply()

    // v63.9: Video Adaptive Gamma Curve
    var v63VideoAdaptiveGammaCurve: Int
        get() = prefs.getInt(KEY_V63_VIDEOADAPTIVEGAMMACURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_VIDEOADAPTIVEGAMMACURVE, v).apply()

    // v63.10: Danmaku Filter By Type
    var v63DanmakuFilterByType: Int
        get() = prefs.getInt(KEY_V63_DANMAKUFILTERBYTYPE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUFILTERBYTYPE, v).apply()

    // v63.11: Playlist Auto Merge
    var v63PlaylistAutoMerge: Boolean
        get() = prefs.getBoolean(KEY_V63_PLAYLISTAUTOMERGE, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_PLAYLISTAUTOMERGE, v).apply()

    // v63.12: Gesture Swipe Deceleration Custom
    var v63GestureSwipeDecelerationCustom: Int
        get() = prefs.getInt(KEY_V63_GESTURESWIPEDECELERATIONCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V63_GESTURESWIPEDECELERATIONCUSTOM, v).apply()

    // v63.13: Video Color Invert
    var v63VideoColorInvert: Boolean
        get() = prefs.getBoolean(KEY_V63_VIDEOCOLORINVERT, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_VIDEOCOLORINVERT, v).apply()

    // v63.14: Danmaku History Sort Order
    var v63DanmakuHistorySortOrder: Int
        get() = prefs.getInt(KEY_V63_DANMAKUHISTORYSORTORDER, 0)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUHISTORYSORTORDER, v).apply()

    // v63.15: Cast Audio Render Mode
    var v63CastAudioRenderMode: Int
        get() = prefs.getInt(KEY_V63_CASTAUDIORENDERMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_CASTAUDIORENDERMODE, v).apply()

    // === v64.x ===
    // v64.1: Video Adaptive Edge Preserve
    var v64VideoAdaptiveEdgePreserve: Boolean
        get() = prefs.getBoolean(KEY_V64_VIDEOADAPTIVEEDGEPRESERVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_VIDEOADAPTIVEEDGEPRESERVE, v).apply()

    // v64.2: Danmaku Fixed Position
    var v64DanmakuFixedPosition: Int
        get() = prefs.getInt(KEY_V64_DANMAKUFIXEDPOSITION, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUFIXEDPOSITION, v).apply()

    // v64.3: Subtitle Animation Fade Out
    var v64SubtitleAnimationFadeOut: Boolean
        get() = prefs.getBoolean(KEY_V64_SUBTITLEANIMATIONFADEOUT, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_SUBTITLEANIMATIONFADEOUT, v).apply()

    // v64.4: Gesture Multi Finger Gesture
    var v64GestureMultiFingerGesture: Int
        get() = prefs.getInt(KEY_V64_GESTUREMULTIFINGERGESTURE, 0)
        set(v) = prefs.edit().putInt(KEY_V64_GESTUREMULTIFINGERGESTURE, v).apply()

    // v64.5: Video Color Grayscale
    var v64VideoColorGrayscale: Boolean
        get() = prefs.getBoolean(KEY_V64_VIDEOCOLORGRAYSCALE, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_VIDEOCOLORGRAYSCALE, v).apply()

    // v64.6: Danmaku Send Delay
    var v64DanmakuSendDelay: Int
        get() = prefs.getInt(KEY_V64_DANMAKUSENDDELAY, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUSENDDELAY, v).apply()

    // v64.7: Cast Video Post Process
    var v64CastVideoPostProcess: Boolean
        get() = prefs.getBoolean(KEY_V64_CASTVIDEOPOSTPROCESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_CASTVIDEOPOSTPROCESS, v).apply()

    // v64.8: Subtitle BG Border Color
    var v64SubtitleBgBorderColor: Int
        get() = prefs.getInt(KEY_V64_SUBTITLEBGBORDERCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V64_SUBTITLEBGBORDERCOLOR, v).apply()

    // v64.9: Video Adaptive Detail Curve
    var v64VideoAdaptiveDetailCurve: Int
        get() = prefs.getInt(KEY_V64_VIDEOADAPTIVEDETAILCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V64_VIDEOADAPTIVEDETAILCURVE, v).apply()

    // v64.10: Danmaku Filter By User Level
    var v64DanmakuFilterByUserLevel: Int
        get() = prefs.getInt(KEY_V64_DANMAKUFILTERBYUSERLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUFILTERBYUSERLEVEL, v).apply()

    // v64.11: Playlist Auto Split
    var v64PlaylistAutoSplit: Boolean
        get() = prefs.getBoolean(KEY_V64_PLAYLISTAUTOSPLIT, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_PLAYLISTAUTOSPLIT, v).apply()

    // v64.12: Gesture Swipe Friction
    var v64GestureSwipeFriction: Int
        get() = prefs.getInt(KEY_V64_GESTURESWIPEFRICTION, 50)
        set(v) = prefs.edit().putInt(KEY_V64_GESTURESWIPEFRICTION, v).apply()

    // v64.13: Video Color Sepia Strength
    var v64VideoColorSepiaStrength: Int
        get() = prefs.getInt(KEY_V64_VIDEOCOLORSEPIASTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V64_VIDEOCOLORSEPIASTRENGTH, v).apply()

    // v64.14: Danmaku History Max Items
    var v64DanmakuHistoryMaxItems: Int
        get() = prefs.getInt(KEY_V64_DANMAKUHISTORYMAXITEMS, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUHISTORYMAXITEMS, v).apply()

    // v64.15: Cast Audio Post Process
    var v64CastAudioPostProcess: Boolean
        get() = prefs.getBoolean(KEY_V64_CASTAUDIOPOSTPROCESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_CASTAUDIOPOSTPROCESS, v).apply()

    // === v65.x ===
    // v65.1: Video Adaptive Motion Blur
    var v65VideoAdaptiveMotionBlur: Boolean
        get() = prefs.getBoolean(KEY_V65_VIDEOADAPTIVEMOTIONBLUR, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_VIDEOADAPTIVEMOTIONBLUR, v).apply()

    // v65.2: Danmaku Scroll Direction
    var v65DanmakuScrollDirection: Int
        get() = prefs.getInt(KEY_V65_DANMAKUSCROLLDIRECTION, 0)
        set(v) = prefs.edit().putInt(KEY_V65_DANMAKUSCROLLDIRECTION, v).apply()

    // v65.3: Subtitle Animation Slide
    var v65SubtitleAnimationSlide: Int
        get() = prefs.getInt(KEY_V65_SUBTITLEANIMATIONSLIDE, 0)
        set(v) = prefs.edit().putInt(KEY_V65_SUBTITLEANIMATIONSLIDE, v).apply()

    // v65.4: Gesture Custom Gesture 1
    var v65GestureCustomGesture1: Int
        get() = prefs.getInt(KEY_V65_GESTURECUSTOMGESTURE1, 0)
        set(v) = prefs.edit().putInt(KEY_V65_GESTURECUSTOMGESTURE1, v).apply()

    // v65.5: Video Color Posterize Level
    var v65VideoColorPosterizeLevel: Int
        get() = prefs.getInt(KEY_V65_VIDEOCOLORPOSTERIZELEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V65_VIDEOCOLORPOSTERIZELEVEL, v).apply()

    // v65.6: Danmaku Send Priority Level
    var v65DanmakuSendPriorityLevel: Int
        get() = prefs.getInt(KEY_V65_DANMAKUSENDPRIORITYLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V65_DANMAKUSENDPRIORITYLEVEL, v).apply()

    // v65.7: Cast Video HDR
    var v65CastVideoHDR: Boolean
        get() = prefs.getBoolean(KEY_V65_CASTVIDEOHDR, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_CASTVIDEOHDR, v).apply()

    // v65.8: Subtitle BG Blur Strength
    var v65SubtitleBgBlurStrength: Int
        get() = prefs.getInt(KEY_V65_SUBTITLEBGBLURSTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V65_SUBTITLEBGBLURSTRENGTH, v).apply()

    // v65.9: Video Adaptive Luma Curve
    var v65VideoAdaptiveLumaCurve: Int
        get() = prefs.getInt(KEY_V65_VIDEOADAPTIVELUMACURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V65_VIDEOADAPTIVELUMACURVE, v).apply()

    // v65.10: Danmaku Filter By Badge
    var v65DanmakuFilterByBadge: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKUFILTERBYBADGE, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_DANMAKUFILTERBYBADGE, v).apply()

    // v65.11: Playlist Auto Deduplicate
    var v65PlaylistAutoDeduplicate: Boolean
        get() = prefs.getBoolean(KEY_V65_PLAYLISTAUTODEDUPLICATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_PLAYLISTAUTODEDUPLICATE, v).apply()

    // v65.12: Gesture Swipe Sensitivity Custom
    var v65GestureSwipeSensitivityCustom: Int
        get() = prefs.getInt(KEY_V65_GESTURESWIPESENSITIVITYCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V65_GESTURESWIPESENSITIVITYCUSTOM, v).apply()

    // v65.13: Video Color Solarize Strength
    var v65VideoColorSolarizeStrength: Int
        get() = prefs.getInt(KEY_V65_VIDEOCOLORSOLARIZESTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V65_VIDEOCOLORSOLARIZESTRENGTH, v).apply()

    // v65.14: Danmaku History Auto Export
    var v65DanmakuHistoryAutoExport: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKUHISTORYAUTOEXPORT, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_DANMAKUHISTORYAUTOEXPORT, v).apply()

    // v65.15: Cast Audio HDR
    var v65CastAudioHDR: Boolean
        get() = prefs.getBoolean(KEY_V65_CASTAUDIOHDR, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_CASTAUDIOHDR, v).apply()

    // === v66.x ===
    // v66.1: Video Adaptive Frame Blend
    var v66VideoAdaptiveFrameBlend: Boolean
        get() = prefs.getBoolean(KEY_V66_VIDEOADAPTIVEFRAMEBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_VIDEOADAPTIVEFRAMEBLEND, v).apply()

    // v66.2: Danmaku Top Margin
    var v66DanmakuTopMargin: Int
        get() = prefs.getInt(KEY_V66_DANMAKUTOPMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V66_DANMAKUTOPMARGIN, v).apply()

    // v66.3: Subtitle Animation Bounce
    var v66SubtitleAnimationBounce: Boolean
        get() = prefs.getBoolean(KEY_V66_SUBTITLEANIMATIONBOUNCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_SUBTITLEANIMATIONBOUNCE, v).apply()

    // v66.4: Gesture Custom Gesture 2
    var v66GestureCustomGesture2: Int
        get() = prefs.getInt(KEY_V66_GESTURECUSTOMGESTURE2, 0)
        set(v) = prefs.edit().putInt(KEY_V66_GESTURECUSTOMGESTURE2, v).apply()

    // v66.5: Video Color Vignette
    var v66VideoColorVignette: Int
        get() = prefs.getInt(KEY_V66_VIDEOCOLORVIGNETTE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_VIDEOCOLORVIGNETTE, v).apply()

    // v66.6: Danmaku Send Max Length Per Second
    var v66DanmakuSendMaxLengthPerSecond: Int
        get() = prefs.getInt(KEY_V66_DANMAKUSENDMAXLENGTHPERSECOND, 0)
        set(v) = prefs.edit().putInt(KEY_V66_DANMAKUSENDMAXLENGTHPERSECOND, v).apply()

    // v66.7: Cast Video Dolby Vision
    var v66CastVideoDolbyVision: Boolean
        get() = prefs.getBoolean(KEY_V66_CASTVIDEODOLBYVISION, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_CASTVIDEODOLBYVISION, v).apply()

    // v66.8: Subtitle BG Border Radius
    var v66SubtitleBgBorderRadius: Int
        get() = prefs.getInt(KEY_V66_SUBTITLEBGBORDERRADIUS, 0)
        set(v) = prefs.edit().putInt(KEY_V66_SUBTITLEBGBORDERRADIUS, v).apply()

    // v66.9: Video Adaptive Color Curve
    var v66VideoAdaptiveColorCurve: Int
        get() = prefs.getInt(KEY_V66_VIDEOADAPTIVECOLORCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_VIDEOADAPTIVECOLORCURVE, v).apply()

    // v66.10: Danmaku Filter By Medal
    var v66DanmakuFilterByMedal: Boolean
        get() = prefs.getBoolean(KEY_V66_DANMAKUFILTERBYMEDAL, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_DANMAKUFILTERBYMEDAL, v).apply()

    // v66.11: Playlist Auto Shuffle On Start
    var v66PlaylistAutoShuffleOnStart: Boolean
        get() = prefs.getBoolean(KEY_V66_PLAYLISTAUTOSHUFFLEONSTART, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_PLAYLISTAUTOSHUFFLEONSTART, v).apply()

    // v66.12: Gesture Swipe Momentum
    var v66GestureSwipeMomentum: Int
        get() = prefs.getInt(KEY_V66_GESTURESWIPEMOMENTUM, 50)
        set(v) = prefs.edit().putInt(KEY_V66_GESTURESWIPEMOMENTUM, v).apply()

    // v66.13: Video Color Duotone
    var v66VideoColorDuotone: Int
        get() = prefs.getInt(KEY_V66_VIDEOCOLORDUOTONE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_VIDEOCOLORDUOTONE, v).apply()

    // v66.14: Danmaku History Search Mode
    var v66DanmakuHistorySearchMode: Int
        get() = prefs.getInt(KEY_V66_DANMAKUHISTORYSEARCHMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_DANMAKUHISTORYSEARCHMODE, v).apply()

    // v66.15: Cast Audio Dolby Atmos
    var v66CastAudioDolbyAtmos: Boolean
        get() = prefs.getBoolean(KEY_V66_CASTAUDIODOLBYATMOS, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_CASTAUDIODOLBYATMOS, v).apply()

    // === v67.x ===
    // v67.1: Video Adaptive Temporal Blend
    var v67VideoAdaptiveTemporalBlend: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOADAPTIVETEMPORALBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOADAPTIVETEMPORALBLEND, v).apply()

    // v67.2: Danmaku Bottom Margin
    var v67DanmakuBottomMargin: Int
        get() = prefs.getInt(KEY_V67_DANMAKUBOTTOMMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V67_DANMAKUBOTTOMMARGIN, v).apply()

    // v67.3: Subtitle Animation Zoom
    var v67SubtitleAnimationZoom: Boolean
        get() = prefs.getBoolean(KEY_V67_SUBTITLEANIMATIONZOOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_SUBTITLEANIMATIONZOOM, v).apply()

    // v67.4: Gesture Custom Gesture 3
    var v67GestureCustomGesture3: Int
        get() = prefs.getInt(KEY_V67_GESTURECUSTOMGESTURE3, 0)
        set(v) = prefs.edit().putInt(KEY_V67_GESTURECUSTOMGESTURE3, v).apply()

    // v67.5: Video Color Tilt Shift
    var v67VideoColorTiltShift: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOCOLORTILTSHIFT, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOCOLORTILTSHIFT, v).apply()

    // v67.6: Danmaku Send Rate Per User
    var v67DanmakuSendRatePerUser: Int
        get() = prefs.getInt(KEY_V67_DANMAKUSENDRATEPERUSER, 0)
        set(v) = prefs.edit().putInt(KEY_V67_DANMAKUSENDRATEPERUSER, v).apply()

    // v67.7: Cast Video 3D
    var v67CastVideo3D: Boolean
        get() = prefs.getBoolean(KEY_V67_CASTVIDEO3D, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_CASTVIDEO3D, v).apply()

    // v67.8: Subtitle BG Gradient Direction
    var v67SubtitleBgGradientDirection: Int
        get() = prefs.getInt(KEY_V67_SUBTITLEBGGRADIENTDIRECTION, 0)
        set(v) = prefs.edit().putInt(KEY_V67_SUBTITLEBGGRADIENTDIRECTION, v).apply()

    // v67.9: Video Adaptive Spatial Blend
    var v67VideoAdaptiveSpatialBlend: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOADAPTIVESPATIALBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOADAPTIVESPATIALBLEND, v).apply()

    // v67.10: Danmaku Filter By Level
    var v67DanmakuFilterByLevel: Int
        get() = prefs.getInt(KEY_V67_DANMAKUFILTERBYLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V67_DANMAKUFILTERBYLEVEL, v).apply()

    // v67.11: Playlist Auto Repeat Mode
    var v67PlaylistAutoRepeatMode: Int
        get() = prefs.getInt(KEY_V67_PLAYLISTAUTOREPEATMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V67_PLAYLISTAUTOREPEATMODE, v).apply()

    // v67.12: Gesture Swipe Bounce
    var v67GestureSwipeBounce: Int
        get() = prefs.getInt(KEY_V67_GESTURESWIPEBOUNCE, 50)
        set(v) = prefs.edit().putInt(KEY_V67_GESTURESWIPEBOUNCE, v).apply()

    // v67.13: Video Color Cross Process
    var v67VideoColorCrossProcess: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOCOLORCROSSPROCESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOCOLORCROSSPROCESS, v).apply()

    // v67.14: Danmaku History Export Auto
    var v67DanmakuHistoryExportAuto: Boolean
        get() = prefs.getBoolean(KEY_V67_DANMAKUHISTORYEXPORTAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_DANMAKUHISTORYEXPORTAUTO, v).apply()

    // v67.15: Cast Audio Spatial
    var v67CastAudioSpatial: Boolean
        get() = prefs.getBoolean(KEY_V67_CASTAUDIOSPATIAL, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_CASTAUDIOSPATIAL, v).apply()

    // === v68.x ===
    // v68.1: Video Adaptive Color Balance
    var v68VideoAdaptiveColorBalance: Boolean
        get() = prefs.getBoolean(KEY_V68_VIDEOADAPTIVECOLORBALANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_VIDEOADAPTIVECOLORBALANCE, v).apply()

    // v68.2: Danmaku Left Right Margin
    var v68DanmakuLeftRightMargin: Int
        get() = prefs.getInt(KEY_V68_DANMAKULEFTRIGHTMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V68_DANMAKULEFTRIGHTMARGIN, v).apply()

    // v68.3: Subtitle Animation Rotate
    var v68SubtitleAnimationRotate: Boolean
        get() = prefs.getBoolean(KEY_V68_SUBTITLEANIMATIONROTATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_SUBTITLEANIMATIONROTATE, v).apply()

    // v68.4: Gesture Custom Gesture 4
    var v68GestureCustomGesture4: Int
        get() = prefs.getInt(KEY_V68_GESTURECUSTOMGESTURE4, 0)
        set(v) = prefs.edit().putInt(KEY_V68_GESTURECUSTOMGESTURE4, v).apply()

    // v68.5: Video Color Fisheye
    var v68VideoColorFisheye: Int
        get() = prefs.getInt(KEY_V68_VIDEOCOLORFISHEYE, 0)
        set(v) = prefs.edit().putInt(KEY_V68_VIDEOCOLORFISHEYE, v).apply()

    // v68.6: Danmaku Send Max Length Per Minute
    var v68DanmakuSendMaxLengthPerMinute: Int
        get() = prefs.getInt(KEY_V68_DANMAKUSENDMAXLENGTHPERMINUTE, 0)
        set(v) = prefs.edit().putInt(KEY_V68_DANMAKUSENDMAXLENGTHPERMINUTE, v).apply()

    // v68.7: Cast Video Surround
    var v68CastVideoSurround: Boolean
        get() = prefs.getBoolean(KEY_V68_CASTVIDEOSURROUND, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_CASTVIDEOSURROUND, v).apply()

    // v68.8: Subtitle BG Gradient Color
    var v68SubtitleBgGradientColor: Int
        get() = prefs.getInt(KEY_V68_SUBTITLEBGGRADIENTCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V68_SUBTITLEBGGRADIENTCOLOR, v).apply()

    // v68.9: Video Adaptive Noise Reduce
    var v68VideoAdaptiveNoiseReduce: Boolean
        get() = prefs.getBoolean(KEY_V68_VIDEOADAPTIVENOISEREDUCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_VIDEOADAPTIVENOISEREDUCE, v).apply()

    // v68.10: Danmaku Filter By Title
    var v68DanmakuFilterByTitle: Boolean
        get() = prefs.getBoolean(KEY_V68_DANMAKUFILTERBYTITLE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_DANMAKUFILTERBYTITLE, v).apply()

    // v68.11: Playlist Auto Next On End
    var v68PlaylistAutoNextOnEnd: Boolean
        get() = prefs.getBoolean(KEY_V68_PLAYLISTAUTONEXTONEND, true)
        set(v) = prefs.edit().putBoolean(KEY_V68_PLAYLISTAUTONEXTONEND, v).apply()

    // v68.12: Gesture Swipe Elastic
    var v68GestureSwipeElastic: Int
        get() = prefs.getInt(KEY_V68_GESTURESWIPEELASTIC, 50)
        set(v) = prefs.edit().putInt(KEY_V68_GESTURESWIPEELASTIC, v).apply()

    // v68.13: Video Color Chromatic Aberration
    var v68VideoColorChromaticAberration: Int
        get() = prefs.getInt(KEY_V68_VIDEOCOLORCHROMATICABERRATION, 0)
        set(v) = prefs.edit().putInt(KEY_V68_VIDEOCOLORCHROMATICABERRATION, v).apply()

    // v68.14: Danmaku History Import
    var v68DanmakuHistoryImport: Boolean
        get() = prefs.getBoolean(KEY_V68_DANMAKUHISTORYIMPORT, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_DANMAKUHISTORYIMPORT, v).apply()

    // v68.15: Cast Audio Surround
    var v68CastAudioSurround: Boolean
        get() = prefs.getBoolean(KEY_V68_CASTAUDIOSURROUND, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_CASTAUDIOSURROUND, v).apply()

    // === v69.x ===
    // v69.1: Video Adaptive Detail Enhance
    var v69VideoAdaptiveDetailEnhance: Boolean
        get() = prefs.getBoolean(KEY_V69_VIDEOADAPTIVEDETAILENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_VIDEOADAPTIVEDETAILENHANCE, v).apply()

    // v69.2: Danmaku Line Spacing
    var v69DanmakuLineSpacing: Int
        get() = prefs.getInt(KEY_V69_DANMAKULINESPACING, 100)
        set(v) = prefs.edit().putInt(KEY_V69_DANMAKULINESPACING, v).apply()

    // v69.3: Subtitle Animation Typewriter
    var v69SubtitleAnimationTypewriter: Boolean
        get() = prefs.getBoolean(KEY_V69_SUBTITLEANIMATIONTYPEWRITER, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_SUBTITLEANIMATIONTYPEWRITER, v).apply()

    // v69.4: Gesture Custom Action 5
    var v69GestureCustomAction5: Int
        get() = prefs.getInt(KEY_V69_GESTURECUSTOMACTION5, 0)
        set(v) = prefs.edit().putInt(KEY_V69_GESTURECUSTOMACTION5, v).apply()

    // v69.5: Video Color Barrel Distortion
    var v69VideoColorBarrelDistortion: Int
        get() = prefs.getInt(KEY_V69_VIDEOCOLORBARRELDISTORTION, 0)
        set(v) = prefs.edit().putInt(KEY_V69_VIDEOCOLORBARRELDISTORTION, v).apply()

    // v69.6: Danmaku Send Max Length Total
    var v69DanmakuSendMaxLengthTotal: Int
        get() = prefs.getInt(KEY_V69_DANMAKUSENDMAXLENGTHTOTAL, 0)
        set(v) = prefs.edit().putInt(KEY_V69_DANMAKUSENDMAXLENGTHTOTAL, v).apply()

    // v69.7: Cast Video Multi View
    var v69CastVideoMultiView: Boolean
        get() = prefs.getBoolean(KEY_V69_CASTVIDEOMULTIVIEW, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_CASTVIDEOMULTIVIEW, v).apply()

    // v69.8: Subtitle BG Padding X
    var v69SubtitleBgPaddingX: Int
        get() = prefs.getInt(KEY_V69_SUBTITLEBGPADDINGX, 4)
        set(v) = prefs.edit().putInt(KEY_V69_SUBTITLEBGPADDINGX, v).apply()

    // v69.9: Video Adaptive Chroma Enhance
    var v69VideoAdaptiveChromaEnhance: Boolean
        get() = prefs.getBoolean(KEY_V69_VIDEOADAPTIVECHROMAENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_VIDEOADAPTIVECHROMAENHANCE, v).apply()

    // v69.10: Danmaku Filter By Content
    var v69DanmakuFilterByContent: Boolean
        get() = prefs.getBoolean(KEY_V69_DANMAKUFILTERBYCONTENT, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_DANMAKUFILTERBYCONTENT, v).apply()

    // v69.11: Playlist Auto Resume
    var v69PlaylistAutoResume: Boolean
        get() = prefs.getBoolean(KEY_V69_PLAYLISTAUTORESUME, true)
        set(v) = prefs.edit().putBoolean(KEY_V69_PLAYLISTAUTORESUME, v).apply()

    // v69.12: Gesture Swipe Rubber Band
    var v69GestureSwipeRubberBand: Int
        get() = prefs.getInt(KEY_V69_GESTURESWIPERUBBERBAND, 50)
        set(v) = prefs.edit().putInt(KEY_V69_GESTURESWIPERUBBERBAND, v).apply()

    // v69.13: Video Color Pincushion
    var v69VideoColorPincushion: Int
        get() = prefs.getInt(KEY_V69_VIDEOCOLORPINCUSHION, 0)
        set(v) = prefs.edit().putInt(KEY_V69_VIDEOCOLORPINCUSHION, v).apply()

    // v69.14: Danmaku History Clear
    var v69DanmakuHistoryClear: Boolean
        get() = prefs.getBoolean(KEY_V69_DANMAKUHISTORYCLEAR, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_DANMAKUHISTORYCLEAR, v).apply()

    // v69.15: Cast Audio Multi View
    var v69CastAudioMultiView: Boolean
        get() = prefs.getBoolean(KEY_V69_CASTAUDIOMULTIVIEW, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_CASTAUDIOMULTIVIEW, v).apply()

    // === v70.x ===
    // v70.1: Video Adaptive Luma Enhance
    var v70VideoAdaptiveLumaEnhance: Boolean
        get() = prefs.getBoolean(KEY_V70_VIDEOADAPTIVELUMAENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_VIDEOADAPTIVELUMAENHANCE, v).apply()

    // v70.2: Danmaku Character Spacing
    var v70DanmakuCharacterSpacing: Int
        get() = prefs.getInt(KEY_V70_DANMAKUCHARACTERSPACING, 0)
        set(v) = prefs.edit().putInt(KEY_V70_DANMAKUCHARACTERSPACING, v).apply()

    // v70.3: Subtitle Animation Highlight
    var v70SubtitleAnimationHighlight: Boolean
        get() = prefs.getBoolean(KEY_V70_SUBTITLEANIMATIONHIGHLIGHT, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_SUBTITLEANIMATIONHIGHLIGHT, v).apply()

    // v70.4: Gesture Custom Action 6
    var v70GestureCustomAction6: Int
        get() = prefs.getInt(KEY_V70_GESTURECUSTOMACTION6, 0)
        set(v) = prefs.edit().putInt(KEY_V70_GESTURECUSTOMACTION6, v).apply()

    // v70.5: Video Color Wave Distortion
    var v70VideoColorWaveDistortion: Int
        get() = prefs.getInt(KEY_V70_VIDEOCOLORWAVEDISTORTION, 0)
        set(v) = prefs.edit().putInt(KEY_V70_VIDEOCOLORWAVEDISTORTION, v).apply()

    // v70.6: Danmaku Send Max Length VIP
    var v70DanmakuSendMaxLengthVIP: Int
        get() = prefs.getInt(KEY_V70_DANMAKUSENDMAXLENGTHVIP, 0)
        set(v) = prefs.edit().putInt(KEY_V70_DANMAKUSENDMAXLENGTHVIP, v).apply()

    // v70.7: Cast Video Multi Screen
    var v70CastVideoMultiScreen: Boolean
        get() = prefs.getBoolean(KEY_V70_CASTVIDEOMULTISCREEN, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_CASTVIDEOMULTISCREEN, v).apply()

    // v70.8: Subtitle BG Padding Y
    var v70SubtitleBgPaddingY: Int
        get() = prefs.getInt(KEY_V70_SUBTITLEBGPADDINGY, 2)
        set(v) = prefs.edit().putInt(KEY_V70_SUBTITLEBGPADDINGY, v).apply()

    // v70.9: Video Adaptive Color Enhance Curve
    var v70VideoAdaptiveColorEnhanceCurve: Int
        get() = prefs.getInt(KEY_V70_VIDEOADAPTIVECOLORENHANCECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V70_VIDEOADAPTIVECOLORENHANCECURVE, v).apply()

    // v70.10: Danmaku Filter By Gift
    var v70DanmakuFilterByGift: Boolean
        get() = prefs.getBoolean(KEY_V70_DANMAKUFILTERBYGIFT, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_DANMAKUFILTERBYGIFT, v).apply()

    // v70.11: Playlist Auto Create
    var v70PlaylistAutoCreate: Boolean
        get() = prefs.getBoolean(KEY_V70_PLAYLISTAUTOCREATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_PLAYLISTAUTOCREATE, v).apply()

    // v70.12: Gesture Swipe Spring
    var v70GestureSwipeSpring: Int
        get() = prefs.getInt(KEY_V70_GESTURESWIPESPRING, 50)
        set(v) = prefs.edit().putInt(KEY_V70_GESTURESWIPESPRING, v).apply()

    // v70.13: Video Color Glitch
    var v70VideoColorGlitch: Int
        get() = prefs.getInt(KEY_V70_VIDEOCOLORGLITCH, 0)
        set(v) = prefs.edit().putInt(KEY_V70_VIDEOCOLORGLITCH, v).apply()

    // v70.14: Danmaku History Stats
    var v70DanmakuHistoryStats: Boolean
        get() = prefs.getBoolean(KEY_V70_DANMAKUHISTORYSTATS, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_DANMAKUHISTORYSTATS, v).apply()

    // v70.15: Cast Audio Multi Screen
    var v70CastAudioMultiScreen: Boolean
        get() = prefs.getBoolean(KEY_V70_CASTAUDIOMULTISCREEN, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_CASTAUDIOMULTISCREEN, v).apply()

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
        private const val KEY_V50_VOLUME_AMBIENT_MODE = "v50_volume_ambient_mode"

        // ===== v51.x KEY =====
        // ===== v52.x KEY =====
        // ===== v53.x KEY =====
        // ===== v54.x KEY =====
        // ===== v55.x KEY =====
        



        // ===== v121.x KEY =====
        // ===== v122.x KEY =====
        // ===== v123.x KEY =====
        // ===== v124.x KEY =====
        // ===== v125.x KEY =====
        // ===== v126.x KEY =====
        // ===== v127.x KEY =====
        // ===== v128.x KEY =====
        // ===== v129.x KEY =====
        // ===== v130.x KEY =====
        // ===== v131.x KEY =====
        // ===== v132.x KEY =====
        // ===== v133.x KEY =====
        // ===== v134.x KEY =====
        // ===== v135.x KEY =====
        // ===== v136.x KEY =====
        // ===== v137.x KEY =====
        // ===== v138.x KEY =====
        // ===== v139.x KEY =====
        // ===== v140.x KEY =====
        // ===== v141.x KEY =====
        // ===== v142.x KEY =====
        // ===== v143.x KEY =====
        // ===== v144.x KEY =====
        // ===== v145.x KEY =====
        // ===== v146.x KEY =====
        // ===== v147.x KEY =====
        // ===== v148.x KEY =====
        // ===== v149.x KEY =====
        // ===== v150.x KEY =====
                // ===== v101.x KEY =====
        // ===== v102.x KEY =====
        // ===== v103.x KEY =====
        // ===== v104.x KEY =====
        // ===== v105.x KEY =====
        // ===== v106.x KEY =====
        // ===== v107.x KEY =====
        // ===== v108.x KEY =====
        // ===== v109.x KEY =====
        // ===== v110.x KEY =====
        // ===== v111.x KEY =====
        // ===== v112.x KEY =====
        // ===== v113.x KEY =====
        // ===== v114.x KEY =====
        // ===== v115.x KEY =====
        // ===== v116.x KEY =====
        // ===== v117.x KEY =====
        // ===== v118.x KEY =====
        // ===== v119.x KEY =====
        // ===== v120.x KEY =====
                // ===== v91.x KEY =====
        // ===== v92.x KEY =====
        // ===== v93.x KEY =====
        // ===== v94.x KEY =====
        // ===== v95.x KEY =====
        // ===== v96.x KEY =====
        // ===== v97.x KEY =====
        // ===== v98.x KEY =====
        // ===== v99.x KEY =====
        // ===== v100.x KEY =====
                // ===== v71.x KEY =====
        // ===== v72.x KEY =====
        // ===== v73.x KEY =====
        // ===== v74.x KEY =====
        // ===== v75.x KEY =====
        // ===== v76.x KEY =====
        // ===== v77.x KEY =====
        // ===== v78.x KEY =====
        // ===== v79.x KEY =====
        // ===== v80.x KEY =====
        // ===== v81.x KEY =====
        // ===== v82.x KEY =====
        // ===== v83.x KEY =====
        // ===== v84.x KEY =====
        // ===== v85.x KEY =====
        // ===== v86.x KEY =====
        // ===== v87.x KEY =====
        // ===== v88.x KEY =====
        // ===== v89.x KEY =====
        // ===== v90.x KEY =====
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
        // v31b-v40b New Unique Features KEY constants
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
        const val KEY_V37_DANMAKUSHADOWCOLORCUSTOM = "v37DanmakuShadowColorCustom"
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


        // v61-v70 New Unique Features KEY constants
        const val KEY_V61_VIDEOEDGEENHANCESTRENGTH = "v61VideoEdgeEnhanceStrength"
        const val KEY_V61_DANMAKUCOLLISIONDETECTION = "v61DanmakuCollisionDetection"
        const val KEY_V61_SUBTITLEPOSITIONOFFSETX = "v61SubtitlePositionOffsetX"
        const val KEY_V61_GESTUREFLINGVELOCITY = "v61GestureFlingVelocity"
        const val KEY_V61_VIDEOMOTIONCOMPENSATION = "v61VideoMotionCompensation"
        const val KEY_V61_DANMAKUANIMATIONTYPE = "v61DanmakuAnimationType"
        const val KEY_V61_CASTVIDEOBUFFERMS = "v61CastVideoBufferMs"
        const val KEY_V61_SUBTITLEFONTSIZEMIN = "v61SubtitleFontSizeMin"
        const val KEY_V61_VIDEOADAPTIVESHARPNESS = "v61VideoAdaptiveSharpness"
        const val KEY_V61_DANMAKUFILTERBYLENGTH = "v61DanmakuFilterByLength"
        const val KEY_V61_PLAYLISTSMARTFILTER = "v61PlaylistSmartFilter"
        const val KEY_V61_GESTURESWIPECURVE = "v61GestureSwipeCurve"
        const val KEY_V61_VIDEOCOLORBALANCERGB = "v61VideoColorBalanceRGB"
        const val KEY_V61_DANMAKUFONTSIZEAUTOMIN = "v61DanmakuFontSizeAutoMin"
        const val KEY_V61_CASTAUDIOBUFFERMS = "v61CastAudioBufferMs"
        const val KEY_V62_VIDEOTEMPORALDENOISE = "v62VideoTemporalDenoise"
        const val KEY_V62_DANMAKUSCROLLSPEEDCUSTOM = "v62DanmakuScrollSpeedCustom"
        const val KEY_V62_SUBTITLEPOSITIONOFFSETY = "v62SubtitlePositionOffsetY"
        const val KEY_V62_GESTURETAPFEEDBACK = "v62GestureTapFeedback"
        const val KEY_V62_VIDEOADAPTIVENOISEGATE = "v62VideoAdaptiveNoiseGate"
        const val KEY_V62_DANMAKUMERGEDISTANCECUSTOM = "v62DanmakuMergeDistanceCustom"
        const val KEY_V62_CASTVIDEODECODEMODE = "v62CastVideoDecodeMode"
        const val KEY_V62_SUBTITLEFONTSIZEMAX = "v62SubtitleFontSizeMax"
        const val KEY_V62_VIDEOADAPTIVECONTRASTCURVE = "v62VideoAdaptiveContrastCurve"
        const val KEY_V62_DANMAKUFILTERBYSPEED = "v62DanmakuFilterBySpeed"
        const val KEY_V62_PLAYLISTAUTOGROUP = "v62PlaylistAutoGroup"
        const val KEY_V62_GESTURESWIPEACCELERATION = "v62GestureSwipeAcceleration"
        const val KEY_V62_VIDEOCOLORHUEROTATE = "v62VideoColorHueRotate"
        const val KEY_V62_DANMAKUFONTSIZEAUTOMAX = "v62DanmakuFontSizeAutoMax"
        const val KEY_V62_CASTAUDIODECODEMODE = "v62CastAudioDecodeMode"
        const val KEY_V63_VIDEOSPATIALDENOISE = "v63VideoSpatialDenoise"
        const val KEY_V63_DANMAKUTOPBOTTOMMARGIN = "v63DanmakuTopBottomMargin"
        const val KEY_V63_SUBTITLEANIMATIONFADEIN = "v63SubtitleAnimationFadeIn"
        const val KEY_V63_GESTURELONGPRESSVIBRATION = "v63GestureLongPressVibration"
        const val KEY_V63_VIDEOADAPTIVESATURATIONCURVE = "v63VideoAdaptiveSaturationCurve"
        const val KEY_V63_DANMAKUSENDQUEUESIZE = "v63DanmakuSendQueueSize"
        const val KEY_V63_CASTVIDEORENDERMODE = "v63CastVideoRenderMode"
        const val KEY_V63_SUBTITLEBGBORDERWIDTH = "v63SubtitleBgBorderWidth"
        const val KEY_V63_VIDEOADAPTIVEGAMMACURVE = "v63VideoAdaptiveGammaCurve"
        const val KEY_V63_DANMAKUFILTERBYTYPE = "v63DanmakuFilterByType"
        const val KEY_V63_PLAYLISTAUTOMERGE = "v63PlaylistAutoMerge"
        const val KEY_V63_GESTURESWIPEDECELERATIONCUSTOM = "v63GestureSwipeDecelerationCustom"
        const val KEY_V63_VIDEOCOLORINVERT = "v63VideoColorInvert"
        const val KEY_V63_DANMAKUHISTORYSORTORDER = "v63DanmakuHistorySortOrder"
        const val KEY_V63_CASTAUDIORENDERMODE = "v63CastAudioRenderMode"
        const val KEY_V64_VIDEOADAPTIVEEDGEPRESERVE = "v64VideoAdaptiveEdgePreserve"
        const val KEY_V64_DANMAKUFIXEDPOSITION = "v64DanmakuFixedPosition"
        const val KEY_V64_SUBTITLEANIMATIONFADEOUT = "v64SubtitleAnimationFadeOut"
        const val KEY_V64_GESTUREMULTIFINGERGESTURE = "v64GestureMultiFingerGesture"
        const val KEY_V64_VIDEOCOLORGRAYSCALE = "v64VideoColorGrayscale"
        const val KEY_V64_DANMAKUSENDDELAY = "v64DanmakuSendDelay"
        const val KEY_V64_CASTVIDEOPOSTPROCESS = "v64CastVideoPostProcess"
        const val KEY_V64_SUBTITLEBGBORDERCOLOR = "v64SubtitleBgBorderColor"
        const val KEY_V64_VIDEOADAPTIVEDETAILCURVE = "v64VideoAdaptiveDetailCurve"
        const val KEY_V64_DANMAKUFILTERBYUSERLEVEL = "v64DanmakuFilterByUserLevel"
        const val KEY_V64_PLAYLISTAUTOSPLIT = "v64PlaylistAutoSplit"
        const val KEY_V64_GESTURESWIPEFRICTION = "v64GestureSwipeFriction"
        const val KEY_V64_VIDEOCOLORSEPIASTRENGTH = "v64VideoColorSepiaStrength"
        const val KEY_V64_DANMAKUHISTORYMAXITEMS = "v64DanmakuHistoryMaxItems"
        const val KEY_V64_CASTAUDIOPOSTPROCESS = "v64CastAudioPostProcess"
        const val KEY_V65_VIDEOADAPTIVEMOTIONBLUR = "v65VideoAdaptiveMotionBlur"
        const val KEY_V65_DANMAKUSCROLLDIRECTION = "v65DanmakuScrollDirection"
        const val KEY_V65_SUBTITLEANIMATIONSLIDE = "v65SubtitleAnimationSlide"
        const val KEY_V65_GESTURECUSTOMGESTURE1 = "v65GestureCustomGesture1"
        const val KEY_V65_VIDEOCOLORPOSTERIZELEVEL = "v65VideoColorPosterizeLevel"
        const val KEY_V65_DANMAKUSENDPRIORITYLEVEL = "v65DanmakuSendPriorityLevel"
        const val KEY_V65_CASTVIDEOHDR = "v65CastVideoHDR"
        const val KEY_V65_SUBTITLEBGBLURSTRENGTH = "v65SubtitleBgBlurStrength"
        const val KEY_V65_VIDEOADAPTIVELUMACURVE = "v65VideoAdaptiveLumaCurve"
        const val KEY_V65_DANMAKUFILTERBYBADGE = "v65DanmakuFilterByBadge"
        const val KEY_V65_PLAYLISTAUTODEDUPLICATE = "v65PlaylistAutoDeduplicate"
        const val KEY_V65_GESTURESWIPESENSITIVITYCUSTOM = "v65GestureSwipeSensitivityCustom"
        const val KEY_V65_VIDEOCOLORSOLARIZESTRENGTH = "v65VideoColorSolarizeStrength"
        const val KEY_V65_DANMAKUHISTORYAUTOEXPORT = "v65DanmakuHistoryAutoExport"
        const val KEY_V65_CASTAUDIOHDR = "v65CastAudioHDR"
        const val KEY_V66_VIDEOADAPTIVEFRAMEBLEND = "v66VideoAdaptiveFrameBlend"
        const val KEY_V66_DANMAKUTOPMARGIN = "v66DanmakuTopMargin"
        const val KEY_V66_SUBTITLEANIMATIONBOUNCE = "v66SubtitleAnimationBounce"
        const val KEY_V66_GESTURECUSTOMGESTURE2 = "v66GestureCustomGesture2"
        const val KEY_V66_VIDEOCOLORVIGNETTE = "v66VideoColorVignette"
        const val KEY_V66_DANMAKUSENDMAXLENGTHPERSECOND = "v66DanmakuSendMaxLengthPerSecond"
        const val KEY_V66_CASTVIDEODOLBYVISION = "v66CastVideoDolbyVision"
        const val KEY_V66_SUBTITLEBGBORDERRADIUS = "v66SubtitleBgBorderRadius"
        const val KEY_V66_VIDEOADAPTIVECOLORCURVE = "v66VideoAdaptiveColorCurve"
        const val KEY_V66_DANMAKUFILTERBYMEDAL = "v66DanmakuFilterByMedal"
        const val KEY_V66_PLAYLISTAUTOSHUFFLEONSTART = "v66PlaylistAutoShuffleOnStart"
        const val KEY_V66_GESTURESWIPEMOMENTUM = "v66GestureSwipeMomentum"
        const val KEY_V66_VIDEOCOLORDUOTONE = "v66VideoColorDuotone"
        const val KEY_V66_DANMAKUHISTORYSEARCHMODE = "v66DanmakuHistorySearchMode"
        const val KEY_V66_CASTAUDIODOLBYATMOS = "v66CastAudioDolbyAtmos"
        const val KEY_V67_VIDEOADAPTIVETEMPORALBLEND = "v67VideoAdaptiveTemporalBlend"
        const val KEY_V67_DANMAKUBOTTOMMARGIN = "v67DanmakuBottomMargin"
        const val KEY_V67_SUBTITLEANIMATIONZOOM = "v67SubtitleAnimationZoom"
        const val KEY_V67_GESTURECUSTOMGESTURE3 = "v67GestureCustomGesture3"
        const val KEY_V67_VIDEOCOLORTILTSHIFT = "v67VideoColorTiltShift"
        const val KEY_V67_DANMAKUSENDRATEPERUSER = "v67DanmakuSendRatePerUser"
        const val KEY_V67_CASTVIDEO3D = "v67CastVideo3D"
        const val KEY_V67_SUBTITLEBGGRADIENTDIRECTION = "v67SubtitleBgGradientDirection"
        const val KEY_V67_VIDEOADAPTIVESPATIALBLEND = "v67VideoAdaptiveSpatialBlend"
        const val KEY_V67_DANMAKUFILTERBYLEVEL = "v67DanmakuFilterByLevel"
        const val KEY_V67_PLAYLISTAUTOREPEATMODE = "v67PlaylistAutoRepeatMode"
        const val KEY_V67_GESTURESWIPEBOUNCE = "v67GestureSwipeBounce"
        const val KEY_V67_VIDEOCOLORCROSSPROCESS = "v67VideoColorCrossProcess"
        const val KEY_V67_DANMAKUHISTORYEXPORTAUTO = "v67DanmakuHistoryExportAuto"
        const val KEY_V67_CASTAUDIOSPATIAL = "v67CastAudioSpatial"
        const val KEY_V68_VIDEOADAPTIVECOLORBALANCE = "v68VideoAdaptiveColorBalance"
        const val KEY_V68_DANMAKULEFTRIGHTMARGIN = "v68DanmakuLeftRightMargin"
        const val KEY_V68_SUBTITLEANIMATIONROTATE = "v68SubtitleAnimationRotate"
        const val KEY_V68_GESTURECUSTOMGESTURE4 = "v68GestureCustomGesture4"
        const val KEY_V68_VIDEOCOLORFISHEYE = "v68VideoColorFisheye"
        const val KEY_V68_DANMAKUSENDMAXLENGTHPERMINUTE = "v68DanmakuSendMaxLengthPerMinute"
        const val KEY_V68_CASTVIDEOSURROUND = "v68CastVideoSurround"
        const val KEY_V68_SUBTITLEBGGRADIENTCOLOR = "v68SubtitleBgGradientColor"
        const val KEY_V68_VIDEOADAPTIVENOISEREDUCE = "v68VideoAdaptiveNoiseReduce"
        const val KEY_V68_DANMAKUFILTERBYTITLE = "v68DanmakuFilterByTitle"
        const val KEY_V68_PLAYLISTAUTONEXTONEND = "v68PlaylistAutoNextOnEnd"
        const val KEY_V68_GESTURESWIPEELASTIC = "v68GestureSwipeElastic"
        const val KEY_V68_VIDEOCOLORCHROMATICABERRATION = "v68VideoColorChromaticAberration"
        const val KEY_V68_DANMAKUHISTORYIMPORT = "v68DanmakuHistoryImport"
        const val KEY_V68_CASTAUDIOSURROUND = "v68CastAudioSurround"
        const val KEY_V69_VIDEOADAPTIVEDETAILENHANCE = "v69VideoAdaptiveDetailEnhance"
        const val KEY_V69_DANMAKULINESPACING = "v69DanmakuLineSpacing"
        const val KEY_V69_SUBTITLEANIMATIONTYPEWRITER = "v69SubtitleAnimationTypewriter"
        const val KEY_V69_GESTURECUSTOMACTION5 = "v69GestureCustomAction5"
        const val KEY_V69_VIDEOCOLORBARRELDISTORTION = "v69VideoColorBarrelDistortion"
        const val KEY_V69_DANMAKUSENDMAXLENGTHTOTAL = "v69DanmakuSendMaxLengthTotal"
        const val KEY_V69_CASTVIDEOMULTIVIEW = "v69CastVideoMultiView"
        const val KEY_V69_SUBTITLEBGPADDINGX = "v69SubtitleBgPaddingX"
        const val KEY_V69_VIDEOADAPTIVECHROMAENHANCE = "v69VideoAdaptiveChromaEnhance"
        const val KEY_V69_DANMAKUFILTERBYCONTENT = "v69DanmakuFilterByContent"
        const val KEY_V69_PLAYLISTAUTORESUME = "v69PlaylistAutoResume"
        const val KEY_V69_GESTURESWIPERUBBERBAND = "v69GestureSwipeRubberBand"
        const val KEY_V69_VIDEOCOLORPINCUSHION = "v69VideoColorPincushion"
        const val KEY_V69_DANMAKUHISTORYCLEAR = "v69DanmakuHistoryClear"
        const val KEY_V69_CASTAUDIOMULTIVIEW = "v69CastAudioMultiView"
        const val KEY_V70_VIDEOADAPTIVELUMAENHANCE = "v70VideoAdaptiveLumaEnhance"
        const val KEY_V70_DANMAKUCHARACTERSPACING = "v70DanmakuCharacterSpacing"
        const val KEY_V70_SUBTITLEANIMATIONHIGHLIGHT = "v70SubtitleAnimationHighlight"
        const val KEY_V70_GESTURECUSTOMACTION6 = "v70GestureCustomAction6"
        const val KEY_V70_VIDEOCOLORWAVEDISTORTION = "v70VideoColorWaveDistortion"
        const val KEY_V70_DANMAKUSENDMAXLENGTHVIP = "v70DanmakuSendMaxLengthVIP"
        const val KEY_V70_CASTVIDEOMULTISCREEN = "v70CastVideoMultiScreen"
        const val KEY_V70_SUBTITLEBGPADDINGY = "v70SubtitleBgPaddingY"
        const val KEY_V70_VIDEOADAPTIVECOLORENHANCECURVE = "v70VideoAdaptiveColorEnhanceCurve"
        const val KEY_V70_DANMAKUFILTERBYGIFT = "v70DanmakuFilterByGift"
        const val KEY_V70_PLAYLISTAUTOCREATE = "v70PlaylistAutoCreate"
        const val KEY_V70_GESTURESWIPESPRING = "v70GestureSwipeSpring"
        const val KEY_V70_VIDEOCOLORGLITCH = "v70VideoColorGlitch"
        const val KEY_V70_DANMAKUHISTORYSTATS = "v70DanmakuHistoryStats"
        const val KEY_V70_CASTAUDIOMULTISCREEN = "v70CastAudioMultiScreen"
    }
