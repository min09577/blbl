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

// v881: Prepare Auto Buffer881
internal fun PlayerActivity.showV881PrepareAutoBuffer881Toggle() {
    val current = BiliClient.prefs.v881prepareAutoBuffer881
    BiliClient.prefs.v881prepareAutoBuffer881 = !current
    AppToast.show(this, "Prepare Auto Buffer881: ${if (!current) "ON" else "OFF"}")
}

// v881: Present Auto Animate881
internal fun PlayerActivity.showV881PresentAutoAnimate881Toggle() {
    val current = BiliClient.prefs.v881presentAutoAnimate881
    BiliClient.prefs.v881presentAutoAnimate881 = !current
    AppToast.show(this, "Present Auto Animate881: ${if (!current) "ON" else "OFF"}")
}

// v881: Preserve Auto Ratio881
internal fun PlayerActivity.showV881PreserveAutoRatio881Toggle() {
    val current = BiliClient.prefs.v881preserveAutoRatio881
    BiliClient.prefs.v881preserveAutoRatio881 = !current
    AppToast.show(this, "Preserve Auto Ratio881: ${if (!current) "ON" else "OFF"}")
}

// v881: Press Auto Hold881
internal fun PlayerActivity.showV881PressAutoHold881Toggle() {
    val current = BiliClient.prefs.v881pressAutoHold881
    BiliClient.prefs.v881pressAutoHold881 = !current
    AppToast.show(this, "Press Auto Hold881: ${if (!current) "ON" else "OFF"}")
}

// v881: Prev Auto Track881
internal fun PlayerActivity.showV881PrevAutoTrack881Toggle() {
    val current = BiliClient.prefs.v881prevAutoTrack881
    BiliClient.prefs.v881prevAutoTrack881 = !current
    AppToast.show(this, "Prev Auto Track881: ${if (!current) "ON" else "OFF"}")
}

// v881: Prevent Auto Overscroll881
internal fun PlayerActivity.showV881PreventAutoOverscroll881Toggle() {
    val current = BiliClient.prefs.v881preventAutoOverscroll881
    BiliClient.prefs.v881preventAutoOverscroll881 = !current
    AppToast.show(this, "Prevent Auto Overscroll881: ${if (!current) "ON" else "OFF"}")
}

// v881: Preview Auto Thumbnail881
internal fun PlayerActivity.showV881PreviewAutoThumbnail881Toggle() {
    val current = BiliClient.prefs.v881previewAutoThumbnail881
    BiliClient.prefs.v881previewAutoThumbnail881 = !current
    AppToast.show(this, "Preview Auto Thumbnail881: ${if (!current) "ON" else "OFF"}")
}

// v881: Primary Auto Source881
internal fun PlayerActivity.showV881PrimaryAutoSource881Toggle() {
    val current = BiliClient.prefs.v881primaryAutoSource881
    BiliClient.prefs.v881primaryAutoSource881 = !current
    AppToast.show(this, "Primary Auto Source881: ${if (!current) "ON" else "OFF"}")
}

// v881: Print Auto Log881
internal fun PlayerActivity.showV881PrintAutoLog881Toggle() {
    val current = BiliClient.prefs.v881printAutoLog881
    BiliClient.prefs.v881printAutoLog881 = !current
    AppToast.show(this, "Print Auto Log881: ${if (!current) "ON" else "OFF"}")
}

// v881: Priority Auto Queue881
internal fun PlayerActivity.showV881PriorityAutoQueue881Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v881priorityAutoQueue881).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue881",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v881priorityAutoQueue881 = value
        AppToast.show(this, "Priority Auto Queue881: $value")
    }
}

// v881: Private Auto Incognito881
internal fun PlayerActivity.showV881PrivateAutoIncognito881Toggle() {
    val current = BiliClient.prefs.v881privateAutoIncognito881
    BiliClient.prefs.v881privateAutoIncognito881 = !current
    AppToast.show(this, "Private Auto Incognito881: ${if (!current) "ON" else "OFF"}")
}

// v881: Process Auto Thread881
internal fun PlayerActivity.showV881ProcessAutoThread881Toggle() {
    val current = BiliClient.prefs.v881processAutoThread881
    BiliClient.prefs.v881processAutoThread881 = !current
    AppToast.show(this, "Process Auto Thread881: ${if (!current) "ON" else "OFF"}")
}

// v881: Produce Auto Generate881
internal fun PlayerActivity.showV881ProduceAutoGenerate881Toggle() {
    val current = BiliClient.prefs.v881produceAutoGenerate881
    BiliClient.prefs.v881produceAutoGenerate881 = !current
    AppToast.show(this, "Produce Auto Generate881: ${if (!current) "ON" else "OFF"}")
}

// v881: Profile Auto Switch881
internal fun PlayerActivity.showV881ProfileAutoSwitch881Toggle() {
    val current = BiliClient.prefs.v881profileAutoSwitch881
    BiliClient.prefs.v881profileAutoSwitch881 = !current
    AppToast.show(this, "Profile Auto Switch881: ${if (!current) "ON" else "OFF"}")
}

// v881: Program Auto Schedule881
internal fun PlayerActivity.showV881ProgramAutoSchedule881Toggle() {
    val current = BiliClient.prefs.v881programAutoSchedule881
    BiliClient.prefs.v881programAutoSchedule881 = !current
    AppToast.show(this, "Program Auto Schedule881: ${if (!current) "ON" else "OFF"}")
}

// v882: Prepare Auto Buffer882
internal fun PlayerActivity.showV882PrepareAutoBuffer882Toggle() {
    val current = BiliClient.prefs.v882prepareAutoBuffer882
    BiliClient.prefs.v882prepareAutoBuffer882 = !current
    AppToast.show(this, "Prepare Auto Buffer882: ${if (!current) "ON" else "OFF"}")
}

// v882: Present Auto Animate882
internal fun PlayerActivity.showV882PresentAutoAnimate882Toggle() {
    val current = BiliClient.prefs.v882presentAutoAnimate882
    BiliClient.prefs.v882presentAutoAnimate882 = !current
    AppToast.show(this, "Present Auto Animate882: ${if (!current) "ON" else "OFF"}")
}

// v882: Preserve Auto Ratio882
internal fun PlayerActivity.showV882PreserveAutoRatio882Toggle() {
    val current = BiliClient.prefs.v882preserveAutoRatio882
    BiliClient.prefs.v882preserveAutoRatio882 = !current
    AppToast.show(this, "Preserve Auto Ratio882: ${if (!current) "ON" else "OFF"}")
}

// v882: Press Auto Hold882
internal fun PlayerActivity.showV882PressAutoHold882Toggle() {
    val current = BiliClient.prefs.v882pressAutoHold882
    BiliClient.prefs.v882pressAutoHold882 = !current
    AppToast.show(this, "Press Auto Hold882: ${if (!current) "ON" else "OFF"}")
}

