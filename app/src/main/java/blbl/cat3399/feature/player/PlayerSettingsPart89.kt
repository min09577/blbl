package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1071: short mode
internal fun PlayerActivity.showV1071ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1071short
    FeaturePrefsStore.batch1071.v1071short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1071: show mode
internal fun PlayerActivity.showV1071ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1071show
    FeaturePrefsStore.batch1071.v1071show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1071: shrink mode
internal fun PlayerActivity.showV1071ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1071shrink
    FeaturePrefsStore.batch1071.v1071shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1071: side mode
internal fun PlayerActivity.showV1071SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1071side
    FeaturePrefsStore.batch1071.v1071side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1071: sign mode
internal fun PlayerActivity.showV1071SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1071sign
    FeaturePrefsStore.batch1071.v1071sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1071: signal level
internal fun PlayerActivity.showV1071SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1071: silence level
internal fun PlayerActivity.showV1071SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1071: simple level
internal fun PlayerActivity.showV1071SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1071: single level
internal fun PlayerActivity.showV1071SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071single = value
        AppToast.show(this, "single: $value")
    }
}

// v1071: site level
internal fun PlayerActivity.showV1071SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1071site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1071site = value
        AppToast.show(this, "site: $value")
    }
}

// v1071: size mode
internal fun PlayerActivity.showV1071SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1071size
    FeaturePrefsStore.batch1071.v1071size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1071: skip mode
internal fun PlayerActivity.showV1071SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1071skip
    FeaturePrefsStore.batch1071.v1071skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1071: sleep mode
internal fun PlayerActivity.showV1071SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1071sleep
    FeaturePrefsStore.batch1071.v1071sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1071: slice mode
internal fun PlayerActivity.showV1071SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1071slice
    FeaturePrefsStore.batch1071.v1071slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1071: slide mode
internal fun PlayerActivity.showV1071SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1071slide
    FeaturePrefsStore.batch1071.v1071slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1072: short mode
internal fun PlayerActivity.showV1072ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1072short
    FeaturePrefsStore.batch1071.v1072short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1072: show mode
internal fun PlayerActivity.showV1072ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1072show
    FeaturePrefsStore.batch1071.v1072show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1072: shrink mode
internal fun PlayerActivity.showV1072ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1072shrink
    FeaturePrefsStore.batch1071.v1072shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1072: side mode
internal fun PlayerActivity.showV1072SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1072side
    FeaturePrefsStore.batch1071.v1072side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1072: sign mode
internal fun PlayerActivity.showV1072SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1072sign
    FeaturePrefsStore.batch1071.v1072sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1072: signal level
internal fun PlayerActivity.showV1072SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1072: silence level
internal fun PlayerActivity.showV1072SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1072: simple level
internal fun PlayerActivity.showV1072SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1072: single level
internal fun PlayerActivity.showV1072SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072single = value
        AppToast.show(this, "single: $value")
    }
}

// v1072: site level
internal fun PlayerActivity.showV1072SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1072site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1072site = value
        AppToast.show(this, "site: $value")
    }
}

// v1072: size mode
internal fun PlayerActivity.showV1072SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1072size
    FeaturePrefsStore.batch1071.v1072size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1072: skip mode
internal fun PlayerActivity.showV1072SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1072skip
    FeaturePrefsStore.batch1071.v1072skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1072: sleep mode
internal fun PlayerActivity.showV1072SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1072sleep
    FeaturePrefsStore.batch1071.v1072sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1072: slice mode
internal fun PlayerActivity.showV1072SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1072slice
    FeaturePrefsStore.batch1071.v1072slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1072: slide mode
internal fun PlayerActivity.showV1072SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1072slide
    FeaturePrefsStore.batch1071.v1072slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1073: short mode
internal fun PlayerActivity.showV1073ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1073short
    FeaturePrefsStore.batch1071.v1073short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1073: show mode
internal fun PlayerActivity.showV1073ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1073show
    FeaturePrefsStore.batch1071.v1073show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1073: shrink mode
