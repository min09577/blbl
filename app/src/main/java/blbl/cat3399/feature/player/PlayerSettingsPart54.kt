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

// v721: Export Auto Xml721
internal fun PlayerActivity.showV721ExportAutoXml721Toggle() {
    val current = BiliClient.prefs.v721exportAutoXml721
    BiliClient.prefs.v721exportAutoXml721 = !current
    AppToast.show(this, "Export Auto Xml721: ${if (!current) "ON" else "OFF"}")
}

// v722: Export Auto Xml722
internal fun PlayerActivity.showV722ExportAutoXml722Toggle() {
    val current = BiliClient.prefs.v722exportAutoXml722
    BiliClient.prefs.v722exportAutoXml722 = !current
    AppToast.show(this, "Export Auto Xml722: ${if (!current) "ON" else "OFF"}")
}

// v723: Export Auto Xml723
internal fun PlayerActivity.showV723ExportAutoXml723Toggle() {
    val current = BiliClient.prefs.v723exportAutoXml723
    BiliClient.prefs.v723exportAutoXml723 = !current
    AppToast.show(this, "Export Auto Xml723: ${if (!current) "ON" else "OFF"}")
}

// v724: Export Auto Xml724
internal fun PlayerActivity.showV724ExportAutoXml724Toggle() {
    val current = BiliClient.prefs.v724exportAutoXml724
    BiliClient.prefs.v724exportAutoXml724 = !current
    AppToast.show(this, "Export Auto Xml724: ${if (!current) "ON" else "OFF"}")
}

// v725: Export Auto Xml725
internal fun PlayerActivity.showV725ExportAutoXml725Toggle() {
    val current = BiliClient.prefs.v725exportAutoXml725
    BiliClient.prefs.v725exportAutoXml725 = !current
    AppToast.show(this, "Export Auto Xml725: ${if (!current) "ON" else "OFF"}")
}

// v721: Extend Auto List721
internal fun PlayerActivity.showV721ExtendAutoList721Toggle() {
    val current = BiliClient.prefs.v721extendAutoList721
    BiliClient.prefs.v721extendAutoList721 = !current
    AppToast.show(this, "Extend Auto List721: ${if (!current) "ON" else "OFF"}")
}

// v722: Extend Auto List722
internal fun PlayerActivity.showV722ExtendAutoList722Toggle() {
    val current = BiliClient.prefs.v722extendAutoList722
    BiliClient.prefs.v722extendAutoList722 = !current
    AppToast.show(this, "Extend Auto List722: ${if (!current) "ON" else "OFF"}")
}

// v723: Extend Auto List723
internal fun PlayerActivity.showV723ExtendAutoList723Toggle() {
    val current = BiliClient.prefs.v723extendAutoList723
    BiliClient.prefs.v723extendAutoList723 = !current
    AppToast.show(this, "Extend Auto List723: ${if (!current) "ON" else "OFF"}")
}

// v724: Extend Auto List724
internal fun PlayerActivity.showV724ExtendAutoList724Toggle() {
    val current = BiliClient.prefs.v724extendAutoList724
    BiliClient.prefs.v724extendAutoList724 = !current
    AppToast.show(this, "Extend Auto List724: ${if (!current) "ON" else "OFF"}")
}

// v725: Extend Auto List725
internal fun PlayerActivity.showV725ExtendAutoList725Toggle() {
    val current = BiliClient.prefs.v725extendAutoList725
    BiliClient.prefs.v725extendAutoList725 = !current
    AppToast.show(this, "Extend Auto List725: ${if (!current) "ON" else "OFF"}")
}

// v721: External Auto Link721
internal fun PlayerActivity.showV721ExternalAutoLink721Toggle() {
    val current = BiliClient.prefs.v721externalAutoLink721
    BiliClient.prefs.v721externalAutoLink721 = !current
    AppToast.show(this, "External Auto Link721: ${if (!current) "ON" else "OFF"}")
}

// v722: External Auto Link722
internal fun PlayerActivity.showV722ExternalAutoLink722Toggle() {
    val current = BiliClient.prefs.v722externalAutoLink722
    BiliClient.prefs.v722externalAutoLink722 = !current
    AppToast.show(this, "External Auto Link722: ${if (!current) "ON" else "OFF"}")
}

