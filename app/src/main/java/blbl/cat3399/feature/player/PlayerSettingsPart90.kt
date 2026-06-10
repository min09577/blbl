package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1081: slow mode
internal fun PlayerActivity.showV1081SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1081slow
    FeaturePrefsStore.batch1081.v1081slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1081: small mode
internal fun PlayerActivity.showV1081SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1081small
    FeaturePrefsStore.batch1081.v1081small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1081: smart mode
internal fun PlayerActivity.showV1081SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1081smart
    FeaturePrefsStore.batch1081.v1081smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1081: smooth mode
internal fun PlayerActivity.showV1081SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1081smooth
    FeaturePrefsStore.batch1081.v1081smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1081: snap mode
internal fun PlayerActivity.showV1081SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1081snap
    FeaturePrefsStore.batch1081.v1081snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1081: socket level
internal fun PlayerActivity.showV1081SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1081: soft level
internal fun PlayerActivity.showV1081SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1081: sort level
internal fun PlayerActivity.showV1081SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1081: source level
internal fun PlayerActivity.showV1081SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081source = value
        AppToast.show(this, "source: $value")
    }
}

// v1081: space level
internal fun PlayerActivity.showV1081SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1081space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1081space = value
        AppToast.show(this, "space: $value")
    }
}

// v1081: span mode
internal fun PlayerActivity.showV1081SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1081span
    FeaturePrefsStore.batch1081.v1081span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1081: spawn mode
internal fun PlayerActivity.showV1081SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1081spawn
    FeaturePrefsStore.batch1081.v1081spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1081: speed mode
internal fun PlayerActivity.showV1081SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1081speed
    FeaturePrefsStore.batch1081.v1081speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1081: split mode
internal fun PlayerActivity.showV1081SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1081split
    FeaturePrefsStore.batch1081.v1081split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1081: spot mode
internal fun PlayerActivity.showV1081SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1081spot
    FeaturePrefsStore.batch1081.v1081spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1082: slow mode
internal fun PlayerActivity.showV1082SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1082slow
    FeaturePrefsStore.batch1081.v1082slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1082: small mode
internal fun PlayerActivity.showV1082SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1082small
    FeaturePrefsStore.batch1081.v1082small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1082: smart mode
internal fun PlayerActivity.showV1082SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1082smart
    FeaturePrefsStore.batch1081.v1082smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1082: smooth mode
internal fun PlayerActivity.showV1082SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1082smooth
    FeaturePrefsStore.batch1081.v1082smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1082: snap mode
internal fun PlayerActivity.showV1082SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1082snap
    FeaturePrefsStore.batch1081.v1082snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1082: socket level
internal fun PlayerActivity.showV1082SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1082: soft level
internal fun PlayerActivity.showV1082SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1082: sort level
internal fun PlayerActivity.showV1082SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1082: source level
internal fun PlayerActivity.showV1082SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082source = value
        AppToast.show(this, "source: $value")
    }
}

// v1082: space level
internal fun PlayerActivity.showV1082SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1082space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1082space = value
        AppToast.show(this, "space: $value")
    }
}

// v1082: span mode
internal fun PlayerActivity.showV1082SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1082span
    FeaturePrefsStore.batch1081.v1082span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1082: spawn mode
internal fun PlayerActivity.showV1082SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1082spawn
    FeaturePrefsStore.batch1081.v1082spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1082: speed mode
internal fun PlayerActivity.showV1082SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1082speed
    FeaturePrefsStore.batch1081.v1082speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1082: split mode
internal fun PlayerActivity.showV1082SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1082split
    FeaturePrefsStore.batch1081.v1082split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1082: spot mode
internal fun PlayerActivity.showV1082SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1082spot
    FeaturePrefsStore.batch1081.v1082spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1083: slow mode
internal fun PlayerActivity.showV1083SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1083slow
    FeaturePrefsStore.batch1081.v1083slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1083: small mode
internal fun PlayerActivity.showV1083SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1083small
    FeaturePrefsStore.batch1081.v1083small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1083: smart mode
