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

// v921: Replace Auto Regex921
internal fun PlayerActivity.showV921ReplaceAutoRegex921Toggle() {
    val current = BiliClient.prefs.v921replaceAutoRegex921
    BiliClient.prefs.v921replaceAutoRegex921 = !current
    AppToast.show(this, "Replace Auto Regex921: ${if (!current) "ON" else "OFF"}")
}

// v921: Report Auto Crash921
internal fun PlayerActivity.showV921ReportAutoCrash921Toggle() {
    val current = BiliClient.prefs.v921reportAutoCrash921
    BiliClient.prefs.v921reportAutoCrash921 = !current
    AppToast.show(this, "Report Auto Crash921: ${if (!current) "ON" else "OFF"}")
}

// v921: Request Auto Retry921
internal fun PlayerActivity.showV921RequestAutoRetry921Toggle() {
    val current = BiliClient.prefs.v921requestAutoRetry921
    BiliClient.prefs.v921requestAutoRetry921 = !current
    AppToast.show(this, "Request Auto Retry921: ${if (!current) "ON" else "OFF"}")
}

// v921: Require Auto Auth921
internal fun PlayerActivity.showV921RequireAutoAuth921Toggle() {
    val current = BiliClient.prefs.v921requireAutoAuth921
    BiliClient.prefs.v921requireAutoAuth921 = !current
    AppToast.show(this, "Require Auto Auth921: ${if (!current) "ON" else "OFF"}")
}

// v921: Reset Auto Default921
internal fun PlayerActivity.showV921ResetAutoDefault921Toggle() {
    val current = BiliClient.prefs.v921resetAutoDefault921
    BiliClient.prefs.v921resetAutoDefault921 = !current
    AppToast.show(this, "Reset Auto Default921: ${if (!current) "ON" else "OFF"}")
}

// v921: Resize Auto Fit921
internal fun PlayerActivity.showV921ResizeAutoFit921Toggle() {
    val current = BiliClient.prefs.v921resizeAutoFit921
    BiliClient.prefs.v921resizeAutoFit921 = !current
    AppToast.show(this, "Resize Auto Fit921: ${if (!current) "ON" else "OFF"}")
}

// v921: Resolve Auto Dns921
internal fun PlayerActivity.showV921ResolveAutoDns921Toggle() {
    val current = BiliClient.prefs.v921resolveAutoDns921
    BiliClient.prefs.v921resolveAutoDns921 = !current
    AppToast.show(this, "Resolve Auto Dns921: ${if (!current) "ON" else "OFF"}")
}

// v921: Resource Auto Pool921
internal fun PlayerActivity.showV921ResourceAutoPool921Toggle() {
    val current = BiliClient.prefs.v921resourceAutoPool921
    BiliClient.prefs.v921resourceAutoPool921 = !current
    AppToast.show(this, "Resource Auto Pool921: ${if (!current) "ON" else "OFF"}")
}

// v921: Response Auto Cache921
internal fun PlayerActivity.showV921ResponseAutoCache921Toggle() {
    val current = BiliClient.prefs.v921responseAutoCache921
    BiliClient.prefs.v921responseAutoCache921 = !current
    AppToast.show(this, "Response Auto Cache921: ${if (!current) "ON" else "OFF"}")
}

// v921: Restart Auto Recover921
internal fun PlayerActivity.showV921RestartAutoRecover921Toggle() {
    val current = BiliClient.prefs.v921restartAutoRecover921
    BiliClient.prefs.v921restartAutoRecover921 = !current
    AppToast.show(this, "Restart Auto Recover921: ${if (!current) "ON" else "OFF"}")
}

// v921: Restore Auto Backup921
internal fun PlayerActivity.showV921RestoreAutoBackup921Toggle() {
    val current = BiliClient.prefs.v921restoreAutoBackup921
    BiliClient.prefs.v921restoreAutoBackup921 = !current
    AppToast.show(this, "Restore Auto Backup921: ${if (!current) "ON" else "OFF"}")
}

// v921: Result Auto Sort921
internal fun PlayerActivity.showV921ResultAutoSort921Toggle() {
    val current = BiliClient.prefs.v921resultAutoSort921
    BiliClient.prefs.v921resultAutoSort921 = !current
    AppToast.show(this, "Result Auto Sort921: ${if (!current) "ON" else "OFF"}")
}

// v921: Retry Auto Backoff921
internal fun PlayerActivity.showV921RetryAutoBackoff921Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v921retryAutoBackoff921).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff921",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v921retryAutoBackoff921 = value
        AppToast.show(this, "Retry Auto Backoff921: $value")
    }
}

// v921: Return Auto Home921
internal fun PlayerActivity.showV921ReturnAutoHome921Toggle() {
    val current = BiliClient.prefs.v921returnAutoHome921
    BiliClient.prefs.v921returnAutoHome921 = !current
    AppToast.show(this, "Return Auto Home921: ${if (!current) "ON" else "OFF"}")
}

// v921: Reverse Auto Order921
internal fun PlayerActivity.showV921ReverseAutoOrder921Toggle() {
    val current = BiliClient.prefs.v921reverseAutoOrder921
    BiliClient.prefs.v921reverseAutoOrder921 = !current
    AppToast.show(this, "Reverse Auto Order921: ${if (!current) "ON" else "OFF"}")
}

// v922: Replace Auto Regex922
internal fun PlayerActivity.showV922ReplaceAutoRegex922Toggle() {
    val current = BiliClient.prefs.v922replaceAutoRegex922
    BiliClient.prefs.v922replaceAutoRegex922 = !current
    AppToast.show(this, "Replace Auto Regex922: ${if (!current) "ON" else "OFF"}")
}

// v922: Report Auto Crash922
internal fun PlayerActivity.showV922ReportAutoCrash922Toggle() {
    val current = BiliClient.prefs.v922reportAutoCrash922
    BiliClient.prefs.v922reportAutoCrash922 = !current
    AppToast.show(this, "Report Auto Crash922: ${if (!current) "ON" else "OFF"}")
}

// v922: Request Auto Retry922
internal fun PlayerActivity.showV922RequestAutoRetry922Toggle() {
    val current = BiliClient.prefs.v922requestAutoRetry922
    BiliClient.prefs.v922requestAutoRetry922 = !current
    AppToast.show(this, "Request Auto Retry922: ${if (!current) "ON" else "OFF"}")
}

// v922: Require Auto Auth922
internal fun PlayerActivity.showV922RequireAutoAuth922Toggle() {
    val current = BiliClient.prefs.v922requireAutoAuth922
    BiliClient.prefs.v922requireAutoAuth922 = !current
    AppToast.show(this, "Require Auto Auth922: ${if (!current) "ON" else "OFF"}")
}

