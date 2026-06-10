package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1581: juice mode
internal fun PlayerActivity.showV1581JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1581juice
    FeaturePrefsStore.batch1581.v1581juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1581: jungle mode
internal fun PlayerActivity.showV1581JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1581jungle
    FeaturePrefsStore.batch1581.v1581jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1581: junior mode
internal fun PlayerActivity.showV1581JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1581junior
    FeaturePrefsStore.batch1581.v1581junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1581: junk mode
internal fun PlayerActivity.showV1581JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1581junk
    FeaturePrefsStore.batch1581.v1581junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1581: jury mode
internal fun PlayerActivity.showV1581JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1581jury
    FeaturePrefsStore.batch1581.v1581jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1581: just level
internal fun PlayerActivity.showV1581JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581just = value
        AppToast.show(this, "just: $value")
    }
}

// v1581: keen level
internal fun PlayerActivity.showV1581KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1581: keep level
internal fun PlayerActivity.showV1581KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1581: ketchup level
internal fun PlayerActivity.showV1581KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1581: kick level
internal fun PlayerActivity.showV1581KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1581kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1581kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1581: kid mode
internal fun PlayerActivity.showV1581KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kid
    FeaturePrefsStore.batch1581.v1581kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1581: kidney mode
internal fun PlayerActivity.showV1581KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kidney
    FeaturePrefsStore.batch1581.v1581kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1581: kind mode
internal fun PlayerActivity.showV1581KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kind
    FeaturePrefsStore.batch1581.v1581kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1581: kingdom mode
internal fun PlayerActivity.showV1581KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kingdom
    FeaturePrefsStore.batch1581.v1581kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1581: kiss mode
internal fun PlayerActivity.showV1581KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1581kiss
    FeaturePrefsStore.batch1581.v1581kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1582: juice mode
internal fun PlayerActivity.showV1582JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1582juice
    FeaturePrefsStore.batch1581.v1582juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1582: jungle mode
internal fun PlayerActivity.showV1582JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1582jungle
    FeaturePrefsStore.batch1581.v1582jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1582: junior mode
internal fun PlayerActivity.showV1582JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1582junior
    FeaturePrefsStore.batch1581.v1582junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1582: junk mode
internal fun PlayerActivity.showV1582JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1582junk
    FeaturePrefsStore.batch1581.v1582junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1582: jury mode
internal fun PlayerActivity.showV1582JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1582jury
    FeaturePrefsStore.batch1581.v1582jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1582: just level
internal fun PlayerActivity.showV1582JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582just = value
        AppToast.show(this, "just: $value")
    }
}

// v1582: keen level
internal fun PlayerActivity.showV1582KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1582: keep level
internal fun PlayerActivity.showV1582KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1582: ketchup level
internal fun PlayerActivity.showV1582KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1582: kick level
internal fun PlayerActivity.showV1582KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1582kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1582kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1582: kid mode
internal fun PlayerActivity.showV1582KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kid
    FeaturePrefsStore.batch1581.v1582kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1582: kidney mode
internal fun PlayerActivity.showV1582KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kidney
    FeaturePrefsStore.batch1581.v1582kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1582: kind mode
internal fun PlayerActivity.showV1582KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kind
    FeaturePrefsStore.batch1581.v1582kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1582: kingdom mode
internal fun PlayerActivity.showV1582KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kingdom
    FeaturePrefsStore.batch1581.v1582kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1582: kiss mode
internal fun PlayerActivity.showV1582KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1582kiss
    FeaturePrefsStore.batch1581.v1582kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1583: juice mode
internal fun PlayerActivity.showV1583JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1583juice
    FeaturePrefsStore.batch1581.v1583juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1583: jungle mode
internal fun PlayerActivity.showV1583JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1583jungle
    FeaturePrefsStore.batch1581.v1583jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1583: junior mode
internal fun PlayerActivity.showV1583JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1583junior
    FeaturePrefsStore.batch1581.v1583junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1583: junk mode
