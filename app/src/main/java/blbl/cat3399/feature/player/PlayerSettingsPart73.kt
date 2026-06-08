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

// v911: Redirect Auto Url911
internal fun PlayerActivity.showV911RedirectAutoUrl911Toggle() {
    val current = BiliClient.prefs.v911redirectAutoUrl911
    BiliClient.prefs.v911redirectAutoUrl911 = !current
    AppToast.show(this, "Redirect Auto Url911: ${if (!current) "ON" else "OFF"}")
}

// v911: Reduce Auto Motion911
internal fun PlayerActivity.showV911ReduceAutoMotion911Toggle() {
    val current = BiliClient.prefs.v911reduceAutoMotion911
    BiliClient.prefs.v911reduceAutoMotion911 = !current
    AppToast.show(this, "Reduce Auto Motion911: ${if (!current) "ON" else "OFF"}")
}

// v911: Ref Auto Count911
internal fun PlayerActivity.showV911RefAutoCount911Toggle() {
    val current = BiliClient.prefs.v911refAutoCount911
    BiliClient.prefs.v911refAutoCount911 = !current
    AppToast.show(this, "Ref Auto Count911: ${if (!current) "ON" else "OFF"}")
}

// v911: Reference Auto Link911
internal fun PlayerActivity.showV911ReferenceAutoLink911Toggle() {
    val current = BiliClient.prefs.v911referenceAutoLink911
    BiliClient.prefs.v911referenceAutoLink911 = !current
    AppToast.show(this, "Reference Auto Link911: ${if (!current) "ON" else "OFF"}")
}

// v911: Refresh Auto Rate911
internal fun PlayerActivity.showV911RefreshAutoRate911Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v911refreshAutoRate911).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate911",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v911refreshAutoRate911 = value
        AppToast.show(this, "Refresh Auto Rate911: $value")
    }
}

// v911: Register Auto Callback911
internal fun PlayerActivity.showV911RegisterAutoCallback911Toggle() {
    val current = BiliClient.prefs.v911registerAutoCallback911
    BiliClient.prefs.v911registerAutoCallback911 = !current
    AppToast.show(this, "Register Auto Callback911: ${if (!current) "ON" else "OFF"}")
}

// v911: Regular Auto Expression911
internal fun PlayerActivity.showV911RegularAutoExpression911Toggle() {
    val current = BiliClient.prefs.v911regularAutoExpression911
    BiliClient.prefs.v911regularAutoExpression911 = !current
    AppToast.show(this, "Regular Auto Expression911: ${if (!current) "ON" else "OFF"}")
}

// v911: Reject Auto Block911
internal fun PlayerActivity.showV911RejectAutoBlock911Toggle() {
    val current = BiliClient.prefs.v911rejectAutoBlock911
    BiliClient.prefs.v911rejectAutoBlock911 = !current
    AppToast.show(this, "Reject Auto Block911: ${if (!current) "ON" else "OFF"}")
}

// v911: Relate Auto Suggest911
internal fun PlayerActivity.showV911RelateAutoSuggest911Toggle() {
    val current = BiliClient.prefs.v911relateAutoSuggest911
    BiliClient.prefs.v911relateAutoSuggest911 = !current
    AppToast.show(this, "Relate Auto Suggest911: ${if (!current) "ON" else "OFF"}")
}

// v911: Release Auto Lock911
internal fun PlayerActivity.showV911ReleaseAutoLock911Toggle() {
    val current = BiliClient.prefs.v911releaseAutoLock911
    BiliClient.prefs.v911releaseAutoLock911 = !current
    AppToast.show(this, "Release Auto Lock911: ${if (!current) "ON" else "OFF"}")
}

// v911: Remote Auto Cast911
internal fun PlayerActivity.showV911RemoteAutoCast911Toggle() {
    val current = BiliClient.prefs.v911remoteAutoCast911
    BiliClient.prefs.v911remoteAutoCast911 = !current
    AppToast.show(this, "Remote Auto Cast911: ${if (!current) "ON" else "OFF"}")
}

// v911: Remove Auto Clean911
internal fun PlayerActivity.showV911RemoveAutoClean911Toggle() {
    val current = BiliClient.prefs.v911removeAutoClean911
    BiliClient.prefs.v911removeAutoClean911 = !current
    AppToast.show(this, "Remove Auto Clean911: ${if (!current) "ON" else "OFF"}")
}

// v911: Rename Auto Label911
internal fun PlayerActivity.showV911RenameAutoLabel911Toggle() {
    val current = BiliClient.prefs.v911renameAutoLabel911
    BiliClient.prefs.v911renameAutoLabel911 = !current
    AppToast.show(this, "Rename Auto Label911: ${if (!current) "ON" else "OFF"}")
}

// v911: Render Auto Frame911
internal fun PlayerActivity.showV911RenderAutoFrame911Toggle() {
    val current = BiliClient.prefs.v911renderAutoFrame911
    BiliClient.prefs.v911renderAutoFrame911 = !current
    AppToast.show(this, "Render Auto Frame911: ${if (!current) "ON" else "OFF"}")
}

// v911: Repeat Auto Loop911
internal fun PlayerActivity.showV911RepeatAutoLoop911Toggle() {
    val current = BiliClient.prefs.v911repeatAutoLoop911
    BiliClient.prefs.v911repeatAutoLoop911 = !current
    AppToast.show(this, "Repeat Auto Loop911: ${if (!current) "ON" else "OFF"}")
}

// v912: Redirect Auto Url912
internal fun PlayerActivity.showV912RedirectAutoUrl912Toggle() {
    val current = BiliClient.prefs.v912redirectAutoUrl912
    BiliClient.prefs.v912redirectAutoUrl912 = !current
    AppToast.show(this, "Redirect Auto Url912: ${if (!current) "ON" else "OFF"}")
}

// v912: Reduce Auto Motion912
internal fun PlayerActivity.showV912ReduceAutoMotion912Toggle() {
    val current = BiliClient.prefs.v912reduceAutoMotion912
    BiliClient.prefs.v912reduceAutoMotion912 = !current
    AppToast.show(this, "Reduce Auto Motion912: ${if (!current) "ON" else "OFF"}")
}

// v912: Ref Auto Count912
internal fun PlayerActivity.showV912RefAutoCount912Toggle() {
    val current = BiliClient.prefs.v912refAutoCount912
    BiliClient.prefs.v912refAutoCount912 = !current
    AppToast.show(this, "Ref Auto Count912: ${if (!current) "ON" else "OFF"}")
}

