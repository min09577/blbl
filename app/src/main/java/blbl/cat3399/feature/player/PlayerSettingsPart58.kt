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

// v761: Hit Auto Count761
internal fun PlayerActivity.showV761HitAutoCount761Toggle() {
    val current = BiliClient.prefs.v761hitAutoCount761
    BiliClient.prefs.v761hitAutoCount761 = !current
    AppToast.show(this, "Hit Auto Count761: ${if (!current) "ON" else "OFF"}")
}

// v761: Hold Auto Lock761
internal fun PlayerActivity.showV761HoldAutoLock761Toggle() {
    val current = BiliClient.prefs.v761holdAutoLock761
    BiliClient.prefs.v761holdAutoLock761 = !current
    AppToast.show(this, "Hold Auto Lock761: ${if (!current) "ON" else "OFF"}")
}

// v761: Hook Auto Inject761
internal fun PlayerActivity.showV761HookAutoInject761Toggle() {
    val current = BiliClient.prefs.v761hookAutoInject761
    BiliClient.prefs.v761hookAutoInject761 = !current
    AppToast.show(this, "Hook Auto Inject761: ${if (!current) "ON" else "OFF"}")
}

// v761: Host Auto Resolve761
internal fun PlayerActivity.showV761HostAutoResolve761Toggle() {
    val current = BiliClient.prefs.v761hostAutoResolve761
    BiliClient.prefs.v761hostAutoResolve761 = !current
    AppToast.show(this, "Host Auto Resolve761: ${if (!current) "ON" else "OFF"}")
}

// v761: Hot Auto Reload761
internal fun PlayerActivity.showV761HotAutoReload761Toggle() {
    val current = BiliClient.prefs.v761hotAutoReload761
    BiliClient.prefs.v761hotAutoReload761 = !current
    AppToast.show(this, "Hot Auto Reload761: ${if (!current) "ON" else "OFF"}")
}

// v761: Hover Auto Preview761
internal fun PlayerActivity.showV761HoverAutoPreview761Toggle() {
    val current = BiliClient.prefs.v761hoverAutoPreview761
    BiliClient.prefs.v761hoverAutoPreview761 = !current
    AppToast.show(this, "Hover Auto Preview761: ${if (!current) "ON" else "OFF"}")
}

// v761: Hub Auto Connect761
internal fun PlayerActivity.showV761HubAutoConnect761Toggle() {
    val current = BiliClient.prefs.v761hubAutoConnect761
    BiliClient.prefs.v761hubAutoConnect761 = !current
    AppToast.show(this, "Hub Auto Connect761: ${if (!current) "ON" else "OFF"}")
}

// v761: Icon Auto Theme761
internal fun PlayerActivity.showV761IconAutoTheme761Toggle() {
    val current = BiliClient.prefs.v761iconAutoTheme761
    BiliClient.prefs.v761iconAutoTheme761 = !current
    AppToast.show(this, "Icon Auto Theme761: ${if (!current) "ON" else "OFF"}")
}

// v761: Identity Auto Verify761
internal fun PlayerActivity.showV761IdentityAutoVerify761Toggle() {
    val current = BiliClient.prefs.v761identityAutoVerify761
    BiliClient.prefs.v761identityAutoVerify761 = !current
    AppToast.show(this, "Identity Auto Verify761: ${if (!current) "ON" else "OFF"}")
}

// v761: Idle Auto Dim761
internal fun PlayerActivity.showV761IdleAutoDim761Toggle() {
    val current = BiliClient.prefs.v761idleAutoDim761
    BiliClient.prefs.v761idleAutoDim761 = !current
    AppToast.show(this, "Idle Auto Dim761: ${if (!current) "ON" else "OFF"}")
}

// v761: Ignore Auto List761
internal fun PlayerActivity.showV761IgnoreAutoList761Toggle() {
    val current = BiliClient.prefs.v761ignoreAutoList761
    BiliClient.prefs.v761ignoreAutoList761 = !current
    AppToast.show(this, "Ignore Auto List761: ${if (!current) "ON" else "OFF"}")
}

// v761: Image Auto Preload761
internal fun PlayerActivity.showV761ImageAutoPreload761Toggle() {
    val current = BiliClient.prefs.v761imageAutoPreload761
    BiliClient.prefs.v761imageAutoPreload761 = !current
    AppToast.show(this, "Image Auto Preload761: ${if (!current) "ON" else "OFF"}")
}

// v761: Import Auto Merge761
internal fun PlayerActivity.showV761ImportAutoMerge761Toggle() {
    val current = BiliClient.prefs.v761importAutoMerge761
    BiliClient.prefs.v761importAutoMerge761 = !current
    AppToast.show(this, "Import Auto Merge761: ${if (!current) "ON" else "OFF"}")
}

// v761: Index Auto Build761
internal fun PlayerActivity.showV761IndexAutoBuild761Toggle() {
    val current = BiliClient.prefs.v761indexAutoBuild761
    BiliClient.prefs.v761indexAutoBuild761 = !current
    AppToast.show(this, "Index Auto Build761: ${if (!current) "ON" else "OFF"}")
}

// v761: Info Auto Popup761
internal fun PlayerActivity.showV761InfoAutoPopup761Toggle() {
    val current = BiliClient.prefs.v761infoAutoPopup761
    BiliClient.prefs.v761infoAutoPopup761 = !current
    AppToast.show(this, "Info Auto Popup761: ${if (!current) "ON" else "OFF"}")
}

// v762: Hit Auto Count762
internal fun PlayerActivity.showV762HitAutoCount762Toggle() {
    val current = BiliClient.prefs.v762hitAutoCount762
    BiliClient.prefs.v762hitAutoCount762 = !current
    AppToast.show(this, "Hit Auto Count762: ${if (!current) "ON" else "OFF"}")
}

// v762: Hold Auto Lock762
internal fun PlayerActivity.showV762HoldAutoLock762Toggle() {
    val current = BiliClient.prefs.v762holdAutoLock762
    BiliClient.prefs.v762holdAutoLock762 = !current
    AppToast.show(this, "Hold Auto Lock762: ${if (!current) "ON" else "OFF"}")
}

// v762: Hook Auto Inject762
internal fun PlayerActivity.showV762HookAutoInject762Toggle() {
    val current = BiliClient.prefs.v762hookAutoInject762
    BiliClient.prefs.v762hookAutoInject762 = !current
    AppToast.show(this, "Hook Auto Inject762: ${if (!current) "ON" else "OFF"}")
}

