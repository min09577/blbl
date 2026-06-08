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

// v891: Project Auto Export891
internal fun PlayerActivity.showV891ProjectAutoExport891Toggle() {
    val current = BiliClient.prefs.v891projectAutoExport891
    BiliClient.prefs.v891projectAutoExport891 = !current
    AppToast.show(this, "Project Auto Export891: ${if (!current) "ON" else "OFF"}")
}

// v891: Promise Auto Await891
internal fun PlayerActivity.showV891PromiseAutoAwait891Toggle() {
    val current = BiliClient.prefs.v891promiseAutoAwait891
    BiliClient.prefs.v891promiseAutoAwait891 = !current
    AppToast.show(this, "Promise Auto Await891: ${if (!current) "ON" else "OFF"}")
}

// v891: Prompt Auto Show891
internal fun PlayerActivity.showV891PromptAutoShow891Toggle() {
    val current = BiliClient.prefs.v891promptAutoShow891
    BiliClient.prefs.v891promptAutoShow891 = !current
    AppToast.show(this, "Prompt Auto Show891: ${if (!current) "ON" else "OFF"}")
}

// v891: Prop Auto Bind891
internal fun PlayerActivity.showV891PropAutoBind891Toggle() {
    val current = BiliClient.prefs.v891propAutoBind891
    BiliClient.prefs.v891propAutoBind891 = !current
    AppToast.show(this, "Prop Auto Bind891: ${if (!current) "ON" else "OFF"}")
}

// v891: Property Auto Observe891
internal fun PlayerActivity.showV891PropertyAutoObserve891Toggle() {
    val current = BiliClient.prefs.v891propertyAutoObserve891
    BiliClient.prefs.v891propertyAutoObserve891 = !current
    AppToast.show(this, "Property Auto Observe891: ${if (!current) "ON" else "OFF"}")
}

// v891: Protect Auto Encrypt891
internal fun PlayerActivity.showV891ProtectAutoEncrypt891Toggle() {
    val current = BiliClient.prefs.v891protectAutoEncrypt891
    BiliClient.prefs.v891protectAutoEncrypt891 = !current
    AppToast.show(this, "Protect Auto Encrypt891: ${if (!current) "ON" else "OFF"}")
}

// v891: Protocol Auto Negotiate891
internal fun PlayerActivity.showV891ProtocolAutoNegotiate891Toggle() {
    val current = BiliClient.prefs.v891protocolAutoNegotiate891
    BiliClient.prefs.v891protocolAutoNegotiate891 = !current
    AppToast.show(this, "Protocol Auto Negotiate891: ${if (!current) "ON" else "OFF"}")
}

// v891: Provide Auto Inject891
internal fun PlayerActivity.showV891ProvideAutoInject891Toggle() {
    val current = BiliClient.prefs.v891provideAutoInject891
    BiliClient.prefs.v891provideAutoInject891 = !current
    AppToast.show(this, "Provide Auto Inject891: ${if (!current) "ON" else "OFF"}")
}

// v891: Proxy Auto Rotate891
internal fun PlayerActivity.showV891ProxyAutoRotate891Toggle() {
    val current = BiliClient.prefs.v891proxyAutoRotate891
    BiliClient.prefs.v891proxyAutoRotate891 = !current
    AppToast.show(this, "Proxy Auto Rotate891: ${if (!current) "ON" else "OFF"}")
}

// v891: Public Auto Share891
internal fun PlayerActivity.showV891PublicAutoShare891Toggle() {
    val current = BiliClient.prefs.v891publicAutoShare891
    BiliClient.prefs.v891publicAutoShare891 = !current
    AppToast.show(this, "Public Auto Share891: ${if (!current) "ON" else "OFF"}")
}

// v891: Pull Auto Refresh891
internal fun PlayerActivity.showV891PullAutoRefresh891Toggle() {
    val current = BiliClient.prefs.v891pullAutoRefresh891
    BiliClient.prefs.v891pullAutoRefresh891 = !current
    AppToast.show(this, "Pull Auto Refresh891: ${if (!current) "ON" else "OFF"}")
}

// v891: Pure Auto Mode891
internal fun PlayerActivity.showV891PureAutoMode891Toggle() {
    val current = BiliClient.prefs.v891pureAutoMode891
    BiliClient.prefs.v891pureAutoMode891 = !current
    AppToast.show(this, "Pure Auto Mode891: ${if (!current) "ON" else "OFF"}")
}

// v891: Push Auto Notify891
internal fun PlayerActivity.showV891PushAutoNotify891Toggle() {
    val current = BiliClient.prefs.v891pushAutoNotify891
    BiliClient.prefs.v891pushAutoNotify891 = !current
    AppToast.show(this, "Push Auto Notify891: ${if (!current) "ON" else "OFF"}")
}

// v891: Query Auto Optimize891
internal fun PlayerActivity.showV891QueryAutoOptimize891Toggle() {
    val current = BiliClient.prefs.v891queryAutoOptimize891
    BiliClient.prefs.v891queryAutoOptimize891 = !current
    AppToast.show(this, "Query Auto Optimize891: ${if (!current) "ON" else "OFF"}")
}

// v891: Queue Auto Priority891
internal fun PlayerActivity.showV891QueueAutoPriority891Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v891queueAutoPriority891).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority891",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v891queueAutoPriority891 = value
        AppToast.show(this, "Queue Auto Priority891: $value")
    }
}

// v892: Project Auto Export892
internal fun PlayerActivity.showV892ProjectAutoExport892Toggle() {
    val current = BiliClient.prefs.v892projectAutoExport892
    BiliClient.prefs.v892projectAutoExport892 = !current
    AppToast.show(this, "Project Auto Export892: ${if (!current) "ON" else "OFF"}")
}

// v892: Promise Auto Await892
internal fun PlayerActivity.showV892PromiseAutoAwait892Toggle() {
    val current = BiliClient.prefs.v892promiseAutoAwait892
    BiliClient.prefs.v892promiseAutoAwait892 = !current
    AppToast.show(this, "Promise Auto Await892: ${if (!current) "ON" else "OFF"}")
}

// v892: Prompt Auto Show892
internal fun PlayerActivity.showV892PromptAutoShow892Toggle() {
    val current = BiliClient.prefs.v892promptAutoShow892
    BiliClient.prefs.v892promptAutoShow892 = !current
    AppToast.show(this, "Prompt Auto Show892: ${if (!current) "ON" else "OFF"}")
}

// v892: Prop Auto Bind892
internal fun PlayerActivity.showV892PropAutoBind892Toggle() {
    val current = BiliClient.prefs.v892propAutoBind892
    BiliClient.prefs.v892propAutoBind892 = !current
    AppToast.show(this, "Prop Auto Bind892: ${if (!current) "ON" else "OFF"}")
}