internal fun PlayerActivity.showV1583JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1583junk
    FeaturePrefsStore.batch1581.v1583junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1583: jury mode
internal fun PlayerActivity.showV1583JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1583jury
    FeaturePrefsStore.batch1581.v1583jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1583: just level
internal fun PlayerActivity.showV1583JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583just = value
        AppToast.show(this, "just: $value")
    }
}

// v1583: keen level
internal fun PlayerActivity.showV1583KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1583: keep level
internal fun PlayerActivity.showV1583KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1583: ketchup level
internal fun PlayerActivity.showV1583KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1583: kick level
internal fun PlayerActivity.showV1583KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1583kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1583kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1583: kid mode
internal fun PlayerActivity.showV1583KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kid
    FeaturePrefsStore.batch1581.v1583kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1583: kidney mode
internal fun PlayerActivity.showV1583KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kidney
    FeaturePrefsStore.batch1581.v1583kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1583: kind mode
internal fun PlayerActivity.showV1583KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kind
    FeaturePrefsStore.batch1581.v1583kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1583: kingdom mode
internal fun PlayerActivity.showV1583KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kingdom
    FeaturePrefsStore.batch1581.v1583kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1583: kiss mode
internal fun PlayerActivity.showV1583KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1583kiss
    FeaturePrefsStore.batch1581.v1583kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1584: juice mode
internal fun PlayerActivity.showV1584JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1584juice
    FeaturePrefsStore.batch1581.v1584juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1584: jungle mode
internal fun PlayerActivity.showV1584JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1584jungle
    FeaturePrefsStore.batch1581.v1584jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1584: junior mode
internal fun PlayerActivity.showV1584JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1584junior
    FeaturePrefsStore.batch1581.v1584junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1584: junk mode
internal fun PlayerActivity.showV1584JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1584junk
    FeaturePrefsStore.batch1581.v1584junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1584: jury mode
internal fun PlayerActivity.showV1584JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1584jury
    FeaturePrefsStore.batch1581.v1584jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1584: just level
internal fun PlayerActivity.showV1584JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584just = value
        AppToast.show(this, "just: $value")
    }
}

// v1584: keen level
internal fun PlayerActivity.showV1584KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1584: keep level
internal fun PlayerActivity.showV1584KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1584: ketchup level
internal fun PlayerActivity.showV1584KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1584: kick level
internal fun PlayerActivity.showV1584KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1584kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1584kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1584: kid mode
internal fun PlayerActivity.showV1584KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kid
    FeaturePrefsStore.batch1581.v1584kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1584: kidney mode
internal fun PlayerActivity.showV1584KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kidney
    FeaturePrefsStore.batch1581.v1584kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1584: kind mode
internal fun PlayerActivity.showV1584KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kind
    FeaturePrefsStore.batch1581.v1584kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1584: kingdom mode
internal fun PlayerActivity.showV1584KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kingdom
    FeaturePrefsStore.batch1581.v1584kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1584: kiss mode
internal fun PlayerActivity.showV1584KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1584kiss
    FeaturePrefsStore.batch1581.v1584kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1585: juice mode
internal fun PlayerActivity.showV1585JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1585juice
    FeaturePrefsStore.batch1581.v1585juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1585: jungle mode
internal fun PlayerActivity.showV1585JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1585jungle
    FeaturePrefsStore.batch1581.v1585jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1585: junior mode
internal fun PlayerActivity.showV1585JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1585junior
    FeaturePrefsStore.batch1581.v1585junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1585: junk mode
internal fun PlayerActivity.showV1585JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1585junk
    FeaturePrefsStore.batch1581.v1585junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1585: jury mode
internal fun PlayerActivity.showV1585JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1585jury
    FeaturePrefsStore.batch1581.v1585jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1585: just level
internal fun PlayerActivity.showV1585JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585just = value
        AppToast.show(this, "just: $value")
    }
}

