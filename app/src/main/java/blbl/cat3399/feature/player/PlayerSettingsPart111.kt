package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1291: bug mode
internal fun PlayerActivity.showV1291BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bug
    FeaturePrefsStore.batch1291.v1291bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1291: bullet mode
internal fun PlayerActivity.showV1291BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bullet
    FeaturePrefsStore.batch1291.v1291bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1291: bunch mode
internal fun PlayerActivity.showV1291BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bunch
    FeaturePrefsStore.batch1291.v1291bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1291: burn mode
internal fun PlayerActivity.showV1291BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1291burn
    FeaturePrefsStore.batch1291.v1291burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1291: bus mode
internal fun PlayerActivity.showV1291BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1291bus
    FeaturePrefsStore.batch1291.v1291bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1291: bush level
internal fun PlayerActivity.showV1291BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1291: busy level
internal fun PlayerActivity.showV1291BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1291: buzz level
internal fun PlayerActivity.showV1291BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1291: cabin level
internal fun PlayerActivity.showV1291CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1291: cable level
internal fun PlayerActivity.showV1291CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1291cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1291cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1291: cake mode
internal fun PlayerActivity.showV1291CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1291cake
    FeaturePrefsStore.batch1291.v1291cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1291: calm mode
internal fun PlayerActivity.showV1291CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1291calm
    FeaturePrefsStore.batch1291.v1291calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1291: camera mode
internal fun PlayerActivity.showV1291CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1291camera
    FeaturePrefsStore.batch1291.v1291camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1291: camp mode
internal fun PlayerActivity.showV1291CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1291camp
    FeaturePrefsStore.batch1291.v1291camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1291: canal mode
internal fun PlayerActivity.showV1291CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1291canal
    FeaturePrefsStore.batch1291.v1291canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1292: bug mode
internal fun PlayerActivity.showV1292BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bug
    FeaturePrefsStore.batch1291.v1292bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1292: bullet mode
internal fun PlayerActivity.showV1292BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bullet
    FeaturePrefsStore.batch1291.v1292bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1292: bunch mode
internal fun PlayerActivity.showV1292BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bunch
    FeaturePrefsStore.batch1291.v1292bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1292: burn mode
internal fun PlayerActivity.showV1292BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1292burn
    FeaturePrefsStore.batch1291.v1292burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1292: bus mode
internal fun PlayerActivity.showV1292BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1292bus
    FeaturePrefsStore.batch1291.v1292bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1292: bush level
internal fun PlayerActivity.showV1292BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1292: busy level
internal fun PlayerActivity.showV1292BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1292: buzz level
internal fun PlayerActivity.showV1292BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1292: cabin level
internal fun PlayerActivity.showV1292CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1292: cable level
internal fun PlayerActivity.showV1292CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1292cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1292cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1292: cake mode
internal fun PlayerActivity.showV1292CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1292cake
    FeaturePrefsStore.batch1291.v1292cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1292: calm mode
internal fun PlayerActivity.showV1292CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1292calm
    FeaturePrefsStore.batch1291.v1292calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1292: camera mode
internal fun PlayerActivity.showV1292CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1292camera
    FeaturePrefsStore.batch1291.v1292camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1292: camp mode
internal fun PlayerActivity.showV1292CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1292camp
    FeaturePrefsStore.batch1291.v1292camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1292: canal mode
internal fun PlayerActivity.showV1292CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1292canal
    FeaturePrefsStore.batch1291.v1292canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1293: bug mode
internal fun PlayerActivity.showV1293BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bug
    FeaturePrefsStore.batch1291.v1293bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1293: bullet mode
internal fun PlayerActivity.showV1293BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bullet
    FeaturePrefsStore.batch1291.v1293bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1293: bunch mode
internal fun PlayerActivity.showV1293BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bunch
    FeaturePrefsStore.batch1291.v1293bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1293: burn mode
internal fun PlayerActivity.showV1293BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1293burn
    FeaturePrefsStore.batch1291.v1293burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1293: bus mode
internal fun PlayerActivity.showV1293BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1293bus
    FeaturePrefsStore.batch1291.v1293bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1293: bush level
internal fun PlayerActivity.showV1293BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1293: busy level
internal fun PlayerActivity.showV1293BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1293: buzz level
internal fun PlayerActivity.showV1293BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1293: cabin level
internal fun PlayerActivity.showV1293CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1293: cable level
internal fun PlayerActivity.showV1293CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1293cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1293cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1293: cake mode
internal fun PlayerActivity.showV1293CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1293cake
    FeaturePrefsStore.batch1291.v1293cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1293: calm mode
internal fun PlayerActivity.showV1293CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1293calm
    FeaturePrefsStore.batch1291.v1293calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1293: camera mode
