package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

// v741: cluster mode
internal fun PlayerActivity.showV741ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v741cluster
    FeaturePrefsStore.batch741.v741cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v741: combine level
internal fun PlayerActivity.showV741CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v741combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v741combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v741: compile mode
internal fun PlayerActivity.showV741CompileToggle() {
    val current = FeaturePrefsStore.batch741.v741compile
    FeaturePrefsStore.batch741.v741compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v742: cluster mode
internal fun PlayerActivity.showV742ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v742cluster
    FeaturePrefsStore.batch741.v742cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v742: combine level
internal fun PlayerActivity.showV742CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v742combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v742combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v742: compile mode
internal fun PlayerActivity.showV742CompileToggle() {
    val current = FeaturePrefsStore.batch741.v742compile
    FeaturePrefsStore.batch741.v742compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v743: cluster mode
internal fun PlayerActivity.showV743ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v743cluster
    FeaturePrefsStore.batch741.v743cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v743: combine level
internal fun PlayerActivity.showV743CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v743combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v743combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v743: compile mode
internal fun PlayerActivity.showV743CompileToggle() {
    val current = FeaturePrefsStore.batch741.v743compile
    FeaturePrefsStore.batch741.v743compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v744: cluster mode
internal fun PlayerActivity.showV744ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v744cluster
    FeaturePrefsStore.batch741.v744cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v744: combine level
internal fun PlayerActivity.showV744CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v744combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v744combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v744: compile mode
internal fun PlayerActivity.showV744CompileToggle() {
    val current = FeaturePrefsStore.batch741.v744compile
    FeaturePrefsStore.batch741.v744compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v745: cluster mode
internal fun PlayerActivity.showV745ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v745cluster
    FeaturePrefsStore.batch741.v745cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v745: combine level
internal fun PlayerActivity.showV745CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v745combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v745combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v745: compile mode
internal fun PlayerActivity.showV745CompileToggle() {
    val current = FeaturePrefsStore.batch741.v745compile
    FeaturePrefsStore.batch741.v745compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v746: cluster mode
internal fun PlayerActivity.showV746ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v746cluster
    FeaturePrefsStore.batch741.v746cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v746: combine level
internal fun PlayerActivity.showV746CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v746combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v746combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v746: compile mode
internal fun PlayerActivity.showV746CompileToggle() {
    val current = FeaturePrefsStore.batch741.v746compile
    FeaturePrefsStore.batch741.v746compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v747: cluster mode
internal fun PlayerActivity.showV747ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v747cluster
    FeaturePrefsStore.batch741.v747cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v747: combine level
internal fun PlayerActivity.showV747CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v747combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v747combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v747: compile mode
internal fun PlayerActivity.showV747CompileToggle() {
    val current = FeaturePrefsStore.batch741.v747compile
    FeaturePrefsStore.batch741.v747compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v748: cluster mode
internal fun PlayerActivity.showV748ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v748cluster
    FeaturePrefsStore.batch741.v748cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v748: combine level
internal fun PlayerActivity.showV748CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v748combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v748combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v748: compile mode
internal fun PlayerActivity.showV748CompileToggle() {
    val current = FeaturePrefsStore.batch741.v748compile
    FeaturePrefsStore.batch741.v748compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v749: cluster mode
internal fun PlayerActivity.showV749ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v749cluster
    FeaturePrefsStore.batch741.v749cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v749: combine level
internal fun PlayerActivity.showV749CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v749combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v749combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v749: compile mode
internal fun PlayerActivity.showV749CompileToggle() {
    val current = FeaturePrefsStore.batch741.v749compile
    FeaturePrefsStore.batch741.v749compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
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

// v750: cluster mode
internal fun PlayerActivity.showV750ClusterToggle() {
    val current = FeaturePrefsStore.batch741.v750cluster
    FeaturePrefsStore.batch741.v750cluster = !current
    AppToast.show(this, "cluster: ${if (!current) "ON" else "OFF"}")
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

// v750: combine level
internal fun PlayerActivity.showV750CombineDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch741.v750combine).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combine level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch741.v750combine = value
        AppToast.show(this, "combine: $value")
    }
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

// v750: compile mode
internal fun PlayerActivity.showV750CompileToggle() {
    val current = FeaturePrefsStore.batch741.v750compile
    FeaturePrefsStore.batch741.v750compile = !current
    AppToast.show(this, "compile: ${if (!current) "ON" else "OFF"}")
}

// v751: complete mode
internal fun PlayerActivity.showV751CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v751complete
    FeaturePrefsStore.batch751.v751complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v751: compress mode
internal fun PlayerActivity.showV751CompressToggle() {
    val current = FeaturePrefsStore.batch751.v751compress
    FeaturePrefsStore.batch751.v751compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v751: compute mode
internal fun PlayerActivity.showV751ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v751compute
    FeaturePrefsStore.batch751.v751compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v751: concat mode
internal fun PlayerActivity.showV751ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v751concat
    FeaturePrefsStore.batch751.v751concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v751: concurrent mode
internal fun PlayerActivity.showV751ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v751concurrent
    FeaturePrefsStore.batch751.v751concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v751: condition level
internal fun PlayerActivity.showV751ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v751: configure level
internal fun PlayerActivity.showV751ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v751: confirm level
internal fun PlayerActivity.showV751ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v751: connect level
internal fun PlayerActivity.showV751ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v751: console level
internal fun PlayerActivity.showV751ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751console = value
        AppToast.show(this, "console: $value")
    }
}

// v751: constant mode
internal fun PlayerActivity.showV751ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v751constant
    FeaturePrefsStore.batch751.v751constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v751: constraint mode
internal fun PlayerActivity.showV751ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v751constraint
    FeaturePrefsStore.batch751.v751constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v751: consume mode
internal fun PlayerActivity.showV751ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v751consume
    FeaturePrefsStore.batch751.v751consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v751: content mode
internal fun PlayerActivity.showV751ContentToggle() {
    val current = FeaturePrefsStore.batch751.v751content
    FeaturePrefsStore.batch751.v751content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v751: context mode
internal fun PlayerActivity.showV751ContextToggle() {
    val current = FeaturePrefsStore.batch751.v751context
    FeaturePrefsStore.batch751.v751context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v752: complete mode
internal fun PlayerActivity.showV752CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v752complete
    FeaturePrefsStore.batch751.v752complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v752: compress mode
internal fun PlayerActivity.showV752CompressToggle() {
    val current = FeaturePrefsStore.batch751.v752compress
    FeaturePrefsStore.batch751.v752compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v752: compute mode
internal fun PlayerActivity.showV752ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v752compute
    FeaturePrefsStore.batch751.v752compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v752: concat mode
internal fun PlayerActivity.showV752ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v752concat
    FeaturePrefsStore.batch751.v752concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v752: concurrent mode
internal fun PlayerActivity.showV752ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v752concurrent
    FeaturePrefsStore.batch751.v752concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v752: condition level
internal fun PlayerActivity.showV752ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v752: configure level
internal fun PlayerActivity.showV752ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v752: confirm level
internal fun PlayerActivity.showV752ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v752: connect level
internal fun PlayerActivity.showV752ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v752: console level
internal fun PlayerActivity.showV752ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752console = value
        AppToast.show(this, "console: $value")
    }
}

// v752: constant mode
internal fun PlayerActivity.showV752ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v752constant
    FeaturePrefsStore.batch751.v752constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v752: constraint mode
internal fun PlayerActivity.showV752ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v752constraint
    FeaturePrefsStore.batch751.v752constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v752: consume mode
internal fun PlayerActivity.showV752ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v752consume
    FeaturePrefsStore.batch751.v752consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v752: content mode
internal fun PlayerActivity.showV752ContentToggle() {
    val current = FeaturePrefsStore.batch751.v752content
    FeaturePrefsStore.batch751.v752content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v752: context mode
internal fun PlayerActivity.showV752ContextToggle() {
    val current = FeaturePrefsStore.batch751.v752context
    FeaturePrefsStore.batch751.v752context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v753: complete mode
internal fun PlayerActivity.showV753CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v753complete
    FeaturePrefsStore.batch751.v753complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v753: compress mode
internal fun PlayerActivity.showV753CompressToggle() {
    val current = FeaturePrefsStore.batch751.v753compress
    FeaturePrefsStore.batch751.v753compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v753: compute mode
internal fun PlayerActivity.showV753ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v753compute
    FeaturePrefsStore.batch751.v753compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v753: concat mode
internal fun PlayerActivity.showV753ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v753concat
    FeaturePrefsStore.batch751.v753concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v753: concurrent mode
internal fun PlayerActivity.showV753ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v753concurrent
    FeaturePrefsStore.batch751.v753concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v753: condition level
internal fun PlayerActivity.showV753ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v753: configure level
internal fun PlayerActivity.showV753ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v753: confirm level
internal fun PlayerActivity.showV753ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v753: connect level
internal fun PlayerActivity.showV753ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v753: console level
internal fun PlayerActivity.showV753ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753console = value
        AppToast.show(this, "console: $value")
    }
}

// v753: constant mode
internal fun PlayerActivity.showV753ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v753constant
    FeaturePrefsStore.batch751.v753constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v753: constraint mode
internal fun PlayerActivity.showV753ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v753constraint
    FeaturePrefsStore.batch751.v753constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v753: consume mode
internal fun PlayerActivity.showV753ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v753consume
    FeaturePrefsStore.batch751.v753consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v753: content mode
internal fun PlayerActivity.showV753ContentToggle() {
    val current = FeaturePrefsStore.batch751.v753content
    FeaturePrefsStore.batch751.v753content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v753: context mode
internal fun PlayerActivity.showV753ContextToggle() {
    val current = FeaturePrefsStore.batch751.v753context
    FeaturePrefsStore.batch751.v753context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v754: complete mode
internal fun PlayerActivity.showV754CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v754complete
    FeaturePrefsStore.batch751.v754complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v754: compress mode
internal fun PlayerActivity.showV754CompressToggle() {
    val current = FeaturePrefsStore.batch751.v754compress
    FeaturePrefsStore.batch751.v754compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v754: compute mode
internal fun PlayerActivity.showV754ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v754compute
    FeaturePrefsStore.batch751.v754compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v754: concat mode
internal fun PlayerActivity.showV754ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v754concat
    FeaturePrefsStore.batch751.v754concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v754: concurrent mode
internal fun PlayerActivity.showV754ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v754concurrent
    FeaturePrefsStore.batch751.v754concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v754: condition level
internal fun PlayerActivity.showV754ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v754: configure level
internal fun PlayerActivity.showV754ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v754: confirm level
internal fun PlayerActivity.showV754ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v754: connect level
internal fun PlayerActivity.showV754ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v754: console level
internal fun PlayerActivity.showV754ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754console = value
        AppToast.show(this, "console: $value")
    }
}

// v754: constant mode
internal fun PlayerActivity.showV754ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v754constant
    FeaturePrefsStore.batch751.v754constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v754: constraint mode
internal fun PlayerActivity.showV754ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v754constraint
    FeaturePrefsStore.batch751.v754constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v754: consume mode
internal fun PlayerActivity.showV754ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v754consume
    FeaturePrefsStore.batch751.v754consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v754: content mode
internal fun PlayerActivity.showV754ContentToggle() {
    val current = FeaturePrefsStore.batch751.v754content
    FeaturePrefsStore.batch751.v754content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v754: context mode
internal fun PlayerActivity.showV754ContextToggle() {
    val current = FeaturePrefsStore.batch751.v754context
    FeaturePrefsStore.batch751.v754context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v755: complete mode
internal fun PlayerActivity.showV755CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v755complete
    FeaturePrefsStore.batch751.v755complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v755: compress mode
internal fun PlayerActivity.showV755CompressToggle() {
    val current = FeaturePrefsStore.batch751.v755compress
    FeaturePrefsStore.batch751.v755compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v755: compute mode
internal fun PlayerActivity.showV755ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v755compute
    FeaturePrefsStore.batch751.v755compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v755: concat mode
internal fun PlayerActivity.showV755ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v755concat
    FeaturePrefsStore.batch751.v755concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v755: concurrent mode
internal fun PlayerActivity.showV755ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v755concurrent
    FeaturePrefsStore.batch751.v755concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v755: condition level
internal fun PlayerActivity.showV755ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v755: configure level
internal fun PlayerActivity.showV755ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v755: confirm level
internal fun PlayerActivity.showV755ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v755: connect level
internal fun PlayerActivity.showV755ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v755: console level
internal fun PlayerActivity.showV755ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755console = value
        AppToast.show(this, "console: $value")
    }
}

// v755: constant mode
internal fun PlayerActivity.showV755ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v755constant
    FeaturePrefsStore.batch751.v755constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v755: constraint mode
internal fun PlayerActivity.showV755ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v755constraint
    FeaturePrefsStore.batch751.v755constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v755: consume mode
internal fun PlayerActivity.showV755ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v755consume
    FeaturePrefsStore.batch751.v755consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v755: content mode
internal fun PlayerActivity.showV755ContentToggle() {
    val current = FeaturePrefsStore.batch751.v755content
    FeaturePrefsStore.batch751.v755content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v755: context mode
internal fun PlayerActivity.showV755ContextToggle() {
    val current = FeaturePrefsStore.batch751.v755context
    FeaturePrefsStore.batch751.v755context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v756: complete mode
internal fun PlayerActivity.showV756CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v756complete
    FeaturePrefsStore.batch751.v756complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v756: compress mode
internal fun PlayerActivity.showV756CompressToggle() {
    val current = FeaturePrefsStore.batch751.v756compress
    FeaturePrefsStore.batch751.v756compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v756: compute mode
internal fun PlayerActivity.showV756ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v756compute
    FeaturePrefsStore.batch751.v756compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v756: concat mode
internal fun PlayerActivity.showV756ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v756concat
    FeaturePrefsStore.batch751.v756concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v756: concurrent mode
internal fun PlayerActivity.showV756ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v756concurrent
    FeaturePrefsStore.batch751.v756concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v756: condition level
internal fun PlayerActivity.showV756ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v756: configure level
internal fun PlayerActivity.showV756ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v756: confirm level
internal fun PlayerActivity.showV756ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v756: connect level
internal fun PlayerActivity.showV756ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v756: console level
internal fun PlayerActivity.showV756ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756console = value
        AppToast.show(this, "console: $value")
    }
}

// v756: constant mode
internal fun PlayerActivity.showV756ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v756constant
    FeaturePrefsStore.batch751.v756constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v756: constraint mode
internal fun PlayerActivity.showV756ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v756constraint
    FeaturePrefsStore.batch751.v756constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v756: consume mode
internal fun PlayerActivity.showV756ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v756consume
    FeaturePrefsStore.batch751.v756consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v756: content mode
internal fun PlayerActivity.showV756ContentToggle() {
    val current = FeaturePrefsStore.batch751.v756content
    FeaturePrefsStore.batch751.v756content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v756: context mode
internal fun PlayerActivity.showV756ContextToggle() {
    val current = FeaturePrefsStore.batch751.v756context
    FeaturePrefsStore.batch751.v756context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v757: complete mode
internal fun PlayerActivity.showV757CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v757complete
    FeaturePrefsStore.batch751.v757complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v757: compress mode
internal fun PlayerActivity.showV757CompressToggle() {
    val current = FeaturePrefsStore.batch751.v757compress
    FeaturePrefsStore.batch751.v757compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v757: compute mode
internal fun PlayerActivity.showV757ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v757compute
    FeaturePrefsStore.batch751.v757compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v757: concat mode
internal fun PlayerActivity.showV757ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v757concat
    FeaturePrefsStore.batch751.v757concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v757: concurrent mode
internal fun PlayerActivity.showV757ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v757concurrent
    FeaturePrefsStore.batch751.v757concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v757: condition level
internal fun PlayerActivity.showV757ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v757: configure level
internal fun PlayerActivity.showV757ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v757: confirm level
internal fun PlayerActivity.showV757ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v757: connect level
internal fun PlayerActivity.showV757ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v757: console level
internal fun PlayerActivity.showV757ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757console = value
        AppToast.show(this, "console: $value")
    }
}

// v757: constant mode
internal fun PlayerActivity.showV757ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v757constant
    FeaturePrefsStore.batch751.v757constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v757: constraint mode
internal fun PlayerActivity.showV757ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v757constraint
    FeaturePrefsStore.batch751.v757constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v757: consume mode
internal fun PlayerActivity.showV757ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v757consume
    FeaturePrefsStore.batch751.v757consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v757: content mode
internal fun PlayerActivity.showV757ContentToggle() {
    val current = FeaturePrefsStore.batch751.v757content
    FeaturePrefsStore.batch751.v757content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v757: context mode
internal fun PlayerActivity.showV757ContextToggle() {
    val current = FeaturePrefsStore.batch751.v757context
    FeaturePrefsStore.batch751.v757context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v758: complete mode
internal fun PlayerActivity.showV758CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v758complete
    FeaturePrefsStore.batch751.v758complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v758: compress mode
internal fun PlayerActivity.showV758CompressToggle() {
    val current = FeaturePrefsStore.batch751.v758compress
    FeaturePrefsStore.batch751.v758compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v758: compute mode
internal fun PlayerActivity.showV758ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v758compute
    FeaturePrefsStore.batch751.v758compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v758: concat mode
internal fun PlayerActivity.showV758ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v758concat
    FeaturePrefsStore.batch751.v758concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v758: concurrent mode
internal fun PlayerActivity.showV758ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v758concurrent
    FeaturePrefsStore.batch751.v758concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v758: condition level
internal fun PlayerActivity.showV758ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v758: configure level
internal fun PlayerActivity.showV758ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v758: confirm level
internal fun PlayerActivity.showV758ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v758: connect level
internal fun PlayerActivity.showV758ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v758: console level
internal fun PlayerActivity.showV758ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758console = value
        AppToast.show(this, "console: $value")
    }
}

// v758: constant mode
internal fun PlayerActivity.showV758ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v758constant
    FeaturePrefsStore.batch751.v758constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v758: constraint mode
internal fun PlayerActivity.showV758ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v758constraint
    FeaturePrefsStore.batch751.v758constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v758: consume mode
internal fun PlayerActivity.showV758ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v758consume
    FeaturePrefsStore.batch751.v758consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v758: content mode
internal fun PlayerActivity.showV758ContentToggle() {
    val current = FeaturePrefsStore.batch751.v758content
    FeaturePrefsStore.batch751.v758content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v758: context mode
internal fun PlayerActivity.showV758ContextToggle() {
    val current = FeaturePrefsStore.batch751.v758context
    FeaturePrefsStore.batch751.v758context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v759: complete mode
internal fun PlayerActivity.showV759CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v759complete
    FeaturePrefsStore.batch751.v759complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v759: compress mode
internal fun PlayerActivity.showV759CompressToggle() {
    val current = FeaturePrefsStore.batch751.v759compress
    FeaturePrefsStore.batch751.v759compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v759: compute mode
internal fun PlayerActivity.showV759ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v759compute
    FeaturePrefsStore.batch751.v759compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v759: concat mode
internal fun PlayerActivity.showV759ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v759concat
    FeaturePrefsStore.batch751.v759concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v759: concurrent mode
internal fun PlayerActivity.showV759ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v759concurrent
    FeaturePrefsStore.batch751.v759concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v759: condition level
internal fun PlayerActivity.showV759ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v759: configure level
internal fun PlayerActivity.showV759ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v759: confirm level
internal fun PlayerActivity.showV759ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v759: connect level
internal fun PlayerActivity.showV759ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v759: console level
internal fun PlayerActivity.showV759ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759console = value
        AppToast.show(this, "console: $value")
    }
}

// v759: constant mode
internal fun PlayerActivity.showV759ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v759constant
    FeaturePrefsStore.batch751.v759constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v759: constraint mode
internal fun PlayerActivity.showV759ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v759constraint
    FeaturePrefsStore.batch751.v759constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v759: consume mode
internal fun PlayerActivity.showV759ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v759consume
    FeaturePrefsStore.batch751.v759consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v759: content mode
internal fun PlayerActivity.showV759ContentToggle() {
    val current = FeaturePrefsStore.batch751.v759content
    FeaturePrefsStore.batch751.v759content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v759: context mode
internal fun PlayerActivity.showV759ContextToggle() {
    val current = FeaturePrefsStore.batch751.v759context
    FeaturePrefsStore.batch751.v759context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v760: complete mode
internal fun PlayerActivity.showV760CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v760complete
    FeaturePrefsStore.batch751.v760complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v760: compress mode
internal fun PlayerActivity.showV760CompressToggle() {
    val current = FeaturePrefsStore.batch751.v760compress
    FeaturePrefsStore.batch751.v760compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v760: compute mode
internal fun PlayerActivity.showV760ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v760compute
    FeaturePrefsStore.batch751.v760compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v760: concat mode
internal fun PlayerActivity.showV760ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v760concat
    FeaturePrefsStore.batch751.v760concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v760: concurrent mode
internal fun PlayerActivity.showV760ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v760concurrent
    FeaturePrefsStore.batch751.v760concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v760: condition level
internal fun PlayerActivity.showV760ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v760: configure level
internal fun PlayerActivity.showV760ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v760: confirm level
internal fun PlayerActivity.showV760ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v760: connect level
internal fun PlayerActivity.showV760ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v760: console level
internal fun PlayerActivity.showV760ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760console = value
        AppToast.show(this, "console: $value")
    }
}

// v760: constant mode
internal fun PlayerActivity.showV760ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v760constant
    FeaturePrefsStore.batch751.v760constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v760: constraint mode
internal fun PlayerActivity.showV760ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v760constraint
    FeaturePrefsStore.batch751.v760constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v760: consume mode
internal fun PlayerActivity.showV760ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v760consume
    FeaturePrefsStore.batch751.v760consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v760: content mode
internal fun PlayerActivity.showV760ContentToggle() {
    val current = FeaturePrefsStore.batch751.v760content
    FeaturePrefsStore.batch751.v760content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v760: context mode
internal fun PlayerActivity.showV760ContextToggle() {
    val current = FeaturePrefsStore.batch751.v760context
    FeaturePrefsStore.batch751.v760context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v761: contract mode
internal fun PlayerActivity.showV761ContractToggle() {
    val current = FeaturePrefsStore.batch761.v761contract
    FeaturePrefsStore.batch761.v761contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v761: control mode
internal fun PlayerActivity.showV761ControlToggle() {
    val current = FeaturePrefsStore.batch761.v761control
    FeaturePrefsStore.batch761.v761control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v761: convert mode
internal fun PlayerActivity.showV761ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v761convert
    FeaturePrefsStore.batch761.v761convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v761: coordinate mode
internal fun PlayerActivity.showV761CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v761coordinate
    FeaturePrefsStore.batch761.v761coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v761: copy mode
internal fun PlayerActivity.showV761CopyToggle() {
    val current = FeaturePrefsStore.batch761.v761copy
    FeaturePrefsStore.batch761.v761copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v761: core level
internal fun PlayerActivity.showV761CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761core = value
        AppToast.show(this, "core: $value")
    }
}

// v761: count level
internal fun PlayerActivity.showV761CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761count = value
        AppToast.show(this, "count: $value")
    }
}

// v761: cover level
internal fun PlayerActivity.showV761CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v761: crash level
internal fun PlayerActivity.showV761CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v761: create level
internal fun PlayerActivity.showV761CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v761create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v761create = value
        AppToast.show(this, "create: $value")
    }
}

// v761: crop mode
internal fun PlayerActivity.showV761CropToggle() {
    val current = FeaturePrefsStore.batch761.v761crop
    FeaturePrefsStore.batch761.v761crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v761: cross mode
internal fun PlayerActivity.showV761CrossToggle() {
    val current = FeaturePrefsStore.batch761.v761cross
    FeaturePrefsStore.batch761.v761cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v761: crypto mode
internal fun PlayerActivity.showV761CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v761crypto
    FeaturePrefsStore.batch761.v761crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v761: cursor mode
internal fun PlayerActivity.showV761CursorToggle() {
    val current = FeaturePrefsStore.batch761.v761cursor
    FeaturePrefsStore.batch761.v761cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v761: curve mode
internal fun PlayerActivity.showV761CurveToggle() {
    val current = FeaturePrefsStore.batch761.v761curve
    FeaturePrefsStore.batch761.v761curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v762: contract mode
internal fun PlayerActivity.showV762ContractToggle() {
    val current = FeaturePrefsStore.batch761.v762contract
    FeaturePrefsStore.batch761.v762contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v762: control mode
internal fun PlayerActivity.showV762ControlToggle() {
    val current = FeaturePrefsStore.batch761.v762control
    FeaturePrefsStore.batch761.v762control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v762: convert mode
internal fun PlayerActivity.showV762ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v762convert
    FeaturePrefsStore.batch761.v762convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v762: coordinate mode
internal fun PlayerActivity.showV762CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v762coordinate
    FeaturePrefsStore.batch761.v762coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v762: copy mode
internal fun PlayerActivity.showV762CopyToggle() {
    val current = FeaturePrefsStore.batch761.v762copy
    FeaturePrefsStore.batch761.v762copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v762: core level
internal fun PlayerActivity.showV762CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762core = value
        AppToast.show(this, "core: $value")
    }
}

// v762: count level
internal fun PlayerActivity.showV762CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762count = value
        AppToast.show(this, "count: $value")
    }
}

// v762: cover level
internal fun PlayerActivity.showV762CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v762: crash level
internal fun PlayerActivity.showV762CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v762: create level
internal fun PlayerActivity.showV762CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v762create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v762create = value
        AppToast.show(this, "create: $value")
    }
}

// v762: crop mode
internal fun PlayerActivity.showV762CropToggle() {
    val current = FeaturePrefsStore.batch761.v762crop
    FeaturePrefsStore.batch761.v762crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v762: cross mode
internal fun PlayerActivity.showV762CrossToggle() {
    val current = FeaturePrefsStore.batch761.v762cross
    FeaturePrefsStore.batch761.v762cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v762: crypto mode
internal fun PlayerActivity.showV762CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v762crypto
    FeaturePrefsStore.batch761.v762crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v762: cursor mode
internal fun PlayerActivity.showV762CursorToggle() {
    val current = FeaturePrefsStore.batch761.v762cursor
    FeaturePrefsStore.batch761.v762cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v762: curve mode
internal fun PlayerActivity.showV762CurveToggle() {
    val current = FeaturePrefsStore.batch761.v762curve
    FeaturePrefsStore.batch761.v762curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v763: contract mode
internal fun PlayerActivity.showV763ContractToggle() {
    val current = FeaturePrefsStore.batch761.v763contract
    FeaturePrefsStore.batch761.v763contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v763: control mode
internal fun PlayerActivity.showV763ControlToggle() {
    val current = FeaturePrefsStore.batch761.v763control
    FeaturePrefsStore.batch761.v763control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v763: convert mode
internal fun PlayerActivity.showV763ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v763convert
    FeaturePrefsStore.batch761.v763convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v763: coordinate mode
internal fun PlayerActivity.showV763CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v763coordinate
    FeaturePrefsStore.batch761.v763coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v763: copy mode
internal fun PlayerActivity.showV763CopyToggle() {
    val current = FeaturePrefsStore.batch761.v763copy
    FeaturePrefsStore.batch761.v763copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v763: core level
internal fun PlayerActivity.showV763CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763core = value
        AppToast.show(this, "core: $value")
    }
}

// v763: count level
internal fun PlayerActivity.showV763CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763count = value
        AppToast.show(this, "count: $value")
    }
}

// v763: cover level
internal fun PlayerActivity.showV763CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v763: crash level
internal fun PlayerActivity.showV763CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v763: create level
internal fun PlayerActivity.showV763CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v763create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v763create = value
        AppToast.show(this, "create: $value")
    }
}

// v763: crop mode
internal fun PlayerActivity.showV763CropToggle() {
    val current = FeaturePrefsStore.batch761.v763crop
    FeaturePrefsStore.batch761.v763crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v763: cross mode
internal fun PlayerActivity.showV763CrossToggle() {
    val current = FeaturePrefsStore.batch761.v763cross
    FeaturePrefsStore.batch761.v763cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v763: crypto mode
internal fun PlayerActivity.showV763CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v763crypto
    FeaturePrefsStore.batch761.v763crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v763: cursor mode
internal fun PlayerActivity.showV763CursorToggle() {
    val current = FeaturePrefsStore.batch761.v763cursor
    FeaturePrefsStore.batch761.v763cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v763: curve mode
internal fun PlayerActivity.showV763CurveToggle() {
    val current = FeaturePrefsStore.batch761.v763curve
    FeaturePrefsStore.batch761.v763curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v764: contract mode
internal fun PlayerActivity.showV764ContractToggle() {
    val current = FeaturePrefsStore.batch761.v764contract
    FeaturePrefsStore.batch761.v764contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v764: control mode
internal fun PlayerActivity.showV764ControlToggle() {
    val current = FeaturePrefsStore.batch761.v764control
    FeaturePrefsStore.batch761.v764control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v764: convert mode
internal fun PlayerActivity.showV764ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v764convert
    FeaturePrefsStore.batch761.v764convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v764: coordinate mode
internal fun PlayerActivity.showV764CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v764coordinate
    FeaturePrefsStore.batch761.v764coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v764: copy mode
internal fun PlayerActivity.showV764CopyToggle() {
    val current = FeaturePrefsStore.batch761.v764copy
    FeaturePrefsStore.batch761.v764copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v764: core level
internal fun PlayerActivity.showV764CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764core = value
        AppToast.show(this, "core: $value")
    }
}

// v764: count level
internal fun PlayerActivity.showV764CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764count = value
        AppToast.show(this, "count: $value")
    }
}

// v764: cover level
internal fun PlayerActivity.showV764CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v764: crash level
internal fun PlayerActivity.showV764CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v764: create level
internal fun PlayerActivity.showV764CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v764create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v764create = value
        AppToast.show(this, "create: $value")
    }
}

// v764: crop mode
internal fun PlayerActivity.showV764CropToggle() {
    val current = FeaturePrefsStore.batch761.v764crop
    FeaturePrefsStore.batch761.v764crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v764: cross mode
internal fun PlayerActivity.showV764CrossToggle() {
    val current = FeaturePrefsStore.batch761.v764cross
    FeaturePrefsStore.batch761.v764cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v764: crypto mode
internal fun PlayerActivity.showV764CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v764crypto
    FeaturePrefsStore.batch761.v764crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v764: cursor mode
internal fun PlayerActivity.showV764CursorToggle() {
    val current = FeaturePrefsStore.batch761.v764cursor
    FeaturePrefsStore.batch761.v764cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v764: curve mode
internal fun PlayerActivity.showV764CurveToggle() {
    val current = FeaturePrefsStore.batch761.v764curve
    FeaturePrefsStore.batch761.v764curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v765: contract mode
internal fun PlayerActivity.showV765ContractToggle() {
    val current = FeaturePrefsStore.batch761.v765contract
    FeaturePrefsStore.batch761.v765contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v765: control mode
internal fun PlayerActivity.showV765ControlToggle() {
    val current = FeaturePrefsStore.batch761.v765control
    FeaturePrefsStore.batch761.v765control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v765: convert mode
internal fun PlayerActivity.showV765ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v765convert
    FeaturePrefsStore.batch761.v765convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v765: coordinate mode
internal fun PlayerActivity.showV765CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v765coordinate
    FeaturePrefsStore.batch761.v765coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v765: copy mode
internal fun PlayerActivity.showV765CopyToggle() {
    val current = FeaturePrefsStore.batch761.v765copy
    FeaturePrefsStore.batch761.v765copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v765: core level
internal fun PlayerActivity.showV765CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765core = value
        AppToast.show(this, "core: $value")
    }
}

// v765: count level
internal fun PlayerActivity.showV765CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765count = value
        AppToast.show(this, "count: $value")
    }
}

// v765: cover level
internal fun PlayerActivity.showV765CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v765: crash level
internal fun PlayerActivity.showV765CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v765: create level
internal fun PlayerActivity.showV765CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v765create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v765create = value
        AppToast.show(this, "create: $value")
    }
}

// v765: crop mode
internal fun PlayerActivity.showV765CropToggle() {
    val current = FeaturePrefsStore.batch761.v765crop
    FeaturePrefsStore.batch761.v765crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v765: cross mode
internal fun PlayerActivity.showV765CrossToggle() {
    val current = FeaturePrefsStore.batch761.v765cross
    FeaturePrefsStore.batch761.v765cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v765: crypto mode
internal fun PlayerActivity.showV765CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v765crypto
    FeaturePrefsStore.batch761.v765crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v765: cursor mode
internal fun PlayerActivity.showV765CursorToggle() {
    val current = FeaturePrefsStore.batch761.v765cursor
    FeaturePrefsStore.batch761.v765cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v765: curve mode
internal fun PlayerActivity.showV765CurveToggle() {
    val current = FeaturePrefsStore.batch761.v765curve
    FeaturePrefsStore.batch761.v765curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v766: contract mode
internal fun PlayerActivity.showV766ContractToggle() {
    val current = FeaturePrefsStore.batch761.v766contract
    FeaturePrefsStore.batch761.v766contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v766: control mode
internal fun PlayerActivity.showV766ControlToggle() {
    val current = FeaturePrefsStore.batch761.v766control
    FeaturePrefsStore.batch761.v766control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v766: convert mode
internal fun PlayerActivity.showV766ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v766convert
    FeaturePrefsStore.batch761.v766convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v766: coordinate mode
internal fun PlayerActivity.showV766CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v766coordinate
    FeaturePrefsStore.batch761.v766coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v766: copy mode
internal fun PlayerActivity.showV766CopyToggle() {
    val current = FeaturePrefsStore.batch761.v766copy
    FeaturePrefsStore.batch761.v766copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v766: core level
internal fun PlayerActivity.showV766CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766core = value
        AppToast.show(this, "core: $value")
    }
}

// v766: count level
internal fun PlayerActivity.showV766CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766count = value
        AppToast.show(this, "count: $value")
    }
}

// v766: cover level
internal fun PlayerActivity.showV766CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v766: crash level
internal fun PlayerActivity.showV766CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v766: create level
internal fun PlayerActivity.showV766CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v766create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v766create = value
        AppToast.show(this, "create: $value")
    }
}

// v766: crop mode
internal fun PlayerActivity.showV766CropToggle() {
    val current = FeaturePrefsStore.batch761.v766crop
    FeaturePrefsStore.batch761.v766crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v766: cross mode
internal fun PlayerActivity.showV766CrossToggle() {
    val current = FeaturePrefsStore.batch761.v766cross
    FeaturePrefsStore.batch761.v766cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v766: crypto mode
internal fun PlayerActivity.showV766CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v766crypto
    FeaturePrefsStore.batch761.v766crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v766: cursor mode
internal fun PlayerActivity.showV766CursorToggle() {
    val current = FeaturePrefsStore.batch761.v766cursor
    FeaturePrefsStore.batch761.v766cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v766: curve mode
internal fun PlayerActivity.showV766CurveToggle() {
    val current = FeaturePrefsStore.batch761.v766curve
    FeaturePrefsStore.batch761.v766curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v767: contract mode
internal fun PlayerActivity.showV767ContractToggle() {
    val current = FeaturePrefsStore.batch761.v767contract
    FeaturePrefsStore.batch761.v767contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v767: control mode
internal fun PlayerActivity.showV767ControlToggle() {
    val current = FeaturePrefsStore.batch761.v767control
    FeaturePrefsStore.batch761.v767control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v767: convert mode
internal fun PlayerActivity.showV767ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v767convert
    FeaturePrefsStore.batch761.v767convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v767: coordinate mode
internal fun PlayerActivity.showV767CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v767coordinate
    FeaturePrefsStore.batch761.v767coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v767: copy mode
internal fun PlayerActivity.showV767CopyToggle() {
    val current = FeaturePrefsStore.batch761.v767copy
    FeaturePrefsStore.batch761.v767copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v767: core level
internal fun PlayerActivity.showV767CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767core = value
        AppToast.show(this, "core: $value")
    }
}

// v767: count level
internal fun PlayerActivity.showV767CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767count = value
        AppToast.show(this, "count: $value")
    }
}

// v767: cover level
internal fun PlayerActivity.showV767CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v767: crash level
internal fun PlayerActivity.showV767CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v767: create level
internal fun PlayerActivity.showV767CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v767create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v767create = value
        AppToast.show(this, "create: $value")
    }
}

// v767: crop mode
internal fun PlayerActivity.showV767CropToggle() {
    val current = FeaturePrefsStore.batch761.v767crop
    FeaturePrefsStore.batch761.v767crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v767: cross mode
internal fun PlayerActivity.showV767CrossToggle() {
    val current = FeaturePrefsStore.batch761.v767cross
    FeaturePrefsStore.batch761.v767cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v767: crypto mode
internal fun PlayerActivity.showV767CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v767crypto
    FeaturePrefsStore.batch761.v767crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v767: cursor mode
internal fun PlayerActivity.showV767CursorToggle() {
    val current = FeaturePrefsStore.batch761.v767cursor
    FeaturePrefsStore.batch761.v767cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v767: curve mode
internal fun PlayerActivity.showV767CurveToggle() {
    val current = FeaturePrefsStore.batch761.v767curve
    FeaturePrefsStore.batch761.v767curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v768: contract mode
internal fun PlayerActivity.showV768ContractToggle() {
    val current = FeaturePrefsStore.batch761.v768contract
    FeaturePrefsStore.batch761.v768contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v768: control mode
internal fun PlayerActivity.showV768ControlToggle() {
    val current = FeaturePrefsStore.batch761.v768control
    FeaturePrefsStore.batch761.v768control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v768: convert mode
internal fun PlayerActivity.showV768ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v768convert
    FeaturePrefsStore.batch761.v768convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v768: coordinate mode
internal fun PlayerActivity.showV768CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v768coordinate
    FeaturePrefsStore.batch761.v768coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v768: copy mode
internal fun PlayerActivity.showV768CopyToggle() {
    val current = FeaturePrefsStore.batch761.v768copy
    FeaturePrefsStore.batch761.v768copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v768: core level
internal fun PlayerActivity.showV768CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768core = value
        AppToast.show(this, "core: $value")
    }
}

// v768: count level
internal fun PlayerActivity.showV768CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768count = value
        AppToast.show(this, "count: $value")
    }
}

// v768: cover level
internal fun PlayerActivity.showV768CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v768: crash level
internal fun PlayerActivity.showV768CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v768: create level
internal fun PlayerActivity.showV768CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v768create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v768create = value
        AppToast.show(this, "create: $value")
    }
}

// v768: crop mode
internal fun PlayerActivity.showV768CropToggle() {
    val current = FeaturePrefsStore.batch761.v768crop
    FeaturePrefsStore.batch761.v768crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v768: cross mode
internal fun PlayerActivity.showV768CrossToggle() {
    val current = FeaturePrefsStore.batch761.v768cross
    FeaturePrefsStore.batch761.v768cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v768: crypto mode
internal fun PlayerActivity.showV768CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v768crypto
    FeaturePrefsStore.batch761.v768crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v768: cursor mode
internal fun PlayerActivity.showV768CursorToggle() {
    val current = FeaturePrefsStore.batch761.v768cursor
    FeaturePrefsStore.batch761.v768cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v768: curve mode
internal fun PlayerActivity.showV768CurveToggle() {
    val current = FeaturePrefsStore.batch761.v768curve
    FeaturePrefsStore.batch761.v768curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v769: contract mode
internal fun PlayerActivity.showV769ContractToggle() {
    val current = FeaturePrefsStore.batch761.v769contract
    FeaturePrefsStore.batch761.v769contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v769: control mode
internal fun PlayerActivity.showV769ControlToggle() {
    val current = FeaturePrefsStore.batch761.v769control
    FeaturePrefsStore.batch761.v769control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v769: convert mode
internal fun PlayerActivity.showV769ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v769convert
    FeaturePrefsStore.batch761.v769convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v769: coordinate mode
internal fun PlayerActivity.showV769CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v769coordinate
    FeaturePrefsStore.batch761.v769coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v769: copy mode
internal fun PlayerActivity.showV769CopyToggle() {
    val current = FeaturePrefsStore.batch761.v769copy
    FeaturePrefsStore.batch761.v769copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v769: core level
internal fun PlayerActivity.showV769CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769core = value
        AppToast.show(this, "core: $value")
    }
}

// v769: count level
internal fun PlayerActivity.showV769CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769count = value
        AppToast.show(this, "count: $value")
    }
}

// v769: cover level
internal fun PlayerActivity.showV769CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v769: crash level
internal fun PlayerActivity.showV769CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v769: create level
internal fun PlayerActivity.showV769CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v769create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v769create = value
        AppToast.show(this, "create: $value")
    }
}

// v769: crop mode
internal fun PlayerActivity.showV769CropToggle() {
    val current = FeaturePrefsStore.batch761.v769crop
    FeaturePrefsStore.batch761.v769crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v769: cross mode
internal fun PlayerActivity.showV769CrossToggle() {
    val current = FeaturePrefsStore.batch761.v769cross
    FeaturePrefsStore.batch761.v769cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v769: crypto mode
internal fun PlayerActivity.showV769CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v769crypto
    FeaturePrefsStore.batch761.v769crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v769: cursor mode
internal fun PlayerActivity.showV769CursorToggle() {
    val current = FeaturePrefsStore.batch761.v769cursor
    FeaturePrefsStore.batch761.v769cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v769: curve mode
internal fun PlayerActivity.showV769CurveToggle() {
    val current = FeaturePrefsStore.batch761.v769curve
    FeaturePrefsStore.batch761.v769curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

// v770: contract mode
internal fun PlayerActivity.showV770ContractToggle() {
    val current = FeaturePrefsStore.batch761.v770contract
    FeaturePrefsStore.batch761.v770contract = !current
    AppToast.show(this, "contract: ${if (!current) "ON" else "OFF"}")
}

// v770: control mode
internal fun PlayerActivity.showV770ControlToggle() {
    val current = FeaturePrefsStore.batch761.v770control
    FeaturePrefsStore.batch761.v770control = !current
    AppToast.show(this, "control: ${if (!current) "ON" else "OFF"}")
}

// v770: convert mode
internal fun PlayerActivity.showV770ConvertToggle() {
    val current = FeaturePrefsStore.batch761.v770convert
    FeaturePrefsStore.batch761.v770convert = !current
    AppToast.show(this, "convert: ${if (!current) "ON" else "OFF"}")
}

// v770: coordinate mode
internal fun PlayerActivity.showV770CoordinateToggle() {
    val current = FeaturePrefsStore.batch761.v770coordinate
    FeaturePrefsStore.batch761.v770coordinate = !current
    AppToast.show(this, "coordinate: ${if (!current) "ON" else "OFF"}")
}

// v770: copy mode
internal fun PlayerActivity.showV770CopyToggle() {
    val current = FeaturePrefsStore.batch761.v770copy
    FeaturePrefsStore.batch761.v770copy = !current
    AppToast.show(this, "copy: ${if (!current) "ON" else "OFF"}")
}

// v770: core level
internal fun PlayerActivity.showV770CoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770core).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "core level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770core = value
        AppToast.show(this, "core: $value")
    }
}

// v770: count level
internal fun PlayerActivity.showV770CountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770count).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "count level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770count = value
        AppToast.show(this, "count: $value")
    }
}

// v770: cover level
internal fun PlayerActivity.showV770CoverDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770cover).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cover level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770cover = value
        AppToast.show(this, "cover: $value")
    }
}

// v770: crash level
internal fun PlayerActivity.showV770CrashDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770crash).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crash level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770crash = value
        AppToast.show(this, "crash: $value")
    }
}

// v770: create level
internal fun PlayerActivity.showV770CreateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch761.v770create).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "create level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch761.v770create = value
        AppToast.show(this, "create: $value")
    }
}

// v770: crop mode
internal fun PlayerActivity.showV770CropToggle() {
    val current = FeaturePrefsStore.batch761.v770crop
    FeaturePrefsStore.batch761.v770crop = !current
    AppToast.show(this, "crop: ${if (!current) "ON" else "OFF"}")
}

// v770: cross mode
internal fun PlayerActivity.showV770CrossToggle() {
    val current = FeaturePrefsStore.batch761.v770cross
    FeaturePrefsStore.batch761.v770cross = !current
    AppToast.show(this, "cross: ${if (!current) "ON" else "OFF"}")
}

// v770: crypto mode
internal fun PlayerActivity.showV770CryptoToggle() {
    val current = FeaturePrefsStore.batch761.v770crypto
    FeaturePrefsStore.batch761.v770crypto = !current
    AppToast.show(this, "crypto: ${if (!current) "ON" else "OFF"}")
}

// v770: cursor mode
internal fun PlayerActivity.showV770CursorToggle() {
    val current = FeaturePrefsStore.batch761.v770cursor
    FeaturePrefsStore.batch761.v770cursor = !current
    AppToast.show(this, "cursor: ${if (!current) "ON" else "OFF"}")
}

// v770: curve mode
internal fun PlayerActivity.showV770CurveToggle() {
    val current = FeaturePrefsStore.batch761.v770curve
    FeaturePrefsStore.batch761.v770curve = !current
    AppToast.show(this, "curve: ${if (!current) "ON" else "OFF"}")
}

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