// v1585: keen level
internal fun PlayerActivity.showV1585KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1585: keep level
internal fun PlayerActivity.showV1585KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1585: ketchup level
internal fun PlayerActivity.showV1585KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1585: kick level
internal fun PlayerActivity.showV1585KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1585kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1585kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1585: kid mode
internal fun PlayerActivity.showV1585KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kid
    FeaturePrefsStore.batch1581.v1585kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1585: kidney mode
internal fun PlayerActivity.showV1585KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kidney
    FeaturePrefsStore.batch1581.v1585kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1585: kind mode
internal fun PlayerActivity.showV1585KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kind
    FeaturePrefsStore.batch1581.v1585kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1585: kingdom mode
internal fun PlayerActivity.showV1585KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kingdom
    FeaturePrefsStore.batch1581.v1585kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1585: kiss mode
internal fun PlayerActivity.showV1585KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1585kiss
    FeaturePrefsStore.batch1581.v1585kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1586: juice mode
internal fun PlayerActivity.showV1586JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1586juice
    FeaturePrefsStore.batch1581.v1586juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1586: jungle mode
internal fun PlayerActivity.showV1586JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1586jungle
    FeaturePrefsStore.batch1581.v1586jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1586: junior mode
internal fun PlayerActivity.showV1586JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1586junior
    FeaturePrefsStore.batch1581.v1586junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1586: junk mode
internal fun PlayerActivity.showV1586JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1586junk
    FeaturePrefsStore.batch1581.v1586junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1586: jury mode
internal fun PlayerActivity.showV1586JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1586jury
    FeaturePrefsStore.batch1581.v1586jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1586: just level
internal fun PlayerActivity.showV1586JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586just = value
        AppToast.show(this, "just: $value")
    }
}

// v1586: keen level
internal fun PlayerActivity.showV1586KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1586: keep level
internal fun PlayerActivity.showV1586KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1586: ketchup level
internal fun PlayerActivity.showV1586KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1586: kick level
internal fun PlayerActivity.showV1586KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1586kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1586kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1586: kid mode
internal fun PlayerActivity.showV1586KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kid
    FeaturePrefsStore.batch1581.v1586kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1586: kidney mode
internal fun PlayerActivity.showV1586KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kidney
    FeaturePrefsStore.batch1581.v1586kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1586: kind mode
internal fun PlayerActivity.showV1586KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kind
    FeaturePrefsStore.batch1581.v1586kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1586: kingdom mode
internal fun PlayerActivity.showV1586KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kingdom
    FeaturePrefsStore.batch1581.v1586kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1586: kiss mode
internal fun PlayerActivity.showV1586KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1586kiss
    FeaturePrefsStore.batch1581.v1586kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1587: juice mode
internal fun PlayerActivity.showV1587JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1587juice
    FeaturePrefsStore.batch1581.v1587juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1587: jungle mode
internal fun PlayerActivity.showV1587JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1587jungle
    FeaturePrefsStore.batch1581.v1587jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1587: junior mode
internal fun PlayerActivity.showV1587JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1587junior
    FeaturePrefsStore.batch1581.v1587junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1587: junk mode
internal fun PlayerActivity.showV1587JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1587junk
    FeaturePrefsStore.batch1581.v1587junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1587: jury mode
internal fun PlayerActivity.showV1587JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1587jury
    FeaturePrefsStore.batch1581.v1587jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1587: just level
internal fun PlayerActivity.showV1587JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587just = value
        AppToast.show(this, "just: $value")
    }
}

// v1587: keen level
internal fun PlayerActivity.showV1587KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1587: keep level
internal fun PlayerActivity.showV1587KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1587: ketchup level
internal fun PlayerActivity.showV1587KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1587: kick level
internal fun PlayerActivity.showV1587KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1587kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1587kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1587: kid mode
internal fun PlayerActivity.showV1587KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kid
    FeaturePrefsStore.batch1581.v1587kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1587: kidney mode