// v912: Reference Auto Link912
internal fun PlayerActivity.showV912ReferenceAutoLink912Toggle() {
    val current = BiliClient.prefs.v912referenceAutoLink912
    BiliClient.prefs.v912referenceAutoLink912 = !current
    AppToast.show(this, "Reference Auto Link912: ${if (!current) "ON" else "OFF"}")
}

// v912: Refresh Auto Rate912
internal fun PlayerActivity.showV912RefreshAutoRate912Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v912refreshAutoRate912).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate912",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v912refreshAutoRate912 = value
        AppToast.show(this, "Refresh Auto Rate912: $value")
    }
}

// v912: Register Auto Callback912
internal fun PlayerActivity.showV912RegisterAutoCallback912Toggle() {
    val current = BiliClient.prefs.v912registerAutoCallback912
    BiliClient.prefs.v912registerAutoCallback912 = !current
    AppToast.show(this, "Register Auto Callback912: ${if (!current) "ON" else "OFF"}")
}

// v912: Regular Auto Expression912
internal fun PlayerActivity.showV912RegularAutoExpression912Toggle() {
    val current = BiliClient.prefs.v912regularAutoExpression912
    BiliClient.prefs.v912regularAutoExpression912 = !current
    AppToast.show(this, "Regular Auto Expression912: ${if (!current) "ON" else "OFF"}")
}

// v912: Reject Auto Block912
internal fun PlayerActivity.showV912RejectAutoBlock912Toggle() {
    val current = BiliClient.prefs.v912rejectAutoBlock912
    BiliClient.prefs.v912rejectAutoBlock912 = !current
    AppToast.show(this, "Reject Auto Block912: ${if (!current) "ON" else "OFF"}")
}

// v912: Relate Auto Suggest912
internal fun PlayerActivity.showV912RelateAutoSuggest912Toggle() {
    val current = BiliClient.prefs.v912relateAutoSuggest912
    BiliClient.prefs.v912relateAutoSuggest912 = !current
    AppToast.show(this, "Relate Auto Suggest912: ${if (!current) "ON" else "OFF"}")
}

// v912: Release Auto Lock912
internal fun PlayerActivity.showV912ReleaseAutoLock912Toggle() {
    val current = BiliClient.prefs.v912releaseAutoLock912
    BiliClient.prefs.v912releaseAutoLock912 = !current
    AppToast.show(this, "Release Auto Lock912: ${if (!current) "ON" else "OFF"}")
}

// v912: Remote Auto Cast912
internal fun PlayerActivity.showV912RemoteAutoCast912Toggle() {
    val current = BiliClient.prefs.v912remoteAutoCast912
    BiliClient.prefs.v912remoteAutoCast912 = !current
    AppToast.show(this, "Remote Auto Cast912: ${if (!current) "ON" else "OFF"}")
}

// v912: Remove Auto Clean912
internal fun PlayerActivity.showV912RemoveAutoClean912Toggle() {
    val current = BiliClient.prefs.v912removeAutoClean912
    BiliClient.prefs.v912removeAutoClean912 = !current
    AppToast.show(this, "Remove Auto Clean912: ${if (!current) "ON" else "OFF"}")
}

// v912: Rename Auto Label912
internal fun PlayerActivity.showV912RenameAutoLabel912Toggle() {
    val current = BiliClient.prefs.v912renameAutoLabel912
    BiliClient.prefs.v912renameAutoLabel912 = !current
    AppToast.show(this, "Rename Auto Label912: ${if (!current) "ON" else "OFF"}")
}

// v912: Render Auto Frame912
internal fun PlayerActivity.showV912RenderAutoFrame912Toggle() {
    val current = BiliClient.prefs.v912renderAutoFrame912
    BiliClient.prefs.v912renderAutoFrame912 = !current
    AppToast.show(this, "Render Auto Frame912: ${if (!current) "ON" else "OFF"}")
}

// v912: Repeat Auto Loop912
internal fun PlayerActivity.showV912RepeatAutoLoop912Toggle() {
    val current = BiliClient.prefs.v912repeatAutoLoop912
    BiliClient.prefs.v912repeatAutoLoop912 = !current
    AppToast.show(this, "Repeat Auto Loop912: ${if (!current) "ON" else "OFF"}")
}

// v913: Redirect Auto Url913
internal fun PlayerActivity.showV913RedirectAutoUrl913Toggle() {
    val current = BiliClient.prefs.v913redirectAutoUrl913
    BiliClient.prefs.v913redirectAutoUrl913 = !current
    AppToast.show(this, "Redirect Auto Url913: ${if (!current) "ON" else "OFF"}")
}

// v913: Reduce Auto Motion913
internal fun PlayerActivity.showV913ReduceAutoMotion913Toggle() {
    val current = BiliClient.prefs.v913reduceAutoMotion913
    BiliClient.prefs.v913reduceAutoMotion913 = !current
    AppToast.show(this, "Reduce Auto Motion913: ${if (!current) "ON" else "OFF"}")
}

// v913: Ref Auto Count913
internal fun PlayerActivity.showV913RefAutoCount913Toggle() {
    val current = BiliClient.prefs.v913refAutoCount913
    BiliClient.prefs.v913refAutoCount913 = !current
    AppToast.show(this, "Ref Auto Count913: ${if (!current) "ON" else "OFF"}")
}

// v913: Reference Auto Link913
internal fun PlayerActivity.showV913ReferenceAutoLink913Toggle() {
    val current = BiliClient.prefs.v913referenceAutoLink913
    BiliClient.prefs.v913referenceAutoLink913 = !current
    AppToast.show(this, "Reference Auto Link913: ${if (!current) "ON" else "OFF"}")
}

// v913: Refresh Auto Rate913
internal fun PlayerActivity.showV913RefreshAutoRate913Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v913refreshAutoRate913).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate913",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v913refreshAutoRate913 = value
        AppToast.show(this, "Refresh Auto Rate913: $value")
    }
}

// v913: Register Auto Callback913
internal fun PlayerActivity.showV913RegisterAutoCallback913Toggle() {
    val current = BiliClient.prefs.v913registerAutoCallback913
    BiliClient.prefs.v913registerAutoCallback913 = !current
    AppToast.show(this, "Register Auto Callback913: ${if (!current) "ON" else "OFF"}")
}

// v913: Regular Auto Expression913
internal fun PlayerActivity.showV913RegularAutoExpression913Toggle() {
    val current = BiliClient.prefs.v913regularAutoExpression913
    BiliClient.prefs.v913regularAutoExpression913 = !current
    AppToast.show(this, "Regular Auto Expression913: ${if (!current) "ON" else "OFF"}")
}

