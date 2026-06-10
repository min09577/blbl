package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v596: Audio Auto Normalize596
internal fun PlayerActivity.showV596AudioAutoNormalize596Toggle() {
    val current = BiliClient.prefs.v596audioAutoNormalize596
    BiliClient.prefs.v596audioAutoNormalize596 = !current
    AppToast.show(this, "Audio Auto Normalize596: ${if (!current) "ON" else "OFF"}")
}

// v596: Axis Auto Align596
internal fun PlayerActivity.showV596AxisAutoAlign596Toggle() {
    val current = BiliClient.prefs.v596axisAutoAlign596
    BiliClient.prefs.v596axisAutoAlign596 = !current
    AppToast.show(this, "Axis Auto Align596: ${if (!current) "ON" else "OFF"}")
}

// v596: Badge Auto Count596
internal fun PlayerActivity.showV596BadgeAutoCount596Toggle() {
    val current = BiliClient.prefs.v596badgeAutoCount596
    BiliClient.prefs.v596badgeAutoCount596 = !current
    AppToast.show(this, "Badge Auto Count596: ${if (!current) "ON" else "OFF"}")
}

// v596: Baseline Auto Sync596
internal fun PlayerActivity.showV596BaselineAutoSync596Toggle() {
    val current = BiliClient.prefs.v596baselineAutoSync596
    BiliClient.prefs.v596baselineAutoSync596 = !current
    AppToast.show(this, "Baseline Auto Sync596: ${if (!current) "ON" else "OFF"}")
}

// v596: Bind Auto Link596
internal fun PlayerActivity.showV596BindAutoLink596Toggle() {
    val current = BiliClient.prefs.v596bindAutoLink596
    BiliClient.prefs.v596bindAutoLink596 = !current
    AppToast.show(this, "Bind Auto Link596: ${if (!current) "ON" else "OFF"}")
}

// v596: Bitrate Auto Scale596
internal fun PlayerActivity.showV596BitrateAutoScale596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596bitrateAutoScale596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596bitrateAutoScale596 = value
        AppToast.show(this, "Bitrate Auto Scale596: $value")
    }
}

// v596: Blend Auto Mode596
internal fun PlayerActivity.showV596BlendAutoMode596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596blendAutoMode596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596blendAutoMode596 = value
        AppToast.show(this, "Blend Auto Mode596: $value")
    }
}

// v597: Web Auto Redirect597
internal fun PlayerActivity.showV597WebAutoRedirect597Toggle() {
    val current = BiliClient.prefs.v597webAutoRedirect597
    BiliClient.prefs.v597webAutoRedirect597 = !current
    AppToast.show(this, "Web Auto Redirect597: ${if (!current) "ON" else "OFF"}")
}

// v597: Widget Auto Refresh597
internal fun PlayerActivity.showV597WidgetAutoRefresh597Toggle() {
    val current = BiliClient.prefs.v597widgetAutoRefresh597
    BiliClient.prefs.v597widgetAutoRefresh597 = !current
    AppToast.show(this, "Widget Auto Refresh597: ${if (!current) "ON" else "OFF"}")
}

// v597: Window Auto Snap597
internal fun PlayerActivity.showV597WindowAutoSnap597Toggle() {
    val current = BiliClient.prefs.v597windowAutoSnap597
    BiliClient.prefs.v597windowAutoSnap597 = !current
    AppToast.show(this, "Window Auto Snap597: ${if (!current) "ON" else "OFF"}")
}

// v597: Wrap Auto Break597
internal fun PlayerActivity.showV597WrapAutoBreak597Toggle() {
    val current = BiliClient.prefs.v597wrapAutoBreak597
    BiliClient.prefs.v597wrapAutoBreak597 = !current
    AppToast.show(this, "Wrap Auto Break597: ${if (!current) "ON" else "OFF"}")
}

// v597: Zone Auto Detect597
internal fun PlayerActivity.showV597ZoneAutoDetect597Toggle() {
    val current = BiliClient.prefs.v597zoneAutoDetect597
    BiliClient.prefs.v597zoneAutoDetect597 = !current
    AppToast.show(this, "Zone Auto Detect597: ${if (!current) "ON" else "OFF"}")
}

// v597: Anchor Auto Pin597
internal fun PlayerActivity.showV597AnchorAutoPin597Toggle() {
    val current = BiliClient.prefs.v597anchorAutoPin597
    BiliClient.prefs.v597anchorAutoPin597 = !current
    AppToast.show(this, "Anchor Auto Pin597: ${if (!current) "ON" else "OFF"}")
}

// v597: Aspect Auto Ratio597
internal fun PlayerActivity.showV597AspectAutoRatio597Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v597aspectAutoRatio597).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio597",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v597aspectAutoRatio597 = value
        AppToast.show(this, "Aspect Auto Ratio597: $value")
    }
}

// v597: Attach Auto Embed597
internal fun PlayerActivity.showV597AttachAutoEmbed597Toggle() {
    val current = BiliClient.prefs.v597attachAutoEmbed597
    BiliClient.prefs.v597attachAutoEmbed597 = !current
    AppToast.show(this, "Attach Auto Embed597: ${if (!current) "ON" else "OFF"}")
}

// v597: Audio Auto Normalize597
internal fun PlayerActivity.showV597AudioAutoNormalize597Toggle() {
    val current = BiliClient.prefs.v597audioAutoNormalize597
    BiliClient.prefs.v597audioAutoNormalize597 = !current
    AppToast.show(this, "Audio Auto Normalize597: ${if (!current) "ON" else "OFF"}")
}

// v597: Axis Auto Align597
internal fun PlayerActivity.showV597AxisAutoAlign597Toggle() {
    val current = BiliClient.prefs.v597axisAutoAlign597
    BiliClient.prefs.v597axisAutoAlign597 = !current
    AppToast.show(this, "Axis Auto Align597: ${if (!current) "ON" else "OFF"}")
}

// v597: Badge Auto Count597
internal fun PlayerActivity.showV597BadgeAutoCount597Toggle() {
    val current = BiliClient.prefs.v597badgeAutoCount597
    BiliClient.prefs.v597badgeAutoCount597 = !current
    AppToast.show(this, "Badge Auto Count597: ${if (!current) "ON" else "OFF"}")
}

// v597: Baseline Auto Sync597
internal fun PlayerActivity.showV597BaselineAutoSync597Toggle() {
    val current = BiliClient.prefs.v597baselineAutoSync597
    BiliClient.prefs.v597baselineAutoSync597 = !current
    AppToast.show(this, "Baseline Auto Sync597: ${if (!current) "ON" else "OFF"}")
}

// v597: Bind Auto Link597
internal fun PlayerActivity.showV597BindAutoLink597Toggle() {
    val current = BiliClient.prefs.v597bindAutoLink597
    BiliClient.prefs.v597bindAutoLink597 = !current
    AppToast.show(this, "Bind Auto Link597: ${if (!current) "ON" else "OFF"}")
}

// v597: Bitrate Auto Scale597
internal fun PlayerActivity.showV597BitrateAutoScale597Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v597bitrateAutoScale597).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale597",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v597bitrateAutoScale597 = value
        AppToast.show(this, "Bitrate Auto Scale597: $value")
    }
}

// v597: Blend Auto Mode597
internal fun PlayerActivity.showV597BlendAutoMode597Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v597blendAutoMode597).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode597",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v597blendAutoMode597 = value
        AppToast.show(this, "Blend Auto Mode597: $value")
    }
}

// v598: Web Auto Redirect598
internal fun PlayerActivity.showV598WebAutoRedirect598Toggle() {
    val current = BiliClient.prefs.v598webAutoRedirect598
    BiliClient.prefs.v598webAutoRedirect598 = !current
    AppToast.show(this, "Web Auto Redirect598: ${if (!current) "ON" else "OFF"}")
}

// v598: Widget Auto Refresh598
internal fun PlayerActivity.showV598WidgetAutoRefresh598Toggle() {
    val current = BiliClient.prefs.v598widgetAutoRefresh598
    BiliClient.prefs.v598widgetAutoRefresh598 = !current
    AppToast.show(this, "Widget Auto Refresh598: ${if (!current) "ON" else "OFF"}")
}

// v598: Window Auto Snap598
internal fun PlayerActivity.showV598WindowAutoSnap598Toggle() {
    val current = BiliClient.prefs.v598windowAutoSnap598
    BiliClient.prefs.v598windowAutoSnap598 = !current
    AppToast.show(this, "Window Auto Snap598: ${if (!current) "ON" else "OFF"}")
}

