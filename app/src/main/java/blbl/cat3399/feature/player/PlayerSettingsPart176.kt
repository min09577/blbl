package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1941: disagreed mode
internal fun PlayerActivity.showV1941DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941disagreed
    FeaturePrefsStore.batch1941.v1941disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1941: disappeared mode
internal fun PlayerActivity.showV1941DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941disappeared
    FeaturePrefsStore.batch1941.v1941disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1941: discharged mode
internal fun PlayerActivity.showV1941DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941discharged
    FeaturePrefsStore.batch1941.v1941discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1941: discovered mode
internal fun PlayerActivity.showV1941DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1941discovered
    FeaturePrefsStore.batch1941.v1941discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1941: discussed mode
internal fun PlayerActivity.showV1941DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941discussed
    FeaturePrefsStore.batch1941.v1941discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1941: dismissed level
internal fun PlayerActivity.showV1941DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1941: dispatched level
internal fun PlayerActivity.showV1941DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1941: displayed level
internal fun PlayerActivity.showV1941DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1941: disposed level
internal fun PlayerActivity.showV1941DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1941: disrupted level
internal fun PlayerActivity.showV1941DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1941disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1941disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1941: dissolved mode
internal fun PlayerActivity.showV1941DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941dissolved
    FeaturePrefsStore.batch1941.v1941dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1941: distinguished mode
internal fun PlayerActivity.showV1941DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941distinguished
    FeaturePrefsStore.batch1941.v1941distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1941: distributed mode
internal fun PlayerActivity.showV1941DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941distributed
    FeaturePrefsStore.batch1941.v1941distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1941: disturbed mode
internal fun PlayerActivity.showV1941DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941disturbed
    FeaturePrefsStore.batch1941.v1941disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1941: diversified mode
internal fun PlayerActivity.showV1941DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1941diversified
    FeaturePrefsStore.batch1941.v1941diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1942: disagreed mode
internal fun PlayerActivity.showV1942DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942disagreed
    FeaturePrefsStore.batch1941.v1942disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1942: disappeared mode
internal fun PlayerActivity.showV1942DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942disappeared
    FeaturePrefsStore.batch1941.v1942disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1942: discharged mode
internal fun PlayerActivity.showV1942DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942discharged
    FeaturePrefsStore.batch1941.v1942discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1942: discovered mode
internal fun PlayerActivity.showV1942DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1942discovered
    FeaturePrefsStore.batch1941.v1942discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1942: discussed mode
internal fun PlayerActivity.showV1942DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942discussed
    FeaturePrefsStore.batch1941.v1942discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1942: dismissed level
internal fun PlayerActivity.showV1942DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1942: dispatched level
internal fun PlayerActivity.showV1942DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1942: displayed level
internal fun PlayerActivity.showV1942DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1942: disposed level
internal fun PlayerActivity.showV1942DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1942: disrupted level
internal fun PlayerActivity.showV1942DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1942disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1942disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1942: dissolved mode
internal fun PlayerActivity.showV1942DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942dissolved
    FeaturePrefsStore.batch1941.v1942dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1942: distinguished mode
internal fun PlayerActivity.showV1942DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942distinguished
    FeaturePrefsStore.batch1941.v1942distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1942: distributed mode
internal fun PlayerActivity.showV1942DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942distributed
    FeaturePrefsStore.batch1941.v1942distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1942: disturbed mode
internal fun PlayerActivity.showV1942DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942disturbed
    FeaturePrefsStore.batch1941.v1942disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1942: diversified mode
internal fun PlayerActivity.showV1942DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1942diversified
    FeaturePrefsStore.batch1941.v1942diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1943: disagreed mode
internal fun PlayerActivity.showV1943DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943disagreed
    FeaturePrefsStore.batch1941.v1943disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1943: disappeared mode
internal fun PlayerActivity.showV1943DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943disappeared
    FeaturePrefsStore.batch1941.v1943disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1943: discharged mode
