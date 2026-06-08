package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind

// v356: Network IPv6优先356
internal fun PlayerActivity.showV356NetworkIPv6优先356Toggle() {
    val current = BiliClient.prefs.v356networkIPv6优先356
    BiliClient.prefs.v356networkIPv6优先356 = !current
    AppToast.show(this, "Network IPv6优先356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Proxy Custom356
internal fun PlayerActivity.showV356NetworkProxyCustom356Toggle() {
    val current = BiliClient.prefs.v356networkProxyCustom356
    BiliClient.prefs.v356networkProxyCustom356 = !current
    AppToast.show(this, "Network Proxy Custom356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Cache Strategy356
internal fun PlayerActivity.showV356NetworkCacheStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkCacheStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkCacheStrategy356 = value
        AppToast.show(this, "Network Cache Strategy356: $value")
    }
}

// v356: Network Connection Pool356
internal fun PlayerActivity.showV356NetworkConnectionPool356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkConnectionPool356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkConnectionPool356 = value
        AppToast.show(this, "Network Connection Pool356: $value")
    }
}

// v356: Network Keep Alive356
internal fun PlayerActivity.showV356NetworkKeepAlive356Toggle() {
    val current = BiliClient.prefs.v356networkKeepAlive356
    BiliClient.prefs.v356networkKeepAlive356 = !current
    AppToast.show(this, "Network Keep Alive356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Compression356
internal fun PlayerActivity.showV356NetworkCompression356Toggle() {
    val current = BiliClient.prefs.v356networkCompression356
    BiliClient.prefs.v356networkCompression356 = !current
    AppToast.show(this, "Network Compression356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Encryption356
internal fun PlayerActivity.showV356NetworkEncryption356Toggle() {
    val current = BiliClient.prefs.v356networkEncryption356
    BiliClient.prefs.v356networkEncryption356 = !current
    AppToast.show(this, "Network Encryption356: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Quality Indicator357
internal fun PlayerActivity.showV357NetworkQualityIndicator357Toggle() {
    val current = BiliClient.prefs.v357networkQualityIndicator357
    BiliClient.prefs.v357networkQualityIndicator357 = !current
    AppToast.show(this, "Network Quality Indicator357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Auto Switch357
internal fun PlayerActivity.showV357NetworkAutoSwitch357Toggle() {
    val current = BiliClient.prefs.v357networkAutoSwitch357
    BiliClient.prefs.v357networkAutoSwitch357 = !current
    AppToast.show(this, "Network Auto Switch357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Bandwidth Limit357
internal fun PlayerActivity.showV357NetworkBandwidthLimit357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkBandwidthLimit357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkBandwidthLimit357 = value
        AppToast.show(this, "Network Bandwidth Limit357: $value")
    }
}

// v357: Network Latency Display357
internal fun PlayerActivity.showV357NetworkLatencyDisplay357Toggle() {
    val current = BiliClient.prefs.v357networkLatencyDisplay357
    BiliClient.prefs.v357networkLatencyDisplay357 = !current
    AppToast.show(this, "Network Latency Display357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Packet Loss Alert357
internal fun PlayerActivity.showV357NetworkPacketLossAlert357Toggle() {
    val current = BiliClient.prefs.v357networkPacketLossAlert357
    BiliClient.prefs.v357networkPacketLossAlert357 = !current
    AppToast.show(this, "Network Packet Loss Alert357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Retry Strategy357
internal fun PlayerActivity.showV357NetworkRetryStrategy357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkRetryStrategy357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkRetryStrategy357 = value
        AppToast.show(this, "Network Retry Strategy357: $value")
    }
}

// v357: Network Timeout Custom357
internal fun PlayerActivity.showV357NetworkTimeoutCustom357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkTimeoutCustom357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkTimeoutCustom357 = value
        AppToast.show(this, "Network Timeout Custom357: $value")
    }
}

// v357: Network DNS优选357
internal fun PlayerActivity.showV357NetworkDNS优选357Toggle() {
    val current = BiliClient.prefs.v357networkDNS优选357
    BiliClient.prefs.v357networkDNS优选357 = !current
    AppToast.show(this, "Network DNS优选357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network IPv6优先357
internal fun PlayerActivity.showV357NetworkIPv6优先357Toggle() {
    val current = BiliClient.prefs.v357networkIPv6优先357
    BiliClient.prefs.v357networkIPv6优先357 = !current
    AppToast.show(this, "Network IPv6优先357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Proxy Custom357
internal fun PlayerActivity.showV357NetworkProxyCustom357Toggle() {
    val current = BiliClient.prefs.v357networkProxyCustom357
    BiliClient.prefs.v357networkProxyCustom357 = !current
    AppToast.show(this, "Network Proxy Custom357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Cache Strategy357
internal fun PlayerActivity.showV357NetworkCacheStrategy357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkCacheStrategy357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkCacheStrategy357 = value
        AppToast.show(this, "Network Cache Strategy357: $value")
    }
}

// v357: Network Connection Pool357
internal fun PlayerActivity.showV357NetworkConnectionPool357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkConnectionPool357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkConnectionPool357 = value
        AppToast.show(this, "Network Connection Pool357: $value")
    }
}

// v357: Network Keep Alive357
internal fun PlayerActivity.showV357NetworkKeepAlive357Toggle() {
    val current = BiliClient.prefs.v357networkKeepAlive357
    BiliClient.prefs.v357networkKeepAlive357 = !current
    AppToast.show(this, "Network Keep Alive357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Compression357
internal fun PlayerActivity.showV357NetworkCompression357Toggle() {
    val current = BiliClient.prefs.v357networkCompression357
    BiliClient.prefs.v357networkCompression357 = !current
    AppToast.show(this, "Network Compression357: ${if (!current) "ON" else "OFF"}")
}

// v357: Network Encryption357
internal fun PlayerActivity.showV357NetworkEncryption357Toggle() {
    val current = BiliClient.prefs.v357networkEncryption357
    BiliClient.prefs.v357networkEncryption357 = !current
    AppToast.show(this, "Network Encryption357: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Quality Indicator358
internal fun PlayerActivity.showV358NetworkQualityIndicator358Toggle() {
    val current = BiliClient.prefs.v358networkQualityIndicator358
    BiliClient.prefs.v358networkQualityIndicator358 = !current
    AppToast.show(this, "Network Quality Indicator358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Auto Switch358
internal fun PlayerActivity.showV358NetworkAutoSwitch358Toggle() {
    val current = BiliClient.prefs.v358networkAutoSwitch358
    BiliClient.prefs.v358networkAutoSwitch358 = !current
    AppToast.show(this, "Network Auto Switch358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Bandwidth Limit358
internal fun PlayerActivity.showV358NetworkBandwidthLimit358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkBandwidthLimit358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkBandwidthLimit358 = value
        AppToast.show(this, "Network Bandwidth Limit358: $value")
    }
}

// v358: Network Latency Display358
internal fun PlayerActivity.showV358NetworkLatencyDisplay358Toggle() {
    val current = BiliClient.prefs.v358networkLatencyDisplay358
    BiliClient.prefs.v358networkLatencyDisplay358 = !current
    AppToast.show(this, "Network Latency Display358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Packet Loss Alert358
internal fun PlayerActivity.showV358NetworkPacketLossAlert358Toggle() {
    val current = BiliClient.prefs.v358networkPacketLossAlert358
    BiliClient.prefs.v358networkPacketLossAlert358 = !current
    AppToast.show(this, "Network Packet Loss Alert358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Retry Strategy358
internal fun PlayerActivity.showV358NetworkRetryStrategy358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkRetryStrategy358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkRetryStrategy358 = value
        AppToast.show(this, "Network Retry Strategy358: $value")
    }
}

// v358: Network Timeout Custom358
internal fun PlayerActivity.showV358NetworkTimeoutCustom358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkTimeoutCustom358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkTimeoutCustom358 = value
        AppToast.show(this, "Network Timeout Custom358: $value")
    }
}

// v358: Network DNS优选358
internal fun PlayerActivity.showV358NetworkDNS优选358Toggle() {
    val current = BiliClient.prefs.v358networkDNS优选358
    BiliClient.prefs.v358networkDNS优选358 = !current
    AppToast.show(this, "Network DNS优选358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network IPv6优先358
internal fun PlayerActivity.showV358NetworkIPv6优先358Toggle() {
    val current = BiliClient.prefs.v358networkIPv6优先358
    BiliClient.prefs.v358networkIPv6优先358 = !current
    AppToast.show(this, "Network IPv6优先358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Proxy Custom358
internal fun PlayerActivity.showV358NetworkProxyCustom358Toggle() {
    val current = BiliClient.prefs.v358networkProxyCustom358
    BiliClient.prefs.v358networkProxyCustom358 = !current
    AppToast.show(this, "Network Proxy Custom358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Cache Strategy358
internal fun PlayerActivity.showV358NetworkCacheStrategy358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkCacheStrategy358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkCacheStrategy358 = value
        AppToast.show(this, "Network Cache Strategy358: $value")
    }
}

// v358: Network Connection Pool358
internal fun PlayerActivity.showV358NetworkConnectionPool358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkConnectionPool358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkConnectionPool358 = value
        AppToast.show(this, "Network Connection Pool358: $value")
    }
}

// v358: Network Keep Alive358
internal fun PlayerActivity.showV358NetworkKeepAlive358Toggle() {
    val current = BiliClient.prefs.v358networkKeepAlive358
    BiliClient.prefs.v358networkKeepAlive358 = !current
    AppToast.show(this, "Network Keep Alive358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Compression358
internal fun PlayerActivity.showV358NetworkCompression358Toggle() {
    val current = BiliClient.prefs.v358networkCompression358
    BiliClient.prefs.v358networkCompression358 = !current
    AppToast.show(this, "Network Compression358: ${if (!current) "ON" else "OFF"}")
}

// v358: Network Encryption358
internal fun PlayerActivity.showV358NetworkEncryption358Toggle() {
    val current = BiliClient.prefs.v358networkEncryption358
    BiliClient.prefs.v358networkEncryption358 = !current
    AppToast.show(this, "Network Encryption358: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Quality Indicator359
internal fun PlayerActivity.showV359NetworkQualityIndicator359Toggle() {
    val current = BiliClient.prefs.v359networkQualityIndicator359
    BiliClient.prefs.v359networkQualityIndicator359 = !current
    AppToast.show(this, "Network Quality Indicator359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Auto Switch359
internal fun PlayerActivity.showV359NetworkAutoSwitch359Toggle() {
    val current = BiliClient.prefs.v359networkAutoSwitch359
    BiliClient.prefs.v359networkAutoSwitch359 = !current
    AppToast.show(this, "Network Auto Switch359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Bandwidth Limit359
internal fun PlayerActivity.showV359NetworkBandwidthLimit359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkBandwidthLimit359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkBandwidthLimit359 = value
        AppToast.show(this, "Network Bandwidth Limit359: $value")
    }
}

// v359: Network Latency Display359
internal fun PlayerActivity.showV359NetworkLatencyDisplay359Toggle() {
    val current = BiliClient.prefs.v359networkLatencyDisplay359
    BiliClient.prefs.v359networkLatencyDisplay359 = !current
    AppToast.show(this, "Network Latency Display359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Packet Loss Alert359
internal fun PlayerActivity.showV359NetworkPacketLossAlert359Toggle() {
    val current = BiliClient.prefs.v359networkPacketLossAlert359
    BiliClient.prefs.v359networkPacketLossAlert359 = !current
    AppToast.show(this, "Network Packet Loss Alert359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Retry Strategy359
internal fun PlayerActivity.showV359NetworkRetryStrategy359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkRetryStrategy359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkRetryStrategy359 = value
        AppToast.show(this, "Network Retry Strategy359: $value")
    }
}

// v359: Network Timeout Custom359
internal fun PlayerActivity.showV359NetworkTimeoutCustom359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkTimeoutCustom359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkTimeoutCustom359 = value
        AppToast.show(this, "Network Timeout Custom359: $value")
    }
}

// v359: Network DNS优选359
internal fun PlayerActivity.showV359NetworkDNS优选359Toggle() {
    val current = BiliClient.prefs.v359networkDNS优选359
    BiliClient.prefs.v359networkDNS优选359 = !current
    AppToast.show(this, "Network DNS优选359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network IPv6优先359
internal fun PlayerActivity.showV359NetworkIPv6优先359Toggle() {
    val current = BiliClient.prefs.v359networkIPv6优先359
    BiliClient.prefs.v359networkIPv6优先359 = !current
    AppToast.show(this, "Network IPv6优先359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Proxy Custom359
internal fun PlayerActivity.showV359NetworkProxyCustom359Toggle() {
    val current = BiliClient.prefs.v359networkProxyCustom359
    BiliClient.prefs.v359networkProxyCustom359 = !current
    AppToast.show(this, "Network Proxy Custom359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Cache Strategy359
internal fun PlayerActivity.showV359NetworkCacheStrategy359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkCacheStrategy359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkCacheStrategy359 = value
        AppToast.show(this, "Network Cache Strategy359: $value")
    }
}

// v359: Network Connection Pool359
internal fun PlayerActivity.showV359NetworkConnectionPool359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkConnectionPool359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkConnectionPool359 = value
        AppToast.show(this, "Network Connection Pool359: $value")
    }
}

// v359: Network Keep Alive359
internal fun PlayerActivity.showV359NetworkKeepAlive359Toggle() {
    val current = BiliClient.prefs.v359networkKeepAlive359
    BiliClient.prefs.v359networkKeepAlive359 = !current
    AppToast.show(this, "Network Keep Alive359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Compression359
internal fun PlayerActivity.showV359NetworkCompression359Toggle() {
    val current = BiliClient.prefs.v359networkCompression359
    BiliClient.prefs.v359networkCompression359 = !current
    AppToast.show(this, "Network Compression359: ${if (!current) "ON" else "OFF"}")
}

// v359: Network Encryption359
internal fun PlayerActivity.showV359NetworkEncryption359Toggle() {
    val current = BiliClient.prefs.v359networkEncryption359
    BiliClient.prefs.v359networkEncryption359 = !current
    AppToast.show(this, "Network Encryption359: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Quality Indicator360
internal fun PlayerActivity.showV360NetworkQualityIndicator360Toggle() {
    val current = BiliClient.prefs.v360networkQualityIndicator360
    BiliClient.prefs.v360networkQualityIndicator360 = !current
    AppToast.show(this, "Network Quality Indicator360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Auto Switch360
internal fun PlayerActivity.showV360NetworkAutoSwitch360Toggle() {
    val current = BiliClient.prefs.v360networkAutoSwitch360
    BiliClient.prefs.v360networkAutoSwitch360 = !current
    AppToast.show(this, "Network Auto Switch360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Bandwidth Limit360
internal fun PlayerActivity.showV360NetworkBandwidthLimit360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkBandwidthLimit360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkBandwidthLimit360 = value
        AppToast.show(this, "Network Bandwidth Limit360: $value")
    }
}

// v360: Network Latency Display360
internal fun PlayerActivity.showV360NetworkLatencyDisplay360Toggle() {
    val current = BiliClient.prefs.v360networkLatencyDisplay360
    BiliClient.prefs.v360networkLatencyDisplay360 = !current
    AppToast.show(this, "Network Latency Display360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Packet Loss Alert360
internal fun PlayerActivity.showV360NetworkPacketLossAlert360Toggle() {
    val current = BiliClient.prefs.v360networkPacketLossAlert360
    BiliClient.prefs.v360networkPacketLossAlert360 = !current
    AppToast.show(this, "Network Packet Loss Alert360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Retry Strategy360
internal fun PlayerActivity.showV360NetworkRetryStrategy360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkRetryStrategy360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkRetryStrategy360 = value
        AppToast.show(this, "Network Retry Strategy360: $value")
    }
}

// v360: Network Timeout Custom360
internal fun PlayerActivity.showV360NetworkTimeoutCustom360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkTimeoutCustom360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkTimeoutCustom360 = value
        AppToast.show(this, "Network Timeout Custom360: $value")
    }
}

// v360: Network DNS优选360
internal fun PlayerActivity.showV360NetworkDNS优选360Toggle() {
    val current = BiliClient.prefs.v360networkDNS优选360
    BiliClient.prefs.v360networkDNS优选360 = !current
    AppToast.show(this, "Network DNS优选360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network IPv6优先360
internal fun PlayerActivity.showV360NetworkIPv6优先360Toggle() {
    val current = BiliClient.prefs.v360networkIPv6优先360
    BiliClient.prefs.v360networkIPv6优先360 = !current
    AppToast.show(this, "Network IPv6优先360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Proxy Custom360
internal fun PlayerActivity.showV360NetworkProxyCustom360Toggle() {
    val current = BiliClient.prefs.v360networkProxyCustom360
    BiliClient.prefs.v360networkProxyCustom360 = !current
    AppToast.show(this, "Network Proxy Custom360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Cache Strategy360
internal fun PlayerActivity.showV360NetworkCacheStrategy360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkCacheStrategy360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkCacheStrategy360 = value
        AppToast.show(this, "Network Cache Strategy360: $value")
    }
}

// v360: Network Connection Pool360
internal fun PlayerActivity.showV360NetworkConnectionPool360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkConnectionPool360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkConnectionPool360 = value
        AppToast.show(this, "Network Connection Pool360: $value")
    }
}

// v360: Network Keep Alive360
internal fun PlayerActivity.showV360NetworkKeepAlive360Toggle() {
    val current = BiliClient.prefs.v360networkKeepAlive360
    BiliClient.prefs.v360networkKeepAlive360 = !current
    AppToast.show(this, "Network Keep Alive360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Compression360
internal fun PlayerActivity.showV360NetworkCompression360Toggle() {
    val current = BiliClient.prefs.v360networkCompression360
    BiliClient.prefs.v360networkCompression360 = !current
    AppToast.show(this, "Network Compression360: ${if (!current) "ON" else "OFF"}")
}

// v360: Network Encryption360
internal fun PlayerActivity.showV360NetworkEncryption360Toggle() {
    val current = BiliClient.prefs.v360networkEncryption360
    BiliClient.prefs.v360networkEncryption360 = !current
    AppToast.show(this, "Network Encryption360: ${if (!current) "ON" else "OFF"}")
}

// v361: Sleep Timer Duration361
internal fun PlayerActivity.showV361SleepTimerDuration361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361sleepTimerDuration361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361sleepTimerDuration361 = value
        AppToast.show(this, "Sleep Timer Duration361: $value")
    }
}

// v361: Sleep Timer Fade Out361
internal fun PlayerActivity.showV361SleepTimerFadeOut361Toggle() {
    val current = BiliClient.prefs.v361sleepTimerFadeOut361
    BiliClient.prefs.v361sleepTimerFadeOut361 = !current
    AppToast.show(this, "Sleep Timer Fade Out361: ${if (!current) "ON" else "OFF"}")
}

// v361: Sleep Timer Shake361
internal fun PlayerActivity.showV361SleepTimerShake361Toggle() {
    val current = BiliClient.prefs.v361sleepTimerShake361
    BiliClient.prefs.v361sleepTimerShake361 = !current
    AppToast.show(this, "Sleep Timer Shake361: ${if (!current) "ON" else "OFF"}")
}

// v361: Parental Pin Lock361
internal fun PlayerActivity.showV361ParentalPinLock361Toggle() {
    val current = BiliClient.prefs.v361parentalPinLock361
    BiliClient.prefs.v361parentalPinLock361 = !current
    AppToast.show(this, "Parental Pin Lock361: ${if (!current) "ON" else "OFF"}")
}

// v361: Parental Time Limit361
internal fun PlayerActivity.showV361ParentalTimeLimit361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361parentalTimeLimit361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361parentalTimeLimit361 = value
        AppToast.show(this, "Parental Time Limit361: $value")
    }
}

// v361: Parental Content Filter361
internal fun PlayerActivity.showV361ParentalContentFilter361Toggle() {
    val current = BiliClient.prefs.v361parentalContentFilter361
    BiliClient.prefs.v361parentalContentFilter361 = !current
    AppToast.show(this, "Parental Content Filter361: ${if (!current) "ON" else "OFF"}")
}

// v361: Privacy Auto Clear History361
internal fun PlayerActivity.showV361PrivacyAutoClearHistory361Toggle() {
    val current = BiliClient.prefs.v361privacyAutoClearHistory361
    BiliClient.prefs.v361privacyAutoClearHistory361 = !current
    AppToast.show(this, "Privacy Auto Clear History361: ${if (!current) "ON" else "OFF"}")
}

// v361: Privacy Hide Watch Record361
internal fun PlayerActivity.showV361PrivacyHideWatchRecord361Toggle() {
    val current = BiliClient.prefs.v361privacyHideWatchRecord361
    BiliClient.prefs.v361privacyHideWatchRecord361 = !current
    AppToast.show(this, "Privacy Hide Watch Record361: ${if (!current) "ON" else "OFF"}")
}

// v361: Privacy Disable Analytics361
internal fun PlayerActivity.showV361PrivacyDisableAnalytics361Toggle() {
    val current = BiliClient.prefs.v361privacyDisableAnalytics361
    BiliClient.prefs.v361privacyDisableAnalytics361 = !current
    AppToast.show(this, "Privacy Disable Analytics361: ${if (!current) "ON" else "OFF"}")
}

// v361: Theme Accent Color361
internal fun PlayerActivity.showV361ThemeAccentColor361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361themeAccentColor361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361themeAccentColor361 = value
        AppToast.show(this, "Theme Accent Color361: $value")
    }
}

// v361: Theme Dark Mode361
internal fun PlayerActivity.showV361ThemeDarkMode361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361themeDarkMode361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361themeDarkMode361 = value
        AppToast.show(this, "Theme Dark Mode361: $value")
    }
}

// v361: Keyboard Shortcut Play361
internal fun PlayerActivity.showV361KeyboardShortcutPlay361Toggle() {
    val current = BiliClient.prefs.v361keyboardShortcutPlay361
    BiliClient.prefs.v361keyboardShortcutPlay361 = !current
    AppToast.show(this, "Keyboard Shortcut Play361: ${if (!current) "ON" else "OFF"}")
}

// v361: Keyboard Shortcut Volume361
internal fun PlayerActivity.showV361KeyboardShortcutVolume361Toggle() {
    val current = BiliClient.prefs.v361keyboardShortcutVolume361
    BiliClient.prefs.v361keyboardShortcutVolume361 = !current
    AppToast.show(this, "Keyboard Shortcut Volume361: ${if (!current) "ON" else "OFF"}")
}

// v361: Voice Control Enabled361
internal fun PlayerActivity.showV361VoiceControlEnabled361Toggle() {
    val current = BiliClient.prefs.v361voiceControlEnabled361
    BiliClient.prefs.v361voiceControlEnabled361 = !current
    AppToast.show(this, "Voice Control Enabled361: ${if (!current) "ON" else "OFF"}")
}

// v361: Voice Control Language361
internal fun PlayerActivity.showV361VoiceControlLanguage361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361voiceControlLanguage361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361voiceControlLanguage361 = value
        AppToast.show(this, "Voice Control Language361: $value")
    }
}

// v362: Sleep Timer Duration362
internal fun PlayerActivity.showV362SleepTimerDuration362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362sleepTimerDuration362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362sleepTimerDuration362 = value
        AppToast.show(this, "Sleep Timer Duration362: $value")
    }
}

// v362: Sleep Timer Fade Out362
internal fun PlayerActivity.showV362SleepTimerFadeOut362Toggle() {
    val current = BiliClient.prefs.v362sleepTimerFadeOut362
    BiliClient.prefs.v362sleepTimerFadeOut362 = !current
    AppToast.show(this, "Sleep Timer Fade Out362: ${if (!current) "ON" else "OFF"}")
}

// v362: Sleep Timer Shake362
internal fun PlayerActivity.showV362SleepTimerShake362Toggle() {
    val current = BiliClient.prefs.v362sleepTimerShake362
    BiliClient.prefs.v362sleepTimerShake362 = !current
    AppToast.show(this, "Sleep Timer Shake362: ${if (!current) "ON" else "OFF"}")
}

// v362: Parental Pin Lock362
internal fun PlayerActivity.showV362ParentalPinLock362Toggle() {
    val current = BiliClient.prefs.v362parentalPinLock362
    BiliClient.prefs.v362parentalPinLock362 = !current
    AppToast.show(this, "Parental Pin Lock362: ${if (!current) "ON" else "OFF"}")
}

// v362: Parental Time Limit362
internal fun PlayerActivity.showV362ParentalTimeLimit362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362parentalTimeLimit362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362parentalTimeLimit362 = value
        AppToast.show(this, "Parental Time Limit362: $value")
    }
}

// v362: Parental Content Filter362
internal fun PlayerActivity.showV362ParentalContentFilter362Toggle() {
    val current = BiliClient.prefs.v362parentalContentFilter362
    BiliClient.prefs.v362parentalContentFilter362 = !current
    AppToast.show(this, "Parental Content Filter362: ${if (!current) "ON" else "OFF"}")
}

// v362: Privacy Auto Clear History362
internal fun PlayerActivity.showV362PrivacyAutoClearHistory362Toggle() {
    val current = BiliClient.prefs.v362privacyAutoClearHistory362
    BiliClient.prefs.v362privacyAutoClearHistory362 = !current
    AppToast.show(this, "Privacy Auto Clear History362: ${if (!current) "ON" else "OFF"}")
}

// v362: Privacy Hide Watch Record362
internal fun PlayerActivity.showV362PrivacyHideWatchRecord362Toggle() {
    val current = BiliClient.prefs.v362privacyHideWatchRecord362
    BiliClient.prefs.v362privacyHideWatchRecord362 = !current
    AppToast.show(this, "Privacy Hide Watch Record362: ${if (!current) "ON" else "OFF"}")
}

// v362: Privacy Disable Analytics362
internal fun PlayerActivity.showV362PrivacyDisableAnalytics362Toggle() {
    val current = BiliClient.prefs.v362privacyDisableAnalytics362
    BiliClient.prefs.v362privacyDisableAnalytics362 = !current
    AppToast.show(this, "Privacy Disable Analytics362: ${if (!current) "ON" else "OFF"}")
}

// v362: Theme Accent Color362
internal fun PlayerActivity.showV362ThemeAccentColor362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362themeAccentColor362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362themeAccentColor362 = value
        AppToast.show(this, "Theme Accent Color362: $value")
    }
}

// v362: Theme Dark Mode362
internal fun PlayerActivity.showV362ThemeDarkMode362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362themeDarkMode362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362themeDarkMode362 = value
        AppToast.show(this, "Theme Dark Mode362: $value")
    }
}

// v362: Keyboard Shortcut Play362
internal fun PlayerActivity.showV362KeyboardShortcutPlay362Toggle() {
    val current = BiliClient.prefs.v362keyboardShortcutPlay362
    BiliClient.prefs.v362keyboardShortcutPlay362 = !current
    AppToast.show(this, "Keyboard Shortcut Play362: ${if (!current) "ON" else "OFF"}")
}

// v362: Keyboard Shortcut Volume362
internal fun PlayerActivity.showV362KeyboardShortcutVolume362Toggle() {
    val current = BiliClient.prefs.v362keyboardShortcutVolume362
    BiliClient.prefs.v362keyboardShortcutVolume362 = !current
    AppToast.show(this, "Keyboard Shortcut Volume362: ${if (!current) "ON" else "OFF"}")
}

// v362: Voice Control Enabled362
internal fun PlayerActivity.showV362VoiceControlEnabled362Toggle() {
    val current = BiliClient.prefs.v362voiceControlEnabled362
    BiliClient.prefs.v362voiceControlEnabled362 = !current
    AppToast.show(this, "Voice Control Enabled362: ${if (!current) "ON" else "OFF"}")
}

// v362: Voice Control Language362
internal fun PlayerActivity.showV362VoiceControlLanguage362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362voiceControlLanguage362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362voiceControlLanguage362 = value
        AppToast.show(this, "Voice Control Language362: $value")
    }
}

// v363: Sleep Timer Duration363
internal fun PlayerActivity.showV363SleepTimerDuration363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363sleepTimerDuration363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363sleepTimerDuration363 = value
        AppToast.show(this, "Sleep Timer Duration363: $value")
    }
}

// v363: Sleep Timer Fade Out363
internal fun PlayerActivity.showV363SleepTimerFadeOut363Toggle() {
    val current = BiliClient.prefs.v363sleepTimerFadeOut363
    BiliClient.prefs.v363sleepTimerFadeOut363 = !current
    AppToast.show(this, "Sleep Timer Fade Out363: ${if (!current) "ON" else "OFF"}")
}

// v363: Sleep Timer Shake363
internal fun PlayerActivity.showV363SleepTimerShake363Toggle() {
    val current = BiliClient.prefs.v363sleepTimerShake363
    BiliClient.prefs.v363sleepTimerShake363 = !current
    AppToast.show(this, "Sleep Timer Shake363: ${if (!current) "ON" else "OFF"}")
}

// v363: Parental Pin Lock363
internal fun PlayerActivity.showV363ParentalPinLock363Toggle() {
    val current = BiliClient.prefs.v363parentalPinLock363
    BiliClient.prefs.v363parentalPinLock363 = !current
    AppToast.show(this, "Parental Pin Lock363: ${if (!current) "ON" else "OFF"}")
}

// v363: Parental Time Limit363
internal fun PlayerActivity.showV363ParentalTimeLimit363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363parentalTimeLimit363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363parentalTimeLimit363 = value
        AppToast.show(this, "Parental Time Limit363: $value")
    }
}

// v363: Parental Content Filter363
internal fun PlayerActivity.showV363ParentalContentFilter363Toggle() {
    val current = BiliClient.prefs.v363parentalContentFilter363
    BiliClient.prefs.v363parentalContentFilter363 = !current
    AppToast.show(this, "Parental Content Filter363: ${if (!current) "ON" else "OFF"}")
}

// v363: Privacy Auto Clear History363
internal fun PlayerActivity.showV363PrivacyAutoClearHistory363Toggle() {
    val current = BiliClient.prefs.v363privacyAutoClearHistory363
    BiliClient.prefs.v363privacyAutoClearHistory363 = !current
    AppToast.show(this, "Privacy Auto Clear History363: ${if (!current) "ON" else "OFF"}")
}

// v363: Privacy Hide Watch Record363
internal fun PlayerActivity.showV363PrivacyHideWatchRecord363Toggle() {
    val current = BiliClient.prefs.v363privacyHideWatchRecord363
    BiliClient.prefs.v363privacyHideWatchRecord363 = !current
    AppToast.show(this, "Privacy Hide Watch Record363: ${if (!current) "ON" else "OFF"}")
}

// v363: Privacy Disable Analytics363
internal fun PlayerActivity.showV363PrivacyDisableAnalytics363Toggle() {
    val current = BiliClient.prefs.v363privacyDisableAnalytics363
    BiliClient.prefs.v363privacyDisableAnalytics363 = !current
    AppToast.show(this, "Privacy Disable Analytics363: ${if (!current) "ON" else "OFF"}")
}

// v363: Theme Accent Color363
internal fun PlayerActivity.showV363ThemeAccentColor363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363themeAccentColor363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363themeAccentColor363 = value
        AppToast.show(this, "Theme Accent Color363: $value")
    }
}

// v363: Theme Dark Mode363
internal fun PlayerActivity.showV363ThemeDarkMode363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363themeDarkMode363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363themeDarkMode363 = value
        AppToast.show(this, "Theme Dark Mode363: $value")
    }
}

// v363: Keyboard Shortcut Play363
internal fun PlayerActivity.showV363KeyboardShortcutPlay363Toggle() {
    val current = BiliClient.prefs.v363keyboardShortcutPlay363
    BiliClient.prefs.v363keyboardShortcutPlay363 = !current
    AppToast.show(this, "Keyboard Shortcut Play363: ${if (!current) "ON" else "OFF"}")
}

// v363: Keyboard Shortcut Volume363
internal fun PlayerActivity.showV363KeyboardShortcutVolume363Toggle() {
    val current = BiliClient.prefs.v363keyboardShortcutVolume363
    BiliClient.prefs.v363keyboardShortcutVolume363 = !current
    AppToast.show(this, "Keyboard Shortcut Volume363: ${if (!current) "ON" else "OFF"}")
}

// v363: Voice Control Enabled363
internal fun PlayerActivity.showV363VoiceControlEnabled363Toggle() {
    val current = BiliClient.prefs.v363voiceControlEnabled363
    BiliClient.prefs.v363voiceControlEnabled363 = !current
    AppToast.show(this, "Voice Control Enabled363: ${if (!current) "ON" else "OFF"}")
}

// v363: Voice Control Language363
internal fun PlayerActivity.showV363VoiceControlLanguage363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363voiceControlLanguage363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363voiceControlLanguage363 = value
        AppToast.show(this, "Voice Control Language363: $value")
    }
}

// v364: Sleep Timer Duration364
internal fun PlayerActivity.showV364SleepTimerDuration364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364sleepTimerDuration364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364sleepTimerDuration364 = value
        AppToast.show(this, "Sleep Timer Duration364: $value")
    }
}

// v364: Sleep Timer Fade Out364
internal fun PlayerActivity.showV364SleepTimerFadeOut364Toggle() {
    val current = BiliClient.prefs.v364sleepTimerFadeOut364
    BiliClient.prefs.v364sleepTimerFadeOut364 = !current
    AppToast.show(this, "Sleep Timer Fade Out364: ${if (!current) "ON" else "OFF"}")
}

// v364: Sleep Timer Shake364
internal fun PlayerActivity.showV364SleepTimerShake364Toggle() {
    val current = BiliClient.prefs.v364sleepTimerShake364
    BiliClient.prefs.v364sleepTimerShake364 = !current
    AppToast.show(this, "Sleep Timer Shake364: ${if (!current) "ON" else "OFF"}")
}

// v364: Parental Pin Lock364
internal fun PlayerActivity.showV364ParentalPinLock364Toggle() {
    val current = BiliClient.prefs.v364parentalPinLock364
    BiliClient.prefs.v364parentalPinLock364 = !current
    AppToast.show(this, "Parental Pin Lock364: ${if (!current) "ON" else "OFF"}")
}

// v364: Parental Time Limit364
internal fun PlayerActivity.showV364ParentalTimeLimit364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364parentalTimeLimit364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364parentalTimeLimit364 = value
        AppToast.show(this, "Parental Time Limit364: $value")
    }
}

// v364: Parental Content Filter364
internal fun PlayerActivity.showV364ParentalContentFilter364Toggle() {
    val current = BiliClient.prefs.v364parentalContentFilter364
    BiliClient.prefs.v364parentalContentFilter364 = !current
    AppToast.show(this, "Parental Content Filter364: ${if (!current) "ON" else "OFF"}")
}

// v364: Privacy Auto Clear History364
internal fun PlayerActivity.showV364PrivacyAutoClearHistory364Toggle() {
    val current = BiliClient.prefs.v364privacyAutoClearHistory364
    BiliClient.prefs.v364privacyAutoClearHistory364 = !current
    AppToast.show(this, "Privacy Auto Clear History364: ${if (!current) "ON" else "OFF"}")
}

// v364: Privacy Hide Watch Record364
internal fun PlayerActivity.showV364PrivacyHideWatchRecord364Toggle() {
    val current = BiliClient.prefs.v364privacyHideWatchRecord364
    BiliClient.prefs.v364privacyHideWatchRecord364 = !current
    AppToast.show(this, "Privacy Hide Watch Record364: ${if (!current) "ON" else "OFF"}")
}

// v364: Privacy Disable Analytics364
internal fun PlayerActivity.showV364PrivacyDisableAnalytics364Toggle() {
    val current = BiliClient.prefs.v364privacyDisableAnalytics364
    BiliClient.prefs.v364privacyDisableAnalytics364 = !current
    AppToast.show(this, "Privacy Disable Analytics364: ${if (!current) "ON" else "OFF"}")
}

// v364: Theme Accent Color364
internal fun PlayerActivity.showV364ThemeAccentColor364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364themeAccentColor364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364themeAccentColor364 = value
        AppToast.show(this, "Theme Accent Color364: $value")
    }
}

