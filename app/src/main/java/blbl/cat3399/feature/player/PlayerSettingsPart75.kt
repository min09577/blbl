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

// v931: Revert Auto Version931
internal fun PlayerActivity.showV931RevertAutoVersion931Toggle() {
    val current = BiliClient.prefs.v931revertAutoVersion931
    BiliClient.prefs.v931revertAutoVersion931 = !current
    AppToast.show(this, "Revert Auto Version931: ${if (!current) "ON" else "OFF"}")
}

// v931: Right Auto Panel931
internal fun PlayerActivity.showV931RightAutoPanel931Toggle() {
    val current = BiliClient.prefs.v931rightAutoPanel931
    BiliClient.prefs.v931rightAutoPanel931 = !current
    AppToast.show(this, "Right Auto Panel931: ${if (!current) "ON" else "OFF"}")
}

// v931: Role Auto Permission931
internal fun PlayerActivity.showV931RoleAutoPermission931Toggle() {
    val current = BiliClient.prefs.v931roleAutoPermission931
    BiliClient.prefs.v931roleAutoPermission931 = !current
    AppToast.show(this, "Role Auto Permission931: ${if (!current) "ON" else "OFF"}")
}

// v931: Root Auto Detect931
internal fun PlayerActivity.showV931RootAutoDetect931Toggle() {
    val current = BiliClient.prefs.v931rootAutoDetect931
    BiliClient.prefs.v931rootAutoDetect931 = !current
    AppToast.show(this, "Root Auto Detect931: ${if (!current) "ON" else "OFF"}")
}

// v931: Rotate Auto Sensor931
internal fun PlayerActivity.showV931RotateAutoSensor931Toggle() {
    val current = BiliClient.prefs.v931rotateAutoSensor931
    BiliClient.prefs.v931rotateAutoSensor931 = !current
    AppToast.show(this, "Rotate Auto Sensor931: ${if (!current) "ON" else "OFF"}")
}

// v931: Round Auto Corner931
internal fun PlayerActivity.showV931RoundAutoCorner931Toggle() {
    val current = BiliClient.prefs.v931roundAutoCorner931
    BiliClient.prefs.v931roundAutoCorner931 = !current
    AppToast.show(this, "Round Auto Corner931: ${if (!current) "ON" else "OFF"}")
}

// v931: Route Auto Navigate931
internal fun PlayerActivity.showV931RouteAutoNavigate931Toggle() {
    val current = BiliClient.prefs.v931routeAutoNavigate931
    BiliClient.prefs.v931routeAutoNavigate931 = !current
    AppToast.show(this, "Route Auto Navigate931: ${if (!current) "ON" else "OFF"}")
}

// v931: Row Auto Height931
internal fun PlayerActivity.showV931RowAutoHeight931Toggle() {
    val current = BiliClient.prefs.v931rowAutoHeight931
    BiliClient.prefs.v931rowAutoHeight931 = !current
    AppToast.show(this, "Row Auto Height931: ${if (!current) "ON" else "OFF"}")
}

// v931: Rule Auto Engine931
internal fun PlayerActivity.showV931RuleAutoEngine931Toggle() {
    val current = BiliClient.prefs.v931ruleAutoEngine931
    BiliClient.prefs.v931ruleAutoEngine931 = !current
    AppToast.show(this, "Rule Auto Engine931: ${if (!current) "ON" else "OFF"}")
}

// v931: Run Auto Startup931
internal fun PlayerActivity.showV931RunAutoStartup931Toggle() {
    val current = BiliClient.prefs.v931runAutoStartup931
    BiliClient.prefs.v931runAutoStartup931 = !current
    AppToast.show(this, "Run Auto Startup931: ${if (!current) "ON" else "OFF"}")
}

// v931: Runtime Auto Config931
internal fun PlayerActivity.showV931RuntimeAutoConfig931Toggle() {
    val current = BiliClient.prefs.v931runtimeAutoConfig931
    BiliClient.prefs.v931runtimeAutoConfig931 = !current
    AppToast.show(this, "Runtime Auto Config931: ${if (!current) "ON" else "OFF"}")
}

// v931: Safe Auto Mode931
internal fun PlayerActivity.showV931SafeAutoMode931Toggle() {
    val current = BiliClient.prefs.v931safeAutoMode931
    BiliClient.prefs.v931safeAutoMode931 = !current
    AppToast.show(this, "Safe Auto Mode931: ${if (!current) "ON" else "OFF"}")
}

// v931: Sample Auto Rate931
internal fun PlayerActivity.showV931SampleAutoRate931Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v931sampleAutoRate931).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate931",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v931sampleAutoRate931 = value
        AppToast.show(this, "Sample Auto Rate931: $value")
    }
}

// v931: Save Auto Draft931
internal fun PlayerActivity.showV931SaveAutoDraft931Toggle() {
    val current = BiliClient.prefs.v931saveAutoDraft931
    BiliClient.prefs.v931saveAutoDraft931 = !current
    AppToast.show(this, "Save Auto Draft931: ${if (!current) "ON" else "OFF"}")
}

// v931: Scale Auto Dpi931
internal fun PlayerActivity.showV931ScaleAutoDpi931Toggle() {
    val current = BiliClient.prefs.v931scaleAutoDpi931
    BiliClient.prefs.v931scaleAutoDpi931 = !current
    AppToast.show(this, "Scale Auto Dpi931: ${if (!current) "ON" else "OFF"}")
}

// v932: Revert Auto Version932
internal fun PlayerActivity.showV932RevertAutoVersion932Toggle() {
    val current = BiliClient.prefs.v932revertAutoVersion932
    BiliClient.prefs.v932revertAutoVersion932 = !current
    AppToast.show(this, "Revert Auto Version932: ${if (!current) "ON" else "OFF"}")
}

// v932: Right Auto Panel932
internal fun PlayerActivity.showV932RightAutoPanel932Toggle() {
    val current = BiliClient.prefs.v932rightAutoPanel932
    BiliClient.prefs.v932rightAutoPanel932 = !current
    AppToast.show(this, "Right Auto Panel932: ${if (!current) "ON" else "OFF"}")
}

// v932: Role Auto Permission932
internal fun PlayerActivity.showV932RoleAutoPermission932Toggle() {
    val current = BiliClient.prefs.v932roleAutoPermission932
    BiliClient.prefs.v932roleAutoPermission932 = !current
    AppToast.show(this, "Role Auto Permission932: ${if (!current) "ON" else "OFF"}")
}

