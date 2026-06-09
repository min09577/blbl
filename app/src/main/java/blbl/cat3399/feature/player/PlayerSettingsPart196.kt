package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2141: populated mode
internal fun PlayerActivity.showV2141PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141populated
    FeaturePrefsStore.batch2141.v2141populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2141: posed mode
internal fun PlayerActivity.showV2141PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141posed
    FeaturePrefsStore.batch2141.v2141posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2141: positioned mode
internal fun PlayerActivity.showV2141PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141positioned
    FeaturePrefsStore.batch2141.v2141positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2141: possessed mode
internal fun PlayerActivity.showV2141PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141possessed
    FeaturePrefsStore.batch2141.v2141possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2141: posted mode
internal fun PlayerActivity.showV2141PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141posted
    FeaturePrefsStore.batch2141.v2141posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2141: potentiated level
internal fun PlayerActivity.showV2141PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2141: powered level
internal fun PlayerActivity.showV2141PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2141: practiced level
internal fun PlayerActivity.showV2141PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2141: praised level
internal fun PlayerActivity.showV2141PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2141: predicted level
internal fun PlayerActivity.showV2141PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2141predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2141predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2141: preferred mode
internal fun PlayerActivity.showV2141PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2141preferred
    FeaturePrefsStore.batch2141.v2141preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2141: prepared mode
internal fun PlayerActivity.showV2141PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141prepared
    FeaturePrefsStore.batch2141.v2141prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2141: prescribed mode
internal fun PlayerActivity.showV2141PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141prescribed
    FeaturePrefsStore.batch2141.v2141prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2141: presented mode
internal fun PlayerActivity.showV2141PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141presented
    FeaturePrefsStore.batch2141.v2141presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2141: preserved mode
internal fun PlayerActivity.showV2141PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2141preserved
    FeaturePrefsStore.batch2141.v2141preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2142: populated mode
internal fun PlayerActivity.showV2142PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142populated
    FeaturePrefsStore.batch2141.v2142populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2142: posed mode
internal fun PlayerActivity.showV2142PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142posed
    FeaturePrefsStore.batch2141.v2142posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2142: positioned mode
internal fun PlayerActivity.showV2142PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142positioned
    FeaturePrefsStore.batch2141.v2142positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2142: possessed mode
internal fun PlayerActivity.showV2142PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142possessed
    FeaturePrefsStore.batch2141.v2142possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2142: posted mode
internal fun PlayerActivity.showV2142PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142posted
    FeaturePrefsStore.batch2141.v2142posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2142: potentiated level
internal fun PlayerActivity.showV2142PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2142: powered level
internal fun PlayerActivity.showV2142PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2142: practiced level
internal fun PlayerActivity.showV2142PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2142: praised level
internal fun PlayerActivity.showV2142PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2142: predicted level
internal fun PlayerActivity.showV2142PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2142predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2142predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2142: preferred mode
internal fun PlayerActivity.showV2142PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2142preferred
    FeaturePrefsStore.batch2141.v2142preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2142: prepared mode
internal fun PlayerActivity.showV2142PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142prepared
    FeaturePrefsStore.batch2141.v2142prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2142: prescribed mode
internal fun PlayerActivity.showV2142PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142prescribed
    FeaturePrefsStore.batch2141.v2142prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2142: presented mode
internal fun PlayerActivity.showV2142PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142presented
    FeaturePrefsStore.batch2141.v2142presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2142: preserved mode
internal fun PlayerActivity.showV2142PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2142preserved
    FeaturePrefsStore.batch2141.v2142preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2143: populated mode
internal fun PlayerActivity.showV2143PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143populated
    FeaturePrefsStore.batch2141.v2143populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2143: posed mode
internal fun PlayerActivity.showV2143PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143posed
    FeaturePrefsStore.batch2141.v2143posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2143: positioned mode
internal fun PlayerActivity.showV2143PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143positioned
    FeaturePrefsStore.batch2141.v2143positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2143: possessed mode
internal fun PlayerActivity.showV2143PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143possessed
    FeaturePrefsStore.batch2141.v2143possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2143: posted mode
internal fun PlayerActivity.showV2143PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143posted
    FeaturePrefsStore.batch2141.v2143posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2143: potentiated level
internal fun PlayerActivity.showV2143PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2143: powered level
internal fun PlayerActivity.showV2143PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2143: practiced level
internal fun PlayerActivity.showV2143PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2143: praised level
internal fun PlayerActivity.showV2143PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2143: predicted level
internal fun PlayerActivity.showV2143PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2143predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2143predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2143: preferred mode
internal fun PlayerActivity.showV2143PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2143preferred
    FeaturePrefsStore.batch2141.v2143preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2143: prepared mode
