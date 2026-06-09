package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2211: restricted mode
internal fun PlayerActivity.showV2211RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211restricted
    FeaturePrefsStore.batch2211.v2211restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2211: restructured mode
internal fun PlayerActivity.showV2211RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2211restructured
    FeaturePrefsStore.batch2211.v2211restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2211: resulted mode
internal fun PlayerActivity.showV2211ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211resulted
    FeaturePrefsStore.batch2211.v2211resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2211: retained mode
internal fun PlayerActivity.showV2211RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211retained
    FeaturePrefsStore.batch2211.v2211retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2211: retired mode
internal fun PlayerActivity.showV2211RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2211retired
    FeaturePrefsStore.batch2211.v2211retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2211: retrieved level
internal fun PlayerActivity.showV2211RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2211retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2211retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2211: returned level
internal fun PlayerActivity.showV2211ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2211returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2211returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2211: revealed level
internal fun PlayerActivity.showV2211RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2211revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2211revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2211: reversed level
internal fun PlayerActivity.showV2211ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2211reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2211reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2211: reviewed level
internal fun PlayerActivity.showV2211ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2211reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2211reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2211: revised mode
internal fun PlayerActivity.showV2211RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211revised
    FeaturePrefsStore.batch2211.v2211revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2211: revoked mode
internal fun PlayerActivity.showV2211RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211revoked
    FeaturePrefsStore.batch2211.v2211revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2211: rewarded mode
internal fun PlayerActivity.showV2211RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211rewarded
    FeaturePrefsStore.batch2211.v2211rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2211: risked mode
internal fun PlayerActivity.showV2211RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211risked
    FeaturePrefsStore.batch2211.v2211risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2211: routed mode
internal fun PlayerActivity.showV2211RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2211routed
    FeaturePrefsStore.batch2211.v2211routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2212: restricted mode
internal fun PlayerActivity.showV2212RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212restricted
    FeaturePrefsStore.batch2211.v2212restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2212: restructured mode
internal fun PlayerActivity.showV2212RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2212restructured
    FeaturePrefsStore.batch2211.v2212restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2212: resulted mode
internal fun PlayerActivity.showV2212ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212resulted
    FeaturePrefsStore.batch2211.v2212resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2212: retained mode
internal fun PlayerActivity.showV2212RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212retained
    FeaturePrefsStore.batch2211.v2212retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2212: retired mode
internal fun PlayerActivity.showV2212RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2212retired
    FeaturePrefsStore.batch2211.v2212retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2212: retrieved level
internal fun PlayerActivity.showV2212RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2212retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2212retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2212: returned level
internal fun PlayerActivity.showV2212ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2212returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2212returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2212: revealed level
internal fun PlayerActivity.showV2212RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2212revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2212revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2212: reversed level
internal fun PlayerActivity.showV2212ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2212reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2212reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2212: reviewed level
internal fun PlayerActivity.showV2212ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2212reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2212reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2212: revised mode
internal fun PlayerActivity.showV2212RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212revised
    FeaturePrefsStore.batch2211.v2212revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2212: revoked mode
internal fun PlayerActivity.showV2212RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212revoked
    FeaturePrefsStore.batch2211.v2212revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2212: rewarded mode
internal fun PlayerActivity.showV2212RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212rewarded
    FeaturePrefsStore.batch2211.v2212rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2212: risked mode
internal fun PlayerActivity.showV2212RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212risked
    FeaturePrefsStore.batch2211.v2212risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2212: routed mode
internal fun PlayerActivity.showV2212RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2212routed
    FeaturePrefsStore.batch2211.v2212routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2213: restricted mode
internal fun PlayerActivity.showV2213RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213restricted
    FeaturePrefsStore.batch2211.v2213restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2213: restructured mode
internal fun PlayerActivity.showV2213RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2213restructured
    FeaturePrefsStore.batch2211.v2213restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2213: resulted mode
