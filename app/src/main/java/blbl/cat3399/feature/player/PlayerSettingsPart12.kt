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

internal fun PlayerActivity.showV175DanmakuScrollOverlapMode175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollOverlapMode175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollOverlapMode175 = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode175: $value")
    }
}

internal fun PlayerActivity.showV175SubtitleShadowToggle175Toggle() {
    val current = BiliClient.prefs.v175subtitleShadowToggle175
    BiliClient.prefs.v175subtitleShadowToggle175 = !current
    AppToast.show(this, "Subtitle Shadow Toggle175: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV175GestureDoubleTapSeekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175gestureDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175gestureDoubleTapSeek = value
        AppToast.show(this, "Gesture Double Tap Seek: $value")
    }
}

internal fun PlayerActivity.showV175CastVideoPIPDisconnectActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175castVideoPIPDisconnectAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Disconnect Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175castVideoPIPDisconnectAction = value
        AppToast.show(this, "Cast Video PIP Disconnect Action: $value")
    }
}

internal fun PlayerActivity.showV175PlaylistSkipOnErrorToggle() {
    val current = BiliClient.prefs.v175playlistSkipOnError
    BiliClient.prefs.v175playlistSkipOnError = !current
    AppToast.show(this, "Playlist Skip On Error: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV175CacheCompressLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175cacheCompressLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175cacheCompressLevel175 = value
        AppToast.show(this, "Cache Compress Level175: $value")
    }
}

internal fun PlayerActivity.showV175ProgressBarScrubHapticToggle() {
    val current = BiliClient.prefs.v175progressBarScrubHaptic
    BiliClient.prefs.v175progressBarScrubHaptic = !current
    AppToast.show(this, "Progress Bar Scrub Haptic: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV175VolumeNormalizeAlbumToggle() {
    val current = BiliClient.prefs.v175volumeNormalizeAlbum
    BiliClient.prefs.v175volumeNormalizeAlbum = !current
    AppToast.show(this, "Volume Normalize Album: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV175HistoryFilterByDurationToggle() {
    val current = BiliClient.prefs.v175historyFilterByDuration
    BiliClient.prefs.v175historyFilterByDuration = !current
    AppToast.show(this, "History Filter By Duration: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV175PlaybackVideoOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175playbackVideoOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175playbackVideoOffset = value
        AppToast.show(this, "Playback Video Offset: $value")
    }
}

internal fun PlayerActivity.showV175ScreenshotOverlayChannelToggle() {
    val current = BiliClient.prefs.v175screenshotOverlayChannel
    BiliClient.prefs.v175screenshotOverlayChannel = !current
    AppToast.show(this, "Screenshot Overlay Channel: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV175VideoSaturationLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175videoSaturationLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175videoSaturationLevel175 = value
        AppToast.show(this, "Video Saturation Level175: $value")
    }
}

internal fun PlayerActivity.showV175DanmakuScrollFilterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollFilter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollFilter = value
        AppToast.show(this, "Danmaku Scroll Filter: $value")
    }
}

internal fun PlayerActivity.showV175SubtitleShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175subtitleShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175subtitleShadowColor = value
        AppToast.show(this, "Subtitle Shadow Color: $value")
    }
}

internal fun PlayerActivity.showV176AudioCompressorRatio176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176audioCompressorRatio176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176audioCompressorRatio176 = value
        AppToast.show(this, "Audio Compressor Ratio176: $value")
    }
}

internal fun PlayerActivity.showV176DanmakuScrollFilter176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176danmakuScrollFilter176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176danmakuScrollFilter176 = value
        AppToast.show(this, "Danmaku Scroll Filter176: $value")
    }
}

internal fun PlayerActivity.showV176SubtitleShadowColor176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowColor176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowColor176 = value
        AppToast.show(this, "Subtitle Shadow Color176: $value")
    }
}

internal fun PlayerActivity.showV176GestureDoubleTapSeek176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176gestureDoubleTapSeek176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176gestureDoubleTapSeek176 = value
        AppToast.show(this, "Gesture Double Tap Seek176: $value")
    }
}

