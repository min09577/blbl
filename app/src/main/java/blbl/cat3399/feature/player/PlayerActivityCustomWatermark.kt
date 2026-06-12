package blbl.cat3399.feature.player

import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v13.10: 自定义文字水印
 * 支持在视频画面上显示自定义文字水印
 */

internal fun PlayerActivity.showCustomWatermarkDialog() {
    val currentText = BiliClient.prefs.customWatermarkText
    val currentColor = BiliClient.prefs.customWatermarkColor
    val currentSize = BiliClient.prefs.customWatermarkSize

    val layout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 24, 48, 0)
        }

    val input =
        EditText(this).apply {
            hint = "输入水印文字"
            setText(currentText)
            textSize = 14f
            setPadding(16, 16, 16, 16)
        }
    layout.addView(input)

    // 预览文字
    val preview =
        TextView(this).apply {
            text = if (currentText.isNotEmpty()) currentText else "预览文字"
            textSize = currentSize.toFloat()
            setTextColor(currentColor)
            setPadding(0, 16, 0, 0)
        }
    layout.addView(preview)

    // 颜色选择
    val colorLabel =
        TextView(this).apply {
            text = "文字颜色: ${getColorName(currentColor)}"
            textSize = 12f
            setPadding(0, 16, 0, 8)
        }
    layout.addView(colorLabel)

    val colors =
        listOf(
            0xFFFFFFFF.toInt() to "白色",
            0xFF000000.toInt() to "黑色",
            0xFFFF0000.toInt() to "红色",
            0xFF00FF00.toInt() to "绿色",
            0xFF0000FF.toInt() to "蓝色",
            0xFFFFFF00.toInt() to "黄色",
        )

    val colorRow =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
        }
    colors.forEach { (color, name) ->
        val btn =
            TextView(this).apply {
                text = name
                textSize = 10f
                setTextColor(color)
                setBackgroundResource(R.drawable.boost_indicator_bg)
                setPadding(8, 4, 8, 4)
                setOnClickListener {
                    BiliClient.prefs.customWatermarkColor = color
                    preview.setTextColor(color)
                    colorLabel.text = "文字颜色: $name"
                }
            }
        colorRow.addView(btn)
    }
    layout.addView(colorRow)

    AlertDialog
        .Builder(this)
        .setTitle("自定义水印")
        .setView(layout)
        .setPositiveButton("确定") { _, _ ->
            val text = input.text.toString()
            if (text.isNotEmpty()) {
                BiliClient.prefs.customWatermarkText = text
                applyCustomWatermark()
                AppToast.show(this, "水印已设置")
            }
        }.setNeutralButton("清除") { _, _ ->
            BiliClient.prefs.customWatermarkText = ""
            releaseCustomWatermark()
            AppToast.show(this, "水印已清除")
        }.setNegativeButton("取消", null)
        .show()
}

private fun getColorName(color: Int): String =
    when (color) {
        0xFFFFFFFF.toInt() -> "白色"
        0xFF000000.toInt() -> "黑色"
        0xFFFF0000.toInt() -> "红色"
        0xFF00FF00.toInt() -> "绿色"
        0xFF0000FF.toInt() -> "蓝色"
        0xFFFFFF00.toInt() -> "黄色"
        else -> "白色"
    }

internal fun PlayerActivity.applyCustomWatermark() {
    val text = BiliClient.prefs.customWatermarkText
    if (text.isEmpty()) return

    val overlay = requirePlayerTouchOverlayBinding(binding)

    val watermarkView =
        TextView(this).apply {
            id = android.view.View.generateViewId()
            this.text = text
            textSize = BiliClient.prefs.customWatermarkSize.toFloat()
            setTextColor(BiliClient.prefs.customWatermarkColor)
            setShadowLayer(2f, 1f, 1f, 0xFF000000.toInt())

            val params =
                android.widget.LinearLayout
                    .LayoutParams(
                        android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,
                        android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,
                    ).apply {
                        gravity = android.view.Gravity.BOTTOM or android.view.Gravity.END
                        bottomMargin = 200
                        marginEnd = 16
                    }
            layoutParams = params
        }

    overlay.root.addView(watermarkView)
}

internal fun PlayerActivity.releaseCustomWatermark() {
    try {
        val overlay = requirePlayerTouchOverlayBinding(binding)
        val childCount = overlay.root.childCount
        val toRemove = mutableListOf<android.view.View>()
        for (i in 0 until childCount) {
            val child = overlay.root.getChildAt(i)
            if (child is TextView && child.id != android.view.View.generateViewId()) {
                // 找到之前添加的 watermark view
                if (child.text == BiliClient.prefs.customWatermarkText ||
                    (child.layoutParams as? android.widget.LinearLayout.LayoutParams)?.gravity?.and(android.view.Gravity.END) != null
                ) {
                    toRemove.add(child)
                }
            }
        }
        toRemove.forEach { overlay.root.removeView(it) }
    } catch (_: Throwable) {
    }
}