internal fun PlayerActivity.showV2213ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213resulted
    FeaturePrefsStore.batch2211.v2213resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2213: retained mode
internal fun PlayerActivity.showV2213RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213retained
    FeaturePrefsStore.batch2211.v2213retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2213: retired mode
internal fun PlayerActivity.showV2213RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2213retired
    FeaturePrefsStore.batch2211.v2213retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2213: retrieved level
internal fun PlayerActivity.showV2213RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2213retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2213retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2213: returned level
internal fun PlayerActivity.showV2213ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2213returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2213returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2213: revealed level
internal fun PlayerActivity.showV2213RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2213revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2213revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2213: reversed level
internal fun PlayerActivity.showV2213ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2213reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2213reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2213: reviewed level
internal fun PlayerActivity.showV2213ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2213reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2213reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2213: revised mode
internal fun PlayerActivity.showV2213RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213revised
    FeaturePrefsStore.batch2211.v2213revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2213: revoked mode
internal fun PlayerActivity.showV2213RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213revoked
    FeaturePrefsStore.batch2211.v2213revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2213: rewarded mode
internal fun PlayerActivity.showV2213RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213rewarded
    FeaturePrefsStore.batch2211.v2213rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2213: risked mode
internal fun PlayerActivity.showV2213RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213risked
    FeaturePrefsStore.batch2211.v2213risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2213: routed mode
internal fun PlayerActivity.showV2213RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2213routed
    FeaturePrefsStore.batch2211.v2213routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2214: restricted mode
internal fun PlayerActivity.showV2214RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214restricted
    FeaturePrefsStore.batch2211.v2214restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2214: restructured mode
internal fun PlayerActivity.showV2214RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2214restructured
    FeaturePrefsStore.batch2211.v2214restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2214: resulted mode
internal fun PlayerActivity.showV2214ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214resulted
    FeaturePrefsStore.batch2211.v2214resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2214: retained mode
internal fun PlayerActivity.showV2214RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214retained
    FeaturePrefsStore.batch2211.v2214retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2214: retired mode
internal fun PlayerActivity.showV2214RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2214retired
    FeaturePrefsStore.batch2211.v2214retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2214: retrieved level
internal fun PlayerActivity.showV2214RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2214retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2214retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2214: returned level
internal fun PlayerActivity.showV2214ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2214returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2214returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2214: revealed level
internal fun PlayerActivity.showV2214RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2214revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2214revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2214: reversed level
internal fun PlayerActivity.showV2214ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2214reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2214reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2214: reviewed level
internal fun PlayerActivity.showV2214ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2214reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2214reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2214: revised mode
internal fun PlayerActivity.showV2214RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214revised
    FeaturePrefsStore.batch2211.v2214revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2214: revoked mode
internal fun PlayerActivity.showV2214RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214revoked
    FeaturePrefsStore.batch2211.v2214revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2214: rewarded mode
internal fun PlayerActivity.showV2214RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214rewarded
    FeaturePrefsStore.batch2211.v2214rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2214: risked mode
internal fun PlayerActivity.showV2214RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214risked
    FeaturePrefsStore.batch2211.v2214risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2214: routed mode
internal fun PlayerActivity.showV2214RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2214routed
    FeaturePrefsStore.batch2211.v2214routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2215: restricted mode
internal fun PlayerActivity.showV2215RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215restricted
    FeaturePrefsStore.batch2211.v2215restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2215: restructured mode
internal fun PlayerActivity.showV2215RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2215restructured
    FeaturePrefsStore.batch2211.v2215restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2215: resulted mode
internal fun PlayerActivity.showV2215ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215resulted
    FeaturePrefsStore.batch2211.v2215resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2215: retained mode
internal fun PlayerActivity.showV2215RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215retained
    FeaturePrefsStore.batch2211.v2215retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2215: retired mode
internal fun PlayerActivity.showV2215RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2215retired
    FeaturePrefsStore.batch2211.v2215retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2215: retrieved level
