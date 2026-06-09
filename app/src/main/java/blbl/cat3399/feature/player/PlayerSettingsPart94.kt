package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1121: tick mode
internal fun PlayerActivity.showV1121TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1121tick
    FeaturePrefsStore.batch1121.v1121tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1121: tile mode
internal fun PlayerActivity.showV1121TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1121tile
    FeaturePrefsStore.batch1121.v1121tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1121: time mode
internal fun PlayerActivity.showV1121TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1121time
    FeaturePrefsStore.batch1121.v1121time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1121: timeout mode
internal fun PlayerActivity.showV1121TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1121timeout
    FeaturePrefsStore.batch1121.v1121timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1121: timer mode
internal fun PlayerActivity.showV1121TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1121timer
    FeaturePrefsStore.batch1121.v1121timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1121: tip level
internal fun PlayerActivity.showV1121TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1121: title level
internal fun PlayerActivity.showV1121TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121title = value
        AppToast.show(this, "title: $value")
    }
}

// v1121: toggle level
internal fun PlayerActivity.showV1121ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1121: token level
internal fun PlayerActivity.showV1121TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121token = value
        AppToast.show(this, "token: $value")
    }
}

// v1121: tool level
internal fun PlayerActivity.showV1121ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1121tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1121tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1121: top mode
internal fun PlayerActivity.showV1121TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1121top
    FeaturePrefsStore.batch1121.v1121top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1121: total mode
internal fun PlayerActivity.showV1121TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1121total
    FeaturePrefsStore.batch1121.v1121total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1121: touch mode
internal fun PlayerActivity.showV1121TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1121touch
    FeaturePrefsStore.batch1121.v1121touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1121: trace mode
internal fun PlayerActivity.showV1121TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1121trace
    FeaturePrefsStore.batch1121.v1121trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1121: track mode
internal fun PlayerActivity.showV1121TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1121track
    FeaturePrefsStore.batch1121.v1121track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1122: tick mode
internal fun PlayerActivity.showV1122TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1122tick
    FeaturePrefsStore.batch1121.v1122tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1122: tile mode
internal fun PlayerActivity.showV1122TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1122tile
    FeaturePrefsStore.batch1121.v1122tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1122: time mode
internal fun PlayerActivity.showV1122TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1122time
    FeaturePrefsStore.batch1121.v1122time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1122: timeout mode
internal fun PlayerActivity.showV1122TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1122timeout
    FeaturePrefsStore.batch1121.v1122timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1122: timer mode
internal fun PlayerActivity.showV1122TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1122timer
    FeaturePrefsStore.batch1121.v1122timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1122: tip level
internal fun PlayerActivity.showV1122TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1122: title level
internal fun PlayerActivity.showV1122TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122title = value
        AppToast.show(this, "title: $value")
    }
}

// v1122: toggle level
internal fun PlayerActivity.showV1122ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1122: token level
internal fun PlayerActivity.showV1122TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122token = value
        AppToast.show(this, "token: $value")
    }
}

// v1122: tool level
internal fun PlayerActivity.showV1122ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1122tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1122tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1122: top mode
internal fun PlayerActivity.showV1122TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1122top
    FeaturePrefsStore.batch1121.v1122top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1122: total mode
internal fun PlayerActivity.showV1122TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1122total
    FeaturePrefsStore.batch1121.v1122total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1122: touch mode
internal fun PlayerActivity.showV1122TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1122touch
    FeaturePrefsStore.batch1121.v1122touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1122: trace mode
internal fun PlayerActivity.showV1122TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1122trace
    FeaturePrefsStore.batch1121.v1122trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1122: track mode
internal fun PlayerActivity.showV1122TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1122track
    FeaturePrefsStore.batch1121.v1122track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1123: tick mode
internal fun PlayerActivity.showV1123TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1123tick
    FeaturePrefsStore.batch1121.v1123tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1123: tile mode
internal fun PlayerActivity.showV1123TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1123tile
    FeaturePrefsStore.batch1121.v1123tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1123: time mode
