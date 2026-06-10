package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v941: near mode
internal fun PlayerActivity.showV941NearToggle() {
    val current = FeaturePrefsStore.batch941.v941near
    FeaturePrefsStore.batch941.v941near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v941: net mode
internal fun PlayerActivity.showV941NetToggle() {
    val current = FeaturePrefsStore.batch941.v941net
    FeaturePrefsStore.batch941.v941net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v941: network mode
internal fun PlayerActivity.showV941NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v941network
    FeaturePrefsStore.batch941.v941network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v941: new mode
internal fun PlayerActivity.showV941NewToggle() {
    val current = FeaturePrefsStore.batch941.v941new
    FeaturePrefsStore.batch941.v941new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v941: next mode
internal fun PlayerActivity.showV941NextToggle() {
    val current = FeaturePrefsStore.batch941.v941next
    FeaturePrefsStore.batch941.v941next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v941: node level
internal fun PlayerActivity.showV941NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941node = value
        AppToast.show(this, "node: $value")
    }
}

// v941: none level
internal fun PlayerActivity.showV941NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941none = value
        AppToast.show(this, "none: $value")
    }
}

// v941: normal level
internal fun PlayerActivity.showV941NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v941: notify level
internal fun PlayerActivity.showV941NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v941: null level
internal fun PlayerActivity.showV941NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941null = value
        AppToast.show(this, "null: $value")
    }
}

// v941: number mode
internal fun PlayerActivity.showV941NumberToggle() {
    val current = FeaturePrefsStore.batch941.v941number
    FeaturePrefsStore.batch941.v941number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v941: object mode
internal fun PlayerActivity.showV941ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v941object
    FeaturePrefsStore.batch941.v941object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v941: observe mode
internal fun PlayerActivity.showV941ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v941observe
    FeaturePrefsStore.batch941.v941observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v941: offset mode
internal fun PlayerActivity.showV941OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v941offset
    FeaturePrefsStore.batch941.v941offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v941: old mode
internal fun PlayerActivity.showV941OldToggle() {
    val current = FeaturePrefsStore.batch941.v941old
    FeaturePrefsStore.batch941.v941old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v942: near mode
internal fun PlayerActivity.showV942NearToggle() {
    val current = FeaturePrefsStore.batch941.v942near
    FeaturePrefsStore.batch941.v942near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v942: net mode
internal fun PlayerActivity.showV942NetToggle() {
    val current = FeaturePrefsStore.batch941.v942net
    FeaturePrefsStore.batch941.v942net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v942: network mode
internal fun PlayerActivity.showV942NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v942network
    FeaturePrefsStore.batch941.v942network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v942: new mode
internal fun PlayerActivity.showV942NewToggle() {
    val current = FeaturePrefsStore.batch941.v942new
    FeaturePrefsStore.batch941.v942new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v942: next mode
internal fun PlayerActivity.showV942NextToggle() {
    val current = FeaturePrefsStore.batch941.v942next
    FeaturePrefsStore.batch941.v942next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v942: node level
internal fun PlayerActivity.showV942NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942node = value
        AppToast.show(this, "node: $value")
    }
}

// v942: none level
internal fun PlayerActivity.showV942NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942none = value
        AppToast.show(this, "none: $value")
    }
}

// v942: normal level
internal fun PlayerActivity.showV942NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v942: notify level
internal fun PlayerActivity.showV942NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v942: null level
internal fun PlayerActivity.showV942NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942null = value
        AppToast.show(this, "null: $value")
    }
}

