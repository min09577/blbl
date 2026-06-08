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

// v741: Gain Auto Level741
internal fun PlayerActivity.showV741GainAutoLevel741Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v741gainAutoLevel741).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level741",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v741gainAutoLevel741 = value
        AppToast.show(this, "Gain Auto Level741: $value")
    }
}

// v741: Gamma Auto Correct741
internal fun PlayerActivity.showV741GammaAutoCorrect741Toggle() {
    val current = BiliClient.prefs.v741gammaAutoCorrect741
    BiliClient.prefs.v741gammaAutoCorrect741 = !current
    AppToast.show(this, "Gamma Auto Correct741: ${if (!current) "ON" else "OFF"}")
}

// v741: Gap Auto Fill741
internal fun PlayerActivity.showV741GapAutoFill741Toggle() {
    val current = BiliClient.prefs.v741gapAutoFill741
    BiliClient.prefs.v741gapAutoFill741 = !current
    AppToast.show(this, "Gap Auto Fill741: ${if (!current) "ON" else "OFF"}")
}

// v741: Gate Auto Control741
internal fun PlayerActivity.showV741GateAutoControl741Toggle() {
    val current = BiliClient.prefs.v741gateAutoControl741
    BiliClient.prefs.v741gateAutoControl741 = !current
    AppToast.show(this, "Gate Auto Control741: ${if (!current) "ON" else "OFF"}")
}

// v741: Generate Auto Report741
internal fun PlayerActivity.showV741GenerateAutoReport741Toggle() {
    val current = BiliClient.prefs.v741generateAutoReport741
    BiliClient.prefs.v741generateAutoReport741 = !current
    AppToast.show(this, "Generate Auto Report741: ${if (!current) "ON" else "OFF"}")
}

// v741: Gesture Auto Swipe741
internal fun PlayerActivity.showV741GestureAutoSwipe741Toggle() {
    val current = BiliClient.prefs.v741gestureAutoSwipe741
    BiliClient.prefs.v741gestureAutoSwipe741 = !current
    AppToast.show(this, "Gesture Auto Swipe741: ${if (!current) "ON" else "OFF"}")
}

// v741: Global Auto Sync741
internal fun PlayerActivity.showV741GlobalAutoSync741Toggle() {
    val current = BiliClient.prefs.v741globalAutoSync741
    BiliClient.prefs.v741globalAutoSync741 = !current
    AppToast.show(this, "Global Auto Sync741: ${if (!current) "ON" else "OFF"}")
}

// v741: Glyph Auto Render741
internal fun PlayerActivity.showV741GlyphAutoRender741Toggle() {
    val current = BiliClient.prefs.v741glyphAutoRender741
    BiliClient.prefs.v741glyphAutoRender741 = !current
    AppToast.show(this, "Glyph Auto Render741: ${if (!current) "ON" else "OFF"}")
}

// v741: Gradient Auto Color741
internal fun PlayerActivity.showV741GradientAutoColor741Toggle() {
    val current = BiliClient.prefs.v741gradientAutoColor741
    BiliClient.prefs.v741gradientAutoColor741 = !current
    AppToast.show(this, "Gradient Auto Color741: ${if (!current) "ON" else "OFF"}")
}

// v741: Grant Auto Access741
internal fun PlayerActivity.showV741GrantAutoAccess741Toggle() {
    val current = BiliClient.prefs.v741grantAutoAccess741
    BiliClient.prefs.v741grantAutoAccess741 = !current
    AppToast.show(this, "Grant Auto Access741: ${if (!current) "ON" else "OFF"}")
}

// v741: Graph Auto Layout741
internal fun PlayerActivity.showV741GraphAutoLayout741Toggle() {
    val current = BiliClient.prefs.v741graphAutoLayout741
    BiliClient.prefs.v741graphAutoLayout741 = !current
    AppToast.show(this, "Graph Auto Layout741: ${if (!current) "ON" else "OFF"}")
}

// v741: Gravity Auto Sensor741
internal fun PlayerActivity.showV741GravityAutoSensor741Toggle() {
    val current = BiliClient.prefs.v741gravityAutoSensor741
    BiliClient.prefs.v741gravityAutoSensor741 = !current
    AppToast.show(this, "Gravity Auto Sensor741: ${if (!current) "ON" else "OFF"}")
}

// v741: Grid Auto Adaptive741
internal fun PlayerActivity.showV741GridAutoAdaptive741Toggle() {
    val current = BiliClient.prefs.v741gridAutoAdaptive741
    BiliClient.prefs.v741gridAutoAdaptive741 = !current
    AppToast.show(this, "Grid Auto Adaptive741: ${if (!current) "ON" else "OFF"}")
}

// v741: Group Auto Cluster741
internal fun PlayerActivity.showV741GroupAutoCluster741Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v741groupAutoCluster741).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster741",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v741groupAutoCluster741 = value
        AppToast.show(this, "Group Auto Cluster741: $value")
    }
}

// v741: Grow Auto Animate741
internal fun PlayerActivity.showV741GrowAutoAnimate741Toggle() {
    val current = BiliClient.prefs.v741growAutoAnimate741
    BiliClient.prefs.v741growAutoAnimate741 = !current
    AppToast.show(this, "Grow Auto Animate741: ${if (!current) "ON" else "OFF"}")
}

// v742: Gain Auto Level742
internal fun PlayerActivity.showV742GainAutoLevel742Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v742gainAutoLevel742).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level742",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v742gainAutoLevel742 = value
        AppToast.show(this, "Gain Auto Level742: $value")
    }
}

// v742: Gamma Auto Correct742
internal fun PlayerActivity.showV742GammaAutoCorrect742Toggle() {
    val current = BiliClient.prefs.v742gammaAutoCorrect742
    BiliClient.prefs.v742gammaAutoCorrect742 = !current
    AppToast.show(this, "Gamma Auto Correct742: ${if (!current) "ON" else "OFF"}")
}

// v742: Gap Auto Fill742
internal fun PlayerActivity.showV742GapAutoFill742Toggle() {
    val current = BiliClient.prefs.v742gapAutoFill742
    BiliClient.prefs.v742gapAutoFill742 = !current
    AppToast.show(this, "Gap Auto Fill742: ${if (!current) "ON" else "OFF"}")
}

// v742: Gate Auto Control742
internal fun PlayerActivity.showV742GateAutoControl742Toggle() {
    val current = BiliClient.prefs.v742gateAutoControl742
    BiliClient.prefs.v742gateAutoControl742 = !current
    AppToast.show(this, "Gate Auto Control742: ${if (!current) "ON" else "OFF"}")
}

