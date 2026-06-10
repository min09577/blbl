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

// v2221: ruined mode
internal fun PlayerActivity.showV2221RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221ruined
    FeaturePrefsStore.batch2221.v2221ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2221: sacrificed mode
internal fun PlayerActivity.showV2221SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221sacrificed
    FeaturePrefsStore.batch2221.v2221sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2221: safeguarded mode
internal fun PlayerActivity.showV2221SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221safeguarded
    FeaturePrefsStore.batch2221.v2221safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2221: sampled mode
internal fun PlayerActivity.showV2221SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2221sampled
    FeaturePrefsStore.batch2221.v2221sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2221: satisfied mode
internal fun PlayerActivity.showV2221SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221satisfied
    FeaturePrefsStore.batch2221.v2221satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2221: saved level
internal fun PlayerActivity.showV2221SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2221: scaled level
internal fun PlayerActivity.showV2221ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2221: scanned level
internal fun PlayerActivity.showV2221ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2221: scared level
internal fun PlayerActivity.showV2221ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2221: scheduled level
internal fun PlayerActivity.showV2221ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2221: scattered mode
internal fun PlayerActivity.showV2221ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2221scattered
    FeaturePrefsStore.batch2221.v2221scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2221: sculpted mode
internal fun PlayerActivity.showV2221SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221sculpted
    FeaturePrefsStore.batch2221.v2221sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2221: searched mode
internal fun PlayerActivity.showV2221SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221searched
    FeaturePrefsStore.batch2221.v2221searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2221: seasoned mode
internal fun PlayerActivity.showV2221SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221seasoned
    FeaturePrefsStore.batch2221.v2221seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2221: secured mode
internal fun PlayerActivity.showV2221SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2221secured
    FeaturePrefsStore.batch2221.v2221secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2222: ruined mode
internal fun PlayerActivity.showV2222RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222ruined
    FeaturePrefsStore.batch2221.v2222ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2222: sacrificed mode
internal fun PlayerActivity.showV2222SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222sacrificed
    FeaturePrefsStore.batch2221.v2222sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2222: safeguarded mode
internal fun PlayerActivity.showV2222SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222safeguarded
    FeaturePrefsStore.batch2221.v2222safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2222: sampled mode
internal fun PlayerActivity.showV2222SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2222sampled
    FeaturePrefsStore.batch2221.v2222sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2222: satisfied mode
internal fun PlayerActivity.showV2222SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222satisfied
    FeaturePrefsStore.batch2221.v2222satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2222: saved level
internal fun PlayerActivity.showV2222SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2222: scaled level
internal fun PlayerActivity.showV2222ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2222: scanned level
internal fun PlayerActivity.showV2222ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2222: scared level
internal fun PlayerActivity.showV2222ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2222: scheduled level
internal fun PlayerActivity.showV2222ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2222: scattered mode
internal fun PlayerActivity.showV2222ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2222scattered
    FeaturePrefsStore.batch2221.v2222scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2222: sculpted mode
internal fun PlayerActivity.showV2222SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222sculpted
    FeaturePrefsStore.batch2221.v2222sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2222: searched mode
internal fun PlayerActivity.showV2222SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222searched
    FeaturePrefsStore.batch2221.v2222searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2222: seasoned mode
internal fun PlayerActivity.showV2222SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222seasoned
    FeaturePrefsStore.batch2221.v2222seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2222: secured mode
internal fun PlayerActivity.showV2222SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2222secured
    FeaturePrefsStore.batch2221.v2222secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2223: ruined mode
internal fun PlayerActivity.showV2223RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223ruined
    FeaturePrefsStore.batch2221.v2223ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2223: sacrificed mode
internal fun PlayerActivity.showV2223SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223sacrificed
    FeaturePrefsStore.batch2221.v2223sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2223: safeguarded mode
internal fun PlayerActivity.showV2223SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223safeguarded
    FeaturePrefsStore.batch2221.v2223safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2223: sampled mode
internal fun PlayerActivity.showV2223SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2223sampled
    FeaturePrefsStore.batch2221.v2223sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2223: satisfied mode
internal fun PlayerActivity.showV2223SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223satisfied
    FeaturePrefsStore.batch2221.v2223satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2223: saved level
internal fun PlayerActivity.showV2223SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2223: scaled level
internal fun PlayerActivity.showV2223ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2223: scanned level
internal fun PlayerActivity.showV2223ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2223: scared level
internal fun PlayerActivity.showV2223ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2223: scheduled level
internal fun PlayerActivity.showV2223ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2223: scattered mode
internal fun PlayerActivity.showV2223ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2223scattered
    FeaturePrefsStore.batch2221.v2223scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2223: sculpted mode
internal fun PlayerActivity.showV2223SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223sculpted
    FeaturePrefsStore.batch2221.v2223sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2223: searched mode
internal fun PlayerActivity.showV2223SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223searched
    FeaturePrefsStore.batch2221.v2223searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2223: seasoned mode
internal fun PlayerActivity.showV2223SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223seasoned
    FeaturePrefsStore.batch2221.v2223seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2223: secured mode
internal fun PlayerActivity.showV2223SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2223secured
    FeaturePrefsStore.batch2221.v2223secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2224: ruined mode
internal fun PlayerActivity.showV2224RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224ruined
    FeaturePrefsStore.batch2221.v2224ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2224: sacrificed mode
internal fun PlayerActivity.showV2224SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224sacrificed
    FeaturePrefsStore.batch2221.v2224sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2224: safeguarded mode
internal fun PlayerActivity.showV2224SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224safeguarded
    FeaturePrefsStore.batch2221.v2224safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2224: sampled mode
internal fun PlayerActivity.showV2224SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2224sampled
    FeaturePrefsStore.batch2221.v2224sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2224: satisfied mode
internal fun PlayerActivity.showV2224SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224satisfied
    FeaturePrefsStore.batch2221.v2224satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2224: saved level
internal fun PlayerActivity.showV2224SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2224: scaled level
internal fun PlayerActivity.showV2224ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2224: scanned level
internal fun PlayerActivity.showV2224ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2224: scared level
internal fun PlayerActivity.showV2224ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2224: scheduled level
internal fun PlayerActivity.showV2224ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2224: scattered mode
internal fun PlayerActivity.showV2224ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2224scattered
    FeaturePrefsStore.batch2221.v2224scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2224: sculpted mode
internal fun PlayerActivity.showV2224SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224sculpted
    FeaturePrefsStore.batch2221.v2224sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2224: searched mode
internal fun PlayerActivity.showV2224SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224searched
    FeaturePrefsStore.batch2221.v2224searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2224: seasoned mode
internal fun PlayerActivity.showV2224SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224seasoned
    FeaturePrefsStore.batch2221.v2224seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2224: secured mode
internal fun PlayerActivity.showV2224SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2224secured
    FeaturePrefsStore.batch2221.v2224secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2225: ruined mode
