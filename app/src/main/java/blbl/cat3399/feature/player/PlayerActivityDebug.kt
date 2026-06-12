@file:androidx.annotation.OptIn(markerClass = [androidx.media3.common.util.UnstableApi::class])

package blbl.cat3399.feature.player

import android.os.Build
import android.os.SystemClock
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.media3.common.Format
import androidx.media3.common.Player
import androidx.media3.common.VideoSize
import androidx.media3.exoplayer.ExoPlayer
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerEngine
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.util.Locale
import kotlin.math.abs
import kotlin.math.roundToInt

internal class PlayerDebugMetrics {
    var cdnHost: String? = null
    var videoTransferHost: String? = null
    var audioTransferHost: String? = null
    var videoDecoderName: String? = null
    var videoInputWidth: Int? = null
    var videoInputHeight: Int? = null
    var videoInputFps: Float? = null
    var droppedFramesTotal: Long = 0L
    var rebufferCount: Int = 0
    var lastPlaybackState: Int = Player.STATE_IDLE
    var renderFps: Float? = null
    var renderFpsLastAtMs: Long? = null
    var renderedFramesLastCount: Int? = null
    var renderedFramesLastAtMs: Long? = null

    // v11.0: 下载速度追踪
    var downloadBytesWindow: Long = 0L
    var downloadSpeedBps: Long = 0L
    private var downloadSpeedLastAtMs: Long = 0L

    fun reset() {
        cdnHost = null
        videoTransferHost = null
        audioTransferHost = null
        videoDecoderName = null
        videoInputWidth = null
        videoInputHeight = null
        videoInputFps = null
        droppedFramesTotal = 0L
        rebufferCount = 0
        lastPlaybackState = Player.STATE_IDLE
        renderFps = null
        renderFpsLastAtMs = null
        renderedFramesLastCount = null
        renderedFramesLastAtMs = null
        // v11.0: 下载速度
        downloadBytesWindow = 0L
        downloadSpeedBps = 0L
        downloadSpeedLastAtMs = 0L
    }

    // v11.0: 追加下载字节并计算速度
    fun addDownloadBytes(bytes: Long) {
        downloadBytesWindow += bytes
        val now = System.currentTimeMillis()
        val elapsed = now - downloadSpeedLastAtMs
        if (elapsed >= 1000) {
            downloadSpeedBps = downloadBytesWindow * 1000L / elapsed
            downloadBytesWindow = 0L
            downloadSpeedLastAtMs = now
        }
    }
}

internal fun PlayerActivity.updateDebugOverlay() {
    val enabled = session.debugEnabled
    binding.tvDebug.visibility = if (enabled) View.VISIBLE else View.GONE
    binding.danmakuView.setDebugEnabled(enabled)
    debugJob?.cancel()
    if (!enabled) return
    val engine = player ?: return
    debugJob =
        lifecycleScope.launch {
            while (isActive) {
                binding.tvDebug.text =
                    when (engine) {
                        is ExoPlayerEngine -> buildDebugText(engine.exoPlayer)
                        is IjkPlayerEngine -> buildDebugText(engine)
                        else -> "-"
                    }
                delay(500)
            }
        }
}

