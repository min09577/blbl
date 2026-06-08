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

