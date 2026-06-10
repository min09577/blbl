package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1011: query mode
internal fun PlayerActivity.showV1011QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1011query
    FeaturePrefsStore.batch1011.v1011query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1011: queue mode
internal fun PlayerActivity.showV1011QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1011queue
    FeaturePrefsStore.batch1011.v1011queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1011: quick mode
internal fun PlayerActivity.showV1011QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1011quick
    FeaturePrefsStore.batch1011.v1011quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1011: quit mode
internal fun PlayerActivity.showV1011QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1011quit
    FeaturePrefsStore.batch1011.v1011quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1011: quote mode
internal fun PlayerActivity.showV1011QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1011quote
    FeaturePrefsStore.batch1011.v1011quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1011: race level
internal fun PlayerActivity.showV1011RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011race = value
        AppToast.show(this, "race: $value")
    }
}

// v1011: random level
internal fun PlayerActivity.showV1011RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011random = value
        AppToast.show(this, "random: $value")
    }
}

// v1011: range level
internal fun PlayerActivity.showV1011RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011range = value
        AppToast.show(this, "range: $value")
    }
}

// v1011: rate level
internal fun PlayerActivity.showV1011RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1011: raw level
internal fun PlayerActivity.showV1011RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1011raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1011raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1011: read mode
internal fun PlayerActivity.showV1011ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1011read
    FeaturePrefsStore.batch1011.v1011read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1011: ready mode
internal fun PlayerActivity.showV1011ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1011ready
    FeaturePrefsStore.batch1011.v1011ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1011: real mode
internal fun PlayerActivity.showV1011RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1011real
    FeaturePrefsStore.batch1011.v1011real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1011: rebuild mode
internal fun PlayerActivity.showV1011RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1011rebuild
    FeaturePrefsStore.batch1011.v1011rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1011: record mode
internal fun PlayerActivity.showV1011RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1011record
    FeaturePrefsStore.batch1011.v1011record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1012: query mode
internal fun PlayerActivity.showV1012QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1012query
    FeaturePrefsStore.batch1011.v1012query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1012: queue mode
internal fun PlayerActivity.showV1012QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1012queue
    FeaturePrefsStore.batch1011.v1012queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1012: quick mode
internal fun PlayerActivity.showV1012QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1012quick
    FeaturePrefsStore.batch1011.v1012quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1012: quit mode
internal fun PlayerActivity.showV1012QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1012quit
    FeaturePrefsStore.batch1011.v1012quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1012: quote mode
internal fun PlayerActivity.showV1012QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1012quote
    FeaturePrefsStore.batch1011.v1012quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1012: race level
internal fun PlayerActivity.showV1012RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012race = value
        AppToast.show(this, "race: $value")
    }
}

// v1012: random level
internal fun PlayerActivity.showV1012RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012random = value
        AppToast.show(this, "random: $value")
    }
}

// v1012: range level
internal fun PlayerActivity.showV1012RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012range = value
        AppToast.show(this, "range: $value")
    }
}

// v1012: rate level
internal fun PlayerActivity.showV1012RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1012: raw level
internal fun PlayerActivity.showV1012RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1012raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1012raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1012: read mode
internal fun PlayerActivity.showV1012ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1012read
    FeaturePrefsStore.batch1011.v1012read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1012: ready mode
internal fun PlayerActivity.showV1012ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1012ready
    FeaturePrefsStore.batch1011.v1012ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1012: real mode
internal fun PlayerActivity.showV1012RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1012real
    FeaturePrefsStore.batch1011.v1012real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1012: rebuild mode
internal fun PlayerActivity.showV1012RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1012rebuild
    FeaturePrefsStore.batch1011.v1012rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1012: record mode
internal fun PlayerActivity.showV1012RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1012record
    FeaturePrefsStore.batch1011.v1012record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1013: query mode
internal fun PlayerActivity.showV1013QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1013query
    FeaturePrefsStore.batch1011.v1013query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1013: queue mode
internal fun PlayerActivity.showV1013QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1013queue
    FeaturePrefsStore.batch1011.v1013queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1013: quick mode
internal fun PlayerActivity.showV1013QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1013quick
    FeaturePrefsStore.batch1011.v1013quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1013: quit mode