// v882: Prev Auto Track882
internal fun PlayerActivity.showV882PrevAutoTrack882Toggle() {
    val current = BiliClient.prefs.v882prevAutoTrack882
    BiliClient.prefs.v882prevAutoTrack882 = !current
    AppToast.show(this, "Prev Auto Track882: ${if (!current) "ON" else "OFF"}")
}

// v882: Prevent Auto Overscroll882
internal fun PlayerActivity.showV882PreventAutoOverscroll882Toggle() {
    val current = BiliClient.prefs.v882preventAutoOverscroll882
    BiliClient.prefs.v882preventAutoOverscroll882 = !current
    AppToast.show(this, "Prevent Auto Overscroll882: ${if (!current) "ON" else "OFF"}")
}

// v882: Preview Auto Thumbnail882
internal fun PlayerActivity.showV882PreviewAutoThumbnail882Toggle() {
    val current = BiliClient.prefs.v882previewAutoThumbnail882
    BiliClient.prefs.v882previewAutoThumbnail882 = !current
    AppToast.show(this, "Preview Auto Thumbnail882: ${if (!current) "ON" else "OFF"}")
}

// v882: Primary Auto Source882
internal fun PlayerActivity.showV882PrimaryAutoSource882Toggle() {
    val current = BiliClient.prefs.v882primaryAutoSource882
    BiliClient.prefs.v882primaryAutoSource882 = !current
    AppToast.show(this, "Primary Auto Source882: ${if (!current) "ON" else "OFF"}")
}

// v882: Print Auto Log882
internal fun PlayerActivity.showV882PrintAutoLog882Toggle() {
    val current = BiliClient.prefs.v882printAutoLog882
    BiliClient.prefs.v882printAutoLog882 = !current
    AppToast.show(this, "Print Auto Log882: ${if (!current) "ON" else "OFF"}")
}

// v882: Priority Auto Queue882
internal fun PlayerActivity.showV882PriorityAutoQueue882Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v882priorityAutoQueue882).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue882",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v882priorityAutoQueue882 = value
        AppToast.show(this, "Priority Auto Queue882: $value")
    }
}

// v882: Private Auto Incognito882
internal fun PlayerActivity.showV882PrivateAutoIncognito882Toggle() {
    val current = BiliClient.prefs.v882privateAutoIncognito882
    BiliClient.prefs.v882privateAutoIncognito882 = !current
    AppToast.show(this, "Private Auto Incognito882: ${if (!current) "ON" else "OFF"}")
}

// v882: Process Auto Thread882
internal fun PlayerActivity.showV882ProcessAutoThread882Toggle() {
    val current = BiliClient.prefs.v882processAutoThread882
    BiliClient.prefs.v882processAutoThread882 = !current
    AppToast.show(this, "Process Auto Thread882: ${if (!current) "ON" else "OFF"}")
}

// v882: Produce Auto Generate882
internal fun PlayerActivity.showV882ProduceAutoGenerate882Toggle() {
    val current = BiliClient.prefs.v882produceAutoGenerate882
    BiliClient.prefs.v882produceAutoGenerate882 = !current
    AppToast.show(this, "Produce Auto Generate882: ${if (!current) "ON" else "OFF"}")
}

// v882: Profile Auto Switch882
internal fun PlayerActivity.showV882ProfileAutoSwitch882Toggle() {
    val current = BiliClient.prefs.v882profileAutoSwitch882
    BiliClient.prefs.v882profileAutoSwitch882 = !current
    AppToast.show(this, "Profile Auto Switch882: ${if (!current) "ON" else "OFF"}")
}

// v882: Program Auto Schedule882
internal fun PlayerActivity.showV882ProgramAutoSchedule882Toggle() {
    val current = BiliClient.prefs.v882programAutoSchedule882
    BiliClient.prefs.v882programAutoSchedule882 = !current
    AppToast.show(this, "Program Auto Schedule882: ${if (!current) "ON" else "OFF"}")
}

// v883: Prepare Auto Buffer883
internal fun PlayerActivity.showV883PrepareAutoBuffer883Toggle() {
    val current = BiliClient.prefs.v883prepareAutoBuffer883
    BiliClient.prefs.v883prepareAutoBuffer883 = !current
    AppToast.show(this, "Prepare Auto Buffer883: ${if (!current) "ON" else "OFF"}")
}

// v883: Present Auto Animate883
internal fun PlayerActivity.showV883PresentAutoAnimate883Toggle() {
    val current = BiliClient.prefs.v883presentAutoAnimate883
    BiliClient.prefs.v883presentAutoAnimate883 = !current
    AppToast.show(this, "Present Auto Animate883: ${if (!current) "ON" else "OFF"}")
}

// v883: Preserve Auto Ratio883
internal fun PlayerActivity.showV883PreserveAutoRatio883Toggle() {
    val current = BiliClient.prefs.v883preserveAutoRatio883
    BiliClient.prefs.v883preserveAutoRatio883 = !current
    AppToast.show(this, "Preserve Auto Ratio883: ${if (!current) "ON" else "OFF"}")
}

// v883: Press Auto Hold883
internal fun PlayerActivity.showV883PressAutoHold883Toggle() {
    val current = BiliClient.prefs.v883pressAutoHold883
    BiliClient.prefs.v883pressAutoHold883 = !current
    AppToast.show(this, "Press Auto Hold883: ${if (!current) "ON" else "OFF"}")
}

// v883: Prev Auto Track883
internal fun PlayerActivity.showV883PrevAutoTrack883Toggle() {
    val current = BiliClient.prefs.v883prevAutoTrack883
    BiliClient.prefs.v883prevAutoTrack883 = !current
    AppToast.show(this, "Prev Auto Track883: ${if (!current) "ON" else "OFF"}")
}

// v883: Prevent Auto Overscroll883
internal fun PlayerActivity.showV883PreventAutoOverscroll883Toggle() {
    val current = BiliClient.prefs.v883preventAutoOverscroll883
    BiliClient.prefs.v883preventAutoOverscroll883 = !current
    AppToast.show(this, "Prevent Auto Overscroll883: ${if (!current) "ON" else "OFF"}")
}

// v883: Preview Auto Thumbnail883
internal fun PlayerActivity.showV883PreviewAutoThumbnail883Toggle() {
    val current = BiliClient.prefs.v883previewAutoThumbnail883
    BiliClient.prefs.v883previewAutoThumbnail883 = !current
    AppToast.show(this, "Preview Auto Thumbnail883: ${if (!current) "ON" else "OFF"}")
}