private fun PlayerActivity.buildDebugText(exo: ExoPlayer): String {
    updateDebugVideoStatsFromCounters(exo)
    val sb = StringBuilder()
    val state =
        when (exo.playbackState) {
            Player.STATE_IDLE -> "IDLE"
            Player.STATE_BUFFERING -> "BUFFERING"
            Player.STATE_READY -> "READY"
            Player.STATE_ENDED -> "ENDED"
            else -> exo.playbackState.toString()
        }
    sb.append("state=").append(state)
    sb.append(" playing=").append(exo.isPlaying)
    sb.append(" pwr=").append(exo.playWhenReady)
    sb.append('\n')

    sb.append("pos=").append(exo.currentPosition).append("ms")
    sb.append(" buf=").append(exo.bufferedPosition).append("ms")
    sb.append(" dur=").append(exo.duration.takeIf { it > 0 } ?: 0L).append("ms")
    sb.append(" spd=").append(String.format(Locale.US, "%.2f", exo.playbackParameters.speed))
    sb.append('\n')

    val trackFormat = pickSelectedVideoFormat(exo)
    val res = buildDebugResolutionText(exo.videoSize, debug.videoInputWidth, debug.videoInputHeight, trackFormat)
    sb.append("res=").append(res)
    val fps =
        formatDebugFps(debug.renderFps)
            ?: formatDebugFps(debug.videoInputFps ?: trackFormat?.frameRate)
            ?: "-"
    sb.append(" fps=").append(fps)
    val cdnVideo = debug.videoTransferHost?.trim().takeIf { !it.isNullOrBlank() }
    val cdnAudio = debug.audioTransferHost?.trim().takeIf { !it.isNullOrBlank() }
    val cdnPicked = cdnVideo ?: debug.cdnHost?.trim().takeIf { !it.isNullOrBlank() } ?: "-"
    val cdnHost =
        if (!cdnAudio.isNullOrBlank() && !cdnVideo.isNullOrBlank() && cdnAudio != cdnVideo) {
            "v=$cdnVideo a=$cdnAudio"
        } else {
            cdnPicked
        }
    if (cdnHost.length <= 42) {
        sb.append(" cdn=").append(cdnHost)
        sb.append('\n')
    } else {
        sb.append('\n')
        sb.append("cdn=").append(cdnHost)
        sb.append('\n')
    }

    buildDebugDisplayText()?.let { disp ->
        sb.append("disp=").append(disp)
        sb.append('\n')
    }

    sb.append("decoder=").append(shortenDebugValue(debug.videoDecoderName ?: "-", maxChars = 64))
    val brBps =
        trackFormat
            ?.let { f ->
                f.averageBitrate.takeIf { it > 0 }
                    ?: f.bitrate.takeIf { it > 0 }
                    ?: f.peakBitrate.takeIf { it > 0 }
            }?.toDouble()
    if (brBps != null) {
        sb.append(" br=").append(String.format(Locale.US, "%.1f", brBps / 1000.0)).append("kbps")
    } else {
        sb.append(" br=-")
    }
    sb.append('\n')
    // v11.0: 实时下载速度
    val dlBps = debug.downloadSpeedBps
    if (dlBps > 0) {
        val mbps = dlBps * 8.0 / 1_000_000.0
        sb.append(" dl=").append(String.format(Locale.US, "%.1f", mbps)).append("Mbps")
    } else {
        sb.append(" dl=-")
    }
    sb.append('\n')

    sb.append("dropped=").append(debug.droppedFramesTotal)
    sb.append(" rebuffer=").append(debug.rebufferCount)

    runCatching { binding.danmakuView.getDebugStats() }.getOrNull()?.let { dm ->
        sb.append('\n')
        sb.append("dm=").append(if (dm.configEnabled) "on" else "off")
        sb.append(" fps=").append(String.format(Locale.US, "%.1f", dm.drawFps))
        sb.append(" act=").append(dm.lastFrameActive)
        sb.append(" pend=").append(dm.lastFramePending)
        sb
            .append(" hit=")
            .append(dm.lastFrameCachedDrawn)
            .append('/')
            .append(dm.lastFrameActive)
        sb.append(" fb=").append(dm.lastFrameFallbackDrawn)
        sb.append(" q=").append(dm.queueDepth)
        if (dm.invalidateFull) {
            sb.append(" inv=full")
        } else {
            sb
                .append(" inv=")
                .append(dm.invalidateTopPx)
                .append('-')
                .append(dm.invalidateBottomPx)
        }
        sb.append('\n')

        val poolMb = dm.poolBytes.toDouble() / (1024.0 * 1024.0)
        val poolMaxMb = dm.poolMaxBytes.toDouble() / (1024.0 * 1024.0)
        sb.append("bmp cache=").append(dm.cacheItems)
        sb.append(" rendering=").append(dm.renderingItems)
        sb.append(" pool=").append(dm.poolItems)
        sb
            .append('(')
            .append(String.format(Locale.US, "%.1f", poolMb))
            .append('/')
            .append(String.format(Locale.US, "%.0f", poolMaxMb))
            .append("MB)")
        sb.append(" new=").append(dm.bitmapCreated)
        sb.append(" reuse=").append(dm.bitmapReused)
        sb.append(" put=").append(dm.bitmapPutToPool)
        sb.append(" rec=").append(dm.bitmapRecycled)
        sb.append('\n')

        sb
            .append("dm ms upd=")
            .append(String.format(Locale.US, "%.2f", dm.updateAvgMs))
            .append('/')
            .append(String.format(Locale.US, "%.2f", dm.updateMaxMs))
        sb
            .append(" draw=")
            .append(String.format(Locale.US, "%.2f", dm.drawAvgMs))
            .append('/')
            .append(String.format(Locale.US, "%.2f", dm.drawMaxMs))
        sb
            .append(" req=")
            .append(dm.lastFrameRequestsActive)
            .append('+')
            .append(dm.lastFrameRequestsPrefetch)
    }
    return sb.toString()
}

