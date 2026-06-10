package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

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

// v369: Voice Control Enabled369
internal fun PlayerActivity.showV369VoiceControlEnabled369Toggle() {
    val current = BiliClient.prefs.v369voiceControlEnabled369
    BiliClient.prefs.v369voiceControlEnabled369 = !current
    AppToast.show(this, "Voice Control Enabled369: ${if (!current) "ON" else "OFF"}")
}

// v369: Voice Control Language369
internal fun PlayerActivity.showV369VoiceControlLanguage369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369voiceControlLanguage369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369voiceControlLanguage369 = value
        AppToast.show(this, "Voice Control Language369: $value")
    }
}

// v370: Sleep Timer Duration370
internal fun PlayerActivity.showV370SleepTimerDuration370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370sleepTimerDuration370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370sleepTimerDuration370 = value
        AppToast.show(this, "Sleep Timer Duration370: $value")
    }
}

// v370: Sleep Timer Fade Out370
internal fun PlayerActivity.showV370SleepTimerFadeOut370Toggle() {
    val current = BiliClient.prefs.v370sleepTimerFadeOut370
    BiliClient.prefs.v370sleepTimerFadeOut370 = !current
    AppToast.show(this, "Sleep Timer Fade Out370: ${if (!current) "ON" else "OFF"}")
}

// v370: Sleep Timer Shake370
internal fun PlayerActivity.showV370SleepTimerShake370Toggle() {
    val current = BiliClient.prefs.v370sleepTimerShake370
    BiliClient.prefs.v370sleepTimerShake370 = !current
    AppToast.show(this, "Sleep Timer Shake370: ${if (!current) "ON" else "OFF"}")
}

// v370: Parental Pin Lock370
internal fun PlayerActivity.showV370ParentalPinLock370Toggle() {
    val current = BiliClient.prefs.v370parentalPinLock370
    BiliClient.prefs.v370parentalPinLock370 = !current
    AppToast.show(this, "Parental Pin Lock370: ${if (!current) "ON" else "OFF"}")
}

// v370: Parental Time Limit370
internal fun PlayerActivity.showV370ParentalTimeLimit370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370parentalTimeLimit370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370parentalTimeLimit370 = value
        AppToast.show(this, "Parental Time Limit370: $value")
    }
}

// v370: Parental Content Filter370
internal fun PlayerActivity.showV370ParentalContentFilter370Toggle() {
    val current = BiliClient.prefs.v370parentalContentFilter370
    BiliClient.prefs.v370parentalContentFilter370 = !current
    AppToast.show(this, "Parental Content Filter370: ${if (!current) "ON" else "OFF"}")
}

// v370: Privacy Auto Clear History370
internal fun PlayerActivity.showV370PrivacyAutoClearHistory370Toggle() {
    val current = BiliClient.prefs.v370privacyAutoClearHistory370
    BiliClient.prefs.v370privacyAutoClearHistory370 = !current
    AppToast.show(this, "Privacy Auto Clear History370: ${if (!current) "ON" else "OFF"}")
}

// v370: Privacy Hide Watch Record370
internal fun PlayerActivity.showV370PrivacyHideWatchRecord370Toggle() {
    val current = BiliClient.prefs.v370privacyHideWatchRecord370
    BiliClient.prefs.v370privacyHideWatchRecord370 = !current
    AppToast.show(this, "Privacy Hide Watch Record370: ${if (!current) "ON" else "OFF"}")
}

// v370: Privacy Disable Analytics370
internal fun PlayerActivity.showV370PrivacyDisableAnalytics370Toggle() {
    val current = BiliClient.prefs.v370privacyDisableAnalytics370
    BiliClient.prefs.v370privacyDisableAnalytics370 = !current
    AppToast.show(this, "Privacy Disable Analytics370: ${if (!current) "ON" else "OFF"}")
}

// v370: Theme Accent Color370
internal fun PlayerActivity.showV370ThemeAccentColor370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370themeAccentColor370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370themeAccentColor370 = value
        AppToast.show(this, "Theme Accent Color370: $value")
    }
}

// v370: Theme Dark Mode370
internal fun PlayerActivity.showV370ThemeDarkMode370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370themeDarkMode370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370themeDarkMode370 = value
        AppToast.show(this, "Theme Dark Mode370: $value")
    }
}

// v370: Keyboard Shortcut Play370
internal fun PlayerActivity.showV370KeyboardShortcutPlay370Toggle() {
    val current = BiliClient.prefs.v370keyboardShortcutPlay370
    BiliClient.prefs.v370keyboardShortcutPlay370 = !current
    AppToast.show(this, "Keyboard Shortcut Play370: ${if (!current) "ON" else "OFF"}")
}

// v370: Keyboard Shortcut Volume370
internal fun PlayerActivity.showV370KeyboardShortcutVolume370Toggle() {
    val current = BiliClient.prefs.v370keyboardShortcutVolume370
    BiliClient.prefs.v370keyboardShortcutVolume370 = !current
    AppToast.show(this, "Keyboard Shortcut Volume370: ${if (!current) "ON" else "OFF"}")
}

// v370: Voice Control Enabled370
internal fun PlayerActivity.showV370VoiceControlEnabled370Toggle() {
    val current = BiliClient.prefs.v370voiceControlEnabled370
    BiliClient.prefs.v370voiceControlEnabled370 = !current
    AppToast.show(this, "Voice Control Enabled370: ${if (!current) "ON" else "OFF"}")
}

// v370: Voice Control Language370
internal fun PlayerActivity.showV370VoiceControlLanguage370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370voiceControlLanguage370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370voiceControlLanguage370 = value
        AppToast.show(this, "Voice Control Language370: $value")
    }
}

// v371: Caption Auto Detect371
internal fun PlayerActivity.showV371CaptionAutoDetect371Toggle() {
    val current = BiliClient.prefs.v371captionAutoDetect371
    BiliClient.prefs.v371captionAutoDetect371 = !current
    AppToast.show(this, "Caption Auto Detect371: ${if (!current) "ON" else "OFF"}")
}

// v371: Caption Font Size371
internal fun PlayerActivity.showV371CaptionFontSize371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371captionFontSize371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371captionFontSize371 = value
        AppToast.show(this, "Caption Font Size371: $value")
    }
}

// v371: Caption Position371
internal fun PlayerActivity.showV371CaptionPosition371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371captionPosition371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371captionPosition371 = value
        AppToast.show(this, "Caption Position371: $value")
    }
}

// v371: Chromecast Auto Connect371
internal fun PlayerActivity.showV371ChromecastAutoConnect371Toggle() {
    val current = BiliClient.prefs.v371chromecastAutoConnect371
    BiliClient.prefs.v371chromecastAutoConnect371 = !current
    AppToast.show(this, "Chromecast Auto Connect371: ${if (!current) "ON" else "OFF"}")
}

// v371: Chromecast Quality371
internal fun PlayerActivity.showV371ChromecastQuality371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371chromecastQuality371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371chromecastQuality371 = value
        AppToast.show(this, "Chromecast Quality371: $value")
    }
}

// v371: Floating Window Enabled371
internal fun PlayerActivity.showV371FloatingWindowEnabled371Toggle() {
    val current = BiliClient.prefs.v371floatingWindowEnabled371
    BiliClient.prefs.v371floatingWindowEnabled371 = !current
    AppToast.show(this, "Floating Window Enabled371: ${if (!current) "ON" else "OFF"}")
}

// v371: Floating Window Size371
internal fun PlayerActivity.showV371FloatingWindowSize371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371floatingWindowSize371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371floatingWindowSize371 = value
        AppToast.show(this, "Floating Window Size371: $value")
    }
}

// v371: NFC Auto Transfer371
internal fun PlayerActivity.showV371NfcAutoTransfer371Toggle() {
    val current = BiliClient.prefs.v371nfcAutoTransfer371
    BiliClient.prefs.v371nfcAutoTransfer371 = !current
    AppToast.show(this, "NFC Auto Transfer371: ${if (!current) "ON" else "OFF"}")
}

// v371: Recommend Algorithm371
internal fun PlayerActivity.showV371RecommendAlgorithm371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371recommendAlgorithm371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371recommendAlgorithm371 = value
        AppToast.show(this, "Recommend Algorithm371: $value")
    }
}

// v371: Update Auto Check371
internal fun PlayerActivity.showV371UpdateAutoCheck371Toggle() {
    val current = BiliClient.prefs.v371updateAutoCheck371
    BiliClient.prefs.v371updateAutoCheck371 = !current
    AppToast.show(this, "Update Auto Check371: ${if (!current) "ON" else "OFF"}")
}

// v371: VR Mode Enabled371
internal fun PlayerActivity.showV371VrModeEnabled371Toggle() {
    val current = BiliClient.prefs.v371vrModeEnabled371
    BiliClient.prefs.v371vrModeEnabled371 = !current
    AppToast.show(this, "VR Mode Enabled371: ${if (!current) "ON" else "OFF"}")
}

// v371: Accessibility High Contrast371
internal fun PlayerActivity.showV371AccessibilityHighContrast371Toggle() {
    val current = BiliClient.prefs.v371accessibilityHighContrast371
    BiliClient.prefs.v371accessibilityHighContrast371 = !current
    AppToast.show(this, "Accessibility High Contrast371: ${if (!current) "ON" else "OFF"}")
}

// v371: Comment Auto Translate371
internal fun PlayerActivity.showV371CommentAutoTranslate371Toggle() {
    val current = BiliClient.prefs.v371commentAutoTranslate371
    BiliClient.prefs.v371commentAutoTranslate371 = !current
    AppToast.show(this, "Comment Auto Translate371: ${if (!current) "ON" else "OFF"}")
}

// v371: Data Usage Limit371
internal fun PlayerActivity.showV371DataUsageLimit371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371dataUsageLimit371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371dataUsageLimit371 = value
        AppToast.show(this, "Data Usage Limit371: $value")
    }
}

// v371: Thumbnail Preview371
internal fun PlayerActivity.showV371ThumbnailPreview371Toggle() {
    val current = BiliClient.prefs.v371thumbnailPreview371
    BiliClient.prefs.v371thumbnailPreview371 = !current
    AppToast.show(this, "Thumbnail Preview371: ${if (!current) "ON" else "OFF"}")
}

// v372: Caption Auto Detect372
internal fun PlayerActivity.showV372CaptionAutoDetect372Toggle() {
    val current = BiliClient.prefs.v372captionAutoDetect372
    BiliClient.prefs.v372captionAutoDetect372 = !current
    AppToast.show(this, "Caption Auto Detect372: ${if (!current) "ON" else "OFF"}")
}

// v372: Caption Font Size372
internal fun PlayerActivity.showV372CaptionFontSize372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372captionFontSize372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372captionFontSize372 = value
        AppToast.show(this, "Caption Font Size372: $value")
    }
}

// v372: Caption Position372
internal fun PlayerActivity.showV372CaptionPosition372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372captionPosition372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372captionPosition372 = value
        AppToast.show(this, "Caption Position372: $value")
    }
}

// v372: Chromecast Auto Connect372
internal fun PlayerActivity.showV372ChromecastAutoConnect372Toggle() {
    val current = BiliClient.prefs.v372chromecastAutoConnect372
    BiliClient.prefs.v372chromecastAutoConnect372 = !current
    AppToast.show(this, "Chromecast Auto Connect372: ${if (!current) "ON" else "OFF"}")
}

// v372: Chromecast Quality372
internal fun PlayerActivity.showV372ChromecastQuality372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372chromecastQuality372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372chromecastQuality372 = value
        AppToast.show(this, "Chromecast Quality372: $value")
    }
}

// v372: Floating Window Enabled372
internal fun PlayerActivity.showV372FloatingWindowEnabled372Toggle() {
    val current = BiliClient.prefs.v372floatingWindowEnabled372
    BiliClient.prefs.v372floatingWindowEnabled372 = !current
    AppToast.show(this, "Floating Window Enabled372: ${if (!current) "ON" else "OFF"}")
}

// v372: Floating Window Size372
internal fun PlayerActivity.showV372FloatingWindowSize372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372floatingWindowSize372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372floatingWindowSize372 = value
        AppToast.show(this, "Floating Window Size372: $value")
    }
}

// v372: NFC Auto Transfer372
internal fun PlayerActivity.showV372NfcAutoTransfer372Toggle() {
    val current = BiliClient.prefs.v372nfcAutoTransfer372
    BiliClient.prefs.v372nfcAutoTransfer372 = !current
    AppToast.show(this, "NFC Auto Transfer372: ${if (!current) "ON" else "OFF"}")
}

// v372: Recommend Algorithm372
internal fun PlayerActivity.showV372RecommendAlgorithm372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372recommendAlgorithm372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372recommendAlgorithm372 = value
        AppToast.show(this, "Recommend Algorithm372: $value")
    }
}

// v372: Update Auto Check372
internal fun PlayerActivity.showV372UpdateAutoCheck372Toggle() {
    val current = BiliClient.prefs.v372updateAutoCheck372
    BiliClient.prefs.v372updateAutoCheck372 = !current
    AppToast.show(this, "Update Auto Check372: ${if (!current) "ON" else "OFF"}")
}

// v372: VR Mode Enabled372
internal fun PlayerActivity.showV372VrModeEnabled372Toggle() {
    val current = BiliClient.prefs.v372vrModeEnabled372
    BiliClient.prefs.v372vrModeEnabled372 = !current
    AppToast.show(this, "VR Mode Enabled372: ${if (!current) "ON" else "OFF"}")
}

// v372: Accessibility High Contrast372
internal fun PlayerActivity.showV372AccessibilityHighContrast372Toggle() {
    val current = BiliClient.prefs.v372accessibilityHighContrast372
    BiliClient.prefs.v372accessibilityHighContrast372 = !current
    AppToast.show(this, "Accessibility High Contrast372: ${if (!current) "ON" else "OFF"}")
}

// v372: Comment Auto Translate372
internal fun PlayerActivity.showV372CommentAutoTranslate372Toggle() {
    val current = BiliClient.prefs.v372commentAutoTranslate372
    BiliClient.prefs.v372commentAutoTranslate372 = !current
    AppToast.show(this, "Comment Auto Translate372: ${if (!current) "ON" else "OFF"}")
}

// v372: Data Usage Limit372
internal fun PlayerActivity.showV372DataUsageLimit372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v372dataUsageLimit372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v372dataUsageLimit372 = value
        AppToast.show(this, "Data Usage Limit372: $value")
    }
}

// v372: Thumbnail Preview372
internal fun PlayerActivity.showV372ThumbnailPreview372Toggle() {
    val current = BiliClient.prefs.v372thumbnailPreview372
    BiliClient.prefs.v372thumbnailPreview372 = !current
    AppToast.show(this, "Thumbnail Preview372: ${if (!current) "ON" else "OFF"}")
}

// v373: Caption Auto Detect373
internal fun PlayerActivity.showV373CaptionAutoDetect373Toggle() {
    val current = BiliClient.prefs.v373captionAutoDetect373
    BiliClient.prefs.v373captionAutoDetect373 = !current
    AppToast.show(this, "Caption Auto Detect373: ${if (!current) "ON" else "OFF"}")
}

// v373: Caption Font Size373
internal fun PlayerActivity.showV373CaptionFontSize373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373captionFontSize373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373captionFontSize373 = value
        AppToast.show(this, "Caption Font Size373: $value")
    }
}

// v373: Caption Position373
internal fun PlayerActivity.showV373CaptionPosition373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373captionPosition373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373captionPosition373 = value
        AppToast.show(this, "Caption Position373: $value")
    }
}

// v373: Chromecast Auto Connect373
internal fun PlayerActivity.showV373ChromecastAutoConnect373Toggle() {
    val current = BiliClient.prefs.v373chromecastAutoConnect373
    BiliClient.prefs.v373chromecastAutoConnect373 = !current
    AppToast.show(this, "Chromecast Auto Connect373: ${if (!current) "ON" else "OFF"}")
}

// v373: Chromecast Quality373
internal fun PlayerActivity.showV373ChromecastQuality373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373chromecastQuality373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373chromecastQuality373 = value
        AppToast.show(this, "Chromecast Quality373: $value")
    }
}

// v373: Floating Window Enabled373
internal fun PlayerActivity.showV373FloatingWindowEnabled373Toggle() {
    val current = BiliClient.prefs.v373floatingWindowEnabled373
    BiliClient.prefs.v373floatingWindowEnabled373 = !current
    AppToast.show(this, "Floating Window Enabled373: ${if (!current) "ON" else "OFF"}")
}

// v373: Floating Window Size373
internal fun PlayerActivity.showV373FloatingWindowSize373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373floatingWindowSize373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373floatingWindowSize373 = value
        AppToast.show(this, "Floating Window Size373: $value")
    }
}

// v373: NFC Auto Transfer373
internal fun PlayerActivity.showV373NfcAutoTransfer373Toggle() {
    val current = BiliClient.prefs.v373nfcAutoTransfer373
    BiliClient.prefs.v373nfcAutoTransfer373 = !current
    AppToast.show(this, "NFC Auto Transfer373: ${if (!current) "ON" else "OFF"}")
}

// v373: Recommend Algorithm373
internal fun PlayerActivity.showV373RecommendAlgorithm373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373recommendAlgorithm373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373recommendAlgorithm373 = value
        AppToast.show(this, "Recommend Algorithm373: $value")
    }
}

// v373: Update Auto Check373
internal fun PlayerActivity.showV373UpdateAutoCheck373Toggle() {
    val current = BiliClient.prefs.v373updateAutoCheck373
    BiliClient.prefs.v373updateAutoCheck373 = !current
    AppToast.show(this, "Update Auto Check373: ${if (!current) "ON" else "OFF"}")
}

// v373: VR Mode Enabled373
internal fun PlayerActivity.showV373VrModeEnabled373Toggle() {
    val current = BiliClient.prefs.v373vrModeEnabled373
    BiliClient.prefs.v373vrModeEnabled373 = !current
    AppToast.show(this, "VR Mode Enabled373: ${if (!current) "ON" else "OFF"}")
}

// v373: Accessibility High Contrast373
internal fun PlayerActivity.showV373AccessibilityHighContrast373Toggle() {
    val current = BiliClient.prefs.v373accessibilityHighContrast373
    BiliClient.prefs.v373accessibilityHighContrast373 = !current
    AppToast.show(this, "Accessibility High Contrast373: ${if (!current) "ON" else "OFF"}")
}

// v373: Comment Auto Translate373
internal fun PlayerActivity.showV373CommentAutoTranslate373Toggle() {
    val current = BiliClient.prefs.v373commentAutoTranslate373
    BiliClient.prefs.v373commentAutoTranslate373 = !current
    AppToast.show(this, "Comment Auto Translate373: ${if (!current) "ON" else "OFF"}")
}

// v373: Data Usage Limit373
internal fun PlayerActivity.showV373DataUsageLimit373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v373dataUsageLimit373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v373dataUsageLimit373 = value
        AppToast.show(this, "Data Usage Limit373: $value")
    }
}

// v373: Thumbnail Preview373
internal fun PlayerActivity.showV373ThumbnailPreview373Toggle() {
    val current = BiliClient.prefs.v373thumbnailPreview373
    BiliClient.prefs.v373thumbnailPreview373 = !current
    AppToast.show(this, "Thumbnail Preview373: ${if (!current) "ON" else "OFF"}")
}

// v374: Caption Auto Detect374
internal fun PlayerActivity.showV374CaptionAutoDetect374Toggle() {
    val current = BiliClient.prefs.v374captionAutoDetect374
    BiliClient.prefs.v374captionAutoDetect374 = !current
    AppToast.show(this, "Caption Auto Detect374: ${if (!current) "ON" else "OFF"}")
}

// v374: Caption Font Size374
internal fun PlayerActivity.showV374CaptionFontSize374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374captionFontSize374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374captionFontSize374 = value
        AppToast.show(this, "Caption Font Size374: $value")
    }
}

// v374: Caption Position374
internal fun PlayerActivity.showV374CaptionPosition374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374captionPosition374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374captionPosition374 = value
        AppToast.show(this, "Caption Position374: $value")
    }
}

// v374: Chromecast Auto Connect374
internal fun PlayerActivity.showV374ChromecastAutoConnect374Toggle() {
    val current = BiliClient.prefs.v374chromecastAutoConnect374
    BiliClient.prefs.v374chromecastAutoConnect374 = !current
    AppToast.show(this, "Chromecast Auto Connect374: ${if (!current) "ON" else "OFF"}")
}

// v374: Chromecast Quality374
internal fun PlayerActivity.showV374ChromecastQuality374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374chromecastQuality374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374chromecastQuality374 = value
        AppToast.show(this, "Chromecast Quality374: $value")
    }
}

// v374: Floating Window Enabled374
internal fun PlayerActivity.showV374FloatingWindowEnabled374Toggle() {
    val current = BiliClient.prefs.v374floatingWindowEnabled374
    BiliClient.prefs.v374floatingWindowEnabled374 = !current
    AppToast.show(this, "Floating Window Enabled374: ${if (!current) "ON" else "OFF"}")
}

// v374: Floating Window Size374
internal fun PlayerActivity.showV374FloatingWindowSize374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374floatingWindowSize374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374floatingWindowSize374 = value
        AppToast.show(this, "Floating Window Size374: $value")
    }
}

// v374: NFC Auto Transfer374
internal fun PlayerActivity.showV374NfcAutoTransfer374Toggle() {
    val current = BiliClient.prefs.v374nfcAutoTransfer374
    BiliClient.prefs.v374nfcAutoTransfer374 = !current
    AppToast.show(this, "NFC Auto Transfer374: ${if (!current) "ON" else "OFF"}")
}

// v374: Recommend Algorithm374
internal fun PlayerActivity.showV374RecommendAlgorithm374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374recommendAlgorithm374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374recommendAlgorithm374 = value
        AppToast.show(this, "Recommend Algorithm374: $value")
    }
}

// v374: Update Auto Check374
internal fun PlayerActivity.showV374UpdateAutoCheck374Toggle() {
    val current = BiliClient.prefs.v374updateAutoCheck374
    BiliClient.prefs.v374updateAutoCheck374 = !current
    AppToast.show(this, "Update Auto Check374: ${if (!current) "ON" else "OFF"}")
}

// v374: VR Mode Enabled374
internal fun PlayerActivity.showV374VrModeEnabled374Toggle() {
    val current = BiliClient.prefs.v374vrModeEnabled374
    BiliClient.prefs.v374vrModeEnabled374 = !current
    AppToast.show(this, "VR Mode Enabled374: ${if (!current) "ON" else "OFF"}")
}

// v374: Accessibility High Contrast374
internal fun PlayerActivity.showV374AccessibilityHighContrast374Toggle() {
    val current = BiliClient.prefs.v374accessibilityHighContrast374
    BiliClient.prefs.v374accessibilityHighContrast374 = !current
    AppToast.show(this, "Accessibility High Contrast374: ${if (!current) "ON" else "OFF"}")
}

// v374: Comment Auto Translate374
internal fun PlayerActivity.showV374CommentAutoTranslate374Toggle() {
    val current = BiliClient.prefs.v374commentAutoTranslate374
    BiliClient.prefs.v374commentAutoTranslate374 = !current
    AppToast.show(this, "Comment Auto Translate374: ${if (!current) "ON" else "OFF"}")
}

// v374: Data Usage Limit374
internal fun PlayerActivity.showV374DataUsageLimit374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v374dataUsageLimit374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v374dataUsageLimit374 = value
        AppToast.show(this, "Data Usage Limit374: $value")
    }
}

// v374: Thumbnail Preview374
internal fun PlayerActivity.showV374ThumbnailPreview374Toggle() {
    val current = BiliClient.prefs.v374thumbnailPreview374
    BiliClient.prefs.v374thumbnailPreview374 = !current
    AppToast.show(this, "Thumbnail Preview374: ${if (!current) "ON" else "OFF"}")
}

