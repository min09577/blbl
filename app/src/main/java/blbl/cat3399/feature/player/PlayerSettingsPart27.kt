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

internal fun PlayerActivity.showV375ChromecastAutoConnect375Toggle() {
    val current = BiliClient.prefs.v375chromecastAutoConnect375
    BiliClient.prefs.v375chromecastAutoConnect375 = !current
    AppToast.show(this, "Chromecast Auto Connect375: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV375FloatingWindowEnabled375Toggle() {
    val current = BiliClient.prefs.v375floatingWindowEnabled375
    BiliClient.prefs.v375floatingWindowEnabled375 = !current
    AppToast.show(this, "Floating Window Enabled375: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV375NfcAutoTransfer375Toggle() {
    val current = BiliClient.prefs.v375nfcAutoTransfer375
    BiliClient.prefs.v375nfcAutoTransfer375 = !current
    AppToast.show(this, "NFC Auto Transfer375: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV375UpdateAutoCheck375Toggle() {
    val current = BiliClient.prefs.v375updateAutoCheck375
    BiliClient.prefs.v375updateAutoCheck375 = !current
    AppToast.show(this, "Update Auto Check375: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV375VrModeEnabled375Toggle() {
    val current = BiliClient.prefs.v375vrModeEnabled375
    BiliClient.prefs.v375vrModeEnabled375 = !current
    AppToast.show(this, "VR Mode Enabled375: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV375AccessibilityHighContrast375Toggle() {
    val current = BiliClient.prefs.v375accessibilityHighContrast375
    BiliClient.prefs.v375accessibilityHighContrast375 = !current
    AppToast.show(this, "Accessibility High Contrast375: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV375CommentAutoTranslate375Toggle() {
    val current = BiliClient.prefs.v375commentAutoTranslate375
    BiliClient.prefs.v375commentAutoTranslate375 = !current
    AppToast.show(this, "Comment Auto Translate375: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV375ThumbnailPreview375Toggle() {
    val current = BiliClient.prefs.v375thumbnailPreview375
    BiliClient.prefs.v375thumbnailPreview375 = !current
    AppToast.show(this, "Thumbnail Preview375: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV376CaptionAutoDetect376Toggle() {
    val current = BiliClient.prefs.v376captionAutoDetect376
    BiliClient.prefs.v376captionAutoDetect376 = !current
    AppToast.show(this, "Caption Auto Detect376: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV376ChromecastAutoConnect376Toggle() {
    val current = BiliClient.prefs.v376chromecastAutoConnect376
    BiliClient.prefs.v376chromecastAutoConnect376 = !current
    AppToast.show(this, "Chromecast Auto Connect376: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV376FloatingWindowEnabled376Toggle() {
    val current = BiliClient.prefs.v376floatingWindowEnabled376
    BiliClient.prefs.v376floatingWindowEnabled376 = !current
    AppToast.show(this, "Floating Window Enabled376: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV376NfcAutoTransfer376Toggle() {
    val current = BiliClient.prefs.v376nfcAutoTransfer376
    BiliClient.prefs.v376nfcAutoTransfer376 = !current
    AppToast.show(this, "NFC Auto Transfer376: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV376UpdateAutoCheck376Toggle() {
    val current = BiliClient.prefs.v376updateAutoCheck376
    BiliClient.prefs.v376updateAutoCheck376 = !current
    AppToast.show(this, "Update Auto Check376: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV376VrModeEnabled376Toggle() {
    val current = BiliClient.prefs.v376vrModeEnabled376
    BiliClient.prefs.v376vrModeEnabled376 = !current
    AppToast.show(this, "VR Mode Enabled376: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV376AccessibilityHighContrast376Toggle() {
    val current = BiliClient.prefs.v376accessibilityHighContrast376
    BiliClient.prefs.v376accessibilityHighContrast376 = !current
    AppToast.show(this, "Accessibility High Contrast376: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV376CommentAutoTranslate376Toggle() {
    val current = BiliClient.prefs.v376commentAutoTranslate376
    BiliClient.prefs.v376commentAutoTranslate376 = !current
    AppToast.show(this, "Comment Auto Translate376: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV376ThumbnailPreview376Toggle() {
    val current = BiliClient.prefs.v376thumbnailPreview376
    BiliClient.prefs.v376thumbnailPreview376 = !current
    AppToast.show(this, "Thumbnail Preview376: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV377CaptionAutoDetect377Toggle() {
    val current = BiliClient.prefs.v377captionAutoDetect377
    BiliClient.prefs.v377captionAutoDetect377 = !current
    AppToast.show(this, "Caption Auto Detect377: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV377ChromecastAutoConnect377Toggle() {
    val current = BiliClient.prefs.v377chromecastAutoConnect377
    BiliClient.prefs.v377chromecastAutoConnect377 = !current
    AppToast.show(this, "Chromecast Auto Connect377: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV377FloatingWindowEnabled377Toggle() {
    val current = BiliClient.prefs.v377floatingWindowEnabled377
    BiliClient.prefs.v377floatingWindowEnabled377 = !current
    AppToast.show(this, "Floating Window Enabled377: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV377NfcAutoTransfer377Toggle() {
    val current = BiliClient.prefs.v377nfcAutoTransfer377
    BiliClient.prefs.v377nfcAutoTransfer377 = !current
    AppToast.show(this, "NFC Auto Transfer377: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV377UpdateAutoCheck377Toggle() {
    val current = BiliClient.prefs.v377updateAutoCheck377
    BiliClient.prefs.v377updateAutoCheck377 = !current
    AppToast.show(this, "Update Auto Check377: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV377VrModeEnabled377Toggle() {
    val current = BiliClient.prefs.v377vrModeEnabled377
    BiliClient.prefs.v377vrModeEnabled377 = !current
    AppToast.show(this, "VR Mode Enabled377: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV377AccessibilityHighContrast377Toggle() {
    val current = BiliClient.prefs.v377accessibilityHighContrast377
    BiliClient.prefs.v377accessibilityHighContrast377 = !current
    AppToast.show(this, "Accessibility High Contrast377: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV377CommentAutoTranslate377Toggle() {
    val current = BiliClient.prefs.v377commentAutoTranslate377
    BiliClient.prefs.v377commentAutoTranslate377 = !current
    AppToast.show(this, "Comment Auto Translate377: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV377ThumbnailPreview377Toggle() {
    val current = BiliClient.prefs.v377thumbnailPreview377
    BiliClient.prefs.v377thumbnailPreview377 = !current
    AppToast.show(this, "Thumbnail Preview377: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV378CaptionAutoDetect378Toggle() {
    val current = BiliClient.prefs.v378captionAutoDetect378
    BiliClient.prefs.v378captionAutoDetect378 = !current
    AppToast.show(this, "Caption Auto Detect378: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV378ChromecastAutoConnect378Toggle() {
    val current = BiliClient.prefs.v378chromecastAutoConnect378
    BiliClient.prefs.v378chromecastAutoConnect378 = !current
    AppToast.show(this, "Chromecast Auto Connect378: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV378FloatingWindowEnabled378Toggle() {
    val current = BiliClient.prefs.v378floatingWindowEnabled378
    BiliClient.prefs.v378floatingWindowEnabled378 = !current
    AppToast.show(this, "Floating Window Enabled378: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV378NfcAutoTransfer378Toggle() {
    val current = BiliClient.prefs.v378nfcAutoTransfer378
    BiliClient.prefs.v378nfcAutoTransfer378 = !current
    AppToast.show(this, "NFC Auto Transfer378: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV378UpdateAutoCheck378Toggle() {
    val current = BiliClient.prefs.v378updateAutoCheck378
    BiliClient.prefs.v378updateAutoCheck378 = !current
    AppToast.show(this, "Update Auto Check378: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV378VrModeEnabled378Toggle() {
    val current = BiliClient.prefs.v378vrModeEnabled378
    BiliClient.prefs.v378vrModeEnabled378 = !current
    AppToast.show(this, "VR Mode Enabled378: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV378AccessibilityHighContrast378Toggle() {
    val current = BiliClient.prefs.v378accessibilityHighContrast378
    BiliClient.prefs.v378accessibilityHighContrast378 = !current
    AppToast.show(this, "Accessibility High Contrast378: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV378CommentAutoTranslate378Toggle() {
    val current = BiliClient.prefs.v378commentAutoTranslate378
    BiliClient.prefs.v378commentAutoTranslate378 = !current
    AppToast.show(this, "Comment Auto Translate378: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV378ThumbnailPreview378Toggle() {
    val current = BiliClient.prefs.v378thumbnailPreview378
    BiliClient.prefs.v378thumbnailPreview378 = !current
    AppToast.show(this, "Thumbnail Preview378: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV379CaptionAutoDetect379Toggle() {
    val current = BiliClient.prefs.v379captionAutoDetect379
    BiliClient.prefs.v379captionAutoDetect379 = !current
    AppToast.show(this, "Caption Auto Detect379: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV379ChromecastAutoConnect379Toggle() {
    val current = BiliClient.prefs.v379chromecastAutoConnect379
    BiliClient.prefs.v379chromecastAutoConnect379 = !current
    AppToast.show(this, "Chromecast Auto Connect379: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV379FloatingWindowEnabled379Toggle() {
    val current = BiliClient.prefs.v379floatingWindowEnabled379
    BiliClient.prefs.v379floatingWindowEnabled379 = !current
    AppToast.show(this, "Floating Window Enabled379: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV379NfcAutoTransfer379Toggle() {
    val current = BiliClient.prefs.v379nfcAutoTransfer379
    BiliClient.prefs.v379nfcAutoTransfer379 = !current
    AppToast.show(this, "NFC Auto Transfer379: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV379UpdateAutoCheck379Toggle() {
    val current = BiliClient.prefs.v379updateAutoCheck379
    BiliClient.prefs.v379updateAutoCheck379 = !current
    AppToast.show(this, "Update Auto Check379: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV379VrModeEnabled379Toggle() {
    val current = BiliClient.prefs.v379vrModeEnabled379
    BiliClient.prefs.v379vrModeEnabled379 = !current
    AppToast.show(this, "VR Mode Enabled379: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV379AccessibilityHighContrast379Toggle() {
    val current = BiliClient.prefs.v379accessibilityHighContrast379
    BiliClient.prefs.v379accessibilityHighContrast379 = !current
    AppToast.show(this, "Accessibility High Contrast379: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV379CommentAutoTranslate379Toggle() {
    val current = BiliClient.prefs.v379commentAutoTranslate379
    BiliClient.prefs.v379commentAutoTranslate379 = !current
    AppToast.show(this, "Comment Auto Translate379: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV379ThumbnailPreview379Toggle() {
    val current = BiliClient.prefs.v379thumbnailPreview379
    BiliClient.prefs.v379thumbnailPreview379 = !current
    AppToast.show(this, "Thumbnail Preview379: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV380CaptionAutoDetect380Toggle() {
    val current = BiliClient.prefs.v380captionAutoDetect380
    BiliClient.prefs.v380captionAutoDetect380 = !current
    AppToast.show(this, "Caption Auto Detect380: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV380ChromecastAutoConnect380Toggle() {
    val current = BiliClient.prefs.v380chromecastAutoConnect380
    BiliClient.prefs.v380chromecastAutoConnect380 = !current
    AppToast.show(this, "Chromecast Auto Connect380: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV380FloatingWindowEnabled380Toggle() {
    val current = BiliClient.prefs.v380floatingWindowEnabled380
    BiliClient.prefs.v380floatingWindowEnabled380 = !current
    AppToast.show(this, "Floating Window Enabled380: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV380NfcAutoTransfer380Toggle() {
    val current = BiliClient.prefs.v380nfcAutoTransfer380
    BiliClient.prefs.v380nfcAutoTransfer380 = !current
    AppToast.show(this, "NFC Auto Transfer380: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV380UpdateAutoCheck380Toggle() {
    val current = BiliClient.prefs.v380updateAutoCheck380
    BiliClient.prefs.v380updateAutoCheck380 = !current
    AppToast.show(this, "Update Auto Check380: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV380VrModeEnabled380Toggle() {
    val current = BiliClient.prefs.v380vrModeEnabled380
    BiliClient.prefs.v380vrModeEnabled380 = !current
    AppToast.show(this, "VR Mode Enabled380: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV380AccessibilityHighContrast380Toggle() {
    val current = BiliClient.prefs.v380accessibilityHighContrast380
    BiliClient.prefs.v380accessibilityHighContrast380 = !current
    AppToast.show(this, "Accessibility High Contrast380: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV380CommentAutoTranslate380Toggle() {
    val current = BiliClient.prefs.v380commentAutoTranslate380
    BiliClient.prefs.v380commentAutoTranslate380 = !current
    AppToast.show(this, "Comment Auto Translate380: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV380ThumbnailPreview380Toggle() {
    val current = BiliClient.prefs.v380thumbnailPreview380
    BiliClient.prefs.v380thumbnailPreview380 = !current
    AppToast.show(this, "Thumbnail Preview380: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV381GridLayoutAnimation381Toggle() {
    val current = BiliClient.prefs.v381gridLayoutAnimation381
    BiliClient.prefs.v381gridLayoutAnimation381 = !current
    AppToast.show(this, "Grid Layout Animation381: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV381PageAutoLoad381Toggle() {
    val current = BiliClient.prefs.v381pageAutoLoad381
    BiliClient.prefs.v381pageAutoLoad381 = !current
    AppToast.show(this, "Page Auto Load381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV381PanelAutoHide381Toggle() {
    val current = BiliClient.prefs.v381panelAutoHide381
    BiliClient.prefs.v381panelAutoHide381 = !current
    AppToast.show(this, "Panel Auto Hide381: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV381SubListAutoCollapse381Toggle() {
    val current = BiliClient.prefs.v381subListAutoCollapse381
    BiliClient.prefs.v381subListAutoCollapse381 = !current
    AppToast.show(this, "SubList Auto Collapse381: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV381SyncPlayAutoJoin381Toggle() {
    val current = BiliClient.prefs.v381syncPlayAutoJoin381
    BiliClient.prefs.v381syncPlayAutoJoin381 = !current
    AppToast.show(this, "SyncPlay Auto Join381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV381ProxyAutoDetect381Toggle() {
    val current = BiliClient.prefs.v381proxyAutoDetect381
    BiliClient.prefs.v381proxyAutoDetect381 = !current
    AppToast.show(this, "Proxy Auto Detect381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV381QueueAutoSort381Toggle() {
    val current = BiliClient.prefs.v381queueAutoSort381
    BiliClient.prefs.v381queueAutoSort381 = !current
    AppToast.show(this, "Queue Auto Sort381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV381RecordAutoSave381Toggle() {
    val current = BiliClient.prefs.v381recordAutoSave381
    BiliClient.prefs.v381recordAutoSave381 = !current
    AppToast.show(this, "Record Auto Save381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV381ImageEnhanceSharp381Toggle() {
    val current = BiliClient.prefs.v381imageEnhanceSharp381
    BiliClient.prefs.v381imageEnhanceSharp381 = !current
    AppToast.show(this, "Image Enhance Sharp381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV381ImageEnhanceDenoise381Toggle() {
    val current = BiliClient.prefs.v381imageEnhanceDenoise381
    BiliClient.prefs.v381imageEnhanceDenoise381 = !current
    AppToast.show(this, "Image Enhance Denoise381: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV382GridLayoutAnimation382Toggle() {
    val current = BiliClient.prefs.v382gridLayoutAnimation382
    BiliClient.prefs.v382gridLayoutAnimation382 = !current
    AppToast.show(this, "Grid Layout Animation382: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV382PageAutoLoad382Toggle() {
    val current = BiliClient.prefs.v382pageAutoLoad382
    BiliClient.prefs.v382pageAutoLoad382 = !current
    AppToast.show(this, "Page Auto Load382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV382PanelAutoHide382Toggle() {
    val current = BiliClient.prefs.v382panelAutoHide382
    BiliClient.prefs.v382panelAutoHide382 = !current
    AppToast.show(this, "Panel Auto Hide382: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV382SubListAutoCollapse382Toggle() {
    val current = BiliClient.prefs.v382subListAutoCollapse382
    BiliClient.prefs.v382subListAutoCollapse382 = !current
    AppToast.show(this, "SubList Auto Collapse382: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV382SyncPlayAutoJoin382Toggle() {
    val current = BiliClient.prefs.v382syncPlayAutoJoin382
    BiliClient.prefs.v382syncPlayAutoJoin382 = !current
    AppToast.show(this, "SyncPlay Auto Join382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV382ProxyAutoDetect382Toggle() {
    val current = BiliClient.prefs.v382proxyAutoDetect382
    BiliClient.prefs.v382proxyAutoDetect382 = !current
    AppToast.show(this, "Proxy Auto Detect382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV382QueueAutoSort382Toggle() {
    val current = BiliClient.prefs.v382queueAutoSort382
    BiliClient.prefs.v382queueAutoSort382 = !current
    AppToast.show(this, "Queue Auto Sort382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV382RecordAutoSave382Toggle() {
    val current = BiliClient.prefs.v382recordAutoSave382
    BiliClient.prefs.v382recordAutoSave382 = !current
    AppToast.show(this, "Record Auto Save382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV382ImageEnhanceSharp382Toggle() {
    val current = BiliClient.prefs.v382imageEnhanceSharp382
    BiliClient.prefs.v382imageEnhanceSharp382 = !current
    AppToast.show(this, "Image Enhance Sharp382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV382ImageEnhanceDenoise382Toggle() {
    val current = BiliClient.prefs.v382imageEnhanceDenoise382
    BiliClient.prefs.v382imageEnhanceDenoise382 = !current
    AppToast.show(this, "Image Enhance Denoise382: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV383GridLayoutAnimation383Toggle() {
    val current = BiliClient.prefs.v383gridLayoutAnimation383
    BiliClient.prefs.v383gridLayoutAnimation383 = !current
    AppToast.show(this, "Grid Layout Animation383: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV383PageAutoLoad383Toggle() {
    val current = BiliClient.prefs.v383pageAutoLoad383
    BiliClient.prefs.v383pageAutoLoad383 = !current
    AppToast.show(this, "Page Auto Load383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV383PanelAutoHide383Toggle() {
    val current = BiliClient.prefs.v383panelAutoHide383
    BiliClient.prefs.v383panelAutoHide383 = !current
    AppToast.show(this, "Panel Auto Hide383: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV383SubListAutoCollapse383Toggle() {
    val current = BiliClient.prefs.v383subListAutoCollapse383
    BiliClient.prefs.v383subListAutoCollapse383 = !current
    AppToast.show(this, "SubList Auto Collapse383: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV383SyncPlayAutoJoin383Toggle() {
    val current = BiliClient.prefs.v383syncPlayAutoJoin383
    BiliClient.prefs.v383syncPlayAutoJoin383 = !current
    AppToast.show(this, "SyncPlay Auto Join383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV383ProxyAutoDetect383Toggle() {
    val current = BiliClient.prefs.v383proxyAutoDetect383
    BiliClient.prefs.v383proxyAutoDetect383 = !current
    AppToast.show(this, "Proxy Auto Detect383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV383QueueAutoSort383Toggle() {
    val current = BiliClient.prefs.v383queueAutoSort383
    BiliClient.prefs.v383queueAutoSort383 = !current
    AppToast.show(this, "Queue Auto Sort383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV383RecordAutoSave383Toggle() {
    val current = BiliClient.prefs.v383recordAutoSave383
    BiliClient.prefs.v383recordAutoSave383 = !current
    AppToast.show(this, "Record Auto Save383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV383ImageEnhanceSharp383Toggle() {
    val current = BiliClient.prefs.v383imageEnhanceSharp383
    BiliClient.prefs.v383imageEnhanceSharp383 = !current
    AppToast.show(this, "Image Enhance Sharp383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV383ImageEnhanceDenoise383Toggle() {
    val current = BiliClient.prefs.v383imageEnhanceDenoise383
    BiliClient.prefs.v383imageEnhanceDenoise383 = !current
    AppToast.show(this, "Image Enhance Denoise383: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV384GridLayoutAnimation384Toggle() {
    val current = BiliClient.prefs.v384gridLayoutAnimation384
    BiliClient.prefs.v384gridLayoutAnimation384 = !current
    AppToast.show(this, "Grid Layout Animation384: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV384PageAutoLoad384Toggle() {
    val current = BiliClient.prefs.v384pageAutoLoad384
    BiliClient.prefs.v384pageAutoLoad384 = !current
    AppToast.show(this, "Page Auto Load384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV384PanelAutoHide384Toggle() {
    val current = BiliClient.prefs.v384panelAutoHide384
    BiliClient.prefs.v384panelAutoHide384 = !current
    AppToast.show(this, "Panel Auto Hide384: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV384SubListAutoCollapse384Toggle() {
    val current = BiliClient.prefs.v384subListAutoCollapse384
    BiliClient.prefs.v384subListAutoCollapse384 = !current
    AppToast.show(this, "SubList Auto Collapse384: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV384SyncPlayAutoJoin384Toggle() {
    val current = BiliClient.prefs.v384syncPlayAutoJoin384
    BiliClient.prefs.v384syncPlayAutoJoin384 = !current
    AppToast.show(this, "SyncPlay Auto Join384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV384ProxyAutoDetect384Toggle() {
    val current = BiliClient.prefs.v384proxyAutoDetect384
    BiliClient.prefs.v384proxyAutoDetect384 = !current
    AppToast.show(this, "Proxy Auto Detect384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV384QueueAutoSort384Toggle() {
    val current = BiliClient.prefs.v384queueAutoSort384
    BiliClient.prefs.v384queueAutoSort384 = !current
    AppToast.show(this, "Queue Auto Sort384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV384RecordAutoSave384Toggle() {
    val current = BiliClient.prefs.v384recordAutoSave384
    BiliClient.prefs.v384recordAutoSave384 = !current
    AppToast.show(this, "Record Auto Save384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV384ImageEnhanceSharp384Toggle() {
    val current = BiliClient.prefs.v384imageEnhanceSharp384
    BiliClient.prefs.v384imageEnhanceSharp384 = !current
    AppToast.show(this, "Image Enhance Sharp384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV384ImageEnhanceDenoise384Toggle() {
    val current = BiliClient.prefs.v384imageEnhanceDenoise384
    BiliClient.prefs.v384imageEnhanceDenoise384 = !current
    AppToast.show(this, "Image Enhance Denoise384: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV385GridLayoutAnimation385Toggle() {
    val current = BiliClient.prefs.v385gridLayoutAnimation385
    BiliClient.prefs.v385gridLayoutAnimation385 = !current
    AppToast.show(this, "Grid Layout Animation385: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV385PageAutoLoad385Toggle() {
    val current = BiliClient.prefs.v385pageAutoLoad385
    BiliClient.prefs.v385pageAutoLoad385 = !current
    AppToast.show(this, "Page Auto Load385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV385PanelAutoHide385Toggle() {
    val current = BiliClient.prefs.v385panelAutoHide385
    BiliClient.prefs.v385panelAutoHide385 = !current
    AppToast.show(this, "Panel Auto Hide385: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV385SubListAutoCollapse385Toggle() {
    val current = BiliClient.prefs.v385subListAutoCollapse385
    BiliClient.prefs.v385subListAutoCollapse385 = !current
    AppToast.show(this, "SubList Auto Collapse385: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV385SyncPlayAutoJoin385Toggle() {
    val current = BiliClient.prefs.v385syncPlayAutoJoin385
    BiliClient.prefs.v385syncPlayAutoJoin385 = !current
    AppToast.show(this, "SyncPlay Auto Join385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV385ProxyAutoDetect385Toggle() {
    val current = BiliClient.prefs.v385proxyAutoDetect385
    BiliClient.prefs.v385proxyAutoDetect385 = !current
    AppToast.show(this, "Proxy Auto Detect385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV385QueueAutoSort385Toggle() {
    val current = BiliClient.prefs.v385queueAutoSort385
    BiliClient.prefs.v385queueAutoSort385 = !current
    AppToast.show(this, "Queue Auto Sort385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV385RecordAutoSave385Toggle() {
    val current = BiliClient.prefs.v385recordAutoSave385
    BiliClient.prefs.v385recordAutoSave385 = !current
    AppToast.show(this, "Record Auto Save385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV385ImageEnhanceSharp385Toggle() {
    val current = BiliClient.prefs.v385imageEnhanceSharp385
    BiliClient.prefs.v385imageEnhanceSharp385 = !current
    AppToast.show(this, "Image Enhance Sharp385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV385ImageEnhanceDenoise385Toggle() {
    val current = BiliClient.prefs.v385imageEnhanceDenoise385
    BiliClient.prefs.v385imageEnhanceDenoise385 = !current
    AppToast.show(this, "Image Enhance Denoise385: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV386GridLayoutAnimation386Toggle() {
    val current = BiliClient.prefs.v386gridLayoutAnimation386
    BiliClient.prefs.v386gridLayoutAnimation386 = !current
    AppToast.show(this, "Grid Layout Animation386: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV386PageAutoLoad386Toggle() {
    val current = BiliClient.prefs.v386pageAutoLoad386
    BiliClient.prefs.v386pageAutoLoad386 = !current
    AppToast.show(this, "Page Auto Load386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV386PanelAutoHide386Toggle() {
    val current = BiliClient.prefs.v386panelAutoHide386
    BiliClient.prefs.v386panelAutoHide386 = !current
    AppToast.show(this, "Panel Auto Hide386: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV386SubListAutoCollapse386Toggle() {
    val current = BiliClient.prefs.v386subListAutoCollapse386
    BiliClient.prefs.v386subListAutoCollapse386 = !current
    AppToast.show(this, "SubList Auto Collapse386: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV386SyncPlayAutoJoin386Toggle() {
    val current = BiliClient.prefs.v386syncPlayAutoJoin386
    BiliClient.prefs.v386syncPlayAutoJoin386 = !current
    AppToast.show(this, "SyncPlay Auto Join386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV386ProxyAutoDetect386Toggle() {
    val current = BiliClient.prefs.v386proxyAutoDetect386
    BiliClient.prefs.v386proxyAutoDetect386 = !current
    AppToast.show(this, "Proxy Auto Detect386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV386QueueAutoSort386Toggle() {
    val current = BiliClient.prefs.v386queueAutoSort386
    BiliClient.prefs.v386queueAutoSort386 = !current
    AppToast.show(this, "Queue Auto Sort386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV386RecordAutoSave386Toggle() {
    val current = BiliClient.prefs.v386recordAutoSave386
    BiliClient.prefs.v386recordAutoSave386 = !current
    AppToast.show(this, "Record Auto Save386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV386ImageEnhanceSharp386Toggle() {
    val current = BiliClient.prefs.v386imageEnhanceSharp386
    BiliClient.prefs.v386imageEnhanceSharp386 = !current
    AppToast.show(this, "Image Enhance Sharp386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV386ImageEnhanceDenoise386Toggle() {
    val current = BiliClient.prefs.v386imageEnhanceDenoise386
    BiliClient.prefs.v386imageEnhanceDenoise386 = !current
    AppToast.show(this, "Image Enhance Denoise386: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV387GridLayoutAnimation387Toggle() {
    val current = BiliClient.prefs.v387gridLayoutAnimation387
    BiliClient.prefs.v387gridLayoutAnimation387 = !current
    AppToast.show(this, "Grid Layout Animation387: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV387PageAutoLoad387Toggle() {
    val current = BiliClient.prefs.v387pageAutoLoad387
    BiliClient.prefs.v387pageAutoLoad387 = !current
    AppToast.show(this, "Page Auto Load387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV387PanelAutoHide387Toggle() {
    val current = BiliClient.prefs.v387panelAutoHide387
    BiliClient.prefs.v387panelAutoHide387 = !current
    AppToast.show(this, "Panel Auto Hide387: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV387SubListAutoCollapse387Toggle() {
    val current = BiliClient.prefs.v387subListAutoCollapse387
    BiliClient.prefs.v387subListAutoCollapse387 = !current
    AppToast.show(this, "SubList Auto Collapse387: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV387SyncPlayAutoJoin387Toggle() {
    val current = BiliClient.prefs.v387syncPlayAutoJoin387
    BiliClient.prefs.v387syncPlayAutoJoin387 = !current
    AppToast.show(this, "SyncPlay Auto Join387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV387ProxyAutoDetect387Toggle() {
    val current = BiliClient.prefs.v387proxyAutoDetect387
    BiliClient.prefs.v387proxyAutoDetect387 = !current
    AppToast.show(this, "Proxy Auto Detect387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV387QueueAutoSort387Toggle() {
    val current = BiliClient.prefs.v387queueAutoSort387
    BiliClient.prefs.v387queueAutoSort387 = !current
    AppToast.show(this, "Queue Auto Sort387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV387RecordAutoSave387Toggle() {
    val current = BiliClient.prefs.v387recordAutoSave387
    BiliClient.prefs.v387recordAutoSave387 = !current
    AppToast.show(this, "Record Auto Save387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV387ImageEnhanceSharp387Toggle() {
    val current = BiliClient.prefs.v387imageEnhanceSharp387
    BiliClient.prefs.v387imageEnhanceSharp387 = !current
    AppToast.show(this, "Image Enhance Sharp387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV387ImageEnhanceDenoise387Toggle() {
    val current = BiliClient.prefs.v387imageEnhanceDenoise387
    BiliClient.prefs.v387imageEnhanceDenoise387 = !current
    AppToast.show(this, "Image Enhance Denoise387: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV388GridLayoutAnimation388Toggle() {
    val current = BiliClient.prefs.v388gridLayoutAnimation388
    BiliClient.prefs.v388gridLayoutAnimation388 = !current
    AppToast.show(this, "Grid Layout Animation388: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV388PageAutoLoad388Toggle() {
    val current = BiliClient.prefs.v388pageAutoLoad388
    BiliClient.prefs.v388pageAutoLoad388 = !current
    AppToast.show(this, "Page Auto Load388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV388PanelAutoHide388Toggle() {
    val current = BiliClient.prefs.v388panelAutoHide388
    BiliClient.prefs.v388panelAutoHide388 = !current
    AppToast.show(this, "Panel Auto Hide388: ${if (!current) "ON" else "OFF"}")
}

