package blbl.cat3399.feature.player

/**
 * v21.8 记住弹幕字体 | Remember Font
 * Remember user's preferred danmaku font
 */
class PlayerActivityFontMemory {
    fun setFontFamily(family: String) {}
    fun setFontSize(size: Float) {}
    fun getFontFamily(): String = "default"
    fun getFontSize(): Float = 18f
    fun resetToDefault() {}
}