internal fun PlayerActivity.showV1083SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1083smart
    FeaturePrefsStore.batch1081.v1083smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1083: smooth mode
internal fun PlayerActivity.showV1083SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1083smooth
    FeaturePrefsStore.batch1081.v1083smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1083: snap mode
internal fun PlayerActivity.showV1083SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1083snap
    FeaturePrefsStore.batch1081.v1083snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1083: socket level
internal fun PlayerActivity.showV1083SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1083: soft level
internal fun PlayerActivity.showV1083SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1083: sort level
internal fun PlayerActivity.showV1083SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1083: source level
internal fun PlayerActivity.showV1083SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083source = value
        AppToast.show(this, "source: $value")
    }
}

// v1083: space level
internal fun PlayerActivity.showV1083SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1083space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1083space = value
        AppToast.show(this, "space: $value")
    }
}

// v1083: span mode
internal fun PlayerActivity.showV1083SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1083span
    FeaturePrefsStore.batch1081.v1083span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1083: spawn mode
internal fun PlayerActivity.showV1083SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1083spawn
    FeaturePrefsStore.batch1081.v1083spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1083: speed mode
internal fun PlayerActivity.showV1083SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1083speed
    FeaturePrefsStore.batch1081.v1083speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1083: split mode
internal fun PlayerActivity.showV1083SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1083split
    FeaturePrefsStore.batch1081.v1083split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1083: spot mode
internal fun PlayerActivity.showV1083SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1083spot
    FeaturePrefsStore.batch1081.v1083spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1084: slow mode
internal fun PlayerActivity.showV1084SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1084slow
    FeaturePrefsStore.batch1081.v1084slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1084: small mode
internal fun PlayerActivity.showV1084SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1084small
    FeaturePrefsStore.batch1081.v1084small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1084: smart mode
internal fun PlayerActivity.showV1084SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1084smart
    FeaturePrefsStore.batch1081.v1084smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1084: smooth mode
internal fun PlayerActivity.showV1084SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1084smooth
    FeaturePrefsStore.batch1081.v1084smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1084: snap mode
internal fun PlayerActivity.showV1084SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1084snap
    FeaturePrefsStore.batch1081.v1084snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1084: socket level
internal fun PlayerActivity.showV1084SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1084: soft level
internal fun PlayerActivity.showV1084SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1084: sort level
internal fun PlayerActivity.showV1084SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1084: source level
internal fun PlayerActivity.showV1084SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084source = value
        AppToast.show(this, "source: $value")
    }
}

// v1084: space level
internal fun PlayerActivity.showV1084SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1084space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1084space = value
        AppToast.show(this, "space: $value")
    }
}

// v1084: span mode
internal fun PlayerActivity.showV1084SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1084span
    FeaturePrefsStore.batch1081.v1084span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1084: spawn mode
internal fun PlayerActivity.showV1084SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1084spawn
    FeaturePrefsStore.batch1081.v1084spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1084: speed mode
internal fun PlayerActivity.showV1084SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1084speed
    FeaturePrefsStore.batch1081.v1084speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1084: split mode
internal fun PlayerActivity.showV1084SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1084split
    FeaturePrefsStore.batch1081.v1084split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1084: spot mode
internal fun PlayerActivity.showV1084SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1084spot
    FeaturePrefsStore.batch1081.v1084spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1085: slow mode
internal fun PlayerActivity.showV1085SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1085slow
    FeaturePrefsStore.batch1081.v1085slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1085: small mode
internal fun PlayerActivity.showV1085SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1085small
    FeaturePrefsStore.batch1081.v1085small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1085: smart mode
internal fun PlayerActivity.showV1085SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1085smart
    FeaturePrefsStore.batch1081.v1085smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1085: smooth mode
internal fun PlayerActivity.showV1085SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1085smooth
    FeaturePrefsStore.batch1081.v1085smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1085: snap mode
internal fun PlayerActivity.showV1085SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1085snap
    FeaturePrefsStore.batch1081.v1085snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1085: socket level
