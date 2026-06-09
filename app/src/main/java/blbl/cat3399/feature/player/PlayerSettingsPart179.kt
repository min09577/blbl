package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1971: empowered mode
internal fun PlayerActivity.showV1971EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1971empowered
    FeaturePrefsStore.batch1971.v1971empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1971: enabled mode
internal fun PlayerActivity.showV1971EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1971enabled
    FeaturePrefsStore.batch1971.v1971enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1971: encountered mode
internal fun PlayerActivity.showV1971EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1971encountered
    FeaturePrefsStore.batch1971.v1971encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1971: encouraged mode
internal fun PlayerActivity.showV1971EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1971encouraged
    FeaturePrefsStore.batch1971.v1971encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1971: endorsed mode
internal fun PlayerActivity.showV1971EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1971endorsed
    FeaturePrefsStore.batch1971.v1971endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1971: endured level
internal fun PlayerActivity.showV1971EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1971endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1971endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1971: engaged level
internal fun PlayerActivity.showV1971EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1971engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1971engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1971: engineered level
internal fun PlayerActivity.showV1971EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1971engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1971engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1971: enhanced level
internal fun PlayerActivity.showV1971EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1971enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1971enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1971: enjoyed level
internal fun PlayerActivity.showV1971EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1971enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1971enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1971: enlarged mode
internal fun PlayerActivity.showV1971EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1971enlarged
    FeaturePrefsStore.batch1971.v1971enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1971: ensured mode
internal fun PlayerActivity.showV1971EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1971ensured
    FeaturePrefsStore.batch1971.v1971ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1971: entered mode
internal fun PlayerActivity.showV1971EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1971entered
    FeaturePrefsStore.batch1971.v1971entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1971: entitled mode
internal fun PlayerActivity.showV1971EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1971entitled
    FeaturePrefsStore.batch1971.v1971entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1971: equipped mode
internal fun PlayerActivity.showV1971EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1971equipped
    FeaturePrefsStore.batch1971.v1971equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1972: empowered mode
internal fun PlayerActivity.showV1972EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1972empowered
    FeaturePrefsStore.batch1971.v1972empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1972: enabled mode
internal fun PlayerActivity.showV1972EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1972enabled
    FeaturePrefsStore.batch1971.v1972enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1972: encountered mode
internal fun PlayerActivity.showV1972EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1972encountered
    FeaturePrefsStore.batch1971.v1972encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1972: encouraged mode
internal fun PlayerActivity.showV1972EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1972encouraged
    FeaturePrefsStore.batch1971.v1972encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1972: endorsed mode
internal fun PlayerActivity.showV1972EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1972endorsed
    FeaturePrefsStore.batch1971.v1972endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1972: endured level
internal fun PlayerActivity.showV1972EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1972endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1972endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1972: engaged level
internal fun PlayerActivity.showV1972EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1972engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1972engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1972: engineered level
internal fun PlayerActivity.showV1972EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1972engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1972engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1972: enhanced level
internal fun PlayerActivity.showV1972EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1972enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1972enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1972: enjoyed level
internal fun PlayerActivity.showV1972EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1972enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1972enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1972: enlarged mode
internal fun PlayerActivity.showV1972EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1972enlarged
    FeaturePrefsStore.batch1971.v1972enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1972: ensured mode
internal fun PlayerActivity.showV1972EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1972ensured
    FeaturePrefsStore.batch1971.v1972ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1972: entered mode
internal fun PlayerActivity.showV1972EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1972entered
    FeaturePrefsStore.batch1971.v1972entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1972: entitled mode
internal fun PlayerActivity.showV1972EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1972entitled
    FeaturePrefsStore.batch1971.v1972entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1972: equipped mode
internal fun PlayerActivity.showV1972EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1972equipped
    FeaturePrefsStore.batch1971.v1972equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1973: empowered mode
internal fun PlayerActivity.showV1973EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1973empowered
    FeaturePrefsStore.batch1971.v1973empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1973: enabled mode
internal fun PlayerActivity.showV1973EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1973enabled
    FeaturePrefsStore.batch1971.v1973enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1973: encountered mode
