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

internal fun PlayerActivity.showV121ScreenshotAutoShareQQToggle() {
    val enabled = !BiliClient.prefs.v121screenshotAutoShareQQ
    BiliClient.prefs.v121screenshotAutoShareQQ = enabled
    AppToast.show(this, "Screenshot Auto Share QQ: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV121VideoPIPSwipeDismissToggle() {
    val enabled = !BiliClient.prefs.v121videoPIPSwipeDismiss
    BiliClient.prefs.v121videoPIPSwipeDismiss = enabled
    AppToast.show(this, "Video PIP Swipe Dismiss: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV121DanmakuFontBgFillStartColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121danmakuFontBgFillStartColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Start Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121danmakuFontBgFillStartColor = value
        AppToast.show(this, "Danmaku Font BG Fill Start Color: $value")
    }
}

internal fun PlayerActivity.showV121SubtitleAnimationFadeIn121Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v121subtitleAnimationFadeIn121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121subtitleAnimationFadeIn121 = value
        AppToast.show(this, "Subtitle Animation Fade In121: $value")
    }
}

internal fun PlayerActivity.showV122AudioFadeInDuration122Dialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v122audioFadeInDuration122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Fade In Duration122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122audioFadeInDuration122 = value
        AppToast.show(this, "Audio Fade In Duration122: $value")
    }
}

internal fun PlayerActivity.showV122DanmakuFontBgFillEndColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122danmakuFontBgFillEndColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill End Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122danmakuFontBgFillEndColor = value
        AppToast.show(this, "Danmaku Font BG Fill End Color: $value")
    }
}

internal fun PlayerActivity.showV122SubtitleAnimationFadeOut122Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v122subtitleAnimationFadeOut122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122subtitleAnimationFadeOut122 = value
        AppToast.show(this, "Subtitle Animation Fade Out122: $value")
    }
}

internal fun PlayerActivity.showV122GestureTapCtrlActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122gestureTapCtrlAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Ctrl Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122gestureTapCtrlAction = value
        AppToast.show(this, "Gesture Tap Ctrl Action: $value")
    }
}

internal fun PlayerActivity.showV122CastVideoFlipVerticalToggle() {
    val enabled = !BiliClient.prefs.v122castVideoFlipVertical
    BiliClient.prefs.v122castVideoFlipVertical = enabled
    AppToast.show(this, "Cast Video Flip Vertical: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV122PlaylistAutoResumeLastPositionToggle() {
    val enabled = !BiliClient.prefs.v122playlistAutoResumeLastPosition
    BiliClient.prefs.v122playlistAutoResumeLastPosition = enabled
    AppToast.show(this, "Playlist Auto Resume Last Position: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV122CacheSmartPinningMaxSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122cacheSmartPinningMaxSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Max Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122cacheSmartPinningMaxSize = value
        AppToast.show(this, "Cache Smart Pinning Max Size: $value")
    }
}

internal fun PlayerActivity.showV122ProgressBarCustomLiveWidthDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v122progressBarCustomLiveWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122progressBarCustomLiveWidth = value
        AppToast.show(this, "Progress Bar Custom Live Width: $value")
    }
}

internal fun PlayerActivity.showV122VolumeMonoDownmixBalanceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v122volumeMonoDownmixBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Mono Downmix Balance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122volumeMonoDownmixBalance = value
        AppToast.show(this, "Volume Mono Downmix Balance: $value")
    }
}

internal fun PlayerActivity.showV122HistorySearchScope122Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122historySearchScope122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122historySearchScope122 = value
        AppToast.show(this, "History Search Scope122: $value")
    }
}

internal fun PlayerActivity.showV122PlaybackSpeedPresetsListDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122playbackSpeedPresetsList).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets List",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122playbackSpeedPresetsList = value
        AppToast.show(this, "Playback Speed Presets List: $value")
    }
}

internal fun PlayerActivity.showV122ScreenshotAutoShareWeChatToggle() {
    val enabled = !BiliClient.prefs.v122screenshotAutoShareWeChat
    BiliClient.prefs.v122screenshotAutoShareWeChat = enabled
    AppToast.show(this, "Screenshot Auto Share WeChat: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV122VideoPIPAlwaysOnTopToggle() {
    val enabled = !BiliClient.prefs.v122videoPIPAlwaysOnTop
    BiliClient.prefs.v122videoPIPAlwaysOnTop = enabled
    AppToast.show(this, "Video PIP Always On Top: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV122DanmakuFontBgFillRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v122danmakuFontBgFillRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122danmakuFontBgFillRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Radius: $value")
    }
}

internal fun PlayerActivity.showV122SubtitleAnimationFadeOut121Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v122subtitleAnimationFadeOut121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122subtitleAnimationFadeOut121 = value
        AppToast.show(this, "Subtitle Animation Fade Out121: $value")
    }
}

internal fun PlayerActivity.showV123AudioFadeOutDuration123Dialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v123audioFadeOutDuration123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Fade Out Duration123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123audioFadeOutDuration123 = value
        AppToast.show(this, "Audio Fade Out Duration123: $value")
    }
}

internal fun PlayerActivity.showV123DanmakuFontBgFillOpacity120Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v123danmakuFontBgFillOpacity120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123danmakuFontBgFillOpacity120 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity120: $value")
    }
}

internal fun PlayerActivity.showV123SubtitleAnimationFadeIn123Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v123subtitleAnimationFadeIn123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123subtitleAnimationFadeIn123 = value
        AppToast.show(this, "Subtitle Animation Fade In123: $value")
    }
}

internal fun PlayerActivity.showV123GestureTapAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123gestureTapAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123gestureTapAltAction = value
        AppToast.show(this, "Gesture Tap Alt Action: $value")
    }
}

internal fun PlayerActivity.showV123CastVideoRotateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123castVideoRotateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Rotate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123castVideoRotateCustom = value
        AppToast.show(this, "Cast Video Rotate Custom: $value")
    }
}

internal fun PlayerActivity.showV123PlaylistAutoSortByLengthToggle() {
    val enabled = !BiliClient.prefs.v123playlistAutoSortByLength
    BiliClient.prefs.v123playlistAutoSortByLength = enabled
    AppToast.show(this, "Playlist Auto Sort By Length: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV123CacheSmartPinningExpireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123cacheSmartPinningExpire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Expire",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123cacheSmartPinningExpire = value
        AppToast.show(this, "Cache Smart Pinning Expire: $value")
    }
}

