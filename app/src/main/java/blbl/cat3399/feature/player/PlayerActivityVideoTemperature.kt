package blbl.cat3399.feature.player

import android.graphics.ColorFilter
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.SeekBar
import android.widget.TextView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v12.29: 视频画面色温调节
 * 支持冷色调/暖色调调节
 */

internal fun PlayerActivity.applyVideoColorTemperature() {
    val temperature = BiliClient.prefs.videoColorTemperature // -100 to 100, default 0
    // negative = cool (blue), positive = warm (red/yellow)
    
    if (temperature == 0) {
        // 不应用色温，但保留其他色彩设置
        val brightness = BiliClient.prefs.videoBrightness
        val contrast = BiliClient.prefs.videoContrast
        val saturation = BiliClient.prefs.videoSaturation
        if (brightness == 0 && contrast == 0 && saturation == 0) {
            // 没有任何色彩设置，清除滤镜
            try {
                val surfaceView = binding.playerView.videoSurfaceView
                (surfaceView as? android.view.View)?.background?.colorFilter = null
            } catch (_: Throwable) {}
        }
        return
    }
    
    val factor = temperature / 100f
    
    // 色温矩阵
    // 暖色调：增加红色，减少蓝色
    // 冷色调：增加蓝色，减少红色
    val rFactor = 1f + factor * 0.3f
    val gFactor = 1f + factor * 0.05f
    val bFactor = 1f - factor * 0.3f
    
    val cm = ColorMatrix(floatArrayOf(
        rFactor, 0f, 0f, 0f, 0f,
        0f, gFactor, 0f, 0f, 0f,
        0f, 0f, bFactor, 0f, 0f,
        0f, 0f, 0f, 1f, 0f
    ))
    
    try {
        val surfaceView = binding.playerView.videoSurfaceView
        (surfaceView as? android.view.View)?.background?.colorFilter = ColorMatrixColorFilter(cm)
    } catch (_: Throwable) {}
}

internal fun PlayerActivity.showVideoColorTemperatureDialog() {
    val currentTemp = BiliClient.prefs.videoColorTemperature
    
    val layout = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        setPadding(48, 24, 48, 0)
    }
    
    val label = TextView(this).apply {
        text = when {
            currentTemp < 0 -> "冷色调: ${-currentTemp}%"
            currentTemp > 0 -> "暖色调: ${currentTemp}%"
            else -> "默认色温"
        }
        textSize = 14f
    }
    val slider = SeekBar(this).apply {
        max = 200
        progress = currentTemp + 100
    }
    layout.addView(label)
    layout.addView(slider)
    
    slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(sb: SeekBar?, progress: Int, fromUser: Boolean) {
            if (!fromUser) return
            val temp = slider.progress - 100
            label.text = when {
                temp < 0 -> "冷色调: ${-temp}%"
                temp > 0 -> "暖色调: ${temp}%"
                else -> "默认色温"
            }
            // 实时预览
            BiliClient.prefs.videoColorTemperature = temp
            applyVideoColorTemperature()
        }
        override fun onStartTrackingTouch(sb: SeekBar?) {}
        override fun onStopTrackingTouch(sb: SeekBar?) {}
    })
    
    AlertDialog.Builder(this)
        .setTitle("色温调节")
        .setView(layout)
        .setPositiveButton("确定") { _, _ ->
            BiliClient.prefs.videoColorTemperature = slider.progress - 100
            applyVideoColorTemperature()
            AppToast.show(this, "色温设置已保存")
        }
        .setNeutralButton("重置") { _, _ ->
            BiliClient.prefs.videoColorTemperature = 0
            applyVideoColorTemperature()
            AppToast.show(this, "色温设置已重置")
        }
        .setNegativeButton("取消") { _, _ ->
            applyVideoColorTemperature()
        }
        .show()
}
