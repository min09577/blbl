package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1241: bare mode
internal fun PlayerActivity.showV1241BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1241bare
    FeaturePrefsStore.batch1241.v1241bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1241: barn mode
internal fun PlayerActivity.showV1241BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1241barn
    FeaturePrefsStore.batch1241.v1241barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1241: base mode
internal fun PlayerActivity.showV1241BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1241base
    FeaturePrefsStore.batch1241.v1241base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1241: basic mode
internal fun PlayerActivity.showV1241BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1241basic
    FeaturePrefsStore.batch1241.v1241basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1241: basin mode
internal fun PlayerActivity.showV1241BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1241basin
    FeaturePrefsStore.batch1241.v1241basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1241: basis level
internal fun PlayerActivity.showV1241BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1241basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1241basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1241: bass level
internal fun PlayerActivity.showV1241BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1241bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1241bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1241: bath level
internal fun PlayerActivity.showV1241BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1241bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1241bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1241: beach level
internal fun PlayerActivity.showV1241BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1241beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1241beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1241: bead level
internal fun PlayerActivity.showV1241BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1241bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1241bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1241: bean mode
internal fun PlayerActivity.showV1241BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1241bean
    FeaturePrefsStore.batch1241.v1241bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1241: bear mode
internal fun PlayerActivity.showV1241BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1241bear
    FeaturePrefsStore.batch1241.v1241bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1241: beat mode
internal fun PlayerActivity.showV1241BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1241beat
    FeaturePrefsStore.batch1241.v1241beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1241: bed mode
internal fun PlayerActivity.showV1241BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1241bed
    FeaturePrefsStore.batch1241.v1241bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1241: beef mode
internal fun PlayerActivity.showV1241BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1241beef
    FeaturePrefsStore.batch1241.v1241beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1242: bare mode
internal fun PlayerActivity.showV1242BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1242bare
    FeaturePrefsStore.batch1241.v1242bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1242: barn mode
internal fun PlayerActivity.showV1242BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1242barn
    FeaturePrefsStore.batch1241.v1242barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1242: base mode
internal fun PlayerActivity.showV1242BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1242base
    FeaturePrefsStore.batch1241.v1242base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1242: basic mode
internal fun PlayerActivity.showV1242BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1242basic
    FeaturePrefsStore.batch1241.v1242basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1242: basin mode
internal fun PlayerActivity.showV1242BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1242basin
    FeaturePrefsStore.batch1241.v1242basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1242: basis level
internal fun PlayerActivity.showV1242BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1242basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1242basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1242: bass level
internal fun PlayerActivity.showV1242BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1242bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1242bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1242: bath level
internal fun PlayerActivity.showV1242BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1242bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1242bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1242: beach level
internal fun PlayerActivity.showV1242BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1242beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1242beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1242: bead level
internal fun PlayerActivity.showV1242BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1242bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1242bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1242: bean mode
internal fun PlayerActivity.showV1242BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1242bean
    FeaturePrefsStore.batch1241.v1242bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1242: bear mode
internal fun PlayerActivity.showV1242BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1242bear
    FeaturePrefsStore.batch1241.v1242bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1242: beat mode
internal fun PlayerActivity.showV1242BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1242beat
    FeaturePrefsStore.batch1241.v1242beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1242: bed mode
internal fun PlayerActivity.showV1242BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1242bed
    FeaturePrefsStore.batch1241.v1242bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1242: beef mode
internal fun PlayerActivity.showV1242BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1242beef
    FeaturePrefsStore.batch1241.v1242beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1243: bare mode
internal fun PlayerActivity.showV1243BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1243bare
    FeaturePrefsStore.batch1241.v1243bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1243: barn mode
internal fun PlayerActivity.showV1243BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1243barn
    FeaturePrefsStore.batch1241.v1243barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1243: base mode
internal fun PlayerActivity.showV1243BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1243base
    FeaturePrefsStore.batch1241.v1243base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1243: basic mode