internal fun PlayerActivity.showV2143PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143prepared
    FeaturePrefsStore.batch2141.v2143prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2143: prescribed mode
internal fun PlayerActivity.showV2143PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143prescribed
    FeaturePrefsStore.batch2141.v2143prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2143: presented mode
internal fun PlayerActivity.showV2143PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143presented
    FeaturePrefsStore.batch2141.v2143presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2143: preserved mode
internal fun PlayerActivity.showV2143PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2143preserved
    FeaturePrefsStore.batch2141.v2143preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2144: populated mode
internal fun PlayerActivity.showV2144PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144populated
    FeaturePrefsStore.batch2141.v2144populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2144: posed mode
internal fun PlayerActivity.showV2144PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144posed
    FeaturePrefsStore.batch2141.v2144posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2144: positioned mode
internal fun PlayerActivity.showV2144PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144positioned
    FeaturePrefsStore.batch2141.v2144positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2144: possessed mode
internal fun PlayerActivity.showV2144PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144possessed
    FeaturePrefsStore.batch2141.v2144possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2144: posted mode
internal fun PlayerActivity.showV2144PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144posted
    FeaturePrefsStore.batch2141.v2144posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2144: potentiated level
internal fun PlayerActivity.showV2144PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2144: powered level
internal fun PlayerActivity.showV2144PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2144: practiced level
internal fun PlayerActivity.showV2144PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2144: praised level
internal fun PlayerActivity.showV2144PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2144: predicted level
internal fun PlayerActivity.showV2144PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2144predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2144predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2144: preferred mode
internal fun PlayerActivity.showV2144PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2144preferred
    FeaturePrefsStore.batch2141.v2144preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2144: prepared mode
internal fun PlayerActivity.showV2144PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144prepared
    FeaturePrefsStore.batch2141.v2144prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2144: prescribed mode
internal fun PlayerActivity.showV2144PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144prescribed
    FeaturePrefsStore.batch2141.v2144prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2144: presented mode
internal fun PlayerActivity.showV2144PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144presented
    FeaturePrefsStore.batch2141.v2144presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2144: preserved mode
internal fun PlayerActivity.showV2144PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2144preserved
    FeaturePrefsStore.batch2141.v2144preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2145: populated mode
internal fun PlayerActivity.showV2145PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145populated
    FeaturePrefsStore.batch2141.v2145populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2145: posed mode
internal fun PlayerActivity.showV2145PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145posed
    FeaturePrefsStore.batch2141.v2145posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2145: positioned mode
internal fun PlayerActivity.showV2145PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145positioned
    FeaturePrefsStore.batch2141.v2145positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2145: possessed mode
internal fun PlayerActivity.showV2145PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145possessed
    FeaturePrefsStore.batch2141.v2145possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2145: posted mode
internal fun PlayerActivity.showV2145PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145posted
    FeaturePrefsStore.batch2141.v2145posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2145: potentiated level
internal fun PlayerActivity.showV2145PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2145: powered level
internal fun PlayerActivity.showV2145PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2145: practiced level
internal fun PlayerActivity.showV2145PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2145: praised level
internal fun PlayerActivity.showV2145PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2145: predicted level
internal fun PlayerActivity.showV2145PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2145predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2145predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2145: preferred mode
internal fun PlayerActivity.showV2145PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2145preferred
    FeaturePrefsStore.batch2141.v2145preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2145: prepared mode
internal fun PlayerActivity.showV2145PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145prepared
    FeaturePrefsStore.batch2141.v2145prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2145: prescribed mode
internal fun PlayerActivity.showV2145PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145prescribed
    FeaturePrefsStore.batch2141.v2145prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2145: presented mode
internal fun PlayerActivity.showV2145PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145presented
    FeaturePrefsStore.batch2141.v2145presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2145: preserved mode
internal fun PlayerActivity.showV2145PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2145preserved
    FeaturePrefsStore.batch2141.v2145preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2146: populated mode
internal fun PlayerActivity.showV2146PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146populated
    FeaturePrefsStore.batch2141.v2146populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2146: posed mode
internal fun PlayerActivity.showV2146PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146posed
    FeaturePrefsStore.batch2141.v2146posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2146: positioned mode
internal fun PlayerActivity.showV2146PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146positioned
    FeaturePrefsStore.batch2141.v2146positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2146: possessed mode
internal fun PlayerActivity.showV2146PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146possessed
    FeaturePrefsStore.batch2141.v2146possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2146: posted mode
internal fun PlayerActivity.showV2146PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146posted
    FeaturePrefsStore.batch2141.v2146posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2146: potentiated level
