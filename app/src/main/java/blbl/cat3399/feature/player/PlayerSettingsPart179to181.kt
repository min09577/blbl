package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v249: Danmaku Bottom Max Count306
internal fun PlayerActivity.showV249DanmakuBottomMaxCount306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount306 = value
        AppToast.show(this, "Danmaku Bottom Max Count306: $value")
    }
}

// v249: Subtitle Bg Border313
internal fun PlayerActivity.showV249SubtitleBgBorder313Toggle() {
    val current = BiliClient.prefs.v249subtitleBgBorder313
    BiliClient.prefs.v249subtitleBgBorder313 = !current
    AppToast.show(this, "Subtitle Bg Border313: ${if (!current) "ON" else "OFF"}")
}

// v250: Audio EQ Custom250
internal fun PlayerActivity.showV250AudioEQCustom250Toggle() {
    val current = BiliClient.prefs.v250audioEQCustom250
    BiliClient.prefs.v250audioEQCustom250 = !current
    AppToast.show(this, "Audio EQ Custom250: ${if (!current) "ON" else "OFF"}")
}

// v250: Danmaku Bottom Max Count307
internal fun PlayerActivity.showV250DanmakuBottomMaxCount307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250danmakuBottomMaxCount307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250danmakuBottomMaxCount307 = value
        AppToast.show(this, "Danmaku Bottom Max Count307: $value")
    }
}

// v250: Subtitle Bg Border314
internal fun PlayerActivity.showV250SubtitleBgBorder314Toggle() {
    val current = BiliClient.prefs.v250subtitleBgBorder314
    BiliClient.prefs.v250subtitleBgBorder314 = !current
    AppToast.show(this, "Subtitle Bg Border314: ${if (!current) "ON" else "OFF"}")
}

// v250: Gesture Shake Action250
internal fun PlayerActivity.showV250GestureShakeAction250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250gestureShakeAction250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250gestureShakeAction250 = value
        AppToast.show(this, "Gesture Shake Action250: $value")
    }
}

// v250: Cast Audio Volume250
internal fun PlayerActivity.showV250CastAudioVolume250Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v250castAudioVolume250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250castAudioVolume250 = value
        AppToast.show(this, "Cast Audio Volume250: $value")
    }
}

// v250: Playlist Auto Skip Outro250
internal fun PlayerActivity.showV250PlaylistAutoSkipOutro250Toggle() {
    val current = BiliClient.prefs.v250playlistAutoSkipOutro250
    BiliClient.prefs.v250playlistAutoSkipOutro250 = !current
    AppToast.show(this, "Playlist Auto Skip Outro250: ${if (!current) "ON" else "OFF"}")
}

// v250: Cache Download Speed251
internal fun PlayerActivity.showV250CacheDownloadSpeed251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250cacheDownloadSpeed251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250cacheDownloadSpeed251 = value
        AppToast.show(this, "Cache Download Speed251: $value")
    }
}

// v250: Progress Bar Thumb Border250
internal fun PlayerActivity.showV250ProgressBarThumbBorder250Toggle() {
    val current = BiliClient.prefs.v250progressBarThumbBorder250
    BiliClient.prefs.v250progressBarThumbBorder250 = !current
    AppToast.show(this, "Progress Bar Thumb Border250: ${if (!current) "ON" else "OFF"}")
}

// v250: Volume Boost Peak250
internal fun PlayerActivity.showV250VolumeBoostPeak250Toggle() {
    val current = BiliClient.prefs.v250volumeBoostPeak250
    BiliClient.prefs.v250volumeBoostPeak250 = !current
    AppToast.show(this, "Volume Boost Peak250: ${if (!current) "ON" else "OFF"}")
}

// v250: History Bookmark Export250
internal fun PlayerActivity.showV250HistoryBookmarkExport250Toggle() {
    val current = BiliClient.prefs.v250historyBookmarkExport250
    BiliClient.prefs.v250historyBookmarkExport250 = !current
    AppToast.show(this, "History Bookmark Export250: ${if (!current) "ON" else "OFF"}")
}

// v250: Playback Chapter Sync250
internal fun PlayerActivity.showV250PlaybackChapterSync250Toggle() {
    val current = BiliClient.prefs.v250playbackChapterSync250
    BiliClient.prefs.v250playbackChapterSync250 = !current
    AppToast.show(this, "Playback Chapter Sync250: ${if (!current) "ON" else "OFF"}")
}

// v250: Screenshot Save Path250
internal fun PlayerActivity.showV250ScreenshotSavePath250Toggle() {
    val current = BiliClient.prefs.v250screenshotSavePath250
    BiliClient.prefs.v250screenshotSavePath250 = !current
    AppToast.show(this, "Screenshot Save Path250: ${if (!current) "ON" else "OFF"}")
}

// v250: Video Color Space250
internal fun PlayerActivity.showV250VideoColorSpace250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250videoColorSpace250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250videoColorSpace250 = value
        AppToast.show(this, "Video Color Space250: $value")
    }
}

// v250: Danmaku Bottom Max Count308
internal fun PlayerActivity.showV250DanmakuBottomMaxCount308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250danmakuBottomMaxCount308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250danmakuBottomMaxCount308 = value
        AppToast.show(this, "Danmaku Bottom Max Count308: $value")
    }
}

// v250: Subtitle Bg Border315
internal fun PlayerActivity.showV250SubtitleBgBorder315Toggle() {
    val current = BiliClient.prefs.v250subtitleBgBorder315
    BiliClient.prefs.v250subtitleBgBorder315 = !current
    AppToast.show(this, "Subtitle Bg Border315: ${if (!current) "ON" else "OFF"}")
}

// v251: Audio EQ Custom251
internal fun PlayerActivity.showV251AudioEQCustom251Toggle() {
    val current = BiliClient.prefs.v251audioEQCustom251
    BiliClient.prefs.v251audioEQCustom251 = !current
    AppToast.show(this, "Audio EQ Custom251: ${if (!current) "ON" else "OFF"}")
}

// v251: Danmaku Bottom Max Count309
internal fun PlayerActivity.showV251DanmakuBottomMaxCount309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251danmakuBottomMaxCount309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251danmakuBottomMaxCount309 = value
        AppToast.show(this, "Danmaku Bottom Max Count309: $value")
    }
}

// v251: Subtitle Bg Border316
internal fun PlayerActivity.showV251SubtitleBgBorder316Toggle() {
    val current = BiliClient.prefs.v251subtitleBgBorder316
    BiliClient.prefs.v251subtitleBgBorder316 = !current
    AppToast.show(this, "Subtitle Bg Border316: ${if (!current) "ON" else "OFF"}")
}

// v251: Gesture Shake Action251
internal fun PlayerActivity.showV251GestureShakeAction251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251gestureShakeAction251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251gestureShakeAction251 = value
        AppToast.show(this, "Gesture Shake Action251: $value")
    }
}

// v251: Cast Audio Volume251
internal fun PlayerActivity.showV251CastAudioVolume251Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v251castAudioVolume251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251castAudioVolume251 = value
        AppToast.show(this, "Cast Audio Volume251: $value")
    }
}

// v251: Playlist Auto Skip Outro251
internal fun PlayerActivity.showV251PlaylistAutoSkipOutro251Toggle() {
    val current = BiliClient.prefs.v251playlistAutoSkipOutro251
    BiliClient.prefs.v251playlistAutoSkipOutro251 = !current
    AppToast.show(this, "Playlist Auto Skip Outro251: ${if (!current) "ON" else "OFF"}")
}

// v251: Cache Download Speed252
internal fun PlayerActivity.showV251CacheDownloadSpeed252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251cacheDownloadSpeed252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251cacheDownloadSpeed252 = value
        AppToast.show(this, "Cache Download Speed252: $value")
    }
}

// v251: Progress Bar Thumb Border251
internal fun PlayerActivity.showV251ProgressBarThumbBorder251Toggle() {
    val current = BiliClient.prefs.v251progressBarThumbBorder251
    BiliClient.prefs.v251progressBarThumbBorder251 = !current
    AppToast.show(this, "Progress Bar Thumb Border251: ${if (!current) "ON" else "OFF"}")
}

// v251: Volume Boost Peak251
internal fun PlayerActivity.showV251VolumeBoostPeak251Toggle() {
    val current = BiliClient.prefs.v251volumeBoostPeak251
    BiliClient.prefs.v251volumeBoostPeak251 = !current
    AppToast.show(this, "Volume Boost Peak251: ${if (!current) "ON" else "OFF"}")
}

// v251: History Bookmark Export251
internal fun PlayerActivity.showV251HistoryBookmarkExport251Toggle() {
    val current = BiliClient.prefs.v251historyBookmarkExport251
    BiliClient.prefs.v251historyBookmarkExport251 = !current
    AppToast.show(this, "History Bookmark Export251: ${if (!current) "ON" else "OFF"}")
}

// v251: Playback Chapter Sync251
internal fun PlayerActivity.showV251PlaybackChapterSync251Toggle() {
    val current = BiliClient.prefs.v251playbackChapterSync251
    BiliClient.prefs.v251playbackChapterSync251 = !current
    AppToast.show(this, "Playback Chapter Sync251: ${if (!current) "ON" else "OFF"}")
}

// v251: Screenshot Save Path251
internal fun PlayerActivity.showV251ScreenshotSavePath251Toggle() {
    val current = BiliClient.prefs.v251screenshotSavePath251
    BiliClient.prefs.v251screenshotSavePath251 = !current
    AppToast.show(this, "Screenshot Save Path251: ${if (!current) "ON" else "OFF"}")
}

// v251: Video Color Space251
internal fun PlayerActivity.showV251VideoColorSpace251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251videoColorSpace251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251videoColorSpace251 = value
        AppToast.show(this, "Video Color Space251: $value")
    }
}

// v251: Danmaku Bottom Max Count310
internal fun PlayerActivity.showV251DanmakuBottomMaxCount310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251danmakuBottomMaxCount310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251danmakuBottomMaxCount310 = value
        AppToast.show(this, "Danmaku Bottom Max Count310: $value")
    }
}

// v251: Subtitle Bg Border317
internal fun PlayerActivity.showV251SubtitleBgBorder317Toggle() {
    val current = BiliClient.prefs.v251subtitleBgBorder317
    BiliClient.prefs.v251subtitleBgBorder317 = !current
    AppToast.show(this, "Subtitle Bg Border317: ${if (!current) "ON" else "OFF"}")
}

// v252: Audio EQ Custom252
internal fun PlayerActivity.showV252AudioEQCustom252Toggle() {
    val current = BiliClient.prefs.v252audioEQCustom252
    BiliClient.prefs.v252audioEQCustom252 = !current
    AppToast.show(this, "Audio EQ Custom252: ${if (!current) "ON" else "OFF"}")
}

// v252: Danmaku Bottom Max Count311
internal fun PlayerActivity.showV252DanmakuBottomMaxCount311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252danmakuBottomMaxCount311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252danmakuBottomMaxCount311 = value
        AppToast.show(this, "Danmaku Bottom Max Count311: $value")
    }
}

// v252: Subtitle Bg Border318
internal fun PlayerActivity.showV252SubtitleBgBorder318Toggle() {
    val current = BiliClient.prefs.v252subtitleBgBorder318
    BiliClient.prefs.v252subtitleBgBorder318 = !current
    AppToast.show(this, "Subtitle Bg Border318: ${if (!current) "ON" else "OFF"}")
}

// v252: Gesture Shake Action252
internal fun PlayerActivity.showV252GestureShakeAction252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252gestureShakeAction252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252gestureShakeAction252 = value
        AppToast.show(this, "Gesture Shake Action252: $value")
    }
}

// v252: Cast Audio Volume252
internal fun PlayerActivity.showV252CastAudioVolume252Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v252castAudioVolume252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252castAudioVolume252 = value
        AppToast.show(this, "Cast Audio Volume252: $value")
    }
}

// v252: Playlist Auto Skip Outro252
internal fun PlayerActivity.showV252PlaylistAutoSkipOutro252Toggle() {
    val current = BiliClient.prefs.v252playlistAutoSkipOutro252
    BiliClient.prefs.v252playlistAutoSkipOutro252 = !current
    AppToast.show(this, "Playlist Auto Skip Outro252: ${if (!current) "ON" else "OFF"}")
}

// v252: Cache Download Speed253
internal fun PlayerActivity.showV252CacheDownloadSpeed253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252cacheDownloadSpeed253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252cacheDownloadSpeed253 = value
        AppToast.show(this, "Cache Download Speed253: $value")
    }
}

