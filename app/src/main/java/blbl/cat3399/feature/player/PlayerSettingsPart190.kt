package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2081: linked mode
internal fun PlayerActivity.showV2081LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081linked
    FeaturePrefsStore.batch2081.v2081linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2081: listed mode
internal fun PlayerActivity.showV2081ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081listed
    FeaturePrefsStore.batch2081.v2081listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2081: listened mode
internal fun PlayerActivity.showV2081ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081listened
    FeaturePrefsStore.batch2081.v2081listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2081: loaded mode
internal fun PlayerActivity.showV2081LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081loaded
    FeaturePrefsStore.batch2081.v2081loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2081: located mode
internal fun PlayerActivity.showV2081LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081located
    FeaturePrefsStore.batch2081.v2081located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2081: locked level
internal fun PlayerActivity.showV2081LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2081: logged level
internal fun PlayerActivity.showV2081LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2081: looked level
internal fun PlayerActivity.showV2081LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2081: loosened level
internal fun PlayerActivity.showV2081LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2081: lowered level
internal fun PlayerActivity.showV2081LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2081: maintained mode
internal fun PlayerActivity.showV2081MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081maintained
    FeaturePrefsStore.batch2081.v2081maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2081: managed mode
internal fun PlayerActivity.showV2081ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081managed
    FeaturePrefsStore.batch2081.v2081managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2081: manifested mode
internal fun PlayerActivity.showV2081ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081manifested
    FeaturePrefsStore.batch2081.v2081manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2081: manipulated mode
internal fun PlayerActivity.showV2081ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081manipulated
    FeaturePrefsStore.batch2081.v2081manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2081: manufactured mode
internal fun PlayerActivity.showV2081ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081manufactured
    FeaturePrefsStore.batch2081.v2081manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2082: linked mode
internal fun PlayerActivity.showV2082LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082linked
    FeaturePrefsStore.batch2081.v2082linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2082: listed mode
internal fun PlayerActivity.showV2082ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082listed
    FeaturePrefsStore.batch2081.v2082listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2082: listened mode
internal fun PlayerActivity.showV2082ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082listened
    FeaturePrefsStore.batch2081.v2082listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2082: loaded mode
internal fun PlayerActivity.showV2082LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082loaded
    FeaturePrefsStore.batch2081.v2082loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2082: located mode
internal fun PlayerActivity.showV2082LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082located
    FeaturePrefsStore.batch2081.v2082located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2082: locked level
internal fun PlayerActivity.showV2082LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2082: logged level
internal fun PlayerActivity.showV2082LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2082: looked level
internal fun PlayerActivity.showV2082LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2082: loosened level
internal fun PlayerActivity.showV2082LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2082: lowered level
internal fun PlayerActivity.showV2082LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2082: maintained mode
internal fun PlayerActivity.showV2082MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082maintained
    FeaturePrefsStore.batch2081.v2082maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2082: managed mode
internal fun PlayerActivity.showV2082ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082managed
    FeaturePrefsStore.batch2081.v2082managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2082: manifested mode
internal fun PlayerActivity.showV2082ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082manifested
    FeaturePrefsStore.batch2081.v2082manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2082: manipulated mode
internal fun PlayerActivity.showV2082ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082manipulated
    FeaturePrefsStore.batch2081.v2082manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2082: manufactured mode
internal fun PlayerActivity.showV2082ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082manufactured
    FeaturePrefsStore.batch2081.v2082manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2083: linked mode
internal fun PlayerActivity.showV2083LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083linked
    FeaturePrefsStore.batch2081.v2083linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2083: listed mode
internal fun PlayerActivity.showV2083ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083listed
    FeaturePrefsStore.batch2081.v2083listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2083: listened mode
internal fun PlayerActivity.showV2083ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083listened
    FeaturePrefsStore.batch2081.v2083listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2083: loaded mode
internal fun PlayerActivity.showV2083LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083loaded
    FeaturePrefsStore.batch2081.v2083loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2083: located mode
internal fun PlayerActivity.showV2083LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083located
    FeaturePrefsStore.batch2081.v2083located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2083: locked level
