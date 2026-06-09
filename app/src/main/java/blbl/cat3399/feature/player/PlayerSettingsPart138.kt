package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1561: inflict mode
internal fun PlayerActivity.showV1561InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inflict
    FeaturePrefsStore.batch1561.v1561inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1561: inform mode
internal fun PlayerActivity.showV1561InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inform
    FeaturePrefsStore.batch1561.v1561inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1561: initial mode
internal fun PlayerActivity.showV1561InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1561initial
    FeaturePrefsStore.batch1561.v1561initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1561: inject mode
internal fun PlayerActivity.showV1561InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inject
    FeaturePrefsStore.batch1561.v1561inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1561: inmate mode
internal fun PlayerActivity.showV1561InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1561inmate
    FeaturePrefsStore.batch1561.v1561inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1561: inner level
internal fun PlayerActivity.showV1561InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1561: innocent level
internal fun PlayerActivity.showV1561InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1561: inquiry level
internal fun PlayerActivity.showV1561InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1561: insight level
internal fun PlayerActivity.showV1561InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1561: inspire level
internal fun PlayerActivity.showV1561InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1561inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1561inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1561: intact mode
internal fun PlayerActivity.showV1561IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1561intact
    FeaturePrefsStore.batch1561.v1561intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1561: interest mode
internal fun PlayerActivity.showV1561InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1561interest
    FeaturePrefsStore.batch1561.v1561interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1561: into mode
internal fun PlayerActivity.showV1561IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1561into
    FeaturePrefsStore.batch1561.v1561into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1561: invest mode
internal fun PlayerActivity.showV1561InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1561invest
    FeaturePrefsStore.batch1561.v1561invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1561: invite mode
internal fun PlayerActivity.showV1561InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1561invite
    FeaturePrefsStore.batch1561.v1561invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1562: inflict mode
internal fun PlayerActivity.showV1562InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inflict
    FeaturePrefsStore.batch1561.v1562inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1562: inform mode
internal fun PlayerActivity.showV1562InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inform
    FeaturePrefsStore.batch1561.v1562inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1562: initial mode
internal fun PlayerActivity.showV1562InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1562initial
    FeaturePrefsStore.batch1561.v1562initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1562: inject mode
internal fun PlayerActivity.showV1562InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inject
    FeaturePrefsStore.batch1561.v1562inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1562: inmate mode
internal fun PlayerActivity.showV1562InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1562inmate
    FeaturePrefsStore.batch1561.v1562inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1562: inner level
internal fun PlayerActivity.showV1562InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1562: innocent level
internal fun PlayerActivity.showV1562InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1562: inquiry level
internal fun PlayerActivity.showV1562InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1562: insight level
internal fun PlayerActivity.showV1562InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1562: inspire level
internal fun PlayerActivity.showV1562InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1562inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1562inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1562: intact mode
internal fun PlayerActivity.showV1562IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1562intact
    FeaturePrefsStore.batch1561.v1562intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1562: interest mode
internal fun PlayerActivity.showV1562InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1562interest
    FeaturePrefsStore.batch1561.v1562interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1562: into mode
internal fun PlayerActivity.showV1562IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1562into
    FeaturePrefsStore.batch1561.v1562into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1562: invest mode
internal fun PlayerActivity.showV1562InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1562invest
    FeaturePrefsStore.batch1561.v1562invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1562: invite mode
internal fun PlayerActivity.showV1562InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1562invite
    FeaturePrefsStore.batch1561.v1562invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1563: inflict mode
internal fun PlayerActivity.showV1563InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inflict
    FeaturePrefsStore.batch1561.v1563inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1563: inform mode
internal fun PlayerActivity.showV1563InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inform
    FeaturePrefsStore.batch1561.v1563inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1563: initial mode
internal fun PlayerActivity.showV1563InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1563initial
    FeaturePrefsStore.batch1561.v1563initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1563: inject mode
internal fun PlayerActivity.showV1563InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inject
    FeaturePrefsStore.batch1561.v1563inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1563: inmate mode
internal fun PlayerActivity.showV1563InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1563inmate
    FeaturePrefsStore.batch1561.v1563inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1563: inner level
internal fun PlayerActivity.showV1563InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1563: innocent level
internal fun PlayerActivity.showV1563InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1563: inquiry level
internal fun PlayerActivity.showV1563InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1563: insight level
internal fun PlayerActivity.showV1563InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1563: inspire level
internal fun PlayerActivity.showV1563InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1563inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1563inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1563: intact mode
internal fun PlayerActivity.showV1563IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1563intact
    FeaturePrefsStore.batch1561.v1563intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1563: interest mode
internal fun PlayerActivity.showV1563InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1563interest
    FeaturePrefsStore.batch1561.v1563interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1563: into mode