// v913: Reject Auto Block913
internal fun PlayerActivity.showV913RejectAutoBlock913Toggle() {
    val current = BiliClient.prefs.v913rejectAutoBlock913
    BiliClient.prefs.v913rejectAutoBlock913 = !current
    AppToast.show(this, "Reject Auto Block913: ${if (!current) "ON" else "OFF"}")
}

// v913: Relate Auto Suggest913
internal fun PlayerActivity.showV913RelateAutoSuggest913Toggle() {
    val current = BiliClient.prefs.v913relateAutoSuggest913
    BiliClient.prefs.v913relateAutoSuggest913 = !current
    AppToast.show(this, "Relate Auto Suggest913: ${if (!current) "ON" else "OFF"}")
}

// v913: Release Auto Lock913
internal fun PlayerActivity.showV913ReleaseAutoLock913Toggle() {
    val current = BiliClient.prefs.v913releaseAutoLock913
    BiliClient.prefs.v913releaseAutoLock913 = !current
    AppToast.show(this, "Release Auto Lock913: ${if (!current) "ON" else "OFF"}")
}

// v913: Remote Auto Cast913
internal fun PlayerActivity.showV913RemoteAutoCast913Toggle() {
    val current = BiliClient.prefs.v913remoteAutoCast913
    BiliClient.prefs.v913remoteAutoCast913 = !current
    AppToast.show(this, "Remote Auto Cast913: ${if (!current) "ON" else "OFF"}")
}

// v913: Remove Auto Clean913
internal fun PlayerActivity.showV913RemoveAutoClean913Toggle() {
    val current = BiliClient.prefs.v913removeAutoClean913
    BiliClient.prefs.v913removeAutoClean913 = !current
    AppToast.show(this, "Remove Auto Clean913: ${if (!current) "ON" else "OFF"}")
}

// v913: Rename Auto Label913
internal fun PlayerActivity.showV913RenameAutoLabel913Toggle() {
    val current = BiliClient.prefs.v913renameAutoLabel913
    BiliClient.prefs.v913renameAutoLabel913 = !current
    AppToast.show(this, "Rename Auto Label913: ${if (!current) "ON" else "OFF"}")
}

// v913: Render Auto Frame913
internal fun PlayerActivity.showV913RenderAutoFrame913Toggle() {
    val current = BiliClient.prefs.v913renderAutoFrame913
    BiliClient.prefs.v913renderAutoFrame913 = !current
    AppToast.show(this, "Render Auto Frame913: ${if (!current) "ON" else "OFF"}")
}

// v913: Repeat Auto Loop913
internal fun PlayerActivity.showV913RepeatAutoLoop913Toggle() {
    val current = BiliClient.prefs.v913repeatAutoLoop913
    BiliClient.prefs.v913repeatAutoLoop913 = !current
    AppToast.show(this, "Repeat Auto Loop913: ${if (!current) "ON" else "OFF"}")
}

// v914: Redirect Auto Url914
internal fun PlayerActivity.showV914RedirectAutoUrl914Toggle() {
    val current = BiliClient.prefs.v914redirectAutoUrl914
    BiliClient.prefs.v914redirectAutoUrl914 = !current
    AppToast.show(this, "Redirect Auto Url914: ${if (!current) "ON" else "OFF"}")
}

// v914: Reduce Auto Motion914
internal fun PlayerActivity.showV914ReduceAutoMotion914Toggle() {
    val current = BiliClient.prefs.v914reduceAutoMotion914
    BiliClient.prefs.v914reduceAutoMotion914 = !current
    AppToast.show(this, "Reduce Auto Motion914: ${if (!current) "ON" else "OFF"}")
}

// v914: Ref Auto Count914
internal fun PlayerActivity.showV914RefAutoCount914Toggle() {
    val current = BiliClient.prefs.v914refAutoCount914
    BiliClient.prefs.v914refAutoCount914 = !current
    AppToast.show(this, "Ref Auto Count914: ${if (!current) "ON" else "OFF"}")
}

// v914: Reference Auto Link914
internal fun PlayerActivity.showV914ReferenceAutoLink914Toggle() {
    val current = BiliClient.prefs.v914referenceAutoLink914
    BiliClient.prefs.v914referenceAutoLink914 = !current
    AppToast.show(this, "Reference Auto Link914: ${if (!current) "ON" else "OFF"}")
}

// v914: Refresh Auto Rate914
internal fun PlayerActivity.showV914RefreshAutoRate914Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v914refreshAutoRate914).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate914",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v914refreshAutoRate914 = value
        AppToast.show(this, "Refresh Auto Rate914: $value")
    }
}

// v914: Register Auto Callback914
internal fun PlayerActivity.showV914RegisterAutoCallback914Toggle() {
    val current = BiliClient.prefs.v914registerAutoCallback914
    BiliClient.prefs.v914registerAutoCallback914 = !current
    AppToast.show(this, "Register Auto Callback914: ${if (!current) "ON" else "OFF"}")
}

// v914: Regular Auto Expression914
internal fun PlayerActivity.showV914RegularAutoExpression914Toggle() {
    val current = BiliClient.prefs.v914regularAutoExpression914
    BiliClient.prefs.v914regularAutoExpression914 = !current
    AppToast.show(this, "Regular Auto Expression914: ${if (!current) "ON" else "OFF"}")
}

// v914: Reject Auto Block914
internal fun PlayerActivity.showV914RejectAutoBlock914Toggle() {
    val current = BiliClient.prefs.v914rejectAutoBlock914
    BiliClient.prefs.v914rejectAutoBlock914 = !current
    AppToast.show(this, "Reject Auto Block914: ${if (!current) "ON" else "OFF"}")
}

// v914: Relate Auto Suggest914
internal fun PlayerActivity.showV914RelateAutoSuggest914Toggle() {
    val current = BiliClient.prefs.v914relateAutoSuggest914
    BiliClient.prefs.v914relateAutoSuggest914 = !current
    AppToast.show(this, "Relate Auto Suggest914: ${if (!current) "ON" else "OFF"}")
}

// v914: Release Auto Lock914
internal fun PlayerActivity.showV914ReleaseAutoLock914Toggle() {
    val current = BiliClient.prefs.v914releaseAutoLock914
    BiliClient.prefs.v914releaseAutoLock914 = !current
    AppToast.show(this, "Release Auto Lock914: ${if (!current) "ON" else "OFF"}")
}

// v914: Remote Auto Cast914
internal fun PlayerActivity.showV914RemoteAutoCast914Toggle() {
    val current = BiliClient.prefs.v914remoteAutoCast914
    BiliClient.prefs.v914remoteAutoCast914 = !current
    AppToast.show(this, "Remote Auto Cast914: ${if (!current) "ON" else "OFF"}")
}