// v252: Progress Bar Thumb Border252
internal fun PlayerActivity.showV252ProgressBarThumbBorder252Toggle() {
    val current = BiliClient.prefs.v252progressBarThumbBorder252
    BiliClient.prefs.v252progressBarThumbBorder252 = !current
    AppToast.show(this, "Progress Bar Thumb Border252: ${if (!current) "ON" else "OFF"}")
}

// v252: Volume Boost Peak252
internal fun PlayerActivity.showV252VolumeBoostPeak252Toggle() {
    val current = BiliClient.prefs.v252volumeBoostPeak252
    BiliClient.prefs.v252volumeBoostPeak252 = !current
    AppToast.show(this, "Volume Boost Peak252: ${if (!current) "ON" else "OFF"}")
}

// v252: History Bookmark Export252
internal fun PlayerActivity.showV252HistoryBookmarkExport252Toggle() {
    val current = BiliClient.prefs.v252historyBookmarkExport252
    BiliClient.prefs.v252historyBookmarkExport252 = !current
    AppToast.show(this, "History Bookmark Export252: ${if (!current) "ON" else "OFF"}")
}

// v252: Playback Chapter Sync252
internal fun PlayerActivity.showV252PlaybackChapterSync252Toggle() {
    val current = BiliClient.prefs.v252playbackChapterSync252
    BiliClient.prefs.v252playbackChapterSync252 = !current
    AppToast.show(this, "Playback Chapter Sync252: ${if (!current) "ON" else "OFF"}")
}

// v252: Screenshot Save Path252
internal fun PlayerActivity.showV252ScreenshotSavePath252Toggle() {
    val current = BiliClient.prefs.v252screenshotSavePath252
    BiliClient.prefs.v252screenshotSavePath252 = !current
    AppToast.show(this, "Screenshot Save Path252: ${if (!current) "ON" else "OFF"}")
}

// v252: Video Color Space252
internal fun PlayerActivity.showV252VideoColorSpace252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252videoColorSpace252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252videoColorSpace252 = value
        AppToast.show(this, "Video Color Space252: $value")
    }
}

// v252: Danmaku Bottom Max Count312
internal fun PlayerActivity.showV252DanmakuBottomMaxCount312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252danmakuBottomMaxCount312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252danmakuBottomMaxCount312 = value
        AppToast.show(this, "Danmaku Bottom Max Count312: $value")
    }
}

// v252: Subtitle Bg Border319
internal fun PlayerActivity.showV252SubtitleBgBorder319Toggle() {
    val current = BiliClient.prefs.v252subtitleBgBorder319
    BiliClient.prefs.v252subtitleBgBorder319 = !current
    AppToast.show(this, "Subtitle Bg Border319: ${if (!current) "ON" else "OFF"}")
}

// v253: Audio EQ Custom253
internal fun PlayerActivity.showV253AudioEQCustom253Toggle() {
    val current = BiliClient.prefs.v253audioEQCustom253
    BiliClient.prefs.v253audioEQCustom253 = !current
    AppToast.show(this, "Audio EQ Custom253: ${if (!current) "ON" else "OFF"}")
}

// v253: Danmaku Bottom Max Count313
internal fun PlayerActivity.showV253DanmakuBottomMaxCount313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253danmakuBottomMaxCount313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253danmakuBottomMaxCount313 = value
        AppToast.show(this, "Danmaku Bottom Max Count313: $value")
    }
}

// v253: Subtitle Bg Border320
internal fun PlayerActivity.showV253SubtitleBgBorder320Toggle() {
    val current = BiliClient.prefs.v253subtitleBgBorder320
    BiliClient.prefs.v253subtitleBgBorder320 = !current
    AppToast.show(this, "Subtitle Bg Border320: ${if (!current) "ON" else "OFF"}")
}

// v253: Gesture Shake Action253
internal fun PlayerActivity.showV253GestureShakeAction253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253gestureShakeAction253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253gestureShakeAction253 = value
        AppToast.show(this, "Gesture Shake Action253: $value")
    }
}

// v253: Cast Audio Volume253
internal fun PlayerActivity.showV253CastAudioVolume253Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v253castAudioVolume253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253castAudioVolume253 = value
        AppToast.show(this, "Cast Audio Volume253: $value")
    }
}

// v253: Playlist Auto Skip Outro253
internal fun PlayerActivity.showV253PlaylistAutoSkipOutro253Toggle() {
    val current = BiliClient.prefs.v253playlistAutoSkipOutro253
    BiliClient.prefs.v253playlistAutoSkipOutro253 = !current
    AppToast.show(this, "Playlist Auto Skip Outro253: ${if (!current) "ON" else "OFF"}")
}

// v253: Cache Download Speed254
internal fun PlayerActivity.showV253CacheDownloadSpeed254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253cacheDownloadSpeed254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253cacheDownloadSpeed254 = value
        AppToast.show(this, "Cache Download Speed254: $value")
    }
}

// v253: Progress Bar Thumb Border253
internal fun PlayerActivity.showV253ProgressBarThumbBorder253Toggle() {
    val current = BiliClient.prefs.v253progressBarThumbBorder253
    BiliClient.prefs.v253progressBarThumbBorder253 = !current
    AppToast.show(this, "Progress Bar Thumb Border253: ${if (!current) "ON" else "OFF"}")
}

// v253: Volume Boost Peak253
internal fun PlayerActivity.showV253VolumeBoostPeak253Toggle() {
    val current = BiliClient.prefs.v253volumeBoostPeak253
    BiliClient.prefs.v253volumeBoostPeak253 = !current
    AppToast.show(this, "Volume Boost Peak253: ${if (!current) "ON" else "OFF"}")
}

// v253: History Bookmark Export253
internal fun PlayerActivity.showV253HistoryBookmarkExport253Toggle() {
    val current = BiliClient.prefs.v253historyBookmarkExport253
    BiliClient.prefs.v253historyBookmarkExport253 = !current
    AppToast.show(this, "History Bookmark Export253: ${if (!current) "ON" else "OFF"}")
}

// v253: Playback Chapter Sync253
internal fun PlayerActivity.showV253PlaybackChapterSync253Toggle() {
    val current = BiliClient.prefs.v253playbackChapterSync253
    BiliClient.prefs.v253playbackChapterSync253 = !current
    AppToast.show(this, "Playback Chapter Sync253: ${if (!current) "ON" else "OFF"}")
}

// v253: Screenshot Save Path253
internal fun PlayerActivity.showV253ScreenshotSavePath253Toggle() {
    val current = BiliClient.prefs.v253screenshotSavePath253
    BiliClient.prefs.v253screenshotSavePath253 = !current
    AppToast.show(this, "Screenshot Save Path253: ${if (!current) "ON" else "OFF"}")
}

// v253: Video Color Space253
internal fun PlayerActivity.showV253VideoColorSpace253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253videoColorSpace253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253videoColorSpace253 = value
        AppToast.show(this, "Video Color Space253: $value")
    }
}

// v253: Danmaku Bottom Max Count314
internal fun PlayerActivity.showV253DanmakuBottomMaxCount314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253danmakuBottomMaxCount314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253danmakuBottomMaxCount314 = value
        AppToast.show(this, "Danmaku Bottom Max Count314: $value")
    }
}

// v253: Subtitle Bg Border321
internal fun PlayerActivity.showV253SubtitleBgBorder321Toggle() {
    val current = BiliClient.prefs.v253subtitleBgBorder321
    BiliClient.prefs.v253subtitleBgBorder321 = !current
    AppToast.show(this, "Subtitle Bg Border321: ${if (!current) "ON" else "OFF"}")
}

// v254: Audio EQ Custom254
internal fun PlayerActivity.showV254AudioEQCustom254Toggle() {
    val current = BiliClient.prefs.v254audioEQCustom254
    BiliClient.prefs.v254audioEQCustom254 = !current
    AppToast.show(this, "Audio EQ Custom254: ${if (!current) "ON" else "OFF"}")
}

// v254: Danmaku Bottom Max Count315
internal fun PlayerActivity.showV254DanmakuBottomMaxCount315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254danmakuBottomMaxCount315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254danmakuBottomMaxCount315 = value
        AppToast.show(this, "Danmaku Bottom Max Count315: $value")
    }
}

// v254: Subtitle Bg Border322
internal fun PlayerActivity.showV254SubtitleBgBorder322Toggle() {
    val current = BiliClient.prefs.v254subtitleBgBorder322
    BiliClient.prefs.v254subtitleBgBorder322 = !current
    AppToast.show(this, "Subtitle Bg Border322: ${if (!current) "ON" else "OFF"}")
}

// v254: Gesture Shake Action254
internal fun PlayerActivity.showV254GestureShakeAction254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254gestureShakeAction254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254gestureShakeAction254 = value
        AppToast.show(this, "Gesture Shake Action254: $value")
    }
}

// v254: Cast Audio Volume254
internal fun PlayerActivity.showV254CastAudioVolume254Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v254castAudioVolume254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254castAudioVolume254 = value
        AppToast.show(this, "Cast Audio Volume254: $value")
    }
}

// v254: Playlist Auto Skip Outro254
internal fun PlayerActivity.showV254PlaylistAutoSkipOutro254Toggle() {
    val current = BiliClient.prefs.v254playlistAutoSkipOutro254
    BiliClient.prefs.v254playlistAutoSkipOutro254 = !current
    AppToast.show(this, "Playlist Auto Skip Outro254: ${if (!current) "ON" else "OFF"}")
}

// v254: Cache Download Speed255
internal fun PlayerActivity.showV254CacheDownloadSpeed255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254cacheDownloadSpeed255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254cacheDownloadSpeed255 = value
        AppToast.show(this, "Cache Download Speed255: $value")
    }
}

// v254: Progress Bar Thumb Border254
internal fun PlayerActivity.showV254ProgressBarThumbBorder254Toggle() {
    val current = BiliClient.prefs.v254progressBarThumbBorder254
    BiliClient.prefs.v254progressBarThumbBorder254 = !current
    AppToast.show(this, "Progress Bar Thumb Border254: ${if (!current) "ON" else "OFF"}")
}

// v254: Volume Boost Peak254
internal fun PlayerActivity.showV254VolumeBoostPeak254Toggle() {
    val current = BiliClient.prefs.v254volumeBoostPeak254
    BiliClient.prefs.v254volumeBoostPeak254 = !current
    AppToast.show(this, "Volume Boost Peak254: ${if (!current) "ON" else "OFF"}")
}

// v254: History Bookmark Export254
internal fun PlayerActivity.showV254HistoryBookmarkExport254Toggle() {
    val current = BiliClient.prefs.v254historyBookmarkExport254
    BiliClient.prefs.v254historyBookmarkExport254 = !current
    AppToast.show(this, "History Bookmark Export254: ${if (!current) "ON" else "OFF"}")
}

// v254: Playback Chapter Sync254
internal fun PlayerActivity.showV254PlaybackChapterSync254Toggle() {
    val current = BiliClient.prefs.v254playbackChapterSync254
    BiliClient.prefs.v254playbackChapterSync254 = !current
    AppToast.show(this, "Playback Chapter Sync254: ${if (!current) "ON" else "OFF"}")
}

// v254: Screenshot Save Path254
internal fun PlayerActivity.showV254ScreenshotSavePath254Toggle() {
    val current = BiliClient.prefs.v254screenshotSavePath254
    BiliClient.prefs.v254screenshotSavePath254 = !current
    AppToast.show(this, "Screenshot Save Path254: ${if (!current) "ON" else "OFF"}")
}

// v254: Video Color Space254
internal fun PlayerActivity.showV254VideoColorSpace254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254videoColorSpace254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254videoColorSpace254 = value
        AppToast.show(this, "Video Color Space254: $value")
    }
}

// v254: Danmaku Bottom Max Count316
internal fun PlayerActivity.showV254DanmakuBottomMaxCount316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254danmakuBottomMaxCount316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254danmakuBottomMaxCount316 = value
        AppToast.show(this, "Danmaku Bottom Max Count316: $value")
    }
}

// v254: Subtitle Bg Border323
internal fun PlayerActivity.showV254SubtitleBgBorder323Toggle() {
    val current = BiliClient.prefs.v254subtitleBgBorder323
    BiliClient.prefs.v254subtitleBgBorder323 = !current
    AppToast.show(this, "Subtitle Bg Border323: ${if (!current) "ON" else "OFF"}")
}

// v255: Audio EQ Custom255
internal fun PlayerActivity.showV255AudioEQCustom255Toggle() {
    val current = BiliClient.prefs.v255audioEQCustom255
    BiliClient.prefs.v255audioEQCustom255 = !current
    AppToast.show(this, "Audio EQ Custom255: ${if (!current) "ON" else "OFF"}")
}

// v255: Danmaku Bottom Max Count317
internal fun PlayerActivity.showV255DanmakuBottomMaxCount317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255danmakuBottomMaxCount317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255danmakuBottomMaxCount317 = value
        AppToast.show(this, "Danmaku Bottom Max Count317: $value")
    }
}