// v762: Host Auto Resolve762
internal fun PlayerActivity.showV762HostAutoResolve762Toggle() {
    val current = BiliClient.prefs.v762hostAutoResolve762
    BiliClient.prefs.v762hostAutoResolve762 = !current
    AppToast.show(this, "Host Auto Resolve762: ${if (!current) "ON" else "OFF"}")
}

// v762: Hot Auto Reload762
internal fun PlayerActivity.showV762HotAutoReload762Toggle() {
    val current = BiliClient.prefs.v762hotAutoReload762
    BiliClient.prefs.v762hotAutoReload762 = !current
    AppToast.show(this, "Hot Auto Reload762: ${if (!current) "ON" else "OFF"}")
}

// v762: Hover Auto Preview762
internal fun PlayerActivity.showV762HoverAutoPreview762Toggle() {
    val current = BiliClient.prefs.v762hoverAutoPreview762
    BiliClient.prefs.v762hoverAutoPreview762 = !current
    AppToast.show(this, "Hover Auto Preview762: ${if (!current) "ON" else "OFF"}")
}

// v762: Hub Auto Connect762
internal fun PlayerActivity.showV762HubAutoConnect762Toggle() {
    val current = BiliClient.prefs.v762hubAutoConnect762
    BiliClient.prefs.v762hubAutoConnect762 = !current
    AppToast.show(this, "Hub Auto Connect762: ${if (!current) "ON" else "OFF"}")
}

// v762: Icon Auto Theme762
internal fun PlayerActivity.showV762IconAutoTheme762Toggle() {
    val current = BiliClient.prefs.v762iconAutoTheme762
    BiliClient.prefs.v762iconAutoTheme762 = !current
    AppToast.show(this, "Icon Auto Theme762: ${if (!current) "ON" else "OFF"}")
}

// v762: Identity Auto Verify762
internal fun PlayerActivity.showV762IdentityAutoVerify762Toggle() {
    val current = BiliClient.prefs.v762identityAutoVerify762
    BiliClient.prefs.v762identityAutoVerify762 = !current
    AppToast.show(this, "Identity Auto Verify762: ${if (!current) "ON" else "OFF"}")
}

// v762: Idle Auto Dim762
internal fun PlayerActivity.showV762IdleAutoDim762Toggle() {
    val current = BiliClient.prefs.v762idleAutoDim762
    BiliClient.prefs.v762idleAutoDim762 = !current
    AppToast.show(this, "Idle Auto Dim762: ${if (!current) "ON" else "OFF"}")
}

// v762: Ignore Auto List762
internal fun PlayerActivity.showV762IgnoreAutoList762Toggle() {
    val current = BiliClient.prefs.v762ignoreAutoList762
    BiliClient.prefs.v762ignoreAutoList762 = !current
    AppToast.show(this, "Ignore Auto List762: ${if (!current) "ON" else "OFF"}")
}

// v762: Image Auto Preload762
internal fun PlayerActivity.showV762ImageAutoPreload762Toggle() {
    val current = BiliClient.prefs.v762imageAutoPreload762
    BiliClient.prefs.v762imageAutoPreload762 = !current
    AppToast.show(this, "Image Auto Preload762: ${if (!current) "ON" else "OFF"}")
}

// v762: Import Auto Merge762
internal fun PlayerActivity.showV762ImportAutoMerge762Toggle() {
    val current = BiliClient.prefs.v762importAutoMerge762
    BiliClient.prefs.v762importAutoMerge762 = !current
    AppToast.show(this, "Import Auto Merge762: ${if (!current) "ON" else "OFF"}")
}

// v762: Index Auto Build762
internal fun PlayerActivity.showV762IndexAutoBuild762Toggle() {
    val current = BiliClient.prefs.v762indexAutoBuild762
    BiliClient.prefs.v762indexAutoBuild762 = !current
    AppToast.show(this, "Index Auto Build762: ${if (!current) "ON" else "OFF"}")
}

// v762: Info Auto Popup762
internal fun PlayerActivity.showV762InfoAutoPopup762Toggle() {
    val current = BiliClient.prefs.v762infoAutoPopup762
    BiliClient.prefs.v762infoAutoPopup762 = !current
    AppToast.show(this, "Info Auto Popup762: ${if (!current) "ON" else "OFF"}")
}

// v763: Hit Auto Count763
internal fun PlayerActivity.showV763HitAutoCount763Toggle() {
    val current = BiliClient.prefs.v763hitAutoCount763
    BiliClient.prefs.v763hitAutoCount763 = !current
    AppToast.show(this, "Hit Auto Count763: ${if (!current) "ON" else "OFF"}")
}

// v763: Hold Auto Lock763
internal fun PlayerActivity.showV763HoldAutoLock763Toggle() {
    val current = BiliClient.prefs.v763holdAutoLock763
    BiliClient.prefs.v763holdAutoLock763 = !current
    AppToast.show(this, "Hold Auto Lock763: ${if (!current) "ON" else "OFF"}")
}

// v763: Hook Auto Inject763
internal fun PlayerActivity.showV763HookAutoInject763Toggle() {
    val current = BiliClient.prefs.v763hookAutoInject763
    BiliClient.prefs.v763hookAutoInject763 = !current
    AppToast.show(this, "Hook Auto Inject763: ${if (!current) "ON" else "OFF"}")
}

// v763: Host Auto Resolve763
internal fun PlayerActivity.showV763HostAutoResolve763Toggle() {
    val current = BiliClient.prefs.v763hostAutoResolve763
    BiliClient.prefs.v763hostAutoResolve763 = !current
    AppToast.show(this, "Host Auto Resolve763: ${if (!current) "ON" else "OFF"}")
}

// v763: Hot Auto Reload763
internal fun PlayerActivity.showV763HotAutoReload763Toggle() {
    val current = BiliClient.prefs.v763hotAutoReload763
    BiliClient.prefs.v763hotAutoReload763 = !current
    AppToast.show(this, "Hot Auto Reload763: ${if (!current) "ON" else "OFF"}")
}

// v763: Hover Auto Preview763
internal fun PlayerActivity.showV763HoverAutoPreview763Toggle() {
    val current = BiliClient.prefs.v763hoverAutoPreview763
    BiliClient.prefs.v763hoverAutoPreview763 = !current
    AppToast.show(this, "Hover Auto Preview763: ${if (!current) "ON" else "OFF"}")
}

// v763: Hub Auto Connect763
internal fun PlayerActivity.showV763HubAutoConnect763Toggle() {
    val current = BiliClient.prefs.v763hubAutoConnect763
    BiliClient.prefs.v763hubAutoConnect763 = !current
    AppToast.show(this, "Hub Auto Connect763: ${if (!current) "ON" else "OFF"}")
}