// v922: Reset Auto Default922
internal fun PlayerActivity.showV922ResetAutoDefault922Toggle() {
    val current = BiliClient.prefs.v922resetAutoDefault922
    BiliClient.prefs.v922resetAutoDefault922 = !current
    AppToast.show(this, "Reset Auto Default922: ${if (!current) "ON" else "OFF"}")
}

// v922: Resize Auto Fit922
internal fun PlayerActivity.showV922ResizeAutoFit922Toggle() {
    val current = BiliClient.prefs.v922resizeAutoFit922
    BiliClient.prefs.v922resizeAutoFit922 = !current
    AppToast.show(this, "Resize Auto Fit922: ${if (!current) "ON" else "OFF"}")
}

// v922: Resolve Auto Dns922
internal fun PlayerActivity.showV922ResolveAutoDns922Toggle() {
    val current = BiliClient.prefs.v922resolveAutoDns922
    BiliClient.prefs.v922resolveAutoDns922 = !current
    AppToast.show(this, "Resolve Auto Dns922: ${if (!current) "ON" else "OFF"}")
}

// v922: Resource Auto Pool922
internal fun PlayerActivity.showV922ResourceAutoPool922Toggle() {
    val current = BiliClient.prefs.v922resourceAutoPool922
    BiliClient.prefs.v922resourceAutoPool922 = !current
    AppToast.show(this, "Resource Auto Pool922: ${if (!current) "ON" else "OFF"}")
}

// v922: Response Auto Cache922
internal fun PlayerActivity.showV922ResponseAutoCache922Toggle() {
    val current = BiliClient.prefs.v922responseAutoCache922
    BiliClient.prefs.v922responseAutoCache922 = !current
    AppToast.show(this, "Response Auto Cache922: ${if (!current) "ON" else "OFF"}")
}

// v922: Restart Auto Recover922
internal fun PlayerActivity.showV922RestartAutoRecover922Toggle() {
    val current = BiliClient.prefs.v922restartAutoRecover922
    BiliClient.prefs.v922restartAutoRecover922 = !current
    AppToast.show(this, "Restart Auto Recover922: ${if (!current) "ON" else "OFF"}")
}

// v922: Restore Auto Backup922
internal fun PlayerActivity.showV922RestoreAutoBackup922Toggle() {
    val current = BiliClient.prefs.v922restoreAutoBackup922
    BiliClient.prefs.v922restoreAutoBackup922 = !current
    AppToast.show(this, "Restore Auto Backup922: ${if (!current) "ON" else "OFF"}")
}

// v922: Result Auto Sort922
internal fun PlayerActivity.showV922ResultAutoSort922Toggle() {
    val current = BiliClient.prefs.v922resultAutoSort922
    BiliClient.prefs.v922resultAutoSort922 = !current
    AppToast.show(this, "Result Auto Sort922: ${if (!current) "ON" else "OFF"}")
}

// v922: Retry Auto Backoff922
internal fun PlayerActivity.showV922RetryAutoBackoff922Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v922retryAutoBackoff922).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff922",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v922retryAutoBackoff922 = value
        AppToast.show(this, "Retry Auto Backoff922: $value")
    }
}

// v922: Return Auto Home922
internal fun PlayerActivity.showV922ReturnAutoHome922Toggle() {
    val current = BiliClient.prefs.v922returnAutoHome922
    BiliClient.prefs.v922returnAutoHome922 = !current
    AppToast.show(this, "Return Auto Home922: ${if (!current) "ON" else "OFF"}")
}

// v922: Reverse Auto Order922
internal fun PlayerActivity.showV922ReverseAutoOrder922Toggle() {
    val current = BiliClient.prefs.v922reverseAutoOrder922
    BiliClient.prefs.v922reverseAutoOrder922 = !current
    AppToast.show(this, "Reverse Auto Order922: ${if (!current) "ON" else "OFF"}")
}

// v923: Replace Auto Regex923
internal fun PlayerActivity.showV923ReplaceAutoRegex923Toggle() {
    val current = BiliClient.prefs.v923replaceAutoRegex923
    BiliClient.prefs.v923replaceAutoRegex923 = !current
    AppToast.show(this, "Replace Auto Regex923: ${if (!current) "ON" else "OFF"}")
}

// v923: Report Auto Crash923
internal fun PlayerActivity.showV923ReportAutoCrash923Toggle() {
    val current = BiliClient.prefs.v923reportAutoCrash923
    BiliClient.prefs.v923reportAutoCrash923 = !current
    AppToast.show(this, "Report Auto Crash923: ${if (!current) "ON" else "OFF"}")
}

// v923: Request Auto Retry923
internal fun PlayerActivity.showV923RequestAutoRetry923Toggle() {
    val current = BiliClient.prefs.v923requestAutoRetry923
    BiliClient.prefs.v923requestAutoRetry923 = !current
    AppToast.show(this, "Request Auto Retry923: ${if (!current) "ON" else "OFF"}")
}

// v923: Require Auto Auth923
internal fun PlayerActivity.showV923RequireAutoAuth923Toggle() {
    val current = BiliClient.prefs.v923requireAutoAuth923
    BiliClient.prefs.v923requireAutoAuth923 = !current
    AppToast.show(this, "Require Auto Auth923: ${if (!current) "ON" else "OFF"}")
}

// v923: Reset Auto Default923
internal fun PlayerActivity.showV923ResetAutoDefault923Toggle() {
    val current = BiliClient.prefs.v923resetAutoDefault923
    BiliClient.prefs.v923resetAutoDefault923 = !current
    AppToast.show(this, "Reset Auto Default923: ${if (!current) "ON" else "OFF"}")
}

// v923: Resize Auto Fit923
internal fun PlayerActivity.showV923ResizeAutoFit923Toggle() {
    val current = BiliClient.prefs.v923resizeAutoFit923
    BiliClient.prefs.v923resizeAutoFit923 = !current
    AppToast.show(this, "Resize Auto Fit923: ${if (!current) "ON" else "OFF"}")
}

// v923: Resolve Auto Dns923
internal fun PlayerActivity.showV923ResolveAutoDns923Toggle() {
    val current = BiliClient.prefs.v923resolveAutoDns923
    BiliClient.prefs.v923resolveAutoDns923 = !current
    AppToast.show(this, "Resolve Auto Dns923: ${if (!current) "ON" else "OFF"}")
}