internal fun PlayerActivity.showV1085SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1085: soft level
internal fun PlayerActivity.showV1085SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1085: sort level
internal fun PlayerActivity.showV1085SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1085: source level
internal fun PlayerActivity.showV1085SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085source = value
        AppToast.show(this, "source: $value")
    }
}

// v1085: space level
internal fun PlayerActivity.showV1085SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1085space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1085space = value
        AppToast.show(this, "space: $value")
    }
}

// v1085: span mode
internal fun PlayerActivity.showV1085SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1085span
    FeaturePrefsStore.batch1081.v1085span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1085: spawn mode
internal fun PlayerActivity.showV1085SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1085spawn
    FeaturePrefsStore.batch1081.v1085spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1085: speed mode
internal fun PlayerActivity.showV1085SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1085speed
    FeaturePrefsStore.batch1081.v1085speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1085: split mode
internal fun PlayerActivity.showV1085SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1085split
    FeaturePrefsStore.batch1081.v1085split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1085: spot mode
internal fun PlayerActivity.showV1085SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1085spot
    FeaturePrefsStore.batch1081.v1085spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1086: slow mode
internal fun PlayerActivity.showV1086SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1086slow
    FeaturePrefsStore.batch1081.v1086slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1086: small mode
internal fun PlayerActivity.showV1086SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1086small
    FeaturePrefsStore.batch1081.v1086small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1086: smart mode
internal fun PlayerActivity.showV1086SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1086smart
    FeaturePrefsStore.batch1081.v1086smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1086: smooth mode
internal fun PlayerActivity.showV1086SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1086smooth
    FeaturePrefsStore.batch1081.v1086smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1086: snap mode
internal fun PlayerActivity.showV1086SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1086snap
    FeaturePrefsStore.batch1081.v1086snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1086: socket level
internal fun PlayerActivity.showV1086SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1086: soft level
internal fun PlayerActivity.showV1086SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1086: sort level
internal fun PlayerActivity.showV1086SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1086: source level
internal fun PlayerActivity.showV1086SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086source = value
        AppToast.show(this, "source: $value")
    }
}

// v1086: space level
internal fun PlayerActivity.showV1086SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1086space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1086space = value
        AppToast.show(this, "space: $value")
    }
}

// v1086: span mode
internal fun PlayerActivity.showV1086SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1086span
    FeaturePrefsStore.batch1081.v1086span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1086: spawn mode
internal fun PlayerActivity.showV1086SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1086spawn
    FeaturePrefsStore.batch1081.v1086spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1086: speed mode
internal fun PlayerActivity.showV1086SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1086speed
    FeaturePrefsStore.batch1081.v1086speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1086: split mode
internal fun PlayerActivity.showV1086SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1086split
    FeaturePrefsStore.batch1081.v1086split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1086: spot mode
internal fun PlayerActivity.showV1086SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1086spot
    FeaturePrefsStore.batch1081.v1086spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1087: slow mode
internal fun PlayerActivity.showV1087SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1087slow
    FeaturePrefsStore.batch1081.v1087slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1087: small mode
internal fun PlayerActivity.showV1087SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1087small
    FeaturePrefsStore.batch1081.v1087small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1087: smart mode
internal fun PlayerActivity.showV1087SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1087smart
    FeaturePrefsStore.batch1081.v1087smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1087: smooth mode
internal fun PlayerActivity.showV1087SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1087smooth
    FeaturePrefsStore.batch1081.v1087smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1087: snap mode
internal fun PlayerActivity.showV1087SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1087snap
    FeaturePrefsStore.batch1081.v1087snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1087: socket level
internal fun PlayerActivity.showV1087SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1087: soft level
internal fun PlayerActivity.showV1087SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1087: sort level
internal fun PlayerActivity.showV1087SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1087: source level
internal fun PlayerActivity.showV1087SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087source = value
        AppToast.show(this, "source: $value")
    }
}

// v1087: space level
internal fun PlayerActivity.showV1087SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1087space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1087space = value
        AppToast.show(this, "space: $value")
    }
}