// v255: Subtitle Bg Border324
internal fun PlayerActivity.showV255SubtitleBgBorder324Toggle() {
    val current = BiliClient.prefs.v255subtitleBgBorder324
    BiliClient.prefs.v255subtitleBgBorder324 = !current
    AppToast.show(this, "Subtitle Bg Border324: ${if (!current) "ON" else "OFF"}")
}

// v255: Gesture Shake Action255
internal fun PlayerActivity.showV255GestureShakeAction255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255gestureShakeAction255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255gestureShakeAction255 = value
        AppToast.show(this, "Gesture Shake Action255: $value")
    }
}

// v255: Cast Audio Volume255
internal fun PlayerActivity.showV255CastAudioVolume255Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v255castAudioVolume255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255castAudioVolume255 = value
        AppToast.show(this, "Cast Audio Volume255: $value")
    }
}

// v255: Playlist Auto Skip Outro255
internal fun PlayerActivity.showV255PlaylistAutoSkipOutro255Toggle() {
    val current = BiliClient.prefs.v255playlistAutoSkipOutro255
    BiliClient.prefs.v255playlistAutoSkipOutro255 = !current
    AppToast.show(this, "Playlist Auto Skip Outro255: ${if (!current) "ON" else "OFF"}")
}

// v255: Cache Download Speed256
internal fun PlayerActivity.showV255CacheDownloadSpeed256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255cacheDownloadSpeed256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255cacheDownloadSpeed256 = value
        AppToast.show(this, "Cache Download Speed256: $value")
    }
}

// v255: Progress Bar Thumb Border255
internal fun PlayerActivity.showV255ProgressBarThumbBorder255Toggle() {
    val current = BiliClient.prefs.v255progressBarThumbBorder255
    BiliClient.prefs.v255progressBarThumbBorder255 = !current
    AppToast.show(this, "Progress Bar Thumb Border255: ${if (!current) "ON" else "OFF"}")
}

// v255: Volume Boost Peak255
internal fun PlayerActivity.showV255VolumeBoostPeak255Toggle() {
    val current = BiliClient.prefs.v255volumeBoostPeak255
    BiliClient.prefs.v255volumeBoostPeak255 = !current
    AppToast.show(this, "Volume Boost Peak255: ${if (!current) "ON" else "OFF"}")
}

// v255: History Bookmark Export255
internal fun PlayerActivity.showV255HistoryBookmarkExport255Toggle() {
    val current = BiliClient.prefs.v255historyBookmarkExport255
    BiliClient.prefs.v255historyBookmarkExport255 = !current
    AppToast.show(this, "History Bookmark Export255: ${if (!current) "ON" else "OFF"}")
}

// v255: Playback Chapter Sync255
internal fun PlayerActivity.showV255PlaybackChapterSync255Toggle() {
    val current = BiliClient.prefs.v255playbackChapterSync255
    BiliClient.prefs.v255playbackChapterSync255 = !current
    AppToast.show(this, "Playback Chapter Sync255: ${if (!current) "ON" else "OFF"}")
}

// v255: Screenshot Save Path255
internal fun PlayerActivity.showV255ScreenshotSavePath255Toggle() {
    val current = BiliClient.prefs.v255screenshotSavePath255
    BiliClient.prefs.v255screenshotSavePath255 = !current
    AppToast.show(this, "Screenshot Save Path255: ${if (!current) "ON" else "OFF"}")
}

// v255: Video Color Space255
internal fun PlayerActivity.showV255VideoColorSpace255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255videoColorSpace255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255videoColorSpace255 = value
        AppToast.show(this, "Video Color Space255: $value")
    }
}

// v255: Danmaku Bottom Max Count318
internal fun PlayerActivity.showV255DanmakuBottomMaxCount318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255danmakuBottomMaxCount318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255danmakuBottomMaxCount318 = value
        AppToast.show(this, "Danmaku Bottom Max Count318: $value")
    }
}

// v255: Subtitle Bg Border325
internal fun PlayerActivity.showV255SubtitleBgBorder325Toggle() {
    val current = BiliClient.prefs.v255subtitleBgBorder325
    BiliClient.prefs.v255subtitleBgBorder325 = !current
    AppToast.show(this, "Subtitle Bg Border325: ${if (!current) "ON" else "OFF"}")
}

// v256: Audio EQ Custom256
internal fun PlayerActivity.showV256AudioEQCustom256Toggle() {
    val current = BiliClient.prefs.v256audioEQCustom256
    BiliClient.prefs.v256audioEQCustom256 = !current
    AppToast.show(this, "Audio EQ Custom256: ${if (!current) "ON" else "OFF"}")
}

// v256: Danmaku Bottom Max Count319
internal fun PlayerActivity.showV256DanmakuBottomMaxCount319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256danmakuBottomMaxCount319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256danmakuBottomMaxCount319 = value
        AppToast.show(this, "Danmaku Bottom Max Count319: $value")
    }
}

// v256: Subtitle Bg Border326
internal fun PlayerActivity.showV256SubtitleBgBorder326Toggle() {
    val current = BiliClient.prefs.v256subtitleBgBorder326
    BiliClient.prefs.v256subtitleBgBorder326 = !current
    AppToast.show(this, "Subtitle Bg Border326: ${if (!current) "ON" else "OFF"}")
}

// v256: Gesture Shake Action256
internal fun PlayerActivity.showV256GestureShakeAction256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256gestureShakeAction256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256gestureShakeAction256 = value
        AppToast.show(this, "Gesture Shake Action256: $value")
    }
}

// v256: Cast Audio Volume256
internal fun PlayerActivity.showV256CastAudioVolume256Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v256castAudioVolume256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256castAudioVolume256 = value
        AppToast.show(this, "Cast Audio Volume256: $value")
    }
}

// v256: Playlist Auto Skip Outro256
internal fun PlayerActivity.showV256PlaylistAutoSkipOutro256Toggle() {
    val current = BiliClient.prefs.v256playlistAutoSkipOutro256
    BiliClient.prefs.v256playlistAutoSkipOutro256 = !current
    AppToast.show(this, "Playlist Auto Skip Outro256: ${if (!current) "ON" else "OFF"}")
}

// v256: Cache Download Speed257
internal fun PlayerActivity.showV256CacheDownloadSpeed257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256cacheDownloadSpeed257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256cacheDownloadSpeed257 = value
        AppToast.show(this, "Cache Download Speed257: $value")
    }
}

// v256: Progress Bar Thumb Border256
internal fun PlayerActivity.showV256ProgressBarThumbBorder256Toggle() {
    val current = BiliClient.prefs.v256progressBarThumbBorder256
    BiliClient.prefs.v256progressBarThumbBorder256 = !current
    AppToast.show(this, "Progress Bar Thumb Border256: ${if (!current) "ON" else "OFF"}")
}

// v256: Volume Boost Peak256
internal fun PlayerActivity.showV256VolumeBoostPeak256Toggle() {
    val current = BiliClient.prefs.v256volumeBoostPeak256
    BiliClient.prefs.v256volumeBoostPeak256 = !current
    AppToast.show(this, "Volume Boost Peak256: ${if (!current) "ON" else "OFF"}")
}

// v256: History Bookmark Export256
internal fun PlayerActivity.showV256HistoryBookmarkExport256Toggle() {
    val current = BiliClient.prefs.v256historyBookmarkExport256
    BiliClient.prefs.v256historyBookmarkExport256 = !current
    AppToast.show(this, "History Bookmark Export256: ${if (!current) "ON" else "OFF"}")
}

// v256: Playback Chapter Sync256
internal fun PlayerActivity.showV256PlaybackChapterSync256Toggle() {
    val current = BiliClient.prefs.v256playbackChapterSync256
    BiliClient.prefs.v256playbackChapterSync256 = !current
    AppToast.show(this, "Playback Chapter Sync256: ${if (!current) "ON" else "OFF"}")
}

// v256: Screenshot Save Path256
internal fun PlayerActivity.showV256ScreenshotSavePath256Toggle() {
    val current = BiliClient.prefs.v256screenshotSavePath256
    BiliClient.prefs.v256screenshotSavePath256 = !current
    AppToast.show(this, "Screenshot Save Path256: ${if (!current) "ON" else "OFF"}")
}

// v256: Video Color Space256
internal fun PlayerActivity.showV256VideoColorSpace256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256videoColorSpace256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256videoColorSpace256 = value
        AppToast.show(this, "Video Color Space256: $value")
    }
}

// v256: Danmaku Bottom Max Count320
internal fun PlayerActivity.showV256DanmakuBottomMaxCount320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256danmakuBottomMaxCount320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256danmakuBottomMaxCount320 = value
        AppToast.show(this, "Danmaku Bottom Max Count320: $value")
    }
}

// v256: Subtitle Bg Border327
internal fun PlayerActivity.showV256SubtitleBgBorder327Toggle() {
    val current = BiliClient.prefs.v256subtitleBgBorder327
    BiliClient.prefs.v256subtitleBgBorder327 = !current
    AppToast.show(this, "Subtitle Bg Border327: ${if (!current) "ON" else "OFF"}")
}

// v257: Audio EQ Custom257
internal fun PlayerActivity.showV257AudioEQCustom257Toggle() {
    val current = BiliClient.prefs.v257audioEQCustom257
    BiliClient.prefs.v257audioEQCustom257 = !current
    AppToast.show(this, "Audio EQ Custom257: ${if (!current) "ON" else "OFF"}")
}

// v257: Danmaku Bottom Max Count321
internal fun PlayerActivity.showV257DanmakuBottomMaxCount321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257danmakuBottomMaxCount321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257danmakuBottomMaxCount321 = value
        AppToast.show(this, "Danmaku Bottom Max Count321: $value")
    }
}

// v257: Subtitle Bg Border328
internal fun PlayerActivity.showV257SubtitleBgBorder328Toggle() {
    val current = BiliClient.prefs.v257subtitleBgBorder328
    BiliClient.prefs.v257subtitleBgBorder328 = !current
    AppToast.show(this, "Subtitle Bg Border328: ${if (!current) "ON" else "OFF"}")
}

// v257: Gesture Shake Action257
internal fun PlayerActivity.showV257GestureShakeAction257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257gestureShakeAction257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257gestureShakeAction257 = value
        AppToast.show(this, "Gesture Shake Action257: $value")
    }
}

// v257: Cast Audio Volume257
internal fun PlayerActivity.showV257CastAudioVolume257Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v257castAudioVolume257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257castAudioVolume257 = value
        AppToast.show(this, "Cast Audio Volume257: $value")
    }
}

// v257: Playlist Auto Skip Outro257
internal fun PlayerActivity.showV257PlaylistAutoSkipOutro257Toggle() {
    val current = BiliClient.prefs.v257playlistAutoSkipOutro257
    BiliClient.prefs.v257playlistAutoSkipOutro257 = !current
    AppToast.show(this, "Playlist Auto Skip Outro257: ${if (!current) "ON" else "OFF"}")
}

// v257: Cache Download Speed258
internal fun PlayerActivity.showV257CacheDownloadSpeed258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257cacheDownloadSpeed258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257cacheDownloadSpeed258 = value
        AppToast.show(this, "Cache Download Speed258: $value")
    }
}

// v257: Progress Bar Thumb Border257
internal fun PlayerActivity.showV257ProgressBarThumbBorder257Toggle() {
    val current = BiliClient.prefs.v257progressBarThumbBorder257
    BiliClient.prefs.v257progressBarThumbBorder257 = !current
    AppToast.show(this, "Progress Bar Thumb Border257: ${if (!current) "ON" else "OFF"}")
}

// v257: Volume Boost Peak257
internal fun PlayerActivity.showV257VolumeBoostPeak257Toggle() {
    val current = BiliClient.prefs.v257volumeBoostPeak257
    BiliClient.prefs.v257volumeBoostPeak257 = !current
    AppToast.show(this, "Volume Boost Peak257: ${if (!current) "ON" else "OFF"}")
}

// v257: History Bookmark Export257
internal fun PlayerActivity.showV257HistoryBookmarkExport257Toggle() {
    val current = BiliClient.prefs.v257historyBookmarkExport257
    BiliClient.prefs.v257historyBookmarkExport257 = !current
    AppToast.show(this, "History Bookmark Export257: ${if (!current) "ON" else "OFF"}")
}

// v257: Playback Chapter Sync257
internal fun PlayerActivity.showV257PlaybackChapterSync257Toggle() {
    val current = BiliClient.prefs.v257playbackChapterSync257
    BiliClient.prefs.v257playbackChapterSync257 = !current
    AppToast.show(this, "Playback Chapter Sync257: ${if (!current) "ON" else "OFF"}")
}