// v923: Resource Auto Pool923
internal fun PlayerActivity.showV923ResourceAutoPool923Toggle() {
    val current = BiliClient.prefs.v923resourceAutoPool923
    BiliClient.prefs.v923resourceAutoPool923 = !current
    AppToast.show(this, "Resource Auto Pool923: ${if (!current) "ON" else "OFF"}")
}

// v923: Response Auto Cache923
internal fun PlayerActivity.showV923ResponseAutoCache923Toggle() {
    val current = BiliClient.prefs.v923responseAutoCache923
    BiliClient.prefs.v923responseAutoCache923 = !current
    AppToast.show(this, "Response Auto Cache923: ${if (!current) "ON" else "OFF"}")
}

// v923: Restart Auto Recover923
internal fun PlayerActivity.showV923RestartAutoRecover923Toggle() {
    val current = BiliClient.prefs.v923restartAutoRecover923
    BiliClient.prefs.v923restartAutoRecover923 = !current
    AppToast.show(this, "Restart Auto Recover923: ${if (!current) "ON" else "OFF"}")
}

// v923: Restore Auto Backup923
internal fun PlayerActivity.showV923RestoreAutoBackup923Toggle() {
    val current = BiliClient.prefs.v923restoreAutoBackup923
    BiliClient.prefs.v923restoreAutoBackup923 = !current
    AppToast.show(this, "Restore Auto Backup923: ${if (!current) "ON" else "OFF"}")
}

// v923: Result Auto Sort923
internal fun PlayerActivity.showV923ResultAutoSort923Toggle() {
    val current = BiliClient.prefs.v923resultAutoSort923
    BiliClient.prefs.v923resultAutoSort923 = !current
    AppToast.show(this, "Result Auto Sort923: ${if (!current) "ON" else "OFF"}")
}

// v923: Retry Auto Backoff923
internal fun PlayerActivity.showV923RetryAutoBackoff923Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v923retryAutoBackoff923).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff923",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v923retryAutoBackoff923 = value
        AppToast.show(this, "Retry Auto Backoff923: $value")
    }
}

// v923: Return Auto Home923
internal fun PlayerActivity.showV923ReturnAutoHome923Toggle() {
    val current = BiliClient.prefs.v923returnAutoHome923
    BiliClient.prefs.v923returnAutoHome923 = !current
    AppToast.show(this, "Return Auto Home923: ${if (!current) "ON" else "OFF"}")
}

// v923: Reverse Auto Order923
internal fun PlayerActivity.showV923ReverseAutoOrder923Toggle() {
    val current = BiliClient.prefs.v923reverseAutoOrder923
    BiliClient.prefs.v923reverseAutoOrder923 = !current
    AppToast.show(this, "Reverse Auto Order923: ${if (!current) "ON" else "OFF"}")
}

// v924: Replace Auto Regex924
internal fun PlayerActivity.showV924ReplaceAutoRegex924Toggle() {
    val current = BiliClient.prefs.v924replaceAutoRegex924
    BiliClient.prefs.v924replaceAutoRegex924 = !current
    AppToast.show(this, "Replace Auto Regex924: ${if (!current) "ON" else "OFF"}")
}

// v924: Report Auto Crash924
internal fun PlayerActivity.showV924ReportAutoCrash924Toggle() {
    val current = BiliClient.prefs.v924reportAutoCrash924
    BiliClient.prefs.v924reportAutoCrash924 = !current
    AppToast.show(this, "Report Auto Crash924: ${if (!current) "ON" else "OFF"}")
}

// v924: Request Auto Retry924
internal fun PlayerActivity.showV924RequestAutoRetry924Toggle() {
    val current = BiliClient.prefs.v924requestAutoRetry924
    BiliClient.prefs.v924requestAutoRetry924 = !current
    AppToast.show(this, "Request Auto Retry924: ${if (!current) "ON" else "OFF"}")
}

// v924: Require Auto Auth924
internal fun PlayerActivity.showV924RequireAutoAuth924Toggle() {
    val current = BiliClient.prefs.v924requireAutoAuth924
    BiliClient.prefs.v924requireAutoAuth924 = !current
    AppToast.show(this, "Require Auto Auth924: ${if (!current) "ON" else "OFF"}")
}

// v924: Reset Auto Default924
internal fun PlayerActivity.showV924ResetAutoDefault924Toggle() {
    val current = BiliClient.prefs.v924resetAutoDefault924
    BiliClient.prefs.v924resetAutoDefault924 = !current
    AppToast.show(this, "Reset Auto Default924: ${if (!current) "ON" else "OFF"}")
}

// v924: Resize Auto Fit924
internal fun PlayerActivity.showV924ResizeAutoFit924Toggle() {
    val current = BiliClient.prefs.v924resizeAutoFit924
    BiliClient.prefs.v924resizeAutoFit924 = !current
    AppToast.show(this, "Resize Auto Fit924: ${if (!current) "ON" else "OFF"}")
}

// v924: Resolve Auto Dns924
internal fun PlayerActivity.showV924ResolveAutoDns924Toggle() {
    val current = BiliClient.prefs.v924resolveAutoDns924
    BiliClient.prefs.v924resolveAutoDns924 = !current
    AppToast.show(this, "Resolve Auto Dns924: ${if (!current) "ON" else "OFF"}")
}

// v924: Resource Auto Pool924
internal fun PlayerActivity.showV924ResourceAutoPool924Toggle() {
    val current = BiliClient.prefs.v924resourceAutoPool924
    BiliClient.prefs.v924resourceAutoPool924 = !current
    AppToast.show(this, "Resource Auto Pool924: ${if (!current) "ON" else "OFF"}")
}

// v924: Response Auto Cache924
internal fun PlayerActivity.showV924ResponseAutoCache924Toggle() {
    val current = BiliClient.prefs.v924responseAutoCache924
    BiliClient.prefs.v924responseAutoCache924 = !current
    AppToast.show(this, "Response Auto Cache924: ${if (!current) "ON" else "OFF"}")
}

// v924: Restart Auto Recover924
internal fun PlayerActivity.showV924RestartAutoRecover924Toggle() {
    val current = BiliClient.prefs.v924restartAutoRecover924
    BiliClient.prefs.v924restartAutoRecover924 = !current
    AppToast.show(this, "Restart Auto Recover924: ${if (!current) "ON" else "OFF"}")
}

// v924: Restore Auto Backup924
internal fun PlayerActivity.showV924RestoreAutoBackup924Toggle() {
    val current = BiliClient.prefs.v924restoreAutoBackup924
    BiliClient.prefs.v924restoreAutoBackup924 = !current
    AppToast.show(this, "Restore Auto Backup924: ${if (!current) "ON" else "OFF"}")
}

