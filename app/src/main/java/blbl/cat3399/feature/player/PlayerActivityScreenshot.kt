package blbl.cat3399.feature.player

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.view.PixelCopy
import android.view.View
import android.view.Window
import androidx.lifecycle.lifecycleScope
import blbl.cat3399.core.log.AppLog
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.io.File
import java.io.FileOutputStream
import kotlin.coroutines.resume

/**
 * v4.4: Screenshot capture and share functionality
 */
internal fun PlayerActivity.initScreenshotButton() {
    binding.btnScreenshot?.apply {
        visibility = View.VISIBLE
        setOnClickListener { captureAndShareScreenshot() }
    }
}

private fun PlayerActivity.captureAndShareScreenshot() {
    val engine = player
    if (engine == null) {
        AppToast.show(this, "播放器未就绪")
        return
    }

    // Hide OSD to capture clean frame
    setControlsVisible(false)

    binding.root.postDelayed({
        lifecycleScope.launch {
            try {
                val bitmap = captureVideoFrame()
                if (bitmap == null) {
                    AppToast.show(this@captureAndShareScreenshot, "截图失败")
                    return@launch
                }

                val uri = saveScreenshot(bitmap)
                if (uri == null) {
                    AppToast.show(this@captureAndShareScreenshot, "保存截图失败")
                    return@launch
                }

                AppToast.show(this@captureAndShareScreenshot, "截图已保存")
                // v12.9: 显示截图预览和操作选项
                showScreenshotPreview(uri, bitmap)
            } catch (e: Exception) {
                AppToast.show(this@captureAndShareScreenshot, "截图失败: ${e.message}")
            }
        }
    }, 200)
}

// v12.9: 截图预览和操作选项
private fun PlayerActivity.showScreenshotPreview(
    uri: Uri,
    bitmap: Bitmap,
) {
    val previewSize = 240
    val scale = minOf(previewSize.toFloat() / bitmap.width, previewSize.toFloat() / bitmap.height)
    val scaledW = (bitmap.width * scale).toInt()
    val scaledH = (bitmap.height * scale).toInt()
    val previewBitmap = Bitmap.createScaledBitmap(bitmap, scaledW, scaledH, true)

    val imageView =
        android.widget.ImageView(this).apply {
            setImageBitmap(previewBitmap)
            setPadding(24, 16, 24, 8)
            adjustViewBounds = true
            maxHeight = previewSize
        }

    androidx.appcompat.app.AlertDialog
        .Builder(this)
        .setTitle("截图已保存")
        .setView(imageView)
        .setPositiveButton("分享") { _, _ -> shareScreenshot(uri) }
        .setNeutralButton("删除") { _, _ -> deleteScreenshot(uri) }
        .setNegativeButton("关闭", null)
        .show()
}

// v12.9: 删除截图
private fun PlayerActivity.deleteScreenshot(uri: Uri) {
    try {
        contentResolver.delete(uri, null, null)
        AppToast.show(this, "截图已删除")
    } catch (e: Exception) {
        AppToast.show(this, "删除失败: ${e.message}")
    }
}

private suspend fun PlayerActivity.captureVideoFrame(): Bitmap? {
    // Method 1: PixelCopy (API 26+) — correctly captures SurfaceView content
    // The app uses surface_type="surface_view", so TextureView.bitmap and drawingCache
    // cannot capture the video layer. PixelCopy is the correct approach.
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        try {
            val bitmap = pixelCopyWindow(window)
            if (bitmap != null) return bitmap
        } catch (e: Exception) {
            AppLog.d("Screenshot", "PixelCopy failed: ${e.message}")
        }
    }

    // Method 2: Try TextureView (only works if surface_type is texture_view)
    try {
        val textureView = binding.playerView.videoSurfaceView as? android.view.TextureView
        if (textureView != null) {
            return textureView.bitmap
        }
    } catch (_: Exception) {
    }

    // Method 3: Drawing cache fallback (won't capture SurfaceView but works for UI)
    try {
        val view = binding.root
        @Suppress("DEPRECATION")
        view.isDrawingCacheEnabled = true
        @Suppress("DEPRECATION")
        val bitmap = Bitmap.createBitmap(view.drawingCache)
        @Suppress("DEPRECATION")
        view.isDrawingCacheEnabled = false
        return bitmap
    } catch (_: Exception) {
    }

    return null
}

/**
 * Use PixelCopy API to capture the full window including SurfaceView content.
 */
private suspend fun pixelCopyWindow(window: Window): Bitmap? =
    withTimeoutOrNull(3000L) {
        suspendCancellableCoroutine { cont ->
            val width = window.decorView.width.coerceAtLeast(1)
            val height = window.decorView.height.coerceAtLeast(1)
            val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            PixelCopy.request(
                window,
                bitmap,
                { result ->
                    if (result == PixelCopy.SUCCESS) {
                        AppLog.d("Screenshot", "PixelCopy success: ${width}x$height")
                        cont.resume(bitmap)
                    } else {
                        AppLog.w("Screenshot", "PixelCopy failed with result=$result")
                        bitmap.recycle()
                        cont.resume(null)
                    }
                },
                Handler(Looper.getMainLooper()),
            )
        }
    }