internal fun PlayerActivity.showV1293CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1293camera
    FeaturePrefsStore.batch1291.v1293camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1293: camp mode
internal fun PlayerActivity.showV1293CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1293camp
    FeaturePrefsStore.batch1291.v1293camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1293: canal mode
internal fun PlayerActivity.showV1293CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1293canal
    FeaturePrefsStore.batch1291.v1293canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1294: bug mode
internal fun PlayerActivity.showV1294BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bug
    FeaturePrefsStore.batch1291.v1294bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1294: bullet mode
internal fun PlayerActivity.showV1294BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bullet
    FeaturePrefsStore.batch1291.v1294bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1294: bunch mode
internal fun PlayerActivity.showV1294BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bunch
    FeaturePrefsStore.batch1291.v1294bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1294: burn mode
internal fun PlayerActivity.showV1294BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1294burn
    FeaturePrefsStore.batch1291.v1294burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1294: bus mode
internal fun PlayerActivity.showV1294BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1294bus
    FeaturePrefsStore.batch1291.v1294bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1294: bush level
internal fun PlayerActivity.showV1294BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1294: busy level
internal fun PlayerActivity.showV1294BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1294: buzz level
internal fun PlayerActivity.showV1294BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1294: cabin level
internal fun PlayerActivity.showV1294CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1294: cable level
internal fun PlayerActivity.showV1294CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1294cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1294cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1294: cake mode
internal fun PlayerActivity.showV1294CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1294cake
    FeaturePrefsStore.batch1291.v1294cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1294: calm mode
internal fun PlayerActivity.showV1294CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1294calm
    FeaturePrefsStore.batch1291.v1294calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1294: camera mode
internal fun PlayerActivity.showV1294CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1294camera
    FeaturePrefsStore.batch1291.v1294camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1294: camp mode
internal fun PlayerActivity.showV1294CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1294camp
    FeaturePrefsStore.batch1291.v1294camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1294: canal mode
internal fun PlayerActivity.showV1294CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1294canal
    FeaturePrefsStore.batch1291.v1294canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1295: bug mode
internal fun PlayerActivity.showV1295BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bug
    FeaturePrefsStore.batch1291.v1295bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1295: bullet mode
internal fun PlayerActivity.showV1295BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bullet
    FeaturePrefsStore.batch1291.v1295bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1295: bunch mode
internal fun PlayerActivity.showV1295BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bunch
    FeaturePrefsStore.batch1291.v1295bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1295: burn mode
internal fun PlayerActivity.showV1295BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1295burn
    FeaturePrefsStore.batch1291.v1295burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1295: bus mode
internal fun PlayerActivity.showV1295BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1295bus
    FeaturePrefsStore.batch1291.v1295bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1295: bush level
internal fun PlayerActivity.showV1295BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1295: busy level
internal fun PlayerActivity.showV1295BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1295: buzz level
internal fun PlayerActivity.showV1295BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1295: cabin level
internal fun PlayerActivity.showV1295CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1295: cable level
internal fun PlayerActivity.showV1295CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1295cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1295cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1295: cake mode
internal fun PlayerActivity.showV1295CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1295cake
    FeaturePrefsStore.batch1291.v1295cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1295: calm mode
internal fun PlayerActivity.showV1295CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1295calm
    FeaturePrefsStore.batch1291.v1295calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1295: camera mode
internal fun PlayerActivity.showV1295CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1295camera
    FeaturePrefsStore.batch1291.v1295camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1295: camp mode
internal fun PlayerActivity.showV1295CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1295camp
    FeaturePrefsStore.batch1291.v1295camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1295: canal mode
internal fun PlayerActivity.showV1295CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1295canal
    FeaturePrefsStore.batch1291.v1295canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1296: bug mode
internal fun PlayerActivity.showV1296BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bug
    FeaturePrefsStore.batch1291.v1296bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1296: bullet mode
internal fun PlayerActivity.showV1296BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bullet
    FeaturePrefsStore.batch1291.v1296bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1296: bunch mode
internal fun PlayerActivity.showV1296BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bunch
    FeaturePrefsStore.batch1291.v1296bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1296: burn mode
internal fun PlayerActivity.showV1296BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1296burn
    FeaturePrefsStore.batch1291.v1296burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1296: bus mode
internal fun PlayerActivity.showV1296BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1296bus
    FeaturePrefsStore.batch1291.v1296bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1296: bush level
internal fun PlayerActivity.showV1296BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1296: busy level
internal fun PlayerActivity.showV1296BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1296: buzz level
internal fun PlayerActivity.showV1296BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1296: cabin level
internal fun PlayerActivity.showV1296CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1296: cable level
internal fun PlayerActivity.showV1296CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1296cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1296cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1296: cake mode
internal fun PlayerActivity.showV1296CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1296cake
    FeaturePrefsStore.batch1291.v1296cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1296: calm mode
