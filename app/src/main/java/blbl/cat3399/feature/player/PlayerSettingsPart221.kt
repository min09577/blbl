package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2391: extensive mode
internal fun PlayerActivity.showV2391ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2391extensive
    FeaturePrefsStore.batch2391.v2391extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2391: extraordinary mode
internal fun PlayerActivity.showV2391ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2391extraordinary
    FeaturePrefsStore.batch2391.v2391extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2391: extreme mode
internal fun PlayerActivity.showV2391ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2391extreme
    FeaturePrefsStore.batch2391.v2391extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2391: fabulous mode
internal fun PlayerActivity.showV2391FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2391fabulous
    FeaturePrefsStore.batch2391.v2391fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2391: faithful mode
internal fun PlayerActivity.showV2391FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2391faithful
    FeaturePrefsStore.batch2391.v2391faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2391: familiar level
internal fun PlayerActivity.showV2391FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2391familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2391familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2391: fantastic level
internal fun PlayerActivity.showV2391FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2391fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2391fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2391: favorable level
internal fun PlayerActivity.showV2391FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2391favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2391favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2391: fierce level
internal fun PlayerActivity.showV2391FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2391fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2391fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2391: financial level
internal fun PlayerActivity.showV2391FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2391financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2391financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2391: flexible mode
internal fun PlayerActivity.showV2391FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2391flexible
    FeaturePrefsStore.batch2391.v2391flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2391: formidable mode
internal fun PlayerActivity.showV2391FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2391formidable
    FeaturePrefsStore.batch2391.v2391formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2391: forthright mode
internal fun PlayerActivity.showV2391ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2391forthright
    FeaturePrefsStore.batch2391.v2391forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2391: fragrant mode
internal fun PlayerActivity.showV2391FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2391fragrant
    FeaturePrefsStore.batch2391.v2391fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2391: frequent mode
internal fun PlayerActivity.showV2391FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2391frequent
    FeaturePrefsStore.batch2391.v2391frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2392: extensive mode
internal fun PlayerActivity.showV2392ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2392extensive
    FeaturePrefsStore.batch2391.v2392extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2392: extraordinary mode
internal fun PlayerActivity.showV2392ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2392extraordinary
    FeaturePrefsStore.batch2391.v2392extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2392: extreme mode
internal fun PlayerActivity.showV2392ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2392extreme
    FeaturePrefsStore.batch2391.v2392extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2392: fabulous mode
internal fun PlayerActivity.showV2392FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2392fabulous
    FeaturePrefsStore.batch2391.v2392fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2392: faithful mode
internal fun PlayerActivity.showV2392FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2392faithful
    FeaturePrefsStore.batch2391.v2392faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2392: familiar level
internal fun PlayerActivity.showV2392FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2392familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2392familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2392: fantastic level
internal fun PlayerActivity.showV2392FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2392fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2392fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2392: favorable level
internal fun PlayerActivity.showV2392FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2392favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2392favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2392: fierce level
internal fun PlayerActivity.showV2392FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2392fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2392fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2392: financial level
internal fun PlayerActivity.showV2392FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2392financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2392financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2392: flexible mode
internal fun PlayerActivity.showV2392FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2392flexible
    FeaturePrefsStore.batch2391.v2392flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2392: formidable mode
internal fun PlayerActivity.showV2392FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2392formidable
    FeaturePrefsStore.batch2391.v2392formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2392: forthright mode
internal fun PlayerActivity.showV2392ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2392forthright
    FeaturePrefsStore.batch2391.v2392forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2392: fragrant mode
internal fun PlayerActivity.showV2392FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2392fragrant
    FeaturePrefsStore.batch2391.v2392fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2392: frequent mode
internal fun PlayerActivity.showV2392FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2392frequent
    FeaturePrefsStore.batch2391.v2392frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2393: extensive mode
internal fun PlayerActivity.showV2393ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2393extensive
    FeaturePrefsStore.batch2391.v2393extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2393: extraordinary mode
internal fun PlayerActivity.showV2393ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2393extraordinary
    FeaturePrefsStore.batch2391.v2393extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2393: extreme mode