// v924: Result Auto Sort924
internal fun PlayerActivity.showV924ResultAutoSort924Toggle() {
    val current = BiliClient.prefs.v924resultAutoSort924
    BiliClient.prefs.v924resultAutoSort924 = !current
    AppToast.show(this, "Result Auto Sort924: ${if (!current) "ON" else "OFF"}")
}

// v924: Retry Auto Backoff924
internal fun PlayerActivity.showV924RetryAutoBackoff924Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v924retryAutoBackoff924).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff924",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v924retryAutoBackoff924 = value
        AppToast.show(this, "Retry Auto Backoff924: $value")
    }
}

// v924: Return Auto Home924
internal fun PlayerActivity.showV924ReturnAutoHome924Toggle() {
    val current = BiliClient.prefs.v924returnAutoHome924
    BiliClient.prefs.v924returnAutoHome924 = !current
    AppToast.show(this, "Return Auto Home924: ${if (!current) "ON" else "OFF"}")
}

// v924: Reverse Auto Order924
internal fun PlayerActivity.showV924ReverseAutoOrder924Toggle() {
    val current = BiliClient.prefs.v924reverseAutoOrder924
    BiliClient.prefs.v924reverseAutoOrder924 = !current
    AppToast.show(this, "Reverse Auto Order924: ${if (!current) "ON" else "OFF"}")
}

// v925: Replace Auto Regex925
internal fun PlayerActivity.showV925ReplaceAutoRegex925Toggle() {
    val current = BiliClient.prefs.v925replaceAutoRegex925
    BiliClient.prefs.v925replaceAutoRegex925 = !current
    AppToast.show(this, "Replace Auto Regex925: ${if (!current) "ON" else "OFF"}")
}

// v925: Report Auto Crash925
internal fun PlayerActivity.showV925ReportAutoCrash925Toggle() {
    val current = BiliClient.prefs.v925reportAutoCrash925
    BiliClient.prefs.v925reportAutoCrash925 = !current
    AppToast.show(this, "Report Auto Crash925: ${if (!current) "ON" else "OFF"}")
}

// v925: Request Auto Retry925
internal fun PlayerActivity.showV925RequestAutoRetry925Toggle() {
    val current = BiliClient.prefs.v925requestAutoRetry925
    BiliClient.prefs.v925requestAutoRetry925 = !current
    AppToast.show(this, "Request Auto Retry925: ${if (!current) "ON" else "OFF"}")
}

// v925: Require Auto Auth925
internal fun PlayerActivity.showV925RequireAutoAuth925Toggle() {
    val current = BiliClient.prefs.v925requireAutoAuth925
    BiliClient.prefs.v925requireAutoAuth925 = !current
    AppToast.show(this, "Require Auto Auth925: ${if (!current) "ON" else "OFF"}")
}

// v925: Reset Auto Default925
internal fun PlayerActivity.showV925ResetAutoDefault925Toggle() {
    val current = BiliClient.prefs.v925resetAutoDefault925
    BiliClient.prefs.v925resetAutoDefault925 = !current
    AppToast.show(this, "Reset Auto Default925: ${if (!current) "ON" else "OFF"}")
}

// v925: Resize Auto Fit925
internal fun PlayerActivity.showV925ResizeAutoFit925Toggle() {
    val current = BiliClient.prefs.v925resizeAutoFit925
    BiliClient.prefs.v925resizeAutoFit925 = !current
    AppToast.show(this, "Resize Auto Fit925: ${if (!current) "ON" else "OFF"}")
}

// v925: Resolve Auto Dns925
internal fun PlayerActivity.showV925ResolveAutoDns925Toggle() {
    val current = BiliClient.prefs.v925resolveAutoDns925
    BiliClient.prefs.v925resolveAutoDns925 = !current
    AppToast.show(this, "Resolve Auto Dns925: ${if (!current) "ON" else "OFF"}")
}

// v925: Resource Auto Pool925
internal fun PlayerActivity.showV925ResourceAutoPool925Toggle() {
    val current = BiliClient.prefs.v925resourceAutoPool925
    BiliClient.prefs.v925resourceAutoPool925 = !current
    AppToast.show(this, "Resource Auto Pool925: ${if (!current) "ON" else "OFF"}")
}

// v925: Response Auto Cache925
internal fun PlayerActivity.showV925ResponseAutoCache925Toggle() {
    val current = BiliClient.prefs.v925responseAutoCache925
    BiliClient.prefs.v925responseAutoCache925 = !current
    AppToast.show(this, "Response Auto Cache925: ${if (!current) "ON" else "OFF"}")
}

// v925: Restart Auto Recover925
internal fun PlayerActivity.showV925RestartAutoRecover925Toggle() {
    val current = BiliClient.prefs.v925restartAutoRecover925
    BiliClient.prefs.v925restartAutoRecover925 = !current
    AppToast.show(this, "Restart Auto Recover925: ${if (!current) "ON" else "OFF"}")
}

// v925: Restore Auto Backup925
internal fun PlayerActivity.showV925RestoreAutoBackup925Toggle() {
    val current = BiliClient.prefs.v925restoreAutoBackup925
    BiliClient.prefs.v925restoreAutoBackup925 = !current
    AppToast.show(this, "Restore Auto Backup925: ${if (!current) "ON" else "OFF"}")
}

// v925: Result Auto Sort925
internal fun PlayerActivity.showV925ResultAutoSort925Toggle() {
    val current = BiliClient.prefs.v925resultAutoSort925
    BiliClient.prefs.v925resultAutoSort925 = !current
    AppToast.show(this, "Result Auto Sort925: ${if (!current) "ON" else "OFF"}")
}

// v925: Retry Auto Backoff925
internal fun PlayerActivity.showV925RetryAutoBackoff925Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v925retryAutoBackoff925).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff925",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v925retryAutoBackoff925 = value
        AppToast.show(this, "Retry Auto Backoff925: $value")
    }
}

// v925: Return Auto Home925
internal fun PlayerActivity.showV925ReturnAutoHome925Toggle() {
    val current = BiliClient.prefs.v925returnAutoHome925
    BiliClient.prefs.v925returnAutoHome925 = !current
    AppToast.show(this, "Return Auto Home925: ${if (!current) "ON" else "OFF"}")
}

// v925: Reverse Auto Order925
internal fun PlayerActivity.showV925ReverseAutoOrder925Toggle() {
    val current = BiliClient.prefs.v925reverseAutoOrder925
    BiliClient.prefs.v925reverseAutoOrder925 = !current
    AppToast.show(this, "Reverse Auto Order925: ${if (!current) "ON" else "OFF"}")
}