internal fun PlayerActivity.showV1943DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943discharged
    FeaturePrefsStore.batch1941.v1943discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1943: discovered mode
internal fun PlayerActivity.showV1943DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1943discovered
    FeaturePrefsStore.batch1941.v1943discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1943: discussed mode
internal fun PlayerActivity.showV1943DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943discussed
    FeaturePrefsStore.batch1941.v1943discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1943: dismissed level
internal fun PlayerActivity.showV1943DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1943: dispatched level
internal fun PlayerActivity.showV1943DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1943: displayed level
internal fun PlayerActivity.showV1943DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1943: disposed level
internal fun PlayerActivity.showV1943DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1943: disrupted level
internal fun PlayerActivity.showV1943DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1943disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1943disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1943: dissolved mode
internal fun PlayerActivity.showV1943DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943dissolved
    FeaturePrefsStore.batch1941.v1943dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1943: distinguished mode
internal fun PlayerActivity.showV1943DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943distinguished
    FeaturePrefsStore.batch1941.v1943distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1943: distributed mode
internal fun PlayerActivity.showV1943DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943distributed
    FeaturePrefsStore.batch1941.v1943distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1943: disturbed mode
internal fun PlayerActivity.showV1943DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943disturbed
    FeaturePrefsStore.batch1941.v1943disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1943: diversified mode
internal fun PlayerActivity.showV1943DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1943diversified
    FeaturePrefsStore.batch1941.v1943diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1944: disagreed mode
internal fun PlayerActivity.showV1944DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944disagreed
    FeaturePrefsStore.batch1941.v1944disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1944: disappeared mode
internal fun PlayerActivity.showV1944DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944disappeared
    FeaturePrefsStore.batch1941.v1944disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1944: discharged mode
internal fun PlayerActivity.showV1944DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944discharged
    FeaturePrefsStore.batch1941.v1944discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1944: discovered mode
internal fun PlayerActivity.showV1944DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1944discovered
    FeaturePrefsStore.batch1941.v1944discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1944: discussed mode
internal fun PlayerActivity.showV1944DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944discussed
    FeaturePrefsStore.batch1941.v1944discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1944: dismissed level
internal fun PlayerActivity.showV1944DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1944: dispatched level
internal fun PlayerActivity.showV1944DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1944: displayed level
internal fun PlayerActivity.showV1944DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1944: disposed level
internal fun PlayerActivity.showV1944DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1944: disrupted level
internal fun PlayerActivity.showV1944DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1944disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1944disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1944: dissolved mode
internal fun PlayerActivity.showV1944DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944dissolved
    FeaturePrefsStore.batch1941.v1944dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1944: distinguished mode
internal fun PlayerActivity.showV1944DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944distinguished
    FeaturePrefsStore.batch1941.v1944distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1944: distributed mode
internal fun PlayerActivity.showV1944DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944distributed
    FeaturePrefsStore.batch1941.v1944distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1944: disturbed mode
internal fun PlayerActivity.showV1944DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944disturbed
    FeaturePrefsStore.batch1941.v1944disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1944: diversified mode
internal fun PlayerActivity.showV1944DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1944diversified
    FeaturePrefsStore.batch1941.v1944diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1945: disagreed mode
internal fun PlayerActivity.showV1945DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945disagreed
    FeaturePrefsStore.batch1941.v1945disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1945: disappeared mode
internal fun PlayerActivity.showV1945DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945disappeared
    FeaturePrefsStore.batch1941.v1945disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1945: discharged mode
internal fun PlayerActivity.showV1945DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945discharged
    FeaturePrefsStore.batch1941.v1945discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1945: discovered mode
internal fun PlayerActivity.showV1945DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1945discovered
    FeaturePrefsStore.batch1941.v1945discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1945: discussed mode
internal fun PlayerActivity.showV1945DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945discussed
    FeaturePrefsStore.batch1941.v1945discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1945: dismissed level
