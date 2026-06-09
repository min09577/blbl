package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1801: aboveboard mode
internal fun PlayerActivity.showV1801AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1801aboveboard
    FeaturePrefsStore.batch1801.v1801aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1801: absent mode
internal fun PlayerActivity.showV1801AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1801absent
    FeaturePrefsStore.batch1801.v1801absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1801: abstract mode
internal fun PlayerActivity.showV1801AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1801abstract
    FeaturePrefsStore.batch1801.v1801abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1801: absurd mode
internal fun PlayerActivity.showV1801AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1801absurd
    FeaturePrefsStore.batch1801.v1801absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1801: accented mode
internal fun PlayerActivity.showV1801AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801accented
    FeaturePrefsStore.batch1801.v1801accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1801: accepted level
internal fun PlayerActivity.showV1801AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1801: accomplish level
internal fun PlayerActivity.showV1801AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1801: accorded level
internal fun PlayerActivity.showV1801AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1801: accounted level
internal fun PlayerActivity.showV1801AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1801: achieved level
internal fun PlayerActivity.showV1801AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1801achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1801achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1801: acknowledged mode
internal fun PlayerActivity.showV1801AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801acknowledged
    FeaturePrefsStore.batch1801.v1801acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1801: acquired mode
internal fun PlayerActivity.showV1801AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1801acquired
    FeaturePrefsStore.batch1801.v1801acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1801: activated mode
internal fun PlayerActivity.showV1801ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801activated
    FeaturePrefsStore.batch1801.v1801activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1801: adapted mode
internal fun PlayerActivity.showV1801AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801adapted
    FeaturePrefsStore.batch1801.v1801adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1801: added mode
internal fun PlayerActivity.showV1801AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1801added
    FeaturePrefsStore.batch1801.v1801added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1802: aboveboard mode
internal fun PlayerActivity.showV1802AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1802aboveboard
    FeaturePrefsStore.batch1801.v1802aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1802: absent mode
internal fun PlayerActivity.showV1802AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1802absent
    FeaturePrefsStore.batch1801.v1802absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1802: abstract mode
internal fun PlayerActivity.showV1802AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1802abstract
    FeaturePrefsStore.batch1801.v1802abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1802: absurd mode
internal fun PlayerActivity.showV1802AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1802absurd
    FeaturePrefsStore.batch1801.v1802absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1802: accented mode
internal fun PlayerActivity.showV1802AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802accented
    FeaturePrefsStore.batch1801.v1802accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1802: accepted level
internal fun PlayerActivity.showV1802AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1802: accomplish level
internal fun PlayerActivity.showV1802AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1802: accorded level
internal fun PlayerActivity.showV1802AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1802: accounted level
internal fun PlayerActivity.showV1802AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1802: achieved level
internal fun PlayerActivity.showV1802AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1802achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1802achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1802: acknowledged mode
internal fun PlayerActivity.showV1802AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802acknowledged
    FeaturePrefsStore.batch1801.v1802acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1802: acquired mode
internal fun PlayerActivity.showV1802AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1802acquired
    FeaturePrefsStore.batch1801.v1802acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1802: activated mode
internal fun PlayerActivity.showV1802ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802activated
    FeaturePrefsStore.batch1801.v1802activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1802: adapted mode
internal fun PlayerActivity.showV1802AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802adapted
    FeaturePrefsStore.batch1801.v1802adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1802: added mode
internal fun PlayerActivity.showV1802AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1802added
    FeaturePrefsStore.batch1801.v1802added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1803: aboveboard mode
internal fun PlayerActivity.showV1803AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1803aboveboard
    FeaturePrefsStore.batch1801.v1803aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1803: absent mode
internal fun PlayerActivity.showV1803AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1803absent
    FeaturePrefsStore.batch1801.v1803absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1803: abstract mode
internal fun PlayerActivity.showV1803AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1803abstract
    FeaturePrefsStore.batch1801.v1803abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1803: absurd mode
