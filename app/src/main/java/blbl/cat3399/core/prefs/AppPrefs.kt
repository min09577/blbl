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
     * Derive a stable UUID from ANDROID_ID.
     */
    private fun deriveDeviceUuid(): String {
        return try {
            val androidId = Settings.Secure.getString(appContext.contentResolver, Settings.Secure.ANDROID_ID)
            if (!androidId.isNullOrBlank() && androidId != "9774d56d682e549c") {
                UUID.nameUUIDFromBytes(androidId.toByteArray()).toString()
            } else {
                UUID.randomUUID().toString()
            }
        } catch (_: Exception) {
            UUID.randomUUID().toString()
        }
    }

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
        private const val KEY_DEFAULT_BRIGHTNESS = "default_brightness"
        private const val KEY_SCREENSHOT_WATERMARK_MODE = "screenshot_watermark_mode"
        // v12.22: 截图水印位置
        private const val KEY_SCREENSHOT_WATERMARK_POSITION = "screenshot_watermark_position"
        // v12.23: 弹幕描边颜色
        private const val KEY_DANMAKU_STROKE_COLOR = "danmaku_stroke_color"
        // v12.25: 视频质量指示器
        // v12.26: 视频色彩调节
        // v12.27: 视频画面裁剪
        // v12.28: 视频画面锐化/模糊
        // v12.29: 视频画面色温调节
        // v12.30: 视频画面滤镜预设
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
        // v17.11: 自动清理缓存
        private const val KEY_AUTO_CLEAN_CACHE = "auto_clean_cache"
        // v17.12: 弹幕预览模式
        private const val KEY_DANMAKU_PREVIEW_MODE = "danmaku_preview_mode"
        // v17.13: 记住弹幕位置
        private const val KEY_REMEMBER_DANMAKU_POSITION = "remember_danmaku_position"
        // v17.14: 视频HDR模式
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
        // v22.2: 弹幕颜色过滤
        // v22.3: 视频画面锐化强度
        // v22.4: 弹幕描边颜色渐变
        // v22.5: 手势轨迹显示
        // v22.6: 视频缓存大小限制
        // v22.7: 弹幕发送字数统计
        // v22.8: 视频画面降噪
        // v22.9: 弹幕透明度动画曲线
        // v22.10: 播放器快捷面板自定义
        // v22.11: 视频投射分辨率限制
        // v22.12: 弹幕字体大小自适应
        // v22.13: 播放器截图格式选择
        // v22.14: 视频色彩饱和度调节
        // v22.15: 弹幕时间轴标记
        // ==================== v23.x 新功能 ====================
        // v23.1: 视频播放速度预设自定义
        // v23.2: 弹幕字体阴影颜色
        // v23.3: 视频画面色彩温度
        // v23.4: 弹幕发送震动强度
        // v23.5: 播放器手势灵敏度
        // v23.6: 视频缓存预加载大小
        // v23.7: 弹幕显示区域透明度
        // v23.8: 视频画面伽马调节
        // v23.9: 弹幕发送确认震动
        // v23.10: 播放器快捷键映射
        // v23.11: 视频投射缓冲大小
        // v23.12: 弹幕字体间距调节
        // v23.13: 播放器截图质量
        // v23.14: 视频画面色调调节
        // v23.15: 弹幕时间轴缩放速度
        // ==================== v24.x 新功能 ====================
        // v24.1: 视频播放列表循环模式
        // v24.2: 弹幕字体描边粗细
        // v24.3: 视频画面亮度曲线
        // v24.4: 弹幕发送延迟调节
        // v24.5: 播放器音量步进
        // v24.6: 视频缓存清理间隔
        // v24.7: 弹幕显示位置偏移
        // v24.8: 视频画面对比度曲线
        // v24.9: 弹幕发送历史记录数
        // v24.10: 播放器进度条样式
        // v24.11: 视频投射画面质量
        // v24.12: 弹幕字体描边透明度
        // v24.13: 播放器手势双击功能
        // v24.14: 视频画面色调曲线
        // v24.15: 弹幕显示刷新率
        // ==================== v25.x 新功能 ====================
        // v25.1: 视频播放列表随机播放
        // v25.2: 弹幕字体背景颜色
        // v25.3: 视频画面饱和度曲线
        // v25.4: 弹幕发送确认对话框
        // v25.5: 播放器音量记忆
        // v25.6: 视频缓存预加载策略
        // v25.7: 弹幕显示时间长度
        // v25.8: 视频画面锐化曲线
        // v25.9: 弹幕发送历史记录
        // v25.10: 播放器进度条颜色
        // v25.11: 视频投射音频质量
        // v25.12: 弹幕字体背景透明度
        // v25.13: 播放器手势长按功能
        // v25.14: 视频画面降噪曲线
        // v25.15: 弹幕显示字体大小
        // ==================== v26.x 新功能 ====================
        // v26.1: 视频播放列表自动播放
        // v26.2: 弹幕字体边框颜色
        // v26.3: 视频画面对比度曲线
        // v26.4: 弹幕发送确认震动
        // v26.5: 播放器音量均衡
        // v26.6: 视频缓存预加载大小
        // v26.7: 弹幕显示透明度
        // v26.8: 视频画面亮度曲线
        // v26.9: 弹幕发送历史记录数
        // v26.10: 播放器进度条透明度
        // v26.11: 视频投射缓冲策略
        // v26.12: 弹幕字体边框透明度
        // v26.13: 播放器手势滑动功能
        // v26.14: 视频画面饱和度曲线
        // v26.15: 弹幕显示字体样式
        // ==================== v27.x 新功能 ====================
        // v27.1: 视频播放列表自动下一个
        // v27.2: 弹幕字体阴影透明度
        // v27.3: 视频画面色彩平衡
        // v27.4: 弹幕发送确认对话框
        // v27.5: 播放器音量限制
        // v27.6: 视频缓存清理策略
        // v27.7: 弹幕显示位置对齐
        // v27.8: 视频画面色调曲线
        // v27.9: 弹幕发送历史记录大小
        // v27.10: 播放器进度条高度
        // v27.11: 视频投射画面延迟
        // v27.12: 弹幕字体阴影大小
        // v27.13: 播放器手势双击功能
        // v27.14: 视频画面降噪强度
        // v27.15: 弹幕显示字体间距
        // v28.1: 视频播放列表自动跳过
        // v28.2: 弹幕字体背景圆角
        // v28.3: 视频画面色彩饱和度
        // v28.4: 弹幕发送确认震动强度
        // v28.5: 播放器音量淡入淡出
        // v28.6: 视频缓存预加载间隔
        // v28.7: 弹幕显示位置边距
        // v28.8: 视频画面色彩对比度
        // v28.9: 弹幕发送历史记录清理
        // v28.10: 播放器进度条圆角
        // v28.11: 视频投射画面缓冲
        // v28.12: 弹幕字体背景边距
        // v28.13: 播放器手势滑动灵敏度
        // v28.14: 视频画面色彩亮度
        // v28.15: 弹幕显示字体阴影
        // v29.1: 视频播放列表自动排序
        // v29.2: 弹幕字体背景颜色
        // v29.3: 视频画面色彩色调
        // v29.4: 弹幕发送确认对话框样式
        // v29.5: 播放器音量限制模式
        // v29.6: 视频缓存清理阈值
        // v29.7: 弹幕显示位置偏移
        // v29.8: 视频画面色彩色温
        // v29.9: 弹幕发送历史记录导出
        // v29.10: 播放器进度条样式
        // v29.11: 视频投射画面质量
        // v29.12: 弹幕字体背景透明度
        // v29.13: 播放器手势长按功能
        // v29.14: 视频画面色彩伽马
        // v29.15: 弹幕显示字体描边
        // v30.1: 视频播放列表自动循环
        // v30.2: 弹幕字体背景边框
        // v30.3: 视频画面色彩锐化
        // v30.4: 弹幕发送确认震动模式
        // v30.5: 播放器音量限制阈值
        // v30.6: 视频缓存清理模式
        // v30.7: 弹幕显示位置对齐方式
        // v30.8: 视频画面色彩降噪
        // v30.9: 弹幕发送历史记录导入
        // v30.10: 播放器进度条颜色
        // v30.11: 视频投射画面延迟
        // v30.12: 弹幕字体背景阴影
        // v30.13: 播放器手势滑动功能
        // v30.14: 视频画面色彩模糊
        // v30.15: 弹幕显示字体发光
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
        // ===== v42.x KEY =====
        // ===== v43.x KEY =====
        // ===== v44.x KEY =====
        // ===== v45.x KEY =====
        // ===== v46.x KEY =====
        // ===== v47.x KEY =====
        // ===== v48.x KEY =====
        // ===== v49.x KEY =====
        // ===== v50.x KEY =====

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
        // v12.15: 视频画面镜像
        // v12.16: 画面比例持久化
        private const val KEY_PLAYER_ASPECT_RATIO = "player_aspect_ratio"
        // v12.21: 播放时长提醒
        private const val KEY_PLAYBACK_TIME_REMINDER = "playback_time_reminder"
        // v10.2: 视频书签

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


        // v51-v60 New Unique Features KEY constants
    
        // v61-v70 New Unique Features KEY constants

        // ==================== v71-v80 New Unique Features ====================


        // ==================== v81-v90 New Unique Features ====================

    }
}
