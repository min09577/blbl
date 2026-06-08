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

// v791: Length Auto Limit791
internal fun PlayerActivity.showV791LengthAutoLimit791Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v791lengthAutoLimit791).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit791",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v791lengthAutoLimit791 = value
        AppToast.show(this, "Length Auto Limit791: $value")
    }
}

// v791: Level Auto Tier791
internal fun PlayerActivity.showV791LevelAutoTier791Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v791levelAutoTier791).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier791",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v791levelAutoTier791 = value
        AppToast.show(this, "Level Auto Tier791: $value")
    }
}

// v791: Library Auto Import791
internal fun PlayerActivity.showV791LibraryAutoImport791Toggle() {
    val current = BiliClient.prefs.v791libraryAutoImport791
    BiliClient.prefs.v791libraryAutoImport791 = !current
    AppToast.show(this, "Library Auto Import791: ${if (!current) "ON" else "OFF"}")
}

// v791: License Auto Verify791
internal fun PlayerActivity.showV791LicenseAutoVerify791Toggle() {
    val current = BiliClient.prefs.v791licenseAutoVerify791
    BiliClient.prefs.v791licenseAutoVerify791 = !current
    AppToast.show(this, "License Auto Verify791: ${if (!current) "ON" else "OFF"}")
}

// v791: Life Auto Cycle791
internal fun PlayerActivity.showV791LifeAutoCycle791Toggle() {
    val current = BiliClient.prefs.v791lifeAutoCycle791
    BiliClient.prefs.v791lifeAutoCycle791 = !current
    AppToast.show(this, "Life Auto Cycle791: ${if (!current) "ON" else "OFF"}")
}

// v791: Lifetime Auto Manage791
internal fun PlayerActivity.showV791LifetimeAutoManage791Toggle() {
    val current = BiliClient.prefs.v791lifetimeAutoManage791
    BiliClient.prefs.v791lifetimeAutoManage791 = !current
    AppToast.show(this, "Lifetime Auto Manage791: ${if (!current) "ON" else "OFF"}")
}

// v791: Light Auto Theme791
internal fun PlayerActivity.showV791LightAutoTheme791Toggle() {
    val current = BiliClient.prefs.v791lightAutoTheme791
    BiliClient.prefs.v791lightAutoTheme791 = !current
    AppToast.show(this, "Light Auto Theme791: ${if (!current) "ON" else "OFF"}")
}

// v791: Limit Auto Rate791
internal fun PlayerActivity.showV791LimitAutoRate791Toggle() {
    val current = BiliClient.prefs.v791limitAutoRate791
    BiliClient.prefs.v791limitAutoRate791 = !current
    AppToast.show(this, "Limit Auto Rate791: ${if (!current) "ON" else "OFF"}")
}

// v791: Line Auto Wrap791
internal fun PlayerActivity.showV791LineAutoWrap791Toggle() {
    val current = BiliClient.prefs.v791lineAutoWrap791
    BiliClient.prefs.v791lineAutoWrap791 = !current
    AppToast.show(this, "Line Auto Wrap791: ${if (!current) "ON" else "OFF"}")
}

// v791: Link Auto Preview791
internal fun PlayerActivity.showV791LinkAutoPreview791Toggle() {
    val current = BiliClient.prefs.v791linkAutoPreview791
    BiliClient.prefs.v791linkAutoPreview791 = !current
    AppToast.show(this, "Link Auto Preview791: ${if (!current) "ON" else "OFF"}")
}

// v791: List Auto Virtualize791
internal fun PlayerActivity.showV791ListAutoVirtualize791Toggle() {
    val current = BiliClient.prefs.v791listAutoVirtualize791
    BiliClient.prefs.v791listAutoVirtualize791 = !current
    AppToast.show(this, "List Auto Virtualize791: ${if (!current) "ON" else "OFF"}")
}

// v791: Live Auto Reconnect791
internal fun PlayerActivity.showV791LiveAutoReconnect791Toggle() {
    val current = BiliClient.prefs.v791liveAutoReconnect791
    BiliClient.prefs.v791liveAutoReconnect791 = !current
    AppToast.show(this, "Live Auto Reconnect791: ${if (!current) "ON" else "OFF"}")
}

// v791: Load Auto Balance791
internal fun PlayerActivity.showV791LoadAutoBalance791Toggle() {
    val current = BiliClient.prefs.v791loadAutoBalance791
    BiliClient.prefs.v791loadAutoBalance791 = !current
    AppToast.show(this, "Load Auto Balance791: ${if (!current) "ON" else "OFF"}")
}

// v791: Local Auto Cache791
internal fun PlayerActivity.showV791LocalAutoCache791Toggle() {
    val current = BiliClient.prefs.v791localAutoCache791
    BiliClient.prefs.v791localAutoCache791 = !current
    AppToast.show(this, "Local Auto Cache791: ${if (!current) "ON" else "OFF"}")
}

// v791: Lock Auto Screen791
internal fun PlayerActivity.showV791LockAutoScreen791Toggle() {
    val current = BiliClient.prefs.v791lockAutoScreen791
    BiliClient.prefs.v791lockAutoScreen791 = !current
    AppToast.show(this, "Lock Auto Screen791: ${if (!current) "ON" else "OFF"}")
}

// v792: Length Auto Limit792
internal fun PlayerActivity.showV792LengthAutoLimit792Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v792lengthAutoLimit792).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit792",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v792lengthAutoLimit792 = value
        AppToast.show(this, "Length Auto Limit792: $value")
    }
}

// v792: Level Auto Tier792
internal fun PlayerActivity.showV792LevelAutoTier792Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v792levelAutoTier792).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier792",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v792levelAutoTier792 = value
        AppToast.show(this, "Level Auto Tier792: $value")
    }
}

// v792: Library Auto Import792
internal fun PlayerActivity.showV792LibraryAutoImport792Toggle() {
    val current = BiliClient.prefs.v792libraryAutoImport792
    BiliClient.prefs.v792libraryAutoImport792 = !current
    AppToast.show(this, "Library Auto Import792: ${if (!current) "ON" else "OFF"}")
}

// v792: License Auto Verify792
internal fun PlayerActivity.showV792LicenseAutoVerify792Toggle() {
    val current = BiliClient.prefs.v792licenseAutoVerify792
    BiliClient.prefs.v792licenseAutoVerify792 = !current
    AppToast.show(this, "License Auto Verify792: ${if (!current) "ON" else "OFF"}")
}