internal fun PlayerActivity.showV2225RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225ruined
    FeaturePrefsStore.batch2221.v2225ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2225: sacrificed mode
internal fun PlayerActivity.showV2225SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225sacrificed
    FeaturePrefsStore.batch2221.v2225sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2225: safeguarded mode
internal fun PlayerActivity.showV2225SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225safeguarded
    FeaturePrefsStore.batch2221.v2225safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2225: sampled mode
internal fun PlayerActivity.showV2225SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2225sampled
    FeaturePrefsStore.batch2221.v2225sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2225: satisfied mode
internal fun PlayerActivity.showV2225SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225satisfied
    FeaturePrefsStore.batch2221.v2225satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2225: saved level
internal fun PlayerActivity.showV2225SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2225: scaled level
internal fun PlayerActivity.showV2225ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2225: scanned level
internal fun PlayerActivity.showV2225ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2225: scared level
internal fun PlayerActivity.showV2225ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2225: scheduled level
internal fun PlayerActivity.showV2225ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2225: scattered mode
internal fun PlayerActivity.showV2225ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2225scattered
    FeaturePrefsStore.batch2221.v2225scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2225: sculpted mode
internal fun PlayerActivity.showV2225SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225sculpted
    FeaturePrefsStore.batch2221.v2225sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2225: searched mode
internal fun PlayerActivity.showV2225SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225searched
    FeaturePrefsStore.batch2221.v2225searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2225: seasoned mode
internal fun PlayerActivity.showV2225SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225seasoned
    FeaturePrefsStore.batch2221.v2225seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2225: secured mode
internal fun PlayerActivity.showV2225SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2225secured
    FeaturePrefsStore.batch2221.v2225secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2226: ruined mode
internal fun PlayerActivity.showV2226RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226ruined
    FeaturePrefsStore.batch2221.v2226ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2226: sacrificed mode
internal fun PlayerActivity.showV2226SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226sacrificed
    FeaturePrefsStore.batch2221.v2226sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2226: safeguarded mode
internal fun PlayerActivity.showV2226SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226safeguarded
    FeaturePrefsStore.batch2221.v2226safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2226: sampled mode
internal fun PlayerActivity.showV2226SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2226sampled
    FeaturePrefsStore.batch2221.v2226sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2226: satisfied mode
internal fun PlayerActivity.showV2226SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226satisfied
    FeaturePrefsStore.batch2221.v2226satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2226: saved level
internal fun PlayerActivity.showV2226SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2226: scaled level
internal fun PlayerActivity.showV2226ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2226: scanned level
internal fun PlayerActivity.showV2226ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2226: scared level
internal fun PlayerActivity.showV2226ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2226: scheduled level
internal fun PlayerActivity.showV2226ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2226: scattered mode
internal fun PlayerActivity.showV2226ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2226scattered
    FeaturePrefsStore.batch2221.v2226scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2226: sculpted mode
internal fun PlayerActivity.showV2226SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226sculpted
    FeaturePrefsStore.batch2221.v2226sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2226: searched mode
internal fun PlayerActivity.showV2226SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226searched
    FeaturePrefsStore.batch2221.v2226searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2226: seasoned mode
internal fun PlayerActivity.showV2226SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226seasoned
    FeaturePrefsStore.batch2221.v2226seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2226: secured mode
internal fun PlayerActivity.showV2226SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2226secured
    FeaturePrefsStore.batch2221.v2226secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2227: ruined mode
internal fun PlayerActivity.showV2227RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227ruined
    FeaturePrefsStore.batch2221.v2227ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2227: sacrificed mode
internal fun PlayerActivity.showV2227SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227sacrificed
    FeaturePrefsStore.batch2221.v2227sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2227: safeguarded mode
internal fun PlayerActivity.showV2227SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227safeguarded
    FeaturePrefsStore.batch2221.v2227safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2227: sampled mode
internal fun PlayerActivity.showV2227SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2227sampled
    FeaturePrefsStore.batch2221.v2227sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2227: satisfied mode
internal fun PlayerActivity.showV2227SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227satisfied
    FeaturePrefsStore.batch2221.v2227satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2227: saved level
internal fun PlayerActivity.showV2227SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2227: scaled level
internal fun PlayerActivity.showV2227ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2227: scanned level
internal fun PlayerActivity.showV2227ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2227: scared level
internal fun PlayerActivity.showV2227ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2227: scheduled level
internal fun PlayerActivity.showV2227ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2227: scattered mode
internal fun PlayerActivity.showV2227ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2227scattered
    FeaturePrefsStore.batch2221.v2227scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2227: sculpted mode
internal fun PlayerActivity.showV2227SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227sculpted
    FeaturePrefsStore.batch2221.v2227sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2227: searched mode
internal fun PlayerActivity.showV2227SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227searched
    FeaturePrefsStore.batch2221.v2227searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2227: seasoned mode
internal fun PlayerActivity.showV2227SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227seasoned
    FeaturePrefsStore.batch2221.v2227seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2227: secured mode
internal fun PlayerActivity.showV2227SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2227secured
    FeaturePrefsStore.batch2221.v2227secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2228: ruined mode
internal fun PlayerActivity.showV2228RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228ruined
    FeaturePrefsStore.batch2221.v2228ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2228: sacrificed mode
internal fun PlayerActivity.showV2228SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228sacrificed
    FeaturePrefsStore.batch2221.v2228sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2228: safeguarded mode
internal fun PlayerActivity.showV2228SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228safeguarded
    FeaturePrefsStore.batch2221.v2228safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2228: sampled mode
internal fun PlayerActivity.showV2228SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2228sampled
    FeaturePrefsStore.batch2221.v2228sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2228: satisfied mode
internal fun PlayerActivity.showV2228SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228satisfied
    FeaturePrefsStore.batch2221.v2228satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2228: saved level
internal fun PlayerActivity.showV2228SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2228: scaled level
internal fun PlayerActivity.showV2228ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2228: scanned level
internal fun PlayerActivity.showV2228ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2228: scared level
internal fun PlayerActivity.showV2228ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2228: scheduled level
internal fun PlayerActivity.showV2228ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2228: scattered mode
internal fun PlayerActivity.showV2228ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2228scattered
    FeaturePrefsStore.batch2221.v2228scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2228: sculpted mode
internal fun PlayerActivity.showV2228SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228sculpted
    FeaturePrefsStore.batch2221.v2228sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2228: searched mode
internal fun PlayerActivity.showV2228SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228searched
    FeaturePrefsStore.batch2221.v2228searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2228: seasoned mode
internal fun PlayerActivity.showV2228SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228seasoned
    FeaturePrefsStore.batch2221.v2228seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2228: secured mode
internal fun PlayerActivity.showV2228SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2228secured
    FeaturePrefsStore.batch2221.v2228secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2229: ruined mode
