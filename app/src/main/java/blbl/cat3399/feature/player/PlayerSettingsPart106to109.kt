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

// v1251: beer mode
internal fun PlayerActivity.showV1251BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1251beer
    FeaturePrefsStore.batch1251.v1251beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1251: bell mode
internal fun PlayerActivity.showV1251BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bell
    FeaturePrefsStore.batch1251.v1251bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1251: belt mode
internal fun PlayerActivity.showV1251BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1251belt
    FeaturePrefsStore.batch1251.v1251belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1251: bench mode
internal fun PlayerActivity.showV1251BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bench
    FeaturePrefsStore.batch1251.v1251bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1251: bend mode
internal fun PlayerActivity.showV1251BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bend
    FeaturePrefsStore.batch1251.v1251bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1251: berry level
internal fun PlayerActivity.showV1251BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1251: bible level
internal fun PlayerActivity.showV1251BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1251: bid level
internal fun PlayerActivity.showV1251BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1251: bike level
internal fun PlayerActivity.showV1251BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1251: bill level
internal fun PlayerActivity.showV1251BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1251bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1251bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1251: bird mode
internal fun PlayerActivity.showV1251BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1251bird
    FeaturePrefsStore.batch1251.v1251bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1251: birth mode
internal fun PlayerActivity.showV1251BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1251birth
    FeaturePrefsStore.batch1251.v1251birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1251: black mode
internal fun PlayerActivity.showV1251BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1251black
    FeaturePrefsStore.batch1251.v1251black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1251: blade mode
internal fun PlayerActivity.showV1251BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1251blade
    FeaturePrefsStore.batch1251.v1251blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1251: blame mode
internal fun PlayerActivity.showV1251BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1251blame
    FeaturePrefsStore.batch1251.v1251blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1252: beer mode
internal fun PlayerActivity.showV1252BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1252beer
    FeaturePrefsStore.batch1251.v1252beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1252: bell mode
internal fun PlayerActivity.showV1252BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bell
    FeaturePrefsStore.batch1251.v1252bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1252: belt mode
internal fun PlayerActivity.showV1252BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1252belt
    FeaturePrefsStore.batch1251.v1252belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1252: bench mode
internal fun PlayerActivity.showV1252BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bench
    FeaturePrefsStore.batch1251.v1252bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1252: bend mode
internal fun PlayerActivity.showV1252BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bend
    FeaturePrefsStore.batch1251.v1252bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1252: berry level
internal fun PlayerActivity.showV1252BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1252: bible level
internal fun PlayerActivity.showV1252BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1252: bid level
internal fun PlayerActivity.showV1252BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1252: bike level
internal fun PlayerActivity.showV1252BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1252: bill level
internal fun PlayerActivity.showV1252BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1252bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1252bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1252: bird mode
internal fun PlayerActivity.showV1252BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1252bird
    FeaturePrefsStore.batch1251.v1252bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1252: birth mode
internal fun PlayerActivity.showV1252BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1252birth
    FeaturePrefsStore.batch1251.v1252birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1252: black mode
internal fun PlayerActivity.showV1252BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1252black
    FeaturePrefsStore.batch1251.v1252black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1252: blade mode
internal fun PlayerActivity.showV1252BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1252blade
    FeaturePrefsStore.batch1251.v1252blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1252: blame mode
internal fun PlayerActivity.showV1252BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1252blame
    FeaturePrefsStore.batch1251.v1252blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1253: beer mode
internal fun PlayerActivity.showV1253BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1253beer
    FeaturePrefsStore.batch1251.v1253beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1253: bell mode
internal fun PlayerActivity.showV1253BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bell
    FeaturePrefsStore.batch1251.v1253bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1253: belt mode
internal fun PlayerActivity.showV1253BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1253belt
    FeaturePrefsStore.batch1251.v1253belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1253: bench mode
internal fun PlayerActivity.showV1253BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bench
    FeaturePrefsStore.batch1251.v1253bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1253: bend mode
internal fun PlayerActivity.showV1253BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bend
    FeaturePrefsStore.batch1251.v1253bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1253: berry level
internal fun PlayerActivity.showV1253BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1253: bible level
internal fun PlayerActivity.showV1253BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1253: bid level
internal fun PlayerActivity.showV1253BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1253: bike level
internal fun PlayerActivity.showV1253BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1253: bill level
internal fun PlayerActivity.showV1253BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1253bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1253bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1253: bird mode
internal fun PlayerActivity.showV1253BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1253bird
    FeaturePrefsStore.batch1251.v1253bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1253: birth mode
internal fun PlayerActivity.showV1253BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1253birth
    FeaturePrefsStore.batch1251.v1253birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1253: black mode
internal fun PlayerActivity.showV1253BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1253black
    FeaturePrefsStore.batch1251.v1253black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1253: blade mode
internal fun PlayerActivity.showV1253BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1253blade
    FeaturePrefsStore.batch1251.v1253blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1253: blame mode
internal fun PlayerActivity.showV1253BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1253blame
    FeaturePrefsStore.batch1251.v1253blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1254: beer mode
internal fun PlayerActivity.showV1254BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1254beer
    FeaturePrefsStore.batch1251.v1254beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1254: bell mode
internal fun PlayerActivity.showV1254BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bell
    FeaturePrefsStore.batch1251.v1254bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1254: belt mode
internal fun PlayerActivity.showV1254BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1254belt
    FeaturePrefsStore.batch1251.v1254belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1254: bench mode
internal fun PlayerActivity.showV1254BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bench
    FeaturePrefsStore.batch1251.v1254bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1254: bend mode
internal fun PlayerActivity.showV1254BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bend
    FeaturePrefsStore.batch1251.v1254bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1254: berry level
internal fun PlayerActivity.showV1254BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1254: bible level
internal fun PlayerActivity.showV1254BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1254: bid level
internal fun PlayerActivity.showV1254BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1254: bike level
internal fun PlayerActivity.showV1254BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1254: bill level
internal fun PlayerActivity.showV1254BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1254bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1254bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1254: bird mode
internal fun PlayerActivity.showV1254BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1254bird
    FeaturePrefsStore.batch1251.v1254bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1254: birth mode
internal fun PlayerActivity.showV1254BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1254birth
    FeaturePrefsStore.batch1251.v1254birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1254: black mode
internal fun PlayerActivity.showV1254BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1254black
    FeaturePrefsStore.batch1251.v1254black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1254: blade mode
internal fun PlayerActivity.showV1254BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1254blade
    FeaturePrefsStore.batch1251.v1254blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1254: blame mode
