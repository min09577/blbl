package blbl.cat3399.feature.player

import android.view.ScaleGestureDetector
import android.view.MotionEvent
import android.view.View
import blbl.cat3399.core.ui.AppToast

/**
 * v13.4: 视频画面缩放
 * 支持捏合缩放视频画面
 */

private var currentScale = 1.0f
private var scaleDetector: ScaleGestureDetector? = null

internal fun PlayerActivity.initPinchZoom() {
    val overlay = requirePlayerTouchOverlayBinding(binding)
    
    scaleDetector = ScaleGestureDetector(this, object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(detector: ScaleGestureDetector): Boolean {
            val scaleFactor = detector.scaleFactor
            currentScale = (currentScale * scaleFactor).coerceIn(0.5f, 3.0f)
            
            binding.playerView.scaleX = currentScale
            binding.playerView.scaleY = currentScale
            
            return true
        }
        
        override fun onScaleEnd(detector: ScaleGestureDetector) {
            // 如果缩放接近1，自动恢复
            if (currentScale > 0.95f && currentScale < 1.05f) {
                currentScale = 1.0f
                binding.playerView.scaleX = 1.0f
                binding.playerView.scaleY = 1.0f
            }
        }
    })
    
    // 在 touch gesture layer 上添加缩放检测
    overlay.touchGestureLayer.setOnTouchListener { _, event ->
        scaleDetector?.onTouchEvent(event)
        false // 不消费事件，让其他手势继续工作
    }
}

internal fun PlayerActivity.resetPinchZoom() {
    currentScale = 1.0f
    binding.playerView.scaleX = 1.0f
    binding.playerView.scaleY = 1.0f
    AppToast.show(this, "缩放已重置")
}

internal fun PlayerActivity.releasePinchZoom() {
    scaleDetector = null
    resetPinchZoom()
}