internal fun PlayerActivity.showV123ProgressBarCustomLiveHeightDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v123progressBarCustomLiveHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Height",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123progressBarCustomLiveHeight = value
        AppToast.show(this, "Progress Bar Custom Live Height: $value")
    }
}

internal fun PlayerActivity.showV123VolumeHeadroomCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123volumeHeadroomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Headroom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123volumeHeadroomCustom = value
        AppToast.show(this, "Volume Headroom Custom: $value")
    }
}

internal fun PlayerActivity.showV123HistoryAutoClean123Toggle() {
    val enabled = !BiliClient.prefs.v123historyAutoClean123
    BiliClient.prefs.v123historyAutoClean123 = enabled
    AppToast.show(this, "History Auto Clean123: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV123PlaybackSpeedPresetsCustom123Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123playbackSpeedPresetsCustom123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Custom123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123playbackSpeedPresetsCustom123 = value
        AppToast.show(this, "Playback Speed Presets Custom123: $value")
    }
}

internal fun PlayerActivity.showV123ScreenshotAutoShareDouyinToggle() {
    val enabled = !BiliClient.prefs.v123screenshotAutoShareDouyin
    BiliClient.prefs.v123screenshotAutoShareDouyin = enabled
    AppToast.show(this, "Screenshot Auto Share Douyin: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV123VideoPIPResizeHandleToggle() {
    val enabled = !BiliClient.prefs.v123videoPIPResizeHandle
    BiliClient.prefs.v123videoPIPResizeHandle = enabled
    AppToast.show(this, "Video PIP Resize Handle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV123DanmakuFontBgFillBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v123danmakuFontBgFillBorderToggle
    BiliClient.prefs.v123danmakuFontBgFillBorderToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV123SubtitleAnimationFadeOut123Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v123subtitleAnimationFadeOut123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123subtitleAnimationFadeOut123 = value
        AppToast.show(this, "Subtitle Animation Fade Out123: $value")
    }
}

internal fun PlayerActivity.showV124AudioReverbPresetCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124audioReverbPresetCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Preset Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124audioReverbPresetCustom = value
        AppToast.show(this, "Audio Reverb Preset Custom: $value")
    }
}

internal fun PlayerActivity.showV124DanmakuFontBgFillBorderWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124danmakuFontBgFillBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124danmakuFontBgFillBorderWidth = value
        AppToast.show(this, "Danmaku Font BG Fill Border Width: $value")
    }
}

internal fun PlayerActivity.showV124SubtitleAnimationScale124Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v124subtitleAnimationScale124).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale124",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124subtitleAnimationScale124 = value
        AppToast.show(this, "Subtitle Animation Scale124: $value")
    }
}

internal fun PlayerActivity.showV124GestureTapShiftCtrlActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124gestureTapShiftCtrlAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Ctrl Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124gestureTapShiftCtrlAction = value
        AppToast.show(this, "Gesture Tap Shift Ctrl Action: $value")
    }
}

internal fun PlayerActivity.showV124CastVideoCropCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124castVideoCropCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Crop Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124castVideoCropCustom = value
        AppToast.show(this, "Cast Video Crop Custom: $value")
    }
}

internal fun PlayerActivity.showV124PlaylistAutoSortByTitleToggle() {
    val enabled = !BiliClient.prefs.v124playlistAutoSortByTitle
    BiliClient.prefs.v124playlistAutoSortByTitle = enabled
    AppToast.show(this, "Playlist Auto Sort By Title: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV124CacheSmartPinningPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124cacheSmartPinningPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124cacheSmartPinningPriority = value
        AppToast.show(this, "Cache Smart Pinning Priority: $value")
    }
}

internal fun PlayerActivity.showV124ProgressBarCustomThumbColor124Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124progressBarCustomThumbColor124).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color124",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124progressBarCustomThumbColor124 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color124: $value")
    }
}

internal fun PlayerActivity.showV124VolumeReplayGainAlbumToggle() {
    val enabled = !BiliClient.prefs.v124volumeReplayGainAlbum
    BiliClient.prefs.v124volumeReplayGainAlbum = enabled
    AppToast.show(this, "Volume Replay Gain Album: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV124HistoryAutoClean124Toggle() {
    val enabled = !BiliClient.prefs.v124historyAutoClean124
    BiliClient.prefs.v124historyAutoClean124 = enabled
    AppToast.show(this, "History Auto Clean124: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV124PlaybackSpeedPresetsToggleToggle() {
    val enabled = !BiliClient.prefs.v124playbackSpeedPresetsToggle
    BiliClient.prefs.v124playbackSpeedPresetsToggle = enabled
    AppToast.show(this, "Playback Speed Presets Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV124ScreenshotAutoShareTikTokToggle() {
    val enabled = !BiliClient.prefs.v124screenshotAutoShareTikTok
    BiliClient.prefs.v124screenshotAutoShareTikTok = enabled
    AppToast.show(this, "Screenshot Auto Share TikTok: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV124VideoPIPKeyboardControlToggle() {
    val enabled = !BiliClient.prefs.v124videoPIPKeyboardControl
    BiliClient.prefs.v124videoPIPKeyboardControl = enabled
    AppToast.show(this, "Video PIP Keyboard Control: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV124DanmakuFontBgFillBorderColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124danmakuFontBgFillBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124danmakuFontBgFillBorderColor = value
        AppToast.show(this, "Danmaku Font BG Fill Border Color: $value")
    }
}

internal fun PlayerActivity.showV124SubtitleAnimationScale125Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v124subtitleAnimationScale125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124subtitleAnimationScale125 = value
        AppToast.show(this, "Subtitle Animation Scale125: $value")
    }
}

internal fun PlayerActivity.showV125AudioReverbRoomSizeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v125audioReverbRoomSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Room Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125audioReverbRoomSize = value
        AppToast.show(this, "Audio Reverb Room Size: $value")
    }
}

internal fun PlayerActivity.showV125DanmakuFontBgFillBorderRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v125danmakuFontBgFillBorderRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125danmakuFontBgFillBorderRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Border Radius: $value")
    }
}

