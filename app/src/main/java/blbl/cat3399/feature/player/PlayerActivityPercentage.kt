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
 * v13.9: 播放位置百分比显示
 * 在播放器界面显示当前播放位置百分比
 */

private var percentageJob: Job? = null

internal fun PlayerActivity.initPercentageDisplay() {
    if (!BiliClient.prefs.percentageDisplayEnabled) return
    
    val overlay = requirePlayerTouchOverlayBinding(binding)
    
    val percentageView = TextView(this).apply {
        id = View.generateViewId()
        text = "📊 0%"
        textSize = 12f
        setTextColor(0xFFFFFFFF.toInt())
        setBackgroundResource(R.drawable.boost_indicator_bg)
        setPadding(12, 6, 12, 6)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            gravity = android.view.Gravity.BOTTOM or android.view.Gravity.START
            bottomMargin = 160
            marginStart = 16
        }
        layoutParams = params
    }
    overlay.root.addView(percentageView)
    
    percentageJob?.cancel()
    percentageJob = lifecycleScope.launch {
        while (isActive) {
            val engine = player
            if (engine != null) {
                val duration = engine.duration
                val current = engine.currentPosition
                if (duration > 0 && current >= 0) {
                    val percentage = (current * 100.0 / duration).toInt()
                    percentageView.text = "📊 $percentage%"
                    percentageView.visibility = View.VISIBLE
                } else {
                    percentageView.visibility = View.GONE
                }
            }
            delay(1000)
        }
    }
}

internal fun PlayerActivity.releasePercentageDisplay() {
    percentageJob?.cancel()
    percentageJob = null
    try {
        val overlay = requirePlayerTouchOverlayBinding(binding)
        val childCount = overlay.root.childCount
        for (i in 0 until childCount) {
            val child = overlay.root.getChildAt(i)
            if (child is TextView && child.text?.startsWith("📊") == true) {
                overlay.root.removeView(child)
                break
            }
        }
    } catch (_: Throwable) {}
}