// v942: number mode
internal fun PlayerActivity.showV942NumberToggle() {
    val current = FeaturePrefsStore.batch941.v942number
    FeaturePrefsStore.batch941.v942number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v942: object mode
internal fun PlayerActivity.showV942ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v942object
    FeaturePrefsStore.batch941.v942object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v942: observe mode
internal fun PlayerActivity.showV942ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v942observe
    FeaturePrefsStore.batch941.v942observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v942: offset mode
internal fun PlayerActivity.showV942OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v942offset
    FeaturePrefsStore.batch941.v942offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v942: old mode
internal fun PlayerActivity.showV942OldToggle() {
    val current = FeaturePrefsStore.batch941.v942old
    FeaturePrefsStore.batch941.v942old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v943: near mode
internal fun PlayerActivity.showV943NearToggle() {
    val current = FeaturePrefsStore.batch941.v943near
    FeaturePrefsStore.batch941.v943near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v943: net mode
internal fun PlayerActivity.showV943NetToggle() {
    val current = FeaturePrefsStore.batch941.v943net
    FeaturePrefsStore.batch941.v943net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v943: network mode
internal fun PlayerActivity.showV943NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v943network
    FeaturePrefsStore.batch941.v943network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v943: new mode
internal fun PlayerActivity.showV943NewToggle() {
    val current = FeaturePrefsStore.batch941.v943new
    FeaturePrefsStore.batch941.v943new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v943: next mode
internal fun PlayerActivity.showV943NextToggle() {
    val current = FeaturePrefsStore.batch941.v943next
    FeaturePrefsStore.batch941.v943next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v943: node level
internal fun PlayerActivity.showV943NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943node = value
        AppToast.show(this, "node: $value")
    }
}

// v943: none level
internal fun PlayerActivity.showV943NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943none = value
        AppToast.show(this, "none: $value")
    }
}

// v943: normal level
internal fun PlayerActivity.showV943NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v943: notify level
internal fun PlayerActivity.showV943NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v943: null level
internal fun PlayerActivity.showV943NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943null = value
        AppToast.show(this, "null: $value")
    }
}

// v943: number mode
internal fun PlayerActivity.showV943NumberToggle() {
    val current = FeaturePrefsStore.batch941.v943number
    FeaturePrefsStore.batch941.v943number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v943: object mode
internal fun PlayerActivity.showV943ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v943object
    FeaturePrefsStore.batch941.v943object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v943: observe mode
internal fun PlayerActivity.showV943ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v943observe
    FeaturePrefsStore.batch941.v943observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v943: offset mode
internal fun PlayerActivity.showV943OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v943offset
    FeaturePrefsStore.batch941.v943offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v943: old mode
internal fun PlayerActivity.showV943OldToggle() {
    val current = FeaturePrefsStore.batch941.v943old
    FeaturePrefsStore.batch941.v943old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v944: near mode
internal fun PlayerActivity.showV944NearToggle() {
    val current = FeaturePrefsStore.batch941.v944near
    FeaturePrefsStore.batch941.v944near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v944: net mode
internal fun PlayerActivity.showV944NetToggle() {
    val current = FeaturePrefsStore.batch941.v944net
    FeaturePrefsStore.batch941.v944net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v944: network mode
internal fun PlayerActivity.showV944NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v944network
    FeaturePrefsStore.batch941.v944network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v944: new mode
internal fun PlayerActivity.showV944NewToggle() {
    val current = FeaturePrefsStore.batch941.v944new
    FeaturePrefsStore.batch941.v944new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v944: next mode
internal fun PlayerActivity.showV944NextToggle() {
    val current = FeaturePrefsStore.batch941.v944next
    FeaturePrefsStore.batch941.v944next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v944: node level
internal fun PlayerActivity.showV944NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944node = value
        AppToast.show(this, "node: $value")
    }
}

// v944: none level
internal fun PlayerActivity.showV944NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944none = value
        AppToast.show(this, "none: $value")
    }
}

// v944: normal level
internal fun PlayerActivity.showV944NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v944: notify level
internal fun PlayerActivity.showV944NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v944: null level
internal fun PlayerActivity.showV944NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944null = value
        AppToast.show(this, "null: $value")
    }
}

