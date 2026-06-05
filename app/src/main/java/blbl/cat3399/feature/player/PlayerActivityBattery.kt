package blbl.cat3399.feature.player

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.view.View
import blbl.cat3399.core.net.BiliClient

/**
 * v12.12: 播放器电池电量显示
 */

private var batteryReceiver: BroadcastReceiver? = null

internal fun PlayerActivity.initBatteryIndicator() {
    if (!BiliClient.prefs.playerBatteryIndicatorEnabled) return
    val overlay = requirePlayerTouchOverlayBinding(binding)
    val tvBattery = overlay.tvBatteryIndicator
    tvBattery.visibility = View.VISIBLE

    batteryReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent == null) return
            val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
            val scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
            if (level < 0 || scale <= 0) return
            val pct = (level * 100 / scale)
            val charging = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1) ==
                BatteryManager.BATTERY_STATUS_CHARGING
            val icon = when {
                charging -> "⚡"
                pct >= 80 -> "🔋"
                pct >= 50 -> "🔋"
                pct >= 20 -> "🪫"
                else -> "🪫"
            }
            tvBattery.text = "$icon $pct%"
        }
    }
    val filter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
    registerReceiver(batteryReceiver, filter)
}

internal fun PlayerActivity.releaseBatteryIndicator() {
    batteryReceiver?.let {
        try { unregisterReceiver(it) } catch (_: Exception) {}
    }
    batteryReceiver = null
}
