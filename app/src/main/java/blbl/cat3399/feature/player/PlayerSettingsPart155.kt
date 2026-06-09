package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1731: rely mode
internal fun PlayerActivity.showV1731RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1731rely
    FeaturePrefsStore.batch1731.v1731rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1731: remain mode
internal fun PlayerActivity.showV1731RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1731remain
    FeaturePrefsStore.batch1731.v1731remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1731: remedy mode
internal fun PlayerActivity.showV1731RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1731remedy
    FeaturePrefsStore.batch1731.v1731remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1731: remind mode
internal fun PlayerActivity.showV1731RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1731remind
    FeaturePrefsStore.batch1731.v1731remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1731: renew mode
internal fun PlayerActivity.showV1731RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1731renew
    FeaturePrefsStore.batch1731.v1731renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1731: rent level
internal fun PlayerActivity.showV1731RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1731: reopen level
internal fun PlayerActivity.showV1731ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1731: repair level
internal fun PlayerActivity.showV1731RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1731: rescue level
internal fun PlayerActivity.showV1731RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1731: resist level
internal fun PlayerActivity.showV1731ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1731resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1731resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1731: retire mode
internal fun PlayerActivity.showV1731RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1731retire
    FeaturePrefsStore.batch1731.v1731retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1731: retreat mode
internal fun PlayerActivity.showV1731RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1731retreat
    FeaturePrefsStore.batch1731.v1731retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1731: reunion mode
internal fun PlayerActivity.showV1731ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1731reunion
    FeaturePrefsStore.batch1731.v1731reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1731: reveal mode
internal fun PlayerActivity.showV1731RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1731reveal
    FeaturePrefsStore.batch1731.v1731reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1731: review mode
internal fun PlayerActivity.showV1731ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1731review
    FeaturePrefsStore.batch1731.v1731review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1732: rely mode
internal fun PlayerActivity.showV1732RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1732rely
    FeaturePrefsStore.batch1731.v1732rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1732: remain mode
internal fun PlayerActivity.showV1732RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1732remain
    FeaturePrefsStore.batch1731.v1732remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1732: remedy mode
internal fun PlayerActivity.showV1732RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1732remedy
    FeaturePrefsStore.batch1731.v1732remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1732: remind mode
internal fun PlayerActivity.showV1732RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1732remind
    FeaturePrefsStore.batch1731.v1732remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1732: renew mode
internal fun PlayerActivity.showV1732RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1732renew
    FeaturePrefsStore.batch1731.v1732renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1732: rent level
internal fun PlayerActivity.showV1732RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1732: reopen level
internal fun PlayerActivity.showV1732ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1732: repair level
internal fun PlayerActivity.showV1732RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1732: rescue level
internal fun PlayerActivity.showV1732RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1732: resist level
internal fun PlayerActivity.showV1732ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1732resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1732resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1732: retire mode
internal fun PlayerActivity.showV1732RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1732retire
    FeaturePrefsStore.batch1731.v1732retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1732: retreat mode
internal fun PlayerActivity.showV1732RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1732retreat
    FeaturePrefsStore.batch1731.v1732retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1732: reunion mode
internal fun PlayerActivity.showV1732ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1732reunion
    FeaturePrefsStore.batch1731.v1732reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1732: reveal mode
internal fun PlayerActivity.showV1732RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1732reveal
    FeaturePrefsStore.batch1731.v1732reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1732: review mode
internal fun PlayerActivity.showV1732ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1732review
    FeaturePrefsStore.batch1731.v1732review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1733: rely mode
internal fun PlayerActivity.showV1733RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1733rely
    FeaturePrefsStore.batch1731.v1733rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1733: remain mode
internal fun PlayerActivity.showV1733RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1733remain
    FeaturePrefsStore.batch1731.v1733remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1733: remedy mode
internal fun PlayerActivity.showV1733RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1733remedy
    FeaturePrefsStore.batch1731.v1733remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1733: remind mode
