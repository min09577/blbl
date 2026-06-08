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

// v841: Orbit Auto Path841
internal fun PlayerActivity.showV841OrbitAutoPath841Toggle() {
    val current = BiliClient.prefs.v841orbitAutoPath841
    BiliClient.prefs.v841orbitAutoPath841 = !current
    AppToast.show(this, "Orbit Auto Path841: ${if (!current) "ON" else "OFF"}")
}

// v841: Order Auto Sort841
internal fun PlayerActivity.showV841OrderAutoSort841Toggle() {
    val current = BiliClient.prefs.v841orderAutoSort841
    BiliClient.prefs.v841orderAutoSort841 = !current
    AppToast.show(this, "Order Auto Sort841: ${if (!current) "ON" else "OFF"}")
}

// v841: Origin Auto Redirect841
internal fun PlayerActivity.showV841OriginAutoRedirect841Toggle() {
    val current = BiliClient.prefs.v841originAutoRedirect841
    BiliClient.prefs.v841originAutoRedirect841 = !current
    AppToast.show(this, "Origin Auto Redirect841: ${if (!current) "ON" else "OFF"}")
}

// v841: Out Auto Bound841
internal fun PlayerActivity.showV841OutAutoBound841Toggle() {
    val current = BiliClient.prefs.v841outAutoBound841
    BiliClient.prefs.v841outAutoBound841 = !current
    AppToast.show(this, "Out Auto Bound841: ${if (!current) "ON" else "OFF"}")
}

// v841: Output Auto Buffer841
internal fun PlayerActivity.showV841OutputAutoBuffer841Toggle() {
    val current = BiliClient.prefs.v841outputAutoBuffer841
    BiliClient.prefs.v841outputAutoBuffer841 = !current
    AppToast.show(this, "Output Auto Buffer841: ${if (!current) "ON" else "OFF"}")
}

// v841: Overlay Auto Dim841
internal fun PlayerActivity.showV841OverlayAutoDim841Toggle() {
    val current = BiliClient.prefs.v841overlayAutoDim841
    BiliClient.prefs.v841overlayAutoDim841 = !current
    AppToast.show(this, "Overlay Auto Dim841: ${if (!current) "ON" else "OFF"}")
}

// v841: Owner Auto Permission841
internal fun PlayerActivity.showV841OwnerAutoPermission841Toggle() {
    val current = BiliClient.prefs.v841ownerAutoPermission841
    BiliClient.prefs.v841ownerAutoPermission841 = !current
    AppToast.show(this, "Owner Auto Permission841: ${if (!current) "ON" else "OFF"}")
}

// v841: Pack Auto Bundle841
internal fun PlayerActivity.showV841PackAutoBundle841Toggle() {
    val current = BiliClient.prefs.v841packAutoBundle841
    BiliClient.prefs.v841packAutoBundle841 = !current
    AppToast.show(this, "Pack Auto Bundle841: ${if (!current) "ON" else "OFF"}")
}

// v841: Package Auto Verify841
internal fun PlayerActivity.showV841PackageAutoVerify841Toggle() {
    val current = BiliClient.prefs.v841packageAutoVerify841
    BiliClient.prefs.v841packageAutoVerify841 = !current
    AppToast.show(this, "Package Auto Verify841: ${if (!current) "ON" else "OFF"}")
}

// v841: Page Auto Scroll841
internal fun PlayerActivity.showV841PageAutoScroll841Toggle() {
    val current = BiliClient.prefs.v841pageAutoScroll841
    BiliClient.prefs.v841pageAutoScroll841 = !current
    AppToast.show(this, "Page Auto Scroll841: ${if (!current) "ON" else "OFF"}")
}

// v841: Paint Auto Stroke841
internal fun PlayerActivity.showV841PaintAutoStroke841Toggle() {
    val current = BiliClient.prefs.v841paintAutoStroke841
    BiliClient.prefs.v841paintAutoStroke841 = !current
    AppToast.show(this, "Paint Auto Stroke841: ${if (!current) "ON" else "OFF"}")
}

// v841: Pair Auto Sync841
internal fun PlayerActivity.showV841PairAutoSync841Toggle() {
    val current = BiliClient.prefs.v841pairAutoSync841
    BiliClient.prefs.v841pairAutoSync841 = !current
    AppToast.show(this, "Pair Auto Sync841: ${if (!current) "ON" else "OFF"}")
}

// v841: Panel Auto Slide841
internal fun PlayerActivity.showV841PanelAutoSlide841Toggle() {
    val current = BiliClient.prefs.v841panelAutoSlide841
    BiliClient.prefs.v841panelAutoSlide841 = !current
    AppToast.show(this, "Panel Auto Slide841: ${if (!current) "ON" else "OFF"}")
}

// v841: Parallel Auto Task841
internal fun PlayerActivity.showV841ParallelAutoTask841Toggle() {
    val current = BiliClient.prefs.v841parallelAutoTask841
    BiliClient.prefs.v841parallelAutoTask841 = !current
    AppToast.show(this, "Parallel Auto Task841: ${if (!current) "ON" else "OFF"}")
}

// v841: Param Auto Inject841
internal fun PlayerActivity.showV841ParamAutoInject841Toggle() {
    val current = BiliClient.prefs.v841paramAutoInject841
    BiliClient.prefs.v841paramAutoInject841 = !current
    AppToast.show(this, "Param Auto Inject841: ${if (!current) "ON" else "OFF"}")
}

// v842: Orbit Auto Path842
internal fun PlayerActivity.showV842OrbitAutoPath842Toggle() {
    val current = BiliClient.prefs.v842orbitAutoPath842
    BiliClient.prefs.v842orbitAutoPath842 = !current
    AppToast.show(this, "Orbit Auto Path842: ${if (!current) "ON" else "OFF"}")
}

// v842: Order Auto Sort842
internal fun PlayerActivity.showV842OrderAutoSort842Toggle() {
    val current = BiliClient.prefs.v842orderAutoSort842
    BiliClient.prefs.v842orderAutoSort842 = !current
    AppToast.show(this, "Order Auto Sort842: ${if (!current) "ON" else "OFF"}")
}

// v842: Origin Auto Redirect842
internal fun PlayerActivity.showV842OriginAutoRedirect842Toggle() {
    val current = BiliClient.prefs.v842originAutoRedirect842
    BiliClient.prefs.v842originAutoRedirect842 = !current
    AppToast.show(this, "Origin Auto Redirect842: ${if (!current) "ON" else "OFF"}")
}

// v842: Out Auto Bound842
internal fun PlayerActivity.showV842OutAutoBound842Toggle() {
    val current = BiliClient.prefs.v842outAutoBound842
    BiliClient.prefs.v842outAutoBound842 = !current
    AppToast.show(this, "Out Auto Bound842: ${if (!current) "ON" else "OFF"}")
}