internal fun PlayerActivity.showV2229RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229ruined
    FeaturePrefsStore.batch2221.v2229ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2229: sacrificed mode
internal fun PlayerActivity.showV2229SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229sacrificed
    FeaturePrefsStore.batch2221.v2229sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2229: safeguarded mode
internal fun PlayerActivity.showV2229SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229safeguarded
    FeaturePrefsStore.batch2221.v2229safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2229: sampled mode
internal fun PlayerActivity.showV2229SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2229sampled
    FeaturePrefsStore.batch2221.v2229sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2229: satisfied mode
internal fun PlayerActivity.showV2229SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229satisfied
    FeaturePrefsStore.batch2221.v2229satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2229: saved level
internal fun PlayerActivity.showV2229SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2229: scaled level
internal fun PlayerActivity.showV2229ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2229: scanned level
internal fun PlayerActivity.showV2229ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2229: scared level
internal fun PlayerActivity.showV2229ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2229: scheduled level
internal fun PlayerActivity.showV2229ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2229: scattered mode
internal fun PlayerActivity.showV2229ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2229scattered
    FeaturePrefsStore.batch2221.v2229scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2229: sculpted mode
internal fun PlayerActivity.showV2229SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229sculpted
    FeaturePrefsStore.batch2221.v2229sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2229: searched mode
internal fun PlayerActivity.showV2229SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229searched
    FeaturePrefsStore.batch2221.v2229searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2229: seasoned mode
internal fun PlayerActivity.showV2229SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229seasoned
    FeaturePrefsStore.batch2221.v2229seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2229: secured mode
internal fun PlayerActivity.showV2229SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2229secured
    FeaturePrefsStore.batch2221.v2229secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2230: ruined mode
internal fun PlayerActivity.showV2230RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230ruined
    FeaturePrefsStore.batch2221.v2230ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2230: sacrificed mode
internal fun PlayerActivity.showV2230SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230sacrificed
    FeaturePrefsStore.batch2221.v2230sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2230: safeguarded mode
internal fun PlayerActivity.showV2230SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230safeguarded
    FeaturePrefsStore.batch2221.v2230safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2230: sampled mode
internal fun PlayerActivity.showV2230SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2230sampled
    FeaturePrefsStore.batch2221.v2230sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2230: satisfied mode
internal fun PlayerActivity.showV2230SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230satisfied
    FeaturePrefsStore.batch2221.v2230satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2230: saved level
internal fun PlayerActivity.showV2230SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2230: scaled level
internal fun PlayerActivity.showV2230ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2230: scanned level
internal fun PlayerActivity.showV2230ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2230: scared level
internal fun PlayerActivity.showV2230ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2230: scheduled level
internal fun PlayerActivity.showV2230ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2230: scattered mode
internal fun PlayerActivity.showV2230ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2230scattered
    FeaturePrefsStore.batch2221.v2230scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2230: sculpted mode
internal fun PlayerActivity.showV2230SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230sculpted
    FeaturePrefsStore.batch2221.v2230sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2230: searched mode
internal fun PlayerActivity.showV2230SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230searched
    FeaturePrefsStore.batch2221.v2230searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2230: seasoned mode
internal fun PlayerActivity.showV2230SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230seasoned
    FeaturePrefsStore.batch2221.v2230seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2230: secured mode
internal fun PlayerActivity.showV2230SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2230secured
    FeaturePrefsStore.batch2221.v2230secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2231: segmented mode
internal fun PlayerActivity.showV2231SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231segmented
    FeaturePrefsStore.batch2231.v2231segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2231: selected mode
internal fun PlayerActivity.showV2231SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231selected
    FeaturePrefsStore.batch2231.v2231selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2231: served mode
internal fun PlayerActivity.showV2231ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231served
    FeaturePrefsStore.batch2231.v2231served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2231: serviced mode
internal fun PlayerActivity.showV2231ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231serviced
    FeaturePrefsStore.batch2231.v2231serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2231: settled mode
internal fun PlayerActivity.showV2231SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2231settled
    FeaturePrefsStore.batch2231.v2231settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2231: shaped level
internal fun PlayerActivity.showV2231ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2231: shared level
internal fun PlayerActivity.showV2231SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2231: sharpened level
internal fun PlayerActivity.showV2231SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2231: sheltered level
internal fun PlayerActivity.showV2231ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2231: shifted level
internal fun PlayerActivity.showV2231ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2231shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2231shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2231: shortened mode
internal fun PlayerActivity.showV2231ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shortened
    FeaturePrefsStore.batch2231.v2231shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2231: showcased mode
internal fun PlayerActivity.showV2231ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231showcased
    FeaturePrefsStore.batch2231.v2231showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2231: shrank mode
internal fun PlayerActivity.showV2231ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shrank
    FeaturePrefsStore.batch2231.v2231shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2231: shrugged mode
internal fun PlayerActivity.showV2231ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shrugged
    FeaturePrefsStore.batch2231.v2231shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2231: shuffled mode
internal fun PlayerActivity.showV2231ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2231shuffled
    FeaturePrefsStore.batch2231.v2231shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2232: segmented mode
internal fun PlayerActivity.showV2232SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232segmented
    FeaturePrefsStore.batch2231.v2232segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2232: selected mode
internal fun PlayerActivity.showV2232SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232selected
    FeaturePrefsStore.batch2231.v2232selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2232: served mode
internal fun PlayerActivity.showV2232ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232served
    FeaturePrefsStore.batch2231.v2232served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2232: serviced mode
internal fun PlayerActivity.showV2232ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232serviced
    FeaturePrefsStore.batch2231.v2232serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2232: settled mode
internal fun PlayerActivity.showV2232SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2232settled
    FeaturePrefsStore.batch2231.v2232settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2232: shaped level
internal fun PlayerActivity.showV2232ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2232: shared level
internal fun PlayerActivity.showV2232SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2232: sharpened level
internal fun PlayerActivity.showV2232SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2232: sheltered level
internal fun PlayerActivity.showV2232ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2232: shifted level
internal fun PlayerActivity.showV2232ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2232shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2232shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2232: shortened mode
internal fun PlayerActivity.showV2232ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shortened
    FeaturePrefsStore.batch2231.v2232shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2232: showcased mode
internal fun PlayerActivity.showV2232ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232showcased
    FeaturePrefsStore.batch2231.v2232showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2232: shrank mode
internal fun PlayerActivity.showV2232ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shrank
    FeaturePrefsStore.batch2231.v2232shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2232: shrugged mode
internal fun PlayerActivity.showV2232ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shrugged
    FeaturePrefsStore.batch2231.v2232shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2232: shuffled mode
internal fun PlayerActivity.showV2232ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2232shuffled
    FeaturePrefsStore.batch2231.v2232shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2233: segmented mode