internal fun PlayerActivity.showV1073ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1073shrink
    FeaturePrefsStore.batch1071.v1073shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1073: side mode
internal fun PlayerActivity.showV1073SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1073side
    FeaturePrefsStore.batch1071.v1073side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1073: sign mode
internal fun PlayerActivity.showV1073SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1073sign
    FeaturePrefsStore.batch1071.v1073sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1073: signal level
internal fun PlayerActivity.showV1073SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1073: silence level
internal fun PlayerActivity.showV1073SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1073: simple level
internal fun PlayerActivity.showV1073SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1073: single level
internal fun PlayerActivity.showV1073SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073single = value
        AppToast.show(this, "single: $value")
    }
}

// v1073: site level
internal fun PlayerActivity.showV1073SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1073site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1073site = value
        AppToast.show(this, "site: $value")
    }
}

// v1073: size mode
internal fun PlayerActivity.showV1073SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1073size
    FeaturePrefsStore.batch1071.v1073size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1073: skip mode
internal fun PlayerActivity.showV1073SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1073skip
    FeaturePrefsStore.batch1071.v1073skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1073: sleep mode
internal fun PlayerActivity.showV1073SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1073sleep
    FeaturePrefsStore.batch1071.v1073sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1073: slice mode
internal fun PlayerActivity.showV1073SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1073slice
    FeaturePrefsStore.batch1071.v1073slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1073: slide mode
internal fun PlayerActivity.showV1073SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1073slide
    FeaturePrefsStore.batch1071.v1073slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1074: short mode
internal fun PlayerActivity.showV1074ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1074short
    FeaturePrefsStore.batch1071.v1074short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1074: show mode
internal fun PlayerActivity.showV1074ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1074show
    FeaturePrefsStore.batch1071.v1074show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1074: shrink mode
internal fun PlayerActivity.showV1074ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1074shrink
    FeaturePrefsStore.batch1071.v1074shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1074: side mode
internal fun PlayerActivity.showV1074SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1074side
    FeaturePrefsStore.batch1071.v1074side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1074: sign mode
internal fun PlayerActivity.showV1074SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1074sign
    FeaturePrefsStore.batch1071.v1074sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1074: signal level
internal fun PlayerActivity.showV1074SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1074: silence level
internal fun PlayerActivity.showV1074SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1074: simple level
internal fun PlayerActivity.showV1074SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1074: single level
internal fun PlayerActivity.showV1074SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074single = value
        AppToast.show(this, "single: $value")
    }
}

// v1074: site level
internal fun PlayerActivity.showV1074SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1074site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1074site = value
        AppToast.show(this, "site: $value")
    }
}

// v1074: size mode
internal fun PlayerActivity.showV1074SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1074size
    FeaturePrefsStore.batch1071.v1074size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1074: skip mode
internal fun PlayerActivity.showV1074SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1074skip
    FeaturePrefsStore.batch1071.v1074skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1074: sleep mode
internal fun PlayerActivity.showV1074SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1074sleep
    FeaturePrefsStore.batch1071.v1074sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1074: slice mode
internal fun PlayerActivity.showV1074SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1074slice
    FeaturePrefsStore.batch1071.v1074slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1074: slide mode
internal fun PlayerActivity.showV1074SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1074slide
    FeaturePrefsStore.batch1071.v1074slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1075: short mode
internal fun PlayerActivity.showV1075ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1075short
    FeaturePrefsStore.batch1071.v1075short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1075: show mode
internal fun PlayerActivity.showV1075ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1075show
    FeaturePrefsStore.batch1071.v1075show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1075: shrink mode
internal fun PlayerActivity.showV1075ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1075shrink
    FeaturePrefsStore.batch1071.v1075shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1075: side mode
internal fun PlayerActivity.showV1075SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1075side
    FeaturePrefsStore.batch1071.v1075side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1075: sign mode
internal fun PlayerActivity.showV1075SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1075sign
    FeaturePrefsStore.batch1071.v1075sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1075: signal level
