package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2061: interested mode
internal fun PlayerActivity.showV2061InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061interested
    FeaturePrefsStore.batch2061.v2061interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2061: interpreted mode
internal fun PlayerActivity.showV2061InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061interpreted
    FeaturePrefsStore.batch2061.v2061interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2061: interrupted mode
internal fun PlayerActivity.showV2061InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061interrupted
    FeaturePrefsStore.batch2061.v2061interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2061: introduced mode
internal fun PlayerActivity.showV2061IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061introduced
    FeaturePrefsStore.batch2061.v2061introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2061: invented mode
internal fun PlayerActivity.showV2061InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061invented
    FeaturePrefsStore.batch2061.v2061invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2061: invested level
internal fun PlayerActivity.showV2061InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2061: investigated level
internal fun PlayerActivity.showV2061InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2061: invited level
internal fun PlayerActivity.showV2061InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2061: involved level
internal fun PlayerActivity.showV2061InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2061: isolated level
internal fun PlayerActivity.showV2061IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2061isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2061isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2061: issued mode
internal fun PlayerActivity.showV2061IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061issued
    FeaturePrefsStore.batch2061.v2061issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2061: justified mode
internal fun PlayerActivity.showV2061JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061justified
    FeaturePrefsStore.batch2061.v2061justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2061: kept mode
internal fun PlayerActivity.showV2061KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2061kept
    FeaturePrefsStore.batch2061.v2061kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2061: keyed mode
internal fun PlayerActivity.showV2061KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061keyed
    FeaturePrefsStore.batch2061.v2061keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2061: kicked mode
internal fun PlayerActivity.showV2061KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2061kicked
    FeaturePrefsStore.batch2061.v2061kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2062: interested mode
internal fun PlayerActivity.showV2062InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062interested
    FeaturePrefsStore.batch2061.v2062interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2062: interpreted mode
internal fun PlayerActivity.showV2062InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062interpreted
    FeaturePrefsStore.batch2061.v2062interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2062: interrupted mode
internal fun PlayerActivity.showV2062InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062interrupted
    FeaturePrefsStore.batch2061.v2062interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2062: introduced mode
internal fun PlayerActivity.showV2062IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062introduced
    FeaturePrefsStore.batch2061.v2062introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2062: invented mode
internal fun PlayerActivity.showV2062InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062invented
    FeaturePrefsStore.batch2061.v2062invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2062: invested level
internal fun PlayerActivity.showV2062InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2062: investigated level
internal fun PlayerActivity.showV2062InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2062: invited level
internal fun PlayerActivity.showV2062InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2062: involved level
internal fun PlayerActivity.showV2062InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2062: isolated level
internal fun PlayerActivity.showV2062IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2062isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2062isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2062: issued mode
internal fun PlayerActivity.showV2062IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062issued
    FeaturePrefsStore.batch2061.v2062issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2062: justified mode
internal fun PlayerActivity.showV2062JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062justified
    FeaturePrefsStore.batch2061.v2062justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2062: kept mode
internal fun PlayerActivity.showV2062KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2062kept
    FeaturePrefsStore.batch2061.v2062kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2062: keyed mode
internal fun PlayerActivity.showV2062KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062keyed
    FeaturePrefsStore.batch2061.v2062keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2062: kicked mode
internal fun PlayerActivity.showV2062KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2062kicked
    FeaturePrefsStore.batch2061.v2062kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2063: interested mode
internal fun PlayerActivity.showV2063InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063interested
    FeaturePrefsStore.batch2061.v2063interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2063: interpreted mode
internal fun PlayerActivity.showV2063InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063interpreted
    FeaturePrefsStore.batch2061.v2063interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2063: interrupted mode
internal fun PlayerActivity.showV2063InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063interrupted
    FeaturePrefsStore.batch2061.v2063interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2063: introduced mode
internal fun PlayerActivity.showV2063IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063introduced
    FeaturePrefsStore.batch2061.v2063introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2063: invented mode
internal fun PlayerActivity.showV2063InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063invented
    FeaturePrefsStore.batch2061.v2063invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2063: invested level
internal fun PlayerActivity.showV2063InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2063: investigated level
internal fun PlayerActivity.showV2063InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2063: invited level
internal fun PlayerActivity.showV2063InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2063: involved level
internal fun PlayerActivity.showV2063InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2063: isolated level
internal fun PlayerActivity.showV2063IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2063isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2063isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2063: issued mode
internal fun PlayerActivity.showV2063IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063issued
    FeaturePrefsStore.batch2061.v2063issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2063: justified mode
internal fun PlayerActivity.showV2063JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063justified
    FeaturePrefsStore.batch2061.v2063justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2063: kept mode
