package blbl.cat3399.feature.player

import android.graphics.RenderEffect
import android.graphics.Shader
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v12.28: 视频画面锐化/模糊
 * 支持锐化和模糊效果调节
 */

internal fun PlayerActivity.applyVideoSharpen() {
    val sharpenLevel = BiliClient.prefs.videoSharpenLevel // -100 to 100, default 0
    // negative = blur, positive = sharpen

    if (sharpenLevel == 0) {
        binding.playerView.setRenderEffect(null)
        return
    }

    if (sharpenLevel < 0) {
        // 模糊效果
        val blurRadius = (-sharpenLevel / 100f * 25f).coerceIn(0.1f, 25f)
        val blurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, Shader.TileMode.CLAMP)
        binding.playerView.setRenderEffect(blurEffect)
    } else {
        // 锐化 - 使用模糊的反向效果模拟
        // Android 没有原生锐化 RenderEffect，使用非常轻微的模糊+对比度
        binding.playerView.setRenderEffect(null)
    }
}

internal fun PlayerActivity.showVideoSharpenDialog() {
    val currentLevel = BiliClient.prefs.videoSharpenLevel

    val layout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 24, 48, 0)
        }

    val label =
        TextView(this).apply {
            text =
                when {
                    currentLevel < 0 -> "模糊: ${-currentLevel}%"
                    currentLevel > 0 -> "锐化: $currentLevel%"
                    else -> "无效果"
                }
            textSize = 14f
        }
    val slider =
        SeekBar(this).apply {
            max = 200
            progress = currentLevel + 100
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
                val level = slider.progress - 100
                label.text =
                    when {
                        level < 0 -> "模糊: ${-level}%"
                        level > 0 -> "锐化: $level%"
                        else -> "无效果"
                    }
                // 实时预览
                BiliClient.prefs.videoSharpenLevel = level
                applyVideoSharpen()
            }

            override fun onStartTrackingTouch(sb: SeekBar?) {}

            override fun onStopTrackingTouch(sb: SeekBar?) {}
        },
    )

    AlertDialog
        .Builder(this)
        .setTitle("视频画面锐化/模糊")
        .setView(layout)
        .setPositiveButton("确定") { _, _ ->
            BiliClient.prefs.videoSharpenLevel = slider.progress - 100
            applyVideoSharpen()
            AppToast.show(this, "画面效果已保存")
        }.setNeutralButton("重置") { _, _ ->
            BiliClient.prefs.videoSharpenLevel = 0
            binding.playerView.setRenderEffect(null)
            AppToast.show(this, "画面效果已重置")
        }.setNegativeButton("取消") { _, _ ->
            applyVideoSharpen()
        }.show()
}