internal fun PlayerActivity.showV1013QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1013quit
    FeaturePrefsStore.batch1011.v1013quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1013: quote mode
internal fun PlayerActivity.showV1013QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1013quote
    FeaturePrefsStore.batch1011.v1013quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1013: race level
internal fun PlayerActivity.showV1013RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013race = value
        AppToast.show(this, "race: $value")
    }
}

// v1013: random level
internal fun PlayerActivity.showV1013RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013random = value
        AppToast.show(this, "random: $value")
    }
}

// v1013: range level
internal fun PlayerActivity.showV1013RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013range = value
        AppToast.show(this, "range: $value")
    }
}

// v1013: rate level
internal fun PlayerActivity.showV1013RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1013: raw level
internal fun PlayerActivity.showV1013RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1013raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1013raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1013: read mode
internal fun PlayerActivity.showV1013ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1013read
    FeaturePrefsStore.batch1011.v1013read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1013: ready mode
internal fun PlayerActivity.showV1013ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1013ready
    FeaturePrefsStore.batch1011.v1013ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1013: real mode
internal fun PlayerActivity.showV1013RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1013real
    FeaturePrefsStore.batch1011.v1013real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1013: rebuild mode
internal fun PlayerActivity.showV1013RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1013rebuild
    FeaturePrefsStore.batch1011.v1013rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1013: record mode
internal fun PlayerActivity.showV1013RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1013record
    FeaturePrefsStore.batch1011.v1013record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1014: query mode
internal fun PlayerActivity.showV1014QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1014query
    FeaturePrefsStore.batch1011.v1014query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1014: queue mode
internal fun PlayerActivity.showV1014QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1014queue
    FeaturePrefsStore.batch1011.v1014queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1014: quick mode
internal fun PlayerActivity.showV1014QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1014quick
    FeaturePrefsStore.batch1011.v1014quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1014: quit mode
internal fun PlayerActivity.showV1014QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1014quit
    FeaturePrefsStore.batch1011.v1014quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1014: quote mode
internal fun PlayerActivity.showV1014QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1014quote
    FeaturePrefsStore.batch1011.v1014quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1014: race level
internal fun PlayerActivity.showV1014RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014race = value
        AppToast.show(this, "race: $value")
    }
}

// v1014: random level
internal fun PlayerActivity.showV1014RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014random = value
        AppToast.show(this, "random: $value")
    }
}

// v1014: range level
internal fun PlayerActivity.showV1014RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014range = value
        AppToast.show(this, "range: $value")
    }
}

// v1014: rate level
internal fun PlayerActivity.showV1014RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1014: raw level
internal fun PlayerActivity.showV1014RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1014raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1014raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1014: read mode
internal fun PlayerActivity.showV1014ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1014read
    FeaturePrefsStore.batch1011.v1014read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1014: ready mode
internal fun PlayerActivity.showV1014ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1014ready
    FeaturePrefsStore.batch1011.v1014ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1014: real mode
internal fun PlayerActivity.showV1014RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1014real
    FeaturePrefsStore.batch1011.v1014real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1014: rebuild mode
internal fun PlayerActivity.showV1014RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1014rebuild
    FeaturePrefsStore.batch1011.v1014rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1014: record mode
internal fun PlayerActivity.showV1014RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1014record
    FeaturePrefsStore.batch1011.v1014record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1015: query mode
internal fun PlayerActivity.showV1015QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1015query
    FeaturePrefsStore.batch1011.v1015query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1015: queue mode
internal fun PlayerActivity.showV1015QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1015queue
    FeaturePrefsStore.batch1011.v1015queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1015: quick mode
internal fun PlayerActivity.showV1015QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1015quick
    FeaturePrefsStore.batch1011.v1015quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1015: quit mode
internal fun PlayerActivity.showV1015QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1015quit
    FeaturePrefsStore.batch1011.v1015quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1015: quote mode
internal fun PlayerActivity.showV1015QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1015quote
    FeaturePrefsStore.batch1011.v1015quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1015: race level
internal fun PlayerActivity.showV1015RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015race = value
        AppToast.show(this, "race: $value")
    }
}