// v883: Primary Auto Source883
internal fun PlayerActivity.showV883PrimaryAutoSource883Toggle() {
    val current = BiliClient.prefs.v883primaryAutoSource883
    BiliClient.prefs.v883primaryAutoSource883 = !current
    AppToast.show(this, "Primary Auto Source883: ${if (!current) "ON" else "OFF"}")
}

// v883: Print Auto Log883
internal fun PlayerActivity.showV883PrintAutoLog883Toggle() {
    val current = BiliClient.prefs.v883printAutoLog883
    BiliClient.prefs.v883printAutoLog883 = !current
    AppToast.show(this, "Print Auto Log883: ${if (!current) "ON" else "OFF"}")
}

// v883: Priority Auto Queue883
internal fun PlayerActivity.showV883PriorityAutoQueue883Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v883priorityAutoQueue883).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue883",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v883priorityAutoQueue883 = value
        AppToast.show(this, "Priority Auto Queue883: $value")
    }
}

// v883: Private Auto Incognito883
internal fun PlayerActivity.showV883PrivateAutoIncognito883Toggle() {
    val current = BiliClient.prefs.v883privateAutoIncognito883
    BiliClient.prefs.v883privateAutoIncognito883 = !current
    AppToast.show(this, "Private Auto Incognito883: ${if (!current) "ON" else "OFF"}")
}

// v883: Process Auto Thread883
internal fun PlayerActivity.showV883ProcessAutoThread883Toggle() {
    val current = BiliClient.prefs.v883processAutoThread883
    BiliClient.prefs.v883processAutoThread883 = !current
    AppToast.show(this, "Process Auto Thread883: ${if (!current) "ON" else "OFF"}")
}

// v883: Produce Auto Generate883
internal fun PlayerActivity.showV883ProduceAutoGenerate883Toggle() {
    val current = BiliClient.prefs.v883produceAutoGenerate883
    BiliClient.prefs.v883produceAutoGenerate883 = !current
    AppToast.show(this, "Produce Auto Generate883: ${if (!current) "ON" else "OFF"}")
}

// v883: Profile Auto Switch883
internal fun PlayerActivity.showV883ProfileAutoSwitch883Toggle() {
    val current = BiliClient.prefs.v883profileAutoSwitch883
    BiliClient.prefs.v883profileAutoSwitch883 = !current
    AppToast.show(this, "Profile Auto Switch883: ${if (!current) "ON" else "OFF"}")
}

// v883: Program Auto Schedule883
internal fun PlayerActivity.showV883ProgramAutoSchedule883Toggle() {
    val current = BiliClient.prefs.v883programAutoSchedule883
    BiliClient.prefs.v883programAutoSchedule883 = !current
    AppToast.show(this, "Program Auto Schedule883: ${if (!current) "ON" else "OFF"}")
}

// v884: Prepare Auto Buffer884
internal fun PlayerActivity.showV884PrepareAutoBuffer884Toggle() {
    val current = BiliClient.prefs.v884prepareAutoBuffer884
    BiliClient.prefs.v884prepareAutoBuffer884 = !current
    AppToast.show(this, "Prepare Auto Buffer884: ${if (!current) "ON" else "OFF"}")
}

// v884: Present Auto Animate884
internal fun PlayerActivity.showV884PresentAutoAnimate884Toggle() {
    val current = BiliClient.prefs.v884presentAutoAnimate884
    BiliClient.prefs.v884presentAutoAnimate884 = !current
    AppToast.show(this, "Present Auto Animate884: ${if (!current) "ON" else "OFF"}")
}

// v884: Preserve Auto Ratio884
internal fun PlayerActivity.showV884PreserveAutoRatio884Toggle() {
    val current = BiliClient.prefs.v884preserveAutoRatio884
    BiliClient.prefs.v884preserveAutoRatio884 = !current
    AppToast.show(this, "Preserve Auto Ratio884: ${if (!current) "ON" else "OFF"}")
}

// v884: Press Auto Hold884
internal fun PlayerActivity.showV884PressAutoHold884Toggle() {
    val current = BiliClient.prefs.v884pressAutoHold884
    BiliClient.prefs.v884pressAutoHold884 = !current
    AppToast.show(this, "Press Auto Hold884: ${if (!current) "ON" else "OFF"}")
}

// v884: Prev Auto Track884
internal fun PlayerActivity.showV884PrevAutoTrack884Toggle() {
    val current = BiliClient.prefs.v884prevAutoTrack884
    BiliClient.prefs.v884prevAutoTrack884 = !current
    AppToast.show(this, "Prev Auto Track884: ${if (!current) "ON" else "OFF"}")
}

// v884: Prevent Auto Overscroll884
internal fun PlayerActivity.showV884PreventAutoOverscroll884Toggle() {
    val current = BiliClient.prefs.v884preventAutoOverscroll884
    BiliClient.prefs.v884preventAutoOverscroll884 = !current
    AppToast.show(this, "Prevent Auto Overscroll884: ${if (!current) "ON" else "OFF"}")
}

// v884: Preview Auto Thumbnail884
internal fun PlayerActivity.showV884PreviewAutoThumbnail884Toggle() {
    val current = BiliClient.prefs.v884previewAutoThumbnail884
    BiliClient.prefs.v884previewAutoThumbnail884 = !current
    AppToast.show(this, "Preview Auto Thumbnail884: ${if (!current) "ON" else "OFF"}")
}

// v884: Primary Auto Source884
internal fun PlayerActivity.showV884PrimaryAutoSource884Toggle() {
    val current = BiliClient.prefs.v884primaryAutoSource884
    BiliClient.prefs.v884primaryAutoSource884 = !current
    AppToast.show(this, "Primary Auto Source884: ${if (!current) "ON" else "OFF"}")
}

// v884: Print Auto Log884
internal fun PlayerActivity.showV884PrintAutoLog884Toggle() {
    val current = BiliClient.prefs.v884printAutoLog884
    BiliClient.prefs.v884printAutoLog884 = !current
    AppToast.show(this, "Print Auto Log884: ${if (!current) "ON" else "OFF"}")
}

// v884: Priority Auto Queue884
internal fun PlayerActivity.showV884PriorityAutoQueue884Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v884priorityAutoQueue884).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue884",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v884priorityAutoQueue884 = value
        AppToast.show(this, "Priority Auto Queue884: $value")
    }
}

// v884: Private Auto Incognito884
internal fun PlayerActivity.showV884PrivateAutoIncognito884Toggle() {
    val current = BiliClient.prefs.v884privateAutoIncognito884
    BiliClient.prefs.v884privateAutoIncognito884 = !current
    AppToast.show(this, "Private Auto Incognito884: ${if (!current) "ON" else "OFF"}")
}

