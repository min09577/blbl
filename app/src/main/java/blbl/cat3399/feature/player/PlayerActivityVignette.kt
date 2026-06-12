package blbl.cat3399.feature.player

import android.graphics.RadialGradient
import android.graphics.Shader
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v13.10: 视频画面暗角效果
 * 添加暗角（vignette）效果增强观影体验
 */

internal fun PlayerActivity.applyVignetteEffect() {
    val intensity = BiliClient.prefs.vignetteIntensity // 0-100, default 0

    if (intensity == 0) {
        binding.playerView.foreground = null
        return
    }

    val playerWidth = binding.playerView.width
    val playerHeight = binding.playerView.height

    if (playerWidth <= 0 || playerHeight <= 0) return

    val centerX = playerWidth / 2f
    val centerY = playerHeight / 2f
    val radius = maxOf(playerWidth, playerHeight) * (1.0f - intensity / 200f)

    val gradient =
        RadialGradient(
            centerX,
            centerY,
            radius,
            intArrayOf(android.graphics.Color.TRANSPARENT, android.graphics.Color.argb((intensity * 2.55).toInt(), 0, 0, 0)),
            floatArrayOf(0.5f, 1.0f),
            Shader.TileMode.CLAMP,
        )

    val paint = android.graphics.Paint()
    paint.shader = gradient

    binding.playerView.foreground =
        object : android.graphics.drawable.Drawable() {
            override fun draw(canvas: android.graphics.Canvas) {
                canvas.drawRect(0f, 0f, playerWidth.toFloat(), playerHeight.toFloat(), paint)
            }

            override fun setAlpha(alpha: Int) {}

            override fun setColorFilter(colorFilter: android.graphics.ColorFilter?) {}

            override fun getOpacity() = android.graphics.PixelFormat.TRANSLUCENT
        }
}

internal fun PlayerActivity.showVignetteDialog() {
    val currentIntensity = BiliClient.prefs.vignetteIntensity

    val layout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 24, 48, 0)
        }

    val label =
        TextView(this).apply {
            text = "暗角强度: $currentIntensity%"
            textSize = 14f
        }
    val slider =
        SeekBar(this).apply {
            max = 100
            progress = currentIntensity
        }
    layout.addView(label)
    layout.addView(slider)

    slider.setOnSeekBarChangeListener(
        object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                sb: SeekBar?,
                progress: Int,
                fromUser: Boolean,
            ) {
                if (!fromUser) return
                label.text = "暗角强度: $progress%"
                BiliClient.prefs.vignetteIntensity = progress
                applyVignetteEffect()
            }

            override fun onStartTrackingTouch(sb: SeekBar?) {}

            override fun onStopTrackingTouch(sb: SeekBar?) {}
        },
    )

    AlertDialog
        .Builder(this)
        .setTitle("暗角效果")
        .setView(layout)
        .setPositiveButton("确定", null)
        .setNeutralButton("重置") { _, _ ->
            BiliClient.prefs.vignetteIntensity = 0
            binding.playerView.foreground = null
            AppToast.show(this, "暗角效果已重置")
        }.setNegativeButton("取消") { _, _ ->
            applyVignetteEffect()
        }.show()
}