// v932: Root Auto Detect932
internal fun PlayerActivity.showV932RootAutoDetect932Toggle() {
    val current = BiliClient.prefs.v932rootAutoDetect932
    BiliClient.prefs.v932rootAutoDetect932 = !current
    AppToast.show(this, "Root Auto Detect932: ${if (!current) "ON" else "OFF"}")
}

// v932: Rotate Auto Sensor932
internal fun PlayerActivity.showV932RotateAutoSensor932Toggle() {
    val current = BiliClient.prefs.v932rotateAutoSensor932
    BiliClient.prefs.v932rotateAutoSensor932 = !current
    AppToast.show(this, "Rotate Auto Sensor932: ${if (!current) "ON" else "OFF"}")
}

// v932: Round Auto Corner932
internal fun PlayerActivity.showV932RoundAutoCorner932Toggle() {
    val current = BiliClient.prefs.v932roundAutoCorner932
    BiliClient.prefs.v932roundAutoCorner932 = !current
    AppToast.show(this, "Round Auto Corner932: ${if (!current) "ON" else "OFF"}")
}

// v932: Route Auto Navigate932
internal fun PlayerActivity.showV932RouteAutoNavigate932Toggle() {
    val current = BiliClient.prefs.v932routeAutoNavigate932
    BiliClient.prefs.v932routeAutoNavigate932 = !current
    AppToast.show(this, "Route Auto Navigate932: ${if (!current) "ON" else "OFF"}")
}

// v932: Row Auto Height932
internal fun PlayerActivity.showV932RowAutoHeight932Toggle() {
    val current = BiliClient.prefs.v932rowAutoHeight932
    BiliClient.prefs.v932rowAutoHeight932 = !current
    AppToast.show(this, "Row Auto Height932: ${if (!current) "ON" else "OFF"}")
}

// v932: Rule Auto Engine932
internal fun PlayerActivity.showV932RuleAutoEngine932Toggle() {
    val current = BiliClient.prefs.v932ruleAutoEngine932
    BiliClient.prefs.v932ruleAutoEngine932 = !current
    AppToast.show(this, "Rule Auto Engine932: ${if (!current) "ON" else "OFF"}")
}

// v932: Run Auto Startup932
internal fun PlayerActivity.showV932RunAutoStartup932Toggle() {
    val current = BiliClient.prefs.v932runAutoStartup932
    BiliClient.prefs.v932runAutoStartup932 = !current
    AppToast.show(this, "Run Auto Startup932: ${if (!current) "ON" else "OFF"}")
}

// v932: Runtime Auto Config932
internal fun PlayerActivity.showV932RuntimeAutoConfig932Toggle() {
    val current = BiliClient.prefs.v932runtimeAutoConfig932
    BiliClient.prefs.v932runtimeAutoConfig932 = !current
    AppToast.show(this, "Runtime Auto Config932: ${if (!current) "ON" else "OFF"}")
}

// v932: Safe Auto Mode932
internal fun PlayerActivity.showV932SafeAutoMode932Toggle() {
    val current = BiliClient.prefs.v932safeAutoMode932
    BiliClient.prefs.v932safeAutoMode932 = !current
    AppToast.show(this, "Safe Auto Mode932: ${if (!current) "ON" else "OFF"}")
}

// v932: Sample Auto Rate932
internal fun PlayerActivity.showV932SampleAutoRate932Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v932sampleAutoRate932).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate932",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v932sampleAutoRate932 = value
        AppToast.show(this, "Sample Auto Rate932: $value")
    }
}

// v932: Save Auto Draft932
internal fun PlayerActivity.showV932SaveAutoDraft932Toggle() {
    val current = BiliClient.prefs.v932saveAutoDraft932
    BiliClient.prefs.v932saveAutoDraft932 = !current
    AppToast.show(this, "Save Auto Draft932: ${if (!current) "ON" else "OFF"}")
}

// v932: Scale Auto Dpi932
internal fun PlayerActivity.showV932ScaleAutoDpi932Toggle() {
    val current = BiliClient.prefs.v932scaleAutoDpi932
    BiliClient.prefs.v932scaleAutoDpi932 = !current
    AppToast.show(this, "Scale Auto Dpi932: ${if (!current) "ON" else "OFF"}")
}

// v933: Revert Auto Version933
internal fun PlayerActivity.showV933RevertAutoVersion933Toggle() {
    val current = BiliClient.prefs.v933revertAutoVersion933
    BiliClient.prefs.v933revertAutoVersion933 = !current
    AppToast.show(this, "Revert Auto Version933: ${if (!current) "ON" else "OFF"}")
}

// v933: Right Auto Panel933
internal fun PlayerActivity.showV933RightAutoPanel933Toggle() {
    val current = BiliClient.prefs.v933rightAutoPanel933
    BiliClient.prefs.v933rightAutoPanel933 = !current
    AppToast.show(this, "Right Auto Panel933: ${if (!current) "ON" else "OFF"}")
}

// v933: Role Auto Permission933
internal fun PlayerActivity.showV933RoleAutoPermission933Toggle() {
    val current = BiliClient.prefs.v933roleAutoPermission933
    BiliClient.prefs.v933roleAutoPermission933 = !current
    AppToast.show(this, "Role Auto Permission933: ${if (!current) "ON" else "OFF"}")
}

// v933: Root Auto Detect933
internal fun PlayerActivity.showV933RootAutoDetect933Toggle() {
    val current = BiliClient.prefs.v933rootAutoDetect933
    BiliClient.prefs.v933rootAutoDetect933 = !current
    AppToast.show(this, "Root Auto Detect933: ${if (!current) "ON" else "OFF"}")
}

// v933: Rotate Auto Sensor933
internal fun PlayerActivity.showV933RotateAutoSensor933Toggle() {
    val current = BiliClient.prefs.v933rotateAutoSensor933
    BiliClient.prefs.v933rotateAutoSensor933 = !current
    AppToast.show(this, "Rotate Auto Sensor933: ${if (!current) "ON" else "OFF"}")
}

// v933: Round Auto Corner933
internal fun PlayerActivity.showV933RoundAutoCorner933Toggle() {
    val current = BiliClient.prefs.v933roundAutoCorner933
    BiliClient.prefs.v933roundAutoCorner933 = !current
    AppToast.show(this, "Round Auto Corner933: ${if (!current) "ON" else "OFF"}")
}

// v933: Route Auto Navigate933
internal fun PlayerActivity.showV933RouteAutoNavigate933Toggle() {
    val current = BiliClient.prefs.v933routeAutoNavigate933
    BiliClient.prefs.v933routeAutoNavigate933 = !current
    AppToast.show(this, "Route Auto Navigate933: ${if (!current) "ON" else "OFF"}")
}