private suspend fun PlayerActivity.saveScreenshot(bitmap: Bitmap): Uri? =
    withContext(Dispatchers.IO) {
        // v12.1: 添加水印
        val watermarkedBitmap = addWatermark(bitmap)

        val rawTitle = currentMainTitle?.take(40)?.replace(Regex("[^\\w\\u4e00-\\u9fff\\s-]"), "")?.trim() ?: ""
        val titlePart = if (rawTitle.isNotBlank()) "${rawTitle}_" else ""
        val filename = "blbl_${titlePart}${System.currentTimeMillis()}.jpg"

        return@withContext if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ : MediaStore
            val values =
                ContentValues().apply {
                    put(MediaStore.Images.Media.DISPLAY_NAME, filename)
                    put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
                    put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/blbl")
                }
            val resolver = contentResolver
            val uri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
            uri?.let {
                resolver.openOutputStream(it)?.use { out ->
                    watermarkedBitmap.compress(Bitmap.CompressFormat.JPEG, 95, out)
                }
            }
            uri
        } else {
            // Legacy storage
            val dir =
                File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "blbl",
                )
            if (!dir.exists()) dir.mkdirs()
            val file = File(dir, filename)
            FileOutputStream(file).use { out ->
                watermarkedBitmap.compress(Bitmap.CompressFormat.JPEG, 95, out)
            }
            Uri.fromFile(file)
        }
    }

private fun PlayerActivity.shareScreenshot(uri: Uri) {
    try {
        val intent =
            Intent(Intent.ACTION_SEND).apply {
                type = "image/jpeg"
                putExtra(Intent.EXTRA_STREAM, uri)
                putExtra(Intent.EXTRA_SUBJECT, "BLBL 截图分享")
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
        startActivity(Intent.createChooser(intent, "分享截图"))
    } catch (e: Exception) {
        AppToast.show(this, "分享失败: ${e.message}")
    }
}

// v12.1: 添加水印
private fun PlayerActivity.addWatermark(bitmap: Bitmap): Bitmap {
    val mode = BiliClient.prefs.screenshotWatermarkMode
    if (mode == 0) return bitmap

    val result = bitmap.copy(Bitmap.Config.ARGB_8888, true)
    val canvas = Canvas(result)
    val paint =
        Paint().apply {
            color = Color.WHITE
            textSize = 24f
            isAntiAlias = true
            setShadowLayer(2f, 1f, 1f, Color.BLACK)
        }

    val title = currentMainTitle ?: ""
    val upName = currentUpName ?: ""
    val timestamp = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(java.util.Date())

    // v12.18: 添加视频播放时间戳
    val engine = player
    val playTime =
        if (engine != null && engine.duration > 0) {
            val pos = engine.currentPosition
            val dur = engine.duration
            "${formatTime(pos)}/${formatTime(dur)}"
        } else {
            ""
        }

    val lines = mutableListOf<String>()
    if (mode >= 1 && title.isNotBlank()) lines.add(title)
    if (mode >= 2 && upName.isNotBlank()) lines.add("UP: $upName")
    if (mode >= 3) lines.add(timestamp)
    if (playTime.isNotBlank()) lines.add("⏱ $playTime")

    if (lines.isEmpty()) return bitmap

    // v12.22: 水印位置自定义
    val position = BiliClient.prefs.screenshotWatermarkPosition // 0=左上, 1=右上, 2=左下, 3=右下
    val lineHeight = 30f
    val padding = 20f
    val textWidths = lines.map { paint.measureText(it) }

    val x: Float
    val startY: Float

    when (position) {
        0 -> { // 左上
            x = padding
            startY = padding + lineHeight
        }
        1 -> { // 右上
            x = result.width - padding - textWidths.maxOrNull()!!
            startY = padding + lineHeight
        }
        2 -> { // 左下
            x = padding
            startY = result.height - padding - (lines.size - 1) * lineHeight
        }
        3 -> { // 右下
            x = result.width - padding - textWidths.maxOrNull()!!
            startY = result.height - padding - (lines.size - 1) * lineHeight
        }
        else -> {
            x = padding
            startY = result.height - padding - (lines.size - 1) * lineHeight
        }
    }

    var y = startY
    for (line in lines) {
        canvas.drawText(line, x, y, paint)
        y += lineHeight
    }

    return result
}

// v12.18: 格式化时间
private fun formatTime(ms: Long): String {
    val totalSec = ms / 1000
    val h = totalSec / 3600
    val m = (totalSec % 3600) / 60
    val s = totalSec % 60
    return if (h > 0) {
        String.format(java.util.Locale.US, "%d:%02d:%02d", h, m, s)
    } else {
        String.format(java.util.Locale.US, "%02d:%02d", m, s)
    }
}
