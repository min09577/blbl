package blbl.cat3399.feature.player

import android.view.View
import androidx.lifecycle.lifecycleScope
import blbl.cat3399.core.net.BiliClient
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.util.Locale

// ==================== v10.1: Network Speed Indicator ====================

/**
 * v10.1: 网络速度指示器
 * v10.2: 视频书签
 */

internal fun PlayerActivity.initNetworkSpeedIndicator() {
    if (!BiliClient.prefs.networkSpeedIndicatorEnabled) return
    val overlay = requirePlayerTouchOverlayBinding(binding)
    val tvSpeed = overlay.tvNetworkSpeed
    tvSpeed.visibility = View.VISIBLE
    networkSpeedJob?.cancel()
    networkSpeedJob =
        lifecycleScope.launch {
            while (isActive) {
                val bps = debug.downloadSpeedBps
                tvSpeed.text =
                    if (bps > 0) {
                        val mbps = bps * 8.0 / 1_000_000.0
                        if (mbps >= 1.0) {
                            String.format(Locale.US, "↓%.1f Mbps", mbps)
                        } else {
                            val kbps = bps * 8.0 / 1_000.0
                            String.format(Locale.US, "↓%.0f Kbps", kbps)
                        }
                    } else {
                        "↓ --"
                    }
                delay(1000)
            }
        }
}

internal fun PlayerActivity.releaseNetworkSpeedIndicator() {
    networkSpeedJob?.cancel()
    networkSpeedJob = null
}

// ==================== v10.2: Video Bookmarks ====================

private const val BOOKMARK_TOLERANCE_MS = 5000L

internal fun PlayerActivity.initBookmarkIndicator() {
    updateBookmarkIndicator()
}

internal fun PlayerActivity.updateBookmarkIndicator() {
    val overlay = requirePlayerTouchOverlayBinding(binding)
    val tvBookmark = overlay.tvBookmarkIndicator
    val bvid =
        currentBvid.ifBlank {
            tvBookmark.visibility = View.GONE
            return
        }
    val bookmarks = BiliClient.prefs.getVideoBookmarks(bvid)
    if (bookmarks.isEmpty()) {
        tvBookmark.visibility = View.GONE
        return
    }
    val currentPos = binding.playerView.player?.currentPosition ?: 0L
    val nearBookmark = bookmarks.any { kotlin.math.abs(it - currentPos) < BOOKMARK_TOLERANCE_MS }
    tvBookmark.visibility = if (nearBookmark) View.VISIBLE else View.GONE
    if (nearBookmark) {
        tvBookmark.text = "🔖 书签"
    }
}

internal fun PlayerActivity.toggleCurrentPositionBookmark() {
    val bvid = currentBvid.ifBlank { return }
    val player = binding.playerView.player ?: return
    val position = player.currentPosition
    val bookmarks = BiliClient.prefs.getVideoBookmarks(bvid)
    val existing = bookmarks.firstOrNull { kotlin.math.abs(it - position) < BOOKMARK_TOLERANCE_MS }
    if (existing != null) {
        BiliClient.prefs.removeVideoBookmark(bvid, existing)
        android.widget.Toast
            .makeText(this, "已删除书签", android.widget.Toast.LENGTH_SHORT)
            .show()
    } else {
        BiliClient.prefs.addVideoBookmark(bvid, position)
        android.widget.Toast
            .makeText(this, "已添加书签", android.widget.Toast.LENGTH_SHORT)
            .show()
    }
    updateBookmarkIndicator()
}

internal fun PlayerActivity.showBookmarksDialog() {
    val bvid = currentBvid.ifBlank { return }
    val bookmarks = BiliClient.prefs.getVideoBookmarks(bvid)
    if (bookmarks.isEmpty()) {
        android.widget.Toast
            .makeText(this, "暂无书签", android.widget.Toast.LENGTH_SHORT)
            .show()
        return
    }
    val items =
        bookmarks
            .map { ts ->
                val min = ts / 60000
                val sec = (ts % 60000) / 1000
                String.format(Locale.US, "%02d:%02d", min, sec)
            }.toTypedArray()

    android.app.AlertDialog
        .Builder(this)
        .setTitle("视频书签")
        .setItems(items) { _, which ->
            binding.playerView.player?.seekTo(bookmarks[which])
        }.setNeutralButton("清空") { _, _ ->
            BiliClient.prefs.clearVideoBookmarks(bvid)
            updateBookmarkIndicator()
            android.widget.Toast
                .makeText(this, "已清空书签", android.widget.Toast.LENGTH_SHORT)
                .show()
        }.setNegativeButton("取消", null)
        .show()
}
