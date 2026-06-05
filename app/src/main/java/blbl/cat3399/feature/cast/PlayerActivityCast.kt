package blbl.cat3399.feature.cast

import android.view.View
import androidx.lifecycle.lifecycleScope
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.core.ui.popup.PopupAction
import blbl.cat3399.core.ui.popup.PopupActionRole
import blbl.cat3399.databinding.ActivityPlayerBinding
import blbl.cat3399.feature.player.PlayerActivity
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * v4.13: DLNA投屏支持
 * v5.1: 投屏增强 - 音量控制+进度显示+自动重连+断开重连
 */

private var castProgressJob: Job? = null
private var castReconnectJob: Job? = null
private var lastCastDevice: DlnaHelper.DlnaDevice? = null
private var lastCastUrl: String? = null
private var lastCastTitle: String? = null

/** 从 PlayerActivity 外部设置当前播放URL（供投屏使用） */
private var playerCastUrl: String? = null
private var playerCastTitle: String? = null

fun PlayerActivity.setCastSource(url: String, title: String = "BLBL投屏") {
    playerCastUrl = url
    playerCastTitle = title
}

fun PlayerActivity.initCastButton(binding: ActivityPlayerBinding) {
    binding.btnCast.setOnClickListener {
        lifecycleScope.launch {
            showCastDeviceDialog()
        }
    }
    // 长按断开投屏
    binding.btnCast.setOnLongClickListener {
        if (DlnaHelper.currentDevice != null) {
            stopCast()
            AppToast.show(this, "已断开投屏")
        } else {
            AppToast.show(this, "未在投屏中")
        }
        true
    }
}

// v6.12: 获取上次投屏设备
private fun getLastCastDevice(): DlnaHelper.DlnaDevice? {
    return lastCastDevice
}

private suspend fun PlayerActivity.showCastDeviceDialog() {
    // 如果已在投屏，显示控制选项
    if (DlnaHelper.currentDevice != null) {
        showCastControlDialog()
        return
    }

    // v6.12: 如果有上次投屏设备，直接显示快速重连选项
    val lastDevice = getLastCastDevice()
    if (lastDevice != null) {
        val actions = listOf(
            PopupAction(role = PopupActionRole.POSITIVE, text = "📺 重新投屏到 ${lastDevice.friendlyName}") {
                startCast(lastDevice)
            },
            PopupAction(role = PopupActionRole.POSITIVE, text = "🔍 搜索新设备") {
                lifecycleScope.launch { searchAndShowCastDevices() }
            },
            PopupAction(role = PopupActionRole.NEGATIVE, text = "取消"),
        )
        AppPopup.custom(
            context = this,
            title = "投屏",
            cancelable = true,
            actions = actions,
            preferredActionRole = PopupActionRole.POSITIVE,
            content = { dialogContext ->
                android.widget.TextView(dialogContext).apply {
                    text = "上次投屏: ${lastDevice.friendlyName}"
                    setPadding(48, 32, 48, 32)
                    textSize = 14f
                }
            },
        )
        return
    }

    searchAndShowCastDevices()
}

private suspend fun PlayerActivity.searchAndShowCastDevices() {

    val devices = try {
        DlnaHelper.discoverDevices(3000)
    } catch (e: Exception) {
        AppToast.show(this, "搜索失败: ${e.message}")
        emptyList()
    }

    if (devices.isEmpty()) {
        AppToast.show(this, "未找到投屏设备")
        return
    }

    val actions = devices.map { device ->
        PopupAction(
            role = PopupActionRole.POSITIVE,
            text = device.friendlyName,
            onClick = { startCast(device) },
        )
    } + PopupAction(role = PopupActionRole.NEGATIVE, text = "取消")

    AppPopup.custom(
        context = this,
        title = "选择投屏设备",
        cancelable = true,
        actions = actions,
        preferredActionRole = PopupActionRole.POSITIVE,
        content = { dialogContext ->
            android.widget.TextView(dialogContext).apply {
                text = "找到 ${devices.size} 个设备"
                setPadding(48, 32, 48, 32)
                textSize = 14f
            }
        },
    )
}