internal fun PlayerActivity.showV1803AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1803absurd
    FeaturePrefsStore.batch1801.v1803absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1803: accented mode
internal fun PlayerActivity.showV1803AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803accented
    FeaturePrefsStore.batch1801.v1803accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1803: accepted level
internal fun PlayerActivity.showV1803AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1803: accomplish level
internal fun PlayerActivity.showV1803AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1803: accorded level
internal fun PlayerActivity.showV1803AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1803: accounted level
internal fun PlayerActivity.showV1803AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1803: achieved level
internal fun PlayerActivity.showV1803AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1803achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1803achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1803: acknowledged mode
internal fun PlayerActivity.showV1803AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803acknowledged
    FeaturePrefsStore.batch1801.v1803acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1803: acquired mode
internal fun PlayerActivity.showV1803AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1803acquired
    FeaturePrefsStore.batch1801.v1803acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1803: activated mode
internal fun PlayerActivity.showV1803ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803activated
    FeaturePrefsStore.batch1801.v1803activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1803: adapted mode
internal fun PlayerActivity.showV1803AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803adapted
    FeaturePrefsStore.batch1801.v1803adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1803: added mode
internal fun PlayerActivity.showV1803AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1803added
    FeaturePrefsStore.batch1801.v1803added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1804: aboveboard mode
internal fun PlayerActivity.showV1804AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1804aboveboard
    FeaturePrefsStore.batch1801.v1804aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1804: absent mode
internal fun PlayerActivity.showV1804AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1804absent
    FeaturePrefsStore.batch1801.v1804absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1804: abstract mode
internal fun PlayerActivity.showV1804AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1804abstract
    FeaturePrefsStore.batch1801.v1804abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1804: absurd mode
internal fun PlayerActivity.showV1804AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1804absurd
    FeaturePrefsStore.batch1801.v1804absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1804: accented mode
internal fun PlayerActivity.showV1804AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804accented
    FeaturePrefsStore.batch1801.v1804accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1804: accepted level
internal fun PlayerActivity.showV1804AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1804: accomplish level
internal fun PlayerActivity.showV1804AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1804: accorded level
internal fun PlayerActivity.showV1804AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1804: accounted level
internal fun PlayerActivity.showV1804AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1804: achieved level
internal fun PlayerActivity.showV1804AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1804achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1804achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1804: acknowledged mode
internal fun PlayerActivity.showV1804AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804acknowledged
    FeaturePrefsStore.batch1801.v1804acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1804: acquired mode
internal fun PlayerActivity.showV1804AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1804acquired
    FeaturePrefsStore.batch1801.v1804acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1804: activated mode
internal fun PlayerActivity.showV1804ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804activated
    FeaturePrefsStore.batch1801.v1804activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1804: adapted mode
internal fun PlayerActivity.showV1804AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804adapted
    FeaturePrefsStore.batch1801.v1804adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1804: added mode
internal fun PlayerActivity.showV1804AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1804added
    FeaturePrefsStore.batch1801.v1804added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1805: aboveboard mode
internal fun PlayerActivity.showV1805AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1805aboveboard
    FeaturePrefsStore.batch1801.v1805aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1805: absent mode
internal fun PlayerActivity.showV1805AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1805absent
    FeaturePrefsStore.batch1801.v1805absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1805: abstract mode
internal fun PlayerActivity.showV1805AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1805abstract
    FeaturePrefsStore.batch1801.v1805abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1805: absurd mode
internal fun PlayerActivity.showV1805AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1805absurd
    FeaturePrefsStore.batch1801.v1805absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1805: accented mode
internal fun PlayerActivity.showV1805AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805accented
    FeaturePrefsStore.batch1801.v1805accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1805: accepted level