// v892: Property Auto Observe892
internal fun PlayerActivity.showV892PropertyAutoObserve892Toggle() {
    val current = BiliClient.prefs.v892propertyAutoObserve892
    BiliClient.prefs.v892propertyAutoObserve892 = !current
    AppToast.show(this, "Property Auto Observe892: ${if (!current) "ON" else "OFF"}")
}

// v892: Protect Auto Encrypt892
internal fun PlayerActivity.showV892ProtectAutoEncrypt892Toggle() {
    val current = BiliClient.prefs.v892protectAutoEncrypt892
    BiliClient.prefs.v892protectAutoEncrypt892 = !current
    AppToast.show(this, "Protect Auto Encrypt892: ${if (!current) "ON" else "OFF"}")
}

// v892: Protocol Auto Negotiate892
internal fun PlayerActivity.showV892ProtocolAutoNegotiate892Toggle() {
    val current = BiliClient.prefs.v892protocolAutoNegotiate892
    BiliClient.prefs.v892protocolAutoNegotiate892 = !current
    AppToast.show(this, "Protocol Auto Negotiate892: ${if (!current) "ON" else "OFF"}")
}

// v892: Provide Auto Inject892
internal fun PlayerActivity.showV892ProvideAutoInject892Toggle() {
    val current = BiliClient.prefs.v892provideAutoInject892
    BiliClient.prefs.v892provideAutoInject892 = !current
    AppToast.show(this, "Provide Auto Inject892: ${if (!current) "ON" else "OFF"}")
}

// v892: Proxy Auto Rotate892
internal fun PlayerActivity.showV892ProxyAutoRotate892Toggle() {
    val current = BiliClient.prefs.v892proxyAutoRotate892
    BiliClient.prefs.v892proxyAutoRotate892 = !current
    AppToast.show(this, "Proxy Auto Rotate892: ${if (!current) "ON" else "OFF"}")
}

// v892: Public Auto Share892
internal fun PlayerActivity.showV892PublicAutoShare892Toggle() {
    val current = BiliClient.prefs.v892publicAutoShare892
    BiliClient.prefs.v892publicAutoShare892 = !current
    AppToast.show(this, "Public Auto Share892: ${if (!current) "ON" else "OFF"}")
}

// v892: Pull Auto Refresh892
internal fun PlayerActivity.showV892PullAutoRefresh892Toggle() {
    val current = BiliClient.prefs.v892pullAutoRefresh892
    BiliClient.prefs.v892pullAutoRefresh892 = !current
    AppToast.show(this, "Pull Auto Refresh892: ${if (!current) "ON" else "OFF"}")
}

// v892: Pure Auto Mode892
internal fun PlayerActivity.showV892PureAutoMode892Toggle() {
    val current = BiliClient.prefs.v892pureAutoMode892
    BiliClient.prefs.v892pureAutoMode892 = !current
    AppToast.show(this, "Pure Auto Mode892: ${if (!current) "ON" else "OFF"}")
}

// v892: Push Auto Notify892
internal fun PlayerActivity.showV892PushAutoNotify892Toggle() {
    val current = BiliClient.prefs.v892pushAutoNotify892
    BiliClient.prefs.v892pushAutoNotify892 = !current
    AppToast.show(this, "Push Auto Notify892: ${if (!current) "ON" else "OFF"}")
}

// v892: Query Auto Optimize892
internal fun PlayerActivity.showV892QueryAutoOptimize892Toggle() {
    val current = BiliClient.prefs.v892queryAutoOptimize892
    BiliClient.prefs.v892queryAutoOptimize892 = !current
    AppToast.show(this, "Query Auto Optimize892: ${if (!current) "ON" else "OFF"}")
}

// v892: Queue Auto Priority892
internal fun PlayerActivity.showV892QueueAutoPriority892Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v892queueAutoPriority892).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority892",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v892queueAutoPriority892 = value
        AppToast.show(this, "Queue Auto Priority892: $value")
    }
}

// v893: Project Auto Export893
internal fun PlayerActivity.showV893ProjectAutoExport893Toggle() {
    val current = BiliClient.prefs.v893projectAutoExport893
    BiliClient.prefs.v893projectAutoExport893 = !current
    AppToast.show(this, "Project Auto Export893: ${if (!current) "ON" else "OFF"}")
}

// v893: Promise Auto Await893
internal fun PlayerActivity.showV893PromiseAutoAwait893Toggle() {
    val current = BiliClient.prefs.v893promiseAutoAwait893
    BiliClient.prefs.v893promiseAutoAwait893 = !current
    AppToast.show(this, "Promise Auto Await893: ${if (!current) "ON" else "OFF"}")
}

// v893: Prompt Auto Show893
internal fun PlayerActivity.showV893PromptAutoShow893Toggle() {
    val current = BiliClient.prefs.v893promptAutoShow893
    BiliClient.prefs.v893promptAutoShow893 = !current
    AppToast.show(this, "Prompt Auto Show893: ${if (!current) "ON" else "OFF"}")
}

// v893: Prop Auto Bind893
internal fun PlayerActivity.showV893PropAutoBind893Toggle() {
    val current = BiliClient.prefs.v893propAutoBind893
    BiliClient.prefs.v893propAutoBind893 = !current
    AppToast.show(this, "Prop Auto Bind893: ${if (!current) "ON" else "OFF"}")
}

// v893: Property Auto Observe893
internal fun PlayerActivity.showV893PropertyAutoObserve893Toggle() {
    val current = BiliClient.prefs.v893propertyAutoObserve893
    BiliClient.prefs.v893propertyAutoObserve893 = !current
    AppToast.show(this, "Property Auto Observe893: ${if (!current) "ON" else "OFF"}")
}

// v893: Protect Auto Encrypt893
internal fun PlayerActivity.showV893ProtectAutoEncrypt893Toggle() {
    val current = BiliClient.prefs.v893protectAutoEncrypt893
    BiliClient.prefs.v893protectAutoEncrypt893 = !current
    AppToast.show(this, "Protect Auto Encrypt893: ${if (!current) "ON" else "OFF"}")
}

// v893: Protocol Auto Negotiate893
internal fun PlayerActivity.showV893ProtocolAutoNegotiate893Toggle() {
    val current = BiliClient.prefs.v893protocolAutoNegotiate893
    BiliClient.prefs.v893protocolAutoNegotiate893 = !current
    AppToast.show(this, "Protocol Auto Negotiate893: ${if (!current) "ON" else "OFF"}")
}