// v723: External Auto Link723
internal fun PlayerActivity.showV723ExternalAutoLink723Toggle() {
    val current = BiliClient.prefs.v723externalAutoLink723
    BiliClient.prefs.v723externalAutoLink723 = !current
    AppToast.show(this, "External Auto Link723: ${if (!current) "ON" else "OFF"}")
}

// v724: External Auto Link724
internal fun PlayerActivity.showV724ExternalAutoLink724Toggle() {
    val current = BiliClient.prefs.v724externalAutoLink724
    BiliClient.prefs.v724externalAutoLink724 = !current
    AppToast.show(this, "External Auto Link724: ${if (!current) "ON" else "OFF"}")
}

// v725: External Auto Link725
internal fun PlayerActivity.showV725ExternalAutoLink725Toggle() {
    val current = BiliClient.prefs.v725externalAutoLink725
    BiliClient.prefs.v725externalAutoLink725 = !current
    AppToast.show(this, "External Auto Link725: ${if (!current) "ON" else "OFF"}")
}

// v721: Extract Auto Data721
internal fun PlayerActivity.showV721ExtractAutoData721Toggle() {
    val current = BiliClient.prefs.v721extractAutoData721
    BiliClient.prefs.v721extractAutoData721 = !current
    AppToast.show(this, "Extract Auto Data721: ${if (!current) "ON" else "OFF"}")
}

// v722: Extract Auto Data722
internal fun PlayerActivity.showV722ExtractAutoData722Toggle() {
    val current = BiliClient.prefs.v722extractAutoData722
    BiliClient.prefs.v722extractAutoData722 = !current
    AppToast.show(this, "Extract Auto Data722: ${if (!current) "ON" else "OFF"}")
}

// v723: Extract Auto Data723
internal fun PlayerActivity.showV723ExtractAutoData723Toggle() {
    val current = BiliClient.prefs.v723extractAutoData723
    BiliClient.prefs.v723extractAutoData723 = !current
    AppToast.show(this, "Extract Auto Data723: ${if (!current) "ON" else "OFF"}")
}

// v724: Extract Auto Data724
internal fun PlayerActivity.showV724ExtractAutoData724Toggle() {
    val current = BiliClient.prefs.v724extractAutoData724
    BiliClient.prefs.v724extractAutoData724 = !current
    AppToast.show(this, "Extract Auto Data724: ${if (!current) "ON" else "OFF"}")
}

// v725: Extract Auto Data725
internal fun PlayerActivity.showV725ExtractAutoData725Toggle() {
    val current = BiliClient.prefs.v725extractAutoData725
    BiliClient.prefs.v725extractAutoData725 = !current
    AppToast.show(this, "Extract Auto Data725: ${if (!current) "ON" else "OFF"}")
}

// v721: Factor Auto Scale721
internal fun PlayerActivity.showV721FactorAutoScale721Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v721factorAutoScale721).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Factor Auto Scale721",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v721factorAutoScale721 = value
        AppToast.show(this, "Factor Auto Scale721: $value")
    }
}

// v722: Factor Auto Scale722
internal fun PlayerActivity.showV722FactorAutoScale722Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v722factorAutoScale722).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Factor Auto Scale722",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v722factorAutoScale722 = value
        AppToast.show(this, "Factor Auto Scale722: $value")
    }
}

// v723: Factor Auto Scale723
internal fun PlayerActivity.showV723FactorAutoScale723Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v723factorAutoScale723).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Factor Auto Scale723",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v723factorAutoScale723 = value
        AppToast.show(this, "Factor Auto Scale723: $value")
    }
}

// v724: Factor Auto Scale724
internal fun PlayerActivity.showV724FactorAutoScale724Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v724factorAutoScale724).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Factor Auto Scale724",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v724factorAutoScale724 = value
        AppToast.show(this, "Factor Auto Scale724: $value")
    }
}

// v725: Factor Auto Scale725
internal fun PlayerActivity.showV725FactorAutoScale725Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v725factorAutoScale725).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Factor Auto Scale725",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v725factorAutoScale725 = value
        AppToast.show(this, "Factor Auto Scale725: $value")
    }
}

// v726: Fade Auto In726
internal fun PlayerActivity.showV726FadeAutoIn726Toggle() {
    val current = BiliClient.prefs.v726fadeAutoIn726
    BiliClient.prefs.v726fadeAutoIn726 = !current
    AppToast.show(this, "Fade Auto In726: ${if (!current) "ON" else "OFF"}")
}

