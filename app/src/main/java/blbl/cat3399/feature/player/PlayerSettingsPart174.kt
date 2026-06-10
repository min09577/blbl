package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



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

