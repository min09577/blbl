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

// v871: Platform Auto Detect871
internal fun PlayerActivity.showV871PlatformAutoDetect871Toggle() {
    val current = BiliClient.prefs.v871platformAutoDetect871
    BiliClient.prefs.v871platformAutoDetect871 = !current
    AppToast.show(this, "Platform Auto Detect871: ${if (!current) "ON" else "OFF"}")
}

// v871: Play Auto Resume871
internal fun PlayerActivity.showV871PlayAutoResume871Toggle() {
    val current = BiliClient.prefs.v871playAutoResume871
    BiliClient.prefs.v871playAutoResume871 = !current
    AppToast.show(this, "Play Auto Resume871: ${if (!current) "ON" else "OFF"}")
}

// v871: Pointer Auto Lock871
internal fun PlayerActivity.showV871PointerAutoLock871Toggle() {
    val current = BiliClient.prefs.v871pointerAutoLock871
    BiliClient.prefs.v871pointerAutoLock871 = !current
    AppToast.show(this, "Pointer Auto Lock871: ${if (!current) "ON" else "OFF"}")
}

// v871: Poll Auto Interval871
internal fun PlayerActivity.showV871PollAutoInterval871Toggle() {
    val current = BiliClient.prefs.v871pollAutoInterval871
    BiliClient.prefs.v871pollAutoInterval871 = !current
    AppToast.show(this, "Poll Auto Interval871: ${if (!current) "ON" else "OFF"}")
}

// v871: Pool Auto Recycle871
internal fun PlayerActivity.showV871PoolAutoRecycle871Toggle() {
    val current = BiliClient.prefs.v871poolAutoRecycle871
    BiliClient.prefs.v871poolAutoRecycle871 = !current
    AppToast.show(this, "Pool Auto Recycle871: ${if (!current) "ON" else "OFF"}")
}

// v871: Pop Auto Dismiss871
internal fun PlayerActivity.showV871PopAutoDismiss871Toggle() {
    val current = BiliClient.prefs.v871popAutoDismiss871
    BiliClient.prefs.v871popAutoDismiss871 = !current
    AppToast.show(this, "Pop Auto Dismiss871: ${if (!current) "ON" else "OFF"}")
}

// v871: Port Auto Forward871
internal fun PlayerActivity.showV871PortAutoForward871Toggle() {
    val current = BiliClient.prefs.v871portAutoForward871
    BiliClient.prefs.v871portAutoForward871 = !current
    AppToast.show(this, "Port Auto Forward871: ${if (!current) "ON" else "OFF"}")
}

// v871: Position Auto Save871
internal fun PlayerActivity.showV871PositionAutoSave871Toggle() {
    val current = BiliClient.prefs.v871positionAutoSave871
    BiliClient.prefs.v871positionAutoSave871 = !current
    AppToast.show(this, "Position Auto Save871: ${if (!current) "ON" else "OFF"}")
}

// v871: Post Auto Schedule871
internal fun PlayerActivity.showV871PostAutoSchedule871Toggle() {
    val current = BiliClient.prefs.v871postAutoSchedule871
    BiliClient.prefs.v871postAutoSchedule871 = !current
    AppToast.show(this, "Post Auto Schedule871: ${if (!current) "ON" else "OFF"}")
}

// v871: Power Auto Save871
internal fun PlayerActivity.showV871PowerAutoSave871Toggle() {
    val current = BiliClient.prefs.v871powerAutoSave871
    BiliClient.prefs.v871powerAutoSave871 = !current
    AppToast.show(this, "Power Auto Save871: ${if (!current) "ON" else "OFF"}")
}

// v871: Pre Auto Load871
internal fun PlayerActivity.showV871PreAutoLoad871Toggle() {
    val current = BiliClient.prefs.v871preAutoLoad871
    BiliClient.prefs.v871preAutoLoad871 = !current
    AppToast.show(this, "Pre Auto Load871: ${if (!current) "ON" else "OFF"}")
}

// v871: Precision Auto Round871
internal fun PlayerActivity.showV871PrecisionAutoRound871Toggle() {
    val current = BiliClient.prefs.v871precisionAutoRound871
    BiliClient.prefs.v871precisionAutoRound871 = !current
    AppToast.show(this, "Precision Auto Round871: ${if (!current) "ON" else "OFF"}")
}

// v871: Predict Auto Prefetch871
internal fun PlayerActivity.showV871PredictAutoPrefetch871Toggle() {
    val current = BiliClient.prefs.v871predictAutoPrefetch871
    BiliClient.prefs.v871predictAutoPrefetch871 = !current
    AppToast.show(this, "Predict Auto Prefetch871: ${if (!current) "ON" else "OFF"}")
}

// v871: Prefix Auto Trim871
internal fun PlayerActivity.showV871PrefixAutoTrim871Toggle() {
    val current = BiliClient.prefs.v871prefixAutoTrim871
    BiliClient.prefs.v871prefixAutoTrim871 = !current
    AppToast.show(this, "Prefix Auto Trim871: ${if (!current) "ON" else "OFF"}")
}

// v871: Preload Auto Cache871
internal fun PlayerActivity.showV871PreloadAutoCache871Toggle() {
    val current = BiliClient.prefs.v871preloadAutoCache871
    BiliClient.prefs.v871preloadAutoCache871 = !current
    AppToast.show(this, "Preload Auto Cache871: ${if (!current) "ON" else "OFF"}")
}

// v872: Platform Auto Detect872
internal fun PlayerActivity.showV872PlatformAutoDetect872Toggle() {
    val current = BiliClient.prefs.v872platformAutoDetect872
    BiliClient.prefs.v872platformAutoDetect872 = !current
    AppToast.show(this, "Platform Auto Detect872: ${if (!current) "ON" else "OFF"}")
}

// v872: Play Auto Resume872
internal fun PlayerActivity.showV872PlayAutoResume872Toggle() {
    val current = BiliClient.prefs.v872playAutoResume872
    BiliClient.prefs.v872playAutoResume872 = !current
    AppToast.show(this, "Play Auto Resume872: ${if (!current) "ON" else "OFF"}")
}

// v872: Pointer Auto Lock872
internal fun PlayerActivity.showV872PointerAutoLock872Toggle() {
    val current = BiliClient.prefs.v872pointerAutoLock872
    BiliClient.prefs.v872pointerAutoLock872 = !current
    AppToast.show(this, "Pointer Auto Lock872: ${if (!current) "ON" else "OFF"}")
}

// v872: Poll Auto Interval872
internal fun PlayerActivity.showV872PollAutoInterval872Toggle() {
    val current = BiliClient.prefs.v872pollAutoInterval872
    BiliClient.prefs.v872pollAutoInterval872 = !current
    AppToast.show(this, "Poll Auto Interval872: ${if (!current) "ON" else "OFF"}")
}

