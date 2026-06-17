// Copyright: AI-maintained extension for cat3399/blbl
package blbl.cat3399.feature.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.RemoteViews
import blbl.cat3399.R

/**
 * Lock-screen / home-screen danmaku widget.
 *
 * Displays bilibili-style scrolling danmaku text that updates periodically.
 * Uses WorkManager for background refresh (respects Doze / battery optimisations).
 */
class DanmakuWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(
        ctx: Context,
        mgr: AppWidgetManager,
        ids: IntArray,
    ) {
        for (id in ids) {
            updateWidget(ctx, mgr, id, DanmakuWidgetPool.randomText(ctx))
        }
    }

    override fun onDeleted(
        ctx: Context,
        ids: IntArray,
    ) {
        DanmakuWidgetWorker.cancel(ctx)
    }

    override fun onDisabled(ctx: Context) {
        DanmakuWidgetWorker.cancel(ctx)
    }

    companion object {
        internal const val ACTION_DANMAKU_UPDATE = "blbl.cat3399.action.DANMAKU_UPDATE"

        fun updateWidget(
            ctx: Context,
            mgr: AppWidgetManager,
            id: Int,
            text: String,
        ) {
            val views =
                RemoteViews(ctx.packageName, R.layout.danmaku_widget_layout).apply {
                    setTextViewText(R.id.tv_danmaku, text)
                    setInt(R.id.tv_danmaku, "setBackgroundColor", 0x22000000)
                }

            val clickIntent =
                Intent(ctx, DanmakuWidgetProvider::class.java).apply {
                    action = AppWidgetManager.ACTION_APPWIDGET_UPDATE
                    putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, intArrayOf(id))
                }
            val updateFlags =
                PendingIntent.FLAG_UPDATE_CURRENT or
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                        PendingIntent.FLAG_MUTABLE
                    } else {
                        0
                    }
            val pending =
                PendingIntent.getBroadcast(
                    ctx,
                    id,
                    clickIntent,
                    updateFlags,
                )
            views.setOnClickPendingIntent(R.id.tv_danmaku, pending)

            mgr.updateAppWidget(id, views)
        }
    }
}
