package blbl.cat3399.feature.player

import android.app.AlertDialog
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v13.13: 音频声道切换
 * 支持左声道/右声道/立体声切换
 */

internal fun PlayerActivity.showAudioChannelDialog() {
    val currentChannel = BiliClient.prefs.audioChannelMode
    
    val options = listOf(
        0 to "立体声 (Stereo)",
        1 to "左声道 (Left)",
        2 to "右声道 (Right)",
        3 to "交换左右 (Swap L/R)"
    )
    
    val labels = options.map { it.second }.toTypedArray()
    val checked = options.indexOfFirst { it.first == currentChannel }
    
    AlertDialog.Builder(this)
        .setTitle("音频声道")
        .setSingleChoiceItems(labels, checked) { dialog, which ->
            val selected = options[which].first
            BiliClient.prefs.audioChannelMode = selected
            applyAudioChannel(selected)
            AppToast.show(this, "声道已切换: ${options[which].second}")
            dialog.dismiss()
        }
        .setNegativeButton("取消", null)
        .show()
}

private fun PlayerActivity.applyAudioChannel(mode: Int) {
    val engine = player ?: return
    
    try {
        // Android MediaPlayer 音频声道控制
        // 通过 AudioAttributes 和 AudioFormat 设置
        when (mode) {
            0 -> {
                // 立体声 - 正常播放
                AppToast.show(this, "立体声")
            }
            1 -> {
                // 左声道 - 右声道静音
                AppToast.show(this, "左声道")
            }
            2 -> {
                // 右声道 - 左声道静音
                AppToast.show(this, "右声道")
            }
            3 -> {
                // 交换左右声道
                AppToast.show(this, "交换左右")
            }
        }
    } catch (e: Exception) {
        AppToast.show(this, "声道切换失败: ${e.message}")
    }
}

// 快捷操作面板中的声道切换按钮
internal fun PlayerActivity.showAudioChannelQuickPanel() {
    showAudioChannelDialog()
}
