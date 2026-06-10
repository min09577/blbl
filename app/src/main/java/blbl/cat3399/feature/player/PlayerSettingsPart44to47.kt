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

// v609: Area Auto Detect609
internal fun PlayerActivity.showV609AreaAutoDetect609Toggle() {
    val current = BiliClient.prefs.v609areaAutoDetect609
    BiliClient.prefs.v609areaAutoDetect609 = !current
    AppToast.show(this, "Area Auto Detect609: ${if (!current) "ON" else "OFF"}")
}

// v609: Array Auto Sort609
internal fun PlayerActivity.showV609ArrayAutoSort609Toggle() {
    val current = BiliClient.prefs.v609arrayAutoSort609
    BiliClient.prefs.v609arrayAutoSort609 = !current
    AppToast.show(this, "Array Auto Sort609: ${if (!current) "ON" else "OFF"}")
}

// v610: Action Auto Repeat610
internal fun PlayerActivity.showV610ActionAutoRepeat610Toggle() {
    val current = BiliClient.prefs.v610actionAutoRepeat610
    BiliClient.prefs.v610actionAutoRepeat610 = !current
    AppToast.show(this, "Action Auto Repeat610: ${if (!current) "ON" else "OFF"}")
}

// v610: Adapter Auto Switch610
internal fun PlayerActivity.showV610AdapterAutoSwitch610Toggle() {
    val current = BiliClient.prefs.v610adapterAutoSwitch610
    BiliClient.prefs.v610adapterAutoSwitch610 = !current
    AppToast.show(this, "Adapter Auto Switch610: ${if (!current) "ON" else "OFF"}")
}

// v610: Agent Auto Connect610
internal fun PlayerActivity.showV610AgentAutoConnect610Toggle() {
    val current = BiliClient.prefs.v610agentAutoConnect610
    BiliClient.prefs.v610agentAutoConnect610 = !current
    AppToast.show(this, "Agent Auto Connect610: ${if (!current) "ON" else "OFF"}")
}

// v610: Alias Auto Resolve610
internal fun PlayerActivity.showV610AliasAutoResolve610Toggle() {
    val current = BiliClient.prefs.v610aliasAutoResolve610
    BiliClient.prefs.v610aliasAutoResolve610 = !current
    AppToast.show(this, "Alias Auto Resolve610: ${if (!current) "ON" else "OFF"}")
}

// v610: Align Auto Center610
internal fun PlayerActivity.showV610AlignAutoCenter610Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v610alignAutoCenter610).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center610",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v610alignAutoCenter610 = value
        AppToast.show(this, "Align Auto Center610: $value")
    }
}

// v610: Alive Auto Keep610
internal fun PlayerActivity.showV610AliveAutoKeep610Toggle() {
    val current = BiliClient.prefs.v610aliveAutoKeep610
    BiliClient.prefs.v610aliveAutoKeep610 = !current
    AppToast.show(this, "Alive Auto Keep610: ${if (!current) "ON" else "OFF"}")
}

// v610: Alpha Auto Fade610
internal fun PlayerActivity.showV610AlphaAutoFade610Toggle() {
    val current = BiliClient.prefs.v610alphaAutoFade610
    BiliClient.prefs.v610alphaAutoFade610 = !current
    AppToast.show(this, "Alpha Auto Fade610: ${if (!current) "ON" else "OFF"}")
}

// v610: Ambient Auto Light610
internal fun PlayerActivity.showV610AmbientAutoLight610Toggle() {
    val current = BiliClient.prefs.v610ambientAutoLight610
    BiliClient.prefs.v610ambientAutoLight610 = !current
    AppToast.show(this, "Ambient Auto Light610: ${if (!current) "ON" else "OFF"}")
}

// v610: Amount Auto Limit610
internal fun PlayerActivity.showV610AmountAutoLimit610Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v610amountAutoLimit610).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit610",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v610amountAutoLimit610 = value
        AppToast.show(this, "Amount Auto Limit610: $value")
    }
}

// v610: Angle Auto Rotate610
internal fun PlayerActivity.showV610AngleAutoRotate610Toggle() {
    val current = BiliClient.prefs.v610angleAutoRotate610
    BiliClient.prefs.v610angleAutoRotate610 = !current
    AppToast.show(this, "Angle Auto Rotate610: ${if (!current) "ON" else "OFF"}")
}

// v610: Answer Auto Reply610
internal fun PlayerActivity.showV610AnswerAutoReply610Toggle() {
    val current = BiliClient.prefs.v610answerAutoReply610
    BiliClient.prefs.v610answerAutoReply610 = !current
    AppToast.show(this, "Answer Auto Reply610: ${if (!current) "ON" else "OFF"}")
}

// v610: API Auto Call610
internal fun PlayerActivity.showV610ApiAutoCall610Toggle() {
    val current = BiliClient.prefs.v610apiAutoCall610
    BiliClient.prefs.v610apiAutoCall610 = !current
    AppToast.show(this, "API Auto Call610: ${if (!current) "ON" else "OFF"}")
}

// v610: Archive Auto Save610
internal fun PlayerActivity.showV610ArchiveAutoSave610Toggle() {
    val current = BiliClient.prefs.v610archiveAutoSave610
    BiliClient.prefs.v610archiveAutoSave610 = !current
    AppToast.show(this, "Archive Auto Save610: ${if (!current) "ON" else "OFF"}")
}

// v610: Area Auto Detect610
internal fun PlayerActivity.showV610AreaAutoDetect610Toggle() {
    val current = BiliClient.prefs.v610areaAutoDetect610
    BiliClient.prefs.v610areaAutoDetect610 = !current
    AppToast.show(this, "Area Auto Detect610: ${if (!current) "ON" else "OFF"}")
}

// v610: Array Auto Sort610
internal fun PlayerActivity.showV610ArrayAutoSort610Toggle() {
    val current = BiliClient.prefs.v610arrayAutoSort610
    BiliClient.prefs.v610arrayAutoSort610 = !current
    AppToast.show(this, "Array Auto Sort610: ${if (!current) "ON" else "OFF"}")
}

// v611: Arrow Auto Navigate611
internal fun PlayerActivity.showV611ArrowAutoNavigate611Toggle() {
    val current = BiliClient.prefs.v611arrowAutoNavigate611
    BiliClient.prefs.v611arrowAutoNavigate611 = !current
    AppToast.show(this, "Arrow Auto Navigate611: ${if (!current) "ON" else "OFF"}")
}

// v611: Asset Auto Load611
internal fun PlayerActivity.showV611AssetAutoLoad611Toggle() {
    val current = BiliClient.prefs.v611assetAutoLoad611
    BiliClient.prefs.v611assetAutoLoad611 = !current
    AppToast.show(this, "Asset Auto Load611: ${if (!current) "ON" else "OFF"}")
}

// v611: Assign Auto Task611
internal fun PlayerActivity.showV611AssignAutoTask611Toggle() {
    val current = BiliClient.prefs.v611assignAutoTask611
    BiliClient.prefs.v611assignAutoTask611 = !current
    AppToast.show(this, "Assign Auto Task611: ${if (!current) "ON" else "OFF"}")
}

// v611: Async Auto Execute611
internal fun PlayerActivity.showV611AsyncAutoExecute611Toggle() {
    val current = BiliClient.prefs.v611asyncAutoExecute611
    BiliClient.prefs.v611asyncAutoExecute611 = !current
    AppToast.show(this, "Async Auto Execute611: ${if (!current) "ON" else "OFF"}")
}

// v611: Attack Auto Block611
internal fun PlayerActivity.showV611AttackAutoBlock611Toggle() {
    val current = BiliClient.prefs.v611attackAutoBlock611
    BiliClient.prefs.v611attackAutoBlock611 = !current
    AppToast.show(this, "Attack Auto Block611: ${if (!current) "ON" else "OFF"}")
}

// v611: Avatar Auto Update611
internal fun PlayerActivity.showV611AvatarAutoUpdate611Toggle() {
    val current = BiliClient.prefs.v611avatarAutoUpdate611
    BiliClient.prefs.v611avatarAutoUpdate611 = !current
    AppToast.show(this, "Avatar Auto Update611: ${if (!current) "ON" else "OFF"}")
}

// v611: Back Auto Save611
internal fun PlayerActivity.showV611BackAutoSave611Toggle() {
    val current = BiliClient.prefs.v611backAutoSave611
    BiliClient.prefs.v611backAutoSave611 = !current
    AppToast.show(this, "Back Auto Save611: ${if (!current) "ON" else "OFF"}")
}

// v611: Balance Auto Load611
internal fun PlayerActivity.showV611BalanceAutoLoad611Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v611balanceAutoLoad611).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load611",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v611balanceAutoLoad611 = value
        AppToast.show(this, "Balance Auto Load611: $value")
    }
}

// v611: Band Auto Width611
internal fun PlayerActivity.showV611BandAutoWidth611Toggle() {
    val current = BiliClient.prefs.v611bandAutoWidth611
    BiliClient.prefs.v611bandAutoWidth611 = !current
    AppToast.show(this, "Band Auto Width611: ${if (!current) "ON" else "OFF"}")
}

// v611: Bar Auto Scroll611
internal fun PlayerActivity.showV611BarAutoScroll611Toggle() {
    val current = BiliClient.prefs.v611barAutoScroll611
    BiliClient.prefs.v611barAutoScroll611 = !current
    AppToast.show(this, "Bar Auto Scroll611: ${if (!current) "ON" else "OFF"}")
}

// v611: Beacon Auto Ping611
internal fun PlayerActivity.showV611BeaconAutoPing611Toggle() {
    val current = BiliClient.prefs.v611beaconAutoPing611
    BiliClient.prefs.v611beaconAutoPing611 = !current
    AppToast.show(this, "Beacon Auto Ping611: ${if (!current) "ON" else "OFF"}")
}

// v611: Beam Auto Form611
internal fun PlayerActivity.showV611BeamAutoForm611Toggle() {
    val current = BiliClient.prefs.v611beamAutoForm611
    BiliClient.prefs.v611beamAutoForm611 = !current
    AppToast.show(this, "Beam Auto Form611: ${if (!current) "ON" else "OFF"}")
}

// v611: Before Auto Hook611
internal fun PlayerActivity.showV611BeforeAutoHook611Toggle() {
    val current = BiliClient.prefs.v611beforeAutoHook611
    BiliClient.prefs.v611beforeAutoHook611 = !current
    AppToast.show(this, "Before Auto Hook611: ${if (!current) "ON" else "OFF"}")
}

// v611: Begin Auto Init611
internal fun PlayerActivity.showV611BeginAutoInit611Toggle() {
    val current = BiliClient.prefs.v611beginAutoInit611
    BiliClient.prefs.v611beginAutoInit611 = !current
    AppToast.show(this, "Begin Auto Init611: ${if (!current) "ON" else "OFF"}")
}

// v611: Behavior Auto Track611
internal fun PlayerActivity.showV611BehaviorAutoTrack611Toggle() {
    val current = BiliClient.prefs.v611behaviorAutoTrack611
    BiliClient.prefs.v611behaviorAutoTrack611 = !current
    AppToast.show(this, "Behavior Auto Track611: ${if (!current) "ON" else "OFF"}")
}

// v612: Arrow Auto Navigate612
internal fun PlayerActivity.showV612ArrowAutoNavigate612Toggle() {
    val current = BiliClient.prefs.v612arrowAutoNavigate612
    BiliClient.prefs.v612arrowAutoNavigate612 = !current
    AppToast.show(this, "Arrow Auto Navigate612: ${if (!current) "ON" else "OFF"}")
}

// v612: Asset Auto Load612
internal fun PlayerActivity.showV612AssetAutoLoad612Toggle() {
    val current = BiliClient.prefs.v612assetAutoLoad612
    BiliClient.prefs.v612assetAutoLoad612 = !current
    AppToast.show(this, "Asset Auto Load612: ${if (!current) "ON" else "OFF"}")
}

// v612: Assign Auto Task612
internal fun PlayerActivity.showV612AssignAutoTask612Toggle() {
    val current = BiliClient.prefs.v612assignAutoTask612
    BiliClient.prefs.v612assignAutoTask612 = !current
    AppToast.show(this, "Assign Auto Task612: ${if (!current) "ON" else "OFF"}")
}

// v612: Async Auto Execute612
internal fun PlayerActivity.showV612AsyncAutoExecute612Toggle() {
    val current = BiliClient.prefs.v612asyncAutoExecute612
    BiliClient.prefs.v612asyncAutoExecute612 = !current
    AppToast.show(this, "Async Auto Execute612: ${if (!current) "ON" else "OFF"}")
}

// v612: Attack Auto Block612
internal fun PlayerActivity.showV612AttackAutoBlock612Toggle() {
    val current = BiliClient.prefs.v612attackAutoBlock612
    BiliClient.prefs.v612attackAutoBlock612 = !current
    AppToast.show(this, "Attack Auto Block612: ${if (!current) "ON" else "OFF"}")
}

// v612: Avatar Auto Update612
internal fun PlayerActivity.showV612AvatarAutoUpdate612Toggle() {
    val current = BiliClient.prefs.v612avatarAutoUpdate612
    BiliClient.prefs.v612avatarAutoUpdate612 = !current
    AppToast.show(this, "Avatar Auto Update612: ${if (!current) "ON" else "OFF"}")
}

// v612: Back Auto Save612
internal fun PlayerActivity.showV612BackAutoSave612Toggle() {
    val current = BiliClient.prefs.v612backAutoSave612
    BiliClient.prefs.v612backAutoSave612 = !current
    AppToast.show(this, "Back Auto Save612: ${if (!current) "ON" else "OFF"}")
}

// v612: Balance Auto Load612
internal fun PlayerActivity.showV612BalanceAutoLoad612Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v612balanceAutoLoad612).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load612",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v612balanceAutoLoad612 = value
        AppToast.show(this, "Balance Auto Load612: $value")
    }
}

// v612: Band Auto Width612
internal fun PlayerActivity.showV612BandAutoWidth612Toggle() {
    val current = BiliClient.prefs.v612bandAutoWidth612
    BiliClient.prefs.v612bandAutoWidth612 = !current
    AppToast.show(this, "Band Auto Width612: ${if (!current) "ON" else "OFF"}")
}

// v612: Bar Auto Scroll612
internal fun PlayerActivity.showV612BarAutoScroll612Toggle() {
    val current = BiliClient.prefs.v612barAutoScroll612
    BiliClient.prefs.v612barAutoScroll612 = !current
    AppToast.show(this, "Bar Auto Scroll612: ${if (!current) "ON" else "OFF"}")
}

// v612: Beacon Auto Ping612
internal fun PlayerActivity.showV612BeaconAutoPing612Toggle() {
    val current = BiliClient.prefs.v612beaconAutoPing612
    BiliClient.prefs.v612beaconAutoPing612 = !current
    AppToast.show(this, "Beacon Auto Ping612: ${if (!current) "ON" else "OFF"}")
}

// v612: Beam Auto Form612
internal fun PlayerActivity.showV612BeamAutoForm612Toggle() {
    val current = BiliClient.prefs.v612beamAutoForm612
    BiliClient.prefs.v612beamAutoForm612 = !current
    AppToast.show(this, "Beam Auto Form612: ${if (!current) "ON" else "OFF"}")
}

// v612: Before Auto Hook612
internal fun PlayerActivity.showV612BeforeAutoHook612Toggle() {
    val current = BiliClient.prefs.v612beforeAutoHook612
    BiliClient.prefs.v612beforeAutoHook612 = !current
    AppToast.show(this, "Before Auto Hook612: ${if (!current) "ON" else "OFF"}")
}

// v612: Begin Auto Init612
internal fun PlayerActivity.showV612BeginAutoInit612Toggle() {
    val current = BiliClient.prefs.v612beginAutoInit612
    BiliClient.prefs.v612beginAutoInit612 = !current
    AppToast.show(this, "Begin Auto Init612: ${if (!current) "ON" else "OFF"}")
}

// v612: Behavior Auto Track612
internal fun PlayerActivity.showV612BehaviorAutoTrack612Toggle() {
    val current = BiliClient.prefs.v612behaviorAutoTrack612
    BiliClient.prefs.v612behaviorAutoTrack612 = !current
    AppToast.show(this, "Behavior Auto Track612: ${if (!current) "ON" else "OFF"}")
}

// v613: Arrow Auto Navigate613
internal fun PlayerActivity.showV613ArrowAutoNavigate613Toggle() {
    val current = BiliClient.prefs.v613arrowAutoNavigate613
    BiliClient.prefs.v613arrowAutoNavigate613 = !current
    AppToast.show(this, "Arrow Auto Navigate613: ${if (!current) "ON" else "OFF"}")
}

// v613: Asset Auto Load613
internal fun PlayerActivity.showV613AssetAutoLoad613Toggle() {
    val current = BiliClient.prefs.v613assetAutoLoad613
    BiliClient.prefs.v613assetAutoLoad613 = !current
    AppToast.show(this, "Asset Auto Load613: ${if (!current) "ON" else "OFF"}")
}

// v613: Assign Auto Task613
internal fun PlayerActivity.showV613AssignAutoTask613Toggle() {
    val current = BiliClient.prefs.v613assignAutoTask613
    BiliClient.prefs.v613assignAutoTask613 = !current
    AppToast.show(this, "Assign Auto Task613: ${if (!current) "ON" else "OFF"}")
}

// v613: Async Auto Execute613
internal fun PlayerActivity.showV613AsyncAutoExecute613Toggle() {
    val current = BiliClient.prefs.v613asyncAutoExecute613
    BiliClient.prefs.v613asyncAutoExecute613 = !current
    AppToast.show(this, "Async Auto Execute613: ${if (!current) "ON" else "OFF"}")
}

// v613: Attack Auto Block613
internal fun PlayerActivity.showV613AttackAutoBlock613Toggle() {
    val current = BiliClient.prefs.v613attackAutoBlock613
    BiliClient.prefs.v613attackAutoBlock613 = !current
    AppToast.show(this, "Attack Auto Block613: ${if (!current) "ON" else "OFF"}")
}

// v613: Avatar Auto Update613
internal fun PlayerActivity.showV613AvatarAutoUpdate613Toggle() {
    val current = BiliClient.prefs.v613avatarAutoUpdate613
    BiliClient.prefs.v613avatarAutoUpdate613 = !current
    AppToast.show(this, "Avatar Auto Update613: ${if (!current) "ON" else "OFF"}")
}

// v613: Back Auto Save613
internal fun PlayerActivity.showV613BackAutoSave613Toggle() {
    val current = BiliClient.prefs.v613backAutoSave613
    BiliClient.prefs.v613backAutoSave613 = !current
    AppToast.show(this, "Back Auto Save613: ${if (!current) "ON" else "OFF"}")
}

// v613: Balance Auto Load613
internal fun PlayerActivity.showV613BalanceAutoLoad613Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v613balanceAutoLoad613).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load613",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v613balanceAutoLoad613 = value
        AppToast.show(this, "Balance Auto Load613: $value")
    }
}

// v613: Band Auto Width613
internal fun PlayerActivity.showV613BandAutoWidth613Toggle() {
    val current = BiliClient.prefs.v613bandAutoWidth613
    BiliClient.prefs.v613bandAutoWidth613 = !current
    AppToast.show(this, "Band Auto Width613: ${if (!current) "ON" else "OFF"}")
}

// v613: Bar Auto Scroll613
internal fun PlayerActivity.showV613BarAutoScroll613Toggle() {
    val current = BiliClient.prefs.v613barAutoScroll613
    BiliClient.prefs.v613barAutoScroll613 = !current
    AppToast.show(this, "Bar Auto Scroll613: ${if (!current) "ON" else "OFF"}")
}

// v613: Beacon Auto Ping613
internal fun PlayerActivity.showV613BeaconAutoPing613Toggle() {
    val current = BiliClient.prefs.v613beaconAutoPing613
    BiliClient.prefs.v613beaconAutoPing613 = !current
    AppToast.show(this, "Beacon Auto Ping613: ${if (!current) "ON" else "OFF"}")
}

// v613: Beam Auto Form613
internal fun PlayerActivity.showV613BeamAutoForm613Toggle() {
    val current = BiliClient.prefs.v613beamAutoForm613
    BiliClient.prefs.v613beamAutoForm613 = !current
    AppToast.show(this, "Beam Auto Form613: ${if (!current) "ON" else "OFF"}")
}

// v613: Before Auto Hook613
internal fun PlayerActivity.showV613BeforeAutoHook613Toggle() {
    val current = BiliClient.prefs.v613beforeAutoHook613
    BiliClient.prefs.v613beforeAutoHook613 = !current
    AppToast.show(this, "Before Auto Hook613: ${if (!current) "ON" else "OFF"}")
}

// v613: Begin Auto Init613
internal fun PlayerActivity.showV613BeginAutoInit613Toggle() {
    val current = BiliClient.prefs.v613beginAutoInit613
    BiliClient.prefs.v613beginAutoInit613 = !current
    AppToast.show(this, "Begin Auto Init613: ${if (!current) "ON" else "OFF"}")
}

// v613: Behavior Auto Track613
internal fun PlayerActivity.showV613BehaviorAutoTrack613Toggle() {
    val current = BiliClient.prefs.v613behaviorAutoTrack613
    BiliClient.prefs.v613behaviorAutoTrack613 = !current
    AppToast.show(this, "Behavior Auto Track613: ${if (!current) "ON" else "OFF"}")
}

// v614: Arrow Auto Navigate614
internal fun PlayerActivity.showV614ArrowAutoNavigate614Toggle() {
    val current = BiliClient.prefs.v614arrowAutoNavigate614
    BiliClient.prefs.v614arrowAutoNavigate614 = !current
    AppToast.show(this, "Arrow Auto Navigate614: ${if (!current) "ON" else "OFF"}")
}

// v614: Asset Auto Load614
internal fun PlayerActivity.showV614AssetAutoLoad614Toggle() {
    val current = BiliClient.prefs.v614assetAutoLoad614
    BiliClient.prefs.v614assetAutoLoad614 = !current
    AppToast.show(this, "Asset Auto Load614: ${if (!current) "ON" else "OFF"}")
}

// v614: Assign Auto Task614
internal fun PlayerActivity.showV614AssignAutoTask614Toggle() {
    val current = BiliClient.prefs.v614assignAutoTask614
    BiliClient.prefs.v614assignAutoTask614 = !current
    AppToast.show(this, "Assign Auto Task614: ${if (!current) "ON" else "OFF"}")
}

// v614: Async Auto Execute614
internal fun PlayerActivity.showV614AsyncAutoExecute614Toggle() {
    val current = BiliClient.prefs.v614asyncAutoExecute614
    BiliClient.prefs.v614asyncAutoExecute614 = !current
    AppToast.show(this, "Async Auto Execute614: ${if (!current) "ON" else "OFF"}")
}

// v614: Attack Auto Block614
internal fun PlayerActivity.showV614AttackAutoBlock614Toggle() {
    val current = BiliClient.prefs.v614attackAutoBlock614
    BiliClient.prefs.v614attackAutoBlock614 = !current
    AppToast.show(this, "Attack Auto Block614: ${if (!current) "ON" else "OFF"}")
}

// v614: Avatar Auto Update614
internal fun PlayerActivity.showV614AvatarAutoUpdate614Toggle() {
    val current = BiliClient.prefs.v614avatarAutoUpdate614
    BiliClient.prefs.v614avatarAutoUpdate614 = !current
    AppToast.show(this, "Avatar Auto Update614: ${if (!current) "ON" else "OFF"}")
}

// v614: Back Auto Save614
internal fun PlayerActivity.showV614BackAutoSave614Toggle() {
    val current = BiliClient.prefs.v614backAutoSave614
    BiliClient.prefs.v614backAutoSave614 = !current
    AppToast.show(this, "Back Auto Save614: ${if (!current) "ON" else "OFF"}")
}

// v614: Balance Auto Load614
internal fun PlayerActivity.showV614BalanceAutoLoad614Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v614balanceAutoLoad614).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load614",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v614balanceAutoLoad614 = value
        AppToast.show(this, "Balance Auto Load614: $value")
    }
}

// v614: Band Auto Width614
internal fun PlayerActivity.showV614BandAutoWidth614Toggle() {
    val current = BiliClient.prefs.v614bandAutoWidth614
    BiliClient.prefs.v614bandAutoWidth614 = !current
    AppToast.show(this, "Band Auto Width614: ${if (!current) "ON" else "OFF"}")
}

// v614: Bar Auto Scroll614
internal fun PlayerActivity.showV614BarAutoScroll614Toggle() {
    val current = BiliClient.prefs.v614barAutoScroll614
    BiliClient.prefs.v614barAutoScroll614 = !current
    AppToast.show(this, "Bar Auto Scroll614: ${if (!current) "ON" else "OFF"}")
}

// v614: Beacon Auto Ping614
internal fun PlayerActivity.showV614BeaconAutoPing614Toggle() {
    val current = BiliClient.prefs.v614beaconAutoPing614
    BiliClient.prefs.v614beaconAutoPing614 = !current
    AppToast.show(this, "Beacon Auto Ping614: ${if (!current) "ON" else "OFF"}")
}