internal fun PlayerActivity.showV176CastVideoPIPReconnectToggle() {
    val current = BiliClient.prefs.v176castVideoPIPReconnect
    BiliClient.prefs.v176castVideoPIPReconnect = !current
    AppToast.show(this, "Cast Video PIP Reconnect: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176PlaylistSkipOnError176Toggle() {
    val current = BiliClient.prefs.v176playlistSkipOnError176
    BiliClient.prefs.v176playlistSkipOnError176 = !current
    AppToast.show(this, "Playlist Skip On Error176: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176CacheStreamBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176cacheStreamBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176cacheStreamBufferSize = value
        AppToast.show(this, "Cache Stream Buffer Size: $value")
    }
}

internal fun PlayerActivity.showV176ProgressBarScrubHaptic176Toggle() {
    val current = BiliClient.prefs.v176progressBarScrubHaptic176
    BiliClient.prefs.v176progressBarScrubHaptic176 = !current
    AppToast.show(this, "Progress Bar Scrub Haptic176: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176VolumeNormalizeAlbum176Toggle() {
    val current = BiliClient.prefs.v176volumeNormalizeAlbum176
    BiliClient.prefs.v176volumeNormalizeAlbum176 = !current
    AppToast.show(this, "Volume Normalize Album176: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176HistoryFilterByDuration176Toggle() {
    val current = BiliClient.prefs.v176historyFilterByDuration176
    BiliClient.prefs.v176historyFilterByDuration176 = !current
    AppToast.show(this, "History Filter By Duration176: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176PlaybackVideoOffset176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176playbackVideoOffset176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176playbackVideoOffset176 = value
        AppToast.show(this, "Playback Video Offset176: $value")
    }
}

internal fun PlayerActivity.showV176ScreenshotOverlayQualityToggle() {
    val current = BiliClient.prefs.v176screenshotOverlayQuality
    BiliClient.prefs.v176screenshotOverlayQuality = !current
    AppToast.show(this, "Screenshot Overlay Quality: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176VideoSaturationLevel176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176videoSaturationLevel176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176videoSaturationLevel176 = value
        AppToast.show(this, "Video Saturation Level176: $value")
    }
}

internal fun PlayerActivity.showV176DanmakuScrollHideOnActionToggle() {
    val current = BiliClient.prefs.v176danmakuScrollHideOnAction
    BiliClient.prefs.v176danmakuScrollHideOnAction = !current
    AppToast.show(this, "Danmaku Scroll Hide On Action: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV176SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
}

internal fun PlayerActivity.showV177AudioCompressorKnee177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177audioCompressorKnee177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Knee177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177audioCompressorKnee177 = value
        AppToast.show(this, "Audio Compressor Knee177: $value")
    }
}

internal fun PlayerActivity.showV177DanmakuScrollHideOnAction177Toggle() {
    val current = BiliClient.prefs.v177danmakuScrollHideOnAction177
    BiliClient.prefs.v177danmakuScrollHideOnAction177 = !current
    AppToast.show(this, "Danmaku Scroll Hide On Action177: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177SubtitleShadowBlur177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowBlur177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowBlur177 = value
        AppToast.show(this, "Subtitle Shadow Blur177: $value")
    }
}

internal fun PlayerActivity.showV177GestureDoubleTapPlayPauseToggle() {
    val current = BiliClient.prefs.v177gestureDoubleTapPlayPause
    BiliClient.prefs.v177gestureDoubleTapPlayPause = !current
    AppToast.show(this, "Gesture Double Tap Play Pause: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177CastVideoPIPReconnect177Toggle() {
    val current = BiliClient.prefs.v177castVideoPIPReconnect177
    BiliClient.prefs.v177castVideoPIPReconnect177 = !current
    AppToast.show(this, "Cast Video PIP Reconnect177: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177PlaylistMaxHistorySizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177playlistMaxHistorySize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177playlistMaxHistorySize = value
        AppToast.show(this, "Playlist Max History Size: $value")
    }
}

internal fun PlayerActivity.showV177CacheStreamBufferSize177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177cacheStreamBufferSize177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177cacheStreamBufferSize177 = value
        AppToast.show(this, "Cache Stream Buffer Size177: $value")
    }
}

internal fun PlayerActivity.showV177ProgressBarScrubTimelineToggle() {
    val current = BiliClient.prefs.v177progressBarScrubTimeline
    BiliClient.prefs.v177progressBarScrubTimeline = !current
    AppToast.show(this, "Progress Bar Scrub Timeline: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177VolumeNormalizeTrack177Toggle() {
    val current = BiliClient.prefs.v177volumeNormalizeTrack177
    BiliClient.prefs.v177volumeNormalizeTrack177 = !current
    AppToast.show(this, "Volume Normalize Track177: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177HistoryFilterByUploaderToggle() {
    val current = BiliClient.prefs.v177historyFilterByUploader
    BiliClient.prefs.v177historyFilterByUploader = !current
    AppToast.show(this, "History Filter By Uploader: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177PlaybackDeinterlaceToggleToggle() {
    val current = BiliClient.prefs.v177playbackDeinterlaceToggle
    BiliClient.prefs.v177playbackDeinterlaceToggle = !current
    AppToast.show(this, "Playback Deinterlace Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177ScreenshotOverlayBitrateToggle() {
    val current = BiliClient.prefs.v177screenshotOverlayBitrate
    BiliClient.prefs.v177screenshotOverlayBitrate = !current
    AppToast.show(this, "Screenshot Overlay Bitrate: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177VideoBrightnessToggle177Toggle() {
    val current = BiliClient.prefs.v177videoBrightnessToggle177
    BiliClient.prefs.v177videoBrightnessToggle177 = !current
    AppToast.show(this, "Video Brightness Toggle177: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177DanmakuScrollAutoSpeedToggle() {
    val current = BiliClient.prefs.v177danmakuScrollAutoSpeed
    BiliClient.prefs.v177danmakuScrollAutoSpeed = !current
    AppToast.show(this, "Danmaku Scroll Auto Speed: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV177SubtitleShadowOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowOffset = value
        AppToast.show(this, "Subtitle Shadow Offset: $value")
    }
}

internal fun PlayerActivity.showV178AudioCompressorAttack178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178audioCompressorAttack178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178audioCompressorAttack178 = value
        AppToast.show(this, "Audio Compressor Attack178: $value")
    }
}

internal fun PlayerActivity.showV178DanmakuScrollAutoSpeed178Toggle() {
    val current = BiliClient.prefs.v178danmakuScrollAutoSpeed178
    BiliClient.prefs.v178danmakuScrollAutoSpeed178 = !current
    AppToast.show(this, "Danmaku Scroll Auto Speed178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178SubtitleShadowOffset178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178subtitleShadowOffset178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178subtitleShadowOffset178 = value
        AppToast.show(this, "Subtitle Shadow Offset178: $value")
    }
}

internal fun PlayerActivity.showV178GestureDoubleTapPlayPause178Toggle() {
    val current = BiliClient.prefs.v178gestureDoubleTapPlayPause178
    BiliClient.prefs.v178gestureDoubleTapPlayPause178 = !current
    AppToast.show(this, "Gesture Double Tap Play Pause178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178CastVideoPIPResolutionLockToggle() {
    val current = BiliClient.prefs.v178castVideoPIPResolutionLock
    BiliClient.prefs.v178castVideoPIPResolutionLock = !current
    AppToast.show(this, "Cast Video PIP Resolution Lock: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178PlaylistMaxHistorySize178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178playlistMaxHistorySize178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178playlistMaxHistorySize178 = value
        AppToast.show(this, "Playlist Max History Size178: $value")
    }
}

internal fun PlayerActivity.showV178CacheStreamPrefetchToggle() {
    val current = BiliClient.prefs.v178cacheStreamPrefetch
    BiliClient.prefs.v178cacheStreamPrefetch = !current
    AppToast.show(this, "Cache Stream Prefetch: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178ProgressBarScrubTimeline178Toggle() {
    val current = BiliClient.prefs.v178progressBarScrubTimeline178
    BiliClient.prefs.v178progressBarScrubTimeline178 = !current
    AppToast.show(this, "Progress Bar Scrub Timeline178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178VolumeNormalizeTrack178Toggle() {
    val current = BiliClient.prefs.v178volumeNormalizeTrack178
    BiliClient.prefs.v178volumeNormalizeTrack178 = !current
    AppToast.show(this, "Volume Normalize Track178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178HistoryFilterByUploader178Toggle() {
    val current = BiliClient.prefs.v178historyFilterByUploader178
    BiliClient.prefs.v178historyFilterByUploader178 = !current
    AppToast.show(this, "History Filter By Uploader178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178PlaybackDeinterlaceToggle178Toggle() {
    val current = BiliClient.prefs.v178playbackDeinterlaceToggle178
    BiliClient.prefs.v178playbackDeinterlaceToggle178 = !current
    AppToast.show(this, "Playback Deinterlace Toggle178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178ScreenshotOverlayFPSToggle() {
    val current = BiliClient.prefs.v178screenshotOverlayFPS
    BiliClient.prefs.v178screenshotOverlayFPS = !current
    AppToast.show(this, "Screenshot Overlay FPS: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV178VideoBrightnessLevel178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178videoBrightnessLevel178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178videoBrightnessLevel178 = value
        AppToast.show(this, "Video Brightness Level178: $value")
    }
}

internal fun PlayerActivity.showV178DanmakuScrollPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178danmakuScrollPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178danmakuScrollPriority = value
        AppToast.show(this, "Danmaku Scroll Priority: $value")
    }
}

internal fun PlayerActivity.showV178SubtitleOutlineToggle178Toggle() {
    val current = BiliClient.prefs.v178subtitleOutlineToggle178
    BiliClient.prefs.v178subtitleOutlineToggle178 = !current
    AppToast.show(this, "Subtitle Outline Toggle178: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179AudioCompressorRelease179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179audioCompressorRelease179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179audioCompressorRelease179 = value
        AppToast.show(this, "Audio Compressor Release179: $value")
    }
}

internal fun PlayerActivity.showV179DanmakuScrollPriority179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179danmakuScrollPriority179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179danmakuScrollPriority179 = value
        AppToast.show(this, "Danmaku Scroll Priority179: $value")
    }
}

internal fun PlayerActivity.showV179SubtitleOutlineToggle179Toggle() {
    val current = BiliClient.prefs.v179subtitleOutlineToggle179
    BiliClient.prefs.v179subtitleOutlineToggle179 = !current
    AppToast.show(this, "Subtitle Outline Toggle179: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179GestureTapFeedbackToggle() {
    val current = BiliClient.prefs.v179gestureTapFeedback
    BiliClient.prefs.v179gestureTapFeedback = !current
    AppToast.show(this, "Gesture Tap Feedback: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179CastVideoPIPResolutionLock179Toggle() {
    val current = BiliClient.prefs.v179castVideoPIPResolutionLock179
    BiliClient.prefs.v179castVideoPIPResolutionLock179 = !current
    AppToast.show(this, "Cast Video PIP Resolution Lock179: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179PlaylistSmartQueueToggle() {
    val current = BiliClient.prefs.v179playlistSmartQueue
    BiliClient.prefs.v179playlistSmartQueue = !current
    AppToast.show(this, "Playlist Smart Queue: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179CacheStreamPrefetch179Toggle() {
    val current = BiliClient.prefs.v179cacheStreamPrefetch179
    BiliClient.prefs.v179cacheStreamPrefetch179 = !current
    AppToast.show(this, "Cache Stream Prefetch179: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179ProgressBarScrubGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179progressBarScrubGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179progressBarScrubGesture = value
        AppToast.show(this, "Progress Bar Scrub Gesture: $value")
    }
}

internal fun PlayerActivity.showV179VolumeNormalizeTrack179Toggle() {
    val current = BiliClient.prefs.v179volumeNormalizeTrack179
    BiliClient.prefs.v179volumeNormalizeTrack179 = !current
    AppToast.show(this, "Volume Normalize Track179: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179HistoryFilterByQualityToggle() {
    val current = BiliClient.prefs.v179historyFilterByQuality
    BiliClient.prefs.v179historyFilterByQuality = !current
    AppToast.show(this, "History Filter By Quality: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179PlaybackRotateVideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179playbackRotateVideo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179playbackRotateVideo = value
        AppToast.show(this, "Playback Rotate Video: $value")
    }
}

internal fun PlayerActivity.showV179ScreenshotOverlayFPS179Toggle() {
    val current = BiliClient.prefs.v179screenshotOverlayFPS179
    BiliClient.prefs.v179screenshotOverlayFPS179 = !current
    AppToast.show(this, "Screenshot Overlay FPS179: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179VideoBrightnessLevel179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179videoBrightnessLevel179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179videoBrightnessLevel179 = value
        AppToast.show(this, "Video Brightness Level179: $value")
    }
}

internal fun PlayerActivity.showV179DanmakuScrollMergeToggle() {
    val current = BiliClient.prefs.v179danmakuScrollMerge
    BiliClient.prefs.v179danmakuScrollMerge = !current
    AppToast.show(this, "Danmaku Scroll Merge: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV179SubtitleOutlineColor179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179subtitleOutlineColor179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179subtitleOutlineColor179 = value
        AppToast.show(this, "Subtitle Outline Color179: $value")
    }
}

internal fun PlayerActivity.showV180AudioCompressorMix180Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v180audioCompressorMix180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Mix180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180audioCompressorMix180 = value
        AppToast.show(this, "Audio Compressor Mix180: $value")
    }
}

internal fun PlayerActivity.showV180DanmakuScrollMerge180Toggle() {
    val current = BiliClient.prefs.v180danmakuScrollMerge180
    BiliClient.prefs.v180danmakuScrollMerge180 = !current
    AppToast.show(this, "Danmaku Scroll Merge180: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180SubtitleOutlineColor180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineColor180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineColor180 = value
        AppToast.show(this, "Subtitle Outline Color180: $value")
    }
}

internal fun PlayerActivity.showV180GestureTapFeedback180Toggle() {
    val current = BiliClient.prefs.v180gestureTapFeedback180
    BiliClient.prefs.v180gestureTapFeedback180 = !current
    AppToast.show(this, "Gesture Tap Feedback180: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180CastVideoPIPSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180castVideoPIPSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180castVideoPIPSyncMode = value
        AppToast.show(this, "Cast Video PIP Sync Mode: $value")
    }
}

internal fun PlayerActivity.showV180PlaylistSmartQueue180Toggle() {
    val current = BiliClient.prefs.v180playlistSmartQueue180
    BiliClient.prefs.v180playlistSmartQueue180 = !current
    AppToast.show(this, "Playlist Smart Queue180: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180CacheStreamReadAheadToggle() {
    val current = BiliClient.prefs.v180cacheStreamReadAhead
    BiliClient.prefs.v180cacheStreamReadAhead = !current
    AppToast.show(this, "Cache Stream Read Ahead: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180ProgressBarScrubGesture180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180progressBarScrubGesture180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180progressBarScrubGesture180 = value
        AppToast.show(this, "Progress Bar Scrub Gesture180: $value")
    }
}

internal fun PlayerActivity.showV180VolumeNormalizeTrack180Toggle() {
    val current = BiliClient.prefs.v180volumeNormalizeTrack180
    BiliClient.prefs.v180volumeNormalizeTrack180 = !current
    AppToast.show(this, "Volume Normalize Track180: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180HistoryFilterByQuality180Toggle() {
    val current = BiliClient.prefs.v180historyFilterByQuality180
    BiliClient.prefs.v180historyFilterByQuality180 = !current
    AppToast.show(this, "History Filter By Quality180: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180PlaybackRotateVideo180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180playbackRotateVideo180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180playbackRotateVideo180 = value
        AppToast.show(this, "Playback Rotate Video180: $value")
    }
}

internal fun PlayerActivity.showV180ScreenshotOverlayCodecToggle() {
    val current = BiliClient.prefs.v180screenshotOverlayCodec
    BiliClient.prefs.v180screenshotOverlayCodec = !current
    AppToast.show(this, "Screenshot Overlay Codec: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180VideoGammaToggle180Toggle() {
    val current = BiliClient.prefs.v180videoGammaToggle180
    BiliClient.prefs.v180videoGammaToggle180 = !current
    AppToast.show(this, "Video Gamma Toggle180: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV180DanmakuScrollMergeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180danmakuScrollMergeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Merge Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180danmakuScrollMergeMode = value
        AppToast.show(this, "Danmaku Scroll Merge Mode: $value")
    }
}

internal fun PlayerActivity.showV180SubtitleOutlineWidth180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineWidth180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineWidth180 = value
        AppToast.show(this, "Subtitle Outline Width180: $value")
    }
}

internal fun PlayerActivity.showV181AudioReverbToggle181Toggle() {
    val current = BiliClient.prefs.v181audioReverbToggle181
    BiliClient.prefs.v181audioReverbToggle181 = !current
    AppToast.show(this, "Audio Reverb Toggle181: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
}

internal fun PlayerActivity.showV181SubtitleBgColorAlphaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha = value
        AppToast.show(this, "Subtitle Bg Color Alpha: $value")
    }
}

internal fun PlayerActivity.showV181GestureEdgeSwipeLeftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181gestureEdgeSwipeLeft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Left",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181gestureEdgeSwipeLeft = value
        AppToast.show(this, "Gesture Edge Swipe Left: $value")
    }
}

internal fun PlayerActivity.showV181CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181castAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181castAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
}

internal fun PlayerActivity.showV181PlaylistLoopSingleToggle() {
    val current = BiliClient.prefs.v181playlistLoopSingle
    BiliClient.prefs.v181playlistLoopSingle = !current
    AppToast.show(this, "Playlist Loop Single: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181CacheDownloadResumeToggle() {
    val current = BiliClient.prefs.v181cacheDownloadResume
    BiliClient.prefs.v181cacheDownloadResume = !current
    AppToast.show(this, "Cache Download Resume: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181ProgressBarThumbSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181progressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181progressBarThumbSize = value
        AppToast.show(this, "Progress Bar Thumb Size: $value")
    }
}

internal fun PlayerActivity.showV181VolumeBoostToggle181Toggle() {
    val current = BiliClient.prefs.v181volumeBoostToggle181
    BiliClient.prefs.v181volumeBoostToggle181 = !current
    AppToast.show(this, "Volume Boost Toggle181: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181HistoryBookmarkToggleToggle() {
    val current = BiliClient.prefs.v181historyBookmarkToggle
    BiliClient.prefs.v181historyBookmarkToggle = !current
    AppToast.show(this, "History Bookmark Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181PlaybackChapterSkipToggle() {
    val current = BiliClient.prefs.v181playbackChapterSkip
    BiliClient.prefs.v181playbackChapterSkip = !current
    AppToast.show(this, "Playback Chapter Skip: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181ScreenshotRegionSelectToggle() {
    val current = BiliClient.prefs.v181screenshotRegionSelect
    BiliClient.prefs.v181screenshotRegionSelect = !current
    AppToast.show(this, "Screenshot Region Select: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181VideoHDR10Toggle181Toggle() {
    val current = BiliClient.prefs.v181videoHDR10Toggle181
    BiliClient.prefs.v181videoHDR10Toggle181 = !current
    AppToast.show(this, "Video HDR10 Toggle181: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV181DanmakuFixedPosition181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition181 = value
        AppToast.show(this, "Danmaku Fixed Position181: $value")
    }
}

internal fun PlayerActivity.showV181SubtitleBgColorAlpha181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha181 = value
        AppToast.show(this, "Subtitle Bg Color Alpha181: $value")
    }
}

internal fun PlayerActivity.showV182AudioReverbDecay182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182audioReverbDecay182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182audioReverbDecay182 = value
        AppToast.show(this, "Audio Reverb Decay182: $value")
    }
}

internal fun PlayerActivity.showV182DanmakuFixedFont182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedFont182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Font182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedFont182 = value
        AppToast.show(this, "Danmaku Fixed Font182: $value")
    }
}

internal fun PlayerActivity.showV182SubtitleBgColorAlpha182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColorAlpha182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColorAlpha182 = value
        AppToast.show(this, "Subtitle Bg Color Alpha182: $value")
    }
}

internal fun PlayerActivity.showV182GestureEdgeSwipeRight182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182gestureEdgeSwipeRight182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Right182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182gestureEdgeSwipeRight182 = value
        AppToast.show(this, "Gesture Edge Swipe Right182: $value")
    }
}

internal fun PlayerActivity.showV182CastAudioBitrate182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182castAudioBitrate182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182castAudioBitrate182 = value
        AppToast.show(this, "Cast Audio Bitrate182: $value")
    }
}

