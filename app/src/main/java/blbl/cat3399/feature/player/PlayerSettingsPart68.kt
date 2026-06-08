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

// v861: Permission Auto Grant861
internal fun PlayerActivity.showV861PermissionAutoGrant861Toggle() {
    val current = BiliClient.prefs.v861permissionAutoGrant861
    BiliClient.prefs.v861permissionAutoGrant861 = !current
    AppToast.show(this, "Permission Auto Grant861: ${if (!current) "ON" else "OFF"}")
}

// v861: Persist Auto State861
internal fun PlayerActivity.showV861PersistAutoState861Toggle() {
    val current = BiliClient.prefs.v861persistAutoState861
    BiliClient.prefs.v861persistAutoState861 = !current
    AppToast.show(this, "Persist Auto State861: ${if (!current) "ON" else "OFF"}")
}

// v861: Phase Auto Transition861
internal fun PlayerActivity.showV861PhaseAutoTransition861Toggle() {
    val current = BiliClient.prefs.v861phaseAutoTransition861
    BiliClient.prefs.v861phaseAutoTransition861 = !current
    AppToast.show(this, "Phase Auto Transition861: ${if (!current) "ON" else "OFF"}")
}

// v861: Phone Auto Detect861
internal fun PlayerActivity.showV861PhoneAutoDetect861Toggle() {
    val current = BiliClient.prefs.v861phoneAutoDetect861
    BiliClient.prefs.v861phoneAutoDetect861 = !current
    AppToast.show(this, "Phone Auto Detect861: ${if (!current) "ON" else "OFF"}")
}

// v861: Photo Auto Compress861
internal fun PlayerActivity.showV861PhotoAutoCompress861Toggle() {
    val current = BiliClient.prefs.v861photoAutoCompress861
    BiliClient.prefs.v861photoAutoCompress861 = !current
    AppToast.show(this, "Photo Auto Compress861: ${if (!current) "ON" else "OFF"}")
}

// v861: Phrase Auto Complete861
internal fun PlayerActivity.showV861PhraseAutoComplete861Toggle() {
    val current = BiliClient.prefs.v861phraseAutoComplete861
    BiliClient.prefs.v861phraseAutoComplete861 = !current
    AppToast.show(this, "Phrase Auto Complete861: ${if (!current) "ON" else "OFF"}")
}

// v861: Pick Auto Random861
internal fun PlayerActivity.showV861PickAutoRandom861Toggle() {
    val current = BiliClient.prefs.v861pickAutoRandom861
    BiliClient.prefs.v861pickAutoRandom861 = !current
    AppToast.show(this, "Pick Auto Random861: ${if (!current) "ON" else "OFF"}")
}

// v861: Picture Auto Thumbnail861
internal fun PlayerActivity.showV861PictureAutoThumbnail861Toggle() {
    val current = BiliClient.prefs.v861pictureAutoThumbnail861
    BiliClient.prefs.v861pictureAutoThumbnail861 = !current
    AppToast.show(this, "Picture Auto Thumbnail861: ${if (!current) "ON" else "OFF"}")
}

// v861: Pin Auto Top861
internal fun PlayerActivity.showV861PinAutoTop861Toggle() {
    val current = BiliClient.prefs.v861pinAutoTop861
    BiliClient.prefs.v861pinAutoTop861 = !current
    AppToast.show(this, "Pin Auto Top861: ${if (!current) "ON" else "OFF"}")
}

// v861: Pipe Auto Redirect861
internal fun PlayerActivity.showV861PipeAutoRedirect861Toggle() {
    val current = BiliClient.prefs.v861pipeAutoRedirect861
    BiliClient.prefs.v861pipeAutoRedirect861 = !current
    AppToast.show(this, "Pipe Auto Redirect861: ${if (!current) "ON" else "OFF"}")
}

// v861: Pitch Auto Correct861
internal fun PlayerActivity.showV861PitchAutoCorrect861Toggle() {
    val current = BiliClient.prefs.v861pitchAutoCorrect861
    BiliClient.prefs.v861pitchAutoCorrect861 = !current
    AppToast.show(this, "Pitch Auto Correct861: ${if (!current) "ON" else "OFF"}")
}

// v861: Pixel Auto Snap861
internal fun PlayerActivity.showV861PixelAutoSnap861Toggle() {
    val current = BiliClient.prefs.v861pixelAutoSnap861
    BiliClient.prefs.v861pixelAutoSnap861 = !current
    AppToast.show(this, "Pixel Auto Snap861: ${if (!current) "ON" else "OFF"}")
}

// v861: Place Auto Holder861
internal fun PlayerActivity.showV861PlaceAutoHolder861Toggle() {
    val current = BiliClient.prefs.v861placeAutoHolder861
    BiliClient.prefs.v861placeAutoHolder861 = !current
    AppToast.show(this, "Place Auto Holder861: ${if (!current) "ON" else "OFF"}")
}

// v861: Plain Auto Text861
internal fun PlayerActivity.showV861PlainAutoText861Toggle() {
    val current = BiliClient.prefs.v861plainAutoText861
    BiliClient.prefs.v861plainAutoText861 = !current
    AppToast.show(this, "Plain Auto Text861: ${if (!current) "ON" else "OFF"}")
}

// v861: Plan Auto Schedule861
internal fun PlayerActivity.showV861PlanAutoSchedule861Toggle() {
    val current = BiliClient.prefs.v861planAutoSchedule861
    BiliClient.prefs.v861planAutoSchedule861 = !current
    AppToast.show(this, "Plan Auto Schedule861: ${if (!current) "ON" else "OFF"}")
}

// v862: Permission Auto Grant862
internal fun PlayerActivity.showV862PermissionAutoGrant862Toggle() {
    val current = BiliClient.prefs.v862permissionAutoGrant862
    BiliClient.prefs.v862permissionAutoGrant862 = !current
    AppToast.show(this, "Permission Auto Grant862: ${if (!current) "ON" else "OFF"}")
}

// v862: Persist Auto State862
internal fun PlayerActivity.showV862PersistAutoState862Toggle() {
    val current = BiliClient.prefs.v862persistAutoState862
    BiliClient.prefs.v862persistAutoState862 = !current
    AppToast.show(this, "Persist Auto State862: ${if (!current) "ON" else "OFF"}")
}

// v862: Phase Auto Transition862
internal fun PlayerActivity.showV862PhaseAutoTransition862Toggle() {
    val current = BiliClient.prefs.v862phaseAutoTransition862
    BiliClient.prefs.v862phaseAutoTransition862 = !current
    AppToast.show(this, "Phase Auto Transition862: ${if (!current) "ON" else "OFF"}")
}