internal fun PlayerActivity.showV2063KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2063kept
    FeaturePrefsStore.batch2061.v2063kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2063: keyed mode
internal fun PlayerActivity.showV2063KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063keyed
    FeaturePrefsStore.batch2061.v2063keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2063: kicked mode
internal fun PlayerActivity.showV2063KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2063kicked
    FeaturePrefsStore.batch2061.v2063kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2064: interested mode
internal fun PlayerActivity.showV2064InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064interested
    FeaturePrefsStore.batch2061.v2064interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2064: interpreted mode
internal fun PlayerActivity.showV2064InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064interpreted
    FeaturePrefsStore.batch2061.v2064interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2064: interrupted mode
internal fun PlayerActivity.showV2064InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064interrupted
    FeaturePrefsStore.batch2061.v2064interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2064: introduced mode
internal fun PlayerActivity.showV2064IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064introduced
    FeaturePrefsStore.batch2061.v2064introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2064: invented mode
internal fun PlayerActivity.showV2064InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064invented
    FeaturePrefsStore.batch2061.v2064invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2064: invested level
internal fun PlayerActivity.showV2064InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2064: investigated level
internal fun PlayerActivity.showV2064InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2064: invited level
internal fun PlayerActivity.showV2064InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2064: involved level
internal fun PlayerActivity.showV2064InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2064: isolated level
internal fun PlayerActivity.showV2064IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2064isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2064isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2064: issued mode
internal fun PlayerActivity.showV2064IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064issued
    FeaturePrefsStore.batch2061.v2064issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2064: justified mode
internal fun PlayerActivity.showV2064JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064justified
    FeaturePrefsStore.batch2061.v2064justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2064: kept mode
internal fun PlayerActivity.showV2064KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2064kept
    FeaturePrefsStore.batch2061.v2064kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2064: keyed mode
internal fun PlayerActivity.showV2064KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064keyed
    FeaturePrefsStore.batch2061.v2064keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2064: kicked mode
internal fun PlayerActivity.showV2064KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2064kicked
    FeaturePrefsStore.batch2061.v2064kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2065: interested mode
internal fun PlayerActivity.showV2065InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065interested
    FeaturePrefsStore.batch2061.v2065interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2065: interpreted mode
internal fun PlayerActivity.showV2065InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065interpreted
    FeaturePrefsStore.batch2061.v2065interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2065: interrupted mode
internal fun PlayerActivity.showV2065InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065interrupted
    FeaturePrefsStore.batch2061.v2065interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2065: introduced mode
internal fun PlayerActivity.showV2065IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065introduced
    FeaturePrefsStore.batch2061.v2065introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2065: invented mode
internal fun PlayerActivity.showV2065InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065invented
    FeaturePrefsStore.batch2061.v2065invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2065: invested level
internal fun PlayerActivity.showV2065InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2065: investigated level
internal fun PlayerActivity.showV2065InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2065: invited level
internal fun PlayerActivity.showV2065InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2065: involved level
internal fun PlayerActivity.showV2065InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2065: isolated level
internal fun PlayerActivity.showV2065IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2065isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2065isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2065: issued mode
internal fun PlayerActivity.showV2065IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065issued
    FeaturePrefsStore.batch2061.v2065issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2065: justified mode
internal fun PlayerActivity.showV2065JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065justified
    FeaturePrefsStore.batch2061.v2065justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2065: kept mode
internal fun PlayerActivity.showV2065KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2065kept
    FeaturePrefsStore.batch2061.v2065kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2065: keyed mode
internal fun PlayerActivity.showV2065KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065keyed
    FeaturePrefsStore.batch2061.v2065keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2065: kicked mode
internal fun PlayerActivity.showV2065KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2065kicked
    FeaturePrefsStore.batch2061.v2065kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2066: interested mode
internal fun PlayerActivity.showV2066InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066interested
    FeaturePrefsStore.batch2061.v2066interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2066: interpreted mode
internal fun PlayerActivity.showV2066InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066interpreted
    FeaturePrefsStore.batch2061.v2066interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2066: interrupted mode
internal fun PlayerActivity.showV2066InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066interrupted
    FeaturePrefsStore.batch2061.v2066interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2066: introduced mode
internal fun PlayerActivity.showV2066IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066introduced
    FeaturePrefsStore.batch2061.v2066introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2066: invented mode
internal fun PlayerActivity.showV2066InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066invented
    FeaturePrefsStore.batch2061.v2066invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2066: invested level