// v763: Icon Auto Theme763
internal fun PlayerActivity.showV763IconAutoTheme763Toggle() {
    val current = BiliClient.prefs.v763iconAutoTheme763
    BiliClient.prefs.v763iconAutoTheme763 = !current
    AppToast.show(this, "Icon Auto Theme763: ${if (!current) "ON" else "OFF"}")
}

// v763: Identity Auto Verify763
internal fun PlayerActivity.showV763IdentityAutoVerify763Toggle() {
    val current = BiliClient.prefs.v763identityAutoVerify763
    BiliClient.prefs.v763identityAutoVerify763 = !current
    AppToast.show(this, "Identity Auto Verify763: ${if (!current) "ON" else "OFF"}")
}

// v763: Idle Auto Dim763
internal fun PlayerActivity.showV763IdleAutoDim763Toggle() {
    val current = BiliClient.prefs.v763idleAutoDim763
    BiliClient.prefs.v763idleAutoDim763 = !current
    AppToast.show(this, "Idle Auto Dim763: ${if (!current) "ON" else "OFF"}")
}

// v763: Ignore Auto List763
internal fun PlayerActivity.showV763IgnoreAutoList763Toggle() {
    val current = BiliClient.prefs.v763ignoreAutoList763
    BiliClient.prefs.v763ignoreAutoList763 = !current
    AppToast.show(this, "Ignore Auto List763: ${if (!current) "ON" else "OFF"}")
}

// v763: Image Auto Preload763
internal fun PlayerActivity.showV763ImageAutoPreload763Toggle() {
    val current = BiliClient.prefs.v763imageAutoPreload763
    BiliClient.prefs.v763imageAutoPreload763 = !current
    AppToast.show(this, "Image Auto Preload763: ${if (!current) "ON" else "OFF"}")
}

// v763: Import Auto Merge763
internal fun PlayerActivity.showV763ImportAutoMerge763Toggle() {
    val current = BiliClient.prefs.v763importAutoMerge763
    BiliClient.prefs.v763importAutoMerge763 = !current
    AppToast.show(this, "Import Auto Merge763: ${if (!current) "ON" else "OFF"}")
}

// v763: Index Auto Build763
internal fun PlayerActivity.showV763IndexAutoBuild763Toggle() {
    val current = BiliClient.prefs.v763indexAutoBuild763
    BiliClient.prefs.v763indexAutoBuild763 = !current
    AppToast.show(this, "Index Auto Build763: ${if (!current) "ON" else "OFF"}")
}

// v763: Info Auto Popup763
internal fun PlayerActivity.showV763InfoAutoPopup763Toggle() {
    val current = BiliClient.prefs.v763infoAutoPopup763
    BiliClient.prefs.v763infoAutoPopup763 = !current
    AppToast.show(this, "Info Auto Popup763: ${if (!current) "ON" else "OFF"}")
}

// v764: Hit Auto Count764
internal fun PlayerActivity.showV764HitAutoCount764Toggle() {
    val current = BiliClient.prefs.v764hitAutoCount764
    BiliClient.prefs.v764hitAutoCount764 = !current
    AppToast.show(this, "Hit Auto Count764: ${if (!current) "ON" else "OFF"}")
}

// v764: Hold Auto Lock764
internal fun PlayerActivity.showV764HoldAutoLock764Toggle() {
    val current = BiliClient.prefs.v764holdAutoLock764
    BiliClient.prefs.v764holdAutoLock764 = !current
    AppToast.show(this, "Hold Auto Lock764: ${if (!current) "ON" else "OFF"}")
}

// v764: Hook Auto Inject764
internal fun PlayerActivity.showV764HookAutoInject764Toggle() {
    val current = BiliClient.prefs.v764hookAutoInject764
    BiliClient.prefs.v764hookAutoInject764 = !current
    AppToast.show(this, "Hook Auto Inject764: ${if (!current) "ON" else "OFF"}")
}

// v764: Host Auto Resolve764
internal fun PlayerActivity.showV764HostAutoResolve764Toggle() {
    val current = BiliClient.prefs.v764hostAutoResolve764
    BiliClient.prefs.v764hostAutoResolve764 = !current
    AppToast.show(this, "Host Auto Resolve764: ${if (!current) "ON" else "OFF"}")
}

// v764: Hot Auto Reload764
internal fun PlayerActivity.showV764HotAutoReload764Toggle() {
    val current = BiliClient.prefs.v764hotAutoReload764
    BiliClient.prefs.v764hotAutoReload764 = !current
    AppToast.show(this, "Hot Auto Reload764: ${if (!current) "ON" else "OFF"}")
}

// v764: Hover Auto Preview764
internal fun PlayerActivity.showV764HoverAutoPreview764Toggle() {
    val current = BiliClient.prefs.v764hoverAutoPreview764
    BiliClient.prefs.v764hoverAutoPreview764 = !current
    AppToast.show(this, "Hover Auto Preview764: ${if (!current) "ON" else "OFF"}")
}

// v764: Hub Auto Connect764
internal fun PlayerActivity.showV764HubAutoConnect764Toggle() {
    val current = BiliClient.prefs.v764hubAutoConnect764
    BiliClient.prefs.v764hubAutoConnect764 = !current
    AppToast.show(this, "Hub Auto Connect764: ${if (!current) "ON" else "OFF"}")
}

// v764: Icon Auto Theme764
internal fun PlayerActivity.showV764IconAutoTheme764Toggle() {
    val current = BiliClient.prefs.v764iconAutoTheme764
    BiliClient.prefs.v764iconAutoTheme764 = !current
    AppToast.show(this, "Icon Auto Theme764: ${if (!current) "ON" else "OFF"}")
}

// v764: Identity Auto Verify764
internal fun PlayerActivity.showV764IdentityAutoVerify764Toggle() {
    val current = BiliClient.prefs.v764identityAutoVerify764
    BiliClient.prefs.v764identityAutoVerify764 = !current
    AppToast.show(this, "Identity Auto Verify764: ${if (!current) "ON" else "OFF"}")
}

// v764: Idle Auto Dim764
internal fun PlayerActivity.showV764IdleAutoDim764Toggle() {
    val current = BiliClient.prefs.v764idleAutoDim764
    BiliClient.prefs.v764idleAutoDim764 = !current
    AppToast.show(this, "Idle Auto Dim764: ${if (!current) "ON" else "OFF"}")
}

// v764: Ignore Auto List764
internal fun PlayerActivity.showV764IgnoreAutoList764Toggle() {
    val current = BiliClient.prefs.v764ignoreAutoList764
    BiliClient.prefs.v764ignoreAutoList764 = !current
    AppToast.show(this, "Ignore Auto List764: ${if (!current) "ON" else "OFF"}")
}