internal fun PlayerActivity.showV1805AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1805: accomplish level
internal fun PlayerActivity.showV1805AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1805: accorded level
internal fun PlayerActivity.showV1805AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1805: accounted level
internal fun PlayerActivity.showV1805AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1805: achieved level
internal fun PlayerActivity.showV1805AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1805achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1805achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1805: acknowledged mode
internal fun PlayerActivity.showV1805AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805acknowledged
    FeaturePrefsStore.batch1801.v1805acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1805: acquired mode
internal fun PlayerActivity.showV1805AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1805acquired
    FeaturePrefsStore.batch1801.v1805acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1805: activated mode
internal fun PlayerActivity.showV1805ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805activated
    FeaturePrefsStore.batch1801.v1805activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1805: adapted mode
internal fun PlayerActivity.showV1805AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805adapted
    FeaturePrefsStore.batch1801.v1805adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1805: added mode
internal fun PlayerActivity.showV1805AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1805added
    FeaturePrefsStore.batch1801.v1805added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1806: aboveboard mode
internal fun PlayerActivity.showV1806AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1806aboveboard
    FeaturePrefsStore.batch1801.v1806aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1806: absent mode
internal fun PlayerActivity.showV1806AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1806absent
    FeaturePrefsStore.batch1801.v1806absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1806: abstract mode
internal fun PlayerActivity.showV1806AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1806abstract
    FeaturePrefsStore.batch1801.v1806abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1806: absurd mode
internal fun PlayerActivity.showV1806AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1806absurd
    FeaturePrefsStore.batch1801.v1806absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1806: accented mode
internal fun PlayerActivity.showV1806AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806accented
    FeaturePrefsStore.batch1801.v1806accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1806: accepted level
internal fun PlayerActivity.showV1806AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1806: accomplish level
internal fun PlayerActivity.showV1806AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1806: accorded level
internal fun PlayerActivity.showV1806AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1806: accounted level
internal fun PlayerActivity.showV1806AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1806: achieved level
internal fun PlayerActivity.showV1806AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1806achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1806achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1806: acknowledged mode
internal fun PlayerActivity.showV1806AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806acknowledged
    FeaturePrefsStore.batch1801.v1806acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1806: acquired mode
internal fun PlayerActivity.showV1806AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1806acquired
    FeaturePrefsStore.batch1801.v1806acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1806: activated mode
internal fun PlayerActivity.showV1806ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806activated
    FeaturePrefsStore.batch1801.v1806activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1806: adapted mode
internal fun PlayerActivity.showV1806AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806adapted
    FeaturePrefsStore.batch1801.v1806adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1806: added mode
internal fun PlayerActivity.showV1806AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1806added
    FeaturePrefsStore.batch1801.v1806added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1807: aboveboard mode
internal fun PlayerActivity.showV1807AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1807aboveboard
    FeaturePrefsStore.batch1801.v1807aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1807: absent mode
internal fun PlayerActivity.showV1807AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1807absent
    FeaturePrefsStore.batch1801.v1807absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1807: abstract mode
internal fun PlayerActivity.showV1807AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1807abstract
    FeaturePrefsStore.batch1801.v1807abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1807: absurd mode
internal fun PlayerActivity.showV1807AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1807absurd
    FeaturePrefsStore.batch1801.v1807absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1807: accented mode
internal fun PlayerActivity.showV1807AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807accented
    FeaturePrefsStore.batch1801.v1807accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1807: accepted level
internal fun PlayerActivity.showV1807AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1807: accomplish level
internal fun PlayerActivity.showV1807AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1807: accorded level
internal fun PlayerActivity.showV1807AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1807: accounted level
internal fun PlayerActivity.showV1807AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1807: achieved level
internal fun PlayerActivity.showV1807AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1807achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1807achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1807: acknowledged mode
internal fun PlayerActivity.showV1807AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807acknowledged
    FeaturePrefsStore.batch1801.v1807acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1807: acquired mode
