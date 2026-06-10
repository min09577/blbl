package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1951: divided mode
internal fun PlayerActivity.showV1951DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951divided
    FeaturePrefsStore.batch1951.v1951divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1951: documented mode
internal fun PlayerActivity.showV1951DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951documented
    FeaturePrefsStore.batch1951.v1951documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1951: doubled mode
internal fun PlayerActivity.showV1951DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1951doubled
    FeaturePrefsStore.batch1951.v1951doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1951: downloaded mode
internal fun PlayerActivity.showV1951DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951downloaded
    FeaturePrefsStore.batch1951.v1951downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1951: drafted mode
internal fun PlayerActivity.showV1951DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951drafted
    FeaturePrefsStore.batch1951.v1951drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1951: drained level
internal fun PlayerActivity.showV1951DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1951: dramatized level
internal fun PlayerActivity.showV1951DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1951: drawn level
internal fun PlayerActivity.showV1951DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1951: dreamed level
internal fun PlayerActivity.showV1951DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1951: drifted level
internal fun PlayerActivity.showV1951DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1951drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1951drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1951: drilled mode
internal fun PlayerActivity.showV1951DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1951drilled
    FeaturePrefsStore.batch1951.v1951drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1951: driven mode
internal fun PlayerActivity.showV1951DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1951driven
    FeaturePrefsStore.batch1951.v1951driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1951: dropped mode
internal fun PlayerActivity.showV1951DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951dropped
    FeaturePrefsStore.batch1951.v1951dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1951: drowned mode
internal fun PlayerActivity.showV1951DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951drowned
    FeaturePrefsStore.batch1951.v1951drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1951: duplicated mode
internal fun PlayerActivity.showV1951DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1951duplicated
    FeaturePrefsStore.batch1951.v1951duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1952: divided mode
internal fun PlayerActivity.showV1952DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952divided
    FeaturePrefsStore.batch1951.v1952divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1952: documented mode
internal fun PlayerActivity.showV1952DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952documented
    FeaturePrefsStore.batch1951.v1952documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1952: doubled mode
internal fun PlayerActivity.showV1952DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1952doubled
    FeaturePrefsStore.batch1951.v1952doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1952: downloaded mode
internal fun PlayerActivity.showV1952DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952downloaded
    FeaturePrefsStore.batch1951.v1952downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1952: drafted mode
internal fun PlayerActivity.showV1952DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952drafted
    FeaturePrefsStore.batch1951.v1952drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1952: drained level
internal fun PlayerActivity.showV1952DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1952: dramatized level
internal fun PlayerActivity.showV1952DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1952: drawn level
internal fun PlayerActivity.showV1952DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1952: dreamed level
internal fun PlayerActivity.showV1952DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1952: drifted level
internal fun PlayerActivity.showV1952DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1952drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1952drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1952: drilled mode
internal fun PlayerActivity.showV1952DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1952drilled
    FeaturePrefsStore.batch1951.v1952drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1952: driven mode
internal fun PlayerActivity.showV1952DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1952driven
    FeaturePrefsStore.batch1951.v1952driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1952: dropped mode
internal fun PlayerActivity.showV1952DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952dropped
    FeaturePrefsStore.batch1951.v1952dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1952: drowned mode
internal fun PlayerActivity.showV1952DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952drowned
    FeaturePrefsStore.batch1951.v1952drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1952: duplicated mode
internal fun PlayerActivity.showV1952DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1952duplicated
    FeaturePrefsStore.batch1951.v1952duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1953: divided mode
internal fun PlayerActivity.showV1953DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953divided
    FeaturePrefsStore.batch1951.v1953divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1953: documented mode
internal fun PlayerActivity.showV1953DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953documented
    FeaturePrefsStore.batch1951.v1953documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1953: doubled mode
internal fun PlayerActivity.showV1953DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1953doubled
    FeaturePrefsStore.batch1951.v1953doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1953: downloaded mode
internal fun PlayerActivity.showV1953DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953downloaded
    FeaturePrefsStore.batch1951.v1953downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1953: drafted mode
internal fun PlayerActivity.showV1953DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953drafted
    FeaturePrefsStore.batch1951.v1953drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1953: drained level
internal fun PlayerActivity.showV1953DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1953: dramatized level
internal fun PlayerActivity.showV1953DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1953: drawn level
internal fun PlayerActivity.showV1953DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1953: dreamed level
internal fun PlayerActivity.showV1953DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1953: drifted level
internal fun PlayerActivity.showV1953DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1953drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1953drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1953: drilled mode
internal fun PlayerActivity.showV1953DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1953drilled
    FeaturePrefsStore.batch1951.v1953drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1953: driven mode
internal fun PlayerActivity.showV1953DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1953driven
    FeaturePrefsStore.batch1951.v1953driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1953: dropped mode