// v764: Image Auto Preload764
internal fun PlayerActivity.showV764ImageAutoPreload764Toggle() {
    val current = BiliClient.prefs.v764imageAutoPreload764
    BiliClient.prefs.v764imageAutoPreload764 = !current
    AppToast.show(this, "Image Auto Preload764: ${if (!current) "ON" else "OFF"}")
}

// v764: Import Auto Merge764
internal fun PlayerActivity.showV764ImportAutoMerge764Toggle() {
    val current = BiliClient.prefs.v764importAutoMerge764
    BiliClient.prefs.v764importAutoMerge764 = !current
    AppToast.show(this, "Import Auto Merge764: ${if (!current) "ON" else "OFF"}")
}

// v764: Index Auto Build764
internal fun PlayerActivity.showV764IndexAutoBuild764Toggle() {
    val current = BiliClient.prefs.v764indexAutoBuild764
    BiliClient.prefs.v764indexAutoBuild764 = !current
    AppToast.show(this, "Index Auto Build764: ${if (!current) "ON" else "OFF"}")
}

// v764: Info Auto Popup764
internal fun PlayerActivity.showV764InfoAutoPopup764Toggle() {
    val current = BiliClient.prefs.v764infoAutoPopup764
    BiliClient.prefs.v764infoAutoPopup764 = !current
    AppToast.show(this, "Info Auto Popup764: ${if (!current) "ON" else "OFF"}")
}

// v765: Hit Auto Count765
internal fun PlayerActivity.showV765HitAutoCount765Toggle() {
    val current = BiliClient.prefs.v765hitAutoCount765
    BiliClient.prefs.v765hitAutoCount765 = !current
    AppToast.show(this, "Hit Auto Count765: ${if (!current) "ON" else "OFF"}")
}

// v765: Hold Auto Lock765
internal fun PlayerActivity.showV765HoldAutoLock765Toggle() {
    val current = BiliClient.prefs.v765holdAutoLock765
    BiliClient.prefs.v765holdAutoLock765 = !current
    AppToast.show(this, "Hold Auto Lock765: ${if (!current) "ON" else "OFF"}")
}

// v765: Hook Auto Inject765
internal fun PlayerActivity.showV765HookAutoInject765Toggle() {
    val current = BiliClient.prefs.v765hookAutoInject765
    BiliClient.prefs.v765hookAutoInject765 = !current
    AppToast.show(this, "Hook Auto Inject765: ${if (!current) "ON" else "OFF"}")
}

// v765: Host Auto Resolve765
internal fun PlayerActivity.showV765HostAutoResolve765Toggle() {
    val current = BiliClient.prefs.v765hostAutoResolve765
    BiliClient.prefs.v765hostAutoResolve765 = !current
    AppToast.show(this, "Host Auto Resolve765: ${if (!current) "ON" else "OFF"}")
}

// v765: Hot Auto Reload765
internal fun PlayerActivity.showV765HotAutoReload765Toggle() {
    val current = BiliClient.prefs.v765hotAutoReload765
    BiliClient.prefs.v765hotAutoReload765 = !current
    AppToast.show(this, "Hot Auto Reload765: ${if (!current) "ON" else "OFF"}")
}

// v765: Hover Auto Preview765
internal fun PlayerActivity.showV765HoverAutoPreview765Toggle() {
    val current = BiliClient.prefs.v765hoverAutoPreview765
    BiliClient.prefs.v765hoverAutoPreview765 = !current
    AppToast.show(this, "Hover Auto Preview765: ${if (!current) "ON" else "OFF"}")
}

// v765: Hub Auto Connect765
internal fun PlayerActivity.showV765HubAutoConnect765Toggle() {
    val current = BiliClient.prefs.v765hubAutoConnect765
    BiliClient.prefs.v765hubAutoConnect765 = !current
    AppToast.show(this, "Hub Auto Connect765: ${if (!current) "ON" else "OFF"}")
}

// v765: Icon Auto Theme765
internal fun PlayerActivity.showV765IconAutoTheme765Toggle() {
    val current = BiliClient.prefs.v765iconAutoTheme765
    BiliClient.prefs.v765iconAutoTheme765 = !current
    AppToast.show(this, "Icon Auto Theme765: ${if (!current) "ON" else "OFF"}")
}

// v765: Identity Auto Verify765
internal fun PlayerActivity.showV765IdentityAutoVerify765Toggle() {
    val current = BiliClient.prefs.v765identityAutoVerify765
    BiliClient.prefs.v765identityAutoVerify765 = !current
    AppToast.show(this, "Identity Auto Verify765: ${if (!current) "ON" else "OFF"}")
}

// v765: Idle Auto Dim765
internal fun PlayerActivity.showV765IdleAutoDim765Toggle() {
    val current = BiliClient.prefs.v765idleAutoDim765
    BiliClient.prefs.v765idleAutoDim765 = !current
    AppToast.show(this, "Idle Auto Dim765: ${if (!current) "ON" else "OFF"}")
}

// v765: Ignore Auto List765
internal fun PlayerActivity.showV765IgnoreAutoList765Toggle() {
    val current = BiliClient.prefs.v765ignoreAutoList765
    BiliClient.prefs.v765ignoreAutoList765 = !current
    AppToast.show(this, "Ignore Auto List765: ${if (!current) "ON" else "OFF"}")
}

// v765: Image Auto Preload765
internal fun PlayerActivity.showV765ImageAutoPreload765Toggle() {
    val current = BiliClient.prefs.v765imageAutoPreload765
    BiliClient.prefs.v765imageAutoPreload765 = !current
    AppToast.show(this, "Image Auto Preload765: ${if (!current) "ON" else "OFF"}")
}

// v765: Import Auto Merge765
internal fun PlayerActivity.showV765ImportAutoMerge765Toggle() {
    val current = BiliClient.prefs.v765importAutoMerge765
    BiliClient.prefs.v765importAutoMerge765 = !current
    AppToast.show(this, "Import Auto Merge765: ${if (!current) "ON" else "OFF"}")
}

// v765: Index Auto Build765
internal fun PlayerActivity.showV765IndexAutoBuild765Toggle() {
    val current = BiliClient.prefs.v765indexAutoBuild765
    BiliClient.prefs.v765indexAutoBuild765 = !current
    AppToast.show(this, "Index Auto Build765: ${if (!current) "ON" else "OFF"}")
}

// v765: Info Auto Popup765
internal fun PlayerActivity.showV765InfoAutoPopup765Toggle() {
    val current = BiliClient.prefs.v765infoAutoPopup765
    BiliClient.prefs.v765infoAutoPopup765 = !current
    AppToast.show(this, "Info Auto Popup765: ${if (!current) "ON" else "OFF"}")
}