// v375: Caption Auto Detect375
internal fun PlayerActivity.showV375CaptionAutoDetect375Toggle() {
    val current = BiliClient.prefs.v375captionAutoDetect375
    BiliClient.prefs.v375captionAutoDetect375 = !current
    AppToast.show(this, "Caption Auto Detect375: ${if (!current) "ON" else "OFF"}")
}

// v375: Caption Font Size375
internal fun PlayerActivity.showV375CaptionFontSize375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375captionFontSize375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375captionFontSize375 = value
        AppToast.show(this, "Caption Font Size375: $value")
    }
}

// v375: Caption Position375
internal fun PlayerActivity.showV375CaptionPosition375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375captionPosition375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375captionPosition375 = value
        AppToast.show(this, "Caption Position375: $value")
    }
}

// v375: Chromecast Auto Connect375
internal fun PlayerActivity.showV375ChromecastAutoConnect375Toggle() {
    val current = BiliClient.prefs.v375chromecastAutoConnect375
    BiliClient.prefs.v375chromecastAutoConnect375 = !current
    AppToast.show(this, "Chromecast Auto Connect375: ${if (!current) "ON" else "OFF"}")
}

// v375: Chromecast Quality375
internal fun PlayerActivity.showV375ChromecastQuality375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375chromecastQuality375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375chromecastQuality375 = value
        AppToast.show(this, "Chromecast Quality375: $value")
    }
}

// v375: Floating Window Enabled375
internal fun PlayerActivity.showV375FloatingWindowEnabled375Toggle() {
    val current = BiliClient.prefs.v375floatingWindowEnabled375
    BiliClient.prefs.v375floatingWindowEnabled375 = !current
    AppToast.show(this, "Floating Window Enabled375: ${if (!current) "ON" else "OFF"}")
}

// v375: Floating Window Size375
internal fun PlayerActivity.showV375FloatingWindowSize375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375floatingWindowSize375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375floatingWindowSize375 = value
        AppToast.show(this, "Floating Window Size375: $value")
    }
}

// v375: NFC Auto Transfer375
internal fun PlayerActivity.showV375NfcAutoTransfer375Toggle() {
    val current = BiliClient.prefs.v375nfcAutoTransfer375
    BiliClient.prefs.v375nfcAutoTransfer375 = !current
    AppToast.show(this, "NFC Auto Transfer375: ${if (!current) "ON" else "OFF"}")
}

// v375: Recommend Algorithm375
internal fun PlayerActivity.showV375RecommendAlgorithm375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375recommendAlgorithm375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375recommendAlgorithm375 = value
        AppToast.show(this, "Recommend Algorithm375: $value")
    }
}

// v375: Update Auto Check375
internal fun PlayerActivity.showV375UpdateAutoCheck375Toggle() {
    val current = BiliClient.prefs.v375updateAutoCheck375
    BiliClient.prefs.v375updateAutoCheck375 = !current
    AppToast.show(this, "Update Auto Check375: ${if (!current) "ON" else "OFF"}")
}

// v375: VR Mode Enabled375
internal fun PlayerActivity.showV375VrModeEnabled375Toggle() {
    val current = BiliClient.prefs.v375vrModeEnabled375
    BiliClient.prefs.v375vrModeEnabled375 = !current
    AppToast.show(this, "VR Mode Enabled375: ${if (!current) "ON" else "OFF"}")
}

// v375: Accessibility High Contrast375
internal fun PlayerActivity.showV375AccessibilityHighContrast375Toggle() {
    val current = BiliClient.prefs.v375accessibilityHighContrast375
    BiliClient.prefs.v375accessibilityHighContrast375 = !current
    AppToast.show(this, "Accessibility High Contrast375: ${if (!current) "ON" else "OFF"}")
}

// v375: Comment Auto Translate375
internal fun PlayerActivity.showV375CommentAutoTranslate375Toggle() {
    val current = BiliClient.prefs.v375commentAutoTranslate375
    BiliClient.prefs.v375commentAutoTranslate375 = !current
    AppToast.show(this, "Comment Auto Translate375: ${if (!current) "ON" else "OFF"}")
}

// v375: Data Usage Limit375
internal fun PlayerActivity.showV375DataUsageLimit375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v375dataUsageLimit375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v375dataUsageLimit375 = value
        AppToast.show(this, "Data Usage Limit375: $value")
    }
}

// v375: Thumbnail Preview375
internal fun PlayerActivity.showV375ThumbnailPreview375Toggle() {
    val current = BiliClient.prefs.v375thumbnailPreview375
    BiliClient.prefs.v375thumbnailPreview375 = !current
    AppToast.show(this, "Thumbnail Preview375: ${if (!current) "ON" else "OFF"}")
}

// v376: Caption Auto Detect376
internal fun PlayerActivity.showV376CaptionAutoDetect376Toggle() {
    val current = BiliClient.prefs.v376captionAutoDetect376
    BiliClient.prefs.v376captionAutoDetect376 = !current
    AppToast.show(this, "Caption Auto Detect376: ${if (!current) "ON" else "OFF"}")
}

// v376: Caption Font Size376
internal fun PlayerActivity.showV376CaptionFontSize376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376captionFontSize376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376captionFontSize376 = value
        AppToast.show(this, "Caption Font Size376: $value")
    }
}

// v376: Caption Position376
internal fun PlayerActivity.showV376CaptionPosition376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376captionPosition376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376captionPosition376 = value
        AppToast.show(this, "Caption Position376: $value")
    }
}

// v376: Chromecast Auto Connect376
internal fun PlayerActivity.showV376ChromecastAutoConnect376Toggle() {
    val current = BiliClient.prefs.v376chromecastAutoConnect376
    BiliClient.prefs.v376chromecastAutoConnect376 = !current
    AppToast.show(this, "Chromecast Auto Connect376: ${if (!current) "ON" else "OFF"}")
}

// v376: Chromecast Quality376
internal fun PlayerActivity.showV376ChromecastQuality376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376chromecastQuality376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376chromecastQuality376 = value
        AppToast.show(this, "Chromecast Quality376: $value")
    }
}

// v376: Floating Window Enabled376
internal fun PlayerActivity.showV376FloatingWindowEnabled376Toggle() {
    val current = BiliClient.prefs.v376floatingWindowEnabled376
    BiliClient.prefs.v376floatingWindowEnabled376 = !current
    AppToast.show(this, "Floating Window Enabled376: ${if (!current) "ON" else "OFF"}")
}

// v376: Floating Window Size376
internal fun PlayerActivity.showV376FloatingWindowSize376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376floatingWindowSize376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376floatingWindowSize376 = value
        AppToast.show(this, "Floating Window Size376: $value")
    }
}

// v376: NFC Auto Transfer376
internal fun PlayerActivity.showV376NfcAutoTransfer376Toggle() {
    val current = BiliClient.prefs.v376nfcAutoTransfer376
    BiliClient.prefs.v376nfcAutoTransfer376 = !current
    AppToast.show(this, "NFC Auto Transfer376: ${if (!current) "ON" else "OFF"}")
}

// v376: Recommend Algorithm376
internal fun PlayerActivity.showV376RecommendAlgorithm376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376recommendAlgorithm376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376recommendAlgorithm376 = value
        AppToast.show(this, "Recommend Algorithm376: $value")
    }
}

// v376: Update Auto Check376
internal fun PlayerActivity.showV376UpdateAutoCheck376Toggle() {
    val current = BiliClient.prefs.v376updateAutoCheck376
    BiliClient.prefs.v376updateAutoCheck376 = !current
    AppToast.show(this, "Update Auto Check376: ${if (!current) "ON" else "OFF"}")
}

// v376: VR Mode Enabled376
internal fun PlayerActivity.showV376VrModeEnabled376Toggle() {
    val current = BiliClient.prefs.v376vrModeEnabled376
    BiliClient.prefs.v376vrModeEnabled376 = !current
    AppToast.show(this, "VR Mode Enabled376: ${if (!current) "ON" else "OFF"}")
}

// v376: Accessibility High Contrast376
internal fun PlayerActivity.showV376AccessibilityHighContrast376Toggle() {
    val current = BiliClient.prefs.v376accessibilityHighContrast376
    BiliClient.prefs.v376accessibilityHighContrast376 = !current
    AppToast.show(this, "Accessibility High Contrast376: ${if (!current) "ON" else "OFF"}")
}

// v376: Comment Auto Translate376
internal fun PlayerActivity.showV376CommentAutoTranslate376Toggle() {
    val current = BiliClient.prefs.v376commentAutoTranslate376
    BiliClient.prefs.v376commentAutoTranslate376 = !current
    AppToast.show(this, "Comment Auto Translate376: ${if (!current) "ON" else "OFF"}")
}

// v376: Data Usage Limit376
internal fun PlayerActivity.showV376DataUsageLimit376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v376dataUsageLimit376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v376dataUsageLimit376 = value
        AppToast.show(this, "Data Usage Limit376: $value")
    }
}

// v376: Thumbnail Preview376
internal fun PlayerActivity.showV376ThumbnailPreview376Toggle() {
    val current = BiliClient.prefs.v376thumbnailPreview376
    BiliClient.prefs.v376thumbnailPreview376 = !current
    AppToast.show(this, "Thumbnail Preview376: ${if (!current) "ON" else "OFF"}")
}

// v377: Caption Auto Detect377
internal fun PlayerActivity.showV377CaptionAutoDetect377Toggle() {
    val current = BiliClient.prefs.v377captionAutoDetect377
    BiliClient.prefs.v377captionAutoDetect377 = !current
    AppToast.show(this, "Caption Auto Detect377: ${if (!current) "ON" else "OFF"}")
}

// v377: Caption Font Size377
internal fun PlayerActivity.showV377CaptionFontSize377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377captionFontSize377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377captionFontSize377 = value
        AppToast.show(this, "Caption Font Size377: $value")
    }
}

// v377: Caption Position377
internal fun PlayerActivity.showV377CaptionPosition377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377captionPosition377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377captionPosition377 = value
        AppToast.show(this, "Caption Position377: $value")
    }
}

// v377: Chromecast Auto Connect377
internal fun PlayerActivity.showV377ChromecastAutoConnect377Toggle() {
    val current = BiliClient.prefs.v377chromecastAutoConnect377
    BiliClient.prefs.v377chromecastAutoConnect377 = !current
    AppToast.show(this, "Chromecast Auto Connect377: ${if (!current) "ON" else "OFF"}")
}

// v377: Chromecast Quality377
internal fun PlayerActivity.showV377ChromecastQuality377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377chromecastQuality377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377chromecastQuality377 = value
        AppToast.show(this, "Chromecast Quality377: $value")
    }
}

// v377: Floating Window Enabled377
internal fun PlayerActivity.showV377FloatingWindowEnabled377Toggle() {
    val current = BiliClient.prefs.v377floatingWindowEnabled377
    BiliClient.prefs.v377floatingWindowEnabled377 = !current
    AppToast.show(this, "Floating Window Enabled377: ${if (!current) "ON" else "OFF"}")
}

// v377: Floating Window Size377
internal fun PlayerActivity.showV377FloatingWindowSize377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377floatingWindowSize377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377floatingWindowSize377 = value
        AppToast.show(this, "Floating Window Size377: $value")
    }
}

// v377: NFC Auto Transfer377
internal fun PlayerActivity.showV377NfcAutoTransfer377Toggle() {
    val current = BiliClient.prefs.v377nfcAutoTransfer377
    BiliClient.prefs.v377nfcAutoTransfer377 = !current
    AppToast.show(this, "NFC Auto Transfer377: ${if (!current) "ON" else "OFF"}")
}

// v377: Recommend Algorithm377
internal fun PlayerActivity.showV377RecommendAlgorithm377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377recommendAlgorithm377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377recommendAlgorithm377 = value
        AppToast.show(this, "Recommend Algorithm377: $value")
    }
}

// v377: Update Auto Check377
internal fun PlayerActivity.showV377UpdateAutoCheck377Toggle() {
    val current = BiliClient.prefs.v377updateAutoCheck377
    BiliClient.prefs.v377updateAutoCheck377 = !current
    AppToast.show(this, "Update Auto Check377: ${if (!current) "ON" else "OFF"}")
}

// v377: VR Mode Enabled377
internal fun PlayerActivity.showV377VrModeEnabled377Toggle() {
    val current = BiliClient.prefs.v377vrModeEnabled377
    BiliClient.prefs.v377vrModeEnabled377 = !current
    AppToast.show(this, "VR Mode Enabled377: ${if (!current) "ON" else "OFF"}")
}

// v377: Accessibility High Contrast377
internal fun PlayerActivity.showV377AccessibilityHighContrast377Toggle() {
    val current = BiliClient.prefs.v377accessibilityHighContrast377
    BiliClient.prefs.v377accessibilityHighContrast377 = !current
    AppToast.show(this, "Accessibility High Contrast377: ${if (!current) "ON" else "OFF"}")
}

// v377: Comment Auto Translate377
internal fun PlayerActivity.showV377CommentAutoTranslate377Toggle() {
    val current = BiliClient.prefs.v377commentAutoTranslate377
    BiliClient.prefs.v377commentAutoTranslate377 = !current
    AppToast.show(this, "Comment Auto Translate377: ${if (!current) "ON" else "OFF"}")
}

// v377: Data Usage Limit377
internal fun PlayerActivity.showV377DataUsageLimit377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v377dataUsageLimit377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v377dataUsageLimit377 = value
        AppToast.show(this, "Data Usage Limit377: $value")
    }
}

// v377: Thumbnail Preview377
internal fun PlayerActivity.showV377ThumbnailPreview377Toggle() {
    val current = BiliClient.prefs.v377thumbnailPreview377
    BiliClient.prefs.v377thumbnailPreview377 = !current
    AppToast.show(this, "Thumbnail Preview377: ${if (!current) "ON" else "OFF"}")
}

// v378: Caption Auto Detect378
internal fun PlayerActivity.showV378CaptionAutoDetect378Toggle() {
    val current = BiliClient.prefs.v378captionAutoDetect378
    BiliClient.prefs.v378captionAutoDetect378 = !current
    AppToast.show(this, "Caption Auto Detect378: ${if (!current) "ON" else "OFF"}")
}

// v378: Caption Font Size378
internal fun PlayerActivity.showV378CaptionFontSize378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378captionFontSize378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378captionFontSize378 = value
        AppToast.show(this, "Caption Font Size378: $value")
    }
}

// v378: Caption Position378
internal fun PlayerActivity.showV378CaptionPosition378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378captionPosition378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378captionPosition378 = value
        AppToast.show(this, "Caption Position378: $value")
    }
}

// v378: Chromecast Auto Connect378
internal fun PlayerActivity.showV378ChromecastAutoConnect378Toggle() {
    val current = BiliClient.prefs.v378chromecastAutoConnect378
    BiliClient.prefs.v378chromecastAutoConnect378 = !current
    AppToast.show(this, "Chromecast Auto Connect378: ${if (!current) "ON" else "OFF"}")
}

// v378: Chromecast Quality378
internal fun PlayerActivity.showV378ChromecastQuality378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378chromecastQuality378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378chromecastQuality378 = value
        AppToast.show(this, "Chromecast Quality378: $value")
    }
}

// v378: Floating Window Enabled378
internal fun PlayerActivity.showV378FloatingWindowEnabled378Toggle() {
    val current = BiliClient.prefs.v378floatingWindowEnabled378
    BiliClient.prefs.v378floatingWindowEnabled378 = !current
    AppToast.show(this, "Floating Window Enabled378: ${if (!current) "ON" else "OFF"}")
}

// v378: Floating Window Size378
internal fun PlayerActivity.showV378FloatingWindowSize378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378floatingWindowSize378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378floatingWindowSize378 = value
        AppToast.show(this, "Floating Window Size378: $value")
    }
}

// v378: NFC Auto Transfer378
internal fun PlayerActivity.showV378NfcAutoTransfer378Toggle() {
    val current = BiliClient.prefs.v378nfcAutoTransfer378
    BiliClient.prefs.v378nfcAutoTransfer378 = !current
    AppToast.show(this, "NFC Auto Transfer378: ${if (!current) "ON" else "OFF"}")
}

// v378: Recommend Algorithm378
internal fun PlayerActivity.showV378RecommendAlgorithm378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378recommendAlgorithm378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378recommendAlgorithm378 = value
        AppToast.show(this, "Recommend Algorithm378: $value")
    }
}

// v378: Update Auto Check378
internal fun PlayerActivity.showV378UpdateAutoCheck378Toggle() {
    val current = BiliClient.prefs.v378updateAutoCheck378
    BiliClient.prefs.v378updateAutoCheck378 = !current
    AppToast.show(this, "Update Auto Check378: ${if (!current) "ON" else "OFF"}")
}

// v378: VR Mode Enabled378
internal fun PlayerActivity.showV378VrModeEnabled378Toggle() {
    val current = BiliClient.prefs.v378vrModeEnabled378
    BiliClient.prefs.v378vrModeEnabled378 = !current
    AppToast.show(this, "VR Mode Enabled378: ${if (!current) "ON" else "OFF"}")
}

// v378: Accessibility High Contrast378
internal fun PlayerActivity.showV378AccessibilityHighContrast378Toggle() {
    val current = BiliClient.prefs.v378accessibilityHighContrast378
    BiliClient.prefs.v378accessibilityHighContrast378 = !current
    AppToast.show(this, "Accessibility High Contrast378: ${if (!current) "ON" else "OFF"}")
}

// v378: Comment Auto Translate378
internal fun PlayerActivity.showV378CommentAutoTranslate378Toggle() {
    val current = BiliClient.prefs.v378commentAutoTranslate378
    BiliClient.prefs.v378commentAutoTranslate378 = !current
    AppToast.show(this, "Comment Auto Translate378: ${if (!current) "ON" else "OFF"}")
}

// v378: Data Usage Limit378
internal fun PlayerActivity.showV378DataUsageLimit378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v378dataUsageLimit378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v378dataUsageLimit378 = value
        AppToast.show(this, "Data Usage Limit378: $value")
    }
}

// v378: Thumbnail Preview378
internal fun PlayerActivity.showV378ThumbnailPreview378Toggle() {
    val current = BiliClient.prefs.v378thumbnailPreview378
    BiliClient.prefs.v378thumbnailPreview378 = !current
    AppToast.show(this, "Thumbnail Preview378: ${if (!current) "ON" else "OFF"}")
}

// v379: Caption Auto Detect379
internal fun PlayerActivity.showV379CaptionAutoDetect379Toggle() {
    val current = BiliClient.prefs.v379captionAutoDetect379
    BiliClient.prefs.v379captionAutoDetect379 = !current
    AppToast.show(this, "Caption Auto Detect379: ${if (!current) "ON" else "OFF"}")
}

// v379: Caption Font Size379
internal fun PlayerActivity.showV379CaptionFontSize379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379captionFontSize379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379captionFontSize379 = value
        AppToast.show(this, "Caption Font Size379: $value")
    }
}

// v379: Caption Position379
internal fun PlayerActivity.showV379CaptionPosition379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379captionPosition379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379captionPosition379 = value
        AppToast.show(this, "Caption Position379: $value")
    }
}

// v379: Chromecast Auto Connect379
internal fun PlayerActivity.showV379ChromecastAutoConnect379Toggle() {
    val current = BiliClient.prefs.v379chromecastAutoConnect379
    BiliClient.prefs.v379chromecastAutoConnect379 = !current
    AppToast.show(this, "Chromecast Auto Connect379: ${if (!current) "ON" else "OFF"}")
}

// v379: Chromecast Quality379
internal fun PlayerActivity.showV379ChromecastQuality379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379chromecastQuality379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379chromecastQuality379 = value
        AppToast.show(this, "Chromecast Quality379: $value")
    }
}

// v379: Floating Window Enabled379
internal fun PlayerActivity.showV379FloatingWindowEnabled379Toggle() {
    val current = BiliClient.prefs.v379floatingWindowEnabled379
    BiliClient.prefs.v379floatingWindowEnabled379 = !current
    AppToast.show(this, "Floating Window Enabled379: ${if (!current) "ON" else "OFF"}")
}

// v379: Floating Window Size379
internal fun PlayerActivity.showV379FloatingWindowSize379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379floatingWindowSize379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379floatingWindowSize379 = value
        AppToast.show(this, "Floating Window Size379: $value")
    }
}

// v379: NFC Auto Transfer379
internal fun PlayerActivity.showV379NfcAutoTransfer379Toggle() {
    val current = BiliClient.prefs.v379nfcAutoTransfer379
    BiliClient.prefs.v379nfcAutoTransfer379 = !current
    AppToast.show(this, "NFC Auto Transfer379: ${if (!current) "ON" else "OFF"}")
}

// v379: Recommend Algorithm379
internal fun PlayerActivity.showV379RecommendAlgorithm379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379recommendAlgorithm379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379recommendAlgorithm379 = value
        AppToast.show(this, "Recommend Algorithm379: $value")
    }
}

// v379: Update Auto Check379
internal fun PlayerActivity.showV379UpdateAutoCheck379Toggle() {
    val current = BiliClient.prefs.v379updateAutoCheck379
    BiliClient.prefs.v379updateAutoCheck379 = !current
    AppToast.show(this, "Update Auto Check379: ${if (!current) "ON" else "OFF"}")
}

// v379: VR Mode Enabled379
internal fun PlayerActivity.showV379VrModeEnabled379Toggle() {
    val current = BiliClient.prefs.v379vrModeEnabled379
    BiliClient.prefs.v379vrModeEnabled379 = !current
    AppToast.show(this, "VR Mode Enabled379: ${if (!current) "ON" else "OFF"}")
}

// v379: Accessibility High Contrast379
internal fun PlayerActivity.showV379AccessibilityHighContrast379Toggle() {
    val current = BiliClient.prefs.v379accessibilityHighContrast379
    BiliClient.prefs.v379accessibilityHighContrast379 = !current
    AppToast.show(this, "Accessibility High Contrast379: ${if (!current) "ON" else "OFF"}")
}

// v379: Comment Auto Translate379
internal fun PlayerActivity.showV379CommentAutoTranslate379Toggle() {
    val current = BiliClient.prefs.v379commentAutoTranslate379
    BiliClient.prefs.v379commentAutoTranslate379 = !current
    AppToast.show(this, "Comment Auto Translate379: ${if (!current) "ON" else "OFF"}")
}

// v379: Data Usage Limit379
internal fun PlayerActivity.showV379DataUsageLimit379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v379dataUsageLimit379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v379dataUsageLimit379 = value
        AppToast.show(this, "Data Usage Limit379: $value")
    }
}

// v379: Thumbnail Preview379
internal fun PlayerActivity.showV379ThumbnailPreview379Toggle() {
    val current = BiliClient.prefs.v379thumbnailPreview379
    BiliClient.prefs.v379thumbnailPreview379 = !current
    AppToast.show(this, "Thumbnail Preview379: ${if (!current) "ON" else "OFF"}")
}

// v380: Caption Auto Detect380
internal fun PlayerActivity.showV380CaptionAutoDetect380Toggle() {
    val current = BiliClient.prefs.v380captionAutoDetect380
    BiliClient.prefs.v380captionAutoDetect380 = !current
    AppToast.show(this, "Caption Auto Detect380: ${if (!current) "ON" else "OFF"}")
}

// v380: Caption Font Size380
internal fun PlayerActivity.showV380CaptionFontSize380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380captionFontSize380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380captionFontSize380 = value
        AppToast.show(this, "Caption Font Size380: $value")
    }
}

// v380: Caption Position380
internal fun PlayerActivity.showV380CaptionPosition380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380captionPosition380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380captionPosition380 = value
        AppToast.show(this, "Caption Position380: $value")
    }
}

