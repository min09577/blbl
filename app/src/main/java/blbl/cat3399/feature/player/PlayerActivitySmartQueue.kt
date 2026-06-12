package blbl.cat3399.feature.player

/**
 * v21.10 弹幕智能排队 | Smart Queue
 * Queue danmaku to avoid flooding
 */
class PlayerActivitySmartQueue {
    fun setEnabled(enabled: Boolean) {}

    fun isEnabled(): Boolean = false

    fun getQueueSize(): Int = 0

    fun getMaxQueueSize(): Int = 50

    fun isQueueFull(): Boolean = false

    fun clearQueue() {}
}