internal fun PlayerActivity.showV1953DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953dropped
    FeaturePrefsStore.batch1951.v1953dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1953: drowned mode
internal fun PlayerActivity.showV1953DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953drowned
    FeaturePrefsStore.batch1951.v1953drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1953: duplicated mode
internal fun PlayerActivity.showV1953DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1953duplicated
    FeaturePrefsStore.batch1951.v1953duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1954: divided mode
internal fun PlayerActivity.showV1954DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954divided
    FeaturePrefsStore.batch1951.v1954divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1954: documented mode
internal fun PlayerActivity.showV1954DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954documented
    FeaturePrefsStore.batch1951.v1954documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1954: doubled mode
internal fun PlayerActivity.showV1954DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1954doubled
    FeaturePrefsStore.batch1951.v1954doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1954: downloaded mode
internal fun PlayerActivity.showV1954DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954downloaded
    FeaturePrefsStore.batch1951.v1954downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1954: drafted mode
internal fun PlayerActivity.showV1954DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954drafted
    FeaturePrefsStore.batch1951.v1954drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1954: drained level
internal fun PlayerActivity.showV1954DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1954: dramatized level
internal fun PlayerActivity.showV1954DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1954: drawn level
internal fun PlayerActivity.showV1954DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1954: dreamed level
internal fun PlayerActivity.showV1954DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1954: drifted level
internal fun PlayerActivity.showV1954DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1954drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1954drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1954: drilled mode
internal fun PlayerActivity.showV1954DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1954drilled
    FeaturePrefsStore.batch1951.v1954drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1954: driven mode
internal fun PlayerActivity.showV1954DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1954driven
    FeaturePrefsStore.batch1951.v1954driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1954: dropped mode
internal fun PlayerActivity.showV1954DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954dropped
    FeaturePrefsStore.batch1951.v1954dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1954: drowned mode
internal fun PlayerActivity.showV1954DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954drowned
    FeaturePrefsStore.batch1951.v1954drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1954: duplicated mode
internal fun PlayerActivity.showV1954DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1954duplicated
    FeaturePrefsStore.batch1951.v1954duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1955: divided mode
internal fun PlayerActivity.showV1955DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955divided
    FeaturePrefsStore.batch1951.v1955divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1955: documented mode
internal fun PlayerActivity.showV1955DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955documented
    FeaturePrefsStore.batch1951.v1955documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1955: doubled mode
internal fun PlayerActivity.showV1955DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1955doubled
    FeaturePrefsStore.batch1951.v1955doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1955: downloaded mode
internal fun PlayerActivity.showV1955DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955downloaded
    FeaturePrefsStore.batch1951.v1955downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1955: drafted mode
internal fun PlayerActivity.showV1955DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955drafted
    FeaturePrefsStore.batch1951.v1955drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1955: drained level
internal fun PlayerActivity.showV1955DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1955: dramatized level
internal fun PlayerActivity.showV1955DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1955: drawn level
internal fun PlayerActivity.showV1955DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1955: dreamed level
internal fun PlayerActivity.showV1955DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1955: drifted level
internal fun PlayerActivity.showV1955DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1955drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1955drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1955: drilled mode
internal fun PlayerActivity.showV1955DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1955drilled
    FeaturePrefsStore.batch1951.v1955drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1955: driven mode
internal fun PlayerActivity.showV1955DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1955driven
    FeaturePrefsStore.batch1951.v1955driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1955: dropped mode
internal fun PlayerActivity.showV1955DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955dropped
    FeaturePrefsStore.batch1951.v1955dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1955: drowned mode
internal fun PlayerActivity.showV1955DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955drowned
    FeaturePrefsStore.batch1951.v1955drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1955: duplicated mode
internal fun PlayerActivity.showV1955DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1955duplicated
    FeaturePrefsStore.batch1951.v1955duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1956: divided mode
internal fun PlayerActivity.showV1956DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956divided
    FeaturePrefsStore.batch1951.v1956divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1956: documented mode
internal fun PlayerActivity.showV1956DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956documented
    FeaturePrefsStore.batch1951.v1956documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1956: doubled mode
internal fun PlayerActivity.showV1956DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1956doubled
    FeaturePrefsStore.batch1951.v1956doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1956: downloaded mode
internal fun PlayerActivity.showV1956DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956downloaded
    FeaturePrefsStore.batch1951.v1956downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1956: drafted mode
internal fun PlayerActivity.showV1956DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956drafted
    FeaturePrefsStore.batch1951.v1956drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1956: drained level
internal fun PlayerActivity.showV1956DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1956: dramatized level
internal fun PlayerActivity.showV1956DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1956: drawn level
internal fun PlayerActivity.showV1956DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1956: dreamed level
internal fun PlayerActivity.showV1956DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1956: drifted level
internal fun PlayerActivity.showV1956DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1956drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1956drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1956: drilled mode
internal fun PlayerActivity.showV1956DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1956drilled
    FeaturePrefsStore.batch1951.v1956drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1956: driven mode