// v380: Chromecast Auto Connect380
internal fun PlayerActivity.showV380ChromecastAutoConnect380Toggle() {
    val current = BiliClient.prefs.v380chromecastAutoConnect380
    BiliClient.prefs.v380chromecastAutoConnect380 = !current
    AppToast.show(this, "Chromecast Auto Connect380: ${if (!current) "ON" else "OFF"}")
}

// v380: Chromecast Quality380
internal fun PlayerActivity.showV380ChromecastQuality380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380chromecastQuality380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380chromecastQuality380 = value
        AppToast.show(this, "Chromecast Quality380: $value")
    }
}

// v380: Floating Window Enabled380
internal fun PlayerActivity.showV380FloatingWindowEnabled380Toggle() {
    val current = BiliClient.prefs.v380floatingWindowEnabled380
    BiliClient.prefs.v380floatingWindowEnabled380 = !current
    AppToast.show(this, "Floating Window Enabled380: ${if (!current) "ON" else "OFF"}")
}

// v380: Floating Window Size380
internal fun PlayerActivity.showV380FloatingWindowSize380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380floatingWindowSize380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380floatingWindowSize380 = value
        AppToast.show(this, "Floating Window Size380: $value")
    }
}

// v380: NFC Auto Transfer380
internal fun PlayerActivity.showV380NfcAutoTransfer380Toggle() {
    val current = BiliClient.prefs.v380nfcAutoTransfer380
    BiliClient.prefs.v380nfcAutoTransfer380 = !current
    AppToast.show(this, "NFC Auto Transfer380: ${if (!current) "ON" else "OFF"}")
}

// v380: Recommend Algorithm380
internal fun PlayerActivity.showV380RecommendAlgorithm380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380recommendAlgorithm380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380recommendAlgorithm380 = value
        AppToast.show(this, "Recommend Algorithm380: $value")
    }
}

// v380: Update Auto Check380
internal fun PlayerActivity.showV380UpdateAutoCheck380Toggle() {
    val current = BiliClient.prefs.v380updateAutoCheck380
    BiliClient.prefs.v380updateAutoCheck380 = !current
    AppToast.show(this, "Update Auto Check380: ${if (!current) "ON" else "OFF"}")
}

// v380: VR Mode Enabled380
internal fun PlayerActivity.showV380VrModeEnabled380Toggle() {
    val current = BiliClient.prefs.v380vrModeEnabled380
    BiliClient.prefs.v380vrModeEnabled380 = !current
    AppToast.show(this, "VR Mode Enabled380: ${if (!current) "ON" else "OFF"}")
}

// v380: Accessibility High Contrast380
internal fun PlayerActivity.showV380AccessibilityHighContrast380Toggle() {
    val current = BiliClient.prefs.v380accessibilityHighContrast380
    BiliClient.prefs.v380accessibilityHighContrast380 = !current
    AppToast.show(this, "Accessibility High Contrast380: ${if (!current) "ON" else "OFF"}")
}

// v380: Comment Auto Translate380
internal fun PlayerActivity.showV380CommentAutoTranslate380Toggle() {
    val current = BiliClient.prefs.v380commentAutoTranslate380
    BiliClient.prefs.v380commentAutoTranslate380 = !current
    AppToast.show(this, "Comment Auto Translate380: ${if (!current) "ON" else "OFF"}")
}

// v380: Data Usage Limit380
internal fun PlayerActivity.showV380DataUsageLimit380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v380dataUsageLimit380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Data Usage Limit380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v380dataUsageLimit380 = value
        AppToast.show(this, "Data Usage Limit380: $value")
    }
}

// v380: Thumbnail Preview380
internal fun PlayerActivity.showV380ThumbnailPreview380Toggle() {
    val current = BiliClient.prefs.v380thumbnailPreview380
    BiliClient.prefs.v380thumbnailPreview380 = !current
    AppToast.show(this, "Thumbnail Preview380: ${if (!current) "ON" else "OFF"}")
}

// v381: Grid Layout Columns381
internal fun PlayerActivity.showV381GridLayoutColumns381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381gridLayoutColumns381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381gridLayoutColumns381 = value
        AppToast.show(this, "Grid Layout Columns381: $value")
    }
}

// v381: Grid Layout Spacing381
internal fun PlayerActivity.showV381GridLayoutSpacing381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381gridLayoutSpacing381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381gridLayoutSpacing381 = value
        AppToast.show(this, "Grid Layout Spacing381: $value")
    }
}

// v381: Grid Layout Animation381
internal fun PlayerActivity.showV381GridLayoutAnimation381Toggle() {
    val current = BiliClient.prefs.v381gridLayoutAnimation381
    BiliClient.prefs.v381gridLayoutAnimation381 = !current
    AppToast.show(this, "Grid Layout Animation381: ${if (!current) "ON" else "OFF"}")
}

// v381: Page Size Limit381
internal fun PlayerActivity.showV381PageSizeLimit381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381pageSizeLimit381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381pageSizeLimit381 = value
        AppToast.show(this, "Page Size Limit381: $value")
    }
}

// v381: Page Auto Load381
internal fun PlayerActivity.showV381PageAutoLoad381Toggle() {
    val current = BiliClient.prefs.v381pageAutoLoad381
    BiliClient.prefs.v381pageAutoLoad381 = !current
    AppToast.show(this, "Page Auto Load381: ${if (!current) "ON" else "OFF"}")
}

// v381: Panel Auto Hide381
internal fun PlayerActivity.showV381PanelAutoHide381Toggle() {
    val current = BiliClient.prefs.v381panelAutoHide381
    BiliClient.prefs.v381panelAutoHide381 = !current
    AppToast.show(this, "Panel Auto Hide381: ${if (!current) "ON" else "OFF"}")
}

// v381: Panel Position381
internal fun PlayerActivity.showV381PanelPosition381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381panelPosition381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381panelPosition381 = value
        AppToast.show(this, "Panel Position381: $value")
    }
}

// v381: SubList Auto Collapse381
internal fun PlayerActivity.showV381SubListAutoCollapse381Toggle() {
    val current = BiliClient.prefs.v381subListAutoCollapse381
    BiliClient.prefs.v381subListAutoCollapse381 = !current
    AppToast.show(this, "SubList Auto Collapse381: ${if (!current) "ON" else "OFF"}")
}

// v381: SyncPlay Latency381
internal fun PlayerActivity.showV381SyncPlayLatency381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v381syncPlayLatency381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v381syncPlayLatency381 = value
        AppToast.show(this, "SyncPlay Latency381: $value")
    }
}

// v381: SyncPlay Auto Join381
internal fun PlayerActivity.showV381SyncPlayAutoJoin381Toggle() {
    val current = BiliClient.prefs.v381syncPlayAutoJoin381
    BiliClient.prefs.v381syncPlayAutoJoin381 = !current
    AppToast.show(this, "SyncPlay Auto Join381: ${if (!current) "ON" else "OFF"}")
}

// v381: Proxy Auto Detect381
internal fun PlayerActivity.showV381ProxyAutoDetect381Toggle() {
    val current = BiliClient.prefs.v381proxyAutoDetect381
    BiliClient.prefs.v381proxyAutoDetect381 = !current
    AppToast.show(this, "Proxy Auto Detect381: ${if (!current) "ON" else "OFF"}")
}

// v381: Queue Auto Sort381
internal fun PlayerActivity.showV381QueueAutoSort381Toggle() {
    val current = BiliClient.prefs.v381queueAutoSort381
    BiliClient.prefs.v381queueAutoSort381 = !current
    AppToast.show(this, "Queue Auto Sort381: ${if (!current) "ON" else "OFF"}")
}

// v381: Record Auto Save381
internal fun PlayerActivity.showV381RecordAutoSave381Toggle() {
    val current = BiliClient.prefs.v381recordAutoSave381
    BiliClient.prefs.v381recordAutoSave381 = !current
    AppToast.show(this, "Record Auto Save381: ${if (!current) "ON" else "OFF"}")
}

// v381: Image Enhance Sharp381
internal fun PlayerActivity.showV381ImageEnhanceSharp381Toggle() {
    val current = BiliClient.prefs.v381imageEnhanceSharp381
    BiliClient.prefs.v381imageEnhanceSharp381 = !current
    AppToast.show(this, "Image Enhance Sharp381: ${if (!current) "ON" else "OFF"}")
}

// v381: Image Enhance Denoise381
internal fun PlayerActivity.showV381ImageEnhanceDenoise381Toggle() {
    val current = BiliClient.prefs.v381imageEnhanceDenoise381
    BiliClient.prefs.v381imageEnhanceDenoise381 = !current
    AppToast.show(this, "Image Enhance Denoise381: ${if (!current) "ON" else "OFF"}")
}

// v382: Grid Layout Columns382
internal fun PlayerActivity.showV382GridLayoutColumns382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382gridLayoutColumns382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382gridLayoutColumns382 = value
        AppToast.show(this, "Grid Layout Columns382: $value")
    }
}

// v382: Grid Layout Spacing382
internal fun PlayerActivity.showV382GridLayoutSpacing382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382gridLayoutSpacing382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382gridLayoutSpacing382 = value
        AppToast.show(this, "Grid Layout Spacing382: $value")
    }
}

// v382: Grid Layout Animation382
internal fun PlayerActivity.showV382GridLayoutAnimation382Toggle() {
    val current = BiliClient.prefs.v382gridLayoutAnimation382
    BiliClient.prefs.v382gridLayoutAnimation382 = !current
    AppToast.show(this, "Grid Layout Animation382: ${if (!current) "ON" else "OFF"}")
}

// v382: Page Size Limit382
internal fun PlayerActivity.showV382PageSizeLimit382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382pageSizeLimit382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382pageSizeLimit382 = value
        AppToast.show(this, "Page Size Limit382: $value")
    }
}

// v382: Page Auto Load382
internal fun PlayerActivity.showV382PageAutoLoad382Toggle() {
    val current = BiliClient.prefs.v382pageAutoLoad382
    BiliClient.prefs.v382pageAutoLoad382 = !current
    AppToast.show(this, "Page Auto Load382: ${if (!current) "ON" else "OFF"}")
}

// v382: Panel Auto Hide382
internal fun PlayerActivity.showV382PanelAutoHide382Toggle() {
    val current = BiliClient.prefs.v382panelAutoHide382
    BiliClient.prefs.v382panelAutoHide382 = !current
    AppToast.show(this, "Panel Auto Hide382: ${if (!current) "ON" else "OFF"}")
}

// v382: Panel Position382
internal fun PlayerActivity.showV382PanelPosition382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382panelPosition382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382panelPosition382 = value
        AppToast.show(this, "Panel Position382: $value")
    }
}

// v382: SubList Auto Collapse382
internal fun PlayerActivity.showV382SubListAutoCollapse382Toggle() {
    val current = BiliClient.prefs.v382subListAutoCollapse382
    BiliClient.prefs.v382subListAutoCollapse382 = !current
    AppToast.show(this, "SubList Auto Collapse382: ${if (!current) "ON" else "OFF"}")
}

// v382: SyncPlay Latency382
internal fun PlayerActivity.showV382SyncPlayLatency382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v382syncPlayLatency382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v382syncPlayLatency382 = value
        AppToast.show(this, "SyncPlay Latency382: $value")
    }
}

// v382: SyncPlay Auto Join382
internal fun PlayerActivity.showV382SyncPlayAutoJoin382Toggle() {
    val current = BiliClient.prefs.v382syncPlayAutoJoin382
    BiliClient.prefs.v382syncPlayAutoJoin382 = !current
    AppToast.show(this, "SyncPlay Auto Join382: ${if (!current) "ON" else "OFF"}")
}

// v382: Proxy Auto Detect382
internal fun PlayerActivity.showV382ProxyAutoDetect382Toggle() {
    val current = BiliClient.prefs.v382proxyAutoDetect382
    BiliClient.prefs.v382proxyAutoDetect382 = !current
    AppToast.show(this, "Proxy Auto Detect382: ${if (!current) "ON" else "OFF"}")
}

// v382: Queue Auto Sort382
internal fun PlayerActivity.showV382QueueAutoSort382Toggle() {
    val current = BiliClient.prefs.v382queueAutoSort382
    BiliClient.prefs.v382queueAutoSort382 = !current
    AppToast.show(this, "Queue Auto Sort382: ${if (!current) "ON" else "OFF"}")
}

// v382: Record Auto Save382
internal fun PlayerActivity.showV382RecordAutoSave382Toggle() {
    val current = BiliClient.prefs.v382recordAutoSave382
    BiliClient.prefs.v382recordAutoSave382 = !current
    AppToast.show(this, "Record Auto Save382: ${if (!current) "ON" else "OFF"}")
}

// v382: Image Enhance Sharp382
internal fun PlayerActivity.showV382ImageEnhanceSharp382Toggle() {
    val current = BiliClient.prefs.v382imageEnhanceSharp382
    BiliClient.prefs.v382imageEnhanceSharp382 = !current
    AppToast.show(this, "Image Enhance Sharp382: ${if (!current) "ON" else "OFF"}")
}

// v382: Image Enhance Denoise382
internal fun PlayerActivity.showV382ImageEnhanceDenoise382Toggle() {
    val current = BiliClient.prefs.v382imageEnhanceDenoise382
    BiliClient.prefs.v382imageEnhanceDenoise382 = !current
    AppToast.show(this, "Image Enhance Denoise382: ${if (!current) "ON" else "OFF"}")
}

// v383: Grid Layout Columns383
internal fun PlayerActivity.showV383GridLayoutColumns383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383gridLayoutColumns383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383gridLayoutColumns383 = value
        AppToast.show(this, "Grid Layout Columns383: $value")
    }
}

// v383: Grid Layout Spacing383
internal fun PlayerActivity.showV383GridLayoutSpacing383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383gridLayoutSpacing383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383gridLayoutSpacing383 = value
        AppToast.show(this, "Grid Layout Spacing383: $value")
    }
}

// v383: Grid Layout Animation383
internal fun PlayerActivity.showV383GridLayoutAnimation383Toggle() {
    val current = BiliClient.prefs.v383gridLayoutAnimation383
    BiliClient.prefs.v383gridLayoutAnimation383 = !current
    AppToast.show(this, "Grid Layout Animation383: ${if (!current) "ON" else "OFF"}")
}

// v383: Page Size Limit383
internal fun PlayerActivity.showV383PageSizeLimit383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383pageSizeLimit383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383pageSizeLimit383 = value
        AppToast.show(this, "Page Size Limit383: $value")
    }
}

// v383: Page Auto Load383
internal fun PlayerActivity.showV383PageAutoLoad383Toggle() {
    val current = BiliClient.prefs.v383pageAutoLoad383
    BiliClient.prefs.v383pageAutoLoad383 = !current
    AppToast.show(this, "Page Auto Load383: ${if (!current) "ON" else "OFF"}")
}

// v383: Panel Auto Hide383
internal fun PlayerActivity.showV383PanelAutoHide383Toggle() {
    val current = BiliClient.prefs.v383panelAutoHide383
    BiliClient.prefs.v383panelAutoHide383 = !current
    AppToast.show(this, "Panel Auto Hide383: ${if (!current) "ON" else "OFF"}")
}

// v383: Panel Position383
internal fun PlayerActivity.showV383PanelPosition383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383panelPosition383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383panelPosition383 = value
        AppToast.show(this, "Panel Position383: $value")
    }
}

// v383: SubList Auto Collapse383
internal fun PlayerActivity.showV383SubListAutoCollapse383Toggle() {
    val current = BiliClient.prefs.v383subListAutoCollapse383
    BiliClient.prefs.v383subListAutoCollapse383 = !current
    AppToast.show(this, "SubList Auto Collapse383: ${if (!current) "ON" else "OFF"}")
}

// v383: SyncPlay Latency383
internal fun PlayerActivity.showV383SyncPlayLatency383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v383syncPlayLatency383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v383syncPlayLatency383 = value
        AppToast.show(this, "SyncPlay Latency383: $value")
    }
}

// v383: SyncPlay Auto Join383
internal fun PlayerActivity.showV383SyncPlayAutoJoin383Toggle() {
    val current = BiliClient.prefs.v383syncPlayAutoJoin383
    BiliClient.prefs.v383syncPlayAutoJoin383 = !current
    AppToast.show(this, "SyncPlay Auto Join383: ${if (!current) "ON" else "OFF"}")
}

// v383: Proxy Auto Detect383
internal fun PlayerActivity.showV383ProxyAutoDetect383Toggle() {
    val current = BiliClient.prefs.v383proxyAutoDetect383
    BiliClient.prefs.v383proxyAutoDetect383 = !current
    AppToast.show(this, "Proxy Auto Detect383: ${if (!current) "ON" else "OFF"}")
}

// v383: Queue Auto Sort383
internal fun PlayerActivity.showV383QueueAutoSort383Toggle() {
    val current = BiliClient.prefs.v383queueAutoSort383
    BiliClient.prefs.v383queueAutoSort383 = !current
    AppToast.show(this, "Queue Auto Sort383: ${if (!current) "ON" else "OFF"}")
}

// v383: Record Auto Save383
internal fun PlayerActivity.showV383RecordAutoSave383Toggle() {
    val current = BiliClient.prefs.v383recordAutoSave383
    BiliClient.prefs.v383recordAutoSave383 = !current
    AppToast.show(this, "Record Auto Save383: ${if (!current) "ON" else "OFF"}")
}

// v383: Image Enhance Sharp383
internal fun PlayerActivity.showV383ImageEnhanceSharp383Toggle() {
    val current = BiliClient.prefs.v383imageEnhanceSharp383
    BiliClient.prefs.v383imageEnhanceSharp383 = !current
    AppToast.show(this, "Image Enhance Sharp383: ${if (!current) "ON" else "OFF"}")
}

// v383: Image Enhance Denoise383
internal fun PlayerActivity.showV383ImageEnhanceDenoise383Toggle() {
    val current = BiliClient.prefs.v383imageEnhanceDenoise383
    BiliClient.prefs.v383imageEnhanceDenoise383 = !current
    AppToast.show(this, "Image Enhance Denoise383: ${if (!current) "ON" else "OFF"}")
}

// v384: Grid Layout Columns384
internal fun PlayerActivity.showV384GridLayoutColumns384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384gridLayoutColumns384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384gridLayoutColumns384 = value
        AppToast.show(this, "Grid Layout Columns384: $value")
    }
}

// v384: Grid Layout Spacing384
internal fun PlayerActivity.showV384GridLayoutSpacing384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384gridLayoutSpacing384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384gridLayoutSpacing384 = value
        AppToast.show(this, "Grid Layout Spacing384: $value")
    }
}

// v384: Grid Layout Animation384
internal fun PlayerActivity.showV384GridLayoutAnimation384Toggle() {
    val current = BiliClient.prefs.v384gridLayoutAnimation384
    BiliClient.prefs.v384gridLayoutAnimation384 = !current
    AppToast.show(this, "Grid Layout Animation384: ${if (!current) "ON" else "OFF"}")
}

// v384: Page Size Limit384
internal fun PlayerActivity.showV384PageSizeLimit384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384pageSizeLimit384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384pageSizeLimit384 = value
        AppToast.show(this, "Page Size Limit384: $value")
    }
}

// v384: Page Auto Load384
internal fun PlayerActivity.showV384PageAutoLoad384Toggle() {
    val current = BiliClient.prefs.v384pageAutoLoad384
    BiliClient.prefs.v384pageAutoLoad384 = !current
    AppToast.show(this, "Page Auto Load384: ${if (!current) "ON" else "OFF"}")
}

// v384: Panel Auto Hide384
internal fun PlayerActivity.showV384PanelAutoHide384Toggle() {
    val current = BiliClient.prefs.v384panelAutoHide384
    BiliClient.prefs.v384panelAutoHide384 = !current
    AppToast.show(this, "Panel Auto Hide384: ${if (!current) "ON" else "OFF"}")
}

// v384: Panel Position384
internal fun PlayerActivity.showV384PanelPosition384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384panelPosition384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384panelPosition384 = value
        AppToast.show(this, "Panel Position384: $value")
    }
}

// v384: SubList Auto Collapse384
internal fun PlayerActivity.showV384SubListAutoCollapse384Toggle() {
    val current = BiliClient.prefs.v384subListAutoCollapse384
    BiliClient.prefs.v384subListAutoCollapse384 = !current
    AppToast.show(this, "SubList Auto Collapse384: ${if (!current) "ON" else "OFF"}")
}

// v384: SyncPlay Latency384
internal fun PlayerActivity.showV384SyncPlayLatency384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v384syncPlayLatency384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v384syncPlayLatency384 = value
        AppToast.show(this, "SyncPlay Latency384: $value")
    }
}

// v384: SyncPlay Auto Join384
internal fun PlayerActivity.showV384SyncPlayAutoJoin384Toggle() {
    val current = BiliClient.prefs.v384syncPlayAutoJoin384
    BiliClient.prefs.v384syncPlayAutoJoin384 = !current
    AppToast.show(this, "SyncPlay Auto Join384: ${if (!current) "ON" else "OFF"}")
}

// v384: Proxy Auto Detect384
internal fun PlayerActivity.showV384ProxyAutoDetect384Toggle() {
    val current = BiliClient.prefs.v384proxyAutoDetect384
    BiliClient.prefs.v384proxyAutoDetect384 = !current
    AppToast.show(this, "Proxy Auto Detect384: ${if (!current) "ON" else "OFF"}")
}

// v384: Queue Auto Sort384
internal fun PlayerActivity.showV384QueueAutoSort384Toggle() {
    val current = BiliClient.prefs.v384queueAutoSort384
    BiliClient.prefs.v384queueAutoSort384 = !current
    AppToast.show(this, "Queue Auto Sort384: ${if (!current) "ON" else "OFF"}")
}

// v384: Record Auto Save384
internal fun PlayerActivity.showV384RecordAutoSave384Toggle() {
    val current = BiliClient.prefs.v384recordAutoSave384
    BiliClient.prefs.v384recordAutoSave384 = !current
    AppToast.show(this, "Record Auto Save384: ${if (!current) "ON" else "OFF"}")
}

// v384: Image Enhance Sharp384
internal fun PlayerActivity.showV384ImageEnhanceSharp384Toggle() {
    val current = BiliClient.prefs.v384imageEnhanceSharp384
    BiliClient.prefs.v384imageEnhanceSharp384 = !current
    AppToast.show(this, "Image Enhance Sharp384: ${if (!current) "ON" else "OFF"}")
}

// v384: Image Enhance Denoise384
internal fun PlayerActivity.showV384ImageEnhanceDenoise384Toggle() {
    val current = BiliClient.prefs.v384imageEnhanceDenoise384
    BiliClient.prefs.v384imageEnhanceDenoise384 = !current
    AppToast.show(this, "Image Enhance Denoise384: ${if (!current) "ON" else "OFF"}")
}

// v385: Grid Layout Columns385
internal fun PlayerActivity.showV385GridLayoutColumns385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385gridLayoutColumns385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385gridLayoutColumns385 = value
        AppToast.show(this, "Grid Layout Columns385: $value")
    }
}

// v385: Grid Layout Spacing385
internal fun PlayerActivity.showV385GridLayoutSpacing385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385gridLayoutSpacing385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385gridLayoutSpacing385 = value
        AppToast.show(this, "Grid Layout Spacing385: $value")
    }
}

// v385: Grid Layout Animation385
internal fun PlayerActivity.showV385GridLayoutAnimation385Toggle() {
    val current = BiliClient.prefs.v385gridLayoutAnimation385
    BiliClient.prefs.v385gridLayoutAnimation385 = !current
    AppToast.show(this, "Grid Layout Animation385: ${if (!current) "ON" else "OFF"}")
}