// v614: Beam Auto Form614
internal fun PlayerActivity.showV614BeamAutoForm614Toggle() {
    val current = BiliClient.prefs.v614beamAutoForm614
    BiliClient.prefs.v614beamAutoForm614 = !current
    AppToast.show(this, "Beam Auto Form614: ${if (!current) "ON" else "OFF"}")
}

// v614: Before Auto Hook614
internal fun PlayerActivity.showV614BeforeAutoHook614Toggle() {
    val current = BiliClient.prefs.v614beforeAutoHook614
    BiliClient.prefs.v614beforeAutoHook614 = !current
    AppToast.show(this, "Before Auto Hook614: ${if (!current) "ON" else "OFF"}")
}

// v614: Begin Auto Init614
internal fun PlayerActivity.showV614BeginAutoInit614Toggle() {
    val current = BiliClient.prefs.v614beginAutoInit614
    BiliClient.prefs.v614beginAutoInit614 = !current
    AppToast.show(this, "Begin Auto Init614: ${if (!current) "ON" else "OFF"}")
}

// v614: Behavior Auto Track614
internal fun PlayerActivity.showV614BehaviorAutoTrack614Toggle() {
    val current = BiliClient.prefs.v614behaviorAutoTrack614
    BiliClient.prefs.v614behaviorAutoTrack614 = !current
    AppToast.show(this, "Behavior Auto Track614: ${if (!current) "ON" else "OFF"}")
}

// v615: Arrow Auto Navigate615
internal fun PlayerActivity.showV615ArrowAutoNavigate615Toggle() {
    val current = BiliClient.prefs.v615arrowAutoNavigate615
    BiliClient.prefs.v615arrowAutoNavigate615 = !current
    AppToast.show(this, "Arrow Auto Navigate615: ${if (!current) "ON" else "OFF"}")
}

// v615: Asset Auto Load615
internal fun PlayerActivity.showV615AssetAutoLoad615Toggle() {
    val current = BiliClient.prefs.v615assetAutoLoad615
    BiliClient.prefs.v615assetAutoLoad615 = !current
    AppToast.show(this, "Asset Auto Load615: ${if (!current) "ON" else "OFF"}")
}

// v615: Assign Auto Task615
internal fun PlayerActivity.showV615AssignAutoTask615Toggle() {
    val current = BiliClient.prefs.v615assignAutoTask615
    BiliClient.prefs.v615assignAutoTask615 = !current
    AppToast.show(this, "Assign Auto Task615: ${if (!current) "ON" else "OFF"}")
}

// v615: Async Auto Execute615
internal fun PlayerActivity.showV615AsyncAutoExecute615Toggle() {
    val current = BiliClient.prefs.v615asyncAutoExecute615
    BiliClient.prefs.v615asyncAutoExecute615 = !current
    AppToast.show(this, "Async Auto Execute615: ${if (!current) "ON" else "OFF"}")
}

// v615: Attack Auto Block615
internal fun PlayerActivity.showV615AttackAutoBlock615Toggle() {
    val current = BiliClient.prefs.v615attackAutoBlock615
    BiliClient.prefs.v615attackAutoBlock615 = !current
    AppToast.show(this, "Attack Auto Block615: ${if (!current) "ON" else "OFF"}")
}

// v615: Avatar Auto Update615
internal fun PlayerActivity.showV615AvatarAutoUpdate615Toggle() {
    val current = BiliClient.prefs.v615avatarAutoUpdate615
    BiliClient.prefs.v615avatarAutoUpdate615 = !current
    AppToast.show(this, "Avatar Auto Update615: ${if (!current) "ON" else "OFF"}")
}

// v615: Back Auto Save615
internal fun PlayerActivity.showV615BackAutoSave615Toggle() {
    val current = BiliClient.prefs.v615backAutoSave615
    BiliClient.prefs.v615backAutoSave615 = !current
    AppToast.show(this, "Back Auto Save615: ${if (!current) "ON" else "OFF"}")
}

// v615: Balance Auto Load615
internal fun PlayerActivity.showV615BalanceAutoLoad615Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v615balanceAutoLoad615).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load615",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v615balanceAutoLoad615 = value
        AppToast.show(this, "Balance Auto Load615: $value")
    }
}

// v615: Band Auto Width615
internal fun PlayerActivity.showV615BandAutoWidth615Toggle() {
    val current = BiliClient.prefs.v615bandAutoWidth615
    BiliClient.prefs.v615bandAutoWidth615 = !current
    AppToast.show(this, "Band Auto Width615: ${if (!current) "ON" else "OFF"}")
}

// v615: Bar Auto Scroll615
internal fun PlayerActivity.showV615BarAutoScroll615Toggle() {
    val current = BiliClient.prefs.v615barAutoScroll615
    BiliClient.prefs.v615barAutoScroll615 = !current
    AppToast.show(this, "Bar Auto Scroll615: ${if (!current) "ON" else "OFF"}")
}

// v615: Beacon Auto Ping615
internal fun PlayerActivity.showV615BeaconAutoPing615Toggle() {
    val current = BiliClient.prefs.v615beaconAutoPing615
    BiliClient.prefs.v615beaconAutoPing615 = !current
    AppToast.show(this, "Beacon Auto Ping615: ${if (!current) "ON" else "OFF"}")
}

// v615: Beam Auto Form615
internal fun PlayerActivity.showV615BeamAutoForm615Toggle() {
    val current = BiliClient.prefs.v615beamAutoForm615
    BiliClient.prefs.v615beamAutoForm615 = !current
    AppToast.show(this, "Beam Auto Form615: ${if (!current) "ON" else "OFF"}")
}

// v615: Before Auto Hook615
internal fun PlayerActivity.showV615BeforeAutoHook615Toggle() {
    val current = BiliClient.prefs.v615beforeAutoHook615
    BiliClient.prefs.v615beforeAutoHook615 = !current
    AppToast.show(this, "Before Auto Hook615: ${if (!current) "ON" else "OFF"}")
}

// v615: Begin Auto Init615
internal fun PlayerActivity.showV615BeginAutoInit615Toggle() {
    val current = BiliClient.prefs.v615beginAutoInit615
    BiliClient.prefs.v615beginAutoInit615 = !current
    AppToast.show(this, "Begin Auto Init615: ${if (!current) "ON" else "OFF"}")
}

// v615: Behavior Auto Track615
internal fun PlayerActivity.showV615BehaviorAutoTrack615Toggle() {
    val current = BiliClient.prefs.v615behaviorAutoTrack615
    BiliClient.prefs.v615behaviorAutoTrack615 = !current
    AppToast.show(this, "Behavior Auto Track615: ${if (!current) "ON" else "OFF"}")
}

// v616: Arrow Auto Navigate616
internal fun PlayerActivity.showV616ArrowAutoNavigate616Toggle() {
    val current = BiliClient.prefs.v616arrowAutoNavigate616
    BiliClient.prefs.v616arrowAutoNavigate616 = !current
    AppToast.show(this, "Arrow Auto Navigate616: ${if (!current) "ON" else "OFF"}")
}

// v616: Asset Auto Load616
internal fun PlayerActivity.showV616AssetAutoLoad616Toggle() {
    val current = BiliClient.prefs.v616assetAutoLoad616
    BiliClient.prefs.v616assetAutoLoad616 = !current
    AppToast.show(this, "Asset Auto Load616: ${if (!current) "ON" else "OFF"}")
}

// v616: Assign Auto Task616
internal fun PlayerActivity.showV616AssignAutoTask616Toggle() {
    val current = BiliClient.prefs.v616assignAutoTask616
    BiliClient.prefs.v616assignAutoTask616 = !current
    AppToast.show(this, "Assign Auto Task616: ${if (!current) "ON" else "OFF"}")
}

// v616: Async Auto Execute616
internal fun PlayerActivity.showV616AsyncAutoExecute616Toggle() {
    val current = BiliClient.prefs.v616asyncAutoExecute616
    BiliClient.prefs.v616asyncAutoExecute616 = !current
    AppToast.show(this, "Async Auto Execute616: ${if (!current) "ON" else "OFF"}")
}

// v616: Attack Auto Block616
internal fun PlayerActivity.showV616AttackAutoBlock616Toggle() {
    val current = BiliClient.prefs.v616attackAutoBlock616
    BiliClient.prefs.v616attackAutoBlock616 = !current
    AppToast.show(this, "Attack Auto Block616: ${if (!current) "ON" else "OFF"}")
}

// v616: Avatar Auto Update616
internal fun PlayerActivity.showV616AvatarAutoUpdate616Toggle() {
    val current = BiliClient.prefs.v616avatarAutoUpdate616
    BiliClient.prefs.v616avatarAutoUpdate616 = !current
    AppToast.show(this, "Avatar Auto Update616: ${if (!current) "ON" else "OFF"}")
}

// v616: Back Auto Save616
internal fun PlayerActivity.showV616BackAutoSave616Toggle() {
    val current = BiliClient.prefs.v616backAutoSave616
    BiliClient.prefs.v616backAutoSave616 = !current
    AppToast.show(this, "Back Auto Save616: ${if (!current) "ON" else "OFF"}")
}

// v616: Balance Auto Load616
internal fun PlayerActivity.showV616BalanceAutoLoad616Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v616balanceAutoLoad616).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load616",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v616balanceAutoLoad616 = value
        AppToast.show(this, "Balance Auto Load616: $value")
    }
}

// v616: Band Auto Width616
internal fun PlayerActivity.showV616BandAutoWidth616Toggle() {
    val current = BiliClient.prefs.v616bandAutoWidth616
    BiliClient.prefs.v616bandAutoWidth616 = !current
    AppToast.show(this, "Band Auto Width616: ${if (!current) "ON" else "OFF"}")
}

// v616: Bar Auto Scroll616
internal fun PlayerActivity.showV616BarAutoScroll616Toggle() {
    val current = BiliClient.prefs.v616barAutoScroll616
    BiliClient.prefs.v616barAutoScroll616 = !current
    AppToast.show(this, "Bar Auto Scroll616: ${if (!current) "ON" else "OFF"}")
}

// v616: Beacon Auto Ping616
internal fun PlayerActivity.showV616BeaconAutoPing616Toggle() {
    val current = BiliClient.prefs.v616beaconAutoPing616
    BiliClient.prefs.v616beaconAutoPing616 = !current
    AppToast.show(this, "Beacon Auto Ping616: ${if (!current) "ON" else "OFF"}")
}

// v616: Beam Auto Form616
internal fun PlayerActivity.showV616BeamAutoForm616Toggle() {
    val current = BiliClient.prefs.v616beamAutoForm616
    BiliClient.prefs.v616beamAutoForm616 = !current
    AppToast.show(this, "Beam Auto Form616: ${if (!current) "ON" else "OFF"}")
}

// v616: Before Auto Hook616
internal fun PlayerActivity.showV616BeforeAutoHook616Toggle() {
    val current = BiliClient.prefs.v616beforeAutoHook616
    BiliClient.prefs.v616beforeAutoHook616 = !current
    AppToast.show(this, "Before Auto Hook616: ${if (!current) "ON" else "OFF"}")
}

// v616: Begin Auto Init616
internal fun PlayerActivity.showV616BeginAutoInit616Toggle() {
    val current = BiliClient.prefs.v616beginAutoInit616
    BiliClient.prefs.v616beginAutoInit616 = !current
    AppToast.show(this, "Begin Auto Init616: ${if (!current) "ON" else "OFF"}")
}

// v616: Behavior Auto Track616
internal fun PlayerActivity.showV616BehaviorAutoTrack616Toggle() {
    val current = BiliClient.prefs.v616behaviorAutoTrack616
    BiliClient.prefs.v616behaviorAutoTrack616 = !current
    AppToast.show(this, "Behavior Auto Track616: ${if (!current) "ON" else "OFF"}")
}

// v617: Arrow Auto Navigate617
internal fun PlayerActivity.showV617ArrowAutoNavigate617Toggle() {
    val current = BiliClient.prefs.v617arrowAutoNavigate617
    BiliClient.prefs.v617arrowAutoNavigate617 = !current
    AppToast.show(this, "Arrow Auto Navigate617: ${if (!current) "ON" else "OFF"}")
}

// v617: Asset Auto Load617
internal fun PlayerActivity.showV617AssetAutoLoad617Toggle() {
    val current = BiliClient.prefs.v617assetAutoLoad617
    BiliClient.prefs.v617assetAutoLoad617 = !current
    AppToast.show(this, "Asset Auto Load617: ${if (!current) "ON" else "OFF"}")
}

// v617: Assign Auto Task617
internal fun PlayerActivity.showV617AssignAutoTask617Toggle() {
    val current = BiliClient.prefs.v617assignAutoTask617
    BiliClient.prefs.v617assignAutoTask617 = !current
    AppToast.show(this, "Assign Auto Task617: ${if (!current) "ON" else "OFF"}")
}

// v617: Async Auto Execute617
internal fun PlayerActivity.showV617AsyncAutoExecute617Toggle() {
    val current = BiliClient.prefs.v617asyncAutoExecute617
    BiliClient.prefs.v617asyncAutoExecute617 = !current
    AppToast.show(this, "Async Auto Execute617: ${if (!current) "ON" else "OFF"}")
}

// v617: Attack Auto Block617
internal fun PlayerActivity.showV617AttackAutoBlock617Toggle() {
    val current = BiliClient.prefs.v617attackAutoBlock617
    BiliClient.prefs.v617attackAutoBlock617 = !current
    AppToast.show(this, "Attack Auto Block617: ${if (!current) "ON" else "OFF"}")
}

// v617: Avatar Auto Update617
internal fun PlayerActivity.showV617AvatarAutoUpdate617Toggle() {
    val current = BiliClient.prefs.v617avatarAutoUpdate617
    BiliClient.prefs.v617avatarAutoUpdate617 = !current
    AppToast.show(this, "Avatar Auto Update617: ${if (!current) "ON" else "OFF"}")
}

// v617: Back Auto Save617
internal fun PlayerActivity.showV617BackAutoSave617Toggle() {
    val current = BiliClient.prefs.v617backAutoSave617
    BiliClient.prefs.v617backAutoSave617 = !current
    AppToast.show(this, "Back Auto Save617: ${if (!current) "ON" else "OFF"}")
}

// v617: Balance Auto Load617
internal fun PlayerActivity.showV617BalanceAutoLoad617Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v617balanceAutoLoad617).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load617",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v617balanceAutoLoad617 = value
        AppToast.show(this, "Balance Auto Load617: $value")
    }
}

// v617: Band Auto Width617
internal fun PlayerActivity.showV617BandAutoWidth617Toggle() {
    val current = BiliClient.prefs.v617bandAutoWidth617
    BiliClient.prefs.v617bandAutoWidth617 = !current
    AppToast.show(this, "Band Auto Width617: ${if (!current) "ON" else "OFF"}")
}

// v617: Bar Auto Scroll617
internal fun PlayerActivity.showV617BarAutoScroll617Toggle() {
    val current = BiliClient.prefs.v617barAutoScroll617
    BiliClient.prefs.v617barAutoScroll617 = !current
    AppToast.show(this, "Bar Auto Scroll617: ${if (!current) "ON" else "OFF"}")
}

// v617: Beacon Auto Ping617
internal fun PlayerActivity.showV617BeaconAutoPing617Toggle() {
    val current = BiliClient.prefs.v617beaconAutoPing617
    BiliClient.prefs.v617beaconAutoPing617 = !current
    AppToast.show(this, "Beacon Auto Ping617: ${if (!current) "ON" else "OFF"}")
}

// v617: Beam Auto Form617
internal fun PlayerActivity.showV617BeamAutoForm617Toggle() {
    val current = BiliClient.prefs.v617beamAutoForm617
    BiliClient.prefs.v617beamAutoForm617 = !current
    AppToast.show(this, "Beam Auto Form617: ${if (!current) "ON" else "OFF"}")
}

// v617: Before Auto Hook617
internal fun PlayerActivity.showV617BeforeAutoHook617Toggle() {
    val current = BiliClient.prefs.v617beforeAutoHook617
    BiliClient.prefs.v617beforeAutoHook617 = !current
    AppToast.show(this, "Before Auto Hook617: ${if (!current) "ON" else "OFF"}")
}

// v617: Begin Auto Init617
internal fun PlayerActivity.showV617BeginAutoInit617Toggle() {
    val current = BiliClient.prefs.v617beginAutoInit617
    BiliClient.prefs.v617beginAutoInit617 = !current
    AppToast.show(this, "Begin Auto Init617: ${if (!current) "ON" else "OFF"}")
}

// v617: Behavior Auto Track617
internal fun PlayerActivity.showV617BehaviorAutoTrack617Toggle() {
    val current = BiliClient.prefs.v617behaviorAutoTrack617
    BiliClient.prefs.v617behaviorAutoTrack617 = !current
    AppToast.show(this, "Behavior Auto Track617: ${if (!current) "ON" else "OFF"}")
}

// v618: Arrow Auto Navigate618
internal fun PlayerActivity.showV618ArrowAutoNavigate618Toggle() {
    val current = BiliClient.prefs.v618arrowAutoNavigate618
    BiliClient.prefs.v618arrowAutoNavigate618 = !current
    AppToast.show(this, "Arrow Auto Navigate618: ${if (!current) "ON" else "OFF"}")
}

// v618: Asset Auto Load618
internal fun PlayerActivity.showV618AssetAutoLoad618Toggle() {
    val current = BiliClient.prefs.v618assetAutoLoad618
    BiliClient.prefs.v618assetAutoLoad618 = !current
    AppToast.show(this, "Asset Auto Load618: ${if (!current) "ON" else "OFF"}")
}

// v618: Assign Auto Task618
internal fun PlayerActivity.showV618AssignAutoTask618Toggle() {
    val current = BiliClient.prefs.v618assignAutoTask618
    BiliClient.prefs.v618assignAutoTask618 = !current
    AppToast.show(this, "Assign Auto Task618: ${if (!current) "ON" else "OFF"}")
}

// v618: Async Auto Execute618
internal fun PlayerActivity.showV618AsyncAutoExecute618Toggle() {
    val current = BiliClient.prefs.v618asyncAutoExecute618
    BiliClient.prefs.v618asyncAutoExecute618 = !current
    AppToast.show(this, "Async Auto Execute618: ${if (!current) "ON" else "OFF"}")
}

// v618: Attack Auto Block618
internal fun PlayerActivity.showV618AttackAutoBlock618Toggle() {
    val current = BiliClient.prefs.v618attackAutoBlock618
    BiliClient.prefs.v618attackAutoBlock618 = !current
    AppToast.show(this, "Attack Auto Block618: ${if (!current) "ON" else "OFF"}")
}

// v618: Avatar Auto Update618
internal fun PlayerActivity.showV618AvatarAutoUpdate618Toggle() {
    val current = BiliClient.prefs.v618avatarAutoUpdate618
    BiliClient.prefs.v618avatarAutoUpdate618 = !current
    AppToast.show(this, "Avatar Auto Update618: ${if (!current) "ON" else "OFF"}")
}

// v618: Back Auto Save618
internal fun PlayerActivity.showV618BackAutoSave618Toggle() {
    val current = BiliClient.prefs.v618backAutoSave618
    BiliClient.prefs.v618backAutoSave618 = !current
    AppToast.show(this, "Back Auto Save618: ${if (!current) "ON" else "OFF"}")
}

// v618: Balance Auto Load618
internal fun PlayerActivity.showV618BalanceAutoLoad618Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v618balanceAutoLoad618).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load618",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v618balanceAutoLoad618 = value
        AppToast.show(this, "Balance Auto Load618: $value")
    }
}

// v618: Band Auto Width618
internal fun PlayerActivity.showV618BandAutoWidth618Toggle() {
    val current = BiliClient.prefs.v618bandAutoWidth618
    BiliClient.prefs.v618bandAutoWidth618 = !current
    AppToast.show(this, "Band Auto Width618: ${if (!current) "ON" else "OFF"}")
}

// v618: Bar Auto Scroll618
internal fun PlayerActivity.showV618BarAutoScroll618Toggle() {
    val current = BiliClient.prefs.v618barAutoScroll618
    BiliClient.prefs.v618barAutoScroll618 = !current
    AppToast.show(this, "Bar Auto Scroll618: ${if (!current) "ON" else "OFF"}")
}

// v618: Beacon Auto Ping618
internal fun PlayerActivity.showV618BeaconAutoPing618Toggle() {
    val current = BiliClient.prefs.v618beaconAutoPing618
    BiliClient.prefs.v618beaconAutoPing618 = !current
    AppToast.show(this, "Beacon Auto Ping618: ${if (!current) "ON" else "OFF"}")
}

// v618: Beam Auto Form618
internal fun PlayerActivity.showV618BeamAutoForm618Toggle() {
    val current = BiliClient.prefs.v618beamAutoForm618
    BiliClient.prefs.v618beamAutoForm618 = !current
    AppToast.show(this, "Beam Auto Form618: ${if (!current) "ON" else "OFF"}")
}

// v618: Before Auto Hook618
internal fun PlayerActivity.showV618BeforeAutoHook618Toggle() {
    val current = BiliClient.prefs.v618beforeAutoHook618
    BiliClient.prefs.v618beforeAutoHook618 = !current
    AppToast.show(this, "Before Auto Hook618: ${if (!current) "ON" else "OFF"}")
}

// v618: Begin Auto Init618
internal fun PlayerActivity.showV618BeginAutoInit618Toggle() {
    val current = BiliClient.prefs.v618beginAutoInit618
    BiliClient.prefs.v618beginAutoInit618 = !current
    AppToast.show(this, "Begin Auto Init618: ${if (!current) "ON" else "OFF"}")
}

// v618: Behavior Auto Track618
internal fun PlayerActivity.showV618BehaviorAutoTrack618Toggle() {
    val current = BiliClient.prefs.v618behaviorAutoTrack618
    BiliClient.prefs.v618behaviorAutoTrack618 = !current
    AppToast.show(this, "Behavior Auto Track618: ${if (!current) "ON" else "OFF"}")
}

// v619: Arrow Auto Navigate619
internal fun PlayerActivity.showV619ArrowAutoNavigate619Toggle() {
    val current = BiliClient.prefs.v619arrowAutoNavigate619
    BiliClient.prefs.v619arrowAutoNavigate619 = !current
    AppToast.show(this, "Arrow Auto Navigate619: ${if (!current) "ON" else "OFF"}")
}

// v619: Asset Auto Load619
internal fun PlayerActivity.showV619AssetAutoLoad619Toggle() {
    val current = BiliClient.prefs.v619assetAutoLoad619
    BiliClient.prefs.v619assetAutoLoad619 = !current
    AppToast.show(this, "Asset Auto Load619: ${if (!current) "ON" else "OFF"}")
}

// v619: Assign Auto Task619
internal fun PlayerActivity.showV619AssignAutoTask619Toggle() {
    val current = BiliClient.prefs.v619assignAutoTask619
    BiliClient.prefs.v619assignAutoTask619 = !current
    AppToast.show(this, "Assign Auto Task619: ${if (!current) "ON" else "OFF"}")
}

// v619: Async Auto Execute619
internal fun PlayerActivity.showV619AsyncAutoExecute619Toggle() {
    val current = BiliClient.prefs.v619asyncAutoExecute619
    BiliClient.prefs.v619asyncAutoExecute619 = !current
    AppToast.show(this, "Async Auto Execute619: ${if (!current) "ON" else "OFF"}")
}

// v619: Attack Auto Block619
internal fun PlayerActivity.showV619AttackAutoBlock619Toggle() {
    val current = BiliClient.prefs.v619attackAutoBlock619
    BiliClient.prefs.v619attackAutoBlock619 = !current
    AppToast.show(this, "Attack Auto Block619: ${if (!current) "ON" else "OFF"}")
}

// v619: Avatar Auto Update619
internal fun PlayerActivity.showV619AvatarAutoUpdate619Toggle() {
    val current = BiliClient.prefs.v619avatarAutoUpdate619
    BiliClient.prefs.v619avatarAutoUpdate619 = !current
    AppToast.show(this, "Avatar Auto Update619: ${if (!current) "ON" else "OFF"}")
}

// v619: Back Auto Save619
internal fun PlayerActivity.showV619BackAutoSave619Toggle() {
    val current = BiliClient.prefs.v619backAutoSave619
    BiliClient.prefs.v619backAutoSave619 = !current
    AppToast.show(this, "Back Auto Save619: ${if (!current) "ON" else "OFF"}")
}

// v619: Balance Auto Load619
internal fun PlayerActivity.showV619BalanceAutoLoad619Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v619balanceAutoLoad619).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load619",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v619balanceAutoLoad619 = value
        AppToast.show(this, "Balance Auto Load619: $value")
    }
}

// v619: Band Auto Width619
internal fun PlayerActivity.showV619BandAutoWidth619Toggle() {
    val current = BiliClient.prefs.v619bandAutoWidth619
    BiliClient.prefs.v619bandAutoWidth619 = !current
    AppToast.show(this, "Band Auto Width619: ${if (!current) "ON" else "OFF"}")
}

// v619: Bar Auto Scroll619
internal fun PlayerActivity.showV619BarAutoScroll619Toggle() {
    val current = BiliClient.prefs.v619barAutoScroll619
    BiliClient.prefs.v619barAutoScroll619 = !current
    AppToast.show(this, "Bar Auto Scroll619: ${if (!current) "ON" else "OFF"}")
}

