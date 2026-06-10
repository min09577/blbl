package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v881: info mode
internal fun PlayerActivity.showV881InfoToggle() {
    val current = FeaturePrefsStore.batch881.v881info
    FeaturePrefsStore.batch881.v881info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v881: init mode
internal fun PlayerActivity.showV881InitToggle() {
    val current = FeaturePrefsStore.batch881.v881init
    FeaturePrefsStore.batch881.v881init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v881: input mode
internal fun PlayerActivity.showV881InputToggle() {
    val current = FeaturePrefsStore.batch881.v881input
    FeaturePrefsStore.batch881.v881input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v881: insert mode
internal fun PlayerActivity.showV881InsertToggle() {
    val current = FeaturePrefsStore.batch881.v881insert
    FeaturePrefsStore.batch881.v881insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v881: install mode
internal fun PlayerActivity.showV881InstallToggle() {
    val current = FeaturePrefsStore.batch881.v881install
    FeaturePrefsStore.batch881.v881install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v881: instance level
internal fun PlayerActivity.showV881InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v881: intent level
internal fun PlayerActivity.showV881IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v881: interact level
internal fun PlayerActivity.showV881InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v881: interface level
internal fun PlayerActivity.showV881InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v881: internal level
internal fun PlayerActivity.showV881InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v881internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v881internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v881: interval mode
internal fun PlayerActivity.showV881IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v881interval
    FeaturePrefsStore.batch881.v881interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v881: invoke mode
internal fun PlayerActivity.showV881InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v881invoke
    FeaturePrefsStore.batch881.v881invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v881: io mode
internal fun PlayerActivity.showV881IoToggle() {
    val current = FeaturePrefsStore.batch881.v881io
    FeaturePrefsStore.batch881.v881io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v881: item mode
internal fun PlayerActivity.showV881ItemToggle() {
    val current = FeaturePrefsStore.batch881.v881item
    FeaturePrefsStore.batch881.v881item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v881: iterate mode
internal fun PlayerActivity.showV881IterateToggle() {
    val current = FeaturePrefsStore.batch881.v881iterate
    FeaturePrefsStore.batch881.v881iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v882: info mode
internal fun PlayerActivity.showV882InfoToggle() {
    val current = FeaturePrefsStore.batch881.v882info
    FeaturePrefsStore.batch881.v882info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v882: init mode
internal fun PlayerActivity.showV882InitToggle() {
    val current = FeaturePrefsStore.batch881.v882init
    FeaturePrefsStore.batch881.v882init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v882: input mode
internal fun PlayerActivity.showV882InputToggle() {
    val current = FeaturePrefsStore.batch881.v882input
    FeaturePrefsStore.batch881.v882input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v882: insert mode
internal fun PlayerActivity.showV882InsertToggle() {
    val current = FeaturePrefsStore.batch881.v882insert
    FeaturePrefsStore.batch881.v882insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v882: install mode
internal fun PlayerActivity.showV882InstallToggle() {
    val current = FeaturePrefsStore.batch881.v882install
    FeaturePrefsStore.batch881.v882install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v882: instance level
internal fun PlayerActivity.showV882InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v882: intent level
internal fun PlayerActivity.showV882IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v882: interact level
internal fun PlayerActivity.showV882InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v882: interface level
internal fun PlayerActivity.showV882InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v882: internal level
internal fun PlayerActivity.showV882InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v882internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v882internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v882: interval mode
internal fun PlayerActivity.showV882IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v882interval
    FeaturePrefsStore.batch881.v882interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v882: invoke mode
internal fun PlayerActivity.showV882InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v882invoke
    FeaturePrefsStore.batch881.v882invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v882: io mode
internal fun PlayerActivity.showV882IoToggle() {
    val current = FeaturePrefsStore.batch881.v882io
    FeaturePrefsStore.batch881.v882io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v882: item mode
internal fun PlayerActivity.showV882ItemToggle() {
    val current = FeaturePrefsStore.batch881.v882item
    FeaturePrefsStore.batch881.v882item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v882: iterate mode
internal fun PlayerActivity.showV882IterateToggle() {
    val current = FeaturePrefsStore.batch881.v882iterate
    FeaturePrefsStore.batch881.v882iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v883: info mode
internal fun PlayerActivity.showV883InfoToggle() {
    val current = FeaturePrefsStore.batch881.v883info
    FeaturePrefsStore.batch881.v883info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v883: init mode
internal fun PlayerActivity.showV883InitToggle() {
    val current = FeaturePrefsStore.batch881.v883init
    FeaturePrefsStore.batch881.v883init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v883: input mode
internal fun PlayerActivity.showV883InputToggle() {
    val current = FeaturePrefsStore.batch881.v883input
    FeaturePrefsStore.batch881.v883input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v883: insert mode
internal fun PlayerActivity.showV883InsertToggle() {
    val current = FeaturePrefsStore.batch881.v883insert
    FeaturePrefsStore.batch881.v883insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v883: install mode
internal fun PlayerActivity.showV883InstallToggle() {
    val current = FeaturePrefsStore.batch881.v883install
    FeaturePrefsStore.batch881.v883install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v883: instance level
internal fun PlayerActivity.showV883InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v883: intent level
internal fun PlayerActivity.showV883IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v883: interact level
internal fun PlayerActivity.showV883InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v883: interface level
internal fun PlayerActivity.showV883InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v883: internal level
internal fun PlayerActivity.showV883InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v883internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v883internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v883: interval mode
internal fun PlayerActivity.showV883IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v883interval
    FeaturePrefsStore.batch881.v883interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v883: invoke mode
internal fun PlayerActivity.showV883InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v883invoke
    FeaturePrefsStore.batch881.v883invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v883: io mode
internal fun PlayerActivity.showV883IoToggle() {
    val current = FeaturePrefsStore.batch881.v883io
    FeaturePrefsStore.batch881.v883io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v883: item mode
internal fun PlayerActivity.showV883ItemToggle() {
    val current = FeaturePrefsStore.batch881.v883item
    FeaturePrefsStore.batch881.v883item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v883: iterate mode
internal fun PlayerActivity.showV883IterateToggle() {
    val current = FeaturePrefsStore.batch881.v883iterate
    FeaturePrefsStore.batch881.v883iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v884: info mode
internal fun PlayerActivity.showV884InfoToggle() {
    val current = FeaturePrefsStore.batch881.v884info
    FeaturePrefsStore.batch881.v884info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v884: init mode
internal fun PlayerActivity.showV884InitToggle() {
    val current = FeaturePrefsStore.batch881.v884init
    FeaturePrefsStore.batch881.v884init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v884: input mode
internal fun PlayerActivity.showV884InputToggle() {
    val current = FeaturePrefsStore.batch881.v884input
    FeaturePrefsStore.batch881.v884input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v884: insert mode
internal fun PlayerActivity.showV884InsertToggle() {
    val current = FeaturePrefsStore.batch881.v884insert
    FeaturePrefsStore.batch881.v884insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v884: install mode
internal fun PlayerActivity.showV884InstallToggle() {
    val current = FeaturePrefsStore.batch881.v884install
    FeaturePrefsStore.batch881.v884install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v884: instance level
internal fun PlayerActivity.showV884InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v884: intent level
internal fun PlayerActivity.showV884IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v884: interact level
internal fun PlayerActivity.showV884InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v884: interface level
internal fun PlayerActivity.showV884InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v884: internal level
internal fun PlayerActivity.showV884InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v884internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v884internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v884: interval mode
internal fun PlayerActivity.showV884IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v884interval
    FeaturePrefsStore.batch881.v884interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v884: invoke mode
internal fun PlayerActivity.showV884InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v884invoke
    FeaturePrefsStore.batch881.v884invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v884: io mode
internal fun PlayerActivity.showV884IoToggle() {
    val current = FeaturePrefsStore.batch881.v884io
    FeaturePrefsStore.batch881.v884io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v884: item mode
internal fun PlayerActivity.showV884ItemToggle() {
    val current = FeaturePrefsStore.batch881.v884item
    FeaturePrefsStore.batch881.v884item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v884: iterate mode
internal fun PlayerActivity.showV884IterateToggle() {
    val current = FeaturePrefsStore.batch881.v884iterate
    FeaturePrefsStore.batch881.v884iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v885: info mode
internal fun PlayerActivity.showV885InfoToggle() {
    val current = FeaturePrefsStore.batch881.v885info
    FeaturePrefsStore.batch881.v885info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v885: init mode
internal fun PlayerActivity.showV885InitToggle() {
    val current = FeaturePrefsStore.batch881.v885init
    FeaturePrefsStore.batch881.v885init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v885: input mode
internal fun PlayerActivity.showV885InputToggle() {
    val current = FeaturePrefsStore.batch881.v885input
    FeaturePrefsStore.batch881.v885input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v885: insert mode
internal fun PlayerActivity.showV885InsertToggle() {
    val current = FeaturePrefsStore.batch881.v885insert
    FeaturePrefsStore.batch881.v885insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v885: install mode
internal fun PlayerActivity.showV885InstallToggle() {
    val current = FeaturePrefsStore.batch881.v885install
    FeaturePrefsStore.batch881.v885install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v885: instance level
internal fun PlayerActivity.showV885InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v885: intent level
internal fun PlayerActivity.showV885IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v885: interact level
internal fun PlayerActivity.showV885InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v885: interface level
internal fun PlayerActivity.showV885InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v885: internal level
internal fun PlayerActivity.showV885InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v885internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v885internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v885: interval mode
internal fun PlayerActivity.showV885IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v885interval
    FeaturePrefsStore.batch881.v885interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v885: invoke mode
internal fun PlayerActivity.showV885InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v885invoke
    FeaturePrefsStore.batch881.v885invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v885: io mode
internal fun PlayerActivity.showV885IoToggle() {
    val current = FeaturePrefsStore.batch881.v885io
    FeaturePrefsStore.batch881.v885io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v885: item mode
internal fun PlayerActivity.showV885ItemToggle() {
    val current = FeaturePrefsStore.batch881.v885item
    FeaturePrefsStore.batch881.v885item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v885: iterate mode
internal fun PlayerActivity.showV885IterateToggle() {
    val current = FeaturePrefsStore.batch881.v885iterate
    FeaturePrefsStore.batch881.v885iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v886: info mode
internal fun PlayerActivity.showV886InfoToggle() {
    val current = FeaturePrefsStore.batch881.v886info
    FeaturePrefsStore.batch881.v886info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v886: init mode
internal fun PlayerActivity.showV886InitToggle() {
    val current = FeaturePrefsStore.batch881.v886init
    FeaturePrefsStore.batch881.v886init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v886: input mode
internal fun PlayerActivity.showV886InputToggle() {
    val current = FeaturePrefsStore.batch881.v886input
    FeaturePrefsStore.batch881.v886input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v886: insert mode
internal fun PlayerActivity.showV886InsertToggle() {
    val current = FeaturePrefsStore.batch881.v886insert
    FeaturePrefsStore.batch881.v886insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v886: install mode
internal fun PlayerActivity.showV886InstallToggle() {
    val current = FeaturePrefsStore.batch881.v886install
    FeaturePrefsStore.batch881.v886install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v886: instance level
internal fun PlayerActivity.showV886InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v886: intent level
internal fun PlayerActivity.showV886IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v886: interact level
internal fun PlayerActivity.showV886InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v886: interface level
internal fun PlayerActivity.showV886InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v886: internal level
internal fun PlayerActivity.showV886InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v886internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v886internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v886: interval mode
internal fun PlayerActivity.showV886IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v886interval
    FeaturePrefsStore.batch881.v886interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v886: invoke mode
internal fun PlayerActivity.showV886InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v886invoke
    FeaturePrefsStore.batch881.v886invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v886: io mode
internal fun PlayerActivity.showV886IoToggle() {
    val current = FeaturePrefsStore.batch881.v886io
    FeaturePrefsStore.batch881.v886io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v886: item mode
internal fun PlayerActivity.showV886ItemToggle() {
    val current = FeaturePrefsStore.batch881.v886item
    FeaturePrefsStore.batch881.v886item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v886: iterate mode
internal fun PlayerActivity.showV886IterateToggle() {
    val current = FeaturePrefsStore.batch881.v886iterate
    FeaturePrefsStore.batch881.v886iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v887: info mode
internal fun PlayerActivity.showV887InfoToggle() {
    val current = FeaturePrefsStore.batch881.v887info
    FeaturePrefsStore.batch881.v887info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v887: init mode
internal fun PlayerActivity.showV887InitToggle() {
    val current = FeaturePrefsStore.batch881.v887init
    FeaturePrefsStore.batch881.v887init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v887: input mode
internal fun PlayerActivity.showV887InputToggle() {
    val current = FeaturePrefsStore.batch881.v887input
    FeaturePrefsStore.batch881.v887input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v887: insert mode
internal fun PlayerActivity.showV887InsertToggle() {
    val current = FeaturePrefsStore.batch881.v887insert
    FeaturePrefsStore.batch881.v887insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v887: install mode
internal fun PlayerActivity.showV887InstallToggle() {
    val current = FeaturePrefsStore.batch881.v887install
    FeaturePrefsStore.batch881.v887install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v887: instance level
internal fun PlayerActivity.showV887InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v887: intent level
internal fun PlayerActivity.showV887IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v887: interact level
internal fun PlayerActivity.showV887InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v887: interface level
internal fun PlayerActivity.showV887InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v887: internal level
internal fun PlayerActivity.showV887InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v887internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v887internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v887: interval mode
internal fun PlayerActivity.showV887IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v887interval
    FeaturePrefsStore.batch881.v887interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v887: invoke mode
internal fun PlayerActivity.showV887InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v887invoke
    FeaturePrefsStore.batch881.v887invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v887: io mode
internal fun PlayerActivity.showV887IoToggle() {
    val current = FeaturePrefsStore.batch881.v887io
    FeaturePrefsStore.batch881.v887io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v887: item mode
internal fun PlayerActivity.showV887ItemToggle() {
    val current = FeaturePrefsStore.batch881.v887item
    FeaturePrefsStore.batch881.v887item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v887: iterate mode
internal fun PlayerActivity.showV887IterateToggle() {
    val current = FeaturePrefsStore.batch881.v887iterate
    FeaturePrefsStore.batch881.v887iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v888: info mode
internal fun PlayerActivity.showV888InfoToggle() {
    val current = FeaturePrefsStore.batch881.v888info
    FeaturePrefsStore.batch881.v888info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v888: init mode
internal fun PlayerActivity.showV888InitToggle() {
    val current = FeaturePrefsStore.batch881.v888init
    FeaturePrefsStore.batch881.v888init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v888: input mode
internal fun PlayerActivity.showV888InputToggle() {
    val current = FeaturePrefsStore.batch881.v888input
    FeaturePrefsStore.batch881.v888input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v888: insert mode
internal fun PlayerActivity.showV888InsertToggle() {
    val current = FeaturePrefsStore.batch881.v888insert
    FeaturePrefsStore.batch881.v888insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v888: install mode
internal fun PlayerActivity.showV888InstallToggle() {
    val current = FeaturePrefsStore.batch881.v888install
    FeaturePrefsStore.batch881.v888install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v888: instance level
internal fun PlayerActivity.showV888InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v888: intent level
internal fun PlayerActivity.showV888IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v888: interact level
internal fun PlayerActivity.showV888InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v888: interface level
internal fun PlayerActivity.showV888InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v888: internal level
internal fun PlayerActivity.showV888InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v888internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v888internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v888: interval mode
internal fun PlayerActivity.showV888IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v888interval
    FeaturePrefsStore.batch881.v888interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v888: invoke mode
internal fun PlayerActivity.showV888InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v888invoke
    FeaturePrefsStore.batch881.v888invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v888: io mode
internal fun PlayerActivity.showV888IoToggle() {
    val current = FeaturePrefsStore.batch881.v888io
    FeaturePrefsStore.batch881.v888io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v888: item mode
internal fun PlayerActivity.showV888ItemToggle() {
    val current = FeaturePrefsStore.batch881.v888item
    FeaturePrefsStore.batch881.v888item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v888: iterate mode
internal fun PlayerActivity.showV888IterateToggle() {
    val current = FeaturePrefsStore.batch881.v888iterate
    FeaturePrefsStore.batch881.v888iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v889: info mode
internal fun PlayerActivity.showV889InfoToggle() {
    val current = FeaturePrefsStore.batch881.v889info
    FeaturePrefsStore.batch881.v889info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v889: init mode
internal fun PlayerActivity.showV889InitToggle() {
    val current = FeaturePrefsStore.batch881.v889init
    FeaturePrefsStore.batch881.v889init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v889: input mode
internal fun PlayerActivity.showV889InputToggle() {
    val current = FeaturePrefsStore.batch881.v889input
    FeaturePrefsStore.batch881.v889input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v889: insert mode
internal fun PlayerActivity.showV889InsertToggle() {
    val current = FeaturePrefsStore.batch881.v889insert
    FeaturePrefsStore.batch881.v889insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v889: install mode
internal fun PlayerActivity.showV889InstallToggle() {
    val current = FeaturePrefsStore.batch881.v889install
    FeaturePrefsStore.batch881.v889install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v889: instance level
internal fun PlayerActivity.showV889InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v889: intent level
internal fun PlayerActivity.showV889IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v889: interact level
internal fun PlayerActivity.showV889InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v889: interface level
internal fun PlayerActivity.showV889InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v889: internal level
internal fun PlayerActivity.showV889InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v889internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v889internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v889: interval mode
internal fun PlayerActivity.showV889IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v889interval
    FeaturePrefsStore.batch881.v889interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v889: invoke mode
internal fun PlayerActivity.showV889InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v889invoke
    FeaturePrefsStore.batch881.v889invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v889: io mode
internal fun PlayerActivity.showV889IoToggle() {
    val current = FeaturePrefsStore.batch881.v889io
    FeaturePrefsStore.batch881.v889io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v889: item mode
internal fun PlayerActivity.showV889ItemToggle() {
    val current = FeaturePrefsStore.batch881.v889item
    FeaturePrefsStore.batch881.v889item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v889: iterate mode
internal fun PlayerActivity.showV889IterateToggle() {
    val current = FeaturePrefsStore.batch881.v889iterate
    FeaturePrefsStore.batch881.v889iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

// v890: info mode
internal fun PlayerActivity.showV890InfoToggle() {
    val current = FeaturePrefsStore.batch881.v890info
    FeaturePrefsStore.batch881.v890info = !current
    AppToast.show(this, "info: ${if (!current) "ON" else "OFF"}")
}

// v890: init mode
internal fun PlayerActivity.showV890InitToggle() {
    val current = FeaturePrefsStore.batch881.v890init
    FeaturePrefsStore.batch881.v890init = !current
    AppToast.show(this, "init: ${if (!current) "ON" else "OFF"}")
}

// v890: input mode
internal fun PlayerActivity.showV890InputToggle() {
    val current = FeaturePrefsStore.batch881.v890input
    FeaturePrefsStore.batch881.v890input = !current
    AppToast.show(this, "input: ${if (!current) "ON" else "OFF"}")
}

// v890: insert mode
internal fun PlayerActivity.showV890InsertToggle() {
    val current = FeaturePrefsStore.batch881.v890insert
    FeaturePrefsStore.batch881.v890insert = !current
    AppToast.show(this, "insert: ${if (!current) "ON" else "OFF"}")
}

// v890: install mode
internal fun PlayerActivity.showV890InstallToggle() {
    val current = FeaturePrefsStore.batch881.v890install
    FeaturePrefsStore.batch881.v890install = !current
    AppToast.show(this, "install: ${if (!current) "ON" else "OFF"}")
}

// v890: instance level
internal fun PlayerActivity.showV890InstanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890instance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "instance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890instance = value
        AppToast.show(this, "instance: $value")
    }
}

// v890: intent level
internal fun PlayerActivity.showV890IntentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890intent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "intent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890intent = value
        AppToast.show(this, "intent: $value")
    }
}

// v890: interact level
internal fun PlayerActivity.showV890InteractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890interact).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interact level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890interact = value
        AppToast.show(this, "interact: $value")
    }
}

// v890: interface level
internal fun PlayerActivity.showV890InterfaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890interface).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "interface level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890interface = value
        AppToast.show(this, "interface: $value")
    }
}

// v890: internal level
internal fun PlayerActivity.showV890InternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch881.v890internal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "internal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch881.v890internal = value
        AppToast.show(this, "internal: $value")
    }
}

// v890: interval mode
internal fun PlayerActivity.showV890IntervalToggle() {
    val current = FeaturePrefsStore.batch881.v890interval
    FeaturePrefsStore.batch881.v890interval = !current
    AppToast.show(this, "interval: ${if (!current) "ON" else "OFF"}")
}

// v890: invoke mode
internal fun PlayerActivity.showV890InvokeToggle() {
    val current = FeaturePrefsStore.batch881.v890invoke
    FeaturePrefsStore.batch881.v890invoke = !current
    AppToast.show(this, "invoke: ${if (!current) "ON" else "OFF"}")
}

// v890: io mode
internal fun PlayerActivity.showV890IoToggle() {
    val current = FeaturePrefsStore.batch881.v890io
    FeaturePrefsStore.batch881.v890io = !current
    AppToast.show(this, "io: ${if (!current) "ON" else "OFF"}")
}

// v890: item mode
internal fun PlayerActivity.showV890ItemToggle() {
    val current = FeaturePrefsStore.batch881.v890item
    FeaturePrefsStore.batch881.v890item = !current
    AppToast.show(this, "item: ${if (!current) "ON" else "OFF"}")
}

// v890: iterate mode
internal fun PlayerActivity.showV890IterateToggle() {
    val current = FeaturePrefsStore.batch881.v890iterate
    FeaturePrefsStore.batch881.v890iterate = !current
    AppToast.show(this, "iterate: ${if (!current) "ON" else "OFF"}")
}

