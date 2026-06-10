package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1681: police mode
internal fun PlayerActivity.showV1681PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1681police
    FeaturePrefsStore.batch1681.v1681police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1681: pond mode
internal fun PlayerActivity.showV1681PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1681pond
    FeaturePrefsStore.batch1681.v1681pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1681: pony mode
internal fun PlayerActivity.showV1681PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1681pony
    FeaturePrefsStore.batch1681.v1681pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1681: popular mode
internal fun PlayerActivity.showV1681PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1681popular
    FeaturePrefsStore.batch1681.v1681popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1681: portion mode
internal fun PlayerActivity.showV1681PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1681portion
    FeaturePrefsStore.batch1681.v1681portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1681: pose level
internal fun PlayerActivity.showV1681PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1681: possible level
internal fun PlayerActivity.showV1681PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1681: potato level
internal fun PlayerActivity.showV1681PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1681: pottery level
internal fun PlayerActivity.showV1681PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1681: poverty level
internal fun PlayerActivity.showV1681PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1681: powder mode
internal fun PlayerActivity.showV1681PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1681powder
    FeaturePrefsStore.batch1681.v1681powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1681: practice mode
internal fun PlayerActivity.showV1681PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1681practice
    FeaturePrefsStore.batch1681.v1681practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1681: praise mode
internal fun PlayerActivity.showV1681PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1681praise
    FeaturePrefsStore.batch1681.v1681praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1681: prefer mode
internal fun PlayerActivity.showV1681PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1681prefer
    FeaturePrefsStore.batch1681.v1681prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1681: pretty mode
internal fun PlayerActivity.showV1681PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1681pretty
    FeaturePrefsStore.batch1681.v1681pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1682: police mode
internal fun PlayerActivity.showV1682PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1682police
    FeaturePrefsStore.batch1681.v1682police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1682: pond mode
internal fun PlayerActivity.showV1682PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1682pond
    FeaturePrefsStore.batch1681.v1682pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1682: pony mode
internal fun PlayerActivity.showV1682PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1682pony
    FeaturePrefsStore.batch1681.v1682pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1682: popular mode
internal fun PlayerActivity.showV1682PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1682popular
    FeaturePrefsStore.batch1681.v1682popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1682: portion mode
internal fun PlayerActivity.showV1682PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1682portion
    FeaturePrefsStore.batch1681.v1682portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1682: pose level
internal fun PlayerActivity.showV1682PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1682: possible level
internal fun PlayerActivity.showV1682PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1682: potato level
internal fun PlayerActivity.showV1682PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1682: pottery level
internal fun PlayerActivity.showV1682PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1682: poverty level
internal fun PlayerActivity.showV1682PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1682: powder mode
internal fun PlayerActivity.showV1682PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1682powder
    FeaturePrefsStore.batch1681.v1682powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1682: practice mode
internal fun PlayerActivity.showV1682PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1682practice
    FeaturePrefsStore.batch1681.v1682practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1682: praise mode
internal fun PlayerActivity.showV1682PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1682praise
    FeaturePrefsStore.batch1681.v1682praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1682: prefer mode
internal fun PlayerActivity.showV1682PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1682prefer
    FeaturePrefsStore.batch1681.v1682prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1682: pretty mode
internal fun PlayerActivity.showV1682PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1682pretty
    FeaturePrefsStore.batch1681.v1682pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1683: police mode
internal fun PlayerActivity.showV1683PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1683police
    FeaturePrefsStore.batch1681.v1683police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1683: pond mode
internal fun PlayerActivity.showV1683PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1683pond
    FeaturePrefsStore.batch1681.v1683pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1683: pony mode
internal fun PlayerActivity.showV1683PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1683pony
    FeaturePrefsStore.batch1681.v1683pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1683: popular mode
internal fun PlayerActivity.showV1683PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1683popular
    FeaturePrefsStore.batch1681.v1683popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1683: portion mode
internal fun PlayerActivity.showV1683PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1683portion
    FeaturePrefsStore.batch1681.v1683portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1683: pose level