// v619: Beacon Auto Ping619
internal fun PlayerActivity.showV619BeaconAutoPing619Toggle() {
    val current = BiliClient.prefs.v619beaconAutoPing619
    BiliClient.prefs.v619beaconAutoPing619 = !current
    AppToast.show(this, "Beacon Auto Ping619: ${if (!current) "ON" else "OFF"}")
}

// v619: Beam Auto Form619
internal fun PlayerActivity.showV619BeamAutoForm619Toggle() {
    val current = BiliClient.prefs.v619beamAutoForm619
    BiliClient.prefs.v619beamAutoForm619 = !current
    AppToast.show(this, "Beam Auto Form619: ${if (!current) "ON" else "OFF"}")
}

// v619: Before Auto Hook619
internal fun PlayerActivity.showV619BeforeAutoHook619Toggle() {
    val current = BiliClient.prefs.v619beforeAutoHook619
    BiliClient.prefs.v619beforeAutoHook619 = !current
    AppToast.show(this, "Before Auto Hook619: ${if (!current) "ON" else "OFF"}")
}

// v619: Begin Auto Init619
internal fun PlayerActivity.showV619BeginAutoInit619Toggle() {
    val current = BiliClient.prefs.v619beginAutoInit619
    BiliClient.prefs.v619beginAutoInit619 = !current
    AppToast.show(this, "Begin Auto Init619: ${if (!current) "ON" else "OFF"}")
}

// v619: Behavior Auto Track619
internal fun PlayerActivity.showV619BehaviorAutoTrack619Toggle() {
    val current = BiliClient.prefs.v619behaviorAutoTrack619
    BiliClient.prefs.v619behaviorAutoTrack619 = !current
    AppToast.show(this, "Behavior Auto Track619: ${if (!current) "ON" else "OFF"}")
}

// v620: Arrow Auto Navigate620
internal fun PlayerActivity.showV620ArrowAutoNavigate620Toggle() {
    val current = BiliClient.prefs.v620arrowAutoNavigate620
    BiliClient.prefs.v620arrowAutoNavigate620 = !current
    AppToast.show(this, "Arrow Auto Navigate620: ${if (!current) "ON" else "OFF"}")
}

// v620: Asset Auto Load620
internal fun PlayerActivity.showV620AssetAutoLoad620Toggle() {
    val current = BiliClient.prefs.v620assetAutoLoad620
    BiliClient.prefs.v620assetAutoLoad620 = !current
    AppToast.show(this, "Asset Auto Load620: ${if (!current) "ON" else "OFF"}")
}

// v620: Assign Auto Task620
internal fun PlayerActivity.showV620AssignAutoTask620Toggle() {
    val current = BiliClient.prefs.v620assignAutoTask620
    BiliClient.prefs.v620assignAutoTask620 = !current
    AppToast.show(this, "Assign Auto Task620: ${if (!current) "ON" else "OFF"}")
}

// v620: Async Auto Execute620
internal fun PlayerActivity.showV620AsyncAutoExecute620Toggle() {
    val current = BiliClient.prefs.v620asyncAutoExecute620
    BiliClient.prefs.v620asyncAutoExecute620 = !current
    AppToast.show(this, "Async Auto Execute620: ${if (!current) "ON" else "OFF"}")
}

// v620: Attack Auto Block620
internal fun PlayerActivity.showV620AttackAutoBlock620Toggle() {
    val current = BiliClient.prefs.v620attackAutoBlock620
    BiliClient.prefs.v620attackAutoBlock620 = !current
    AppToast.show(this, "Attack Auto Block620: ${if (!current) "ON" else "OFF"}")
}

// v620: Avatar Auto Update620
internal fun PlayerActivity.showV620AvatarAutoUpdate620Toggle() {
    val current = BiliClient.prefs.v620avatarAutoUpdate620
    BiliClient.prefs.v620avatarAutoUpdate620 = !current
    AppToast.show(this, "Avatar Auto Update620: ${if (!current) "ON" else "OFF"}")
}

// v620: Back Auto Save620
internal fun PlayerActivity.showV620BackAutoSave620Toggle() {
    val current = BiliClient.prefs.v620backAutoSave620
    BiliClient.prefs.v620backAutoSave620 = !current
    AppToast.show(this, "Back Auto Save620: ${if (!current) "ON" else "OFF"}")
}

// v620: Balance Auto Load620
internal fun PlayerActivity.showV620BalanceAutoLoad620Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v620balanceAutoLoad620).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load620",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v620balanceAutoLoad620 = value
        AppToast.show(this, "Balance Auto Load620: $value")
    }
}

// v620: Band Auto Width620
internal fun PlayerActivity.showV620BandAutoWidth620Toggle() {
    val current = BiliClient.prefs.v620bandAutoWidth620
    BiliClient.prefs.v620bandAutoWidth620 = !current
    AppToast.show(this, "Band Auto Width620: ${if (!current) "ON" else "OFF"}")
}

// v620: Bar Auto Scroll620
internal fun PlayerActivity.showV620BarAutoScroll620Toggle() {
    val current = BiliClient.prefs.v620barAutoScroll620
    BiliClient.prefs.v620barAutoScroll620 = !current
    AppToast.show(this, "Bar Auto Scroll620: ${if (!current) "ON" else "OFF"}")
}

// v620: Beacon Auto Ping620
internal fun PlayerActivity.showV620BeaconAutoPing620Toggle() {
    val current = BiliClient.prefs.v620beaconAutoPing620
    BiliClient.prefs.v620beaconAutoPing620 = !current
    AppToast.show(this, "Beacon Auto Ping620: ${if (!current) "ON" else "OFF"}")
}

// v620: Beam Auto Form620
internal fun PlayerActivity.showV620BeamAutoForm620Toggle() {
    val current = BiliClient.prefs.v620beamAutoForm620
    BiliClient.prefs.v620beamAutoForm620 = !current
    AppToast.show(this, "Beam Auto Form620: ${if (!current) "ON" else "OFF"}")
}

// v620: Before Auto Hook620
internal fun PlayerActivity.showV620BeforeAutoHook620Toggle() {
    val current = BiliClient.prefs.v620beforeAutoHook620
    BiliClient.prefs.v620beforeAutoHook620 = !current
    AppToast.show(this, "Before Auto Hook620: ${if (!current) "ON" else "OFF"}")
}

// v620: Begin Auto Init620
internal fun PlayerActivity.showV620BeginAutoInit620Toggle() {
    val current = BiliClient.prefs.v620beginAutoInit620
    BiliClient.prefs.v620beginAutoInit620 = !current
    AppToast.show(this, "Begin Auto Init620: ${if (!current) "ON" else "OFF"}")
}

// v620: Behavior Auto Track620
internal fun PlayerActivity.showV620BehaviorAutoTrack620Toggle() {
    val current = BiliClient.prefs.v620behaviorAutoTrack620
    BiliClient.prefs.v620behaviorAutoTrack620 = !current
    AppToast.show(this, "Behavior Auto Track620: ${if (!current) "ON" else "OFF"}")
}

// v621: Benchmark Auto Run621
internal fun PlayerActivity.showV621BenchmarkAutoRun621Toggle() {
    val current = BiliClient.prefs.v621benchmarkAutoRun621
    BiliClient.prefs.v621benchmarkAutoRun621 = !current
    AppToast.show(this, "Benchmark Auto Run621: ${if (!current) "ON" else "OFF"}")
}

// v621: Beta Auto Update621
internal fun PlayerActivity.showV621BetaAutoUpdate621Toggle() {
    val current = BiliClient.prefs.v621betaAutoUpdate621
    BiliClient.prefs.v621betaAutoUpdate621 = !current
    AppToast.show(this, "Beta Auto Update621: ${if (!current) "ON" else "OFF"}")
}

// v621: Binary Auto Decode621
internal fun PlayerActivity.showV621BinaryAutoDecode621Toggle() {
    val current = BiliClient.prefs.v621binaryAutoDecode621
    BiliClient.prefs.v621binaryAutoDecode621 = !current
    AppToast.show(this, "Binary Auto Decode621: ${if (!current) "ON" else "OFF"}")
}

// v621: Blank Auto Fill621
internal fun PlayerActivity.showV621BlankAutoFill621Toggle() {
    val current = BiliClient.prefs.v621blankAutoFill621
    BiliClient.prefs.v621blankAutoFill621 = !current
    AppToast.show(this, "Blank Auto Fill621: ${if (!current) "ON" else "OFF"}")
}

// v621: Body Auto Parse621
internal fun PlayerActivity.showV621BodyAutoParse621Toggle() {
    val current = BiliClient.prefs.v621bodyAutoParse621
    BiliClient.prefs.v621bodyAutoParse621 = !current
    AppToast.show(this, "Body Auto Parse621: ${if (!current) "ON" else "OFF"}")
}

// v621: Bold Auto Detect621
internal fun PlayerActivity.showV621BoldAutoDetect621Toggle() {
    val current = BiliClient.prefs.v621boldAutoDetect621
    BiliClient.prefs.v621boldAutoDetect621 = !current
    AppToast.show(this, "Bold Auto Detect621: ${if (!current) "ON" else "OFF"}")
}

// v621: Boot Auto Start621
internal fun PlayerActivity.showV621BootAutoStart621Toggle() {
    val current = BiliClient.prefs.v621bootAutoStart621
    BiliClient.prefs.v621bootAutoStart621 = !current
    AppToast.show(this, "Boot Auto Start621: ${if (!current) "ON" else "OFF"}")
}

// v621: Border Auto Draw621
internal fun PlayerActivity.showV621BorderAutoDraw621Toggle() {
    val current = BiliClient.prefs.v621borderAutoDraw621
    BiliClient.prefs.v621borderAutoDraw621 = !current
    AppToast.show(this, "Border Auto Draw621: ${if (!current) "ON" else "OFF"}")
}

// v621: Bottom Auto Nav621
internal fun PlayerActivity.showV621BottomAutoNav621Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v621bottomAutoNav621).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav621",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v621bottomAutoNav621 = value
        AppToast.show(this, "Bottom Auto Nav621: $value")
    }
}

// v621: Bounce Auto Effect621
internal fun PlayerActivity.showV621BounceAutoEffect621Toggle() {
    val current = BiliClient.prefs.v621bounceAutoEffect621
    BiliClient.prefs.v621bounceAutoEffect621 = !current
    AppToast.show(this, "Bounce Auto Effect621: ${if (!current) "ON" else "OFF"}")
}

// v621: Box Auto Shadow621
internal fun PlayerActivity.showV621BoxAutoShadow621Toggle() {
    val current = BiliClient.prefs.v621boxAutoShadow621
    BiliClient.prefs.v621boxAutoShadow621 = !current
    AppToast.show(this, "Box Auto Shadow621: ${if (!current) "ON" else "OFF"}")
}

// v621: Branch Auto Merge621
internal fun PlayerActivity.showV621BranchAutoMerge621Toggle() {
    val current = BiliClient.prefs.v621branchAutoMerge621
    BiliClient.prefs.v621branchAutoMerge621 = !current
    AppToast.show(this, "Branch Auto Merge621: ${if (!current) "ON" else "OFF"}")
}

// v621: Brand Auto Logo621
internal fun PlayerActivity.showV621BrandAutoLogo621Toggle() {
    val current = BiliClient.prefs.v621brandAutoLogo621
    BiliClient.prefs.v621brandAutoLogo621 = !current
    AppToast.show(this, "Brand Auto Logo621: ${if (!current) "ON" else "OFF"}")
}

// v621: Break Auto Resume621
internal fun PlayerActivity.showV621BreakAutoResume621Toggle() {
    val current = BiliClient.prefs.v621breakAutoResume621
    BiliClient.prefs.v621breakAutoResume621 = !current
    AppToast.show(this, "Break Auto Resume621: ${if (!current) "ON" else "OFF"}")
}

// v621: Bridge Auto Connect621
internal fun PlayerActivity.showV621BridgeAutoConnect621Toggle() {
    val current = BiliClient.prefs.v621bridgeAutoConnect621
    BiliClient.prefs.v621bridgeAutoConnect621 = !current
    AppToast.show(this, "Bridge Auto Connect621: ${if (!current) "ON" else "OFF"}")
}

// v622: Benchmark Auto Run622
internal fun PlayerActivity.showV622BenchmarkAutoRun622Toggle() {
    val current = BiliClient.prefs.v622benchmarkAutoRun622
    BiliClient.prefs.v622benchmarkAutoRun622 = !current
    AppToast.show(this, "Benchmark Auto Run622: ${if (!current) "ON" else "OFF"}")
}

// v622: Beta Auto Update622
internal fun PlayerActivity.showV622BetaAutoUpdate622Toggle() {
    val current = BiliClient.prefs.v622betaAutoUpdate622
    BiliClient.prefs.v622betaAutoUpdate622 = !current
    AppToast.show(this, "Beta Auto Update622: ${if (!current) "ON" else "OFF"}")
}

// v622: Binary Auto Decode622
internal fun PlayerActivity.showV622BinaryAutoDecode622Toggle() {
    val current = BiliClient.prefs.v622binaryAutoDecode622
    BiliClient.prefs.v622binaryAutoDecode622 = !current
    AppToast.show(this, "Binary Auto Decode622: ${if (!current) "ON" else "OFF"}")
}

// v622: Blank Auto Fill622
internal fun PlayerActivity.showV622BlankAutoFill622Toggle() {
    val current = BiliClient.prefs.v622blankAutoFill622
    BiliClient.prefs.v622blankAutoFill622 = !current
    AppToast.show(this, "Blank Auto Fill622: ${if (!current) "ON" else "OFF"}")
}

// v622: Body Auto Parse622
internal fun PlayerActivity.showV622BodyAutoParse622Toggle() {
    val current = BiliClient.prefs.v622bodyAutoParse622
    BiliClient.prefs.v622bodyAutoParse622 = !current
    AppToast.show(this, "Body Auto Parse622: ${if (!current) "ON" else "OFF"}")
}

// v622: Bold Auto Detect622
internal fun PlayerActivity.showV622BoldAutoDetect622Toggle() {
    val current = BiliClient.prefs.v622boldAutoDetect622
    BiliClient.prefs.v622boldAutoDetect622 = !current
    AppToast.show(this, "Bold Auto Detect622: ${if (!current) "ON" else "OFF"}")
}

// v622: Boot Auto Start622
internal fun PlayerActivity.showV622BootAutoStart622Toggle() {
    val current = BiliClient.prefs.v622bootAutoStart622
    BiliClient.prefs.v622bootAutoStart622 = !current
    AppToast.show(this, "Boot Auto Start622: ${if (!current) "ON" else "OFF"}")
}

// v622: Border Auto Draw622
internal fun PlayerActivity.showV622BorderAutoDraw622Toggle() {
    val current = BiliClient.prefs.v622borderAutoDraw622
    BiliClient.prefs.v622borderAutoDraw622 = !current
    AppToast.show(this, "Border Auto Draw622: ${if (!current) "ON" else "OFF"}")
}

// v622: Bottom Auto Nav622
internal fun PlayerActivity.showV622BottomAutoNav622Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v622bottomAutoNav622).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav622",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v622bottomAutoNav622 = value
        AppToast.show(this, "Bottom Auto Nav622: $value")
    }
}

// v622: Bounce Auto Effect622
internal fun PlayerActivity.showV622BounceAutoEffect622Toggle() {
    val current = BiliClient.prefs.v622bounceAutoEffect622
    BiliClient.prefs.v622bounceAutoEffect622 = !current
    AppToast.show(this, "Bounce Auto Effect622: ${if (!current) "ON" else "OFF"}")
}

// v622: Box Auto Shadow622
internal fun PlayerActivity.showV622BoxAutoShadow622Toggle() {
    val current = BiliClient.prefs.v622boxAutoShadow622
    BiliClient.prefs.v622boxAutoShadow622 = !current
    AppToast.show(this, "Box Auto Shadow622: ${if (!current) "ON" else "OFF"}")
}

// v622: Branch Auto Merge622
internal fun PlayerActivity.showV622BranchAutoMerge622Toggle() {
    val current = BiliClient.prefs.v622branchAutoMerge622
    BiliClient.prefs.v622branchAutoMerge622 = !current
    AppToast.show(this, "Branch Auto Merge622: ${if (!current) "ON" else "OFF"}")
}

// v622: Brand Auto Logo622
internal fun PlayerActivity.showV622BrandAutoLogo622Toggle() {
    val current = BiliClient.prefs.v622brandAutoLogo622
    BiliClient.prefs.v622brandAutoLogo622 = !current
    AppToast.show(this, "Brand Auto Logo622: ${if (!current) "ON" else "OFF"}")
}

// v622: Break Auto Resume622
internal fun PlayerActivity.showV622BreakAutoResume622Toggle() {
    val current = BiliClient.prefs.v622breakAutoResume622
    BiliClient.prefs.v622breakAutoResume622 = !current
    AppToast.show(this, "Break Auto Resume622: ${if (!current) "ON" else "OFF"}")
}

// v622: Bridge Auto Connect622
internal fun PlayerActivity.showV622BridgeAutoConnect622Toggle() {
    val current = BiliClient.prefs.v622bridgeAutoConnect622
    BiliClient.prefs.v622bridgeAutoConnect622 = !current
    AppToast.show(this, "Bridge Auto Connect622: ${if (!current) "ON" else "OFF"}")
}

// v623: Benchmark Auto Run623
internal fun PlayerActivity.showV623BenchmarkAutoRun623Toggle() {
    val current = BiliClient.prefs.v623benchmarkAutoRun623
    BiliClient.prefs.v623benchmarkAutoRun623 = !current
    AppToast.show(this, "Benchmark Auto Run623: ${if (!current) "ON" else "OFF"}")
}

// v623: Beta Auto Update623
internal fun PlayerActivity.showV623BetaAutoUpdate623Toggle() {
    val current = BiliClient.prefs.v623betaAutoUpdate623
    BiliClient.prefs.v623betaAutoUpdate623 = !current
    AppToast.show(this, "Beta Auto Update623: ${if (!current) "ON" else "OFF"}")
}

// v623: Binary Auto Decode623
internal fun PlayerActivity.showV623BinaryAutoDecode623Toggle() {
    val current = BiliClient.prefs.v623binaryAutoDecode623
    BiliClient.prefs.v623binaryAutoDecode623 = !current
    AppToast.show(this, "Binary Auto Decode623: ${if (!current) "ON" else "OFF"}")
}

// v623: Blank Auto Fill623
internal fun PlayerActivity.showV623BlankAutoFill623Toggle() {
    val current = BiliClient.prefs.v623blankAutoFill623
    BiliClient.prefs.v623blankAutoFill623 = !current
    AppToast.show(this, "Blank Auto Fill623: ${if (!current) "ON" else "OFF"}")
}

// v623: Body Auto Parse623
internal fun PlayerActivity.showV623BodyAutoParse623Toggle() {
    val current = BiliClient.prefs.v623bodyAutoParse623
    BiliClient.prefs.v623bodyAutoParse623 = !current
    AppToast.show(this, "Body Auto Parse623: ${if (!current) "ON" else "OFF"}")
}

// v623: Bold Auto Detect623
internal fun PlayerActivity.showV623BoldAutoDetect623Toggle() {
    val current = BiliClient.prefs.v623boldAutoDetect623
    BiliClient.prefs.v623boldAutoDetect623 = !current
    AppToast.show(this, "Bold Auto Detect623: ${if (!current) "ON" else "OFF"}")
}

// v623: Boot Auto Start623
internal fun PlayerActivity.showV623BootAutoStart623Toggle() {
    val current = BiliClient.prefs.v623bootAutoStart623
    BiliClient.prefs.v623bootAutoStart623 = !current
    AppToast.show(this, "Boot Auto Start623: ${if (!current) "ON" else "OFF"}")
}

// v623: Border Auto Draw623
internal fun PlayerActivity.showV623BorderAutoDraw623Toggle() {
    val current = BiliClient.prefs.v623borderAutoDraw623
    BiliClient.prefs.v623borderAutoDraw623 = !current
    AppToast.show(this, "Border Auto Draw623: ${if (!current) "ON" else "OFF"}")
}

// v623: Bottom Auto Nav623
internal fun PlayerActivity.showV623BottomAutoNav623Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v623bottomAutoNav623).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav623",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v623bottomAutoNav623 = value
        AppToast.show(this, "Bottom Auto Nav623: $value")
    }
}

// v623: Bounce Auto Effect623
internal fun PlayerActivity.showV623BounceAutoEffect623Toggle() {
    val current = BiliClient.prefs.v623bounceAutoEffect623
    BiliClient.prefs.v623bounceAutoEffect623 = !current
    AppToast.show(this, "Bounce Auto Effect623: ${if (!current) "ON" else "OFF"}")
}

// v623: Box Auto Shadow623
internal fun PlayerActivity.showV623BoxAutoShadow623Toggle() {
    val current = BiliClient.prefs.v623boxAutoShadow623
    BiliClient.prefs.v623boxAutoShadow623 = !current
    AppToast.show(this, "Box Auto Shadow623: ${if (!current) "ON" else "OFF"}")
}

// v623: Branch Auto Merge623
internal fun PlayerActivity.showV623BranchAutoMerge623Toggle() {
    val current = BiliClient.prefs.v623branchAutoMerge623
    BiliClient.prefs.v623branchAutoMerge623 = !current
    AppToast.show(this, "Branch Auto Merge623: ${if (!current) "ON" else "OFF"}")
}

// v623: Brand Auto Logo623
internal fun PlayerActivity.showV623BrandAutoLogo623Toggle() {
    val current = BiliClient.prefs.v623brandAutoLogo623
    BiliClient.prefs.v623brandAutoLogo623 = !current
    AppToast.show(this, "Brand Auto Logo623: ${if (!current) "ON" else "OFF"}")
}

// v623: Break Auto Resume623
internal fun PlayerActivity.showV623BreakAutoResume623Toggle() {
    val current = BiliClient.prefs.v623breakAutoResume623
    BiliClient.prefs.v623breakAutoResume623 = !current
    AppToast.show(this, "Break Auto Resume623: ${if (!current) "ON" else "OFF"}")
}

// v623: Bridge Auto Connect623
internal fun PlayerActivity.showV623BridgeAutoConnect623Toggle() {
    val current = BiliClient.prefs.v623bridgeAutoConnect623
    BiliClient.prefs.v623bridgeAutoConnect623 = !current
    AppToast.show(this, "Bridge Auto Connect623: ${if (!current) "ON" else "OFF"}")
}

// v624: Benchmark Auto Run624
internal fun PlayerActivity.showV624BenchmarkAutoRun624Toggle() {
    val current = BiliClient.prefs.v624benchmarkAutoRun624
    BiliClient.prefs.v624benchmarkAutoRun624 = !current
    AppToast.show(this, "Benchmark Auto Run624: ${if (!current) "ON" else "OFF"}")
}

// v624: Beta Auto Update624
internal fun PlayerActivity.showV624BetaAutoUpdate624Toggle() {
    val current = BiliClient.prefs.v624betaAutoUpdate624
    BiliClient.prefs.v624betaAutoUpdate624 = !current
    AppToast.show(this, "Beta Auto Update624: ${if (!current) "ON" else "OFF"}")
}

// v624: Binary Auto Decode624
internal fun PlayerActivity.showV624BinaryAutoDecode624Toggle() {
    val current = BiliClient.prefs.v624binaryAutoDecode624
    BiliClient.prefs.v624binaryAutoDecode624 = !current
    AppToast.show(this, "Binary Auto Decode624: ${if (!current) "ON" else "OFF"}")
}

// v624: Blank Auto Fill624
internal fun PlayerActivity.showV624BlankAutoFill624Toggle() {
    val current = BiliClient.prefs.v624blankAutoFill624
    BiliClient.prefs.v624blankAutoFill624 = !current
    AppToast.show(this, "Blank Auto Fill624: ${if (!current) "ON" else "OFF"}")
}

// v624: Body Auto Parse624
internal fun PlayerActivity.showV624BodyAutoParse624Toggle() {
    val current = BiliClient.prefs.v624bodyAutoParse624
    BiliClient.prefs.v624bodyAutoParse624 = !current
    AppToast.show(this, "Body Auto Parse624: ${if (!current) "ON" else "OFF"}")
}

// v624: Bold Auto Detect624
internal fun PlayerActivity.showV624BoldAutoDetect624Toggle() {
    val current = BiliClient.prefs.v624boldAutoDetect624
    BiliClient.prefs.v624boldAutoDetect624 = !current
    AppToast.show(this, "Bold Auto Detect624: ${if (!current) "ON" else "OFF"}")
}

// v624: Boot Auto Start624
internal fun PlayerActivity.showV624BootAutoStart624Toggle() {
    val current = BiliClient.prefs.v624bootAutoStart624
    BiliClient.prefs.v624bootAutoStart624 = !current
    AppToast.show(this, "Boot Auto Start624: ${if (!current) "ON" else "OFF"}")
}

// v624: Border Auto Draw624
internal fun PlayerActivity.showV624BorderAutoDraw624Toggle() {
    val current = BiliClient.prefs.v624borderAutoDraw624
    BiliClient.prefs.v624borderAutoDraw624 = !current
    AppToast.show(this, "Border Auto Draw624: ${if (!current) "ON" else "OFF"}")
}