private fun PlayerActivity.buildDebugText(ijk: IjkPlayerEngine): String {
    val snap = ijk.debugSnapshot()
    val sb = StringBuilder()
    val state =
        when (snap.playbackState) {
            Player.STATE_IDLE -> "IDLE"
            Player.STATE_BUFFERING -> "BUFFERING"
            Player.STATE_READY -> "READY"
            Player.STATE_ENDED -> "ENDED"
            else -> snap.playbackState.toString()
        }
    sb.append("state=").append(state)
    sb.append(" playing=").append(snap.isPlaying)
    sb.append(" pwr=").append(snap.playWhenReady)
    sb.append('\n')

    sb.append("pos=").append(snap.positionMs).append("ms")
    sb.append(" buf=").append(snap.bufferedPositionMs).append("ms")
    sb.append(" dur=").append(snap.durationMs.coerceAtLeast(0L)).append("ms")
    sb.append(" spd=").append(String.format(Locale.US, "%.2f", snap.playbackSpeed))
    sb.append('\n')

    val w = snap.videoWidth?.takeIf { it > 0 } ?: debug.videoInputWidth ?: 0
    val h = snap.videoHeight?.takeIf { it > 0 } ?: debug.videoInputHeight ?: 0
    val res = if (w > 0 && h > 0) "${w}x$h" else "-"
    sb.append("res=").append(res)

    val fps =
        formatDebugFps(snap.fpsOutput)
            ?: formatDebugFps(snap.fpsDecode)
            ?: "-"
    sb.append(" fps=").append(fps)
    val cdnPicked = debug.cdnHost?.trim().takeIf { !it.isNullOrBlank() } ?: "-"
    if (cdnPicked.length <= 42) {
        sb.append(" cdn=").append(cdnPicked)
        sb.append('\n')
    } else {
        sb.append('\n')
        sb.append("cdn=").append(cdnPicked)
        sb.append('\n')
    }

    buildDebugDisplayText()?.let { disp ->
        sb.append("disp=").append(disp)
        sb.append('\n')
    }

    val decoder =
        when (snap.videoDecoder) {
            tv.danmaku.ijk.media.player.IjkMediaPlayer.FFP_PROPV_DECODER_MEDIACODEC -> "MediaCodec"
            tv.danmaku.ijk.media.player.IjkMediaPlayer.FFP_PROPV_DECODER_AVCODEC -> "avcodec"
            else -> "-"
        }
    sb.append("decoder=").append(decoder)
    if (snap.bitRate > 0) sb.append(" br=").append(String.format(Locale.US, "%.1f", snap.bitRate / 1000f)).append("kbps")
    sb.append('\n')

    if (snap.tcpSpeed > 0) {
        val mbps = snap.tcpSpeed.toDouble() * 8.0 / 1_000_000.0
        sb.append("net=").append(String.format(Locale.US, "%.2f", mbps)).append("Mbps")
    } else {
        sb.append("net=-")
    }
    sb.append(" vCache=").append(snap.videoCachedDurationMs.coerceAtLeast(0L)).append("ms")
    sb.append(" aCache=").append(snap.audioCachedDurationMs.coerceAtLeast(0L)).append("ms")
    sb.append('\n')

    runCatching { binding.danmakuView.getDebugStats() }.getOrNull()?.let { dm ->
        sb.append("dm=").append(if (dm.configEnabled) "on" else "off")
        sb.append(" fps=").append(String.format(Locale.US, "%.1f", dm.drawFps))
        sb.append(" act=").append(dm.lastFrameActive)
        sb.append(" pend=").append(dm.lastFramePending)
        sb
            .append(" hit=")
            .append(dm.lastFrameCachedDrawn)
            .append('/')
            .append(dm.lastFrameActive)
        sb.append(" fb=").append(dm.lastFrameFallbackDrawn)
        sb.append(" q=").append(dm.queueDepth)
        if (dm.invalidateFull) {
            sb.append(" inv=full")
        } else {
            sb
                .append(" inv=")
                .append(dm.invalidateTopPx)
                .append('-')
                .append(dm.invalidateBottomPx)
        }
        sb.append('\n')

        val poolMb = dm.poolBytes.toDouble() / (1024.0 * 1024.0)
        val poolMaxMb = dm.poolMaxBytes.toDouble() / (1024.0 * 1024.0)
        sb.append("bmp cache=").append(dm.cacheItems)
        sb.append(" rendering=").append(dm.renderingItems)
        sb.append(" pool=").append(dm.poolItems)
        sb
            .append('(')
            .append(String.format(Locale.US, "%.1f", poolMb))
            .append('/')
            .append(String.format(Locale.US, "%.0f", poolMaxMb))
            .append("MB)")
        sb.append(" new=").append(dm.bitmapCreated)
        sb.append(" reuse=").append(dm.bitmapReused)
        sb.append(" put=").append(dm.bitmapPutToPool)
        sb.append(" rec=").append(dm.bitmapRecycled)
        sb.append('\n')

        sb
            .append("dm ms upd=")
            .append(String.format(Locale.US, "%.2f", dm.updateAvgMs))
            .append('/')
            .append(String.format(Locale.US, "%.2f", dm.updateMaxMs))
        sb
            .append(" draw=")
            .append(String.format(Locale.US, "%.2f", dm.drawAvgMs))
            .append('/')
            .append(String.format(Locale.US, "%.2f", dm.drawMaxMs))
        sb
            .append(" req=")
            .append(dm.lastFrameRequestsActive)
            .append('+')
            .append(dm.lastFrameRequestsPrefetch)
    }

    return sb.toString()
}