internal fun PlayerActivity.showV1075SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1075: silence level
internal fun PlayerActivity.showV1075SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1075: simple level
internal fun PlayerActivity.showV1075SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1075: single level
internal fun PlayerActivity.showV1075SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075single = value
        AppToast.show(this, "single: $value")
    }
}

// v1075: site level
internal fun PlayerActivity.showV1075SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1075site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1075site = value
        AppToast.show(this, "site: $value")
    }
}

// v1075: size mode
internal fun PlayerActivity.showV1075SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1075size
    FeaturePrefsStore.batch1071.v1075size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1075: skip mode
internal fun PlayerActivity.showV1075SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1075skip
    FeaturePrefsStore.batch1071.v1075skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1075: sleep mode
internal fun PlayerActivity.showV1075SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1075sleep
    FeaturePrefsStore.batch1071.v1075sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1075: slice mode
internal fun PlayerActivity.showV1075SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1075slice
    FeaturePrefsStore.batch1071.v1075slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1075: slide mode
internal fun PlayerActivity.showV1075SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1075slide
    FeaturePrefsStore.batch1071.v1075slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1076: short mode
internal fun PlayerActivity.showV1076ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1076short
    FeaturePrefsStore.batch1071.v1076short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1076: show mode
internal fun PlayerActivity.showV1076ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1076show
    FeaturePrefsStore.batch1071.v1076show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1076: shrink mode
internal fun PlayerActivity.showV1076ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1076shrink
    FeaturePrefsStore.batch1071.v1076shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1076: side mode
internal fun PlayerActivity.showV1076SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1076side
    FeaturePrefsStore.batch1071.v1076side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1076: sign mode
internal fun PlayerActivity.showV1076SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1076sign
    FeaturePrefsStore.batch1071.v1076sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1076: signal level
internal fun PlayerActivity.showV1076SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1076: silence level
internal fun PlayerActivity.showV1076SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1076: simple level
internal fun PlayerActivity.showV1076SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1076: single level
internal fun PlayerActivity.showV1076SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076single = value
        AppToast.show(this, "single: $value")
    }
}

// v1076: site level
internal fun PlayerActivity.showV1076SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1076site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1076site = value
        AppToast.show(this, "site: $value")
    }
}

// v1076: size mode
internal fun PlayerActivity.showV1076SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1076size
    FeaturePrefsStore.batch1071.v1076size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1076: skip mode
internal fun PlayerActivity.showV1076SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1076skip
    FeaturePrefsStore.batch1071.v1076skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1076: sleep mode
internal fun PlayerActivity.showV1076SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1076sleep
    FeaturePrefsStore.batch1071.v1076sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1076: slice mode
internal fun PlayerActivity.showV1076SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1076slice
    FeaturePrefsStore.batch1071.v1076slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1076: slide mode
internal fun PlayerActivity.showV1076SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1076slide
    FeaturePrefsStore.batch1071.v1076slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1077: short mode
internal fun PlayerActivity.showV1077ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1077short
    FeaturePrefsStore.batch1071.v1077short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1077: show mode
internal fun PlayerActivity.showV1077ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1077show
    FeaturePrefsStore.batch1071.v1077show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1077: shrink mode
internal fun PlayerActivity.showV1077ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1077shrink
    FeaturePrefsStore.batch1071.v1077shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1077: side mode
internal fun PlayerActivity.showV1077SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1077side
    FeaturePrefsStore.batch1071.v1077side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1077: sign mode
internal fun PlayerActivity.showV1077SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1077sign
    FeaturePrefsStore.batch1071.v1077sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1077: signal level
internal fun PlayerActivity.showV1077SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1077: silence level
internal fun PlayerActivity.showV1077SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1077: simple level
internal fun PlayerActivity.showV1077SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1077: single level
internal fun PlayerActivity.showV1077SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077single = value
        AppToast.show(this, "single: $value")
    }
}

// v1077: site level
internal fun PlayerActivity.showV1077SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1077site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1077site = value
        AppToast.show(this, "site: $value")
    }
}

// v1077: size mode
internal fun PlayerActivity.showV1077SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1077size
    FeaturePrefsStore.batch1071.v1077size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1077: skip mode
