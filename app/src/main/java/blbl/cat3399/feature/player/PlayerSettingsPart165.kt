package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1831: banned mode
internal fun PlayerActivity.showV1831BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1831banned
    FeaturePrefsStore.batch1831.v1831banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1831: barred mode
internal fun PlayerActivity.showV1831BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1831barred
    FeaturePrefsStore.batch1831.v1831barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1831: batched mode
internal fun PlayerActivity.showV1831BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1831batched
    FeaturePrefsStore.batch1831.v1831batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1831: beamed mode
internal fun PlayerActivity.showV1831BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1831beamed
    FeaturePrefsStore.batch1831.v1831beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1831: bearing mode
internal fun PlayerActivity.showV1831BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831bearing
    FeaturePrefsStore.batch1831.v1831bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1831: beating level
internal fun PlayerActivity.showV1831BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1831: becoming level
internal fun PlayerActivity.showV1831BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1831: beginning level
internal fun PlayerActivity.showV1831BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1831: belonging level
internal fun PlayerActivity.showV1831BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1831: bending level
internal fun PlayerActivity.showV1831BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1831: binding mode
internal fun PlayerActivity.showV1831BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831binding
    FeaturePrefsStore.batch1831.v1831binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1831: biting mode
internal fun PlayerActivity.showV1831BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831biting
    FeaturePrefsStore.batch1831.v1831biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1831: blending mode
internal fun PlayerActivity.showV1831BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831blending
    FeaturePrefsStore.batch1831.v1831blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1831: blessing mode
internal fun PlayerActivity.showV1831BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831blessing
    FeaturePrefsStore.batch1831.v1831blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1831: blinding mode
internal fun PlayerActivity.showV1831BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831blinding
    FeaturePrefsStore.batch1831.v1831blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1832: banned mode
internal fun PlayerActivity.showV1832BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1832banned
    FeaturePrefsStore.batch1831.v1832banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1832: barred mode
internal fun PlayerActivity.showV1832BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1832barred
    FeaturePrefsStore.batch1831.v1832barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1832: batched mode
internal fun PlayerActivity.showV1832BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1832batched
    FeaturePrefsStore.batch1831.v1832batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1832: beamed mode
internal fun PlayerActivity.showV1832BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1832beamed
    FeaturePrefsStore.batch1831.v1832beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1832: bearing mode
internal fun PlayerActivity.showV1832BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832bearing
    FeaturePrefsStore.batch1831.v1832bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1832: beating level
internal fun PlayerActivity.showV1832BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1832: becoming level
internal fun PlayerActivity.showV1832BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1832: beginning level
internal fun PlayerActivity.showV1832BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1832: belonging level
internal fun PlayerActivity.showV1832BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1832: bending level
internal fun PlayerActivity.showV1832BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1832: binding mode
internal fun PlayerActivity.showV1832BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832binding
    FeaturePrefsStore.batch1831.v1832binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1832: biting mode
internal fun PlayerActivity.showV1832BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832biting
    FeaturePrefsStore.batch1831.v1832biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1832: blending mode
internal fun PlayerActivity.showV1832BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832blending
    FeaturePrefsStore.batch1831.v1832blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1832: blessing mode
internal fun PlayerActivity.showV1832BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832blessing
    FeaturePrefsStore.batch1831.v1832blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1832: blinding mode
internal fun PlayerActivity.showV1832BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832blinding
    FeaturePrefsStore.batch1831.v1832blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1833: banned mode
internal fun PlayerActivity.showV1833BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1833banned
    FeaturePrefsStore.batch1831.v1833banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1833: barred mode
internal fun PlayerActivity.showV1833BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1833barred
    FeaturePrefsStore.batch1831.v1833barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1833: batched mode
internal fun PlayerActivity.showV1833BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1833batched
    FeaturePrefsStore.batch1831.v1833batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1833: beamed mode
internal fun PlayerActivity.showV1833BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1833beamed
    FeaturePrefsStore.batch1831.v1833beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1833: bearing mode
internal fun PlayerActivity.showV1833BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833bearing
    FeaturePrefsStore.batch1831.v1833bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1833: beating level
