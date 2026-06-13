package blbl.cat3399.core.ui

import android.content.Context
import blbl.cat3399.core.tv.ScreenSizer

object GridSpanPolicy {
    private const val MIN_SPAN = 1
    private const val MAX_SPAN = 6

    /**
     * Returns the recommended grid span count for the given screen width.
     *
     * When [tvLayout] is true the layout is optimised for TV/car big screens —
     * fewer columns with larger cards for comfortable couch-distance viewing.
     */
    fun fixedSpanCountForWidthDp(
        widthDp: Float,
        overrideSpanCount: Int,
        tvLayout: Boolean = false,
    ): Int {
        if (overrideSpanCount > 0) return overrideSpanCount.coerceIn(MIN_SPAN, MAX_SPAN)
        return when {
            tvLayout -> when {
                widthDp >= 1600f -> 3   // 4K TV
                else -> 2               // 1080p TV / car screen
            }
            widthDp >= 1100f -> 4
            widthDp >= 800f -> 3
            else -> 2
        }
    }

    /** Context-aware variant that auto-detects TV mode via [ScreenSizer]. */
    fun fixedSpanCountForContext(
        ctx: Context,
        widthDp: Float,
        overrideSpanCount: Int,
    ): Int = fixedSpanCountForWidthDp(
        widthDp = widthDp,
        overrideSpanCount = overrideSpanCount,
        tvLayout = ScreenSizer.classify(ctx) == blbl.cat3399.core.tv.ScreenClass.TV,
    )

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