// v385: Page Size Limit385
internal fun PlayerActivity.showV385PageSizeLimit385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385pageSizeLimit385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385pageSizeLimit385 = value
        AppToast.show(this, "Page Size Limit385: $value")
    }
}

// v385: Page Auto Load385
internal fun PlayerActivity.showV385PageAutoLoad385Toggle() {
    val current = BiliClient.prefs.v385pageAutoLoad385
    BiliClient.prefs.v385pageAutoLoad385 = !current
    AppToast.show(this, "Page Auto Load385: ${if (!current) "ON" else "OFF"}")
}

// v385: Panel Auto Hide385
internal fun PlayerActivity.showV385PanelAutoHide385Toggle() {
    val current = BiliClient.prefs.v385panelAutoHide385
    BiliClient.prefs.v385panelAutoHide385 = !current
    AppToast.show(this, "Panel Auto Hide385: ${if (!current) "ON" else "OFF"}")
}

// v385: Panel Position385
internal fun PlayerActivity.showV385PanelPosition385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385panelPosition385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385panelPosition385 = value
        AppToast.show(this, "Panel Position385: $value")
    }
}

// v385: SubList Auto Collapse385
internal fun PlayerActivity.showV385SubListAutoCollapse385Toggle() {
    val current = BiliClient.prefs.v385subListAutoCollapse385
    BiliClient.prefs.v385subListAutoCollapse385 = !current
    AppToast.show(this, "SubList Auto Collapse385: ${if (!current) "ON" else "OFF"}")
}

// v385: SyncPlay Latency385
internal fun PlayerActivity.showV385SyncPlayLatency385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v385syncPlayLatency385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v385syncPlayLatency385 = value
        AppToast.show(this, "SyncPlay Latency385: $value")
    }
}

// v385: SyncPlay Auto Join385
internal fun PlayerActivity.showV385SyncPlayAutoJoin385Toggle() {
    val current = BiliClient.prefs.v385syncPlayAutoJoin385
    BiliClient.prefs.v385syncPlayAutoJoin385 = !current
    AppToast.show(this, "SyncPlay Auto Join385: ${if (!current) "ON" else "OFF"}")
}

// v385: Proxy Auto Detect385
internal fun PlayerActivity.showV385ProxyAutoDetect385Toggle() {
    val current = BiliClient.prefs.v385proxyAutoDetect385
    BiliClient.prefs.v385proxyAutoDetect385 = !current
    AppToast.show(this, "Proxy Auto Detect385: ${if (!current) "ON" else "OFF"}")
}

// v385: Queue Auto Sort385
internal fun PlayerActivity.showV385QueueAutoSort385Toggle() {
    val current = BiliClient.prefs.v385queueAutoSort385
    BiliClient.prefs.v385queueAutoSort385 = !current
    AppToast.show(this, "Queue Auto Sort385: ${if (!current) "ON" else "OFF"}")
}

// v385: Record Auto Save385
internal fun PlayerActivity.showV385RecordAutoSave385Toggle() {
    val current = BiliClient.prefs.v385recordAutoSave385
    BiliClient.prefs.v385recordAutoSave385 = !current
    AppToast.show(this, "Record Auto Save385: ${if (!current) "ON" else "OFF"}")
}

// v385: Image Enhance Sharp385
internal fun PlayerActivity.showV385ImageEnhanceSharp385Toggle() {
    val current = BiliClient.prefs.v385imageEnhanceSharp385
    BiliClient.prefs.v385imageEnhanceSharp385 = !current
    AppToast.show(this, "Image Enhance Sharp385: ${if (!current) "ON" else "OFF"}")
}

// v385: Image Enhance Denoise385
internal fun PlayerActivity.showV385ImageEnhanceDenoise385Toggle() {
    val current = BiliClient.prefs.v385imageEnhanceDenoise385
    BiliClient.prefs.v385imageEnhanceDenoise385 = !current
    AppToast.show(this, "Image Enhance Denoise385: ${if (!current) "ON" else "OFF"}")
}

// v386: Grid Layout Columns386
internal fun PlayerActivity.showV386GridLayoutColumns386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386gridLayoutColumns386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386gridLayoutColumns386 = value
        AppToast.show(this, "Grid Layout Columns386: $value")
    }
}

// v386: Grid Layout Spacing386
internal fun PlayerActivity.showV386GridLayoutSpacing386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386gridLayoutSpacing386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386gridLayoutSpacing386 = value
        AppToast.show(this, "Grid Layout Spacing386: $value")
    }
}

// v386: Grid Layout Animation386
internal fun PlayerActivity.showV386GridLayoutAnimation386Toggle() {
    val current = BiliClient.prefs.v386gridLayoutAnimation386
    BiliClient.prefs.v386gridLayoutAnimation386 = !current
    AppToast.show(this, "Grid Layout Animation386: ${if (!current) "ON" else "OFF"}")
}

// v386: Page Size Limit386
internal fun PlayerActivity.showV386PageSizeLimit386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386pageSizeLimit386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386pageSizeLimit386 = value
        AppToast.show(this, "Page Size Limit386: $value")
    }
}

// v386: Page Auto Load386
internal fun PlayerActivity.showV386PageAutoLoad386Toggle() {
    val current = BiliClient.prefs.v386pageAutoLoad386
    BiliClient.prefs.v386pageAutoLoad386 = !current
    AppToast.show(this, "Page Auto Load386: ${if (!current) "ON" else "OFF"}")
}

// v386: Panel Auto Hide386
internal fun PlayerActivity.showV386PanelAutoHide386Toggle() {
    val current = BiliClient.prefs.v386panelAutoHide386
    BiliClient.prefs.v386panelAutoHide386 = !current
    AppToast.show(this, "Panel Auto Hide386: ${if (!current) "ON" else "OFF"}")
}

// v386: Panel Position386
internal fun PlayerActivity.showV386PanelPosition386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386panelPosition386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386panelPosition386 = value
        AppToast.show(this, "Panel Position386: $value")
    }
}

// v386: SubList Auto Collapse386
internal fun PlayerActivity.showV386SubListAutoCollapse386Toggle() {
    val current = BiliClient.prefs.v386subListAutoCollapse386
    BiliClient.prefs.v386subListAutoCollapse386 = !current
    AppToast.show(this, "SubList Auto Collapse386: ${if (!current) "ON" else "OFF"}")
}

// v386: SyncPlay Latency386
internal fun PlayerActivity.showV386SyncPlayLatency386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v386syncPlayLatency386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v386syncPlayLatency386 = value
        AppToast.show(this, "SyncPlay Latency386: $value")
    }
}

// v386: SyncPlay Auto Join386
internal fun PlayerActivity.showV386SyncPlayAutoJoin386Toggle() {
    val current = BiliClient.prefs.v386syncPlayAutoJoin386
    BiliClient.prefs.v386syncPlayAutoJoin386 = !current
    AppToast.show(this, "SyncPlay Auto Join386: ${if (!current) "ON" else "OFF"}")
}

// v386: Proxy Auto Detect386
internal fun PlayerActivity.showV386ProxyAutoDetect386Toggle() {
    val current = BiliClient.prefs.v386proxyAutoDetect386
    BiliClient.prefs.v386proxyAutoDetect386 = !current
    AppToast.show(this, "Proxy Auto Detect386: ${if (!current) "ON" else "OFF"}")
}

// v386: Queue Auto Sort386
internal fun PlayerActivity.showV386QueueAutoSort386Toggle() {
    val current = BiliClient.prefs.v386queueAutoSort386
    BiliClient.prefs.v386queueAutoSort386 = !current
    AppToast.show(this, "Queue Auto Sort386: ${if (!current) "ON" else "OFF"}")
}

// v386: Record Auto Save386
internal fun PlayerActivity.showV386RecordAutoSave386Toggle() {
    val current = BiliClient.prefs.v386recordAutoSave386
    BiliClient.prefs.v386recordAutoSave386 = !current
    AppToast.show(this, "Record Auto Save386: ${if (!current) "ON" else "OFF"}")
}

// v386: Image Enhance Sharp386
internal fun PlayerActivity.showV386ImageEnhanceSharp386Toggle() {
    val current = BiliClient.prefs.v386imageEnhanceSharp386
    BiliClient.prefs.v386imageEnhanceSharp386 = !current
    AppToast.show(this, "Image Enhance Sharp386: ${if (!current) "ON" else "OFF"}")
}

// v386: Image Enhance Denoise386
internal fun PlayerActivity.showV386ImageEnhanceDenoise386Toggle() {
    val current = BiliClient.prefs.v386imageEnhanceDenoise386
    BiliClient.prefs.v386imageEnhanceDenoise386 = !current
    AppToast.show(this, "Image Enhance Denoise386: ${if (!current) "ON" else "OFF"}")
}

// v387: Grid Layout Columns387
internal fun PlayerActivity.showV387GridLayoutColumns387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387gridLayoutColumns387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387gridLayoutColumns387 = value
        AppToast.show(this, "Grid Layout Columns387: $value")
    }
}

// v387: Grid Layout Spacing387
internal fun PlayerActivity.showV387GridLayoutSpacing387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387gridLayoutSpacing387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387gridLayoutSpacing387 = value
        AppToast.show(this, "Grid Layout Spacing387: $value")
    }
}

// v387: Grid Layout Animation387
internal fun PlayerActivity.showV387GridLayoutAnimation387Toggle() {
    val current = BiliClient.prefs.v387gridLayoutAnimation387
    BiliClient.prefs.v387gridLayoutAnimation387 = !current
    AppToast.show(this, "Grid Layout Animation387: ${if (!current) "ON" else "OFF"}")
}

// v387: Page Size Limit387
internal fun PlayerActivity.showV387PageSizeLimit387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387pageSizeLimit387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387pageSizeLimit387 = value
        AppToast.show(this, "Page Size Limit387: $value")
    }
}

// v387: Page Auto Load387
internal fun PlayerActivity.showV387PageAutoLoad387Toggle() {
    val current = BiliClient.prefs.v387pageAutoLoad387
    BiliClient.prefs.v387pageAutoLoad387 = !current
    AppToast.show(this, "Page Auto Load387: ${if (!current) "ON" else "OFF"}")
}

// v387: Panel Auto Hide387
internal fun PlayerActivity.showV387PanelAutoHide387Toggle() {
    val current = BiliClient.prefs.v387panelAutoHide387
    BiliClient.prefs.v387panelAutoHide387 = !current
    AppToast.show(this, "Panel Auto Hide387: ${if (!current) "ON" else "OFF"}")
}

// v387: Panel Position387
internal fun PlayerActivity.showV387PanelPosition387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387panelPosition387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387panelPosition387 = value
        AppToast.show(this, "Panel Position387: $value")
    }
}

// v387: SubList Auto Collapse387
internal fun PlayerActivity.showV387SubListAutoCollapse387Toggle() {
    val current = BiliClient.prefs.v387subListAutoCollapse387
    BiliClient.prefs.v387subListAutoCollapse387 = !current
    AppToast.show(this, "SubList Auto Collapse387: ${if (!current) "ON" else "OFF"}")
}

// v387: SyncPlay Latency387
internal fun PlayerActivity.showV387SyncPlayLatency387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v387syncPlayLatency387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v387syncPlayLatency387 = value
        AppToast.show(this, "SyncPlay Latency387: $value")
    }
}

// v387: SyncPlay Auto Join387
internal fun PlayerActivity.showV387SyncPlayAutoJoin387Toggle() {
    val current = BiliClient.prefs.v387syncPlayAutoJoin387
    BiliClient.prefs.v387syncPlayAutoJoin387 = !current
    AppToast.show(this, "SyncPlay Auto Join387: ${if (!current) "ON" else "OFF"}")
}

// v387: Proxy Auto Detect387
internal fun PlayerActivity.showV387ProxyAutoDetect387Toggle() {
    val current = BiliClient.prefs.v387proxyAutoDetect387
    BiliClient.prefs.v387proxyAutoDetect387 = !current
    AppToast.show(this, "Proxy Auto Detect387: ${if (!current) "ON" else "OFF"}")
}

// v387: Queue Auto Sort387
internal fun PlayerActivity.showV387QueueAutoSort387Toggle() {
    val current = BiliClient.prefs.v387queueAutoSort387
    BiliClient.prefs.v387queueAutoSort387 = !current
    AppToast.show(this, "Queue Auto Sort387: ${if (!current) "ON" else "OFF"}")
}

// v387: Record Auto Save387
internal fun PlayerActivity.showV387RecordAutoSave387Toggle() {
    val current = BiliClient.prefs.v387recordAutoSave387
    BiliClient.prefs.v387recordAutoSave387 = !current
    AppToast.show(this, "Record Auto Save387: ${if (!current) "ON" else "OFF"}")
}

// v387: Image Enhance Sharp387
internal fun PlayerActivity.showV387ImageEnhanceSharp387Toggle() {
    val current = BiliClient.prefs.v387imageEnhanceSharp387
    BiliClient.prefs.v387imageEnhanceSharp387 = !current
    AppToast.show(this, "Image Enhance Sharp387: ${if (!current) "ON" else "OFF"}")
}

// v387: Image Enhance Denoise387
internal fun PlayerActivity.showV387ImageEnhanceDenoise387Toggle() {
    val current = BiliClient.prefs.v387imageEnhanceDenoise387
    BiliClient.prefs.v387imageEnhanceDenoise387 = !current
    AppToast.show(this, "Image Enhance Denoise387: ${if (!current) "ON" else "OFF"}")
}

// v388: Grid Layout Columns388
internal fun PlayerActivity.showV388GridLayoutColumns388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388gridLayoutColumns388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388gridLayoutColumns388 = value
        AppToast.show(this, "Grid Layout Columns388: $value")
    }
}

// v388: Grid Layout Spacing388
internal fun PlayerActivity.showV388GridLayoutSpacing388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388gridLayoutSpacing388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388gridLayoutSpacing388 = value
        AppToast.show(this, "Grid Layout Spacing388: $value")
    }
}

// v388: Grid Layout Animation388
internal fun PlayerActivity.showV388GridLayoutAnimation388Toggle() {
    val current = BiliClient.prefs.v388gridLayoutAnimation388
    BiliClient.prefs.v388gridLayoutAnimation388 = !current
    AppToast.show(this, "Grid Layout Animation388: ${if (!current) "ON" else "OFF"}")
}

// v388: Page Size Limit388
internal fun PlayerActivity.showV388PageSizeLimit388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388pageSizeLimit388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388pageSizeLimit388 = value
        AppToast.show(this, "Page Size Limit388: $value")
    }
}

// v388: Page Auto Load388
internal fun PlayerActivity.showV388PageAutoLoad388Toggle() {
    val current = BiliClient.prefs.v388pageAutoLoad388
    BiliClient.prefs.v388pageAutoLoad388 = !current
    AppToast.show(this, "Page Auto Load388: ${if (!current) "ON" else "OFF"}")
}

// v388: Panel Auto Hide388
internal fun PlayerActivity.showV388PanelAutoHide388Toggle() {
    val current = BiliClient.prefs.v388panelAutoHide388
    BiliClient.prefs.v388panelAutoHide388 = !current
    AppToast.show(this, "Panel Auto Hide388: ${if (!current) "ON" else "OFF"}")
}

// v388: Panel Position388
internal fun PlayerActivity.showV388PanelPosition388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388panelPosition388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388panelPosition388 = value
        AppToast.show(this, "Panel Position388: $value")
    }
}

// v388: SubList Auto Collapse388
internal fun PlayerActivity.showV388SubListAutoCollapse388Toggle() {
    val current = BiliClient.prefs.v388subListAutoCollapse388
    BiliClient.prefs.v388subListAutoCollapse388 = !current
    AppToast.show(this, "SubList Auto Collapse388: ${if (!current) "ON" else "OFF"}")
}

// v388: SyncPlay Latency388
internal fun PlayerActivity.showV388SyncPlayLatency388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v388syncPlayLatency388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v388syncPlayLatency388 = value
        AppToast.show(this, "SyncPlay Latency388: $value")
    }
}

// v388: SyncPlay Auto Join388
internal fun PlayerActivity.showV388SyncPlayAutoJoin388Toggle() {
    val current = BiliClient.prefs.v388syncPlayAutoJoin388
    BiliClient.prefs.v388syncPlayAutoJoin388 = !current
    AppToast.show(this, "SyncPlay Auto Join388: ${if (!current) "ON" else "OFF"}")
}

// v388: Proxy Auto Detect388
internal fun PlayerActivity.showV388ProxyAutoDetect388Toggle() {
    val current = BiliClient.prefs.v388proxyAutoDetect388
    BiliClient.prefs.v388proxyAutoDetect388 = !current
    AppToast.show(this, "Proxy Auto Detect388: ${if (!current) "ON" else "OFF"}")
}

// v388: Queue Auto Sort388
internal fun PlayerActivity.showV388QueueAutoSort388Toggle() {
    val current = BiliClient.prefs.v388queueAutoSort388
    BiliClient.prefs.v388queueAutoSort388 = !current
    AppToast.show(this, "Queue Auto Sort388: ${if (!current) "ON" else "OFF"}")
}

// v388: Record Auto Save388
internal fun PlayerActivity.showV388RecordAutoSave388Toggle() {
    val current = BiliClient.prefs.v388recordAutoSave388
    BiliClient.prefs.v388recordAutoSave388 = !current
    AppToast.show(this, "Record Auto Save388: ${if (!current) "ON" else "OFF"}")
}

// v388: Image Enhance Sharp388
internal fun PlayerActivity.showV388ImageEnhanceSharp388Toggle() {
    val current = BiliClient.prefs.v388imageEnhanceSharp388
    BiliClient.prefs.v388imageEnhanceSharp388 = !current
    AppToast.show(this, "Image Enhance Sharp388: ${if (!current) "ON" else "OFF"}")
}

// v388: Image Enhance Denoise388
internal fun PlayerActivity.showV388ImageEnhanceDenoise388Toggle() {
    val current = BiliClient.prefs.v388imageEnhanceDenoise388
    BiliClient.prefs.v388imageEnhanceDenoise388 = !current
    AppToast.show(this, "Image Enhance Denoise388: ${if (!current) "ON" else "OFF"}")
}

// v389: Grid Layout Columns389
internal fun PlayerActivity.showV389GridLayoutColumns389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389gridLayoutColumns389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389gridLayoutColumns389 = value
        AppToast.show(this, "Grid Layout Columns389: $value")
    }
}

// v389: Grid Layout Spacing389
internal fun PlayerActivity.showV389GridLayoutSpacing389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389gridLayoutSpacing389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389gridLayoutSpacing389 = value
        AppToast.show(this, "Grid Layout Spacing389: $value")
    }
}

// v389: Grid Layout Animation389
internal fun PlayerActivity.showV389GridLayoutAnimation389Toggle() {
    val current = BiliClient.prefs.v389gridLayoutAnimation389
    BiliClient.prefs.v389gridLayoutAnimation389 = !current
    AppToast.show(this, "Grid Layout Animation389: ${if (!current) "ON" else "OFF"}")
}

// v389: Page Size Limit389
internal fun PlayerActivity.showV389PageSizeLimit389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389pageSizeLimit389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389pageSizeLimit389 = value
        AppToast.show(this, "Page Size Limit389: $value")
    }
}

// v389: Page Auto Load389
internal fun PlayerActivity.showV389PageAutoLoad389Toggle() {
    val current = BiliClient.prefs.v389pageAutoLoad389
    BiliClient.prefs.v389pageAutoLoad389 = !current
    AppToast.show(this, "Page Auto Load389: ${if (!current) "ON" else "OFF"}")
}

// v389: Panel Auto Hide389
internal fun PlayerActivity.showV389PanelAutoHide389Toggle() {
    val current = BiliClient.prefs.v389panelAutoHide389
    BiliClient.prefs.v389panelAutoHide389 = !current
    AppToast.show(this, "Panel Auto Hide389: ${if (!current) "ON" else "OFF"}")
}

// v389: Panel Position389
internal fun PlayerActivity.showV389PanelPosition389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389panelPosition389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389panelPosition389 = value
        AppToast.show(this, "Panel Position389: $value")
    }
}

// v389: SubList Auto Collapse389
internal fun PlayerActivity.showV389SubListAutoCollapse389Toggle() {
    val current = BiliClient.prefs.v389subListAutoCollapse389
    BiliClient.prefs.v389subListAutoCollapse389 = !current
    AppToast.show(this, "SubList Auto Collapse389: ${if (!current) "ON" else "OFF"}")
}

// v389: SyncPlay Latency389
internal fun PlayerActivity.showV389SyncPlayLatency389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v389syncPlayLatency389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v389syncPlayLatency389 = value
        AppToast.show(this, "SyncPlay Latency389: $value")
    }
}

// v389: SyncPlay Auto Join389
internal fun PlayerActivity.showV389SyncPlayAutoJoin389Toggle() {
    val current = BiliClient.prefs.v389syncPlayAutoJoin389
    BiliClient.prefs.v389syncPlayAutoJoin389 = !current
    AppToast.show(this, "SyncPlay Auto Join389: ${if (!current) "ON" else "OFF"}")
}

// v389: Proxy Auto Detect389
internal fun PlayerActivity.showV389ProxyAutoDetect389Toggle() {
    val current = BiliClient.prefs.v389proxyAutoDetect389
    BiliClient.prefs.v389proxyAutoDetect389 = !current
    AppToast.show(this, "Proxy Auto Detect389: ${if (!current) "ON" else "OFF"}")
}

// v389: Queue Auto Sort389
internal fun PlayerActivity.showV389QueueAutoSort389Toggle() {
    val current = BiliClient.prefs.v389queueAutoSort389
    BiliClient.prefs.v389queueAutoSort389 = !current
    AppToast.show(this, "Queue Auto Sort389: ${if (!current) "ON" else "OFF"}")
}

// v389: Record Auto Save389
internal fun PlayerActivity.showV389RecordAutoSave389Toggle() {
    val current = BiliClient.prefs.v389recordAutoSave389
    BiliClient.prefs.v389recordAutoSave389 = !current
    AppToast.show(this, "Record Auto Save389: ${if (!current) "ON" else "OFF"}")
}

// v389: Image Enhance Sharp389
internal fun PlayerActivity.showV389ImageEnhanceSharp389Toggle() {
    val current = BiliClient.prefs.v389imageEnhanceSharp389
    BiliClient.prefs.v389imageEnhanceSharp389 = !current
    AppToast.show(this, "Image Enhance Sharp389: ${if (!current) "ON" else "OFF"}")
}

// v389: Image Enhance Denoise389
internal fun PlayerActivity.showV389ImageEnhanceDenoise389Toggle() {
    val current = BiliClient.prefs.v389imageEnhanceDenoise389
    BiliClient.prefs.v389imageEnhanceDenoise389 = !current
    AppToast.show(this, "Image Enhance Denoise389: ${if (!current) "ON" else "OFF"}")
}

// v390: Grid Layout Columns390
internal fun PlayerActivity.showV390GridLayoutColumns390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390gridLayoutColumns390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Columns390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390gridLayoutColumns390 = value
        AppToast.show(this, "Grid Layout Columns390: $value")
    }
}

// v390: Grid Layout Spacing390
internal fun PlayerActivity.showV390GridLayoutSpacing390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390gridLayoutSpacing390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Grid Layout Spacing390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390gridLayoutSpacing390 = value
        AppToast.show(this, "Grid Layout Spacing390: $value")
    }
}

// v390: Grid Layout Animation390
internal fun PlayerActivity.showV390GridLayoutAnimation390Toggle() {
    val current = BiliClient.prefs.v390gridLayoutAnimation390
    BiliClient.prefs.v390gridLayoutAnimation390 = !current
    AppToast.show(this, "Grid Layout Animation390: ${if (!current) "ON" else "OFF"}")
}