// v792: Life Auto Cycle792
internal fun PlayerActivity.showV792LifeAutoCycle792Toggle() {
    val current = BiliClient.prefs.v792lifeAutoCycle792
    BiliClient.prefs.v792lifeAutoCycle792 = !current
    AppToast.show(this, "Life Auto Cycle792: ${if (!current) "ON" else "OFF"}")
}

// v792: Lifetime Auto Manage792
internal fun PlayerActivity.showV792LifetimeAutoManage792Toggle() {
    val current = BiliClient.prefs.v792lifetimeAutoManage792
    BiliClient.prefs.v792lifetimeAutoManage792 = !current
    AppToast.show(this, "Lifetime Auto Manage792: ${if (!current) "ON" else "OFF"}")
}

// v792: Light Auto Theme792
internal fun PlayerActivity.showV792LightAutoTheme792Toggle() {
    val current = BiliClient.prefs.v792lightAutoTheme792
    BiliClient.prefs.v792lightAutoTheme792 = !current
    AppToast.show(this, "Light Auto Theme792: ${if (!current) "ON" else "OFF"}")
}

// v792: Limit Auto Rate792
internal fun PlayerActivity.showV792LimitAutoRate792Toggle() {
    val current = BiliClient.prefs.v792limitAutoRate792
    BiliClient.prefs.v792limitAutoRate792 = !current
    AppToast.show(this, "Limit Auto Rate792: ${if (!current) "ON" else "OFF"}")
}

// v792: Line Auto Wrap792
internal fun PlayerActivity.showV792LineAutoWrap792Toggle() {
    val current = BiliClient.prefs.v792lineAutoWrap792
    BiliClient.prefs.v792lineAutoWrap792 = !current
    AppToast.show(this, "Line Auto Wrap792: ${if (!current) "ON" else "OFF"}")
}

// v792: Link Auto Preview792
internal fun PlayerActivity.showV792LinkAutoPreview792Toggle() {
    val current = BiliClient.prefs.v792linkAutoPreview792
    BiliClient.prefs.v792linkAutoPreview792 = !current
    AppToast.show(this, "Link Auto Preview792: ${if (!current) "ON" else "OFF"}")
}

// v792: List Auto Virtualize792
internal fun PlayerActivity.showV792ListAutoVirtualize792Toggle() {
    val current = BiliClient.prefs.v792listAutoVirtualize792
    BiliClient.prefs.v792listAutoVirtualize792 = !current
    AppToast.show(this, "List Auto Virtualize792: ${if (!current) "ON" else "OFF"}")
}

// v792: Live Auto Reconnect792
internal fun PlayerActivity.showV792LiveAutoReconnect792Toggle() {
    val current = BiliClient.prefs.v792liveAutoReconnect792
    BiliClient.prefs.v792liveAutoReconnect792 = !current
    AppToast.show(this, "Live Auto Reconnect792: ${if (!current) "ON" else "OFF"}")
}

// v792: Load Auto Balance792
internal fun PlayerActivity.showV792LoadAutoBalance792Toggle() {
    val current = BiliClient.prefs.v792loadAutoBalance792
    BiliClient.prefs.v792loadAutoBalance792 = !current
    AppToast.show(this, "Load Auto Balance792: ${if (!current) "ON" else "OFF"}")
}

// v792: Local Auto Cache792
internal fun PlayerActivity.showV792LocalAutoCache792Toggle() {
    val current = BiliClient.prefs.v792localAutoCache792
    BiliClient.prefs.v792localAutoCache792 = !current
    AppToast.show(this, "Local Auto Cache792: ${if (!current) "ON" else "OFF"}")
}

// v792: Lock Auto Screen792
internal fun PlayerActivity.showV792LockAutoScreen792Toggle() {
    val current = BiliClient.prefs.v792lockAutoScreen792
    BiliClient.prefs.v792lockAutoScreen792 = !current
    AppToast.show(this, "Lock Auto Screen792: ${if (!current) "ON" else "OFF"}")
}

// v793: Length Auto Limit793
internal fun PlayerActivity.showV793LengthAutoLimit793Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v793lengthAutoLimit793).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit793",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v793lengthAutoLimit793 = value
        AppToast.show(this, "Length Auto Limit793: $value")
    }
}

// v793: Level Auto Tier793
internal fun PlayerActivity.showV793LevelAutoTier793Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v793levelAutoTier793).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier793",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v793levelAutoTier793 = value
        AppToast.show(this, "Level Auto Tier793: $value")
    }
}

// v793: Library Auto Import793
internal fun PlayerActivity.showV793LibraryAutoImport793Toggle() {
    val current = BiliClient.prefs.v793libraryAutoImport793
    BiliClient.prefs.v793libraryAutoImport793 = !current
    AppToast.show(this, "Library Auto Import793: ${if (!current) "ON" else "OFF"}")
}

// v793: License Auto Verify793
internal fun PlayerActivity.showV793LicenseAutoVerify793Toggle() {
    val current = BiliClient.prefs.v793licenseAutoVerify793
    BiliClient.prefs.v793licenseAutoVerify793 = !current
    AppToast.show(this, "License Auto Verify793: ${if (!current) "ON" else "OFF"}")
}

// v793: Life Auto Cycle793
internal fun PlayerActivity.showV793LifeAutoCycle793Toggle() {
    val current = BiliClient.prefs.v793lifeAutoCycle793
    BiliClient.prefs.v793lifeAutoCycle793 = !current
    AppToast.show(this, "Life Auto Cycle793: ${if (!current) "ON" else "OFF"}")
}

// v793: Lifetime Auto Manage793
internal fun PlayerActivity.showV793LifetimeAutoManage793Toggle() {
    val current = BiliClient.prefs.v793lifetimeAutoManage793
    BiliClient.prefs.v793lifetimeAutoManage793 = !current
    AppToast.show(this, "Lifetime Auto Manage793: ${if (!current) "ON" else "OFF"}")
}

// v793: Light Auto Theme793
internal fun PlayerActivity.showV793LightAutoTheme793Toggle() {
    val current = BiliClient.prefs.v793lightAutoTheme793
    BiliClient.prefs.v793lightAutoTheme793 = !current
    AppToast.show(this, "Light Auto Theme793: ${if (!current) "ON" else "OFF"}")
}

// v793: Limit Auto Rate793
internal fun PlayerActivity.showV793LimitAutoRate793Toggle() {
    val current = BiliClient.prefs.v793limitAutoRate793
    BiliClient.prefs.v793limitAutoRate793 = !current
    AppToast.show(this, "Limit Auto Rate793: ${if (!current) "ON" else "OFF"}")
}

