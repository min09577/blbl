package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v711: batch mode
internal fun PlayerActivity.showV711BatchToggle() {
    val current = FeaturePrefsStore.batch711.v711batch
    FeaturePrefsStore.batch711.v711batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v711: beacon mode
internal fun PlayerActivity.showV711BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v711beacon
    FeaturePrefsStore.batch711.v711beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v711: beam mode
internal fun PlayerActivity.showV711BeamToggle() {
    val current = FeaturePrefsStore.batch711.v711beam
    FeaturePrefsStore.batch711.v711beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v711: before mode
internal fun PlayerActivity.showV711BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v711before
    FeaturePrefsStore.batch711.v711before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v711: begin mode
internal fun PlayerActivity.showV711BeginToggle() {
    val current = FeaturePrefsStore.batch711.v711begin
    FeaturePrefsStore.batch711.v711begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v711: behavior level
internal fun PlayerActivity.showV711BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v711: benchmark level
internal fun PlayerActivity.showV711BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v711: beta level
internal fun PlayerActivity.showV711BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v711: binary level
internal fun PlayerActivity.showV711BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v711: bind level
internal fun PlayerActivity.showV711BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v711bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v711bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v711: bitmap setting
internal fun PlayerActivity.showV711BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v711bitmap
    FeaturePrefsStore.batch711.v711bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v711: blank setting
internal fun PlayerActivity.showV711BlankToggle() {
    val current = FeaturePrefsStore.batch711.v711blank
    FeaturePrefsStore.batch711.v711blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v711: blend setting
internal fun PlayerActivity.showV711BlendToggle() {
    val current = FeaturePrefsStore.batch711.v711blend
    FeaturePrefsStore.batch711.v711blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v711: block setting
internal fun PlayerActivity.showV711BlockToggle() {
    val current = FeaturePrefsStore.batch711.v711block
    FeaturePrefsStore.batch711.v711block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v711: boolean setting
internal fun PlayerActivity.showV711BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v711boolean
    FeaturePrefsStore.batch711.v711boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v712: batch mode
internal fun PlayerActivity.showV712BatchToggle() {
    val current = FeaturePrefsStore.batch711.v712batch
    FeaturePrefsStore.batch711.v712batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v712: beacon mode
internal fun PlayerActivity.showV712BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v712beacon
    FeaturePrefsStore.batch711.v712beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v712: beam mode
internal fun PlayerActivity.showV712BeamToggle() {
    val current = FeaturePrefsStore.batch711.v712beam
    FeaturePrefsStore.batch711.v712beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v712: before mode
internal fun PlayerActivity.showV712BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v712before
    FeaturePrefsStore.batch711.v712before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v712: begin mode
internal fun PlayerActivity.showV712BeginToggle() {
    val current = FeaturePrefsStore.batch711.v712begin
    FeaturePrefsStore.batch711.v712begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v712: behavior level
internal fun PlayerActivity.showV712BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v712: benchmark level
internal fun PlayerActivity.showV712BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v712: beta level
internal fun PlayerActivity.showV712BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v712: binary level
internal fun PlayerActivity.showV712BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v712: bind level
internal fun PlayerActivity.showV712BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v712bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v712bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v712: bitmap setting
internal fun PlayerActivity.showV712BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v712bitmap
    FeaturePrefsStore.batch711.v712bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v712: blank setting
internal fun PlayerActivity.showV712BlankToggle() {
    val current = FeaturePrefsStore.batch711.v712blank
    FeaturePrefsStore.batch711.v712blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v712: blend setting
internal fun PlayerActivity.showV712BlendToggle() {
    val current = FeaturePrefsStore.batch711.v712blend
    FeaturePrefsStore.batch711.v712blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v712: block setting
internal fun PlayerActivity.showV712BlockToggle() {
    val current = FeaturePrefsStore.batch711.v712block
    FeaturePrefsStore.batch711.v712block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v712: boolean setting
internal fun PlayerActivity.showV712BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v712boolean
    FeaturePrefsStore.batch711.v712boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v713: batch mode
internal fun PlayerActivity.showV713BatchToggle() {
    val current = FeaturePrefsStore.batch711.v713batch
    FeaturePrefsStore.batch711.v713batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v713: beacon mode
internal fun PlayerActivity.showV713BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v713beacon
    FeaturePrefsStore.batch711.v713beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v713: beam mode
internal fun PlayerActivity.showV713BeamToggle() {
    val current = FeaturePrefsStore.batch711.v713beam
    FeaturePrefsStore.batch711.v713beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v713: before mode
internal fun PlayerActivity.showV713BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v713before
    FeaturePrefsStore.batch711.v713before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v713: begin mode
internal fun PlayerActivity.showV713BeginToggle() {
    val current = FeaturePrefsStore.batch711.v713begin
    FeaturePrefsStore.batch711.v713begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v713: behavior level
internal fun PlayerActivity.showV713BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v713: benchmark level
internal fun PlayerActivity.showV713BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v713: beta level
internal fun PlayerActivity.showV713BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v713: binary level
internal fun PlayerActivity.showV713BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v713: bind level
internal fun PlayerActivity.showV713BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v713bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v713bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v713: bitmap setting
internal fun PlayerActivity.showV713BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v713bitmap
    FeaturePrefsStore.batch711.v713bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v713: blank setting
internal fun PlayerActivity.showV713BlankToggle() {
    val current = FeaturePrefsStore.batch711.v713blank
    FeaturePrefsStore.batch711.v713blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v713: blend setting
internal fun PlayerActivity.showV713BlendToggle() {
    val current = FeaturePrefsStore.batch711.v713blend
    FeaturePrefsStore.batch711.v713blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v713: block setting
internal fun PlayerActivity.showV713BlockToggle() {
    val current = FeaturePrefsStore.batch711.v713block
    FeaturePrefsStore.batch711.v713block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v713: boolean setting
internal fun PlayerActivity.showV713BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v713boolean
    FeaturePrefsStore.batch711.v713boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v714: batch mode
internal fun PlayerActivity.showV714BatchToggle() {
    val current = FeaturePrefsStore.batch711.v714batch
    FeaturePrefsStore.batch711.v714batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v714: beacon mode
internal fun PlayerActivity.showV714BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v714beacon
    FeaturePrefsStore.batch711.v714beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v714: beam mode
internal fun PlayerActivity.showV714BeamToggle() {
    val current = FeaturePrefsStore.batch711.v714beam
    FeaturePrefsStore.batch711.v714beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v714: before mode
internal fun PlayerActivity.showV714BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v714before
    FeaturePrefsStore.batch711.v714before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v714: begin mode
internal fun PlayerActivity.showV714BeginToggle() {
    val current = FeaturePrefsStore.batch711.v714begin
    FeaturePrefsStore.batch711.v714begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v714: behavior level
internal fun PlayerActivity.showV714BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v714: benchmark level
internal fun PlayerActivity.showV714BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v714: beta level
internal fun PlayerActivity.showV714BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v714: binary level
internal fun PlayerActivity.showV714BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v714: bind level
internal fun PlayerActivity.showV714BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v714bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v714bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v714: bitmap setting
internal fun PlayerActivity.showV714BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v714bitmap
    FeaturePrefsStore.batch711.v714bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v714: blank setting
internal fun PlayerActivity.showV714BlankToggle() {
    val current = FeaturePrefsStore.batch711.v714blank
    FeaturePrefsStore.batch711.v714blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v714: blend setting
internal fun PlayerActivity.showV714BlendToggle() {
    val current = FeaturePrefsStore.batch711.v714blend
    FeaturePrefsStore.batch711.v714blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v714: block setting
internal fun PlayerActivity.showV714BlockToggle() {
    val current = FeaturePrefsStore.batch711.v714block
    FeaturePrefsStore.batch711.v714block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v714: boolean setting
internal fun PlayerActivity.showV714BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v714boolean
    FeaturePrefsStore.batch711.v714boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v715: batch mode
internal fun PlayerActivity.showV715BatchToggle() {
    val current = FeaturePrefsStore.batch711.v715batch
    FeaturePrefsStore.batch711.v715batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v715: beacon mode
internal fun PlayerActivity.showV715BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v715beacon
    FeaturePrefsStore.batch711.v715beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v715: beam mode
internal fun PlayerActivity.showV715BeamToggle() {
    val current = FeaturePrefsStore.batch711.v715beam
    FeaturePrefsStore.batch711.v715beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v715: before mode
internal fun PlayerActivity.showV715BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v715before
    FeaturePrefsStore.batch711.v715before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v715: begin mode
internal fun PlayerActivity.showV715BeginToggle() {
    val current = FeaturePrefsStore.batch711.v715begin
    FeaturePrefsStore.batch711.v715begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v715: behavior level
internal fun PlayerActivity.showV715BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v715: benchmark level
internal fun PlayerActivity.showV715BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v715: beta level
internal fun PlayerActivity.showV715BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v715: binary level
internal fun PlayerActivity.showV715BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v715: bind level
internal fun PlayerActivity.showV715BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v715bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v715bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v715: bitmap setting
internal fun PlayerActivity.showV715BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v715bitmap
    FeaturePrefsStore.batch711.v715bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v715: blank setting
internal fun PlayerActivity.showV715BlankToggle() {
    val current = FeaturePrefsStore.batch711.v715blank
    FeaturePrefsStore.batch711.v715blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v715: blend setting
internal fun PlayerActivity.showV715BlendToggle() {
    val current = FeaturePrefsStore.batch711.v715blend
    FeaturePrefsStore.batch711.v715blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v715: block setting
internal fun PlayerActivity.showV715BlockToggle() {
    val current = FeaturePrefsStore.batch711.v715block
    FeaturePrefsStore.batch711.v715block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v715: boolean setting
internal fun PlayerActivity.showV715BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v715boolean
    FeaturePrefsStore.batch711.v715boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v716: batch mode
internal fun PlayerActivity.showV716BatchToggle() {
    val current = FeaturePrefsStore.batch711.v716batch
    FeaturePrefsStore.batch711.v716batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v716: beacon mode
internal fun PlayerActivity.showV716BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v716beacon
    FeaturePrefsStore.batch711.v716beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v716: beam mode
internal fun PlayerActivity.showV716BeamToggle() {
    val current = FeaturePrefsStore.batch711.v716beam
    FeaturePrefsStore.batch711.v716beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v716: before mode
internal fun PlayerActivity.showV716BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v716before
    FeaturePrefsStore.batch711.v716before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v716: begin mode
internal fun PlayerActivity.showV716BeginToggle() {
    val current = FeaturePrefsStore.batch711.v716begin
    FeaturePrefsStore.batch711.v716begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v716: behavior level
internal fun PlayerActivity.showV716BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v716: benchmark level
internal fun PlayerActivity.showV716BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v716: beta level
internal fun PlayerActivity.showV716BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v716: binary level
internal fun PlayerActivity.showV716BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v716: bind level
internal fun PlayerActivity.showV716BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v716bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v716bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v716: bitmap setting
internal fun PlayerActivity.showV716BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v716bitmap
    FeaturePrefsStore.batch711.v716bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v716: blank setting
internal fun PlayerActivity.showV716BlankToggle() {
    val current = FeaturePrefsStore.batch711.v716blank
    FeaturePrefsStore.batch711.v716blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v716: blend setting
internal fun PlayerActivity.showV716BlendToggle() {
    val current = FeaturePrefsStore.batch711.v716blend
    FeaturePrefsStore.batch711.v716blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v716: block setting
internal fun PlayerActivity.showV716BlockToggle() {
    val current = FeaturePrefsStore.batch711.v716block
    FeaturePrefsStore.batch711.v716block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v716: boolean setting
internal fun PlayerActivity.showV716BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v716boolean
    FeaturePrefsStore.batch711.v716boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v717: batch mode
internal fun PlayerActivity.showV717BatchToggle() {
    val current = FeaturePrefsStore.batch711.v717batch
    FeaturePrefsStore.batch711.v717batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v717: beacon mode
internal fun PlayerActivity.showV717BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v717beacon
    FeaturePrefsStore.batch711.v717beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v717: beam mode
internal fun PlayerActivity.showV717BeamToggle() {
    val current = FeaturePrefsStore.batch711.v717beam
    FeaturePrefsStore.batch711.v717beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v717: before mode
internal fun PlayerActivity.showV717BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v717before
    FeaturePrefsStore.batch711.v717before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v717: begin mode
internal fun PlayerActivity.showV717BeginToggle() {
    val current = FeaturePrefsStore.batch711.v717begin
    FeaturePrefsStore.batch711.v717begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v717: behavior level
internal fun PlayerActivity.showV717BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v717: benchmark level
internal fun PlayerActivity.showV717BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v717: beta level
internal fun PlayerActivity.showV717BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v717: binary level
internal fun PlayerActivity.showV717BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v717: bind level
internal fun PlayerActivity.showV717BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v717bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v717bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v717: bitmap setting
internal fun PlayerActivity.showV717BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v717bitmap
    FeaturePrefsStore.batch711.v717bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v717: blank setting
internal fun PlayerActivity.showV717BlankToggle() {
    val current = FeaturePrefsStore.batch711.v717blank
    FeaturePrefsStore.batch711.v717blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v717: blend setting
internal fun PlayerActivity.showV717BlendToggle() {
    val current = FeaturePrefsStore.batch711.v717blend
    FeaturePrefsStore.batch711.v717blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v717: block setting
internal fun PlayerActivity.showV717BlockToggle() {
    val current = FeaturePrefsStore.batch711.v717block
    FeaturePrefsStore.batch711.v717block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v717: boolean setting
internal fun PlayerActivity.showV717BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v717boolean
    FeaturePrefsStore.batch711.v717boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v718: batch mode
internal fun PlayerActivity.showV718BatchToggle() {
    val current = FeaturePrefsStore.batch711.v718batch
    FeaturePrefsStore.batch711.v718batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v718: beacon mode
internal fun PlayerActivity.showV718BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v718beacon
    FeaturePrefsStore.batch711.v718beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v718: beam mode
internal fun PlayerActivity.showV718BeamToggle() {
    val current = FeaturePrefsStore.batch711.v718beam
    FeaturePrefsStore.batch711.v718beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v718: before mode
internal fun PlayerActivity.showV718BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v718before
    FeaturePrefsStore.batch711.v718before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v718: begin mode
internal fun PlayerActivity.showV718BeginToggle() {
    val current = FeaturePrefsStore.batch711.v718begin
    FeaturePrefsStore.batch711.v718begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v718: behavior level
internal fun PlayerActivity.showV718BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v718: benchmark level
internal fun PlayerActivity.showV718BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v718: beta level
internal fun PlayerActivity.showV718BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v718: binary level
internal fun PlayerActivity.showV718BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v718: bind level
internal fun PlayerActivity.showV718BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v718bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v718bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v718: bitmap setting
internal fun PlayerActivity.showV718BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v718bitmap
    FeaturePrefsStore.batch711.v718bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v718: blank setting
internal fun PlayerActivity.showV718BlankToggle() {
    val current = FeaturePrefsStore.batch711.v718blank
    FeaturePrefsStore.batch711.v718blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v718: blend setting
internal fun PlayerActivity.showV718BlendToggle() {
    val current = FeaturePrefsStore.batch711.v718blend
    FeaturePrefsStore.batch711.v718blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v718: block setting
internal fun PlayerActivity.showV718BlockToggle() {
    val current = FeaturePrefsStore.batch711.v718block
    FeaturePrefsStore.batch711.v718block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v718: boolean setting
internal fun PlayerActivity.showV718BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v718boolean
    FeaturePrefsStore.batch711.v718boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v719: batch mode
internal fun PlayerActivity.showV719BatchToggle() {
    val current = FeaturePrefsStore.batch711.v719batch
    FeaturePrefsStore.batch711.v719batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v719: beacon mode
internal fun PlayerActivity.showV719BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v719beacon
    FeaturePrefsStore.batch711.v719beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v719: beam mode
internal fun PlayerActivity.showV719BeamToggle() {
    val current = FeaturePrefsStore.batch711.v719beam
    FeaturePrefsStore.batch711.v719beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v719: before mode
internal fun PlayerActivity.showV719BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v719before
    FeaturePrefsStore.batch711.v719before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v719: begin mode
internal fun PlayerActivity.showV719BeginToggle() {
    val current = FeaturePrefsStore.batch711.v719begin
    FeaturePrefsStore.batch711.v719begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v719: behavior level
internal fun PlayerActivity.showV719BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v719: benchmark level
internal fun PlayerActivity.showV719BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v719: beta level
internal fun PlayerActivity.showV719BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v719: binary level
internal fun PlayerActivity.showV719BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v719: bind level
internal fun PlayerActivity.showV719BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v719bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v719bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v719: bitmap setting
internal fun PlayerActivity.showV719BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v719bitmap
    FeaturePrefsStore.batch711.v719bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v719: blank setting
internal fun PlayerActivity.showV719BlankToggle() {
    val current = FeaturePrefsStore.batch711.v719blank
    FeaturePrefsStore.batch711.v719blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v719: blend setting
internal fun PlayerActivity.showV719BlendToggle() {
    val current = FeaturePrefsStore.batch711.v719blend
    FeaturePrefsStore.batch711.v719blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v719: block setting
internal fun PlayerActivity.showV719BlockToggle() {
    val current = FeaturePrefsStore.batch711.v719block
    FeaturePrefsStore.batch711.v719block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v719: boolean setting
internal fun PlayerActivity.showV719BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v719boolean
    FeaturePrefsStore.batch711.v719boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

// v720: batch mode
internal fun PlayerActivity.showV720BatchToggle() {
    val current = FeaturePrefsStore.batch711.v720batch
    FeaturePrefsStore.batch711.v720batch = !current
    AppToast.show(this, "batch mode: ${if (!current) "ON" else "OFF"}")
}

// v720: beacon mode
internal fun PlayerActivity.showV720BeaconToggle() {
    val current = FeaturePrefsStore.batch711.v720beacon
    FeaturePrefsStore.batch711.v720beacon = !current
    AppToast.show(this, "beacon mode: ${if (!current) "ON" else "OFF"}")
}

// v720: beam mode
internal fun PlayerActivity.showV720BeamToggle() {
    val current = FeaturePrefsStore.batch711.v720beam
    FeaturePrefsStore.batch711.v720beam = !current
    AppToast.show(this, "beam mode: ${if (!current) "ON" else "OFF"}")
}

// v720: before mode
internal fun PlayerActivity.showV720BeforeToggle() {
    val current = FeaturePrefsStore.batch711.v720before
    FeaturePrefsStore.batch711.v720before = !current
    AppToast.show(this, "before mode: ${if (!current) "ON" else "OFF"}")
}

// v720: begin mode
internal fun PlayerActivity.showV720BeginToggle() {
    val current = FeaturePrefsStore.batch711.v720begin
    FeaturePrefsStore.batch711.v720begin = !current
    AppToast.show(this, "begin mode: ${if (!current) "ON" else "OFF"}")
}

// v720: behavior level
internal fun PlayerActivity.showV720BehaviorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720behavior).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "behavior level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720behavior = value
        AppToast.show(this, "behavior level: $value")
    }
}

// v720: benchmark level
internal fun PlayerActivity.showV720BenchmarkDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720benchmark).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "benchmark level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720benchmark = value
        AppToast.show(this, "benchmark level: $value")
    }
}

// v720: beta level
internal fun PlayerActivity.showV720BetaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720beta).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beta level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720beta = value
        AppToast.show(this, "beta level: $value")
    }
}

// v720: binary level
internal fun PlayerActivity.showV720BinaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720binary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "binary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720binary = value
        AppToast.show(this, "binary level: $value")
    }
}

// v720: bind level
internal fun PlayerActivity.showV720BindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch711.v720bind).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bind level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch711.v720bind = value
        AppToast.show(this, "bind level: $value")
    }
}

// v720: bitmap setting
internal fun PlayerActivity.showV720BitmapToggle() {
    val current = FeaturePrefsStore.batch711.v720bitmap
    FeaturePrefsStore.batch711.v720bitmap = !current
    AppToast.show(this, "bitmap setting: ${if (!current) "ON" else "OFF"}")
}

// v720: blank setting
internal fun PlayerActivity.showV720BlankToggle() {
    val current = FeaturePrefsStore.batch711.v720blank
    FeaturePrefsStore.batch711.v720blank = !current
    AppToast.show(this, "blank setting: ${if (!current) "ON" else "OFF"}")
}

// v720: blend setting
internal fun PlayerActivity.showV720BlendToggle() {
    val current = FeaturePrefsStore.batch711.v720blend
    FeaturePrefsStore.batch711.v720blend = !current
    AppToast.show(this, "blend setting: ${if (!current) "ON" else "OFF"}")
}

// v720: block setting
internal fun PlayerActivity.showV720BlockToggle() {
    val current = FeaturePrefsStore.batch711.v720block
    FeaturePrefsStore.batch711.v720block = !current
    AppToast.show(this, "block setting: ${if (!current) "ON" else "OFF"}")
}

// v720: boolean setting
internal fun PlayerActivity.showV720BooleanToggle() {
    val current = FeaturePrefsStore.batch711.v720boolean
    FeaturePrefsStore.batch711.v720boolean = !current
    AppToast.show(this, "boolean setting: ${if (!current) "ON" else "OFF"}")
}

