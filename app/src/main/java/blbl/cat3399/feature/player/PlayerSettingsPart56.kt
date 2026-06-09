package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v741: clear mode
internal fun PlayerActivity.showV741ClearToggle() {
    val current = FeaturePrefsStore.batch741.v741clear
    FeaturePrefsStore.batch741.v741clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v741: click mode
internal fun PlayerActivity.showV741ClickToggle() {
    val current = FeaturePrefsStore.batch741.v741click
    FeaturePrefsStore.batch741.v741click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v741: clip mode
internal fun PlayerActivity.showV741ClipToggle() {
    val current = FeaturePrefsStore.batch741.v741clip
    FeaturePrefsStore.batch741.v741clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v741: clone mode
internal fun PlayerActivity.showV741CloneToggle() {
    val current = FeaturePrefsStore.batch741.v741clone
    FeaturePrefsStore.batch741.v741clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v741: close mode
internal fun PlayerActivity.showV741CloseToggle() {
    val current = FeaturePrefsStore.batch741.v741close
    FeaturePrefsStore.batch741.v741close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v741: cluster level
internal fun PlayerActivity.showV741ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v741cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v741cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v741: code level
internal fun PlayerActivity.showV741CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v741code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v741code = value
        AppToast.show(this, "code: $value")
    }
}

// v741: collapse level
internal fun PlayerActivity.showV741CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v741collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v741collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v741: collect level
internal fun PlayerActivity.showV741CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v741collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v741collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v741: column level
internal fun PlayerActivity.showV741ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v741column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v741column = value
        AppToast.show(this, "column: $value")
    }
}

// v741: combine mode
internal fun PlayerActivity.showV741CombineToggle() {
    val current = FeaturePrefsStore.batch741.v741combine
    FeaturePrefsStore.batch741.v741combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v741: command mode
internal fun PlayerActivity.showV741CommandToggle() {
    val current = FeaturePrefsStore.batch741.v741command
    FeaturePrefsStore.batch741.v741command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v741: commit mode
internal fun PlayerActivity.showV741CommitToggle() {
    val current = FeaturePrefsStore.batch741.v741commit
    FeaturePrefsStore.batch741.v741commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v741: compact mode
internal fun PlayerActivity.showV741CompactToggle() {
    val current = FeaturePrefsStore.batch741.v741compact
    FeaturePrefsStore.batch741.v741compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v741: compare mode
internal fun PlayerActivity.showV741CompareToggle() {
    val current = FeaturePrefsStore.batch741.v741compare
    FeaturePrefsStore.batch741.v741compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v742: clear mode
internal fun PlayerActivity.showV742ClearToggle() {
    val current = FeaturePrefsStore.batch741.v742clear
    FeaturePrefsStore.batch741.v742clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v742: click mode
internal fun PlayerActivity.showV742ClickToggle() {
    val current = FeaturePrefsStore.batch741.v742click
    FeaturePrefsStore.batch741.v742click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v742: clip mode
internal fun PlayerActivity.showV742ClipToggle() {
    val current = FeaturePrefsStore.batch741.v742clip
    FeaturePrefsStore.batch741.v742clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v742: clone mode
internal fun PlayerActivity.showV742CloneToggle() {
    val current = FeaturePrefsStore.batch741.v742clone
    FeaturePrefsStore.batch741.v742clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v742: close mode
internal fun PlayerActivity.showV742CloseToggle() {
    val current = FeaturePrefsStore.batch741.v742close
    FeaturePrefsStore.batch741.v742close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v742: cluster level
internal fun PlayerActivity.showV742ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v742cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v742cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v742: code level
internal fun PlayerActivity.showV742CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v742code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v742code = value
        AppToast.show(this, "code: $value")
    }
}

// v742: collapse level
internal fun PlayerActivity.showV742CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v742collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v742collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v742: collect level
internal fun PlayerActivity.showV742CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v742collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v742collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v742: column level
internal fun PlayerActivity.showV742ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v742column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v742column = value
        AppToast.show(this, "column: $value")
    }
}

// v742: combine mode
internal fun PlayerActivity.showV742CombineToggle() {
    val current = FeaturePrefsStore.batch741.v742combine
    FeaturePrefsStore.batch741.v742combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v742: command mode
internal fun PlayerActivity.showV742CommandToggle() {
    val current = FeaturePrefsStore.batch741.v742command
    FeaturePrefsStore.batch741.v742command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v742: commit mode
internal fun PlayerActivity.showV742CommitToggle() {
    val current = FeaturePrefsStore.batch741.v742commit
    FeaturePrefsStore.batch741.v742commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v742: compact mode
internal fun PlayerActivity.showV742CompactToggle() {
    val current = FeaturePrefsStore.batch741.v742compact
    FeaturePrefsStore.batch741.v742compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v742: compare mode
internal fun PlayerActivity.showV742CompareToggle() {
    val current = FeaturePrefsStore.batch741.v742compare
    FeaturePrefsStore.batch741.v742compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v743: clear mode
internal fun PlayerActivity.showV743ClearToggle() {
    val current = FeaturePrefsStore.batch741.v743clear
    FeaturePrefsStore.batch741.v743clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v743: click mode
internal fun PlayerActivity.showV743ClickToggle() {
    val current = FeaturePrefsStore.batch741.v743click
    FeaturePrefsStore.batch741.v743click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v743: clip mode
internal fun PlayerActivity.showV743ClipToggle() {
    val current = FeaturePrefsStore.batch741.v743clip
    FeaturePrefsStore.batch741.v743clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v743: clone mode
internal fun PlayerActivity.showV743CloneToggle() {
    val current = FeaturePrefsStore.batch741.v743clone
    FeaturePrefsStore.batch741.v743clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v743: close mode
internal fun PlayerActivity.showV743CloseToggle() {
    val current = FeaturePrefsStore.batch741.v743close
    FeaturePrefsStore.batch741.v743close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v743: cluster level
internal fun PlayerActivity.showV743ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v743cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v743cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v743: code level
internal fun PlayerActivity.showV743CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v743code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v743code = value
        AppToast.show(this, "code: $value")
    }
}

// v743: collapse level
internal fun PlayerActivity.showV743CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v743collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v743collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v743: collect level
internal fun PlayerActivity.showV743CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v743collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v743collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v743: column level
internal fun PlayerActivity.showV743ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v743column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v743column = value
        AppToast.show(this, "column: $value")
    }
}

// v743: combine mode
internal fun PlayerActivity.showV743CombineToggle() {
    val current = FeaturePrefsStore.batch741.v743combine
    FeaturePrefsStore.batch741.v743combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v743: command mode
internal fun PlayerActivity.showV743CommandToggle() {
    val current = FeaturePrefsStore.batch741.v743command
    FeaturePrefsStore.batch741.v743command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v743: commit mode
internal fun PlayerActivity.showV743CommitToggle() {
    val current = FeaturePrefsStore.batch741.v743commit
    FeaturePrefsStore.batch741.v743commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v743: compact mode
internal fun PlayerActivity.showV743CompactToggle() {
    val current = FeaturePrefsStore.batch741.v743compact
    FeaturePrefsStore.batch741.v743compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v743: compare mode
internal fun PlayerActivity.showV743CompareToggle() {
    val current = FeaturePrefsStore.batch741.v743compare
    FeaturePrefsStore.batch741.v743compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v744: clear mode
internal fun PlayerActivity.showV744ClearToggle() {
    val current = FeaturePrefsStore.batch741.v744clear
    FeaturePrefsStore.batch741.v744clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v744: click mode
internal fun PlayerActivity.showV744ClickToggle() {
    val current = FeaturePrefsStore.batch741.v744click
    FeaturePrefsStore.batch741.v744click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v744: clip mode
internal fun PlayerActivity.showV744ClipToggle() {
    val current = FeaturePrefsStore.batch741.v744clip
    FeaturePrefsStore.batch741.v744clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v744: clone mode
internal fun PlayerActivity.showV744CloneToggle() {
    val current = FeaturePrefsStore.batch741.v744clone
    FeaturePrefsStore.batch741.v744clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v744: close mode
internal fun PlayerActivity.showV744CloseToggle() {
    val current = FeaturePrefsStore.batch741.v744close
    FeaturePrefsStore.batch741.v744close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v744: cluster level
internal fun PlayerActivity.showV744ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v744cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v744cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v744: code level
internal fun PlayerActivity.showV744CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v744code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v744code = value
        AppToast.show(this, "code: $value")
    }
}

// v744: collapse level
internal fun PlayerActivity.showV744CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v744collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v744collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v744: collect level
internal fun PlayerActivity.showV744CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v744collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v744collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v744: column level
internal fun PlayerActivity.showV744ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v744column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v744column = value
        AppToast.show(this, "column: $value")
    }
}

// v744: combine mode
internal fun PlayerActivity.showV744CombineToggle() {
    val current = FeaturePrefsStore.batch741.v744combine
    FeaturePrefsStore.batch741.v744combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v744: command mode
internal fun PlayerActivity.showV744CommandToggle() {
    val current = FeaturePrefsStore.batch741.v744command
    FeaturePrefsStore.batch741.v744command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v744: commit mode
internal fun PlayerActivity.showV744CommitToggle() {
    val current = FeaturePrefsStore.batch741.v744commit
    FeaturePrefsStore.batch741.v744commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v744: compact mode
internal fun PlayerActivity.showV744CompactToggle() {
    val current = FeaturePrefsStore.batch741.v744compact
    FeaturePrefsStore.batch741.v744compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v744: compare mode
internal fun PlayerActivity.showV744CompareToggle() {
    val current = FeaturePrefsStore.batch741.v744compare
    FeaturePrefsStore.batch741.v744compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v745: clear mode
internal fun PlayerActivity.showV745ClearToggle() {
    val current = FeaturePrefsStore.batch741.v745clear
    FeaturePrefsStore.batch741.v745clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v745: click mode
internal fun PlayerActivity.showV745ClickToggle() {
    val current = FeaturePrefsStore.batch741.v745click
    FeaturePrefsStore.batch741.v745click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v745: clip mode
internal fun PlayerActivity.showV745ClipToggle() {
    val current = FeaturePrefsStore.batch741.v745clip
    FeaturePrefsStore.batch741.v745clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v745: clone mode
internal fun PlayerActivity.showV745CloneToggle() {
    val current = FeaturePrefsStore.batch741.v745clone
    FeaturePrefsStore.batch741.v745clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v745: close mode
internal fun PlayerActivity.showV745CloseToggle() {
    val current = FeaturePrefsStore.batch741.v745close
    FeaturePrefsStore.batch741.v745close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v745: cluster level
internal fun PlayerActivity.showV745ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v745cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v745cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v745: code level
internal fun PlayerActivity.showV745CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v745code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v745code = value
        AppToast.show(this, "code: $value")
    }
}

// v745: collapse level
internal fun PlayerActivity.showV745CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v745collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v745collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v745: collect level
internal fun PlayerActivity.showV745CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v745collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v745collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v745: column level
internal fun PlayerActivity.showV745ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v745column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v745column = value
        AppToast.show(this, "column: $value")
    }
}

// v745: combine mode
internal fun PlayerActivity.showV745CombineToggle() {
    val current = FeaturePrefsStore.batch741.v745combine
    FeaturePrefsStore.batch741.v745combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v745: command mode
internal fun PlayerActivity.showV745CommandToggle() {
    val current = FeaturePrefsStore.batch741.v745command
    FeaturePrefsStore.batch741.v745command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v745: commit mode
internal fun PlayerActivity.showV745CommitToggle() {
    val current = FeaturePrefsStore.batch741.v745commit
    FeaturePrefsStore.batch741.v745commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v745: compact mode
internal fun PlayerActivity.showV745CompactToggle() {
    val current = FeaturePrefsStore.batch741.v745compact
    FeaturePrefsStore.batch741.v745compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v745: compare mode
internal fun PlayerActivity.showV745CompareToggle() {
    val current = FeaturePrefsStore.batch741.v745compare
    FeaturePrefsStore.batch741.v745compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v746: clear mode
internal fun PlayerActivity.showV746ClearToggle() {
    val current = FeaturePrefsStore.batch741.v746clear
    FeaturePrefsStore.batch741.v746clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v746: click mode
internal fun PlayerActivity.showV746ClickToggle() {
    val current = FeaturePrefsStore.batch741.v746click
    FeaturePrefsStore.batch741.v746click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v746: clip mode
internal fun PlayerActivity.showV746ClipToggle() {
    val current = FeaturePrefsStore.batch741.v746clip
    FeaturePrefsStore.batch741.v746clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v746: clone mode
internal fun PlayerActivity.showV746CloneToggle() {
    val current = FeaturePrefsStore.batch741.v746clone
    FeaturePrefsStore.batch741.v746clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v746: close mode
internal fun PlayerActivity.showV746CloseToggle() {
    val current = FeaturePrefsStore.batch741.v746close
    FeaturePrefsStore.batch741.v746close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v746: cluster level
internal fun PlayerActivity.showV746ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v746cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v746cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v746: code level
internal fun PlayerActivity.showV746CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v746code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v746code = value
        AppToast.show(this, "code: $value")
    }
}

// v746: collapse level
internal fun PlayerActivity.showV746CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v746collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v746collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v746: collect level
internal fun PlayerActivity.showV746CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v746collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v746collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v746: column level
internal fun PlayerActivity.showV746ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v746column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v746column = value
        AppToast.show(this, "column: $value")
    }
}

// v746: combine mode
internal fun PlayerActivity.showV746CombineToggle() {
    val current = FeaturePrefsStore.batch741.v746combine
    FeaturePrefsStore.batch741.v746combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v746: command mode
internal fun PlayerActivity.showV746CommandToggle() {
    val current = FeaturePrefsStore.batch741.v746command
    FeaturePrefsStore.batch741.v746command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v746: commit mode
internal fun PlayerActivity.showV746CommitToggle() {
    val current = FeaturePrefsStore.batch741.v746commit
    FeaturePrefsStore.batch741.v746commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v746: compact mode
internal fun PlayerActivity.showV746CompactToggle() {
    val current = FeaturePrefsStore.batch741.v746compact
    FeaturePrefsStore.batch741.v746compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v746: compare mode
internal fun PlayerActivity.showV746CompareToggle() {
    val current = FeaturePrefsStore.batch741.v746compare
    FeaturePrefsStore.batch741.v746compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v747: clear mode
internal fun PlayerActivity.showV747ClearToggle() {
    val current = FeaturePrefsStore.batch741.v747clear
    FeaturePrefsStore.batch741.v747clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v747: click mode
internal fun PlayerActivity.showV747ClickToggle() {
    val current = FeaturePrefsStore.batch741.v747click
    FeaturePrefsStore.batch741.v747click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v747: clip mode
internal fun PlayerActivity.showV747ClipToggle() {
    val current = FeaturePrefsStore.batch741.v747clip
    FeaturePrefsStore.batch741.v747clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v747: clone mode
internal fun PlayerActivity.showV747CloneToggle() {
    val current = FeaturePrefsStore.batch741.v747clone
    FeaturePrefsStore.batch741.v747clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v747: close mode
internal fun PlayerActivity.showV747CloseToggle() {
    val current = FeaturePrefsStore.batch741.v747close
    FeaturePrefsStore.batch741.v747close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v747: cluster level
internal fun PlayerActivity.showV747ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v747cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v747cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v747: code level
internal fun PlayerActivity.showV747CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v747code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v747code = value
        AppToast.show(this, "code: $value")
    }
}

// v747: collapse level
internal fun PlayerActivity.showV747CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v747collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v747collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v747: collect level
internal fun PlayerActivity.showV747CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v747collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v747collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v747: column level
internal fun PlayerActivity.showV747ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v747column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v747column = value
        AppToast.show(this, "column: $value")
    }
}

// v747: combine mode
internal fun PlayerActivity.showV747CombineToggle() {
    val current = FeaturePrefsStore.batch741.v747combine
    FeaturePrefsStore.batch741.v747combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v747: command mode
internal fun PlayerActivity.showV747CommandToggle() {
    val current = FeaturePrefsStore.batch741.v747command
    FeaturePrefsStore.batch741.v747command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v747: commit mode
internal fun PlayerActivity.showV747CommitToggle() {
    val current = FeaturePrefsStore.batch741.v747commit
    FeaturePrefsStore.batch741.v747commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v747: compact mode
internal fun PlayerActivity.showV747CompactToggle() {
    val current = FeaturePrefsStore.batch741.v747compact
    FeaturePrefsStore.batch741.v747compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v747: compare mode
internal fun PlayerActivity.showV747CompareToggle() {
    val current = FeaturePrefsStore.batch741.v747compare
    FeaturePrefsStore.batch741.v747compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v748: clear mode
internal fun PlayerActivity.showV748ClearToggle() {
    val current = FeaturePrefsStore.batch741.v748clear
    FeaturePrefsStore.batch741.v748clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v748: click mode
internal fun PlayerActivity.showV748ClickToggle() {
    val current = FeaturePrefsStore.batch741.v748click
    FeaturePrefsStore.batch741.v748click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v748: clip mode
internal fun PlayerActivity.showV748ClipToggle() {
    val current = FeaturePrefsStore.batch741.v748clip
    FeaturePrefsStore.batch741.v748clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v748: clone mode
internal fun PlayerActivity.showV748CloneToggle() {
    val current = FeaturePrefsStore.batch741.v748clone
    FeaturePrefsStore.batch741.v748clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v748: close mode
internal fun PlayerActivity.showV748CloseToggle() {
    val current = FeaturePrefsStore.batch741.v748close
    FeaturePrefsStore.batch741.v748close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v748: cluster level
internal fun PlayerActivity.showV748ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v748cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v748cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v748: code level
internal fun PlayerActivity.showV748CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v748code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v748code = value
        AppToast.show(this, "code: $value")
    }
}

// v748: collapse level
internal fun PlayerActivity.showV748CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v748collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v748collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v748: collect level
internal fun PlayerActivity.showV748CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v748collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v748collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v748: column level
internal fun PlayerActivity.showV748ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v748column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v748column = value
        AppToast.show(this, "column: $value")
    }
}

// v748: combine mode
internal fun PlayerActivity.showV748CombineToggle() {
    val current = FeaturePrefsStore.batch741.v748combine
    FeaturePrefsStore.batch741.v748combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v748: command mode
internal fun PlayerActivity.showV748CommandToggle() {
    val current = FeaturePrefsStore.batch741.v748command
    FeaturePrefsStore.batch741.v748command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v748: commit mode
internal fun PlayerActivity.showV748CommitToggle() {
    val current = FeaturePrefsStore.batch741.v748commit
    FeaturePrefsStore.batch741.v748commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v748: compact mode
internal fun PlayerActivity.showV748CompactToggle() {
    val current = FeaturePrefsStore.batch741.v748compact
    FeaturePrefsStore.batch741.v748compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v748: compare mode
internal fun PlayerActivity.showV748CompareToggle() {
    val current = FeaturePrefsStore.batch741.v748compare
    FeaturePrefsStore.batch741.v748compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v749: clear mode
internal fun PlayerActivity.showV749ClearToggle() {
    val current = FeaturePrefsStore.batch741.v749clear
    FeaturePrefsStore.batch741.v749clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v749: click mode
internal fun PlayerActivity.showV749ClickToggle() {
    val current = FeaturePrefsStore.batch741.v749click
    FeaturePrefsStore.batch741.v749click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v749: clip mode
internal fun PlayerActivity.showV749ClipToggle() {
    val current = FeaturePrefsStore.batch741.v749clip
    FeaturePrefsStore.batch741.v749clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v749: clone mode
internal fun PlayerActivity.showV749CloneToggle() {
    val current = FeaturePrefsStore.batch741.v749clone
    FeaturePrefsStore.batch741.v749clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v749: close mode
internal fun PlayerActivity.showV749CloseToggle() {
    val current = FeaturePrefsStore.batch741.v749close
    FeaturePrefsStore.batch741.v749close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v749: cluster level
internal fun PlayerActivity.showV749ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v749cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v749cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v749: code level
internal fun PlayerActivity.showV749CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v749code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v749code = value
        AppToast.show(this, "code: $value")
    }
}

// v749: collapse level
internal fun PlayerActivity.showV749CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v749collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v749collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v749: collect level
internal fun PlayerActivity.showV749CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v749collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v749collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v749: column level
internal fun PlayerActivity.showV749ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v749column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v749column = value
        AppToast.show(this, "column: $value")
    }
}

// v749: combine mode
internal fun PlayerActivity.showV749CombineToggle() {
    val current = FeaturePrefsStore.batch741.v749combine
    FeaturePrefsStore.batch741.v749combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v749: command mode
internal fun PlayerActivity.showV749CommandToggle() {
    val current = FeaturePrefsStore.batch741.v749command
    FeaturePrefsStore.batch741.v749command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v749: commit mode
internal fun PlayerActivity.showV749CommitToggle() {
    val current = FeaturePrefsStore.batch741.v749commit
    FeaturePrefsStore.batch741.v749commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v749: compact mode
internal fun PlayerActivity.showV749CompactToggle() {
    val current = FeaturePrefsStore.batch741.v749compact
    FeaturePrefsStore.batch741.v749compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v749: compare mode
internal fun PlayerActivity.showV749CompareToggle() {
    val current = FeaturePrefsStore.batch741.v749compare
    FeaturePrefsStore.batch741.v749compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

// v750: clear mode
internal fun PlayerActivity.showV750ClearToggle() {
    val current = FeaturePrefsStore.batch741.v750clear
    FeaturePrefsStore.batch741.v750clear = !current
    AppToast.show(this, "clear: ${if (!current) "ON" else "OFF"}")
}

// v750: click mode
internal fun PlayerActivity.showV750ClickToggle() {
    val current = FeaturePrefsStore.batch741.v750click
    FeaturePrefsStore.batch741.v750click = !current
    AppToast.show(this, "click: ${if (!current) "ON" else "OFF"}")
}

// v750: clip mode
internal fun PlayerActivity.showV750ClipToggle() {
    val current = FeaturePrefsStore.batch741.v750clip
    FeaturePrefsStore.batch741.v750clip = !current
    AppToast.show(this, "clip: ${if (!current) "ON" else "OFF"}")
}

// v750: clone mode
internal fun PlayerActivity.showV750CloneToggle() {
    val current = FeaturePrefsStore.batch741.v750clone
    FeaturePrefsStore.batch741.v750clone = !current
    AppToast.show(this, "clone: ${if (!current) "ON" else "OFF"}")
}

// v750: close mode
internal fun PlayerActivity.showV750CloseToggle() {
    val current = FeaturePrefsStore.batch741.v750close
    FeaturePrefsStore.batch741.v750close = !current
    AppToast.show(this, "close: ${if (!current) "ON" else "OFF"}")
}

// v750: cluster level
internal fun PlayerActivity.showV750ClusterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v750cluster).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cluster level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v750cluster = value
        AppToast.show(this, "cluster: $value")
    }
}

// v750: code level
internal fun PlayerActivity.showV750CodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v750code).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "code level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v750code = value
        AppToast.show(this, "code: $value")
    }
}

// v750: collapse level
internal fun PlayerActivity.showV750CollapseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v750collapse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v750collapse = value
        AppToast.show(this, "collapse: $value")
    }
}

// v750: collect level
internal fun PlayerActivity.showV750CollectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v750collect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v750collect = value
        AppToast.show(this, "collect: $value")
    }
}

// v750: column level
internal fun PlayerActivity.showV750ColumnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v750column).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "column level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v750column = value
        AppToast.show(this, "column: $value")
    }
}

// v750: combine mode
internal fun PlayerActivity.showV750CombineToggle() {
    val current = FeaturePrefsStore.batch741.v750combine
    FeaturePrefsStore.batch741.v750combine = !current
    AppToast.show(this, "combine: ${if (!current) "ON" else "OFF"}")
}

// v750: command mode
internal fun PlayerActivity.showV750CommandToggle() {
    val current = FeaturePrefsStore.batch741.v750command
    FeaturePrefsStore.batch741.v750command = !current
    AppToast.show(this, "command: ${if (!current) "ON" else "OFF"}")
}

// v750: commit mode
internal fun PlayerActivity.showV750CommitToggle() {
    val current = FeaturePrefsStore.batch741.v750commit
    FeaturePrefsStore.batch741.v750commit = !current
    AppToast.show(this, "commit: ${if (!current) "ON" else "OFF"}")
}

// v750: compact mode
internal fun PlayerActivity.showV750CompactToggle() {
    val current = FeaturePrefsStore.batch741.v750compact
    FeaturePrefsStore.batch741.v750compact = !current
    AppToast.show(this, "compact: ${if (!current) "ON" else "OFF"}")
}

// v750: compare mode
internal fun PlayerActivity.showV750CompareToggle() {
    val current = FeaturePrefsStore.batch741.v750compare
    FeaturePrefsStore.batch741.v750compare = !current
    AppToast.show(this, "compare: ${if (!current) "ON" else "OFF"}")
}