// v257: Screenshot Save Path257
internal fun PlayerActivity.showV257ScreenshotSavePath257Toggle() {
    val current = BiliClient.prefs.v257screenshotSavePath257
    BiliClient.prefs.v257screenshotSavePath257 = !current
    AppToast.show(this, "Screenshot Save Path257: ${if (!current) "ON" else "OFF"}")
}

// v257: Video Color Space257
internal fun PlayerActivity.showV257VideoColorSpace257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257videoColorSpace257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257videoColorSpace257 = value
        AppToast.show(this, "Video Color Space257: $value")
    }
}

// v257: Danmaku Bottom Max Count322
internal fun PlayerActivity.showV257DanmakuBottomMaxCount322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257danmakuBottomMaxCount322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257danmakuBottomMaxCount322 = value
        AppToast.show(this, "Danmaku Bottom Max Count322: $value")
    }
}

// v257: Subtitle Bg Border329
internal fun PlayerActivity.showV257SubtitleBgBorder329Toggle() {
    val current = BiliClient.prefs.v257subtitleBgBorder329
    BiliClient.prefs.v257subtitleBgBorder329 = !current
    AppToast.show(this, "Subtitle Bg Border329: ${if (!current) "ON" else "OFF"}")
}

// v258: Audio EQ Custom258
internal fun PlayerActivity.showV258AudioEQCustom258Toggle() {
    val current = BiliClient.prefs.v258audioEQCustom258
    BiliClient.prefs.v258audioEQCustom258 = !current
    AppToast.show(this, "Audio EQ Custom258: ${if (!current) "ON" else "OFF"}")
}

// v258: Danmaku Bottom Max Count323
internal fun PlayerActivity.showV258DanmakuBottomMaxCount323Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258danmakuBottomMaxCount323).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count323",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258danmakuBottomMaxCount323 = value
        AppToast.show(this, "Danmaku Bottom Max Count323: $value")
    }
}

// v258: Subtitle Bg Border330
internal fun PlayerActivity.showV258SubtitleBgBorder330Toggle() {
    val current = BiliClient.prefs.v258subtitleBgBorder330
    BiliClient.prefs.v258subtitleBgBorder330 = !current
    AppToast.show(this, "Subtitle Bg Border330: ${if (!current) "ON" else "OFF"}")
}

// v258: Gesture Shake Action258
internal fun PlayerActivity.showV258GestureShakeAction258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258gestureShakeAction258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258gestureShakeAction258 = value
        AppToast.show(this, "Gesture Shake Action258: $value")
    }
}

// v258: Cast Audio Volume258
internal fun PlayerActivity.showV258CastAudioVolume258Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v258castAudioVolume258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258castAudioVolume258 = value
        AppToast.show(this, "Cast Audio Volume258: $value")
    }
}

// v258: Playlist Auto Skip Outro258
internal fun PlayerActivity.showV258PlaylistAutoSkipOutro258Toggle() {
    val current = BiliClient.prefs.v258playlistAutoSkipOutro258
    BiliClient.prefs.v258playlistAutoSkipOutro258 = !current
    AppToast.show(this, "Playlist Auto Skip Outro258: ${if (!current) "ON" else "OFF"}")
}

// v258: Cache Download Speed259
internal fun PlayerActivity.showV258CacheDownloadSpeed259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258cacheDownloadSpeed259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258cacheDownloadSpeed259 = value
        AppToast.show(this, "Cache Download Speed259: $value")
    }
}

// v258: Progress Bar Thumb Border258
internal fun PlayerActivity.showV258ProgressBarThumbBorder258Toggle() {
    val current = BiliClient.prefs.v258progressBarThumbBorder258
    BiliClient.prefs.v258progressBarThumbBorder258 = !current
    AppToast.show(this, "Progress Bar Thumb Border258: ${if (!current) "ON" else "OFF"}")
}

// v258: Volume Boost Peak258
internal fun PlayerActivity.showV258VolumeBoostPeak258Toggle() {
    val current = BiliClient.prefs.v258volumeBoostPeak258
    BiliClient.prefs.v258volumeBoostPeak258 = !current
    AppToast.show(this, "Volume Boost Peak258: ${if (!current) "ON" else "OFF"}")
}

// v258: History Bookmark Export258
internal fun PlayerActivity.showV258HistoryBookmarkExport258Toggle() {
    val current = BiliClient.prefs.v258historyBookmarkExport258
    BiliClient.prefs.v258historyBookmarkExport258 = !current
    AppToast.show(this, "History Bookmark Export258: ${if (!current) "ON" else "OFF"}")
}

// v258: Playback Chapter Sync258
internal fun PlayerActivity.showV258PlaybackChapterSync258Toggle() {
    val current = BiliClient.prefs.v258playbackChapterSync258
    BiliClient.prefs.v258playbackChapterSync258 = !current
    AppToast.show(this, "Playback Chapter Sync258: ${if (!current) "ON" else "OFF"}")
}

// v258: Screenshot Save Path258
internal fun PlayerActivity.showV258ScreenshotSavePath258Toggle() {
    val current = BiliClient.prefs.v258screenshotSavePath258
    BiliClient.prefs.v258screenshotSavePath258 = !current
    AppToast.show(this, "Screenshot Save Path258: ${if (!current) "ON" else "OFF"}")
}

// v258: Video Color Space258
internal fun PlayerActivity.showV258VideoColorSpace258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258videoColorSpace258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258videoColorSpace258 = value
        AppToast.show(this, "Video Color Space258: $value")
    }
}

// v258: Danmaku Bottom Max Count324
internal fun PlayerActivity.showV258DanmakuBottomMaxCount324Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258danmakuBottomMaxCount324).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count324",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258danmakuBottomMaxCount324 = value
        AppToast.show(this, "Danmaku Bottom Max Count324: $value")
    }
}

// v258: Subtitle Bg Border331
internal fun PlayerActivity.showV258SubtitleBgBorder331Toggle() {
    val current = BiliClient.prefs.v258subtitleBgBorder331
    BiliClient.prefs.v258subtitleBgBorder331 = !current
    AppToast.show(this, "Subtitle Bg Border331: ${if (!current) "ON" else "OFF"}")
}

// v259: Audio EQ Custom259
internal fun PlayerActivity.showV259AudioEQCustom259Toggle() {
    val current = BiliClient.prefs.v259audioEQCustom259
    BiliClient.prefs.v259audioEQCustom259 = !current
    AppToast.show(this, "Audio EQ Custom259: ${if (!current) "ON" else "OFF"}")
}

// v259: Danmaku Bottom Max Count325
internal fun PlayerActivity.showV259DanmakuBottomMaxCount325Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259danmakuBottomMaxCount325).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count325",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259danmakuBottomMaxCount325 = value
        AppToast.show(this, "Danmaku Bottom Max Count325: $value")
    }
}

// v259: Subtitle Bg Border332
internal fun PlayerActivity.showV259SubtitleBgBorder332Toggle() {
    val current = BiliClient.prefs.v259subtitleBgBorder332
    BiliClient.prefs.v259subtitleBgBorder332 = !current
    AppToast.show(this, "Subtitle Bg Border332: ${if (!current) "ON" else "OFF"}")
}

// v259: Gesture Shake Action259
internal fun PlayerActivity.showV259GestureShakeAction259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259gestureShakeAction259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259gestureShakeAction259 = value
        AppToast.show(this, "Gesture Shake Action259: $value")
    }
}

// v259: Cast Audio Volume259
internal fun PlayerActivity.showV259CastAudioVolume259Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v259castAudioVolume259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259castAudioVolume259 = value
        AppToast.show(this, "Cast Audio Volume259: $value")
    }
}

// v259: Playlist Auto Skip Outro259
internal fun PlayerActivity.showV259PlaylistAutoSkipOutro259Toggle() {
    val current = BiliClient.prefs.v259playlistAutoSkipOutro259
    BiliClient.prefs.v259playlistAutoSkipOutro259 = !current
    AppToast.show(this, "Playlist Auto Skip Outro259: ${if (!current) "ON" else "OFF"}")
}

// v259: Cache Download Speed260
internal fun PlayerActivity.showV259CacheDownloadSpeed260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259cacheDownloadSpeed260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259cacheDownloadSpeed260 = value
        AppToast.show(this, "Cache Download Speed260: $value")
    }
}

// v259: Progress Bar Thumb Border259
internal fun PlayerActivity.showV259ProgressBarThumbBorder259Toggle() {
    val current = BiliClient.prefs.v259progressBarThumbBorder259
    BiliClient.prefs.v259progressBarThumbBorder259 = !current
    AppToast.show(this, "Progress Bar Thumb Border259: ${if (!current) "ON" else "OFF"}")
}

// v259: Volume Boost Peak259
internal fun PlayerActivity.showV259VolumeBoostPeak259Toggle() {
    val current = BiliClient.prefs.v259volumeBoostPeak259
    BiliClient.prefs.v259volumeBoostPeak259 = !current
    AppToast.show(this, "Volume Boost Peak259: ${if (!current) "ON" else "OFF"}")
}

// v259: History Bookmark Export259
internal fun PlayerActivity.showV259HistoryBookmarkExport259Toggle() {
    val current = BiliClient.prefs.v259historyBookmarkExport259
    BiliClient.prefs.v259historyBookmarkExport259 = !current
    AppToast.show(this, "History Bookmark Export259: ${if (!current) "ON" else "OFF"}")
}

// v259: Playback Chapter Sync259
internal fun PlayerActivity.showV259PlaybackChapterSync259Toggle() {
    val current = BiliClient.prefs.v259playbackChapterSync259
    BiliClient.prefs.v259playbackChapterSync259 = !current
    AppToast.show(this, "Playback Chapter Sync259: ${if (!current) "ON" else "OFF"}")
}

// v259: Screenshot Save Path259
internal fun PlayerActivity.showV259ScreenshotSavePath259Toggle() {
    val current = BiliClient.prefs.v259screenshotSavePath259
    BiliClient.prefs.v259screenshotSavePath259 = !current
    AppToast.show(this, "Screenshot Save Path259: ${if (!current) "ON" else "OFF"}")
}

// v259: Video Color Space259
internal fun PlayerActivity.showV259VideoColorSpace259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259videoColorSpace259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259videoColorSpace259 = value
        AppToast.show(this, "Video Color Space259: $value")
    }
}

// v259: Danmaku Bottom Max Count326
internal fun PlayerActivity.showV259DanmakuBottomMaxCount326Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259danmakuBottomMaxCount326).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count326",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259danmakuBottomMaxCount326 = value
        AppToast.show(this, "Danmaku Bottom Max Count326: $value")
    }
}

// v259: Subtitle Bg Border333
internal fun PlayerActivity.showV259SubtitleBgBorder333Toggle() {
    val current = BiliClient.prefs.v259subtitleBgBorder333
    BiliClient.prefs.v259subtitleBgBorder333 = !current
    AppToast.show(this, "Subtitle Bg Border333: ${if (!current) "ON" else "OFF"}")
}

// v260: Audio EQ Custom260
internal fun PlayerActivity.showV260AudioEQCustom260Toggle() {
    val current = BiliClient.prefs.v260audioEQCustom260
    BiliClient.prefs.v260audioEQCustom260 = !current
    AppToast.show(this, "Audio EQ Custom260: ${if (!current) "ON" else "OFF"}")
}

// v260: Danmaku Bottom Max Count327
internal fun PlayerActivity.showV260DanmakuBottomMaxCount327Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260danmakuBottomMaxCount327).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count327",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260danmakuBottomMaxCount327 = value
        AppToast.show(this, "Danmaku Bottom Max Count327: $value")
    }
}

// v260: Subtitle Bg Border334
internal fun PlayerActivity.showV260SubtitleBgBorder334Toggle() {
    val current = BiliClient.prefs.v260subtitleBgBorder334
    BiliClient.prefs.v260subtitleBgBorder334 = !current
    AppToast.show(this, "Subtitle Bg Border334: ${if (!current) "ON" else "OFF"}")
}

// v260: Gesture Shake Action260
internal fun PlayerActivity.showV260GestureShakeAction260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260gestureShakeAction260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260gestureShakeAction260 = value
        AppToast.show(this, "Gesture Shake Action260: $value")
    }
}

// v260: Cast Audio Volume260
internal fun PlayerActivity.showV260CastAudioVolume260Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v260castAudioVolume260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260castAudioVolume260 = value
        AppToast.show(this, "Cast Audio Volume260: $value")
    }
}