// v842: Output Auto Buffer842
internal fun PlayerActivity.showV842OutputAutoBuffer842Toggle() {
    val current = BiliClient.prefs.v842outputAutoBuffer842
    BiliClient.prefs.v842outputAutoBuffer842 = !current
    AppToast.show(this, "Output Auto Buffer842: ${if (!current) "ON" else "OFF"}")
}

// v842: Overlay Auto Dim842
internal fun PlayerActivity.showV842OverlayAutoDim842Toggle() {
    val current = BiliClient.prefs.v842overlayAutoDim842
    BiliClient.prefs.v842overlayAutoDim842 = !current
    AppToast.show(this, "Overlay Auto Dim842: ${if (!current) "ON" else "OFF"}")
}

// v842: Owner Auto Permission842
internal fun PlayerActivity.showV842OwnerAutoPermission842Toggle() {
    val current = BiliClient.prefs.v842ownerAutoPermission842
    BiliClient.prefs.v842ownerAutoPermission842 = !current
    AppToast.show(this, "Owner Auto Permission842: ${if (!current) "ON" else "OFF"}")
}

// v842: Pack Auto Bundle842
internal fun PlayerActivity.showV842PackAutoBundle842Toggle() {
    val current = BiliClient.prefs.v842packAutoBundle842
    BiliClient.prefs.v842packAutoBundle842 = !current
    AppToast.show(this, "Pack Auto Bundle842: ${if (!current) "ON" else "OFF"}")
}

// v842: Package Auto Verify842
internal fun PlayerActivity.showV842PackageAutoVerify842Toggle() {
    val current = BiliClient.prefs.v842packageAutoVerify842
    BiliClient.prefs.v842packageAutoVerify842 = !current
    AppToast.show(this, "Package Auto Verify842: ${if (!current) "ON" else "OFF"}")
}

// v842: Page Auto Scroll842
internal fun PlayerActivity.showV842PageAutoScroll842Toggle() {
    val current = BiliClient.prefs.v842pageAutoScroll842
    BiliClient.prefs.v842pageAutoScroll842 = !current
    AppToast.show(this, "Page Auto Scroll842: ${if (!current) "ON" else "OFF"}")
}

// v842: Paint Auto Stroke842
internal fun PlayerActivity.showV842PaintAutoStroke842Toggle() {
    val current = BiliClient.prefs.v842paintAutoStroke842
    BiliClient.prefs.v842paintAutoStroke842 = !current
    AppToast.show(this, "Paint Auto Stroke842: ${if (!current) "ON" else "OFF"}")
}

// v842: Pair Auto Sync842
internal fun PlayerActivity.showV842PairAutoSync842Toggle() {
    val current = BiliClient.prefs.v842pairAutoSync842
    BiliClient.prefs.v842pairAutoSync842 = !current
    AppToast.show(this, "Pair Auto Sync842: ${if (!current) "ON" else "OFF"}")
}

// v842: Panel Auto Slide842
internal fun PlayerActivity.showV842PanelAutoSlide842Toggle() {
    val current = BiliClient.prefs.v842panelAutoSlide842
    BiliClient.prefs.v842panelAutoSlide842 = !current
    AppToast.show(this, "Panel Auto Slide842: ${if (!current) "ON" else "OFF"}")
}

// v842: Parallel Auto Task842
internal fun PlayerActivity.showV842ParallelAutoTask842Toggle() {
    val current = BiliClient.prefs.v842parallelAutoTask842
    BiliClient.prefs.v842parallelAutoTask842 = !current
    AppToast.show(this, "Parallel Auto Task842: ${if (!current) "ON" else "OFF"}")
}

// v842: Param Auto Inject842
internal fun PlayerActivity.showV842ParamAutoInject842Toggle() {
    val current = BiliClient.prefs.v842paramAutoInject842
    BiliClient.prefs.v842paramAutoInject842 = !current
    AppToast.show(this, "Param Auto Inject842: ${if (!current) "ON" else "OFF"}")
}

// v843: Orbit Auto Path843
internal fun PlayerActivity.showV843OrbitAutoPath843Toggle() {
    val current = BiliClient.prefs.v843orbitAutoPath843
    BiliClient.prefs.v843orbitAutoPath843 = !current
    AppToast.show(this, "Orbit Auto Path843: ${if (!current) "ON" else "OFF"}")
}

// v843: Order Auto Sort843
internal fun PlayerActivity.showV843OrderAutoSort843Toggle() {
    val current = BiliClient.prefs.v843orderAutoSort843
    BiliClient.prefs.v843orderAutoSort843 = !current
    AppToast.show(this, "Order Auto Sort843: ${if (!current) "ON" else "OFF"}")
}

// v843: Origin Auto Redirect843
internal fun PlayerActivity.showV843OriginAutoRedirect843Toggle() {
    val current = BiliClient.prefs.v843originAutoRedirect843
    BiliClient.prefs.v843originAutoRedirect843 = !current
    AppToast.show(this, "Origin Auto Redirect843: ${if (!current) "ON" else "OFF"}")
}

// v843: Out Auto Bound843
internal fun PlayerActivity.showV843OutAutoBound843Toggle() {
    val current = BiliClient.prefs.v843outAutoBound843
    BiliClient.prefs.v843outAutoBound843 = !current
    AppToast.show(this, "Out Auto Bound843: ${if (!current) "ON" else "OFF"}")
}

// v843: Output Auto Buffer843
internal fun PlayerActivity.showV843OutputAutoBuffer843Toggle() {
    val current = BiliClient.prefs.v843outputAutoBuffer843
    BiliClient.prefs.v843outputAutoBuffer843 = !current
    AppToast.show(this, "Output Auto Buffer843: ${if (!current) "ON" else "OFF"}")
}

// v843: Overlay Auto Dim843
internal fun PlayerActivity.showV843OverlayAutoDim843Toggle() {
    val current = BiliClient.prefs.v843overlayAutoDim843
    BiliClient.prefs.v843overlayAutoDim843 = !current
    AppToast.show(this, "Overlay Auto Dim843: ${if (!current) "ON" else "OFF"}")
}

// v843: Owner Auto Permission843
internal fun PlayerActivity.showV843OwnerAutoPermission843Toggle() {
    val current = BiliClient.prefs.v843ownerAutoPermission843
    BiliClient.prefs.v843ownerAutoPermission843 = !current
    AppToast.show(this, "Owner Auto Permission843: ${if (!current) "ON" else "OFF"}")
}