internal fun PlayerActivity.showV1563IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1563into
    FeaturePrefsStore.batch1561.v1563into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1563: invest mode
internal fun PlayerActivity.showV1563InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1563invest
    FeaturePrefsStore.batch1561.v1563invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1563: invite mode
internal fun PlayerActivity.showV1563InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1563invite
    FeaturePrefsStore.batch1561.v1563invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1564: inflict mode
internal fun PlayerActivity.showV1564InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inflict
    FeaturePrefsStore.batch1561.v1564inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1564: inform mode
internal fun PlayerActivity.showV1564InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inform
    FeaturePrefsStore.batch1561.v1564inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1564: initial mode
internal fun PlayerActivity.showV1564InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1564initial
    FeaturePrefsStore.batch1561.v1564initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1564: inject mode
internal fun PlayerActivity.showV1564InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inject
    FeaturePrefsStore.batch1561.v1564inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1564: inmate mode
internal fun PlayerActivity.showV1564InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1564inmate
    FeaturePrefsStore.batch1561.v1564inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1564: inner level
internal fun PlayerActivity.showV1564InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1564: innocent level
internal fun PlayerActivity.showV1564InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1564: inquiry level
internal fun PlayerActivity.showV1564InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1564: insight level
internal fun PlayerActivity.showV1564InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1564: inspire level
internal fun PlayerActivity.showV1564InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1564inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1564inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1564: intact mode
internal fun PlayerActivity.showV1564IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1564intact
    FeaturePrefsStore.batch1561.v1564intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1564: interest mode
internal fun PlayerActivity.showV1564InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1564interest
    FeaturePrefsStore.batch1561.v1564interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1564: into mode
internal fun PlayerActivity.showV1564IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1564into
    FeaturePrefsStore.batch1561.v1564into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1564: invest mode
internal fun PlayerActivity.showV1564InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1564invest
    FeaturePrefsStore.batch1561.v1564invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1564: invite mode
internal fun PlayerActivity.showV1564InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1564invite
    FeaturePrefsStore.batch1561.v1564invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1565: inflict mode
internal fun PlayerActivity.showV1565InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inflict
    FeaturePrefsStore.batch1561.v1565inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1565: inform mode
internal fun PlayerActivity.showV1565InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inform
    FeaturePrefsStore.batch1561.v1565inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1565: initial mode
internal fun PlayerActivity.showV1565InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1565initial
    FeaturePrefsStore.batch1561.v1565initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1565: inject mode
internal fun PlayerActivity.showV1565InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inject
    FeaturePrefsStore.batch1561.v1565inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1565: inmate mode
internal fun PlayerActivity.showV1565InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1565inmate
    FeaturePrefsStore.batch1561.v1565inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1565: inner level
internal fun PlayerActivity.showV1565InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1565: innocent level
internal fun PlayerActivity.showV1565InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1565: inquiry level
internal fun PlayerActivity.showV1565InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1565: insight level
internal fun PlayerActivity.showV1565InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1565: inspire level
internal fun PlayerActivity.showV1565InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1565inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1565inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1565: intact mode
internal fun PlayerActivity.showV1565IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1565intact
    FeaturePrefsStore.batch1561.v1565intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1565: interest mode
internal fun PlayerActivity.showV1565InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1565interest
    FeaturePrefsStore.batch1561.v1565interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1565: into mode
internal fun PlayerActivity.showV1565IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1565into
    FeaturePrefsStore.batch1561.v1565into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1565: invest mode
internal fun PlayerActivity.showV1565InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1565invest
    FeaturePrefsStore.batch1561.v1565invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1565: invite mode
internal fun PlayerActivity.showV1565InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1565invite
    FeaturePrefsStore.batch1561.v1565invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1566: inflict mode
internal fun PlayerActivity.showV1566InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inflict
    FeaturePrefsStore.batch1561.v1566inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1566: inform mode
internal fun PlayerActivity.showV1566InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inform
    FeaturePrefsStore.batch1561.v1566inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1566: initial mode
internal fun PlayerActivity.showV1566InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1566initial
    FeaturePrefsStore.batch1561.v1566initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1566: inject mode
internal fun PlayerActivity.showV1566InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inject
    FeaturePrefsStore.batch1561.v1566inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1566: inmate mode
internal fun PlayerActivity.showV1566InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1566inmate
    FeaturePrefsStore.batch1561.v1566inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1566: inner level
internal fun PlayerActivity.showV1566InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1566: innocent level
internal fun PlayerActivity.showV1566InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1566: inquiry level
internal fun PlayerActivity.showV1566InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1566: insight level
internal fun PlayerActivity.showV1566InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1566: inspire level
internal fun PlayerActivity.showV1566InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1566inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1566inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1566: intact mode
internal fun PlayerActivity.showV1566IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1566intact
    FeaturePrefsStore.batch1561.v1566intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1566: interest mode