internal fun PlayerActivity.showV1973EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1973encountered
    FeaturePrefsStore.batch1971.v1973encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1973: encouraged mode
internal fun PlayerActivity.showV1973EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1973encouraged
    FeaturePrefsStore.batch1971.v1973encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1973: endorsed mode
internal fun PlayerActivity.showV1973EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1973endorsed
    FeaturePrefsStore.batch1971.v1973endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1973: endured level
internal fun PlayerActivity.showV1973EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1973endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1973endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1973: engaged level
internal fun PlayerActivity.showV1973EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1973engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1973engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1973: engineered level
internal fun PlayerActivity.showV1973EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1973engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1973engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1973: enhanced level
internal fun PlayerActivity.showV1973EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1973enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1973enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1973: enjoyed level
internal fun PlayerActivity.showV1973EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1973enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1973enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1973: enlarged mode
internal fun PlayerActivity.showV1973EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1973enlarged
    FeaturePrefsStore.batch1971.v1973enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1973: ensured mode
internal fun PlayerActivity.showV1973EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1973ensured
    FeaturePrefsStore.batch1971.v1973ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1973: entered mode
internal fun PlayerActivity.showV1973EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1973entered
    FeaturePrefsStore.batch1971.v1973entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1973: entitled mode
internal fun PlayerActivity.showV1973EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1973entitled
    FeaturePrefsStore.batch1971.v1973entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1973: equipped mode
internal fun PlayerActivity.showV1973EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1973equipped
    FeaturePrefsStore.batch1971.v1973equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1974: empowered mode
internal fun PlayerActivity.showV1974EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1974empowered
    FeaturePrefsStore.batch1971.v1974empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1974: enabled mode
internal fun PlayerActivity.showV1974EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1974enabled
    FeaturePrefsStore.batch1971.v1974enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1974: encountered mode
internal fun PlayerActivity.showV1974EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1974encountered
    FeaturePrefsStore.batch1971.v1974encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1974: encouraged mode
internal fun PlayerActivity.showV1974EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1974encouraged
    FeaturePrefsStore.batch1971.v1974encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1974: endorsed mode
internal fun PlayerActivity.showV1974EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1974endorsed
    FeaturePrefsStore.batch1971.v1974endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1974: endured level
internal fun PlayerActivity.showV1974EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1974endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1974endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1974: engaged level
internal fun PlayerActivity.showV1974EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1974engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1974engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1974: engineered level
internal fun PlayerActivity.showV1974EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1974engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1974engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1974: enhanced level
internal fun PlayerActivity.showV1974EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1974enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1974enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1974: enjoyed level
internal fun PlayerActivity.showV1974EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1974enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1974enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1974: enlarged mode
internal fun PlayerActivity.showV1974EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1974enlarged
    FeaturePrefsStore.batch1971.v1974enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1974: ensured mode
internal fun PlayerActivity.showV1974EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1974ensured
    FeaturePrefsStore.batch1971.v1974ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1974: entered mode
internal fun PlayerActivity.showV1974EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1974entered
    FeaturePrefsStore.batch1971.v1974entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1974: entitled mode
internal fun PlayerActivity.showV1974EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1974entitled
    FeaturePrefsStore.batch1971.v1974entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1974: equipped mode
internal fun PlayerActivity.showV1974EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1974equipped
    FeaturePrefsStore.batch1971.v1974equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1975: empowered mode
internal fun PlayerActivity.showV1975EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1975empowered
    FeaturePrefsStore.batch1971.v1975empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1975: enabled mode
internal fun PlayerActivity.showV1975EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1975enabled
    FeaturePrefsStore.batch1971.v1975enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1975: encountered mode
internal fun PlayerActivity.showV1975EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1975encountered
    FeaturePrefsStore.batch1971.v1975encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1975: encouraged mode
internal fun PlayerActivity.showV1975EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1975encouraged
    FeaturePrefsStore.batch1971.v1975encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1975: endorsed mode
internal fun PlayerActivity.showV1975EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1975endorsed
    FeaturePrefsStore.batch1971.v1975endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1975: endured level