internal fun PlayerActivity.showV2233SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233segmented
    FeaturePrefsStore.batch2231.v2233segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2233: selected mode
internal fun PlayerActivity.showV2233SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233selected
    FeaturePrefsStore.batch2231.v2233selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2233: served mode
internal fun PlayerActivity.showV2233ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233served
    FeaturePrefsStore.batch2231.v2233served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2233: serviced mode
internal fun PlayerActivity.showV2233ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233serviced
    FeaturePrefsStore.batch2231.v2233serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2233: settled mode
internal fun PlayerActivity.showV2233SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2233settled
    FeaturePrefsStore.batch2231.v2233settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2233: shaped level
internal fun PlayerActivity.showV2233ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2233: shared level
internal fun PlayerActivity.showV2233SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2233: sharpened level
internal fun PlayerActivity.showV2233SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2233: sheltered level
internal fun PlayerActivity.showV2233ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2233: shifted level
internal fun PlayerActivity.showV2233ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2233shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2233shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2233: shortened mode
internal fun PlayerActivity.showV2233ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shortened
    FeaturePrefsStore.batch2231.v2233shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2233: showcased mode
internal fun PlayerActivity.showV2233ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233showcased
    FeaturePrefsStore.batch2231.v2233showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2233: shrank mode
internal fun PlayerActivity.showV2233ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shrank
    FeaturePrefsStore.batch2231.v2233shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2233: shrugged mode
internal fun PlayerActivity.showV2233ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shrugged
    FeaturePrefsStore.batch2231.v2233shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2233: shuffled mode
internal fun PlayerActivity.showV2233ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2233shuffled
    FeaturePrefsStore.batch2231.v2233shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2234: segmented mode
internal fun PlayerActivity.showV2234SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234segmented
    FeaturePrefsStore.batch2231.v2234segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2234: selected mode
internal fun PlayerActivity.showV2234SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234selected
    FeaturePrefsStore.batch2231.v2234selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2234: served mode
internal fun PlayerActivity.showV2234ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234served
    FeaturePrefsStore.batch2231.v2234served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2234: serviced mode
internal fun PlayerActivity.showV2234ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234serviced
    FeaturePrefsStore.batch2231.v2234serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2234: settled mode
internal fun PlayerActivity.showV2234SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2234settled
    FeaturePrefsStore.batch2231.v2234settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2234: shaped level
internal fun PlayerActivity.showV2234ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2234: shared level
internal fun PlayerActivity.showV2234SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2234: sharpened level
internal fun PlayerActivity.showV2234SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2234: sheltered level
internal fun PlayerActivity.showV2234ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2234: shifted level
internal fun PlayerActivity.showV2234ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2234shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2234shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2234: shortened mode
internal fun PlayerActivity.showV2234ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shortened
    FeaturePrefsStore.batch2231.v2234shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2234: showcased mode
internal fun PlayerActivity.showV2234ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234showcased
    FeaturePrefsStore.batch2231.v2234showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2234: shrank mode
internal fun PlayerActivity.showV2234ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shrank
    FeaturePrefsStore.batch2231.v2234shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2234: shrugged mode
internal fun PlayerActivity.showV2234ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shrugged
    FeaturePrefsStore.batch2231.v2234shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2234: shuffled mode
internal fun PlayerActivity.showV2234ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2234shuffled
    FeaturePrefsStore.batch2231.v2234shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2235: segmented mode
internal fun PlayerActivity.showV2235SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235segmented
    FeaturePrefsStore.batch2231.v2235segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2235: selected mode
internal fun PlayerActivity.showV2235SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235selected
    FeaturePrefsStore.batch2231.v2235selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2235: served mode
internal fun PlayerActivity.showV2235ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235served
    FeaturePrefsStore.batch2231.v2235served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2235: serviced mode
internal fun PlayerActivity.showV2235ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235serviced
    FeaturePrefsStore.batch2231.v2235serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2235: settled mode
internal fun PlayerActivity.showV2235SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2235settled
    FeaturePrefsStore.batch2231.v2235settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2235: shaped level
internal fun PlayerActivity.showV2235ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2235: shared level
internal fun PlayerActivity.showV2235SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2235: sharpened level
internal fun PlayerActivity.showV2235SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2235: sheltered level
internal fun PlayerActivity.showV2235ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2235: shifted level
internal fun PlayerActivity.showV2235ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2235shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2235shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2235: shortened mode
internal fun PlayerActivity.showV2235ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shortened
    FeaturePrefsStore.batch2231.v2235shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2235: showcased mode
internal fun PlayerActivity.showV2235ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235showcased
    FeaturePrefsStore.batch2231.v2235showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2235: shrank mode
internal fun PlayerActivity.showV2235ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shrank
    FeaturePrefsStore.batch2231.v2235shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2235: shrugged mode
internal fun PlayerActivity.showV2235ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shrugged
    FeaturePrefsStore.batch2231.v2235shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2235: shuffled mode
internal fun PlayerActivity.showV2235ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2235shuffled
    FeaturePrefsStore.batch2231.v2235shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2236: segmented mode
internal fun PlayerActivity.showV2236SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236segmented
    FeaturePrefsStore.batch2231.v2236segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2236: selected mode
internal fun PlayerActivity.showV2236SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236selected
    FeaturePrefsStore.batch2231.v2236selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2236: served mode
internal fun PlayerActivity.showV2236ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236served
    FeaturePrefsStore.batch2231.v2236served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2236: serviced mode
internal fun PlayerActivity.showV2236ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236serviced
    FeaturePrefsStore.batch2231.v2236serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2236: settled mode
internal fun PlayerActivity.showV2236SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2236settled
    FeaturePrefsStore.batch2231.v2236settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2236: shaped level
internal fun PlayerActivity.showV2236ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2236: shared level
internal fun PlayerActivity.showV2236SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2236: sharpened level
internal fun PlayerActivity.showV2236SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2236: sheltered level
internal fun PlayerActivity.showV2236ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2236: shifted level
internal fun PlayerActivity.showV2236ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2236shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2236shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2236: shortened mode
internal fun PlayerActivity.showV2236ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shortened
    FeaturePrefsStore.batch2231.v2236shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2236: showcased mode
internal fun PlayerActivity.showV2236ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236showcased
    FeaturePrefsStore.batch2231.v2236showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2236: shrank mode
internal fun PlayerActivity.showV2236ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shrank
    FeaturePrefsStore.batch2231.v2236shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2236: shrugged mode
internal fun PlayerActivity.showV2236ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shrugged
    FeaturePrefsStore.batch2231.v2236shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2236: shuffled mode
internal fun PlayerActivity.showV2236ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2236shuffled
    FeaturePrefsStore.batch2231.v2236shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2237: segmented mode
internal fun PlayerActivity.showV2237SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237segmented
    FeaturePrefsStore.batch2231.v2237segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2237: selected mode
