package blbl.cat3399.feature.player

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

/**
 * v13.7: 视频剩余时间倒计时
 * 在播放器界面显示剩余时间倒计时
 */

private var countdownJob: Job? = null

internal fun PlayerActivity.initCountdownDisplay() {
    if (!BiliClient.prefs.countdownDisplayEnabled) return

    val overlay = requirePlayerTouchOverlayBinding(binding)

    val countdownView =
        TextView(this).apply {
            id = View.generateViewId()
            text = "⏱ --:--"
            textSize = 14f
            setTextColor(0xFFFFFFFF.toInt())
            setBackgroundResource(R.drawable.boost_indicator_bg)
            setPadding(16, 8, 16, 8)
            val params =
                LinearLayout
                    .LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                    ).apply {
                        gravity = android.view.Gravity.TOP or android.view.Gravity.END
                        topMargin = 16
                        marginEnd = 16
                    }
            layoutParams = params
        }
    overlay.root.addView(countdownView)

    countdownJob?.cancel()
    countdownJob =
        lifecycleScope.launch {
            while (isActive) {
                val engine = player
                if (engine != null) {
                    val duration = engine.duration
                    val current = engine.currentPosition
                    if (duration > 0 && current >= 0) {
                        val remaining = duration - current
                        val remainingSec = (remaining / 1000).toInt()
                        val hours = remainingSec / 3600
                        val minutes = (remainingSec % 3600) / 60
                        val seconds = remainingSec % 60

                        val timeText =
                            if (hours > 0) {
                                String.format("⏱ 剩余 %d:%02d:%02d", hours, minutes, seconds)
                            } else {
                                String.format("⏱ 剩余 %02d:%02d", minutes, seconds)
                            }
                        countdownView.text = timeText
                        countdownView.visibility = View.VISIBLE
                    } else {
                        countdownView.visibility = View.GONE
                    }
                }
                delay(1000)
            }
        }
}

internal fun PlayerActivity.releaseCountdownDisplay() {
    countdownJob?.cancel()
    countdownJob = null
    try {
        val overlay = requirePlayerTouchOverlayBinding(binding)
        val childCount = overlay.root.childCount
        for (i in 0 until childCount) {
            val child = overlay.root.getChildAt(i)
            if (child is TextView && child.text?.startsWith("⏱") == true) {
                overlay.root.removeView(child)
                break
            }
        }
    } catch (_: Throwable) {
    }
}