// v893: Provide Auto Inject893
internal fun PlayerActivity.showV893ProvideAutoInject893Toggle() {
    val current = BiliClient.prefs.v893provideAutoInject893
    BiliClient.prefs.v893provideAutoInject893 = !current
    AppToast.show(this, "Provide Auto Inject893: ${if (!current) "ON" else "OFF"}")
}

// v893: Proxy Auto Rotate893
internal fun PlayerActivity.showV893ProxyAutoRotate893Toggle() {
    val current = BiliClient.prefs.v893proxyAutoRotate893
    BiliClient.prefs.v893proxyAutoRotate893 = !current
    AppToast.show(this, "Proxy Auto Rotate893: ${if (!current) "ON" else "OFF"}")
}

// v893: Public Auto Share893
internal fun PlayerActivity.showV893PublicAutoShare893Toggle() {
    val current = BiliClient.prefs.v893publicAutoShare893
    BiliClient.prefs.v893publicAutoShare893 = !current
    AppToast.show(this, "Public Auto Share893: ${if (!current) "ON" else "OFF"}")
}

// v893: Pull Auto Refresh893
internal fun PlayerActivity.showV893PullAutoRefresh893Toggle() {
    val current = BiliClient.prefs.v893pullAutoRefresh893
    BiliClient.prefs.v893pullAutoRefresh893 = !current
    AppToast.show(this, "Pull Auto Refresh893: ${if (!current) "ON" else "OFF"}")
}

// v893: Pure Auto Mode893
internal fun PlayerActivity.showV893PureAutoMode893Toggle() {
    val current = BiliClient.prefs.v893pureAutoMode893
    BiliClient.prefs.v893pureAutoMode893 = !current
    AppToast.show(this, "Pure Auto Mode893: ${if (!current) "ON" else "OFF"}")
}

// v893: Push Auto Notify893
internal fun PlayerActivity.showV893PushAutoNotify893Toggle() {
    val current = BiliClient.prefs.v893pushAutoNotify893
    BiliClient.prefs.v893pushAutoNotify893 = !current
    AppToast.show(this, "Push Auto Notify893: ${if (!current) "ON" else "OFF"}")
}

// v893: Query Auto Optimize893
internal fun PlayerActivity.showV893QueryAutoOptimize893Toggle() {
    val current = BiliClient.prefs.v893queryAutoOptimize893
    BiliClient.prefs.v893queryAutoOptimize893 = !current
    AppToast.show(this, "Query Auto Optimize893: ${if (!current) "ON" else "OFF"}")
}

// v893: Queue Auto Priority893
internal fun PlayerActivity.showV893QueueAutoPriority893Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v893queueAutoPriority893).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority893",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v893queueAutoPriority893 = value
        AppToast.show(this, "Queue Auto Priority893: $value")
    }
}

// v894: Project Auto Export894
internal fun PlayerActivity.showV894ProjectAutoExport894Toggle() {
    val current = BiliClient.prefs.v894projectAutoExport894
    BiliClient.prefs.v894projectAutoExport894 = !current
    AppToast.show(this, "Project Auto Export894: ${if (!current) "ON" else "OFF"}")
}

// v894: Promise Auto Await894
internal fun PlayerActivity.showV894PromiseAutoAwait894Toggle() {
    val current = BiliClient.prefs.v894promiseAutoAwait894
    BiliClient.prefs.v894promiseAutoAwait894 = !current
    AppToast.show(this, "Promise Auto Await894: ${if (!current) "ON" else "OFF"}")
}

// v894: Prompt Auto Show894
internal fun PlayerActivity.showV894PromptAutoShow894Toggle() {
    val current = BiliClient.prefs.v894promptAutoShow894
    BiliClient.prefs.v894promptAutoShow894 = !current
    AppToast.show(this, "Prompt Auto Show894: ${if (!current) "ON" else "OFF"}")
}

// v894: Prop Auto Bind894
internal fun PlayerActivity.showV894PropAutoBind894Toggle() {
    val current = BiliClient.prefs.v894propAutoBind894
    BiliClient.prefs.v894propAutoBind894 = !current
    AppToast.show(this, "Prop Auto Bind894: ${if (!current) "ON" else "OFF"}")
}

// v894: Property Auto Observe894
internal fun PlayerActivity.showV894PropertyAutoObserve894Toggle() {
    val current = BiliClient.prefs.v894propertyAutoObserve894
    BiliClient.prefs.v894propertyAutoObserve894 = !current
    AppToast.show(this, "Property Auto Observe894: ${if (!current) "ON" else "OFF"}")
}

// v894: Protect Auto Encrypt894
internal fun PlayerActivity.showV894ProtectAutoEncrypt894Toggle() {
    val current = BiliClient.prefs.v894protectAutoEncrypt894
    BiliClient.prefs.v894protectAutoEncrypt894 = !current
    AppToast.show(this, "Protect Auto Encrypt894: ${if (!current) "ON" else "OFF"}")
}

// v894: Protocol Auto Negotiate894
internal fun PlayerActivity.showV894ProtocolAutoNegotiate894Toggle() {
    val current = BiliClient.prefs.v894protocolAutoNegotiate894
    BiliClient.prefs.v894protocolAutoNegotiate894 = !current
    AppToast.show(this, "Protocol Auto Negotiate894: ${if (!current) "ON" else "OFF"}")
}

// v894: Provide Auto Inject894
internal fun PlayerActivity.showV894ProvideAutoInject894Toggle() {
    val current = BiliClient.prefs.v894provideAutoInject894
    BiliClient.prefs.v894provideAutoInject894 = !current
    AppToast.show(this, "Provide Auto Inject894: ${if (!current) "ON" else "OFF"}")
}

// v894: Proxy Auto Rotate894
internal fun PlayerActivity.showV894ProxyAutoRotate894Toggle() {
    val current = BiliClient.prefs.v894proxyAutoRotate894
    BiliClient.prefs.v894proxyAutoRotate894 = !current
    AppToast.show(this, "Proxy Auto Rotate894: ${if (!current) "ON" else "OFF"}")
}

// v894: Public Auto Share894
internal fun PlayerActivity.showV894PublicAutoShare894Toggle() {
    val current = BiliClient.prefs.v894publicAutoShare894
    BiliClient.prefs.v894publicAutoShare894 = !current
    AppToast.show(this, "Public Auto Share894: ${if (!current) "ON" else "OFF"}")
}

// v894: Pull Auto Refresh894
internal fun PlayerActivity.showV894PullAutoRefresh894Toggle() {
    val current = BiliClient.prefs.v894pullAutoRefresh894
    BiliClient.prefs.v894pullAutoRefresh894 = !current
    AppToast.show(this, "Pull Auto Refresh894: ${if (!current) "ON" else "OFF"}")
}