internal fun PlayerActivity.showV182PlaylistLoopSingle182Toggle() {
    val current = BiliClient.prefs.v182playlistLoopSingle182
    BiliClient.prefs.v182playlistLoopSingle182 = !current
    AppToast.show(this, "Playlist Loop Single182: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV182CacheDownloadResume182Toggle() {
    val current = BiliClient.prefs.v182cacheDownloadResume182
    BiliClient.prefs.v182cacheDownloadResume182 = !current
    AppToast.show(this, "Cache Download Resume182: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV182ProgressBarThumbSize182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182progressBarThumbSize182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182progressBarThumbSize182 = value
        AppToast.show(this, "Progress Bar Thumb Size182: $value")
    }
}

internal fun PlayerActivity.showV182VolumeBoostLevel182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182volumeBoostLevel182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182volumeBoostLevel182 = value
        AppToast.show(this, "Volume Boost Level182: $value")
    }
}

internal fun PlayerActivity.showV182HistoryBookmarkToggle182Toggle() {
    val current = BiliClient.prefs.v182historyBookmarkToggle182
    BiliClient.prefs.v182historyBookmarkToggle182 = !current
    AppToast.show(this, "History Bookmark Toggle182: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV182PlaybackChapterSkip182Toggle() {
    val current = BiliClient.prefs.v182playbackChapterSkip182
    BiliClient.prefs.v182playbackChapterSkip182 = !current
    AppToast.show(this, "Playback Chapter Skip182: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV182ScreenshotRegionSelect182Toggle() {
    val current = BiliClient.prefs.v182screenshotRegionSelect182
    BiliClient.prefs.v182screenshotRegionSelect182 = !current
    AppToast.show(this, "Screenshot Region Select182: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV182VideoHDR10Level182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182videoHDR10Level182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182videoHDR10Level182 = value
        AppToast.show(this, "Video HDR10 Level182: $value")
    }
}

internal fun PlayerActivity.showV182DanmakuFixedSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedSpeed = value
        AppToast.show(this, "Danmaku Fixed Speed: $value")
    }
}