// v862: Phone Auto Detect862
internal fun PlayerActivity.showV862PhoneAutoDetect862Toggle() {
    val current = BiliClient.prefs.v862phoneAutoDetect862
    BiliClient.prefs.v862phoneAutoDetect862 = !current
    AppToast.show(this, "Phone Auto Detect862: ${if (!current) "ON" else "OFF"}")
}

// v862: Photo Auto Compress862
internal fun PlayerActivity.showV862PhotoAutoCompress862Toggle() {
    val current = BiliClient.prefs.v862photoAutoCompress862
    BiliClient.prefs.v862photoAutoCompress862 = !current
    AppToast.show(this, "Photo Auto Compress862: ${if (!current) "ON" else "OFF"}")
}

// v862: Phrase Auto Complete862
internal fun PlayerActivity.showV862PhraseAutoComplete862Toggle() {
    val current = BiliClient.prefs.v862phraseAutoComplete862
    BiliClient.prefs.v862phraseAutoComplete862 = !current
    AppToast.show(this, "Phrase Auto Complete862: ${if (!current) "ON" else "OFF"}")
}

// v862: Pick Auto Random862
internal fun PlayerActivity.showV862PickAutoRandom862Toggle() {
    val current = BiliClient.prefs.v862pickAutoRandom862
    BiliClient.prefs.v862pickAutoRandom862 = !current
    AppToast.show(this, "Pick Auto Random862: ${if (!current) "ON" else "OFF"}")
}

// v862: Picture Auto Thumbnail862
internal fun PlayerActivity.showV862PictureAutoThumbnail862Toggle() {
    val current = BiliClient.prefs.v862pictureAutoThumbnail862
    BiliClient.prefs.v862pictureAutoThumbnail862 = !current
    AppToast.show(this, "Picture Auto Thumbnail862: ${if (!current) "ON" else "OFF"}")
}

// v862: Pin Auto Top862
internal fun PlayerActivity.showV862PinAutoTop862Toggle() {
    val current = BiliClient.prefs.v862pinAutoTop862
    BiliClient.prefs.v862pinAutoTop862 = !current
    AppToast.show(this, "Pin Auto Top862: ${if (!current) "ON" else "OFF"}")
}

// v862: Pipe Auto Redirect862
internal fun PlayerActivity.showV862PipeAutoRedirect862Toggle() {
    val current = BiliClient.prefs.v862pipeAutoRedirect862
    BiliClient.prefs.v862pipeAutoRedirect862 = !current
    AppToast.show(this, "Pipe Auto Redirect862: ${if (!current) "ON" else "OFF"}")
}

// v862: Pitch Auto Correct862
internal fun PlayerActivity.showV862PitchAutoCorrect862Toggle() {
    val current = BiliClient.prefs.v862pitchAutoCorrect862
    BiliClient.prefs.v862pitchAutoCorrect862 = !current
    AppToast.show(this, "Pitch Auto Correct862: ${if (!current) "ON" else "OFF"}")
}

// v862: Pixel Auto Snap862
internal fun PlayerActivity.showV862PixelAutoSnap862Toggle() {
    val current = BiliClient.prefs.v862pixelAutoSnap862
    BiliClient.prefs.v862pixelAutoSnap862 = !current
    AppToast.show(this, "Pixel Auto Snap862: ${if (!current) "ON" else "OFF"}")
}

// v862: Place Auto Holder862
internal fun PlayerActivity.showV862PlaceAutoHolder862Toggle() {
    val current = BiliClient.prefs.v862placeAutoHolder862
    BiliClient.prefs.v862placeAutoHolder862 = !current
    AppToast.show(this, "Place Auto Holder862: ${if (!current) "ON" else "OFF"}")
}

// v862: Plain Auto Text862
internal fun PlayerActivity.showV862PlainAutoText862Toggle() {
    val current = BiliClient.prefs.v862plainAutoText862
    BiliClient.prefs.v862plainAutoText862 = !current
    AppToast.show(this, "Plain Auto Text862: ${if (!current) "ON" else "OFF"}")
}

// v862: Plan Auto Schedule862
internal fun PlayerActivity.showV862PlanAutoSchedule862Toggle() {
    val current = BiliClient.prefs.v862planAutoSchedule862
    BiliClient.prefs.v862planAutoSchedule862 = !current
    AppToast.show(this, "Plan Auto Schedule862: ${if (!current) "ON" else "OFF"}")
}

// v863: Permission Auto Grant863
internal fun PlayerActivity.showV863PermissionAutoGrant863Toggle() {
    val current = BiliClient.prefs.v863permissionAutoGrant863
    BiliClient.prefs.v863permissionAutoGrant863 = !current
    AppToast.show(this, "Permission Auto Grant863: ${if (!current) "ON" else "OFF"}")
}

// v863: Persist Auto State863
internal fun PlayerActivity.showV863PersistAutoState863Toggle() {
    val current = BiliClient.prefs.v863persistAutoState863
    BiliClient.prefs.v863persistAutoState863 = !current
    AppToast.show(this, "Persist Auto State863: ${if (!current) "ON" else "OFF"}")
}

// v863: Phase Auto Transition863
internal fun PlayerActivity.showV863PhaseAutoTransition863Toggle() {
    val current = BiliClient.prefs.v863phaseAutoTransition863
    BiliClient.prefs.v863phaseAutoTransition863 = !current
    AppToast.show(this, "Phase Auto Transition863: ${if (!current) "ON" else "OFF"}")
}

// v863: Phone Auto Detect863
internal fun PlayerActivity.showV863PhoneAutoDetect863Toggle() {
    val current = BiliClient.prefs.v863phoneAutoDetect863
    BiliClient.prefs.v863phoneAutoDetect863 = !current
    AppToast.show(this, "Phone Auto Detect863: ${if (!current) "ON" else "OFF"}")
}

// v863: Photo Auto Compress863
internal fun PlayerActivity.showV863PhotoAutoCompress863Toggle() {
    val current = BiliClient.prefs.v863photoAutoCompress863
    BiliClient.prefs.v863photoAutoCompress863 = !current
    AppToast.show(this, "Photo Auto Compress863: ${if (!current) "ON" else "OFF"}")
}

// v863: Phrase Auto Complete863
internal fun PlayerActivity.showV863PhraseAutoComplete863Toggle() {
    val current = BiliClient.prefs.v863phraseAutoComplete863
    BiliClient.prefs.v863phraseAutoComplete863 = !current
    AppToast.show(this, "Phrase Auto Complete863: ${if (!current) "ON" else "OFF"}")
}

// v863: Pick Auto Random863
internal fun PlayerActivity.showV863PickAutoRandom863Toggle() {
    val current = BiliClient.prefs.v863pickAutoRandom863
    BiliClient.prefs.v863pickAutoRandom863 = !current
    AppToast.show(this, "Pick Auto Random863: ${if (!current) "ON" else "OFF"}")
}

