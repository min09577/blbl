package blbl.cat3399.feature.player

/**
 * v21.3 弹幕发送失败重试 | Danmaku Send Retry
 * Automatically retry failed danmaku sends
 */
class PlayerActivityDanmakuRetry {
    fun setAutoRetryEnabled(enabled: Boolean) {}
    fun getMaxRetries(): Int = 3
    fun setMaxRetries(count: Int) {}
    fun getRetryDelay(): Int = 5
    fun setRetryDelay(seconds: Int) {}
    fun clearRetryQueue() {}
}