// v726: Fallback Auto Route726
internal fun PlayerActivity.showV726FallbackAutoRoute726Toggle() {
    val current = BiliClient.prefs.v726fallbackAutoRoute726
    BiliClient.prefs.v726fallbackAutoRoute726 = !current
    AppToast.show(this, "Fallback Auto Route726: ${if (!current) "ON" else "OFF"}")
}

// v726: Family Auto Group726
internal fun PlayerActivity.showV726FamilyAutoGroup726Toggle() {
    val current = BiliClient.prefs.v726familyAutoGroup726
    BiliClient.prefs.v726familyAutoGroup726 = !current
    AppToast.show(this, "Family Auto Group726: ${if (!current) "ON" else "OFF"}")
}

// v726: Feature Auto Toggle726
internal fun PlayerActivity.showV726FeatureAutoToggle726Toggle() {
    val current = BiliClient.prefs.v726featureAutoToggle726
    BiliClient.prefs.v726featureAutoToggle726 = !current
    AppToast.show(this, "Feature Auto Toggle726: ${if (!current) "ON" else "OFF"}")
}

// v726: Field Auto Select726
internal fun PlayerActivity.showV726FieldAutoSelect726Toggle() {
    val current = BiliClient.prefs.v726fieldAutoSelect726
    BiliClient.prefs.v726fieldAutoSelect726 = !current
    AppToast.show(this, "Field Auto Select726: ${if (!current) "ON" else "OFF"}")
}

// v726: File Auto Compress726
internal fun PlayerActivity.showV726FileAutoCompress726Toggle() {
    val current = BiliClient.prefs.v726fileAutoCompress726
    BiliClient.prefs.v726fileAutoCompress726 = !current
    AppToast.show(this, "File Auto Compress726: ${if (!current) "ON" else "OFF"}")
}

// v726: Filter Auto Apply726
internal fun PlayerActivity.showV726FilterAutoApply726Toggle() {
    val current = BiliClient.prefs.v726filterAutoApply726
    BiliClient.prefs.v726filterAutoApply726 = !current
    AppToast.show(this, "Filter Auto Apply726: ${if (!current) "ON" else "OFF"}")
}

// v726: Final Auto Review726
internal fun PlayerActivity.showV726FinalAutoReview726Toggle() {
    val current = BiliClient.prefs.v726finalAutoReview726
    BiliClient.prefs.v726finalAutoReview726 = !current
    AppToast.show(this, "Final Auto Review726: ${if (!current) "ON" else "OFF"}")
}

// v726: Find Auto Match726
internal fun PlayerActivity.showV726FindAutoMatch726Toggle() {
    val current = BiliClient.prefs.v726findAutoMatch726
    BiliClient.prefs.v726findAutoMatch726 = !current
    AppToast.show(this, "Find Auto Match726: ${if (!current) "ON" else "OFF"}")
}

// v726: Fire Auto Event726
internal fun PlayerActivity.showV726FireAutoEvent726Toggle() {
    val current = BiliClient.prefs.v726fireAutoEvent726
    BiliClient.prefs.v726fireAutoEvent726 = !current
    AppToast.show(this, "Fire Auto Event726: ${if (!current) "ON" else "OFF"}")
}

// v726: Firmware Auto Update726
internal fun PlayerActivity.showV726FirmwareAutoUpdate726Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v726firmwareAutoUpdate726).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Firmware Auto Update726",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v726firmwareAutoUpdate726 = value
        AppToast.show(this, "Firmware Auto Update726: $value")
    }
}

// v726: Flag Auto Set726
internal fun PlayerActivity.showV726FlagAutoSet726Toggle() {
    val current = BiliClient.prefs.v726flagAutoSet726
    BiliClient.prefs.v726flagAutoSet726 = !current
    AppToast.show(this, "Flag Auto Set726: ${if (!current) "ON" else "OFF"}")
}

// v726: Flash Auto Mode726
internal fun PlayerActivity.showV726FlashAutoMode726Toggle() {
    val current = BiliClient.prefs.v726flashAutoMode726
    BiliClient.prefs.v726flashAutoMode726 = !current
    AppToast.show(this, "Flash Auto Mode726: ${if (!current) "ON" else "OFF"}")
}