internal fun PlayerActivity.showV2237SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237selected
    FeaturePrefsStore.batch2231.v2237selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2237: served mode
internal fun PlayerActivity.showV2237ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237served
    FeaturePrefsStore.batch2231.v2237served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2237: serviced mode
internal fun PlayerActivity.showV2237ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237serviced
    FeaturePrefsStore.batch2231.v2237serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2237: settled mode
internal fun PlayerActivity.showV2237SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2237settled
    FeaturePrefsStore.batch2231.v2237settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2237: shaped level
internal fun PlayerActivity.showV2237ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2237: shared level
internal fun PlayerActivity.showV2237SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2237: sharpened level
internal fun PlayerActivity.showV2237SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2237: sheltered level
internal fun PlayerActivity.showV2237ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2237: shifted level
internal fun PlayerActivity.showV2237ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2237shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2237shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2237: shortened mode
internal fun PlayerActivity.showV2237ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shortened
    FeaturePrefsStore.batch2231.v2237shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2237: showcased mode
internal fun PlayerActivity.showV2237ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237showcased
    FeaturePrefsStore.batch2231.v2237showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2237: shrank mode
internal fun PlayerActivity.showV2237ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shrank
    FeaturePrefsStore.batch2231.v2237shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2237: shrugged mode
internal fun PlayerActivity.showV2237ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shrugged
    FeaturePrefsStore.batch2231.v2237shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2237: shuffled mode
internal fun PlayerActivity.showV2237ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2237shuffled
    FeaturePrefsStore.batch2231.v2237shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2238: segmented mode
internal fun PlayerActivity.showV2238SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238segmented
    FeaturePrefsStore.batch2231.v2238segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2238: selected mode
internal fun PlayerActivity.showV2238SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238selected
    FeaturePrefsStore.batch2231.v2238selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2238: served mode
internal fun PlayerActivity.showV2238ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238served
    FeaturePrefsStore.batch2231.v2238served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2238: serviced mode
internal fun PlayerActivity.showV2238ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238serviced
    FeaturePrefsStore.batch2231.v2238serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2238: settled mode
internal fun PlayerActivity.showV2238SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2238settled
    FeaturePrefsStore.batch2231.v2238settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2238: shaped level
internal fun PlayerActivity.showV2238ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2238: shared level
internal fun PlayerActivity.showV2238SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2238: sharpened level
internal fun PlayerActivity.showV2238SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2238: sheltered level
internal fun PlayerActivity.showV2238ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2238: shifted level
internal fun PlayerActivity.showV2238ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2238shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2238shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2238: shortened mode
internal fun PlayerActivity.showV2238ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shortened
    FeaturePrefsStore.batch2231.v2238shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2238: showcased mode
internal fun PlayerActivity.showV2238ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238showcased
    FeaturePrefsStore.batch2231.v2238showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2238: shrank mode
internal fun PlayerActivity.showV2238ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shrank
    FeaturePrefsStore.batch2231.v2238shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2238: shrugged mode
internal fun PlayerActivity.showV2238ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shrugged
    FeaturePrefsStore.batch2231.v2238shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2238: shuffled mode
internal fun PlayerActivity.showV2238ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2238shuffled
    FeaturePrefsStore.batch2231.v2238shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2239: segmented mode
internal fun PlayerActivity.showV2239SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239segmented
    FeaturePrefsStore.batch2231.v2239segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2239: selected mode
internal fun PlayerActivity.showV2239SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239selected
    FeaturePrefsStore.batch2231.v2239selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2239: served mode
internal fun PlayerActivity.showV2239ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239served
    FeaturePrefsStore.batch2231.v2239served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2239: serviced mode
internal fun PlayerActivity.showV2239ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239serviced
    FeaturePrefsStore.batch2231.v2239serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2239: settled mode
internal fun PlayerActivity.showV2239SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2239settled
    FeaturePrefsStore.batch2231.v2239settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2239: shaped level
internal fun PlayerActivity.showV2239ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2239: shared level
internal fun PlayerActivity.showV2239SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2239: sharpened level
internal fun PlayerActivity.showV2239SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2239: sheltered level
internal fun PlayerActivity.showV2239ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2239: shifted level
internal fun PlayerActivity.showV2239ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2239shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2239shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2239: shortened mode
internal fun PlayerActivity.showV2239ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shortened
    FeaturePrefsStore.batch2231.v2239shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2239: showcased mode
internal fun PlayerActivity.showV2239ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239showcased
    FeaturePrefsStore.batch2231.v2239showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2239: shrank mode
internal fun PlayerActivity.showV2239ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shrank
    FeaturePrefsStore.batch2231.v2239shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2239: shrugged mode
internal fun PlayerActivity.showV2239ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shrugged
    FeaturePrefsStore.batch2231.v2239shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2239: shuffled mode
internal fun PlayerActivity.showV2239ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2239shuffled
    FeaturePrefsStore.batch2231.v2239shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2240: segmented mode
internal fun PlayerActivity.showV2240SegmentedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240segmented
    FeaturePrefsStore.batch2231.v2240segmented = !current
    AppToast.show(this, "segmented: ${if (!current) "ON" else "OFF"}")
}

// v2240: selected mode
internal fun PlayerActivity.showV2240SelectedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240selected
    FeaturePrefsStore.batch2231.v2240selected = !current
    AppToast.show(this, "selected: ${if (!current) "ON" else "OFF"}")
}

// v2240: served mode
internal fun PlayerActivity.showV2240ServedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240served
    FeaturePrefsStore.batch2231.v2240served = !current
    AppToast.show(this, "served: ${if (!current) "ON" else "OFF"}")
}

// v2240: serviced mode
internal fun PlayerActivity.showV2240ServicedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240serviced
    FeaturePrefsStore.batch2231.v2240serviced = !current
    AppToast.show(this, "serviced: ${if (!current) "ON" else "OFF"}")
}

// v2240: settled mode
internal fun PlayerActivity.showV2240SettledToggle() {
    val current = FeaturePrefsStore.batch2231.v2240settled
    FeaturePrefsStore.batch2231.v2240settled = !current
    AppToast.show(this, "settled: ${if (!current) "ON" else "OFF"}")
}

// v2240: shaped level
internal fun PlayerActivity.showV2240ShapedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240shaped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shaped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240shaped = value
        AppToast.show(this, "shaped: $value")
    }
}

// v2240: shared level
internal fun PlayerActivity.showV2240SharedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240shared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240shared = value
        AppToast.show(this, "shared: $value")
    }
}

// v2240: sharpened level
internal fun PlayerActivity.showV2240SharpenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240sharpened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sharpened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240sharpened = value
        AppToast.show(this, "sharpened: $value")
    }
}

// v2240: sheltered level
internal fun PlayerActivity.showV2240ShelteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240sheltered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sheltered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240sheltered = value
        AppToast.show(this, "sheltered: $value")
    }
}