// v742: Generate Auto Report742
internal fun PlayerActivity.showV742GenerateAutoReport742Toggle() {
    val current = BiliClient.prefs.v742generateAutoReport742
    BiliClient.prefs.v742generateAutoReport742 = !current
    AppToast.show(this, "Generate Auto Report742: ${if (!current) "ON" else "OFF"}")
}

// v742: Gesture Auto Swipe742
internal fun PlayerActivity.showV742GestureAutoSwipe742Toggle() {
    val current = BiliClient.prefs.v742gestureAutoSwipe742
    BiliClient.prefs.v742gestureAutoSwipe742 = !current
    AppToast.show(this, "Gesture Auto Swipe742: ${if (!current) "ON" else "OFF"}")
}

// v742: Global Auto Sync742
internal fun PlayerActivity.showV742GlobalAutoSync742Toggle() {
    val current = BiliClient.prefs.v742globalAutoSync742
    BiliClient.prefs.v742globalAutoSync742 = !current
    AppToast.show(this, "Global Auto Sync742: ${if (!current) "ON" else "OFF"}")
}

// v742: Glyph Auto Render742
internal fun PlayerActivity.showV742GlyphAutoRender742Toggle() {
    val current = BiliClient.prefs.v742glyphAutoRender742
    BiliClient.prefs.v742glyphAutoRender742 = !current
    AppToast.show(this, "Glyph Auto Render742: ${if (!current) "ON" else "OFF"}")
}

// v742: Gradient Auto Color742
internal fun PlayerActivity.showV742GradientAutoColor742Toggle() {
    val current = BiliClient.prefs.v742gradientAutoColor742
    BiliClient.prefs.v742gradientAutoColor742 = !current
    AppToast.show(this, "Gradient Auto Color742: ${if (!current) "ON" else "OFF"}")
}

// v742: Grant Auto Access742
internal fun PlayerActivity.showV742GrantAutoAccess742Toggle() {
    val current = BiliClient.prefs.v742grantAutoAccess742
    BiliClient.prefs.v742grantAutoAccess742 = !current
    AppToast.show(this, "Grant Auto Access742: ${if (!current) "ON" else "OFF"}")
}

// v742: Graph Auto Layout742
internal fun PlayerActivity.showV742GraphAutoLayout742Toggle() {
    val current = BiliClient.prefs.v742graphAutoLayout742
    BiliClient.prefs.v742graphAutoLayout742 = !current
    AppToast.show(this, "Graph Auto Layout742: ${if (!current) "ON" else "OFF"}")
}

// v742: Gravity Auto Sensor742
internal fun PlayerActivity.showV742GravityAutoSensor742Toggle() {
    val current = BiliClient.prefs.v742gravityAutoSensor742
    BiliClient.prefs.v742gravityAutoSensor742 = !current
    AppToast.show(this, "Gravity Auto Sensor742: ${if (!current) "ON" else "OFF"}")
}

// v742: Grid Auto Adaptive742
internal fun PlayerActivity.showV742GridAutoAdaptive742Toggle() {
    val current = BiliClient.prefs.v742gridAutoAdaptive742
    BiliClient.prefs.v742gridAutoAdaptive742 = !current
    AppToast.show(this, "Grid Auto Adaptive742: ${if (!current) "ON" else "OFF"}")
}

// v742: Group Auto Cluster742
internal fun PlayerActivity.showV742GroupAutoCluster742Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v742groupAutoCluster742).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster742",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v742groupAutoCluster742 = value
        AppToast.show(this, "Group Auto Cluster742: $value")
    }
}

// v742: Grow Auto Animate742
internal fun PlayerActivity.showV742GrowAutoAnimate742Toggle() {
    val current = BiliClient.prefs.v742growAutoAnimate742
    BiliClient.prefs.v742growAutoAnimate742 = !current
    AppToast.show(this, "Grow Auto Animate742: ${if (!current) "ON" else "OFF"}")
}

// v743: Gain Auto Level743
internal fun PlayerActivity.showV743GainAutoLevel743Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v743gainAutoLevel743).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level743",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v743gainAutoLevel743 = value
        AppToast.show(this, "Gain Auto Level743: $value")
    }
}

// v743: Gamma Auto Correct743
internal fun PlayerActivity.showV743GammaAutoCorrect743Toggle() {
    val current = BiliClient.prefs.v743gammaAutoCorrect743
    BiliClient.prefs.v743gammaAutoCorrect743 = !current
    AppToast.show(this, "Gamma Auto Correct743: ${if (!current) "ON" else "OFF"}")
}

// v743: Gap Auto Fill743
internal fun PlayerActivity.showV743GapAutoFill743Toggle() {
    val current = BiliClient.prefs.v743gapAutoFill743
    BiliClient.prefs.v743gapAutoFill743 = !current
    AppToast.show(this, "Gap Auto Fill743: ${if (!current) "ON" else "OFF"}")
}

// v743: Gate Auto Control743
internal fun PlayerActivity.showV743GateAutoControl743Toggle() {
    val current = BiliClient.prefs.v743gateAutoControl743
    BiliClient.prefs.v743gateAutoControl743 = !current
    AppToast.show(this, "Gate Auto Control743: ${if (!current) "ON" else "OFF"}")
}

// v743: Generate Auto Report743
internal fun PlayerActivity.showV743GenerateAutoReport743Toggle() {
    val current = BiliClient.prefs.v743generateAutoReport743
    BiliClient.prefs.v743generateAutoReport743 = !current
    AppToast.show(this, "Generate Auto Report743: ${if (!current) "ON" else "OFF"}")
}

// v743: Gesture Auto Swipe743
internal fun PlayerActivity.showV743GestureAutoSwipe743Toggle() {
    val current = BiliClient.prefs.v743gestureAutoSwipe743
    BiliClient.prefs.v743gestureAutoSwipe743 = !current
    AppToast.show(this, "Gesture Auto Swipe743: ${if (!current) "ON" else "OFF"}")
}

// v743: Global Auto Sync743
internal fun PlayerActivity.showV743GlobalAutoSync743Toggle() {
    val current = BiliClient.prefs.v743globalAutoSync743
    BiliClient.prefs.v743globalAutoSync743 = !current
    AppToast.show(this, "Global Auto Sync743: ${if (!current) "ON" else "OFF"}")
}