internal fun PlayerActivity.showV1254BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1254blame
    FeaturePrefsStore.batch1251.v1254blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1255: beer mode
internal fun PlayerActivity.showV1255BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1255beer
    FeaturePrefsStore.batch1251.v1255beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1255: bell mode
internal fun PlayerActivity.showV1255BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bell
    FeaturePrefsStore.batch1251.v1255bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1255: belt mode
internal fun PlayerActivity.showV1255BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1255belt
    FeaturePrefsStore.batch1251.v1255belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1255: bench mode
internal fun PlayerActivity.showV1255BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bench
    FeaturePrefsStore.batch1251.v1255bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1255: bend mode
internal fun PlayerActivity.showV1255BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bend
    FeaturePrefsStore.batch1251.v1255bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1255: berry level
internal fun PlayerActivity.showV1255BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1255: bible level
internal fun PlayerActivity.showV1255BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1255: bid level
internal fun PlayerActivity.showV1255BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1255: bike level
internal fun PlayerActivity.showV1255BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1255: bill level
internal fun PlayerActivity.showV1255BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1255bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1255bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1255: bird mode
internal fun PlayerActivity.showV1255BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1255bird
    FeaturePrefsStore.batch1251.v1255bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1255: birth mode
internal fun PlayerActivity.showV1255BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1255birth
    FeaturePrefsStore.batch1251.v1255birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1255: black mode
internal fun PlayerActivity.showV1255BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1255black
    FeaturePrefsStore.batch1251.v1255black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1255: blade mode
internal fun PlayerActivity.showV1255BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1255blade
    FeaturePrefsStore.batch1251.v1255blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1255: blame mode
internal fun PlayerActivity.showV1255BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1255blame
    FeaturePrefsStore.batch1251.v1255blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1256: beer mode
internal fun PlayerActivity.showV1256BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1256beer
    FeaturePrefsStore.batch1251.v1256beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1256: bell mode
internal fun PlayerActivity.showV1256BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bell
    FeaturePrefsStore.batch1251.v1256bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1256: belt mode
internal fun PlayerActivity.showV1256BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1256belt
    FeaturePrefsStore.batch1251.v1256belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1256: bench mode
internal fun PlayerActivity.showV1256BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bench
    FeaturePrefsStore.batch1251.v1256bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1256: bend mode
internal fun PlayerActivity.showV1256BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bend
    FeaturePrefsStore.batch1251.v1256bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1256: berry level
internal fun PlayerActivity.showV1256BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1256: bible level
internal fun PlayerActivity.showV1256BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1256: bid level
internal fun PlayerActivity.showV1256BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1256: bike level
internal fun PlayerActivity.showV1256BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1256: bill level
internal fun PlayerActivity.showV1256BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1256bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1256bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1256: bird mode
internal fun PlayerActivity.showV1256BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1256bird
    FeaturePrefsStore.batch1251.v1256bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1256: birth mode
internal fun PlayerActivity.showV1256BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1256birth
    FeaturePrefsStore.batch1251.v1256birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1256: black mode
internal fun PlayerActivity.showV1256BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1256black
    FeaturePrefsStore.batch1251.v1256black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1256: blade mode
internal fun PlayerActivity.showV1256BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1256blade
    FeaturePrefsStore.batch1251.v1256blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1256: blame mode
internal fun PlayerActivity.showV1256BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1256blame
    FeaturePrefsStore.batch1251.v1256blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1257: beer mode
internal fun PlayerActivity.showV1257BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1257beer
    FeaturePrefsStore.batch1251.v1257beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1257: bell mode
internal fun PlayerActivity.showV1257BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bell
    FeaturePrefsStore.batch1251.v1257bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1257: belt mode
internal fun PlayerActivity.showV1257BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1257belt
    FeaturePrefsStore.batch1251.v1257belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1257: bench mode
internal fun PlayerActivity.showV1257BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bench
    FeaturePrefsStore.batch1251.v1257bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1257: bend mode
internal fun PlayerActivity.showV1257BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bend
    FeaturePrefsStore.batch1251.v1257bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1257: berry level
internal fun PlayerActivity.showV1257BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1257: bible level
internal fun PlayerActivity.showV1257BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1257: bid level
internal fun PlayerActivity.showV1257BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1257: bike level
internal fun PlayerActivity.showV1257BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1257: bill level
internal fun PlayerActivity.showV1257BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1257bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1257bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1257: bird mode
internal fun PlayerActivity.showV1257BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1257bird
    FeaturePrefsStore.batch1251.v1257bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1257: birth mode
internal fun PlayerActivity.showV1257BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1257birth
    FeaturePrefsStore.batch1251.v1257birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1257: black mode
internal fun PlayerActivity.showV1257BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1257black
    FeaturePrefsStore.batch1251.v1257black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1257: blade mode
internal fun PlayerActivity.showV1257BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1257blade
    FeaturePrefsStore.batch1251.v1257blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1257: blame mode
internal fun PlayerActivity.showV1257BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1257blame
    FeaturePrefsStore.batch1251.v1257blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1258: beer mode
internal fun PlayerActivity.showV1258BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1258beer
    FeaturePrefsStore.batch1251.v1258beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1258: bell mode
internal fun PlayerActivity.showV1258BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bell
    FeaturePrefsStore.batch1251.v1258bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1258: belt mode
internal fun PlayerActivity.showV1258BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1258belt
    FeaturePrefsStore.batch1251.v1258belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1258: bench mode
internal fun PlayerActivity.showV1258BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bench
    FeaturePrefsStore.batch1251.v1258bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1258: bend mode
internal fun PlayerActivity.showV1258BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bend
    FeaturePrefsStore.batch1251.v1258bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1258: berry level
internal fun PlayerActivity.showV1258BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1258: bible level
internal fun PlayerActivity.showV1258BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1258: bid level
internal fun PlayerActivity.showV1258BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1258: bike level
internal fun PlayerActivity.showV1258BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1258: bill level
internal fun PlayerActivity.showV1258BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1258bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1258bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1258: bird mode
internal fun PlayerActivity.showV1258BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1258bird
    FeaturePrefsStore.batch1251.v1258bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1258: birth mode
internal fun PlayerActivity.showV1258BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1258birth
    FeaturePrefsStore.batch1251.v1258birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1258: black mode
internal fun PlayerActivity.showV1258BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1258black
    FeaturePrefsStore.batch1251.v1258black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1258: blade mode