internal fun PlayerActivity.showV125SubtitleAnimationTranslate125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125subtitleAnimationTranslate125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125subtitleAnimationTranslate125 = value
        AppToast.show(this, "Subtitle Animation Translate125: $value")
    }
}

internal fun PlayerActivity.showV125GestureTapShiftAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125gestureTapShiftAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125gestureTapShiftAltAction = value
        AppToast.show(this, "Gesture Tap Shift Alt Action: $value")
    }
}

internal fun PlayerActivity.showV125CastVideoScaleCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v125castVideoScaleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Scale Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125castVideoScaleCustom = value
        AppToast.show(this, "Cast Video Scale Custom: $value")
    }
}

internal fun PlayerActivity.showV125PlaylistAutoSortByUploadDateToggle() {
    val enabled = !BiliClient.prefs.v125playlistAutoSortByUploadDate
    BiliClient.prefs.v125playlistAutoSortByUploadDate = enabled
    AppToast.show(this, "Playlist Auto Sort By Upload Date: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV125CacheSmartPinningRefreshToggle() {
    val enabled = !BiliClient.prefs.v125cacheSmartPinningRefresh
    BiliClient.prefs.v125cacheSmartPinningRefresh = enabled
    AppToast.show(this, "Cache Smart Pinning Refresh: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV125ProgressBarCustomThumbShape125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125progressBarCustomThumbShape125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Shape125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125progressBarCustomThumbShape125 = value
        AppToast.show(this, "Progress Bar Custom Thumb Shape125: $value")
    }
}

internal fun PlayerActivity.showV125VolumeReplayGainTrackToggle() {
    val enabled = !BiliClient.prefs.v125volumeReplayGainTrack
    BiliClient.prefs.v125volumeReplayGainTrack = enabled
    AppToast.show(this, "Volume Replay Gain Track: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV125HistoryAutoClean125Toggle() {
    val enabled = !BiliClient.prefs.v125historyAutoClean125
    BiliClient.prefs.v125historyAutoClean125 = enabled
    AppToast.show(this, "History Auto Clean125: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV125PlaybackSpeedPresetsRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125playbackSpeedPresetsRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125playbackSpeedPresetsRange = value
        AppToast.show(this, "Playback Speed Presets Range: $value")
    }
}

internal fun PlayerActivity.showV125ScreenshotAutoShareSnapchatToggle() {
    val enabled = !BiliClient.prefs.v125screenshotAutoShareSnapchat
    BiliClient.prefs.v125screenshotAutoShareSnapchat = enabled
    AppToast.show(this, "Screenshot Auto Share Snapchat: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV125VideoPIPAutoHideDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125videoPIPAutoHideDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Auto Hide Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125videoPIPAutoHideDelay = value
        AppToast.show(this, "Video PIP Auto Hide Delay: $value")
    }
}

internal fun PlayerActivity.showV125DanmakuFontBgFillBorderOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v125danmakuFontBgFillBorderOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125danmakuFontBgFillBorderOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Border Opacity: $value")
    }
}

internal fun PlayerActivity.showV125SubtitleAnimationRotate125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125subtitleAnimationRotate125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125subtitleAnimationRotate125 = value
        AppToast.show(this, "Subtitle Animation Rotate125: $value")
    }
}

internal fun PlayerActivity.showV126AudioReverbDampingDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v126audioReverbDamping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Damping",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126audioReverbDamping = value
        AppToast.show(this, "Audio Reverb Damping: $value")
    }
}

internal fun PlayerActivity.showV126DanmakuFontBgFillBorderDashToggleToggle() {
    val enabled = !BiliClient.prefs.v126danmakuFontBgFillBorderDashToggle
    BiliClient.prefs.v126danmakuFontBgFillBorderDashToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Border Dash Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126SubtitleAnimationRotate126Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126subtitleAnimationRotate126).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate126",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126subtitleAnimationRotate126 = value
        AppToast.show(this, "Subtitle Animation Rotate126: $value")
    }
}

internal fun PlayerActivity.showV126GestureTapCtrlAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126gestureTapCtrlAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Ctrl Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126gestureTapCtrlAltAction = value
        AppToast.show(this, "Gesture Tap Ctrl Alt Action: $value")
    }
}

internal fun PlayerActivity.showV126CastVideoMirrorFlipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126castVideoMirrorFlip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Mirror Flip",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126castVideoMirrorFlip = value
        AppToast.show(this, "Cast Video Mirror Flip: $value")
    }
}

internal fun PlayerActivity.showV126PlaylistAutoSortByRandomToggle() {
    val enabled = !BiliClient.prefs.v126playlistAutoSortByRandom
    BiliClient.prefs.v126playlistAutoSortByRandom = enabled
    AppToast.show(this, "Playlist Auto Sort By Random: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126CacheSmartPinningOnLowSpaceToggle() {
    val enabled = !BiliClient.prefs.v126cacheSmartPinningOnLowSpace
    BiliClient.prefs.v126cacheSmartPinningOnLowSpace = enabled
    AppToast.show(this, "Cache Smart Pinning On Low Space: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126ProgressBarCustomThumbGlow126Toggle() {
    val enabled = !BiliClient.prefs.v126progressBarCustomThumbGlow126
    BiliClient.prefs.v126progressBarCustomThumbGlow126 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Glow126: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126VolumeReplayGainPreampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126volumeReplayGainPreamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Replay Gain Preamp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126volumeReplayGainPreamp = value
        AppToast.show(this, "Volume Replay Gain Preamp: $value")
    }
}

internal fun PlayerActivity.showV126HistoryAutoClean126Toggle() {
    val enabled = !BiliClient.prefs.v126historyAutoClean126
    BiliClient.prefs.v126historyAutoClean126 = enabled
    AppToast.show(this, "History Auto Clean126: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126PlaybackSpeedPresetsLabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126playbackSpeedPresetsLabel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Label",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126playbackSpeedPresetsLabel = value
        AppToast.show(this, "Playback Speed Presets Label: $value")
    }
}

internal fun PlayerActivity.showV126ScreenshotAutoShareRedditToggle() {
    val enabled = !BiliClient.prefs.v126screenshotAutoShareReddit
    BiliClient.prefs.v126screenshotAutoShareReddit = enabled
    AppToast.show(this, "Screenshot Auto Share Reddit: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126VideoPIPFollowScrollToggle() {
    val enabled = !BiliClient.prefs.v126videoPIPFollowScroll
    BiliClient.prefs.v126videoPIPFollowScroll = enabled
    AppToast.show(this, "Video PIP Follow Scroll: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV126DanmakuFontBgFillBorderDashWidthDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v126danmakuFontBgFillBorderDashWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Dash Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126danmakuFontBgFillBorderDashWidth = value
        AppToast.show(this, "Danmaku Font BG Fill Border Dash Width: $value")
    }
}

internal fun PlayerActivity.showV126SubtitleAnimationTranslate126Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126subtitleAnimationTranslate126).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate126",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126subtitleAnimationTranslate126 = value
        AppToast.show(this, "Subtitle Animation Translate126: $value")
    }
}