// v2240: shifted level
internal fun PlayerActivity.showV2240ShiftedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2231.v2240shifted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "shifted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2231.v2240shifted = value
        AppToast.show(this, "shifted: $value")
    }
}

// v2240: shortened mode
internal fun PlayerActivity.showV2240ShortenedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shortened
    FeaturePrefsStore.batch2231.v2240shortened = !current
    AppToast.show(this, "shortened: ${if (!current) "ON" else "OFF"}")
}

// v2240: showcased mode
internal fun PlayerActivity.showV2240ShowcasedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240showcased
    FeaturePrefsStore.batch2231.v2240showcased = !current
    AppToast.show(this, "showcased: ${if (!current) "ON" else "OFF"}")
}

// v2240: shrank mode
internal fun PlayerActivity.showV2240ShrankToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shrank
    FeaturePrefsStore.batch2231.v2240shrank = !current
    AppToast.show(this, "shrank: ${if (!current) "ON" else "OFF"}")
}

// v2240: shrugged mode
internal fun PlayerActivity.showV2240ShruggedToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shrugged
    FeaturePrefsStore.batch2231.v2240shrugged = !current
    AppToast.show(this, "shrugged: ${if (!current) "ON" else "OFF"}")
}

// v2240: shuffled mode
internal fun PlayerActivity.showV2240ShuffledToggle() {
    val current = FeaturePrefsStore.batch2231.v2240shuffled
    FeaturePrefsStore.batch2231.v2240shuffled = !current
    AppToast.show(this, "shuffled: ${if (!current) "ON" else "OFF"}")
}

// v2241: shut mode
internal fun PlayerActivity.showV2241ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2241shut
    FeaturePrefsStore.batch2241.v2241shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2241: signaled mode
internal fun PlayerActivity.showV2241SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2241signaled
    FeaturePrefsStore.batch2241.v2241signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2241: simplified mode
internal fun PlayerActivity.showV2241SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241simplified
    FeaturePrefsStore.batch2241.v2241simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2241: simulated mode
internal fun PlayerActivity.showV2241SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241simulated
    FeaturePrefsStore.batch2241.v2241simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2241: situated mode
internal fun PlayerActivity.showV2241SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241situated
    FeaturePrefsStore.batch2241.v2241situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2241: sized level
internal fun PlayerActivity.showV2241SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2241: sketched level
internal fun PlayerActivity.showV2241SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2241: slowed level
internal fun PlayerActivity.showV2241SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2241: smoothed level
internal fun PlayerActivity.showV2241SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2241: snapped level
internal fun PlayerActivity.showV2241SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2241snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2241snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2241: solved mode
internal fun PlayerActivity.showV2241SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241solved
    FeaturePrefsStore.batch2241.v2241solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2241: sorted mode
internal fun PlayerActivity.showV2241SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sorted
    FeaturePrefsStore.batch2241.v2241sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2241: sounded mode
internal fun PlayerActivity.showV2241SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sounded
    FeaturePrefsStore.batch2241.v2241sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2241: sourced mode
internal fun PlayerActivity.showV2241SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sourced
    FeaturePrefsStore.batch2241.v2241sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2241: sparked mode
internal fun PlayerActivity.showV2241SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2241sparked
    FeaturePrefsStore.batch2241.v2241sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2242: shut mode
internal fun PlayerActivity.showV2242ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2242shut
    FeaturePrefsStore.batch2241.v2242shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2242: signaled mode
internal fun PlayerActivity.showV2242SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2242signaled
    FeaturePrefsStore.batch2241.v2242signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2242: simplified mode
internal fun PlayerActivity.showV2242SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242simplified
    FeaturePrefsStore.batch2241.v2242simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2242: simulated mode
internal fun PlayerActivity.showV2242SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242simulated
    FeaturePrefsStore.batch2241.v2242simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2242: situated mode
internal fun PlayerActivity.showV2242SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242situated
    FeaturePrefsStore.batch2241.v2242situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2242: sized level
internal fun PlayerActivity.showV2242SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2242: sketched level
internal fun PlayerActivity.showV2242SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2242: slowed level
internal fun PlayerActivity.showV2242SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2242: smoothed level
internal fun PlayerActivity.showV2242SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2242: snapped level
internal fun PlayerActivity.showV2242SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2242snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2242snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2242: solved mode
internal fun PlayerActivity.showV2242SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242solved
    FeaturePrefsStore.batch2241.v2242solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2242: sorted mode
internal fun PlayerActivity.showV2242SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sorted
    FeaturePrefsStore.batch2241.v2242sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2242: sounded mode
internal fun PlayerActivity.showV2242SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sounded
    FeaturePrefsStore.batch2241.v2242sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2242: sourced mode
internal fun PlayerActivity.showV2242SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sourced
    FeaturePrefsStore.batch2241.v2242sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2242: sparked mode
internal fun PlayerActivity.showV2242SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2242sparked
    FeaturePrefsStore.batch2241.v2242sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2243: shut mode
internal fun PlayerActivity.showV2243ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2243shut
    FeaturePrefsStore.batch2241.v2243shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2243: signaled mode
internal fun PlayerActivity.showV2243SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2243signaled
    FeaturePrefsStore.batch2241.v2243signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2243: simplified mode
internal fun PlayerActivity.showV2243SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243simplified
    FeaturePrefsStore.batch2241.v2243simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2243: simulated mode
internal fun PlayerActivity.showV2243SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243simulated
    FeaturePrefsStore.batch2241.v2243simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2243: situated mode
internal fun PlayerActivity.showV2243SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243situated
    FeaturePrefsStore.batch2241.v2243situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2243: sized level
internal fun PlayerActivity.showV2243SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2243: sketched level
internal fun PlayerActivity.showV2243SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2243: slowed level
internal fun PlayerActivity.showV2243SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2243: smoothed level
internal fun PlayerActivity.showV2243SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2243: snapped level
internal fun PlayerActivity.showV2243SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2243snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2243snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2243: solved mode
internal fun PlayerActivity.showV2243SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243solved
    FeaturePrefsStore.batch2241.v2243solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2243: sorted mode
internal fun PlayerActivity.showV2243SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sorted
    FeaturePrefsStore.batch2241.v2243sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2243: sounded mode
internal fun PlayerActivity.showV2243SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sounded
    FeaturePrefsStore.batch2241.v2243sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2243: sourced mode
internal fun PlayerActivity.showV2243SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sourced
    FeaturePrefsStore.batch2241.v2243sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2243: sparked mode
internal fun PlayerActivity.showV2243SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2243sparked
    FeaturePrefsStore.batch2241.v2243sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2244: shut mode
internal fun PlayerActivity.showV2244ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2244shut
    FeaturePrefsStore.batch2241.v2244shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2244: signaled mode