// v914: Remove Auto Clean914
internal fun PlayerActivity.showV914RemoveAutoClean914Toggle() {
    val current = BiliClient.prefs.v914removeAutoClean914
    BiliClient.prefs.v914removeAutoClean914 = !current
    AppToast.show(this, "Remove Auto Clean914: ${if (!current) "ON" else "OFF"}")
}

// v914: Rename Auto Label914
internal fun PlayerActivity.showV914RenameAutoLabel914Toggle() {
    val current = BiliClient.prefs.v914renameAutoLabel914
    BiliClient.prefs.v914renameAutoLabel914 = !current
    AppToast.show(this, "Rename Auto Label914: ${if (!current) "ON" else "OFF"}")
}

// v914: Render Auto Frame914
internal fun PlayerActivity.showV914RenderAutoFrame914Toggle() {
    val current = BiliClient.prefs.v914renderAutoFrame914
    BiliClient.prefs.v914renderAutoFrame914 = !current
    AppToast.show(this, "Render Auto Frame914: ${if (!current) "ON" else "OFF"}")
}

// v914: Repeat Auto Loop914
internal fun PlayerActivity.showV914RepeatAutoLoop914Toggle() {
    val current = BiliClient.prefs.v914repeatAutoLoop914
    BiliClient.prefs.v914repeatAutoLoop914 = !current
    AppToast.show(this, "Repeat Auto Loop914: ${if (!current) "ON" else "OFF"}")
}

// v915: Redirect Auto Url915
internal fun PlayerActivity.showV915RedirectAutoUrl915Toggle() {
    val current = BiliClient.prefs.v915redirectAutoUrl915
    BiliClient.prefs.v915redirectAutoUrl915 = !current
    AppToast.show(this, "Redirect Auto Url915: ${if (!current) "ON" else "OFF"}")
}

// v915: Reduce Auto Motion915
internal fun PlayerActivity.showV915ReduceAutoMotion915Toggle() {
    val current = BiliClient.prefs.v915reduceAutoMotion915
    BiliClient.prefs.v915reduceAutoMotion915 = !current
    AppToast.show(this, "Reduce Auto Motion915: ${if (!current) "ON" else "OFF"}")
}

// v915: Ref Auto Count915
internal fun PlayerActivity.showV915RefAutoCount915Toggle() {
    val current = BiliClient.prefs.v915refAutoCount915
    BiliClient.prefs.v915refAutoCount915 = !current
    AppToast.show(this, "Ref Auto Count915: ${if (!current) "ON" else "OFF"}")
}

// v915: Reference Auto Link915
internal fun PlayerActivity.showV915ReferenceAutoLink915Toggle() {
    val current = BiliClient.prefs.v915referenceAutoLink915
    BiliClient.prefs.v915referenceAutoLink915 = !current
    AppToast.show(this, "Reference Auto Link915: ${if (!current) "ON" else "OFF"}")
}

// v915: Refresh Auto Rate915
internal fun PlayerActivity.showV915RefreshAutoRate915Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v915refreshAutoRate915).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate915",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v915refreshAutoRate915 = value
        AppToast.show(this, "Refresh Auto Rate915: $value")
    }
}

// v915: Register Auto Callback915
internal fun PlayerActivity.showV915RegisterAutoCallback915Toggle() {
    val current = BiliClient.prefs.v915registerAutoCallback915
    BiliClient.prefs.v915registerAutoCallback915 = !current
    AppToast.show(this, "Register Auto Callback915: ${if (!current) "ON" else "OFF"}")
}

// v915: Regular Auto Expression915
internal fun PlayerActivity.showV915RegularAutoExpression915Toggle() {
    val current = BiliClient.prefs.v915regularAutoExpression915
    BiliClient.prefs.v915regularAutoExpression915 = !current
    AppToast.show(this, "Regular Auto Expression915: ${if (!current) "ON" else "OFF"}")
}

// v915: Reject Auto Block915
internal fun PlayerActivity.showV915RejectAutoBlock915Toggle() {
    val current = BiliClient.prefs.v915rejectAutoBlock915
    BiliClient.prefs.v915rejectAutoBlock915 = !current
    AppToast.show(this, "Reject Auto Block915: ${if (!current) "ON" else "OFF"}")
}

// v915: Relate Auto Suggest915
internal fun PlayerActivity.showV915RelateAutoSuggest915Toggle() {
    val current = BiliClient.prefs.v915relateAutoSuggest915
    BiliClient.prefs.v915relateAutoSuggest915 = !current
    AppToast.show(this, "Relate Auto Suggest915: ${if (!current) "ON" else "OFF"}")
}

// v915: Release Auto Lock915
internal fun PlayerActivity.showV915ReleaseAutoLock915Toggle() {
    val current = BiliClient.prefs.v915releaseAutoLock915
    BiliClient.prefs.v915releaseAutoLock915 = !current
    AppToast.show(this, "Release Auto Lock915: ${if (!current) "ON" else "OFF"}")
}

// v915: Remote Auto Cast915
internal fun PlayerActivity.showV915RemoteAutoCast915Toggle() {
    val current = BiliClient.prefs.v915remoteAutoCast915
    BiliClient.prefs.v915remoteAutoCast915 = !current
    AppToast.show(this, "Remote Auto Cast915: ${if (!current) "ON" else "OFF"}")
}

// v915: Remove Auto Clean915
internal fun PlayerActivity.showV915RemoveAutoClean915Toggle() {
    val current = BiliClient.prefs.v915removeAutoClean915
    BiliClient.prefs.v915removeAutoClean915 = !current
    AppToast.show(this, "Remove Auto Clean915: ${if (!current) "ON" else "OFF"}")
}

// v915: Rename Auto Label915
internal fun PlayerActivity.showV915RenameAutoLabel915Toggle() {
    val current = BiliClient.prefs.v915renameAutoLabel915
    BiliClient.prefs.v915renameAutoLabel915 = !current
    AppToast.show(this, "Rename Auto Label915: ${if (!current) "ON" else "OFF"}")
}

// v915: Render Auto Frame915
internal fun PlayerActivity.showV915RenderAutoFrame915Toggle() {
    val current = BiliClient.prefs.v915renderAutoFrame915
    BiliClient.prefs.v915renderAutoFrame915 = !current
    AppToast.show(this, "Render Auto Frame915: ${if (!current) "ON" else "OFF"}")
}

// v915: Repeat Auto Loop915
internal fun PlayerActivity.showV915RepeatAutoLoop915Toggle() {
    val current = BiliClient.prefs.v915repeatAutoLoop915
    BiliClient.prefs.v915repeatAutoLoop915 = !current
    AppToast.show(this, "Repeat Auto Loop915: ${if (!current) "ON" else "OFF"}")
}