internal fun PlayerActivity.showV2393ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2393extreme
    FeaturePrefsStore.batch2391.v2393extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2393: fabulous mode
internal fun PlayerActivity.showV2393FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2393fabulous
    FeaturePrefsStore.batch2391.v2393fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2393: faithful mode
internal fun PlayerActivity.showV2393FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2393faithful
    FeaturePrefsStore.batch2391.v2393faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2393: familiar level
internal fun PlayerActivity.showV2393FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2393familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2393familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2393: fantastic level
internal fun PlayerActivity.showV2393FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2393fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2393fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2393: favorable level
internal fun PlayerActivity.showV2393FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2393favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2393favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2393: fierce level
internal fun PlayerActivity.showV2393FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2393fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2393fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2393: financial level
internal fun PlayerActivity.showV2393FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2393financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2393financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2393: flexible mode
internal fun PlayerActivity.showV2393FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2393flexible
    FeaturePrefsStore.batch2391.v2393flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2393: formidable mode
internal fun PlayerActivity.showV2393FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2393formidable
    FeaturePrefsStore.batch2391.v2393formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2393: forthright mode
internal fun PlayerActivity.showV2393ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2393forthright
    FeaturePrefsStore.batch2391.v2393forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2393: fragrant mode
internal fun PlayerActivity.showV2393FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2393fragrant
    FeaturePrefsStore.batch2391.v2393fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2393: frequent mode
internal fun PlayerActivity.showV2393FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2393frequent
    FeaturePrefsStore.batch2391.v2393frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2394: extensive mode
internal fun PlayerActivity.showV2394ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2394extensive
    FeaturePrefsStore.batch2391.v2394extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2394: extraordinary mode
internal fun PlayerActivity.showV2394ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2394extraordinary
    FeaturePrefsStore.batch2391.v2394extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2394: extreme mode
internal fun PlayerActivity.showV2394ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2394extreme
    FeaturePrefsStore.batch2391.v2394extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2394: fabulous mode
internal fun PlayerActivity.showV2394FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2394fabulous
    FeaturePrefsStore.batch2391.v2394fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2394: faithful mode
internal fun PlayerActivity.showV2394FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2394faithful
    FeaturePrefsStore.batch2391.v2394faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2394: familiar level
internal fun PlayerActivity.showV2394FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2394familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2394familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2394: fantastic level
internal fun PlayerActivity.showV2394FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2394fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2394fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2394: favorable level
internal fun PlayerActivity.showV2394FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2394favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2394favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2394: fierce level
internal fun PlayerActivity.showV2394FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2394fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2394fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2394: financial level
internal fun PlayerActivity.showV2394FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2394financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2394financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2394: flexible mode
internal fun PlayerActivity.showV2394FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2394flexible
    FeaturePrefsStore.batch2391.v2394flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2394: formidable mode
internal fun PlayerActivity.showV2394FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2394formidable
    FeaturePrefsStore.batch2391.v2394formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2394: forthright mode
internal fun PlayerActivity.showV2394ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2394forthright
    FeaturePrefsStore.batch2391.v2394forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2394: fragrant mode
internal fun PlayerActivity.showV2394FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2394fragrant
    FeaturePrefsStore.batch2391.v2394fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2394: frequent mode
internal fun PlayerActivity.showV2394FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2394frequent
    FeaturePrefsStore.batch2391.v2394frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2395: extensive mode
internal fun PlayerActivity.showV2395ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2395extensive
    FeaturePrefsStore.batch2391.v2395extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2395: extraordinary mode
internal fun PlayerActivity.showV2395ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2395extraordinary
    FeaturePrefsStore.batch2391.v2395extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2395: extreme mode
internal fun PlayerActivity.showV2395ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2395extreme
    FeaturePrefsStore.batch2391.v2395extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2395: fabulous mode
internal fun PlayerActivity.showV2395FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2395fabulous
    FeaturePrefsStore.batch2391.v2395fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2395: faithful mode
internal fun PlayerActivity.showV2395FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2395faithful
    FeaturePrefsStore.batch2391.v2395faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2395: familiar level