internal fun PlayerActivity.showV1566InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1566interest
    FeaturePrefsStore.batch1561.v1566interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1566: into mode
internal fun PlayerActivity.showV1566IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1566into
    FeaturePrefsStore.batch1561.v1566into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1566: invest mode
internal fun PlayerActivity.showV1566InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1566invest
    FeaturePrefsStore.batch1561.v1566invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1566: invite mode
internal fun PlayerActivity.showV1566InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1566invite
    FeaturePrefsStore.batch1561.v1566invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1567: inflict mode
internal fun PlayerActivity.showV1567InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inflict
    FeaturePrefsStore.batch1561.v1567inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1567: inform mode
internal fun PlayerActivity.showV1567InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inform
    FeaturePrefsStore.batch1561.v1567inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1567: initial mode
internal fun PlayerActivity.showV1567InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1567initial
    FeaturePrefsStore.batch1561.v1567initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1567: inject mode
internal fun PlayerActivity.showV1567InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inject
    FeaturePrefsStore.batch1561.v1567inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1567: inmate mode
internal fun PlayerActivity.showV1567InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1567inmate
    FeaturePrefsStore.batch1561.v1567inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1567: inner level
internal fun PlayerActivity.showV1567InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1567: innocent level
internal fun PlayerActivity.showV1567InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1567: inquiry level
internal fun PlayerActivity.showV1567InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1567: insight level
internal fun PlayerActivity.showV1567InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1567: inspire level
internal fun PlayerActivity.showV1567InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1567inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1567inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1567: intact mode
internal fun PlayerActivity.showV1567IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1567intact
    FeaturePrefsStore.batch1561.v1567intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1567: interest mode
internal fun PlayerActivity.showV1567InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1567interest
    FeaturePrefsStore.batch1561.v1567interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1567: into mode
internal fun PlayerActivity.showV1567IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1567into
    FeaturePrefsStore.batch1561.v1567into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1567: invest mode
internal fun PlayerActivity.showV1567InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1567invest
    FeaturePrefsStore.batch1561.v1567invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1567: invite mode
internal fun PlayerActivity.showV1567InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1567invite
    FeaturePrefsStore.batch1561.v1567invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1568: inflict mode
internal fun PlayerActivity.showV1568InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inflict
    FeaturePrefsStore.batch1561.v1568inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1568: inform mode
internal fun PlayerActivity.showV1568InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inform
    FeaturePrefsStore.batch1561.v1568inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1568: initial mode
internal fun PlayerActivity.showV1568InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1568initial
    FeaturePrefsStore.batch1561.v1568initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1568: inject mode
internal fun PlayerActivity.showV1568InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inject
    FeaturePrefsStore.batch1561.v1568inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1568: inmate mode
internal fun PlayerActivity.showV1568InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1568inmate
    FeaturePrefsStore.batch1561.v1568inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1568: inner level
internal fun PlayerActivity.showV1568InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1568: innocent level
internal fun PlayerActivity.showV1568InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1568: inquiry level
internal fun PlayerActivity.showV1568InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1568: insight level
internal fun PlayerActivity.showV1568InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1568: inspire level
internal fun PlayerActivity.showV1568InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1568inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1568inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1568: intact mode
internal fun PlayerActivity.showV1568IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1568intact
    FeaturePrefsStore.batch1561.v1568intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1568: interest mode
internal fun PlayerActivity.showV1568InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1568interest
    FeaturePrefsStore.batch1561.v1568interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1568: into mode
internal fun PlayerActivity.showV1568IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1568into
    FeaturePrefsStore.batch1561.v1568into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1568: invest mode
internal fun PlayerActivity.showV1568InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1568invest
    FeaturePrefsStore.batch1561.v1568invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1568: invite mode
internal fun PlayerActivity.showV1568InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1568invite
    FeaturePrefsStore.batch1561.v1568invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1569: inflict mode
internal fun PlayerActivity.showV1569InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inflict
    FeaturePrefsStore.batch1561.v1569inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1569: inform mode
internal fun PlayerActivity.showV1569InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inform
    FeaturePrefsStore.batch1561.v1569inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1569: initial mode
internal fun PlayerActivity.showV1569InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1569initial
    FeaturePrefsStore.batch1561.v1569initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1569: inject mode
internal fun PlayerActivity.showV1569InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inject
    FeaturePrefsStore.batch1561.v1569inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1569: inmate mode
internal fun PlayerActivity.showV1569InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1569inmate
    FeaturePrefsStore.batch1561.v1569inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1569: inner level
