package blbl.cat3399.core.tv

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager

/**
 * Screen size / device-type categorization for big-screen optimizations.
 *
 * Thresholds are based on physical screen width (dp):
 *   PHONE   < 600dp  →  standard phone layout
 *   TABLET  600-960dp →  mid-screen (foldables, small tablets)
 *   TV      960+dp    →  large-screen (TV, car infotainment, large tablet)
 *
 * When `isTvDevice()` is true the device is always classified as TV regardless of dp width.
 */
enum class ScreenClass {
    PHONE,
    TABLET,
    TV,
}

object ScreenSizer {
    private var cachedClass: ScreenClass? = null

    @Suppress("DEPRECATION")
    fun classify(ctx: Context): ScreenClass {
        cachedClass?.let { return it }

        val appCtx = ctx.applicationContext
        val class_ = if (appCtx.isTvDevice()) {
            ScreenClass.TV
        } else {
            val wm = appCtx.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val metrics = DisplayMetrics()
            wm.defaultDisplay.getRealMetrics(metrics)

            val density = metrics.density
            val widthDp = (metrics.widthPixels / density).toInt()
            val heightDp = (metrics.heightPixels / density).toInt()
            val minDp = minOf(widthDp, heightDp)

            when {
                minDp >= 960 -> ScreenClass.TV
                minDp >= 600 -> ScreenClass.TABLET
                else -> ScreenClass.PHONE
            }
        }
        cachedClass = class_
        return class_
    }

    /** Recommended grid span count for video lists. */
    fun gridSpan(ctx: Context): Int =
        when (classify(ctx)) {
            ScreenClass.TV -> 2
            ScreenClass.TABLET -> 3
            ScreenClass.PHONE -> 4
        }

    /** Recommended video-card thumbnail height (dp). */
    fun cardHeightDp(ctx: Context): Int =
        when (classify(ctx)) {
            ScreenClass.TV -> 280
            ScreenClass.TABLET -> 200
            ScreenClass.PHONE -> 140
        }

    /** Whether the device should use larger player controls. */
    fun useLargePlayerControls(ctx: Context): Boolean =
        classify(ctx) == ScreenClass.TV
}
