// Copyright: AI-maintained extension for cat3399/blbl
package blbl.cat3399.feature.widget

import android.content.Context
import blbl.cat3399.R
import kotlin.random.Random

/**
 * Built-in danmaku phrase pool for the widget.
 */
object DanmakuWidgetPool {
    private val random = Random(System.currentTimeMillis())

    fun randomText(ctx: Context): String {
        val extras = ctx.resources.getStringArray(R.array.widget_danmaku_extras)
        val index = random.nextInt(extras.size)
        return extras[index]
    }
}
