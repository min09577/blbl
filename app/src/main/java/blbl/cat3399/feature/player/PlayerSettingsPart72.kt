package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v911: local mode
internal fun PlayerActivity.showV911LocalToggle() {
    val current = FeaturePrefsStore.batch911.v911local
    FeaturePrefsStore.batch911.v911local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v911: lock mode
internal fun PlayerActivity.showV911LockToggle() {
    val current = FeaturePrefsStore.batch911.v911lock
    FeaturePrefsStore.batch911.v911lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v911: log mode
internal fun PlayerActivity.showV911LogToggle() {
    val current = FeaturePrefsStore.batch911.v911log
    FeaturePrefsStore.batch911.v911log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v911: logic mode
internal fun PlayerActivity.showV911LogicToggle() {
    val current = FeaturePrefsStore.batch911.v911logic
    FeaturePrefsStore.batch911.v911logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v911: login mode
internal fun PlayerActivity.showV911LoginToggle() {
    val current = FeaturePrefsStore.batch911.v911login
    FeaturePrefsStore.batch911.v911login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v911: long level
internal fun PlayerActivity.showV911LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911long = value
        AppToast.show(this, "long: $value")
    }
}

// v911: loop level
internal fun PlayerActivity.showV911LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v911: low level
internal fun PlayerActivity.showV911LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911low = value
        AppToast.show(this, "low: $value")
    }
}

// v911: lower level
internal fun PlayerActivity.showV911LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v911: main level
internal fun PlayerActivity.showV911MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911main = value
        AppToast.show(this, "main: $value")
    }
}