// v872: Pool Auto Recycle872
internal fun PlayerActivity.showV872PoolAutoRecycle872Toggle() {
    val current = BiliClient.prefs.v872poolAutoRecycle872
    BiliClient.prefs.v872poolAutoRecycle872 = !current
    AppToast.show(this, "Pool Auto Recycle872: ${if (!current) "ON" else "OFF"}")
}

// v872: Pop Auto Dismiss872
internal fun PlayerActivity.showV872PopAutoDismiss872Toggle() {
    val current = BiliClient.prefs.v872popAutoDismiss872
    BiliClient.prefs.v872popAutoDismiss872 = !current
    AppToast.show(this, "Pop Auto Dismiss872: ${if (!current) "ON" else "OFF"}")
}

// v872: Port Auto Forward872
internal fun PlayerActivity.showV872PortAutoForward872Toggle() {
    val current = BiliClient.prefs.v872portAutoForward872
    BiliClient.prefs.v872portAutoForward872 = !current
    AppToast.show(this, "Port Auto Forward872: ${if (!current) "ON" else "OFF"}")
}

// v872: Position Auto Save872
internal fun PlayerActivity.showV872PositionAutoSave872Toggle() {
    val current = BiliClient.prefs.v872positionAutoSave872
    BiliClient.prefs.v872positionAutoSave872 = !current
    AppToast.show(this, "Position Auto Save872: ${if (!current) "ON" else "OFF"}")
}

// v872: Post Auto Schedule872
internal fun PlayerActivity.showV872PostAutoSchedule872Toggle() {
    val current = BiliClient.prefs.v872postAutoSchedule872
    BiliClient.prefs.v872postAutoSchedule872 = !current
    AppToast.show(this, "Post Auto Schedule872: ${if (!current) "ON" else "OFF"}")
}

// v872: Power Auto Save872
internal fun PlayerActivity.showV872PowerAutoSave872Toggle() {
    val current = BiliClient.prefs.v872powerAutoSave872
    BiliClient.prefs.v872powerAutoSave872 = !current
    AppToast.show(this, "Power Auto Save872: ${if (!current) "ON" else "OFF"}")
}

// v872: Pre Auto Load872
internal fun PlayerActivity.showV872PreAutoLoad872Toggle() {
    val current = BiliClient.prefs.v872preAutoLoad872
    BiliClient.prefs.v872preAutoLoad872 = !current
    AppToast.show(this, "Pre Auto Load872: ${if (!current) "ON" else "OFF"}")
}

// v872: Precision Auto Round872
internal fun PlayerActivity.showV872PrecisionAutoRound872Toggle() {
    val current = BiliClient.prefs.v872precisionAutoRound872
    BiliClient.prefs.v872precisionAutoRound872 = !current
    AppToast.show(this, "Precision Auto Round872: ${if (!current) "ON" else "OFF"}")
}

// v872: Predict Auto Prefetch872
internal fun PlayerActivity.showV872PredictAutoPrefetch872Toggle() {
    val current = BiliClient.prefs.v872predictAutoPrefetch872
    BiliClient.prefs.v872predictAutoPrefetch872 = !current
    AppToast.show(this, "Predict Auto Prefetch872: ${if (!current) "ON" else "OFF"}")
}

// v872: Prefix Auto Trim872
internal fun PlayerActivity.showV872PrefixAutoTrim872Toggle() {
    val current = BiliClient.prefs.v872prefixAutoTrim872
    BiliClient.prefs.v872prefixAutoTrim872 = !current
    AppToast.show(this, "Prefix Auto Trim872: ${if (!current) "ON" else "OFF"}")
}

// v872: Preload Auto Cache872
internal fun PlayerActivity.showV872PreloadAutoCache872Toggle() {
    val current = BiliClient.prefs.v872preloadAutoCache872
    BiliClient.prefs.v872preloadAutoCache872 = !current
    AppToast.show(this, "Preload Auto Cache872: ${if (!current) "ON" else "OFF"}")
}

// v873: Platform Auto Detect873
internal fun PlayerActivity.showV873PlatformAutoDetect873Toggle() {
    val current = BiliClient.prefs.v873platformAutoDetect873
    BiliClient.prefs.v873platformAutoDetect873 = !current
    AppToast.show(this, "Platform Auto Detect873: ${if (!current) "ON" else "OFF"}")
}

// v873: Play Auto Resume873
internal fun PlayerActivity.showV873PlayAutoResume873Toggle() {
    val current = BiliClient.prefs.v873playAutoResume873
    BiliClient.prefs.v873playAutoResume873 = !current
    AppToast.show(this, "Play Auto Resume873: ${if (!current) "ON" else "OFF"}")
}

// v873: Pointer Auto Lock873
internal fun PlayerActivity.showV873PointerAutoLock873Toggle() {
    val current = BiliClient.prefs.v873pointerAutoLock873
    BiliClient.prefs.v873pointerAutoLock873 = !current
    AppToast.show(this, "Pointer Auto Lock873: ${if (!current) "ON" else "OFF"}")
}

// v873: Poll Auto Interval873
internal fun PlayerActivity.showV873PollAutoInterval873Toggle() {
    val current = BiliClient.prefs.v873pollAutoInterval873
    BiliClient.prefs.v873pollAutoInterval873 = !current
    AppToast.show(this, "Poll Auto Interval873: ${if (!current) "ON" else "OFF"}")
}

// v873: Pool Auto Recycle873
internal fun PlayerActivity.showV873PoolAutoRecycle873Toggle() {
    val current = BiliClient.prefs.v873poolAutoRecycle873
    BiliClient.prefs.v873poolAutoRecycle873 = !current
    AppToast.show(this, "Pool Auto Recycle873: ${if (!current) "ON" else "OFF"}")
}

// v873: Pop Auto Dismiss873
internal fun PlayerActivity.showV873PopAutoDismiss873Toggle() {
    val current = BiliClient.prefs.v873popAutoDismiss873
    BiliClient.prefs.v873popAutoDismiss873 = !current
    AppToast.show(this, "Pop Auto Dismiss873: ${if (!current) "ON" else "OFF"}")
}

// v873: Port Auto Forward873
internal fun PlayerActivity.showV873PortAutoForward873Toggle() {
    val current = BiliClient.prefs.v873portAutoForward873
    BiliClient.prefs.v873portAutoForward873 = !current
    AppToast.show(this, "Port Auto Forward873: ${if (!current) "ON" else "OFF"}")
}