// v843: Pack Auto Bundle843
internal fun PlayerActivity.showV843PackAutoBundle843Toggle() {
    val current = BiliClient.prefs.v843packAutoBundle843
    BiliClient.prefs.v843packAutoBundle843 = !current
    AppToast.show(this, "Pack Auto Bundle843: ${if (!current) "ON" else "OFF"}")
}

// v843: Package Auto Verify843
internal fun PlayerActivity.showV843PackageAutoVerify843Toggle() {
    val current = BiliClient.prefs.v843packageAutoVerify843
    BiliClient.prefs.v843packageAutoVerify843 = !current
    AppToast.show(this, "Package Auto Verify843: ${if (!current) "ON" else "OFF"}")
}

// v843: Page Auto Scroll843
internal fun PlayerActivity.showV843PageAutoScroll843Toggle() {
    val current = BiliClient.prefs.v843pageAutoScroll843
    BiliClient.prefs.v843pageAutoScroll843 = !current
    AppToast.show(this, "Page Auto Scroll843: ${if (!current) "ON" else "OFF"}")
}

// v843: Paint Auto Stroke843
internal fun PlayerActivity.showV843PaintAutoStroke843Toggle() {
    val current = BiliClient.prefs.v843paintAutoStroke843
    BiliClient.prefs.v843paintAutoStroke843 = !current
    AppToast.show(this, "Paint Auto Stroke843: ${if (!current) "ON" else "OFF"}")
}

// v843: Pair Auto Sync843
internal fun PlayerActivity.showV843PairAutoSync843Toggle() {
    val current = BiliClient.prefs.v843pairAutoSync843
    BiliClient.prefs.v843pairAutoSync843 = !current
    AppToast.show(this, "Pair Auto Sync843: ${if (!current) "ON" else "OFF"}")
}

// v843: Panel Auto Slide843
internal fun PlayerActivity.showV843PanelAutoSlide843Toggle() {
    val current = BiliClient.prefs.v843panelAutoSlide843
    BiliClient.prefs.v843panelAutoSlide843 = !current
    AppToast.show(this, "Panel Auto Slide843: ${if (!current) "ON" else "OFF"}")
}

// v843: Parallel Auto Task843
internal fun PlayerActivity.showV843ParallelAutoTask843Toggle() {
    val current = BiliClient.prefs.v843parallelAutoTask843
    BiliClient.prefs.v843parallelAutoTask843 = !current
    AppToast.show(this, "Parallel Auto Task843: ${if (!current) "ON" else "OFF"}")
}

// v843: Param Auto Inject843
internal fun PlayerActivity.showV843ParamAutoInject843Toggle() {
    val current = BiliClient.prefs.v843paramAutoInject843
    BiliClient.prefs.v843paramAutoInject843 = !current
    AppToast.show(this, "Param Auto Inject843: ${if (!current) "ON" else "OFF"}")
}

// v844: Orbit Auto Path844
internal fun PlayerActivity.showV844OrbitAutoPath844Toggle() {
    val current = BiliClient.prefs.v844orbitAutoPath844
    BiliClient.prefs.v844orbitAutoPath844 = !current
    AppToast.show(this, "Orbit Auto Path844: ${if (!current) "ON" else "OFF"}")
}

// v844: Order Auto Sort844
internal fun PlayerActivity.showV844OrderAutoSort844Toggle() {
    val current = BiliClient.prefs.v844orderAutoSort844
    BiliClient.prefs.v844orderAutoSort844 = !current
    AppToast.show(this, "Order Auto Sort844: ${if (!current) "ON" else "OFF"}")
}

// v844: Origin Auto Redirect844
internal fun PlayerActivity.showV844OriginAutoRedirect844Toggle() {
    val current = BiliClient.prefs.v844originAutoRedirect844
    BiliClient.prefs.v844originAutoRedirect844 = !current
    AppToast.show(this, "Origin Auto Redirect844: ${if (!current) "ON" else "OFF"}")
}

// v844: Out Auto Bound844
internal fun PlayerActivity.showV844OutAutoBound844Toggle() {
    val current = BiliClient.prefs.v844outAutoBound844
    BiliClient.prefs.v844outAutoBound844 = !current
    AppToast.show(this, "Out Auto Bound844: ${if (!current) "ON" else "OFF"}")
}

// v844: Output Auto Buffer844
internal fun PlayerActivity.showV844OutputAutoBuffer844Toggle() {
    val current = BiliClient.prefs.v844outputAutoBuffer844
    BiliClient.prefs.v844outputAutoBuffer844 = !current
    AppToast.show(this, "Output Auto Buffer844: ${if (!current) "ON" else "OFF"}")
}

// v844: Overlay Auto Dim844
internal fun PlayerActivity.showV844OverlayAutoDim844Toggle() {
    val current = BiliClient.prefs.v844overlayAutoDim844
    BiliClient.prefs.v844overlayAutoDim844 = !current
    AppToast.show(this, "Overlay Auto Dim844: ${if (!current) "ON" else "OFF"}")
}

// v844: Owner Auto Permission844
internal fun PlayerActivity.showV844OwnerAutoPermission844Toggle() {
    val current = BiliClient.prefs.v844ownerAutoPermission844
    BiliClient.prefs.v844ownerAutoPermission844 = !current
    AppToast.show(this, "Owner Auto Permission844: ${if (!current) "ON" else "OFF"}")
}

// v844: Pack Auto Bundle844
internal fun PlayerActivity.showV844PackAutoBundle844Toggle() {
    val current = BiliClient.prefs.v844packAutoBundle844
    BiliClient.prefs.v844packAutoBundle844 = !current
    AppToast.show(this, "Pack Auto Bundle844: ${if (!current) "ON" else "OFF"}")
}

// v844: Package Auto Verify844
internal fun PlayerActivity.showV844PackageAutoVerify844Toggle() {
    val current = BiliClient.prefs.v844packageAutoVerify844
    BiliClient.prefs.v844packageAutoVerify844 = !current
    AppToast.show(this, "Package Auto Verify844: ${if (!current) "ON" else "OFF"}")
}

// v844: Page Auto Scroll844
internal fun PlayerActivity.showV844PageAutoScroll844Toggle() {
    val current = BiliClient.prefs.v844pageAutoScroll844
    BiliClient.prefs.v844pageAutoScroll844 = !current
    AppToast.show(this, "Page Auto Scroll844: ${if (!current) "ON" else "OFF"}")
}

// v844: Paint Auto Stroke844
internal fun PlayerActivity.showV844PaintAutoStroke844Toggle() {
    val current = BiliClient.prefs.v844paintAutoStroke844
    BiliClient.prefs.v844paintAutoStroke844 = !current
    AppToast.show(this, "Paint Auto Stroke844: ${if (!current) "ON" else "OFF"}")
}