// v766: Hit Auto Count766
internal fun PlayerActivity.showV766HitAutoCount766Toggle() {
    val current = BiliClient.prefs.v766hitAutoCount766
    BiliClient.prefs.v766hitAutoCount766 = !current
    AppToast.show(this, "Hit Auto Count766: ${if (!current) "ON" else "OFF"}")
}

// v766: Hold Auto Lock766
internal fun PlayerActivity.showV766HoldAutoLock766Toggle() {
    val current = BiliClient.prefs.v766holdAutoLock766
    BiliClient.prefs.v766holdAutoLock766 = !current
    AppToast.show(this, "Hold Auto Lock766: ${if (!current) "ON" else "OFF"}")
}

// v766: Hook Auto Inject766
internal fun PlayerActivity.showV766HookAutoInject766Toggle() {
    val current = BiliClient.prefs.v766hookAutoInject766
    BiliClient.prefs.v766hookAutoInject766 = !current
    AppToast.show(this, "Hook Auto Inject766: ${if (!current) "ON" else "OFF"}")
}

// v766: Host Auto Resolve766
internal fun PlayerActivity.showV766HostAutoResolve766Toggle() {
    val current = BiliClient.prefs.v766hostAutoResolve766
    BiliClient.prefs.v766hostAutoResolve766 = !current
    AppToast.show(this, "Host Auto Resolve766: ${if (!current) "ON" else "OFF"}")
}

// v766: Hot Auto Reload766
internal fun PlayerActivity.showV766HotAutoReload766Toggle() {
    val current = BiliClient.prefs.v766hotAutoReload766
    BiliClient.prefs.v766hotAutoReload766 = !current
    AppToast.show(this, "Hot Auto Reload766: ${if (!current) "ON" else "OFF"}")
}

// v766: Hover Auto Preview766
internal fun PlayerActivity.showV766HoverAutoPreview766Toggle() {
    val current = BiliClient.prefs.v766hoverAutoPreview766
    BiliClient.prefs.v766hoverAutoPreview766 = !current
    AppToast.show(this, "Hover Auto Preview766: ${if (!current) "ON" else "OFF"}")
}

// v766: Hub Auto Connect766
internal fun PlayerActivity.showV766HubAutoConnect766Toggle() {
    val current = BiliClient.prefs.v766hubAutoConnect766
    BiliClient.prefs.v766hubAutoConnect766 = !current
    AppToast.show(this, "Hub Auto Connect766: ${if (!current) "ON" else "OFF"}")
}

// v766: Icon Auto Theme766
internal fun PlayerActivity.showV766IconAutoTheme766Toggle() {
    val current = BiliClient.prefs.v766iconAutoTheme766
    BiliClient.prefs.v766iconAutoTheme766 = !current
    AppToast.show(this, "Icon Auto Theme766: ${if (!current) "ON" else "OFF"}")
}

// v766: Identity Auto Verify766
internal fun PlayerActivity.showV766IdentityAutoVerify766Toggle() {
    val current = BiliClient.prefs.v766identityAutoVerify766
    BiliClient.prefs.v766identityAutoVerify766 = !current
    AppToast.show(this, "Identity Auto Verify766: ${if (!current) "ON" else "OFF"}")
}

// v766: Idle Auto Dim766
internal fun PlayerActivity.showV766IdleAutoDim766Toggle() {
    val current = BiliClient.prefs.v766idleAutoDim766
    BiliClient.prefs.v766idleAutoDim766 = !current
    AppToast.show(this, "Idle Auto Dim766: ${if (!current) "ON" else "OFF"}")
}

// v766: Ignore Auto List766
internal fun PlayerActivity.showV766IgnoreAutoList766Toggle() {
    val current = BiliClient.prefs.v766ignoreAutoList766
    BiliClient.prefs.v766ignoreAutoList766 = !current
    AppToast.show(this, "Ignore Auto List766: ${if (!current) "ON" else "OFF"}")
}

// v766: Image Auto Preload766
internal fun PlayerActivity.showV766ImageAutoPreload766Toggle() {
    val current = BiliClient.prefs.v766imageAutoPreload766
    BiliClient.prefs.v766imageAutoPreload766 = !current
    AppToast.show(this, "Image Auto Preload766: ${if (!current) "ON" else "OFF"}")
}

// v766: Import Auto Merge766
internal fun PlayerActivity.showV766ImportAutoMerge766Toggle() {
    val current = BiliClient.prefs.v766importAutoMerge766
    BiliClient.prefs.v766importAutoMerge766 = !current
    AppToast.show(this, "Import Auto Merge766: ${if (!current) "ON" else "OFF"}")
}

// v766: Index Auto Build766
internal fun PlayerActivity.showV766IndexAutoBuild766Toggle() {
    val current = BiliClient.prefs.v766indexAutoBuild766
    BiliClient.prefs.v766indexAutoBuild766 = !current
    AppToast.show(this, "Index Auto Build766: ${if (!current) "ON" else "OFF"}")
}

// v766: Info Auto Popup766
internal fun PlayerActivity.showV766InfoAutoPopup766Toggle() {
    val current = BiliClient.prefs.v766infoAutoPopup766
    BiliClient.prefs.v766infoAutoPopup766 = !current
    AppToast.show(this, "Info Auto Popup766: ${if (!current) "ON" else "OFF"}")
}

// v767: Hit Auto Count767
internal fun PlayerActivity.showV767HitAutoCount767Toggle() {
    val current = BiliClient.prefs.v767hitAutoCount767
    BiliClient.prefs.v767hitAutoCount767 = !current
    AppToast.show(this, "Hit Auto Count767: ${if (!current) "ON" else "OFF"}")
}

// v767: Hold Auto Lock767
internal fun PlayerActivity.showV767HoldAutoLock767Toggle() {
    val current = BiliClient.prefs.v767holdAutoLock767
    BiliClient.prefs.v767holdAutoLock767 = !current
    AppToast.show(this, "Hold Auto Lock767: ${if (!current) "ON" else "OFF"}")
}

// v767: Hook Auto Inject767
internal fun PlayerActivity.showV767HookAutoInject767Toggle() {
    val current = BiliClient.prefs.v767hookAutoInject767
    BiliClient.prefs.v767hookAutoInject767 = !current
    AppToast.show(this, "Hook Auto Inject767: ${if (!current) "ON" else "OFF"}")
}

// v767: Host Auto Resolve767
internal fun PlayerActivity.showV767HostAutoResolve767Toggle() {
    val current = BiliClient.prefs.v767hostAutoResolve767
    BiliClient.prefs.v767hostAutoResolve767 = !current
    AppToast.show(this, "Host Auto Resolve767: ${if (!current) "ON" else "OFF"}")
}

