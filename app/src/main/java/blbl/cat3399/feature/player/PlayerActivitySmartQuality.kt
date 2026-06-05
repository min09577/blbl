package blbl.cat3399.feature.player

import android.os.Handler
import android.os.Looper
import blbl.cat3399.core.log.AppLog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

/**
 * v4.4: Smart quality monitoring based on playback buffer health.
 * Monitors buffering events and notifies user when quality should be adjusted.
 * Does not auto-switch (requires deep integration with playUrl pipeline),
 * but provides user-visible hints.
 */
internal class SmartQualityController(
    private val activity: PlayerActivity,
) {
    companion object {
        private const val TAG = "SmartQuality"
        private const val CHECK_INTERVAL_MS = 5_000L
        private const val BUFFER_THRESHOLD = 3
        private const val BUFFER_WINDOW_MS = 30_000L
        private const val STABLE_PLAYBACK_MS = 60_000L
        private const val DOWNGRADE_COOLDOWN_MS = 60_000L
        private const val UPGRADE_COOLDOWN_MS = 120_000L
    }

    private val handler = Handler(Looper.getMainLooper())
    private var enabled = false
    private val bufferEvents = mutableListOf<Long>()
    private var lastDowngradeHintTime = 0L
    private var lastUpgradeHintTime = 0L
    private var stablePlaybackStart = 0L
    private var downgradeHintShown = false

    private val checkRunnable = object : Runnable {
        override fun run() {
            if (!enabled) return
            checkHealth()
            handler.postDelayed(this, CHECK_INTERVAL_MS)
        }
    }

    fun start() {
        if (!BiliClient.prefs.playerSmartQualityEnabled) return
        enabled = true
        bufferEvents.clear()
        downgradeHintShown = false
        stablePlaybackStart = System.currentTimeMillis()
        handler.postDelayed(checkRunnable, CHECK_INTERVAL_MS)
        AppLog.d(TAG, "Smart quality monitor started")
    }

    fun stop() {
        enabled = false
        handler.removeCallbacks(checkRunnable)
        bufferEvents.clear()
    }

    fun onBufferingEvent() {
        if (!enabled) return
        val now = System.currentTimeMillis()
        bufferEvents.add(now)
        bufferEvents.removeAll { now - it > BUFFER_WINDOW_MS }
        stablePlaybackStart = now

        if (bufferEvents.size >= BUFFER_THRESHOLD && !downgradeHintShown) {
            val elapsed = now - lastDowngradeHintTime
            if (elapsed >= DOWNGRADE_COOLDOWN_MS) {
                lastDowngradeHintTime = now
                downgradeHintShown = true
                AppLog.i(TAG, "Frequent buffering detected, suggesting quality downgrade")
                activity.runOnUiThread {
                    AppToast.show(activity, "检测到频繁缓冲，建议在设置中降低画质")
                }
            }
        }
    }

    fun onPlaybackResumed() {
        if (!enabled) return
        stablePlaybackStart = System.currentTimeMillis()
    }

    private fun checkHealth() {
        val now = System.currentTimeMillis()
        bufferEvents.removeAll { now - it > BUFFER_WINDOW_MS }

        // If stable for long enough, suggest upgrade
        val stableDuration = now - stablePlaybackStart
        if (stableDuration >= STABLE_PLAYBACK_MS &&
            bufferEvents.isEmpty() &&
            downgradeHintShown &&
            now - lastUpgradeHintTime >= UPGRADE_COOLDOWN_MS
        ) {
            lastUpgradeHintTime = now
            downgradeHintShown = false
            AppLog.i(TAG, "Playback stable, suggesting quality upgrade")
            activity.runOnUiThread {
                AppToast.show(activity, "播放稳定，可尝试提升画质")
            }
        }
    }
}
