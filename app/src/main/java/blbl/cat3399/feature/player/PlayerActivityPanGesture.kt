package blbl.cat3399.feature.player

import android.view.MotionEvent
import blbl.cat3399.core.ui.AppToast

/**
 * v13.5: 视频画面平移
 * 支持双指平移视频画面
 */

private var currentTranslateX = 0f
private var currentTranslateY = 0f
private var lastPanX = 0f
private var lastPanY = 0f
private var isPanning = false

internal fun PlayerActivity.initPanGesture() {
    val overlay = requirePlayerTouchOverlayBinding(binding)

    // 使用 touchGestureLayer 的触摸事件来检测双指平移
    overlay.touchGestureLayer.setOnTouchListener { _, event ->
        when (event.pointerCount) {
            2 -> {
                when (event.actionMasked) {
                    MotionEvent.ACTION_POINTER_DOWN -> {
                        isPanning = true
                        lastPanX = (event.getX(0) + event.getX(1)) / 2
                        lastPanY = (event.getY(0) + event.getY(1)) / 2
                        true
                    }
                    MotionEvent.ACTION_MOVE -> {
                        if (isPanning) {
                            val currentX = (event.getX(0) + event.getX(1)) / 2
                            val currentY = (event.getY(0) + event.getY(1)) / 2
                            val dx = currentX - lastPanX
                            val dy = currentY - lastPanY

                            currentTranslateX += dx
                            currentTranslateY += dy

                            binding.playerView.translationX = currentTranslateX
                            binding.playerView.translationY = currentTranslateY

                            lastPanX = currentX
                            lastPanY = currentY
                            true
                        } else {
                            false
                        }
                    }
                    MotionEvent.ACTION_POINTER_UP -> {
                        isPanning = false
                        true
                    }
                    else -> false
                }
            }
            else -> {
                isPanning = false
                false
            }
        }
    }
}

internal fun PlayerActivity.resetPanGesture() {
    currentTranslateX = 0f
    currentTranslateY = 0f
    binding.playerView.translationX = 0f
    binding.playerView.translationY = 0f
    AppToast.show(this, "平移已重置")
}

internal fun PlayerActivity.releasePanGesture() {
    resetPanGesture()
}
