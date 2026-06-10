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

// v1901: costed mode
internal fun PlayerActivity.showV1901CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1901costed
    FeaturePrefsStore.batch1901.v1901costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1901: coupled mode
internal fun PlayerActivity.showV1901CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1901coupled
    FeaturePrefsStore.batch1901.v1901coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1901: covered mode
internal fun PlayerActivity.showV1901CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1901covered
    FeaturePrefsStore.batch1901.v1901covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1901: cracked mode
internal fun PlayerActivity.showV1901CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1901cracked
    FeaturePrefsStore.batch1901.v1901cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1901: crafted mode
internal fun PlayerActivity.showV1901CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1901crafted
    FeaturePrefsStore.batch1901.v1901crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1901: crashed level
internal fun PlayerActivity.showV1901CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1901crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1901crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1901: created level
internal fun PlayerActivity.showV1901CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1901created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1901created = value
        AppToast.show(this, "created: $value")
    }
}

// v1901: creeping level
internal fun PlayerActivity.showV1901CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1901creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1901creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1901: crewed level
internal fun PlayerActivity.showV1901CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1901crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1901crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1901: crossed level
internal fun PlayerActivity.showV1901CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1901crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1901crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1901: crushed mode
internal fun PlayerActivity.showV1901CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1901crushed
    FeaturePrefsStore.batch1901.v1901crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1901: cured mode
internal fun PlayerActivity.showV1901CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1901cured
    FeaturePrefsStore.batch1901.v1901cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1901: curved mode
internal fun PlayerActivity.showV1901CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1901curved
    FeaturePrefsStore.batch1901.v1901curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1901: cutting mode
internal fun PlayerActivity.showV1901CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1901cutting
    FeaturePrefsStore.batch1901.v1901cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1901: cycling mode
internal fun PlayerActivity.showV1901CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1901cycling
    FeaturePrefsStore.batch1901.v1901cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1902: costed mode
internal fun PlayerActivity.showV1902CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1902costed
    FeaturePrefsStore.batch1901.v1902costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1902: coupled mode
internal fun PlayerActivity.showV1902CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1902coupled
    FeaturePrefsStore.batch1901.v1902coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1902: covered mode
internal fun PlayerActivity.showV1902CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1902covered
    FeaturePrefsStore.batch1901.v1902covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1902: cracked mode
internal fun PlayerActivity.showV1902CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1902cracked
    FeaturePrefsStore.batch1901.v1902cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1902: crafted mode
internal fun PlayerActivity.showV1902CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1902crafted
    FeaturePrefsStore.batch1901.v1902crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1902: crashed level
internal fun PlayerActivity.showV1902CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1902crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1902crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1902: created level
internal fun PlayerActivity.showV1902CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1902created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1902created = value
        AppToast.show(this, "created: $value")
    }
}

// v1902: creeping level
internal fun PlayerActivity.showV1902CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1902creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1902creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1902: crewed level
internal fun PlayerActivity.showV1902CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1902crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1902crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1902: crossed level
internal fun PlayerActivity.showV1902CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1902crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1902crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1902: crushed mode
internal fun PlayerActivity.showV1902CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1902crushed
    FeaturePrefsStore.batch1901.v1902crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1902: cured mode
internal fun PlayerActivity.showV1902CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1902cured
    FeaturePrefsStore.batch1901.v1902cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1902: curved mode
internal fun PlayerActivity.showV1902CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1902curved
    FeaturePrefsStore.batch1901.v1902curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1902: cutting mode
internal fun PlayerActivity.showV1902CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1902cutting
    FeaturePrefsStore.batch1901.v1902cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1902: cycling mode
internal fun PlayerActivity.showV1902CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1902cycling
    FeaturePrefsStore.batch1901.v1902cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1903: costed mode
internal fun PlayerActivity.showV1903CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1903costed
    FeaturePrefsStore.batch1901.v1903costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1903: coupled mode
internal fun PlayerActivity.showV1903CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1903coupled
    FeaturePrefsStore.batch1901.v1903coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1903: covered mode
internal fun PlayerActivity.showV1903CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1903covered
    FeaturePrefsStore.batch1901.v1903covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1903: cracked mode
internal fun PlayerActivity.showV1903CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1903cracked
    FeaturePrefsStore.batch1901.v1903cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1903: crafted mode
internal fun PlayerActivity.showV1903CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1903crafted
    FeaturePrefsStore.batch1901.v1903crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1903: crashed level
internal fun PlayerActivity.showV1903CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1903crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1903crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1903: created level
internal fun PlayerActivity.showV1903CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1903created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1903created = value
        AppToast.show(this, "created: $value")
    }
}

// v1903: creeping level
internal fun PlayerActivity.showV1903CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1903creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1903creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1903: crewed level
internal fun PlayerActivity.showV1903CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1903crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1903crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1903: crossed level
internal fun PlayerActivity.showV1903CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1903crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1903crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1903: crushed mode
internal fun PlayerActivity.showV1903CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1903crushed
    FeaturePrefsStore.batch1901.v1903crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1903: cured mode
internal fun PlayerActivity.showV1903CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1903cured
    FeaturePrefsStore.batch1901.v1903cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1903: curved mode
internal fun PlayerActivity.showV1903CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1903curved
    FeaturePrefsStore.batch1901.v1903curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1903: cutting mode
internal fun PlayerActivity.showV1903CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1903cutting
    FeaturePrefsStore.batch1901.v1903cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1903: cycling mode
internal fun PlayerActivity.showV1903CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1903cycling
    FeaturePrefsStore.batch1901.v1903cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1904: costed mode
internal fun PlayerActivity.showV1904CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1904costed
    FeaturePrefsStore.batch1901.v1904costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1904: coupled mode
internal fun PlayerActivity.showV1904CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1904coupled
    FeaturePrefsStore.batch1901.v1904coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1904: covered mode
internal fun PlayerActivity.showV1904CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1904covered
    FeaturePrefsStore.batch1901.v1904covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1904: cracked mode
internal fun PlayerActivity.showV1904CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1904cracked
    FeaturePrefsStore.batch1901.v1904cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1904: crafted mode
internal fun PlayerActivity.showV1904CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1904crafted
    FeaturePrefsStore.batch1901.v1904crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1904: crashed level
internal fun PlayerActivity.showV1904CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1904crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1904crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1904: created level
internal fun PlayerActivity.showV1904CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1904created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1904created = value
        AppToast.show(this, "created: $value")
    }
}

// v1904: creeping level
internal fun PlayerActivity.showV1904CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1904creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1904creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1904: crewed level
internal fun PlayerActivity.showV1904CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1904crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1904crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1904: crossed level
internal fun PlayerActivity.showV1904CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1904crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1904crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1904: crushed mode
internal fun PlayerActivity.showV1904CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1904crushed
    FeaturePrefsStore.batch1901.v1904crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1904: cured mode
internal fun PlayerActivity.showV1904CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1904cured
    FeaturePrefsStore.batch1901.v1904cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1904: curved mode
internal fun PlayerActivity.showV1904CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1904curved
    FeaturePrefsStore.batch1901.v1904curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1904: cutting mode
internal fun PlayerActivity.showV1904CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1904cutting
    FeaturePrefsStore.batch1901.v1904cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1904: cycling mode