internal fun PlayerActivity.showV127AudioReverbWetDryMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127audioReverbWetDryMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Wet Dry Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127audioReverbWetDryMix = value
        AppToast.show(this, "Audio Reverb Wet Dry Mix: $value")
    }
}

internal fun PlayerActivity.showV127DanmakuFontBgFillBorderDashGapDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v127danmakuFontBgFillBorderDashGap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Dash Gap",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127danmakuFontBgFillBorderDashGap = value
        AppToast.show(this, "Danmaku Font BG Fill Border Dash Gap: $value")
    }
}

internal fun PlayerActivity.showV127SubtitleAnimationBlur127Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127subtitleAnimationBlur127).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur127",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127subtitleAnimationBlur127 = value
        AppToast.show(this, "Subtitle Animation Blur127: $value")
    }
}

internal fun PlayerActivity.showV127GestureTapMultiFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v127gestureTapMultiFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Multi Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127gestureTapMultiFingerAction = value
        AppToast.show(this, "Gesture Tap Multi Finger Action: $value")
    }
}

internal fun PlayerActivity.showV127CastVideoZoomCustomDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v127castVideoZoomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Zoom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127castVideoZoomCustom = value
        AppToast.show(this, "Cast Video Zoom Custom: $value")
    }
}

internal fun PlayerActivity.showV127PlaylistAutoGroupBySimilarityToggle() {
    val enabled = !BiliClient.prefs.v127playlistAutoGroupBySimilarity
    BiliClient.prefs.v127playlistAutoGroupBySimilarity = enabled
    AppToast.show(this, "Playlist Auto Group By Similarity: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127CacheSmartPinningAlertToggle() {
    val enabled = !BiliClient.prefs.v127cacheSmartPinningAlert
    BiliClient.prefs.v127cacheSmartPinningAlert = enabled
    AppToast.show(this, "Cache Smart Pinning Alert: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127ProgressBarCustomThumbShadow127Toggle() {
    val enabled = !BiliClient.prefs.v127progressBarCustomThumbShadow127
    BiliClient.prefs.v127progressBarCustomThumbShadow127 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Shadow127: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127VolumeReplayGainClipProtectToggle() {
    val enabled = !BiliClient.prefs.v127volumeReplayGainClipProtect
    BiliClient.prefs.v127volumeReplayGainClipProtect = enabled
    AppToast.show(this, "Volume Replay Gain Clip Protect: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127HistoryAutoClean127Toggle() {
    val enabled = !BiliClient.prefs.v127historyAutoClean127
    BiliClient.prefs.v127historyAutoClean127 = enabled
    AppToast.show(this, "History Auto Clean127: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127PlaybackSpeedPresetsAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v127playbackSpeedPresetsAdaptive
    BiliClient.prefs.v127playbackSpeedPresetsAdaptive = enabled
    AppToast.show(this, "Playback Speed Presets Adaptive: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127ScreenshotAutoShareVKToggle() {
    val enabled = !BiliClient.prefs.v127screenshotAutoShareVK
    BiliClient.prefs.v127screenshotAutoShareVK = enabled
    AppToast.show(this, "Screenshot Auto Share VK: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127VideoPIPSnapToEdgeToggle() {
    val enabled = !BiliClient.prefs.v127videoPIPSnapToEdge
    BiliClient.prefs.v127videoPIPSnapToEdge = enabled
    AppToast.show(this, "Video PIP Snap To Edge: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV127DanmakuFontBgFillBorderTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v127danmakuFontBgFillBorderType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127danmakuFontBgFillBorderType = value
        AppToast.show(this, "Danmaku Font BG Fill Border Type: $value")
    }
}

internal fun PlayerActivity.showV127SubtitleAnimationBlur128Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127subtitleAnimationBlur128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127subtitleAnimationBlur128 = value
        AppToast.show(this, "Subtitle Animation Blur128: $value")
    }
}

internal fun PlayerActivity.showV128AudioReverbPreDelayDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v128audioReverbPreDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Pre Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128audioReverbPreDelay = value
        AppToast.show(this, "Audio Reverb Pre Delay: $value")
    }
}

internal fun PlayerActivity.showV128DanmakuFontBgFillBorderType127Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128danmakuFontBgFillBorderType127).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Type127",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128danmakuFontBgFillBorderType127 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Type127: $value")
    }
}

internal fun PlayerActivity.showV128SubtitleAnimationBlur129Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v128subtitleAnimationBlur129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128subtitleAnimationBlur129 = value
        AppToast.show(this, "Subtitle Animation Blur129: $value")
    }
}

internal fun PlayerActivity.showV128GestureTapFingerCountDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v128gestureTapFingerCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Finger Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128gestureTapFingerCount = value
        AppToast.show(this, "Gesture Tap Finger Count: $value")
    }
}

internal fun PlayerActivity.showV128CastVideoPIPModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128castVideoPIPMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128castVideoPIPMode = value
        AppToast.show(this, "Cast Video PIP Mode: $value")
    }
}