// v884: Process Auto Thread884
internal fun PlayerActivity.showV884ProcessAutoThread884Toggle() {
    val current = BiliClient.prefs.v884processAutoThread884
    BiliClient.prefs.v884processAutoThread884 = !current
    AppToast.show(this, "Process Auto Thread884: ${if (!current) "ON" else "OFF"}")
}

// v884: Produce Auto Generate884
internal fun PlayerActivity.showV884ProduceAutoGenerate884Toggle() {
    val current = BiliClient.prefs.v884produceAutoGenerate884
    BiliClient.prefs.v884produceAutoGenerate884 = !current
    AppToast.show(this, "Produce Auto Generate884: ${if (!current) "ON" else "OFF"}")
}

// v884: Profile Auto Switch884
internal fun PlayerActivity.showV884ProfileAutoSwitch884Toggle() {
    val current = BiliClient.prefs.v884profileAutoSwitch884
    BiliClient.prefs.v884profileAutoSwitch884 = !current
    AppToast.show(this, "Profile Auto Switch884: ${if (!current) "ON" else "OFF"}")
}

// v884: Program Auto Schedule884
internal fun PlayerActivity.showV884ProgramAutoSchedule884Toggle() {
    val current = BiliClient.prefs.v884programAutoSchedule884
    BiliClient.prefs.v884programAutoSchedule884 = !current
    AppToast.show(this, "Program Auto Schedule884: ${if (!current) "ON" else "OFF"}")
}

// v885: Prepare Auto Buffer885
internal fun PlayerActivity.showV885PrepareAutoBuffer885Toggle() {
    val current = BiliClient.prefs.v885prepareAutoBuffer885
    BiliClient.prefs.v885prepareAutoBuffer885 = !current
    AppToast.show(this, "Prepare Auto Buffer885: ${if (!current) "ON" else "OFF"}")
}

// v885: Present Auto Animate885
internal fun PlayerActivity.showV885PresentAutoAnimate885Toggle() {
    val current = BiliClient.prefs.v885presentAutoAnimate885
    BiliClient.prefs.v885presentAutoAnimate885 = !current
    AppToast.show(this, "Present Auto Animate885: ${if (!current) "ON" else "OFF"}")
}

// v885: Preserve Auto Ratio885
internal fun PlayerActivity.showV885PreserveAutoRatio885Toggle() {
    val current = BiliClient.prefs.v885preserveAutoRatio885
    BiliClient.prefs.v885preserveAutoRatio885 = !current
    AppToast.show(this, "Preserve Auto Ratio885: ${if (!current) "ON" else "OFF"}")
}

// v885: Press Auto Hold885
internal fun PlayerActivity.showV885PressAutoHold885Toggle() {
    val current = BiliClient.prefs.v885pressAutoHold885
    BiliClient.prefs.v885pressAutoHold885 = !current
    AppToast.show(this, "Press Auto Hold885: ${if (!current) "ON" else "OFF"}")
}

// v885: Prev Auto Track885
internal fun PlayerActivity.showV885PrevAutoTrack885Toggle() {
    val current = BiliClient.prefs.v885prevAutoTrack885
    BiliClient.prefs.v885prevAutoTrack885 = !current
    AppToast.show(this, "Prev Auto Track885: ${if (!current) "ON" else "OFF"}")
}

// v885: Prevent Auto Overscroll885
internal fun PlayerActivity.showV885PreventAutoOverscroll885Toggle() {
    val current = BiliClient.prefs.v885preventAutoOverscroll885
    BiliClient.prefs.v885preventAutoOverscroll885 = !current
    AppToast.show(this, "Prevent Auto Overscroll885: ${if (!current) "ON" else "OFF"}")
}

// v885: Preview Auto Thumbnail885
internal fun PlayerActivity.showV885PreviewAutoThumbnail885Toggle() {
    val current = BiliClient.prefs.v885previewAutoThumbnail885
    BiliClient.prefs.v885previewAutoThumbnail885 = !current
    AppToast.show(this, "Preview Auto Thumbnail885: ${if (!current) "ON" else "OFF"}")
}

// v885: Primary Auto Source885
internal fun PlayerActivity.showV885PrimaryAutoSource885Toggle() {
    val current = BiliClient.prefs.v885primaryAutoSource885
    BiliClient.prefs.v885primaryAutoSource885 = !current
    AppToast.show(this, "Primary Auto Source885: ${if (!current) "ON" else "OFF"}")
}

// v885: Print Auto Log885
internal fun PlayerActivity.showV885PrintAutoLog885Toggle() {
    val current = BiliClient.prefs.v885printAutoLog885
    BiliClient.prefs.v885printAutoLog885 = !current
    AppToast.show(this, "Print Auto Log885: ${if (!current) "ON" else "OFF"}")
}

// v885: Priority Auto Queue885
internal fun PlayerActivity.showV885PriorityAutoQueue885Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v885priorityAutoQueue885).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue885",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v885priorityAutoQueue885 = value
        AppToast.show(this, "Priority Auto Queue885: $value")
    }
}

// v885: Private Auto Incognito885
internal fun PlayerActivity.showV885PrivateAutoIncognito885Toggle() {
    val current = BiliClient.prefs.v885privateAutoIncognito885
    BiliClient.prefs.v885privateAutoIncognito885 = !current
    AppToast.show(this, "Private Auto Incognito885: ${if (!current) "ON" else "OFF"}")
}

// v885: Process Auto Thread885
internal fun PlayerActivity.showV885ProcessAutoThread885Toggle() {
    val current = BiliClient.prefs.v885processAutoThread885
    BiliClient.prefs.v885processAutoThread885 = !current
    AppToast.show(this, "Process Auto Thread885: ${if (!current) "ON" else "OFF"}")
}

// v885: Produce Auto Generate885
internal fun PlayerActivity.showV885ProduceAutoGenerate885Toggle() {
    val current = BiliClient.prefs.v885produceAutoGenerate885
    BiliClient.prefs.v885produceAutoGenerate885 = !current
    AppToast.show(this, "Produce Auto Generate885: ${if (!current) "ON" else "OFF"}")
}

// v885: Profile Auto Switch885
internal fun PlayerActivity.showV885ProfileAutoSwitch885Toggle() {
    val current = BiliClient.prefs.v885profileAutoSwitch885
    BiliClient.prefs.v885profileAutoSwitch885 = !current
    AppToast.show(this, "Profile Auto Switch885: ${if (!current) "ON" else "OFF"}")
}

// v885: Program Auto Schedule885
internal fun PlayerActivity.showV885ProgramAutoSchedule885Toggle() {
    val current = BiliClient.prefs.v885programAutoSchedule885
    BiliClient.prefs.v885programAutoSchedule885 = !current
    AppToast.show(this, "Program Auto Schedule885: ${if (!current) "ON" else "OFF"}")
}