internal fun PlayerActivity.showV1123TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1123time
    FeaturePrefsStore.batch1121.v1123time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1123: timeout mode
internal fun PlayerActivity.showV1123TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1123timeout
    FeaturePrefsStore.batch1121.v1123timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1123: timer mode
internal fun PlayerActivity.showV1123TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1123timer
    FeaturePrefsStore.batch1121.v1123timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1123: tip level
internal fun PlayerActivity.showV1123TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1123: title level
internal fun PlayerActivity.showV1123TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123title = value
        AppToast.show(this, "title: $value")
    }
}

// v1123: toggle level
internal fun PlayerActivity.showV1123ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1123: token level
internal fun PlayerActivity.showV1123TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123token = value
        AppToast.show(this, "token: $value")
    }
}

// v1123: tool level
internal fun PlayerActivity.showV1123ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1123tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1123tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1123: top mode
internal fun PlayerActivity.showV1123TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1123top
    FeaturePrefsStore.batch1121.v1123top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1123: total mode
internal fun PlayerActivity.showV1123TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1123total
    FeaturePrefsStore.batch1121.v1123total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1123: touch mode
internal fun PlayerActivity.showV1123TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1123touch
    FeaturePrefsStore.batch1121.v1123touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1123: trace mode
internal fun PlayerActivity.showV1123TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1123trace
    FeaturePrefsStore.batch1121.v1123trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1123: track mode
internal fun PlayerActivity.showV1123TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1123track
    FeaturePrefsStore.batch1121.v1123track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1124: tick mode
internal fun PlayerActivity.showV1124TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1124tick
    FeaturePrefsStore.batch1121.v1124tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1124: tile mode
internal fun PlayerActivity.showV1124TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1124tile
    FeaturePrefsStore.batch1121.v1124tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1124: time mode
internal fun PlayerActivity.showV1124TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1124time
    FeaturePrefsStore.batch1121.v1124time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1124: timeout mode
internal fun PlayerActivity.showV1124TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1124timeout
    FeaturePrefsStore.batch1121.v1124timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1124: timer mode
internal fun PlayerActivity.showV1124TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1124timer
    FeaturePrefsStore.batch1121.v1124timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1124: tip level
internal fun PlayerActivity.showV1124TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1124: title level
internal fun PlayerActivity.showV1124TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124title = value
        AppToast.show(this, "title: $value")
    }
}

// v1124: toggle level
internal fun PlayerActivity.showV1124ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1124: token level
internal fun PlayerActivity.showV1124TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124token = value
        AppToast.show(this, "token: $value")
    }
}

// v1124: tool level
internal fun PlayerActivity.showV1124ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1124tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1124tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1124: top mode
internal fun PlayerActivity.showV1124TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1124top
    FeaturePrefsStore.batch1121.v1124top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1124: total mode
internal fun PlayerActivity.showV1124TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1124total
    FeaturePrefsStore.batch1121.v1124total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1124: touch mode
internal fun PlayerActivity.showV1124TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1124touch
    FeaturePrefsStore.batch1121.v1124touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1124: trace mode
internal fun PlayerActivity.showV1124TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1124trace
    FeaturePrefsStore.batch1121.v1124trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1124: track mode
internal fun PlayerActivity.showV1124TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1124track
    FeaturePrefsStore.batch1121.v1124track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1125: tick mode
internal fun PlayerActivity.showV1125TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1125tick
    FeaturePrefsStore.batch1121.v1125tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1125: tile mode
internal fun PlayerActivity.showV1125TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1125tile
    FeaturePrefsStore.batch1121.v1125tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1125: time mode
internal fun PlayerActivity.showV1125TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1125time
    FeaturePrefsStore.batch1121.v1125time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1125: timeout mode
internal fun PlayerActivity.showV1125TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1125timeout
    FeaturePrefsStore.batch1121.v1125timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1125: timer mode
internal fun PlayerActivity.showV1125TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1125timer
    FeaturePrefsStore.batch1121.v1125timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1125: tip level