private fun PlayerActivity.buildDebugDisplayText(): String? {
    val display = binding.root.display ?: return null
    val hz = display.refreshRate.takeIf { it > 0f }
    if (Build.VERSION.SDK_INT < 23) {
        return hz?.let { String.format(Locale.US, "%.0fHz", it) } ?: "-"
    }
    val mode = display.mode
    val w = mode.physicalWidth.takeIf { it > 0 } ?: 0
    val h = mode.physicalHeight.takeIf { it > 0 } ?: 0
    val mhz = mode.refreshRate.takeIf { it > 0f } ?: hz
    val hzText = mhz?.let { String.format(Locale.US, "%.0fHz", it) } ?: "-"
    if (w <= 0 || h <= 0) return hzText
    return "${w}x$h@$hzText"
}

private fun PlayerActivity.updateDebugVideoStatsFromCounters(exo: ExoPlayer) {
    val nowMs = SystemClock.elapsedRealtime()
    val counters = exo.videoDecoderCounters ?: return
    counters.ensureUpdated()

    // Dropped frames: keep the max to avoid going backwards across updates.
    debug.droppedFramesTotal = maxOf(debug.droppedFramesTotal, counters.droppedBufferCount.toLong())

    // Render fps: derive from rendered output buffers between overlay updates.
    val count = counters.renderedOutputBufferCount
    val lastCount = debug.renderedFramesLastCount
    val lastAt = debug.renderedFramesLastAtMs
    debug.renderedFramesLastCount = count
    debug.renderedFramesLastAtMs = nowMs

    if (lastCount == null || lastAt == null) return
    val deltaMs = nowMs - lastAt
    val deltaFrames = count - lastCount
    if (deltaMs <= 0L || deltaMs > 10_000L) return
    if (deltaFrames <= 0) return
    val instantFps = (deltaFrames * 1000f) / deltaMs.toFloat()
    debug.renderFps = debug.renderFps?.let { it * 0.7f + instantFps * 0.3f } ?: instantFps
}

