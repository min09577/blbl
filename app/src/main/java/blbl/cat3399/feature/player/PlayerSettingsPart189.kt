package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2071: killed mode
internal fun PlayerActivity.showV2071KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2071killed
    FeaturePrefsStore.batch2071.v2071killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2071: knocked mode
internal fun PlayerActivity.showV2071KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071knocked
    FeaturePrefsStore.batch2071.v2071knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2071: labeled mode
internal fun PlayerActivity.showV2071LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2071labeled
    FeaturePrefsStore.batch2071.v2071labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2071: landed mode
internal fun PlayerActivity.showV2071LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071landed
    FeaturePrefsStore.batch2071.v2071landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2071: launched mode
internal fun PlayerActivity.showV2071LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071launched
    FeaturePrefsStore.batch2071.v2071launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2071: layered level
internal fun PlayerActivity.showV2071LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2071: leaned level
internal fun PlayerActivity.showV2071LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2071: leaped level
internal fun PlayerActivity.showV2071LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2071: learned level
internal fun PlayerActivity.showV2071LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2071: leveraged level
internal fun PlayerActivity.showV2071LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2071leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2071leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2071: licensed mode
internal fun PlayerActivity.showV2071LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071licensed
    FeaturePrefsStore.batch2071.v2071licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2071: lifted mode
internal fun PlayerActivity.showV2071LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071lifted
    FeaturePrefsStore.batch2071.v2071lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2071: lighted mode
internal fun PlayerActivity.showV2071LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071lighted
    FeaturePrefsStore.batch2071.v2071lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2071: liked mode
internal fun PlayerActivity.showV2071LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071liked
    FeaturePrefsStore.batch2071.v2071liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2071: limited mode
internal fun PlayerActivity.showV2071LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2071limited
    FeaturePrefsStore.batch2071.v2071limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2072: killed mode
internal fun PlayerActivity.showV2072KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2072killed
    FeaturePrefsStore.batch2071.v2072killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2072: knocked mode
internal fun PlayerActivity.showV2072KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072knocked
    FeaturePrefsStore.batch2071.v2072knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2072: labeled mode
internal fun PlayerActivity.showV2072LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2072labeled
    FeaturePrefsStore.batch2071.v2072labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2072: landed mode
internal fun PlayerActivity.showV2072LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072landed
    FeaturePrefsStore.batch2071.v2072landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2072: launched mode
internal fun PlayerActivity.showV2072LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072launched
    FeaturePrefsStore.batch2071.v2072launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2072: layered level
internal fun PlayerActivity.showV2072LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2072: leaned level
internal fun PlayerActivity.showV2072LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2072: leaped level
internal fun PlayerActivity.showV2072LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2072: learned level
internal fun PlayerActivity.showV2072LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2072: leveraged level
internal fun PlayerActivity.showV2072LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2072leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2072leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2072: licensed mode
internal fun PlayerActivity.showV2072LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072licensed
    FeaturePrefsStore.batch2071.v2072licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2072: lifted mode
internal fun PlayerActivity.showV2072LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072lifted
    FeaturePrefsStore.batch2071.v2072lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2072: lighted mode
internal fun PlayerActivity.showV2072LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072lighted
    FeaturePrefsStore.batch2071.v2072lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2072: liked mode
internal fun PlayerActivity.showV2072LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072liked
    FeaturePrefsStore.batch2071.v2072liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2072: limited mode
internal fun PlayerActivity.showV2072LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2072limited
    FeaturePrefsStore.batch2071.v2072limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2073: killed mode
internal fun PlayerActivity.showV2073KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2073killed
    FeaturePrefsStore.batch2071.v2073killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2073: knocked mode
internal fun PlayerActivity.showV2073KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073knocked
    FeaturePrefsStore.batch2071.v2073knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2073: labeled mode
internal fun PlayerActivity.showV2073LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2073labeled
    FeaturePrefsStore.batch2071.v2073labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2073: landed mode
internal fun PlayerActivity.showV2073LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073landed
    FeaturePrefsStore.batch2071.v2073landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2073: launched mode
internal fun PlayerActivity.showV2073LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073launched
    FeaturePrefsStore.batch2071.v2073launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2073: layered level
internal fun PlayerActivity.showV2073LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2073: leaned level
internal fun PlayerActivity.showV2073LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2073: leaped level
internal fun PlayerActivity.showV2073LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2073: learned level
internal fun PlayerActivity.showV2073LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2073: leveraged level
internal fun PlayerActivity.showV2073LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2073leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2073leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2073: licensed mode
internal fun PlayerActivity.showV2073LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073licensed
    FeaturePrefsStore.batch2071.v2073licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2073: lifted mode
