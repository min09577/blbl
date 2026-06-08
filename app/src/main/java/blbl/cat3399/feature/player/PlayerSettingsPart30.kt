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

internal fun PlayerActivity.showV415DisplayColorTemp415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayColorTemp415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayColorTemp415 = value
        AppToast.show(this, "Display Color Temp415: $value")
    }
}

internal fun PlayerActivity.showV415DividerAutoInsert415Toggle() {
    val current = BiliClient.prefs.v415dividerAutoInsert415
    BiliClient.prefs.v415dividerAutoInsert415 = !current
    AppToast.show(this, "Divider Auto Insert415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DomainAutoBlock415Toggle() {
    val current = BiliClient.prefs.v415domainAutoBlock415
    BiliClient.prefs.v415domainAutoBlock415 = !current
    AppToast.show(this, "Domain Auto Block415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DragDropEnabled415Toggle() {
    val current = BiliClient.prefs.v415dragDropEnabled415
    BiliClient.prefs.v415dragDropEnabled415 = !current
    AppToast.show(this, "Drag Drop Enabled415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DrawerAutoCollapse415Toggle() {
    val current = BiliClient.prefs.v415drawerAutoCollapse415
    BiliClient.prefs.v415drawerAutoCollapse415 = !current
    AppToast.show(this, "Drawer Auto Collapse415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DrmAutoDetect415Toggle() {
    val current = BiliClient.prefs.v415drmAutoDetect415
    BiliClient.prefs.v415drmAutoDetect415 = !current
    AppToast.show(this, "DRM Auto Detect415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DuplicateAutoRemove415Toggle() {
    val current = BiliClient.prefs.v415duplicateAutoRemove415
    BiliClient.prefs.v415duplicateAutoRemove415 = !current
    AppToast.show(this, "Duplicate Auto Remove415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DynamicIsland415Toggle() {
    val current = BiliClient.prefs.v415dynamicIsland415
    BiliClient.prefs.v415dynamicIsland415 = !current
    AppToast.show(this, "Dynamic Island415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DynamicThemeColor415Toggle() {
    val current = BiliClient.prefs.v415dynamicThemeColor415
    BiliClient.prefs.v415dynamicThemeColor415 = !current
    AppToast.show(this, "Dynamic Theme Color415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415EdgeTouchReject415Toggle() {
    val current = BiliClient.prefs.v415edgeTouchReject415
    BiliClient.prefs.v415edgeTouchReject415 = !current
    AppToast.show(this, "Edge Touch Reject415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415EmbedSubtitleTrack415Toggle() {
    val current = BiliClient.prefs.v415embedSubtitleTrack415
    BiliClient.prefs.v415embedSubtitleTrack415 = !current
    AppToast.show(this, "Embed Subtitle Track415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415EncodeAutoSelect415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415encodeAutoSelect415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415encodeAutoSelect415 = value
        AppToast.show(this, "Encode Auto Select415: $value")
    }
}

internal fun PlayerActivity.showV415EndpointAutoSwitch415Toggle() {
    val current = BiliClient.prefs.v415endpointAutoSwitch415
    BiliClient.prefs.v415endpointAutoSwitch415 = !current
    AppToast.show(this, "Endpoint Auto Switch415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415EngineAutoOptimize415Toggle() {
    val current = BiliClient.prefs.v415engineAutoOptimize415
    BiliClient.prefs.v415engineAutoOptimize415 = !current
    AppToast.show(this, "Engine Auto Optimize415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DisplayRefreshRate416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayRefreshRate416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayRefreshRate416 = value
        AppToast.show(this, "Display Refresh Rate416: $value")
    }
}

internal fun PlayerActivity.showV416DisplayColorTemp416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayColorTemp416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayColorTemp416 = value
        AppToast.show(this, "Display Color Temp416: $value")
    }
}

internal fun PlayerActivity.showV416DividerAutoInsert416Toggle() {
    val current = BiliClient.prefs.v416dividerAutoInsert416
    BiliClient.prefs.v416dividerAutoInsert416 = !current
    AppToast.show(this, "Divider Auto Insert416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DomainAutoBlock416Toggle() {
    val current = BiliClient.prefs.v416domainAutoBlock416
    BiliClient.prefs.v416domainAutoBlock416 = !current
    AppToast.show(this, "Domain Auto Block416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DragDropEnabled416Toggle() {
    val current = BiliClient.prefs.v416dragDropEnabled416
    BiliClient.prefs.v416dragDropEnabled416 = !current
    AppToast.show(this, "Drag Drop Enabled416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DrawerAutoCollapse416Toggle() {
    val current = BiliClient.prefs.v416drawerAutoCollapse416
    BiliClient.prefs.v416drawerAutoCollapse416 = !current
    AppToast.show(this, "Drawer Auto Collapse416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DrmAutoDetect416Toggle() {
    val current = BiliClient.prefs.v416drmAutoDetect416
    BiliClient.prefs.v416drmAutoDetect416 = !current
    AppToast.show(this, "DRM Auto Detect416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DuplicateAutoRemove416Toggle() {
    val current = BiliClient.prefs.v416duplicateAutoRemove416
    BiliClient.prefs.v416duplicateAutoRemove416 = !current
    AppToast.show(this, "Duplicate Auto Remove416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DynamicIsland416Toggle() {
    val current = BiliClient.prefs.v416dynamicIsland416
    BiliClient.prefs.v416dynamicIsland416 = !current
    AppToast.show(this, "Dynamic Island416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416DynamicThemeColor416Toggle() {
    val current = BiliClient.prefs.v416dynamicThemeColor416
    BiliClient.prefs.v416dynamicThemeColor416 = !current
    AppToast.show(this, "Dynamic Theme Color416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416EdgeTouchReject416Toggle() {
    val current = BiliClient.prefs.v416edgeTouchReject416
    BiliClient.prefs.v416edgeTouchReject416 = !current
    AppToast.show(this, "Edge Touch Reject416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416EmbedSubtitleTrack416Toggle() {
    val current = BiliClient.prefs.v416embedSubtitleTrack416
    BiliClient.prefs.v416embedSubtitleTrack416 = !current
    AppToast.show(this, "Embed Subtitle Track416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416EncodeAutoSelect416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416encodeAutoSelect416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416encodeAutoSelect416 = value
        AppToast.show(this, "Encode Auto Select416: $value")
    }
}

internal fun PlayerActivity.showV416EndpointAutoSwitch416Toggle() {
    val current = BiliClient.prefs.v416endpointAutoSwitch416
    BiliClient.prefs.v416endpointAutoSwitch416 = !current
    AppToast.show(this, "Endpoint Auto Switch416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV416EngineAutoOptimize416Toggle() {
    val current = BiliClient.prefs.v416engineAutoOptimize416
    BiliClient.prefs.v416engineAutoOptimize416 = !current
    AppToast.show(this, "Engine Auto Optimize416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DisplayRefreshRate417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayRefreshRate417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayRefreshRate417 = value
        AppToast.show(this, "Display Refresh Rate417: $value")
    }
}

internal fun PlayerActivity.showV417DisplayColorTemp417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayColorTemp417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayColorTemp417 = value
        AppToast.show(this, "Display Color Temp417: $value")
    }
}

internal fun PlayerActivity.showV417DividerAutoInsert417Toggle() {
    val current = BiliClient.prefs.v417dividerAutoInsert417
    BiliClient.prefs.v417dividerAutoInsert417 = !current
    AppToast.show(this, "Divider Auto Insert417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DomainAutoBlock417Toggle() {
    val current = BiliClient.prefs.v417domainAutoBlock417
    BiliClient.prefs.v417domainAutoBlock417 = !current
    AppToast.show(this, "Domain Auto Block417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DragDropEnabled417Toggle() {
    val current = BiliClient.prefs.v417dragDropEnabled417
    BiliClient.prefs.v417dragDropEnabled417 = !current
    AppToast.show(this, "Drag Drop Enabled417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DrawerAutoCollapse417Toggle() {
    val current = BiliClient.prefs.v417drawerAutoCollapse417
    BiliClient.prefs.v417drawerAutoCollapse417 = !current
    AppToast.show(this, "Drawer Auto Collapse417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DrmAutoDetect417Toggle() {
    val current = BiliClient.prefs.v417drmAutoDetect417
    BiliClient.prefs.v417drmAutoDetect417 = !current
    AppToast.show(this, "DRM Auto Detect417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DuplicateAutoRemove417Toggle() {
    val current = BiliClient.prefs.v417duplicateAutoRemove417
    BiliClient.prefs.v417duplicateAutoRemove417 = !current
    AppToast.show(this, "Duplicate Auto Remove417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DynamicIsland417Toggle() {
    val current = BiliClient.prefs.v417dynamicIsland417
    BiliClient.prefs.v417dynamicIsland417 = !current
    AppToast.show(this, "Dynamic Island417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417DynamicThemeColor417Toggle() {
    val current = BiliClient.prefs.v417dynamicThemeColor417
    BiliClient.prefs.v417dynamicThemeColor417 = !current
    AppToast.show(this, "Dynamic Theme Color417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417EdgeTouchReject417Toggle() {
    val current = BiliClient.prefs.v417edgeTouchReject417
    BiliClient.prefs.v417edgeTouchReject417 = !current
    AppToast.show(this, "Edge Touch Reject417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417EmbedSubtitleTrack417Toggle() {
    val current = BiliClient.prefs.v417embedSubtitleTrack417
    BiliClient.prefs.v417embedSubtitleTrack417 = !current
    AppToast.show(this, "Embed Subtitle Track417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417EncodeAutoSelect417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417encodeAutoSelect417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417encodeAutoSelect417 = value
        AppToast.show(this, "Encode Auto Select417: $value")
    }
}

internal fun PlayerActivity.showV417EndpointAutoSwitch417Toggle() {
    val current = BiliClient.prefs.v417endpointAutoSwitch417
    BiliClient.prefs.v417endpointAutoSwitch417 = !current
    AppToast.show(this, "Endpoint Auto Switch417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV417EngineAutoOptimize417Toggle() {
    val current = BiliClient.prefs.v417engineAutoOptimize417
    BiliClient.prefs.v417engineAutoOptimize417 = !current
    AppToast.show(this, "Engine Auto Optimize417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DisplayRefreshRate418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayRefreshRate418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayRefreshRate418 = value
        AppToast.show(this, "Display Refresh Rate418: $value")
    }
}

internal fun PlayerActivity.showV418DisplayColorTemp418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayColorTemp418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayColorTemp418 = value
        AppToast.show(this, "Display Color Temp418: $value")
    }
}

internal fun PlayerActivity.showV418DividerAutoInsert418Toggle() {
    val current = BiliClient.prefs.v418dividerAutoInsert418
    BiliClient.prefs.v418dividerAutoInsert418 = !current
    AppToast.show(this, "Divider Auto Insert418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DomainAutoBlock418Toggle() {
    val current = BiliClient.prefs.v418domainAutoBlock418
    BiliClient.prefs.v418domainAutoBlock418 = !current
    AppToast.show(this, "Domain Auto Block418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DragDropEnabled418Toggle() {
    val current = BiliClient.prefs.v418dragDropEnabled418
    BiliClient.prefs.v418dragDropEnabled418 = !current
    AppToast.show(this, "Drag Drop Enabled418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DrawerAutoCollapse418Toggle() {
    val current = BiliClient.prefs.v418drawerAutoCollapse418
    BiliClient.prefs.v418drawerAutoCollapse418 = !current
    AppToast.show(this, "Drawer Auto Collapse418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DrmAutoDetect418Toggle() {
    val current = BiliClient.prefs.v418drmAutoDetect418
    BiliClient.prefs.v418drmAutoDetect418 = !current
    AppToast.show(this, "DRM Auto Detect418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DuplicateAutoRemove418Toggle() {
    val current = BiliClient.prefs.v418duplicateAutoRemove418
    BiliClient.prefs.v418duplicateAutoRemove418 = !current
    AppToast.show(this, "Duplicate Auto Remove418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DynamicIsland418Toggle() {
    val current = BiliClient.prefs.v418dynamicIsland418
    BiliClient.prefs.v418dynamicIsland418 = !current
    AppToast.show(this, "Dynamic Island418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418DynamicThemeColor418Toggle() {
    val current = BiliClient.prefs.v418dynamicThemeColor418
    BiliClient.prefs.v418dynamicThemeColor418 = !current
    AppToast.show(this, "Dynamic Theme Color418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418EdgeTouchReject418Toggle() {
    val current = BiliClient.prefs.v418edgeTouchReject418
    BiliClient.prefs.v418edgeTouchReject418 = !current
    AppToast.show(this, "Edge Touch Reject418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418EmbedSubtitleTrack418Toggle() {
    val current = BiliClient.prefs.v418embedSubtitleTrack418
    BiliClient.prefs.v418embedSubtitleTrack418 = !current
    AppToast.show(this, "Embed Subtitle Track418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418EncodeAutoSelect418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418encodeAutoSelect418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418encodeAutoSelect418 = value
        AppToast.show(this, "Encode Auto Select418: $value")
    }
}

internal fun PlayerActivity.showV418EndpointAutoSwitch418Toggle() {
    val current = BiliClient.prefs.v418endpointAutoSwitch418
    BiliClient.prefs.v418endpointAutoSwitch418 = !current
    AppToast.show(this, "Endpoint Auto Switch418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV418EngineAutoOptimize418Toggle() {
    val current = BiliClient.prefs.v418engineAutoOptimize418
    BiliClient.prefs.v418engineAutoOptimize418 = !current
    AppToast.show(this, "Engine Auto Optimize418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DisplayRefreshRate419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayRefreshRate419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayRefreshRate419 = value
        AppToast.show(this, "Display Refresh Rate419: $value")
    }
}

internal fun PlayerActivity.showV419DisplayColorTemp419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayColorTemp419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayColorTemp419 = value
        AppToast.show(this, "Display Color Temp419: $value")
    }
}

internal fun PlayerActivity.showV419DividerAutoInsert419Toggle() {
    val current = BiliClient.prefs.v419dividerAutoInsert419
    BiliClient.prefs.v419dividerAutoInsert419 = !current
    AppToast.show(this, "Divider Auto Insert419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DomainAutoBlock419Toggle() {
    val current = BiliClient.prefs.v419domainAutoBlock419
    BiliClient.prefs.v419domainAutoBlock419 = !current
    AppToast.show(this, "Domain Auto Block419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DragDropEnabled419Toggle() {
    val current = BiliClient.prefs.v419dragDropEnabled419
    BiliClient.prefs.v419dragDropEnabled419 = !current
    AppToast.show(this, "Drag Drop Enabled419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DrawerAutoCollapse419Toggle() {
    val current = BiliClient.prefs.v419drawerAutoCollapse419
    BiliClient.prefs.v419drawerAutoCollapse419 = !current
    AppToast.show(this, "Drawer Auto Collapse419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DrmAutoDetect419Toggle() {
    val current = BiliClient.prefs.v419drmAutoDetect419
    BiliClient.prefs.v419drmAutoDetect419 = !current
    AppToast.show(this, "DRM Auto Detect419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DuplicateAutoRemove419Toggle() {
    val current = BiliClient.prefs.v419duplicateAutoRemove419
    BiliClient.prefs.v419duplicateAutoRemove419 = !current
    AppToast.show(this, "Duplicate Auto Remove419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DynamicIsland419Toggle() {
    val current = BiliClient.prefs.v419dynamicIsland419
    BiliClient.prefs.v419dynamicIsland419 = !current
    AppToast.show(this, "Dynamic Island419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419DynamicThemeColor419Toggle() {
    val current = BiliClient.prefs.v419dynamicThemeColor419
    BiliClient.prefs.v419dynamicThemeColor419 = !current
    AppToast.show(this, "Dynamic Theme Color419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419EdgeTouchReject419Toggle() {
    val current = BiliClient.prefs.v419edgeTouchReject419
    BiliClient.prefs.v419edgeTouchReject419 = !current
    AppToast.show(this, "Edge Touch Reject419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419EmbedSubtitleTrack419Toggle() {
    val current = BiliClient.prefs.v419embedSubtitleTrack419
    BiliClient.prefs.v419embedSubtitleTrack419 = !current
    AppToast.show(this, "Embed Subtitle Track419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419EncodeAutoSelect419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419encodeAutoSelect419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419encodeAutoSelect419 = value
        AppToast.show(this, "Encode Auto Select419: $value")
    }
}

internal fun PlayerActivity.showV419EndpointAutoSwitch419Toggle() {
    val current = BiliClient.prefs.v419endpointAutoSwitch419
    BiliClient.prefs.v419endpointAutoSwitch419 = !current
    AppToast.show(this, "Endpoint Auto Switch419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV419EngineAutoOptimize419Toggle() {
    val current = BiliClient.prefs.v419engineAutoOptimize419
    BiliClient.prefs.v419engineAutoOptimize419 = !current
    AppToast.show(this, "Engine Auto Optimize419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DisplayRefreshRate420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayRefreshRate420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayRefreshRate420 = value
        AppToast.show(this, "Display Refresh Rate420: $value")
    }
}

internal fun PlayerActivity.showV420DisplayColorTemp420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayColorTemp420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayColorTemp420 = value
        AppToast.show(this, "Display Color Temp420: $value")
    }
}

internal fun PlayerActivity.showV420DividerAutoInsert420Toggle() {
    val current = BiliClient.prefs.v420dividerAutoInsert420
    BiliClient.prefs.v420dividerAutoInsert420 = !current
    AppToast.show(this, "Divider Auto Insert420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DomainAutoBlock420Toggle() {
    val current = BiliClient.prefs.v420domainAutoBlock420
    BiliClient.prefs.v420domainAutoBlock420 = !current
    AppToast.show(this, "Domain Auto Block420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DragDropEnabled420Toggle() {
    val current = BiliClient.prefs.v420dragDropEnabled420
    BiliClient.prefs.v420dragDropEnabled420 = !current
    AppToast.show(this, "Drag Drop Enabled420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DrawerAutoCollapse420Toggle() {
    val current = BiliClient.prefs.v420drawerAutoCollapse420
    BiliClient.prefs.v420drawerAutoCollapse420 = !current
    AppToast.show(this, "Drawer Auto Collapse420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DrmAutoDetect420Toggle() {
    val current = BiliClient.prefs.v420drmAutoDetect420
    BiliClient.prefs.v420drmAutoDetect420 = !current
    AppToast.show(this, "DRM Auto Detect420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DuplicateAutoRemove420Toggle() {
    val current = BiliClient.prefs.v420duplicateAutoRemove420
    BiliClient.prefs.v420duplicateAutoRemove420 = !current
    AppToast.show(this, "Duplicate Auto Remove420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DynamicIsland420Toggle() {
    val current = BiliClient.prefs.v420dynamicIsland420
    BiliClient.prefs.v420dynamicIsland420 = !current
    AppToast.show(this, "Dynamic Island420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420DynamicThemeColor420Toggle() {
    val current = BiliClient.prefs.v420dynamicThemeColor420
    BiliClient.prefs.v420dynamicThemeColor420 = !current
    AppToast.show(this, "Dynamic Theme Color420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420EdgeTouchReject420Toggle() {
    val current = BiliClient.prefs.v420edgeTouchReject420
    BiliClient.prefs.v420edgeTouchReject420 = !current
    AppToast.show(this, "Edge Touch Reject420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420EmbedSubtitleTrack420Toggle() {
    val current = BiliClient.prefs.v420embedSubtitleTrack420
    BiliClient.prefs.v420embedSubtitleTrack420 = !current
    AppToast.show(this, "Embed Subtitle Track420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420EncodeAutoSelect420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420encodeAutoSelect420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420encodeAutoSelect420 = value
        AppToast.show(this, "Encode Auto Select420: $value")
    }
}

internal fun PlayerActivity.showV420EndpointAutoSwitch420Toggle() {
    val current = BiliClient.prefs.v420endpointAutoSwitch420
    BiliClient.prefs.v420endpointAutoSwitch420 = !current
    AppToast.show(this, "Endpoint Auto Switch420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV420EngineAutoOptimize420Toggle() {
    val current = BiliClient.prefs.v420engineAutoOptimize420
    BiliClient.prefs.v420engineAutoOptimize420 = !current
    AppToast.show(this, "Engine Auto Optimize420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421EnterAnimation421Toggle() {
    val current = BiliClient.prefs.v421enterAnimation421
    BiliClient.prefs.v421enterAnimation421 = !current
    AppToast.show(this, "Enter Animation421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421EnvironmentLightSensor421Toggle() {
    val current = BiliClient.prefs.v421environmentLightSensor421
    BiliClient.prefs.v421environmentLightSensor421 = !current
    AppToast.show(this, "Environment Light Sensor421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421ErrorAutoRetry421Toggle() {
    val current = BiliClient.prefs.v421errorAutoRetry421
    BiliClient.prefs.v421errorAutoRetry421 = !current
    AppToast.show(this, "Error Auto Retry421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421ErrorReportAuto421Toggle() {
    val current = BiliClient.prefs.v421errorReportAuto421
    BiliClient.prefs.v421errorReportAuto421 = !current
    AppToast.show(this, "Error Report Auto421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421EventAutoNotify421Toggle() {
    val current = BiliClient.prefs.v421eventAutoNotify421
    BiliClient.prefs.v421eventAutoNotify421 = !current
    AppToast.show(this, "Event Auto Notify421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421ExitConfirmation421Toggle() {
    val current = BiliClient.prefs.v421exitConfirmation421
    BiliClient.prefs.v421exitConfirmation421 = !current
    AppToast.show(this, "Exit Confirmation421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421ExpandOnDoubleTap421Toggle() {
    val current = BiliClient.prefs.v421expandOnDoubleTap421
    BiliClient.prefs.v421expandOnDoubleTap421 = !current
    AppToast.show(this, "Expand On Double Tap421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421ExportFormatDefault421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421exportFormatDefault421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421exportFormatDefault421 = value
        AppToast.show(this, "Export Format Default421: $value")
    }
}

internal fun PlayerActivity.showV421ExtractAudioAuto421Toggle() {
    val current = BiliClient.prefs.v421extractAudioAuto421
    BiliClient.prefs.v421extractAudioAuto421 = !current
    AppToast.show(this, "Extract Audio Auto421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421FadeTransition421Toggle() {
    val current = BiliClient.prefs.v421fadeTransition421
    BiliClient.prefs.v421fadeTransition421 = !current
    AppToast.show(this, "Fade Transition421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421FeedAutoRefresh421Toggle() {
    val current = BiliClient.prefs.v421feedAutoRefresh421
    BiliClient.prefs.v421feedAutoRefresh421 = !current
    AppToast.show(this, "Feed Auto Refresh421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421FeedLayoutStyle421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421feedLayoutStyle421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421feedLayoutStyle421 = value
        AppToast.show(this, "Feed Layout Style421: $value")
    }
}

internal fun PlayerActivity.showV421FileAutoOrganize421Toggle() {
    val current = BiliClient.prefs.v421fileAutoOrganize421
    BiliClient.prefs.v421fileAutoOrganize421 = !current
    AppToast.show(this, "File Auto Organize421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421FindInPageHighlight421Toggle() {
    val current = BiliClient.prefs.v421findInPageHighlight421
    BiliClient.prefs.v421findInPageHighlight421 = !current
    AppToast.show(this, "Find In Page Highlight421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV421FixCorruptAuto421Toggle() {
    val current = BiliClient.prefs.v421fixCorruptAuto421
    BiliClient.prefs.v421fixCorruptAuto421 = !current
    AppToast.show(this, "Fix Corrupt Auto421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422EnterAnimation422Toggle() {
    val current = BiliClient.prefs.v422enterAnimation422
    BiliClient.prefs.v422enterAnimation422 = !current
    AppToast.show(this, "Enter Animation422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422EnvironmentLightSensor422Toggle() {
    val current = BiliClient.prefs.v422environmentLightSensor422
    BiliClient.prefs.v422environmentLightSensor422 = !current
    AppToast.show(this, "Environment Light Sensor422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422ErrorAutoRetry422Toggle() {
    val current = BiliClient.prefs.v422errorAutoRetry422
    BiliClient.prefs.v422errorAutoRetry422 = !current
    AppToast.show(this, "Error Auto Retry422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422ErrorReportAuto422Toggle() {
    val current = BiliClient.prefs.v422errorReportAuto422
    BiliClient.prefs.v422errorReportAuto422 = !current
    AppToast.show(this, "Error Report Auto422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422EventAutoNotify422Toggle() {
    val current = BiliClient.prefs.v422eventAutoNotify422
    BiliClient.prefs.v422eventAutoNotify422 = !current
    AppToast.show(this, "Event Auto Notify422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422ExitConfirmation422Toggle() {
    val current = BiliClient.prefs.v422exitConfirmation422
    BiliClient.prefs.v422exitConfirmation422 = !current
    AppToast.show(this, "Exit Confirmation422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422ExpandOnDoubleTap422Toggle() {
    val current = BiliClient.prefs.v422expandOnDoubleTap422
    BiliClient.prefs.v422expandOnDoubleTap422 = !current
    AppToast.show(this, "Expand On Double Tap422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422ExportFormatDefault422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422exportFormatDefault422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422exportFormatDefault422 = value
        AppToast.show(this, "Export Format Default422: $value")
    }
}

internal fun PlayerActivity.showV422ExtractAudioAuto422Toggle() {
    val current = BiliClient.prefs.v422extractAudioAuto422
    BiliClient.prefs.v422extractAudioAuto422 = !current
    AppToast.show(this, "Extract Audio Auto422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422FadeTransition422Toggle() {
    val current = BiliClient.prefs.v422fadeTransition422
    BiliClient.prefs.v422fadeTransition422 = !current
    AppToast.show(this, "Fade Transition422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422FeedAutoRefresh422Toggle() {
    val current = BiliClient.prefs.v422feedAutoRefresh422
    BiliClient.prefs.v422feedAutoRefresh422 = !current
    AppToast.show(this, "Feed Auto Refresh422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422FeedLayoutStyle422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422feedLayoutStyle422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422feedLayoutStyle422 = value
        AppToast.show(this, "Feed Layout Style422: $value")
    }
}

internal fun PlayerActivity.showV422FileAutoOrganize422Toggle() {
    val current = BiliClient.prefs.v422fileAutoOrganize422
    BiliClient.prefs.v422fileAutoOrganize422 = !current
    AppToast.show(this, "File Auto Organize422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422FindInPageHighlight422Toggle() {
    val current = BiliClient.prefs.v422findInPageHighlight422
    BiliClient.prefs.v422findInPageHighlight422 = !current
    AppToast.show(this, "Find In Page Highlight422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV422FixCorruptAuto422Toggle() {
    val current = BiliClient.prefs.v422fixCorruptAuto422
    BiliClient.prefs.v422fixCorruptAuto422 = !current
    AppToast.show(this, "Fix Corrupt Auto422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423EnterAnimation423Toggle() {
    val current = BiliClient.prefs.v423enterAnimation423
    BiliClient.prefs.v423enterAnimation423 = !current
    AppToast.show(this, "Enter Animation423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423EnvironmentLightSensor423Toggle() {
    val current = BiliClient.prefs.v423environmentLightSensor423
    BiliClient.prefs.v423environmentLightSensor423 = !current
    AppToast.show(this, "Environment Light Sensor423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423ErrorAutoRetry423Toggle() {
    val current = BiliClient.prefs.v423errorAutoRetry423
    BiliClient.prefs.v423errorAutoRetry423 = !current
    AppToast.show(this, "Error Auto Retry423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423ErrorReportAuto423Toggle() {
    val current = BiliClient.prefs.v423errorReportAuto423
    BiliClient.prefs.v423errorReportAuto423 = !current
    AppToast.show(this, "Error Report Auto423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423EventAutoNotify423Toggle() {
    val current = BiliClient.prefs.v423eventAutoNotify423
    BiliClient.prefs.v423eventAutoNotify423 = !current
    AppToast.show(this, "Event Auto Notify423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423ExitConfirmation423Toggle() {
    val current = BiliClient.prefs.v423exitConfirmation423
    BiliClient.prefs.v423exitConfirmation423 = !current
    AppToast.show(this, "Exit Confirmation423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423ExpandOnDoubleTap423Toggle() {
    val current = BiliClient.prefs.v423expandOnDoubleTap423
    BiliClient.prefs.v423expandOnDoubleTap423 = !current
    AppToast.show(this, "Expand On Double Tap423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423ExportFormatDefault423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423exportFormatDefault423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423exportFormatDefault423 = value
        AppToast.show(this, "Export Format Default423: $value")
    }
}

internal fun PlayerActivity.showV423ExtractAudioAuto423Toggle() {
    val current = BiliClient.prefs.v423extractAudioAuto423
    BiliClient.prefs.v423extractAudioAuto423 = !current
    AppToast.show(this, "Extract Audio Auto423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423FadeTransition423Toggle() {
    val current = BiliClient.prefs.v423fadeTransition423
    BiliClient.prefs.v423fadeTransition423 = !current
    AppToast.show(this, "Fade Transition423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423FeedAutoRefresh423Toggle() {
    val current = BiliClient.prefs.v423feedAutoRefresh423
    BiliClient.prefs.v423feedAutoRefresh423 = !current
    AppToast.show(this, "Feed Auto Refresh423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423FeedLayoutStyle423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423feedLayoutStyle423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423feedLayoutStyle423 = value
        AppToast.show(this, "Feed Layout Style423: $value")
    }
}

internal fun PlayerActivity.showV423FileAutoOrganize423Toggle() {
    val current = BiliClient.prefs.v423fileAutoOrganize423
    BiliClient.prefs.v423fileAutoOrganize423 = !current
    AppToast.show(this, "File Auto Organize423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423FindInPageHighlight423Toggle() {
    val current = BiliClient.prefs.v423findInPageHighlight423
    BiliClient.prefs.v423findInPageHighlight423 = !current
    AppToast.show(this, "Find In Page Highlight423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV423FixCorruptAuto423Toggle() {
    val current = BiliClient.prefs.v423fixCorruptAuto423
    BiliClient.prefs.v423fixCorruptAuto423 = !current
    AppToast.show(this, "Fix Corrupt Auto423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424EnterAnimation424Toggle() {
    val current = BiliClient.prefs.v424enterAnimation424
    BiliClient.prefs.v424enterAnimation424 = !current
    AppToast.show(this, "Enter Animation424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424EnvironmentLightSensor424Toggle() {
    val current = BiliClient.prefs.v424environmentLightSensor424
    BiliClient.prefs.v424environmentLightSensor424 = !current
    AppToast.show(this, "Environment Light Sensor424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424ErrorAutoRetry424Toggle() {
    val current = BiliClient.prefs.v424errorAutoRetry424
    BiliClient.prefs.v424errorAutoRetry424 = !current
    AppToast.show(this, "Error Auto Retry424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424ErrorReportAuto424Toggle() {
    val current = BiliClient.prefs.v424errorReportAuto424
    BiliClient.prefs.v424errorReportAuto424 = !current
    AppToast.show(this, "Error Report Auto424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424EventAutoNotify424Toggle() {
    val current = BiliClient.prefs.v424eventAutoNotify424
    BiliClient.prefs.v424eventAutoNotify424 = !current
    AppToast.show(this, "Event Auto Notify424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424ExitConfirmation424Toggle() {
    val current = BiliClient.prefs.v424exitConfirmation424
    BiliClient.prefs.v424exitConfirmation424 = !current
    AppToast.show(this, "Exit Confirmation424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424ExpandOnDoubleTap424Toggle() {
    val current = BiliClient.prefs.v424expandOnDoubleTap424
    BiliClient.prefs.v424expandOnDoubleTap424 = !current
    AppToast.show(this, "Expand On Double Tap424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424ExportFormatDefault424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424exportFormatDefault424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424exportFormatDefault424 = value
        AppToast.show(this, "Export Format Default424: $value")
    }
}

internal fun PlayerActivity.showV424ExtractAudioAuto424Toggle() {
    val current = BiliClient.prefs.v424extractAudioAuto424
    BiliClient.prefs.v424extractAudioAuto424 = !current
    AppToast.show(this, "Extract Audio Auto424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424FadeTransition424Toggle() {
    val current = BiliClient.prefs.v424fadeTransition424
    BiliClient.prefs.v424fadeTransition424 = !current
    AppToast.show(this, "Fade Transition424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424FeedAutoRefresh424Toggle() {
    val current = BiliClient.prefs.v424feedAutoRefresh424
    BiliClient.prefs.v424feedAutoRefresh424 = !current
    AppToast.show(this, "Feed Auto Refresh424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424FeedLayoutStyle424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424feedLayoutStyle424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424feedLayoutStyle424 = value
        AppToast.show(this, "Feed Layout Style424: $value")
    }
}

internal fun PlayerActivity.showV424FileAutoOrganize424Toggle() {
    val current = BiliClient.prefs.v424fileAutoOrganize424
    BiliClient.prefs.v424fileAutoOrganize424 = !current
    AppToast.show(this, "File Auto Organize424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424FindInPageHighlight424Toggle() {
    val current = BiliClient.prefs.v424findInPageHighlight424
    BiliClient.prefs.v424findInPageHighlight424 = !current
    AppToast.show(this, "Find In Page Highlight424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV424FixCorruptAuto424Toggle() {
    val current = BiliClient.prefs.v424fixCorruptAuto424
    BiliClient.prefs.v424fixCorruptAuto424 = !current
    AppToast.show(this, "Fix Corrupt Auto424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425EnterAnimation425Toggle() {
    val current = BiliClient.prefs.v425enterAnimation425
    BiliClient.prefs.v425enterAnimation425 = !current
    AppToast.show(this, "Enter Animation425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425EnvironmentLightSensor425Toggle() {
    val current = BiliClient.prefs.v425environmentLightSensor425
    BiliClient.prefs.v425environmentLightSensor425 = !current
    AppToast.show(this, "Environment Light Sensor425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425ErrorAutoRetry425Toggle() {
    val current = BiliClient.prefs.v425errorAutoRetry425
    BiliClient.prefs.v425errorAutoRetry425 = !current
    AppToast.show(this, "Error Auto Retry425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425ErrorReportAuto425Toggle() {
    val current = BiliClient.prefs.v425errorReportAuto425
    BiliClient.prefs.v425errorReportAuto425 = !current
    AppToast.show(this, "Error Report Auto425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425EventAutoNotify425Toggle() {
    val current = BiliClient.prefs.v425eventAutoNotify425
    BiliClient.prefs.v425eventAutoNotify425 = !current
    AppToast.show(this, "Event Auto Notify425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425ExitConfirmation425Toggle() {
    val current = BiliClient.prefs.v425exitConfirmation425
    BiliClient.prefs.v425exitConfirmation425 = !current
    AppToast.show(this, "Exit Confirmation425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425ExpandOnDoubleTap425Toggle() {
    val current = BiliClient.prefs.v425expandOnDoubleTap425
    BiliClient.prefs.v425expandOnDoubleTap425 = !current
    AppToast.show(this, "Expand On Double Tap425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425ExportFormatDefault425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425exportFormatDefault425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425exportFormatDefault425 = value
        AppToast.show(this, "Export Format Default425: $value")
    }
}

internal fun PlayerActivity.showV425ExtractAudioAuto425Toggle() {
    val current = BiliClient.prefs.v425extractAudioAuto425
    BiliClient.prefs.v425extractAudioAuto425 = !current
    AppToast.show(this, "Extract Audio Auto425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425FadeTransition425Toggle() {
    val current = BiliClient.prefs.v425fadeTransition425
    BiliClient.prefs.v425fadeTransition425 = !current
    AppToast.show(this, "Fade Transition425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425FeedAutoRefresh425Toggle() {
    val current = BiliClient.prefs.v425feedAutoRefresh425
    BiliClient.prefs.v425feedAutoRefresh425 = !current
    AppToast.show(this, "Feed Auto Refresh425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425FeedLayoutStyle425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425feedLayoutStyle425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425feedLayoutStyle425 = value
        AppToast.show(this, "Feed Layout Style425: $value")
    }
}

internal fun PlayerActivity.showV425FileAutoOrganize425Toggle() {
    val current = BiliClient.prefs.v425fileAutoOrganize425
    BiliClient.prefs.v425fileAutoOrganize425 = !current
    AppToast.show(this, "File Auto Organize425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425FindInPageHighlight425Toggle() {
    val current = BiliClient.prefs.v425findInPageHighlight425
    BiliClient.prefs.v425findInPageHighlight425 = !current
    AppToast.show(this, "Find In Page Highlight425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV425FixCorruptAuto425Toggle() {
    val current = BiliClient.prefs.v425fixCorruptAuto425
    BiliClient.prefs.v425fixCorruptAuto425 = !current
    AppToast.show(this, "Fix Corrupt Auto425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426EnterAnimation426Toggle() {
    val current = BiliClient.prefs.v426enterAnimation426
    BiliClient.prefs.v426enterAnimation426 = !current
    AppToast.show(this, "Enter Animation426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426EnvironmentLightSensor426Toggle() {
    val current = BiliClient.prefs.v426environmentLightSensor426
    BiliClient.prefs.v426environmentLightSensor426 = !current
    AppToast.show(this, "Environment Light Sensor426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426ErrorAutoRetry426Toggle() {
    val current = BiliClient.prefs.v426errorAutoRetry426
    BiliClient.prefs.v426errorAutoRetry426 = !current
    AppToast.show(this, "Error Auto Retry426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426ErrorReportAuto426Toggle() {
    val current = BiliClient.prefs.v426errorReportAuto426
    BiliClient.prefs.v426errorReportAuto426 = !current
    AppToast.show(this, "Error Report Auto426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426EventAutoNotify426Toggle() {
    val current = BiliClient.prefs.v426eventAutoNotify426
    BiliClient.prefs.v426eventAutoNotify426 = !current
    AppToast.show(this, "Event Auto Notify426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426ExitConfirmation426Toggle() {
    val current = BiliClient.prefs.v426exitConfirmation426
    BiliClient.prefs.v426exitConfirmation426 = !current
    AppToast.show(this, "Exit Confirmation426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426ExpandOnDoubleTap426Toggle() {
    val current = BiliClient.prefs.v426expandOnDoubleTap426
    BiliClient.prefs.v426expandOnDoubleTap426 = !current
    AppToast.show(this, "Expand On Double Tap426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426ExportFormatDefault426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426exportFormatDefault426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426exportFormatDefault426 = value
        AppToast.show(this, "Export Format Default426: $value")
    }
}

internal fun PlayerActivity.showV426ExtractAudioAuto426Toggle() {
    val current = BiliClient.prefs.v426extractAudioAuto426
    BiliClient.prefs.v426extractAudioAuto426 = !current
    AppToast.show(this, "Extract Audio Auto426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426FadeTransition426Toggle() {
    val current = BiliClient.prefs.v426fadeTransition426
    BiliClient.prefs.v426fadeTransition426 = !current
    AppToast.show(this, "Fade Transition426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426FeedAutoRefresh426Toggle() {
    val current = BiliClient.prefs.v426feedAutoRefresh426
    BiliClient.prefs.v426feedAutoRefresh426 = !current
    AppToast.show(this, "Feed Auto Refresh426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426FeedLayoutStyle426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426feedLayoutStyle426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426feedLayoutStyle426 = value
        AppToast.show(this, "Feed Layout Style426: $value")
    }
}

internal fun PlayerActivity.showV426FileAutoOrganize426Toggle() {
    val current = BiliClient.prefs.v426fileAutoOrganize426
    BiliClient.prefs.v426fileAutoOrganize426 = !current
    AppToast.show(this, "File Auto Organize426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426FindInPageHighlight426Toggle() {
    val current = BiliClient.prefs.v426findInPageHighlight426
    BiliClient.prefs.v426findInPageHighlight426 = !current
    AppToast.show(this, "Find In Page Highlight426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV426FixCorruptAuto426Toggle() {
    val current = BiliClient.prefs.v426fixCorruptAuto426
    BiliClient.prefs.v426fixCorruptAuto426 = !current
    AppToast.show(this, "Fix Corrupt Auto426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427EnterAnimation427Toggle() {
    val current = BiliClient.prefs.v427enterAnimation427
    BiliClient.prefs.v427enterAnimation427 = !current
    AppToast.show(this, "Enter Animation427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427EnvironmentLightSensor427Toggle() {
    val current = BiliClient.prefs.v427environmentLightSensor427
    BiliClient.prefs.v427environmentLightSensor427 = !current
    AppToast.show(this, "Environment Light Sensor427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427ErrorAutoRetry427Toggle() {
    val current = BiliClient.prefs.v427errorAutoRetry427
    BiliClient.prefs.v427errorAutoRetry427 = !current
    AppToast.show(this, "Error Auto Retry427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427ErrorReportAuto427Toggle() {
    val current = BiliClient.prefs.v427errorReportAuto427
    BiliClient.prefs.v427errorReportAuto427 = !current
    AppToast.show(this, "Error Report Auto427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427EventAutoNotify427Toggle() {
    val current = BiliClient.prefs.v427eventAutoNotify427
    BiliClient.prefs.v427eventAutoNotify427 = !current
    AppToast.show(this, "Event Auto Notify427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427ExitConfirmation427Toggle() {
    val current = BiliClient.prefs.v427exitConfirmation427
    BiliClient.prefs.v427exitConfirmation427 = !current
    AppToast.show(this, "Exit Confirmation427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427ExpandOnDoubleTap427Toggle() {
    val current = BiliClient.prefs.v427expandOnDoubleTap427
    BiliClient.prefs.v427expandOnDoubleTap427 = !current
    AppToast.show(this, "Expand On Double Tap427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427ExportFormatDefault427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427exportFormatDefault427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427exportFormatDefault427 = value
        AppToast.show(this, "Export Format Default427: $value")
    }
}

internal fun PlayerActivity.showV427ExtractAudioAuto427Toggle() {
    val current = BiliClient.prefs.v427extractAudioAuto427
    BiliClient.prefs.v427extractAudioAuto427 = !current
    AppToast.show(this, "Extract Audio Auto427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427FadeTransition427Toggle() {
    val current = BiliClient.prefs.v427fadeTransition427
    BiliClient.prefs.v427fadeTransition427 = !current
    AppToast.show(this, "Fade Transition427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427FeedAutoRefresh427Toggle() {
    val current = BiliClient.prefs.v427feedAutoRefresh427
    BiliClient.prefs.v427feedAutoRefresh427 = !current
    AppToast.show(this, "Feed Auto Refresh427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427FeedLayoutStyle427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427feedLayoutStyle427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427feedLayoutStyle427 = value
        AppToast.show(this, "Feed Layout Style427: $value")
    }
}

internal fun PlayerActivity.showV427FileAutoOrganize427Toggle() {
    val current = BiliClient.prefs.v427fileAutoOrganize427
    BiliClient.prefs.v427fileAutoOrganize427 = !current
    AppToast.show(this, "File Auto Organize427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427FindInPageHighlight427Toggle() {
    val current = BiliClient.prefs.v427findInPageHighlight427
    BiliClient.prefs.v427findInPageHighlight427 = !current
    AppToast.show(this, "Find In Page Highlight427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV427FixCorruptAuto427Toggle() {
    val current = BiliClient.prefs.v427fixCorruptAuto427
    BiliClient.prefs.v427fixCorruptAuto427 = !current
    AppToast.show(this, "Fix Corrupt Auto427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428EnterAnimation428Toggle() {
    val current = BiliClient.prefs.v428enterAnimation428
    BiliClient.prefs.v428enterAnimation428 = !current
    AppToast.show(this, "Enter Animation428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428EnvironmentLightSensor428Toggle() {
    val current = BiliClient.prefs.v428environmentLightSensor428
    BiliClient.prefs.v428environmentLightSensor428 = !current
    AppToast.show(this, "Environment Light Sensor428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428ErrorAutoRetry428Toggle() {
    val current = BiliClient.prefs.v428errorAutoRetry428
    BiliClient.prefs.v428errorAutoRetry428 = !current
    AppToast.show(this, "Error Auto Retry428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428ErrorReportAuto428Toggle() {
    val current = BiliClient.prefs.v428errorReportAuto428
    BiliClient.prefs.v428errorReportAuto428 = !current
    AppToast.show(this, "Error Report Auto428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428EventAutoNotify428Toggle() {
    val current = BiliClient.prefs.v428eventAutoNotify428
    BiliClient.prefs.v428eventAutoNotify428 = !current
    AppToast.show(this, "Event Auto Notify428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV428ExitConfirmation428Toggle() {
    val current = BiliClient.prefs.v428exitConfirmation428
    BiliClient.prefs.v428exitConfirmation428 = !current
    AppToast.show(this, "Exit Confirmation428: ${if (!current) "ON" else "OFF"}")
}

