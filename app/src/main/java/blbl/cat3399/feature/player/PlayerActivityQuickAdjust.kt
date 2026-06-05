package blbl.cat3399.feature.player

import android.widget.SeekBar
import android.widget.TextView
import android.widget.LinearLayout
import android.view.View
import androidx.appcompat.app.AlertDialog
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v13.12: 快捷调节面板
 * 快速调节亮度/对比度/饱和度
 */

private var quickAdjustPanelVisible = false

internal fun PlayerActivity.showQuickAdjustPanel() {
    if (quickAdjustPanelVisible) return
    quickAdjustPanelVisible = true
    
    val overlay = requirePlayerTouchOverlayBinding(binding)
    
    val panel = LinearLayout(this).apply {
        id = View.generateViewId()
        orientation = LinearLayout.VERTICAL
        gravity = android.view.Gravity.CENTER
        setBackgroundResource(R.drawable.boost_indicator_bg)
        setPadding(32, 24, 32, 24)
        elevation = 16f
    }
    
    // 标题
    val title = TextView(this).apply {
        text = "⚡ 快捷调节"
        textSize = 16f
        setTextColor(0xFFFFFFFF.toInt())
        setPadding(0, 0, 0, 16)
    }
    panel.addView(title)
    
    // 亮度
    val brightnessLabel = TextView(this).apply {
        text = "亮度: ${BiliClient.prefs.videoBrightness}"
        textSize = 14f
        setTextColor(0xFFFFFFFF.toInt())
    }
    val brightnessSlider = SeekBar(this).apply {
        max = 200
        progress = BiliClient.prefs.videoBrightness + 100
    }
    panel.addView(brightnessLabel)
    panel.addView(brightnessSlider)
    
    // 对比度
    val contrastLabel = TextView(this).apply {
        text = "对比度: ${BiliClient.prefs.videoContrast}"
        textSize = 14f
        setTextColor(0xFFFFFFFF.toInt())
        setPadding(0, 16, 0, 0)
    }
    val contrastSlider = SeekBar(this).apply {
        max = 200
        progress = BiliClient.prefs.videoContrast + 100
    }
    panel.addView(contrastLabel)
    panel.addView(contrastSlider)
    
    // 饱和度
    val saturationLabel = TextView(this).apply {
        text = "饱和度: ${BiliClient.prefs.videoSaturation}"
        textSize = 14f
        setTextColor(0xFFFFFFFF.toInt())
        setPadding(0, 16, 0, 0)
    }
    val saturationSlider = SeekBar(this).apply {
        max = 200
        progress = BiliClient.prefs.videoSaturation + 100
    }
    panel.addView(saturationLabel)
    panel.addView(saturationSlider)
    
    val listener = object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(sb: SeekBar?, progress: Int, fromUser: Boolean) {
            if (!fromUser) return
            val b = brightnessSlider.progress - 100
            val c = contrastSlider.progress - 100
            val s = saturationSlider.progress - 100
            brightnessLabel.text = "亮度: $b"
            contrastLabel.text = "对比度: $c"
            saturationLabel.text = "饱和度: $s"
            BiliClient.prefs.videoBrightness = b
            BiliClient.prefs.videoContrast = c
            BiliClient.prefs.videoSaturation = s
            applyVideoColorAdjustment()
        }
        override fun onStartTrackingTouch(sb: SeekBar?) {}
        override fun onStopTrackingTouch(sb: SeekBar?) {}
    }
    brightnessSlider.setOnSeekBarChangeListener(listener)
    contrastSlider.setOnSeekBarChangeListener(listener)
    saturationSlider.setOnSeekBarChangeListener(listener)
    
    // 按钮行
    val btnRow = LinearLayout(this).apply {
        orientation = LinearLayout.HORIZONTAL
        gravity = android.view.Gravity.CENTER
        setPadding(0, 16, 0, 0)
    }
    val resetBtn = TextView(this).apply {
        text = "重置"
        textSize = 14f
        setTextColor(0xFFFFFFFF.toInt())
        setBackgroundResource(R.drawable.boost_indicator_bg)
        setPadding(24, 12, 24, 12)
        setOnClickListener {
            BiliClient.prefs.videoBrightness = 0
            BiliClient.prefs.videoContrast = 0
            BiliClient.prefs.videoSaturation = 0
            brightnessSlider.progress = 100
            contrastSlider.progress = 100
            saturationSlider.progress = 100
            brightnessLabel.text = "亮度: 0"
            contrastLabel.text = "对比度: 0"
            saturationLabel.text = "饱和度: 0"
            applyVideoColorAdjustment()
            AppToast.show(this@showQuickAdjustPanel, "已重置")
        }
    }
    val closeBtn = TextView(this).apply {
        text = "关闭"
        textSize = 14f
        setTextColor(0xFFFFFFFF.toInt())
        setBackgroundResource(R.drawable.boost_indicator_bg)
        setPadding(24, 12, 24, 12)
        setOnClickListener { hideQuickAdjustPanel() }
    }
    btnRow.addView(resetBtn)
    btnRow.addView(closeBtn)
    panel.addView(btnRow)
    
    val params = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.WRAP_CONTENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    ).apply {
        gravity = android.view.Gravity.CENTER
    }
    overlay.root.addView(panel, params)
    
    panel.alpha = 0f
    panel.scaleX = 0.8f
    panel.scaleY = 0.8f
    panel.animate()
        .alpha(1f)
        .scaleX(1f)
        .scaleY(1f)
        .setDuration(200)
        .start()
}

internal fun PlayerActivity.hideQuickAdjustPanel() {
    if (!quickAdjustPanelVisible) return
    quickAdjustPanelVisible = false
    
    val overlay = requirePlayerTouchOverlayBinding(binding)
    val childCount = overlay.root.childCount
    if (childCount > 0) {
        val panel = overlay.root.getChildAt(childCount - 1)
        panel?.animate()
            ?.alpha(0f)
            ?.scaleX(0.8f)
            ?.scaleY(0.8f)
            ?.setDuration(150)
            ?.withEndAction {
                overlay.root.removeView(panel)
            }
            ?.start()
    }
}