internal fun PlayerActivity.showV1904CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1904cycling
    FeaturePrefsStore.batch1901.v1904cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1905: costed mode
internal fun PlayerActivity.showV1905CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1905costed
    FeaturePrefsStore.batch1901.v1905costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1905: coupled mode
internal fun PlayerActivity.showV1905CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1905coupled
    FeaturePrefsStore.batch1901.v1905coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1905: covered mode
internal fun PlayerActivity.showV1905CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1905covered
    FeaturePrefsStore.batch1901.v1905covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1905: cracked mode
internal fun PlayerActivity.showV1905CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1905cracked
    FeaturePrefsStore.batch1901.v1905cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1905: crafted mode
internal fun PlayerActivity.showV1905CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1905crafted
    FeaturePrefsStore.batch1901.v1905crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1905: crashed level
internal fun PlayerActivity.showV1905CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1905crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1905crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1905: created level
internal fun PlayerActivity.showV1905CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1905created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1905created = value
        AppToast.show(this, "created: $value")
    }
}

// v1905: creeping level
internal fun PlayerActivity.showV1905CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1905creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1905creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1905: crewed level
internal fun PlayerActivity.showV1905CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1905crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1905crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1905: crossed level
internal fun PlayerActivity.showV1905CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1905crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1905crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1905: crushed mode
internal fun PlayerActivity.showV1905CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1905crushed
    FeaturePrefsStore.batch1901.v1905crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1905: cured mode
internal fun PlayerActivity.showV1905CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1905cured
    FeaturePrefsStore.batch1901.v1905cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1905: curved mode
internal fun PlayerActivity.showV1905CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1905curved
    FeaturePrefsStore.batch1901.v1905curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1905: cutting mode
internal fun PlayerActivity.showV1905CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1905cutting
    FeaturePrefsStore.batch1901.v1905cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1905: cycling mode
internal fun PlayerActivity.showV1905CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1905cycling
    FeaturePrefsStore.batch1901.v1905cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1906: costed mode
internal fun PlayerActivity.showV1906CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1906costed
    FeaturePrefsStore.batch1901.v1906costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1906: coupled mode
internal fun PlayerActivity.showV1906CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1906coupled
    FeaturePrefsStore.batch1901.v1906coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1906: covered mode
internal fun PlayerActivity.showV1906CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1906covered
    FeaturePrefsStore.batch1901.v1906covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1906: cracked mode
internal fun PlayerActivity.showV1906CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1906cracked
    FeaturePrefsStore.batch1901.v1906cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1906: crafted mode
internal fun PlayerActivity.showV1906CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1906crafted
    FeaturePrefsStore.batch1901.v1906crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1906: crashed level
internal fun PlayerActivity.showV1906CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1906crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1906crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1906: created level
internal fun PlayerActivity.showV1906CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1906created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1906created = value
        AppToast.show(this, "created: $value")
    }
}

// v1906: creeping level
internal fun PlayerActivity.showV1906CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1906creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1906creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1906: crewed level
internal fun PlayerActivity.showV1906CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1906crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1906crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1906: crossed level
internal fun PlayerActivity.showV1906CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1906crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1906crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1906: crushed mode
internal fun PlayerActivity.showV1906CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1906crushed
    FeaturePrefsStore.batch1901.v1906crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1906: cured mode
internal fun PlayerActivity.showV1906CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1906cured
    FeaturePrefsStore.batch1901.v1906cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1906: curved mode
internal fun PlayerActivity.showV1906CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1906curved
    FeaturePrefsStore.batch1901.v1906curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1906: cutting mode
internal fun PlayerActivity.showV1906CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1906cutting
    FeaturePrefsStore.batch1901.v1906cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1906: cycling mode
internal fun PlayerActivity.showV1906CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1906cycling
    FeaturePrefsStore.batch1901.v1906cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1907: costed mode
internal fun PlayerActivity.showV1907CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1907costed
    FeaturePrefsStore.batch1901.v1907costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1907: coupled mode
internal fun PlayerActivity.showV1907CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1907coupled
    FeaturePrefsStore.batch1901.v1907coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1907: covered mode
internal fun PlayerActivity.showV1907CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1907covered
    FeaturePrefsStore.batch1901.v1907covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1907: cracked mode
internal fun PlayerActivity.showV1907CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1907cracked
    FeaturePrefsStore.batch1901.v1907cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1907: crafted mode
internal fun PlayerActivity.showV1907CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1907crafted
    FeaturePrefsStore.batch1901.v1907crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1907: crashed level
internal fun PlayerActivity.showV1907CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1907crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1907crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1907: created level
internal fun PlayerActivity.showV1907CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1907created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1907created = value
        AppToast.show(this, "created: $value")
    }
}

// v1907: creeping level
internal fun PlayerActivity.showV1907CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1907creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1907creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1907: crewed level
internal fun PlayerActivity.showV1907CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1907crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1907crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1907: crossed level
internal fun PlayerActivity.showV1907CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1907crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1907crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1907: crushed mode
internal fun PlayerActivity.showV1907CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1907crushed
    FeaturePrefsStore.batch1901.v1907crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1907: cured mode
internal fun PlayerActivity.showV1907CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1907cured
    FeaturePrefsStore.batch1901.v1907cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1907: curved mode
internal fun PlayerActivity.showV1907CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1907curved
    FeaturePrefsStore.batch1901.v1907curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1907: cutting mode
internal fun PlayerActivity.showV1907CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1907cutting
    FeaturePrefsStore.batch1901.v1907cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1907: cycling mode
internal fun PlayerActivity.showV1907CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1907cycling
    FeaturePrefsStore.batch1901.v1907cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1908: costed mode
internal fun PlayerActivity.showV1908CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1908costed
    FeaturePrefsStore.batch1901.v1908costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1908: coupled mode
internal fun PlayerActivity.showV1908CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1908coupled
    FeaturePrefsStore.batch1901.v1908coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1908: covered mode
internal fun PlayerActivity.showV1908CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1908covered
    FeaturePrefsStore.batch1901.v1908covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1908: cracked mode
internal fun PlayerActivity.showV1908CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1908cracked
    FeaturePrefsStore.batch1901.v1908cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1908: crafted mode
internal fun PlayerActivity.showV1908CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1908crafted
    FeaturePrefsStore.batch1901.v1908crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1908: crashed level
internal fun PlayerActivity.showV1908CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1908crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1908crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1908: created level
internal fun PlayerActivity.showV1908CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1908created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1908created = value
        AppToast.show(this, "created: $value")
    }
}

// v1908: creeping level
internal fun PlayerActivity.showV1908CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1908creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1908creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1908: crewed level
internal fun PlayerActivity.showV1908CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1908crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1908crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1908: crossed level
internal fun PlayerActivity.showV1908CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1908crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1908crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1908: crushed mode
internal fun PlayerActivity.showV1908CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1908crushed
    FeaturePrefsStore.batch1901.v1908crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1908: cured mode
internal fun PlayerActivity.showV1908CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1908cured
    FeaturePrefsStore.batch1901.v1908cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1908: curved mode
internal fun PlayerActivity.showV1908CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1908curved
    FeaturePrefsStore.batch1901.v1908curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1908: cutting mode