internal fun PlayerActivity.showV182SubtitleBgColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColor = value
        AppToast.show(this, "Subtitle Bg Color: $value")
    }
}

internal fun PlayerActivity.showV183AudioReverbDecay183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183audioReverbDecay183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183audioReverbDecay183 = value
        AppToast.show(this, "Audio Reverb Decay183: $value")
    }
}

internal fun PlayerActivity.showV183DanmakuFixedSpeed183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedSpeed183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedSpeed183 = value
        AppToast.show(this, "Danmaku Fixed Speed183: $value")
    }
}

internal fun PlayerActivity.showV183SubtitleBgColor183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor183 = value
        AppToast.show(this, "Subtitle Bg Color183: $value")
    }
}

internal fun PlayerActivity.showV183GestureEdgeSwipeUp183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183gestureEdgeSwipeUp183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Up183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183gestureEdgeSwipeUp183 = value
        AppToast.show(this, "Gesture Edge Swipe Up183: $value")
    }
}

internal fun PlayerActivity.showV183CastAudioChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183castAudioChannel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183castAudioChannel = value
        AppToast.show(this, "Cast Audio Channel: $value")
    }
}

internal fun PlayerActivity.showV183PlaylistLoopAll183Toggle() {
    val current = BiliClient.prefs.v183playlistLoopAll183
    BiliClient.prefs.v183playlistLoopAll183 = !current
    AppToast.show(this, "Playlist Loop All183: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV183CacheDownloadBatch183Toggle() {
    val current = BiliClient.prefs.v183cacheDownloadBatch183
    BiliClient.prefs.v183cacheDownloadBatch183 = !current
    AppToast.show(this, "Cache Download Batch183: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV183ProgressBarThumbGlow183Toggle() {
    val current = BiliClient.prefs.v183progressBarThumbGlow183
    BiliClient.prefs.v183progressBarThumbGlow183 = !current
    AppToast.show(this, "Progress Bar Thumb Glow183: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV183VolumeBoostLevel183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183volumeBoostLevel183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183volumeBoostLevel183 = value
        AppToast.show(this, "Volume Boost Level183: $value")
    }
}

internal fun PlayerActivity.showV183HistoryBookmarkColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183historyBookmarkColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183historyBookmarkColor = value
        AppToast.show(this, "History Bookmark Color: $value")
    }
}