internal fun PlayerActivity.showV1733RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1733remind
    FeaturePrefsStore.batch1731.v1733remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1733: renew mode
internal fun PlayerActivity.showV1733RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1733renew
    FeaturePrefsStore.batch1731.v1733renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1733: rent level
internal fun PlayerActivity.showV1733RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1733: reopen level
internal fun PlayerActivity.showV1733ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1733: repair level
internal fun PlayerActivity.showV1733RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1733: rescue level
internal fun PlayerActivity.showV1733RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1733: resist level
internal fun PlayerActivity.showV1733ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1733resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1733resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1733: retire mode
internal fun PlayerActivity.showV1733RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1733retire
    FeaturePrefsStore.batch1731.v1733retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1733: retreat mode
internal fun PlayerActivity.showV1733RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1733retreat
    FeaturePrefsStore.batch1731.v1733retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1733: reunion mode
internal fun PlayerActivity.showV1733ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1733reunion
    FeaturePrefsStore.batch1731.v1733reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1733: reveal mode
internal fun PlayerActivity.showV1733RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1733reveal
    FeaturePrefsStore.batch1731.v1733reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1733: review mode
internal fun PlayerActivity.showV1733ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1733review
    FeaturePrefsStore.batch1731.v1733review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1734: rely mode
internal fun PlayerActivity.showV1734RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1734rely
    FeaturePrefsStore.batch1731.v1734rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1734: remain mode
internal fun PlayerActivity.showV1734RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1734remain
    FeaturePrefsStore.batch1731.v1734remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1734: remedy mode
internal fun PlayerActivity.showV1734RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1734remedy
    FeaturePrefsStore.batch1731.v1734remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1734: remind mode
internal fun PlayerActivity.showV1734RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1734remind
    FeaturePrefsStore.batch1731.v1734remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1734: renew mode
internal fun PlayerActivity.showV1734RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1734renew
    FeaturePrefsStore.batch1731.v1734renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1734: rent level
internal fun PlayerActivity.showV1734RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1734: reopen level
internal fun PlayerActivity.showV1734ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1734: repair level
internal fun PlayerActivity.showV1734RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1734: rescue level
internal fun PlayerActivity.showV1734RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1734: resist level
internal fun PlayerActivity.showV1734ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1734resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1734resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1734: retire mode
internal fun PlayerActivity.showV1734RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1734retire
    FeaturePrefsStore.batch1731.v1734retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1734: retreat mode
internal fun PlayerActivity.showV1734RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1734retreat
    FeaturePrefsStore.batch1731.v1734retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1734: reunion mode
internal fun PlayerActivity.showV1734ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1734reunion
    FeaturePrefsStore.batch1731.v1734reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1734: reveal mode
internal fun PlayerActivity.showV1734RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1734reveal
    FeaturePrefsStore.batch1731.v1734reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1734: review mode
internal fun PlayerActivity.showV1734ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1734review
    FeaturePrefsStore.batch1731.v1734review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1735: rely mode
internal fun PlayerActivity.showV1735RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1735rely
    FeaturePrefsStore.batch1731.v1735rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1735: remain mode
internal fun PlayerActivity.showV1735RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1735remain
    FeaturePrefsStore.batch1731.v1735remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1735: remedy mode
internal fun PlayerActivity.showV1735RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1735remedy
    FeaturePrefsStore.batch1731.v1735remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1735: remind mode
internal fun PlayerActivity.showV1735RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1735remind
    FeaturePrefsStore.batch1731.v1735remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1735: renew mode
internal fun PlayerActivity.showV1735RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1735renew
    FeaturePrefsStore.batch1731.v1735renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1735: rent level