// v624: Bottom Auto Nav624
internal fun PlayerActivity.showV624BottomAutoNav624Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v624bottomAutoNav624).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav624",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v624bottomAutoNav624 = value
        AppToast.show(this, "Bottom Auto Nav624: $value")
    }
}

// v624: Bounce Auto Effect624
internal fun PlayerActivity.showV624BounceAutoEffect624Toggle() {
    val current = BiliClient.prefs.v624bounceAutoEffect624
    BiliClient.prefs.v624bounceAutoEffect624 = !current
    AppToast.show(this, "Bounce Auto Effect624: ${if (!current) "ON" else "OFF"}")
}

// v624: Box Auto Shadow624
internal fun PlayerActivity.showV624BoxAutoShadow624Toggle() {
    val current = BiliClient.prefs.v624boxAutoShadow624
    BiliClient.prefs.v624boxAutoShadow624 = !current
    AppToast.show(this, "Box Auto Shadow624: ${if (!current) "ON" else "OFF"}")
}

// v624: Branch Auto Merge624
internal fun PlayerActivity.showV624BranchAutoMerge624Toggle() {
    val current = BiliClient.prefs.v624branchAutoMerge624
    BiliClient.prefs.v624branchAutoMerge624 = !current
    AppToast.show(this, "Branch Auto Merge624: ${if (!current) "ON" else "OFF"}")
}

// v624: Brand Auto Logo624
internal fun PlayerActivity.showV624BrandAutoLogo624Toggle() {
    val current = BiliClient.prefs.v624brandAutoLogo624
    BiliClient.prefs.v624brandAutoLogo624 = !current
    AppToast.show(this, "Brand Auto Logo624: ${if (!current) "ON" else "OFF"}")
}

// v624: Break Auto Resume624
internal fun PlayerActivity.showV624BreakAutoResume624Toggle() {
    val current = BiliClient.prefs.v624breakAutoResume624
    BiliClient.prefs.v624breakAutoResume624 = !current
    AppToast.show(this, "Break Auto Resume624: ${if (!current) "ON" else "OFF"}")
}

// v624: Bridge Auto Connect624
internal fun PlayerActivity.showV624BridgeAutoConnect624Toggle() {
    val current = BiliClient.prefs.v624bridgeAutoConnect624
    BiliClient.prefs.v624bridgeAutoConnect624 = !current
    AppToast.show(this, "Bridge Auto Connect624: ${if (!current) "ON" else "OFF"}")
}

// v625: Benchmark Auto Run625
internal fun PlayerActivity.showV625BenchmarkAutoRun625Toggle() {
    val current = BiliClient.prefs.v625benchmarkAutoRun625
    BiliClient.prefs.v625benchmarkAutoRun625 = !current
    AppToast.show(this, "Benchmark Auto Run625: ${if (!current) "ON" else "OFF"}")
}

// v625: Beta Auto Update625
internal fun PlayerActivity.showV625BetaAutoUpdate625Toggle() {
    val current = BiliClient.prefs.v625betaAutoUpdate625
    BiliClient.prefs.v625betaAutoUpdate625 = !current
    AppToast.show(this, "Beta Auto Update625: ${if (!current) "ON" else "OFF"}")
}

// v625: Binary Auto Decode625
internal fun PlayerActivity.showV625BinaryAutoDecode625Toggle() {
    val current = BiliClient.prefs.v625binaryAutoDecode625
    BiliClient.prefs.v625binaryAutoDecode625 = !current
    AppToast.show(this, "Binary Auto Decode625: ${if (!current) "ON" else "OFF"}")
}

// v625: Blank Auto Fill625
internal fun PlayerActivity.showV625BlankAutoFill625Toggle() {
    val current = BiliClient.prefs.v625blankAutoFill625
    BiliClient.prefs.v625blankAutoFill625 = !current
    AppToast.show(this, "Blank Auto Fill625: ${if (!current) "ON" else "OFF"}")
}

// v625: Body Auto Parse625
internal fun PlayerActivity.showV625BodyAutoParse625Toggle() {
    val current = BiliClient.prefs.v625bodyAutoParse625
    BiliClient.prefs.v625bodyAutoParse625 = !current
    AppToast.show(this, "Body Auto Parse625: ${if (!current) "ON" else "OFF"}")
}

// v625: Bold Auto Detect625
internal fun PlayerActivity.showV625BoldAutoDetect625Toggle() {
    val current = BiliClient.prefs.v625boldAutoDetect625
    BiliClient.prefs.v625boldAutoDetect625 = !current
    AppToast.show(this, "Bold Auto Detect625: ${if (!current) "ON" else "OFF"}")
}

// v625: Boot Auto Start625
internal fun PlayerActivity.showV625BootAutoStart625Toggle() {
    val current = BiliClient.prefs.v625bootAutoStart625
    BiliClient.prefs.v625bootAutoStart625 = !current
    AppToast.show(this, "Boot Auto Start625: ${if (!current) "ON" else "OFF"}")
}

// v625: Border Auto Draw625
internal fun PlayerActivity.showV625BorderAutoDraw625Toggle() {
    val current = BiliClient.prefs.v625borderAutoDraw625
    BiliClient.prefs.v625borderAutoDraw625 = !current
    AppToast.show(this, "Border Auto Draw625: ${if (!current) "ON" else "OFF"}")
}

// v625: Bottom Auto Nav625
internal fun PlayerActivity.showV625BottomAutoNav625Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v625bottomAutoNav625).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav625",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v625bottomAutoNav625 = value
        AppToast.show(this, "Bottom Auto Nav625: $value")
    }
}

// v625: Bounce Auto Effect625
internal fun PlayerActivity.showV625BounceAutoEffect625Toggle() {
    val current = BiliClient.prefs.v625bounceAutoEffect625
    BiliClient.prefs.v625bounceAutoEffect625 = !current
    AppToast.show(this, "Bounce Auto Effect625: ${if (!current) "ON" else "OFF"}")
}

// v625: Box Auto Shadow625
internal fun PlayerActivity.showV625BoxAutoShadow625Toggle() {
    val current = BiliClient.prefs.v625boxAutoShadow625
    BiliClient.prefs.v625boxAutoShadow625 = !current
    AppToast.show(this, "Box Auto Shadow625: ${if (!current) "ON" else "OFF"}")
}

// v625: Branch Auto Merge625
internal fun PlayerActivity.showV625BranchAutoMerge625Toggle() {
    val current = BiliClient.prefs.v625branchAutoMerge625
    BiliClient.prefs.v625branchAutoMerge625 = !current
    AppToast.show(this, "Branch Auto Merge625: ${if (!current) "ON" else "OFF"}")
}

// v625: Brand Auto Logo625
internal fun PlayerActivity.showV625BrandAutoLogo625Toggle() {
    val current = BiliClient.prefs.v625brandAutoLogo625
    BiliClient.prefs.v625brandAutoLogo625 = !current
    AppToast.show(this, "Brand Auto Logo625: ${if (!current) "ON" else "OFF"}")
}

// v625: Break Auto Resume625
internal fun PlayerActivity.showV625BreakAutoResume625Toggle() {
    val current = BiliClient.prefs.v625breakAutoResume625
    BiliClient.prefs.v625breakAutoResume625 = !current
    AppToast.show(this, "Break Auto Resume625: ${if (!current) "ON" else "OFF"}")
}

// v625: Bridge Auto Connect625
internal fun PlayerActivity.showV625BridgeAutoConnect625Toggle() {
    val current = BiliClient.prefs.v625bridgeAutoConnect625
    BiliClient.prefs.v625bridgeAutoConnect625 = !current
    AppToast.show(this, "Bridge Auto Connect625: ${if (!current) "ON" else "OFF"}")
}

// v626: Benchmark Auto Run626
internal fun PlayerActivity.showV626BenchmarkAutoRun626Toggle() {
    val current = BiliClient.prefs.v626benchmarkAutoRun626
    BiliClient.prefs.v626benchmarkAutoRun626 = !current
    AppToast.show(this, "Benchmark Auto Run626: ${if (!current) "ON" else "OFF"}")
}

// v626: Beta Auto Update626
internal fun PlayerActivity.showV626BetaAutoUpdate626Toggle() {
    val current = BiliClient.prefs.v626betaAutoUpdate626
    BiliClient.prefs.v626betaAutoUpdate626 = !current
    AppToast.show(this, "Beta Auto Update626: ${if (!current) "ON" else "OFF"}")
}

// v626: Binary Auto Decode626
internal fun PlayerActivity.showV626BinaryAutoDecode626Toggle() {
    val current = BiliClient.prefs.v626binaryAutoDecode626
    BiliClient.prefs.v626binaryAutoDecode626 = !current
    AppToast.show(this, "Binary Auto Decode626: ${if (!current) "ON" else "OFF"}")
}

// v626: Blank Auto Fill626
internal fun PlayerActivity.showV626BlankAutoFill626Toggle() {
    val current = BiliClient.prefs.v626blankAutoFill626
    BiliClient.prefs.v626blankAutoFill626 = !current
    AppToast.show(this, "Blank Auto Fill626: ${if (!current) "ON" else "OFF"}")
}

// v626: Body Auto Parse626
internal fun PlayerActivity.showV626BodyAutoParse626Toggle() {
    val current = BiliClient.prefs.v626bodyAutoParse626
    BiliClient.prefs.v626bodyAutoParse626 = !current
    AppToast.show(this, "Body Auto Parse626: ${if (!current) "ON" else "OFF"}")
}

// v626: Bold Auto Detect626
internal fun PlayerActivity.showV626BoldAutoDetect626Toggle() {
    val current = BiliClient.prefs.v626boldAutoDetect626
    BiliClient.prefs.v626boldAutoDetect626 = !current
    AppToast.show(this, "Bold Auto Detect626: ${if (!current) "ON" else "OFF"}")
}

// v626: Boot Auto Start626
internal fun PlayerActivity.showV626BootAutoStart626Toggle() {
    val current = BiliClient.prefs.v626bootAutoStart626
    BiliClient.prefs.v626bootAutoStart626 = !current
    AppToast.show(this, "Boot Auto Start626: ${if (!current) "ON" else "OFF"}")
}

// v626: Border Auto Draw626
internal fun PlayerActivity.showV626BorderAutoDraw626Toggle() {
    val current = BiliClient.prefs.v626borderAutoDraw626
    BiliClient.prefs.v626borderAutoDraw626 = !current
    AppToast.show(this, "Border Auto Draw626: ${if (!current) "ON" else "OFF"}")
}

// v626: Bottom Auto Nav626
internal fun PlayerActivity.showV626BottomAutoNav626Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v626bottomAutoNav626).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav626",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v626bottomAutoNav626 = value
        AppToast.show(this, "Bottom Auto Nav626: $value")
    }
}

// v626: Bounce Auto Effect626
internal fun PlayerActivity.showV626BounceAutoEffect626Toggle() {
    val current = BiliClient.prefs.v626bounceAutoEffect626
    BiliClient.prefs.v626bounceAutoEffect626 = !current
    AppToast.show(this, "Bounce Auto Effect626: ${if (!current) "ON" else "OFF"}")
}

// v626: Box Auto Shadow626
internal fun PlayerActivity.showV626BoxAutoShadow626Toggle() {
    val current = BiliClient.prefs.v626boxAutoShadow626
    BiliClient.prefs.v626boxAutoShadow626 = !current
    AppToast.show(this, "Box Auto Shadow626: ${if (!current) "ON" else "OFF"}")
}

// v626: Branch Auto Merge626
internal fun PlayerActivity.showV626BranchAutoMerge626Toggle() {
    val current = BiliClient.prefs.v626branchAutoMerge626
    BiliClient.prefs.v626branchAutoMerge626 = !current
    AppToast.show(this, "Branch Auto Merge626: ${if (!current) "ON" else "OFF"}")
}

// v626: Brand Auto Logo626
internal fun PlayerActivity.showV626BrandAutoLogo626Toggle() {
    val current = BiliClient.prefs.v626brandAutoLogo626
    BiliClient.prefs.v626brandAutoLogo626 = !current
    AppToast.show(this, "Brand Auto Logo626: ${if (!current) "ON" else "OFF"}")
}

// v626: Break Auto Resume626
internal fun PlayerActivity.showV626BreakAutoResume626Toggle() {
    val current = BiliClient.prefs.v626breakAutoResume626
    BiliClient.prefs.v626breakAutoResume626 = !current
    AppToast.show(this, "Break Auto Resume626: ${if (!current) "ON" else "OFF"}")
}

// v626: Bridge Auto Connect626
internal fun PlayerActivity.showV626BridgeAutoConnect626Toggle() {
    val current = BiliClient.prefs.v626bridgeAutoConnect626
    BiliClient.prefs.v626bridgeAutoConnect626 = !current
    AppToast.show(this, "Bridge Auto Connect626: ${if (!current) "ON" else "OFF"}")
}

// v627: Benchmark Auto Run627
internal fun PlayerActivity.showV627BenchmarkAutoRun627Toggle() {
    val current = BiliClient.prefs.v627benchmarkAutoRun627
    BiliClient.prefs.v627benchmarkAutoRun627 = !current
    AppToast.show(this, "Benchmark Auto Run627: ${if (!current) "ON" else "OFF"}")
}

// v627: Beta Auto Update627
internal fun PlayerActivity.showV627BetaAutoUpdate627Toggle() {
    val current = BiliClient.prefs.v627betaAutoUpdate627
    BiliClient.prefs.v627betaAutoUpdate627 = !current
    AppToast.show(this, "Beta Auto Update627: ${if (!current) "ON" else "OFF"}")
}

// v627: Binary Auto Decode627
internal fun PlayerActivity.showV627BinaryAutoDecode627Toggle() {
    val current = BiliClient.prefs.v627binaryAutoDecode627
    BiliClient.prefs.v627binaryAutoDecode627 = !current
    AppToast.show(this, "Binary Auto Decode627: ${if (!current) "ON" else "OFF"}")
}

// v627: Blank Auto Fill627
internal fun PlayerActivity.showV627BlankAutoFill627Toggle() {
    val current = BiliClient.prefs.v627blankAutoFill627
    BiliClient.prefs.v627blankAutoFill627 = !current
    AppToast.show(this, "Blank Auto Fill627: ${if (!current) "ON" else "OFF"}")
}

// v627: Body Auto Parse627
internal fun PlayerActivity.showV627BodyAutoParse627Toggle() {
    val current = BiliClient.prefs.v627bodyAutoParse627
    BiliClient.prefs.v627bodyAutoParse627 = !current
    AppToast.show(this, "Body Auto Parse627: ${if (!current) "ON" else "OFF"}")
}

// v627: Bold Auto Detect627
internal fun PlayerActivity.showV627BoldAutoDetect627Toggle() {
    val current = BiliClient.prefs.v627boldAutoDetect627
    BiliClient.prefs.v627boldAutoDetect627 = !current
    AppToast.show(this, "Bold Auto Detect627: ${if (!current) "ON" else "OFF"}")
}

// v627: Boot Auto Start627
internal fun PlayerActivity.showV627BootAutoStart627Toggle() {
    val current = BiliClient.prefs.v627bootAutoStart627
    BiliClient.prefs.v627bootAutoStart627 = !current
    AppToast.show(this, "Boot Auto Start627: ${if (!current) "ON" else "OFF"}")
}

// v627: Border Auto Draw627
internal fun PlayerActivity.showV627BorderAutoDraw627Toggle() {
    val current = BiliClient.prefs.v627borderAutoDraw627
    BiliClient.prefs.v627borderAutoDraw627 = !current
    AppToast.show(this, "Border Auto Draw627: ${if (!current) "ON" else "OFF"}")
}

// v627: Bottom Auto Nav627
internal fun PlayerActivity.showV627BottomAutoNav627Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v627bottomAutoNav627).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav627",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v627bottomAutoNav627 = value
        AppToast.show(this, "Bottom Auto Nav627: $value")
    }
}

// v627: Bounce Auto Effect627
internal fun PlayerActivity.showV627BounceAutoEffect627Toggle() {
    val current = BiliClient.prefs.v627bounceAutoEffect627
    BiliClient.prefs.v627bounceAutoEffect627 = !current
    AppToast.show(this, "Bounce Auto Effect627: ${if (!current) "ON" else "OFF"}")
}

// v627: Box Auto Shadow627
internal fun PlayerActivity.showV627BoxAutoShadow627Toggle() {
    val current = BiliClient.prefs.v627boxAutoShadow627
    BiliClient.prefs.v627boxAutoShadow627 = !current
    AppToast.show(this, "Box Auto Shadow627: ${if (!current) "ON" else "OFF"}")
}

// v627: Branch Auto Merge627
internal fun PlayerActivity.showV627BranchAutoMerge627Toggle() {
    val current = BiliClient.prefs.v627branchAutoMerge627
    BiliClient.prefs.v627branchAutoMerge627 = !current
    AppToast.show(this, "Branch Auto Merge627: ${if (!current) "ON" else "OFF"}")
}

// v627: Brand Auto Logo627
internal fun PlayerActivity.showV627BrandAutoLogo627Toggle() {
    val current = BiliClient.prefs.v627brandAutoLogo627
    BiliClient.prefs.v627brandAutoLogo627 = !current
    AppToast.show(this, "Brand Auto Logo627: ${if (!current) "ON" else "OFF"}")
}

// v627: Break Auto Resume627
internal fun PlayerActivity.showV627BreakAutoResume627Toggle() {
    val current = BiliClient.prefs.v627breakAutoResume627
    BiliClient.prefs.v627breakAutoResume627 = !current
    AppToast.show(this, "Break Auto Resume627: ${if (!current) "ON" else "OFF"}")
}

// v627: Bridge Auto Connect627
internal fun PlayerActivity.showV627BridgeAutoConnect627Toggle() {
    val current = BiliClient.prefs.v627bridgeAutoConnect627
    BiliClient.prefs.v627bridgeAutoConnect627 = !current
    AppToast.show(this, "Bridge Auto Connect627: ${if (!current) "ON" else "OFF"}")
}

// v628: Benchmark Auto Run628
internal fun PlayerActivity.showV628BenchmarkAutoRun628Toggle() {
    val current = BiliClient.prefs.v628benchmarkAutoRun628
    BiliClient.prefs.v628benchmarkAutoRun628 = !current
    AppToast.show(this, "Benchmark Auto Run628: ${if (!current) "ON" else "OFF"}")
}

// v628: Beta Auto Update628
internal fun PlayerActivity.showV628BetaAutoUpdate628Toggle() {
    val current = BiliClient.prefs.v628betaAutoUpdate628
    BiliClient.prefs.v628betaAutoUpdate628 = !current
    AppToast.show(this, "Beta Auto Update628: ${if (!current) "ON" else "OFF"}")
}

// v628: Binary Auto Decode628
internal fun PlayerActivity.showV628BinaryAutoDecode628Toggle() {
    val current = BiliClient.prefs.v628binaryAutoDecode628
    BiliClient.prefs.v628binaryAutoDecode628 = !current
    AppToast.show(this, "Binary Auto Decode628: ${if (!current) "ON" else "OFF"}")
}

// v628: Blank Auto Fill628
internal fun PlayerActivity.showV628BlankAutoFill628Toggle() {
    val current = BiliClient.prefs.v628blankAutoFill628
    BiliClient.prefs.v628blankAutoFill628 = !current
    AppToast.show(this, "Blank Auto Fill628: ${if (!current) "ON" else "OFF"}")
}

// v628: Body Auto Parse628
internal fun PlayerActivity.showV628BodyAutoParse628Toggle() {
    val current = BiliClient.prefs.v628bodyAutoParse628
    BiliClient.prefs.v628bodyAutoParse628 = !current
    AppToast.show(this, "Body Auto Parse628: ${if (!current) "ON" else "OFF"}")
}

// v628: Bold Auto Detect628
internal fun PlayerActivity.showV628BoldAutoDetect628Toggle() {
    val current = BiliClient.prefs.v628boldAutoDetect628
    BiliClient.prefs.v628boldAutoDetect628 = !current
    AppToast.show(this, "Bold Auto Detect628: ${if (!current) "ON" else "OFF"}")
}

// v628: Boot Auto Start628
internal fun PlayerActivity.showV628BootAutoStart628Toggle() {
    val current = BiliClient.prefs.v628bootAutoStart628
    BiliClient.prefs.v628bootAutoStart628 = !current
    AppToast.show(this, "Boot Auto Start628: ${if (!current) "ON" else "OFF"}")
}

// v628: Border Auto Draw628
internal fun PlayerActivity.showV628BorderAutoDraw628Toggle() {
    val current = BiliClient.prefs.v628borderAutoDraw628
    BiliClient.prefs.v628borderAutoDraw628 = !current
    AppToast.show(this, "Border Auto Draw628: ${if (!current) "ON" else "OFF"}")
}

// v628: Bottom Auto Nav628
internal fun PlayerActivity.showV628BottomAutoNav628Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v628bottomAutoNav628).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav628",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v628bottomAutoNav628 = value
        AppToast.show(this, "Bottom Auto Nav628: $value")
    }
}

// v628: Bounce Auto Effect628
internal fun PlayerActivity.showV628BounceAutoEffect628Toggle() {
    val current = BiliClient.prefs.v628bounceAutoEffect628
    BiliClient.prefs.v628bounceAutoEffect628 = !current
    AppToast.show(this, "Bounce Auto Effect628: ${if (!current) "ON" else "OFF"}")
}

// v628: Box Auto Shadow628
internal fun PlayerActivity.showV628BoxAutoShadow628Toggle() {
    val current = BiliClient.prefs.v628boxAutoShadow628
    BiliClient.prefs.v628boxAutoShadow628 = !current
    AppToast.show(this, "Box Auto Shadow628: ${if (!current) "ON" else "OFF"}")
}

// v628: Branch Auto Merge628
internal fun PlayerActivity.showV628BranchAutoMerge628Toggle() {
    val current = BiliClient.prefs.v628branchAutoMerge628
    BiliClient.prefs.v628branchAutoMerge628 = !current
    AppToast.show(this, "Branch Auto Merge628: ${if (!current) "ON" else "OFF"}")
}

// v628: Brand Auto Logo628
internal fun PlayerActivity.showV628BrandAutoLogo628Toggle() {
    val current = BiliClient.prefs.v628brandAutoLogo628
    BiliClient.prefs.v628brandAutoLogo628 = !current
    AppToast.show(this, "Brand Auto Logo628: ${if (!current) "ON" else "OFF"}")
}

// v628: Break Auto Resume628
internal fun PlayerActivity.showV628BreakAutoResume628Toggle() {
    val current = BiliClient.prefs.v628breakAutoResume628
    BiliClient.prefs.v628breakAutoResume628 = !current
    AppToast.show(this, "Break Auto Resume628: ${if (!current) "ON" else "OFF"}")
}

// v628: Bridge Auto Connect628
internal fun PlayerActivity.showV628BridgeAutoConnect628Toggle() {
    val current = BiliClient.prefs.v628bridgeAutoConnect628
    BiliClient.prefs.v628bridgeAutoConnect628 = !current
    AppToast.show(this, "Bridge Auto Connect628: ${if (!current) "ON" else "OFF"}")
}

// v629: Benchmark Auto Run629
internal fun PlayerActivity.showV629BenchmarkAutoRun629Toggle() {
    val current = BiliClient.prefs.v629benchmarkAutoRun629
    BiliClient.prefs.v629benchmarkAutoRun629 = !current
    AppToast.show(this, "Benchmark Auto Run629: ${if (!current) "ON" else "OFF"}")
}

// v629: Beta Auto Update629
internal fun PlayerActivity.showV629BetaAutoUpdate629Toggle() {
    val current = BiliClient.prefs.v629betaAutoUpdate629
    BiliClient.prefs.v629betaAutoUpdate629 = !current
    AppToast.show(this, "Beta Auto Update629: ${if (!current) "ON" else "OFF"}")
}

// v629: Binary Auto Decode629
internal fun PlayerActivity.showV629BinaryAutoDecode629Toggle() {
    val current = BiliClient.prefs.v629binaryAutoDecode629
    BiliClient.prefs.v629binaryAutoDecode629 = !current
    AppToast.show(this, "Binary Auto Decode629: ${if (!current) "ON" else "OFF"}")
}

// v629: Blank Auto Fill629
internal fun PlayerActivity.showV629BlankAutoFill629Toggle() {
    val current = BiliClient.prefs.v629blankAutoFill629
    BiliClient.prefs.v629blankAutoFill629 = !current
    AppToast.show(this, "Blank Auto Fill629: ${if (!current) "ON" else "OFF"}")
}

// v629: Body Auto Parse629
internal fun PlayerActivity.showV629BodyAutoParse629Toggle() {
    val current = BiliClient.prefs.v629bodyAutoParse629
    BiliClient.prefs.v629bodyAutoParse629 = !current
    AppToast.show(this, "Body Auto Parse629: ${if (!current) "ON" else "OFF"}")
}

// v629: Bold Auto Detect629
internal fun PlayerActivity.showV629BoldAutoDetect629Toggle() {
    val current = BiliClient.prefs.v629boldAutoDetect629
    BiliClient.prefs.v629boldAutoDetect629 = !current
    AppToast.show(this, "Bold Auto Detect629: ${if (!current) "ON" else "OFF"}")
}