internal fun PlayerActivity.showV183PlaybackChapterPrevToggle() {
    val current = BiliClient.prefs.v183playbackChapterPrev
    BiliClient.prefs.v183playbackChapterPrev = !current
    AppToast.show(this, "Playback Chapter Prev: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV183ScreenshotCropToggleToggle() {
    val current = BiliClient.prefs.v183screenshotCropToggle
    BiliClient.prefs.v183screenshotCropToggle = !current
    AppToast.show(this, "Screenshot Crop Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV183VideoHDR10Level183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183videoHDR10Level183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183videoHDR10Level183 = value
        AppToast.show(this, "Video HDR10 Level183: $value")
    }
}

internal fun PlayerActivity.showV183DanmakuFixedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedColor = value
        AppToast.show(this, "Danmaku Fixed Color: $value")
    }
}

internal fun PlayerActivity.showV183SubtitleBgColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor184 = value
        AppToast.show(this, "Subtitle Bg Color184: $value")
    }
}

internal fun PlayerActivity.showV184AudioReverbMix184Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v184audioReverbMix184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Mix184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184audioReverbMix184 = value
        AppToast.show(this, "Audio Reverb Mix184: $value")
    }
}

internal fun PlayerActivity.showV184DanmakuFixedColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedColor184 = value
        AppToast.show(this, "Danmaku Fixed Color184: $value")
    }
}

