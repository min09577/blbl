package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1891: consulted mode
internal fun PlayerActivity.showV1891ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891consulted
    FeaturePrefsStore.batch1891.v1891consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1891: consumed mode
internal fun PlayerActivity.showV1891ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891consumed
    FeaturePrefsStore.batch1891.v1891consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1891: contained mode
internal fun PlayerActivity.showV1891ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891contained
    FeaturePrefsStore.batch1891.v1891contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1891: continued mode
internal fun PlayerActivity.showV1891ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891continued
    FeaturePrefsStore.batch1891.v1891continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1891: contracted mode
internal fun PlayerActivity.showV1891ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891contracted
    FeaturePrefsStore.batch1891.v1891contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1891: contributed level
internal fun PlayerActivity.showV1891ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1891contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1891contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1891: controlled level
internal fun PlayerActivity.showV1891ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1891controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1891controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1891: converted level
internal fun PlayerActivity.showV1891ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1891converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1891converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1891: convinced level
internal fun PlayerActivity.showV1891ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1891convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1891convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1891: cooled level
internal fun PlayerActivity.showV1891CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1891cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1891cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1891: cooperated mode
internal fun PlayerActivity.showV1891CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891cooperated
    FeaturePrefsStore.batch1891.v1891cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1891: coordinated mode
internal fun PlayerActivity.showV1891CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891coordinated
    FeaturePrefsStore.batch1891.v1891coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1891: copied mode
internal fun PlayerActivity.showV1891CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891copied
    FeaturePrefsStore.batch1891.v1891copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1891: corrected mode
internal fun PlayerActivity.showV1891CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891corrected
    FeaturePrefsStore.batch1891.v1891corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1891: correlated mode
internal fun PlayerActivity.showV1891CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1891correlated
    FeaturePrefsStore.batch1891.v1891correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1892: consulted mode
internal fun PlayerActivity.showV1892ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892consulted
    FeaturePrefsStore.batch1891.v1892consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1892: consumed mode
internal fun PlayerActivity.showV1892ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892consumed
    FeaturePrefsStore.batch1891.v1892consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1892: contained mode
internal fun PlayerActivity.showV1892ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892contained
    FeaturePrefsStore.batch1891.v1892contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1892: continued mode
internal fun PlayerActivity.showV1892ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892continued
    FeaturePrefsStore.batch1891.v1892continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1892: contracted mode
internal fun PlayerActivity.showV1892ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892contracted
    FeaturePrefsStore.batch1891.v1892contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1892: contributed level
internal fun PlayerActivity.showV1892ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1892contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1892contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1892: controlled level
internal fun PlayerActivity.showV1892ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1892controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1892controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1892: converted level
internal fun PlayerActivity.showV1892ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1892converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1892converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1892: convinced level
internal fun PlayerActivity.showV1892ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1892convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1892convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1892: cooled level
internal fun PlayerActivity.showV1892CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1892cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1892cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1892: cooperated mode
internal fun PlayerActivity.showV1892CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892cooperated
    FeaturePrefsStore.batch1891.v1892cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1892: coordinated mode
internal fun PlayerActivity.showV1892CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892coordinated
    FeaturePrefsStore.batch1891.v1892coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1892: copied mode
internal fun PlayerActivity.showV1892CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892copied
    FeaturePrefsStore.batch1891.v1892copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1892: corrected mode
internal fun PlayerActivity.showV1892CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892corrected
    FeaturePrefsStore.batch1891.v1892corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1892: correlated mode
internal fun PlayerActivity.showV1892CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1892correlated
    FeaturePrefsStore.batch1891.v1892correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1893: consulted mode
internal fun PlayerActivity.showV1893ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893consulted
    FeaturePrefsStore.batch1891.v1893consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1893: consumed mode
internal fun PlayerActivity.showV1893ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893consumed
    FeaturePrefsStore.batch1891.v1893consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1893: contained mode
