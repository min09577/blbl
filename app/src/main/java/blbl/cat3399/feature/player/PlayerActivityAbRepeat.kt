package blbl.cat3399.feature.player

import blbl.cat3399.core.ui.AppToast
import java.util.Locale

/**
 * v7.2: AB循环播放
 * 设置A点和B点，循环播放指定片段
 */
private var abRepeatPointAMs: Long = -1L
private var abRepeatPointBMs: Long = -1L

/** 是否处于AB循环状态 */
internal fun PlayerActivity.isAbRepeatActive(): Boolean {
    return abRepeatPointAMs >= 0 && abRepeatPointBMs > abRepeatPointAMs
}

/** 获取当前AB循环状态文本 */
internal fun PlayerActivity.abRepeatStatusText(): String {
    return when {
        abRepeatPointAMs < 0 -> "关闭"
        abRepeatPointBMs < 0 -> "A: ${formatHmsAb(abRepeatPointAMs)} → 等待B点"
        else -> "A: ${formatHmsAb(abRepeatPointAMs)} → B: ${formatHmsAb(abRepeatPointBMs)}"
    }
}

/** 设置/清除AB循环 */
internal fun PlayerActivity.toggleAbRepeat() {
    val exo = player ?: return
    val pos = exo.currentPosition.coerceAtLeast(0L)
    when {
        abRepeatPointAMs < 0 -> {
            // 未设置 → 设置A点
            abRepeatPointAMs = pos
            abRepeatPointBMs = -1L
            AppToast.show(this, "A点: ${formatHmsAb(pos)}，再按一次设B点")
        }
        abRepeatPointBMs < 0 -> {
            // 已有A点 → 设置B点
            if (pos <= abRepeatPointAMs) {
                AppToast.show(this, "B点必须在A点之后")
                return
            }
            abRepeatPointBMs = pos
            AppToast.show(this, "AB循环: ${formatHmsAb(abRepeatPointAMs)} → ${formatHmsAb(abRepeatPointBMs)}")
        }
        else -> {
            // 已有AB → 清除
            clearAbRepeat()
            AppToast.show(this, "AB循环已关闭")
        }
    }
}

internal fun clearAbRepeat() {
    abRepeatPointAMs = -1L
    abRepeatPointBMs = -1L
}

/** 格式化时间为 HH:MM:SS 或 MM:SS - 使用已有formatHms */
private fun formatHmsAb(ms: Long): String {
    val totalSec = ms / 1000
    val h = totalSec / 3600
    val m = (totalSec % 3600) / 60
    val s = totalSec % 60
    return if (h > 0) {
        String.format(Locale.US, "%d:%02d:%02d", h, m, s)
    } else {
        String.format(Locale.US, "%02d:%02d", m, s)
    }
}

/** 在 updateProgressUi 中调用，检测是否需要跳回A点 */
internal fun PlayerActivity.checkAbRepeat(posMs: Long) {
    if (!isAbRepeatActive()) return
    if (posMs >= abRepeatPointBMs) {
        player?.seekTo(abRepeatPointAMs)
    }
}
