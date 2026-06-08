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

internal fun PlayerActivity.showV681DiffAutoHighlight681Toggle() {
    val current = BiliClient.prefs.v681diffAutoHighlight681
    BiliClient.prefs.v681diffAutoHighlight681 = !current
    AppToast.show(this, "Diff Auto Highlight681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DigestAutoCheck681Toggle() {
    val current = BiliClient.prefs.v681digestAutoCheck681
    BiliClient.prefs.v681digestAutoCheck681 = !current
    AppToast.show(this, "Digest Auto Check681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DigitalAutoSign681Toggle() {
    val current = BiliClient.prefs.v681digitalAutoSign681
    BiliClient.prefs.v681digitalAutoSign681 = !current
    AppToast.show(this, "Digital Auto Sign681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV681DirectAutoRoute681Toggle() {
    val current = BiliClient.prefs.v681directAutoRoute681
    BiliClient.prefs.v681directAutoRoute681 = !current
    AppToast.show(this, "Direct Auto Route681: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DeleteAutoConfirm682Toggle() {
    val current = BiliClient.prefs.v682deleteAutoConfirm682
    BiliClient.prefs.v682deleteAutoConfirm682 = !current
    AppToast.show(this, "Delete Auto Confirm682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DeltaAutoUpdate682Toggle() {
    val current = BiliClient.prefs.v682deltaAutoUpdate682
    BiliClient.prefs.v682deltaAutoUpdate682 = !current
    AppToast.show(this, "Delta Auto Update682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DemoAutoPlay682Toggle() {
    val current = BiliClient.prefs.v682demoAutoPlay682
    BiliClient.prefs.v682demoAutoPlay682 = !current
    AppToast.show(this, "Demo Auto Play682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DeployAutoPush682Toggle() {
    val current = BiliClient.prefs.v682deployAutoPush682
    BiliClient.prefs.v682deployAutoPush682 = !current
    AppToast.show(this, "Deploy Auto Push682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DepthAutoMap682Toggle() {
    val current = BiliClient.prefs.v682depthAutoMap682
    BiliClient.prefs.v682depthAutoMap682 = !current
    AppToast.show(this, "Depth Auto Map682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DeriveAutoCalc682Toggle() {
    val current = BiliClient.prefs.v682deriveAutoCalc682
    BiliClient.prefs.v682deriveAutoCalc682 = !current
    AppToast.show(this, "Derive Auto Calc682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DesignAutoToken682Toggle() {
    val current = BiliClient.prefs.v682designAutoToken682
    BiliClient.prefs.v682designAutoToken682 = !current
    AppToast.show(this, "Design Auto Token682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DesktopAutoMode682Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v682desktopAutoMode682).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode682",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v682desktopAutoMode682 = value
        AppToast.show(this, "Desktop Auto Mode682: $value")
    }
}

internal fun PlayerActivity.showV682DetectAutoMotion682Toggle() {
    val current = BiliClient.prefs.v682detectAutoMotion682
    BiliClient.prefs.v682detectAutoMotion682 = !current
    AppToast.show(this, "Detect Auto Motion682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DeviceAutoPair682Toggle() {
    val current = BiliClient.prefs.v682deviceAutoPair682
    BiliClient.prefs.v682deviceAutoPair682 = !current
    AppToast.show(this, "Device Auto Pair682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DialogAutoTheme682Toggle() {
    val current = BiliClient.prefs.v682dialogAutoTheme682
    BiliClient.prefs.v682dialogAutoTheme682 = !current
    AppToast.show(this, "Dialog Auto Theme682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DiffAutoHighlight682Toggle() {
    val current = BiliClient.prefs.v682diffAutoHighlight682
    BiliClient.prefs.v682diffAutoHighlight682 = !current
    AppToast.show(this, "Diff Auto Highlight682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DigestAutoCheck682Toggle() {
    val current = BiliClient.prefs.v682digestAutoCheck682
    BiliClient.prefs.v682digestAutoCheck682 = !current
    AppToast.show(this, "Digest Auto Check682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DigitalAutoSign682Toggle() {
    val current = BiliClient.prefs.v682digitalAutoSign682
    BiliClient.prefs.v682digitalAutoSign682 = !current
    AppToast.show(this, "Digital Auto Sign682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV682DirectAutoRoute682Toggle() {
    val current = BiliClient.prefs.v682directAutoRoute682
    BiliClient.prefs.v682directAutoRoute682 = !current
    AppToast.show(this, "Direct Auto Route682: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DeleteAutoConfirm683Toggle() {
    val current = BiliClient.prefs.v683deleteAutoConfirm683
    BiliClient.prefs.v683deleteAutoConfirm683 = !current
    AppToast.show(this, "Delete Auto Confirm683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DeltaAutoUpdate683Toggle() {
    val current = BiliClient.prefs.v683deltaAutoUpdate683
    BiliClient.prefs.v683deltaAutoUpdate683 = !current
    AppToast.show(this, "Delta Auto Update683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DemoAutoPlay683Toggle() {
    val current = BiliClient.prefs.v683demoAutoPlay683
    BiliClient.prefs.v683demoAutoPlay683 = !current
    AppToast.show(this, "Demo Auto Play683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DeployAutoPush683Toggle() {
    val current = BiliClient.prefs.v683deployAutoPush683
    BiliClient.prefs.v683deployAutoPush683 = !current
    AppToast.show(this, "Deploy Auto Push683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DepthAutoMap683Toggle() {
    val current = BiliClient.prefs.v683depthAutoMap683
    BiliClient.prefs.v683depthAutoMap683 = !current
    AppToast.show(this, "Depth Auto Map683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DeriveAutoCalc683Toggle() {
    val current = BiliClient.prefs.v683deriveAutoCalc683
    BiliClient.prefs.v683deriveAutoCalc683 = !current
    AppToast.show(this, "Derive Auto Calc683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DesignAutoToken683Toggle() {
    val current = BiliClient.prefs.v683designAutoToken683
    BiliClient.prefs.v683designAutoToken683 = !current
    AppToast.show(this, "Design Auto Token683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DesktopAutoMode683Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v683desktopAutoMode683).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode683",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v683desktopAutoMode683 = value
        AppToast.show(this, "Desktop Auto Mode683: $value")
    }
}

internal fun PlayerActivity.showV683DetectAutoMotion683Toggle() {
    val current = BiliClient.prefs.v683detectAutoMotion683
    BiliClient.prefs.v683detectAutoMotion683 = !current
    AppToast.show(this, "Detect Auto Motion683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DeviceAutoPair683Toggle() {
    val current = BiliClient.prefs.v683deviceAutoPair683
    BiliClient.prefs.v683deviceAutoPair683 = !current
    AppToast.show(this, "Device Auto Pair683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DialogAutoTheme683Toggle() {
    val current = BiliClient.prefs.v683dialogAutoTheme683
    BiliClient.prefs.v683dialogAutoTheme683 = !current
    AppToast.show(this, "Dialog Auto Theme683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DiffAutoHighlight683Toggle() {
    val current = BiliClient.prefs.v683diffAutoHighlight683
    BiliClient.prefs.v683diffAutoHighlight683 = !current
    AppToast.show(this, "Diff Auto Highlight683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DigestAutoCheck683Toggle() {
    val current = BiliClient.prefs.v683digestAutoCheck683
    BiliClient.prefs.v683digestAutoCheck683 = !current
    AppToast.show(this, "Digest Auto Check683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DigitalAutoSign683Toggle() {
    val current = BiliClient.prefs.v683digitalAutoSign683
    BiliClient.prefs.v683digitalAutoSign683 = !current
    AppToast.show(this, "Digital Auto Sign683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV683DirectAutoRoute683Toggle() {
    val current = BiliClient.prefs.v683directAutoRoute683
    BiliClient.prefs.v683directAutoRoute683 = !current
    AppToast.show(this, "Direct Auto Route683: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DeleteAutoConfirm684Toggle() {
    val current = BiliClient.prefs.v684deleteAutoConfirm684
    BiliClient.prefs.v684deleteAutoConfirm684 = !current
    AppToast.show(this, "Delete Auto Confirm684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DeltaAutoUpdate684Toggle() {
    val current = BiliClient.prefs.v684deltaAutoUpdate684
    BiliClient.prefs.v684deltaAutoUpdate684 = !current
    AppToast.show(this, "Delta Auto Update684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DemoAutoPlay684Toggle() {
    val current = BiliClient.prefs.v684demoAutoPlay684
    BiliClient.prefs.v684demoAutoPlay684 = !current
    AppToast.show(this, "Demo Auto Play684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DeployAutoPush684Toggle() {
    val current = BiliClient.prefs.v684deployAutoPush684
    BiliClient.prefs.v684deployAutoPush684 = !current
    AppToast.show(this, "Deploy Auto Push684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DepthAutoMap684Toggle() {
    val current = BiliClient.prefs.v684depthAutoMap684
    BiliClient.prefs.v684depthAutoMap684 = !current
    AppToast.show(this, "Depth Auto Map684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DeriveAutoCalc684Toggle() {
    val current = BiliClient.prefs.v684deriveAutoCalc684
    BiliClient.prefs.v684deriveAutoCalc684 = !current
    AppToast.show(this, "Derive Auto Calc684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DesignAutoToken684Toggle() {
    val current = BiliClient.prefs.v684designAutoToken684
    BiliClient.prefs.v684designAutoToken684 = !current
    AppToast.show(this, "Design Auto Token684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DesktopAutoMode684Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v684desktopAutoMode684).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode684",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v684desktopAutoMode684 = value
        AppToast.show(this, "Desktop Auto Mode684: $value")
    }
}

internal fun PlayerActivity.showV684DetectAutoMotion684Toggle() {
    val current = BiliClient.prefs.v684detectAutoMotion684
    BiliClient.prefs.v684detectAutoMotion684 = !current
    AppToast.show(this, "Detect Auto Motion684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DeviceAutoPair684Toggle() {
    val current = BiliClient.prefs.v684deviceAutoPair684
    BiliClient.prefs.v684deviceAutoPair684 = !current
    AppToast.show(this, "Device Auto Pair684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DialogAutoTheme684Toggle() {
    val current = BiliClient.prefs.v684dialogAutoTheme684
    BiliClient.prefs.v684dialogAutoTheme684 = !current
    AppToast.show(this, "Dialog Auto Theme684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DiffAutoHighlight684Toggle() {
    val current = BiliClient.prefs.v684diffAutoHighlight684
    BiliClient.prefs.v684diffAutoHighlight684 = !current
    AppToast.show(this, "Diff Auto Highlight684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DigestAutoCheck684Toggle() {
    val current = BiliClient.prefs.v684digestAutoCheck684
    BiliClient.prefs.v684digestAutoCheck684 = !current
    AppToast.show(this, "Digest Auto Check684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DigitalAutoSign684Toggle() {
    val current = BiliClient.prefs.v684digitalAutoSign684
    BiliClient.prefs.v684digitalAutoSign684 = !current
    AppToast.show(this, "Digital Auto Sign684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV684DirectAutoRoute684Toggle() {
    val current = BiliClient.prefs.v684directAutoRoute684
    BiliClient.prefs.v684directAutoRoute684 = !current
    AppToast.show(this, "Direct Auto Route684: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DeleteAutoConfirm685Toggle() {
    val current = BiliClient.prefs.v685deleteAutoConfirm685
    BiliClient.prefs.v685deleteAutoConfirm685 = !current
    AppToast.show(this, "Delete Auto Confirm685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DeltaAutoUpdate685Toggle() {
    val current = BiliClient.prefs.v685deltaAutoUpdate685
    BiliClient.prefs.v685deltaAutoUpdate685 = !current
    AppToast.show(this, "Delta Auto Update685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DemoAutoPlay685Toggle() {
    val current = BiliClient.prefs.v685demoAutoPlay685
    BiliClient.prefs.v685demoAutoPlay685 = !current
    AppToast.show(this, "Demo Auto Play685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DeployAutoPush685Toggle() {
    val current = BiliClient.prefs.v685deployAutoPush685
    BiliClient.prefs.v685deployAutoPush685 = !current
    AppToast.show(this, "Deploy Auto Push685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DepthAutoMap685Toggle() {
    val current = BiliClient.prefs.v685depthAutoMap685
    BiliClient.prefs.v685depthAutoMap685 = !current
    AppToast.show(this, "Depth Auto Map685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DeriveAutoCalc685Toggle() {
    val current = BiliClient.prefs.v685deriveAutoCalc685
    BiliClient.prefs.v685deriveAutoCalc685 = !current
    AppToast.show(this, "Derive Auto Calc685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DesignAutoToken685Toggle() {
    val current = BiliClient.prefs.v685designAutoToken685
    BiliClient.prefs.v685designAutoToken685 = !current
    AppToast.show(this, "Design Auto Token685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DesktopAutoMode685Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v685desktopAutoMode685).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode685",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v685desktopAutoMode685 = value
        AppToast.show(this, "Desktop Auto Mode685: $value")
    }
}

internal fun PlayerActivity.showV685DetectAutoMotion685Toggle() {
    val current = BiliClient.prefs.v685detectAutoMotion685
    BiliClient.prefs.v685detectAutoMotion685 = !current
    AppToast.show(this, "Detect Auto Motion685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DeviceAutoPair685Toggle() {
    val current = BiliClient.prefs.v685deviceAutoPair685
    BiliClient.prefs.v685deviceAutoPair685 = !current
    AppToast.show(this, "Device Auto Pair685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DialogAutoTheme685Toggle() {
    val current = BiliClient.prefs.v685dialogAutoTheme685
    BiliClient.prefs.v685dialogAutoTheme685 = !current
    AppToast.show(this, "Dialog Auto Theme685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DiffAutoHighlight685Toggle() {
    val current = BiliClient.prefs.v685diffAutoHighlight685
    BiliClient.prefs.v685diffAutoHighlight685 = !current
    AppToast.show(this, "Diff Auto Highlight685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DigestAutoCheck685Toggle() {
    val current = BiliClient.prefs.v685digestAutoCheck685
    BiliClient.prefs.v685digestAutoCheck685 = !current
    AppToast.show(this, "Digest Auto Check685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DigitalAutoSign685Toggle() {
    val current = BiliClient.prefs.v685digitalAutoSign685
    BiliClient.prefs.v685digitalAutoSign685 = !current
    AppToast.show(this, "Digital Auto Sign685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV685DirectAutoRoute685Toggle() {
    val current = BiliClient.prefs.v685directAutoRoute685
    BiliClient.prefs.v685directAutoRoute685 = !current
    AppToast.show(this, "Direct Auto Route685: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DeleteAutoConfirm686Toggle() {
    val current = BiliClient.prefs.v686deleteAutoConfirm686
    BiliClient.prefs.v686deleteAutoConfirm686 = !current
    AppToast.show(this, "Delete Auto Confirm686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DeltaAutoUpdate686Toggle() {
    val current = BiliClient.prefs.v686deltaAutoUpdate686
    BiliClient.prefs.v686deltaAutoUpdate686 = !current
    AppToast.show(this, "Delta Auto Update686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DemoAutoPlay686Toggle() {
    val current = BiliClient.prefs.v686demoAutoPlay686
    BiliClient.prefs.v686demoAutoPlay686 = !current
    AppToast.show(this, "Demo Auto Play686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DeployAutoPush686Toggle() {
    val current = BiliClient.prefs.v686deployAutoPush686
    BiliClient.prefs.v686deployAutoPush686 = !current
    AppToast.show(this, "Deploy Auto Push686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DepthAutoMap686Toggle() {
    val current = BiliClient.prefs.v686depthAutoMap686
    BiliClient.prefs.v686depthAutoMap686 = !current
    AppToast.show(this, "Depth Auto Map686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DeriveAutoCalc686Toggle() {
    val current = BiliClient.prefs.v686deriveAutoCalc686
    BiliClient.prefs.v686deriveAutoCalc686 = !current
    AppToast.show(this, "Derive Auto Calc686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DesignAutoToken686Toggle() {
    val current = BiliClient.prefs.v686designAutoToken686
    BiliClient.prefs.v686designAutoToken686 = !current
    AppToast.show(this, "Design Auto Token686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DesktopAutoMode686Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v686desktopAutoMode686).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode686",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v686desktopAutoMode686 = value
        AppToast.show(this, "Desktop Auto Mode686: $value")
    }
}

internal fun PlayerActivity.showV686DetectAutoMotion686Toggle() {
    val current = BiliClient.prefs.v686detectAutoMotion686
    BiliClient.prefs.v686detectAutoMotion686 = !current
    AppToast.show(this, "Detect Auto Motion686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DeviceAutoPair686Toggle() {
    val current = BiliClient.prefs.v686deviceAutoPair686
    BiliClient.prefs.v686deviceAutoPair686 = !current
    AppToast.show(this, "Device Auto Pair686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DialogAutoTheme686Toggle() {
    val current = BiliClient.prefs.v686dialogAutoTheme686
    BiliClient.prefs.v686dialogAutoTheme686 = !current
    AppToast.show(this, "Dialog Auto Theme686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DiffAutoHighlight686Toggle() {
    val current = BiliClient.prefs.v686diffAutoHighlight686
    BiliClient.prefs.v686diffAutoHighlight686 = !current
    AppToast.show(this, "Diff Auto Highlight686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DigestAutoCheck686Toggle() {
    val current = BiliClient.prefs.v686digestAutoCheck686
    BiliClient.prefs.v686digestAutoCheck686 = !current
    AppToast.show(this, "Digest Auto Check686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DigitalAutoSign686Toggle() {
    val current = BiliClient.prefs.v686digitalAutoSign686
    BiliClient.prefs.v686digitalAutoSign686 = !current
    AppToast.show(this, "Digital Auto Sign686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV686DirectAutoRoute686Toggle() {
    val current = BiliClient.prefs.v686directAutoRoute686
    BiliClient.prefs.v686directAutoRoute686 = !current
    AppToast.show(this, "Direct Auto Route686: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DeleteAutoConfirm687Toggle() {
    val current = BiliClient.prefs.v687deleteAutoConfirm687
    BiliClient.prefs.v687deleteAutoConfirm687 = !current
    AppToast.show(this, "Delete Auto Confirm687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DeltaAutoUpdate687Toggle() {
    val current = BiliClient.prefs.v687deltaAutoUpdate687
    BiliClient.prefs.v687deltaAutoUpdate687 = !current
    AppToast.show(this, "Delta Auto Update687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DemoAutoPlay687Toggle() {
    val current = BiliClient.prefs.v687demoAutoPlay687
    BiliClient.prefs.v687demoAutoPlay687 = !current
    AppToast.show(this, "Demo Auto Play687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DeployAutoPush687Toggle() {
    val current = BiliClient.prefs.v687deployAutoPush687
    BiliClient.prefs.v687deployAutoPush687 = !current
    AppToast.show(this, "Deploy Auto Push687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DepthAutoMap687Toggle() {
    val current = BiliClient.prefs.v687depthAutoMap687
    BiliClient.prefs.v687depthAutoMap687 = !current
    AppToast.show(this, "Depth Auto Map687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DeriveAutoCalc687Toggle() {
    val current = BiliClient.prefs.v687deriveAutoCalc687
    BiliClient.prefs.v687deriveAutoCalc687 = !current
    AppToast.show(this, "Derive Auto Calc687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DesignAutoToken687Toggle() {
    val current = BiliClient.prefs.v687designAutoToken687
    BiliClient.prefs.v687designAutoToken687 = !current
    AppToast.show(this, "Design Auto Token687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DesktopAutoMode687Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v687desktopAutoMode687).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode687",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v687desktopAutoMode687 = value
        AppToast.show(this, "Desktop Auto Mode687: $value")
    }
}

internal fun PlayerActivity.showV687DetectAutoMotion687Toggle() {
    val current = BiliClient.prefs.v687detectAutoMotion687
    BiliClient.prefs.v687detectAutoMotion687 = !current
    AppToast.show(this, "Detect Auto Motion687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DeviceAutoPair687Toggle() {
    val current = BiliClient.prefs.v687deviceAutoPair687
    BiliClient.prefs.v687deviceAutoPair687 = !current
    AppToast.show(this, "Device Auto Pair687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DialogAutoTheme687Toggle() {
    val current = BiliClient.prefs.v687dialogAutoTheme687
    BiliClient.prefs.v687dialogAutoTheme687 = !current
    AppToast.show(this, "Dialog Auto Theme687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DiffAutoHighlight687Toggle() {
    val current = BiliClient.prefs.v687diffAutoHighlight687
    BiliClient.prefs.v687diffAutoHighlight687 = !current
    AppToast.show(this, "Diff Auto Highlight687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DigestAutoCheck687Toggle() {
    val current = BiliClient.prefs.v687digestAutoCheck687
    BiliClient.prefs.v687digestAutoCheck687 = !current
    AppToast.show(this, "Digest Auto Check687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DigitalAutoSign687Toggle() {
    val current = BiliClient.prefs.v687digitalAutoSign687
    BiliClient.prefs.v687digitalAutoSign687 = !current
    AppToast.show(this, "Digital Auto Sign687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV687DirectAutoRoute687Toggle() {
    val current = BiliClient.prefs.v687directAutoRoute687
    BiliClient.prefs.v687directAutoRoute687 = !current
    AppToast.show(this, "Direct Auto Route687: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DeleteAutoConfirm688Toggle() {
    val current = BiliClient.prefs.v688deleteAutoConfirm688
    BiliClient.prefs.v688deleteAutoConfirm688 = !current
    AppToast.show(this, "Delete Auto Confirm688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DeltaAutoUpdate688Toggle() {
    val current = BiliClient.prefs.v688deltaAutoUpdate688
    BiliClient.prefs.v688deltaAutoUpdate688 = !current
    AppToast.show(this, "Delta Auto Update688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DemoAutoPlay688Toggle() {
    val current = BiliClient.prefs.v688demoAutoPlay688
    BiliClient.prefs.v688demoAutoPlay688 = !current
    AppToast.show(this, "Demo Auto Play688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DeployAutoPush688Toggle() {
    val current = BiliClient.prefs.v688deployAutoPush688
    BiliClient.prefs.v688deployAutoPush688 = !current
    AppToast.show(this, "Deploy Auto Push688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DepthAutoMap688Toggle() {
    val current = BiliClient.prefs.v688depthAutoMap688
    BiliClient.prefs.v688depthAutoMap688 = !current
    AppToast.show(this, "Depth Auto Map688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DeriveAutoCalc688Toggle() {
    val current = BiliClient.prefs.v688deriveAutoCalc688
    BiliClient.prefs.v688deriveAutoCalc688 = !current
    AppToast.show(this, "Derive Auto Calc688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DesignAutoToken688Toggle() {
    val current = BiliClient.prefs.v688designAutoToken688
    BiliClient.prefs.v688designAutoToken688 = !current
    AppToast.show(this, "Design Auto Token688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DesktopAutoMode688Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v688desktopAutoMode688).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode688",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v688desktopAutoMode688 = value
        AppToast.show(this, "Desktop Auto Mode688: $value")
    }
}

internal fun PlayerActivity.showV688DetectAutoMotion688Toggle() {
    val current = BiliClient.prefs.v688detectAutoMotion688
    BiliClient.prefs.v688detectAutoMotion688 = !current
    AppToast.show(this, "Detect Auto Motion688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DeviceAutoPair688Toggle() {
    val current = BiliClient.prefs.v688deviceAutoPair688
    BiliClient.prefs.v688deviceAutoPair688 = !current
    AppToast.show(this, "Device Auto Pair688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DialogAutoTheme688Toggle() {
    val current = BiliClient.prefs.v688dialogAutoTheme688
    BiliClient.prefs.v688dialogAutoTheme688 = !current
    AppToast.show(this, "Dialog Auto Theme688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DiffAutoHighlight688Toggle() {
    val current = BiliClient.prefs.v688diffAutoHighlight688
    BiliClient.prefs.v688diffAutoHighlight688 = !current
    AppToast.show(this, "Diff Auto Highlight688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DigestAutoCheck688Toggle() {
    val current = BiliClient.prefs.v688digestAutoCheck688
    BiliClient.prefs.v688digestAutoCheck688 = !current
    AppToast.show(this, "Digest Auto Check688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DigitalAutoSign688Toggle() {
    val current = BiliClient.prefs.v688digitalAutoSign688
    BiliClient.prefs.v688digitalAutoSign688 = !current
    AppToast.show(this, "Digital Auto Sign688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV688DirectAutoRoute688Toggle() {
    val current = BiliClient.prefs.v688directAutoRoute688
    BiliClient.prefs.v688directAutoRoute688 = !current
    AppToast.show(this, "Direct Auto Route688: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DeleteAutoConfirm689Toggle() {
    val current = BiliClient.prefs.v689deleteAutoConfirm689
    BiliClient.prefs.v689deleteAutoConfirm689 = !current
    AppToast.show(this, "Delete Auto Confirm689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DeltaAutoUpdate689Toggle() {
    val current = BiliClient.prefs.v689deltaAutoUpdate689
    BiliClient.prefs.v689deltaAutoUpdate689 = !current
    AppToast.show(this, "Delta Auto Update689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DemoAutoPlay689Toggle() {
    val current = BiliClient.prefs.v689demoAutoPlay689
    BiliClient.prefs.v689demoAutoPlay689 = !current
    AppToast.show(this, "Demo Auto Play689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DeployAutoPush689Toggle() {
    val current = BiliClient.prefs.v689deployAutoPush689
    BiliClient.prefs.v689deployAutoPush689 = !current
    AppToast.show(this, "Deploy Auto Push689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DepthAutoMap689Toggle() {
    val current = BiliClient.prefs.v689depthAutoMap689
    BiliClient.prefs.v689depthAutoMap689 = !current
    AppToast.show(this, "Depth Auto Map689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DeriveAutoCalc689Toggle() {
    val current = BiliClient.prefs.v689deriveAutoCalc689
    BiliClient.prefs.v689deriveAutoCalc689 = !current
    AppToast.show(this, "Derive Auto Calc689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DesignAutoToken689Toggle() {
    val current = BiliClient.prefs.v689designAutoToken689
    BiliClient.prefs.v689designAutoToken689 = !current
    AppToast.show(this, "Design Auto Token689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DesktopAutoMode689Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v689desktopAutoMode689).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode689",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v689desktopAutoMode689 = value
        AppToast.show(this, "Desktop Auto Mode689: $value")
    }
}

internal fun PlayerActivity.showV689DetectAutoMotion689Toggle() {
    val current = BiliClient.prefs.v689detectAutoMotion689
    BiliClient.prefs.v689detectAutoMotion689 = !current
    AppToast.show(this, "Detect Auto Motion689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DeviceAutoPair689Toggle() {
    val current = BiliClient.prefs.v689deviceAutoPair689
    BiliClient.prefs.v689deviceAutoPair689 = !current
    AppToast.show(this, "Device Auto Pair689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DialogAutoTheme689Toggle() {
    val current = BiliClient.prefs.v689dialogAutoTheme689
    BiliClient.prefs.v689dialogAutoTheme689 = !current
    AppToast.show(this, "Dialog Auto Theme689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DiffAutoHighlight689Toggle() {
    val current = BiliClient.prefs.v689diffAutoHighlight689
    BiliClient.prefs.v689diffAutoHighlight689 = !current
    AppToast.show(this, "Diff Auto Highlight689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DigestAutoCheck689Toggle() {
    val current = BiliClient.prefs.v689digestAutoCheck689
    BiliClient.prefs.v689digestAutoCheck689 = !current
    AppToast.show(this, "Digest Auto Check689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DigitalAutoSign689Toggle() {
    val current = BiliClient.prefs.v689digitalAutoSign689
    BiliClient.prefs.v689digitalAutoSign689 = !current
    AppToast.show(this, "Digital Auto Sign689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV689DirectAutoRoute689Toggle() {
    val current = BiliClient.prefs.v689directAutoRoute689
    BiliClient.prefs.v689directAutoRoute689 = !current
    AppToast.show(this, "Direct Auto Route689: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DeleteAutoConfirm690Toggle() {
    val current = BiliClient.prefs.v690deleteAutoConfirm690
    BiliClient.prefs.v690deleteAutoConfirm690 = !current
    AppToast.show(this, "Delete Auto Confirm690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DeltaAutoUpdate690Toggle() {
    val current = BiliClient.prefs.v690deltaAutoUpdate690
    BiliClient.prefs.v690deltaAutoUpdate690 = !current
    AppToast.show(this, "Delta Auto Update690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DemoAutoPlay690Toggle() {
    val current = BiliClient.prefs.v690demoAutoPlay690
    BiliClient.prefs.v690demoAutoPlay690 = !current
    AppToast.show(this, "Demo Auto Play690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DeployAutoPush690Toggle() {
    val current = BiliClient.prefs.v690deployAutoPush690
    BiliClient.prefs.v690deployAutoPush690 = !current
    AppToast.show(this, "Deploy Auto Push690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DepthAutoMap690Toggle() {
    val current = BiliClient.prefs.v690depthAutoMap690
    BiliClient.prefs.v690depthAutoMap690 = !current
    AppToast.show(this, "Depth Auto Map690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DeriveAutoCalc690Toggle() {
    val current = BiliClient.prefs.v690deriveAutoCalc690
    BiliClient.prefs.v690deriveAutoCalc690 = !current
    AppToast.show(this, "Derive Auto Calc690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DesignAutoToken690Toggle() {
    val current = BiliClient.prefs.v690designAutoToken690
    BiliClient.prefs.v690designAutoToken690 = !current
    AppToast.show(this, "Design Auto Token690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DesktopAutoMode690Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v690desktopAutoMode690).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode690",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v690desktopAutoMode690 = value
        AppToast.show(this, "Desktop Auto Mode690: $value")
    }
}

internal fun PlayerActivity.showV690DetectAutoMotion690Toggle() {
    val current = BiliClient.prefs.v690detectAutoMotion690
    BiliClient.prefs.v690detectAutoMotion690 = !current
    AppToast.show(this, "Detect Auto Motion690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DeviceAutoPair690Toggle() {
    val current = BiliClient.prefs.v690deviceAutoPair690
    BiliClient.prefs.v690deviceAutoPair690 = !current
    AppToast.show(this, "Device Auto Pair690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DialogAutoTheme690Toggle() {
    val current = BiliClient.prefs.v690dialogAutoTheme690
    BiliClient.prefs.v690dialogAutoTheme690 = !current
    AppToast.show(this, "Dialog Auto Theme690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DiffAutoHighlight690Toggle() {
    val current = BiliClient.prefs.v690diffAutoHighlight690
    BiliClient.prefs.v690diffAutoHighlight690 = !current
    AppToast.show(this, "Diff Auto Highlight690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DigestAutoCheck690Toggle() {
    val current = BiliClient.prefs.v690digestAutoCheck690
    BiliClient.prefs.v690digestAutoCheck690 = !current
    AppToast.show(this, "Digest Auto Check690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DigitalAutoSign690Toggle() {
    val current = BiliClient.prefs.v690digitalAutoSign690
    BiliClient.prefs.v690digitalAutoSign690 = !current
    AppToast.show(this, "Digital Auto Sign690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV690DirectAutoRoute690Toggle() {
    val current = BiliClient.prefs.v690directAutoRoute690
    BiliClient.prefs.v690directAutoRoute690 = !current
    AppToast.show(this, "Direct Auto Route690: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DirtyAutoFlag691Toggle() {
    val current = BiliClient.prefs.v691dirtyAutoFlag691
    BiliClient.prefs.v691dirtyAutoFlag691 = !current
    AppToast.show(this, "Dirty Auto Flag691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DisableAutoToggle691Toggle() {
    val current = BiliClient.prefs.v691disableAutoToggle691
    BiliClient.prefs.v691disableAutoToggle691 = !current
    AppToast.show(this, "Disable Auto Toggle691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DiscardAutoWarn691Toggle() {
    val current = BiliClient.prefs.v691discardAutoWarn691
    BiliClient.prefs.v691discardAutoWarn691 = !current
    AppToast.show(this, "Discard Auto Warn691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DiscoverAutoScan691Toggle() {
    val current = BiliClient.prefs.v691discoverAutoScan691
    BiliClient.prefs.v691discoverAutoScan691 = !current
    AppToast.show(this, "Discover Auto Scan691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DispatchAutoEvent691Toggle() {
    val current = BiliClient.prefs.v691dispatchAutoEvent691
    BiliClient.prefs.v691dispatchAutoEvent691 = !current
    AppToast.show(this, "Dispatch Auto Event691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DisplayAutoRotate691Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v691displayAutoRotate691).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate691",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v691displayAutoRotate691 = value
        AppToast.show(this, "Display Auto Rotate691: $value")
    }
}

internal fun PlayerActivity.showV691DisposeAutoCleanup691Toggle() {
    val current = BiliClient.prefs.v691disposeAutoCleanup691
    BiliClient.prefs.v691disposeAutoCleanup691 = !current
    AppToast.show(this, "Dispose Auto Cleanup691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DistAutoCalc691Toggle() {
    val current = BiliClient.prefs.v691distAutoCalc691
    BiliClient.prefs.v691distAutoCalc691 = !current
    AppToast.show(this, "Dist Auto Calc691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DivideAutoSplit691Toggle() {
    val current = BiliClient.prefs.v691divideAutoSplit691
    BiliClient.prefs.v691divideAutoSplit691 = !current
    AppToast.show(this, "Divide Auto Split691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DocumentAutoSave691Toggle() {
    val current = BiliClient.prefs.v691documentAutoSave691
    BiliClient.prefs.v691documentAutoSave691 = !current
    AppToast.show(this, "Document Auto Save691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DomainAutoResolve691Toggle() {
    val current = BiliClient.prefs.v691domainAutoResolve691
    BiliClient.prefs.v691domainAutoResolve691 = !current
    AppToast.show(this, "Domain Auto Resolve691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DownloadAutoQueue691Toggle() {
    val current = BiliClient.prefs.v691downloadAutoQueue691
    BiliClient.prefs.v691downloadAutoQueue691 = !current
    AppToast.show(this, "Download Auto Queue691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DraftAutoSave691Toggle() {
    val current = BiliClient.prefs.v691draftAutoSave691
    BiliClient.prefs.v691draftAutoSave691 = !current
    AppToast.show(this, "Draft Auto Save691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DragAutoScroll691Toggle() {
    val current = BiliClient.prefs.v691dragAutoScroll691
    BiliClient.prefs.v691dragAutoScroll691 = !current
    AppToast.show(this, "Drag Auto Scroll691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV691DrawAutoAntialias691Toggle() {
    val current = BiliClient.prefs.v691drawAutoAntialias691
    BiliClient.prefs.v691drawAutoAntialias691 = !current
    AppToast.show(this, "Draw Auto Antialias691: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DirtyAutoFlag692Toggle() {
    val current = BiliClient.prefs.v692dirtyAutoFlag692
    BiliClient.prefs.v692dirtyAutoFlag692 = !current
    AppToast.show(this, "Dirty Auto Flag692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DisableAutoToggle692Toggle() {
    val current = BiliClient.prefs.v692disableAutoToggle692
    BiliClient.prefs.v692disableAutoToggle692 = !current
    AppToast.show(this, "Disable Auto Toggle692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DiscardAutoWarn692Toggle() {
    val current = BiliClient.prefs.v692discardAutoWarn692
    BiliClient.prefs.v692discardAutoWarn692 = !current
    AppToast.show(this, "Discard Auto Warn692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DiscoverAutoScan692Toggle() {
    val current = BiliClient.prefs.v692discoverAutoScan692
    BiliClient.prefs.v692discoverAutoScan692 = !current
    AppToast.show(this, "Discover Auto Scan692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DispatchAutoEvent692Toggle() {
    val current = BiliClient.prefs.v692dispatchAutoEvent692
    BiliClient.prefs.v692dispatchAutoEvent692 = !current
    AppToast.show(this, "Dispatch Auto Event692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DisplayAutoRotate692Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v692displayAutoRotate692).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate692",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v692displayAutoRotate692 = value
        AppToast.show(this, "Display Auto Rotate692: $value")
    }
}

internal fun PlayerActivity.showV692DisposeAutoCleanup692Toggle() {
    val current = BiliClient.prefs.v692disposeAutoCleanup692
    BiliClient.prefs.v692disposeAutoCleanup692 = !current
    AppToast.show(this, "Dispose Auto Cleanup692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DistAutoCalc692Toggle() {
    val current = BiliClient.prefs.v692distAutoCalc692
    BiliClient.prefs.v692distAutoCalc692 = !current
    AppToast.show(this, "Dist Auto Calc692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DivideAutoSplit692Toggle() {
    val current = BiliClient.prefs.v692divideAutoSplit692
    BiliClient.prefs.v692divideAutoSplit692 = !current
    AppToast.show(this, "Divide Auto Split692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DocumentAutoSave692Toggle() {
    val current = BiliClient.prefs.v692documentAutoSave692
    BiliClient.prefs.v692documentAutoSave692 = !current
    AppToast.show(this, "Document Auto Save692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DomainAutoResolve692Toggle() {
    val current = BiliClient.prefs.v692domainAutoResolve692
    BiliClient.prefs.v692domainAutoResolve692 = !current
    AppToast.show(this, "Domain Auto Resolve692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DownloadAutoQueue692Toggle() {
    val current = BiliClient.prefs.v692downloadAutoQueue692
    BiliClient.prefs.v692downloadAutoQueue692 = !current
    AppToast.show(this, "Download Auto Queue692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DraftAutoSave692Toggle() {
    val current = BiliClient.prefs.v692draftAutoSave692
    BiliClient.prefs.v692draftAutoSave692 = !current
    AppToast.show(this, "Draft Auto Save692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DragAutoScroll692Toggle() {
    val current = BiliClient.prefs.v692dragAutoScroll692
    BiliClient.prefs.v692dragAutoScroll692 = !current
    AppToast.show(this, "Drag Auto Scroll692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV692DrawAutoAntialias692Toggle() {
    val current = BiliClient.prefs.v692drawAutoAntialias692
    BiliClient.prefs.v692drawAutoAntialias692 = !current
    AppToast.show(this, "Draw Auto Antialias692: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DirtyAutoFlag693Toggle() {
    val current = BiliClient.prefs.v693dirtyAutoFlag693
    BiliClient.prefs.v693dirtyAutoFlag693 = !current
    AppToast.show(this, "Dirty Auto Flag693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DisableAutoToggle693Toggle() {
    val current = BiliClient.prefs.v693disableAutoToggle693
    BiliClient.prefs.v693disableAutoToggle693 = !current
    AppToast.show(this, "Disable Auto Toggle693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DiscardAutoWarn693Toggle() {
    val current = BiliClient.prefs.v693discardAutoWarn693
    BiliClient.prefs.v693discardAutoWarn693 = !current
    AppToast.show(this, "Discard Auto Warn693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DiscoverAutoScan693Toggle() {
    val current = BiliClient.prefs.v693discoverAutoScan693
    BiliClient.prefs.v693discoverAutoScan693 = !current
    AppToast.show(this, "Discover Auto Scan693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DispatchAutoEvent693Toggle() {
    val current = BiliClient.prefs.v693dispatchAutoEvent693
    BiliClient.prefs.v693dispatchAutoEvent693 = !current
    AppToast.show(this, "Dispatch Auto Event693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DisplayAutoRotate693Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v693displayAutoRotate693).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate693",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v693displayAutoRotate693 = value
        AppToast.show(this, "Display Auto Rotate693: $value")
    }
}

internal fun PlayerActivity.showV693DisposeAutoCleanup693Toggle() {
    val current = BiliClient.prefs.v693disposeAutoCleanup693
    BiliClient.prefs.v693disposeAutoCleanup693 = !current
    AppToast.show(this, "Dispose Auto Cleanup693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DistAutoCalc693Toggle() {
    val current = BiliClient.prefs.v693distAutoCalc693
    BiliClient.prefs.v693distAutoCalc693 = !current
    AppToast.show(this, "Dist Auto Calc693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DivideAutoSplit693Toggle() {
    val current = BiliClient.prefs.v693divideAutoSplit693
    BiliClient.prefs.v693divideAutoSplit693 = !current
    AppToast.show(this, "Divide Auto Split693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DocumentAutoSave693Toggle() {
    val current = BiliClient.prefs.v693documentAutoSave693
    BiliClient.prefs.v693documentAutoSave693 = !current
    AppToast.show(this, "Document Auto Save693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DomainAutoResolve693Toggle() {
    val current = BiliClient.prefs.v693domainAutoResolve693
    BiliClient.prefs.v693domainAutoResolve693 = !current
    AppToast.show(this, "Domain Auto Resolve693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DownloadAutoQueue693Toggle() {
    val current = BiliClient.prefs.v693downloadAutoQueue693
    BiliClient.prefs.v693downloadAutoQueue693 = !current
    AppToast.show(this, "Download Auto Queue693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DraftAutoSave693Toggle() {
    val current = BiliClient.prefs.v693draftAutoSave693
    BiliClient.prefs.v693draftAutoSave693 = !current
    AppToast.show(this, "Draft Auto Save693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DragAutoScroll693Toggle() {
    val current = BiliClient.prefs.v693dragAutoScroll693
    BiliClient.prefs.v693dragAutoScroll693 = !current
    AppToast.show(this, "Drag Auto Scroll693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV693DrawAutoAntialias693Toggle() {
    val current = BiliClient.prefs.v693drawAutoAntialias693
    BiliClient.prefs.v693drawAutoAntialias693 = !current
    AppToast.show(this, "Draw Auto Antialias693: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DirtyAutoFlag694Toggle() {
    val current = BiliClient.prefs.v694dirtyAutoFlag694
    BiliClient.prefs.v694dirtyAutoFlag694 = !current
    AppToast.show(this, "Dirty Auto Flag694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DisableAutoToggle694Toggle() {
    val current = BiliClient.prefs.v694disableAutoToggle694
    BiliClient.prefs.v694disableAutoToggle694 = !current
    AppToast.show(this, "Disable Auto Toggle694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DiscardAutoWarn694Toggle() {
    val current = BiliClient.prefs.v694discardAutoWarn694
    BiliClient.prefs.v694discardAutoWarn694 = !current
    AppToast.show(this, "Discard Auto Warn694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DiscoverAutoScan694Toggle() {
    val current = BiliClient.prefs.v694discoverAutoScan694
    BiliClient.prefs.v694discoverAutoScan694 = !current
    AppToast.show(this, "Discover Auto Scan694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DispatchAutoEvent694Toggle() {
    val current = BiliClient.prefs.v694dispatchAutoEvent694
    BiliClient.prefs.v694dispatchAutoEvent694 = !current
    AppToast.show(this, "Dispatch Auto Event694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DisplayAutoRotate694Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v694displayAutoRotate694).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Auto Rotate694",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v694displayAutoRotate694 = value
        AppToast.show(this, "Display Auto Rotate694: $value")
    }
}

internal fun PlayerActivity.showV694DisposeAutoCleanup694Toggle() {
    val current = BiliClient.prefs.v694disposeAutoCleanup694
    BiliClient.prefs.v694disposeAutoCleanup694 = !current
    AppToast.show(this, "Dispose Auto Cleanup694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DistAutoCalc694Toggle() {
    val current = BiliClient.prefs.v694distAutoCalc694
    BiliClient.prefs.v694distAutoCalc694 = !current
    AppToast.show(this, "Dist Auto Calc694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DivideAutoSplit694Toggle() {
    val current = BiliClient.prefs.v694divideAutoSplit694
    BiliClient.prefs.v694divideAutoSplit694 = !current
    AppToast.show(this, "Divide Auto Split694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DocumentAutoSave694Toggle() {
    val current = BiliClient.prefs.v694documentAutoSave694
    BiliClient.prefs.v694documentAutoSave694 = !current
    AppToast.show(this, "Document Auto Save694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DomainAutoResolve694Toggle() {
    val current = BiliClient.prefs.v694domainAutoResolve694
    BiliClient.prefs.v694domainAutoResolve694 = !current
    AppToast.show(this, "Domain Auto Resolve694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DownloadAutoQueue694Toggle() {
    val current = BiliClient.prefs.v694downloadAutoQueue694
    BiliClient.prefs.v694downloadAutoQueue694 = !current
    AppToast.show(this, "Download Auto Queue694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DraftAutoSave694Toggle() {
    val current = BiliClient.prefs.v694draftAutoSave694
    BiliClient.prefs.v694draftAutoSave694 = !current
    AppToast.show(this, "Draft Auto Save694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DragAutoScroll694Toggle() {
    val current = BiliClient.prefs.v694dragAutoScroll694
    BiliClient.prefs.v694dragAutoScroll694 = !current
    AppToast.show(this, "Drag Auto Scroll694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV694DrawAutoAntialias694Toggle() {
    val current = BiliClient.prefs.v694drawAutoAntialias694
    BiliClient.prefs.v694drawAutoAntialias694 = !current
    AppToast.show(this, "Draw Auto Antialias694: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV695DirtyAutoFlag695Toggle() {
    val current = BiliClient.prefs.v695dirtyAutoFlag695
    BiliClient.prefs.v695dirtyAutoFlag695 = !current
    AppToast.show(this, "Dirty Auto Flag695: ${if (!current) "ON" else "OFF"}")
}