internal fun PlayerActivity.showV1735RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1735: reopen level
internal fun PlayerActivity.showV1735ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1735: repair level
internal fun PlayerActivity.showV1735RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1735: rescue level
internal fun PlayerActivity.showV1735RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1735: resist level
internal fun PlayerActivity.showV1735ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1735resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1735resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1735: retire mode
internal fun PlayerActivity.showV1735RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1735retire
    FeaturePrefsStore.batch1731.v1735retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1735: retreat mode
internal fun PlayerActivity.showV1735RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1735retreat
    FeaturePrefsStore.batch1731.v1735retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1735: reunion mode
internal fun PlayerActivity.showV1735ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1735reunion
    FeaturePrefsStore.batch1731.v1735reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1735: reveal mode
internal fun PlayerActivity.showV1735RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1735reveal
    FeaturePrefsStore.batch1731.v1735reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1735: review mode
internal fun PlayerActivity.showV1735ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1735review
    FeaturePrefsStore.batch1731.v1735review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1736: rely mode
internal fun PlayerActivity.showV1736RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1736rely
    FeaturePrefsStore.batch1731.v1736rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1736: remain mode
internal fun PlayerActivity.showV1736RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1736remain
    FeaturePrefsStore.batch1731.v1736remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1736: remedy mode
internal fun PlayerActivity.showV1736RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1736remedy
    FeaturePrefsStore.batch1731.v1736remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1736: remind mode
internal fun PlayerActivity.showV1736RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1736remind
    FeaturePrefsStore.batch1731.v1736remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1736: renew mode
internal fun PlayerActivity.showV1736RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1736renew
    FeaturePrefsStore.batch1731.v1736renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1736: rent level
internal fun PlayerActivity.showV1736RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1736: reopen level
internal fun PlayerActivity.showV1736ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1736: repair level
internal fun PlayerActivity.showV1736RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1736: rescue level
internal fun PlayerActivity.showV1736RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1736: resist level
internal fun PlayerActivity.showV1736ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1736resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1736resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1736: retire mode
internal fun PlayerActivity.showV1736RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1736retire
    FeaturePrefsStore.batch1731.v1736retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1736: retreat mode
internal fun PlayerActivity.showV1736RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1736retreat
    FeaturePrefsStore.batch1731.v1736retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1736: reunion mode
internal fun PlayerActivity.showV1736ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1736reunion
    FeaturePrefsStore.batch1731.v1736reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1736: reveal mode
internal fun PlayerActivity.showV1736RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1736reveal
    FeaturePrefsStore.batch1731.v1736reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1736: review mode
internal fun PlayerActivity.showV1736ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1736review
    FeaturePrefsStore.batch1731.v1736review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1737: rely mode
internal fun PlayerActivity.showV1737RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1737rely
    FeaturePrefsStore.batch1731.v1737rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1737: remain mode
internal fun PlayerActivity.showV1737RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1737remain
    FeaturePrefsStore.batch1731.v1737remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1737: remedy mode
internal fun PlayerActivity.showV1737RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1737remedy
    FeaturePrefsStore.batch1731.v1737remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1737: remind mode
internal fun PlayerActivity.showV1737RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1737remind
    FeaturePrefsStore.batch1731.v1737remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1737: renew mode
internal fun PlayerActivity.showV1737RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1737renew
    FeaturePrefsStore.batch1731.v1737renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1737: rent level
internal fun PlayerActivity.showV1737RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1737: reopen level
internal fun PlayerActivity.showV1737ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1737: repair level
internal fun PlayerActivity.showV1737RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1737: rescue level
internal fun PlayerActivity.showV1737RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1737: resist level
internal fun PlayerActivity.showV1737ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1737resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1737resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1737: retire mode
internal fun PlayerActivity.showV1737RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1737retire
    FeaturePrefsStore.batch1731.v1737retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1737: retreat mode
internal fun PlayerActivity.showV1737RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1737retreat
    FeaturePrefsStore.batch1731.v1737retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1737: reunion mode