// v793: Line Auto Wrap793
internal fun PlayerActivity.showV793LineAutoWrap793Toggle() {
    val current = BiliClient.prefs.v793lineAutoWrap793
    BiliClient.prefs.v793lineAutoWrap793 = !current
    AppToast.show(this, "Line Auto Wrap793: ${if (!current) "ON" else "OFF"}")
}

// v793: Link Auto Preview793
internal fun PlayerActivity.showV793LinkAutoPreview793Toggle() {
    val current = BiliClient.prefs.v793linkAutoPreview793
    BiliClient.prefs.v793linkAutoPreview793 = !current
    AppToast.show(this, "Link Auto Preview793: ${if (!current) "ON" else "OFF"}")
}

// v793: List Auto Virtualize793
internal fun PlayerActivity.showV793ListAutoVirtualize793Toggle() {
    val current = BiliClient.prefs.v793listAutoVirtualize793
    BiliClient.prefs.v793listAutoVirtualize793 = !current
    AppToast.show(this, "List Auto Virtualize793: ${if (!current) "ON" else "OFF"}")
}

// v793: Live Auto Reconnect793
internal fun PlayerActivity.showV793LiveAutoReconnect793Toggle() {
    val current = BiliClient.prefs.v793liveAutoReconnect793
    BiliClient.prefs.v793liveAutoReconnect793 = !current
    AppToast.show(this, "Live Auto Reconnect793: ${if (!current) "ON" else "OFF"}")
}

// v793: Load Auto Balance793
internal fun PlayerActivity.showV793LoadAutoBalance793Toggle() {
    val current = BiliClient.prefs.v793loadAutoBalance793
    BiliClient.prefs.v793loadAutoBalance793 = !current
    AppToast.show(this, "Load Auto Balance793: ${if (!current) "ON" else "OFF"}")
}

// v793: Local Auto Cache793
internal fun PlayerActivity.showV793LocalAutoCache793Toggle() {
    val current = BiliClient.prefs.v793localAutoCache793
    BiliClient.prefs.v793localAutoCache793 = !current
    AppToast.show(this, "Local Auto Cache793: ${if (!current) "ON" else "OFF"}")
}

// v793: Lock Auto Screen793
internal fun PlayerActivity.showV793LockAutoScreen793Toggle() {
    val current = BiliClient.prefs.v793lockAutoScreen793
    BiliClient.prefs.v793lockAutoScreen793 = !current
    AppToast.show(this, "Lock Auto Screen793: ${if (!current) "ON" else "OFF"}")
}

// v794: Length Auto Limit794
internal fun PlayerActivity.showV794LengthAutoLimit794Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v794lengthAutoLimit794).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit794",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v794lengthAutoLimit794 = value
        AppToast.show(this, "Length Auto Limit794: $value")
    }
}

// v794: Level Auto Tier794
internal fun PlayerActivity.showV794LevelAutoTier794Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v794levelAutoTier794).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier794",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v794levelAutoTier794 = value
        AppToast.show(this, "Level Auto Tier794: $value")
    }
}

// v794: Library Auto Import794
internal fun PlayerActivity.showV794LibraryAutoImport794Toggle() {
    val current = BiliClient.prefs.v794libraryAutoImport794
    BiliClient.prefs.v794libraryAutoImport794 = !current
    AppToast.show(this, "Library Auto Import794: ${if (!current) "ON" else "OFF"}")
}

// v794: License Auto Verify794
internal fun PlayerActivity.showV794LicenseAutoVerify794Toggle() {
    val current = BiliClient.prefs.v794licenseAutoVerify794
    BiliClient.prefs.v794licenseAutoVerify794 = !current
    AppToast.show(this, "License Auto Verify794: ${if (!current) "ON" else "OFF"}")
}

// v794: Life Auto Cycle794
internal fun PlayerActivity.showV794LifeAutoCycle794Toggle() {
    val current = BiliClient.prefs.v794lifeAutoCycle794
    BiliClient.prefs.v794lifeAutoCycle794 = !current
    AppToast.show(this, "Life Auto Cycle794: ${if (!current) "ON" else "OFF"}")
}

// v794: Lifetime Auto Manage794
internal fun PlayerActivity.showV794LifetimeAutoManage794Toggle() {
    val current = BiliClient.prefs.v794lifetimeAutoManage794
    BiliClient.prefs.v794lifetimeAutoManage794 = !current
    AppToast.show(this, "Lifetime Auto Manage794: ${if (!current) "ON" else "OFF"}")
}

// v794: Light Auto Theme794
internal fun PlayerActivity.showV794LightAutoTheme794Toggle() {
    val current = BiliClient.prefs.v794lightAutoTheme794
    BiliClient.prefs.v794lightAutoTheme794 = !current
    AppToast.show(this, "Light Auto Theme794: ${if (!current) "ON" else "OFF"}")
}

// v794: Limit Auto Rate794
internal fun PlayerActivity.showV794LimitAutoRate794Toggle() {
    val current = BiliClient.prefs.v794limitAutoRate794
    BiliClient.prefs.v794limitAutoRate794 = !current
    AppToast.show(this, "Limit Auto Rate794: ${if (!current) "ON" else "OFF"}")
}

// v794: Line Auto Wrap794
internal fun PlayerActivity.showV794LineAutoWrap794Toggle() {
    val current = BiliClient.prefs.v794lineAutoWrap794
    BiliClient.prefs.v794lineAutoWrap794 = !current
    AppToast.show(this, "Line Auto Wrap794: ${if (!current) "ON" else "OFF"}")
}

// v794: Link Auto Preview794
internal fun PlayerActivity.showV794LinkAutoPreview794Toggle() {
    val current = BiliClient.prefs.v794linkAutoPreview794
    BiliClient.prefs.v794linkAutoPreview794 = !current
    AppToast.show(this, "Link Auto Preview794: ${if (!current) "ON" else "OFF"}")
}

// v794: List Auto Virtualize794
internal fun PlayerActivity.showV794ListAutoVirtualize794Toggle() {
    val current = BiliClient.prefs.v794listAutoVirtualize794
    BiliClient.prefs.v794listAutoVirtualize794 = !current
    AppToast.show(this, "List Auto Virtualize794: ${if (!current) "ON" else "OFF"}")
}

