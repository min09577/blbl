package blbl.cat3399.feature.player

/**
 * v21.11 播放历史时间线 | Play History Timeline
 * Visual timeline of playback history
 */
class PlayerActivityHistoryTimeline {
    data class WatchHistoryItem(
        val videoId: String,
        val title: String,
        val progressPercent: Float,
        val lastWatchTime: Long,
    )

    fun addToHistory(
        videoId: String,
        title: String,
        progress: Float,
    ) {}

    fun getRecentHistory(count: Int = 10): List<WatchHistoryItem> = emptyList()

    fun clearHistory() {}

    fun getTotalWatchTime(): Long = 0
}