// v926: Replace Auto Regex926
internal fun PlayerActivity.showV926ReplaceAutoRegex926Toggle() {
    val current = BiliClient.prefs.v926replaceAutoRegex926
    BiliClient.prefs.v926replaceAutoRegex926 = !current
    AppToast.show(this, "Replace Auto Regex926: ${if (!current) "ON" else "OFF"}")
}

// v926: Report Auto Crash926
internal fun PlayerActivity.showV926ReportAutoCrash926Toggle() {
    val current = BiliClient.prefs.v926reportAutoCrash926
    BiliClient.prefs.v926reportAutoCrash926 = !current
    AppToast.show(this, "Report Auto Crash926: ${if (!current) "ON" else "OFF"}")
}

// v926: Request Auto Retry926
internal fun PlayerActivity.showV926RequestAutoRetry926Toggle() {
    val current = BiliClient.prefs.v926requestAutoRetry926
    BiliClient.prefs.v926requestAutoRetry926 = !current
    AppToast.show(this, "Request Auto Retry926: ${if (!current) "ON" else "OFF"}")
}

// v926: Require Auto Auth926
internal fun PlayerActivity.showV926RequireAutoAuth926Toggle() {
    val current = BiliClient.prefs.v926requireAutoAuth926
    BiliClient.prefs.v926requireAutoAuth926 = !current
    AppToast.show(this, "Require Auto Auth926: ${if (!current) "ON" else "OFF"}")
}

// v926: Reset Auto Default926
internal fun PlayerActivity.showV926ResetAutoDefault926Toggle() {
    val current = BiliClient.prefs.v926resetAutoDefault926
    BiliClient.prefs.v926resetAutoDefault926 = !current
    AppToast.show(this, "Reset Auto Default926: ${if (!current) "ON" else "OFF"}")
}

// v926: Resize Auto Fit926
internal fun PlayerActivity.showV926ResizeAutoFit926Toggle() {
    val current = BiliClient.prefs.v926resizeAutoFit926
    BiliClient.prefs.v926resizeAutoFit926 = !current
    AppToast.show(this, "Resize Auto Fit926: ${if (!current) "ON" else "OFF"}")
}

// v926: Resolve Auto Dns926
internal fun PlayerActivity.showV926ResolveAutoDns926Toggle() {
    val current = BiliClient.prefs.v926resolveAutoDns926
    BiliClient.prefs.v926resolveAutoDns926 = !current
    AppToast.show(this, "Resolve Auto Dns926: ${if (!current) "ON" else "OFF"}")
}

// v926: Resource Auto Pool926
internal fun PlayerActivity.showV926ResourceAutoPool926Toggle() {
    val current = BiliClient.prefs.v926resourceAutoPool926
    BiliClient.prefs.v926resourceAutoPool926 = !current
    AppToast.show(this, "Resource Auto Pool926: ${if (!current) "ON" else "OFF"}")
}

// v926: Response Auto Cache926
internal fun PlayerActivity.showV926ResponseAutoCache926Toggle() {
    val current = BiliClient.prefs.v926responseAutoCache926
    BiliClient.prefs.v926responseAutoCache926 = !current
    AppToast.show(this, "Response Auto Cache926: ${if (!current) "ON" else "OFF"}")
}

// v926: Restart Auto Recover926
internal fun PlayerActivity.showV926RestartAutoRecover926Toggle() {
    val current = BiliClient.prefs.v926restartAutoRecover926
    BiliClient.prefs.v926restartAutoRecover926 = !current
    AppToast.show(this, "Restart Auto Recover926: ${if (!current) "ON" else "OFF"}")
}

// v926: Restore Auto Backup926
internal fun PlayerActivity.showV926RestoreAutoBackup926Toggle() {
    val current = BiliClient.prefs.v926restoreAutoBackup926
    BiliClient.prefs.v926restoreAutoBackup926 = !current
    AppToast.show(this, "Restore Auto Backup926: ${if (!current) "ON" else "OFF"}")
}

// v926: Result Auto Sort926
internal fun PlayerActivity.showV926ResultAutoSort926Toggle() {
    val current = BiliClient.prefs.v926resultAutoSort926
    BiliClient.prefs.v926resultAutoSort926 = !current
    AppToast.show(this, "Result Auto Sort926: ${if (!current) "ON" else "OFF"}")
}

// v926: Retry Auto Backoff926
internal fun PlayerActivity.showV926RetryAutoBackoff926Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v926retryAutoBackoff926).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff926",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v926retryAutoBackoff926 = value
        AppToast.show(this, "Retry Auto Backoff926: $value")
    }
}

// v926: Return Auto Home926
internal fun PlayerActivity.showV926ReturnAutoHome926Toggle() {
    val current = BiliClient.prefs.v926returnAutoHome926
    BiliClient.prefs.v926returnAutoHome926 = !current
    AppToast.show(this, "Return Auto Home926: ${if (!current) "ON" else "OFF"}")
}

// v926: Reverse Auto Order926
internal fun PlayerActivity.showV926ReverseAutoOrder926Toggle() {
    val current = BiliClient.prefs.v926reverseAutoOrder926
    BiliClient.prefs.v926reverseAutoOrder926 = !current
    AppToast.show(this, "Reverse Auto Order926: ${if (!current) "ON" else "OFF"}")
}

// v927: Replace Auto Regex927
internal fun PlayerActivity.showV927ReplaceAutoRegex927Toggle() {
    val current = BiliClient.prefs.v927replaceAutoRegex927
    BiliClient.prefs.v927replaceAutoRegex927 = !current
    AppToast.show(this, "Replace Auto Regex927: ${if (!current) "ON" else "OFF"}")
}

// v927: Report Auto Crash927
internal fun PlayerActivity.showV927ReportAutoCrash927Toggle() {
    val current = BiliClient.prefs.v927reportAutoCrash927
    BiliClient.prefs.v927reportAutoCrash927 = !current
    AppToast.show(this, "Report Auto Crash927: ${if (!current) "ON" else "OFF"}")
}

// v927: Request Auto Retry927
internal fun PlayerActivity.showV927RequestAutoRetry927Toggle() {
    val current = BiliClient.prefs.v927requestAutoRetry927
    BiliClient.prefs.v927requestAutoRetry927 = !current
    AppToast.show(this, "Request Auto Retry927: ${if (!current) "ON" else "OFF"}")
}

// v927: Require Auto Auth927
internal fun PlayerActivity.showV927RequireAutoAuth927Toggle() {
    val current = BiliClient.prefs.v927requireAutoAuth927
    BiliClient.prefs.v927requireAutoAuth927 = !current
    AppToast.show(this, "Require Auto Auth927: ${if (!current) "ON" else "OFF"}")
}