// v1087: span mode
internal fun PlayerActivity.showV1087SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1087span
    FeaturePrefsStore.batch1081.v1087span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1087: spawn mode
internal fun PlayerActivity.showV1087SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1087spawn
    FeaturePrefsStore.batch1081.v1087spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1087: speed mode
internal fun PlayerActivity.showV1087SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1087speed
    FeaturePrefsStore.batch1081.v1087speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1087: split mode
internal fun PlayerActivity.showV1087SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1087split
    FeaturePrefsStore.batch1081.v1087split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1087: spot mode
internal fun PlayerActivity.showV1087SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1087spot
    FeaturePrefsStore.batch1081.v1087spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1088: slow mode
internal fun PlayerActivity.showV1088SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1088slow
    FeaturePrefsStore.batch1081.v1088slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1088: small mode
internal fun PlayerActivity.showV1088SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1088small
    FeaturePrefsStore.batch1081.v1088small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1088: smart mode
internal fun PlayerActivity.showV1088SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1088smart
    FeaturePrefsStore.batch1081.v1088smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1088: smooth mode
internal fun PlayerActivity.showV1088SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1088smooth
    FeaturePrefsStore.batch1081.v1088smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1088: snap mode
internal fun PlayerActivity.showV1088SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1088snap
    FeaturePrefsStore.batch1081.v1088snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1088: socket level
internal fun PlayerActivity.showV1088SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1088: soft level
internal fun PlayerActivity.showV1088SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1088: sort level
internal fun PlayerActivity.showV1088SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1088: source level
internal fun PlayerActivity.showV1088SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088source = value
        AppToast.show(this, "source: $value")
    }
}

// v1088: space level
internal fun PlayerActivity.showV1088SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1088space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1088space = value
        AppToast.show(this, "space: $value")
    }
}

// v1088: span mode
internal fun PlayerActivity.showV1088SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1088span
    FeaturePrefsStore.batch1081.v1088span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1088: spawn mode
internal fun PlayerActivity.showV1088SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1088spawn
    FeaturePrefsStore.batch1081.v1088spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1088: speed mode
internal fun PlayerActivity.showV1088SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1088speed
    FeaturePrefsStore.batch1081.v1088speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1088: split mode
internal fun PlayerActivity.showV1088SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1088split
    FeaturePrefsStore.batch1081.v1088split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1088: spot mode
internal fun PlayerActivity.showV1088SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1088spot
    FeaturePrefsStore.batch1081.v1088spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1089: slow mode
internal fun PlayerActivity.showV1089SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1089slow
    FeaturePrefsStore.batch1081.v1089slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1089: small mode
internal fun PlayerActivity.showV1089SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1089small
    FeaturePrefsStore.batch1081.v1089small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1089: smart mode
internal fun PlayerActivity.showV1089SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1089smart
    FeaturePrefsStore.batch1081.v1089smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1089: smooth mode
internal fun PlayerActivity.showV1089SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1089smooth
    FeaturePrefsStore.batch1081.v1089smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1089: snap mode
internal fun PlayerActivity.showV1089SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1089snap
    FeaturePrefsStore.batch1081.v1089snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1089: socket level
internal fun PlayerActivity.showV1089SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1089: soft level
internal fun PlayerActivity.showV1089SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1089: sort level
internal fun PlayerActivity.showV1089SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1089: source level
internal fun PlayerActivity.showV1089SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089source = value
        AppToast.show(this, "source: $value")
    }
}

// v1089: space level
internal fun PlayerActivity.showV1089SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1089space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1089space = value
        AppToast.show(this, "space: $value")
    }
}

// v1089: span mode
internal fun PlayerActivity.showV1089SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1089span
    FeaturePrefsStore.batch1081.v1089span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1089: spawn mode
internal fun PlayerActivity.showV1089SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1089spawn
    FeaturePrefsStore.batch1081.v1089spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1089: speed mode
internal fun PlayerActivity.showV1089SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1089speed
    FeaturePrefsStore.batch1081.v1089speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1089: split mode
internal fun PlayerActivity.showV1089SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1089split
    FeaturePrefsStore.batch1081.v1089split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1089: spot mode