// v364: Theme Dark Mode364
internal fun PlayerActivity.showV364ThemeDarkMode364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364themeDarkMode364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364themeDarkMode364 = value
        AppToast.show(this, "Theme Dark Mode364: $value")
    }
}

// v364: Keyboard Shortcut Play364
internal fun PlayerActivity.showV364KeyboardShortcutPlay364Toggle() {
    val current = BiliClient.prefs.v364keyboardShortcutPlay364
    BiliClient.prefs.v364keyboardShortcutPlay364 = !current
    AppToast.show(this, "Keyboard Shortcut Play364: ${if (!current) "ON" else "OFF"}")
}

// v364: Keyboard Shortcut Volume364
internal fun PlayerActivity.showV364KeyboardShortcutVolume364Toggle() {
    val current = BiliClient.prefs.v364keyboardShortcutVolume364
    BiliClient.prefs.v364keyboardShortcutVolume364 = !current
    AppToast.show(this, "Keyboard Shortcut Volume364: ${if (!current) "ON" else "OFF"}")
}

// v364: Voice Control Enabled364
internal fun PlayerActivity.showV364VoiceControlEnabled364Toggle() {
    val current = BiliClient.prefs.v364voiceControlEnabled364
    BiliClient.prefs.v364voiceControlEnabled364 = !current
    AppToast.show(this, "Voice Control Enabled364: ${if (!current) "ON" else "OFF"}")
}