// v916: Redirect Auto Url916
internal fun PlayerActivity.showV916RedirectAutoUrl916Toggle() {
    val current = BiliClient.prefs.v916redirectAutoUrl916
    BiliClient.prefs.v916redirectAutoUrl916 = !current
    AppToast.show(this, "Redirect Auto Url916: ${if (!current) "ON" else "OFF"}")
}

// v916: Reduce Auto Motion916
internal fun PlayerActivity.showV916ReduceAutoMotion916Toggle() {
    val current = BiliClient.prefs.v916reduceAutoMotion916
    BiliClient.prefs.v916reduceAutoMotion916 = !current
    AppToast.show(this, "Reduce Auto Motion916: ${if (!current) "ON" else "OFF"}")
}

// v916: Ref Auto Count916
internal fun PlayerActivity.showV916RefAutoCount916Toggle() {
    val current = BiliClient.prefs.v916refAutoCount916
    BiliClient.prefs.v916refAutoCount916 = !current
    AppToast.show(this, "Ref Auto Count916: ${if (!current) "ON" else "OFF"}")
}

// v916: Reference Auto Link916
internal fun PlayerActivity.showV916ReferenceAutoLink916Toggle() {
    val current = BiliClient.prefs.v916referenceAutoLink916
    BiliClient.prefs.v916referenceAutoLink916 = !current
    AppToast.show(this, "Reference Auto Link916: ${if (!current) "ON" else "OFF"}")
}

// v916: Refresh Auto Rate916
internal fun PlayerActivity.showV916RefreshAutoRate916Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v916refreshAutoRate916).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate916",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v916refreshAutoRate916 = value
        AppToast.show(this, "Refresh Auto Rate916: $value")
    }
}

// v916: Register Auto Callback916
internal fun PlayerActivity.showV916RegisterAutoCallback916Toggle() {
    val current = BiliClient.prefs.v916registerAutoCallback916
    BiliClient.prefs.v916registerAutoCallback916 = !current
    AppToast.show(this, "Register Auto Callback916: ${if (!current) "ON" else "OFF"}")
}

// v916: Regular Auto Expression916
internal fun PlayerActivity.showV916RegularAutoExpression916Toggle() {
    val current = BiliClient.prefs.v916regularAutoExpression916
    BiliClient.prefs.v916regularAutoExpression916 = !current
    AppToast.show(this, "Regular Auto Expression916: ${if (!current) "ON" else "OFF"}")
}

// v916: Reject Auto Block916
internal fun PlayerActivity.showV916RejectAutoBlock916Toggle() {
    val current = BiliClient.prefs.v916rejectAutoBlock916
    BiliClient.prefs.v916rejectAutoBlock916 = !current
    AppToast.show(this, "Reject Auto Block916: ${if (!current) "ON" else "OFF"}")
}

// v916: Relate Auto Suggest916
internal fun PlayerActivity.showV916RelateAutoSuggest916Toggle() {
    val current = BiliClient.prefs.v916relateAutoSuggest916
    BiliClient.prefs.v916relateAutoSuggest916 = !current
    AppToast.show(this, "Relate Auto Suggest916: ${if (!current) "ON" else "OFF"}")
}

// v916: Release Auto Lock916
internal fun PlayerActivity.showV916ReleaseAutoLock916Toggle() {
    val current = BiliClient.prefs.v916releaseAutoLock916
    BiliClient.prefs.v916releaseAutoLock916 = !current
    AppToast.show(this, "Release Auto Lock916: ${if (!current) "ON" else "OFF"}")
}

// v916: Remote Auto Cast916
internal fun PlayerActivity.showV916RemoteAutoCast916Toggle() {
    val current = BiliClient.prefs.v916remoteAutoCast916
    BiliClient.prefs.v916remoteAutoCast916 = !current
    AppToast.show(this, "Remote Auto Cast916: ${if (!current) "ON" else "OFF"}")
}

// v916: Remove Auto Clean916
internal fun PlayerActivity.showV916RemoveAutoClean916Toggle() {
    val current = BiliClient.prefs.v916removeAutoClean916
    BiliClient.prefs.v916removeAutoClean916 = !current
    AppToast.show(this, "Remove Auto Clean916: ${if (!current) "ON" else "OFF"}")
}

// v916: Rename Auto Label916
internal fun PlayerActivity.showV916RenameAutoLabel916Toggle() {
    val current = BiliClient.prefs.v916renameAutoLabel916
    BiliClient.prefs.v916renameAutoLabel916 = !current
    AppToast.show(this, "Rename Auto Label916: ${if (!current) "ON" else "OFF"}")
}

// v916: Render Auto Frame916
internal fun PlayerActivity.showV916RenderAutoFrame916Toggle() {
    val current = BiliClient.prefs.v916renderAutoFrame916
    BiliClient.prefs.v916renderAutoFrame916 = !current
    AppToast.show(this, "Render Auto Frame916: ${if (!current) "ON" else "OFF"}")
}

// v916: Repeat Auto Loop916
internal fun PlayerActivity.showV916RepeatAutoLoop916Toggle() {
    val current = BiliClient.prefs.v916repeatAutoLoop916
    BiliClient.prefs.v916repeatAutoLoop916 = !current
    AppToast.show(this, "Repeat Auto Loop916: ${if (!current) "ON" else "OFF"}")
}

// v917: Redirect Auto Url917
internal fun PlayerActivity.showV917RedirectAutoUrl917Toggle() {
    val current = BiliClient.prefs.v917redirectAutoUrl917
    BiliClient.prefs.v917redirectAutoUrl917 = !current
    AppToast.show(this, "Redirect Auto Url917: ${if (!current) "ON" else "OFF"}")
}

// v917: Reduce Auto Motion917
internal fun PlayerActivity.showV917ReduceAutoMotion917Toggle() {
    val current = BiliClient.prefs.v917reduceAutoMotion917
    BiliClient.prefs.v917reduceAutoMotion917 = !current
    AppToast.show(this, "Reduce Auto Motion917: ${if (!current) "ON" else "OFF"}")
}

// v917: Ref Auto Count917
internal fun PlayerActivity.showV917RefAutoCount917Toggle() {
    val current = BiliClient.prefs.v917refAutoCount917
    BiliClient.prefs.v917refAutoCount917 = !current
    AppToast.show(this, "Ref Auto Count917: ${if (!current) "ON" else "OFF"}")
}

// v917: Reference Auto Link917
internal fun PlayerActivity.showV917ReferenceAutoLink917Toggle() {
    val current = BiliClient.prefs.v917referenceAutoLink917
    BiliClient.prefs.v917referenceAutoLink917 = !current
    AppToast.show(this, "Reference Auto Link917: ${if (!current) "ON" else "OFF"}")
}