internal fun PlayerActivity.showV2066InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2066: investigated level
internal fun PlayerActivity.showV2066InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2066: invited level
internal fun PlayerActivity.showV2066InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2066: involved level
internal fun PlayerActivity.showV2066InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2066: isolated level
internal fun PlayerActivity.showV2066IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2066isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2066isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2066: issued mode
internal fun PlayerActivity.showV2066IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066issued
    FeaturePrefsStore.batch2061.v2066issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2066: justified mode
internal fun PlayerActivity.showV2066JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066justified
    FeaturePrefsStore.batch2061.v2066justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2066: kept mode
internal fun PlayerActivity.showV2066KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2066kept
    FeaturePrefsStore.batch2061.v2066kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2066: keyed mode
internal fun PlayerActivity.showV2066KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066keyed
    FeaturePrefsStore.batch2061.v2066keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2066: kicked mode
internal fun PlayerActivity.showV2066KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2066kicked
    FeaturePrefsStore.batch2061.v2066kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2067: interested mode
internal fun PlayerActivity.showV2067InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067interested
    FeaturePrefsStore.batch2061.v2067interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2067: interpreted mode
internal fun PlayerActivity.showV2067InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067interpreted
    FeaturePrefsStore.batch2061.v2067interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2067: interrupted mode
internal fun PlayerActivity.showV2067InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067interrupted
    FeaturePrefsStore.batch2061.v2067interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2067: introduced mode
internal fun PlayerActivity.showV2067IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067introduced
    FeaturePrefsStore.batch2061.v2067introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2067: invented mode
internal fun PlayerActivity.showV2067InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067invented
    FeaturePrefsStore.batch2061.v2067invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2067: invested level
internal fun PlayerActivity.showV2067InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2067: investigated level
internal fun PlayerActivity.showV2067InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2067: invited level
internal fun PlayerActivity.showV2067InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2067: involved level
internal fun PlayerActivity.showV2067InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2067: isolated level
internal fun PlayerActivity.showV2067IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2067isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2067isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2067: issued mode
internal fun PlayerActivity.showV2067IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067issued
    FeaturePrefsStore.batch2061.v2067issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2067: justified mode
internal fun PlayerActivity.showV2067JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067justified
    FeaturePrefsStore.batch2061.v2067justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2067: kept mode
internal fun PlayerActivity.showV2067KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2067kept
    FeaturePrefsStore.batch2061.v2067kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2067: keyed mode
internal fun PlayerActivity.showV2067KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067keyed
    FeaturePrefsStore.batch2061.v2067keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2067: kicked mode
internal fun PlayerActivity.showV2067KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2067kicked
    FeaturePrefsStore.batch2061.v2067kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2068: interested mode
internal fun PlayerActivity.showV2068InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068interested
    FeaturePrefsStore.batch2061.v2068interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2068: interpreted mode
internal fun PlayerActivity.showV2068InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068interpreted
    FeaturePrefsStore.batch2061.v2068interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2068: interrupted mode
internal fun PlayerActivity.showV2068InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068interrupted
    FeaturePrefsStore.batch2061.v2068interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2068: introduced mode
internal fun PlayerActivity.showV2068IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068introduced
    FeaturePrefsStore.batch2061.v2068introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2068: invented mode
internal fun PlayerActivity.showV2068InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068invented
    FeaturePrefsStore.batch2061.v2068invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2068: invested level
internal fun PlayerActivity.showV2068InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2068: investigated level
internal fun PlayerActivity.showV2068InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2068: invited level
internal fun PlayerActivity.showV2068InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2068: involved level
internal fun PlayerActivity.showV2068InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2068: isolated level
internal fun PlayerActivity.showV2068IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2068isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2068isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2068: issued mode
internal fun PlayerActivity.showV2068IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068issued
    FeaturePrefsStore.batch2061.v2068issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2068: justified mode
internal fun PlayerActivity.showV2068JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068justified
    FeaturePrefsStore.batch2061.v2068justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2068: kept mode
internal fun PlayerActivity.showV2068KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2068kept
    FeaturePrefsStore.batch2061.v2068kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2068: keyed mode
internal fun PlayerActivity.showV2068KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068keyed
    FeaturePrefsStore.batch2061.v2068keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2068: kicked mode
internal fun PlayerActivity.showV2068KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2068kicked
    FeaturePrefsStore.batch2061.v2068kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2069: interested mode
internal fun PlayerActivity.showV2069InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069interested
    FeaturePrefsStore.batch2061.v2069interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2069: interpreted mode
internal fun PlayerActivity.showV2069InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069interpreted
    FeaturePrefsStore.batch2061.v2069interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2069: interrupted mode
internal fun PlayerActivity.showV2069InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069interrupted
    FeaturePrefsStore.batch2061.v2069interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2069: introduced mode