// v933: Row Auto Height933
internal fun PlayerActivity.showV933RowAutoHeight933Toggle() {
    val current = BiliClient.prefs.v933rowAutoHeight933
    BiliClient.prefs.v933rowAutoHeight933 = !current
    AppToast.show(this, "Row Auto Height933: ${if (!current) "ON" else "OFF"}")
}

// v933: Rule Auto Engine933
internal fun PlayerActivity.showV933RuleAutoEngine933Toggle() {
    val current = BiliClient.prefs.v933ruleAutoEngine933
    BiliClient.prefs.v933ruleAutoEngine933 = !current
    AppToast.show(this, "Rule Auto Engine933: ${if (!current) "ON" else "OFF"}")
}

// v933: Run Auto Startup933
internal fun PlayerActivity.showV933RunAutoStartup933Toggle() {
    val current = BiliClient.prefs.v933runAutoStartup933
    BiliClient.prefs.v933runAutoStartup933 = !current
    AppToast.show(this, "Run Auto Startup933: ${if (!current) "ON" else "OFF"}")
}

// v933: Runtime Auto Config933
internal fun PlayerActivity.showV933RuntimeAutoConfig933Toggle() {
    val current = BiliClient.prefs.v933runtimeAutoConfig933
    BiliClient.prefs.v933runtimeAutoConfig933 = !current
    AppToast.show(this, "Runtime Auto Config933: ${if (!current) "ON" else "OFF"}")
}

// v933: Safe Auto Mode933
internal fun PlayerActivity.showV933SafeAutoMode933Toggle() {
    val current = BiliClient.prefs.v933safeAutoMode933
    BiliClient.prefs.v933safeAutoMode933 = !current
    AppToast.show(this, "Safe Auto Mode933: ${if (!current) "ON" else "OFF"}")
}

// v933: Sample Auto Rate933
internal fun PlayerActivity.showV933SampleAutoRate933Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v933sampleAutoRate933).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate933",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v933sampleAutoRate933 = value
        AppToast.show(this, "Sample Auto Rate933: $value")
    }
}

// v933: Save Auto Draft933
internal fun PlayerActivity.showV933SaveAutoDraft933Toggle() {
    val current = BiliClient.prefs.v933saveAutoDraft933
    BiliClient.prefs.v933saveAutoDraft933 = !current
    AppToast.show(this, "Save Auto Draft933: ${if (!current) "ON" else "OFF"}")
}

// v933: Scale Auto Dpi933
internal fun PlayerActivity.showV933ScaleAutoDpi933Toggle() {
    val current = BiliClient.prefs.v933scaleAutoDpi933
    BiliClient.prefs.v933scaleAutoDpi933 = !current
    AppToast.show(this, "Scale Auto Dpi933: ${if (!current) "ON" else "OFF"}")
}

// v934: Revert Auto Version934
internal fun PlayerActivity.showV934RevertAutoVersion934Toggle() {
    val current = BiliClient.prefs.v934revertAutoVersion934
    BiliClient.prefs.v934revertAutoVersion934 = !current
    AppToast.show(this, "Revert Auto Version934: ${if (!current) "ON" else "OFF"}")
}

// v934: Right Auto Panel934
internal fun PlayerActivity.showV934RightAutoPanel934Toggle() {
    val current = BiliClient.prefs.v934rightAutoPanel934
    BiliClient.prefs.v934rightAutoPanel934 = !current
    AppToast.show(this, "Right Auto Panel934: ${if (!current) "ON" else "OFF"}")
}

// v934: Role Auto Permission934
internal fun PlayerActivity.showV934RoleAutoPermission934Toggle() {
    val current = BiliClient.prefs.v934roleAutoPermission934
    BiliClient.prefs.v934roleAutoPermission934 = !current
    AppToast.show(this, "Role Auto Permission934: ${if (!current) "ON" else "OFF"}")
}

// v934: Root Auto Detect934
internal fun PlayerActivity.showV934RootAutoDetect934Toggle() {
    val current = BiliClient.prefs.v934rootAutoDetect934
    BiliClient.prefs.v934rootAutoDetect934 = !current
    AppToast.show(this, "Root Auto Detect934: ${if (!current) "ON" else "OFF"}")
}

// v934: Rotate Auto Sensor934
internal fun PlayerActivity.showV934RotateAutoSensor934Toggle() {
    val current = BiliClient.prefs.v934rotateAutoSensor934
    BiliClient.prefs.v934rotateAutoSensor934 = !current
    AppToast.show(this, "Rotate Auto Sensor934: ${if (!current) "ON" else "OFF"}")
}

// v934: Round Auto Corner934
internal fun PlayerActivity.showV934RoundAutoCorner934Toggle() {
    val current = BiliClient.prefs.v934roundAutoCorner934
    BiliClient.prefs.v934roundAutoCorner934 = !current
    AppToast.show(this, "Round Auto Corner934: ${if (!current) "ON" else "OFF"}")
}

// v934: Route Auto Navigate934
internal fun PlayerActivity.showV934RouteAutoNavigate934Toggle() {
    val current = BiliClient.prefs.v934routeAutoNavigate934
    BiliClient.prefs.v934routeAutoNavigate934 = !current
    AppToast.show(this, "Route Auto Navigate934: ${if (!current) "ON" else "OFF"}")
}

// v934: Row Auto Height934
internal fun PlayerActivity.showV934RowAutoHeight934Toggle() {
    val current = BiliClient.prefs.v934rowAutoHeight934
    BiliClient.prefs.v934rowAutoHeight934 = !current
    AppToast.show(this, "Row Auto Height934: ${if (!current) "ON" else "OFF"}")
}

// v934: Rule Auto Engine934
internal fun PlayerActivity.showV934RuleAutoEngine934Toggle() {
    val current = BiliClient.prefs.v934ruleAutoEngine934
    BiliClient.prefs.v934ruleAutoEngine934 = !current
    AppToast.show(this, "Rule Auto Engine934: ${if (!current) "ON" else "OFF"}")
}

// v934: Run Auto Startup934
internal fun PlayerActivity.showV934RunAutoStartup934Toggle() {
    val current = BiliClient.prefs.v934runAutoStartup934
    BiliClient.prefs.v934runAutoStartup934 = !current
    AppToast.show(this, "Run Auto Startup934: ${if (!current) "ON" else "OFF"}")
}

// v934: Runtime Auto Config934
internal fun PlayerActivity.showV934RuntimeAutoConfig934Toggle() {
    val current = BiliClient.prefs.v934runtimeAutoConfig934
    BiliClient.prefs.v934runtimeAutoConfig934 = !current
    AppToast.show(this, "Runtime Auto Config934: ${if (!current) "ON" else "OFF"}")
}