internal fun PlayerActivity.showV1587KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kidney
    FeaturePrefsStore.batch1581.v1587kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1587: kind mode
internal fun PlayerActivity.showV1587KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kind
    FeaturePrefsStore.batch1581.v1587kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1587: kingdom mode
internal fun PlayerActivity.showV1587KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kingdom
    FeaturePrefsStore.batch1581.v1587kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1587: kiss mode
internal fun PlayerActivity.showV1587KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1587kiss
    FeaturePrefsStore.batch1581.v1587kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1588: juice mode
internal fun PlayerActivity.showV1588JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1588juice
    FeaturePrefsStore.batch1581.v1588juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1588: jungle mode
internal fun PlayerActivity.showV1588JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1588jungle
    FeaturePrefsStore.batch1581.v1588jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1588: junior mode
internal fun PlayerActivity.showV1588JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1588junior
    FeaturePrefsStore.batch1581.v1588junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1588: junk mode
internal fun PlayerActivity.showV1588JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1588junk
    FeaturePrefsStore.batch1581.v1588junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1588: jury mode
internal fun PlayerActivity.showV1588JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1588jury
    FeaturePrefsStore.batch1581.v1588jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1588: just level
internal fun PlayerActivity.showV1588JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588just = value
        AppToast.show(this, "just: $value")
    }
}

// v1588: keen level
internal fun PlayerActivity.showV1588KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1588: keep level
internal fun PlayerActivity.showV1588KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1588: ketchup level
internal fun PlayerActivity.showV1588KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1588: kick level
internal fun PlayerActivity.showV1588KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1588kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1588kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1588: kid mode
internal fun PlayerActivity.showV1588KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kid
    FeaturePrefsStore.batch1581.v1588kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1588: kidney mode
internal fun PlayerActivity.showV1588KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kidney
    FeaturePrefsStore.batch1581.v1588kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1588: kind mode
internal fun PlayerActivity.showV1588KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kind
    FeaturePrefsStore.batch1581.v1588kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1588: kingdom mode
internal fun PlayerActivity.showV1588KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kingdom
    FeaturePrefsStore.batch1581.v1588kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1588: kiss mode
internal fun PlayerActivity.showV1588KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1588kiss
    FeaturePrefsStore.batch1581.v1588kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1589: juice mode
internal fun PlayerActivity.showV1589JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1589juice
    FeaturePrefsStore.batch1581.v1589juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1589: jungle mode
internal fun PlayerActivity.showV1589JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1589jungle
    FeaturePrefsStore.batch1581.v1589jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1589: junior mode
internal fun PlayerActivity.showV1589JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1589junior
    FeaturePrefsStore.batch1581.v1589junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1589: junk mode
internal fun PlayerActivity.showV1589JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1589junk
    FeaturePrefsStore.batch1581.v1589junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1589: jury mode
internal fun PlayerActivity.showV1589JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1589jury
    FeaturePrefsStore.batch1581.v1589jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1589: just level
internal fun PlayerActivity.showV1589JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589just = value
        AppToast.show(this, "just: $value")
    }
}

// v1589: keen level
internal fun PlayerActivity.showV1589KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1589: keep level
internal fun PlayerActivity.showV1589KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1589: ketchup level
internal fun PlayerActivity.showV1589KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1589: kick level
internal fun PlayerActivity.showV1589KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1589kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1589kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1589: kid mode
internal fun PlayerActivity.showV1589KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kid
    FeaturePrefsStore.batch1581.v1589kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1589: kidney mode
internal fun PlayerActivity.showV1589KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kidney
    FeaturePrefsStore.batch1581.v1589kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1589: kind mode
internal fun PlayerActivity.showV1589KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kind
    FeaturePrefsStore.batch1581.v1589kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1589: kingdom mode
internal fun PlayerActivity.showV1589KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kingdom
    FeaturePrefsStore.batch1581.v1589kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1589: kiss mode