// v886: Prepare Auto Buffer886
internal fun PlayerActivity.showV886PrepareAutoBuffer886Toggle() {
    val current = BiliClient.prefs.v886prepareAutoBuffer886
    BiliClient.prefs.v886prepareAutoBuffer886 = !current
    AppToast.show(this, "Prepare Auto Buffer886: ${if (!current) "ON" else "OFF"}")
}

// v886: Present Auto Animate886
internal fun PlayerActivity.showV886PresentAutoAnimate886Toggle() {
    val current = BiliClient.prefs.v886presentAutoAnimate886
    BiliClient.prefs.v886presentAutoAnimate886 = !current
    AppToast.show(this, "Present Auto Animate886: ${if (!current) "ON" else "OFF"}")
}

// v886: Preserve Auto Ratio886
internal fun PlayerActivity.showV886PreserveAutoRatio886Toggle() {
    val current = BiliClient.prefs.v886preserveAutoRatio886
    BiliClient.prefs.v886preserveAutoRatio886 = !current
    AppToast.show(this, "Preserve Auto Ratio886: ${if (!current) "ON" else "OFF"}")
}

// v886: Press Auto Hold886
internal fun PlayerActivity.showV886PressAutoHold886Toggle() {
    val current = BiliClient.prefs.v886pressAutoHold886
    BiliClient.prefs.v886pressAutoHold886 = !current
    AppToast.show(this, "Press Auto Hold886: ${if (!current) "ON" else "OFF"}")
}

// v886: Prev Auto Track886
internal fun PlayerActivity.showV886PrevAutoTrack886Toggle() {
    val current = BiliClient.prefs.v886prevAutoTrack886
    BiliClient.prefs.v886prevAutoTrack886 = !current
    AppToast.show(this, "Prev Auto Track886: ${if (!current) "ON" else "OFF"}")
}

// v886: Prevent Auto Overscroll886
internal fun PlayerActivity.showV886PreventAutoOverscroll886Toggle() {
    val current = BiliClient.prefs.v886preventAutoOverscroll886
    BiliClient.prefs.v886preventAutoOverscroll886 = !current
    AppToast.show(this, "Prevent Auto Overscroll886: ${if (!current) "ON" else "OFF"}")
}

// v886: Preview Auto Thumbnail886
internal fun PlayerActivity.showV886PreviewAutoThumbnail886Toggle() {
    val current = BiliClient.prefs.v886previewAutoThumbnail886
    BiliClient.prefs.v886previewAutoThumbnail886 = !current
    AppToast.show(this, "Preview Auto Thumbnail886: ${if (!current) "ON" else "OFF"}")
}

// v886: Primary Auto Source886
internal fun PlayerActivity.showV886PrimaryAutoSource886Toggle() {
    val current = BiliClient.prefs.v886primaryAutoSource886
    BiliClient.prefs.v886primaryAutoSource886 = !current
    AppToast.show(this, "Primary Auto Source886: ${if (!current) "ON" else "OFF"}")
}

// v886: Print Auto Log886
internal fun PlayerActivity.showV886PrintAutoLog886Toggle() {
    val current = BiliClient.prefs.v886printAutoLog886
    BiliClient.prefs.v886printAutoLog886 = !current
    AppToast.show(this, "Print Auto Log886: ${if (!current) "ON" else "OFF"}")
}

// v886: Priority Auto Queue886
internal fun PlayerActivity.showV886PriorityAutoQueue886Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v886priorityAutoQueue886).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue886",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v886priorityAutoQueue886 = value
        AppToast.show(this, "Priority Auto Queue886: $value")
    }
}

// v886: Private Auto Incognito886
internal fun PlayerActivity.showV886PrivateAutoIncognito886Toggle() {
    val current = BiliClient.prefs.v886privateAutoIncognito886
    BiliClient.prefs.v886privateAutoIncognito886 = !current
    AppToast.show(this, "Private Auto Incognito886: ${if (!current) "ON" else "OFF"}")
}

// v886: Process Auto Thread886
internal fun PlayerActivity.showV886ProcessAutoThread886Toggle() {
    val current = BiliClient.prefs.v886processAutoThread886
    BiliClient.prefs.v886processAutoThread886 = !current
    AppToast.show(this, "Process Auto Thread886: ${if (!current) "ON" else "OFF"}")
}

// v886: Produce Auto Generate886
internal fun PlayerActivity.showV886ProduceAutoGenerate886Toggle() {
    val current = BiliClient.prefs.v886produceAutoGenerate886
    BiliClient.prefs.v886produceAutoGenerate886 = !current
    AppToast.show(this, "Produce Auto Generate886: ${if (!current) "ON" else "OFF"}")
}

// v886: Profile Auto Switch886
internal fun PlayerActivity.showV886ProfileAutoSwitch886Toggle() {
    val current = BiliClient.prefs.v886profileAutoSwitch886
    BiliClient.prefs.v886profileAutoSwitch886 = !current
    AppToast.show(this, "Profile Auto Switch886: ${if (!current) "ON" else "OFF"}")
}

// v886: Program Auto Schedule886
internal fun PlayerActivity.showV886ProgramAutoSchedule886Toggle() {
    val current = BiliClient.prefs.v886programAutoSchedule886
    BiliClient.prefs.v886programAutoSchedule886 = !current
    AppToast.show(this, "Program Auto Schedule886: ${if (!current) "ON" else "OFF"}")
}

// v887: Prepare Auto Buffer887
internal fun PlayerActivity.showV887PrepareAutoBuffer887Toggle() {
    val current = BiliClient.prefs.v887prepareAutoBuffer887
    BiliClient.prefs.v887prepareAutoBuffer887 = !current
    AppToast.show(this, "Prepare Auto Buffer887: ${if (!current) "ON" else "OFF"}")
}

// v887: Present Auto Animate887
internal fun PlayerActivity.showV887PresentAutoAnimate887Toggle() {
    val current = BiliClient.prefs.v887presentAutoAnimate887
    BiliClient.prefs.v887presentAutoAnimate887 = !current
    AppToast.show(this, "Present Auto Animate887: ${if (!current) "ON" else "OFF"}")
}

// v887: Preserve Auto Ratio887
internal fun PlayerActivity.showV887PreserveAutoRatio887Toggle() {
    val current = BiliClient.prefs.v887preserveAutoRatio887
    BiliClient.prefs.v887preserveAutoRatio887 = !current
    AppToast.show(this, "Preserve Auto Ratio887: ${if (!current) "ON" else "OFF"}")
}

// v887: Press Auto Hold887
internal fun PlayerActivity.showV887PressAutoHold887Toggle() {
    val current = BiliClient.prefs.v887pressAutoHold887
    BiliClient.prefs.v887pressAutoHold887 = !current
    AppToast.show(this, "Press Auto Hold887: ${if (!current) "ON" else "OFF"}")
}