internal fun PlayerActivity.showV1683PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1683: possible level
internal fun PlayerActivity.showV1683PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1683: potato level
internal fun PlayerActivity.showV1683PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1683: pottery level
internal fun PlayerActivity.showV1683PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1683: poverty level
internal fun PlayerActivity.showV1683PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1683: powder mode
internal fun PlayerActivity.showV1683PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1683powder
    FeaturePrefsStore.batch1681.v1683powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1683: practice mode
internal fun PlayerActivity.showV1683PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1683practice
    FeaturePrefsStore.batch1681.v1683practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1683: praise mode
internal fun PlayerActivity.showV1683PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1683praise
    FeaturePrefsStore.batch1681.v1683praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1683: prefer mode
internal fun PlayerActivity.showV1683PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1683prefer
    FeaturePrefsStore.batch1681.v1683prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1683: pretty mode
internal fun PlayerActivity.showV1683PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1683pretty
    FeaturePrefsStore.batch1681.v1683pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1684: police mode
internal fun PlayerActivity.showV1684PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1684police
    FeaturePrefsStore.batch1681.v1684police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1684: pond mode
internal fun PlayerActivity.showV1684PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1684pond
    FeaturePrefsStore.batch1681.v1684pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1684: pony mode
internal fun PlayerActivity.showV1684PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1684pony
    FeaturePrefsStore.batch1681.v1684pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1684: popular mode
internal fun PlayerActivity.showV1684PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1684popular
    FeaturePrefsStore.batch1681.v1684popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1684: portion mode
internal fun PlayerActivity.showV1684PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1684portion
    FeaturePrefsStore.batch1681.v1684portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1684: pose level
internal fun PlayerActivity.showV1684PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1684: possible level
internal fun PlayerActivity.showV1684PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1684: potato level
internal fun PlayerActivity.showV1684PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1684: pottery level
internal fun PlayerActivity.showV1684PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1684: poverty level
internal fun PlayerActivity.showV1684PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1684: powder mode
internal fun PlayerActivity.showV1684PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1684powder
    FeaturePrefsStore.batch1681.v1684powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1684: practice mode
internal fun PlayerActivity.showV1684PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1684practice
    FeaturePrefsStore.batch1681.v1684practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1684: praise mode
internal fun PlayerActivity.showV1684PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1684praise
    FeaturePrefsStore.batch1681.v1684praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1684: prefer mode
internal fun PlayerActivity.showV1684PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1684prefer
    FeaturePrefsStore.batch1681.v1684prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1684: pretty mode
internal fun PlayerActivity.showV1684PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1684pretty
    FeaturePrefsStore.batch1681.v1684pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1685: police mode
internal fun PlayerActivity.showV1685PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1685police
    FeaturePrefsStore.batch1681.v1685police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1685: pond mode
internal fun PlayerActivity.showV1685PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1685pond
    FeaturePrefsStore.batch1681.v1685pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1685: pony mode
internal fun PlayerActivity.showV1685PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1685pony
    FeaturePrefsStore.batch1681.v1685pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1685: popular mode
internal fun PlayerActivity.showV1685PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1685popular
    FeaturePrefsStore.batch1681.v1685popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1685: portion mode
internal fun PlayerActivity.showV1685PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1685portion
    FeaturePrefsStore.batch1681.v1685portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1685: pose level
internal fun PlayerActivity.showV1685PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1685: possible level
internal fun PlayerActivity.showV1685PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1685: potato level
internal fun PlayerActivity.showV1685PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1685: pottery level
internal fun PlayerActivity.showV1685PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1685: poverty level
internal fun PlayerActivity.showV1685PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1685: powder mode
internal fun PlayerActivity.showV1685PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1685powder
    FeaturePrefsStore.batch1681.v1685powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1685: practice mode
internal fun PlayerActivity.showV1685PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1685practice
    FeaturePrefsStore.batch1681.v1685practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1685: praise mode
internal fun PlayerActivity.showV1685PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1685praise
    FeaturePrefsStore.batch1681.v1685praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1685: prefer mode
internal fun PlayerActivity.showV1685PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1685prefer
    FeaturePrefsStore.batch1681.v1685prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1685: pretty mode
internal fun PlayerActivity.showV1685PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1685pretty
    FeaturePrefsStore.batch1681.v1685pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1686: police mode