// v598: Wrap Auto Break598
internal fun PlayerActivity.showV598WrapAutoBreak598Toggle() {
    val current = BiliClient.prefs.v598wrapAutoBreak598
    BiliClient.prefs.v598wrapAutoBreak598 = !current
    AppToast.show(this, "Wrap Auto Break598: ${if (!current) "ON" else "OFF"}")
}

// v598: Zone Auto Detect598
internal fun PlayerActivity.showV598ZoneAutoDetect598Toggle() {
    val current = BiliClient.prefs.v598zoneAutoDetect598
    BiliClient.prefs.v598zoneAutoDetect598 = !current
    AppToast.show(this, "Zone Auto Detect598: ${if (!current) "ON" else "OFF"}")
}

// v598: Anchor Auto Pin598
internal fun PlayerActivity.showV598AnchorAutoPin598Toggle() {
    val current = BiliClient.prefs.v598anchorAutoPin598
    BiliClient.prefs.v598anchorAutoPin598 = !current
    AppToast.show(this, "Anchor Auto Pin598: ${if (!current) "ON" else "OFF"}")
}

// v598: Aspect Auto Ratio598
internal fun PlayerActivity.showV598AspectAutoRatio598Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v598aspectAutoRatio598).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio598",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v598aspectAutoRatio598 = value
        AppToast.show(this, "Aspect Auto Ratio598: $value")
    }
}

// v598: Attach Auto Embed598
internal fun PlayerActivity.showV598AttachAutoEmbed598Toggle() {
    val current = BiliClient.prefs.v598attachAutoEmbed598
    BiliClient.prefs.v598attachAutoEmbed598 = !current
    AppToast.show(this, "Attach Auto Embed598: ${if (!current) "ON" else "OFF"}")
}

// v598: Audio Auto Normalize598
internal fun PlayerActivity.showV598AudioAutoNormalize598Toggle() {
    val current = BiliClient.prefs.v598audioAutoNormalize598
    BiliClient.prefs.v598audioAutoNormalize598 = !current
    AppToast.show(this, "Audio Auto Normalize598: ${if (!current) "ON" else "OFF"}")
}

// v598: Axis Auto Align598
internal fun PlayerActivity.showV598AxisAutoAlign598Toggle() {
    val current = BiliClient.prefs.v598axisAutoAlign598
    BiliClient.prefs.v598axisAutoAlign598 = !current
    AppToast.show(this, "Axis Auto Align598: ${if (!current) "ON" else "OFF"}")
}

// v598: Badge Auto Count598
internal fun PlayerActivity.showV598BadgeAutoCount598Toggle() {
    val current = BiliClient.prefs.v598badgeAutoCount598
    BiliClient.prefs.v598badgeAutoCount598 = !current
    AppToast.show(this, "Badge Auto Count598: ${if (!current) "ON" else "OFF"}")
}

// v598: Baseline Auto Sync598
internal fun PlayerActivity.showV598BaselineAutoSync598Toggle() {
    val current = BiliClient.prefs.v598baselineAutoSync598
    BiliClient.prefs.v598baselineAutoSync598 = !current
    AppToast.show(this, "Baseline Auto Sync598: ${if (!current) "ON" else "OFF"}")
}

// v598: Bind Auto Link598
internal fun PlayerActivity.showV598BindAutoLink598Toggle() {
    val current = BiliClient.prefs.v598bindAutoLink598
    BiliClient.prefs.v598bindAutoLink598 = !current
    AppToast.show(this, "Bind Auto Link598: ${if (!current) "ON" else "OFF"}")
}

// v598: Bitrate Auto Scale598
internal fun PlayerActivity.showV598BitrateAutoScale598Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v598bitrateAutoScale598).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale598",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v598bitrateAutoScale598 = value
        AppToast.show(this, "Bitrate Auto Scale598: $value")
    }
}

// v598: Blend Auto Mode598
internal fun PlayerActivity.showV598BlendAutoMode598Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v598blendAutoMode598).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode598",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v598blendAutoMode598 = value
        AppToast.show(this, "Blend Auto Mode598: $value")
    }
}

// v599: Web Auto Redirect599
internal fun PlayerActivity.showV599WebAutoRedirect599Toggle() {
    val current = BiliClient.prefs.v599webAutoRedirect599
    BiliClient.prefs.v599webAutoRedirect599 = !current
    AppToast.show(this, "Web Auto Redirect599: ${if (!current) "ON" else "OFF"}")
}

// v599: Widget Auto Refresh599
internal fun PlayerActivity.showV599WidgetAutoRefresh599Toggle() {
    val current = BiliClient.prefs.v599widgetAutoRefresh599
    BiliClient.prefs.v599widgetAutoRefresh599 = !current
    AppToast.show(this, "Widget Auto Refresh599: ${if (!current) "ON" else "OFF"}")
}

// v599: Window Auto Snap599
internal fun PlayerActivity.showV599WindowAutoSnap599Toggle() {
    val current = BiliClient.prefs.v599windowAutoSnap599
    BiliClient.prefs.v599windowAutoSnap599 = !current
    AppToast.show(this, "Window Auto Snap599: ${if (!current) "ON" else "OFF"}")
}

// v599: Wrap Auto Break599
internal fun PlayerActivity.showV599WrapAutoBreak599Toggle() {
    val current = BiliClient.prefs.v599wrapAutoBreak599
    BiliClient.prefs.v599wrapAutoBreak599 = !current
    AppToast.show(this, "Wrap Auto Break599: ${if (!current) "ON" else "OFF"}")
}

// v599: Zone Auto Detect599
internal fun PlayerActivity.showV599ZoneAutoDetect599Toggle() {
    val current = BiliClient.prefs.v599zoneAutoDetect599
    BiliClient.prefs.v599zoneAutoDetect599 = !current
    AppToast.show(this, "Zone Auto Detect599: ${if (!current) "ON" else "OFF"}")
}

// v599: Anchor Auto Pin599
internal fun PlayerActivity.showV599AnchorAutoPin599Toggle() {
    val current = BiliClient.prefs.v599anchorAutoPin599
    BiliClient.prefs.v599anchorAutoPin599 = !current
    AppToast.show(this, "Anchor Auto Pin599: ${if (!current) "ON" else "OFF"}")
}

// v599: Aspect Auto Ratio599
internal fun PlayerActivity.showV599AspectAutoRatio599Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v599aspectAutoRatio599).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio599",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v599aspectAutoRatio599 = value
        AppToast.show(this, "Aspect Auto Ratio599: $value")
    }
}

// v599: Attach Auto Embed599
internal fun PlayerActivity.showV599AttachAutoEmbed599Toggle() {
    val current = BiliClient.prefs.v599attachAutoEmbed599
    BiliClient.prefs.v599attachAutoEmbed599 = !current
    AppToast.show(this, "Attach Auto Embed599: ${if (!current) "ON" else "OFF"}")
}

// v599: Audio Auto Normalize599
internal fun PlayerActivity.showV599AudioAutoNormalize599Toggle() {
    val current = BiliClient.prefs.v599audioAutoNormalize599
    BiliClient.prefs.v599audioAutoNormalize599 = !current
    AppToast.show(this, "Audio Auto Normalize599: ${if (!current) "ON" else "OFF"}")
}

// v599: Axis Auto Align599
internal fun PlayerActivity.showV599AxisAutoAlign599Toggle() {
    val current = BiliClient.prefs.v599axisAutoAlign599
    BiliClient.prefs.v599axisAutoAlign599 = !current
    AppToast.show(this, "Axis Auto Align599: ${if (!current) "ON" else "OFF"}")
}

// v599: Badge Auto Count599
internal fun PlayerActivity.showV599BadgeAutoCount599Toggle() {
    val current = BiliClient.prefs.v599badgeAutoCount599
    BiliClient.prefs.v599badgeAutoCount599 = !current
    AppToast.show(this, "Badge Auto Count599: ${if (!current) "ON" else "OFF"}")
}

// v599: Baseline Auto Sync599
internal fun PlayerActivity.showV599BaselineAutoSync599Toggle() {
    val current = BiliClient.prefs.v599baselineAutoSync599
    BiliClient.prefs.v599baselineAutoSync599 = !current
    AppToast.show(this, "Baseline Auto Sync599: ${if (!current) "ON" else "OFF"}")
}

// v599: Bind Auto Link599
internal fun PlayerActivity.showV599BindAutoLink599Toggle() {
    val current = BiliClient.prefs.v599bindAutoLink599
    BiliClient.prefs.v599bindAutoLink599 = !current
    AppToast.show(this, "Bind Auto Link599: ${if (!current) "ON" else "OFF"}")
}