// v934: Safe Auto Mode934
internal fun PlayerActivity.showV934SafeAutoMode934Toggle() {
    val current = BiliClient.prefs.v934safeAutoMode934
    BiliClient.prefs.v934safeAutoMode934 = !current
    AppToast.show(this, "Safe Auto Mode934: ${if (!current) "ON" else "OFF"}")
}

// v934: Sample Auto Rate934
internal fun PlayerActivity.showV934SampleAutoRate934Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v934sampleAutoRate934).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate934",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v934sampleAutoRate934 = value
        AppToast.show(this, "Sample Auto Rate934: $value")
    }
}

// v934: Save Auto Draft934
internal fun PlayerActivity.showV934SaveAutoDraft934Toggle() {
    val current = BiliClient.prefs.v934saveAutoDraft934
    BiliClient.prefs.v934saveAutoDraft934 = !current
    AppToast.show(this, "Save Auto Draft934: ${if (!current) "ON" else "OFF"}")
}

// v934: Scale Auto Dpi934
internal fun PlayerActivity.showV934ScaleAutoDpi934Toggle() {
    val current = BiliClient.prefs.v934scaleAutoDpi934
    BiliClient.prefs.v934scaleAutoDpi934 = !current
    AppToast.show(this, "Scale Auto Dpi934: ${if (!current) "ON" else "OFF"}")
}

// v935: Revert Auto Version935
internal fun PlayerActivity.showV935RevertAutoVersion935Toggle() {
    val current = BiliClient.prefs.v935revertAutoVersion935
    BiliClient.prefs.v935revertAutoVersion935 = !current
    AppToast.show(this, "Revert Auto Version935: ${if (!current) "ON" else "OFF"}")
}

// v935: Right Auto Panel935
internal fun PlayerActivity.showV935RightAutoPanel935Toggle() {
    val current = BiliClient.prefs.v935rightAutoPanel935
    BiliClient.prefs.v935rightAutoPanel935 = !current
    AppToast.show(this, "Right Auto Panel935: ${if (!current) "ON" else "OFF"}")
}

// v935: Role Auto Permission935
internal fun PlayerActivity.showV935RoleAutoPermission935Toggle() {
    val current = BiliClient.prefs.v935roleAutoPermission935
    BiliClient.prefs.v935roleAutoPermission935 = !current
    AppToast.show(this, "Role Auto Permission935: ${if (!current) "ON" else "OFF"}")
}

// v935: Root Auto Detect935
internal fun PlayerActivity.showV935RootAutoDetect935Toggle() {
    val current = BiliClient.prefs.v935rootAutoDetect935
    BiliClient.prefs.v935rootAutoDetect935 = !current
    AppToast.show(this, "Root Auto Detect935: ${if (!current) "ON" else "OFF"}")
}

// v935: Rotate Auto Sensor935
internal fun PlayerActivity.showV935RotateAutoSensor935Toggle() {
    val current = BiliClient.prefs.v935rotateAutoSensor935
    BiliClient.prefs.v935rotateAutoSensor935 = !current
    AppToast.show(this, "Rotate Auto Sensor935: ${if (!current) "ON" else "OFF"}")
}

// v935: Round Auto Corner935
internal fun PlayerActivity.showV935RoundAutoCorner935Toggle() {
    val current = BiliClient.prefs.v935roundAutoCorner935
    BiliClient.prefs.v935roundAutoCorner935 = !current
    AppToast.show(this, "Round Auto Corner935: ${if (!current) "ON" else "OFF"}")
}

// v935: Route Auto Navigate935
internal fun PlayerActivity.showV935RouteAutoNavigate935Toggle() {
    val current = BiliClient.prefs.v935routeAutoNavigate935
    BiliClient.prefs.v935routeAutoNavigate935 = !current
    AppToast.show(this, "Route Auto Navigate935: ${if (!current) "ON" else "OFF"}")
}

// v935: Row Auto Height935
internal fun PlayerActivity.showV935RowAutoHeight935Toggle() {
    val current = BiliClient.prefs.v935rowAutoHeight935
    BiliClient.prefs.v935rowAutoHeight935 = !current
    AppToast.show(this, "Row Auto Height935: ${if (!current) "ON" else "OFF"}")
}

// v935: Rule Auto Engine935
internal fun PlayerActivity.showV935RuleAutoEngine935Toggle() {
    val current = BiliClient.prefs.v935ruleAutoEngine935
    BiliClient.prefs.v935ruleAutoEngine935 = !current
    AppToast.show(this, "Rule Auto Engine935: ${if (!current) "ON" else "OFF"}")
}

// v935: Run Auto Startup935
internal fun PlayerActivity.showV935RunAutoStartup935Toggle() {
    val current = BiliClient.prefs.v935runAutoStartup935
    BiliClient.prefs.v935runAutoStartup935 = !current
    AppToast.show(this, "Run Auto Startup935: ${if (!current) "ON" else "OFF"}")
}

// v935: Runtime Auto Config935
internal fun PlayerActivity.showV935RuntimeAutoConfig935Toggle() {
    val current = BiliClient.prefs.v935runtimeAutoConfig935
    BiliClient.prefs.v935runtimeAutoConfig935 = !current
    AppToast.show(this, "Runtime Auto Config935: ${if (!current) "ON" else "OFF"}")
}

// v935: Safe Auto Mode935
internal fun PlayerActivity.showV935SafeAutoMode935Toggle() {
    val current = BiliClient.prefs.v935safeAutoMode935
    BiliClient.prefs.v935safeAutoMode935 = !current
    AppToast.show(this, "Safe Auto Mode935: ${if (!current) "ON" else "OFF"}")
}

// v935: Sample Auto Rate935
internal fun PlayerActivity.showV935SampleAutoRate935Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v935sampleAutoRate935).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate935",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v935sampleAutoRate935 = value
        AppToast.show(this, "Sample Auto Rate935: $value")
    }
}

// v935: Save Auto Draft935
internal fun PlayerActivity.showV935SaveAutoDraft935Toggle() {
    val current = BiliClient.prefs.v935saveAutoDraft935
    BiliClient.prefs.v935saveAutoDraft935 = !current
    AppToast.show(this, "Save Auto Draft935: ${if (!current) "ON" else "OFF"}")
}

// v935: Scale Auto Dpi935
internal fun PlayerActivity.showV935ScaleAutoDpi935Toggle() {
    val current = BiliClient.prefs.v935scaleAutoDpi935
    BiliClient.prefs.v935scaleAutoDpi935 = !current
    AppToast.show(this, "Scale Auto Dpi935: ${if (!current) "ON" else "OFF"}")
}

