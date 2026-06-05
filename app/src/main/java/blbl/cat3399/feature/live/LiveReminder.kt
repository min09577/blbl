package blbl.cat3399.feature.live

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import blbl.cat3399.R
import blbl.cat3399.ui.MainActivity
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

/**
 * v4.14: 直播预约提醒
 * 使用 AlarmManager + BroadcastReceiver，无需额外依赖
 */
object LiveReminder {

    private const val CHANNEL_ID = "live_reminder"
    private const val PREFS_NAME = "live_reminders"
    private const val KEY_REMINDERS = "reminders"

    data class Reminder(
        val roomId: Long,
        val roomTitle: String,
        val upName: String,
        val scheduledTimeMs: Long,
        val createdAtMs: Long = System.currentTimeMillis(),
    ) {
        val notificationId: Int get() = (roomId % Int.MAX_VALUE).toInt()
    }

    fun initChannel(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "直播提醒",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "直播开播提醒通知"
            }
            val nm = context.getSystemService(NotificationManager::class.java)
            nm.createNotificationChannel(channel)
        }
    }

    /**
     * 添加预约提醒
     */
    fun addReminder(context: Context, reminder: Reminder): Boolean {
        val reminders = getAllReminders(context).toMutableList()
        if (reminders.any { it.roomId == reminder.roomId && it.scheduledTimeMs == reminder.scheduledTimeMs }) {
            return false // 已存在
        }
        reminders.add(reminder)
        saveReminders(context, reminders)
        scheduleAlarm(context, reminder)
        return true
    }

    /**
     * 取消预约
     */
    fun removeReminder(context: Context, roomId: Long) {
        val reminders = getAllReminders(context).toMutableList()
        val removed = reminders.filter { it.roomId == roomId }
        reminders.removeAll { it.roomId == roomId }
        saveReminders(context, reminders)

        val am = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        removed.forEach { reminder ->
            val intent = Intent(context, LiveReminderReceiver::class.java)
            val pi = PendingIntent.getBroadcast(
                context,
                reminder.notificationId,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
            )
            am.cancel(pi)
        }
    }

    /**
     * 获取所有预约
     */
    fun getAllReminders(context: Context): List<Reminder> {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val json = prefs.getString(KEY_REMINDERS, "[]") ?: "[]"
        val arr = JSONArray(json)
        val result = mutableListOf<Reminder>()
        for (i in 0 until arr.length()) {
            val obj = arr.getJSONObject(i)
            result.add(
                Reminder(
                    roomId = obj.getLong("roomId"),
                    roomTitle = obj.optString("roomTitle", ""),
                    upName = obj.optString("upName", ""),
                    scheduledTimeMs = obj.getLong("scheduledTimeMs"),
                    createdAtMs = obj.optLong("createdAtMs", System.currentTimeMillis()),
                )
            )
        }
        return result
    }

    /**
     * 检查是否已预约
     */
    fun isReminderSet(context: Context, roomId: Long): Boolean {
        return getAllReminders(context).any { it.roomId == roomId }
    }

    private fun saveReminders(context: Context, reminders: List<Reminder>) {
        val arr = JSONArray()
        reminders.forEach { r ->
            arr.put(JSONObject().apply {
                put("roomId", r.roomId)
                put("roomTitle", r.roomTitle)
                put("upName", r.upName)
                put("scheduledTimeMs", r.scheduledTimeMs)
                put("createdAtMs", r.createdAtMs)
            })
        }
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_REMINDERS, arr.toString())
            .apply()
    }

    private fun scheduleAlarm(context: Context, reminder: Reminder) {
        val am = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(context, LiveReminderReceiver::class.java).apply {
            putExtra("roomId", reminder.roomId)
            putExtra("roomTitle", reminder.roomTitle)
            putExtra("upName", reminder.upName)
        }
        val pi = PendingIntent.getBroadcast(
            context,
            reminder.notificationId,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )

        // 提前1分钟提醒
        val triggerTime = reminder.scheduledTimeMs - 60_000
        if (triggerTime > System.currentTimeMillis()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerTime, pi)
            } else {
                am.setExact(AlarmManager.RTC_WAKEUP, triggerTime, pi)
            }
        }
    }

    fun sendNotificationNow(context: Context, roomId: Long, roomTitle: String, upName: String) {
        val nm = context.getSystemService(NotificationManager::class.java)
        val intent = Intent(context, MainActivity::class.java).apply {
            putExtra("liveRoomId", roomId)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        val pi = PendingIntent.getActivity(
            context,
            roomId.toInt(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher_foreground)
            .setContentTitle("$upName 开播了！")
            .setContentText(roomTitle)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pi)
            .build()
        nm.notify(roomId.toInt(), notification)
    }
}

/**
 * AlarmManager 触发的广播接收器
 */
class LiveReminderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val roomId = intent.getLongExtra("roomId", 0)
        val roomTitle = intent.getStringExtra("roomTitle") ?: ""
        val upName = intent.getStringExtra("upName") ?: ""

        if (roomId > 0) {
            LiveReminder.sendNotificationNow(context, roomId, roomTitle, upName)
            // 发送通知后自动移除提醒
            LiveReminder.removeReminder(context, roomId)
        }
    }
}
