package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



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

