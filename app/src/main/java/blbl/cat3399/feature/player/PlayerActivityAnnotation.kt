package blbl.cat3399.feature.player

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.ui.AppToast

/**
 * v13.6: 视频画面画笔标注
 * 支持在视频画面上进行画笔标注
 */

private var annotationMode = false
private var annotationView: AnnotationView? = null

internal fun PlayerActivity.toggleAnnotationMode() {
    if (annotationMode) {
        disableAnnotationMode()
    } else {
        enableAnnotationMode()
    }
}

private fun PlayerActivity.enableAnnotationMode() {
    annotationMode = true
    
    val overlay = requirePlayerTouchOverlayBinding(binding)
    
    // 创建标注视图
    val view = AnnotationView(this).apply {
        id = View.generateViewId()
        setBackgroundColor(Color.TRANSPARENT)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        layoutParams = params
    }
    annotationView = view
    overlay.root.addView(view)
    
    // 标注工具栏
    val toolbar = LinearLayout(this).apply {
        id = View.generateViewId()
        orientation = LinearLayout.HORIZONTAL
        gravity = android.view.Gravity.CENTER
        setBackgroundResource(R.drawable.boost_indicator_bg)
        setPadding(16, 8, 16, 8)
        elevation = 16f
    }
    
    val colors = listOf(
        0xFFFF0000.toInt() to "红",
        0xFF00FF00.toInt() to "绿",
        0xFF0000FF.toInt() to "蓝",
        0xFFFFFF00.toInt() to "黄",
        0xFFFFFFFF.toInt() to "白",
    )
    
    colors.forEach { (color, label) ->
        val btn = TextView(this).apply {
            text = label
            textSize = 12f
            setTextColor(color)
            setBackgroundResource(R.drawable.boost_indicator_bg)
            setPadding(16, 8, 16, 8)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(4, 0, 4, 0)
            }
            layoutParams = params
            setOnClickListener {
                annotationView?.setDrawColor(color)
                AppToast.show(this@enableAnnotationMode, "画笔颜色: $label")
            }
        }
        toolbar.addView(btn)
    }
    
    // 清除按钮
    val clearBtn = TextView(this).apply {
        text = "🗑 清除"
        textSize = 12f
        setTextColor(0xFFFFFFFF.toInt())
        setPadding(16, 8, 16, 8)
        setOnClickListener {
            annotationView?.clearAnnotations()
            AppToast.show(this@enableAnnotationMode, "标注已清除")
        }
    }
    toolbar.addView(clearBtn)
    
    // 关闭按钮
    val closeBtn = TextView(this).apply {
        text = "✕"
        textSize = 14f
        setTextColor(0xFFFFFFFF.toInt())
        setPadding(16, 8, 8, 8)
        setOnClickListener { disableAnnotationMode() }
    }
    toolbar.addView(closeBtn)
    
    val params = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.WRAP_CONTENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    ).apply {
        gravity = android.view.Gravity.TOP or android.view.Gravity.CENTER_HORIZONTAL
        topMargin = 100
    }
    overlay.root.addView(toolbar, params)
    
    AppToast.show(this, "画笔标注模式已开启")
}

private fun PlayerActivity.disableAnnotationMode() {
    annotationMode = false
    annotationView = null
    
    val overlay = requirePlayerTouchOverlayBinding(binding)
    val childCount = overlay.root.childCount
    val viewsToRemove = mutableListOf<View>()
    for (i in 0 until childCount) {
        val child = overlay.root.getChildAt(i)
        if (child is AnnotationView) {
            viewsToRemove.add(child)
        }
    }
    viewsToRemove.forEach { overlay.root.removeView(it) }
    
    AppToast.show(this, "画笔标注模式已关闭")
}

class AnnotationView(context: android.content.Context) : View(context) {
    private val paths = mutableListOf<Path>()
    private var currentPath: Path? = null
    private val paint = Paint().apply {
        color = Color.RED
        strokeWidth = 5f
        style = Paint.Style.STROKE
        strokeJoin = Paint.Join.ROUND
        strokeCap = Paint.Cap.ROUND
        isAntiAlias = true
    }
    
    fun setDrawColor(color: Int) {
        paint.color = color
    }
    
    fun clearAnnotations() {
        paths.clear()
        invalidate()
    }
    
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                currentPath = Path().apply {
                    moveTo(event.x, event.y)
                }
                paths.add(currentPath!!)
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                currentPath?.lineTo(event.x, event.y)
                invalidate()
                return true
            }
            MotionEvent.ACTION_UP -> {
                currentPath = null
                return true
            }
        }
        return super.onTouchEvent(event)
    }
    
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paths.forEach { path ->
            canvas.drawPath(path, paint)
        }
    }
}