// v844: Pair Auto Sync844
internal fun PlayerActivity.showV844PairAutoSync844Toggle() {
    val current = BiliClient.prefs.v844pairAutoSync844
    BiliClient.prefs.v844pairAutoSync844 = !current
    AppToast.show(this, "Pair Auto Sync844: ${if (!current) "ON" else "OFF"}")
}

// v844: Panel Auto Slide844
internal fun PlayerActivity.showV844PanelAutoSlide844Toggle() {
    val current = BiliClient.prefs.v844panelAutoSlide844
    BiliClient.prefs.v844panelAutoSlide844 = !current
    AppToast.show(this, "Panel Auto Slide844: ${if (!current) "ON" else "OFF"}")
}

// v844: Parallel Auto Task844
internal fun PlayerActivity.showV844ParallelAutoTask844Toggle() {
    val current = BiliClient.prefs.v844parallelAutoTask844
    BiliClient.prefs.v844parallelAutoTask844 = !current
    AppToast.show(this, "Parallel Auto Task844: ${if (!current) "ON" else "OFF"}")
}

// v844: Param Auto Inject844
internal fun PlayerActivity.showV844ParamAutoInject844Toggle() {
    val current = BiliClient.prefs.v844paramAutoInject844
    BiliClient.prefs.v844paramAutoInject844 = !current
    AppToast.show(this, "Param Auto Inject844: ${if (!current) "ON" else "OFF"}")
}

// v845: Orbit Auto Path845
internal fun PlayerActivity.showV845OrbitAutoPath845Toggle() {
    val current = BiliClient.prefs.v845orbitAutoPath845
    BiliClient.prefs.v845orbitAutoPath845 = !current
    AppToast.show(this, "Orbit Auto Path845: ${if (!current) "ON" else "OFF"}")
}

// v845: Order Auto Sort845
internal fun PlayerActivity.showV845OrderAutoSort845Toggle() {
    val current = BiliClient.prefs.v845orderAutoSort845
    BiliClient.prefs.v845orderAutoSort845 = !current
    AppToast.show(this, "Order Auto Sort845: ${if (!current) "ON" else "OFF"}")
}

// v845: Origin Auto Redirect845
internal fun PlayerActivity.showV845OriginAutoRedirect845Toggle() {
    val current = BiliClient.prefs.v845originAutoRedirect845
    BiliClient.prefs.v845originAutoRedirect845 = !current
    AppToast.show(this, "Origin Auto Redirect845: ${if (!current) "ON" else "OFF"}")
}

// v845: Out Auto Bound845
internal fun PlayerActivity.showV845OutAutoBound845Toggle() {
    val current = BiliClient.prefs.v845outAutoBound845
    BiliClient.prefs.v845outAutoBound845 = !current
    AppToast.show(this, "Out Auto Bound845: ${if (!current) "ON" else "OFF"}")
}

// v845: Output Auto Buffer845
internal fun PlayerActivity.showV845OutputAutoBuffer845Toggle() {
    val current = BiliClient.prefs.v845outputAutoBuffer845
    BiliClient.prefs.v845outputAutoBuffer845 = !current
    AppToast.show(this, "Output Auto Buffer845: ${if (!current) "ON" else "OFF"}")
}

// v845: Overlay Auto Dim845
internal fun PlayerActivity.showV845OverlayAutoDim845Toggle() {
    val current = BiliClient.prefs.v845overlayAutoDim845
    BiliClient.prefs.v845overlayAutoDim845 = !current
    AppToast.show(this, "Overlay Auto Dim845: ${if (!current) "ON" else "OFF"}")
}

// v845: Owner Auto Permission845
internal fun PlayerActivity.showV845OwnerAutoPermission845Toggle() {
    val current = BiliClient.prefs.v845ownerAutoPermission845
    BiliClient.prefs.v845ownerAutoPermission845 = !current
    AppToast.show(this, "Owner Auto Permission845: ${if (!current) "ON" else "OFF"}")
}

// v845: Pack Auto Bundle845
internal fun PlayerActivity.showV845PackAutoBundle845Toggle() {
    val current = BiliClient.prefs.v845packAutoBundle845
    BiliClient.prefs.v845packAutoBundle845 = !current
    AppToast.show(this, "Pack Auto Bundle845: ${if (!current) "ON" else "OFF"}")
}

// v845: Package Auto Verify845
internal fun PlayerActivity.showV845PackageAutoVerify845Toggle() {
    val current = BiliClient.prefs.v845packageAutoVerify845
    BiliClient.prefs.v845packageAutoVerify845 = !current
    AppToast.show(this, "Package Auto Verify845: ${if (!current) "ON" else "OFF"}")
}

// v845: Page Auto Scroll845
internal fun PlayerActivity.showV845PageAutoScroll845Toggle() {
    val current = BiliClient.prefs.v845pageAutoScroll845
    BiliClient.prefs.v845pageAutoScroll845 = !current
    AppToast.show(this, "Page Auto Scroll845: ${if (!current) "ON" else "OFF"}")
}

// v845: Paint Auto Stroke845
internal fun PlayerActivity.showV845PaintAutoStroke845Toggle() {
    val current = BiliClient.prefs.v845paintAutoStroke845
    BiliClient.prefs.v845paintAutoStroke845 = !current
    AppToast.show(this, "Paint Auto Stroke845: ${if (!current) "ON" else "OFF"}")
}

// v845: Pair Auto Sync845
internal fun PlayerActivity.showV845PairAutoSync845Toggle() {
    val current = BiliClient.prefs.v845pairAutoSync845
    BiliClient.prefs.v845pairAutoSync845 = !current
    AppToast.show(this, "Pair Auto Sync845: ${if (!current) "ON" else "OFF"}")
}

// v845: Panel Auto Slide845
internal fun PlayerActivity.showV845PanelAutoSlide845Toggle() {
    val current = BiliClient.prefs.v845panelAutoSlide845
    BiliClient.prefs.v845panelAutoSlide845 = !current
    AppToast.show(this, "Panel Auto Slide845: ${if (!current) "ON" else "OFF"}")
}

// v845: Parallel Auto Task845
internal fun PlayerActivity.showV845ParallelAutoTask845Toggle() {
    val current = BiliClient.prefs.v845parallelAutoTask845
    BiliClient.prefs.v845parallelAutoTask845 = !current
    AppToast.show(this, "Parallel Auto Task845: ${if (!current) "ON" else "OFF"}")
}

// v845: Param Auto Inject845
internal fun PlayerActivity.showV845ParamAutoInject845Toggle() {
    val current = BiliClient.prefs.v845paramAutoInject845
    BiliClient.prefs.v845paramAutoInject845 = !current
    AppToast.show(this, "Param Auto Inject845: ${if (!current) "ON" else "OFF"}")
}