// v894: Pure Auto Mode894
internal fun PlayerActivity.showV894PureAutoMode894Toggle() {
    val current = BiliClient.prefs.v894pureAutoMode894
    BiliClient.prefs.v894pureAutoMode894 = !current
    AppToast.show(this, "Pure Auto Mode894: ${if (!current) "ON" else "OFF"}")
}

// v894: Push Auto Notify894
internal fun PlayerActivity.showV894PushAutoNotify894Toggle() {
    val current = BiliClient.prefs.v894pushAutoNotify894
    BiliClient.prefs.v894pushAutoNotify894 = !current
    AppToast.show(this, "Push Auto Notify894: ${if (!current) "ON" else "OFF"}")
}

// v894: Query Auto Optimize894
internal fun PlayerActivity.showV894QueryAutoOptimize894Toggle() {
    val current = BiliClient.prefs.v894queryAutoOptimize894
    BiliClient.prefs.v894queryAutoOptimize894 = !current
    AppToast.show(this, "Query Auto Optimize894: ${if (!current) "ON" else "OFF"}")
}

// v894: Queue Auto Priority894
internal fun PlayerActivity.showV894QueueAutoPriority894Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v894queueAutoPriority894).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority894",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v894queueAutoPriority894 = value
        AppToast.show(this, "Queue Auto Priority894: $value")
    }
}

// v895: Project Auto Export895
internal fun PlayerActivity.showV895ProjectAutoExport895Toggle() {
    val current = BiliClient.prefs.v895projectAutoExport895
    BiliClient.prefs.v895projectAutoExport895 = !current
    AppToast.show(this, "Project Auto Export895: ${if (!current) "ON" else "OFF"}")
}

// v895: Promise Auto Await895
internal fun PlayerActivity.showV895PromiseAutoAwait895Toggle() {
    val current = BiliClient.prefs.v895promiseAutoAwait895
    BiliClient.prefs.v895promiseAutoAwait895 = !current
    AppToast.show(this, "Promise Auto Await895: ${if (!current) "ON" else "OFF"}")
}

// v895: Prompt Auto Show895
internal fun PlayerActivity.showV895PromptAutoShow895Toggle() {
    val current = BiliClient.prefs.v895promptAutoShow895
    BiliClient.prefs.v895promptAutoShow895 = !current
    AppToast.show(this, "Prompt Auto Show895: ${if (!current) "ON" else "OFF"}")
}

// v895: Prop Auto Bind895
internal fun PlayerActivity.showV895PropAutoBind895Toggle() {
    val current = BiliClient.prefs.v895propAutoBind895
    BiliClient.prefs.v895propAutoBind895 = !current
    AppToast.show(this, "Prop Auto Bind895: ${if (!current) "ON" else "OFF"}")
}

// v895: Property Auto Observe895
internal fun PlayerActivity.showV895PropertyAutoObserve895Toggle() {
    val current = BiliClient.prefs.v895propertyAutoObserve895
    BiliClient.prefs.v895propertyAutoObserve895 = !current
    AppToast.show(this, "Property Auto Observe895: ${if (!current) "ON" else "OFF"}")
}

// v895: Protect Auto Encrypt895
internal fun PlayerActivity.showV895ProtectAutoEncrypt895Toggle() {
    val current = BiliClient.prefs.v895protectAutoEncrypt895
    BiliClient.prefs.v895protectAutoEncrypt895 = !current
    AppToast.show(this, "Protect Auto Encrypt895: ${if (!current) "ON" else "OFF"}")
}

// v895: Protocol Auto Negotiate895
internal fun PlayerActivity.showV895ProtocolAutoNegotiate895Toggle() {
    val current = BiliClient.prefs.v895protocolAutoNegotiate895
    BiliClient.prefs.v895protocolAutoNegotiate895 = !current
    AppToast.show(this, "Protocol Auto Negotiate895: ${if (!current) "ON" else "OFF"}")
}

// v895: Provide Auto Inject895
internal fun PlayerActivity.showV895ProvideAutoInject895Toggle() {
    val current = BiliClient.prefs.v895provideAutoInject895
    BiliClient.prefs.v895provideAutoInject895 = !current
    AppToast.show(this, "Provide Auto Inject895: ${if (!current) "ON" else "OFF"}")
}

// v895: Proxy Auto Rotate895
internal fun PlayerActivity.showV895ProxyAutoRotate895Toggle() {
    val current = BiliClient.prefs.v895proxyAutoRotate895
    BiliClient.prefs.v895proxyAutoRotate895 = !current
    AppToast.show(this, "Proxy Auto Rotate895: ${if (!current) "ON" else "OFF"}")
}

// v895: Public Auto Share895
internal fun PlayerActivity.showV895PublicAutoShare895Toggle() {
    val current = BiliClient.prefs.v895publicAutoShare895
    BiliClient.prefs.v895publicAutoShare895 = !current
    AppToast.show(this, "Public Auto Share895: ${if (!current) "ON" else "OFF"}")
}

// v895: Pull Auto Refresh895
internal fun PlayerActivity.showV895PullAutoRefresh895Toggle() {
    val current = BiliClient.prefs.v895pullAutoRefresh895
    BiliClient.prefs.v895pullAutoRefresh895 = !current
    AppToast.show(this, "Pull Auto Refresh895: ${if (!current) "ON" else "OFF"}")
}

// v895: Pure Auto Mode895
internal fun PlayerActivity.showV895PureAutoMode895Toggle() {
    val current = BiliClient.prefs.v895pureAutoMode895
    BiliClient.prefs.v895pureAutoMode895 = !current
    AppToast.show(this, "Pure Auto Mode895: ${if (!current) "ON" else "OFF"}")
}

// v895: Push Auto Notify895
internal fun PlayerActivity.showV895PushAutoNotify895Toggle() {
    val current = BiliClient.prefs.v895pushAutoNotify895
    BiliClient.prefs.v895pushAutoNotify895 = !current
    AppToast.show(this, "Push Auto Notify895: ${if (!current) "ON" else "OFF"}")
}

// v895: Query Auto Optimize895
internal fun PlayerActivity.showV895QueryAutoOptimize895Toggle() {
    val current = BiliClient.prefs.v895queryAutoOptimize895
    BiliClient.prefs.v895queryAutoOptimize895 = !current
    AppToast.show(this, "Query Auto Optimize895: ${if (!current) "ON" else "OFF"}")
}

// v895: Queue Auto Priority895
internal fun PlayerActivity.showV895QueueAutoPriority895Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v895queueAutoPriority895).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority895",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v895queueAutoPriority895 = value
        AppToast.show(this, "Queue Auto Priority895: $value")
    }
}