internal fun PlayerActivity.showV184SubtitleBgColor185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184subtitleBgColor185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184subtitleBgColor185 = value
        AppToast.show(this, "Subtitle Bg Color185: $value")
    }
}

internal fun PlayerActivity.showV184GestureEdgeSwipeDown184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184gestureEdgeSwipeDown184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Down184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184gestureEdgeSwipeDown184 = value
        AppToast.show(this, "Gesture Edge Swipe Down184: $value")
    }
}

internal fun PlayerActivity.showV184CastAudioChannel184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184castAudioChannel184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184castAudioChannel184 = value
        AppToast.show(this, "Cast Audio Channel184: $value")
    }
}

internal fun PlayerActivity.showV184PlaylistLoopAll184Toggle() {
    val current = BiliClient.prefs.v184playlistLoopAll184
    BiliClient.prefs.v184playlistLoopAll184 = !current
    AppToast.show(this, "Playlist Loop All184: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV184CacheDownloadBatch184Toggle() {
    val current = BiliClient.prefs.v184cacheDownloadBatch184
    BiliClient.prefs.v184cacheDownloadBatch184 = !current
    AppToast.show(this, "Cache Download Batch184: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV184ProgressBarThumbGlow184Toggle() {
    val current = BiliClient.prefs.v184progressBarThumbGlow184
    BiliClient.prefs.v184progressBarThumbGlow184 = !current
    AppToast.show(this, "Progress Bar Thumb Glow184: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV184VolumeBoostGain184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184volumeBoostGain184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184volumeBoostGain184 = value
        AppToast.show(this, "Volume Boost Gain184: $value")
    }
}

internal fun PlayerActivity.showV184HistoryBookmarkColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184historyBookmarkColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184historyBookmarkColor184 = value
        AppToast.show(this, "History Bookmark Color184: $value")
    }
}

internal fun PlayerActivity.showV184PlaybackChapterPrev184Toggle() {
    val current = BiliClient.prefs.v184playbackChapterPrev184
    BiliClient.prefs.v184playbackChapterPrev184 = !current
    AppToast.show(this, "Playback Chapter Prev184: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV184ScreenshotCropToggle184Toggle() {
    val current = BiliClient.prefs.v184screenshotCropToggle184
    BiliClient.prefs.v184screenshotCropToggle184 = !current
    AppToast.show(this, "Screenshot Crop Toggle184: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV184VideoHDR10ToneMap184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184videoHDR10ToneMap184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184videoHDR10ToneMap184 = value
        AppToast.show(this, "Video HDR10 ToneMap184: $value")
    }
}

internal fun PlayerActivity.showV184DanmakuFixedSize184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedSize184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedSize184 = value
        AppToast.show(this, "Danmaku Fixed Size184: $value")
    }
}

internal fun PlayerActivity.showV184SubtitleBgBorder184Toggle() {
    val current = BiliClient.prefs.v184subtitleBgBorder184
    BiliClient.prefs.v184subtitleBgBorder184 = !current
    AppToast.show(this, "Subtitle Bg Border184: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185AudioStereoWiden185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185audioStereoWiden185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185audioStereoWiden185 = value
        AppToast.show(this, "Audio Stereo Widen185: $value")
    }
}

internal fun PlayerActivity.showV185DanmakuFixedSize185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185danmakuFixedSize185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185danmakuFixedSize185 = value
        AppToast.show(this, "Danmaku Fixed Size185: $value")
    }
}