internal fun PlayerActivity.showV2395FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2395familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2395familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2395: fantastic level
internal fun PlayerActivity.showV2395FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2395fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2395fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2395: favorable level
internal fun PlayerActivity.showV2395FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2395favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2395favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2395: fierce level
internal fun PlayerActivity.showV2395FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2395fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2395fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2395: financial level
internal fun PlayerActivity.showV2395FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2395financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2395financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2395: flexible mode
internal fun PlayerActivity.showV2395FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2395flexible
    FeaturePrefsStore.batch2391.v2395flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2395: formidable mode
internal fun PlayerActivity.showV2395FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2395formidable
    FeaturePrefsStore.batch2391.v2395formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2395: forthright mode
internal fun PlayerActivity.showV2395ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2395forthright
    FeaturePrefsStore.batch2391.v2395forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2395: fragrant mode
internal fun PlayerActivity.showV2395FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2395fragrant
    FeaturePrefsStore.batch2391.v2395fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2395: frequent mode
internal fun PlayerActivity.showV2395FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2395frequent
    FeaturePrefsStore.batch2391.v2395frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2396: extensive mode
internal fun PlayerActivity.showV2396ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2396extensive
    FeaturePrefsStore.batch2391.v2396extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2396: extraordinary mode
internal fun PlayerActivity.showV2396ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2396extraordinary
    FeaturePrefsStore.batch2391.v2396extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2396: extreme mode
internal fun PlayerActivity.showV2396ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2396extreme
    FeaturePrefsStore.batch2391.v2396extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2396: fabulous mode
internal fun PlayerActivity.showV2396FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2396fabulous
    FeaturePrefsStore.batch2391.v2396fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2396: faithful mode
internal fun PlayerActivity.showV2396FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2396faithful
    FeaturePrefsStore.batch2391.v2396faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2396: familiar level
internal fun PlayerActivity.showV2396FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2396familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2396familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2396: fantastic level
internal fun PlayerActivity.showV2396FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2396fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2396fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2396: favorable level
internal fun PlayerActivity.showV2396FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2396favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2396favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2396: fierce level
internal fun PlayerActivity.showV2396FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2396fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2396fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2396: financial level
internal fun PlayerActivity.showV2396FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2396financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2396financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2396: flexible mode
internal fun PlayerActivity.showV2396FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2396flexible
    FeaturePrefsStore.batch2391.v2396flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2396: formidable mode
internal fun PlayerActivity.showV2396FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2396formidable
    FeaturePrefsStore.batch2391.v2396formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2396: forthright mode
internal fun PlayerActivity.showV2396ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2396forthright
    FeaturePrefsStore.batch2391.v2396forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2396: fragrant mode
internal fun PlayerActivity.showV2396FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2396fragrant
    FeaturePrefsStore.batch2391.v2396fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2396: frequent mode
internal fun PlayerActivity.showV2396FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2396frequent
    FeaturePrefsStore.batch2391.v2396frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2397: extensive mode
internal fun PlayerActivity.showV2397ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2397extensive
    FeaturePrefsStore.batch2391.v2397extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2397: extraordinary mode
internal fun PlayerActivity.showV2397ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2397extraordinary
    FeaturePrefsStore.batch2391.v2397extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2397: extreme mode
internal fun PlayerActivity.showV2397ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2397extreme
    FeaturePrefsStore.batch2391.v2397extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2397: fabulous mode
internal fun PlayerActivity.showV2397FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2397fabulous
    FeaturePrefsStore.batch2391.v2397fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2397: faithful mode
internal fun PlayerActivity.showV2397FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2397faithful
    FeaturePrefsStore.batch2391.v2397faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2397: familiar level
internal fun PlayerActivity.showV2397FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2397familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2397familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2397: fantastic level
internal fun PlayerActivity.showV2397FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2397fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2397fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2397: favorable level
internal fun PlayerActivity.showV2397FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2397favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2397favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2397: fierce level
internal fun PlayerActivity.showV2397FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2397fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2397fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2397: financial level
internal fun PlayerActivity.showV2397FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2397financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2397financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2397: flexible mode
internal fun PlayerActivity.showV2397FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2397flexible
    FeaturePrefsStore.batch2391.v2397flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2397: formidable mode
internal fun PlayerActivity.showV2397FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2397formidable
    FeaturePrefsStore.batch2391.v2397formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2397: forthright mode