internal fun PlayerActivity.showV2146PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2146: powered level
internal fun PlayerActivity.showV2146PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2146: practiced level
internal fun PlayerActivity.showV2146PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2146: praised level
internal fun PlayerActivity.showV2146PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2146: predicted level
internal fun PlayerActivity.showV2146PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2146predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2146predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2146: preferred mode
internal fun PlayerActivity.showV2146PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2146preferred
    FeaturePrefsStore.batch2141.v2146preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2146: prepared mode
internal fun PlayerActivity.showV2146PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146prepared
    FeaturePrefsStore.batch2141.v2146prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2146: prescribed mode
internal fun PlayerActivity.showV2146PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146prescribed
    FeaturePrefsStore.batch2141.v2146prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2146: presented mode
internal fun PlayerActivity.showV2146PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146presented
    FeaturePrefsStore.batch2141.v2146presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2146: preserved mode
internal fun PlayerActivity.showV2146PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2146preserved
    FeaturePrefsStore.batch2141.v2146preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2147: populated mode
internal fun PlayerActivity.showV2147PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147populated
    FeaturePrefsStore.batch2141.v2147populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2147: posed mode
internal fun PlayerActivity.showV2147PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147posed
    FeaturePrefsStore.batch2141.v2147posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2147: positioned mode
internal fun PlayerActivity.showV2147PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147positioned
    FeaturePrefsStore.batch2141.v2147positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2147: possessed mode
internal fun PlayerActivity.showV2147PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147possessed
    FeaturePrefsStore.batch2141.v2147possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2147: posted mode
internal fun PlayerActivity.showV2147PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147posted
    FeaturePrefsStore.batch2141.v2147posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2147: potentiated level
internal fun PlayerActivity.showV2147PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2147: powered level
internal fun PlayerActivity.showV2147PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2147: practiced level
internal fun PlayerActivity.showV2147PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2147: praised level
internal fun PlayerActivity.showV2147PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2147: predicted level
internal fun PlayerActivity.showV2147PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2147predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2147predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2147: preferred mode
internal fun PlayerActivity.showV2147PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2147preferred
    FeaturePrefsStore.batch2141.v2147preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2147: prepared mode
internal fun PlayerActivity.showV2147PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147prepared
    FeaturePrefsStore.batch2141.v2147prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2147: prescribed mode
internal fun PlayerActivity.showV2147PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147prescribed
    FeaturePrefsStore.batch2141.v2147prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2147: presented mode
internal fun PlayerActivity.showV2147PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147presented
    FeaturePrefsStore.batch2141.v2147presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2147: preserved mode
internal fun PlayerActivity.showV2147PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2147preserved
    FeaturePrefsStore.batch2141.v2147preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2148: populated mode
internal fun PlayerActivity.showV2148PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148populated
    FeaturePrefsStore.batch2141.v2148populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2148: posed mode
internal fun PlayerActivity.showV2148PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148posed
    FeaturePrefsStore.batch2141.v2148posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2148: positioned mode
internal fun PlayerActivity.showV2148PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148positioned
    FeaturePrefsStore.batch2141.v2148positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2148: possessed mode
internal fun PlayerActivity.showV2148PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148possessed
    FeaturePrefsStore.batch2141.v2148possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2148: posted mode
internal fun PlayerActivity.showV2148PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148posted
    FeaturePrefsStore.batch2141.v2148posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2148: potentiated level
internal fun PlayerActivity.showV2148PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2148: powered level
internal fun PlayerActivity.showV2148PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2148: practiced level
internal fun PlayerActivity.showV2148PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2148: praised level
internal fun PlayerActivity.showV2148PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2148: predicted level
internal fun PlayerActivity.showV2148PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2148predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2148predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2148: preferred mode
internal fun PlayerActivity.showV2148PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2148preferred
    FeaturePrefsStore.batch2141.v2148preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2148: prepared mode
internal fun PlayerActivity.showV2148PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148prepared
    FeaturePrefsStore.batch2141.v2148prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2148: prescribed mode
internal fun PlayerActivity.showV2148PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148prescribed
    FeaturePrefsStore.batch2141.v2148prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2148: presented mode
internal fun PlayerActivity.showV2148PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148presented
    FeaturePrefsStore.batch2141.v2148presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2148: preserved mode
internal fun PlayerActivity.showV2148PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2148preserved
    FeaturePrefsStore.batch2141.v2148preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2149: populated mode
internal fun PlayerActivity.showV2149PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149populated
    FeaturePrefsStore.batch2141.v2149populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2149: posed mode
internal fun PlayerActivity.showV2149PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149posed
    FeaturePrefsStore.batch2141.v2149posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2149: positioned mode
internal fun PlayerActivity.showV2149PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149positioned
    FeaturePrefsStore.batch2141.v2149positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2149: possessed mode
