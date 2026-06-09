package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v801: driver mode
internal fun PlayerActivity.showV801DriverToggle() {
    val current = FeaturePrefsStore.batch801.v801driver
    FeaturePrefsStore.batch801.v801driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v801: drop mode
internal fun PlayerActivity.showV801DropToggle() {
    val current = FeaturePrefsStore.batch801.v801drop
    FeaturePrefsStore.batch801.v801drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v801: dry mode
internal fun PlayerActivity.showV801DryToggle() {
    val current = FeaturePrefsStore.batch801.v801dry
    FeaturePrefsStore.batch801.v801dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v801: dump mode
internal fun PlayerActivity.showV801DumpToggle() {
    val current = FeaturePrefsStore.batch801.v801dump
    FeaturePrefsStore.batch801.v801dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v801: duplicate mode
internal fun PlayerActivity.showV801DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v801duplicate
    FeaturePrefsStore.batch801.v801duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v801: duration level
internal fun PlayerActivity.showV801DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v801: dynamic level
internal fun PlayerActivity.showV801DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v801: echo level
internal fun PlayerActivity.showV801EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v801: edge level
internal fun PlayerActivity.showV801EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v801: edit level
internal fun PlayerActivity.showV801EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v801: effect mode
internal fun PlayerActivity.showV801EffectToggle() {
    val current = FeaturePrefsStore.batch801.v801effect
    FeaturePrefsStore.batch801.v801effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v801: element mode
internal fun PlayerActivity.showV801ElementToggle() {
    val current = FeaturePrefsStore.batch801.v801element
    FeaturePrefsStore.batch801.v801element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v801: embed mode
internal fun PlayerActivity.showV801EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v801embed
    FeaturePrefsStore.batch801.v801embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v801: emit mode
internal fun PlayerActivity.showV801EmitToggle() {
    val current = FeaturePrefsStore.batch801.v801emit
    FeaturePrefsStore.batch801.v801emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v801: empty mode
internal fun PlayerActivity.showV801EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v801empty
    FeaturePrefsStore.batch801.v801empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v802: driver mode
internal fun PlayerActivity.showV802DriverToggle() {
    val current = FeaturePrefsStore.batch801.v802driver
    FeaturePrefsStore.batch801.v802driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v802: drop mode
internal fun PlayerActivity.showV802DropToggle() {
    val current = FeaturePrefsStore.batch801.v802drop
    FeaturePrefsStore.batch801.v802drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v802: dry mode
internal fun PlayerActivity.showV802DryToggle() {
    val current = FeaturePrefsStore.batch801.v802dry
    FeaturePrefsStore.batch801.v802dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v802: dump mode
internal fun PlayerActivity.showV802DumpToggle() {
    val current = FeaturePrefsStore.batch801.v802dump
    FeaturePrefsStore.batch801.v802dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v802: duplicate mode
internal fun PlayerActivity.showV802DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v802duplicate
    FeaturePrefsStore.batch801.v802duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v802: duration level
internal fun PlayerActivity.showV802DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v802: dynamic level
internal fun PlayerActivity.showV802DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v802: echo level
internal fun PlayerActivity.showV802EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v802: edge level
internal fun PlayerActivity.showV802EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v802: edit level
internal fun PlayerActivity.showV802EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v802: effect mode
internal fun PlayerActivity.showV802EffectToggle() {
    val current = FeaturePrefsStore.batch801.v802effect
    FeaturePrefsStore.batch801.v802effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v802: element mode
internal fun PlayerActivity.showV802ElementToggle() {
    val current = FeaturePrefsStore.batch801.v802element
    FeaturePrefsStore.batch801.v802element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v802: embed mode
internal fun PlayerActivity.showV802EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v802embed
    FeaturePrefsStore.batch801.v802embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v802: emit mode
internal fun PlayerActivity.showV802EmitToggle() {
    val current = FeaturePrefsStore.batch801.v802emit
    FeaturePrefsStore.batch801.v802emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v802: empty mode
internal fun PlayerActivity.showV802EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v802empty
    FeaturePrefsStore.batch801.v802empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v803: driver mode
internal fun PlayerActivity.showV803DriverToggle() {
    val current = FeaturePrefsStore.batch801.v803driver
    FeaturePrefsStore.batch801.v803driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v803: drop mode
internal fun PlayerActivity.showV803DropToggle() {
    val current = FeaturePrefsStore.batch801.v803drop
    FeaturePrefsStore.batch801.v803drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v803: dry mode
internal fun PlayerActivity.showV803DryToggle() {
    val current = FeaturePrefsStore.batch801.v803dry
    FeaturePrefsStore.batch801.v803dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v803: dump mode
internal fun PlayerActivity.showV803DumpToggle() {
    val current = FeaturePrefsStore.batch801.v803dump
    FeaturePrefsStore.batch801.v803dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v803: duplicate mode
internal fun PlayerActivity.showV803DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v803duplicate
    FeaturePrefsStore.batch801.v803duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v803: duration level
internal fun PlayerActivity.showV803DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v803: dynamic level
internal fun PlayerActivity.showV803DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v803: echo level
internal fun PlayerActivity.showV803EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v803: edge level
internal fun PlayerActivity.showV803EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v803: edit level
internal fun PlayerActivity.showV803EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v803: effect mode
internal fun PlayerActivity.showV803EffectToggle() {
    val current = FeaturePrefsStore.batch801.v803effect
    FeaturePrefsStore.batch801.v803effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v803: element mode
internal fun PlayerActivity.showV803ElementToggle() {
    val current = FeaturePrefsStore.batch801.v803element
    FeaturePrefsStore.batch801.v803element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v803: embed mode
internal fun PlayerActivity.showV803EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v803embed
    FeaturePrefsStore.batch801.v803embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v803: emit mode
internal fun PlayerActivity.showV803EmitToggle() {
    val current = FeaturePrefsStore.batch801.v803emit
    FeaturePrefsStore.batch801.v803emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v803: empty mode
internal fun PlayerActivity.showV803EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v803empty
    FeaturePrefsStore.batch801.v803empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v804: driver mode
internal fun PlayerActivity.showV804DriverToggle() {
    val current = FeaturePrefsStore.batch801.v804driver
    FeaturePrefsStore.batch801.v804driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v804: drop mode
internal fun PlayerActivity.showV804DropToggle() {
    val current = FeaturePrefsStore.batch801.v804drop
    FeaturePrefsStore.batch801.v804drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v804: dry mode
internal fun PlayerActivity.showV804DryToggle() {
    val current = FeaturePrefsStore.batch801.v804dry
    FeaturePrefsStore.batch801.v804dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v804: dump mode
internal fun PlayerActivity.showV804DumpToggle() {
    val current = FeaturePrefsStore.batch801.v804dump
    FeaturePrefsStore.batch801.v804dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v804: duplicate mode
internal fun PlayerActivity.showV804DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v804duplicate
    FeaturePrefsStore.batch801.v804duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v804: duration level
internal fun PlayerActivity.showV804DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v804: dynamic level
internal fun PlayerActivity.showV804DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v804: echo level
internal fun PlayerActivity.showV804EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v804: edge level
internal fun PlayerActivity.showV804EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v804: edit level
internal fun PlayerActivity.showV804EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v804: effect mode
internal fun PlayerActivity.showV804EffectToggle() {
    val current = FeaturePrefsStore.batch801.v804effect
    FeaturePrefsStore.batch801.v804effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v804: element mode
internal fun PlayerActivity.showV804ElementToggle() {
    val current = FeaturePrefsStore.batch801.v804element
    FeaturePrefsStore.batch801.v804element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v804: embed mode
internal fun PlayerActivity.showV804EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v804embed
    FeaturePrefsStore.batch801.v804embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v804: emit mode
internal fun PlayerActivity.showV804EmitToggle() {
    val current = FeaturePrefsStore.batch801.v804emit
    FeaturePrefsStore.batch801.v804emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v804: empty mode
internal fun PlayerActivity.showV804EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v804empty
    FeaturePrefsStore.batch801.v804empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v805: driver mode
internal fun PlayerActivity.showV805DriverToggle() {
    val current = FeaturePrefsStore.batch801.v805driver
    FeaturePrefsStore.batch801.v805driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v805: drop mode
internal fun PlayerActivity.showV805DropToggle() {
    val current = FeaturePrefsStore.batch801.v805drop
    FeaturePrefsStore.batch801.v805drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v805: dry mode
internal fun PlayerActivity.showV805DryToggle() {
    val current = FeaturePrefsStore.batch801.v805dry
    FeaturePrefsStore.batch801.v805dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v805: dump mode
internal fun PlayerActivity.showV805DumpToggle() {
    val current = FeaturePrefsStore.batch801.v805dump
    FeaturePrefsStore.batch801.v805dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v805: duplicate mode
internal fun PlayerActivity.showV805DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v805duplicate
    FeaturePrefsStore.batch801.v805duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v805: duration level
internal fun PlayerActivity.showV805DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v805: dynamic level
internal fun PlayerActivity.showV805DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v805: echo level
internal fun PlayerActivity.showV805EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v805: edge level
internal fun PlayerActivity.showV805EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v805: edit level
internal fun PlayerActivity.showV805EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v805: effect mode
internal fun PlayerActivity.showV805EffectToggle() {
    val current = FeaturePrefsStore.batch801.v805effect
    FeaturePrefsStore.batch801.v805effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v805: element mode
internal fun PlayerActivity.showV805ElementToggle() {
    val current = FeaturePrefsStore.batch801.v805element
    FeaturePrefsStore.batch801.v805element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v805: embed mode
internal fun PlayerActivity.showV805EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v805embed
    FeaturePrefsStore.batch801.v805embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v805: emit mode
internal fun PlayerActivity.showV805EmitToggle() {
    val current = FeaturePrefsStore.batch801.v805emit
    FeaturePrefsStore.batch801.v805emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v805: empty mode
internal fun PlayerActivity.showV805EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v805empty
    FeaturePrefsStore.batch801.v805empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v806: driver mode
internal fun PlayerActivity.showV806DriverToggle() {
    val current = FeaturePrefsStore.batch801.v806driver
    FeaturePrefsStore.batch801.v806driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v806: drop mode
internal fun PlayerActivity.showV806DropToggle() {
    val current = FeaturePrefsStore.batch801.v806drop
    FeaturePrefsStore.batch801.v806drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v806: dry mode
internal fun PlayerActivity.showV806DryToggle() {
    val current = FeaturePrefsStore.batch801.v806dry
    FeaturePrefsStore.batch801.v806dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v806: dump mode
internal fun PlayerActivity.showV806DumpToggle() {
    val current = FeaturePrefsStore.batch801.v806dump
    FeaturePrefsStore.batch801.v806dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v806: duplicate mode
internal fun PlayerActivity.showV806DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v806duplicate
    FeaturePrefsStore.batch801.v806duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v806: duration level
internal fun PlayerActivity.showV806DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v806: dynamic level
internal fun PlayerActivity.showV806DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v806: echo level
internal fun PlayerActivity.showV806EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v806: edge level
internal fun PlayerActivity.showV806EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v806: edit level
internal fun PlayerActivity.showV806EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v806: effect mode
internal fun PlayerActivity.showV806EffectToggle() {
    val current = FeaturePrefsStore.batch801.v806effect
    FeaturePrefsStore.batch801.v806effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v806: element mode
internal fun PlayerActivity.showV806ElementToggle() {
    val current = FeaturePrefsStore.batch801.v806element
    FeaturePrefsStore.batch801.v806element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v806: embed mode
internal fun PlayerActivity.showV806EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v806embed
    FeaturePrefsStore.batch801.v806embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v806: emit mode
internal fun PlayerActivity.showV806EmitToggle() {
    val current = FeaturePrefsStore.batch801.v806emit
    FeaturePrefsStore.batch801.v806emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v806: empty mode
internal fun PlayerActivity.showV806EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v806empty
    FeaturePrefsStore.batch801.v806empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v807: driver mode
internal fun PlayerActivity.showV807DriverToggle() {
    val current = FeaturePrefsStore.batch801.v807driver
    FeaturePrefsStore.batch801.v807driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v807: drop mode
internal fun PlayerActivity.showV807DropToggle() {
    val current = FeaturePrefsStore.batch801.v807drop
    FeaturePrefsStore.batch801.v807drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v807: dry mode
internal fun PlayerActivity.showV807DryToggle() {
    val current = FeaturePrefsStore.batch801.v807dry
    FeaturePrefsStore.batch801.v807dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v807: dump mode
internal fun PlayerActivity.showV807DumpToggle() {
    val current = FeaturePrefsStore.batch801.v807dump
    FeaturePrefsStore.batch801.v807dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v807: duplicate mode
internal fun PlayerActivity.showV807DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v807duplicate
    FeaturePrefsStore.batch801.v807duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v807: duration level
internal fun PlayerActivity.showV807DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v807: dynamic level
internal fun PlayerActivity.showV807DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v807: echo level
internal fun PlayerActivity.showV807EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v807: edge level
internal fun PlayerActivity.showV807EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v807: edit level
internal fun PlayerActivity.showV807EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v807: effect mode
internal fun PlayerActivity.showV807EffectToggle() {
    val current = FeaturePrefsStore.batch801.v807effect
    FeaturePrefsStore.batch801.v807effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v807: element mode
internal fun PlayerActivity.showV807ElementToggle() {
    val current = FeaturePrefsStore.batch801.v807element
    FeaturePrefsStore.batch801.v807element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v807: embed mode
internal fun PlayerActivity.showV807EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v807embed
    FeaturePrefsStore.batch801.v807embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v807: emit mode
internal fun PlayerActivity.showV807EmitToggle() {
    val current = FeaturePrefsStore.batch801.v807emit
    FeaturePrefsStore.batch801.v807emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v807: empty mode
internal fun PlayerActivity.showV807EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v807empty
    FeaturePrefsStore.batch801.v807empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v808: driver mode
internal fun PlayerActivity.showV808DriverToggle() {
    val current = FeaturePrefsStore.batch801.v808driver
    FeaturePrefsStore.batch801.v808driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v808: drop mode
internal fun PlayerActivity.showV808DropToggle() {
    val current = FeaturePrefsStore.batch801.v808drop
    FeaturePrefsStore.batch801.v808drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v808: dry mode
internal fun PlayerActivity.showV808DryToggle() {
    val current = FeaturePrefsStore.batch801.v808dry
    FeaturePrefsStore.batch801.v808dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v808: dump mode
internal fun PlayerActivity.showV808DumpToggle() {
    val current = FeaturePrefsStore.batch801.v808dump
    FeaturePrefsStore.batch801.v808dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v808: duplicate mode
internal fun PlayerActivity.showV808DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v808duplicate
    FeaturePrefsStore.batch801.v808duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v808: duration level
internal fun PlayerActivity.showV808DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v808: dynamic level
internal fun PlayerActivity.showV808DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v808: echo level
internal fun PlayerActivity.showV808EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v808: edge level
internal fun PlayerActivity.showV808EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v808: edit level
internal fun PlayerActivity.showV808EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v808: effect mode
internal fun PlayerActivity.showV808EffectToggle() {
    val current = FeaturePrefsStore.batch801.v808effect
    FeaturePrefsStore.batch801.v808effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v808: element mode
internal fun PlayerActivity.showV808ElementToggle() {
    val current = FeaturePrefsStore.batch801.v808element
    FeaturePrefsStore.batch801.v808element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v808: embed mode
internal fun PlayerActivity.showV808EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v808embed
    FeaturePrefsStore.batch801.v808embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v808: emit mode
internal fun PlayerActivity.showV808EmitToggle() {
    val current = FeaturePrefsStore.batch801.v808emit
    FeaturePrefsStore.batch801.v808emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v808: empty mode
internal fun PlayerActivity.showV808EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v808empty
    FeaturePrefsStore.batch801.v808empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v809: driver mode
internal fun PlayerActivity.showV809DriverToggle() {
    val current = FeaturePrefsStore.batch801.v809driver
    FeaturePrefsStore.batch801.v809driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v809: drop mode
internal fun PlayerActivity.showV809DropToggle() {
    val current = FeaturePrefsStore.batch801.v809drop
    FeaturePrefsStore.batch801.v809drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v809: dry mode
internal fun PlayerActivity.showV809DryToggle() {
    val current = FeaturePrefsStore.batch801.v809dry
    FeaturePrefsStore.batch801.v809dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v809: dump mode
internal fun PlayerActivity.showV809DumpToggle() {
    val current = FeaturePrefsStore.batch801.v809dump
    FeaturePrefsStore.batch801.v809dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v809: duplicate mode
internal fun PlayerActivity.showV809DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v809duplicate
    FeaturePrefsStore.batch801.v809duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v809: duration level
internal fun PlayerActivity.showV809DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v809: dynamic level
internal fun PlayerActivity.showV809DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v809: echo level
internal fun PlayerActivity.showV809EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v809: edge level
internal fun PlayerActivity.showV809EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v809: edit level
internal fun PlayerActivity.showV809EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v809: effect mode
internal fun PlayerActivity.showV809EffectToggle() {
    val current = FeaturePrefsStore.batch801.v809effect
    FeaturePrefsStore.batch801.v809effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v809: element mode
internal fun PlayerActivity.showV809ElementToggle() {
    val current = FeaturePrefsStore.batch801.v809element
    FeaturePrefsStore.batch801.v809element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v809: embed mode
internal fun PlayerActivity.showV809EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v809embed
    FeaturePrefsStore.batch801.v809embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v809: emit mode
internal fun PlayerActivity.showV809EmitToggle() {
    val current = FeaturePrefsStore.batch801.v809emit
    FeaturePrefsStore.batch801.v809emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v809: empty mode
internal fun PlayerActivity.showV809EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v809empty
    FeaturePrefsStore.batch801.v809empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v810: driver mode
internal fun PlayerActivity.showV810DriverToggle() {
    val current = FeaturePrefsStore.batch801.v810driver
    FeaturePrefsStore.batch801.v810driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v810: drop mode
internal fun PlayerActivity.showV810DropToggle() {
    val current = FeaturePrefsStore.batch801.v810drop
    FeaturePrefsStore.batch801.v810drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v810: dry mode
internal fun PlayerActivity.showV810DryToggle() {
    val current = FeaturePrefsStore.batch801.v810dry
    FeaturePrefsStore.batch801.v810dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v810: dump mode
internal fun PlayerActivity.showV810DumpToggle() {
    val current = FeaturePrefsStore.batch801.v810dump
    FeaturePrefsStore.batch801.v810dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v810: duplicate mode
internal fun PlayerActivity.showV810DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v810duplicate
    FeaturePrefsStore.batch801.v810duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v810: duration level
internal fun PlayerActivity.showV810DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v810: dynamic level
internal fun PlayerActivity.showV810DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v810: echo level
internal fun PlayerActivity.showV810EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v810: edge level
internal fun PlayerActivity.showV810EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v810: edit level
internal fun PlayerActivity.showV810EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v810: effect mode
internal fun PlayerActivity.showV810EffectToggle() {
    val current = FeaturePrefsStore.batch801.v810effect
    FeaturePrefsStore.batch801.v810effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v810: element mode
internal fun PlayerActivity.showV810ElementToggle() {
    val current = FeaturePrefsStore.batch801.v810element
    FeaturePrefsStore.batch801.v810element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v810: embed mode
internal fun PlayerActivity.showV810EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v810embed
    FeaturePrefsStore.batch801.v810embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v810: emit mode
internal fun PlayerActivity.showV810EmitToggle() {
    val current = FeaturePrefsStore.batch801.v810emit
    FeaturePrefsStore.batch801.v810emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v810: empty mode
internal fun PlayerActivity.showV810EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v810empty
    FeaturePrefsStore.batch801.v810empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