// v599: Bitrate Auto Scale599
internal fun PlayerActivity.showV599BitrateAutoScale599Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v599bitrateAutoScale599).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale599",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v599bitrateAutoScale599 = value
        AppToast.show(this, "Bitrate Auto Scale599: $value")
    }
}

// v599: Blend Auto Mode599
internal fun PlayerActivity.showV599BlendAutoMode599Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v599blendAutoMode599).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode599",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v599blendAutoMode599 = value
        AppToast.show(this, "Blend Auto Mode599: $value")
    }
}

// v600: Web Auto Redirect600
internal fun PlayerActivity.showV600WebAutoRedirect600Toggle() {
    val current = BiliClient.prefs.v600webAutoRedirect600
    BiliClient.prefs.v600webAutoRedirect600 = !current
    AppToast.show(this, "Web Auto Redirect600: ${if (!current) "ON" else "OFF"}")
}

// v600: Widget Auto Refresh600
internal fun PlayerActivity.showV600WidgetAutoRefresh600Toggle() {
    val current = BiliClient.prefs.v600widgetAutoRefresh600
    BiliClient.prefs.v600widgetAutoRefresh600 = !current
    AppToast.show(this, "Widget Auto Refresh600: ${if (!current) "ON" else "OFF"}")
}

// v600: Window Auto Snap600
internal fun PlayerActivity.showV600WindowAutoSnap600Toggle() {
    val current = BiliClient.prefs.v600windowAutoSnap600
    BiliClient.prefs.v600windowAutoSnap600 = !current
    AppToast.show(this, "Window Auto Snap600: ${if (!current) "ON" else "OFF"}")
}

// v600: Wrap Auto Break600
internal fun PlayerActivity.showV600WrapAutoBreak600Toggle() {
    val current = BiliClient.prefs.v600wrapAutoBreak600
    BiliClient.prefs.v600wrapAutoBreak600 = !current
    AppToast.show(this, "Wrap Auto Break600: ${if (!current) "ON" else "OFF"}")
}

// v600: Zone Auto Detect600
internal fun PlayerActivity.showV600ZoneAutoDetect600Toggle() {
    val current = BiliClient.prefs.v600zoneAutoDetect600
    BiliClient.prefs.v600zoneAutoDetect600 = !current
    AppToast.show(this, "Zone Auto Detect600: ${if (!current) "ON" else "OFF"}")
}

// v600: Anchor Auto Pin600
internal fun PlayerActivity.showV600AnchorAutoPin600Toggle() {
    val current = BiliClient.prefs.v600anchorAutoPin600
    BiliClient.prefs.v600anchorAutoPin600 = !current
    AppToast.show(this, "Anchor Auto Pin600: ${if (!current) "ON" else "OFF"}")
}

// v600: Aspect Auto Ratio600
internal fun PlayerActivity.showV600AspectAutoRatio600Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v600aspectAutoRatio600).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio600",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v600aspectAutoRatio600 = value
        AppToast.show(this, "Aspect Auto Ratio600: $value")
    }
}

// v600: Attach Auto Embed600
internal fun PlayerActivity.showV600AttachAutoEmbed600Toggle() {
    val current = BiliClient.prefs.v600attachAutoEmbed600
    BiliClient.prefs.v600attachAutoEmbed600 = !current
    AppToast.show(this, "Attach Auto Embed600: ${if (!current) "ON" else "OFF"}")
}

// v600: Audio Auto Normalize600
internal fun PlayerActivity.showV600AudioAutoNormalize600Toggle() {
    val current = BiliClient.prefs.v600audioAutoNormalize600
    BiliClient.prefs.v600audioAutoNormalize600 = !current
    AppToast.show(this, "Audio Auto Normalize600: ${if (!current) "ON" else "OFF"}")
}

// v600: Axis Auto Align600
internal fun PlayerActivity.showV600AxisAutoAlign600Toggle() {
    val current = BiliClient.prefs.v600axisAutoAlign600
    BiliClient.prefs.v600axisAutoAlign600 = !current
    AppToast.show(this, "Axis Auto Align600: ${if (!current) "ON" else "OFF"}")
}

// v600: Badge Auto Count600
internal fun PlayerActivity.showV600BadgeAutoCount600Toggle() {
    val current = BiliClient.prefs.v600badgeAutoCount600
    BiliClient.prefs.v600badgeAutoCount600 = !current
    AppToast.show(this, "Badge Auto Count600: ${if (!current) "ON" else "OFF"}")
}

// v600: Baseline Auto Sync600
internal fun PlayerActivity.showV600BaselineAutoSync600Toggle() {
    val current = BiliClient.prefs.v600baselineAutoSync600
    BiliClient.prefs.v600baselineAutoSync600 = !current
    AppToast.show(this, "Baseline Auto Sync600: ${if (!current) "ON" else "OFF"}")
}

// v600: Bind Auto Link600
internal fun PlayerActivity.showV600BindAutoLink600Toggle() {
    val current = BiliClient.prefs.v600bindAutoLink600
    BiliClient.prefs.v600bindAutoLink600 = !current
    AppToast.show(this, "Bind Auto Link600: ${if (!current) "ON" else "OFF"}")
}

// v600: Bitrate Auto Scale600
internal fun PlayerActivity.showV600BitrateAutoScale600Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v600bitrateAutoScale600).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale600",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v600bitrateAutoScale600 = value
        AppToast.show(this, "Bitrate Auto Scale600: $value")
    }
}

// v600: Blend Auto Mode600
internal fun PlayerActivity.showV600BlendAutoMode600Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v600blendAutoMode600).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode600",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v600blendAutoMode600 = value
        AppToast.show(this, "Blend Auto Mode600: $value")
    }
}

// v601: Action Auto Repeat601
internal fun PlayerActivity.showV601ActionAutoRepeat601Toggle() {
    val current = BiliClient.prefs.v601actionAutoRepeat601
    BiliClient.prefs.v601actionAutoRepeat601 = !current
    AppToast.show(this, "Action Auto Repeat601: ${if (!current) "ON" else "OFF"}")
}

// v601: Adapter Auto Switch601
internal fun PlayerActivity.showV601AdapterAutoSwitch601Toggle() {
    val current = BiliClient.prefs.v601adapterAutoSwitch601
    BiliClient.prefs.v601adapterAutoSwitch601 = !current
    AppToast.show(this, "Adapter Auto Switch601: ${if (!current) "ON" else "OFF"}")
}

// v601: Agent Auto Connect601
internal fun PlayerActivity.showV601AgentAutoConnect601Toggle() {
    val current = BiliClient.prefs.v601agentAutoConnect601
    BiliClient.prefs.v601agentAutoConnect601 = !current
    AppToast.show(this, "Agent Auto Connect601: ${if (!current) "ON" else "OFF"}")
}

// v601: Alias Auto Resolve601
internal fun PlayerActivity.showV601AliasAutoResolve601Toggle() {
    val current = BiliClient.prefs.v601aliasAutoResolve601
    BiliClient.prefs.v601aliasAutoResolve601 = !current
    AppToast.show(this, "Alias Auto Resolve601: ${if (!current) "ON" else "OFF"}")
}

// v601: Align Auto Center601
internal fun PlayerActivity.showV601AlignAutoCenter601Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v601alignAutoCenter601).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center601",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v601alignAutoCenter601 = value
        AppToast.show(this, "Align Auto Center601: $value")
    }
}

// v601: Alive Auto Keep601
internal fun PlayerActivity.showV601AliveAutoKeep601Toggle() {
    val current = BiliClient.prefs.v601aliveAutoKeep601
    BiliClient.prefs.v601aliveAutoKeep601 = !current
    AppToast.show(this, "Alive Auto Keep601: ${if (!current) "ON" else "OFF"}")
}

// v601: Alpha Auto Fade601
internal fun PlayerActivity.showV601AlphaAutoFade601Toggle() {
    val current = BiliClient.prefs.v601alphaAutoFade601
    BiliClient.prefs.v601alphaAutoFade601 = !current
    AppToast.show(this, "Alpha Auto Fade601: ${if (!current) "ON" else "OFF"}")
}

// v601: Ambient Auto Light601
internal fun PlayerActivity.showV601AmbientAutoLight601Toggle() {
    val current = BiliClient.prefs.v601ambientAutoLight601
    BiliClient.prefs.v601ambientAutoLight601 = !current
    AppToast.show(this, "Ambient Auto Light601: ${if (!current) "ON" else "OFF"}")
}

