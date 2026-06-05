package blbl.cat3399.feature.player

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

/**
 * v13.8: 播放速度曲线显示
 * 在播放器界面显示当前播放速度变化历史
 */

private var speedCurveJob: Job? = null
private var speedHistory = mutableListOf<Float>()
private var speedCurveView: TextView? = null

internal fun PlayerActivity.initSpeedCurveDisplay() {
    if (!BiliClient.prefs.speedCurveDisplayEnabled) return
    
    val overlay = requirePlayerTouchOverlayBinding(binding)
    
    val speedView = TextView(this).apply {
        id = View.generateViewId()
        text = "📈 1.0x"
        textSize = 12f
        setTextColor(0xFFFFFFFF.toInt())
        setBackgroundResource(R.drawable.boost_indicator_bg)
        setPadding(12, 6, 12, 6)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            gravity = android.view.Gravity.BOTTOM or android.view.Gravity.END
            bottomMargin = 160
            marginEnd = 16
        }
        layoutParams = params
    }
    speedCurveView = speedView
    overlay.root.addView(speedView)
    
    speedHistory.clear()
    speedCurveJob?.cancel()
    speedCurveJob = lifecycleScope.launch {
        while (isActive) {
            val engine = player
            if (engine != null) {
                val currentSpeed = engine.playbackSpeed
                speedHistory.add(currentSpeed)
                if (speedHistory.size > 10) {
                    speedHistory.removeAt(0)
                }
                
                // 构建速度曲线文本
                val curveText = buildString {
                    append("📈 ${String.format("%.1f", currentSpeed)}x")
                    if (speedHistory.size > 1) {
                        append(" [")
                        speedHistory.takeLast(5).forEach { speed ->
                            val bar = when {
                                speed < 0.5f -> "▁"
                                speed < 0.75f -> "▂"
                                speed < 1.0f -> "▃"
                                speed < 1.25f -> "▅"
                                speed < 1.5f -> "▆"
                                speed < 2.0f -> "▇"
                                else -> "█"
                            }
                            append(bar)
                        }
                        append("]")
                    }
                }
                speedView.text = curveText
                speedView.visibility = View.VISIBLE
            }
            delay(1000)
        }
    }
}

internal fun PlayerActivity.releaseSpeedCurveDisplay() {
    speedCurveJob?.cancel()
    speedCurveJob = null
    speedHistory.clear()
    speedCurveView = null
    try {
        val overlay = requirePlayerTouchOverlayBinding(binding)
        val childCount = overlay.root.childCount
        for (i in 0 until childCount) {
            val child = overlay.root.getChildAt(i)
            if (child is TextView && child.text?.startsWith("📈") == true) {
                overlay.root.removeView(child)
                break
            }
        }
    } catch (_: Throwable) {}
}
