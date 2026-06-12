package blbl.cat3399.feature.download

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Environment
import android.os.IBinder
import androidx.core.app.NotificationCompat
import blbl.cat3399.R
import blbl.cat3399.core.api.BiliApi
import blbl.cat3399.core.api.video.VideoPlayKind
import blbl.cat3399.core.api.video.VideoPlayRequest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream

class VideoDownloadService : Service() {
    companion object {
        const val CHANNEL_ID = "video_download"
        const val NOTIFICATION_ID = 1001
        const val EXTRA_BVID = "bvid"
        const val EXTRA_CID = "cid"
        const val EXTRA_TITLE = "title"
        const val EXTRA_PAGE = "page"
        const val EXTRA_QN = "qn"

        fun start(
            context: Context,
            bvid: String,
            cid: Long,
            title: String,
            page: String = "",
            qn: Int = 80,
        ) {
            val intent =
                Intent(context, VideoDownloadService::class.java).apply {
                    putExtra(EXTRA_BVID, bvid)
                    putExtra(EXTRA_CID, cid)
                    putExtra(EXTRA_TITLE, title)
                    putExtra(EXTRA_PAGE, page)
                    putExtra(EXTRA_QN, qn)
                }
            context.startForegroundService(intent)
        }
    }

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private var currentJob: Job? = null

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int,
    ): Int {
        val bvid = intent?.getStringExtra(EXTRA_BVID) ?: return START_NOT_STICKY
        val cid = intent.getLongExtra(EXTRA_CID, 0L)
        val title = intent.getStringExtra(EXTRA_TITLE) ?: "未知视频"
        val page = intent.getStringExtra(EXTRA_PAGE) ?: ""
        val qn = intent.getIntExtra(EXTRA_QN, 80)

        val notification = buildNotification(title, "准备下载...", 0)
        startForeground(NOTIFICATION_ID, notification)

        currentJob?.cancel()
        currentJob =
            scope.launch {
                try {
                    downloadVideo(bvid, cid, title, page, qn)
                } catch (e: Exception) {
                    updateNotification(title, "下载失败: ${e.message}", 0, true)
                } finally {
                    delay(2000)
                    stopSelf()
                }
            }

        return START_NOT_STICKY
    }

    private suspend fun downloadVideo(
        bvid: String,
        cid: Long,
        title: String,
        page: String,
        qn: Int,
    ) {
        // 1. 获取视频流URL
        updateNotification(title, "获取视频地址...", 0, false)
        val request = VideoPlayRequest(kind = VideoPlayKind.UGC, bvid = bvid, cid = cid)
        val stream = BiliApi.playUrl(request)

        if (!stream.hasPlayableStream()) {
            updateNotification(title, "无可用视频流", 0, true)
            return
        }

        // 2. 确定下载目录
        val downloadDir =
            File(
                getExternalFilesDir(Environment.DIRECTORY_MOVIES),
                "blbl_downloads",
            ).apply { mkdirs() }

        val safeTitle = title.replace(Regex("[\\\\/:*?\"<>|]"), "_")
        val suffix = if (page.isNotBlank()) "_$page" else ""

        // 3. 下载视频流（优先DASH视频轨，回退到progressive）
        val dash = stream.dash
        if (dash != null && dash.videos.isNotEmpty()) {
            // DASH: 下载视频轨 + 音频轨
            val videoTrack = dash.videos.maxByOrNull { it.qn } ?: dash.videos.first()
            val audioTrack = dash.audios.maxByOrNull { it.id } ?: dash.audios.firstOrNull()

            val videoUrl = videoTrack.urls.firstOrNull()
            if (videoUrl != null) {
                val videoFile = File(downloadDir, "${safeTitle}${suffix}_video.m4s")
                downloadFile(videoUrl, videoFile, title, "视频轨", videoTrack.info.mimeType)

                val audioUrl = audioTrack?.urls?.firstOrNull()
                if (audioUrl != null) {
                    val audioFile = File(downloadDir, "${safeTitle}${suffix}_audio.m4s")
                    downloadFile(audioUrl, audioFile, title, "音频轨", audioTrack.info.mimeType)

                    // 合并提示
                    updateNotification(title, "下载完成（视频+音频分离）", 100, false)
                    saveDownloadRecord(bvid, cid, title, page, videoFile.absolutePath, audioFile.absolutePath)
                } else {
                    updateNotification(title, "视频下载完成", 100, false)
                    saveDownloadRecord(bvid, cid, title, page, videoFile.absolutePath, null)
                }
            }
        } else if (stream.progressive.isNotEmpty()) {
            // Progressive: 直接下载
            val prog = stream.progressive.maxByOrNull { it.lengthMs ?: 0L } ?: stream.progressive.first()
            val url = prog.urls.firstOrNull()
            if (url != null) {
                val file = File(downloadDir, "${safeTitle}$suffix.mp4")
                downloadFile(url, file, title, "视频", "video/mp4")
                updateNotification(title, "下载完成", 100, false)
                saveDownloadRecord(bvid, cid, title, page, file.absolutePath, null)
            }
        } else {
            updateNotification(title, "无可用下载链接", 0, true)
        }
    }

    private suspend fun downloadFile(
        url: String,
        outputFile: File,
        title: String,
        trackName: String,
        mimeType: String?,
    ) {
        val client =
            OkHttpClient
                .Builder()
                .connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
                .readTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
                .build()
        val request =
            Request
                .Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0")
                .header("Referer", "https://www.bilibili.com/")
                .build()

        val response = client.newCall(request).execute()
        if (!response.isSuccessful) {
            throw Exception("HTTP ${response.code}")
        }

        val body = response.body ?: throw Exception("空响应")
        val totalBytes = body.contentLength()
        var downloadedBytes = 0L

        body.byteStream().use { input ->
            FileOutputStream(outputFile).use { output ->
                val buffer = ByteArray(8192)
                var bytesRead: Int
                var lastUpdate = 0L

                while (input.read(buffer).also { b: Int -> bytesRead = b } != -1) {
                    output.write(buffer, 0, bytesRead)
                    downloadedBytes += bytesRead

                    val now = System.currentTimeMillis()
                    if (now - lastUpdate > 500) {
                        val progress =
                            if (totalBytes > 0) {
                                (downloadedBytes * 100 / totalBytes).toInt()
                            } else {
                                -1
                            }
                        val sizeStr = formatSize(downloadedBytes)
                        updateNotification(title, "$trackName: $sizeStr", progress, false)
                        lastUpdate = now
                    }
                }
            }
        }
    }

    private fun saveDownloadRecord(
        bvid: String,
        cid: Long,
        title: String,
        page: String,
        videoPath: String,
        audioPath: String?,
    ) {
        val prefs = getSharedPreferences("downloads", MODE_PRIVATE)
        val records = prefs.getString("records", "[]") ?: "[]"
        val arr = org.json.JSONArray(records)
        val obj =
            org.json.JSONObject().apply {
                put("bvid", bvid)
                put("cid", cid)
                put("title", title)
                put("page", page)
                put("videoPath", videoPath)
                put("audioPath", audioPath ?: "")
                put("downloadedAt", System.currentTimeMillis())
                put("fileSize", File(videoPath).length() + (audioPath?.let { File(it).length() } ?: 0L))
            }
        arr.put(obj)
        prefs.edit().putString("records", arr.toString()).apply()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel(
                    CHANNEL_ID,
                    "视频下载",
                    NotificationManager.IMPORTANCE_LOW,
                ).apply {
                    description = "视频下载进度通知"
                }
            val nm = getSystemService(NotificationManager::class.java)
            nm.createNotificationChannel(channel)
        }
    }

    private fun buildNotification(
        title: String,
        text: String,
        progress: Int,
        isError: Boolean = false,
    ): Notification {
        val builder =
            NotificationCompat
                .Builder(this, CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher_foreground)
                .setContentTitle(title)
                .setContentText(text)
                .setOngoing(!isError)
                .setOnlyAlertOnce(true)

        if (progress > 0) {
            builder.setProgress(100, progress, false)
        } else if (progress == 0 && !isError) {
            builder.setProgress(0, 0, true)
        }

        return builder.build()
    }

    private fun updateNotification(
        title: String,
        text: String,
        progress: Int,
        isError: Boolean,
    ) {
        val nm = getSystemService(NotificationManager::class.java)
        nm.notify(NOTIFICATION_ID, buildNotification(title, text, progress, isError))
    }

    private fun formatSize(bytes: Long): String =
        when {
            bytes < 1024 -> "${bytes}B"
            bytes < 1024 * 1024 -> "${bytes / 1024}KB"
            bytes < 1024 * 1024 * 1024 -> String.format("%.1fMB", bytes / 1024.0 / 1024.0)
            else -> String.format("%.2fGB", bytes / 1024.0 / 1024.0 / 1024.0)
        }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onDestroy() {
        scope.cancel()
        super.onDestroy()
    }
}
