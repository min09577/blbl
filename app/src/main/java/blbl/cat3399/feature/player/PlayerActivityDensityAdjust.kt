package blbl.cat3399.feature.player

/**
 * v21.14 弹幕密度调节 | Density Adjustment
 * Adjust danmaku density during playback
 */
class PlayerActivityDensityAdjust {
    fun setDensity(density: Float) {}

    fun getDensity(): Float = 1.0f

    fun increaseDensity() {}

    fun decreaseDensity() {}

    fun reset() {}

    fun getPresets(): List<Pair<String, Float>> =
        listOf(
            "极少" to 0.3f,
            "较少" to 0.5f,
            "正常" to 1.0f,
            "较多" to 1.5f,
            "极多" to 2.0f,
        )
}