internal fun PlayerActivity.showV1807AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1807acquired
    FeaturePrefsStore.batch1801.v1807acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1807: activated mode
internal fun PlayerActivity.showV1807ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807activated
    FeaturePrefsStore.batch1801.v1807activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1807: adapted mode
internal fun PlayerActivity.showV1807AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807adapted
    FeaturePrefsStore.batch1801.v1807adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1807: added mode
internal fun PlayerActivity.showV1807AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1807added
    FeaturePrefsStore.batch1801.v1807added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1808: aboveboard mode
internal fun PlayerActivity.showV1808AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1808aboveboard
    FeaturePrefsStore.batch1801.v1808aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1808: absent mode
internal fun PlayerActivity.showV1808AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1808absent
    FeaturePrefsStore.batch1801.v1808absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1808: abstract mode
internal fun PlayerActivity.showV1808AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1808abstract
    FeaturePrefsStore.batch1801.v1808abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1808: absurd mode
internal fun PlayerActivity.showV1808AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1808absurd
    FeaturePrefsStore.batch1801.v1808absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1808: accented mode
internal fun PlayerActivity.showV1808AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808accented
    FeaturePrefsStore.batch1801.v1808accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1808: accepted level
internal fun PlayerActivity.showV1808AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1808: accomplish level
internal fun PlayerActivity.showV1808AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1808: accorded level
internal fun PlayerActivity.showV1808AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1808: accounted level
internal fun PlayerActivity.showV1808AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1808: achieved level
internal fun PlayerActivity.showV1808AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1808achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1808achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1808: acknowledged mode
internal fun PlayerActivity.showV1808AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808acknowledged
    FeaturePrefsStore.batch1801.v1808acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1808: acquired mode
internal fun PlayerActivity.showV1808AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1808acquired
    FeaturePrefsStore.batch1801.v1808acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1808: activated mode
internal fun PlayerActivity.showV1808ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808activated
    FeaturePrefsStore.batch1801.v1808activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1808: adapted mode
internal fun PlayerActivity.showV1808AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808adapted
    FeaturePrefsStore.batch1801.v1808adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1808: added mode
internal fun PlayerActivity.showV1808AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1808added
    FeaturePrefsStore.batch1801.v1808added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1809: aboveboard mode
internal fun PlayerActivity.showV1809AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1809aboveboard
    FeaturePrefsStore.batch1801.v1809aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1809: absent mode
internal fun PlayerActivity.showV1809AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1809absent
    FeaturePrefsStore.batch1801.v1809absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1809: abstract mode
internal fun PlayerActivity.showV1809AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1809abstract
    FeaturePrefsStore.batch1801.v1809abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1809: absurd mode
internal fun PlayerActivity.showV1809AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1809absurd
    FeaturePrefsStore.batch1801.v1809absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1809: accented mode
internal fun PlayerActivity.showV1809AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809accented
    FeaturePrefsStore.batch1801.v1809accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1809: accepted level
internal fun PlayerActivity.showV1809AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1809: accomplish level
internal fun PlayerActivity.showV1809AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1809: accorded level
internal fun PlayerActivity.showV1809AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1809: accounted level
internal fun PlayerActivity.showV1809AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1809: achieved level
internal fun PlayerActivity.showV1809AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1809achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1809achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1809: acknowledged mode
internal fun PlayerActivity.showV1809AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809acknowledged
    FeaturePrefsStore.batch1801.v1809acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1809: acquired mode
internal fun PlayerActivity.showV1809AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1809acquired
    FeaturePrefsStore.batch1801.v1809acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1809: activated mode
internal fun PlayerActivity.showV1809ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809activated
    FeaturePrefsStore.batch1801.v1809activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1809: adapted mode
internal fun PlayerActivity.showV1809AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809adapted
    FeaturePrefsStore.batch1801.v1809adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1809: added mode
