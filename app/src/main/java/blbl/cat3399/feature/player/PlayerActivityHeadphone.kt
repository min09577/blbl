package blbl.cat3399.feature.player

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioManager
import blbl.cat3399.core.ui.AppToast

/**
 * v7.1: 耳机断开自动暂停
 * 当蓝牙耳机断开或拔出有线耳机时自动暂停播放
 */
private var headphoneReceiver: BroadcastReceiver? = null

internal fun PlayerActivity.registerHeadphoneDisconnectReceiver() {
    if (headphoneReceiver != null) return
    headphoneReceiver =
        object : BroadcastReceiver() {
            override fun onReceive(
                context: Context?,
                intent: Intent?,
            ) {
                if (intent?.action == AudioManager.ACTION_AUDIO_BECOMING_NOISY) {
                    val engine = player ?: return
                    if (engine.playWhenReady) {
                        engine.playWhenReady = false
                        AppToast.show(this@registerHeadphoneDisconnectReceiver, "耳机已断开，自动暂停")
                    }
                }
            }
        }
    val filter = IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY)
    registerReceiver(headphoneReceiver, filter)
}

internal fun PlayerActivity.unregisterHeadphoneDisconnectReceiver() {
    headphoneReceiver?.let {
        try {
            unregisterReceiver(it)
        } catch (_: Exception) {
        }
    }
    headphoneReceiver = null
}