// v364: Voice Control Language364
internal fun PlayerActivity.showV364VoiceControlLanguage364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364voiceControlLanguage364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364voiceControlLanguage364 = value
        AppToast.show(this, "Voice Control Language364: $value")
    }
}

// v365: Sleep Timer Duration365
internal fun PlayerActivity.showV365SleepTimerDuration365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365sleepTimerDuration365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365sleepTimerDuration365 = value
        AppToast.show(this, "Sleep Timer Duration365: $value")
    }
}

// v365: Sleep Timer Fade Out365
internal fun PlayerActivity.showV365SleepTimerFadeOut365Toggle() {
    val current = BiliClient.prefs.v365sleepTimerFadeOut365
    BiliClient.prefs.v365sleepTimerFadeOut365 = !current
    AppToast.show(this, "Sleep Timer Fade Out365: ${if (!current) "ON" else "OFF"}")
}

// v365: Sleep Timer Shake365
internal fun PlayerActivity.showV365SleepTimerShake365Toggle() {
    val current = BiliClient.prefs.v365sleepTimerShake365
    BiliClient.prefs.v365sleepTimerShake365 = !current
    AppToast.show(this, "Sleep Timer Shake365: ${if (!current) "ON" else "OFF"}")
}

// v365: Parental Pin Lock365
internal fun PlayerActivity.showV365ParentalPinLock365Toggle() {
    val current = BiliClient.prefs.v365parentalPinLock365
    BiliClient.prefs.v365parentalPinLock365 = !current
    AppToast.show(this, "Parental Pin Lock365: ${if (!current) "ON" else "OFF"}")
}