// v743: Glyph Auto Render743
internal fun PlayerActivity.showV743GlyphAutoRender743Toggle() {
    val current = BiliClient.prefs.v743glyphAutoRender743
    BiliClient.prefs.v743glyphAutoRender743 = !current
    AppToast.show(this, "Glyph Auto Render743: ${if (!current) "ON" else "OFF"}")
}

// v743: Gradient Auto Color743
internal fun PlayerActivity.showV743GradientAutoColor743Toggle() {
    val current = BiliClient.prefs.v743gradientAutoColor743
    BiliClient.prefs.v743gradientAutoColor743 = !current
    AppToast.show(this, "Gradient Auto Color743: ${if (!current) "ON" else "OFF"}")
}

// v743: Grant Auto Access743
internal fun PlayerActivity.showV743GrantAutoAccess743Toggle() {
    val current = BiliClient.prefs.v743grantAutoAccess743
    BiliClient.prefs.v743grantAutoAccess743 = !current
    AppToast.show(this, "Grant Auto Access743: ${if (!current) "ON" else "OFF"}")
}

// v743: Graph Auto Layout743
internal fun PlayerActivity.showV743GraphAutoLayout743Toggle() {
    val current = BiliClient.prefs.v743graphAutoLayout743
    BiliClient.prefs.v743graphAutoLayout743 = !current
    AppToast.show(this, "Graph Auto Layout743: ${if (!current) "ON" else "OFF"}")
}

// v743: Gravity Auto Sensor743
internal fun PlayerActivity.showV743GravityAutoSensor743Toggle() {
    val current = BiliClient.prefs.v743gravityAutoSensor743
    BiliClient.prefs.v743gravityAutoSensor743 = !current
    AppToast.show(this, "Gravity Auto Sensor743: ${if (!current) "ON" else "OFF"}")
}

// v743: Grid Auto Adaptive743
internal fun PlayerActivity.showV743GridAutoAdaptive743Toggle() {
    val current = BiliClient.prefs.v743gridAutoAdaptive743
    BiliClient.prefs.v743gridAutoAdaptive743 = !current
    AppToast.show(this, "Grid Auto Adaptive743: ${if (!current) "ON" else "OFF"}")
}

// v743: Group Auto Cluster743
internal fun PlayerActivity.showV743GroupAutoCluster743Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v743groupAutoCluster743).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster743",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v743groupAutoCluster743 = value
        AppToast.show(this, "Group Auto Cluster743: $value")
    }
}

// v743: Grow Auto Animate743
internal fun PlayerActivity.showV743GrowAutoAnimate743Toggle() {
    val current = BiliClient.prefs.v743growAutoAnimate743
    BiliClient.prefs.v743growAutoAnimate743 = !current
    AppToast.show(this, "Grow Auto Animate743: ${if (!current) "ON" else "OFF"}")
}

// v744: Gain Auto Level744
internal fun PlayerActivity.showV744GainAutoLevel744Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v744gainAutoLevel744).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level744",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v744gainAutoLevel744 = value
        AppToast.show(this, "Gain Auto Level744: $value")
    }
}

// v744: Gamma Auto Correct744
internal fun PlayerActivity.showV744GammaAutoCorrect744Toggle() {
    val current = BiliClient.prefs.v744gammaAutoCorrect744
    BiliClient.prefs.v744gammaAutoCorrect744 = !current
    AppToast.show(this, "Gamma Auto Correct744: ${if (!current) "ON" else "OFF"}")
}

// v744: Gap Auto Fill744
internal fun PlayerActivity.showV744GapAutoFill744Toggle() {
    val current = BiliClient.prefs.v744gapAutoFill744
    BiliClient.prefs.v744gapAutoFill744 = !current
    AppToast.show(this, "Gap Auto Fill744: ${if (!current) "ON" else "OFF"}")
}

// v744: Gate Auto Control744
internal fun PlayerActivity.showV744GateAutoControl744Toggle() {
    val current = BiliClient.prefs.v744gateAutoControl744
    BiliClient.prefs.v744gateAutoControl744 = !current
    AppToast.show(this, "Gate Auto Control744: ${if (!current) "ON" else "OFF"}")
}

// v744: Generate Auto Report744
internal fun PlayerActivity.showV744GenerateAutoReport744Toggle() {
    val current = BiliClient.prefs.v744generateAutoReport744
    BiliClient.prefs.v744generateAutoReport744 = !current
    AppToast.show(this, "Generate Auto Report744: ${if (!current) "ON" else "OFF"}")
}

// v744: Gesture Auto Swipe744
internal fun PlayerActivity.showV744GestureAutoSwipe744Toggle() {
    val current = BiliClient.prefs.v744gestureAutoSwipe744
    BiliClient.prefs.v744gestureAutoSwipe744 = !current
    AppToast.show(this, "Gesture Auto Swipe744: ${if (!current) "ON" else "OFF"}")
}

// v744: Global Auto Sync744
internal fun PlayerActivity.showV744GlobalAutoSync744Toggle() {
    val current = BiliClient.prefs.v744globalAutoSync744
    BiliClient.prefs.v744globalAutoSync744 = !current
    AppToast.show(this, "Global Auto Sync744: ${if (!current) "ON" else "OFF"}")
}

// v744: Glyph Auto Render744
internal fun PlayerActivity.showV744GlyphAutoRender744Toggle() {
    val current = BiliClient.prefs.v744glyphAutoRender744
    BiliClient.prefs.v744glyphAutoRender744 = !current
    AppToast.show(this, "Glyph Auto Render744: ${if (!current) "ON" else "OFF"}")
}

// v744: Gradient Auto Color744
internal fun PlayerActivity.showV744GradientAutoColor744Toggle() {
    val current = BiliClient.prefs.v744gradientAutoColor744
    BiliClient.prefs.v744gradientAutoColor744 = !current
    AppToast.show(this, "Gradient Auto Color744: ${if (!current) "ON" else "OFF"}")
}

// v744: Grant Auto Access744
internal fun PlayerActivity.showV744GrantAutoAccess744Toggle() {
    val current = BiliClient.prefs.v744grantAutoAccess744
    BiliClient.prefs.v744grantAutoAccess744 = !current
    AppToast.show(this, "Grant Auto Access744: ${if (!current) "ON" else "OFF"}")
}

// v744: Graph Auto Layout744
internal fun PlayerActivity.showV744GraphAutoLayout744Toggle() {
    val current = BiliClient.prefs.v744graphAutoLayout744
    BiliClient.prefs.v744graphAutoLayout744 = !current
    AppToast.show(this, "Graph Auto Layout744: ${if (!current) "ON" else "OFF"}")
}