// v629: Boot Auto Start629
internal fun PlayerActivity.showV629BootAutoStart629Toggle() {
    val current = BiliClient.prefs.v629bootAutoStart629
    BiliClient.prefs.v629bootAutoStart629 = !current
    AppToast.show(this, "Boot Auto Start629: ${if (!current) "ON" else "OFF"}")
}

// v629: Border Auto Draw629
internal fun PlayerActivity.showV629BorderAutoDraw629Toggle() {
    val current = BiliClient.prefs.v629borderAutoDraw629
    BiliClient.prefs.v629borderAutoDraw629 = !current
    AppToast.show(this, "Border Auto Draw629: ${if (!current) "ON" else "OFF"}")
}

// v629: Bottom Auto Nav629
internal fun PlayerActivity.showV629BottomAutoNav629Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v629bottomAutoNav629).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav629",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v629bottomAutoNav629 = value
        AppToast.show(this, "Bottom Auto Nav629: $value")
    }
}

// v629: Bounce Auto Effect629
internal fun PlayerActivity.showV629BounceAutoEffect629Toggle() {
    val current = BiliClient.prefs.v629bounceAutoEffect629
    BiliClient.prefs.v629bounceAutoEffect629 = !current
    AppToast.show(this, "Bounce Auto Effect629: ${if (!current) "ON" else "OFF"}")
}

// v629: Box Auto Shadow629
internal fun PlayerActivity.showV629BoxAutoShadow629Toggle() {
    val current = BiliClient.prefs.v629boxAutoShadow629
    BiliClient.prefs.v629boxAutoShadow629 = !current
    AppToast.show(this, "Box Auto Shadow629: ${if (!current) "ON" else "OFF"}")
}

// v629: Branch Auto Merge629
internal fun PlayerActivity.showV629BranchAutoMerge629Toggle() {
    val current = BiliClient.prefs.v629branchAutoMerge629
    BiliClient.prefs.v629branchAutoMerge629 = !current
    AppToast.show(this, "Branch Auto Merge629: ${if (!current) "ON" else "OFF"}")
}

// v629: Brand Auto Logo629
internal fun PlayerActivity.showV629BrandAutoLogo629Toggle() {
    val current = BiliClient.prefs.v629brandAutoLogo629
    BiliClient.prefs.v629brandAutoLogo629 = !current
    AppToast.show(this, "Brand Auto Logo629: ${if (!current) "ON" else "OFF"}")
}

// v629: Break Auto Resume629
internal fun PlayerActivity.showV629BreakAutoResume629Toggle() {
    val current = BiliClient.prefs.v629breakAutoResume629
    BiliClient.prefs.v629breakAutoResume629 = !current
    AppToast.show(this, "Break Auto Resume629: ${if (!current) "ON" else "OFF"}")
}

// v629: Bridge Auto Connect629
internal fun PlayerActivity.showV629BridgeAutoConnect629Toggle() {
    val current = BiliClient.prefs.v629bridgeAutoConnect629
    BiliClient.prefs.v629bridgeAutoConnect629 = !current
    AppToast.show(this, "Bridge Auto Connect629: ${if (!current) "ON" else "OFF"}")
}

// v630: Benchmark Auto Run630
internal fun PlayerActivity.showV630BenchmarkAutoRun630Toggle() {
    val current = BiliClient.prefs.v630benchmarkAutoRun630
    BiliClient.prefs.v630benchmarkAutoRun630 = !current
    AppToast.show(this, "Benchmark Auto Run630: ${if (!current) "ON" else "OFF"}")
}

// v630: Beta Auto Update630
internal fun PlayerActivity.showV630BetaAutoUpdate630Toggle() {
    val current = BiliClient.prefs.v630betaAutoUpdate630
    BiliClient.prefs.v630betaAutoUpdate630 = !current
    AppToast.show(this, "Beta Auto Update630: ${if (!current) "ON" else "OFF"}")
}

// v630: Binary Auto Decode630
internal fun PlayerActivity.showV630BinaryAutoDecode630Toggle() {
    val current = BiliClient.prefs.v630binaryAutoDecode630
    BiliClient.prefs.v630binaryAutoDecode630 = !current
    AppToast.show(this, "Binary Auto Decode630: ${if (!current) "ON" else "OFF"}")
}

// v630: Blank Auto Fill630
internal fun PlayerActivity.showV630BlankAutoFill630Toggle() {
    val current = BiliClient.prefs.v630blankAutoFill630
    BiliClient.prefs.v630blankAutoFill630 = !current
    AppToast.show(this, "Blank Auto Fill630: ${if (!current) "ON" else "OFF"}")
}

// v630: Body Auto Parse630
internal fun PlayerActivity.showV630BodyAutoParse630Toggle() {
    val current = BiliClient.prefs.v630bodyAutoParse630
    BiliClient.prefs.v630bodyAutoParse630 = !current
    AppToast.show(this, "Body Auto Parse630: ${if (!current) "ON" else "OFF"}")
}

// v630: Bold Auto Detect630
internal fun PlayerActivity.showV630BoldAutoDetect630Toggle() {
    val current = BiliClient.prefs.v630boldAutoDetect630
    BiliClient.prefs.v630boldAutoDetect630 = !current
    AppToast.show(this, "Bold Auto Detect630: ${if (!current) "ON" else "OFF"}")
}

// v630: Boot Auto Start630
internal fun PlayerActivity.showV630BootAutoStart630Toggle() {
    val current = BiliClient.prefs.v630bootAutoStart630
    BiliClient.prefs.v630bootAutoStart630 = !current
    AppToast.show(this, "Boot Auto Start630: ${if (!current) "ON" else "OFF"}")
}

// v630: Border Auto Draw630
internal fun PlayerActivity.showV630BorderAutoDraw630Toggle() {
    val current = BiliClient.prefs.v630borderAutoDraw630
    BiliClient.prefs.v630borderAutoDraw630 = !current
    AppToast.show(this, "Border Auto Draw630: ${if (!current) "ON" else "OFF"}")
}

// v630: Bottom Auto Nav630
internal fun PlayerActivity.showV630BottomAutoNav630Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v630bottomAutoNav630).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav630",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v630bottomAutoNav630 = value
        AppToast.show(this, "Bottom Auto Nav630: $value")
    }
}

// v630: Bounce Auto Effect630
internal fun PlayerActivity.showV630BounceAutoEffect630Toggle() {
    val current = BiliClient.prefs.v630bounceAutoEffect630
    BiliClient.prefs.v630bounceAutoEffect630 = !current
    AppToast.show(this, "Bounce Auto Effect630: ${if (!current) "ON" else "OFF"}")
}

// v630: Box Auto Shadow630
internal fun PlayerActivity.showV630BoxAutoShadow630Toggle() {
    val current = BiliClient.prefs.v630boxAutoShadow630
    BiliClient.prefs.v630boxAutoShadow630 = !current
    AppToast.show(this, "Box Auto Shadow630: ${if (!current) "ON" else "OFF"}")
}

// v630: Branch Auto Merge630
internal fun PlayerActivity.showV630BranchAutoMerge630Toggle() {
    val current = BiliClient.prefs.v630branchAutoMerge630
    BiliClient.prefs.v630branchAutoMerge630 = !current
    AppToast.show(this, "Branch Auto Merge630: ${if (!current) "ON" else "OFF"}")
}

// v630: Brand Auto Logo630
internal fun PlayerActivity.showV630BrandAutoLogo630Toggle() {
    val current = BiliClient.prefs.v630brandAutoLogo630
    BiliClient.prefs.v630brandAutoLogo630 = !current
    AppToast.show(this, "Brand Auto Logo630: ${if (!current) "ON" else "OFF"}")
}

// v630: Break Auto Resume630
internal fun PlayerActivity.showV630BreakAutoResume630Toggle() {
    val current = BiliClient.prefs.v630breakAutoResume630
    BiliClient.prefs.v630breakAutoResume630 = !current
    AppToast.show(this, "Break Auto Resume630: ${if (!current) "ON" else "OFF"}")
}

// v630: Bridge Auto Connect630
internal fun PlayerActivity.showV630BridgeAutoConnect630Toggle() {
    val current = BiliClient.prefs.v630bridgeAutoConnect630
    BiliClient.prefs.v630bridgeAutoConnect630 = !current
    AppToast.show(this, "Bridge Auto Connect630: ${if (!current) "ON" else "OFF"}")
}

// v631: Browse Auto History631
internal fun PlayerActivity.showV631BrowseAutoHistory631Toggle() {
    val current = BiliClient.prefs.v631browseAutoHistory631
    BiliClient.prefs.v631browseAutoHistory631 = !current
    AppToast.show(this, "Browse Auto History631: ${if (!current) "ON" else "OFF"}")
}

// v631: Bucket Auto Clean631
internal fun PlayerActivity.showV631BucketAutoClean631Toggle() {
    val current = BiliClient.prefs.v631bucketAutoClean631
    BiliClient.prefs.v631bucketAutoClean631 = !current
    AppToast.show(this, "Bucket Auto Clean631: ${if (!current) "ON" else "OFF"}")
}

// v631: Build Auto Version631
internal fun PlayerActivity.showV631BuildAutoVersion631Toggle() {
    val current = BiliClient.prefs.v631buildAutoVersion631
    BiliClient.prefs.v631buildAutoVersion631 = !current
    AppToast.show(this, "Build Auto Version631: ${if (!current) "ON" else "OFF"}")
}

// v631: Bulk Auto Import631
internal fun PlayerActivity.showV631BulkAutoImport631Toggle() {
    val current = BiliClient.prefs.v631bulkAutoImport631
    BiliClient.prefs.v631bulkAutoImport631 = !current
    AppToast.show(this, "Bulk Auto Import631: ${if (!current) "ON" else "OFF"}")
}

// v631: Button Auto Haptic631
internal fun PlayerActivity.showV631ButtonAutoHaptic631Toggle() {
    val current = BiliClient.prefs.v631buttonAutoHaptic631
    BiliClient.prefs.v631buttonAutoHaptic631 = !current
    AppToast.show(this, "Button Auto Haptic631: ${if (!current) "ON" else "OFF"}")
}

// v631: Byte Auto Convert631
internal fun PlayerActivity.showV631ByteAutoConvert631Toggle() {
    val current = BiliClient.prefs.v631byteAutoConvert631
    BiliClient.prefs.v631byteAutoConvert631 = !current
    AppToast.show(this, "Byte Auto Convert631: ${if (!current) "ON" else "OFF"}")
}

// v631: Calibrate Auto Color631
internal fun PlayerActivity.showV631CalibrateAutoColor631Toggle() {
    val current = BiliClient.prefs.v631calibrateAutoColor631
    BiliClient.prefs.v631calibrateAutoColor631 = !current
    AppToast.show(this, "Calibrate Auto Color631: ${if (!current) "ON" else "OFF"}")
}

// v631: Call Auto Log631
internal fun PlayerActivity.showV631CallAutoLog631Toggle() {
    val current = BiliClient.prefs.v631callAutoLog631
    BiliClient.prefs.v631callAutoLog631 = !current
    AppToast.show(this, "Call Auto Log631: ${if (!current) "ON" else "OFF"}")
}

// v631: Camera Auto Focus631
internal fun PlayerActivity.showV631CameraAutoFocus631Toggle() {
    val current = BiliClient.prefs.v631cameraAutoFocus631
    BiliClient.prefs.v631cameraAutoFocus631 = !current
    AppToast.show(this, "Camera Auto Focus631: ${if (!current) "ON" else "OFF"}")
}

// v631: Campus Auto Select631
internal fun PlayerActivity.showV631CampusAutoSelect631Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v631campusAutoSelect631).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select631",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v631campusAutoSelect631 = value
        AppToast.show(this, "Campus Auto Select631: $value")
    }
}

// v631: Cancel Auto Undo631
internal fun PlayerActivity.showV631CancelAutoUndo631Toggle() {
    val current = BiliClient.prefs.v631cancelAutoUndo631
    BiliClient.prefs.v631cancelAutoUndo631 = !current
    AppToast.show(this, "Cancel Auto Undo631: ${if (!current) "ON" else "OFF"}")
}

// v631: Capture Auto Mode631
internal fun PlayerActivity.showV631CaptureAutoMode631Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v631captureAutoMode631).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode631",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v631captureAutoMode631 = value
        AppToast.show(this, "Capture Auto Mode631: $value")
    }
}

// v631: Caret Auto Blink631
internal fun PlayerActivity.showV631CaretAutoBlink631Toggle() {
    val current = BiliClient.prefs.v631caretAutoBlink631
    BiliClient.prefs.v631caretAutoBlink631 = !current
    AppToast.show(this, "Caret Auto Blink631: ${if (!current) "ON" else "OFF"}")
}

// v631: Case Auto Convert631
internal fun PlayerActivity.showV631CaseAutoConvert631Toggle() {
    val current = BiliClient.prefs.v631caseAutoConvert631
    BiliClient.prefs.v631caseAutoConvert631 = !current
    AppToast.show(this, "Case Auto Convert631: ${if (!current) "ON" else "OFF"}")
}

// v631: Category Auto Sort631
internal fun PlayerActivity.showV631CategoryAutoSort631Toggle() {
    val current = BiliClient.prefs.v631categoryAutoSort631
    BiliClient.prefs.v631categoryAutoSort631 = !current
    AppToast.show(this, "Category Auto Sort631: ${if (!current) "ON" else "OFF"}")
}

// v632: Browse Auto History632
internal fun PlayerActivity.showV632BrowseAutoHistory632Toggle() {
    val current = BiliClient.prefs.v632browseAutoHistory632
    BiliClient.prefs.v632browseAutoHistory632 = !current
    AppToast.show(this, "Browse Auto History632: ${if (!current) "ON" else "OFF"}")
}

// v632: Bucket Auto Clean632
internal fun PlayerActivity.showV632BucketAutoClean632Toggle() {
    val current = BiliClient.prefs.v632bucketAutoClean632
    BiliClient.prefs.v632bucketAutoClean632 = !current
    AppToast.show(this, "Bucket Auto Clean632: ${if (!current) "ON" else "OFF"}")
}

// v632: Build Auto Version632
internal fun PlayerActivity.showV632BuildAutoVersion632Toggle() {
    val current = BiliClient.prefs.v632buildAutoVersion632
    BiliClient.prefs.v632buildAutoVersion632 = !current
    AppToast.show(this, "Build Auto Version632: ${if (!current) "ON" else "OFF"}")
}

// v632: Bulk Auto Import632
internal fun PlayerActivity.showV632BulkAutoImport632Toggle() {
    val current = BiliClient.prefs.v632bulkAutoImport632
    BiliClient.prefs.v632bulkAutoImport632 = !current
    AppToast.show(this, "Bulk Auto Import632: ${if (!current) "ON" else "OFF"}")
}

// v632: Button Auto Haptic632
internal fun PlayerActivity.showV632ButtonAutoHaptic632Toggle() {
    val current = BiliClient.prefs.v632buttonAutoHaptic632
    BiliClient.prefs.v632buttonAutoHaptic632 = !current
    AppToast.show(this, "Button Auto Haptic632: ${if (!current) "ON" else "OFF"}")
}

// v632: Byte Auto Convert632
internal fun PlayerActivity.showV632ByteAutoConvert632Toggle() {
    val current = BiliClient.prefs.v632byteAutoConvert632
    BiliClient.prefs.v632byteAutoConvert632 = !current
    AppToast.show(this, "Byte Auto Convert632: ${if (!current) "ON" else "OFF"}")
}

// v632: Calibrate Auto Color632
internal fun PlayerActivity.showV632CalibrateAutoColor632Toggle() {
    val current = BiliClient.prefs.v632calibrateAutoColor632
    BiliClient.prefs.v632calibrateAutoColor632 = !current
    AppToast.show(this, "Calibrate Auto Color632: ${if (!current) "ON" else "OFF"}")
}

// v632: Call Auto Log632
internal fun PlayerActivity.showV632CallAutoLog632Toggle() {
    val current = BiliClient.prefs.v632callAutoLog632
    BiliClient.prefs.v632callAutoLog632 = !current
    AppToast.show(this, "Call Auto Log632: ${if (!current) "ON" else "OFF"}")
}

// v632: Camera Auto Focus632
internal fun PlayerActivity.showV632CameraAutoFocus632Toggle() {
    val current = BiliClient.prefs.v632cameraAutoFocus632
    BiliClient.prefs.v632cameraAutoFocus632 = !current
    AppToast.show(this, "Camera Auto Focus632: ${if (!current) "ON" else "OFF"}")
}

// v632: Campus Auto Select632
internal fun PlayerActivity.showV632CampusAutoSelect632Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v632campusAutoSelect632).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select632",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v632campusAutoSelect632 = value
        AppToast.show(this, "Campus Auto Select632: $value")
    }
}

// v632: Cancel Auto Undo632
internal fun PlayerActivity.showV632CancelAutoUndo632Toggle() {
    val current = BiliClient.prefs.v632cancelAutoUndo632
    BiliClient.prefs.v632cancelAutoUndo632 = !current
    AppToast.show(this, "Cancel Auto Undo632: ${if (!current) "ON" else "OFF"}")
}

// v632: Capture Auto Mode632
internal fun PlayerActivity.showV632CaptureAutoMode632Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v632captureAutoMode632).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode632",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v632captureAutoMode632 = value
        AppToast.show(this, "Capture Auto Mode632: $value")
    }
}

// v632: Caret Auto Blink632
internal fun PlayerActivity.showV632CaretAutoBlink632Toggle() {
    val current = BiliClient.prefs.v632caretAutoBlink632
    BiliClient.prefs.v632caretAutoBlink632 = !current
    AppToast.show(this, "Caret Auto Blink632: ${if (!current) "ON" else "OFF"}")
}

// v632: Case Auto Convert632
internal fun PlayerActivity.showV632CaseAutoConvert632Toggle() {
    val current = BiliClient.prefs.v632caseAutoConvert632
    BiliClient.prefs.v632caseAutoConvert632 = !current
    AppToast.show(this, "Case Auto Convert632: ${if (!current) "ON" else "OFF"}")
}

// v632: Category Auto Sort632
internal fun PlayerActivity.showV632CategoryAutoSort632Toggle() {
    val current = BiliClient.prefs.v632categoryAutoSort632
    BiliClient.prefs.v632categoryAutoSort632 = !current
    AppToast.show(this, "Category Auto Sort632: ${if (!current) "ON" else "OFF"}")
}

// v633: Browse Auto History633
internal fun PlayerActivity.showV633BrowseAutoHistory633Toggle() {
    val current = BiliClient.prefs.v633browseAutoHistory633
    BiliClient.prefs.v633browseAutoHistory633 = !current
    AppToast.show(this, "Browse Auto History633: ${if (!current) "ON" else "OFF"}")
}

// v633: Bucket Auto Clean633
internal fun PlayerActivity.showV633BucketAutoClean633Toggle() {
    val current = BiliClient.prefs.v633bucketAutoClean633
    BiliClient.prefs.v633bucketAutoClean633 = !current
    AppToast.show(this, "Bucket Auto Clean633: ${if (!current) "ON" else "OFF"}")
}

// v633: Build Auto Version633
internal fun PlayerActivity.showV633BuildAutoVersion633Toggle() {
    val current = BiliClient.prefs.v633buildAutoVersion633
    BiliClient.prefs.v633buildAutoVersion633 = !current
    AppToast.show(this, "Build Auto Version633: ${if (!current) "ON" else "OFF"}")
}

// v633: Bulk Auto Import633
internal fun PlayerActivity.showV633BulkAutoImport633Toggle() {
    val current = BiliClient.prefs.v633bulkAutoImport633
    BiliClient.prefs.v633bulkAutoImport633 = !current
    AppToast.show(this, "Bulk Auto Import633: ${if (!current) "ON" else "OFF"}")
}

// v633: Button Auto Haptic633
internal fun PlayerActivity.showV633ButtonAutoHaptic633Toggle() {
    val current = BiliClient.prefs.v633buttonAutoHaptic633
    BiliClient.prefs.v633buttonAutoHaptic633 = !current
    AppToast.show(this, "Button Auto Haptic633: ${if (!current) "ON" else "OFF"}")
}

// v633: Byte Auto Convert633
internal fun PlayerActivity.showV633ByteAutoConvert633Toggle() {
    val current = BiliClient.prefs.v633byteAutoConvert633
    BiliClient.prefs.v633byteAutoConvert633 = !current
    AppToast.show(this, "Byte Auto Convert633: ${if (!current) "ON" else "OFF"}")
}

// v633: Calibrate Auto Color633
internal fun PlayerActivity.showV633CalibrateAutoColor633Toggle() {
    val current = BiliClient.prefs.v633calibrateAutoColor633
    BiliClient.prefs.v633calibrateAutoColor633 = !current
    AppToast.show(this, "Calibrate Auto Color633: ${if (!current) "ON" else "OFF"}")
}

// v633: Call Auto Log633
internal fun PlayerActivity.showV633CallAutoLog633Toggle() {
    val current = BiliClient.prefs.v633callAutoLog633
    BiliClient.prefs.v633callAutoLog633 = !current
    AppToast.show(this, "Call Auto Log633: ${if (!current) "ON" else "OFF"}")
}

// v633: Camera Auto Focus633
internal fun PlayerActivity.showV633CameraAutoFocus633Toggle() {
    val current = BiliClient.prefs.v633cameraAutoFocus633
    BiliClient.prefs.v633cameraAutoFocus633 = !current
    AppToast.show(this, "Camera Auto Focus633: ${if (!current) "ON" else "OFF"}")
}

// v633: Campus Auto Select633
internal fun PlayerActivity.showV633CampusAutoSelect633Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v633campusAutoSelect633).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select633",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v633campusAutoSelect633 = value
        AppToast.show(this, "Campus Auto Select633: $value")
    }
}

// v633: Cancel Auto Undo633
internal fun PlayerActivity.showV633CancelAutoUndo633Toggle() {
    val current = BiliClient.prefs.v633cancelAutoUndo633
    BiliClient.prefs.v633cancelAutoUndo633 = !current
    AppToast.show(this, "Cancel Auto Undo633: ${if (!current) "ON" else "OFF"}")
}

// v633: Capture Auto Mode633
internal fun PlayerActivity.showV633CaptureAutoMode633Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v633captureAutoMode633).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode633",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v633captureAutoMode633 = value
        AppToast.show(this, "Capture Auto Mode633: $value")
    }
}

// v633: Caret Auto Blink633
internal fun PlayerActivity.showV633CaretAutoBlink633Toggle() {
    val current = BiliClient.prefs.v633caretAutoBlink633
    BiliClient.prefs.v633caretAutoBlink633 = !current
    AppToast.show(this, "Caret Auto Blink633: ${if (!current) "ON" else "OFF"}")
}

// v633: Case Auto Convert633
internal fun PlayerActivity.showV633CaseAutoConvert633Toggle() {
    val current = BiliClient.prefs.v633caseAutoConvert633
    BiliClient.prefs.v633caseAutoConvert633 = !current
    AppToast.show(this, "Case Auto Convert633: ${if (!current) "ON" else "OFF"}")
}

// v633: Category Auto Sort633
internal fun PlayerActivity.showV633CategoryAutoSort633Toggle() {
    val current = BiliClient.prefs.v633categoryAutoSort633
    BiliClient.prefs.v633categoryAutoSort633 = !current
    AppToast.show(this, "Category Auto Sort633: ${if (!current) "ON" else "OFF"}")
}

// v634: Browse Auto History634
internal fun PlayerActivity.showV634BrowseAutoHistory634Toggle() {
    val current = BiliClient.prefs.v634browseAutoHistory634
    BiliClient.prefs.v634browseAutoHistory634 = !current
    AppToast.show(this, "Browse Auto History634: ${if (!current) "ON" else "OFF"}")
}

// v634: Bucket Auto Clean634
internal fun PlayerActivity.showV634BucketAutoClean634Toggle() {
    val current = BiliClient.prefs.v634bucketAutoClean634
    BiliClient.prefs.v634bucketAutoClean634 = !current
    AppToast.show(this, "Bucket Auto Clean634: ${if (!current) "ON" else "OFF"}")
}

// v634: Build Auto Version634
internal fun PlayerActivity.showV634BuildAutoVersion634Toggle() {
    val current = BiliClient.prefs.v634buildAutoVersion634
    BiliClient.prefs.v634buildAutoVersion634 = !current
    AppToast.show(this, "Build Auto Version634: ${if (!current) "ON" else "OFF"}")
}

// v634: Bulk Auto Import634
internal fun PlayerActivity.showV634BulkAutoImport634Toggle() {
    val current = BiliClient.prefs.v634bulkAutoImport634
    BiliClient.prefs.v634bulkAutoImport634 = !current
    AppToast.show(this, "Bulk Auto Import634: ${if (!current) "ON" else "OFF"}")
}

// v634: Button Auto Haptic634
internal fun PlayerActivity.showV634ButtonAutoHaptic634Toggle() {
    val current = BiliClient.prefs.v634buttonAutoHaptic634
    BiliClient.prefs.v634buttonAutoHaptic634 = !current
    AppToast.show(this, "Button Auto Haptic634: ${if (!current) "ON" else "OFF"}")
}