// v896: Project Auto Export896
internal fun PlayerActivity.showV896ProjectAutoExport896Toggle() {
    val current = BiliClient.prefs.v896projectAutoExport896
    BiliClient.prefs.v896projectAutoExport896 = !current
    AppToast.show(this, "Project Auto Export896: ${if (!current) "ON" else "OFF"}")
}

// v896: Promise Auto Await896
internal fun PlayerActivity.showV896PromiseAutoAwait896Toggle() {
    val current = BiliClient.prefs.v896promiseAutoAwait896
    BiliClient.prefs.v896promiseAutoAwait896 = !current
    AppToast.show(this, "Promise Auto Await896: ${if (!current) "ON" else "OFF"}")
}

// v896: Prompt Auto Show896
internal fun PlayerActivity.showV896PromptAutoShow896Toggle() {
    val current = BiliClient.prefs.v896promptAutoShow896
    BiliClient.prefs.v896promptAutoShow896 = !current
    AppToast.show(this, "Prompt Auto Show896: ${if (!current) "ON" else "OFF"}")
}

// v896: Prop Auto Bind896
internal fun PlayerActivity.showV896PropAutoBind896Toggle() {
    val current = BiliClient.prefs.v896propAutoBind896
    BiliClient.prefs.v896propAutoBind896 = !current
    AppToast.show(this, "Prop Auto Bind896: ${if (!current) "ON" else "OFF"}")
}

// v896: Property Auto Observe896
internal fun PlayerActivity.showV896PropertyAutoObserve896Toggle() {
    val current = BiliClient.prefs.v896propertyAutoObserve896
    BiliClient.prefs.v896propertyAutoObserve896 = !current
    AppToast.show(this, "Property Auto Observe896: ${if (!current) "ON" else "OFF"}")
}

// v896: Protect Auto Encrypt896
internal fun PlayerActivity.showV896ProtectAutoEncrypt896Toggle() {
    val current = BiliClient.prefs.v896protectAutoEncrypt896
    BiliClient.prefs.v896protectAutoEncrypt896 = !current
    AppToast.show(this, "Protect Auto Encrypt896: ${if (!current) "ON" else "OFF"}")
}

// v896: Protocol Auto Negotiate896
internal fun PlayerActivity.showV896ProtocolAutoNegotiate896Toggle() {
    val current = BiliClient.prefs.v896protocolAutoNegotiate896
    BiliClient.prefs.v896protocolAutoNegotiate896 = !current
    AppToast.show(this, "Protocol Auto Negotiate896: ${if (!current) "ON" else "OFF"}")
}

// v896: Provide Auto Inject896
internal fun PlayerActivity.showV896ProvideAutoInject896Toggle() {
    val current = BiliClient.prefs.v896provideAutoInject896
    BiliClient.prefs.v896provideAutoInject896 = !current
    AppToast.show(this, "Provide Auto Inject896: ${if (!current) "ON" else "OFF"}")
}

// v896: Proxy Auto Rotate896
internal fun PlayerActivity.showV896ProxyAutoRotate896Toggle() {
    val current = BiliClient.prefs.v896proxyAutoRotate896
    BiliClient.prefs.v896proxyAutoRotate896 = !current
    AppToast.show(this, "Proxy Auto Rotate896: ${if (!current) "ON" else "OFF"}")
}

// v896: Public Auto Share896
internal fun PlayerActivity.showV896PublicAutoShare896Toggle() {
    val current = BiliClient.prefs.v896publicAutoShare896
    BiliClient.prefs.v896publicAutoShare896 = !current
    AppToast.show(this, "Public Auto Share896: ${if (!current) "ON" else "OFF"}")
}

// v896: Pull Auto Refresh896
internal fun PlayerActivity.showV896PullAutoRefresh896Toggle() {
    val current = BiliClient.prefs.v896pullAutoRefresh896
    BiliClient.prefs.v896pullAutoRefresh896 = !current
    AppToast.show(this, "Pull Auto Refresh896: ${if (!current) "ON" else "OFF"}")
}

// v896: Pure Auto Mode896
internal fun PlayerActivity.showV896PureAutoMode896Toggle() {
    val current = BiliClient.prefs.v896pureAutoMode896
    BiliClient.prefs.v896pureAutoMode896 = !current
    AppToast.show(this, "Pure Auto Mode896: ${if (!current) "ON" else "OFF"}")
}

// v896: Push Auto Notify896
internal fun PlayerActivity.showV896PushAutoNotify896Toggle() {
    val current = BiliClient.prefs.v896pushAutoNotify896
    BiliClient.prefs.v896pushAutoNotify896 = !current
    AppToast.show(this, "Push Auto Notify896: ${if (!current) "ON" else "OFF"}")
}

// v896: Query Auto Optimize896
internal fun PlayerActivity.showV896QueryAutoOptimize896Toggle() {
    val current = BiliClient.prefs.v896queryAutoOptimize896
    BiliClient.prefs.v896queryAutoOptimize896 = !current
    AppToast.show(this, "Query Auto Optimize896: ${if (!current) "ON" else "OFF"}")
}

// v896: Queue Auto Priority896
internal fun PlayerActivity.showV896QueueAutoPriority896Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v896queueAutoPriority896).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority896",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v896queueAutoPriority896 = value
        AppToast.show(this, "Queue Auto Priority896: $value")
    }
}

// v897: Project Auto Export897
internal fun PlayerActivity.showV897ProjectAutoExport897Toggle() {
    val current = BiliClient.prefs.v897projectAutoExport897
    BiliClient.prefs.v897projectAutoExport897 = !current
    AppToast.show(this, "Project Auto Export897: ${if (!current) "ON" else "OFF"}")
}

// v897: Promise Auto Await897
internal fun PlayerActivity.showV897PromiseAutoAwait897Toggle() {
    val current = BiliClient.prefs.v897promiseAutoAwait897
    BiliClient.prefs.v897promiseAutoAwait897 = !current
    AppToast.show(this, "Promise Auto Await897: ${if (!current) "ON" else "OFF"}")
}

// v897: Prompt Auto Show897
internal fun PlayerActivity.showV897PromptAutoShow897Toggle() {
    val current = BiliClient.prefs.v897promptAutoShow897
    BiliClient.prefs.v897promptAutoShow897 = !current
    AppToast.show(this, "Prompt Auto Show897: ${if (!current) "ON" else "OFF"}")
}

// v897: Prop Auto Bind897
internal fun PlayerActivity.showV897PropAutoBind897Toggle() {
    val current = BiliClient.prefs.v897propAutoBind897
    BiliClient.prefs.v897propAutoBind897 = !current
    AppToast.show(this, "Prop Auto Bind897: ${if (!current) "ON" else "OFF"}")
}