// v873: Position Auto Save873
internal fun PlayerActivity.showV873PositionAutoSave873Toggle() {
    val current = BiliClient.prefs.v873positionAutoSave873
    BiliClient.prefs.v873positionAutoSave873 = !current
    AppToast.show(this, "Position Auto Save873: ${if (!current) "ON" else "OFF"}")
}

// v873: Post Auto Schedule873
internal fun PlayerActivity.showV873PostAutoSchedule873Toggle() {
    val current = BiliClient.prefs.v873postAutoSchedule873
    BiliClient.prefs.v873postAutoSchedule873 = !current
    AppToast.show(this, "Post Auto Schedule873: ${if (!current) "ON" else "OFF"}")
}

// v873: Power Auto Save873
internal fun PlayerActivity.showV873PowerAutoSave873Toggle() {
    val current = BiliClient.prefs.v873powerAutoSave873
    BiliClient.prefs.v873powerAutoSave873 = !current
    AppToast.show(this, "Power Auto Save873: ${if (!current) "ON" else "OFF"}")
}

// v873: Pre Auto Load873
internal fun PlayerActivity.showV873PreAutoLoad873Toggle() {
    val current = BiliClient.prefs.v873preAutoLoad873
    BiliClient.prefs.v873preAutoLoad873 = !current
    AppToast.show(this, "Pre Auto Load873: ${if (!current) "ON" else "OFF"}")
}

// v873: Precision Auto Round873
internal fun PlayerActivity.showV873PrecisionAutoRound873Toggle() {
    val current = BiliClient.prefs.v873precisionAutoRound873
    BiliClient.prefs.v873precisionAutoRound873 = !current
    AppToast.show(this, "Precision Auto Round873: ${if (!current) "ON" else "OFF"}")
}

// v873: Predict Auto Prefetch873
internal fun PlayerActivity.showV873PredictAutoPrefetch873Toggle() {
    val current = BiliClient.prefs.v873predictAutoPrefetch873
    BiliClient.prefs.v873predictAutoPrefetch873 = !current
    AppToast.show(this, "Predict Auto Prefetch873: ${if (!current) "ON" else "OFF"}")
}

// v873: Prefix Auto Trim873
internal fun PlayerActivity.showV873PrefixAutoTrim873Toggle() {
    val current = BiliClient.prefs.v873prefixAutoTrim873
    BiliClient.prefs.v873prefixAutoTrim873 = !current
    AppToast.show(this, "Prefix Auto Trim873: ${if (!current) "ON" else "OFF"}")
}

// v873: Preload Auto Cache873
internal fun PlayerActivity.showV873PreloadAutoCache873Toggle() {
    val current = BiliClient.prefs.v873preloadAutoCache873
    BiliClient.prefs.v873preloadAutoCache873 = !current
    AppToast.show(this, "Preload Auto Cache873: ${if (!current) "ON" else "OFF"}")
}

// v874: Platform Auto Detect874
internal fun PlayerActivity.showV874PlatformAutoDetect874Toggle() {
    val current = BiliClient.prefs.v874platformAutoDetect874
    BiliClient.prefs.v874platformAutoDetect874 = !current
    AppToast.show(this, "Platform Auto Detect874: ${if (!current) "ON" else "OFF"}")
}

// v874: Play Auto Resume874
internal fun PlayerActivity.showV874PlayAutoResume874Toggle() {
    val current = BiliClient.prefs.v874playAutoResume874
    BiliClient.prefs.v874playAutoResume874 = !current
    AppToast.show(this, "Play Auto Resume874: ${if (!current) "ON" else "OFF"}")
}

// v874: Pointer Auto Lock874
internal fun PlayerActivity.showV874PointerAutoLock874Toggle() {
    val current = BiliClient.prefs.v874pointerAutoLock874
    BiliClient.prefs.v874pointerAutoLock874 = !current
    AppToast.show(this, "Pointer Auto Lock874: ${if (!current) "ON" else "OFF"}")
}

// v874: Poll Auto Interval874
internal fun PlayerActivity.showV874PollAutoInterval874Toggle() {
    val current = BiliClient.prefs.v874pollAutoInterval874
    BiliClient.prefs.v874pollAutoInterval874 = !current
    AppToast.show(this, "Poll Auto Interval874: ${if (!current) "ON" else "OFF"}")
}

// v874: Pool Auto Recycle874
internal fun PlayerActivity.showV874PoolAutoRecycle874Toggle() {
    val current = BiliClient.prefs.v874poolAutoRecycle874
    BiliClient.prefs.v874poolAutoRecycle874 = !current
    AppToast.show(this, "Pool Auto Recycle874: ${if (!current) "ON" else "OFF"}")
}

// v874: Pop Auto Dismiss874
internal fun PlayerActivity.showV874PopAutoDismiss874Toggle() {
    val current = BiliClient.prefs.v874popAutoDismiss874
    BiliClient.prefs.v874popAutoDismiss874 = !current
    AppToast.show(this, "Pop Auto Dismiss874: ${if (!current) "ON" else "OFF"}")
}

// v874: Port Auto Forward874
internal fun PlayerActivity.showV874PortAutoForward874Toggle() {
    val current = BiliClient.prefs.v874portAutoForward874
    BiliClient.prefs.v874portAutoForward874 = !current
    AppToast.show(this, "Port Auto Forward874: ${if (!current) "ON" else "OFF"}")
}

// v874: Position Auto Save874
internal fun PlayerActivity.showV874PositionAutoSave874Toggle() {
    val current = BiliClient.prefs.v874positionAutoSave874
    BiliClient.prefs.v874positionAutoSave874 = !current
    AppToast.show(this, "Position Auto Save874: ${if (!current) "ON" else "OFF"}")
}

// v874: Post Auto Schedule874
internal fun PlayerActivity.showV874PostAutoSchedule874Toggle() {
    val current = BiliClient.prefs.v874postAutoSchedule874
    BiliClient.prefs.v874postAutoSchedule874 = !current
    AppToast.show(this, "Post Auto Schedule874: ${if (!current) "ON" else "OFF"}")
}

// v874: Power Auto Save874
internal fun PlayerActivity.showV874PowerAutoSave874Toggle() {
    val current = BiliClient.prefs.v874powerAutoSave874
    BiliClient.prefs.v874powerAutoSave874 = !current
    AppToast.show(this, "Power Auto Save874: ${if (!current) "ON" else "OFF"}")
}

// v874: Pre Auto Load874
internal fun PlayerActivity.showV874PreAutoLoad874Toggle() {
    val current = BiliClient.prefs.v874preAutoLoad874
    BiliClient.prefs.v874preAutoLoad874 = !current
    AppToast.show(this, "Pre Auto Load874: ${if (!current) "ON" else "OFF"}")
}