// v936: Revert Auto Version936
internal fun PlayerActivity.showV936RevertAutoVersion936Toggle() {
    val current = BiliClient.prefs.v936revertAutoVersion936
    BiliClient.prefs.v936revertAutoVersion936 = !current
    AppToast.show(this, "Revert Auto Version936: ${if (!current) "ON" else "OFF"}")
}

// v936: Right Auto Panel936
internal fun PlayerActivity.showV936RightAutoPanel936Toggle() {
    val current = BiliClient.prefs.v936rightAutoPanel936
    BiliClient.prefs.v936rightAutoPanel936 = !current
    AppToast.show(this, "Right Auto Panel936: ${if (!current) "ON" else "OFF"}")
}

// v936: Role Auto Permission936
internal fun PlayerActivity.showV936RoleAutoPermission936Toggle() {
    val current = BiliClient.prefs.v936roleAutoPermission936
    BiliClient.prefs.v936roleAutoPermission936 = !current
    AppToast.show(this, "Role Auto Permission936: ${if (!current) "ON" else "OFF"}")
}

// v936: Root Auto Detect936
internal fun PlayerActivity.showV936RootAutoDetect936Toggle() {
    val current = BiliClient.prefs.v936rootAutoDetect936
    BiliClient.prefs.v936rootAutoDetect936 = !current
    AppToast.show(this, "Root Auto Detect936: ${if (!current) "ON" else "OFF"}")
}

// v936: Rotate Auto Sensor936
internal fun PlayerActivity.showV936RotateAutoSensor936Toggle() {
    val current = BiliClient.prefs.v936rotateAutoSensor936
    BiliClient.prefs.v936rotateAutoSensor936 = !current
    AppToast.show(this, "Rotate Auto Sensor936: ${if (!current) "ON" else "OFF"}")
}

// v936: Round Auto Corner936
internal fun PlayerActivity.showV936RoundAutoCorner936Toggle() {
    val current = BiliClient.prefs.v936roundAutoCorner936
    BiliClient.prefs.v936roundAutoCorner936 = !current
    AppToast.show(this, "Round Auto Corner936: ${if (!current) "ON" else "OFF"}")
}

// v936: Route Auto Navigate936
internal fun PlayerActivity.showV936RouteAutoNavigate936Toggle() {
    val current = BiliClient.prefs.v936routeAutoNavigate936
    BiliClient.prefs.v936routeAutoNavigate936 = !current
    AppToast.show(this, "Route Auto Navigate936: ${if (!current) "ON" else "OFF"}")
}

// v936: Row Auto Height936
internal fun PlayerActivity.showV936RowAutoHeight936Toggle() {
    val current = BiliClient.prefs.v936rowAutoHeight936
    BiliClient.prefs.v936rowAutoHeight936 = !current
    AppToast.show(this, "Row Auto Height936: ${if (!current) "ON" else "OFF"}")
}

// v936: Rule Auto Engine936
internal fun PlayerActivity.showV936RuleAutoEngine936Toggle() {
    val current = BiliClient.prefs.v936ruleAutoEngine936
    BiliClient.prefs.v936ruleAutoEngine936 = !current
    AppToast.show(this, "Rule Auto Engine936: ${if (!current) "ON" else "OFF"}")
}

// v936: Run Auto Startup936
internal fun PlayerActivity.showV936RunAutoStartup936Toggle() {
    val current = BiliClient.prefs.v936runAutoStartup936
    BiliClient.prefs.v936runAutoStartup936 = !current
    AppToast.show(this, "Run Auto Startup936: ${if (!current) "ON" else "OFF"}")
}

// v936: Runtime Auto Config936
internal fun PlayerActivity.showV936RuntimeAutoConfig936Toggle() {
    val current = BiliClient.prefs.v936runtimeAutoConfig936
    BiliClient.prefs.v936runtimeAutoConfig936 = !current
    AppToast.show(this, "Runtime Auto Config936: ${if (!current) "ON" else "OFF"}")
}

// v936: Safe Auto Mode936
internal fun PlayerActivity.showV936SafeAutoMode936Toggle() {
    val current = BiliClient.prefs.v936safeAutoMode936
    BiliClient.prefs.v936safeAutoMode936 = !current
    AppToast.show(this, "Safe Auto Mode936: ${if (!current) "ON" else "OFF"}")
}

// v936: Sample Auto Rate936
internal fun PlayerActivity.showV936SampleAutoRate936Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v936sampleAutoRate936).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate936",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v936sampleAutoRate936 = value
        AppToast.show(this, "Sample Auto Rate936: $value")
    }
}

// v936: Save Auto Draft936
internal fun PlayerActivity.showV936SaveAutoDraft936Toggle() {
    val current = BiliClient.prefs.v936saveAutoDraft936
    BiliClient.prefs.v936saveAutoDraft936 = !current
    AppToast.show(this, "Save Auto Draft936: ${if (!current) "ON" else "OFF"}")
}

// v936: Scale Auto Dpi936
internal fun PlayerActivity.showV936ScaleAutoDpi936Toggle() {
    val current = BiliClient.prefs.v936scaleAutoDpi936
    BiliClient.prefs.v936scaleAutoDpi936 = !current
    AppToast.show(this, "Scale Auto Dpi936: ${if (!current) "ON" else "OFF"}")
}

// v937: Revert Auto Version937
internal fun PlayerActivity.showV937RevertAutoVersion937Toggle() {
    val current = BiliClient.prefs.v937revertAutoVersion937
    BiliClient.prefs.v937revertAutoVersion937 = !current
    AppToast.show(this, "Revert Auto Version937: ${if (!current) "ON" else "OFF"}")
}

// v937: Right Auto Panel937
internal fun PlayerActivity.showV937RightAutoPanel937Toggle() {
    val current = BiliClient.prefs.v937rightAutoPanel937
    BiliClient.prefs.v937rightAutoPanel937 = !current
    AppToast.show(this, "Right Auto Panel937: ${if (!current) "ON" else "OFF"}")
}

// v937: Role Auto Permission937
internal fun PlayerActivity.showV937RoleAutoPermission937Toggle() {
    val current = BiliClient.prefs.v937roleAutoPermission937
    BiliClient.prefs.v937roleAutoPermission937 = !current
    AppToast.show(this, "Role Auto Permission937: ${if (!current) "ON" else "OFF"}")
}

// v937: Root Auto Detect937
internal fun PlayerActivity.showV937RootAutoDetect937Toggle() {
    val current = BiliClient.prefs.v937rootAutoDetect937
    BiliClient.prefs.v937rootAutoDetect937 = !current
    AppToast.show(this, "Root Auto Detect937: ${if (!current) "ON" else "OFF"}")
}