internal fun PlayerActivity.showV1908CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1908cutting
    FeaturePrefsStore.batch1901.v1908cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1908: cycling mode
internal fun PlayerActivity.showV1908CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1908cycling
    FeaturePrefsStore.batch1901.v1908cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1909: costed mode
internal fun PlayerActivity.showV1909CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1909costed
    FeaturePrefsStore.batch1901.v1909costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1909: coupled mode
internal fun PlayerActivity.showV1909CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1909coupled
    FeaturePrefsStore.batch1901.v1909coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1909: covered mode
internal fun PlayerActivity.showV1909CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1909covered
    FeaturePrefsStore.batch1901.v1909covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1909: cracked mode
internal fun PlayerActivity.showV1909CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1909cracked
    FeaturePrefsStore.batch1901.v1909cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1909: crafted mode
internal fun PlayerActivity.showV1909CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1909crafted
    FeaturePrefsStore.batch1901.v1909crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1909: crashed level
internal fun PlayerActivity.showV1909CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1909crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1909crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1909: created level
internal fun PlayerActivity.showV1909CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1909created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1909created = value
        AppToast.show(this, "created: $value")
    }
}

// v1909: creeping level
internal fun PlayerActivity.showV1909CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1909creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1909creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1909: crewed level
internal fun PlayerActivity.showV1909CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1909crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1909crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1909: crossed level
internal fun PlayerActivity.showV1909CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1909crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1909crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1909: crushed mode
internal fun PlayerActivity.showV1909CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1909crushed
    FeaturePrefsStore.batch1901.v1909crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1909: cured mode
internal fun PlayerActivity.showV1909CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1909cured
    FeaturePrefsStore.batch1901.v1909cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1909: curved mode
internal fun PlayerActivity.showV1909CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1909curved
    FeaturePrefsStore.batch1901.v1909curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1909: cutting mode
internal fun PlayerActivity.showV1909CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1909cutting
    FeaturePrefsStore.batch1901.v1909cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1909: cycling mode
internal fun PlayerActivity.showV1909CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1909cycling
    FeaturePrefsStore.batch1901.v1909cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1910: costed mode
internal fun PlayerActivity.showV1910CostedToggle() {
    val current = FeaturePrefsStore.batch1901.v1910costed
    FeaturePrefsStore.batch1901.v1910costed = !current
    AppToast.show(this, "costed: ${if (!current) "ON" else "OFF"}")
}

// v1910: coupled mode
internal fun PlayerActivity.showV1910CoupledToggle() {
    val current = FeaturePrefsStore.batch1901.v1910coupled
    FeaturePrefsStore.batch1901.v1910coupled = !current
    AppToast.show(this, "coupled: ${if (!current) "ON" else "OFF"}")
}

// v1910: covered mode
internal fun PlayerActivity.showV1910CoveredToggle() {
    val current = FeaturePrefsStore.batch1901.v1910covered
    FeaturePrefsStore.batch1901.v1910covered = !current
    AppToast.show(this, "covered: ${if (!current) "ON" else "OFF"}")
}

// v1910: cracked mode
internal fun PlayerActivity.showV1910CrackedToggle() {
    val current = FeaturePrefsStore.batch1901.v1910cracked
    FeaturePrefsStore.batch1901.v1910cracked = !current
    AppToast.show(this, "cracked: ${if (!current) "ON" else "OFF"}")
}

// v1910: crafted mode
internal fun PlayerActivity.showV1910CraftedToggle() {
    val current = FeaturePrefsStore.batch1901.v1910crafted
    FeaturePrefsStore.batch1901.v1910crafted = !current
    AppToast.show(this, "crafted: ${if (!current) "ON" else "OFF"}")
}

// v1910: crashed level
internal fun PlayerActivity.showV1910CrashedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1910crashed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crashed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1910crashed = value
        AppToast.show(this, "crashed: $value")
    }
}

// v1910: created level
internal fun PlayerActivity.showV1910CreatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1910created).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "created level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1910created = value
        AppToast.show(this, "created: $value")
    }
}

// v1910: creeping level
internal fun PlayerActivity.showV1910CreepingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1910creeping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "creeping level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1910creeping = value
        AppToast.show(this, "creeping: $value")
    }
}

// v1910: crewed level
internal fun PlayerActivity.showV1910CrewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1910crewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1910crewed = value
        AppToast.show(this, "crewed: $value")
    }
}

// v1910: crossed level
internal fun PlayerActivity.showV1910CrossedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1901.v1910crossed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "crossed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1901.v1910crossed = value
        AppToast.show(this, "crossed: $value")
    }
}

// v1910: crushed mode
internal fun PlayerActivity.showV1910CrushedToggle() {
    val current = FeaturePrefsStore.batch1901.v1910crushed
    FeaturePrefsStore.batch1901.v1910crushed = !current
    AppToast.show(this, "crushed: ${if (!current) "ON" else "OFF"}")
}

// v1910: cured mode
internal fun PlayerActivity.showV1910CuredToggle() {
    val current = FeaturePrefsStore.batch1901.v1910cured
    FeaturePrefsStore.batch1901.v1910cured = !current
    AppToast.show(this, "cured: ${if (!current) "ON" else "OFF"}")
}

// v1910: curved mode
internal fun PlayerActivity.showV1910CurvedToggle() {
    val current = FeaturePrefsStore.batch1901.v1910curved
    FeaturePrefsStore.batch1901.v1910curved = !current
    AppToast.show(this, "curved: ${if (!current) "ON" else "OFF"}")
}

// v1910: cutting mode
internal fun PlayerActivity.showV1910CuttingToggle() {
    val current = FeaturePrefsStore.batch1901.v1910cutting
    FeaturePrefsStore.batch1901.v1910cutting = !current
    AppToast.show(this, "cutting: ${if (!current) "ON" else "OFF"}")
}

// v1910: cycling mode
internal fun PlayerActivity.showV1910CyclingToggle() {
    val current = FeaturePrefsStore.batch1901.v1910cycling
    FeaturePrefsStore.batch1901.v1910cycling = !current
    AppToast.show(this, "cycling: ${if (!current) "ON" else "OFF"}")
}

// v1911: damaged mode
internal fun PlayerActivity.showV1911DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911damaged
    FeaturePrefsStore.batch1911.v1911damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1911: dancing mode
internal fun PlayerActivity.showV1911DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1911dancing
    FeaturePrefsStore.batch1911.v1911dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1911: dared mode
internal fun PlayerActivity.showV1911DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1911dared
    FeaturePrefsStore.batch1911.v1911dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1911: darkened mode
internal fun PlayerActivity.showV1911DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911darkened
    FeaturePrefsStore.batch1911.v1911darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1911: dashed mode
internal fun PlayerActivity.showV1911DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911dashed
    FeaturePrefsStore.batch1911.v1911dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1911: dated level
internal fun PlayerActivity.showV1911DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1911: dealt level
internal fun PlayerActivity.showV1911DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1911: debated level
internal fun PlayerActivity.showV1911DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1911: decayed level
internal fun PlayerActivity.showV1911DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1911: deceived level
internal fun PlayerActivity.showV1911DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1911deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1911deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1911: decided mode
internal fun PlayerActivity.showV1911DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911decided
    FeaturePrefsStore.batch1911.v1911decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1911: declared mode
internal fun PlayerActivity.showV1911DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1911declared
    FeaturePrefsStore.batch1911.v1911declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1911: declined mode