// v744: Gravity Auto Sensor744
internal fun PlayerActivity.showV744GravityAutoSensor744Toggle() {
    val current = BiliClient.prefs.v744gravityAutoSensor744
    BiliClient.prefs.v744gravityAutoSensor744 = !current
    AppToast.show(this, "Gravity Auto Sensor744: ${if (!current) "ON" else "OFF"}")
}

// v744: Grid Auto Adaptive744
internal fun PlayerActivity.showV744GridAutoAdaptive744Toggle() {
    val current = BiliClient.prefs.v744gridAutoAdaptive744
    BiliClient.prefs.v744gridAutoAdaptive744 = !current
    AppToast.show(this, "Grid Auto Adaptive744: ${if (!current) "ON" else "OFF"}")
}

// v744: Group Auto Cluster744
internal fun PlayerActivity.showV744GroupAutoCluster744Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v744groupAutoCluster744).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster744",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v744groupAutoCluster744 = value
        AppToast.show(this, "Group Auto Cluster744: $value")
    }
}

// v744: Grow Auto Animate744
internal fun PlayerActivity.showV744GrowAutoAnimate744Toggle() {
    val current = BiliClient.prefs.v744growAutoAnimate744
    BiliClient.prefs.v744growAutoAnimate744 = !current
    AppToast.show(this, "Grow Auto Animate744: ${if (!current) "ON" else "OFF"}")
}

// v745: Gain Auto Level745
internal fun PlayerActivity.showV745GainAutoLevel745Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v745gainAutoLevel745).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level745",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v745gainAutoLevel745 = value
        AppToast.show(this, "Gain Auto Level745: $value")
    }
}

// v745: Gamma Auto Correct745
internal fun PlayerActivity.showV745GammaAutoCorrect745Toggle() {
    val current = BiliClient.prefs.v745gammaAutoCorrect745
    BiliClient.prefs.v745gammaAutoCorrect745 = !current
    AppToast.show(this, "Gamma Auto Correct745: ${if (!current) "ON" else "OFF"}")
}

// v745: Gap Auto Fill745
internal fun PlayerActivity.showV745GapAutoFill745Toggle() {
    val current = BiliClient.prefs.v745gapAutoFill745
    BiliClient.prefs.v745gapAutoFill745 = !current
    AppToast.show(this, "Gap Auto Fill745: ${if (!current) "ON" else "OFF"}")
}

// v745: Gate Auto Control745
internal fun PlayerActivity.showV745GateAutoControl745Toggle() {
    val current = BiliClient.prefs.v745gateAutoControl745
    BiliClient.prefs.v745gateAutoControl745 = !current
    AppToast.show(this, "Gate Auto Control745: ${if (!current) "ON" else "OFF"}")
}

// v745: Generate Auto Report745
internal fun PlayerActivity.showV745GenerateAutoReport745Toggle() {
    val current = BiliClient.prefs.v745generateAutoReport745
    BiliClient.prefs.v745generateAutoReport745 = !current
    AppToast.show(this, "Generate Auto Report745: ${if (!current) "ON" else "OFF"}")
}

// v745: Gesture Auto Swipe745
internal fun PlayerActivity.showV745GestureAutoSwipe745Toggle() {
    val current = BiliClient.prefs.v745gestureAutoSwipe745
    BiliClient.prefs.v745gestureAutoSwipe745 = !current
    AppToast.show(this, "Gesture Auto Swipe745: ${if (!current) "ON" else "OFF"}")
}

// v745: Global Auto Sync745
internal fun PlayerActivity.showV745GlobalAutoSync745Toggle() {
    val current = BiliClient.prefs.v745globalAutoSync745
    BiliClient.prefs.v745globalAutoSync745 = !current
    AppToast.show(this, "Global Auto Sync745: ${if (!current) "ON" else "OFF"}")
}

// v745: Glyph Auto Render745
internal fun PlayerActivity.showV745GlyphAutoRender745Toggle() {
    val current = BiliClient.prefs.v745glyphAutoRender745
    BiliClient.prefs.v745glyphAutoRender745 = !current
    AppToast.show(this, "Glyph Auto Render745: ${if (!current) "ON" else "OFF"}")
}

// v745: Gradient Auto Color745
internal fun PlayerActivity.showV745GradientAutoColor745Toggle() {
    val current = BiliClient.prefs.v745gradientAutoColor745
    BiliClient.prefs.v745gradientAutoColor745 = !current
    AppToast.show(this, "Gradient Auto Color745: ${if (!current) "ON" else "OFF"}")
}

// v745: Grant Auto Access745
internal fun PlayerActivity.showV745GrantAutoAccess745Toggle() {
    val current = BiliClient.prefs.v745grantAutoAccess745
    BiliClient.prefs.v745grantAutoAccess745 = !current
    AppToast.show(this, "Grant Auto Access745: ${if (!current) "ON" else "OFF"}")
}

// v745: Graph Auto Layout745
internal fun PlayerActivity.showV745GraphAutoLayout745Toggle() {
    val current = BiliClient.prefs.v745graphAutoLayout745
    BiliClient.prefs.v745graphAutoLayout745 = !current
    AppToast.show(this, "Graph Auto Layout745: ${if (!current) "ON" else "OFF"}")
}

// v745: Gravity Auto Sensor745
internal fun PlayerActivity.showV745GravityAutoSensor745Toggle() {
    val current = BiliClient.prefs.v745gravityAutoSensor745
    BiliClient.prefs.v745gravityAutoSensor745 = !current
    AppToast.show(this, "Gravity Auto Sensor745: ${if (!current) "ON" else "OFF"}")
}

// v745: Grid Auto Adaptive745
internal fun PlayerActivity.showV745GridAutoAdaptive745Toggle() {
    val current = BiliClient.prefs.v745gridAutoAdaptive745
    BiliClient.prefs.v745gridAutoAdaptive745 = !current
    AppToast.show(this, "Grid Auto Adaptive745: ${if (!current) "ON" else "OFF"}")
}

// v745: Group Auto Cluster745
internal fun PlayerActivity.showV745GroupAutoCluster745Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v745groupAutoCluster745).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster745",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v745groupAutoCluster745 = value
        AppToast.show(this, "Group Auto Cluster745: $value")
    }
}

// v745: Grow Auto Animate745
internal fun PlayerActivity.showV745GrowAutoAnimate745Toggle() {
    val current = BiliClient.prefs.v745growAutoAnimate745
    BiliClient.prefs.v745growAutoAnimate745 = !current
    AppToast.show(this, "Grow Auto Animate745: ${if (!current) "ON" else "OFF"}")
}