// v874: Precision Auto Round874
internal fun PlayerActivity.showV874PrecisionAutoRound874Toggle() {
    val current = BiliClient.prefs.v874precisionAutoRound874
    BiliClient.prefs.v874precisionAutoRound874 = !current
    AppToast.show(this, "Precision Auto Round874: ${if (!current) "ON" else "OFF"}")
}

// v874: Predict Auto Prefetch874
internal fun PlayerActivity.showV874PredictAutoPrefetch874Toggle() {
    val current = BiliClient.prefs.v874predictAutoPrefetch874
    BiliClient.prefs.v874predictAutoPrefetch874 = !current
    AppToast.show(this, "Predict Auto Prefetch874: ${if (!current) "ON" else "OFF"}")
}

// v874: Prefix Auto Trim874
internal fun PlayerActivity.showV874PrefixAutoTrim874Toggle() {
    val current = BiliClient.prefs.v874prefixAutoTrim874
    BiliClient.prefs.v874prefixAutoTrim874 = !current
    AppToast.show(this, "Prefix Auto Trim874: ${if (!current) "ON" else "OFF"}")
}

// v874: Preload Auto Cache874
internal fun PlayerActivity.showV874PreloadAutoCache874Toggle() {
    val current = BiliClient.prefs.v874preloadAutoCache874
    BiliClient.prefs.v874preloadAutoCache874 = !current
    AppToast.show(this, "Preload Auto Cache874: ${if (!current) "ON" else "OFF"}")
}

// v875: Platform Auto Detect875
internal fun PlayerActivity.showV875PlatformAutoDetect875Toggle() {
    val current = BiliClient.prefs.v875platformAutoDetect875
    BiliClient.prefs.v875platformAutoDetect875 = !current
    AppToast.show(this, "Platform Auto Detect875: ${if (!current) "ON" else "OFF"}")
}

// v875: Play Auto Resume875
internal fun PlayerActivity.showV875PlayAutoResume875Toggle() {
    val current = BiliClient.prefs.v875playAutoResume875
    BiliClient.prefs.v875playAutoResume875 = !current
    AppToast.show(this, "Play Auto Resume875: ${if (!current) "ON" else "OFF"}")
}

// v875: Pointer Auto Lock875
internal fun PlayerActivity.showV875PointerAutoLock875Toggle() {
    val current = BiliClient.prefs.v875pointerAutoLock875
    BiliClient.prefs.v875pointerAutoLock875 = !current
    AppToast.show(this, "Pointer Auto Lock875: ${if (!current) "ON" else "OFF"}")
}

// v875: Poll Auto Interval875
internal fun PlayerActivity.showV875PollAutoInterval875Toggle() {
    val current = BiliClient.prefs.v875pollAutoInterval875
    BiliClient.prefs.v875pollAutoInterval875 = !current
    AppToast.show(this, "Poll Auto Interval875: ${if (!current) "ON" else "OFF"}")
}

// v875: Pool Auto Recycle875
internal fun PlayerActivity.showV875PoolAutoRecycle875Toggle() {
    val current = BiliClient.prefs.v875poolAutoRecycle875
    BiliClient.prefs.v875poolAutoRecycle875 = !current
    AppToast.show(this, "Pool Auto Recycle875: ${if (!current) "ON" else "OFF"}")
}

// v875: Pop Auto Dismiss875
internal fun PlayerActivity.showV875PopAutoDismiss875Toggle() {
    val current = BiliClient.prefs.v875popAutoDismiss875
    BiliClient.prefs.v875popAutoDismiss875 = !current
    AppToast.show(this, "Pop Auto Dismiss875: ${if (!current) "ON" else "OFF"}")
}

// v875: Port Auto Forward875
internal fun PlayerActivity.showV875PortAutoForward875Toggle() {
    val current = BiliClient.prefs.v875portAutoForward875
    BiliClient.prefs.v875portAutoForward875 = !current
    AppToast.show(this, "Port Auto Forward875: ${if (!current) "ON" else "OFF"}")
}

// v875: Position Auto Save875
internal fun PlayerActivity.showV875PositionAutoSave875Toggle() {
    val current = BiliClient.prefs.v875positionAutoSave875
    BiliClient.prefs.v875positionAutoSave875 = !current
    AppToast.show(this, "Position Auto Save875: ${if (!current) "ON" else "OFF"}")
}

// v875: Post Auto Schedule875
internal fun PlayerActivity.showV875PostAutoSchedule875Toggle() {
    val current = BiliClient.prefs.v875postAutoSchedule875
    BiliClient.prefs.v875postAutoSchedule875 = !current
    AppToast.show(this, "Post Auto Schedule875: ${if (!current) "ON" else "OFF"}")
}

// v875: Power Auto Save875
internal fun PlayerActivity.showV875PowerAutoSave875Toggle() {
    val current = BiliClient.prefs.v875powerAutoSave875
    BiliClient.prefs.v875powerAutoSave875 = !current
    AppToast.show(this, "Power Auto Save875: ${if (!current) "ON" else "OFF"}")
}

// v875: Pre Auto Load875
internal fun PlayerActivity.showV875PreAutoLoad875Toggle() {
    val current = BiliClient.prefs.v875preAutoLoad875
    BiliClient.prefs.v875preAutoLoad875 = !current
    AppToast.show(this, "Pre Auto Load875: ${if (!current) "ON" else "OFF"}")
}

// v875: Precision Auto Round875
internal fun PlayerActivity.showV875PrecisionAutoRound875Toggle() {
    val current = BiliClient.prefs.v875precisionAutoRound875
    BiliClient.prefs.v875precisionAutoRound875 = !current
    AppToast.show(this, "Precision Auto Round875: ${if (!current) "ON" else "OFF"}")
}

// v875: Predict Auto Prefetch875
internal fun PlayerActivity.showV875PredictAutoPrefetch875Toggle() {
    val current = BiliClient.prefs.v875predictAutoPrefetch875
    BiliClient.prefs.v875predictAutoPrefetch875 = !current
    AppToast.show(this, "Predict Auto Prefetch875: ${if (!current) "ON" else "OFF"}")
}

// v875: Prefix Auto Trim875
internal fun PlayerActivity.showV875PrefixAutoTrim875Toggle() {
    val current = BiliClient.prefs.v875prefixAutoTrim875
    BiliClient.prefs.v875prefixAutoTrim875 = !current
    AppToast.show(this, "Prefix Auto Trim875: ${if (!current) "ON" else "OFF"}")
}

// v875: Preload Auto Cache875
internal fun PlayerActivity.showV875PreloadAutoCache875Toggle() {
    val current = BiliClient.prefs.v875preloadAutoCache875
    BiliClient.prefs.v875preloadAutoCache875 = !current
    AppToast.show(this, "Preload Auto Cache875: ${if (!current) "ON" else "OFF"}")
}