internal fun PlayerActivity.showV1911DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911declined
    FeaturePrefsStore.batch1911.v1911declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1911: decoded mode
internal fun PlayerActivity.showV1911DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911decoded
    FeaturePrefsStore.batch1911.v1911decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1911: decreased mode
internal fun PlayerActivity.showV1911DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1911decreased
    FeaturePrefsStore.batch1911.v1911decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1912: damaged mode
internal fun PlayerActivity.showV1912DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912damaged
    FeaturePrefsStore.batch1911.v1912damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1912: dancing mode
internal fun PlayerActivity.showV1912DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1912dancing
    FeaturePrefsStore.batch1911.v1912dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1912: dared mode
internal fun PlayerActivity.showV1912DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1912dared
    FeaturePrefsStore.batch1911.v1912dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1912: darkened mode
internal fun PlayerActivity.showV1912DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912darkened
    FeaturePrefsStore.batch1911.v1912darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1912: dashed mode
internal fun PlayerActivity.showV1912DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912dashed
    FeaturePrefsStore.batch1911.v1912dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1912: dated level
internal fun PlayerActivity.showV1912DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1912: dealt level
internal fun PlayerActivity.showV1912DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1912: debated level
internal fun PlayerActivity.showV1912DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1912: decayed level
internal fun PlayerActivity.showV1912DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1912: deceived level
internal fun PlayerActivity.showV1912DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1912deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1912deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1912: decided mode
internal fun PlayerActivity.showV1912DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912decided
    FeaturePrefsStore.batch1911.v1912decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1912: declared mode
internal fun PlayerActivity.showV1912DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1912declared
    FeaturePrefsStore.batch1911.v1912declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1912: declined mode
internal fun PlayerActivity.showV1912DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912declined
    FeaturePrefsStore.batch1911.v1912declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1912: decoded mode
internal fun PlayerActivity.showV1912DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912decoded
    FeaturePrefsStore.batch1911.v1912decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1912: decreased mode
internal fun PlayerActivity.showV1912DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1912decreased
    FeaturePrefsStore.batch1911.v1912decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1913: damaged mode
internal fun PlayerActivity.showV1913DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913damaged
    FeaturePrefsStore.batch1911.v1913damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1913: dancing mode
internal fun PlayerActivity.showV1913DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1913dancing
    FeaturePrefsStore.batch1911.v1913dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1913: dared mode
internal fun PlayerActivity.showV1913DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1913dared
    FeaturePrefsStore.batch1911.v1913dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1913: darkened mode
internal fun PlayerActivity.showV1913DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913darkened
    FeaturePrefsStore.batch1911.v1913darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1913: dashed mode
internal fun PlayerActivity.showV1913DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913dashed
    FeaturePrefsStore.batch1911.v1913dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1913: dated level
internal fun PlayerActivity.showV1913DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1913: dealt level
internal fun PlayerActivity.showV1913DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1913: debated level
internal fun PlayerActivity.showV1913DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1913: decayed level
internal fun PlayerActivity.showV1913DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1913: deceived level
internal fun PlayerActivity.showV1913DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1913deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1913deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1913: decided mode
internal fun PlayerActivity.showV1913DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913decided
    FeaturePrefsStore.batch1911.v1913decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1913: declared mode
internal fun PlayerActivity.showV1913DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1913declared
    FeaturePrefsStore.batch1911.v1913declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1913: declined mode
internal fun PlayerActivity.showV1913DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913declined
    FeaturePrefsStore.batch1911.v1913declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1913: decoded mode
internal fun PlayerActivity.showV1913DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913decoded
    FeaturePrefsStore.batch1911.v1913decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1913: decreased mode
internal fun PlayerActivity.showV1913DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1913decreased
    FeaturePrefsStore.batch1911.v1913decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1914: damaged mode
internal fun PlayerActivity.showV1914DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914damaged
    FeaturePrefsStore.batch1911.v1914damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1914: dancing mode
internal fun PlayerActivity.showV1914DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1914dancing
    FeaturePrefsStore.batch1911.v1914dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1914: dared mode
internal fun PlayerActivity.showV1914DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1914dared
    FeaturePrefsStore.batch1911.v1914dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1914: darkened mode
internal fun PlayerActivity.showV1914DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914darkened
    FeaturePrefsStore.batch1911.v1914darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1914: dashed mode
internal fun PlayerActivity.showV1914DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914dashed
    FeaturePrefsStore.batch1911.v1914dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1914: dated level
internal fun PlayerActivity.showV1914DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1914: dealt level
internal fun PlayerActivity.showV1914DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1914: debated level
internal fun PlayerActivity.showV1914DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1914: decayed level
internal fun PlayerActivity.showV1914DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1914: deceived level
internal fun PlayerActivity.showV1914DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1914deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1914deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1914: decided mode
internal fun PlayerActivity.showV1914DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914decided
    FeaturePrefsStore.batch1911.v1914decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1914: declared mode
internal fun PlayerActivity.showV1914DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1914declared
    FeaturePrefsStore.batch1911.v1914declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1914: declined mode
internal fun PlayerActivity.showV1914DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914declined
    FeaturePrefsStore.batch1911.v1914declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1914: decoded mode
internal fun PlayerActivity.showV1914DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914decoded
    FeaturePrefsStore.batch1911.v1914decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1914: decreased mode
internal fun PlayerActivity.showV1914DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1914decreased
    FeaturePrefsStore.batch1911.v1914decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1915: damaged mode
internal fun PlayerActivity.showV1915DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915damaged
    FeaturePrefsStore.batch1911.v1915damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1915: dancing mode
internal fun PlayerActivity.showV1915DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1915dancing
    FeaturePrefsStore.batch1911.v1915dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1915: dared mode
internal fun PlayerActivity.showV1915DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1915dared
    FeaturePrefsStore.batch1911.v1915dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1915: darkened mode
internal fun PlayerActivity.showV1915DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915darkened
    FeaturePrefsStore.batch1911.v1915darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1915: dashed mode
internal fun PlayerActivity.showV1915DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915dashed
    FeaturePrefsStore.batch1911.v1915dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1915: dated level
internal fun PlayerActivity.showV1915DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1915: dealt level
internal fun PlayerActivity.showV1915DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1915: debated level
internal fun PlayerActivity.showV1915DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1915: decayed level
internal fun PlayerActivity.showV1915DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1915: deceived level
internal fun PlayerActivity.showV1915DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1915deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1915deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1915: decided mode
internal fun PlayerActivity.showV1915DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915decided
    FeaturePrefsStore.batch1911.v1915decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1915: declared mode
internal fun PlayerActivity.showV1915DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1915declared
    FeaturePrefsStore.batch1911.v1915declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1915: declined mode
internal fun PlayerActivity.showV1915DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915declined
    FeaturePrefsStore.batch1911.v1915declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1915: decoded mode
internal fun PlayerActivity.showV1915DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915decoded
    FeaturePrefsStore.batch1911.v1915decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1915: decreased mode
internal fun PlayerActivity.showV1915DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1915decreased
    FeaturePrefsStore.batch1911.v1915decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1916: damaged mode
internal fun PlayerActivity.showV1916DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916damaged
    FeaturePrefsStore.batch1911.v1916damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1916: dancing mode
