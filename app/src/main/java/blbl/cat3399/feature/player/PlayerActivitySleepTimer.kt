package blbl.cat3399.feature.player

import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import blbl.cat3399.R
import blbl.cat3399.core.prefs.AppPrefs

/**
 * v46.x: Sleep timer for TV / car infotainment
 *
 * Usage:
 *   PlayerActivity.onCreate → initSleepTimer()
 *   PlayerActivity.onDestroy → releaseSleepTimer()
 *   Settings / Player overlay → toggleSleepTimer() or setSleepTimerMinutes()
 *
 * Presets: off / 15 / 30 / 60 / 90 / 120 minutes.
 * When the timer expires the player is paused and a toast is shown.
 */

private const val TAG = "SleepTimer"

/** Sleep-timer preferences stored directly (avoids bloating AppPrefs). */
object SleepTimerPrefs {
    private const val STORE = "blbl_sleep_timer"
    private const val KEY_MINUTES = "sleep_timer_minutes"
    private const val KEY_ELAPSED_MS = "sleep_timer_elapsed_ms"

    private var cachedPrefs: android.content.SharedPreferences? = null
    private var cachedMinutes: Int? = null

    fun init(activity: PlayerActivity) {
        val appCtx = activity.applicationContext
        cachedPrefs = appCtx.getSharedPreferences(STORE, android.content.Context.MODE_PRIVATE)
        cachedMinutes = cachedPrefs!!.getInt(KEY_MINUTES, 0)
    }

    var minutes: Int
        get() = cachedMinutes ?: 0
        set(value) {
            cachedMinutes = value
            cachedPrefs?.edit()?.putInt(KEY_MINUTES, value)?.apply()
        }

    var elapsedMs: Long
        get() = cachedPrefs?.getLong(KEY_ELAPSED_MS, 0L) ?: 0L
        set(value) {
            cachedPrefs?.edit()?.putLong(KEY_ELAPSED_MS, value)?.apply()
        }

    val remainingMs: Long
        get() {
            val target = minutes * 60_000L
            val remaining = target - elapsedMs
            return remaining.coerceAtLeast(0L)
        }

    val isActive: Boolean get() = minutes > 0 && remainingMs > 0
}

/** Available presets in minutes. 0 = off. */
val SLEEP_TIMER_PRESETS = intArrayOf(0, 15, 30, 60, 90, 120)

private var sleepTimerHandler: Handler? = null
private var sleepTimerRunnable: Runnable? = null
private var sleepTimerView: TextView? = null

// ── Public API ────────────────────────────────────────────

/** Call from PlayerActivity.onCreate (after setContentView). */
internal fun PlayerActivity.initSleepTimer() {
    SleepTimerPrefs.init(this)
    if (SleepTimerPrefs.isActive) startSleepTimer()
}

/** Call from PlayerActivity.onDestroy. */
internal fun PlayerActivity.releaseSleepTimer() {
    cancelSleepTimer()
    sleepTimerView?.let { v ->
        try {
            (v.parent as? android.view.ViewGroup)?.removeView(v)
        } catch (_: Throwable) {}
    }
    sleepTimerView = null
}

/** Toggle through presets: off → 15 → 30 → 60 → 90 → 120 → off. */
internal fun PlayerActivity.toggleSleepTimer() {
    val presets = SLEEP_TIMER_PRESETS
    val current = SleepTimerPrefs.minutes
    val idx = presets.indexOf(current).let { if (it < 0) 0 else it }
    val next = presets[(idx + 1) % presets.size]
    setSleepTimerMinutes(next)
}

/** Set a specific duration (0 = off). */
internal fun PlayerActivity.setSleepTimerMinutes(minutes: Int) {
    SleepTimerPrefs.minutes = minutes
    SleepTimerPrefs.elapsedMs = 0L
    cancelSleepTimer()
    if (minutes > 0) {
        startSleepTimer()
        showSleepTimerOverlay()
    } else {
        hideSleepTimerOverlay()
    }
}

// ── Internal ──────────────────────────────────────────────

private fun PlayerActivity.startSleepTimer() {
    val handler = Handler(Looper.getMainLooper())
    sleepTimerHandler = handler
    val runnable =
        object : Runnable {
            override fun run() {
                if (SleepTimerPrefs.elapsedMs > 0) {
                    SleepTimerPrefs.elapsedMs = SleepTimerPrefs.elapsedMs + 1_000L
                }
                val remaining = SleepTimerPrefs.remainingMs
                if (remaining <= 0L) {
                    onSleepTimerExpired()
                } else {
                    updateSleepTimerOverlay(remaining)
                    handler.postDelayed(this, 1_000L)
                }
            }
        }
    sleepTimerRunnable = runnable
    handler.post(runnable)
}

private fun PlayerActivity.cancelSleepTimer() {
    sleepTimerHandler?.removeCallbacks(sleepTimerRunnable ?: return)
    sleepTimerHandler = null
    sleepTimerRunnable = null
}

private fun PlayerActivity.onSleepTimerExpired() {
    cancelSleepTimer()
    SleepTimerPrefs.elapsedMs = 0L
    SleepTimerPrefs.minutes = 0
    hideSleepTimerOverlay()

    // Pause the player
    val player = this.player
    if (player != null && player.isPlaying) {
        player.pause()
    }

    // Toast notification
    android.widget.Toast.makeText(this, "💤 休眠定时器结束，播放已暂停", android.widget.Toast.LENGTH_LONG).show()
}

// ── Overlay ───────────────────────────────────────────────

private fun PlayerActivity.showSleepTimerOverlay() {
    val remaining = SleepTimerPrefs.remainingMs
    if (remaining <= 0) return

    if (sleepTimerView == null) {
        sleepTimerView =
            TextView(this).apply {
                id = View.generateViewId()
                textSize = 14f
                setTextColor(0xFFFFFFFF.toInt())
                setBackgroundResource(R.drawable.boost_indicator_bg)
                setPadding(16, 8, 16, 8)
                val params =
                    LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                    ).apply {
                        gravity = Gravity.TOP or Gravity.END
                        topMargin = 78
                        marginEnd = 16
                    }
                layoutParams = params
            }

        try {
            val overlay = requirePlayerTouchOverlayBinding(binding)
            overlay.root.addView(sleepTimerView)
        } catch (_: Throwable) {
            // view not ready — will be added on next update
        }
    }

    updateSleepTimerOverlay(remaining)
    sleepTimerView?.visibility = View.VISIBLE
}

private fun updateSleepTimerOverlay(remainingMs: Long) {
    val v = sleepTimerView ?: return
    val totalSec = (remainingMs / 1000).toInt()
    val h = totalSec / 3600
    val m = (totalSec % 3600) / 60
    val s = totalSec % 60
    v.text =
        if (h > 0) "💤 休眠 %d:%02d:%02d".format(h, m, s)
        else "💤 休眠 %02d:%02d".format(m, s)
}

private fun hideSleepTimerOverlay() {
    sleepTimerView?.visibility = View.GONE
}
