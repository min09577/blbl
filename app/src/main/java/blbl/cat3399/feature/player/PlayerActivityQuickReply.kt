package blbl.cat3399.feature.player

/**
 * v21.12 弹幕快速回复 | Quick Reply
 * Predefined quick responses
 */
class PlayerActivityQuickReply {
    fun getReplies(): List<String> = listOf(
        "哈哈", "太强了", "支持", "23333", "前方高能"
    )
    fun addReply(text: String) {}
    fun removeReply(text: String) {}
    fun resetToDefaults() {}
    fun getMostUsed(count: Int = 5): List<String> = emptyList()
}
