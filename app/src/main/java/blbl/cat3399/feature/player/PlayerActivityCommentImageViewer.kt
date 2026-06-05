package blbl.cat3399.feature.player

import android.view.KeyEvent
import android.view.View
import blbl.cat3399.core.image.ImageLoader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

internal fun PlayerActivity.initCommentImageViewer() {
    binding.commentImageViewer.visibility = View.GONE
    ImageLoader.loadInto(binding.ivCommentImage, null)
    binding.ivCommentImage.resetViewport()

    binding.commentImageViewer.setOnClickListener {
        if (!isCommentImageViewerVisible()) return@setOnClickListener
        closeCommentImageViewer()
    }

    binding.ivCommentImagePrev.setOnClickListener {
        if (!isCommentImageViewerVisible()) return@setOnClickListener
        if (binding.ivCommentImage.isZoomed()) return@setOnClickListener
        commentImageViewerPrev()
    }
    binding.ivCommentImageNext.setOnClickListener {
        if (!isCommentImageViewerVisible()) return@setOnClickListener
        if (binding.ivCommentImage.isZoomed()) return@setOnClickListener
        commentImageViewerNext()
    }
    binding.ivCommentImage.onNavigatePrevious = {
        if (isCommentImageViewerVisible() && !binding.ivCommentImage.isZoomed()) {
            commentImageViewerPrev()
        }
    }
    binding.ivCommentImage.onNavigateNext = {
        if (isCommentImageViewerVisible() && !binding.ivCommentImage.isZoomed()) {
            commentImageViewerNext()
        }
    }
    binding.ivCommentImage.onBlankAreaTap = {
        if (isCommentImageViewerVisible()) {
            closeCommentImageViewer()
        }
    }
    // v6.0: 长按保存评论图片
    binding.ivCommentImage.setOnLongClickListener {
        if (!isCommentImageViewerVisible()) return@setOnLongClickListener false
        val urls = commentImageViewerUrls
        val idx = commentImageViewerIndex
        val url = urls.getOrNull(idx) ?: return@setOnLongClickListener false
        saveCommentImage(url)
        true
    }
    binding.ivCommentImage.onZoomStateChanged = {
        if (isCommentImageViewerVisible()) {
            updateCommentImageViewerNavigationUi()
        }
    }
}

internal fun PlayerActivity.isCommentImageViewerVisible(): Boolean = binding.commentImageViewer.visibility == View.VISIBLE

internal fun PlayerActivity.openCommentImageViewer(urls: List<String>, startIndex: Int = 0) {
    val safeUrls = urls.map { it.trim() }.filter { it.isNotBlank() }
    if (safeUrls.isEmpty()) return

    commentImageViewerUrls = safeUrls
    commentImageViewerIndex = startIndex.coerceIn(0, safeUrls.lastIndex)
    commentImageViewerFocusReturn.capture(currentFocus)

    binding.commentImageViewer.visibility = View.VISIBLE
    binding.commentImageViewer.bringToFront()
    binding.commentImageViewer.invalidate()
    binding.commentImageViewer.requestLayout()
    binding.commentImageViewer.requestFocus()
    renderCommentImageViewer()
}

internal fun PlayerActivity.closeCommentImageViewer(restoreFocus: Boolean = true) {
    if (!isCommentImageViewerVisible()) return

    binding.commentImageViewer.visibility = View.GONE
    ImageLoader.loadInto(binding.ivCommentImage, null)
    binding.ivCommentImage.resetViewport()
    commentImageViewerUrls = emptyList()
    commentImageViewerIndex = 0

    if (!restoreFocus) {
        commentImageViewerFocusReturn.clear()
        return
    }

    val fallback =
        when {
            isCommentThreadVisible() -> binding.recyclerCommentThread
            isCommentsPanelVisible() -> binding.recyclerComments
            else -> binding.btnComments
        }
    commentImageViewerFocusReturn.restoreAndClear(fallback = fallback, postOnFail = false)
}