internal fun PlayerActivity.showV128PlaylistAutoGroupByTopicToggle() {
    val enabled = !BiliClient.prefs.v128playlistAutoGroupByTopic
    BiliClient.prefs.v128playlistAutoGroupByTopic = enabled
    AppToast.show(this, "Playlist Auto Group By Topic: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128CacheSmartPinningOnWifiToggle() {
    val enabled = !BiliClient.prefs.v128cacheSmartPinningOnWifi
    BiliClient.prefs.v128cacheSmartPinningOnWifi = enabled
    AppToast.show(this, "Cache Smart Pinning On Wifi: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128ProgressBarCustomThumbBorder128Toggle() {
    val enabled = !BiliClient.prefs.v128progressBarCustomThumbBorder128
    BiliClient.prefs.v128progressBarCustomThumbBorder128 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Border128: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128VolumeNormalizePerTrackToggle() {
    val enabled = !BiliClient.prefs.v128volumeNormalizePerTrack
    BiliClient.prefs.v128volumeNormalizePerTrack = enabled
    AppToast.show(this, "Volume Normalize Per Track: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128HistoryAutoClean128Toggle() {
    val enabled = !BiliClient.prefs.v128historyAutoClean128
    BiliClient.prefs.v128historyAutoClean128 = enabled
    AppToast.show(this, "History Auto Clean128: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128PlaybackSpeedPresetsDisplayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128playbackSpeedPresetsDisplay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Display",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128playbackSpeedPresetsDisplay = value
        AppToast.show(this, "Playback Speed Presets Display: $value")
    }
}

internal fun PlayerActivity.showV128ScreenshotAutoShareTelegramChannelToggle() {
    val enabled = !BiliClient.prefs.v128screenshotAutoShareTelegramChannel
    BiliClient.prefs.v128screenshotAutoShareTelegramChannel = enabled
    AppToast.show(this, "Screenshot Auto Share Telegram Channel: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128VideoPIPMinimizeToNotificationToggle() {
    val enabled = !BiliClient.prefs.v128videoPIPMinimizeToNotification
    BiliClient.prefs.v128videoPIPMinimizeToNotification = enabled
    AppToast.show(this, "Video PIP Minimize To Notification: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV128DanmakuFontBgFillBorderJoinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128danmakuFontBgFillBorderJoin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Join",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128danmakuFontBgFillBorderJoin = value
        AppToast.show(this, "Danmaku Font BG Fill Border Join: $value")
    }
}

internal fun PlayerActivity.showV128SubtitleAnimationTranslate128Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128subtitleAnimationTranslate128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128subtitleAnimationTranslate128 = value
        AppToast.show(this, "Subtitle Animation Translate128: $value")
    }
}

internal fun PlayerActivity.showV129AudioChorusToggle129Toggle() {
    val enabled = !BiliClient.prefs.v129audioChorusToggle129
    BiliClient.prefs.v129audioChorusToggle129 = enabled
    AppToast.show(this, "Audio Chorus Toggle129: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129DanmakuFontBgFillBorderJoin128Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129danmakuFontBgFillBorderJoin128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Join128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129danmakuFontBgFillBorderJoin128 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Join128: $value")
    }
}

internal fun PlayerActivity.showV129SubtitleAnimationTranslate129Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129subtitleAnimationTranslate129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129subtitleAnimationTranslate129 = value
        AppToast.show(this, "Subtitle Animation Translate129: $value")
    }
}

internal fun PlayerActivity.showV129GestureTapZoneCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129gestureTapZoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129gestureTapZoneCustom = value
        AppToast.show(this, "Gesture Tap Zone Custom: $value")
    }
}

internal fun PlayerActivity.showV129CastVideoPIPSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129castVideoPIPSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129castVideoPIPSize = value
        AppToast.show(this, "Cast Video PIP Size: $value")
    }
}

internal fun PlayerActivity.showV129PlaylistAutoGroupByMoodToggle() {
    val enabled = !BiliClient.prefs.v129playlistAutoGroupByMood
    BiliClient.prefs.v129playlistAutoGroupByMood = enabled
    AppToast.show(this, "Playlist Auto Group By Mood: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129CacheSmartPinningOnChargingToggle() {
    val enabled = !BiliClient.prefs.v129cacheSmartPinningOnCharging
    BiliClient.prefs.v129cacheSmartPinningOnCharging = enabled
    AppToast.show(this, "Cache Smart Pinning On Charging: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129ProgressBarCustomThumbBorder129Toggle() {
    val enabled = !BiliClient.prefs.v129progressBarCustomThumbBorder129
    BiliClient.prefs.v129progressBarCustomThumbBorder129 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Border129: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129VolumeNormalizeAlbumToggle() {
    val enabled = !BiliClient.prefs.v129volumeNormalizeAlbum
    BiliClient.prefs.v129volumeNormalizeAlbum = enabled
    AppToast.show(this, "Volume Normalize Album: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129HistoryAutoClean129Toggle() {
    val enabled = !BiliClient.prefs.v129historyAutoClean129
    BiliClient.prefs.v129historyAutoClean129 = enabled
    AppToast.show(this, "History Auto Clean129: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129PlaybackSpeedPresetsNotificationToggle() {
    val enabled = !BiliClient.prefs.v129playbackSpeedPresetsNotification
    BiliClient.prefs.v129playbackSpeedPresetsNotification = enabled
    AppToast.show(this, "Playback Speed Presets Notification: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129ScreenshotAutoShareSlackToggle() {
    val enabled = !BiliClient.prefs.v129screenshotAutoShareSlack
    BiliClient.prefs.v129screenshotAutoShareSlack = enabled
    AppToast.show(this, "Screenshot Auto Share Slack: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV129VideoPIPTransitionAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129videoPIPTransitionAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129videoPIPTransitionAnimation = value
        AppToast.show(this, "Video PIP Transition Animation: $value")
    }
}

internal fun PlayerActivity.showV129DanmakuFontBgFillBorderMiterLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129danmakuFontBgFillBorderMiterLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Miter Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129danmakuFontBgFillBorderMiterLimit = value
        AppToast.show(this, "Danmaku Font BG Fill Border Miter Limit: $value")
    }
}

internal fun PlayerActivity.showV129SubtitleAnimationScale129Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v129subtitleAnimationScale129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129subtitleAnimationScale129 = value
        AppToast.show(this, "Subtitle Animation Scale129: $value")
    }
}

internal fun PlayerActivity.showV130AudioChorusRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v130audioChorusRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130audioChorusRate = value
        AppToast.show(this, "Audio Chorus Rate: $value")
    }
}