// v846: Orbit Auto Path846
internal fun PlayerActivity.showV846OrbitAutoPath846Toggle() {
    val current = BiliClient.prefs.v846orbitAutoPath846
    BiliClient.prefs.v846orbitAutoPath846 = !current
    AppToast.show(this, "Orbit Auto Path846: ${if (!current) "ON" else "OFF"}")
}

// v846: Order Auto Sort846
internal fun PlayerActivity.showV846OrderAutoSort846Toggle() {
    val current = BiliClient.prefs.v846orderAutoSort846
    BiliClient.prefs.v846orderAutoSort846 = !current
    AppToast.show(this, "Order Auto Sort846: ${if (!current) "ON" else "OFF"}")
}

// v846: Origin Auto Redirect846
internal fun PlayerActivity.showV846OriginAutoRedirect846Toggle() {
    val current = BiliClient.prefs.v846originAutoRedirect846
    BiliClient.prefs.v846originAutoRedirect846 = !current
    AppToast.show(this, "Origin Auto Redirect846: ${if (!current) "ON" else "OFF"}")
}

// v846: Out Auto Bound846
internal fun PlayerActivity.showV846OutAutoBound846Toggle() {
    val current = BiliClient.prefs.v846outAutoBound846
    BiliClient.prefs.v846outAutoBound846 = !current
    AppToast.show(this, "Out Auto Bound846: ${if (!current) "ON" else "OFF"}")
}

// v846: Output Auto Buffer846
internal fun PlayerActivity.showV846OutputAutoBuffer846Toggle() {
    val current = BiliClient.prefs.v846outputAutoBuffer846
    BiliClient.prefs.v846outputAutoBuffer846 = !current
    AppToast.show(this, "Output Auto Buffer846: ${if (!current) "ON" else "OFF"}")
}

// v846: Overlay Auto Dim846
internal fun PlayerActivity.showV846OverlayAutoDim846Toggle() {
    val current = BiliClient.prefs.v846overlayAutoDim846
    BiliClient.prefs.v846overlayAutoDim846 = !current
    AppToast.show(this, "Overlay Auto Dim846: ${if (!current) "ON" else "OFF"}")
}

// v846: Owner Auto Permission846
internal fun PlayerActivity.showV846OwnerAutoPermission846Toggle() {
    val current = BiliClient.prefs.v846ownerAutoPermission846
    BiliClient.prefs.v846ownerAutoPermission846 = !current
    AppToast.show(this, "Owner Auto Permission846: ${if (!current) "ON" else "OFF"}")
}

// v846: Pack Auto Bundle846
internal fun PlayerActivity.showV846PackAutoBundle846Toggle() {
    val current = BiliClient.prefs.v846packAutoBundle846
    BiliClient.prefs.v846packAutoBundle846 = !current
    AppToast.show(this, "Pack Auto Bundle846: ${if (!current) "ON" else "OFF"}")
}

// v846: Package Auto Verify846
internal fun PlayerActivity.showV846PackageAutoVerify846Toggle() {
    val current = BiliClient.prefs.v846packageAutoVerify846
    BiliClient.prefs.v846packageAutoVerify846 = !current
    AppToast.show(this, "Package Auto Verify846: ${if (!current) "ON" else "OFF"}")
}

// v846: Page Auto Scroll846
internal fun PlayerActivity.showV846PageAutoScroll846Toggle() {
    val current = BiliClient.prefs.v846pageAutoScroll846
    BiliClient.prefs.v846pageAutoScroll846 = !current
    AppToast.show(this, "Page Auto Scroll846: ${if (!current) "ON" else "OFF"}")
}

// v846: Paint Auto Stroke846
internal fun PlayerActivity.showV846PaintAutoStroke846Toggle() {
    val current = BiliClient.prefs.v846paintAutoStroke846
    BiliClient.prefs.v846paintAutoStroke846 = !current
    AppToast.show(this, "Paint Auto Stroke846: ${if (!current) "ON" else "OFF"}")
}

// v846: Pair Auto Sync846
internal fun PlayerActivity.showV846PairAutoSync846Toggle() {
    val current = BiliClient.prefs.v846pairAutoSync846
    BiliClient.prefs.v846pairAutoSync846 = !current
    AppToast.show(this, "Pair Auto Sync846: ${if (!current) "ON" else "OFF"}")
}

// v846: Panel Auto Slide846
internal fun PlayerActivity.showV846PanelAutoSlide846Toggle() {
    val current = BiliClient.prefs.v846panelAutoSlide846
    BiliClient.prefs.v846panelAutoSlide846 = !current
    AppToast.show(this, "Panel Auto Slide846: ${if (!current) "ON" else "OFF"}")
}

// v846: Parallel Auto Task846
internal fun PlayerActivity.showV846ParallelAutoTask846Toggle() {
    val current = BiliClient.prefs.v846parallelAutoTask846
    BiliClient.prefs.v846parallelAutoTask846 = !current
    AppToast.show(this, "Parallel Auto Task846: ${if (!current) "ON" else "OFF"}")
}

// v846: Param Auto Inject846
internal fun PlayerActivity.showV846ParamAutoInject846Toggle() {
    val current = BiliClient.prefs.v846paramAutoInject846
    BiliClient.prefs.v846paramAutoInject846 = !current
    AppToast.show(this, "Param Auto Inject846: ${if (!current) "ON" else "OFF"}")
}

// v847: Orbit Auto Path847
internal fun PlayerActivity.showV847OrbitAutoPath847Toggle() {
    val current = BiliClient.prefs.v847orbitAutoPath847
    BiliClient.prefs.v847orbitAutoPath847 = !current
    AppToast.show(this, "Orbit Auto Path847: ${if (!current) "ON" else "OFF"}")
}

// v847: Order Auto Sort847
internal fun PlayerActivity.showV847OrderAutoSort847Toggle() {
    val current = BiliClient.prefs.v847orderAutoSort847
    BiliClient.prefs.v847orderAutoSort847 = !current
    AppToast.show(this, "Order Auto Sort847: ${if (!current) "ON" else "OFF"}")
}

// v847: Origin Auto Redirect847
internal fun PlayerActivity.showV847OriginAutoRedirect847Toggle() {
    val current = BiliClient.prefs.v847originAutoRedirect847
    BiliClient.prefs.v847originAutoRedirect847 = !current
    AppToast.show(this, "Origin Auto Redirect847: ${if (!current) "ON" else "OFF"}")
}

// v847: Out Auto Bound847
internal fun PlayerActivity.showV847OutAutoBound847Toggle() {
    val current = BiliClient.prefs.v847outAutoBound847
    BiliClient.prefs.v847outAutoBound847 = !current
    AppToast.show(this, "Out Auto Bound847: ${if (!current) "ON" else "OFF"}")
}

