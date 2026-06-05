package blbl.cat3399.feature.player

import android.app.AlertDialog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v13.1: 播放器手势自定义
 * 支持自定义双击左/右/中区域的动作
 */

enum class GestureAction(val label: String, val icon: String) {
    NONE("无操作", "❌"),
    SEEK_BACK_10("快退10秒", "⏪"),
    SEEK_FORWARD_10("快进10秒", "⏩"),
    SEEK_BACK_30("快退30秒", "⏪"),
    SEEK_FORWARD_30("快进30秒", "⏩"),
    TOGGLE_PLAY_PAUSE("播放/暂停", "⏯"),
    TOGGLE_DANMAKU("弹幕开关", "💬"),
    SCREENSHOT("截图", "📷"),
    TOGGLE_MIRROR("镜像切换", "🪞"),
    TOGGLE_ROTATION("旋转切换", "🔄"),
    SHOW_STATS("播放统计", "📊"),
    SHOW_SETTINGS("设置面板", "⚙️"),
}

internal fun PlayerActivity.showGestureCustomizationDialog() {
    val items = GestureAction.entries.map { "${it.icon} ${it.label}" }.toTypedArray()
    
    // 双击左侧
    val leftIndex = BiliClient.prefs.gestureDoubleTapLeft
    val centerIndex = BiliClient.prefs.gestureDoubleTapCenter
    val rightIndex = BiliClient.prefs.gestureDoubleTapRight
    
    val layout = android.widget.LinearLayout(this).apply {
        orientation = android.widget.LinearLayout.VERTICAL
        setPadding(48, 24, 48, 0)
    }
    
    val leftLabel = android.widget.TextView(this).apply {
        text = "双击左侧: ${GestureAction.entries.getOrElse(leftIndex) { GestureAction.SEEK_BACK_10 }.label}"
        textSize = 14f
        setPadding(0, 16, 0, 8)
    }
    val centerLabel = android.widget.TextView(this).apply {
        text = "双击中间: ${GestureAction.entries.getOrElse(centerIndex) { GestureAction.TOGGLE_PLAY_PAUSE }.label}"
        textSize = 14f
        setPadding(0, 16, 0, 8)
    }
    val rightLabel = android.widget.TextView(this).apply {
        text = "双击右侧: ${GestureAction.entries.getOrElse(rightIndex) { GestureAction.SEEK_FORWARD_10 }.label}"
        textSize = 14f
        setPadding(0, 16, 0, 8)
    }
    
    layout.addView(leftLabel)
    layout.addView(centerLabel)
    layout.addView(rightLabel)
    
    leftLabel.setOnClickListener {
        AlertDialog.Builder(this)
            .setTitle("双击左侧动作")
            .setSingleChoiceItems(items, leftIndex) { d, which ->
                BiliClient.prefs.gestureDoubleTapLeft = which
                leftLabel.text = "双击左侧: ${GestureAction.entries[which].label}"
                d.dismiss()
            }
            .show()
    }
    
    centerLabel.setOnClickListener {
        AlertDialog.Builder(this)
            .setTitle("双击中间动作")
            .setSingleChoiceItems(items, centerIndex) { d, which ->
                BiliClient.prefs.gestureDoubleTapCenter = which
                centerLabel.text = "双击中间: ${GestureAction.entries[which].label}"
                d.dismiss()
            }
            .show()
    }
    
    rightLabel.setOnClickListener {
        AlertDialog.Builder(this)
            .setTitle("双击右侧动作")
            .setSingleChoiceItems(items, rightIndex) { d, which ->
                BiliClient.prefs.gestureDoubleTapRight = which
                rightLabel.text = "双击右侧: ${GestureAction.entries[which].label}"
                d.dismiss()
            }
            .show()
    }
    
    AlertDialog.Builder(this)
        .setTitle("手势自定义")
        .setView(layout)
        .setPositiveButton("确定", null)
        .setNeutralButton("重置默认") { _, _ ->
            BiliClient.prefs.gestureDoubleTapLeft = GestureAction.SEEK_BACK_10.ordinal
            BiliClient.prefs.gestureDoubleTapCenter = GestureAction.TOGGLE_PLAY_PAUSE.ordinal
            BiliClient.prefs.gestureDoubleTapRight = GestureAction.SEEK_FORWARD_10.ordinal
            AppToast.show(this, "手势已重置为默认")
        }
        .show()
}

internal fun PlayerActivity.executeGestureAction(actionIndex: Int) {
    val action = GestureAction.entries.getOrElse(actionIndex) { GestureAction.NONE }
    val engine = player ?: return
    when (action) {
        GestureAction.NONE -> {}
        GestureAction.SEEK_BACK_10 -> {
            val newPos = (engine.currentPosition - 10000).coerceAtLeast(0)
            engine.seekTo(newPos)
        }
        GestureAction.SEEK_FORWARD_10 -> {
            val newPos = (engine.currentPosition + 10000).coerceAtMost(engine.duration)
            engine.seekTo(newPos)
        }
        GestureAction.SEEK_BACK_30 -> {
            val newPos = (engine.currentPosition - 30000).coerceAtLeast(0)
            engine.seekTo(newPos)
        }
        GestureAction.SEEK_FORWARD_30 -> {
            val newPos = (engine.currentPosition + 30000).coerceAtMost(engine.duration)
            engine.seekTo(newPos)
        }
        GestureAction.TOGGLE_PLAY_PAUSE -> {
            binding.btnPlayPause.performClick()
        }
        GestureAction.TOGGLE_DANMAKU -> {
            setDanmakuEnabled(!session.danmaku.enabled)
        }
        GestureAction.SCREENSHOT -> {
            // 截图功能通过现有按钮触发
            try {
                val btn = binding.root.findViewById<android.view.View>(blbl.cat3399.R.id.btn_screenshot)
                btn?.performClick()
            } catch (_: Throwable) {}
        }
        GestureAction.TOGGLE_MIRROR -> {
            val current = session.videoMirror
            val next = (current + 1) % 3
            applyVideoMirror(next)
        }
        GestureAction.TOGGLE_ROTATION -> {
            val current = session.videoRotation
            val next = (current + 90) % 360
            applyVideoRotation(next)
        }
        GestureAction.SHOW_STATS -> {
            showPlaybackStatsDialog()
        }
        GestureAction.SHOW_SETTINGS -> {
            toggleSettingsPanel()
        }
    }
}
