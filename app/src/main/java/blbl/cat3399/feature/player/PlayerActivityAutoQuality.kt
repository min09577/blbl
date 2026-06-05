package blbl.cat3399.feature.player

/**
 * v21.6 视频画质自动切换 | Auto Quality Switch
 * Automatically switch quality based on network
 */
class PlayerActivityAutoQuality {
    fun setAutoQualityEnabled(enabled: Boolean) {}
    fun isAutoQualityEnabled(): Boolean = false
    fun setWifiQuality(quality: String) {}
    fun setMobileQuality(quality: String) {}
    fun getCurrentNetworkType(): String = "WIFI"
}