// v260: Playlist Auto Skip Outro260
internal fun PlayerActivity.showV260PlaylistAutoSkipOutro260Toggle() {
    val current = BiliClient.prefs.v260playlistAutoSkipOutro260
    BiliClient.prefs.v260playlistAutoSkipOutro260 = !current
    AppToast.show(this, "Playlist Auto Skip Outro260: ${if (!current) "ON" else "OFF"}")
}

// v260: Cache Download Speed261
internal fun PlayerActivity.showV260CacheDownloadSpeed261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260cacheDownloadSpeed261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260cacheDownloadSpeed261 = value
        AppToast.show(this, "Cache Download Speed261: $value")
    }
}

// v260: Progress Bar Thumb Border260
internal fun PlayerActivity.showV260ProgressBarThumbBorder260Toggle() {
    val current = BiliClient.prefs.v260progressBarThumbBorder260
    BiliClient.prefs.v260progressBarThumbBorder260 = !current
    AppToast.show(this, "Progress Bar Thumb Border260: ${if (!current) "ON" else "OFF"}")
}

// v260: Volume Boost Peak260
internal fun PlayerActivity.showV260VolumeBoostPeak260Toggle() {
    val current = BiliClient.prefs.v260volumeBoostPeak260
    BiliClient.prefs.v260volumeBoostPeak260 = !current
    AppToast.show(this, "Volume Boost Peak260: ${if (!current) "ON" else "OFF"}")
}

// v260: History Bookmark Export260
internal fun PlayerActivity.showV260HistoryBookmarkExport260Toggle() {
    val current = BiliClient.prefs.v260historyBookmarkExport260
    BiliClient.prefs.v260historyBookmarkExport260 = !current
    AppToast.show(this, "History Bookmark Export260: ${if (!current) "ON" else "OFF"}")
}

// v260: Playback Chapter Sync260
internal fun PlayerActivity.showV260PlaybackChapterSync260Toggle() {
    val current = BiliClient.prefs.v260playbackChapterSync260
    BiliClient.prefs.v260playbackChapterSync260 = !current
    AppToast.show(this, "Playback Chapter Sync260: ${if (!current) "ON" else "OFF"}")
}

// v260: Screenshot Save Path260
internal fun PlayerActivity.showV260ScreenshotSavePath260Toggle() {
    val current = BiliClient.prefs.v260screenshotSavePath260
    BiliClient.prefs.v260screenshotSavePath260 = !current
    AppToast.show(this, "Screenshot Save Path260: ${if (!current) "ON" else "OFF"}")
}

// v260: Video Color Space260
internal fun PlayerActivity.showV260VideoColorSpace260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260videoColorSpace260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260videoColorSpace260 = value
        AppToast.show(this, "Video Color Space260: $value")
    }
}

// v260: Danmaku Bottom Max Count328
internal fun PlayerActivity.showV260DanmakuBottomMaxCount328Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260danmakuBottomMaxCount328).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count328",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260danmakuBottomMaxCount328 = value
        AppToast.show(this, "Danmaku Bottom Max Count328: $value")
    }
}

// v260: Subtitle Bg Border335
internal fun PlayerActivity.showV260SubtitleBgBorder335Toggle() {
    val current = BiliClient.prefs.v260subtitleBgBorder335
    BiliClient.prefs.v260subtitleBgBorder335 = !current
    AppToast.show(this, "Subtitle Bg Border335: ${if (!current) "ON" else "OFF"}")
}

// v261: Audio EQ Custom261
internal fun PlayerActivity.showV261AudioEQCustom261Toggle() {
    val current = BiliClient.prefs.v261audioEQCustom261
    BiliClient.prefs.v261audioEQCustom261 = !current
    AppToast.show(this, "Audio EQ Custom261: ${if (!current) "ON" else "OFF"}")
}

// v261: Danmaku Bottom Max Count329
internal fun PlayerActivity.showV261DanmakuBottomMaxCount329Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261danmakuBottomMaxCount329).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count329",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261danmakuBottomMaxCount329 = value
        AppToast.show(this, "Danmaku Bottom Max Count329: $value")
    }
}

// v261: Subtitle Bg Border336
internal fun PlayerActivity.showV261SubtitleBgBorder336Toggle() {
    val current = BiliClient.prefs.v261subtitleBgBorder336
    BiliClient.prefs.v261subtitleBgBorder336 = !current
    AppToast.show(this, "Subtitle Bg Border336: ${if (!current) "ON" else "OFF"}")
}

// v261: Gesture Shake Action261
internal fun PlayerActivity.showV261GestureShakeAction261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261gestureShakeAction261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261gestureShakeAction261 = value
        AppToast.show(this, "Gesture Shake Action261: $value")
    }
}

// v261: Cast Audio Volume261
internal fun PlayerActivity.showV261CastAudioVolume261Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v261castAudioVolume261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261castAudioVolume261 = value
        AppToast.show(this, "Cast Audio Volume261: $value")
    }
}

// v261: Playlist Auto Skip Outro261
internal fun PlayerActivity.showV261PlaylistAutoSkipOutro261Toggle() {
    val current = BiliClient.prefs.v261playlistAutoSkipOutro261
    BiliClient.prefs.v261playlistAutoSkipOutro261 = !current
    AppToast.show(this, "Playlist Auto Skip Outro261: ${if (!current) "ON" else "OFF"}")
}

// v261: Cache Download Speed262
internal fun PlayerActivity.showV261CacheDownloadSpeed262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261cacheDownloadSpeed262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261cacheDownloadSpeed262 = value
        AppToast.show(this, "Cache Download Speed262: $value")
    }
}

// v261: Progress Bar Thumb Border261
internal fun PlayerActivity.showV261ProgressBarThumbBorder261Toggle() {
    val current = BiliClient.prefs.v261progressBarThumbBorder261
    BiliClient.prefs.v261progressBarThumbBorder261 = !current
    AppToast.show(this, "Progress Bar Thumb Border261: ${if (!current) "ON" else "OFF"}")
}

// v261: Volume Boost Peak261
internal fun PlayerActivity.showV261VolumeBoostPeak261Toggle() {
    val current = BiliClient.prefs.v261volumeBoostPeak261
    BiliClient.prefs.v261volumeBoostPeak261 = !current
    AppToast.show(this, "Volume Boost Peak261: ${if (!current) "ON" else "OFF"}")
}

// v261: History Bookmark Export261
internal fun PlayerActivity.showV261HistoryBookmarkExport261Toggle() {
    val current = BiliClient.prefs.v261historyBookmarkExport261
    BiliClient.prefs.v261historyBookmarkExport261 = !current
    AppToast.show(this, "History Bookmark Export261: ${if (!current) "ON" else "OFF"}")
}

// v261: Playback Chapter Sync261
internal fun PlayerActivity.showV261PlaybackChapterSync261Toggle() {
    val current = BiliClient.prefs.v261playbackChapterSync261
    BiliClient.prefs.v261playbackChapterSync261 = !current
    AppToast.show(this, "Playback Chapter Sync261: ${if (!current) "ON" else "OFF"}")
}

// v261: Screenshot Save Path261
internal fun PlayerActivity.showV261ScreenshotSavePath261Toggle() {
    val current = BiliClient.prefs.v261screenshotSavePath261
    BiliClient.prefs.v261screenshotSavePath261 = !current
    AppToast.show(this, "Screenshot Save Path261: ${if (!current) "ON" else "OFF"}")
}

// v261: Video Color Space261
internal fun PlayerActivity.showV261VideoColorSpace261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261videoColorSpace261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261videoColorSpace261 = value
        AppToast.show(this, "Video Color Space261: $value")
    }
}

// v261: Danmaku Bottom Max Count330
internal fun PlayerActivity.showV261DanmakuBottomMaxCount330Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261danmakuBottomMaxCount330).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count330",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261danmakuBottomMaxCount330 = value
        AppToast.show(this, "Danmaku Bottom Max Count330: $value")
    }
}

// v261: Subtitle Bg Border337
internal fun PlayerActivity.showV261SubtitleBgBorder337Toggle() {
    val current = BiliClient.prefs.v261subtitleBgBorder337
    BiliClient.prefs.v261subtitleBgBorder337 = !current
    AppToast.show(this, "Subtitle Bg Border337: ${if (!current) "ON" else "OFF"}")
}

// v262: Audio EQ Custom262
internal fun PlayerActivity.showV262AudioEQCustom262Toggle() {
    val current = BiliClient.prefs.v262audioEQCustom262
    BiliClient.prefs.v262audioEQCustom262 = !current
    AppToast.show(this, "Audio EQ Custom262: ${if (!current) "ON" else "OFF"}")
}

// v262: Danmaku Bottom Max Count331
internal fun PlayerActivity.showV262DanmakuBottomMaxCount331Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262danmakuBottomMaxCount331).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count331",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262danmakuBottomMaxCount331 = value
        AppToast.show(this, "Danmaku Bottom Max Count331: $value")
    }
}

// v262: Subtitle Bg Border338
internal fun PlayerActivity.showV262SubtitleBgBorder338Toggle() {
    val current = BiliClient.prefs.v262subtitleBgBorder338
    BiliClient.prefs.v262subtitleBgBorder338 = !current
    AppToast.show(this, "Subtitle Bg Border338: ${if (!current) "ON" else "OFF"}")
}

// v262: Gesture Shake Action262
internal fun PlayerActivity.showV262GestureShakeAction262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262gestureShakeAction262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262gestureShakeAction262 = value
        AppToast.show(this, "Gesture Shake Action262: $value")
    }
}

// v262: Cast Audio Volume262
internal fun PlayerActivity.showV262CastAudioVolume262Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v262castAudioVolume262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262castAudioVolume262 = value
        AppToast.show(this, "Cast Audio Volume262: $value")
    }
}

// v262: Playlist Auto Skip Outro262
internal fun PlayerActivity.showV262PlaylistAutoSkipOutro262Toggle() {
    val current = BiliClient.prefs.v262playlistAutoSkipOutro262
    BiliClient.prefs.v262playlistAutoSkipOutro262 = !current
    AppToast.show(this, "Playlist Auto Skip Outro262: ${if (!current) "ON" else "OFF"}")
}

// v262: Cache Download Speed263
internal fun PlayerActivity.showV262CacheDownloadSpeed263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262cacheDownloadSpeed263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262cacheDownloadSpeed263 = value
        AppToast.show(this, "Cache Download Speed263: $value")
    }
}

// v262: Progress Bar Thumb Border262
internal fun PlayerActivity.showV262ProgressBarThumbBorder262Toggle() {
    val current = BiliClient.prefs.v262progressBarThumbBorder262
    BiliClient.prefs.v262progressBarThumbBorder262 = !current
    AppToast.show(this, "Progress Bar Thumb Border262: ${if (!current) "ON" else "OFF"}")
}

// v262: Volume Boost Peak262
internal fun PlayerActivity.showV262VolumeBoostPeak262Toggle() {
    val current = BiliClient.prefs.v262volumeBoostPeak262
    BiliClient.prefs.v262volumeBoostPeak262 = !current
    AppToast.show(this, "Volume Boost Peak262: ${if (!current) "ON" else "OFF"}")
}

// v262: History Bookmark Export262
internal fun PlayerActivity.showV262HistoryBookmarkExport262Toggle() {
    val current = BiliClient.prefs.v262historyBookmarkExport262
    BiliClient.prefs.v262historyBookmarkExport262 = !current
    AppToast.show(this, "History Bookmark Export262: ${if (!current) "ON" else "OFF"}")
}

// v262: Playback Chapter Sync262
internal fun PlayerActivity.showV262PlaybackChapterSync262Toggle() {
    val current = BiliClient.prefs.v262playbackChapterSync262
    BiliClient.prefs.v262playbackChapterSync262 = !current
    AppToast.show(this, "Playback Chapter Sync262: ${if (!current) "ON" else "OFF"}")
}

// v262: Screenshot Save Path262
internal fun PlayerActivity.showV262ScreenshotSavePath262Toggle() {
    val current = BiliClient.prefs.v262screenshotSavePath262
    BiliClient.prefs.v262screenshotSavePath262 = !current
    AppToast.show(this, "Screenshot Save Path262: ${if (!current) "ON" else "OFF"}")
}

// v262: Video Color Space262
internal fun PlayerActivity.showV262VideoColorSpace262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262videoColorSpace262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262videoColorSpace262 = value
        AppToast.show(this, "Video Color Space262: $value")
    }
}

// v262: Danmaku Bottom Max Count332
internal fun PlayerActivity.showV262DanmakuBottomMaxCount332Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262danmakuBottomMaxCount332).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count332",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262danmakuBottomMaxCount332 = value
        AppToast.show(this, "Danmaku Bottom Max Count332: $value")
    }
}