internal fun PlayerActivity.showV1916DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1916dancing
    FeaturePrefsStore.batch1911.v1916dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1916: dared mode
internal fun PlayerActivity.showV1916DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1916dared
    FeaturePrefsStore.batch1911.v1916dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1916: darkened mode
internal fun PlayerActivity.showV1916DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916darkened
    FeaturePrefsStore.batch1911.v1916darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1916: dashed mode
internal fun PlayerActivity.showV1916DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916dashed
    FeaturePrefsStore.batch1911.v1916dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1916: dated level
internal fun PlayerActivity.showV1916DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1916: dealt level
internal fun PlayerActivity.showV1916DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1916: debated level
internal fun PlayerActivity.showV1916DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1916: decayed level
internal fun PlayerActivity.showV1916DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1916: deceived level
internal fun PlayerActivity.showV1916DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1916deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1916deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1916: decided mode
internal fun PlayerActivity.showV1916DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916decided
    FeaturePrefsStore.batch1911.v1916decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1916: declared mode
internal fun PlayerActivity.showV1916DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1916declared
    FeaturePrefsStore.batch1911.v1916declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1916: declined mode
internal fun PlayerActivity.showV1916DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916declined
    FeaturePrefsStore.batch1911.v1916declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1916: decoded mode
internal fun PlayerActivity.showV1916DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916decoded
    FeaturePrefsStore.batch1911.v1916decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1916: decreased mode
internal fun PlayerActivity.showV1916DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1916decreased
    FeaturePrefsStore.batch1911.v1916decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1917: damaged mode
internal fun PlayerActivity.showV1917DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917damaged
    FeaturePrefsStore.batch1911.v1917damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1917: dancing mode
internal fun PlayerActivity.showV1917DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1917dancing
    FeaturePrefsStore.batch1911.v1917dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1917: dared mode
internal fun PlayerActivity.showV1917DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1917dared
    FeaturePrefsStore.batch1911.v1917dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1917: darkened mode
internal fun PlayerActivity.showV1917DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917darkened
    FeaturePrefsStore.batch1911.v1917darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1917: dashed mode
internal fun PlayerActivity.showV1917DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917dashed
    FeaturePrefsStore.batch1911.v1917dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1917: dated level
internal fun PlayerActivity.showV1917DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1917: dealt level
internal fun PlayerActivity.showV1917DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1917: debated level
internal fun PlayerActivity.showV1917DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1917: decayed level
internal fun PlayerActivity.showV1917DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1917: deceived level
internal fun PlayerActivity.showV1917DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1917deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1917deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1917: decided mode
internal fun PlayerActivity.showV1917DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917decided
    FeaturePrefsStore.batch1911.v1917decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1917: declared mode
internal fun PlayerActivity.showV1917DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1917declared
    FeaturePrefsStore.batch1911.v1917declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1917: declined mode
internal fun PlayerActivity.showV1917DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917declined
    FeaturePrefsStore.batch1911.v1917declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1917: decoded mode
internal fun PlayerActivity.showV1917DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917decoded
    FeaturePrefsStore.batch1911.v1917decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1917: decreased mode
internal fun PlayerActivity.showV1917DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1917decreased
    FeaturePrefsStore.batch1911.v1917decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1918: damaged mode
internal fun PlayerActivity.showV1918DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918damaged
    FeaturePrefsStore.batch1911.v1918damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1918: dancing mode
internal fun PlayerActivity.showV1918DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1918dancing
    FeaturePrefsStore.batch1911.v1918dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1918: dared mode
internal fun PlayerActivity.showV1918DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1918dared
    FeaturePrefsStore.batch1911.v1918dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1918: darkened mode
internal fun PlayerActivity.showV1918DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918darkened
    FeaturePrefsStore.batch1911.v1918darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1918: dashed mode
internal fun PlayerActivity.showV1918DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918dashed
    FeaturePrefsStore.batch1911.v1918dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1918: dated level
internal fun PlayerActivity.showV1918DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1918: dealt level
internal fun PlayerActivity.showV1918DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1918: debated level
internal fun PlayerActivity.showV1918DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1918: decayed level
internal fun PlayerActivity.showV1918DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1918: deceived level
internal fun PlayerActivity.showV1918DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1918deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1918deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1918: decided mode
internal fun PlayerActivity.showV1918DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918decided
    FeaturePrefsStore.batch1911.v1918decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1918: declared mode
internal fun PlayerActivity.showV1918DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1918declared
    FeaturePrefsStore.batch1911.v1918declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1918: declined mode
internal fun PlayerActivity.showV1918DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918declined
    FeaturePrefsStore.batch1911.v1918declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1918: decoded mode
internal fun PlayerActivity.showV1918DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918decoded
    FeaturePrefsStore.batch1911.v1918decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1918: decreased mode
internal fun PlayerActivity.showV1918DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1918decreased
    FeaturePrefsStore.batch1911.v1918decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1919: damaged mode
internal fun PlayerActivity.showV1919DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919damaged
    FeaturePrefsStore.batch1911.v1919damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1919: dancing mode
internal fun PlayerActivity.showV1919DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1919dancing
    FeaturePrefsStore.batch1911.v1919dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1919: dared mode
internal fun PlayerActivity.showV1919DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1919dared
    FeaturePrefsStore.batch1911.v1919dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1919: darkened mode
internal fun PlayerActivity.showV1919DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919darkened
    FeaturePrefsStore.batch1911.v1919darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1919: dashed mode
internal fun PlayerActivity.showV1919DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919dashed
    FeaturePrefsStore.batch1911.v1919dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1919: dated level
internal fun PlayerActivity.showV1919DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1919: dealt level
internal fun PlayerActivity.showV1919DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1919: debated level
internal fun PlayerActivity.showV1919DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1919: decayed level
internal fun PlayerActivity.showV1919DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1919: deceived level
internal fun PlayerActivity.showV1919DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1919deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1919deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1919: decided mode
internal fun PlayerActivity.showV1919DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919decided
    FeaturePrefsStore.batch1911.v1919decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1919: declared mode
internal fun PlayerActivity.showV1919DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1919declared
    FeaturePrefsStore.batch1911.v1919declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1919: declined mode
internal fun PlayerActivity.showV1919DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919declined
    FeaturePrefsStore.batch1911.v1919declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1919: decoded mode
internal fun PlayerActivity.showV1919DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919decoded
    FeaturePrefsStore.batch1911.v1919decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1919: decreased mode
internal fun PlayerActivity.showV1919DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1919decreased
    FeaturePrefsStore.batch1911.v1919decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1920: damaged mode
internal fun PlayerActivity.showV1920DamagedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920damaged
    FeaturePrefsStore.batch1911.v1920damaged = !current
    AppToast.show(this, "damaged: ${if (!current) "ON" else "OFF"}")
}

// v1920: dancing mode
internal fun PlayerActivity.showV1920DancingToggle() {
    val current = FeaturePrefsStore.batch1911.v1920dancing
    FeaturePrefsStore.batch1911.v1920dancing = !current
    AppToast.show(this, "dancing: ${if (!current) "ON" else "OFF"}")
}

// v1920: dared mode
internal fun PlayerActivity.showV1920DaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1920dared
    FeaturePrefsStore.batch1911.v1920dared = !current
    AppToast.show(this, "dared: ${if (!current) "ON" else "OFF"}")
}

