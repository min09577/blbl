package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2101: mounted mode
internal fun PlayerActivity.showV2101MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101mounted
    FeaturePrefsStore.batch2101.v2101mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2101: moved mode
internal fun PlayerActivity.showV2101MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101moved
    FeaturePrefsStore.batch2101.v2101moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2101: multiplied mode
internal fun PlayerActivity.showV2101MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101multiplied
    FeaturePrefsStore.batch2101.v2101multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2101: narrowed mode
internal fun PlayerActivity.showV2101NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101narrowed
    FeaturePrefsStore.batch2101.v2101narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2101: navigated mode
internal fun PlayerActivity.showV2101NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101navigated
    FeaturePrefsStore.batch2101.v2101navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2101: needed level
internal fun PlayerActivity.showV2101NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2101: negotiated level
internal fun PlayerActivity.showV2101NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2101: neutralized level
internal fun PlayerActivity.showV2101NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2101: normalized level
internal fun PlayerActivity.showV2101NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2101: noted level
internal fun PlayerActivity.showV2101NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2101: noticed mode
internal fun PlayerActivity.showV2101NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101noticed
    FeaturePrefsStore.batch2101.v2101noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2101: notified mode
internal fun PlayerActivity.showV2101NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101notified
    FeaturePrefsStore.batch2101.v2101notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2101: nourished mode
internal fun PlayerActivity.showV2101NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101nourished
    FeaturePrefsStore.batch2101.v2101nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2101: numbered mode
internal fun PlayerActivity.showV2101NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101numbered
    FeaturePrefsStore.batch2101.v2101numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2101: obeyed mode
internal fun PlayerActivity.showV2101ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101obeyed
    FeaturePrefsStore.batch2101.v2101obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2102: mounted mode
internal fun PlayerActivity.showV2102MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102mounted
    FeaturePrefsStore.batch2101.v2102mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2102: moved mode
internal fun PlayerActivity.showV2102MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102moved
    FeaturePrefsStore.batch2101.v2102moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2102: multiplied mode
internal fun PlayerActivity.showV2102MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102multiplied
    FeaturePrefsStore.batch2101.v2102multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2102: narrowed mode
internal fun PlayerActivity.showV2102NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102narrowed
    FeaturePrefsStore.batch2101.v2102narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2102: navigated mode
internal fun PlayerActivity.showV2102NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102navigated
    FeaturePrefsStore.batch2101.v2102navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2102: needed level
internal fun PlayerActivity.showV2102NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2102: negotiated level
internal fun PlayerActivity.showV2102NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2102: neutralized level
internal fun PlayerActivity.showV2102NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2102: normalized level
internal fun PlayerActivity.showV2102NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2102: noted level
internal fun PlayerActivity.showV2102NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2102: noticed mode
internal fun PlayerActivity.showV2102NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102noticed
    FeaturePrefsStore.batch2101.v2102noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2102: notified mode
internal fun PlayerActivity.showV2102NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102notified
    FeaturePrefsStore.batch2101.v2102notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2102: nourished mode
internal fun PlayerActivity.showV2102NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102nourished
    FeaturePrefsStore.batch2101.v2102nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2102: numbered mode
internal fun PlayerActivity.showV2102NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102numbered
    FeaturePrefsStore.batch2101.v2102numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2102: obeyed mode
internal fun PlayerActivity.showV2102ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102obeyed
    FeaturePrefsStore.batch2101.v2102obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2103: mounted mode
internal fun PlayerActivity.showV2103MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103mounted
    FeaturePrefsStore.batch2101.v2103mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2103: moved mode
internal fun PlayerActivity.showV2103MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103moved
    FeaturePrefsStore.batch2101.v2103moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2103: multiplied mode
internal fun PlayerActivity.showV2103MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103multiplied
    FeaturePrefsStore.batch2101.v2103multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2103: narrowed mode
internal fun PlayerActivity.showV2103NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103narrowed
    FeaturePrefsStore.batch2101.v2103narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2103: navigated mode
internal fun PlayerActivity.showV2103NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103navigated
    FeaturePrefsStore.batch2101.v2103navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2103: needed level