internal fun PlayerActivity.showV1893ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893contained
    FeaturePrefsStore.batch1891.v1893contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1893: continued mode
internal fun PlayerActivity.showV1893ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893continued
    FeaturePrefsStore.batch1891.v1893continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1893: contracted mode
internal fun PlayerActivity.showV1893ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893contracted
    FeaturePrefsStore.batch1891.v1893contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1893: contributed level
internal fun PlayerActivity.showV1893ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1893contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1893contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1893: controlled level
internal fun PlayerActivity.showV1893ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1893controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1893controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1893: converted level
internal fun PlayerActivity.showV1893ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1893converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1893converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1893: convinced level
internal fun PlayerActivity.showV1893ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1893convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1893convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1893: cooled level
internal fun PlayerActivity.showV1893CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1893cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1893cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1893: cooperated mode
internal fun PlayerActivity.showV1893CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893cooperated
    FeaturePrefsStore.batch1891.v1893cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1893: coordinated mode
internal fun PlayerActivity.showV1893CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893coordinated
    FeaturePrefsStore.batch1891.v1893coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1893: copied mode
internal fun PlayerActivity.showV1893CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893copied
    FeaturePrefsStore.batch1891.v1893copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1893: corrected mode
internal fun PlayerActivity.showV1893CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893corrected
    FeaturePrefsStore.batch1891.v1893corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1893: correlated mode
internal fun PlayerActivity.showV1893CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1893correlated
    FeaturePrefsStore.batch1891.v1893correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1894: consulted mode
internal fun PlayerActivity.showV1894ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894consulted
    FeaturePrefsStore.batch1891.v1894consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1894: consumed mode
internal fun PlayerActivity.showV1894ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894consumed
    FeaturePrefsStore.batch1891.v1894consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1894: contained mode
internal fun PlayerActivity.showV1894ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894contained
    FeaturePrefsStore.batch1891.v1894contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1894: continued mode
internal fun PlayerActivity.showV1894ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894continued
    FeaturePrefsStore.batch1891.v1894continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1894: contracted mode
internal fun PlayerActivity.showV1894ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894contracted
    FeaturePrefsStore.batch1891.v1894contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1894: contributed level
internal fun PlayerActivity.showV1894ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1894contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1894contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1894: controlled level
internal fun PlayerActivity.showV1894ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1894controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1894controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1894: converted level
internal fun PlayerActivity.showV1894ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1894converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1894converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1894: convinced level
internal fun PlayerActivity.showV1894ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1894convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1894convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1894: cooled level
internal fun PlayerActivity.showV1894CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1894cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1894cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1894: cooperated mode
internal fun PlayerActivity.showV1894CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894cooperated
    FeaturePrefsStore.batch1891.v1894cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1894: coordinated mode
internal fun PlayerActivity.showV1894CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894coordinated
    FeaturePrefsStore.batch1891.v1894coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1894: copied mode
internal fun PlayerActivity.showV1894CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894copied
    FeaturePrefsStore.batch1891.v1894copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1894: corrected mode
internal fun PlayerActivity.showV1894CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894corrected
    FeaturePrefsStore.batch1891.v1894corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1894: correlated mode
internal fun PlayerActivity.showV1894CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1894correlated
    FeaturePrefsStore.batch1891.v1894correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1895: consulted mode
internal fun PlayerActivity.showV1895ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895consulted
    FeaturePrefsStore.batch1891.v1895consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1895: consumed mode
internal fun PlayerActivity.showV1895ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895consumed
    FeaturePrefsStore.batch1891.v1895consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1895: contained mode
internal fun PlayerActivity.showV1895ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895contained
    FeaturePrefsStore.batch1891.v1895contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1895: continued mode
internal fun PlayerActivity.showV1895ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895continued
    FeaturePrefsStore.batch1891.v1895continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1895: contracted mode
internal fun PlayerActivity.showV1895ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895contracted
    FeaturePrefsStore.batch1891.v1895contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1895: contributed level