// v746: Gain Auto Level746
internal fun PlayerActivity.showV746GainAutoLevel746Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v746gainAutoLevel746).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level746",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v746gainAutoLevel746 = value
        AppToast.show(this, "Gain Auto Level746: $value")
    }
}

// v746: Gamma Auto Correct746
internal fun PlayerActivity.showV746GammaAutoCorrect746Toggle() {
    val current = BiliClient.prefs.v746gammaAutoCorrect746
    BiliClient.prefs.v746gammaAutoCorrect746 = !current
    AppToast.show(this, "Gamma Auto Correct746: ${if (!current) "ON" else "OFF"}")
}

// v746: Gap Auto Fill746
internal fun PlayerActivity.showV746GapAutoFill746Toggle() {
    val current = BiliClient.prefs.v746gapAutoFill746
    BiliClient.prefs.v746gapAutoFill746 = !current
    AppToast.show(this, "Gap Auto Fill746: ${if (!current) "ON" else "OFF"}")
}

// v746: Gate Auto Control746
internal fun PlayerActivity.showV746GateAutoControl746Toggle() {
    val current = BiliClient.prefs.v746gateAutoControl746
    BiliClient.prefs.v746gateAutoControl746 = !current
    AppToast.show(this, "Gate Auto Control746: ${if (!current) "ON" else "OFF"}")
}

// v746: Generate Auto Report746
internal fun PlayerActivity.showV746GenerateAutoReport746Toggle() {
    val current = BiliClient.prefs.v746generateAutoReport746
    BiliClient.prefs.v746generateAutoReport746 = !current
    AppToast.show(this, "Generate Auto Report746: ${if (!current) "ON" else "OFF"}")
}

// v746: Gesture Auto Swipe746
internal fun PlayerActivity.showV746GestureAutoSwipe746Toggle() {
    val current = BiliClient.prefs.v746gestureAutoSwipe746
    BiliClient.prefs.v746gestureAutoSwipe746 = !current
    AppToast.show(this, "Gesture Auto Swipe746: ${if (!current) "ON" else "OFF"}")
}

// v746: Global Auto Sync746
internal fun PlayerActivity.showV746GlobalAutoSync746Toggle() {
    val current = BiliClient.prefs.v746globalAutoSync746
    BiliClient.prefs.v746globalAutoSync746 = !current
    AppToast.show(this, "Global Auto Sync746: ${if (!current) "ON" else "OFF"}")
}

// v746: Glyph Auto Render746
internal fun PlayerActivity.showV746GlyphAutoRender746Toggle() {
    val current = BiliClient.prefs.v746glyphAutoRender746
    BiliClient.prefs.v746glyphAutoRender746 = !current
    AppToast.show(this, "Glyph Auto Render746: ${if (!current) "ON" else "OFF"}")
}

// v746: Gradient Auto Color746
internal fun PlayerActivity.showV746GradientAutoColor746Toggle() {
    val current = BiliClient.prefs.v746gradientAutoColor746
    BiliClient.prefs.v746gradientAutoColor746 = !current
    AppToast.show(this, "Gradient Auto Color746: ${if (!current) "ON" else "OFF"}")
}

// v746: Grant Auto Access746
internal fun PlayerActivity.showV746GrantAutoAccess746Toggle() {
    val current = BiliClient.prefs.v746grantAutoAccess746
    BiliClient.prefs.v746grantAutoAccess746 = !current
    AppToast.show(this, "Grant Auto Access746: ${if (!current) "ON" else "OFF"}")
}

// v746: Graph Auto Layout746
internal fun PlayerActivity.showV746GraphAutoLayout746Toggle() {
    val current = BiliClient.prefs.v746graphAutoLayout746
    BiliClient.prefs.v746graphAutoLayout746 = !current
    AppToast.show(this, "Graph Auto Layout746: ${if (!current) "ON" else "OFF"}")
}

// v746: Gravity Auto Sensor746
internal fun PlayerActivity.showV746GravityAutoSensor746Toggle() {
    val current = BiliClient.prefs.v746gravityAutoSensor746
    BiliClient.prefs.v746gravityAutoSensor746 = !current
    AppToast.show(this, "Gravity Auto Sensor746: ${if (!current) "ON" else "OFF"}")
}

// v746: Grid Auto Adaptive746
internal fun PlayerActivity.showV746GridAutoAdaptive746Toggle() {
    val current = BiliClient.prefs.v746gridAutoAdaptive746
    BiliClient.prefs.v746gridAutoAdaptive746 = !current
    AppToast.show(this, "Grid Auto Adaptive746: ${if (!current) "ON" else "OFF"}")
}

// v746: Group Auto Cluster746
internal fun PlayerActivity.showV746GroupAutoCluster746Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v746groupAutoCluster746).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster746",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v746groupAutoCluster746 = value
        AppToast.show(this, "Group Auto Cluster746: $value")
    }
}

// v746: Grow Auto Animate746
internal fun PlayerActivity.showV746GrowAutoAnimate746Toggle() {
    val current = BiliClient.prefs.v746growAutoAnimate746
    BiliClient.prefs.v746growAutoAnimate746 = !current
    AppToast.show(this, "Grow Auto Animate746: ${if (!current) "ON" else "OFF"}")
}

// v747: Gain Auto Level747
internal fun PlayerActivity.showV747GainAutoLevel747Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v747gainAutoLevel747).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level747",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v747gainAutoLevel747 = value
        AppToast.show(this, "Gain Auto Level747: $value")
    }
}

// v747: Gamma Auto Correct747
internal fun PlayerActivity.showV747GammaAutoCorrect747Toggle() {
    val current = BiliClient.prefs.v747gammaAutoCorrect747
    BiliClient.prefs.v747gammaAutoCorrect747 = !current
    AppToast.show(this, "Gamma Auto Correct747: ${if (!current) "ON" else "OFF"}")
}

// v747: Gap Auto Fill747
internal fun PlayerActivity.showV747GapAutoFill747Toggle() {
    val current = BiliClient.prefs.v747gapAutoFill747
    BiliClient.prefs.v747gapAutoFill747 = !current
    AppToast.show(this, "Gap Auto Fill747: ${if (!current) "ON" else "OFF"}")
}

// v747: Gate Auto Control747
internal fun PlayerActivity.showV747GateAutoControl747Toggle() {
    val current = BiliClient.prefs.v747gateAutoControl747
    BiliClient.prefs.v747gateAutoControl747 = !current
    AppToast.show(this, "Gate Auto Control747: ${if (!current) "ON" else "OFF"}")
}