internal fun PlayerActivity.showV1569InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1569: innocent level
internal fun PlayerActivity.showV1569InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1569: inquiry level
internal fun PlayerActivity.showV1569InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1569: insight level
internal fun PlayerActivity.showV1569InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1569: inspire level
internal fun PlayerActivity.showV1569InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1569inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1569inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1569: intact mode
internal fun PlayerActivity.showV1569IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1569intact
    FeaturePrefsStore.batch1561.v1569intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1569: interest mode
internal fun PlayerActivity.showV1569InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1569interest
    FeaturePrefsStore.batch1561.v1569interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1569: into mode
internal fun PlayerActivity.showV1569IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1569into
    FeaturePrefsStore.batch1561.v1569into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1569: invest mode
internal fun PlayerActivity.showV1569InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1569invest
    FeaturePrefsStore.batch1561.v1569invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1569: invite mode
internal fun PlayerActivity.showV1569InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1569invite
    FeaturePrefsStore.batch1561.v1569invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

// v1570: inflict mode
internal fun PlayerActivity.showV1570InflictToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inflict
    FeaturePrefsStore.batch1561.v1570inflict = !current
    AppToast.show(this, "inflict: ${if (!current) "ON" else "OFF"}")
}

// v1570: inform mode
internal fun PlayerActivity.showV1570InformToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inform
    FeaturePrefsStore.batch1561.v1570inform = !current
    AppToast.show(this, "inform: ${if (!current) "ON" else "OFF"}")
}

// v1570: initial mode
internal fun PlayerActivity.showV1570InitialToggle() {
    val current = FeaturePrefsStore.batch1561.v1570initial
    FeaturePrefsStore.batch1561.v1570initial = !current
    AppToast.show(this, "initial: ${if (!current) "ON" else "OFF"}")
}

// v1570: inject mode
internal fun PlayerActivity.showV1570InjectToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inject
    FeaturePrefsStore.batch1561.v1570inject = !current
    AppToast.show(this, "inject: ${if (!current) "ON" else "OFF"}")
}

// v1570: inmate mode
internal fun PlayerActivity.showV1570InmateToggle() {
    val current = FeaturePrefsStore.batch1561.v1570inmate
    FeaturePrefsStore.batch1561.v1570inmate = !current
    AppToast.show(this, "inmate: ${if (!current) "ON" else "OFF"}")
}

// v1570: inner level
internal fun PlayerActivity.showV1570InnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570inner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570inner = value
        AppToast.show(this, "inner: $value")
    }
}

// v1570: innocent level
internal fun PlayerActivity.showV1570InnocentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570innocent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "innocent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570innocent = value
        AppToast.show(this, "innocent: $value")
    }
}

// v1570: inquiry level
internal fun PlayerActivity.showV1570InquiryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570inquiry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inquiry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570inquiry = value
        AppToast.show(this, "inquiry: $value")
    }
}

// v1570: insight level
internal fun PlayerActivity.showV1570InsightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570insight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "insight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570insight = value
        AppToast.show(this, "insight: $value")
    }
}

// v1570: inspire level
internal fun PlayerActivity.showV1570InspireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1561.v1570inspire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "inspire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1561.v1570inspire = value
        AppToast.show(this, "inspire: $value")
    }
}

// v1570: intact mode
internal fun PlayerActivity.showV1570IntactToggle() {
    val current = FeaturePrefsStore.batch1561.v1570intact
    FeaturePrefsStore.batch1561.v1570intact = !current
    AppToast.show(this, "intact: ${if (!current) "ON" else "OFF"}")
}

// v1570: interest mode
internal fun PlayerActivity.showV1570InterestToggle() {
    val current = FeaturePrefsStore.batch1561.v1570interest
    FeaturePrefsStore.batch1561.v1570interest = !current
    AppToast.show(this, "interest: ${if (!current) "ON" else "OFF"}")
}

// v1570: into mode
internal fun PlayerActivity.showV1570IntoToggle() {
    val current = FeaturePrefsStore.batch1561.v1570into
    FeaturePrefsStore.batch1561.v1570into = !current
    AppToast.show(this, "into: ${if (!current) "ON" else "OFF"}")
}

// v1570: invest mode
internal fun PlayerActivity.showV1570InvestToggle() {
    val current = FeaturePrefsStore.batch1561.v1570invest
    FeaturePrefsStore.batch1561.v1570invest = !current
    AppToast.show(this, "invest: ${if (!current) "ON" else "OFF"}")
}

// v1570: invite mode
internal fun PlayerActivity.showV1570InviteToggle() {
    val current = FeaturePrefsStore.batch1561.v1570invite
    FeaturePrefsStore.batch1561.v1570invite = !current
    AppToast.show(this, "invite: ${if (!current) "ON" else "OFF"}")
}