// v390: Page Size Limit390
internal fun PlayerActivity.showV390PageSizeLimit390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390pageSizeLimit390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Page Size Limit390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390pageSizeLimit390 = value
        AppToast.show(this, "Page Size Limit390: $value")
    }
}

// v390: Page Auto Load390
internal fun PlayerActivity.showV390PageAutoLoad390Toggle() {
    val current = BiliClient.prefs.v390pageAutoLoad390
    BiliClient.prefs.v390pageAutoLoad390 = !current
    AppToast.show(this, "Page Auto Load390: ${if (!current) "ON" else "OFF"}")
}

// v390: Panel Auto Hide390
internal fun PlayerActivity.showV390PanelAutoHide390Toggle() {
    val current = BiliClient.prefs.v390panelAutoHide390
    BiliClient.prefs.v390panelAutoHide390 = !current
    AppToast.show(this, "Panel Auto Hide390: ${if (!current) "ON" else "OFF"}")
}

// v390: Panel Position390
internal fun PlayerActivity.showV390PanelPosition390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390panelPosition390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Panel Position390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390panelPosition390 = value
        AppToast.show(this, "Panel Position390: $value")
    }
}

// v390: SubList Auto Collapse390
internal fun PlayerActivity.showV390SubListAutoCollapse390Toggle() {
    val current = BiliClient.prefs.v390subListAutoCollapse390
    BiliClient.prefs.v390subListAutoCollapse390 = !current
    AppToast.show(this, "SubList Auto Collapse390: ${if (!current) "ON" else "OFF"}")
}

// v390: SyncPlay Latency390
internal fun PlayerActivity.showV390SyncPlayLatency390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v390syncPlayLatency390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "SyncPlay Latency390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v390syncPlayLatency390 = value
        AppToast.show(this, "SyncPlay Latency390: $value")
    }
}

// v390: SyncPlay Auto Join390
internal fun PlayerActivity.showV390SyncPlayAutoJoin390Toggle() {
    val current = BiliClient.prefs.v390syncPlayAutoJoin390
    BiliClient.prefs.v390syncPlayAutoJoin390 = !current
    AppToast.show(this, "SyncPlay Auto Join390: ${if (!current) "ON" else "OFF"}")
}

// v390: Proxy Auto Detect390
internal fun PlayerActivity.showV390ProxyAutoDetect390Toggle() {
    val current = BiliClient.prefs.v390proxyAutoDetect390
    BiliClient.prefs.v390proxyAutoDetect390 = !current
    AppToast.show(this, "Proxy Auto Detect390: ${if (!current) "ON" else "OFF"}")
}

// v390: Queue Auto Sort390
internal fun PlayerActivity.showV390QueueAutoSort390Toggle() {
    val current = BiliClient.prefs.v390queueAutoSort390
    BiliClient.prefs.v390queueAutoSort390 = !current
    AppToast.show(this, "Queue Auto Sort390: ${if (!current) "ON" else "OFF"}")
}

// v390: Record Auto Save390
internal fun PlayerActivity.showV390RecordAutoSave390Toggle() {
    val current = BiliClient.prefs.v390recordAutoSave390
    BiliClient.prefs.v390recordAutoSave390 = !current
    AppToast.show(this, "Record Auto Save390: ${if (!current) "ON" else "OFF"}")
}

// v390: Image Enhance Sharp390
internal fun PlayerActivity.showV390ImageEnhanceSharp390Toggle() {
    val current = BiliClient.prefs.v390imageEnhanceSharp390
    BiliClient.prefs.v390imageEnhanceSharp390 = !current
    AppToast.show(this, "Image Enhance Sharp390: ${if (!current) "ON" else "OFF"}")
}

// v390: Image Enhance Denoise390
internal fun PlayerActivity.showV390ImageEnhanceDenoise390Toggle() {
    val current = BiliClient.prefs.v390imageEnhanceDenoise390
    BiliClient.prefs.v390imageEnhanceDenoise390 = !current
    AppToast.show(this, "Image Enhance Denoise390: ${if (!current) "ON" else "OFF"}")
}

// v391: AI Auto Tag Generate391
internal fun PlayerActivity.showV391AiAutoTagGenerate391Toggle() {
    val current = BiliClient.prefs.v391aiAutoTagGenerate391
    BiliClient.prefs.v391aiAutoTagGenerate391 = !current
    AppToast.show(this, "AI Auto Tag Generate391: ${if (!current) "ON" else "OFF"}")
}

// v391: AI Smart Recommend391
internal fun PlayerActivity.showV391AiSmartRecommend391Toggle() {
    val current = BiliClient.prefs.v391aiSmartRecommend391
    BiliClient.prefs.v391aiSmartRecommend391 = !current
    AppToast.show(this, "AI Smart Recommend391: ${if (!current) "ON" else "OFF"}")
}

// v391: AI Content Analysis391
internal fun PlayerActivity.showV391AiContentAnalysis391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391aiContentAnalysis391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391aiContentAnalysis391 = value
        AppToast.show(this, "AI Content Analysis391: $value")
    }
}

// v391: Banner Auto Rotate391
internal fun PlayerActivity.showV391BannerAutoRotate391Toggle() {
    val current = BiliClient.prefs.v391bannerAutoRotate391
    BiliClient.prefs.v391bannerAutoRotate391 = !current
    AppToast.show(this, "Banner Auto Rotate391: ${if (!current) "ON" else "OFF"}")
}

// v391: Banner Position391
internal fun PlayerActivity.showV391BannerPosition391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391bannerPosition391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391bannerPosition391 = value
        AppToast.show(this, "Banner Position391: $value")
    }
}

// v391: Batch Download Limit391
internal fun PlayerActivity.showV391BatchDownloadLimit391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391batchDownloadLimit391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391batchDownloadLimit391 = value
        AppToast.show(this, "Batch Download Limit391: $value")
    }
}

// v391: Batch Operation Confirm391
internal fun PlayerActivity.showV391BatchOperationConfirm391Toggle() {
    val current = BiliClient.prefs.v391batchOperationConfirm391
    BiliClient.prefs.v391batchOperationConfirm391 = !current
    AppToast.show(this, "Batch Operation Confirm391: ${if (!current) "ON" else "OFF"}")
}

// v391: Block Auto Hide391
internal fun PlayerActivity.showV391BlockAutoHide391Toggle() {
    val current = BiliClient.prefs.v391blockAutoHide391
    BiliClient.prefs.v391blockAutoHide391 = !current
    AppToast.show(this, "Block Auto Hide391: ${if (!current) "ON" else "OFF"}")
}

// v391: Boost Mode Enabled391
internal fun PlayerActivity.showV391BoostModeEnabled391Toggle() {
    val current = BiliClient.prefs.v391boostModeEnabled391
    BiliClient.prefs.v391boostModeEnabled391 = !current
    AppToast.show(this, "Boost Mode Enabled391: ${if (!current) "ON" else "OFF"}")
}

// v391: Bot Auto Reply391
internal fun PlayerActivity.showV391BotAutoReply391Toggle() {
    val current = BiliClient.prefs.v391botAutoReply391
    BiliClient.prefs.v391botAutoReply391 = !current
    AppToast.show(this, "Bot Auto Reply391: ${if (!current) "ON" else "OFF"}")
}

// v391: Bubble Animation391
internal fun PlayerActivity.showV391BubbleAnimation391Toggle() {
    val current = BiliClient.prefs.v391bubbleAnimation391
    BiliClient.prefs.v391bubbleAnimation391 = !current
    AppToast.show(this, "Bubble Animation391: ${if (!current) "ON" else "OFF"}")
}

// v391: Buffer Prefetch Size391
internal fun PlayerActivity.showV391BufferPrefetchSize391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391bufferPrefetchSize391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391bufferPrefetchSize391 = value
        AppToast.show(this, "Buffer Prefetch Size391: $value")
    }
}

// v391: Calendar Sync Enabled391
internal fun PlayerActivity.showV391CalendarSyncEnabled391Toggle() {
    val current = BiliClient.prefs.v391calendarSyncEnabled391
    BiliClient.prefs.v391calendarSyncEnabled391 = !current
    AppToast.show(this, "Calendar Sync Enabled391: ${if (!current) "ON" else "OFF"}")
}

// v391: Card Layout Style391
internal fun PlayerActivity.showV391CardLayoutStyle391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v391cardLayoutStyle391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v391cardLayoutStyle391 = value
        AppToast.show(this, "Card Layout Style391: $value")
    }
}

// v391: Chat Auto Scroll391
internal fun PlayerActivity.showV391ChatAutoScroll391Toggle() {
    val current = BiliClient.prefs.v391chatAutoScroll391
    BiliClient.prefs.v391chatAutoScroll391 = !current
    AppToast.show(this, "Chat Auto Scroll391: ${if (!current) "ON" else "OFF"}")
}

// v392: AI Auto Tag Generate392
internal fun PlayerActivity.showV392AiAutoTagGenerate392Toggle() {
    val current = BiliClient.prefs.v392aiAutoTagGenerate392
    BiliClient.prefs.v392aiAutoTagGenerate392 = !current
    AppToast.show(this, "AI Auto Tag Generate392: ${if (!current) "ON" else "OFF"}")
}

// v392: AI Smart Recommend392
internal fun PlayerActivity.showV392AiSmartRecommend392Toggle() {
    val current = BiliClient.prefs.v392aiSmartRecommend392
    BiliClient.prefs.v392aiSmartRecommend392 = !current
    AppToast.show(this, "AI Smart Recommend392: ${if (!current) "ON" else "OFF"}")
}

// v392: AI Content Analysis392
internal fun PlayerActivity.showV392AiContentAnalysis392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392aiContentAnalysis392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392aiContentAnalysis392 = value
        AppToast.show(this, "AI Content Analysis392: $value")
    }
}

// v392: Banner Auto Rotate392
internal fun PlayerActivity.showV392BannerAutoRotate392Toggle() {
    val current = BiliClient.prefs.v392bannerAutoRotate392
    BiliClient.prefs.v392bannerAutoRotate392 = !current
    AppToast.show(this, "Banner Auto Rotate392: ${if (!current) "ON" else "OFF"}")
}

// v392: Banner Position392
internal fun PlayerActivity.showV392BannerPosition392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392bannerPosition392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392bannerPosition392 = value
        AppToast.show(this, "Banner Position392: $value")
    }
}

// v392: Batch Download Limit392
internal fun PlayerActivity.showV392BatchDownloadLimit392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392batchDownloadLimit392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392batchDownloadLimit392 = value
        AppToast.show(this, "Batch Download Limit392: $value")
    }
}

// v392: Batch Operation Confirm392
internal fun PlayerActivity.showV392BatchOperationConfirm392Toggle() {
    val current = BiliClient.prefs.v392batchOperationConfirm392
    BiliClient.prefs.v392batchOperationConfirm392 = !current
    AppToast.show(this, "Batch Operation Confirm392: ${if (!current) "ON" else "OFF"}")
}

// v392: Block Auto Hide392
internal fun PlayerActivity.showV392BlockAutoHide392Toggle() {
    val current = BiliClient.prefs.v392blockAutoHide392
    BiliClient.prefs.v392blockAutoHide392 = !current
    AppToast.show(this, "Block Auto Hide392: ${if (!current) "ON" else "OFF"}")
}

// v392: Boost Mode Enabled392
internal fun PlayerActivity.showV392BoostModeEnabled392Toggle() {
    val current = BiliClient.prefs.v392boostModeEnabled392
    BiliClient.prefs.v392boostModeEnabled392 = !current
    AppToast.show(this, "Boost Mode Enabled392: ${if (!current) "ON" else "OFF"}")
}

// v392: Bot Auto Reply392
internal fun PlayerActivity.showV392BotAutoReply392Toggle() {
    val current = BiliClient.prefs.v392botAutoReply392
    BiliClient.prefs.v392botAutoReply392 = !current
    AppToast.show(this, "Bot Auto Reply392: ${if (!current) "ON" else "OFF"}")
}

// v392: Bubble Animation392
internal fun PlayerActivity.showV392BubbleAnimation392Toggle() {
    val current = BiliClient.prefs.v392bubbleAnimation392
    BiliClient.prefs.v392bubbleAnimation392 = !current
    AppToast.show(this, "Bubble Animation392: ${if (!current) "ON" else "OFF"}")
}

// v392: Buffer Prefetch Size392
internal fun PlayerActivity.showV392BufferPrefetchSize392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392bufferPrefetchSize392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392bufferPrefetchSize392 = value
        AppToast.show(this, "Buffer Prefetch Size392: $value")
    }
}

// v392: Calendar Sync Enabled392
internal fun PlayerActivity.showV392CalendarSyncEnabled392Toggle() {
    val current = BiliClient.prefs.v392calendarSyncEnabled392
    BiliClient.prefs.v392calendarSyncEnabled392 = !current
    AppToast.show(this, "Calendar Sync Enabled392: ${if (!current) "ON" else "OFF"}")
}

// v392: Card Layout Style392
internal fun PlayerActivity.showV392CardLayoutStyle392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v392cardLayoutStyle392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v392cardLayoutStyle392 = value
        AppToast.show(this, "Card Layout Style392: $value")
    }
}

// v392: Chat Auto Scroll392
internal fun PlayerActivity.showV392ChatAutoScroll392Toggle() {
    val current = BiliClient.prefs.v392chatAutoScroll392
    BiliClient.prefs.v392chatAutoScroll392 = !current
    AppToast.show(this, "Chat Auto Scroll392: ${if (!current) "ON" else "OFF"}")
}

// v393: AI Auto Tag Generate393
internal fun PlayerActivity.showV393AiAutoTagGenerate393Toggle() {
    val current = BiliClient.prefs.v393aiAutoTagGenerate393
    BiliClient.prefs.v393aiAutoTagGenerate393 = !current
    AppToast.show(this, "AI Auto Tag Generate393: ${if (!current) "ON" else "OFF"}")
}

// v393: AI Smart Recommend393
internal fun PlayerActivity.showV393AiSmartRecommend393Toggle() {
    val current = BiliClient.prefs.v393aiSmartRecommend393
    BiliClient.prefs.v393aiSmartRecommend393 = !current
    AppToast.show(this, "AI Smart Recommend393: ${if (!current) "ON" else "OFF"}")
}

// v393: AI Content Analysis393
internal fun PlayerActivity.showV393AiContentAnalysis393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393aiContentAnalysis393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393aiContentAnalysis393 = value
        AppToast.show(this, "AI Content Analysis393: $value")
    }
}

// v393: Banner Auto Rotate393
internal fun PlayerActivity.showV393BannerAutoRotate393Toggle() {
    val current = BiliClient.prefs.v393bannerAutoRotate393
    BiliClient.prefs.v393bannerAutoRotate393 = !current
    AppToast.show(this, "Banner Auto Rotate393: ${if (!current) "ON" else "OFF"}")
}

// v393: Banner Position393
internal fun PlayerActivity.showV393BannerPosition393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393bannerPosition393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393bannerPosition393 = value
        AppToast.show(this, "Banner Position393: $value")
    }
}

// v393: Batch Download Limit393
internal fun PlayerActivity.showV393BatchDownloadLimit393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393batchDownloadLimit393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393batchDownloadLimit393 = value
        AppToast.show(this, "Batch Download Limit393: $value")
    }
}

// v393: Batch Operation Confirm393
internal fun PlayerActivity.showV393BatchOperationConfirm393Toggle() {
    val current = BiliClient.prefs.v393batchOperationConfirm393
    BiliClient.prefs.v393batchOperationConfirm393 = !current
    AppToast.show(this, "Batch Operation Confirm393: ${if (!current) "ON" else "OFF"}")
}

// v393: Block Auto Hide393
internal fun PlayerActivity.showV393BlockAutoHide393Toggle() {
    val current = BiliClient.prefs.v393blockAutoHide393
    BiliClient.prefs.v393blockAutoHide393 = !current
    AppToast.show(this, "Block Auto Hide393: ${if (!current) "ON" else "OFF"}")
}

// v393: Boost Mode Enabled393
internal fun PlayerActivity.showV393BoostModeEnabled393Toggle() {
    val current = BiliClient.prefs.v393boostModeEnabled393
    BiliClient.prefs.v393boostModeEnabled393 = !current
    AppToast.show(this, "Boost Mode Enabled393: ${if (!current) "ON" else "OFF"}")
}

// v393: Bot Auto Reply393
internal fun PlayerActivity.showV393BotAutoReply393Toggle() {
    val current = BiliClient.prefs.v393botAutoReply393
    BiliClient.prefs.v393botAutoReply393 = !current
    AppToast.show(this, "Bot Auto Reply393: ${if (!current) "ON" else "OFF"}")
}

// v393: Bubble Animation393
internal fun PlayerActivity.showV393BubbleAnimation393Toggle() {
    val current = BiliClient.prefs.v393bubbleAnimation393
    BiliClient.prefs.v393bubbleAnimation393 = !current
    AppToast.show(this, "Bubble Animation393: ${if (!current) "ON" else "OFF"}")
}

// v393: Buffer Prefetch Size393
internal fun PlayerActivity.showV393BufferPrefetchSize393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393bufferPrefetchSize393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393bufferPrefetchSize393 = value
        AppToast.show(this, "Buffer Prefetch Size393: $value")
    }
}

// v393: Calendar Sync Enabled393
internal fun PlayerActivity.showV393CalendarSyncEnabled393Toggle() {
    val current = BiliClient.prefs.v393calendarSyncEnabled393
    BiliClient.prefs.v393calendarSyncEnabled393 = !current
    AppToast.show(this, "Calendar Sync Enabled393: ${if (!current) "ON" else "OFF"}")
}

// v393: Card Layout Style393
internal fun PlayerActivity.showV393CardLayoutStyle393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v393cardLayoutStyle393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v393cardLayoutStyle393 = value
        AppToast.show(this, "Card Layout Style393: $value")
    }
}

// v393: Chat Auto Scroll393
internal fun PlayerActivity.showV393ChatAutoScroll393Toggle() {
    val current = BiliClient.prefs.v393chatAutoScroll393
    BiliClient.prefs.v393chatAutoScroll393 = !current
    AppToast.show(this, "Chat Auto Scroll393: ${if (!current) "ON" else "OFF"}")
}

// v394: AI Auto Tag Generate394
internal fun PlayerActivity.showV394AiAutoTagGenerate394Toggle() {
    val current = BiliClient.prefs.v394aiAutoTagGenerate394
    BiliClient.prefs.v394aiAutoTagGenerate394 = !current
    AppToast.show(this, "AI Auto Tag Generate394: ${if (!current) "ON" else "OFF"}")
}

// v394: AI Smart Recommend394
internal fun PlayerActivity.showV394AiSmartRecommend394Toggle() {
    val current = BiliClient.prefs.v394aiSmartRecommend394
    BiliClient.prefs.v394aiSmartRecommend394 = !current
    AppToast.show(this, "AI Smart Recommend394: ${if (!current) "ON" else "OFF"}")
}

// v394: AI Content Analysis394
internal fun PlayerActivity.showV394AiContentAnalysis394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394aiContentAnalysis394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394aiContentAnalysis394 = value
        AppToast.show(this, "AI Content Analysis394: $value")
    }
}

// v394: Banner Auto Rotate394
internal fun PlayerActivity.showV394BannerAutoRotate394Toggle() {
    val current = BiliClient.prefs.v394bannerAutoRotate394
    BiliClient.prefs.v394bannerAutoRotate394 = !current
    AppToast.show(this, "Banner Auto Rotate394: ${if (!current) "ON" else "OFF"}")
}

// v394: Banner Position394
internal fun PlayerActivity.showV394BannerPosition394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394bannerPosition394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394bannerPosition394 = value
        AppToast.show(this, "Banner Position394: $value")
    }
}

// v394: Batch Download Limit394
internal fun PlayerActivity.showV394BatchDownloadLimit394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394batchDownloadLimit394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394batchDownloadLimit394 = value
        AppToast.show(this, "Batch Download Limit394: $value")
    }
}

// v394: Batch Operation Confirm394
internal fun PlayerActivity.showV394BatchOperationConfirm394Toggle() {
    val current = BiliClient.prefs.v394batchOperationConfirm394
    BiliClient.prefs.v394batchOperationConfirm394 = !current
    AppToast.show(this, "Batch Operation Confirm394: ${if (!current) "ON" else "OFF"}")
}

// v394: Block Auto Hide394
internal fun PlayerActivity.showV394BlockAutoHide394Toggle() {
    val current = BiliClient.prefs.v394blockAutoHide394
    BiliClient.prefs.v394blockAutoHide394 = !current
    AppToast.show(this, "Block Auto Hide394: ${if (!current) "ON" else "OFF"}")
}

// v394: Boost Mode Enabled394
internal fun PlayerActivity.showV394BoostModeEnabled394Toggle() {
    val current = BiliClient.prefs.v394boostModeEnabled394
    BiliClient.prefs.v394boostModeEnabled394 = !current
    AppToast.show(this, "Boost Mode Enabled394: ${if (!current) "ON" else "OFF"}")
}

// v394: Bot Auto Reply394
internal fun PlayerActivity.showV394BotAutoReply394Toggle() {
    val current = BiliClient.prefs.v394botAutoReply394
    BiliClient.prefs.v394botAutoReply394 = !current
    AppToast.show(this, "Bot Auto Reply394: ${if (!current) "ON" else "OFF"}")
}

// v394: Bubble Animation394
internal fun PlayerActivity.showV394BubbleAnimation394Toggle() {
    val current = BiliClient.prefs.v394bubbleAnimation394
    BiliClient.prefs.v394bubbleAnimation394 = !current
    AppToast.show(this, "Bubble Animation394: ${if (!current) "ON" else "OFF"}")
}

// v394: Buffer Prefetch Size394
internal fun PlayerActivity.showV394BufferPrefetchSize394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394bufferPrefetchSize394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394bufferPrefetchSize394 = value
        AppToast.show(this, "Buffer Prefetch Size394: $value")
    }
}

// v394: Calendar Sync Enabled394
internal fun PlayerActivity.showV394CalendarSyncEnabled394Toggle() {
    val current = BiliClient.prefs.v394calendarSyncEnabled394
    BiliClient.prefs.v394calendarSyncEnabled394 = !current
    AppToast.show(this, "Calendar Sync Enabled394: ${if (!current) "ON" else "OFF"}")
}

// v394: Card Layout Style394
internal fun PlayerActivity.showV394CardLayoutStyle394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v394cardLayoutStyle394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v394cardLayoutStyle394 = value
        AppToast.show(this, "Card Layout Style394: $value")
    }
}

// v394: Chat Auto Scroll394
internal fun PlayerActivity.showV394ChatAutoScroll394Toggle() {
    val current = BiliClient.prefs.v394chatAutoScroll394
    BiliClient.prefs.v394chatAutoScroll394 = !current
    AppToast.show(this, "Chat Auto Scroll394: ${if (!current) "ON" else "OFF"}")
}

// v395: AI Auto Tag Generate395
internal fun PlayerActivity.showV395AiAutoTagGenerate395Toggle() {
    val current = BiliClient.prefs.v395aiAutoTagGenerate395
    BiliClient.prefs.v395aiAutoTagGenerate395 = !current
    AppToast.show(this, "AI Auto Tag Generate395: ${if (!current) "ON" else "OFF"}")
}

// v395: AI Smart Recommend395
internal fun PlayerActivity.showV395AiSmartRecommend395Toggle() {
    val current = BiliClient.prefs.v395aiSmartRecommend395
    BiliClient.prefs.v395aiSmartRecommend395 = !current
    AppToast.show(this, "AI Smart Recommend395: ${if (!current) "ON" else "OFF"}")
}