// v927: Reset Auto Default927
internal fun PlayerActivity.showV927ResetAutoDefault927Toggle() {
    val current = BiliClient.prefs.v927resetAutoDefault927
    BiliClient.prefs.v927resetAutoDefault927 = !current
    AppToast.show(this, "Reset Auto Default927: ${if (!current) "ON" else "OFF"}")
}

// v927: Resize Auto Fit927
internal fun PlayerActivity.showV927ResizeAutoFit927Toggle() {
    val current = BiliClient.prefs.v927resizeAutoFit927
    BiliClient.prefs.v927resizeAutoFit927 = !current
    AppToast.show(this, "Resize Auto Fit927: ${if (!current) "ON" else "OFF"}")
}

// v927: Resolve Auto Dns927
internal fun PlayerActivity.showV927ResolveAutoDns927Toggle() {
    val current = BiliClient.prefs.v927resolveAutoDns927
    BiliClient.prefs.v927resolveAutoDns927 = !current
    AppToast.show(this, "Resolve Auto Dns927: ${if (!current) "ON" else "OFF"}")
}

// v927: Resource Auto Pool927
internal fun PlayerActivity.showV927ResourceAutoPool927Toggle() {
    val current = BiliClient.prefs.v927resourceAutoPool927
    BiliClient.prefs.v927resourceAutoPool927 = !current
    AppToast.show(this, "Resource Auto Pool927: ${if (!current) "ON" else "OFF"}")
}

// v927: Response Auto Cache927
internal fun PlayerActivity.showV927ResponseAutoCache927Toggle() {
    val current = BiliClient.prefs.v927responseAutoCache927
    BiliClient.prefs.v927responseAutoCache927 = !current
    AppToast.show(this, "Response Auto Cache927: ${if (!current) "ON" else "OFF"}")
}

// v927: Restart Auto Recover927
internal fun PlayerActivity.showV927RestartAutoRecover927Toggle() {
    val current = BiliClient.prefs.v927restartAutoRecover927
    BiliClient.prefs.v927restartAutoRecover927 = !current
    AppToast.show(this, "Restart Auto Recover927: ${if (!current) "ON" else "OFF"}")
}

// v927: Restore Auto Backup927
internal fun PlayerActivity.showV927RestoreAutoBackup927Toggle() {
    val current = BiliClient.prefs.v927restoreAutoBackup927
    BiliClient.prefs.v927restoreAutoBackup927 = !current
    AppToast.show(this, "Restore Auto Backup927: ${if (!current) "ON" else "OFF"}")
}

// v927: Result Auto Sort927
internal fun PlayerActivity.showV927ResultAutoSort927Toggle() {
    val current = BiliClient.prefs.v927resultAutoSort927
    BiliClient.prefs.v927resultAutoSort927 = !current
    AppToast.show(this, "Result Auto Sort927: ${if (!current) "ON" else "OFF"}")
}

// v927: Retry Auto Backoff927
internal fun PlayerActivity.showV927RetryAutoBackoff927Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v927retryAutoBackoff927).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff927",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v927retryAutoBackoff927 = value
        AppToast.show(this, "Retry Auto Backoff927: $value")
    }
}

// v927: Return Auto Home927
internal fun PlayerActivity.showV927ReturnAutoHome927Toggle() {
    val current = BiliClient.prefs.v927returnAutoHome927
    BiliClient.prefs.v927returnAutoHome927 = !current
    AppToast.show(this, "Return Auto Home927: ${if (!current) "ON" else "OFF"}")
}

// v927: Reverse Auto Order927
internal fun PlayerActivity.showV927ReverseAutoOrder927Toggle() {
    val current = BiliClient.prefs.v927reverseAutoOrder927
    BiliClient.prefs.v927reverseAutoOrder927 = !current
    AppToast.show(this, "Reverse Auto Order927: ${if (!current) "ON" else "OFF"}")
}

// v928: Replace Auto Regex928
internal fun PlayerActivity.showV928ReplaceAutoRegex928Toggle() {
    val current = BiliClient.prefs.v928replaceAutoRegex928
    BiliClient.prefs.v928replaceAutoRegex928 = !current
    AppToast.show(this, "Replace Auto Regex928: ${if (!current) "ON" else "OFF"}")
}

// v928: Report Auto Crash928
internal fun PlayerActivity.showV928ReportAutoCrash928Toggle() {
    val current = BiliClient.prefs.v928reportAutoCrash928
    BiliClient.prefs.v928reportAutoCrash928 = !current
    AppToast.show(this, "Report Auto Crash928: ${if (!current) "ON" else "OFF"}")
}

// v928: Request Auto Retry928
internal fun PlayerActivity.showV928RequestAutoRetry928Toggle() {
    val current = BiliClient.prefs.v928requestAutoRetry928
    BiliClient.prefs.v928requestAutoRetry928 = !current
    AppToast.show(this, "Request Auto Retry928: ${if (!current) "ON" else "OFF"}")
}

// v928: Require Auto Auth928
internal fun PlayerActivity.showV928RequireAutoAuth928Toggle() {
    val current = BiliClient.prefs.v928requireAutoAuth928
    BiliClient.prefs.v928requireAutoAuth928 = !current
    AppToast.show(this, "Require Auto Auth928: ${if (!current) "ON" else "OFF"}")
}

// v928: Reset Auto Default928
internal fun PlayerActivity.showV928ResetAutoDefault928Toggle() {
    val current = BiliClient.prefs.v928resetAutoDefault928
    BiliClient.prefs.v928resetAutoDefault928 = !current
    AppToast.show(this, "Reset Auto Default928: ${if (!current) "ON" else "OFF"}")
}

// v928: Resize Auto Fit928
internal fun PlayerActivity.showV928ResizeAutoFit928Toggle() {
    val current = BiliClient.prefs.v928resizeAutoFit928
    BiliClient.prefs.v928resizeAutoFit928 = !current
    AppToast.show(this, "Resize Auto Fit928: ${if (!current) "ON" else "OFF"}")
}

// v928: Resolve Auto Dns928
internal fun PlayerActivity.showV928ResolveAutoDns928Toggle() {
    val current = BiliClient.prefs.v928resolveAutoDns928
    BiliClient.prefs.v928resolveAutoDns928 = !current
    AppToast.show(this, "Resolve Auto Dns928: ${if (!current) "ON" else "OFF"}")
}