internal fun PlayerActivity.showV1737ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1737reunion
    FeaturePrefsStore.batch1731.v1737reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1737: reveal mode
internal fun PlayerActivity.showV1737RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1737reveal
    FeaturePrefsStore.batch1731.v1737reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1737: review mode
internal fun PlayerActivity.showV1737ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1737review
    FeaturePrefsStore.batch1731.v1737review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1738: rely mode
internal fun PlayerActivity.showV1738RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1738rely
    FeaturePrefsStore.batch1731.v1738rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1738: remain mode
internal fun PlayerActivity.showV1738RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1738remain
    FeaturePrefsStore.batch1731.v1738remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1738: remedy mode
internal fun PlayerActivity.showV1738RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1738remedy
    FeaturePrefsStore.batch1731.v1738remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1738: remind mode
internal fun PlayerActivity.showV1738RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1738remind
    FeaturePrefsStore.batch1731.v1738remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1738: renew mode
internal fun PlayerActivity.showV1738RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1738renew
    FeaturePrefsStore.batch1731.v1738renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1738: rent level
internal fun PlayerActivity.showV1738RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1738: reopen level
internal fun PlayerActivity.showV1738ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1738: repair level
internal fun PlayerActivity.showV1738RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1738: rescue level
internal fun PlayerActivity.showV1738RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1738: resist level
internal fun PlayerActivity.showV1738ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1738resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1738resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1738: retire mode
internal fun PlayerActivity.showV1738RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1738retire
    FeaturePrefsStore.batch1731.v1738retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1738: retreat mode
internal fun PlayerActivity.showV1738RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1738retreat
    FeaturePrefsStore.batch1731.v1738retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1738: reunion mode
internal fun PlayerActivity.showV1738ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1738reunion
    FeaturePrefsStore.batch1731.v1738reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1738: reveal mode
internal fun PlayerActivity.showV1738RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1738reveal
    FeaturePrefsStore.batch1731.v1738reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1738: review mode
internal fun PlayerActivity.showV1738ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1738review
    FeaturePrefsStore.batch1731.v1738review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1739: rely mode
internal fun PlayerActivity.showV1739RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1739rely
    FeaturePrefsStore.batch1731.v1739rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1739: remain mode
internal fun PlayerActivity.showV1739RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1739remain
    FeaturePrefsStore.batch1731.v1739remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1739: remedy mode
internal fun PlayerActivity.showV1739RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1739remedy
    FeaturePrefsStore.batch1731.v1739remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1739: remind mode
internal fun PlayerActivity.showV1739RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1739remind
    FeaturePrefsStore.batch1731.v1739remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1739: renew mode
internal fun PlayerActivity.showV1739RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1739renew
    FeaturePrefsStore.batch1731.v1739renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1739: rent level
internal fun PlayerActivity.showV1739RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1739: reopen level
internal fun PlayerActivity.showV1739ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1739: repair level
internal fun PlayerActivity.showV1739RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1739: rescue level
internal fun PlayerActivity.showV1739RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1739: resist level
internal fun PlayerActivity.showV1739ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1739resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1739resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1739: retire mode
internal fun PlayerActivity.showV1739RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1739retire
    FeaturePrefsStore.batch1731.v1739retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1739: retreat mode
internal fun PlayerActivity.showV1739RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1739retreat
    FeaturePrefsStore.batch1731.v1739retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1739: reunion mode
internal fun PlayerActivity.showV1739ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1739reunion
    FeaturePrefsStore.batch1731.v1739reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1739: reveal mode
internal fun PlayerActivity.showV1739RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1739reveal
    FeaturePrefsStore.batch1731.v1739reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1739: review mode
internal fun PlayerActivity.showV1739ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1739review
    FeaturePrefsStore.batch1731.v1739review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