// v944: number mode
internal fun PlayerActivity.showV944NumberToggle() {
    val current = FeaturePrefsStore.batch941.v944number
    FeaturePrefsStore.batch941.v944number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v944: object mode
internal fun PlayerActivity.showV944ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v944object
    FeaturePrefsStore.batch941.v944object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v944: observe mode
internal fun PlayerActivity.showV944ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v944observe
    FeaturePrefsStore.batch941.v944observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v944: offset mode
internal fun PlayerActivity.showV944OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v944offset
    FeaturePrefsStore.batch941.v944offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v944: old mode
internal fun PlayerActivity.showV944OldToggle() {
    val current = FeaturePrefsStore.batch941.v944old
    FeaturePrefsStore.batch941.v944old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v945: near mode
internal fun PlayerActivity.showV945NearToggle() {
    val current = FeaturePrefsStore.batch941.v945near
    FeaturePrefsStore.batch941.v945near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v945: net mode
internal fun PlayerActivity.showV945NetToggle() {
    val current = FeaturePrefsStore.batch941.v945net
    FeaturePrefsStore.batch941.v945net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v945: network mode
internal fun PlayerActivity.showV945NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v945network
    FeaturePrefsStore.batch941.v945network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v945: new mode
internal fun PlayerActivity.showV945NewToggle() {
    val current = FeaturePrefsStore.batch941.v945new
    FeaturePrefsStore.batch941.v945new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v945: next mode
internal fun PlayerActivity.showV945NextToggle() {
    val current = FeaturePrefsStore.batch941.v945next
    FeaturePrefsStore.batch941.v945next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v945: node level
internal fun PlayerActivity.showV945NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945node = value
        AppToast.show(this, "node: $value")
    }
}

// v945: none level
internal fun PlayerActivity.showV945NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945none = value
        AppToast.show(this, "none: $value")
    }
}

// v945: normal level
internal fun PlayerActivity.showV945NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v945: notify level
internal fun PlayerActivity.showV945NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v945: null level
internal fun PlayerActivity.showV945NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945null = value
        AppToast.show(this, "null: $value")
    }
}

// v945: number mode
internal fun PlayerActivity.showV945NumberToggle() {
    val current = FeaturePrefsStore.batch941.v945number
    FeaturePrefsStore.batch941.v945number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v945: object mode
internal fun PlayerActivity.showV945ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v945object
    FeaturePrefsStore.batch941.v945object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v945: observe mode
internal fun PlayerActivity.showV945ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v945observe
    FeaturePrefsStore.batch941.v945observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v945: offset mode
internal fun PlayerActivity.showV945OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v945offset
    FeaturePrefsStore.batch941.v945offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v945: old mode
internal fun PlayerActivity.showV945OldToggle() {
    val current = FeaturePrefsStore.batch941.v945old
    FeaturePrefsStore.batch941.v945old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v946: near mode
internal fun PlayerActivity.showV946NearToggle() {
    val current = FeaturePrefsStore.batch941.v946near
    FeaturePrefsStore.batch941.v946near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v946: net mode
internal fun PlayerActivity.showV946NetToggle() {
    val current = FeaturePrefsStore.batch941.v946net
    FeaturePrefsStore.batch941.v946net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v946: network mode
internal fun PlayerActivity.showV946NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v946network
    FeaturePrefsStore.batch941.v946network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v946: new mode
internal fun PlayerActivity.showV946NewToggle() {
    val current = FeaturePrefsStore.batch941.v946new
    FeaturePrefsStore.batch941.v946new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v946: next mode
internal fun PlayerActivity.showV946NextToggle() {
    val current = FeaturePrefsStore.batch941.v946next
    FeaturePrefsStore.batch941.v946next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v946: node level
internal fun PlayerActivity.showV946NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946node = value
        AppToast.show(this, "node: $value")
    }
}

// v946: none level
internal fun PlayerActivity.showV946NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946none = value
        AppToast.show(this, "none: $value")
    }
}

// v946: normal level
internal fun PlayerActivity.showV946NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v946: notify level
internal fun PlayerActivity.showV946NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v946: null level
internal fun PlayerActivity.showV946NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946null = value
        AppToast.show(this, "null: $value")
    }
}