internal fun PlayerActivity.showV1296CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1296calm
    FeaturePrefsStore.batch1291.v1296calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1296: camera mode
internal fun PlayerActivity.showV1296CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1296camera
    FeaturePrefsStore.batch1291.v1296camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1296: camp mode
internal fun PlayerActivity.showV1296CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1296camp
    FeaturePrefsStore.batch1291.v1296camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1296: canal mode
internal fun PlayerActivity.showV1296CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1296canal
    FeaturePrefsStore.batch1291.v1296canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1297: bug mode
internal fun PlayerActivity.showV1297BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bug
    FeaturePrefsStore.batch1291.v1297bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1297: bullet mode
internal fun PlayerActivity.showV1297BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bullet
    FeaturePrefsStore.batch1291.v1297bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1297: bunch mode
internal fun PlayerActivity.showV1297BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bunch
    FeaturePrefsStore.batch1291.v1297bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1297: burn mode
internal fun PlayerActivity.showV1297BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1297burn
    FeaturePrefsStore.batch1291.v1297burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1297: bus mode
internal fun PlayerActivity.showV1297BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1297bus
    FeaturePrefsStore.batch1291.v1297bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1297: bush level
internal fun PlayerActivity.showV1297BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1297: busy level
internal fun PlayerActivity.showV1297BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1297: buzz level
internal fun PlayerActivity.showV1297BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1297: cabin level
internal fun PlayerActivity.showV1297CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1297: cable level
internal fun PlayerActivity.showV1297CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1297cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1297cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1297: cake mode
internal fun PlayerActivity.showV1297CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1297cake
    FeaturePrefsStore.batch1291.v1297cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1297: calm mode
internal fun PlayerActivity.showV1297CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1297calm
    FeaturePrefsStore.batch1291.v1297calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1297: camera mode
internal fun PlayerActivity.showV1297CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1297camera
    FeaturePrefsStore.batch1291.v1297camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1297: camp mode
internal fun PlayerActivity.showV1297CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1297camp
    FeaturePrefsStore.batch1291.v1297camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1297: canal mode
internal fun PlayerActivity.showV1297CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1297canal
    FeaturePrefsStore.batch1291.v1297canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1298: bug mode
internal fun PlayerActivity.showV1298BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bug
    FeaturePrefsStore.batch1291.v1298bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1298: bullet mode
internal fun PlayerActivity.showV1298BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bullet
    FeaturePrefsStore.batch1291.v1298bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1298: bunch mode
internal fun PlayerActivity.showV1298BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bunch
    FeaturePrefsStore.batch1291.v1298bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1298: burn mode
internal fun PlayerActivity.showV1298BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1298burn
    FeaturePrefsStore.batch1291.v1298burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1298: bus mode
internal fun PlayerActivity.showV1298BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1298bus
    FeaturePrefsStore.batch1291.v1298bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1298: bush level
internal fun PlayerActivity.showV1298BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1298: busy level
internal fun PlayerActivity.showV1298BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1298: buzz level
internal fun PlayerActivity.showV1298BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1298: cabin level
internal fun PlayerActivity.showV1298CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1298: cable level
internal fun PlayerActivity.showV1298CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1298cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1298cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1298: cake mode
internal fun PlayerActivity.showV1298CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1298cake
    FeaturePrefsStore.batch1291.v1298cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1298: calm mode
internal fun PlayerActivity.showV1298CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1298calm
    FeaturePrefsStore.batch1291.v1298calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1298: camera mode
internal fun PlayerActivity.showV1298CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1298camera
    FeaturePrefsStore.batch1291.v1298camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1298: camp mode
internal fun PlayerActivity.showV1298CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1298camp
    FeaturePrefsStore.batch1291.v1298camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1298: canal mode
internal fun PlayerActivity.showV1298CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1298canal
    FeaturePrefsStore.batch1291.v1298canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1299: bug mode
internal fun PlayerActivity.showV1299BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bug
    FeaturePrefsStore.batch1291.v1299bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1299: bullet mode
internal fun PlayerActivity.showV1299BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bullet
    FeaturePrefsStore.batch1291.v1299bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1299: bunch mode
internal fun PlayerActivity.showV1299BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bunch
    FeaturePrefsStore.batch1291.v1299bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1299: burn mode
internal fun PlayerActivity.showV1299BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1299burn
    FeaturePrefsStore.batch1291.v1299burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1299: bus mode
internal fun PlayerActivity.showV1299BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1299bus
    FeaturePrefsStore.batch1291.v1299bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1299: bush level