// v897: Property Auto Observe897
internal fun PlayerActivity.showV897PropertyAutoObserve897Toggle() {
    val current = BiliClient.prefs.v897propertyAutoObserve897
    BiliClient.prefs.v897propertyAutoObserve897 = !current
    AppToast.show(this, "Property Auto Observe897: ${if (!current) "ON" else "OFF"}")
}

// v897: Protect Auto Encrypt897
internal fun PlayerActivity.showV897ProtectAutoEncrypt897Toggle() {
    val current = BiliClient.prefs.v897protectAutoEncrypt897
    BiliClient.prefs.v897protectAutoEncrypt897 = !current
    AppToast.show(this, "Protect Auto Encrypt897: ${if (!current) "ON" else "OFF"}")
}

// v897: Protocol Auto Negotiate897
internal fun PlayerActivity.showV897ProtocolAutoNegotiate897Toggle() {
    val current = BiliClient.prefs.v897protocolAutoNegotiate897
    BiliClient.prefs.v897protocolAutoNegotiate897 = !current
    AppToast.show(this, "Protocol Auto Negotiate897: ${if (!current) "ON" else "OFF"}")
}

// v897: Provide Auto Inject897
internal fun PlayerActivity.showV897ProvideAutoInject897Toggle() {
    val current = BiliClient.prefs.v897provideAutoInject897
    BiliClient.prefs.v897provideAutoInject897 = !current
    AppToast.show(this, "Provide Auto Inject897: ${if (!current) "ON" else "OFF"}")
}

// v897: Proxy Auto Rotate897
internal fun PlayerActivity.showV897ProxyAutoRotate897Toggle() {
    val current = BiliClient.prefs.v897proxyAutoRotate897
    BiliClient.prefs.v897proxyAutoRotate897 = !current
    AppToast.show(this, "Proxy Auto Rotate897: ${if (!current) "ON" else "OFF"}")
}

// v897: Public Auto Share897
internal fun PlayerActivity.showV897PublicAutoShare897Toggle() {
    val current = BiliClient.prefs.v897publicAutoShare897
    BiliClient.prefs.v897publicAutoShare897 = !current
    AppToast.show(this, "Public Auto Share897: ${if (!current) "ON" else "OFF"}")
}

// v897: Pull Auto Refresh897
internal fun PlayerActivity.showV897PullAutoRefresh897Toggle() {
    val current = BiliClient.prefs.v897pullAutoRefresh897
    BiliClient.prefs.v897pullAutoRefresh897 = !current
    AppToast.show(this, "Pull Auto Refresh897: ${if (!current) "ON" else "OFF"}")
}

// v897: Pure Auto Mode897
internal fun PlayerActivity.showV897PureAutoMode897Toggle() {
    val current = BiliClient.prefs.v897pureAutoMode897
    BiliClient.prefs.v897pureAutoMode897 = !current
    AppToast.show(this, "Pure Auto Mode897: ${if (!current) "ON" else "OFF"}")
}

// v897: Push Auto Notify897
internal fun PlayerActivity.showV897PushAutoNotify897Toggle() {
    val current = BiliClient.prefs.v897pushAutoNotify897
    BiliClient.prefs.v897pushAutoNotify897 = !current
    AppToast.show(this, "Push Auto Notify897: ${if (!current) "ON" else "OFF"}")
}

// v897: Query Auto Optimize897
internal fun PlayerActivity.showV897QueryAutoOptimize897Toggle() {
    val current = BiliClient.prefs.v897queryAutoOptimize897
    BiliClient.prefs.v897queryAutoOptimize897 = !current
    AppToast.show(this, "Query Auto Optimize897: ${if (!current) "ON" else "OFF"}")
}

// v897: Queue Auto Priority897
internal fun PlayerActivity.showV897QueueAutoPriority897Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v897queueAutoPriority897).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority897",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v897queueAutoPriority897 = value
        AppToast.show(this, "Queue Auto Priority897: $value")
    }
}

// v898: Project Auto Export898
internal fun PlayerActivity.showV898ProjectAutoExport898Toggle() {
    val current = BiliClient.prefs.v898projectAutoExport898
    BiliClient.prefs.v898projectAutoExport898 = !current
    AppToast.show(this, "Project Auto Export898: ${if (!current) "ON" else "OFF"}")
}

// v898: Promise Auto Await898
internal fun PlayerActivity.showV898PromiseAutoAwait898Toggle() {
    val current = BiliClient.prefs.v898promiseAutoAwait898
    BiliClient.prefs.v898promiseAutoAwait898 = !current
    AppToast.show(this, "Promise Auto Await898: ${if (!current) "ON" else "OFF"}")
}

// v898: Prompt Auto Show898
internal fun PlayerActivity.showV898PromptAutoShow898Toggle() {
    val current = BiliClient.prefs.v898promptAutoShow898
    BiliClient.prefs.v898promptAutoShow898 = !current
    AppToast.show(this, "Prompt Auto Show898: ${if (!current) "ON" else "OFF"}")
}

// v898: Prop Auto Bind898
internal fun PlayerActivity.showV898PropAutoBind898Toggle() {
    val current = BiliClient.prefs.v898propAutoBind898
    BiliClient.prefs.v898propAutoBind898 = !current
    AppToast.show(this, "Prop Auto Bind898: ${if (!current) "ON" else "OFF"}")
}

// v898: Property Auto Observe898
internal fun PlayerActivity.showV898PropertyAutoObserve898Toggle() {
    val current = BiliClient.prefs.v898propertyAutoObserve898
    BiliClient.prefs.v898propertyAutoObserve898 = !current
    AppToast.show(this, "Property Auto Observe898: ${if (!current) "ON" else "OFF"}")
}

// v898: Protect Auto Encrypt898
internal fun PlayerActivity.showV898ProtectAutoEncrypt898Toggle() {
    val current = BiliClient.prefs.v898protectAutoEncrypt898
    BiliClient.prefs.v898protectAutoEncrypt898 = !current
    AppToast.show(this, "Protect Auto Encrypt898: ${if (!current) "ON" else "OFF"}")
}

// v898: Protocol Auto Negotiate898
internal fun PlayerActivity.showV898ProtocolAutoNegotiate898Toggle() {
    val current = BiliClient.prefs.v898protocolAutoNegotiate898
    BiliClient.prefs.v898protocolAutoNegotiate898 = !current
    AppToast.show(this, "Protocol Auto Negotiate898: ${if (!current) "ON" else "OFF"}")
}

// v898: Provide Auto Inject898
internal fun PlayerActivity.showV898ProvideAutoInject898Toggle() {
    val current = BiliClient.prefs.v898provideAutoInject898
    BiliClient.prefs.v898provideAutoInject898 = !current
    AppToast.show(this, "Provide Auto Inject898: ${if (!current) "ON" else "OFF"}")
}