internal fun PlayerActivity.showV1833BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1833: becoming level
internal fun PlayerActivity.showV1833BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1833: beginning level
internal fun PlayerActivity.showV1833BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1833: belonging level
internal fun PlayerActivity.showV1833BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1833: bending level
internal fun PlayerActivity.showV1833BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1833: binding mode
internal fun PlayerActivity.showV1833BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833binding
    FeaturePrefsStore.batch1831.v1833binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1833: biting mode
internal fun PlayerActivity.showV1833BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833biting
    FeaturePrefsStore.batch1831.v1833biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1833: blending mode
internal fun PlayerActivity.showV1833BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833blending
    FeaturePrefsStore.batch1831.v1833blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1833: blessing mode
internal fun PlayerActivity.showV1833BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833blessing
    FeaturePrefsStore.batch1831.v1833blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1833: blinding mode
internal fun PlayerActivity.showV1833BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833blinding
    FeaturePrefsStore.batch1831.v1833blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1834: banned mode
internal fun PlayerActivity.showV1834BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1834banned
    FeaturePrefsStore.batch1831.v1834banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1834: barred mode
internal fun PlayerActivity.showV1834BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1834barred
    FeaturePrefsStore.batch1831.v1834barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1834: batched mode
internal fun PlayerActivity.showV1834BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1834batched
    FeaturePrefsStore.batch1831.v1834batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1834: beamed mode
internal fun PlayerActivity.showV1834BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1834beamed
    FeaturePrefsStore.batch1831.v1834beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1834: bearing mode
internal fun PlayerActivity.showV1834BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834bearing
    FeaturePrefsStore.batch1831.v1834bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1834: beating level
internal fun PlayerActivity.showV1834BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1834: becoming level
internal fun PlayerActivity.showV1834BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1834: beginning level
internal fun PlayerActivity.showV1834BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1834: belonging level
internal fun PlayerActivity.showV1834BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1834: bending level
internal fun PlayerActivity.showV1834BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1834: binding mode
internal fun PlayerActivity.showV1834BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834binding
    FeaturePrefsStore.batch1831.v1834binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1834: biting mode
internal fun PlayerActivity.showV1834BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834biting
    FeaturePrefsStore.batch1831.v1834biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1834: blending mode
internal fun PlayerActivity.showV1834BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834blending
    FeaturePrefsStore.batch1831.v1834blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1834: blessing mode
internal fun PlayerActivity.showV1834BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834blessing
    FeaturePrefsStore.batch1831.v1834blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1834: blinding mode
internal fun PlayerActivity.showV1834BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834blinding
    FeaturePrefsStore.batch1831.v1834blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1835: banned mode
internal fun PlayerActivity.showV1835BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1835banned
    FeaturePrefsStore.batch1831.v1835banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1835: barred mode
internal fun PlayerActivity.showV1835BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1835barred
    FeaturePrefsStore.batch1831.v1835barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1835: batched mode
internal fun PlayerActivity.showV1835BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1835batched
    FeaturePrefsStore.batch1831.v1835batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1835: beamed mode
internal fun PlayerActivity.showV1835BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1835beamed
    FeaturePrefsStore.batch1831.v1835beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1835: bearing mode
internal fun PlayerActivity.showV1835BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835bearing
    FeaturePrefsStore.batch1831.v1835bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1835: beating level
internal fun PlayerActivity.showV1835BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1835: becoming level
internal fun PlayerActivity.showV1835BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1835: beginning level
internal fun PlayerActivity.showV1835BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1835: belonging level
internal fun PlayerActivity.showV1835BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1835: bending level
internal fun PlayerActivity.showV1835BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1835: binding mode
internal fun PlayerActivity.showV1835BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835binding
    FeaturePrefsStore.batch1831.v1835binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1835: biting mode
internal fun PlayerActivity.showV1835BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835biting
    FeaturePrefsStore.batch1831.v1835biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1835: blending mode
internal fun PlayerActivity.showV1835BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835blending
    FeaturePrefsStore.batch1831.v1835blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1835: blessing mode
internal fun PlayerActivity.showV1835BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835blessing
    FeaturePrefsStore.batch1831.v1835blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1835: blinding mode