internal fun PlayerActivity.showV1895ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1895contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1895contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1895: controlled level
internal fun PlayerActivity.showV1895ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1895controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1895controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1895: converted level
internal fun PlayerActivity.showV1895ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1895converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1895converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1895: convinced level
internal fun PlayerActivity.showV1895ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1895convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1895convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1895: cooled level
internal fun PlayerActivity.showV1895CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1895cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1895cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1895: cooperated mode
internal fun PlayerActivity.showV1895CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895cooperated
    FeaturePrefsStore.batch1891.v1895cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1895: coordinated mode
internal fun PlayerActivity.showV1895CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895coordinated
    FeaturePrefsStore.batch1891.v1895coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1895: copied mode
internal fun PlayerActivity.showV1895CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895copied
    FeaturePrefsStore.batch1891.v1895copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1895: corrected mode
internal fun PlayerActivity.showV1895CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895corrected
    FeaturePrefsStore.batch1891.v1895corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1895: correlated mode
internal fun PlayerActivity.showV1895CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1895correlated
    FeaturePrefsStore.batch1891.v1895correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1896: consulted mode
internal fun PlayerActivity.showV1896ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896consulted
    FeaturePrefsStore.batch1891.v1896consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1896: consumed mode
internal fun PlayerActivity.showV1896ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896consumed
    FeaturePrefsStore.batch1891.v1896consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1896: contained mode
internal fun PlayerActivity.showV1896ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896contained
    FeaturePrefsStore.batch1891.v1896contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1896: continued mode
internal fun PlayerActivity.showV1896ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896continued
    FeaturePrefsStore.batch1891.v1896continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1896: contracted mode
internal fun PlayerActivity.showV1896ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896contracted
    FeaturePrefsStore.batch1891.v1896contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1896: contributed level
internal fun PlayerActivity.showV1896ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1896contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1896contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1896: controlled level
internal fun PlayerActivity.showV1896ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1896controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1896controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1896: converted level
internal fun PlayerActivity.showV1896ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1896converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1896converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1896: convinced level
internal fun PlayerActivity.showV1896ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1896convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1896convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1896: cooled level
internal fun PlayerActivity.showV1896CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1896cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1896cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1896: cooperated mode
internal fun PlayerActivity.showV1896CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896cooperated
    FeaturePrefsStore.batch1891.v1896cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1896: coordinated mode
internal fun PlayerActivity.showV1896CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896coordinated
    FeaturePrefsStore.batch1891.v1896coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1896: copied mode
internal fun PlayerActivity.showV1896CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896copied
    FeaturePrefsStore.batch1891.v1896copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1896: corrected mode
internal fun PlayerActivity.showV1896CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896corrected
    FeaturePrefsStore.batch1891.v1896corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1896: correlated mode
internal fun PlayerActivity.showV1896CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1896correlated
    FeaturePrefsStore.batch1891.v1896correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1897: consulted mode
internal fun PlayerActivity.showV1897ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897consulted
    FeaturePrefsStore.batch1891.v1897consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1897: consumed mode
internal fun PlayerActivity.showV1897ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897consumed
    FeaturePrefsStore.batch1891.v1897consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1897: contained mode
internal fun PlayerActivity.showV1897ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897contained
    FeaturePrefsStore.batch1891.v1897contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1897: continued mode
internal fun PlayerActivity.showV1897ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897continued
    FeaturePrefsStore.batch1891.v1897continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1897: contracted mode
internal fun PlayerActivity.showV1897ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897contracted
    FeaturePrefsStore.batch1891.v1897contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1897: contributed level
internal fun PlayerActivity.showV1897ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1897contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1897contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1897: controlled level
internal fun PlayerActivity.showV1897ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1897controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1897controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1897: converted level
internal fun PlayerActivity.showV1897ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1897converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1897converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1897: convinced level
internal fun PlayerActivity.showV1897ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1897convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1897convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1897: cooled level
internal fun PlayerActivity.showV1897CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1897cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1897cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1897: cooperated mode
internal fun PlayerActivity.showV1897CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897cooperated
    FeaturePrefsStore.batch1891.v1897cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1897: coordinated mode