// v1015: random level
internal fun PlayerActivity.showV1015RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015random = value
        AppToast.show(this, "random: $value")
    }
}

// v1015: range level
internal fun PlayerActivity.showV1015RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015range = value
        AppToast.show(this, "range: $value")
    }
}

// v1015: rate level
internal fun PlayerActivity.showV1015RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1015: raw level
internal fun PlayerActivity.showV1015RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1015raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1015raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1015: read mode
internal fun PlayerActivity.showV1015ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1015read
    FeaturePrefsStore.batch1011.v1015read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1015: ready mode
internal fun PlayerActivity.showV1015ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1015ready
    FeaturePrefsStore.batch1011.v1015ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1015: real mode
internal fun PlayerActivity.showV1015RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1015real
    FeaturePrefsStore.batch1011.v1015real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1015: rebuild mode
internal fun PlayerActivity.showV1015RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1015rebuild
    FeaturePrefsStore.batch1011.v1015rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1015: record mode
internal fun PlayerActivity.showV1015RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1015record
    FeaturePrefsStore.batch1011.v1015record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1016: query mode
internal fun PlayerActivity.showV1016QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1016query
    FeaturePrefsStore.batch1011.v1016query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1016: queue mode
internal fun PlayerActivity.showV1016QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1016queue
    FeaturePrefsStore.batch1011.v1016queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1016: quick mode
internal fun PlayerActivity.showV1016QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1016quick
    FeaturePrefsStore.batch1011.v1016quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1016: quit mode
internal fun PlayerActivity.showV1016QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1016quit
    FeaturePrefsStore.batch1011.v1016quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1016: quote mode
internal fun PlayerActivity.showV1016QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1016quote
    FeaturePrefsStore.batch1011.v1016quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1016: race level
internal fun PlayerActivity.showV1016RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016race = value
        AppToast.show(this, "race: $value")
    }
}

// v1016: random level
internal fun PlayerActivity.showV1016RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016random = value
        AppToast.show(this, "random: $value")
    }
}

// v1016: range level
internal fun PlayerActivity.showV1016RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016range = value
        AppToast.show(this, "range: $value")
    }
}

// v1016: rate level
internal fun PlayerActivity.showV1016RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1016: raw level
internal fun PlayerActivity.showV1016RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1016raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1016raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1016: read mode
internal fun PlayerActivity.showV1016ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1016read
    FeaturePrefsStore.batch1011.v1016read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1016: ready mode
internal fun PlayerActivity.showV1016ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1016ready
    FeaturePrefsStore.batch1011.v1016ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1016: real mode
internal fun PlayerActivity.showV1016RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1016real
    FeaturePrefsStore.batch1011.v1016real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1016: rebuild mode
internal fun PlayerActivity.showV1016RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1016rebuild
    FeaturePrefsStore.batch1011.v1016rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1016: record mode
internal fun PlayerActivity.showV1016RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1016record
    FeaturePrefsStore.batch1011.v1016record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1017: query mode
internal fun PlayerActivity.showV1017QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1017query
    FeaturePrefsStore.batch1011.v1017query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1017: queue mode
internal fun PlayerActivity.showV1017QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1017queue
    FeaturePrefsStore.batch1011.v1017queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1017: quick mode
internal fun PlayerActivity.showV1017QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1017quick
    FeaturePrefsStore.batch1011.v1017quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1017: quit mode
internal fun PlayerActivity.showV1017QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1017quit
    FeaturePrefsStore.batch1011.v1017quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1017: quote mode
internal fun PlayerActivity.showV1017QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1017quote
    FeaturePrefsStore.batch1011.v1017quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1017: race level
internal fun PlayerActivity.showV1017RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017race = value
        AppToast.show(this, "race: $value")
    }
}

// v1017: random level
internal fun PlayerActivity.showV1017RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017random = value
        AppToast.show(this, "random: $value")
    }
}

// v1017: range level
internal fun PlayerActivity.showV1017RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017range = value
        AppToast.show(this, "range: $value")
    }
}