private fun buildDebugResolutionText(
    vs: VideoSize,
    fallbackWidth: Int?,
    fallbackHeight: Int?,
    trackFormat: Format?,
): String {
    val w = vs.width.takeIf { it > 0 } ?: fallbackWidth ?: 0
    val h = vs.height.takeIf { it > 0 } ?: fallbackHeight ?: 0
    if (w > 0 && h > 0) return "${w}x$h"
    val tw = trackFormat?.width?.takeIf { it > 0 } ?: 0
    val th = trackFormat?.height?.takeIf { it > 0 } ?: 0
    return if (tw > 0 && th > 0) "${tw}x$th" else "-"
}

private fun formatDebugFps(fps: Float?): String? {
    val v = fps?.takeIf { it > 0f } ?: return null
    val rounded = v.roundToInt().toFloat()
    return if (abs(v - rounded) < 0.05f) rounded.toInt().toString() else String.format(Locale.US, "%.1f", v)
}

private fun shortenDebugValue(
    value: String,
    maxChars: Int,
): String {
    val v = value.trim()
    if (v.length <= maxChars) return v
    return v.take(maxChars - 1) + "…"
}

private fun pickSelectedVideoFormat(exo: ExoPlayer): Format? {
    val tracks = exo.currentTracks
    for (g in tracks.groups) {
        if (!g.isSelected) continue
        for (i in 0 until g.length) {
            if (!g.isTrackSelected(i)) continue
            val f = g.getTrackFormat(i)
            val mime = f.sampleMimeType ?: ""
            if (mime.startsWith("video/")) return f
        }
    }
    return null
}