internal fun PlayerActivity.showV2215RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2215retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2215retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2215: returned level
internal fun PlayerActivity.showV2215ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2215returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2215returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2215: revealed level
internal fun PlayerActivity.showV2215RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2215revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2215revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2215: reversed level
internal fun PlayerActivity.showV2215ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2215reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2215reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2215: reviewed level
internal fun PlayerActivity.showV2215ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2215reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2215reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2215: revised mode
internal fun PlayerActivity.showV2215RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215revised
    FeaturePrefsStore.batch2211.v2215revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2215: revoked mode
internal fun PlayerActivity.showV2215RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215revoked
    FeaturePrefsStore.batch2211.v2215revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2215: rewarded mode
internal fun PlayerActivity.showV2215RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215rewarded
    FeaturePrefsStore.batch2211.v2215rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2215: risked mode
internal fun PlayerActivity.showV2215RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215risked
    FeaturePrefsStore.batch2211.v2215risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2215: routed mode
internal fun PlayerActivity.showV2215RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2215routed
    FeaturePrefsStore.batch2211.v2215routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2216: restricted mode
internal fun PlayerActivity.showV2216RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216restricted
    FeaturePrefsStore.batch2211.v2216restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2216: restructured mode
internal fun PlayerActivity.showV2216RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2216restructured
    FeaturePrefsStore.batch2211.v2216restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2216: resulted mode
internal fun PlayerActivity.showV2216ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216resulted
    FeaturePrefsStore.batch2211.v2216resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2216: retained mode
internal fun PlayerActivity.showV2216RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216retained
    FeaturePrefsStore.batch2211.v2216retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2216: retired mode
internal fun PlayerActivity.showV2216RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2216retired
    FeaturePrefsStore.batch2211.v2216retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2216: retrieved level
internal fun PlayerActivity.showV2216RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2216retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2216retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2216: returned level
internal fun PlayerActivity.showV2216ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2216returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2216returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2216: revealed level
internal fun PlayerActivity.showV2216RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2216revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2216revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2216: reversed level
internal fun PlayerActivity.showV2216ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2216reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2216reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2216: reviewed level
internal fun PlayerActivity.showV2216ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2216reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2216reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2216: revised mode
internal fun PlayerActivity.showV2216RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216revised
    FeaturePrefsStore.batch2211.v2216revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2216: revoked mode
internal fun PlayerActivity.showV2216RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216revoked
    FeaturePrefsStore.batch2211.v2216revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2216: rewarded mode
internal fun PlayerActivity.showV2216RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216rewarded
    FeaturePrefsStore.batch2211.v2216rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2216: risked mode
internal fun PlayerActivity.showV2216RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216risked
    FeaturePrefsStore.batch2211.v2216risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2216: routed mode
internal fun PlayerActivity.showV2216RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2216routed
    FeaturePrefsStore.batch2211.v2216routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2217: restricted mode
internal fun PlayerActivity.showV2217RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217restricted
    FeaturePrefsStore.batch2211.v2217restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2217: restructured mode
internal fun PlayerActivity.showV2217RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2217restructured
    FeaturePrefsStore.batch2211.v2217restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2217: resulted mode
internal fun PlayerActivity.showV2217ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217resulted
    FeaturePrefsStore.batch2211.v2217resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2217: retained mode
internal fun PlayerActivity.showV2217RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217retained
    FeaturePrefsStore.batch2211.v2217retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2217: retired mode
internal fun PlayerActivity.showV2217RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2217retired
    FeaturePrefsStore.batch2211.v2217retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2217: retrieved level
internal fun PlayerActivity.showV2217RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2217retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2217retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2217: returned level
internal fun PlayerActivity.showV2217ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2217returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2217returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2217: revealed level
internal fun PlayerActivity.showV2217RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2217revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2217revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2217: reversed level
internal fun PlayerActivity.showV2217ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2217reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2217reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2217: reviewed level
internal fun PlayerActivity.showV2217ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2217reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2217reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2217: revised mode
internal fun PlayerActivity.showV2217RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217revised
    FeaturePrefsStore.batch2211.v2217revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2217: revoked mode