internal fun PlayerActivity.showV1975EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1975endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1975endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1975: engaged level
internal fun PlayerActivity.showV1975EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1975engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1975engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1975: engineered level
internal fun PlayerActivity.showV1975EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1975engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1975engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1975: enhanced level
internal fun PlayerActivity.showV1975EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1975enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1975enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1975: enjoyed level
internal fun PlayerActivity.showV1975EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1975enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1975enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1975: enlarged mode
internal fun PlayerActivity.showV1975EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1975enlarged
    FeaturePrefsStore.batch1971.v1975enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1975: ensured mode
internal fun PlayerActivity.showV1975EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1975ensured
    FeaturePrefsStore.batch1971.v1975ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1975: entered mode
internal fun PlayerActivity.showV1975EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1975entered
    FeaturePrefsStore.batch1971.v1975entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1975: entitled mode
internal fun PlayerActivity.showV1975EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1975entitled
    FeaturePrefsStore.batch1971.v1975entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1975: equipped mode
internal fun PlayerActivity.showV1975EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1975equipped
    FeaturePrefsStore.batch1971.v1975equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1976: empowered mode
internal fun PlayerActivity.showV1976EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1976empowered
    FeaturePrefsStore.batch1971.v1976empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1976: enabled mode
internal fun PlayerActivity.showV1976EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1976enabled
    FeaturePrefsStore.batch1971.v1976enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1976: encountered mode
internal fun PlayerActivity.showV1976EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1976encountered
    FeaturePrefsStore.batch1971.v1976encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1976: encouraged mode
internal fun PlayerActivity.showV1976EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1976encouraged
    FeaturePrefsStore.batch1971.v1976encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1976: endorsed mode
internal fun PlayerActivity.showV1976EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1976endorsed
    FeaturePrefsStore.batch1971.v1976endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1976: endured level
internal fun PlayerActivity.showV1976EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1976endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1976endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1976: engaged level
internal fun PlayerActivity.showV1976EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1976engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1976engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1976: engineered level
internal fun PlayerActivity.showV1976EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1976engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1976engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1976: enhanced level
internal fun PlayerActivity.showV1976EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1976enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1976enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1976: enjoyed level
internal fun PlayerActivity.showV1976EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1976enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1976enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1976: enlarged mode
internal fun PlayerActivity.showV1976EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1976enlarged
    FeaturePrefsStore.batch1971.v1976enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1976: ensured mode
internal fun PlayerActivity.showV1976EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1976ensured
    FeaturePrefsStore.batch1971.v1976ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1976: entered mode
internal fun PlayerActivity.showV1976EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1976entered
    FeaturePrefsStore.batch1971.v1976entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1976: entitled mode
internal fun PlayerActivity.showV1976EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1976entitled
    FeaturePrefsStore.batch1971.v1976entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1976: equipped mode
internal fun PlayerActivity.showV1976EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1976equipped
    FeaturePrefsStore.batch1971.v1976equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1977: empowered mode
internal fun PlayerActivity.showV1977EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1977empowered
    FeaturePrefsStore.batch1971.v1977empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1977: enabled mode
internal fun PlayerActivity.showV1977EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1977enabled
    FeaturePrefsStore.batch1971.v1977enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1977: encountered mode
internal fun PlayerActivity.showV1977EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1977encountered
    FeaturePrefsStore.batch1971.v1977encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1977: encouraged mode
internal fun PlayerActivity.showV1977EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1977encouraged
    FeaturePrefsStore.batch1971.v1977encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1977: endorsed mode
internal fun PlayerActivity.showV1977EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1977endorsed
    FeaturePrefsStore.batch1971.v1977endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1977: endured level
internal fun PlayerActivity.showV1977EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1977endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1977endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1977: engaged level
internal fun PlayerActivity.showV1977EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1977engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1977engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1977: engineered level
internal fun PlayerActivity.showV1977EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1977engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1977engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1977: enhanced level
internal fun PlayerActivity.showV1977EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1977enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1977enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1977: enjoyed level
internal fun PlayerActivity.showV1977EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1977enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1977enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1977: enlarged mode
internal fun PlayerActivity.showV1977EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1977enlarged
    FeaturePrefsStore.batch1971.v1977enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1977: ensured mode