internal fun PlayerActivity.showV2083LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2083: logged level
internal fun PlayerActivity.showV2083LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2083: looked level
internal fun PlayerActivity.showV2083LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2083: loosened level
internal fun PlayerActivity.showV2083LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2083: lowered level
internal fun PlayerActivity.showV2083LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2083: maintained mode
internal fun PlayerActivity.showV2083MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083maintained
    FeaturePrefsStore.batch2081.v2083maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2083: managed mode
internal fun PlayerActivity.showV2083ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083managed
    FeaturePrefsStore.batch2081.v2083managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2083: manifested mode
internal fun PlayerActivity.showV2083ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083manifested
    FeaturePrefsStore.batch2081.v2083manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2083: manipulated mode
internal fun PlayerActivity.showV2083ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083manipulated
    FeaturePrefsStore.batch2081.v2083manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2083: manufactured mode
internal fun PlayerActivity.showV2083ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083manufactured
    FeaturePrefsStore.batch2081.v2083manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2084: linked mode
internal fun PlayerActivity.showV2084LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084linked
    FeaturePrefsStore.batch2081.v2084linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2084: listed mode
internal fun PlayerActivity.showV2084ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084listed
    FeaturePrefsStore.batch2081.v2084listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2084: listened mode
internal fun PlayerActivity.showV2084ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084listened
    FeaturePrefsStore.batch2081.v2084listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2084: loaded mode
internal fun PlayerActivity.showV2084LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084loaded
    FeaturePrefsStore.batch2081.v2084loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2084: located mode
internal fun PlayerActivity.showV2084LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084located
    FeaturePrefsStore.batch2081.v2084located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2084: locked level
internal fun PlayerActivity.showV2084LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2084: logged level
internal fun PlayerActivity.showV2084LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2084: looked level
internal fun PlayerActivity.showV2084LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2084: loosened level
internal fun PlayerActivity.showV2084LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2084: lowered level
internal fun PlayerActivity.showV2084LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2084: maintained mode
internal fun PlayerActivity.showV2084MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084maintained
    FeaturePrefsStore.batch2081.v2084maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2084: managed mode
internal fun PlayerActivity.showV2084ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084managed
    FeaturePrefsStore.batch2081.v2084managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2084: manifested mode
internal fun PlayerActivity.showV2084ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084manifested
    FeaturePrefsStore.batch2081.v2084manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2084: manipulated mode
internal fun PlayerActivity.showV2084ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084manipulated
    FeaturePrefsStore.batch2081.v2084manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2084: manufactured mode
internal fun PlayerActivity.showV2084ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084manufactured
    FeaturePrefsStore.batch2081.v2084manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2085: linked mode
internal fun PlayerActivity.showV2085LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085linked
    FeaturePrefsStore.batch2081.v2085linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2085: listed mode
internal fun PlayerActivity.showV2085ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085listed
    FeaturePrefsStore.batch2081.v2085listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2085: listened mode
internal fun PlayerActivity.showV2085ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085listened
    FeaturePrefsStore.batch2081.v2085listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2085: loaded mode
internal fun PlayerActivity.showV2085LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085loaded
    FeaturePrefsStore.batch2081.v2085loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2085: located mode
internal fun PlayerActivity.showV2085LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085located
    FeaturePrefsStore.batch2081.v2085located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2085: locked level
internal fun PlayerActivity.showV2085LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2085: logged level
internal fun PlayerActivity.showV2085LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2085: looked level
internal fun PlayerActivity.showV2085LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2085: loosened level
internal fun PlayerActivity.showV2085LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2085: lowered level
internal fun PlayerActivity.showV2085LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2085: maintained mode
internal fun PlayerActivity.showV2085MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085maintained
    FeaturePrefsStore.batch2081.v2085maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2085: managed mode
internal fun PlayerActivity.showV2085ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085managed
    FeaturePrefsStore.batch2081.v2085managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2085: manifested mode
internal fun PlayerActivity.showV2085ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085manifested
    FeaturePrefsStore.batch2081.v2085manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2085: manipulated mode
internal fun PlayerActivity.showV2085ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085manipulated
    FeaturePrefsStore.batch2081.v2085manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2085: manufactured mode