internal fun PlayerActivity.showV1258BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1258blade
    FeaturePrefsStore.batch1251.v1258blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1258: blame mode
internal fun PlayerActivity.showV1258BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1258blame
    FeaturePrefsStore.batch1251.v1258blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1259: beer mode
internal fun PlayerActivity.showV1259BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1259beer
    FeaturePrefsStore.batch1251.v1259beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1259: bell mode
internal fun PlayerActivity.showV1259BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bell
    FeaturePrefsStore.batch1251.v1259bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1259: belt mode
internal fun PlayerActivity.showV1259BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1259belt
    FeaturePrefsStore.batch1251.v1259belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1259: bench mode
internal fun PlayerActivity.showV1259BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bench
    FeaturePrefsStore.batch1251.v1259bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1259: bend mode
internal fun PlayerActivity.showV1259BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bend
    FeaturePrefsStore.batch1251.v1259bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1259: berry level
internal fun PlayerActivity.showV1259BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1259: bible level
internal fun PlayerActivity.showV1259BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1259: bid level
internal fun PlayerActivity.showV1259BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1259: bike level
internal fun PlayerActivity.showV1259BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1259: bill level
internal fun PlayerActivity.showV1259BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1259bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1259bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1259: bird mode
internal fun PlayerActivity.showV1259BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1259bird
    FeaturePrefsStore.batch1251.v1259bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1259: birth mode
internal fun PlayerActivity.showV1259BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1259birth
    FeaturePrefsStore.batch1251.v1259birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1259: black mode
internal fun PlayerActivity.showV1259BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1259black
    FeaturePrefsStore.batch1251.v1259black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1259: blade mode
internal fun PlayerActivity.showV1259BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1259blade
    FeaturePrefsStore.batch1251.v1259blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1259: blame mode
internal fun PlayerActivity.showV1259BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1259blame
    FeaturePrefsStore.batch1251.v1259blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1260: beer mode
internal fun PlayerActivity.showV1260BeerToggle() {
    val current = FeaturePrefsStore.batch1251.v1260beer
    FeaturePrefsStore.batch1251.v1260beer = !current
    AppToast.show(this, "beer: ${if (!current) "ON" else "OFF"}")
}

// v1260: bell mode
internal fun PlayerActivity.showV1260BellToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bell
    FeaturePrefsStore.batch1251.v1260bell = !current
    AppToast.show(this, "bell: ${if (!current) "ON" else "OFF"}")
}

// v1260: belt mode
internal fun PlayerActivity.showV1260BeltToggle() {
    val current = FeaturePrefsStore.batch1251.v1260belt
    FeaturePrefsStore.batch1251.v1260belt = !current
    AppToast.show(this, "belt: ${if (!current) "ON" else "OFF"}")
}

// v1260: bench mode
internal fun PlayerActivity.showV1260BenchToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bench
    FeaturePrefsStore.batch1251.v1260bench = !current
    AppToast.show(this, "bench: ${if (!current) "ON" else "OFF"}")
}

// v1260: bend mode
internal fun PlayerActivity.showV1260BendToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bend
    FeaturePrefsStore.batch1251.v1260bend = !current
    AppToast.show(this, "bend: ${if (!current) "ON" else "OFF"}")
}

// v1260: berry level
internal fun PlayerActivity.showV1260BerryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260berry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "berry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260berry = value
        AppToast.show(this, "berry: $value")
    }
}

// v1260: bible level
internal fun PlayerActivity.showV1260BibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bible = value
        AppToast.show(this, "bible: $value")
    }
}

// v1260: bid level
internal fun PlayerActivity.showV1260BidDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bid).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bid level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bid = value
        AppToast.show(this, "bid: $value")
    }
}

// v1260: bike level
internal fun PlayerActivity.showV1260BikeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bike).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bike level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bike = value
        AppToast.show(this, "bike: $value")
    }
}

// v1260: bill level
internal fun PlayerActivity.showV1260BillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1251.v1260bill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1251.v1260bill = value
        AppToast.show(this, "bill: $value")
    }
}

// v1260: bird mode
internal fun PlayerActivity.showV1260BirdToggle() {
    val current = FeaturePrefsStore.batch1251.v1260bird
    FeaturePrefsStore.batch1251.v1260bird = !current
    AppToast.show(this, "bird: ${if (!current) "ON" else "OFF"}")
}

// v1260: birth mode
internal fun PlayerActivity.showV1260BirthToggle() {
    val current = FeaturePrefsStore.batch1251.v1260birth
    FeaturePrefsStore.batch1251.v1260birth = !current
    AppToast.show(this, "birth: ${if (!current) "ON" else "OFF"}")
}

// v1260: black mode
internal fun PlayerActivity.showV1260BlackToggle() {
    val current = FeaturePrefsStore.batch1251.v1260black
    FeaturePrefsStore.batch1251.v1260black = !current
    AppToast.show(this, "black: ${if (!current) "ON" else "OFF"}")
}

// v1260: blade mode
internal fun PlayerActivity.showV1260BladeToggle() {
    val current = FeaturePrefsStore.batch1251.v1260blade
    FeaturePrefsStore.batch1251.v1260blade = !current
    AppToast.show(this, "blade: ${if (!current) "ON" else "OFF"}")
}

// v1260: blame mode
internal fun PlayerActivity.showV1260BlameToggle() {
    val current = FeaturePrefsStore.batch1251.v1260blame
    FeaturePrefsStore.batch1251.v1260blame = !current
    AppToast.show(this, "blame: ${if (!current) "ON" else "OFF"}")
}

// v1261: blast mode
internal fun PlayerActivity.showV1261BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1261blast
    FeaturePrefsStore.batch1261.v1261blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1261: blaze mode
internal fun PlayerActivity.showV1261BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1261blaze
    FeaturePrefsStore.batch1261.v1261blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1261: bleed mode
internal fun PlayerActivity.showV1261BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bleed
    FeaturePrefsStore.batch1261.v1261bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1261: bless mode
internal fun PlayerActivity.showV1261BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bless
    FeaturePrefsStore.batch1261.v1261bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1261: blind mode
internal fun PlayerActivity.showV1261BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1261blind
    FeaturePrefsStore.batch1261.v1261blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1261: blood level
internal fun PlayerActivity.showV1261BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1261: bloom level
internal fun PlayerActivity.showV1261BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1261: blow level
internal fun PlayerActivity.showV1261BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1261: blue level
internal fun PlayerActivity.showV1261BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1261: blur level
internal fun PlayerActivity.showV1261BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1261: board mode
internal fun PlayerActivity.showV1261BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1261board
    FeaturePrefsStore.batch1261.v1261board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1261: boat mode