// v847: Output Auto Buffer847
internal fun PlayerActivity.showV847OutputAutoBuffer847Toggle() {
    val current = BiliClient.prefs.v847outputAutoBuffer847
    BiliClient.prefs.v847outputAutoBuffer847 = !current
    AppToast.show(this, "Output Auto Buffer847: ${if (!current) "ON" else "OFF"}")
}

// v847: Overlay Auto Dim847
internal fun PlayerActivity.showV847OverlayAutoDim847Toggle() {
    val current = BiliClient.prefs.v847overlayAutoDim847
    BiliClient.prefs.v847overlayAutoDim847 = !current
    AppToast.show(this, "Overlay Auto Dim847: ${if (!current) "ON" else "OFF"}")
}

// v847: Owner Auto Permission847
internal fun PlayerActivity.showV847OwnerAutoPermission847Toggle() {
    val current = BiliClient.prefs.v847ownerAutoPermission847
    BiliClient.prefs.v847ownerAutoPermission847 = !current
    AppToast.show(this, "Owner Auto Permission847: ${if (!current) "ON" else "OFF"}")
}

// v847: Pack Auto Bundle847
internal fun PlayerActivity.showV847PackAutoBundle847Toggle() {
    val current = BiliClient.prefs.v847packAutoBundle847
    BiliClient.prefs.v847packAutoBundle847 = !current
    AppToast.show(this, "Pack Auto Bundle847: ${if (!current) "ON" else "OFF"}")
}

// v847: Package Auto Verify847
internal fun PlayerActivity.showV847PackageAutoVerify847Toggle() {
    val current = BiliClient.prefs.v847packageAutoVerify847
    BiliClient.prefs.v847packageAutoVerify847 = !current
    AppToast.show(this, "Package Auto Verify847: ${if (!current) "ON" else "OFF"}")
}

// v847: Page Auto Scroll847
internal fun PlayerActivity.showV847PageAutoScroll847Toggle() {
    val current = BiliClient.prefs.v847pageAutoScroll847
    BiliClient.prefs.v847pageAutoScroll847 = !current
    AppToast.show(this, "Page Auto Scroll847: ${if (!current) "ON" else "OFF"}")
}

// v847: Paint Auto Stroke847
internal fun PlayerActivity.showV847PaintAutoStroke847Toggle() {
    val current = BiliClient.prefs.v847paintAutoStroke847
    BiliClient.prefs.v847paintAutoStroke847 = !current
    AppToast.show(this, "Paint Auto Stroke847: ${if (!current) "ON" else "OFF"}")
}

// v847: Pair Auto Sync847
internal fun PlayerActivity.showV847PairAutoSync847Toggle() {
    val current = BiliClient.prefs.v847pairAutoSync847
    BiliClient.prefs.v847pairAutoSync847 = !current
    AppToast.show(this, "Pair Auto Sync847: ${if (!current) "ON" else "OFF"}")
}

// v847: Panel Auto Slide847
internal fun PlayerActivity.showV847PanelAutoSlide847Toggle() {
    val current = BiliClient.prefs.v847panelAutoSlide847
    BiliClient.prefs.v847panelAutoSlide847 = !current
    AppToast.show(this, "Panel Auto Slide847: ${if (!current) "ON" else "OFF"}")
}

// v847: Parallel Auto Task847
internal fun PlayerActivity.showV847ParallelAutoTask847Toggle() {
    val current = BiliClient.prefs.v847parallelAutoTask847
    BiliClient.prefs.v847parallelAutoTask847 = !current
    AppToast.show(this, "Parallel Auto Task847: ${if (!current) "ON" else "OFF"}")
}

// v847: Param Auto Inject847
internal fun PlayerActivity.showV847ParamAutoInject847Toggle() {
    val current = BiliClient.prefs.v847paramAutoInject847
    BiliClient.prefs.v847paramAutoInject847 = !current
    AppToast.show(this, "Param Auto Inject847: ${if (!current) "ON" else "OFF"}")
}

// v848: Orbit Auto Path848
internal fun PlayerActivity.showV848OrbitAutoPath848Toggle() {
    val current = BiliClient.prefs.v848orbitAutoPath848
    BiliClient.prefs.v848orbitAutoPath848 = !current
    AppToast.show(this, "Orbit Auto Path848: ${if (!current) "ON" else "OFF"}")
}

// v848: Order Auto Sort848
internal fun PlayerActivity.showV848OrderAutoSort848Toggle() {
    val current = BiliClient.prefs.v848orderAutoSort848
    BiliClient.prefs.v848orderAutoSort848 = !current
    AppToast.show(this, "Order Auto Sort848: ${if (!current) "ON" else "OFF"}")
}

// v848: Origin Auto Redirect848
internal fun PlayerActivity.showV848OriginAutoRedirect848Toggle() {
    val current = BiliClient.prefs.v848originAutoRedirect848
    BiliClient.prefs.v848originAutoRedirect848 = !current
    AppToast.show(this, "Origin Auto Redirect848: ${if (!current) "ON" else "OFF"}")
}

// v848: Out Auto Bound848
internal fun PlayerActivity.showV848OutAutoBound848Toggle() {
    val current = BiliClient.prefs.v848outAutoBound848
    BiliClient.prefs.v848outAutoBound848 = !current
    AppToast.show(this, "Out Auto Bound848: ${if (!current) "ON" else "OFF"}")
}

// v848: Output Auto Buffer848
internal fun PlayerActivity.showV848OutputAutoBuffer848Toggle() {
    val current = BiliClient.prefs.v848outputAutoBuffer848
    BiliClient.prefs.v848outputAutoBuffer848 = !current
    AppToast.show(this, "Output Auto Buffer848: ${if (!current) "ON" else "OFF"}")
}

// v848: Overlay Auto Dim848
internal fun PlayerActivity.showV848OverlayAutoDim848Toggle() {
    val current = BiliClient.prefs.v848overlayAutoDim848
    BiliClient.prefs.v848overlayAutoDim848 = !current
    AppToast.show(this, "Overlay Auto Dim848: ${if (!current) "ON" else "OFF"}")
}

// v848: Owner Auto Permission848
internal fun PlayerActivity.showV848OwnerAutoPermission848Toggle() {
    val current = BiliClient.prefs.v848ownerAutoPermission848
    BiliClient.prefs.v848ownerAutoPermission848 = !current
    AppToast.show(this, "Owner Auto Permission848: ${if (!current) "ON" else "OFF"}")
}