internal fun PlayerActivity.showV1125TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1125: title level
internal fun PlayerActivity.showV1125TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125title = value
        AppToast.show(this, "title: $value")
    }
}

// v1125: toggle level
internal fun PlayerActivity.showV1125ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1125: token level
internal fun PlayerActivity.showV1125TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125token = value
        AppToast.show(this, "token: $value")
    }
}

// v1125: tool level
internal fun PlayerActivity.showV1125ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1125tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1125tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1125: top mode
internal fun PlayerActivity.showV1125TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1125top
    FeaturePrefsStore.batch1121.v1125top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1125: total mode
internal fun PlayerActivity.showV1125TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1125total
    FeaturePrefsStore.batch1121.v1125total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1125: touch mode
internal fun PlayerActivity.showV1125TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1125touch
    FeaturePrefsStore.batch1121.v1125touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1125: trace mode
internal fun PlayerActivity.showV1125TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1125trace
    FeaturePrefsStore.batch1121.v1125trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1125: track mode
internal fun PlayerActivity.showV1125TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1125track
    FeaturePrefsStore.batch1121.v1125track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1126: tick mode
internal fun PlayerActivity.showV1126TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1126tick
    FeaturePrefsStore.batch1121.v1126tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1126: tile mode
internal fun PlayerActivity.showV1126TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1126tile
    FeaturePrefsStore.batch1121.v1126tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1126: time mode
internal fun PlayerActivity.showV1126TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1126time
    FeaturePrefsStore.batch1121.v1126time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1126: timeout mode
internal fun PlayerActivity.showV1126TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1126timeout
    FeaturePrefsStore.batch1121.v1126timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1126: timer mode
internal fun PlayerActivity.showV1126TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1126timer
    FeaturePrefsStore.batch1121.v1126timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1126: tip level
internal fun PlayerActivity.showV1126TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1126: title level
internal fun PlayerActivity.showV1126TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126title = value
        AppToast.show(this, "title: $value")
    }
}

// v1126: toggle level
internal fun PlayerActivity.showV1126ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1126: token level
internal fun PlayerActivity.showV1126TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126token = value
        AppToast.show(this, "token: $value")
    }
}

// v1126: tool level
internal fun PlayerActivity.showV1126ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1126tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1126tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1126: top mode
internal fun PlayerActivity.showV1126TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1126top
    FeaturePrefsStore.batch1121.v1126top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1126: total mode
internal fun PlayerActivity.showV1126TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1126total
    FeaturePrefsStore.batch1121.v1126total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1126: touch mode
internal fun PlayerActivity.showV1126TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1126touch
    FeaturePrefsStore.batch1121.v1126touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1126: trace mode
internal fun PlayerActivity.showV1126TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1126trace
    FeaturePrefsStore.batch1121.v1126trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1126: track mode
internal fun PlayerActivity.showV1126TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1126track
    FeaturePrefsStore.batch1121.v1126track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1127: tick mode
internal fun PlayerActivity.showV1127TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1127tick
    FeaturePrefsStore.batch1121.v1127tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1127: tile mode
internal fun PlayerActivity.showV1127TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1127tile
    FeaturePrefsStore.batch1121.v1127tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1127: time mode
internal fun PlayerActivity.showV1127TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1127time
    FeaturePrefsStore.batch1121.v1127time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1127: timeout mode
internal fun PlayerActivity.showV1127TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1127timeout
    FeaturePrefsStore.batch1121.v1127timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1127: timer mode
internal fun PlayerActivity.showV1127TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1127timer
    FeaturePrefsStore.batch1121.v1127timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1127: tip level
internal fun PlayerActivity.showV1127TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1127: title level
internal fun PlayerActivity.showV1127TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127title = value
        AppToast.show(this, "title: $value")
    }
}

// v1127: toggle level
internal fun PlayerActivity.showV1127ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1127: token level
internal fun PlayerActivity.showV1127TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127token = value
        AppToast.show(this, "token: $value")
    }
}

// v1127: tool level
internal fun PlayerActivity.showV1127ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1127tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1127tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1127: top mode
internal fun PlayerActivity.showV1127TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1127top
    FeaturePrefsStore.batch1121.v1127top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1127: total mode