// v262: Subtitle Bg Border339
internal fun PlayerActivity.showV262SubtitleBgBorder339Toggle() {
    val current = BiliClient.prefs.v262subtitleBgBorder339
    BiliClient.prefs.v262subtitleBgBorder339 = !current
    AppToast.show(this, "Subtitle Bg Border339: ${if (!current) "ON" else "OFF"}")
}

// v263: Audio EQ Custom263
internal fun PlayerActivity.showV263AudioEQCustom263Toggle() {
    val current = BiliClient.prefs.v263audioEQCustom263
    BiliClient.prefs.v263audioEQCustom263 = !current
    AppToast.show(this, "Audio EQ Custom263: ${if (!current) "ON" else "OFF"}")
}

// v263: Danmaku Bottom Max Count333
internal fun PlayerActivity.showV263DanmakuBottomMaxCount333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263danmakuBottomMaxCount333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263danmakuBottomMaxCount333 = value
        AppToast.show(this, "Danmaku Bottom Max Count333: $value")
    }
}

// v263: Subtitle Bg Border340
internal fun PlayerActivity.showV263SubtitleBgBorder340Toggle() {
    val current = BiliClient.prefs.v263subtitleBgBorder340
    BiliClient.prefs.v263subtitleBgBorder340 = !current
    AppToast.show(this, "Subtitle Bg Border340: ${if (!current) "ON" else "OFF"}")
}

// v1981: erased mode
internal fun PlayerActivity.showV1981ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981erased
    FeaturePrefsStore.batch1981.v1981erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1981: escaped mode
internal fun PlayerActivity.showV1981EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981escaped
    FeaturePrefsStore.batch1981.v1981escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1981: established mode
internal fun PlayerActivity.showV1981EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981established
    FeaturePrefsStore.batch1981.v1981established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1981: estimated mode
internal fun PlayerActivity.showV1981EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981estimated
    FeaturePrefsStore.batch1981.v1981estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1981: evaluated mode
internal fun PlayerActivity.showV1981EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981evaluated
    FeaturePrefsStore.batch1981.v1981evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1981: examined level
internal fun PlayerActivity.showV1981ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1981: exceeded level
internal fun PlayerActivity.showV1981ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1981: exchanged level
internal fun PlayerActivity.showV1981ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1981: excluded level
internal fun PlayerActivity.showV1981ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1981: executed level
internal fun PlayerActivity.showV1981ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1981executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1981executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1981: exercised mode
internal fun PlayerActivity.showV1981ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981exercised
    FeaturePrefsStore.batch1981.v1981exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1981: exhausted mode
internal fun PlayerActivity.showV1981ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981exhausted
    FeaturePrefsStore.batch1981.v1981exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1981: exhibited mode
internal fun PlayerActivity.showV1981ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981exhibited
    FeaturePrefsStore.batch1981.v1981exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1981: expanded mode
internal fun PlayerActivity.showV1981ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981expanded
    FeaturePrefsStore.batch1981.v1981expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1981: expected mode
internal fun PlayerActivity.showV1981ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1981expected
    FeaturePrefsStore.batch1981.v1981expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1982: erased mode
internal fun PlayerActivity.showV1982ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982erased
    FeaturePrefsStore.batch1981.v1982erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1982: escaped mode
internal fun PlayerActivity.showV1982EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982escaped
    FeaturePrefsStore.batch1981.v1982escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1982: established mode
internal fun PlayerActivity.showV1982EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982established
    FeaturePrefsStore.batch1981.v1982established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1982: estimated mode
internal fun PlayerActivity.showV1982EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982estimated
    FeaturePrefsStore.batch1981.v1982estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1982: evaluated mode
internal fun PlayerActivity.showV1982EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982evaluated
    FeaturePrefsStore.batch1981.v1982evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1982: examined level
internal fun PlayerActivity.showV1982ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1982: exceeded level
internal fun PlayerActivity.showV1982ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1982: exchanged level
internal fun PlayerActivity.showV1982ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1982: excluded level
internal fun PlayerActivity.showV1982ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1982: executed level
internal fun PlayerActivity.showV1982ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1982executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1982executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1982: exercised mode
internal fun PlayerActivity.showV1982ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982exercised
    FeaturePrefsStore.batch1981.v1982exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1982: exhausted mode
internal fun PlayerActivity.showV1982ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982exhausted
    FeaturePrefsStore.batch1981.v1982exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1982: exhibited mode
internal fun PlayerActivity.showV1982ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982exhibited
    FeaturePrefsStore.batch1981.v1982exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1982: expanded mode
internal fun PlayerActivity.showV1982ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982expanded
    FeaturePrefsStore.batch1981.v1982expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1982: expected mode
internal fun PlayerActivity.showV1982ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1982expected
    FeaturePrefsStore.batch1981.v1982expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1983: erased mode
internal fun PlayerActivity.showV1983ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983erased
    FeaturePrefsStore.batch1981.v1983erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1983: escaped mode
internal fun PlayerActivity.showV1983EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983escaped
    FeaturePrefsStore.batch1981.v1983escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1983: established mode
internal fun PlayerActivity.showV1983EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983established
    FeaturePrefsStore.batch1981.v1983established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1983: estimated mode
internal fun PlayerActivity.showV1983EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983estimated
    FeaturePrefsStore.batch1981.v1983estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1983: evaluated mode
internal fun PlayerActivity.showV1983EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983evaluated
    FeaturePrefsStore.batch1981.v1983evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1983: examined level
internal fun PlayerActivity.showV1983ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1983: exceeded level
internal fun PlayerActivity.showV1983ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1983: exchanged level
internal fun PlayerActivity.showV1983ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1983: excluded level
internal fun PlayerActivity.showV1983ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1983: executed level
internal fun PlayerActivity.showV1983ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1983executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1983executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1983: exercised mode
internal fun PlayerActivity.showV1983ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983exercised
    FeaturePrefsStore.batch1981.v1983exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1983: exhausted mode
internal fun PlayerActivity.showV1983ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983exhausted
    FeaturePrefsStore.batch1981.v1983exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1983: exhibited mode
internal fun PlayerActivity.showV1983ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983exhibited
    FeaturePrefsStore.batch1981.v1983exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1983: expanded mode
internal fun PlayerActivity.showV1983ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983expanded
    FeaturePrefsStore.batch1981.v1983expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1983: expected mode
internal fun PlayerActivity.showV1983ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1983expected
    FeaturePrefsStore.batch1981.v1983expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1984: erased mode
internal fun PlayerActivity.showV1984ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984erased
    FeaturePrefsStore.batch1981.v1984erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1984: escaped mode
internal fun PlayerActivity.showV1984EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984escaped
    FeaturePrefsStore.batch1981.v1984escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1984: established mode
internal fun PlayerActivity.showV1984EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984established
    FeaturePrefsStore.batch1981.v1984established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1984: estimated mode
internal fun PlayerActivity.showV1984EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984estimated
    FeaturePrefsStore.batch1981.v1984estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1984: evaluated mode
internal fun PlayerActivity.showV1984EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984evaluated
    FeaturePrefsStore.batch1981.v1984evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1984: examined level
internal fun PlayerActivity.showV1984ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1984: exceeded level
internal fun PlayerActivity.showV1984ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1984: exchanged level
internal fun PlayerActivity.showV1984ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1984: excluded level
internal fun PlayerActivity.showV1984ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1984: executed level
internal fun PlayerActivity.showV1984ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1984executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1984executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1984: exercised mode
internal fun PlayerActivity.showV1984ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984exercised
    FeaturePrefsStore.batch1981.v1984exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1984: exhausted mode
internal fun PlayerActivity.showV1984ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984exhausted
    FeaturePrefsStore.batch1981.v1984exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1984: exhibited mode
internal fun PlayerActivity.showV1984ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984exhibited
    FeaturePrefsStore.batch1981.v1984exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1984: expanded mode
internal fun PlayerActivity.showV1984ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984expanded
    FeaturePrefsStore.batch1981.v1984expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1984: expected mode
internal fun PlayerActivity.showV1984ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1984expected
    FeaturePrefsStore.batch1981.v1984expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1985: erased mode
internal fun PlayerActivity.showV1985ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985erased
    FeaturePrefsStore.batch1981.v1985erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1985: escaped mode
internal fun PlayerActivity.showV1985EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985escaped
    FeaturePrefsStore.batch1981.v1985escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1985: established mode
internal fun PlayerActivity.showV1985EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985established
    FeaturePrefsStore.batch1981.v1985established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1985: estimated mode
internal fun PlayerActivity.showV1985EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985estimated
    FeaturePrefsStore.batch1981.v1985estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1985: evaluated mode
internal fun PlayerActivity.showV1985EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985evaluated
    FeaturePrefsStore.batch1981.v1985evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1985: examined level
internal fun PlayerActivity.showV1985ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1985: exceeded level
internal fun PlayerActivity.showV1985ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1985: exchanged level
internal fun PlayerActivity.showV1985ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1985: excluded level
internal fun PlayerActivity.showV1985ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1985: executed level
internal fun PlayerActivity.showV1985ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1985executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1985executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1985: exercised mode
internal fun PlayerActivity.showV1985ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985exercised
    FeaturePrefsStore.batch1981.v1985exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1985: exhausted mode
internal fun PlayerActivity.showV1985ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985exhausted
    FeaturePrefsStore.batch1981.v1985exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1985: exhibited mode
internal fun PlayerActivity.showV1985ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985exhibited
    FeaturePrefsStore.batch1981.v1985exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1985: expanded mode
internal fun PlayerActivity.showV1985ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985expanded
    FeaturePrefsStore.batch1981.v1985expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1985: expected mode
internal fun PlayerActivity.showV1985ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1985expected
    FeaturePrefsStore.batch1981.v1985expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1986: erased mode
internal fun PlayerActivity.showV1986ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986erased
    FeaturePrefsStore.batch1981.v1986erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1986: escaped mode
internal fun PlayerActivity.showV1986EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986escaped
    FeaturePrefsStore.batch1981.v1986escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1986: established mode
internal fun PlayerActivity.showV1986EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986established
    FeaturePrefsStore.batch1981.v1986established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1986: estimated mode
internal fun PlayerActivity.showV1986EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986estimated
    FeaturePrefsStore.batch1981.v1986estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1986: evaluated mode
internal fun PlayerActivity.showV1986EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986evaluated
    FeaturePrefsStore.batch1981.v1986evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1986: examined level
internal fun PlayerActivity.showV1986ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1986: exceeded level
internal fun PlayerActivity.showV1986ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1986: exchanged level
internal fun PlayerActivity.showV1986ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1986: excluded level
internal fun PlayerActivity.showV1986ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1986: executed level
internal fun PlayerActivity.showV1986ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1986executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1986executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1986: exercised mode
internal fun PlayerActivity.showV1986ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986exercised
    FeaturePrefsStore.batch1981.v1986exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1986: exhausted mode
internal fun PlayerActivity.showV1986ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986exhausted
    FeaturePrefsStore.batch1981.v1986exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1986: exhibited mode
internal fun PlayerActivity.showV1986ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986exhibited
    FeaturePrefsStore.batch1981.v1986exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1986: expanded mode
internal fun PlayerActivity.showV1986ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986expanded
    FeaturePrefsStore.batch1981.v1986expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1986: expected mode
internal fun PlayerActivity.showV1986ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1986expected
    FeaturePrefsStore.batch1981.v1986expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1987: erased mode
internal fun PlayerActivity.showV1987ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987erased
    FeaturePrefsStore.batch1981.v1987erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1987: escaped mode
internal fun PlayerActivity.showV1987EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987escaped
    FeaturePrefsStore.batch1981.v1987escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1987: established mode
internal fun PlayerActivity.showV1987EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987established
    FeaturePrefsStore.batch1981.v1987established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1987: estimated mode
internal fun PlayerActivity.showV1987EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987estimated
    FeaturePrefsStore.batch1981.v1987estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1987: evaluated mode
internal fun PlayerActivity.showV1987EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987evaluated
    FeaturePrefsStore.batch1981.v1987evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1987: examined level
internal fun PlayerActivity.showV1987ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1987: exceeded level
internal fun PlayerActivity.showV1987ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1987: exchanged level
internal fun PlayerActivity.showV1987ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1987: excluded level
internal fun PlayerActivity.showV1987ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1987: executed level
internal fun PlayerActivity.showV1987ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1987executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1987executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1987: exercised mode
internal fun PlayerActivity.showV1987ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987exercised
    FeaturePrefsStore.batch1981.v1987exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1987: exhausted mode
internal fun PlayerActivity.showV1987ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987exhausted
    FeaturePrefsStore.batch1981.v1987exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1987: exhibited mode
internal fun PlayerActivity.showV1987ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987exhibited
    FeaturePrefsStore.batch1981.v1987exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1987: expanded mode