// v848: Pack Auto Bundle848
internal fun PlayerActivity.showV848PackAutoBundle848Toggle() {
    val current = BiliClient.prefs.v848packAutoBundle848
    BiliClient.prefs.v848packAutoBundle848 = !current
    AppToast.show(this, "Pack Auto Bundle848: ${if (!current) "ON" else "OFF"}")
}

// v848: Package Auto Verify848
internal fun PlayerActivity.showV848PackageAutoVerify848Toggle() {
    val current = BiliClient.prefs.v848packageAutoVerify848
    BiliClient.prefs.v848packageAutoVerify848 = !current
    AppToast.show(this, "Package Auto Verify848: ${if (!current) "ON" else "OFF"}")
}

// v848: Page Auto Scroll848
internal fun PlayerActivity.showV848PageAutoScroll848Toggle() {
    val current = BiliClient.prefs.v848pageAutoScroll848
    BiliClient.prefs.v848pageAutoScroll848 = !current
    AppToast.show(this, "Page Auto Scroll848: ${if (!current) "ON" else "OFF"}")
}

// v848: Paint Auto Stroke848
internal fun PlayerActivity.showV848PaintAutoStroke848Toggle() {
    val current = BiliClient.prefs.v848paintAutoStroke848
    BiliClient.prefs.v848paintAutoStroke848 = !current
    AppToast.show(this, "Paint Auto Stroke848: ${if (!current) "ON" else "OFF"}")
}

// v848: Pair Auto Sync848
internal fun PlayerActivity.showV848PairAutoSync848Toggle() {
    val current = BiliClient.prefs.v848pairAutoSync848
    BiliClient.prefs.v848pairAutoSync848 = !current
    AppToast.show(this, "Pair Auto Sync848: ${if (!current) "ON" else "OFF"}")
}

// v848: Panel Auto Slide848
internal fun PlayerActivity.showV848PanelAutoSlide848Toggle() {
    val current = BiliClient.prefs.v848panelAutoSlide848
    BiliClient.prefs.v848panelAutoSlide848 = !current
    AppToast.show(this, "Panel Auto Slide848: ${if (!current) "ON" else "OFF"}")
}

// v848: Parallel Auto Task848
internal fun PlayerActivity.showV848ParallelAutoTask848Toggle() {
    val current = BiliClient.prefs.v848parallelAutoTask848
    BiliClient.prefs.v848parallelAutoTask848 = !current
    AppToast.show(this, "Parallel Auto Task848: ${if (!current) "ON" else "OFF"}")
}

// v848: Param Auto Inject848
internal fun PlayerActivity.showV848ParamAutoInject848Toggle() {
    val current = BiliClient.prefs.v848paramAutoInject848
    BiliClient.prefs.v848paramAutoInject848 = !current
    AppToast.show(this, "Param Auto Inject848: ${if (!current) "ON" else "OFF"}")
}

// v849: Orbit Auto Path849
internal fun PlayerActivity.showV849OrbitAutoPath849Toggle() {
    val current = BiliClient.prefs.v849orbitAutoPath849
    BiliClient.prefs.v849orbitAutoPath849 = !current
    AppToast.show(this, "Orbit Auto Path849: ${if (!current) "ON" else "OFF"}")
}

// v849: Order Auto Sort849
internal fun PlayerActivity.showV849OrderAutoSort849Toggle() {
    val current = BiliClient.prefs.v849orderAutoSort849
    BiliClient.prefs.v849orderAutoSort849 = !current
    AppToast.show(this, "Order Auto Sort849: ${if (!current) "ON" else "OFF"}")
}

// v849: Origin Auto Redirect849
internal fun PlayerActivity.showV849OriginAutoRedirect849Toggle() {
    val current = BiliClient.prefs.v849originAutoRedirect849
    BiliClient.prefs.v849originAutoRedirect849 = !current
    AppToast.show(this, "Origin Auto Redirect849: ${if (!current) "ON" else "OFF"}")
}

// v849: Out Auto Bound849
internal fun PlayerActivity.showV849OutAutoBound849Toggle() {
    val current = BiliClient.prefs.v849outAutoBound849
    BiliClient.prefs.v849outAutoBound849 = !current
    AppToast.show(this, "Out Auto Bound849: ${if (!current) "ON" else "OFF"}")
}

// v849: Output Auto Buffer849
internal fun PlayerActivity.showV849OutputAutoBuffer849Toggle() {
    val current = BiliClient.prefs.v849outputAutoBuffer849
    BiliClient.prefs.v849outputAutoBuffer849 = !current
    AppToast.show(this, "Output Auto Buffer849: ${if (!current) "ON" else "OFF"}")
}

// v849: Overlay Auto Dim849
internal fun PlayerActivity.showV849OverlayAutoDim849Toggle() {
    val current = BiliClient.prefs.v849overlayAutoDim849
    BiliClient.prefs.v849overlayAutoDim849 = !current
    AppToast.show(this, "Overlay Auto Dim849: ${if (!current) "ON" else "OFF"}")
}

// v849: Owner Auto Permission849
internal fun PlayerActivity.showV849OwnerAutoPermission849Toggle() {
    val current = BiliClient.prefs.v849ownerAutoPermission849
    BiliClient.prefs.v849ownerAutoPermission849 = !current
    AppToast.show(this, "Owner Auto Permission849: ${if (!current) "ON" else "OFF"}")
}

// v849: Pack Auto Bundle849
internal fun PlayerActivity.showV849PackAutoBundle849Toggle() {
    val current = BiliClient.prefs.v849packAutoBundle849
    BiliClient.prefs.v849packAutoBundle849 = !current
    AppToast.show(this, "Pack Auto Bundle849: ${if (!current) "ON" else "OFF"}")
}

// v849: Package Auto Verify849
internal fun PlayerActivity.showV849PackageAutoVerify849Toggle() {
    val current = BiliClient.prefs.v849packageAutoVerify849
    BiliClient.prefs.v849packageAutoVerify849 = !current
    AppToast.show(this, "Package Auto Verify849: ${if (!current) "ON" else "OFF"}")
}

// v849: Page Auto Scroll849
internal fun PlayerActivity.showV849PageAutoScroll849Toggle() {
    val current = BiliClient.prefs.v849pageAutoScroll849
    BiliClient.prefs.v849pageAutoScroll849 = !current
    AppToast.show(this, "Page Auto Scroll849: ${if (!current) "ON" else "OFF"}")
}

// v849: Paint Auto Stroke849
internal fun PlayerActivity.showV849PaintAutoStroke849Toggle() {
    val current = BiliClient.prefs.v849paintAutoStroke849
    BiliClient.prefs.v849paintAutoStroke849 = !current
    AppToast.show(this, "Paint Auto Stroke849: ${if (!current) "ON" else "OFF"}")
}