internal fun PlayerActivity.showV185SubtitleBgBorder185Toggle() {
    val current = BiliClient.prefs.v185subtitleBgBorder185
    BiliClient.prefs.v185subtitleBgBorder185 = !current
    AppToast.show(this, "Subtitle Bg Border185: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185GestureRotationDetectToggle() {
    val current = BiliClient.prefs.v185gestureRotationDetect
    BiliClient.prefs.v185gestureRotationDetect = !current
    AppToast.show(this, "Gesture Rotation Detect: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185CastAudioChannel185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185castAudioChannel185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185castAudioChannel185 = value
        AppToast.show(this, "Cast Audio Channel185: $value")
    }
}

internal fun PlayerActivity.showV185PlaylistAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v185playlistAutoSkipIntro
    BiliClient.prefs.v185playlistAutoSkipIntro = !current
    AppToast.show(this, "Playlist Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185CacheDownloadConcurrentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185cacheDownloadConcurrent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185cacheDownloadConcurrent = value
        AppToast.show(this, "Cache Download Concurrent: $value")
    }
}

internal fun PlayerActivity.showV185ProgressBarThumbShadow185Toggle() {
    val current = BiliClient.prefs.v185progressBarThumbShadow185
    BiliClient.prefs.v185progressBarThumbShadow185 = !current
    AppToast.show(this, "Progress Bar Thumb Shadow185: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185VolumeBoostGain185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185volumeBoostGain185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185volumeBoostGain185 = value
        AppToast.show(this, "Volume Boost Gain185: $value")
    }
}

internal fun PlayerActivity.showV185HistoryBookmarkNoteToggle() {
    val current = BiliClient.prefs.v185historyBookmarkNote
    BiliClient.prefs.v185historyBookmarkNote = !current
    AppToast.show(this, "History Bookmark Note: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185PlaybackChapterListToggle() {
    val current = BiliClient.prefs.v185playbackChapterList
    BiliClient.prefs.v185playbackChapterList = !current
    AppToast.show(this, "Playback Chapter List: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185ScreenshotCropRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185screenshotCropRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185screenshotCropRatio = value
        AppToast.show(this, "Screenshot Crop Ratio: $value")
    }
}

internal fun PlayerActivity.showV185VideoHDR10ToneMap185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185videoHDR10ToneMap185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185videoHDR10ToneMap185 = value
        AppToast.show(this, "Video HDR10 ToneMap185: $value")
    }
}

