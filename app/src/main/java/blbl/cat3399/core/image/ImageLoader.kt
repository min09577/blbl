package blbl.cat3399.core.image

import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import blbl.cat3399.R
import coil.disk.DiskCache
import coil.memory.MemoryCache
import coil.request.CachePolicy
import coil.request.ImageRequest
import coil.size.Precision
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import coil.ImageLoader as CoilImageLoader

object ImageLoader {
    private val placeholder = ColorDrawable(0xFF2A2A2A.toInt())
    private var coilImageLoader: CoilImageLoader? = null

    @JvmStatic
    fun init(network: okhttp3.OkHttpClient) {
        val diskCache =
            DiskCache
                .Builder()
                .directory(java.io.File(blbl.cat3399.BlblApp.instance.cacheDir, "coil"))
                .maxSizeBytes(50 * 1024 * 1024L) // 50 MB
                .build()

        val memoryCache =
            MemoryCache
                .Builder(blbl.cat3399.BlblApp.instance)
                .maxSizePercent(0.15) // 15% of heap (vs 3% before)
                .build()

        coilImageLoader =
            CoilImageLoader
                .Builder(blbl.cat3399.BlblApp.instance)
                .okHttpClient { network }
                .diskCache(diskCache)
                .memoryCache(memoryCache)
                .crossfade(200)
                .build()
    }

    @JvmStatic
    fun loadInto(
        view: ImageView,
        url: String?,
    ) {
        val normalized = normalizeLoadUrl(url)
        if (normalized == null) {
            view.setTag(R.id.tag_image_loader_url, null)
            if (view.drawable !== placeholder) view.setImageDrawable(placeholder)
            return
        }

        val lastUrl = view.getTag(R.id.tag_image_loader_url) as? String
        if (lastUrl == normalized) {
            // Already loaded or loading - Coil handles dedup internally
            val drawable = view.drawable
            if (drawable != null && drawable !== placeholder) return
        }

        view.setTag(R.id.tag_image_loader_url, normalized)
        val request =
            ImageRequest
                .Builder(view.context)
                .data(normalized)
                .target(view)
                .placeholder(placeholder)
                .memoryCachePolicy(CachePolicy.ENABLED)
                .diskCachePolicy(CachePolicy.ENABLED)
                .networkCachePolicy(CachePolicy.ENABLED)
                .precision(Precision.INEXACT)
                .build()

        val loader = coilImageLoader ?: CoilImageLoader(view.context)
        loader.enqueue(request)
    }

    private fun normalizeLoadUrl(url: String?): String? {
        val raw = url?.trim().takeIf { !it.isNullOrBlank() } ?: return null
        if (raw.startsWith("//")) return "https:$raw"
        if (!raw.startsWith("http://")) return raw

        val host =
            raw
                .toHttpUrlOrNull()
                ?.host
                ?.lowercase()
                .orEmpty()
        val isBiliCdn =
            host == "hdslb.com" ||
                host.endsWith(".hdslb.com") ||
                host == "bilibili.com" ||
                host.endsWith(".bilibili.com") ||
                host == "bilivideo.com" ||
                host.endsWith(".bilivideo.com") ||
                host == "bilivideo.cn" ||
                host.endsWith(".bilivideo.cn")
        return if (isBiliCdn) raw.replaceFirst("http://", "https://") else raw
    }
}
