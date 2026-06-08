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

internal fun PlayerActivity.showV575ThemeAutoSwitch575Toggle() {
    val current = BiliClient.prefs.v575themeAutoSwitch575
    BiliClient.prefs.v575themeAutoSwitch575 = !current
    AppToast.show(this, "Theme Auto Switch575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575ThresholdAutoSet575Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v575thresholdAutoSet575).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set575",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v575thresholdAutoSet575 = value
        AppToast.show(this, "Threshold Auto Set575: $value")
    }
}

internal fun PlayerActivity.showV575TileAutoLayout575Toggle() {
    val current = BiliClient.prefs.v575tileAutoLayout575
    BiliClient.prefs.v575tileAutoLayout575 = !current
    AppToast.show(this, "Tile Auto Layout575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TipAutoShow575Toggle() {
    val current = BiliClient.prefs.v575tipAutoShow575
    BiliClient.prefs.v575tipAutoShow575 = !current
    AppToast.show(this, "Tip Auto Show575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TokenAutoRefresh575Toggle() {
    val current = BiliClient.prefs.v575tokenAutoRefresh575
    BiliClient.prefs.v575tokenAutoRefresh575 = !current
    AppToast.show(this, "Token Auto Refresh575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TopAutoRank575Toggle() {
    val current = BiliClient.prefs.v575topAutoRank575
    BiliClient.prefs.v575topAutoRank575 = !current
    AppToast.show(this, "Top Auto Rank575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TraceAutoLog575Toggle() {
    val current = BiliClient.prefs.v575traceAutoLog575
    BiliClient.prefs.v575traceAutoLog575 = !current
    AppToast.show(this, "Trace Auto Log575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TransferAutoResume575Toggle() {
    val current = BiliClient.prefs.v575transferAutoResume575
    BiliClient.prefs.v575transferAutoResume575 = !current
    AppToast.show(this, "Transfer Auto Resume575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TransformAutoCrop575Toggle() {
    val current = BiliClient.prefs.v575transformAutoCrop575
    BiliClient.prefs.v575transformAutoCrop575 = !current
    AppToast.show(this, "Transform Auto Crop575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TranslateAutoDetect575Toggle() {
    val current = BiliClient.prefs.v575translateAutoDetect575
    BiliClient.prefs.v575translateAutoDetect575 = !current
    AppToast.show(this, "Translate Auto Detect575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TriggerAutoFire575Toggle() {
    val current = BiliClient.prefs.v575triggerAutoFire575
    BiliClient.prefs.v575triggerAutoFire575 = !current
    AppToast.show(this, "Trigger Auto Fire575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TrimAutoClean575Toggle() {
    val current = BiliClient.prefs.v575trimAutoClean575
    BiliClient.prefs.v575trimAutoClean575 = !current
    AppToast.show(this, "Trim Auto Clean575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TuneAutoEqualizer575Toggle() {
    val current = BiliClient.prefs.v575tuneAutoEqualizer575
    BiliClient.prefs.v575tuneAutoEqualizer575 = !current
    AppToast.show(this, "Tune Auto Equalizer575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TypeAutoInfer575Toggle() {
    val current = BiliClient.prefs.v575typeAutoInfer575
    BiliClient.prefs.v575typeAutoInfer575 = !current
    AppToast.show(this, "Type Auto Infer575: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TextAutoDetect576Toggle() {
    val current = BiliClient.prefs.v576textAutoDetect576
    BiliClient.prefs.v576textAutoDetect576 = !current
    AppToast.show(this, "Text Auto Detect576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576ThemeAutoSwitch576Toggle() {
    val current = BiliClient.prefs.v576themeAutoSwitch576
    BiliClient.prefs.v576themeAutoSwitch576 = !current
    AppToast.show(this, "Theme Auto Switch576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576ThresholdAutoSet576Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v576thresholdAutoSet576).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set576",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v576thresholdAutoSet576 = value
        AppToast.show(this, "Threshold Auto Set576: $value")
    }
}

internal fun PlayerActivity.showV576TileAutoLayout576Toggle() {
    val current = BiliClient.prefs.v576tileAutoLayout576
    BiliClient.prefs.v576tileAutoLayout576 = !current
    AppToast.show(this, "Tile Auto Layout576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TipAutoShow576Toggle() {
    val current = BiliClient.prefs.v576tipAutoShow576
    BiliClient.prefs.v576tipAutoShow576 = !current
    AppToast.show(this, "Tip Auto Show576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TokenAutoRefresh576Toggle() {
    val current = BiliClient.prefs.v576tokenAutoRefresh576
    BiliClient.prefs.v576tokenAutoRefresh576 = !current
    AppToast.show(this, "Token Auto Refresh576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TopAutoRank576Toggle() {
    val current = BiliClient.prefs.v576topAutoRank576
    BiliClient.prefs.v576topAutoRank576 = !current
    AppToast.show(this, "Top Auto Rank576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TraceAutoLog576Toggle() {
    val current = BiliClient.prefs.v576traceAutoLog576
    BiliClient.prefs.v576traceAutoLog576 = !current
    AppToast.show(this, "Trace Auto Log576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TransferAutoResume576Toggle() {
    val current = BiliClient.prefs.v576transferAutoResume576
    BiliClient.prefs.v576transferAutoResume576 = !current
    AppToast.show(this, "Transfer Auto Resume576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TransformAutoCrop576Toggle() {
    val current = BiliClient.prefs.v576transformAutoCrop576
    BiliClient.prefs.v576transformAutoCrop576 = !current
    AppToast.show(this, "Transform Auto Crop576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TranslateAutoDetect576Toggle() {
    val current = BiliClient.prefs.v576translateAutoDetect576
    BiliClient.prefs.v576translateAutoDetect576 = !current
    AppToast.show(this, "Translate Auto Detect576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TriggerAutoFire576Toggle() {
    val current = BiliClient.prefs.v576triggerAutoFire576
    BiliClient.prefs.v576triggerAutoFire576 = !current
    AppToast.show(this, "Trigger Auto Fire576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TrimAutoClean576Toggle() {
    val current = BiliClient.prefs.v576trimAutoClean576
    BiliClient.prefs.v576trimAutoClean576 = !current
    AppToast.show(this, "Trim Auto Clean576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TuneAutoEqualizer576Toggle() {
    val current = BiliClient.prefs.v576tuneAutoEqualizer576
    BiliClient.prefs.v576tuneAutoEqualizer576 = !current
    AppToast.show(this, "Tune Auto Equalizer576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV576TypeAutoInfer576Toggle() {
    val current = BiliClient.prefs.v576typeAutoInfer576
    BiliClient.prefs.v576typeAutoInfer576 = !current
    AppToast.show(this, "Type Auto Infer576: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TextAutoDetect577Toggle() {
    val current = BiliClient.prefs.v577textAutoDetect577
    BiliClient.prefs.v577textAutoDetect577 = !current
    AppToast.show(this, "Text Auto Detect577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577ThemeAutoSwitch577Toggle() {
    val current = BiliClient.prefs.v577themeAutoSwitch577
    BiliClient.prefs.v577themeAutoSwitch577 = !current
    AppToast.show(this, "Theme Auto Switch577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577ThresholdAutoSet577Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v577thresholdAutoSet577).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set577",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v577thresholdAutoSet577 = value
        AppToast.show(this, "Threshold Auto Set577: $value")
    }
}

internal fun PlayerActivity.showV577TileAutoLayout577Toggle() {
    val current = BiliClient.prefs.v577tileAutoLayout577
    BiliClient.prefs.v577tileAutoLayout577 = !current
    AppToast.show(this, "Tile Auto Layout577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TipAutoShow577Toggle() {
    val current = BiliClient.prefs.v577tipAutoShow577
    BiliClient.prefs.v577tipAutoShow577 = !current
    AppToast.show(this, "Tip Auto Show577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TokenAutoRefresh577Toggle() {
    val current = BiliClient.prefs.v577tokenAutoRefresh577
    BiliClient.prefs.v577tokenAutoRefresh577 = !current
    AppToast.show(this, "Token Auto Refresh577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TopAutoRank577Toggle() {
    val current = BiliClient.prefs.v577topAutoRank577
    BiliClient.prefs.v577topAutoRank577 = !current
    AppToast.show(this, "Top Auto Rank577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TraceAutoLog577Toggle() {
    val current = BiliClient.prefs.v577traceAutoLog577
    BiliClient.prefs.v577traceAutoLog577 = !current
    AppToast.show(this, "Trace Auto Log577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TransferAutoResume577Toggle() {
    val current = BiliClient.prefs.v577transferAutoResume577
    BiliClient.prefs.v577transferAutoResume577 = !current
    AppToast.show(this, "Transfer Auto Resume577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TransformAutoCrop577Toggle() {
    val current = BiliClient.prefs.v577transformAutoCrop577
    BiliClient.prefs.v577transformAutoCrop577 = !current
    AppToast.show(this, "Transform Auto Crop577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TranslateAutoDetect577Toggle() {
    val current = BiliClient.prefs.v577translateAutoDetect577
    BiliClient.prefs.v577translateAutoDetect577 = !current
    AppToast.show(this, "Translate Auto Detect577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TriggerAutoFire577Toggle() {
    val current = BiliClient.prefs.v577triggerAutoFire577
    BiliClient.prefs.v577triggerAutoFire577 = !current
    AppToast.show(this, "Trigger Auto Fire577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TrimAutoClean577Toggle() {
    val current = BiliClient.prefs.v577trimAutoClean577
    BiliClient.prefs.v577trimAutoClean577 = !current
    AppToast.show(this, "Trim Auto Clean577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TuneAutoEqualizer577Toggle() {
    val current = BiliClient.prefs.v577tuneAutoEqualizer577
    BiliClient.prefs.v577tuneAutoEqualizer577 = !current
    AppToast.show(this, "Tune Auto Equalizer577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV577TypeAutoInfer577Toggle() {
    val current = BiliClient.prefs.v577typeAutoInfer577
    BiliClient.prefs.v577typeAutoInfer577 = !current
    AppToast.show(this, "Type Auto Infer577: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TextAutoDetect578Toggle() {
    val current = BiliClient.prefs.v578textAutoDetect578
    BiliClient.prefs.v578textAutoDetect578 = !current
    AppToast.show(this, "Text Auto Detect578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578ThemeAutoSwitch578Toggle() {
    val current = BiliClient.prefs.v578themeAutoSwitch578
    BiliClient.prefs.v578themeAutoSwitch578 = !current
    AppToast.show(this, "Theme Auto Switch578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578ThresholdAutoSet578Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v578thresholdAutoSet578).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set578",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v578thresholdAutoSet578 = value
        AppToast.show(this, "Threshold Auto Set578: $value")
    }
}

internal fun PlayerActivity.showV578TileAutoLayout578Toggle() {
    val current = BiliClient.prefs.v578tileAutoLayout578
    BiliClient.prefs.v578tileAutoLayout578 = !current
    AppToast.show(this, "Tile Auto Layout578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TipAutoShow578Toggle() {
    val current = BiliClient.prefs.v578tipAutoShow578
    BiliClient.prefs.v578tipAutoShow578 = !current
    AppToast.show(this, "Tip Auto Show578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TokenAutoRefresh578Toggle() {
    val current = BiliClient.prefs.v578tokenAutoRefresh578
    BiliClient.prefs.v578tokenAutoRefresh578 = !current
    AppToast.show(this, "Token Auto Refresh578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TopAutoRank578Toggle() {
    val current = BiliClient.prefs.v578topAutoRank578
    BiliClient.prefs.v578topAutoRank578 = !current
    AppToast.show(this, "Top Auto Rank578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TraceAutoLog578Toggle() {
    val current = BiliClient.prefs.v578traceAutoLog578
    BiliClient.prefs.v578traceAutoLog578 = !current
    AppToast.show(this, "Trace Auto Log578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TransferAutoResume578Toggle() {
    val current = BiliClient.prefs.v578transferAutoResume578
    BiliClient.prefs.v578transferAutoResume578 = !current
    AppToast.show(this, "Transfer Auto Resume578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TransformAutoCrop578Toggle() {
    val current = BiliClient.prefs.v578transformAutoCrop578
    BiliClient.prefs.v578transformAutoCrop578 = !current
    AppToast.show(this, "Transform Auto Crop578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TranslateAutoDetect578Toggle() {
    val current = BiliClient.prefs.v578translateAutoDetect578
    BiliClient.prefs.v578translateAutoDetect578 = !current
    AppToast.show(this, "Translate Auto Detect578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TriggerAutoFire578Toggle() {
    val current = BiliClient.prefs.v578triggerAutoFire578
    BiliClient.prefs.v578triggerAutoFire578 = !current
    AppToast.show(this, "Trigger Auto Fire578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TrimAutoClean578Toggle() {
    val current = BiliClient.prefs.v578trimAutoClean578
    BiliClient.prefs.v578trimAutoClean578 = !current
    AppToast.show(this, "Trim Auto Clean578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TuneAutoEqualizer578Toggle() {
    val current = BiliClient.prefs.v578tuneAutoEqualizer578
    BiliClient.prefs.v578tuneAutoEqualizer578 = !current
    AppToast.show(this, "Tune Auto Equalizer578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV578TypeAutoInfer578Toggle() {
    val current = BiliClient.prefs.v578typeAutoInfer578
    BiliClient.prefs.v578typeAutoInfer578 = !current
    AppToast.show(this, "Type Auto Infer578: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TextAutoDetect579Toggle() {
    val current = BiliClient.prefs.v579textAutoDetect579
    BiliClient.prefs.v579textAutoDetect579 = !current
    AppToast.show(this, "Text Auto Detect579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579ThemeAutoSwitch579Toggle() {
    val current = BiliClient.prefs.v579themeAutoSwitch579
    BiliClient.prefs.v579themeAutoSwitch579 = !current
    AppToast.show(this, "Theme Auto Switch579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579ThresholdAutoSet579Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v579thresholdAutoSet579).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set579",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v579thresholdAutoSet579 = value
        AppToast.show(this, "Threshold Auto Set579: $value")
    }
}

internal fun PlayerActivity.showV579TileAutoLayout579Toggle() {
    val current = BiliClient.prefs.v579tileAutoLayout579
    BiliClient.prefs.v579tileAutoLayout579 = !current
    AppToast.show(this, "Tile Auto Layout579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TipAutoShow579Toggle() {
    val current = BiliClient.prefs.v579tipAutoShow579
    BiliClient.prefs.v579tipAutoShow579 = !current
    AppToast.show(this, "Tip Auto Show579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TokenAutoRefresh579Toggle() {
    val current = BiliClient.prefs.v579tokenAutoRefresh579
    BiliClient.prefs.v579tokenAutoRefresh579 = !current
    AppToast.show(this, "Token Auto Refresh579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TopAutoRank579Toggle() {
    val current = BiliClient.prefs.v579topAutoRank579
    BiliClient.prefs.v579topAutoRank579 = !current
    AppToast.show(this, "Top Auto Rank579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TraceAutoLog579Toggle() {
    val current = BiliClient.prefs.v579traceAutoLog579
    BiliClient.prefs.v579traceAutoLog579 = !current
    AppToast.show(this, "Trace Auto Log579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TransferAutoResume579Toggle() {
    val current = BiliClient.prefs.v579transferAutoResume579
    BiliClient.prefs.v579transferAutoResume579 = !current
    AppToast.show(this, "Transfer Auto Resume579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TransformAutoCrop579Toggle() {
    val current = BiliClient.prefs.v579transformAutoCrop579
    BiliClient.prefs.v579transformAutoCrop579 = !current
    AppToast.show(this, "Transform Auto Crop579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TranslateAutoDetect579Toggle() {
    val current = BiliClient.prefs.v579translateAutoDetect579
    BiliClient.prefs.v579translateAutoDetect579 = !current
    AppToast.show(this, "Translate Auto Detect579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TriggerAutoFire579Toggle() {
    val current = BiliClient.prefs.v579triggerAutoFire579
    BiliClient.prefs.v579triggerAutoFire579 = !current
    AppToast.show(this, "Trigger Auto Fire579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TrimAutoClean579Toggle() {
    val current = BiliClient.prefs.v579trimAutoClean579
    BiliClient.prefs.v579trimAutoClean579 = !current
    AppToast.show(this, "Trim Auto Clean579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TuneAutoEqualizer579Toggle() {
    val current = BiliClient.prefs.v579tuneAutoEqualizer579
    BiliClient.prefs.v579tuneAutoEqualizer579 = !current
    AppToast.show(this, "Tune Auto Equalizer579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV579TypeAutoInfer579Toggle() {
    val current = BiliClient.prefs.v579typeAutoInfer579
    BiliClient.prefs.v579typeAutoInfer579 = !current
    AppToast.show(this, "Type Auto Infer579: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TextAutoDetect580Toggle() {
    val current = BiliClient.prefs.v580textAutoDetect580
    BiliClient.prefs.v580textAutoDetect580 = !current
    AppToast.show(this, "Text Auto Detect580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580ThemeAutoSwitch580Toggle() {
    val current = BiliClient.prefs.v580themeAutoSwitch580
    BiliClient.prefs.v580themeAutoSwitch580 = !current
    AppToast.show(this, "Theme Auto Switch580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580ThresholdAutoSet580Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v580thresholdAutoSet580).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set580",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v580thresholdAutoSet580 = value
        AppToast.show(this, "Threshold Auto Set580: $value")
    }
}

internal fun PlayerActivity.showV580TileAutoLayout580Toggle() {
    val current = BiliClient.prefs.v580tileAutoLayout580
    BiliClient.prefs.v580tileAutoLayout580 = !current
    AppToast.show(this, "Tile Auto Layout580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TipAutoShow580Toggle() {
    val current = BiliClient.prefs.v580tipAutoShow580
    BiliClient.prefs.v580tipAutoShow580 = !current
    AppToast.show(this, "Tip Auto Show580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TokenAutoRefresh580Toggle() {
    val current = BiliClient.prefs.v580tokenAutoRefresh580
    BiliClient.prefs.v580tokenAutoRefresh580 = !current
    AppToast.show(this, "Token Auto Refresh580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TopAutoRank580Toggle() {
    val current = BiliClient.prefs.v580topAutoRank580
    BiliClient.prefs.v580topAutoRank580 = !current
    AppToast.show(this, "Top Auto Rank580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TraceAutoLog580Toggle() {
    val current = BiliClient.prefs.v580traceAutoLog580
    BiliClient.prefs.v580traceAutoLog580 = !current
    AppToast.show(this, "Trace Auto Log580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TransferAutoResume580Toggle() {
    val current = BiliClient.prefs.v580transferAutoResume580
    BiliClient.prefs.v580transferAutoResume580 = !current
    AppToast.show(this, "Transfer Auto Resume580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TransformAutoCrop580Toggle() {
    val current = BiliClient.prefs.v580transformAutoCrop580
    BiliClient.prefs.v580transformAutoCrop580 = !current
    AppToast.show(this, "Transform Auto Crop580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TranslateAutoDetect580Toggle() {
    val current = BiliClient.prefs.v580translateAutoDetect580
    BiliClient.prefs.v580translateAutoDetect580 = !current
    AppToast.show(this, "Translate Auto Detect580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TriggerAutoFire580Toggle() {
    val current = BiliClient.prefs.v580triggerAutoFire580
    BiliClient.prefs.v580triggerAutoFire580 = !current
    AppToast.show(this, "Trigger Auto Fire580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TrimAutoClean580Toggle() {
    val current = BiliClient.prefs.v580trimAutoClean580
    BiliClient.prefs.v580trimAutoClean580 = !current
    AppToast.show(this, "Trim Auto Clean580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TuneAutoEqualizer580Toggle() {
    val current = BiliClient.prefs.v580tuneAutoEqualizer580
    BiliClient.prefs.v580tuneAutoEqualizer580 = !current
    AppToast.show(this, "Tune Auto Equalizer580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV580TypeAutoInfer580Toggle() {
    val current = BiliClient.prefs.v580typeAutoInfer580
    BiliClient.prefs.v580typeAutoInfer580 = !current
    AppToast.show(this, "Type Auto Infer580: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581UpdateAutoDownload581Toggle() {
    val current = BiliClient.prefs.v581updateAutoDownload581
    BiliClient.prefs.v581updateAutoDownload581 = !current
    AppToast.show(this, "Update Auto Download581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581UploadAutoRetry581Toggle() {
    val current = BiliClient.prefs.v581uploadAutoRetry581
    BiliClient.prefs.v581uploadAutoRetry581 = !current
    AppToast.show(this, "Upload Auto Retry581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581UpscaleAutoEnhance581Toggle() {
    val current = BiliClient.prefs.v581upscaleAutoEnhance581
    BiliClient.prefs.v581upscaleAutoEnhance581 = !current
    AppToast.show(this, "Upscale Auto Enhance581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581UseAutoOptimize581Toggle() {
    val current = BiliClient.prefs.v581useAutoOptimize581
    BiliClient.prefs.v581useAutoOptimize581 = !current
    AppToast.show(this, "Use Auto Optimize581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581ValueAutoBind581Toggle() {
    val current = BiliClient.prefs.v581valueAutoBind581
    BiliClient.prefs.v581valueAutoBind581 = !current
    AppToast.show(this, "Value Auto Bind581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581VerifyAutoChecksum581Toggle() {
    val current = BiliClient.prefs.v581verifyAutoChecksum581
    BiliClient.prefs.v581verifyAutoChecksum581 = !current
    AppToast.show(this, "Verify Auto Checksum581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581VersionAutoCheck581Toggle() {
    val current = BiliClient.prefs.v581versionAutoCheck581
    BiliClient.prefs.v581versionAutoCheck581 = !current
    AppToast.show(this, "Version Auto Check581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581ViewAutoSwitch581Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v581viewAutoSwitch581).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch581",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v581viewAutoSwitch581 = value
        AppToast.show(this, "View Auto Switch581: $value")
    }
}

internal fun PlayerActivity.showV581VirtualDisplay581Toggle() {
    val current = BiliClient.prefs.v581virtualDisplay581
    BiliClient.prefs.v581virtualDisplay581 = !current
    AppToast.show(this, "Virtual Display581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581VisibleAutoToggle581Toggle() {
    val current = BiliClient.prefs.v581visibleAutoToggle581
    BiliClient.prefs.v581visibleAutoToggle581 = !current
    AppToast.show(this, "Visible Auto Toggle581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581VoiceAutoRecognize581Toggle() {
    val current = BiliClient.prefs.v581voiceAutoRecognize581
    BiliClient.prefs.v581voiceAutoRecognize581 = !current
    AppToast.show(this, "Voice Auto Recognize581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581WaitAutoTimeout581Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v581waitAutoTimeout581).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout581",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v581waitAutoTimeout581 = value
        AppToast.show(this, "Wait Auto Timeout581: $value")
    }
}

internal fun PlayerActivity.showV581WarmAutoStart581Toggle() {
    val current = BiliClient.prefs.v581warmAutoStart581
    BiliClient.prefs.v581warmAutoStart581 = !current
    AppToast.show(this, "Warm Auto Start581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581WarningAutoAlert581Toggle() {
    val current = BiliClient.prefs.v581warningAutoAlert581
    BiliClient.prefs.v581warningAutoAlert581 = !current
    AppToast.show(this, "Warning Auto Alert581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV581WatchAutoSync581Toggle() {
    val current = BiliClient.prefs.v581watchAutoSync581
    BiliClient.prefs.v581watchAutoSync581 = !current
    AppToast.show(this, "Watch Auto Sync581: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582UpdateAutoDownload582Toggle() {
    val current = BiliClient.prefs.v582updateAutoDownload582
    BiliClient.prefs.v582updateAutoDownload582 = !current
    AppToast.show(this, "Update Auto Download582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582UploadAutoRetry582Toggle() {
    val current = BiliClient.prefs.v582uploadAutoRetry582
    BiliClient.prefs.v582uploadAutoRetry582 = !current
    AppToast.show(this, "Upload Auto Retry582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582UpscaleAutoEnhance582Toggle() {
    val current = BiliClient.prefs.v582upscaleAutoEnhance582
    BiliClient.prefs.v582upscaleAutoEnhance582 = !current
    AppToast.show(this, "Upscale Auto Enhance582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582UseAutoOptimize582Toggle() {
    val current = BiliClient.prefs.v582useAutoOptimize582
    BiliClient.prefs.v582useAutoOptimize582 = !current
    AppToast.show(this, "Use Auto Optimize582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582ValueAutoBind582Toggle() {
    val current = BiliClient.prefs.v582valueAutoBind582
    BiliClient.prefs.v582valueAutoBind582 = !current
    AppToast.show(this, "Value Auto Bind582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582VerifyAutoChecksum582Toggle() {
    val current = BiliClient.prefs.v582verifyAutoChecksum582
    BiliClient.prefs.v582verifyAutoChecksum582 = !current
    AppToast.show(this, "Verify Auto Checksum582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582VersionAutoCheck582Toggle() {
    val current = BiliClient.prefs.v582versionAutoCheck582
    BiliClient.prefs.v582versionAutoCheck582 = !current
    AppToast.show(this, "Version Auto Check582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582ViewAutoSwitch582Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v582viewAutoSwitch582).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch582",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v582viewAutoSwitch582 = value
        AppToast.show(this, "View Auto Switch582: $value")
    }
}

internal fun PlayerActivity.showV582VirtualDisplay582Toggle() {
    val current = BiliClient.prefs.v582virtualDisplay582
    BiliClient.prefs.v582virtualDisplay582 = !current
    AppToast.show(this, "Virtual Display582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582VisibleAutoToggle582Toggle() {
    val current = BiliClient.prefs.v582visibleAutoToggle582
    BiliClient.prefs.v582visibleAutoToggle582 = !current
    AppToast.show(this, "Visible Auto Toggle582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582VoiceAutoRecognize582Toggle() {
    val current = BiliClient.prefs.v582voiceAutoRecognize582
    BiliClient.prefs.v582voiceAutoRecognize582 = !current
    AppToast.show(this, "Voice Auto Recognize582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582WaitAutoTimeout582Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v582waitAutoTimeout582).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout582",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v582waitAutoTimeout582 = value
        AppToast.show(this, "Wait Auto Timeout582: $value")
    }
}

internal fun PlayerActivity.showV582WarmAutoStart582Toggle() {
    val current = BiliClient.prefs.v582warmAutoStart582
    BiliClient.prefs.v582warmAutoStart582 = !current
    AppToast.show(this, "Warm Auto Start582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582WarningAutoAlert582Toggle() {
    val current = BiliClient.prefs.v582warningAutoAlert582
    BiliClient.prefs.v582warningAutoAlert582 = !current
    AppToast.show(this, "Warning Auto Alert582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV582WatchAutoSync582Toggle() {
    val current = BiliClient.prefs.v582watchAutoSync582
    BiliClient.prefs.v582watchAutoSync582 = !current
    AppToast.show(this, "Watch Auto Sync582: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583UpdateAutoDownload583Toggle() {
    val current = BiliClient.prefs.v583updateAutoDownload583
    BiliClient.prefs.v583updateAutoDownload583 = !current
    AppToast.show(this, "Update Auto Download583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583UploadAutoRetry583Toggle() {
    val current = BiliClient.prefs.v583uploadAutoRetry583
    BiliClient.prefs.v583uploadAutoRetry583 = !current
    AppToast.show(this, "Upload Auto Retry583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583UpscaleAutoEnhance583Toggle() {
    val current = BiliClient.prefs.v583upscaleAutoEnhance583
    BiliClient.prefs.v583upscaleAutoEnhance583 = !current
    AppToast.show(this, "Upscale Auto Enhance583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583UseAutoOptimize583Toggle() {
    val current = BiliClient.prefs.v583useAutoOptimize583
    BiliClient.prefs.v583useAutoOptimize583 = !current
    AppToast.show(this, "Use Auto Optimize583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583ValueAutoBind583Toggle() {
    val current = BiliClient.prefs.v583valueAutoBind583
    BiliClient.prefs.v583valueAutoBind583 = !current
    AppToast.show(this, "Value Auto Bind583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583VerifyAutoChecksum583Toggle() {
    val current = BiliClient.prefs.v583verifyAutoChecksum583
    BiliClient.prefs.v583verifyAutoChecksum583 = !current
    AppToast.show(this, "Verify Auto Checksum583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583VersionAutoCheck583Toggle() {
    val current = BiliClient.prefs.v583versionAutoCheck583
    BiliClient.prefs.v583versionAutoCheck583 = !current
    AppToast.show(this, "Version Auto Check583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583ViewAutoSwitch583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583viewAutoSwitch583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583viewAutoSwitch583 = value
        AppToast.show(this, "View Auto Switch583: $value")
    }
}

internal fun PlayerActivity.showV583VirtualDisplay583Toggle() {
    val current = BiliClient.prefs.v583virtualDisplay583
    BiliClient.prefs.v583virtualDisplay583 = !current
    AppToast.show(this, "Virtual Display583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583VisibleAutoToggle583Toggle() {
    val current = BiliClient.prefs.v583visibleAutoToggle583
    BiliClient.prefs.v583visibleAutoToggle583 = !current
    AppToast.show(this, "Visible Auto Toggle583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583VoiceAutoRecognize583Toggle() {
    val current = BiliClient.prefs.v583voiceAutoRecognize583
    BiliClient.prefs.v583voiceAutoRecognize583 = !current
    AppToast.show(this, "Voice Auto Recognize583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583WaitAutoTimeout583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583waitAutoTimeout583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583waitAutoTimeout583 = value
        AppToast.show(this, "Wait Auto Timeout583: $value")
    }
}

internal fun PlayerActivity.showV583WarmAutoStart583Toggle() {
    val current = BiliClient.prefs.v583warmAutoStart583
    BiliClient.prefs.v583warmAutoStart583 = !current
    AppToast.show(this, "Warm Auto Start583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583WarningAutoAlert583Toggle() {
    val current = BiliClient.prefs.v583warningAutoAlert583
    BiliClient.prefs.v583warningAutoAlert583 = !current
    AppToast.show(this, "Warning Auto Alert583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV583WatchAutoSync583Toggle() {
    val current = BiliClient.prefs.v583watchAutoSync583
    BiliClient.prefs.v583watchAutoSync583 = !current
    AppToast.show(this, "Watch Auto Sync583: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584UpdateAutoDownload584Toggle() {
    val current = BiliClient.prefs.v584updateAutoDownload584
    BiliClient.prefs.v584updateAutoDownload584 = !current
    AppToast.show(this, "Update Auto Download584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584UploadAutoRetry584Toggle() {
    val current = BiliClient.prefs.v584uploadAutoRetry584
    BiliClient.prefs.v584uploadAutoRetry584 = !current
    AppToast.show(this, "Upload Auto Retry584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584UpscaleAutoEnhance584Toggle() {
    val current = BiliClient.prefs.v584upscaleAutoEnhance584
    BiliClient.prefs.v584upscaleAutoEnhance584 = !current
    AppToast.show(this, "Upscale Auto Enhance584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584UseAutoOptimize584Toggle() {
    val current = BiliClient.prefs.v584useAutoOptimize584
    BiliClient.prefs.v584useAutoOptimize584 = !current
    AppToast.show(this, "Use Auto Optimize584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584ValueAutoBind584Toggle() {
    val current = BiliClient.prefs.v584valueAutoBind584
    BiliClient.prefs.v584valueAutoBind584 = !current
    AppToast.show(this, "Value Auto Bind584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584VerifyAutoChecksum584Toggle() {
    val current = BiliClient.prefs.v584verifyAutoChecksum584
    BiliClient.prefs.v584verifyAutoChecksum584 = !current
    AppToast.show(this, "Verify Auto Checksum584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584VersionAutoCheck584Toggle() {
    val current = BiliClient.prefs.v584versionAutoCheck584
    BiliClient.prefs.v584versionAutoCheck584 = !current
    AppToast.show(this, "Version Auto Check584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584ViewAutoSwitch584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584viewAutoSwitch584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584viewAutoSwitch584 = value
        AppToast.show(this, "View Auto Switch584: $value")
    }
}

internal fun PlayerActivity.showV584VirtualDisplay584Toggle() {
    val current = BiliClient.prefs.v584virtualDisplay584
    BiliClient.prefs.v584virtualDisplay584 = !current
    AppToast.show(this, "Virtual Display584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584VisibleAutoToggle584Toggle() {
    val current = BiliClient.prefs.v584visibleAutoToggle584
    BiliClient.prefs.v584visibleAutoToggle584 = !current
    AppToast.show(this, "Visible Auto Toggle584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584VoiceAutoRecognize584Toggle() {
    val current = BiliClient.prefs.v584voiceAutoRecognize584
    BiliClient.prefs.v584voiceAutoRecognize584 = !current
    AppToast.show(this, "Voice Auto Recognize584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584WaitAutoTimeout584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584waitAutoTimeout584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584waitAutoTimeout584 = value
        AppToast.show(this, "Wait Auto Timeout584: $value")
    }
}

internal fun PlayerActivity.showV584WarmAutoStart584Toggle() {
    val current = BiliClient.prefs.v584warmAutoStart584
    BiliClient.prefs.v584warmAutoStart584 = !current
    AppToast.show(this, "Warm Auto Start584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584WarningAutoAlert584Toggle() {
    val current = BiliClient.prefs.v584warningAutoAlert584
    BiliClient.prefs.v584warningAutoAlert584 = !current
    AppToast.show(this, "Warning Auto Alert584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV584WatchAutoSync584Toggle() {
    val current = BiliClient.prefs.v584watchAutoSync584
    BiliClient.prefs.v584watchAutoSync584 = !current
    AppToast.show(this, "Watch Auto Sync584: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585UpdateAutoDownload585Toggle() {
    val current = BiliClient.prefs.v585updateAutoDownload585
    BiliClient.prefs.v585updateAutoDownload585 = !current
    AppToast.show(this, "Update Auto Download585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585UploadAutoRetry585Toggle() {
    val current = BiliClient.prefs.v585uploadAutoRetry585
    BiliClient.prefs.v585uploadAutoRetry585 = !current
    AppToast.show(this, "Upload Auto Retry585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585UpscaleAutoEnhance585Toggle() {
    val current = BiliClient.prefs.v585upscaleAutoEnhance585
    BiliClient.prefs.v585upscaleAutoEnhance585 = !current
    AppToast.show(this, "Upscale Auto Enhance585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585UseAutoOptimize585Toggle() {
    val current = BiliClient.prefs.v585useAutoOptimize585
    BiliClient.prefs.v585useAutoOptimize585 = !current
    AppToast.show(this, "Use Auto Optimize585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585ValueAutoBind585Toggle() {
    val current = BiliClient.prefs.v585valueAutoBind585
    BiliClient.prefs.v585valueAutoBind585 = !current
    AppToast.show(this, "Value Auto Bind585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585VerifyAutoChecksum585Toggle() {
    val current = BiliClient.prefs.v585verifyAutoChecksum585
    BiliClient.prefs.v585verifyAutoChecksum585 = !current
    AppToast.show(this, "Verify Auto Checksum585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585VersionAutoCheck585Toggle() {
    val current = BiliClient.prefs.v585versionAutoCheck585
    BiliClient.prefs.v585versionAutoCheck585 = !current
    AppToast.show(this, "Version Auto Check585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585ViewAutoSwitch585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585viewAutoSwitch585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585viewAutoSwitch585 = value
        AppToast.show(this, "View Auto Switch585: $value")
    }
}

internal fun PlayerActivity.showV585VirtualDisplay585Toggle() {
    val current = BiliClient.prefs.v585virtualDisplay585
    BiliClient.prefs.v585virtualDisplay585 = !current
    AppToast.show(this, "Virtual Display585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585VisibleAutoToggle585Toggle() {
    val current = BiliClient.prefs.v585visibleAutoToggle585
    BiliClient.prefs.v585visibleAutoToggle585 = !current
    AppToast.show(this, "Visible Auto Toggle585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585VoiceAutoRecognize585Toggle() {
    val current = BiliClient.prefs.v585voiceAutoRecognize585
    BiliClient.prefs.v585voiceAutoRecognize585 = !current
    AppToast.show(this, "Voice Auto Recognize585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585WaitAutoTimeout585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585waitAutoTimeout585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585waitAutoTimeout585 = value
        AppToast.show(this, "Wait Auto Timeout585: $value")
    }
}

internal fun PlayerActivity.showV585WarmAutoStart585Toggle() {
    val current = BiliClient.prefs.v585warmAutoStart585
    BiliClient.prefs.v585warmAutoStart585 = !current
    AppToast.show(this, "Warm Auto Start585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585WarningAutoAlert585Toggle() {
    val current = BiliClient.prefs.v585warningAutoAlert585
    BiliClient.prefs.v585warningAutoAlert585 = !current
    AppToast.show(this, "Warning Auto Alert585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV585WatchAutoSync585Toggle() {
    val current = BiliClient.prefs.v585watchAutoSync585
    BiliClient.prefs.v585watchAutoSync585 = !current
    AppToast.show(this, "Watch Auto Sync585: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586UpdateAutoDownload586Toggle() {
    val current = BiliClient.prefs.v586updateAutoDownload586
    BiliClient.prefs.v586updateAutoDownload586 = !current
    AppToast.show(this, "Update Auto Download586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586UploadAutoRetry586Toggle() {
    val current = BiliClient.prefs.v586uploadAutoRetry586
    BiliClient.prefs.v586uploadAutoRetry586 = !current
    AppToast.show(this, "Upload Auto Retry586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586UpscaleAutoEnhance586Toggle() {
    val current = BiliClient.prefs.v586upscaleAutoEnhance586
    BiliClient.prefs.v586upscaleAutoEnhance586 = !current
    AppToast.show(this, "Upscale Auto Enhance586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586UseAutoOptimize586Toggle() {
    val current = BiliClient.prefs.v586useAutoOptimize586
    BiliClient.prefs.v586useAutoOptimize586 = !current
    AppToast.show(this, "Use Auto Optimize586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586ValueAutoBind586Toggle() {
    val current = BiliClient.prefs.v586valueAutoBind586
    BiliClient.prefs.v586valueAutoBind586 = !current
    AppToast.show(this, "Value Auto Bind586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586VerifyAutoChecksum586Toggle() {
    val current = BiliClient.prefs.v586verifyAutoChecksum586
    BiliClient.prefs.v586verifyAutoChecksum586 = !current
    AppToast.show(this, "Verify Auto Checksum586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586VersionAutoCheck586Toggle() {
    val current = BiliClient.prefs.v586versionAutoCheck586
    BiliClient.prefs.v586versionAutoCheck586 = !current
    AppToast.show(this, "Version Auto Check586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586ViewAutoSwitch586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586viewAutoSwitch586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586viewAutoSwitch586 = value
        AppToast.show(this, "View Auto Switch586: $value")
    }
}

internal fun PlayerActivity.showV586VirtualDisplay586Toggle() {
    val current = BiliClient.prefs.v586virtualDisplay586
    BiliClient.prefs.v586virtualDisplay586 = !current
    AppToast.show(this, "Virtual Display586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586VisibleAutoToggle586Toggle() {
    val current = BiliClient.prefs.v586visibleAutoToggle586
    BiliClient.prefs.v586visibleAutoToggle586 = !current
    AppToast.show(this, "Visible Auto Toggle586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586VoiceAutoRecognize586Toggle() {
    val current = BiliClient.prefs.v586voiceAutoRecognize586
    BiliClient.prefs.v586voiceAutoRecognize586 = !current
    AppToast.show(this, "Voice Auto Recognize586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586WaitAutoTimeout586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586waitAutoTimeout586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586waitAutoTimeout586 = value
        AppToast.show(this, "Wait Auto Timeout586: $value")
    }
}

internal fun PlayerActivity.showV586WarmAutoStart586Toggle() {
    val current = BiliClient.prefs.v586warmAutoStart586
    BiliClient.prefs.v586warmAutoStart586 = !current
    AppToast.show(this, "Warm Auto Start586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586WarningAutoAlert586Toggle() {
    val current = BiliClient.prefs.v586warningAutoAlert586
    BiliClient.prefs.v586warningAutoAlert586 = !current
    AppToast.show(this, "Warning Auto Alert586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV586WatchAutoSync586Toggle() {
    val current = BiliClient.prefs.v586watchAutoSync586
    BiliClient.prefs.v586watchAutoSync586 = !current
    AppToast.show(this, "Watch Auto Sync586: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587UpdateAutoDownload587Toggle() {
    val current = BiliClient.prefs.v587updateAutoDownload587
    BiliClient.prefs.v587updateAutoDownload587 = !current
    AppToast.show(this, "Update Auto Download587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587UploadAutoRetry587Toggle() {
    val current = BiliClient.prefs.v587uploadAutoRetry587
    BiliClient.prefs.v587uploadAutoRetry587 = !current
    AppToast.show(this, "Upload Auto Retry587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587UpscaleAutoEnhance587Toggle() {
    val current = BiliClient.prefs.v587upscaleAutoEnhance587
    BiliClient.prefs.v587upscaleAutoEnhance587 = !current
    AppToast.show(this, "Upscale Auto Enhance587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587UseAutoOptimize587Toggle() {
    val current = BiliClient.prefs.v587useAutoOptimize587
    BiliClient.prefs.v587useAutoOptimize587 = !current
    AppToast.show(this, "Use Auto Optimize587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587ValueAutoBind587Toggle() {
    val current = BiliClient.prefs.v587valueAutoBind587
    BiliClient.prefs.v587valueAutoBind587 = !current
    AppToast.show(this, "Value Auto Bind587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587VerifyAutoChecksum587Toggle() {
    val current = BiliClient.prefs.v587verifyAutoChecksum587
    BiliClient.prefs.v587verifyAutoChecksum587 = !current
    AppToast.show(this, "Verify Auto Checksum587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587VersionAutoCheck587Toggle() {
    val current = BiliClient.prefs.v587versionAutoCheck587
    BiliClient.prefs.v587versionAutoCheck587 = !current
    AppToast.show(this, "Version Auto Check587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587ViewAutoSwitch587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587viewAutoSwitch587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587viewAutoSwitch587 = value
        AppToast.show(this, "View Auto Switch587: $value")
    }
}

internal fun PlayerActivity.showV587VirtualDisplay587Toggle() {
    val current = BiliClient.prefs.v587virtualDisplay587
    BiliClient.prefs.v587virtualDisplay587 = !current
    AppToast.show(this, "Virtual Display587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587VisibleAutoToggle587Toggle() {
    val current = BiliClient.prefs.v587visibleAutoToggle587
    BiliClient.prefs.v587visibleAutoToggle587 = !current
    AppToast.show(this, "Visible Auto Toggle587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587VoiceAutoRecognize587Toggle() {
    val current = BiliClient.prefs.v587voiceAutoRecognize587
    BiliClient.prefs.v587voiceAutoRecognize587 = !current
    AppToast.show(this, "Voice Auto Recognize587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587WaitAutoTimeout587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587waitAutoTimeout587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587waitAutoTimeout587 = value
        AppToast.show(this, "Wait Auto Timeout587: $value")
    }
}

internal fun PlayerActivity.showV587WarmAutoStart587Toggle() {
    val current = BiliClient.prefs.v587warmAutoStart587
    BiliClient.prefs.v587warmAutoStart587 = !current
    AppToast.show(this, "Warm Auto Start587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587WarningAutoAlert587Toggle() {
    val current = BiliClient.prefs.v587warningAutoAlert587
    BiliClient.prefs.v587warningAutoAlert587 = !current
    AppToast.show(this, "Warning Auto Alert587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV587WatchAutoSync587Toggle() {
    val current = BiliClient.prefs.v587watchAutoSync587
    BiliClient.prefs.v587watchAutoSync587 = !current
    AppToast.show(this, "Watch Auto Sync587: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588UpdateAutoDownload588Toggle() {
    val current = BiliClient.prefs.v588updateAutoDownload588
    BiliClient.prefs.v588updateAutoDownload588 = !current
    AppToast.show(this, "Update Auto Download588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588UploadAutoRetry588Toggle() {
    val current = BiliClient.prefs.v588uploadAutoRetry588
    BiliClient.prefs.v588uploadAutoRetry588 = !current
    AppToast.show(this, "Upload Auto Retry588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588UpscaleAutoEnhance588Toggle() {
    val current = BiliClient.prefs.v588upscaleAutoEnhance588
    BiliClient.prefs.v588upscaleAutoEnhance588 = !current
    AppToast.show(this, "Upscale Auto Enhance588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588UseAutoOptimize588Toggle() {
    val current = BiliClient.prefs.v588useAutoOptimize588
    BiliClient.prefs.v588useAutoOptimize588 = !current
    AppToast.show(this, "Use Auto Optimize588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588ValueAutoBind588Toggle() {
    val current = BiliClient.prefs.v588valueAutoBind588
    BiliClient.prefs.v588valueAutoBind588 = !current
    AppToast.show(this, "Value Auto Bind588: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV588VerifyAutoChecksum588Toggle() {
    val current = BiliClient.prefs.v588verifyAutoChecksum588
    BiliClient.prefs.v588verifyAutoChecksum588 = !current
    AppToast.show(this, "Verify Auto Checksum588: ${if (!current) "ON" else "OFF"}")
}