internal fun PlayerActivity.showV2149PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149possessed
    FeaturePrefsStore.batch2141.v2149possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2149: posted mode
internal fun PlayerActivity.showV2149PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149posted
    FeaturePrefsStore.batch2141.v2149posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2149: potentiated level
internal fun PlayerActivity.showV2149PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2149: powered level
internal fun PlayerActivity.showV2149PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2149: practiced level
internal fun PlayerActivity.showV2149PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2149: praised level
internal fun PlayerActivity.showV2149PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2149: predicted level
internal fun PlayerActivity.showV2149PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2149predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2149predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2149: preferred mode
internal fun PlayerActivity.showV2149PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2149preferred
    FeaturePrefsStore.batch2141.v2149preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2149: prepared mode
internal fun PlayerActivity.showV2149PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149prepared
    FeaturePrefsStore.batch2141.v2149prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2149: prescribed mode
internal fun PlayerActivity.showV2149PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149prescribed
    FeaturePrefsStore.batch2141.v2149prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2149: presented mode
internal fun PlayerActivity.showV2149PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149presented
    FeaturePrefsStore.batch2141.v2149presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2149: preserved mode
internal fun PlayerActivity.showV2149PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2149preserved
    FeaturePrefsStore.batch2141.v2149preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

// v2150: populated mode
internal fun PlayerActivity.showV2150PopulatedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150populated
    FeaturePrefsStore.batch2141.v2150populated = !current
    AppToast.show(this, "populated: ${if (!current) "ON" else "OFF"}")
}

// v2150: posed mode
internal fun PlayerActivity.showV2150PosedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150posed
    FeaturePrefsStore.batch2141.v2150posed = !current
    AppToast.show(this, "posed: ${if (!current) "ON" else "OFF"}")
}

// v2150: positioned mode
internal fun PlayerActivity.showV2150PositionedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150positioned
    FeaturePrefsStore.batch2141.v2150positioned = !current
    AppToast.show(this, "positioned: ${if (!current) "ON" else "OFF"}")
}

// v2150: possessed mode
internal fun PlayerActivity.showV2150PossessedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150possessed
    FeaturePrefsStore.batch2141.v2150possessed = !current
    AppToast.show(this, "possessed: ${if (!current) "ON" else "OFF"}")
}

// v2150: posted mode
internal fun PlayerActivity.showV2150PostedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150posted
    FeaturePrefsStore.batch2141.v2150posted = !current
    AppToast.show(this, "posted: ${if (!current) "ON" else "OFF"}")
}

// v2150: potentiated level
internal fun PlayerActivity.showV2150PotentiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150potentiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potentiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150potentiated = value
        AppToast.show(this, "potentiated: $value")
    }
}

// v2150: powered level
internal fun PlayerActivity.showV2150PoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150powered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "powered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150powered = value
        AppToast.show(this, "powered: $value")
    }
}

// v2150: practiced level
internal fun PlayerActivity.showV2150PracticedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150practiced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "practiced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150practiced = value
        AppToast.show(this, "practiced: $value")
    }
}

// v2150: praised level
internal fun PlayerActivity.showV2150PraisedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150praised).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "praised level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150praised = value
        AppToast.show(this, "praised: $value")
    }
}

// v2150: predicted level
internal fun PlayerActivity.showV2150PredictedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2141.v2150predicted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "predicted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2141.v2150predicted = value
        AppToast.show(this, "predicted: $value")
    }
}

// v2150: preferred mode
internal fun PlayerActivity.showV2150PreferredToggle() {
    val current = FeaturePrefsStore.batch2141.v2150preferred
    FeaturePrefsStore.batch2141.v2150preferred = !current
    AppToast.show(this, "preferred: ${if (!current) "ON" else "OFF"}")
}

// v2150: prepared mode
internal fun PlayerActivity.showV2150PreparedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150prepared
    FeaturePrefsStore.batch2141.v2150prepared = !current
    AppToast.show(this, "prepared: ${if (!current) "ON" else "OFF"}")
}

// v2150: prescribed mode
internal fun PlayerActivity.showV2150PrescribedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150prescribed
    FeaturePrefsStore.batch2141.v2150prescribed = !current
    AppToast.show(this, "prescribed: ${if (!current) "ON" else "OFF"}")
}

// v2150: presented mode
internal fun PlayerActivity.showV2150PresentedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150presented
    FeaturePrefsStore.batch2141.v2150presented = !current
    AppToast.show(this, "presented: ${if (!current) "ON" else "OFF"}")
}

// v2150: preserved mode
internal fun PlayerActivity.showV2150PreservedToggle() {
    val current = FeaturePrefsStore.batch2141.v2150preserved
    FeaturePrefsStore.batch2141.v2150preserved = !current
    AppToast.show(this, "preserved: ${if (!current) "ON" else "OFF"}")
}