// v911: make mode
internal fun PlayerActivity.showV911MakeToggle() {
    val current = FeaturePrefsStore.batch911.v911make
    FeaturePrefsStore.batch911.v911make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v911: manage mode
internal fun PlayerActivity.showV911ManageToggle() {
    val current = FeaturePrefsStore.batch911.v911manage
    FeaturePrefsStore.batch911.v911manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v911: manifest mode
internal fun PlayerActivity.showV911ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v911manifest
    FeaturePrefsStore.batch911.v911manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v911: map mode
internal fun PlayerActivity.showV911MapToggle() {
    val current = FeaturePrefsStore.batch911.v911map
    FeaturePrefsStore.batch911.v911map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v911: margin mode
internal fun PlayerActivity.showV911MarginToggle() {
    val current = FeaturePrefsStore.batch911.v911margin
    FeaturePrefsStore.batch911.v911margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v912: local mode
internal fun PlayerActivity.showV912LocalToggle() {
    val current = FeaturePrefsStore.batch911.v912local
    FeaturePrefsStore.batch911.v912local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v912: lock mode
internal fun PlayerActivity.showV912LockToggle() {
    val current = FeaturePrefsStore.batch911.v912lock
    FeaturePrefsStore.batch911.v912lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v912: log mode
internal fun PlayerActivity.showV912LogToggle() {
    val current = FeaturePrefsStore.batch911.v912log
    FeaturePrefsStore.batch911.v912log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v912: logic mode
internal fun PlayerActivity.showV912LogicToggle() {
    val current = FeaturePrefsStore.batch911.v912logic
    FeaturePrefsStore.batch911.v912logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v912: login mode
internal fun PlayerActivity.showV912LoginToggle() {
    val current = FeaturePrefsStore.batch911.v912login
    FeaturePrefsStore.batch911.v912login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v912: long level
internal fun PlayerActivity.showV912LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912long = value
        AppToast.show(this, "long: $value")
    }
}

// v912: loop level
internal fun PlayerActivity.showV912LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v912: low level
internal fun PlayerActivity.showV912LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912low = value
        AppToast.show(this, "low: $value")
    }
}

// v912: lower level
internal fun PlayerActivity.showV912LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v912: main level
internal fun PlayerActivity.showV912MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912main = value
        AppToast.show(this, "main: $value")
    }
}

// v912: make mode
internal fun PlayerActivity.showV912MakeToggle() {
    val current = FeaturePrefsStore.batch911.v912make
    FeaturePrefsStore.batch911.v912make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v912: manage mode
internal fun PlayerActivity.showV912ManageToggle() {
    val current = FeaturePrefsStore.batch911.v912manage
    FeaturePrefsStore.batch911.v912manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v912: manifest mode
internal fun PlayerActivity.showV912ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v912manifest
    FeaturePrefsStore.batch911.v912manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v912: map mode
internal fun PlayerActivity.showV912MapToggle() {
    val current = FeaturePrefsStore.batch911.v912map
    FeaturePrefsStore.batch911.v912map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v912: margin mode
internal fun PlayerActivity.showV912MarginToggle() {
    val current = FeaturePrefsStore.batch911.v912margin
    FeaturePrefsStore.batch911.v912margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v913: local mode
internal fun PlayerActivity.showV913LocalToggle() {
    val current = FeaturePrefsStore.batch911.v913local
    FeaturePrefsStore.batch911.v913local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v913: lock mode
internal fun PlayerActivity.showV913LockToggle() {
    val current = FeaturePrefsStore.batch911.v913lock
    FeaturePrefsStore.batch911.v913lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v913: log mode
internal fun PlayerActivity.showV913LogToggle() {
    val current = FeaturePrefsStore.batch911.v913log
    FeaturePrefsStore.batch911.v913log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v913: logic mode
internal fun PlayerActivity.showV913LogicToggle() {
    val current = FeaturePrefsStore.batch911.v913logic
    FeaturePrefsStore.batch911.v913logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v913: login mode
internal fun PlayerActivity.showV913LoginToggle() {
    val current = FeaturePrefsStore.batch911.v913login
    FeaturePrefsStore.batch911.v913login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v913: long level
internal fun PlayerActivity.showV913LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913long = value
        AppToast.show(this, "long: $value")
    }
}

// v913: loop level
internal fun PlayerActivity.showV913LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v913: low level
internal fun PlayerActivity.showV913LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913low = value
        AppToast.show(this, "low: $value")
    }
}

// v913: lower level
internal fun PlayerActivity.showV913LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v913: main level
internal fun PlayerActivity.showV913MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913main = value
        AppToast.show(this, "main: $value")
    }
}

// v913: make mode
internal fun PlayerActivity.showV913MakeToggle() {
    val current = FeaturePrefsStore.batch911.v913make
    FeaturePrefsStore.batch911.v913make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v913: manage mode
internal fun PlayerActivity.showV913ManageToggle() {
    val current = FeaturePrefsStore.batch911.v913manage
    FeaturePrefsStore.batch911.v913manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v913: manifest mode
internal fun PlayerActivity.showV913ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v913manifest
    FeaturePrefsStore.batch911.v913manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v913: map mode
internal fun PlayerActivity.showV913MapToggle() {
    val current = FeaturePrefsStore.batch911.v913map
    FeaturePrefsStore.batch911.v913map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v913: margin mode
internal fun PlayerActivity.showV913MarginToggle() {
    val current = FeaturePrefsStore.batch911.v913margin
    FeaturePrefsStore.batch911.v913margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v914: local mode
internal fun PlayerActivity.showV914LocalToggle() {
    val current = FeaturePrefsStore.batch911.v914local
    FeaturePrefsStore.batch911.v914local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v914: lock mode
internal fun PlayerActivity.showV914LockToggle() {
    val current = FeaturePrefsStore.batch911.v914lock
    FeaturePrefsStore.batch911.v914lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v914: log mode
internal fun PlayerActivity.showV914LogToggle() {
    val current = FeaturePrefsStore.batch911.v914log
    FeaturePrefsStore.batch911.v914log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v914: logic mode
internal fun PlayerActivity.showV914LogicToggle() {
    val current = FeaturePrefsStore.batch911.v914logic
    FeaturePrefsStore.batch911.v914logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v914: login mode
internal fun PlayerActivity.showV914LoginToggle() {
    val current = FeaturePrefsStore.batch911.v914login
    FeaturePrefsStore.batch911.v914login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v914: long level
internal fun PlayerActivity.showV914LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914long = value
        AppToast.show(this, "long: $value")
    }
}

// v914: loop level
internal fun PlayerActivity.showV914LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v914: low level
internal fun PlayerActivity.showV914LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914low = value
        AppToast.show(this, "low: $value")
    }
}

// v914: lower level
internal fun PlayerActivity.showV914LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v914: main level
internal fun PlayerActivity.showV914MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914main = value
        AppToast.show(this, "main: $value")
    }
}

// v914: make mode
internal fun PlayerActivity.showV914MakeToggle() {
    val current = FeaturePrefsStore.batch911.v914make
    FeaturePrefsStore.batch911.v914make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v914: manage mode
internal fun PlayerActivity.showV914ManageToggle() {
    val current = FeaturePrefsStore.batch911.v914manage
    FeaturePrefsStore.batch911.v914manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v914: manifest mode
internal fun PlayerActivity.showV914ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v914manifest
    FeaturePrefsStore.batch911.v914manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v914: map mode
internal fun PlayerActivity.showV914MapToggle() {
    val current = FeaturePrefsStore.batch911.v914map
    FeaturePrefsStore.batch911.v914map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v914: margin mode
internal fun PlayerActivity.showV914MarginToggle() {
    val current = FeaturePrefsStore.batch911.v914margin
    FeaturePrefsStore.batch911.v914margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v915: local mode
internal fun PlayerActivity.showV915LocalToggle() {
    val current = FeaturePrefsStore.batch911.v915local
    FeaturePrefsStore.batch911.v915local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v915: lock mode
internal fun PlayerActivity.showV915LockToggle() {
    val current = FeaturePrefsStore.batch911.v915lock
    FeaturePrefsStore.batch911.v915lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v915: log mode
internal fun PlayerActivity.showV915LogToggle() {
    val current = FeaturePrefsStore.batch911.v915log
    FeaturePrefsStore.batch911.v915log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v915: logic mode
internal fun PlayerActivity.showV915LogicToggle() {
    val current = FeaturePrefsStore.batch911.v915logic
    FeaturePrefsStore.batch911.v915logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v915: login mode
internal fun PlayerActivity.showV915LoginToggle() {
    val current = FeaturePrefsStore.batch911.v915login
    FeaturePrefsStore.batch911.v915login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v915: long level
internal fun PlayerActivity.showV915LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915long = value
        AppToast.show(this, "long: $value")
    }
}

// v915: loop level
internal fun PlayerActivity.showV915LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v915: low level
internal fun PlayerActivity.showV915LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915low = value
        AppToast.show(this, "low: $value")
    }
}

// v915: lower level
internal fun PlayerActivity.showV915LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v915: main level
internal fun PlayerActivity.showV915MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915main = value
        AppToast.show(this, "main: $value")
    }
}

// v915: make mode
internal fun PlayerActivity.showV915MakeToggle() {
    val current = FeaturePrefsStore.batch911.v915make
    FeaturePrefsStore.batch911.v915make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v915: manage mode
internal fun PlayerActivity.showV915ManageToggle() {
    val current = FeaturePrefsStore.batch911.v915manage
    FeaturePrefsStore.batch911.v915manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v915: manifest mode
internal fun PlayerActivity.showV915ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v915manifest
    FeaturePrefsStore.batch911.v915manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v915: map mode
internal fun PlayerActivity.showV915MapToggle() {
    val current = FeaturePrefsStore.batch911.v915map
    FeaturePrefsStore.batch911.v915map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v915: margin mode
internal fun PlayerActivity.showV915MarginToggle() {
    val current = FeaturePrefsStore.batch911.v915margin
    FeaturePrefsStore.batch911.v915margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v916: local mode
internal fun PlayerActivity.showV916LocalToggle() {
    val current = FeaturePrefsStore.batch911.v916local
    FeaturePrefsStore.batch911.v916local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v916: lock mode
internal fun PlayerActivity.showV916LockToggle() {
    val current = FeaturePrefsStore.batch911.v916lock
    FeaturePrefsStore.batch911.v916lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v916: log mode
internal fun PlayerActivity.showV916LogToggle() {
    val current = FeaturePrefsStore.batch911.v916log
    FeaturePrefsStore.batch911.v916log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v916: logic mode
internal fun PlayerActivity.showV916LogicToggle() {
    val current = FeaturePrefsStore.batch911.v916logic
    FeaturePrefsStore.batch911.v916logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v916: login mode
internal fun PlayerActivity.showV916LoginToggle() {
    val current = FeaturePrefsStore.batch911.v916login
    FeaturePrefsStore.batch911.v916login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v916: long level
internal fun PlayerActivity.showV916LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916long = value
        AppToast.show(this, "long: $value")
    }
}

// v916: loop level
internal fun PlayerActivity.showV916LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v916: low level
internal fun PlayerActivity.showV916LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916low = value
        AppToast.show(this, "low: $value")
    }
}

// v916: lower level
internal fun PlayerActivity.showV916LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v916: main level
internal fun PlayerActivity.showV916MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916main = value
        AppToast.show(this, "main: $value")
    }
}

// v916: make mode
internal fun PlayerActivity.showV916MakeToggle() {
    val current = FeaturePrefsStore.batch911.v916make
    FeaturePrefsStore.batch911.v916make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v916: manage mode
internal fun PlayerActivity.showV916ManageToggle() {
    val current = FeaturePrefsStore.batch911.v916manage
    FeaturePrefsStore.batch911.v916manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v916: manifest mode
internal fun PlayerActivity.showV916ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v916manifest
    FeaturePrefsStore.batch911.v916manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v916: map mode
internal fun PlayerActivity.showV916MapToggle() {
    val current = FeaturePrefsStore.batch911.v916map
    FeaturePrefsStore.batch911.v916map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v916: margin mode
internal fun PlayerActivity.showV916MarginToggle() {
    val current = FeaturePrefsStore.batch911.v916margin
    FeaturePrefsStore.batch911.v916margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v917: local mode
internal fun PlayerActivity.showV917LocalToggle() {
    val current = FeaturePrefsStore.batch911.v917local
    FeaturePrefsStore.batch911.v917local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v917: lock mode
internal fun PlayerActivity.showV917LockToggle() {
    val current = FeaturePrefsStore.batch911.v917lock
    FeaturePrefsStore.batch911.v917lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v917: log mode
internal fun PlayerActivity.showV917LogToggle() {
    val current = FeaturePrefsStore.batch911.v917log
    FeaturePrefsStore.batch911.v917log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v917: logic mode
internal fun PlayerActivity.showV917LogicToggle() {
    val current = FeaturePrefsStore.batch911.v917logic
    FeaturePrefsStore.batch911.v917logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v917: login mode
internal fun PlayerActivity.showV917LoginToggle() {
    val current = FeaturePrefsStore.batch911.v917login
    FeaturePrefsStore.batch911.v917login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v917: long level
internal fun PlayerActivity.showV917LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917long = value
        AppToast.show(this, "long: $value")
    }
}

// v917: loop level
internal fun PlayerActivity.showV917LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v917: low level
internal fun PlayerActivity.showV917LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917low = value
        AppToast.show(this, "low: $value")
    }
}

// v917: lower level
internal fun PlayerActivity.showV917LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v917: main level
internal fun PlayerActivity.showV917MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917main = value
        AppToast.show(this, "main: $value")
    }
}

// v917: make mode
internal fun PlayerActivity.showV917MakeToggle() {
    val current = FeaturePrefsStore.batch911.v917make
    FeaturePrefsStore.batch911.v917make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v917: manage mode
internal fun PlayerActivity.showV917ManageToggle() {
    val current = FeaturePrefsStore.batch911.v917manage
    FeaturePrefsStore.batch911.v917manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v917: manifest mode
internal fun PlayerActivity.showV917ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v917manifest
    FeaturePrefsStore.batch911.v917manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v917: map mode
internal fun PlayerActivity.showV917MapToggle() {
    val current = FeaturePrefsStore.batch911.v917map
    FeaturePrefsStore.batch911.v917map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v917: margin mode
internal fun PlayerActivity.showV917MarginToggle() {
    val current = FeaturePrefsStore.batch911.v917margin
    FeaturePrefsStore.batch911.v917margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v918: local mode
internal fun PlayerActivity.showV918LocalToggle() {
    val current = FeaturePrefsStore.batch911.v918local
    FeaturePrefsStore.batch911.v918local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v918: lock mode
internal fun PlayerActivity.showV918LockToggle() {
    val current = FeaturePrefsStore.batch911.v918lock
    FeaturePrefsStore.batch911.v918lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v918: log mode
internal fun PlayerActivity.showV918LogToggle() {
    val current = FeaturePrefsStore.batch911.v918log
    FeaturePrefsStore.batch911.v918log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v918: logic mode
internal fun PlayerActivity.showV918LogicToggle() {
    val current = FeaturePrefsStore.batch911.v918logic
    FeaturePrefsStore.batch911.v918logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v918: login mode
internal fun PlayerActivity.showV918LoginToggle() {
    val current = FeaturePrefsStore.batch911.v918login
    FeaturePrefsStore.batch911.v918login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v918: long level
internal fun PlayerActivity.showV918LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918long = value
        AppToast.show(this, "long: $value")
    }
}

// v918: loop level
internal fun PlayerActivity.showV918LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v918: low level
internal fun PlayerActivity.showV918LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918low = value
        AppToast.show(this, "low: $value")
    }
}

// v918: lower level
internal fun PlayerActivity.showV918LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v918: main level
internal fun PlayerActivity.showV918MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918main = value
        AppToast.show(this, "main: $value")
    }
}

// v918: make mode
internal fun PlayerActivity.showV918MakeToggle() {
    val current = FeaturePrefsStore.batch911.v918make
    FeaturePrefsStore.batch911.v918make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v918: manage mode
internal fun PlayerActivity.showV918ManageToggle() {
    val current = FeaturePrefsStore.batch911.v918manage
    FeaturePrefsStore.batch911.v918manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v918: manifest mode
internal fun PlayerActivity.showV918ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v918manifest
    FeaturePrefsStore.batch911.v918manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v918: map mode
internal fun PlayerActivity.showV918MapToggle() {
    val current = FeaturePrefsStore.batch911.v918map
    FeaturePrefsStore.batch911.v918map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v918: margin mode
internal fun PlayerActivity.showV918MarginToggle() {
    val current = FeaturePrefsStore.batch911.v918margin
    FeaturePrefsStore.batch911.v918margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v919: local mode
internal fun PlayerActivity.showV919LocalToggle() {
    val current = FeaturePrefsStore.batch911.v919local
    FeaturePrefsStore.batch911.v919local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v919: lock mode
internal fun PlayerActivity.showV919LockToggle() {
    val current = FeaturePrefsStore.batch911.v919lock
    FeaturePrefsStore.batch911.v919lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v919: log mode
internal fun PlayerActivity.showV919LogToggle() {
    val current = FeaturePrefsStore.batch911.v919log
    FeaturePrefsStore.batch911.v919log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v919: logic mode
internal fun PlayerActivity.showV919LogicToggle() {
    val current = FeaturePrefsStore.batch911.v919logic
    FeaturePrefsStore.batch911.v919logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v919: login mode
internal fun PlayerActivity.showV919LoginToggle() {
    val current = FeaturePrefsStore.batch911.v919login
    FeaturePrefsStore.batch911.v919login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v919: long level
internal fun PlayerActivity.showV919LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919long = value
        AppToast.show(this, "long: $value")
    }
}

// v919: loop level
internal fun PlayerActivity.showV919LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v919: low level
internal fun PlayerActivity.showV919LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919low = value
        AppToast.show(this, "low: $value")
    }
}

// v919: lower level
internal fun PlayerActivity.showV919LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v919: main level
internal fun PlayerActivity.showV919MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919main = value
        AppToast.show(this, "main: $value")
    }
}

// v919: make mode
internal fun PlayerActivity.showV919MakeToggle() {
    val current = FeaturePrefsStore.batch911.v919make
    FeaturePrefsStore.batch911.v919make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v919: manage mode
internal fun PlayerActivity.showV919ManageToggle() {
    val current = FeaturePrefsStore.batch911.v919manage
    FeaturePrefsStore.batch911.v919manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v919: manifest mode
internal fun PlayerActivity.showV919ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v919manifest
    FeaturePrefsStore.batch911.v919manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v919: map mode
internal fun PlayerActivity.showV919MapToggle() {
    val current = FeaturePrefsStore.batch911.v919map
    FeaturePrefsStore.batch911.v919map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v919: margin mode
internal fun PlayerActivity.showV919MarginToggle() {
    val current = FeaturePrefsStore.batch911.v919margin
    FeaturePrefsStore.batch911.v919margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v920: local mode
internal fun PlayerActivity.showV920LocalToggle() {
    val current = FeaturePrefsStore.batch911.v920local
    FeaturePrefsStore.batch911.v920local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v920: lock mode
internal fun PlayerActivity.showV920LockToggle() {
    val current = FeaturePrefsStore.batch911.v920lock
    FeaturePrefsStore.batch911.v920lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v920: log mode
internal fun PlayerActivity.showV920LogToggle() {
    val current = FeaturePrefsStore.batch911.v920log
    FeaturePrefsStore.batch911.v920log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v920: logic mode
internal fun PlayerActivity.showV920LogicToggle() {
    val current = FeaturePrefsStore.batch911.v920logic
    FeaturePrefsStore.batch911.v920logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v920: login mode
internal fun PlayerActivity.showV920LoginToggle() {
    val current = FeaturePrefsStore.batch911.v920login
    FeaturePrefsStore.batch911.v920login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v920: long level
internal fun PlayerActivity.showV920LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920long = value
        AppToast.show(this, "long: $value")
    }
}

// v920: loop level
internal fun PlayerActivity.showV920LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v920: low level
internal fun PlayerActivity.showV920LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920low = value
        AppToast.show(this, "low: $value")
    }
}

// v920: lower level
internal fun PlayerActivity.showV920LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v920: main level
internal fun PlayerActivity.showV920MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920main = value
        AppToast.show(this, "main: $value")
    }
}

// v920: make mode
internal fun PlayerActivity.showV920MakeToggle() {
    val current = FeaturePrefsStore.batch911.v920make
    FeaturePrefsStore.batch911.v920make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v920: manage mode
internal fun PlayerActivity.showV920ManageToggle() {
    val current = FeaturePrefsStore.batch911.v920manage
    FeaturePrefsStore.batch911.v920manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v920: manifest mode
internal fun PlayerActivity.showV920ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v920manifest
    FeaturePrefsStore.batch911.v920manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v920: map mode
internal fun PlayerActivity.showV920MapToggle() {
    val current = FeaturePrefsStore.batch911.v920map
    FeaturePrefsStore.batch911.v920map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v920: margin mode
internal fun PlayerActivity.showV920MarginToggle() {
    val current = FeaturePrefsStore.batch911.v920margin
    FeaturePrefsStore.batch911.v920margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

