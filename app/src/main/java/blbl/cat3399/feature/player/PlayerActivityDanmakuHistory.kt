package blbl.cat3399.feature.player

import android.app.AlertDialog
import blbl.cat3399.core.ui.AppToast

/**
 * v13.11: 弹幕发送历史记录
 * 查看和管理曾经发送过的弹幕
 */

private val danmakuHistory = mutableListOf<String>()

internal fun PlayerActivity.showDanmakuHistoryDialog() {
    if (danmakuHistory.isEmpty()) {
        AppToast.show(this, "暂无弹幕发送历史")
        return
    }

    val items = danmakuHistory.toTypedArray()

    AlertDialog
        .Builder(this)
        .setTitle("弹幕发送历史 (${danmakuHistory.size}条)")
        .setItems(items) { _, which ->
            // 复制到剪贴板
            val clipboard = getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
            val clip = android.content.ClipData.newPlainText("danmaku", danmakuHistory[which])
            clipboard.setPrimaryClip(clip)
            AppToast.show(this, "已复制: ${danmakuHistory[which]}")
        }.setPositiveButton("清除历史") { _, _ ->
            danmakuHistory.clear()
            AppToast.show(this, "历史已清除")
        }.setNegativeButton("关闭", null)
        .show()
}

internal fun PlayerActivity.addDanmakuToHistory(text: String) {
    if (text.isNotBlank() && !danmakuHistory.contains(text)) {
        danmakuHistory.add(0, text)
        if (danmakuHistory.size > 50) {
            danmakuHistory.removeAt(danmakuHistory.lastIndex)
        }
    }
}
