package blbl.cat3399.feature.player

/**
 * v21.4 播放速度预设面板 | Speed Preset Panel
 * Quick access to predefined playback speeds
 */
class PlayerActivitySpeedPreset {
    fun getPresets(): List<Float> = listOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f)
    fun addPreset(speed: Float) {}
    fun removePreset(speed: Float) {}
    fun resetToDefaults() {}
}