internal fun PlayerActivity.showV2085ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085manufactured
    FeaturePrefsStore.batch2081.v2085manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2086: linked mode
internal fun PlayerActivity.showV2086LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086linked
    FeaturePrefsStore.batch2081.v2086linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2086: listed mode
internal fun PlayerActivity.showV2086ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086listed
    FeaturePrefsStore.batch2081.v2086listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2086: listened mode
internal fun PlayerActivity.showV2086ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086listened
    FeaturePrefsStore.batch2081.v2086listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2086: loaded mode
internal fun PlayerActivity.showV2086LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086loaded
    FeaturePrefsStore.batch2081.v2086loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2086: located mode
internal fun PlayerActivity.showV2086LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086located
    FeaturePrefsStore.batch2081.v2086located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2086: locked level
internal fun PlayerActivity.showV2086LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2086: logged level
internal fun PlayerActivity.showV2086LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2086: looked level
internal fun PlayerActivity.showV2086LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2086: loosened level
internal fun PlayerActivity.showV2086LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2086: lowered level
internal fun PlayerActivity.showV2086LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2086: maintained mode
internal fun PlayerActivity.showV2086MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086maintained
    FeaturePrefsStore.batch2081.v2086maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2086: managed mode
internal fun PlayerActivity.showV2086ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086managed
    FeaturePrefsStore.batch2081.v2086managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2086: manifested mode
internal fun PlayerActivity.showV2086ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086manifested
    FeaturePrefsStore.batch2081.v2086manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2086: manipulated mode
internal fun PlayerActivity.showV2086ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086manipulated
    FeaturePrefsStore.batch2081.v2086manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2086: manufactured mode
internal fun PlayerActivity.showV2086ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086manufactured
    FeaturePrefsStore.batch2081.v2086manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2087: linked mode
internal fun PlayerActivity.showV2087LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087linked
    FeaturePrefsStore.batch2081.v2087linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2087: listed mode
internal fun PlayerActivity.showV2087ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087listed
    FeaturePrefsStore.batch2081.v2087listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2087: listened mode
internal fun PlayerActivity.showV2087ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087listened
    FeaturePrefsStore.batch2081.v2087listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2087: loaded mode
internal fun PlayerActivity.showV2087LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087loaded
    FeaturePrefsStore.batch2081.v2087loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2087: located mode
internal fun PlayerActivity.showV2087LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087located
    FeaturePrefsStore.batch2081.v2087located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2087: locked level
internal fun PlayerActivity.showV2087LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2087: logged level
internal fun PlayerActivity.showV2087LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2087: looked level
internal fun PlayerActivity.showV2087LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2087: loosened level
internal fun PlayerActivity.showV2087LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2087: lowered level
internal fun PlayerActivity.showV2087LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2087: maintained mode
internal fun PlayerActivity.showV2087MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087maintained
    FeaturePrefsStore.batch2081.v2087maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2087: managed mode
internal fun PlayerActivity.showV2087ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087managed
    FeaturePrefsStore.batch2081.v2087managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2087: manifested mode
internal fun PlayerActivity.showV2087ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087manifested
    FeaturePrefsStore.batch2081.v2087manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2087: manipulated mode
internal fun PlayerActivity.showV2087ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087manipulated
    FeaturePrefsStore.batch2081.v2087manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2087: manufactured mode
internal fun PlayerActivity.showV2087ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087manufactured
    FeaturePrefsStore.batch2081.v2087manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2088: linked mode
internal fun PlayerActivity.showV2088LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088linked
    FeaturePrefsStore.batch2081.v2088linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2088: listed mode
internal fun PlayerActivity.showV2088ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088listed
    FeaturePrefsStore.batch2081.v2088listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2088: listened mode
internal fun PlayerActivity.showV2088ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088listened
    FeaturePrefsStore.batch2081.v2088listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2088: loaded mode
internal fun PlayerActivity.showV2088LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088loaded
    FeaturePrefsStore.batch2081.v2088loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2088: located mode
internal fun PlayerActivity.showV2088LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088located
    FeaturePrefsStore.batch2081.v2088located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2088: locked level