internal fun PlayerActivity.showV1956DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1956driven
    FeaturePrefsStore.batch1951.v1956driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1956: dropped mode
internal fun PlayerActivity.showV1956DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956dropped
    FeaturePrefsStore.batch1951.v1956dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1956: drowned mode
internal fun PlayerActivity.showV1956DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956drowned
    FeaturePrefsStore.batch1951.v1956drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1956: duplicated mode
internal fun PlayerActivity.showV1956DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1956duplicated
    FeaturePrefsStore.batch1951.v1956duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1957: divided mode
internal fun PlayerActivity.showV1957DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957divided
    FeaturePrefsStore.batch1951.v1957divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1957: documented mode
internal fun PlayerActivity.showV1957DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957documented
    FeaturePrefsStore.batch1951.v1957documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1957: doubled mode
internal fun PlayerActivity.showV1957DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1957doubled
    FeaturePrefsStore.batch1951.v1957doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1957: downloaded mode
internal fun PlayerActivity.showV1957DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957downloaded
    FeaturePrefsStore.batch1951.v1957downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1957: drafted mode
internal fun PlayerActivity.showV1957DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957drafted
    FeaturePrefsStore.batch1951.v1957drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1957: drained level
internal fun PlayerActivity.showV1957DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1957: dramatized level
internal fun PlayerActivity.showV1957DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1957: drawn level
internal fun PlayerActivity.showV1957DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1957: dreamed level
internal fun PlayerActivity.showV1957DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1957: drifted level
internal fun PlayerActivity.showV1957DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1957drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1957drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1957: drilled mode
internal fun PlayerActivity.showV1957DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1957drilled
    FeaturePrefsStore.batch1951.v1957drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1957: driven mode
internal fun PlayerActivity.showV1957DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1957driven
    FeaturePrefsStore.batch1951.v1957driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1957: dropped mode
internal fun PlayerActivity.showV1957DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957dropped
    FeaturePrefsStore.batch1951.v1957dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1957: drowned mode
internal fun PlayerActivity.showV1957DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957drowned
    FeaturePrefsStore.batch1951.v1957drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1957: duplicated mode
internal fun PlayerActivity.showV1957DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1957duplicated
    FeaturePrefsStore.batch1951.v1957duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1958: divided mode
internal fun PlayerActivity.showV1958DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958divided
    FeaturePrefsStore.batch1951.v1958divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1958: documented mode
internal fun PlayerActivity.showV1958DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958documented
    FeaturePrefsStore.batch1951.v1958documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1958: doubled mode
internal fun PlayerActivity.showV1958DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1958doubled
    FeaturePrefsStore.batch1951.v1958doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1958: downloaded mode
internal fun PlayerActivity.showV1958DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958downloaded
    FeaturePrefsStore.batch1951.v1958downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1958: drafted mode
internal fun PlayerActivity.showV1958DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958drafted
    FeaturePrefsStore.batch1951.v1958drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1958: drained level
internal fun PlayerActivity.showV1958DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1958: dramatized level
internal fun PlayerActivity.showV1958DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1958: drawn level
internal fun PlayerActivity.showV1958DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1958: dreamed level
internal fun PlayerActivity.showV1958DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1958: drifted level
internal fun PlayerActivity.showV1958DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1958drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1958drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1958: drilled mode
internal fun PlayerActivity.showV1958DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1958drilled
    FeaturePrefsStore.batch1951.v1958drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1958: driven mode
internal fun PlayerActivity.showV1958DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1958driven
    FeaturePrefsStore.batch1951.v1958driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1958: dropped mode
internal fun PlayerActivity.showV1958DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958dropped
    FeaturePrefsStore.batch1951.v1958dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1958: drowned mode
internal fun PlayerActivity.showV1958DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958drowned
    FeaturePrefsStore.batch1951.v1958drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1958: duplicated mode
internal fun PlayerActivity.showV1958DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1958duplicated
    FeaturePrefsStore.batch1951.v1958duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1959: divided mode
internal fun PlayerActivity.showV1959DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959divided
    FeaturePrefsStore.batch1951.v1959divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1959: documented mode
internal fun PlayerActivity.showV1959DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959documented
    FeaturePrefsStore.batch1951.v1959documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1959: doubled mode
internal fun PlayerActivity.showV1959DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1959doubled
    FeaturePrefsStore.batch1951.v1959doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1959: downloaded mode
internal fun PlayerActivity.showV1959DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959downloaded
    FeaturePrefsStore.batch1951.v1959downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1959: drafted mode