// v726: Flat Auto Layout726
internal fun PlayerActivity.showV726FlatAutoLayout726Toggle() {
    val current = BiliClient.prefs.v726flatAutoLayout726
    BiliClient.prefs.v726flatAutoLayout726 = !current
    AppToast.show(this, "Flat Auto Layout726: ${if (!current) "ON" else "OFF"}")
}

// v726: Flip Auto Horizontal726
internal fun PlayerActivity.showV726FlipAutoHorizontal726Toggle() {
    val current = BiliClient.prefs.v726flipAutoHorizontal726
    BiliClient.prefs.v726flipAutoHorizontal726 = !current
    AppToast.show(this, "Flip Auto Horizontal726: ${if (!current) "ON" else "OFF"}")
}

// v727: Fade Auto In727
internal fun PlayerActivity.showV727FadeAutoIn727Toggle() {
    val current = BiliClient.prefs.v727fadeAutoIn727
    BiliClient.prefs.v727fadeAutoIn727 = !current
    AppToast.show(this, "Fade Auto In727: ${if (!current) "ON" else "OFF"}")
}

// v727: Fallback Auto Route727
internal fun PlayerActivity.showV727FallbackAutoRoute727Toggle() {
    val current = BiliClient.prefs.v727fallbackAutoRoute727
    BiliClient.prefs.v727fallbackAutoRoute727 = !current
    AppToast.show(this, "Fallback Auto Route727: ${if (!current) "ON" else "OFF"}")
}

// v727: Family Auto Group727
internal fun PlayerActivity.showV727FamilyAutoGroup727Toggle() {
    val current = BiliClient.prefs.v727familyAutoGroup727
    BiliClient.prefs.v727familyAutoGroup727 = !current
    AppToast.show(this, "Family Auto Group727: ${if (!current) "ON" else "OFF"}")
}

// v727: Feature Auto Toggle727
internal fun PlayerActivity.showV727FeatureAutoToggle727Toggle() {
    val current = BiliClient.prefs.v727featureAutoToggle727
    BiliClient.prefs.v727featureAutoToggle727 = !current
    AppToast.show(this, "Feature Auto Toggle727: ${if (!current) "ON" else "OFF"}")
}

// v727: Field Auto Select727
internal fun PlayerActivity.showV727FieldAutoSelect727Toggle() {
    val current = BiliClient.prefs.v727fieldAutoSelect727
    BiliClient.prefs.v727fieldAutoSelect727 = !current
    AppToast.show(this, "Field Auto Select727: ${if (!current) "ON" else "OFF"}")
}

// v727: File Auto Compress727
internal fun PlayerActivity.showV727FileAutoCompress727Toggle() {
    val current = BiliClient.prefs.v727fileAutoCompress727
    BiliClient.prefs.v727fileAutoCompress727 = !current
    AppToast.show(this, "File Auto Compress727: ${if (!current) "ON" else "OFF"}")
}

// v727: Filter Auto Apply727
internal fun PlayerActivity.showV727FilterAutoApply727Toggle() {
    val current = BiliClient.prefs.v727filterAutoApply727
    BiliClient.prefs.v727filterAutoApply727 = !current
    AppToast.show(this, "Filter Auto Apply727: ${if (!current) "ON" else "OFF"}")
}

// v727: Final Auto Review727
internal fun PlayerActivity.showV727FinalAutoReview727Toggle() {
    val current = BiliClient.prefs.v727finalAutoReview727
    BiliClient.prefs.v727finalAutoReview727 = !current
    AppToast.show(this, "Final Auto Review727: ${if (!current) "ON" else "OFF"}")
}

// v727: Find Auto Match727
internal fun PlayerActivity.showV727FindAutoMatch727Toggle() {
    val current = BiliClient.prefs.v727findAutoMatch727
    BiliClient.prefs.v727findAutoMatch727 = !current
    AppToast.show(this, "Find Auto Match727: ${if (!current) "ON" else "OFF"}")
}

// v727: Fire Auto Event727
internal fun PlayerActivity.showV727FireAutoEvent727Toggle() {
    val current = BiliClient.prefs.v727fireAutoEvent727
    BiliClient.prefs.v727fireAutoEvent727 = !current
    AppToast.show(this, "Fire Auto Event727: ${if (!current) "ON" else "OFF"}")
}

// v727: Firmware Auto Update727
internal fun PlayerActivity.showV727FirmwareAutoUpdate727Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v727firmwareAutoUpdate727).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Firmware Auto Update727",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v727firmwareAutoUpdate727 = value
        AppToast.show(this, "Firmware Auto Update727: $value")
    }
}

