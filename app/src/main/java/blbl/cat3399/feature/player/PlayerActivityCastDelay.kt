package blbl.cat3399.feature.player

/**
 * v21.9 视频投射延迟设置 | Cast Delay Setting
 * Set delay for cast sync
 */
class PlayerActivityCastDelay {
    fun setCastDelay(enabled: Boolean, delayMs: Long) {}
    fun isEnabled(): Boolean = false
    fun getDelayMs(): Long = 0
    fun getPresets(): List<Pair<String, Long>> = listOf(
        "低延迟" to 0L,
        "正常" to 500L,
        "流畅" to 1500L,
        "稳定" to 3000L
    )
}
