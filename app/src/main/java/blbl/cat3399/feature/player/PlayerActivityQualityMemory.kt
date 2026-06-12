package blbl.cat3399.feature.player

/**
 * v21.15 记住播放画质 | Remember Quality
 * Remember preferred quality for each video
 */
class PlayerActivityQualityMemory {
    data class QualityPreference(
        val quality: String,
        val useCount: Int = 1,
    )

    fun saveQuality(
        videoId: String,
        quality: String,
    ) {}

    fun getPreferredQuality(videoId: String): String? = null

    fun clearHistory() {}

    fun getMostUsedQuality(): String? = null
}