internal fun PlayerActivity.showV1077SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1077skip
    FeaturePrefsStore.batch1071.v1077skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1077: sleep mode
internal fun PlayerActivity.showV1077SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1077sleep
    FeaturePrefsStore.batch1071.v1077sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1077: slice mode
internal fun PlayerActivity.showV1077SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1077slice
    FeaturePrefsStore.batch1071.v1077slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1077: slide mode
internal fun PlayerActivity.showV1077SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1077slide
    FeaturePrefsStore.batch1071.v1077slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1078: short mode
internal fun PlayerActivity.showV1078ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1078short
    FeaturePrefsStore.batch1071.v1078short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1078: show mode
internal fun PlayerActivity.showV1078ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1078show
    FeaturePrefsStore.batch1071.v1078show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1078: shrink mode
internal fun PlayerActivity.showV1078ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1078shrink
    FeaturePrefsStore.batch1071.v1078shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1078: side mode
internal fun PlayerActivity.showV1078SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1078side
    FeaturePrefsStore.batch1071.v1078side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1078: sign mode
internal fun PlayerActivity.showV1078SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1078sign
    FeaturePrefsStore.batch1071.v1078sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1078: signal level
internal fun PlayerActivity.showV1078SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1078: silence level
internal fun PlayerActivity.showV1078SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1078: simple level
internal fun PlayerActivity.showV1078SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1078: single level
internal fun PlayerActivity.showV1078SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078single = value
        AppToast.show(this, "single: $value")
    }
}

// v1078: site level
internal fun PlayerActivity.showV1078SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1078site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1078site = value
        AppToast.show(this, "site: $value")
    }
}

// v1078: size mode
internal fun PlayerActivity.showV1078SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1078size
    FeaturePrefsStore.batch1071.v1078size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1078: skip mode
internal fun PlayerActivity.showV1078SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1078skip
    FeaturePrefsStore.batch1071.v1078skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1078: sleep mode
internal fun PlayerActivity.showV1078SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1078sleep
    FeaturePrefsStore.batch1071.v1078sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1078: slice mode
internal fun PlayerActivity.showV1078SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1078slice
    FeaturePrefsStore.batch1071.v1078slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1078: slide mode
internal fun PlayerActivity.showV1078SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1078slide
    FeaturePrefsStore.batch1071.v1078slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1079: short mode
internal fun PlayerActivity.showV1079ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1079short
    FeaturePrefsStore.batch1071.v1079short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1079: show mode
internal fun PlayerActivity.showV1079ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1079show
    FeaturePrefsStore.batch1071.v1079show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1079: shrink mode
internal fun PlayerActivity.showV1079ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1079shrink
    FeaturePrefsStore.batch1071.v1079shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1079: side mode
internal fun PlayerActivity.showV1079SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1079side
    FeaturePrefsStore.batch1071.v1079side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1079: sign mode
internal fun PlayerActivity.showV1079SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1079sign
    FeaturePrefsStore.batch1071.v1079sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1079: signal level
internal fun PlayerActivity.showV1079SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1079: silence level
internal fun PlayerActivity.showV1079SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1079: simple level
internal fun PlayerActivity.showV1079SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1079: single level
internal fun PlayerActivity.showV1079SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079single = value
        AppToast.show(this, "single: $value")
    }
}

// v1079: site level
internal fun PlayerActivity.showV1079SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1079site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1079site = value
        AppToast.show(this, "site: $value")
    }
}

// v1079: size mode
internal fun PlayerActivity.showV1079SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1079size
    FeaturePrefsStore.batch1071.v1079size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1079: skip mode
internal fun PlayerActivity.showV1079SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1079skip
    FeaturePrefsStore.batch1071.v1079skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1079: sleep mode
internal fun PlayerActivity.showV1079SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1079sleep
    FeaturePrefsStore.batch1071.v1079sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1079: slice mode
internal fun PlayerActivity.showV1079SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1079slice
    FeaturePrefsStore.batch1071.v1079slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1079: slide mode