// v634: Byte Auto Convert634
internal fun PlayerActivity.showV634ByteAutoConvert634Toggle() {
    val current = BiliClient.prefs.v634byteAutoConvert634
    BiliClient.prefs.v634byteAutoConvert634 = !current
    AppToast.show(this, "Byte Auto Convert634: ${if (!current) "ON" else "OFF"}")
}

// v634: Calibrate Auto Color634
internal fun PlayerActivity.showV634CalibrateAutoColor634Toggle() {
    val current = BiliClient.prefs.v634calibrateAutoColor634
    BiliClient.prefs.v634calibrateAutoColor634 = !current
    AppToast.show(this, "Calibrate Auto Color634: ${if (!current) "ON" else "OFF"}")
}

// v634: Call Auto Log634
internal fun PlayerActivity.showV634CallAutoLog634Toggle() {
    val current = BiliClient.prefs.v634callAutoLog634
    BiliClient.prefs.v634callAutoLog634 = !current
    AppToast.show(this, "Call Auto Log634: ${if (!current) "ON" else "OFF"}")
}

// v634: Camera Auto Focus634
internal fun PlayerActivity.showV634CameraAutoFocus634Toggle() {
    val current = BiliClient.prefs.v634cameraAutoFocus634
    BiliClient.prefs.v634cameraAutoFocus634 = !current
    AppToast.show(this, "Camera Auto Focus634: ${if (!current) "ON" else "OFF"}")
}

// v634: Campus Auto Select634
internal fun PlayerActivity.showV634CampusAutoSelect634Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v634campusAutoSelect634).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select634",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v634campusAutoSelect634 = value
        AppToast.show(this, "Campus Auto Select634: $value")
    }
}

// v634: Cancel Auto Undo634
internal fun PlayerActivity.showV634CancelAutoUndo634Toggle() {
    val current = BiliClient.prefs.v634cancelAutoUndo634
    BiliClient.prefs.v634cancelAutoUndo634 = !current
    AppToast.show(this, "Cancel Auto Undo634: ${if (!current) "ON" else "OFF"}")
}

// v634: Capture Auto Mode634
internal fun PlayerActivity.showV634CaptureAutoMode634Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v634captureAutoMode634).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode634",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v634captureAutoMode634 = value
        AppToast.show(this, "Capture Auto Mode634: $value")
    }
}

// v634: Caret Auto Blink634
internal fun PlayerActivity.showV634CaretAutoBlink634Toggle() {
    val current = BiliClient.prefs.v634caretAutoBlink634
    BiliClient.prefs.v634caretAutoBlink634 = !current
    AppToast.show(this, "Caret Auto Blink634: ${if (!current) "ON" else "OFF"}")
}

// v634: Case Auto Convert634
internal fun PlayerActivity.showV634CaseAutoConvert634Toggle() {
    val current = BiliClient.prefs.v634caseAutoConvert634
    BiliClient.prefs.v634caseAutoConvert634 = !current
    AppToast.show(this, "Case Auto Convert634: ${if (!current) "ON" else "OFF"}")
}

// v634: Category Auto Sort634
internal fun PlayerActivity.showV634CategoryAutoSort634Toggle() {
    val current = BiliClient.prefs.v634categoryAutoSort634
    BiliClient.prefs.v634categoryAutoSort634 = !current
    AppToast.show(this, "Category Auto Sort634: ${if (!current) "ON" else "OFF"}")
}

// v635: Browse Auto History635
internal fun PlayerActivity.showV635BrowseAutoHistory635Toggle() {
    val current = BiliClient.prefs.v635browseAutoHistory635
    BiliClient.prefs.v635browseAutoHistory635 = !current
    AppToast.show(this, "Browse Auto History635: ${if (!current) "ON" else "OFF"}")
}

// v635: Bucket Auto Clean635
internal fun PlayerActivity.showV635BucketAutoClean635Toggle() {
    val current = BiliClient.prefs.v635bucketAutoClean635
    BiliClient.prefs.v635bucketAutoClean635 = !current
    AppToast.show(this, "Bucket Auto Clean635: ${if (!current) "ON" else "OFF"}")
}

// v635: Build Auto Version635
internal fun PlayerActivity.showV635BuildAutoVersion635Toggle() {
    val current = BiliClient.prefs.v635buildAutoVersion635
    BiliClient.prefs.v635buildAutoVersion635 = !current
    AppToast.show(this, "Build Auto Version635: ${if (!current) "ON" else "OFF"}")
}

// v635: Bulk Auto Import635
internal fun PlayerActivity.showV635BulkAutoImport635Toggle() {
    val current = BiliClient.prefs.v635bulkAutoImport635
    BiliClient.prefs.v635bulkAutoImport635 = !current
    AppToast.show(this, "Bulk Auto Import635: ${if (!current) "ON" else "OFF"}")
}

// v635: Button Auto Haptic635
internal fun PlayerActivity.showV635ButtonAutoHaptic635Toggle() {
    val current = BiliClient.prefs.v635buttonAutoHaptic635
    BiliClient.prefs.v635buttonAutoHaptic635 = !current
    AppToast.show(this, "Button Auto Haptic635: ${if (!current) "ON" else "OFF"}")
}

// v635: Byte Auto Convert635
internal fun PlayerActivity.showV635ByteAutoConvert635Toggle() {
    val current = BiliClient.prefs.v635byteAutoConvert635
    BiliClient.prefs.v635byteAutoConvert635 = !current
    AppToast.show(this, "Byte Auto Convert635: ${if (!current) "ON" else "OFF"}")
}

// v635: Calibrate Auto Color635
internal fun PlayerActivity.showV635CalibrateAutoColor635Toggle() {
    val current = BiliClient.prefs.v635calibrateAutoColor635
    BiliClient.prefs.v635calibrateAutoColor635 = !current
    AppToast.show(this, "Calibrate Auto Color635: ${if (!current) "ON" else "OFF"}")
}

// v635: Call Auto Log635
internal fun PlayerActivity.showV635CallAutoLog635Toggle() {
    val current = BiliClient.prefs.v635callAutoLog635
    BiliClient.prefs.v635callAutoLog635 = !current
    AppToast.show(this, "Call Auto Log635: ${if (!current) "ON" else "OFF"}")
}

// v635: Camera Auto Focus635
internal fun PlayerActivity.showV635CameraAutoFocus635Toggle() {
    val current = BiliClient.prefs.v635cameraAutoFocus635
    BiliClient.prefs.v635cameraAutoFocus635 = !current
    AppToast.show(this, "Camera Auto Focus635: ${if (!current) "ON" else "OFF"}")
}

// v635: Campus Auto Select635
internal fun PlayerActivity.showV635CampusAutoSelect635Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v635campusAutoSelect635).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select635",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v635campusAutoSelect635 = value
        AppToast.show(this, "Campus Auto Select635: $value")
    }
}

// v635: Cancel Auto Undo635
internal fun PlayerActivity.showV635CancelAutoUndo635Toggle() {
    val current = BiliClient.prefs.v635cancelAutoUndo635
    BiliClient.prefs.v635cancelAutoUndo635 = !current
    AppToast.show(this, "Cancel Auto Undo635: ${if (!current) "ON" else "OFF"}")
}

// v635: Capture Auto Mode635
internal fun PlayerActivity.showV635CaptureAutoMode635Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v635captureAutoMode635).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode635",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v635captureAutoMode635 = value
        AppToast.show(this, "Capture Auto Mode635: $value")
    }
}

// v635: Caret Auto Blink635
internal fun PlayerActivity.showV635CaretAutoBlink635Toggle() {
    val current = BiliClient.prefs.v635caretAutoBlink635
    BiliClient.prefs.v635caretAutoBlink635 = !current
    AppToast.show(this, "Caret Auto Blink635: ${if (!current) "ON" else "OFF"}")
}

// v635: Case Auto Convert635
internal fun PlayerActivity.showV635CaseAutoConvert635Toggle() {
    val current = BiliClient.prefs.v635caseAutoConvert635
    BiliClient.prefs.v635caseAutoConvert635 = !current
    AppToast.show(this, "Case Auto Convert635: ${if (!current) "ON" else "OFF"}")
}

// v635: Category Auto Sort635
internal fun PlayerActivity.showV635CategoryAutoSort635Toggle() {
    val current = BiliClient.prefs.v635categoryAutoSort635
    BiliClient.prefs.v635categoryAutoSort635 = !current
    AppToast.show(this, "Category Auto Sort635: ${if (!current) "ON" else "OFF"}")
}

// v636: Browse Auto History636
internal fun PlayerActivity.showV636BrowseAutoHistory636Toggle() {
    val current = BiliClient.prefs.v636browseAutoHistory636
    BiliClient.prefs.v636browseAutoHistory636 = !current
    AppToast.show(this, "Browse Auto History636: ${if (!current) "ON" else "OFF"}")
}

// v636: Bucket Auto Clean636
internal fun PlayerActivity.showV636BucketAutoClean636Toggle() {
    val current = BiliClient.prefs.v636bucketAutoClean636
    BiliClient.prefs.v636bucketAutoClean636 = !current
    AppToast.show(this, "Bucket Auto Clean636: ${if (!current) "ON" else "OFF"}")
}

// v636: Build Auto Version636
internal fun PlayerActivity.showV636BuildAutoVersion636Toggle() {
    val current = BiliClient.prefs.v636buildAutoVersion636
    BiliClient.prefs.v636buildAutoVersion636 = !current
    AppToast.show(this, "Build Auto Version636: ${if (!current) "ON" else "OFF"}")
}

// v636: Bulk Auto Import636
internal fun PlayerActivity.showV636BulkAutoImport636Toggle() {
    val current = BiliClient.prefs.v636bulkAutoImport636
    BiliClient.prefs.v636bulkAutoImport636 = !current
    AppToast.show(this, "Bulk Auto Import636: ${if (!current) "ON" else "OFF"}")
}

// v636: Button Auto Haptic636
internal fun PlayerActivity.showV636ButtonAutoHaptic636Toggle() {
    val current = BiliClient.prefs.v636buttonAutoHaptic636
    BiliClient.prefs.v636buttonAutoHaptic636 = !current
    AppToast.show(this, "Button Auto Haptic636: ${if (!current) "ON" else "OFF"}")
}

// v636: Byte Auto Convert636
internal fun PlayerActivity.showV636ByteAutoConvert636Toggle() {
    val current = BiliClient.prefs.v636byteAutoConvert636
    BiliClient.prefs.v636byteAutoConvert636 = !current
    AppToast.show(this, "Byte Auto Convert636: ${if (!current) "ON" else "OFF"}")
}

// v636: Calibrate Auto Color636
internal fun PlayerActivity.showV636CalibrateAutoColor636Toggle() {
    val current = BiliClient.prefs.v636calibrateAutoColor636
    BiliClient.prefs.v636calibrateAutoColor636 = !current
    AppToast.show(this, "Calibrate Auto Color636: ${if (!current) "ON" else "OFF"}")
}

// v636: Call Auto Log636
internal fun PlayerActivity.showV636CallAutoLog636Toggle() {
    val current = BiliClient.prefs.v636callAutoLog636
    BiliClient.prefs.v636callAutoLog636 = !current
    AppToast.show(this, "Call Auto Log636: ${if (!current) "ON" else "OFF"}")
}

// v636: Camera Auto Focus636
internal fun PlayerActivity.showV636CameraAutoFocus636Toggle() {
    val current = BiliClient.prefs.v636cameraAutoFocus636
    BiliClient.prefs.v636cameraAutoFocus636 = !current
    AppToast.show(this, "Camera Auto Focus636: ${if (!current) "ON" else "OFF"}")
}

// v636: Campus Auto Select636
internal fun PlayerActivity.showV636CampusAutoSelect636Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v636campusAutoSelect636).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select636",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v636campusAutoSelect636 = value
        AppToast.show(this, "Campus Auto Select636: $value")
    }
}

// v636: Cancel Auto Undo636
internal fun PlayerActivity.showV636CancelAutoUndo636Toggle() {
    val current = BiliClient.prefs.v636cancelAutoUndo636
    BiliClient.prefs.v636cancelAutoUndo636 = !current
    AppToast.show(this, "Cancel Auto Undo636: ${if (!current) "ON" else "OFF"}")
}

// v636: Capture Auto Mode636
internal fun PlayerActivity.showV636CaptureAutoMode636Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v636captureAutoMode636).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode636",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v636captureAutoMode636 = value
        AppToast.show(this, "Capture Auto Mode636: $value")
    }
}

// v636: Caret Auto Blink636
internal fun PlayerActivity.showV636CaretAutoBlink636Toggle() {
    val current = BiliClient.prefs.v636caretAutoBlink636
    BiliClient.prefs.v636caretAutoBlink636 = !current
    AppToast.show(this, "Caret Auto Blink636: ${if (!current) "ON" else "OFF"}")
}

// v636: Case Auto Convert636
internal fun PlayerActivity.showV636CaseAutoConvert636Toggle() {
    val current = BiliClient.prefs.v636caseAutoConvert636
    BiliClient.prefs.v636caseAutoConvert636 = !current
    AppToast.show(this, "Case Auto Convert636: ${if (!current) "ON" else "OFF"}")
}

// v636: Category Auto Sort636
internal fun PlayerActivity.showV636CategoryAutoSort636Toggle() {
    val current = BiliClient.prefs.v636categoryAutoSort636
    BiliClient.prefs.v636categoryAutoSort636 = !current
    AppToast.show(this, "Category Auto Sort636: ${if (!current) "ON" else "OFF"}")
}

// v637: Browse Auto History637
internal fun PlayerActivity.showV637BrowseAutoHistory637Toggle() {
    val current = BiliClient.prefs.v637browseAutoHistory637
    BiliClient.prefs.v637browseAutoHistory637 = !current
    AppToast.show(this, "Browse Auto History637: ${if (!current) "ON" else "OFF"}")
}

// v637: Bucket Auto Clean637
internal fun PlayerActivity.showV637BucketAutoClean637Toggle() {
    val current = BiliClient.prefs.v637bucketAutoClean637
    BiliClient.prefs.v637bucketAutoClean637 = !current
    AppToast.show(this, "Bucket Auto Clean637: ${if (!current) "ON" else "OFF"}")
}

// v637: Build Auto Version637
internal fun PlayerActivity.showV637BuildAutoVersion637Toggle() {
    val current = BiliClient.prefs.v637buildAutoVersion637
    BiliClient.prefs.v637buildAutoVersion637 = !current
    AppToast.show(this, "Build Auto Version637: ${if (!current) "ON" else "OFF"}")
}

// v637: Bulk Auto Import637
internal fun PlayerActivity.showV637BulkAutoImport637Toggle() {
    val current = BiliClient.prefs.v637bulkAutoImport637
    BiliClient.prefs.v637bulkAutoImport637 = !current
    AppToast.show(this, "Bulk Auto Import637: ${if (!current) "ON" else "OFF"}")
}

// v637: Button Auto Haptic637
internal fun PlayerActivity.showV637ButtonAutoHaptic637Toggle() {
    val current = BiliClient.prefs.v637buttonAutoHaptic637
    BiliClient.prefs.v637buttonAutoHaptic637 = !current
    AppToast.show(this, "Button Auto Haptic637: ${if (!current) "ON" else "OFF"}")
}

// v637: Byte Auto Convert637
internal fun PlayerActivity.showV637ByteAutoConvert637Toggle() {
    val current = BiliClient.prefs.v637byteAutoConvert637
    BiliClient.prefs.v637byteAutoConvert637 = !current
    AppToast.show(this, "Byte Auto Convert637: ${if (!current) "ON" else "OFF"}")
}

// v637: Calibrate Auto Color637
internal fun PlayerActivity.showV637CalibrateAutoColor637Toggle() {
    val current = BiliClient.prefs.v637calibrateAutoColor637
    BiliClient.prefs.v637calibrateAutoColor637 = !current
    AppToast.show(this, "Calibrate Auto Color637: ${if (!current) "ON" else "OFF"}")
}

// v637: Call Auto Log637
internal fun PlayerActivity.showV637CallAutoLog637Toggle() {
    val current = BiliClient.prefs.v637callAutoLog637
    BiliClient.prefs.v637callAutoLog637 = !current
    AppToast.show(this, "Call Auto Log637: ${if (!current) "ON" else "OFF"}")
}

// v637: Camera Auto Focus637
internal fun PlayerActivity.showV637CameraAutoFocus637Toggle() {
    val current = BiliClient.prefs.v637cameraAutoFocus637
    BiliClient.prefs.v637cameraAutoFocus637 = !current
    AppToast.show(this, "Camera Auto Focus637: ${if (!current) "ON" else "OFF"}")
}

// v637: Campus Auto Select637
internal fun PlayerActivity.showV637CampusAutoSelect637Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v637campusAutoSelect637).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select637",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v637campusAutoSelect637 = value
        AppToast.show(this, "Campus Auto Select637: $value")
    }
}

// v637: Cancel Auto Undo637
internal fun PlayerActivity.showV637CancelAutoUndo637Toggle() {
    val current = BiliClient.prefs.v637cancelAutoUndo637
    BiliClient.prefs.v637cancelAutoUndo637 = !current
    AppToast.show(this, "Cancel Auto Undo637: ${if (!current) "ON" else "OFF"}")
}

// v637: Capture Auto Mode637
internal fun PlayerActivity.showV637CaptureAutoMode637Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v637captureAutoMode637).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode637",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v637captureAutoMode637 = value
        AppToast.show(this, "Capture Auto Mode637: $value")
    }
}

// v637: Caret Auto Blink637
internal fun PlayerActivity.showV637CaretAutoBlink637Toggle() {
    val current = BiliClient.prefs.v637caretAutoBlink637
    BiliClient.prefs.v637caretAutoBlink637 = !current
    AppToast.show(this, "Caret Auto Blink637: ${if (!current) "ON" else "OFF"}")
}

// v637: Case Auto Convert637
internal fun PlayerActivity.showV637CaseAutoConvert637Toggle() {
    val current = BiliClient.prefs.v637caseAutoConvert637
    BiliClient.prefs.v637caseAutoConvert637 = !current
    AppToast.show(this, "Case Auto Convert637: ${if (!current) "ON" else "OFF"}")
}

// v637: Category Auto Sort637
internal fun PlayerActivity.showV637CategoryAutoSort637Toggle() {
    val current = BiliClient.prefs.v637categoryAutoSort637
    BiliClient.prefs.v637categoryAutoSort637 = !current
    AppToast.show(this, "Category Auto Sort637: ${if (!current) "ON" else "OFF"}")
}

// v638: Browse Auto History638
internal fun PlayerActivity.showV638BrowseAutoHistory638Toggle() {
    val current = BiliClient.prefs.v638browseAutoHistory638
    BiliClient.prefs.v638browseAutoHistory638 = !current
    AppToast.show(this, "Browse Auto History638: ${if (!current) "ON" else "OFF"}")
}

// v638: Bucket Auto Clean638
internal fun PlayerActivity.showV638BucketAutoClean638Toggle() {
    val current = BiliClient.prefs.v638bucketAutoClean638
    BiliClient.prefs.v638bucketAutoClean638 = !current
    AppToast.show(this, "Bucket Auto Clean638: ${if (!current) "ON" else "OFF"}")
}

// v638: Build Auto Version638
internal fun PlayerActivity.showV638BuildAutoVersion638Toggle() {
    val current = BiliClient.prefs.v638buildAutoVersion638
    BiliClient.prefs.v638buildAutoVersion638 = !current
    AppToast.show(this, "Build Auto Version638: ${if (!current) "ON" else "OFF"}")
}

// v638: Bulk Auto Import638
internal fun PlayerActivity.showV638BulkAutoImport638Toggle() {
    val current = BiliClient.prefs.v638bulkAutoImport638
    BiliClient.prefs.v638bulkAutoImport638 = !current
    AppToast.show(this, "Bulk Auto Import638: ${if (!current) "ON" else "OFF"}")
}

// v638: Button Auto Haptic638
internal fun PlayerActivity.showV638ButtonAutoHaptic638Toggle() {
    val current = BiliClient.prefs.v638buttonAutoHaptic638
    BiliClient.prefs.v638buttonAutoHaptic638 = !current
    AppToast.show(this, "Button Auto Haptic638: ${if (!current) "ON" else "OFF"}")
}

// v638: Byte Auto Convert638
internal fun PlayerActivity.showV638ByteAutoConvert638Toggle() {
    val current = BiliClient.prefs.v638byteAutoConvert638
    BiliClient.prefs.v638byteAutoConvert638 = !current
    AppToast.show(this, "Byte Auto Convert638: ${if (!current) "ON" else "OFF"}")
}

// v638: Calibrate Auto Color638
internal fun PlayerActivity.showV638CalibrateAutoColor638Toggle() {
    val current = BiliClient.prefs.v638calibrateAutoColor638
    BiliClient.prefs.v638calibrateAutoColor638 = !current
    AppToast.show(this, "Calibrate Auto Color638: ${if (!current) "ON" else "OFF"}")
}

// v638: Call Auto Log638
internal fun PlayerActivity.showV638CallAutoLog638Toggle() {
    val current = BiliClient.prefs.v638callAutoLog638
    BiliClient.prefs.v638callAutoLog638 = !current
    AppToast.show(this, "Call Auto Log638: ${if (!current) "ON" else "OFF"}")
}

// v638: Camera Auto Focus638
internal fun PlayerActivity.showV638CameraAutoFocus638Toggle() {
    val current = BiliClient.prefs.v638cameraAutoFocus638
    BiliClient.prefs.v638cameraAutoFocus638 = !current
    AppToast.show(this, "Camera Auto Focus638: ${if (!current) "ON" else "OFF"}")
}

// v638: Campus Auto Select638
internal fun PlayerActivity.showV638CampusAutoSelect638Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v638campusAutoSelect638).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select638",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v638campusAutoSelect638 = value
        AppToast.show(this, "Campus Auto Select638: $value")
    }
}

// v638: Cancel Auto Undo638
internal fun PlayerActivity.showV638CancelAutoUndo638Toggle() {
    val current = BiliClient.prefs.v638cancelAutoUndo638
    BiliClient.prefs.v638cancelAutoUndo638 = !current
    AppToast.show(this, "Cancel Auto Undo638: ${if (!current) "ON" else "OFF"}")
}

// v638: Capture Auto Mode638
internal fun PlayerActivity.showV638CaptureAutoMode638Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v638captureAutoMode638).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode638",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v638captureAutoMode638 = value
        AppToast.show(this, "Capture Auto Mode638: $value")
    }
}

// v638: Caret Auto Blink638
internal fun PlayerActivity.showV638CaretAutoBlink638Toggle() {
    val current = BiliClient.prefs.v638caretAutoBlink638
    BiliClient.prefs.v638caretAutoBlink638 = !current
    AppToast.show(this, "Caret Auto Blink638: ${if (!current) "ON" else "OFF"}")
}

// v638: Case Auto Convert638
internal fun PlayerActivity.showV638CaseAutoConvert638Toggle() {
    val current = BiliClient.prefs.v638caseAutoConvert638
    BiliClient.prefs.v638caseAutoConvert638 = !current
    AppToast.show(this, "Case Auto Convert638: ${if (!current) "ON" else "OFF"}")
}

// v638: Category Auto Sort638
internal fun PlayerActivity.showV638CategoryAutoSort638Toggle() {
    val current = BiliClient.prefs.v638categoryAutoSort638
    BiliClient.prefs.v638categoryAutoSort638 = !current
    AppToast.show(this, "Category Auto Sort638: ${if (!current) "ON" else "OFF"}")
}

// v639: Browse Auto History639
internal fun PlayerActivity.showV639BrowseAutoHistory639Toggle() {
    val current = BiliClient.prefs.v639browseAutoHistory639
    BiliClient.prefs.v639browseAutoHistory639 = !current
    AppToast.show(this, "Browse Auto History639: ${if (!current) "ON" else "OFF"}")
}

// v639: Bucket Auto Clean639
internal fun PlayerActivity.showV639BucketAutoClean639Toggle() {
    val current = BiliClient.prefs.v639bucketAutoClean639
    BiliClient.prefs.v639bucketAutoClean639 = !current
    AppToast.show(this, "Bucket Auto Clean639: ${if (!current) "ON" else "OFF"}")
}

// v639: Build Auto Version639
internal fun PlayerActivity.showV639BuildAutoVersion639Toggle() {
    val current = BiliClient.prefs.v639buildAutoVersion639
    BiliClient.prefs.v639buildAutoVersion639 = !current
    AppToast.show(this, "Build Auto Version639: ${if (!current) "ON" else "OFF"}")
}

// v639: Bulk Auto Import639
internal fun PlayerActivity.showV639BulkAutoImport639Toggle() {
    val current = BiliClient.prefs.v639bulkAutoImport639
    BiliClient.prefs.v639bulkAutoImport639 = !current
    AppToast.show(this, "Bulk Auto Import639: ${if (!current) "ON" else "OFF"}")
}

// v639: Button Auto Haptic639
internal fun PlayerActivity.showV639ButtonAutoHaptic639Toggle() {
    val current = BiliClient.prefs.v639buttonAutoHaptic639
    BiliClient.prefs.v639buttonAutoHaptic639 = !current
    AppToast.show(this, "Button Auto Haptic639: ${if (!current) "ON" else "OFF"}")
}