// v863: Picture Auto Thumbnail863
internal fun PlayerActivity.showV863PictureAutoThumbnail863Toggle() {
    val current = BiliClient.prefs.v863pictureAutoThumbnail863
    BiliClient.prefs.v863pictureAutoThumbnail863 = !current
    AppToast.show(this, "Picture Auto Thumbnail863: ${if (!current) "ON" else "OFF"}")
}

// v863: Pin Auto Top863
internal fun PlayerActivity.showV863PinAutoTop863Toggle() {
    val current = BiliClient.prefs.v863pinAutoTop863
    BiliClient.prefs.v863pinAutoTop863 = !current
    AppToast.show(this, "Pin Auto Top863: ${if (!current) "ON" else "OFF"}")
}

// v863: Pipe Auto Redirect863
internal fun PlayerActivity.showV863PipeAutoRedirect863Toggle() {
    val current = BiliClient.prefs.v863pipeAutoRedirect863
    BiliClient.prefs.v863pipeAutoRedirect863 = !current
    AppToast.show(this, "Pipe Auto Redirect863: ${if (!current) "ON" else "OFF"}")
}

// v863: Pitch Auto Correct863
internal fun PlayerActivity.showV863PitchAutoCorrect863Toggle() {
    val current = BiliClient.prefs.v863pitchAutoCorrect863
    BiliClient.prefs.v863pitchAutoCorrect863 = !current
    AppToast.show(this, "Pitch Auto Correct863: ${if (!current) "ON" else "OFF"}")
}

// v863: Pixel Auto Snap863
internal fun PlayerActivity.showV863PixelAutoSnap863Toggle() {
    val current = BiliClient.prefs.v863pixelAutoSnap863
    BiliClient.prefs.v863pixelAutoSnap863 = !current
    AppToast.show(this, "Pixel Auto Snap863: ${if (!current) "ON" else "OFF"}")
}

// v863: Place Auto Holder863
internal fun PlayerActivity.showV863PlaceAutoHolder863Toggle() {
    val current = BiliClient.prefs.v863placeAutoHolder863
    BiliClient.prefs.v863placeAutoHolder863 = !current
    AppToast.show(this, "Place Auto Holder863: ${if (!current) "ON" else "OFF"}")
}

// v863: Plain Auto Text863
internal fun PlayerActivity.showV863PlainAutoText863Toggle() {
    val current = BiliClient.prefs.v863plainAutoText863
    BiliClient.prefs.v863plainAutoText863 = !current
    AppToast.show(this, "Plain Auto Text863: ${if (!current) "ON" else "OFF"}")
}

// v863: Plan Auto Schedule863
internal fun PlayerActivity.showV863PlanAutoSchedule863Toggle() {
    val current = BiliClient.prefs.v863planAutoSchedule863
    BiliClient.prefs.v863planAutoSchedule863 = !current
    AppToast.show(this, "Plan Auto Schedule863: ${if (!current) "ON" else "OFF"}")
}

// v864: Permission Auto Grant864
internal fun PlayerActivity.showV864PermissionAutoGrant864Toggle() {
    val current = BiliClient.prefs.v864permissionAutoGrant864
    BiliClient.prefs.v864permissionAutoGrant864 = !current
    AppToast.show(this, "Permission Auto Grant864: ${if (!current) "ON" else "OFF"}")
}

// v864: Persist Auto State864
internal fun PlayerActivity.showV864PersistAutoState864Toggle() {
    val current = BiliClient.prefs.v864persistAutoState864
    BiliClient.prefs.v864persistAutoState864 = !current
    AppToast.show(this, "Persist Auto State864: ${if (!current) "ON" else "OFF"}")
}

// v864: Phase Auto Transition864
internal fun PlayerActivity.showV864PhaseAutoTransition864Toggle() {
    val current = BiliClient.prefs.v864phaseAutoTransition864
    BiliClient.prefs.v864phaseAutoTransition864 = !current
    AppToast.show(this, "Phase Auto Transition864: ${if (!current) "ON" else "OFF"}")
}

// v864: Phone Auto Detect864
internal fun PlayerActivity.showV864PhoneAutoDetect864Toggle() {
    val current = BiliClient.prefs.v864phoneAutoDetect864
    BiliClient.prefs.v864phoneAutoDetect864 = !current
    AppToast.show(this, "Phone Auto Detect864: ${if (!current) "ON" else "OFF"}")
}

// v864: Photo Auto Compress864
internal fun PlayerActivity.showV864PhotoAutoCompress864Toggle() {
    val current = BiliClient.prefs.v864photoAutoCompress864
    BiliClient.prefs.v864photoAutoCompress864 = !current
    AppToast.show(this, "Photo Auto Compress864: ${if (!current) "ON" else "OFF"}")
}

// v864: Phrase Auto Complete864
internal fun PlayerActivity.showV864PhraseAutoComplete864Toggle() {
    val current = BiliClient.prefs.v864phraseAutoComplete864
    BiliClient.prefs.v864phraseAutoComplete864 = !current
    AppToast.show(this, "Phrase Auto Complete864: ${if (!current) "ON" else "OFF"}")
}

// v864: Pick Auto Random864
internal fun PlayerActivity.showV864PickAutoRandom864Toggle() {
    val current = BiliClient.prefs.v864pickAutoRandom864
    BiliClient.prefs.v864pickAutoRandom864 = !current
    AppToast.show(this, "Pick Auto Random864: ${if (!current) "ON" else "OFF"}")
}

// v864: Picture Auto Thumbnail864
internal fun PlayerActivity.showV864PictureAutoThumbnail864Toggle() {
    val current = BiliClient.prefs.v864pictureAutoThumbnail864
    BiliClient.prefs.v864pictureAutoThumbnail864 = !current
    AppToast.show(this, "Picture Auto Thumbnail864: ${if (!current) "ON" else "OFF"}")
}

// v864: Pin Auto Top864
internal fun PlayerActivity.showV864PinAutoTop864Toggle() {
    val current = BiliClient.prefs.v864pinAutoTop864
    BiliClient.prefs.v864pinAutoTop864 = !current
    AppToast.show(this, "Pin Auto Top864: ${if (!current) "ON" else "OFF"}")
}

// v864: Pipe Auto Redirect864
internal fun PlayerActivity.showV864PipeAutoRedirect864Toggle() {
    val current = BiliClient.prefs.v864pipeAutoRedirect864
    BiliClient.prefs.v864pipeAutoRedirect864 = !current
    AppToast.show(this, "Pipe Auto Redirect864: ${if (!current) "ON" else "OFF"}")
}

// v864: Pitch Auto Correct864
internal fun PlayerActivity.showV864PitchAutoCorrect864Toggle() {
    val current = BiliClient.prefs.v864pitchAutoCorrect864
    BiliClient.prefs.v864pitchAutoCorrect864 = !current
    AppToast.show(this, "Pitch Auto Correct864: ${if (!current) "ON" else "OFF"}")
}