// v727: Flag Auto Set727
internal fun PlayerActivity.showV727FlagAutoSet727Toggle() {
    val current = BiliClient.prefs.v727flagAutoSet727
    BiliClient.prefs.v727flagAutoSet727 = !current
    AppToast.show(this, "Flag Auto Set727: ${if (!current) "ON" else "OFF"}")
}

// v727: Flash Auto Mode727
internal fun PlayerActivity.showV727FlashAutoMode727Toggle() {
    val current = BiliClient.prefs.v727flashAutoMode727
    BiliClient.prefs.v727flashAutoMode727 = !current
    AppToast.show(this, "Flash Auto Mode727: ${if (!current) "ON" else "OFF"}")
}

// v727: Flat Auto Layout727
internal fun PlayerActivity.showV727FlatAutoLayout727Toggle() {
    val current = BiliClient.prefs.v727flatAutoLayout727
    BiliClient.prefs.v727flatAutoLayout727 = !current
    AppToast.show(this, "Flat Auto Layout727: ${if (!current) "ON" else "OFF"}")
}

// v727: Flip Auto Horizontal727
internal fun PlayerActivity.showV727FlipAutoHorizontal727Toggle() {
    val current = BiliClient.prefs.v727flipAutoHorizontal727
    BiliClient.prefs.v727flipAutoHorizontal727 = !current
    AppToast.show(this, "Flip Auto Horizontal727: ${if (!current) "ON" else "OFF"}")
}

// v728: Fade Auto In728
internal fun PlayerActivity.showV728FadeAutoIn728Toggle() {
    val current = BiliClient.prefs.v728fadeAutoIn728
    BiliClient.prefs.v728fadeAutoIn728 = !current
    AppToast.show(this, "Fade Auto In728: ${if (!current) "ON" else "OFF"}")
}

// v728: Fallback Auto Route728
internal fun PlayerActivity.showV728FallbackAutoRoute728Toggle() {
    val current = BiliClient.prefs.v728fallbackAutoRoute728
    BiliClient.prefs.v728fallbackAutoRoute728 = !current
    AppToast.show(this, "Fallback Auto Route728: ${if (!current) "ON" else "OFF"}")
}

// v728: Family Auto Group728
internal fun PlayerActivity.showV728FamilyAutoGroup728Toggle() {
    val current = BiliClient.prefs.v728familyAutoGroup728
    BiliClient.prefs.v728familyAutoGroup728 = !current
    AppToast.show(this, "Family Auto Group728: ${if (!current) "ON" else "OFF"}")
}

// v728: Feature Auto Toggle728
internal fun PlayerActivity.showV728FeatureAutoToggle728Toggle() {
    val current = BiliClient.prefs.v728featureAutoToggle728
    BiliClient.prefs.v728featureAutoToggle728 = !current
    AppToast.show(this, "Feature Auto Toggle728: ${if (!current) "ON" else "OFF"}")
}

// v728: Field Auto Select728
internal fun PlayerActivity.showV728FieldAutoSelect728Toggle() {
    val current = BiliClient.prefs.v728fieldAutoSelect728
    BiliClient.prefs.v728fieldAutoSelect728 = !current
    AppToast.show(this, "Field Auto Select728: ${if (!current) "ON" else "OFF"}")
}

// v728: File Auto Compress728
internal fun PlayerActivity.showV728FileAutoCompress728Toggle() {
    val current = BiliClient.prefs.v728fileAutoCompress728
    BiliClient.prefs.v728fileAutoCompress728 = !current
    AppToast.show(this, "File Auto Compress728: ${if (!current) "ON" else "OFF"}")
}

// v728: Filter Auto Apply728
internal fun PlayerActivity.showV728FilterAutoApply728Toggle() {
    val current = BiliClient.prefs.v728filterAutoApply728
    BiliClient.prefs.v728filterAutoApply728 = !current
    AppToast.show(this, "Filter Auto Apply728: ${if (!current) "ON" else "OFF"}")
}

// v728: Final Auto Review728
internal fun PlayerActivity.showV728FinalAutoReview728Toggle() {
    val current = BiliClient.prefs.v728finalAutoReview728
    BiliClient.prefs.v728finalAutoReview728 = !current
    AppToast.show(this, "Final Auto Review728: ${if (!current) "ON" else "OFF"}")
}