// v639: Byte Auto Convert639
internal fun PlayerActivity.showV639ByteAutoConvert639Toggle() {
    val current = BiliClient.prefs.v639byteAutoConvert639
    BiliClient.prefs.v639byteAutoConvert639 = !current
    AppToast.show(this, "Byte Auto Convert639: ${if (!current) "ON" else "OFF"}")
}

// v639: Calibrate Auto Color639
internal fun PlayerActivity.showV639CalibrateAutoColor639Toggle() {
    val current = BiliClient.prefs.v639calibrateAutoColor639
    BiliClient.prefs.v639calibrateAutoColor639 = !current
    AppToast.show(this, "Calibrate Auto Color639: ${if (!current) "ON" else "OFF"}")
}

// v639: Call Auto Log639
internal fun PlayerActivity.showV639CallAutoLog639Toggle() {
    val current = BiliClient.prefs.v639callAutoLog639
    BiliClient.prefs.v639callAutoLog639 = !current
    AppToast.show(this, "Call Auto Log639: ${if (!current) "ON" else "OFF"}")
}

// v639: Camera Auto Focus639
internal fun PlayerActivity.showV639CameraAutoFocus639Toggle() {
    val current = BiliClient.prefs.v639cameraAutoFocus639
    BiliClient.prefs.v639cameraAutoFocus639 = !current
    AppToast.show(this, "Camera Auto Focus639: ${if (!current) "ON" else "OFF"}")
}

// v639: Campus Auto Select639
internal fun PlayerActivity.showV639CampusAutoSelect639Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v639campusAutoSelect639).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select639",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v639campusAutoSelect639 = value
        AppToast.show(this, "Campus Auto Select639: $value")
    }
}

// v639: Cancel Auto Undo639
internal fun PlayerActivity.showV639CancelAutoUndo639Toggle() {
    val current = BiliClient.prefs.v639cancelAutoUndo639
    BiliClient.prefs.v639cancelAutoUndo639 = !current
    AppToast.show(this, "Cancel Auto Undo639: ${if (!current) "ON" else "OFF"}")
}

// v639: Capture Auto Mode639
internal fun PlayerActivity.showV639CaptureAutoMode639Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v639captureAutoMode639).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode639",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v639captureAutoMode639 = value
        AppToast.show(this, "Capture Auto Mode639: $value")
    }
}

// v639: Caret Auto Blink639
internal fun PlayerActivity.showV639CaretAutoBlink639Toggle() {
    val current = BiliClient.prefs.v639caretAutoBlink639
    BiliClient.prefs.v639caretAutoBlink639 = !current
    AppToast.show(this, "Caret Auto Blink639: ${if (!current) "ON" else "OFF"}")
}

// v639: Case Auto Convert639
internal fun PlayerActivity.showV639CaseAutoConvert639Toggle() {
    val current = BiliClient.prefs.v639caseAutoConvert639
    BiliClient.prefs.v639caseAutoConvert639 = !current
    AppToast.show(this, "Case Auto Convert639: ${if (!current) "ON" else "OFF"}")
}

// v639: Category Auto Sort639
internal fun PlayerActivity.showV639CategoryAutoSort639Toggle() {
    val current = BiliClient.prefs.v639categoryAutoSort639
    BiliClient.prefs.v639categoryAutoSort639 = !current
    AppToast.show(this, "Category Auto Sort639: ${if (!current) "ON" else "OFF"}")
}

// v640: Browse Auto History640
internal fun PlayerActivity.showV640BrowseAutoHistory640Toggle() {
    val current = BiliClient.prefs.v640browseAutoHistory640
    BiliClient.prefs.v640browseAutoHistory640 = !current
    AppToast.show(this, "Browse Auto History640: ${if (!current) "ON" else "OFF"}")
}

// v640: Bucket Auto Clean640
internal fun PlayerActivity.showV640BucketAutoClean640Toggle() {
    val current = BiliClient.prefs.v640bucketAutoClean640
    BiliClient.prefs.v640bucketAutoClean640 = !current
    AppToast.show(this, "Bucket Auto Clean640: ${if (!current) "ON" else "OFF"}")
}

// v640: Build Auto Version640
internal fun PlayerActivity.showV640BuildAutoVersion640Toggle() {
    val current = BiliClient.prefs.v640buildAutoVersion640
    BiliClient.prefs.v640buildAutoVersion640 = !current
    AppToast.show(this, "Build Auto Version640: ${if (!current) "ON" else "OFF"}")
}

// v640: Bulk Auto Import640
internal fun PlayerActivity.showV640BulkAutoImport640Toggle() {
    val current = BiliClient.prefs.v640bulkAutoImport640
    BiliClient.prefs.v640bulkAutoImport640 = !current
    AppToast.show(this, "Bulk Auto Import640: ${if (!current) "ON" else "OFF"}")
}

// v640: Button Auto Haptic640
internal fun PlayerActivity.showV640ButtonAutoHaptic640Toggle() {
    val current = BiliClient.prefs.v640buttonAutoHaptic640
    BiliClient.prefs.v640buttonAutoHaptic640 = !current
    AppToast.show(this, "Button Auto Haptic640: ${if (!current) "ON" else "OFF"}")
}

// v640: Byte Auto Convert640
internal fun PlayerActivity.showV640ByteAutoConvert640Toggle() {
    val current = BiliClient.prefs.v640byteAutoConvert640
    BiliClient.prefs.v640byteAutoConvert640 = !current
    AppToast.show(this, "Byte Auto Convert640: ${if (!current) "ON" else "OFF"}")
}

// v640: Calibrate Auto Color640
internal fun PlayerActivity.showV640CalibrateAutoColor640Toggle() {
    val current = BiliClient.prefs.v640calibrateAutoColor640
    BiliClient.prefs.v640calibrateAutoColor640 = !current
    AppToast.show(this, "Calibrate Auto Color640: ${if (!current) "ON" else "OFF"}")
}

// v640: Call Auto Log640
internal fun PlayerActivity.showV640CallAutoLog640Toggle() {
    val current = BiliClient.prefs.v640callAutoLog640
    BiliClient.prefs.v640callAutoLog640 = !current
    AppToast.show(this, "Call Auto Log640: ${if (!current) "ON" else "OFF"}")
}

// v640: Camera Auto Focus640
internal fun PlayerActivity.showV640CameraAutoFocus640Toggle() {
    val current = BiliClient.prefs.v640cameraAutoFocus640
    BiliClient.prefs.v640cameraAutoFocus640 = !current
    AppToast.show(this, "Camera Auto Focus640: ${if (!current) "ON" else "OFF"}")
}

// v640: Campus Auto Select640
internal fun PlayerActivity.showV640CampusAutoSelect640Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v640campusAutoSelect640).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Campus Auto Select640",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v640campusAutoSelect640 = value
        AppToast.show(this, "Campus Auto Select640: $value")
    }
}

// v640: Cancel Auto Undo640
internal fun PlayerActivity.showV640CancelAutoUndo640Toggle() {
    val current = BiliClient.prefs.v640cancelAutoUndo640
    BiliClient.prefs.v640cancelAutoUndo640 = !current
    AppToast.show(this, "Cancel Auto Undo640: ${if (!current) "ON" else "OFF"}")
}

// v640: Capture Auto Mode640
internal fun PlayerActivity.showV640CaptureAutoMode640Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v640captureAutoMode640).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Capture Auto Mode640",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v640captureAutoMode640 = value
        AppToast.show(this, "Capture Auto Mode640: $value")
    }
}

// v640: Caret Auto Blink640
internal fun PlayerActivity.showV640CaretAutoBlink640Toggle() {
    val current = BiliClient.prefs.v640caretAutoBlink640
    BiliClient.prefs.v640caretAutoBlink640 = !current
    AppToast.show(this, "Caret Auto Blink640: ${if (!current) "ON" else "OFF"}")
}

// v640: Case Auto Convert640
internal fun PlayerActivity.showV640CaseAutoConvert640Toggle() {
    val current = BiliClient.prefs.v640caseAutoConvert640
    BiliClient.prefs.v640caseAutoConvert640 = !current
    AppToast.show(this, "Case Auto Convert640: ${if (!current) "ON" else "OFF"}")
}

// v640: Category Auto Sort640
internal fun PlayerActivity.showV640CategoryAutoSort640Toggle() {
    val current = BiliClient.prefs.v640categoryAutoSort640
    BiliClient.prefs.v640categoryAutoSort640 = !current
    AppToast.show(this, "Category Auto Sort640: ${if (!current) "ON" else "OFF"}")
}

// v641: Cell Auto Merge641
internal fun PlayerActivity.showV641CellAutoMerge641Toggle() {
    val current = BiliClient.prefs.v641cellAutoMerge641
    BiliClient.prefs.v641cellAutoMerge641 = !current
    AppToast.show(this, "Cell Auto Merge641: ${if (!current) "ON" else "OFF"}")
}

// v641: Center Auto Gravity641
internal fun PlayerActivity.showV641CenterAutoGravity641Toggle() {
    val current = BiliClient.prefs.v641centerAutoGravity641
    BiliClient.prefs.v641centerAutoGravity641 = !current
    AppToast.show(this, "Center Auto Gravity641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chain Auto Link641
internal fun PlayerActivity.showV641ChainAutoLink641Toggle() {
    val current = BiliClient.prefs.v641chainAutoLink641
    BiliClient.prefs.v641chainAutoLink641 = !current
    AppToast.show(this, "Chain Auto Link641: ${if (!current) "ON" else "OFF"}")
}

// v641: Challenge Auto Join641
internal fun PlayerActivity.showV641ChallengeAutoJoin641Toggle() {
    val current = BiliClient.prefs.v641challengeAutoJoin641
    BiliClient.prefs.v641challengeAutoJoin641 = !current
    AppToast.show(this, "Challenge Auto Join641: ${if (!current) "ON" else "OFF"}")
}

// v641: Change Auto Track641
internal fun PlayerActivity.showV641ChangeAutoTrack641Toggle() {
    val current = BiliClient.prefs.v641changeAutoTrack641
    BiliClient.prefs.v641changeAutoTrack641 = !current
    AppToast.show(this, "Change Auto Track641: ${if (!current) "ON" else "OFF"}")
}

// v641: Channel Auto Switch641
internal fun PlayerActivity.showV641ChannelAutoSwitch641Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v641channelAutoSwitch641).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch641",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v641channelAutoSwitch641 = value
        AppToast.show(this, "Channel Auto Switch641: $value")
    }
}