internal fun PlayerActivity.showV1261BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1261boat
    FeaturePrefsStore.batch1261.v1261boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1261: body mode
internal fun PlayerActivity.showV1261BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1261body
    FeaturePrefsStore.batch1261.v1261body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1261: bold mode
internal fun PlayerActivity.showV1261BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bold
    FeaturePrefsStore.batch1261.v1261bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1261: bolt mode
internal fun PlayerActivity.showV1261BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bolt
    FeaturePrefsStore.batch1261.v1261bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1262: blast mode
internal fun PlayerActivity.showV1262BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1262blast
    FeaturePrefsStore.batch1261.v1262blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1262: blaze mode
internal fun PlayerActivity.showV1262BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1262blaze
    FeaturePrefsStore.batch1261.v1262blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1262: bleed mode
internal fun PlayerActivity.showV1262BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bleed
    FeaturePrefsStore.batch1261.v1262bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1262: bless mode
internal fun PlayerActivity.showV1262BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bless
    FeaturePrefsStore.batch1261.v1262bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1262: blind mode
internal fun PlayerActivity.showV1262BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1262blind
    FeaturePrefsStore.batch1261.v1262blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1262: blood level
internal fun PlayerActivity.showV1262BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1262: bloom level
internal fun PlayerActivity.showV1262BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1262: blow level
internal fun PlayerActivity.showV1262BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1262: blue level
internal fun PlayerActivity.showV1262BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1262: blur level
internal fun PlayerActivity.showV1262BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1262: board mode
internal fun PlayerActivity.showV1262BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1262board
    FeaturePrefsStore.batch1261.v1262board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1262: boat mode
internal fun PlayerActivity.showV1262BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1262boat
    FeaturePrefsStore.batch1261.v1262boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1262: body mode
internal fun PlayerActivity.showV1262BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1262body
    FeaturePrefsStore.batch1261.v1262body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1262: bold mode
internal fun PlayerActivity.showV1262BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bold
    FeaturePrefsStore.batch1261.v1262bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1262: bolt mode
internal fun PlayerActivity.showV1262BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bolt
    FeaturePrefsStore.batch1261.v1262bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1263: blast mode
internal fun PlayerActivity.showV1263BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1263blast
    FeaturePrefsStore.batch1261.v1263blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1263: blaze mode
internal fun PlayerActivity.showV1263BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1263blaze
    FeaturePrefsStore.batch1261.v1263blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1263: bleed mode
internal fun PlayerActivity.showV1263BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bleed
    FeaturePrefsStore.batch1261.v1263bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1263: bless mode
internal fun PlayerActivity.showV1263BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bless
    FeaturePrefsStore.batch1261.v1263bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1263: blind mode
internal fun PlayerActivity.showV1263BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1263blind
    FeaturePrefsStore.batch1261.v1263blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1263: blood level
internal fun PlayerActivity.showV1263BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1263: bloom level
internal fun PlayerActivity.showV1263BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1263: blow level
internal fun PlayerActivity.showV1263BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1263: blue level
internal fun PlayerActivity.showV1263BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1263: blur level
internal fun PlayerActivity.showV1263BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1263: board mode
internal fun PlayerActivity.showV1263BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1263board
    FeaturePrefsStore.batch1261.v1263board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1263: boat mode
internal fun PlayerActivity.showV1263BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1263boat
    FeaturePrefsStore.batch1261.v1263boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1263: body mode
internal fun PlayerActivity.showV1263BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1263body
    FeaturePrefsStore.batch1261.v1263body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1263: bold mode
internal fun PlayerActivity.showV1263BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bold
    FeaturePrefsStore.batch1261.v1263bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1263: bolt mode
internal fun PlayerActivity.showV1263BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bolt
    FeaturePrefsStore.batch1261.v1263bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1264: blast mode
internal fun PlayerActivity.showV1264BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1264blast
    FeaturePrefsStore.batch1261.v1264blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1264: blaze mode
internal fun PlayerActivity.showV1264BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1264blaze
    FeaturePrefsStore.batch1261.v1264blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1264: bleed mode
internal fun PlayerActivity.showV1264BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bleed
    FeaturePrefsStore.batch1261.v1264bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1264: bless mode
internal fun PlayerActivity.showV1264BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bless
    FeaturePrefsStore.batch1261.v1264bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1264: blind mode
internal fun PlayerActivity.showV1264BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1264blind
    FeaturePrefsStore.batch1261.v1264blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1264: blood level
internal fun PlayerActivity.showV1264BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1264: bloom level
internal fun PlayerActivity.showV1264BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1264: blow level
internal fun PlayerActivity.showV1264BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1264: blue level
internal fun PlayerActivity.showV1264BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1264: blur level
internal fun PlayerActivity.showV1264BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1264: board mode
internal fun PlayerActivity.showV1264BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1264board
    FeaturePrefsStore.batch1261.v1264board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1264: boat mode
internal fun PlayerActivity.showV1264BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1264boat
    FeaturePrefsStore.batch1261.v1264boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1264: body mode
internal fun PlayerActivity.showV1264BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1264body
    FeaturePrefsStore.batch1261.v1264body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1264: bold mode
internal fun PlayerActivity.showV1264BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bold
    FeaturePrefsStore.batch1261.v1264bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1264: bolt mode
internal fun PlayerActivity.showV1264BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bolt
    FeaturePrefsStore.batch1261.v1264bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1265: blast mode
internal fun PlayerActivity.showV1265BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1265blast
    FeaturePrefsStore.batch1261.v1265blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1265: blaze mode
internal fun PlayerActivity.showV1265BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1265blaze
    FeaturePrefsStore.batch1261.v1265blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1265: bleed mode
internal fun PlayerActivity.showV1265BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bleed
    FeaturePrefsStore.batch1261.v1265bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1265: bless mode
internal fun PlayerActivity.showV1265BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bless
    FeaturePrefsStore.batch1261.v1265bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1265: blind mode
internal fun PlayerActivity.showV1265BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1265blind
    FeaturePrefsStore.batch1261.v1265blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1265: blood level
internal fun PlayerActivity.showV1265BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1265: bloom level
internal fun PlayerActivity.showV1265BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1265: blow level
internal fun PlayerActivity.showV1265BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1265: blue level
internal fun PlayerActivity.showV1265BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1265: blur level
internal fun PlayerActivity.showV1265BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1265: board mode
internal fun PlayerActivity.showV1265BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1265board
    FeaturePrefsStore.batch1261.v1265board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1265: boat mode