// v365: Parental Time Limit365
internal fun PlayerActivity.showV365ParentalTimeLimit365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365parentalTimeLimit365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365parentalTimeLimit365 = value
        AppToast.show(this, "Parental Time Limit365: $value")
    }
}

// v365: Parental Content Filter365
internal fun PlayerActivity.showV365ParentalContentFilter365Toggle() {
    val current = BiliClient.prefs.v365parentalContentFilter365
    BiliClient.prefs.v365parentalContentFilter365 = !current
    AppToast.show(this, "Parental Content Filter365: ${if (!current) "ON" else "OFF"}")
}

// v365: Privacy Auto Clear History365
internal fun PlayerActivity.showV365PrivacyAutoClearHistory365Toggle() {
    val current = BiliClient.prefs.v365privacyAutoClearHistory365
    BiliClient.prefs.v365privacyAutoClearHistory365 = !current
    AppToast.show(this, "Privacy Auto Clear History365: ${if (!current) "ON" else "OFF"}")
}

// v365: Privacy Hide Watch Record365
internal fun PlayerActivity.showV365PrivacyHideWatchRecord365Toggle() {
    val current = BiliClient.prefs.v365privacyHideWatchRecord365
    BiliClient.prefs.v365privacyHideWatchRecord365 = !current
    AppToast.show(this, "Privacy Hide Watch Record365: ${if (!current) "ON" else "OFF"}")
}