internal fun PlayerActivity.showV1809AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1809added
    FeaturePrefsStore.batch1801.v1809added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

// v1810: aboveboard mode
internal fun PlayerActivity.showV1810AboveboardToggle() {
    val current = FeaturePrefsStore.batch1801.v1810aboveboard
    FeaturePrefsStore.batch1801.v1810aboveboard = !current
    AppToast.show(this, "aboveboard: ${if (!current) "ON" else "OFF"}")
}

// v1810: absent mode
internal fun PlayerActivity.showV1810AbsentToggle() {
    val current = FeaturePrefsStore.batch1801.v1810absent
    FeaturePrefsStore.batch1801.v1810absent = !current
    AppToast.show(this, "absent: ${if (!current) "ON" else "OFF"}")
}

// v1810: abstract mode
internal fun PlayerActivity.showV1810AbstractToggle() {
    val current = FeaturePrefsStore.batch1801.v1810abstract
    FeaturePrefsStore.batch1801.v1810abstract = !current
    AppToast.show(this, "abstract: ${if (!current) "ON" else "OFF"}")
}

// v1810: absurd mode
internal fun PlayerActivity.showV1810AbsurdToggle() {
    val current = FeaturePrefsStore.batch1801.v1810absurd
    FeaturePrefsStore.batch1801.v1810absurd = !current
    AppToast.show(this, "absurd: ${if (!current) "ON" else "OFF"}")
}

// v1810: accented mode
internal fun PlayerActivity.showV1810AccentedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810accented
    FeaturePrefsStore.batch1801.v1810accented = !current
    AppToast.show(this, "accented: ${if (!current) "ON" else "OFF"}")
}

// v1810: accepted level
internal fun PlayerActivity.showV1810AcceptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accepted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accepted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accepted = value
        AppToast.show(this, "accepted: $value")
    }
}

// v1810: accomplish level
internal fun PlayerActivity.showV1810AccomplishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accomplish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accomplish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accomplish = value
        AppToast.show(this, "accomplish: $value")
    }
}

// v1810: accorded level
internal fun PlayerActivity.showV1810AccordedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accorded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accorded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accorded = value
        AppToast.show(this, "accorded: $value")
    }
}

// v1810: accounted level
internal fun PlayerActivity.showV1810AccountedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810accounted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "accounted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810accounted = value
        AppToast.show(this, "accounted: $value")
    }
}

// v1810: achieved level
internal fun PlayerActivity.showV1810AchievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1801.v1810achieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "achieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1801.v1810achieved = value
        AppToast.show(this, "achieved: $value")
    }
}

// v1810: acknowledged mode
internal fun PlayerActivity.showV1810AcknowledgedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810acknowledged
    FeaturePrefsStore.batch1801.v1810acknowledged = !current
    AppToast.show(this, "acknowledged: ${if (!current) "ON" else "OFF"}")
}

// v1810: acquired mode
internal fun PlayerActivity.showV1810AcquiredToggle() {
    val current = FeaturePrefsStore.batch1801.v1810acquired
    FeaturePrefsStore.batch1801.v1810acquired = !current
    AppToast.show(this, "acquired: ${if (!current) "ON" else "OFF"}")
}

// v1810: activated mode
internal fun PlayerActivity.showV1810ActivatedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810activated
    FeaturePrefsStore.batch1801.v1810activated = !current
    AppToast.show(this, "activated: ${if (!current) "ON" else "OFF"}")
}

// v1810: adapted mode
internal fun PlayerActivity.showV1810AdaptedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810adapted
    FeaturePrefsStore.batch1801.v1810adapted = !current
    AppToast.show(this, "adapted: ${if (!current) "ON" else "OFF"}")
}

// v1810: added mode
internal fun PlayerActivity.showV1810AddedToggle() {
    val current = FeaturePrefsStore.batch1801.v1810added
    FeaturePrefsStore.batch1801.v1810added = !current
    AppToast.show(this, "added: ${if (!current) "ON" else "OFF"}")
}