// v876: Platform Auto Detect876
internal fun PlayerActivity.showV876PlatformAutoDetect876Toggle() {
    val current = BiliClient.prefs.v876platformAutoDetect876
    BiliClient.prefs.v876platformAutoDetect876 = !current
    AppToast.show(this, "Platform Auto Detect876: ${if (!current) "ON" else "OFF"}")
}

// v876: Play Auto Resume876
internal fun PlayerActivity.showV876PlayAutoResume876Toggle() {
    val current = BiliClient.prefs.v876playAutoResume876
    BiliClient.prefs.v876playAutoResume876 = !current
    AppToast.show(this, "Play Auto Resume876: ${if (!current) "ON" else "OFF"}")
}

// v876: Pointer Auto Lock876
internal fun PlayerActivity.showV876PointerAutoLock876Toggle() {
    val current = BiliClient.prefs.v876pointerAutoLock876
    BiliClient.prefs.v876pointerAutoLock876 = !current
    AppToast.show(this, "Pointer Auto Lock876: ${if (!current) "ON" else "OFF"}")
}

// v876: Poll Auto Interval876
internal fun PlayerActivity.showV876PollAutoInterval876Toggle() {
    val current = BiliClient.prefs.v876pollAutoInterval876
    BiliClient.prefs.v876pollAutoInterval876 = !current
    AppToast.show(this, "Poll Auto Interval876: ${if (!current) "ON" else "OFF"}")
}

// v876: Pool Auto Recycle876
internal fun PlayerActivity.showV876PoolAutoRecycle876Toggle() {
    val current = BiliClient.prefs.v876poolAutoRecycle876
    BiliClient.prefs.v876poolAutoRecycle876 = !current
    AppToast.show(this, "Pool Auto Recycle876: ${if (!current) "ON" else "OFF"}")
}

// v876: Pop Auto Dismiss876
internal fun PlayerActivity.showV876PopAutoDismiss876Toggle() {
    val current = BiliClient.prefs.v876popAutoDismiss876
    BiliClient.prefs.v876popAutoDismiss876 = !current
    AppToast.show(this, "Pop Auto Dismiss876: ${if (!current) "ON" else "OFF"}")
}

// v876: Port Auto Forward876
internal fun PlayerActivity.showV876PortAutoForward876Toggle() {
    val current = BiliClient.prefs.v876portAutoForward876
    BiliClient.prefs.v876portAutoForward876 = !current
    AppToast.show(this, "Port Auto Forward876: ${if (!current) "ON" else "OFF"}")
}

// v876: Position Auto Save876
internal fun PlayerActivity.showV876PositionAutoSave876Toggle() {
    val current = BiliClient.prefs.v876positionAutoSave876
    BiliClient.prefs.v876positionAutoSave876 = !current
    AppToast.show(this, "Position Auto Save876: ${if (!current) "ON" else "OFF"}")
}

// v876: Post Auto Schedule876
internal fun PlayerActivity.showV876PostAutoSchedule876Toggle() {
    val current = BiliClient.prefs.v876postAutoSchedule876
    BiliClient.prefs.v876postAutoSchedule876 = !current
    AppToast.show(this, "Post Auto Schedule876: ${if (!current) "ON" else "OFF"}")
}

// v876: Power Auto Save876
internal fun PlayerActivity.showV876PowerAutoSave876Toggle() {
    val current = BiliClient.prefs.v876powerAutoSave876
    BiliClient.prefs.v876powerAutoSave876 = !current
    AppToast.show(this, "Power Auto Save876: ${if (!current) "ON" else "OFF"}")
}

// v876: Pre Auto Load876
internal fun PlayerActivity.showV876PreAutoLoad876Toggle() {
    val current = BiliClient.prefs.v876preAutoLoad876
    BiliClient.prefs.v876preAutoLoad876 = !current
    AppToast.show(this, "Pre Auto Load876: ${if (!current) "ON" else "OFF"}")
}

// v876: Precision Auto Round876
internal fun PlayerActivity.showV876PrecisionAutoRound876Toggle() {
    val current = BiliClient.prefs.v876precisionAutoRound876
    BiliClient.prefs.v876precisionAutoRound876 = !current
    AppToast.show(this, "Precision Auto Round876: ${if (!current) "ON" else "OFF"}")
}

// v876: Predict Auto Prefetch876
internal fun PlayerActivity.showV876PredictAutoPrefetch876Toggle() {
    val current = BiliClient.prefs.v876predictAutoPrefetch876
    BiliClient.prefs.v876predictAutoPrefetch876 = !current
    AppToast.show(this, "Predict Auto Prefetch876: ${if (!current) "ON" else "OFF"}")
}

// v876: Prefix Auto Trim876
internal fun PlayerActivity.showV876PrefixAutoTrim876Toggle() {
    val current = BiliClient.prefs.v876prefixAutoTrim876
    BiliClient.prefs.v876prefixAutoTrim876 = !current
    AppToast.show(this, "Prefix Auto Trim876: ${if (!current) "ON" else "OFF"}")
}

// v876: Preload Auto Cache876
internal fun PlayerActivity.showV876PreloadAutoCache876Toggle() {
    val current = BiliClient.prefs.v876preloadAutoCache876
    BiliClient.prefs.v876preloadAutoCache876 = !current
    AppToast.show(this, "Preload Auto Cache876: ${if (!current) "ON" else "OFF"}")
}

// v877: Platform Auto Detect877
internal fun PlayerActivity.showV877PlatformAutoDetect877Toggle() {
    val current = BiliClient.prefs.v877platformAutoDetect877
    BiliClient.prefs.v877platformAutoDetect877 = !current
    AppToast.show(this, "Platform Auto Detect877: ${if (!current) "ON" else "OFF"}")
}

// v877: Play Auto Resume877
internal fun PlayerActivity.showV877PlayAutoResume877Toggle() {
    val current = BiliClient.prefs.v877playAutoResume877
    BiliClient.prefs.v877playAutoResume877 = !current
    AppToast.show(this, "Play Auto Resume877: ${if (!current) "ON" else "OFF"}")
}

// v877: Pointer Auto Lock877
internal fun PlayerActivity.showV877PointerAutoLock877Toggle() {
    val current = BiliClient.prefs.v877pointerAutoLock877
    BiliClient.prefs.v877pointerAutoLock877 = !current
    AppToast.show(this, "Pointer Auto Lock877: ${if (!current) "ON" else "OFF"}")
}

// v877: Poll Auto Interval877
internal fun PlayerActivity.showV877PollAutoInterval877Toggle() {
    val current = BiliClient.prefs.v877pollAutoInterval877
    BiliClient.prefs.v877pollAutoInterval877 = !current
    AppToast.show(this, "Poll Auto Interval877: ${if (!current) "ON" else "OFF"}")
}