// v767: Hot Auto Reload767
internal fun PlayerActivity.showV767HotAutoReload767Toggle() {
    val current = BiliClient.prefs.v767hotAutoReload767
    BiliClient.prefs.v767hotAutoReload767 = !current
    AppToast.show(this, "Hot Auto Reload767: ${if (!current) "ON" else "OFF"}")
}

// v767: Hover Auto Preview767
internal fun PlayerActivity.showV767HoverAutoPreview767Toggle() {
    val current = BiliClient.prefs.v767hoverAutoPreview767
    BiliClient.prefs.v767hoverAutoPreview767 = !current
    AppToast.show(this, "Hover Auto Preview767: ${if (!current) "ON" else "OFF"}")
}

// v767: Hub Auto Connect767
internal fun PlayerActivity.showV767HubAutoConnect767Toggle() {
    val current = BiliClient.prefs.v767hubAutoConnect767
    BiliClient.prefs.v767hubAutoConnect767 = !current
    AppToast.show(this, "Hub Auto Connect767: ${if (!current) "ON" else "OFF"}")
}

// v767: Icon Auto Theme767
internal fun PlayerActivity.showV767IconAutoTheme767Toggle() {
    val current = BiliClient.prefs.v767iconAutoTheme767
    BiliClient.prefs.v767iconAutoTheme767 = !current
    AppToast.show(this, "Icon Auto Theme767: ${if (!current) "ON" else "OFF"}")
}

// v767: Identity Auto Verify767
internal fun PlayerActivity.showV767IdentityAutoVerify767Toggle() {
    val current = BiliClient.prefs.v767identityAutoVerify767
    BiliClient.prefs.v767identityAutoVerify767 = !current
    AppToast.show(this, "Identity Auto Verify767: ${if (!current) "ON" else "OFF"}")
}

// v767: Idle Auto Dim767
internal fun PlayerActivity.showV767IdleAutoDim767Toggle() {
    val current = BiliClient.prefs.v767idleAutoDim767
    BiliClient.prefs.v767idleAutoDim767 = !current
    AppToast.show(this, "Idle Auto Dim767: ${if (!current) "ON" else "OFF"}")
}

// v767: Ignore Auto List767
internal fun PlayerActivity.showV767IgnoreAutoList767Toggle() {
    val current = BiliClient.prefs.v767ignoreAutoList767
    BiliClient.prefs.v767ignoreAutoList767 = !current
    AppToast.show(this, "Ignore Auto List767: ${if (!current) "ON" else "OFF"}")
}

// v767: Image Auto Preload767
internal fun PlayerActivity.showV767ImageAutoPreload767Toggle() {
    val current = BiliClient.prefs.v767imageAutoPreload767
    BiliClient.prefs.v767imageAutoPreload767 = !current
    AppToast.show(this, "Image Auto Preload767: ${if (!current) "ON" else "OFF"}")
}

// v767: Import Auto Merge767
internal fun PlayerActivity.showV767ImportAutoMerge767Toggle() {
    val current = BiliClient.prefs.v767importAutoMerge767
    BiliClient.prefs.v767importAutoMerge767 = !current
    AppToast.show(this, "Import Auto Merge767: ${if (!current) "ON" else "OFF"}")
}

// v767: Index Auto Build767
internal fun PlayerActivity.showV767IndexAutoBuild767Toggle() {
    val current = BiliClient.prefs.v767indexAutoBuild767
    BiliClient.prefs.v767indexAutoBuild767 = !current
    AppToast.show(this, "Index Auto Build767: ${if (!current) "ON" else "OFF"}")
}

// v767: Info Auto Popup767
internal fun PlayerActivity.showV767InfoAutoPopup767Toggle() {
    val current = BiliClient.prefs.v767infoAutoPopup767
    BiliClient.prefs.v767infoAutoPopup767 = !current
    AppToast.show(this, "Info Auto Popup767: ${if (!current) "ON" else "OFF"}")
}

// v768: Hit Auto Count768
internal fun PlayerActivity.showV768HitAutoCount768Toggle() {
    val current = BiliClient.prefs.v768hitAutoCount768
    BiliClient.prefs.v768hitAutoCount768 = !current
    AppToast.show(this, "Hit Auto Count768: ${if (!current) "ON" else "OFF"}")
}

// v768: Hold Auto Lock768
internal fun PlayerActivity.showV768HoldAutoLock768Toggle() {
    val current = BiliClient.prefs.v768holdAutoLock768
    BiliClient.prefs.v768holdAutoLock768 = !current
    AppToast.show(this, "Hold Auto Lock768: ${if (!current) "ON" else "OFF"}")
}

// v768: Hook Auto Inject768
internal fun PlayerActivity.showV768HookAutoInject768Toggle() {
    val current = BiliClient.prefs.v768hookAutoInject768
    BiliClient.prefs.v768hookAutoInject768 = !current
    AppToast.show(this, "Hook Auto Inject768: ${if (!current) "ON" else "OFF"}")
}

// v768: Host Auto Resolve768
internal fun PlayerActivity.showV768HostAutoResolve768Toggle() {
    val current = BiliClient.prefs.v768hostAutoResolve768
    BiliClient.prefs.v768hostAutoResolve768 = !current
    AppToast.show(this, "Host Auto Resolve768: ${if (!current) "ON" else "OFF"}")
}

// v768: Hot Auto Reload768
internal fun PlayerActivity.showV768HotAutoReload768Toggle() {
    val current = BiliClient.prefs.v768hotAutoReload768
    BiliClient.prefs.v768hotAutoReload768 = !current
    AppToast.show(this, "Hot Auto Reload768: ${if (!current) "ON" else "OFF"}")
}

// v768: Hover Auto Preview768
internal fun PlayerActivity.showV768HoverAutoPreview768Toggle() {
    val current = BiliClient.prefs.v768hoverAutoPreview768
    BiliClient.prefs.v768hoverAutoPreview768 = !current
    AppToast.show(this, "Hover Auto Preview768: ${if (!current) "ON" else "OFF"}")
}

// v768: Hub Auto Connect768
internal fun PlayerActivity.showV768HubAutoConnect768Toggle() {
    val current = BiliClient.prefs.v768hubAutoConnect768
    BiliClient.prefs.v768hubAutoConnect768 = !current
    AppToast.show(this, "Hub Auto Connect768: ${if (!current) "ON" else "OFF"}")
}