internal fun PlayerActivity.showV1987ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987expanded
    FeaturePrefsStore.batch1981.v1987expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1987: expected mode
internal fun PlayerActivity.showV1987ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1987expected
    FeaturePrefsStore.batch1981.v1987expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1988: erased mode
internal fun PlayerActivity.showV1988ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988erased
    FeaturePrefsStore.batch1981.v1988erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1988: escaped mode
internal fun PlayerActivity.showV1988EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988escaped
    FeaturePrefsStore.batch1981.v1988escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1988: established mode
internal fun PlayerActivity.showV1988EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988established
    FeaturePrefsStore.batch1981.v1988established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1988: estimated mode
internal fun PlayerActivity.showV1988EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988estimated
    FeaturePrefsStore.batch1981.v1988estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1988: evaluated mode
internal fun PlayerActivity.showV1988EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988evaluated
    FeaturePrefsStore.batch1981.v1988evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1988: examined level
internal fun PlayerActivity.showV1988ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1988: exceeded level
internal fun PlayerActivity.showV1988ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1988: exchanged level
internal fun PlayerActivity.showV1988ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1988: excluded level
internal fun PlayerActivity.showV1988ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1988: executed level
internal fun PlayerActivity.showV1988ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1988executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1988executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1988: exercised mode
internal fun PlayerActivity.showV1988ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988exercised
    FeaturePrefsStore.batch1981.v1988exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1988: exhausted mode
internal fun PlayerActivity.showV1988ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988exhausted
    FeaturePrefsStore.batch1981.v1988exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1988: exhibited mode
internal fun PlayerActivity.showV1988ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988exhibited
    FeaturePrefsStore.batch1981.v1988exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1988: expanded mode
internal fun PlayerActivity.showV1988ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988expanded
    FeaturePrefsStore.batch1981.v1988expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1988: expected mode
internal fun PlayerActivity.showV1988ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1988expected
    FeaturePrefsStore.batch1981.v1988expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1989: erased mode
internal fun PlayerActivity.showV1989ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989erased
    FeaturePrefsStore.batch1981.v1989erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1989: escaped mode
internal fun PlayerActivity.showV1989EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989escaped
    FeaturePrefsStore.batch1981.v1989escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1989: established mode
internal fun PlayerActivity.showV1989EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989established
    FeaturePrefsStore.batch1981.v1989established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1989: estimated mode
internal fun PlayerActivity.showV1989EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989estimated
    FeaturePrefsStore.batch1981.v1989estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1989: evaluated mode
internal fun PlayerActivity.showV1989EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989evaluated
    FeaturePrefsStore.batch1981.v1989evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1989: examined level
internal fun PlayerActivity.showV1989ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1989: exceeded level
internal fun PlayerActivity.showV1989ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1989: exchanged level
internal fun PlayerActivity.showV1989ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1989: excluded level
internal fun PlayerActivity.showV1989ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1989: executed level
internal fun PlayerActivity.showV1989ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1989executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1989executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1989: exercised mode
internal fun PlayerActivity.showV1989ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989exercised
    FeaturePrefsStore.batch1981.v1989exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1989: exhausted mode
internal fun PlayerActivity.showV1989ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989exhausted
    FeaturePrefsStore.batch1981.v1989exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1989: exhibited mode
internal fun PlayerActivity.showV1989ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989exhibited
    FeaturePrefsStore.batch1981.v1989exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1989: expanded mode
internal fun PlayerActivity.showV1989ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989expanded
    FeaturePrefsStore.batch1981.v1989expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1989: expected mode
internal fun PlayerActivity.showV1989ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1989expected
    FeaturePrefsStore.batch1981.v1989expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1990: erased mode
internal fun PlayerActivity.showV1990ErasedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990erased
    FeaturePrefsStore.batch1981.v1990erased = !current
    AppToast.show(this, "erased: ${if (!current) "ON" else "OFF"}")
}

// v1990: escaped mode
internal fun PlayerActivity.showV1990EscapedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990escaped
    FeaturePrefsStore.batch1981.v1990escaped = !current
    AppToast.show(this, "escaped: ${if (!current) "ON" else "OFF"}")
}

// v1990: established mode
internal fun PlayerActivity.showV1990EstablishedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990established
    FeaturePrefsStore.batch1981.v1990established = !current
    AppToast.show(this, "established: ${if (!current) "ON" else "OFF"}")
}

// v1990: estimated mode
internal fun PlayerActivity.showV1990EstimatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990estimated
    FeaturePrefsStore.batch1981.v1990estimated = !current
    AppToast.show(this, "estimated: ${if (!current) "ON" else "OFF"}")
}

// v1990: evaluated mode
internal fun PlayerActivity.showV1990EvaluatedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990evaluated
    FeaturePrefsStore.batch1981.v1990evaluated = !current
    AppToast.show(this, "evaluated: ${if (!current) "ON" else "OFF"}")
}

// v1990: examined level
internal fun PlayerActivity.showV1990ExaminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990examined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "examined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990examined = value
        AppToast.show(this, "examined: $value")
    }
}

// v1990: exceeded level
internal fun PlayerActivity.showV1990ExceededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990exceeded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceeded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990exceeded = value
        AppToast.show(this, "exceeded: $value")
    }
}

// v1990: exchanged level
internal fun PlayerActivity.showV1990ExchangedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990exchanged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exchanged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990exchanged = value
        AppToast.show(this, "exchanged: $value")
    }
}

// v1990: excluded level
internal fun PlayerActivity.showV1990ExcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990excluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "excluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990excluded = value
        AppToast.show(this, "excluded: $value")
    }
}

// v1990: executed level
internal fun PlayerActivity.showV1990ExecutedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1981.v1990executed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "executed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1981.v1990executed = value
        AppToast.show(this, "executed: $value")
    }
}

// v1990: exercised mode
internal fun PlayerActivity.showV1990ExercisedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990exercised
    FeaturePrefsStore.batch1981.v1990exercised = !current
    AppToast.show(this, "exercised: ${if (!current) "ON" else "OFF"}")
}

// v1990: exhausted mode
internal fun PlayerActivity.showV1990ExhaustedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990exhausted
    FeaturePrefsStore.batch1981.v1990exhausted = !current
    AppToast.show(this, "exhausted: ${if (!current) "ON" else "OFF"}")
}

// v1990: exhibited mode
internal fun PlayerActivity.showV1990ExhibitedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990exhibited
    FeaturePrefsStore.batch1981.v1990exhibited = !current
    AppToast.show(this, "exhibited: ${if (!current) "ON" else "OFF"}")
}

// v1990: expanded mode
internal fun PlayerActivity.showV1990ExpandedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990expanded
    FeaturePrefsStore.batch1981.v1990expanded = !current
    AppToast.show(this, "expanded: ${if (!current) "ON" else "OFF"}")
}

// v1990: expected mode
internal fun PlayerActivity.showV1990ExpectedToggle() {
    val current = FeaturePrefsStore.batch1981.v1990expected
    FeaturePrefsStore.batch1981.v1990expected = !current
    AppToast.show(this, "expected: ${if (!current) "ON" else "OFF"}")
}

// v1991: expedited mode
internal fun PlayerActivity.showV1991ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991expedited
    FeaturePrefsStore.batch1991.v1991expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1991: experimented mode
internal fun PlayerActivity.showV1991ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991experimented
    FeaturePrefsStore.batch1991.v1991experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1991: explained mode
internal fun PlayerActivity.showV1991ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991explained
    FeaturePrefsStore.batch1991.v1991explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1991: explored mode
internal fun PlayerActivity.showV1991ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1991explored
    FeaturePrefsStore.batch1991.v1991explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1991: exported mode
internal fun PlayerActivity.showV1991ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991exported
    FeaturePrefsStore.batch1991.v1991exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1991: exposed level
internal fun PlayerActivity.showV1991ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1991: expressed level
internal fun PlayerActivity.showV1991ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1991: extended level
internal fun PlayerActivity.showV1991ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1991: extracted level
internal fun PlayerActivity.showV1991ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1991: fabricated level
internal fun PlayerActivity.showV1991FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1991fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1991fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1991: facilitated mode
internal fun PlayerActivity.showV1991FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991facilitated
    FeaturePrefsStore.batch1991.v1991facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1991: faded mode
internal fun PlayerActivity.showV1991FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991faded
    FeaturePrefsStore.batch1991.v1991faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1991: failed mode
internal fun PlayerActivity.showV1991FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991failed
    FeaturePrefsStore.batch1991.v1991failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1991: favored mode
internal fun PlayerActivity.showV1991FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1991favored
    FeaturePrefsStore.batch1991.v1991favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1991: featured mode
internal fun PlayerActivity.showV1991FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1991featured
    FeaturePrefsStore.batch1991.v1991featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1992: expedited mode
internal fun PlayerActivity.showV1992ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992expedited
    FeaturePrefsStore.batch1991.v1992expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1992: experimented mode
internal fun PlayerActivity.showV1992ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992experimented
    FeaturePrefsStore.batch1991.v1992experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1992: explained mode
internal fun PlayerActivity.showV1992ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992explained
    FeaturePrefsStore.batch1991.v1992explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1992: explored mode
internal fun PlayerActivity.showV1992ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1992explored
    FeaturePrefsStore.batch1991.v1992explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1992: exported mode
internal fun PlayerActivity.showV1992ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992exported
    FeaturePrefsStore.batch1991.v1992exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1992: exposed level
internal fun PlayerActivity.showV1992ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1992: expressed level
internal fun PlayerActivity.showV1992ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1992: extended level
internal fun PlayerActivity.showV1992ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1992: extracted level
internal fun PlayerActivity.showV1992ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1992: fabricated level
internal fun PlayerActivity.showV1992FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1992fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1992fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1992: facilitated mode
internal fun PlayerActivity.showV1992FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992facilitated
    FeaturePrefsStore.batch1991.v1992facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1992: faded mode
internal fun PlayerActivity.showV1992FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992faded
    FeaturePrefsStore.batch1991.v1992faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1992: failed mode
internal fun PlayerActivity.showV1992FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992failed
    FeaturePrefsStore.batch1991.v1992failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1992: favored mode
internal fun PlayerActivity.showV1992FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1992favored
    FeaturePrefsStore.batch1991.v1992favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1992: featured mode
internal fun PlayerActivity.showV1992FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1992featured
    FeaturePrefsStore.batch1991.v1992featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1993: expedited mode
internal fun PlayerActivity.showV1993ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993expedited
    FeaturePrefsStore.batch1991.v1993expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1993: experimented mode
internal fun PlayerActivity.showV1993ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993experimented
    FeaturePrefsStore.batch1991.v1993experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1993: explained mode
internal fun PlayerActivity.showV1993ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993explained
    FeaturePrefsStore.batch1991.v1993explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1993: explored mode
internal fun PlayerActivity.showV1993ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1993explored
    FeaturePrefsStore.batch1991.v1993explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1993: exported mode
internal fun PlayerActivity.showV1993ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993exported
    FeaturePrefsStore.batch1991.v1993exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1993: exposed level
internal fun PlayerActivity.showV1993ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1993: expressed level
internal fun PlayerActivity.showV1993ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1993: extended level
internal fun PlayerActivity.showV1993ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1993: extracted level
internal fun PlayerActivity.showV1993ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1993: fabricated level
internal fun PlayerActivity.showV1993FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1993fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1993fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1993: facilitated mode
internal fun PlayerActivity.showV1993FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993facilitated
    FeaturePrefsStore.batch1991.v1993facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1993: faded mode
internal fun PlayerActivity.showV1993FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993faded
    FeaturePrefsStore.batch1991.v1993faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1993: failed mode
internal fun PlayerActivity.showV1993FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993failed
    FeaturePrefsStore.batch1991.v1993failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1993: favored mode
internal fun PlayerActivity.showV1993FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1993favored
    FeaturePrefsStore.batch1991.v1993favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1993: featured mode
internal fun PlayerActivity.showV1993FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1993featured
    FeaturePrefsStore.batch1991.v1993featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1994: expedited mode
internal fun PlayerActivity.showV1994ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994expedited
    FeaturePrefsStore.batch1991.v1994expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1994: experimented mode
internal fun PlayerActivity.showV1994ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994experimented
    FeaturePrefsStore.batch1991.v1994experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1994: explained mode
internal fun PlayerActivity.showV1994ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994explained
    FeaturePrefsStore.batch1991.v1994explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1994: explored mode
internal fun PlayerActivity.showV1994ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1994explored
    FeaturePrefsStore.batch1991.v1994explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1994: exported mode
internal fun PlayerActivity.showV1994ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994exported
    FeaturePrefsStore.batch1991.v1994exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1994: exposed level