internal fun PlayerActivity.showV2069IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069introduced
    FeaturePrefsStore.batch2061.v2069introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2069: invented mode
internal fun PlayerActivity.showV2069InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069invented
    FeaturePrefsStore.batch2061.v2069invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2069: invested level
internal fun PlayerActivity.showV2069InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2069: investigated level
internal fun PlayerActivity.showV2069InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2069: invited level
internal fun PlayerActivity.showV2069InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2069: involved level
internal fun PlayerActivity.showV2069InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2069: isolated level
internal fun PlayerActivity.showV2069IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2069isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2069isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2069: issued mode
internal fun PlayerActivity.showV2069IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069issued
    FeaturePrefsStore.batch2061.v2069issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2069: justified mode
internal fun PlayerActivity.showV2069JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069justified
    FeaturePrefsStore.batch2061.v2069justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2069: kept mode
internal fun PlayerActivity.showV2069KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2069kept
    FeaturePrefsStore.batch2061.v2069kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2069: keyed mode
internal fun PlayerActivity.showV2069KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069keyed
    FeaturePrefsStore.batch2061.v2069keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2069: kicked mode
internal fun PlayerActivity.showV2069KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2069kicked
    FeaturePrefsStore.batch2061.v2069kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

// v2070: interested mode
internal fun PlayerActivity.showV2070InterestedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070interested
    FeaturePrefsStore.batch2061.v2070interested = !current
    AppToast.show(this, "interested: ${if (!current) "ON" else "OFF"}")
}

// v2070: interpreted mode
internal fun PlayerActivity.showV2070InterpretedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070interpreted
    FeaturePrefsStore.batch2061.v2070interpreted = !current
    AppToast.show(this, "interpreted: ${if (!current) "ON" else "OFF"}")
}

// v2070: interrupted mode
internal fun PlayerActivity.showV2070InterruptedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070interrupted
    FeaturePrefsStore.batch2061.v2070interrupted = !current
    AppToast.show(this, "interrupted: ${if (!current) "ON" else "OFF"}")
}

// v2070: introduced mode
internal fun PlayerActivity.showV2070IntroducedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070introduced
    FeaturePrefsStore.batch2061.v2070introduced = !current
    AppToast.show(this, "introduced: ${if (!current) "ON" else "OFF"}")
}

// v2070: invented mode
internal fun PlayerActivity.showV2070InventedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070invented
    FeaturePrefsStore.batch2061.v2070invented = !current
    AppToast.show(this, "invented: ${if (!current) "ON" else "OFF"}")
}

// v2070: invested level
internal fun PlayerActivity.showV2070InvestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070invested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070invested = value
        AppToast.show(this, "invested: $value")
    }
}

// v2070: investigated level
internal fun PlayerActivity.showV2070InvestigatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070investigated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "investigated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070investigated = value
        AppToast.show(this, "investigated: $value")
    }
}

// v2070: invited level
internal fun PlayerActivity.showV2070InvitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070invited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "invited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070invited = value
        AppToast.show(this, "invited: $value")
    }
}

// v2070: involved level
internal fun PlayerActivity.showV2070InvolvedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070involved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "involved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070involved = value
        AppToast.show(this, "involved: $value")
    }
}

// v2070: isolated level
internal fun PlayerActivity.showV2070IsolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2061.v2070isolated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "isolated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2061.v2070isolated = value
        AppToast.show(this, "isolated: $value")
    }
}

// v2070: issued mode
internal fun PlayerActivity.showV2070IssuedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070issued
    FeaturePrefsStore.batch2061.v2070issued = !current
    AppToast.show(this, "issued: ${if (!current) "ON" else "OFF"}")
}

// v2070: justified mode
internal fun PlayerActivity.showV2070JustifiedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070justified
    FeaturePrefsStore.batch2061.v2070justified = !current
    AppToast.show(this, "justified: ${if (!current) "ON" else "OFF"}")
}

// v2070: kept mode
internal fun PlayerActivity.showV2070KeptToggle() {
    val current = FeaturePrefsStore.batch2061.v2070kept
    FeaturePrefsStore.batch2061.v2070kept = !current
    AppToast.show(this, "kept: ${if (!current) "ON" else "OFF"}")
}

// v2070: keyed mode
internal fun PlayerActivity.showV2070KeyedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070keyed
    FeaturePrefsStore.batch2061.v2070keyed = !current
    AppToast.show(this, "keyed: ${if (!current) "ON" else "OFF"}")
}

// v2070: kicked mode
internal fun PlayerActivity.showV2070KickedToggle() {
    val current = FeaturePrefsStore.batch2061.v2070kicked
    FeaturePrefsStore.batch2061.v2070kicked = !current
    AppToast.show(this, "kicked: ${if (!current) "ON" else "OFF"}")
}