internal fun PlayerActivity.showV2103NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2103: negotiated level
internal fun PlayerActivity.showV2103NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2103: neutralized level
internal fun PlayerActivity.showV2103NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2103: normalized level
internal fun PlayerActivity.showV2103NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2103: noted level
internal fun PlayerActivity.showV2103NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2103: noticed mode
internal fun PlayerActivity.showV2103NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103noticed
    FeaturePrefsStore.batch2101.v2103noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2103: notified mode
internal fun PlayerActivity.showV2103NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103notified
    FeaturePrefsStore.batch2101.v2103notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2103: nourished mode
internal fun PlayerActivity.showV2103NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103nourished
    FeaturePrefsStore.batch2101.v2103nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2103: numbered mode
internal fun PlayerActivity.showV2103NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103numbered
    FeaturePrefsStore.batch2101.v2103numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2103: obeyed mode
internal fun PlayerActivity.showV2103ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103obeyed
    FeaturePrefsStore.batch2101.v2103obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2104: mounted mode
internal fun PlayerActivity.showV2104MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104mounted
    FeaturePrefsStore.batch2101.v2104mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2104: moved mode
internal fun PlayerActivity.showV2104MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104moved
    FeaturePrefsStore.batch2101.v2104moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2104: multiplied mode
internal fun PlayerActivity.showV2104MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104multiplied
    FeaturePrefsStore.batch2101.v2104multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2104: narrowed mode
internal fun PlayerActivity.showV2104NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104narrowed
    FeaturePrefsStore.batch2101.v2104narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2104: navigated mode
internal fun PlayerActivity.showV2104NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104navigated
    FeaturePrefsStore.batch2101.v2104navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2104: needed level
internal fun PlayerActivity.showV2104NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2104: negotiated level
internal fun PlayerActivity.showV2104NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2104: neutralized level
internal fun PlayerActivity.showV2104NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2104: normalized level
internal fun PlayerActivity.showV2104NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2104: noted level
internal fun PlayerActivity.showV2104NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2104: noticed mode
internal fun PlayerActivity.showV2104NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104noticed
    FeaturePrefsStore.batch2101.v2104noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2104: notified mode
internal fun PlayerActivity.showV2104NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104notified
    FeaturePrefsStore.batch2101.v2104notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2104: nourished mode
internal fun PlayerActivity.showV2104NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104nourished
    FeaturePrefsStore.batch2101.v2104nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2104: numbered mode
internal fun PlayerActivity.showV2104NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104numbered
    FeaturePrefsStore.batch2101.v2104numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2104: obeyed mode
internal fun PlayerActivity.showV2104ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104obeyed
    FeaturePrefsStore.batch2101.v2104obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2105: mounted mode
internal fun PlayerActivity.showV2105MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105mounted
    FeaturePrefsStore.batch2101.v2105mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2105: moved mode
internal fun PlayerActivity.showV2105MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105moved
    FeaturePrefsStore.batch2101.v2105moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2105: multiplied mode
internal fun PlayerActivity.showV2105MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105multiplied
    FeaturePrefsStore.batch2101.v2105multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2105: narrowed mode
internal fun PlayerActivity.showV2105NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105narrowed
    FeaturePrefsStore.batch2101.v2105narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2105: navigated mode
internal fun PlayerActivity.showV2105NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105navigated
    FeaturePrefsStore.batch2101.v2105navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2105: needed level
internal fun PlayerActivity.showV2105NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2105: negotiated level
internal fun PlayerActivity.showV2105NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2105: neutralized level
internal fun PlayerActivity.showV2105NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2105: normalized level
internal fun PlayerActivity.showV2105NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2105: noted level
internal fun PlayerActivity.showV2105NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2105: noticed mode
internal fun PlayerActivity.showV2105NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105noticed
    FeaturePrefsStore.batch2101.v2105noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2105: notified mode
internal fun PlayerActivity.showV2105NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105notified
    FeaturePrefsStore.batch2101.v2105notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2105: nourished mode
internal fun PlayerActivity.showV2105NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105nourished
    FeaturePrefsStore.batch2101.v2105nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2105: numbered mode
internal fun PlayerActivity.showV2105NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105numbered
    FeaturePrefsStore.batch2101.v2105numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2105: obeyed mode
internal fun PlayerActivity.showV2105ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105obeyed
    FeaturePrefsStore.batch2101.v2105obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2106: mounted mode
