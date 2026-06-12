package blbl.cat3399.feature.player

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.ui.AppToast

/**
 * v13.0: 播放器快捷操作面板
 * 长按设置按钮呼出快捷操作面板，提供常用功能快速访问
 */

internal var quickPanelVisible = false

internal fun PlayerActivity.showQuickPanel() {
    if (quickPanelVisible) return
    quickPanelVisible = true

    val overlay = requirePlayerTouchOverlayBinding(binding)

    // 创建快捷操作面板
    val panel =
        LinearLayout(this).apply {
            id = View.generateViewId()
            orientation = LinearLayout.VERTICAL
            setBackgroundResource(R.drawable.boost_indicator_bg)
            setPadding(32, 24, 32, 24)
            elevation = 16f
        }

    // 标题
    val title =
        TextView(this).apply {
            text = "⚡ 快捷操作"
            textSize = 16f
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(0, 0, 0, 16)
        }
    panel.addView(title)

    // 操作按钮网格
    val row1 = createQuickPanelRow()
    addQuickButton(row1, "🔄 旋转") { cycleVideoRotationQuick() }
    addQuickButton(row1, "🪞 镜像") { cycleMirrorModeQuick() }
    addQuickButton(row1, "📊 统计") { showPlaybackStatsDialog() }

    val row2 = createQuickPanelRow()
    addQuickButton(row2, "🎨 色彩") { showVideoColorAdjustmentDialog() }
    addQuickButton(row2, "📐 裁剪") { showVideoCropDialog() }
    addQuickButton(row2, "🔍 锐化") { showVideoSharpenDialog() }

    val row3 = createQuickPanelRow()
    addQuickButton(row3, "🌡 色温") { showVideoColorTemperatureDialog() }
    addQuickButton(row3, "🎭 滤镜") { showVideoFilterPresetDialog() }
    addQuickButton(row3, "⚡ 倍速") { showQuickSpeedPanel() }

    val row4 = createQuickPanelRow()
    addQuickButton(row4, "🔲 分屏") { toggleSplitScreenComparison() }
    addQuickButton(row4, "🔍 重置缩放") { resetPinchZoom() }
    addQuickButton(row4, "↔ 重置平移") { resetPanGesture() }

    val row5 = createQuickPanelRow()
    addQuickButton(row5, "✏️ 画笔") { toggleAnnotationMode() }
    addQuickButton(row5, "❌ 关闭") { hideQuickPanel() }

    panel.addView(row1)
    panel.addView(row2)
    panel.addView(row3)

    // 添加到 overlay
    val params =
        LinearLayout
            .LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
            ).apply {
                gravity = android.view.Gravity.CENTER
            }
    overlay.root.addView(panel, params)

    // 动画
    panel.alpha = 0f
    panel.scaleX = 0.8f
    panel.scaleY = 0.8f
    panel
        .animate()
        .alpha(1f)
        .scaleX(1f)
        .scaleY(1f)
        .setDuration(200)
        .start()
}

internal fun PlayerActivity.hideQuickPanel() {
    if (!quickPanelVisible) return
    quickPanelVisible = false

    val overlay = requirePlayerTouchOverlayBinding(binding)
    // 找到最后添加的面板
    val childCount = overlay.root.childCount
    if (childCount > 0) {
        val panel = overlay.root.getChildAt(childCount - 1)
        panel
            ?.animate()
            ?.alpha(0f)
            ?.scaleX(0.8f)
            ?.scaleY(0.8f)
            ?.setDuration(150)
            ?.withEndAction {
                overlay.root.removeView(panel)
            }?.start()
    }
}

private fun PlayerActivity.createQuickPanelRow(): LinearLayout =
    LinearLayout(this).apply {
        orientation = LinearLayout.HORIZONTAL
        gravity = android.view.Gravity.CENTER
        setPadding(0, 8, 0, 8)
    }

private fun PlayerActivity.addQuickButton(
    row: LinearLayout,
    label: String,
    onClick: () -> Unit,
) {
    val btn =
        TextView(this).apply {
            text = label
            textSize = 13f
            setTextColor(0xFFFFFFFF.toInt())
            setBackgroundResource(R.drawable.boost_indicator_bg)
            setPadding(24, 16, 24, 16)
            val params =
                LinearLayout
                    .LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                    ).apply {
                        setMargins(8, 0, 8, 0)
                    }
            layoutParams = params
            setOnClickListener {
                hideQuickPanel()
                onClick()
            }
        }
    row.addView(btn)
}

private fun PlayerActivity.cycleVideoRotationQuick() {
    val current = session.videoRotation
    val next = (current + 90) % 360
    applyVideoRotation(next)
    AppToast.show(this, "旋转: $next°")
}

private fun PlayerActivity.cycleMirrorModeQuick() {
    val current = session.videoMirror
    val next = (current + 1) % 3
    applyVideoMirror(next)
    val modeText =
        when (next) {
            0 -> "关闭"
            1 -> "水平翻转"
            2 -> "垂直翻转"
            else -> "关闭"
        }
    AppToast.show(this, "镜像: $modeText")
}
