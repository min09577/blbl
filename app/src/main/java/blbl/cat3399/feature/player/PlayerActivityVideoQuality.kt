package blbl.cat3399.feature.player

import android.view.View
import androidx.lifecycle.lifecycleScope
import blbl.cat3399.core.net.BiliClient
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

/**
 * v12.25: 视频质量指示器
 * 在播放器界面显示当前视频分辨率和编码信息
 */

private var videoQualityJob: Job? = null
private var currentVideoWidth: Int = 0
private var currentVideoHeight: Int = 0

internal fun PlayerActivity.initVideoQualityIndicator() {
    if (!BiliClient.prefs.videoQualityIndicatorEnabled) return
    val overlay = requirePlayerTouchOverlayBinding(binding)
    val tvQuality = overlay.tvVideoQuality
    tvQuality.visibility = View.VISIBLE

    // 监听视频尺寸变化
    player?.addListener(
        object : blbl.cat3399.feature.player.engine.BlblPlayerEngine.Listener {
            override fun onVideoSizeChanged(
                width: Int,
                height: Int,
            ) {
                currentVideoWidth = width
                currentVideoHeight = height
                updateVideoQualityText(tvQuality)
            }
        },
    )

    videoQualityJob?.cancel()
    videoQualityJob =
        lifecycleScope.launch {
            while (isActive) {
                updateVideoQualityText(tvQuality)
                delay(2000) // 每2秒更新一次
            }
        }
}

private fun PlayerActivity.updateVideoQualityText(tvQuality: android.widget.TextView) {
    val width = currentVideoWidth
    val height = currentVideoHeight

    val qualityText =
        buildString {
            if (width > 0 && height > 0) {
                append("${width}x$height")
                // 添加分辨率等级标识
                when {
                    height >= 2160 -> append(" 4K")
                    height >= 1440 -> append(" 2K")
                    height >= 1080 -> append(" FHD")
                    height >= 720 -> append(" HD")
                    height >= 480 -> append(" SD")
                }
            }
        }

    tvQuality.text = if (qualityText.isNotBlank()) "🎬 $qualityText" else ""
    tvQuality.visibility = if (qualityText.isNotBlank()) View.VISIBLE else View.GONE
}

internal fun PlayerActivity.releaseVideoQualityIndicator() {
    videoQualityJob?.cancel()
    videoQualityJob = null
    currentVideoWidth = 0
    currentVideoHeight = 0
    try {
        val overlay = requirePlayerTouchOverlayBinding(binding)
        overlay.tvVideoQuality.visibility = View.GONE
    } catch (_: Throwable) {
    }
}
