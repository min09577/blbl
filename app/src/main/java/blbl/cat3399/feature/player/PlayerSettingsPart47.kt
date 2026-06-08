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

internal fun PlayerActivity.showV641CipherAutoEncrypt641Toggle() {
    val current = BiliClient.prefs.v641cipherAutoEncrypt641
    BiliClient.prefs.v641cipherAutoEncrypt641 = !current
    AppToast.show(this, "Cipher Auto Encrypt641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641CircleAutoClip641Toggle() {
    val current = BiliClient.prefs.v641circleAutoClip641
    BiliClient.prefs.v641circleAutoClip641 = !current
    AppToast.show(this, "Circle Auto Clip641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ClampAutoValue641Toggle() {
    val current = BiliClient.prefs.v641clampAutoValue641
    BiliClient.prefs.v641clampAutoValue641 = !current
    AppToast.show(this, "Clamp Auto Value641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV641ClassAutoLoad641Toggle() {
    val current = BiliClient.prefs.v641classAutoLoad641
    BiliClient.prefs.v641classAutoLoad641 = !current
    AppToast.show(this, "Class Auto Load641: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642CellAutoMerge642Toggle() {
    val current = BiliClient.prefs.v642cellAutoMerge642
    BiliClient.prefs.v642cellAutoMerge642 = !current
    AppToast.show(this, "Cell Auto Merge642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642CenterAutoGravity642Toggle() {
    val current = BiliClient.prefs.v642centerAutoGravity642
    BiliClient.prefs.v642centerAutoGravity642 = !current
    AppToast.show(this, "Center Auto Gravity642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChainAutoLink642Toggle() {
    val current = BiliClient.prefs.v642chainAutoLink642
    BiliClient.prefs.v642chainAutoLink642 = !current
    AppToast.show(this, "Chain Auto Link642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChallengeAutoJoin642Toggle() {
    val current = BiliClient.prefs.v642challengeAutoJoin642
    BiliClient.prefs.v642challengeAutoJoin642 = !current
    AppToast.show(this, "Challenge Auto Join642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChangeAutoTrack642Toggle() {
    val current = BiliClient.prefs.v642changeAutoTrack642
    BiliClient.prefs.v642changeAutoTrack642 = !current
    AppToast.show(this, "Change Auto Track642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChannelAutoSwitch642Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v642channelAutoSwitch642).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch642",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v642channelAutoSwitch642 = value
        AppToast.show(this, "Channel Auto Switch642: $value")
    }
}

internal fun PlayerActivity.showV642ChapterAutoMark642Toggle() {
    val current = BiliClient.prefs.v642chapterAutoMark642
    BiliClient.prefs.v642chapterAutoMark642 = !current
    AppToast.show(this, "Chapter Auto Mark642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChartAutoRender642Toggle() {
    val current = BiliClient.prefs.v642chartAutoRender642
    BiliClient.prefs.v642chartAutoRender642 = !current
    AppToast.show(this, "Chart Auto Render642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642CheckAutoVerify642Toggle() {
    val current = BiliClient.prefs.v642checkAutoVerify642
    BiliClient.prefs.v642checkAutoVerify642 = !current
    AppToast.show(this, "Check Auto Verify642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChipAutoTag642Toggle() {
    val current = BiliClient.prefs.v642chipAutoTag642
    BiliClient.prefs.v642chipAutoTag642 = !current
    AppToast.show(this, "Chip Auto Tag642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ChunkAutoSplit642Toggle() {
    val current = BiliClient.prefs.v642chunkAutoSplit642
    BiliClient.prefs.v642chunkAutoSplit642 = !current
    AppToast.show(this, "Chunk Auto Split642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642CipherAutoEncrypt642Toggle() {
    val current = BiliClient.prefs.v642cipherAutoEncrypt642
    BiliClient.prefs.v642cipherAutoEncrypt642 = !current
    AppToast.show(this, "Cipher Auto Encrypt642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642CircleAutoClip642Toggle() {
    val current = BiliClient.prefs.v642circleAutoClip642
    BiliClient.prefs.v642circleAutoClip642 = !current
    AppToast.show(this, "Circle Auto Clip642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ClampAutoValue642Toggle() {
    val current = BiliClient.prefs.v642clampAutoValue642
    BiliClient.prefs.v642clampAutoValue642 = !current
    AppToast.show(this, "Clamp Auto Value642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV642ClassAutoLoad642Toggle() {
    val current = BiliClient.prefs.v642classAutoLoad642
    BiliClient.prefs.v642classAutoLoad642 = !current
    AppToast.show(this, "Class Auto Load642: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643CellAutoMerge643Toggle() {
    val current = BiliClient.prefs.v643cellAutoMerge643
    BiliClient.prefs.v643cellAutoMerge643 = !current
    AppToast.show(this, "Cell Auto Merge643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643CenterAutoGravity643Toggle() {
    val current = BiliClient.prefs.v643centerAutoGravity643
    BiliClient.prefs.v643centerAutoGravity643 = !current
    AppToast.show(this, "Center Auto Gravity643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChainAutoLink643Toggle() {
    val current = BiliClient.prefs.v643chainAutoLink643
    BiliClient.prefs.v643chainAutoLink643 = !current
    AppToast.show(this, "Chain Auto Link643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChallengeAutoJoin643Toggle() {
    val current = BiliClient.prefs.v643challengeAutoJoin643
    BiliClient.prefs.v643challengeAutoJoin643 = !current
    AppToast.show(this, "Challenge Auto Join643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChangeAutoTrack643Toggle() {
    val current = BiliClient.prefs.v643changeAutoTrack643
    BiliClient.prefs.v643changeAutoTrack643 = !current
    AppToast.show(this, "Change Auto Track643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChannelAutoSwitch643Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v643channelAutoSwitch643).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch643",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v643channelAutoSwitch643 = value
        AppToast.show(this, "Channel Auto Switch643: $value")
    }
}

internal fun PlayerActivity.showV643ChapterAutoMark643Toggle() {
    val current = BiliClient.prefs.v643chapterAutoMark643
    BiliClient.prefs.v643chapterAutoMark643 = !current
    AppToast.show(this, "Chapter Auto Mark643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChartAutoRender643Toggle() {
    val current = BiliClient.prefs.v643chartAutoRender643
    BiliClient.prefs.v643chartAutoRender643 = !current
    AppToast.show(this, "Chart Auto Render643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643CheckAutoVerify643Toggle() {
    val current = BiliClient.prefs.v643checkAutoVerify643
    BiliClient.prefs.v643checkAutoVerify643 = !current
    AppToast.show(this, "Check Auto Verify643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChipAutoTag643Toggle() {
    val current = BiliClient.prefs.v643chipAutoTag643
    BiliClient.prefs.v643chipAutoTag643 = !current
    AppToast.show(this, "Chip Auto Tag643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ChunkAutoSplit643Toggle() {
    val current = BiliClient.prefs.v643chunkAutoSplit643
    BiliClient.prefs.v643chunkAutoSplit643 = !current
    AppToast.show(this, "Chunk Auto Split643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643CipherAutoEncrypt643Toggle() {
    val current = BiliClient.prefs.v643cipherAutoEncrypt643
    BiliClient.prefs.v643cipherAutoEncrypt643 = !current
    AppToast.show(this, "Cipher Auto Encrypt643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643CircleAutoClip643Toggle() {
    val current = BiliClient.prefs.v643circleAutoClip643
    BiliClient.prefs.v643circleAutoClip643 = !current
    AppToast.show(this, "Circle Auto Clip643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ClampAutoValue643Toggle() {
    val current = BiliClient.prefs.v643clampAutoValue643
    BiliClient.prefs.v643clampAutoValue643 = !current
    AppToast.show(this, "Clamp Auto Value643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV643ClassAutoLoad643Toggle() {
    val current = BiliClient.prefs.v643classAutoLoad643
    BiliClient.prefs.v643classAutoLoad643 = !current
    AppToast.show(this, "Class Auto Load643: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644CellAutoMerge644Toggle() {
    val current = BiliClient.prefs.v644cellAutoMerge644
    BiliClient.prefs.v644cellAutoMerge644 = !current
    AppToast.show(this, "Cell Auto Merge644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644CenterAutoGravity644Toggle() {
    val current = BiliClient.prefs.v644centerAutoGravity644
    BiliClient.prefs.v644centerAutoGravity644 = !current
    AppToast.show(this, "Center Auto Gravity644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChainAutoLink644Toggle() {
    val current = BiliClient.prefs.v644chainAutoLink644
    BiliClient.prefs.v644chainAutoLink644 = !current
    AppToast.show(this, "Chain Auto Link644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChallengeAutoJoin644Toggle() {
    val current = BiliClient.prefs.v644challengeAutoJoin644
    BiliClient.prefs.v644challengeAutoJoin644 = !current
    AppToast.show(this, "Challenge Auto Join644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChangeAutoTrack644Toggle() {
    val current = BiliClient.prefs.v644changeAutoTrack644
    BiliClient.prefs.v644changeAutoTrack644 = !current
    AppToast.show(this, "Change Auto Track644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChannelAutoSwitch644Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v644channelAutoSwitch644).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch644",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v644channelAutoSwitch644 = value
        AppToast.show(this, "Channel Auto Switch644: $value")
    }
}

internal fun PlayerActivity.showV644ChapterAutoMark644Toggle() {
    val current = BiliClient.prefs.v644chapterAutoMark644
    BiliClient.prefs.v644chapterAutoMark644 = !current
    AppToast.show(this, "Chapter Auto Mark644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChartAutoRender644Toggle() {
    val current = BiliClient.prefs.v644chartAutoRender644
    BiliClient.prefs.v644chartAutoRender644 = !current
    AppToast.show(this, "Chart Auto Render644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644CheckAutoVerify644Toggle() {
    val current = BiliClient.prefs.v644checkAutoVerify644
    BiliClient.prefs.v644checkAutoVerify644 = !current
    AppToast.show(this, "Check Auto Verify644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChipAutoTag644Toggle() {
    val current = BiliClient.prefs.v644chipAutoTag644
    BiliClient.prefs.v644chipAutoTag644 = !current
    AppToast.show(this, "Chip Auto Tag644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ChunkAutoSplit644Toggle() {
    val current = BiliClient.prefs.v644chunkAutoSplit644
    BiliClient.prefs.v644chunkAutoSplit644 = !current
    AppToast.show(this, "Chunk Auto Split644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644CipherAutoEncrypt644Toggle() {
    val current = BiliClient.prefs.v644cipherAutoEncrypt644
    BiliClient.prefs.v644cipherAutoEncrypt644 = !current
    AppToast.show(this, "Cipher Auto Encrypt644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644CircleAutoClip644Toggle() {
    val current = BiliClient.prefs.v644circleAutoClip644
    BiliClient.prefs.v644circleAutoClip644 = !current
    AppToast.show(this, "Circle Auto Clip644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ClampAutoValue644Toggle() {
    val current = BiliClient.prefs.v644clampAutoValue644
    BiliClient.prefs.v644clampAutoValue644 = !current
    AppToast.show(this, "Clamp Auto Value644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV644ClassAutoLoad644Toggle() {
    val current = BiliClient.prefs.v644classAutoLoad644
    BiliClient.prefs.v644classAutoLoad644 = !current
    AppToast.show(this, "Class Auto Load644: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645CellAutoMerge645Toggle() {
    val current = BiliClient.prefs.v645cellAutoMerge645
    BiliClient.prefs.v645cellAutoMerge645 = !current
    AppToast.show(this, "Cell Auto Merge645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645CenterAutoGravity645Toggle() {
    val current = BiliClient.prefs.v645centerAutoGravity645
    BiliClient.prefs.v645centerAutoGravity645 = !current
    AppToast.show(this, "Center Auto Gravity645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChainAutoLink645Toggle() {
    val current = BiliClient.prefs.v645chainAutoLink645
    BiliClient.prefs.v645chainAutoLink645 = !current
    AppToast.show(this, "Chain Auto Link645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChallengeAutoJoin645Toggle() {
    val current = BiliClient.prefs.v645challengeAutoJoin645
    BiliClient.prefs.v645challengeAutoJoin645 = !current
    AppToast.show(this, "Challenge Auto Join645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChangeAutoTrack645Toggle() {
    val current = BiliClient.prefs.v645changeAutoTrack645
    BiliClient.prefs.v645changeAutoTrack645 = !current
    AppToast.show(this, "Change Auto Track645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChannelAutoSwitch645Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v645channelAutoSwitch645).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch645",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v645channelAutoSwitch645 = value
        AppToast.show(this, "Channel Auto Switch645: $value")
    }
}

internal fun PlayerActivity.showV645ChapterAutoMark645Toggle() {
    val current = BiliClient.prefs.v645chapterAutoMark645
    BiliClient.prefs.v645chapterAutoMark645 = !current
    AppToast.show(this, "Chapter Auto Mark645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChartAutoRender645Toggle() {
    val current = BiliClient.prefs.v645chartAutoRender645
    BiliClient.prefs.v645chartAutoRender645 = !current
    AppToast.show(this, "Chart Auto Render645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645CheckAutoVerify645Toggle() {
    val current = BiliClient.prefs.v645checkAutoVerify645
    BiliClient.prefs.v645checkAutoVerify645 = !current
    AppToast.show(this, "Check Auto Verify645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChipAutoTag645Toggle() {
    val current = BiliClient.prefs.v645chipAutoTag645
    BiliClient.prefs.v645chipAutoTag645 = !current
    AppToast.show(this, "Chip Auto Tag645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ChunkAutoSplit645Toggle() {
    val current = BiliClient.prefs.v645chunkAutoSplit645
    BiliClient.prefs.v645chunkAutoSplit645 = !current
    AppToast.show(this, "Chunk Auto Split645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645CipherAutoEncrypt645Toggle() {
    val current = BiliClient.prefs.v645cipherAutoEncrypt645
    BiliClient.prefs.v645cipherAutoEncrypt645 = !current
    AppToast.show(this, "Cipher Auto Encrypt645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645CircleAutoClip645Toggle() {
    val current = BiliClient.prefs.v645circleAutoClip645
    BiliClient.prefs.v645circleAutoClip645 = !current
    AppToast.show(this, "Circle Auto Clip645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ClampAutoValue645Toggle() {
    val current = BiliClient.prefs.v645clampAutoValue645
    BiliClient.prefs.v645clampAutoValue645 = !current
    AppToast.show(this, "Clamp Auto Value645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV645ClassAutoLoad645Toggle() {
    val current = BiliClient.prefs.v645classAutoLoad645
    BiliClient.prefs.v645classAutoLoad645 = !current
    AppToast.show(this, "Class Auto Load645: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646CellAutoMerge646Toggle() {
    val current = BiliClient.prefs.v646cellAutoMerge646
    BiliClient.prefs.v646cellAutoMerge646 = !current
    AppToast.show(this, "Cell Auto Merge646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646CenterAutoGravity646Toggle() {
    val current = BiliClient.prefs.v646centerAutoGravity646
    BiliClient.prefs.v646centerAutoGravity646 = !current
    AppToast.show(this, "Center Auto Gravity646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChainAutoLink646Toggle() {
    val current = BiliClient.prefs.v646chainAutoLink646
    BiliClient.prefs.v646chainAutoLink646 = !current
    AppToast.show(this, "Chain Auto Link646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChallengeAutoJoin646Toggle() {
    val current = BiliClient.prefs.v646challengeAutoJoin646
    BiliClient.prefs.v646challengeAutoJoin646 = !current
    AppToast.show(this, "Challenge Auto Join646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChangeAutoTrack646Toggle() {
    val current = BiliClient.prefs.v646changeAutoTrack646
    BiliClient.prefs.v646changeAutoTrack646 = !current
    AppToast.show(this, "Change Auto Track646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChannelAutoSwitch646Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v646channelAutoSwitch646).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch646",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v646channelAutoSwitch646 = value
        AppToast.show(this, "Channel Auto Switch646: $value")
    }
}

internal fun PlayerActivity.showV646ChapterAutoMark646Toggle() {
    val current = BiliClient.prefs.v646chapterAutoMark646
    BiliClient.prefs.v646chapterAutoMark646 = !current
    AppToast.show(this, "Chapter Auto Mark646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChartAutoRender646Toggle() {
    val current = BiliClient.prefs.v646chartAutoRender646
    BiliClient.prefs.v646chartAutoRender646 = !current
    AppToast.show(this, "Chart Auto Render646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646CheckAutoVerify646Toggle() {
    val current = BiliClient.prefs.v646checkAutoVerify646
    BiliClient.prefs.v646checkAutoVerify646 = !current
    AppToast.show(this, "Check Auto Verify646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChipAutoTag646Toggle() {
    val current = BiliClient.prefs.v646chipAutoTag646
    BiliClient.prefs.v646chipAutoTag646 = !current
    AppToast.show(this, "Chip Auto Tag646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ChunkAutoSplit646Toggle() {
    val current = BiliClient.prefs.v646chunkAutoSplit646
    BiliClient.prefs.v646chunkAutoSplit646 = !current
    AppToast.show(this, "Chunk Auto Split646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646CipherAutoEncrypt646Toggle() {
    val current = BiliClient.prefs.v646cipherAutoEncrypt646
    BiliClient.prefs.v646cipherAutoEncrypt646 = !current
    AppToast.show(this, "Cipher Auto Encrypt646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646CircleAutoClip646Toggle() {
    val current = BiliClient.prefs.v646circleAutoClip646
    BiliClient.prefs.v646circleAutoClip646 = !current
    AppToast.show(this, "Circle Auto Clip646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ClampAutoValue646Toggle() {
    val current = BiliClient.prefs.v646clampAutoValue646
    BiliClient.prefs.v646clampAutoValue646 = !current
    AppToast.show(this, "Clamp Auto Value646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV646ClassAutoLoad646Toggle() {
    val current = BiliClient.prefs.v646classAutoLoad646
    BiliClient.prefs.v646classAutoLoad646 = !current
    AppToast.show(this, "Class Auto Load646: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647CellAutoMerge647Toggle() {
    val current = BiliClient.prefs.v647cellAutoMerge647
    BiliClient.prefs.v647cellAutoMerge647 = !current
    AppToast.show(this, "Cell Auto Merge647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647CenterAutoGravity647Toggle() {
    val current = BiliClient.prefs.v647centerAutoGravity647
    BiliClient.prefs.v647centerAutoGravity647 = !current
    AppToast.show(this, "Center Auto Gravity647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChainAutoLink647Toggle() {
    val current = BiliClient.prefs.v647chainAutoLink647
    BiliClient.prefs.v647chainAutoLink647 = !current
    AppToast.show(this, "Chain Auto Link647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChallengeAutoJoin647Toggle() {
    val current = BiliClient.prefs.v647challengeAutoJoin647
    BiliClient.prefs.v647challengeAutoJoin647 = !current
    AppToast.show(this, "Challenge Auto Join647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChangeAutoTrack647Toggle() {
    val current = BiliClient.prefs.v647changeAutoTrack647
    BiliClient.prefs.v647changeAutoTrack647 = !current
    AppToast.show(this, "Change Auto Track647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChannelAutoSwitch647Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v647channelAutoSwitch647).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch647",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v647channelAutoSwitch647 = value
        AppToast.show(this, "Channel Auto Switch647: $value")
    }
}

internal fun PlayerActivity.showV647ChapterAutoMark647Toggle() {
    val current = BiliClient.prefs.v647chapterAutoMark647
    BiliClient.prefs.v647chapterAutoMark647 = !current
    AppToast.show(this, "Chapter Auto Mark647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChartAutoRender647Toggle() {
    val current = BiliClient.prefs.v647chartAutoRender647
    BiliClient.prefs.v647chartAutoRender647 = !current
    AppToast.show(this, "Chart Auto Render647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647CheckAutoVerify647Toggle() {
    val current = BiliClient.prefs.v647checkAutoVerify647
    BiliClient.prefs.v647checkAutoVerify647 = !current
    AppToast.show(this, "Check Auto Verify647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChipAutoTag647Toggle() {
    val current = BiliClient.prefs.v647chipAutoTag647
    BiliClient.prefs.v647chipAutoTag647 = !current
    AppToast.show(this, "Chip Auto Tag647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ChunkAutoSplit647Toggle() {
    val current = BiliClient.prefs.v647chunkAutoSplit647
    BiliClient.prefs.v647chunkAutoSplit647 = !current
    AppToast.show(this, "Chunk Auto Split647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647CipherAutoEncrypt647Toggle() {
    val current = BiliClient.prefs.v647cipherAutoEncrypt647
    BiliClient.prefs.v647cipherAutoEncrypt647 = !current
    AppToast.show(this, "Cipher Auto Encrypt647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647CircleAutoClip647Toggle() {
    val current = BiliClient.prefs.v647circleAutoClip647
    BiliClient.prefs.v647circleAutoClip647 = !current
    AppToast.show(this, "Circle Auto Clip647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ClampAutoValue647Toggle() {
    val current = BiliClient.prefs.v647clampAutoValue647
    BiliClient.prefs.v647clampAutoValue647 = !current
    AppToast.show(this, "Clamp Auto Value647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV647ClassAutoLoad647Toggle() {
    val current = BiliClient.prefs.v647classAutoLoad647
    BiliClient.prefs.v647classAutoLoad647 = !current
    AppToast.show(this, "Class Auto Load647: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648CellAutoMerge648Toggle() {
    val current = BiliClient.prefs.v648cellAutoMerge648
    BiliClient.prefs.v648cellAutoMerge648 = !current
    AppToast.show(this, "Cell Auto Merge648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648CenterAutoGravity648Toggle() {
    val current = BiliClient.prefs.v648centerAutoGravity648
    BiliClient.prefs.v648centerAutoGravity648 = !current
    AppToast.show(this, "Center Auto Gravity648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChainAutoLink648Toggle() {
    val current = BiliClient.prefs.v648chainAutoLink648
    BiliClient.prefs.v648chainAutoLink648 = !current
    AppToast.show(this, "Chain Auto Link648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChallengeAutoJoin648Toggle() {
    val current = BiliClient.prefs.v648challengeAutoJoin648
    BiliClient.prefs.v648challengeAutoJoin648 = !current
    AppToast.show(this, "Challenge Auto Join648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChangeAutoTrack648Toggle() {
    val current = BiliClient.prefs.v648changeAutoTrack648
    BiliClient.prefs.v648changeAutoTrack648 = !current
    AppToast.show(this, "Change Auto Track648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChannelAutoSwitch648Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v648channelAutoSwitch648).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch648",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v648channelAutoSwitch648 = value
        AppToast.show(this, "Channel Auto Switch648: $value")
    }
}

internal fun PlayerActivity.showV648ChapterAutoMark648Toggle() {
    val current = BiliClient.prefs.v648chapterAutoMark648
    BiliClient.prefs.v648chapterAutoMark648 = !current
    AppToast.show(this, "Chapter Auto Mark648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChartAutoRender648Toggle() {
    val current = BiliClient.prefs.v648chartAutoRender648
    BiliClient.prefs.v648chartAutoRender648 = !current
    AppToast.show(this, "Chart Auto Render648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648CheckAutoVerify648Toggle() {
    val current = BiliClient.prefs.v648checkAutoVerify648
    BiliClient.prefs.v648checkAutoVerify648 = !current
    AppToast.show(this, "Check Auto Verify648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChipAutoTag648Toggle() {
    val current = BiliClient.prefs.v648chipAutoTag648
    BiliClient.prefs.v648chipAutoTag648 = !current
    AppToast.show(this, "Chip Auto Tag648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ChunkAutoSplit648Toggle() {
    val current = BiliClient.prefs.v648chunkAutoSplit648
    BiliClient.prefs.v648chunkAutoSplit648 = !current
    AppToast.show(this, "Chunk Auto Split648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648CipherAutoEncrypt648Toggle() {
    val current = BiliClient.prefs.v648cipherAutoEncrypt648
    BiliClient.prefs.v648cipherAutoEncrypt648 = !current
    AppToast.show(this, "Cipher Auto Encrypt648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648CircleAutoClip648Toggle() {
    val current = BiliClient.prefs.v648circleAutoClip648
    BiliClient.prefs.v648circleAutoClip648 = !current
    AppToast.show(this, "Circle Auto Clip648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ClampAutoValue648Toggle() {
    val current = BiliClient.prefs.v648clampAutoValue648
    BiliClient.prefs.v648clampAutoValue648 = !current
    AppToast.show(this, "Clamp Auto Value648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV648ClassAutoLoad648Toggle() {
    val current = BiliClient.prefs.v648classAutoLoad648
    BiliClient.prefs.v648classAutoLoad648 = !current
    AppToast.show(this, "Class Auto Load648: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649CellAutoMerge649Toggle() {
    val current = BiliClient.prefs.v649cellAutoMerge649
    BiliClient.prefs.v649cellAutoMerge649 = !current
    AppToast.show(this, "Cell Auto Merge649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649CenterAutoGravity649Toggle() {
    val current = BiliClient.prefs.v649centerAutoGravity649
    BiliClient.prefs.v649centerAutoGravity649 = !current
    AppToast.show(this, "Center Auto Gravity649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChainAutoLink649Toggle() {
    val current = BiliClient.prefs.v649chainAutoLink649
    BiliClient.prefs.v649chainAutoLink649 = !current
    AppToast.show(this, "Chain Auto Link649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChallengeAutoJoin649Toggle() {
    val current = BiliClient.prefs.v649challengeAutoJoin649
    BiliClient.prefs.v649challengeAutoJoin649 = !current
    AppToast.show(this, "Challenge Auto Join649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChangeAutoTrack649Toggle() {
    val current = BiliClient.prefs.v649changeAutoTrack649
    BiliClient.prefs.v649changeAutoTrack649 = !current
    AppToast.show(this, "Change Auto Track649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChannelAutoSwitch649Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v649channelAutoSwitch649).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch649",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v649channelAutoSwitch649 = value
        AppToast.show(this, "Channel Auto Switch649: $value")
    }
}

internal fun PlayerActivity.showV649ChapterAutoMark649Toggle() {
    val current = BiliClient.prefs.v649chapterAutoMark649
    BiliClient.prefs.v649chapterAutoMark649 = !current
    AppToast.show(this, "Chapter Auto Mark649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChartAutoRender649Toggle() {
    val current = BiliClient.prefs.v649chartAutoRender649
    BiliClient.prefs.v649chartAutoRender649 = !current
    AppToast.show(this, "Chart Auto Render649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649CheckAutoVerify649Toggle() {
    val current = BiliClient.prefs.v649checkAutoVerify649
    BiliClient.prefs.v649checkAutoVerify649 = !current
    AppToast.show(this, "Check Auto Verify649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChipAutoTag649Toggle() {
    val current = BiliClient.prefs.v649chipAutoTag649
    BiliClient.prefs.v649chipAutoTag649 = !current
    AppToast.show(this, "Chip Auto Tag649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ChunkAutoSplit649Toggle() {
    val current = BiliClient.prefs.v649chunkAutoSplit649
    BiliClient.prefs.v649chunkAutoSplit649 = !current
    AppToast.show(this, "Chunk Auto Split649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649CipherAutoEncrypt649Toggle() {
    val current = BiliClient.prefs.v649cipherAutoEncrypt649
    BiliClient.prefs.v649cipherAutoEncrypt649 = !current
    AppToast.show(this, "Cipher Auto Encrypt649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649CircleAutoClip649Toggle() {
    val current = BiliClient.prefs.v649circleAutoClip649
    BiliClient.prefs.v649circleAutoClip649 = !current
    AppToast.show(this, "Circle Auto Clip649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ClampAutoValue649Toggle() {
    val current = BiliClient.prefs.v649clampAutoValue649
    BiliClient.prefs.v649clampAutoValue649 = !current
    AppToast.show(this, "Clamp Auto Value649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV649ClassAutoLoad649Toggle() {
    val current = BiliClient.prefs.v649classAutoLoad649
    BiliClient.prefs.v649classAutoLoad649 = !current
    AppToast.show(this, "Class Auto Load649: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650CellAutoMerge650Toggle() {
    val current = BiliClient.prefs.v650cellAutoMerge650
    BiliClient.prefs.v650cellAutoMerge650 = !current
    AppToast.show(this, "Cell Auto Merge650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650CenterAutoGravity650Toggle() {
    val current = BiliClient.prefs.v650centerAutoGravity650
    BiliClient.prefs.v650centerAutoGravity650 = !current
    AppToast.show(this, "Center Auto Gravity650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChainAutoLink650Toggle() {
    val current = BiliClient.prefs.v650chainAutoLink650
    BiliClient.prefs.v650chainAutoLink650 = !current
    AppToast.show(this, "Chain Auto Link650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChallengeAutoJoin650Toggle() {
    val current = BiliClient.prefs.v650challengeAutoJoin650
    BiliClient.prefs.v650challengeAutoJoin650 = !current
    AppToast.show(this, "Challenge Auto Join650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChangeAutoTrack650Toggle() {
    val current = BiliClient.prefs.v650changeAutoTrack650
    BiliClient.prefs.v650changeAutoTrack650 = !current
    AppToast.show(this, "Change Auto Track650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChannelAutoSwitch650Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v650channelAutoSwitch650).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch650",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v650channelAutoSwitch650 = value
        AppToast.show(this, "Channel Auto Switch650: $value")
    }
}

internal fun PlayerActivity.showV650ChapterAutoMark650Toggle() {
    val current = BiliClient.prefs.v650chapterAutoMark650
    BiliClient.prefs.v650chapterAutoMark650 = !current
    AppToast.show(this, "Chapter Auto Mark650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChartAutoRender650Toggle() {
    val current = BiliClient.prefs.v650chartAutoRender650
    BiliClient.prefs.v650chartAutoRender650 = !current
    AppToast.show(this, "Chart Auto Render650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650CheckAutoVerify650Toggle() {
    val current = BiliClient.prefs.v650checkAutoVerify650
    BiliClient.prefs.v650checkAutoVerify650 = !current
    AppToast.show(this, "Check Auto Verify650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChipAutoTag650Toggle() {
    val current = BiliClient.prefs.v650chipAutoTag650
    BiliClient.prefs.v650chipAutoTag650 = !current
    AppToast.show(this, "Chip Auto Tag650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ChunkAutoSplit650Toggle() {
    val current = BiliClient.prefs.v650chunkAutoSplit650
    BiliClient.prefs.v650chunkAutoSplit650 = !current
    AppToast.show(this, "Chunk Auto Split650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650CipherAutoEncrypt650Toggle() {
    val current = BiliClient.prefs.v650cipherAutoEncrypt650
    BiliClient.prefs.v650cipherAutoEncrypt650 = !current
    AppToast.show(this, "Cipher Auto Encrypt650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650CircleAutoClip650Toggle() {
    val current = BiliClient.prefs.v650circleAutoClip650
    BiliClient.prefs.v650circleAutoClip650 = !current
    AppToast.show(this, "Circle Auto Clip650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ClampAutoValue650Toggle() {
    val current = BiliClient.prefs.v650clampAutoValue650
    BiliClient.prefs.v650clampAutoValue650 = !current
    AppToast.show(this, "Clamp Auto Value650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV650ClassAutoLoad650Toggle() {
    val current = BiliClient.prefs.v650classAutoLoad650
    BiliClient.prefs.v650classAutoLoad650 = !current
    AppToast.show(this, "Class Auto Load650: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CloneAutoProfile651Toggle() {
    val current = BiliClient.prefs.v651cloneAutoProfile651
    BiliClient.prefs.v651cloneAutoProfile651 = !current
    AppToast.show(this, "Clone Auto Profile651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CloseAutoSave651Toggle() {
    val current = BiliClient.prefs.v651closeAutoSave651
    BiliClient.prefs.v651closeAutoSave651 = !current
    AppToast.show(this, "Close Auto Save651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651ClusterAutoGroup651Toggle() {
    val current = BiliClient.prefs.v651clusterAutoGroup651
    BiliClient.prefs.v651clusterAutoGroup651 = !current
    AppToast.show(this, "Cluster Auto Group651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CodeAutoHighlight651Toggle() {
    val current = BiliClient.prefs.v651codeAutoHighlight651
    BiliClient.prefs.v651codeAutoHighlight651 = !current
    AppToast.show(this, "Code Auto Highlight651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CollapseAutoFold651Toggle() {
    val current = BiliClient.prefs.v651collapseAutoFold651
    BiliClient.prefs.v651collapseAutoFold651 = !current
    AppToast.show(this, "Collapse Auto Fold651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651ColumnAutoResize651Toggle() {
    val current = BiliClient.prefs.v651columnAutoResize651
    BiliClient.prefs.v651columnAutoResize651 = !current
    AppToast.show(this, "Column Auto Resize651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CombineAutoMerge651Toggle() {
    val current = BiliClient.prefs.v651combineAutoMerge651
    BiliClient.prefs.v651combineAutoMerge651 = !current
    AppToast.show(this, "Combine Auto Merge651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CommandAutoExec651Toggle() {
    val current = BiliClient.prefs.v651commandAutoExec651
    BiliClient.prefs.v651commandAutoExec651 = !current
    AppToast.show(this, "Command Auto Exec651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CommitAutoPush651Toggle() {
    val current = BiliClient.prefs.v651commitAutoPush651
    BiliClient.prefs.v651commitAutoPush651 = !current
    AppToast.show(this, "Commit Auto Push651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651CompareAutoDiff651Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v651compareAutoDiff651).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff651",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v651compareAutoDiff651 = value
        AppToast.show(this, "Compare Auto Diff651: $value")
    }
}

internal fun PlayerActivity.showV651CompileAutoBuild651Toggle() {
    val current = BiliClient.prefs.v651compileAutoBuild651
    BiliClient.prefs.v651compileAutoBuild651 = !current
    AppToast.show(this, "Compile Auto Build651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651ComponentAutoLoad651Toggle() {
    val current = BiliClient.prefs.v651componentAutoLoad651
    BiliClient.prefs.v651componentAutoLoad651 = !current
    AppToast.show(this, "Component Auto Load651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651ComputeAutoCalc651Toggle() {
    val current = BiliClient.prefs.v651computeAutoCalc651
    BiliClient.prefs.v651computeAutoCalc651 = !current
    AppToast.show(this, "Compute Auto Calc651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651ConcatAutoJoin651Toggle() {
    val current = BiliClient.prefs.v651concatAutoJoin651
    BiliClient.prefs.v651concatAutoJoin651 = !current
    AppToast.show(this, "Concat Auto Join651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV651ConditionAutoEval651Toggle() {
    val current = BiliClient.prefs.v651conditionAutoEval651
    BiliClient.prefs.v651conditionAutoEval651 = !current
    AppToast.show(this, "Condition Auto Eval651: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CloneAutoProfile652Toggle() {
    val current = BiliClient.prefs.v652cloneAutoProfile652
    BiliClient.prefs.v652cloneAutoProfile652 = !current
    AppToast.show(this, "Clone Auto Profile652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CloseAutoSave652Toggle() {
    val current = BiliClient.prefs.v652closeAutoSave652
    BiliClient.prefs.v652closeAutoSave652 = !current
    AppToast.show(this, "Close Auto Save652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652ClusterAutoGroup652Toggle() {
    val current = BiliClient.prefs.v652clusterAutoGroup652
    BiliClient.prefs.v652clusterAutoGroup652 = !current
    AppToast.show(this, "Cluster Auto Group652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CodeAutoHighlight652Toggle() {
    val current = BiliClient.prefs.v652codeAutoHighlight652
    BiliClient.prefs.v652codeAutoHighlight652 = !current
    AppToast.show(this, "Code Auto Highlight652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CollapseAutoFold652Toggle() {
    val current = BiliClient.prefs.v652collapseAutoFold652
    BiliClient.prefs.v652collapseAutoFold652 = !current
    AppToast.show(this, "Collapse Auto Fold652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652ColumnAutoResize652Toggle() {
    val current = BiliClient.prefs.v652columnAutoResize652
    BiliClient.prefs.v652columnAutoResize652 = !current
    AppToast.show(this, "Column Auto Resize652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CombineAutoMerge652Toggle() {
    val current = BiliClient.prefs.v652combineAutoMerge652
    BiliClient.prefs.v652combineAutoMerge652 = !current
    AppToast.show(this, "Combine Auto Merge652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CommandAutoExec652Toggle() {
    val current = BiliClient.prefs.v652commandAutoExec652
    BiliClient.prefs.v652commandAutoExec652 = !current
    AppToast.show(this, "Command Auto Exec652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CommitAutoPush652Toggle() {
    val current = BiliClient.prefs.v652commitAutoPush652
    BiliClient.prefs.v652commitAutoPush652 = !current
    AppToast.show(this, "Commit Auto Push652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652CompareAutoDiff652Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v652compareAutoDiff652).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff652",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v652compareAutoDiff652 = value
        AppToast.show(this, "Compare Auto Diff652: $value")
    }
}

internal fun PlayerActivity.showV652CompileAutoBuild652Toggle() {
    val current = BiliClient.prefs.v652compileAutoBuild652
    BiliClient.prefs.v652compileAutoBuild652 = !current
    AppToast.show(this, "Compile Auto Build652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652ComponentAutoLoad652Toggle() {
    val current = BiliClient.prefs.v652componentAutoLoad652
    BiliClient.prefs.v652componentAutoLoad652 = !current
    AppToast.show(this, "Component Auto Load652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652ComputeAutoCalc652Toggle() {
    val current = BiliClient.prefs.v652computeAutoCalc652
    BiliClient.prefs.v652computeAutoCalc652 = !current
    AppToast.show(this, "Compute Auto Calc652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652ConcatAutoJoin652Toggle() {
    val current = BiliClient.prefs.v652concatAutoJoin652
    BiliClient.prefs.v652concatAutoJoin652 = !current
    AppToast.show(this, "Concat Auto Join652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV652ConditionAutoEval652Toggle() {
    val current = BiliClient.prefs.v652conditionAutoEval652
    BiliClient.prefs.v652conditionAutoEval652 = !current
    AppToast.show(this, "Condition Auto Eval652: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CloneAutoProfile653Toggle() {
    val current = BiliClient.prefs.v653cloneAutoProfile653
    BiliClient.prefs.v653cloneAutoProfile653 = !current
    AppToast.show(this, "Clone Auto Profile653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CloseAutoSave653Toggle() {
    val current = BiliClient.prefs.v653closeAutoSave653
    BiliClient.prefs.v653closeAutoSave653 = !current
    AppToast.show(this, "Close Auto Save653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653ClusterAutoGroup653Toggle() {
    val current = BiliClient.prefs.v653clusterAutoGroup653
    BiliClient.prefs.v653clusterAutoGroup653 = !current
    AppToast.show(this, "Cluster Auto Group653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CodeAutoHighlight653Toggle() {
    val current = BiliClient.prefs.v653codeAutoHighlight653
    BiliClient.prefs.v653codeAutoHighlight653 = !current
    AppToast.show(this, "Code Auto Highlight653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CollapseAutoFold653Toggle() {
    val current = BiliClient.prefs.v653collapseAutoFold653
    BiliClient.prefs.v653collapseAutoFold653 = !current
    AppToast.show(this, "Collapse Auto Fold653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653ColumnAutoResize653Toggle() {
    val current = BiliClient.prefs.v653columnAutoResize653
    BiliClient.prefs.v653columnAutoResize653 = !current
    AppToast.show(this, "Column Auto Resize653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CombineAutoMerge653Toggle() {
    val current = BiliClient.prefs.v653combineAutoMerge653
    BiliClient.prefs.v653combineAutoMerge653 = !current
    AppToast.show(this, "Combine Auto Merge653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CommandAutoExec653Toggle() {
    val current = BiliClient.prefs.v653commandAutoExec653
    BiliClient.prefs.v653commandAutoExec653 = !current
    AppToast.show(this, "Command Auto Exec653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CommitAutoPush653Toggle() {
    val current = BiliClient.prefs.v653commitAutoPush653
    BiliClient.prefs.v653commitAutoPush653 = !current
    AppToast.show(this, "Commit Auto Push653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653CompareAutoDiff653Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v653compareAutoDiff653).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff653",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v653compareAutoDiff653 = value
        AppToast.show(this, "Compare Auto Diff653: $value")
    }
}

internal fun PlayerActivity.showV653CompileAutoBuild653Toggle() {
    val current = BiliClient.prefs.v653compileAutoBuild653
    BiliClient.prefs.v653compileAutoBuild653 = !current
    AppToast.show(this, "Compile Auto Build653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653ComponentAutoLoad653Toggle() {
    val current = BiliClient.prefs.v653componentAutoLoad653
    BiliClient.prefs.v653componentAutoLoad653 = !current
    AppToast.show(this, "Component Auto Load653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653ComputeAutoCalc653Toggle() {
    val current = BiliClient.prefs.v653computeAutoCalc653
    BiliClient.prefs.v653computeAutoCalc653 = !current
    AppToast.show(this, "Compute Auto Calc653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653ConcatAutoJoin653Toggle() {
    val current = BiliClient.prefs.v653concatAutoJoin653
    BiliClient.prefs.v653concatAutoJoin653 = !current
    AppToast.show(this, "Concat Auto Join653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV653ConditionAutoEval653Toggle() {
    val current = BiliClient.prefs.v653conditionAutoEval653
    BiliClient.prefs.v653conditionAutoEval653 = !current
    AppToast.show(this, "Condition Auto Eval653: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CloneAutoProfile654Toggle() {
    val current = BiliClient.prefs.v654cloneAutoProfile654
    BiliClient.prefs.v654cloneAutoProfile654 = !current
    AppToast.show(this, "Clone Auto Profile654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CloseAutoSave654Toggle() {
    val current = BiliClient.prefs.v654closeAutoSave654
    BiliClient.prefs.v654closeAutoSave654 = !current
    AppToast.show(this, "Close Auto Save654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654ClusterAutoGroup654Toggle() {
    val current = BiliClient.prefs.v654clusterAutoGroup654
    BiliClient.prefs.v654clusterAutoGroup654 = !current
    AppToast.show(this, "Cluster Auto Group654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CodeAutoHighlight654Toggle() {
    val current = BiliClient.prefs.v654codeAutoHighlight654
    BiliClient.prefs.v654codeAutoHighlight654 = !current
    AppToast.show(this, "Code Auto Highlight654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CollapseAutoFold654Toggle() {
    val current = BiliClient.prefs.v654collapseAutoFold654
    BiliClient.prefs.v654collapseAutoFold654 = !current
    AppToast.show(this, "Collapse Auto Fold654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654ColumnAutoResize654Toggle() {
    val current = BiliClient.prefs.v654columnAutoResize654
    BiliClient.prefs.v654columnAutoResize654 = !current
    AppToast.show(this, "Column Auto Resize654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CombineAutoMerge654Toggle() {
    val current = BiliClient.prefs.v654combineAutoMerge654
    BiliClient.prefs.v654combineAutoMerge654 = !current
    AppToast.show(this, "Combine Auto Merge654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CommandAutoExec654Toggle() {
    val current = BiliClient.prefs.v654commandAutoExec654
    BiliClient.prefs.v654commandAutoExec654 = !current
    AppToast.show(this, "Command Auto Exec654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CommitAutoPush654Toggle() {
    val current = BiliClient.prefs.v654commitAutoPush654
    BiliClient.prefs.v654commitAutoPush654 = !current
    AppToast.show(this, "Commit Auto Push654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654CompareAutoDiff654Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v654compareAutoDiff654).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff654",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v654compareAutoDiff654 = value
        AppToast.show(this, "Compare Auto Diff654: $value")
    }
}

internal fun PlayerActivity.showV654CompileAutoBuild654Toggle() {
    val current = BiliClient.prefs.v654compileAutoBuild654
    BiliClient.prefs.v654compileAutoBuild654 = !current
    AppToast.show(this, "Compile Auto Build654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654ComponentAutoLoad654Toggle() {
    val current = BiliClient.prefs.v654componentAutoLoad654
    BiliClient.prefs.v654componentAutoLoad654 = !current
    AppToast.show(this, "Component Auto Load654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654ComputeAutoCalc654Toggle() {
    val current = BiliClient.prefs.v654computeAutoCalc654
    BiliClient.prefs.v654computeAutoCalc654 = !current
    AppToast.show(this, "Compute Auto Calc654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654ConcatAutoJoin654Toggle() {
    val current = BiliClient.prefs.v654concatAutoJoin654
    BiliClient.prefs.v654concatAutoJoin654 = !current
    AppToast.show(this, "Concat Auto Join654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV654ConditionAutoEval654Toggle() {
    val current = BiliClient.prefs.v654conditionAutoEval654
    BiliClient.prefs.v654conditionAutoEval654 = !current
    AppToast.show(this, "Condition Auto Eval654: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CloneAutoProfile655Toggle() {
    val current = BiliClient.prefs.v655cloneAutoProfile655
    BiliClient.prefs.v655cloneAutoProfile655 = !current
    AppToast.show(this, "Clone Auto Profile655: ${if (!current) "ON" else "OFF"}")
}