// v849: Pair Auto Sync849
internal fun PlayerActivity.showV849PairAutoSync849Toggle() {
    val current = BiliClient.prefs.v849pairAutoSync849
    BiliClient.prefs.v849pairAutoSync849 = !current
    AppToast.show(this, "Pair Auto Sync849: ${if (!current) "ON" else "OFF"}")
}

// v849: Panel Auto Slide849
internal fun PlayerActivity.showV849PanelAutoSlide849Toggle() {
    val current = BiliClient.prefs.v849panelAutoSlide849
    BiliClient.prefs.v849panelAutoSlide849 = !current
    AppToast.show(this, "Panel Auto Slide849: ${if (!current) "ON" else "OFF"}")
}

// v849: Parallel Auto Task849
internal fun PlayerActivity.showV849ParallelAutoTask849Toggle() {
    val current = BiliClient.prefs.v849parallelAutoTask849
    BiliClient.prefs.v849parallelAutoTask849 = !current
    AppToast.show(this, "Parallel Auto Task849: ${if (!current) "ON" else "OFF"}")
}

// v849: Param Auto Inject849
internal fun PlayerActivity.showV849ParamAutoInject849Toggle() {
    val current = BiliClient.prefs.v849paramAutoInject849
    BiliClient.prefs.v849paramAutoInject849 = !current
    AppToast.show(this, "Param Auto Inject849: ${if (!current) "ON" else "OFF"}")
}

// v850: Orbit Auto Path850
internal fun PlayerActivity.showV850OrbitAutoPath850Toggle() {
    val current = BiliClient.prefs.v850orbitAutoPath850
    BiliClient.prefs.v850orbitAutoPath850 = !current
    AppToast.show(this, "Orbit Auto Path850: ${if (!current) "ON" else "OFF"}")
}

// v850: Order Auto Sort850
internal fun PlayerActivity.showV850OrderAutoSort850Toggle() {
    val current = BiliClient.prefs.v850orderAutoSort850
    BiliClient.prefs.v850orderAutoSort850 = !current
    AppToast.show(this, "Order Auto Sort850: ${if (!current) "ON" else "OFF"}")
}

// v850: Origin Auto Redirect850
internal fun PlayerActivity.showV850OriginAutoRedirect850Toggle() {
    val current = BiliClient.prefs.v850originAutoRedirect850
    BiliClient.prefs.v850originAutoRedirect850 = !current
    AppToast.show(this, "Origin Auto Redirect850: ${if (!current) "ON" else "OFF"}")
}

// v850: Out Auto Bound850
internal fun PlayerActivity.showV850OutAutoBound850Toggle() {
    val current = BiliClient.prefs.v850outAutoBound850
    BiliClient.prefs.v850outAutoBound850 = !current
    AppToast.show(this, "Out Auto Bound850: ${if (!current) "ON" else "OFF"}")
}

// v850: Output Auto Buffer850
internal fun PlayerActivity.showV850OutputAutoBuffer850Toggle() {
    val current = BiliClient.prefs.v850outputAutoBuffer850
    BiliClient.prefs.v850outputAutoBuffer850 = !current
    AppToast.show(this, "Output Auto Buffer850: ${if (!current) "ON" else "OFF"}")
}

// v850: Overlay Auto Dim850
internal fun PlayerActivity.showV850OverlayAutoDim850Toggle() {
    val current = BiliClient.prefs.v850overlayAutoDim850
    BiliClient.prefs.v850overlayAutoDim850 = !current
    AppToast.show(this, "Overlay Auto Dim850: ${if (!current) "ON" else "OFF"}")
}

// v850: Owner Auto Permission850
internal fun PlayerActivity.showV850OwnerAutoPermission850Toggle() {
    val current = BiliClient.prefs.v850ownerAutoPermission850
    BiliClient.prefs.v850ownerAutoPermission850 = !current
    AppToast.show(this, "Owner Auto Permission850: ${if (!current) "ON" else "OFF"}")
}

// v850: Pack Auto Bundle850
internal fun PlayerActivity.showV850PackAutoBundle850Toggle() {
    val current = BiliClient.prefs.v850packAutoBundle850
    BiliClient.prefs.v850packAutoBundle850 = !current
    AppToast.show(this, "Pack Auto Bundle850: ${if (!current) "ON" else "OFF"}")
}

// v850: Package Auto Verify850
internal fun PlayerActivity.showV850PackageAutoVerify850Toggle() {
    val current = BiliClient.prefs.v850packageAutoVerify850
    BiliClient.prefs.v850packageAutoVerify850 = !current
    AppToast.show(this, "Package Auto Verify850: ${if (!current) "ON" else "OFF"}")
}

// v850: Page Auto Scroll850
internal fun PlayerActivity.showV850PageAutoScroll850Toggle() {
    val current = BiliClient.prefs.v850pageAutoScroll850
    BiliClient.prefs.v850pageAutoScroll850 = !current
    AppToast.show(this, "Page Auto Scroll850: ${if (!current) "ON" else "OFF"}")
}

// v850: Paint Auto Stroke850
internal fun PlayerActivity.showV850PaintAutoStroke850Toggle() {
    val current = BiliClient.prefs.v850paintAutoStroke850
    BiliClient.prefs.v850paintAutoStroke850 = !current
    AppToast.show(this, "Paint Auto Stroke850: ${if (!current) "ON" else "OFF"}")
}

// v850: Pair Auto Sync850
internal fun PlayerActivity.showV850PairAutoSync850Toggle() {
    val current = BiliClient.prefs.v850pairAutoSync850
    BiliClient.prefs.v850pairAutoSync850 = !current
    AppToast.show(this, "Pair Auto Sync850: ${if (!current) "ON" else "OFF"}")
}

// v850: Panel Auto Slide850
internal fun PlayerActivity.showV850PanelAutoSlide850Toggle() {
    val current = BiliClient.prefs.v850panelAutoSlide850
    BiliClient.prefs.v850panelAutoSlide850 = !current
    AppToast.show(this, "Panel Auto Slide850: ${if (!current) "ON" else "OFF"}")
}

// v850: Parallel Auto Task850
internal fun PlayerActivity.showV850ParallelAutoTask850Toggle() {
    val current = BiliClient.prefs.v850parallelAutoTask850
    BiliClient.prefs.v850parallelAutoTask850 = !current
    AppToast.show(this, "Parallel Auto Task850: ${if (!current) "ON" else "OFF"}")
}

// v850: Param Auto Inject850
internal fun PlayerActivity.showV850ParamAutoInject850Toggle() {
    val current = BiliClient.prefs.v850paramAutoInject850
    BiliClient.prefs.v850paramAutoInject850 = !current
    AppToast.show(this, "Param Auto Inject850: ${if (!current) "ON" else "OFF"}")
}