internal fun PlayerActivity.showV185DanmakuFixedShadowToggle() {
    val current = BiliClient.prefs.v185danmakuFixedShadow
    BiliClient.prefs.v185danmakuFixedShadow = !current
    AppToast.show(this, "Danmaku Fixed Shadow: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV185SubtitleBgBorder186Toggle() {
    val current = BiliClient.prefs.v185subtitleBgBorder186
    BiliClient.prefs.v185subtitleBgBorder186 = !current
    AppToast.show(this, "Subtitle Bg Border186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186AudioStereoWiden186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186audioStereoWiden186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186audioStereoWiden186 = value
        AppToast.show(this, "Audio Stereo Widen186: $value")
    }
}

internal fun PlayerActivity.showV186DanmakuFixedShadow186Toggle() {
    val current = BiliClient.prefs.v186danmakuFixedShadow186
    BiliClient.prefs.v186danmakuFixedShadow186 = !current
    AppToast.show(this, "Danmaku Fixed Shadow186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186SubtitleBgBorder187Toggle() {
    val current = BiliClient.prefs.v186subtitleBgBorder187
    BiliClient.prefs.v186subtitleBgBorder187 = !current
    AppToast.show(this, "Subtitle Bg Border187: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186GestureRotationDetect186Toggle() {
    val current = BiliClient.prefs.v186gestureRotationDetect186
    BiliClient.prefs.v186gestureRotationDetect186 = !current
    AppToast.show(this, "Gesture Rotation Detect186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186CastAudioSyncToggle() {
    val current = BiliClient.prefs.v186castAudioSync
    BiliClient.prefs.v186castAudioSync = !current
    AppToast.show(this, "Cast Audio Sync: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186PlaylistAutoSkipIntro186Toggle() {
    val current = BiliClient.prefs.v186playlistAutoSkipIntro186
    BiliClient.prefs.v186playlistAutoSkipIntro186 = !current
    AppToast.show(this, "Playlist Auto Skip Intro186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186CacheDownloadConcurrent186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186cacheDownloadConcurrent186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186cacheDownloadConcurrent186 = value
        AppToast.show(this, "Cache Download Concurrent186: $value")
    }
}

internal fun PlayerActivity.showV186ProgressBarThumbShadow186Toggle() {
    val current = BiliClient.prefs.v186progressBarThumbShadow186
    BiliClient.prefs.v186progressBarThumbShadow186 = !current
    AppToast.show(this, "Progress Bar Thumb Shadow186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186VolumeBoostAuto186Toggle() {
    val current = BiliClient.prefs.v186volumeBoostAuto186
    BiliClient.prefs.v186volumeBoostAuto186 = !current
    AppToast.show(this, "Volume Boost Auto186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186HistoryBookmarkNote186Toggle() {
    val current = BiliClient.prefs.v186historyBookmarkNote186
    BiliClient.prefs.v186historyBookmarkNote186 = !current
    AppToast.show(this, "History Bookmark Note186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186PlaybackChapterList186Toggle() {
    val current = BiliClient.prefs.v186playbackChapterList186
    BiliClient.prefs.v186playbackChapterList186 = !current
    AppToast.show(this, "Playback Chapter List186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186ScreenshotCropRatio186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186screenshotCropRatio186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186screenshotCropRatio186 = value
        AppToast.show(this, "Screenshot Crop Ratio186: $value")
    }
}

internal fun PlayerActivity.showV186VideoWideGamut186Toggle() {
    val current = BiliClient.prefs.v186videoWideGamut186
    BiliClient.prefs.v186videoWideGamut186 = !current
    AppToast.show(this, "Video Wide Gamut186: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186DanmakuFixedOutlineToggle() {
    val current = BiliClient.prefs.v186danmakuFixedOutline
    BiliClient.prefs.v186danmakuFixedOutline = !current
    AppToast.show(this, "Danmaku Fixed Outline: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV186SubtitleBgBorder188Toggle() {
    val current = BiliClient.prefs.v186subtitleBgBorder188
    BiliClient.prefs.v186subtitleBgBorder188 = !current
    AppToast.show(this, "Subtitle Bg Border188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187AudioStereoWiden187Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v187audioStereoWiden187).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen187",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v187audioStereoWiden187 = value
        AppToast.show(this, "Audio Stereo Widen187: $value")
    }
}

internal fun PlayerActivity.showV187DanmakuFixedOutline187Toggle() {
    val current = BiliClient.prefs.v187danmakuFixedOutline187
    BiliClient.prefs.v187danmakuFixedOutline187 = !current
    AppToast.show(this, "Danmaku Fixed Outline187: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187SubtitleBgBorder189Toggle() {
    val current = BiliClient.prefs.v187subtitleBgBorder189
    BiliClient.prefs.v187subtitleBgBorder189 = !current
    AppToast.show(this, "Subtitle Bg Border189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187GestureRotationLockToggle() {
    val current = BiliClient.prefs.v187gestureRotationLock
    BiliClient.prefs.v187gestureRotationLock = !current
    AppToast.show(this, "Gesture Rotation Lock: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187CastAudioSync187Toggle() {
    val current = BiliClient.prefs.v187castAudioSync187
    BiliClient.prefs.v187castAudioSync187 = !current
    AppToast.show(this, "Cast Audio Sync187: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187PlaylistAutoSkipOutroToggle() {
    val current = BiliClient.prefs.v187playlistAutoSkipOutro
    BiliClient.prefs.v187playlistAutoSkipOutro = !current
    AppToast.show(this, "Playlist Auto Skip Outro: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187CacheDownloadPauseToggle() {
    val current = BiliClient.prefs.v187cacheDownloadPause
    BiliClient.prefs.v187cacheDownloadPause = !current
    AppToast.show(this, "Cache Download Pause: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187ProgressBarThumbBorder187Toggle() {
    val current = BiliClient.prefs.v187progressBarThumbBorder187
    BiliClient.prefs.v187progressBarThumbBorder187 = !current
    AppToast.show(this, "Progress Bar Thumb Border187: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187VolumeBoostAuto187Toggle() {
    val current = BiliClient.prefs.v187volumeBoostAuto187
    BiliClient.prefs.v187volumeBoostAuto187 = !current
    AppToast.show(this, "Volume Boost Auto187: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187HistoryBookmarkShareToggle() {
    val current = BiliClient.prefs.v187historyBookmarkShare
    BiliClient.prefs.v187historyBookmarkShare = !current
    AppToast.show(this, "History Bookmark Share: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187PlaybackChapterAutoDetectToggle() {
    val current = BiliClient.prefs.v187playbackChapterAutoDetect
    BiliClient.prefs.v187playbackChapterAutoDetect = !current
    AppToast.show(this, "Playback Chapter Auto Detect: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187ScreenshotCropFreeformToggle() {
    val current = BiliClient.prefs.v187screenshotCropFreeform
    BiliClient.prefs.v187screenshotCropFreeform = !current
    AppToast.show(this, "Screenshot Crop Freeform: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187VideoWideGamut187Toggle() {
    val current = BiliClient.prefs.v187videoWideGamut187
    BiliClient.prefs.v187videoWideGamut187 = !current
    AppToast.show(this, "Video Wide Gamut187: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187DanmakuFixedOutline188Toggle() {
    val current = BiliClient.prefs.v187danmakuFixedOutline188
    BiliClient.prefs.v187danmakuFixedOutline188 = !current
    AppToast.show(this, "Danmaku Fixed Outline188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV187SubtitleBgBorder190Toggle() {
    val current = BiliClient.prefs.v187subtitleBgBorder190
    BiliClient.prefs.v187subtitleBgBorder190 = !current
    AppToast.show(this, "Subtitle Bg Border190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188AudioStereoWiden188Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188audioStereoWiden188).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen188",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188audioStereoWiden188 = value
        AppToast.show(this, "Audio Stereo Widen188: $value")
    }
}

internal fun PlayerActivity.showV188DanmakuFixedOutline189Toggle() {
    val current = BiliClient.prefs.v188danmakuFixedOutline189
    BiliClient.prefs.v188danmakuFixedOutline189 = !current
    AppToast.show(this, "Danmaku Fixed Outline189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188SubtitleBgBorder191Toggle() {
    val current = BiliClient.prefs.v188subtitleBgBorder191
    BiliClient.prefs.v188subtitleBgBorder191 = !current
    AppToast.show(this, "Subtitle Bg Border191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188GestureRotationLock188Toggle() {
    val current = BiliClient.prefs.v188gestureRotationLock188
    BiliClient.prefs.v188gestureRotationLock188 = !current
    AppToast.show(this, "Gesture Rotation Lock188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188CastAudioDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188castAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188castAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
}

internal fun PlayerActivity.showV188PlaylistAutoSkipOutro188Toggle() {
    val current = BiliClient.prefs.v188playlistAutoSkipOutro188
    BiliClient.prefs.v188playlistAutoSkipOutro188 = !current
    AppToast.show(this, "Playlist Auto Skip Outro188: ${if (!current) "ON" else "OFF"}")
}

