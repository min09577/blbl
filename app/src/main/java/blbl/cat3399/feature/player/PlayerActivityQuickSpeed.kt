package blbl.cat3399.feature.player

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v13.2: 快捷倍速面板
 * 在播放器界面显示常用倍速按钮，一键切换
 */

private var speedPanelVisible = false

internal fun PlayerActivity.showQuickSpeedPanel() {
    if (speedPanelVisible) return
    speedPanelVisible = true

    val overlay = requirePlayerTouchOverlayBinding(binding)

    val panel =
        LinearLayout(this).apply {
            id = View.generateViewId()
            orientation = LinearLayout.HORIZONTAL
            gravity = android.view.Gravity.CENTER
            setBackgroundResource(R.drawable.boost_indicator_bg)
            setPadding(16, 12, 16, 12)
            elevation = 16f
        }

    val speeds = listOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f)
    val currentSpeed = player?.playbackSpeed ?: 1.0f

    speeds.forEach { speed ->
        val btn =
            TextView(this).apply {
                text = "${speed}x"
                textSize = 12f
                setTextColor(if (kotlin.math.abs(speed - currentSpeed) < 0.01f) 0xFF00CCFF.toInt() else 0xFFFFFFFF.toInt())
                setBackgroundResource(R.drawable.boost_indicator_bg)
                setPadding(16, 8, 16, 8)
                val params =
                    LinearLayout
                        .LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                        ).apply {
                            setMargins(4, 0, 4, 0)
                        }
                layoutParams = params
                setOnClickListener {
                    player?.setPlaybackSpeed(speed)
                    BiliClient.prefs.playerSpeed = speed
                    AppToast.show(this@showQuickSpeedPanel, "倍速: ${speed}x")
                    hideQuickSpeedPanel()
                }
            }
        panel.addView(btn)
    }

    // 关闭按钮
    val closeBtn =
        TextView(this).apply {
            text = "✕"
            textSize = 14f
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(16, 8, 8, 8)
            setOnClickListener { hideQuickSpeedPanel() }
        }
    panel.addView(closeBtn)

    val params =
        LinearLayout
            .LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
            ).apply {
                gravity = android.view.Gravity.BOTTOM or android.view.Gravity.CENTER_HORIZONTAL
                bottomMargin = 120
            }
    overlay.root.addView(panel, params)

    panel.alpha = 0f
    panel.translationY = 50f
    panel
        .animate()
        .alpha(1f)
        .translationY(0f)
        .setDuration(200)
        .start()
}

internal fun PlayerActivity.hideQuickSpeedPanel() {
    if (!speedPanelVisible) return
    speedPanelVisible = false

    val overlay = requirePlayerTouchOverlayBinding(binding)
    val childCount = overlay.root.childCount
    if (childCount > 0) {
        val panel = overlay.root.getChildAt(childCount - 1)
        panel
            ?.animate()
            ?.alpha(0f)
            ?.translationY(50f)
            ?.setDuration(150)
            ?.withEndAction { overlay.root.removeView(panel) }
            ?.start()
    }
}
