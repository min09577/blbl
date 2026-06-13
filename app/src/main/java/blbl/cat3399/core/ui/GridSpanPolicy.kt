package blbl.cat3399.core.ui

import android.content.Context
import blbl.cat3399.core.tv.ScreenSizer

object GridSpanPolicy {
    private const val MIN_SPAN = 1
    private const val MAX_SPAN = 6

    /**
     * Returns the recommended grid span count for the given screen width.
     *
     * TV devices detected via [ScreenSizer] get fewer columns with larger cards
     * for comfortable couch-distance viewing.
     */
    fun fixedSpanCountForWidthDp(
        widthDp: Float,
        overrideSpanCount: Int,
    ): Int {
        if (overrideSpanCount > 0) return overrideSpanCount.coerceIn(MIN_SPAN, MAX_SPAN)
        return when {
            isTvLayout -> when {
                widthDp >= 1600f -> 3
                else -> 2
            }
            widthDp >= 1100f -> 4
            widthDp >= 800f -> 3
            else -> 2
        }
    }

    /**
     * Per-process TV-layout flag. Call [init] once with a Context to enable
     * TV-aware grid spans; without it the policy behaves as before (phone-optimised).
     */
    private var isTvLayout: Boolean = false

    fun init(ctx: Context) {
        isTvLayout = ScreenSizer.classify(ctx) == ScreenSizer.ScreenClass.TV
    }

    fun dynamicSpanCountForWidthDp(
        widthDp: Float,
        dynamicOverrideSpanCount: Int,
        globalOverrideSpanCount: Int,
    ): Int {
        if (dynamicOverrideSpanCount > 0) return dynamicOverrideSpanCount.coerceIn(MIN_SPAN, MAX_SPAN)
        return fixedSpanCountForWidthDp(widthDp = widthDp, overrideSpanCount = globalOverrideSpanCount)
    }

    fun autoSpanCountForWidthDp(
        widthDp: Float,
        overrideSpanCount: Int,
        uiScale: Float,
        minCardWidthDp: Float = 210f,
        minSpan: Int = 2,
        maxSpan: Int = MAX_SPAN,
    ): Int {
        if (overrideSpanCount > 0) return overrideSpanCount.coerceIn(MIN_SPAN, MAX_SPAN)
        val minWidthDp = minCardWidthDp * uiScale
        val raw = (widthDp / minWidthDp).toInt()
        return raw.coerceIn(minSpan, maxSpan)
    }
}