internal fun PlayerActivity.dispatchCommentImageViewerKey(event: KeyEvent): Boolean {
    if (!isCommentImageViewerVisible()) return false

    val keyCode = event.keyCode
    if (event.action == KeyEvent.ACTION_DOWN) {
        when (keyCode) {
            KeyEvent.KEYCODE_BACK -> {
                closeCommentImageViewer()
                return true
            }

            KeyEvent.KEYCODE_MENU,
            KeyEvent.KEYCODE_SETTINGS,
            KeyEvent.KEYCODE_INFO,
            KeyEvent.KEYCODE_GUIDE,
            -> return true

            KeyEvent.KEYCODE_DPAD_CENTER,
            KeyEvent.KEYCODE_ENTER,
            KeyEvent.KEYCODE_NUMPAD_ENTER,
            -> {
                binding.ivCommentImage.toggleDpadZoom()
                return true
            }

            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (binding.ivCommentImage.isZoomed()) {
                    binding.ivCommentImage.panLeft()
                } else {
                    commentImageViewerPrev()
                }
                return true
            }

            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (binding.ivCommentImage.isZoomed()) {
                    binding.ivCommentImage.panRight()
                } else {
                    commentImageViewerNext()
                }
                return true
            }

            KeyEvent.KEYCODE_DPAD_UP -> {
                if (binding.ivCommentImage.isZoomed()) {
                    binding.ivCommentImage.panUp()
                }
                return true
            }

            KeyEvent.KEYCODE_DPAD_DOWN -> {
                if (binding.ivCommentImage.isZoomed()) {
                    binding.ivCommentImage.panDown()
                }
                return true
            }
        }
    }

    if (event.action == KeyEvent.ACTION_UP) {
        when (keyCode) {
            KeyEvent.KEYCODE_BACK,
            KeyEvent.KEYCODE_MENU,
            KeyEvent.KEYCODE_SETTINGS,
            KeyEvent.KEYCODE_INFO,
            KeyEvent.KEYCODE_GUIDE,
            KeyEvent.KEYCODE_DPAD_LEFT,
            KeyEvent.KEYCODE_DPAD_RIGHT,
            KeyEvent.KEYCODE_DPAD_UP,
            KeyEvent.KEYCODE_DPAD_DOWN,
            KeyEvent.KEYCODE_DPAD_CENTER,
            KeyEvent.KEYCODE_ENTER,
            KeyEvent.KEYCODE_NUMPAD_ENTER,
            -> return true
        }
    }

    return false
}

private fun PlayerActivity.renderCommentImageViewer() {
    val urls = commentImageViewerUrls
    if (urls.isEmpty()) {
        closeCommentImageViewer()
        return
    }

    val idx = commentImageViewerIndex.coerceIn(0, urls.lastIndex)
    commentImageViewerIndex = idx
    binding.ivCommentImage.resetViewport()
    ImageLoader.loadInto(binding.ivCommentImage, urls[idx])
    updateCommentImageViewerNavigationUi()
}

private fun PlayerActivity.commentImageViewerPrev() {
    if (commentImageViewerUrls.size <= 1) return
    if (commentImageViewerIndex <= 0) return
    commentImageViewerIndex -= 1
    renderCommentImageViewer()
}

private fun PlayerActivity.commentImageViewerNext() {
    if (commentImageViewerUrls.size <= 1) return
    if (commentImageViewerIndex >= commentImageViewerUrls.lastIndex) return
    commentImageViewerIndex += 1
    renderCommentImageViewer()
}

private fun PlayerActivity.updateCommentImageViewerNavigationUi() {
    val urls = commentImageViewerUrls
    val showNavigation = urls.size > 1 && !binding.ivCommentImage.isZoomed()
    binding.ivCommentImagePrev.visibility =
        if (showNavigation && commentImageViewerIndex > 0) View.VISIBLE else View.GONE
    binding.ivCommentImageNext.visibility =
        if (showNavigation && commentImageViewerIndex < urls.lastIndex) View.VISIBLE else View.GONE
}

// v6.0: 保存评论图片到本地
private fun PlayerActivity.saveCommentImage(url: String) {
    try {
        val context = this
        val fileName = "blbl_comment_${System.currentTimeMillis()}.jpg"
        val resolver = context.contentResolver
        val contentValues = android.content.ContentValues().apply {
            put(android.provider.MediaStore.Images.Media.DISPLAY_NAME, fileName)
            put(android.provider.MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                put(android.provider.MediaStore.Images.Media.RELATIVE_PATH, "Pictures/blbl")
                put(android.provider.MediaStore.Images.Media.IS_PENDING, 1)
            }
        }
        val uri = resolver.insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
        if (uri != null) {
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    val client = okhttp3.OkHttpClient()
                    val request = okhttp3.Request.Builder().url(url).build()
                    val response = client.newCall(request).execute()
                    response.body?.byteStream()?.use { input ->
                        resolver.openOutputStream(uri)?.use { output ->
                            input.copyTo(output)
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                        contentValues.clear()
                        contentValues.put(android.provider.MediaStore.Images.Media.IS_PENDING, 0)
                        resolver.update(uri, contentValues, null, null)
                    }
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        blbl.cat3399.core.ui.AppToast.show(context, "图片已保存到 Pictures/blbl")
                    }
                } catch (t: Throwable) {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.Main) {
                        blbl.cat3399.core.ui.AppToast.show(context, "保存失败：${t.message}")
                    }
                }
            }
        }
    } catch (t: Throwable) {
        blbl.cat3399.core.ui.AppToast.show(this, "保存失败：${t.message}")
    }
}