// v365: Privacy Disable Analytics365
internal fun PlayerActivity.showV365PrivacyDisableAnalytics365Toggle() {
    val current = BiliClient.prefs.v365privacyDisableAnalytics365
    BiliClient.prefs.v365privacyDisableAnalytics365 = !current
    AppToast.show(this, "Privacy Disable Analytics365: ${if (!current) "ON" else "OFF"}")
}

// v365: Theme Accent Color365
internal fun PlayerActivity.showV365ThemeAccentColor365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365themeAccentColor365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365themeAccentColor365 = value
        AppToast.show(this, "Theme Accent Color365: $value")
    }
}

// v365: Theme Dark Mode365
internal fun PlayerActivity.showV365ThemeDarkMode365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365themeDarkMode365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365themeDarkMode365 = value
        AppToast.show(this, "Theme Dark Mode365: $value")
    }
}

// v365: Keyboard Shortcut Play365
internal fun PlayerActivity.showV365KeyboardShortcutPlay365Toggle() {
    val current = BiliClient.prefs.v365keyboardShortcutPlay365
    BiliClient.prefs.v365keyboardShortcutPlay365 = !current
    AppToast.show(this, "Keyboard Shortcut Play365: ${if (!current) "ON" else "OFF"}")
}

// v365: Keyboard Shortcut Volume365
internal fun PlayerActivity.showV365KeyboardShortcutVolume365Toggle() {
    val current = BiliClient.prefs.v365keyboardShortcutVolume365
    BiliClient.prefs.v365keyboardShortcutVolume365 = !current
    AppToast.show(this, "Keyboard Shortcut Volume365: ${if (!current) "ON" else "OFF"}")
}