// v864: Pixel Auto Snap864
internal fun PlayerActivity.showV864PixelAutoSnap864Toggle() {
    val current = BiliClient.prefs.v864pixelAutoSnap864
    BiliClient.prefs.v864pixelAutoSnap864 = !current
    AppToast.show(this, "Pixel Auto Snap864: ${if (!current) "ON" else "OFF"}")
}

// v864: Place Auto Holder864
internal fun PlayerActivity.showV864PlaceAutoHolder864Toggle() {
    val current = BiliClient.prefs.v864placeAutoHolder864
    BiliClient.prefs.v864placeAutoHolder864 = !current
    AppToast.show(this, "Place Auto Holder864: ${if (!current) "ON" else "OFF"}")
}

// v864: Plain Auto Text864
internal fun PlayerActivity.showV864PlainAutoText864Toggle() {
    val current = BiliClient.prefs.v864plainAutoText864
    BiliClient.prefs.v864plainAutoText864 = !current
    AppToast.show(this, "Plain Auto Text864: ${if (!current) "ON" else "OFF"}")
}

// v864: Plan Auto Schedule864
internal fun PlayerActivity.showV864PlanAutoSchedule864Toggle() {
    val current = BiliClient.prefs.v864planAutoSchedule864
    BiliClient.prefs.v864planAutoSchedule864 = !current
    AppToast.show(this, "Plan Auto Schedule864: ${if (!current) "ON" else "OFF"}")
}

// v865: Permission Auto Grant865
internal fun PlayerActivity.showV865PermissionAutoGrant865Toggle() {
    val current = BiliClient.prefs.v865permissionAutoGrant865
    BiliClient.prefs.v865permissionAutoGrant865 = !current
    AppToast.show(this, "Permission Auto Grant865: ${if (!current) "ON" else "OFF"}")
}

// v865: Persist Auto State865
internal fun PlayerActivity.showV865PersistAutoState865Toggle() {
    val current = BiliClient.prefs.v865persistAutoState865
    BiliClient.prefs.v865persistAutoState865 = !current
    AppToast.show(this, "Persist Auto State865: ${if (!current) "ON" else "OFF"}")
}

// v865: Phase Auto Transition865
internal fun PlayerActivity.showV865PhaseAutoTransition865Toggle() {
    val current = BiliClient.prefs.v865phaseAutoTransition865
    BiliClient.prefs.v865phaseAutoTransition865 = !current
    AppToast.show(this, "Phase Auto Transition865: ${if (!current) "ON" else "OFF"}")
}

// v865: Phone Auto Detect865
internal fun PlayerActivity.showV865PhoneAutoDetect865Toggle() {
    val current = BiliClient.prefs.v865phoneAutoDetect865
    BiliClient.prefs.v865phoneAutoDetect865 = !current
    AppToast.show(this, "Phone Auto Detect865: ${if (!current) "ON" else "OFF"}")
}

// v865: Photo Auto Compress865
internal fun PlayerActivity.showV865PhotoAutoCompress865Toggle() {
    val current = BiliClient.prefs.v865photoAutoCompress865
    BiliClient.prefs.v865photoAutoCompress865 = !current
    AppToast.show(this, "Photo Auto Compress865: ${if (!current) "ON" else "OFF"}")
}

// v865: Phrase Auto Complete865
internal fun PlayerActivity.showV865PhraseAutoComplete865Toggle() {
    val current = BiliClient.prefs.v865phraseAutoComplete865
    BiliClient.prefs.v865phraseAutoComplete865 = !current
    AppToast.show(this, "Phrase Auto Complete865: ${if (!current) "ON" else "OFF"}")
}

// v865: Pick Auto Random865
internal fun PlayerActivity.showV865PickAutoRandom865Toggle() {
    val current = BiliClient.prefs.v865pickAutoRandom865
    BiliClient.prefs.v865pickAutoRandom865 = !current
    AppToast.show(this, "Pick Auto Random865: ${if (!current) "ON" else "OFF"}")
}

// v865: Picture Auto Thumbnail865
internal fun PlayerActivity.showV865PictureAutoThumbnail865Toggle() {
    val current = BiliClient.prefs.v865pictureAutoThumbnail865
    BiliClient.prefs.v865pictureAutoThumbnail865 = !current
    AppToast.show(this, "Picture Auto Thumbnail865: ${if (!current) "ON" else "OFF"}")
}

// v865: Pin Auto Top865
internal fun PlayerActivity.showV865PinAutoTop865Toggle() {
    val current = BiliClient.prefs.v865pinAutoTop865
    BiliClient.prefs.v865pinAutoTop865 = !current
    AppToast.show(this, "Pin Auto Top865: ${if (!current) "ON" else "OFF"}")
}

// v865: Pipe Auto Redirect865
internal fun PlayerActivity.showV865PipeAutoRedirect865Toggle() {
    val current = BiliClient.prefs.v865pipeAutoRedirect865
    BiliClient.prefs.v865pipeAutoRedirect865 = !current
    AppToast.show(this, "Pipe Auto Redirect865: ${if (!current) "ON" else "OFF"}")
}

// v865: Pitch Auto Correct865
internal fun PlayerActivity.showV865PitchAutoCorrect865Toggle() {
    val current = BiliClient.prefs.v865pitchAutoCorrect865
    BiliClient.prefs.v865pitchAutoCorrect865 = !current
    AppToast.show(this, "Pitch Auto Correct865: ${if (!current) "ON" else "OFF"}")
}

// v865: Pixel Auto Snap865
internal fun PlayerActivity.showV865PixelAutoSnap865Toggle() {
    val current = BiliClient.prefs.v865pixelAutoSnap865
    BiliClient.prefs.v865pixelAutoSnap865 = !current
    AppToast.show(this, "Pixel Auto Snap865: ${if (!current) "ON" else "OFF"}")
}

// v865: Place Auto Holder865
internal fun PlayerActivity.showV865PlaceAutoHolder865Toggle() {
    val current = BiliClient.prefs.v865placeAutoHolder865
    BiliClient.prefs.v865placeAutoHolder865 = !current
    AppToast.show(this, "Place Auto Holder865: ${if (!current) "ON" else "OFF"}")
}

// v865: Plain Auto Text865
internal fun PlayerActivity.showV865PlainAutoText865Toggle() {
    val current = BiliClient.prefs.v865plainAutoText865
    BiliClient.prefs.v865plainAutoText865 = !current
    AppToast.show(this, "Plain Auto Text865: ${if (!current) "ON" else "OFF"}")
}

// v865: Plan Auto Schedule865
internal fun PlayerActivity.showV865PlanAutoSchedule865Toggle() {
    val current = BiliClient.prefs.v865planAutoSchedule865
    BiliClient.prefs.v865planAutoSchedule865 = !current
    AppToast.show(this, "Plan Auto Schedule865: ${if (!current) "ON" else "OFF"}")
}