// v794: Live Auto Reconnect794
internal fun PlayerActivity.showV794LiveAutoReconnect794Toggle() {
    val current = BiliClient.prefs.v794liveAutoReconnect794
    BiliClient.prefs.v794liveAutoReconnect794 = !current
    AppToast.show(this, "Live Auto Reconnect794: ${if (!current) "ON" else "OFF"}")
}

// v794: Load Auto Balance794
internal fun PlayerActivity.showV794LoadAutoBalance794Toggle() {
    val current = BiliClient.prefs.v794loadAutoBalance794
    BiliClient.prefs.v794loadAutoBalance794 = !current
    AppToast.show(this, "Load Auto Balance794: ${if (!current) "ON" else "OFF"}")
}

// v794: Local Auto Cache794
internal fun PlayerActivity.showV794LocalAutoCache794Toggle() {
    val current = BiliClient.prefs.v794localAutoCache794
    BiliClient.prefs.v794localAutoCache794 = !current
    AppToast.show(this, "Local Auto Cache794: ${if (!current) "ON" else "OFF"}")
}

// v794: Lock Auto Screen794
internal fun PlayerActivity.showV794LockAutoScreen794Toggle() {
    val current = BiliClient.prefs.v794lockAutoScreen794
    BiliClient.prefs.v794lockAutoScreen794 = !current
    AppToast.show(this, "Lock Auto Screen794: ${if (!current) "ON" else "OFF"}")
}

// v795: Length Auto Limit795
internal fun PlayerActivity.showV795LengthAutoLimit795Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v795lengthAutoLimit795).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit795",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v795lengthAutoLimit795 = value
        AppToast.show(this, "Length Auto Limit795: $value")
    }
}

// v795: Level Auto Tier795
internal fun PlayerActivity.showV795LevelAutoTier795Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v795levelAutoTier795).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier795",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v795levelAutoTier795 = value
        AppToast.show(this, "Level Auto Tier795: $value")
    }
}

// v795: Library Auto Import795
internal fun PlayerActivity.showV795LibraryAutoImport795Toggle() {
    val current = BiliClient.prefs.v795libraryAutoImport795
    BiliClient.prefs.v795libraryAutoImport795 = !current
    AppToast.show(this, "Library Auto Import795: ${if (!current) "ON" else "OFF"}")
}

// v795: License Auto Verify795
internal fun PlayerActivity.showV795LicenseAutoVerify795Toggle() {
    val current = BiliClient.prefs.v795licenseAutoVerify795
    BiliClient.prefs.v795licenseAutoVerify795 = !current
    AppToast.show(this, "License Auto Verify795: ${if (!current) "ON" else "OFF"}")
}

// v795: Life Auto Cycle795
internal fun PlayerActivity.showV795LifeAutoCycle795Toggle() {
    val current = BiliClient.prefs.v795lifeAutoCycle795
    BiliClient.prefs.v795lifeAutoCycle795 = !current
    AppToast.show(this, "Life Auto Cycle795: ${if (!current) "ON" else "OFF"}")
}

// v795: Lifetime Auto Manage795
internal fun PlayerActivity.showV795LifetimeAutoManage795Toggle() {
    val current = BiliClient.prefs.v795lifetimeAutoManage795
    BiliClient.prefs.v795lifetimeAutoManage795 = !current
    AppToast.show(this, "Lifetime Auto Manage795: ${if (!current) "ON" else "OFF"}")
}

// v795: Light Auto Theme795
internal fun PlayerActivity.showV795LightAutoTheme795Toggle() {
    val current = BiliClient.prefs.v795lightAutoTheme795
    BiliClient.prefs.v795lightAutoTheme795 = !current
    AppToast.show(this, "Light Auto Theme795: ${if (!current) "ON" else "OFF"}")
}

// v795: Limit Auto Rate795
internal fun PlayerActivity.showV795LimitAutoRate795Toggle() {
    val current = BiliClient.prefs.v795limitAutoRate795
    BiliClient.prefs.v795limitAutoRate795 = !current
    AppToast.show(this, "Limit Auto Rate795: ${if (!current) "ON" else "OFF"}")
}

// v795: Line Auto Wrap795
internal fun PlayerActivity.showV795LineAutoWrap795Toggle() {
    val current = BiliClient.prefs.v795lineAutoWrap795
    BiliClient.prefs.v795lineAutoWrap795 = !current
    AppToast.show(this, "Line Auto Wrap795: ${if (!current) "ON" else "OFF"}")
}

// v795: Link Auto Preview795
internal fun PlayerActivity.showV795LinkAutoPreview795Toggle() {
    val current = BiliClient.prefs.v795linkAutoPreview795
    BiliClient.prefs.v795linkAutoPreview795 = !current
    AppToast.show(this, "Link Auto Preview795: ${if (!current) "ON" else "OFF"}")
}

// v795: List Auto Virtualize795
internal fun PlayerActivity.showV795ListAutoVirtualize795Toggle() {
    val current = BiliClient.prefs.v795listAutoVirtualize795
    BiliClient.prefs.v795listAutoVirtualize795 = !current
    AppToast.show(this, "List Auto Virtualize795: ${if (!current) "ON" else "OFF"}")
}

// v795: Live Auto Reconnect795
internal fun PlayerActivity.showV795LiveAutoReconnect795Toggle() {
    val current = BiliClient.prefs.v795liveAutoReconnect795
    BiliClient.prefs.v795liveAutoReconnect795 = !current
    AppToast.show(this, "Live Auto Reconnect795: ${if (!current) "ON" else "OFF"}")
}

// v795: Load Auto Balance795
internal fun PlayerActivity.showV795LoadAutoBalance795Toggle() {
    val current = BiliClient.prefs.v795loadAutoBalance795
    BiliClient.prefs.v795loadAutoBalance795 = !current
    AppToast.show(this, "Load Auto Balance795: ${if (!current) "ON" else "OFF"}")
}

// v795: Local Auto Cache795
internal fun PlayerActivity.showV795LocalAutoCache795Toggle() {
    val current = BiliClient.prefs.v795localAutoCache795
    BiliClient.prefs.v795localAutoCache795 = !current
    AppToast.show(this, "Local Auto Cache795: ${if (!current) "ON" else "OFF"}")
}

// v795: Lock Auto Screen795
internal fun PlayerActivity.showV795LockAutoScreen795Toggle() {
    val current = BiliClient.prefs.v795lockAutoScreen795
    BiliClient.prefs.v795lockAutoScreen795 = !current
    AppToast.show(this, "Lock Auto Screen795: ${if (!current) "ON" else "OFF"}")
}