// v747: Generate Auto Report747
internal fun PlayerActivity.showV747GenerateAutoReport747Toggle() {
    val current = BiliClient.prefs.v747generateAutoReport747
    BiliClient.prefs.v747generateAutoReport747 = !current
    AppToast.show(this, "Generate Auto Report747: ${if (!current) "ON" else "OFF"}")
}

// v747: Gesture Auto Swipe747
internal fun PlayerActivity.showV747GestureAutoSwipe747Toggle() {
    val current = BiliClient.prefs.v747gestureAutoSwipe747
    BiliClient.prefs.v747gestureAutoSwipe747 = !current
    AppToast.show(this, "Gesture Auto Swipe747: ${if (!current) "ON" else "OFF"}")
}

// v747: Global Auto Sync747
internal fun PlayerActivity.showV747GlobalAutoSync747Toggle() {
    val current = BiliClient.prefs.v747globalAutoSync747
    BiliClient.prefs.v747globalAutoSync747 = !current
    AppToast.show(this, "Global Auto Sync747: ${if (!current) "ON" else "OFF"}")
}

// v747: Glyph Auto Render747
internal fun PlayerActivity.showV747GlyphAutoRender747Toggle() {
    val current = BiliClient.prefs.v747glyphAutoRender747
    BiliClient.prefs.v747glyphAutoRender747 = !current
    AppToast.show(this, "Glyph Auto Render747: ${if (!current) "ON" else "OFF"}")
}

// v747: Gradient Auto Color747
internal fun PlayerActivity.showV747GradientAutoColor747Toggle() {
    val current = BiliClient.prefs.v747gradientAutoColor747
    BiliClient.prefs.v747gradientAutoColor747 = !current
    AppToast.show(this, "Gradient Auto Color747: ${if (!current) "ON" else "OFF"}")
}

// v747: Grant Auto Access747
internal fun PlayerActivity.showV747GrantAutoAccess747Toggle() {
    val current = BiliClient.prefs.v747grantAutoAccess747
    BiliClient.prefs.v747grantAutoAccess747 = !current
    AppToast.show(this, "Grant Auto Access747: ${if (!current) "ON" else "OFF"}")
}

// v747: Graph Auto Layout747
internal fun PlayerActivity.showV747GraphAutoLayout747Toggle() {
    val current = BiliClient.prefs.v747graphAutoLayout747
    BiliClient.prefs.v747graphAutoLayout747 = !current
    AppToast.show(this, "Graph Auto Layout747: ${if (!current) "ON" else "OFF"}")
}

// v747: Gravity Auto Sensor747
internal fun PlayerActivity.showV747GravityAutoSensor747Toggle() {
    val current = BiliClient.prefs.v747gravityAutoSensor747
    BiliClient.prefs.v747gravityAutoSensor747 = !current
    AppToast.show(this, "Gravity Auto Sensor747: ${if (!current) "ON" else "OFF"}")
}

// v747: Grid Auto Adaptive747
internal fun PlayerActivity.showV747GridAutoAdaptive747Toggle() {
    val current = BiliClient.prefs.v747gridAutoAdaptive747
    BiliClient.prefs.v747gridAutoAdaptive747 = !current
    AppToast.show(this, "Grid Auto Adaptive747: ${if (!current) "ON" else "OFF"}")
}

// v747: Group Auto Cluster747
internal fun PlayerActivity.showV747GroupAutoCluster747Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v747groupAutoCluster747).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster747",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v747groupAutoCluster747 = value
        AppToast.show(this, "Group Auto Cluster747: $value")
    }
}

// v747: Grow Auto Animate747
internal fun PlayerActivity.showV747GrowAutoAnimate747Toggle() {
    val current = BiliClient.prefs.v747growAutoAnimate747
    BiliClient.prefs.v747growAutoAnimate747 = !current
    AppToast.show(this, "Grow Auto Animate747: ${if (!current) "ON" else "OFF"}")
}

// v748: Gain Auto Level748
internal fun PlayerActivity.showV748GainAutoLevel748Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v748gainAutoLevel748).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level748",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v748gainAutoLevel748 = value
        AppToast.show(this, "Gain Auto Level748: $value")
    }
}

// v748: Gamma Auto Correct748
internal fun PlayerActivity.showV748GammaAutoCorrect748Toggle() {
    val current = BiliClient.prefs.v748gammaAutoCorrect748
    BiliClient.prefs.v748gammaAutoCorrect748 = !current
    AppToast.show(this, "Gamma Auto Correct748: ${if (!current) "ON" else "OFF"}")
}

// v748: Gap Auto Fill748
internal fun PlayerActivity.showV748GapAutoFill748Toggle() {
    val current = BiliClient.prefs.v748gapAutoFill748
    BiliClient.prefs.v748gapAutoFill748 = !current
    AppToast.show(this, "Gap Auto Fill748: ${if (!current) "ON" else "OFF"}")
}

// v748: Gate Auto Control748
internal fun PlayerActivity.showV748GateAutoControl748Toggle() {
    val current = BiliClient.prefs.v748gateAutoControl748
    BiliClient.prefs.v748gateAutoControl748 = !current
    AppToast.show(this, "Gate Auto Control748: ${if (!current) "ON" else "OFF"}")
}

// v748: Generate Auto Report748
internal fun PlayerActivity.showV748GenerateAutoReport748Toggle() {
    val current = BiliClient.prefs.v748generateAutoReport748
    BiliClient.prefs.v748generateAutoReport748 = !current
    AppToast.show(this, "Generate Auto Report748: ${if (!current) "ON" else "OFF"}")
}

// v748: Gesture Auto Swipe748
internal fun PlayerActivity.showV748GestureAutoSwipe748Toggle() {
    val current = BiliClient.prefs.v748gestureAutoSwipe748
    BiliClient.prefs.v748gestureAutoSwipe748 = !current
    AppToast.show(this, "Gesture Auto Swipe748: ${if (!current) "ON" else "OFF"}")
}

// v748: Global Auto Sync748
internal fun PlayerActivity.showV748GlobalAutoSync748Toggle() {
    val current = BiliClient.prefs.v748globalAutoSync748
    BiliClient.prefs.v748globalAutoSync748 = !current
    AppToast.show(this, "Global Auto Sync748: ${if (!current) "ON" else "OFF"}")
}

// v748: Glyph Auto Render748
internal fun PlayerActivity.showV748GlyphAutoRender748Toggle() {
    val current = BiliClient.prefs.v748glyphAutoRender748
    BiliClient.prefs.v748glyphAutoRender748 = !current
    AppToast.show(this, "Glyph Auto Render748: ${if (!current) "ON" else "OFF"}")
}