internal fun PlayerActivity.showV1089SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1089spot
    FeaturePrefsStore.batch1081.v1089spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

// v1090: slow mode
internal fun PlayerActivity.showV1090SlowToggle() {
    val current = FeaturePrefsStore.batch1081.v1090slow
    FeaturePrefsStore.batch1081.v1090slow = !current
    AppToast.show(this, "slow: ${if (!current) "ON" else "OFF"}")
}

// v1090: small mode
internal fun PlayerActivity.showV1090SmallToggle() {
    val current = FeaturePrefsStore.batch1081.v1090small
    FeaturePrefsStore.batch1081.v1090small = !current
    AppToast.show(this, "small: ${if (!current) "ON" else "OFF"}")
}

// v1090: smart mode
internal fun PlayerActivity.showV1090SmartToggle() {
    val current = FeaturePrefsStore.batch1081.v1090smart
    FeaturePrefsStore.batch1081.v1090smart = !current
    AppToast.show(this, "smart: ${if (!current) "ON" else "OFF"}")
}

// v1090: smooth mode
internal fun PlayerActivity.showV1090SmoothToggle() {
    val current = FeaturePrefsStore.batch1081.v1090smooth
    FeaturePrefsStore.batch1081.v1090smooth = !current
    AppToast.show(this, "smooth: ${if (!current) "ON" else "OFF"}")
}

// v1090: snap mode
internal fun PlayerActivity.showV1090SnapToggle() {
    val current = FeaturePrefsStore.batch1081.v1090snap
    FeaturePrefsStore.batch1081.v1090snap = !current
    AppToast.show(this, "snap: ${if (!current) "ON" else "OFF"}")
}

// v1090: socket level
internal fun PlayerActivity.showV1090SocketDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090socket).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "socket level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090socket = value
        AppToast.show(this, "socket: $value")
    }
}

// v1090: soft level
internal fun PlayerActivity.showV1090SoftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090soft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "soft level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090soft = value
        AppToast.show(this, "soft: $value")
    }
}

// v1090: sort level
internal fun PlayerActivity.showV1090SortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090sort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sort level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090sort = value
        AppToast.show(this, "sort: $value")
    }
}

// v1090: source level
internal fun PlayerActivity.showV1090SourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090source).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "source level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090source = value
        AppToast.show(this, "source: $value")
    }
}

// v1090: space level
internal fun PlayerActivity.showV1090SpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1081.v1090space).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "space level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1081.v1090space = value
        AppToast.show(this, "space: $value")
    }
}

// v1090: span mode
internal fun PlayerActivity.showV1090SpanToggle() {
    val current = FeaturePrefsStore.batch1081.v1090span
    FeaturePrefsStore.batch1081.v1090span = !current
    AppToast.show(this, "span: ${if (!current) "ON" else "OFF"}")
}

// v1090: spawn mode
internal fun PlayerActivity.showV1090SpawnToggle() {
    val current = FeaturePrefsStore.batch1081.v1090spawn
    FeaturePrefsStore.batch1081.v1090spawn = !current
    AppToast.show(this, "spawn: ${if (!current) "ON" else "OFF"}")
}

// v1090: speed mode
internal fun PlayerActivity.showV1090SpeedToggle() {
    val current = FeaturePrefsStore.batch1081.v1090speed
    FeaturePrefsStore.batch1081.v1090speed = !current
    AppToast.show(this, "speed: ${if (!current) "ON" else "OFF"}")
}

// v1090: split mode
internal fun PlayerActivity.showV1090SplitToggle() {
    val current = FeaturePrefsStore.batch1081.v1090split
    FeaturePrefsStore.batch1081.v1090split = !current
    AppToast.show(this, "split: ${if (!current) "ON" else "OFF"}")
}

// v1090: spot mode
internal fun PlayerActivity.showV1090SpotToggle() {
    val current = FeaturePrefsStore.batch1081.v1090spot
    FeaturePrefsStore.batch1081.v1090spot = !current
    AppToast.show(this, "spot: ${if (!current) "ON" else "OFF"}")
}