// v796: Length Auto Limit796
internal fun PlayerActivity.showV796LengthAutoLimit796Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v796lengthAutoLimit796).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit796",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v796lengthAutoLimit796 = value
        AppToast.show(this, "Length Auto Limit796: $value")
    }
}

// v796: Level Auto Tier796
internal fun PlayerActivity.showV796LevelAutoTier796Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v796levelAutoTier796).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier796",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v796levelAutoTier796 = value
        AppToast.show(this, "Level Auto Tier796: $value")
    }
}

// v796: Library Auto Import796
internal fun PlayerActivity.showV796LibraryAutoImport796Toggle() {
    val current = BiliClient.prefs.v796libraryAutoImport796
    BiliClient.prefs.v796libraryAutoImport796 = !current
    AppToast.show(this, "Library Auto Import796: ${if (!current) "ON" else "OFF"}")
}

// v796: License Auto Verify796
internal fun PlayerActivity.showV796LicenseAutoVerify796Toggle() {
    val current = BiliClient.prefs.v796licenseAutoVerify796
    BiliClient.prefs.v796licenseAutoVerify796 = !current
    AppToast.show(this, "License Auto Verify796: ${if (!current) "ON" else "OFF"}")
}

// v796: Life Auto Cycle796
internal fun PlayerActivity.showV796LifeAutoCycle796Toggle() {
    val current = BiliClient.prefs.v796lifeAutoCycle796
    BiliClient.prefs.v796lifeAutoCycle796 = !current
    AppToast.show(this, "Life Auto Cycle796: ${if (!current) "ON" else "OFF"}")
}

// v796: Lifetime Auto Manage796
internal fun PlayerActivity.showV796LifetimeAutoManage796Toggle() {
    val current = BiliClient.prefs.v796lifetimeAutoManage796
    BiliClient.prefs.v796lifetimeAutoManage796 = !current
    AppToast.show(this, "Lifetime Auto Manage796: ${if (!current) "ON" else "OFF"}")
}

// v796: Light Auto Theme796
internal fun PlayerActivity.showV796LightAutoTheme796Toggle() {
    val current = BiliClient.prefs.v796lightAutoTheme796
    BiliClient.prefs.v796lightAutoTheme796 = !current
    AppToast.show(this, "Light Auto Theme796: ${if (!current) "ON" else "OFF"}")
}

// v796: Limit Auto Rate796
internal fun PlayerActivity.showV796LimitAutoRate796Toggle() {
    val current = BiliClient.prefs.v796limitAutoRate796
    BiliClient.prefs.v796limitAutoRate796 = !current
    AppToast.show(this, "Limit Auto Rate796: ${if (!current) "ON" else "OFF"}")
}

// v796: Line Auto Wrap796
internal fun PlayerActivity.showV796LineAutoWrap796Toggle() {
    val current = BiliClient.prefs.v796lineAutoWrap796
    BiliClient.prefs.v796lineAutoWrap796 = !current
    AppToast.show(this, "Line Auto Wrap796: ${if (!current) "ON" else "OFF"}")
}

// v796: Link Auto Preview796
internal fun PlayerActivity.showV796LinkAutoPreview796Toggle() {
    val current = BiliClient.prefs.v796linkAutoPreview796
    BiliClient.prefs.v796linkAutoPreview796 = !current
    AppToast.show(this, "Link Auto Preview796: ${if (!current) "ON" else "OFF"}")
}

// v796: List Auto Virtualize796
internal fun PlayerActivity.showV796ListAutoVirtualize796Toggle() {
    val current = BiliClient.prefs.v796listAutoVirtualize796
    BiliClient.prefs.v796listAutoVirtualize796 = !current
    AppToast.show(this, "List Auto Virtualize796: ${if (!current) "ON" else "OFF"}")
}

// v796: Live Auto Reconnect796
internal fun PlayerActivity.showV796LiveAutoReconnect796Toggle() {
    val current = BiliClient.prefs.v796liveAutoReconnect796
    BiliClient.prefs.v796liveAutoReconnect796 = !current
    AppToast.show(this, "Live Auto Reconnect796: ${if (!current) "ON" else "OFF"}")
}

// v796: Load Auto Balance796
internal fun PlayerActivity.showV796LoadAutoBalance796Toggle() {
    val current = BiliClient.prefs.v796loadAutoBalance796
    BiliClient.prefs.v796loadAutoBalance796 = !current
    AppToast.show(this, "Load Auto Balance796: ${if (!current) "ON" else "OFF"}")
}

// v796: Local Auto Cache796
internal fun PlayerActivity.showV796LocalAutoCache796Toggle() {
    val current = BiliClient.prefs.v796localAutoCache796
    BiliClient.prefs.v796localAutoCache796 = !current
    AppToast.show(this, "Local Auto Cache796: ${if (!current) "ON" else "OFF"}")
}

// v796: Lock Auto Screen796
internal fun PlayerActivity.showV796LockAutoScreen796Toggle() {
    val current = BiliClient.prefs.v796lockAutoScreen796
    BiliClient.prefs.v796lockAutoScreen796 = !current
    AppToast.show(this, "Lock Auto Screen796: ${if (!current) "ON" else "OFF"}")
}

// v797: Length Auto Limit797
internal fun PlayerActivity.showV797LengthAutoLimit797Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v797lengthAutoLimit797).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit797",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v797lengthAutoLimit797 = value
        AppToast.show(this, "Length Auto Limit797: $value")
    }
}

// v797: Level Auto Tier797
internal fun PlayerActivity.showV797LevelAutoTier797Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v797levelAutoTier797).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier797",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v797levelAutoTier797 = value
        AppToast.show(this, "Level Auto Tier797: $value")
    }
}

// v797: Library Auto Import797
internal fun PlayerActivity.showV797LibraryAutoImport797Toggle() {
    val current = BiliClient.prefs.v797libraryAutoImport797
    BiliClient.prefs.v797libraryAutoImport797 = !current
    AppToast.show(this, "Library Auto Import797: ${if (!current) "ON" else "OFF"}")
}

// v797: License Auto Verify797
internal fun PlayerActivity.showV797LicenseAutoVerify797Toggle() {
    val current = BiliClient.prefs.v797licenseAutoVerify797
    BiliClient.prefs.v797licenseAutoVerify797 = !current
    AppToast.show(this, "License Auto Verify797: ${if (!current) "ON" else "OFF"}")
}