internal fun PlayerActivity.showV1265BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1265boat
    FeaturePrefsStore.batch1261.v1265boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1265: body mode
internal fun PlayerActivity.showV1265BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1265body
    FeaturePrefsStore.batch1261.v1265body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1265: bold mode
internal fun PlayerActivity.showV1265BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bold
    FeaturePrefsStore.batch1261.v1265bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1265: bolt mode
internal fun PlayerActivity.showV1265BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bolt
    FeaturePrefsStore.batch1261.v1265bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1266: blast mode
internal fun PlayerActivity.showV1266BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1266blast
    FeaturePrefsStore.batch1261.v1266blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1266: blaze mode
internal fun PlayerActivity.showV1266BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1266blaze
    FeaturePrefsStore.batch1261.v1266blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1266: bleed mode
internal fun PlayerActivity.showV1266BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bleed
    FeaturePrefsStore.batch1261.v1266bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1266: bless mode
internal fun PlayerActivity.showV1266BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bless
    FeaturePrefsStore.batch1261.v1266bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1266: blind mode
internal fun PlayerActivity.showV1266BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1266blind
    FeaturePrefsStore.batch1261.v1266blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1266: blood level
internal fun PlayerActivity.showV1266BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1266: bloom level
internal fun PlayerActivity.showV1266BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1266: blow level
internal fun PlayerActivity.showV1266BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1266: blue level
internal fun PlayerActivity.showV1266BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1266: blur level
internal fun PlayerActivity.showV1266BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1266: board mode
internal fun PlayerActivity.showV1266BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1266board
    FeaturePrefsStore.batch1261.v1266board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1266: boat mode
internal fun PlayerActivity.showV1266BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1266boat
    FeaturePrefsStore.batch1261.v1266boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1266: body mode
internal fun PlayerActivity.showV1266BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1266body
    FeaturePrefsStore.batch1261.v1266body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1266: bold mode
internal fun PlayerActivity.showV1266BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bold
    FeaturePrefsStore.batch1261.v1266bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1266: bolt mode
internal fun PlayerActivity.showV1266BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bolt
    FeaturePrefsStore.batch1261.v1266bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1267: blast mode
internal fun PlayerActivity.showV1267BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1267blast
    FeaturePrefsStore.batch1261.v1267blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1267: blaze mode
internal fun PlayerActivity.showV1267BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1267blaze
    FeaturePrefsStore.batch1261.v1267blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1267: bleed mode
internal fun PlayerActivity.showV1267BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bleed
    FeaturePrefsStore.batch1261.v1267bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1267: bless mode
internal fun PlayerActivity.showV1267BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bless
    FeaturePrefsStore.batch1261.v1267bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1267: blind mode
internal fun PlayerActivity.showV1267BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1267blind
    FeaturePrefsStore.batch1261.v1267blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1267: blood level
internal fun PlayerActivity.showV1267BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1267: bloom level
internal fun PlayerActivity.showV1267BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1267: blow level
internal fun PlayerActivity.showV1267BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1267: blue level
internal fun PlayerActivity.showV1267BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1267: blur level
internal fun PlayerActivity.showV1267BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1267: board mode
internal fun PlayerActivity.showV1267BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1267board
    FeaturePrefsStore.batch1261.v1267board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1267: boat mode
internal fun PlayerActivity.showV1267BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1267boat
    FeaturePrefsStore.batch1261.v1267boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1267: body mode
internal fun PlayerActivity.showV1267BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1267body
    FeaturePrefsStore.batch1261.v1267body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1267: bold mode
internal fun PlayerActivity.showV1267BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bold
    FeaturePrefsStore.batch1261.v1267bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1267: bolt mode
internal fun PlayerActivity.showV1267BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bolt
    FeaturePrefsStore.batch1261.v1267bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1268: blast mode
internal fun PlayerActivity.showV1268BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1268blast
    FeaturePrefsStore.batch1261.v1268blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1268: blaze mode
internal fun PlayerActivity.showV1268BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1268blaze
    FeaturePrefsStore.batch1261.v1268blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1268: bleed mode
internal fun PlayerActivity.showV1268BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bleed
    FeaturePrefsStore.batch1261.v1268bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1268: bless mode
internal fun PlayerActivity.showV1268BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bless
    FeaturePrefsStore.batch1261.v1268bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1268: blind mode
internal fun PlayerActivity.showV1268BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1268blind
    FeaturePrefsStore.batch1261.v1268blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1268: blood level
internal fun PlayerActivity.showV1268BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1268: bloom level
internal fun PlayerActivity.showV1268BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1268: blow level
internal fun PlayerActivity.showV1268BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1268: blue level
internal fun PlayerActivity.showV1268BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1268: blur level
internal fun PlayerActivity.showV1268BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1268: board mode
internal fun PlayerActivity.showV1268BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1268board
    FeaturePrefsStore.batch1261.v1268board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1268: boat mode
internal fun PlayerActivity.showV1268BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1268boat
    FeaturePrefsStore.batch1261.v1268boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1268: body mode
internal fun PlayerActivity.showV1268BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1268body
    FeaturePrefsStore.batch1261.v1268body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1268: bold mode
internal fun PlayerActivity.showV1268BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bold
    FeaturePrefsStore.batch1261.v1268bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1268: bolt mode
internal fun PlayerActivity.showV1268BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bolt
    FeaturePrefsStore.batch1261.v1268bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1269: blast mode
internal fun PlayerActivity.showV1269BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1269blast
    FeaturePrefsStore.batch1261.v1269blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1269: blaze mode
internal fun PlayerActivity.showV1269BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1269blaze
    FeaturePrefsStore.batch1261.v1269blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1269: bleed mode
internal fun PlayerActivity.showV1269BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bleed
    FeaturePrefsStore.batch1261.v1269bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1269: bless mode
internal fun PlayerActivity.showV1269BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bless
    FeaturePrefsStore.batch1261.v1269bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1269: blind mode
internal fun PlayerActivity.showV1269BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1269blind
    FeaturePrefsStore.batch1261.v1269blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1269: blood level
internal fun PlayerActivity.showV1269BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1269: bloom level
internal fun PlayerActivity.showV1269BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1269: blow level
internal fun PlayerActivity.showV1269BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1269: blue level
internal fun PlayerActivity.showV1269BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1269: blur level
internal fun PlayerActivity.showV1269BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1269: board mode
internal fun PlayerActivity.showV1269BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1269board
    FeaturePrefsStore.batch1261.v1269board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1269: boat mode