// v877: Pool Auto Recycle877
internal fun PlayerActivity.showV877PoolAutoRecycle877Toggle() {
    val current = BiliClient.prefs.v877poolAutoRecycle877
    BiliClient.prefs.v877poolAutoRecycle877 = !current
    AppToast.show(this, "Pool Auto Recycle877: ${if (!current) "ON" else "OFF"}")
}

// v877: Pop Auto Dismiss877
internal fun PlayerActivity.showV877PopAutoDismiss877Toggle() {
    val current = BiliClient.prefs.v877popAutoDismiss877
    BiliClient.prefs.v877popAutoDismiss877 = !current
    AppToast.show(this, "Pop Auto Dismiss877: ${if (!current) "ON" else "OFF"}")
}

// v877: Port Auto Forward877
internal fun PlayerActivity.showV877PortAutoForward877Toggle() {
    val current = BiliClient.prefs.v877portAutoForward877
    BiliClient.prefs.v877portAutoForward877 = !current
    AppToast.show(this, "Port Auto Forward877: ${if (!current) "ON" else "OFF"}")
}

// v877: Position Auto Save877
internal fun PlayerActivity.showV877PositionAutoSave877Toggle() {
    val current = BiliClient.prefs.v877positionAutoSave877
    BiliClient.prefs.v877positionAutoSave877 = !current
    AppToast.show(this, "Position Auto Save877: ${if (!current) "ON" else "OFF"}")
}

// v877: Post Auto Schedule877
internal fun PlayerActivity.showV877PostAutoSchedule877Toggle() {
    val current = BiliClient.prefs.v877postAutoSchedule877
    BiliClient.prefs.v877postAutoSchedule877 = !current
    AppToast.show(this, "Post Auto Schedule877: ${if (!current) "ON" else "OFF"}")
}

// v877: Power Auto Save877
internal fun PlayerActivity.showV877PowerAutoSave877Toggle() {
    val current = BiliClient.prefs.v877powerAutoSave877
    BiliClient.prefs.v877powerAutoSave877 = !current
    AppToast.show(this, "Power Auto Save877: ${if (!current) "ON" else "OFF"}")
}

// v877: Pre Auto Load877
internal fun PlayerActivity.showV877PreAutoLoad877Toggle() {
    val current = BiliClient.prefs.v877preAutoLoad877
    BiliClient.prefs.v877preAutoLoad877 = !current
    AppToast.show(this, "Pre Auto Load877: ${if (!current) "ON" else "OFF"}")
}

// v877: Precision Auto Round877
internal fun PlayerActivity.showV877PrecisionAutoRound877Toggle() {
    val current = BiliClient.prefs.v877precisionAutoRound877
    BiliClient.prefs.v877precisionAutoRound877 = !current
    AppToast.show(this, "Precision Auto Round877: ${if (!current) "ON" else "OFF"}")
}

// v877: Predict Auto Prefetch877
internal fun PlayerActivity.showV877PredictAutoPrefetch877Toggle() {
    val current = BiliClient.prefs.v877predictAutoPrefetch877
    BiliClient.prefs.v877predictAutoPrefetch877 = !current
    AppToast.show(this, "Predict Auto Prefetch877: ${if (!current) "ON" else "OFF"}")
}

// v877: Prefix Auto Trim877
internal fun PlayerActivity.showV877PrefixAutoTrim877Toggle() {
    val current = BiliClient.prefs.v877prefixAutoTrim877
    BiliClient.prefs.v877prefixAutoTrim877 = !current
    AppToast.show(this, "Prefix Auto Trim877: ${if (!current) "ON" else "OFF"}")
}

// v877: Preload Auto Cache877
internal fun PlayerActivity.showV877PreloadAutoCache877Toggle() {
    val current = BiliClient.prefs.v877preloadAutoCache877
    BiliClient.prefs.v877preloadAutoCache877 = !current
    AppToast.show(this, "Preload Auto Cache877: ${if (!current) "ON" else "OFF"}")
}

// v878: Platform Auto Detect878
internal fun PlayerActivity.showV878PlatformAutoDetect878Toggle() {
    val current = BiliClient.prefs.v878platformAutoDetect878
    BiliClient.prefs.v878platformAutoDetect878 = !current
    AppToast.show(this, "Platform Auto Detect878: ${if (!current) "ON" else "OFF"}")
}

// v878: Play Auto Resume878
internal fun PlayerActivity.showV878PlayAutoResume878Toggle() {
    val current = BiliClient.prefs.v878playAutoResume878
    BiliClient.prefs.v878playAutoResume878 = !current
    AppToast.show(this, "Play Auto Resume878: ${if (!current) "ON" else "OFF"}")
}

// v878: Pointer Auto Lock878
internal fun PlayerActivity.showV878PointerAutoLock878Toggle() {
    val current = BiliClient.prefs.v878pointerAutoLock878
    BiliClient.prefs.v878pointerAutoLock878 = !current
    AppToast.show(this, "Pointer Auto Lock878: ${if (!current) "ON" else "OFF"}")
}

// v878: Poll Auto Interval878
internal fun PlayerActivity.showV878PollAutoInterval878Toggle() {
    val current = BiliClient.prefs.v878pollAutoInterval878
    BiliClient.prefs.v878pollAutoInterval878 = !current
    AppToast.show(this, "Poll Auto Interval878: ${if (!current) "ON" else "OFF"}")
}

// v878: Pool Auto Recycle878
internal fun PlayerActivity.showV878PoolAutoRecycle878Toggle() {
    val current = BiliClient.prefs.v878poolAutoRecycle878
    BiliClient.prefs.v878poolAutoRecycle878 = !current
    AppToast.show(this, "Pool Auto Recycle878: ${if (!current) "ON" else "OFF"}")
}

// v878: Pop Auto Dismiss878
internal fun PlayerActivity.showV878PopAutoDismiss878Toggle() {
    val current = BiliClient.prefs.v878popAutoDismiss878
    BiliClient.prefs.v878popAutoDismiss878 = !current
    AppToast.show(this, "Pop Auto Dismiss878: ${if (!current) "ON" else "OFF"}")
}

// v878: Port Auto Forward878
internal fun PlayerActivity.showV878PortAutoForward878Toggle() {
    val current = BiliClient.prefs.v878portAutoForward878
    BiliClient.prefs.v878portAutoForward878 = !current
    AppToast.show(this, "Port Auto Forward878: ${if (!current) "ON" else "OFF"}")
}

// v878: Position Auto Save878
internal fun PlayerActivity.showV878PositionAutoSave878Toggle() {
    val current = BiliClient.prefs.v878positionAutoSave878
    BiliClient.prefs.v878positionAutoSave878 = !current
    AppToast.show(this, "Position Auto Save878: ${if (!current) "ON" else "OFF"}")
}