// v768: Icon Auto Theme768
internal fun PlayerActivity.showV768IconAutoTheme768Toggle() {
    val current = BiliClient.prefs.v768iconAutoTheme768
    BiliClient.prefs.v768iconAutoTheme768 = !current
    AppToast.show(this, "Icon Auto Theme768: ${if (!current) "ON" else "OFF"}")
}

// v768: Identity Auto Verify768
internal fun PlayerActivity.showV768IdentityAutoVerify768Toggle() {
    val current = BiliClient.prefs.v768identityAutoVerify768
    BiliClient.prefs.v768identityAutoVerify768 = !current
    AppToast.show(this, "Identity Auto Verify768: ${if (!current) "ON" else "OFF"}")
}

// v768: Idle Auto Dim768
internal fun PlayerActivity.showV768IdleAutoDim768Toggle() {
    val current = BiliClient.prefs.v768idleAutoDim768
    BiliClient.prefs.v768idleAutoDim768 = !current
    AppToast.show(this, "Idle Auto Dim768: ${if (!current) "ON" else "OFF"}")
}

// v768: Ignore Auto List768
internal fun PlayerActivity.showV768IgnoreAutoList768Toggle() {
    val current = BiliClient.prefs.v768ignoreAutoList768
    BiliClient.prefs.v768ignoreAutoList768 = !current
    AppToast.show(this, "Ignore Auto List768: ${if (!current) "ON" else "OFF"}")
}

// v768: Image Auto Preload768
internal fun PlayerActivity.showV768ImageAutoPreload768Toggle() {
    val current = BiliClient.prefs.v768imageAutoPreload768
    BiliClient.prefs.v768imageAutoPreload768 = !current
    AppToast.show(this, "Image Auto Preload768: ${if (!current) "ON" else "OFF"}")
}

// v768: Import Auto Merge768
internal fun PlayerActivity.showV768ImportAutoMerge768Toggle() {
    val current = BiliClient.prefs.v768importAutoMerge768
    BiliClient.prefs.v768importAutoMerge768 = !current
    AppToast.show(this, "Import Auto Merge768: ${if (!current) "ON" else "OFF"}")
}

// v768: Index Auto Build768
internal fun PlayerActivity.showV768IndexAutoBuild768Toggle() {
    val current = BiliClient.prefs.v768indexAutoBuild768
    BiliClient.prefs.v768indexAutoBuild768 = !current
    AppToast.show(this, "Index Auto Build768: ${if (!current) "ON" else "OFF"}")
}

// v768: Info Auto Popup768
internal fun PlayerActivity.showV768InfoAutoPopup768Toggle() {
    val current = BiliClient.prefs.v768infoAutoPopup768
    BiliClient.prefs.v768infoAutoPopup768 = !current
    AppToast.show(this, "Info Auto Popup768: ${if (!current) "ON" else "OFF"}")
}

// v769: Hit Auto Count769
internal fun PlayerActivity.showV769HitAutoCount769Toggle() {
    val current = BiliClient.prefs.v769hitAutoCount769
    BiliClient.prefs.v769hitAutoCount769 = !current
    AppToast.show(this, "Hit Auto Count769: ${if (!current) "ON" else "OFF"}")
}

// v769: Hold Auto Lock769
internal fun PlayerActivity.showV769HoldAutoLock769Toggle() {
    val current = BiliClient.prefs.v769holdAutoLock769
    BiliClient.prefs.v769holdAutoLock769 = !current
    AppToast.show(this, "Hold Auto Lock769: ${if (!current) "ON" else "OFF"}")
}

// v769: Hook Auto Inject769
internal fun PlayerActivity.showV769HookAutoInject769Toggle() {
    val current = BiliClient.prefs.v769hookAutoInject769
    BiliClient.prefs.v769hookAutoInject769 = !current
    AppToast.show(this, "Hook Auto Inject769: ${if (!current) "ON" else "OFF"}")
}

// v769: Host Auto Resolve769
internal fun PlayerActivity.showV769HostAutoResolve769Toggle() {
    val current = BiliClient.prefs.v769hostAutoResolve769
    BiliClient.prefs.v769hostAutoResolve769 = !current
    AppToast.show(this, "Host Auto Resolve769: ${if (!current) "ON" else "OFF"}")
}

// v769: Hot Auto Reload769
internal fun PlayerActivity.showV769HotAutoReload769Toggle() {
    val current = BiliClient.prefs.v769hotAutoReload769
    BiliClient.prefs.v769hotAutoReload769 = !current
    AppToast.show(this, "Hot Auto Reload769: ${if (!current) "ON" else "OFF"}")
}

// v769: Hover Auto Preview769
internal fun PlayerActivity.showV769HoverAutoPreview769Toggle() {
    val current = BiliClient.prefs.v769hoverAutoPreview769
    BiliClient.prefs.v769hoverAutoPreview769 = !current
    AppToast.show(this, "Hover Auto Preview769: ${if (!current) "ON" else "OFF"}")
}

// v769: Hub Auto Connect769
internal fun PlayerActivity.showV769HubAutoConnect769Toggle() {
    val current = BiliClient.prefs.v769hubAutoConnect769
    BiliClient.prefs.v769hubAutoConnect769 = !current
    AppToast.show(this, "Hub Auto Connect769: ${if (!current) "ON" else "OFF"}")
}

// v769: Icon Auto Theme769
internal fun PlayerActivity.showV769IconAutoTheme769Toggle() {
    val current = BiliClient.prefs.v769iconAutoTheme769
    BiliClient.prefs.v769iconAutoTheme769 = !current
    AppToast.show(this, "Icon Auto Theme769: ${if (!current) "ON" else "OFF"}")
}

// v769: Identity Auto Verify769
internal fun PlayerActivity.showV769IdentityAutoVerify769Toggle() {
    val current = BiliClient.prefs.v769identityAutoVerify769
    BiliClient.prefs.v769identityAutoVerify769 = !current
    AppToast.show(this, "Identity Auto Verify769: ${if (!current) "ON" else "OFF"}")
}

// v769: Idle Auto Dim769
internal fun PlayerActivity.showV769IdleAutoDim769Toggle() {
    val current = BiliClient.prefs.v769idleAutoDim769
    BiliClient.prefs.v769idleAutoDim769 = !current
    AppToast.show(this, "Idle Auto Dim769: ${if (!current) "ON" else "OFF"}")
}

// v769: Ignore Auto List769
internal fun PlayerActivity.showV769IgnoreAutoList769Toggle() {
    val current = BiliClient.prefs.v769ignoreAutoList769
    BiliClient.prefs.v769ignoreAutoList769 = !current
    AppToast.show(this, "Ignore Auto List769: ${if (!current) "ON" else "OFF"}")
}