// v601: Amount Auto Limit601
internal fun PlayerActivity.showV601AmountAutoLimit601Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v601amountAutoLimit601).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit601",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v601amountAutoLimit601 = value
        AppToast.show(this, "Amount Auto Limit601: $value")
    }
}

// v601: Angle Auto Rotate601
internal fun PlayerActivity.showV601AngleAutoRotate601Toggle() {
    val current = BiliClient.prefs.v601angleAutoRotate601
    BiliClient.prefs.v601angleAutoRotate601 = !current
    AppToast.show(this, "Angle Auto Rotate601: ${if (!current) "ON" else "OFF"}")
}

// v601: Answer Auto Reply601
internal fun PlayerActivity.showV601AnswerAutoReply601Toggle() {
    val current = BiliClient.prefs.v601answerAutoReply601
    BiliClient.prefs.v601answerAutoReply601 = !current
    AppToast.show(this, "Answer Auto Reply601: ${if (!current) "ON" else "OFF"}")
}

// v601: API Auto Call601
internal fun PlayerActivity.showV601ApiAutoCall601Toggle() {
    val current = BiliClient.prefs.v601apiAutoCall601
    BiliClient.prefs.v601apiAutoCall601 = !current
    AppToast.show(this, "API Auto Call601: ${if (!current) "ON" else "OFF"}")
}

// v601: Archive Auto Save601
internal fun PlayerActivity.showV601ArchiveAutoSave601Toggle() {
    val current = BiliClient.prefs.v601archiveAutoSave601
    BiliClient.prefs.v601archiveAutoSave601 = !current
    AppToast.show(this, "Archive Auto Save601: ${if (!current) "ON" else "OFF"}")
}

// v601: Area Auto Detect601
internal fun PlayerActivity.showV601AreaAutoDetect601Toggle() {
    val current = BiliClient.prefs.v601areaAutoDetect601
    BiliClient.prefs.v601areaAutoDetect601 = !current
    AppToast.show(this, "Area Auto Detect601: ${if (!current) "ON" else "OFF"}")
}

// v601: Array Auto Sort601
internal fun PlayerActivity.showV601ArrayAutoSort601Toggle() {
    val current = BiliClient.prefs.v601arrayAutoSort601
    BiliClient.prefs.v601arrayAutoSort601 = !current
    AppToast.show(this, "Array Auto Sort601: ${if (!current) "ON" else "OFF"}")
}

// v602: Action Auto Repeat602
internal fun PlayerActivity.showV602ActionAutoRepeat602Toggle() {
    val current = BiliClient.prefs.v602actionAutoRepeat602
    BiliClient.prefs.v602actionAutoRepeat602 = !current
    AppToast.show(this, "Action Auto Repeat602: ${if (!current) "ON" else "OFF"}")
}

// v602: Adapter Auto Switch602
internal fun PlayerActivity.showV602AdapterAutoSwitch602Toggle() {
    val current = BiliClient.prefs.v602adapterAutoSwitch602
    BiliClient.prefs.v602adapterAutoSwitch602 = !current
    AppToast.show(this, "Adapter Auto Switch602: ${if (!current) "ON" else "OFF"}")
}

// v602: Agent Auto Connect602
internal fun PlayerActivity.showV602AgentAutoConnect602Toggle() {
    val current = BiliClient.prefs.v602agentAutoConnect602
    BiliClient.prefs.v602agentAutoConnect602 = !current
    AppToast.show(this, "Agent Auto Connect602: ${if (!current) "ON" else "OFF"}")
}

// v602: Alias Auto Resolve602
internal fun PlayerActivity.showV602AliasAutoResolve602Toggle() {
    val current = BiliClient.prefs.v602aliasAutoResolve602
    BiliClient.prefs.v602aliasAutoResolve602 = !current
    AppToast.show(this, "Alias Auto Resolve602: ${if (!current) "ON" else "OFF"}")
}

// v602: Align Auto Center602
internal fun PlayerActivity.showV602AlignAutoCenter602Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v602alignAutoCenter602).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center602",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v602alignAutoCenter602 = value
        AppToast.show(this, "Align Auto Center602: $value")
    }
}

// v602: Alive Auto Keep602
internal fun PlayerActivity.showV602AliveAutoKeep602Toggle() {
    val current = BiliClient.prefs.v602aliveAutoKeep602
    BiliClient.prefs.v602aliveAutoKeep602 = !current
    AppToast.show(this, "Alive Auto Keep602: ${if (!current) "ON" else "OFF"}")
}

// v602: Alpha Auto Fade602
internal fun PlayerActivity.showV602AlphaAutoFade602Toggle() {
    val current = BiliClient.prefs.v602alphaAutoFade602
    BiliClient.prefs.v602alphaAutoFade602 = !current
    AppToast.show(this, "Alpha Auto Fade602: ${if (!current) "ON" else "OFF"}")
}

// v602: Ambient Auto Light602
internal fun PlayerActivity.showV602AmbientAutoLight602Toggle() {
    val current = BiliClient.prefs.v602ambientAutoLight602
    BiliClient.prefs.v602ambientAutoLight602 = !current
    AppToast.show(this, "Ambient Auto Light602: ${if (!current) "ON" else "OFF"}")
}

// v602: Amount Auto Limit602
internal fun PlayerActivity.showV602AmountAutoLimit602Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v602amountAutoLimit602).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit602",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v602amountAutoLimit602 = value
        AppToast.show(this, "Amount Auto Limit602: $value")
    }
}

// v602: Angle Auto Rotate602
internal fun PlayerActivity.showV602AngleAutoRotate602Toggle() {
    val current = BiliClient.prefs.v602angleAutoRotate602
    BiliClient.prefs.v602angleAutoRotate602 = !current
    AppToast.show(this, "Angle Auto Rotate602: ${if (!current) "ON" else "OFF"}")
}

// v602: Answer Auto Reply602
internal fun PlayerActivity.showV602AnswerAutoReply602Toggle() {
    val current = BiliClient.prefs.v602answerAutoReply602
    BiliClient.prefs.v602answerAutoReply602 = !current
    AppToast.show(this, "Answer Auto Reply602: ${if (!current) "ON" else "OFF"}")
}

// v602: API Auto Call602
internal fun PlayerActivity.showV602ApiAutoCall602Toggle() {
    val current = BiliClient.prefs.v602apiAutoCall602
    BiliClient.prefs.v602apiAutoCall602 = !current
    AppToast.show(this, "API Auto Call602: ${if (!current) "ON" else "OFF"}")
}

// v602: Archive Auto Save602
internal fun PlayerActivity.showV602ArchiveAutoSave602Toggle() {
    val current = BiliClient.prefs.v602archiveAutoSave602
    BiliClient.prefs.v602archiveAutoSave602 = !current
    AppToast.show(this, "Archive Auto Save602: ${if (!current) "ON" else "OFF"}")
}

// v602: Area Auto Detect602
internal fun PlayerActivity.showV602AreaAutoDetect602Toggle() {
    val current = BiliClient.prefs.v602areaAutoDetect602
    BiliClient.prefs.v602areaAutoDetect602 = !current
    AppToast.show(this, "Area Auto Detect602: ${if (!current) "ON" else "OFF"}")
}

// v602: Array Auto Sort602
internal fun PlayerActivity.showV602ArrayAutoSort602Toggle() {
    val current = BiliClient.prefs.v602arrayAutoSort602
    BiliClient.prefs.v602arrayAutoSort602 = !current
    AppToast.show(this, "Array Auto Sort602: ${if (!current) "ON" else "OFF"}")
}

// v603: Action Auto Repeat603
internal fun PlayerActivity.showV603ActionAutoRepeat603Toggle() {
    val current = BiliClient.prefs.v603actionAutoRepeat603
    BiliClient.prefs.v603actionAutoRepeat603 = !current
    AppToast.show(this, "Action Auto Repeat603: ${if (!current) "ON" else "OFF"}")
}

// v603: Adapter Auto Switch603
internal fun PlayerActivity.showV603AdapterAutoSwitch603Toggle() {
    val current = BiliClient.prefs.v603adapterAutoSwitch603
    BiliClient.prefs.v603adapterAutoSwitch603 = !current
    AppToast.show(this, "Adapter Auto Switch603: ${if (!current) "ON" else "OFF"}")
}

// v603: Agent Auto Connect603
internal fun PlayerActivity.showV603AgentAutoConnect603Toggle() {
    val current = BiliClient.prefs.v603agentAutoConnect603
    BiliClient.prefs.v603agentAutoConnect603 = !current
    AppToast.show(this, "Agent Auto Connect603: ${if (!current) "ON" else "OFF"}")
}