internal fun PlayerActivity.showV1243BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1243basic
    FeaturePrefsStore.batch1241.v1243basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1243: basin mode
internal fun PlayerActivity.showV1243BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1243basin
    FeaturePrefsStore.batch1241.v1243basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1243: basis level
internal fun PlayerActivity.showV1243BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1243basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1243basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1243: bass level
internal fun PlayerActivity.showV1243BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1243bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1243bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1243: bath level
internal fun PlayerActivity.showV1243BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1243bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1243bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1243: beach level
internal fun PlayerActivity.showV1243BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1243beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1243beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1243: bead level
internal fun PlayerActivity.showV1243BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1243bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1243bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1243: bean mode
internal fun PlayerActivity.showV1243BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1243bean
    FeaturePrefsStore.batch1241.v1243bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1243: bear mode
internal fun PlayerActivity.showV1243BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1243bear
    FeaturePrefsStore.batch1241.v1243bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1243: beat mode
internal fun PlayerActivity.showV1243BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1243beat
    FeaturePrefsStore.batch1241.v1243beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1243: bed mode
internal fun PlayerActivity.showV1243BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1243bed
    FeaturePrefsStore.batch1241.v1243bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1243: beef mode
internal fun PlayerActivity.showV1243BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1243beef
    FeaturePrefsStore.batch1241.v1243beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1244: bare mode
internal fun PlayerActivity.showV1244BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1244bare
    FeaturePrefsStore.batch1241.v1244bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1244: barn mode
internal fun PlayerActivity.showV1244BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1244barn
    FeaturePrefsStore.batch1241.v1244barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1244: base mode
internal fun PlayerActivity.showV1244BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1244base
    FeaturePrefsStore.batch1241.v1244base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1244: basic mode
internal fun PlayerActivity.showV1244BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1244basic
    FeaturePrefsStore.batch1241.v1244basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1244: basin mode
internal fun PlayerActivity.showV1244BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1244basin
    FeaturePrefsStore.batch1241.v1244basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1244: basis level
internal fun PlayerActivity.showV1244BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1244basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1244basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1244: bass level
internal fun PlayerActivity.showV1244BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1244bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1244bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1244: bath level
internal fun PlayerActivity.showV1244BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1244bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1244bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1244: beach level
internal fun PlayerActivity.showV1244BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1244beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1244beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1244: bead level
internal fun PlayerActivity.showV1244BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1244bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1244bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1244: bean mode
internal fun PlayerActivity.showV1244BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1244bean
    FeaturePrefsStore.batch1241.v1244bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1244: bear mode
internal fun PlayerActivity.showV1244BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1244bear
    FeaturePrefsStore.batch1241.v1244bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1244: beat mode
internal fun PlayerActivity.showV1244BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1244beat
    FeaturePrefsStore.batch1241.v1244beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1244: bed mode
internal fun PlayerActivity.showV1244BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1244bed
    FeaturePrefsStore.batch1241.v1244bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1244: beef mode
internal fun PlayerActivity.showV1244BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1244beef
    FeaturePrefsStore.batch1241.v1244beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1245: bare mode
internal fun PlayerActivity.showV1245BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1245bare
    FeaturePrefsStore.batch1241.v1245bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1245: barn mode
internal fun PlayerActivity.showV1245BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1245barn
    FeaturePrefsStore.batch1241.v1245barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1245: base mode
internal fun PlayerActivity.showV1245BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1245base
    FeaturePrefsStore.batch1241.v1245base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1245: basic mode
internal fun PlayerActivity.showV1245BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1245basic
    FeaturePrefsStore.batch1241.v1245basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1245: basin mode
internal fun PlayerActivity.showV1245BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1245basin
    FeaturePrefsStore.batch1241.v1245basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1245: basis level