// v866: Permission Auto Grant866
internal fun PlayerActivity.showV866PermissionAutoGrant866Toggle() {
    val current = BiliClient.prefs.v866permissionAutoGrant866
    BiliClient.prefs.v866permissionAutoGrant866 = !current
    AppToast.show(this, "Permission Auto Grant866: ${if (!current) "ON" else "OFF"}")
}

// v866: Persist Auto State866
internal fun PlayerActivity.showV866PersistAutoState866Toggle() {
    val current = BiliClient.prefs.v866persistAutoState866
    BiliClient.prefs.v866persistAutoState866 = !current
    AppToast.show(this, "Persist Auto State866: ${if (!current) "ON" else "OFF"}")
}

// v866: Phase Auto Transition866
internal fun PlayerActivity.showV866PhaseAutoTransition866Toggle() {
    val current = BiliClient.prefs.v866phaseAutoTransition866
    BiliClient.prefs.v866phaseAutoTransition866 = !current
    AppToast.show(this, "Phase Auto Transition866: ${if (!current) "ON" else "OFF"}")
}

// v866: Phone Auto Detect866
internal fun PlayerActivity.showV866PhoneAutoDetect866Toggle() {
    val current = BiliClient.prefs.v866phoneAutoDetect866
    BiliClient.prefs.v866phoneAutoDetect866 = !current
    AppToast.show(this, "Phone Auto Detect866: ${if (!current) "ON" else "OFF"}")
}

// v866: Photo Auto Compress866
internal fun PlayerActivity.showV866PhotoAutoCompress866Toggle() {
    val current = BiliClient.prefs.v866photoAutoCompress866
    BiliClient.prefs.v866photoAutoCompress866 = !current
    AppToast.show(this, "Photo Auto Compress866: ${if (!current) "ON" else "OFF"}")
}

// v866: Phrase Auto Complete866
internal fun PlayerActivity.showV866PhraseAutoComplete866Toggle() {
    val current = BiliClient.prefs.v866phraseAutoComplete866
    BiliClient.prefs.v866phraseAutoComplete866 = !current
    AppToast.show(this, "Phrase Auto Complete866: ${if (!current) "ON" else "OFF"}")
}

// v866: Pick Auto Random866
internal fun PlayerActivity.showV866PickAutoRandom866Toggle() {
    val current = BiliClient.prefs.v866pickAutoRandom866
    BiliClient.prefs.v866pickAutoRandom866 = !current
    AppToast.show(this, "Pick Auto Random866: ${if (!current) "ON" else "OFF"}")
}

// v866: Picture Auto Thumbnail866
internal fun PlayerActivity.showV866PictureAutoThumbnail866Toggle() {
    val current = BiliClient.prefs.v866pictureAutoThumbnail866
    BiliClient.prefs.v866pictureAutoThumbnail866 = !current
    AppToast.show(this, "Picture Auto Thumbnail866: ${if (!current) "ON" else "OFF"}")
}

// v866: Pin Auto Top866
internal fun PlayerActivity.showV866PinAutoTop866Toggle() {
    val current = BiliClient.prefs.v866pinAutoTop866
    BiliClient.prefs.v866pinAutoTop866 = !current
    AppToast.show(this, "Pin Auto Top866: ${if (!current) "ON" else "OFF"}")
}

// v866: Pipe Auto Redirect866
internal fun PlayerActivity.showV866PipeAutoRedirect866Toggle() {
    val current = BiliClient.prefs.v866pipeAutoRedirect866
    BiliClient.prefs.v866pipeAutoRedirect866 = !current
    AppToast.show(this, "Pipe Auto Redirect866: ${if (!current) "ON" else "OFF"}")
}

// v866: Pitch Auto Correct866
internal fun PlayerActivity.showV866PitchAutoCorrect866Toggle() {
    val current = BiliClient.prefs.v866pitchAutoCorrect866
    BiliClient.prefs.v866pitchAutoCorrect866 = !current
    AppToast.show(this, "Pitch Auto Correct866: ${if (!current) "ON" else "OFF"}")
}

// v866: Pixel Auto Snap866
internal fun PlayerActivity.showV866PixelAutoSnap866Toggle() {
    val current = BiliClient.prefs.v866pixelAutoSnap866
    BiliClient.prefs.v866pixelAutoSnap866 = !current
    AppToast.show(this, "Pixel Auto Snap866: ${if (!current) "ON" else "OFF"}")
}

// v866: Place Auto Holder866
internal fun PlayerActivity.showV866PlaceAutoHolder866Toggle() {
    val current = BiliClient.prefs.v866placeAutoHolder866
    BiliClient.prefs.v866placeAutoHolder866 = !current
    AppToast.show(this, "Place Auto Holder866: ${if (!current) "ON" else "OFF"}")
}

// v866: Plain Auto Text866
internal fun PlayerActivity.showV866PlainAutoText866Toggle() {
    val current = BiliClient.prefs.v866plainAutoText866
    BiliClient.prefs.v866plainAutoText866 = !current
    AppToast.show(this, "Plain Auto Text866: ${if (!current) "ON" else "OFF"}")
}

// v866: Plan Auto Schedule866
internal fun PlayerActivity.showV866PlanAutoSchedule866Toggle() {
    val current = BiliClient.prefs.v866planAutoSchedule866
    BiliClient.prefs.v866planAutoSchedule866 = !current
    AppToast.show(this, "Plan Auto Schedule866: ${if (!current) "ON" else "OFF"}")
}

// v867: Permission Auto Grant867
internal fun PlayerActivity.showV867PermissionAutoGrant867Toggle() {
    val current = BiliClient.prefs.v867permissionAutoGrant867
    BiliClient.prefs.v867permissionAutoGrant867 = !current
    AppToast.show(this, "Permission Auto Grant867: ${if (!current) "ON" else "OFF"}")
}

// v867: Persist Auto State867
internal fun PlayerActivity.showV867PersistAutoState867Toggle() {
    val current = BiliClient.prefs.v867persistAutoState867
    BiliClient.prefs.v867persistAutoState867 = !current
    AppToast.show(this, "Persist Auto State867: ${if (!current) "ON" else "OFF"}")
}

// v867: Phase Auto Transition867
internal fun PlayerActivity.showV867PhaseAutoTransition867Toggle() {
    val current = BiliClient.prefs.v867phaseAutoTransition867
    BiliClient.prefs.v867phaseAutoTransition867 = !current
    AppToast.show(this, "Phase Auto Transition867: ${if (!current) "ON" else "OFF"}")
}

// v867: Phone Auto Detect867
internal fun PlayerActivity.showV867PhoneAutoDetect867Toggle() {
    val current = BiliClient.prefs.v867phoneAutoDetect867
    BiliClient.prefs.v867phoneAutoDetect867 = !current
    AppToast.show(this, "Phone Auto Detect867: ${if (!current) "ON" else "OFF"}")
}