// v898: Proxy Auto Rotate898
internal fun PlayerActivity.showV898ProxyAutoRotate898Toggle() {
    val current = BiliClient.prefs.v898proxyAutoRotate898
    BiliClient.prefs.v898proxyAutoRotate898 = !current
    AppToast.show(this, "Proxy Auto Rotate898: ${if (!current) "ON" else "OFF"}")
}

// v898: Public Auto Share898
internal fun PlayerActivity.showV898PublicAutoShare898Toggle() {
    val current = BiliClient.prefs.v898publicAutoShare898
    BiliClient.prefs.v898publicAutoShare898 = !current
    AppToast.show(this, "Public Auto Share898: ${if (!current) "ON" else "OFF"}")
}

// v898: Pull Auto Refresh898
internal fun PlayerActivity.showV898PullAutoRefresh898Toggle() {
    val current = BiliClient.prefs.v898pullAutoRefresh898
    BiliClient.prefs.v898pullAutoRefresh898 = !current
    AppToast.show(this, "Pull Auto Refresh898: ${if (!current) "ON" else "OFF"}")
}

// v898: Pure Auto Mode898
internal fun PlayerActivity.showV898PureAutoMode898Toggle() {
    val current = BiliClient.prefs.v898pureAutoMode898
    BiliClient.prefs.v898pureAutoMode898 = !current
    AppToast.show(this, "Pure Auto Mode898: ${if (!current) "ON" else "OFF"}")
}

// v898: Push Auto Notify898
internal fun PlayerActivity.showV898PushAutoNotify898Toggle() {
    val current = BiliClient.prefs.v898pushAutoNotify898
    BiliClient.prefs.v898pushAutoNotify898 = !current
    AppToast.show(this, "Push Auto Notify898: ${if (!current) "ON" else "OFF"}")
}

// v898: Query Auto Optimize898
internal fun PlayerActivity.showV898QueryAutoOptimize898Toggle() {
    val current = BiliClient.prefs.v898queryAutoOptimize898
    BiliClient.prefs.v898queryAutoOptimize898 = !current
    AppToast.show(this, "Query Auto Optimize898: ${if (!current) "ON" else "OFF"}")
}

// v898: Queue Auto Priority898
internal fun PlayerActivity.showV898QueueAutoPriority898Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v898queueAutoPriority898).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority898",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v898queueAutoPriority898 = value
        AppToast.show(this, "Queue Auto Priority898: $value")
    }
}

// v899: Project Auto Export899
internal fun PlayerActivity.showV899ProjectAutoExport899Toggle() {
    val current = BiliClient.prefs.v899projectAutoExport899
    BiliClient.prefs.v899projectAutoExport899 = !current
    AppToast.show(this, "Project Auto Export899: ${if (!current) "ON" else "OFF"}")
}

// v899: Promise Auto Await899
internal fun PlayerActivity.showV899PromiseAutoAwait899Toggle() {
    val current = BiliClient.prefs.v899promiseAutoAwait899
    BiliClient.prefs.v899promiseAutoAwait899 = !current
    AppToast.show(this, "Promise Auto Await899: ${if (!current) "ON" else "OFF"}")
}

// v899: Prompt Auto Show899
internal fun PlayerActivity.showV899PromptAutoShow899Toggle() {
    val current = BiliClient.prefs.v899promptAutoShow899
    BiliClient.prefs.v899promptAutoShow899 = !current
    AppToast.show(this, "Prompt Auto Show899: ${if (!current) "ON" else "OFF"}")
}

// v899: Prop Auto Bind899
internal fun PlayerActivity.showV899PropAutoBind899Toggle() {
    val current = BiliClient.prefs.v899propAutoBind899
    BiliClient.prefs.v899propAutoBind899 = !current
    AppToast.show(this, "Prop Auto Bind899: ${if (!current) "ON" else "OFF"}")
}

// v899: Property Auto Observe899
internal fun PlayerActivity.showV899PropertyAutoObserve899Toggle() {
    val current = BiliClient.prefs.v899propertyAutoObserve899
    BiliClient.prefs.v899propertyAutoObserve899 = !current
    AppToast.show(this, "Property Auto Observe899: ${if (!current) "ON" else "OFF"}")
}

// v899: Protect Auto Encrypt899
internal fun PlayerActivity.showV899ProtectAutoEncrypt899Toggle() {
    val current = BiliClient.prefs.v899protectAutoEncrypt899
    BiliClient.prefs.v899protectAutoEncrypt899 = !current
    AppToast.show(this, "Protect Auto Encrypt899: ${if (!current) "ON" else "OFF"}")
}

// v899: Protocol Auto Negotiate899
internal fun PlayerActivity.showV899ProtocolAutoNegotiate899Toggle() {
    val current = BiliClient.prefs.v899protocolAutoNegotiate899
    BiliClient.prefs.v899protocolAutoNegotiate899 = !current
    AppToast.show(this, "Protocol Auto Negotiate899: ${if (!current) "ON" else "OFF"}")
}

// v899: Provide Auto Inject899
internal fun PlayerActivity.showV899ProvideAutoInject899Toggle() {
    val current = BiliClient.prefs.v899provideAutoInject899
    BiliClient.prefs.v899provideAutoInject899 = !current
    AppToast.show(this, "Provide Auto Inject899: ${if (!current) "ON" else "OFF"}")
}

// v899: Proxy Auto Rotate899
internal fun PlayerActivity.showV899ProxyAutoRotate899Toggle() {
    val current = BiliClient.prefs.v899proxyAutoRotate899
    BiliClient.prefs.v899proxyAutoRotate899 = !current
    AppToast.show(this, "Proxy Auto Rotate899: ${if (!current) "ON" else "OFF"}")
}

// v899: Public Auto Share899
internal fun PlayerActivity.showV899PublicAutoShare899Toggle() {
    val current = BiliClient.prefs.v899publicAutoShare899
    BiliClient.prefs.v899publicAutoShare899 = !current
    AppToast.show(this, "Public Auto Share899: ${if (!current) "ON" else "OFF"}")
}

// v899: Pull Auto Refresh899
internal fun PlayerActivity.showV899PullAutoRefresh899Toggle() {
    val current = BiliClient.prefs.v899pullAutoRefresh899
    BiliClient.prefs.v899pullAutoRefresh899 = !current
    AppToast.show(this, "Pull Auto Refresh899: ${if (!current) "ON" else "OFF"}")
}