// v878: Post Auto Schedule878
internal fun PlayerActivity.showV878PostAutoSchedule878Toggle() {
    val current = BiliClient.prefs.v878postAutoSchedule878
    BiliClient.prefs.v878postAutoSchedule878 = !current
    AppToast.show(this, "Post Auto Schedule878: ${if (!current) "ON" else "OFF"}")
}

// v878: Power Auto Save878
internal fun PlayerActivity.showV878PowerAutoSave878Toggle() {
    val current = BiliClient.prefs.v878powerAutoSave878
    BiliClient.prefs.v878powerAutoSave878 = !current
    AppToast.show(this, "Power Auto Save878: ${if (!current) "ON" else "OFF"}")
}

// v878: Pre Auto Load878
internal fun PlayerActivity.showV878PreAutoLoad878Toggle() {
    val current = BiliClient.prefs.v878preAutoLoad878
    BiliClient.prefs.v878preAutoLoad878 = !current
    AppToast.show(this, "Pre Auto Load878: ${if (!current) "ON" else "OFF"}")
}

// v878: Precision Auto Round878
internal fun PlayerActivity.showV878PrecisionAutoRound878Toggle() {
    val current = BiliClient.prefs.v878precisionAutoRound878
    BiliClient.prefs.v878precisionAutoRound878 = !current
    AppToast.show(this, "Precision Auto Round878: ${if (!current) "ON" else "OFF"}")
}

// v878: Predict Auto Prefetch878
internal fun PlayerActivity.showV878PredictAutoPrefetch878Toggle() {
    val current = BiliClient.prefs.v878predictAutoPrefetch878
    BiliClient.prefs.v878predictAutoPrefetch878 = !current
    AppToast.show(this, "Predict Auto Prefetch878: ${if (!current) "ON" else "OFF"}")
}

// v878: Prefix Auto Trim878
internal fun PlayerActivity.showV878PrefixAutoTrim878Toggle() {
    val current = BiliClient.prefs.v878prefixAutoTrim878
    BiliClient.prefs.v878prefixAutoTrim878 = !current
    AppToast.show(this, "Prefix Auto Trim878: ${if (!current) "ON" else "OFF"}")
}

// v878: Preload Auto Cache878
internal fun PlayerActivity.showV878PreloadAutoCache878Toggle() {
    val current = BiliClient.prefs.v878preloadAutoCache878
    BiliClient.prefs.v878preloadAutoCache878 = !current
    AppToast.show(this, "Preload Auto Cache878: ${if (!current) "ON" else "OFF"}")
}

// v879: Platform Auto Detect879
internal fun PlayerActivity.showV879PlatformAutoDetect879Toggle() {
    val current = BiliClient.prefs.v879platformAutoDetect879
    BiliClient.prefs.v879platformAutoDetect879 = !current
    AppToast.show(this, "Platform Auto Detect879: ${if (!current) "ON" else "OFF"}")
}

// v879: Play Auto Resume879
internal fun PlayerActivity.showV879PlayAutoResume879Toggle() {
    val current = BiliClient.prefs.v879playAutoResume879
    BiliClient.prefs.v879playAutoResume879 = !current
    AppToast.show(this, "Play Auto Resume879: ${if (!current) "ON" else "OFF"}")
}

// v879: Pointer Auto Lock879
internal fun PlayerActivity.showV879PointerAutoLock879Toggle() {
    val current = BiliClient.prefs.v879pointerAutoLock879
    BiliClient.prefs.v879pointerAutoLock879 = !current
    AppToast.show(this, "Pointer Auto Lock879: ${if (!current) "ON" else "OFF"}")
}

// v879: Poll Auto Interval879
internal fun PlayerActivity.showV879PollAutoInterval879Toggle() {
    val current = BiliClient.prefs.v879pollAutoInterval879
    BiliClient.prefs.v879pollAutoInterval879 = !current
    AppToast.show(this, "Poll Auto Interval879: ${if (!current) "ON" else "OFF"}")
}

// v879: Pool Auto Recycle879
internal fun PlayerActivity.showV879PoolAutoRecycle879Toggle() {
    val current = BiliClient.prefs.v879poolAutoRecycle879
    BiliClient.prefs.v879poolAutoRecycle879 = !current
    AppToast.show(this, "Pool Auto Recycle879: ${if (!current) "ON" else "OFF"}")
}

// v879: Pop Auto Dismiss879
internal fun PlayerActivity.showV879PopAutoDismiss879Toggle() {
    val current = BiliClient.prefs.v879popAutoDismiss879
    BiliClient.prefs.v879popAutoDismiss879 = !current
    AppToast.show(this, "Pop Auto Dismiss879: ${if (!current) "ON" else "OFF"}")
}

// v879: Port Auto Forward879
internal fun PlayerActivity.showV879PortAutoForward879Toggle() {
    val current = BiliClient.prefs.v879portAutoForward879
    BiliClient.prefs.v879portAutoForward879 = !current
    AppToast.show(this, "Port Auto Forward879: ${if (!current) "ON" else "OFF"}")
}

// v879: Position Auto Save879
internal fun PlayerActivity.showV879PositionAutoSave879Toggle() {
    val current = BiliClient.prefs.v879positionAutoSave879
    BiliClient.prefs.v879positionAutoSave879 = !current
    AppToast.show(this, "Position Auto Save879: ${if (!current) "ON" else "OFF"}")
}

// v879: Post Auto Schedule879
internal fun PlayerActivity.showV879PostAutoSchedule879Toggle() {
    val current = BiliClient.prefs.v879postAutoSchedule879
    BiliClient.prefs.v879postAutoSchedule879 = !current
    AppToast.show(this, "Post Auto Schedule879: ${if (!current) "ON" else "OFF"}")
}

// v879: Power Auto Save879
internal fun PlayerActivity.showV879PowerAutoSave879Toggle() {
    val current = BiliClient.prefs.v879powerAutoSave879
    BiliClient.prefs.v879powerAutoSave879 = !current
    AppToast.show(this, "Power Auto Save879: ${if (!current) "ON" else "OFF"}")
}

// v879: Pre Auto Load879
internal fun PlayerActivity.showV879PreAutoLoad879Toggle() {
    val current = BiliClient.prefs.v879preAutoLoad879
    BiliClient.prefs.v879preAutoLoad879 = !current
    AppToast.show(this, "Pre Auto Load879: ${if (!current) "ON" else "OFF"}")
}