/** 投屏中控制面板 */
private suspend fun PlayerActivity.showCastControlDialog() {
    val device = DlnaHelper.currentDevice ?: return
    val actions = listOf(
        PopupAction(role = PopupActionRole.POSITIVE, text = "🔊 音量80%") {
            lifecycleScope.launch { try { DlnaHelper.setVolume(device, 80) } catch (_: Exception) {} }
        },
        PopupAction(role = PopupActionRole.POSITIVE, text = "🔉 音量30%") {
            lifecycleScope.launch { try { DlnaHelper.setVolume(device, 30) } catch (_: Exception) {} }
        },
        PopupAction(role = PopupActionRole.POSITIVE, text = "⏹ 断开投屏") {
            stopCast()
            AppToast.show(this, "已断开投屏")
        },
        PopupAction(role = PopupActionRole.NEGATIVE, text = "取消"),
    )

    AppPopup.custom(
        context = this,
        title = "投屏: ${device.friendlyName}",
        cancelable = true,
        actions = actions,
        preferredActionRole = PopupActionRole.POSITIVE,
        content = { dialogContext ->
            android.widget.TextView(dialogContext).apply {
                text = "投屏中..."
                setPadding(48, 32, 48, 32)
                textSize = 14f
            }
        },
    )
}

private fun PlayerActivity.startCast(device: DlnaHelper.DlnaDevice) {
    lifecycleScope.launch {
        try {
            val url = playerCastUrl
            if (url.isNullOrBlank()) {
                AppToast.show(this@startCast, "无法获取播放地址，请先播放视频")
                return@launch
            }
            val title = playerCastTitle ?: "BLBL投屏"

            DlnaHelper.setAVTransportURI(device, url, title)
            DlnaHelper.play(device)

            lastCastDevice = device
            lastCastUrl = url
            lastCastTitle = title

            // v12.4: 保存投屏URL到SharedPreferences供设置使用
            getSharedPreferences("player_cast_url", android.content.Context.MODE_PRIVATE)
                .edit()
                .putString("url", url)
                .putString("title", title)
                .apply()

            AppToast.show(this@startCast, "已投屏到 ${device.friendlyName}")

            // 启动进度同步
            startCastProgressSync(device)

            // 更新按钮状态
            updateCastButtonState(true)

        } catch (e: Exception) {
            AppToast.show(this@startCast, "投屏失败: ${e.message}")
            // 自动重连
            startCastReconnect()
        }
    }
}

private fun PlayerActivity.stopCast() {
    castProgressJob?.cancel()
    castProgressJob = null
    castReconnectJob?.cancel()
    castReconnectJob = null

    lifecycleScope.launch {
        try {
            DlnaHelper.currentDevice?.let { DlnaHelper.stop(it) }
        } catch (_: Exception) {}
        lastCastDevice = null
        lastCastUrl = null
        lastCastTitle = null
        updateCastButtonState(false)
    }
}

/** 启动投屏进度同步 - 每3秒获取一次远端播放进度 */
private fun PlayerActivity.startCastProgressSync(device: DlnaHelper.DlnaDevice) {
    castProgressJob?.cancel()
    castProgressJob = lifecycleScope.launch {
        while (true) {
            delay(3000)
            try {
                val info = DlnaHelper.getPositionInfo(device)
                if (info != null) {
                    // 检查是否播放结束
                    if (info.currentPos >= info.duration && info.duration > 0) {
                        AppToast.show(this@startCastProgressSync, "投屏播放结束")
                        stopCast()
                        break
                    }
                }
            } catch (e: Exception) {
                // 连接断开，尝试重连
                startCastReconnect()
                break
            }
        }
    }
}

/** 自动重连 - 最多重试3次 */
private fun PlayerActivity.startCastReconnect() {
    castReconnectJob?.cancel()
    castReconnectJob = lifecycleScope.launch {
        val device = lastCastDevice ?: return@launch
        val url = lastCastUrl ?: return@launch
        val title = lastCastTitle ?: "BLBL投屏"

        repeat(3) { attempt ->
            delay(2000L * (attempt + 1))
            try {
                DlnaHelper.setAVTransportURI(device, url, title)
                DlnaHelper.play(device)
                AppToast.show(this@startCastReconnect, "投屏重连成功")
                startCastProgressSync(device)
                return@launch
            } catch (_: Exception) {}
        }
        AppToast.show(this@startCastReconnect, "投屏重连失败，请重新连接")
        stopCast()
    }
}

/** 更新投屏按钮视觉状态 */
private fun PlayerActivity.updateCastButtonState(isCasting: Boolean) {
    try {
        val binding = blbl.cat3399.databinding.ActivityPlayerBinding.bind(window.decorView)
        binding.btnCast.alpha = if (isCasting) 1.0f else 0.6f
    } catch (_: Exception) {}
}