// v1920: darkened mode
internal fun PlayerActivity.showV1920DarkenedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920darkened
    FeaturePrefsStore.batch1911.v1920darkened = !current
    AppToast.show(this, "darkened: ${if (!current) "ON" else "OFF"}")
}

// v1920: dashed mode
internal fun PlayerActivity.showV1920DashedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920dashed
    FeaturePrefsStore.batch1911.v1920dashed = !current
    AppToast.show(this, "dashed: ${if (!current) "ON" else "OFF"}")
}

// v1920: dated level
internal fun PlayerActivity.showV1920DatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920dated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920dated = value
        AppToast.show(this, "dated: $value")
    }
}

// v1920: dealt level
internal fun PlayerActivity.showV1920DealtDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920dealt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dealt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920dealt = value
        AppToast.show(this, "dealt: $value")
    }
}

// v1920: debated level
internal fun PlayerActivity.showV1920DebatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920debated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "debated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920debated = value
        AppToast.show(this, "debated: $value")
    }
}

// v1920: decayed level
internal fun PlayerActivity.showV1920DecayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920decayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "decayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920decayed = value
        AppToast.show(this, "decayed: $value")
    }
}

// v1920: deceived level
internal fun PlayerActivity.showV1920DeceivedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1911.v1920deceived).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "deceived level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1911.v1920deceived = value
        AppToast.show(this, "deceived: $value")
    }
}

// v1920: decided mode
internal fun PlayerActivity.showV1920DecidedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920decided
    FeaturePrefsStore.batch1911.v1920decided = !current
    AppToast.show(this, "decided: ${if (!current) "ON" else "OFF"}")
}

// v1920: declared mode
internal fun PlayerActivity.showV1920DeclaredToggle() {
    val current = FeaturePrefsStore.batch1911.v1920declared
    FeaturePrefsStore.batch1911.v1920declared = !current
    AppToast.show(this, "declared: ${if (!current) "ON" else "OFF"}")
}

// v1920: declined mode
internal fun PlayerActivity.showV1920DeclinedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920declined
    FeaturePrefsStore.batch1911.v1920declined = !current
    AppToast.show(this, "declined: ${if (!current) "ON" else "OFF"}")
}

// v1920: decoded mode
internal fun PlayerActivity.showV1920DecodedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920decoded
    FeaturePrefsStore.batch1911.v1920decoded = !current
    AppToast.show(this, "decoded: ${if (!current) "ON" else "OFF"}")
}

// v1920: decreased mode
internal fun PlayerActivity.showV1920DecreasedToggle() {
    val current = FeaturePrefsStore.batch1911.v1920decreased
    FeaturePrefsStore.batch1911.v1920decreased = !current
    AppToast.show(this, "decreased: ${if (!current) "ON" else "OFF"}")
}

// v1921: dedicated mode
internal fun PlayerActivity.showV1921DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921dedicated
    FeaturePrefsStore.batch1921.v1921dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1921: deemed mode
internal fun PlayerActivity.showV1921DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921deemed
    FeaturePrefsStore.batch1921.v1921deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1921: deepened mode
internal fun PlayerActivity.showV1921DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921deepened
    FeaturePrefsStore.batch1921.v1921deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1921: defeated mode
internal fun PlayerActivity.showV1921DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921defeated
    FeaturePrefsStore.batch1921.v1921defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1921: defended mode
internal fun PlayerActivity.showV1921DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921defended
    FeaturePrefsStore.batch1921.v1921defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1921: defined level
internal fun PlayerActivity.showV1921DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1921defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1921defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1921: delayed level
internal fun PlayerActivity.showV1921DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1921delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1921delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1921: delegated level
internal fun PlayerActivity.showV1921DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1921delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1921delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1921: delivered level
internal fun PlayerActivity.showV1921DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1921delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1921delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1921: demonstrated level
internal fun PlayerActivity.showV1921DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1921demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1921demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1921: denied mode
internal fun PlayerActivity.showV1921DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921denied
    FeaturePrefsStore.batch1921.v1921denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1921: departed mode
internal fun PlayerActivity.showV1921DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921departed
    FeaturePrefsStore.batch1921.v1921departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1921: depicted mode
internal fun PlayerActivity.showV1921DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921depicted
    FeaturePrefsStore.batch1921.v1921depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1921: deployed mode
internal fun PlayerActivity.showV1921DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921deployed
    FeaturePrefsStore.batch1921.v1921deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1921: deposited mode
internal fun PlayerActivity.showV1921DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1921deposited
    FeaturePrefsStore.batch1921.v1921deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1922: dedicated mode
internal fun PlayerActivity.showV1922DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922dedicated
    FeaturePrefsStore.batch1921.v1922dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1922: deemed mode
internal fun PlayerActivity.showV1922DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922deemed
    FeaturePrefsStore.batch1921.v1922deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1922: deepened mode
internal fun PlayerActivity.showV1922DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922deepened
    FeaturePrefsStore.batch1921.v1922deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1922: defeated mode
internal fun PlayerActivity.showV1922DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922defeated
    FeaturePrefsStore.batch1921.v1922defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1922: defended mode
internal fun PlayerActivity.showV1922DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922defended
    FeaturePrefsStore.batch1921.v1922defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1922: defined level
internal fun PlayerActivity.showV1922DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1922defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1922defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1922: delayed level
internal fun PlayerActivity.showV1922DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1922delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1922delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1922: delegated level
internal fun PlayerActivity.showV1922DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1922delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1922delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1922: delivered level
internal fun PlayerActivity.showV1922DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1922delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1922delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1922: demonstrated level
internal fun PlayerActivity.showV1922DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1922demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1922demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1922: denied mode
internal fun PlayerActivity.showV1922DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922denied
    FeaturePrefsStore.batch1921.v1922denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1922: departed mode
internal fun PlayerActivity.showV1922DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922departed
    FeaturePrefsStore.batch1921.v1922departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1922: depicted mode
internal fun PlayerActivity.showV1922DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922depicted
    FeaturePrefsStore.batch1921.v1922depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1922: deployed mode
internal fun PlayerActivity.showV1922DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922deployed
    FeaturePrefsStore.batch1921.v1922deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1922: deposited mode
internal fun PlayerActivity.showV1922DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1922deposited
    FeaturePrefsStore.batch1921.v1922deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1923: dedicated mode
internal fun PlayerActivity.showV1923DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923dedicated
    FeaturePrefsStore.batch1921.v1923dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1923: deemed mode
internal fun PlayerActivity.showV1923DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923deemed
    FeaturePrefsStore.batch1921.v1923deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1923: deepened mode
internal fun PlayerActivity.showV1923DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923deepened
    FeaturePrefsStore.batch1921.v1923deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1923: defeated mode
internal fun PlayerActivity.showV1923DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923defeated
    FeaturePrefsStore.batch1921.v1923defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1923: defended mode
internal fun PlayerActivity.showV1923DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923defended
    FeaturePrefsStore.batch1921.v1923defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1923: defined level
internal fun PlayerActivity.showV1923DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1923defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1923defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1923: delayed level
internal fun PlayerActivity.showV1923DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1923delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1923delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1923: delegated level
internal fun PlayerActivity.showV1923DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1923delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1923delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1923: delivered level
internal fun PlayerActivity.showV1923DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1923delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1923delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1923: demonstrated level
internal fun PlayerActivity.showV1923DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1923demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1923demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1923: denied mode
internal fun PlayerActivity.showV1923DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923denied
    FeaturePrefsStore.batch1921.v1923denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1923: departed mode