// v879: Precision Auto Round879
internal fun PlayerActivity.showV879PrecisionAutoRound879Toggle() {
    val current = BiliClient.prefs.v879precisionAutoRound879
    BiliClient.prefs.v879precisionAutoRound879 = !current
    AppToast.show(this, "Precision Auto Round879: ${if (!current) "ON" else "OFF"}")
}

// v879: Predict Auto Prefetch879
internal fun PlayerActivity.showV879PredictAutoPrefetch879Toggle() {
    val current = BiliClient.prefs.v879predictAutoPrefetch879
    BiliClient.prefs.v879predictAutoPrefetch879 = !current
    AppToast.show(this, "Predict Auto Prefetch879: ${if (!current) "ON" else "OFF"}")
}

// v879: Prefix Auto Trim879
internal fun PlayerActivity.showV879PrefixAutoTrim879Toggle() {
    val current = BiliClient.prefs.v879prefixAutoTrim879
    BiliClient.prefs.v879prefixAutoTrim879 = !current
    AppToast.show(this, "Prefix Auto Trim879: ${if (!current) "ON" else "OFF"}")
}

// v879: Preload Auto Cache879
internal fun PlayerActivity.showV879PreloadAutoCache879Toggle() {
    val current = BiliClient.prefs.v879preloadAutoCache879
    BiliClient.prefs.v879preloadAutoCache879 = !current
    AppToast.show(this, "Preload Auto Cache879: ${if (!current) "ON" else "OFF"}")
}

// v880: Platform Auto Detect880
internal fun PlayerActivity.showV880PlatformAutoDetect880Toggle() {
    val current = BiliClient.prefs.v880platformAutoDetect880
    BiliClient.prefs.v880platformAutoDetect880 = !current
    AppToast.show(this, "Platform Auto Detect880: ${if (!current) "ON" else "OFF"}")
}

// v880: Play Auto Resume880
internal fun PlayerActivity.showV880PlayAutoResume880Toggle() {
    val current = BiliClient.prefs.v880playAutoResume880
    BiliClient.prefs.v880playAutoResume880 = !current
    AppToast.show(this, "Play Auto Resume880: ${if (!current) "ON" else "OFF"}")
}

// v880: Pointer Auto Lock880
internal fun PlayerActivity.showV880PointerAutoLock880Toggle() {
    val current = BiliClient.prefs.v880pointerAutoLock880
    BiliClient.prefs.v880pointerAutoLock880 = !current
    AppToast.show(this, "Pointer Auto Lock880: ${if (!current) "ON" else "OFF"}")
}

// v880: Poll Auto Interval880
internal fun PlayerActivity.showV880PollAutoInterval880Toggle() {
    val current = BiliClient.prefs.v880pollAutoInterval880
    BiliClient.prefs.v880pollAutoInterval880 = !current
    AppToast.show(this, "Poll Auto Interval880: ${if (!current) "ON" else "OFF"}")
}

// v880: Pool Auto Recycle880
internal fun PlayerActivity.showV880PoolAutoRecycle880Toggle() {
    val current = BiliClient.prefs.v880poolAutoRecycle880
    BiliClient.prefs.v880poolAutoRecycle880 = !current
    AppToast.show(this, "Pool Auto Recycle880: ${if (!current) "ON" else "OFF"}")
}

// v880: Pop Auto Dismiss880
internal fun PlayerActivity.showV880PopAutoDismiss880Toggle() {
    val current = BiliClient.prefs.v880popAutoDismiss880
    BiliClient.prefs.v880popAutoDismiss880 = !current
    AppToast.show(this, "Pop Auto Dismiss880: ${if (!current) "ON" else "OFF"}")
}

// v880: Port Auto Forward880
internal fun PlayerActivity.showV880PortAutoForward880Toggle() {
    val current = BiliClient.prefs.v880portAutoForward880
    BiliClient.prefs.v880portAutoForward880 = !current
    AppToast.show(this, "Port Auto Forward880: ${if (!current) "ON" else "OFF"}")
}

// v880: Position Auto Save880
internal fun PlayerActivity.showV880PositionAutoSave880Toggle() {
    val current = BiliClient.prefs.v880positionAutoSave880
    BiliClient.prefs.v880positionAutoSave880 = !current
    AppToast.show(this, "Position Auto Save880: ${if (!current) "ON" else "OFF"}")
}

// v880: Post Auto Schedule880
internal fun PlayerActivity.showV880PostAutoSchedule880Toggle() {
    val current = BiliClient.prefs.v880postAutoSchedule880
    BiliClient.prefs.v880postAutoSchedule880 = !current
    AppToast.show(this, "Post Auto Schedule880: ${if (!current) "ON" else "OFF"}")
}

// v880: Power Auto Save880
internal fun PlayerActivity.showV880PowerAutoSave880Toggle() {
    val current = BiliClient.prefs.v880powerAutoSave880
    BiliClient.prefs.v880powerAutoSave880 = !current
    AppToast.show(this, "Power Auto Save880: ${if (!current) "ON" else "OFF"}")
}

// v880: Pre Auto Load880
internal fun PlayerActivity.showV880PreAutoLoad880Toggle() {
    val current = BiliClient.prefs.v880preAutoLoad880
    BiliClient.prefs.v880preAutoLoad880 = !current
    AppToast.show(this, "Pre Auto Load880: ${if (!current) "ON" else "OFF"}")
}

// v880: Precision Auto Round880
internal fun PlayerActivity.showV880PrecisionAutoRound880Toggle() {
    val current = BiliClient.prefs.v880precisionAutoRound880
    BiliClient.prefs.v880precisionAutoRound880 = !current
    AppToast.show(this, "Precision Auto Round880: ${if (!current) "ON" else "OFF"}")
}

// v880: Predict Auto Prefetch880
internal fun PlayerActivity.showV880PredictAutoPrefetch880Toggle() {
    val current = BiliClient.prefs.v880predictAutoPrefetch880
    BiliClient.prefs.v880predictAutoPrefetch880 = !current
    AppToast.show(this, "Predict Auto Prefetch880: ${if (!current) "ON" else "OFF"}")
}

// v880: Prefix Auto Trim880
internal fun PlayerActivity.showV880PrefixAutoTrim880Toggle() {
    val current = BiliClient.prefs.v880prefixAutoTrim880
    BiliClient.prefs.v880prefixAutoTrim880 = !current
    AppToast.show(this, "Prefix Auto Trim880: ${if (!current) "ON" else "OFF"}")
}

// v880: Preload Auto Cache880
internal fun PlayerActivity.showV880PreloadAutoCache880Toggle() {
    val current = BiliClient.prefs.v880preloadAutoCache880
    BiliClient.prefs.v880preloadAutoCache880 = !current
    AppToast.show(this, "Preload Auto Cache880: ${if (!current) "ON" else "OFF"}")
}