internal fun PlayerActivity.showV1977EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1977ensured
    FeaturePrefsStore.batch1971.v1977ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1977: entered mode
internal fun PlayerActivity.showV1977EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1977entered
    FeaturePrefsStore.batch1971.v1977entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1977: entitled mode
internal fun PlayerActivity.showV1977EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1977entitled
    FeaturePrefsStore.batch1971.v1977entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1977: equipped mode
internal fun PlayerActivity.showV1977EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1977equipped
    FeaturePrefsStore.batch1971.v1977equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1978: empowered mode
internal fun PlayerActivity.showV1978EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1978empowered
    FeaturePrefsStore.batch1971.v1978empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1978: enabled mode
internal fun PlayerActivity.showV1978EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1978enabled
    FeaturePrefsStore.batch1971.v1978enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1978: encountered mode
internal fun PlayerActivity.showV1978EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1978encountered
    FeaturePrefsStore.batch1971.v1978encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1978: encouraged mode
internal fun PlayerActivity.showV1978EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1978encouraged
    FeaturePrefsStore.batch1971.v1978encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1978: endorsed mode
internal fun PlayerActivity.showV1978EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1978endorsed
    FeaturePrefsStore.batch1971.v1978endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1978: endured level
internal fun PlayerActivity.showV1978EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1978endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1978endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1978: engaged level
internal fun PlayerActivity.showV1978EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1978engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1978engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1978: engineered level
internal fun PlayerActivity.showV1978EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1978engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1978engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1978: enhanced level
internal fun PlayerActivity.showV1978EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1978enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1978enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1978: enjoyed level
internal fun PlayerActivity.showV1978EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1978enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1978enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1978: enlarged mode
internal fun PlayerActivity.showV1978EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1978enlarged
    FeaturePrefsStore.batch1971.v1978enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1978: ensured mode
internal fun PlayerActivity.showV1978EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1978ensured
    FeaturePrefsStore.batch1971.v1978ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1978: entered mode
internal fun PlayerActivity.showV1978EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1978entered
    FeaturePrefsStore.batch1971.v1978entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1978: entitled mode
internal fun PlayerActivity.showV1978EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1978entitled
    FeaturePrefsStore.batch1971.v1978entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1978: equipped mode
internal fun PlayerActivity.showV1978EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1978equipped
    FeaturePrefsStore.batch1971.v1978equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1979: empowered mode
internal fun PlayerActivity.showV1979EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1979empowered
    FeaturePrefsStore.batch1971.v1979empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1979: enabled mode
internal fun PlayerActivity.showV1979EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1979enabled
    FeaturePrefsStore.batch1971.v1979enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1979: encountered mode
internal fun PlayerActivity.showV1979EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1979encountered
    FeaturePrefsStore.batch1971.v1979encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1979: encouraged mode
internal fun PlayerActivity.showV1979EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1979encouraged
    FeaturePrefsStore.batch1971.v1979encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1979: endorsed mode
internal fun PlayerActivity.showV1979EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1979endorsed
    FeaturePrefsStore.batch1971.v1979endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1979: endured level
internal fun PlayerActivity.showV1979EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1979endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1979endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1979: engaged level
internal fun PlayerActivity.showV1979EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1979engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1979engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1979: engineered level
internal fun PlayerActivity.showV1979EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1979engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1979engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1979: enhanced level
internal fun PlayerActivity.showV1979EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1979enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1979enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1979: enjoyed level
internal fun PlayerActivity.showV1979EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1979enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1979enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1979: enlarged mode
internal fun PlayerActivity.showV1979EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1979enlarged
    FeaturePrefsStore.batch1971.v1979enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1979: ensured mode
internal fun PlayerActivity.showV1979EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1979ensured
    FeaturePrefsStore.batch1971.v1979ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1979: entered mode
internal fun PlayerActivity.showV1979EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1979entered
    FeaturePrefsStore.batch1971.v1979entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1979: entitled mode
internal fun PlayerActivity.showV1979EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1979entitled
    FeaturePrefsStore.batch1971.v1979entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1979: equipped mode
internal fun PlayerActivity.showV1979EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1979equipped
    FeaturePrefsStore.batch1971.v1979equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

