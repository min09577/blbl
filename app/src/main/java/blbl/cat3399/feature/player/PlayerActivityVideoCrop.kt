package blbl.cat3399.feature.player

import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v12.27: 视频画面裁剪
 * 支持自定义裁剪视频画面去除黑边
 */

internal fun PlayerActivity.applyVideoCrop() {
    val cropLeft = BiliClient.prefs.videoCropLeft // 0-100, default 0
    val cropTop = BiliClient.prefs.videoCropTop // 0-100, default 0
    val cropRight = BiliClient.prefs.videoCropRight // 0-100, default 0
    val cropBottom = BiliClient.prefs.videoCropBottom // 0-100, default 0

    if (cropLeft == 0 && cropTop == 0 && cropRight == 0 && cropBottom == 0) {
        // 无裁剪，恢复原始 padding
        binding.playerView.setPadding(0, 0, 0, 0)
        return
    }

    val playerWidth = binding.playerView.width
    val playerHeight = binding.playerView.height

    if (playerWidth <= 0 || playerHeight <= 0) return

    val paddingLeft = (playerWidth * cropLeft / 100f).toInt()
    val paddingTop = (playerHeight * cropTop / 100f).toInt()
    val paddingRight = (playerWidth * cropRight / 100f).toInt()
    val paddingBottom = (playerHeight * cropBottom / 100f).toInt()

    binding.playerView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom)
}

internal fun PlayerActivity.showVideoCropDialog() {
    val cropLeft = BiliClient.prefs.videoCropLeft
    val cropTop = BiliClient.prefs.videoCropTop
    val cropRight = BiliClient.prefs.videoCropRight
    val cropBottom = BiliClient.prefs.videoCropBottom

    val layout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 24, 48, 0)
        }

    val leftLabel =
        TextView(this).apply {
            text = "左边距: $cropLeft%"
            textSize = 14f
        }
    val leftSlider =
        SeekBar(this).apply {
            max = 50
            progress = cropLeft
        }
    val topLabel =
        TextView(this).apply {
            text = "上边距: $cropTop%"
            textSize = 14f
            setPadding(0, 16, 0, 0)
        }
    val topSlider =
        SeekBar(this).apply {
            max = 50
            progress = cropTop
        }
    val rightLabel =
        TextView(this).apply {
            text = "右边距: $cropRight%"
            textSize = 14f
            setPadding(0, 16, 0, 0)
        }
    val rightSlider =
        SeekBar(this).apply {
            max = 50
            progress = cropRight
        }
    val bottomLabel =
        TextView(this).apply {
            text = "下边距: $cropBottom%"
            textSize = 14f
            setPadding(0, 16, 0, 0)
        }
    val bottomSlider =
        SeekBar(this).apply {
            max = 50
            progress = cropBottom
        }

    layout.addView(leftLabel)
    layout.addView(leftSlider)
    layout.addView(topLabel)
    layout.addView(topSlider)
    layout.addView(rightLabel)
    layout.addView(rightSlider)
    layout.addView(bottomLabel)
    layout.addView(bottomSlider)

    val listener =
        object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                sb: SeekBar?,
                progress: Int,
                fromUser: Boolean,
            ) {
                if (!fromUser) return
                leftLabel.text = "左边距: ${leftSlider.progress}%"
                topLabel.text = "上边距: ${topSlider.progress}%"
                rightLabel.text = "右边距: ${rightSlider.progress}%"
                bottomLabel.text = "下边距: ${bottomSlider.progress}%"

                // 实时预览
                val pw = binding.playerView.width
                val ph = binding.playerView.height
                if (pw > 0 && ph > 0) {
                    binding.playerView.setPadding(
                        pw * leftSlider.progress / 100,
                        ph * topSlider.progress / 100,
                        pw * rightSlider.progress / 100,
                        ph * bottomSlider.progress / 100,
                    )
                }
            }

            override fun onStartTrackingTouch(sb: SeekBar?) {}

            override fun onStopTrackingTouch(sb: SeekBar?) {}
        }
    leftSlider.setOnSeekBarChangeListener(listener)
    topSlider.setOnSeekBarChangeListener(listener)
    rightSlider.setOnSeekBarChangeListener(listener)
    bottomSlider.setOnSeekBarChangeListener(listener)

    AlertDialog
        .Builder(this)
        .setTitle("视频画面裁剪")
        .setView(layout)
        .setPositiveButton("确定") { _, _ ->
            BiliClient.prefs.videoCropLeft = leftSlider.progress
            BiliClient.prefs.videoCropTop = topSlider.progress
            BiliClient.prefs.videoCropRight = rightSlider.progress
            BiliClient.prefs.videoCropBottom = bottomSlider.progress
            applyVideoCrop()
            AppToast.show(this, "裁剪设置已保存")
        }.setNeutralButton("重置") { _, _ ->
            BiliClient.prefs.videoCropLeft = 0
            BiliClient.prefs.videoCropTop = 0
            BiliClient.prefs.videoCropRight = 0
            BiliClient.prefs.videoCropBottom = 0
            binding.playerView.setPadding(0, 0, 0, 0)
            AppToast.show(this, "裁剪设置已重置")
        }.setNegativeButton("取消") { _, _ ->
            applyVideoCrop()
        }.show()
}