internal fun PlayerActivity.showV1269BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1269boat
    FeaturePrefsStore.batch1261.v1269boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1269: body mode
internal fun PlayerActivity.showV1269BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1269body
    FeaturePrefsStore.batch1261.v1269body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1269: bold mode
internal fun PlayerActivity.showV1269BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bold
    FeaturePrefsStore.batch1261.v1269bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1269: bolt mode
internal fun PlayerActivity.showV1269BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bolt
    FeaturePrefsStore.batch1261.v1269bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1270: blast mode
internal fun PlayerActivity.showV1270BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1270blast
    FeaturePrefsStore.batch1261.v1270blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1270: blaze mode
internal fun PlayerActivity.showV1270BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1270blaze
    FeaturePrefsStore.batch1261.v1270blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1270: bleed mode
internal fun PlayerActivity.showV1270BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bleed
    FeaturePrefsStore.batch1261.v1270bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1270: bless mode
internal fun PlayerActivity.showV1270BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bless
    FeaturePrefsStore.batch1261.v1270bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1270: blind mode
internal fun PlayerActivity.showV1270BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1270blind
    FeaturePrefsStore.batch1261.v1270blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1270: blood level
internal fun PlayerActivity.showV1270BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1270: bloom level
internal fun PlayerActivity.showV1270BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1270: blow level
internal fun PlayerActivity.showV1270BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1270: blue level
internal fun PlayerActivity.showV1270BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1270: blur level
internal fun PlayerActivity.showV1270BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1270: board mode
internal fun PlayerActivity.showV1270BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1270board
    FeaturePrefsStore.batch1261.v1270board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1270: boat mode
internal fun PlayerActivity.showV1270BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1270boat
    FeaturePrefsStore.batch1261.v1270boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1270: body mode
internal fun PlayerActivity.showV1270BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1270body
    FeaturePrefsStore.batch1261.v1270body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1270: bold mode
internal fun PlayerActivity.showV1270BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bold
    FeaturePrefsStore.batch1261.v1270bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1270: bolt mode
internal fun PlayerActivity.showV1270BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bolt
    FeaturePrefsStore.batch1261.v1270bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1271: bomb mode
internal fun PlayerActivity.showV1271BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bomb
    FeaturePrefsStore.batch1271.v1271bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1271: bond mode
internal fun PlayerActivity.showV1271BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bond
    FeaturePrefsStore.batch1271.v1271bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1271: bone mode
internal fun PlayerActivity.showV1271BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bone
    FeaturePrefsStore.batch1271.v1271bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1271: book mode
internal fun PlayerActivity.showV1271BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1271book
    FeaturePrefsStore.batch1271.v1271book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1271: boom mode
internal fun PlayerActivity.showV1271BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1271boom
    FeaturePrefsStore.batch1271.v1271boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1271: boot level
internal fun PlayerActivity.showV1271BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1271: born level
internal fun PlayerActivity.showV1271BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271born = value
        AppToast.show(this, "born: $value")
    }
}

// v1271: boss level
internal fun PlayerActivity.showV1271BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1271: both level
internal fun PlayerActivity.showV1271BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271both = value
        AppToast.show(this, "both: $value")
    }
}

// v1271: bound level
internal fun PlayerActivity.showV1271BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1271: bowl mode
internal fun PlayerActivity.showV1271BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bowl
    FeaturePrefsStore.batch1271.v1271bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1271: brain mode
internal fun PlayerActivity.showV1271BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brain
    FeaturePrefsStore.batch1271.v1271brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1271: brake mode
internal fun PlayerActivity.showV1271BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brake
    FeaturePrefsStore.batch1271.v1271brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1271: brass mode
internal fun PlayerActivity.showV1271BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brass
    FeaturePrefsStore.batch1271.v1271brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1271: brave mode
internal fun PlayerActivity.showV1271BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brave
    FeaturePrefsStore.batch1271.v1271brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1272: bomb mode
internal fun PlayerActivity.showV1272BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bomb
    FeaturePrefsStore.batch1271.v1272bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1272: bond mode
internal fun PlayerActivity.showV1272BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bond
    FeaturePrefsStore.batch1271.v1272bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1272: bone mode
internal fun PlayerActivity.showV1272BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bone
    FeaturePrefsStore.batch1271.v1272bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1272: book mode
internal fun PlayerActivity.showV1272BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1272book
    FeaturePrefsStore.batch1271.v1272book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1272: boom mode
internal fun PlayerActivity.showV1272BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1272boom
    FeaturePrefsStore.batch1271.v1272boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1272: boot level
internal fun PlayerActivity.showV1272BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1272: born level
internal fun PlayerActivity.showV1272BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272born = value
        AppToast.show(this, "born: $value")
    }
}

// v1272: boss level
internal fun PlayerActivity.showV1272BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1272: both level
internal fun PlayerActivity.showV1272BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272both = value
        AppToast.show(this, "both: $value")
    }
}

// v1272: bound level
internal fun PlayerActivity.showV1272BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1272: bowl mode
internal fun PlayerActivity.showV1272BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bowl
    FeaturePrefsStore.batch1271.v1272bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1272: brain mode
internal fun PlayerActivity.showV1272BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brain
    FeaturePrefsStore.batch1271.v1272brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1272: brake mode
internal fun PlayerActivity.showV1272BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brake
    FeaturePrefsStore.batch1271.v1272brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1272: brass mode
internal fun PlayerActivity.showV1272BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brass
    FeaturePrefsStore.batch1271.v1272brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1272: brave mode
internal fun PlayerActivity.showV1272BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brave
    FeaturePrefsStore.batch1271.v1272brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1273: bomb mode
internal fun PlayerActivity.showV1273BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bomb
    FeaturePrefsStore.batch1271.v1273bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1273: bond mode
internal fun PlayerActivity.showV1273BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bond
    FeaturePrefsStore.batch1271.v1273bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1273: bone mode
internal fun PlayerActivity.showV1273BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bone
    FeaturePrefsStore.batch1271.v1273bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1273: book mode
internal fun PlayerActivity.showV1273BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1273book
    FeaturePrefsStore.batch1271.v1273book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1273: boom mode
internal fun PlayerActivity.showV1273BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1273boom
    FeaturePrefsStore.batch1271.v1273boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1273: boot level
internal fun PlayerActivity.showV1273BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1273: born level
internal fun PlayerActivity.showV1273BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273born = value
        AppToast.show(this, "born: $value")
    }
}