// v1980: empowered mode
internal fun PlayerActivity.showV1980EmpoweredToggle() {
    val current = FeaturePrefsStore.batch1971.v1980empowered
    FeaturePrefsStore.batch1971.v1980empowered = !current
    AppToast.show(this, "empowered: ${if (!current) "ON" else "OFF"}")
}

// v1980: enabled mode
internal fun PlayerActivity.showV1980EnabledToggle() {
    val current = FeaturePrefsStore.batch1971.v1980enabled
    FeaturePrefsStore.batch1971.v1980enabled = !current
    AppToast.show(this, "enabled: ${if (!current) "ON" else "OFF"}")
}

// v1980: encountered mode
internal fun PlayerActivity.showV1980EncounteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1980encountered
    FeaturePrefsStore.batch1971.v1980encountered = !current
    AppToast.show(this, "encountered: ${if (!current) "ON" else "OFF"}")
}

// v1980: encouraged mode
internal fun PlayerActivity.showV1980EncouragedToggle() {
    val current = FeaturePrefsStore.batch1971.v1980encouraged
    FeaturePrefsStore.batch1971.v1980encouraged = !current
    AppToast.show(this, "encouraged: ${if (!current) "ON" else "OFF"}")
}

// v1980: endorsed mode
internal fun PlayerActivity.showV1980EndorsedToggle() {
    val current = FeaturePrefsStore.batch1971.v1980endorsed
    FeaturePrefsStore.batch1971.v1980endorsed = !current
    AppToast.show(this, "endorsed: ${if (!current) "ON" else "OFF"}")
}

// v1980: endured level
internal fun PlayerActivity.showV1980EnduredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1980endured).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "endured level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1980endured = value
        AppToast.show(this, "endured: $value")
    }
}

// v1980: engaged level
internal fun PlayerActivity.showV1980EngagedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1980engaged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engaged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1980engaged = value
        AppToast.show(this, "engaged: $value")
    }
}

// v1980: engineered level
internal fun PlayerActivity.showV1980EngineeredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1980engineered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "engineered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1980engineered = value
        AppToast.show(this, "engineered: $value")
    }
}

// v1980: enhanced level
internal fun PlayerActivity.showV1980EnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1980enhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enhanced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1980enhanced = value
        AppToast.show(this, "enhanced: $value")
    }
}

// v1980: enjoyed level
internal fun PlayerActivity.showV1980EnjoyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1971.v1980enjoyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enjoyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1971.v1980enjoyed = value
        AppToast.show(this, "enjoyed: $value")
    }
}

// v1980: enlarged mode
internal fun PlayerActivity.showV1980EnlargedToggle() {
    val current = FeaturePrefsStore.batch1971.v1980enlarged
    FeaturePrefsStore.batch1971.v1980enlarged = !current
    AppToast.show(this, "enlarged: ${if (!current) "ON" else "OFF"}")
}

// v1980: ensured mode
internal fun PlayerActivity.showV1980EnsuredToggle() {
    val current = FeaturePrefsStore.batch1971.v1980ensured
    FeaturePrefsStore.batch1971.v1980ensured = !current
    AppToast.show(this, "ensured: ${if (!current) "ON" else "OFF"}")
}

// v1980: entered mode
internal fun PlayerActivity.showV1980EnteredToggle() {
    val current = FeaturePrefsStore.batch1971.v1980entered
    FeaturePrefsStore.batch1971.v1980entered = !current
    AppToast.show(this, "entered: ${if (!current) "ON" else "OFF"}")
}

// v1980: entitled mode
internal fun PlayerActivity.showV1980EntitledToggle() {
    val current = FeaturePrefsStore.batch1971.v1980entitled
    FeaturePrefsStore.batch1971.v1980entitled = !current
    AppToast.show(this, "entitled: ${if (!current) "ON" else "OFF"}")
}

// v1980: equipped mode
internal fun PlayerActivity.showV1980EquippedToggle() {
    val current = FeaturePrefsStore.batch1971.v1980equipped
    FeaturePrefsStore.batch1971.v1980equipped = !current
    AppToast.show(this, "equipped: ${if (!current) "ON" else "OFF"}")
}

