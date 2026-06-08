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

internal fun PlayerActivity.showV521RootAutoDetect521Toggle() {
    val current = BiliClient.prefs.v521rootAutoDetect521
    BiliClient.prefs.v521rootAutoDetect521 = !current
    AppToast.show(this, "Root Auto Detect521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RoundCornerEnabled521Toggle() {
    val current = BiliClient.prefs.v521roundCornerEnabled521
    BiliClient.prefs.v521roundCornerEnabled521 = !current
    AppToast.show(this, "Round Corner Enabled521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RowAutoExpand521Toggle() {
    val current = BiliClient.prefs.v521rowAutoExpand521
    BiliClient.prefs.v521rowAutoExpand521 = !current
    AppToast.show(this, "Row Auto Expand521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RuleAutoApply521Toggle() {
    val current = BiliClient.prefs.v521ruleAutoApply521
    BiliClient.prefs.v521ruleAutoApply521 = !current
    AppToast.show(this, "Rule Auto Apply521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RemoveAutoConfirm522Toggle() {
    val current = BiliClient.prefs.v522removeAutoConfirm522
    BiliClient.prefs.v522removeAutoConfirm522 = !current
    AppToast.show(this, "Remove Auto Confirm522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RenderAutoQuality522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522renderAutoQuality522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522renderAutoQuality522 = value
        AppToast.show(this, "Render Auto Quality522: $value")
    }
}

internal fun PlayerActivity.showV522RequestAutoRetry522Toggle() {
    val current = BiliClient.prefs.v522requestAutoRetry522
    BiliClient.prefs.v522requestAutoRetry522 = !current
    AppToast.show(this, "Request Auto Retry522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522ResetAutoDefault522Toggle() {
    val current = BiliClient.prefs.v522resetAutoDefault522
    BiliClient.prefs.v522resetAutoDefault522 = !current
    AppToast.show(this, "Reset Auto Default522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522ResizeAutoScale522Toggle() {
    val current = BiliClient.prefs.v522resizeAutoScale522
    BiliClient.prefs.v522resizeAutoScale522 = !current
    AppToast.show(this, "Resize Auto Scale522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522ResponseAutoCache522Toggle() {
    val current = BiliClient.prefs.v522responseAutoCache522
    BiliClient.prefs.v522responseAutoCache522 = !current
    AppToast.show(this, "Response Auto Cache522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RestoreAutoState522Toggle() {
    val current = BiliClient.prefs.v522restoreAutoState522
    BiliClient.prefs.v522restoreAutoState522 = !current
    AppToast.show(this, "Restore Auto State522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522ResultAutoSort522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522resultAutoSort522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522resultAutoSort522 = value
        AppToast.show(this, "Result Auto Sort522: $value")
    }
}

internal fun PlayerActivity.showV522ReturnToTop522Toggle() {
    val current = BiliClient.prefs.v522returnToTop522
    BiliClient.prefs.v522returnToTop522 = !current
    AppToast.show(this, "Return To Top522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RichTextEnabled522Toggle() {
    val current = BiliClient.prefs.v522richTextEnabled522
    BiliClient.prefs.v522richTextEnabled522 = !current
    AppToast.show(this, "Rich Text Enabled522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RingAutoVibrate522Toggle() {
    val current = BiliClient.prefs.v522ringAutoVibrate522
    BiliClient.prefs.v522ringAutoVibrate522 = !current
    AppToast.show(this, "Ring Auto Vibrate522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RootAutoDetect522Toggle() {
    val current = BiliClient.prefs.v522rootAutoDetect522
    BiliClient.prefs.v522rootAutoDetect522 = !current
    AppToast.show(this, "Root Auto Detect522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RoundCornerEnabled522Toggle() {
    val current = BiliClient.prefs.v522roundCornerEnabled522
    BiliClient.prefs.v522roundCornerEnabled522 = !current
    AppToast.show(this, "Round Corner Enabled522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RowAutoExpand522Toggle() {
    val current = BiliClient.prefs.v522rowAutoExpand522
    BiliClient.prefs.v522rowAutoExpand522 = !current
    AppToast.show(this, "Row Auto Expand522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV522RuleAutoApply522Toggle() {
    val current = BiliClient.prefs.v522ruleAutoApply522
    BiliClient.prefs.v522ruleAutoApply522 = !current
    AppToast.show(this, "Rule Auto Apply522: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RemoveAutoConfirm523Toggle() {
    val current = BiliClient.prefs.v523removeAutoConfirm523
    BiliClient.prefs.v523removeAutoConfirm523 = !current
    AppToast.show(this, "Remove Auto Confirm523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RenderAutoQuality523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523renderAutoQuality523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523renderAutoQuality523 = value
        AppToast.show(this, "Render Auto Quality523: $value")
    }
}

internal fun PlayerActivity.showV523RequestAutoRetry523Toggle() {
    val current = BiliClient.prefs.v523requestAutoRetry523
    BiliClient.prefs.v523requestAutoRetry523 = !current
    AppToast.show(this, "Request Auto Retry523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523ResetAutoDefault523Toggle() {
    val current = BiliClient.prefs.v523resetAutoDefault523
    BiliClient.prefs.v523resetAutoDefault523 = !current
    AppToast.show(this, "Reset Auto Default523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523ResizeAutoScale523Toggle() {
    val current = BiliClient.prefs.v523resizeAutoScale523
    BiliClient.prefs.v523resizeAutoScale523 = !current
    AppToast.show(this, "Resize Auto Scale523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523ResponseAutoCache523Toggle() {
    val current = BiliClient.prefs.v523responseAutoCache523
    BiliClient.prefs.v523responseAutoCache523 = !current
    AppToast.show(this, "Response Auto Cache523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RestoreAutoState523Toggle() {
    val current = BiliClient.prefs.v523restoreAutoState523
    BiliClient.prefs.v523restoreAutoState523 = !current
    AppToast.show(this, "Restore Auto State523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523ResultAutoSort523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523resultAutoSort523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523resultAutoSort523 = value
        AppToast.show(this, "Result Auto Sort523: $value")
    }
}

internal fun PlayerActivity.showV523ReturnToTop523Toggle() {
    val current = BiliClient.prefs.v523returnToTop523
    BiliClient.prefs.v523returnToTop523 = !current
    AppToast.show(this, "Return To Top523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RichTextEnabled523Toggle() {
    val current = BiliClient.prefs.v523richTextEnabled523
    BiliClient.prefs.v523richTextEnabled523 = !current
    AppToast.show(this, "Rich Text Enabled523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RingAutoVibrate523Toggle() {
    val current = BiliClient.prefs.v523ringAutoVibrate523
    BiliClient.prefs.v523ringAutoVibrate523 = !current
    AppToast.show(this, "Ring Auto Vibrate523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RootAutoDetect523Toggle() {
    val current = BiliClient.prefs.v523rootAutoDetect523
    BiliClient.prefs.v523rootAutoDetect523 = !current
    AppToast.show(this, "Root Auto Detect523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RoundCornerEnabled523Toggle() {
    val current = BiliClient.prefs.v523roundCornerEnabled523
    BiliClient.prefs.v523roundCornerEnabled523 = !current
    AppToast.show(this, "Round Corner Enabled523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RowAutoExpand523Toggle() {
    val current = BiliClient.prefs.v523rowAutoExpand523
    BiliClient.prefs.v523rowAutoExpand523 = !current
    AppToast.show(this, "Row Auto Expand523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV523RuleAutoApply523Toggle() {
    val current = BiliClient.prefs.v523ruleAutoApply523
    BiliClient.prefs.v523ruleAutoApply523 = !current
    AppToast.show(this, "Rule Auto Apply523: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RemoveAutoConfirm524Toggle() {
    val current = BiliClient.prefs.v524removeAutoConfirm524
    BiliClient.prefs.v524removeAutoConfirm524 = !current
    AppToast.show(this, "Remove Auto Confirm524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RenderAutoQuality524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524renderAutoQuality524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524renderAutoQuality524 = value
        AppToast.show(this, "Render Auto Quality524: $value")
    }
}

internal fun PlayerActivity.showV524RequestAutoRetry524Toggle() {
    val current = BiliClient.prefs.v524requestAutoRetry524
    BiliClient.prefs.v524requestAutoRetry524 = !current
    AppToast.show(this, "Request Auto Retry524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524ResetAutoDefault524Toggle() {
    val current = BiliClient.prefs.v524resetAutoDefault524
    BiliClient.prefs.v524resetAutoDefault524 = !current
    AppToast.show(this, "Reset Auto Default524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524ResizeAutoScale524Toggle() {
    val current = BiliClient.prefs.v524resizeAutoScale524
    BiliClient.prefs.v524resizeAutoScale524 = !current
    AppToast.show(this, "Resize Auto Scale524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524ResponseAutoCache524Toggle() {
    val current = BiliClient.prefs.v524responseAutoCache524
    BiliClient.prefs.v524responseAutoCache524 = !current
    AppToast.show(this, "Response Auto Cache524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RestoreAutoState524Toggle() {
    val current = BiliClient.prefs.v524restoreAutoState524
    BiliClient.prefs.v524restoreAutoState524 = !current
    AppToast.show(this, "Restore Auto State524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524ResultAutoSort524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524resultAutoSort524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524resultAutoSort524 = value
        AppToast.show(this, "Result Auto Sort524: $value")
    }
}

internal fun PlayerActivity.showV524ReturnToTop524Toggle() {
    val current = BiliClient.prefs.v524returnToTop524
    BiliClient.prefs.v524returnToTop524 = !current
    AppToast.show(this, "Return To Top524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RichTextEnabled524Toggle() {
    val current = BiliClient.prefs.v524richTextEnabled524
    BiliClient.prefs.v524richTextEnabled524 = !current
    AppToast.show(this, "Rich Text Enabled524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RingAutoVibrate524Toggle() {
    val current = BiliClient.prefs.v524ringAutoVibrate524
    BiliClient.prefs.v524ringAutoVibrate524 = !current
    AppToast.show(this, "Ring Auto Vibrate524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RootAutoDetect524Toggle() {
    val current = BiliClient.prefs.v524rootAutoDetect524
    BiliClient.prefs.v524rootAutoDetect524 = !current
    AppToast.show(this, "Root Auto Detect524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RoundCornerEnabled524Toggle() {
    val current = BiliClient.prefs.v524roundCornerEnabled524
    BiliClient.prefs.v524roundCornerEnabled524 = !current
    AppToast.show(this, "Round Corner Enabled524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RowAutoExpand524Toggle() {
    val current = BiliClient.prefs.v524rowAutoExpand524
    BiliClient.prefs.v524rowAutoExpand524 = !current
    AppToast.show(this, "Row Auto Expand524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV524RuleAutoApply524Toggle() {
    val current = BiliClient.prefs.v524ruleAutoApply524
    BiliClient.prefs.v524ruleAutoApply524 = !current
    AppToast.show(this, "Rule Auto Apply524: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RemoveAutoConfirm525Toggle() {
    val current = BiliClient.prefs.v525removeAutoConfirm525
    BiliClient.prefs.v525removeAutoConfirm525 = !current
    AppToast.show(this, "Remove Auto Confirm525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RenderAutoQuality525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525renderAutoQuality525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525renderAutoQuality525 = value
        AppToast.show(this, "Render Auto Quality525: $value")
    }
}

internal fun PlayerActivity.showV525RequestAutoRetry525Toggle() {
    val current = BiliClient.prefs.v525requestAutoRetry525
    BiliClient.prefs.v525requestAutoRetry525 = !current
    AppToast.show(this, "Request Auto Retry525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525ResetAutoDefault525Toggle() {
    val current = BiliClient.prefs.v525resetAutoDefault525
    BiliClient.prefs.v525resetAutoDefault525 = !current
    AppToast.show(this, "Reset Auto Default525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525ResizeAutoScale525Toggle() {
    val current = BiliClient.prefs.v525resizeAutoScale525
    BiliClient.prefs.v525resizeAutoScale525 = !current
    AppToast.show(this, "Resize Auto Scale525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525ResponseAutoCache525Toggle() {
    val current = BiliClient.prefs.v525responseAutoCache525
    BiliClient.prefs.v525responseAutoCache525 = !current
    AppToast.show(this, "Response Auto Cache525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RestoreAutoState525Toggle() {
    val current = BiliClient.prefs.v525restoreAutoState525
    BiliClient.prefs.v525restoreAutoState525 = !current
    AppToast.show(this, "Restore Auto State525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525ResultAutoSort525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525resultAutoSort525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525resultAutoSort525 = value
        AppToast.show(this, "Result Auto Sort525: $value")
    }
}

internal fun PlayerActivity.showV525ReturnToTop525Toggle() {
    val current = BiliClient.prefs.v525returnToTop525
    BiliClient.prefs.v525returnToTop525 = !current
    AppToast.show(this, "Return To Top525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RichTextEnabled525Toggle() {
    val current = BiliClient.prefs.v525richTextEnabled525
    BiliClient.prefs.v525richTextEnabled525 = !current
    AppToast.show(this, "Rich Text Enabled525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RingAutoVibrate525Toggle() {
    val current = BiliClient.prefs.v525ringAutoVibrate525
    BiliClient.prefs.v525ringAutoVibrate525 = !current
    AppToast.show(this, "Ring Auto Vibrate525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RootAutoDetect525Toggle() {
    val current = BiliClient.prefs.v525rootAutoDetect525
    BiliClient.prefs.v525rootAutoDetect525 = !current
    AppToast.show(this, "Root Auto Detect525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RoundCornerEnabled525Toggle() {
    val current = BiliClient.prefs.v525roundCornerEnabled525
    BiliClient.prefs.v525roundCornerEnabled525 = !current
    AppToast.show(this, "Round Corner Enabled525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RowAutoExpand525Toggle() {
    val current = BiliClient.prefs.v525rowAutoExpand525
    BiliClient.prefs.v525rowAutoExpand525 = !current
    AppToast.show(this, "Row Auto Expand525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV525RuleAutoApply525Toggle() {
    val current = BiliClient.prefs.v525ruleAutoApply525
    BiliClient.prefs.v525ruleAutoApply525 = !current
    AppToast.show(this, "Rule Auto Apply525: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RemoveAutoConfirm526Toggle() {
    val current = BiliClient.prefs.v526removeAutoConfirm526
    BiliClient.prefs.v526removeAutoConfirm526 = !current
    AppToast.show(this, "Remove Auto Confirm526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RenderAutoQuality526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526renderAutoQuality526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526renderAutoQuality526 = value
        AppToast.show(this, "Render Auto Quality526: $value")
    }
}

internal fun PlayerActivity.showV526RequestAutoRetry526Toggle() {
    val current = BiliClient.prefs.v526requestAutoRetry526
    BiliClient.prefs.v526requestAutoRetry526 = !current
    AppToast.show(this, "Request Auto Retry526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526ResetAutoDefault526Toggle() {
    val current = BiliClient.prefs.v526resetAutoDefault526
    BiliClient.prefs.v526resetAutoDefault526 = !current
    AppToast.show(this, "Reset Auto Default526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526ResizeAutoScale526Toggle() {
    val current = BiliClient.prefs.v526resizeAutoScale526
    BiliClient.prefs.v526resizeAutoScale526 = !current
    AppToast.show(this, "Resize Auto Scale526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526ResponseAutoCache526Toggle() {
    val current = BiliClient.prefs.v526responseAutoCache526
    BiliClient.prefs.v526responseAutoCache526 = !current
    AppToast.show(this, "Response Auto Cache526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RestoreAutoState526Toggle() {
    val current = BiliClient.prefs.v526restoreAutoState526
    BiliClient.prefs.v526restoreAutoState526 = !current
    AppToast.show(this, "Restore Auto State526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526ResultAutoSort526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526resultAutoSort526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526resultAutoSort526 = value
        AppToast.show(this, "Result Auto Sort526: $value")
    }
}

internal fun PlayerActivity.showV526ReturnToTop526Toggle() {
    val current = BiliClient.prefs.v526returnToTop526
    BiliClient.prefs.v526returnToTop526 = !current
    AppToast.show(this, "Return To Top526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RichTextEnabled526Toggle() {
    val current = BiliClient.prefs.v526richTextEnabled526
    BiliClient.prefs.v526richTextEnabled526 = !current
    AppToast.show(this, "Rich Text Enabled526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RingAutoVibrate526Toggle() {
    val current = BiliClient.prefs.v526ringAutoVibrate526
    BiliClient.prefs.v526ringAutoVibrate526 = !current
    AppToast.show(this, "Ring Auto Vibrate526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RootAutoDetect526Toggle() {
    val current = BiliClient.prefs.v526rootAutoDetect526
    BiliClient.prefs.v526rootAutoDetect526 = !current
    AppToast.show(this, "Root Auto Detect526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RoundCornerEnabled526Toggle() {
    val current = BiliClient.prefs.v526roundCornerEnabled526
    BiliClient.prefs.v526roundCornerEnabled526 = !current
    AppToast.show(this, "Round Corner Enabled526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RowAutoExpand526Toggle() {
    val current = BiliClient.prefs.v526rowAutoExpand526
    BiliClient.prefs.v526rowAutoExpand526 = !current
    AppToast.show(this, "Row Auto Expand526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV526RuleAutoApply526Toggle() {
    val current = BiliClient.prefs.v526ruleAutoApply526
    BiliClient.prefs.v526ruleAutoApply526 = !current
    AppToast.show(this, "Rule Auto Apply526: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RemoveAutoConfirm527Toggle() {
    val current = BiliClient.prefs.v527removeAutoConfirm527
    BiliClient.prefs.v527removeAutoConfirm527 = !current
    AppToast.show(this, "Remove Auto Confirm527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RenderAutoQuality527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527renderAutoQuality527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527renderAutoQuality527 = value
        AppToast.show(this, "Render Auto Quality527: $value")
    }
}

internal fun PlayerActivity.showV527RequestAutoRetry527Toggle() {
    val current = BiliClient.prefs.v527requestAutoRetry527
    BiliClient.prefs.v527requestAutoRetry527 = !current
    AppToast.show(this, "Request Auto Retry527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527ResetAutoDefault527Toggle() {
    val current = BiliClient.prefs.v527resetAutoDefault527
    BiliClient.prefs.v527resetAutoDefault527 = !current
    AppToast.show(this, "Reset Auto Default527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527ResizeAutoScale527Toggle() {
    val current = BiliClient.prefs.v527resizeAutoScale527
    BiliClient.prefs.v527resizeAutoScale527 = !current
    AppToast.show(this, "Resize Auto Scale527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527ResponseAutoCache527Toggle() {
    val current = BiliClient.prefs.v527responseAutoCache527
    BiliClient.prefs.v527responseAutoCache527 = !current
    AppToast.show(this, "Response Auto Cache527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RestoreAutoState527Toggle() {
    val current = BiliClient.prefs.v527restoreAutoState527
    BiliClient.prefs.v527restoreAutoState527 = !current
    AppToast.show(this, "Restore Auto State527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527ResultAutoSort527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527resultAutoSort527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527resultAutoSort527 = value
        AppToast.show(this, "Result Auto Sort527: $value")
    }
}

internal fun PlayerActivity.showV527ReturnToTop527Toggle() {
    val current = BiliClient.prefs.v527returnToTop527
    BiliClient.prefs.v527returnToTop527 = !current
    AppToast.show(this, "Return To Top527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RichTextEnabled527Toggle() {
    val current = BiliClient.prefs.v527richTextEnabled527
    BiliClient.prefs.v527richTextEnabled527 = !current
    AppToast.show(this, "Rich Text Enabled527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RingAutoVibrate527Toggle() {
    val current = BiliClient.prefs.v527ringAutoVibrate527
    BiliClient.prefs.v527ringAutoVibrate527 = !current
    AppToast.show(this, "Ring Auto Vibrate527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RootAutoDetect527Toggle() {
    val current = BiliClient.prefs.v527rootAutoDetect527
    BiliClient.prefs.v527rootAutoDetect527 = !current
    AppToast.show(this, "Root Auto Detect527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RoundCornerEnabled527Toggle() {
    val current = BiliClient.prefs.v527roundCornerEnabled527
    BiliClient.prefs.v527roundCornerEnabled527 = !current
    AppToast.show(this, "Round Corner Enabled527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RowAutoExpand527Toggle() {
    val current = BiliClient.prefs.v527rowAutoExpand527
    BiliClient.prefs.v527rowAutoExpand527 = !current
    AppToast.show(this, "Row Auto Expand527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV527RuleAutoApply527Toggle() {
    val current = BiliClient.prefs.v527ruleAutoApply527
    BiliClient.prefs.v527ruleAutoApply527 = !current
    AppToast.show(this, "Rule Auto Apply527: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RemoveAutoConfirm528Toggle() {
    val current = BiliClient.prefs.v528removeAutoConfirm528
    BiliClient.prefs.v528removeAutoConfirm528 = !current
    AppToast.show(this, "Remove Auto Confirm528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RenderAutoQuality528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528renderAutoQuality528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528renderAutoQuality528 = value
        AppToast.show(this, "Render Auto Quality528: $value")
    }
}

internal fun PlayerActivity.showV528RequestAutoRetry528Toggle() {
    val current = BiliClient.prefs.v528requestAutoRetry528
    BiliClient.prefs.v528requestAutoRetry528 = !current
    AppToast.show(this, "Request Auto Retry528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528ResetAutoDefault528Toggle() {
    val current = BiliClient.prefs.v528resetAutoDefault528
    BiliClient.prefs.v528resetAutoDefault528 = !current
    AppToast.show(this, "Reset Auto Default528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528ResizeAutoScale528Toggle() {
    val current = BiliClient.prefs.v528resizeAutoScale528
    BiliClient.prefs.v528resizeAutoScale528 = !current
    AppToast.show(this, "Resize Auto Scale528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528ResponseAutoCache528Toggle() {
    val current = BiliClient.prefs.v528responseAutoCache528
    BiliClient.prefs.v528responseAutoCache528 = !current
    AppToast.show(this, "Response Auto Cache528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RestoreAutoState528Toggle() {
    val current = BiliClient.prefs.v528restoreAutoState528
    BiliClient.prefs.v528restoreAutoState528 = !current
    AppToast.show(this, "Restore Auto State528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528ResultAutoSort528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528resultAutoSort528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528resultAutoSort528 = value
        AppToast.show(this, "Result Auto Sort528: $value")
    }
}

internal fun PlayerActivity.showV528ReturnToTop528Toggle() {
    val current = BiliClient.prefs.v528returnToTop528
    BiliClient.prefs.v528returnToTop528 = !current
    AppToast.show(this, "Return To Top528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RichTextEnabled528Toggle() {
    val current = BiliClient.prefs.v528richTextEnabled528
    BiliClient.prefs.v528richTextEnabled528 = !current
    AppToast.show(this, "Rich Text Enabled528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RingAutoVibrate528Toggle() {
    val current = BiliClient.prefs.v528ringAutoVibrate528
    BiliClient.prefs.v528ringAutoVibrate528 = !current
    AppToast.show(this, "Ring Auto Vibrate528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RootAutoDetect528Toggle() {
    val current = BiliClient.prefs.v528rootAutoDetect528
    BiliClient.prefs.v528rootAutoDetect528 = !current
    AppToast.show(this, "Root Auto Detect528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RoundCornerEnabled528Toggle() {
    val current = BiliClient.prefs.v528roundCornerEnabled528
    BiliClient.prefs.v528roundCornerEnabled528 = !current
    AppToast.show(this, "Round Corner Enabled528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RowAutoExpand528Toggle() {
    val current = BiliClient.prefs.v528rowAutoExpand528
    BiliClient.prefs.v528rowAutoExpand528 = !current
    AppToast.show(this, "Row Auto Expand528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV528RuleAutoApply528Toggle() {
    val current = BiliClient.prefs.v528ruleAutoApply528
    BiliClient.prefs.v528ruleAutoApply528 = !current
    AppToast.show(this, "Rule Auto Apply528: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RemoveAutoConfirm529Toggle() {
    val current = BiliClient.prefs.v529removeAutoConfirm529
    BiliClient.prefs.v529removeAutoConfirm529 = !current
    AppToast.show(this, "Remove Auto Confirm529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RenderAutoQuality529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529renderAutoQuality529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529renderAutoQuality529 = value
        AppToast.show(this, "Render Auto Quality529: $value")
    }
}

internal fun PlayerActivity.showV529RequestAutoRetry529Toggle() {
    val current = BiliClient.prefs.v529requestAutoRetry529
    BiliClient.prefs.v529requestAutoRetry529 = !current
    AppToast.show(this, "Request Auto Retry529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529ResetAutoDefault529Toggle() {
    val current = BiliClient.prefs.v529resetAutoDefault529
    BiliClient.prefs.v529resetAutoDefault529 = !current
    AppToast.show(this, "Reset Auto Default529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529ResizeAutoScale529Toggle() {
    val current = BiliClient.prefs.v529resizeAutoScale529
    BiliClient.prefs.v529resizeAutoScale529 = !current
    AppToast.show(this, "Resize Auto Scale529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529ResponseAutoCache529Toggle() {
    val current = BiliClient.prefs.v529responseAutoCache529
    BiliClient.prefs.v529responseAutoCache529 = !current
    AppToast.show(this, "Response Auto Cache529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RestoreAutoState529Toggle() {
    val current = BiliClient.prefs.v529restoreAutoState529
    BiliClient.prefs.v529restoreAutoState529 = !current
    AppToast.show(this, "Restore Auto State529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529ResultAutoSort529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529resultAutoSort529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529resultAutoSort529 = value
        AppToast.show(this, "Result Auto Sort529: $value")
    }
}

internal fun PlayerActivity.showV529ReturnToTop529Toggle() {
    val current = BiliClient.prefs.v529returnToTop529
    BiliClient.prefs.v529returnToTop529 = !current
    AppToast.show(this, "Return To Top529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RichTextEnabled529Toggle() {
    val current = BiliClient.prefs.v529richTextEnabled529
    BiliClient.prefs.v529richTextEnabled529 = !current
    AppToast.show(this, "Rich Text Enabled529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RingAutoVibrate529Toggle() {
    val current = BiliClient.prefs.v529ringAutoVibrate529
    BiliClient.prefs.v529ringAutoVibrate529 = !current
    AppToast.show(this, "Ring Auto Vibrate529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RootAutoDetect529Toggle() {
    val current = BiliClient.prefs.v529rootAutoDetect529
    BiliClient.prefs.v529rootAutoDetect529 = !current
    AppToast.show(this, "Root Auto Detect529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RoundCornerEnabled529Toggle() {
    val current = BiliClient.prefs.v529roundCornerEnabled529
    BiliClient.prefs.v529roundCornerEnabled529 = !current
    AppToast.show(this, "Round Corner Enabled529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RowAutoExpand529Toggle() {
    val current = BiliClient.prefs.v529rowAutoExpand529
    BiliClient.prefs.v529rowAutoExpand529 = !current
    AppToast.show(this, "Row Auto Expand529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV529RuleAutoApply529Toggle() {
    val current = BiliClient.prefs.v529ruleAutoApply529
    BiliClient.prefs.v529ruleAutoApply529 = !current
    AppToast.show(this, "Rule Auto Apply529: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RemoveAutoConfirm530Toggle() {
    val current = BiliClient.prefs.v530removeAutoConfirm530
    BiliClient.prefs.v530removeAutoConfirm530 = !current
    AppToast.show(this, "Remove Auto Confirm530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RenderAutoQuality530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530renderAutoQuality530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530renderAutoQuality530 = value
        AppToast.show(this, "Render Auto Quality530: $value")
    }
}

internal fun PlayerActivity.showV530RequestAutoRetry530Toggle() {
    val current = BiliClient.prefs.v530requestAutoRetry530
    BiliClient.prefs.v530requestAutoRetry530 = !current
    AppToast.show(this, "Request Auto Retry530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530ResetAutoDefault530Toggle() {
    val current = BiliClient.prefs.v530resetAutoDefault530
    BiliClient.prefs.v530resetAutoDefault530 = !current
    AppToast.show(this, "Reset Auto Default530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530ResizeAutoScale530Toggle() {
    val current = BiliClient.prefs.v530resizeAutoScale530
    BiliClient.prefs.v530resizeAutoScale530 = !current
    AppToast.show(this, "Resize Auto Scale530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530ResponseAutoCache530Toggle() {
    val current = BiliClient.prefs.v530responseAutoCache530
    BiliClient.prefs.v530responseAutoCache530 = !current
    AppToast.show(this, "Response Auto Cache530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RestoreAutoState530Toggle() {
    val current = BiliClient.prefs.v530restoreAutoState530
    BiliClient.prefs.v530restoreAutoState530 = !current
    AppToast.show(this, "Restore Auto State530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530ResultAutoSort530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530resultAutoSort530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530resultAutoSort530 = value
        AppToast.show(this, "Result Auto Sort530: $value")
    }
}

internal fun PlayerActivity.showV530ReturnToTop530Toggle() {
    val current = BiliClient.prefs.v530returnToTop530
    BiliClient.prefs.v530returnToTop530 = !current
    AppToast.show(this, "Return To Top530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RichTextEnabled530Toggle() {
    val current = BiliClient.prefs.v530richTextEnabled530
    BiliClient.prefs.v530richTextEnabled530 = !current
    AppToast.show(this, "Rich Text Enabled530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RingAutoVibrate530Toggle() {
    val current = BiliClient.prefs.v530ringAutoVibrate530
    BiliClient.prefs.v530ringAutoVibrate530 = !current
    AppToast.show(this, "Ring Auto Vibrate530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RootAutoDetect530Toggle() {
    val current = BiliClient.prefs.v530rootAutoDetect530
    BiliClient.prefs.v530rootAutoDetect530 = !current
    AppToast.show(this, "Root Auto Detect530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RoundCornerEnabled530Toggle() {
    val current = BiliClient.prefs.v530roundCornerEnabled530
    BiliClient.prefs.v530roundCornerEnabled530 = !current
    AppToast.show(this, "Round Corner Enabled530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RowAutoExpand530Toggle() {
    val current = BiliClient.prefs.v530rowAutoExpand530
    BiliClient.prefs.v530rowAutoExpand530 = !current
    AppToast.show(this, "Row Auto Expand530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV530RuleAutoApply530Toggle() {
    val current = BiliClient.prefs.v530ruleAutoApply530
    BiliClient.prefs.v530ruleAutoApply530 = !current
    AppToast.show(this, "Rule Auto Apply530: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531RunInBackground531Toggle() {
    val current = BiliClient.prefs.v531runInBackground531
    BiliClient.prefs.v531runInBackground531 = !current
    AppToast.show(this, "Run In Background531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SampleAutoCollect531Toggle() {
    val current = BiliClient.prefs.v531sampleAutoCollect531
    BiliClient.prefs.v531sampleAutoCollect531 = !current
    AppToast.show(this, "Sample Auto Collect531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SaveAutoBackup531Toggle() {
    val current = BiliClient.prefs.v531saveAutoBackup531
    BiliClient.prefs.v531saveAutoBackup531 = !current
    AppToast.show(this, "Save Auto Backup531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScaleAutoFit531Toggle() {
    val current = BiliClient.prefs.v531scaleAutoFit531
    BiliClient.prefs.v531scaleAutoFit531 = !current
    AppToast.show(this, "Scale Auto Fit531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScanAutoStart531Toggle() {
    val current = BiliClient.prefs.v531scanAutoStart531
    BiliClient.prefs.v531scanAutoStart531 = !current
    AppToast.show(this, "Scan Auto Start531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScheduleAutoRun531Toggle() {
    val current = BiliClient.prefs.v531scheduleAutoRun531
    BiliClient.prefs.v531scheduleAutoRun531 = !current
    AppToast.show(this, "Schedule Auto Run531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScoreAutoCalculate531Toggle() {
    val current = BiliClient.prefs.v531scoreAutoCalculate531
    BiliClient.prefs.v531scoreAutoCalculate531 = !current
    AppToast.show(this, "Score Auto Calculate531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScratchAutoRepair531Toggle() {
    val current = BiliClient.prefs.v531scratchAutoRepair531
    BiliClient.prefs.v531scratchAutoRepair531 = !current
    AppToast.show(this, "Scratch Auto Repair531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScriptAutoExecute531Toggle() {
    val current = BiliClient.prefs.v531scriptAutoExecute531
    BiliClient.prefs.v531scriptAutoExecute531 = !current
    AppToast.show(this, "Script Auto Execute531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531ScrollAutoSmooth531Toggle() {
    val current = BiliClient.prefs.v531scrollAutoSmooth531
    BiliClient.prefs.v531scrollAutoSmooth531 = !current
    AppToast.show(this, "Scroll Auto Smooth531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SealAutoEncrypt531Toggle() {
    val current = BiliClient.prefs.v531sealAutoEncrypt531
    BiliClient.prefs.v531sealAutoEncrypt531 = !current
    AppToast.show(this, "Seal Auto Encrypt531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SearchAutoComplete531Toggle() {
    val current = BiliClient.prefs.v531searchAutoComplete531
    BiliClient.prefs.v531searchAutoComplete531 = !current
    AppToast.show(this, "Search Auto Complete531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SectionAutoGroup531Toggle() {
    val current = BiliClient.prefs.v531sectionAutoGroup531
    BiliClient.prefs.v531sectionAutoGroup531 = !current
    AppToast.show(this, "Section Auto Group531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SeekAutoPrecision531Toggle() {
    val current = BiliClient.prefs.v531seekAutoPrecision531
    BiliClient.prefs.v531seekAutoPrecision531 = !current
    AppToast.show(this, "Seek Auto Precision531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV531SelectAutoMulti531Toggle() {
    val current = BiliClient.prefs.v531selectAutoMulti531
    BiliClient.prefs.v531selectAutoMulti531 = !current
    AppToast.show(this, "Select Auto Multi531: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532RunInBackground532Toggle() {
    val current = BiliClient.prefs.v532runInBackground532
    BiliClient.prefs.v532runInBackground532 = !current
    AppToast.show(this, "Run In Background532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SampleAutoCollect532Toggle() {
    val current = BiliClient.prefs.v532sampleAutoCollect532
    BiliClient.prefs.v532sampleAutoCollect532 = !current
    AppToast.show(this, "Sample Auto Collect532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SaveAutoBackup532Toggle() {
    val current = BiliClient.prefs.v532saveAutoBackup532
    BiliClient.prefs.v532saveAutoBackup532 = !current
    AppToast.show(this, "Save Auto Backup532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScaleAutoFit532Toggle() {
    val current = BiliClient.prefs.v532scaleAutoFit532
    BiliClient.prefs.v532scaleAutoFit532 = !current
    AppToast.show(this, "Scale Auto Fit532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScanAutoStart532Toggle() {
    val current = BiliClient.prefs.v532scanAutoStart532
    BiliClient.prefs.v532scanAutoStart532 = !current
    AppToast.show(this, "Scan Auto Start532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScheduleAutoRun532Toggle() {
    val current = BiliClient.prefs.v532scheduleAutoRun532
    BiliClient.prefs.v532scheduleAutoRun532 = !current
    AppToast.show(this, "Schedule Auto Run532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScoreAutoCalculate532Toggle() {
    val current = BiliClient.prefs.v532scoreAutoCalculate532
    BiliClient.prefs.v532scoreAutoCalculate532 = !current
    AppToast.show(this, "Score Auto Calculate532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScratchAutoRepair532Toggle() {
    val current = BiliClient.prefs.v532scratchAutoRepair532
    BiliClient.prefs.v532scratchAutoRepair532 = !current
    AppToast.show(this, "Scratch Auto Repair532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScriptAutoExecute532Toggle() {
    val current = BiliClient.prefs.v532scriptAutoExecute532
    BiliClient.prefs.v532scriptAutoExecute532 = !current
    AppToast.show(this, "Script Auto Execute532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532ScrollAutoSmooth532Toggle() {
    val current = BiliClient.prefs.v532scrollAutoSmooth532
    BiliClient.prefs.v532scrollAutoSmooth532 = !current
    AppToast.show(this, "Scroll Auto Smooth532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SealAutoEncrypt532Toggle() {
    val current = BiliClient.prefs.v532sealAutoEncrypt532
    BiliClient.prefs.v532sealAutoEncrypt532 = !current
    AppToast.show(this, "Seal Auto Encrypt532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SearchAutoComplete532Toggle() {
    val current = BiliClient.prefs.v532searchAutoComplete532
    BiliClient.prefs.v532searchAutoComplete532 = !current
    AppToast.show(this, "Search Auto Complete532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SectionAutoGroup532Toggle() {
    val current = BiliClient.prefs.v532sectionAutoGroup532
    BiliClient.prefs.v532sectionAutoGroup532 = !current
    AppToast.show(this, "Section Auto Group532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SeekAutoPrecision532Toggle() {
    val current = BiliClient.prefs.v532seekAutoPrecision532
    BiliClient.prefs.v532seekAutoPrecision532 = !current
    AppToast.show(this, "Seek Auto Precision532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV532SelectAutoMulti532Toggle() {
    val current = BiliClient.prefs.v532selectAutoMulti532
    BiliClient.prefs.v532selectAutoMulti532 = !current
    AppToast.show(this, "Select Auto Multi532: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533RunInBackground533Toggle() {
    val current = BiliClient.prefs.v533runInBackground533
    BiliClient.prefs.v533runInBackground533 = !current
    AppToast.show(this, "Run In Background533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SampleAutoCollect533Toggle() {
    val current = BiliClient.prefs.v533sampleAutoCollect533
    BiliClient.prefs.v533sampleAutoCollect533 = !current
    AppToast.show(this, "Sample Auto Collect533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SaveAutoBackup533Toggle() {
    val current = BiliClient.prefs.v533saveAutoBackup533
    BiliClient.prefs.v533saveAutoBackup533 = !current
    AppToast.show(this, "Save Auto Backup533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScaleAutoFit533Toggle() {
    val current = BiliClient.prefs.v533scaleAutoFit533
    BiliClient.prefs.v533scaleAutoFit533 = !current
    AppToast.show(this, "Scale Auto Fit533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScanAutoStart533Toggle() {
    val current = BiliClient.prefs.v533scanAutoStart533
    BiliClient.prefs.v533scanAutoStart533 = !current
    AppToast.show(this, "Scan Auto Start533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScheduleAutoRun533Toggle() {
    val current = BiliClient.prefs.v533scheduleAutoRun533
    BiliClient.prefs.v533scheduleAutoRun533 = !current
    AppToast.show(this, "Schedule Auto Run533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScoreAutoCalculate533Toggle() {
    val current = BiliClient.prefs.v533scoreAutoCalculate533
    BiliClient.prefs.v533scoreAutoCalculate533 = !current
    AppToast.show(this, "Score Auto Calculate533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScratchAutoRepair533Toggle() {
    val current = BiliClient.prefs.v533scratchAutoRepair533
    BiliClient.prefs.v533scratchAutoRepair533 = !current
    AppToast.show(this, "Scratch Auto Repair533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScriptAutoExecute533Toggle() {
    val current = BiliClient.prefs.v533scriptAutoExecute533
    BiliClient.prefs.v533scriptAutoExecute533 = !current
    AppToast.show(this, "Script Auto Execute533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533ScrollAutoSmooth533Toggle() {
    val current = BiliClient.prefs.v533scrollAutoSmooth533
    BiliClient.prefs.v533scrollAutoSmooth533 = !current
    AppToast.show(this, "Scroll Auto Smooth533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SealAutoEncrypt533Toggle() {
    val current = BiliClient.prefs.v533sealAutoEncrypt533
    BiliClient.prefs.v533sealAutoEncrypt533 = !current
    AppToast.show(this, "Seal Auto Encrypt533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SearchAutoComplete533Toggle() {
    val current = BiliClient.prefs.v533searchAutoComplete533
    BiliClient.prefs.v533searchAutoComplete533 = !current
    AppToast.show(this, "Search Auto Complete533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SectionAutoGroup533Toggle() {
    val current = BiliClient.prefs.v533sectionAutoGroup533
    BiliClient.prefs.v533sectionAutoGroup533 = !current
    AppToast.show(this, "Section Auto Group533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SeekAutoPrecision533Toggle() {
    val current = BiliClient.prefs.v533seekAutoPrecision533
    BiliClient.prefs.v533seekAutoPrecision533 = !current
    AppToast.show(this, "Seek Auto Precision533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV533SelectAutoMulti533Toggle() {
    val current = BiliClient.prefs.v533selectAutoMulti533
    BiliClient.prefs.v533selectAutoMulti533 = !current
    AppToast.show(this, "Select Auto Multi533: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534RunInBackground534Toggle() {
    val current = BiliClient.prefs.v534runInBackground534
    BiliClient.prefs.v534runInBackground534 = !current
    AppToast.show(this, "Run In Background534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SampleAutoCollect534Toggle() {
    val current = BiliClient.prefs.v534sampleAutoCollect534
    BiliClient.prefs.v534sampleAutoCollect534 = !current
    AppToast.show(this, "Sample Auto Collect534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SaveAutoBackup534Toggle() {
    val current = BiliClient.prefs.v534saveAutoBackup534
    BiliClient.prefs.v534saveAutoBackup534 = !current
    AppToast.show(this, "Save Auto Backup534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScaleAutoFit534Toggle() {
    val current = BiliClient.prefs.v534scaleAutoFit534
    BiliClient.prefs.v534scaleAutoFit534 = !current
    AppToast.show(this, "Scale Auto Fit534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScanAutoStart534Toggle() {
    val current = BiliClient.prefs.v534scanAutoStart534
    BiliClient.prefs.v534scanAutoStart534 = !current
    AppToast.show(this, "Scan Auto Start534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScheduleAutoRun534Toggle() {
    val current = BiliClient.prefs.v534scheduleAutoRun534
    BiliClient.prefs.v534scheduleAutoRun534 = !current
    AppToast.show(this, "Schedule Auto Run534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScoreAutoCalculate534Toggle() {
    val current = BiliClient.prefs.v534scoreAutoCalculate534
    BiliClient.prefs.v534scoreAutoCalculate534 = !current
    AppToast.show(this, "Score Auto Calculate534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScratchAutoRepair534Toggle() {
    val current = BiliClient.prefs.v534scratchAutoRepair534
    BiliClient.prefs.v534scratchAutoRepair534 = !current
    AppToast.show(this, "Scratch Auto Repair534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScriptAutoExecute534Toggle() {
    val current = BiliClient.prefs.v534scriptAutoExecute534
    BiliClient.prefs.v534scriptAutoExecute534 = !current
    AppToast.show(this, "Script Auto Execute534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534ScrollAutoSmooth534Toggle() {
    val current = BiliClient.prefs.v534scrollAutoSmooth534
    BiliClient.prefs.v534scrollAutoSmooth534 = !current
    AppToast.show(this, "Scroll Auto Smooth534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SealAutoEncrypt534Toggle() {
    val current = BiliClient.prefs.v534sealAutoEncrypt534
    BiliClient.prefs.v534sealAutoEncrypt534 = !current
    AppToast.show(this, "Seal Auto Encrypt534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SearchAutoComplete534Toggle() {
    val current = BiliClient.prefs.v534searchAutoComplete534
    BiliClient.prefs.v534searchAutoComplete534 = !current
    AppToast.show(this, "Search Auto Complete534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SectionAutoGroup534Toggle() {
    val current = BiliClient.prefs.v534sectionAutoGroup534
    BiliClient.prefs.v534sectionAutoGroup534 = !current
    AppToast.show(this, "Section Auto Group534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SeekAutoPrecision534Toggle() {
    val current = BiliClient.prefs.v534seekAutoPrecision534
    BiliClient.prefs.v534seekAutoPrecision534 = !current
    AppToast.show(this, "Seek Auto Precision534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV534SelectAutoMulti534Toggle() {
    val current = BiliClient.prefs.v534selectAutoMulti534
    BiliClient.prefs.v534selectAutoMulti534 = !current
    AppToast.show(this, "Select Auto Multi534: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535RunInBackground535Toggle() {
    val current = BiliClient.prefs.v535runInBackground535
    BiliClient.prefs.v535runInBackground535 = !current
    AppToast.show(this, "Run In Background535: ${if (!current) "ON" else "OFF"}")
}