// v917: Refresh Auto Rate917
internal fun PlayerActivity.showV917RefreshAutoRate917Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v917refreshAutoRate917).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate917",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v917refreshAutoRate917 = value
        AppToast.show(this, "Refresh Auto Rate917: $value")
    }
}

// v917: Register Auto Callback917
internal fun PlayerActivity.showV917RegisterAutoCallback917Toggle() {
    val current = BiliClient.prefs.v917registerAutoCallback917
    BiliClient.prefs.v917registerAutoCallback917 = !current
    AppToast.show(this, "Register Auto Callback917: ${if (!current) "ON" else "OFF"}")
}

// v917: Regular Auto Expression917
internal fun PlayerActivity.showV917RegularAutoExpression917Toggle() {
    val current = BiliClient.prefs.v917regularAutoExpression917
    BiliClient.prefs.v917regularAutoExpression917 = !current
    AppToast.show(this, "Regular Auto Expression917: ${if (!current) "ON" else "OFF"}")
}

// v917: Reject Auto Block917
internal fun PlayerActivity.showV917RejectAutoBlock917Toggle() {
    val current = BiliClient.prefs.v917rejectAutoBlock917
    BiliClient.prefs.v917rejectAutoBlock917 = !current
    AppToast.show(this, "Reject Auto Block917: ${if (!current) "ON" else "OFF"}")
}

// v917: Relate Auto Suggest917
internal fun PlayerActivity.showV917RelateAutoSuggest917Toggle() {
    val current = BiliClient.prefs.v917relateAutoSuggest917
    BiliClient.prefs.v917relateAutoSuggest917 = !current
    AppToast.show(this, "Relate Auto Suggest917: ${if (!current) "ON" else "OFF"}")
}

// v917: Release Auto Lock917
internal fun PlayerActivity.showV917ReleaseAutoLock917Toggle() {
    val current = BiliClient.prefs.v917releaseAutoLock917
    BiliClient.prefs.v917releaseAutoLock917 = !current
    AppToast.show(this, "Release Auto Lock917: ${if (!current) "ON" else "OFF"}")
}

// v917: Remote Auto Cast917
internal fun PlayerActivity.showV917RemoteAutoCast917Toggle() {
    val current = BiliClient.prefs.v917remoteAutoCast917
    BiliClient.prefs.v917remoteAutoCast917 = !current
    AppToast.show(this, "Remote Auto Cast917: ${if (!current) "ON" else "OFF"}")
}

// v917: Remove Auto Clean917
internal fun PlayerActivity.showV917RemoveAutoClean917Toggle() {
    val current = BiliClient.prefs.v917removeAutoClean917
    BiliClient.prefs.v917removeAutoClean917 = !current
    AppToast.show(this, "Remove Auto Clean917: ${if (!current) "ON" else "OFF"}")
}

// v917: Rename Auto Label917
internal fun PlayerActivity.showV917RenameAutoLabel917Toggle() {
    val current = BiliClient.prefs.v917renameAutoLabel917
    BiliClient.prefs.v917renameAutoLabel917 = !current
    AppToast.show(this, "Rename Auto Label917: ${if (!current) "ON" else "OFF"}")
}

// v917: Render Auto Frame917
internal fun PlayerActivity.showV917RenderAutoFrame917Toggle() {
    val current = BiliClient.prefs.v917renderAutoFrame917
    BiliClient.prefs.v917renderAutoFrame917 = !current
    AppToast.show(this, "Render Auto Frame917: ${if (!current) "ON" else "OFF"}")
}

// v917: Repeat Auto Loop917
internal fun PlayerActivity.showV917RepeatAutoLoop917Toggle() {
    val current = BiliClient.prefs.v917repeatAutoLoop917
    BiliClient.prefs.v917repeatAutoLoop917 = !current
    AppToast.show(this, "Repeat Auto Loop917: ${if (!current) "ON" else "OFF"}")
}

// v918: Redirect Auto Url918
internal fun PlayerActivity.showV918RedirectAutoUrl918Toggle() {
    val current = BiliClient.prefs.v918redirectAutoUrl918
    BiliClient.prefs.v918redirectAutoUrl918 = !current
    AppToast.show(this, "Redirect Auto Url918: ${if (!current) "ON" else "OFF"}")
}

// v918: Reduce Auto Motion918
internal fun PlayerActivity.showV918ReduceAutoMotion918Toggle() {
    val current = BiliClient.prefs.v918reduceAutoMotion918
    BiliClient.prefs.v918reduceAutoMotion918 = !current
    AppToast.show(this, "Reduce Auto Motion918: ${if (!current) "ON" else "OFF"}")
}

// v918: Ref Auto Count918
internal fun PlayerActivity.showV918RefAutoCount918Toggle() {
    val current = BiliClient.prefs.v918refAutoCount918
    BiliClient.prefs.v918refAutoCount918 = !current
    AppToast.show(this, "Ref Auto Count918: ${if (!current) "ON" else "OFF"}")
}

// v918: Reference Auto Link918
internal fun PlayerActivity.showV918ReferenceAutoLink918Toggle() {
    val current = BiliClient.prefs.v918referenceAutoLink918
    BiliClient.prefs.v918referenceAutoLink918 = !current
    AppToast.show(this, "Reference Auto Link918: ${if (!current) "ON" else "OFF"}")
}

// v918: Refresh Auto Rate918
internal fun PlayerActivity.showV918RefreshAutoRate918Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v918refreshAutoRate918).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate918",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v918refreshAutoRate918 = value
        AppToast.show(this, "Refresh Auto Rate918: $value")
    }
}

// v918: Register Auto Callback918
internal fun PlayerActivity.showV918RegisterAutoCallback918Toggle() {
    val current = BiliClient.prefs.v918registerAutoCallback918
    BiliClient.prefs.v918registerAutoCallback918 = !current
    AppToast.show(this, "Register Auto Callback918: ${if (!current) "ON" else "OFF"}")
}

// v918: Regular Auto Expression918
internal fun PlayerActivity.showV918RegularAutoExpression918Toggle() {
    val current = BiliClient.prefs.v918regularAutoExpression918
    BiliClient.prefs.v918regularAutoExpression918 = !current
    AppToast.show(this, "Regular Auto Expression918: ${if (!current) "ON" else "OFF"}")
}

// v918: Reject Auto Block918
internal fun PlayerActivity.showV918RejectAutoBlock918Toggle() {
    val current = BiliClient.prefs.v918rejectAutoBlock918
    BiliClient.prefs.v918rejectAutoBlock918 = !current
    AppToast.show(this, "Reject Auto Block918: ${if (!current) "ON" else "OFF"}")
}