internal fun PlayerActivity.showV1945DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1945: dispatched level
internal fun PlayerActivity.showV1945DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1945: displayed level
internal fun PlayerActivity.showV1945DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1945: disposed level
internal fun PlayerActivity.showV1945DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1945: disrupted level
internal fun PlayerActivity.showV1945DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1945disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1945disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1945: dissolved mode
internal fun PlayerActivity.showV1945DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945dissolved
    FeaturePrefsStore.batch1941.v1945dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1945: distinguished mode
internal fun PlayerActivity.showV1945DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945distinguished
    FeaturePrefsStore.batch1941.v1945distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1945: distributed mode
internal fun PlayerActivity.showV1945DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945distributed
    FeaturePrefsStore.batch1941.v1945distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1945: disturbed mode
internal fun PlayerActivity.showV1945DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945disturbed
    FeaturePrefsStore.batch1941.v1945disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1945: diversified mode
internal fun PlayerActivity.showV1945DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1945diversified
    FeaturePrefsStore.batch1941.v1945diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1946: disagreed mode
internal fun PlayerActivity.showV1946DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946disagreed
    FeaturePrefsStore.batch1941.v1946disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1946: disappeared mode
internal fun PlayerActivity.showV1946DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946disappeared
    FeaturePrefsStore.batch1941.v1946disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1946: discharged mode
internal fun PlayerActivity.showV1946DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946discharged
    FeaturePrefsStore.batch1941.v1946discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1946: discovered mode
internal fun PlayerActivity.showV1946DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1946discovered
    FeaturePrefsStore.batch1941.v1946discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1946: discussed mode
internal fun PlayerActivity.showV1946DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946discussed
    FeaturePrefsStore.batch1941.v1946discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1946: dismissed level
internal fun PlayerActivity.showV1946DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1946: dispatched level
internal fun PlayerActivity.showV1946DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1946: displayed level
internal fun PlayerActivity.showV1946DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1946: disposed level
internal fun PlayerActivity.showV1946DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1946: disrupted level
internal fun PlayerActivity.showV1946DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1946disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1946disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1946: dissolved mode
internal fun PlayerActivity.showV1946DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946dissolved
    FeaturePrefsStore.batch1941.v1946dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1946: distinguished mode
internal fun PlayerActivity.showV1946DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946distinguished
    FeaturePrefsStore.batch1941.v1946distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1946: distributed mode
internal fun PlayerActivity.showV1946DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946distributed
    FeaturePrefsStore.batch1941.v1946distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1946: disturbed mode
internal fun PlayerActivity.showV1946DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946disturbed
    FeaturePrefsStore.batch1941.v1946disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1946: diversified mode
internal fun PlayerActivity.showV1946DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1946diversified
    FeaturePrefsStore.batch1941.v1946diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1947: disagreed mode
internal fun PlayerActivity.showV1947DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947disagreed
    FeaturePrefsStore.batch1941.v1947disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1947: disappeared mode
internal fun PlayerActivity.showV1947DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947disappeared
    FeaturePrefsStore.batch1941.v1947disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1947: discharged mode
internal fun PlayerActivity.showV1947DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947discharged
    FeaturePrefsStore.batch1941.v1947discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1947: discovered mode
internal fun PlayerActivity.showV1947DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1947discovered
    FeaturePrefsStore.batch1941.v1947discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1947: discussed mode
internal fun PlayerActivity.showV1947DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947discussed
    FeaturePrefsStore.batch1941.v1947discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1947: dismissed level
internal fun PlayerActivity.showV1947DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1947: dispatched level
internal fun PlayerActivity.showV1947DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1947: displayed level
internal fun PlayerActivity.showV1947DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1947: disposed level
internal fun PlayerActivity.showV1947DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1947: disrupted level
internal fun PlayerActivity.showV1947DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1947disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1947disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1947: dissolved mode
internal fun PlayerActivity.showV1947DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947dissolved
    FeaturePrefsStore.batch1941.v1947dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1947: distinguished mode