internal fun PlayerActivity.showV1686PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1686police
    FeaturePrefsStore.batch1681.v1686police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1686: pond mode
internal fun PlayerActivity.showV1686PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1686pond
    FeaturePrefsStore.batch1681.v1686pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1686: pony mode
internal fun PlayerActivity.showV1686PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1686pony
    FeaturePrefsStore.batch1681.v1686pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1686: popular mode
internal fun PlayerActivity.showV1686PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1686popular
    FeaturePrefsStore.batch1681.v1686popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1686: portion mode
internal fun PlayerActivity.showV1686PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1686portion
    FeaturePrefsStore.batch1681.v1686portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1686: pose level
internal fun PlayerActivity.showV1686PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1686: possible level
internal fun PlayerActivity.showV1686PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1686: potato level
internal fun PlayerActivity.showV1686PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1686: pottery level
internal fun PlayerActivity.showV1686PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1686: poverty level
internal fun PlayerActivity.showV1686PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1686: powder mode
internal fun PlayerActivity.showV1686PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1686powder
    FeaturePrefsStore.batch1681.v1686powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1686: practice mode
internal fun PlayerActivity.showV1686PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1686practice
    FeaturePrefsStore.batch1681.v1686practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1686: praise mode
internal fun PlayerActivity.showV1686PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1686praise
    FeaturePrefsStore.batch1681.v1686praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1686: prefer mode
internal fun PlayerActivity.showV1686PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1686prefer
    FeaturePrefsStore.batch1681.v1686prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1686: pretty mode
internal fun PlayerActivity.showV1686PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1686pretty
    FeaturePrefsStore.batch1681.v1686pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1687: police mode
internal fun PlayerActivity.showV1687PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1687police
    FeaturePrefsStore.batch1681.v1687police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1687: pond mode
internal fun PlayerActivity.showV1687PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1687pond
    FeaturePrefsStore.batch1681.v1687pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1687: pony mode
internal fun PlayerActivity.showV1687PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1687pony
    FeaturePrefsStore.batch1681.v1687pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1687: popular mode
internal fun PlayerActivity.showV1687PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1687popular
    FeaturePrefsStore.batch1681.v1687popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1687: portion mode
internal fun PlayerActivity.showV1687PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1687portion
    FeaturePrefsStore.batch1681.v1687portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1687: pose level
internal fun PlayerActivity.showV1687PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1687: possible level
internal fun PlayerActivity.showV1687PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1687: potato level
internal fun PlayerActivity.showV1687PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1687: pottery level
internal fun PlayerActivity.showV1687PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1687: poverty level
internal fun PlayerActivity.showV1687PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1687: powder mode
internal fun PlayerActivity.showV1687PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1687powder
    FeaturePrefsStore.batch1681.v1687powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1687: practice mode
internal fun PlayerActivity.showV1687PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1687practice
    FeaturePrefsStore.batch1681.v1687practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1687: praise mode
internal fun PlayerActivity.showV1687PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1687praise
    FeaturePrefsStore.batch1681.v1687praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1687: prefer mode
internal fun PlayerActivity.showV1687PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1687prefer
    FeaturePrefsStore.batch1681.v1687prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1687: pretty mode
internal fun PlayerActivity.showV1687PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1687pretty
    FeaturePrefsStore.batch1681.v1687pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1688: police mode
internal fun PlayerActivity.showV1688PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1688police
    FeaturePrefsStore.batch1681.v1688police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1688: pond mode
internal fun PlayerActivity.showV1688PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1688pond
    FeaturePrefsStore.batch1681.v1688pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1688: pony mode
internal fun PlayerActivity.showV1688PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1688pony
    FeaturePrefsStore.batch1681.v1688pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1688: popular mode
internal fun PlayerActivity.showV1688PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1688popular
    FeaturePrefsStore.batch1681.v1688popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1688: portion mode
internal fun PlayerActivity.showV1688PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1688portion
    FeaturePrefsStore.batch1681.v1688portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1688: pose level