// v887: Prev Auto Track887
internal fun PlayerActivity.showV887PrevAutoTrack887Toggle() {
    val current = BiliClient.prefs.v887prevAutoTrack887
    BiliClient.prefs.v887prevAutoTrack887 = !current
    AppToast.show(this, "Prev Auto Track887: ${if (!current) "ON" else "OFF"}")
}

// v887: Prevent Auto Overscroll887
internal fun PlayerActivity.showV887PreventAutoOverscroll887Toggle() {
    val current = BiliClient.prefs.v887preventAutoOverscroll887
    BiliClient.prefs.v887preventAutoOverscroll887 = !current
    AppToast.show(this, "Prevent Auto Overscroll887: ${if (!current) "ON" else "OFF"}")
}

// v887: Preview Auto Thumbnail887
internal fun PlayerActivity.showV887PreviewAutoThumbnail887Toggle() {
    val current = BiliClient.prefs.v887previewAutoThumbnail887
    BiliClient.prefs.v887previewAutoThumbnail887 = !current
    AppToast.show(this, "Preview Auto Thumbnail887: ${if (!current) "ON" else "OFF"}")
}

// v887: Primary Auto Source887
internal fun PlayerActivity.showV887PrimaryAutoSource887Toggle() {
    val current = BiliClient.prefs.v887primaryAutoSource887
    BiliClient.prefs.v887primaryAutoSource887 = !current
    AppToast.show(this, "Primary Auto Source887: ${if (!current) "ON" else "OFF"}")
}

// v887: Print Auto Log887
internal fun PlayerActivity.showV887PrintAutoLog887Toggle() {
    val current = BiliClient.prefs.v887printAutoLog887
    BiliClient.prefs.v887printAutoLog887 = !current
    AppToast.show(this, "Print Auto Log887: ${if (!current) "ON" else "OFF"}")
}

// v887: Priority Auto Queue887
internal fun PlayerActivity.showV887PriorityAutoQueue887Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v887priorityAutoQueue887).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue887",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v887priorityAutoQueue887 = value
        AppToast.show(this, "Priority Auto Queue887: $value")
    }
}

// v887: Private Auto Incognito887
internal fun PlayerActivity.showV887PrivateAutoIncognito887Toggle() {
    val current = BiliClient.prefs.v887privateAutoIncognito887
    BiliClient.prefs.v887privateAutoIncognito887 = !current
    AppToast.show(this, "Private Auto Incognito887: ${if (!current) "ON" else "OFF"}")
}

// v887: Process Auto Thread887
internal fun PlayerActivity.showV887ProcessAutoThread887Toggle() {
    val current = BiliClient.prefs.v887processAutoThread887
    BiliClient.prefs.v887processAutoThread887 = !current
    AppToast.show(this, "Process Auto Thread887: ${if (!current) "ON" else "OFF"}")
}

// v887: Produce Auto Generate887
internal fun PlayerActivity.showV887ProduceAutoGenerate887Toggle() {
    val current = BiliClient.prefs.v887produceAutoGenerate887
    BiliClient.prefs.v887produceAutoGenerate887 = !current
    AppToast.show(this, "Produce Auto Generate887: ${if (!current) "ON" else "OFF"}")
}

// v887: Profile Auto Switch887
internal fun PlayerActivity.showV887ProfileAutoSwitch887Toggle() {
    val current = BiliClient.prefs.v887profileAutoSwitch887
    BiliClient.prefs.v887profileAutoSwitch887 = !current
    AppToast.show(this, "Profile Auto Switch887: ${if (!current) "ON" else "OFF"}")
}

// v887: Program Auto Schedule887
internal fun PlayerActivity.showV887ProgramAutoSchedule887Toggle() {
    val current = BiliClient.prefs.v887programAutoSchedule887
    BiliClient.prefs.v887programAutoSchedule887 = !current
    AppToast.show(this, "Program Auto Schedule887: ${if (!current) "ON" else "OFF"}")
}

// v888: Prepare Auto Buffer888
internal fun PlayerActivity.showV888PrepareAutoBuffer888Toggle() {
    val current = BiliClient.prefs.v888prepareAutoBuffer888
    BiliClient.prefs.v888prepareAutoBuffer888 = !current
    AppToast.show(this, "Prepare Auto Buffer888: ${if (!current) "ON" else "OFF"}")
}

// v888: Present Auto Animate888
internal fun PlayerActivity.showV888PresentAutoAnimate888Toggle() {
    val current = BiliClient.prefs.v888presentAutoAnimate888
    BiliClient.prefs.v888presentAutoAnimate888 = !current
    AppToast.show(this, "Present Auto Animate888: ${if (!current) "ON" else "OFF"}")
}

// v888: Preserve Auto Ratio888
internal fun PlayerActivity.showV888PreserveAutoRatio888Toggle() {
    val current = BiliClient.prefs.v888preserveAutoRatio888
    BiliClient.prefs.v888preserveAutoRatio888 = !current
    AppToast.show(this, "Preserve Auto Ratio888: ${if (!current) "ON" else "OFF"}")
}

// v888: Press Auto Hold888
internal fun PlayerActivity.showV888PressAutoHold888Toggle() {
    val current = BiliClient.prefs.v888pressAutoHold888
    BiliClient.prefs.v888pressAutoHold888 = !current
    AppToast.show(this, "Press Auto Hold888: ${if (!current) "ON" else "OFF"}")
}

// v888: Prev Auto Track888
internal fun PlayerActivity.showV888PrevAutoTrack888Toggle() {
    val current = BiliClient.prefs.v888prevAutoTrack888
    BiliClient.prefs.v888prevAutoTrack888 = !current
    AppToast.show(this, "Prev Auto Track888: ${if (!current) "ON" else "OFF"}")
}

// v888: Prevent Auto Overscroll888
internal fun PlayerActivity.showV888PreventAutoOverscroll888Toggle() {
    val current = BiliClient.prefs.v888preventAutoOverscroll888
    BiliClient.prefs.v888preventAutoOverscroll888 = !current
    AppToast.show(this, "Prevent Auto Overscroll888: ${if (!current) "ON" else "OFF"}")
}

// v888: Preview Auto Thumbnail888
internal fun PlayerActivity.showV888PreviewAutoThumbnail888Toggle() {
    val current = BiliClient.prefs.v888previewAutoThumbnail888
    BiliClient.prefs.v888previewAutoThumbnail888 = !current
    AppToast.show(this, "Preview Auto Thumbnail888: ${if (!current) "ON" else "OFF"}")
}