// v748: Gradient Auto Color748
internal fun PlayerActivity.showV748GradientAutoColor748Toggle() {
    val current = BiliClient.prefs.v748gradientAutoColor748
    BiliClient.prefs.v748gradientAutoColor748 = !current
    AppToast.show(this, "Gradient Auto Color748: ${if (!current) "ON" else "OFF"}")
}

// v748: Grant Auto Access748
internal fun PlayerActivity.showV748GrantAutoAccess748Toggle() {
    val current = BiliClient.prefs.v748grantAutoAccess748
    BiliClient.prefs.v748grantAutoAccess748 = !current
    AppToast.show(this, "Grant Auto Access748: ${if (!current) "ON" else "OFF"}")
}

// v748: Graph Auto Layout748
internal fun PlayerActivity.showV748GraphAutoLayout748Toggle() {
    val current = BiliClient.prefs.v748graphAutoLayout748
    BiliClient.prefs.v748graphAutoLayout748 = !current
    AppToast.show(this, "Graph Auto Layout748: ${if (!current) "ON" else "OFF"}")
}

// v748: Gravity Auto Sensor748
internal fun PlayerActivity.showV748GravityAutoSensor748Toggle() {
    val current = BiliClient.prefs.v748gravityAutoSensor748
    BiliClient.prefs.v748gravityAutoSensor748 = !current
    AppToast.show(this, "Gravity Auto Sensor748: ${if (!current) "ON" else "OFF"}")
}

// v748: Grid Auto Adaptive748
internal fun PlayerActivity.showV748GridAutoAdaptive748Toggle() {
    val current = BiliClient.prefs.v748gridAutoAdaptive748
    BiliClient.prefs.v748gridAutoAdaptive748 = !current
    AppToast.show(this, "Grid Auto Adaptive748: ${if (!current) "ON" else "OFF"}")
}

// v748: Group Auto Cluster748
internal fun PlayerActivity.showV748GroupAutoCluster748Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v748groupAutoCluster748).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster748",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v748groupAutoCluster748 = value
        AppToast.show(this, "Group Auto Cluster748: $value")
    }
}

// v748: Grow Auto Animate748
internal fun PlayerActivity.showV748GrowAutoAnimate748Toggle() {
    val current = BiliClient.prefs.v748growAutoAnimate748
    BiliClient.prefs.v748growAutoAnimate748 = !current
    AppToast.show(this, "Grow Auto Animate748: ${if (!current) "ON" else "OFF"}")
}

// v749: Gain Auto Level749
internal fun PlayerActivity.showV749GainAutoLevel749Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v749gainAutoLevel749).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level749",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v749gainAutoLevel749 = value
        AppToast.show(this, "Gain Auto Level749: $value")
    }
}

// v749: Gamma Auto Correct749
internal fun PlayerActivity.showV749GammaAutoCorrect749Toggle() {
    val current = BiliClient.prefs.v749gammaAutoCorrect749
    BiliClient.prefs.v749gammaAutoCorrect749 = !current
    AppToast.show(this, "Gamma Auto Correct749: ${if (!current) "ON" else "OFF"}")
}

// v749: Gap Auto Fill749
internal fun PlayerActivity.showV749GapAutoFill749Toggle() {
    val current = BiliClient.prefs.v749gapAutoFill749
    BiliClient.prefs.v749gapAutoFill749 = !current
    AppToast.show(this, "Gap Auto Fill749: ${if (!current) "ON" else "OFF"}")
}

// v749: Gate Auto Control749
internal fun PlayerActivity.showV749GateAutoControl749Toggle() {
    val current = BiliClient.prefs.v749gateAutoControl749
    BiliClient.prefs.v749gateAutoControl749 = !current
    AppToast.show(this, "Gate Auto Control749: ${if (!current) "ON" else "OFF"}")
}

// v749: Generate Auto Report749
internal fun PlayerActivity.showV749GenerateAutoReport749Toggle() {
    val current = BiliClient.prefs.v749generateAutoReport749
    BiliClient.prefs.v749generateAutoReport749 = !current
    AppToast.show(this, "Generate Auto Report749: ${if (!current) "ON" else "OFF"}")
}

// v749: Gesture Auto Swipe749
internal fun PlayerActivity.showV749GestureAutoSwipe749Toggle() {
    val current = BiliClient.prefs.v749gestureAutoSwipe749
    BiliClient.prefs.v749gestureAutoSwipe749 = !current
    AppToast.show(this, "Gesture Auto Swipe749: ${if (!current) "ON" else "OFF"}")
}

// v749: Global Auto Sync749
internal fun PlayerActivity.showV749GlobalAutoSync749Toggle() {
    val current = BiliClient.prefs.v749globalAutoSync749
    BiliClient.prefs.v749globalAutoSync749 = !current
    AppToast.show(this, "Global Auto Sync749: ${if (!current) "ON" else "OFF"}")
}

// v749: Glyph Auto Render749
internal fun PlayerActivity.showV749GlyphAutoRender749Toggle() {
    val current = BiliClient.prefs.v749glyphAutoRender749
    BiliClient.prefs.v749glyphAutoRender749 = !current
    AppToast.show(this, "Glyph Auto Render749: ${if (!current) "ON" else "OFF"}")
}

// v749: Gradient Auto Color749
internal fun PlayerActivity.showV749GradientAutoColor749Toggle() {
    val current = BiliClient.prefs.v749gradientAutoColor749
    BiliClient.prefs.v749gradientAutoColor749 = !current
    AppToast.show(this, "Gradient Auto Color749: ${if (!current) "ON" else "OFF"}")
}

// v749: Grant Auto Access749
internal fun PlayerActivity.showV749GrantAutoAccess749Toggle() {
    val current = BiliClient.prefs.v749grantAutoAccess749
    BiliClient.prefs.v749grantAutoAccess749 = !current
    AppToast.show(this, "Grant Auto Access749: ${if (!current) "ON" else "OFF"}")
}

// v749: Graph Auto Layout749
internal fun PlayerActivity.showV749GraphAutoLayout749Toggle() {
    val current = BiliClient.prefs.v749graphAutoLayout749
    BiliClient.prefs.v749graphAutoLayout749 = !current
    AppToast.show(this, "Graph Auto Layout749: ${if (!current) "ON" else "OFF"}")
}