// v1017: rate level
internal fun PlayerActivity.showV1017RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1017: raw level
internal fun PlayerActivity.showV1017RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1017raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1017raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1017: read mode
internal fun PlayerActivity.showV1017ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1017read
    FeaturePrefsStore.batch1011.v1017read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1017: ready mode
internal fun PlayerActivity.showV1017ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1017ready
    FeaturePrefsStore.batch1011.v1017ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1017: real mode
internal fun PlayerActivity.showV1017RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1017real
    FeaturePrefsStore.batch1011.v1017real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1017: rebuild mode
internal fun PlayerActivity.showV1017RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1017rebuild
    FeaturePrefsStore.batch1011.v1017rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1017: record mode
internal fun PlayerActivity.showV1017RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1017record
    FeaturePrefsStore.batch1011.v1017record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1018: query mode
internal fun PlayerActivity.showV1018QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1018query
    FeaturePrefsStore.batch1011.v1018query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1018: queue mode
internal fun PlayerActivity.showV1018QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1018queue
    FeaturePrefsStore.batch1011.v1018queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1018: quick mode
internal fun PlayerActivity.showV1018QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1018quick
    FeaturePrefsStore.batch1011.v1018quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1018: quit mode
internal fun PlayerActivity.showV1018QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1018quit
    FeaturePrefsStore.batch1011.v1018quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1018: quote mode
internal fun PlayerActivity.showV1018QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1018quote
    FeaturePrefsStore.batch1011.v1018quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1018: race level
internal fun PlayerActivity.showV1018RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018race = value
        AppToast.show(this, "race: $value")
    }
}

// v1018: random level
internal fun PlayerActivity.showV1018RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018random = value
        AppToast.show(this, "random: $value")
    }
}

// v1018: range level
internal fun PlayerActivity.showV1018RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018range = value
        AppToast.show(this, "range: $value")
    }
}

// v1018: rate level
internal fun PlayerActivity.showV1018RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1018: raw level
internal fun PlayerActivity.showV1018RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1018raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1018raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1018: read mode
internal fun PlayerActivity.showV1018ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1018read
    FeaturePrefsStore.batch1011.v1018read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1018: ready mode
internal fun PlayerActivity.showV1018ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1018ready
    FeaturePrefsStore.batch1011.v1018ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1018: real mode
internal fun PlayerActivity.showV1018RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1018real
    FeaturePrefsStore.batch1011.v1018real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1018: rebuild mode
internal fun PlayerActivity.showV1018RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1018rebuild
    FeaturePrefsStore.batch1011.v1018rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1018: record mode
internal fun PlayerActivity.showV1018RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1018record
    FeaturePrefsStore.batch1011.v1018record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1019: query mode
internal fun PlayerActivity.showV1019QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1019query
    FeaturePrefsStore.batch1011.v1019query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1019: queue mode
internal fun PlayerActivity.showV1019QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1019queue
    FeaturePrefsStore.batch1011.v1019queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1019: quick mode
internal fun PlayerActivity.showV1019QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1019quick
    FeaturePrefsStore.batch1011.v1019quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1019: quit mode
internal fun PlayerActivity.showV1019QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1019quit
    FeaturePrefsStore.batch1011.v1019quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1019: quote mode
internal fun PlayerActivity.showV1019QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1019quote
    FeaturePrefsStore.batch1011.v1019quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1019: race level
internal fun PlayerActivity.showV1019RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019race = value
        AppToast.show(this, "race: $value")
    }
}

// v1019: random level
internal fun PlayerActivity.showV1019RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019random = value
        AppToast.show(this, "random: $value")
    }
}

// v1019: range level
internal fun PlayerActivity.showV1019RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019range = value
        AppToast.show(this, "range: $value")
    }
}

// v1019: rate level
internal fun PlayerActivity.showV1019RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1019: raw level
internal fun PlayerActivity.showV1019RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1019raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1019raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1019: read mode
internal fun PlayerActivity.showV1019ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1019read
    FeaturePrefsStore.batch1011.v1019read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1019: ready mode
internal fun PlayerActivity.showV1019ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1019ready
    FeaturePrefsStore.batch1011.v1019ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1019: real mode
internal fun PlayerActivity.showV1019RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1019real
    FeaturePrefsStore.batch1011.v1019real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1019: rebuild mode
