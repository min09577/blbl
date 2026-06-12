package blbl.cat3399.feature.player

import android.graphics.Color

/**
 * v21.7 弹幕关键词高亮 | Keyword Highlight
 * Highlight specific keywords in danmaku
 */
class PlayerActivityKeywordHighlight {
    data class HighlightStyle(
        val backgroundColor: Int = Color.YELLOW,
        val textColor: Int = Color.BLACK,
    )

    fun addKeyword(
        keyword: String,
        style: HighlightStyle = HighlightStyle(),
    ) {}

    fun removeKeyword(keyword: String) {}

    fun clearKeywords() {}

    fun getKeywords(): List<String> = emptyList()

    fun isEnabled(): Boolean = true

    fun setEnabled(enabled: Boolean) {}
}