internal fun PlayerActivity.showV2217RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217revoked
    FeaturePrefsStore.batch2211.v2217revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2217: rewarded mode
internal fun PlayerActivity.showV2217RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217rewarded
    FeaturePrefsStore.batch2211.v2217rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2217: risked mode
internal fun PlayerActivity.showV2217RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217risked
    FeaturePrefsStore.batch2211.v2217risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2217: routed mode
internal fun PlayerActivity.showV2217RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2217routed
    FeaturePrefsStore.batch2211.v2217routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2218: restricted mode
internal fun PlayerActivity.showV2218RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218restricted
    FeaturePrefsStore.batch2211.v2218restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2218: restructured mode
internal fun PlayerActivity.showV2218RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2218restructured
    FeaturePrefsStore.batch2211.v2218restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2218: resulted mode
internal fun PlayerActivity.showV2218ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218resulted
    FeaturePrefsStore.batch2211.v2218resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2218: retained mode
internal fun PlayerActivity.showV2218RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218retained
    FeaturePrefsStore.batch2211.v2218retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2218: retired mode
internal fun PlayerActivity.showV2218RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2218retired
    FeaturePrefsStore.batch2211.v2218retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2218: retrieved level
internal fun PlayerActivity.showV2218RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2218retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2218retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2218: returned level
internal fun PlayerActivity.showV2218ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2218returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2218returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2218: revealed level
internal fun PlayerActivity.showV2218RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2218revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2218revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2218: reversed level
internal fun PlayerActivity.showV2218ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2218reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2218reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2218: reviewed level
internal fun PlayerActivity.showV2218ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2218reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2218reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2218: revised mode
internal fun PlayerActivity.showV2218RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218revised
    FeaturePrefsStore.batch2211.v2218revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2218: revoked mode
internal fun PlayerActivity.showV2218RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218revoked
    FeaturePrefsStore.batch2211.v2218revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2218: rewarded mode
internal fun PlayerActivity.showV2218RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218rewarded
    FeaturePrefsStore.batch2211.v2218rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2218: risked mode
internal fun PlayerActivity.showV2218RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218risked
    FeaturePrefsStore.batch2211.v2218risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2218: routed mode
internal fun PlayerActivity.showV2218RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2218routed
    FeaturePrefsStore.batch2211.v2218routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2219: restricted mode
internal fun PlayerActivity.showV2219RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219restricted
    FeaturePrefsStore.batch2211.v2219restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2219: restructured mode
internal fun PlayerActivity.showV2219RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2219restructured
    FeaturePrefsStore.batch2211.v2219restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2219: resulted mode
internal fun PlayerActivity.showV2219ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219resulted
    FeaturePrefsStore.batch2211.v2219resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2219: retained mode
internal fun PlayerActivity.showV2219RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219retained
    FeaturePrefsStore.batch2211.v2219retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2219: retired mode
internal fun PlayerActivity.showV2219RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2219retired
    FeaturePrefsStore.batch2211.v2219retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2219: retrieved level
internal fun PlayerActivity.showV2219RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2219retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2219retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2219: returned level
internal fun PlayerActivity.showV2219ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2219returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2219returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2219: revealed level
internal fun PlayerActivity.showV2219RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2219revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2219revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2219: reversed level
internal fun PlayerActivity.showV2219ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2219reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2219reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2219: reviewed level
internal fun PlayerActivity.showV2219ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2219reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2219reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2219: revised mode
internal fun PlayerActivity.showV2219RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219revised
    FeaturePrefsStore.batch2211.v2219revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2219: revoked mode
internal fun PlayerActivity.showV2219RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219revoked
    FeaturePrefsStore.batch2211.v2219revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2219: rewarded mode