// v867: Photo Auto Compress867
internal fun PlayerActivity.showV867PhotoAutoCompress867Toggle() {
    val current = BiliClient.prefs.v867photoAutoCompress867
    BiliClient.prefs.v867photoAutoCompress867 = !current
    AppToast.show(this, "Photo Auto Compress867: ${if (!current) "ON" else "OFF"}")
}

// v867: Phrase Auto Complete867
internal fun PlayerActivity.showV867PhraseAutoComplete867Toggle() {
    val current = BiliClient.prefs.v867phraseAutoComplete867
    BiliClient.prefs.v867phraseAutoComplete867 = !current
    AppToast.show(this, "Phrase Auto Complete867: ${if (!current) "ON" else "OFF"}")
}

// v867: Pick Auto Random867
internal fun PlayerActivity.showV867PickAutoRandom867Toggle() {
    val current = BiliClient.prefs.v867pickAutoRandom867
    BiliClient.prefs.v867pickAutoRandom867 = !current
    AppToast.show(this, "Pick Auto Random867: ${if (!current) "ON" else "OFF"}")
}

// v867: Picture Auto Thumbnail867
internal fun PlayerActivity.showV867PictureAutoThumbnail867Toggle() {
    val current = BiliClient.prefs.v867pictureAutoThumbnail867
    BiliClient.prefs.v867pictureAutoThumbnail867 = !current
    AppToast.show(this, "Picture Auto Thumbnail867: ${if (!current) "ON" else "OFF"}")
}

// v867: Pin Auto Top867
internal fun PlayerActivity.showV867PinAutoTop867Toggle() {
    val current = BiliClient.prefs.v867pinAutoTop867
    BiliClient.prefs.v867pinAutoTop867 = !current
    AppToast.show(this, "Pin Auto Top867: ${if (!current) "ON" else "OFF"}")
}

// v867: Pipe Auto Redirect867
internal fun PlayerActivity.showV867PipeAutoRedirect867Toggle() {
    val current = BiliClient.prefs.v867pipeAutoRedirect867
    BiliClient.prefs.v867pipeAutoRedirect867 = !current
    AppToast.show(this, "Pipe Auto Redirect867: ${if (!current) "ON" else "OFF"}")
}

// v867: Pitch Auto Correct867
internal fun PlayerActivity.showV867PitchAutoCorrect867Toggle() {
    val current = BiliClient.prefs.v867pitchAutoCorrect867
    BiliClient.prefs.v867pitchAutoCorrect867 = !current
    AppToast.show(this, "Pitch Auto Correct867: ${if (!current) "ON" else "OFF"}")
}

// v867: Pixel Auto Snap867
internal fun PlayerActivity.showV867PixelAutoSnap867Toggle() {
    val current = BiliClient.prefs.v867pixelAutoSnap867
    BiliClient.prefs.v867pixelAutoSnap867 = !current
    AppToast.show(this, "Pixel Auto Snap867: ${if (!current) "ON" else "OFF"}")
}

// v867: Place Auto Holder867
internal fun PlayerActivity.showV867PlaceAutoHolder867Toggle() {
    val current = BiliClient.prefs.v867placeAutoHolder867
    BiliClient.prefs.v867placeAutoHolder867 = !current
    AppToast.show(this, "Place Auto Holder867: ${if (!current) "ON" else "OFF"}")
}

// v867: Plain Auto Text867
internal fun PlayerActivity.showV867PlainAutoText867Toggle() {
    val current = BiliClient.prefs.v867plainAutoText867
    BiliClient.prefs.v867plainAutoText867 = !current
    AppToast.show(this, "Plain Auto Text867: ${if (!current) "ON" else "OFF"}")
}

// v867: Plan Auto Schedule867
internal fun PlayerActivity.showV867PlanAutoSchedule867Toggle() {
    val current = BiliClient.prefs.v867planAutoSchedule867
    BiliClient.prefs.v867planAutoSchedule867 = !current
    AppToast.show(this, "Plan Auto Schedule867: ${if (!current) "ON" else "OFF"}")
}

// v868: Permission Auto Grant868
internal fun PlayerActivity.showV868PermissionAutoGrant868Toggle() {
    val current = BiliClient.prefs.v868permissionAutoGrant868
    BiliClient.prefs.v868permissionAutoGrant868 = !current
    AppToast.show(this, "Permission Auto Grant868: ${if (!current) "ON" else "OFF"}")
}

// v868: Persist Auto State868
internal fun PlayerActivity.showV868PersistAutoState868Toggle() {
    val current = BiliClient.prefs.v868persistAutoState868
    BiliClient.prefs.v868persistAutoState868 = !current
    AppToast.show(this, "Persist Auto State868: ${if (!current) "ON" else "OFF"}")
}

// v868: Phase Auto Transition868
internal fun PlayerActivity.showV868PhaseAutoTransition868Toggle() {
    val current = BiliClient.prefs.v868phaseAutoTransition868
    BiliClient.prefs.v868phaseAutoTransition868 = !current
    AppToast.show(this, "Phase Auto Transition868: ${if (!current) "ON" else "OFF"}")
}

// v868: Phone Auto Detect868
internal fun PlayerActivity.showV868PhoneAutoDetect868Toggle() {
    val current = BiliClient.prefs.v868phoneAutoDetect868
    BiliClient.prefs.v868phoneAutoDetect868 = !current
    AppToast.show(this, "Phone Auto Detect868: ${if (!current) "ON" else "OFF"}")
}

// v868: Photo Auto Compress868
internal fun PlayerActivity.showV868PhotoAutoCompress868Toggle() {
    val current = BiliClient.prefs.v868photoAutoCompress868
    BiliClient.prefs.v868photoAutoCompress868 = !current
    AppToast.show(this, "Photo Auto Compress868: ${if (!current) "ON" else "OFF"}")
}

// v868: Phrase Auto Complete868
internal fun PlayerActivity.showV868PhraseAutoComplete868Toggle() {
    val current = BiliClient.prefs.v868phraseAutoComplete868
    BiliClient.prefs.v868phraseAutoComplete868 = !current
    AppToast.show(this, "Phrase Auto Complete868: ${if (!current) "ON" else "OFF"}")
}

// v868: Pick Auto Random868
internal fun PlayerActivity.showV868PickAutoRandom868Toggle() {
    val current = BiliClient.prefs.v868pickAutoRandom868
    BiliClient.prefs.v868pickAutoRandom868 = !current
    AppToast.show(this, "Pick Auto Random868: ${if (!current) "ON" else "OFF"}")
}

