// Copyright: AI-maintained extension for cat3399/blbl
package blbl.cat3399.feature.widget

import android.content.Context
import androidx.work.BackoffPolicy
import androidx.work.Constraints
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.NetworkType
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.util.concurrent.TimeUnit

/**
 * Background worker that refreshes the danmaku widget text & schedules the next update.
 */
class DanmakuWidgetWorker(
    ctx: Context,
    params: WorkerParameters,
) : Worker(ctx, params) {
    override fun doWork(): Result {
        val mgr = android.appwidget.AppWidgetManager.getInstance(applicationContext)
        val ids =
            mgr.getAppWidgetIds(
                android.content.ComponentName(
                    applicationContext,
                    DanmakuWidgetProvider::class.java,
                ),
            )
        if (ids.isEmpty()) return Result.success()

        for (id in ids) {
            val text = DanmakuWidgetPool.randomText(applicationContext)
            DanmakuWidgetProvider.updateWidget(applicationContext, mgr, id, text)
        }
        return Result.success()
    }

    companion object {
        private const val WORK_NAME = "danmaku-widget-refresh"

        fun schedule(ctx: Context) {
            val work =
                PeriodicWorkRequestBuilder<DanmakuWidgetWorker>(
                    30,
                    TimeUnit.MINUTES,
                ).setConstraints(
                    Constraints
                        .Builder()
                        .setRequiredNetworkType(NetworkType.NOT_REQUIRED)
                        .build(),
                ).setBackoffCriteria(BackoffPolicy.LINEAR, 2, TimeUnit.MINUTES)
                    .build()
            WorkManager
                .getInstance(ctx)
                .enqueueUniquePeriodicWork(
                    WORK_NAME,
                    ExistingPeriodicWorkPolicy.UPDATE,
                    work,
                )
        }

        fun cancel(ctx: Context) {
            WorkManager.getInstance(ctx).cancelUniqueWork(WORK_NAME)
        }
    }
}