internal fun PlayerActivity.showV1127TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1127total
    FeaturePrefsStore.batch1121.v1127total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1127: touch mode
internal fun PlayerActivity.showV1127TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1127touch
    FeaturePrefsStore.batch1121.v1127touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1127: trace mode
internal fun PlayerActivity.showV1127TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1127trace
    FeaturePrefsStore.batch1121.v1127trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1127: track mode
internal fun PlayerActivity.showV1127TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1127track
    FeaturePrefsStore.batch1121.v1127track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1128: tick mode
internal fun PlayerActivity.showV1128TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1128tick
    FeaturePrefsStore.batch1121.v1128tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1128: tile mode
internal fun PlayerActivity.showV1128TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1128tile
    FeaturePrefsStore.batch1121.v1128tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1128: time mode
internal fun PlayerActivity.showV1128TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1128time
    FeaturePrefsStore.batch1121.v1128time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1128: timeout mode
internal fun PlayerActivity.showV1128TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1128timeout
    FeaturePrefsStore.batch1121.v1128timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1128: timer mode
internal fun PlayerActivity.showV1128TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1128timer
    FeaturePrefsStore.batch1121.v1128timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1128: tip level
internal fun PlayerActivity.showV1128TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1128: title level
internal fun PlayerActivity.showV1128TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128title = value
        AppToast.show(this, "title: $value")
    }
}

// v1128: toggle level
internal fun PlayerActivity.showV1128ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1128: token level
internal fun PlayerActivity.showV1128TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128token = value
        AppToast.show(this, "token: $value")
    }
}

// v1128: tool level
internal fun PlayerActivity.showV1128ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1128tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1128tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1128: top mode
internal fun PlayerActivity.showV1128TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1128top
    FeaturePrefsStore.batch1121.v1128top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1128: total mode
internal fun PlayerActivity.showV1128TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1128total
    FeaturePrefsStore.batch1121.v1128total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1128: touch mode
internal fun PlayerActivity.showV1128TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1128touch
    FeaturePrefsStore.batch1121.v1128touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1128: trace mode
internal fun PlayerActivity.showV1128TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1128trace
    FeaturePrefsStore.batch1121.v1128trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1128: track mode
internal fun PlayerActivity.showV1128TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1128track
    FeaturePrefsStore.batch1121.v1128track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1129: tick mode
internal fun PlayerActivity.showV1129TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1129tick
    FeaturePrefsStore.batch1121.v1129tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1129: tile mode
internal fun PlayerActivity.showV1129TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1129tile
    FeaturePrefsStore.batch1121.v1129tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1129: time mode
internal fun PlayerActivity.showV1129TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1129time
    FeaturePrefsStore.batch1121.v1129time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1129: timeout mode
internal fun PlayerActivity.showV1129TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1129timeout
    FeaturePrefsStore.batch1121.v1129timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1129: timer mode
internal fun PlayerActivity.showV1129TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1129timer
    FeaturePrefsStore.batch1121.v1129timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1129: tip level
internal fun PlayerActivity.showV1129TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1129: title level
internal fun PlayerActivity.showV1129TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129title = value
        AppToast.show(this, "title: $value")
    }
}

// v1129: toggle level
internal fun PlayerActivity.showV1129ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1129: token level
internal fun PlayerActivity.showV1129TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129token = value
        AppToast.show(this, "token: $value")
    }
}

// v1129: tool level
internal fun PlayerActivity.showV1129ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1129tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1129tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1129: top mode
internal fun PlayerActivity.showV1129TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1129top
    FeaturePrefsStore.batch1121.v1129top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1129: total mode
internal fun PlayerActivity.showV1129TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1129total
    FeaturePrefsStore.batch1121.v1129total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1129: touch mode
internal fun PlayerActivity.showV1129TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1129touch
    FeaturePrefsStore.batch1121.v1129touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1129: trace mode
internal fun PlayerActivity.showV1129TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1129trace
    FeaturePrefsStore.batch1121.v1129trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1129: track mode