// v769: Image Auto Preload769
internal fun PlayerActivity.showV769ImageAutoPreload769Toggle() {
    val current = BiliClient.prefs.v769imageAutoPreload769
    BiliClient.prefs.v769imageAutoPreload769 = !current
    AppToast.show(this, "Image Auto Preload769: ${if (!current) "ON" else "OFF"}")
}

// v769: Import Auto Merge769
internal fun PlayerActivity.showV769ImportAutoMerge769Toggle() {
    val current = BiliClient.prefs.v769importAutoMerge769
    BiliClient.prefs.v769importAutoMerge769 = !current
    AppToast.show(this, "Import Auto Merge769: ${if (!current) "ON" else "OFF"}")
}

// v769: Index Auto Build769
internal fun PlayerActivity.showV769IndexAutoBuild769Toggle() {
    val current = BiliClient.prefs.v769indexAutoBuild769
    BiliClient.prefs.v769indexAutoBuild769 = !current
    AppToast.show(this, "Index Auto Build769: ${if (!current) "ON" else "OFF"}")
}

// v769: Info Auto Popup769
internal fun PlayerActivity.showV769InfoAutoPopup769Toggle() {
    val current = BiliClient.prefs.v769infoAutoPopup769
    BiliClient.prefs.v769infoAutoPopup769 = !current
    AppToast.show(this, "Info Auto Popup769: ${if (!current) "ON" else "OFF"}")
}

// v770: Hit Auto Count770
internal fun PlayerActivity.showV770HitAutoCount770Toggle() {
    val current = BiliClient.prefs.v770hitAutoCount770
    BiliClient.prefs.v770hitAutoCount770 = !current
    AppToast.show(this, "Hit Auto Count770: ${if (!current) "ON" else "OFF"}")
}

// v770: Hold Auto Lock770
internal fun PlayerActivity.showV770HoldAutoLock770Toggle() {
    val current = BiliClient.prefs.v770holdAutoLock770
    BiliClient.prefs.v770holdAutoLock770 = !current
    AppToast.show(this, "Hold Auto Lock770: ${if (!current) "ON" else "OFF"}")
}

// v770: Hook Auto Inject770
internal fun PlayerActivity.showV770HookAutoInject770Toggle() {
    val current = BiliClient.prefs.v770hookAutoInject770
    BiliClient.prefs.v770hookAutoInject770 = !current
    AppToast.show(this, "Hook Auto Inject770: ${if (!current) "ON" else "OFF"}")
}

// v770: Host Auto Resolve770
internal fun PlayerActivity.showV770HostAutoResolve770Toggle() {
    val current = BiliClient.prefs.v770hostAutoResolve770
    BiliClient.prefs.v770hostAutoResolve770 = !current
    AppToast.show(this, "Host Auto Resolve770: ${if (!current) "ON" else "OFF"}")
}

// v770: Hot Auto Reload770
internal fun PlayerActivity.showV770HotAutoReload770Toggle() {
    val current = BiliClient.prefs.v770hotAutoReload770
    BiliClient.prefs.v770hotAutoReload770 = !current
    AppToast.show(this, "Hot Auto Reload770: ${if (!current) "ON" else "OFF"}")
}

// v770: Hover Auto Preview770
internal fun PlayerActivity.showV770HoverAutoPreview770Toggle() {
    val current = BiliClient.prefs.v770hoverAutoPreview770
    BiliClient.prefs.v770hoverAutoPreview770 = !current
    AppToast.show(this, "Hover Auto Preview770: ${if (!current) "ON" else "OFF"}")
}

// v770: Hub Auto Connect770
internal fun PlayerActivity.showV770HubAutoConnect770Toggle() {
    val current = BiliClient.prefs.v770hubAutoConnect770
    BiliClient.prefs.v770hubAutoConnect770 = !current
    AppToast.show(this, "Hub Auto Connect770: ${if (!current) "ON" else "OFF"}")
}

// v770: Icon Auto Theme770
internal fun PlayerActivity.showV770IconAutoTheme770Toggle() {
    val current = BiliClient.prefs.v770iconAutoTheme770
    BiliClient.prefs.v770iconAutoTheme770 = !current
    AppToast.show(this, "Icon Auto Theme770: ${if (!current) "ON" else "OFF"}")
}

// v770: Identity Auto Verify770
internal fun PlayerActivity.showV770IdentityAutoVerify770Toggle() {
    val current = BiliClient.prefs.v770identityAutoVerify770
    BiliClient.prefs.v770identityAutoVerify770 = !current
    AppToast.show(this, "Identity Auto Verify770: ${if (!current) "ON" else "OFF"}")
}

// v770: Idle Auto Dim770
internal fun PlayerActivity.showV770IdleAutoDim770Toggle() {
    val current = BiliClient.prefs.v770idleAutoDim770
    BiliClient.prefs.v770idleAutoDim770 = !current
    AppToast.show(this, "Idle Auto Dim770: ${if (!current) "ON" else "OFF"}")
}

// v770: Ignore Auto List770
internal fun PlayerActivity.showV770IgnoreAutoList770Toggle() {
    val current = BiliClient.prefs.v770ignoreAutoList770
    BiliClient.prefs.v770ignoreAutoList770 = !current
    AppToast.show(this, "Ignore Auto List770: ${if (!current) "ON" else "OFF"}")
}

// v770: Image Auto Preload770
internal fun PlayerActivity.showV770ImageAutoPreload770Toggle() {
    val current = BiliClient.prefs.v770imageAutoPreload770
    BiliClient.prefs.v770imageAutoPreload770 = !current
    AppToast.show(this, "Image Auto Preload770: ${if (!current) "ON" else "OFF"}")
}

// v770: Import Auto Merge770
internal fun PlayerActivity.showV770ImportAutoMerge770Toggle() {
    val current = BiliClient.prefs.v770importAutoMerge770
    BiliClient.prefs.v770importAutoMerge770 = !current
    AppToast.show(this, "Import Auto Merge770: ${if (!current) "ON" else "OFF"}")
}

// v770: Index Auto Build770
internal fun PlayerActivity.showV770IndexAutoBuild770Toggle() {
    val current = BiliClient.prefs.v770indexAutoBuild770
    BiliClient.prefs.v770indexAutoBuild770 = !current
    AppToast.show(this, "Index Auto Build770: ${if (!current) "ON" else "OFF"}")
}

// v770: Info Auto Popup770
internal fun PlayerActivity.showV770InfoAutoPopup770Toggle() {
    val current = BiliClient.prefs.v770infoAutoPopup770
    BiliClient.prefs.v770infoAutoPopup770 = !current
    AppToast.show(this, "Info Auto Popup770: ${if (!current) "ON" else "OFF"}")
}