internal fun PlayerActivity.showV2219RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219rewarded
    FeaturePrefsStore.batch2211.v2219rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2219: risked mode
internal fun PlayerActivity.showV2219RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219risked
    FeaturePrefsStore.batch2211.v2219risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2219: routed mode
internal fun PlayerActivity.showV2219RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2219routed
    FeaturePrefsStore.batch2211.v2219routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

// v2220: restricted mode
internal fun PlayerActivity.showV2220RestrictedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220restricted
    FeaturePrefsStore.batch2211.v2220restricted = !current
    AppToast.show(this, "restricted: ${if (!current) "ON" else "OFF"}")
}

// v2220: restructured mode
internal fun PlayerActivity.showV2220RestructuredToggle() {
    val current = FeaturePrefsStore.batch2211.v2220restructured
    FeaturePrefsStore.batch2211.v2220restructured = !current
    AppToast.show(this, "restructured: ${if (!current) "ON" else "OFF"}")
}

// v2220: resulted mode
internal fun PlayerActivity.showV2220ResultedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220resulted
    FeaturePrefsStore.batch2211.v2220resulted = !current
    AppToast.show(this, "resulted: ${if (!current) "ON" else "OFF"}")
}

// v2220: retained mode
internal fun PlayerActivity.showV2220RetainedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220retained
    FeaturePrefsStore.batch2211.v2220retained = !current
    AppToast.show(this, "retained: ${if (!current) "ON" else "OFF"}")
}

// v2220: retired mode
internal fun PlayerActivity.showV2220RetiredToggle() {
    val current = FeaturePrefsStore.batch2211.v2220retired
    FeaturePrefsStore.batch2211.v2220retired = !current
    AppToast.show(this, "retired: ${if (!current) "ON" else "OFF"}")
}

// v2220: retrieved level
internal fun PlayerActivity.showV2220RetrievedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2220retrieved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "retrieved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2220retrieved = value
        AppToast.show(this, "retrieved: $value")
    }
}

// v2220: returned level
internal fun PlayerActivity.showV2220ReturnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2220returned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "returned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2220returned = value
        AppToast.show(this, "returned: $value")
    }
}

// v2220: revealed level
internal fun PlayerActivity.showV2220RevealedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2220revealed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "revealed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2220revealed = value
        AppToast.show(this, "revealed: $value")
    }
}

// v2220: reversed level
internal fun PlayerActivity.showV2220ReversedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2220reversed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reversed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2220reversed = value
        AppToast.show(this, "reversed: $value")
    }
}

// v2220: reviewed level
internal fun PlayerActivity.showV2220ReviewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2211.v2220reviewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reviewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2211.v2220reviewed = value
        AppToast.show(this, "reviewed: $value")
    }
}

// v2220: revised mode
internal fun PlayerActivity.showV2220RevisedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220revised
    FeaturePrefsStore.batch2211.v2220revised = !current
    AppToast.show(this, "revised: ${if (!current) "ON" else "OFF"}")
}

// v2220: revoked mode
internal fun PlayerActivity.showV2220RevokedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220revoked
    FeaturePrefsStore.batch2211.v2220revoked = !current
    AppToast.show(this, "revoked: ${if (!current) "ON" else "OFF"}")
}

// v2220: rewarded mode
internal fun PlayerActivity.showV2220RewardedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220rewarded
    FeaturePrefsStore.batch2211.v2220rewarded = !current
    AppToast.show(this, "rewarded: ${if (!current) "ON" else "OFF"}")
}

// v2220: risked mode
internal fun PlayerActivity.showV2220RiskedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220risked
    FeaturePrefsStore.batch2211.v2220risked = !current
    AppToast.show(this, "risked: ${if (!current) "ON" else "OFF"}")
}

// v2220: routed mode
internal fun PlayerActivity.showV2220RoutedToggle() {
    val current = FeaturePrefsStore.batch2211.v2220routed
    FeaturePrefsStore.batch2211.v2220routed = !current
    AppToast.show(this, "routed: ${if (!current) "ON" else "OFF"}")
}