internal fun PlayerActivity.showV1129TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1129track
    FeaturePrefsStore.batch1121.v1129track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

// v1130: tick mode
internal fun PlayerActivity.showV1130TickToggle() {
    val current = FeaturePrefsStore.batch1121.v1130tick
    FeaturePrefsStore.batch1121.v1130tick = !current
    AppToast.show(this, "tick: ${if (!current) "ON" else "OFF"}")
}

// v1130: tile mode
internal fun PlayerActivity.showV1130TileToggle() {
    val current = FeaturePrefsStore.batch1121.v1130tile
    FeaturePrefsStore.batch1121.v1130tile = !current
    AppToast.show(this, "tile: ${if (!current) "ON" else "OFF"}")
}

// v1130: time mode
internal fun PlayerActivity.showV1130TimeToggle() {
    val current = FeaturePrefsStore.batch1121.v1130time
    FeaturePrefsStore.batch1121.v1130time = !current
    AppToast.show(this, "time: ${if (!current) "ON" else "OFF"}")
}

// v1130: timeout mode
internal fun PlayerActivity.showV1130TimeoutToggle() {
    val current = FeaturePrefsStore.batch1121.v1130timeout
    FeaturePrefsStore.batch1121.v1130timeout = !current
    AppToast.show(this, "timeout: ${if (!current) "ON" else "OFF"}")
}

// v1130: timer mode
internal fun PlayerActivity.showV1130TimerToggle() {
    val current = FeaturePrefsStore.batch1121.v1130timer
    FeaturePrefsStore.batch1121.v1130timer = !current
    AppToast.show(this, "timer: ${if (!current) "ON" else "OFF"}")
}

// v1130: tip level
internal fun PlayerActivity.showV1130TipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130tip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tip level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130tip = value
        AppToast.show(this, "tip: $value")
    }
}

// v1130: title level
internal fun PlayerActivity.showV1130TitleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130title).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "title level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130title = value
        AppToast.show(this, "title: $value")
    }
}

// v1130: toggle level
internal fun PlayerActivity.showV1130ToggleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130toggle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "toggle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130toggle = value
        AppToast.show(this, "toggle: $value")
    }
}

// v1130: token level
internal fun PlayerActivity.showV1130TokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130token).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "token level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130token = value
        AppToast.show(this, "token: $value")
    }
}

// v1130: tool level
internal fun PlayerActivity.showV1130ToolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1121.v1130tool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1121.v1130tool = value
        AppToast.show(this, "tool: $value")
    }
}

// v1130: top mode
internal fun PlayerActivity.showV1130TopToggle() {
    val current = FeaturePrefsStore.batch1121.v1130top
    FeaturePrefsStore.batch1121.v1130top = !current
    AppToast.show(this, "top: ${if (!current) "ON" else "OFF"}")
}

// v1130: total mode
internal fun PlayerActivity.showV1130TotalToggle() {
    val current = FeaturePrefsStore.batch1121.v1130total
    FeaturePrefsStore.batch1121.v1130total = !current
    AppToast.show(this, "total: ${if (!current) "ON" else "OFF"}")
}

// v1130: touch mode
internal fun PlayerActivity.showV1130TouchToggle() {
    val current = FeaturePrefsStore.batch1121.v1130touch
    FeaturePrefsStore.batch1121.v1130touch = !current
    AppToast.show(this, "touch: ${if (!current) "ON" else "OFF"}")
}

// v1130: trace mode
internal fun PlayerActivity.showV1130TraceToggle() {
    val current = FeaturePrefsStore.batch1121.v1130trace
    FeaturePrefsStore.batch1121.v1130trace = !current
    AppToast.show(this, "trace: ${if (!current) "ON" else "OFF"}")
}

// v1130: track mode
internal fun PlayerActivity.showV1130TrackToggle() {
    val current = FeaturePrefsStore.batch1121.v1130track
    FeaturePrefsStore.batch1121.v1130track = !current
    AppToast.show(this, "track: ${if (!current) "ON" else "OFF"}")
}