// v1273: boss level
internal fun PlayerActivity.showV1273BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1273: both level
internal fun PlayerActivity.showV1273BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273both = value
        AppToast.show(this, "both: $value")
    }
}

// v1273: bound level
internal fun PlayerActivity.showV1273BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1273: bowl mode
internal fun PlayerActivity.showV1273BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bowl
    FeaturePrefsStore.batch1271.v1273bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1273: brain mode
internal fun PlayerActivity.showV1273BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brain
    FeaturePrefsStore.batch1271.v1273brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1273: brake mode
internal fun PlayerActivity.showV1273BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brake
    FeaturePrefsStore.batch1271.v1273brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1273: brass mode
internal fun PlayerActivity.showV1273BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brass
    FeaturePrefsStore.batch1271.v1273brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1273: brave mode
internal fun PlayerActivity.showV1273BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brave
    FeaturePrefsStore.batch1271.v1273brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1274: bomb mode
internal fun PlayerActivity.showV1274BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bomb
    FeaturePrefsStore.batch1271.v1274bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1274: bond mode
internal fun PlayerActivity.showV1274BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bond
    FeaturePrefsStore.batch1271.v1274bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1274: bone mode
internal fun PlayerActivity.showV1274BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bone
    FeaturePrefsStore.batch1271.v1274bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1274: book mode
internal fun PlayerActivity.showV1274BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1274book
    FeaturePrefsStore.batch1271.v1274book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1274: boom mode
internal fun PlayerActivity.showV1274BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1274boom
    FeaturePrefsStore.batch1271.v1274boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1274: boot level
internal fun PlayerActivity.showV1274BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1274: born level
internal fun PlayerActivity.showV1274BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274born = value
        AppToast.show(this, "born: $value")
    }
}

// v1274: boss level
internal fun PlayerActivity.showV1274BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1274: both level
internal fun PlayerActivity.showV1274BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274both = value
        AppToast.show(this, "both: $value")
    }
}

// v1274: bound level
internal fun PlayerActivity.showV1274BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1274: bowl mode
internal fun PlayerActivity.showV1274BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bowl
    FeaturePrefsStore.batch1271.v1274bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1274: brain mode
internal fun PlayerActivity.showV1274BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brain
    FeaturePrefsStore.batch1271.v1274brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1274: brake mode
internal fun PlayerActivity.showV1274BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brake
    FeaturePrefsStore.batch1271.v1274brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1274: brass mode
internal fun PlayerActivity.showV1274BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brass
    FeaturePrefsStore.batch1271.v1274brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1274: brave mode
internal fun PlayerActivity.showV1274BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brave
    FeaturePrefsStore.batch1271.v1274brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1275: bomb mode
internal fun PlayerActivity.showV1275BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bomb
    FeaturePrefsStore.batch1271.v1275bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1275: bond mode
internal fun PlayerActivity.showV1275BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bond
    FeaturePrefsStore.batch1271.v1275bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1275: bone mode
internal fun PlayerActivity.showV1275BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bone
    FeaturePrefsStore.batch1271.v1275bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1275: book mode
internal fun PlayerActivity.showV1275BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1275book
    FeaturePrefsStore.batch1271.v1275book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1275: boom mode
internal fun PlayerActivity.showV1275BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1275boom
    FeaturePrefsStore.batch1271.v1275boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1275: boot level
internal fun PlayerActivity.showV1275BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1275: born level
internal fun PlayerActivity.showV1275BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275born = value
        AppToast.show(this, "born: $value")
    }
}

// v1275: boss level
internal fun PlayerActivity.showV1275BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1275: both level
internal fun PlayerActivity.showV1275BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275both = value
        AppToast.show(this, "both: $value")
    }
}

// v1275: bound level
internal fun PlayerActivity.showV1275BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1275: bowl mode
internal fun PlayerActivity.showV1275BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bowl
    FeaturePrefsStore.batch1271.v1275bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1275: brain mode
internal fun PlayerActivity.showV1275BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brain
    FeaturePrefsStore.batch1271.v1275brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1275: brake mode
internal fun PlayerActivity.showV1275BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brake
    FeaturePrefsStore.batch1271.v1275brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1275: brass mode
internal fun PlayerActivity.showV1275BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brass
    FeaturePrefsStore.batch1271.v1275brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1275: brave mode
internal fun PlayerActivity.showV1275BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brave
    FeaturePrefsStore.batch1271.v1275brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1276: bomb mode
internal fun PlayerActivity.showV1276BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bomb
    FeaturePrefsStore.batch1271.v1276bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1276: bond mode
internal fun PlayerActivity.showV1276BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bond
    FeaturePrefsStore.batch1271.v1276bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1276: bone mode
internal fun PlayerActivity.showV1276BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bone
    FeaturePrefsStore.batch1271.v1276bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1276: book mode
internal fun PlayerActivity.showV1276BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1276book
    FeaturePrefsStore.batch1271.v1276book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1276: boom mode
internal fun PlayerActivity.showV1276BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1276boom
    FeaturePrefsStore.batch1271.v1276boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1276: boot level
internal fun PlayerActivity.showV1276BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1276: born level
internal fun PlayerActivity.showV1276BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276born = value
        AppToast.show(this, "born: $value")
    }
}

// v1276: boss level
internal fun PlayerActivity.showV1276BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1276: both level
internal fun PlayerActivity.showV1276BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276both = value
        AppToast.show(this, "both: $value")
    }
}

// v1276: bound level
internal fun PlayerActivity.showV1276BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1276: bowl mode
internal fun PlayerActivity.showV1276BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bowl
    FeaturePrefsStore.batch1271.v1276bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1276: brain mode
internal fun PlayerActivity.showV1276BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brain
    FeaturePrefsStore.batch1271.v1276brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1276: brake mode
internal fun PlayerActivity.showV1276BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brake
    FeaturePrefsStore.batch1271.v1276brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1276: brass mode
internal fun PlayerActivity.showV1276BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brass
    FeaturePrefsStore.batch1271.v1276brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1276: brave mode
internal fun PlayerActivity.showV1276BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brave
    FeaturePrefsStore.batch1271.v1276brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1277: bomb mode
internal fun PlayerActivity.showV1277BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bomb
    FeaturePrefsStore.batch1271.v1277bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1277: bond mode
internal fun PlayerActivity.showV1277BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bond
    FeaturePrefsStore.batch1271.v1277bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1277: bone mode
internal fun PlayerActivity.showV1277BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bone
    FeaturePrefsStore.batch1271.v1277bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1277: book mode