// v728: Find Auto Match728
internal fun PlayerActivity.showV728FindAutoMatch728Toggle() {
    val current = BiliClient.prefs.v728findAutoMatch728
    BiliClient.prefs.v728findAutoMatch728 = !current
    AppToast.show(this, "Find Auto Match728: ${if (!current) "ON" else "OFF"}")
}

// v728: Fire Auto Event728
internal fun PlayerActivity.showV728FireAutoEvent728Toggle() {
    val current = BiliClient.prefs.v728fireAutoEvent728
    BiliClient.prefs.v728fireAutoEvent728 = !current
    AppToast.show(this, "Fire Auto Event728: ${if (!current) "ON" else "OFF"}")
}

// v728: Firmware Auto Update728
internal fun PlayerActivity.showV728FirmwareAutoUpdate728Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v728firmwareAutoUpdate728).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Firmware Auto Update728",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v728firmwareAutoUpdate728 = value
        AppToast.show(this, "Firmware Auto Update728: $value")
    }
}

// v728: Flag Auto Set728
internal fun PlayerActivity.showV728FlagAutoSet728Toggle() {
    val current = BiliClient.prefs.v728flagAutoSet728
    BiliClient.prefs.v728flagAutoSet728 = !current
    AppToast.show(this, "Flag Auto Set728: ${if (!current) "ON" else "OFF"}")
}

// v728: Flash Auto Mode728
internal fun PlayerActivity.showV728FlashAutoMode728Toggle() {
    val current = BiliClient.prefs.v728flashAutoMode728
    BiliClient.prefs.v728flashAutoMode728 = !current
    AppToast.show(this, "Flash Auto Mode728: ${if (!current) "ON" else "OFF"}")
}

// v728: Flat Auto Layout728
internal fun PlayerActivity.showV728FlatAutoLayout728Toggle() {
    val current = BiliClient.prefs.v728flatAutoLayout728
    BiliClient.prefs.v728flatAutoLayout728 = !current
    AppToast.show(this, "Flat Auto Layout728: ${if (!current) "ON" else "OFF"}")
}

// v728: Flip Auto Horizontal728
internal fun PlayerActivity.showV728FlipAutoHorizontal728Toggle() {
    val current = BiliClient.prefs.v728flipAutoHorizontal728
    BiliClient.prefs.v728flipAutoHorizontal728 = !current
    AppToast.show(this, "Flip Auto Horizontal728: ${if (!current) "ON" else "OFF"}")
}

// v729: Fade Auto In729
internal fun PlayerActivity.showV729FadeAutoIn729Toggle() {
    val current = BiliClient.prefs.v729fadeAutoIn729
    BiliClient.prefs.v729fadeAutoIn729 = !current
    AppToast.show(this, "Fade Auto In729: ${if (!current) "ON" else "OFF"}")
}

// v729: Fallback Auto Route729
internal fun PlayerActivity.showV729FallbackAutoRoute729Toggle() {
    val current = BiliClient.prefs.v729fallbackAutoRoute729
    BiliClient.prefs.v729fallbackAutoRoute729 = !current
    AppToast.show(this, "Fallback Auto Route729: ${if (!current) "ON" else "OFF"}")
}

// v729: Family Auto Group729
internal fun PlayerActivity.showV729FamilyAutoGroup729Toggle() {
    val current = BiliClient.prefs.v729familyAutoGroup729
    BiliClient.prefs.v729familyAutoGroup729 = !current
    AppToast.show(this, "Family Auto Group729: ${if (!current) "ON" else "OFF"}")
}

// v729: Feature Auto Toggle729
internal fun PlayerActivity.showV729FeatureAutoToggle729Toggle() {
    val current = BiliClient.prefs.v729featureAutoToggle729
    BiliClient.prefs.v729featureAutoToggle729 = !current
    AppToast.show(this, "Feature Auto Toggle729: ${if (!current) "ON" else "OFF"}")
}

// v729: Field Auto Select729
internal fun PlayerActivity.showV729FieldAutoSelect729Toggle() {
    val current = BiliClient.prefs.v729fieldAutoSelect729
    BiliClient.prefs.v729fieldAutoSelect729 = !current
    AppToast.show(this, "Field Auto Select729: ${if (!current) "ON" else "OFF"}")
}