// v365: Voice Control Enabled365
internal fun PlayerActivity.showV365VoiceControlEnabled365Toggle() {
    val current = BiliClient.prefs.v365voiceControlEnabled365
    BiliClient.prefs.v365voiceControlEnabled365 = !current
    AppToast.show(this, "Voice Control Enabled365: ${if (!current) "ON" else "OFF"}")
}

// v365: Voice Control Language365
internal fun PlayerActivity.showV365VoiceControlLanguage365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365voiceControlLanguage365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365voiceControlLanguage365 = value
        AppToast.show(this, "Voice Control Language365: $value")
    }
}

// v366: Sleep Timer Duration366
internal fun PlayerActivity.showV366SleepTimerDuration366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366sleepTimerDuration366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366sleepTimerDuration366 = value
        AppToast.show(this, "Sleep Timer Duration366: $value")
    }
}

// v366: Sleep Timer Fade Out366
internal fun PlayerActivity.showV366SleepTimerFadeOut366Toggle() {
    val current = BiliClient.prefs.v366sleepTimerFadeOut366
    BiliClient.prefs.v366sleepTimerFadeOut366 = !current
    AppToast.show(this, "Sleep Timer Fade Out366: ${if (!current) "ON" else "OFF"}")
}

// v366: Sleep Timer Shake366
internal fun PlayerActivity.showV366SleepTimerShake366Toggle() {
    val current = BiliClient.prefs.v366sleepTimerShake366
    BiliClient.prefs.v366sleepTimerShake366 = !current
    AppToast.show(this, "Sleep Timer Shake366: ${if (!current) "ON" else "OFF"}")
}

// v366: Parental Pin Lock366
internal fun PlayerActivity.showV366ParentalPinLock366Toggle() {
    val current = BiliClient.prefs.v366parentalPinLock366
    BiliClient.prefs.v366parentalPinLock366 = !current
    AppToast.show(this, "Parental Pin Lock366: ${if (!current) "ON" else "OFF"}")
}

// v366: Parental Time Limit366
internal fun PlayerActivity.showV366ParentalTimeLimit366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366parentalTimeLimit366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366parentalTimeLimit366 = value
        AppToast.show(this, "Parental Time Limit366: $value")
    }
}

// v366: Parental Content Filter366
internal fun PlayerActivity.showV366ParentalContentFilter366Toggle() {
    val current = BiliClient.prefs.v366parentalContentFilter366
    BiliClient.prefs.v366parentalContentFilter366 = !current
    AppToast.show(this, "Parental Content Filter366: ${if (!current) "ON" else "OFF"}")
}

// v366: Privacy Auto Clear History366
internal fun PlayerActivity.showV366PrivacyAutoClearHistory366Toggle() {
    val current = BiliClient.prefs.v366privacyAutoClearHistory366
    BiliClient.prefs.v366privacyAutoClearHistory366 = !current
    AppToast.show(this, "Privacy Auto Clear History366: ${if (!current) "ON" else "OFF"}")
}

// v366: Privacy Hide Watch Record366
internal fun PlayerActivity.showV366PrivacyHideWatchRecord366Toggle() {
    val current = BiliClient.prefs.v366privacyHideWatchRecord366
    BiliClient.prefs.v366privacyHideWatchRecord366 = !current
    AppToast.show(this, "Privacy Hide Watch Record366: ${if (!current) "ON" else "OFF"}")
}

// v366: Privacy Disable Analytics366
internal fun PlayerActivity.showV366PrivacyDisableAnalytics366Toggle() {
    val current = BiliClient.prefs.v366privacyDisableAnalytics366
    BiliClient.prefs.v366privacyDisableAnalytics366 = !current
    AppToast.show(this, "Privacy Disable Analytics366: ${if (!current) "ON" else "OFF"}")
}

// v366: Theme Accent Color366
internal fun PlayerActivity.showV366ThemeAccentColor366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366themeAccentColor366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366themeAccentColor366 = value
        AppToast.show(this, "Theme Accent Color366: $value")
    }
}

// v366: Theme Dark Mode366
internal fun PlayerActivity.showV366ThemeDarkMode366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366themeDarkMode366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366themeDarkMode366 = value
        AppToast.show(this, "Theme Dark Mode366: $value")
    }
}