internal fun PlayerActivity.showV130DanmakuFontBgFillBorderMiter129Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130danmakuFontBgFillBorderMiter129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Miter129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130danmakuFontBgFillBorderMiter129 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Miter129: $value")
    }
}

internal fun PlayerActivity.showV130SubtitleAnimationScale130Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v130subtitleAnimationScale130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130subtitleAnimationScale130 = value
        AppToast.show(this, "Subtitle Animation Scale130: $value")
    }
}

internal fun PlayerActivity.showV130GestureTapZoneDeadZoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130gestureTapZoneDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Dead Zone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130gestureTapZoneDeadZone = value
        AppToast.show(this, "Gesture Tap Zone Dead Zone: $value")
    }
}

internal fun PlayerActivity.showV130CastVideoPIPPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130castVideoPIPPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130castVideoPIPPosition = value
        AppToast.show(this, "Cast Video PIP Position: $value")
    }
}

internal fun PlayerActivity.showV130PlaylistAutoGroupByLanguageToggle() {
    val enabled = !BiliClient.prefs.v130playlistAutoGroupByLanguage
    BiliClient.prefs.v130playlistAutoGroupByLanguage = enabled
    AppToast.show(this, "Playlist Auto Group By Language: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130CacheSmartPinningOnIdleToggle() {
    val enabled = !BiliClient.prefs.v130cacheSmartPinningOnIdle
    BiliClient.prefs.v130cacheSmartPinningOnIdle = enabled
    AppToast.show(this, "Cache Smart Pinning On Idle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130ProgressBarCustomThumbColor130Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130progressBarCustomThumbColor130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130progressBarCustomThumbColor130 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color130: $value")
    }
}

internal fun PlayerActivity.showV130VolumeNormalizeTrackToggle() {
    val enabled = !BiliClient.prefs.v130volumeNormalizeTrack
    BiliClient.prefs.v130volumeNormalizeTrack = enabled
    AppToast.show(this, "Volume Normalize Track: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130HistoryAutoClean130Toggle() {
    val enabled = !BiliClient.prefs.v130historyAutoClean130
    BiliClient.prefs.v130historyAutoClean130 = enabled
    AppToast.show(this, "History Auto Clean130: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130PlaybackSpeedPresetsWidgetToggle() {
    val enabled = !BiliClient.prefs.v130playbackSpeedPresetsWidget
    BiliClient.prefs.v130playbackSpeedPresetsWidget = enabled
    AppToast.show(this, "Playback Speed Presets Widget: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130ScreenshotAutoShareTeamsToggle() {
    val enabled = !BiliClient.prefs.v130screenshotAutoShareTeams
    BiliClient.prefs.v130screenshotAutoShareTeams = enabled
    AppToast.show(this, "Screenshot Auto Share Teams: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130VideoPIPOpacityOnDragDialog() {
    val options = listOf(50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v130videoPIPOpacityOnDrag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Opacity On Drag",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130videoPIPOpacityOnDrag = value
        AppToast.show(this, "Video PIP Opacity On Drag: $value")
    }
}

internal fun PlayerActivity.showV130DanmakuFontBgFillShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v130danmakuFontBgFillShadowToggle
    BiliClient.prefs.v130danmakuFontBgFillShadowToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV130SubtitleAnimationRotate130Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v130subtitleAnimationRotate130).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate130",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v130subtitleAnimationRotate130 = value
        AppToast.show(this, "Subtitle Animation Rotate130: $value")
    }
}

internal fun PlayerActivity.showV131AudioChorusDepthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v131audioChorusDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131audioChorusDepth = value
        AppToast.show(this, "Audio Chorus Depth: $value")
    }
}

internal fun PlayerActivity.showV131DanmakuFontBgFillShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131danmakuFontBgFillShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131danmakuFontBgFillShadowColor = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Color: $value")
    }
}

internal fun PlayerActivity.showV131SubtitleAnimationRotate131Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131subtitleAnimationRotate131).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate131",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131subtitleAnimationRotate131 = value
        AppToast.show(this, "Subtitle Animation Rotate131: $value")
    }
}

internal fun PlayerActivity.showV131GestureTapZoneSensitivityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v131gestureTapZoneSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Sensitivity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131gestureTapZoneSensitivity = value
        AppToast.show(this, "Gesture Tap Zone Sensitivity: $value")
    }
}

internal fun PlayerActivity.showV131CastVideoPIPFollowMainToggle() {
    val current = BiliClient.prefs.v131castVideoPIPFollowMain
    BiliClient.prefs.v131castVideoPIPFollowMain = !current
    AppToast.show(this, "Cast Video PIP Follow Main: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131PlaylistAutoGroupByGenreToggle() {
    val current = BiliClient.prefs.v131playlistAutoGroupByGenre
    BiliClient.prefs.v131playlistAutoGroupByGenre = !current
    AppToast.show(this, "Playlist Auto Group By Genre: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131CacheSmartPinningOnScheduleToggle() {
    val current = BiliClient.prefs.v131cacheSmartPinningOnSchedule
    BiliClient.prefs.v131cacheSmartPinningOnSchedule = !current
    AppToast.show(this, "Cache Smart Pinning On Schedule: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131ProgressBarCustomThumbShadow131Toggle() {
    val current = BiliClient.prefs.v131progressBarCustomThumbShadow131
    BiliClient.prefs.v131progressBarCustomThumbShadow131 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Shadow131: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131VolumeNormalizeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131volumeNormalizeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131volumeNormalizeMode = value
        AppToast.show(this, "Volume Normalize Mode: $value")
    }
}

internal fun PlayerActivity.showV131HistoryAutoClean131Toggle() {
    val current = BiliClient.prefs.v131historyAutoClean131
    BiliClient.prefs.v131historyAutoClean131 = !current
    AppToast.show(this, "History Auto Clean131: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131PlaybackSpeedPresetsQuickSwitchToggle() {
    val current = BiliClient.prefs.v131playbackSpeedPresetsQuickSwitch
    BiliClient.prefs.v131playbackSpeedPresetsQuickSwitch = !current
    AppToast.show(this, "Playback Speed Presets Quick Switch: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131ScreenshotAutoShareMessengerToggle() {
    val current = BiliClient.prefs.v131screenshotAutoShareMessenger
    BiliClient.prefs.v131screenshotAutoShareMessenger = !current
    AppToast.show(this, "Screenshot Auto Share Messenger: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV131VideoPIPTransitionSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131videoPIPTransitionSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131videoPIPTransitionSpeed = value
        AppToast.show(this, "Video PIP Transition Speed: $value")
    }
}

internal fun PlayerActivity.showV131DanmakuFontBgFillShadowOffsetXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v131danmakuFontBgFillShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131danmakuFontBgFillShadowOffsetX = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Offset X: $value")
    }
}

internal fun PlayerActivity.showV131SubtitleAnimationTranslate131Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v131subtitleAnimationTranslate131).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate131",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v131subtitleAnimationTranslate131 = value
        AppToast.show(this, "Subtitle Animation Translate131: $value")
    }
}