internal fun PlayerActivity.showV2106MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106mounted
    FeaturePrefsStore.batch2101.v2106mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2106: moved mode
internal fun PlayerActivity.showV2106MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106moved
    FeaturePrefsStore.batch2101.v2106moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2106: multiplied mode
internal fun PlayerActivity.showV2106MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106multiplied
    FeaturePrefsStore.batch2101.v2106multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2106: narrowed mode
internal fun PlayerActivity.showV2106NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106narrowed
    FeaturePrefsStore.batch2101.v2106narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2106: navigated mode
internal fun PlayerActivity.showV2106NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106navigated
    FeaturePrefsStore.batch2101.v2106navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2106: needed level
internal fun PlayerActivity.showV2106NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2106: negotiated level
internal fun PlayerActivity.showV2106NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2106: neutralized level
internal fun PlayerActivity.showV2106NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2106: normalized level
internal fun PlayerActivity.showV2106NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2106: noted level
internal fun PlayerActivity.showV2106NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2106: noticed mode
internal fun PlayerActivity.showV2106NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106noticed
    FeaturePrefsStore.batch2101.v2106noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2106: notified mode
internal fun PlayerActivity.showV2106NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106notified
    FeaturePrefsStore.batch2101.v2106notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2106: nourished mode
internal fun PlayerActivity.showV2106NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106nourished
    FeaturePrefsStore.batch2101.v2106nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2106: numbered mode
internal fun PlayerActivity.showV2106NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106numbered
    FeaturePrefsStore.batch2101.v2106numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2106: obeyed mode
internal fun PlayerActivity.showV2106ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106obeyed
    FeaturePrefsStore.batch2101.v2106obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2107: mounted mode
internal fun PlayerActivity.showV2107MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107mounted
    FeaturePrefsStore.batch2101.v2107mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2107: moved mode
internal fun PlayerActivity.showV2107MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107moved
    FeaturePrefsStore.batch2101.v2107moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2107: multiplied mode
internal fun PlayerActivity.showV2107MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107multiplied
    FeaturePrefsStore.batch2101.v2107multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2107: narrowed mode
internal fun PlayerActivity.showV2107NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107narrowed
    FeaturePrefsStore.batch2101.v2107narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2107: navigated mode
internal fun PlayerActivity.showV2107NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107navigated
    FeaturePrefsStore.batch2101.v2107navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2107: needed level
internal fun PlayerActivity.showV2107NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2107: negotiated level
internal fun PlayerActivity.showV2107NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2107: neutralized level
internal fun PlayerActivity.showV2107NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2107: normalized level
internal fun PlayerActivity.showV2107NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2107: noted level
internal fun PlayerActivity.showV2107NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2107: noticed mode
internal fun PlayerActivity.showV2107NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107noticed
    FeaturePrefsStore.batch2101.v2107noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2107: notified mode
internal fun PlayerActivity.showV2107NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107notified
    FeaturePrefsStore.batch2101.v2107notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2107: nourished mode
internal fun PlayerActivity.showV2107NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107nourished
    FeaturePrefsStore.batch2101.v2107nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2107: numbered mode
internal fun PlayerActivity.showV2107NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107numbered
    FeaturePrefsStore.batch2101.v2107numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2107: obeyed mode
internal fun PlayerActivity.showV2107ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107obeyed
    FeaturePrefsStore.batch2101.v2107obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2108: mounted mode
internal fun PlayerActivity.showV2108MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108mounted
    FeaturePrefsStore.batch2101.v2108mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2108: moved mode
internal fun PlayerActivity.showV2108MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108moved
    FeaturePrefsStore.batch2101.v2108moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2108: multiplied mode
internal fun PlayerActivity.showV2108MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108multiplied
    FeaturePrefsStore.batch2101.v2108multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2108: narrowed mode
internal fun PlayerActivity.showV2108NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108narrowed
    FeaturePrefsStore.batch2101.v2108narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2108: navigated mode
internal fun PlayerActivity.showV2108NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108navigated
    FeaturePrefsStore.batch2101.v2108navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2108: needed level