// v603: Alias Auto Resolve603
internal fun PlayerActivity.showV603AliasAutoResolve603Toggle() {
    val current = BiliClient.prefs.v603aliasAutoResolve603
    BiliClient.prefs.v603aliasAutoResolve603 = !current
    AppToast.show(this, "Alias Auto Resolve603: ${if (!current) "ON" else "OFF"}")
}

// v603: Align Auto Center603
internal fun PlayerActivity.showV603AlignAutoCenter603Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v603alignAutoCenter603).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center603",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v603alignAutoCenter603 = value
        AppToast.show(this, "Align Auto Center603: $value")
    }
}

// v603: Alive Auto Keep603
internal fun PlayerActivity.showV603AliveAutoKeep603Toggle() {
    val current = BiliClient.prefs.v603aliveAutoKeep603
    BiliClient.prefs.v603aliveAutoKeep603 = !current
    AppToast.show(this, "Alive Auto Keep603: ${if (!current) "ON" else "OFF"}")
}

// v603: Alpha Auto Fade603
internal fun PlayerActivity.showV603AlphaAutoFade603Toggle() {
    val current = BiliClient.prefs.v603alphaAutoFade603
    BiliClient.prefs.v603alphaAutoFade603 = !current
    AppToast.show(this, "Alpha Auto Fade603: ${if (!current) "ON" else "OFF"}")
}

// v603: Ambient Auto Light603
internal fun PlayerActivity.showV603AmbientAutoLight603Toggle() {
    val current = BiliClient.prefs.v603ambientAutoLight603
    BiliClient.prefs.v603ambientAutoLight603 = !current
    AppToast.show(this, "Ambient Auto Light603: ${if (!current) "ON" else "OFF"}")
}

// v603: Amount Auto Limit603
internal fun PlayerActivity.showV603AmountAutoLimit603Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v603amountAutoLimit603).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit603",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v603amountAutoLimit603 = value
        AppToast.show(this, "Amount Auto Limit603: $value")
    }
}

// v603: Angle Auto Rotate603
internal fun PlayerActivity.showV603AngleAutoRotate603Toggle() {
    val current = BiliClient.prefs.v603angleAutoRotate603
    BiliClient.prefs.v603angleAutoRotate603 = !current
    AppToast.show(this, "Angle Auto Rotate603: ${if (!current) "ON" else "OFF"}")
}

// v603: Answer Auto Reply603
internal fun PlayerActivity.showV603AnswerAutoReply603Toggle() {
    val current = BiliClient.prefs.v603answerAutoReply603
    BiliClient.prefs.v603answerAutoReply603 = !current
    AppToast.show(this, "Answer Auto Reply603: ${if (!current) "ON" else "OFF"}")
}

// v603: API Auto Call603
internal fun PlayerActivity.showV603ApiAutoCall603Toggle() {
    val current = BiliClient.prefs.v603apiAutoCall603
    BiliClient.prefs.v603apiAutoCall603 = !current
    AppToast.show(this, "API Auto Call603: ${if (!current) "ON" else "OFF"}")
}

// v603: Archive Auto Save603
internal fun PlayerActivity.showV603ArchiveAutoSave603Toggle() {
    val current = BiliClient.prefs.v603archiveAutoSave603
    BiliClient.prefs.v603archiveAutoSave603 = !current
    AppToast.show(this, "Archive Auto Save603: ${if (!current) "ON" else "OFF"}")
}

// v603: Area Auto Detect603
internal fun PlayerActivity.showV603AreaAutoDetect603Toggle() {
    val current = BiliClient.prefs.v603areaAutoDetect603
    BiliClient.prefs.v603areaAutoDetect603 = !current
    AppToast.show(this, "Area Auto Detect603: ${if (!current) "ON" else "OFF"}")
}

// v603: Array Auto Sort603
internal fun PlayerActivity.showV603ArrayAutoSort603Toggle() {
    val current = BiliClient.prefs.v603arrayAutoSort603
    BiliClient.prefs.v603arrayAutoSort603 = !current
    AppToast.show(this, "Array Auto Sort603: ${if (!current) "ON" else "OFF"}")
}

// v604: Action Auto Repeat604
internal fun PlayerActivity.showV604ActionAutoRepeat604Toggle() {
    val current = BiliClient.prefs.v604actionAutoRepeat604
    BiliClient.prefs.v604actionAutoRepeat604 = !current
    AppToast.show(this, "Action Auto Repeat604: ${if (!current) "ON" else "OFF"}")
}

// v604: Adapter Auto Switch604
internal fun PlayerActivity.showV604AdapterAutoSwitch604Toggle() {
    val current = BiliClient.prefs.v604adapterAutoSwitch604
    BiliClient.prefs.v604adapterAutoSwitch604 = !current
    AppToast.show(this, "Adapter Auto Switch604: ${if (!current) "ON" else "OFF"}")
}

// v604: Agent Auto Connect604
internal fun PlayerActivity.showV604AgentAutoConnect604Toggle() {
    val current = BiliClient.prefs.v604agentAutoConnect604
    BiliClient.prefs.v604agentAutoConnect604 = !current
    AppToast.show(this, "Agent Auto Connect604: ${if (!current) "ON" else "OFF"}")
}

// v604: Alias Auto Resolve604
internal fun PlayerActivity.showV604AliasAutoResolve604Toggle() {
    val current = BiliClient.prefs.v604aliasAutoResolve604
    BiliClient.prefs.v604aliasAutoResolve604 = !current
    AppToast.show(this, "Alias Auto Resolve604: ${if (!current) "ON" else "OFF"}")
}

// v604: Align Auto Center604
internal fun PlayerActivity.showV604AlignAutoCenter604Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v604alignAutoCenter604).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center604",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v604alignAutoCenter604 = value
        AppToast.show(this, "Align Auto Center604: $value")
    }
}

// v604: Alive Auto Keep604
internal fun PlayerActivity.showV604AliveAutoKeep604Toggle() {
    val current = BiliClient.prefs.v604aliveAutoKeep604
    BiliClient.prefs.v604aliveAutoKeep604 = !current
    AppToast.show(this, "Alive Auto Keep604: ${if (!current) "ON" else "OFF"}")
}

// v604: Alpha Auto Fade604
internal fun PlayerActivity.showV604AlphaAutoFade604Toggle() {
    val current = BiliClient.prefs.v604alphaAutoFade604
    BiliClient.prefs.v604alphaAutoFade604 = !current
    AppToast.show(this, "Alpha Auto Fade604: ${if (!current) "ON" else "OFF"}")
}

// v604: Ambient Auto Light604
internal fun PlayerActivity.showV604AmbientAutoLight604Toggle() {
    val current = BiliClient.prefs.v604ambientAutoLight604
    BiliClient.prefs.v604ambientAutoLight604 = !current
    AppToast.show(this, "Ambient Auto Light604: ${if (!current) "ON" else "OFF"}")
}

// v604: Amount Auto Limit604
internal fun PlayerActivity.showV604AmountAutoLimit604Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v604amountAutoLimit604).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit604",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v604amountAutoLimit604 = value
        AppToast.show(this, "Amount Auto Limit604: $value")
    }
}

// v604: Angle Auto Rotate604
internal fun PlayerActivity.showV604AngleAutoRotate604Toggle() {
    val current = BiliClient.prefs.v604angleAutoRotate604
    BiliClient.prefs.v604angleAutoRotate604 = !current
    AppToast.show(this, "Angle Auto Rotate604: ${if (!current) "ON" else "OFF"}")
}

// v604: Answer Auto Reply604
internal fun PlayerActivity.showV604AnswerAutoReply604Toggle() {
    val current = BiliClient.prefs.v604answerAutoReply604
    BiliClient.prefs.v604answerAutoReply604 = !current
    AppToast.show(this, "Answer Auto Reply604: ${if (!current) "ON" else "OFF"}")
}

// v604: API Auto Call604
internal fun PlayerActivity.showV604ApiAutoCall604Toggle() {
    val current = BiliClient.prefs.v604apiAutoCall604
    BiliClient.prefs.v604apiAutoCall604 = !current
    AppToast.show(this, "API Auto Call604: ${if (!current) "ON" else "OFF"}")
}

// v604: Archive Auto Save604
internal fun PlayerActivity.showV604ArchiveAutoSave604Toggle() {
    val current = BiliClient.prefs.v604archiveAutoSave604
    BiliClient.prefs.v604archiveAutoSave604 = !current
    AppToast.show(this, "Archive Auto Save604: ${if (!current) "ON" else "OFF"}")
}