internal fun PlayerActivity.showV1897CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897coordinated
    FeaturePrefsStore.batch1891.v1897coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1897: copied mode
internal fun PlayerActivity.showV1897CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897copied
    FeaturePrefsStore.batch1891.v1897copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1897: corrected mode
internal fun PlayerActivity.showV1897CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897corrected
    FeaturePrefsStore.batch1891.v1897corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1897: correlated mode
internal fun PlayerActivity.showV1897CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1897correlated
    FeaturePrefsStore.batch1891.v1897correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1898: consulted mode
internal fun PlayerActivity.showV1898ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898consulted
    FeaturePrefsStore.batch1891.v1898consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1898: consumed mode
internal fun PlayerActivity.showV1898ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898consumed
    FeaturePrefsStore.batch1891.v1898consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1898: contained mode
internal fun PlayerActivity.showV1898ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898contained
    FeaturePrefsStore.batch1891.v1898contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1898: continued mode
internal fun PlayerActivity.showV1898ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898continued
    FeaturePrefsStore.batch1891.v1898continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1898: contracted mode
internal fun PlayerActivity.showV1898ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898contracted
    FeaturePrefsStore.batch1891.v1898contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1898: contributed level
internal fun PlayerActivity.showV1898ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1898contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1898contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1898: controlled level
internal fun PlayerActivity.showV1898ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1898controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1898controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1898: converted level
internal fun PlayerActivity.showV1898ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1898converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1898converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1898: convinced level
internal fun PlayerActivity.showV1898ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1898convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1898convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1898: cooled level
internal fun PlayerActivity.showV1898CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1898cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1898cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1898: cooperated mode
internal fun PlayerActivity.showV1898CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898cooperated
    FeaturePrefsStore.batch1891.v1898cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1898: coordinated mode
internal fun PlayerActivity.showV1898CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898coordinated
    FeaturePrefsStore.batch1891.v1898coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1898: copied mode
internal fun PlayerActivity.showV1898CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898copied
    FeaturePrefsStore.batch1891.v1898copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1898: corrected mode
internal fun PlayerActivity.showV1898CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898corrected
    FeaturePrefsStore.batch1891.v1898corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1898: correlated mode
internal fun PlayerActivity.showV1898CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1898correlated
    FeaturePrefsStore.batch1891.v1898correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1899: consulted mode
internal fun PlayerActivity.showV1899ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899consulted
    FeaturePrefsStore.batch1891.v1899consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1899: consumed mode
internal fun PlayerActivity.showV1899ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899consumed
    FeaturePrefsStore.batch1891.v1899consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1899: contained mode
internal fun PlayerActivity.showV1899ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899contained
    FeaturePrefsStore.batch1891.v1899contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1899: continued mode
internal fun PlayerActivity.showV1899ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899continued
    FeaturePrefsStore.batch1891.v1899continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1899: contracted mode
internal fun PlayerActivity.showV1899ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899contracted
    FeaturePrefsStore.batch1891.v1899contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1899: contributed level
internal fun PlayerActivity.showV1899ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1899contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1899contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1899: controlled level
internal fun PlayerActivity.showV1899ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1899controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1899controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1899: converted level
internal fun PlayerActivity.showV1899ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1899converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1899converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1899: convinced level
internal fun PlayerActivity.showV1899ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1899convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1899convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1899: cooled level
internal fun PlayerActivity.showV1899CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1899cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1899cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1899: cooperated mode
internal fun PlayerActivity.showV1899CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899cooperated
    FeaturePrefsStore.batch1891.v1899cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1899: coordinated mode
internal fun PlayerActivity.showV1899CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899coordinated
    FeaturePrefsStore.batch1891.v1899coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1899: copied mode