internal fun PlayerActivity.showV1299BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1299: busy level
internal fun PlayerActivity.showV1299BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1299: buzz level
internal fun PlayerActivity.showV1299BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1299: cabin level
internal fun PlayerActivity.showV1299CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1299: cable level
internal fun PlayerActivity.showV1299CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1299cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1299cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1299: cake mode
internal fun PlayerActivity.showV1299CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1299cake
    FeaturePrefsStore.batch1291.v1299cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1299: calm mode
internal fun PlayerActivity.showV1299CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1299calm
    FeaturePrefsStore.batch1291.v1299calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1299: camera mode
internal fun PlayerActivity.showV1299CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1299camera
    FeaturePrefsStore.batch1291.v1299camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1299: camp mode
internal fun PlayerActivity.showV1299CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1299camp
    FeaturePrefsStore.batch1291.v1299camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1299: canal mode
internal fun PlayerActivity.showV1299CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1299canal
    FeaturePrefsStore.batch1291.v1299canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

// v1300: bug mode
internal fun PlayerActivity.showV1300BugToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bug
    FeaturePrefsStore.batch1291.v1300bug = !current
    AppToast.show(this, "bug: ${if (!current) "ON" else "OFF"}")
}

// v1300: bullet mode
internal fun PlayerActivity.showV1300BulletToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bullet
    FeaturePrefsStore.batch1291.v1300bullet = !current
    AppToast.show(this, "bullet: ${if (!current) "ON" else "OFF"}")
}

// v1300: bunch mode
internal fun PlayerActivity.showV1300BunchToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bunch
    FeaturePrefsStore.batch1291.v1300bunch = !current
    AppToast.show(this, "bunch: ${if (!current) "ON" else "OFF"}")
}

// v1300: burn mode
internal fun PlayerActivity.showV1300BurnToggle() {
    val current = FeaturePrefsStore.batch1291.v1300burn
    FeaturePrefsStore.batch1291.v1300burn = !current
    AppToast.show(this, "burn: ${if (!current) "ON" else "OFF"}")
}

// v1300: bus mode
internal fun PlayerActivity.showV1300BusToggle() {
    val current = FeaturePrefsStore.batch1291.v1300bus
    FeaturePrefsStore.batch1291.v1300bus = !current
    AppToast.show(this, "bus: ${if (!current) "ON" else "OFF"}")
}

// v1300: bush level
internal fun PlayerActivity.showV1300BushDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300bush).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bush level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300bush = value
        AppToast.show(this, "bush: $value")
    }
}

// v1300: busy level
internal fun PlayerActivity.showV1300BusyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300busy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "busy level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300busy = value
        AppToast.show(this, "busy: $value")
    }
}

// v1300: buzz level
internal fun PlayerActivity.showV1300BuzzDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300buzz).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buzz level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300buzz = value
        AppToast.show(this, "buzz: $value")
    }
}

// v1300: cabin level
internal fun PlayerActivity.showV1300CabinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300cabin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cabin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300cabin = value
        AppToast.show(this, "cabin: $value")
    }
}

// v1300: cable level
internal fun PlayerActivity.showV1300CableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1291.v1300cable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "cable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1291.v1300cable = value
        AppToast.show(this, "cable: $value")
    }
}

// v1300: cake mode
internal fun PlayerActivity.showV1300CakeToggle() {
    val current = FeaturePrefsStore.batch1291.v1300cake
    FeaturePrefsStore.batch1291.v1300cake = !current
    AppToast.show(this, "cake: ${if (!current) "ON" else "OFF"}")
}

// v1300: calm mode
internal fun PlayerActivity.showV1300CalmToggle() {
    val current = FeaturePrefsStore.batch1291.v1300calm
    FeaturePrefsStore.batch1291.v1300calm = !current
    AppToast.show(this, "calm: ${if (!current) "ON" else "OFF"}")
}

// v1300: camera mode
internal fun PlayerActivity.showV1300CameraToggle() {
    val current = FeaturePrefsStore.batch1291.v1300camera
    FeaturePrefsStore.batch1291.v1300camera = !current
    AppToast.show(this, "camera: ${if (!current) "ON" else "OFF"}")
}

// v1300: camp mode
internal fun PlayerActivity.showV1300CampToggle() {
    val current = FeaturePrefsStore.batch1291.v1300camp
    FeaturePrefsStore.batch1291.v1300camp = !current
    AppToast.show(this, "camp: ${if (!current) "ON" else "OFF"}")
}

// v1300: canal mode
internal fun PlayerActivity.showV1300CanalToggle() {
    val current = FeaturePrefsStore.batch1291.v1300canal
    FeaturePrefsStore.batch1291.v1300canal = !current
    AppToast.show(this, "canal: ${if (!current) "ON" else "OFF"}")
}