internal fun PlayerActivity.showV2088LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2088: logged level
internal fun PlayerActivity.showV2088LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2088: looked level
internal fun PlayerActivity.showV2088LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2088: loosened level
internal fun PlayerActivity.showV2088LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2088: lowered level
internal fun PlayerActivity.showV2088LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2088: maintained mode
internal fun PlayerActivity.showV2088MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088maintained
    FeaturePrefsStore.batch2081.v2088maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2088: managed mode
internal fun PlayerActivity.showV2088ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088managed
    FeaturePrefsStore.batch2081.v2088managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2088: manifested mode
internal fun PlayerActivity.showV2088ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088manifested
    FeaturePrefsStore.batch2081.v2088manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2088: manipulated mode
internal fun PlayerActivity.showV2088ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088manipulated
    FeaturePrefsStore.batch2081.v2088manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2088: manufactured mode
internal fun PlayerActivity.showV2088ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088manufactured
    FeaturePrefsStore.batch2081.v2088manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2089: linked mode
internal fun PlayerActivity.showV2089LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089linked
    FeaturePrefsStore.batch2081.v2089linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2089: listed mode
internal fun PlayerActivity.showV2089ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089listed
    FeaturePrefsStore.batch2081.v2089listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2089: listened mode
internal fun PlayerActivity.showV2089ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089listened
    FeaturePrefsStore.batch2081.v2089listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2089: loaded mode
internal fun PlayerActivity.showV2089LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089loaded
    FeaturePrefsStore.batch2081.v2089loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2089: located mode
internal fun PlayerActivity.showV2089LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089located
    FeaturePrefsStore.batch2081.v2089located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2089: locked level
internal fun PlayerActivity.showV2089LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2089: logged level
internal fun PlayerActivity.showV2089LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2089: looked level
internal fun PlayerActivity.showV2089LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2089: loosened level
internal fun PlayerActivity.showV2089LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2089: lowered level
internal fun PlayerActivity.showV2089LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2089: maintained mode
internal fun PlayerActivity.showV2089MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089maintained
    FeaturePrefsStore.batch2081.v2089maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2089: managed mode
internal fun PlayerActivity.showV2089ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089managed
    FeaturePrefsStore.batch2081.v2089managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2089: manifested mode
internal fun PlayerActivity.showV2089ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089manifested
    FeaturePrefsStore.batch2081.v2089manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2089: manipulated mode
internal fun PlayerActivity.showV2089ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089manipulated
    FeaturePrefsStore.batch2081.v2089manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2089: manufactured mode
internal fun PlayerActivity.showV2089ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089manufactured
    FeaturePrefsStore.batch2081.v2089manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2090: linked mode
internal fun PlayerActivity.showV2090LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090linked
    FeaturePrefsStore.batch2081.v2090linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2090: listed mode
internal fun PlayerActivity.showV2090ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090listed
    FeaturePrefsStore.batch2081.v2090listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2090: listened mode
internal fun PlayerActivity.showV2090ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090listened
    FeaturePrefsStore.batch2081.v2090listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2090: loaded mode
internal fun PlayerActivity.showV2090LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090loaded
    FeaturePrefsStore.batch2081.v2090loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2090: located mode
internal fun PlayerActivity.showV2090LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090located
    FeaturePrefsStore.batch2081.v2090located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2090: locked level
internal fun PlayerActivity.showV2090LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2090: logged level
internal fun PlayerActivity.showV2090LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2090: looked level
internal fun PlayerActivity.showV2090LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2090: loosened level
internal fun PlayerActivity.showV2090LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2090: lowered level
internal fun PlayerActivity.showV2090LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2090: maintained mode
internal fun PlayerActivity.showV2090MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090maintained
    FeaturePrefsStore.batch2081.v2090maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2090: managed mode
internal fun PlayerActivity.showV2090ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090managed
    FeaturePrefsStore.batch2081.v2090managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2090: manifested mode
internal fun PlayerActivity.showV2090ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090manifested
    FeaturePrefsStore.batch2081.v2090manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2090: manipulated mode
internal fun PlayerActivity.showV2090ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090manipulated
    FeaturePrefsStore.batch2081.v2090manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2090: manufactured mode
internal fun PlayerActivity.showV2090ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090manufactured
    FeaturePrefsStore.batch2081.v2090manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