internal fun PlayerActivity.showV2244SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2244signaled
    FeaturePrefsStore.batch2241.v2244signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2244: simplified mode
internal fun PlayerActivity.showV2244SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244simplified
    FeaturePrefsStore.batch2241.v2244simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2244: simulated mode
internal fun PlayerActivity.showV2244SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244simulated
    FeaturePrefsStore.batch2241.v2244simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2244: situated mode
internal fun PlayerActivity.showV2244SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244situated
    FeaturePrefsStore.batch2241.v2244situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2244: sized level
internal fun PlayerActivity.showV2244SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2244: sketched level
internal fun PlayerActivity.showV2244SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2244: slowed level
internal fun PlayerActivity.showV2244SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2244: smoothed level
internal fun PlayerActivity.showV2244SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2244: snapped level
internal fun PlayerActivity.showV2244SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2244snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2244snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2244: solved mode
internal fun PlayerActivity.showV2244SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244solved
    FeaturePrefsStore.batch2241.v2244solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2244: sorted mode
internal fun PlayerActivity.showV2244SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sorted
    FeaturePrefsStore.batch2241.v2244sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2244: sounded mode
internal fun PlayerActivity.showV2244SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sounded
    FeaturePrefsStore.batch2241.v2244sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2244: sourced mode
internal fun PlayerActivity.showV2244SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sourced
    FeaturePrefsStore.batch2241.v2244sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2244: sparked mode
internal fun PlayerActivity.showV2244SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2244sparked
    FeaturePrefsStore.batch2241.v2244sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2245: shut mode
internal fun PlayerActivity.showV2245ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2245shut
    FeaturePrefsStore.batch2241.v2245shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2245: signaled mode
internal fun PlayerActivity.showV2245SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2245signaled
    FeaturePrefsStore.batch2241.v2245signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2245: simplified mode
internal fun PlayerActivity.showV2245SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245simplified
    FeaturePrefsStore.batch2241.v2245simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2245: simulated mode
internal fun PlayerActivity.showV2245SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245simulated
    FeaturePrefsStore.batch2241.v2245simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2245: situated mode
internal fun PlayerActivity.showV2245SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245situated
    FeaturePrefsStore.batch2241.v2245situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2245: sized level
internal fun PlayerActivity.showV2245SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2245: sketched level
internal fun PlayerActivity.showV2245SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2245: slowed level
internal fun PlayerActivity.showV2245SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2245: smoothed level
internal fun PlayerActivity.showV2245SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2245: snapped level
internal fun PlayerActivity.showV2245SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2245snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2245snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2245: solved mode
internal fun PlayerActivity.showV2245SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245solved
    FeaturePrefsStore.batch2241.v2245solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2245: sorted mode
internal fun PlayerActivity.showV2245SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sorted
    FeaturePrefsStore.batch2241.v2245sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2245: sounded mode
internal fun PlayerActivity.showV2245SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sounded
    FeaturePrefsStore.batch2241.v2245sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2245: sourced mode
internal fun PlayerActivity.showV2245SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sourced
    FeaturePrefsStore.batch2241.v2245sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2245: sparked mode
internal fun PlayerActivity.showV2245SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2245sparked
    FeaturePrefsStore.batch2241.v2245sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2246: shut mode
internal fun PlayerActivity.showV2246ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2246shut
    FeaturePrefsStore.batch2241.v2246shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2246: signaled mode
internal fun PlayerActivity.showV2246SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2246signaled
    FeaturePrefsStore.batch2241.v2246signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2246: simplified mode
internal fun PlayerActivity.showV2246SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246simplified
    FeaturePrefsStore.batch2241.v2246simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2246: simulated mode
internal fun PlayerActivity.showV2246SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246simulated
    FeaturePrefsStore.batch2241.v2246simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2246: situated mode
internal fun PlayerActivity.showV2246SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246situated
    FeaturePrefsStore.batch2241.v2246situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2246: sized level
internal fun PlayerActivity.showV2246SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2246: sketched level
internal fun PlayerActivity.showV2246SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2246: slowed level
internal fun PlayerActivity.showV2246SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2246: smoothed level
internal fun PlayerActivity.showV2246SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2246: snapped level
internal fun PlayerActivity.showV2246SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2246snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2246snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2246: solved mode
internal fun PlayerActivity.showV2246SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246solved
    FeaturePrefsStore.batch2241.v2246solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2246: sorted mode
internal fun PlayerActivity.showV2246SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sorted
    FeaturePrefsStore.batch2241.v2246sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2246: sounded mode
internal fun PlayerActivity.showV2246SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sounded
    FeaturePrefsStore.batch2241.v2246sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2246: sourced mode
internal fun PlayerActivity.showV2246SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sourced
    FeaturePrefsStore.batch2241.v2246sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2246: sparked mode
internal fun PlayerActivity.showV2246SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2246sparked
    FeaturePrefsStore.batch2241.v2246sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2247: shut mode
internal fun PlayerActivity.showV2247ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2247shut
    FeaturePrefsStore.batch2241.v2247shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2247: signaled mode
internal fun PlayerActivity.showV2247SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2247signaled
    FeaturePrefsStore.batch2241.v2247signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2247: simplified mode
internal fun PlayerActivity.showV2247SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247simplified
    FeaturePrefsStore.batch2241.v2247simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2247: simulated mode
internal fun PlayerActivity.showV2247SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247simulated
    FeaturePrefsStore.batch2241.v2247simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2247: situated mode
internal fun PlayerActivity.showV2247SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247situated
    FeaturePrefsStore.batch2241.v2247situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2247: sized level
internal fun PlayerActivity.showV2247SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2247: sketched level
internal fun PlayerActivity.showV2247SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2247: slowed level
internal fun PlayerActivity.showV2247SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2247: smoothed level
internal fun PlayerActivity.showV2247SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2247: snapped level
internal fun PlayerActivity.showV2247SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2247snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2247snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2247: solved mode
internal fun PlayerActivity.showV2247SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247solved
    FeaturePrefsStore.batch2241.v2247solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2247: sorted mode
internal fun PlayerActivity.showV2247SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sorted
    FeaturePrefsStore.batch2241.v2247sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2247: sounded mode
internal fun PlayerActivity.showV2247SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sounded
    FeaturePrefsStore.batch2241.v2247sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2247: sourced mode
internal fun PlayerActivity.showV2247SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sourced
    FeaturePrefsStore.batch2241.v2247sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2247: sparked mode
internal fun PlayerActivity.showV2247SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2247sparked
    FeaturePrefsStore.batch2241.v2247sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2248: shut mode
internal fun PlayerActivity.showV2248ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2248shut
    FeaturePrefsStore.batch2241.v2248shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2248: signaled mode