// v604: Area Auto Detect604
internal fun PlayerActivity.showV604AreaAutoDetect604Toggle() {
    val current = BiliClient.prefs.v604areaAutoDetect604
    BiliClient.prefs.v604areaAutoDetect604 = !current
    AppToast.show(this, "Area Auto Detect604: ${if (!current) "ON" else "OFF"}")
}

// v604: Array Auto Sort604
internal fun PlayerActivity.showV604ArrayAutoSort604Toggle() {
    val current = BiliClient.prefs.v604arrayAutoSort604
    BiliClient.prefs.v604arrayAutoSort604 = !current
    AppToast.show(this, "Array Auto Sort604: ${if (!current) "ON" else "OFF"}")
}

// v605: Action Auto Repeat605
internal fun PlayerActivity.showV605ActionAutoRepeat605Toggle() {
    val current = BiliClient.prefs.v605actionAutoRepeat605
    BiliClient.prefs.v605actionAutoRepeat605 = !current
    AppToast.show(this, "Action Auto Repeat605: ${if (!current) "ON" else "OFF"}")
}

// v605: Adapter Auto Switch605
internal fun PlayerActivity.showV605AdapterAutoSwitch605Toggle() {
    val current = BiliClient.prefs.v605adapterAutoSwitch605
    BiliClient.prefs.v605adapterAutoSwitch605 = !current
    AppToast.show(this, "Adapter Auto Switch605: ${if (!current) "ON" else "OFF"}")
}

// v605: Agent Auto Connect605
internal fun PlayerActivity.showV605AgentAutoConnect605Toggle() {
    val current = BiliClient.prefs.v605agentAutoConnect605
    BiliClient.prefs.v605agentAutoConnect605 = !current
    AppToast.show(this, "Agent Auto Connect605: ${if (!current) "ON" else "OFF"}")
}

// v605: Alias Auto Resolve605
internal fun PlayerActivity.showV605AliasAutoResolve605Toggle() {
    val current = BiliClient.prefs.v605aliasAutoResolve605
    BiliClient.prefs.v605aliasAutoResolve605 = !current
    AppToast.show(this, "Alias Auto Resolve605: ${if (!current) "ON" else "OFF"}")
}

// v605: Align Auto Center605
internal fun PlayerActivity.showV605AlignAutoCenter605Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v605alignAutoCenter605).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center605",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v605alignAutoCenter605 = value
        AppToast.show(this, "Align Auto Center605: $value")
    }
}

// v605: Alive Auto Keep605
internal fun PlayerActivity.showV605AliveAutoKeep605Toggle() {
    val current = BiliClient.prefs.v605aliveAutoKeep605
    BiliClient.prefs.v605aliveAutoKeep605 = !current
    AppToast.show(this, "Alive Auto Keep605: ${if (!current) "ON" else "OFF"}")
}

// v605: Alpha Auto Fade605
internal fun PlayerActivity.showV605AlphaAutoFade605Toggle() {
    val current = BiliClient.prefs.v605alphaAutoFade605
    BiliClient.prefs.v605alphaAutoFade605 = !current
    AppToast.show(this, "Alpha Auto Fade605: ${if (!current) "ON" else "OFF"}")
}

// v605: Ambient Auto Light605
internal fun PlayerActivity.showV605AmbientAutoLight605Toggle() {
    val current = BiliClient.prefs.v605ambientAutoLight605
    BiliClient.prefs.v605ambientAutoLight605 = !current
    AppToast.show(this, "Ambient Auto Light605: ${if (!current) "ON" else "OFF"}")
}

// v605: Amount Auto Limit605
internal fun PlayerActivity.showV605AmountAutoLimit605Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v605amountAutoLimit605).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit605",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v605amountAutoLimit605 = value
        AppToast.show(this, "Amount Auto Limit605: $value")
    }
}

// v605: Angle Auto Rotate605
internal fun PlayerActivity.showV605AngleAutoRotate605Toggle() {
    val current = BiliClient.prefs.v605angleAutoRotate605
    BiliClient.prefs.v605angleAutoRotate605 = !current
    AppToast.show(this, "Angle Auto Rotate605: ${if (!current) "ON" else "OFF"}")
}

// v605: Answer Auto Reply605
internal fun PlayerActivity.showV605AnswerAutoReply605Toggle() {
    val current = BiliClient.prefs.v605answerAutoReply605
    BiliClient.prefs.v605answerAutoReply605 = !current
    AppToast.show(this, "Answer Auto Reply605: ${if (!current) "ON" else "OFF"}")
}

// v605: API Auto Call605
internal fun PlayerActivity.showV605ApiAutoCall605Toggle() {
    val current = BiliClient.prefs.v605apiAutoCall605
    BiliClient.prefs.v605apiAutoCall605 = !current
    AppToast.show(this, "API Auto Call605: ${if (!current) "ON" else "OFF"}")
}

// v605: Archive Auto Save605
internal fun PlayerActivity.showV605ArchiveAutoSave605Toggle() {
    val current = BiliClient.prefs.v605archiveAutoSave605
    BiliClient.prefs.v605archiveAutoSave605 = !current
    AppToast.show(this, "Archive Auto Save605: ${if (!current) "ON" else "OFF"}")
}

// v605: Area Auto Detect605
internal fun PlayerActivity.showV605AreaAutoDetect605Toggle() {
    val current = BiliClient.prefs.v605areaAutoDetect605
    BiliClient.prefs.v605areaAutoDetect605 = !current
    AppToast.show(this, "Area Auto Detect605: ${if (!current) "ON" else "OFF"}")
}

// v605: Array Auto Sort605
internal fun PlayerActivity.showV605ArrayAutoSort605Toggle() {
    val current = BiliClient.prefs.v605arrayAutoSort605
    BiliClient.prefs.v605arrayAutoSort605 = !current
    AppToast.show(this, "Array Auto Sort605: ${if (!current) "ON" else "OFF"}")
}

// v606: Action Auto Repeat606
internal fun PlayerActivity.showV606ActionAutoRepeat606Toggle() {
    val current = BiliClient.prefs.v606actionAutoRepeat606
    BiliClient.prefs.v606actionAutoRepeat606 = !current
    AppToast.show(this, "Action Auto Repeat606: ${if (!current) "ON" else "OFF"}")
}

// v606: Adapter Auto Switch606
internal fun PlayerActivity.showV606AdapterAutoSwitch606Toggle() {
    val current = BiliClient.prefs.v606adapterAutoSwitch606
    BiliClient.prefs.v606adapterAutoSwitch606 = !current
    AppToast.show(this, "Adapter Auto Switch606: ${if (!current) "ON" else "OFF"}")
}

// v606: Agent Auto Connect606
internal fun PlayerActivity.showV606AgentAutoConnect606Toggle() {
    val current = BiliClient.prefs.v606agentAutoConnect606
    BiliClient.prefs.v606agentAutoConnect606 = !current
    AppToast.show(this, "Agent Auto Connect606: ${if (!current) "ON" else "OFF"}")
}

// v606: Alias Auto Resolve606
internal fun PlayerActivity.showV606AliasAutoResolve606Toggle() {
    val current = BiliClient.prefs.v606aliasAutoResolve606
    BiliClient.prefs.v606aliasAutoResolve606 = !current
    AppToast.show(this, "Alias Auto Resolve606: ${if (!current) "ON" else "OFF"}")
}

// v606: Align Auto Center606
internal fun PlayerActivity.showV606AlignAutoCenter606Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v606alignAutoCenter606).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center606",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v606alignAutoCenter606 = value
        AppToast.show(this, "Align Auto Center606: $value")
    }
}

// v606: Alive Auto Keep606
internal fun PlayerActivity.showV606AliveAutoKeep606Toggle() {
    val current = BiliClient.prefs.v606aliveAutoKeep606
    BiliClient.prefs.v606aliveAutoKeep606 = !current
    AppToast.show(this, "Alive Auto Keep606: ${if (!current) "ON" else "OFF"}")
}

// v606: Alpha Auto Fade606
internal fun PlayerActivity.showV606AlphaAutoFade606Toggle() {
    val current = BiliClient.prefs.v606alphaAutoFade606
    BiliClient.prefs.v606alphaAutoFade606 = !current
    AppToast.show(this, "Alpha Auto Fade606: ${if (!current) "ON" else "OFF"}")
}

// v606: Ambient Auto Light606
internal fun PlayerActivity.showV606AmbientAutoLight606Toggle() {
    val current = BiliClient.prefs.v606ambientAutoLight606
    BiliClient.prefs.v606ambientAutoLight606 = !current
    AppToast.show(this, "Ambient Auto Light606: ${if (!current) "ON" else "OFF"}")
}