// v928: Resource Auto Pool928
internal fun PlayerActivity.showV928ResourceAutoPool928Toggle() {
    val current = BiliClient.prefs.v928resourceAutoPool928
    BiliClient.prefs.v928resourceAutoPool928 = !current
    AppToast.show(this, "Resource Auto Pool928: ${if (!current) "ON" else "OFF"}")
}

// v928: Response Auto Cache928
internal fun PlayerActivity.showV928ResponseAutoCache928Toggle() {
    val current = BiliClient.prefs.v928responseAutoCache928
    BiliClient.prefs.v928responseAutoCache928 = !current
    AppToast.show(this, "Response Auto Cache928: ${if (!current) "ON" else "OFF"}")
}

// v928: Restart Auto Recover928
internal fun PlayerActivity.showV928RestartAutoRecover928Toggle() {
    val current = BiliClient.prefs.v928restartAutoRecover928
    BiliClient.prefs.v928restartAutoRecover928 = !current
    AppToast.show(this, "Restart Auto Recover928: ${if (!current) "ON" else "OFF"}")
}

// v928: Restore Auto Backup928
internal fun PlayerActivity.showV928RestoreAutoBackup928Toggle() {
    val current = BiliClient.prefs.v928restoreAutoBackup928
    BiliClient.prefs.v928restoreAutoBackup928 = !current
    AppToast.show(this, "Restore Auto Backup928: ${if (!current) "ON" else "OFF"}")
}

// v928: Result Auto Sort928
internal fun PlayerActivity.showV928ResultAutoSort928Toggle() {
    val current = BiliClient.prefs.v928resultAutoSort928
    BiliClient.prefs.v928resultAutoSort928 = !current
    AppToast.show(this, "Result Auto Sort928: ${if (!current) "ON" else "OFF"}")
}

// v928: Retry Auto Backoff928
internal fun PlayerActivity.showV928RetryAutoBackoff928Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v928retryAutoBackoff928).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff928",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v928retryAutoBackoff928 = value
        AppToast.show(this, "Retry Auto Backoff928: $value")
    }
}

// v928: Return Auto Home928
internal fun PlayerActivity.showV928ReturnAutoHome928Toggle() {
    val current = BiliClient.prefs.v928returnAutoHome928
    BiliClient.prefs.v928returnAutoHome928 = !current
    AppToast.show(this, "Return Auto Home928: ${if (!current) "ON" else "OFF"}")
}

// v928: Reverse Auto Order928
internal fun PlayerActivity.showV928ReverseAutoOrder928Toggle() {
    val current = BiliClient.prefs.v928reverseAutoOrder928
    BiliClient.prefs.v928reverseAutoOrder928 = !current
    AppToast.show(this, "Reverse Auto Order928: ${if (!current) "ON" else "OFF"}")
}

// v929: Replace Auto Regex929
internal fun PlayerActivity.showV929ReplaceAutoRegex929Toggle() {
    val current = BiliClient.prefs.v929replaceAutoRegex929
    BiliClient.prefs.v929replaceAutoRegex929 = !current
    AppToast.show(this, "Replace Auto Regex929: ${if (!current) "ON" else "OFF"}")
}

// v929: Report Auto Crash929
internal fun PlayerActivity.showV929ReportAutoCrash929Toggle() {
    val current = BiliClient.prefs.v929reportAutoCrash929
    BiliClient.prefs.v929reportAutoCrash929 = !current
    AppToast.show(this, "Report Auto Crash929: ${if (!current) "ON" else "OFF"}")
}

// v929: Request Auto Retry929
internal fun PlayerActivity.showV929RequestAutoRetry929Toggle() {
    val current = BiliClient.prefs.v929requestAutoRetry929
    BiliClient.prefs.v929requestAutoRetry929 = !current
    AppToast.show(this, "Request Auto Retry929: ${if (!current) "ON" else "OFF"}")
}

// v929: Require Auto Auth929
internal fun PlayerActivity.showV929RequireAutoAuth929Toggle() {
    val current = BiliClient.prefs.v929requireAutoAuth929
    BiliClient.prefs.v929requireAutoAuth929 = !current
    AppToast.show(this, "Require Auto Auth929: ${if (!current) "ON" else "OFF"}")
}

// v929: Reset Auto Default929
internal fun PlayerActivity.showV929ResetAutoDefault929Toggle() {
    val current = BiliClient.prefs.v929resetAutoDefault929
    BiliClient.prefs.v929resetAutoDefault929 = !current
    AppToast.show(this, "Reset Auto Default929: ${if (!current) "ON" else "OFF"}")
}

// v929: Resize Auto Fit929
internal fun PlayerActivity.showV929ResizeAutoFit929Toggle() {
    val current = BiliClient.prefs.v929resizeAutoFit929
    BiliClient.prefs.v929resizeAutoFit929 = !current
    AppToast.show(this, "Resize Auto Fit929: ${if (!current) "ON" else "OFF"}")
}

// v929: Resolve Auto Dns929
internal fun PlayerActivity.showV929ResolveAutoDns929Toggle() {
    val current = BiliClient.prefs.v929resolveAutoDns929
    BiliClient.prefs.v929resolveAutoDns929 = !current
    AppToast.show(this, "Resolve Auto Dns929: ${if (!current) "ON" else "OFF"}")
}

// v929: Resource Auto Pool929
internal fun PlayerActivity.showV929ResourceAutoPool929Toggle() {
    val current = BiliClient.prefs.v929resourceAutoPool929
    BiliClient.prefs.v929resourceAutoPool929 = !current
    AppToast.show(this, "Resource Auto Pool929: ${if (!current) "ON" else "OFF"}")
}

// v929: Response Auto Cache929
internal fun PlayerActivity.showV929ResponseAutoCache929Toggle() {
    val current = BiliClient.prefs.v929responseAutoCache929
    BiliClient.prefs.v929responseAutoCache929 = !current
    AppToast.show(this, "Response Auto Cache929: ${if (!current) "ON" else "OFF"}")
}

// v929: Restart Auto Recover929
internal fun PlayerActivity.showV929RestartAutoRecover929Toggle() {
    val current = BiliClient.prefs.v929restartAutoRecover929
    BiliClient.prefs.v929restartAutoRecover929 = !current
    AppToast.show(this, "Restart Auto Recover929: ${if (!current) "ON" else "OFF"}")
}

// v929: Restore Auto Backup929
internal fun PlayerActivity.showV929RestoreAutoBackup929Toggle() {
    val current = BiliClient.prefs.v929restoreAutoBackup929
    BiliClient.prefs.v929restoreAutoBackup929 = !current
    AppToast.show(this, "Restore Auto Backup929: ${if (!current) "ON" else "OFF"}")
}