internal fun PlayerActivity.showV1245BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1245basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1245basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1245: bass level
internal fun PlayerActivity.showV1245BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1245bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1245bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1245: bath level
internal fun PlayerActivity.showV1245BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1245bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1245bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1245: beach level
internal fun PlayerActivity.showV1245BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1245beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1245beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1245: bead level
internal fun PlayerActivity.showV1245BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1245bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1245bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1245: bean mode
internal fun PlayerActivity.showV1245BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1245bean
    FeaturePrefsStore.batch1241.v1245bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1245: bear mode
internal fun PlayerActivity.showV1245BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1245bear
    FeaturePrefsStore.batch1241.v1245bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1245: beat mode
internal fun PlayerActivity.showV1245BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1245beat
    FeaturePrefsStore.batch1241.v1245beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1245: bed mode
internal fun PlayerActivity.showV1245BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1245bed
    FeaturePrefsStore.batch1241.v1245bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1245: beef mode
internal fun PlayerActivity.showV1245BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1245beef
    FeaturePrefsStore.batch1241.v1245beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1246: bare mode
internal fun PlayerActivity.showV1246BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1246bare
    FeaturePrefsStore.batch1241.v1246bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1246: barn mode
internal fun PlayerActivity.showV1246BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1246barn
    FeaturePrefsStore.batch1241.v1246barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1246: base mode
internal fun PlayerActivity.showV1246BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1246base
    FeaturePrefsStore.batch1241.v1246base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1246: basic mode
internal fun PlayerActivity.showV1246BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1246basic
    FeaturePrefsStore.batch1241.v1246basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1246: basin mode
internal fun PlayerActivity.showV1246BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1246basin
    FeaturePrefsStore.batch1241.v1246basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1246: basis level
internal fun PlayerActivity.showV1246BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1246basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1246basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1246: bass level
internal fun PlayerActivity.showV1246BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1246bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1246bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1246: bath level
internal fun PlayerActivity.showV1246BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1246bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1246bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1246: beach level
internal fun PlayerActivity.showV1246BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1246beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1246beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1246: bead level
internal fun PlayerActivity.showV1246BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1246bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1246bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1246: bean mode
internal fun PlayerActivity.showV1246BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1246bean
    FeaturePrefsStore.batch1241.v1246bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1246: bear mode
internal fun PlayerActivity.showV1246BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1246bear
    FeaturePrefsStore.batch1241.v1246bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1246: beat mode
internal fun PlayerActivity.showV1246BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1246beat
    FeaturePrefsStore.batch1241.v1246beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1246: bed mode
internal fun PlayerActivity.showV1246BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1246bed
    FeaturePrefsStore.batch1241.v1246bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1246: beef mode
internal fun PlayerActivity.showV1246BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1246beef
    FeaturePrefsStore.batch1241.v1246beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1247: bare mode
internal fun PlayerActivity.showV1247BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1247bare
    FeaturePrefsStore.batch1241.v1247bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1247: barn mode
internal fun PlayerActivity.showV1247BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1247barn
    FeaturePrefsStore.batch1241.v1247barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1247: base mode
internal fun PlayerActivity.showV1247BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1247base
    FeaturePrefsStore.batch1241.v1247base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1247: basic mode
internal fun PlayerActivity.showV1247BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1247basic
    FeaturePrefsStore.batch1241.v1247basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1247: basin mode
internal fun PlayerActivity.showV1247BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1247basin
    FeaturePrefsStore.batch1241.v1247basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1247: basis level
internal fun PlayerActivity.showV1247BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1247basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1247basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1247: bass level
internal fun PlayerActivity.showV1247BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1247bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1247bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1247: bath level
internal fun PlayerActivity.showV1247BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1247bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1247bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1247: beach level
internal fun PlayerActivity.showV1247BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1247beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1247beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1247: bead level
internal fun PlayerActivity.showV1247BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1247bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1247bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1247: bean mode
internal fun PlayerActivity.showV1247BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1247bean
    FeaturePrefsStore.batch1241.v1247bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1247: bear mode