// v946: number mode
internal fun PlayerActivity.showV946NumberToggle() {
    val current = FeaturePrefsStore.batch941.v946number
    FeaturePrefsStore.batch941.v946number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v946: object mode
internal fun PlayerActivity.showV946ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v946object
    FeaturePrefsStore.batch941.v946object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v946: observe mode
internal fun PlayerActivity.showV946ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v946observe
    FeaturePrefsStore.batch941.v946observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v946: offset mode
internal fun PlayerActivity.showV946OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v946offset
    FeaturePrefsStore.batch941.v946offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v946: old mode
internal fun PlayerActivity.showV946OldToggle() {
    val current = FeaturePrefsStore.batch941.v946old
    FeaturePrefsStore.batch941.v946old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v947: near mode
internal fun PlayerActivity.showV947NearToggle() {
    val current = FeaturePrefsStore.batch941.v947near
    FeaturePrefsStore.batch941.v947near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v947: net mode
internal fun PlayerActivity.showV947NetToggle() {
    val current = FeaturePrefsStore.batch941.v947net
    FeaturePrefsStore.batch941.v947net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v947: network mode
internal fun PlayerActivity.showV947NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v947network
    FeaturePrefsStore.batch941.v947network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v947: new mode
internal fun PlayerActivity.showV947NewToggle() {
    val current = FeaturePrefsStore.batch941.v947new
    FeaturePrefsStore.batch941.v947new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v947: next mode
internal fun PlayerActivity.showV947NextToggle() {
    val current = FeaturePrefsStore.batch941.v947next
    FeaturePrefsStore.batch941.v947next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v947: node level
internal fun PlayerActivity.showV947NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947node = value
        AppToast.show(this, "node: $value")
    }
}

// v947: none level
internal fun PlayerActivity.showV947NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947none = value
        AppToast.show(this, "none: $value")
    }
}

// v947: normal level
internal fun PlayerActivity.showV947NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v947: notify level
internal fun PlayerActivity.showV947NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v947: null level
internal fun PlayerActivity.showV947NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947null = value
        AppToast.show(this, "null: $value")
    }
}

// v947: number mode
internal fun PlayerActivity.showV947NumberToggle() {
    val current = FeaturePrefsStore.batch941.v947number
    FeaturePrefsStore.batch941.v947number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v947: object mode
internal fun PlayerActivity.showV947ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v947object
    FeaturePrefsStore.batch941.v947object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v947: observe mode
internal fun PlayerActivity.showV947ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v947observe
    FeaturePrefsStore.batch941.v947observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v947: offset mode
internal fun PlayerActivity.showV947OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v947offset
    FeaturePrefsStore.batch941.v947offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v947: old mode
internal fun PlayerActivity.showV947OldToggle() {
    val current = FeaturePrefsStore.batch941.v947old
    FeaturePrefsStore.batch941.v947old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v948: near mode
internal fun PlayerActivity.showV948NearToggle() {
    val current = FeaturePrefsStore.batch941.v948near
    FeaturePrefsStore.batch941.v948near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v948: net mode
internal fun PlayerActivity.showV948NetToggle() {
    val current = FeaturePrefsStore.batch941.v948net
    FeaturePrefsStore.batch941.v948net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v948: network mode
internal fun PlayerActivity.showV948NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v948network
    FeaturePrefsStore.batch941.v948network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v948: new mode
internal fun PlayerActivity.showV948NewToggle() {
    val current = FeaturePrefsStore.batch941.v948new
    FeaturePrefsStore.batch941.v948new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v948: next mode
internal fun PlayerActivity.showV948NextToggle() {
    val current = FeaturePrefsStore.batch941.v948next
    FeaturePrefsStore.batch941.v948next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v948: node level
internal fun PlayerActivity.showV948NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948node = value
        AppToast.show(this, "node: $value")
    }
}

// v948: none level
internal fun PlayerActivity.showV948NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948none = value
        AppToast.show(this, "none: $value")
    }
}

// v948: normal level
internal fun PlayerActivity.showV948NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v948: notify level
internal fun PlayerActivity.showV948NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v948: null level
internal fun PlayerActivity.showV948NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948null = value
        AppToast.show(this, "null: $value")
    }
}

