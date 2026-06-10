package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v771: custom mode
internal fun PlayerActivity.showV771CustomToggle() {
    val current = FeaturePrefsStore.batch771.v771custom
    FeaturePrefsStore.batch771.v771custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v771: cycle mode
internal fun PlayerActivity.showV771CycleToggle() {
    val current = FeaturePrefsStore.batch771.v771cycle
    FeaturePrefsStore.batch771.v771cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v771: data mode
internal fun PlayerActivity.showV771DataToggle() {
    val current = FeaturePrefsStore.batch771.v771data
    FeaturePrefsStore.batch771.v771data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v771: database mode
internal fun PlayerActivity.showV771DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v771database
    FeaturePrefsStore.batch771.v771database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v771: date mode
internal fun PlayerActivity.showV771DateToggle() {
    val current = FeaturePrefsStore.batch771.v771date
    FeaturePrefsStore.batch771.v771date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v771: debug level
internal fun PlayerActivity.showV771DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v771debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v771debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v771: decay level
internal fun PlayerActivity.showV771DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v771decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v771decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v771: decimal level
internal fun PlayerActivity.showV771DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v771decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v771decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v771: decode level
internal fun PlayerActivity.showV771DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v771decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v771decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v771: default level
internal fun PlayerActivity.showV771DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v771default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v771default = value
        AppToast.show(this, "default: $value")
    }
}

// v771: defer mode
internal fun PlayerActivity.showV771DeferToggle() {
    val current = FeaturePrefsStore.batch771.v771defer
    FeaturePrefsStore.batch771.v771defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v771: define mode
internal fun PlayerActivity.showV771DefineToggle() {
    val current = FeaturePrefsStore.batch771.v771define
    FeaturePrefsStore.batch771.v771define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v771: delay mode
internal fun PlayerActivity.showV771DelayToggle() {
    val current = FeaturePrefsStore.batch771.v771delay
    FeaturePrefsStore.batch771.v771delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v771: delete mode
internal fun PlayerActivity.showV771DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v771delete
    FeaturePrefsStore.batch771.v771delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v771: delta mode
internal fun PlayerActivity.showV771DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v771delta
    FeaturePrefsStore.batch771.v771delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v772: custom mode
internal fun PlayerActivity.showV772CustomToggle() {
    val current = FeaturePrefsStore.batch771.v772custom
    FeaturePrefsStore.batch771.v772custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v772: cycle mode
internal fun PlayerActivity.showV772CycleToggle() {
    val current = FeaturePrefsStore.batch771.v772cycle
    FeaturePrefsStore.batch771.v772cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v772: data mode
internal fun PlayerActivity.showV772DataToggle() {
    val current = FeaturePrefsStore.batch771.v772data
    FeaturePrefsStore.batch771.v772data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v772: database mode
internal fun PlayerActivity.showV772DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v772database
    FeaturePrefsStore.batch771.v772database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v772: date mode
internal fun PlayerActivity.showV772DateToggle() {
    val current = FeaturePrefsStore.batch771.v772date
    FeaturePrefsStore.batch771.v772date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v772: debug level
internal fun PlayerActivity.showV772DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v772debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v772debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v772: decay level
internal fun PlayerActivity.showV772DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v772decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v772decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v772: decimal level
internal fun PlayerActivity.showV772DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v772decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v772decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v772: decode level
internal fun PlayerActivity.showV772DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v772decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v772decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v772: default level
internal fun PlayerActivity.showV772DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v772default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v772default = value
        AppToast.show(this, "default: $value")
    }
}

// v772: defer mode
internal fun PlayerActivity.showV772DeferToggle() {
    val current = FeaturePrefsStore.batch771.v772defer
    FeaturePrefsStore.batch771.v772defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v772: define mode
internal fun PlayerActivity.showV772DefineToggle() {
    val current = FeaturePrefsStore.batch771.v772define
    FeaturePrefsStore.batch771.v772define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v772: delay mode
internal fun PlayerActivity.showV772DelayToggle() {
    val current = FeaturePrefsStore.batch771.v772delay
    FeaturePrefsStore.batch771.v772delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v772: delete mode
internal fun PlayerActivity.showV772DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v772delete
    FeaturePrefsStore.batch771.v772delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v772: delta mode
internal fun PlayerActivity.showV772DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v772delta
    FeaturePrefsStore.batch771.v772delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v773: custom mode
internal fun PlayerActivity.showV773CustomToggle() {
    val current = FeaturePrefsStore.batch771.v773custom
    FeaturePrefsStore.batch771.v773custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v773: cycle mode
internal fun PlayerActivity.showV773CycleToggle() {
    val current = FeaturePrefsStore.batch771.v773cycle
    FeaturePrefsStore.batch771.v773cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v773: data mode
internal fun PlayerActivity.showV773DataToggle() {
    val current = FeaturePrefsStore.batch771.v773data
    FeaturePrefsStore.batch771.v773data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v773: database mode
internal fun PlayerActivity.showV773DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v773database
    FeaturePrefsStore.batch771.v773database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v773: date mode
internal fun PlayerActivity.showV773DateToggle() {
    val current = FeaturePrefsStore.batch771.v773date
    FeaturePrefsStore.batch771.v773date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v773: debug level
internal fun PlayerActivity.showV773DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v773debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v773debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v773: decay level
internal fun PlayerActivity.showV773DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v773decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v773decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v773: decimal level
internal fun PlayerActivity.showV773DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v773decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v773decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v773: decode level
internal fun PlayerActivity.showV773DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v773decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v773decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v773: default level
internal fun PlayerActivity.showV773DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v773default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v773default = value
        AppToast.show(this, "default: $value")
    }
}

// v773: defer mode
internal fun PlayerActivity.showV773DeferToggle() {
    val current = FeaturePrefsStore.batch771.v773defer
    FeaturePrefsStore.batch771.v773defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v773: define mode
internal fun PlayerActivity.showV773DefineToggle() {
    val current = FeaturePrefsStore.batch771.v773define
    FeaturePrefsStore.batch771.v773define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v773: delay mode
internal fun PlayerActivity.showV773DelayToggle() {
    val current = FeaturePrefsStore.batch771.v773delay
    FeaturePrefsStore.batch771.v773delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v773: delete mode
internal fun PlayerActivity.showV773DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v773delete
    FeaturePrefsStore.batch771.v773delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v773: delta mode
internal fun PlayerActivity.showV773DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v773delta
    FeaturePrefsStore.batch771.v773delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v774: custom mode
internal fun PlayerActivity.showV774CustomToggle() {
    val current = FeaturePrefsStore.batch771.v774custom
    FeaturePrefsStore.batch771.v774custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v774: cycle mode
internal fun PlayerActivity.showV774CycleToggle() {
    val current = FeaturePrefsStore.batch771.v774cycle
    FeaturePrefsStore.batch771.v774cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v774: data mode
internal fun PlayerActivity.showV774DataToggle() {
    val current = FeaturePrefsStore.batch771.v774data
    FeaturePrefsStore.batch771.v774data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v774: database mode
internal fun PlayerActivity.showV774DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v774database
    FeaturePrefsStore.batch771.v774database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v774: date mode
internal fun PlayerActivity.showV774DateToggle() {
    val current = FeaturePrefsStore.batch771.v774date
    FeaturePrefsStore.batch771.v774date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v774: debug level
internal fun PlayerActivity.showV774DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v774debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v774debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v774: decay level
internal fun PlayerActivity.showV774DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v774decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v774decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v774: decimal level
internal fun PlayerActivity.showV774DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v774decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v774decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v774: decode level
internal fun PlayerActivity.showV774DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v774decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v774decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v774: default level
internal fun PlayerActivity.showV774DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v774default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v774default = value
        AppToast.show(this, "default: $value")
    }
}

// v774: defer mode
internal fun PlayerActivity.showV774DeferToggle() {
    val current = FeaturePrefsStore.batch771.v774defer
    FeaturePrefsStore.batch771.v774defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v774: define mode
internal fun PlayerActivity.showV774DefineToggle() {
    val current = FeaturePrefsStore.batch771.v774define
    FeaturePrefsStore.batch771.v774define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v774: delay mode
internal fun PlayerActivity.showV774DelayToggle() {
    val current = FeaturePrefsStore.batch771.v774delay
    FeaturePrefsStore.batch771.v774delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v774: delete mode
internal fun PlayerActivity.showV774DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v774delete
    FeaturePrefsStore.batch771.v774delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v774: delta mode
internal fun PlayerActivity.showV774DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v774delta
    FeaturePrefsStore.batch771.v774delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v775: custom mode
internal fun PlayerActivity.showV775CustomToggle() {
    val current = FeaturePrefsStore.batch771.v775custom
    FeaturePrefsStore.batch771.v775custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v775: cycle mode
internal fun PlayerActivity.showV775CycleToggle() {
    val current = FeaturePrefsStore.batch771.v775cycle
    FeaturePrefsStore.batch771.v775cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v775: data mode
internal fun PlayerActivity.showV775DataToggle() {
    val current = FeaturePrefsStore.batch771.v775data
    FeaturePrefsStore.batch771.v775data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v775: database mode
internal fun PlayerActivity.showV775DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v775database
    FeaturePrefsStore.batch771.v775database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v775: date mode
internal fun PlayerActivity.showV775DateToggle() {
    val current = FeaturePrefsStore.batch771.v775date
    FeaturePrefsStore.batch771.v775date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v775: debug level
internal fun PlayerActivity.showV775DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v775debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v775debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v775: decay level
internal fun PlayerActivity.showV775DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v775decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v775decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v775: decimal level
internal fun PlayerActivity.showV775DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v775decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v775decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v775: decode level
internal fun PlayerActivity.showV775DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v775decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v775decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v775: default level
internal fun PlayerActivity.showV775DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v775default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v775default = value
        AppToast.show(this, "default: $value")
    }
}

// v775: defer mode
internal fun PlayerActivity.showV775DeferToggle() {
    val current = FeaturePrefsStore.batch771.v775defer
    FeaturePrefsStore.batch771.v775defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v775: define mode
internal fun PlayerActivity.showV775DefineToggle() {
    val current = FeaturePrefsStore.batch771.v775define
    FeaturePrefsStore.batch771.v775define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v775: delay mode
internal fun PlayerActivity.showV775DelayToggle() {
    val current = FeaturePrefsStore.batch771.v775delay
    FeaturePrefsStore.batch771.v775delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v775: delete mode
internal fun PlayerActivity.showV775DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v775delete
    FeaturePrefsStore.batch771.v775delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v775: delta mode
internal fun PlayerActivity.showV775DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v775delta
    FeaturePrefsStore.batch771.v775delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v776: custom mode
internal fun PlayerActivity.showV776CustomToggle() {
    val current = FeaturePrefsStore.batch771.v776custom
    FeaturePrefsStore.batch771.v776custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v776: cycle mode
internal fun PlayerActivity.showV776CycleToggle() {
    val current = FeaturePrefsStore.batch771.v776cycle
    FeaturePrefsStore.batch771.v776cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v776: data mode
internal fun PlayerActivity.showV776DataToggle() {
    val current = FeaturePrefsStore.batch771.v776data
    FeaturePrefsStore.batch771.v776data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v776: database mode
internal fun PlayerActivity.showV776DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v776database
    FeaturePrefsStore.batch771.v776database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v776: date mode
internal fun PlayerActivity.showV776DateToggle() {
    val current = FeaturePrefsStore.batch771.v776date
    FeaturePrefsStore.batch771.v776date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v776: debug level
internal fun PlayerActivity.showV776DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v776debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v776debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v776: decay level
internal fun PlayerActivity.showV776DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v776decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v776decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v776: decimal level
internal fun PlayerActivity.showV776DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v776decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v776decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v776: decode level
internal fun PlayerActivity.showV776DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v776decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v776decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v776: default level
internal fun PlayerActivity.showV776DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v776default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v776default = value
        AppToast.show(this, "default: $value")
    }
}

// v776: defer mode
internal fun PlayerActivity.showV776DeferToggle() {
    val current = FeaturePrefsStore.batch771.v776defer
    FeaturePrefsStore.batch771.v776defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v776: define mode
internal fun PlayerActivity.showV776DefineToggle() {
    val current = FeaturePrefsStore.batch771.v776define
    FeaturePrefsStore.batch771.v776define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v776: delay mode
internal fun PlayerActivity.showV776DelayToggle() {
    val current = FeaturePrefsStore.batch771.v776delay
    FeaturePrefsStore.batch771.v776delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v776: delete mode
internal fun PlayerActivity.showV776DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v776delete
    FeaturePrefsStore.batch771.v776delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v776: delta mode
internal fun PlayerActivity.showV776DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v776delta
    FeaturePrefsStore.batch771.v776delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v777: custom mode
internal fun PlayerActivity.showV777CustomToggle() {
    val current = FeaturePrefsStore.batch771.v777custom
    FeaturePrefsStore.batch771.v777custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v777: cycle mode
internal fun PlayerActivity.showV777CycleToggle() {
    val current = FeaturePrefsStore.batch771.v777cycle
    FeaturePrefsStore.batch771.v777cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v777: data mode
internal fun PlayerActivity.showV777DataToggle() {
    val current = FeaturePrefsStore.batch771.v777data
    FeaturePrefsStore.batch771.v777data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v777: database mode
internal fun PlayerActivity.showV777DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v777database
    FeaturePrefsStore.batch771.v777database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v777: date mode
internal fun PlayerActivity.showV777DateToggle() {
    val current = FeaturePrefsStore.batch771.v777date
    FeaturePrefsStore.batch771.v777date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v777: debug level
internal fun PlayerActivity.showV777DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v777debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v777debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v777: decay level
internal fun PlayerActivity.showV777DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v777decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v777decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v777: decimal level
internal fun PlayerActivity.showV777DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v777decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v777decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v777: decode level
internal fun PlayerActivity.showV777DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v777decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v777decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v777: default level
internal fun PlayerActivity.showV777DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v777default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v777default = value
        AppToast.show(this, "default: $value")
    }
}

// v777: defer mode
internal fun PlayerActivity.showV777DeferToggle() {
    val current = FeaturePrefsStore.batch771.v777defer
    FeaturePrefsStore.batch771.v777defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v777: define mode
internal fun PlayerActivity.showV777DefineToggle() {
    val current = FeaturePrefsStore.batch771.v777define
    FeaturePrefsStore.batch771.v777define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v777: delay mode
internal fun PlayerActivity.showV777DelayToggle() {
    val current = FeaturePrefsStore.batch771.v777delay
    FeaturePrefsStore.batch771.v777delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v777: delete mode
internal fun PlayerActivity.showV777DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v777delete
    FeaturePrefsStore.batch771.v777delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v777: delta mode
internal fun PlayerActivity.showV777DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v777delta
    FeaturePrefsStore.batch771.v777delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v778: custom mode
internal fun PlayerActivity.showV778CustomToggle() {
    val current = FeaturePrefsStore.batch771.v778custom
    FeaturePrefsStore.batch771.v778custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v778: cycle mode
internal fun PlayerActivity.showV778CycleToggle() {
    val current = FeaturePrefsStore.batch771.v778cycle
    FeaturePrefsStore.batch771.v778cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v778: data mode
internal fun PlayerActivity.showV778DataToggle() {
    val current = FeaturePrefsStore.batch771.v778data
    FeaturePrefsStore.batch771.v778data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v778: database mode
internal fun PlayerActivity.showV778DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v778database
    FeaturePrefsStore.batch771.v778database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v778: date mode
internal fun PlayerActivity.showV778DateToggle() {
    val current = FeaturePrefsStore.batch771.v778date
    FeaturePrefsStore.batch771.v778date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v778: debug level
internal fun PlayerActivity.showV778DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v778debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v778debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v778: decay level
internal fun PlayerActivity.showV778DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v778decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v778decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v778: decimal level
internal fun PlayerActivity.showV778DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v778decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v778decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v778: decode level
internal fun PlayerActivity.showV778DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v778decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v778decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v778: default level
internal fun PlayerActivity.showV778DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v778default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v778default = value
        AppToast.show(this, "default: $value")
    }
}

// v778: defer mode
internal fun PlayerActivity.showV778DeferToggle() {
    val current = FeaturePrefsStore.batch771.v778defer
    FeaturePrefsStore.batch771.v778defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v778: define mode
internal fun PlayerActivity.showV778DefineToggle() {
    val current = FeaturePrefsStore.batch771.v778define
    FeaturePrefsStore.batch771.v778define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v778: delay mode
internal fun PlayerActivity.showV778DelayToggle() {
    val current = FeaturePrefsStore.batch771.v778delay
    FeaturePrefsStore.batch771.v778delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v778: delete mode
internal fun PlayerActivity.showV778DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v778delete
    FeaturePrefsStore.batch771.v778delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v778: delta mode
internal fun PlayerActivity.showV778DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v778delta
    FeaturePrefsStore.batch771.v778delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v779: custom mode
internal fun PlayerActivity.showV779CustomToggle() {
    val current = FeaturePrefsStore.batch771.v779custom
    FeaturePrefsStore.batch771.v779custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v779: cycle mode
internal fun PlayerActivity.showV779CycleToggle() {
    val current = FeaturePrefsStore.batch771.v779cycle
    FeaturePrefsStore.batch771.v779cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v779: data mode
internal fun PlayerActivity.showV779DataToggle() {
    val current = FeaturePrefsStore.batch771.v779data
    FeaturePrefsStore.batch771.v779data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v779: database mode
internal fun PlayerActivity.showV779DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v779database
    FeaturePrefsStore.batch771.v779database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v779: date mode
internal fun PlayerActivity.showV779DateToggle() {
    val current = FeaturePrefsStore.batch771.v779date
    FeaturePrefsStore.batch771.v779date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v779: debug level
internal fun PlayerActivity.showV779DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v779debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v779debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v779: decay level
internal fun PlayerActivity.showV779DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v779decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v779decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v779: decimal level
internal fun PlayerActivity.showV779DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v779decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v779decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v779: decode level
internal fun PlayerActivity.showV779DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v779decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v779decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v779: default level
internal fun PlayerActivity.showV779DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v779default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v779default = value
        AppToast.show(this, "default: $value")
    }
}

// v779: defer mode
internal fun PlayerActivity.showV779DeferToggle() {
    val current = FeaturePrefsStore.batch771.v779defer
    FeaturePrefsStore.batch771.v779defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v779: define mode
internal fun PlayerActivity.showV779DefineToggle() {
    val current = FeaturePrefsStore.batch771.v779define
    FeaturePrefsStore.batch771.v779define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v779: delay mode
internal fun PlayerActivity.showV779DelayToggle() {
    val current = FeaturePrefsStore.batch771.v779delay
    FeaturePrefsStore.batch771.v779delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v779: delete mode
internal fun PlayerActivity.showV779DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v779delete
    FeaturePrefsStore.batch771.v779delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v779: delta mode
internal fun PlayerActivity.showV779DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v779delta
    FeaturePrefsStore.batch771.v779delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

// v780: custom mode
internal fun PlayerActivity.showV780CustomToggle() {
    val current = FeaturePrefsStore.batch771.v780custom
    FeaturePrefsStore.batch771.v780custom = !current
    AppToast.show(this, "custom: ${if (!current) "ON" else "OFF"}")
}

// v780: cycle mode
internal fun PlayerActivity.showV780CycleToggle() {
    val current = FeaturePrefsStore.batch771.v780cycle
    FeaturePrefsStore.batch771.v780cycle = !current
    AppToast.show(this, "cycle: ${if (!current) "ON" else "OFF"}")
}

// v780: data mode
internal fun PlayerActivity.showV780DataToggle() {
    val current = FeaturePrefsStore.batch771.v780data
    FeaturePrefsStore.batch771.v780data = !current
    AppToast.show(this, "data: ${if (!current) "ON" else "OFF"}")
}

// v780: database mode
internal fun PlayerActivity.showV780DatabaseToggle() {
    val current = FeaturePrefsStore.batch771.v780database
    FeaturePrefsStore.batch771.v780database = !current
    AppToast.show(this, "database: ${if (!current) "ON" else "OFF"}")
}

// v780: date mode
internal fun PlayerActivity.showV780DateToggle() {
    val current = FeaturePrefsStore.batch771.v780date
    FeaturePrefsStore.batch771.v780date = !current
    AppToast.show(this, "date: ${if (!current) "ON" else "OFF"}")
}

// v780: debug level
internal fun PlayerActivity.showV780DebugDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v780debug).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debug level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v780debug = value
        AppToast.show(this, "debug: $value")
    }
}

// v780: decay level
internal fun PlayerActivity.showV780DecayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v780decay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v780decay = value
        AppToast.show(this, "decay: $value")
    }
}

// v780: decimal level
internal fun PlayerActivity.showV780DecimalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v780decimal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decimal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v780decimal = value
        AppToast.show(this, "decimal: $value")
    }
}

// v780: decode level
internal fun PlayerActivity.showV780DecodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v780decode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decode level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v780decode = value
        AppToast.show(this, "decode: $value")
    }
}

// v780: default level
internal fun PlayerActivity.showV780DefaultDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch771.v780default).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "default level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch771.v780default = value
        AppToast.show(this, "default: $value")
    }
}

// v780: defer mode
internal fun PlayerActivity.showV780DeferToggle() {
    val current = FeaturePrefsStore.batch771.v780defer
    FeaturePrefsStore.batch771.v780defer = !current
    AppToast.show(this, "defer: ${if (!current) "ON" else "OFF"}")
}

// v780: define mode
internal fun PlayerActivity.showV780DefineToggle() {
    val current = FeaturePrefsStore.batch771.v780define
    FeaturePrefsStore.batch771.v780define = !current
    AppToast.show(this, "define: ${if (!current) "ON" else "OFF"}")
}

// v780: delay mode
internal fun PlayerActivity.showV780DelayToggle() {
    val current = FeaturePrefsStore.batch771.v780delay
    FeaturePrefsStore.batch771.v780delay = !current
    AppToast.show(this, "delay: ${if (!current) "ON" else "OFF"}")
}

// v780: delete mode
internal fun PlayerActivity.showV780DeleteToggle() {
    val current = FeaturePrefsStore.batch771.v780delete
    FeaturePrefsStore.batch771.v780delete = !current
    AppToast.show(this, "delete: ${if (!current) "ON" else "OFF"}")
}

// v780: delta mode
internal fun PlayerActivity.showV780DeltaToggle() {
    val current = FeaturePrefsStore.batch771.v780delta
    FeaturePrefsStore.batch771.v780delta = !current
    AppToast.show(this, "delta: ${if (!current) "ON" else "OFF"}")
}