internal fun PlayerActivity.showV132AudioChorusFeedbackDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v132audioChorusFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132audioChorusFeedback = value
        AppToast.show(this, "Audio Chorus Feedback: $value")
    }
}

internal fun PlayerActivity.showV132DanmakuFontBgFillShadowOffsetYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v132danmakuFontBgFillShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132danmakuFontBgFillShadowOffsetY = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Offset Y: $value")
    }
}

internal fun PlayerActivity.showV132SubtitleAnimationTranslate132Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132subtitleAnimationTranslate132).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate132",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132subtitleAnimationTranslate132 = value
        AppToast.show(this, "Subtitle Animation Translate132: $value")
    }
}

internal fun PlayerActivity.showV132GestureTapZoneVisualFeedbackToggle() {
    val current = BiliClient.prefs.v132gestureTapZoneVisualFeedback
    BiliClient.prefs.v132gestureTapZoneVisualFeedback = !current
    AppToast.show(this, "Gesture Tap Zone Visual Feedback: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132CastVideoPIPFollowFullscreenToggle() {
    val current = BiliClient.prefs.v132castVideoPIPFollowFullscreen
    BiliClient.prefs.v132castVideoPIPFollowFullscreen = !current
    AppToast.show(this, "Cast Video PIP Follow Fullscreen: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132PlaylistAutoGroupBySeries132Toggle() {
    val current = BiliClient.prefs.v132playlistAutoGroupBySeries132
    BiliClient.prefs.v132playlistAutoGroupBySeries132 = !current
    AppToast.show(this, "Playlist Auto Group By Series132: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132CacheSmartPinningOnNetworkChangeToggle() {
    val current = BiliClient.prefs.v132cacheSmartPinningOnNetworkChange
    BiliClient.prefs.v132cacheSmartPinningOnNetworkChange = !current
    AppToast.show(this, "Cache Smart Pinning On Network Change: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132ProgressBarCustomThumbGlow132Toggle() {
    val current = BiliClient.prefs.v132progressBarCustomThumbGlow132
    BiliClient.prefs.v132progressBarCustomThumbGlow132 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Glow132: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132VolumeNormalizeTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132volumeNormalizeTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132volumeNormalizeTarget = value
        AppToast.show(this, "Volume Normalize Target: $value")
    }
}

internal fun PlayerActivity.showV132HistoryAutoClean132Toggle() {
    val current = BiliClient.prefs.v132historyAutoClean132
    BiliClient.prefs.v132historyAutoClean132 = !current
    AppToast.show(this, "History Auto Clean132: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132PlaybackSpeedPresetsLongPressToggle() {
    val current = BiliClient.prefs.v132playbackSpeedPresetsLongPress
    BiliClient.prefs.v132playbackSpeedPresetsLongPress = !current
    AppToast.show(this, "Playback Speed Presets Long Press: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132ScreenshotAutoShareViberToggle() {
    val current = BiliClient.prefs.v132screenshotAutoShareViber
    BiliClient.prefs.v132screenshotAutoShareViber = !current
    AppToast.show(this, "Screenshot Auto Share Viber: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV132VideoPIPTransitionTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v132videoPIPTransitionType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132videoPIPTransitionType = value
        AppToast.show(this, "Video PIP Transition Type: $value")
    }
}

internal fun PlayerActivity.showV132DanmakuFontBgFillShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v132danmakuFontBgFillShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132danmakuFontBgFillShadowBlur = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Blur: $value")
    }
}

internal fun PlayerActivity.showV132SubtitleAnimationScale132Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v132subtitleAnimationScale132).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale132",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v132subtitleAnimationScale132 = value
        AppToast.show(this, "Subtitle Animation Scale132: $value")
    }
}

internal fun PlayerActivity.showV133AudioChorusMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v133audioChorusMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Chorus Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133audioChorusMix = value
        AppToast.show(this, "Audio Chorus Mix: $value")
    }
}

internal fun PlayerActivity.showV133DanmakuFontBgFillShadowOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v133danmakuFontBgFillShadowOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133danmakuFontBgFillShadowOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Opacity: $value")
    }
}

internal fun PlayerActivity.showV133SubtitleAnimationScale133Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v133subtitleAnimationScale133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133subtitleAnimationScale133 = value
        AppToast.show(this, "Subtitle Animation Scale133: $value")
    }
}