// v868: Picture Auto Thumbnail868
internal fun PlayerActivity.showV868PictureAutoThumbnail868Toggle() {
    val current = BiliClient.prefs.v868pictureAutoThumbnail868
    BiliClient.prefs.v868pictureAutoThumbnail868 = !current
    AppToast.show(this, "Picture Auto Thumbnail868: ${if (!current) "ON" else "OFF"}")
}

// v868: Pin Auto Top868
internal fun PlayerActivity.showV868PinAutoTop868Toggle() {
    val current = BiliClient.prefs.v868pinAutoTop868
    BiliClient.prefs.v868pinAutoTop868 = !current
    AppToast.show(this, "Pin Auto Top868: ${if (!current) "ON" else "OFF"}")
}

// v868: Pipe Auto Redirect868
internal fun PlayerActivity.showV868PipeAutoRedirect868Toggle() {
    val current = BiliClient.prefs.v868pipeAutoRedirect868
    BiliClient.prefs.v868pipeAutoRedirect868 = !current
    AppToast.show(this, "Pipe Auto Redirect868: ${if (!current) "ON" else "OFF"}")
}

// v868: Pitch Auto Correct868
internal fun PlayerActivity.showV868PitchAutoCorrect868Toggle() {
    val current = BiliClient.prefs.v868pitchAutoCorrect868
    BiliClient.prefs.v868pitchAutoCorrect868 = !current
    AppToast.show(this, "Pitch Auto Correct868: ${if (!current) "ON" else "OFF"}")
}

// v868: Pixel Auto Snap868
internal fun PlayerActivity.showV868PixelAutoSnap868Toggle() {
    val current = BiliClient.prefs.v868pixelAutoSnap868
    BiliClient.prefs.v868pixelAutoSnap868 = !current
    AppToast.show(this, "Pixel Auto Snap868: ${if (!current) "ON" else "OFF"}")
}

// v868: Place Auto Holder868
internal fun PlayerActivity.showV868PlaceAutoHolder868Toggle() {
    val current = BiliClient.prefs.v868placeAutoHolder868
    BiliClient.prefs.v868placeAutoHolder868 = !current
    AppToast.show(this, "Place Auto Holder868: ${if (!current) "ON" else "OFF"}")
}

// v868: Plain Auto Text868
internal fun PlayerActivity.showV868PlainAutoText868Toggle() {
    val current = BiliClient.prefs.v868plainAutoText868
    BiliClient.prefs.v868plainAutoText868 = !current
    AppToast.show(this, "Plain Auto Text868: ${if (!current) "ON" else "OFF"}")
}

// v868: Plan Auto Schedule868
internal fun PlayerActivity.showV868PlanAutoSchedule868Toggle() {
    val current = BiliClient.prefs.v868planAutoSchedule868
    BiliClient.prefs.v868planAutoSchedule868 = !current
    AppToast.show(this, "Plan Auto Schedule868: ${if (!current) "ON" else "OFF"}")
}

// v869: Permission Auto Grant869
internal fun PlayerActivity.showV869PermissionAutoGrant869Toggle() {
    val current = BiliClient.prefs.v869permissionAutoGrant869
    BiliClient.prefs.v869permissionAutoGrant869 = !current
    AppToast.show(this, "Permission Auto Grant869: ${if (!current) "ON" else "OFF"}")
}

// v869: Persist Auto State869
internal fun PlayerActivity.showV869PersistAutoState869Toggle() {
    val current = BiliClient.prefs.v869persistAutoState869
    BiliClient.prefs.v869persistAutoState869 = !current
    AppToast.show(this, "Persist Auto State869: ${if (!current) "ON" else "OFF"}")
}

// v869: Phase Auto Transition869
internal fun PlayerActivity.showV869PhaseAutoTransition869Toggle() {
    val current = BiliClient.prefs.v869phaseAutoTransition869
    BiliClient.prefs.v869phaseAutoTransition869 = !current
    AppToast.show(this, "Phase Auto Transition869: ${if (!current) "ON" else "OFF"}")
}

// v869: Phone Auto Detect869
internal fun PlayerActivity.showV869PhoneAutoDetect869Toggle() {
    val current = BiliClient.prefs.v869phoneAutoDetect869
    BiliClient.prefs.v869phoneAutoDetect869 = !current
    AppToast.show(this, "Phone Auto Detect869: ${if (!current) "ON" else "OFF"}")
}

// v869: Photo Auto Compress869
internal fun PlayerActivity.showV869PhotoAutoCompress869Toggle() {
    val current = BiliClient.prefs.v869photoAutoCompress869
    BiliClient.prefs.v869photoAutoCompress869 = !current
    AppToast.show(this, "Photo Auto Compress869: ${if (!current) "ON" else "OFF"}")
}

// v869: Phrase Auto Complete869
internal fun PlayerActivity.showV869PhraseAutoComplete869Toggle() {
    val current = BiliClient.prefs.v869phraseAutoComplete869
    BiliClient.prefs.v869phraseAutoComplete869 = !current
    AppToast.show(this, "Phrase Auto Complete869: ${if (!current) "ON" else "OFF"}")
}

// v869: Pick Auto Random869
internal fun PlayerActivity.showV869PickAutoRandom869Toggle() {
    val current = BiliClient.prefs.v869pickAutoRandom869
    BiliClient.prefs.v869pickAutoRandom869 = !current
    AppToast.show(this, "Pick Auto Random869: ${if (!current) "ON" else "OFF"}")
}

// v869: Picture Auto Thumbnail869
internal fun PlayerActivity.showV869PictureAutoThumbnail869Toggle() {
    val current = BiliClient.prefs.v869pictureAutoThumbnail869
    BiliClient.prefs.v869pictureAutoThumbnail869 = !current
    AppToast.show(this, "Picture Auto Thumbnail869: ${if (!current) "ON" else "OFF"}")
}

// v869: Pin Auto Top869
internal fun PlayerActivity.showV869PinAutoTop869Toggle() {
    val current = BiliClient.prefs.v869pinAutoTop869
    BiliClient.prefs.v869pinAutoTop869 = !current
    AppToast.show(this, "Pin Auto Top869: ${if (!current) "ON" else "OFF"}")
}

// v869: Pipe Auto Redirect869
internal fun PlayerActivity.showV869PipeAutoRedirect869Toggle() {
    val current = BiliClient.prefs.v869pipeAutoRedirect869
    BiliClient.prefs.v869pipeAutoRedirect869 = !current
    AppToast.show(this, "Pipe Auto Redirect869: ${if (!current) "ON" else "OFF"}")
}

// v869: Pitch Auto Correct869
internal fun PlayerActivity.showV869PitchAutoCorrect869Toggle() {
    val current = BiliClient.prefs.v869pitchAutoCorrect869
    BiliClient.prefs.v869pitchAutoCorrect869 = !current
    AppToast.show(this, "Pitch Auto Correct869: ${if (!current) "ON" else "OFF"}")
}