internal fun PlayerActivity.showV1079SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1079slide
    FeaturePrefsStore.batch1071.v1079slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

// v1080: short mode
internal fun PlayerActivity.showV1080ShortToggle() {
    val current = FeaturePrefsStore.batch1071.v1080short
    FeaturePrefsStore.batch1071.v1080short = !current
    AppToast.show(this, "short: ${if (!current) "ON" else "OFF"}")
}

// v1080: show mode
internal fun PlayerActivity.showV1080ShowToggle() {
    val current = FeaturePrefsStore.batch1071.v1080show
    FeaturePrefsStore.batch1071.v1080show = !current
    AppToast.show(this, "show: ${if (!current) "ON" else "OFF"}")
}

// v1080: shrink mode
internal fun PlayerActivity.showV1080ShrinkToggle() {
    val current = FeaturePrefsStore.batch1071.v1080shrink
    FeaturePrefsStore.batch1071.v1080shrink = !current
    AppToast.show(this, "shrink: ${if (!current) "ON" else "OFF"}")
}

// v1080: side mode
internal fun PlayerActivity.showV1080SideToggle() {
    val current = FeaturePrefsStore.batch1071.v1080side
    FeaturePrefsStore.batch1071.v1080side = !current
    AppToast.show(this, "side: ${if (!current) "ON" else "OFF"}")
}

// v1080: sign mode
internal fun PlayerActivity.showV1080SignToggle() {
    val current = FeaturePrefsStore.batch1071.v1080sign
    FeaturePrefsStore.batch1071.v1080sign = !current
    AppToast.show(this, "sign: ${if (!current) "ON" else "OFF"}")
}

// v1080: signal level
internal fun PlayerActivity.showV1080SignalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080signal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "signal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080signal = value
        AppToast.show(this, "signal: $value")
    }
}

// v1080: silence level
internal fun PlayerActivity.showV1080SilenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080silence).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "silence level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080silence = value
        AppToast.show(this, "silence: $value")
    }
}

// v1080: simple level
internal fun PlayerActivity.showV1080SimpleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080simple).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "simple level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080simple = value
        AppToast.show(this, "simple: $value")
    }
}

// v1080: single level
internal fun PlayerActivity.showV1080SingleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080single).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "single level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080single = value
        AppToast.show(this, "single: $value")
    }
}

// v1080: site level
internal fun PlayerActivity.showV1080SiteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1071.v1080site).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "site level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1071.v1080site = value
        AppToast.show(this, "site: $value")
    }
}

// v1080: size mode
internal fun PlayerActivity.showV1080SizeToggle() {
    val current = FeaturePrefsStore.batch1071.v1080size
    FeaturePrefsStore.batch1071.v1080size = !current
    AppToast.show(this, "size: ${if (!current) "ON" else "OFF"}")
}

// v1080: skip mode
internal fun PlayerActivity.showV1080SkipToggle() {
    val current = FeaturePrefsStore.batch1071.v1080skip
    FeaturePrefsStore.batch1071.v1080skip = !current
    AppToast.show(this, "skip: ${if (!current) "ON" else "OFF"}")
}

// v1080: sleep mode
internal fun PlayerActivity.showV1080SleepToggle() {
    val current = FeaturePrefsStore.batch1071.v1080sleep
    FeaturePrefsStore.batch1071.v1080sleep = !current
    AppToast.show(this, "sleep: ${if (!current) "ON" else "OFF"}")
}

// v1080: slice mode
internal fun PlayerActivity.showV1080SliceToggle() {
    val current = FeaturePrefsStore.batch1071.v1080slice
    FeaturePrefsStore.batch1071.v1080slice = !current
    AppToast.show(this, "slice: ${if (!current) "ON" else "OFF"}")
}

// v1080: slide mode
internal fun PlayerActivity.showV1080SlideToggle() {
    val current = FeaturePrefsStore.batch1071.v1080slide
    FeaturePrefsStore.batch1071.v1080slide = !current
    AppToast.show(this, "slide: ${if (!current) "ON" else "OFF"}")
}