// v366: Keyboard Shortcut Play366
internal fun PlayerActivity.showV366KeyboardShortcutPlay366Toggle() {
    val current = BiliClient.prefs.v366keyboardShortcutPlay366
    BiliClient.prefs.v366keyboardShortcutPlay366 = !current
    AppToast.show(this, "Keyboard Shortcut Play366: ${if (!current) "ON" else "OFF"}")
}

// v366: Keyboard Shortcut Volume366
internal fun PlayerActivity.showV366KeyboardShortcutVolume366Toggle() {
    val current = BiliClient.prefs.v366keyboardShortcutVolume366
    BiliClient.prefs.v366keyboardShortcutVolume366 = !current
    AppToast.show(this, "Keyboard Shortcut Volume366: ${if (!current) "ON" else "OFF"}")
}

// v366: Voice Control Enabled366
internal fun PlayerActivity.showV366VoiceControlEnabled366Toggle() {
    val current = BiliClient.prefs.v366voiceControlEnabled366
    BiliClient.prefs.v366voiceControlEnabled366 = !current
    AppToast.show(this, "Voice Control Enabled366: ${if (!current) "ON" else "OFF"}")
}

// v366: Voice Control Language366
internal fun PlayerActivity.showV366VoiceControlLanguage366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366voiceControlLanguage366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366voiceControlLanguage366 = value
        AppToast.show(this, "Voice Control Language366: $value")
    }
}

// v367: Sleep Timer Duration367
internal fun PlayerActivity.showV367SleepTimerDuration367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367sleepTimerDuration367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367sleepTimerDuration367 = value
        AppToast.show(this, "Sleep Timer Duration367: $value")
    }
}

// v367: Sleep Timer Fade Out367
internal fun PlayerActivity.showV367SleepTimerFadeOut367Toggle() {
    val current = BiliClient.prefs.v367sleepTimerFadeOut367
    BiliClient.prefs.v367sleepTimerFadeOut367 = !current
    AppToast.show(this, "Sleep Timer Fade Out367: ${if (!current) "ON" else "OFF"}")
}

// v367: Sleep Timer Shake367
internal fun PlayerActivity.showV367SleepTimerShake367Toggle() {
    val current = BiliClient.prefs.v367sleepTimerShake367
    BiliClient.prefs.v367sleepTimerShake367 = !current
    AppToast.show(this, "Sleep Timer Shake367: ${if (!current) "ON" else "OFF"}")
}

// v367: Parental Pin Lock367
internal fun PlayerActivity.showV367ParentalPinLock367Toggle() {
    val current = BiliClient.prefs.v367parentalPinLock367
    BiliClient.prefs.v367parentalPinLock367 = !current
    AppToast.show(this, "Parental Pin Lock367: ${if (!current) "ON" else "OFF"}")
}

// v367: Parental Time Limit367
internal fun PlayerActivity.showV367ParentalTimeLimit367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367parentalTimeLimit367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367parentalTimeLimit367 = value
        AppToast.show(this, "Parental Time Limit367: $value")
    }
}

// v367: Parental Content Filter367
internal fun PlayerActivity.showV367ParentalContentFilter367Toggle() {
    val current = BiliClient.prefs.v367parentalContentFilter367
    BiliClient.prefs.v367parentalContentFilter367 = !current
    AppToast.show(this, "Parental Content Filter367: ${if (!current) "ON" else "OFF"}")
}

// v367: Privacy Auto Clear History367
internal fun PlayerActivity.showV367PrivacyAutoClearHistory367Toggle() {
    val current = BiliClient.prefs.v367privacyAutoClearHistory367
    BiliClient.prefs.v367privacyAutoClearHistory367 = !current
    AppToast.show(this, "Privacy Auto Clear History367: ${if (!current) "ON" else "OFF"}")
}

// v367: Privacy Hide Watch Record367
internal fun PlayerActivity.showV367PrivacyHideWatchRecord367Toggle() {
    val current = BiliClient.prefs.v367privacyHideWatchRecord367
    BiliClient.prefs.v367privacyHideWatchRecord367 = !current
    AppToast.show(this, "Privacy Hide Watch Record367: ${if (!current) "ON" else "OFF"}")
}

// v367: Privacy Disable Analytics367
internal fun PlayerActivity.showV367PrivacyDisableAnalytics367Toggle() {
    val current = BiliClient.prefs.v367privacyDisableAnalytics367
    BiliClient.prefs.v367privacyDisableAnalytics367 = !current
    AppToast.show(this, "Privacy Disable Analytics367: ${if (!current) "ON" else "OFF"}")
}

// v367: Theme Accent Color367
internal fun PlayerActivity.showV367ThemeAccentColor367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367themeAccentColor367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367themeAccentColor367 = value
        AppToast.show(this, "Theme Accent Color367: $value")
    }
}

// v367: Theme Dark Mode367
internal fun PlayerActivity.showV367ThemeDarkMode367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367themeDarkMode367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367themeDarkMode367 = value
        AppToast.show(this, "Theme Dark Mode367: $value")
    }
}

// v367: Keyboard Shortcut Play367
internal fun PlayerActivity.showV367KeyboardShortcutPlay367Toggle() {
    val current = BiliClient.prefs.v367keyboardShortcutPlay367
    BiliClient.prefs.v367keyboardShortcutPlay367 = !current
    AppToast.show(this, "Keyboard Shortcut Play367: ${if (!current) "ON" else "OFF"}")
}

// v367: Keyboard Shortcut Volume367
internal fun PlayerActivity.showV367KeyboardShortcutVolume367Toggle() {
    val current = BiliClient.prefs.v367keyboardShortcutVolume367
    BiliClient.prefs.v367keyboardShortcutVolume367 = !current
    AppToast.show(this, "Keyboard Shortcut Volume367: ${if (!current) "ON" else "OFF"}")
}

// v367: Voice Control Enabled367
internal fun PlayerActivity.showV367VoiceControlEnabled367Toggle() {
    val current = BiliClient.prefs.v367voiceControlEnabled367
    BiliClient.prefs.v367voiceControlEnabled367 = !current
    AppToast.show(this, "Voice Control Enabled367: ${if (!current) "ON" else "OFF"}")
}

// v367: Voice Control Language367
internal fun PlayerActivity.showV367VoiceControlLanguage367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367voiceControlLanguage367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367voiceControlLanguage367 = value
        AppToast.show(this, "Voice Control Language367: $value")
    }
}

// v368: Sleep Timer Duration368
internal fun PlayerActivity.showV368SleepTimerDuration368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368sleepTimerDuration368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368sleepTimerDuration368 = value
        AppToast.show(this, "Sleep Timer Duration368: $value")
    }
}

// v368: Sleep Timer Fade Out368
internal fun PlayerActivity.showV368SleepTimerFadeOut368Toggle() {
    val current = BiliClient.prefs.v368sleepTimerFadeOut368
    BiliClient.prefs.v368sleepTimerFadeOut368 = !current
    AppToast.show(this, "Sleep Timer Fade Out368: ${if (!current) "ON" else "OFF"}")
}

// v368: Sleep Timer Shake368
internal fun PlayerActivity.showV368SleepTimerShake368Toggle() {
    val current = BiliClient.prefs.v368sleepTimerShake368
    BiliClient.prefs.v368sleepTimerShake368 = !current
    AppToast.show(this, "Sleep Timer Shake368: ${if (!current) "ON" else "OFF"}")
}

// v368: Parental Pin Lock368
internal fun PlayerActivity.showV368ParentalPinLock368Toggle() {
    val current = BiliClient.prefs.v368parentalPinLock368
    BiliClient.prefs.v368parentalPinLock368 = !current
    AppToast.show(this, "Parental Pin Lock368: ${if (!current) "ON" else "OFF"}")
}

// v368: Parental Time Limit368
internal fun PlayerActivity.showV368ParentalTimeLimit368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368parentalTimeLimit368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368parentalTimeLimit368 = value
        AppToast.show(this, "Parental Time Limit368: $value")
    }
}