internal fun PlayerActivity.showV2248SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2248signaled
    FeaturePrefsStore.batch2241.v2248signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2248: simplified mode
internal fun PlayerActivity.showV2248SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248simplified
    FeaturePrefsStore.batch2241.v2248simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2248: simulated mode
internal fun PlayerActivity.showV2248SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248simulated
    FeaturePrefsStore.batch2241.v2248simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2248: situated mode
internal fun PlayerActivity.showV2248SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248situated
    FeaturePrefsStore.batch2241.v2248situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2248: sized level
internal fun PlayerActivity.showV2248SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2248: sketched level
internal fun PlayerActivity.showV2248SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2248: slowed level
internal fun PlayerActivity.showV2248SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2248: smoothed level
internal fun PlayerActivity.showV2248SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2248: snapped level
internal fun PlayerActivity.showV2248SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2248snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2248snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2248: solved mode
internal fun PlayerActivity.showV2248SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248solved
    FeaturePrefsStore.batch2241.v2248solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2248: sorted mode
internal fun PlayerActivity.showV2248SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sorted
    FeaturePrefsStore.batch2241.v2248sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2248: sounded mode
internal fun PlayerActivity.showV2248SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sounded
    FeaturePrefsStore.batch2241.v2248sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2248: sourced mode
internal fun PlayerActivity.showV2248SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sourced
    FeaturePrefsStore.batch2241.v2248sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2248: sparked mode
internal fun PlayerActivity.showV2248SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2248sparked
    FeaturePrefsStore.batch2241.v2248sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2249: shut mode
internal fun PlayerActivity.showV2249ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2249shut
    FeaturePrefsStore.batch2241.v2249shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2249: signaled mode
internal fun PlayerActivity.showV2249SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2249signaled
    FeaturePrefsStore.batch2241.v2249signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2249: simplified mode
internal fun PlayerActivity.showV2249SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249simplified
    FeaturePrefsStore.batch2241.v2249simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2249: simulated mode
internal fun PlayerActivity.showV2249SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249simulated
    FeaturePrefsStore.batch2241.v2249simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2249: situated mode
internal fun PlayerActivity.showV2249SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249situated
    FeaturePrefsStore.batch2241.v2249situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2249: sized level
internal fun PlayerActivity.showV2249SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2249: sketched level
internal fun PlayerActivity.showV2249SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2249: slowed level
internal fun PlayerActivity.showV2249SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2249: smoothed level
internal fun PlayerActivity.showV2249SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2249: snapped level
internal fun PlayerActivity.showV2249SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2249snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2249snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2249: solved mode
internal fun PlayerActivity.showV2249SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249solved
    FeaturePrefsStore.batch2241.v2249solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2249: sorted mode
internal fun PlayerActivity.showV2249SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sorted
    FeaturePrefsStore.batch2241.v2249sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2249: sounded mode
internal fun PlayerActivity.showV2249SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sounded
    FeaturePrefsStore.batch2241.v2249sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2249: sourced mode
internal fun PlayerActivity.showV2249SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sourced
    FeaturePrefsStore.batch2241.v2249sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2249: sparked mode
internal fun PlayerActivity.showV2249SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2249sparked
    FeaturePrefsStore.batch2241.v2249sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}

// v2250: shut mode
internal fun PlayerActivity.showV2250ShutToggle() {
    val current = FeaturePrefsStore.batch2241.v2250shut
    FeaturePrefsStore.batch2241.v2250shut = !current
    AppToast.show(this, "shut: ${if (!current) "ON" else "OFF"}")
}

// v2250: signaled mode
internal fun PlayerActivity.showV2250SignaledToggle() {
    val current = FeaturePrefsStore.batch2241.v2250signaled
    FeaturePrefsStore.batch2241.v2250signaled = !current
    AppToast.show(this, "signaled: ${if (!current) "ON" else "OFF"}")
}

// v2250: simplified mode
internal fun PlayerActivity.showV2250SimplifiedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250simplified
    FeaturePrefsStore.batch2241.v2250simplified = !current
    AppToast.show(this, "simplified: ${if (!current) "ON" else "OFF"}")
}

// v2250: simulated mode
internal fun PlayerActivity.showV2250SimulatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250simulated
    FeaturePrefsStore.batch2241.v2250simulated = !current
    AppToast.show(this, "simulated: ${if (!current) "ON" else "OFF"}")
}

// v2250: situated mode
internal fun PlayerActivity.showV2250SituatedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250situated
    FeaturePrefsStore.batch2241.v2250situated = !current
    AppToast.show(this, "situated: ${if (!current) "ON" else "OFF"}")
}

// v2250: sized level
internal fun PlayerActivity.showV2250SizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250sized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250sized = value
        AppToast.show(this, "sized: $value")
    }
}

// v2250: sketched level
internal fun PlayerActivity.showV2250SketchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250sketched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sketched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250sketched = value
        AppToast.show(this, "sketched: $value")
    }
}

// v2250: slowed level
internal fun PlayerActivity.showV2250SlowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250slowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "slowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250slowed = value
        AppToast.show(this, "slowed: $value")
    }
}

// v2250: smoothed level
internal fun PlayerActivity.showV2250SmoothedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250smoothed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "smoothed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250smoothed = value
        AppToast.show(this, "smoothed: $value")
    }
}

// v2250: snapped level
internal fun PlayerActivity.showV2250SnappedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2241.v2250snapped).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "snapped level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2241.v2250snapped = value
        AppToast.show(this, "snapped: $value")
    }
}

// v2250: solved mode
internal fun PlayerActivity.showV2250SolvedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250solved
    FeaturePrefsStore.batch2241.v2250solved = !current
    AppToast.show(this, "solved: ${if (!current) "ON" else "OFF"}")
}

// v2250: sorted mode
internal fun PlayerActivity.showV2250SortedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sorted
    FeaturePrefsStore.batch2241.v2250sorted = !current
    AppToast.show(this, "sorted: ${if (!current) "ON" else "OFF"}")
}

// v2250: sounded mode
internal fun PlayerActivity.showV2250SoundedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sounded
    FeaturePrefsStore.batch2241.v2250sounded = !current
    AppToast.show(this, "sounded: ${if (!current) "ON" else "OFF"}")
}

// v2250: sourced mode
internal fun PlayerActivity.showV2250SourcedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sourced
    FeaturePrefsStore.batch2241.v2250sourced = !current
    AppToast.show(this, "sourced: ${if (!current) "ON" else "OFF"}")
}

// v2250: sparked mode
internal fun PlayerActivity.showV2250SparkedToggle() {
    val current = FeaturePrefsStore.batch2241.v2250sparked
    FeaturePrefsStore.batch2241.v2250sparked = !current
    AppToast.show(this, "sparked: ${if (!current) "ON" else "OFF"}")
}
