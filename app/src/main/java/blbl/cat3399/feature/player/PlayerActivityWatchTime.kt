package blbl.cat3399.feature.player

import android.content.Context
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * v10.4: 观看时间统计
 */

internal fun PlayerActivity.initWatchTimeTracking() {
    watchTimeJob?.cancel()
    watchTimeJob = lifecycleScope.launch {
        while (isActive) {
            delay(60_000L) // Update every minute
            incrementWatchTime()
        }
    }
}

private fun PlayerActivity.incrementWatchTime() {
    val prefs = getSharedPreferences("blbl_prefs", Context.MODE_PRIVATE)
    val todayKey = "watch_time_" + SimpleDateFormat("yyyyMMdd", Locale.US).format(Date())
    val weekKey = "watch_week_" + SimpleDateFormat("wwyyyy", Locale.US).format(Date())

    prefs.edit()
        .putLong(todayKey, prefs.getLong(todayKey, 0L) + 1)
        .putLong(weekKey, prefs.getLong(weekKey, 0L) + 1)
        .putLong("watch_time_total_minutes", prefs.getLong("watch_time_total_minutes", 0L) + 1)
        .apply()
}