internal fun PlayerActivity.showV1835BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835blinding
    FeaturePrefsStore.batch1831.v1835blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1836: banned mode
internal fun PlayerActivity.showV1836BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1836banned
    FeaturePrefsStore.batch1831.v1836banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1836: barred mode
internal fun PlayerActivity.showV1836BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1836barred
    FeaturePrefsStore.batch1831.v1836barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1836: batched mode
internal fun PlayerActivity.showV1836BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1836batched
    FeaturePrefsStore.batch1831.v1836batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1836: beamed mode
internal fun PlayerActivity.showV1836BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1836beamed
    FeaturePrefsStore.batch1831.v1836beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1836: bearing mode
internal fun PlayerActivity.showV1836BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836bearing
    FeaturePrefsStore.batch1831.v1836bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1836: beating level
internal fun PlayerActivity.showV1836BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1836: becoming level
internal fun PlayerActivity.showV1836BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1836: beginning level
internal fun PlayerActivity.showV1836BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1836: belonging level
internal fun PlayerActivity.showV1836BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1836: bending level
internal fun PlayerActivity.showV1836BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1836: binding mode
internal fun PlayerActivity.showV1836BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836binding
    FeaturePrefsStore.batch1831.v1836binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1836: biting mode
internal fun PlayerActivity.showV1836BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836biting
    FeaturePrefsStore.batch1831.v1836biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1836: blending mode
internal fun PlayerActivity.showV1836BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836blending
    FeaturePrefsStore.batch1831.v1836blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1836: blessing mode
internal fun PlayerActivity.showV1836BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836blessing
    FeaturePrefsStore.batch1831.v1836blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1836: blinding mode
internal fun PlayerActivity.showV1836BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836blinding
    FeaturePrefsStore.batch1831.v1836blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1837: banned mode
internal fun PlayerActivity.showV1837BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1837banned
    FeaturePrefsStore.batch1831.v1837banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1837: barred mode
internal fun PlayerActivity.showV1837BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1837barred
    FeaturePrefsStore.batch1831.v1837barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1837: batched mode
internal fun PlayerActivity.showV1837BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1837batched
    FeaturePrefsStore.batch1831.v1837batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1837: beamed mode
internal fun PlayerActivity.showV1837BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1837beamed
    FeaturePrefsStore.batch1831.v1837beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1837: bearing mode
internal fun PlayerActivity.showV1837BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837bearing
    FeaturePrefsStore.batch1831.v1837bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1837: beating level
internal fun PlayerActivity.showV1837BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1837: becoming level
internal fun PlayerActivity.showV1837BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1837: beginning level
internal fun PlayerActivity.showV1837BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1837: belonging level
internal fun PlayerActivity.showV1837BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1837: bending level
internal fun PlayerActivity.showV1837BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1837: binding mode
internal fun PlayerActivity.showV1837BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837binding
    FeaturePrefsStore.batch1831.v1837binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1837: biting mode
internal fun PlayerActivity.showV1837BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837biting
    FeaturePrefsStore.batch1831.v1837biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1837: blending mode
internal fun PlayerActivity.showV1837BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837blending
    FeaturePrefsStore.batch1831.v1837blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1837: blessing mode
internal fun PlayerActivity.showV1837BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837blessing
    FeaturePrefsStore.batch1831.v1837blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1837: blinding mode
internal fun PlayerActivity.showV1837BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837blinding
    FeaturePrefsStore.batch1831.v1837blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1838: banned mode
internal fun PlayerActivity.showV1838BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1838banned
    FeaturePrefsStore.batch1831.v1838banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1838: barred mode
internal fun PlayerActivity.showV1838BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1838barred
    FeaturePrefsStore.batch1831.v1838barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1838: batched mode
internal fun PlayerActivity.showV1838BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1838batched
    FeaturePrefsStore.batch1831.v1838batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1838: beamed mode
internal fun PlayerActivity.showV1838BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1838beamed
    FeaturePrefsStore.batch1831.v1838beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1838: bearing mode
internal fun PlayerActivity.showV1838BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838bearing
    FeaturePrefsStore.batch1831.v1838bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1838: beating level