// v10.3: 显示完整媒体信息对话框
internal fun PlayerActivity.showMediaInfoDialog() {
    val exo = (player as? ExoPlayerEngine)?.exoPlayer
    val debug = debug
    val sb = StringBuilder()
    sb.appendLine("=== 视频信息 ===")
    sb.appendLine("BVID: $currentBvid")
    sb.appendLine("CID: $currentCid")
    sb.appendLine("AID: $currentAid")
    sb.appendLine()
    if (exo != null) {
        val vf = exo.videoFormat
        sb.appendLine("=== 视频解码 ===")
        sb.appendLine("解码器: ${debug.videoDecoderName ?: "未知"}")
        sb.appendLine("MIME: ${vf?.sampleMimeType ?: "未知"}")
        val w = debug.videoInputWidth ?: vf?.width ?: 0
        val h = debug.videoInputHeight ?: vf?.height ?: 0
        if (w > 0 && h > 0) {
            sb.appendLine("分辨率: ${w}x$h")
            // v12.4: 宽高比
            val gcd = gcd(w, h)
            val ratioW = w / gcd
            val ratioH = h / gcd
            sb.appendLine("宽高比: $ratioW:$ratioH")
        }
        val fps = debug.videoInputFps?.toInt() ?: (vf?.frameRate?.toInt() ?: 0)
        if (fps > 0) sb.appendLine("帧率: ${fps}fps")
        val br = vf?.averageBitrate?.takeIf { it > 0 } ?: vf?.bitrate?.takeIf { it > 0 } ?: 0
        if (br > 0) {
            sb.appendLine("码率: ${String.format(java.util.Locale.US, "%.0f", br / 1000.0)}kbps")
            // v12.4: 估算文件大小
            val durationSec = exo.duration / 1000.0
            if (durationSec > 0) {
                val estimatedSizeMB = (br * durationSec) / (8 * 1024 * 1024)
                sb.appendLine("估算大小: ${String.format(java.util.Locale.US, "%.1f", estimatedSizeMB)}MB")
            }
        }
        sb.appendLine()
        val af = exo.audioFormat
        sb.appendLine("=== 音频解码 ===")
        sb.appendLine("MIME: ${af?.sampleMimeType ?: "未知"}")
        val sr = af?.sampleRate ?: 0
        if (sr > 0) sb.appendLine("采样率: ${sr}Hz")
        val ch = af?.channelCount ?: 0
        if (ch > 0) {
            val channelText =
                when (ch) {
                    1 -> "单声道"
                    2 -> "立体声"
                    6 -> "5.1环绕声"
                    8 -> "7.1环绕声"
                    else -> "${ch}声道"
                }
            sb.appendLine("声道: $channelText")
        }
        val abr = af?.averageBitrate?.takeIf { it > 0 } ?: af?.bitrate?.takeIf { it > 0 } ?: 0
        if (abr > 0) sb.appendLine("码率: ${String.format(java.util.Locale.US, "%.0f", abr / 1000.0)}kbps")
        sb.appendLine()
        sb.appendLine("=== 播放状态 ===")
        sb.appendLine("当前位置: ${formatHms(exo.currentPosition)} / ${formatHms(exo.duration)}")
        sb.appendLine("播放速度: ${exo.playbackParameters.speed}x")
        sb.appendLine("缓冲位置: ${formatHms(exo.bufferedPosition)}")
        sb.appendLine("渲染帧率: ${debug.renderFps?.let { "${it.roundToInt()}fps" } ?: "未知"}")
        sb.appendLine("重缓冲次数: ${debug.rebufferCount}")
        // v12.4: HDR和色彩空间增强
        val ct = vf?.colorInfo?.colorTransfer ?: 0
        val cp = vf?.colorInfo?.colorSpace ?: 0
        val hdr =
            when (ct) {
                6 -> "HDR10 (ST2084)"
                7 -> "HLG"
                else -> "SDR"
            }
        val colorSpace =
            when (cp) {
                1 -> "BT.601"
                2 -> "BT.709"
                6 -> "BT.2020"
                else -> "未知"
            }
        sb.appendLine("HDR: $hdr")
        sb.appendLine("色彩空间: $colorSpace")
        // v12.4: 下载速度
        val dlSpeed = debug.downloadSpeedBps
        if (dlSpeed > 0) {
            val dlSpeedKBps = dlSpeed / 1024.0
            if (dlSpeedKBps > 1024) {
                sb.appendLine("下载速度: ${String.format(java.util.Locale.US, "%.1f", dlSpeedKBps / 1024.0)}MB/s")
            } else {
                sb.appendLine("下载速度: ${String.format(java.util.Locale.US, "%.0f", dlSpeedKBps)}KB/s")
            }
        }
    } else {
        sb.appendLine("当前未使用 ExoPlayer")
    }
    // v12.2: 媒体信息一键复制
    val infoText = sb.toString()
    android.app.AlertDialog
        .Builder(this)
        .setTitle("媒体信息")
        .setMessage(infoText)
        .setPositiveButton("关闭", null)
        .setNeutralButton("复制") { _, _ ->
            val clipboard = getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
            val clip = android.content.ClipData.newPlainText("blbl_media_info", infoText)
            clipboard.setPrimaryClip(clip)
            blbl.cat3399.core.ui.AppToast
                .show(this, "媒体信息已复制")
        }.show()
}

// v12.4: 最大公约数（用于计算宽高比）
private fun gcd(
    a: Int,
    b: Int,
): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}