// v797: Life Auto Cycle797
internal fun PlayerActivity.showV797LifeAutoCycle797Toggle() {
    val current = BiliClient.prefs.v797lifeAutoCycle797
    BiliClient.prefs.v797lifeAutoCycle797 = !current
    AppToast.show(this, "Life Auto Cycle797: ${if (!current) "ON" else "OFF"}")
}

// v797: Lifetime Auto Manage797
internal fun PlayerActivity.showV797LifetimeAutoManage797Toggle() {
    val current = BiliClient.prefs.v797lifetimeAutoManage797
    BiliClient.prefs.v797lifetimeAutoManage797 = !current
    AppToast.show(this, "Lifetime Auto Manage797: ${if (!current) "ON" else "OFF"}")
}

// v797: Light Auto Theme797
internal fun PlayerActivity.showV797LightAutoTheme797Toggle() {
    val current = BiliClient.prefs.v797lightAutoTheme797
    BiliClient.prefs.v797lightAutoTheme797 = !current
    AppToast.show(this, "Light Auto Theme797: ${if (!current) "ON" else "OFF"}")
}

// v797: Limit Auto Rate797
internal fun PlayerActivity.showV797LimitAutoRate797Toggle() {
    val current = BiliClient.prefs.v797limitAutoRate797
    BiliClient.prefs.v797limitAutoRate797 = !current
    AppToast.show(this, "Limit Auto Rate797: ${if (!current) "ON" else "OFF"}")
}

// v797: Line Auto Wrap797
internal fun PlayerActivity.showV797LineAutoWrap797Toggle() {
    val current = BiliClient.prefs.v797lineAutoWrap797
    BiliClient.prefs.v797lineAutoWrap797 = !current
    AppToast.show(this, "Line Auto Wrap797: ${if (!current) "ON" else "OFF"}")
}

// v797: Link Auto Preview797
internal fun PlayerActivity.showV797LinkAutoPreview797Toggle() {
    val current = BiliClient.prefs.v797linkAutoPreview797
    BiliClient.prefs.v797linkAutoPreview797 = !current
    AppToast.show(this, "Link Auto Preview797: ${if (!current) "ON" else "OFF"}")
}

// v797: List Auto Virtualize797
internal fun PlayerActivity.showV797ListAutoVirtualize797Toggle() {
    val current = BiliClient.prefs.v797listAutoVirtualize797
    BiliClient.prefs.v797listAutoVirtualize797 = !current
    AppToast.show(this, "List Auto Virtualize797: ${if (!current) "ON" else "OFF"}")
}

// v797: Live Auto Reconnect797
internal fun PlayerActivity.showV797LiveAutoReconnect797Toggle() {
    val current = BiliClient.prefs.v797liveAutoReconnect797
    BiliClient.prefs.v797liveAutoReconnect797 = !current
    AppToast.show(this, "Live Auto Reconnect797: ${if (!current) "ON" else "OFF"}")
}

// v797: Load Auto Balance797
internal fun PlayerActivity.showV797LoadAutoBalance797Toggle() {
    val current = BiliClient.prefs.v797loadAutoBalance797
    BiliClient.prefs.v797loadAutoBalance797 = !current
    AppToast.show(this, "Load Auto Balance797: ${if (!current) "ON" else "OFF"}")
}

// v797: Local Auto Cache797
internal fun PlayerActivity.showV797LocalAutoCache797Toggle() {
    val current = BiliClient.prefs.v797localAutoCache797
    BiliClient.prefs.v797localAutoCache797 = !current
    AppToast.show(this, "Local Auto Cache797: ${if (!current) "ON" else "OFF"}")
}

// v797: Lock Auto Screen797
internal fun PlayerActivity.showV797LockAutoScreen797Toggle() {
    val current = BiliClient.prefs.v797lockAutoScreen797
    BiliClient.prefs.v797lockAutoScreen797 = !current
    AppToast.show(this, "Lock Auto Screen797: ${if (!current) "ON" else "OFF"}")
}

// v798: Length Auto Limit798
internal fun PlayerActivity.showV798LengthAutoLimit798Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v798lengthAutoLimit798).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit798",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v798lengthAutoLimit798 = value
        AppToast.show(this, "Length Auto Limit798: $value")
    }
}

// v798: Level Auto Tier798
internal fun PlayerActivity.showV798LevelAutoTier798Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v798levelAutoTier798).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier798",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v798levelAutoTier798 = value
        AppToast.show(this, "Level Auto Tier798: $value")
    }
}

// v798: Library Auto Import798
internal fun PlayerActivity.showV798LibraryAutoImport798Toggle() {
    val current = BiliClient.prefs.v798libraryAutoImport798
    BiliClient.prefs.v798libraryAutoImport798 = !current
    AppToast.show(this, "Library Auto Import798: ${if (!current) "ON" else "OFF"}")
}

// v798: License Auto Verify798
internal fun PlayerActivity.showV798LicenseAutoVerify798Toggle() {
    val current = BiliClient.prefs.v798licenseAutoVerify798
    BiliClient.prefs.v798licenseAutoVerify798 = !current
    AppToast.show(this, "License Auto Verify798: ${if (!current) "ON" else "OFF"}")
}

// v798: Life Auto Cycle798
internal fun PlayerActivity.showV798LifeAutoCycle798Toggle() {
    val current = BiliClient.prefs.v798lifeAutoCycle798
    BiliClient.prefs.v798lifeAutoCycle798 = !current
    AppToast.show(this, "Life Auto Cycle798: ${if (!current) "ON" else "OFF"}")
}

// v798: Lifetime Auto Manage798
internal fun PlayerActivity.showV798LifetimeAutoManage798Toggle() {
    val current = BiliClient.prefs.v798lifetimeAutoManage798
    BiliClient.prefs.v798lifetimeAutoManage798 = !current
    AppToast.show(this, "Lifetime Auto Manage798: ${if (!current) "ON" else "OFF"}")
}

// v798: Light Auto Theme798
internal fun PlayerActivity.showV798LightAutoTheme798Toggle() {
    val current = BiliClient.prefs.v798lightAutoTheme798
    BiliClient.prefs.v798lightAutoTheme798 = !current
    AppToast.show(this, "Light Auto Theme798: ${if (!current) "ON" else "OFF"}")
}

// v798: Limit Auto Rate798
internal fun PlayerActivity.showV798LimitAutoRate798Toggle() {
    val current = BiliClient.prefs.v798limitAutoRate798
    BiliClient.prefs.v798limitAutoRate798 = !current
    AppToast.show(this, "Limit Auto Rate798: ${if (!current) "ON" else "OFF"}")
}

