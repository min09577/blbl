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

internal fun PlayerActivity.showV401DensityAutoAdjust401Toggle() {
    val current = BiliClient.prefs.v401densityAutoAdjust401
    BiliClient.prefs.v401densityAutoAdjust401 = !current
    AppToast.show(this, "Density Auto Adjust401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401DeployAutoUpdate401Toggle() {
    val current = BiliClient.prefs.v401deployAutoUpdate401
    BiliClient.prefs.v401deployAutoUpdate401 = !current
    AppToast.show(this, "Deploy Auto Update401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401DetectMotionEnabled401Toggle() {
    val current = BiliClient.prefs.v401detectMotionEnabled401
    BiliClient.prefs.v401detectMotionEnabled401 = !current
    AppToast.show(this, "Detect Motion Enabled401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV401DimScreenOnIdle401Toggle() {
    val current = BiliClient.prefs.v401dimScreenOnIdle401
    BiliClient.prefs.v401dimScreenOnIdle401 = !current
    AppToast.show(this, "Dim Screen On Idle401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402CloudAutoSync402Toggle() {
    val current = BiliClient.prefs.v402cloudAutoSync402
    BiliClient.prefs.v402cloudAutoSync402 = !current
    AppToast.show(this, "Cloud Auto Sync402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402CloudStorageLimit402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402cloudStorageLimit402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402cloudStorageLimit402 = value
        AppToast.show(this, "Cloud Storage Limit402: $value")
    }
}

internal fun PlayerActivity.showV402CollectAutoCategorize402Toggle() {
    val current = BiliClient.prefs.v402collectAutoCategorize402
    BiliClient.prefs.v402collectAutoCategorize402 = !current
    AppToast.show(this, "Collect Auto Categorize402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402CompactModeEnabled402Toggle() {
    val current = BiliClient.prefs.v402compactModeEnabled402
    BiliClient.prefs.v402compactModeEnabled402 = !current
    AppToast.show(this, "Compact Mode Enabled402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402CompressAutoQuality402Toggle() {
    val current = BiliClient.prefs.v402compressAutoQuality402
    BiliClient.prefs.v402compressAutoQuality402 = !current
    AppToast.show(this, "Compress Auto Quality402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402ConnectAutoRetry402Toggle() {
    val current = BiliClient.prefs.v402connectAutoRetry402
    BiliClient.prefs.v402connectAutoRetry402 = !current
    AppToast.show(this, "Connect Auto Retry402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402DashboardWidgetLayout402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402dashboardWidgetLayout402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402dashboardWidgetLayout402 = value
        AppToast.show(this, "Dashboard Widget Layout402: $value")
    }
}

internal fun PlayerActivity.showV402DebugLogVerbose402Toggle() {
    val current = BiliClient.prefs.v402debugLogVerbose402
    BiliClient.prefs.v402debugLogVerbose402 = !current
    AppToast.show(this, "Debug Log Verbose402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402DeepColorEnabled402Toggle() {
    val current = BiliClient.prefs.v402deepColorEnabled402
    BiliClient.prefs.v402deepColorEnabled402 = !current
    AppToast.show(this, "Deep Color Enabled402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402DefaultPlayerEngine402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402defaultPlayerEngine402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402defaultPlayerEngine402 = value
        AppToast.show(this, "Default Player Engine402: $value")
    }
}

internal fun PlayerActivity.showV402DelayStartMs402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v402delayStartMs402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v402delayStartMs402 = value
        AppToast.show(this, "Delay Start Ms402: $value")
    }
}

internal fun PlayerActivity.showV402DensityAutoAdjust402Toggle() {
    val current = BiliClient.prefs.v402densityAutoAdjust402
    BiliClient.prefs.v402densityAutoAdjust402 = !current
    AppToast.show(this, "Density Auto Adjust402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402DeployAutoUpdate402Toggle() {
    val current = BiliClient.prefs.v402deployAutoUpdate402
    BiliClient.prefs.v402deployAutoUpdate402 = !current
    AppToast.show(this, "Deploy Auto Update402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402DetectMotionEnabled402Toggle() {
    val current = BiliClient.prefs.v402detectMotionEnabled402
    BiliClient.prefs.v402detectMotionEnabled402 = !current
    AppToast.show(this, "Detect Motion Enabled402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV402DimScreenOnIdle402Toggle() {
    val current = BiliClient.prefs.v402dimScreenOnIdle402
    BiliClient.prefs.v402dimScreenOnIdle402 = !current
    AppToast.show(this, "Dim Screen On Idle402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403CloudAutoSync403Toggle() {
    val current = BiliClient.prefs.v403cloudAutoSync403
    BiliClient.prefs.v403cloudAutoSync403 = !current
    AppToast.show(this, "Cloud Auto Sync403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403CloudStorageLimit403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403cloudStorageLimit403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403cloudStorageLimit403 = value
        AppToast.show(this, "Cloud Storage Limit403: $value")
    }
}

internal fun PlayerActivity.showV403CollectAutoCategorize403Toggle() {
    val current = BiliClient.prefs.v403collectAutoCategorize403
    BiliClient.prefs.v403collectAutoCategorize403 = !current
    AppToast.show(this, "Collect Auto Categorize403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403CompactModeEnabled403Toggle() {
    val current = BiliClient.prefs.v403compactModeEnabled403
    BiliClient.prefs.v403compactModeEnabled403 = !current
    AppToast.show(this, "Compact Mode Enabled403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403CompressAutoQuality403Toggle() {
    val current = BiliClient.prefs.v403compressAutoQuality403
    BiliClient.prefs.v403compressAutoQuality403 = !current
    AppToast.show(this, "Compress Auto Quality403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403ConnectAutoRetry403Toggle() {
    val current = BiliClient.prefs.v403connectAutoRetry403
    BiliClient.prefs.v403connectAutoRetry403 = !current
    AppToast.show(this, "Connect Auto Retry403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403DashboardWidgetLayout403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403dashboardWidgetLayout403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403dashboardWidgetLayout403 = value
        AppToast.show(this, "Dashboard Widget Layout403: $value")
    }
}

internal fun PlayerActivity.showV403DebugLogVerbose403Toggle() {
    val current = BiliClient.prefs.v403debugLogVerbose403
    BiliClient.prefs.v403debugLogVerbose403 = !current
    AppToast.show(this, "Debug Log Verbose403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403DeepColorEnabled403Toggle() {
    val current = BiliClient.prefs.v403deepColorEnabled403
    BiliClient.prefs.v403deepColorEnabled403 = !current
    AppToast.show(this, "Deep Color Enabled403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403DefaultPlayerEngine403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403defaultPlayerEngine403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403defaultPlayerEngine403 = value
        AppToast.show(this, "Default Player Engine403: $value")
    }
}

internal fun PlayerActivity.showV403DelayStartMs403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v403delayStartMs403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v403delayStartMs403 = value
        AppToast.show(this, "Delay Start Ms403: $value")
    }
}

internal fun PlayerActivity.showV403DensityAutoAdjust403Toggle() {
    val current = BiliClient.prefs.v403densityAutoAdjust403
    BiliClient.prefs.v403densityAutoAdjust403 = !current
    AppToast.show(this, "Density Auto Adjust403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403DeployAutoUpdate403Toggle() {
    val current = BiliClient.prefs.v403deployAutoUpdate403
    BiliClient.prefs.v403deployAutoUpdate403 = !current
    AppToast.show(this, "Deploy Auto Update403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403DetectMotionEnabled403Toggle() {
    val current = BiliClient.prefs.v403detectMotionEnabled403
    BiliClient.prefs.v403detectMotionEnabled403 = !current
    AppToast.show(this, "Detect Motion Enabled403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV403DimScreenOnIdle403Toggle() {
    val current = BiliClient.prefs.v403dimScreenOnIdle403
    BiliClient.prefs.v403dimScreenOnIdle403 = !current
    AppToast.show(this, "Dim Screen On Idle403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404CloudAutoSync404Toggle() {
    val current = BiliClient.prefs.v404cloudAutoSync404
    BiliClient.prefs.v404cloudAutoSync404 = !current
    AppToast.show(this, "Cloud Auto Sync404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404CloudStorageLimit404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404cloudStorageLimit404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404cloudStorageLimit404 = value
        AppToast.show(this, "Cloud Storage Limit404: $value")
    }
}

internal fun PlayerActivity.showV404CollectAutoCategorize404Toggle() {
    val current = BiliClient.prefs.v404collectAutoCategorize404
    BiliClient.prefs.v404collectAutoCategorize404 = !current
    AppToast.show(this, "Collect Auto Categorize404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404CompactModeEnabled404Toggle() {
    val current = BiliClient.prefs.v404compactModeEnabled404
    BiliClient.prefs.v404compactModeEnabled404 = !current
    AppToast.show(this, "Compact Mode Enabled404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404CompressAutoQuality404Toggle() {
    val current = BiliClient.prefs.v404compressAutoQuality404
    BiliClient.prefs.v404compressAutoQuality404 = !current
    AppToast.show(this, "Compress Auto Quality404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404ConnectAutoRetry404Toggle() {
    val current = BiliClient.prefs.v404connectAutoRetry404
    BiliClient.prefs.v404connectAutoRetry404 = !current
    AppToast.show(this, "Connect Auto Retry404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404DashboardWidgetLayout404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404dashboardWidgetLayout404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404dashboardWidgetLayout404 = value
        AppToast.show(this, "Dashboard Widget Layout404: $value")
    }
}

internal fun PlayerActivity.showV404DebugLogVerbose404Toggle() {
    val current = BiliClient.prefs.v404debugLogVerbose404
    BiliClient.prefs.v404debugLogVerbose404 = !current
    AppToast.show(this, "Debug Log Verbose404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404DeepColorEnabled404Toggle() {
    val current = BiliClient.prefs.v404deepColorEnabled404
    BiliClient.prefs.v404deepColorEnabled404 = !current
    AppToast.show(this, "Deep Color Enabled404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404DefaultPlayerEngine404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404defaultPlayerEngine404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404defaultPlayerEngine404 = value
        AppToast.show(this, "Default Player Engine404: $value")
    }
}

internal fun PlayerActivity.showV404DelayStartMs404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v404delayStartMs404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v404delayStartMs404 = value
        AppToast.show(this, "Delay Start Ms404: $value")
    }
}

internal fun PlayerActivity.showV404DensityAutoAdjust404Toggle() {
    val current = BiliClient.prefs.v404densityAutoAdjust404
    BiliClient.prefs.v404densityAutoAdjust404 = !current
    AppToast.show(this, "Density Auto Adjust404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404DeployAutoUpdate404Toggle() {
    val current = BiliClient.prefs.v404deployAutoUpdate404
    BiliClient.prefs.v404deployAutoUpdate404 = !current
    AppToast.show(this, "Deploy Auto Update404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404DetectMotionEnabled404Toggle() {
    val current = BiliClient.prefs.v404detectMotionEnabled404
    BiliClient.prefs.v404detectMotionEnabled404 = !current
    AppToast.show(this, "Detect Motion Enabled404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV404DimScreenOnIdle404Toggle() {
    val current = BiliClient.prefs.v404dimScreenOnIdle404
    BiliClient.prefs.v404dimScreenOnIdle404 = !current
    AppToast.show(this, "Dim Screen On Idle404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405CloudAutoSync405Toggle() {
    val current = BiliClient.prefs.v405cloudAutoSync405
    BiliClient.prefs.v405cloudAutoSync405 = !current
    AppToast.show(this, "Cloud Auto Sync405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405CloudStorageLimit405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405cloudStorageLimit405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405cloudStorageLimit405 = value
        AppToast.show(this, "Cloud Storage Limit405: $value")
    }
}

internal fun PlayerActivity.showV405CollectAutoCategorize405Toggle() {
    val current = BiliClient.prefs.v405collectAutoCategorize405
    BiliClient.prefs.v405collectAutoCategorize405 = !current
    AppToast.show(this, "Collect Auto Categorize405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405CompactModeEnabled405Toggle() {
    val current = BiliClient.prefs.v405compactModeEnabled405
    BiliClient.prefs.v405compactModeEnabled405 = !current
    AppToast.show(this, "Compact Mode Enabled405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405CompressAutoQuality405Toggle() {
    val current = BiliClient.prefs.v405compressAutoQuality405
    BiliClient.prefs.v405compressAutoQuality405 = !current
    AppToast.show(this, "Compress Auto Quality405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405ConnectAutoRetry405Toggle() {
    val current = BiliClient.prefs.v405connectAutoRetry405
    BiliClient.prefs.v405connectAutoRetry405 = !current
    AppToast.show(this, "Connect Auto Retry405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405DashboardWidgetLayout405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405dashboardWidgetLayout405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405dashboardWidgetLayout405 = value
        AppToast.show(this, "Dashboard Widget Layout405: $value")
    }
}

internal fun PlayerActivity.showV405DebugLogVerbose405Toggle() {
    val current = BiliClient.prefs.v405debugLogVerbose405
    BiliClient.prefs.v405debugLogVerbose405 = !current
    AppToast.show(this, "Debug Log Verbose405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405DeepColorEnabled405Toggle() {
    val current = BiliClient.prefs.v405deepColorEnabled405
    BiliClient.prefs.v405deepColorEnabled405 = !current
    AppToast.show(this, "Deep Color Enabled405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405DefaultPlayerEngine405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405defaultPlayerEngine405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405defaultPlayerEngine405 = value
        AppToast.show(this, "Default Player Engine405: $value")
    }
}

internal fun PlayerActivity.showV405DelayStartMs405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v405delayStartMs405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v405delayStartMs405 = value
        AppToast.show(this, "Delay Start Ms405: $value")
    }
}

internal fun PlayerActivity.showV405DensityAutoAdjust405Toggle() {
    val current = BiliClient.prefs.v405densityAutoAdjust405
    BiliClient.prefs.v405densityAutoAdjust405 = !current
    AppToast.show(this, "Density Auto Adjust405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405DeployAutoUpdate405Toggle() {
    val current = BiliClient.prefs.v405deployAutoUpdate405
    BiliClient.prefs.v405deployAutoUpdate405 = !current
    AppToast.show(this, "Deploy Auto Update405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405DetectMotionEnabled405Toggle() {
    val current = BiliClient.prefs.v405detectMotionEnabled405
    BiliClient.prefs.v405detectMotionEnabled405 = !current
    AppToast.show(this, "Detect Motion Enabled405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV405DimScreenOnIdle405Toggle() {
    val current = BiliClient.prefs.v405dimScreenOnIdle405
    BiliClient.prefs.v405dimScreenOnIdle405 = !current
    AppToast.show(this, "Dim Screen On Idle405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406CloudAutoSync406Toggle() {
    val current = BiliClient.prefs.v406cloudAutoSync406
    BiliClient.prefs.v406cloudAutoSync406 = !current
    AppToast.show(this, "Cloud Auto Sync406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406CloudStorageLimit406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406cloudStorageLimit406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406cloudStorageLimit406 = value
        AppToast.show(this, "Cloud Storage Limit406: $value")
    }
}

internal fun PlayerActivity.showV406CollectAutoCategorize406Toggle() {
    val current = BiliClient.prefs.v406collectAutoCategorize406
    BiliClient.prefs.v406collectAutoCategorize406 = !current
    AppToast.show(this, "Collect Auto Categorize406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406CompactModeEnabled406Toggle() {
    val current = BiliClient.prefs.v406compactModeEnabled406
    BiliClient.prefs.v406compactModeEnabled406 = !current
    AppToast.show(this, "Compact Mode Enabled406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406CompressAutoQuality406Toggle() {
    val current = BiliClient.prefs.v406compressAutoQuality406
    BiliClient.prefs.v406compressAutoQuality406 = !current
    AppToast.show(this, "Compress Auto Quality406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406ConnectAutoRetry406Toggle() {
    val current = BiliClient.prefs.v406connectAutoRetry406
    BiliClient.prefs.v406connectAutoRetry406 = !current
    AppToast.show(this, "Connect Auto Retry406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406DashboardWidgetLayout406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406dashboardWidgetLayout406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406dashboardWidgetLayout406 = value
        AppToast.show(this, "Dashboard Widget Layout406: $value")
    }
}

internal fun PlayerActivity.showV406DebugLogVerbose406Toggle() {
    val current = BiliClient.prefs.v406debugLogVerbose406
    BiliClient.prefs.v406debugLogVerbose406 = !current
    AppToast.show(this, "Debug Log Verbose406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406DeepColorEnabled406Toggle() {
    val current = BiliClient.prefs.v406deepColorEnabled406
    BiliClient.prefs.v406deepColorEnabled406 = !current
    AppToast.show(this, "Deep Color Enabled406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406DefaultPlayerEngine406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406defaultPlayerEngine406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406defaultPlayerEngine406 = value
        AppToast.show(this, "Default Player Engine406: $value")
    }
}

internal fun PlayerActivity.showV406DelayStartMs406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v406delayStartMs406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v406delayStartMs406 = value
        AppToast.show(this, "Delay Start Ms406: $value")
    }
}

internal fun PlayerActivity.showV406DensityAutoAdjust406Toggle() {
    val current = BiliClient.prefs.v406densityAutoAdjust406
    BiliClient.prefs.v406densityAutoAdjust406 = !current
    AppToast.show(this, "Density Auto Adjust406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406DeployAutoUpdate406Toggle() {
    val current = BiliClient.prefs.v406deployAutoUpdate406
    BiliClient.prefs.v406deployAutoUpdate406 = !current
    AppToast.show(this, "Deploy Auto Update406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406DetectMotionEnabled406Toggle() {
    val current = BiliClient.prefs.v406detectMotionEnabled406
    BiliClient.prefs.v406detectMotionEnabled406 = !current
    AppToast.show(this, "Detect Motion Enabled406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV406DimScreenOnIdle406Toggle() {
    val current = BiliClient.prefs.v406dimScreenOnIdle406
    BiliClient.prefs.v406dimScreenOnIdle406 = !current
    AppToast.show(this, "Dim Screen On Idle406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407CloudAutoSync407Toggle() {
    val current = BiliClient.prefs.v407cloudAutoSync407
    BiliClient.prefs.v407cloudAutoSync407 = !current
    AppToast.show(this, "Cloud Auto Sync407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407CloudStorageLimit407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407cloudStorageLimit407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407cloudStorageLimit407 = value
        AppToast.show(this, "Cloud Storage Limit407: $value")
    }
}

internal fun PlayerActivity.showV407CollectAutoCategorize407Toggle() {
    val current = BiliClient.prefs.v407collectAutoCategorize407
    BiliClient.prefs.v407collectAutoCategorize407 = !current
    AppToast.show(this, "Collect Auto Categorize407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407CompactModeEnabled407Toggle() {
    val current = BiliClient.prefs.v407compactModeEnabled407
    BiliClient.prefs.v407compactModeEnabled407 = !current
    AppToast.show(this, "Compact Mode Enabled407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407CompressAutoQuality407Toggle() {
    val current = BiliClient.prefs.v407compressAutoQuality407
    BiliClient.prefs.v407compressAutoQuality407 = !current
    AppToast.show(this, "Compress Auto Quality407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407ConnectAutoRetry407Toggle() {
    val current = BiliClient.prefs.v407connectAutoRetry407
    BiliClient.prefs.v407connectAutoRetry407 = !current
    AppToast.show(this, "Connect Auto Retry407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407DashboardWidgetLayout407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407dashboardWidgetLayout407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407dashboardWidgetLayout407 = value
        AppToast.show(this, "Dashboard Widget Layout407: $value")
    }
}

internal fun PlayerActivity.showV407DebugLogVerbose407Toggle() {
    val current = BiliClient.prefs.v407debugLogVerbose407
    BiliClient.prefs.v407debugLogVerbose407 = !current
    AppToast.show(this, "Debug Log Verbose407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407DeepColorEnabled407Toggle() {
    val current = BiliClient.prefs.v407deepColorEnabled407
    BiliClient.prefs.v407deepColorEnabled407 = !current
    AppToast.show(this, "Deep Color Enabled407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407DefaultPlayerEngine407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407defaultPlayerEngine407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407defaultPlayerEngine407 = value
        AppToast.show(this, "Default Player Engine407: $value")
    }
}

internal fun PlayerActivity.showV407DelayStartMs407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v407delayStartMs407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v407delayStartMs407 = value
        AppToast.show(this, "Delay Start Ms407: $value")
    }
}

internal fun PlayerActivity.showV407DensityAutoAdjust407Toggle() {
    val current = BiliClient.prefs.v407densityAutoAdjust407
    BiliClient.prefs.v407densityAutoAdjust407 = !current
    AppToast.show(this, "Density Auto Adjust407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407DeployAutoUpdate407Toggle() {
    val current = BiliClient.prefs.v407deployAutoUpdate407
    BiliClient.prefs.v407deployAutoUpdate407 = !current
    AppToast.show(this, "Deploy Auto Update407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407DetectMotionEnabled407Toggle() {
    val current = BiliClient.prefs.v407detectMotionEnabled407
    BiliClient.prefs.v407detectMotionEnabled407 = !current
    AppToast.show(this, "Detect Motion Enabled407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV407DimScreenOnIdle407Toggle() {
    val current = BiliClient.prefs.v407dimScreenOnIdle407
    BiliClient.prefs.v407dimScreenOnIdle407 = !current
    AppToast.show(this, "Dim Screen On Idle407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408CloudAutoSync408Toggle() {
    val current = BiliClient.prefs.v408cloudAutoSync408
    BiliClient.prefs.v408cloudAutoSync408 = !current
    AppToast.show(this, "Cloud Auto Sync408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408CloudStorageLimit408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408cloudStorageLimit408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408cloudStorageLimit408 = value
        AppToast.show(this, "Cloud Storage Limit408: $value")
    }
}

internal fun PlayerActivity.showV408CollectAutoCategorize408Toggle() {
    val current = BiliClient.prefs.v408collectAutoCategorize408
    BiliClient.prefs.v408collectAutoCategorize408 = !current
    AppToast.show(this, "Collect Auto Categorize408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408CompactModeEnabled408Toggle() {
    val current = BiliClient.prefs.v408compactModeEnabled408
    BiliClient.prefs.v408compactModeEnabled408 = !current
    AppToast.show(this, "Compact Mode Enabled408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408CompressAutoQuality408Toggle() {
    val current = BiliClient.prefs.v408compressAutoQuality408
    BiliClient.prefs.v408compressAutoQuality408 = !current
    AppToast.show(this, "Compress Auto Quality408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408ConnectAutoRetry408Toggle() {
    val current = BiliClient.prefs.v408connectAutoRetry408
    BiliClient.prefs.v408connectAutoRetry408 = !current
    AppToast.show(this, "Connect Auto Retry408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408DashboardWidgetLayout408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408dashboardWidgetLayout408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408dashboardWidgetLayout408 = value
        AppToast.show(this, "Dashboard Widget Layout408: $value")
    }
}

internal fun PlayerActivity.showV408DebugLogVerbose408Toggle() {
    val current = BiliClient.prefs.v408debugLogVerbose408
    BiliClient.prefs.v408debugLogVerbose408 = !current
    AppToast.show(this, "Debug Log Verbose408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408DeepColorEnabled408Toggle() {
    val current = BiliClient.prefs.v408deepColorEnabled408
    BiliClient.prefs.v408deepColorEnabled408 = !current
    AppToast.show(this, "Deep Color Enabled408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408DefaultPlayerEngine408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408defaultPlayerEngine408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408defaultPlayerEngine408 = value
        AppToast.show(this, "Default Player Engine408: $value")
    }
}

internal fun PlayerActivity.showV408DelayStartMs408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v408delayStartMs408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v408delayStartMs408 = value
        AppToast.show(this, "Delay Start Ms408: $value")
    }
}

internal fun PlayerActivity.showV408DensityAutoAdjust408Toggle() {
    val current = BiliClient.prefs.v408densityAutoAdjust408
    BiliClient.prefs.v408densityAutoAdjust408 = !current
    AppToast.show(this, "Density Auto Adjust408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408DeployAutoUpdate408Toggle() {
    val current = BiliClient.prefs.v408deployAutoUpdate408
    BiliClient.prefs.v408deployAutoUpdate408 = !current
    AppToast.show(this, "Deploy Auto Update408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408DetectMotionEnabled408Toggle() {
    val current = BiliClient.prefs.v408detectMotionEnabled408
    BiliClient.prefs.v408detectMotionEnabled408 = !current
    AppToast.show(this, "Detect Motion Enabled408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV408DimScreenOnIdle408Toggle() {
    val current = BiliClient.prefs.v408dimScreenOnIdle408
    BiliClient.prefs.v408dimScreenOnIdle408 = !current
    AppToast.show(this, "Dim Screen On Idle408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409CloudAutoSync409Toggle() {
    val current = BiliClient.prefs.v409cloudAutoSync409
    BiliClient.prefs.v409cloudAutoSync409 = !current
    AppToast.show(this, "Cloud Auto Sync409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409CloudStorageLimit409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409cloudStorageLimit409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409cloudStorageLimit409 = value
        AppToast.show(this, "Cloud Storage Limit409: $value")
    }
}

internal fun PlayerActivity.showV409CollectAutoCategorize409Toggle() {
    val current = BiliClient.prefs.v409collectAutoCategorize409
    BiliClient.prefs.v409collectAutoCategorize409 = !current
    AppToast.show(this, "Collect Auto Categorize409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409CompactModeEnabled409Toggle() {
    val current = BiliClient.prefs.v409compactModeEnabled409
    BiliClient.prefs.v409compactModeEnabled409 = !current
    AppToast.show(this, "Compact Mode Enabled409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409CompressAutoQuality409Toggle() {
    val current = BiliClient.prefs.v409compressAutoQuality409
    BiliClient.prefs.v409compressAutoQuality409 = !current
    AppToast.show(this, "Compress Auto Quality409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409ConnectAutoRetry409Toggle() {
    val current = BiliClient.prefs.v409connectAutoRetry409
    BiliClient.prefs.v409connectAutoRetry409 = !current
    AppToast.show(this, "Connect Auto Retry409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409DashboardWidgetLayout409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409dashboardWidgetLayout409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409dashboardWidgetLayout409 = value
        AppToast.show(this, "Dashboard Widget Layout409: $value")
    }
}

internal fun PlayerActivity.showV409DebugLogVerbose409Toggle() {
    val current = BiliClient.prefs.v409debugLogVerbose409
    BiliClient.prefs.v409debugLogVerbose409 = !current
    AppToast.show(this, "Debug Log Verbose409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409DeepColorEnabled409Toggle() {
    val current = BiliClient.prefs.v409deepColorEnabled409
    BiliClient.prefs.v409deepColorEnabled409 = !current
    AppToast.show(this, "Deep Color Enabled409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409DefaultPlayerEngine409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409defaultPlayerEngine409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409defaultPlayerEngine409 = value
        AppToast.show(this, "Default Player Engine409: $value")
    }
}

internal fun PlayerActivity.showV409DelayStartMs409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v409delayStartMs409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v409delayStartMs409 = value
        AppToast.show(this, "Delay Start Ms409: $value")
    }
}

internal fun PlayerActivity.showV409DensityAutoAdjust409Toggle() {
    val current = BiliClient.prefs.v409densityAutoAdjust409
    BiliClient.prefs.v409densityAutoAdjust409 = !current
    AppToast.show(this, "Density Auto Adjust409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409DeployAutoUpdate409Toggle() {
    val current = BiliClient.prefs.v409deployAutoUpdate409
    BiliClient.prefs.v409deployAutoUpdate409 = !current
    AppToast.show(this, "Deploy Auto Update409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409DetectMotionEnabled409Toggle() {
    val current = BiliClient.prefs.v409detectMotionEnabled409
    BiliClient.prefs.v409detectMotionEnabled409 = !current
    AppToast.show(this, "Detect Motion Enabled409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV409DimScreenOnIdle409Toggle() {
    val current = BiliClient.prefs.v409dimScreenOnIdle409
    BiliClient.prefs.v409dimScreenOnIdle409 = !current
    AppToast.show(this, "Dim Screen On Idle409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410CloudAutoSync410Toggle() {
    val current = BiliClient.prefs.v410cloudAutoSync410
    BiliClient.prefs.v410cloudAutoSync410 = !current
    AppToast.show(this, "Cloud Auto Sync410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410CloudStorageLimit410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410cloudStorageLimit410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410cloudStorageLimit410 = value
        AppToast.show(this, "Cloud Storage Limit410: $value")
    }
}

internal fun PlayerActivity.showV410CollectAutoCategorize410Toggle() {
    val current = BiliClient.prefs.v410collectAutoCategorize410
    BiliClient.prefs.v410collectAutoCategorize410 = !current
    AppToast.show(this, "Collect Auto Categorize410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410CompactModeEnabled410Toggle() {
    val current = BiliClient.prefs.v410compactModeEnabled410
    BiliClient.prefs.v410compactModeEnabled410 = !current
    AppToast.show(this, "Compact Mode Enabled410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410CompressAutoQuality410Toggle() {
    val current = BiliClient.prefs.v410compressAutoQuality410
    BiliClient.prefs.v410compressAutoQuality410 = !current
    AppToast.show(this, "Compress Auto Quality410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410ConnectAutoRetry410Toggle() {
    val current = BiliClient.prefs.v410connectAutoRetry410
    BiliClient.prefs.v410connectAutoRetry410 = !current
    AppToast.show(this, "Connect Auto Retry410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410DashboardWidgetLayout410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410dashboardWidgetLayout410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410dashboardWidgetLayout410 = value
        AppToast.show(this, "Dashboard Widget Layout410: $value")
    }
}

internal fun PlayerActivity.showV410DebugLogVerbose410Toggle() {
    val current = BiliClient.prefs.v410debugLogVerbose410
    BiliClient.prefs.v410debugLogVerbose410 = !current
    AppToast.show(this, "Debug Log Verbose410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410DeepColorEnabled410Toggle() {
    val current = BiliClient.prefs.v410deepColorEnabled410
    BiliClient.prefs.v410deepColorEnabled410 = !current
    AppToast.show(this, "Deep Color Enabled410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410DefaultPlayerEngine410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410defaultPlayerEngine410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410defaultPlayerEngine410 = value
        AppToast.show(this, "Default Player Engine410: $value")
    }
}

internal fun PlayerActivity.showV410DelayStartMs410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410delayStartMs410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410delayStartMs410 = value
        AppToast.show(this, "Delay Start Ms410: $value")
    }
}

internal fun PlayerActivity.showV410DensityAutoAdjust410Toggle() {
    val current = BiliClient.prefs.v410densityAutoAdjust410
    BiliClient.prefs.v410densityAutoAdjust410 = !current
    AppToast.show(this, "Density Auto Adjust410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410DeployAutoUpdate410Toggle() {
    val current = BiliClient.prefs.v410deployAutoUpdate410
    BiliClient.prefs.v410deployAutoUpdate410 = !current
    AppToast.show(this, "Deploy Auto Update410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410DetectMotionEnabled410Toggle() {
    val current = BiliClient.prefs.v410detectMotionEnabled410
    BiliClient.prefs.v410detectMotionEnabled410 = !current
    AppToast.show(this, "Detect Motion Enabled410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV410DimScreenOnIdle410Toggle() {
    val current = BiliClient.prefs.v410dimScreenOnIdle410
    BiliClient.prefs.v410dimScreenOnIdle410 = !current
    AppToast.show(this, "Dim Screen On Idle410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DisplayRefreshRate411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayRefreshRate411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayRefreshRate411 = value
        AppToast.show(this, "Display Refresh Rate411: $value")
    }
}

internal fun PlayerActivity.showV411DisplayColorTemp411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayColorTemp411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayColorTemp411 = value
        AppToast.show(this, "Display Color Temp411: $value")
    }
}

internal fun PlayerActivity.showV411DividerAutoInsert411Toggle() {
    val current = BiliClient.prefs.v411dividerAutoInsert411
    BiliClient.prefs.v411dividerAutoInsert411 = !current
    AppToast.show(this, "Divider Auto Insert411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DomainAutoBlock411Toggle() {
    val current = BiliClient.prefs.v411domainAutoBlock411
    BiliClient.prefs.v411domainAutoBlock411 = !current
    AppToast.show(this, "Domain Auto Block411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DragDropEnabled411Toggle() {
    val current = BiliClient.prefs.v411dragDropEnabled411
    BiliClient.prefs.v411dragDropEnabled411 = !current
    AppToast.show(this, "Drag Drop Enabled411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DrawerAutoCollapse411Toggle() {
    val current = BiliClient.prefs.v411drawerAutoCollapse411
    BiliClient.prefs.v411drawerAutoCollapse411 = !current
    AppToast.show(this, "Drawer Auto Collapse411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DrmAutoDetect411Toggle() {
    val current = BiliClient.prefs.v411drmAutoDetect411
    BiliClient.prefs.v411drmAutoDetect411 = !current
    AppToast.show(this, "DRM Auto Detect411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DuplicateAutoRemove411Toggle() {
    val current = BiliClient.prefs.v411duplicateAutoRemove411
    BiliClient.prefs.v411duplicateAutoRemove411 = !current
    AppToast.show(this, "Duplicate Auto Remove411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DynamicIsland411Toggle() {
    val current = BiliClient.prefs.v411dynamicIsland411
    BiliClient.prefs.v411dynamicIsland411 = !current
    AppToast.show(this, "Dynamic Island411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411DynamicThemeColor411Toggle() {
    val current = BiliClient.prefs.v411dynamicThemeColor411
    BiliClient.prefs.v411dynamicThemeColor411 = !current
    AppToast.show(this, "Dynamic Theme Color411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411EdgeTouchReject411Toggle() {
    val current = BiliClient.prefs.v411edgeTouchReject411
    BiliClient.prefs.v411edgeTouchReject411 = !current
    AppToast.show(this, "Edge Touch Reject411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411EmbedSubtitleTrack411Toggle() {
    val current = BiliClient.prefs.v411embedSubtitleTrack411
    BiliClient.prefs.v411embedSubtitleTrack411 = !current
    AppToast.show(this, "Embed Subtitle Track411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411EncodeAutoSelect411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411encodeAutoSelect411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411encodeAutoSelect411 = value
        AppToast.show(this, "Encode Auto Select411: $value")
    }
}

internal fun PlayerActivity.showV411EndpointAutoSwitch411Toggle() {
    val current = BiliClient.prefs.v411endpointAutoSwitch411
    BiliClient.prefs.v411endpointAutoSwitch411 = !current
    AppToast.show(this, "Endpoint Auto Switch411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV411EngineAutoOptimize411Toggle() {
    val current = BiliClient.prefs.v411engineAutoOptimize411
    BiliClient.prefs.v411engineAutoOptimize411 = !current
    AppToast.show(this, "Engine Auto Optimize411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DisplayRefreshRate412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayRefreshRate412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayRefreshRate412 = value
        AppToast.show(this, "Display Refresh Rate412: $value")
    }
}

internal fun PlayerActivity.showV412DisplayColorTemp412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayColorTemp412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayColorTemp412 = value
        AppToast.show(this, "Display Color Temp412: $value")
    }
}

internal fun PlayerActivity.showV412DividerAutoInsert412Toggle() {
    val current = BiliClient.prefs.v412dividerAutoInsert412
    BiliClient.prefs.v412dividerAutoInsert412 = !current
    AppToast.show(this, "Divider Auto Insert412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DomainAutoBlock412Toggle() {
    val current = BiliClient.prefs.v412domainAutoBlock412
    BiliClient.prefs.v412domainAutoBlock412 = !current
    AppToast.show(this, "Domain Auto Block412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DragDropEnabled412Toggle() {
    val current = BiliClient.prefs.v412dragDropEnabled412
    BiliClient.prefs.v412dragDropEnabled412 = !current
    AppToast.show(this, "Drag Drop Enabled412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DrawerAutoCollapse412Toggle() {
    val current = BiliClient.prefs.v412drawerAutoCollapse412
    BiliClient.prefs.v412drawerAutoCollapse412 = !current
    AppToast.show(this, "Drawer Auto Collapse412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DrmAutoDetect412Toggle() {
    val current = BiliClient.prefs.v412drmAutoDetect412
    BiliClient.prefs.v412drmAutoDetect412 = !current
    AppToast.show(this, "DRM Auto Detect412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DuplicateAutoRemove412Toggle() {
    val current = BiliClient.prefs.v412duplicateAutoRemove412
    BiliClient.prefs.v412duplicateAutoRemove412 = !current
    AppToast.show(this, "Duplicate Auto Remove412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DynamicIsland412Toggle() {
    val current = BiliClient.prefs.v412dynamicIsland412
    BiliClient.prefs.v412dynamicIsland412 = !current
    AppToast.show(this, "Dynamic Island412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412DynamicThemeColor412Toggle() {
    val current = BiliClient.prefs.v412dynamicThemeColor412
    BiliClient.prefs.v412dynamicThemeColor412 = !current
    AppToast.show(this, "Dynamic Theme Color412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412EdgeTouchReject412Toggle() {
    val current = BiliClient.prefs.v412edgeTouchReject412
    BiliClient.prefs.v412edgeTouchReject412 = !current
    AppToast.show(this, "Edge Touch Reject412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412EmbedSubtitleTrack412Toggle() {
    val current = BiliClient.prefs.v412embedSubtitleTrack412
    BiliClient.prefs.v412embedSubtitleTrack412 = !current
    AppToast.show(this, "Embed Subtitle Track412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412EncodeAutoSelect412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412encodeAutoSelect412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412encodeAutoSelect412 = value
        AppToast.show(this, "Encode Auto Select412: $value")
    }
}

internal fun PlayerActivity.showV412EndpointAutoSwitch412Toggle() {
    val current = BiliClient.prefs.v412endpointAutoSwitch412
    BiliClient.prefs.v412endpointAutoSwitch412 = !current
    AppToast.show(this, "Endpoint Auto Switch412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV412EngineAutoOptimize412Toggle() {
    val current = BiliClient.prefs.v412engineAutoOptimize412
    BiliClient.prefs.v412engineAutoOptimize412 = !current
    AppToast.show(this, "Engine Auto Optimize412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DisplayRefreshRate413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayRefreshRate413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayRefreshRate413 = value
        AppToast.show(this, "Display Refresh Rate413: $value")
    }
}

internal fun PlayerActivity.showV413DisplayColorTemp413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayColorTemp413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayColorTemp413 = value
        AppToast.show(this, "Display Color Temp413: $value")
    }
}

internal fun PlayerActivity.showV413DividerAutoInsert413Toggle() {
    val current = BiliClient.prefs.v413dividerAutoInsert413
    BiliClient.prefs.v413dividerAutoInsert413 = !current
    AppToast.show(this, "Divider Auto Insert413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DomainAutoBlock413Toggle() {
    val current = BiliClient.prefs.v413domainAutoBlock413
    BiliClient.prefs.v413domainAutoBlock413 = !current
    AppToast.show(this, "Domain Auto Block413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DragDropEnabled413Toggle() {
    val current = BiliClient.prefs.v413dragDropEnabled413
    BiliClient.prefs.v413dragDropEnabled413 = !current
    AppToast.show(this, "Drag Drop Enabled413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DrawerAutoCollapse413Toggle() {
    val current = BiliClient.prefs.v413drawerAutoCollapse413
    BiliClient.prefs.v413drawerAutoCollapse413 = !current
    AppToast.show(this, "Drawer Auto Collapse413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DrmAutoDetect413Toggle() {
    val current = BiliClient.prefs.v413drmAutoDetect413
    BiliClient.prefs.v413drmAutoDetect413 = !current
    AppToast.show(this, "DRM Auto Detect413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DuplicateAutoRemove413Toggle() {
    val current = BiliClient.prefs.v413duplicateAutoRemove413
    BiliClient.prefs.v413duplicateAutoRemove413 = !current
    AppToast.show(this, "Duplicate Auto Remove413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DynamicIsland413Toggle() {
    val current = BiliClient.prefs.v413dynamicIsland413
    BiliClient.prefs.v413dynamicIsland413 = !current
    AppToast.show(this, "Dynamic Island413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413DynamicThemeColor413Toggle() {
    val current = BiliClient.prefs.v413dynamicThemeColor413
    BiliClient.prefs.v413dynamicThemeColor413 = !current
    AppToast.show(this, "Dynamic Theme Color413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413EdgeTouchReject413Toggle() {
    val current = BiliClient.prefs.v413edgeTouchReject413
    BiliClient.prefs.v413edgeTouchReject413 = !current
    AppToast.show(this, "Edge Touch Reject413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413EmbedSubtitleTrack413Toggle() {
    val current = BiliClient.prefs.v413embedSubtitleTrack413
    BiliClient.prefs.v413embedSubtitleTrack413 = !current
    AppToast.show(this, "Embed Subtitle Track413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413EncodeAutoSelect413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413encodeAutoSelect413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413encodeAutoSelect413 = value
        AppToast.show(this, "Encode Auto Select413: $value")
    }
}

internal fun PlayerActivity.showV413EndpointAutoSwitch413Toggle() {
    val current = BiliClient.prefs.v413endpointAutoSwitch413
    BiliClient.prefs.v413endpointAutoSwitch413 = !current
    AppToast.show(this, "Endpoint Auto Switch413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV413EngineAutoOptimize413Toggle() {
    val current = BiliClient.prefs.v413engineAutoOptimize413
    BiliClient.prefs.v413engineAutoOptimize413 = !current
    AppToast.show(this, "Engine Auto Optimize413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DisplayRefreshRate414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayRefreshRate414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayRefreshRate414 = value
        AppToast.show(this, "Display Refresh Rate414: $value")
    }
}

internal fun PlayerActivity.showV414DisplayColorTemp414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayColorTemp414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayColorTemp414 = value
        AppToast.show(this, "Display Color Temp414: $value")
    }
}

internal fun PlayerActivity.showV414DividerAutoInsert414Toggle() {
    val current = BiliClient.prefs.v414dividerAutoInsert414
    BiliClient.prefs.v414dividerAutoInsert414 = !current
    AppToast.show(this, "Divider Auto Insert414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DomainAutoBlock414Toggle() {
    val current = BiliClient.prefs.v414domainAutoBlock414
    BiliClient.prefs.v414domainAutoBlock414 = !current
    AppToast.show(this, "Domain Auto Block414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DragDropEnabled414Toggle() {
    val current = BiliClient.prefs.v414dragDropEnabled414
    BiliClient.prefs.v414dragDropEnabled414 = !current
    AppToast.show(this, "Drag Drop Enabled414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DrawerAutoCollapse414Toggle() {
    val current = BiliClient.prefs.v414drawerAutoCollapse414
    BiliClient.prefs.v414drawerAutoCollapse414 = !current
    AppToast.show(this, "Drawer Auto Collapse414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DrmAutoDetect414Toggle() {
    val current = BiliClient.prefs.v414drmAutoDetect414
    BiliClient.prefs.v414drmAutoDetect414 = !current
    AppToast.show(this, "DRM Auto Detect414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DuplicateAutoRemove414Toggle() {
    val current = BiliClient.prefs.v414duplicateAutoRemove414
    BiliClient.prefs.v414duplicateAutoRemove414 = !current
    AppToast.show(this, "Duplicate Auto Remove414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DynamicIsland414Toggle() {
    val current = BiliClient.prefs.v414dynamicIsland414
    BiliClient.prefs.v414dynamicIsland414 = !current
    AppToast.show(this, "Dynamic Island414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414DynamicThemeColor414Toggle() {
    val current = BiliClient.prefs.v414dynamicThemeColor414
    BiliClient.prefs.v414dynamicThemeColor414 = !current
    AppToast.show(this, "Dynamic Theme Color414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414EdgeTouchReject414Toggle() {
    val current = BiliClient.prefs.v414edgeTouchReject414
    BiliClient.prefs.v414edgeTouchReject414 = !current
    AppToast.show(this, "Edge Touch Reject414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414EmbedSubtitleTrack414Toggle() {
    val current = BiliClient.prefs.v414embedSubtitleTrack414
    BiliClient.prefs.v414embedSubtitleTrack414 = !current
    AppToast.show(this, "Embed Subtitle Track414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414EncodeAutoSelect414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414encodeAutoSelect414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414encodeAutoSelect414 = value
        AppToast.show(this, "Encode Auto Select414: $value")
    }
}

internal fun PlayerActivity.showV414EndpointAutoSwitch414Toggle() {
    val current = BiliClient.prefs.v414endpointAutoSwitch414
    BiliClient.prefs.v414endpointAutoSwitch414 = !current
    AppToast.show(this, "Endpoint Auto Switch414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV414EngineAutoOptimize414Toggle() {
    val current = BiliClient.prefs.v414engineAutoOptimize414
    BiliClient.prefs.v414engineAutoOptimize414 = !current
    AppToast.show(this, "Engine Auto Optimize414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV415DisplayRefreshRate415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayRefreshRate415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayRefreshRate415 = value
        AppToast.show(this, "Display Refresh Rate415: $value")
    }
}