internal fun PlayerActivity.showV1838BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1838: becoming level
internal fun PlayerActivity.showV1838BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1838: beginning level
internal fun PlayerActivity.showV1838BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1838: belonging level
internal fun PlayerActivity.showV1838BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1838: bending level
internal fun PlayerActivity.showV1838BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1838: binding mode
internal fun PlayerActivity.showV1838BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838binding
    FeaturePrefsStore.batch1831.v1838binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1838: biting mode
internal fun PlayerActivity.showV1838BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838biting
    FeaturePrefsStore.batch1831.v1838biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1838: blending mode
internal fun PlayerActivity.showV1838BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838blending
    FeaturePrefsStore.batch1831.v1838blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1838: blessing mode
internal fun PlayerActivity.showV1838BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838blessing
    FeaturePrefsStore.batch1831.v1838blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1838: blinding mode
internal fun PlayerActivity.showV1838BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838blinding
    FeaturePrefsStore.batch1831.v1838blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1839: banned mode
internal fun PlayerActivity.showV1839BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1839banned
    FeaturePrefsStore.batch1831.v1839banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1839: barred mode
internal fun PlayerActivity.showV1839BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1839barred
    FeaturePrefsStore.batch1831.v1839barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1839: batched mode
internal fun PlayerActivity.showV1839BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1839batched
    FeaturePrefsStore.batch1831.v1839batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1839: beamed mode
internal fun PlayerActivity.showV1839BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1839beamed
    FeaturePrefsStore.batch1831.v1839beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1839: bearing mode
internal fun PlayerActivity.showV1839BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839bearing
    FeaturePrefsStore.batch1831.v1839bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1839: beating level
internal fun PlayerActivity.showV1839BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1839: becoming level
internal fun PlayerActivity.showV1839BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1839: beginning level
internal fun PlayerActivity.showV1839BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1839: belonging level
internal fun PlayerActivity.showV1839BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1839: bending level
internal fun PlayerActivity.showV1839BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1839: binding mode
internal fun PlayerActivity.showV1839BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839binding
    FeaturePrefsStore.batch1831.v1839binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1839: biting mode
internal fun PlayerActivity.showV1839BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839biting
    FeaturePrefsStore.batch1831.v1839biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1839: blending mode
internal fun PlayerActivity.showV1839BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839blending
    FeaturePrefsStore.batch1831.v1839blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1839: blessing mode
internal fun PlayerActivity.showV1839BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839blessing
    FeaturePrefsStore.batch1831.v1839blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1839: blinding mode
internal fun PlayerActivity.showV1839BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839blinding
    FeaturePrefsStore.batch1831.v1839blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1840: banned mode
internal fun PlayerActivity.showV1840BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1840banned
    FeaturePrefsStore.batch1831.v1840banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1840: barred mode
internal fun PlayerActivity.showV1840BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1840barred
    FeaturePrefsStore.batch1831.v1840barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1840: batched mode
internal fun PlayerActivity.showV1840BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1840batched
    FeaturePrefsStore.batch1831.v1840batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1840: beamed mode
internal fun PlayerActivity.showV1840BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1840beamed
    FeaturePrefsStore.batch1831.v1840beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1840: bearing mode
internal fun PlayerActivity.showV1840BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840bearing
    FeaturePrefsStore.batch1831.v1840bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1840: beating level
internal fun PlayerActivity.showV1840BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1840: becoming level
internal fun PlayerActivity.showV1840BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1840: beginning level
internal fun PlayerActivity.showV1840BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1840: belonging level
internal fun PlayerActivity.showV1840BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1840: bending level
internal fun PlayerActivity.showV1840BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1840: binding mode
internal fun PlayerActivity.showV1840BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840binding
    FeaturePrefsStore.batch1831.v1840binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1840: biting mode
internal fun PlayerActivity.showV1840BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840biting
    FeaturePrefsStore.batch1831.v1840biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1840: blending mode
internal fun PlayerActivity.showV1840BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840blending
    FeaturePrefsStore.batch1831.v1840blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1840: blessing mode
internal fun PlayerActivity.showV1840BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840blessing
    FeaturePrefsStore.batch1831.v1840blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1840: blinding mode
internal fun PlayerActivity.showV1840BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840blinding
    FeaturePrefsStore.batch1831.v1840blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