internal fun PlayerActivity.showV1947DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947distinguished
    FeaturePrefsStore.batch1941.v1947distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1947: distributed mode
internal fun PlayerActivity.showV1947DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947distributed
    FeaturePrefsStore.batch1941.v1947distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1947: disturbed mode
internal fun PlayerActivity.showV1947DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947disturbed
    FeaturePrefsStore.batch1941.v1947disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1947: diversified mode
internal fun PlayerActivity.showV1947DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1947diversified
    FeaturePrefsStore.batch1941.v1947diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1948: disagreed mode
internal fun PlayerActivity.showV1948DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948disagreed
    FeaturePrefsStore.batch1941.v1948disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1948: disappeared mode
internal fun PlayerActivity.showV1948DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948disappeared
    FeaturePrefsStore.batch1941.v1948disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1948: discharged mode
internal fun PlayerActivity.showV1948DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948discharged
    FeaturePrefsStore.batch1941.v1948discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1948: discovered mode
internal fun PlayerActivity.showV1948DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1948discovered
    FeaturePrefsStore.batch1941.v1948discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1948: discussed mode
internal fun PlayerActivity.showV1948DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948discussed
    FeaturePrefsStore.batch1941.v1948discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1948: dismissed level
internal fun PlayerActivity.showV1948DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1948: dispatched level
internal fun PlayerActivity.showV1948DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1948: displayed level
internal fun PlayerActivity.showV1948DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1948: disposed level
internal fun PlayerActivity.showV1948DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1948: disrupted level
internal fun PlayerActivity.showV1948DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1948disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1948disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1948: dissolved mode
internal fun PlayerActivity.showV1948DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948dissolved
    FeaturePrefsStore.batch1941.v1948dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1948: distinguished mode
internal fun PlayerActivity.showV1948DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948distinguished
    FeaturePrefsStore.batch1941.v1948distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1948: distributed mode
internal fun PlayerActivity.showV1948DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948distributed
    FeaturePrefsStore.batch1941.v1948distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1948: disturbed mode
internal fun PlayerActivity.showV1948DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948disturbed
    FeaturePrefsStore.batch1941.v1948disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1948: diversified mode
internal fun PlayerActivity.showV1948DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1948diversified
    FeaturePrefsStore.batch1941.v1948diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1949: disagreed mode
internal fun PlayerActivity.showV1949DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949disagreed
    FeaturePrefsStore.batch1941.v1949disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1949: disappeared mode
internal fun PlayerActivity.showV1949DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949disappeared
    FeaturePrefsStore.batch1941.v1949disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1949: discharged mode
internal fun PlayerActivity.showV1949DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949discharged
    FeaturePrefsStore.batch1941.v1949discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1949: discovered mode
internal fun PlayerActivity.showV1949DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1949discovered
    FeaturePrefsStore.batch1941.v1949discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1949: discussed mode
internal fun PlayerActivity.showV1949DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949discussed
    FeaturePrefsStore.batch1941.v1949discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1949: dismissed level
internal fun PlayerActivity.showV1949DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1949: dispatched level
internal fun PlayerActivity.showV1949DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1949: displayed level
internal fun PlayerActivity.showV1949DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1949: disposed level
internal fun PlayerActivity.showV1949DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1949: disrupted level
internal fun PlayerActivity.showV1949DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1949disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1949disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1949: dissolved mode
internal fun PlayerActivity.showV1949DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949dissolved
    FeaturePrefsStore.batch1941.v1949dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1949: distinguished mode
internal fun PlayerActivity.showV1949DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949distinguished
    FeaturePrefsStore.batch1941.v1949distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1949: distributed mode
internal fun PlayerActivity.showV1949DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949distributed
    FeaturePrefsStore.batch1941.v1949distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1949: disturbed mode