internal fun PlayerActivity.showV1589KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1589kiss
    FeaturePrefsStore.batch1581.v1589kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

// v1590: juice mode
internal fun PlayerActivity.showV1590JuiceToggle() {
    val current = FeaturePrefsStore.batch1581.v1590juice
    FeaturePrefsStore.batch1581.v1590juice = !current
    AppToast.show(this, "juice: ${if (!current) "ON" else "OFF"}")
}

// v1590: jungle mode
internal fun PlayerActivity.showV1590JungleToggle() {
    val current = FeaturePrefsStore.batch1581.v1590jungle
    FeaturePrefsStore.batch1581.v1590jungle = !current
    AppToast.show(this, "jungle: ${if (!current) "ON" else "OFF"}")
}

// v1590: junior mode
internal fun PlayerActivity.showV1590JuniorToggle() {
    val current = FeaturePrefsStore.batch1581.v1590junior
    FeaturePrefsStore.batch1581.v1590junior = !current
    AppToast.show(this, "junior: ${if (!current) "ON" else "OFF"}")
}

// v1590: junk mode
internal fun PlayerActivity.showV1590JunkToggle() {
    val current = FeaturePrefsStore.batch1581.v1590junk
    FeaturePrefsStore.batch1581.v1590junk = !current
    AppToast.show(this, "junk: ${if (!current) "ON" else "OFF"}")
}

// v1590: jury mode
internal fun PlayerActivity.showV1590JuryToggle() {
    val current = FeaturePrefsStore.batch1581.v1590jury
    FeaturePrefsStore.batch1581.v1590jury = !current
    AppToast.show(this, "jury: ${if (!current) "ON" else "OFF"}")
}

// v1590: just level
internal fun PlayerActivity.showV1590JustDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590just).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "just level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590just = value
        AppToast.show(this, "just: $value")
    }
}

// v1590: keen level
internal fun PlayerActivity.showV1590KeenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590keen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590keen = value
        AppToast.show(this, "keen: $value")
    }
}

// v1590: keep level
internal fun PlayerActivity.showV1590KeepDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590keep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "keep level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590keep = value
        AppToast.show(this, "keep: $value")
    }
}

// v1590: ketchup level
internal fun PlayerActivity.showV1590KetchupDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590ketchup).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ketchup level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590ketchup = value
        AppToast.show(this, "ketchup: $value")
    }
}

// v1590: kick level
internal fun PlayerActivity.showV1590KickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1581.v1590kick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1581.v1590kick = value
        AppToast.show(this, "kick: $value")
    }
}

// v1590: kid mode
internal fun PlayerActivity.showV1590KidToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kid
    FeaturePrefsStore.batch1581.v1590kid = !current
    AppToast.show(this, "kid: ${if (!current) "ON" else "OFF"}")
}

// v1590: kidney mode
internal fun PlayerActivity.showV1590KidneyToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kidney
    FeaturePrefsStore.batch1581.v1590kidney = !current
    AppToast.show(this, "kidney: ${if (!current) "ON" else "OFF"}")
}

// v1590: kind mode
internal fun PlayerActivity.showV1590KindToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kind
    FeaturePrefsStore.batch1581.v1590kind = !current
    AppToast.show(this, "kind: ${if (!current) "ON" else "OFF"}")
}

// v1590: kingdom mode
internal fun PlayerActivity.showV1590KingdomToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kingdom
    FeaturePrefsStore.batch1581.v1590kingdom = !current
    AppToast.show(this, "kingdom: ${if (!current) "ON" else "OFF"}")
}

// v1590: kiss mode
internal fun PlayerActivity.showV1590KissToggle() {
    val current = FeaturePrefsStore.batch1581.v1590kiss
    FeaturePrefsStore.batch1581.v1590kiss = !current
    AppToast.show(this, "kiss: ${if (!current) "ON" else "OFF"}")
}