internal fun PlayerActivity.showV1247BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1247bear
    FeaturePrefsStore.batch1241.v1247bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1247: beat mode
internal fun PlayerActivity.showV1247BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1247beat
    FeaturePrefsStore.batch1241.v1247beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1247: bed mode
internal fun PlayerActivity.showV1247BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1247bed
    FeaturePrefsStore.batch1241.v1247bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1247: beef mode
internal fun PlayerActivity.showV1247BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1247beef
    FeaturePrefsStore.batch1241.v1247beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1248: bare mode
internal fun PlayerActivity.showV1248BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1248bare
    FeaturePrefsStore.batch1241.v1248bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1248: barn mode
internal fun PlayerActivity.showV1248BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1248barn
    FeaturePrefsStore.batch1241.v1248barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1248: base mode
internal fun PlayerActivity.showV1248BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1248base
    FeaturePrefsStore.batch1241.v1248base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1248: basic mode
internal fun PlayerActivity.showV1248BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1248basic
    FeaturePrefsStore.batch1241.v1248basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1248: basin mode
internal fun PlayerActivity.showV1248BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1248basin
    FeaturePrefsStore.batch1241.v1248basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1248: basis level
internal fun PlayerActivity.showV1248BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1248basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1248basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1248: bass level
internal fun PlayerActivity.showV1248BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1248bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1248bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1248: bath level
internal fun PlayerActivity.showV1248BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1248bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1248bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1248: beach level
internal fun PlayerActivity.showV1248BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1248beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1248beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1248: bead level
internal fun PlayerActivity.showV1248BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1248bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1248bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1248: bean mode
internal fun PlayerActivity.showV1248BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1248bean
    FeaturePrefsStore.batch1241.v1248bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1248: bear mode
internal fun PlayerActivity.showV1248BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1248bear
    FeaturePrefsStore.batch1241.v1248bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1248: beat mode
internal fun PlayerActivity.showV1248BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1248beat
    FeaturePrefsStore.batch1241.v1248beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1248: bed mode
internal fun PlayerActivity.showV1248BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1248bed
    FeaturePrefsStore.batch1241.v1248bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1248: beef mode
internal fun PlayerActivity.showV1248BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1248beef
    FeaturePrefsStore.batch1241.v1248beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1249: bare mode
internal fun PlayerActivity.showV1249BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1249bare
    FeaturePrefsStore.batch1241.v1249bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1249: barn mode
internal fun PlayerActivity.showV1249BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1249barn
    FeaturePrefsStore.batch1241.v1249barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1249: base mode
internal fun PlayerActivity.showV1249BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1249base
    FeaturePrefsStore.batch1241.v1249base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1249: basic mode
internal fun PlayerActivity.showV1249BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1249basic
    FeaturePrefsStore.batch1241.v1249basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1249: basin mode
internal fun PlayerActivity.showV1249BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1249basin
    FeaturePrefsStore.batch1241.v1249basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1249: basis level
internal fun PlayerActivity.showV1249BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1249basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1249basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1249: bass level
internal fun PlayerActivity.showV1249BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1249bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1249bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1249: bath level
internal fun PlayerActivity.showV1249BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1249bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1249bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1249: beach level
internal fun PlayerActivity.showV1249BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1249beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1249beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1249: bead level
internal fun PlayerActivity.showV1249BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1249bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1249bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1249: bean mode
internal fun PlayerActivity.showV1249BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1249bean
    FeaturePrefsStore.batch1241.v1249bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1249: bear mode
internal fun PlayerActivity.showV1249BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1249bear
    FeaturePrefsStore.batch1241.v1249bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1249: beat mode
internal fun PlayerActivity.showV1249BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1249beat
    FeaturePrefsStore.batch1241.v1249beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1249: bed mode
internal fun PlayerActivity.showV1249BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1249bed
    FeaturePrefsStore.batch1241.v1249bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1249: beef mode
internal fun PlayerActivity.showV1249BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1249beef
    FeaturePrefsStore.batch1241.v1249beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