// v798: Line Auto Wrap798
internal fun PlayerActivity.showV798LineAutoWrap798Toggle() {
    val current = BiliClient.prefs.v798lineAutoWrap798
    BiliClient.prefs.v798lineAutoWrap798 = !current
    AppToast.show(this, "Line Auto Wrap798: ${if (!current) "ON" else "OFF"}")
}

// v798: Link Auto Preview798
internal fun PlayerActivity.showV798LinkAutoPreview798Toggle() {
    val current = BiliClient.prefs.v798linkAutoPreview798
    BiliClient.prefs.v798linkAutoPreview798 = !current
    AppToast.show(this, "Link Auto Preview798: ${if (!current) "ON" else "OFF"}")
}

// v798: List Auto Virtualize798
internal fun PlayerActivity.showV798ListAutoVirtualize798Toggle() {
    val current = BiliClient.prefs.v798listAutoVirtualize798
    BiliClient.prefs.v798listAutoVirtualize798 = !current
    AppToast.show(this, "List Auto Virtualize798: ${if (!current) "ON" else "OFF"}")
}

// v798: Live Auto Reconnect798
internal fun PlayerActivity.showV798LiveAutoReconnect798Toggle() {
    val current = BiliClient.prefs.v798liveAutoReconnect798
    BiliClient.prefs.v798liveAutoReconnect798 = !current
    AppToast.show(this, "Live Auto Reconnect798: ${if (!current) "ON" else "OFF"}")
}

// v798: Load Auto Balance798
internal fun PlayerActivity.showV798LoadAutoBalance798Toggle() {
    val current = BiliClient.prefs.v798loadAutoBalance798
    BiliClient.prefs.v798loadAutoBalance798 = !current
    AppToast.show(this, "Load Auto Balance798: ${if (!current) "ON" else "OFF"}")
}

// v798: Local Auto Cache798
internal fun PlayerActivity.showV798LocalAutoCache798Toggle() {
    val current = BiliClient.prefs.v798localAutoCache798
    BiliClient.prefs.v798localAutoCache798 = !current
    AppToast.show(this, "Local Auto Cache798: ${if (!current) "ON" else "OFF"}")
}

// v798: Lock Auto Screen798
internal fun PlayerActivity.showV798LockAutoScreen798Toggle() {
    val current = BiliClient.prefs.v798lockAutoScreen798
    BiliClient.prefs.v798lockAutoScreen798 = !current
    AppToast.show(this, "Lock Auto Screen798: ${if (!current) "ON" else "OFF"}")
}

// v799: Length Auto Limit799
internal fun PlayerActivity.showV799LengthAutoLimit799Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v799lengthAutoLimit799).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit799",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v799lengthAutoLimit799 = value
        AppToast.show(this, "Length Auto Limit799: $value")
    }
}

// v799: Level Auto Tier799
internal fun PlayerActivity.showV799LevelAutoTier799Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v799levelAutoTier799).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier799",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v799levelAutoTier799 = value
        AppToast.show(this, "Level Auto Tier799: $value")
    }
}

// v799: Library Auto Import799
internal fun PlayerActivity.showV799LibraryAutoImport799Toggle() {
    val current = BiliClient.prefs.v799libraryAutoImport799
    BiliClient.prefs.v799libraryAutoImport799 = !current
    AppToast.show(this, "Library Auto Import799: ${if (!current) "ON" else "OFF"}")
}

// v799: License Auto Verify799
internal fun PlayerActivity.showV799LicenseAutoVerify799Toggle() {
    val current = BiliClient.prefs.v799licenseAutoVerify799
    BiliClient.prefs.v799licenseAutoVerify799 = !current
    AppToast.show(this, "License Auto Verify799: ${if (!current) "ON" else "OFF"}")
}

// v799: Life Auto Cycle799
internal fun PlayerActivity.showV799LifeAutoCycle799Toggle() {
    val current = BiliClient.prefs.v799lifeAutoCycle799
    BiliClient.prefs.v799lifeAutoCycle799 = !current
    AppToast.show(this, "Life Auto Cycle799: ${if (!current) "ON" else "OFF"}")
}

// v799: Lifetime Auto Manage799
internal fun PlayerActivity.showV799LifetimeAutoManage799Toggle() {
    val current = BiliClient.prefs.v799lifetimeAutoManage799
    BiliClient.prefs.v799lifetimeAutoManage799 = !current
    AppToast.show(this, "Lifetime Auto Manage799: ${if (!current) "ON" else "OFF"}")
}

// v799: Light Auto Theme799
internal fun PlayerActivity.showV799LightAutoTheme799Toggle() {
    val current = BiliClient.prefs.v799lightAutoTheme799
    BiliClient.prefs.v799lightAutoTheme799 = !current
    AppToast.show(this, "Light Auto Theme799: ${if (!current) "ON" else "OFF"}")
}

// v799: Limit Auto Rate799
internal fun PlayerActivity.showV799LimitAutoRate799Toggle() {
    val current = BiliClient.prefs.v799limitAutoRate799
    BiliClient.prefs.v799limitAutoRate799 = !current
    AppToast.show(this, "Limit Auto Rate799: ${if (!current) "ON" else "OFF"}")
}

// v799: Line Auto Wrap799
internal fun PlayerActivity.showV799LineAutoWrap799Toggle() {
    val current = BiliClient.prefs.v799lineAutoWrap799
    BiliClient.prefs.v799lineAutoWrap799 = !current
    AppToast.show(this, "Line Auto Wrap799: ${if (!current) "ON" else "OFF"}")
}

// v799: Link Auto Preview799
internal fun PlayerActivity.showV799LinkAutoPreview799Toggle() {
    val current = BiliClient.prefs.v799linkAutoPreview799
    BiliClient.prefs.v799linkAutoPreview799 = !current
    AppToast.show(this, "Link Auto Preview799: ${if (!current) "ON" else "OFF"}")
}

// v799: List Auto Virtualize799
internal fun PlayerActivity.showV799ListAutoVirtualize799Toggle() {
    val current = BiliClient.prefs.v799listAutoVirtualize799
    BiliClient.prefs.v799listAutoVirtualize799 = !current
    AppToast.show(this, "List Auto Virtualize799: ${if (!current) "ON" else "OFF"}")
}

