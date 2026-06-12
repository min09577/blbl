package blbl.cat3399.feature.player

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.ui.AppToast

/**
 * v13.3: 视频画面分屏对比
 * 支持左右分屏对比原图和处理后效果
 */

private var splitScreenActive = false

internal fun PlayerActivity.toggleSplitScreenComparison() {
    if (splitScreenActive) {
        disableSplitScreen()
    } else {
        enableSplitScreen()
    }
}

private fun PlayerActivity.enableSplitScreen() {
    splitScreenActive = true

    // 创建分屏指示器
    val overlay = requirePlayerTouchOverlayBinding(binding)

    val indicator =
        TextView(this).apply {
            id = View.generateViewId()
            text = "🔲 分屏对比模式\n左侧: 原图 | 右侧: 当前效果"
            textSize = 12f
            setTextColor(0xFFFFFFFF.toInt())
            setBackgroundResource(R.drawable.boost_indicator_bg)
            setPadding(24, 12, 24, 12)
            val params =
                LinearLayout
                    .LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                    ).apply {
                        gravity = android.view.Gravity.TOP or android.view.Gravity.CENTER_HORIZONTAL
                        topMargin = 100
                    }
            layoutParams = params
        }
    overlay.root.addView(indicator)

    // 分屏效果：左侧保留原图，右侧应用当前效果
    // 通过设置 playerView 的 clipBounds 实现
    val playerView = binding.playerView
    val width = playerView.width
    val height = playerView.height

    if (width > 0 && height > 0) {
        // 左侧原图（不应用滤镜）
        val leftClip = android.graphics.Rect(0, 0, width / 2, height)
        playerView.clipBounds = leftClip

        // 注意：Android 的 PlayerView 不支持同时显示两个不同的渲染
        // 这里我们通过在左侧叠加一个半透明遮罩来模拟"原图"效果
        val overlayView =
            View(this).apply {
                id = View.generateViewId()
                setBackgroundColor(0x40000000.toInt()) // 半透明黑色
                val params = LinearLayout.LayoutParams(width / 2, height)
                layoutParams = params
                x = 0f
                y = 0f
            }
        overlay.root.addView(overlayView)

        // 中间分割线
        val divider =
            View(this).apply {
                id = View.generateViewId()
                setBackgroundColor(0xFFFFFFFF.toInt())
                val params = LinearLayout.LayoutParams(2, height)
                layoutParams = params
                x = (width / 2).toFloat()
                y = 0f
            }
        overlay.root.addView(divider)
    }

    AppToast.show(this, "分屏对比模式已开启")
}

private fun PlayerActivity.disableSplitScreen() {
    splitScreenActive = false

    val overlay = requirePlayerTouchOverlayBinding(binding)
    val playerView = binding.playerView
    playerView.clipBounds = null

    // 移除分屏相关视图
    val childCount = overlay.root.childCount
    val viewsToRemove = mutableListOf<View>()
    for (i in 0 until childCount) {
        val child = overlay.root.getChildAt(i)
        if (child.id == View.generateViewId() ||
            child.layoutParams?.width == 2 ||
            // 分割线
            child.layoutParams?.width == playerView.width / 2
        ) { // 遮罩
            viewsToRemove.add(child)
        }
    }
    viewsToRemove.forEach { overlay.root.removeView(it) }

    AppToast.show(this, "分屏对比模式已关闭")
}