// v899: Pure Auto Mode899
internal fun PlayerActivity.showV899PureAutoMode899Toggle() {
    val current = BiliClient.prefs.v899pureAutoMode899
    BiliClient.prefs.v899pureAutoMode899 = !current
    AppToast.show(this, "Pure Auto Mode899: ${if (!current) "ON" else "OFF"}")
}

// v899: Push Auto Notify899
internal fun PlayerActivity.showV899PushAutoNotify899Toggle() {
    val current = BiliClient.prefs.v899pushAutoNotify899
    BiliClient.prefs.v899pushAutoNotify899 = !current
    AppToast.show(this, "Push Auto Notify899: ${if (!current) "ON" else "OFF"}")
}

// v899: Query Auto Optimize899
internal fun PlayerActivity.showV899QueryAutoOptimize899Toggle() {
    val current = BiliClient.prefs.v899queryAutoOptimize899
    BiliClient.prefs.v899queryAutoOptimize899 = !current
    AppToast.show(this, "Query Auto Optimize899: ${if (!current) "ON" else "OFF"}")
}

// v899: Queue Auto Priority899
internal fun PlayerActivity.showV899QueueAutoPriority899Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v899queueAutoPriority899).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority899",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v899queueAutoPriority899 = value
        AppToast.show(this, "Queue Auto Priority899: $value")
    }
}

// v900: Project Auto Export900
internal fun PlayerActivity.showV900ProjectAutoExport900Toggle() {
    val current = BiliClient.prefs.v900projectAutoExport900
    BiliClient.prefs.v900projectAutoExport900 = !current
    AppToast.show(this, "Project Auto Export900: ${if (!current) "ON" else "OFF"}")
}

// v900: Promise Auto Await900
internal fun PlayerActivity.showV900PromiseAutoAwait900Toggle() {
    val current = BiliClient.prefs.v900promiseAutoAwait900
    BiliClient.prefs.v900promiseAutoAwait900 = !current
    AppToast.show(this, "Promise Auto Await900: ${if (!current) "ON" else "OFF"}")
}

// v900: Prompt Auto Show900
internal fun PlayerActivity.showV900PromptAutoShow900Toggle() {
    val current = BiliClient.prefs.v900promptAutoShow900
    BiliClient.prefs.v900promptAutoShow900 = !current
    AppToast.show(this, "Prompt Auto Show900: ${if (!current) "ON" else "OFF"}")
}

// v900: Prop Auto Bind900
internal fun PlayerActivity.showV900PropAutoBind900Toggle() {
    val current = BiliClient.prefs.v900propAutoBind900
    BiliClient.prefs.v900propAutoBind900 = !current
    AppToast.show(this, "Prop Auto Bind900: ${if (!current) "ON" else "OFF"}")
}

// v900: Property Auto Observe900
internal fun PlayerActivity.showV900PropertyAutoObserve900Toggle() {
    val current = BiliClient.prefs.v900propertyAutoObserve900
    BiliClient.prefs.v900propertyAutoObserve900 = !current
    AppToast.show(this, "Property Auto Observe900: ${if (!current) "ON" else "OFF"}")
}

// v900: Protect Auto Encrypt900
internal fun PlayerActivity.showV900ProtectAutoEncrypt900Toggle() {
    val current = BiliClient.prefs.v900protectAutoEncrypt900
    BiliClient.prefs.v900protectAutoEncrypt900 = !current
    AppToast.show(this, "Protect Auto Encrypt900: ${if (!current) "ON" else "OFF"}")
}

// v900: Protocol Auto Negotiate900
internal fun PlayerActivity.showV900ProtocolAutoNegotiate900Toggle() {
    val current = BiliClient.prefs.v900protocolAutoNegotiate900
    BiliClient.prefs.v900protocolAutoNegotiate900 = !current
    AppToast.show(this, "Protocol Auto Negotiate900: ${if (!current) "ON" else "OFF"}")
}

// v900: Provide Auto Inject900
internal fun PlayerActivity.showV900ProvideAutoInject900Toggle() {
    val current = BiliClient.prefs.v900provideAutoInject900
    BiliClient.prefs.v900provideAutoInject900 = !current
    AppToast.show(this, "Provide Auto Inject900: ${if (!current) "ON" else "OFF"}")
}

// v900: Proxy Auto Rotate900
internal fun PlayerActivity.showV900ProxyAutoRotate900Toggle() {
    val current = BiliClient.prefs.v900proxyAutoRotate900
    BiliClient.prefs.v900proxyAutoRotate900 = !current
    AppToast.show(this, "Proxy Auto Rotate900: ${if (!current) "ON" else "OFF"}")
}

// v900: Public Auto Share900
internal fun PlayerActivity.showV900PublicAutoShare900Toggle() {
    val current = BiliClient.prefs.v900publicAutoShare900
    BiliClient.prefs.v900publicAutoShare900 = !current
    AppToast.show(this, "Public Auto Share900: ${if (!current) "ON" else "OFF"}")
}

// v900: Pull Auto Refresh900
internal fun PlayerActivity.showV900PullAutoRefresh900Toggle() {
    val current = BiliClient.prefs.v900pullAutoRefresh900
    BiliClient.prefs.v900pullAutoRefresh900 = !current
    AppToast.show(this, "Pull Auto Refresh900: ${if (!current) "ON" else "OFF"}")
}

// v900: Pure Auto Mode900
internal fun PlayerActivity.showV900PureAutoMode900Toggle() {
    val current = BiliClient.prefs.v900pureAutoMode900
    BiliClient.prefs.v900pureAutoMode900 = !current
    AppToast.show(this, "Pure Auto Mode900: ${if (!current) "ON" else "OFF"}")
}

// v900: Push Auto Notify900
internal fun PlayerActivity.showV900PushAutoNotify900Toggle() {
    val current = BiliClient.prefs.v900pushAutoNotify900
    BiliClient.prefs.v900pushAutoNotify900 = !current
    AppToast.show(this, "Push Auto Notify900: ${if (!current) "ON" else "OFF"}")
}

// v900: Query Auto Optimize900
internal fun PlayerActivity.showV900QueryAutoOptimize900Toggle() {
    val current = BiliClient.prefs.v900queryAutoOptimize900
    BiliClient.prefs.v900queryAutoOptimize900 = !current
    AppToast.show(this, "Query Auto Optimize900: ${if (!current) "ON" else "OFF"}")
}

// v900: Queue Auto Priority900
internal fun PlayerActivity.showV900QueueAutoPriority900Dialog() {
    val options = listOf(0, 1, 2, 3)
    val ci2 = options.indexOf(BiliClient.prefs.v900queueAutoPriority900).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Queue Auto Priority900",
        options = options,
        checkedIndex = ci2,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v900queueAutoPriority900 = value
        AppToast.show(this, "Queue Auto Priority900: $value")
    }
}