// v1740: rely mode
internal fun PlayerActivity.showV1740RelyToggle() {
    val current = FeaturePrefsStore.batch1731.v1740rely
    FeaturePrefsStore.batch1731.v1740rely = !current
    AppToast.show(this, "rely: ${if (!current) "ON" else "OFF"}")
}

// v1740: remain mode
internal fun PlayerActivity.showV1740RemainToggle() {
    val current = FeaturePrefsStore.batch1731.v1740remain
    FeaturePrefsStore.batch1731.v1740remain = !current
    AppToast.show(this, "remain: ${if (!current) "ON" else "OFF"}")
}

// v1740: remedy mode
internal fun PlayerActivity.showV1740RemedyToggle() {
    val current = FeaturePrefsStore.batch1731.v1740remedy
    FeaturePrefsStore.batch1731.v1740remedy = !current
    AppToast.show(this, "remedy: ${if (!current) "ON" else "OFF"}")
}

// v1740: remind mode
internal fun PlayerActivity.showV1740RemindToggle() {
    val current = FeaturePrefsStore.batch1731.v1740remind
    FeaturePrefsStore.batch1731.v1740remind = !current
    AppToast.show(this, "remind: ${if (!current) "ON" else "OFF"}")
}

// v1740: renew mode
internal fun PlayerActivity.showV1740RenewToggle() {
    val current = FeaturePrefsStore.batch1731.v1740renew
    FeaturePrefsStore.batch1731.v1740renew = !current
    AppToast.show(this, "renew: ${if (!current) "ON" else "OFF"}")
}

// v1740: rent level
internal fun PlayerActivity.showV1740RentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740rent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740rent = value
        AppToast.show(this, "rent: $value")
    }
}

// v1740: reopen level
internal fun PlayerActivity.showV1740ReopenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740reopen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reopen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740reopen = value
        AppToast.show(this, "reopen: $value")
    }
}

// v1740: repair level
internal fun PlayerActivity.showV1740RepairDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740repair).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "repair level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740repair = value
        AppToast.show(this, "repair: $value")
    }
}

// v1740: rescue level
internal fun PlayerActivity.showV1740RescueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740rescue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rescue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740rescue = value
        AppToast.show(this, "rescue: $value")
    }
}

// v1740: resist level
internal fun PlayerActivity.showV1740ResistDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1731.v1740resist).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resist level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1731.v1740resist = value
        AppToast.show(this, "resist: $value")
    }
}

// v1740: retire mode
internal fun PlayerActivity.showV1740RetireToggle() {
    val current = FeaturePrefsStore.batch1731.v1740retire
    FeaturePrefsStore.batch1731.v1740retire = !current
    AppToast.show(this, "retire: ${if (!current) "ON" else "OFF"}")
}

// v1740: retreat mode
internal fun PlayerActivity.showV1740RetreatToggle() {
    val current = FeaturePrefsStore.batch1731.v1740retreat
    FeaturePrefsStore.batch1731.v1740retreat = !current
    AppToast.show(this, "retreat: ${if (!current) "ON" else "OFF"}")
}

// v1740: reunion mode
internal fun PlayerActivity.showV1740ReunionToggle() {
    val current = FeaturePrefsStore.batch1731.v1740reunion
    FeaturePrefsStore.batch1731.v1740reunion = !current
    AppToast.show(this, "reunion: ${if (!current) "ON" else "OFF"}")
}

// v1740: reveal mode
internal fun PlayerActivity.showV1740RevealToggle() {
    val current = FeaturePrefsStore.batch1731.v1740reveal
    FeaturePrefsStore.batch1731.v1740reveal = !current
    AppToast.show(this, "reveal: ${if (!current) "ON" else "OFF"}")
}

// v1740: review mode
internal fun PlayerActivity.showV1740ReviewToggle() {
    val current = FeaturePrefsStore.batch1731.v1740review
    FeaturePrefsStore.batch1731.v1740review = !current
    AppToast.show(this, "review: ${if (!current) "ON" else "OFF"}")
}

