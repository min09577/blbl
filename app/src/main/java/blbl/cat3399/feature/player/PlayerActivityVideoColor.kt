package blbl.cat3399.feature.player

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.view.View
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

// 色彩设置持久化

/**
 * v12.26: 视频色彩调节
 * 支持调节亮度、对比度、饱和度
 */

internal fun PlayerActivity.applyVideoColorAdjustment() {
    val brightness = BiliClient.prefs.videoBrightness // -100 to 100, default 0
    val contrast = BiliClient.prefs.videoContrast // -100 to 100, default 0
    val saturation = BiliClient.prefs.videoSaturation // -100 to 100, default 0

    if (brightness == 0 && contrast == 0 && saturation == 0) {
        clearVideoColorFilter()
        return
    }

    val b = brightness / 100f * 255f
    val c = 1f + contrast / 100f
    val s = 1f + saturation / 100f

    val cm =
        ColorMatrix(
            floatArrayOf(
                c * s,
                0f,
                0f,
                0f,
                b,
                0f,
                c * s,
                0f,
                0f,
                b,
                0f,
                0f,
                c * s,
                0f,
                b,
                0f,
                0f,
                0f,
                1f,
                0f,
            ),
        )

    applyVideoColorFilter(ColorMatrixColorFilter(cm))
}

private fun PlayerActivity.applyVideoColorFilter(filter: ColorMatrixColorFilter) {
    try {
        // Apply color filter to the player view's video surface
        val surfaceView = binding.playerView.videoSurfaceView
        if (surfaceView != null) {
            (surfaceView as? android.view.View)?.background?.colorFilter = filter
            // Also try setting it on the view itself for TextureView
            try {
                val method = surfaceView.javaClass.getMethod("setColorFilter", android.graphics.ColorFilter::class.java)
                method.invoke(surfaceView, filter)
            } catch (_: Throwable) {
            }
        }
        // Fallback: apply to a semi-transparent overlay
        val overlay = requirePlayerTouchOverlayBinding(binding)
        overlay.touchGestureLayer.background?.colorFilter = filter
    } catch (_: Throwable) {
    }
}

private fun PlayerActivity.clearVideoColorFilter() {
    try {
        val surfaceView = binding.playerView.videoSurfaceView
        if (surfaceView != null) {
            (surfaceView as? android.view.View)?.background?.colorFilter = null
            try {
                val method = surfaceView.javaClass.getMethod("setColorFilter", android.graphics.ColorFilter::class.java)
                method.invoke(surfaceView, null as android.graphics.ColorFilter?)
            } catch (_: Throwable) {
            }
        }
        val overlay = requirePlayerTouchOverlayBinding(binding)
        overlay.touchGestureLayer.background?.colorFilter = null
    } catch (_: Throwable) {
    }
}

internal fun PlayerActivity.showVideoColorAdjustmentDialog() {
    val brightness = BiliClient.prefs.videoBrightness
    val contrast = BiliClient.prefs.videoContrast
    val saturation = BiliClient.prefs.videoSaturation

    val layout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 24, 48, 0)
        }

    // 亮度
    val brightnessLabel =
        TextView(this).apply {
            text = "亮度: $brightness"
            textSize = 14f
        }
    val brightnessSlider =
        SeekBar(this).apply {
            max = 200
            progress = brightness + 100
        }
    layout.addView(brightnessLabel)
    layout.addView(brightnessSlider)

    // 对比度
    val contrastLabel =
        TextView(this).apply {
            text = "对比度: $contrast"
            textSize = 14f
            setPadding(0, 16, 0, 0)
        }
    val contrastSlider =
        SeekBar(this).apply {
            max = 200
            progress = contrast + 100
        }
    layout.addView(contrastLabel)
    layout.addView(contrastSlider)

    // 饱和度
    val saturationLabel =
        TextView(this).apply {
            text = "饱和度: $saturation"
            textSize = 14f
            setPadding(0, 16, 0, 0)
        }
    val saturationSlider =
        SeekBar(this).apply {
            max = 200
            progress = saturation + 100
        }
    layout.addView(saturationLabel)
    layout.addView(saturationSlider)

    // 实时预览
    val listener =
        object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                sb: SeekBar?,
                progress: Int,
                fromUser: Boolean,
            ) {
                if (!fromUser) return
                val b = brightnessSlider.progress - 100
                val c = contrastSlider.progress - 100
                val s = saturationSlider.progress - 100
                brightnessLabel.text = "亮度: $b"
                contrastLabel.text = "对比度: $c"
                saturationLabel.text = "饱和度: $s"

                // 实时应用
                val bv = b / 100f * 255f
                val cv = 1f + c / 100f
                val sv = 1f + s / 100f
                val cm =
                    ColorMatrix(
                        floatArrayOf(
                            cv * sv,
                            0f,
                            0f,
                            0f,
                            bv,
                            0f,
                            cv * sv,
                            0f,
                            0f,
                            bv,
                            0f,
                            0f,
                            cv * sv,
                            0f,
                            bv,
                            0f,
                            0f,
                            0f,
                            1f,
                            0f,
                        ),
                    )
                applyVideoColorFilter(ColorMatrixColorFilter(cm))
            }

            override fun onStartTrackingTouch(sb: SeekBar?) {}

            override fun onStopTrackingTouch(sb: SeekBar?) {}
        }
    brightnessSlider.setOnSeekBarChangeListener(listener)
    contrastSlider.setOnSeekBarChangeListener(listener)
    saturationSlider.setOnSeekBarChangeListener(listener)

    AlertDialog
        .Builder(this)
        .setTitle("视频色彩调节")
        .setView(layout)
        .setPositiveButton("确定") { _, _ ->
            val b = brightnessSlider.progress - 100
            val c = contrastSlider.progress - 100
            val s = saturationSlider.progress - 100
            BiliClient.prefs.videoBrightness = b
            BiliClient.prefs.videoContrast = c
            BiliClient.prefs.videoSaturation = s
            applyVideoColorAdjustment()
            AppToast.show(this, "色彩设置已保存")
        }.setNeutralButton("重置") { _, _ ->
            BiliClient.prefs.videoBrightness = 0
            BiliClient.prefs.videoContrast = 0
            BiliClient.prefs.videoSaturation = 0
            clearVideoColorFilter()
            AppToast.show(this, "色彩设置已重置")
        }.setNegativeButton("取消") { _, _ ->
            // 恢复原始设置
            applyVideoColorAdjustment()
        }.show()
}