// v799: Live Auto Reconnect799
internal fun PlayerActivity.showV799LiveAutoReconnect799Toggle() {
    val current = BiliClient.prefs.v799liveAutoReconnect799
    BiliClient.prefs.v799liveAutoReconnect799 = !current
    AppToast.show(this, "Live Auto Reconnect799: ${if (!current) "ON" else "OFF"}")
}

// v799: Load Auto Balance799
internal fun PlayerActivity.showV799LoadAutoBalance799Toggle() {
    val current = BiliClient.prefs.v799loadAutoBalance799
    BiliClient.prefs.v799loadAutoBalance799 = !current
    AppToast.show(this, "Load Auto Balance799: ${if (!current) "ON" else "OFF"}")
}

// v799: Local Auto Cache799
internal fun PlayerActivity.showV799LocalAutoCache799Toggle() {
    val current = BiliClient.prefs.v799localAutoCache799
    BiliClient.prefs.v799localAutoCache799 = !current
    AppToast.show(this, "Local Auto Cache799: ${if (!current) "ON" else "OFF"}")
}

// v799: Lock Auto Screen799
internal fun PlayerActivity.showV799LockAutoScreen799Toggle() {
    val current = BiliClient.prefs.v799lockAutoScreen799
    BiliClient.prefs.v799lockAutoScreen799 = !current
    AppToast.show(this, "Lock Auto Screen799: ${if (!current) "ON" else "OFF"}")
}

// v800: Length Auto Limit800
internal fun PlayerActivity.showV800LengthAutoLimit800Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v800lengthAutoLimit800).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Length Auto Limit800",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v800lengthAutoLimit800 = value
        AppToast.show(this, "Length Auto Limit800: $value")
    }
}

// v800: Level Auto Tier800
internal fun PlayerActivity.showV800LevelAutoTier800Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v800levelAutoTier800).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Tier800",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v800levelAutoTier800 = value
        AppToast.show(this, "Level Auto Tier800: $value")
    }
}

// v800: Library Auto Import800
internal fun PlayerActivity.showV800LibraryAutoImport800Toggle() {
    val current = BiliClient.prefs.v800libraryAutoImport800
    BiliClient.prefs.v800libraryAutoImport800 = !current
    AppToast.show(this, "Library Auto Import800: ${if (!current) "ON" else "OFF"}")
}

// v800: License Auto Verify800
internal fun PlayerActivity.showV800LicenseAutoVerify800Toggle() {
    val current = BiliClient.prefs.v800licenseAutoVerify800
    BiliClient.prefs.v800licenseAutoVerify800 = !current
    AppToast.show(this, "License Auto Verify800: ${if (!current) "ON" else "OFF"}")
}

// v800: Life Auto Cycle800
internal fun PlayerActivity.showV800LifeAutoCycle800Toggle() {
    val current = BiliClient.prefs.v800lifeAutoCycle800
    BiliClient.prefs.v800lifeAutoCycle800 = !current
    AppToast.show(this, "Life Auto Cycle800: ${if (!current) "ON" else "OFF"}")
}

// v800: Lifetime Auto Manage800
internal fun PlayerActivity.showV800LifetimeAutoManage800Toggle() {
    val current = BiliClient.prefs.v800lifetimeAutoManage800
    BiliClient.prefs.v800lifetimeAutoManage800 = !current
    AppToast.show(this, "Lifetime Auto Manage800: ${if (!current) "ON" else "OFF"}")
}

// v800: Light Auto Theme800
internal fun PlayerActivity.showV800LightAutoTheme800Toggle() {
    val current = BiliClient.prefs.v800lightAutoTheme800
    BiliClient.prefs.v800lightAutoTheme800 = !current
    AppToast.show(this, "Light Auto Theme800: ${if (!current) "ON" else "OFF"}")
}

// v800: Limit Auto Rate800
internal fun PlayerActivity.showV800LimitAutoRate800Toggle() {
    val current = BiliClient.prefs.v800limitAutoRate800
    BiliClient.prefs.v800limitAutoRate800 = !current
    AppToast.show(this, "Limit Auto Rate800: ${if (!current) "ON" else "OFF"}")
}

// v800: Line Auto Wrap800
internal fun PlayerActivity.showV800LineAutoWrap800Toggle() {
    val current = BiliClient.prefs.v800lineAutoWrap800
    BiliClient.prefs.v800lineAutoWrap800 = !current
    AppToast.show(this, "Line Auto Wrap800: ${if (!current) "ON" else "OFF"}")
}

// v800: Link Auto Preview800
internal fun PlayerActivity.showV800LinkAutoPreview800Toggle() {
    val current = BiliClient.prefs.v800linkAutoPreview800
    BiliClient.prefs.v800linkAutoPreview800 = !current
    AppToast.show(this, "Link Auto Preview800: ${if (!current) "ON" else "OFF"}")
}

// v800: List Auto Virtualize800
internal fun PlayerActivity.showV800ListAutoVirtualize800Toggle() {
    val current = BiliClient.prefs.v800listAutoVirtualize800
    BiliClient.prefs.v800listAutoVirtualize800 = !current
    AppToast.show(this, "List Auto Virtualize800: ${if (!current) "ON" else "OFF"}")
}

// v800: Live Auto Reconnect800
internal fun PlayerActivity.showV800LiveAutoReconnect800Toggle() {
    val current = BiliClient.prefs.v800liveAutoReconnect800
    BiliClient.prefs.v800liveAutoReconnect800 = !current
    AppToast.show(this, "Live Auto Reconnect800: ${if (!current) "ON" else "OFF"}")
}

// v800: Load Auto Balance800
internal fun PlayerActivity.showV800LoadAutoBalance800Toggle() {
    val current = BiliClient.prefs.v800loadAutoBalance800
    BiliClient.prefs.v800loadAutoBalance800 = !current
    AppToast.show(this, "Load Auto Balance800: ${if (!current) "ON" else "OFF"}")
}

// v800: Local Auto Cache800
internal fun PlayerActivity.showV800LocalAutoCache800Toggle() {
    val current = BiliClient.prefs.v800localAutoCache800
    BiliClient.prefs.v800localAutoCache800 = !current
    AppToast.show(this, "Local Auto Cache800: ${if (!current) "ON" else "OFF"}")
}

// v800: Lock Auto Screen800
internal fun PlayerActivity.showV800LockAutoScreen800Toggle() {
    val current = BiliClient.prefs.v800lockAutoScreen800
    BiliClient.prefs.v800lockAutoScreen800 = !current
    AppToast.show(this, "Lock Auto Screen800: ${if (!current) "ON" else "OFF"}")
}

