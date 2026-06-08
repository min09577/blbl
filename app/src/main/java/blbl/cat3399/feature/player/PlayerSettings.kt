package blbl.cat3399.feature.player

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
// v6.10: 定时关闭/睡眠定时器

internal var sleepTimerJob: kotlinx.coroutines.Job? = null

internal var sleepTimerEndTimeMs: Long = 0L


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
// v23.3: 视频画面色彩温度（已存在同名函数，使用v23前缀）

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
// v23.5: 播放器手势灵敏度（已存在同名函数，使用v23前缀）

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
// v23.13: 播放器截图质量（已存在同名函数，使用v23前缀）

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
// ==================== v24.x 新功能 ====================

// v24.1: 视频播放列表循环模式（已存在同名函数，使用v24前缀）

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
// v24.10: 播放器进度条样式（已存在同名函数，使用v24前缀）

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
// v24.12: 弹幕字体描边透明度（已存在同名函数，使用v24前缀）

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
// v24.15: 弹幕显示刷新率（已存在同名函数，使用v24前缀）

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
// v26.3: 视频画面对比度曲线（已存在同名函数，使用v26前缀）

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
// v26.6: 视频缓存预加载大小（已存在同名函数，使用v26前缀）

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
// v26.8: 视频画面亮度曲线（已存在同名函数，使用v26前缀）

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
// v26.14: 视频画面饱和度曲线（已存在同名函数，使用v26前缀）

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
// v27.8: 视频画面色调曲线（已存在同名函数，使用v27前缀）

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
// v27.13: 播放器手势双击功能（已存在同名函数，使用v27前缀）

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
// v27.15: 弹幕显示字体间距（已存在同名函数，使用v27前缀）

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
// v28.3: 视频画面色彩饱和度

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
// v28.8: 视频画面色彩对比度

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
// v28.10: 播放器进度条圆角

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
// v28.13: 播放器手势滑动灵敏度

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
// v29.3: 视频画面色彩色调

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
// v29.7: 弹幕显示位置偏移（已存在同名函数，使用v29前缀）

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
// v29.13: 播放器手势长按功能

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
// v30.3: 视频画面色彩锐化

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
// v31.2: 弹幕字体背景渐变