// v395: AI Content Analysis395
internal fun PlayerActivity.showV395AiContentAnalysis395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395aiContentAnalysis395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395aiContentAnalysis395 = value
        AppToast.show(this, "AI Content Analysis395: $value")
    }
}

// v395: Banner Auto Rotate395
internal fun PlayerActivity.showV395BannerAutoRotate395Toggle() {
    val current = BiliClient.prefs.v395bannerAutoRotate395
    BiliClient.prefs.v395bannerAutoRotate395 = !current
    AppToast.show(this, "Banner Auto Rotate395: ${if (!current) "ON" else "OFF"}")
}

// v395: Banner Position395
internal fun PlayerActivity.showV395BannerPosition395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395bannerPosition395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395bannerPosition395 = value
        AppToast.show(this, "Banner Position395: $value")
    }
}

// v395: Batch Download Limit395
internal fun PlayerActivity.showV395BatchDownloadLimit395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395batchDownloadLimit395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395batchDownloadLimit395 = value
        AppToast.show(this, "Batch Download Limit395: $value")
    }
}

// v395: Batch Operation Confirm395
internal fun PlayerActivity.showV395BatchOperationConfirm395Toggle() {
    val current = BiliClient.prefs.v395batchOperationConfirm395
    BiliClient.prefs.v395batchOperationConfirm395 = !current
    AppToast.show(this, "Batch Operation Confirm395: ${if (!current) "ON" else "OFF"}")
}

// v395: Block Auto Hide395
internal fun PlayerActivity.showV395BlockAutoHide395Toggle() {
    val current = BiliClient.prefs.v395blockAutoHide395
    BiliClient.prefs.v395blockAutoHide395 = !current
    AppToast.show(this, "Block Auto Hide395: ${if (!current) "ON" else "OFF"}")
}

// v395: Boost Mode Enabled395
internal fun PlayerActivity.showV395BoostModeEnabled395Toggle() {
    val current = BiliClient.prefs.v395boostModeEnabled395
    BiliClient.prefs.v395boostModeEnabled395 = !current
    AppToast.show(this, "Boost Mode Enabled395: ${if (!current) "ON" else "OFF"}")
}

// v395: Bot Auto Reply395
internal fun PlayerActivity.showV395BotAutoReply395Toggle() {
    val current = BiliClient.prefs.v395botAutoReply395
    BiliClient.prefs.v395botAutoReply395 = !current
    AppToast.show(this, "Bot Auto Reply395: ${if (!current) "ON" else "OFF"}")
}

// v395: Bubble Animation395
internal fun PlayerActivity.showV395BubbleAnimation395Toggle() {
    val current = BiliClient.prefs.v395bubbleAnimation395
    BiliClient.prefs.v395bubbleAnimation395 = !current
    AppToast.show(this, "Bubble Animation395: ${if (!current) "ON" else "OFF"}")
}

// v395: Buffer Prefetch Size395
internal fun PlayerActivity.showV395BufferPrefetchSize395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395bufferPrefetchSize395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395bufferPrefetchSize395 = value
        AppToast.show(this, "Buffer Prefetch Size395: $value")
    }
}

// v395: Calendar Sync Enabled395
internal fun PlayerActivity.showV395CalendarSyncEnabled395Toggle() {
    val current = BiliClient.prefs.v395calendarSyncEnabled395
    BiliClient.prefs.v395calendarSyncEnabled395 = !current
    AppToast.show(this, "Calendar Sync Enabled395: ${if (!current) "ON" else "OFF"}")
}

// v395: Card Layout Style395
internal fun PlayerActivity.showV395CardLayoutStyle395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v395cardLayoutStyle395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v395cardLayoutStyle395 = value
        AppToast.show(this, "Card Layout Style395: $value")
    }
}

// v395: Chat Auto Scroll395
internal fun PlayerActivity.showV395ChatAutoScroll395Toggle() {
    val current = BiliClient.prefs.v395chatAutoScroll395
    BiliClient.prefs.v395chatAutoScroll395 = !current
    AppToast.show(this, "Chat Auto Scroll395: ${if (!current) "ON" else "OFF"}")
}

// v396: AI Auto Tag Generate396
internal fun PlayerActivity.showV396AiAutoTagGenerate396Toggle() {
    val current = BiliClient.prefs.v396aiAutoTagGenerate396
    BiliClient.prefs.v396aiAutoTagGenerate396 = !current
    AppToast.show(this, "AI Auto Tag Generate396: ${if (!current) "ON" else "OFF"}")
}

// v396: AI Smart Recommend396
internal fun PlayerActivity.showV396AiSmartRecommend396Toggle() {
    val current = BiliClient.prefs.v396aiSmartRecommend396
    BiliClient.prefs.v396aiSmartRecommend396 = !current
    AppToast.show(this, "AI Smart Recommend396: ${if (!current) "ON" else "OFF"}")
}

// v396: AI Content Analysis396
internal fun PlayerActivity.showV396AiContentAnalysis396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396aiContentAnalysis396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396aiContentAnalysis396 = value
        AppToast.show(this, "AI Content Analysis396: $value")
    }
}

// v396: Banner Auto Rotate396
internal fun PlayerActivity.showV396BannerAutoRotate396Toggle() {
    val current = BiliClient.prefs.v396bannerAutoRotate396
    BiliClient.prefs.v396bannerAutoRotate396 = !current
    AppToast.show(this, "Banner Auto Rotate396: ${if (!current) "ON" else "OFF"}")
}

// v396: Banner Position396
internal fun PlayerActivity.showV396BannerPosition396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396bannerPosition396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396bannerPosition396 = value
        AppToast.show(this, "Banner Position396: $value")
    }
}

// v396: Batch Download Limit396
internal fun PlayerActivity.showV396BatchDownloadLimit396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396batchDownloadLimit396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396batchDownloadLimit396 = value
        AppToast.show(this, "Batch Download Limit396: $value")
    }
}

// v396: Batch Operation Confirm396
internal fun PlayerActivity.showV396BatchOperationConfirm396Toggle() {
    val current = BiliClient.prefs.v396batchOperationConfirm396
    BiliClient.prefs.v396batchOperationConfirm396 = !current
    AppToast.show(this, "Batch Operation Confirm396: ${if (!current) "ON" else "OFF"}")
}

// v396: Block Auto Hide396
internal fun PlayerActivity.showV396BlockAutoHide396Toggle() {
    val current = BiliClient.prefs.v396blockAutoHide396
    BiliClient.prefs.v396blockAutoHide396 = !current
    AppToast.show(this, "Block Auto Hide396: ${if (!current) "ON" else "OFF"}")
}

// v396: Boost Mode Enabled396
internal fun PlayerActivity.showV396BoostModeEnabled396Toggle() {
    val current = BiliClient.prefs.v396boostModeEnabled396
    BiliClient.prefs.v396boostModeEnabled396 = !current
    AppToast.show(this, "Boost Mode Enabled396: ${if (!current) "ON" else "OFF"}")
}

// v396: Bot Auto Reply396
internal fun PlayerActivity.showV396BotAutoReply396Toggle() {
    val current = BiliClient.prefs.v396botAutoReply396
    BiliClient.prefs.v396botAutoReply396 = !current
    AppToast.show(this, "Bot Auto Reply396: ${if (!current) "ON" else "OFF"}")
}

// v396: Bubble Animation396
internal fun PlayerActivity.showV396BubbleAnimation396Toggle() {
    val current = BiliClient.prefs.v396bubbleAnimation396
    BiliClient.prefs.v396bubbleAnimation396 = !current
    AppToast.show(this, "Bubble Animation396: ${if (!current) "ON" else "OFF"}")
}

// v396: Buffer Prefetch Size396
internal fun PlayerActivity.showV396BufferPrefetchSize396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396bufferPrefetchSize396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396bufferPrefetchSize396 = value
        AppToast.show(this, "Buffer Prefetch Size396: $value")
    }
}

// v396: Calendar Sync Enabled396
internal fun PlayerActivity.showV396CalendarSyncEnabled396Toggle() {
    val current = BiliClient.prefs.v396calendarSyncEnabled396
    BiliClient.prefs.v396calendarSyncEnabled396 = !current
    AppToast.show(this, "Calendar Sync Enabled396: ${if (!current) "ON" else "OFF"}")
}

// v396: Card Layout Style396
internal fun PlayerActivity.showV396CardLayoutStyle396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v396cardLayoutStyle396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v396cardLayoutStyle396 = value
        AppToast.show(this, "Card Layout Style396: $value")
    }
}

// v396: Chat Auto Scroll396
internal fun PlayerActivity.showV396ChatAutoScroll396Toggle() {
    val current = BiliClient.prefs.v396chatAutoScroll396
    BiliClient.prefs.v396chatAutoScroll396 = !current
    AppToast.show(this, "Chat Auto Scroll396: ${if (!current) "ON" else "OFF"}")
}

// v397: AI Auto Tag Generate397
internal fun PlayerActivity.showV397AiAutoTagGenerate397Toggle() {
    val current = BiliClient.prefs.v397aiAutoTagGenerate397
    BiliClient.prefs.v397aiAutoTagGenerate397 = !current
    AppToast.show(this, "AI Auto Tag Generate397: ${if (!current) "ON" else "OFF"}")
}

// v397: AI Smart Recommend397
internal fun PlayerActivity.showV397AiSmartRecommend397Toggle() {
    val current = BiliClient.prefs.v397aiSmartRecommend397
    BiliClient.prefs.v397aiSmartRecommend397 = !current
    AppToast.show(this, "AI Smart Recommend397: ${if (!current) "ON" else "OFF"}")
}

// v397: AI Content Analysis397
internal fun PlayerActivity.showV397AiContentAnalysis397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397aiContentAnalysis397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397aiContentAnalysis397 = value
        AppToast.show(this, "AI Content Analysis397: $value")
    }
}

// v397: Banner Auto Rotate397
internal fun PlayerActivity.showV397BannerAutoRotate397Toggle() {
    val current = BiliClient.prefs.v397bannerAutoRotate397
    BiliClient.prefs.v397bannerAutoRotate397 = !current
    AppToast.show(this, "Banner Auto Rotate397: ${if (!current) "ON" else "OFF"}")
}

// v397: Banner Position397
internal fun PlayerActivity.showV397BannerPosition397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397bannerPosition397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397bannerPosition397 = value
        AppToast.show(this, "Banner Position397: $value")
    }
}

// v397: Batch Download Limit397
internal fun PlayerActivity.showV397BatchDownloadLimit397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397batchDownloadLimit397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397batchDownloadLimit397 = value
        AppToast.show(this, "Batch Download Limit397: $value")
    }
}

// v397: Batch Operation Confirm397
internal fun PlayerActivity.showV397BatchOperationConfirm397Toggle() {
    val current = BiliClient.prefs.v397batchOperationConfirm397
    BiliClient.prefs.v397batchOperationConfirm397 = !current
    AppToast.show(this, "Batch Operation Confirm397: ${if (!current) "ON" else "OFF"}")
}

// v397: Block Auto Hide397
internal fun PlayerActivity.showV397BlockAutoHide397Toggle() {
    val current = BiliClient.prefs.v397blockAutoHide397
    BiliClient.prefs.v397blockAutoHide397 = !current
    AppToast.show(this, "Block Auto Hide397: ${if (!current) "ON" else "OFF"}")
}

// v397: Boost Mode Enabled397
internal fun PlayerActivity.showV397BoostModeEnabled397Toggle() {
    val current = BiliClient.prefs.v397boostModeEnabled397
    BiliClient.prefs.v397boostModeEnabled397 = !current
    AppToast.show(this, "Boost Mode Enabled397: ${if (!current) "ON" else "OFF"}")
}

// v397: Bot Auto Reply397
internal fun PlayerActivity.showV397BotAutoReply397Toggle() {
    val current = BiliClient.prefs.v397botAutoReply397
    BiliClient.prefs.v397botAutoReply397 = !current
    AppToast.show(this, "Bot Auto Reply397: ${if (!current) "ON" else "OFF"}")
}

// v397: Bubble Animation397
internal fun PlayerActivity.showV397BubbleAnimation397Toggle() {
    val current = BiliClient.prefs.v397bubbleAnimation397
    BiliClient.prefs.v397bubbleAnimation397 = !current
    AppToast.show(this, "Bubble Animation397: ${if (!current) "ON" else "OFF"}")
}

// v397: Buffer Prefetch Size397
internal fun PlayerActivity.showV397BufferPrefetchSize397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397bufferPrefetchSize397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397bufferPrefetchSize397 = value
        AppToast.show(this, "Buffer Prefetch Size397: $value")
    }
}

// v397: Calendar Sync Enabled397
internal fun PlayerActivity.showV397CalendarSyncEnabled397Toggle() {
    val current = BiliClient.prefs.v397calendarSyncEnabled397
    BiliClient.prefs.v397calendarSyncEnabled397 = !current
    AppToast.show(this, "Calendar Sync Enabled397: ${if (!current) "ON" else "OFF"}")
}

// v397: Card Layout Style397
internal fun PlayerActivity.showV397CardLayoutStyle397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v397cardLayoutStyle397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v397cardLayoutStyle397 = value
        AppToast.show(this, "Card Layout Style397: $value")
    }
}

// v397: Chat Auto Scroll397
internal fun PlayerActivity.showV397ChatAutoScroll397Toggle() {
    val current = BiliClient.prefs.v397chatAutoScroll397
    BiliClient.prefs.v397chatAutoScroll397 = !current
    AppToast.show(this, "Chat Auto Scroll397: ${if (!current) "ON" else "OFF"}")
}

// v398: AI Auto Tag Generate398
internal fun PlayerActivity.showV398AiAutoTagGenerate398Toggle() {
    val current = BiliClient.prefs.v398aiAutoTagGenerate398
    BiliClient.prefs.v398aiAutoTagGenerate398 = !current
    AppToast.show(this, "AI Auto Tag Generate398: ${if (!current) "ON" else "OFF"}")
}

// v398: AI Smart Recommend398
internal fun PlayerActivity.showV398AiSmartRecommend398Toggle() {
    val current = BiliClient.prefs.v398aiSmartRecommend398
    BiliClient.prefs.v398aiSmartRecommend398 = !current
    AppToast.show(this, "AI Smart Recommend398: ${if (!current) "ON" else "OFF"}")
}

// v398: AI Content Analysis398
internal fun PlayerActivity.showV398AiContentAnalysis398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398aiContentAnalysis398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398aiContentAnalysis398 = value
        AppToast.show(this, "AI Content Analysis398: $value")
    }
}

// v398: Banner Auto Rotate398
internal fun PlayerActivity.showV398BannerAutoRotate398Toggle() {
    val current = BiliClient.prefs.v398bannerAutoRotate398
    BiliClient.prefs.v398bannerAutoRotate398 = !current
    AppToast.show(this, "Banner Auto Rotate398: ${if (!current) "ON" else "OFF"}")
}

// v398: Banner Position398
internal fun PlayerActivity.showV398BannerPosition398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398bannerPosition398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398bannerPosition398 = value
        AppToast.show(this, "Banner Position398: $value")
    }
}

// v398: Batch Download Limit398
internal fun PlayerActivity.showV398BatchDownloadLimit398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398batchDownloadLimit398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398batchDownloadLimit398 = value
        AppToast.show(this, "Batch Download Limit398: $value")
    }
}

// v398: Batch Operation Confirm398
internal fun PlayerActivity.showV398BatchOperationConfirm398Toggle() {
    val current = BiliClient.prefs.v398batchOperationConfirm398
    BiliClient.prefs.v398batchOperationConfirm398 = !current
    AppToast.show(this, "Batch Operation Confirm398: ${if (!current) "ON" else "OFF"}")
}

// v398: Block Auto Hide398
internal fun PlayerActivity.showV398BlockAutoHide398Toggle() {
    val current = BiliClient.prefs.v398blockAutoHide398
    BiliClient.prefs.v398blockAutoHide398 = !current
    AppToast.show(this, "Block Auto Hide398: ${if (!current) "ON" else "OFF"}")
}

// v398: Boost Mode Enabled398
internal fun PlayerActivity.showV398BoostModeEnabled398Toggle() {
    val current = BiliClient.prefs.v398boostModeEnabled398
    BiliClient.prefs.v398boostModeEnabled398 = !current
    AppToast.show(this, "Boost Mode Enabled398: ${if (!current) "ON" else "OFF"}")
}

// v398: Bot Auto Reply398
internal fun PlayerActivity.showV398BotAutoReply398Toggle() {
    val current = BiliClient.prefs.v398botAutoReply398
    BiliClient.prefs.v398botAutoReply398 = !current
    AppToast.show(this, "Bot Auto Reply398: ${if (!current) "ON" else "OFF"}")
}

// v398: Bubble Animation398
internal fun PlayerActivity.showV398BubbleAnimation398Toggle() {
    val current = BiliClient.prefs.v398bubbleAnimation398
    BiliClient.prefs.v398bubbleAnimation398 = !current
    AppToast.show(this, "Bubble Animation398: ${if (!current) "ON" else "OFF"}")
}

// v398: Buffer Prefetch Size398
internal fun PlayerActivity.showV398BufferPrefetchSize398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398bufferPrefetchSize398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398bufferPrefetchSize398 = value
        AppToast.show(this, "Buffer Prefetch Size398: $value")
    }
}

// v398: Calendar Sync Enabled398
internal fun PlayerActivity.showV398CalendarSyncEnabled398Toggle() {
    val current = BiliClient.prefs.v398calendarSyncEnabled398
    BiliClient.prefs.v398calendarSyncEnabled398 = !current
    AppToast.show(this, "Calendar Sync Enabled398: ${if (!current) "ON" else "OFF"}")
}

// v398: Card Layout Style398
internal fun PlayerActivity.showV398CardLayoutStyle398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v398cardLayoutStyle398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v398cardLayoutStyle398 = value
        AppToast.show(this, "Card Layout Style398: $value")
    }
}

// v398: Chat Auto Scroll398
internal fun PlayerActivity.showV398ChatAutoScroll398Toggle() {
    val current = BiliClient.prefs.v398chatAutoScroll398
    BiliClient.prefs.v398chatAutoScroll398 = !current
    AppToast.show(this, "Chat Auto Scroll398: ${if (!current) "ON" else "OFF"}")
}

// v399: AI Auto Tag Generate399
internal fun PlayerActivity.showV399AiAutoTagGenerate399Toggle() {
    val current = BiliClient.prefs.v399aiAutoTagGenerate399
    BiliClient.prefs.v399aiAutoTagGenerate399 = !current
    AppToast.show(this, "AI Auto Tag Generate399: ${if (!current) "ON" else "OFF"}")
}

// v399: AI Smart Recommend399
internal fun PlayerActivity.showV399AiSmartRecommend399Toggle() {
    val current = BiliClient.prefs.v399aiSmartRecommend399
    BiliClient.prefs.v399aiSmartRecommend399 = !current
    AppToast.show(this, "AI Smart Recommend399: ${if (!current) "ON" else "OFF"}")
}

// v399: AI Content Analysis399
internal fun PlayerActivity.showV399AiContentAnalysis399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399aiContentAnalysis399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399aiContentAnalysis399 = value
        AppToast.show(this, "AI Content Analysis399: $value")
    }
}

// v399: Banner Auto Rotate399
internal fun PlayerActivity.showV399BannerAutoRotate399Toggle() {
    val current = BiliClient.prefs.v399bannerAutoRotate399
    BiliClient.prefs.v399bannerAutoRotate399 = !current
    AppToast.show(this, "Banner Auto Rotate399: ${if (!current) "ON" else "OFF"}")
}

// v399: Banner Position399
internal fun PlayerActivity.showV399BannerPosition399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399bannerPosition399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399bannerPosition399 = value
        AppToast.show(this, "Banner Position399: $value")
    }
}

// v399: Batch Download Limit399
internal fun PlayerActivity.showV399BatchDownloadLimit399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399batchDownloadLimit399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399batchDownloadLimit399 = value
        AppToast.show(this, "Batch Download Limit399: $value")
    }
}

// v399: Batch Operation Confirm399
internal fun PlayerActivity.showV399BatchOperationConfirm399Toggle() {
    val current = BiliClient.prefs.v399batchOperationConfirm399
    BiliClient.prefs.v399batchOperationConfirm399 = !current
    AppToast.show(this, "Batch Operation Confirm399: ${if (!current) "ON" else "OFF"}")
}

// v399: Block Auto Hide399
internal fun PlayerActivity.showV399BlockAutoHide399Toggle() {
    val current = BiliClient.prefs.v399blockAutoHide399
    BiliClient.prefs.v399blockAutoHide399 = !current
    AppToast.show(this, "Block Auto Hide399: ${if (!current) "ON" else "OFF"}")
}

// v399: Boost Mode Enabled399
internal fun PlayerActivity.showV399BoostModeEnabled399Toggle() {
    val current = BiliClient.prefs.v399boostModeEnabled399
    BiliClient.prefs.v399boostModeEnabled399 = !current
    AppToast.show(this, "Boost Mode Enabled399: ${if (!current) "ON" else "OFF"}")
}

// v399: Bot Auto Reply399
internal fun PlayerActivity.showV399BotAutoReply399Toggle() {
    val current = BiliClient.prefs.v399botAutoReply399
    BiliClient.prefs.v399botAutoReply399 = !current
    AppToast.show(this, "Bot Auto Reply399: ${if (!current) "ON" else "OFF"}")
}

// v399: Bubble Animation399
internal fun PlayerActivity.showV399BubbleAnimation399Toggle() {
    val current = BiliClient.prefs.v399bubbleAnimation399
    BiliClient.prefs.v399bubbleAnimation399 = !current
    AppToast.show(this, "Bubble Animation399: ${if (!current) "ON" else "OFF"}")
}

// v399: Buffer Prefetch Size399
internal fun PlayerActivity.showV399BufferPrefetchSize399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399bufferPrefetchSize399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399bufferPrefetchSize399 = value
        AppToast.show(this, "Buffer Prefetch Size399: $value")
    }
}

// v399: Calendar Sync Enabled399
internal fun PlayerActivity.showV399CalendarSyncEnabled399Toggle() {
    val current = BiliClient.prefs.v399calendarSyncEnabled399
    BiliClient.prefs.v399calendarSyncEnabled399 = !current
    AppToast.show(this, "Calendar Sync Enabled399: ${if (!current) "ON" else "OFF"}")
}

// v399: Card Layout Style399
internal fun PlayerActivity.showV399CardLayoutStyle399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v399cardLayoutStyle399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v399cardLayoutStyle399 = value
        AppToast.show(this, "Card Layout Style399: $value")
    }
}

// v399: Chat Auto Scroll399
internal fun PlayerActivity.showV399ChatAutoScroll399Toggle() {
    val current = BiliClient.prefs.v399chatAutoScroll399
    BiliClient.prefs.v399chatAutoScroll399 = !current
    AppToast.show(this, "Chat Auto Scroll399: ${if (!current) "ON" else "OFF"}")
}

// v400: AI Auto Tag Generate400
internal fun PlayerActivity.showV400AiAutoTagGenerate400Toggle() {
    val current = BiliClient.prefs.v400aiAutoTagGenerate400
    BiliClient.prefs.v400aiAutoTagGenerate400 = !current
    AppToast.show(this, "AI Auto Tag Generate400: ${if (!current) "ON" else "OFF"}")
}

// v400: AI Smart Recommend400
internal fun PlayerActivity.showV400AiSmartRecommend400Toggle() {
    val current = BiliClient.prefs.v400aiSmartRecommend400
    BiliClient.prefs.v400aiSmartRecommend400 = !current
    AppToast.show(this, "AI Smart Recommend400: ${if (!current) "ON" else "OFF"}")
}

