package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v791: disable mode
internal fun PlayerActivity.showV791DisableToggle() {
    val current = FeaturePrefsStore.batch791.v791disable
    FeaturePrefsStore.batch791.v791disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v791: discard mode
internal fun PlayerActivity.showV791DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v791discard
    FeaturePrefsStore.batch791.v791discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v791: discover mode
internal fun PlayerActivity.showV791DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v791discover
    FeaturePrefsStore.batch791.v791discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v791: dispatch mode
internal fun PlayerActivity.showV791DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v791dispatch
    FeaturePrefsStore.batch791.v791dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v791: display mode
internal fun PlayerActivity.showV791DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v791display
    FeaturePrefsStore.batch791.v791display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v791: dispose level
internal fun PlayerActivity.showV791DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v791: distance level
internal fun PlayerActivity.showV791DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v791: distribute level
internal fun PlayerActivity.showV791DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v791: divide level
internal fun PlayerActivity.showV791DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v791: document level
internal fun PlayerActivity.showV791DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791document = value
        AppToast.show(this, "document: $value")
    }
}

// v791: domain mode
internal fun PlayerActivity.showV791DomainToggle() {
    val current = FeaturePrefsStore.batch791.v791domain
    FeaturePrefsStore.batch791.v791domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v791: download mode
internal fun PlayerActivity.showV791DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v791download
    FeaturePrefsStore.batch791.v791download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v791: draft mode
internal fun PlayerActivity.showV791DraftToggle() {
    val current = FeaturePrefsStore.batch791.v791draft
    FeaturePrefsStore.batch791.v791draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v791: drag mode
internal fun PlayerActivity.showV791DragToggle() {
    val current = FeaturePrefsStore.batch791.v791drag
    FeaturePrefsStore.batch791.v791drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v791: draw mode
internal fun PlayerActivity.showV791DrawToggle() {
    val current = FeaturePrefsStore.batch791.v791draw
    FeaturePrefsStore.batch791.v791draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v792: disable mode
internal fun PlayerActivity.showV792DisableToggle() {
    val current = FeaturePrefsStore.batch791.v792disable
    FeaturePrefsStore.batch791.v792disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v792: discard mode
internal fun PlayerActivity.showV792DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v792discard
    FeaturePrefsStore.batch791.v792discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v792: discover mode
internal fun PlayerActivity.showV792DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v792discover
    FeaturePrefsStore.batch791.v792discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v792: dispatch mode
internal fun PlayerActivity.showV792DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v792dispatch
    FeaturePrefsStore.batch791.v792dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v792: display mode
internal fun PlayerActivity.showV792DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v792display
    FeaturePrefsStore.batch791.v792display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v792: dispose level
internal fun PlayerActivity.showV792DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v792: distance level
internal fun PlayerActivity.showV792DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v792: distribute level
internal fun PlayerActivity.showV792DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v792: divide level
internal fun PlayerActivity.showV792DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v792: document level
internal fun PlayerActivity.showV792DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792document = value
        AppToast.show(this, "document: $value")
    }
}

// v792: domain mode
internal fun PlayerActivity.showV792DomainToggle() {
    val current = FeaturePrefsStore.batch791.v792domain
    FeaturePrefsStore.batch791.v792domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v792: download mode
internal fun PlayerActivity.showV792DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v792download
    FeaturePrefsStore.batch791.v792download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v792: draft mode
internal fun PlayerActivity.showV792DraftToggle() {
    val current = FeaturePrefsStore.batch791.v792draft
    FeaturePrefsStore.batch791.v792draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v792: drag mode
internal fun PlayerActivity.showV792DragToggle() {
    val current = FeaturePrefsStore.batch791.v792drag
    FeaturePrefsStore.batch791.v792drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v792: draw mode
internal fun PlayerActivity.showV792DrawToggle() {
    val current = FeaturePrefsStore.batch791.v792draw
    FeaturePrefsStore.batch791.v792draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v793: disable mode
internal fun PlayerActivity.showV793DisableToggle() {
    val current = FeaturePrefsStore.batch791.v793disable
    FeaturePrefsStore.batch791.v793disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v793: discard mode
internal fun PlayerActivity.showV793DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v793discard
    FeaturePrefsStore.batch791.v793discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v793: discover mode
internal fun PlayerActivity.showV793DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v793discover
    FeaturePrefsStore.batch791.v793discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v793: dispatch mode
internal fun PlayerActivity.showV793DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v793dispatch
    FeaturePrefsStore.batch791.v793dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v793: display mode
internal fun PlayerActivity.showV793DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v793display
    FeaturePrefsStore.batch791.v793display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v793: dispose level
internal fun PlayerActivity.showV793DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v793: distance level
internal fun PlayerActivity.showV793DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v793: distribute level
internal fun PlayerActivity.showV793DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v793: divide level
internal fun PlayerActivity.showV793DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v793: document level
internal fun PlayerActivity.showV793DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793document = value
        AppToast.show(this, "document: $value")
    }
}

// v793: domain mode
internal fun PlayerActivity.showV793DomainToggle() {
    val current = FeaturePrefsStore.batch791.v793domain
    FeaturePrefsStore.batch791.v793domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v793: download mode
internal fun PlayerActivity.showV793DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v793download
    FeaturePrefsStore.batch791.v793download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v793: draft mode
internal fun PlayerActivity.showV793DraftToggle() {
    val current = FeaturePrefsStore.batch791.v793draft
    FeaturePrefsStore.batch791.v793draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v793: drag mode
internal fun PlayerActivity.showV793DragToggle() {
    val current = FeaturePrefsStore.batch791.v793drag
    FeaturePrefsStore.batch791.v793drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v793: draw mode
internal fun PlayerActivity.showV793DrawToggle() {
    val current = FeaturePrefsStore.batch791.v793draw
    FeaturePrefsStore.batch791.v793draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v794: disable mode
internal fun PlayerActivity.showV794DisableToggle() {
    val current = FeaturePrefsStore.batch791.v794disable
    FeaturePrefsStore.batch791.v794disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v794: discard mode
internal fun PlayerActivity.showV794DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v794discard
    FeaturePrefsStore.batch791.v794discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v794: discover mode
internal fun PlayerActivity.showV794DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v794discover
    FeaturePrefsStore.batch791.v794discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v794: dispatch mode
internal fun PlayerActivity.showV794DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v794dispatch
    FeaturePrefsStore.batch791.v794dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v794: display mode
internal fun PlayerActivity.showV794DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v794display
    FeaturePrefsStore.batch791.v794display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v794: dispose level
internal fun PlayerActivity.showV794DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v794: distance level
internal fun PlayerActivity.showV794DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v794: distribute level
internal fun PlayerActivity.showV794DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v794: divide level
internal fun PlayerActivity.showV794DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v794: document level
internal fun PlayerActivity.showV794DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794document = value
        AppToast.show(this, "document: $value")
    }
}

// v794: domain mode
internal fun PlayerActivity.showV794DomainToggle() {
    val current = FeaturePrefsStore.batch791.v794domain
    FeaturePrefsStore.batch791.v794domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v794: download mode
internal fun PlayerActivity.showV794DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v794download
    FeaturePrefsStore.batch791.v794download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v794: draft mode
internal fun PlayerActivity.showV794DraftToggle() {
    val current = FeaturePrefsStore.batch791.v794draft
    FeaturePrefsStore.batch791.v794draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v794: drag mode
internal fun PlayerActivity.showV794DragToggle() {
    val current = FeaturePrefsStore.batch791.v794drag
    FeaturePrefsStore.batch791.v794drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v794: draw mode
internal fun PlayerActivity.showV794DrawToggle() {
    val current = FeaturePrefsStore.batch791.v794draw
    FeaturePrefsStore.batch791.v794draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v795: disable mode
internal fun PlayerActivity.showV795DisableToggle() {
    val current = FeaturePrefsStore.batch791.v795disable
    FeaturePrefsStore.batch791.v795disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v795: discard mode
internal fun PlayerActivity.showV795DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v795discard
    FeaturePrefsStore.batch791.v795discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v795: discover mode
internal fun PlayerActivity.showV795DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v795discover
    FeaturePrefsStore.batch791.v795discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v795: dispatch mode
internal fun PlayerActivity.showV795DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v795dispatch
    FeaturePrefsStore.batch791.v795dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v795: display mode
internal fun PlayerActivity.showV795DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v795display
    FeaturePrefsStore.batch791.v795display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v795: dispose level
internal fun PlayerActivity.showV795DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v795: distance level
internal fun PlayerActivity.showV795DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v795: distribute level
internal fun PlayerActivity.showV795DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v795: divide level
internal fun PlayerActivity.showV795DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v795: document level
internal fun PlayerActivity.showV795DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795document = value
        AppToast.show(this, "document: $value")
    }
}

// v795: domain mode
internal fun PlayerActivity.showV795DomainToggle() {
    val current = FeaturePrefsStore.batch791.v795domain
    FeaturePrefsStore.batch791.v795domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v795: download mode
internal fun PlayerActivity.showV795DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v795download
    FeaturePrefsStore.batch791.v795download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v795: draft mode
internal fun PlayerActivity.showV795DraftToggle() {
    val current = FeaturePrefsStore.batch791.v795draft
    FeaturePrefsStore.batch791.v795draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v795: drag mode
internal fun PlayerActivity.showV795DragToggle() {
    val current = FeaturePrefsStore.batch791.v795drag
    FeaturePrefsStore.batch791.v795drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v795: draw mode
internal fun PlayerActivity.showV795DrawToggle() {
    val current = FeaturePrefsStore.batch791.v795draw
    FeaturePrefsStore.batch791.v795draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v796: disable mode
internal fun PlayerActivity.showV796DisableToggle() {
    val current = FeaturePrefsStore.batch791.v796disable
    FeaturePrefsStore.batch791.v796disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v796: discard mode
internal fun PlayerActivity.showV796DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v796discard
    FeaturePrefsStore.batch791.v796discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v796: discover mode
internal fun PlayerActivity.showV796DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v796discover
    FeaturePrefsStore.batch791.v796discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v796: dispatch mode
internal fun PlayerActivity.showV796DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v796dispatch
    FeaturePrefsStore.batch791.v796dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v796: display mode
internal fun PlayerActivity.showV796DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v796display
    FeaturePrefsStore.batch791.v796display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v796: dispose level
internal fun PlayerActivity.showV796DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v796: distance level
internal fun PlayerActivity.showV796DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v796: distribute level
internal fun PlayerActivity.showV796DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v796: divide level
internal fun PlayerActivity.showV796DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v796: document level
internal fun PlayerActivity.showV796DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796document = value
        AppToast.show(this, "document: $value")
    }
}

// v796: domain mode
internal fun PlayerActivity.showV796DomainToggle() {
    val current = FeaturePrefsStore.batch791.v796domain
    FeaturePrefsStore.batch791.v796domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v796: download mode
internal fun PlayerActivity.showV796DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v796download
    FeaturePrefsStore.batch791.v796download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v796: draft mode
internal fun PlayerActivity.showV796DraftToggle() {
    val current = FeaturePrefsStore.batch791.v796draft
    FeaturePrefsStore.batch791.v796draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v796: drag mode
internal fun PlayerActivity.showV796DragToggle() {
    val current = FeaturePrefsStore.batch791.v796drag
    FeaturePrefsStore.batch791.v796drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v796: draw mode
internal fun PlayerActivity.showV796DrawToggle() {
    val current = FeaturePrefsStore.batch791.v796draw
    FeaturePrefsStore.batch791.v796draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v797: disable mode
internal fun PlayerActivity.showV797DisableToggle() {
    val current = FeaturePrefsStore.batch791.v797disable
    FeaturePrefsStore.batch791.v797disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v797: discard mode
internal fun PlayerActivity.showV797DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v797discard
    FeaturePrefsStore.batch791.v797discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v797: discover mode
internal fun PlayerActivity.showV797DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v797discover
    FeaturePrefsStore.batch791.v797discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v797: dispatch mode
internal fun PlayerActivity.showV797DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v797dispatch
    FeaturePrefsStore.batch791.v797dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v797: display mode
internal fun PlayerActivity.showV797DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v797display
    FeaturePrefsStore.batch791.v797display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v797: dispose level
internal fun PlayerActivity.showV797DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v797: distance level
internal fun PlayerActivity.showV797DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v797: distribute level
internal fun PlayerActivity.showV797DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v797: divide level
internal fun PlayerActivity.showV797DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v797: document level
internal fun PlayerActivity.showV797DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797document = value
        AppToast.show(this, "document: $value")
    }
}

// v797: domain mode
internal fun PlayerActivity.showV797DomainToggle() {
    val current = FeaturePrefsStore.batch791.v797domain
    FeaturePrefsStore.batch791.v797domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v797: download mode
internal fun PlayerActivity.showV797DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v797download
    FeaturePrefsStore.batch791.v797download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v797: draft mode
internal fun PlayerActivity.showV797DraftToggle() {
    val current = FeaturePrefsStore.batch791.v797draft
    FeaturePrefsStore.batch791.v797draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v797: drag mode
internal fun PlayerActivity.showV797DragToggle() {
    val current = FeaturePrefsStore.batch791.v797drag
    FeaturePrefsStore.batch791.v797drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v797: draw mode
internal fun PlayerActivity.showV797DrawToggle() {
    val current = FeaturePrefsStore.batch791.v797draw
    FeaturePrefsStore.batch791.v797draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v798: disable mode
internal fun PlayerActivity.showV798DisableToggle() {
    val current = FeaturePrefsStore.batch791.v798disable
    FeaturePrefsStore.batch791.v798disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v798: discard mode
internal fun PlayerActivity.showV798DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v798discard
    FeaturePrefsStore.batch791.v798discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v798: discover mode
internal fun PlayerActivity.showV798DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v798discover
    FeaturePrefsStore.batch791.v798discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v798: dispatch mode
internal fun PlayerActivity.showV798DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v798dispatch
    FeaturePrefsStore.batch791.v798dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v798: display mode
internal fun PlayerActivity.showV798DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v798display
    FeaturePrefsStore.batch791.v798display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v798: dispose level
internal fun PlayerActivity.showV798DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v798: distance level
internal fun PlayerActivity.showV798DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v798: distribute level
internal fun PlayerActivity.showV798DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v798: divide level
internal fun PlayerActivity.showV798DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v798: document level
internal fun PlayerActivity.showV798DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798document = value
        AppToast.show(this, "document: $value")
    }
}

// v798: domain mode
internal fun PlayerActivity.showV798DomainToggle() {
    val current = FeaturePrefsStore.batch791.v798domain
    FeaturePrefsStore.batch791.v798domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v798: download mode
internal fun PlayerActivity.showV798DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v798download
    FeaturePrefsStore.batch791.v798download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v798: draft mode
internal fun PlayerActivity.showV798DraftToggle() {
    val current = FeaturePrefsStore.batch791.v798draft
    FeaturePrefsStore.batch791.v798draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v798: drag mode
internal fun PlayerActivity.showV798DragToggle() {
    val current = FeaturePrefsStore.batch791.v798drag
    FeaturePrefsStore.batch791.v798drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v798: draw mode
internal fun PlayerActivity.showV798DrawToggle() {
    val current = FeaturePrefsStore.batch791.v798draw
    FeaturePrefsStore.batch791.v798draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v799: disable mode
internal fun PlayerActivity.showV799DisableToggle() {
    val current = FeaturePrefsStore.batch791.v799disable
    FeaturePrefsStore.batch791.v799disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v799: discard mode
internal fun PlayerActivity.showV799DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v799discard
    FeaturePrefsStore.batch791.v799discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v799: discover mode
internal fun PlayerActivity.showV799DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v799discover
    FeaturePrefsStore.batch791.v799discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v799: dispatch mode
internal fun PlayerActivity.showV799DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v799dispatch
    FeaturePrefsStore.batch791.v799dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v799: display mode
internal fun PlayerActivity.showV799DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v799display
    FeaturePrefsStore.batch791.v799display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v799: dispose level
internal fun PlayerActivity.showV799DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v799: distance level
internal fun PlayerActivity.showV799DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v799: distribute level
internal fun PlayerActivity.showV799DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v799: divide level
internal fun PlayerActivity.showV799DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v799: document level
internal fun PlayerActivity.showV799DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799document = value
        AppToast.show(this, "document: $value")
    }
}

// v799: domain mode
internal fun PlayerActivity.showV799DomainToggle() {
    val current = FeaturePrefsStore.batch791.v799domain
    FeaturePrefsStore.batch791.v799domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v799: download mode
internal fun PlayerActivity.showV799DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v799download
    FeaturePrefsStore.batch791.v799download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v799: draft mode
internal fun PlayerActivity.showV799DraftToggle() {
    val current = FeaturePrefsStore.batch791.v799draft
    FeaturePrefsStore.batch791.v799draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v799: drag mode
internal fun PlayerActivity.showV799DragToggle() {
    val current = FeaturePrefsStore.batch791.v799drag
    FeaturePrefsStore.batch791.v799drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v799: draw mode
internal fun PlayerActivity.showV799DrawToggle() {
    val current = FeaturePrefsStore.batch791.v799draw
    FeaturePrefsStore.batch791.v799draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v800: disable mode
internal fun PlayerActivity.showV800DisableToggle() {
    val current = FeaturePrefsStore.batch791.v800disable
    FeaturePrefsStore.batch791.v800disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v800: discard mode
internal fun PlayerActivity.showV800DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v800discard
    FeaturePrefsStore.batch791.v800discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v800: discover mode
internal fun PlayerActivity.showV800DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v800discover
    FeaturePrefsStore.batch791.v800discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v800: dispatch mode
internal fun PlayerActivity.showV800DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v800dispatch
    FeaturePrefsStore.batch791.v800dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v800: display mode
internal fun PlayerActivity.showV800DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v800display
    FeaturePrefsStore.batch791.v800display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v800: dispose level
internal fun PlayerActivity.showV800DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v800: distance level
internal fun PlayerActivity.showV800DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v800: distribute level
internal fun PlayerActivity.showV800DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v800: divide level
internal fun PlayerActivity.showV800DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v800: document level
internal fun PlayerActivity.showV800DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800document = value
        AppToast.show(this, "document: $value")
    }
}

// v800: domain mode
internal fun PlayerActivity.showV800DomainToggle() {
    val current = FeaturePrefsStore.batch791.v800domain
    FeaturePrefsStore.batch791.v800domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v800: download mode
internal fun PlayerActivity.showV800DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v800download
    FeaturePrefsStore.batch791.v800download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v800: draft mode
internal fun PlayerActivity.showV800DraftToggle() {
    val current = FeaturePrefsStore.batch791.v800draft
    FeaturePrefsStore.batch791.v800draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v800: drag mode
internal fun PlayerActivity.showV800DragToggle() {
    val current = FeaturePrefsStore.batch791.v800drag
    FeaturePrefsStore.batch791.v800drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v800: draw mode
internal fun PlayerActivity.showV800DrawToggle() {
    val current = FeaturePrefsStore.batch791.v800draw
    FeaturePrefsStore.batch791.v800draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