// v729: File Auto Compress729
internal fun PlayerActivity.showV729FileAutoCompress729Toggle() {
    val current = BiliClient.prefs.v729fileAutoCompress729
    BiliClient.prefs.v729fileAutoCompress729 = !current
    AppToast.show(this, "File Auto Compress729: ${if (!current) "ON" else "OFF"}")
}

// v729: Filter Auto Apply729
internal fun PlayerActivity.showV729FilterAutoApply729Toggle() {
    val current = BiliClient.prefs.v729filterAutoApply729
    BiliClient.prefs.v729filterAutoApply729 = !current
    AppToast.show(this, "Filter Auto Apply729: ${if (!current) "ON" else "OFF"}")
}

// v729: Final Auto Review729
internal fun PlayerActivity.showV729FinalAutoReview729Toggle() {
    val current = BiliClient.prefs.v729finalAutoReview729
    BiliClient.prefs.v729finalAutoReview729 = !current
    AppToast.show(this, "Final Auto Review729: ${if (!current) "ON" else "OFF"}")
}

// v729: Find Auto Match729
internal fun PlayerActivity.showV729FindAutoMatch729Toggle() {
    val current = BiliClient.prefs.v729findAutoMatch729
    BiliClient.prefs.v729findAutoMatch729 = !current
    AppToast.show(this, "Find Auto Match729: ${if (!current) "ON" else "OFF"}")
}

// v729: Fire Auto Event729
internal fun PlayerActivity.showV729FireAutoEvent729Toggle() {
    val current = BiliClient.prefs.v729fireAutoEvent729
    BiliClient.prefs.v729fireAutoEvent729 = !current
    AppToast.show(this, "Fire Auto Event729: ${if (!current) "ON" else "OFF"}")
}

// v729: Firmware Auto Update729
internal fun PlayerActivity.showV729FirmwareAutoUpdate729Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v729firmwareAutoUpdate729).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Firmware Auto Update729",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v729firmwareAutoUpdate729 = value
        AppToast.show(this, "Firmware Auto Update729: $value")
    }
}

// v729: Flag Auto Set729
internal fun PlayerActivity.showV729FlagAutoSet729Toggle() {
    val current = BiliClient.prefs.v729flagAutoSet729
    BiliClient.prefs.v729flagAutoSet729 = !current
    AppToast.show(this, "Flag Auto Set729: ${if (!current) "ON" else "OFF"}")
}

// v729: Flash Auto Mode729
internal fun PlayerActivity.showV729FlashAutoMode729Toggle() {
    val current = BiliClient.prefs.v729flashAutoMode729
    BiliClient.prefs.v729flashAutoMode729 = !current
    AppToast.show(this, "Flash Auto Mode729: ${if (!current) "ON" else "OFF"}")
}

// v729: Flat Auto Layout729
internal fun PlayerActivity.showV729FlatAutoLayout729Toggle() {
    val current = BiliClient.prefs.v729flatAutoLayout729
    BiliClient.prefs.v729flatAutoLayout729 = !current
    AppToast.show(this, "Flat Auto Layout729: ${if (!current) "ON" else "OFF"}")
}

// v729: Flip Auto Horizontal729
internal fun PlayerActivity.showV729FlipAutoHorizontal729Toggle() {
    val current = BiliClient.prefs.v729flipAutoHorizontal729
    BiliClient.prefs.v729flipAutoHorizontal729 = !current
    AppToast.show(this, "Flip Auto Horizontal729: ${if (!current) "ON" else "OFF"}")
}

// v730: Fade Auto In730
internal fun PlayerActivity.showV730FadeAutoIn730Toggle() {
    val current = BiliClient.prefs.v730fadeAutoIn730
    BiliClient.prefs.v730fadeAutoIn730 = !current
    AppToast.show(this, "Fade Auto In730: ${if (!current) "ON" else "OFF"}")
}

// v730: Fallback Auto Route730
internal fun PlayerActivity.showV730FallbackAutoRoute730Toggle() {
    val current = BiliClient.prefs.v730fallbackAutoRoute730
    BiliClient.prefs.v730fallbackAutoRoute730 = !current
    AppToast.show(this, "Fallback Auto Route730: ${if (!current) "ON" else "OFF"}")
}

// v730: Family Auto Group730
internal fun PlayerActivity.showV730FamilyAutoGroup730Toggle() {
    val current = BiliClient.prefs.v730familyAutoGroup730
    BiliClient.prefs.v730familyAutoGroup730 = !current
    AppToast.show(this, "Family Auto Group730: ${if (!current) "ON" else "OFF"}")
}