internal fun PlayerActivity.showV2397ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2397forthright
    FeaturePrefsStore.batch2391.v2397forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2397: fragrant mode
internal fun PlayerActivity.showV2397FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2397fragrant
    FeaturePrefsStore.batch2391.v2397fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2397: frequent mode
internal fun PlayerActivity.showV2397FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2397frequent
    FeaturePrefsStore.batch2391.v2397frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2398: extensive mode
internal fun PlayerActivity.showV2398ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2398extensive
    FeaturePrefsStore.batch2391.v2398extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2398: extraordinary mode
internal fun PlayerActivity.showV2398ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2398extraordinary
    FeaturePrefsStore.batch2391.v2398extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2398: extreme mode
internal fun PlayerActivity.showV2398ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2398extreme
    FeaturePrefsStore.batch2391.v2398extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2398: fabulous mode
internal fun PlayerActivity.showV2398FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2398fabulous
    FeaturePrefsStore.batch2391.v2398fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2398: faithful mode
internal fun PlayerActivity.showV2398FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2398faithful
    FeaturePrefsStore.batch2391.v2398faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2398: familiar level
internal fun PlayerActivity.showV2398FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2398familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2398familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2398: fantastic level
internal fun PlayerActivity.showV2398FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2398fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2398fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2398: favorable level
internal fun PlayerActivity.showV2398FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2398favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2398favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2398: fierce level
internal fun PlayerActivity.showV2398FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2398fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2398fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2398: financial level
internal fun PlayerActivity.showV2398FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2398financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2398financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2398: flexible mode
internal fun PlayerActivity.showV2398FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2398flexible
    FeaturePrefsStore.batch2391.v2398flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2398: formidable mode
internal fun PlayerActivity.showV2398FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2398formidable
    FeaturePrefsStore.batch2391.v2398formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2398: forthright mode
internal fun PlayerActivity.showV2398ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2398forthright
    FeaturePrefsStore.batch2391.v2398forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2398: fragrant mode
internal fun PlayerActivity.showV2398FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2398fragrant
    FeaturePrefsStore.batch2391.v2398fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2398: frequent mode
internal fun PlayerActivity.showV2398FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2398frequent
    FeaturePrefsStore.batch2391.v2398frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2399: extensive mode
internal fun PlayerActivity.showV2399ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2399extensive
    FeaturePrefsStore.batch2391.v2399extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2399: extraordinary mode
internal fun PlayerActivity.showV2399ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2399extraordinary
    FeaturePrefsStore.batch2391.v2399extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2399: extreme mode
internal fun PlayerActivity.showV2399ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2399extreme
    FeaturePrefsStore.batch2391.v2399extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2399: fabulous mode
internal fun PlayerActivity.showV2399FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2399fabulous
    FeaturePrefsStore.batch2391.v2399fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2399: faithful mode
internal fun PlayerActivity.showV2399FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2399faithful
    FeaturePrefsStore.batch2391.v2399faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2399: familiar level
internal fun PlayerActivity.showV2399FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2399familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2399familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2399: fantastic level
internal fun PlayerActivity.showV2399FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2399fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2399fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2399: favorable level
internal fun PlayerActivity.showV2399FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2399favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2399favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2399: fierce level
internal fun PlayerActivity.showV2399FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2399fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2399fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2399: financial level
internal fun PlayerActivity.showV2399FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2399financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2399financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2399: flexible mode
internal fun PlayerActivity.showV2399FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2399flexible
    FeaturePrefsStore.batch2391.v2399flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2399: formidable mode
internal fun PlayerActivity.showV2399FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2399formidable
    FeaturePrefsStore.batch2391.v2399formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2399: forthright mode
internal fun PlayerActivity.showV2399ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2399forthright
    FeaturePrefsStore.batch2391.v2399forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2399: fragrant mode
internal fun PlayerActivity.showV2399FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2399fragrant
    FeaturePrefsStore.batch2391.v2399fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2399: frequent mode
internal fun PlayerActivity.showV2399FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2399frequent
    FeaturePrefsStore.batch2391.v2399frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