// v400: AI Content Analysis400
internal fun PlayerActivity.showV400AiContentAnalysis400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400aiContentAnalysis400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "AI Content Analysis400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400aiContentAnalysis400 = value
        AppToast.show(this, "AI Content Analysis400: $value")
    }
}

// v400: Banner Auto Rotate400
internal fun PlayerActivity.showV400BannerAutoRotate400Toggle() {
    val current = BiliClient.prefs.v400bannerAutoRotate400
    BiliClient.prefs.v400bannerAutoRotate400 = !current
    AppToast.show(this, "Banner Auto Rotate400: ${if (!current) "ON" else "OFF"}")
}

// v400: Banner Position400
internal fun PlayerActivity.showV400BannerPosition400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400bannerPosition400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Banner Position400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400bannerPosition400 = value
        AppToast.show(this, "Banner Position400: $value")
    }
}

// v400: Batch Download Limit400
internal fun PlayerActivity.showV400BatchDownloadLimit400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400batchDownloadLimit400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Batch Download Limit400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400batchDownloadLimit400 = value
        AppToast.show(this, "Batch Download Limit400: $value")
    }
}

// v400: Batch Operation Confirm400
internal fun PlayerActivity.showV400BatchOperationConfirm400Toggle() {
    val current = BiliClient.prefs.v400batchOperationConfirm400
    BiliClient.prefs.v400batchOperationConfirm400 = !current
    AppToast.show(this, "Batch Operation Confirm400: ${if (!current) "ON" else "OFF"}")
}

// v400: Block Auto Hide400
internal fun PlayerActivity.showV400BlockAutoHide400Toggle() {
    val current = BiliClient.prefs.v400blockAutoHide400
    BiliClient.prefs.v400blockAutoHide400 = !current
    AppToast.show(this, "Block Auto Hide400: ${if (!current) "ON" else "OFF"}")
}

// v400: Boost Mode Enabled400
internal fun PlayerActivity.showV400BoostModeEnabled400Toggle() {
    val current = BiliClient.prefs.v400boostModeEnabled400
    BiliClient.prefs.v400boostModeEnabled400 = !current
    AppToast.show(this, "Boost Mode Enabled400: ${if (!current) "ON" else "OFF"}")
}

// v400: Bot Auto Reply400
internal fun PlayerActivity.showV400BotAutoReply400Toggle() {
    val current = BiliClient.prefs.v400botAutoReply400
    BiliClient.prefs.v400botAutoReply400 = !current
    AppToast.show(this, "Bot Auto Reply400: ${if (!current) "ON" else "OFF"}")
}

// v400: Bubble Animation400
internal fun PlayerActivity.showV400BubbleAnimation400Toggle() {
    val current = BiliClient.prefs.v400bubbleAnimation400
    BiliClient.prefs.v400bubbleAnimation400 = !current
    AppToast.show(this, "Bubble Animation400: ${if (!current) "ON" else "OFF"}")
}

// v400: Buffer Prefetch Size400
internal fun PlayerActivity.showV400BufferPrefetchSize400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400bufferPrefetchSize400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Buffer Prefetch Size400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400bufferPrefetchSize400 = value
        AppToast.show(this, "Buffer Prefetch Size400: $value")
    }
}

// v400: Calendar Sync Enabled400
internal fun PlayerActivity.showV400CalendarSyncEnabled400Toggle() {
    val current = BiliClient.prefs.v400calendarSyncEnabled400
    BiliClient.prefs.v400calendarSyncEnabled400 = !current
    AppToast.show(this, "Calendar Sync Enabled400: ${if (!current) "ON" else "OFF"}")
}

// v400: Card Layout Style400
internal fun PlayerActivity.showV400CardLayoutStyle400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v400cardLayoutStyle400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Card Layout Style400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v400cardLayoutStyle400 = value
        AppToast.show(this, "Card Layout Style400: $value")
    }
}

// v400: Chat Auto Scroll400
internal fun PlayerActivity.showV400ChatAutoScroll400Toggle() {
    val current = BiliClient.prefs.v400chatAutoScroll400
    BiliClient.prefs.v400chatAutoScroll400 = !current
    AppToast.show(this, "Chat Auto Scroll400: ${if (!current) "ON" else "OFF"}")
}

// v401: Cloud Auto Sync401
internal fun PlayerActivity.showV401CloudAutoSync401Toggle() {
    val current = BiliClient.prefs.v401cloudAutoSync401
    BiliClient.prefs.v401cloudAutoSync401 = !current
    AppToast.show(this, "Cloud Auto Sync401: ${if (!current) "ON" else "OFF"}")
}

// v401: Cloud Storage Limit401
internal fun PlayerActivity.showV401CloudStorageLimit401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401cloudStorageLimit401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401cloudStorageLimit401 = value
        AppToast.show(this, "Cloud Storage Limit401: $value")
    }
}

// v401: Collect Auto Categorize401
internal fun PlayerActivity.showV401CollectAutoCategorize401Toggle() {
    val current = BiliClient.prefs.v401collectAutoCategorize401
    BiliClient.prefs.v401collectAutoCategorize401 = !current
    AppToast.show(this, "Collect Auto Categorize401: ${if (!current) "ON" else "OFF"}")
}

// v401: Compact Mode Enabled401
internal fun PlayerActivity.showV401CompactModeEnabled401Toggle() {
    val current = BiliClient.prefs.v401compactModeEnabled401
    BiliClient.prefs.v401compactModeEnabled401 = !current
    AppToast.show(this, "Compact Mode Enabled401: ${if (!current) "ON" else "OFF"}")
}

// v401: Compress Auto Quality401
internal fun PlayerActivity.showV401CompressAutoQuality401Toggle() {
    val current = BiliClient.prefs.v401compressAutoQuality401
    BiliClient.prefs.v401compressAutoQuality401 = !current
    AppToast.show(this, "Compress Auto Quality401: ${if (!current) "ON" else "OFF"}")
}

// v401: Connect Auto Retry401
internal fun PlayerActivity.showV401ConnectAutoRetry401Toggle() {
    val current = BiliClient.prefs.v401connectAutoRetry401
    BiliClient.prefs.v401connectAutoRetry401 = !current
    AppToast.show(this, "Connect Auto Retry401: ${if (!current) "ON" else "OFF"}")
}

// v401: Dashboard Widget Layout401
internal fun PlayerActivity.showV401DashboardWidgetLayout401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401dashboardWidgetLayout401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401dashboardWidgetLayout401 = value
        AppToast.show(this, "Dashboard Widget Layout401: $value")
    }
}

// v401: Debug Log Verbose401
internal fun PlayerActivity.showV401DebugLogVerbose401Toggle() {
    val current = BiliClient.prefs.v401debugLogVerbose401
    BiliClient.prefs.v401debugLogVerbose401 = !current
    AppToast.show(this, "Debug Log Verbose401: ${if (!current) "ON" else "OFF"}")
}

// v401: Deep Color Enabled401
internal fun PlayerActivity.showV401DeepColorEnabled401Toggle() {
    val current = BiliClient.prefs.v401deepColorEnabled401
    BiliClient.prefs.v401deepColorEnabled401 = !current
    AppToast.show(this, "Deep Color Enabled401: ${if (!current) "ON" else "OFF"}")
}

// v401: Default Player Engine401
internal fun PlayerActivity.showV401DefaultPlayerEngine401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401defaultPlayerEngine401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401defaultPlayerEngine401 = value
        AppToast.show(this, "Default Player Engine401: $value")
    }
}

// v401: Delay Start Ms401
internal fun PlayerActivity.showV401DelayStartMs401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v401delayStartMs401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v401delayStartMs401 = value
        AppToast.show(this, "Delay Start Ms401: $value")
    }
}

// v401: Density Auto Adjust401
internal fun PlayerActivity.showV401DensityAutoAdjust401Toggle() {
    val current = BiliClient.prefs.v401densityAutoAdjust401
    BiliClient.prefs.v401densityAutoAdjust401 = !current
    AppToast.show(this, "Density Auto Adjust401: ${if (!current) "ON" else "OFF"}")
}

// v401: Deploy Auto Update401
internal fun PlayerActivity.showV401DeployAutoUpdate401Toggle() {
    val current = BiliClient.prefs.v401deployAutoUpdate401
    BiliClient.prefs.v401deployAutoUpdate401 = !current
    AppToast.show(this, "Deploy Auto Update401: ${if (!current) "ON" else "OFF"}")
}

// v401: Detect Motion Enabled401
internal fun PlayerActivity.showV401DetectMotionEnabled401Toggle() {
    val current = BiliClient.prefs.v401detectMotionEnabled401
    BiliClient.prefs.v401detectMotionEnabled401 = !current
    AppToast.show(this, "Detect Motion Enabled401: ${if (!current) "ON" else "OFF"}")
}

// v401: Dim Screen On Idle401
internal fun PlayerActivity.showV401DimScreenOnIdle401Toggle() {
    val current = BiliClient.prefs.v401dimScreenOnIdle401
    BiliClient.prefs.v401dimScreenOnIdle401 = !current
    AppToast.show(this, "Dim Screen On Idle401: ${if (!current) "ON" else "OFF"}")
}

// v402: Cloud Auto Sync402
internal fun PlayerActivity.showV402CloudAutoSync402Toggle() {
    val current = BiliClient.prefs.v402cloudAutoSync402
    BiliClient.prefs.v402cloudAutoSync402 = !current
    AppToast.show(this, "Cloud Auto Sync402: ${if (!current) "ON" else "OFF"}")
}

// v402: Cloud Storage Limit402
internal fun PlayerActivity.showV402CloudStorageLimit402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402cloudStorageLimit402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402cloudStorageLimit402 = value
        AppToast.show(this, "Cloud Storage Limit402: $value")
    }
}

// v402: Collect Auto Categorize402
internal fun PlayerActivity.showV402CollectAutoCategorize402Toggle() {
    val current = BiliClient.prefs.v402collectAutoCategorize402
    BiliClient.prefs.v402collectAutoCategorize402 = !current
    AppToast.show(this, "Collect Auto Categorize402: ${if (!current) "ON" else "OFF"}")
}

// v402: Compact Mode Enabled402
internal fun PlayerActivity.showV402CompactModeEnabled402Toggle() {
    val current = BiliClient.prefs.v402compactModeEnabled402
    BiliClient.prefs.v402compactModeEnabled402 = !current
    AppToast.show(this, "Compact Mode Enabled402: ${if (!current) "ON" else "OFF"}")
}

// v402: Compress Auto Quality402
internal fun PlayerActivity.showV402CompressAutoQuality402Toggle() {
    val current = BiliClient.prefs.v402compressAutoQuality402
    BiliClient.prefs.v402compressAutoQuality402 = !current
    AppToast.show(this, "Compress Auto Quality402: ${if (!current) "ON" else "OFF"}")
}

// v402: Connect Auto Retry402
internal fun PlayerActivity.showV402ConnectAutoRetry402Toggle() {
    val current = BiliClient.prefs.v402connectAutoRetry402
    BiliClient.prefs.v402connectAutoRetry402 = !current
    AppToast.show(this, "Connect Auto Retry402: ${if (!current) "ON" else "OFF"}")
}

// v402: Dashboard Widget Layout402
internal fun PlayerActivity.showV402DashboardWidgetLayout402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402dashboardWidgetLayout402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402dashboardWidgetLayout402 = value
        AppToast.show(this, "Dashboard Widget Layout402: $value")
    }
}

// v402: Debug Log Verbose402
internal fun PlayerActivity.showV402DebugLogVerbose402Toggle() {
    val current = BiliClient.prefs.v402debugLogVerbose402
    BiliClient.prefs.v402debugLogVerbose402 = !current
    AppToast.show(this, "Debug Log Verbose402: ${if (!current) "ON" else "OFF"}")
}

// v402: Deep Color Enabled402
internal fun PlayerActivity.showV402DeepColorEnabled402Toggle() {
    val current = BiliClient.prefs.v402deepColorEnabled402
    BiliClient.prefs.v402deepColorEnabled402 = !current
    AppToast.show(this, "Deep Color Enabled402: ${if (!current) "ON" else "OFF"}")
}

// v402: Default Player Engine402
internal fun PlayerActivity.showV402DefaultPlayerEngine402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402defaultPlayerEngine402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402defaultPlayerEngine402 = value
        AppToast.show(this, "Default Player Engine402: $value")
    }
}

// v402: Delay Start Ms402
internal fun PlayerActivity.showV402DelayStartMs402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402delayStartMs402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402delayStartMs402 = value
        AppToast.show(this, "Delay Start Ms402: $value")
    }
}

// v402: Density Auto Adjust402
internal fun PlayerActivity.showV402DensityAutoAdjust402Toggle() {
    val current = BiliClient.prefs.v402densityAutoAdjust402
    BiliClient.prefs.v402densityAutoAdjust402 = !current
    AppToast.show(this, "Density Auto Adjust402: ${if (!current) "ON" else "OFF"}")
}

// v402: Deploy Auto Update402
internal fun PlayerActivity.showV402DeployAutoUpdate402Toggle() {
    val current = BiliClient.prefs.v402deployAutoUpdate402
    BiliClient.prefs.v402deployAutoUpdate402 = !current
    AppToast.show(this, "Deploy Auto Update402: ${if (!current) "ON" else "OFF"}")
}

// v402: Detect Motion Enabled402
internal fun PlayerActivity.showV402DetectMotionEnabled402Toggle() {
    val current = BiliClient.prefs.v402detectMotionEnabled402
    BiliClient.prefs.v402detectMotionEnabled402 = !current
    AppToast.show(this, "Detect Motion Enabled402: ${if (!current) "ON" else "OFF"}")
}

// v402: Dim Screen On Idle402
internal fun PlayerActivity.showV402DimScreenOnIdle402Toggle() {
    val current = BiliClient.prefs.v402dimScreenOnIdle402
    BiliClient.prefs.v402dimScreenOnIdle402 = !current
    AppToast.show(this, "Dim Screen On Idle402: ${if (!current) "ON" else "OFF"}")
}

// v403: Cloud Auto Sync403
internal fun PlayerActivity.showV403CloudAutoSync403Toggle() {
    val current = BiliClient.prefs.v403cloudAutoSync403
    BiliClient.prefs.v403cloudAutoSync403 = !current
    AppToast.show(this, "Cloud Auto Sync403: ${if (!current) "ON" else "OFF"}")
}

// v403: Cloud Storage Limit403
internal fun PlayerActivity.showV403CloudStorageLimit403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403cloudStorageLimit403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403cloudStorageLimit403 = value
        AppToast.show(this, "Cloud Storage Limit403: $value")
    }
}

// v403: Collect Auto Categorize403
internal fun PlayerActivity.showV403CollectAutoCategorize403Toggle() {
    val current = BiliClient.prefs.v403collectAutoCategorize403
    BiliClient.prefs.v403collectAutoCategorize403 = !current
    AppToast.show(this, "Collect Auto Categorize403: ${if (!current) "ON" else "OFF"}")
}

// v403: Compact Mode Enabled403
internal fun PlayerActivity.showV403CompactModeEnabled403Toggle() {
    val current = BiliClient.prefs.v403compactModeEnabled403
    BiliClient.prefs.v403compactModeEnabled403 = !current
    AppToast.show(this, "Compact Mode Enabled403: ${if (!current) "ON" else "OFF"}")
}

// v403: Compress Auto Quality403
internal fun PlayerActivity.showV403CompressAutoQuality403Toggle() {
    val current = BiliClient.prefs.v403compressAutoQuality403
    BiliClient.prefs.v403compressAutoQuality403 = !current
    AppToast.show(this, "Compress Auto Quality403: ${if (!current) "ON" else "OFF"}")
}

// v403: Connect Auto Retry403
internal fun PlayerActivity.showV403ConnectAutoRetry403Toggle() {
    val current = BiliClient.prefs.v403connectAutoRetry403
    BiliClient.prefs.v403connectAutoRetry403 = !current
    AppToast.show(this, "Connect Auto Retry403: ${if (!current) "ON" else "OFF"}")
}

// v403: Dashboard Widget Layout403
internal fun PlayerActivity.showV403DashboardWidgetLayout403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403dashboardWidgetLayout403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403dashboardWidgetLayout403 = value
        AppToast.show(this, "Dashboard Widget Layout403: $value")
    }
}

// v403: Debug Log Verbose403
internal fun PlayerActivity.showV403DebugLogVerbose403Toggle() {
    val current = BiliClient.prefs.v403debugLogVerbose403
    BiliClient.prefs.v403debugLogVerbose403 = !current
    AppToast.show(this, "Debug Log Verbose403: ${if (!current) "ON" else "OFF"}")
}

// v403: Deep Color Enabled403
internal fun PlayerActivity.showV403DeepColorEnabled403Toggle() {
    val current = BiliClient.prefs.v403deepColorEnabled403
    BiliClient.prefs.v403deepColorEnabled403 = !current
    AppToast.show(this, "Deep Color Enabled403: ${if (!current) "ON" else "OFF"}")
}

// v403: Default Player Engine403
internal fun PlayerActivity.showV403DefaultPlayerEngine403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403defaultPlayerEngine403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403defaultPlayerEngine403 = value
        AppToast.show(this, "Default Player Engine403: $value")
    }
}

// v403: Delay Start Ms403
internal fun PlayerActivity.showV403DelayStartMs403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403delayStartMs403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403delayStartMs403 = value
        AppToast.show(this, "Delay Start Ms403: $value")
    }
}

// v403: Density Auto Adjust403
internal fun PlayerActivity.showV403DensityAutoAdjust403Toggle() {
    val current = BiliClient.prefs.v403densityAutoAdjust403
    BiliClient.prefs.v403densityAutoAdjust403 = !current
    AppToast.show(this, "Density Auto Adjust403: ${if (!current) "ON" else "OFF"}")
}

// v403: Deploy Auto Update403
internal fun PlayerActivity.showV403DeployAutoUpdate403Toggle() {
    val current = BiliClient.prefs.v403deployAutoUpdate403
    BiliClient.prefs.v403deployAutoUpdate403 = !current
    AppToast.show(this, "Deploy Auto Update403: ${if (!current) "ON" else "OFF"}")
}

// v403: Detect Motion Enabled403
internal fun PlayerActivity.showV403DetectMotionEnabled403Toggle() {
    val current = BiliClient.prefs.v403detectMotionEnabled403
    BiliClient.prefs.v403detectMotionEnabled403 = !current
    AppToast.show(this, "Detect Motion Enabled403: ${if (!current) "ON" else "OFF"}")
}

// v403: Dim Screen On Idle403
internal fun PlayerActivity.showV403DimScreenOnIdle403Toggle() {
    val current = BiliClient.prefs.v403dimScreenOnIdle403
    BiliClient.prefs.v403dimScreenOnIdle403 = !current
    AppToast.show(this, "Dim Screen On Idle403: ${if (!current) "ON" else "OFF"}")
}

// v404: Cloud Auto Sync404
internal fun PlayerActivity.showV404CloudAutoSync404Toggle() {
    val current = BiliClient.prefs.v404cloudAutoSync404
    BiliClient.prefs.v404cloudAutoSync404 = !current
    AppToast.show(this, "Cloud Auto Sync404: ${if (!current) "ON" else "OFF"}")
}

// v404: Cloud Storage Limit404
internal fun PlayerActivity.showV404CloudStorageLimit404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404cloudStorageLimit404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404cloudStorageLimit404 = value
        AppToast.show(this, "Cloud Storage Limit404: $value")
    }
}

// v404: Collect Auto Categorize404
internal fun PlayerActivity.showV404CollectAutoCategorize404Toggle() {
    val current = BiliClient.prefs.v404collectAutoCategorize404
    BiliClient.prefs.v404collectAutoCategorize404 = !current
    AppToast.show(this, "Collect Auto Categorize404: ${if (!current) "ON" else "OFF"}")
}

// v404: Compact Mode Enabled404
internal fun PlayerActivity.showV404CompactModeEnabled404Toggle() {
    val current = BiliClient.prefs.v404compactModeEnabled404
    BiliClient.prefs.v404compactModeEnabled404 = !current
    AppToast.show(this, "Compact Mode Enabled404: ${if (!current) "ON" else "OFF"}")
}

// v404: Compress Auto Quality404
internal fun PlayerActivity.showV404CompressAutoQuality404Toggle() {
    val current = BiliClient.prefs.v404compressAutoQuality404
    BiliClient.prefs.v404compressAutoQuality404 = !current
    AppToast.show(this, "Compress Auto Quality404: ${if (!current) "ON" else "OFF"}")
}

// v404: Connect Auto Retry404
internal fun PlayerActivity.showV404ConnectAutoRetry404Toggle() {
    val current = BiliClient.prefs.v404connectAutoRetry404
    BiliClient.prefs.v404connectAutoRetry404 = !current
    AppToast.show(this, "Connect Auto Retry404: ${if (!current) "ON" else "OFF"}")
}

// v404: Dashboard Widget Layout404
internal fun PlayerActivity.showV404DashboardWidgetLayout404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404dashboardWidgetLayout404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404dashboardWidgetLayout404 = value
        AppToast.show(this, "Dashboard Widget Layout404: $value")
    }
}

// v404: Debug Log Verbose404
internal fun PlayerActivity.showV404DebugLogVerbose404Toggle() {
    val current = BiliClient.prefs.v404debugLogVerbose404
    BiliClient.prefs.v404debugLogVerbose404 = !current
    AppToast.show(this, "Debug Log Verbose404: ${if (!current) "ON" else "OFF"}")
}

// v404: Deep Color Enabled404
internal fun PlayerActivity.showV404DeepColorEnabled404Toggle() {
    val current = BiliClient.prefs.v404deepColorEnabled404
    BiliClient.prefs.v404deepColorEnabled404 = !current
    AppToast.show(this, "Deep Color Enabled404: ${if (!current) "ON" else "OFF"}")
}

// v404: Default Player Engine404
internal fun PlayerActivity.showV404DefaultPlayerEngine404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404defaultPlayerEngine404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404defaultPlayerEngine404 = value
        AppToast.show(this, "Default Player Engine404: $value")
    }
}

// v404: Delay Start Ms404
internal fun PlayerActivity.showV404DelayStartMs404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404delayStartMs404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404delayStartMs404 = value
        AppToast.show(this, "Delay Start Ms404: $value")
    }
}

// v404: Density Auto Adjust404
internal fun PlayerActivity.showV404DensityAutoAdjust404Toggle() {
    val current = BiliClient.prefs.v404densityAutoAdjust404
    BiliClient.prefs.v404densityAutoAdjust404 = !current
    AppToast.show(this, "Density Auto Adjust404: ${if (!current) "ON" else "OFF"}")
}

// v404: Deploy Auto Update404
internal fun PlayerActivity.showV404DeployAutoUpdate404Toggle() {
    val current = BiliClient.prefs.v404deployAutoUpdate404
    BiliClient.prefs.v404deployAutoUpdate404 = !current
    AppToast.show(this, "Deploy Auto Update404: ${if (!current) "ON" else "OFF"}")
}

// v404: Detect Motion Enabled404
internal fun PlayerActivity.showV404DetectMotionEnabled404Toggle() {
    val current = BiliClient.prefs.v404detectMotionEnabled404
    BiliClient.prefs.v404detectMotionEnabled404 = !current
    AppToast.show(this, "Detect Motion Enabled404: ${if (!current) "ON" else "OFF"}")
}

// v404: Dim Screen On Idle404
internal fun PlayerActivity.showV404DimScreenOnIdle404Toggle() {
    val current = BiliClient.prefs.v404dimScreenOnIdle404
    BiliClient.prefs.v404dimScreenOnIdle404 = !current
    AppToast.show(this, "Dim Screen On Idle404: ${if (!current) "ON" else "OFF"}")
}