internal fun PlayerActivity.showV1994ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1994: expressed level
internal fun PlayerActivity.showV1994ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1994: extended level
internal fun PlayerActivity.showV1994ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1994: extracted level
internal fun PlayerActivity.showV1994ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1994: fabricated level
internal fun PlayerActivity.showV1994FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1994fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1994fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1994: facilitated mode
internal fun PlayerActivity.showV1994FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994facilitated
    FeaturePrefsStore.batch1991.v1994facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1994: faded mode
internal fun PlayerActivity.showV1994FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994faded
    FeaturePrefsStore.batch1991.v1994faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1994: failed mode
internal fun PlayerActivity.showV1994FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994failed
    FeaturePrefsStore.batch1991.v1994failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1994: favored mode
internal fun PlayerActivity.showV1994FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1994favored
    FeaturePrefsStore.batch1991.v1994favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1994: featured mode
internal fun PlayerActivity.showV1994FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1994featured
    FeaturePrefsStore.batch1991.v1994featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1995: expedited mode
internal fun PlayerActivity.showV1995ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995expedited
    FeaturePrefsStore.batch1991.v1995expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1995: experimented mode
internal fun PlayerActivity.showV1995ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995experimented
    FeaturePrefsStore.batch1991.v1995experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1995: explained mode
internal fun PlayerActivity.showV1995ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995explained
    FeaturePrefsStore.batch1991.v1995explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1995: explored mode
internal fun PlayerActivity.showV1995ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1995explored
    FeaturePrefsStore.batch1991.v1995explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1995: exported mode
internal fun PlayerActivity.showV1995ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995exported
    FeaturePrefsStore.batch1991.v1995exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1995: exposed level
internal fun PlayerActivity.showV1995ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1995: expressed level
internal fun PlayerActivity.showV1995ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1995: extended level
internal fun PlayerActivity.showV1995ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1995: extracted level
internal fun PlayerActivity.showV1995ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1995: fabricated level
internal fun PlayerActivity.showV1995FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1995fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1995fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1995: facilitated mode
internal fun PlayerActivity.showV1995FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995facilitated
    FeaturePrefsStore.batch1991.v1995facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1995: faded mode
internal fun PlayerActivity.showV1995FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995faded
    FeaturePrefsStore.batch1991.v1995faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1995: failed mode
internal fun PlayerActivity.showV1995FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995failed
    FeaturePrefsStore.batch1991.v1995failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1995: favored mode
internal fun PlayerActivity.showV1995FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1995favored
    FeaturePrefsStore.batch1991.v1995favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1995: featured mode
internal fun PlayerActivity.showV1995FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1995featured
    FeaturePrefsStore.batch1991.v1995featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1996: expedited mode
internal fun PlayerActivity.showV1996ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996expedited
    FeaturePrefsStore.batch1991.v1996expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1996: experimented mode
internal fun PlayerActivity.showV1996ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996experimented
    FeaturePrefsStore.batch1991.v1996experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1996: explained mode
internal fun PlayerActivity.showV1996ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996explained
    FeaturePrefsStore.batch1991.v1996explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1996: explored mode
internal fun PlayerActivity.showV1996ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1996explored
    FeaturePrefsStore.batch1991.v1996explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1996: exported mode
internal fun PlayerActivity.showV1996ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996exported
    FeaturePrefsStore.batch1991.v1996exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1996: exposed level
internal fun PlayerActivity.showV1996ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1996: expressed level
internal fun PlayerActivity.showV1996ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1996: extended level
internal fun PlayerActivity.showV1996ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1996: extracted level
internal fun PlayerActivity.showV1996ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1996: fabricated level
internal fun PlayerActivity.showV1996FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1996fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1996fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1996: facilitated mode
internal fun PlayerActivity.showV1996FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996facilitated
    FeaturePrefsStore.batch1991.v1996facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1996: faded mode
internal fun PlayerActivity.showV1996FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996faded
    FeaturePrefsStore.batch1991.v1996faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1996: failed mode
internal fun PlayerActivity.showV1996FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996failed
    FeaturePrefsStore.batch1991.v1996failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1996: favored mode
internal fun PlayerActivity.showV1996FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1996favored
    FeaturePrefsStore.batch1991.v1996favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1996: featured mode
internal fun PlayerActivity.showV1996FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1996featured
    FeaturePrefsStore.batch1991.v1996featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1997: expedited mode
internal fun PlayerActivity.showV1997ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997expedited
    FeaturePrefsStore.batch1991.v1997expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1997: experimented mode
internal fun PlayerActivity.showV1997ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997experimented
    FeaturePrefsStore.batch1991.v1997experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1997: explained mode
internal fun PlayerActivity.showV1997ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997explained
    FeaturePrefsStore.batch1991.v1997explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1997: explored mode
internal fun PlayerActivity.showV1997ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1997explored
    FeaturePrefsStore.batch1991.v1997explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1997: exported mode
internal fun PlayerActivity.showV1997ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997exported
    FeaturePrefsStore.batch1991.v1997exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1997: exposed level
internal fun PlayerActivity.showV1997ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1997: expressed level
internal fun PlayerActivity.showV1997ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1997: extended level
internal fun PlayerActivity.showV1997ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1997: extracted level
internal fun PlayerActivity.showV1997ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1997: fabricated level
internal fun PlayerActivity.showV1997FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1997fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1997fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1997: facilitated mode
internal fun PlayerActivity.showV1997FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997facilitated
    FeaturePrefsStore.batch1991.v1997facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1997: faded mode
internal fun PlayerActivity.showV1997FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997faded
    FeaturePrefsStore.batch1991.v1997faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1997: failed mode
internal fun PlayerActivity.showV1997FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997failed
    FeaturePrefsStore.batch1991.v1997failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1997: favored mode
internal fun PlayerActivity.showV1997FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1997favored
    FeaturePrefsStore.batch1991.v1997favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1997: featured mode
internal fun PlayerActivity.showV1997FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1997featured
    FeaturePrefsStore.batch1991.v1997featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1998: expedited mode
internal fun PlayerActivity.showV1998ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998expedited
    FeaturePrefsStore.batch1991.v1998expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1998: experimented mode
internal fun PlayerActivity.showV1998ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998experimented
    FeaturePrefsStore.batch1991.v1998experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1998: explained mode
internal fun PlayerActivity.showV1998ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998explained
    FeaturePrefsStore.batch1991.v1998explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1998: explored mode
internal fun PlayerActivity.showV1998ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1998explored
    FeaturePrefsStore.batch1991.v1998explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1998: exported mode
internal fun PlayerActivity.showV1998ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998exported
    FeaturePrefsStore.batch1991.v1998exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1998: exposed level
internal fun PlayerActivity.showV1998ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1998: expressed level
internal fun PlayerActivity.showV1998ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1998: extended level
internal fun PlayerActivity.showV1998ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1998: extracted level
internal fun PlayerActivity.showV1998ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1998: fabricated level
internal fun PlayerActivity.showV1998FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1998fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1998fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1998: facilitated mode
internal fun PlayerActivity.showV1998FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998facilitated
    FeaturePrefsStore.batch1991.v1998facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1998: faded mode
internal fun PlayerActivity.showV1998FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998faded
    FeaturePrefsStore.batch1991.v1998faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1998: failed mode
internal fun PlayerActivity.showV1998FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998failed
    FeaturePrefsStore.batch1991.v1998failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1998: favored mode
internal fun PlayerActivity.showV1998FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1998favored
    FeaturePrefsStore.batch1991.v1998favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1998: featured mode
internal fun PlayerActivity.showV1998FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1998featured
    FeaturePrefsStore.batch1991.v1998featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v1999: expedited mode
internal fun PlayerActivity.showV1999ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999expedited
    FeaturePrefsStore.batch1991.v1999expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v1999: experimented mode
internal fun PlayerActivity.showV1999ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999experimented
    FeaturePrefsStore.batch1991.v1999experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v1999: explained mode
internal fun PlayerActivity.showV1999ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999explained
    FeaturePrefsStore.batch1991.v1999explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v1999: explored mode
internal fun PlayerActivity.showV1999ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v1999explored
    FeaturePrefsStore.batch1991.v1999explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v1999: exported mode
internal fun PlayerActivity.showV1999ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999exported
    FeaturePrefsStore.batch1991.v1999exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v1999: exposed level
internal fun PlayerActivity.showV1999ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v1999: expressed level
internal fun PlayerActivity.showV1999ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v1999: extended level
internal fun PlayerActivity.showV1999ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v1999: extracted level
internal fun PlayerActivity.showV1999ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v1999: fabricated level
internal fun PlayerActivity.showV1999FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v1999fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v1999fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v1999: facilitated mode
internal fun PlayerActivity.showV1999FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999facilitated
    FeaturePrefsStore.batch1991.v1999facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v1999: faded mode
internal fun PlayerActivity.showV1999FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999faded
    FeaturePrefsStore.batch1991.v1999faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v1999: failed mode
internal fun PlayerActivity.showV1999FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999failed
    FeaturePrefsStore.batch1991.v1999failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v1999: favored mode
internal fun PlayerActivity.showV1999FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v1999favored
    FeaturePrefsStore.batch1991.v1999favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v1999: featured mode
internal fun PlayerActivity.showV1999FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v1999featured
    FeaturePrefsStore.batch1991.v1999featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}

// v2000: expedited mode
internal fun PlayerActivity.showV2000ExpeditedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000expedited
    FeaturePrefsStore.batch1991.v2000expedited = !current
    AppToast.show(this, "expedited: ${if (!current) "ON" else "OFF"}")
}

// v2000: experimented mode
internal fun PlayerActivity.showV2000ExperimentedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000experimented
    FeaturePrefsStore.batch1991.v2000experimented = !current
    AppToast.show(this, "experimented: ${if (!current) "ON" else "OFF"}")
}

// v2000: explained mode
internal fun PlayerActivity.showV2000ExplainedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000explained
    FeaturePrefsStore.batch1991.v2000explained = !current
    AppToast.show(this, "explained: ${if (!current) "ON" else "OFF"}")
}

// v2000: explored mode
internal fun PlayerActivity.showV2000ExploredToggle() {
    val current = FeaturePrefsStore.batch1991.v2000explored
    FeaturePrefsStore.batch1991.v2000explored = !current
    AppToast.show(this, "explored: ${if (!current) "ON" else "OFF"}")
}

// v2000: exported mode
internal fun PlayerActivity.showV2000ExportedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000exported
    FeaturePrefsStore.batch1991.v2000exported = !current
    AppToast.show(this, "exported: ${if (!current) "ON" else "OFF"}")
}

// v2000: exposed level
internal fun PlayerActivity.showV2000ExposedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000exposed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exposed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000exposed = value
        AppToast.show(this, "exposed: $value")
    }
}

// v2000: expressed level
internal fun PlayerActivity.showV2000ExpressedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000expressed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "expressed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000expressed = value
        AppToast.show(this, "expressed: $value")
    }
}

// v2000: extended level
internal fun PlayerActivity.showV2000ExtendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000extended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000extended = value
        AppToast.show(this, "extended: $value")
    }
}

// v2000: extracted level
internal fun PlayerActivity.showV2000ExtractedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000extracted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extracted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000extracted = value
        AppToast.show(this, "extracted: $value")
    }
}

// v2000: fabricated level
internal fun PlayerActivity.showV2000FabricatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1991.v2000fabricated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fabricated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1991.v2000fabricated = value
        AppToast.show(this, "fabricated: $value")
    }
}

// v2000: facilitated mode
internal fun PlayerActivity.showV2000FacilitatedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000facilitated
    FeaturePrefsStore.batch1991.v2000facilitated = !current
    AppToast.show(this, "facilitated: ${if (!current) "ON" else "OFF"}")
}

// v2000: faded mode
internal fun PlayerActivity.showV2000FadedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000faded
    FeaturePrefsStore.batch1991.v2000faded = !current
    AppToast.show(this, "faded: ${if (!current) "ON" else "OFF"}")
}

// v2000: failed mode
internal fun PlayerActivity.showV2000FailedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000failed
    FeaturePrefsStore.batch1991.v2000failed = !current
    AppToast.show(this, "failed: ${if (!current) "ON" else "OFF"}")
}

// v2000: favored mode
internal fun PlayerActivity.showV2000FavoredToggle() {
    val current = FeaturePrefsStore.batch1991.v2000favored
    FeaturePrefsStore.batch1991.v2000favored = !current
    AppToast.show(this, "favored: ${if (!current) "ON" else "OFF"}")
}

// v2000: featured mode
internal fun PlayerActivity.showV2000FeaturedToggle() {
    val current = FeaturePrefsStore.batch1991.v2000featured
    FeaturePrefsStore.batch1991.v2000featured = !current
    AppToast.show(this, "featured: ${if (!current) "ON" else "OFF"}")
}