// v918: Relate Auto Suggest918
internal fun PlayerActivity.showV918RelateAutoSuggest918Toggle() {
    val current = BiliClient.prefs.v918relateAutoSuggest918
    BiliClient.prefs.v918relateAutoSuggest918 = !current
    AppToast.show(this, "Relate Auto Suggest918: ${if (!current) "ON" else "OFF"}")
}

// v918: Release Auto Lock918
internal fun PlayerActivity.showV918ReleaseAutoLock918Toggle() {
    val current = BiliClient.prefs.v918releaseAutoLock918
    BiliClient.prefs.v918releaseAutoLock918 = !current
    AppToast.show(this, "Release Auto Lock918: ${if (!current) "ON" else "OFF"}")
}

// v918: Remote Auto Cast918
internal fun PlayerActivity.showV918RemoteAutoCast918Toggle() {
    val current = BiliClient.prefs.v918remoteAutoCast918
    BiliClient.prefs.v918remoteAutoCast918 = !current
    AppToast.show(this, "Remote Auto Cast918: ${if (!current) "ON" else "OFF"}")
}

// v918: Remove Auto Clean918
internal fun PlayerActivity.showV918RemoveAutoClean918Toggle() {
    val current = BiliClient.prefs.v918removeAutoClean918
    BiliClient.prefs.v918removeAutoClean918 = !current
    AppToast.show(this, "Remove Auto Clean918: ${if (!current) "ON" else "OFF"}")
}

// v918: Rename Auto Label918
internal fun PlayerActivity.showV918RenameAutoLabel918Toggle() {
    val current = BiliClient.prefs.v918renameAutoLabel918
    BiliClient.prefs.v918renameAutoLabel918 = !current
    AppToast.show(this, "Rename Auto Label918: ${if (!current) "ON" else "OFF"}")
}

// v918: Render Auto Frame918
internal fun PlayerActivity.showV918RenderAutoFrame918Toggle() {
    val current = BiliClient.prefs.v918renderAutoFrame918
    BiliClient.prefs.v918renderAutoFrame918 = !current
    AppToast.show(this, "Render Auto Frame918: ${if (!current) "ON" else "OFF"}")
}

// v918: Repeat Auto Loop918
internal fun PlayerActivity.showV918RepeatAutoLoop918Toggle() {
    val current = BiliClient.prefs.v918repeatAutoLoop918
    BiliClient.prefs.v918repeatAutoLoop918 = !current
    AppToast.show(this, "Repeat Auto Loop918: ${if (!current) "ON" else "OFF"}")
}

// v919: Redirect Auto Url919
internal fun PlayerActivity.showV919RedirectAutoUrl919Toggle() {
    val current = BiliClient.prefs.v919redirectAutoUrl919
    BiliClient.prefs.v919redirectAutoUrl919 = !current
    AppToast.show(this, "Redirect Auto Url919: ${if (!current) "ON" else "OFF"}")
}

// v919: Reduce Auto Motion919
internal fun PlayerActivity.showV919ReduceAutoMotion919Toggle() {
    val current = BiliClient.prefs.v919reduceAutoMotion919
    BiliClient.prefs.v919reduceAutoMotion919 = !current
    AppToast.show(this, "Reduce Auto Motion919: ${if (!current) "ON" else "OFF"}")
}

// v919: Ref Auto Count919
internal fun PlayerActivity.showV919RefAutoCount919Toggle() {
    val current = BiliClient.prefs.v919refAutoCount919
    BiliClient.prefs.v919refAutoCount919 = !current
    AppToast.show(this, "Ref Auto Count919: ${if (!current) "ON" else "OFF"}")
}

// v919: Reference Auto Link919
internal fun PlayerActivity.showV919ReferenceAutoLink919Toggle() {
    val current = BiliClient.prefs.v919referenceAutoLink919
    BiliClient.prefs.v919referenceAutoLink919 = !current
    AppToast.show(this, "Reference Auto Link919: ${if (!current) "ON" else "OFF"}")
}

// v919: Refresh Auto Rate919
internal fun PlayerActivity.showV919RefreshAutoRate919Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v919refreshAutoRate919).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate919",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v919refreshAutoRate919 = value
        AppToast.show(this, "Refresh Auto Rate919: $value")
    }
}

// v919: Register Auto Callback919
internal fun PlayerActivity.showV919RegisterAutoCallback919Toggle() {
    val current = BiliClient.prefs.v919registerAutoCallback919
    BiliClient.prefs.v919registerAutoCallback919 = !current
    AppToast.show(this, "Register Auto Callback919: ${if (!current) "ON" else "OFF"}")
}

// v919: Regular Auto Expression919
internal fun PlayerActivity.showV919RegularAutoExpression919Toggle() {
    val current = BiliClient.prefs.v919regularAutoExpression919
    BiliClient.prefs.v919regularAutoExpression919 = !current
    AppToast.show(this, "Regular Auto Expression919: ${if (!current) "ON" else "OFF"}")
}

// v919: Reject Auto Block919
internal fun PlayerActivity.showV919RejectAutoBlock919Toggle() {
    val current = BiliClient.prefs.v919rejectAutoBlock919
    BiliClient.prefs.v919rejectAutoBlock919 = !current
    AppToast.show(this, "Reject Auto Block919: ${if (!current) "ON" else "OFF"}")
}

// v919: Relate Auto Suggest919
internal fun PlayerActivity.showV919RelateAutoSuggest919Toggle() {
    val current = BiliClient.prefs.v919relateAutoSuggest919
    BiliClient.prefs.v919relateAutoSuggest919 = !current
    AppToast.show(this, "Relate Auto Suggest919: ${if (!current) "ON" else "OFF"}")
}

// v919: Release Auto Lock919
internal fun PlayerActivity.showV919ReleaseAutoLock919Toggle() {
    val current = BiliClient.prefs.v919releaseAutoLock919
    BiliClient.prefs.v919releaseAutoLock919 = !current
    AppToast.show(this, "Release Auto Lock919: ${if (!current) "ON" else "OFF"}")
}

// v919: Remote Auto Cast919
internal fun PlayerActivity.showV919RemoteAutoCast919Toggle() {
    val current = BiliClient.prefs.v919remoteAutoCast919
    BiliClient.prefs.v919remoteAutoCast919 = !current
    AppToast.show(this, "Remote Auto Cast919: ${if (!current) "ON" else "OFF"}")
}