// v1250: bare mode
internal fun PlayerActivity.showV1250BareToggle() {
    val current = FeaturePrefsStore.batch1241.v1250bare
    FeaturePrefsStore.batch1241.v1250bare = !current
    AppToast.show(this, "bare: ${if (!current) "ON" else "OFF"}")
}

// v1250: barn mode
internal fun PlayerActivity.showV1250BarnToggle() {
    val current = FeaturePrefsStore.batch1241.v1250barn
    FeaturePrefsStore.batch1241.v1250barn = !current
    AppToast.show(this, "barn: ${if (!current) "ON" else "OFF"}")
}

// v1250: base mode
internal fun PlayerActivity.showV1250BaseToggle() {
    val current = FeaturePrefsStore.batch1241.v1250base
    FeaturePrefsStore.batch1241.v1250base = !current
    AppToast.show(this, "base: ${if (!current) "ON" else "OFF"}")
}

// v1250: basic mode
internal fun PlayerActivity.showV1250BasicToggle() {
    val current = FeaturePrefsStore.batch1241.v1250basic
    FeaturePrefsStore.batch1241.v1250basic = !current
    AppToast.show(this, "basic: ${if (!current) "ON" else "OFF"}")
}

// v1250: basin mode
internal fun PlayerActivity.showV1250BasinToggle() {
    val current = FeaturePrefsStore.batch1241.v1250basin
    FeaturePrefsStore.batch1241.v1250basin = !current
    AppToast.show(this, "basin: ${if (!current) "ON" else "OFF"}")
}

// v1250: basis level
internal fun PlayerActivity.showV1250BasisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1250basis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "basis level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1250basis = value
        AppToast.show(this, "basis: $value")
    }
}

// v1250: bass level
internal fun PlayerActivity.showV1250BassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1250bass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1250bass = value
        AppToast.show(this, "bass: $value")
    }
}

// v1250: bath level
internal fun PlayerActivity.showV1250BathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1250bath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bath level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1250bath = value
        AppToast.show(this, "bath: $value")
    }
}

// v1250: beach level
internal fun PlayerActivity.showV1250BeachDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1250beach).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beach level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1250beach = value
        AppToast.show(this, "beach: $value")
    }
}

// v1250: bead level
internal fun PlayerActivity.showV1250BeadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1241.v1250bead).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bead level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1241.v1250bead = value
        AppToast.show(this, "bead: $value")
    }
}

// v1250: bean mode
internal fun PlayerActivity.showV1250BeanToggle() {
    val current = FeaturePrefsStore.batch1241.v1250bean
    FeaturePrefsStore.batch1241.v1250bean = !current
    AppToast.show(this, "bean: ${if (!current) "ON" else "OFF"}")
}

// v1250: bear mode
internal fun PlayerActivity.showV1250BearToggle() {
    val current = FeaturePrefsStore.batch1241.v1250bear
    FeaturePrefsStore.batch1241.v1250bear = !current
    AppToast.show(this, "bear: ${if (!current) "ON" else "OFF"}")
}

// v1250: beat mode
internal fun PlayerActivity.showV1250BeatToggle() {
    val current = FeaturePrefsStore.batch1241.v1250beat
    FeaturePrefsStore.batch1241.v1250beat = !current
    AppToast.show(this, "beat: ${if (!current) "ON" else "OFF"}")
}

// v1250: bed mode
internal fun PlayerActivity.showV1250BedToggle() {
    val current = FeaturePrefsStore.batch1241.v1250bed
    FeaturePrefsStore.batch1241.v1250bed = !current
    AppToast.show(this, "bed: ${if (!current) "ON" else "OFF"}")
}

// v1250: beef mode
internal fun PlayerActivity.showV1250BeefToggle() {
    val current = FeaturePrefsStore.batch1241.v1250beef
    FeaturePrefsStore.batch1241.v1250beef = !current
    AppToast.show(this, "beef: ${if (!current) "ON" else "OFF"}")
}