// v749: Gravity Auto Sensor749
internal fun PlayerActivity.showV749GravityAutoSensor749Toggle() {
    val current = BiliClient.prefs.v749gravityAutoSensor749
    BiliClient.prefs.v749gravityAutoSensor749 = !current
    AppToast.show(this, "Gravity Auto Sensor749: ${if (!current) "ON" else "OFF"}")
}

// v749: Grid Auto Adaptive749
internal fun PlayerActivity.showV749GridAutoAdaptive749Toggle() {
    val current = BiliClient.prefs.v749gridAutoAdaptive749
    BiliClient.prefs.v749gridAutoAdaptive749 = !current
    AppToast.show(this, "Grid Auto Adaptive749: ${if (!current) "ON" else "OFF"}")
}

// v749: Group Auto Cluster749
internal fun PlayerActivity.showV749GroupAutoCluster749Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v749groupAutoCluster749).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster749",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v749groupAutoCluster749 = value
        AppToast.show(this, "Group Auto Cluster749: $value")
    }
}

// v749: Grow Auto Animate749
internal fun PlayerActivity.showV749GrowAutoAnimate749Toggle() {
    val current = BiliClient.prefs.v749growAutoAnimate749
    BiliClient.prefs.v749growAutoAnimate749 = !current
    AppToast.show(this, "Grow Auto Animate749: ${if (!current) "ON" else "OFF"}")
}

// v750: Gain Auto Level750
internal fun PlayerActivity.showV750GainAutoLevel750Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v750gainAutoLevel750).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gain Auto Level750",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v750gainAutoLevel750 = value
        AppToast.show(this, "Gain Auto Level750: $value")
    }
}

// v750: Gamma Auto Correct750
internal fun PlayerActivity.showV750GammaAutoCorrect750Toggle() {
    val current = BiliClient.prefs.v750gammaAutoCorrect750
    BiliClient.prefs.v750gammaAutoCorrect750 = !current
    AppToast.show(this, "Gamma Auto Correct750: ${if (!current) "ON" else "OFF"}")
}

// v750: Gap Auto Fill750
internal fun PlayerActivity.showV750GapAutoFill750Toggle() {
    val current = BiliClient.prefs.v750gapAutoFill750
    BiliClient.prefs.v750gapAutoFill750 = !current
    AppToast.show(this, "Gap Auto Fill750: ${if (!current) "ON" else "OFF"}")
}

// v750: Gate Auto Control750
internal fun PlayerActivity.showV750GateAutoControl750Toggle() {
    val current = BiliClient.prefs.v750gateAutoControl750
    BiliClient.prefs.v750gateAutoControl750 = !current
    AppToast.show(this, "Gate Auto Control750: ${if (!current) "ON" else "OFF"}")
}

// v750: Generate Auto Report750
internal fun PlayerActivity.showV750GenerateAutoReport750Toggle() {
    val current = BiliClient.prefs.v750generateAutoReport750
    BiliClient.prefs.v750generateAutoReport750 = !current
    AppToast.show(this, "Generate Auto Report750: ${if (!current) "ON" else "OFF"}")
}

// v750: Gesture Auto Swipe750
internal fun PlayerActivity.showV750GestureAutoSwipe750Toggle() {
    val current = BiliClient.prefs.v750gestureAutoSwipe750
    BiliClient.prefs.v750gestureAutoSwipe750 = !current
    AppToast.show(this, "Gesture Auto Swipe750: ${if (!current) "ON" else "OFF"}")
}

// v750: Global Auto Sync750
internal fun PlayerActivity.showV750GlobalAutoSync750Toggle() {
    val current = BiliClient.prefs.v750globalAutoSync750
    BiliClient.prefs.v750globalAutoSync750 = !current
    AppToast.show(this, "Global Auto Sync750: ${if (!current) "ON" else "OFF"}")
}

// v750: Glyph Auto Render750
internal fun PlayerActivity.showV750GlyphAutoRender750Toggle() {
    val current = BiliClient.prefs.v750glyphAutoRender750
    BiliClient.prefs.v750glyphAutoRender750 = !current
    AppToast.show(this, "Glyph Auto Render750: ${if (!current) "ON" else "OFF"}")
}

// v750: Gradient Auto Color750
internal fun PlayerActivity.showV750GradientAutoColor750Toggle() {
    val current = BiliClient.prefs.v750gradientAutoColor750
    BiliClient.prefs.v750gradientAutoColor750 = !current
    AppToast.show(this, "Gradient Auto Color750: ${if (!current) "ON" else "OFF"}")
}

// v750: Grant Auto Access750
internal fun PlayerActivity.showV750GrantAutoAccess750Toggle() {
    val current = BiliClient.prefs.v750grantAutoAccess750
    BiliClient.prefs.v750grantAutoAccess750 = !current
    AppToast.show(this, "Grant Auto Access750: ${if (!current) "ON" else "OFF"}")
}

// v750: Graph Auto Layout750
internal fun PlayerActivity.showV750GraphAutoLayout750Toggle() {
    val current = BiliClient.prefs.v750graphAutoLayout750
    BiliClient.prefs.v750graphAutoLayout750 = !current
    AppToast.show(this, "Graph Auto Layout750: ${if (!current) "ON" else "OFF"}")
}

// v750: Gravity Auto Sensor750
internal fun PlayerActivity.showV750GravityAutoSensor750Toggle() {
    val current = BiliClient.prefs.v750gravityAutoSensor750
    BiliClient.prefs.v750gravityAutoSensor750 = !current
    AppToast.show(this, "Gravity Auto Sensor750: ${if (!current) "ON" else "OFF"}")
}

// v750: Grid Auto Adaptive750
internal fun PlayerActivity.showV750GridAutoAdaptive750Toggle() {
    val current = BiliClient.prefs.v750gridAutoAdaptive750
    BiliClient.prefs.v750gridAutoAdaptive750 = !current
    AppToast.show(this, "Grid Auto Adaptive750: ${if (!current) "ON" else "OFF"}")
}

// v750: Group Auto Cluster750
internal fun PlayerActivity.showV750GroupAutoCluster750Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v750groupAutoCluster750).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Group Auto Cluster750",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v750groupAutoCluster750 = value
        AppToast.show(this, "Group Auto Cluster750: $value")
    }
}

// v750: Grow Auto Animate750
internal fun PlayerActivity.showV750GrowAutoAnimate750Toggle() {
    val current = BiliClient.prefs.v750growAutoAnimate750
    BiliClient.prefs.v750growAutoAnimate750 = !current
    AppToast.show(this, "Grow Auto Animate750: ${if (!current) "ON" else "OFF"}")
}