// v730: Feature Auto Toggle730
internal fun PlayerActivity.showV730FeatureAutoToggle730Toggle() {
    val current = BiliClient.prefs.v730featureAutoToggle730
    BiliClient.prefs.v730featureAutoToggle730 = !current
    AppToast.show(this, "Feature Auto Toggle730: ${if (!current) "ON" else "OFF"}")
}

// v730: Field Auto Select730
internal fun PlayerActivity.showV730FieldAutoSelect730Toggle() {
    val current = BiliClient.prefs.v730fieldAutoSelect730
    BiliClient.prefs.v730fieldAutoSelect730 = !current
    AppToast.show(this, "Field Auto Select730: ${if (!current) "ON" else "OFF"}")
}

// v730: File Auto Compress730
internal fun PlayerActivity.showV730FileAutoCompress730Toggle() {
    val current = BiliClient.prefs.v730fileAutoCompress730
    BiliClient.prefs.v730fileAutoCompress730 = !current
    AppToast.show(this, "File Auto Compress730: ${if (!current) "ON" else "OFF"}")
}

// v730: Filter Auto Apply730
internal fun PlayerActivity.showV730FilterAutoApply730Toggle() {
    val current = BiliClient.prefs.v730filterAutoApply730
    BiliClient.prefs.v730filterAutoApply730 = !current
    AppToast.show(this, "Filter Auto Apply730: ${if (!current) "ON" else "OFF"}")
}

// v730: Final Auto Review730
internal fun PlayerActivity.showV730FinalAutoReview730Toggle() {
    val current = BiliClient.prefs.v730finalAutoReview730
    BiliClient.prefs.v730finalAutoReview730 = !current
    AppToast.show(this, "Final Auto Review730: ${if (!current) "ON" else "OFF"}")
}

// v730: Find Auto Match730
internal fun PlayerActivity.showV730FindAutoMatch730Toggle() {
    val current = BiliClient.prefs.v730findAutoMatch730
    BiliClient.prefs.v730findAutoMatch730 = !current
    AppToast.show(this, "Find Auto Match730: ${if (!current) "ON" else "OFF"}")
}

// v730: Fire Auto Event730
internal fun PlayerActivity.showV730FireAutoEvent730Toggle() {
    val current = BiliClient.prefs.v730fireAutoEvent730
    BiliClient.prefs.v730fireAutoEvent730 = !current
    AppToast.show(this, "Fire Auto Event730: ${if (!current) "ON" else "OFF"}")
}

// v730: Firmware Auto Update730
internal fun PlayerActivity.showV730FirmwareAutoUpdate730Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v730firmwareAutoUpdate730).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Firmware Auto Update730",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v730firmwareAutoUpdate730 = value
        AppToast.show(this, "Firmware Auto Update730: $value")
    }
}

// v730: Flag Auto Set730
internal fun PlayerActivity.showV730FlagAutoSet730Toggle() {
    val current = BiliClient.prefs.v730flagAutoSet730
    BiliClient.prefs.v730flagAutoSet730 = !current
    AppToast.show(this, "Flag Auto Set730: ${if (!current) "ON" else "OFF"}")
}

// v730: Flash Auto Mode730
internal fun PlayerActivity.showV730FlashAutoMode730Toggle() {
    val current = BiliClient.prefs.v730flashAutoMode730
    BiliClient.prefs.v730flashAutoMode730 = !current
    AppToast.show(this, "Flash Auto Mode730: ${if (!current) "ON" else "OFF"}")
}

// v730: Flat Auto Layout730
internal fun PlayerActivity.showV730FlatAutoLayout730Toggle() {
    val current = BiliClient.prefs.v730flatAutoLayout730
    BiliClient.prefs.v730flatAutoLayout730 = !current
    AppToast.show(this, "Flat Auto Layout730: ${if (!current) "ON" else "OFF"}")
}

// v730: Flip Auto Horizontal730
internal fun PlayerActivity.showV730FlipAutoHorizontal730Toggle() {
    val current = BiliClient.prefs.v730flipAutoHorizontal730
    BiliClient.prefs.v730flipAutoHorizontal730 = !current
    AppToast.show(this, "Flip Auto Horizontal730: ${if (!current) "ON" else "OFF"}")
}