internal fun PlayerActivity.showV1277BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1277book
    FeaturePrefsStore.batch1271.v1277book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1277: boom mode
internal fun PlayerActivity.showV1277BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1277boom
    FeaturePrefsStore.batch1271.v1277boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1277: boot level
internal fun PlayerActivity.showV1277BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1277: born level
internal fun PlayerActivity.showV1277BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277born = value
        AppToast.show(this, "born: $value")
    }
}

// v1277: boss level
internal fun PlayerActivity.showV1277BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1277: both level
internal fun PlayerActivity.showV1277BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277both = value
        AppToast.show(this, "both: $value")
    }
}

// v1277: bound level
internal fun PlayerActivity.showV1277BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1277: bowl mode
internal fun PlayerActivity.showV1277BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bowl
    FeaturePrefsStore.batch1271.v1277bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1277: brain mode
internal fun PlayerActivity.showV1277BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brain
    FeaturePrefsStore.batch1271.v1277brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1277: brake mode
internal fun PlayerActivity.showV1277BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brake
    FeaturePrefsStore.batch1271.v1277brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1277: brass mode
internal fun PlayerActivity.showV1277BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brass
    FeaturePrefsStore.batch1271.v1277brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1277: brave mode
internal fun PlayerActivity.showV1277BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brave
    FeaturePrefsStore.batch1271.v1277brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1278: bomb mode
internal fun PlayerActivity.showV1278BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bomb
    FeaturePrefsStore.batch1271.v1278bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1278: bond mode
internal fun PlayerActivity.showV1278BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bond
    FeaturePrefsStore.batch1271.v1278bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1278: bone mode
internal fun PlayerActivity.showV1278BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bone
    FeaturePrefsStore.batch1271.v1278bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1278: book mode
internal fun PlayerActivity.showV1278BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1278book
    FeaturePrefsStore.batch1271.v1278book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1278: boom mode
internal fun PlayerActivity.showV1278BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1278boom
    FeaturePrefsStore.batch1271.v1278boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1278: boot level
internal fun PlayerActivity.showV1278BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1278: born level
internal fun PlayerActivity.showV1278BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278born = value
        AppToast.show(this, "born: $value")
    }
}

// v1278: boss level
internal fun PlayerActivity.showV1278BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1278: both level
internal fun PlayerActivity.showV1278BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278both = value
        AppToast.show(this, "both: $value")
    }
}

// v1278: bound level
internal fun PlayerActivity.showV1278BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1278: bowl mode
internal fun PlayerActivity.showV1278BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bowl
    FeaturePrefsStore.batch1271.v1278bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1278: brain mode
internal fun PlayerActivity.showV1278BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brain
    FeaturePrefsStore.batch1271.v1278brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1278: brake mode
internal fun PlayerActivity.showV1278BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brake
    FeaturePrefsStore.batch1271.v1278brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1278: brass mode
internal fun PlayerActivity.showV1278BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brass
    FeaturePrefsStore.batch1271.v1278brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1278: brave mode
internal fun PlayerActivity.showV1278BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brave
    FeaturePrefsStore.batch1271.v1278brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1279: bomb mode
internal fun PlayerActivity.showV1279BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bomb
    FeaturePrefsStore.batch1271.v1279bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1279: bond mode
internal fun PlayerActivity.showV1279BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bond
    FeaturePrefsStore.batch1271.v1279bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1279: bone mode
internal fun PlayerActivity.showV1279BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bone
    FeaturePrefsStore.batch1271.v1279bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1279: book mode
internal fun PlayerActivity.showV1279BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1279book
    FeaturePrefsStore.batch1271.v1279book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1279: boom mode
internal fun PlayerActivity.showV1279BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1279boom
    FeaturePrefsStore.batch1271.v1279boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1279: boot level
internal fun PlayerActivity.showV1279BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1279: born level
internal fun PlayerActivity.showV1279BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279born = value
        AppToast.show(this, "born: $value")
    }
}

// v1279: boss level
internal fun PlayerActivity.showV1279BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1279: both level
internal fun PlayerActivity.showV1279BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279both = value
        AppToast.show(this, "both: $value")
    }
}

// v1279: bound level
internal fun PlayerActivity.showV1279BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1279: bowl mode
internal fun PlayerActivity.showV1279BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bowl
    FeaturePrefsStore.batch1271.v1279bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1279: brain mode
internal fun PlayerActivity.showV1279BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brain
    FeaturePrefsStore.batch1271.v1279brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1279: brake mode
internal fun PlayerActivity.showV1279BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brake
    FeaturePrefsStore.batch1271.v1279brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1279: brass mode
internal fun PlayerActivity.showV1279BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brass
    FeaturePrefsStore.batch1271.v1279brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1279: brave mode
internal fun PlayerActivity.showV1279BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brave
    FeaturePrefsStore.batch1271.v1279brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1280: bomb mode
internal fun PlayerActivity.showV1280BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bomb
    FeaturePrefsStore.batch1271.v1280bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1280: bond mode
internal fun PlayerActivity.showV1280BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bond
    FeaturePrefsStore.batch1271.v1280bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1280: bone mode
internal fun PlayerActivity.showV1280BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bone
    FeaturePrefsStore.batch1271.v1280bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1280: book mode
internal fun PlayerActivity.showV1280BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1280book
    FeaturePrefsStore.batch1271.v1280book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1280: boom mode
internal fun PlayerActivity.showV1280BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1280boom
    FeaturePrefsStore.batch1271.v1280boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1280: boot level
internal fun PlayerActivity.showV1280BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1280: born level
internal fun PlayerActivity.showV1280BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280born = value
        AppToast.show(this, "born: $value")
    }
}

// v1280: boss level
internal fun PlayerActivity.showV1280BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1280: both level
internal fun PlayerActivity.showV1280BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280both = value
        AppToast.show(this, "both: $value")
    }
}

// v1280: bound level
internal fun PlayerActivity.showV1280BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1280: bowl mode
internal fun PlayerActivity.showV1280BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bowl
    FeaturePrefsStore.batch1271.v1280bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1280: brain mode
internal fun PlayerActivity.showV1280BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brain
    FeaturePrefsStore.batch1271.v1280brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1280: brake mode
internal fun PlayerActivity.showV1280BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brake
    FeaturePrefsStore.batch1271.v1280brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1280: brass mode
internal fun PlayerActivity.showV1280BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brass
    FeaturePrefsStore.batch1271.v1280brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1280: brave mode
internal fun PlayerActivity.showV1280BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brave
    FeaturePrefsStore.batch1271.v1280brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}