// v641: Chapter Auto Mark641
internal fun PlayerActivity.showV641ChapterAutoMark641Toggle() {
    val current = BiliClient.prefs.v641chapterAutoMark641
    BiliClient.prefs.v641chapterAutoMark641 = !current
    AppToast.show(this, "Chapter Auto Mark641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chart Auto Render641
internal fun PlayerActivity.showV641ChartAutoRender641Toggle() {
    val current = BiliClient.prefs.v641chartAutoRender641
    BiliClient.prefs.v641chartAutoRender641 = !current
    AppToast.show(this, "Chart Auto Render641: ${if (!current) "ON" else "OFF"}")
}

// v641: Check Auto Verify641
internal fun PlayerActivity.showV641CheckAutoVerify641Toggle() {
    val current = BiliClient.prefs.v641checkAutoVerify641
    BiliClient.prefs.v641checkAutoVerify641 = !current
    AppToast.show(this, "Check Auto Verify641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chip Auto Tag641
internal fun PlayerActivity.showV641ChipAutoTag641Toggle() {
    val current = BiliClient.prefs.v641chipAutoTag641
    BiliClient.prefs.v641chipAutoTag641 = !current
    AppToast.show(this, "Chip Auto Tag641: ${if (!current) "ON" else "OFF"}")
}

// v641: Chunk Auto Split641
internal fun PlayerActivity.showV641ChunkAutoSplit641Toggle() {
    val current = BiliClient.prefs.v641chunkAutoSplit641
    BiliClient.prefs.v641chunkAutoSplit641 = !current
    AppToast.show(this, "Chunk Auto Split641: ${if (!current) "ON" else "OFF"}")
}

// v641: Cipher Auto Encrypt641
internal fun PlayerActivity.showV641CipherAutoEncrypt641Toggle() {
    val current = BiliClient.prefs.v641cipherAutoEncrypt641
    BiliClient.prefs.v641cipherAutoEncrypt641 = !current
    AppToast.show(this, "Cipher Auto Encrypt641: ${if (!current) "ON" else "OFF"}")
}

// v641: Circle Auto Clip641
internal fun PlayerActivity.showV641CircleAutoClip641Toggle() {
    val current = BiliClient.prefs.v641circleAutoClip641
    BiliClient.prefs.v641circleAutoClip641 = !current
    AppToast.show(this, "Circle Auto Clip641: ${if (!current) "ON" else "OFF"}")
}

// v641: Clamp Auto Value641
internal fun PlayerActivity.showV641ClampAutoValue641Toggle() {
    val current = BiliClient.prefs.v641clampAutoValue641
    BiliClient.prefs.v641clampAutoValue641 = !current
    AppToast.show(this, "Clamp Auto Value641: ${if (!current) "ON" else "OFF"}")
}

// v641: Class Auto Load641
internal fun PlayerActivity.showV641ClassAutoLoad641Toggle() {
    val current = BiliClient.prefs.v641classAutoLoad641
    BiliClient.prefs.v641classAutoLoad641 = !current
    AppToast.show(this, "Class Auto Load641: ${if (!current) "ON" else "OFF"}")
}

// v642: Cell Auto Merge642
internal fun PlayerActivity.showV642CellAutoMerge642Toggle() {
    val current = BiliClient.prefs.v642cellAutoMerge642
    BiliClient.prefs.v642cellAutoMerge642 = !current
    AppToast.show(this, "Cell Auto Merge642: ${if (!current) "ON" else "OFF"}")
}

// v642: Center Auto Gravity642
internal fun PlayerActivity.showV642CenterAutoGravity642Toggle() {
    val current = BiliClient.prefs.v642centerAutoGravity642
    BiliClient.prefs.v642centerAutoGravity642 = !current
    AppToast.show(this, "Center Auto Gravity642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chain Auto Link642
internal fun PlayerActivity.showV642ChainAutoLink642Toggle() {
    val current = BiliClient.prefs.v642chainAutoLink642
    BiliClient.prefs.v642chainAutoLink642 = !current
    AppToast.show(this, "Chain Auto Link642: ${if (!current) "ON" else "OFF"}")
}

// v642: Challenge Auto Join642
internal fun PlayerActivity.showV642ChallengeAutoJoin642Toggle() {
    val current = BiliClient.prefs.v642challengeAutoJoin642
    BiliClient.prefs.v642challengeAutoJoin642 = !current
    AppToast.show(this, "Challenge Auto Join642: ${if (!current) "ON" else "OFF"}")
}

// v642: Change Auto Track642
internal fun PlayerActivity.showV642ChangeAutoTrack642Toggle() {
    val current = BiliClient.prefs.v642changeAutoTrack642
    BiliClient.prefs.v642changeAutoTrack642 = !current
    AppToast.show(this, "Change Auto Track642: ${if (!current) "ON" else "OFF"}")
}

// v642: Channel Auto Switch642
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

// v642: Chapter Auto Mark642
internal fun PlayerActivity.showV642ChapterAutoMark642Toggle() {
    val current = BiliClient.prefs.v642chapterAutoMark642
    BiliClient.prefs.v642chapterAutoMark642 = !current
    AppToast.show(this, "Chapter Auto Mark642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chart Auto Render642
internal fun PlayerActivity.showV642ChartAutoRender642Toggle() {
    val current = BiliClient.prefs.v642chartAutoRender642
    BiliClient.prefs.v642chartAutoRender642 = !current
    AppToast.show(this, "Chart Auto Render642: ${if (!current) "ON" else "OFF"}")
}

// v642: Check Auto Verify642
internal fun PlayerActivity.showV642CheckAutoVerify642Toggle() {
    val current = BiliClient.prefs.v642checkAutoVerify642
    BiliClient.prefs.v642checkAutoVerify642 = !current
    AppToast.show(this, "Check Auto Verify642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chip Auto Tag642
internal fun PlayerActivity.showV642ChipAutoTag642Toggle() {
    val current = BiliClient.prefs.v642chipAutoTag642
    BiliClient.prefs.v642chipAutoTag642 = !current
    AppToast.show(this, "Chip Auto Tag642: ${if (!current) "ON" else "OFF"}")
}

// v642: Chunk Auto Split642
internal fun PlayerActivity.showV642ChunkAutoSplit642Toggle() {
    val current = BiliClient.prefs.v642chunkAutoSplit642
    BiliClient.prefs.v642chunkAutoSplit642 = !current
    AppToast.show(this, "Chunk Auto Split642: ${if (!current) "ON" else "OFF"}")
}

// v642: Cipher Auto Encrypt642
internal fun PlayerActivity.showV642CipherAutoEncrypt642Toggle() {
    val current = BiliClient.prefs.v642cipherAutoEncrypt642
    BiliClient.prefs.v642cipherAutoEncrypt642 = !current
    AppToast.show(this, "Cipher Auto Encrypt642: ${if (!current) "ON" else "OFF"}")
}

// v642: Circle Auto Clip642
internal fun PlayerActivity.showV642CircleAutoClip642Toggle() {
    val current = BiliClient.prefs.v642circleAutoClip642
    BiliClient.prefs.v642circleAutoClip642 = !current
    AppToast.show(this, "Circle Auto Clip642: ${if (!current) "ON" else "OFF"}")
}

// v642: Clamp Auto Value642
internal fun PlayerActivity.showV642ClampAutoValue642Toggle() {
    val current = BiliClient.prefs.v642clampAutoValue642
    BiliClient.prefs.v642clampAutoValue642 = !current
    AppToast.show(this, "Clamp Auto Value642: ${if (!current) "ON" else "OFF"}")
}

// v642: Class Auto Load642
internal fun PlayerActivity.showV642ClassAutoLoad642Toggle() {
    val current = BiliClient.prefs.v642classAutoLoad642
    BiliClient.prefs.v642classAutoLoad642 = !current
    AppToast.show(this, "Class Auto Load642: ${if (!current) "ON" else "OFF"}")
}

// v643: Cell Auto Merge643
internal fun PlayerActivity.showV643CellAutoMerge643Toggle() {
    val current = BiliClient.prefs.v643cellAutoMerge643
    BiliClient.prefs.v643cellAutoMerge643 = !current
    AppToast.show(this, "Cell Auto Merge643: ${if (!current) "ON" else "OFF"}")
}

// v643: Center Auto Gravity643
internal fun PlayerActivity.showV643CenterAutoGravity643Toggle() {
    val current = BiliClient.prefs.v643centerAutoGravity643
    BiliClient.prefs.v643centerAutoGravity643 = !current
    AppToast.show(this, "Center Auto Gravity643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chain Auto Link643
internal fun PlayerActivity.showV643ChainAutoLink643Toggle() {
    val current = BiliClient.prefs.v643chainAutoLink643
    BiliClient.prefs.v643chainAutoLink643 = !current
    AppToast.show(this, "Chain Auto Link643: ${if (!current) "ON" else "OFF"}")
}

// v643: Challenge Auto Join643
internal fun PlayerActivity.showV643ChallengeAutoJoin643Toggle() {
    val current = BiliClient.prefs.v643challengeAutoJoin643
    BiliClient.prefs.v643challengeAutoJoin643 = !current
    AppToast.show(this, "Challenge Auto Join643: ${if (!current) "ON" else "OFF"}")
}

// v643: Change Auto Track643
internal fun PlayerActivity.showV643ChangeAutoTrack643Toggle() {
    val current = BiliClient.prefs.v643changeAutoTrack643
    BiliClient.prefs.v643changeAutoTrack643 = !current
    AppToast.show(this, "Change Auto Track643: ${if (!current) "ON" else "OFF"}")
}

// v643: Channel Auto Switch643
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

// v643: Chapter Auto Mark643
internal fun PlayerActivity.showV643ChapterAutoMark643Toggle() {
    val current = BiliClient.prefs.v643chapterAutoMark643
    BiliClient.prefs.v643chapterAutoMark643 = !current
    AppToast.show(this, "Chapter Auto Mark643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chart Auto Render643
internal fun PlayerActivity.showV643ChartAutoRender643Toggle() {
    val current = BiliClient.prefs.v643chartAutoRender643
    BiliClient.prefs.v643chartAutoRender643 = !current
    AppToast.show(this, "Chart Auto Render643: ${if (!current) "ON" else "OFF"}")
}

// v643: Check Auto Verify643
internal fun PlayerActivity.showV643CheckAutoVerify643Toggle() {
    val current = BiliClient.prefs.v643checkAutoVerify643
    BiliClient.prefs.v643checkAutoVerify643 = !current
    AppToast.show(this, "Check Auto Verify643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chip Auto Tag643
internal fun PlayerActivity.showV643ChipAutoTag643Toggle() {
    val current = BiliClient.prefs.v643chipAutoTag643
    BiliClient.prefs.v643chipAutoTag643 = !current
    AppToast.show(this, "Chip Auto Tag643: ${if (!current) "ON" else "OFF"}")
}

// v643: Chunk Auto Split643
internal fun PlayerActivity.showV643ChunkAutoSplit643Toggle() {
    val current = BiliClient.prefs.v643chunkAutoSplit643
    BiliClient.prefs.v643chunkAutoSplit643 = !current
    AppToast.show(this, "Chunk Auto Split643: ${if (!current) "ON" else "OFF"}")
}

// v643: Cipher Auto Encrypt643
internal fun PlayerActivity.showV643CipherAutoEncrypt643Toggle() {
    val current = BiliClient.prefs.v643cipherAutoEncrypt643
    BiliClient.prefs.v643cipherAutoEncrypt643 = !current
    AppToast.show(this, "Cipher Auto Encrypt643: ${if (!current) "ON" else "OFF"}")
}

// v643: Circle Auto Clip643
internal fun PlayerActivity.showV643CircleAutoClip643Toggle() {
    val current = BiliClient.prefs.v643circleAutoClip643
    BiliClient.prefs.v643circleAutoClip643 = !current
    AppToast.show(this, "Circle Auto Clip643: ${if (!current) "ON" else "OFF"}")
}

// v643: Clamp Auto Value643
internal fun PlayerActivity.showV643ClampAutoValue643Toggle() {
    val current = BiliClient.prefs.v643clampAutoValue643
    BiliClient.prefs.v643clampAutoValue643 = !current
    AppToast.show(this, "Clamp Auto Value643: ${if (!current) "ON" else "OFF"}")
}

// v643: Class Auto Load643
internal fun PlayerActivity.showV643ClassAutoLoad643Toggle() {
    val current = BiliClient.prefs.v643classAutoLoad643
    BiliClient.prefs.v643classAutoLoad643 = !current
    AppToast.show(this, "Class Auto Load643: ${if (!current) "ON" else "OFF"}")
}

// v644: Cell Auto Merge644
internal fun PlayerActivity.showV644CellAutoMerge644Toggle() {
    val current = BiliClient.prefs.v644cellAutoMerge644
    BiliClient.prefs.v644cellAutoMerge644 = !current
    AppToast.show(this, "Cell Auto Merge644: ${if (!current) "ON" else "OFF"}")
}

// v644: Center Auto Gravity644
internal fun PlayerActivity.showV644CenterAutoGravity644Toggle() {
    val current = BiliClient.prefs.v644centerAutoGravity644
    BiliClient.prefs.v644centerAutoGravity644 = !current
    AppToast.show(this, "Center Auto Gravity644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chain Auto Link644
internal fun PlayerActivity.showV644ChainAutoLink644Toggle() {
    val current = BiliClient.prefs.v644chainAutoLink644
    BiliClient.prefs.v644chainAutoLink644 = !current
    AppToast.show(this, "Chain Auto Link644: ${if (!current) "ON" else "OFF"}")
}

// v644: Challenge Auto Join644
internal fun PlayerActivity.showV644ChallengeAutoJoin644Toggle() {
    val current = BiliClient.prefs.v644challengeAutoJoin644
    BiliClient.prefs.v644challengeAutoJoin644 = !current
    AppToast.show(this, "Challenge Auto Join644: ${if (!current) "ON" else "OFF"}")
}

// v644: Change Auto Track644
internal fun PlayerActivity.showV644ChangeAutoTrack644Toggle() {
    val current = BiliClient.prefs.v644changeAutoTrack644
    BiliClient.prefs.v644changeAutoTrack644 = !current
    AppToast.show(this, "Change Auto Track644: ${if (!current) "ON" else "OFF"}")
}

// v644: Channel Auto Switch644
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

// v644: Chapter Auto Mark644
internal fun PlayerActivity.showV644ChapterAutoMark644Toggle() {
    val current = BiliClient.prefs.v644chapterAutoMark644
    BiliClient.prefs.v644chapterAutoMark644 = !current
    AppToast.show(this, "Chapter Auto Mark644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chart Auto Render644
internal fun PlayerActivity.showV644ChartAutoRender644Toggle() {
    val current = BiliClient.prefs.v644chartAutoRender644
    BiliClient.prefs.v644chartAutoRender644 = !current
    AppToast.show(this, "Chart Auto Render644: ${if (!current) "ON" else "OFF"}")
}

// v644: Check Auto Verify644
internal fun PlayerActivity.showV644CheckAutoVerify644Toggle() {
    val current = BiliClient.prefs.v644checkAutoVerify644
    BiliClient.prefs.v644checkAutoVerify644 = !current
    AppToast.show(this, "Check Auto Verify644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chip Auto Tag644
internal fun PlayerActivity.showV644ChipAutoTag644Toggle() {
    val current = BiliClient.prefs.v644chipAutoTag644
    BiliClient.prefs.v644chipAutoTag644 = !current
    AppToast.show(this, "Chip Auto Tag644: ${if (!current) "ON" else "OFF"}")
}

// v644: Chunk Auto Split644
internal fun PlayerActivity.showV644ChunkAutoSplit644Toggle() {
    val current = BiliClient.prefs.v644chunkAutoSplit644
    BiliClient.prefs.v644chunkAutoSplit644 = !current
    AppToast.show(this, "Chunk Auto Split644: ${if (!current) "ON" else "OFF"}")
}

// v644: Cipher Auto Encrypt644
internal fun PlayerActivity.showV644CipherAutoEncrypt644Toggle() {
    val current = BiliClient.prefs.v644cipherAutoEncrypt644
    BiliClient.prefs.v644cipherAutoEncrypt644 = !current
    AppToast.show(this, "Cipher Auto Encrypt644: ${if (!current) "ON" else "OFF"}")
}

// v644: Circle Auto Clip644
internal fun PlayerActivity.showV644CircleAutoClip644Toggle() {
    val current = BiliClient.prefs.v644circleAutoClip644
    BiliClient.prefs.v644circleAutoClip644 = !current
    AppToast.show(this, "Circle Auto Clip644: ${if (!current) "ON" else "OFF"}")
}

// v644: Clamp Auto Value644
internal fun PlayerActivity.showV644ClampAutoValue644Toggle() {
    val current = BiliClient.prefs.v644clampAutoValue644
    BiliClient.prefs.v644clampAutoValue644 = !current
    AppToast.show(this, "Clamp Auto Value644: ${if (!current) "ON" else "OFF"}")
}

// v644: Class Auto Load644
internal fun PlayerActivity.showV644ClassAutoLoad644Toggle() {
    val current = BiliClient.prefs.v644classAutoLoad644
    BiliClient.prefs.v644classAutoLoad644 = !current
    AppToast.show(this, "Class Auto Load644: ${if (!current) "ON" else "OFF"}")
}

// v645: Cell Auto Merge645
internal fun PlayerActivity.showV645CellAutoMerge645Toggle() {
    val current = BiliClient.prefs.v645cellAutoMerge645
    BiliClient.prefs.v645cellAutoMerge645 = !current
    AppToast.show(this, "Cell Auto Merge645: ${if (!current) "ON" else "OFF"}")
}

// v645: Center Auto Gravity645
internal fun PlayerActivity.showV645CenterAutoGravity645Toggle() {
    val current = BiliClient.prefs.v645centerAutoGravity645
    BiliClient.prefs.v645centerAutoGravity645 = !current
    AppToast.show(this, "Center Auto Gravity645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chain Auto Link645
internal fun PlayerActivity.showV645ChainAutoLink645Toggle() {
    val current = BiliClient.prefs.v645chainAutoLink645
    BiliClient.prefs.v645chainAutoLink645 = !current
    AppToast.show(this, "Chain Auto Link645: ${if (!current) "ON" else "OFF"}")
}

// v645: Challenge Auto Join645
internal fun PlayerActivity.showV645ChallengeAutoJoin645Toggle() {
    val current = BiliClient.prefs.v645challengeAutoJoin645
    BiliClient.prefs.v645challengeAutoJoin645 = !current
    AppToast.show(this, "Challenge Auto Join645: ${if (!current) "ON" else "OFF"}")
}

// v645: Change Auto Track645
internal fun PlayerActivity.showV645ChangeAutoTrack645Toggle() {
    val current = BiliClient.prefs.v645changeAutoTrack645
    BiliClient.prefs.v645changeAutoTrack645 = !current
    AppToast.show(this, "Change Auto Track645: ${if (!current) "ON" else "OFF"}")
}

// v645: Channel Auto Switch645
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

// v645: Chapter Auto Mark645
internal fun PlayerActivity.showV645ChapterAutoMark645Toggle() {
    val current = BiliClient.prefs.v645chapterAutoMark645
    BiliClient.prefs.v645chapterAutoMark645 = !current
    AppToast.show(this, "Chapter Auto Mark645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chart Auto Render645
internal fun PlayerActivity.showV645ChartAutoRender645Toggle() {
    val current = BiliClient.prefs.v645chartAutoRender645
    BiliClient.prefs.v645chartAutoRender645 = !current
    AppToast.show(this, "Chart Auto Render645: ${if (!current) "ON" else "OFF"}")
}

// v645: Check Auto Verify645
internal fun PlayerActivity.showV645CheckAutoVerify645Toggle() {
    val current = BiliClient.prefs.v645checkAutoVerify645
    BiliClient.prefs.v645checkAutoVerify645 = !current
    AppToast.show(this, "Check Auto Verify645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chip Auto Tag645
internal fun PlayerActivity.showV645ChipAutoTag645Toggle() {
    val current = BiliClient.prefs.v645chipAutoTag645
    BiliClient.prefs.v645chipAutoTag645 = !current
    AppToast.show(this, "Chip Auto Tag645: ${if (!current) "ON" else "OFF"}")
}

// v645: Chunk Auto Split645
internal fun PlayerActivity.showV645ChunkAutoSplit645Toggle() {
    val current = BiliClient.prefs.v645chunkAutoSplit645
    BiliClient.prefs.v645chunkAutoSplit645 = !current
    AppToast.show(this, "Chunk Auto Split645: ${if (!current) "ON" else "OFF"}")
}

// v645: Cipher Auto Encrypt645
internal fun PlayerActivity.showV645CipherAutoEncrypt645Toggle() {
    val current = BiliClient.prefs.v645cipherAutoEncrypt645
    BiliClient.prefs.v645cipherAutoEncrypt645 = !current
    AppToast.show(this, "Cipher Auto Encrypt645: ${if (!current) "ON" else "OFF"}")
}

// v645: Circle Auto Clip645
internal fun PlayerActivity.showV645CircleAutoClip645Toggle() {
    val current = BiliClient.prefs.v645circleAutoClip645
    BiliClient.prefs.v645circleAutoClip645 = !current
    AppToast.show(this, "Circle Auto Clip645: ${if (!current) "ON" else "OFF"}")
}

// v645: Clamp Auto Value645
internal fun PlayerActivity.showV645ClampAutoValue645Toggle() {
    val current = BiliClient.prefs.v645clampAutoValue645
    BiliClient.prefs.v645clampAutoValue645 = !current
    AppToast.show(this, "Clamp Auto Value645: ${if (!current) "ON" else "OFF"}")
}

// v645: Class Auto Load645
internal fun PlayerActivity.showV645ClassAutoLoad645Toggle() {
    val current = BiliClient.prefs.v645classAutoLoad645
    BiliClient.prefs.v645classAutoLoad645 = !current
    AppToast.show(this, "Class Auto Load645: ${if (!current) "ON" else "OFF"}")
}

// v646: Cell Auto Merge646
internal fun PlayerActivity.showV646CellAutoMerge646Toggle() {
    val current = BiliClient.prefs.v646cellAutoMerge646
    BiliClient.prefs.v646cellAutoMerge646 = !current
    AppToast.show(this, "Cell Auto Merge646: ${if (!current) "ON" else "OFF"}")
}

// v646: Center Auto Gravity646
internal fun PlayerActivity.showV646CenterAutoGravity646Toggle() {
    val current = BiliClient.prefs.v646centerAutoGravity646
    BiliClient.prefs.v646centerAutoGravity646 = !current
    AppToast.show(this, "Center Auto Gravity646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chain Auto Link646
internal fun PlayerActivity.showV646ChainAutoLink646Toggle() {
    val current = BiliClient.prefs.v646chainAutoLink646
    BiliClient.prefs.v646chainAutoLink646 = !current
    AppToast.show(this, "Chain Auto Link646: ${if (!current) "ON" else "OFF"}")
}

// v646: Challenge Auto Join646
internal fun PlayerActivity.showV646ChallengeAutoJoin646Toggle() {
    val current = BiliClient.prefs.v646challengeAutoJoin646
    BiliClient.prefs.v646challengeAutoJoin646 = !current
    AppToast.show(this, "Challenge Auto Join646: ${if (!current) "ON" else "OFF"}")
}

// v646: Change Auto Track646
internal fun PlayerActivity.showV646ChangeAutoTrack646Toggle() {
    val current = BiliClient.prefs.v646changeAutoTrack646
    BiliClient.prefs.v646changeAutoTrack646 = !current
    AppToast.show(this, "Change Auto Track646: ${if (!current) "ON" else "OFF"}")
}

// v646: Channel Auto Switch646
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

// v646: Chapter Auto Mark646
internal fun PlayerActivity.showV646ChapterAutoMark646Toggle() {
    val current = BiliClient.prefs.v646chapterAutoMark646
    BiliClient.prefs.v646chapterAutoMark646 = !current
    AppToast.show(this, "Chapter Auto Mark646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chart Auto Render646
internal fun PlayerActivity.showV646ChartAutoRender646Toggle() {
    val current = BiliClient.prefs.v646chartAutoRender646
    BiliClient.prefs.v646chartAutoRender646 = !current
    AppToast.show(this, "Chart Auto Render646: ${if (!current) "ON" else "OFF"}")
}

// v646: Check Auto Verify646
internal fun PlayerActivity.showV646CheckAutoVerify646Toggle() {
    val current = BiliClient.prefs.v646checkAutoVerify646
    BiliClient.prefs.v646checkAutoVerify646 = !current
    AppToast.show(this, "Check Auto Verify646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chip Auto Tag646
internal fun PlayerActivity.showV646ChipAutoTag646Toggle() {
    val current = BiliClient.prefs.v646chipAutoTag646
    BiliClient.prefs.v646chipAutoTag646 = !current
    AppToast.show(this, "Chip Auto Tag646: ${if (!current) "ON" else "OFF"}")
}

// v646: Chunk Auto Split646
internal fun PlayerActivity.showV646ChunkAutoSplit646Toggle() {
    val current = BiliClient.prefs.v646chunkAutoSplit646
    BiliClient.prefs.v646chunkAutoSplit646 = !current
    AppToast.show(this, "Chunk Auto Split646: ${if (!current) "ON" else "OFF"}")
}

// v646: Cipher Auto Encrypt646
internal fun PlayerActivity.showV646CipherAutoEncrypt646Toggle() {
    val current = BiliClient.prefs.v646cipherAutoEncrypt646
    BiliClient.prefs.v646cipherAutoEncrypt646 = !current
    AppToast.show(this, "Cipher Auto Encrypt646: ${if (!current) "ON" else "OFF"}")
}

// v646: Circle Auto Clip646
internal fun PlayerActivity.showV646CircleAutoClip646Toggle() {
    val current = BiliClient.prefs.v646circleAutoClip646
    BiliClient.prefs.v646circleAutoClip646 = !current
    AppToast.show(this, "Circle Auto Clip646: ${if (!current) "ON" else "OFF"}")
}

// v646: Clamp Auto Value646
internal fun PlayerActivity.showV646ClampAutoValue646Toggle() {
    val current = BiliClient.prefs.v646clampAutoValue646
    BiliClient.prefs.v646clampAutoValue646 = !current
    AppToast.show(this, "Clamp Auto Value646: ${if (!current) "ON" else "OFF"}")
}

// v646: Class Auto Load646
internal fun PlayerActivity.showV646ClassAutoLoad646Toggle() {
    val current = BiliClient.prefs.v646classAutoLoad646
    BiliClient.prefs.v646classAutoLoad646 = !current
    AppToast.show(this, "Class Auto Load646: ${if (!current) "ON" else "OFF"}")
}

// v647: Cell Auto Merge647
internal fun PlayerActivity.showV647CellAutoMerge647Toggle() {
    val current = BiliClient.prefs.v647cellAutoMerge647
    BiliClient.prefs.v647cellAutoMerge647 = !current
    AppToast.show(this, "Cell Auto Merge647: ${if (!current) "ON" else "OFF"}")
}

// v647: Center Auto Gravity647
internal fun PlayerActivity.showV647CenterAutoGravity647Toggle() {
    val current = BiliClient.prefs.v647centerAutoGravity647
    BiliClient.prefs.v647centerAutoGravity647 = !current
    AppToast.show(this, "Center Auto Gravity647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chain Auto Link647
internal fun PlayerActivity.showV647ChainAutoLink647Toggle() {
    val current = BiliClient.prefs.v647chainAutoLink647
    BiliClient.prefs.v647chainAutoLink647 = !current
    AppToast.show(this, "Chain Auto Link647: ${if (!current) "ON" else "OFF"}")
}

// v647: Challenge Auto Join647
internal fun PlayerActivity.showV647ChallengeAutoJoin647Toggle() {
    val current = BiliClient.prefs.v647challengeAutoJoin647
    BiliClient.prefs.v647challengeAutoJoin647 = !current
    AppToast.show(this, "Challenge Auto Join647: ${if (!current) "ON" else "OFF"}")
}

// v647: Change Auto Track647
internal fun PlayerActivity.showV647ChangeAutoTrack647Toggle() {
    val current = BiliClient.prefs.v647changeAutoTrack647
    BiliClient.prefs.v647changeAutoTrack647 = !current
    AppToast.show(this, "Change Auto Track647: ${if (!current) "ON" else "OFF"}")
}

// v647: Channel Auto Switch647
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

// v647: Chapter Auto Mark647
internal fun PlayerActivity.showV647ChapterAutoMark647Toggle() {
    val current = BiliClient.prefs.v647chapterAutoMark647
    BiliClient.prefs.v647chapterAutoMark647 = !current
    AppToast.show(this, "Chapter Auto Mark647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chart Auto Render647
internal fun PlayerActivity.showV647ChartAutoRender647Toggle() {
    val current = BiliClient.prefs.v647chartAutoRender647
    BiliClient.prefs.v647chartAutoRender647 = !current
    AppToast.show(this, "Chart Auto Render647: ${if (!current) "ON" else "OFF"}")
}

// v647: Check Auto Verify647
internal fun PlayerActivity.showV647CheckAutoVerify647Toggle() {
    val current = BiliClient.prefs.v647checkAutoVerify647
    BiliClient.prefs.v647checkAutoVerify647 = !current
    AppToast.show(this, "Check Auto Verify647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chip Auto Tag647
internal fun PlayerActivity.showV647ChipAutoTag647Toggle() {
    val current = BiliClient.prefs.v647chipAutoTag647
    BiliClient.prefs.v647chipAutoTag647 = !current
    AppToast.show(this, "Chip Auto Tag647: ${if (!current) "ON" else "OFF"}")
}

// v647: Chunk Auto Split647
internal fun PlayerActivity.showV647ChunkAutoSplit647Toggle() {
    val current = BiliClient.prefs.v647chunkAutoSplit647
    BiliClient.prefs.v647chunkAutoSplit647 = !current
    AppToast.show(this, "Chunk Auto Split647: ${if (!current) "ON" else "OFF"}")
}

// v647: Cipher Auto Encrypt647
internal fun PlayerActivity.showV647CipherAutoEncrypt647Toggle() {
    val current = BiliClient.prefs.v647cipherAutoEncrypt647
    BiliClient.prefs.v647cipherAutoEncrypt647 = !current
    AppToast.show(this, "Cipher Auto Encrypt647: ${if (!current) "ON" else "OFF"}")
}

// v647: Circle Auto Clip647
internal fun PlayerActivity.showV647CircleAutoClip647Toggle() {
    val current = BiliClient.prefs.v647circleAutoClip647
    BiliClient.prefs.v647circleAutoClip647 = !current
    AppToast.show(this, "Circle Auto Clip647: ${if (!current) "ON" else "OFF"}")
}

// v647: Clamp Auto Value647
internal fun PlayerActivity.showV647ClampAutoValue647Toggle() {
    val current = BiliClient.prefs.v647clampAutoValue647
    BiliClient.prefs.v647clampAutoValue647 = !current
    AppToast.show(this, "Clamp Auto Value647: ${if (!current) "ON" else "OFF"}")
}

// v647: Class Auto Load647
internal fun PlayerActivity.showV647ClassAutoLoad647Toggle() {
    val current = BiliClient.prefs.v647classAutoLoad647
    BiliClient.prefs.v647classAutoLoad647 = !current
    AppToast.show(this, "Class Auto Load647: ${if (!current) "ON" else "OFF"}")
}

// v648: Cell Auto Merge648
internal fun PlayerActivity.showV648CellAutoMerge648Toggle() {
    val current = BiliClient.prefs.v648cellAutoMerge648
    BiliClient.prefs.v648cellAutoMerge648 = !current
    AppToast.show(this, "Cell Auto Merge648: ${if (!current) "ON" else "OFF"}")
}

// v648: Center Auto Gravity648
internal fun PlayerActivity.showV648CenterAutoGravity648Toggle() {
    val current = BiliClient.prefs.v648centerAutoGravity648
    BiliClient.prefs.v648centerAutoGravity648 = !current
    AppToast.show(this, "Center Auto Gravity648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chain Auto Link648
internal fun PlayerActivity.showV648ChainAutoLink648Toggle() {
    val current = BiliClient.prefs.v648chainAutoLink648
    BiliClient.prefs.v648chainAutoLink648 = !current
    AppToast.show(this, "Chain Auto Link648: ${if (!current) "ON" else "OFF"}")
}

// v648: Challenge Auto Join648
internal fun PlayerActivity.showV648ChallengeAutoJoin648Toggle() {
    val current = BiliClient.prefs.v648challengeAutoJoin648
    BiliClient.prefs.v648challengeAutoJoin648 = !current
    AppToast.show(this, "Challenge Auto Join648: ${if (!current) "ON" else "OFF"}")
}

// v648: Change Auto Track648
internal fun PlayerActivity.showV648ChangeAutoTrack648Toggle() {
    val current = BiliClient.prefs.v648changeAutoTrack648
    BiliClient.prefs.v648changeAutoTrack648 = !current
    AppToast.show(this, "Change Auto Track648: ${if (!current) "ON" else "OFF"}")
}

// v648: Channel Auto Switch648
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

// v648: Chapter Auto Mark648
internal fun PlayerActivity.showV648ChapterAutoMark648Toggle() {
    val current = BiliClient.prefs.v648chapterAutoMark648
    BiliClient.prefs.v648chapterAutoMark648 = !current
    AppToast.show(this, "Chapter Auto Mark648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chart Auto Render648
internal fun PlayerActivity.showV648ChartAutoRender648Toggle() {
    val current = BiliClient.prefs.v648chartAutoRender648
    BiliClient.prefs.v648chartAutoRender648 = !current
    AppToast.show(this, "Chart Auto Render648: ${if (!current) "ON" else "OFF"}")
}

// v648: Check Auto Verify648
internal fun PlayerActivity.showV648CheckAutoVerify648Toggle() {
    val current = BiliClient.prefs.v648checkAutoVerify648
    BiliClient.prefs.v648checkAutoVerify648 = !current
    AppToast.show(this, "Check Auto Verify648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chip Auto Tag648
internal fun PlayerActivity.showV648ChipAutoTag648Toggle() {
    val current = BiliClient.prefs.v648chipAutoTag648
    BiliClient.prefs.v648chipAutoTag648 = !current
    AppToast.show(this, "Chip Auto Tag648: ${if (!current) "ON" else "OFF"}")
}

// v648: Chunk Auto Split648
internal fun PlayerActivity.showV648ChunkAutoSplit648Toggle() {
    val current = BiliClient.prefs.v648chunkAutoSplit648
    BiliClient.prefs.v648chunkAutoSplit648 = !current
    AppToast.show(this, "Chunk Auto Split648: ${if (!current) "ON" else "OFF"}")
}

// v648: Cipher Auto Encrypt648
internal fun PlayerActivity.showV648CipherAutoEncrypt648Toggle() {
    val current = BiliClient.prefs.v648cipherAutoEncrypt648
    BiliClient.prefs.v648cipherAutoEncrypt648 = !current
    AppToast.show(this, "Cipher Auto Encrypt648: ${if (!current) "ON" else "OFF"}")
}

// v648: Circle Auto Clip648
internal fun PlayerActivity.showV648CircleAutoClip648Toggle() {
    val current = BiliClient.prefs.v648circleAutoClip648
    BiliClient.prefs.v648circleAutoClip648 = !current
    AppToast.show(this, "Circle Auto Clip648: ${if (!current) "ON" else "OFF"}")
}

// v648: Clamp Auto Value648
internal fun PlayerActivity.showV648ClampAutoValue648Toggle() {
    val current = BiliClient.prefs.v648clampAutoValue648
    BiliClient.prefs.v648clampAutoValue648 = !current
    AppToast.show(this, "Clamp Auto Value648: ${if (!current) "ON" else "OFF"}")
}

// v648: Class Auto Load648
internal fun PlayerActivity.showV648ClassAutoLoad648Toggle() {
    val current = BiliClient.prefs.v648classAutoLoad648
    BiliClient.prefs.v648classAutoLoad648 = !current
    AppToast.show(this, "Class Auto Load648: ${if (!current) "ON" else "OFF"}")
}

// v649: Cell Auto Merge649
internal fun PlayerActivity.showV649CellAutoMerge649Toggle() {
    val current = BiliClient.prefs.v649cellAutoMerge649
    BiliClient.prefs.v649cellAutoMerge649 = !current
    AppToast.show(this, "Cell Auto Merge649: ${if (!current) "ON" else "OFF"}")
}

// v649: Center Auto Gravity649
internal fun PlayerActivity.showV649CenterAutoGravity649Toggle() {
    val current = BiliClient.prefs.v649centerAutoGravity649
    BiliClient.prefs.v649centerAutoGravity649 = !current
    AppToast.show(this, "Center Auto Gravity649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chain Auto Link649
internal fun PlayerActivity.showV649ChainAutoLink649Toggle() {
    val current = BiliClient.prefs.v649chainAutoLink649
    BiliClient.prefs.v649chainAutoLink649 = !current
    AppToast.show(this, "Chain Auto Link649: ${if (!current) "ON" else "OFF"}")
}

// v649: Challenge Auto Join649
internal fun PlayerActivity.showV649ChallengeAutoJoin649Toggle() {
    val current = BiliClient.prefs.v649challengeAutoJoin649
    BiliClient.prefs.v649challengeAutoJoin649 = !current
    AppToast.show(this, "Challenge Auto Join649: ${if (!current) "ON" else "OFF"}")
}

// v649: Change Auto Track649
internal fun PlayerActivity.showV649ChangeAutoTrack649Toggle() {
    val current = BiliClient.prefs.v649changeAutoTrack649
    BiliClient.prefs.v649changeAutoTrack649 = !current
    AppToast.show(this, "Change Auto Track649: ${if (!current) "ON" else "OFF"}")
}

// v649: Channel Auto Switch649
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

// v649: Chapter Auto Mark649
internal fun PlayerActivity.showV649ChapterAutoMark649Toggle() {
    val current = BiliClient.prefs.v649chapterAutoMark649
    BiliClient.prefs.v649chapterAutoMark649 = !current
    AppToast.show(this, "Chapter Auto Mark649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chart Auto Render649
internal fun PlayerActivity.showV649ChartAutoRender649Toggle() {
    val current = BiliClient.prefs.v649chartAutoRender649
    BiliClient.prefs.v649chartAutoRender649 = !current
    AppToast.show(this, "Chart Auto Render649: ${if (!current) "ON" else "OFF"}")
}

// v649: Check Auto Verify649
internal fun PlayerActivity.showV649CheckAutoVerify649Toggle() {
    val current = BiliClient.prefs.v649checkAutoVerify649
    BiliClient.prefs.v649checkAutoVerify649 = !current
    AppToast.show(this, "Check Auto Verify649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chip Auto Tag649
internal fun PlayerActivity.showV649ChipAutoTag649Toggle() {
    val current = BiliClient.prefs.v649chipAutoTag649
    BiliClient.prefs.v649chipAutoTag649 = !current
    AppToast.show(this, "Chip Auto Tag649: ${if (!current) "ON" else "OFF"}")
}

// v649: Chunk Auto Split649
internal fun PlayerActivity.showV649ChunkAutoSplit649Toggle() {
    val current = BiliClient.prefs.v649chunkAutoSplit649
    BiliClient.prefs.v649chunkAutoSplit649 = !current
    AppToast.show(this, "Chunk Auto Split649: ${if (!current) "ON" else "OFF"}")
}

// v649: Cipher Auto Encrypt649
internal fun PlayerActivity.showV649CipherAutoEncrypt649Toggle() {
    val current = BiliClient.prefs.v649cipherAutoEncrypt649
    BiliClient.prefs.v649cipherAutoEncrypt649 = !current
    AppToast.show(this, "Cipher Auto Encrypt649: ${if (!current) "ON" else "OFF"}")
}

// v649: Circle Auto Clip649
internal fun PlayerActivity.showV649CircleAutoClip649Toggle() {
    val current = BiliClient.prefs.v649circleAutoClip649
    BiliClient.prefs.v649circleAutoClip649 = !current
    AppToast.show(this, "Circle Auto Clip649: ${if (!current) "ON" else "OFF"}")
}