internal fun PlayerActivity.showV1899CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899copied
    FeaturePrefsStore.batch1891.v1899copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1899: corrected mode
internal fun PlayerActivity.showV1899CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899corrected
    FeaturePrefsStore.batch1891.v1899corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1899: correlated mode
internal fun PlayerActivity.showV1899CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1899correlated
    FeaturePrefsStore.batch1891.v1899correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

// v1900: consulted mode
internal fun PlayerActivity.showV1900ConsultedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900consulted
    FeaturePrefsStore.batch1891.v1900consulted = !current
    AppToast.show(this, "consulted: ${if (!current) "ON" else "OFF"}")
}

// v1900: consumed mode
internal fun PlayerActivity.showV1900ConsumedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900consumed
    FeaturePrefsStore.batch1891.v1900consumed = !current
    AppToast.show(this, "consumed: ${if (!current) "ON" else "OFF"}")
}

// v1900: contained mode
internal fun PlayerActivity.showV1900ContainedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900contained
    FeaturePrefsStore.batch1891.v1900contained = !current
    AppToast.show(this, "contained: ${if (!current) "ON" else "OFF"}")
}

// v1900: continued mode
internal fun PlayerActivity.showV1900ContinuedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900continued
    FeaturePrefsStore.batch1891.v1900continued = !current
    AppToast.show(this, "continued: ${if (!current) "ON" else "OFF"}")
}

// v1900: contracted mode
internal fun PlayerActivity.showV1900ContractedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900contracted
    FeaturePrefsStore.batch1891.v1900contracted = !current
    AppToast.show(this, "contracted: ${if (!current) "ON" else "OFF"}")
}

// v1900: contributed level
internal fun PlayerActivity.showV1900ContributedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1900contributed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contributed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1900contributed = value
        AppToast.show(this, "contributed: $value")
    }
}

// v1900: controlled level
internal fun PlayerActivity.showV1900ControlledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1900controlled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "controlled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1900controlled = value
        AppToast.show(this, "controlled: $value")
    }
}

// v1900: converted level
internal fun PlayerActivity.showV1900ConvertedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1900converted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "converted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1900converted = value
        AppToast.show(this, "converted: $value")
    }
}

// v1900: convinced level
internal fun PlayerActivity.showV1900ConvincedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1900convinced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "convinced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1900convinced = value
        AppToast.show(this, "convinced: $value")
    }
}

// v1900: cooled level
internal fun PlayerActivity.showV1900CooledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1891.v1900cooled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cooled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1891.v1900cooled = value
        AppToast.show(this, "cooled: $value")
    }
}

// v1900: cooperated mode
internal fun PlayerActivity.showV1900CooperatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900cooperated
    FeaturePrefsStore.batch1891.v1900cooperated = !current
    AppToast.show(this, "cooperated: ${if (!current) "ON" else "OFF"}")
}

// v1900: coordinated mode
internal fun PlayerActivity.showV1900CoordinatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900coordinated
    FeaturePrefsStore.batch1891.v1900coordinated = !current
    AppToast.show(this, "coordinated: ${if (!current) "ON" else "OFF"}")
}

// v1900: copied mode
internal fun PlayerActivity.showV1900CopiedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900copied
    FeaturePrefsStore.batch1891.v1900copied = !current
    AppToast.show(this, "copied: ${if (!current) "ON" else "OFF"}")
}

// v1900: corrected mode
internal fun PlayerActivity.showV1900CorrectedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900corrected
    FeaturePrefsStore.batch1891.v1900corrected = !current
    AppToast.show(this, "corrected: ${if (!current) "ON" else "OFF"}")
}

// v1900: correlated mode
internal fun PlayerActivity.showV1900CorrelatedToggle() {
    val current = FeaturePrefsStore.batch1891.v1900correlated
    FeaturePrefsStore.batch1891.v1900correlated = !current
    AppToast.show(this, "correlated: ${if (!current) "ON" else "OFF"}")
}