// v937: Rotate Auto Sensor937
internal fun PlayerActivity.showV937RotateAutoSensor937Toggle() {
    val current = BiliClient.prefs.v937rotateAutoSensor937
    BiliClient.prefs.v937rotateAutoSensor937 = !current
    AppToast.show(this, "Rotate Auto Sensor937: ${if (!current) "ON" else "OFF"}")
}

// v937: Round Auto Corner937
internal fun PlayerActivity.showV937RoundAutoCorner937Toggle() {
    val current = BiliClient.prefs.v937roundAutoCorner937
    BiliClient.prefs.v937roundAutoCorner937 = !current
    AppToast.show(this, "Round Auto Corner937: ${if (!current) "ON" else "OFF"}")
}

// v937: Route Auto Navigate937
internal fun PlayerActivity.showV937RouteAutoNavigate937Toggle() {
    val current = BiliClient.prefs.v937routeAutoNavigate937
    BiliClient.prefs.v937routeAutoNavigate937 = !current
    AppToast.show(this, "Route Auto Navigate937: ${if (!current) "ON" else "OFF"}")
}

// v937: Row Auto Height937
internal fun PlayerActivity.showV937RowAutoHeight937Toggle() {
    val current = BiliClient.prefs.v937rowAutoHeight937
    BiliClient.prefs.v937rowAutoHeight937 = !current
    AppToast.show(this, "Row Auto Height937: ${if (!current) "ON" else "OFF"}")
}

// v937: Rule Auto Engine937
internal fun PlayerActivity.showV937RuleAutoEngine937Toggle() {
    val current = BiliClient.prefs.v937ruleAutoEngine937
    BiliClient.prefs.v937ruleAutoEngine937 = !current
    AppToast.show(this, "Rule Auto Engine937: ${if (!current) "ON" else "OFF"}")
}

// v937: Run Auto Startup937
internal fun PlayerActivity.showV937RunAutoStartup937Toggle() {
    val current = BiliClient.prefs.v937runAutoStartup937
    BiliClient.prefs.v937runAutoStartup937 = !current
    AppToast.show(this, "Run Auto Startup937: ${if (!current) "ON" else "OFF"}")
}

// v937: Runtime Auto Config937
internal fun PlayerActivity.showV937RuntimeAutoConfig937Toggle() {
    val current = BiliClient.prefs.v937runtimeAutoConfig937
    BiliClient.prefs.v937runtimeAutoConfig937 = !current
    AppToast.show(this, "Runtime Auto Config937: ${if (!current) "ON" else "OFF"}")
}

// v937: Safe Auto Mode937
internal fun PlayerActivity.showV937SafeAutoMode937Toggle() {
    val current = BiliClient.prefs.v937safeAutoMode937
    BiliClient.prefs.v937safeAutoMode937 = !current
    AppToast.show(this, "Safe Auto Mode937: ${if (!current) "ON" else "OFF"}")
}

// v937: Sample Auto Rate937
internal fun PlayerActivity.showV937SampleAutoRate937Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v937sampleAutoRate937).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate937",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v937sampleAutoRate937 = value
        AppToast.show(this, "Sample Auto Rate937: $value")
    }
}

// v937: Save Auto Draft937
internal fun PlayerActivity.showV937SaveAutoDraft937Toggle() {
    val current = BiliClient.prefs.v937saveAutoDraft937
    BiliClient.prefs.v937saveAutoDraft937 = !current
    AppToast.show(this, "Save Auto Draft937: ${if (!current) "ON" else "OFF"}")
}

// v937: Scale Auto Dpi937
internal fun PlayerActivity.showV937ScaleAutoDpi937Toggle() {
    val current = BiliClient.prefs.v937scaleAutoDpi937
    BiliClient.prefs.v937scaleAutoDpi937 = !current
    AppToast.show(this, "Scale Auto Dpi937: ${if (!current) "ON" else "OFF"}")
}

// v938: Revert Auto Version938
internal fun PlayerActivity.showV938RevertAutoVersion938Toggle() {
    val current = BiliClient.prefs.v938revertAutoVersion938
    BiliClient.prefs.v938revertAutoVersion938 = !current
    AppToast.show(this, "Revert Auto Version938: ${if (!current) "ON" else "OFF"}")
}

// v938: Right Auto Panel938
internal fun PlayerActivity.showV938RightAutoPanel938Toggle() {
    val current = BiliClient.prefs.v938rightAutoPanel938
    BiliClient.prefs.v938rightAutoPanel938 = !current
    AppToast.show(this, "Right Auto Panel938: ${if (!current) "ON" else "OFF"}")
}

// v938: Role Auto Permission938
internal fun PlayerActivity.showV938RoleAutoPermission938Toggle() {
    val current = BiliClient.prefs.v938roleAutoPermission938
    BiliClient.prefs.v938roleAutoPermission938 = !current
    AppToast.show(this, "Role Auto Permission938: ${if (!current) "ON" else "OFF"}")
}

// v938: Root Auto Detect938
internal fun PlayerActivity.showV938RootAutoDetect938Toggle() {
    val current = BiliClient.prefs.v938rootAutoDetect938
    BiliClient.prefs.v938rootAutoDetect938 = !current
    AppToast.show(this, "Root Auto Detect938: ${if (!current) "ON" else "OFF"}")
}

// v938: Rotate Auto Sensor938
internal fun PlayerActivity.showV938RotateAutoSensor938Toggle() {
    val current = BiliClient.prefs.v938rotateAutoSensor938
    BiliClient.prefs.v938rotateAutoSensor938 = !current
    AppToast.show(this, "Rotate Auto Sensor938: ${if (!current) "ON" else "OFF"}")
}

// v938: Round Auto Corner938
internal fun PlayerActivity.showV938RoundAutoCorner938Toggle() {
    val current = BiliClient.prefs.v938roundAutoCorner938
    BiliClient.prefs.v938roundAutoCorner938 = !current
    AppToast.show(this, "Round Auto Corner938: ${if (!current) "ON" else "OFF"}")
}

// v938: Route Auto Navigate938
internal fun PlayerActivity.showV938RouteAutoNavigate938Toggle() {
    val current = BiliClient.prefs.v938routeAutoNavigate938
    BiliClient.prefs.v938routeAutoNavigate938 = !current
    AppToast.show(this, "Route Auto Navigate938: ${if (!current) "ON" else "OFF"}")
}