internal fun PlayerActivity.showV1019RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1019rebuild
    FeaturePrefsStore.batch1011.v1019rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1019: record mode
internal fun PlayerActivity.showV1019RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1019record
    FeaturePrefsStore.batch1011.v1019record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

// v1020: query mode
internal fun PlayerActivity.showV1020QueryToggle() {
    val current = FeaturePrefsStore.batch1011.v1020query
    FeaturePrefsStore.batch1011.v1020query = !current
    AppToast.show(this, "query: ${if (!current) "ON" else "OFF"}")
}

// v1020: queue mode
internal fun PlayerActivity.showV1020QueueToggle() {
    val current = FeaturePrefsStore.batch1011.v1020queue
    FeaturePrefsStore.batch1011.v1020queue = !current
    AppToast.show(this, "queue: ${if (!current) "ON" else "OFF"}")
}

// v1020: quick mode
internal fun PlayerActivity.showV1020QuickToggle() {
    val current = FeaturePrefsStore.batch1011.v1020quick
    FeaturePrefsStore.batch1011.v1020quick = !current
    AppToast.show(this, "quick: ${if (!current) "ON" else "OFF"}")
}

// v1020: quit mode
internal fun PlayerActivity.showV1020QuitToggle() {
    val current = FeaturePrefsStore.batch1011.v1020quit
    FeaturePrefsStore.batch1011.v1020quit = !current
    AppToast.show(this, "quit: ${if (!current) "ON" else "OFF"}")
}

// v1020: quote mode
internal fun PlayerActivity.showV1020QuoteToggle() {
    val current = FeaturePrefsStore.batch1011.v1020quote
    FeaturePrefsStore.batch1011.v1020quote = !current
    AppToast.show(this, "quote: ${if (!current) "ON" else "OFF"}")
}

// v1020: race level
internal fun PlayerActivity.showV1020RaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020race).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "race level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020race = value
        AppToast.show(this, "race: $value")
    }
}

// v1020: random level
internal fun PlayerActivity.showV1020RandomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020random).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "random level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020random = value
        AppToast.show(this, "random: $value")
    }
}

// v1020: range level
internal fun PlayerActivity.showV1020RangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020range).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "range level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020range = value
        AppToast.show(this, "range: $value")
    }
}

// v1020: rate level
internal fun PlayerActivity.showV1020RateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020rate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020rate = value
        AppToast.show(this, "rate: $value")
    }
}

// v1020: raw level
internal fun PlayerActivity.showV1020RawDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1011.v1020raw).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "raw level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1011.v1020raw = value
        AppToast.show(this, "raw: $value")
    }
}

// v1020: read mode
internal fun PlayerActivity.showV1020ReadToggle() {
    val current = FeaturePrefsStore.batch1011.v1020read
    FeaturePrefsStore.batch1011.v1020read = !current
    AppToast.show(this, "read: ${if (!current) "ON" else "OFF"}")
}

// v1020: ready mode
internal fun PlayerActivity.showV1020ReadyToggle() {
    val current = FeaturePrefsStore.batch1011.v1020ready
    FeaturePrefsStore.batch1011.v1020ready = !current
    AppToast.show(this, "ready: ${if (!current) "ON" else "OFF"}")
}

// v1020: real mode
internal fun PlayerActivity.showV1020RealToggle() {
    val current = FeaturePrefsStore.batch1011.v1020real
    FeaturePrefsStore.batch1011.v1020real = !current
    AppToast.show(this, "real: ${if (!current) "ON" else "OFF"}")
}

// v1020: rebuild mode
internal fun PlayerActivity.showV1020RebuildToggle() {
    val current = FeaturePrefsStore.batch1011.v1020rebuild
    FeaturePrefsStore.batch1011.v1020rebuild = !current
    AppToast.show(this, "rebuild: ${if (!current) "ON" else "OFF"}")
}

// v1020: record mode
internal fun PlayerActivity.showV1020RecordToggle() {
    val current = FeaturePrefsStore.batch1011.v1020record
    FeaturePrefsStore.batch1011.v1020record = !current
    AppToast.show(this, "record: ${if (!current) "ON" else "OFF"}")
}