// v606: Amount Auto Limit606
internal fun PlayerActivity.showV606AmountAutoLimit606Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v606amountAutoLimit606).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit606",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v606amountAutoLimit606 = value
        AppToast.show(this, "Amount Auto Limit606: $value")
    }
}

// v606: Angle Auto Rotate606
internal fun PlayerActivity.showV606AngleAutoRotate606Toggle() {
    val current = BiliClient.prefs.v606angleAutoRotate606
    BiliClient.prefs.v606angleAutoRotate606 = !current
    AppToast.show(this, "Angle Auto Rotate606: ${if (!current) "ON" else "OFF"}")
}

// v606: Answer Auto Reply606
internal fun PlayerActivity.showV606AnswerAutoReply606Toggle() {
    val current = BiliClient.prefs.v606answerAutoReply606
    BiliClient.prefs.v606answerAutoReply606 = !current
    AppToast.show(this, "Answer Auto Reply606: ${if (!current) "ON" else "OFF"}")
}

// v606: API Auto Call606
internal fun PlayerActivity.showV606ApiAutoCall606Toggle() {
    val current = BiliClient.prefs.v606apiAutoCall606
    BiliClient.prefs.v606apiAutoCall606 = !current
    AppToast.show(this, "API Auto Call606: ${if (!current) "ON" else "OFF"}")
}

// v606: Archive Auto Save606
internal fun PlayerActivity.showV606ArchiveAutoSave606Toggle() {
    val current = BiliClient.prefs.v606archiveAutoSave606
    BiliClient.prefs.v606archiveAutoSave606 = !current
    AppToast.show(this, "Archive Auto Save606: ${if (!current) "ON" else "OFF"}")
}

// v606: Area Auto Detect606
internal fun PlayerActivity.showV606AreaAutoDetect606Toggle() {
    val current = BiliClient.prefs.v606areaAutoDetect606
    BiliClient.prefs.v606areaAutoDetect606 = !current
    AppToast.show(this, "Area Auto Detect606: ${if (!current) "ON" else "OFF"}")
}

// v606: Array Auto Sort606
internal fun PlayerActivity.showV606ArrayAutoSort606Toggle() {
    val current = BiliClient.prefs.v606arrayAutoSort606
    BiliClient.prefs.v606arrayAutoSort606 = !current
    AppToast.show(this, "Array Auto Sort606: ${if (!current) "ON" else "OFF"}")
}

// v607: Action Auto Repeat607
internal fun PlayerActivity.showV607ActionAutoRepeat607Toggle() {
    val current = BiliClient.prefs.v607actionAutoRepeat607
    BiliClient.prefs.v607actionAutoRepeat607 = !current
    AppToast.show(this, "Action Auto Repeat607: ${if (!current) "ON" else "OFF"}")
}

// v607: Adapter Auto Switch607
internal fun PlayerActivity.showV607AdapterAutoSwitch607Toggle() {
    val current = BiliClient.prefs.v607adapterAutoSwitch607
    BiliClient.prefs.v607adapterAutoSwitch607 = !current
    AppToast.show(this, "Adapter Auto Switch607: ${if (!current) "ON" else "OFF"}")
}

// v607: Agent Auto Connect607
internal fun PlayerActivity.showV607AgentAutoConnect607Toggle() {
    val current = BiliClient.prefs.v607agentAutoConnect607
    BiliClient.prefs.v607agentAutoConnect607 = !current
    AppToast.show(this, "Agent Auto Connect607: ${if (!current) "ON" else "OFF"}")
}

// v607: Alias Auto Resolve607
internal fun PlayerActivity.showV607AliasAutoResolve607Toggle() {
    val current = BiliClient.prefs.v607aliasAutoResolve607
    BiliClient.prefs.v607aliasAutoResolve607 = !current
    AppToast.show(this, "Alias Auto Resolve607: ${if (!current) "ON" else "OFF"}")
}

// v607: Align Auto Center607
internal fun PlayerActivity.showV607AlignAutoCenter607Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v607alignAutoCenter607).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center607",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v607alignAutoCenter607 = value
        AppToast.show(this, "Align Auto Center607: $value")
    }
}

// v607: Alive Auto Keep607
internal fun PlayerActivity.showV607AliveAutoKeep607Toggle() {
    val current = BiliClient.prefs.v607aliveAutoKeep607
    BiliClient.prefs.v607aliveAutoKeep607 = !current
    AppToast.show(this, "Alive Auto Keep607: ${if (!current) "ON" else "OFF"}")
}

// v607: Alpha Auto Fade607
internal fun PlayerActivity.showV607AlphaAutoFade607Toggle() {
    val current = BiliClient.prefs.v607alphaAutoFade607
    BiliClient.prefs.v607alphaAutoFade607 = !current
    AppToast.show(this, "Alpha Auto Fade607: ${if (!current) "ON" else "OFF"}")
}

// v607: Ambient Auto Light607
internal fun PlayerActivity.showV607AmbientAutoLight607Toggle() {
    val current = BiliClient.prefs.v607ambientAutoLight607
    BiliClient.prefs.v607ambientAutoLight607 = !current
    AppToast.show(this, "Ambient Auto Light607: ${if (!current) "ON" else "OFF"}")
}

// v607: Amount Auto Limit607
internal fun PlayerActivity.showV607AmountAutoLimit607Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v607amountAutoLimit607).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit607",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v607amountAutoLimit607 = value
        AppToast.show(this, "Amount Auto Limit607: $value")
    }
}

// v607: Angle Auto Rotate607
internal fun PlayerActivity.showV607AngleAutoRotate607Toggle() {
    val current = BiliClient.prefs.v607angleAutoRotate607
    BiliClient.prefs.v607angleAutoRotate607 = !current
    AppToast.show(this, "Angle Auto Rotate607: ${if (!current) "ON" else "OFF"}")
}

// v607: Answer Auto Reply607
internal fun PlayerActivity.showV607AnswerAutoReply607Toggle() {
    val current = BiliClient.prefs.v607answerAutoReply607
    BiliClient.prefs.v607answerAutoReply607 = !current
    AppToast.show(this, "Answer Auto Reply607: ${if (!current) "ON" else "OFF"}")
}

// v607: API Auto Call607
internal fun PlayerActivity.showV607ApiAutoCall607Toggle() {
    val current = BiliClient.prefs.v607apiAutoCall607
    BiliClient.prefs.v607apiAutoCall607 = !current
    AppToast.show(this, "API Auto Call607: ${if (!current) "ON" else "OFF"}")
}

// v607: Archive Auto Save607
internal fun PlayerActivity.showV607ArchiveAutoSave607Toggle() {
    val current = BiliClient.prefs.v607archiveAutoSave607
    BiliClient.prefs.v607archiveAutoSave607 = !current
    AppToast.show(this, "Archive Auto Save607: ${if (!current) "ON" else "OFF"}")
}

// v607: Area Auto Detect607
internal fun PlayerActivity.showV607AreaAutoDetect607Toggle() {
    val current = BiliClient.prefs.v607areaAutoDetect607
    BiliClient.prefs.v607areaAutoDetect607 = !current
    AppToast.show(this, "Area Auto Detect607: ${if (!current) "ON" else "OFF"}")
}

// v607: Array Auto Sort607
internal fun PlayerActivity.showV607ArrayAutoSort607Toggle() {
    val current = BiliClient.prefs.v607arrayAutoSort607
    BiliClient.prefs.v607arrayAutoSort607 = !current
    AppToast.show(this, "Array Auto Sort607: ${if (!current) "ON" else "OFF"}")
}

// v608: Action Auto Repeat608
internal fun PlayerActivity.showV608ActionAutoRepeat608Toggle() {
    val current = BiliClient.prefs.v608actionAutoRepeat608
    BiliClient.prefs.v608actionAutoRepeat608 = !current
    AppToast.show(this, "Action Auto Repeat608: ${if (!current) "ON" else "OFF"}")
}

// v608: Adapter Auto Switch608
internal fun PlayerActivity.showV608AdapterAutoSwitch608Toggle() {
    val current = BiliClient.prefs.v608adapterAutoSwitch608
    BiliClient.prefs.v608adapterAutoSwitch608 = !current
    AppToast.show(this, "Adapter Auto Switch608: ${if (!current) "ON" else "OFF"}")
}

// v608: Agent Auto Connect608
internal fun PlayerActivity.showV608AgentAutoConnect608Toggle() {
    val current = BiliClient.prefs.v608agentAutoConnect608
    BiliClient.prefs.v608agentAutoConnect608 = !current
    AppToast.show(this, "Agent Auto Connect608: ${if (!current) "ON" else "OFF"}")
}