internal fun PlayerActivity.showV1688PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1688: possible level
internal fun PlayerActivity.showV1688PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1688: potato level
internal fun PlayerActivity.showV1688PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1688: pottery level
internal fun PlayerActivity.showV1688PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1688: poverty level
internal fun PlayerActivity.showV1688PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1688: powder mode
internal fun PlayerActivity.showV1688PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1688powder
    FeaturePrefsStore.batch1681.v1688powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1688: practice mode
internal fun PlayerActivity.showV1688PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1688practice
    FeaturePrefsStore.batch1681.v1688practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1688: praise mode
internal fun PlayerActivity.showV1688PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1688praise
    FeaturePrefsStore.batch1681.v1688praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1688: prefer mode
internal fun PlayerActivity.showV1688PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1688prefer
    FeaturePrefsStore.batch1681.v1688prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1688: pretty mode
internal fun PlayerActivity.showV1688PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1688pretty
    FeaturePrefsStore.batch1681.v1688pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1689: police mode
internal fun PlayerActivity.showV1689PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1689police
    FeaturePrefsStore.batch1681.v1689police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1689: pond mode
internal fun PlayerActivity.showV1689PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1689pond
    FeaturePrefsStore.batch1681.v1689pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1689: pony mode
internal fun PlayerActivity.showV1689PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1689pony
    FeaturePrefsStore.batch1681.v1689pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1689: popular mode
internal fun PlayerActivity.showV1689PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1689popular
    FeaturePrefsStore.batch1681.v1689popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1689: portion mode
internal fun PlayerActivity.showV1689PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1689portion
    FeaturePrefsStore.batch1681.v1689portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1689: pose level
internal fun PlayerActivity.showV1689PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1689: possible level
internal fun PlayerActivity.showV1689PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1689: potato level
internal fun PlayerActivity.showV1689PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1689: pottery level
internal fun PlayerActivity.showV1689PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1689: poverty level
internal fun PlayerActivity.showV1689PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1689: powder mode
internal fun PlayerActivity.showV1689PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1689powder
    FeaturePrefsStore.batch1681.v1689powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1689: practice mode
internal fun PlayerActivity.showV1689PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1689practice
    FeaturePrefsStore.batch1681.v1689practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1689: praise mode
internal fun PlayerActivity.showV1689PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1689praise
    FeaturePrefsStore.batch1681.v1689praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1689: prefer mode
internal fun PlayerActivity.showV1689PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1689prefer
    FeaturePrefsStore.batch1681.v1689prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1689: pretty mode
internal fun PlayerActivity.showV1689PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1689pretty
    FeaturePrefsStore.batch1681.v1689pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1690: police mode
internal fun PlayerActivity.showV1690PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1690police
    FeaturePrefsStore.batch1681.v1690police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1690: pond mode
internal fun PlayerActivity.showV1690PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1690pond
    FeaturePrefsStore.batch1681.v1690pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1690: pony mode
internal fun PlayerActivity.showV1690PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1690pony
    FeaturePrefsStore.batch1681.v1690pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1690: popular mode
internal fun PlayerActivity.showV1690PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1690popular
    FeaturePrefsStore.batch1681.v1690popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1690: portion mode
internal fun PlayerActivity.showV1690PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1690portion
    FeaturePrefsStore.batch1681.v1690portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1690: pose level
internal fun PlayerActivity.showV1690PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1690: possible level
internal fun PlayerActivity.showV1690PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1690: potato level
internal fun PlayerActivity.showV1690PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1690: pottery level
internal fun PlayerActivity.showV1690PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1690: poverty level
internal fun PlayerActivity.showV1690PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1690: powder mode
internal fun PlayerActivity.showV1690PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1690powder
    FeaturePrefsStore.batch1681.v1690powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1690: practice mode
internal fun PlayerActivity.showV1690PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1690practice
    FeaturePrefsStore.batch1681.v1690practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1690: praise mode
internal fun PlayerActivity.showV1690PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1690praise
    FeaturePrefsStore.batch1681.v1690praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1690: prefer mode
internal fun PlayerActivity.showV1690PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1690prefer
    FeaturePrefsStore.batch1681.v1690prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1690: pretty mode
internal fun PlayerActivity.showV1690PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1690pretty
    FeaturePrefsStore.batch1681.v1690pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