internal fun PlayerActivity.showV2073LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073lifted
    FeaturePrefsStore.batch2071.v2073lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2073: lighted mode
internal fun PlayerActivity.showV2073LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073lighted
    FeaturePrefsStore.batch2071.v2073lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2073: liked mode
internal fun PlayerActivity.showV2073LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073liked
    FeaturePrefsStore.batch2071.v2073liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2073: limited mode
internal fun PlayerActivity.showV2073LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2073limited
    FeaturePrefsStore.batch2071.v2073limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2074: killed mode
internal fun PlayerActivity.showV2074KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2074killed
    FeaturePrefsStore.batch2071.v2074killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2074: knocked mode
internal fun PlayerActivity.showV2074KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074knocked
    FeaturePrefsStore.batch2071.v2074knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2074: labeled mode
internal fun PlayerActivity.showV2074LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2074labeled
    FeaturePrefsStore.batch2071.v2074labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2074: landed mode
internal fun PlayerActivity.showV2074LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074landed
    FeaturePrefsStore.batch2071.v2074landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2074: launched mode
internal fun PlayerActivity.showV2074LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074launched
    FeaturePrefsStore.batch2071.v2074launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2074: layered level
internal fun PlayerActivity.showV2074LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2074: leaned level
internal fun PlayerActivity.showV2074LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2074: leaped level
internal fun PlayerActivity.showV2074LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2074: learned level
internal fun PlayerActivity.showV2074LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2074: leveraged level
internal fun PlayerActivity.showV2074LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2074leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2074leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2074: licensed mode
internal fun PlayerActivity.showV2074LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074licensed
    FeaturePrefsStore.batch2071.v2074licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2074: lifted mode
internal fun PlayerActivity.showV2074LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074lifted
    FeaturePrefsStore.batch2071.v2074lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2074: lighted mode
internal fun PlayerActivity.showV2074LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074lighted
    FeaturePrefsStore.batch2071.v2074lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2074: liked mode
internal fun PlayerActivity.showV2074LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074liked
    FeaturePrefsStore.batch2071.v2074liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2074: limited mode
internal fun PlayerActivity.showV2074LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2074limited
    FeaturePrefsStore.batch2071.v2074limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2075: killed mode
internal fun PlayerActivity.showV2075KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2075killed
    FeaturePrefsStore.batch2071.v2075killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2075: knocked mode
internal fun PlayerActivity.showV2075KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075knocked
    FeaturePrefsStore.batch2071.v2075knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2075: labeled mode
internal fun PlayerActivity.showV2075LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2075labeled
    FeaturePrefsStore.batch2071.v2075labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2075: landed mode
internal fun PlayerActivity.showV2075LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075landed
    FeaturePrefsStore.batch2071.v2075landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2075: launched mode
internal fun PlayerActivity.showV2075LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075launched
    FeaturePrefsStore.batch2071.v2075launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2075: layered level
internal fun PlayerActivity.showV2075LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2075: leaned level
internal fun PlayerActivity.showV2075LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2075: leaped level
internal fun PlayerActivity.showV2075LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2075: learned level
internal fun PlayerActivity.showV2075LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2075: leveraged level
internal fun PlayerActivity.showV2075LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2075leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2075leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2075: licensed mode
internal fun PlayerActivity.showV2075LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075licensed
    FeaturePrefsStore.batch2071.v2075licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2075: lifted mode
internal fun PlayerActivity.showV2075LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075lifted
    FeaturePrefsStore.batch2071.v2075lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2075: lighted mode
internal fun PlayerActivity.showV2075LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075lighted
    FeaturePrefsStore.batch2071.v2075lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2075: liked mode
internal fun PlayerActivity.showV2075LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075liked
    FeaturePrefsStore.batch2071.v2075liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2075: limited mode
internal fun PlayerActivity.showV2075LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2075limited
    FeaturePrefsStore.batch2071.v2075limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2076: killed mode
internal fun PlayerActivity.showV2076KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2076killed
    FeaturePrefsStore.batch2071.v2076killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2076: knocked mode
internal fun PlayerActivity.showV2076KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076knocked
    FeaturePrefsStore.batch2071.v2076knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2076: labeled mode
internal fun PlayerActivity.showV2076LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2076labeled
    FeaturePrefsStore.batch2071.v2076labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2076: landed mode
internal fun PlayerActivity.showV2076LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076landed
    FeaturePrefsStore.batch2071.v2076landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2076: launched mode
internal fun PlayerActivity.showV2076LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076launched
    FeaturePrefsStore.batch2071.v2076launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2076: layered level