// v919: Remove Auto Clean919
internal fun PlayerActivity.showV919RemoveAutoClean919Toggle() {
    val current = BiliClient.prefs.v919removeAutoClean919
    BiliClient.prefs.v919removeAutoClean919 = !current
    AppToast.show(this, "Remove Auto Clean919: ${if (!current) "ON" else "OFF"}")
}

// v919: Rename Auto Label919
internal fun PlayerActivity.showV919RenameAutoLabel919Toggle() {
    val current = BiliClient.prefs.v919renameAutoLabel919
    BiliClient.prefs.v919renameAutoLabel919 = !current
    AppToast.show(this, "Rename Auto Label919: ${if (!current) "ON" else "OFF"}")
}

// v919: Render Auto Frame919
internal fun PlayerActivity.showV919RenderAutoFrame919Toggle() {
    val current = BiliClient.prefs.v919renderAutoFrame919
    BiliClient.prefs.v919renderAutoFrame919 = !current
    AppToast.show(this, "Render Auto Frame919: ${if (!current) "ON" else "OFF"}")
}

// v919: Repeat Auto Loop919
internal fun PlayerActivity.showV919RepeatAutoLoop919Toggle() {
    val current = BiliClient.prefs.v919repeatAutoLoop919
    BiliClient.prefs.v919repeatAutoLoop919 = !current
    AppToast.show(this, "Repeat Auto Loop919: ${if (!current) "ON" else "OFF"}")
}

// v920: Redirect Auto Url920
internal fun PlayerActivity.showV920RedirectAutoUrl920Toggle() {
    val current = BiliClient.prefs.v920redirectAutoUrl920
    BiliClient.prefs.v920redirectAutoUrl920 = !current
    AppToast.show(this, "Redirect Auto Url920: ${if (!current) "ON" else "OFF"}")
}

// v920: Reduce Auto Motion920
internal fun PlayerActivity.showV920ReduceAutoMotion920Toggle() {
    val current = BiliClient.prefs.v920reduceAutoMotion920
    BiliClient.prefs.v920reduceAutoMotion920 = !current
    AppToast.show(this, "Reduce Auto Motion920: ${if (!current) "ON" else "OFF"}")
}

// v920: Ref Auto Count920
internal fun PlayerActivity.showV920RefAutoCount920Toggle() {
    val current = BiliClient.prefs.v920refAutoCount920
    BiliClient.prefs.v920refAutoCount920 = !current
    AppToast.show(this, "Ref Auto Count920: ${if (!current) "ON" else "OFF"}")
}

// v920: Reference Auto Link920
internal fun PlayerActivity.showV920ReferenceAutoLink920Toggle() {
    val current = BiliClient.prefs.v920referenceAutoLink920
    BiliClient.prefs.v920referenceAutoLink920 = !current
    AppToast.show(this, "Reference Auto Link920: ${if (!current) "ON" else "OFF"}")
}

// v920: Refresh Auto Rate920
internal fun PlayerActivity.showV920RefreshAutoRate920Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v920refreshAutoRate920).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Refresh Auto Rate920",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v920refreshAutoRate920 = value
        AppToast.show(this, "Refresh Auto Rate920: $value")
    }
}

// v920: Register Auto Callback920
internal fun PlayerActivity.showV920RegisterAutoCallback920Toggle() {
    val current = BiliClient.prefs.v920registerAutoCallback920
    BiliClient.prefs.v920registerAutoCallback920 = !current
    AppToast.show(this, "Register Auto Callback920: ${if (!current) "ON" else "OFF"}")
}

// v920: Regular Auto Expression920
internal fun PlayerActivity.showV920RegularAutoExpression920Toggle() {
    val current = BiliClient.prefs.v920regularAutoExpression920
    BiliClient.prefs.v920regularAutoExpression920 = !current
    AppToast.show(this, "Regular Auto Expression920: ${if (!current) "ON" else "OFF"}")
}

// v920: Reject Auto Block920
internal fun PlayerActivity.showV920RejectAutoBlock920Toggle() {
    val current = BiliClient.prefs.v920rejectAutoBlock920
    BiliClient.prefs.v920rejectAutoBlock920 = !current
    AppToast.show(this, "Reject Auto Block920: ${if (!current) "ON" else "OFF"}")
}

// v920: Relate Auto Suggest920
internal fun PlayerActivity.showV920RelateAutoSuggest920Toggle() {
    val current = BiliClient.prefs.v920relateAutoSuggest920
    BiliClient.prefs.v920relateAutoSuggest920 = !current
    AppToast.show(this, "Relate Auto Suggest920: ${if (!current) "ON" else "OFF"}")
}

// v920: Release Auto Lock920
internal fun PlayerActivity.showV920ReleaseAutoLock920Toggle() {
    val current = BiliClient.prefs.v920releaseAutoLock920
    BiliClient.prefs.v920releaseAutoLock920 = !current
    AppToast.show(this, "Release Auto Lock920: ${if (!current) "ON" else "OFF"}")
}

// v920: Remote Auto Cast920
internal fun PlayerActivity.showV920RemoteAutoCast920Toggle() {
    val current = BiliClient.prefs.v920remoteAutoCast920
    BiliClient.prefs.v920remoteAutoCast920 = !current
    AppToast.show(this, "Remote Auto Cast920: ${if (!current) "ON" else "OFF"}")
}

// v920: Remove Auto Clean920
internal fun PlayerActivity.showV920RemoveAutoClean920Toggle() {
    val current = BiliClient.prefs.v920removeAutoClean920
    BiliClient.prefs.v920removeAutoClean920 = !current
    AppToast.show(this, "Remove Auto Clean920: ${if (!current) "ON" else "OFF"}")
}

// v920: Rename Auto Label920
internal fun PlayerActivity.showV920RenameAutoLabel920Toggle() {
    val current = BiliClient.prefs.v920renameAutoLabel920
    BiliClient.prefs.v920renameAutoLabel920 = !current
    AppToast.show(this, "Rename Auto Label920: ${if (!current) "ON" else "OFF"}")
}

// v920: Render Auto Frame920
internal fun PlayerActivity.showV920RenderAutoFrame920Toggle() {
    val current = BiliClient.prefs.v920renderAutoFrame920
    BiliClient.prefs.v920renderAutoFrame920 = !current
    AppToast.show(this, "Render Auto Frame920: ${if (!current) "ON" else "OFF"}")
}

// v920: Repeat Auto Loop920
internal fun PlayerActivity.showV920RepeatAutoLoop920Toggle() {
    val current = BiliClient.prefs.v920repeatAutoLoop920
    BiliClient.prefs.v920repeatAutoLoop920 = !current
    AppToast.show(this, "Repeat Auto Loop920: ${if (!current) "ON" else "OFF"}")
}