// v405: Cloud Auto Sync405
internal fun PlayerActivity.showV405CloudAutoSync405Toggle() {
    val current = BiliClient.prefs.v405cloudAutoSync405
    BiliClient.prefs.v405cloudAutoSync405 = !current
    AppToast.show(this, "Cloud Auto Sync405: ${if (!current) "ON" else "OFF"}")
}

// v405: Cloud Storage Limit405
internal fun PlayerActivity.showV405CloudStorageLimit405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405cloudStorageLimit405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405cloudStorageLimit405 = value
        AppToast.show(this, "Cloud Storage Limit405: $value")
    }
}

// v405: Collect Auto Categorize405
internal fun PlayerActivity.showV405CollectAutoCategorize405Toggle() {
    val current = BiliClient.prefs.v405collectAutoCategorize405
    BiliClient.prefs.v405collectAutoCategorize405 = !current
    AppToast.show(this, "Collect Auto Categorize405: ${if (!current) "ON" else "OFF"}")
}

// v405: Compact Mode Enabled405
internal fun PlayerActivity.showV405CompactModeEnabled405Toggle() {
    val current = BiliClient.prefs.v405compactModeEnabled405
    BiliClient.prefs.v405compactModeEnabled405 = !current
    AppToast.show(this, "Compact Mode Enabled405: ${if (!current) "ON" else "OFF"}")
}

// v405: Compress Auto Quality405
internal fun PlayerActivity.showV405CompressAutoQuality405Toggle() {
    val current = BiliClient.prefs.v405compressAutoQuality405
    BiliClient.prefs.v405compressAutoQuality405 = !current
    AppToast.show(this, "Compress Auto Quality405: ${if (!current) "ON" else "OFF"}")
}

// v405: Connect Auto Retry405
internal fun PlayerActivity.showV405ConnectAutoRetry405Toggle() {
    val current = BiliClient.prefs.v405connectAutoRetry405
    BiliClient.prefs.v405connectAutoRetry405 = !current
    AppToast.show(this, "Connect Auto Retry405: ${if (!current) "ON" else "OFF"}")
}

// v405: Dashboard Widget Layout405
internal fun PlayerActivity.showV405DashboardWidgetLayout405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405dashboardWidgetLayout405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405dashboardWidgetLayout405 = value
        AppToast.show(this, "Dashboard Widget Layout405: $value")
    }
}

// v405: Debug Log Verbose405
internal fun PlayerActivity.showV405DebugLogVerbose405Toggle() {
    val current = BiliClient.prefs.v405debugLogVerbose405
    BiliClient.prefs.v405debugLogVerbose405 = !current
    AppToast.show(this, "Debug Log Verbose405: ${if (!current) "ON" else "OFF"}")
}

// v405: Deep Color Enabled405
internal fun PlayerActivity.showV405DeepColorEnabled405Toggle() {
    val current = BiliClient.prefs.v405deepColorEnabled405
    BiliClient.prefs.v405deepColorEnabled405 = !current
    AppToast.show(this, "Deep Color Enabled405: ${if (!current) "ON" else "OFF"}")
}

// v405: Default Player Engine405
internal fun PlayerActivity.showV405DefaultPlayerEngine405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405defaultPlayerEngine405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405defaultPlayerEngine405 = value
        AppToast.show(this, "Default Player Engine405: $value")
    }
}

// v405: Delay Start Ms405
internal fun PlayerActivity.showV405DelayStartMs405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405delayStartMs405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405delayStartMs405 = value
        AppToast.show(this, "Delay Start Ms405: $value")
    }
}

// v405: Density Auto Adjust405
internal fun PlayerActivity.showV405DensityAutoAdjust405Toggle() {
    val current = BiliClient.prefs.v405densityAutoAdjust405
    BiliClient.prefs.v405densityAutoAdjust405 = !current
    AppToast.show(this, "Density Auto Adjust405: ${if (!current) "ON" else "OFF"}")
}

// v405: Deploy Auto Update405
internal fun PlayerActivity.showV405DeployAutoUpdate405Toggle() {
    val current = BiliClient.prefs.v405deployAutoUpdate405
    BiliClient.prefs.v405deployAutoUpdate405 = !current
    AppToast.show(this, "Deploy Auto Update405: ${if (!current) "ON" else "OFF"}")
}

// v405: Detect Motion Enabled405
internal fun PlayerActivity.showV405DetectMotionEnabled405Toggle() {
    val current = BiliClient.prefs.v405detectMotionEnabled405
    BiliClient.prefs.v405detectMotionEnabled405 = !current
    AppToast.show(this, "Detect Motion Enabled405: ${if (!current) "ON" else "OFF"}")
}

// v405: Dim Screen On Idle405
internal fun PlayerActivity.showV405DimScreenOnIdle405Toggle() {
    val current = BiliClient.prefs.v405dimScreenOnIdle405
    BiliClient.prefs.v405dimScreenOnIdle405 = !current
    AppToast.show(this, "Dim Screen On Idle405: ${if (!current) "ON" else "OFF"}")
}

// v406: Cloud Auto Sync406
internal fun PlayerActivity.showV406CloudAutoSync406Toggle() {
    val current = BiliClient.prefs.v406cloudAutoSync406
    BiliClient.prefs.v406cloudAutoSync406 = !current
    AppToast.show(this, "Cloud Auto Sync406: ${if (!current) "ON" else "OFF"}")
}

// v406: Cloud Storage Limit406
internal fun PlayerActivity.showV406CloudStorageLimit406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406cloudStorageLimit406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406cloudStorageLimit406 = value
        AppToast.show(this, "Cloud Storage Limit406: $value")
    }
}

// v406: Collect Auto Categorize406
internal fun PlayerActivity.showV406CollectAutoCategorize406Toggle() {
    val current = BiliClient.prefs.v406collectAutoCategorize406
    BiliClient.prefs.v406collectAutoCategorize406 = !current
    AppToast.show(this, "Collect Auto Categorize406: ${if (!current) "ON" else "OFF"}")
}

// v406: Compact Mode Enabled406
internal fun PlayerActivity.showV406CompactModeEnabled406Toggle() {
    val current = BiliClient.prefs.v406compactModeEnabled406
    BiliClient.prefs.v406compactModeEnabled406 = !current
    AppToast.show(this, "Compact Mode Enabled406: ${if (!current) "ON" else "OFF"}")
}

// v406: Compress Auto Quality406
internal fun PlayerActivity.showV406CompressAutoQuality406Toggle() {
    val current = BiliClient.prefs.v406compressAutoQuality406
    BiliClient.prefs.v406compressAutoQuality406 = !current
    AppToast.show(this, "Compress Auto Quality406: ${if (!current) "ON" else "OFF"}")
}

// v406: Connect Auto Retry406
internal fun PlayerActivity.showV406ConnectAutoRetry406Toggle() {
    val current = BiliClient.prefs.v406connectAutoRetry406
    BiliClient.prefs.v406connectAutoRetry406 = !current
    AppToast.show(this, "Connect Auto Retry406: ${if (!current) "ON" else "OFF"}")
}

// v406: Dashboard Widget Layout406
internal fun PlayerActivity.showV406DashboardWidgetLayout406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406dashboardWidgetLayout406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406dashboardWidgetLayout406 = value
        AppToast.show(this, "Dashboard Widget Layout406: $value")
    }
}

// v406: Debug Log Verbose406
internal fun PlayerActivity.showV406DebugLogVerbose406Toggle() {
    val current = BiliClient.prefs.v406debugLogVerbose406
    BiliClient.prefs.v406debugLogVerbose406 = !current
    AppToast.show(this, "Debug Log Verbose406: ${if (!current) "ON" else "OFF"}")
}

// v406: Deep Color Enabled406
internal fun PlayerActivity.showV406DeepColorEnabled406Toggle() {
    val current = BiliClient.prefs.v406deepColorEnabled406
    BiliClient.prefs.v406deepColorEnabled406 = !current
    AppToast.show(this, "Deep Color Enabled406: ${if (!current) "ON" else "OFF"}")
}

// v406: Default Player Engine406
internal fun PlayerActivity.showV406DefaultPlayerEngine406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406defaultPlayerEngine406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406defaultPlayerEngine406 = value
        AppToast.show(this, "Default Player Engine406: $value")
    }
}

// v406: Delay Start Ms406
internal fun PlayerActivity.showV406DelayStartMs406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406delayStartMs406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406delayStartMs406 = value
        AppToast.show(this, "Delay Start Ms406: $value")
    }
}

// v406: Density Auto Adjust406
internal fun PlayerActivity.showV406DensityAutoAdjust406Toggle() {
    val current = BiliClient.prefs.v406densityAutoAdjust406
    BiliClient.prefs.v406densityAutoAdjust406 = !current
    AppToast.show(this, "Density Auto Adjust406: ${if (!current) "ON" else "OFF"}")
}

// v406: Deploy Auto Update406
internal fun PlayerActivity.showV406DeployAutoUpdate406Toggle() {
    val current = BiliClient.prefs.v406deployAutoUpdate406
    BiliClient.prefs.v406deployAutoUpdate406 = !current
    AppToast.show(this, "Deploy Auto Update406: ${if (!current) "ON" else "OFF"}")
}

// v406: Detect Motion Enabled406
internal fun PlayerActivity.showV406DetectMotionEnabled406Toggle() {
    val current = BiliClient.prefs.v406detectMotionEnabled406
    BiliClient.prefs.v406detectMotionEnabled406 = !current
    AppToast.show(this, "Detect Motion Enabled406: ${if (!current) "ON" else "OFF"}")
}

// v406: Dim Screen On Idle406
internal fun PlayerActivity.showV406DimScreenOnIdle406Toggle() {
    val current = BiliClient.prefs.v406dimScreenOnIdle406
    BiliClient.prefs.v406dimScreenOnIdle406 = !current
    AppToast.show(this, "Dim Screen On Idle406: ${if (!current) "ON" else "OFF"}")
}

// v407: Cloud Auto Sync407
internal fun PlayerActivity.showV407CloudAutoSync407Toggle() {
    val current = BiliClient.prefs.v407cloudAutoSync407
    BiliClient.prefs.v407cloudAutoSync407 = !current
    AppToast.show(this, "Cloud Auto Sync407: ${if (!current) "ON" else "OFF"}")
}

// v407: Cloud Storage Limit407
internal fun PlayerActivity.showV407CloudStorageLimit407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407cloudStorageLimit407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407cloudStorageLimit407 = value
        AppToast.show(this, "Cloud Storage Limit407: $value")
    }
}

// v407: Collect Auto Categorize407
internal fun PlayerActivity.showV407CollectAutoCategorize407Toggle() {
    val current = BiliClient.prefs.v407collectAutoCategorize407
    BiliClient.prefs.v407collectAutoCategorize407 = !current
    AppToast.show(this, "Collect Auto Categorize407: ${if (!current) "ON" else "OFF"}")
}

// v407: Compact Mode Enabled407
internal fun PlayerActivity.showV407CompactModeEnabled407Toggle() {
    val current = BiliClient.prefs.v407compactModeEnabled407
    BiliClient.prefs.v407compactModeEnabled407 = !current
    AppToast.show(this, "Compact Mode Enabled407: ${if (!current) "ON" else "OFF"}")
}

// v407: Compress Auto Quality407
internal fun PlayerActivity.showV407CompressAutoQuality407Toggle() {
    val current = BiliClient.prefs.v407compressAutoQuality407
    BiliClient.prefs.v407compressAutoQuality407 = !current
    AppToast.show(this, "Compress Auto Quality407: ${if (!current) "ON" else "OFF"}")
}

// v407: Connect Auto Retry407
internal fun PlayerActivity.showV407ConnectAutoRetry407Toggle() {
    val current = BiliClient.prefs.v407connectAutoRetry407
    BiliClient.prefs.v407connectAutoRetry407 = !current
    AppToast.show(this, "Connect Auto Retry407: ${if (!current) "ON" else "OFF"}")
}

// v407: Dashboard Widget Layout407
internal fun PlayerActivity.showV407DashboardWidgetLayout407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407dashboardWidgetLayout407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407dashboardWidgetLayout407 = value
        AppToast.show(this, "Dashboard Widget Layout407: $value")
    }
}

// v407: Debug Log Verbose407
internal fun PlayerActivity.showV407DebugLogVerbose407Toggle() {
    val current = BiliClient.prefs.v407debugLogVerbose407
    BiliClient.prefs.v407debugLogVerbose407 = !current
    AppToast.show(this, "Debug Log Verbose407: ${if (!current) "ON" else "OFF"}")
}

// v407: Deep Color Enabled407
internal fun PlayerActivity.showV407DeepColorEnabled407Toggle() {
    val current = BiliClient.prefs.v407deepColorEnabled407
    BiliClient.prefs.v407deepColorEnabled407 = !current
    AppToast.show(this, "Deep Color Enabled407: ${if (!current) "ON" else "OFF"}")
}

// v407: Default Player Engine407
internal fun PlayerActivity.showV407DefaultPlayerEngine407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407defaultPlayerEngine407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407defaultPlayerEngine407 = value
        AppToast.show(this, "Default Player Engine407: $value")
    }
}

// v407: Delay Start Ms407
internal fun PlayerActivity.showV407DelayStartMs407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407delayStartMs407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407delayStartMs407 = value
        AppToast.show(this, "Delay Start Ms407: $value")
    }
}

// v407: Density Auto Adjust407
internal fun PlayerActivity.showV407DensityAutoAdjust407Toggle() {
    val current = BiliClient.prefs.v407densityAutoAdjust407
    BiliClient.prefs.v407densityAutoAdjust407 = !current
    AppToast.show(this, "Density Auto Adjust407: ${if (!current) "ON" else "OFF"}")
}

// v407: Deploy Auto Update407
internal fun PlayerActivity.showV407DeployAutoUpdate407Toggle() {
    val current = BiliClient.prefs.v407deployAutoUpdate407
    BiliClient.prefs.v407deployAutoUpdate407 = !current
    AppToast.show(this, "Deploy Auto Update407: ${if (!current) "ON" else "OFF"}")
}

// v407: Detect Motion Enabled407
internal fun PlayerActivity.showV407DetectMotionEnabled407Toggle() {
    val current = BiliClient.prefs.v407detectMotionEnabled407
    BiliClient.prefs.v407detectMotionEnabled407 = !current
    AppToast.show(this, "Detect Motion Enabled407: ${if (!current) "ON" else "OFF"}")
}

// v407: Dim Screen On Idle407
internal fun PlayerActivity.showV407DimScreenOnIdle407Toggle() {
    val current = BiliClient.prefs.v407dimScreenOnIdle407
    BiliClient.prefs.v407dimScreenOnIdle407 = !current
    AppToast.show(this, "Dim Screen On Idle407: ${if (!current) "ON" else "OFF"}")
}

// v408: Cloud Auto Sync408
internal fun PlayerActivity.showV408CloudAutoSync408Toggle() {
    val current = BiliClient.prefs.v408cloudAutoSync408
    BiliClient.prefs.v408cloudAutoSync408 = !current
    AppToast.show(this, "Cloud Auto Sync408: ${if (!current) "ON" else "OFF"}")
}

// v408: Cloud Storage Limit408
internal fun PlayerActivity.showV408CloudStorageLimit408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408cloudStorageLimit408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408cloudStorageLimit408 = value
        AppToast.show(this, "Cloud Storage Limit408: $value")
    }
}

// v408: Collect Auto Categorize408
internal fun PlayerActivity.showV408CollectAutoCategorize408Toggle() {
    val current = BiliClient.prefs.v408collectAutoCategorize408
    BiliClient.prefs.v408collectAutoCategorize408 = !current
    AppToast.show(this, "Collect Auto Categorize408: ${if (!current) "ON" else "OFF"}")
}

// v408: Compact Mode Enabled408
internal fun PlayerActivity.showV408CompactModeEnabled408Toggle() {
    val current = BiliClient.prefs.v408compactModeEnabled408
    BiliClient.prefs.v408compactModeEnabled408 = !current
    AppToast.show(this, "Compact Mode Enabled408: ${if (!current) "ON" else "OFF"}")
}

// v408: Compress Auto Quality408
internal fun PlayerActivity.showV408CompressAutoQuality408Toggle() {
    val current = BiliClient.prefs.v408compressAutoQuality408
    BiliClient.prefs.v408compressAutoQuality408 = !current
    AppToast.show(this, "Compress Auto Quality408: ${if (!current) "ON" else "OFF"}")
}

// v408: Connect Auto Retry408
internal fun PlayerActivity.showV408ConnectAutoRetry408Toggle() {
    val current = BiliClient.prefs.v408connectAutoRetry408
    BiliClient.prefs.v408connectAutoRetry408 = !current
    AppToast.show(this, "Connect Auto Retry408: ${if (!current) "ON" else "OFF"}")
}

// v408: Dashboard Widget Layout408
internal fun PlayerActivity.showV408DashboardWidgetLayout408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408dashboardWidgetLayout408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408dashboardWidgetLayout408 = value
        AppToast.show(this, "Dashboard Widget Layout408: $value")
    }
}

// v408: Debug Log Verbose408
internal fun PlayerActivity.showV408DebugLogVerbose408Toggle() {
    val current = BiliClient.prefs.v408debugLogVerbose408
    BiliClient.prefs.v408debugLogVerbose408 = !current
    AppToast.show(this, "Debug Log Verbose408: ${if (!current) "ON" else "OFF"}")
}

// v408: Deep Color Enabled408
internal fun PlayerActivity.showV408DeepColorEnabled408Toggle() {
    val current = BiliClient.prefs.v408deepColorEnabled408
    BiliClient.prefs.v408deepColorEnabled408 = !current
    AppToast.show(this, "Deep Color Enabled408: ${if (!current) "ON" else "OFF"}")
}

// v408: Default Player Engine408
internal fun PlayerActivity.showV408DefaultPlayerEngine408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408defaultPlayerEngine408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408defaultPlayerEngine408 = value
        AppToast.show(this, "Default Player Engine408: $value")
    }
}

// v408: Delay Start Ms408
internal fun PlayerActivity.showV408DelayStartMs408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408delayStartMs408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408delayStartMs408 = value
        AppToast.show(this, "Delay Start Ms408: $value")
    }
}

// v408: Density Auto Adjust408
internal fun PlayerActivity.showV408DensityAutoAdjust408Toggle() {
    val current = BiliClient.prefs.v408densityAutoAdjust408
    BiliClient.prefs.v408densityAutoAdjust408 = !current
    AppToast.show(this, "Density Auto Adjust408: ${if (!current) "ON" else "OFF"}")
}

// v408: Deploy Auto Update408
internal fun PlayerActivity.showV408DeployAutoUpdate408Toggle() {
    val current = BiliClient.prefs.v408deployAutoUpdate408
    BiliClient.prefs.v408deployAutoUpdate408 = !current
    AppToast.show(this, "Deploy Auto Update408: ${if (!current) "ON" else "OFF"}")
}

// v408: Detect Motion Enabled408
internal fun PlayerActivity.showV408DetectMotionEnabled408Toggle() {
    val current = BiliClient.prefs.v408detectMotionEnabled408
    BiliClient.prefs.v408detectMotionEnabled408 = !current
    AppToast.show(this, "Detect Motion Enabled408: ${if (!current) "ON" else "OFF"}")
}

// v408: Dim Screen On Idle408
internal fun PlayerActivity.showV408DimScreenOnIdle408Toggle() {
    val current = BiliClient.prefs.v408dimScreenOnIdle408
    BiliClient.prefs.v408dimScreenOnIdle408 = !current
    AppToast.show(this, "Dim Screen On Idle408: ${if (!current) "ON" else "OFF"}")
}

// v409: Cloud Auto Sync409
internal fun PlayerActivity.showV409CloudAutoSync409Toggle() {
    val current = BiliClient.prefs.v409cloudAutoSync409
    BiliClient.prefs.v409cloudAutoSync409 = !current
    AppToast.show(this, "Cloud Auto Sync409: ${if (!current) "ON" else "OFF"}")
}

// v409: Cloud Storage Limit409
internal fun PlayerActivity.showV409CloudStorageLimit409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409cloudStorageLimit409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409cloudStorageLimit409 = value
        AppToast.show(this, "Cloud Storage Limit409: $value")
    }
}

// v409: Collect Auto Categorize409
internal fun PlayerActivity.showV409CollectAutoCategorize409Toggle() {
    val current = BiliClient.prefs.v409collectAutoCategorize409
    BiliClient.prefs.v409collectAutoCategorize409 = !current
    AppToast.show(this, "Collect Auto Categorize409: ${if (!current) "ON" else "OFF"}")
}

// v409: Compact Mode Enabled409
internal fun PlayerActivity.showV409CompactModeEnabled409Toggle() {
    val current = BiliClient.prefs.v409compactModeEnabled409
    BiliClient.prefs.v409compactModeEnabled409 = !current
    AppToast.show(this, "Compact Mode Enabled409: ${if (!current) "ON" else "OFF"}")
}

// v409: Compress Auto Quality409
internal fun PlayerActivity.showV409CompressAutoQuality409Toggle() {
    val current = BiliClient.prefs.v409compressAutoQuality409
    BiliClient.prefs.v409compressAutoQuality409 = !current
    AppToast.show(this, "Compress Auto Quality409: ${if (!current) "ON" else "OFF"}")
}

// v409: Connect Auto Retry409
internal fun PlayerActivity.showV409ConnectAutoRetry409Toggle() {
    val current = BiliClient.prefs.v409connectAutoRetry409
    BiliClient.prefs.v409connectAutoRetry409 = !current
    AppToast.show(this, "Connect Auto Retry409: ${if (!current) "ON" else "OFF"}")
}

// v409: Dashboard Widget Layout409
internal fun PlayerActivity.showV409DashboardWidgetLayout409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409dashboardWidgetLayout409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409dashboardWidgetLayout409 = value
        AppToast.show(this, "Dashboard Widget Layout409: $value")
    }
}

// v409: Debug Log Verbose409
internal fun PlayerActivity.showV409DebugLogVerbose409Toggle() {
    val current = BiliClient.prefs.v409debugLogVerbose409
    BiliClient.prefs.v409debugLogVerbose409 = !current
    AppToast.show(this, "Debug Log Verbose409: ${if (!current) "ON" else "OFF"}")
}

// v409: Deep Color Enabled409
internal fun PlayerActivity.showV409DeepColorEnabled409Toggle() {
    val current = BiliClient.prefs.v409deepColorEnabled409
    BiliClient.prefs.v409deepColorEnabled409 = !current
    AppToast.show(this, "Deep Color Enabled409: ${if (!current) "ON" else "OFF"}")
}

// v409: Default Player Engine409
internal fun PlayerActivity.showV409DefaultPlayerEngine409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409defaultPlayerEngine409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409defaultPlayerEngine409 = value
        AppToast.show(this, "Default Player Engine409: $value")
    }
}

// v409: Delay Start Ms409
internal fun PlayerActivity.showV409DelayStartMs409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409delayStartMs409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409delayStartMs409 = value
        AppToast.show(this, "Delay Start Ms409: $value")
    }
}

// v409: Density Auto Adjust409
internal fun PlayerActivity.showV409DensityAutoAdjust409Toggle() {
    val current = BiliClient.prefs.v409densityAutoAdjust409
    BiliClient.prefs.v409densityAutoAdjust409 = !current
    AppToast.show(this, "Density Auto Adjust409: ${if (!current) "ON" else "OFF"}")
}

// v409: Deploy Auto Update409
internal fun PlayerActivity.showV409DeployAutoUpdate409Toggle() {
    val current = BiliClient.prefs.v409deployAutoUpdate409
    BiliClient.prefs.v409deployAutoUpdate409 = !current
    AppToast.show(this, "Deploy Auto Update409: ${if (!current) "ON" else "OFF"}")
}