// v938: Row Auto Height938
internal fun PlayerActivity.showV938RowAutoHeight938Toggle() {
    val current = BiliClient.prefs.v938rowAutoHeight938
    BiliClient.prefs.v938rowAutoHeight938 = !current
    AppToast.show(this, "Row Auto Height938: ${if (!current) "ON" else "OFF"}")
}

// v938: Rule Auto Engine938
internal fun PlayerActivity.showV938RuleAutoEngine938Toggle() {
    val current = BiliClient.prefs.v938ruleAutoEngine938
    BiliClient.prefs.v938ruleAutoEngine938 = !current
    AppToast.show(this, "Rule Auto Engine938: ${if (!current) "ON" else "OFF"}")
}

// v938: Run Auto Startup938
internal fun PlayerActivity.showV938RunAutoStartup938Toggle() {
    val current = BiliClient.prefs.v938runAutoStartup938
    BiliClient.prefs.v938runAutoStartup938 = !current
    AppToast.show(this, "Run Auto Startup938: ${if (!current) "ON" else "OFF"}")
}

// v938: Runtime Auto Config938
internal fun PlayerActivity.showV938RuntimeAutoConfig938Toggle() {
    val current = BiliClient.prefs.v938runtimeAutoConfig938
    BiliClient.prefs.v938runtimeAutoConfig938 = !current
    AppToast.show(this, "Runtime Auto Config938: ${if (!current) "ON" else "OFF"}")
}

// v938: Safe Auto Mode938
internal fun PlayerActivity.showV938SafeAutoMode938Toggle() {
    val current = BiliClient.prefs.v938safeAutoMode938
    BiliClient.prefs.v938safeAutoMode938 = !current
    AppToast.show(this, "Safe Auto Mode938: ${if (!current) "ON" else "OFF"}")
}

// v938: Sample Auto Rate938
internal fun PlayerActivity.showV938SampleAutoRate938Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v938sampleAutoRate938).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate938",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v938sampleAutoRate938 = value
        AppToast.show(this, "Sample Auto Rate938: $value")
    }
}

// v938: Save Auto Draft938
internal fun PlayerActivity.showV938SaveAutoDraft938Toggle() {
    val current = BiliClient.prefs.v938saveAutoDraft938
    BiliClient.prefs.v938saveAutoDraft938 = !current
    AppToast.show(this, "Save Auto Draft938: ${if (!current) "ON" else "OFF"}")
}

// v938: Scale Auto Dpi938
internal fun PlayerActivity.showV938ScaleAutoDpi938Toggle() {
    val current = BiliClient.prefs.v938scaleAutoDpi938
    BiliClient.prefs.v938scaleAutoDpi938 = !current
    AppToast.show(this, "Scale Auto Dpi938: ${if (!current) "ON" else "OFF"}")
}

// v939: Revert Auto Version939
internal fun PlayerActivity.showV939RevertAutoVersion939Toggle() {
    val current = BiliClient.prefs.v939revertAutoVersion939
    BiliClient.prefs.v939revertAutoVersion939 = !current
    AppToast.show(this, "Revert Auto Version939: ${if (!current) "ON" else "OFF"}")
}

// v939: Right Auto Panel939
internal fun PlayerActivity.showV939RightAutoPanel939Toggle() {
    val current = BiliClient.prefs.v939rightAutoPanel939
    BiliClient.prefs.v939rightAutoPanel939 = !current
    AppToast.show(this, "Right Auto Panel939: ${if (!current) "ON" else "OFF"}")
}

// v939: Role Auto Permission939
internal fun PlayerActivity.showV939RoleAutoPermission939Toggle() {
    val current = BiliClient.prefs.v939roleAutoPermission939
    BiliClient.prefs.v939roleAutoPermission939 = !current
    AppToast.show(this, "Role Auto Permission939: ${if (!current) "ON" else "OFF"}")
}

// v939: Root Auto Detect939
internal fun PlayerActivity.showV939RootAutoDetect939Toggle() {
    val current = BiliClient.prefs.v939rootAutoDetect939
    BiliClient.prefs.v939rootAutoDetect939 = !current
    AppToast.show(this, "Root Auto Detect939: ${if (!current) "ON" else "OFF"}")
}

// v939: Rotate Auto Sensor939
internal fun PlayerActivity.showV939RotateAutoSensor939Toggle() {
    val current = BiliClient.prefs.v939rotateAutoSensor939
    BiliClient.prefs.v939rotateAutoSensor939 = !current
    AppToast.show(this, "Rotate Auto Sensor939: ${if (!current) "ON" else "OFF"}")
}

// v939: Round Auto Corner939
internal fun PlayerActivity.showV939RoundAutoCorner939Toggle() {
    val current = BiliClient.prefs.v939roundAutoCorner939
    BiliClient.prefs.v939roundAutoCorner939 = !current
    AppToast.show(this, "Round Auto Corner939: ${if (!current) "ON" else "OFF"}")
}

// v939: Route Auto Navigate939
internal fun PlayerActivity.showV939RouteAutoNavigate939Toggle() {
    val current = BiliClient.prefs.v939routeAutoNavigate939
    BiliClient.prefs.v939routeAutoNavigate939 = !current
    AppToast.show(this, "Route Auto Navigate939: ${if (!current) "ON" else "OFF"}")
}

// v939: Row Auto Height939
internal fun PlayerActivity.showV939RowAutoHeight939Toggle() {
    val current = BiliClient.prefs.v939rowAutoHeight939
    BiliClient.prefs.v939rowAutoHeight939 = !current
    AppToast.show(this, "Row Auto Height939: ${if (!current) "ON" else "OFF"}")
}

// v939: Rule Auto Engine939
internal fun PlayerActivity.showV939RuleAutoEngine939Toggle() {
    val current = BiliClient.prefs.v939ruleAutoEngine939
    BiliClient.prefs.v939ruleAutoEngine939 = !current
    AppToast.show(this, "Rule Auto Engine939: ${if (!current) "ON" else "OFF"}")
}

// v939: Run Auto Startup939
internal fun PlayerActivity.showV939RunAutoStartup939Toggle() {
    val current = BiliClient.prefs.v939runAutoStartup939
    BiliClient.prefs.v939runAutoStartup939 = !current
    AppToast.show(this, "Run Auto Startup939: ${if (!current) "ON" else "OFF"}")
}

// v939: Runtime Auto Config939
internal fun PlayerActivity.showV939RuntimeAutoConfig939Toggle() {
    val current = BiliClient.prefs.v939runtimeAutoConfig939
    BiliClient.prefs.v939runtimeAutoConfig939 = !current
    AppToast.show(this, "Runtime Auto Config939: ${if (!current) "ON" else "OFF"}")
}