internal fun PlayerActivity.showV2108NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2108: negotiated level
internal fun PlayerActivity.showV2108NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2108: neutralized level
internal fun PlayerActivity.showV2108NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2108: normalized level
internal fun PlayerActivity.showV2108NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2108: noted level
internal fun PlayerActivity.showV2108NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2108: noticed mode
internal fun PlayerActivity.showV2108NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108noticed
    FeaturePrefsStore.batch2101.v2108noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2108: notified mode
internal fun PlayerActivity.showV2108NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108notified
    FeaturePrefsStore.batch2101.v2108notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2108: nourished mode
internal fun PlayerActivity.showV2108NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108nourished
    FeaturePrefsStore.batch2101.v2108nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2108: numbered mode
internal fun PlayerActivity.showV2108NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108numbered
    FeaturePrefsStore.batch2101.v2108numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2108: obeyed mode
internal fun PlayerActivity.showV2108ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108obeyed
    FeaturePrefsStore.batch2101.v2108obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2109: mounted mode
internal fun PlayerActivity.showV2109MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109mounted
    FeaturePrefsStore.batch2101.v2109mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2109: moved mode
internal fun PlayerActivity.showV2109MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109moved
    FeaturePrefsStore.batch2101.v2109moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2109: multiplied mode
internal fun PlayerActivity.showV2109MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109multiplied
    FeaturePrefsStore.batch2101.v2109multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2109: narrowed mode
internal fun PlayerActivity.showV2109NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109narrowed
    FeaturePrefsStore.batch2101.v2109narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2109: navigated mode
internal fun PlayerActivity.showV2109NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109navigated
    FeaturePrefsStore.batch2101.v2109navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2109: needed level
internal fun PlayerActivity.showV2109NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2109: negotiated level
internal fun PlayerActivity.showV2109NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2109: neutralized level
internal fun PlayerActivity.showV2109NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2109: normalized level
internal fun PlayerActivity.showV2109NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2109: noted level
internal fun PlayerActivity.showV2109NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2109: noticed mode
internal fun PlayerActivity.showV2109NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109noticed
    FeaturePrefsStore.batch2101.v2109noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2109: notified mode
internal fun PlayerActivity.showV2109NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109notified
    FeaturePrefsStore.batch2101.v2109notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2109: nourished mode
internal fun PlayerActivity.showV2109NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109nourished
    FeaturePrefsStore.batch2101.v2109nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2109: numbered mode
internal fun PlayerActivity.showV2109NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109numbered
    FeaturePrefsStore.batch2101.v2109numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2109: obeyed mode
internal fun PlayerActivity.showV2109ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109obeyed
    FeaturePrefsStore.batch2101.v2109obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2110: mounted mode
internal fun PlayerActivity.showV2110MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110mounted
    FeaturePrefsStore.batch2101.v2110mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2110: moved mode
internal fun PlayerActivity.showV2110MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110moved
    FeaturePrefsStore.batch2101.v2110moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2110: multiplied mode
internal fun PlayerActivity.showV2110MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110multiplied
    FeaturePrefsStore.batch2101.v2110multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2110: narrowed mode
internal fun PlayerActivity.showV2110NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110narrowed
    FeaturePrefsStore.batch2101.v2110narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2110: navigated mode
internal fun PlayerActivity.showV2110NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110navigated
    FeaturePrefsStore.batch2101.v2110navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2110: needed level
internal fun PlayerActivity.showV2110NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2110: negotiated level
internal fun PlayerActivity.showV2110NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2110: neutralized level
internal fun PlayerActivity.showV2110NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2110: normalized level
internal fun PlayerActivity.showV2110NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2110: noted level
internal fun PlayerActivity.showV2110NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2110: noticed mode
internal fun PlayerActivity.showV2110NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110noticed
    FeaturePrefsStore.batch2101.v2110noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2110: notified mode
internal fun PlayerActivity.showV2110NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110notified
    FeaturePrefsStore.batch2101.v2110notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2110: nourished mode
internal fun PlayerActivity.showV2110NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110nourished
    FeaturePrefsStore.batch2101.v2110nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2110: numbered mode
internal fun PlayerActivity.showV2110NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110numbered
    FeaturePrefsStore.batch2101.v2110numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2110: obeyed mode
internal fun PlayerActivity.showV2110ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110obeyed
    FeaturePrefsStore.batch2101.v2110obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

