package blbl.cat3399.feature.player

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v12.30: 视频画面滤镜预设
 * 提供多种预设滤镜效果
 */

enum class VideoFilterPreset(
    val label: String,
    val matrix: FloatArray,
) {
    NONE(
        "无滤镜",
        floatArrayOf(
            1f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    VINTAGE(
        "复古",
        floatArrayOf(
            0.6f,
            0.3f,
            0.1f,
            0f,
            20f,
            0.2f,
            0.7f,
            0.1f,
            0f,
            10f,
            0.1f,
            0.2f,
            0.5f,
            0f,
            30f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    GRAYSCALE(
        "黑白",
        floatArrayOf(
            0.3f,
            0.3f,
            0.3f,
            0f,
            0f,
            0.3f,
            0.3f,
            0.3f,
            0f,
            0f,
            0.3f,
            0.3f,
            0.3f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    SEPIA(
        "怀旧",
        floatArrayOf(
            0.39f,
            0.77f,
            0.19f,
            0f,
            0f,
            0.35f,
            0.69f,
            0.17f,
            0f,
            0f,
            0.27f,
            0.53f,
            0.13f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    HIGH_CONTRAST(
        "高对比度",
        floatArrayOf(
            1.5f,
            0f,
            0f,
            0f,
            -50f,
            0f,
            1.5f,
            0f,
            0f,
            -50f,
            0f,
            0f,
            1.5f,
            0f,
            -50f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    COOL(
        "冷色调",
        floatArrayOf(
            0.8f,
            0f,
            0f,
            0f,
            0f,
            0f,
            0.9f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1.2f,
            0f,
            20f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    WARM(
        "暖色调",
        floatArrayOf(
            1.2f,
            0f,
            0f,
            0f,
            20f,
            0f,
            1.0f,
            0f,
            0f,
            0f,
            0f,
            0f,
            0.8f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
    VIVID(
        "鲜艳",
        floatArrayOf(
            1.3f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1.3f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1.3f,
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0f,
        ),
    ),
}

internal fun PlayerActivity.applyVideoFilterPreset() {
    val presetIndex = BiliClient.prefs.videoFilterPreset
    val preset = VideoFilterPreset.entries.getOrElse(presetIndex) { VideoFilterPreset.NONE }

    if (preset == VideoFilterPreset.NONE) {
        // 不清除滤镜，因为可能有色彩/色温设置
        return
    }

    val cm = ColorMatrix(preset.matrix)
    try {
        val surfaceView = binding.playerView.videoSurfaceView
        (surfaceView as? android.view.View)?.background?.colorFilter = ColorMatrixColorFilter(cm)
    } catch (_: Throwable) {
    }
}

internal fun PlayerActivity.showVideoFilterPresetDialog() {
    val currentIndex = BiliClient.prefs.videoFilterPreset
    val labels = VideoFilterPreset.entries.map { it.label }.toTypedArray()

    AlertDialog
        .Builder(this)
        .setTitle("滤镜预设")
        .setSingleChoiceItems(labels, currentIndex) { dialog, which ->
            BiliClient.prefs.videoFilterPreset = which
            applyVideoFilterPreset()
            AppToast.show(this, "滤镜: ${labels[which]}")
            dialog.dismiss()
        }.setNegativeButton("取消", null)
        .show()
}