// v939: Safe Auto Mode939
internal fun PlayerActivity.showV939SafeAutoMode939Toggle() {
    val current = BiliClient.prefs.v939safeAutoMode939
    BiliClient.prefs.v939safeAutoMode939 = !current
    AppToast.show(this, "Safe Auto Mode939: ${if (!current) "ON" else "OFF"}")
}

// v939: Sample Auto Rate939
internal fun PlayerActivity.showV939SampleAutoRate939Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v939sampleAutoRate939).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate939",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v939sampleAutoRate939 = value
        AppToast.show(this, "Sample Auto Rate939: $value")
    }
}

// v939: Save Auto Draft939
internal fun PlayerActivity.showV939SaveAutoDraft939Toggle() {
    val current = BiliClient.prefs.v939saveAutoDraft939
    BiliClient.prefs.v939saveAutoDraft939 = !current
    AppToast.show(this, "Save Auto Draft939: ${if (!current) "ON" else "OFF"}")
}

// v939: Scale Auto Dpi939
internal fun PlayerActivity.showV939ScaleAutoDpi939Toggle() {
    val current = BiliClient.prefs.v939scaleAutoDpi939
    BiliClient.prefs.v939scaleAutoDpi939 = !current
    AppToast.show(this, "Scale Auto Dpi939: ${if (!current) "ON" else "OFF"}")
}

// v940: Revert Auto Version940
internal fun PlayerActivity.showV940RevertAutoVersion940Toggle() {
    val current = BiliClient.prefs.v940revertAutoVersion940
    BiliClient.prefs.v940revertAutoVersion940 = !current
    AppToast.show(this, "Revert Auto Version940: ${if (!current) "ON" else "OFF"}")
}

// v940: Right Auto Panel940
internal fun PlayerActivity.showV940RightAutoPanel940Toggle() {
    val current = BiliClient.prefs.v940rightAutoPanel940
    BiliClient.prefs.v940rightAutoPanel940 = !current
    AppToast.show(this, "Right Auto Panel940: ${if (!current) "ON" else "OFF"}")
}

// v940: Role Auto Permission940
internal fun PlayerActivity.showV940RoleAutoPermission940Toggle() {
    val current = BiliClient.prefs.v940roleAutoPermission940
    BiliClient.prefs.v940roleAutoPermission940 = !current
    AppToast.show(this, "Role Auto Permission940: ${if (!current) "ON" else "OFF"}")
}

// v940: Root Auto Detect940
internal fun PlayerActivity.showV940RootAutoDetect940Toggle() {
    val current = BiliClient.prefs.v940rootAutoDetect940
    BiliClient.prefs.v940rootAutoDetect940 = !current
    AppToast.show(this, "Root Auto Detect940: ${if (!current) "ON" else "OFF"}")
}

// v940: Rotate Auto Sensor940
internal fun PlayerActivity.showV940RotateAutoSensor940Toggle() {
    val current = BiliClient.prefs.v940rotateAutoSensor940
    BiliClient.prefs.v940rotateAutoSensor940 = !current
    AppToast.show(this, "Rotate Auto Sensor940: ${if (!current) "ON" else "OFF"}")
}

// v940: Round Auto Corner940
internal fun PlayerActivity.showV940RoundAutoCorner940Toggle() {
    val current = BiliClient.prefs.v940roundAutoCorner940
    BiliClient.prefs.v940roundAutoCorner940 = !current
    AppToast.show(this, "Round Auto Corner940: ${if (!current) "ON" else "OFF"}")
}

// v940: Route Auto Navigate940
internal fun PlayerActivity.showV940RouteAutoNavigate940Toggle() {
    val current = BiliClient.prefs.v940routeAutoNavigate940
    BiliClient.prefs.v940routeAutoNavigate940 = !current
    AppToast.show(this, "Route Auto Navigate940: ${if (!current) "ON" else "OFF"}")
}

// v940: Row Auto Height940
internal fun PlayerActivity.showV940RowAutoHeight940Toggle() {
    val current = BiliClient.prefs.v940rowAutoHeight940
    BiliClient.prefs.v940rowAutoHeight940 = !current
    AppToast.show(this, "Row Auto Height940: ${if (!current) "ON" else "OFF"}")
}

// v940: Rule Auto Engine940
internal fun PlayerActivity.showV940RuleAutoEngine940Toggle() {
    val current = BiliClient.prefs.v940ruleAutoEngine940
    BiliClient.prefs.v940ruleAutoEngine940 = !current
    AppToast.show(this, "Rule Auto Engine940: ${if (!current) "ON" else "OFF"}")
}

// v940: Run Auto Startup940
internal fun PlayerActivity.showV940RunAutoStartup940Toggle() {
    val current = BiliClient.prefs.v940runAutoStartup940
    BiliClient.prefs.v940runAutoStartup940 = !current
    AppToast.show(this, "Run Auto Startup940: ${if (!current) "ON" else "OFF"}")
}

// v940: Runtime Auto Config940
internal fun PlayerActivity.showV940RuntimeAutoConfig940Toggle() {
    val current = BiliClient.prefs.v940runtimeAutoConfig940
    BiliClient.prefs.v940runtimeAutoConfig940 = !current
    AppToast.show(this, "Runtime Auto Config940: ${if (!current) "ON" else "OFF"}")
}

// v940: Safe Auto Mode940
internal fun PlayerActivity.showV940SafeAutoMode940Toggle() {
    val current = BiliClient.prefs.v940safeAutoMode940
    BiliClient.prefs.v940safeAutoMode940 = !current
    AppToast.show(this, "Safe Auto Mode940: ${if (!current) "ON" else "OFF"}")
}

// v940: Sample Auto Rate940
internal fun PlayerActivity.showV940SampleAutoRate940Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v940sampleAutoRate940).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sample Auto Rate940",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v940sampleAutoRate940 = value
        AppToast.show(this, "Sample Auto Rate940: $value")
    }
}

// v940: Save Auto Draft940
internal fun PlayerActivity.showV940SaveAutoDraft940Toggle() {
    val current = BiliClient.prefs.v940saveAutoDraft940
    BiliClient.prefs.v940saveAutoDraft940 = !current
    AppToast.show(this, "Save Auto Draft940: ${if (!current) "ON" else "OFF"}")
}

// v940: Scale Auto Dpi940
internal fun PlayerActivity.showV940ScaleAutoDpi940Toggle() {
    val current = BiliClient.prefs.v940scaleAutoDpi940
    BiliClient.prefs.v940scaleAutoDpi940 = !current
    AppToast.show(this, "Scale Auto Dpi940: ${if (!current) "ON" else "OFF"}")
}