internal fun PlayerActivity.showV2076LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2076: leaned level
internal fun PlayerActivity.showV2076LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2076: leaped level
internal fun PlayerActivity.showV2076LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2076: learned level
internal fun PlayerActivity.showV2076LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2076: leveraged level
internal fun PlayerActivity.showV2076LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2076leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2076leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2076: licensed mode
internal fun PlayerActivity.showV2076LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076licensed
    FeaturePrefsStore.batch2071.v2076licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2076: lifted mode
internal fun PlayerActivity.showV2076LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076lifted
    FeaturePrefsStore.batch2071.v2076lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2076: lighted mode
internal fun PlayerActivity.showV2076LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076lighted
    FeaturePrefsStore.batch2071.v2076lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2076: liked mode
internal fun PlayerActivity.showV2076LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076liked
    FeaturePrefsStore.batch2071.v2076liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2076: limited mode
internal fun PlayerActivity.showV2076LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2076limited
    FeaturePrefsStore.batch2071.v2076limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2077: killed mode
internal fun PlayerActivity.showV2077KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2077killed
    FeaturePrefsStore.batch2071.v2077killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2077: knocked mode
internal fun PlayerActivity.showV2077KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077knocked
    FeaturePrefsStore.batch2071.v2077knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2077: labeled mode
internal fun PlayerActivity.showV2077LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2077labeled
    FeaturePrefsStore.batch2071.v2077labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2077: landed mode
internal fun PlayerActivity.showV2077LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077landed
    FeaturePrefsStore.batch2071.v2077landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2077: launched mode
internal fun PlayerActivity.showV2077LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077launched
    FeaturePrefsStore.batch2071.v2077launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2077: layered level
internal fun PlayerActivity.showV2077LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2077: leaned level
internal fun PlayerActivity.showV2077LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2077: leaped level
internal fun PlayerActivity.showV2077LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2077: learned level
internal fun PlayerActivity.showV2077LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2077: leveraged level
internal fun PlayerActivity.showV2077LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2077leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2077leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2077: licensed mode
internal fun PlayerActivity.showV2077LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077licensed
    FeaturePrefsStore.batch2071.v2077licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2077: lifted mode
internal fun PlayerActivity.showV2077LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077lifted
    FeaturePrefsStore.batch2071.v2077lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2077: lighted mode
internal fun PlayerActivity.showV2077LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077lighted
    FeaturePrefsStore.batch2071.v2077lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2077: liked mode
internal fun PlayerActivity.showV2077LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077liked
    FeaturePrefsStore.batch2071.v2077liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2077: limited mode
internal fun PlayerActivity.showV2077LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2077limited
    FeaturePrefsStore.batch2071.v2077limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2078: killed mode
internal fun PlayerActivity.showV2078KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2078killed
    FeaturePrefsStore.batch2071.v2078killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2078: knocked mode
internal fun PlayerActivity.showV2078KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078knocked
    FeaturePrefsStore.batch2071.v2078knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2078: labeled mode
internal fun PlayerActivity.showV2078LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2078labeled
    FeaturePrefsStore.batch2071.v2078labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2078: landed mode
internal fun PlayerActivity.showV2078LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078landed
    FeaturePrefsStore.batch2071.v2078landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2078: launched mode
internal fun PlayerActivity.showV2078LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078launched
    FeaturePrefsStore.batch2071.v2078launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2078: layered level
internal fun PlayerActivity.showV2078LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2078: leaned level
internal fun PlayerActivity.showV2078LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2078: leaped level
internal fun PlayerActivity.showV2078LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2078: learned level
internal fun PlayerActivity.showV2078LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2078: leveraged level
internal fun PlayerActivity.showV2078LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2078leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2078leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2078: licensed mode
internal fun PlayerActivity.showV2078LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078licensed
    FeaturePrefsStore.batch2071.v2078licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2078: lifted mode
internal fun PlayerActivity.showV2078LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078lifted
    FeaturePrefsStore.batch2071.v2078lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2078: lighted mode
internal fun PlayerActivity.showV2078LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078lighted
    FeaturePrefsStore.batch2071.v2078lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2078: liked mode
internal fun PlayerActivity.showV2078LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078liked
    FeaturePrefsStore.batch2071.v2078liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2078: limited mode
internal fun PlayerActivity.showV2078LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2078limited
    FeaturePrefsStore.batch2071.v2078limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2079: killed mode
internal fun PlayerActivity.showV2079KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2079killed
    FeaturePrefsStore.batch2071.v2079killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2079: knocked mode
internal fun PlayerActivity.showV2079KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079knocked
    FeaturePrefsStore.batch2071.v2079knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2079: labeled mode
internal fun PlayerActivity.showV2079LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2079labeled
    FeaturePrefsStore.batch2071.v2079labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2079: landed mode
internal fun PlayerActivity.showV2079LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079landed
    FeaturePrefsStore.batch2071.v2079landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2079: launched mode