// v948: number mode
internal fun PlayerActivity.showV948NumberToggle() {
    val current = FeaturePrefsStore.batch941.v948number
    FeaturePrefsStore.batch941.v948number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v948: object mode
internal fun PlayerActivity.showV948ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v948object
    FeaturePrefsStore.batch941.v948object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v948: observe mode
internal fun PlayerActivity.showV948ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v948observe
    FeaturePrefsStore.batch941.v948observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v948: offset mode
internal fun PlayerActivity.showV948OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v948offset
    FeaturePrefsStore.batch941.v948offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v948: old mode
internal fun PlayerActivity.showV948OldToggle() {
    val current = FeaturePrefsStore.batch941.v948old
    FeaturePrefsStore.batch941.v948old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v949: near mode
internal fun PlayerActivity.showV949NearToggle() {
    val current = FeaturePrefsStore.batch941.v949near
    FeaturePrefsStore.batch941.v949near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v949: net mode
internal fun PlayerActivity.showV949NetToggle() {
    val current = FeaturePrefsStore.batch941.v949net
    FeaturePrefsStore.batch941.v949net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v949: network mode
internal fun PlayerActivity.showV949NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v949network
    FeaturePrefsStore.batch941.v949network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v949: new mode
internal fun PlayerActivity.showV949NewToggle() {
    val current = FeaturePrefsStore.batch941.v949new
    FeaturePrefsStore.batch941.v949new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v949: next mode
internal fun PlayerActivity.showV949NextToggle() {
    val current = FeaturePrefsStore.batch941.v949next
    FeaturePrefsStore.batch941.v949next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v949: node level
internal fun PlayerActivity.showV949NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949node = value
        AppToast.show(this, "node: $value")
    }
}

// v949: none level
internal fun PlayerActivity.showV949NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949none = value
        AppToast.show(this, "none: $value")
    }
}

// v949: normal level
internal fun PlayerActivity.showV949NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v949: notify level
internal fun PlayerActivity.showV949NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v949: null level
internal fun PlayerActivity.showV949NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949null = value
        AppToast.show(this, "null: $value")
    }
}

// v949: number mode
internal fun PlayerActivity.showV949NumberToggle() {
    val current = FeaturePrefsStore.batch941.v949number
    FeaturePrefsStore.batch941.v949number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v949: object mode
internal fun PlayerActivity.showV949ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v949object
    FeaturePrefsStore.batch941.v949object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v949: observe mode
internal fun PlayerActivity.showV949ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v949observe
    FeaturePrefsStore.batch941.v949observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v949: offset mode
internal fun PlayerActivity.showV949OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v949offset
    FeaturePrefsStore.batch941.v949offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v949: old mode
internal fun PlayerActivity.showV949OldToggle() {
    val current = FeaturePrefsStore.batch941.v949old
    FeaturePrefsStore.batch941.v949old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v950: near mode
internal fun PlayerActivity.showV950NearToggle() {
    val current = FeaturePrefsStore.batch941.v950near
    FeaturePrefsStore.batch941.v950near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v950: net mode
internal fun PlayerActivity.showV950NetToggle() {
    val current = FeaturePrefsStore.batch941.v950net
    FeaturePrefsStore.batch941.v950net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v950: network mode
internal fun PlayerActivity.showV950NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v950network
    FeaturePrefsStore.batch941.v950network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v950: new mode
internal fun PlayerActivity.showV950NewToggle() {
    val current = FeaturePrefsStore.batch941.v950new
    FeaturePrefsStore.batch941.v950new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v950: next mode
internal fun PlayerActivity.showV950NextToggle() {
    val current = FeaturePrefsStore.batch941.v950next
    FeaturePrefsStore.batch941.v950next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v950: node level
internal fun PlayerActivity.showV950NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950node = value
        AppToast.show(this, "node: $value")
    }
}

// v950: none level
internal fun PlayerActivity.showV950NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950none = value
        AppToast.show(this, "none: $value")
    }
}

// v950: normal level
internal fun PlayerActivity.showV950NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v950: notify level
internal fun PlayerActivity.showV950NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v950: null level
internal fun PlayerActivity.showV950NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950null = value
        AppToast.show(this, "null: $value")
    }
}

// v950: number mode
internal fun PlayerActivity.showV950NumberToggle() {
    val current = FeaturePrefsStore.batch941.v950number
    FeaturePrefsStore.batch941.v950number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v950: object mode
internal fun PlayerActivity.showV950ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v950object
    FeaturePrefsStore.batch941.v950object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v950: observe mode
internal fun PlayerActivity.showV950ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v950observe
    FeaturePrefsStore.batch941.v950observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v950: offset mode
internal fun PlayerActivity.showV950OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v950offset
    FeaturePrefsStore.batch941.v950offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v950: old mode
internal fun PlayerActivity.showV950OldToggle() {
    val current = FeaturePrefsStore.batch941.v950old
    FeaturePrefsStore.batch941.v950old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