internal fun PlayerActivity.showV1923DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923departed
    FeaturePrefsStore.batch1921.v1923departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1923: depicted mode
internal fun PlayerActivity.showV1923DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923depicted
    FeaturePrefsStore.batch1921.v1923depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1923: deployed mode
internal fun PlayerActivity.showV1923DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923deployed
    FeaturePrefsStore.batch1921.v1923deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1923: deposited mode
internal fun PlayerActivity.showV1923DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1923deposited
    FeaturePrefsStore.batch1921.v1923deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1924: dedicated mode
internal fun PlayerActivity.showV1924DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924dedicated
    FeaturePrefsStore.batch1921.v1924dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1924: deemed mode
internal fun PlayerActivity.showV1924DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924deemed
    FeaturePrefsStore.batch1921.v1924deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1924: deepened mode
internal fun PlayerActivity.showV1924DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924deepened
    FeaturePrefsStore.batch1921.v1924deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1924: defeated mode
internal fun PlayerActivity.showV1924DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924defeated
    FeaturePrefsStore.batch1921.v1924defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1924: defended mode
internal fun PlayerActivity.showV1924DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924defended
    FeaturePrefsStore.batch1921.v1924defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1924: defined level
internal fun PlayerActivity.showV1924DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1924defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1924defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1924: delayed level
internal fun PlayerActivity.showV1924DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1924delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1924delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1924: delegated level
internal fun PlayerActivity.showV1924DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1924delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1924delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1924: delivered level
internal fun PlayerActivity.showV1924DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1924delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1924delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1924: demonstrated level
internal fun PlayerActivity.showV1924DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1924demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1924demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1924: denied mode
internal fun PlayerActivity.showV1924DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924denied
    FeaturePrefsStore.batch1921.v1924denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1924: departed mode
internal fun PlayerActivity.showV1924DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924departed
    FeaturePrefsStore.batch1921.v1924departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1924: depicted mode
internal fun PlayerActivity.showV1924DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924depicted
    FeaturePrefsStore.batch1921.v1924depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1924: deployed mode
internal fun PlayerActivity.showV1924DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924deployed
    FeaturePrefsStore.batch1921.v1924deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1924: deposited mode
internal fun PlayerActivity.showV1924DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1924deposited
    FeaturePrefsStore.batch1921.v1924deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1925: dedicated mode
internal fun PlayerActivity.showV1925DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925dedicated
    FeaturePrefsStore.batch1921.v1925dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1925: deemed mode
internal fun PlayerActivity.showV1925DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925deemed
    FeaturePrefsStore.batch1921.v1925deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1925: deepened mode
internal fun PlayerActivity.showV1925DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925deepened
    FeaturePrefsStore.batch1921.v1925deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1925: defeated mode
internal fun PlayerActivity.showV1925DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925defeated
    FeaturePrefsStore.batch1921.v1925defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1925: defended mode
internal fun PlayerActivity.showV1925DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925defended
    FeaturePrefsStore.batch1921.v1925defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1925: defined level
internal fun PlayerActivity.showV1925DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1925defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1925defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1925: delayed level
internal fun PlayerActivity.showV1925DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1925delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1925delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1925: delegated level
internal fun PlayerActivity.showV1925DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1925delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1925delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1925: delivered level
internal fun PlayerActivity.showV1925DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1925delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1925delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1925: demonstrated level
internal fun PlayerActivity.showV1925DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1925demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1925demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1925: denied mode
internal fun PlayerActivity.showV1925DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925denied
    FeaturePrefsStore.batch1921.v1925denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1925: departed mode
internal fun PlayerActivity.showV1925DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925departed
    FeaturePrefsStore.batch1921.v1925departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1925: depicted mode
internal fun PlayerActivity.showV1925DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925depicted
    FeaturePrefsStore.batch1921.v1925depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1925: deployed mode
internal fun PlayerActivity.showV1925DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925deployed
    FeaturePrefsStore.batch1921.v1925deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1925: deposited mode
internal fun PlayerActivity.showV1925DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1925deposited
    FeaturePrefsStore.batch1921.v1925deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1926: dedicated mode
internal fun PlayerActivity.showV1926DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926dedicated
    FeaturePrefsStore.batch1921.v1926dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1926: deemed mode
internal fun PlayerActivity.showV1926DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926deemed
    FeaturePrefsStore.batch1921.v1926deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1926: deepened mode
internal fun PlayerActivity.showV1926DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926deepened
    FeaturePrefsStore.batch1921.v1926deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1926: defeated mode
internal fun PlayerActivity.showV1926DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926defeated
    FeaturePrefsStore.batch1921.v1926defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1926: defended mode
internal fun PlayerActivity.showV1926DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926defended
    FeaturePrefsStore.batch1921.v1926defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1926: defined level
internal fun PlayerActivity.showV1926DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1926defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1926defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1926: delayed level
internal fun PlayerActivity.showV1926DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1926delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1926delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1926: delegated level
internal fun PlayerActivity.showV1926DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1926delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1926delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1926: delivered level
internal fun PlayerActivity.showV1926DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1926delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1926delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1926: demonstrated level
internal fun PlayerActivity.showV1926DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1926demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1926demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1926: denied mode
internal fun PlayerActivity.showV1926DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926denied
    FeaturePrefsStore.batch1921.v1926denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1926: departed mode
internal fun PlayerActivity.showV1926DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926departed
    FeaturePrefsStore.batch1921.v1926departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1926: depicted mode
internal fun PlayerActivity.showV1926DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926depicted
    FeaturePrefsStore.batch1921.v1926depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1926: deployed mode
internal fun PlayerActivity.showV1926DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926deployed
    FeaturePrefsStore.batch1921.v1926deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1926: deposited mode
internal fun PlayerActivity.showV1926DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1926deposited
    FeaturePrefsStore.batch1921.v1926deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1927: dedicated mode
internal fun PlayerActivity.showV1927DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927dedicated
    FeaturePrefsStore.batch1921.v1927dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1927: deemed mode
internal fun PlayerActivity.showV1927DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927deemed
    FeaturePrefsStore.batch1921.v1927deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1927: deepened mode
internal fun PlayerActivity.showV1927DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927deepened
    FeaturePrefsStore.batch1921.v1927deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1927: defeated mode
internal fun PlayerActivity.showV1927DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927defeated
    FeaturePrefsStore.batch1921.v1927defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1927: defended mode
internal fun PlayerActivity.showV1927DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927defended
    FeaturePrefsStore.batch1921.v1927defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1927: defined level
internal fun PlayerActivity.showV1927DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1927defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1927defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1927: delayed level
internal fun PlayerActivity.showV1927DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1927delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1927delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1927: delegated level
internal fun PlayerActivity.showV1927DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1927delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1927delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1927: delivered level
internal fun PlayerActivity.showV1927DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1927delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1927delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1927: demonstrated level
internal fun PlayerActivity.showV1927DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1927demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1927demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1927: denied mode
internal fun PlayerActivity.showV1927DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927denied
    FeaturePrefsStore.batch1921.v1927denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1927: departed mode
internal fun PlayerActivity.showV1927DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927departed
    FeaturePrefsStore.batch1921.v1927departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1927: depicted mode