// v929: Result Auto Sort929
internal fun PlayerActivity.showV929ResultAutoSort929Toggle() {
    val current = BiliClient.prefs.v929resultAutoSort929
    BiliClient.prefs.v929resultAutoSort929 = !current
    AppToast.show(this, "Result Auto Sort929: ${if (!current) "ON" else "OFF"}")
}

// v929: Retry Auto Backoff929
internal fun PlayerActivity.showV929RetryAutoBackoff929Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v929retryAutoBackoff929).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff929",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v929retryAutoBackoff929 = value
        AppToast.show(this, "Retry Auto Backoff929: $value")
    }
}

// v929: Return Auto Home929
internal fun PlayerActivity.showV929ReturnAutoHome929Toggle() {
    val current = BiliClient.prefs.v929returnAutoHome929
    BiliClient.prefs.v929returnAutoHome929 = !current
    AppToast.show(this, "Return Auto Home929: ${if (!current) "ON" else "OFF"}")
}

// v929: Reverse Auto Order929
internal fun PlayerActivity.showV929ReverseAutoOrder929Toggle() {
    val current = BiliClient.prefs.v929reverseAutoOrder929
    BiliClient.prefs.v929reverseAutoOrder929 = !current
    AppToast.show(this, "Reverse Auto Order929: ${if (!current) "ON" else "OFF"}")
}

// v930: Replace Auto Regex930
internal fun PlayerActivity.showV930ReplaceAutoRegex930Toggle() {
    val current = BiliClient.prefs.v930replaceAutoRegex930
    BiliClient.prefs.v930replaceAutoRegex930 = !current
    AppToast.show(this, "Replace Auto Regex930: ${if (!current) "ON" else "OFF"}")
}

// v930: Report Auto Crash930
internal fun PlayerActivity.showV930ReportAutoCrash930Toggle() {
    val current = BiliClient.prefs.v930reportAutoCrash930
    BiliClient.prefs.v930reportAutoCrash930 = !current
    AppToast.show(this, "Report Auto Crash930: ${if (!current) "ON" else "OFF"}")
}

// v930: Request Auto Retry930
internal fun PlayerActivity.showV930RequestAutoRetry930Toggle() {
    val current = BiliClient.prefs.v930requestAutoRetry930
    BiliClient.prefs.v930requestAutoRetry930 = !current
    AppToast.show(this, "Request Auto Retry930: ${if (!current) "ON" else "OFF"}")
}

// v930: Require Auto Auth930
internal fun PlayerActivity.showV930RequireAutoAuth930Toggle() {
    val current = BiliClient.prefs.v930requireAutoAuth930
    BiliClient.prefs.v930requireAutoAuth930 = !current
    AppToast.show(this, "Require Auto Auth930: ${if (!current) "ON" else "OFF"}")
}

// v930: Reset Auto Default930
internal fun PlayerActivity.showV930ResetAutoDefault930Toggle() {
    val current = BiliClient.prefs.v930resetAutoDefault930
    BiliClient.prefs.v930resetAutoDefault930 = !current
    AppToast.show(this, "Reset Auto Default930: ${if (!current) "ON" else "OFF"}")
}

// v930: Resize Auto Fit930
internal fun PlayerActivity.showV930ResizeAutoFit930Toggle() {
    val current = BiliClient.prefs.v930resizeAutoFit930
    BiliClient.prefs.v930resizeAutoFit930 = !current
    AppToast.show(this, "Resize Auto Fit930: ${if (!current) "ON" else "OFF"}")
}

// v930: Resolve Auto Dns930
internal fun PlayerActivity.showV930ResolveAutoDns930Toggle() {
    val current = BiliClient.prefs.v930resolveAutoDns930
    BiliClient.prefs.v930resolveAutoDns930 = !current
    AppToast.show(this, "Resolve Auto Dns930: ${if (!current) "ON" else "OFF"}")
}

// v930: Resource Auto Pool930
internal fun PlayerActivity.showV930ResourceAutoPool930Toggle() {
    val current = BiliClient.prefs.v930resourceAutoPool930
    BiliClient.prefs.v930resourceAutoPool930 = !current
    AppToast.show(this, "Resource Auto Pool930: ${if (!current) "ON" else "OFF"}")
}

// v930: Response Auto Cache930
internal fun PlayerActivity.showV930ResponseAutoCache930Toggle() {
    val current = BiliClient.prefs.v930responseAutoCache930
    BiliClient.prefs.v930responseAutoCache930 = !current
    AppToast.show(this, "Response Auto Cache930: ${if (!current) "ON" else "OFF"}")
}

// v930: Restart Auto Recover930
internal fun PlayerActivity.showV930RestartAutoRecover930Toggle() {
    val current = BiliClient.prefs.v930restartAutoRecover930
    BiliClient.prefs.v930restartAutoRecover930 = !current
    AppToast.show(this, "Restart Auto Recover930: ${if (!current) "ON" else "OFF"}")
}

// v930: Restore Auto Backup930
internal fun PlayerActivity.showV930RestoreAutoBackup930Toggle() {
    val current = BiliClient.prefs.v930restoreAutoBackup930
    BiliClient.prefs.v930restoreAutoBackup930 = !current
    AppToast.show(this, "Restore Auto Backup930: ${if (!current) "ON" else "OFF"}")
}

// v930: Result Auto Sort930
internal fun PlayerActivity.showV930ResultAutoSort930Toggle() {
    val current = BiliClient.prefs.v930resultAutoSort930
    BiliClient.prefs.v930resultAutoSort930 = !current
    AppToast.show(this, "Result Auto Sort930: ${if (!current) "ON" else "OFF"}")
}

// v930: Retry Auto Backoff930
internal fun PlayerActivity.showV930RetryAutoBackoff930Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v930retryAutoBackoff930).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Retry Auto Backoff930",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v930retryAutoBackoff930 = value
        AppToast.show(this, "Retry Auto Backoff930: $value")
    }
}

// v930: Return Auto Home930
internal fun PlayerActivity.showV930ReturnAutoHome930Toggle() {
    val current = BiliClient.prefs.v930returnAutoHome930
    BiliClient.prefs.v930returnAutoHome930 = !current
    AppToast.show(this, "Return Auto Home930: ${if (!current) "ON" else "OFF"}")
}

// v930: Reverse Auto Order930
internal fun PlayerActivity.showV930ReverseAutoOrder930Toggle() {
    val current = BiliClient.prefs.v930reverseAutoOrder930
    BiliClient.prefs.v930reverseAutoOrder930 = !current
    AppToast.show(this, "Reverse Auto Order930: ${if (!current) "ON" else "OFF"}")
}