// v888: Primary Auto Source888
internal fun PlayerActivity.showV888PrimaryAutoSource888Toggle() {
    val current = BiliClient.prefs.v888primaryAutoSource888
    BiliClient.prefs.v888primaryAutoSource888 = !current
    AppToast.show(this, "Primary Auto Source888: ${if (!current) "ON" else "OFF"}")
}

// v888: Print Auto Log888
internal fun PlayerActivity.showV888PrintAutoLog888Toggle() {
    val current = BiliClient.prefs.v888printAutoLog888
    BiliClient.prefs.v888printAutoLog888 = !current
    AppToast.show(this, "Print Auto Log888: ${if (!current) "ON" else "OFF"}")
}

// v888: Priority Auto Queue888
internal fun PlayerActivity.showV888PriorityAutoQueue888Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v888priorityAutoQueue888).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue888",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v888priorityAutoQueue888 = value
        AppToast.show(this, "Priority Auto Queue888: $value")
    }
}

// v888: Private Auto Incognito888
internal fun PlayerActivity.showV888PrivateAutoIncognito888Toggle() {
    val current = BiliClient.prefs.v888privateAutoIncognito888
    BiliClient.prefs.v888privateAutoIncognito888 = !current
    AppToast.show(this, "Private Auto Incognito888: ${if (!current) "ON" else "OFF"}")
}

// v888: Process Auto Thread888
internal fun PlayerActivity.showV888ProcessAutoThread888Toggle() {
    val current = BiliClient.prefs.v888processAutoThread888
    BiliClient.prefs.v888processAutoThread888 = !current
    AppToast.show(this, "Process Auto Thread888: ${if (!current) "ON" else "OFF"}")
}

// v888: Produce Auto Generate888
internal fun PlayerActivity.showV888ProduceAutoGenerate888Toggle() {
    val current = BiliClient.prefs.v888produceAutoGenerate888
    BiliClient.prefs.v888produceAutoGenerate888 = !current
    AppToast.show(this, "Produce Auto Generate888: ${if (!current) "ON" else "OFF"}")
}

// v888: Profile Auto Switch888
internal fun PlayerActivity.showV888ProfileAutoSwitch888Toggle() {
    val current = BiliClient.prefs.v888profileAutoSwitch888
    BiliClient.prefs.v888profileAutoSwitch888 = !current
    AppToast.show(this, "Profile Auto Switch888: ${if (!current) "ON" else "OFF"}")
}

// v888: Program Auto Schedule888
internal fun PlayerActivity.showV888ProgramAutoSchedule888Toggle() {
    val current = BiliClient.prefs.v888programAutoSchedule888
    BiliClient.prefs.v888programAutoSchedule888 = !current
    AppToast.show(this, "Program Auto Schedule888: ${if (!current) "ON" else "OFF"}")
}

// v889: Prepare Auto Buffer889
internal fun PlayerActivity.showV889PrepareAutoBuffer889Toggle() {
    val current = BiliClient.prefs.v889prepareAutoBuffer889
    BiliClient.prefs.v889prepareAutoBuffer889 = !current
    AppToast.show(this, "Prepare Auto Buffer889: ${if (!current) "ON" else "OFF"}")
}

// v889: Present Auto Animate889
internal fun PlayerActivity.showV889PresentAutoAnimate889Toggle() {
    val current = BiliClient.prefs.v889presentAutoAnimate889
    BiliClient.prefs.v889presentAutoAnimate889 = !current
    AppToast.show(this, "Present Auto Animate889: ${if (!current) "ON" else "OFF"}")
}

// v889: Preserve Auto Ratio889
internal fun PlayerActivity.showV889PreserveAutoRatio889Toggle() {
    val current = BiliClient.prefs.v889preserveAutoRatio889
    BiliClient.prefs.v889preserveAutoRatio889 = !current
    AppToast.show(this, "Preserve Auto Ratio889: ${if (!current) "ON" else "OFF"}")
}

// v889: Press Auto Hold889
internal fun PlayerActivity.showV889PressAutoHold889Toggle() {
    val current = BiliClient.prefs.v889pressAutoHold889
    BiliClient.prefs.v889pressAutoHold889 = !current
    AppToast.show(this, "Press Auto Hold889: ${if (!current) "ON" else "OFF"}")
}

// v889: Prev Auto Track889
internal fun PlayerActivity.showV889PrevAutoTrack889Toggle() {
    val current = BiliClient.prefs.v889prevAutoTrack889
    BiliClient.prefs.v889prevAutoTrack889 = !current
    AppToast.show(this, "Prev Auto Track889: ${if (!current) "ON" else "OFF"}")
}

// v889: Prevent Auto Overscroll889
internal fun PlayerActivity.showV889PreventAutoOverscroll889Toggle() {
    val current = BiliClient.prefs.v889preventAutoOverscroll889
    BiliClient.prefs.v889preventAutoOverscroll889 = !current
    AppToast.show(this, "Prevent Auto Overscroll889: ${if (!current) "ON" else "OFF"}")
}

// v889: Preview Auto Thumbnail889
internal fun PlayerActivity.showV889PreviewAutoThumbnail889Toggle() {
    val current = BiliClient.prefs.v889previewAutoThumbnail889
    BiliClient.prefs.v889previewAutoThumbnail889 = !current
    AppToast.show(this, "Preview Auto Thumbnail889: ${if (!current) "ON" else "OFF"}")
}

// v889: Primary Auto Source889
internal fun PlayerActivity.showV889PrimaryAutoSource889Toggle() {
    val current = BiliClient.prefs.v889primaryAutoSource889
    BiliClient.prefs.v889primaryAutoSource889 = !current
    AppToast.show(this, "Primary Auto Source889: ${if (!current) "ON" else "OFF"}")
}

// v889: Print Auto Log889
internal fun PlayerActivity.showV889PrintAutoLog889Toggle() {
    val current = BiliClient.prefs.v889printAutoLog889
    BiliClient.prefs.v889printAutoLog889 = !current
    AppToast.show(this, "Print Auto Log889: ${if (!current) "ON" else "OFF"}")
}

// v889: Priority Auto Queue889
internal fun PlayerActivity.showV889PriorityAutoQueue889Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v889priorityAutoQueue889).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue889",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v889priorityAutoQueue889 = value
        AppToast.show(this, "Priority Auto Queue889: $value")
    }
}

// v889: Private Auto Incognito889
internal fun PlayerActivity.showV889PrivateAutoIncognito889Toggle() {
    val current = BiliClient.prefs.v889privateAutoIncognito889
    BiliClient.prefs.v889privateAutoIncognito889 = !current
    AppToast.show(this, "Private Auto Incognito889: ${if (!current) "ON" else "OFF"}")
}