internal fun PlayerActivity.showV133GestureTapZoneHapticFeedbackToggle() {
    val current = BiliClient.prefs.v133gestureTapZoneHapticFeedback
    BiliClient.prefs.v133gestureTapZoneHapticFeedback = !current
    AppToast.show(this, "Gesture Tap Zone Haptic Feedback: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133CastVideoPIPFollowPlaybackToggle() {
    val current = BiliClient.prefs.v133castVideoPIPFollowPlayback
    BiliClient.prefs.v133castVideoPIPFollowPlayback = !current
    AppToast.show(this, "Cast Video PIP Follow Playback: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133PlaylistAutoGroupByDateRangeToggle() {
    val current = BiliClient.prefs.v133playlistAutoGroupByDateRange
    BiliClient.prefs.v133playlistAutoGroupByDateRange = !current
    AppToast.show(this, "Playlist Auto Group By Date Range: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133CacheSmartPinningOnBatteryLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133cacheSmartPinningOnBatteryLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Battery Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133cacheSmartPinningOnBatteryLevel = value
        AppToast.show(this, "Cache Smart Pinning On Battery Level: $value")
    }
}

internal fun PlayerActivity.showV133ProgressBarCustomThumbBorder133Toggle() {
    val current = BiliClient.prefs.v133progressBarCustomThumbBorder133
    BiliClient.prefs.v133progressBarCustomThumbBorder133 = !current
    AppToast.show(this, "Progress Bar Custom Thumb Border133: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133VolumeNormalizeCeilingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133volumeNormalizeCeiling).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Ceiling",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133volumeNormalizeCeiling = value
        AppToast.show(this, "Volume Normalize Ceiling: $value")
    }
}

internal fun PlayerActivity.showV133HistoryAutoClean133Toggle() {
    val current = BiliClient.prefs.v133historyAutoClean133
    BiliClient.prefs.v133historyAutoClean133 = !current
    AppToast.show(this, "History Auto Clean133: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133PlaybackSpeedPresetsDoubleTapToggle() {
    val current = BiliClient.prefs.v133playbackSpeedPresetsDoubleTap
    BiliClient.prefs.v133playbackSpeedPresetsDoubleTap = !current
    AppToast.show(this, "Playback Speed Presets Double Tap: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133ScreenshotAutoShareSignalToggle() {
    val current = BiliClient.prefs.v133screenshotAutoShareSignal
    BiliClient.prefs.v133screenshotAutoShareSignal = !current
    AppToast.show(this, "Screenshot Auto Share Signal: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV133VideoPIPBackgroundOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133videoPIPBackgroundOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Background Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133videoPIPBackgroundOpacity = value
        AppToast.show(this, "Video PIP Background Opacity: $value")
    }
}

internal fun PlayerActivity.showV133DanmakuFontBgFillShadowSpreadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133danmakuFontBgFillShadowSpread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Spread",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133danmakuFontBgFillShadowSpread = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Spread: $value")
    }
}

internal fun PlayerActivity.showV133SubtitleAnimationRotate133Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v133subtitleAnimationRotate133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v133subtitleAnimationRotate133 = value
        AppToast.show(this, "Subtitle Animation Rotate133: $value")
    }
}

internal fun PlayerActivity.showV134AudioFlangerToggle134Toggle() {
    val current = BiliClient.prefs.v134audioFlangerToggle134
    BiliClient.prefs.v134audioFlangerToggle134 = !current
    AppToast.show(this, "Audio Flanger Toggle134: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134DanmakuFontBgFillShadowTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134danmakuFontBgFillShadowType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134danmakuFontBgFillShadowType = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type: $value")
    }
}

internal fun PlayerActivity.showV134SubtitleAnimationRotate134Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134subtitleAnimationRotate134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134subtitleAnimationRotate134 = value
        AppToast.show(this, "Subtitle Animation Rotate134: $value")
    }
}

internal fun PlayerActivity.showV134GestureTapZoneTimeoutDialog() {
    val options = listOf(300, 400, 500, 700, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v134gestureTapZoneTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134gestureTapZoneTimeout = value
        AppToast.show(this, "Gesture Tap Zone Timeout: $value")
    }
}

internal fun PlayerActivity.showV134CastVideoPIPFollowGestureToggle() {
    val current = BiliClient.prefs.v134castVideoPIPFollowGesture
    BiliClient.prefs.v134castVideoPIPFollowGesture = !current
    AppToast.show(this, "Cast Video PIP Follow Gesture: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134PlaylistAutoGroupByWatchCountToggle() {
    val current = BiliClient.prefs.v134playlistAutoGroupByWatchCount
    BiliClient.prefs.v134playlistAutoGroupByWatchCount = !current
    AppToast.show(this, "Playlist Auto Group By Watch Count: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134CacheSmartPinningOnStorageTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134cacheSmartPinningOnStorageType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning On Storage Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134cacheSmartPinningOnStorageType = value
        AppToast.show(this, "Cache Smart Pinning On Storage Type: $value")
    }
}

internal fun PlayerActivity.showV134ProgressBarCustomThumbSize134Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v134progressBarCustomThumbSize134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Size134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134progressBarCustomThumbSize134 = value
        AppToast.show(this, "Progress Bar Custom Thumb Size134: $value")
    }
}

internal fun PlayerActivity.showV134VolumeNormalizeWindowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134volumeNormalizeWindow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Normalize Window",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134volumeNormalizeWindow = value
        AppToast.show(this, "Volume Normalize Window: $value")
    }
}

internal fun PlayerActivity.showV134HistoryAutoClean134Toggle() {
    val current = BiliClient.prefs.v134historyAutoClean134
    BiliClient.prefs.v134historyAutoClean134 = !current
    AppToast.show(this, "History Auto Clean134: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134PlaybackSpeedPresetsTripleTapToggle() {
    val current = BiliClient.prefs.v134playbackSpeedPresetsTripleTap
    BiliClient.prefs.v134playbackSpeedPresetsTripleTap = !current
    AppToast.show(this, "Playback Speed Presets Triple Tap: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134ScreenshotAutoShareXToggle() {
    val current = BiliClient.prefs.v134screenshotAutoShareX
    BiliClient.prefs.v134screenshotAutoShareX = !current
    AppToast.show(this, "Screenshot Auto Share X: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134VideoPIPFollowOrientationToggle() {
    val current = BiliClient.prefs.v134videoPIPFollowOrientation
    BiliClient.prefs.v134videoPIPFollowOrientation = !current
    AppToast.show(this, "Video PIP Follow Orientation: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV134DanmakuFontBgFillShadowType133Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v134danmakuFontBgFillShadowType133).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Shadow Type133",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134danmakuFontBgFillShadowType133 = value
        AppToast.show(this, "Danmaku Font BG Fill Shadow Type133: $value")
    }
}

internal fun PlayerActivity.showV134SubtitleAnimationBlur134Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v134subtitleAnimationBlur134).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur134",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v134subtitleAnimationBlur134 = value
        AppToast.show(this, "Subtitle Animation Blur134: $value")
    }
}

internal fun PlayerActivity.showV135AudioFlangerRateDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v135audioFlangerRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Flanger Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v135audioFlangerRate = value
        AppToast.show(this, "Audio Flanger Rate: $value")
    }
}