// v608: Alias Auto Resolve608
internal fun PlayerActivity.showV608AliasAutoResolve608Toggle() {
    val current = BiliClient.prefs.v608aliasAutoResolve608
    BiliClient.prefs.v608aliasAutoResolve608 = !current
    AppToast.show(this, "Alias Auto Resolve608: ${if (!current) "ON" else "OFF"}")
}

// v608: Align Auto Center608
internal fun PlayerActivity.showV608AlignAutoCenter608Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v608alignAutoCenter608).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center608",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v608alignAutoCenter608 = value
        AppToast.show(this, "Align Auto Center608: $value")
    }
}

// v608: Alive Auto Keep608
internal fun PlayerActivity.showV608AliveAutoKeep608Toggle() {
    val current = BiliClient.prefs.v608aliveAutoKeep608
    BiliClient.prefs.v608aliveAutoKeep608 = !current
    AppToast.show(this, "Alive Auto Keep608: ${if (!current) "ON" else "OFF"}")
}

// v608: Alpha Auto Fade608
internal fun PlayerActivity.showV608AlphaAutoFade608Toggle() {
    val current = BiliClient.prefs.v608alphaAutoFade608
    BiliClient.prefs.v608alphaAutoFade608 = !current
    AppToast.show(this, "Alpha Auto Fade608: ${if (!current) "ON" else "OFF"}")
}

// v608: Ambient Auto Light608
internal fun PlayerActivity.showV608AmbientAutoLight608Toggle() {
    val current = BiliClient.prefs.v608ambientAutoLight608
    BiliClient.prefs.v608ambientAutoLight608 = !current
    AppToast.show(this, "Ambient Auto Light608: ${if (!current) "ON" else "OFF"}")
}

// v608: Amount Auto Limit608
internal fun PlayerActivity.showV608AmountAutoLimit608Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v608amountAutoLimit608).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit608",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v608amountAutoLimit608 = value
        AppToast.show(this, "Amount Auto Limit608: $value")
    }
}

// v608: Angle Auto Rotate608
internal fun PlayerActivity.showV608AngleAutoRotate608Toggle() {
    val current = BiliClient.prefs.v608angleAutoRotate608
    BiliClient.prefs.v608angleAutoRotate608 = !current
    AppToast.show(this, "Angle Auto Rotate608: ${if (!current) "ON" else "OFF"}")
}

// v608: Answer Auto Reply608
internal fun PlayerActivity.showV608AnswerAutoReply608Toggle() {
    val current = BiliClient.prefs.v608answerAutoReply608
    BiliClient.prefs.v608answerAutoReply608 = !current
    AppToast.show(this, "Answer Auto Reply608: ${if (!current) "ON" else "OFF"}")
}

// v608: API Auto Call608
internal fun PlayerActivity.showV608ApiAutoCall608Toggle() {
    val current = BiliClient.prefs.v608apiAutoCall608
    BiliClient.prefs.v608apiAutoCall608 = !current
    AppToast.show(this, "API Auto Call608: ${if (!current) "ON" else "OFF"}")
}

// v608: Archive Auto Save608
internal fun PlayerActivity.showV608ArchiveAutoSave608Toggle() {
    val current = BiliClient.prefs.v608archiveAutoSave608
    BiliClient.prefs.v608archiveAutoSave608 = !current
    AppToast.show(this, "Archive Auto Save608: ${if (!current) "ON" else "OFF"}")
}

// v608: Area Auto Detect608
internal fun PlayerActivity.showV608AreaAutoDetect608Toggle() {
    val current = BiliClient.prefs.v608areaAutoDetect608
    BiliClient.prefs.v608areaAutoDetect608 = !current
    AppToast.show(this, "Area Auto Detect608: ${if (!current) "ON" else "OFF"}")
}

// v608: Array Auto Sort608
internal fun PlayerActivity.showV608ArrayAutoSort608Toggle() {
    val current = BiliClient.prefs.v608arrayAutoSort608
    BiliClient.prefs.v608arrayAutoSort608 = !current
    AppToast.show(this, "Array Auto Sort608: ${if (!current) "ON" else "OFF"}")
}

// v609: Action Auto Repeat609
internal fun PlayerActivity.showV609ActionAutoRepeat609Toggle() {
    val current = BiliClient.prefs.v609actionAutoRepeat609
    BiliClient.prefs.v609actionAutoRepeat609 = !current
    AppToast.show(this, "Action Auto Repeat609: ${if (!current) "ON" else "OFF"}")
}

// v609: Adapter Auto Switch609
internal fun PlayerActivity.showV609AdapterAutoSwitch609Toggle() {
    val current = BiliClient.prefs.v609adapterAutoSwitch609
    BiliClient.prefs.v609adapterAutoSwitch609 = !current
    AppToast.show(this, "Adapter Auto Switch609: ${if (!current) "ON" else "OFF"}")
}

// v609: Agent Auto Connect609
internal fun PlayerActivity.showV609AgentAutoConnect609Toggle() {
    val current = BiliClient.prefs.v609agentAutoConnect609
    BiliClient.prefs.v609agentAutoConnect609 = !current
    AppToast.show(this, "Agent Auto Connect609: ${if (!current) "ON" else "OFF"}")
}

// v609: Alias Auto Resolve609
internal fun PlayerActivity.showV609AliasAutoResolve609Toggle() {
    val current = BiliClient.prefs.v609aliasAutoResolve609
    BiliClient.prefs.v609aliasAutoResolve609 = !current
    AppToast.show(this, "Alias Auto Resolve609: ${if (!current) "ON" else "OFF"}")
}

// v609: Align Auto Center609
internal fun PlayerActivity.showV609AlignAutoCenter609Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v609alignAutoCenter609).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center609",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v609alignAutoCenter609 = value
        AppToast.show(this, "Align Auto Center609: $value")
    }
}

// v609: Alive Auto Keep609
internal fun PlayerActivity.showV609AliveAutoKeep609Toggle() {
    val current = BiliClient.prefs.v609aliveAutoKeep609
    BiliClient.prefs.v609aliveAutoKeep609 = !current
    AppToast.show(this, "Alive Auto Keep609: ${if (!current) "ON" else "OFF"}")
}

// v609: Alpha Auto Fade609
internal fun PlayerActivity.showV609AlphaAutoFade609Toggle() {
    val current = BiliClient.prefs.v609alphaAutoFade609
    BiliClient.prefs.v609alphaAutoFade609 = !current
    AppToast.show(this, "Alpha Auto Fade609: ${if (!current) "ON" else "OFF"}")
}

// v609: Ambient Auto Light609
internal fun PlayerActivity.showV609AmbientAutoLight609Toggle() {
    val current = BiliClient.prefs.v609ambientAutoLight609
    BiliClient.prefs.v609ambientAutoLight609 = !current
    AppToast.show(this, "Ambient Auto Light609: ${if (!current) "ON" else "OFF"}")
}

// v609: Amount Auto Limit609
internal fun PlayerActivity.showV609AmountAutoLimit609Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v609amountAutoLimit609).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit609",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v609amountAutoLimit609 = value
        AppToast.show(this, "Amount Auto Limit609: $value")
    }
}

// v609: Angle Auto Rotate609
internal fun PlayerActivity.showV609AngleAutoRotate609Toggle() {
    val current = BiliClient.prefs.v609angleAutoRotate609
    BiliClient.prefs.v609angleAutoRotate609 = !current
    AppToast.show(this, "Angle Auto Rotate609: ${if (!current) "ON" else "OFF"}")
}

// v609: Answer Auto Reply609
internal fun PlayerActivity.showV609AnswerAutoReply609Toggle() {
    val current = BiliClient.prefs.v609answerAutoReply609
    BiliClient.prefs.v609answerAutoReply609 = !current
    AppToast.show(this, "Answer Auto Reply609: ${if (!current) "ON" else "OFF"}")
}

// v609: API Auto Call609
internal fun PlayerActivity.showV609ApiAutoCall609Toggle() {
    val current = BiliClient.prefs.v609apiAutoCall609
    BiliClient.prefs.v609apiAutoCall609 = !current
    AppToast.show(this, "API Auto Call609: ${if (!current) "ON" else "OFF"}")
}

// v609: Archive Auto Save609
internal fun PlayerActivity.showV609ArchiveAutoSave609Toggle() {
    val current = BiliClient.prefs.v609archiveAutoSave609
    BiliClient.prefs.v609archiveAutoSave609 = !current
    AppToast.show(this, "Archive Auto Save609: ${if (!current) "ON" else "OFF"}")
}