// v889: Process Auto Thread889
internal fun PlayerActivity.showV889ProcessAutoThread889Toggle() {
    val current = BiliClient.prefs.v889processAutoThread889
    BiliClient.prefs.v889processAutoThread889 = !current
    AppToast.show(this, "Process Auto Thread889: ${if (!current) "ON" else "OFF"}")
}

// v889: Produce Auto Generate889
internal fun PlayerActivity.showV889ProduceAutoGenerate889Toggle() {
    val current = BiliClient.prefs.v889produceAutoGenerate889
    BiliClient.prefs.v889produceAutoGenerate889 = !current
    AppToast.show(this, "Produce Auto Generate889: ${if (!current) "ON" else "OFF"}")
}

// v889: Profile Auto Switch889
internal fun PlayerActivity.showV889ProfileAutoSwitch889Toggle() {
    val current = BiliClient.prefs.v889profileAutoSwitch889
    BiliClient.prefs.v889profileAutoSwitch889 = !current
    AppToast.show(this, "Profile Auto Switch889: ${if (!current) "ON" else "OFF"}")
}

// v889: Program Auto Schedule889
internal fun PlayerActivity.showV889ProgramAutoSchedule889Toggle() {
    val current = BiliClient.prefs.v889programAutoSchedule889
    BiliClient.prefs.v889programAutoSchedule889 = !current
    AppToast.show(this, "Program Auto Schedule889: ${if (!current) "ON" else "OFF"}")
}

// v890: Prepare Auto Buffer890
internal fun PlayerActivity.showV890PrepareAutoBuffer890Toggle() {
    val current = BiliClient.prefs.v890prepareAutoBuffer890
    BiliClient.prefs.v890prepareAutoBuffer890 = !current
    AppToast.show(this, "Prepare Auto Buffer890: ${if (!current) "ON" else "OFF"}")
}

// v890: Present Auto Animate890
internal fun PlayerActivity.showV890PresentAutoAnimate890Toggle() {
    val current = BiliClient.prefs.v890presentAutoAnimate890
    BiliClient.prefs.v890presentAutoAnimate890 = !current
    AppToast.show(this, "Present Auto Animate890: ${if (!current) "ON" else "OFF"}")
}

// v890: Preserve Auto Ratio890
internal fun PlayerActivity.showV890PreserveAutoRatio890Toggle() {
    val current = BiliClient.prefs.v890preserveAutoRatio890
    BiliClient.prefs.v890preserveAutoRatio890 = !current
    AppToast.show(this, "Preserve Auto Ratio890: ${if (!current) "ON" else "OFF"}")
}

// v890: Press Auto Hold890
internal fun PlayerActivity.showV890PressAutoHold890Toggle() {
    val current = BiliClient.prefs.v890pressAutoHold890
    BiliClient.prefs.v890pressAutoHold890 = !current
    AppToast.show(this, "Press Auto Hold890: ${if (!current) "ON" else "OFF"}")
}

// v890: Prev Auto Track890
internal fun PlayerActivity.showV890PrevAutoTrack890Toggle() {
    val current = BiliClient.prefs.v890prevAutoTrack890
    BiliClient.prefs.v890prevAutoTrack890 = !current
    AppToast.show(this, "Prev Auto Track890: ${if (!current) "ON" else "OFF"}")
}

// v890: Prevent Auto Overscroll890
internal fun PlayerActivity.showV890PreventAutoOverscroll890Toggle() {
    val current = BiliClient.prefs.v890preventAutoOverscroll890
    BiliClient.prefs.v890preventAutoOverscroll890 = !current
    AppToast.show(this, "Prevent Auto Overscroll890: ${if (!current) "ON" else "OFF"}")
}

// v890: Preview Auto Thumbnail890
internal fun PlayerActivity.showV890PreviewAutoThumbnail890Toggle() {
    val current = BiliClient.prefs.v890previewAutoThumbnail890
    BiliClient.prefs.v890previewAutoThumbnail890 = !current
    AppToast.show(this, "Preview Auto Thumbnail890: ${if (!current) "ON" else "OFF"}")
}

// v890: Primary Auto Source890
internal fun PlayerActivity.showV890PrimaryAutoSource890Toggle() {
    val current = BiliClient.prefs.v890primaryAutoSource890
    BiliClient.prefs.v890primaryAutoSource890 = !current
    AppToast.show(this, "Primary Auto Source890: ${if (!current) "ON" else "OFF"}")
}

// v890: Print Auto Log890
internal fun PlayerActivity.showV890PrintAutoLog890Toggle() {
    val current = BiliClient.prefs.v890printAutoLog890
    BiliClient.prefs.v890printAutoLog890 = !current
    AppToast.show(this, "Print Auto Log890: ${if (!current) "ON" else "OFF"}")
}

// v890: Priority Auto Queue890
internal fun PlayerActivity.showV890PriorityAutoQueue890Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v890priorityAutoQueue890).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Priority Auto Queue890",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v890priorityAutoQueue890 = value
        AppToast.show(this, "Priority Auto Queue890: $value")
    }
}

// v890: Private Auto Incognito890
internal fun PlayerActivity.showV890PrivateAutoIncognito890Toggle() {
    val current = BiliClient.prefs.v890privateAutoIncognito890
    BiliClient.prefs.v890privateAutoIncognito890 = !current
    AppToast.show(this, "Private Auto Incognito890: ${if (!current) "ON" else "OFF"}")
}

// v890: Process Auto Thread890
internal fun PlayerActivity.showV890ProcessAutoThread890Toggle() {
    val current = BiliClient.prefs.v890processAutoThread890
    BiliClient.prefs.v890processAutoThread890 = !current
    AppToast.show(this, "Process Auto Thread890: ${if (!current) "ON" else "OFF"}")
}

// v890: Produce Auto Generate890
internal fun PlayerActivity.showV890ProduceAutoGenerate890Toggle() {
    val current = BiliClient.prefs.v890produceAutoGenerate890
    BiliClient.prefs.v890produceAutoGenerate890 = !current
    AppToast.show(this, "Produce Auto Generate890: ${if (!current) "ON" else "OFF"}")
}

// v890: Profile Auto Switch890
internal fun PlayerActivity.showV890ProfileAutoSwitch890Toggle() {
    val current = BiliClient.prefs.v890profileAutoSwitch890
    BiliClient.prefs.v890profileAutoSwitch890 = !current
    AppToast.show(this, "Profile Auto Switch890: ${if (!current) "ON" else "OFF"}")
}

// v890: Program Auto Schedule890
internal fun PlayerActivity.showV890ProgramAutoSchedule890Toggle() {
    val current = BiliClient.prefs.v890programAutoSchedule890
    BiliClient.prefs.v890programAutoSchedule890 = !current
    AppToast.show(this, "Program Auto Schedule890: ${if (!current) "ON" else "OFF"}")
}