internal fun PlayerActivity.showV1927DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927depicted
    FeaturePrefsStore.batch1921.v1927depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1927: deployed mode
internal fun PlayerActivity.showV1927DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927deployed
    FeaturePrefsStore.batch1921.v1927deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1927: deposited mode
internal fun PlayerActivity.showV1927DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1927deposited
    FeaturePrefsStore.batch1921.v1927deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1928: dedicated mode
internal fun PlayerActivity.showV1928DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928dedicated
    FeaturePrefsStore.batch1921.v1928dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1928: deemed mode
internal fun PlayerActivity.showV1928DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928deemed
    FeaturePrefsStore.batch1921.v1928deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1928: deepened mode
internal fun PlayerActivity.showV1928DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928deepened
    FeaturePrefsStore.batch1921.v1928deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1928: defeated mode
internal fun PlayerActivity.showV1928DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928defeated
    FeaturePrefsStore.batch1921.v1928defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1928: defended mode
internal fun PlayerActivity.showV1928DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928defended
    FeaturePrefsStore.batch1921.v1928defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1928: defined level
internal fun PlayerActivity.showV1928DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1928defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1928defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1928: delayed level
internal fun PlayerActivity.showV1928DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1928delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1928delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1928: delegated level
internal fun PlayerActivity.showV1928DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1928delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1928delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1928: delivered level
internal fun PlayerActivity.showV1928DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1928delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1928delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1928: demonstrated level
internal fun PlayerActivity.showV1928DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1928demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1928demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1928: denied mode
internal fun PlayerActivity.showV1928DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928denied
    FeaturePrefsStore.batch1921.v1928denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1928: departed mode
internal fun PlayerActivity.showV1928DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928departed
    FeaturePrefsStore.batch1921.v1928departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1928: depicted mode
internal fun PlayerActivity.showV1928DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928depicted
    FeaturePrefsStore.batch1921.v1928depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1928: deployed mode
internal fun PlayerActivity.showV1928DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928deployed
    FeaturePrefsStore.batch1921.v1928deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1928: deposited mode
internal fun PlayerActivity.showV1928DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1928deposited
    FeaturePrefsStore.batch1921.v1928deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1929: dedicated mode
internal fun PlayerActivity.showV1929DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929dedicated
    FeaturePrefsStore.batch1921.v1929dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1929: deemed mode
internal fun PlayerActivity.showV1929DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929deemed
    FeaturePrefsStore.batch1921.v1929deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1929: deepened mode
internal fun PlayerActivity.showV1929DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929deepened
    FeaturePrefsStore.batch1921.v1929deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1929: defeated mode
internal fun PlayerActivity.showV1929DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929defeated
    FeaturePrefsStore.batch1921.v1929defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1929: defended mode
internal fun PlayerActivity.showV1929DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929defended
    FeaturePrefsStore.batch1921.v1929defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1929: defined level
internal fun PlayerActivity.showV1929DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1929defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1929defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1929: delayed level
internal fun PlayerActivity.showV1929DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1929delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1929delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1929: delegated level
internal fun PlayerActivity.showV1929DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1929delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1929delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1929: delivered level
internal fun PlayerActivity.showV1929DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1929delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1929delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1929: demonstrated level
internal fun PlayerActivity.showV1929DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1929demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1929demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1929: denied mode
internal fun PlayerActivity.showV1929DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929denied
    FeaturePrefsStore.batch1921.v1929denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1929: departed mode
internal fun PlayerActivity.showV1929DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929departed
    FeaturePrefsStore.batch1921.v1929departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1929: depicted mode
internal fun PlayerActivity.showV1929DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929depicted
    FeaturePrefsStore.batch1921.v1929depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1929: deployed mode
internal fun PlayerActivity.showV1929DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929deployed
    FeaturePrefsStore.batch1921.v1929deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1929: deposited mode
internal fun PlayerActivity.showV1929DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1929deposited
    FeaturePrefsStore.batch1921.v1929deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}

// v1930: dedicated mode
internal fun PlayerActivity.showV1930DedicatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930dedicated
    FeaturePrefsStore.batch1921.v1930dedicated = !current
    AppToast.show(this, "dedicated: ${if (!current) "ON" else "OFF"}")
}

// v1930: deemed mode
internal fun PlayerActivity.showV1930DeemedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930deemed
    FeaturePrefsStore.batch1921.v1930deemed = !current
    AppToast.show(this, "deemed: ${if (!current) "ON" else "OFF"}")
}

// v1930: deepened mode
internal fun PlayerActivity.showV1930DeepenedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930deepened
    FeaturePrefsStore.batch1921.v1930deepened = !current
    AppToast.show(this, "deepened: ${if (!current) "ON" else "OFF"}")
}

// v1930: defeated mode
internal fun PlayerActivity.showV1930DefeatedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930defeated
    FeaturePrefsStore.batch1921.v1930defeated = !current
    AppToast.show(this, "defeated: ${if (!current) "ON" else "OFF"}")
}

// v1930: defended mode
internal fun PlayerActivity.showV1930DefendedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930defended
    FeaturePrefsStore.batch1921.v1930defended = !current
    AppToast.show(this, "defended: ${if (!current) "ON" else "OFF"}")
}

// v1930: defined level
internal fun PlayerActivity.showV1930DefinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1930defined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "defined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1930defined = value
        AppToast.show(this, "defined: $value")
    }
}

// v1930: delayed level
internal fun PlayerActivity.showV1930DelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1930delayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1930delayed = value
        AppToast.show(this, "delayed: $value")
    }
}

// v1930: delegated level
internal fun PlayerActivity.showV1930DelegatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1930delegated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delegated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1930delegated = value
        AppToast.show(this, "delegated: $value")
    }
}

// v1930: delivered level
internal fun PlayerActivity.showV1930DeliveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1930delivered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delivered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1930delivered = value
        AppToast.show(this, "delivered: $value")
    }
}

// v1930: demonstrated level
internal fun PlayerActivity.showV1930DemonstratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1921.v1930demonstrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "demonstrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1921.v1930demonstrated = value
        AppToast.show(this, "demonstrated: $value")
    }
}

// v1930: denied mode
internal fun PlayerActivity.showV1930DeniedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930denied
    FeaturePrefsStore.batch1921.v1930denied = !current
    AppToast.show(this, "denied: ${if (!current) "ON" else "OFF"}")
}

// v1930: departed mode
internal fun PlayerActivity.showV1930DepartedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930departed
    FeaturePrefsStore.batch1921.v1930departed = !current
    AppToast.show(this, "departed: ${if (!current) "ON" else "OFF"}")
}

// v1930: depicted mode
internal fun PlayerActivity.showV1930DepictedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930depicted
    FeaturePrefsStore.batch1921.v1930depicted = !current
    AppToast.show(this, "depicted: ${if (!current) "ON" else "OFF"}")
}

// v1930: deployed mode
internal fun PlayerActivity.showV1930DeployedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930deployed
    FeaturePrefsStore.batch1921.v1930deployed = !current
    AppToast.show(this, "deployed: ${if (!current) "ON" else "OFF"}")
}

// v1930: deposited mode
internal fun PlayerActivity.showV1930DepositedToggle() {
    val current = FeaturePrefsStore.batch1921.v1930deposited
    FeaturePrefsStore.batch1921.v1930deposited = !current
    AppToast.show(this, "deposited: ${if (!current) "ON" else "OFF"}")
}