internal fun PlayerActivity.showV2079LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079launched
    FeaturePrefsStore.batch2071.v2079launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2079: layered level
internal fun PlayerActivity.showV2079LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2079: leaned level
internal fun PlayerActivity.showV2079LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2079: leaped level
internal fun PlayerActivity.showV2079LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2079: learned level
internal fun PlayerActivity.showV2079LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2079: leveraged level
internal fun PlayerActivity.showV2079LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2079leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2079leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2079: licensed mode
internal fun PlayerActivity.showV2079LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079licensed
    FeaturePrefsStore.batch2071.v2079licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2079: lifted mode
internal fun PlayerActivity.showV2079LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079lifted
    FeaturePrefsStore.batch2071.v2079lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2079: lighted mode
internal fun PlayerActivity.showV2079LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079lighted
    FeaturePrefsStore.batch2071.v2079lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2079: liked mode
internal fun PlayerActivity.showV2079LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079liked
    FeaturePrefsStore.batch2071.v2079liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2079: limited mode
internal fun PlayerActivity.showV2079LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2079limited
    FeaturePrefsStore.batch2071.v2079limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

// v2080: killed mode
internal fun PlayerActivity.showV2080KilledToggle() {
    val current = FeaturePrefsStore.batch2071.v2080killed
    FeaturePrefsStore.batch2071.v2080killed = !current
    AppToast.show(this, "killed: ${if (!current) "ON" else "OFF"}")
}

// v2080: knocked mode
internal fun PlayerActivity.showV2080KnockedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080knocked
    FeaturePrefsStore.batch2071.v2080knocked = !current
    AppToast.show(this, "knocked: ${if (!current) "ON" else "OFF"}")
}

// v2080: labeled mode
internal fun PlayerActivity.showV2080LabeledToggle() {
    val current = FeaturePrefsStore.batch2071.v2080labeled
    FeaturePrefsStore.batch2071.v2080labeled = !current
    AppToast.show(this, "labeled: ${if (!current) "ON" else "OFF"}")
}

// v2080: landed mode
internal fun PlayerActivity.showV2080LandedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080landed
    FeaturePrefsStore.batch2071.v2080landed = !current
    AppToast.show(this, "landed: ${if (!current) "ON" else "OFF"}")
}

// v2080: launched mode
internal fun PlayerActivity.showV2080LaunchedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080launched
    FeaturePrefsStore.batch2071.v2080launched = !current
    AppToast.show(this, "launched: ${if (!current) "ON" else "OFF"}")
}

// v2080: layered level
internal fun PlayerActivity.showV2080LayeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080layered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "layered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080layered = value
        AppToast.show(this, "layered: $value")
    }
}

// v2080: leaned level
internal fun PlayerActivity.showV2080LeanedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080leaned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080leaned = value
        AppToast.show(this, "leaned: $value")
    }
}

// v2080: leaped level
internal fun PlayerActivity.showV2080LeapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080leaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080leaped = value
        AppToast.show(this, "leaped: $value")
    }
}

// v2080: learned level
internal fun PlayerActivity.showV2080LearnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080learned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "learned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080learned = value
        AppToast.show(this, "learned: $value")
    }
}

// v2080: leveraged level
internal fun PlayerActivity.showV2080LeveragedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2071.v2080leveraged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "leveraged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2071.v2080leveraged = value
        AppToast.show(this, "leveraged: $value")
    }
}

// v2080: licensed mode
internal fun PlayerActivity.showV2080LicensedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080licensed
    FeaturePrefsStore.batch2071.v2080licensed = !current
    AppToast.show(this, "licensed: ${if (!current) "ON" else "OFF"}")
}

// v2080: lifted mode
internal fun PlayerActivity.showV2080LiftedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080lifted
    FeaturePrefsStore.batch2071.v2080lifted = !current
    AppToast.show(this, "lifted: ${if (!current) "ON" else "OFF"}")
}

// v2080: lighted mode
internal fun PlayerActivity.showV2080LightedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080lighted
    FeaturePrefsStore.batch2071.v2080lighted = !current
    AppToast.show(this, "lighted: ${if (!current) "ON" else "OFF"}")
}

// v2080: liked mode
internal fun PlayerActivity.showV2080LikedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080liked
    FeaturePrefsStore.batch2071.v2080liked = !current
    AppToast.show(this, "liked: ${if (!current) "ON" else "OFF"}")
}

// v2080: limited mode
internal fun PlayerActivity.showV2080LimitedToggle() {
    val current = FeaturePrefsStore.batch2071.v2080limited
    FeaturePrefsStore.batch2071.v2080limited = !current
    AppToast.show(this, "limited: ${if (!current) "ON" else "OFF"}")
}