// v2400: extensive mode
internal fun PlayerActivity.showV2400ExtensiveToggle() {
    val current = FeaturePrefsStore.batch2391.v2400extensive
    FeaturePrefsStore.batch2391.v2400extensive = !current
    AppToast.show(this, "extensive: ${if (!current) "ON" else "OFF"}")
}

// v2400: extraordinary mode
internal fun PlayerActivity.showV2400ExtraordinaryToggle() {
    val current = FeaturePrefsStore.batch2391.v2400extraordinary
    FeaturePrefsStore.batch2391.v2400extraordinary = !current
    AppToast.show(this, "extraordinary: ${if (!current) "ON" else "OFF"}")
}

// v2400: extreme mode
internal fun PlayerActivity.showV2400ExtremeToggle() {
    val current = FeaturePrefsStore.batch2391.v2400extreme
    FeaturePrefsStore.batch2391.v2400extreme = !current
    AppToast.show(this, "extreme: ${if (!current) "ON" else "OFF"}")
}

// v2400: fabulous mode
internal fun PlayerActivity.showV2400FabulousToggle() {
    val current = FeaturePrefsStore.batch2391.v2400fabulous
    FeaturePrefsStore.batch2391.v2400fabulous = !current
    AppToast.show(this, "fabulous: ${if (!current) "ON" else "OFF"}")
}

// v2400: faithful mode
internal fun PlayerActivity.showV2400FaithfulToggle() {
    val current = FeaturePrefsStore.batch2391.v2400faithful
    FeaturePrefsStore.batch2391.v2400faithful = !current
    AppToast.show(this, "faithful: ${if (!current) "ON" else "OFF"}")
}

// v2400: familiar level
internal fun PlayerActivity.showV2400FamiliarDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2400familiar).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "familiar level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2400familiar = value
        AppToast.show(this, "familiar: $value")
    }
}

// v2400: fantastic level
internal fun PlayerActivity.showV2400FantasticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2400fantastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fantastic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2400fantastic = value
        AppToast.show(this, "fantastic: $value")
    }
}

// v2400: favorable level
internal fun PlayerActivity.showV2400FavorableDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2400favorable).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "favorable level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2400favorable = value
        AppToast.show(this, "favorable: $value")
    }
}

// v2400: fierce level
internal fun PlayerActivity.showV2400FierceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2400fierce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fierce level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2400fierce = value
        AppToast.show(this, "fierce: $value")
    }
}

// v2400: financial level
internal fun PlayerActivity.showV2400FinancialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2391.v2400financial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "financial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2391.v2400financial = value
        AppToast.show(this, "financial: $value")
    }
}

// v2400: flexible mode
internal fun PlayerActivity.showV2400FlexibleToggle() {
    val current = FeaturePrefsStore.batch2391.v2400flexible
    FeaturePrefsStore.batch2391.v2400flexible = !current
    AppToast.show(this, "flexible: ${if (!current) "ON" else "OFF"}")
}

// v2400: formidable mode
internal fun PlayerActivity.showV2400FormidableToggle() {
    val current = FeaturePrefsStore.batch2391.v2400formidable
    FeaturePrefsStore.batch2391.v2400formidable = !current
    AppToast.show(this, "formidable: ${if (!current) "ON" else "OFF"}")
}

// v2400: forthright mode
internal fun PlayerActivity.showV2400ForthrightToggle() {
    val current = FeaturePrefsStore.batch2391.v2400forthright
    FeaturePrefsStore.batch2391.v2400forthright = !current
    AppToast.show(this, "forthright: ${if (!current) "ON" else "OFF"}")
}

// v2400: fragrant mode
internal fun PlayerActivity.showV2400FragrantToggle() {
    val current = FeaturePrefsStore.batch2391.v2400fragrant
    FeaturePrefsStore.batch2391.v2400fragrant = !current
    AppToast.show(this, "fragrant: ${if (!current) "ON" else "OFF"}")
}

// v2400: frequent mode
internal fun PlayerActivity.showV2400FrequentToggle() {
    val current = FeaturePrefsStore.batch2391.v2400frequent
    FeaturePrefsStore.batch2391.v2400frequent = !current
    AppToast.show(this, "frequent: ${if (!current) "ON" else "OFF"}")
}