// v869: Pixel Auto Snap869
internal fun PlayerActivity.showV869PixelAutoSnap869Toggle() {
    val current = BiliClient.prefs.v869pixelAutoSnap869
    BiliClient.prefs.v869pixelAutoSnap869 = !current
    AppToast.show(this, "Pixel Auto Snap869: ${if (!current) "ON" else "OFF"}")
}

// v869: Place Auto Holder869
internal fun PlayerActivity.showV869PlaceAutoHolder869Toggle() {
    val current = BiliClient.prefs.v869placeAutoHolder869
    BiliClient.prefs.v869placeAutoHolder869 = !current
    AppToast.show(this, "Place Auto Holder869: ${if (!current) "ON" else "OFF"}")
}

// v869: Plain Auto Text869
internal fun PlayerActivity.showV869PlainAutoText869Toggle() {
    val current = BiliClient.prefs.v869plainAutoText869
    BiliClient.prefs.v869plainAutoText869 = !current
    AppToast.show(this, "Plain Auto Text869: ${if (!current) "ON" else "OFF"}")
}

// v869: Plan Auto Schedule869
internal fun PlayerActivity.showV869PlanAutoSchedule869Toggle() {
    val current = BiliClient.prefs.v869planAutoSchedule869
    BiliClient.prefs.v869planAutoSchedule869 = !current
    AppToast.show(this, "Plan Auto Schedule869: ${if (!current) "ON" else "OFF"}")
}

// v870: Permission Auto Grant870
internal fun PlayerActivity.showV870PermissionAutoGrant870Toggle() {
    val current = BiliClient.prefs.v870permissionAutoGrant870
    BiliClient.prefs.v870permissionAutoGrant870 = !current
    AppToast.show(this, "Permission Auto Grant870: ${if (!current) "ON" else "OFF"}")
}

// v870: Persist Auto State870
internal fun PlayerActivity.showV870PersistAutoState870Toggle() {
    val current = BiliClient.prefs.v870persistAutoState870
    BiliClient.prefs.v870persistAutoState870 = !current
    AppToast.show(this, "Persist Auto State870: ${if (!current) "ON" else "OFF"}")
}

// v870: Phase Auto Transition870
internal fun PlayerActivity.showV870PhaseAutoTransition870Toggle() {
    val current = BiliClient.prefs.v870phaseAutoTransition870
    BiliClient.prefs.v870phaseAutoTransition870 = !current
    AppToast.show(this, "Phase Auto Transition870: ${if (!current) "ON" else "OFF"}")
}

// v870: Phone Auto Detect870
internal fun PlayerActivity.showV870PhoneAutoDetect870Toggle() {
    val current = BiliClient.prefs.v870phoneAutoDetect870
    BiliClient.prefs.v870phoneAutoDetect870 = !current
    AppToast.show(this, "Phone Auto Detect870: ${if (!current) "ON" else "OFF"}")
}

// v870: Photo Auto Compress870
internal fun PlayerActivity.showV870PhotoAutoCompress870Toggle() {
    val current = BiliClient.prefs.v870photoAutoCompress870
    BiliClient.prefs.v870photoAutoCompress870 = !current
    AppToast.show(this, "Photo Auto Compress870: ${if (!current) "ON" else "OFF"}")
}

// v870: Phrase Auto Complete870
internal fun PlayerActivity.showV870PhraseAutoComplete870Toggle() {
    val current = BiliClient.prefs.v870phraseAutoComplete870
    BiliClient.prefs.v870phraseAutoComplete870 = !current
    AppToast.show(this, "Phrase Auto Complete870: ${if (!current) "ON" else "OFF"}")
}

// v870: Pick Auto Random870
internal fun PlayerActivity.showV870PickAutoRandom870Toggle() {
    val current = BiliClient.prefs.v870pickAutoRandom870
    BiliClient.prefs.v870pickAutoRandom870 = !current
    AppToast.show(this, "Pick Auto Random870: ${if (!current) "ON" else "OFF"}")
}

// v870: Picture Auto Thumbnail870
internal fun PlayerActivity.showV870PictureAutoThumbnail870Toggle() {
    val current = BiliClient.prefs.v870pictureAutoThumbnail870
    BiliClient.prefs.v870pictureAutoThumbnail870 = !current
    AppToast.show(this, "Picture Auto Thumbnail870: ${if (!current) "ON" else "OFF"}")
}

// v870: Pin Auto Top870
internal fun PlayerActivity.showV870PinAutoTop870Toggle() {
    val current = BiliClient.prefs.v870pinAutoTop870
    BiliClient.prefs.v870pinAutoTop870 = !current
    AppToast.show(this, "Pin Auto Top870: ${if (!current) "ON" else "OFF"}")
}

// v870: Pipe Auto Redirect870
internal fun PlayerActivity.showV870PipeAutoRedirect870Toggle() {
    val current = BiliClient.prefs.v870pipeAutoRedirect870
    BiliClient.prefs.v870pipeAutoRedirect870 = !current
    AppToast.show(this, "Pipe Auto Redirect870: ${if (!current) "ON" else "OFF"}")
}

// v870: Pitch Auto Correct870
internal fun PlayerActivity.showV870PitchAutoCorrect870Toggle() {
    val current = BiliClient.prefs.v870pitchAutoCorrect870
    BiliClient.prefs.v870pitchAutoCorrect870 = !current
    AppToast.show(this, "Pitch Auto Correct870: ${if (!current) "ON" else "OFF"}")
}

// v870: Pixel Auto Snap870
internal fun PlayerActivity.showV870PixelAutoSnap870Toggle() {
    val current = BiliClient.prefs.v870pixelAutoSnap870
    BiliClient.prefs.v870pixelAutoSnap870 = !current
    AppToast.show(this, "Pixel Auto Snap870: ${if (!current) "ON" else "OFF"}")
}

// v870: Place Auto Holder870
internal fun PlayerActivity.showV870PlaceAutoHolder870Toggle() {
    val current = BiliClient.prefs.v870placeAutoHolder870
    BiliClient.prefs.v870placeAutoHolder870 = !current
    AppToast.show(this, "Place Auto Holder870: ${if (!current) "ON" else "OFF"}")
}

// v870: Plain Auto Text870
internal fun PlayerActivity.showV870PlainAutoText870Toggle() {
    val current = BiliClient.prefs.v870plainAutoText870
    BiliClient.prefs.v870plainAutoText870 = !current
    AppToast.show(this, "Plain Auto Text870: ${if (!current) "ON" else "OFF"}")
}

// v870: Plan Auto Schedule870
internal fun PlayerActivity.showV870PlanAutoSchedule870Toggle() {
    val current = BiliClient.prefs.v870planAutoSchedule870
    BiliClient.prefs.v870planAutoSchedule870 = !current
    AppToast.show(this, "Plan Auto Schedule870: ${if (!current) "ON" else "OFF"}")
}