// v368: Parental Content Filter368
internal fun PlayerActivity.showV368ParentalContentFilter368Toggle() {
    val current = BiliClient.prefs.v368parentalContentFilter368
    BiliClient.prefs.v368parentalContentFilter368 = !current
    AppToast.show(this, "Parental Content Filter368: ${if (!current) "ON" else "OFF"}")
}

// v368: Privacy Auto Clear History368
internal fun PlayerActivity.showV368PrivacyAutoClearHistory368Toggle() {
    val current = BiliClient.prefs.v368privacyAutoClearHistory368
    BiliClient.prefs.v368privacyAutoClearHistory368 = !current
    AppToast.show(this, "Privacy Auto Clear History368: ${if (!current) "ON" else "OFF"}")
}

// v368: Privacy Hide Watch Record368
internal fun PlayerActivity.showV368PrivacyHideWatchRecord368Toggle() {
    val current = BiliClient.prefs.v368privacyHideWatchRecord368
    BiliClient.prefs.v368privacyHideWatchRecord368 = !current
    AppToast.show(this, "Privacy Hide Watch Record368: ${if (!current) "ON" else "OFF"}")
}

// v368: Privacy Disable Analytics368
internal fun PlayerActivity.showV368PrivacyDisableAnalytics368Toggle() {
    val current = BiliClient.prefs.v368privacyDisableAnalytics368
    BiliClient.prefs.v368privacyDisableAnalytics368 = !current
    AppToast.show(this, "Privacy Disable Analytics368: ${if (!current) "ON" else "OFF"}")
}

// v368: Theme Accent Color368
internal fun PlayerActivity.showV368ThemeAccentColor368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368themeAccentColor368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368themeAccentColor368 = value
        AppToast.show(this, "Theme Accent Color368: $value")
    }
}

// v368: Theme Dark Mode368
internal fun PlayerActivity.showV368ThemeDarkMode368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368themeDarkMode368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368themeDarkMode368 = value
        AppToast.show(this, "Theme Dark Mode368: $value")
    }
}

// v368: Keyboard Shortcut Play368
internal fun PlayerActivity.showV368KeyboardShortcutPlay368Toggle() {
    val current = BiliClient.prefs.v368keyboardShortcutPlay368
    BiliClient.prefs.v368keyboardShortcutPlay368 = !current
    AppToast.show(this, "Keyboard Shortcut Play368: ${if (!current) "ON" else "OFF"}")
}

// v368: Keyboard Shortcut Volume368
internal fun PlayerActivity.showV368KeyboardShortcutVolume368Toggle() {
    val current = BiliClient.prefs.v368keyboardShortcutVolume368
    BiliClient.prefs.v368keyboardShortcutVolume368 = !current
    AppToast.show(this, "Keyboard Shortcut Volume368: ${if (!current) "ON" else "OFF"}")
}

// v368: Voice Control Enabled368
internal fun PlayerActivity.showV368VoiceControlEnabled368Toggle() {
    val current = BiliClient.prefs.v368voiceControlEnabled368
    BiliClient.prefs.v368voiceControlEnabled368 = !current
    AppToast.show(this, "Voice Control Enabled368: ${if (!current) "ON" else "OFF"}")
}

// v368: Voice Control Language368
internal fun PlayerActivity.showV368VoiceControlLanguage368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368voiceControlLanguage368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368voiceControlLanguage368 = value
        AppToast.show(this, "Voice Control Language368: $value")
    }
}

// v369: Sleep Timer Duration369
internal fun PlayerActivity.showV369SleepTimerDuration369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369sleepTimerDuration369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369sleepTimerDuration369 = value
        AppToast.show(this, "Sleep Timer Duration369: $value")
    }
}

// v369: Sleep Timer Fade Out369
internal fun PlayerActivity.showV369SleepTimerFadeOut369Toggle() {
    val current = BiliClient.prefs.v369sleepTimerFadeOut369
    BiliClient.prefs.v369sleepTimerFadeOut369 = !current
    AppToast.show(this, "Sleep Timer Fade Out369: ${if (!current) "ON" else "OFF"}")
}

// v369: Sleep Timer Shake369
internal fun PlayerActivity.showV369SleepTimerShake369Toggle() {
    val current = BiliClient.prefs.v369sleepTimerShake369
    BiliClient.prefs.v369sleepTimerShake369 = !current
    AppToast.show(this, "Sleep Timer Shake369: ${if (!current) "ON" else "OFF"}")
}

// v369: Parental Pin Lock369
internal fun PlayerActivity.showV369ParentalPinLock369Toggle() {
    val current = BiliClient.prefs.v369parentalPinLock369
    BiliClient.prefs.v369parentalPinLock369 = !current
    AppToast.show(this, "Parental Pin Lock369: ${if (!current) "ON" else "OFF"}")
}

// v369: Parental Time Limit369
internal fun PlayerActivity.showV369ParentalTimeLimit369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369parentalTimeLimit369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369parentalTimeLimit369 = value
        AppToast.show(this, "Parental Time Limit369: $value")
    }
}

// v369: Parental Content Filter369
internal fun PlayerActivity.showV369ParentalContentFilter369Toggle() {
    val current = BiliClient.prefs.v369parentalContentFilter369
    BiliClient.prefs.v369parentalContentFilter369 = !current
    AppToast.show(this, "Parental Content Filter369: ${if (!current) "ON" else "OFF"}")
}

// v369: Privacy Auto Clear History369
internal fun PlayerActivity.showV369PrivacyAutoClearHistory369Toggle() {
    val current = BiliClient.prefs.v369privacyAutoClearHistory369
    BiliClient.prefs.v369privacyAutoClearHistory369 = !current
    AppToast.show(this, "Privacy Auto Clear History369: ${if (!current) "ON" else "OFF"}")
}

// v369: Privacy Hide Watch Record369
internal fun PlayerActivity.showV369PrivacyHideWatchRecord369Toggle() {
    val current = BiliClient.prefs.v369privacyHideWatchRecord369
    BiliClient.prefs.v369privacyHideWatchRecord369 = !current
    AppToast.show(this, "Privacy Hide Watch Record369: ${if (!current) "ON" else "OFF"}")
}

// v369: Privacy Disable Analytics369
internal fun PlayerActivity.showV369PrivacyDisableAnalytics369Toggle() {
    val current = BiliClient.prefs.v369privacyDisableAnalytics369
    BiliClient.prefs.v369privacyDisableAnalytics369 = !current
    AppToast.show(this, "Privacy Disable Analytics369: ${if (!current) "ON" else "OFF"}")
}

// v369: Theme Accent Color369
internal fun PlayerActivity.showV369ThemeAccentColor369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369themeAccentColor369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369themeAccentColor369 = value
        AppToast.show(this, "Theme Accent Color369: $value")
    }
}

// v369: Theme Dark Mode369
internal fun PlayerActivity.showV369ThemeDarkMode369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369themeDarkMode369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369themeDarkMode369 = value
        AppToast.show(this, "Theme Dark Mode369: $value")
    }
}

// v369: Keyboard Shortcut Play369
internal fun PlayerActivity.showV369KeyboardShortcutPlay369Toggle() {
    val current = BiliClient.prefs.v369keyboardShortcutPlay369
    BiliClient.prefs.v369keyboardShortcutPlay369 = !current
    AppToast.show(this, "Keyboard Shortcut Play369: ${if (!current) "ON" else "OFF"}")
}

// v369: Keyboard Shortcut Volume369
internal fun PlayerActivity.showV369KeyboardShortcutVolume369Toggle() {
    val current = BiliClient.prefs.v369keyboardShortcutVolume369
    BiliClient.prefs.v369keyboardShortcutVolume369 = !current
    AppToast.show(this, "Keyboard Shortcut Volume369: ${if (!current) "ON" else "OFF"}")
}