internal fun PlayerActivity.showV1959DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959drafted
    FeaturePrefsStore.batch1951.v1959drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1959: drained level
internal fun PlayerActivity.showV1959DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1959: dramatized level
internal fun PlayerActivity.showV1959DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1959: drawn level
internal fun PlayerActivity.showV1959DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1959: dreamed level
internal fun PlayerActivity.showV1959DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1959: drifted level
internal fun PlayerActivity.showV1959DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1959drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1959drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1959: drilled mode
internal fun PlayerActivity.showV1959DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1959drilled
    FeaturePrefsStore.batch1951.v1959drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1959: driven mode
internal fun PlayerActivity.showV1959DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1959driven
    FeaturePrefsStore.batch1951.v1959driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1959: dropped mode
internal fun PlayerActivity.showV1959DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959dropped
    FeaturePrefsStore.batch1951.v1959dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1959: drowned mode
internal fun PlayerActivity.showV1959DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959drowned
    FeaturePrefsStore.batch1951.v1959drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1959: duplicated mode
internal fun PlayerActivity.showV1959DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1959duplicated
    FeaturePrefsStore.batch1951.v1959duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

// v1960: divided mode
internal fun PlayerActivity.showV1960DividedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960divided
    FeaturePrefsStore.batch1951.v1960divided = !current
    AppToast.show(this, "divided: ${if (!current) "ON" else "OFF"}")
}

// v1960: documented mode
internal fun PlayerActivity.showV1960DocumentedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960documented
    FeaturePrefsStore.batch1951.v1960documented = !current
    AppToast.show(this, "documented: ${if (!current) "ON" else "OFF"}")
}

// v1960: doubled mode
internal fun PlayerActivity.showV1960DoubledToggle() {
    val current = FeaturePrefsStore.batch1951.v1960doubled
    FeaturePrefsStore.batch1951.v1960doubled = !current
    AppToast.show(this, "doubled: ${if (!current) "ON" else "OFF"}")
}

// v1960: downloaded mode
internal fun PlayerActivity.showV1960DownloadedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960downloaded
    FeaturePrefsStore.batch1951.v1960downloaded = !current
    AppToast.show(this, "downloaded: ${if (!current) "ON" else "OFF"}")
}

// v1960: drafted mode
internal fun PlayerActivity.showV1960DraftedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960drafted
    FeaturePrefsStore.batch1951.v1960drafted = !current
    AppToast.show(this, "drafted: ${if (!current) "ON" else "OFF"}")
}

// v1960: drained level
internal fun PlayerActivity.showV1960DrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960drained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960drained = value
        AppToast.show(this, "drained: $value")
    }
}

// v1960: dramatized level
internal fun PlayerActivity.showV1960DramatizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960dramatized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dramatized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960dramatized = value
        AppToast.show(this, "dramatized: $value")
    }
}

// v1960: drawn level
internal fun PlayerActivity.showV1960DrawnDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960drawn).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drawn level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960drawn = value
        AppToast.show(this, "drawn: $value")
    }
}

// v1960: dreamed level
internal fun PlayerActivity.showV1960DreamedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960dreamed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dreamed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960dreamed = value
        AppToast.show(this, "dreamed: $value")
    }
}

// v1960: drifted level
internal fun PlayerActivity.showV1960DriftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1951.v1960drifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "drifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1951.v1960drifted = value
        AppToast.show(this, "drifted: $value")
    }
}

// v1960: drilled mode
internal fun PlayerActivity.showV1960DrilledToggle() {
    val current = FeaturePrefsStore.batch1951.v1960drilled
    FeaturePrefsStore.batch1951.v1960drilled = !current
    AppToast.show(this, "drilled: ${if (!current) "ON" else "OFF"}")
}

// v1960: driven mode
internal fun PlayerActivity.showV1960DrivenToggle() {
    val current = FeaturePrefsStore.batch1951.v1960driven
    FeaturePrefsStore.batch1951.v1960driven = !current
    AppToast.show(this, "driven: ${if (!current) "ON" else "OFF"}")
}

// v1960: dropped mode
internal fun PlayerActivity.showV1960DroppedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960dropped
    FeaturePrefsStore.batch1951.v1960dropped = !current
    AppToast.show(this, "dropped: ${if (!current) "ON" else "OFF"}")
}

// v1960: drowned mode
internal fun PlayerActivity.showV1960DrownedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960drowned
    FeaturePrefsStore.batch1951.v1960drowned = !current
    AppToast.show(this, "drowned: ${if (!current) "ON" else "OFF"}")
}

// v1960: duplicated mode
internal fun PlayerActivity.showV1960DuplicatedToggle() {
    val current = FeaturePrefsStore.batch1951.v1960duplicated
    FeaturePrefsStore.batch1951.v1960duplicated = !current
    AppToast.show(this, "duplicated: ${if (!current) "ON" else "OFF"}")
}