internal fun PlayerActivity.showV1949DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949disturbed
    FeaturePrefsStore.batch1941.v1949disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1949: diversified mode
internal fun PlayerActivity.showV1949DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1949diversified
    FeaturePrefsStore.batch1941.v1949diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

// v1950: disagreed mode
internal fun PlayerActivity.showV1950DisagreedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950disagreed
    FeaturePrefsStore.batch1941.v1950disagreed = !current
    AppToast.show(this, "disagreed: ${if (!current) "ON" else "OFF"}")
}

// v1950: disappeared mode
internal fun PlayerActivity.showV1950DisappearedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950disappeared
    FeaturePrefsStore.batch1941.v1950disappeared = !current
    AppToast.show(this, "disappeared: ${if (!current) "ON" else "OFF"}")
}

// v1950: discharged mode
internal fun PlayerActivity.showV1950DischargedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950discharged
    FeaturePrefsStore.batch1941.v1950discharged = !current
    AppToast.show(this, "discharged: ${if (!current) "ON" else "OFF"}")
}

// v1950: discovered mode
internal fun PlayerActivity.showV1950DiscoveredToggle() {
    val current = FeaturePrefsStore.batch1941.v1950discovered
    FeaturePrefsStore.batch1941.v1950discovered = !current
    AppToast.show(this, "discovered: ${if (!current) "ON" else "OFF"}")
}

// v1950: discussed mode
internal fun PlayerActivity.showV1950DiscussedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950discussed
    FeaturePrefsStore.batch1941.v1950discussed = !current
    AppToast.show(this, "discussed: ${if (!current) "ON" else "OFF"}")
}

// v1950: dismissed level
internal fun PlayerActivity.showV1950DismissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950dismissed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dismissed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950dismissed = value
        AppToast.show(this, "dismissed: $value")
    }
}

// v1950: dispatched level
internal fun PlayerActivity.showV1950DispatchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950dispatched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispatched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950dispatched = value
        AppToast.show(this, "dispatched: $value")
    }
}

// v1950: displayed level
internal fun PlayerActivity.showV1950DisplayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950displayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "displayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950displayed = value
        AppToast.show(this, "displayed: $value")
    }
}

// v1950: disposed level
internal fun PlayerActivity.showV1950DisposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950disposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950disposed = value
        AppToast.show(this, "disposed: $value")
    }
}

// v1950: disrupted level
internal fun PlayerActivity.showV1950DisruptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1941.v1950disrupted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "disrupted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1941.v1950disrupted = value
        AppToast.show(this, "disrupted: $value")
    }
}

// v1950: dissolved mode
internal fun PlayerActivity.showV1950DissolvedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950dissolved
    FeaturePrefsStore.batch1941.v1950dissolved = !current
    AppToast.show(this, "dissolved: ${if (!current) "ON" else "OFF"}")
}

// v1950: distinguished mode
internal fun PlayerActivity.showV1950DistinguishedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950distinguished
    FeaturePrefsStore.batch1941.v1950distinguished = !current
    AppToast.show(this, "distinguished: ${if (!current) "ON" else "OFF"}")
}

// v1950: distributed mode
internal fun PlayerActivity.showV1950DistributedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950distributed
    FeaturePrefsStore.batch1941.v1950distributed = !current
    AppToast.show(this, "distributed: ${if (!current) "ON" else "OFF"}")
}

// v1950: disturbed mode
internal fun PlayerActivity.showV1950DisturbedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950disturbed
    FeaturePrefsStore.batch1941.v1950disturbed = !current
    AppToast.show(this, "disturbed: ${if (!current) "ON" else "OFF"}")
}

// v1950: diversified mode
internal fun PlayerActivity.showV1950DiversifiedToggle() {
    val current = FeaturePrefsStore.batch1941.v1950diversified
    FeaturePrefsStore.batch1941.v1950diversified = !current
    AppToast.show(this, "diversified: ${if (!current) "ON" else "OFF"}")
}

