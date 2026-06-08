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

internal fun PlayerActivity.showV361KeyboardShortcutPlay361Toggle() {
    val current = BiliClient.prefs.v361keyboardShortcutPlay361
    BiliClient.prefs.v361keyboardShortcutPlay361 = !current
    AppToast.show(this, "Keyboard Shortcut Play361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361KeyboardShortcutVolume361Toggle() {
    val current = BiliClient.prefs.v361keyboardShortcutVolume361
    BiliClient.prefs.v361keyboardShortcutVolume361 = !current
    AppToast.show(this, "Keyboard Shortcut Volume361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361VoiceControlEnabled361Toggle() {
    val current = BiliClient.prefs.v361voiceControlEnabled361
    BiliClient.prefs.v361voiceControlEnabled361 = !current
    AppToast.show(this, "Voice Control Enabled361: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV362SleepTimerFadeOut362Toggle() {
    val current = BiliClient.prefs.v362sleepTimerFadeOut362
    BiliClient.prefs.v362sleepTimerFadeOut362 = !current
    AppToast.show(this, "Sleep Timer Fade Out362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362SleepTimerShake362Toggle() {
    val current = BiliClient.prefs.v362sleepTimerShake362
    BiliClient.prefs.v362sleepTimerShake362 = !current
    AppToast.show(this, "Sleep Timer Shake362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362ParentalPinLock362Toggle() {
    val current = BiliClient.prefs.v362parentalPinLock362
    BiliClient.prefs.v362parentalPinLock362 = !current
    AppToast.show(this, "Parental Pin Lock362: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV362ParentalContentFilter362Toggle() {
    val current = BiliClient.prefs.v362parentalContentFilter362
    BiliClient.prefs.v362parentalContentFilter362 = !current
    AppToast.show(this, "Parental Content Filter362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362PrivacyAutoClearHistory362Toggle() {
    val current = BiliClient.prefs.v362privacyAutoClearHistory362
    BiliClient.prefs.v362privacyAutoClearHistory362 = !current
    AppToast.show(this, "Privacy Auto Clear History362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362PrivacyHideWatchRecord362Toggle() {
    val current = BiliClient.prefs.v362privacyHideWatchRecord362
    BiliClient.prefs.v362privacyHideWatchRecord362 = !current
    AppToast.show(this, "Privacy Hide Watch Record362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362PrivacyDisableAnalytics362Toggle() {
    val current = BiliClient.prefs.v362privacyDisableAnalytics362
    BiliClient.prefs.v362privacyDisableAnalytics362 = !current
    AppToast.show(this, "Privacy Disable Analytics362: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV362KeyboardShortcutPlay362Toggle() {
    val current = BiliClient.prefs.v362keyboardShortcutPlay362
    BiliClient.prefs.v362keyboardShortcutPlay362 = !current
    AppToast.show(this, "Keyboard Shortcut Play362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362KeyboardShortcutVolume362Toggle() {
    val current = BiliClient.prefs.v362keyboardShortcutVolume362
    BiliClient.prefs.v362keyboardShortcutVolume362 = !current
    AppToast.show(this, "Keyboard Shortcut Volume362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV362VoiceControlEnabled362Toggle() {
    val current = BiliClient.prefs.v362voiceControlEnabled362
    BiliClient.prefs.v362voiceControlEnabled362 = !current
    AppToast.show(this, "Voice Control Enabled362: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV363SleepTimerFadeOut363Toggle() {
    val current = BiliClient.prefs.v363sleepTimerFadeOut363
    BiliClient.prefs.v363sleepTimerFadeOut363 = !current
    AppToast.show(this, "Sleep Timer Fade Out363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363SleepTimerShake363Toggle() {
    val current = BiliClient.prefs.v363sleepTimerShake363
    BiliClient.prefs.v363sleepTimerShake363 = !current
    AppToast.show(this, "Sleep Timer Shake363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363ParentalPinLock363Toggle() {
    val current = BiliClient.prefs.v363parentalPinLock363
    BiliClient.prefs.v363parentalPinLock363 = !current
    AppToast.show(this, "Parental Pin Lock363: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV363ParentalContentFilter363Toggle() {
    val current = BiliClient.prefs.v363parentalContentFilter363
    BiliClient.prefs.v363parentalContentFilter363 = !current
    AppToast.show(this, "Parental Content Filter363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363PrivacyAutoClearHistory363Toggle() {
    val current = BiliClient.prefs.v363privacyAutoClearHistory363
    BiliClient.prefs.v363privacyAutoClearHistory363 = !current
    AppToast.show(this, "Privacy Auto Clear History363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363PrivacyHideWatchRecord363Toggle() {
    val current = BiliClient.prefs.v363privacyHideWatchRecord363
    BiliClient.prefs.v363privacyHideWatchRecord363 = !current
    AppToast.show(this, "Privacy Hide Watch Record363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363PrivacyDisableAnalytics363Toggle() {
    val current = BiliClient.prefs.v363privacyDisableAnalytics363
    BiliClient.prefs.v363privacyDisableAnalytics363 = !current
    AppToast.show(this, "Privacy Disable Analytics363: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV363KeyboardShortcutPlay363Toggle() {
    val current = BiliClient.prefs.v363keyboardShortcutPlay363
    BiliClient.prefs.v363keyboardShortcutPlay363 = !current
    AppToast.show(this, "Keyboard Shortcut Play363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363KeyboardShortcutVolume363Toggle() {
    val current = BiliClient.prefs.v363keyboardShortcutVolume363
    BiliClient.prefs.v363keyboardShortcutVolume363 = !current
    AppToast.show(this, "Keyboard Shortcut Volume363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV363VoiceControlEnabled363Toggle() {
    val current = BiliClient.prefs.v363voiceControlEnabled363
    BiliClient.prefs.v363voiceControlEnabled363 = !current
    AppToast.show(this, "Voice Control Enabled363: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV364SleepTimerFadeOut364Toggle() {
    val current = BiliClient.prefs.v364sleepTimerFadeOut364
    BiliClient.prefs.v364sleepTimerFadeOut364 = !current
    AppToast.show(this, "Sleep Timer Fade Out364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364SleepTimerShake364Toggle() {
    val current = BiliClient.prefs.v364sleepTimerShake364
    BiliClient.prefs.v364sleepTimerShake364 = !current
    AppToast.show(this, "Sleep Timer Shake364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364ParentalPinLock364Toggle() {
    val current = BiliClient.prefs.v364parentalPinLock364
    BiliClient.prefs.v364parentalPinLock364 = !current
    AppToast.show(this, "Parental Pin Lock364: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV364ParentalContentFilter364Toggle() {
    val current = BiliClient.prefs.v364parentalContentFilter364
    BiliClient.prefs.v364parentalContentFilter364 = !current
    AppToast.show(this, "Parental Content Filter364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364PrivacyAutoClearHistory364Toggle() {
    val current = BiliClient.prefs.v364privacyAutoClearHistory364
    BiliClient.prefs.v364privacyAutoClearHistory364 = !current
    AppToast.show(this, "Privacy Auto Clear History364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364PrivacyHideWatchRecord364Toggle() {
    val current = BiliClient.prefs.v364privacyHideWatchRecord364
    BiliClient.prefs.v364privacyHideWatchRecord364 = !current
    AppToast.show(this, "Privacy Hide Watch Record364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364PrivacyDisableAnalytics364Toggle() {
    val current = BiliClient.prefs.v364privacyDisableAnalytics364
    BiliClient.prefs.v364privacyDisableAnalytics364 = !current
    AppToast.show(this, "Privacy Disable Analytics364: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV364KeyboardShortcutPlay364Toggle() {
    val current = BiliClient.prefs.v364keyboardShortcutPlay364
    BiliClient.prefs.v364keyboardShortcutPlay364 = !current
    AppToast.show(this, "Keyboard Shortcut Play364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364KeyboardShortcutVolume364Toggle() {
    val current = BiliClient.prefs.v364keyboardShortcutVolume364
    BiliClient.prefs.v364keyboardShortcutVolume364 = !current
    AppToast.show(this, "Keyboard Shortcut Volume364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV364VoiceControlEnabled364Toggle() {
    val current = BiliClient.prefs.v364voiceControlEnabled364
    BiliClient.prefs.v364voiceControlEnabled364 = !current
    AppToast.show(this, "Voice Control Enabled364: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV365SleepTimerFadeOut365Toggle() {
    val current = BiliClient.prefs.v365sleepTimerFadeOut365
    BiliClient.prefs.v365sleepTimerFadeOut365 = !current
    AppToast.show(this, "Sleep Timer Fade Out365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365SleepTimerShake365Toggle() {
    val current = BiliClient.prefs.v365sleepTimerShake365
    BiliClient.prefs.v365sleepTimerShake365 = !current
    AppToast.show(this, "Sleep Timer Shake365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365ParentalPinLock365Toggle() {
    val current = BiliClient.prefs.v365parentalPinLock365
    BiliClient.prefs.v365parentalPinLock365 = !current
    AppToast.show(this, "Parental Pin Lock365: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV365ParentalContentFilter365Toggle() {
    val current = BiliClient.prefs.v365parentalContentFilter365
    BiliClient.prefs.v365parentalContentFilter365 = !current
    AppToast.show(this, "Parental Content Filter365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365PrivacyAutoClearHistory365Toggle() {
    val current = BiliClient.prefs.v365privacyAutoClearHistory365
    BiliClient.prefs.v365privacyAutoClearHistory365 = !current
    AppToast.show(this, "Privacy Auto Clear History365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365PrivacyHideWatchRecord365Toggle() {
    val current = BiliClient.prefs.v365privacyHideWatchRecord365
    BiliClient.prefs.v365privacyHideWatchRecord365 = !current
    AppToast.show(this, "Privacy Hide Watch Record365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365PrivacyDisableAnalytics365Toggle() {
    val current = BiliClient.prefs.v365privacyDisableAnalytics365
    BiliClient.prefs.v365privacyDisableAnalytics365 = !current
    AppToast.show(this, "Privacy Disable Analytics365: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV365KeyboardShortcutPlay365Toggle() {
    val current = BiliClient.prefs.v365keyboardShortcutPlay365
    BiliClient.prefs.v365keyboardShortcutPlay365 = !current
    AppToast.show(this, "Keyboard Shortcut Play365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365KeyboardShortcutVolume365Toggle() {
    val current = BiliClient.prefs.v365keyboardShortcutVolume365
    BiliClient.prefs.v365keyboardShortcutVolume365 = !current
    AppToast.show(this, "Keyboard Shortcut Volume365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV365VoiceControlEnabled365Toggle() {
    val current = BiliClient.prefs.v365voiceControlEnabled365
    BiliClient.prefs.v365voiceControlEnabled365 = !current
    AppToast.show(this, "Voice Control Enabled365: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV366SleepTimerFadeOut366Toggle() {
    val current = BiliClient.prefs.v366sleepTimerFadeOut366
    BiliClient.prefs.v366sleepTimerFadeOut366 = !current
    AppToast.show(this, "Sleep Timer Fade Out366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366SleepTimerShake366Toggle() {
    val current = BiliClient.prefs.v366sleepTimerShake366
    BiliClient.prefs.v366sleepTimerShake366 = !current
    AppToast.show(this, "Sleep Timer Shake366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366ParentalPinLock366Toggle() {
    val current = BiliClient.prefs.v366parentalPinLock366
    BiliClient.prefs.v366parentalPinLock366 = !current
    AppToast.show(this, "Parental Pin Lock366: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV366ParentalContentFilter366Toggle() {
    val current = BiliClient.prefs.v366parentalContentFilter366
    BiliClient.prefs.v366parentalContentFilter366 = !current
    AppToast.show(this, "Parental Content Filter366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366PrivacyAutoClearHistory366Toggle() {
    val current = BiliClient.prefs.v366privacyAutoClearHistory366
    BiliClient.prefs.v366privacyAutoClearHistory366 = !current
    AppToast.show(this, "Privacy Auto Clear History366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366PrivacyHideWatchRecord366Toggle() {
    val current = BiliClient.prefs.v366privacyHideWatchRecord366
    BiliClient.prefs.v366privacyHideWatchRecord366 = !current
    AppToast.show(this, "Privacy Hide Watch Record366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366PrivacyDisableAnalytics366Toggle() {
    val current = BiliClient.prefs.v366privacyDisableAnalytics366
    BiliClient.prefs.v366privacyDisableAnalytics366 = !current
    AppToast.show(this, "Privacy Disable Analytics366: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV366KeyboardShortcutPlay366Toggle() {
    val current = BiliClient.prefs.v366keyboardShortcutPlay366
    BiliClient.prefs.v366keyboardShortcutPlay366 = !current
    AppToast.show(this, "Keyboard Shortcut Play366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366KeyboardShortcutVolume366Toggle() {
    val current = BiliClient.prefs.v366keyboardShortcutVolume366
    BiliClient.prefs.v366keyboardShortcutVolume366 = !current
    AppToast.show(this, "Keyboard Shortcut Volume366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV366VoiceControlEnabled366Toggle() {
    val current = BiliClient.prefs.v366voiceControlEnabled366
    BiliClient.prefs.v366voiceControlEnabled366 = !current
    AppToast.show(this, "Voice Control Enabled366: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV367SleepTimerFadeOut367Toggle() {
    val current = BiliClient.prefs.v367sleepTimerFadeOut367
    BiliClient.prefs.v367sleepTimerFadeOut367 = !current
    AppToast.show(this, "Sleep Timer Fade Out367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367SleepTimerShake367Toggle() {
    val current = BiliClient.prefs.v367sleepTimerShake367
    BiliClient.prefs.v367sleepTimerShake367 = !current
    AppToast.show(this, "Sleep Timer Shake367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367ParentalPinLock367Toggle() {
    val current = BiliClient.prefs.v367parentalPinLock367
    BiliClient.prefs.v367parentalPinLock367 = !current
    AppToast.show(this, "Parental Pin Lock367: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV367ParentalContentFilter367Toggle() {
    val current = BiliClient.prefs.v367parentalContentFilter367
    BiliClient.prefs.v367parentalContentFilter367 = !current
    AppToast.show(this, "Parental Content Filter367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367PrivacyAutoClearHistory367Toggle() {
    val current = BiliClient.prefs.v367privacyAutoClearHistory367
    BiliClient.prefs.v367privacyAutoClearHistory367 = !current
    AppToast.show(this, "Privacy Auto Clear History367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367PrivacyHideWatchRecord367Toggle() {
    val current = BiliClient.prefs.v367privacyHideWatchRecord367
    BiliClient.prefs.v367privacyHideWatchRecord367 = !current
    AppToast.show(this, "Privacy Hide Watch Record367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367PrivacyDisableAnalytics367Toggle() {
    val current = BiliClient.prefs.v367privacyDisableAnalytics367
    BiliClient.prefs.v367privacyDisableAnalytics367 = !current
    AppToast.show(this, "Privacy Disable Analytics367: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV367KeyboardShortcutPlay367Toggle() {
    val current = BiliClient.prefs.v367keyboardShortcutPlay367
    BiliClient.prefs.v367keyboardShortcutPlay367 = !current
    AppToast.show(this, "Keyboard Shortcut Play367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367KeyboardShortcutVolume367Toggle() {
    val current = BiliClient.prefs.v367keyboardShortcutVolume367
    BiliClient.prefs.v367keyboardShortcutVolume367 = !current
    AppToast.show(this, "Keyboard Shortcut Volume367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV367VoiceControlEnabled367Toggle() {
    val current = BiliClient.prefs.v367voiceControlEnabled367
    BiliClient.prefs.v367voiceControlEnabled367 = !current
    AppToast.show(this, "Voice Control Enabled367: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV368SleepTimerFadeOut368Toggle() {
    val current = BiliClient.prefs.v368sleepTimerFadeOut368
    BiliClient.prefs.v368sleepTimerFadeOut368 = !current
    AppToast.show(this, "Sleep Timer Fade Out368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368SleepTimerShake368Toggle() {
    val current = BiliClient.prefs.v368sleepTimerShake368
    BiliClient.prefs.v368sleepTimerShake368 = !current
    AppToast.show(this, "Sleep Timer Shake368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368ParentalPinLock368Toggle() {
    val current = BiliClient.prefs.v368parentalPinLock368
    BiliClient.prefs.v368parentalPinLock368 = !current
    AppToast.show(this, "Parental Pin Lock368: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV368ParentalContentFilter368Toggle() {
    val current = BiliClient.prefs.v368parentalContentFilter368
    BiliClient.prefs.v368parentalContentFilter368 = !current
    AppToast.show(this, "Parental Content Filter368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368PrivacyAutoClearHistory368Toggle() {
    val current = BiliClient.prefs.v368privacyAutoClearHistory368
    BiliClient.prefs.v368privacyAutoClearHistory368 = !current
    AppToast.show(this, "Privacy Auto Clear History368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368PrivacyHideWatchRecord368Toggle() {
    val current = BiliClient.prefs.v368privacyHideWatchRecord368
    BiliClient.prefs.v368privacyHideWatchRecord368 = !current
    AppToast.show(this, "Privacy Hide Watch Record368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368PrivacyDisableAnalytics368Toggle() {
    val current = BiliClient.prefs.v368privacyDisableAnalytics368
    BiliClient.prefs.v368privacyDisableAnalytics368 = !current
    AppToast.show(this, "Privacy Disable Analytics368: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV368KeyboardShortcutPlay368Toggle() {
    val current = BiliClient.prefs.v368keyboardShortcutPlay368
    BiliClient.prefs.v368keyboardShortcutPlay368 = !current
    AppToast.show(this, "Keyboard Shortcut Play368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368KeyboardShortcutVolume368Toggle() {
    val current = BiliClient.prefs.v368keyboardShortcutVolume368
    BiliClient.prefs.v368keyboardShortcutVolume368 = !current
    AppToast.show(this, "Keyboard Shortcut Volume368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV368VoiceControlEnabled368Toggle() {
    val current = BiliClient.prefs.v368voiceControlEnabled368
    BiliClient.prefs.v368voiceControlEnabled368 = !current
    AppToast.show(this, "Voice Control Enabled368: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV369SleepTimerFadeOut369Toggle() {
    val current = BiliClient.prefs.v369sleepTimerFadeOut369
    BiliClient.prefs.v369sleepTimerFadeOut369 = !current
    AppToast.show(this, "Sleep Timer Fade Out369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369SleepTimerShake369Toggle() {
    val current = BiliClient.prefs.v369sleepTimerShake369
    BiliClient.prefs.v369sleepTimerShake369 = !current
    AppToast.show(this, "Sleep Timer Shake369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369ParentalPinLock369Toggle() {
    val current = BiliClient.prefs.v369parentalPinLock369
    BiliClient.prefs.v369parentalPinLock369 = !current
    AppToast.show(this, "Parental Pin Lock369: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV369ParentalContentFilter369Toggle() {
    val current = BiliClient.prefs.v369parentalContentFilter369
    BiliClient.prefs.v369parentalContentFilter369 = !current
    AppToast.show(this, "Parental Content Filter369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369PrivacyAutoClearHistory369Toggle() {
    val current = BiliClient.prefs.v369privacyAutoClearHistory369
    BiliClient.prefs.v369privacyAutoClearHistory369 = !current
    AppToast.show(this, "Privacy Auto Clear History369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369PrivacyHideWatchRecord369Toggle() {
    val current = BiliClient.prefs.v369privacyHideWatchRecord369
    BiliClient.prefs.v369privacyHideWatchRecord369 = !current
    AppToast.show(this, "Privacy Hide Watch Record369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369PrivacyDisableAnalytics369Toggle() {
    val current = BiliClient.prefs.v369privacyDisableAnalytics369
    BiliClient.prefs.v369privacyDisableAnalytics369 = !current
    AppToast.show(this, "Privacy Disable Analytics369: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV369KeyboardShortcutPlay369Toggle() {
    val current = BiliClient.prefs.v369keyboardShortcutPlay369
    BiliClient.prefs.v369keyboardShortcutPlay369 = !current
    AppToast.show(this, "Keyboard Shortcut Play369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369KeyboardShortcutVolume369Toggle() {
    val current = BiliClient.prefs.v369keyboardShortcutVolume369
    BiliClient.prefs.v369keyboardShortcutVolume369 = !current
    AppToast.show(this, "Keyboard Shortcut Volume369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV369VoiceControlEnabled369Toggle() {
    val current = BiliClient.prefs.v369voiceControlEnabled369
    BiliClient.prefs.v369voiceControlEnabled369 = !current
    AppToast.show(this, "Voice Control Enabled369: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV370SleepTimerFadeOut370Toggle() {
    val current = BiliClient.prefs.v370sleepTimerFadeOut370
    BiliClient.prefs.v370sleepTimerFadeOut370 = !current
    AppToast.show(this, "Sleep Timer Fade Out370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370SleepTimerShake370Toggle() {
    val current = BiliClient.prefs.v370sleepTimerShake370
    BiliClient.prefs.v370sleepTimerShake370 = !current
    AppToast.show(this, "Sleep Timer Shake370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370ParentalPinLock370Toggle() {
    val current = BiliClient.prefs.v370parentalPinLock370
    BiliClient.prefs.v370parentalPinLock370 = !current
    AppToast.show(this, "Parental Pin Lock370: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV370ParentalContentFilter370Toggle() {
    val current = BiliClient.prefs.v370parentalContentFilter370
    BiliClient.prefs.v370parentalContentFilter370 = !current
    AppToast.show(this, "Parental Content Filter370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370PrivacyAutoClearHistory370Toggle() {
    val current = BiliClient.prefs.v370privacyAutoClearHistory370
    BiliClient.prefs.v370privacyAutoClearHistory370 = !current
    AppToast.show(this, "Privacy Auto Clear History370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370PrivacyHideWatchRecord370Toggle() {
    val current = BiliClient.prefs.v370privacyHideWatchRecord370
    BiliClient.prefs.v370privacyHideWatchRecord370 = !current
    AppToast.show(this, "Privacy Hide Watch Record370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370PrivacyDisableAnalytics370Toggle() {
    val current = BiliClient.prefs.v370privacyDisableAnalytics370
    BiliClient.prefs.v370privacyDisableAnalytics370 = !current
    AppToast.show(this, "Privacy Disable Analytics370: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV370KeyboardShortcutPlay370Toggle() {
    val current = BiliClient.prefs.v370keyboardShortcutPlay370
    BiliClient.prefs.v370keyboardShortcutPlay370 = !current
    AppToast.show(this, "Keyboard Shortcut Play370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370KeyboardShortcutVolume370Toggle() {
    val current = BiliClient.prefs.v370keyboardShortcutVolume370
    BiliClient.prefs.v370keyboardShortcutVolume370 = !current
    AppToast.show(this, "Keyboard Shortcut Volume370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV370VoiceControlEnabled370Toggle() {
    val current = BiliClient.prefs.v370voiceControlEnabled370
    BiliClient.prefs.v370voiceControlEnabled370 = !current
    AppToast.show(this, "Voice Control Enabled370: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV371CaptionAutoDetect371Toggle() {
    val current = BiliClient.prefs.v371captionAutoDetect371
    BiliClient.prefs.v371captionAutoDetect371 = !current
    AppToast.show(this, "Caption Auto Detect371: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV371ChromecastAutoConnect371Toggle() {
    val current = BiliClient.prefs.v371chromecastAutoConnect371
    BiliClient.prefs.v371chromecastAutoConnect371 = !current
    AppToast.show(this, "Chromecast Auto Connect371: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV371FloatingWindowEnabled371Toggle() {
    val current = BiliClient.prefs.v371floatingWindowEnabled371
    BiliClient.prefs.v371floatingWindowEnabled371 = !current
    AppToast.show(this, "Floating Window Enabled371: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV371NfcAutoTransfer371Toggle() {
    val current = BiliClient.prefs.v371nfcAutoTransfer371
    BiliClient.prefs.v371nfcAutoTransfer371 = !current
    AppToast.show(this, "NFC Auto Transfer371: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV371UpdateAutoCheck371Toggle() {
    val current = BiliClient.prefs.v371updateAutoCheck371
    BiliClient.prefs.v371updateAutoCheck371 = !current
    AppToast.show(this, "Update Auto Check371: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV371VrModeEnabled371Toggle() {
    val current = BiliClient.prefs.v371vrModeEnabled371
    BiliClient.prefs.v371vrModeEnabled371 = !current
    AppToast.show(this, "VR Mode Enabled371: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV371AccessibilityHighContrast371Toggle() {
    val current = BiliClient.prefs.v371accessibilityHighContrast371
    BiliClient.prefs.v371accessibilityHighContrast371 = !current
    AppToast.show(this, "Accessibility High Contrast371: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV371CommentAutoTranslate371Toggle() {
    val current = BiliClient.prefs.v371commentAutoTranslate371
    BiliClient.prefs.v371commentAutoTranslate371 = !current
    AppToast.show(this, "Comment Auto Translate371: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV371ThumbnailPreview371Toggle() {
    val current = BiliClient.prefs.v371thumbnailPreview371
    BiliClient.prefs.v371thumbnailPreview371 = !current
    AppToast.show(this, "Thumbnail Preview371: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV372CaptionAutoDetect372Toggle() {
    val current = BiliClient.prefs.v372captionAutoDetect372
    BiliClient.prefs.v372captionAutoDetect372 = !current
    AppToast.show(this, "Caption Auto Detect372: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV372ChromecastAutoConnect372Toggle() {
    val current = BiliClient.prefs.v372chromecastAutoConnect372
    BiliClient.prefs.v372chromecastAutoConnect372 = !current
    AppToast.show(this, "Chromecast Auto Connect372: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV372FloatingWindowEnabled372Toggle() {
    val current = BiliClient.prefs.v372floatingWindowEnabled372
    BiliClient.prefs.v372floatingWindowEnabled372 = !current
    AppToast.show(this, "Floating Window Enabled372: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV372NfcAutoTransfer372Toggle() {
    val current = BiliClient.prefs.v372nfcAutoTransfer372
    BiliClient.prefs.v372nfcAutoTransfer372 = !current
    AppToast.show(this, "NFC Auto Transfer372: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV372UpdateAutoCheck372Toggle() {
    val current = BiliClient.prefs.v372updateAutoCheck372
    BiliClient.prefs.v372updateAutoCheck372 = !current
    AppToast.show(this, "Update Auto Check372: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV372VrModeEnabled372Toggle() {
    val current = BiliClient.prefs.v372vrModeEnabled372
    BiliClient.prefs.v372vrModeEnabled372 = !current
    AppToast.show(this, "VR Mode Enabled372: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV372AccessibilityHighContrast372Toggle() {
    val current = BiliClient.prefs.v372accessibilityHighContrast372
    BiliClient.prefs.v372accessibilityHighContrast372 = !current
    AppToast.show(this, "Accessibility High Contrast372: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV372CommentAutoTranslate372Toggle() {
    val current = BiliClient.prefs.v372commentAutoTranslate372
    BiliClient.prefs.v372commentAutoTranslate372 = !current
    AppToast.show(this, "Comment Auto Translate372: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV372ThumbnailPreview372Toggle() {
    val current = BiliClient.prefs.v372thumbnailPreview372
    BiliClient.prefs.v372thumbnailPreview372 = !current
    AppToast.show(this, "Thumbnail Preview372: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV373CaptionAutoDetect373Toggle() {
    val current = BiliClient.prefs.v373captionAutoDetect373
    BiliClient.prefs.v373captionAutoDetect373 = !current
    AppToast.show(this, "Caption Auto Detect373: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV373ChromecastAutoConnect373Toggle() {
    val current = BiliClient.prefs.v373chromecastAutoConnect373
    BiliClient.prefs.v373chromecastAutoConnect373 = !current
    AppToast.show(this, "Chromecast Auto Connect373: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV373FloatingWindowEnabled373Toggle() {
    val current = BiliClient.prefs.v373floatingWindowEnabled373
    BiliClient.prefs.v373floatingWindowEnabled373 = !current
    AppToast.show(this, "Floating Window Enabled373: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV373NfcAutoTransfer373Toggle() {
    val current = BiliClient.prefs.v373nfcAutoTransfer373
    BiliClient.prefs.v373nfcAutoTransfer373 = !current
    AppToast.show(this, "NFC Auto Transfer373: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV373UpdateAutoCheck373Toggle() {
    val current = BiliClient.prefs.v373updateAutoCheck373
    BiliClient.prefs.v373updateAutoCheck373 = !current
    AppToast.show(this, "Update Auto Check373: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV373VrModeEnabled373Toggle() {
    val current = BiliClient.prefs.v373vrModeEnabled373
    BiliClient.prefs.v373vrModeEnabled373 = !current
    AppToast.show(this, "VR Mode Enabled373: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV373AccessibilityHighContrast373Toggle() {
    val current = BiliClient.prefs.v373accessibilityHighContrast373
    BiliClient.prefs.v373accessibilityHighContrast373 = !current
    AppToast.show(this, "Accessibility High Contrast373: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV373CommentAutoTranslate373Toggle() {
    val current = BiliClient.prefs.v373commentAutoTranslate373
    BiliClient.prefs.v373commentAutoTranslate373 = !current
    AppToast.show(this, "Comment Auto Translate373: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV373ThumbnailPreview373Toggle() {
    val current = BiliClient.prefs.v373thumbnailPreview373
    BiliClient.prefs.v373thumbnailPreview373 = !current
    AppToast.show(this, "Thumbnail Preview373: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV374CaptionAutoDetect374Toggle() {
    val current = BiliClient.prefs.v374captionAutoDetect374
    BiliClient.prefs.v374captionAutoDetect374 = !current
    AppToast.show(this, "Caption Auto Detect374: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV374ChromecastAutoConnect374Toggle() {
    val current = BiliClient.prefs.v374chromecastAutoConnect374
    BiliClient.prefs.v374chromecastAutoConnect374 = !current
    AppToast.show(this, "Chromecast Auto Connect374: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV374FloatingWindowEnabled374Toggle() {
    val current = BiliClient.prefs.v374floatingWindowEnabled374
    BiliClient.prefs.v374floatingWindowEnabled374 = !current
    AppToast.show(this, "Floating Window Enabled374: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV374NfcAutoTransfer374Toggle() {
    val current = BiliClient.prefs.v374nfcAutoTransfer374
    BiliClient.prefs.v374nfcAutoTransfer374 = !current
    AppToast.show(this, "NFC Auto Transfer374: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV374UpdateAutoCheck374Toggle() {
    val current = BiliClient.prefs.v374updateAutoCheck374
    BiliClient.prefs.v374updateAutoCheck374 = !current
    AppToast.show(this, "Update Auto Check374: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV374VrModeEnabled374Toggle() {
    val current = BiliClient.prefs.v374vrModeEnabled374
    BiliClient.prefs.v374vrModeEnabled374 = !current
    AppToast.show(this, "VR Mode Enabled374: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV374AccessibilityHighContrast374Toggle() {
    val current = BiliClient.prefs.v374accessibilityHighContrast374
    BiliClient.prefs.v374accessibilityHighContrast374 = !current
    AppToast.show(this, "Accessibility High Contrast374: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV374CommentAutoTranslate374Toggle() {
    val current = BiliClient.prefs.v374commentAutoTranslate374
    BiliClient.prefs.v374commentAutoTranslate374 = !current
    AppToast.show(this, "Comment Auto Translate374: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV374ThumbnailPreview374Toggle() {
    val current = BiliClient.prefs.v374thumbnailPreview374
    BiliClient.prefs.v374thumbnailPreview374 = !current
    AppToast.show(this, "Thumbnail Preview374: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV375CaptionAutoDetect375Toggle() {
    val current = BiliClient.prefs.v375captionAutoDetect375
    BiliClient.prefs.v375captionAutoDetect375 = !current
    AppToast.show(this, "Caption Auto Detect375: ${if (!current) "ON" else "OFF"}")
}

